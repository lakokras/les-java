public class TestEnum {
    public static void main(String[] args) {
        AnimalEnum animalEnum = AnimalEnum.CAT;
        System.out.println(animalEnum);

        System.out.println(animalEnum.name());

        AnimalEnum frog = AnimalEnum.valueOf("FROG");
        System.out.println(frog.getTranslation());

        switch (animalEnum) {
            case CAT:
                System.out.println("It's a cat!");
                break;
            case DOG:
                System.out.println("It's a dog!");
                break;
        }

//         Object –> Enum –> Season

        Season season = Season.SPRING;
        System.out.println(season.getTempature());
        System.out.println(season.name());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());

        switch (season) {
            case SPRING:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
    }
}
