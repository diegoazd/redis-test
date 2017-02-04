dataSource {
    pooled = true
       driverClassName = "com.mysql.jdbc.Driver"
       username = "root"
       password = ""
       dialect = org.hibernate.dialect.MySQL5InnoDBDialect
       dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
       url = "jdbc:mysql://localhost/test?useOldAliasMetadataBehavior=true"
       properties {
                 maxActive = 40
                 maxIdle = 10
                 minIdle = 5
                 initialSize = 5
                 minEvictableIdleTimeMillis = 1800000
                 timeBetweenEvictionRunsMillis = 1800000
                 maxWait = 300
                 ValidationQuery = 'select 1'
              }
}



hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
