(ns swagger.handler
  (:require [compojure.api.sweet :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (api
    {:swagger {:ui "/api-docs"
               :spec "/swagger.json"}}
    (GET "/" [] "Hello World"))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
