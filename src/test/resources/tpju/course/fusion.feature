Feature: Verifier l attribution d une moto a un participant

  En tant qu organisateur de la course de moto, J aimerais m assurer 
  que les voitures participantes soit 

  Scenario Outline: verfication attribution moto
    Given Un participant <name> s enregistre
    When Il s attribue la moto avec le nom <motoname> et la vitesse <speed>
    Then Verifier si la moto est affectee
    
    Examples: 
      |  name  |  motoname  | speed   |
      | "Sam"  | "Ninja H2" |  "190"  | 
      | "Will" | "GRC-1000" |  "290"  | 


  Scenario Outline: verfication ajout dune voiture a une course de voiture et la deduction du participant
    Given Un participant s enregistre avec le nom <nomvoiture> et la vitesse <vitesse>
    When on cree a la course
    And on ajoute un conducteur <nom>
    And on ajoute la voiture cree a la course
    Then Verifier que le participant a bien ete ajoute
     
  Examples: 
      |  nomvoiture  |  vitesse  | nom  |
      | "Renault4"   | "190"     | "Sam"|
     