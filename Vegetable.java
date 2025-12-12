abstract public class Vegetable {
    protected String name;
    protected byte height;
    protected byte undergroundH;

    public Vegetable(String name, byte height, byte undergroundH) {
        this.name = name;
        this.height = height;
        this.undergroundH = undergroundH;
    }

    abstract public boolean isRipe();

    public void harvest() throws HarvestException {
        if (isRipe()) {
            System.out.println(name + " можно выкапывать! Урожай готов.");
        } else {
            throw new HarvestException(name + " ещё не созрела");
        }
    }
}