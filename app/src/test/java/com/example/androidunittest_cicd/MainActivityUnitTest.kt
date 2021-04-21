package com.example.androidunittest_cicd

import org.junit.Assert
import org.junit.Test

class MainActivityUnitTest {
  @Test
  fun testInit() {
    Assert.assertEquals(4, 2 + 2)
  }
}
/**
What is Continuous Integration?
Continuous Integration says that developers in the team should merge their code changes to a central
branch as often as possible. These changes are
validated using an automated integration process
which generates a build and runs the automated
tests against it. This helps in figuring out any
integration issues early in the development cycle
instead of waiting for the release day to merge all the changes.

What is Continuous Delivery?
Continuous Delivery says that every code change which
has passed through the integration process can be
deployed to test/production environment in an
automated fashion or with least human intervention.
 */