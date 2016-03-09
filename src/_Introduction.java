
public class _Introduction {

}

/*
 
GitHub s�u�y nie tylko do przechowywania kodu �r�d�owego, ale jest tak�e wyposa�ony
w zaawansowane narz�dzia umo�liwiaj�ce definiowanie wymog�w projektu,
jak r�wnie� omawianie i analizowanie aplikacji. 
 
Dokumentowanie wymog�w projektowych
Dzi�ki funkcji Issues (problemy) mo�esz dokumentowa� b��dy albo opisywa�
nowe funkcje, kt�re chcia�by�, aby zosta�y opracowane przez zesp�. 
 
Feature (topic) branch - Za ka�dym razem, gdy pracujesz nad now� funkcj�, powiniene� utworzy�
dla niej osobn� ga���. 
 
Release branch - Je�li projekt podlega r�cznej (nieautomatycznej) kontroli jako�ci b�d�
te� je�li musisz zapewnia� wsparcie dla starszych wersji projektu, mo�esz
potrzebowa� ga��zi jego poszczeg�lnych wyda� do wprowadzania zmian i aktualizacji. 
 
 Pull request (zg�oszenie)
Pocz�tkowo narz�dzie Pull request s�u�y�o do sformu�owania pro�by
o zweryfikowanie zmian wprowadzonych w danej ga��zi i scalenie ich
z ga��zi� g��wn�. Obecnie cz�sto jest ono u�ywane na wcze�niejszym
etapie prac w celu zapocz�tkowania dyskusji o potencjalnych, nowych
funkcjach. Przyk�ad u�ycia: Wy�lij zg�oszenie dotycz�ce nowej funkcji g�osowania,
�eby sprawdzi�, co na ten temat s�dzi reszta zespo�u.
 
Proces kopiowania repozytorium na
komputer lokalny jest nazywany klonowaniem. 
 
Fork (rozga��zienie projektu, rozwidlenie, fork)
Niekiedy nie b�dziesz mie� uprawnie� do wprowadzania zmian bezpo�rednio
w repozytorium. Mo�e tak by� na przyk�ad w wypadku
programu open source, tworzonego przez osoby, kt�rych nie znasz,
b�d� projektu realizowanego przez inny zesp� w Twojej firmie, z kt�rym
zwykle nie wsp�pracujesz. Je�li chcesz wprowadzi� zmiany w takim
projekcie, musisz najpierw utworzy� jego kopi� na w�asnym koncie
GitHub. Ten proces jest nazywany rozwidlaniem albo rozga��zianiem ca�ego
repozytorium (ang. forking)2. Takie repozytorium mo�na nast�pnie sklonowa�,
wprowadzi� w nim zmiany i wys�a� je z powrotem za po�rednictwem
zg�oszenia (pull request). Przyk�ad u�ycia: Chcia�bym zobaczy�
stron� g��wn� ze zmodyfikowanym tekstem marketingowym. Zr�b fork repozytorium
i wy�lij zg�oszenie z proponowanymi zmianami. 
 
 
Je�li w folderze root projektu znajduje si� plik o nazwie README.md, to
jego zawarto�� zostanie wy�wietlona pod list� folder�w i plik�w na stronie
g��wnej tego projektu. Wspomniany plik zawiera og�lne om�wienie projektu
oraz pomocnicze informacje, kt�re mog� si� przyda� jego wsp�autorom,
takie jak spos�b instalacji oprogramowania albo uruchomienia test�w,
dopuszczalne zastosowanie kodu i mo�liwe rodzaje wsp�pracy. 
 
Puls - stanowi podsumowanie bie��cej aktywno�ci.
 
Wykres typu �karta perforowana�, pozwala oszacowa�, o jakiej porze dnia i w jakich dniach wprowadzono najwi�cej
zmian. 
 
Wykres sieciowy przydaje si� do oszacowania post�p�w prac w danej ga��zi
i daje pewien pogl�d na rodzaj zada� wykonywanych przez wybranego
cz�onka zespo�u w obr�bie jego forka. 
 
Je�li chcia�bym przenie�� dany plik w g�r� drzewa folder�w, powinienem zacz��
od wpisania znak�w ../ w polu przeznaczonym na nazw� pliku. 
 
Je�li chodzi o foldery, to warto zacz�� od tego, w jaki spos�b Git je traktuje
� ot� ignoruje je! Z tego wzgl�du nie da si� doda� do projektu folderu, je�li nie b�dzie on od razu zawiera� co
najmniej jednego pliku. 
 
Cz�sto stosowan� metod� jest tworzenie pustego pliku o nazwie .gitkeep
w dowolnym folderze, kt�ry chcia�by� utworzy�, ale w takim, w kt�rym na
razie nie zamierzasz przechowywa� plik�w. To rozwi�zanie wydaje si� troch�
dziwne, lecz jest skuteczne i sta�o si� do�� powszechne; je�li wi�c b�dziesz
kiedy� chcia� utworzy� pusty folder, po prostu umie�� w nim plik .gitkeep . 
 
W GitHubie nie da si� jednak zwyczajnie zmieni� nazwy folderu. Trzeba zmieni� nazwy
wszystkich plik�w w tym folderze po kolei, przenosz�c je jednocze�nie do
nowego folderu. 
 
Obecnie GitHub nie pozwala na przyk�ad na zmian� nazwy folderu albo
zmodyfikowanie kilku plik�w w ramach jednej zmiany (commit). Serwis
WWW jest te� pozbawiony narz�dzi Gita s�u��cych do edytowania historii
repozytorium i nie pozwala na rozwi�zywanie konflikt�w online.Je�li wi�c
jakie� zg�oszenie koliduje z innym, kto� b�dzie musia� pobra� kopi� repozytorium
(sklonowa� je), wprowadzi� zmiany i przes�a� ca�o�� z powrotem
do GitHuba.
 
 Je�li po utworzeniu zg�oszenia chcia�by� uzyska� opinie na jego temat od
konkretnych os�b z zespo�u, musisz o nich �wspomnie� przy u�yciu znaku
@ i nazwy u�ytkownika (jest to tzw. wzmianka, ang. at mention).
 
Je�li wprowadzisz zmian�, kt�ra odwo�uje si� do jakiego� problemu albo
naprawia opisany w nim b��d, wstaw znak krzy�yka (#) z numerem tego
problemu w komentarzu do zmiany. Taka zmiana b�dzie wy�wietlana
w historii danego problemu. Je�li dana zmiana rozwi�zuje problem, a Ty
poprzedzisz jego numer s�owem kluczowym, takim jak closes, fixes albo
resolves, to gdy ta zmiana zostanie w��czona do ga��zi domy�lnej projektu
(zwykle master), problem zostanie automatycznie zamkni�ty. 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 8
 */