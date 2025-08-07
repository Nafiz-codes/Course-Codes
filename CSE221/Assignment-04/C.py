N = int(input())
 
adj_matrix = [[0] * N for _ in range(N)]
 
for i in range(N):
    parts = list(map(int, input().split()))
    k = parts[0]
    neighbors = parts[1:]
    for j in neighbors:
        adj_matrix[i][j] = 1
 
for row in adj_matrix:
    print(' '.join(map(str, row)))
