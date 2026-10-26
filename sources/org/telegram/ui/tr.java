package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tr extends xr {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ vr O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(vr vrVar, Context context, int i10, int i11) {
        super(context);
        this.O = vrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.j(this, xr.I);
        this.h = new o1.j(this, xr.J);
        this.n = new o1.j(this, xr.K);
        this.r = new o1.j(this, xr.L);
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
        vr vrVar = this.O;
        int length = vrVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && vrVar.f[i10].length() == 1) {
            vrVar.f[i10].m();
            vrVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && vrVar.f[i10].length() == 0 && i10 > 0) {
            xr[] xrVarArr = vrVar.f;
            xrVarArr[i10 - 1].setSelection(xrVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    vrVar.f[i10 - 1].requestFocus();
                } else {
                    vrVar.f[i11].clearFocus();
                }
            }
            vrVar.f[i10 - 1].m();
            vrVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (vrVar.f[i10].getText() != null && num.equals(vrVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    vrVar.a();
                } else {
                    vrVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (vrVar.f[i10].length() > 0) {
                vrVar.f[i10].m();
            }
            vrVar.f[i10].setText(num);
        }
        return true;
    }
}
