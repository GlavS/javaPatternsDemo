//фабрика автомобилей
//можем применить паттерн Singleton
public class CarSelector {
    //фабричный метод, создающий нужный класс
    private static CarSelector instance;
    private CarSelector(){}
    public static CarSelector getInstance(){
        if(instance == null){
            instance = new CarSelector();
        }
        return instance;
    }

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
