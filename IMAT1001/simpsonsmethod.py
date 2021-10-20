"""a = start value, b = end value, n = number of steps"""

a = 1
b = 2
n = 10
h = (b - a) / n
ans = 0

def f(x):
    return ((x ** 3) - 1) ** 0.5

sum = f(a) + f(b)

for i in range(1, n):
    xcurr = a + h * i
    if i % 2 == 0:
        sum += 4 * f(xcurr)
    else:
        sum += 2 * f(xcurr)

sum *= h/3

print(sum)
