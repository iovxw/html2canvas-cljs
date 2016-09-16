# html2canvas-cljs [![Clojars Project](https://img.shields.io/clojars/v/html2canvas.svg)](https://clojars.org/html2canvas)

ClojureScript bindings for [html2canvas](http://html2canvas.hertzen.com/)

## Usage

```clojure
(ns example.core
  (:require [html2canvas.core :refer [html2canvas]]))

(html2canvas js/document.body
             :on-rendered #(.appendChild js/document.body %))
```
## License

This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.
