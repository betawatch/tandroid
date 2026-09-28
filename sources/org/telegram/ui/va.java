package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                tp0 tp0Var = (tp0) this.b;
                k0 k0Var = tp0Var.d;
                ep0 ep0Var = tp0Var.h.b;
                gh.d.a(ep0Var, canvas, rectF, ep0Var, k0Var);
                ep0 ep0Var2 = tp0Var.n.b;
                gh.d.a(ep0Var2, canvas, rectF, ep0Var2, k0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.yl0 yl0Var = premiumPreviewFragment.a;
                gh.d.a(yl0Var, canvas, rectF, yl0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
