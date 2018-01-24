(ns sherlock-and-array.core
  (:require
    [clojure.string :as string]))


(defn solve
  "I don't do a whole lot."
  [s]
  (comment Your code goes here))


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

