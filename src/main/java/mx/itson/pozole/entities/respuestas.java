/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pozole.entities;

import java.util.List;

/**
 *
 * @author sergi
 */
public class respuestas {
     private String respuesta;
    private int like;
    private int dislike;
    private user User;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }
   

    public user getUser() {
        return User;
    }

    public void setUser(user User) {
        this.User = User;
    }
}
