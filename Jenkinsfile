pipeline{
agent any
tools{
     gradle 'gradle'
}
stages{
     stage ('test: builder pattern') {
     steps {
            sh 'gradle clean test'
       }
     }
}
post{
     always{
          sh 'gradle allureReport'
          script {
            allure includeProperties: false,
            jdk: '',
            report: "build/allure-report/",
            results: [[path: "build/allure-results/"]]
          }
     }
}
}