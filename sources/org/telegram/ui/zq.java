package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class zq extends er {
    public final /* synthetic */ int h2;
    public final /* synthetic */ int i2;
    public final /* synthetic */ br j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(br brVar, Context context, int i7, int i10) {
        super(context);
        this.j2 = brVar;
        this.h2 = i7;
        this.i2 = i10;
        this.P1 = 1.0f;
        this.Q1 = new r1.g(this, er.d2);
        this.R1 = new r1.g(this, er.e2);
        this.S1 = new r1.g(this, er.f2);
        this.T1 = new r1.g(this, er.g2);
        this.U1 = true;
        this.V1 = 1.0f;
        this.W1 = 1.0f;
        this.c2 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        br brVar = this.j2;
        int length = brVar.f.length;
        int i7 = this.h2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && brVar.f[i7].length() == 1) {
            brVar.f[i7].E();
            brVar.f[i7].setText("");
            return true;
        }
        if (keyCode == 67 && brVar.f[i7].length() == 0 && i7 > 0) {
            er[] erVarArr = brVar.f;
            erVarArr[i7 - 1].setSelection(erVarArr[i7 - 1].length());
            for (int i10 = 0; i10 < i7; i10++) {
                if (i10 == i7 - 1) {
                    brVar.f[i7 - 1].requestFocus();
                } else {
                    brVar.f[i10].clearFocus();
                }
            }
            brVar.f[i7 - 1].E();
            brVar.f[i7 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (brVar.f[i7].getText() != null && num.equals(brVar.f[i7].getText().toString())) {
                if (i7 >= this.i2 - 1) {
                    brVar.a();
                } else {
                    brVar.f[i7 + 1].requestFocus();
                }
                return true;
            }
            if (brVar.f[i7].length() > 0) {
                brVar.f[i7].E();
            }
            brVar.f[i7].setText(num);
        }
        return true;
    }
}
