/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.factorykeeper;

import domain.button.Button;
import domain.checkbox.CheckBox;
import factory.GUIFactory;

/**
 *
 * @author urosv
 */
public class FactoryKeeper {
    
    private Button button;
    private CheckBox checkBox;

    public FactoryKeeper(GUIFactory concreteFactory) {
        button = concreteFactory.createButton();
        checkBox = concreteFactory.createCheckBox();
    }
    
    public void onClick(){
        button.openBrowser();
        checkBox.onMarkCheckBox();
    }
    
    public void onCreate(){
        button.onCreate();
        checkBox.onCreate();
    }
    
    
    
}
