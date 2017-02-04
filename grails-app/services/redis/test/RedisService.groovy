package redis.test

import groovy.sql.Sql

class RedisService {
  def dataSource

    int sumQuota(String userId) {
      /*
      def ld = new ListingDetail(availableListings: 50).save()
      def pp = new PromotionPack(name:'test', listingDetail: ld).save()
      def ld2 = new ListingDetail(availableListings: 30).save()
      def pp2 = new PromotionPack(name:'test2', listingDetail: ld2).save()
      def ld3 = new ListingDetail(availableListings: 15).save()
      def pp3 = new PromotionPack(name:'test3', listingDetail: ld3).save()
      def uld = new UserListingDetail(usedListings: 0).save()
      def upp = new UserPromotionPack(userId: 1, userListingDetail: uld)
      upp.addToPromotionPacks(pp)
      upp.addToPromotionPacks(pp2)
      upp.addToPromotionPacks(pp3)
      upp.save()
      */
      Sql sql = Sql.newInstance(dataSource)
      String result = ''
      sql.call '{call test.test_sp(?,?,?) }',[userId, 'test', Sql.VARCHAR],{ dwells -> 
        println dwells
      }
      sql.close()
    
      0
    }
}
