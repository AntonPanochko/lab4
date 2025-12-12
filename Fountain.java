public class Fountain {
    private final WaterPipe pipe;
    
    public Fountain(WaterPipe pipe) {
        this.pipe = pipe;
    }

    public void waters(Vegetable veg, Material material) {
        pipe.condition(material);
        System.out.println(getClass().getSimpleName() + " поливает " + veg.name + "!");
    }
}