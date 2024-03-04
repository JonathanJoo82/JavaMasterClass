package Section16;

public class EnumConstructors {

    public static void main(String[] args){
        GenerationEnum generationEnum = GenerationEnum.BABY_BOOMER;
        System.out.println(generationEnum);
        System.out.println();
        int startYearGen = GenerationEnum.BABY_BOOMER.startYear;
        System.out.println("Start year of " + generationEnum + " is " + startYearGen);
        System.out.println("End year of " + generationEnum + " is " + GenerationEnum.BABY_BOOMER.getEndYear());

        System.out.println();
        //return an array continaing all of the values of the enum in the order it was declared.
        System.out.println(GenerationEnum.values()); //this is returning the array object.
        for(GenerationEnum gen : GenerationEnum.values()){
            System.out.println(gen);
        }


    }
}
