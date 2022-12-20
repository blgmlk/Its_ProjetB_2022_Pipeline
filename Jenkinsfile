node() {
    stage('Clone') {
       // sh 'if [ -d "Its_ProjetB_2022_Pipeline" ]; then rm -rf Its_ProjetB_2022_Pipeline ; fi;'
        git 'https://github.com/blgmlk/Its_ProjetB_2022_Pipeline.git'
    }
    
    
    stage('Build') {
        sh 'systemctl status docker.service ' 
        stage('Try and catch') {
            // Command(s) to test
            try {
                // Failed on purpose
                sh 'docker build -t jumanimage .'
                // Answer to the failure
                } catch (Exception e) {
                // "catch (exc)" can also be use but no error type will be raised
                // Raise the error type
                echo e.toString()
                // Output -> hudson.AbortException: script returned exit code 1
                sh 'docker rmi jumanimage'
                echo 'Something goes wrong !'
		sh 'docker build -t jumanimage .' 
                }
        }
        sh 'docker images' 
    }

    stage ('Run') {
        stage('Try and catch') {
            // Command(s) to test
            try {
                sh 'docker run -d --rm --name zinadocker -p 8083:8080 jumanimage'
                // Failed on purpose
                // Answer to the failure
                 } catch (Exception e) {
                // "catch (exc)" can also be use but no error type will be raised
                // Raise the error type
                echo e.toString()
                // Output -> hudson.AbortException: script returned exit code 1
                sh 'docker rm -f zinadocker'
                echo 'Something goes wrong !'
                sh 'docker run -d --rm --name zinadocker -p 8083:8080 jumanimage'
            }
        }
        
        sh 'docker ps'
        sh 'sleep 45s'
        sh 'curl localhost:8083'
        sh 'docker ps' 
    }
     stage('verify') {
        sh 'docker inspect zinadocker'
    }

}

