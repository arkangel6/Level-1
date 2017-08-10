
void setup(){
size(500,500);


}
int birdX = 80;
int birdY;
double birdYVelocity;
float gravity = 0.5;
int width = 50;
int height = 50;
int pipeX = 400;
int pipeY;
int random = (int) random(75,250);
int random2 = 550-random;
int score;
int paddleLength =50;
int random3;
void draw(){
  
 background(50,50,50);
  fill(0,0,200);
  ellipse(birdX, 60-birdY, width, height);
   
  birdY = birdY-2;
 
  fill(0,140,200);
  
  
  rect(pipeX, pipeY, 50, random);
   rect(pipeX, 350, 50, random2);
   pipeX--;
   if(pipeX==0){
     pipeX=500;
  random = (int) random(75,250);
  random2 = 500-random;
 // println(random); //100-150
 // println(random2); // 400-450
  random3 = random2 - random;
  println(random3);
 
   }
   
  if(birdX == pipeX){
    score++;
    println(score);
  }
   if(pipeX>80&& pipeX<130){
     println("hi");
     int birdY2 = -birdY;
     if(birdY2< random || birdY2>random2-100){
println("gameover");
   }
  
   
}
}
   




void mousePressed(){
 
birdY = birdY + 60;
  
}