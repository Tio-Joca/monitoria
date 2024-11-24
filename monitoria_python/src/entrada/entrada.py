a : int
b : float
c : bool
d : str

a = int(input("Digite um valor inteiro: "))
b = float(input("Digite um valor flutuante (decimal): "))
c = bool(input("Aperte enter para False ou digite o que quiser para true: "))
d = str(input("Digite uma palavra ou uma frase: "))

print("\nValor inteiro inserido: " + str(a))
print("Valor flutuante inserido: " + str(b))
print("Valor booleano inserido: " + str(c))
print("Palavra ou frase inserida: " + str(d))
