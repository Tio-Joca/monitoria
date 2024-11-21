inteiro : int
flutuante : float
linguagem : str

inteiro = int(input("Digite um valor inteiro: "))
flutuante = float(input("Digite um valor flutuante: "))
linguagem = str(input("Digite o nome de uma linguagem de programacao: "))

match inteiro:
    case 1:
        print(inteiro + 0)
    case 2:
        print(inteiro - 1)
    case 3:
        print(inteiro * 2)
    case 4:
        print(inteiro / 3)
    case 5:
        print(inteiro ** 4)
    case 6:
        print(inteiro // 5)
    case _:
        print(inteiro % 6)

match flutuante:
    case 3.14:
        print("O valor flutuante inserido e o PI.")
    case -3.14:
        print("O valor flutuante inserido e o PI so que com sinal negativo.")
    case _:
        print("O valor flutuante inserido nao e PI.")

match linguagem:
    case "C":
        print("A base das linguagens de programacao modernas.");
    case "C++":
        print("C com classes.")
    case "Rust":
        print("Queridinha da Mozilla.")
    case "Zig":
        print("A joia por tras do Bun.")
    case "Golang":
        print("O pilar dos containeres.")
    case _:
        print("Nao conheco essa linguagem de programacao.")
