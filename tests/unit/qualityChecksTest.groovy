import static org.junit.Assert.*
@Test
void testQualityChecks() {
    def script = loadScript('vars/qualityChecks.groovy')
    script.call()
    assertTrue(output.contains('SonarQube Analysis Completed'))
}

