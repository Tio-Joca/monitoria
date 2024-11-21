inteiro : int
idade : int
contribuicao : int
genero : str

inteiro = int(input("Digite um valor inteiro: "))

if (inteiro % 2 == 0):
    print("O valor " + str(inteiro) + " e par.")

if (inteiro % 2 != 0):
    print("O valor " + str(inteiro) + " e impar.")

inteiro = int(input("Digite um valor inteiro: "))

if (inteiro % 2 == 0):
    print("O valor " + str(inteiro) + " e par.")
else:
    print("O valor " + str(inteiro) + " e impar.")

inteiro = int(input("Digite um valor inteiro: "))

if (inteiro < 0):
    print("O valor inserido e menor que zero.")
elif (inteiro == 0):
    print("O valor inserido e igual a zero.")
else:
    print("O valor inserido e maior que zero")

idade = abs(int(input("Digite a sua idade: ")))
genero = str(input("Digite o seu genero (M para masculino ou F para feminino): "))[0].upper()
contribuicao = abs(int(input("Digite a quantidade de anos de contribuicao feita por voce: ")))

if (genero == 'F' and idade >= 62 and contribuicao >= 15):
    print("Senhora, voce pode se aposentar.")
elif (genero == 'M' and idade >= 65 and contribuicao >= 20):
    print("Senhor, voce pode se aposentar.")
else:
    print("Voce precisa continuar trabalhando.")
