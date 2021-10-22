import matplotlib.pyplot as plt
import numpy as np
import math

def f(x):
    return x ** 2 * math.sin(x) * math.cos(x)

x = np.linspace(-3, 3, 1001)
y = []

for value in x: 
    y.append(f(value))

plt.plot(x, y)
plt.show()