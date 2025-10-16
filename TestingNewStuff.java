import java.util.Random;

public class TestingNewStuff {

        static int HAT_WIDTH = 16;
        static int HAT_HEIGHT = 16;
        static int MASK_WIDTH = 13;
        static int MASK_HEIGHT = 13;
        static int TERMINAL_WIDTH_TESTER = 80;
        static int TERMINAL_HEIGHT_TESTER = 20;
        static final Random ran = new Random();
        static char[][] imager = hatter();

        static char[] spaces = new char[100];
        

        // static char space = '   g ';
        // static char biggerSpace = '        ';

        public static void main(String[] args) throws Exception {

            for (int y = 0; y < TERMINAL_WIDTH_TESTER; y++) {
                spaces[y] = ' ';
            }
            
            while (true) {
                
                String bigSpaces = "" + spaces[0];

                for (int x = 0; x < TERMINAL_WIDTH_TESTER; x++) {
                
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
                    Thread.sleep(200);

                    
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
    
        static String[] converter(char[][] charizard) {
            //sets loopTester to the provided char[][]
            char[][] loopTester = charizard;

            //create new char[] of 256 slots
            char[] charTester = new char[256];
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
    }
    
