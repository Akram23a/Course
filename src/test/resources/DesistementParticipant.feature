#Author: Akram Arar - Ayoub Bouhamidi

@tag
Feature: Verifier la supression d'un participant de la liste des participant
  En tant qu'organisateur de la course, J'aimerais m'assurer que lors du desistement 
  d'un participant son est directement supprime
  de la liste des participants
  @tag1
  Scenario Outline: Confirmation de la suppression du participant souhaitant se desister
    Given  Un enregistrement comprend la course concernant le desistement <c>
		And une un participant <p> enregistre dans la course  
    And	un participant <p2> non-enregistre dans la course
    When le participant valide
    Then retour positif
    
    Examples: 
      | Course | Participant| status  |
      | c      |     p1      | success |
      | c      |     p2      | Fail    |

