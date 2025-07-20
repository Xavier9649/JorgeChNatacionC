Instrucciones del trabajo
1.	Crea una carpeta llamada concurso_natacion.
2.	Copia cada clase en su propio archivo .java con el nombre correspondiente.
3.	El Main.java se usará para el menú de ejecución.
4.	Archivos a crear:
• Participante.java
•	ParticipanteColegio.java
•	ParticipanteUniversidad.java
•	ParticipanteEmpresa.java
•	ParticipanteSindicato.java
•	Main.java

Todos los participantes deben registrarse con los siguientes atributos comunes: 
•	Nombre 
•	Edad 
•	Género 
•	Condición de salud (buena o no) 
•	Tipo de entidad (colegio, universidad, empresa pública, empresa privada o sindicato) 

Solo podrán participar personas que cumplan con los siguientes requisitos: 
•	Tener entre 18 y 25 años 
•	Estar en buena condición de salud

A continuación, se mencionan los requisitos del sistema:
•	Crear una clase base Participante que contenga los atributos comunes y un método puedeParticipar() que valide la edad y condición de salud. 
•	Crear al menos cuatro subclases que hereden de Participante: 
o	ParticipanteColegio 
o	ParticipanteUniversidad 
o	ParticipanteEmpresa (debe indicar si es pública o privada) 
o	ParticipanteSindicato 

Cada subclase debe incluir su atributo adicional (ej. nombre del colegio o sindicato) y sobrescribir un método getInfo() para mostrar los datos completos. 
Implementar getters y setters en las clases cuando sea necesario. 
Crear un menú interactivo por consola que permita: 
o	Registrar nuevos participantes 
o	Ver la lista de participantes registrados 
o	Ver solo los que sí pueden participar (según edad y salud) 

Validar correctamente: 
o	Que la edad esté entre 18 y 25 años 
o	Que la condición de salud sea “buena” (puede ser un booleano o un texto)
