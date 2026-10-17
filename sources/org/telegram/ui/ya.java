package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya(Object obj, int i10) {
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
                ((ub) this.b).Z(canvas, rectF);
                break;
            case 1:
                jp0 jp0Var = (jp0) this.b;
                m0 m0Var = jp0Var.d;
                uo0 uo0Var = jp0Var.h.b;
                hh.d.a(uo0Var, canvas, rectF, uo0Var, m0Var);
                uo0 uo0Var2 = jp0Var.n.b;
                hh.d.a(uo0Var2, canvas, rectF, uo0Var2, m0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.a;
                hh.d.a(im0Var, canvas, rectF, im0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
