package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class rf0 extends org.telegram.ui.Components.voip.o2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.fw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(tf0 tf0Var, Context context, int i10) {
        super(tf0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = tf0Var;
                super(tf0Var.s0, context);
                break;
            default:
                this.f = tf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((tf0) this.f).i0;
            case 1:
                return ((tf0) this.f).i0;
            default:
                return ((re0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final boolean b() {
        rf0 rf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    tf0 tf0Var = (tf0) this.f;
                    if (tf0Var.V <= 0 || tf0Var.R == null) {
                    }
                }
                break;
            case 1:
                tf0 tf0Var2 = (tf0) this.f;
                if (!isClickable() || getVisibility() != 0 || tf0Var2.d0 || (((rf0Var = tf0Var2.v) != null && rf0Var.getVisibility() != 8) || tf0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    re0 re0Var = (re0) this.f;
                    if (re0Var.P <= 0 || re0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(re0 re0Var, Context context) {
        super(re0Var.a0, context);
        this.e = 2;
        this.f = re0Var;
    }
}
