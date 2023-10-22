package model;

public class Dog extends Pet{
    private DogTail tail;

    public Dog() {
        tail = new DogTail();
    }

    public Dog(String name, String color) {
        super(name);
        this.tail = new DogTail(color);
    }


    @Override
    public void wagTail() {
        tail.wag();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("tail=").append(tail);
        sb.append(", name='").append(getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }




    public class DogTail {
        private String color;

        public DogTail() {
            color = "yellow";
        }

        public DogTail(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("DogTail{");
            sb.append("color='").append(color).append('\'');
            sb.append('}');
            return sb.toString();
        }

        public void wag() {
            System.out.println("Собачка " + getName() + " виляет хвостом " + color);
        }

    }
}
