
N, M = map(int, input().split())
 
adj_matrix = [[0 for _ in range(N)] for _ in range(N)]
 
for _ in range(M):
    u, v, w = map(int, input().split())
    adj_matrix[u-1][v-1] = w 
 
for row in adj_matrix:
    print(' '.join(map(str, row)))
