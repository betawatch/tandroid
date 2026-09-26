package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class wr extends as {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ yr O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(yr yrVar, Context context, int i10, int i11) {
        super(context);
        this.O = yrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.k(this, as.I);
        this.h = new o1.k(this, as.J);
        this.n = new o1.k(this, as.K);
        this.r = new o1.k(this, as.L);
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
        yr yrVar = this.O;
        int length = yrVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && yrVar.f[i10].length() == 1) {
            yrVar.f[i10].m();
            yrVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && yrVar.f[i10].length() == 0 && i10 > 0) {
            as[] asVarArr = yrVar.f;
            asVarArr[i10 - 1].setSelection(asVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    yrVar.f[i10 - 1].requestFocus();
                } else {
                    yrVar.f[i11].clearFocus();
                }
            }
            yrVar.f[i10 - 1].m();
            yrVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (yrVar.f[i10].getText() != null && num.equals(yrVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    yrVar.a();
                } else {
                    yrVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (yrVar.f[i10].length() > 0) {
                yrVar.f[i10].m();
            }
            yrVar.f[i10].setText(num);
        }
        return true;
    }
}
