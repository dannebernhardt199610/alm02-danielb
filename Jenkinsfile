pipeline{
  agent any
  parameters{
  choice (name: 'DEPLOY_ENV', choices:['int', 'stage', 'prod'], description:'Target environment')
  }

  stages{
  stage('Build application') {
  agent {
        docker{ image 'rasilva1986/java-maven:alm'}
    }
  steps{
  sh 'mvn clean install'
  }
  post{
      always {
          junit 'target/surefire-reports/*.xml'
          publishHTML([allowMissing: false,
          alwaysLinkToLastBuild: false,
          keepAll: false,
          reportDir: 'target/surefire-reports/',
          reportFiles: 'index.html',
          reportName: 'unit test',
          reportTitles: ''])

          publishHTML([allowMissing: false,
          alwaysLinkToLastBuild: false,
          keepAll: false,
          reportDir: 'target/site/jacoco/',
          reportFiles: 'index.html',
          reportName: 'Test Coverage',
          reportTitles: 'Test Coverage'])
      }
      success{
      archive 'target/javaEEHelloWorld-1.0-SNAPSHOT.war'
      }

    }

 }


  stage('Deploy application'){
  agent any
  steps{
       sh 'asadmin --port 4848 deploy --force --name FortuneTeller-${DEPLOY_ENV} --contextroot FortuneTeller-${DEPLOY_ENV} target/javaEEHelloWorld-1.0-SNAPSHOT.war'
  }
  }
  }
}