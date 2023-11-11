package ua;

public class PlanetTester {
    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be "planet"
        System.out.println(tester.test(new Moon())); //Should be "not planet"
    }

    public String test(SpaceObject o){
        if (!(o instanceof SpaceObject)) return "not planet";
        return o.isPlanet();
    }
}

abstract class SpaceObject{
    abstract public String isPlanet();
}

abstract class Planet extends SpaceObject{

}

class Mars extends Planet{
    @Override
    public String isPlanet(){
        return "planet";
    }
}

class Moon extends SpaceObject{
    @Override
    public String isPlanet(){
        return "not planet";
    }
}
