# Mars Rovers

Este projeto é a solução para o problema Mars Rovers.

O projeto foi desenvolvido utilizando:
- [Java](https://www.java.com/pt_BR/);
- [Maven](https://maven.apache.org/);
- [JUnit](http://junit.org/).

### Dependências ###

As seguintes dependências são necessárias:

- [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Maven](https://maven.apache.org/)

### Testes automatizados ###

Acesse a pasta de seu projeto por linha de comando;

Execute os testes da aplicação com o comando:

    mvn test


### Compilando e executando a aplicação ###

Acesse a pasta de seu projeto por linha de comando;

Compile o projeto com o Maven:

    mvn package

Execute a aplicação:

    java -jar target/mars-rovers.jar

Digite os comandos de entrada para o Rover;



## O problema Mars Rovers ##
A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is
curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a
complete view of the surrounding terrain to sen. back to Earth.
A rover's position and location is represented by a combination of x and y co-ordinates and a letter
representing one of the four cardinal compass points. The plateau is divided up into a grid to
simplify navigation. Na example position might be 0, 0, N, which means the rover is in the bottom
left corner and facing North.
In order to control a rover, NASA sends a simple estringi of letters. The possible letters are 'L', 'R'
and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from
its current spot. 'M' means move forward one grid point, and maintain the same heading. 

# Input #

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates
are assumed to be 0,0.
The rest of the input is information pertaining to the rovers that have been deployed. Each
rover has two lines of input. The first line gives the rover's position, and the second line is a
series of instructions telling the rover how to explore the plateau.
The position is made up of two integers and a letter separated by spaces, corresponding to the
x and y co-ordinates and the rover's orientation.
Each rover will be finished sequentially, which means that the second rover mont. start to
move until the first one has finished moving.

# Output #

The output for each rover should be its final co-ordinates and heading.

# Input and Output #

Test Input:
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM 

# Expected Output #
1 3 N
5 1 E 
