(defproject hellskitchen "0.1.0-SNAPSHOT"
  :description "My clojure hell's kitchen"
  :url "http://github.com/andrzejsliwa/hellskitchen"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot hellskitchen.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
