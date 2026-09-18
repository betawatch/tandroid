package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i10) {
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
                ((tb) this.b).Z(canvas, rectF);
                break;
            case 1:
                cq0 cq0Var = (cq0) this.b;
                j0 j0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.b;
                gh.d.a(np0Var, canvas, rectF, np0Var, j0Var);
                np0 np0Var2 = cq0Var.n.b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, j0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.a;
                gh.d.a(ml0Var, canvas, rectF, ml0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
