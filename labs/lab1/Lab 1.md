# Lab 1 - Tärningsspel

## Godkänt-del

### Die
I den första delen av uppgiften skall vi modellera en tärning med hjälp av en klass Die. Vi skall sedan använda den här tärningsklassen för att skapa ett enkelt tärningsspel. 
Tärningen skall ha två variabler: nuvarande värde och antal sidor (dvs max-värde för tärningen). 

Antal sidor skall sättas i klassens konstruktor. Skall vara av typen <code>int</code> och ha en enkel gettermetod. Nuvarande värde skall förändras när man kallar på <code>roll()</code>-metoden (se nedan). Skall vara av typen <code>int</code> samt ha en getter-metod.

Tärningen skall också ha en slumpgenerator som privat klassvariabel. Slumpgeneratorn skall vara av typen <code>Random</code> och kommer att användas i vår <code>roll()</code>-metod. Typen Random kan importeras från <code>java.util.Random</code>.

För att kunna använda klassen kommer vi att behöva en metod: <code>public void roll()</code>. Den här metoden skall använda sig av slumpgeneratorn för att förändra tärningens nuvarande värde. <i>Tips</i>: ni bör använda standardklassen <code>Random</code> för detta. Random har en metod <code>public int nextInt(int maxValue)</code> som returnerar ett slumpmässigt heltal mellan 0 och (maxValue-1).
 
<h3> Player </h3>
För att kunna göra ett simpelt tärningsspel skall vi nu också skapa en klass <code>Player</code> för att representera en spelare. 
En spelare skall ha tre instansvariabler: ett namn, en poäng och en tärning. Namnet skall sättas i klassens konstruktor-metod samt ha en enkel gettermetod. Poängen skall ha getter- och setter-metoder. Tärningen är vad spelaren kommer att använda för att spela tärningsspelet. Skall vara av typen <code>Die</code>.

En spelare skall också ha ett antal metoder: 
<ul>
<li><code>rollDice()</code>: Skall rulla spelarens tärning.</li>

<li><code>getDieValue()</code>: Skall returnera värdet på spelaren tärning i form av ett heltal.</li>

<li><code>increaseScore()</code>: Skall öka spelarens poäng med ett. </li>

<li><code>addDie()</code>: Skapar en ny tärning och lägger till den till spelaren.</li>
</ul>


<h3> DiceGame </h3>
Vi skall nu skapa vårt enkla tärningsspel. Skapa en ny klass DiceGame. Denna klass skall kunna köras, så vi behöver en main()-metod. Nedan följer en beskrivning av hur spelet ska se ut, samt några metoder ni ska skapa. Ni måste sedan själva skriva main-metoden utifrån den här informationen, dvs ni måste klura ut hur allting hänger ihop själva!
<h3> Beskrivning av spelet: </h3>
Programmet frågar först hur många omgångar som skall spelas, samt hur många sidor tärningen har. Det frågar sedan efter namnet på spelaren. Använd er av ett <code>Scanner</code>-objekt för att ta input från spelaren via terminalen. Ni kan anta att användaren matar in korrekta värden, dvs ni behöver ej ha med felhantering. Varje omgång består av att spelaren gissar på ett värde och sedan rullar sin tärning. Om värdet spelaren gissade på är lika med värdet på tärningen, så får spelaren en poäng. 

<h2> Extra utmaning 1 - MultiplayerDiceGame </h2>
För den som vill ha en extra utmaning skall ni skriva om <code>DiceGame</code> till det något mer avancerade <code>MultiplayerDiceGame</code>. I MultiplayerDiceGame skall det gå att ställa in antalet spelare. Spelet skall också kunna spelas med ett valfritt antal tärningar. Varje omgång går ut på att spelarna slår alla sina tärningar i tur och ordning. Spelarna får därefter poäng enligt det sammanlagda värdet av deras tärningar. (Notera att reglerna är annorlunda för det här spelet!)

<h3> Hjälpmetoder </h3>
<ul>
<li><code>private static ArrayList&ltPlayer> initialize();</code>: Skall initialisera spelet genom att ta emot användarinput och skapa alla instanser som behövs, samt en lista av spelare som sedan returneras. </li>
<li><code>private static void takeTurn(ArrayList&ltPlayer> players);</code>: Skall ta emot en lista av spelare och spela färdigt en hel omgång. Den skall gå igenom listan av spelare, rulla varje spelares tärningar, och summera resultatet för varje omgång. </li>
<li><code>private static ArrayList&ltPlayer> getWinners(ArrayList&ltPlayer> players);</code>: Tar emot en lista av spelare och skall returnera en lista med vinnare. En vinnare är man om man har mest poäng. Vi har en lista eftersom flera spelare kan vinna, då flera spelare kan ha samma poäng. </li>
</ul>


<h2> Extra utmaning 2 - PigGame</h2>
I den här uppgiften skall vi skapa ett nytt tärningsspel som heter Pig. Spelet går ut på följande
sätt:
Spelet kan spelas med två eller fler spelare. Varje spelare har en sex-sidig tärning. Alla spelarna
kommer sedan i tur och ordning få rulla på sin tärning.
Vid en spelares skall den först rulla sin tärning. Resultatet på tärningen läggs till en pott för den
här turen. Spelaren får nu ett val att stanna eller fortsätta. Om spelaren stannar läggs potten till
dess totala poäng och turen går vidare till nästa spelare. Väljer spelaren att fortsätta rulla, får
den rulla tärningen igen och addera resultatet till potten. Spelaren får nu göra samma val igen.
Dock, om spelare skulle någon gång rulla en etta, försvinner alla poäng som ligger i potten och
turen går över till nästa spelare.
Den första spelaren som når upp till en totalpoäng av 100 vinner spelet.