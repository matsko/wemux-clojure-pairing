(ns css.core
  (:use clojure.string)
  (:require clojure.pprint))

; provide a string of CSS
; breakup the selector and set that as the key
; prop => value
; body > tag { }
; { "body" { :color "red", :font-size 12 })
(defn mock []
  true)
(defn parse-css
  "String text"
  [text]
  (partition 2 (split text #"\s*(\{|\})\s*")))

(defn parse-rule
  "String selector; String properties"
  [& records]
  (for [record records]
    (print record))
    ;(let [selector (first record)
    ;      contents (last record)]
    ;(print selector)
    ;(print contents))
  )

(map (fn [value] (apply parse-rule value)) (parse-css "hello { value } ok { nice }" ))

(defonce my-atom (atom nil))

(comment
  (reset! my-atom "hello atom!")
  (reset! my-atom "new value")
  (reset! my-atom [0 1 2 3])
  (str @my-atom)
)
