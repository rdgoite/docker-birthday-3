package io.docker.birthday3.votingapp

import io.docker.birthday3.votingapp.worker.Worker
import org.springframework.data.redis.core.ListOperations
import org.springframework.data.redis.core.StringRedisTemplate
import spock.lang.Specification


class WorkerSpec extends Specification {

    void "Transfer data"() {
        given:
        ListOperations listOperations = Mock()
        1 * listOperations.leftPop(_ as String) >> '{"vote_id": "738a9f", "vote": "Groovy"}'

        and:
        StringRedisTemplate voteTemplate = Mock()
        1 * voteTemplate.opsForList() >> listOperations

        and:
        Worker worker = new Worker(voteTemplate: voteTemplate)

        expect:
        worker.work()

        //then:
        //voteTemplate.opsForList()
        //1 * voteTemplate.opsForList()
        //1 * listOperations.leftPop('votes')
        //voteTemplate.opsForList()
    }

}
