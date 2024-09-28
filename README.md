# Scripts des Développeurs

## Objectif
Le projet **Scripts des Développeurs** a pour objectif de suivre et d'analyser la réalisation des scripts par les développeurs d'un projet. Un rapport hebdomadaire est généré par le chef de projet, enregistrant quotidiennement le nombre de scripts réalisés par chaque développeur. Ces informations sont stockées dans une base de données MySQL et peuvent être consultées via une application Java.

## Outils Utilisés
  - Langage Java
  - IDE NetBeans
  - Base de données MySQL
  - API JDBC

## Structure du Projet
Le projet est organisé de la manière suivante :

  - **Connexion.java** : Gère la connexion à la base de données MySQL.
  - **IDao.java** : Interface générique pour les opérations DAO.
  - **Devdata.java** : Classe modèle représentant les données des développeurs.
  - **ExoJDBC.java** : Implémente les méthodes pour interagir avec la base de données.
  - **Exercice1.java** : Programme principal pour créer et initialiser la table.
  - **Exercice2.java** : Programme principal pour effectuer des requêtes et afficher des résultats.
  - **Exercice3.java** : Programme principal pour exécuter des requêtes libres et obtenir des méta-informations.


## Fonctionnalités
- **Connexion à la Base de Données** : Établit une connexion avec une base de données MySQL.
- **Création et Gestion de la Table DevData** :
  - Création de la table `DevData` avec les colonnes `Developpeurs`, `Jour`, et `NbScripts`.
  - Insertion des données dans la table.
- **Requêtes SQL Avancées** :
  - Récupération du nombre total de scripts réalisés par chaque développeur.
  - Identification du développeur ayant réalisé le maximum de scripts en une journée.
  - Affichage de la liste des développeurs triée par nombre décroissant de scripts.
  - Calcul du nombre total de scripts réalisés en une semaine.
  - Exécution de requêtes libres et obtention de méta-informations sur les résultats.

## Cloner le Projet
Pour cloner ce projet sur votre machine locale, suivez les étapes ci-dessous :

1. **Assurez-vous d'avoir Git installé**. Si ce n'est pas le cas, vous pouvez le télécharger et l'installer depuis [git-scm.com](https://git-scm.com/).

2. **Ouvrez votre terminal** et exécutez la commande suivante pour cloner le dépôt :

   ```bash
   git clone https://github.com/votre_nom_utilisateur/ScriptsDesDeveloppeurs.git
## Démonstration de l' Exercice 1: Ouvrir une connexion, Créer et remplir une table

https://github.com/user-attachments/assets/0f73784d-283e-4684-8757-0d4d05e1304c

## Démonstration de l' Exercice 2: Rechercher de l’information dans la base de données

https://github.com/user-attachments/assets/0731cd90-902f-4b3d-a3b6-a2b64a76e141

## Démonstration de l' Exercice 3: Effectuer une requête libre et obtenir la méta information sur les
types de données du résultat

https://github.com/user-attachments/assets/efaff082-38fc-433f-b55f-6d3f2f660be0



