/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.windows;

import domain.button.Button;
import domain.button.impl.WindowsButton;
import domain.checkbox.CheckBox;
import domain.checkbox.impl.WindowsCheckBox;
import factory.GUIFactory;

/**
 *
 * @author urosv
 */
public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
    
}
