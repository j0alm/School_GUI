
package pt.enta;

import java.io.Serializable;


public class CursosDisciplina implements Serializable{
    
    private String nomeDoCurso;
    private String nomeDaDisciplina;

    public CursosDisciplina(String nomeDoCurso, String nomeDaDisciplina) {
        this.nomeDoCurso = nomeDoCurso;
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    CursosDisciplina() {
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public void setNomeDaDisciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }
    
    

    @Override
    public String toString() {
        return "CusosDisciplina{" + "nomeDoCurso=" + nomeDoCurso + ", nomeDaDisciplina=" + nomeDaDisciplina + '}';
    }
    
    
    
}
