import java.util.Random;

public class TestingNewStuff {

        static int HAT_WIDTH = 16;
        static int HAT_HEIGHT = 16;
        static int MASK_WIDTH = 13;
        static int MASK_HEIGHT = 13;
        static int TERMINAL_WIDTH_TESTER = 80;
        static int TERMINAL_HEIGHT_TESTER = 20;
        static int randomSpace = (int)(Math.random() * 101);
        static final Random ran = new Random();
        static char[][] imager = hatter();
        static int counter = 0;

        static char[] spaces = new char[100];
        

        // static char space = '   g ';
        // static char biggerSpace = '        ';

        public static void main(String[] args) throws Exception {

            AsciiArt carrot = new AsciiArt(getCarrot());

            for (int y = 0; y < TERMINAL_WIDTH_TESTER; y++) {
                spaces[y] = ' ';
            }
            
            while (true) {
                
                String bigSpaces = "" + spaces[0];

                for (int x = 0; x < TERMINAL_WIDTH_TESTER; x++) {
                

                    ;
                    for (String i : converter(preConverter(getCarrot()))) {
                        System.out.println(bigSpaces + i);
                    }
                    
                    for (String i : converter(preConverter(getShield()))) {
                        System.out.println(bigSpaces + i);
                    }

                    for (String i : converter(preConverter(getBoat()))) {
                        System.out.println(bigSpaces + i);
                    }

                    if (x > 0) {
                        //add spaces
                        bigSpaces = bigSpaces + spaces[x];
                    }
                    //print and add #

                    if (ran.nextDouble() < 0.5) {
                        imager = hatter();
                    }
                    else  {
                        imager = masker();
                    }
                    Thread.sleep(100);

                    
                    for (String i : converter(imager)) {
                        System.out.println(bigSpaces + i);
                    }
                }
        }
            
           
            // for (int i = 0; i < HAT_HEIGHT; i++) {
            //     for (int y = 0; y < HAT_HEIGHT; y++) {
            //         for (int x = 0; x < HAT_WIDTH; x++) {
            //             //char[] tester = hatTester[x][y];

            //         }
            //     }
            // }
            
        }
        
           
     
        static char[][] getCarrot() {
            char[][] img = new char[6][8];
            // fill with empty space
            for (int y = 0; y < 6; y++) {
                for (int x = 0; x < 8; x++) {
                    img[y][x] = ' ';
                }
            }
            // then fill individual characters
            img[0][5] = '\\';
            img[0][6] = ')';
            img[0][7] = '/';
            img[1][4] = '-';
            img[1][5] = '-';
            img[1][6] = 'v';
    
            img[2][3] = '/';
            img[2][4] = 'r';
            img[2][6] = ')';
    
            img[3][2] = '>';
            img[3][3] = 'r';
            img[3][4] = '.';
            img[3][5] = '/';
    
            img[4][1] = '/';
            img[4][3] = '\'';
    
            img[5][0] = 'c';
            img[5][1] = '_';
            img[5][2] = '/';
    
            return img;
        }
    
    
    
        static char[][] hatter() {
            char[][] img = new char[HAT_HEIGHT][HAT_WIDTH];
            for(int y = 0; y < HAT_HEIGHT; y++) {
                for(int x = 0; x < HAT_WIDTH; x++) {
                    img[x][y] = ' ';
                }
            }
            img[8][0] = '/';
            img[9][0] = '|';
            img[10][0] = '\\';
            img[0][14] = ',';
    
            img[0][1] = '/';
            img[1][1] = '\\';
            img[7][1] = '-';
            img[8][1] = '#';
            img[9][1] = '#';
            img[10][1] = '-';
            img[11][1] = '|';
            img[12][1] = '\\';
            img[1][14] = ',';
    
            img[0][2] = '\\';
            img[1][2] = '#';
            img[2][2] = '|';
            img[3][2] = '|';
            img[4][2] = '|';
            img[5][2] = '|';
            img[6][2] = '|';
            img[7][2] = '|';
            img[8][2] = '#';
            img[9][2] = '#';
            img[10][2] = '-';
            img[11][2] = '#';
            img[12][2] = '/';
            img[2][14] = ',';
    
            img[0][3] = '\\';
            img[1][3] = '#';
            img[2][3] = '-';
            img[3][3] = '#';
            img[4][3] = '#';
            img[5][3] = '#';
            img[6][3] = '-';
            img[7][3] = '-';
            img[8][3] = '#';
            img[9][3] = '#';
            img[10][3] = '-';
            img[11][3] = '#';
            img[12][3] = '/';
            img[3][14] = ',';
    
            img[0][4] = '\\';
            img[1][4] = '#';
            img[2][4] = '-';
            img[3][4] = '#';
            img[4][4] = '#';
            img[5][4] = '#';
            img[6][4] = '-';
            img[7][4] = '-';
            img[8][4] = '#';
            img[9][4] = '/';
            img[11][4] = '#';
            img[13][4] = '\\';
            img[4][14] = ',';
    
            img[0][5] = '|';
            img[1][5] = '#';
            img[2][5] = '-';
            img[3][5] = '#';
            img[4][5] = '#';
            img[5][5] = '#';
            img[6][5] = '-';
            img[7][5] = '-';
            img[8][5] = '#';
            img[9][5] = '-';
            img[11][5] = '#';
            img[12][5] = '#';
            img[13][5] = '-';
            img[5][14] = ',';
    
            img[0][6] = '/';
            img[1][6] = '#';
            img[2][6] = '-';
            img[3][6] = '#';
            img[4][6] = '#';
            img[5][6] = '#';
            img[6][6] = '-';
            img[7][6] = '-';
            img[8][6] = '#';
            img[9][6] = '-';
            img[10][6] = '#';
            img[11][6] = '#';
            img[13][6] = '/';
            img[6][14] = ',';
    
            img[0][7] = '/';
            img[1][7] = '/';
            img[2][7] = '|';
            img[3][7] = '|';
            img[4][7] = '|';
            img[5][7] = '|';
            img[6][7] = '|';
            img[7][7] = '-';
            img[8][7] = '#';
            img[9][7] = '-';
            img[10][7] = '#';
            img[11][7] = '#';
            img[12][7] = '/';
            img[7][14] = ',';
    
            img[0][8] = '\\';
            img[1][8] = '|';
            img[8][8] = '\\';
            img[9][8] = '#';
            img[10][8] = '#';
            img[11][8] = '#';
            img[12][8] = '/';
            img[8][14] = ',';
    
            img[0][9] = '\\';
            img[8][9] = '#';
            img[9][9] = '#';
            img[10][9] = '#';
            img[11][9] = '#';
            img[12][9] = '#';
            img[13][9] = '#';
            img[9][14] = ',';
    
            img[8][10] = '#';
            img[10][10] = '#';
            img[11][10] = '#';
            img[10][14] = ',';
            
            img[10][11] = '#';
            img[11][14] = ',';

            img[12][14] = ',';

            img[13][14] = ',';
    
            return img;
        }

        static char[][] masker() {
            char[][] img = new char[MASK_HEIGHT][MASK_WIDTH];
            for(int y = 0; y < MASK_HEIGHT; y++) {
                for(int x = 0; x < MASK_WIDTH; x++) {
                    img[x][y] = ' ';
                }
            }
            img[0][0] = '/';
            img[0][1] = '-';
            img[0][2] = '-';
            img[0][3] = '-';
            img[0][4] = '-';
            img[0][5] = '\\';
            img[0][6] = '/';
            img[0][7] = '-';
            img[0][8] = '-';
            img[0][9] = '-';
            img[0][10] = '-';
            img[0][11] = '\\';
            img[0][12] = ',';
            

            img[1][0] = '\\';
            img[1][2] = '#';
            img[1][3] = '#';
            img[1][8] = '#';
            img[1][9] = '#';
            img[1][11] = '/';
            img[1][12] = ',';
            

            img[2][1] = '\\';
            img[2][4] = '/';
            img[2][7] = '\\';
            img[2][10] = '/';
            img[2][12] = ',';
            
            
            img[3][2] = '\\';
            img[3][3] = '-';
            img[3][5] = '\\';
            img[3][6] = '/';
            img[3][8] = '-';
            img[3][9] = '/';
            img[3][12] = ',';
           
            
            
            return img;
        }

        static char[][] getShield() {
            char[][] img = new char[13][10];
    
            for (int i = 0; i < 13; i++) {
                for (int x = 0; x < 10; x++) {
                    img[i][x] = ' ';
                }
            }
    
            img[0][0] = '|';
            img[0][1] = '-';
            img[0][2] = '-';
            img[0][3] = '-';
            img[0][4] = '-';
            img[0][5] = '-';
            img[0][6] = '-';
            img[0][7] = '-';
            img[0][8] = '-';
            img[0][9] = '|';
            img[1][0] = '|';
            img[1][1] = '\\';
            img[1][4] = '|';
            img[1][5] = '|';
            img[1][8] = '/';
            img[1][9] = '|';
            img[2][0] = '|';
            img[2][2] = '\\';
            img[2][4] = '|';
            img[2][5] = '|';
            img[2][7] = '/';
            img[2][9] = '|';
            img[3][0] = '|';
            img[3][3] = '\\';
            img[3][4] = '|';
            img[3][5] = '|';
            img[3][6] = '/';
            img[3][9] = '|';
            img[4][0] = '|';
            img[4][4] = '\\';
            img[4][5] = '/';
            img[4][9] = '|';
            img[5][0] = '|';
            img[5][4] = '/';
            img[5][5] = '\\';
            img[5][9] = '|';
            img[6][0] = '|';
            img[6][3] = '/';
            img[6][4] = '|';
            img[6][5] = '|';
            img[6][6] = '\\';
            img[6][9] = '|';
            img[7][0] = '|';
            img[7][2] = '/';
            img[7][4] = '|';
            img[7][5] = '|';
            img[7][7] = '\\';
            img[7][9] = '|';
            img[8][0] = '|';
            img[8][1] = '/';
            img[8][4] = '|';
            img[8][5] = '|';
            img[8][8] = '\\';
            img[8][9] = '|';
            img[9][1] = '\\';
            img[9][4] = '|';
            img[9][5] = '|';
            img[9][8] = '/';
            img[10][2] = '\\';
            img[10][4] = '|';
            img[10][5] = '|';
            img[10][7] = '/';
            img[11][3] = '\\';
            img[11][4] = '|';
            img[11][5] = '|';
            img[11][6] = '/';
            img[12][4] = '\\';
            img[12][5] = '/';
    
            return img;
        }


        static char[][] getBoat() {
            char[][] img = new char[10][34];
            // fill with empty space
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 34; x++) {
                    img[y][x] = ' ';
                }
            }
            // then fill individual characters
            img[0][15] = '|';
            img[0][16] = '_';
            img[0][17] = '_';
            img[0][18] = '_';
            img[0][19] = '|';
    
            img[1][4] = '*';
            img[1][15] = '|';
            img[1][16] = '_';
            img[1][17] = '_';
            img[1][18] = '_';
            img[1][19] = '|';
            img[1][21] = '|';
            img[1][22] = '\\';
            img[1][26] = '*';
            img[1][28] = '*';
    
            img[2][3] = '*';
            img[2][9] = '_';
            img[2][10] = '_';
            img[2][11] = '|';
            img[2][12] = '_';
            img[2][13] = '_';
            img[2][15] = '|';
            img[2][16] = '_';
            img[2][17] = '_';
            img[2][18] = '_';
            img[2][19] = '|';
            img[2][21] = '|';
            img[2][23] = '\\';
            img[2][27] = '*';
    
            img[3][5] = '*';
            img[3][9] = '|';
            img[3][10] = 'o';
            img[3][11] = '_';
            img[3][12] = '_';
            img[3][13] = '|';
            img[3][15] = '|';
            img[3][16] = '_';
            img[3][17] = '_';
            img[3][18] = '_';
            img[3][19] = '|';
            img[3][21] = '|';
            img[3][22] = 'o';
            img[3][24] = '\\';
    
            img[4][9] = '|';
            img[4][10] = '_';
            img[4][11] = '_';
            img[4][12] = '_';
            img[4][13] = '|';
            img[4][15] = '|';
            img[4][16] = '_';
            img[4][17] = '_';
            img[4][18] = '_';
            img[4][19] = '|';
            img[4][21] = '|';
            img[4][22] = '_';
            img[4][23] = '_';
            img[4][24] = 'o';
            img[4][25] = '\\';
    
            img[5][1] = '^';
            img[5][2] = '^';
            img[5][8] = '_';
            img[5][9] = '|';
            img[5][10] = '_';
            img[5][11] = '_';
            img[5][12] = '_';
            img[5][13] = '|';
            img[5][17] = '|';
            img[5][21] = '|';
            img[5][30] = '^';
            img[5][31] = '^';
            img[5][32] = '^';
            
            img[6][2] = '^';
            img[6][3] = '^';
            img[6][4] = '^';
            img[6][7] = '/';
            img[6][8] = '.';
            img[6][9] = '.';
            img[6][10] = '.';
            img[6][11] = '\\';
            img[6][12] = '_';
            img[6][13] = '_';
            img[6][14] = '_';
            img[6][15] = '|';
            img[6][16] = '_';
            img[6][17] = '|';
            img[6][18] = '_';
            img[6][19] = '_';
            img[6][20] = '_';
            img[6][21] = '|';
            img[6][22] = '_';
            img[6][23] = '_';
            img[6][24] = '_';
            img[6][25] = '_';
            img[6][26] = '\\';
            img[6][27] = '_';
            img[6][28] = '/';
            img[6][32] = '^';
            img[6][33] = '^';
    
            img[7][0] = '~';
            img[7][1] = '~';
            img[7][2] = '~';
            img[7][3] = '~';
            img[7][4] = '~';
            img[7][5] = '~';
            img[7][6] = '~';
            img[7][7] = '\\';
            img[7][11] = 'o';
            img[7][13] = '*';
            img[7][15] = 'o';
            img[7][17] = '*';
            img[7][19] = '*';
            img[7][21] = 'o';
            img[7][23] = 'o';
            img[7][26] = '/';
            img[7][27] = '~';
            img[7][28] = '~';
            img[7][29] = '~';
            img[7][30] = '~';
            img[7][31] = '~';
            img[7][32] = '~';
            img[7][33] = '~';
    
            img[8][17] = '^';
            img[8][18] = '^';
            img[8][19] = '^';
            img[8][20] = '^';
            img[8][21] = '^';
            img[8][22] = '^';
            img[8][23] = '^';
    
            img[9][3] = '^';
            img[9][4] = '^';
            img[9][5] = '^';
            img[9][11] = '^';
            img[9][12] = '^';
            img[9][13] = '^';
            img[9][27] = '^';
            img[9][28] = '^';
            img[9][29] = '^';
    
            return img;
        }



        static String[] converter2(char[][] charizard) {
            //sets loopTester to the provided char[][]
            char[][] loopTester = charizard;
    
            //create new char[] of 256 slots
            char[] charTester = new char[512];
            //increment variable for incrementation over the increments 
            int incrementer = 0;
    
            //convert char[][] to char[]
            for (char[] testing : loopTester) {
                for (int x = 0; x < testing.length; x++) {
                    char moreTester = testing[x];
                    charTester[incrementer++] = moreTester;
                }
            }
    
            //convert to string and then convert to string[] via ,'s
            String stringTester = new String(charTester);
            String[] stringArrayTester = stringTester.split("/n");
    
            //return the new string array
            return stringArrayTester;
        }
    
    
        static String[] converter(char[][] charizard) {
            //sets loopTester to the provided char[][]
            char[][] loopTester = charizard;

            //create new char[] of 256 slots
            char[] charTester = new char[512];
            //increment variable for incrementation over the increments 
            int incrementer = 0;

            //convert char[][] to char[]
            for (char[] testing : loopTester) {
                for (int x = 0; x < testing.length; x++) {
                    char moreTester = testing[x];
                    charTester[incrementer++] = moreTester;
                }
            }

            //convert to string and then convert to string[] via ,'s
            String stringTester = new String(charTester);
            String[] stringArrayTester = stringTester.split(",");

            //return the new string array
            return stringArrayTester;
        }




        static char[][] preConverter(char[][] image) {
            int height = image.length;
            int width = image[0].length;

            char[][] betterImage = new char[height][width + 1];

            for (int i = 0; i < image.length; i++) {
                for (int x = 0; x < image[0].length; x++) {
                    betterImage[i][x] = image[i][x];
                }
            }

            for (int i = 0; i < image.length; i++) {
                for (int x = 0; x < image[0].length + 1; x++) {
                    if (x == image[0].length) {
                        betterImage[i][x] = ',';
                    }
                }
            }

            return betterImage;
        }






        


    }