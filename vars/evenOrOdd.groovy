// vars/my.groovy
def call(int buildNumber) {

  	def terraformPodTemplate = libraryResource "kubernetes/podTemplate.yaml"

    pipeline {
		agent {
			kubernetes {
				label "pipelinetest-${UUID.randomUUID().toString()}"
				yaml terraformPodTemplate
				defaultContainer "jnlp"
			}
		}
      stages {
        stage('Even Stage') {
          steps {
            script{ 
                if (buildNumber % 2 == 0) {
            echo "The build number is even"
                } else {
            echo "The build number is odd"
                }
          }
          }
        }
      }
    }
}