package model;

public class Automovel extends Veiculo {

    public Automovel() {
        super();
    }

    @Override
    public void ateCemPorHora() {
        System.out.println("Levou em média 10s para atingir 100 km/h.");
    }

}
