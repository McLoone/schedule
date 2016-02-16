(ns api-test
  (:require [clojure.test :refer :all]
            [api :refer :all]
            [ring.mock.request :as mock]))

(deftest simple-api-test
  (testing "A simple api test"
  	(let [result (handler (mock/request :get "/"))]
  	(is (= (result :status) 200))
  	(is (= (result :body) "<html>Hello, Internet.</html>")))))