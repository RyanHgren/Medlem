# Medlem management system

[RyanHgren](https://github.com/RyanHgren) 
En Spring Boot-webbapplikation som hanterar medlemmar med ett responsivt gränssnitt avsett för skoluppgifter för att demonstrera Spring Boot, ThymeLeaf och webbutveckling. Ryan Hellgren.

## GIT FLOW

Under utvecklingsarbetet började jag planera ett stort projekt, men på grund av tidsbrist var jag tvungen att skala ner det drastiskt. Mina commits och branches användes för att dokumentera vad jag gjorde och hur långt jag hade kommit. Jag började med att testa varje html-fil separat och sedan implementera den, vilket i sin tur tog väldigt lång tid.

## Funktioner
- **Lägg till medlemmar** - Enkelt formulär för att lägga till medlemmar.
- **Visa medlemmar** - Visar alla befintliga medlemmar som är registrerade.
- **Ta bort medlemmar** - Ta bort medlemmar med bekräftelse.
- **Minneslagring** - Medlemmar lagras i applikationens minne.

## Framework

### Backend
- Spring Boot 3.1.5 med Web och Thymeleaf.
- Java med objektorienterad design.
- Maven arkitektur.

### Frontend
-Thymeleaf templates för rendering.
-Custom CSS / Enkel design.
-Beige färgschema.

### Datahantering
- In-memory sorage med ArrayList.

## Felhantering
- Hanterar ogiltiga formulärinmatningar .
- Ganska enkel sida men ändå frågar om man vill verkligen tar bort en skapad medlem. 

## Framtida förbättringar
- Inloggningsida
- Bättre design
- Member statistics (Identity, Mail...)
Jag lade ner alldeles för mycket tid på att planera och prova saker, så när det gällde att faktiskt göra det jag hade i min mindmap, blev jag helt förvirrad och det tog ett tag innan jag ens började med något enkelt. Nästa gång ska jag definitivt börja med de enkla sakerna och skapa en mindmap allt eftersom eftersom jag känner att det fungerar bäst för mig på det sättet.

## Lärendemål
- Visar förbättrad förståelse för Spring Boot.
- Lärde mig mycket av hur man använder Thymeleaf och form binding. 

## Köra projektet
mvn spring-boot:run
http://localhost:8080/hemsida
