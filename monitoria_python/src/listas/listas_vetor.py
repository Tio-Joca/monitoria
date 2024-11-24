contador : int
vetor_um : list
vetor_dois : list

contador = 0
vetor_um = [-5, -10, 10000, 30, 0, -10000, 60]

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nQuantidade de elementos dentro de vetor_um: " + str(len(vetor_um)))

"""A instrucao comentada abaixo e equivalente a instrucao acima
print("Quantidade de elementos dentro de vetor_um: " + str(vetor_um.__len__()))"""

print("\nIncidencia do valor inteiro 40 dentro de vetor_um: " + str(vetor_um.count(40)))

print("\nIndice do primeiro valor inteiro 20 dentro de vetor_um: " + str(vetor_um.index(60)))

print("\nInversao da posicao dos valores inteiros dentro de vetor_um.\n")
vetor_um.reverse()

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nOrdenacao dos valores inteiros dentro de vetor_um seguindo a ordem crescente.\n")
vetor_um.sort()

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nInsercao do valor inteiro 9375893 em vetor_um logo apos o ultimo elemento dentro de vetor_um.\nSe vetor_um estivesse vazio, o valor seria inserido na primeira posicao.\n")
vetor_um.append(9375893)

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nInsercao do valor inteiro 93893 em um indice especifico de vetor_um."
      + "\nSe existir um valor referente a este indice, esse valor e os seus subsequentes serao deslocados a direita."
      + "\nSe vetor_um estivesse vazio, o valor seria inserido na primeira posicao.\n")
vetor_um.insert(0, 93893)

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nInsercao de valores inteiros de uma lista em vetor_um logo apos o ultimo elemento dentro de vetor_um, seguindo a ordem de disposicao dos valores dentro da lista da qual os valores estao sendo copiados."
      + "\nSe vetor_um estivesse vazio, os valores seriam inseridos a partir da primeira posicao.\n")
vetor_um.extend([10, 20, 40, 50])

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nRemocao de um valor inteiro especificado de dentro de vetor_um."
      + "\nCaso nao existisse o valor inteiro especificado, vetor_um continuaria existindo com os valores sem problemas.\n")
vetor_um.remove(-5)

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nRemocao do valor inteiro que esta no ultimo indice de vetor_um: " + str(vetor_um.pop()) + "\n")

print("Remocao de um valor inteiro que esta em vetor_um com base num indice especificado: " + str(vetor_um.pop(5)) + "\n")

print("Realizacao da copia de uma lista, colocando a referencia ao endereco de memoria dessa nova lista em uma outra variavel.\n")
vetor_dois = vetor_um.copy()

contador = 0

for elemento in vetor_dois:
    print("Elemento " + str(contador) + " dentro de vetor_dois: " + str(elemento))
    contador += 1

print("\nEndereco de memoria de vetor_um: " + str(id(vetor_um)))
print("Endereco de memoria de vetor_dois: " + str(id(vetor_dois)) + "\n")

print("Remocao de todo o conteudo que exista em vetor_um. Se vetor_um estivesse vazio, continuaria da mesma forma.\n")
vetor_um.clear()

if (vetor_um.__len__() == 0):
    print("vetor_um: []")

print("\nPassagem da referencia de endereco de memoria de vetor_dois para vetor_um.")
vetor_um = vetor_dois

print("\nEndereco de memoria de vetor_um: " + str(id(vetor_um)))
print("Endereco de memoria de vetor_dois: " + str(id(vetor_dois)) + "\n")

vetor_um.sort()

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

contador = 0

for elemento in vetor_dois:
    print("Elemento " + str(contador) + " dentro de vetor_dois: " + str(elemento))
    contador += 1

vetor_dois = vetor_um.copy()

print("\nEndereco de memoria de vetor_um: " + str(id(vetor_um)))
print("Endereco de memoria de vetor_dois: " + str(id(vetor_dois)) + "\n")

vetor_dois.clear()

if (vetor_dois.__len__() == 0):
    print("vetor_dois: []\n")

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nO elemento de valor inteiro que esta na posicao 7 de vetor_um e " + str(vetor_um[7]) + '\n')

print("Os elementos de valor inteiro no intervalo de indices de 3 a 8 sao os seguintes: " + str(vetor_um[3 : 8]) + '\n')

print("Os elementos de valor inteiro no intervalo de indices de 3 a 8 com saltos de 2 indices sao os seguintes: " + str(vetor_um[3 : 8 : 2]) + '\n')

print("Alteracao do valor inteiro da posicao 6 de vetor_um para 120.\n")
vetor_um[6] = 120
print("Valor inteiro na posicao 6 de vetor_um: " + str(vetor_um[6]) + '\n')

print("Alteracao dos valores inteiros nos intervalos de indice de 3 a 8 de vetor_um.\n")
vetor_um[3 : 8] = [100, 110, 120, 130]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nAlteracao dos valores inteiros nos intervalos de indice de 3 a 8 com saltos de 2 indices de vetor_um.\n")
vetor_um[0 : 3 : 2] = [-50, 50]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nInsercao de um valor inteiro logo apos o ultimo elemento dentro de vetor_um, sem usar o metodo append.\n")
vetor_um[len(vetor_um) : len(vetor_um)] = [320948572045]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nInsercao de um valor inteiro em um indice especifico de vetor_um, sem usar o metodo insert.\n")
vetor_um[3 : 3] = [60]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nInsercao de uma lista de valores inteiros logo apos o ultimo elemento dentro de vetor_um, sem usar o metodo extend.\n")
vetor_um[len(vetor_um) : len(vetor_um)] = [12085852935742984235, 1245455238495292395792357292]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nRemocao do valor inteiro que esta no ultimo indice de vetor_um, sem usar o metodo pop.\n")
del vetor_um[len(vetor_um) - 1]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nRemocao do valor inteiro que esta em um indice especifico de vetor_um, sem usar o metodo pop.\n")
del vetor_um[10]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nRemocao de um valor inteiro especifico que esta em vetor_um, sem usar o metodo remove.\n")
if (120 in vetor_um):
    del vetor_um[vetor_um.index(120)]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nRemocao de um conjunto de valores dentro de um intervalo de indices de vetor_um.\n")
del vetor_um[7 : 10]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1

print("\nRemocao de um conjunto de valores dentro de um intervalo de indices usando saltos em vetor_um.\n")
del vetor_um[0 : 7 : 3]

contador = 0

for elemento in vetor_um:
    print("Elemento " + str(contador) + " dentro de vetor_um: " + str(elemento))
    contador += 1
