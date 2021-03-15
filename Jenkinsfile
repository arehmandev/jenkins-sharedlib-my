String GHEAccess = 'jenkinsPAT'

library identifier: 'jenkins-sharedlib-newtrn@master', retriever: modernSCM([$class: 'GitSCMSource',
	remote: 'https://github.com/arehmandev/jenkins-sharedlib-newtrn.git',
	credentialsId: GHEAccess])

@Library('my') _

evenOrOdd(currentBuild.getNumber())

