Feature: Verifier ajout voiture

  En tant qu'organisateur de la course, J'aimerais m'assurer 
  que les voitures participantes soit enreg

  Scenario: verfication addvoiture
    Given Un participant "John" qui s enregistre
    When Il s attribue la voiture avec le nom "Cocinelle" et la vitesse "190"
    Then Verifier si elle est affectee
    



