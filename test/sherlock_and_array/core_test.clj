(ns sherlock-and-array.core-test
 (:require [clojure.test :refer :all]
           [sherlock-and-array.core :refer :all]))

(deftest solve-sample-input
  (testing "First sample input should output NO"
    (let [result (with-out-str (solve [1 2 3]))]
      (is (= "NO\n" result))))
  (testing "Second sample input should output YES"
    (let [result (with-out-str (solve [1 2 3 3]))]
      (is (= "YES\n" result)))))


(def sample-input
  "2
3
1 2 3
4
1 2 3 3")

(def sample-output
  "NO
YES
")

(deftest test-full-program
  (testing "Run with sample input"
    (let [actual-output (with-out-str (with-in-str sample-input (main)))]
      (is (= sample-output actual-output)))))

(deftest read-int-test
  (testing "parsing an integer without a newline"
    (let [result (with-in-str "52" (read-int))]
      (is (= 52 result))))

  (testing "parsing an integer with a newline"
    (let [result (with-in-str "14\n" (read-int))]
      (is (= 14 result)))))

