Feature: Verifier la validite de la vitesse de la voiture

  En tant qu organisateur de la course, J aimerais m assurer que les voitures participantes ne depassent pas une certaine vitesse definie.
  
  Scenario: Comparaison de la vitesse de la voiture enregistree a la vitesse maximale definie  
  Given Un participant qui enregistre sa voiture
  When la vitesse "230"
  Then Verifier si elle depasse la vitesse "250"