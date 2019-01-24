#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}
def info(message) {
    echo "INFO: ${message}"
}

def warning(message,age) {
    echo "WARNING: ${message}"
    echo "your age is : ${age}"
}


