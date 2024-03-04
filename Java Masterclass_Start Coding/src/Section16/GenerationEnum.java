package Section16;


public enum GenerationEnum {
    /*
    Special class that represents a group of constants. Unchangeable variables.
    An enum cannot be used to creat objects and cannot extend other classes.
    Use it when one knows that the values will not be changing.

    Default constructors does not need to explicitly arguments for each constant.
    When a constructor explicitly has arguments being passed. Each constant also needs to be declared with it's own argument.
     */


    /*
    The arguments for each enum constant in the provided Generation enum are used to initialize the fields of the enum constant when it is created.
    Represent the initial values of startYear and endYear.
    Allows each variable to have it's own specific values. Making it versatile for usages.
     */
    GEN_Z(2001, 2025),
    MILLENNIAL(1981, 2000),
    GEN_X(1965, 1980),
    SILENT_GENERATION(1927,1945),
    BABY_BOOMER(1946,1980),
    GREATEST_GENERATION(1901,1926);
    final int startYear;
    final int endYear;

    //Constructors in enum are always private.
    GenerationEnum(int startYear, int endYear) {
        this.startYear=startYear;
        this.endYear=endYear;
        System.out.println(this + " " + startYear + " - " + endYear);
    }

    int getStartYear(){
        return startYear;
    }

    int getEndYear(){
        return endYear;
    }
}
