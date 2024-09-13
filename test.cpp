#include <iostream>

using namespace std;

int main{

char yn = 'y';
//CONTINUE
    cout<<"\nDo you wish to continue?<y/n>";
    cin>>yn;


    while(yn!='y' && yn!='n'){
        cout<<"Please enter 'y' or 'n' only:";
        cin>>yn;
    }   
    if(yn=='y'){
        main();
    }



    return 0;
}