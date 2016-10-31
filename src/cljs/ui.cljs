(ns cljs.ui)

(defn divide-equally-among [elem]
  "Return the share of each element's share of dimensions, based on size of elem."
  (str (/ 100 (count elem)) "%"))

(def row {:font-family "Andale Mono"
          :width "100%"
          :display "block"
          :float "left"})

(def box {:display "block"
          :text-align "center"})
