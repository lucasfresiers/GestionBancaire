pipelineJob('GestionBancaire/buildProject') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/lucasfresiers/GestionBancaire')
            credentials('git')

          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}