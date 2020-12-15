#Author: Akram Arar - Ayoub Bouhamidi

Feature: Verifier lattribution du titre au gagnant dans une course


  En tant qu organisateur de la course, J aimerais m assurer que le nmobre de titre du gagnant s incremente de 1.

  Scenario Outline: Verification de la bonne attribution du titre au gagnant
 
 
    #Given un enrgesitrement d une course
    #And enregistrement d un participant
    #And nombre de titres d un participant <t1>
    #When le participant gagne
    #Then incrementation du nombre de titres du participants
    #
    #Examples: 
      #| course | ancien nbr titres | nouveau nbr titres  | status |
      #| c      |     t1            |  		t1 + 1         | true   |

      

  Scenario Outline: Verification de la bonne attribution du titre au gagnant
    Given       un enrgesitrement d une course et participant et nombre de titres

    And enregistrement d un participant
    And nombre de titres d un participant <t1>
    When le participant p gagne la course c
    Then verifier l incrementation des tritres de P
    
    Examples: 
      | course | ancien nbr titres | nouveau nbr titres  | status |
      | c      |     t1            |  		t1 + 1         | true   |
      