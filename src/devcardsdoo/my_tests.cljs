(ns devcardsdoo.my-tests
  (:require [clojure.test :refer [is]]
            [devcards.core :refer-macros [defcard deftest]]))

(deftest my-test
  (is (= 1 1)
      "i'm a test "))
