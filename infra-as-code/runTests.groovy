job('GestionBancaire/runTests') {
 scm {
        git {
            remote {
                url('https://github.com/lucasfresiers/GestionBancaire')
                credentials('git')
            }
            extensions {
                cleanAfterCheckout()
                relativeTargetDirectory('repo1')
            }
        }
    }
    steps {
        maven {
            goals('test')
        }
    }
}