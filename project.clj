(defproject lein-jruby "0.1.2-SNAPSHOT"
  :description "Run JRuby commands from Leiningen."
  :dependencies [[org.jruby/jruby-complete "1.7.3"]
                 ; [org.clojure/java.classpath "0.1.0"]
                 [lancet "1.0.1"]]         
  :eval-in-leiningen true)