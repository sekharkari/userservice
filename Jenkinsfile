node {
   def mvnHome = tool 'M3'

   stage 'Checkout' {
   checkout scm
    }

   // Mark the code build 'stage'....
   stage 'Build' {
   sh "${mvnHome}/bin/mvn clean install -DskipTests=true"
   step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])
   stash includes: '**/target/*.jar', name: 'app' 
   }
 
   stage 'Junits & Coverage' {
   sh "${mvnHome}/bin/mvn test cobertura:cobertura cobertura:check cobertura:clean" 
   junit allowEmptyResults: true, testResults: '**/target/surefire-reports/TEST-*.xml'
   publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/cobertura', reportFiles: 'index.html', reportName: 'Code coverage report'])
   }
   
   stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
    def scannerHome = tool 'SonarQube Scanner 2.8';
    withSonarQubeEnv('My SonarQube Server') {
      sh "${scannerHome}/bin/sonar-scanner -X"
    }
  }
 
   stage 'Deployment - Cloudfoundry' concurrency: 1 {
   	//CF push
	input message: 'Do you want to push this build to Dev cloud foundry instance ?', ok: 'Yes'
   	sh 'cf login -a https://api.ng.bluemix.net -o vkari -u sekharkari@gmail.com -p Vaishnavi1 -s dev'
    sh 'cf push vkari-userservice -p target/user-service-0.0.1-SNAPSHOT.jar  -n cfdemo-us -m 256M'
    }
   
}