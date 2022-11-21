//Here I have used 2 switch and trying to communicate from one switch to another switch creating two Virtual LAN (vlan100 and vlan200) Under each switch.
Step-1: set ip on every PC.
Step-2: connect three computers to each routers .
Step-3: create vlan for every switch ports (vlan100 for even PC and vlan200 for odd PC).
Step-4: connect the two switches via fastEthernet0/10.

//*******************CLI***********************
// for switch1
switch> enable
switch# configure terminal
switch(config)# interface fa0/1
switch(config-if)# switchport mode access
switch(config-if)# switchport access vlan 200
switch(config-if)# no shut
switch(config-if)# exit

witch(config)# interface fa0/2
switch(config-if)# switchport mode access
switch(config-if)# switchport access vlan 100
switch(config-if)# no shut
switch(config-if)# exit

witch(config)# interface fa0/3
switch(config-if)# switchport mode access
switch(config-if)# switchport access vlan 200
switch(config-if)# no shut
switch(config-if)# exit
switch(config)# do write memory

// for switch2
witch(config)# interface fa0/1
switch(config-if)# switchport mode access
switch(config-if)# switchport access vlan 100
switch(config-if)# no shut
switch(config-if)# exit

witch(config)# interface fa0/2
switch(config-if)# switchport mode access
switch(config-if)# switchport access vlan 200
switch(config-if)# no shut
switch(config-if)# exit

witch(config)# interface fa0/1
switch(config-if)# switchport mode access
switch(config-if)# switchport access vlan 100
switch(config-if)# no shut
switch(config-if)# exit
switch(config)# do write memory

// connecting to switches via fa0/10
// select switch1
switch(config)# interface fa0/10
switch(config-if)# switchport mode trunk
switch(config-if)# no shut
switch(config-if)# exit
switch(config)# do write memory

// select switch2
switch(config)# interface fa0/10
switch(config-if)# switchport mode trunk
switch(config-if)# no shut
switch(config-if)# exit
switch(config)# do write memory

//***********thanks*****************



