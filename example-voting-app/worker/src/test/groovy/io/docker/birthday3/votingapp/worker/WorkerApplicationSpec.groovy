package io.docker.birthday3.votingapp.worker

import io.docker.birthday3.votingapp.worker.WorkerApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Configuration
import spock.lang.Specification

@SpringApplicationConfiguration(WorkerApplication)
@Configuration
class WorkerApplicationSpec extends Specification {

   @Autowired
   ApplicationContext context

   void "Context loads"() {
      expect:
      context
   }

}
