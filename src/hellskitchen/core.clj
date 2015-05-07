(ns hellskitchen.core
  (:require [com.stuartsierra.component :as component]
            [clojure.string :as string])
  (:gen-class))

(defn system
  []
  (-> (component/system-map)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn- count-hexdump-supply
  [row-size data]
  (let [size (count data)
        reminder (rem size row-size)]
    (if (= reminder 0)
      0
      (- row-size reminder))))

(defn hexdump
  "dump array of bytes to string containing hex values"
  ([array]
   (hexdump (count array) array))
  ([row-size data]
   (let [size (count  data)
         reminder (rem size row-size)
         supply-size (if (= reminder 0)
                       0
                       (- row-size reminder))]
     (->> data
          (concat (byte-array (count-hexdump-supply row-size data)))
          (map #(format "%02x" %))
          (partition row-size)
          (map #(String/join " " %))
          (string/join "\n")))))
