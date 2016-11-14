# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
    config.vm.box = "ubuntu/xenial64"
    # config.vm.box_check_update = false

    # config.vm.network "forwarded_port", guest: 80, host: 8080
    # config.vm.network "private_network", ip: "192.168.33.10"
    # config.vm.network "public_network"
    # config.vm.synced_folder "../data", "/vagrant_data"

    config.vm.provider "virtualbox" do |vb|
        # Display the VirtualBox GUI when booting the machine
        vb.gui = false
        # Customize the amount of memory on the VM:
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
    SHELL

    config.vm.provision "shell", privileged: true, inline: <<-SHELL
        apt-get -y install gradle
    SHELL
end
