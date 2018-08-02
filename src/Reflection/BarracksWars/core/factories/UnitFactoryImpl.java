package Reflection.BarracksWars.core.factories;

import Reflection.BarracksWars.contracts.Unit;
import Reflection.BarracksWars.contracts.UnitFactory;
import Reflection.BarracksWars.models.units.Swordsman;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME = "Reflection.BarracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {


        Unit unit = null;
        switch (unitType){
            case "Swordsman":
                unit = new Swordsman();
                break;
        }
        return unit;



        // TODO: implement for problem 3
    }
}
