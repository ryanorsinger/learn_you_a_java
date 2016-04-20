/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author Moravia
 */
public interface BicycleInterface {
    void changeCadence(int newValue);
    
    void speedUp(int newValue);
    
    void applyBrakes(int decrement);
    
    void changeGear(int newValue);
}
