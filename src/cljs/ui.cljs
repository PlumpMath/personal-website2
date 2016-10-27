(ns cljs.ui)

(defn width []
  (.-innerWidth js/window))

(defn height []
  (.-innerHeight js/window))

(defn equally-among-elem [elem]
  "Return the share of each element's share of dimensions, based on size of elem."
  (str (/ 100 (count elem)) "%"))

(def basic-style {:font-family "Andale Mono"
                  :margin "0px"
                  :padding "0px"})

(def flex-shims {:display "flex"
                 :flex-wrap "wrap"
                 :flex-direction "row"})

(def basic-flex-row-style (conj flex-shims
                            {:min-height "50px"
                             :margin "0px"}
                                basic-style))
