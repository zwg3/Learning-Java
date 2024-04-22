//TASK 2
package lab2;

public class Student {
    String name;
    Integer age;
    Integer mathScore;
    Integer chemistryScore;
    Integer literatureScore;

    public Student(String name, Integer age, Integer mathScore, Integer chemistryScore, Integer literatureScore) {
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
        this.chemistryScore = chemistryScore;
        this.literatureScore = literatureScore;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "weight = " + name +
                ", age=" + age +
                ", mathScore=" + mathScore +
                ", chemistryScore=" + chemistryScore +
                ", literatureScore=" + literatureScore
                ;
    }
}





