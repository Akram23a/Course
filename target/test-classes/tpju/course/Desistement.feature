#Author: Akram Arar - Ayoub Bouhamidi


	Feature: Verifier la supression d'un participant de la liste des participant

  Scenario Outline: Confirmation de la suppression du participant souhaitant se desister

  Given Un enregistrement comprend la course concernant le desistement
    When supprimer le participant p
    Then verifier la suppr de p
