package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vr extends zr {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ xr O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(xr xrVar, Context context, int i10, int i11) {
        super(context);
        this.O = xrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.j(this, zr.I);
        this.h = new o1.j(this, zr.J);
        this.n = new o1.j(this, zr.K);
        this.r = new o1.j(this, zr.L);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.H = false;
        setBackground(null);
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        xr xrVar = this.O;
        int length = xrVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && xrVar.f[i10].length() == 1) {
            xrVar.f[i10].m();
            xrVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && xrVar.f[i10].length() == 0 && i10 > 0) {
            zr[] zrVarArr = xrVar.f;
            zrVarArr[i10 - 1].setSelection(zrVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    xrVar.f[i10 - 1].requestFocus();
                } else {
                    xrVar.f[i11].clearFocus();
                }
            }
            xrVar.f[i10 - 1].m();
            xrVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (xrVar.f[i10].getText() != null && num.equals(xrVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    xrVar.a();
                } else {
                    xrVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (xrVar.f[i10].length() > 0) {
                xrVar.f[i10].m();
            }
            xrVar.f[i10].setText(num);
        }
        return true;
    }
}
