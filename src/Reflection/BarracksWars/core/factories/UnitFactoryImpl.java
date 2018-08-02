package Reflection.BarracksWars.core.factories;

import Reflection.BarracksWars.contracts.Unit;
import Reflection.BarracksWars.contracts.UnitFactory;
import Reflection.BarracksWars.models.units.Swordsman;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME = "Reflection.BarracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {

        Unit unit = null;

        try {
            Class<?> unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<?> declaredConstructor = unitClass.getDeclaredConstructor();
            unit = (Unit) declaredConstructor.newInstance();



        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }








        /*
        switch (unitType){
            case "Swordsman":
                return new Swordsman();
        }
        return null;
        */


        return unit;

    }
}
