package se.ryanhgren.medlem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MedlemType {


    @Id
    @GeneratedValue
    private Long id;
    private String namn;

    public MedlemType() {
    }

    public MedlemType(String namn) {
        this.namn = namn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    
}