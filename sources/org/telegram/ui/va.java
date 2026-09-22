package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va(Object obj, int i10) {
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
                ((rb) this.b).Z(canvas, rectF);
                break;
            case 1:
                aq0 aq0Var = (aq0) this.b;
                j0 j0Var = aq0Var.d;
                lp0 lp0Var = aq0Var.h.b;
                gh.d.a(lp0Var, canvas, rectF, lp0Var, j0Var);
                lp0 lp0Var2 = aq0Var.n.b;
                gh.d.a(lp0Var2, canvas, rectF, lp0Var2, j0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.a;
                gh.d.a(ll0Var, canvas, rectF, ll0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
