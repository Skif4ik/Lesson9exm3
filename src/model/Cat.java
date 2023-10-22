package model;

public class Cat extends Pet {
    private CatTail tail;

    public Cat() {
        tail = new CatTail();
    }

    public Cat(String name, String color) {
        super(name);
        this.tail = new CatTail(color);
    }

    // во внешнем классе доступны поля(даже закрытые) и методы внутреннего класса,
    // но через конкретный объект этого внутреннего класса
    @Override
    public void wagTail() {
        tail.wag();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("tail=").append(tail);
        sb.append(", name='").append(getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

// Закрытый внутренний класс "Хвост кота"
    // тем самым такой созданный класс можно
    // использовать только внутри класса Cat

    // в методах внутреннего класса есть доступ к static и non static полям и методам внешнего класса
    private class CatTail {
        private String color;


        public CatTail() {
            color = "grey";
        }

        public CatTail(String color) {
            this.color = color;
        }

        // для методов внутреннего класса доступны неявные ссылки :
        // this - ссылка на хвост для которого будет вызван метод
        // Cat.this - ссылка на оъект внешнего класса(ссылка на кота которому пренадлежит хвост)
        public void wag(){
            System.out.println("Котик " + getName() + ", виляет хвостом " + color);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("CatTail{");
            sb.append("color='").append(color).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
