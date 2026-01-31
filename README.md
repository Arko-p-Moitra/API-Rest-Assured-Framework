<h1>📌 Overview</h1>

<p>This repository contains a robust and scalable API Automation Testing Framework built using Java, Rest Assured, Maven, and TestNG.
The framework is designed following industry best practices such as modular architecture, POJO-based request/response modeling, centralized configuration, logging, and CI integration.

It can be easily extended to support additional APIs, environments, and reporting mechanisms.</p>


<h2>🧰 Tech Stack</h2>

<ul>
<li>Programming Language: Java</li>
<li>API Automation: Rest Assured</li>
<li>Build Tool: Maven</li>
<li>Test Framework: TestNG</li>
<li>Logging: Log4j2</li>
<li>CI/CD: GitHub Actions</li>
</ul>

<h2>🌐 Application Under Test</h2>
<ul><li>Swagger UI:
http://64.227.160.186:8080/swagger-ui/index.html#/</li>
<li>Website:
https://swift.techwithjatin.com/login</li></ul></br>

<img width="531" height="112" alt="UserDeatils" src="https://github.com/user-attachments/assets/eea73413-ada5-4e50-ab5a-a2cd7dda497f" />
</br></br>

<h2>📁 Project Structure</h2></br>
  <pre>
src
 └── test
     └── java
         ├── com.api.test
         │    └── TestNG test classes
         │
         ├── com.api.model.request
         │    └── POJO classes for request payloads
         │
         ├── com.api.model.response
         │    └── POJO classes for response deserialization
         │
         ├── com.api.base
         │    └── Base configuration classes
         │
         ├── com.api.listeners
         │    └── TestNG listeners for execution tracking
         │
         └── com.api.filters
              └── Rest Assured filters for request/response logging
    </pre>

  <pre>
src
 └── test
     └── resources
         └── log4j2.xml
    </pre>
</br></br>

 <h2>🧱 Framework Design Highlights</h2>
    <ul>
        <li>POJO-based request and response handling <ol><li>clean serialization/deserialization</li> <li>Easy serialization and deserialization using Rest Assured</li></ol> 
          <li>Base layer Abstraction<ol><li>Common configurations like Base URI, authentication, and headers are abstracted from test classes</li> <li>Enhances maintainability and reduces duplication</li></ol> 
        </li>
        <li>Listener & Filter Implementation<ol><li>TestNG listeners capture execution lifecycle events</li> <li>Rest Assured filters intercept requests and responses for logging and debugging</li></ol></li>
        
  </ul>
</div>

<div class="section">
    <h2>📝 Logging & Reporting</h2>

   <h3>🔍 Logging Mechanism</h3>
    <p>
        The framework uses <strong>Log4j2</strong> to log execution details.
        Logs are generated both in the console and in dedicated <code>.log</code> files.
    </p>

   <h3>📄 Logged Information</h3>
    <ul>
        <li>Request URI and HTTP method</li>
        <li>Request payload</li>
        <li>Response status code</li>
        <li>Response body</li>
        <li>Test execution status</li>
        <li>Exception stack traces</li>
    </ul>

<h3>This approach ensures:</h3>

<ul>
<li>Easy debugging of failed test cases</li>

<li>Better traceability during CI executions</li>

<li>Clean separation between test logic and reporting</li>
</ul>

<p>
        ** This logging strategy improves debugging, traceability,
        and analysis during both local and CI executions.
    </p>


 <h2>⚙️ CI Integration – GitHub Actions</h2>

   <p>
        This framework is integrated with <strong>GitHub Actions</strong>
        to support continuous integration and automated test execution.
    </p>

  <h3>🚀 CI Capabilities</h3>
    <ul>
        <li>Triggers on code push and pull requests</li>
        <li>Executes TestNG test suite using Maven</li>
        <li>Generates logs and execution results automatically</li>
    </ul>

  <h3>🧪 Benefits</h3>
    <ul>
        <li>Early detection of API failures</li>
        <li>Consistent and repeatable executions</li>
        <li>Reduced manual testing effort</li>
        <li>Improved code quality and stability</li>
    </ul>

  <h3>🔮 Future Enhancements</h3>
    <ul>
        <li>Slack or Email notifications</li>
        <li>Environment-based execution</li>
    </ul>
</div>

<div class="section">
    <h2>▶️ Test Execution</h2>
    <pre>mvn clean test</pre>
</div>
<div class="section">
    <h2>📌 Conclusion</h2>
    <p>
        This API Automation Framework is scalable, maintainable,
        CI-ready, and aligned with real-world industry standards.
        It serves as a solid foundation for enterprise-level API testing.
    </p>
</div>
