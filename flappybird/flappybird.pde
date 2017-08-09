
void setup(){
size(500,500);
background(50,50,50);

}
int x;
int y;
double birdYVelocity;
double gravity = 0.5;
int width = 50;
int height = 50;
int x2 =400;
int y2;
void draw(){
 
  fill(0,0,200);
  ellipse(60-x, 60-y, width, height);
   
  x--;
  y = y-2;
 
  fill(0,140,200);
  rect(x2, y2, 50, 200);
 
   x2--;
   if(x2==0){
     x2=500;
      
   }
   
}
void mousePressed(){
 
y = y + 60;
  
}