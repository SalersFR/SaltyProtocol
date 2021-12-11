# SaltyProtocol

This is a packet api for Minecraft Java Edition, it supports 1.7 to 1.18 (only 1.7-1.14 for now)

here is how to use it:

# HOW TO USE SALTY PROTOCOL

first we add it as a dependancy :

Maven:

```xml

<repository>
  <id>jitpack.io</id>
  <url>https://jitpack.io</url>
</repository>

<dependency>
  <groupId>com.github.SalersFR</groupId>
  <artifactId>SaltyProtocol</artifactId>
  <version>build-X</version>
</dependency>

```

Gradle:

```gradle

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
        
dependencies {
	        implementation 'com.github.SalersFR:SaltyProtocol:Tag'
	} 
```

after that, in your plugin you have to initialize the api in your class that extends of ```JavaPlugin```

```java

@Override
public void onEnable() {
  //load the api
  SaltyAPI.get().load(this); 
}

```

and add that in your on disable to unload the api

```java

@Override
public void onDisable() {
  //disable it
  SaltyAPI.get().disable(this);
}

```

for listening to packets you have to create a class that extends of ```SaltyPacketListener```
and implements of the abstract methods. You can do a lot of things with the events, here is an example of it

```java

public class MyPacketListener extends SaltyPacketListener {
    
    @Override
    public void onPacketInReceive(SaltyPacketInReceiveEvent event) {
        if(event.getPacketType() == PacketType.IN_CHAT) {
            event.getPlayer().sendMessage("§aYou sent a chat message !");
        }
    }

    @Override
    public void onPacketOutSend(SaltyPacketOutSendEvent event) {

    }
}


```

and finally, just register the listener class in your onEnable like this:


```java

  @Override
    public void onEnable() {
    
        //load the api
        SaltyAPI.get().load(this);
        //register listeners
        SaltyAPI.get().getEventManager().registerListener(new PacketListener());
    }
```

if you need any help feel free to join my discord server here : https://discord.gg/p3PbG6KzUA
