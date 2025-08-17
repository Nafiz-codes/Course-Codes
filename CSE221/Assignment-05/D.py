from collections import deque
 
def bfs(start, end, graph, N):
    dist = [-1] * (N + 1)
    parent = [-1] * (N + 1)
    q = deque([start])
    dist[start] = 0
    
    while q:
        node = q.popleft()
        if node == end:
            break
        for nei in graph[node]:
            if dist[nei] == -1:
                dist[nei] = dist[node] + 1
                parent[nei] = node
                q.append(nei)
    
    if dist[end] == -1:
        return None, None 
 
    path = []
    cur = end
    while cur != -1:
        path.append(cur)
        cur = parent[cur]
    path.reverse()
    return dist[end], path
 
 
N, M, S, D, K = map(int, input().split())
graph = [[] for _ in range(N + 1)]
for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v) 
 
dist1, path1 = bfs(S, K, graph, N)
 
dist2, path2 = bfs(K, D, graph, N)
 
if path1 is None or path2 is None:
    print(-1)
else:
    full_path = path1 + path2[1:]
    total_dist = len(full_path) - 1
    
    print(total_dist)
    print(*full_path)
