package io.docker.birthday3.votingapp

import static org.mockito.Matchers.*

import static org.mockito.Mockito.*

import io.docker.birthday3.votingapp.worker.MockApplicationConfiguration
import io.docker.birthday3.votingapp.worker.Worker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.data.redis.core.ListOperations
import org.springframework.data.redis.core.StringRedisTemplate
import spock.lang.Specification

@SpringApplicationConfiguration([MockApplicationConfiguration])
class WorkerSpec extends Specification {

    @Autowired
    StringRedisTemplate voteTemplate

    @Autowired
    Worker worker

    void "Transfer data"() {
        given:
        ListOperations listOperations = Mock()
        1 * listOperations.leftPop(_ as String) >> '{"vote_id": "738a9f", "vote": "Groovy"}'

        and:
        doReturn(listOperations).when(voteTemplate).opsForList()

        when:
        worker.work()

        then:
        { verify(voteTemplate).opsForList() }
    }

}
