/** 
*The purpose of this class is to model a television
*Phuc Bui
*02/16/2020
*/


public class Television {

		private final String MANUFACTURER; // manufacturer of the TV
		private final int SCREEN_SIZE; //Screen size of the TV
		private boolean powerOn; //power on/off button
		private int channel; //channel
		private int volume; //volume to increase/decrease
		
		//two arguments constructor initializes all the atttributes of the television class
		public Television(String manu, int screen)
		{
		MANUFACTURER = manu;
		SCREEN_SIZE = screen;
		powerOn = false;
		volume = 20;
		channel = 2;
		}
		
		//returns the volume
		public int getVolume() {
			return volume;
		}
		
		// returns the channel
		public int getChannel() {
			return channel;
		}
		
		//returns the manufacturer
		public String getManufacturer() {
			return MANUFACTURER;
		}
		
		//returns the screen size
		public int getScreenSize() {
			return SCREEN_SIZE;
		}
		
		//sets the channel to a given number
		public void setChannel(int ch) {
			channel = ch;
		}
		
		//sets the TV power on/off
		public void power() {
			powerOn =! powerOn;
		}
		
		//increases the TV volume by 1
		public void increaseVolume() {
			volume += 1;
		}
		
		//decreases the TV volume by 1
		public void decreaseVolume() {
			volume -= 1;
		}
		
		
		
		
}
