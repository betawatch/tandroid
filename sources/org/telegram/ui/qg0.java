package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qg0 extends fi.d {
    public final /* synthetic */ int k0;
    public final /* synthetic */ org.telegram.ui.Components.na l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg0(org.telegram.ui.Components.na naVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var, true);
        this.k0 = i7;
        this.l0 = naVar;
    }

    @Override // fi.d
    public final float b(float f10, float f11) {
        switch (this.k0) {
            case 0:
                sg0 sg0Var = (sg0) this.l0;
                boolean z9 = sg0Var.f2 == 0.0f;
                sg0Var.f2 = f10;
                if (z9) {
                    sg0Var.g2 = new org.telegram.ui.Components.yo(sg0Var, 2);
                    sg0Var.e1(false);
                    break;
                }
                break;
            default:
                wg.f1 f1Var = (wg.f1) this.l0;
                boolean z10 = f1Var.l2 == 0.0f;
                f1Var.l2 = f10;
                if (z10) {
                    f1Var.m2 = new org.telegram.ui.Components.yo(f1Var, 3);
                    f1Var.n1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}
