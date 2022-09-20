import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

/* public String stringConcatenation() {
    return "Get busy living"
            .concat(newLine)
            .concat("or")
            .concat(newLine)
            .concat("get busy dying.")
            .concat(newLine)
            .concat("--Stephen King");
} */

// les stringBuilder

public String stringBuilder() {
    return new StringBuilder()
            .append("Get busy living")
            .append(newLine)
            .append("or")
            .append(newLine)
            .append("get busy dying.")
            .append(newLine)
            .append("--Stephen King")
            .toString();
}

// Chargement à partir d'un fichier

public String loadFromFile() throws IOException {
    return new String(Files.readAllBytes(Paths.get("src/main/resources/stephenking.txt")));
}

// check if string is a palindrome

public boolean isPalindrome(String text) {
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    int length = clean.length();
    int forward = 0;
    int backward = length - 1;
    while (backward > forward) {
        char forwardChar = clean.charAt(forward++);
        char backwardChar = clean.charAt(backward--);
        if (forwardChar != backwardChar)
            return false;
    }
    return true;
}

// with the stringBuilder use
public boolean isPalindromeReverseTheString(String text) {
    StringBuilder reverse = new StringBuilder();
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    char[] plain = clean.toCharArray();
    for (int i = plain.length - 1; i >= 0; i--) {
        reverse.append(plain[i]);
    }
    return (reverse.toString()).equals(clean);
}

/* Dans l'extrait ci-dessus, nous itérons simplement la chaîne donnée à partir du dernier caractère 
et ajoutons chaque caractère au caractère suivant, jusqu'au premier caractère,
 inversant ainsi la chaîne donnée.

Enfin, nous testons l'égalité entre la chaîne donnée et la chaîne inversée . */

// palindrome with recursivity

public boolean isPalindromeRecursive(String text){
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    return recursivePalindrome(clean,0,clean.length()-1);
}

private boolean recursivePalindrome(String text, int forward, int backward) {
    if (forward == backward) {
        return true;
    }
    if ((text.charAt(forward)) != (text.charAt(backward))) {
        return false;
    }
    if (forward < backward + 1) {
        return recursivePalindrome(text, forward + 1, backward - 1);
    }

    return true;
}

// String : split()

//separation par une virgule
String[] splitted = "peter,james,thomas".split(",");

//separation par une espace
String[] splitted1 = "car jeep scooter".split(" ");

//separation par un point
String[] splitted2 = "192.168.1.178".split("\\.");
}
