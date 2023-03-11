public class Main {

    public static void main(String[] args) {
        Person robertDeNiro = new Person();
        robertDeNiro.setName("Robert De Niro");
        System.out.println("My name is: " + robertDeNiro.getName());
        robertDeNiro.setGender("male");
        System.out.println("My gender is: " + robertDeNiro.getGender());
        robertDeNiro.setProfession("actor");
        System.out.println("My profession is: " + robertDeNiro.getProfession());
        robertDeNiro.setAge(79);
        robertDeNiro.setWeight(76);
        robertDeNiro.setHeight(177);
        System.out.println("I have " + robertDeNiro.getAge() + " years old, my weight is " + robertDeNiro.getWeight() + " kg, my height is " + robertDeNiro.getHeight() + " sm.");
        robertDeNiro.setHairColor("brunet");
        System.out.println("When I was young I had " + robertDeNiro.getHairColor() + " hair color");
        robertDeNiro.setEyeColor("green");
        System.out.println("I have " + robertDeNiro.getEyeColor() + " eye color");
        robertDeNiro.setGenre("crime, comedy");
        System.out.println("I have acted in films with such genres as: " + robertDeNiro.getGenre());
        robertDeNiro.setPlaceOfBirth("New York. USA");
        robertDeNiro.setKnowledgeOfLanguage("english");
        System.out.println("I was born in " + robertDeNiro.getPlaceOfBirth() + " and I speak " + robertDeNiro.getKnowledgeOfLanguage());
        robertDeNiro.setAwards("Oscar");
        System.out.println("I have many awards one of which is an " + robertDeNiro.getAwards());

        System.out.println("-----------------------------------------------------------------------");

        Person lesyaUkrainka = new Person();
        lesyaUkrainka.setName("Larisa Petrivna Kosach-Kvitka");
        System.out.println("Her name is " + lesyaUkrainka.getName());
        lesyaUkrainka.setGender("Female");
        System.out.println("Her gender is: " + lesyaUkrainka.getGender());
        lesyaUkrainka.setDateLive("1871-1913");
        System.out.println("Her life years is: " + lesyaUkrainka.getDateLive());
        lesyaUkrainka.setEyeColor("Dark gray to blue");
        System.out.println("Her eyes changed color from " + lesyaUkrainka.getEyeColor());
        lesyaUkrainka.setHairColor("Blonde");
        System.out.println("Her hair color was " + lesyaUkrainka.getHairColor());
        lesyaUkrainka.setGenre("Poetry, dramatic poetry");
        System.out.println("She is famous in the genre as " + lesyaUkrainka.getGenre());
        lesyaUkrainka.setPlaceOfBirth("Ukraine");
        lesyaUkrainka.setKnowledgeOfLanguage("Ukrainian");
        System.out.println("She was born in " + lesyaUkrainka.getPlaceOfBirth() + " and she was fluent in " + lesyaUkrainka.getKnowledgeOfLanguage());
        lesyaUkrainka.setAwards("Asteroid with name Lesya 2616");
        System.out.println("A lot is connected with her name in the field of Ukrainian culture. And even an asteroid was named after her - " + lesyaUkrainka.getAwards());
    }
}
