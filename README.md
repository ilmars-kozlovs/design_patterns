# design_patterns
homework for design patterns

Traffic console app using several design patterns

Patterns used in app - 
<br>
Creational patterns - Abstract factory
<br>
Structural patterns - Decorator
<br>
Behavioural patterns - Observer, Iterator, Composite
<br>
Short description - There are 4 types of classes - Car, Bus, Bike, Minivan that are created in TrafficFactory class using AbstractFactory pattern. Composite pattern is responsible for putting all objects into one list of vehicles, called TrafficCity. Iterator pattern, that's implemented in TrafficCity class is responsible for accessing members within the List.
Observer pattern is responsible for updating the state of object, when vehicles are created.  Decorator pattern is counting number of vehicles in traffic.
