import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class generateCheatSheet {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("ideaCheatSheet.txt");
        String text= """
                Przydatne skróty:

                    edytor:
                        shift F6 = refactor
                        alt enter = proponowane rozwiązanie błędu
                        ctrl shift f10 = skompilowanie i uruchomienie kodu
                        alt 1 = manager projektu
                        alt + insert = generowanie różnych struktur
                        alt 6 = problemy
                        ctrl w = zaznaczanie struktur
                        alt 9 = git


                    globalne:
                        shift (dwa razy) = szukaj wszędzie
                        ctrl alt s = ustawienia globalne
                        ctrl slt shift s = ustawienia projektu

                    git:
                        ctrl k = commit (zapisz lokalnie zmiany)
                        ctrl shift k = push (zapisz zmiany na serwerze)
                        ctrl t = update (ściągnij zmiany z serwera)

                    Proponowane skróty:
                        alt shift f5 = nowa klasa
                        shift f5 = nowy pakiet

                Przydatne makra:

                    main = definicja metody main
                    sout = System.out.println();

                Ustawienia:
                    
                    Skrót do ustawień: ctrl alt s
                    File -> Settings = ustawienia globalne
                    File -> Settings -> Appearance&Behaviour -> Appearance = ustawienia wyglądu (jasny, ciemny)
                    File -> Settings -> Editor -> Font = ustawienia czcionki
                    File -> Settings -> Plugins = wtyczki
                    File -> Settings -> Version Control -> GitHub = ustawienia githuba (dodawanie konta)
                    File -> Settings -> Editor -> Natural Languages = dodawanie słownika polskiego do sprawdzania pisowni
                    File -> Settings -> Editor -> Live templates = dodawanie własnych makr (wzorów)""";
        pw.println(text);
        pw.close();
    }

}
