
package pt.enta;

import java.io.Serializable;


class Cursos implements Serializable{
    
    private int id;
    private String nome;
    private int totalHoras;
    private int numVagas;
    private int numDisciplinas;
    
    

    public Cursos(int id, String nome, int totalHoras, int numVagas, int numDisciplinas) {
        this.id = id;
        this.nome = nome;
        this.totalHoras = totalHoras;
        this.numVagas = numVagas;
        this.numDisciplinas = numDisciplinas;
    }

    Cursos() {
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

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public int getNumDisciplinas() {
        return numDisciplinas;
    }

    public void setNumDisciplinas(int numDisciplinas) {
        this.numDisciplinas = numDisciplinas;
    }

    
    
    @Override
    public String toString() {
        return "Cursos{" + "id=" + id + ", nome=" + nome + ", totalHoras=" + totalHoras + ", numVagas=" + numVagas + ", numDisciplinas=" + numDisciplinas + '}';
    }
    
    
    
    
}
