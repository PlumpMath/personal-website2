(set-env!
  ;; using the sonatype repo is sometimes useful when testing Clojurescript
  ;; versions that not yet propagated to Clojars
  ;; :repositories #(conj % '["sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"}])
  :dependencies '[[org.clojure/clojure        "1.8.0"]
                  [org.clojure/clojurescript  "1.9.293"]
                  [hoplon                     "6.0.0-alpha16" :scope "provided"]
                  [hoplon/boot-hoplon         "0.3.0" :scope "test"]
                  [adzerk/boot-reload         "0.4.13"]
                  [tailrecursion/boot-jetty   "0.1.3"]
                  [adzerk/boot-cljs           "1.7.48-5"]
                  [hoplon/javelin             "3.8.4"]
                  [adzerk/boot-cljs-repl      "0.3.3"] ;; latest release
                  [com.cemerick/piggieback    "0.2.1"  :scope "test"]
                  [weasel                     "0.7.0"  :scope "test"]
                  [org.clojure/tools.nrepl    "0.2.12" :scope "test"]]

  :source-paths  #{"src"}
  :asset-paths   #{"assets"})

  (require
    '[adzerk.boot-cljs         :refer [cljs]]
    '[adzerk.boot-reload       :refer [reload]]
    '[hoplon.boot-hoplon       :refer [hoplon prerender]]
    '[tailrecursion.boot-jetty :refer [serve]]
    '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])

(deftask hoplon-serve []
  (comp
    (watch)
    (hoplon :pretty-print true)
    (reload)
    (cljs-repl)
    (cljs)
    (serve :port 8000)))
