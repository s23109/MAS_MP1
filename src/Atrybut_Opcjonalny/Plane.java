package Atrybut_Opcjonalny;

public class Plane {

    String mainData;
    String optionalData;

    public Plane(String mainData, String optionalData) {
        this.mainData = mainData;
        this.optionalData = optionalData;
    }

    public Plane(String mainData) {
        this.mainData = mainData;
        this.optionalData=null;
    }

    @Override
    public String toString() {
        return "MainData " + mainData + "\n OptionalData " + (optionalData!=null?optionalData:"Not Added");
    }
}
