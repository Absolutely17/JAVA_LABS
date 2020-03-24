package AbstractFactory;

import AbstractFactory.Spare.BrakeSystem;
import AbstractFactory.Spare.Engine;

public interface SpareFactory {
    public Engine createEngine();
    public BrakeSystem createBrakeSystem();
}
