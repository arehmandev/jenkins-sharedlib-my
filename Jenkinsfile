String GHEAccess = 'jenkinsPAT'

library identifier: 'jenkins-sharedlib-my@master', retriever: modernSCM([$class: 'GitSCMSource',
	remote: 'https://github.com/arehmandev/jenkins-sharedlib-my.git',
	credentialsId: GHEAccess])



evenOrOdd(currentBuild.getNumber())

