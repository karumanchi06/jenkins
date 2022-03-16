freeStyleJob('example') {
          scm {
                      git {
           remote {
               name("origin")
               url("https://github.com/karumanchi06/jenkins.git")

           }
        }
    }

    steps {
        shell(ls - ltr)
    }
}


