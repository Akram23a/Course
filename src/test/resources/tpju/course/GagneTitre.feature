Feature: Verifier la validite de la vitesse de la voiture

  En tant qu organisateur de la course, J aimerais m assurer que les voitures participantes ne depassent pas une certaine vitesse definie.
  
  Scenario: Comparaison de la vitesse de la voiture enregistree a la vitesse maximale definie  
  Given un enrgesitrement d une course et participant et nombre de titres
  When le participant p gagne la course c
  Then verifier l'incrementation des tritres de p