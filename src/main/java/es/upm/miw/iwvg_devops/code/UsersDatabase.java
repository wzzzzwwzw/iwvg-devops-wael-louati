package es.upm.miw.iwvg_devops.code;

import java.util.List;
import java.util.stream.Stream;

public class UsersDatabase {

    public Stream<User> findAll() {

        List<Fraction> fractions1 = List.of(
                new Fraction(1, 1),
                new Fraction(1, 1),
                new Fraction(2, 1)
        );
        List<Fraction> fractions2 = List.of(
                new Fraction(2, 1),
                new Fraction(-1, 5),
                new Fraction(2, 4),
                new Fraction(4, 3)
        );
        List<Fraction> fractions3 = List.of(
                new Fraction(1, 5),
                new Fraction(3, -6),
                new Fraction(1, 2),
                new Fraction(4, 4)
        );
        List<Fraction> fractions4 = List.of(
                new Fraction(2, 1),
                new Fraction(4, 4)
        );
        List<Fraction> fractions5 = List.of(
                new Fraction(8, 1),
                new Fraction(1, -2),
                new Fraction(0, 1)
        );

        List<Fraction> fractions6 = List.of(
                new Fraction(0, 1),
                new Fraction(1, 1),
                new Fraction(1, 1)
        );
        List<Fraction> fractions7 = List.of(
                new Fraction(0, 1),
                new Fraction(1, 1),
                new Fraction(1, 1)
        );
        List<Fraction> fractions8 = List.of(
                new Fraction(0, 1),
                new Fraction(0, 1),
                new Fraction(0, 1)
        );

        return Stream.of(
                new User("1", "Pedro", "Fernandez", fractions1),
                new User("2", "Ana", "Blanco", fractions2),
                new User("3", "Oscar", "Lopez", fractions3),
                new User("4", "Paula", "Torres", fractions4),
                new User("5", "Antonio", "Blanco", fractions5),
                new User("6", "Paula", "Torres", fractions6),
                new User("7", "Antonio", "Torres", fractions7),
                new User("8", "Antonio", "Lopez", fractions8)
        );
    }
}
