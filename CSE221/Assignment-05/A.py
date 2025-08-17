N,M = map(int,input().split())
 
adj = [[] for _ in range(N + 1)]
for _ in range(M):
    u,v = map(int,input().split())
    adj[u].append(v)
    adj[v].append(u)
 
visited = [False] * (N + 1)
order = []
 
queue = [1]  
visited[1] = True
head = 0      
 
while head < len(queue):
    u = queue[head]
    head += 1
    order.append(u)
    for v in adj[u]:
        if not visited[v]:
            visited[v] = True
            queue.append(v)
 
print(" ".join(map(str, order)))
