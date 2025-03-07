# 01 **Generador de Patrones Numéricos**

**Instrucción:**
Escribe un programa que solicite al usuario un número entero positivo n y genere un patrón numérico en forma de triángulo. El patrón debe seguir una secuencia donde cada línea comienza con el número de línea y aumenta hasta n, y luego disminuye hasta el número de línea nuevamente.

**Ejemplo de salida para n = 5:**

me esta pidiendo que agrege un numero del usuario entonces vamos a comenzar con un scanner
Scanner scanner = new Scanner(system.in);
luego vamos a decir la variable numero que es entero y que va a iniciar el usuario
int numero = scanner.nextInt();
luego que el usuario ya pudo elegir el numero que se digitalizo luego
voy a establecer un limite que le voy a poner al usuario porque voy a usar estructura if
entonces el numero entero no puede ser mayor a 6 y tiene que ser entero positivo

para eso coloque un if dentro de otro if donde le indica que el numero debe ser mayor que 1 y menor que 7
y dependiendo del numero que ingrese el usuario es al if que va a elegir 

los if con las siguientes condiciones
if (numUno<=2 & numUno>=2)
if (numUno<=3 & numUno>=3)
if (numUno<=4 & numUno>=4)
if (numUno<=5 & numUno>=5)
if (numUno<=6 & numUno>=6)
  
  dependiendo del numero elige a la estructura y pues va a salir un triangulo con la cabeza del numero mayor ingresado y descendiendo
