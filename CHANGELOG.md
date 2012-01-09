openengsb-domain-contact-2.0.0 2012-01-09
---------------------------------------------------------------------

** Bug
    * [OPENENGSB-2317] - adapt contact domain to current openengsb-framework
    * [OPENENGSB-2582] - Domains and Connectors need to include our snapshot repo to work with deployed snapshots correctly

** Improvement
    * [OPENENGSB-1834] - Enhance contact domain with EDB CUD Events
    * [OPENENGSB-2586] - Include issuetracker, buildserver and inceptionYear from root
    * [OPENENGSB-2598] - Make package structure flat to make wsdl-generation possible

** New Feature
    * [OPENENGSB-2513] - move documentation to domain
    * [OPENENGSB-2575] - Include wsdl definition from 2.4.0 parent

** Task
    * [OPENENGSB-2566] - upgrade openengsb-domain-parent to 2.3.0 in all domains
    * [OPENENGSB-2596] - Adapt domain.name in domains to be e.g. AppointmentDomain instead of Appointment alone
    * [OPENENGSB-2623] - release domain-contact-2.0.0


openengsb-domain-contact-1.2.1 2011-05-23
---------------------------------------------------------------------

First support release of the Contact Domain upgrading to the latest OpenEngSB Framework version and including bundle.info.

** Library Upgrade
    * [OPENENGSB-1508] - Push connectors and domains to latest openengsb-framework-1.3.0.M1
    * [OPENENGSB-1609] - Upgrade openengsb-framework to 1.3.0.M2

** New Feature
    * [OPENENGSB-948] - Add OSGI-INF/bundle.info as used in Karaf to the openengsb bundles

** Task
    * [OPENENGSB-1426] - Release openengsb-domain-contact-1.2.1


openengsb-domain-contact-1.2.0 2011-04-26
---------------------------------------------------------------------

Initial release of the OpenEngSB Contact Domain as standalone package

** Bug
    * [OPENENGSB-1395] - mvn scm tags point to openengsb instead of domain

** Library Upgrade
    * [OPENENGSB-1394] - Upgrade to openengsb-1.2.0.RC1

** New Feature
    * [OPENENGSB-1141] - implement gcontacts connector for domain contact

** Task
    * [OPENENGSB-1322] - adapt domains to new service-manager-api
    * [OPENENGSB-1367] - Release openengsb-domain-contact-1.2.0
    * [OPENENGSB-1396] - Add infrastructure for notice file generation
    * [OPENENGSB-1397] - Add ASF2 license file

