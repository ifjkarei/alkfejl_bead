# Alkalmazások fejlesztése beadandó
## Készítette:
- Káré István (CG2T21)
- Szabó Barnabás (O7HICZ)
### Csapatnév: SzabóKáré

### Feladat leírása:

A program a Neptun tárgyfelvételi rendszerének egy leegyszerűsített változatát valósítja meg.

#### Feladat funkcionális követelményei:
 ##### Adatbázis
 Az adatbázis-kezelő az órán megismert h2 rendszer használata
 
 ##### Szerveroldal
 Java Spring Boot technológia használata
 REST API
 
 ##### Kliensoldal
 Az órán megismert Angular keretrendszert használja a program (6+ verzió).
 Basic HTTP autentifikáció
 
#### A program nem funkcionális követelményei
 ##### Adatbázis
 A program tartalmaz 4 táblát: Tanárok, Diákok, Tantárgyak, Termek
 Van benne 1-sok kapcsolat: Egy tanár több tantárgyat taníthat
 Tartalmaz sok-sok kapcsolat: Egy diáknak több tárgya lehet, ugyanakkor egy tárgyhoz több diák tartozik
 
##### Szerveroldal
 MVC modell
 authorizált végpontokkal
 
##### Kliensoldal 
 Legalább három tábla adatai szerkeszthetőek a felületen: iákok, tanárok, tárgyak lekérdezése, hozzáadása, törlése
 Az adatokhoz csak hitelesítés (felhasználóné és jelszó megadása) után lehet hozzáférni (autentikáció)
 Az adatokat a különböző szerepkörbe tartozó felhasználók különböző módon érik el (autorizáció)
 A szerverrel AJAX kérésekkel történik a kommunikáció
 
 Ezeken kívül a program tartamazni fog megfelelő tartalmú dokumentációt.
 
 #### Szakterületi fogalomjegyzék
 Java Spring Boot technológia - A program back-endjét megvalósító keretrendszer
 REST API - A REST (Representational State Transfer) egy szoftverarchitektúra típus, segítségével kommunikál a szerver oldal a kliens oldallal.
 Angular keretrendszer - a program front-endjét megvalósító keretrendszer
 Basic HTTP autentifikáció - alap böngészős autentifikáció, amely minden adatbázishoz kötődő kérést hitelesítéshez köt, azaz csak megfelelő felhasználónév és jelszóval tudunk belépni.
 MVC modell - Model View Controler - azaz a program logikája kizárólag a modelben van elhelyezve, a felületi részei a Viewban, ezeket pedig a Controller köti össze.
 
 #### Szerepkörök
 
 Rendszergazda - a program teljes felületéhez hozzáfér, adhat hozzá dákokat, tanárokat, vehet fel tárgyakat, vagy akár törölhet bármit az előzőek közül.
 Tanár - Vehet fel új tantárgyat, és rendelhet diákokat a saját tárgyaihoz, de más tanárt vagy diákot nem adhat hozzá az adatbázishoz.
 Diák - Nem módosíthatja az adatbázisban szereplő adatokat. Lekérdezéseket kezdeményezhet.
 
