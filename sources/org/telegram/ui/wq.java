package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wq extends br {
    public final /* synthetic */ int b2;
    public final /* synthetic */ int c2;
    public final /* synthetic */ yq d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(yq yqVar, Context context, int i7, int i10) {
        super(context);
        this.d2 = yqVar;
        this.b2 = i7;
        this.c2 = i10;
        this.J1 = 1.0f;
        this.K1 = new r1.g(this, br.X1);
        this.L1 = new r1.g(this, br.Y1);
        this.M1 = new r1.g(this, br.Z1);
        this.N1 = new r1.g(this, br.a2);
        this.O1 = true;
        this.P1 = 1.0f;
        this.Q1 = 1.0f;
        this.W1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        yq yqVar = this.d2;
        int length = yqVar.f.length;
        int i7 = this.b2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && yqVar.f[i7].length() == 1) {
            yqVar.f[i7].D();
            yqVar.f[i7].setText("");
            return true;
        }
        if (keyCode == 67 && yqVar.f[i7].length() == 0 && i7 > 0) {
            br[] brVarArr = yqVar.f;
            brVarArr[i7 - 1].setSelection(brVarArr[i7 - 1].length());
            for (int i10 = 0; i10 < i7; i10++) {
                if (i10 == i7 - 1) {
                    yqVar.f[i7 - 1].requestFocus();
                } else {
                    yqVar.f[i10].clearFocus();
                }
            }
            yqVar.f[i7 - 1].D();
            yqVar.f[i7 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (yqVar.f[i7].getText() != null && num.equals(yqVar.f[i7].getText().toString())) {
                if (i7 >= this.c2 - 1) {
                    yqVar.a();
                } else {
                    yqVar.f[i7 + 1].requestFocus();
                }
                return true;
            }
            if (yqVar.f[i7].length() > 0) {
                yqVar.f[i7].D();
            }
            yqVar.f[i7].setText(num);
        }
        return true;
    }
}
