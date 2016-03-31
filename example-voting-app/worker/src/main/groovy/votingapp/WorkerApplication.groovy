package io.docker.votingapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WorkerApplication {

   static void main(String[] args) {
      SpringApplication.run WorkerApplication, args
   }

}