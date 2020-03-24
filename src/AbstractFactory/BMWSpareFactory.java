package AbstractFactory;

import AbstractFactory.Spare.*;

public class BMWSpareFactory implements SpareFactory {
    private String type;

    public BMWSpareFactory(String type)
    {
        this.type=type;
    }

    public Engine createEngine()
    {
        Engine engine;
        if (type.equals("X5"))
            engine = new EngineX5();
        else if (type.equals("X3"))
            engine = new EngineX3();
        else return null;
        return engine;
    }

    public BrakeSystem createBrakeSystem()
    {
        BrakeSystem brake;
        if (type.equals("X5"))
            brake = new BrakeSystemX5();
        else if (type.equals("X3"))
            brake = new BrakeSystemX3();
        else return null;
        return brake;
    }
}
