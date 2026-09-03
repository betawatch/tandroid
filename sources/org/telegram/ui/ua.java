package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements pg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((pb) this.b).Z(canvas, rectF);
                break;
            case 1:
                np0 np0Var = (np0) this.b;
                l0 l0Var = np0Var.d;
                yo0 yo0Var = np0Var.h.b;
                ug.c.b(yo0Var, canvas, rectF, yo0Var, l0Var);
                yo0 yo0Var2 = np0Var.n.b;
                ug.c.b(yo0Var2, canvas, rectF, yo0Var2, l0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.sl0 sl0Var = premiumPreviewFragment.a;
                ug.c.b(sl0Var, canvas, rectF, sl0Var, premiumPreviewFragment.a0);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // pg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
