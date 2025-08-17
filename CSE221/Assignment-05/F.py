import sys
sys.setrecursionlimit(10**6)
 
def has_cycle(node):
    visited[node] = True
    rec_stack[node] = True
 
    for neighbor in graph[node]:
        if not visited[neighbor]:
            if has_cycle(neighbor):
                return True
        elif rec_stack[neighbor]:
            return True
 
    rec_stack[node] = False
    return False
 
n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
 
for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
 
visited = [False] * (n + 1)
rec_stack = [False] * (n + 1)
 
for i in range(1, n + 1):
    if not visited[i]:
        if has_cycle(i):
            print("YES")
            break
else:
    print("NO")
