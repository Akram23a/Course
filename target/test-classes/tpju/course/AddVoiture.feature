Feature: Verifier ajout voiture

  En tant qu'organisateur de la course, J'aimerais m'assurer 
  que les voitures participantes soit enreg

  Scenario Outline: verfication addvoiture
    Given Un participant <name> qui s enregistre
    When Il s attribue la voiture avec le nom <carname> et la vitesse <speed>
    Then Verifier si elle est affectee
    
    Examples: 
      |  name   |  carname    | speed   | status  |
      | "John"  | "Cocinelle" |  "190"  | success |
      | "Hamid" | "Mustang"   |  "290"  | success |



