(defproject sherlock-and-array "0.1.0-SNAPSHOT"
  :description "Project skeleton for Clojure Ireland/Functional Kubs coding kata meetup"
  :url "https://github.com/danielytics/sherlock-and-array"
  :license {:name "MIT License"
            :url "https://raw.githubusercontent.com/danielytics/sherlock-and-array/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.22.0"]]
                   :dependencies [[pjstadig/humane-test-output "0.8.3"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]}})
