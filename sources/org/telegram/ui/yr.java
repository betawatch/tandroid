package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yr extends ds {
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ as L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(as asVar, Context context, int i10, int i11) {
        super(context);
        this.L = asVar;
        this.J = i10;
        this.K = i11;
        this.e = 1.0f;
        this.f = new o1.j(this, ds.F);
        this.h = new o1.j(this, ds.G);
        this.n = new o1.j(this, ds.H);
        this.r = new o1.j(this, ds.I);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.E = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new p0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        as asVar = this.L;
        int length = asVar.f.length;
        int i10 = this.J;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && asVar.f[i10].length() == 1) {
            asVar.f[i10].m();
            asVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && asVar.f[i10].length() == 0 && i10 > 0) {
            ds[] dsVarArr = asVar.f;
            dsVarArr[i10 - 1].setSelection(dsVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    asVar.f[i10 - 1].requestFocus();
                } else {
                    asVar.f[i11].clearFocus();
                }
            }
            asVar.f[i10 - 1].m();
            asVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (asVar.f[i10].getText() != null && num.equals(asVar.f[i10].getText().toString())) {
                if (i10 >= this.K - 1) {
                    asVar.a();
                } else {
                    asVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (asVar.f[i10].length() > 0) {
                asVar.f[i10].m();
            }
            asVar.f[i10].setText(num);
        }
        return true;
    }
}
