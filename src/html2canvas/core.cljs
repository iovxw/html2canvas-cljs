(ns html2canvas.core
  (:require [js.html2canvas]))

(defn- options [options]
  (clj->js (into {} (remove (comp nil? val) options))))

(defn html2canvas
  "Take a screenshot of an element.
  Available options:
  http://html2canvas.hertzen.com/documentation.html#available-options"
  [element & {:keys [on-rendered allow-taint background
                                 height width letter-rendering logging
                                 proxy taint-test timeout use-cors]}]
  (js/html2canvas element (options {:onrendered on-rendered
                                    :allowTaint allow-taint
                                    :background background
                                    :height height :width width
                                    :letterRendering letter-rendering
                                    :logging logging :proxy proxy
                                    :taintTest taint-test :timeout timeout
                                    :useCORS use-cors})))
