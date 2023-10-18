/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pozole.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author sergi
 */
public class Post {
    private List <String>comentario;
    private String imagen;
    private String descripcion;
    private Date fecha;
    private int positivo;
    private int negativo;
    private String nombre;
    private user User;
    private categoria Categoria;
    

    public categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(categoria Categoria) {
        this.Categoria = Categoria;
    }

    public user getUser() {
        return User;
    }

    public void setUser(user User) {
        this.User = User;
    }

    public List <String> getComentario() {
        return comentario;
    }

    public void setComentario(List <String> comentario) {
        this.comentario = comentario;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPositivo() {
        return positivo;
    }

    public void setPositivo(int positivo) {
        this.positivo = positivo;
    }

    public int getNegativo() {
        return negativo;
    }

    public void setNegativo(int negativo) {
        this.negativo = negativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
