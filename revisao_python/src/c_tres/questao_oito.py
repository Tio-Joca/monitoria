multiplo : int
soma : int

soma = 0

for multiplo in range(7, 1000, 7):
    if (multiplo == 994):
        print(str(multiplo) + '\n')
    else:
        print(multiplo)

    soma += multiplo

print(soma)
