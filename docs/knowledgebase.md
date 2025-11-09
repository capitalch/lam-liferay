# Liferay Architecture Overview
- Liferay is powered by OSGi (Open Services Gateway initiative).
- Editions
	- Free: CE
	- DXP: Paid
	- Cloud: PASS version of DXP
- Kaelo workflow

# Key Components
- Liferay Portal / DXP	The core platform that hosts portals, applications, and pages.
- Liferay CMS	Content management module — manages structured and unstructured content, documents, and web content.
- Liferay Themes & Layouts	Define look and feel of pages using FreeMarker templates and CSS.
- Liferay Portlets (Modules)	Functional components (like mini-apps) deployed inside the portal. Built using Java, JSP, React, or JS frameworks.
- Service Builder	Liferay’s code generation tool to define models and automatically create services, persistence, and APIs.
- Liferay Marketplace	Repository for downloading and sharing plugins and modules.

# LifeRay DXP(Digital Experience Platform) is enterprise edition

# Development Model

Developers can extend Liferay in several ways:

Portlet Module	Java + JSP / React	Mini-application in a page (e.g., dashboard, report).
Theme / Layout	FreeMarker / CSS / JS	Defines page UI and layout.
Service Builder Module	Java	Generates persistence layer and APIs.
Fragment / Widget	HTML + JS + CSS	Lightweight reusable UI blocks.
Headless APIs	JSON / GraphQL	Integrate content into other frontends.

Liferay supports modern frontends (React, Angular, Vue) through remote apps and JS modules.

# Blade CLI (short for Liferay Blade Command-Line Interface) is the official developer tool for creating, building, and deploying Liferay modules, portlets, themes, and OSGi components.