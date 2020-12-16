Feature: Verifier ajout voiture

  En tant qu'organisateur de la course, J'aimerais m'assurer 
  que les voitures participantes soit enreg

  Scenario Outline: verfication addvoiture
    Given Un participant <nom> qui s'enregistre
    When s'atribue la voiture <nom> et <vitesse>
    Then Verifier si elle est affectee
    



