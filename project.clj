(defproject liquidz/postal "3.0.1-SNAPSHOT"
  :description "JavaMail on Clojure"
  :url "https://github.com/liquidz/postal"
  :license {:name "MIT"
            :url "http://en.wikipedia.org/wiki/MIT_License"
            :distribution :repo
            :comments "Use at your own risk"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[commons-codec "1.11"]
                 [com.sun.mail/javax.mail "1.6.2"]
                 [javax.mail/javax.mail-api "1.6.2"]]
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.0-beta4"]]}}
  :aliases
  {"test-all" ["with-profile" "1.9:1.10" "test"]})
