import java.util.Scanner;


public class Prog03_PayCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		

		String Spacer = " ____________";
		String Day1;
		String Day2;
		String Day3;
		String Day4;
		String Day5;
		String Day6;
		String Day7;
		
		String Sunday = "Sunday";
		String Monday = "Monday";
		String Tuesday = "Tuesday";
		String Wednesday = "Wednesday";
		String Thursday = "Thursday";
		String Friday = "Friday";
		String Saturday = "Saturday";
		
		float Day1Val;
		float Day2Val;
		float Day3Val;
		float Day4Val;
		float Day5Val;
		float Day6Val;
		float Day7Val;
		float FinalDayVal;
		
		String DayFinal1 = null;
		String DayFinal2 = null;
		String DayFinal3 = null;
		String DayFinal4 = null;
		String DayFinal5 = null;
		String DayFinal6 = null;
		String DayFinal7 = null;
		
		String Day1ValStr = null;
		String Day2ValStr = null;
		String Day3ValStr = null;
		String Day4ValStr = null;
		String Day5ValStr = null;
		String Day6ValStr = null;
		String Day7ValStr = null;
		
		String Fin = null;
		
		
//Day Value Input and Deduction		
		System.out.println("Enter Day of Sale:");
		
		Day1 = sc.nextLine();
		
	
		if (Day1.equalsIgnoreCase(Sunday)) {
			DayFinal1 = "Sunday";
		}
			if (Day1.equalsIgnoreCase(Monday)) {
				DayFinal2 = "Monday";
			}
				if (Day1.equalsIgnoreCase(Tuesday)) {
					DayFinal3 = "Tuesday";
				}		
					if (Day1.equalsIgnoreCase(Wednesday)) {
						DayFinal4 = "Wednesday";
					}		
						if (Day1.equalsIgnoreCase(Thursday)) {
							DayFinal5 = "Thursday";
						}		
							if (Day1.equalsIgnoreCase(Friday)) {
								DayFinal6 = "Friday";
							}	
								if (Day1.equalsIgnoreCase(Saturday)) {
									DayFinal7 = "Saturday";
								}
								
		System.out.println("Enter Sale Amount for " + Day1 + ":");	
		
		Day1Val = sc.nextFloat();
		
		System.out.println("Sale amount for " + Day1 + " is equal to $" + Day1Val + ".");
		
		
		
//Blank		
		System.out.println();
		
		
		System.out.println("Enter Next Day of Sale:");
		
		sc.nextLine();
		Day2 = sc.nextLine();
		
		if (Day2.equalsIgnoreCase(Sunday)) {
			DayFinal1 = "Sunday";
		}
			if (Day2.equalsIgnoreCase(Monday)) {
				DayFinal2 = "Monday";
			}
				if (Day2.equalsIgnoreCase(Tuesday)) {
					DayFinal3 = "Tuesday";
				}		
					if (Day2.equalsIgnoreCase(Wednesday)) {
						DayFinal4 = "Wednesday";
					}		
						if (Day2.equalsIgnoreCase(Thursday)) {
							DayFinal5 = "Thursday";
						}		
							if (Day2.equalsIgnoreCase(Friday)) {
								DayFinal6 = "Friday";
							}	
								if (Day2.equalsIgnoreCase(Saturday)) {
									DayFinal7 = "Saturday";
								}
								
		
		System.out.println("Enter Sale Amount for " + Day2 + ":");	
		
		Day2Val = sc.nextFloat();
		
		System.out.println("Sale amount for " + Day2 + " is equal to $" + Day2Val + ".");
		
		
		System.out.println();
		
		
		System.out.println("Enter Next Day of Sale:");
		
		sc.nextLine();
		Day3 = sc.nextLine();
		
		if (Day3.equalsIgnoreCase(Sunday)) {
			DayFinal1 = "Sunday";
		}
			if (Day3.equalsIgnoreCase(Monday)) {
				DayFinal2 = "Monday";
			}
				if (Day3.equalsIgnoreCase(Tuesday)) {
					DayFinal3 = "Tuesday";
				}		
					if (Day3.equalsIgnoreCase(Wednesday)) {
						DayFinal4 = "Wednesday";
					}		
						if (Day3.equalsIgnoreCase(Thursday)) {
							DayFinal5 = "Thursday";
						}		
							if (Day3.equalsIgnoreCase(Friday)) {
								DayFinal6 = "Friday";
							}	
								if (Day3.equalsIgnoreCase(Saturday)) {
									DayFinal7 = "Saturday";
								}
								
		
		System.out.println("Enter Sale Amount for " + Day3 + ":");	
		
		Day3Val = sc.nextFloat();
		
		System.out.println("Sale amount for " + Day3 + " is equal to $" + Day3Val + ".");
	
		
		System.out.println();
		
		
		System.out.println("Enter Next Day of Sale:");
		
		sc.nextLine();
		Day4 = sc.nextLine();
		
		if (Day4.equalsIgnoreCase(Sunday)) {
			DayFinal1 = "Sunday";
		}
			if (Day4.equalsIgnoreCase(Monday)) {
				DayFinal2 = "Monday";
			}
				if (Day4.equalsIgnoreCase(Tuesday)) {
					DayFinal3 = "Tuesday";
				}		
					if (Day4.equalsIgnoreCase(Wednesday)) {
						DayFinal4 = "Wednesday";
					}		
						if (Day4.equalsIgnoreCase(Thursday)) {
							DayFinal5 = "Thursday";
						}		
							if (Day4.equalsIgnoreCase(Friday)) {
								DayFinal6 = "Friday";
							}	
								if (Day4.equalsIgnoreCase(Saturday)) {
									DayFinal7 = "Saturday";
								}
								
		
		System.out.println("Enter Sale Amount for " + Day4 + ":");	
		
		Day4Val = sc.nextFloat();
		
		System.out.println("Sale amount for " + Day4 + " is equal to $" + Day4Val + ".");
		
	
		System.out.println();
		
		
		System.out.println("Enter Next Day of Sale:");
		
		sc.nextLine();
		Day5 = sc.nextLine();
		
		if (Day5.equalsIgnoreCase(Sunday)) {
			DayFinal1 = "Sunday";
		}
			if (Day5.equalsIgnoreCase(Monday)) {
				DayFinal2 = "Monday";
			}
				if (Day5.equalsIgnoreCase(Tuesday)) {
					DayFinal3 = "Tuesday";
				}		
					if (Day5.equalsIgnoreCase(Wednesday)) {
						DayFinal4 = "Wednesday";
					}		
						if (Day5.equalsIgnoreCase(Thursday)) {
							DayFinal5 = "Thursday";
						}		
							if (Day5.equalsIgnoreCase(Friday)) {
								DayFinal6 = "Friday";
							}	
								if (Day5.equalsIgnoreCase(Saturday)) {
									DayFinal7 = "Saturday";
								}
								
		
		System.out.println("Enter Sale Amount for " + Day5 + ":");	
		
		Day5Val = sc.nextFloat();
		
		System.out.println("Sale amount for " + Day5 + " is equal to $" + Day5Val + ".");
		
	
		System.out.println();
		
		
		System.out.println("Enter Next Day of Sale:");
		
		sc.nextLine();
		Day6 = sc.nextLine();
		
		if (Day6.equalsIgnoreCase(Sunday)) {
			DayFinal1 = "Sunday";
		}
			if (Day6.equalsIgnoreCase(Monday)) {
				DayFinal2 = "Monday";
			}
				if (Day6.equalsIgnoreCase(Tuesday)) {
					DayFinal3 = "Tuesday";
				}		
					if (Day6.equalsIgnoreCase(Wednesday)) {
						DayFinal4 = "Wednesday";
					}		
						if (Day6.equalsIgnoreCase(Thursday)) {
							DayFinal5 = "Thursday";
						}		
							if (Day6.equalsIgnoreCase(Friday)) {
								DayFinal6 = "Friday";
							}	
								if (Day6.equalsIgnoreCase(Saturday)) {
									DayFinal7 = "Saturday";
								}
								
		
		System.out.println("Enter Sale Amount for " + Day6 + ":");	
		
		Day6Val = sc.nextFloat();
		
		System.out.println("Sale amount for " + Day6 + " is equal to $" + Day6Val + ".");
		

		System.out.println();
		
		
		System.out.println("Enter Next Day of Sale:");
		
		sc.nextLine();
		Day7 = sc.nextLine();
		
		if (Day7.equalsIgnoreCase(Sunday)) {
			DayFinal1 = "Sunday";
		}
			if (Day7.equalsIgnoreCase(Monday)) {
				DayFinal2 = "Monday";
			}
				if (Day7.equalsIgnoreCase(Tuesday)) {
					DayFinal3 = "Tuesday";
				}		
					if (Day7.equalsIgnoreCase(Wednesday)) {
						DayFinal4 = "Wednesday";
					}		
						if (Day7.equalsIgnoreCase(Thursday)) {
							DayFinal5 = "Thursday";
						}		
							if (Day7.equalsIgnoreCase(Friday)) {
								DayFinal6 = "Friday";
							}	
								if (Day7.equalsIgnoreCase(Saturday)) {
									DayFinal7 = "Saturday";
								}
								
		
		System.out.println("Enter Sale Amount for " + Day7 + ":");	
		
		Day7Val = sc.nextFloat();
		
		System.out.println("Sale amount for " + Day7 + " is equal to $" + Day7Val + ".");
		
		System.out.println();
		
		System.out.println("Are You Finished Entering Sales [Y/N]");
		
		sc.nextLine();
		Fin = sc.nextLine();
		
		if (Fin.equalsIgnoreCase("Y")) {
			System.out.println("Processing...");
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	
//Crude Float to String Converter		
		Day1ValStr = "" + Day1Val;
		Day2ValStr = "" + Day2Val;
		Day3ValStr = "" + Day3Val;
		Day4ValStr = "" + Day4Val;
		Day5ValStr = "" + Day5Val;
		Day6ValStr = "" + Day6Val;
		Day7ValStr = "" + Day7Val;
		
		FinalDayVal = Day1Val + Day2Val + Day3Val + Day4Val + Day5Val + Day6Val + Day7Val;
						
		
		System.out.print(DayFinal1 + "       $ ");
		System.out.printf("%,10.2f\n", Day1Val);
		System.out.print(DayFinal2 + "       $ ");
		System.out.printf("%,10.2f\n", Day2Val);
		System.out.print(DayFinal3 + "      $ ");
		System.out.printf("%,10.2f\n", Day3Val);
		System.out.print(DayFinal4 + "    $ ");
		System.out.printf("%,10.2f\n", Day4Val);
		System.out.print(DayFinal5 + "     $ ");
		System.out.printf("%,10.2f\n", Day5Val);
		System.out.print(DayFinal6 + "       $ ");
		System.out.printf("%,10.2f\n", Day6Val);
		System.out.print(DayFinal7 + "     $ ");
		System.out.printf("%,10.2f\n", Day7Val);
		System.out.println("            " + Spacer);
		System.out.print("Total Sales: $");
		System.out.printf("%,11.2f\n", FinalDayVal);
		
	
	}
								
}

			