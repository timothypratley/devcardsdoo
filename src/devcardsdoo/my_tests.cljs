(ns devcardsdoo.my-tests
  (:require [clojure.test :refer [is]]
            ;; will not work on nashorn if react and devcards is included
            ;; in the whitespace compiled tests
            #_[devcards.core :refer-macros [defcard deftest]])
  (:require-macros
    ;; must only require the macros
    ;; this will cause warnings but so be it
   [devcards.core :refer [defcard deftest]]))

(deftest my-test
  (is (= 1 1)
      "i'm a test "))
