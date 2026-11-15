package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yq extends dr {
    public final /* synthetic */ int h2;
    public final /* synthetic */ int i2;
    public final /* synthetic */ ar j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(ar arVar, Context context, int i7, int i10) {
        super(context);
        this.j2 = arVar;
        this.h2 = i7;
        this.i2 = i10;
        this.P1 = 1.0f;
        this.Q1 = new r1.g(this, dr.d2);
        this.R1 = new r1.g(this, dr.e2);
        this.S1 = new r1.g(this, dr.f2);
        this.T1 = new r1.g(this, dr.g2);
        this.U1 = true;
        this.V1 = 1.0f;
        this.W1 = 1.0f;
        this.c2 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        ar arVar = this.j2;
        int length = arVar.f.length;
        int i7 = this.h2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && arVar.f[i7].length() == 1) {
            arVar.f[i7].E();
            arVar.f[i7].setText("");
            return true;
        }
        if (keyCode == 67 && arVar.f[i7].length() == 0 && i7 > 0) {
            dr[] drVarArr = arVar.f;
            drVarArr[i7 - 1].setSelection(drVarArr[i7 - 1].length());
            for (int i10 = 0; i10 < i7; i10++) {
                if (i10 == i7 - 1) {
                    arVar.f[i7 - 1].requestFocus();
                } else {
                    arVar.f[i10].clearFocus();
                }
            }
            arVar.f[i7 - 1].E();
            arVar.f[i7 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (arVar.f[i7].getText() != null && num.equals(arVar.f[i7].getText().toString())) {
                if (i7 >= this.i2 - 1) {
                    arVar.a();
                } else {
                    arVar.f[i7 + 1].requestFocus();
                }
                return true;
            }
            if (arVar.f[i7].length() > 0) {
                arVar.f[i7].E();
            }
            arVar.f[i7].setText(num);
        }
        return true;
    }
}
