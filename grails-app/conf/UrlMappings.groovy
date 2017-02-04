class UrlMappings {

	static mappings = {

    "/users/$userId" {
      controller = "redis"
      action = [POST:'addQuota']
    }

    "/users/$userId/lock" {
      controller = "redis"
      action = [POST:'addQuotaLock']
    }

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
