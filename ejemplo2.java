public static void main(String[] args)
    {
        int a=0,b=0,c=0;
 
        DSCOrdenDeVariables variable = new DSCOrdenDeVariables();
        if(args.length<3)
            System.out.println("Debe ingresar 3 variables");
        else
        {   
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=Integer.parseInt(args[2]);        
            variable.DetectaOrden(a,b,c);
        }   
         
    }
}