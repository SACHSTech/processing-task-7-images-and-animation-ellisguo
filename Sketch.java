import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  /**
* assigning floats and images
*
* @param PImage making variables for the images, one of them a background
* @param float assigning numbers to variables that will be used in calculations
*
*/
  
  PImage imgAster;
  PImage imgBackground;
  float fltAsX = 0;
  float fltAsY = 0;
  float fltCirX = 0;
  float fltCirY = 0;
  

  float xSpeed = 1;
  float ySpeed = 1;
  float xSpeed2 = 3;
  float ySpeed2 = 1;
 

  float fltCircX = 1;
  float fltCircY = 1;
  float xSpeed3 = 1;
  float ySpeed3 = 5;

  float fltRotate = 200;
  
  public void setup() {
    /**
* Setting up background, and loading the images
*
* @param background  loading the imported image, and then resizing it to fit the width and height
* @param loading the imported asteroid and also resizing it to be smaller and to be used as an animated object. 
* 
*
*/
    
    background(210, 255, 173);
    imgBackground = loadImage("download.jpeg");
imgBackground.resize(imgBackground.width*2,imgBackground.height*2);
    
    imgAster = loadImage("aster.png");
    imgAster.resize(imgAster.width/4,imgAster.height/4);
    
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    /**
* Animating the asteroid and the first circle in linear lines, with collision detection
*
* @param first part making the shapes, giving the dimensions and doing the += causing the variables to increase
* @param second part if statements making the object bounce off the walls
*
*/
    
	// sample code, delete this stuff
    image(imgBackground, 0, 0);
    image(imgAster, fltAsX, fltAsY);
    fltAsX += xSpeed;
    fltAsY += ySpeed;

    fill(255, 133, 43);
    ellipse(fltCirX, fltCirY, 20, 20);
    noStroke();

    fltCirX += xSpeed2;
    fltCirY += ySpeed2;

  if (fltAsX < 0 || fltAsX > width) {
    xSpeed *= -1;
  }

  if (fltAsY < 0  || fltAsY > height) {
    ySpeed *= -1;
  }

  if (fltCirX < 0 || fltCirX > width) {
    xSpeed2 *= -1;
  }

  if (fltCirY < 0  || fltCirY > height) {
    ySpeed2 *= -1;
  }


  /**
* The non linear object
*
* @param first part dimensions and xy values of the circle, plus a rotation variable that will make the path non linear. 
* @param second part the edge collision, the object will appear back on screen in a short time due to the constant * -1 of the speed. 
*
*/
    
    translate(width/2, height/2);
    fill(255, 255, 255);
    rotate(radians(fltRotate));
    ellipse(fltCircX, fltCircY, 40, 40);
    noStroke();

    fltCircX += xSpeed3;
    fltCircY += ySpeed3;
    fltRotate += 1;

  if (fltCircX < 0 || fltCircX > width) {
    xSpeed3 *= -1;
  }

  if (fltCircY < 0  || fltCircY > height) {
    ySpeed3 *= -1;
  }


    
  }
  
  // define other methods down here.
}