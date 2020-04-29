/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.mac;

import domain.button.Button;
import domain.button.impl.MacButton;
import domain.checkbox.CheckBox;
import domain.checkbox.impl.MacCheckBox;
import factory.GUIFactory;

/**
 *
 * @author urosv
 */
public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
    
}
