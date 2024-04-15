package lab3;

import java.time.Year;

public class House {
    private String Name;
    private Integer FloorsTotal;
    private Integer YearOfConstruction;

    public void setValues(String name, Integer floors, Integer year) {
        this.Name = name;
        this.FloorsTotal = floors;
        this.YearOfConstruction = year;
    }

    public void printRes() {
        System.out.println("Name: " + this.Name + ", " +
                "Floors: " + this.FloorsTotal + ", " +
                "Year Of Construction: " + this.YearOfConstruction);
    }

    public void printYearsDiff() {
        int diff = Year.now().getValue() - YearOfConstruction;
        System.out.println("Years passes since construction finished: " + diff);
    }
}
