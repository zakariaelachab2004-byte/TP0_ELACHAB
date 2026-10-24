package ma.emsi.elachab.tp0.tp0_elachab;

import jakarta.enterprise.context.Dependent;
import java.io.Serializable;
import java.util.Locale;

/**
 * Classe de service pour les modificateurs de question.
 */
@Dependent
public class GenerateurReponse implements Serializable {

    private boolean roleSystemeAffiche = false;

    /**
     * Génère une réponse à une question (Version modifiée pour le BONUS)
     */
    public String genererReponse(String question, String roleSysteme) {
        // BONUS : Modification du traitement de la réponse
        String resultat = "=== RÉPONSE DU SERVEUR ===\n";

        if (!this.roleSystemeAffiche && roleSysteme != null) {
            resultat += ">> RÔLE ACTIF : " + roleSysteme.toUpperCase(Locale.FRENCH) + "\n\n";
            this.roleSystemeAffiche = true; // Correction de la syntaxe
        }

        // Nouveau traitement : on met tout en MAJUSCULES et on compte les caractères
        resultat += "VOTRE MESSAGE : " + question.toUpperCase(Locale.FRENCH) + "\n";
        resultat += "(Statistiques : " + question.length() + " caractères reçus)";

        return resultat;
    }
}