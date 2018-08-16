Like devcards tests?
Still want to run your tests from the command line with doo too?
This currently doesn't quite work, this repo shows why.

This repo was created by doing these steps:

1. Create a project with `lein new devcards devcardsdoo`
2. Adding a test
3. Adding a doo test build
4. Updated to latest versions with lein ancient

To see the devcards run

    lein figwheel

To run the tests via doo

    lein doo nashorn test

