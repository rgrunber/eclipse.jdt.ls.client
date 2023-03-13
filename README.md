# This Repository Has Moved !

Active development is now done at https://github.com/mickaelistria/eclipseide-jdtls. Follow https://github.com/mickaelistria/eclipseide-jdtls/issues/29 for further details.

# Java edition in Eclipse IDE, using the JDT Language Server

This repository implements a client for JDT-LS to provide edition of .java files in the Eclipse IDE. This can be used as an alternative to Eclipse JDT. Installation of Eclipse JDT is not required for this plugin to work; the JDT Language Server is referenced as an external application (so far).

## 💡 Motivation

Language Server Protocol has conquered the world of code edition; in Eclipse IDE, it's used in order to provide edition support for many language and technologies (see https://github.com/eclipse/lsp4e for details). Eclipse JDT-LS is a mature language server serving popular dev tools (eg https://github.com/redhat-developer/vscode-java ).

The goal of this project is to give ability to try this LS in the Eclipse IDE and easily compare it with Eclipse JDT UI, to detect what are the main gaps and how to fill them; to facilitate joined development of those 2 JDT "frontends" and maybe ultimately to consider using the Language Server-based editor as a replacement for the existing heavily customized JDT editor if it appears it can bring as much value with less maintenance effort.

## ⚗️ Status: Experimental/Alpha

The current state of this software is Experimental/Alpha: it is currently working as a minimal viable product but it is not polished for general usage yet. However, there are strong chances that maintenance effort continues on that software so it reaches a more mature state in the future.

However, anyone is encouraged to try it (and to contribute): it's easy to install it, use it and uninstall it later; without risk of harming your IDE.

## 📥 Installation

You can install it in your Eclipse IDE or Eclipse RCP applicaiton using *Help > Install New Software* and pointing to https://rgrunber.github.io/eclipse.jdt.ls.client and installing the only installable item.

TODO: an Eclipse Marketplace entry.

## 🏗️ Building

`mvn clean verify`; output p2 repo is then available for local installation in `repository/target/repository`

## ⌨️ Contributing

Please provide your contributions through the usual GitHub channels: PRs, Issues, Discussions...