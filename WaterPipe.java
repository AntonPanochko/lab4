import java.util.Random;

public class WaterPipe implements ServiceAbility {
    private final boolean workingState;
    private final Material material;
    private final Random rand = new Random();

    public WaterPipe(Material material) {
        this.material = material;
        this.workingState = rand.nextDouble() >= 0.5;
    }

    @Override
    public boolean isWork() {
        return workingState;
    }

    @Override
    public void condition(Material material) {
        if (!workingState) {
            throw new StoryEndException("Труба не работает! Овощи засохнут без воды.");
        }
        
        if (rand.nextDouble() < 0.3) {
            throw new RuntimeException("Труба затопила город!");
        }
        System.out.println(getClass().getSimpleName() + " из " + this.material + " работает исправно!");
    }
}