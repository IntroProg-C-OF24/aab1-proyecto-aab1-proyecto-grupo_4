import random

def nombre_aleatorio(prefijos, random_generator):
    return random_generator.choice(prefijos)

# Contador de frecuencias cardiacas
prefijos = ["Pedro", "Jesus", "Alfredo", "Claudio", "Juan", "Maria", "Luisa", "Mia", "Gabriela", "Omar", "Pablo", "Diego", "ismael"]
random_generator = random.Random()

anio_actual, mes_actual, dia_actual = 2023, 12, 2
frec_max, dia, cont = 0, 0, 0

for i in range(1):  # Solo se ejecuta una vez, como en el bucle original de Java
    nombre_aleatorio = nombre_aleatorio(prefijos, random_generator)

dia_nacimiento = random_generator.randint(1, 31)
mes_nacimiento = random_generator.randint(1, 12)
anio_nacimiento = random_generator.randint(1900, 2023)
edad = anio_actual - anio_nacimiento
if mes_actual < mes_nacimiento or (mes_actual == mes_nacimiento and dia_actual < dia_nacimiento):
    edad -= 1

# Frecuencia Máxima y Rango de frecuencia
frec_max = 220 - edad
frec_rango1 = frec_max * 0.50
frec_rango2 = frec_max * 0.85

print("\nFrecuencias cardiacas de", nombre_aleatorio)
print("Fecha de Nacimiento:", f"{dia_nacimiento}/{mes_nacimiento}/{anio_nacimiento}")
print("Edad:", edad)
print("Frecuencia cardíaca máxima:", frec_max, "lpm")
print("Rango de frecuencia cardíaca:", f"{frec_rango1} lpm / {frec_rango2} lpm\n")

# Arreglos
tamano_arreglo = 5
historial = [random_generator.randint(60, 200) for _ in range(tamano_arreglo)]
hora = [random_generator.randint(0, 24) for _ in range(tamano_arreglo)]

# Historial de frecuencias cardiacas
seguir1 = input("¿Desea crear un historial de frecuencias cardiacas por un día a su elección? (s/n): ")
if seguir1.lower() == "s":
    for i in range(tamano_arreglo):
        historial[i] = random_generator.randint(60, 200)
        hora[i] = random_generator.randint(0, 24)

    print("\n¿De qué día es el registro?")
    print("[1] Lunes")
    print("[2] Martes")
    print("[3] Miércoles")
    print("[4] Jueves")
    print("[5] Viernes")
    print("[6] Sábado")
    print("[7] Domingo")
    dia = int(input())
    dias_semana = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]

    print(f"\nHistorial de frecuencias cardiacas de {nombre_aleatorio} del día {dias_semana[dia - 1]}")
    print("{:<15} {}".format("Frecuencia", "Hora"))
    for i in range(tamano_arreglo):
        print("{:<15} {}".format(str(historial[i]) + " lpm", hora[i]))

print("\nInforme terminado")
