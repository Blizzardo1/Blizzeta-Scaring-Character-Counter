/**
Copyright (c) 2014 Blizzeta Software and Gaming LLC.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.*/
package net.blizzeta.scaring;

import java.util.Scanner;

import org.eclipse.jdt.annotation.Nullable;

public class BootStrap {
    
    private static final String NAME      = "Blizzeta Character Counter";
    private static final String REPO      = "Scaring";
    private static final String VERSION   = "1.0";
    private static final String DISTRO    = "dev";
    private static final String COPYRIGHT = "(c) 2014 Blizzeta Software & Gaming LLC. All rights reserved.";
    private static String       _header;
    private static String       _message;
    private static Scanner      _scanner;
    private static int          _a, _b, _c, _d, _e, _f, _g, _h, _i, _j, _k, _l, _m, _n, _o, _p, _q, _r, _s, _t, _u, _v, _w, _x, _y, _z, _1, _2, _3,
            _4, _5, _6, _7, _8, _9, _0, _sp, _uc;
    
    /**
     * <p>
     * Prints the header of the Program
     * </p>
     */
    private static void printHeader( ) {
        _header = String.format( "%s [Version %s]\n%s\nInternal Repo >> %s - %s", NAME, VERSION, COPYRIGHT, REPO, DISTRO );
        System.out.printf( "%s\n\n", _header );
    }
    
    /**
     * <p>
     * Checks to see if that character is valid from Aa to Zz, 0 to 9
     * </p>
     * 
     * @param c
     *            The Character to check
     * @return True if the Character is valid
     */
    private static boolean checkCharacter( char c ) {
        switch ( Character.toUpperCase( c ) ) {
            case 'A':
                _a++;
                return true;
            case 'B':
                _b++;
                return true;
            case 'C':
                _c++;
                return true;
            case 'D':
                _d++;
                return true;
            case 'E':
                _e++;
                return true;
            case 'F':
                _f++;
                return true;
            case 'G':
                _g++;
                return true;
            case 'H':
                _h++;
                return true;
            case 'I':
                _i++;
                return true;
            case 'J':
                _j++;
                return true;
            case 'K':
                _k++;
                return true;
            case 'L':
                _l++;
                return true;
            case 'M':
                _m++;
                return true;
            case 'N':
                _n++;
                return true;
            case 'O':
                _o++;
                return true;
            case 'P':
                _p++;
                return true;
            case 'Q':
                _q++;
                return true;
            case 'R':
                _r++;
                return true;
            case 'S':
                _s++;
                return true;
            case 'T':
                _t++;
                return true;
            case 'U':
                _u++;
                return true;
            case 'V':
                _v++;
                return true;
            case 'W':
                _w++;
                return true;
            case 'X':
                _x++;
                return true;
            case 'Y':
                _y++;
                return true;
            case 'Z':
                _z++;
                return true;
            case '0':
                _0++;
                return true;
            case '1':
                _1++;
                return true;
            case '2':
                _2++;
                return true;
            case '3':
                _3++;
                return true;
            case '4':
                _4++;
                return true;
            case '5':
                _5++;
                return true;
            case '6':
                _6++;
                return true;
            case '7':
                _7++;
                return true;
            case '8':
                _8++;
                return true;
            case '9':
                _9++;
                return true;
        }
        return false;
    }
    
    private static void dropStack( ) {
        
        if ( _a > 0 ) System.out.printf( "Printed A            this many -> %d\n", _a );
        if ( _b > 0 ) System.out.printf( "Printed B            this many -> %d\n", _b );
        if ( _c > 0 ) System.out.printf( "Printed C            this many -> %d\n", _c );
        if ( _d > 0 ) System.out.printf( "Printed D            this many -> %d\n", _d );
        if ( _e > 0 ) System.out.printf( "Printed E            this many -> %d\n", _e );
        if ( _f > 0 ) System.out.printf( "Printed F            this many -> %d\n", _f );
        if ( _g > 0 ) System.out.printf( "Printed G            this many -> %d\n", _g );
        if ( _h > 0 ) System.out.printf( "Printed H            this many -> %d\n", _h );
        if ( _i > 0 ) System.out.printf( "Printed I            this many -> %d\n", _i );
        if ( _j > 0 ) System.out.printf( "Printed J            this many -> %d\n", _j );
        if ( _k > 0 ) System.out.printf( "Printed K            this many -> %d\n", _k );
        if ( _l > 0 ) System.out.printf( "Printed L            this many -> %d\n", _l );
        if ( _m > 0 ) System.out.printf( "Printed M            this many -> %d\n", _m );
        if ( _n > 0 ) System.out.printf( "Printed N            this many -> %d\n", _n );
        if ( _o > 0 ) System.out.printf( "Printed O            this many -> %d\n", _o );
        if ( _p > 0 ) System.out.printf( "Printed P            this many -> %d\n", _p );
        if ( _q > 0 ) System.out.printf( "Printed Q            this many -> %d\n", _q );
        if ( _r > 0 ) System.out.printf( "Printed R            this many -> %d\n", _r );
        if ( _s > 0 ) System.out.printf( "Printed S            this many -> %d\n", _s );
        if ( _t > 0 ) System.out.printf( "Printed T            this many -> %d\n", _t );
        if ( _u > 0 ) System.out.printf( "Printed U            this many -> %d\n", _u );
        if ( _v > 0 ) System.out.printf( "Printed V            this many -> %d\n", _v );
        if ( _w > 0 ) System.out.printf( "Printed W            this many -> %d\n", _w );
        if ( _x > 0 ) System.out.printf( "Printed X            this many -> %d\n", _x );
        if ( _y > 0 ) System.out.printf( "Printed Y            this many -> %d\n", _y );
        if ( _z > 0 ) System.out.printf( "Printed Z            this many -> %d\n", _z );
        if ( _0 > 0 ) System.out.printf( "Printed 0            this many -> %d\n", _0 );
        if ( _1 > 0 ) System.out.printf( "Printed 1            this many -> %d\n", _1 );
        if ( _2 > 0 ) System.out.printf( "Printed 2            this many -> %d\n", _2 );
        if ( _3 > 0 ) System.out.printf( "Printed 3            this many -> %d\n", _3 );
        if ( _4 > 0 ) System.out.printf( "Printed 4            this many -> %d\n", _4 );
        if ( _5 > 0 ) System.out.printf( "Printed 5            this many -> %d\n", _5 );
        if ( _6 > 0 ) System.out.printf( "Printed 6            this many -> %d\n", _6 );
        if ( _7 > 0 ) System.out.printf( "Printed 7            this many -> %d\n", _7 );
        if ( _8 > 0 ) System.out.printf( "Printed 8            this many -> %d\n", _8 );
        if ( _9 > 0 ) System.out.printf( "Printed 9            this many -> %d\n", _9 );
        if ( _sp > 0 ) System.out.printf( "Ignored <Space>      this many -> %d\n", _sp );
        if ( _uc > 0 ) System.out.printf( "Printed Unknown Char this many -> %d\n", _uc );
        
    }
    
    /**
     * <p>
     * Entrypoint of the program
     * </p>
     * 
     * @param args
     *            Nullable arguments
     */
    public static void main( @Nullable String args[] ) {
        // Print the important goodies
        printHeader( );
        
        // Read the Line, then split to a char[], then see how many times a
        // letter was entered.
        _scanner = new Scanner( System.in );
        _message = _scanner.nextLine( );
        char[] mArray = _message.toCharArray( );
        for ( char c : mArray ) {
            if ( !checkCharacter( c ) ) {
                if ( c == ' ' ) {
                    //System.out.printf( "Character <SPACE> ignored\n" );
                    _sp++;
                } else {
                    //System.out.printf( "Character %s ignored\n", c );
                    _uc++;
                }
            }
        }
        dropStack( );
    }
}
