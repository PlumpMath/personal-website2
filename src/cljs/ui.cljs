(ns cljs.ui)

(defn equally-among-elem [elem]
  "Return the share of each element's share of dimensions, based on size of elem."
  (str (/ 100 (count elem)) "%"))

(def basic-flex-row-style {:font-family "Andale Mono"
                           :width "100%"
                           :display "flex"
                           :flex-wrap "wrap"
                           :flex-direction "row"
                           :min-height "50px"})
