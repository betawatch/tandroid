package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((sb) this.b).Z(canvas, rectF);
                break;
            case 1:
                ip0 ip0Var = (ip0) this.b;
                m0 m0Var = ip0Var.d;
                to0 to0Var = ip0Var.h.b;
                hh.d.a(to0Var, canvas, rectF, to0Var, m0Var);
                to0 to0Var2 = ip0Var.n.b;
                hh.d.a(to0Var2, canvas, rectF, to0Var2, m0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.a;
                hh.d.a(im0Var, canvas, rectF, im0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
