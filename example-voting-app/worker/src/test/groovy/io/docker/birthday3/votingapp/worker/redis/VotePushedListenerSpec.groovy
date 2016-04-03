package io.docker.birthday3.votingapp.worker.redis

import io.docker.birthday3.votingapp.worker.Worker
import org.springframework.data.redis.connection.Message
import spock.lang.Specification

class VotePushedListenerSpec extends Specification {

    void "Vote pushed"() {
        given:
        String list = 'votes'
        VotePushedListener listener = new VotePushedListener(list: list)

        and:
        Worker worker = Mock()
        listener.worker = worker

        and:
        Message message = Mock()
        message.body >> list

        when:
        listener.onMessage(message)

        then:
        1 * worker.transferVote()
    }

}
