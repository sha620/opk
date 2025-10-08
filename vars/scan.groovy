def call(){
  sh "trivy fs . -o pp.json"
}
