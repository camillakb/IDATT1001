import matplotlib.pyplot as plt
import numpy as np
import sympy as sp

x = sp.symbols("x")

funksjon = sp.exp(1 - ((x **2) / 2))
derivert = sp.diff(funksjon)

approx = funksjon.subs(x, sp.sqrt(2)) + derivert.subs(x, sp.sqrt(2)) * (1.5 - sp.sqrt(2))
print(approx.evalf())
