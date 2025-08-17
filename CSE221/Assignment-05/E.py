import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline
 
def dfs(node, parent):
    subtree_size[node] = 1 
    for nei in graph[node]:
        if nei != parent:
            dfs(nei, node)
            subtree_size[node] += subtree_size[nei]
 
N, R = map(int, input().split())
 
graph = [[] for _ in range(N + 1)]
for _ in range(N - 1):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)
 
subtree_size = [0] * (N + 1)
 
dfs(R, -1)
 
Q = int(input())
for _ in range(Q):
    X = int(input())
    print(subtree_size[X])
