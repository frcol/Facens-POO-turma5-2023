/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author fabio
 */
public class MotoAutomatica extends Moto implements IAutomatico{

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Muda Marcha moto Auto");
    }
    
}
