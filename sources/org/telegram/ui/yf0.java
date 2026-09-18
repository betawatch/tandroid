package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class yf0 extends org.telegram.ui.Components.voip.n2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.gw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(ag0 ag0Var, Context context, int i10) {
        super(ag0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = ag0Var;
                super(ag0Var.s0, context);
                break;
            default:
                this.f = ag0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((ag0) this.f).i0;
            case 1:
                return ((ag0) this.f).i0;
            default:
                return ((ye0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean b() {
        yf0 yf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    ag0 ag0Var = (ag0) this.f;
                    if (ag0Var.V <= 0 || ag0Var.R == null) {
                    }
                }
                break;
            case 1:
                ag0 ag0Var2 = (ag0) this.f;
                if (!isClickable() || getVisibility() != 0 || ag0Var2.d0 || (((yf0Var = ag0Var2.v) != null && yf0Var.getVisibility() != 8) || ag0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ye0 ye0Var = (ye0) this.f;
                    if (ye0Var.P <= 0 || ye0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(ye0 ye0Var, Context context) {
        super(ye0Var.a0, context);
        this.e = 2;
        this.f = ye0Var;
    }
}
