/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.checkbox.impl;

import domain.checkbox.CheckBox;

/**
 *
 * @author urosv
 */
public class WindowsCheckBox implements CheckBox {

    @Override
    public void onMarkCheckBox() {
        //Really dum print below, i know...
        System.out.println("You selected WindowsChechBox");
    }

    @Override
    public void onCreate() {
        System.out.println("You have created : " + this.getClass().getSimpleName());
    }

}
