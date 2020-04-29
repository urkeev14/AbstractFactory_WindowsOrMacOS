/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.button.impl;

import domain.button.Button;

/**
 *
 * @author urosv
 */
public class WindowsButton extends Button {

    @Override
    public void openBrowser() {
        System.out.println("You opened: Google Chrome");
    }
    
}
