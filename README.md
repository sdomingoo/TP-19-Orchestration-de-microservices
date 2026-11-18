# TP 19 – Orchestration de microservices avec Spring Cloud

## Présentation du projet

Ce TP a pour objectif de mettre en place une architecture basée sur les microservices à l'aide de **Spring Cloud**. Il consiste à développer plusieurs services indépendants et à assurer leur communication ainsi que leur découverte dynamique.

L'architecture repose sur trois composants principaux : Eureka pour l'enregistrement et la découverte des services, Spring Cloud Gateway pour le routage des requêtes et OpenFeign pour la communication entre microservices.

## Objectifs

- Comprendre les principes d'une architecture microservices.
- Mettre en place un serveur de découverte avec Eureka Server.
- Enregistrer les microservices auprès d'Eureka.
- Configurer une passerelle API avec Spring Cloud Gateway.
- Assurer la communication entre les services avec OpenFeign.
- Tester les échanges entre les différents composants.

## Technologies utilisées

- Java
- Spring Boot
- Spring Cloud
- Spring Cloud Netflix Eureka
- Spring Cloud Gateway
- Spring Cloud OpenFeign
- Maven
- REST API

## Architecture du projet

L'application repose sur une architecture distribuée composée de plusieurs services :

- **Eureka Server :** assure l'enregistrement et la découverte des microservices.
- **API Gateway :** constitue le point d'entrée de l'application et redirige les requêtes vers les services concernés.
- **Microservices :** exécutent les fonctionnalités métier de l'application.
- **OpenFeign :** facilite les appels REST entre les différents microservices.

## Structure du projet

La structure peut être organisée autour des modules suivants :

```text
TP19-Spring-Cloud/
│
├── eureka-server/
├── gateway-service/
├── service-1/
├── service-2/
└── README.md
```

*La structure exacte dépend de l'organisation retenue dans le projet.*

## Mise en œuvre

Les principales étapes de réalisation sont :

1. Création et configuration du serveur Eureka.
2. Développement des microservices et configuration de leur enregistrement.
3. Mise en place de Spring Cloud Gateway.
4. Configuration des routes vers les microservices.
5. Intégration d'OpenFeign pour la communication interservices.
6. Vérification du fonctionnement global de l'architecture.

## Conclusion

Ce TP permet de mettre en pratique les mécanismes essentiels de Spring Cloud pour construire une architecture microservices distribuée, faciliter la communication entre les services et centraliser leur accès à travers une passerelle API.
