package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s41 extends q51 {
    public final /* synthetic */ b61 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41(b61 b61Var, Context context, boolean z10) {
        super(b61Var, context, z10);
        this.A = b61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b61 b61Var = this.A;
        dh.g gVar = b61Var.c0;
        s41 s41Var = b61Var.b0;
        b51 b51Var = b61Var.Q;
        if (b51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = gVar.getX() + s41Var.getX();
            float y10 = gVar.getY() + s41Var.getY();
            b5.d dVar = (b5.d) b51Var;
            hg.e0 e0Var = (hg.e0) dVar.b;
            hg.d0 d0Var = e0Var.a;
            org.telegram.ui.Components.uj0 uj0Var = (org.telegram.ui.Components.uj0) dVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            uj0Var.getDelegate().s(canvas, rectF, 0.0f, d0Var.getX() + x10, (e0Var.y == 1 ? d0Var.getY() - AndroidUtilities.statusBarHeight : d0Var.getY() + e0Var.c.getY()) + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.A.Q != null) {
                invalidate();
            }
        }
    }
}
