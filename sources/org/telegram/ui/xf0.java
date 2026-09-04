package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xf0 extends org.telegram.ui.Components.voip.l2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.tv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf0(zf0 zf0Var, Context context, int i10) {
        super(zf0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = zf0Var;
                super(zf0Var.s0, context);
                break;
            default:
                this.f = zf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((zf0) this.f).i0;
            case 1:
                return ((zf0) this.f).i0;
            default:
                return ((xe0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean b() {
        xf0 xf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    zf0 zf0Var = (zf0) this.f;
                    if (zf0Var.V <= 0 || zf0Var.R == null) {
                    }
                }
                break;
            case 1:
                zf0 zf0Var2 = (zf0) this.f;
                if (!isClickable() || getVisibility() != 0 || zf0Var2.d0 || (((xf0Var = zf0Var2.v) != null && xf0Var.getVisibility() != 8) || zf0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    xe0 xe0Var = (xe0) this.f;
                    if (xe0Var.P <= 0 || xe0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf0(xe0 xe0Var, Context context) {
        super(xe0Var.a0, context);
        this.e = 2;
        this.f = xe0Var;
    }
}
