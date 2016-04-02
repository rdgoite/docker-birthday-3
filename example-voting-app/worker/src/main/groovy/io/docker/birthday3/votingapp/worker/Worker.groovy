package io.docker.birthday3.votingapp.worker

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Service

@Service
class Worker {

    @Autowired
    StringRedisTemplate voteTemplate

    void work() {
        voteTemplate.opsForList().leftPop('votes')
    }

}
