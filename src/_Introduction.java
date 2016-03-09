
public class _Introduction {

}

/*
 
GitHub s³u¿y nie tylko do przechowywania kodu Ÿród³owego, ale jest tak¿e wyposa¿ony
w zaawansowane narzêdzia umo¿liwiaj¹ce definiowanie wymogów projektu,
jak równie¿ omawianie i analizowanie aplikacji. 
 
Dokumentowanie wymogów projektowych
Dziêki funkcji Issues (problemy) mo¿esz dokumentowaæ b³êdy albo opisywaæ
nowe funkcje, które chcia³byœ, aby zosta³y opracowane przez zespó³. 
 
Feature (topic) branch - Za ka¿dym razem, gdy pracujesz nad now¹ funkcj¹, powinieneœ utworzyæ
dla niej osobn¹ ga³¹Ÿ. 
 
Release branch - Jeœli projekt podlega rêcznej (nieautomatycznej) kontroli jakoœci b¹dŸ
te¿ jeœli musisz zapewniaæ wsparcie dla starszych wersji projektu, mo¿esz
potrzebowaæ ga³êzi jego poszczególnych wydañ do wprowadzania zmian i aktualizacji. 
 
 Pull request (zg³oszenie)
Pocz¹tkowo narzêdzie Pull request s³u¿y³o do sformu³owania proœby
o zweryfikowanie zmian wprowadzonych w danej ga³êzi i scalenie ich
z ga³êzi¹ g³ówn¹. Obecnie czêsto jest ono u¿ywane na wczeœniejszym
etapie prac w celu zapocz¹tkowania dyskusji o potencjalnych, nowych
funkcjach. Przyk³ad u¿ycia: Wyœlij zg³oszenie dotycz¹ce nowej funkcji g³osowania,
¿eby sprawdziæ, co na ten temat s¹dzi reszta zespo³u.
 
Proces kopiowania repozytorium na
komputer lokalny jest nazywany klonowaniem. 
 
Fork (rozga³êzienie projektu, rozwidlenie, fork)
Niekiedy nie bêdziesz mieæ uprawnieñ do wprowadzania zmian bezpoœrednio
w repozytorium. Mo¿e tak byæ na przyk³ad w wypadku
programu open source, tworzonego przez osoby, których nie znasz,
b¹dŸ projektu realizowanego przez inny zespó³ w Twojej firmie, z którym
zwykle nie wspó³pracujesz. Jeœli chcesz wprowadziæ zmiany w takim
projekcie, musisz najpierw utworzyæ jego kopiê na w³asnym koncie
GitHub. Ten proces jest nazywany rozwidlaniem albo rozga³êzianiem ca³ego
repozytorium (ang. forking)2. Takie repozytorium mo¿na nastêpnie sklonowaæ,
wprowadziæ w nim zmiany i wys³aæ je z powrotem za poœrednictwem
zg³oszenia (pull request). Przyk³ad u¿ycia: Chcia³bym zobaczyæ
stronê g³ówn¹ ze zmodyfikowanym tekstem marketingowym. Zrób fork repozytorium
i wyœlij zg³oszenie z proponowanymi zmianami. 
 
 
Jeœli w folderze root projektu znajduje siê plik o nazwie README.md, to
jego zawartoœæ zostanie wyœwietlona pod list¹ folderów i plików na stronie
g³ównej tego projektu. Wspomniany plik zawiera ogólne omówienie projektu
oraz pomocnicze informacje, które mog¹ siê przydaæ jego wspó³autorom,
takie jak sposób instalacji oprogramowania albo uruchomienia testów,
dopuszczalne zastosowanie kodu i mo¿liwe rodzaje wspó³pracy. 
 
Puls - stanowi podsumowanie bie¿¹cej aktywnoœci.
 
Wykres typu „karta perforowana”, pozwala oszacowaæ, o jakiej porze dnia i w jakich dniach wprowadzono najwiêcej
zmian. 
 
Wykres sieciowy przydaje siê do oszacowania postêpów prac w danej ga³êzi
i daje pewien pogl¹d na rodzaj zadañ wykonywanych przez wybranego
cz³onka zespo³u w obrêbie jego forka. 
 
Jeœli chcia³bym przenieœæ dany plik w górê drzewa folderów, powinienem zacz¹æ
od wpisania znaków ../ w polu przeznaczonym na nazwê pliku. 
 
Jeœli chodzi o foldery, to warto zacz¹æ od tego, w jaki sposób Git je traktuje
— otó¿… ignoruje je! Z tego wzglêdu nie da siê dodaæ do projektu folderu, jeœli nie bêdzie on od razu zawiera³ co
najmniej jednego pliku. 
 
Czêsto stosowan¹ metod¹ jest tworzenie pustego pliku o nazwie .gitkeep
w dowolnym folderze, który chcia³byœ utworzyæ, ale w takim, w którym na
razie nie zamierzasz przechowywaæ plików. To rozwi¹zanie wydaje siê trochê
dziwne, lecz jest skuteczne i sta³o siê doœæ powszechne; jeœli wiêc bêdziesz
kiedyœ chcia³ utworzyæ pusty folder, po prostu umieœæ w nim plik .gitkeep . 
 
W GitHubie nie da siê jednak zwyczajnie zmieniæ nazwy folderu. Trzeba zmieniæ nazwy
wszystkich plików w tym folderze po kolei, przenosz¹c je jednoczeœnie do
nowego folderu. 
 
Obecnie GitHub nie pozwala na przyk³ad na zmianê nazwy folderu albo
zmodyfikowanie kilku plików w ramach jednej zmiany (commit). Serwis
WWW jest te¿ pozbawiony narzêdzi Gita s³u¿¹cych do edytowania historii
repozytorium i nie pozwala na rozwi¹zywanie konfliktów online.Jeœli wiêc
jakieœ zg³oszenie koliduje z innym, ktoœ bêdzie musia³ pobraæ kopiê repozytorium
(sklonowaæ je), wprowadziæ zmiany i przes³aæ ca³oœæ z powrotem
do GitHuba.
 
 Jeœli po utworzeniu zg³oszenia chcia³byœ uzyskaæ opinie na jego temat od
konkretnych osób z zespo³u, musisz o nich „wspomnieæ” przy u¿yciu znaku
@ i nazwy u¿ytkownika (jest to tzw. wzmianka, ang. at mention).
 
Jeœli wprowadzisz zmianê, która odwo³uje siê do jakiegoœ problemu albo
naprawia opisany w nim b³¹d, wstaw znak krzy¿yka (#) z numerem tego
problemu w komentarzu do zmiany. Taka zmiana bêdzie wyœwietlana
w historii danego problemu. Jeœli dana zmiana rozwi¹zuje problem, a Ty
poprzedzisz jego numer s³owem kluczowym, takim jak closes, fixes albo
resolves, to gdy ta zmiana zostanie w³¹czona do ga³êzi domyœlnej projektu
(zwykle master), problem zostanie automatycznie zamkniêty. 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 8
 */