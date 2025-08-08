def balanced_order(arr):
    if not arr:
        return []
    
    mid = len(arr) // 2
    l = balanced_order(arr[:mid])
    r = balanced_order(arr[mid+1:])

    return [arr[mid]] + l + r

def merge(l, r):
    result = []
    i = j = 0

    while i < len(l) and j < len(r):
        if l[i] <= r[j]:
            result.append(l[i])
            i += 1

        else:
            result.append(r[j])
            j += 1

    result.extend(l[i:])
    result.extend(r[j:])
    return result

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    l_part = merge_sort(arr[:mid])
    r_part = merge_sort(arr[mid:])
    return merge(l_part, r_part)

def solve():
    n = int(input())
    arr = list(map(int, input().split()))

    arr = merge_sort(arr)
    arr = balanced_order(arr)
    
    print(*arr)

solve()