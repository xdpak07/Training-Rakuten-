
class copyFile {
	static void main(Static) {
		def scr = new File("Example1.txt")
		def dst = new File("Example2.txt")
		dst << scr.text
		
	}
}
