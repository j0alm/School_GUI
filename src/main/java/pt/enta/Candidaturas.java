
package pt.enta;

import java.io.Serializable;


public class Candidaturas implements Serializable{
    
    private int idMatricula;
    private String nomeCandidato;
    private String nomeCurso;

    public Candidaturas(int idMatricula, String nomeCandidato, String nomeCurso) {
        this.idMatricula = idMatricula;
        this.nomeCandidato = nomeCandidato;
        this.nomeCurso = nomeCurso;
    }

    Candidaturas() {
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    
    
    @Override
    public String toString() {
        return "Candidaturas{" + "idMatricula=" + idMatricula + ", nomeCandidato=" + nomeCandidato + ", nomeCurso=" + nomeCurso + '}';
        
    }
    
    
    
    
}
