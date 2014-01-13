WebLogic 10.3 or 11g Jersey with Atmosphere for Server Side Event and WebSockets
================================================================================

- RestFul API ( Jersey 1.18 )
- Atmosphere ( 2.1,0 RC2 )

Installation
------------

JavaServices
- Open in JDeveloper the JavaServices workspace
- Rebuild everything

Test these services on soa suite server ( soa_server1 )
- deploy Jersey 1.18 shared library ( jersey-bundle-1.18.war to the weblogic server)
- deploy workflow to soa_server1

Test these services on integrated weblogic server
- add javax.el-api-2.2.4.jar to your jre/lib/ext of your jdk home
- deploy Jersey 1.18 shared library ( jersey-bundle-1.18.war to the adminserver)
