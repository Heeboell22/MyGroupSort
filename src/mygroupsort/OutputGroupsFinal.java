/*
 * Denne klasse indeholder de objekter, der skal udskrives som produkt af Sorteringen, der er tale om en ArrayListe af 
GruppeLister, der bliver konstrueret i den forrige klasse. Dermed kan man sige, at der er tale om en ArrayListe af en 
ArrayListe.
Der er tale om 3 trin for at kunne konstruere denne gruppes objekter, som så udprintes:

1. En klasse, der fortæller Systemet, hvad en 'gruppe' er for noget - hvad er det den indeholder? Den er egentlig mest til,
for at kunne opsætte nogle getters og setters som skal tage indput fra brugeren fra brugergrænsefladen. Mere specifikt er 
der tale om 'Gruppe-størrelse', og 'Samlede antal elever, der skal sorteres'. Her skal brugeren så definere, hvilke data, der 
skal indlæses fra databasen, og på UI angive, hvem, der skal udgå af listen. - 'Klasse-listen er derfor en Array-Liste, der in-
deholder int id'er og String elevnavne.  - I praksis er der tale om at man laver en 'klasse', som man så sorterer. 

2. Derfor også en Arrayliste her.... 

3. Som et kinesisk æske system kan skal der i den næste klasse ListOfGroups klassen være en constructor for en ArrayListe
af elev-objekter. - Der skal laves et En ArrayListe for hver gruppe, der skal laves. - Men men men, da det ikke er sikkert, at 
der er lige mange elever i alle grupper (fordelingen jeg lavede i testklassen), så bliver man nødt til at lave en metode til at 
beregne det. En metode, der bestemmer antallet af grupper, der skal laves, og antallet af de elever, der skal indgå i hver 
gruppe. Det kan betyde, at man bliver nødt til at to Arrays - eller ArrayLister. Den ene liste med det brugervalgte antal 
elever, og en enkelt med et system-udregnet. 

Der skal en metode i denne klasse til at generere disse grupper...

Og en metode til at randomisere navne/id'er

Og en metode til at filtrere resultatet, således at undtagelserne ikke optræder.... Disse undtageler er OGSÅ ArrayLister
sørme...

Og så en metode til at generere et resulatat, hvor undgå-undtagelserne ikke forekommer, og skal undtagelserne forekommer
der kan blive tale om en metode, der kalder sig selv i en for-loop.

skal bruges i den næste klasses metoder: 

 */
import java.util.ArrayList;

package mygroupsort;

/*
 * Inger Heebøll Gemzøe
 */
public class OutputGroupsFinal extends  {

    ArrayList StudentsToBeSorted;

    ArrayList OutputGroupsFinal;

}

//Constrctor for StudentsToBeSorted:
OutputGroupsFinal[] 

For (int i = 0; i < OutputGroupsFinal.length; i++) {
System.out.print(gid);
System.out. print( " " + for (int n = 0; n < ListOfGroups.Length))
}
