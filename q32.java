// Java program for the above approach
class q32{

// Function to check if a number
// N is Apocalyptic 
static boolean isApocalyptic(int n) 
{
	if (String.valueOf((
				Math.pow(2, n))).contains("666"))
		return true;
	return false;
}

// Driver Code
public static void main(String[] args)
{
// Given Number N
int N = 157;

// Function Call
if(isApocalyptic(N))
	System.out.println("Yes");
else
	System.out.println("No");
}
}

// This code is contributed by sapnasingh4991
