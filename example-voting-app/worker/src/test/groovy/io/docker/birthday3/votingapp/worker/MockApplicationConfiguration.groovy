package io.docker.birthday3.votingapp.worker

import static org.mockito.Mockito.mock

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.core.StringRedisTemplate

@Configuration
class MockApplicationConfiguration {

    @Bean
    StringRedisTemplate voteTemplate() {
        return mock(StringRedisTemplate)
    }

    @Bean
    Worker worker() {
        return new Worker()
    }

}
