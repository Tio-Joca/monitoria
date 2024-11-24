contador : int
verificador : bool

contador = 0

print("Laco de repeticao while usando a variavel contador, contador com o valor inicial 0.\nPara esse while funcionar, a variavel contador precisa ter um valor menor que 10.\n")

while (contador < 10):
    if (contador == 9):
        print("contador == " + str(contador) + '\n')
    else:
        print("contador == " + str(contador))
    
    contador = contador + 1

contador = 0

print("Laco de repeticao while usando a variavel contador, contador com o valor inicial 0.\nPara esse while funcionar, a variavel contador precisa ter um valor menor ou igual a 9.\n")

while (contador <= 9):
    if (contador == 9):
        print("contador == " + str(contador) + '\n')
    else:
        print("contador == " + str(contador))
    
    contador = contador + 1

contador = 9

print("Laco de repeticao while usando a variavel contador, contador com o valor inicial 9.\nPara esse while funcionar, a variavel contador precisa ter um valor menor que -1.\n")

while (contador > -1):
    if (contador == 0):
        print("contador == " + str(contador) + '\n')
    else:
        print("contador == " + str(contador))
    
    contador = contador - 1

contador = 9

print("Laco de repeticao while usando a variavel contador, contador com o valor inicial 9.\nPara esse while funcionar, a variavel contador precisa ter um valor menor ou igual a 0.\n")

while (contador >= 0):
    if (contador == 0):
        print("contador == " + str(contador) + '\n')
    else:
        print("contador == " + str(contador))
    
    contador = contador - 1

contador = 0
verificador = True

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 0 e verificador com o valor inicial True.\nPara esse while funcionar, contador precisa ter um valor menor que 10 e verificador precisa ter um valor True.\n")

while (contador < 10 and verificador):
    if (contador == 5):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = False
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador + 1

contador = 0
verificador = True

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 0 e verificador com o valor inicial True.\nPara esse while funcionar, contador precisa ter um valor menor ou igual a 9 e verificador precisa ter um valor True.\n")

while (contador <= 9 and verificador):
    if (contador == 5):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = False
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador + 1

contador = 9
verificador = True

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 9 e verificador com o valor inicial True.\nPara esse while funcionar, contador precisa ter um valor menor que 10 e verificador precisa ter um valor True.\n")

while (contador > -1 and verificador):
    if (contador == 4):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = False
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador - 1

contador = 9
verificador = True

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 9 e verificador com o valor inicial True.\nPara esse while funcionar, contador precisa ter um valor menor ou igual a 9 e verificador precisa ter um valor True.\n")

while (contador >= 0 and verificador):
    if (contador == 4):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = False
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador - 1

#

contador = 0
verificador = False

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 0 e verificador com o valor inicial False.\nPara esse while funcionar, contador precisa ter um valor menor que 10 e verificador precisa ter um valor False.\n")

while (contador < 10 and (not verificador)):
    if (contador == 5):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = True
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador + 1

contador = 0
verificador = False

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 0 e verificador com o valor inicial False.\nPara esse while funcionar, contador precisa ter um valor menor ou igual a 9 e verificador precisa ter um valor False.\n")

while (contador <= 9 and (not verificador)):
    if (contador == 5):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = True
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador + 1

contador = 9
verificador = False

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 9 e verificador com o valor inicial False.\nPara esse while funcionar, contador precisa ter um valor menor que 10 e verificador precisa ter um valor False.\n")

while (contador > -1 and (not verificador)):
    if (contador == 4):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = True
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador - 1

contador = 9
verificador = False

print("Laco de repeticao while usando as variaveis contador e verificador, contador com o valor inicial 9 e verificador com o valor inicial False.\nPara esse while funcionar, contador precisa ter um valor menor ou igual a 9 e verificador precisa ter um valor False.\n")

while (contador >= 0 and (not verificador)):
    if (contador == 4):
        print("contador == " + str(contador) + ", verificador == " + str(verificador) + '\n')
        verificador = True
    else:
        print("contador == " + str(contador) + ", verificador == " + str(verificador))
    
    contador = contador - 1
