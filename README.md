# GestionBancaire

# Création des jobs automatiquement
Nous avons utilisé le plugin JobDSL afin de générer nos jobs à partir de fichier groovy qui décrivent ces jobs.
Il faut donc installer le plugin JobDSL sur Jenkins.
Il faut ensuite créer un job freestyle que l'on appelle "seed". On y ajoute le git et une étape jobDSL qui lance les scripts infra-as-code/createFolder.groovy puis infra-as-code/*.groovy

On lance le job ensuite, il y aura une erreur car les scripts ne sont pas approuvés. Il faut aller dans administrer jenkins -> in process script approval et on approuve les scripts.
Après avoir relancé le job, un dossier "Gestion bancaire" sera crée avec un job lançant le build/deploiement, un job lançant uniquement les tests.


