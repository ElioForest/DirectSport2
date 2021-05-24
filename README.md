# DirectSport2

DIRECTSCORE

PARTIE 1,  Présentation du projet :

I-	Contexte et définition :
DIRECTSCORE est une application permettant aux utilisateurs d’accéder au score d’un match en direct ainsi que le calendrier des matchs à venir. 
Elle s’adresse aux fans de sport souhaitant connaître en temps réel le score d’un match ainsi que la date et l’heure des matchs à venir. 
L’utilisateur pourra se connecter sur l’application, enregistrer ses équipes favorites et recevra une notification à mesure que le score évolue. 
Il aura aussi accès au score, calendrier des match ainsi que le classement des championnats.

II-	Objectif du projet :
A la fin de notre projet, nous pourrons vous présenter DIRECTSCORE, une application sportive répondant à notre problématique. 
Elle permettra à l’utilisateur de créer un compte, avoir accès à ses équipes préférées ainsi qu’à des informations supplémentaires.

III-	Périmètre du projet :
DIRECTSCORE sera une application mobile. Notre cible prioritaire sera les Français, en effet nous pensons travailler majoritairement sur les ligues françaises : 
En priorité le foot avec la Ligue 1 et Ligue 2, nous aurons ensuite le rugby avec le Top14 et la ProD2 et le tennis.

PARTIE 2, état du projet :

A savoir : Nous étions deux à travailler sur le projet (Elio Forestier & Thomas Berthet), nous découvrions tous les deux AndroidStudio ainsi que Kotlin (nos outils de travail). 
Nous avons rencontré un problème inattendu, moi-même, Thomas Berthet n’a pratiquement pas pu utiliser le logiciel AndroidStudio car celui-ci demandait trop de ressources pour son ordinateur 
(malgré de nombreux essais d’optimisation…). Lancer l’application sur l’ordinateur de Thomas amenait systématiquement celui-ci à crasher, le rendant inutilisable durant parfois plusieurs dizaines de minutes. 
Thomas a donc été limité à quelques recherches Internet et du codage « dans le vide » c’est-à-dire coder sans pouvoir voir le résultat. Nous avons donc été grandement handicapés dans l’avancement du projet à cause de cela.
De plus, nous avons été confrontés à un langage nous étant inconnu et récent, ce qui a rendu difficile la documentation sur internet (par exemple avec les fragments qui nous on énormément compliqué la tâche)

-	Fonction permettre à l’utilisateur de connaître les matchs dans les différentes ligues (Foot, Rugby, Tennis) : en cours.
L’objectif ici était d’avoir accès à la date et à l’heure des match de ligue en cliquant sur une ligue. Nous nous sommes limités sur le foot uniquement par manque de temps. 
Nous n’avons pas non plus eu le temps de connecter notre application à une API en ligne. Pour l’instant l’utilisateur peut simplement cliquer sur une ligue et accéder à certaines informations.

-	Permettre à l’utilisateur de connaître le score des matchs : en cours.
L’utilisateur devait avoir accès aux score des matchs en cours ainsi qu’aux scores des matchs terminés. Nous avons simplement simulé des scores aléatoires qui s’affichent lorsque l’utilisateur clique sur les matchs affichés.
Cependant tout est pour l’instant simulé car l’application n’est pas connectée à une API.

-	Permettre à l’utilisateur de connaitre les informations sur une équipe : non réussie.
Ici l’utilisateur devait pouvoir, en cliquant sur une équipe, accéder au classement de cette équipe dans sa ligue ainsi que les différentes informations sur celle-ci.
Nous n’avons pas eu le temps de s’occuper de cette fonctionnalité à cause de nombreux problèmes rencontrés en amont.

-	Permettre à l’utilisateur de créer un compte : en cours.
Nous avons crée la page de connexion de l’utilisateur, il faudrait alors créer la base de donnée Firebase et la connecter sur l’application. Nous avons encore une fois manqué de temps à cause d’une accumulation de problèmes.

-	Avoir des équipes favorites + envoi de notification : non réussie.
L’utilisateur enregistré devait pouvoir ajouter des équipes favorites. Lorsqu’une des équipes favorites jouera, l’utilisateur aura une notification lorsque le scores du match évolue.
Cette fonctionnalité étant liée à la création du compte par l’utilisateur, nous n’avons pas pu nous en occuper.

PARTIE 3, Conclusion :

Points positifs d’android : AndroidStudio est une excellente application de développement Android. L’interface est plutôt lisible et compréhensible, quoique beaucoup d’informations sont affichées et il peut être difficile parfois de trouver ce que l’on cherche sur l’écran. 
La configuration de Git sur l’application est plutôt facile à prendre en main. 

Points négatifs : L’application est très gourmande. Elle requière une configuration minimale concernant l’ordinateur avec lequel on souhaite l’utiliser. A moins d’avoir cette configuration, l’application sera lente et l’exécution du code très lente voire impossible. 
Développeurs présents sur le projet : Forestier Elio & Berthet Thomas.

