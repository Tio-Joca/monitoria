vetor : list
contador : int
indice : int

vetor = []
contador = 0

while (contador < 10):
    if (contador == 0):
        vetor.append(2)
    else:
        vetor.append(vetor[contador - 1] * 2)
    
    contador += 1

for indice in range (vetor.__len__()):
    print(indice)
