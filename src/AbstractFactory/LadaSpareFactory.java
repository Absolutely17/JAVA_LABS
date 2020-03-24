package AbstractFactory;

import AbstractFactory.Spare.*;

public class LadaSpareFactory implements  SpareFactory {
    private String type;

    public LadaSpareFactory(String type)
    {
        this.type=type;
    }

    public Engine createEngine()
    {
        Engine engine;
        if (type.equals("Priora"))
            engine = new EnginePriora();
        else if (type.equals("Granta"))
            engine = new EngineGranta();
        else return null;
        return engine;
    }

    public BrakeSystem createBrakeSystem()
    {
        BrakeSystem brake;
        if (type.equals("Priora"))
            brake = new BrakeSystemX5();
        else if (type.equals("Granta"))
            brake = new BrakeSystemX5();
        else return null;
        return brake;
    }
}
