# Imagen con File Chooser

### Explicación De Código Fuente

El siguiente programa fue realizado con hilos, la cual muestra un reproductor de imágenes gracias a la herramienta File Chooser, para este ejercicio, el programa fue hecho en el entorno de programación (IDE) de NetBeans, asimismo para su compilación y ejecución se utilizó la interfaz que ya trae incorporado este programa.

A continuación, se presenta el código en donde se importan las librerías necesarias para poder utilizar algunas clases que se implementaron en este programa.

![imagen](https://user-images.githubusercontent.com/71055467/111059605-89483300-845c-11eb-8d12-d72371f9b629.png)

La siguiente línea de código se trata de la clase principal, quien hereda de la clase JFrame para que se pueda crear una ventana y mostrar los resultados.

![imagen](https://user-images.githubusercontent.com/71055467/111059609-9107d780-845c-11eb-843a-6c94db170b48.png)

A continuación, se presenta el constructor quien le da un estado inicial a la clase, en este caso a la ventana, en la primera línea manda a llamar a los componentes creados por el propio NetBeans ya que usamos las herramientas que nos ofrece, asimismo lo programamos para que la ventana aparezca en el centro de la pantalla y que no se pueda redimensionar.

![imagen](https://user-images.githubusercontent.com/71055467/111059612-99f8a900-845c-11eb-8c6d-b1c197bad685.png)

La parte de código que se muestra a continuación es respecto a la parte gráfica de la ventana, código que fue creado por el propio NetBeans ya que se hizo uso de las herramientas gráficas que ofrece ella misma. Es por ello que no presentamos todo el código, simplemente la declaración donde quiere decir lo que hemos mencionado anteriormente.

![imagen](https://user-images.githubusercontent.com/71055467/111059617-a1b84d80-845c-11eb-99b0-78eca86e1a9a.png)

Las siguientes líneas de código se tratan del método ActionPerformed quien llama a la acción prevista, es decir al pulsar un botón se ejecutará las siguientes instrucciones. Una vez llamada la acción lo primero que se hará es instanciar un objeto de la clase JLabel con la finalidad de crear un espacio para mostrar una vista previa de la imagen seleccionada, también se le asignan ciertas características. La siguiente instrucción es crear un objeto de la clase JFileChooser para que se pueda abrir una segunda ventana en donde mostrará los archivos del equipo y se podrá seleccionar uno de ellos para presentar en la ventana principal. Asimismo, se muestra el código en donde se implementa una interfaz con su método correspondiente, esto sirve para prevenir el error en caso de que el usuario no selecciona una imagen sino algún otro archivo, es por ello que también se presenta un try catch para manejar los errores de la mejor manera.

Por otro lado, se presenta en el mismo método las propiedades para mostrar la imagen en la ventana.

![imagen](https://user-images.githubusercontent.com/71055467/111059625-b0066980-845c-11eb-8862-7a755abf1f75.png)
![imagen](https://user-images.githubusercontent.com/71055467/111059626-b4cb1d80-845c-11eb-83fd-6e59fa5b55cb.png)

La siguiente parte del código fuente se trata del método main quien se encarga de iniciar el programa como en todo programa de java siempre tiene que iniciar a partir de este método, asimismo es necesario recalcar que esta parte no se programó de forma manual sino que el propio IDE fue quien se encargó de hacerlo debido a que utilizamos las herramientas para crear la parte gráfica del programa, por ello no es fundamental presentarlo porque como hemos dicho solo  se trata de la interfaz gráfica, la parte lógica ya se ha explicado anteriormente.

![imagen](https://user-images.githubusercontent.com/71055467/111059636-beed1c00-845c-11eb-8d36-b33a7c9481c2.png)

En la última parte del código, se presenta las variables que se han utilizado durante el programa, mismos que son declarados por el propio entorno de desarrollo.

![imagen](https://user-images.githubusercontent.com/71055467/111059640-c6acc080-845c-11eb-83d2-6ecd8d26aa33.png)

Para terminar, se presenta una captura de como se ha diseñado la ventana para que aparezca al momento de la ejecución, simplemente acompañado de un botón en la parte superior y un Label en toda la parte central que será donde se mostrará la imagen seleccionada. 

![imagen](https://user-images.githubusercontent.com/71055467/111059644-cdd3ce80-845c-11eb-8c2d-3fbc00b2520b.png)



###Ejecución del programa
=============

Para comprobar que todo el código fuente explicado anteriormente funciona, se presenta unos Screenshots en donde se podrá visualizar la ejecución y el resultado paso a paso.

Como primer paso es ejecutar el archivo y nos presenta una ventana de la forma en la que aparece en la imagen, en ella se encuentra presente un título de la ventana, un botón con el nombre de “Abrir imagen” la cual nos servirá para abrir una segunda ventana y poder seleccionar una imagen la cual posteriormente se mostrará en el cuadro que aparece en la parte superior

![imagen](https://user-images.githubusercontent.com/71055467/111059652-dd531780-845c-11eb-8f39-9de1e64dbe24.png)

Si hacemos click en el botón lo que hará es abrir una segunda ventana sobre la que ya está para mostrar el sistema de archivos del equipo y así podemos seleccionar una imagen que se encuentra en nuestro equipo para mostrar.

![imagen](https://user-images.githubusercontent.com/71055467/111059655-e512bc00-845c-11eb-89d8-6dd6702d7018.png)

Nos movemos con la barra de desplazamiento para encontrar una imagen, pero antes de ello si seleccionamos una carpeta vemos que nos muestra un mensaje en el lado derecho con ayuda del JLabel diciendo que el archivo seleccionado no es una imagen.

![imagen](https://user-images.githubusercontent.com/71055467/111059660-ee038d80-845c-11eb-9003-97304c85fcd4.png)

Ahora si nos desplazamos hasta encontrar una imagen y la seleccionamos, veremos que en la parte derecha se muestra una vista previa de la imagen;

![imagen](https://user-images.githubusercontent.com/71055467/111059665-f6f45f00-845c-11eb-9f7f-e9acb26e7b67.png)

Si hacemos click en el botón de abrir, lo que pasará es que se mostrará la imagen, pero en la ventana principal del programa, de la siguiente manera;

![imagen](https://user-images.githubusercontent.com/71055467/111059671-02e02100-845d-11eb-8111-9f7263755333.png)

En caso de querer seleccionar otra imagen simplemente repetimos los pasos anteriores y se hará el cambio de la imagen en la ventana principal.

![imagen](https://user-images.githubusercontent.com/71055467/111059677-0a072f00-845d-11eb-8d66-33b00772cea3.png)

