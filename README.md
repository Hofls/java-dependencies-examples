# JVM
* `HotSpot` - default
* `GraalVM` - good for serverless computing (50x faster startup, 5x smaller footprint)
* `Openj9` - good for cloud (2x faster startup, 2x smaller footprint)

# GC
* `Parallel GC` - default (before java 9)
* `G1 Collector` - default (java 9+)
* `ZGC` - low pause times, good for large heap sizes (up to 4 terabytes)
* `Shenandoah` - low pause times, good for large heap sizes 

# Java code in another repositories:
* `devops`
    * `Docker`
* `architecture`
