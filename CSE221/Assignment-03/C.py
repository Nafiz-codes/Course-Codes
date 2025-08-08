def mod_power(b, exp, mod):
    if exp == 0:
        return 1
    
    res = 1
    b = b % mod

    while exp > 0:
        if exp % 2 == 1:
            res = (res * b) % mod
        
        b = (b * b) % mod
        exp //= 2

    return res

data = input().split()
a = int(data[0])
b = int(data[1]) if len(data) > 1 else 1

res = mod_power(a, b, 107)
print(res)
