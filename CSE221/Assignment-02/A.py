import sys
input = sys.stdin.readline

def main():
  N,S = (int,input().split())
  arr = list(map(int,(input().split)))
  seen = {}

  for i in range(N):
    complement = S - arr[i]
    if complement in seen:
      print(seen[compelement]+1, i+1)
      return
    seen[arr[i]] = i
  print(-1)
if __name__ = "__main__":
  main()
