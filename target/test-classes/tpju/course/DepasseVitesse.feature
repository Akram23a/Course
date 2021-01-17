Feature: Verifier la validite de la vitesse de la voiture

  En tant qu organisateur de la course, J aimerais m assurer que les voitures participantes ne depassent pas une certaine vitesse definie.
  
  Scenario Outline: Comparaison de la vitesse de la voiture enregistree a la vitesse maximale definie  
  Given Un participant qui enregistre sa voiture
  When la vitesse <v>
  Then Verifier si elle depasse la vitesse <vmax>
  
      
    Examples: 
      | v           |   vmax  | status   |
      | "200" 			|  "250"  | Success  |
      | "280" 		  |  "290"  | Success  |