def call(Map config = [:]) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    echo "📥 Cloning from ${config.repo}"
                    git url: config.repo, branch: config.branch
                }
            }
            stage('Build') {
                steps {
                    echo "🏗️ Building using command: ${config.buildCmd}"
                    sh "${config.buildCmd}"
                }
            }
            stage('Success') {
                steps {
                    echo "✅ Build completed successfully!"
                }
            }
        }
    }
}
