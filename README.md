# Fantasy City Generator
Is a generator I am starting to tinker around with to produce fantasy cities for games such as DnD.
When it is finished it will produce cities with races including elves, dwarves, humans, etc.
Ideally when it is finished it will also produce simplified histories including founders and wars it has helped fight in.
## Installation
As it stands there is no need to install any other materials except that it uses Netbeans metadata.
You will need Netbeans to properly work with the program the way it is implemented.
## Usage 

As it stands it has 3 classes.

City generator asks the user which type of city they want to generate.
If they choose elven it will use the ElvenCity class, generating the information and printing it.
The other ones are not implemented so it will not produce a response then.

The CityMaker class is merely an abstract class for all the other city classes to inherit. 
It has things that manipulate classes that inherit it, such as changing the number of people of each race.

The ElvenCity generator contains a list of Elven sounding prefixes and another list of similar sounding suffixes. 
It will then pull a random one of each and tether them together to make a name for a city.

