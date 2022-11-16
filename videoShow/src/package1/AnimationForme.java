/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.awt.Color;
import java.awt.Graphics;

/**
 */
public class AnimationForme implements IObjetAnimable  {
    
    private Forme forme;
    private IFormeAnimable formeAnimable;

    public AnimationForme(Forme forme, IFormeAnimable formeAnimable) {
        this.forme = forme;
        this.formeAnimable = formeAnimable;
    }

    public AnimationForme(int i, int x, int y, int r, float epTrait, Color cTrait, Color cRemp) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void deplacer() {
        this.formeAnimable.deplacer(this.forme);
    }

    @Override
    public void dessiner(Graphics g) {
        this.forme.dessiner(g);
    }
    
    
    
}