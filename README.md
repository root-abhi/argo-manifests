# Jenkins Shared Libraries 

This repository demonstrates the use of Jenkins Shared Libraries to streamline CI/CD processes. Key features include:

- **Reusable Managed Pipelines:** Encapsulates build, test, and deploy stages.
- **Quality Checks:** Integrates tools like SonarQube, Trufflehog, Aqua, and Nexus IQ.
- **Robust Release Process:** Ensures reliable and tested versioning.
- **Automated Testing Frameworks:** Simplifies integration and end-to-end testing.

## Setup
1. Clone the repository.
2. Link the `vars` directory in Jenkins under "Global Pipeline Libraries."
3. Configure tools like SonarQube, Aqua, and Nexus IQ.

## Example Usage
Include in your `Jenkinsfile`:
```groovy
@Library('jenkins-shared-libraries-showcase') _
pipelineLibrary(config: [projectKey: 'MyProject'])

