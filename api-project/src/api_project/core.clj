(ns api-project.core)

(defn ^:controller ctrl [srv]
  (str srv "hello"))
(defn ^:service srv [one two three four])
(defn ^:service srv-two [nice])

(defn di-component? [x]
  (let [m (meta x)]
    (or (:controller m) (:service m))))

(defn di-structure [entry]
  (let [v (val entry)
        k (key entry)
        m (meta v)
        a (first (:arglists m))]
  { :name k :var v :meta m :args a }))


(defn all-fns [n]
  (map di-structure (filter
                      (fn [row]
                        (di-component? (val row)))
                      (ns-publics n))))

(all-fns 'api-project.core)

(def injections (flatten (map all-fns (all-ns))))

(defn fetch-meta [name]
  (let [n name]
    (filter (fn [i] (= n (:name i)))
             injections)))

(defn annotate [component]
  (-> component fetch-meta first :args))

(annotate 'ctrl)
; users.json
; users.xml
; users.clj
    

; user-image
    ;  { image:  '...', height:0, width:0 }
