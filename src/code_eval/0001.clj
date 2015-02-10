(ns code-eval.0001)

(defn answer [x y num]
  (let [nums (range 1 (inc num))]
    (map #(cond
           (and (= (mod % x) 0)
                (= (mod % y) 0)) "FB"
           (= (mod % x) 0) "F"
           (= (mod % y) 0) "B"
           :else (str %)
           ) nums)))
