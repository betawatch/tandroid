package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements jg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((mb) this.b).Z(canvas, rectF);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.wk0 wk0Var = premiumPreviewFragment.a;
                og.d.b(wk0Var, canvas, rectF, wk0Var, premiumPreviewFragment.Z);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // jg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
