(ns cljs.ui)

(defn width []
  (.-innerWidth js/window))

(defn height []
  (.-innerHeight js/window))
