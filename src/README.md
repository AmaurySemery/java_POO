L'encapsulation : c'est un principe de développement de classe qui consiste à protéger l'état des attributs et à imposer de passer par des méthodes pour modifier les valeurs des attributs.

```
public class Person {
    // Champs privés
    private String name;
    private int age;

    // Constructeur pour initialiser les champs
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Méthode getter pour le champ name
    public String getName() {
        return name;
    }

    // Méthode setter pour le champ name
    public void setName(String name) {
        this.name = name;
    }

    // Méthode getter pour le champ age
    public int getAge() {
        return age;
    }

    // Méthode setter pour le champ age
    public void setAge(int age) {
        if (age >= 0) { // Validation de l'âge
            this.age = age;
        }
    }
}
```

Un constructeur : une méthode particulière que déclenche automatiquement lors de l'instanciation (de la création) d'un objet. Une classe peut posséder plusieurs constructeurs, mais un objet donné n'aura pu être produit que par un seul constructeur.

```
public class Person {
    private String name;
    private int age;

    // Constructeur par défaut
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Méthode pour afficher les détails de la personne
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

L'abstraction : technique qui cache les détails de l'implémentation, permettant aux programmeurs de se concentrer sur les caractéristiques essentielles d'un objet. Elle améliore l'interaction de l'utilisateur avec le système et protège le code et les données sous-jacents.

```
abstract class Animal {
    // Méthode abstraite (sans implémentation)
    public abstract void makeSound();

    // Méthode concrète (avec implémentation)
    public void eat() {
        System.out.println("This animal is eating");
    }
}
```

Overloading (surcharge) : fonctionnalité qui permet de définir plusieurs méthodes dans la même classe avec le même nom mais avec des paramètres différents (par le nombre, le type ou l'ordre des paramètres). Cela permet à une méthode de se comporter différemment en fonction des arguments qui lui sont passés.L'overloading en Java, ou surcharge en français, est une fonctionnalité qui permet de définir plusieurs méthodes dans la même classe avec le même nom mais avec des paramètres différents (par le nombre, le type ou l'ordre des paramètres). Cela permet à une méthode de se comporter différemment en fonction des arguments qui lui sont passés.

```
public class MathUtils {
    // Méthode add avec deux paramètres int
    public int add(int a, int b) {
        return a + b;
    }

    // Méthode add avec trois paramètres int
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Méthode add avec deux paramètres double
    public double add(double a, double b) {
        return a + b;
    }
}
```

Overriding (redéfinition) : fonctionnalité qui permet à une sous-classe de fournir une implémentation spécifique d'une méthode déjà définie dans sa superclasse. La méthode redéfinie doit avoir la même signature (même nom, mêmes paramètres) et le même type de retour que la méthode de la superclasse.

```
class Animal {
    // Méthode dans la superclasse
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Redéfinition de la méthode makeSound dans la sous-classe
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

Polymorphisme : concept de la programmation orientée objet qui permet d'utiliser une seule interface pour représenter différents types d'objets. Il se manifeste principalement sous deux formes : le polymorphisme à la compilation (surcharge de méthode) et le polymorphisme à l'exécution (redéfinition de méthode).

Exemple par override
```
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

Exemple par overloading
```
class MathOperations {
    // Surcharge de la méthode add avec deux paramètres int
    public int add(int a, int b) {
        return a + b;
    }

    // Surcharge de la méthode add avec trois paramètres int
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Surcharge de la méthode add avec deux paramètres double
    public double add(double a, double b) {
        return a + b;
    }
}
```