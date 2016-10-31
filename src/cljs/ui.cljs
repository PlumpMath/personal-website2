(ns cljs.ui)

(defn equally-among-elem [elem margin]
  "Return the share of each element's share of dimensions, based on size of elem."
  (str (/ 100 (count elem)) "%"))

(def responsive-row {:font-family "Andale Mono"
                     :width "100%"
                     :display "table"
                     :float "left"})

(def box {:display "table-cell"
          :text-align "center"
          :vertical-align "middle"})
