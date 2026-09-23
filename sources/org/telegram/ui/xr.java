package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xr extends bs {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ zr O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr(zr zrVar, Context context, int i10, int i11) {
        super(context);
        this.O = zrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.k(this, bs.I);
        this.h = new o1.k(this, bs.J);
        this.n = new o1.k(this, bs.K);
        this.r = new o1.k(this, bs.L);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        zr zrVar = this.O;
        int length = zrVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && zrVar.f[i10].length() == 1) {
            zrVar.f[i10].m();
            zrVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && zrVar.f[i10].length() == 0 && i10 > 0) {
            bs[] bsVarArr = zrVar.f;
            bsVarArr[i10 - 1].setSelection(bsVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    zrVar.f[i10 - 1].requestFocus();
                } else {
                    zrVar.f[i11].clearFocus();
                }
            }
            zrVar.f[i10 - 1].m();
            zrVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (zrVar.f[i10].getText() != null && num.equals(zrVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    zrVar.a();
                } else {
                    zrVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (zrVar.f[i10].length() > 0) {
                zrVar.f[i10].m();
            }
            zrVar.f[i10].setText(num);
        }
        return true;
    }
}
