(ns css-spec
  (:require [speclj.core :refer :all]
            [css.core :refer :all]))
(describe "CSS testing"
  (it "should be true"
    (mock)))


(describe "CSS testing"
  (tags :css)
  (context "mock"
    (it "should be true"
      (mock)))

  (context "parse-css"
    (it "should parse the CSS code"
      (should== (parse-css "div { color: red; }") [["div", "color: red;"]]))

    (it "should parse the CSS rule"
      (should= true true))))
