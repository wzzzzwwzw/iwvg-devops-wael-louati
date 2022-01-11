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

    public Stream<String>findFractionDivisionByUserId(String id) {
        return Stream.empty();
    }

    public Stream<Double> findFirstDecimalFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user->name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal)
                ;
    }
    public Stream<String>findUserIdByAllProperFraction() {
        return Stream.empty();
    }

    public Stream<Double> findDecimalImproperFractionByUserName(String name) {
        return Stream.empty();
    }

    public Stream<String>findFirstProperFractionByUserId(String id) {
        return Stream.empty();
    }

    public Stream<String> findUserFamilyNameByImproperFraction(int fractionDenominator) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fraction -> fraction.getNumerator()>fraction.getDenominator()))
                .map(User::getFamilyName)
                .distinct();
    }

}
