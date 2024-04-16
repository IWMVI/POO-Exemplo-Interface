package view;

import controller.AutomovelController;
import controller.MotoController;
import model.Automovel;
import model.Moto;

public class Principal {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        automovel.setMarca("Mitsubishi");
        automovel.setModelo("L200");
        automovel.setVelocidadeMaxima(180);

        Moto moto = new Moto();
        moto.setMarca("Suzuki");
        moto.setModelo("Boulevard 1800");
        moto.setVelocidadeMaxima(250);


        
        AutomovelController ac = new AutomovelController();
        ac.ligarVeiculo(automovel);
        ac.acelerarVeiculo(automovel);
        ac.pararVeiculo(automovel);
        
        System.out.println("\n**************************************************\n");

        MotoController mc = new MotoController();
        mc.ligarVeiculo(moto);
        mc.acelerarVeiculo(moto);
        mc.pararVeiculo(moto);
        mc.descansaMoto(moto);
    }
}
