print("Laco de repeticao for usando a variavel receptora em conjunto com uma funcao range."
      + "\nA funcao range transfere valores para receptora enquanto nao chega no seu limite estabelecido."
      + "\nNesse exemplo abaixo, range vai comecar a operacao com zero, parar em 10 e incrementar em 1 (comeco, fim e passo definidos explicitamente).\n")

for receptora in range (0, 10, 1):
    if (receptora == 9):
        print("receptora == " + str(receptora) + '\n')
    else:
        print("receptora == " + str(receptora))

print("Laco de repeticao for usando a variavel receptora em conjunto com uma funcao range."
      + "\nA funcao range transfere valores para receptora enquanto nao chega no seu limite estabelecido."
      + "\nNesse exemplo abaixo, range vai comecar a operacao com zero, parar em 10 e incrementar em 1 (comeco e fim definidos explicitamente, passo definido implicitamente).\n")

for receptora in range (0, 10):
    if (receptora == 9):
        print("receptora == " + str(receptora) + '\n')
    else:
        print("receptora == " + str(receptora))

print("Laco de repeticao for usando a variavel receptora em conjunto com uma funcao range."
      + "\nA funcao range transfere valores para receptora enquanto nao chega no seu limite estabelecido."
      + "\nNesse exemplo abaixo, range vai comecar a operacao com zero, parar em 10 e incrementar em 1 (fim definidos explicitamente, comeco e passo definido implicitamente).\n")

for receptora in range (10):
    if (receptora == 9):
        print("receptora == " + str(receptora) + '\n')
    else:
        print("receptora == " + str(receptora))

print("Laco de repeticao for usando a variavel receptora em conjunto com uma funcao range."
      + "\nA funcao range transfere valores para receptora enquanto nao chega no seu limite estabelecido."
      + "\nNesse exemplo abaixo, range vai comecar a operacao com zero, parar em -10 e decrementar em -1 (comeco, fim e passo definidos explicitamente).\n")

for receptora in range (0, -10, -1):
    if (receptora == -10):
        print("receptora == " + str(receptora) + '\n')
    else:
        print("receptora == " + str(receptora))
