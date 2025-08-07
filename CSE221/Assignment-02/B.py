import sys
input = sys.stdin.readline

def main():
  N,M,K = map(int,input().split())
  A = list(map(int, input().split()))
  B = list(map(int, input().split()))
  i,j = 0,M-1
  best_i,best_j = 0,0
  best_diff = float('inf')
  while i<N and j>=0:
    current_sum = A[i]+B[j]
    diff = abs(current_sum - K)
    if diff< best_diff:
      best_diff = diff
      best_i, best_j = i,j
      if best_diff==0:
        break
    if current_sum<K:
      i+=1
    else:
      j-=1
  print(best_i+1, best_j+1)
if __name__ = "__main__":
  main()
        
