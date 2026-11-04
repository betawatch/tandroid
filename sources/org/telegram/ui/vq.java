package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vq extends zq {
    public final /* synthetic */ int c2;
    public final /* synthetic */ int d2;
    public final /* synthetic */ xq e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(xq xqVar, Context context, int i3, int i10) {
        super(context);
        this.e2 = xqVar;
        this.c2 = i3;
        this.d2 = i10;
        this.K1 = 1.0f;
        this.L1 = new q1.g(this, zq.Y1);
        this.M1 = new q1.g(this, zq.Z1);
        this.N1 = new q1.g(this, zq.a2);
        this.O1 = new q1.g(this, zq.b2);
        this.P1 = true;
        this.Q1 = 1.0f;
        this.R1 = 1.0f;
        this.X1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new n0(this, 6));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        xq xqVar = this.e2;
        int length = xqVar.f.length;
        int i3 = this.c2;
        if (i3 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && xqVar.f[i3].length() == 1) {
            xqVar.f[i3].D();
            xqVar.f[i3].setText("");
            return true;
        }
        if (keyCode == 67 && xqVar.f[i3].length() == 0 && i3 > 0) {
            zq[] zqVarArr = xqVar.f;
            zqVarArr[i3 - 1].setSelection(zqVarArr[i3 - 1].length());
            for (int i10 = 0; i10 < i3; i10++) {
                if (i10 == i3 - 1) {
                    xqVar.f[i3 - 1].requestFocus();
                } else {
                    xqVar.f[i10].clearFocus();
                }
            }
            xqVar.f[i3 - 1].D();
            xqVar.f[i3 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (xqVar.f[i3].getText() != null && num.equals(xqVar.f[i3].getText().toString())) {
                if (i3 >= this.d2 - 1) {
                    xqVar.a();
                } else {
                    xqVar.f[i3 + 1].requestFocus();
                }
                return true;
            }
            if (xqVar.f[i3].length() > 0) {
                xqVar.f[i3].D();
            }
            xqVar.f[i3].setText(num);
        }
        return true;
    }
}
