(ns logic.core
  (:refer-clojure :exclude [==])
  (:use clojure.core.logic))

(run* [q]
  (fresh [a b c d]
    (membero a [true false])
    (membero b [true false])
    (membero c [true false])
    (membero d [true false])
    (== q [a b c d])))

(for [w [true false]
      x [true false]
      y [true false]
      z [true false]]
     [w x y z])

