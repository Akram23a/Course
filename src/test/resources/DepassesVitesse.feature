#Author: Akram Arar - Ayoub Bouhamidi
#
#Feature: Verifier la validite de la vitesse de la voiture
#
  #En tant qu'organisateur de la course, J'aimerais m'assurer 
  #que les voitures participantes ne depassent
  #pas une certaine vitesse definie.
#
  #Scenario Outline: Comparaison de la vitesse de la voiture enregistree a la vitesse maximale definie
    #Given un enrgesitrement d'une voiture par un participant <v>
    #And enregistrement comprend la vitesse maximale de la voiture <vitesseMax>
    #And la vitesse maximale definie <vitesse>
    #When le participant valide
    #Then retour positif
    #
    #Examples: 
      #| voiture| vitesseMax | vitesse  | status |
      #| v      |     230    |  250     | true   |
      #| v      |     200    |  180     | false  |

#Author: Akram Arar - Ayoub Bouhamidi

Feature: Verifier la validite de la vitesse de la voiture

  En tant qu'organisateur de la course, J'aimerais m'assurer 
  que les voitures participantes ne depassent
  pas une certaine vitesse definie.

  Scenario Outline: Comparaison de la vitesse de la voiture enregistree a la vitesse maximale definie
    Given Un participant qui enregistre sa voiture
    When la vitesse <v> est entree
    Then Verifier si elle depasse la vitesse <c>
    



