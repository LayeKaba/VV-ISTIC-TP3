# On assertions

Answer the following questions:

1. The following assertion fails `assertTrue(3 * .4 == 1.2)`. Explain why and describe how this type of check should be done.

2. What is the difference between `assertEquals` and `assertSame`? Show scenarios where they produce the same result and scenarios where they do not produce the same result.

3. In classes we saw that `fail` is useful to mark code that should not be executed because an exception was expected before. Find other uses for `fail`. Explain the use case and add an example.

4. In JUnit 4, an exception was expected using the `@Test` annotation, while in JUnit 5 there is a special assertion method `assertThrows`. In your opinion, what are the advantages of this new way of checking expected exceptions?


## Answer

1. L'assertion est echoue car  l'un des deux membres de l'assertion est un flotant et l'a. pour palier à ce probleme.  
    on peut resoudre ce souci en ajoutant un troisieme parametre  pour dire l'ecart accepté entre les deux nombres (un Delta) lors d'un assertEqual: `assertEquals(3 * .4 , 1.2, 0.00001)`.

2. La difference est que 
 - `assertEquals()` compare les valeurs 
 - `assertSame()`   compare les references 
 
Scéanrio même résultat : 

```java
List<String> a = new List<>(); 
List<String> b = a;
assertEquals(a, b); //true
assertSame(a, b); //true
```

Scénario résultat différent :
```java
int a = 2; 
int b = 2;
assertEquals(a, b); //true
assertSame(a, b); //false
```

3. La méthode `fail()` de JUnit peut être utilisée si le test n'est pas complet.  
Par exemple :  
```java
@Test
public void test() {
    fail("test à completer");
}
```
