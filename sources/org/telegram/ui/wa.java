package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((sb) this.b).Z(canvas, rectF);
                break;
            case 1:
                aq0 aq0Var = (aq0) this.b;
                k0 k0Var = aq0Var.d;
                lp0 lp0Var = aq0Var.h.b;
                gh.d.a(lp0Var, canvas, rectF, lp0Var, k0Var);
                lp0 lp0Var2 = aq0Var.n.b;
                gh.d.a(lp0Var2, canvas, rectF, lp0Var2, k0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.qm0 qm0Var = premiumPreviewFragment.a;
                gh.d.a(qm0Var, canvas, rectF, qm0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
