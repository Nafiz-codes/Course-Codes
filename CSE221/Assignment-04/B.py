N, M = map(int, input().split())
u = list(map(int, input().split()))
v = list(map(int, input().split()))
w = list(map(int, input().split()))
 
adj_list = [[] for _ in range(N + 1)] 
 
for i in range(M):
    adj_list[u[i]].append((v[i], w[i]))
 
for i in range(1, N + 1):
    print(f"{i}:", end="")
    for (neighbor, weight) in adj_list[i]:
        print(f" ({neighbor},{weight})", end="")
    print()
