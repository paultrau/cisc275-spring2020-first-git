# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

List<Dog> dogs = new ArrayList<Dog>();
new Dog("Fido", 4)
new Dog("Fido", 3)
new Dog("Alfie", 4)
new Comparator<Animal>

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

The comparator constructor is called inside the Sort() function. The comparator object is instantiated inside the parameters explicitly.

The Comparator class only contains the compare() function which is overridden right after the sort() function is called inside the main class.