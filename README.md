# Kotlin List Modification During Iteration

This repository demonstrates a common error in Kotlin when modifying a list while iterating. Directly modifying a list using methods like `removeIf` while iterating in a `for` loop or similar construct can lead to unexpected results or exceptions (ConcurrentModificationException).  The correct approach uses an `Iterator` to safely remove items during iteration.

The provided `bug.kt` file showcases the incorrect way to remove elements from a list, and the `bugSolution.kt` file provides the correct solution using an iterator.
