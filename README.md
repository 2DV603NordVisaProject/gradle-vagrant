# Gradle-Vagrant
An Ubuntu 14.04 vagrant configuration for Java 8 development with Gradle.

## Host requirements
* Vagrant
* VirtualBox

## Setup
#### Existing Gradle Project
1. Clone or download gradle-vagrant
1. Move your existing project to the gradle-vagrant folder, alt move Vagrantfile to existing project
1. Open terminal and run `vagrant up`
1. SSH into VM with `vagrant ssh`
1. If you project is in a subfolder change to that directroy
1. From here you can run Gradle tasks

#### New Gradle Project
1. Clone or download gradle-vagrant
1. Open terminal and run `vagrant up`
1. SSH into VM with `vagrant ssh`
1. Create project folder `mkdir project_name` and move into this directory
1. Create project `gradle init`
1. From here you can run Gradle tasks
