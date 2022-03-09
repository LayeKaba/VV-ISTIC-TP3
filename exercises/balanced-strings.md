# Balanced strings

A string containing grouping symbols `{}[]()` is said to be balanced if every open symbol `{[(` has a matching closed symbol `]}` and the substrings before, after and between each pair of symbols is also balanced. The empty string is considered as balanced.

For example: `{[][]}({})` is balanced, while `][`, `([)]`, `{`, `{(}{}` are not.

Implement the following method:

```java
public static boolean isBalanced(String str) {
    ...
}
```

`isBalanced` returns `true` if `str` is balanced according to the rules explained above. Otherwise, it returns `false`.

Use the coverage criteria studied in classes as follows:

1. Use input space partitioning to design an initial set of inputs. Explain below the characteristics and partition blocks you identified.
2. Evaluate the statement coverage of the test cases designed in the previous step. If needed, add new test cases to increase the coverage. Describe below what you did in this step.
3. If you have in your code any predicate that uses more than two boolean operators check if the test cases written so far satisfy *Base Choice Coverage*. If needed add new test cases. Describe below how you evaluated the logic coverage and the new test cases you added.
4. Use PIT to evaluate the test suite you have so far. Describe below the mutation score and the live mutants. Add new test cases or refactor the existing ones to achieve a high mutation score.

Write below the actions you took on each step and the results you obtained.
Use the project in [tp3-balanced-strings](../code/tp3-balanced-strings) to complete this exercise.

## Answer

 1. Pour nos blocs de tests, nous sommes partis des cas qui sont positifs, des cas incorrects et des cas avec des catracteres alphanumeriques et des symboles.
   - Des chaines  (avec ou sans symboles)
   - Des chaines debutant par des symboles fermant
   - des cas avec uniquement des symboles fermant
   - des cas avec des symboles et des caracteres alphanumeriques
  
 2. Nous pensons avoir touché tous les cas  
 3. Nous n'avons pas de predicats avec plus de deux orepateurs booleens
 4. Les Statistiques  de PIT donne   
 ```
 - Statistics
================================================================================
 Generated 11 mutations Killed 11 (100%)
 Ran 16 tests (1.45 tests per mutation)
 ```
 
 Résulats complets : 
 
 ```
 18:00:08 PIT >> INFO : MINION : 18:00:08 PIT >> INFO : Checking environment

18:00:08 PIT >> INFO : MINION : 18:00:08 PIT >> INFO : Found  3 tests

18:00:08 PIT >> INFO : MINION : 18:00:08 PIT >> INFO : Dependency analysis reduced number of potential tests by 0

18:00:08 PIT >> INFO : MINION : 18:00:08 PIT >> INFO : 3 tests received

18:00:08 PIT >> INFO : Calculated coverage in 0 seconds.
18:00:08 PIT >> INFO : Incremental analysis reduced number of mutations by 0
18:00:08 PIT >> INFO : Created  1 mutation test units
18:00:09 PIT >> INFO : Completed in 1 seconds                                                                                                                     /================================================================================
- Mutators
================================================================================
> org.pitest.mutationtest.engine.gregor.mutators.BooleanTrueReturnValsMutator
>> Generated 4 Killed 4 (100%)
> KILLED 4 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
> MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
> NO_COVERAGE 0 
--------------------------------------------------------------------------------
> org.pitest.mutationtest.engine.gregor.mutators.BooleanFalseReturnValsMutator
>> Generated 1 Killed 1 (100%)
> KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
> MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
> NO_COVERAGE 0 
--------------------------------------------------------------------------------
> org.pitest.mutationtest.engine.gregor.mutators.NegateConditionalsMutator
>> Generated 6 Killed 6 (100%)
> KILLED 6 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
> MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
> NO_COVERAGE 0 
--------------------------------------------------------------------------------
================================================================================
- Timings
================================================================================
> scan classpath : < 1 second
> coverage and dependency analysis : < 1 second
> build mutation tests : < 1 second
> run mutation analysis : < 1 second
--------------------------------------------------------------------------------
> Total  : 1 seconds
--------------------------------------------------------------------------------
================================================================================
- Statistics
================================================================================
>> Generated 11 mutations Killed 11 (100%)
>> Ran 16 tests (1.45 tests per mutation)
 ```
 

