# /opt/vyatta/etc/config/config.boot
set interfaces ethernet eth0 address 'dhcp'
set interfaces ethernet eth0 duplex 'auto'
set interfaces ethernet eth0 hw-id '08:00:27:49:f7:56'
set interfaces ethernet eth0 smp_affinity 'auto'
set interfaces ethernet eth0 speed 'auto'
set interfaces ethernet eth2 address '172.16.0.1/24'
set interfaces ethernet eth2 hw-id '00:40:26:c0:0f:8f'
set interfaces loopback 'lo'
set service dhcp-server shared-network-name MY_POOL subnet 172.16.0.0/24 default-router '172.16.0.1'
set service dhcp-server shared-network-name MY_POOL subnet 172.16.0.0/24 dns-server '8.8.8.8'
set service dhcp-server shared-network-name MY_POOL subnet 172.16.0.0/24 start 172.16.0.128 stop '172.16.0.196'
set service nat rule 900 outbound-interface 'eth0'
set service nat rule 900 type 'masquerade'
set service ssh
set system config-management commit-revisions '20'
set system console device ttyS0 speed '9600'
set system host-name 'vyatta'
set system login user vyatta authentication encrypted-password '$1$e1giAVW9$3KFmKKIpipZ1Zb81Czhxc1'
set system login user vyatta level 'admin'
set system ntp server '0.vyatta.pool.ntp.org'
set system ntp server '1.vyatta.pool.ntp.org'
set system ntp server '2.vyatta.pool.ntp.org'
set system package auto-sync '1'
set system package repository community components 'main'
set system package repository community distribution 'stable'
set system package repository community password ''
set system package repository community url 'http://packages.vyatta.com/vyatta'
set system package repository community username ''
set system syslog global facility all level 'notice'
set system syslog global facility protocols level 'debug'
set system time-zone 'Asia/Tokyo'

