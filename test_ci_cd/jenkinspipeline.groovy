pipeline {
  agent any
  stages {
    stage('Build Maven') { 
      steps {
        sh 'mvn intsall'
      }
    }
    stage('Deploy Standalone') { 
      steps {
        sh 'mvn deploy -P standalone'
      }
    }
    
}