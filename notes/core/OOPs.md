# Object Oriented Programming

Q) What is OOPs? 
Ans. OOP is a programming paradigm where we design programs around objects that
     represents real-world or conceptual entities.

Object = Characteristics (Data) & Behaviours (Member Functions)

Local Variables | Instance Variables | Reference Variables

**Q. Why there is no default value for local variables but for instance variable in Java?**
Ans. Instance variables are part of an object, and objects state needs to be initialised
when the object is created.
Local variables are used only within a method or block and have a limited scope.
Therefore, java requires local variables to be explicitly initialized before they
are used, preventing accidental use of an uninitialized value.



## Constructors
_Rules for Constructor_
1. Same name as Class.
2. No return type. Not even Void.
3. Automatically called during Object creation
4. Used to initialize an Object
5. It can also be Overloaded

**Mental Model** 

    Student s = new Student();
    new       ---> object creation
    Student() ---> Constructor call 

In Java, Constructor is **Mandatory.** => Default Constructor

Java provide default constructor automatically. 

Default Constructor sirf tabhi banta hai jab aap koi constructor khud se define nahi karte ho.

Agar tumne parameterized constructor bana dia, toh Object creation ke time par tumhe values pass
karne padenge kyonki koi default constructor java provide hi nahi karega. 

Agar value pass karna nahi chahte...toh hum karenge constructor ko **Overload** by creating default constructor manually.

### this keyword 
Referes to the current object - Current Object ke Reference store karta hai
### this() -> used to call other constructors of the same object.

**Q) Can we call constructor manually?**

Ans. No. 

**new** -> It creates object dynamically(at Runtime);