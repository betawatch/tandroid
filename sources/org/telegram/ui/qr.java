package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qr extends ur {
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ sr K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(sr srVar, Context context, int i10, int i11) {
        super(context);
        this.K = srVar;
        this.I = i10;
        this.J = i11;
        this.e = 1.0f;
        this.f = new o1.k(this, ur.E);
        this.h = new o1.k(this, ur.F);
        this.n = new o1.k(this, ur.G);
        this.r = new o1.k(this, ur.H);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.D = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new p0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        sr srVar = this.K;
        int length = srVar.f.length;
        int i10 = this.I;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && srVar.f[i10].length() == 1) {
            srVar.f[i10].m();
            srVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && srVar.f[i10].length() == 0 && i10 > 0) {
            ur[] urVarArr = srVar.f;
            urVarArr[i10 - 1].setSelection(urVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    srVar.f[i10 - 1].requestFocus();
                } else {
                    srVar.f[i11].clearFocus();
                }
            }
            srVar.f[i10 - 1].m();
            srVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (srVar.f[i10].getText() != null && num.equals(srVar.f[i10].getText().toString())) {
                if (i10 >= this.J - 1) {
                    srVar.a();
                } else {
                    srVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (srVar.f[i10].length() > 0) {
                srVar.f[i10].m();
            }
            srVar.f[i10].setText(num);
        }
        return true;
    }
}
