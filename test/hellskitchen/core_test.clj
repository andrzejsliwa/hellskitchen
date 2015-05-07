(ns hellskitchen.core-test
  (:use midje.sweet)
  (:require [hellskitchen.core :refer :all]))

(facts "about `hexdump'"

  (fact "it normally returns string representation of hex values"
    (hexdump (byte-array 8)) => "00 00 00 00 00 00 00 00")

  (fact "it splits array to rows with defined size"
    (hexdump 4 (byte-array 8)) => "00 00 00 00\n00 00 00 00")

  (fact "it fill missing bytes to match row size"
    (hexdump 4 (byte-array 2)) => "00 00 00 00"
    (hexdump 4 (byte-array 4)) => "00 00 00 00"))
