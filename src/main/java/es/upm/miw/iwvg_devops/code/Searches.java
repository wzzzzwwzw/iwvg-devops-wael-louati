package es.upm.miw.iwvg_devops.code;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

public class Searches {

    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isProper))
                .map(User::familyNameInitial);
}
    public Stream<String>  findUserIdBySomeProperFraction(int fractionDenominator) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fraction -> fraction.getNumerator()<fraction.getDenominator()))
                .map(User::getId);
    }

    public Stream<String> findFractionMultiplicationByUserFamilyName(String familyName) {
        return Stream.empty();
    }

}
