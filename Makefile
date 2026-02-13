all: main
	
main: main.o
	g++ main.o -o main

main.o: main.cpp
	g++ -Wall -Wextra -c main.cpp

clean:
	rm -f *.o main
