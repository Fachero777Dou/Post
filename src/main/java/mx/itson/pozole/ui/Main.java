/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.pozole.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.pozole.entities.*;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Se crean cuatro objetos de la clase user llamados User, User1, User2 y User3. Estos objetos representan usuarios de la plataforma y se les asignan nombres, correos electrónicos y roles.
        user User = new user();
        User.setNombre("RaccoonCoward");
        User.setCorreo("RaccoonCoward777@gmail.com");
        User.setRol("User");
        user User1 = new user();
        User1.setNombre("Marco the phoenix");
        User1.setCorreo("Marco@gmail.com");
        User1.setRol("User");
        user User2 = new user();
        User2.setNombre("Shanks red haired");
        User2.setCorreo("shanksu@gmail.com");
        User2.setRol("Admin");
        user User3 = new user();
        User3.setNombre("Rocks D. Xebec");
        User3.setCorreo("Rocks@gmail.com");
        User3.setRol("Admin");

        //Se crea un objeto de la clase categoria llamado Categoria, que representa la categoría a la que pertenece la publicación.
        categoria Categoria = new categoria();
        Categoria.setNombre("Mangas");

        //Se crea una lista de cadenas llamada comentario que contiene un único comentario.
        List<String> comentario = new ArrayList<>();
        comentario.add("Luffy´s peakkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

        //Se crea un objeto Date para representar la fecha y la hora de la publicación.
        Date date = new Date();
        
        //Se crean tres objetos de la clase respuestas llamados Respuesta, Respuesta1 y Respuesta2. Estos objetos representan respuestas o comentarios en la publicación y se les asignan respuestas, recuentos de "likes" y "dislikes", y se les asocian a usuarios específicos. 
        respuestas Respuesta = new respuestas();
        Respuesta.setRespuesta("So excited to hear the drums of liberation");
        Respuesta.setLike(3000);
        Respuesta.setDislike(59);
        Respuesta.setUser(User1);
        respuestas Respuesta1 = new respuestas();
        Respuesta1.setRespuesta("PEAK");
        Respuesta1.setLike(200);
        Respuesta1.setDislike(10);
        Respuesta1.setUser(User2);
        respuestas Respuesta2 = new respuestas();
        Respuesta2.setRespuesta("THE POWER OF IMAGINATION!!!");
        Respuesta2.setLike(5000);
        Respuesta2.setDislike(99);
        Respuesta2.setUser(User3);

        //Se crea una lista de respuestas llamada ola y se agregan las tres respuestas a esta lista.
        List<respuestas> ola = new ArrayList<>();
        ola.add(Respuesta);
        ola.add(Respuesta1);
        ola.add(Respuesta2);

        //Se crea un objeto de la clase Post llamado OnePiece para representar una publicación. Se establecen valores para los atributos de esta publicación, como nombre, comentarios, descripción, imagen, usuario, fecha, "likes" y "dislikes", y se asocia con la categoría.
        Post OnePiece = new Post();
        OnePiece.setNombre("He's here!");
        OnePiece.setComentario(comentario);
        OnePiece.setDescripcion("Here comes the Warrior of Liberation! Episode 1071, Luffy's Peak");
        OnePiece.setImagen("https://twitter.com/OnePieceAnime/status/1687992010756521984/photo/1");
        OnePiece.setUser(User);
        OnePiece.setFecha(date);
        OnePiece.setPositivo(12000);
        OnePiece.setNegativo(1);
        OnePiece.setCategoria(Categoria);
        //OnePiece.setRespuesta(Respuesta);
        //OnePiece.setRespuesta(Respuesta1);
        //OnePiece.setRespuesta(Respuesta2);

        //Finalmente, el código imprime los valores de los objetos creados. Muestra la información del usuario que hizo la publicación, el contenido de la publicación, la imagen, la descripción, la categoría, la fecha, el número de "likes" y "dislikes". Luego, se utiliza un bucle for-each para imprimir las respuestas a la publicación, incluyendo el nombre del usuario, la respuesta, y los recuentos de "likes" y "dislikes".
        System.out.println(
                OnePiece.getUser().getNombre()
                + ": " + OnePiece.getNombre()
                + "\n" + OnePiece.getComentario().get(0)
                + "\n" + OnePiece.getImagen()
                + "\n" + "Descripcion: " + OnePiece.getDescripcion()
                + "\n" + "Categoria: " + OnePiece.getCategoria().getNombre()
                + "\n" + "Fecha: " + OnePiece.getFecha()
                + "\n" + "Likes: " + OnePiece.getPositivo()
                + "\n" + "Dislikes: " + OnePiece.getNegativo());

        for (respuestas Respuestas : ola) {
            System.out.println(Respuestas.getUser().getNombre() + ": " + Respuestas.getRespuesta()+"\nLikes: "+Respuestas.getLike()+"\nDislikes: "+Respuestas.getDislike());
        }
 
    }

}
