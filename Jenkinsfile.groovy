pipeline {
    agent { label 'ansible-master' }

    stages {
        stage('Deploy with Playbook') {
            steps {
                // Execute Ansible playbook for deployment
                sh '/usr/bin/ansible-playbook -i /home/centos/Flask-Project/host.ini /home/centos/Flask-Project/flask.yaml'
            }
        }
    }

    post {
        success {
            echo 'Flask app deployment successful!'
        }
        failure {
            echo 'Flask app deployment failed!' 
        }
    }
}