pipelineJob('GestionBancaire/buildProject') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/lucasfresiers/GestionBancaire')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}