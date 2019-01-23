#!/usr/bin/env groovy

def call(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout the file') {
                steps {
                    sh 'aws s3 cp s3://logs-s3-to-local pipelineParams.path'
                }
            }
        }
    }
}
