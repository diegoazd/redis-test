package redis.test
import redis.clients.jedis.Jedis

class RedisService {

    int sumQuota(String userId) {
      Jedis jedis = new Jedis("localhost")
      /*
      int quota = Integer.valueOf(jedis.get(userId))
      println quota
      quota++
      jedis.set(userId, "${quota}")
      quota*/
      def value = jedis.incr(userId)
      if(value > 15) {
        println 'fail'
      }
      jedis.quit()
      value
    }
}
