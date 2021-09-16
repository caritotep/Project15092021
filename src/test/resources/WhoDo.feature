@TF
Feature: WhoDo

  Background:
    Given have access to WhoDo

  Scenario: create file

    When click "+" button in main screen
    And fill "title" textbox with "VALOR1"
    And fill "notes" textbox with "Nota del VALOR1"
    And click "save" button
    Then contact "VALOR1" should be created

  Scenario: update file

    When click in the record
    And i modify the text "Nota del VALOR1" with "MODIFICACION DE LA NOTA VALOR1"
    And click "save" button update
    Then the note "MODIFICACION DE LA NOTA VALOR1" should be created

  #Scenario: delete file
    #When click in the box record
    #And click in toolbar
    #And click in delete completed
    #And click in delete
    #Then the list should be empty