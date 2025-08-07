N = int(input())
x, y = map(int, input().split())
 
directions = [
    (-1, -1), (-1, 0), (-1, 1),
    ( 0, -1),          ( 0, 1),
    ( 1, -1), ( 1, 0), ( 1, 1)
]
 
valid_moves = []
 
for dx, dy in directions:
    nx, ny = x + dx, y + dy
    if 1 <= nx <= N and 1 <= ny <= N:
        valid_moves.append((nx, ny))
 
valid_moves.sort()
 
print(len(valid_moves))
for move in valid_moves:
    print(move[0], move[1])
