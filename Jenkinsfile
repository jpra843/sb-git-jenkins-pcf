pipeline{

	agent any
	stages{
		stage('Build'){
			steps{
				withMaven('Build') {
            git "https://github.com/jpra843/sb-git-jenkins-pcf.git"
            sh "export PATH=$MVN_CMD_DIR:$PATH && mvn clean install" // 'mvn' command: need to add the $MVN_CMD_DIR to $PATH
        } 
			}
		}
		stage('Deploy'){
			steps{
				withCredentials([[$class	:	'UsernamePasswordMultiBinding',
				credentialsId	:	'PCF_LOGIN',
				usernameVariable	:	'USERNAME',
				passwordVariable	:	'PASSWORD']]){
					sh '/user/local/bin/cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
					sh '/user/local/bin/cf push'
				} 
			}
		}
	}

}
