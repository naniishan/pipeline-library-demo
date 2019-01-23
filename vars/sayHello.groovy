#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def ishan(){
    stage("Package artifact") {
        sh "echo 'my name is ishan'"
    }
}

