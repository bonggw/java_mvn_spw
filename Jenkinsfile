pipeline {
     agent any
     stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/bonggw/java_mvn_spw.git', branch: 'main'
            }
        }
        stage("Compile") {
            steps {
                sh "chmod 0744 ./mvnw && ./mvnw compile"
            }
        }
        stage("Unit Test") {
            steps {
                sh "./mvnw test"
            }
        }
        stage("Code coverage") {
            steps {
                sh "./mvnw jacoco:report"
                 publishHTML (target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
            }
        }
        stage("Staic code analysis") {
           steps {
                sh "./mvnw checkstyle:checkstyle"
                 publishHTML (target: [
                    reportDir: 'target/site',
                    reportFiles: 'checkstyle.html',
                    reportName: "CheckStyle Report"
                ])
           }
        }
    }
}