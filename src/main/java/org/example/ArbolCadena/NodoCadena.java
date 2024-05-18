package org.example.ArbolCadena;

public class NodoCadena {
    protected  String dato;
    protected NodoCadena izdo;
    protected NodoCadena dcho;
    public NodoCadena(String valor){
        dato = valor;
        izdo = dcho = null;
    }

    public NodoCadena(NodoCadena ramaIzdo, String valor, NodoCadena ramaDcho){
        this.dato = valor;
        this.izdo = ramaIzdo;
        this.dcho = ramaDcho;
    }

    //GENERADORES DE ACCESO
    public  String valorNodo(){
        return dato;
    }
    public NodoCadena GetSubarbolIzdo(){return izdo;}
    public NodoCadena GetSubarbolDcho(){return dcho;}
    public void nuevoValor(String d){
        dato = d;
    }
    public void SetRamaIzdo(NodoCadena n){
        izdo = n;
    }
    public void SetRamaDcho(NodoCadena n){
        dcho = n;
    }
    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }
}