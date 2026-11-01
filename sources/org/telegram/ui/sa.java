package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements ug.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((qb) obj).X(canvas, rectF);
                break;
            case 1:
                xb0.a0((xb0) obj, canvas, rectF);
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.uk0 uk0Var = premiumPreviewFragment.a;
                yg.d.a(uk0Var, canvas, rectF, uk0Var, premiumPreviewFragment.d0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.S6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                jy0 jy0Var = ((ProfileActivity) obj).c1;
                jy0Var.O = true;
                jy0Var.draw(canvas);
                jy0Var.O = false;
                break;
            default:
                org.telegram.ui.Components.uk0 uk0Var2 = (org.telegram.ui.Components.uk0) obj;
                org.telegram.ui.Components.l9 l9Var = uk0Var2.R2;
                if (l9Var == null) {
                    org.telegram.ui.Components.fk0 fk0Var = uk0Var2.G2;
                    if (fk0Var != null) {
                        fk0Var.d(canvas, rectF);
                        break;
                    }
                } else {
                    l9Var.d(canvas, rectF);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ug.a
    public final void g(g.y yVar, RectF rectF) {
        switch (this.a) {
        }
        yVar.b = true;
    }
}
