from collections import deque
 
def lexicographically_smallest_shortest_path(N, M, S, D, u, v):
  
    graph = [[] for _ in range(N + 1)]
    for i in range(M):
        graph[u[i]].append(v[i])
        graph[v[i]].append(u[i])
 
    for i in range(1, N + 1):
        graph[i].sort()
 
    dist = [-1] * (N + 1)
    parent = [-1] * (N + 1)
    q = deque([S])
    dist[S] = 0
    
    while q:
        node = q.popleft()
        if node == D:  
            break
        for nei in graph[node]:
            if dist[nei] == -1:  
                dist[nei] = dist[node] + 1
                parent[nei] = node
                q.append(nei)
 
    if dist[D] == -1:
        print(-1)
        return
 
    path = []
    cur = D
    while cur != -1:
        path.append(cur)
        cur = parent[cur]
    path.reverse()
 
    print(dist[D])
    print(*path)
 
N, M, S, D = map(int, input().split())
u = list(map(int, input().split()))
v = list(map(int, input().split()))
lexicographically_smallest_shortest_path(N, M, S, D, u, v)
