package controller;

import model.Moto;
import model.Veiculo;

public class MotoController implements IVeiculoController, IMotoController {

    public MotoController() {
        super();
    }

    @Override
    public void ligarVeiculo(Veiculo veiculo) {
        System.out
                .println("Pressionando o botão para dar partida na " + veiculo.getMarca() + " " + veiculo.getModelo());
    }

    @Override
    public void acelerarVeiculo(Veiculo veiculo) {
        System.out.println("Girando a manopla para acelerar a " + veiculo.getMarca() + " " + veiculo.getModelo());
        veiculo.ateCemPorHora();
    }

    @Override
    public void pararVeiculo(Veiculo veiculo) {
        System.out.println("Apertando o freio da " + veiculo.getMarca() + " " + veiculo.getModelo() + " até parar.");
    }

    @Override
    public void descansaMoto(Moto moto) {
        System.out.println("Colocou o descanso da " + moto.getMarca() + " " + moto.getModelo());
        System.out.println("Moto parada.");
    }
}
