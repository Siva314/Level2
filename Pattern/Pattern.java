package Pattern;

public class Pattern {
	public static void main(String[] args) {
		Pattern pat=new Pattern();
		pat.printDiamondPatternInNumber(20);
	}

	public void printPyramid(int row) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<row-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	public void rightTriangle(int row) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public void leftTriangle(int row) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<2*(row-i-1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void diamondPattern(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=0;j<=2*(row-i)-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<=2*(row-i)-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void rightPascal(int row) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void sandGlass(int row) {
		for(int i=row;i>0;i--) {
			for(int j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++) {
			for(int j=1;j<row-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void printTriangle(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				if(i!=row) {
					if(j==0||j==i-1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public void printDiamond(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=0;j<2*(row-i);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				if(j==0||j==2*i-2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--) {
			for(int j=0;j<2*(row-i);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				if(j==0||j==2*i-2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void printNumberPattern(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void printPascalTriangle(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			int c=1;
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c=c*(i-j)/j;
			}
			System.out.println();
		}
	}
	
	public void printDiamondPatternInNumber(int row) {

        for (int i = 1; i <= row; i++)
        {
            for(int j=0;j<2*(row-i);j++) {
            	System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
            	System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++) {
            	System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = row-1; i >= 1; i--)
        {
            for(int j=0;j<2*(row-i);j++) {
            	System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
            	System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++) {
            	System.out.print(j+" ");
            }
            System.out.println();
        }
	}
	
	
}
