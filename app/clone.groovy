        println("Cloning...")
        dir('appl'){
            git(
                url: "$AppRepo",
                branch: "$Branch"
            ) 
        }
        println("Cloned.")