(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :resource-paths
  []
  :exclusions
  []
  :source-paths
  ["src"]
  :repositories
  [["clojars" {:url "https://repo.clojars.org/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :mirrors
  []
  :dependencies
  [[org.clojure/clojure "1.9.0"] [com.rpl/specter "1.1.1"]])