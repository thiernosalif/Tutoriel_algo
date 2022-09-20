public class Chaine {
// déclarer des chaînes multilignes en Java.

/* public String textBlocks() {
    return """
        Get busy living
        or
        get busy dying.
        --Stephen King""";
} */

// le textBlock n'est dispo qu'à partir de java 15

public String stringConcatenation() {
    return "Get busy living"
            .concat(newLine)
            .concat("or")
            .concat(newLine)
            .concat("get busy dying.")
            .concat(newLine)
            .concat("--Stephen King");
}
}
