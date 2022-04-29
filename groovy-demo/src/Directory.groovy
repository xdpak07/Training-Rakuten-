
class Directory {
	static void main(String[] args) {
		def rootFile = new File("test").listRoots()
		rootFile.each { 
			file -> println file.absolutePath
		}
	}
}
