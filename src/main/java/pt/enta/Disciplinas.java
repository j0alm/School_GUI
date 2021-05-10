
package pt.enta;

import java.io.Serializable;


class Disciplinas implements Serializable{
    
    private int id;
    private String nome;
    private int totalHoras;

    public Disciplinas(int id, String nome, int totalHoras) {
        this.id = id;
        this.nome = nome;
        this.totalHoras = totalHoras;
    }

    Disciplinas() {
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

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
    
    

    @Override
    public String toString() {
        return "Disciplinas{" + "id=" + id + ", nome=" + nome + ", totalHoras=" + totalHoras + '}';
    }
    
    
    
    
}
