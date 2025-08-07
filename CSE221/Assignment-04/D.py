import sys
input = sys.stdin.read
from collections import defaultdict
 
def has_eulerian_path(N, M, u, v):
    degree = [0] * (N + 1)
 
    for i in range(M):
        degree[u[i]] += 1
        degree[v[i]] += 1
 
    odd_count = sum(1 for d in degree[1:] if d % 2 == 1)
    
    return "YES" if odd_count == 0 or odd_count == 2 else "NO"
 
data = input().split()
N = int(data[0])
M = int(data[1])
u = list(map(int, data[2:2+M]))
v = list(map(int, data[2+M:]))
 
print(has_eulerian_path(N, M, u, v))
