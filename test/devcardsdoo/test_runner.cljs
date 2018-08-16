(ns devcardsdoo.test-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [devcardsdoo.my-tests]))

(doo-tests 'devcardsdoo.my-tests)
