(ns hellskitchen.core
  (:require [com.stuartsierra.component :as component])
  (:gen-class))

(defn system
  []
  (-> (component/system-map)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
