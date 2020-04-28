# TabCompleteModifier

This plugin does one thing, and one thing only: It removes the commands specified in the config from a player's tab
completions. It's especially useful when you've negated permissions from a player, but the plugin/server chooses to send
tab completions for that command anyway. It's an alternative to cleaning up tab completions rather than disabling them
entirely since it's quite useful to have.

- There are no commands, just restart the server once you add all the commands in the config.
- I doubt the plugin will need updates in the foreseeable future.
- There are no metrics to deal with.
- It's under the MIT license so do whatever you want with this.

There are no pre-built jars, just clone this repository and run `./gradlew build` or for Windows `gradlew.bat build`