package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qr extends vr {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ sr O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(sr srVar, Context context, int i10, int i11) {
        super(context);
        this.O = srVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.k(this, vr.I);
        this.h = new o1.k(this, vr.J);
        this.n = new o1.k(this, vr.K);
        this.r = new o1.k(this, vr.L);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new o0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        sr srVar = this.O;
        int length = srVar.f.length;
        int i10 = this.M;
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
            vr[] vrVarArr = srVar.f;
            vrVarArr[i10 - 1].setSelection(vrVarArr[i10 - 1].length());
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
                if (i10 >= this.N - 1) {
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
