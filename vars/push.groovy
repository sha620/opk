def call(String ID, String image){
  withCredentials([usernamePassword(
                    credentialsId: "ID",
                    usernameVariable: "user",
                    passwordVariable:"pass"
                    )]){
                        sh "docker login -u ${env.user} -p ${env.pass}"
                        sh "docker image tag $image ${env.user}/$image"
                        sh "docker push ${env.user}/$image"
                    }
}
