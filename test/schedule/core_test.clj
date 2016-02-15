(ns schedule.core-test
  (:require [clojure.test :refer :all]
            [schedule.core :refer :all]))

(deftest add-event-to-empty-schedule
  (testing "Adding event to empty schedule"
  	(let [schedule (create-schedule "s1") 
  		  event (create-event 123 "test")
  		  updated-schedule (add-event schedule event)] 
    (is (= ((get (updated-schedule :events) 0) :id) 123)))))

(deftest add-another-event-to-empty-schedule
  (testing "Adding another event to empty schedule"
  	(let [schedule (create-schedule "s1") 
  		  event (create-event 456 "test")
  		  updated-schedule (add-event schedule event)] 
    (is (= ((get (updated-schedule :events) 0) :id) 456)))))