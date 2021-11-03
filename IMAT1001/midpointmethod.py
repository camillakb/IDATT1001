import math
import numpy as np

x = np.linspace(-3, 3, 1001)

"""a = start value, b = end value, n = number of steps"""
def f(x):
    return 2 * math.pi * x * (2 + math.sqrt(x) - x)
a = 0
b = 4
n = 20

def midpoint(f, a, b, n):
    h = float(b - a) / n
    result = 0

    for i in range(n):
        result += f((a + h / 2.0) + i * h)
    result *= h
    return result

print(midpoint(f, 0 , 4, 20))
