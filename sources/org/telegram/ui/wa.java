package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ((sb) this.b).Y(canvas, rectF);
                break;
            case 1:
                lp0 lp0Var = (lp0) this.b;
                l0 l0Var = lp0Var.d;
                wo0 wo0Var = lp0Var.h.b;
                hh.d.a(wo0Var, canvas, rectF, wo0Var, l0Var);
                wo0 wo0Var2 = lp0Var.n.b;
                hh.d.a(wo0Var2, canvas, rectF, wo0Var2, l0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.a;
                hh.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
