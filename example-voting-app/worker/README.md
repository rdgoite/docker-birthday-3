# Redis Notified Worker

## Work done:
  * restructured as Spring Boot application
    * used Spring Data Redis framework
	* used Spring Data JPA
  * converted code to Groovy
  * converted build to Gradle from Maven
  * used Redis key events notification instead of blocking pop operation
  * created custom Redis Docker image to use custom redis.conf
