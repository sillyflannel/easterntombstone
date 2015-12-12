;    Copyright © 2015 Emory Merryman <emory.merryman@gmail.com>
;
;    This file is part of digitalbird.sillyflannel.{{name}}.
;
;    digitalbird.sillyflannel.{{name}} is free software: you can redistribute it and/or modify
;    it under the terms of the GNU General Public License as published by
;    the Free Software Foundation, either version 3 of the License, or
;    (at your option) any later version.
;
;    digitalbird.sillyflannel.{{name}} is distributed in the hope that it will be useful,
;    but WITHOUT ANY WARRANTY; without even the implied warranty of
;    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;    GNU General Public License for more details.
;
;    You should have received a copy of the GNU General Public License
;    along with digitalbird.sillyflannel.{{name}}.  If not, see <http://www.gnu.org/licenses/>.
(defproject digitalbird.randomsmoke.{{name}} "0.1.0-SNAPSHOT" :description "FIXME" :repositories [["local" "file://stormyiron"]] :url "https://github.com/randomsmoke/{{name}}" :license {:name "GNU GPL 3" :url "http://www.gnu.org/licenses/gpl-3.0.en.html"} :dependencies [[org.clojure/clojure "1.7.0"]] :plugins [[lein-ancient "0.6.8" :exclusions [org.clojure/clojure]] [lein-kibit "0.1.2"] [jonase/eastwood "0.2.1"] [lein-bikeshed "0.2.0"] [lein-cloverage "1.0.6"]] :aliases {"omni" ["do" ["clean"] ["test"] ["with-profile" "production" "deps" ":tree"] ["ancient"] ["kibit"] ["bikeshed" "-m" "1000"] ["cloverage"] ["deploy" "local"]]} :repositories [["local" "file://stormyiron"]]   :dependencies [[org.clojure/clojure "1.7.0"]] :plugins [[lein-ancient "0.6.8" :exclusions [org.clojure/clojure]] [lein-kibit "0.1.2"] [jonase/eastwood "0.2.1"] [lein-bikeshed "0.2.0"] [lein-cloverage "1.0.6"]] :aliases {"omni" ["do" ["clean"] ["test"] ["with-profile" "production" "deps" ":tree"] ["ancient"] ["kibit"] ["bikeshed" "-m" "1000"] ["cloverage"] ["deploy" "local"]]})
