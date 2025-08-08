def merge_count(arr, left, mid, right):
    x = left
    y = mid + 1
    temp = []
    invrs = 0

    while x <= mid and y <= right:
        if arr[x] <= arr[y]:
            temp.append(arr[x])
            x += 1

        else:
            temp.append(arr[y])
            invrs += (mid - x + 1)
            y += 1

    while x <= mid:
        temp.append(arr[x])
        x += 1

    while y <= right:
        temp.append(arr[y])
        y += 1

    for i in range(len(temp)):
        arr[left + i] = temp[i]

    return invrs

def merge_sort(arr, left, right):
    invrs = 0
    if left < right:
        mid = (left + right) // 2

        invrs += merge_sort(arr, left, mid)
        invrs += merge_sort(arr, mid + 1, right)
        invrs += merge_count(arr, left, mid, right)

    return invrs

n = int(input())
arr = list(map(int, input().split()))

print(merge_sort(arr, 0, n - 1))
print(*arr)
