pipeline {
	agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
			agent {
				docker {
					image 'maven:3-alpine'
					args '-v /root/.m2:/root/.m2'
				}
			}
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
			agent {
				docker {
					image 'maven:3-alpine'
					args '-v /root/.m2:/root/.m2'
				}
			}
            steps {
                sh 'mvn tesl
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
		stage('Deliver') { 
			steps {
				sh './jenkins/script/deliver.sh'
			}
		}
    }
}

