package g_Schleifen;

public class d_verschachtelteSchleifen {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {           //äußere for-Schleife

            for (int j = 1; j < 4; j++) {       //innere for-Schleife
                System.out.println("Hey, listen ");
                
            }
            System.out.println();
        }

        System.out.println("Watch out!");
    }
}

/* Wir können alle Schleifen ineinander verschachteln und so miteinander verknüpfen
*MERKE: die festgelegten Variablen sind nur innerhalb des Codeblocks (innerhalb von {}) gültig
wenn wir also ausserhalb der inneren for-Schleife versuchen den Wert von j auszugeben, wird eine fehlermeldung erscheinen,
da die Variable nur innerhalb der inneren for_Schleife definiert ist! 
Um dieses zu umgehen, kann man die Schleifensteuerungsvariablen außerhalb/über den for-Schleifen deklarieren, falls man die Zahlen z.B. für eine Aufzählung benötigt.
-------------------------------------------------------------------
 * Im oben geschriebenen Code ist der Ablauf wie folgt:
 * 
 * Wenn i kleiner als 4 ist (beginnend mit 1) wird der Codeblock innerhalb der äußeren for-Schleife ausgeführt (also die innere for-Schleife), dann addiere 1 zu i 
 * in der Inneren for-Schleife ist die anweisung
 * Wenn j kleiner als 4 ist (beginnend mit 1) dann gib im Teminal "Hey, listen " aus, dann addiere 1 zu j
 * die innere for-Schleife wird nun 3 mal ausgeführt (bis die bedingung j < 4 nicht mehr erfüllt ist) und gibt somit 3 Mal den String "Hey, listen " aus
 * da nun die innere for-Schleife abgearbeitet ist, springt der Code wieder zur äußeren for-Schleife und da i immernoch < 4 ist (gerade ist i = 2) 
 * wird der oben genannte Vorgang wiederholt, bis die Bedingung i < 4 nicht mehr erfüllt ist, also insgesamt 3 mal 
 * dadurch ergibt sich 3 man die Ausgabe von 3 mal "Hey, listen"

 * edit: Die äußere Schleife läuft 3 mal. Für jeden dieser 3 Schritte läuft die innere Schleife 1 mal. Die innere Schleife läuft 3 mal und gibt bei jedem Schritt 1 mal "Hey listen" aus.
 * insgesamt wird also 3 * 3 "Hey listen" ausgegeben. (äußere Schleife = 3 Durchläufe) * (innere Schleife = 3 Durchläufe)

 
 */
