(defproject dvlopt/kafka
            "1.0.0-alpha0"

  :description  "Clojure client for Kafka"
  :url          "https://github.com/dvlopt/milena"
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[dvlopt/void                    "0.0.0"]
                 [org.apache.kafka/kafka-clients "2.0.0"]
                 [org.apache.kafka/kafka-streams "2.0.0"]]
  :profiles     {:dev {:source-paths ["dev"]
                       :main         user
                       :dependencies [[com.taoensso/nippy     "2.13.0"]
                                      [criterium              "0.4.4"]
                                      [org.clojure/clojure    "1.9.0"]
                                      [org.clojure/test.check "0.10.0-alpha2"]]
                       :plugins      [[lein-codox      "0.10.3"]
                                      [venantius/ultra "0.5.1"]]
                       :codox        {:output-path  "doc/auto"
                                      :source-paths ["src"]}
                       :global-vars  {*warn-on-reflection* true}}})
