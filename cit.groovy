node ("$NodeName") {
    wrks = env.WORKSPACE
    stage ("Prepare") {
    println("Preparing...")
    git(
        url: "git@github.com:jayabalandevops/pls.git",
        branch: "master"
    )
    dir ('config') {
    git(
        url: "git@github.com:jayabalandevops/conf.git",
        branch: "master"
    )
    }
    println("Prepared..!")
    }
    stage("Application Cloning"){
        load 'app/clone.groovy'
    }
    stage("Build") {
        load 'app/build.groovy'
    }
    stage("Deploy"){
        sh "scripts/dep.sh"
    }
}