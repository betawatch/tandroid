package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements og.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((rb) this.b).Z(canvas, rectF);
                break;
            case 1:
                np0 np0Var = (np0) this.b;
                n0 n0Var = np0Var.d;
                yo0 yo0Var = np0Var.h.b;
                tg.c.b(yo0Var, canvas, rectF, yo0Var, n0Var);
                yo0 yo0Var2 = np0Var.n.b;
                tg.c.b(yo0Var2, canvas, rectF, yo0Var2, n0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.rl0 rl0Var = premiumPreviewFragment.a;
                tg.c.b(rl0Var, canvas, rectF, rl0Var, premiumPreviewFragment.a0);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // og.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
