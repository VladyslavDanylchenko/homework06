# Homework 06

## Generics. Collections


## Task 01

The goal of this task is to explore the use of Java Generics by developing a Pair class that represents a 2-tuple. 

**Tuple** is a finite ordered sequence of elements. A 2-tuple contains two elements, a 3-tuple contains three elements, 
an n-tuple contains n elements.

A Pair class could be useful any time we need to store data that naturally occurs as an ordered pair: first and last name, 
two-dimensional coordinates, etc.

The challenge in designing this class is that we want to avoid specifying the element types in advance. 
The goal is to develop a single Pair class that may be used to store pairs of objects of any type.

### Object elements

One possible design involves programming the Pair class so that the types of the two elements are declared as `Object`. 

Since every reference type in Java inherits from `Object`, this approach will give us the flexibility we want.

Open the following two classes in IDE:

* [ObjectPair.java](src/main/java/com/softserveinc/task01/ObjectPair.java)
* [ObjectPairDriver.java](src/main/java/com/softserveinc/task01/ObjectPairDriver.java)

Take a few minutes to read the code, then complete the steps below.

1. The provided code compiles, but there is a __logic error__ in the main method that will probably cause the driver to crash 
when `largestStadium` is passed the stadiums array. **Find the problem and fix it.**
2. Complete the `largestStadium` method so that it conforms to the Javadoc comments. Test to make sure that it works as expected. 
(HINT: You will need to perform some casts when you retrieve the items from the tuple.)

### Generics

1. Create a copy of the `ObjectPair` class named `Pair`. Refactor this class to use **Java generics**. Your updated class should 
make it possible to independently specify the types of the first and second elements.
2. Create a copy of the `ObjectPairDriver` class named `PairDriver`. Refactor this driver so that it uses your `Pair` class. 
The functionality should be unchanged. **The resulting code should not include any cast operations.**

**BONUS QUESTION:** What happens if you re-introduce the problem that you fixed in step 1 from the previous section? 
Will the resulting code compile? Why do you think generic collection classes are sometimes called “type-safe” collections?

**BONUS QUESTION:** List some reasons that the Pair class might be preferable to the `ObjectPair` class. Can you think of 
any situations where the `ObjectPair` class might be preferable?

## Task 02

Write a java program that use a shopping list (see the class [ShoppingList](src/main/java/com/softserveinc/task02/ShoppingList.java) 
in package [com.softserveinc.task02](src/main/java/com/softserveinc/task02)) of products and performs the following operations: 
* add an item 
* delete an item in the list
* get count of items
* print the contents of the ArrayList

Note: class [ShoppingList](src/main/java/com/softserveinc/task02/ShoppingList.java) should have the private field named `items`
type of `ArrayList<String>`

## Task 03

In this task, you will experiment with maps and sets in Java.

Open a class named [MapSetTester](src/main/java/com/softserveinc/task03/MapSetTester.java) with a main method.

You will be using the `TreeSet` and `HashMap` classes, so open up the Java API so you can refer to the documentation for 
these classes as you work on these problems. 

In your `main` method, create a `HashMap` named `networkMap` that maps a TV network to the television shows from that network. 
That is `HashMap` will contain pairs where the key is a TV network name and the associated value is a `TreeSet` that 
contains television shows from that network:

```java
    Map<String, Set<String>> networkMap = new HashMap<>();
``` 

The loop reads the name of a television network and then the name of a TV show on that network from a file. Add the 
network and show to the hash map. That is, find the network in the hash map.

If the network is not in the hash map yet, create a tree set with the name of the television show in it, and then add the 
`key, value` pair (network, set with 1 show) to the hash map.

If the network is in the hash map, add the television show to the tree set for that network. 

After you update the hash map, output the contents of the hash map (i.e. `System.out.println(networkMap);` ). 
This will repeat until 10 shows have been entered.

Sample Output (note how the networks are not necessarily in lexicographic order, but the television shows for each 
network are in lexicographic order... why? ):

```
{FOX=[The Simpsons]}

TV show on NBC: ER
{FOX=[The Simpsons], NBC=[ER]}

TV show on ABC: 20/20
{ABC=[20/20], FOX=[The Simpsons], NBC=[ER]}

TV show on CBS: Survivor
{ABC=[20/20], CBS=[Survivor], FOX=[The Simpsons], NBC=[ER]}

TV show on ABC: Lost
{ABC=[20/20, Lost], CBS=[Survivor], FOX=[The Simpsons], NBC=[ER]}

TV show on FOX: Family Guy
{ABC=[20/20, Lost], CBS=[Survivor], FOX=[Family Guy, The Simpsons], NBC=[ER]}

TV show on CBS: CSI
{ABC=[20/20, Lost], CBS=[CSI, Survivor], FOX=[Family Guy, The Simpsons], NBC=[ER]}

TV show on FOX: American Idol
{ABC=[20/20, Lost], CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER]}

TV show on ABC: Desperate Housewives
{ABC=[20/20, Desperate Housewives, Lost], CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER]}

TV show on NBC: Law And Order
{ABC=[20/20, Desperate Housewives, Lost], CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER, Law And Order]}
```

Once you have your hash map set up, write and call a method that prints the contents of the hash map in alphabetical order 
by network, one network per line.

Create an array list initialized with the set of keys of the hash map. (HINT: The `keySet` method of the `HashMap` class 
returns a set of the keys and the `ArrayList` has a constructor that allows you to initialize the array list using a collection 
(and a set is a collection)).

Sort the array list. You can do this in one line.

Iterate over the (sorted) array list of keys, get the corresponding value (set of TV shows) for each key from the hash
 map and print them out. (Note: You won't have to sort the TV shows for the network since they'll already be sorted... why?) 

Sample output:

```
ABC: [20/20, Desperate Housewives, Lost]
CBS: [CSI, Survivor]
FOX: [American Idol, Family Guy, The Simpsons]
NBC: [ER, Law And Order]
```

Complete your tester by writing a loop that asks the user to enter a TV show and then outputs the network that maps to 
that TV show, if any. Otherwise report "UNKNOWN". Repeat until the user enters an empty string.

HINT: Write a method that uses the map to lookup the network for a TV show: Iterate over each key (network) in the map, 
and see if its value (set of shows) contains the desired show. If so, return the network. If the TV show is not in the 
map return null. You don't have to worry about uppercase/lowercase, just match the TV show name exactly. 



