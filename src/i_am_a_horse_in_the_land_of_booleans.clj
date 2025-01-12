(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil)(= x false))
      false
      true
  )
)

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x
    )
  )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false
    )
  )

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))

(defn teen? [age]
  (if (<= 13 age 19)
      true
      false
    )
  )

(defn not-teen? [age]
  (if (teen? age)
    false
    true
    ))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or(list? x) (vector? x)) (* (count x )2)
    :else true
    ))

(defn leap-year? [year]
  (cond
    (not(divides? 4 year)) false
    (not(divides? 100 year)) true
    (not(divides? 400 year)) false
    :else true
    ))
; '_______'
