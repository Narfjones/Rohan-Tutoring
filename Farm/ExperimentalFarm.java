package Farm;

public class ExperimentalFarm
{
private Plot[][] farmPlots;

public ExperimentalFarm(Plot[][] p)
{
/* implementation not shown */
}

/** Returns the plot with the highest yield for a given crop type, as described in part (a). */
public Plot getHighestYield(String c)
{
String crop = c;  //Store parameter
Plot plot = null; // Create temporary Plot
int highest = farmPlots[0][0].getCropYield(); // Store initial yield as baseline

for(int row = 0; row < farmPlots.length; row++) // Cycle outer array
{
    for(int col = 0; col < farmPlots.length; col++){ //Cycle inner 
        
        // If the crop matches and the yield is higher than our current highest update highest
        if(farmPlots[row][col].getCropType().equalsIgnoreCase(c) && 
           farmPlots[row][col].getCropYield() > highest)
           {
                highest = farmPlots[row][col].getCropYield();// Update highest value
                plot = farmPlots[row][col]; // Fills in if the sent crop has a match in array
           }
    }
}

    if(plot != null){ // If there's a match, return the plot
        return plot;
    } else {
        return null; // If there's no match, return null
    }
}

/** Returns true if all plots in a given column in the two-dimensional array farmPlots
* contain the same type of crop, or false otherwise, as described in part (b).
*/
public boolean sameCrop(int col)
{
    Boolean check = true; // Create a true/false check
    String crop = farmPlots[col][0].getCropType(); // Store first crop type in column

    // Iterate over all crops in specified column
    for(int row = 0; row < farmPlots.length; row++){

        // If any don't match, set check to false and return false
        if(!farmPlots[row][col].getCropType().equalsIgnoreCase(crop)){
            check = false;
            break; // End loop
        }
    }

    return check;
}

}
