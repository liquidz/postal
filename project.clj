(defproject liquidz/postal "3.0.2-SNAPSHOT"
  :description "JavaMail on Clojure"
  :url "https://github.com/liquidz/postal"
  :license {:name "MIT"
            :url "http://en.wikipedia.org/wiki/MIT_License"
            :distribution :repo
            :comments "Use at your own risk"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[commons-codec "1.12"]
                 [com.sun.mail/jakarta.mail "1.6.3"]
                 [jakarta.mail/jakarta.mail-api "1.6.3"]]
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}}
  :aliases
  {"test-all" ["with-profile" "1.9:1.10" "test"]})
