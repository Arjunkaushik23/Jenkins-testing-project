pipeline {
    agent any

    tools {
        maven 'maven' // Use the name you have configured for Maven
        jdk 'jdk-22' // Use the name you have configured for JDK
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat 'mvn spring-boot:run'
            }
        }
    }
}
