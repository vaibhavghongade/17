node {  
    stage('Build') { 
        git 'https://github.com/vaibhavghongade/17.git'  
    }
    stage('Test') { 
        sh 'pwd >> home.txt' 
    }
    stage('Deploy') { 
        sh 'mkdir messi' 
    }
}