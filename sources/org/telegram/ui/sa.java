package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                yb0.Z((yb0) obj, canvas, rectF);
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.tk0 tk0Var = premiumPreviewFragment.a;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, premiumPreviewFragment.d0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.R6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                ky0 ky0Var = ((ProfileActivity) obj).c1;
                ky0Var.O = true;
                ky0Var.draw(canvas);
                ky0Var.O = false;
                break;
            default:
                org.telegram.ui.Components.tk0 tk0Var2 = (org.telegram.ui.Components.tk0) obj;
                org.telegram.ui.Components.l9 l9Var = tk0Var2.R2;
                if (l9Var == null) {
                    org.telegram.ui.Components.ek0 ek0Var = tk0Var2.G2;
                    if (ek0Var != null) {
                        ek0Var.d(canvas, rectF);
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
