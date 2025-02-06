package Lesson_09.Ex000;

public class Program {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Foo foo2 = new Foo() {

            @Override
            public void m1() {
                System.out.println(">>m1");
            }

            @Override
            public void m2() {
                System.out.println(">>m2");
            }

        };

        Foood foos = new Foood() {
            @Override
            public void GetFood() {
                System.out.println("GetFood");
            }

            @Override
            public void SetFood() {
                System.out.println("SetFood");
            }
        };

        foos.GetFood();
        foos.SetFood();
        foo2.m1();
    }
}
