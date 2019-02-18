(ns scadproject.core
   (:use [scad.clj.scad])
   (:use [scad.clj.model])
   )

(def primitives
  (union
   (->> (cube 100 100 100)
        (rotate (/ math/PI 4) [1 1 1])
        (translate [150 0 0]))
   (->> (sphere 70)
        (scale [1/2 1/2 2])))

  (spit "post-demo.scad"
        (write-scad primitives))




