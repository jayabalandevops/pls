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
        url: "git@github.com:jayabalandevops/pls.git",
        branch: "master"
    )
    }
    println("Prepared..!")
    }
}