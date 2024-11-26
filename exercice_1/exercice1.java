public class factureManager {

	 // calcul du du prix avce application du taux

	public static double ajoutTaux(double taux, double total)
    {
        double red = total * taux ;
        double prix = total - red ;

        return prix; 
    }
	
	 // Calcul le total d'une facture
    public static double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {

        double total = quantite * prixUnitaire;

        // reduction selon la catégorie

        if (typeProduit.equals("Alimentaire")) {

          total =  ajoutTaux(0.05,total); // Réduction de 5%

        } else if (typeProduit.equals("Electronique")) {

             
          total =  ajoutTaux(0.1, total); // Réduction de 10%

        } else if (typeProduit.equals("Luxe")) {
            
          total =  ajoutTaux(0.15, total); // Réduction de 15%
        }

        // Reduction sur le total

        if (total > 1000) {

          total = ajoutTaux(0.05,total); // Réduction supplémentaire de 5% pour les gros montants
        }
  return total;       
	
}