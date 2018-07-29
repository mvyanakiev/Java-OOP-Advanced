package Reflection.BarracksWars;

import Reflection.BarracksWars.contracts.Repository;
import Reflection.BarracksWars.contracts.Runnable;
import Reflection.BarracksWars.contracts.UnitFactory;
import Reflection.BarracksWars.core.Engine;
import Reflection.BarracksWars.core.factories.UnitFactoryImpl;
import Reflection.BarracksWars.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
