#!/usr/bin/env groovy

def call(){
    node {
        stage('Checkout') {
            checkout scm
        }

        // Execute different stages depending on the job
        if(env.JOB_NAME.contains("deploy")){
            packageArtifact()
        } else if(env.JOB_NAME.contains("test")) {
            buildAndTest()
        }
    }
}

def packageArtifact(){
    stage("Package artifact") {
        "sh echo 'my name is ishan'"
    }
}

def buildAndTest(){
    stage("Backend tests"){
        "sh echo 'my name is arima'"
    }
}
