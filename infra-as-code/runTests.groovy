job('GestionBancaire/runTests') {
 scm {
        git {
            remote {
                url('https://github.com/lucasfresiers/GestionBancaire')
                credentials('git')
            }
        
        }
    }
    steps {
        maven {
            goals('test')
        }
    }
}