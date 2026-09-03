package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rf0 extends org.telegram.ui.Components.voip.n2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.vv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(tf0 tf0Var, Context context, int i10) {
        super(tf0Var.p0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = tf0Var;
                super(tf0Var.p0, context);
                break;
            default:
                this.f = tf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((tf0) this.f).f0;
            case 1:
                return ((tf0) this.f).f0;
            default:
                return ((re0) this.f).J;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean b() {
        rf0 rf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    tf0 tf0Var = (tf0) this.f;
                    if (tf0Var.S <= 0 || tf0Var.O == null) {
                    }
                }
                break;
            case 1:
                tf0 tf0Var2 = (tf0) this.f;
                if (!isClickable() || getVisibility() != 0 || tf0Var2.a0 || (((rf0Var = tf0Var2.v) != null && rf0Var.getVisibility() != 8) || tf0Var2.f0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    re0 re0Var = (re0) this.f;
                    if (re0Var.M <= 0 || re0Var.K == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(re0 re0Var, Context context) {
        super(re0Var.U, context);
        this.e = 2;
        this.f = re0Var;
    }
}
