;   This file is part of digitalbird.sillyflannel.easterntombstone.
;
;    digitalbird.sillyflannel.easterntombstone is free software: you can redistribute it and/or modify
;    it under the terms of the GNU General Public License as published by
;    the Free Software Foundation, either version 3 of the License, or
;    (at your option) any later version.
;
;    digitalbird.sillyflannel.easterntombstone is distributed in the hope that it will be useful,
;    but WITHOUT ANY WARRANTY; without even the implied warranty of
;    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;    GNU General Public License for more details.
;
;    You should have received a copy of the GNU General Public License
;    along with digitalbird.sillyflannel.easterntombstone.  If not, see <http://www.gnu.org/licenses/>.
(ns leiningen.new.easterntombstone (:require [leiningen.new.templates :refer [renderer name-to-path ->files]] [leiningen.core.main :as main]))
(def render (renderer "easterntombstone"))
(defn easterntombstone "FIXME: write documentation" [name] (let [data {:name name :sanitized (name-to-path name)}] (main/info "Generating fresh 'lein new' easterntombstone project.") (->files data
; project
                                                                                                                                                                                                ["project.clj" (render "project.clj" data)]
; core
                                                                                                                                                                                                ["src/digitalbird/easterntombstone/{{sanitized}}/core.clj" (render "core.clj" data)]
; core-test
                                                                                                                                                                                                ["test/digitalbird/easterntombstone/{{sanitized}}/core-test.clj" (render "core-test.clj" data)]
; COPYING
                                                                                                                                                                                                ["COPYING" (render "COPYING" data)]
; README
                                                                                                                                                                                                ["README.md" (render "README.md" data)]
; ChangeLog
                                                                                                                                                                                                )))
                                                                                                                                                                                            
