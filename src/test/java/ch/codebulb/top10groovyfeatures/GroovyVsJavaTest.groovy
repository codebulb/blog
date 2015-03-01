package ch.codebulb.top10groovyfeatures

import org.junit.Test
import static org.junit.Assert.*
import groovy.transform.CompileStatic
import org.junit.Before
import static TestUtil.assertEquals

@CompileStatic
class GroovyVsJavaTest {    
    @Test
    public void testCollections() {
        assertEquals([1, 2, 3, [4, 5]],
            CollectionsGroovy.getList(),
            CollectionsJava.getList1(),
            CollectionsJava.getList2())
        
        Map expectedMap = [
            John: 30,
            Alice: 40,
            Mike: 50,
        ]
        assertEquals(expectedMap, CollectionsGroovy.getMap(), CollectionsJava.getMap())
    }
    
    @Test
    public void testProperties() {
        List expectedList = ["Tim", 20, true, "Tim's grandfather"]
        assertEquals(expectedList,
            PropertiesGroovy.getPropertiesList(),
            PropertiesJava.getPropertiesList())
    }
    
    @Test
    public void testClosures() {
        assertEquals(["A", "B", "C"],
            ClosuresGroovy.collect(),
            ClosuresGroovy.collectMultiStatement(),
            ClosuresJava.collect(),
            ClosuresJava.collectMultiStatement())
    }
    
    @Test
    public void testJdk() {
        assertEquals("Z", JdkGroovy.getAt(), JdkJava.getAt())
        List expectedList = [1, 2, 31, 32, 331, 34, 4, 5]
        assertEquals(expectedList, JdkGroovy.flattenList(), JdkJava.flattenList())
    }
    
    @Test
    public void testDynamic() {
        assertEquals(23000, DynamicGroovy.sumDynamic(), DynamicJava.sumDynamic())
    }
    
    @Test
    public void testAst() {
        assertEquals('AstGroovy$Address(Main Road, 42)',
            AstGroovy.intoString(),
            AstJava.intoString())
        
        assertEquals(true,
            AstGroovy.equals(),
            AstJava.equals())
        
        assertEquals(['AstGroovy$Address(Main Road, 42)', 'AstGroovy$Address(Main Road, 43)', 'AstGroovy$Address(Second Street, 1)'],
            AstGroovy.sort(),
            AstJava.sort())
    }
    
    @Test
    public void testStrings() {
        String testString = "Hello"
        String expected = "Input String is Hello with 5 characters."
        assertEquals(expected, StringsGroovy.getString(testString),
            StringsJava.getString1(testString), StringsJava.getString2(testString))
    }
    
    @Test
    public void testSwitchCase() {
        assertEquals("It's the String 'S'.", SwitchGroovy.switchCase("S"), SwitchJava.switchCase("S"))
        assertEquals("It starts with 'S'.", SwitchGroovy.switchCase("String"), SwitchJava.switchCase("String"))
        assertEquals("It starts in upper case.", SwitchGroovy.switchCase("A string"), SwitchJava.switchCase("A string"))
        assertEquals("It's a String.", SwitchGroovy.switchCase("any string"), SwitchJava.switchCase("any string"))
        assertEquals("It's an Integer.", SwitchGroovy.switchCase(42), SwitchJava.switchCase(42))
        assertEquals("It's anything else.", SwitchGroovy.switchCase(42l), SwitchJava.switchCase(42l))
    }
    
    @Test
    public void testParseXml() {
        assertEquals("test", XmlGroovy.parseJunitScope(), XmlJava.parseJunitScope())
    }
    
    @Test
    public void testSpreadDot() {
        assertEquals(["A", "B", "C"], SpreadDotGroovy.spreadDot(), SpreadDotJava.spreadDot())
    }
}
