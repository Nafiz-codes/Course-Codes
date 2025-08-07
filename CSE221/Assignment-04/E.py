import sys
input = sys.stdin.read
 
def main():
    data = input().split()
    
    N = int(data[0])
    M = int(data[1])
    
    u = list(map(int, data[2:2+M]))
    v = list(map(int, data[2+M:2+2*M]))
 
    indegree = [0] * (N + 1)
    outdegree = [0] * (N + 1)
 
    for i in range(M):
        outdegree[u[i]] += 1
        indegree[v[i]] += 1
 
    result = [str(indegree[i] - outdegree[i]) for i in range(1, N + 1)]
    print(' '.join(result))
 
main()
