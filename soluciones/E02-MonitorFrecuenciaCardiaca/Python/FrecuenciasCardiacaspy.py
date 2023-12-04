nombre = input("Contador de frecuencias cardiacas\nNombre: ")
dia_nacimiento = int(input("Día de nacimiento: "))
mes_nacimiento = int(input("Mes de nacimiento: "))
anio_nacimiento = int(input("Año de nacimiento: "))

anio_actual, mes_actual, dia_actual = 2023, 12, 2

# Cálculo de edad
edad = anio_actual - anio_nacimiento
if mes_actual < mes_nacimiento or (mes_actual == mes_nacimiento and dia_actual < dia_nacimiento):
    edad -= 1

# Frecuencia Máxima y Rango de frecuencia
frec_max = 220 - edad
frec_rango1 = frec_max * 0.50
frec_rango2 = frec_max * 0.85

print("\nFrecuencias cardiacas de", nombre)
print(f"Fecha de Nacimiento: {dia_nacimiento}/{mes_nacimiento}/{anio_nacimiento}")
print(f"Edad: {edad}")
print(f"Frecuencia cardíaca máxima: {frec_max} lpm")
print(f"Rango de frecuencia cardíaca: {frec_rango1} lpm / {frec_rango2} lpm\n")

# Arreglos
historial = []
hora = []

# Historial de frecuencias cardiacas
seguir1 = input("Desea crear un historial de frecuencias cardiacas por un día a su elección (s/n): ")
if seguir1.lower() == "s":
    cont = 0
    while True:
        cont += 1
        print(f"\nIngrese su {cont} registro")
        historial.append(int(input()))
        print(f"Ingrese la hora del {cont} registro")
        hora.append(int(input()))
        seguir = input("Desea ingresar otro registro (s/n): ").lower()
        if seguir != "s":
            break

    print("\nDe qué día es el registro")
    print("[1] Lunes")
    print("[2] Martes")
    print("[3] Miércoles")
    print("[4] Jueves")
    print("[5] Viernes")
    print("[6] Sábado")
    print("[7] Domingo")
    dia = int(input())
    dias_semana = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]

    print(f"\nHistorial de frecuencias cardiacas de {nombre} del día {dias_semana[dia - 1]}")
    print(f"{'Frecuencia': <15} {'Hora'}")
    for i in range(cont):
        print(f"{historial[i]} lpm\t{hora[i]}")

print("\nInforme terminado")