package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                kp0 kp0Var = (kp0) this.b;
                m0 m0Var = kp0Var.d;
                vo0 vo0Var = kp0Var.h.b;
                hh.d.a(vo0Var, canvas, rectF, vo0Var, m0Var);
                vo0 vo0Var2 = kp0Var.n.b;
                hh.d.a(vo0Var2, canvas, rectF, vo0Var2, m0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.im0 im0Var = premiumPreviewFragment.a;
                hh.d.a(im0Var, canvas, rectF, im0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
