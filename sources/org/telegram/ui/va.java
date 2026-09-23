package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                up0 up0Var = (up0) this.b;
                k0 k0Var = up0Var.d;
                fp0 fp0Var = up0Var.h.b;
                gh.d.a(fp0Var, canvas, rectF, fp0Var, k0Var);
                fp0 fp0Var2 = up0Var.n.b;
                gh.d.a(fp0Var2, canvas, rectF, fp0Var2, k0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.a;
                gh.d.a(ml0Var, canvas, rectF, ml0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
