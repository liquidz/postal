(defproject com.draines/postal "3.0.0-SNAPSHOT"
  :description "JavaMail on Clojure"
  :url "https://github.com/drewr/postal"
  :license {:name "MIT"
            :url "http://en.wikipedia.org/wiki/MIT_License"
            :distribution :repo
            :comments "Use at your own risk"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[commons-codec "1.11"]
                 [com.sun.mail/javax.mail "1.6.1"]
                 [javax.mail/javax.mail-api "1.6.1"]]
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]]}})
