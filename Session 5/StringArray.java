class StringArray {
	public static void main(String[] args) {

		String[] files = {"song1.mp3", "Pirates.mp4", "Silence.mp3", "file1.txt", "sun.jpg", "movie.mp4", "exam.txt", "model.jpg", "IronMan.mp4", "CountingStars.mp3", "SolarSystem.jpg", "ResearchPaper.txt"};
		String[] mp3 = new String[10];
		String[] mp4 = new String[10];
		String[] txt = new String[10];
		String[] jpg = new String[10];

		int size1 = 0, size2 = 0, size3 = 0, size4 = 0;

		for(String x : files) {

			if(x.endsWith("mp3")) {
				mp3[size1] = x;
				size1++;
			}
			else if(x.endsWith("mp4")) {
				mp4[size2] = x;
				size2++;
			}
			else if(x.endsWith("txt")) {
				txt[size3] = x;
				size3++;
			}
			else if(x.endsWith("jpg")) {
				jpg[size4] = x;
				size4++;
			}
		}


		System.out.print("mp3 --> ");
		for(int i = 0; i < size1; i++) {
			System.out.print(mp3[i] + " ");
		}
		System.out.println();

		System.out.print("mp4 --> ");
		for(int i = 0; i < size2; i++) {
			System.out.print(mp4[i] + " ");
		}
		System.out.println();

		System.out.print("txt --> ");
		for(int i = 0; i < size3; i++) {
			System.out.print(txt[i] + " ");
		}
		System.out.println();

		System.out.print("jpg --> ");
		for(int i = 0; i < size4; i++) {
			System.out.print(jpg[i] + " ");
		}
		System.out.println();
	}
}



