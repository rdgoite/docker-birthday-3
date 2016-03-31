package io.docker.birthday3.votingapp.worker

import com.fasterxml.jackson.annotation.JsonProperty

class Vote {

    String id

    @JsonProperty('voter_id')
    String voterId
    String vote

}
