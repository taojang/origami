package org.atnos.origami.site

object Installation extends UserGuidePage { def is = "Installation".title ^ s2"""
You add `origami` as an sbt dependency:

```scala
libraryDependencies += "org.atnos" %% "origami" % "$version"

// to write types like Reader[String, ?]
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")
```

To get types like `Reader[String, ?]` (with more than one type parameter) correctly inferred, you'll have to use the following compiler option

```scala
scalacOptions += "-Ypartial-unification"
```

If you want to use [Scalaz Stream](http://github.com/scalaz/scalaz-stream) as a streaming library for functional programming you will also need:

```scala
libraryDependencies += "org.atnos" %% "origami-scalaz" % "$version"
```

This will allows you to fold a Scalaz `Process` using `Fold`.

### Imports

#### Main types

The main `origami` types: `Fold`, `Sink`, `Aux` are accessible in the `org.atnos.origami` package:
```scala
import org.atnos.origami._
```

#### Creating folds

```scala
import cats.Id
import cats.implicits._
import org.atnos.origami._

def count[A]: Fold[Id, A, Int] = fold.fromMonoidMap(_ => 1)
```

There are many predefined folds accessible via:

```scala
import org.atnos.origami.folds._
```

#### Running folds

Fold can be applied to, but not limited to, any data type has a `Foldable` instance.

Folding a normal `Foldable` data type using `Fold` can be done easily with help of importing following syntax:

```scala
val list = List(1, 2, 3, 4)

// to access the foldWith method
import org.atnos.origami.syntax.foldable._

list.foldWith(count) //  => 4
```

You can also access all the syntax imports at once with:
```scala
import org.atnos.origami.syntax.all._
```
"""

}
