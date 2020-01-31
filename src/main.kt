/*
Pseudocode
Variables:
userEntry, entryPrint

Process:
Initialize the userEntry variable
Ask the user to enter a number and print the choices available
Asign the number entered to the userEntry variable
Depending on the number entered by the user, assign each respective choice as a string to the entryPrint variable
Print the entryPrint variable
Exit the loop if 6 is chosen
*/

fun main()
{
    var userEntry = 0
    var entryPrint = ""
    do
    {
       println("Please choose your meal below:")
       println("1. Hamburger w/ fries")
       println("2. Pizza")
       println("3. Salad")
       println("4. Meatball Sub")
       println("5. Tofu")
       println("6. Exit")
       userEntry = readLine()!!.toInt()

       when(userEntry)
       {
       1 -> entryPrint = "1. Hamburger w/ fries"
       2 -> entryPrint = "2. Pizza"
       3 -> entryPrint = "3. Salad"
       4 -> entryPrint = "4. Meatball Sub"
       5 -> entryPrint = "5. Tofu"
       else -> entryPrint = "To exit"
       }
       println("You have chosen:")
       println(entryPrint)
       println("")
    }
    while ( userEntry !=6)
}