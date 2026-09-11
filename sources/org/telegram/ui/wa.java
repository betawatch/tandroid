package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                ((rb) this.b).Z(canvas, rectF);
                break;
            case 1:
                bq0 bq0Var = (bq0) this.b;
                j0 j0Var = bq0Var.d;
                mp0 mp0Var = bq0Var.h.b;
                hh.d.b(mp0Var, canvas, rectF, mp0Var, j0Var);
                mp0 mp0Var2 = bq0Var.n.b;
                hh.d.b(mp0Var2, canvas, rectF, mp0Var2, j0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.ll0 ll0Var = premiumPreviewFragment.a;
                hh.d.b(ll0Var, canvas, rectF, ll0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
