# QA Report


# Lines of Code:
filename  |	language  |	code  |	comment  |	blank |	total  

calculator-java-main/Calculator.java |	Java | 129 | 5 | 54 | 188  
calculator-java-main/Start.java	| Java | 19 |	0 | 7 | 26


# Ciklomatska Kompleksnost
Function Name |	Start Line | End Line | Cyclomatic Complexity   

Calculator::Operations::Operations | 15 | 16 | 1
Calculator::Operations::ToString | 18 |	20 | 1
Calculator::Run | 24 | 26 |	1
Calculator::evaluateExpression | 28 | 72 | 12
Calculator::Calculate |	74 | 186 | 12
Start::main | 5 | 24 | 3

Calculator.java kognitivna kompleksnost: 29.


## Izveštaj statičke analize koda:

# Calculator.java: 
- Linija 6: Nedefinisani modifikator pristupa za promenljivu finalResult
- Linija 8-17: Klasa Operations sadrži samo statičke metode.
- Linija 18: Promeniti ime metode "ToString" da se izbegne prepletanje sa postojecom Java "toString" metodom
- Linija 25-29: Nepotreban catch blok jer nema konkretnih akcija u slučaju greške.
- Linija 35: Neiskorišćena promenljiva 'textResult'.
- Linija 52-156: Dugačka metoda 'Calculate', preko 100 linija koda, što može otežati održavanje i razumevanje koda.
- Linija 102-103, 117-118, 122-123, 131-132: Kod se ponavlja u više delova metode 'Calculate', što ukazuje na potencijalno dupliranje koda.
- Linija 98-158: Metoda 'Calculate' koristi rekurzivne pozive što može biti teško za razumevanje i može dovesti do neočekivanih rezultata u nekim slučajevima. 

# Start.java
- Linija 8: Nedefinisani modifikator pristupa za promenljivu 'active'.
- Linija 12: Nepotrebno otvaranje novog Scanner objekta pri svakoj iteraciji petlje.

# Opšti zaključak:
Projekat sadrži nekoliko potencijalnih problema i code smell-ova koji bi trebali biti ispravljeni kako bi se poboljšala čitljivost, efikasnost i održivost koda. Takođe, preporučuje se dodatno razmatranje organizacije koda, izdvajanje ponavljajućeg koda u funkcije i razmatranje alternativnih pristupa rekurzivnim rešenjima.

