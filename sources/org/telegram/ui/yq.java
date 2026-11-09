package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yq extends dr {
    public final /* synthetic */ int b2;
    public final /* synthetic */ int c2;
    public final /* synthetic */ ar d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(ar arVar, Context context, int i7, int i10) {
        super(context);
        this.d2 = arVar;
        this.b2 = i7;
        this.c2 = i10;
        this.J1 = 1.0f;
        this.K1 = new r1.g(this, dr.X1);
        this.L1 = new r1.g(this, dr.Y1);
        this.M1 = new r1.g(this, dr.Z1);
        this.N1 = new r1.g(this, dr.a2);
        this.O1 = true;
        this.P1 = 1.0f;
        this.Q1 = 1.0f;
        this.W1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.s6.U(this, org.telegram.ui.ActionBar.l6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        ar arVar = this.d2;
        int length = arVar.f.length;
        int i7 = this.b2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && arVar.f[i7].length() == 1) {
            arVar.f[i7].D();
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
            arVar.f[i7 - 1].D();
            arVar.f[i7 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (arVar.f[i7].getText() != null && num.equals(arVar.f[i7].getText().toString())) {
                if (i7 >= this.c2 - 1) {
                    arVar.a();
                } else {
                    arVar.f[i7 + 1].requestFocus();
                }
                return true;
            }
            if (arVar.f[i7].length() > 0) {
                arVar.f[i7].D();
            }
            arVar.f[i7].setText(num);
        }
        return true;
    }
}
