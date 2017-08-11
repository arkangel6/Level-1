
void setup() {
  size(500, 500);
}
int birdX = 80;
int birdY;
double yvel = 0;
double gravity = 0.1;
int width = 40;
int height = 40;
int pipeX = 400;
int pipeY;
int random = (int) random(75, 200);
int random2 = 550-random;
int score;
int paddleLength =50;
int random3;
void draw() {

  text(score, 480,20);
  background(50, 50, 50);
   text(score, 480,20);
   
  
  fill(0, 0, 200);
  ellipse(birdX, birdY, width, height);

  birdY+=yvel;
  yvel+=gravity;
  
  fill(0, 140, 200);

//dfgf
  rect(pipeX, pipeY, 50, random);
  rect(pipeX, 350, 50, random2);
  pipeX= pipeX -2;
 // println(birdY);
  if (pipeX==0) {
    pipeX=500;
    random = (int) random(75, 200);
    random2 = 500-random;
    println(random); //100-150
    println(random2); // 300-400 200-400
    //random3 = random2 - random;
    // println(random3);
  }

  if (birdX == pipeX) {
    score++;
    println(score);
  }
  if (pipeX>85&& pipeX<130) {
    println("hi");
    int birdY2 = -birdY;
    if (birdY < random-50|| birdY>random2-110) {
      println("gameover");
      fill(0, 30, 40);
      rect(20, 500, 100, 10);
      text("gameover", 250, 250);
    }
  }
}





void mousePressed() {

  yvel = -3;
}