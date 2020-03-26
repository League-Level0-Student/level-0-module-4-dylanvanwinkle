int x1 = 372;
int y1 = 300;
PImage face;
void setup() {
     face = loadImage("Face.jpg");
        size(800,600);
    face.resize(width,height);
  }

void draw() {
      background(face);
      fill(255,255,255);
    ellipse(560,300,100,100);
    ellipse(372,300,100,100);
  fill(#080808);
  if(mouseX<322){
    x1=322;
  }else if(mouseX>422){
    x1=422;
  }else{
    x1 = mouseX;
  }  if(mouseY<250){
    y1=250;
  }else if(mouseY>350){
    y1=350;
  }else{
    y1 = mouseY;
  }
    ellipse(x1,y1,40,40);
    ellipse(x1 + 188,y1,40,40);
  
  if(mousePressed){
  print(mouseX + ", " + mouseY + ". ");
  }
}
