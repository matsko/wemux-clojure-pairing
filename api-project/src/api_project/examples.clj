(ns api_project.core)
(require ['clojure.string :as 'string])

; 1.1 - lowercase 
(string/lower-case "MATIAS")

; 1.2 - trim (trim, triml, trimr)
(string/trim "MATIAS       .    ")

; 1.3 - concatenation
(str "one" " " "three")
(apply str ["sure" " " "buddy"])
(apply str (interpose "\n" ["1","2","3"]))
(reduce str (map str (keys {:value "matias", :val "yes"})))

; 1.4 - string sequences
(seq "matias")
(map 
       (fn [x]
             (str x "y"))
    (seq "matias"))
(frequencies (seq "animal") )

(defn vowels? [input]
    (every? (fn [x]
                          (re-find (re-pattern "[aeiouAEIOU]+")
                                                        (str x)))
                      (seq input)))

(vowels? "aut")

; 1.5 - char -> ints
(int \a)
(reduce + (map int (seq "matias")))
(#(+ %1 %2) 1 2)

(-> (+ 1 0) (+ 1))

; 1.6 - formatting
(format "%03d-%s" 8 "matias")
(format "%-8s" "matias")
(defn table-it [headings]
    (apply format "%-20s" headings))
(table-it '(one two three))

; 1.7 - find a pattern
(re-find #"a" "matias")
(re-find #"p" "matias")
(re-matches #"(\w)*" "matias")

; 1.8 - find a pattern
(re-seq #"\d+" "123abc123")

; 1.9 - search / replace
(defn replace-i [i]
    (string/replace i "I" "we"))
(defn replace-me [me]
    (string/replace me "me" "we"))
(defn replace-myself [myself]
    (string/replace myself "myself" "us"))
(defn us-instead [word]
    (-> word replace-i replace-me replace-myself))
(us-instead "hey there, I would like thank myself")

; 1.10 - split
(string/split "joonas is gay" #"\s+")

; 1.11 - pluralization
(require '[inflections.core :as inf])
(inf/pluralize 2 "monkey")
(inf/pluralize 2 "monkey" "dicks")
(inf/plural! #"(ox)$" "$1en")
(inf/plural "box")
(inf/parameterize "my name is matias")
(inf/camelize "yo_sup")
(inf/ordinalize 21)

; 1.12 - strings, symbols and keywords
(symbol "every?")
(name :yo)
(def genders { :male "Male" :female "Female" })
(genders (keyword "male"))
(keyword "dicks" "cocks")

; 1.13 - small number accuracy
(+ 6.005e5)
(*' 9999 999 999 9999 9999)

; 1.14 - rational numbers
(type (/ 1 4))
(rationalize (/ 0.25))

; 1.15 - parsing numbers
(Integer/parseInt "-42")
(Integer/parseInt "42")
(Double/parseDouble "0.5")
(Double/parseDouble "-0.5")
(bigint "12345678901234567890123456789012345678901234567890")
(bigdec "0.123123123123123123123123123123123123123123123123")

