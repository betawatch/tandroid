package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                cq0 cq0Var = (cq0) this.b;
                j0 j0Var = cq0Var.d;
                np0 np0Var = cq0Var.h.b;
                gh.d.a(np0Var, canvas, rectF, np0Var, j0Var);
                np0 np0Var2 = cq0Var.n.b;
                gh.d.a(np0Var2, canvas, rectF, np0Var2, j0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.vl0 vl0Var = premiumPreviewFragment.a;
                gh.d.a(vl0Var, canvas, rectF, vl0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
