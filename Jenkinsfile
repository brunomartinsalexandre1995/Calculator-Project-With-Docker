pipeline {
   agent any

    stages {
        stage("Checkout from Github"){
            steps{
                git url: 'https://github.com/brunomartinsalexandre1995/Calculator-Project-With-Docker.git'
            }
        }
        stage("Compile code"){
            steps{
                sh "mvn compile"
            }
        }
         stage("Run Unit Tests"){
            steps{
                sh "mvn test"
            }
        }

    }
}