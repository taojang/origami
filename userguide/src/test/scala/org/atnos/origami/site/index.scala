import org.atnos.origami.site._

object index extends UserGuidePage { def is = "origami".title ^ s2"""
The ***origami*** project provides "Monadic folds" to process streams of data in a composable fashion.
Monadic folds come in 2 flavors:

 - pure folds: for computing things like `min`, `max`, `average`, `hash`,...
 - effectul folds: for sinking data to a file for example
   You can learn more in the following sections:

 - ${"installation and imports" ~ Installation}

### Contributing

`origami` is a [Typelevel](http://typelevel.org) project. This means we embrace pure, typeful, functional programming,
and provide a safe and friendly environment for teaching, learning, and contributing as described in the [Typelevel Code of Conduct](http://typelevel.org/conduct.html).

Feel free to open an issue if you notice a bug, have an idea for a feature, or have a question about the code. Pull requests are also gladly accepted.

"""
}
