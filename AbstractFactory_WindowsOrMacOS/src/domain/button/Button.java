/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.button;

/**
 *
 * @author urosv
 */
public abstract class Button {

    public void onClick() {
        System.out.println("You have created : " + this.getClass().getSimpleName());
    }
    
    public abstract void openBrowser();

}
