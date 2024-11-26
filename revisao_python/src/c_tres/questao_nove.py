reais : list
contador : int
quantidade : int

reais = []

for contador in range (0, 10, 1):
    reais.append(float(input("Digite um numero real: ")))

contador = 0
quantidade = 0

while (contador < len(reais)):
    if (reais[contador] < 42):
        quantidade += 1
    
    contador = contador + 1

print(quantidade)
