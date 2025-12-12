class RopeBreakException extends RuntimeException {
    public RopeBreakException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Авария верёвки: " + super.getMessage();
    }
}

class HarvestException extends Exception {
    public HarvestException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Ошибка урожая: " + super.getMessage();
    }
}

class StoryEndException extends RuntimeException {
    public StoryEndException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "СКАЗКА ЗАКОНЧЕНА: " + super.getMessage();
    }
}

