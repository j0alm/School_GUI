
package pt.enta;

import java.io.Serializable;


class Formandos implements Serializable{
    private int id;
    private String nome;
    private int age;
    private String genero;
    private int telemovel;

    public Formandos(int id, String nome, int age, String genero, int telemovel) {
        this.id = id;
        this.nome = nome;
        this.age = age;
        this.genero = genero;
        this.telemovel = telemovel;
    }

    Formandos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    
    
    @Override
    public String toString() {
        return "Formandos[" + "id=" + id + ", nome=" + nome + ", idade=" + age + ", genero=" + genero + ", telemovel=" + telemovel + ']';
    }
    
    
    
    
}
