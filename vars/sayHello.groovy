#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def ishan(String name = 'human'){
    stage("Package artifact") {
        sh "echo 'my name is ${name}'"
    }
}

