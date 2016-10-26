(set-env!
  ;; using the sonatype repo is sometimes useful when testing Clojurescript
  ;; versions that not yet propagated to Clojars
  ;; :repositories #(conj % '["sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"}])
  :dependencies '[[org.clojure/clojure       "1.8.0"]
                  [org.clojure/clojurescript "1.9.293"]
                  [hoplon                    "6.0.0-alpha16" :scope "provided"]
                  [hoplon/boot-hoplon         "0.3.0" :scope "test"]
                  [adzerk/boot-reload        "0.4.13"]
                  [tailrecursion/boot-jetty "0.1.3"]
                  [adzerk/boot-cljs "1.7.48-5"]]
  :source-paths  #{"src"}
  :asset-paths   #{"assets"})

  (require
    '[adzerk.boot-cljs         :refer [cljs]]
    '[adzerk.boot-reload       :refer [reload]]
    '[hoplon.boot-hoplon       :refer [hoplon prerender]]
    '[tailrecursion.boot-jetty :refer [serve]])

(deftask hoplon-serve []
  (comp
    (watch)
    (hoplon :pretty-print true)
    (reload)
    (cljs)
    (serve :port 8000)))
