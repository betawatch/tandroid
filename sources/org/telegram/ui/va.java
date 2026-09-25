package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                org.telegram.ui.Components.wl0 wl0Var = premiumPreviewFragment.a;
                gh.d.a(wl0Var, canvas, rectF, wl0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
