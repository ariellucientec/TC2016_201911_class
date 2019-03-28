package Actividades.A10_2_IPTables;

public class IPTables
{
    protected Triplet[] rules;
    protected int contRules;
    protected int maxNumRules;
    protected boolean ipTablesRunning; 

    public IPTables()
    {
        maxNumRules = 20;
        rules = new Triplet[maxNumRules];
        contRules = 0;
        ipTablesRunning = false;
    }

    public void addRule(String command, String sourceIP, String action)
    {
        if(command.equals("A")) //if command is Append (A), then add the rule at the end
                                            // first    second     third
            rules[contRules++] = new Triplet<>(command, sourceIP, action);
        else 
        {
            // if command is L, then move each rule forward (inside the array) and insert the rule at the first position
            for(int i = contRules;i > 0; i--)
            {
                rules[i] = rules[i-1];
            }
            rules[0] = new Triplet<>(command, sourceIP, action);
            contRules++;
        }
    }
    public void printRules()
    {
        for(Triplet triplet : rules)
            System.out.println(triplet);
    }
    public void start()
    {
        ipTablesRunning = true;
    }

    public void stop()
    {
        ipTablesRunning = false;
    }

    public boolean allowedIP(String ip) throws IPRejectedException
    {
        for(int i=0; i<contRules; i++)
        {
            if(rules[i].getSecond().equals(ip) && rules[i].getThird().equals("ACCEPT"))
                return true;
            if(rules[i].getSecond().equals(ip) && rules[i].getThird().equals("DROP"))
                return false;
            if(rules[i].getSecond().equals(ip) && rules[i].getThird().equals("REJECT"))
                throw new IPRejectedException(ip);
        }
        return false;
    }
    public boolean isIPTablesRunning()
    {
        return ipTablesRunning;
    }
}