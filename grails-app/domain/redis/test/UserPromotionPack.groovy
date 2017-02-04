package redis.test

class UserPromotionPack {

  int userId
  UserListingDetail userListingDetail
  static hasMany = [promotionPacks: PromotionPack]

    static constraints = {
    }
}
