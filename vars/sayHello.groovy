#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}


def sample(String name = 'human') {
  echo "my name is ${name}"
}


def logs(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout the file') {
                steps {
                    sh 'aws s3 cp s3://logs-s3-to-local /home/ubuntu/'
                }
            }
        }
    }
}
