(ns in.freegeek.yfinance-test
  (:use [in.freegeek.yfinance] :reload-all)
  (:use [clojure.test]))

(deftest aapl-ibm-test
  (is (= (fetch-historical-data "2009-01-01" "2009-01-15" ["AAPL" "IBM" "nonexistentSymbol"])
         {"nonexistentSymbol" 404, "AAPL" "Date,Open,High,Low,Close,Volume,Adj Close\n2009-01-15,80.57,84.12,80.05,83.38,65415500,83.38\n2009-01-14,86.24,87.25,84.72,85.33,36488000,85.33\n2009-01-13,88.24,89.74,86.35,87.71,28514200,87.71\n2009-01-12,90.46,90.99,87.55,88.66,22061300,88.66\n2009-01-09,93.21,93.38,90.14,90.58,19530200,90.58\n2009-01-08,90.43,93.15,90.04,92.70,23912000,92.70\n2009-01-07,91.81,92.50,90.26,91.01,26894600,91.01\n2009-01-06,95.95,97.17,92.39,93.02,46046800,93.02\n2009-01-05,93.17,96.18,92.71,94.58,42200300,94.58\n2009-01-02,85.88,91.04,85.16,90.75,26643400,90.75\n", "IBM" "Date,Open,High,Low,Close,Volume,Adj Close\n2009-01-15,83.61,84.83,82.26,84.12,11734800,82.11\n2009-01-14,84.20,84.82,82.11,83.19,9470000,81.20\n2009-01-13,85.50,86.59,84.79,85.34,7657200,83.30\n2009-01-12,84.57,86.60,84.42,85.71,8072700,83.66\n2009-01-09,87.05,87.50,84.25,84.70,7440300,82.67\n2009-01-08,87.81,88.14,85.98,87.18,7231800,85.09\n2009-01-07,87.83,88.80,87.12,87.79,8455100,85.69\n2009-01-06,87.11,90.41,86.37,89.23,9649500,87.09\n2009-01-05,86.42,87.67,86.18,86.82,8315700,84.74\n2009-01-02,83.89,87.59,83.89,87.37,7558200,85.28\n"})))


