import sys
sys.setrecursionlimit(2*100000+5)
 
N,M = map(int,input().split())
 
adj = [[] for _ in range(N + 1)]
u_list = list(map(int, input().split()))
v_list = list(map(int, input().split()))
 
for i in range(M):
    u = u_list[i]
    v = v_list[i]
    adj[u].append(v)
    adj[v].append(u)
visited = [False] * (N + 1)
order = []
for neighbors in adj:
    neighbors.sort()
 
def dfs(u):
    visited[u] = True
    order.append(u)
    for v in adj[u]:
        if not visited[v]:
            dfs(v)
 
dfs(1)
 
print(" ".join(map(str, order)))
