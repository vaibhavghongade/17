node {  
    stage('Build') { 
        git 'https://github.com/vaibhavghongade/17.git'  
    }
    stage('Test') { 
        sh 'echo pwd >> homee.txt' 
    }
    stage('Deploy') { 
        sh 'mkdir messii' 
    }
}