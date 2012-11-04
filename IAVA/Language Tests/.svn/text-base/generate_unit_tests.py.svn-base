#
#   This python script will generate unit tests
#   for langage features based on the input files
#   in the appropriate directories.
#
#   If you plan to edit the template files, use double burlies
#   instead of one (eg. if(true) {{ foo(a[2]); }}  )
#   All templates should contain "testFile" function. If it is not
#   the case changes are needed for this script.
#
#

import os, fnmatch


### Configuration Part
###################################################
LANGUAGE_TESTS_ROOT = "Language Tests/"

class Dirs:
    should_pass = "Should Pass/"
    parser_error = "Parser Error/"
    tree_error = "Tree Error/"
    semantic_error = "Semantic Error/"
    #translation_tree_error = "Translation Tree Error/"

class Templates:
    parser = "Templates/ParserTests.java"
    tree =  "Templates/TreeParserTests.java"
    semantic = "Templates/SemanticTests.java"
    translation_tree = "Templates/TranslationTreeTests.java"

class Unittest:
    parser = "../unittests/unittests/parser/ParserTests.java"
    tree = "../unittests/unittests/parser/TreeParserTests.java"
    semantic = "../unittests/unittests/semantics/SemanticTests.java"
    translation_tree = "../unittests/unittests/translation/TranslationTreeTests.java"
 
template = """
    @Test
    public void test_{0}() throws IOException {{
	final File f = new File(testsPath + "{1}");
	assert{2}(testFile(f));
    }}
"""

header = """
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// 
// This is file was auto generated, all changes will be erased.
// If you want to change this class, please edit th appropriate template.
// If you want to add tests, put the .iava files into the 
// appropriate directory.
// 
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 """


### Helper methods
#####################################################
def getFileNames(dirname):
    names = []
    print "Looking inside", dirname
    for root, _, filenames in os.walk(dirname):
        for filename in fnmatch.filter(filenames, '*.iava'):
            print "Found file" , filename
            names.append(os.path.join(root, filename))
    return names

def genTestCases(filenames, expectedBehaviour):
    result = ""
    count = 0
    for filename in filenames:
        #testname = filename.split('.')[0].split('/')[-1]
	testname = filename.split('.')[0].replace(' ', '').replace('/', '_').replace('\\', '_')
	result = result  + template.format(testname, filename.replace('\\','/'), expectedBehaviour)
    	count = count + 1
    return count, result   


def fillTemplate(template_path, test_cases):
    print "Filling template", template_path
    f = open(template_path)
    s = f.read()
    result = s.format(LANGUAGE_TESTS_ROOT, test_cases, header)    
    f.close()
    return result

def writeFile(filepath, s):
    print "Writing", filepath
    f = open(filepath ,'w')
    f.write(s)
    f.close()



### Main part
#####################################################

f = open("Templates/ParserTests.java")

    
c1, should_pass =  genTestCases(getFileNames(Dirs.should_pass), "True")

c2, parser_error = genTestCases(getFileNames(Dirs.parser_error), "False")
s = fillTemplate(Templates.parser, should_pass + parser_error)
writeFile(Unittest.parser, s)

c3, semantic_error = genTestCases(getFileNames(Dirs.semantic_error), "False")
s = fillTemplate(Templates.semantic, should_pass + semantic_error)
writeFile(Unittest.semantic, s)

c4, tree_error = genTestCases(getFileNames(Dirs.tree_error), "False")
s = fillTemplate(Templates.tree, should_pass + tree_error)
writeFile(Unittest.tree, s)

#translation_tree_error = genTestCases(getFileNames(Dirs.translation_tree_error), "False")
#s = fillTemplate(Templates.tree, Dirs.semantic_error, should_pass + tree_error)
s = fillTemplate(Templates.translation_tree, should_pass)
writeFile(Unittest.translation_tree, s)


print "Total number of tests:", c1+c2+c3+c4


