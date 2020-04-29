/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.main;

import client.factorykeeper.FactoryKeeper;
import factory.GUIFactory;
import factory.mac.MacFactory;
import factory.windows.WindowsFactory;

/**
 *
 * @author urosv
 */
public class Main {

    public static void main(String[] args) {
        FactoryKeeper concreteFactory = getConfiguredFactory();
        
        concreteFactory.onClick();

    }

    public static FactoryKeeper getConfiguredFactory() {

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            return new FactoryKeeper(new MacFactory());
        } else {
            return new FactoryKeeper(new WindowsFactory());
        }
    }

}
