package se.ryan.medlem;


public class MedlemType {
    private String namn;

    public MedlemType() {
    }

    public MedlemType(String namn) {
        this.namn = namn;
    }
// Getter och setter
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    
}