//фабрика автомобилей
public class CarSelector {
    //фабричный метод, создающий нужный класс
    public Car getCar(RoadType roadType){
        switch (roadType){
            case HIGHWAY:
                return new Porshe();

            case OFFROAD:
                return new Jeep();

            case GRASS:
                return new NewJeep();

        }
        return null;
    }
}
