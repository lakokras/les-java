public enum Season {
    SUMMER(35), WINTER(-30),
    AUTUMN(10), SPRING(20);

    private int tempature;

    Season(int temperature) {
        this.tempature = temperature;
    }

    public int getTempature() {
        return tempature;
    }
}
