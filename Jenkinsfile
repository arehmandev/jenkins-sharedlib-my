//final evenOrOdd = library('evenOrOdd')
@Library('jenkins-sharedlib-my') _
String GHEAccess = 'jenkinsPAT'

library identifier: 'jenkins-sharedlib-my@master', retriever: modernSCM([$class: 'GitSCMSource',
	remote: 'https://arehmandev/jenkins-sharedlib-my.git',
	credentialsId: GHEAccess])



evenOrOdd(currentBuild.getNumber())

