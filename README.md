
Skeleton project for meetup https://www.meetup.com/FunctionalKubs/events/246876977/

# Problem

Sherlock and Array - https://www.hackerrank.com/challenges/sherlock-and-array/problem

Implement the `solve` function in `src/sherlock_and_array/core.clj`

# Testing

The unit tests are contained in `test/sherlock_and_array/core_test.clj`

To run the tests once, use `lein test`

To automatically rerun the tests any time the source files change, use `lein test-refresh`

The tests have been setup with the sample data from the HackerRank problem spec.

# Running on HackerRank

HackerRank isn't set up as a leiningen project or standalone application, so you will need to
manulally call `main`. The simplest way to do this is to add the following line of code to the
end of `core.clj` (after the definition of `main`) before uploading the file or pasting it to
HackerRank:

```clj
(main)
```
