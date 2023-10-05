public enum AnimalEnum {
    DOG("собака"), CAT("кошка"), FROG("лягушка");

    private String translation;

     AnimalEnum(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
         return translation;
    }

    public String toString() {
         return "Перевод на русский язык: " + translation;
    }
}
