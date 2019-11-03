pipeline{

	agent any 
	stages{
		stage('Build'){
			steps{   
				withMaven(maven: 'apache-maven-3.6.0'){
					sh 'mvn clean package'
				}
        		}  
		}
		stage('testing stage') {
		     	steps {
				bat "mvn test"
			}
    		}
		stage('Deploy'){
			steps{
				withCredentials([[$class	:	'UsernamePasswordMultiBinding',
				credentialsId	:	'PCF_LOGIN',
				usernameVariable	:	'USERNAME',
				passwordVariable	:	'PASSWORD']]){
					sh '/user/local/bin/cf login -a http://api.run.pivotal.io -u jadhav.prashant843@gmail.com -p 8983058583Pra@'
					sh '/user/local/bin/cf push'
				} 
			}
		}
	}

}
