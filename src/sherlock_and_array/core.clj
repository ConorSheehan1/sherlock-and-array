(ns sherlock-and-array.core
  (:require
    [clojure.string :as string]))

(defn sum
  "Sums a sequence of numbers"
  [s]
  (reduce + s))

(defn split
  "Splits a sequence into two"
  [pivot s]
  (let [[left right] (split-at pivot s)]
    [left (drop 1 right)]))

(defn solve
  "Solve sequence s of n elements in size. This function processes a single sequence and should
  output a single result to stdout (eg, using println)"
  [s]
  (if (some true?
        (for [i (range (count s))]
          (let [[left right] (split i s)]
            (= (sum left) (sum right)))))
    (println "YES")
    (println "NO")))


(defn read-int
  "Helper to read a line of text from stdin as a single integer and return it"
  []
  (Integer/parseInt (read-line)))

(defn read-int-seq
  "Helper to read a line of text from stdin and parse a whitespace seperated vector of integers and return it"
  []
  (mapv #(Integer/parseInt %)
        (string/split (read-line) #" ")))

(defn main
  [& args]
  (let [num-tests (read-int)]
    (doseq [test-number (range num-tests)]
      (let [num-elements (read-int)
            input-sequence (read-int-seq)]
        (assert (= num-elements (count input-sequence)))
        (solve input-sequence)))))

