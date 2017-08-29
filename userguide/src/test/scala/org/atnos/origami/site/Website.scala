package org.atnos.origami.site

import org.specs2._
import runner._

class Website extends Specification { def is = s2"""

  Generate the website
    the user guide $userGuide

"""

  def userGuide = {
    ClassRunner.run(s"index html html.outdir target/specs2-reports/site html.nostats html.verbose html.search html.toc all".split(" "))
    ok
  }

}
