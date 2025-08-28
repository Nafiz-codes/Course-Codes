import sys
import heapq
input = sys.stdin.readline
 
 
N, M = map(int, input().split())
g = [[] for _ in range(N + 1)]
indeg = [0] * (N + 1)
 
for _ in range(M):
    A, B = map(int, input().split())
    g[A].append(B)
    indeg[B] += 1
 
heap = []
for v in range(1, N + 1):
    if indeg[v] == 0:
        heapq.heappush(heap, v)
 
order = []
while heap:
    u = heapq.heappop(heap)   
    order.append(u)
    for v in g[u]:
        indeg[v] -= 1
        if indeg[v] == 0:
            heapq.heappush(heap, v)
 
if len(order) != N: 
    print(-1)
else:
    print(*order)
