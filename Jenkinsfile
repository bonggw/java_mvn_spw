pipeline {
     agent any
     stages {
        stage("Checkout && Compile") {
            steps {
                git url: 'https://github.com/bonggw/java_mvn_spw.git', branch: 'main'
                sh "chmod 0744 ./mvnw && ./mvnw compile"
            }
        }
        stage("Unit Test") {
            steps {
                sh "./mvnw test"
            }
        }
        stage("Code coverage (JaCoCo)") {
            steps {
                sh "./mvnw jacoco:report"
                 publishHTML (target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
            }
        }
        stage("Static code analysis (checkstyle)") {
           steps {
                sh "./mvnw jxr:jxr checkstyle:checkstyle"
                 publishHTML (target: [
                    reportDir: 'target/site',
                    reportFiles: 'checkstyle.html',
                    reportName: "CheckStyle Report"
                ])
           }
        }
        stage("Static code analysis (pmd,cpd)") {
           steps {
                sh "./mvnw jxr:jxr pmd:pmd pmd:cpd"
                 publishHTML (target: [
                    reportDir: 'target/site',
                    reportFiles: 'pmd.html',
                    reportName: "PMD Report"
                ])
                publishHTML (target: [
                    reportDir: 'target/site',
                    reportFiles: 'cpd.html',
                    reportName: "CPD Report"
                ])
           }
        }
    }
}