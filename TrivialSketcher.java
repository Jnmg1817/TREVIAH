/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivial2;

/**
 *
 * @author User
 */
import java.awt.BorderLayout;
import java.awt.Color;
    import java.awt.Graphics;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.awt.event.MouseEvent;
    import java.awt.event.MouseListener;
    import java.awt.event.MouseMotionListener;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;

    class STDrawingArea extends JPanel implements MouseListener,MouseMotionListener,ActionListener
    {
        int xPressed,yPressed;
        int xReleased,yReleased;
        int xDragged,yDragged;
        private JButton clear;
        public STDrawingArea()
        {
           // setPreferredSize(new Dimension(600, 500));
            //setBounds(0, 0, 480, 500);
           
            clear=new JButton("CLEAR");
            clear.setBounds(0, 0, 100, 25);
            setLayout(null);
            add(clear);
            clear.addActionListener(this);
            addMouseListener(this);
            addMouseMotionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
             if(e.getSource()==clear)
            {
                setOpaque(false);
                repaint();
            }
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            g.drawLine(xPressed,yPressed,xDragged,yDragged);
            xPressed=xDragged;
            yPressed=yDragged;
        }

        @Override
        public void mouseDragged(MouseEvent arg0) {
            Graphics g = getGraphics();
            g.drawLine(xPressed, yPressed, arg0.getX(), arg0.getY());
            xDragged = arg0.getX();
            yDragged = arg0.getY();
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseClicked(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mousePressed(MouseEvent arg0) {
            // TODO Auto-generated method stub
            setOpaque(true);
            xPressed = arg0.getX();
            yPressed = arg0.getY();
        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }
    }
    class Frame4 extends JFrame
   {
    private STDrawingArea da;
        public Frame4()
       {
           da=new STDrawingArea();
           da.setBackground(Color.BLUE);
            da.setLayout(new BorderLayout());
            add(da);
        }
    }
