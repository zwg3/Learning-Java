package lab7;

public class Plane {
    static class Wing implements PlaneData {
        private Integer weight;

        @Override
        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @Override
        public void printWeight() {
            System.out.println(weight);
        }
    }
}

