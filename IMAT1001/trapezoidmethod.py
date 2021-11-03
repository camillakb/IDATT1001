import math

def f(x):
    return math.pow(x, 2) + 2 - max(0, 2 * math.pow(x, 2) - 2)

a = 0
b = 2
n = 20

dx = (b - a) / n
sum = f(a) + f(b)

for i in range(n):
    k = a + i * dx
    sum += 2 * f(k)

sum *= dx / 2

print(sum)