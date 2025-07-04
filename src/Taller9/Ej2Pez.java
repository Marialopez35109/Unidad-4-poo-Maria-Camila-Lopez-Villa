package Taller9;

public class Ej2Pez extends Ej2Animal {
    protected String tipoAgua;

    // Constructor
    public Ej2Pez(String especie, String tipoAgua) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoAgua);
    }

}
