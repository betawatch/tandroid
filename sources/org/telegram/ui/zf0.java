package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zf0 extends org.telegram.ui.Components.voip.n2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.vv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(bg0 bg0Var, Context context, int i10) {
        super(bg0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = bg0Var;
                super(bg0Var.s0, context);
                break;
            default:
                this.f = bg0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((bg0) this.f).i0;
            case 1:
                return ((bg0) this.f).i0;
            default:
                return ((ze0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean b() {
        zf0 zf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    bg0 bg0Var = (bg0) this.f;
                    if (bg0Var.V <= 0 || bg0Var.R == null) {
                    }
                }
                break;
            case 1:
                bg0 bg0Var2 = (bg0) this.f;
                if (!isClickable() || getVisibility() != 0 || bg0Var2.d0 || (((zf0Var = bg0Var2.v) != null && zf0Var.getVisibility() != 8) || bg0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ze0 ze0Var = (ze0) this.f;
                    if (ze0Var.P <= 0 || ze0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(ze0 ze0Var, Context context) {
        super(ze0Var.a0, context);
        this.e = 2;
        this.f = ze0Var;
    }
}
