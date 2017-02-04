class UrlMappings {

	static mappings = {

    "/users/$userId" {
      controller = "redis"
      action = [POST:'addQuota']
    }

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
