package redis.test

import grails.converters.*

class RedisController {
  
  RedisService redisService

    def addQuota(String userId) { 
      int quota = redisService.sumQuota(userId)
      render(contentType: "application/json") {
        [status:200, message: "quota is: $quota"]
      }  
    }
}
