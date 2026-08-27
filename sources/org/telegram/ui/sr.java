package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sr extends wr {
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ ur K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(ur urVar, Context context, int i10, int i11) {
        super(context);
        this.K = urVar;
        this.I = i10;
        this.J = i11;
        this.e = 1.0f;
        this.f = new o1.j(this, wr.E);
        this.h = new o1.j(this, wr.F);
        this.n = new o1.j(this, wr.G);
        this.r = new o1.j(this, wr.H);
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
        ur urVar = this.K;
        int length = urVar.f.length;
        int i10 = this.I;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && urVar.f[i10].length() == 1) {
            urVar.f[i10].m();
            urVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && urVar.f[i10].length() == 0 && i10 > 0) {
            wr[] wrVarArr = urVar.f;
            wrVarArr[i10 - 1].setSelection(wrVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    urVar.f[i10 - 1].requestFocus();
                } else {
                    urVar.f[i11].clearFocus();
                }
            }
            urVar.f[i10 - 1].m();
            urVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (urVar.f[i10].getText() != null && num.equals(urVar.f[i10].getText().toString())) {
                if (i10 >= this.J - 1) {
                    urVar.a();
                } else {
                    urVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (urVar.f[i10].length() > 0) {
                urVar.f[i10].m();
            }
            urVar.f[i10].setText(num);
        }
        return true;
    }
}
