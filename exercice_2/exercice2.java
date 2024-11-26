public class GestionnaireNotes {

     //calcul de la moyenne

    public double moyenne(int [] notes)
       {
        double somme = 0;
          for(int note : notes)
          {
            somme += note ;
          }
         double moy = somme / notes.length; 
        return moy;
       }   


     // Affiche note et moyennes

    public void afficherNotesEtMoyenne(String nomEtudiant, double[] notes) {

     // Affichage des notes

        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
         }
    
         double moyen;

         moyen = moyenne(notes); // recuperation de la moyenne

         System.out.println("La moyenne de ses note est : " + moyen);
 
    }
}
