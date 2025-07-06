def parse_time(s):
    hour, minute = map(int, s.split(":"))
    return hour * 60 + minute
n = int(input())
trains = []
for idx in range(n):
    line = input().strip()
    words = line.split()
    name = words[0]
    time = words[-1]
    time_value = parse_time(time)
    trains.append((name, -time_value, idx, line))
trains.sort()
for t in trains:
    print(t[3])
