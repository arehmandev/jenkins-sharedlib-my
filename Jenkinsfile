final evenOrOdd = library('evenOrOdd')
String GHEAccess = 'jenkinsPAT'

library identifier: 'jenkins-sharedlib-my@master', retriever: modernSCM([$class: 'GitSCMSource',
	remote: 'https://arehmandev/jenkins-sharedlib-my.git',
	credentialsId: GHEAccess])

@Library('jenkins-sharedlib-my') _

evenOrOdd(currentBuild.getNumber())

