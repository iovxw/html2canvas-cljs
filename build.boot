(set-env!
  :resource-paths #{"src"}
  :dependencies '[[org.clojure/clojurescript "1.9.225"]]
  :repositories (conj (get-env :repositories)
                  ["clojars" {:url "https://clojars.org/repo/"
                              :username (System/getenv "CLOJARS_USER")
                              :password (System/getenv "CLOJARS_PASS")}]))

(task-options!
  pom {:project 'html2canvas
       :version "0.5.0-beta4"
       :description "ClojureScript bindings for html2canvas"
       :url "http://html2canvas.hertzen.com/"
       :scm {:url "https://github.com/iovxw/html2canvas-cljs"}
       :license {"Public Domain" "http://unlicense.org/UNLICENSE"}}
  push {:repo "clojars"})

(deftask try []
  (comp (pom) (jar) (install)))

(deftask deploy []
  (comp (pom) (jar) (push)))

