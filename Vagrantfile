# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
    config.vm.box = "ubuntu/yakkety64"

    config.vm.provider "virtualbox" do |vb|
        vb.memory = "2048"
    end

    config.vm.provision "shell", privileged: true, inline: <<-SHELL
        apt-get update
    SHELL

    config.vm.provision "shell", privileged: true, inline: <<-SHELL
        add-apt-repository ppa:webupd8team/java
        apt-get update
        echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
        apt-get -y install oracle-java8-set-default

        echo JAVA_HOME="/usr/lib/jvm/java-8-oracle" >> /etc/environment

        # Quick fix for Gradle not having correct JAVA_HOME path.
        sudo ln -s /usr/lib/jvm/java-8-oracle /usr/lib/jvm/default-java
    SHELL

    config.vm.provision "shell", privileged: true, inline: <<-SHELL
        apt-get -y install gradle
        echo cd /vagrant >> .bashrc
    SHELL
end
