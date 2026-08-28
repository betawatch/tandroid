package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qr extends vr {
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ sr K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(sr srVar, Context context, int i9, int i10) {
        super(context);
        this.K = srVar;
        this.I = i9;
        this.J = i10;
        this.e = 1.0f;
        this.f = new o1.j(this, vr.E);
        this.h = new o1.j(this, vr.F);
        this.n = new o1.j(this, vr.G);
        this.r = new o1.j(this, vr.H);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.D = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new o0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        sr srVar = this.K;
        int length = srVar.f.length;
        int i9 = this.I;
        if (i9 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && srVar.f[i9].length() == 1) {
            srVar.f[i9].m();
            srVar.f[i9].setText("");
            return true;
        }
        if (keyCode == 67 && srVar.f[i9].length() == 0 && i9 > 0) {
            vr[] vrVarArr = srVar.f;
            vrVarArr[i9 - 1].setSelection(vrVarArr[i9 - 1].length());
            for (int i10 = 0; i10 < i9; i10++) {
                if (i10 == i9 - 1) {
                    srVar.f[i9 - 1].requestFocus();
                } else {
                    srVar.f[i10].clearFocus();
                }
            }
            srVar.f[i9 - 1].m();
            srVar.f[i9 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (srVar.f[i9].getText() != null && num.equals(srVar.f[i9].getText().toString())) {
                if (i9 >= this.J - 1) {
                    srVar.a();
                } else {
                    srVar.f[i9 + 1].requestFocus();
                }
                return true;
            }
            if (srVar.f[i9].length() > 0) {
                srVar.f[i9].m();
            }
            srVar.f[i9].setText(num);
        }
        return true;
    }
}
