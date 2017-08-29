package org.atnos.origami.site

import org.specs2.matcher._
import org.specs2.specification.Snippets
import org.specs2.specification.core._
import org.specs2.specification.create.SpecificationCreation

abstract class UserGuidePage extends
  ImmutableSpecificationStructure with
  SpecificationCreation with
  Snippets with
  TypedEqual with
  ExpectationsCreation {

  val version = org.atnos.origami.core.BuildInfo.version
}
