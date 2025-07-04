package Taller8;

public class Ej2Estudiante extends Ej2Persona {
    private int matricula;

    // setters y getters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //Metodo para mostrar detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Matrícula: " + getMatricula());
    }



}
