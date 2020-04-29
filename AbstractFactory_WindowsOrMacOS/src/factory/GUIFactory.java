/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import domain.button.Button;
import domain.checkbox.CheckBox;

/**
 *
 * @author urosv
 */
public interface GUIFactory {

    Button createButton();

    CheckBox createCheckBox();

}
