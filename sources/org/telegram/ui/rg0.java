package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rg0 extends fi.d {
    public final /* synthetic */ int k0;
    public final /* synthetic */ org.telegram.ui.Components.ma l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rg0(org.telegram.ui.Components.ma maVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var, true);
        this.k0 = i7;
        this.l0 = maVar;
    }

    @Override // fi.d
    public final float b(float f10, float f11) {
        switch (this.k0) {
            case 0:
                tg0 tg0Var = (tg0) this.l0;
                boolean z9 = tg0Var.i2 == 0.0f;
                tg0Var.i2 = f10;
                if (z9) {
                    tg0Var.j2 = new org.telegram.ui.Components.yo(tg0Var, 2);
                    tg0Var.e1(false);
                    break;
                }
                break;
            default:
                wg.f1 f1Var = (wg.f1) this.l0;
                boolean z10 = f1Var.o2 == 0.0f;
                f1Var.o2 = f10;
                if (z10) {
                    f1Var.p2 = new org.telegram.ui.Components.yo(f1Var, 3);
                    f1Var.n1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}
