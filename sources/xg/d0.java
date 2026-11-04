package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d0 extends gi.d {
    public final RectF l0;
    public boolean m0;
    public float n0;
    public final org.telegram.ui.Components.voip.g o0;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.l0 = new RectF();
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.o0 = gVar;
        gVar.n = 1.2f;
        gVar.k = false;
        gVar.m = 4.0f;
    }

    @Override // gi.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.m0) {
            float f10 = this.n0 + 0.016f;
            this.n0 = f10;
            if (f10 > 3.0f) {
                this.m0 = false;
            }
        } else {
            float f11 = this.n0 - 0.016f;
            this.n0 = f11;
            if (f11 < 1.0f) {
                this.m0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.l0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        ha.e.d().f((-getMeasuredWidth()) * 0.1f * this.n0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ha.e.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.g gVar = this.o0;
        gVar.f = measuredWidth2;
        gVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
