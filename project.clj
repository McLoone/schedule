(defproject schedule "0.1.0-SNAPSHOT"
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler api/handler}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [liberator "0.14.0"]
                 [compojure "1.4.0"]
                 [ring/ring-core "1.4.0"]])