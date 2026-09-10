package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements ah.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ah.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((tb) this.b).Z(canvas, rectF);
                break;
            case 1:
                bq0 bq0Var = (bq0) this.b;
                k0 k0Var = bq0Var.d;
                lp0 lp0Var = bq0Var.h.b;
                fh.d.b(lp0Var, canvas, rectF, lp0Var, k0Var);
                lp0 lp0Var2 = bq0Var.n.b;
                fh.d.b(lp0Var2, canvas, rectF, lp0Var2, k0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.vl0 vl0Var = premiumPreviewFragment.a;
                fh.d.b(vl0Var, canvas, rectF, vl0Var, premiumPreviewFragment.d0);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ah.a
    public final void g(g.z zVar, RectF rectF) {
        switch (this.a) {
        }
        zVar.b = true;
    }
}
