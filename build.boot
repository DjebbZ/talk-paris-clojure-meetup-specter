(def project 'talk-paris-clojure-meetup-specter)
(def version "1.0.0-SNAPSHOT")

(set-env! :source-paths #{"src"}
          :dependencies '[[org.clojure/clojure "1.9.0"]
                          [com.rpl/specter "1.1.1"]])

(deftask dev
         "Launch a local repl ready to use for demo."
         []
         (repl :port 25618))

