package advDataStructures.stacks;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); // it will call CustomStack();
    }
    public DynamicStack(int size){
        super(size);  // it will call CustomStack(int size);
    }

    // all methods of customstack are applicable in dynamicStack
    // only prob is push method, we want this stack to be of unlimited size
    //thus we override the function
    @Override
    public boolean push(int item){
        // this takes care of it being full
        if(this.isFull()){          //'this' refers to the current stack object
            // double the arraysize
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for(int i=0; i<data.length; i++){
                temp[i]=data[i];
            }

            data=temp;
        }

        // at this point we know that array is not full
        //insert item
        return super.push(item);


    }


}
