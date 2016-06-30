#Stein Schere Papier

## Verwendeter Techstack
- gradle
- Spring Boot
- Java

## Aufruf über Rest Get Methode mögliche Handzeichen zum auswählen sind:
- Stein
- Papier
- Schere


##Was kann man verbessern:

- Auch den Brunnen ermöglichen durch eine application.properties withFountain=true/false.
- Dann ein Interface fuer GameResult und je nach Einstellung eins nehmen. 

- Enums statt Konstanten

- JUnit Test 

- Random Nummer Generator rausziehen, damit der gut zu Mocken ist für Test

- Übergabe Parameter auch mit @ResponseBody

- Fehlerhandling bei nicht unterstützten Handzeichen/total Fehlertolerant (kann man über HTTP Response machen, oder Redirect zu einem Helptext)

