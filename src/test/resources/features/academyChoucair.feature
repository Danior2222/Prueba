# Autor: Brandon
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy the automation course
  @scenario1
  Scenario: Searhc for a automation course

    Given than brandon wants to learn automation at the academy choucair
    | strUser   | strPassword  |
    | <strUser> | <strPassword>      |
    When he search for the course Recursos Automatizacion Bancolombia on the choucair academy plataform
    | strCourse               |
    | <strCourse> |
    Then he finds course called resources Recursos Automatizacion Bancolombia
    | str Course              |
    | <strCourse> |