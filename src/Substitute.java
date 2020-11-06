public class Substitute {
    public static void main(String[] args) {
        System.out.printf("Wyjątki dzielimy na KONTROLOWANE, które trzeba obsłużyć i NIEKONTROLOWANE które można, " +
                "ale nie trzeba obsłużyć.\n");
        System.out.printf("Wyjątki NIEKONTROLOWANE dziedziczą po klasie RuntimeException.\n");
        System.out.printf("Wyjątki rzucamy korzystając z instrukcji THROW, jeśli rzucamy wyjątek kontrolowany " +
                "musimy dodatkowo w sygnaturze metody/konstruktora zadeklarować wyjątek używając słowa THROWS\n");
        System.out.printf("Do bloku try-catch możemy dodać dodatkowo blok FINALLY{...}, który wykona się zawsze, " +
                "niezależnie, czy w bloku try wyjątek wystąpił, czy nie.\n");

    }
}
