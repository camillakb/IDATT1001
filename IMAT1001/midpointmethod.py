import math
import numpy as np

x = np.linspace(-3, 3, 1001)

"""a = start value, b = end value, n = number of steps"""
def f(x):
    return (x + x ** 3) ** 0.5
a = 0
b = 1
n = 10

def midpoint(f, a, b, n):
    h = float(b - a) / n
    result = 0

    for i in range(n):
        result += f((a + h / 2.0) + i * h)
    result *= h
    return result

print(midpoint(f, 0 , 1, 10))
