import java.util.Scanner;

// main class
public class DataFlowApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			DataTransformer.selectTypeOfOperation();
			System.out.println("Enter number of operation: ");
			int conversionSelected =in.nextInt();
			if(conversionSelected >= 1 && conversionSelected <= 7) {
				if(conversionSelected == 1) {
					System.out.print("Enter number for conversion from Integer to Byte: ");
					int number = in.nextInt();
					if(number < -128 || number >127) {
						System.out.printf("WARNING! the value %d overflows \"byte\" range. DATA will was lost!\n", number);
						System.out.println("Try another number!");
						System.out.println();
						
					} else {
						System.out.println(DataTransformer.integerToByte(number));
					}
				}
				if(conversionSelected == 2) {
					System.out.print("Enter number for conversion from Byte to Integer: ");
					byte number = in.nextByte();
					if(number < -128 || number >127) {
						System.out.printf("WARNING! the value %d overflows \"byte\" range. DATA will was lost!\n", number);
						System.out.println("Try another number!");
						System.out.println();
						
					} else {
						System.out.println(DataTransformer.byteToInteger(number));
					}
				}
				if(conversionSelected == 3) {
					System.out.print("Enter number for conversion from Double to Integer: ");
					double number = in.nextDouble();
					if(number < -2.147483648E9 || number >2.147483647E9) {
						System.out.printf("WARNING! the value %d overflows \"integer\" range. DATA will was lost!\n", number);
						System.out.println("Try another number!");
						System.out.println();
						
					} else {
						System.out.println(DataTransformer.doubleToInteger(number));
					}
				}
				if(conversionSelected == 4) {
					System.out.print("Enter number for conversion from Integer to Double: ");
					int number = in.nextInt();
					if(number < -2147483648  || number > 2147483647) {
						System.out.printf("WARNING! the value %d overflows \"integer\" range. DATA will was lost!\n", number);
						System.out.println("Try another number!");
						System.out.println();
						
					} else {
						System.out.println(DataTransformer.integerToDouble(number));
					}
				}
				if(conversionSelected == 5) {
					System.out.print("Enter number for conversion from Short to Integer: ");
					short number = in.nextShort();
					if(number < -32768 || number > 32767) {
						System.out.printf("WARNING! the value %d overflows \"short\" range. DATA will was lost!\n", number);
						System.out.println("Try another number!");
						System.out.println();
						
					} else {
						System.out.println(DataTransformer.shortToInteger(number));
					}
				}
				if(conversionSelected == 6) {
					System.out.print("Enter number for conversion from Integer to Short: ");
					int number = in.nextInt();
					if(number < -32768 || number > 32767) {
						System.out.printf("WARNING! the value %d overflows \"short\" range. DATA will was lost!\n", number);
						System.out.println("Try another number!");
						System.out.println();
						
					} else {
						System.out.println(DataTransformer.integerToShort(number));
					}
				}
				if(conversionSelected == 7) {
					System.out.print("Enter number for conversion from Double to Short: ");
					double number = in.nextDouble();
					if(number < -32768.0 || number > 32767.0) {
						System.out.printf("WARNING! the value %d overflows \"short\" range. DATA will was lost!\n", number);
						System.out.println("Try another number!");
						System.out.println();
						
					} else {
						System.out.println(DataTransformer.doubleToShort(number));
					}
				}
			} else {
				System.out.println("Bye-Bye");
				break;
			}
			


		}
		
	}

}

// secondary class
class DataTransformer {
	static void selectTypeOfOperation() {
		System.out.println("Type of conversion:");
		System.out.println("1. Interger to byte");
		System.out.println("2. Byte to integer");
		System.out.println("3. Double to integer");
		System.out.println("4. Integer to double");
		System.out.println("5. Short to integer");
		System.out.println("6. Integer to short");
		System.out.println("7. Double to short");
		System.out.println("0. Exit");
	}
	
	static byte integerToByte(int number) {
		byte b = (byte) number;
		return b;
	}
	
	static int byteToInteger(byte number) {
		int d = (int) number;
		return d;
	}
	static int doubleToInteger(double number) {
		int d = (int) number;
		return d;
	}
	static double integerToDouble(int number) {
		double f = (double) number;
		return f;
	}
	static int shortToInteger(short number) {
		int d = (int) number;
		return d;
	}
	static short integerToShort(int number) {
		short s = (short) number;
		return s;
	}
	static short doubleToShort(double number) {
		short s = (short) number;
		return s;
	}
}