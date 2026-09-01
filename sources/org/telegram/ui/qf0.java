package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qf0 extends org.telegram.ui.Components.voip.o2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.wv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(sf0 sf0Var, Context context, int i10) {
        super(sf0Var.p0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = sf0Var;
                super(sf0Var.p0, context);
                break;
            default:
                this.f = sf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((sf0) this.f).f0;
            case 1:
                return ((sf0) this.f).f0;
            default:
                return ((qe0) this.f).J;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final boolean b() {
        qf0 qf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    sf0 sf0Var = (sf0) this.f;
                    if (sf0Var.S <= 0 || sf0Var.O == null) {
                    }
                }
                break;
            case 1:
                sf0 sf0Var2 = (sf0) this.f;
                if (!isClickable() || getVisibility() != 0 || sf0Var2.a0 || (((qf0Var = sf0Var2.v) != null && qf0Var.getVisibility() != 8) || sf0Var2.f0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    qe0 qe0Var = (qe0) this.f;
                    if (qe0Var.M <= 0 || qe0Var.K == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(qe0 qe0Var, Context context) {
        super(qe0Var.U, context);
        this.e = 2;
        this.f = qe0Var;
    }
}
