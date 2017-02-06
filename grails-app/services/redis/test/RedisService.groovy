package redis.test
import redis.clients.jedis.Jedis
import static groovyx.gpars.actor.Actors.actor

class RedisService {

    int sumQuota(String userId) {
      quotaManager.sendAndWait(userId)
    }

    final def quotaManager = actor {
      loop {
        react { String userId ->
          Jedis jedis = new Jedis("localhost")
          int quota = Integer.valueOf(jedis.get(userId))
          println quota
          quota++
          jedis.set(userId, "${quota}")
          reply quota
        }
      }
    }
}
