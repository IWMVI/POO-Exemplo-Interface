package model;

public class Moto extends Veiculo {

    public Moto(){
        super();
    }

    @Override
    public void ateCemPorHora() {
        System.out.println("Levou em média 5s para atingir 100 km/h.");
    }

}
