import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


public class PageAdressCalc extends JFrame {

	public static void main(String[] args) {

		new PageAdressCalc(41004); // 41004 25666 8200
	}

	/**
	 * Create the frame.
	 */
	public PageAdressCalc(int val) {
		System.out.println("relativ adr.: " + val + " (" + Integer.toBinaryString(val) + ")");
		int pagenr = val >> 13;
		System.out.println("page#: " + pagenr + " (" + Integer.toBinaryString(pagenr) + ")");
		int val2 = val << 19;
		int offset = val2 >> 19;
		System.out.println("offset: " + offset + " (" + Integer.toBinaryString(offset) + ")");
		int framenr = pageTabel(pagenr);
		
		System.out.print("frame#: " + framenr + " (" + Integer.toBinaryString(framenr) + ")");
		
		System.out.println();
		int absadr = (framenr << 13) + offset;
		
		System.out.println("absolut adr: " + absadr + " (" + Integer.toBinaryString(absadr) + ")");
		
	}
	
	public int pageTabel(int framenr) { // hardcoded "pagetabel"
		int pagenr = 0;
		if (framenr == 5) {
			pagenr = 3;
		}
		else if (framenr == 1) {
			pagenr = 2;
		}
		else if (framenr == 3) {
			pagenr = 1;
		}
		else if (framenr == 6) {
			pagenr = 0;
		}
		else {
			pagenr = -1;
		}
		
		return pagenr;		
	}

}
