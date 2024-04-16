package controller;

import model.Veiculo;

public class AutomovelController implements IVeiculoController {

    public AutomovelController() {
        super();
    }

    @Override
    public void ligarVeiculo(Veiculo veiculo) {
        System.out.println("Girando a chave do veículo: " + veiculo.getMarca() + " " + veiculo.getModelo());
    }

    @Override
    public void acelerarVeiculo(Veiculo veiculo) {
        System.out.println("Acelerando o automóvel " + veiculo.getMarca() + " " + veiculo.getModelo());
        veiculo.ateCemPorHora();
    }

    @Override
    public void pararVeiculo(Veiculo veiculo) {
        System.out.println("Pisando no freio e na embreagem para reduzir a velocidade do " + veiculo.getMarca() + " "
                + veiculo.getModelo() + " até parar.");
    }

}
