package aula11;

import java.util.ArrayList;

public class MainInterface {
    public static void main(String[] args) {
        
        ArrayList<Veiculo> lstVeiculos =  new ArrayList<>();
        Carro car = new Carro();
        Moto mot = new Moto();
        
        lstVeiculos.add(car);
        lstVeiculos.add(mot);
        
        ArrayList<IAutomatico> lstAutomaticos = new ArrayList<>();
        CarroAutomatico carAuto = new CarroAutomatico();
        MotoAutomatica motAuto = new MotoAutomatica();
        
        lstAutomaticos.add(carAuto);
        lstAutomaticos.add(motAuto);
        
        for (IAutomatico auto : lstAutomaticos) {
            auto.mudaMarchaAutomaticamente();
        }
    }
}
