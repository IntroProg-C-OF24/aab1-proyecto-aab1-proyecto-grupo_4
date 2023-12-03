#Demo tipo juego, que permita generar un número aleatorio y le rete al usuario que lo adivine. Si no 
#adivina el número, el juego debe sugerirle lo intente nuevamente con pistas (es mayor, menor, es par, 
#impar, es primo, pertenece a la serie de fibonacy, es multiplo de N, etc.), el usuario es quien deberá 
#ir pidiendo repetitivamente que el sistema le muestre o no, más pistas, solo que, si el usuario pide 
#más pistas, el sistema automáticamente le resta un intento y le informa cuantos intentos le quedan. 
#Al finalizar el juego, se debe felicitar al usuario si gana y como, o pedir que lo intente de nuevo.

#AUTOR: Ricardo Espinosa y Juan Diego Guerrero
import random

def es_numero_de_fibonacci(numero):
    if numero < 0:
        return False  # Los números negativos no son de la serie de Fibonacci
    a, b = 0, 1
    while a < numero:
        a, b = b, a + b
    return a == numero

def main():
    intentos = 9
    vueltas = 1
    adivino = False
    es_primo = True

    num_adivinar = random.randint(1, 100)
    
    print("***ADIVINA EL NUMERO QUE PIENSO (0 - 100)***")
    print("TIENES 10 INTENTOS")

    while (intentos >= 0):
        num_ingresado = int(input("Ingresa el número que crees que estoy pensando: "))
        
        if num_ingresado == num_adivinar:
            adivino = True
            break
        elif intentos == 1:
            break

        print("Incorrecto, ¿quieres pistas? (si/no)")
        print("!!RECUERDA QUE SI PIDES UNA PISTA SE TE RESTA UN INTENTO!!")
        pista = input().lower()

        if pista == "si":
            print("UN INTENTO MENOS :O")
            intentos -= 1

        # Pista: Si el número es mayor o menor
        if pista == "si":
            if num_adivinar < num_ingresado:
                print("EL NUMERO ES MENOR AL QUE INGRESASTE")
            elif num_adivinar > num_ingresado:
                print("EL NUMERO ES MAYOR AL QUE INGRESASTE")

        # Pista: Si el número es par o impar
        if pista == "si":
            if num_adivinar % 2 == 0:
                print("EL NUMERO ES PAR")
            else:
                print("EL NUMERO ES IMPAR")

        # Pista: Si el número es o no primo
        if num_adivinar == 1:
            es_primo = False
        for i in range(2, num_adivinar):
            if num_adivinar % i == 0:
                es_primo = False
        if es_primo and pista == "si":
            print("EL NUMERO ES PRIMO")
        elif not es_primo and pista == "si":
            print("EL NUMERO NO ES PRIMO")

        # Pista: Si el número pertenece o no a la serie de Fibonacci
        if es_numero_de_fibonacci(num_adivinar) and pista == "si":
            print("EL NUMERO PERTENECE A LA SERIE DE FIBONACCI")
        elif not es_numero_de_fibonacci(num_adivinar) and pista == "si":
            print("EL NUMERO NO PERTENECE A LA SERIE DE FIBONACCI")

        # Pista: Si el número es múltiplo de 3, 5, 7, 11, 12
        if num_adivinar % 3 == 0 and pista == "si":
            print("EL NUMERO ES MULTIPLO DE 3")
        elif num_adivinar % 5 == 0 and pista == "si":
            print("EL NUMERO ES MULTIPLO DE 5")
        elif num_adivinar % 7 == 0 and pista == "si":
            print("EL NUMERO ES MULTIPLO DE 7")
        elif num_adivinar % 11 == 0 and pista == "si":
            print("EL NUMERO ES MULTIPLO DE 11")
        elif num_adivinar % 12 == 0 and pista == "si":
            print("EL NUMERO ES MULTIPLO DE 12")

        # Se notifica cuántos intentos quedan y se modifican los contadores
        print(f"Te quedan: {intentos} intentos")
        intentos -= 1
        vueltas += 1

    # Se notifica al usuario en caso de ganar o perder
    if adivino:
        print(f"FELICIDADES lo lograste en {vueltas} intentos")
    else:
        print("!!!!! GAME OVER !!!!!")
        print(f"EL NUMERO ERA {num_adivinar} :(")

if __name__ == "__main__":
    seguir = "si"
    while seguir == "si":
        main()
        print("**********************************")
        print("¿Quieres volver a jugar? :) (si/no)")
        seguir = input().lower()
    print("GRACIAS, ¡VUELVE PRONTO!")