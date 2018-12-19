import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName()
    {
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    
    String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower{
    
    String whatsYourName()
    {
        return "Lily";
    }
}

class Lotus extends Flower{
    String whatsYourName(){
        return "Lotus";
    }
}

class Region {
    Flower yourNationalFlower()
    {
        return new Flower();
    }
}

class WestBengal extends Region{
    Jasmine yourNationalFlower()
    {
        return new Jasmine();
    } 
}

class AndhraPradesh extends Region {
    Lily yourNationalFlower()
    {
        return new Lily();
    }
}

