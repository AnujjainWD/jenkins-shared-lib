def call(Map config = [:]) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    echo "🔁 Cloning from ${config.repo}"
                    git url: config.repo, branch: config.branch
                }
            }
            stage('Build') {
                steps {
                    echo "🔨 Running build: ${config.buildCmd}"
                    sh "${config.buildCmd}"
                }
            }
            stage('Done') {
                steps {
                    echo "✅ Build complete for ${config.repo}!"
                }
            }
        }
    }
}
