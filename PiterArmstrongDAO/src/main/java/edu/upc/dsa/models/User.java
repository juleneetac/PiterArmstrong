package edu.upc.dsa.models;

//import edu.upc.dsa.util.RandomUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {   //anteriormente esto era Personaje pero los he juntado para menos complicaciones
    //public List<Objeto> objetos;   //HE QUITADO TODO LO DE OBJETOS PORQUE NO SE COMO RELACIONARLO
    String nickname;
    String password;
    int vida;
    int defensa;
    int ataque;
    int dinero;
    int piezas;  //las piezas serán un int que aqui no identificamos que clase de pieza es sino solo las qu tiene


    public User(String name, String pass, int health, int def, int ataq, int money, int piezas) {
        this.nickname = name;
        this.password = pass;
        this.vida = health;
        this.defensa = def;
        this.ataque = ataq;
        this.dinero = money;
        this.piezas = piezas;
       // objetos = new LinkedList<Objeto>();  //HE QUITADO TODO LO DE OBJETOS PORQUE NO SE COMO RELACIONARLO
    }
    public User(String name, String pass){
        this.nickname = name;
        this.password = pass;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }


    public User() { } //constructor vacio

    //public List<Objeto> getObjetos() {   //HE QUITADO TODO LO DE OBJETOS PORQUE NO SE COMO RELACIONARLO
     //   return objetos;
    //}

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return this.vida;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String name) {
        this.nickname = name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setDinero(int money) {
        this.dinero = money;
    }

    public int getDinero() {
        return this.dinero;
    }

}

/**
 public Objeto getObjeto(String nom) throws ObjectoNotFoundException{    // me devuelve el objeto que yo le he pasado
 for (Objeto o : objetos){
 if (o.getNombre().equals(nom)){
 return o;
 }
 }
 throw new ObjectoNotFoundException();
 }


 private class ObjectoNotFoundException extends Exception {
 }
 */