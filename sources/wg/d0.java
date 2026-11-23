package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d0 extends hi.e {
    public final RectF m0;
    public boolean n0;
    public float o0;
    public final org.telegram.ui.Components.voip.n p0;

    public d0(Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.m0 = new RectF();
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.p0 = nVar;
        nVar.n = 1.2f;
        nVar.k = false;
        nVar.m = 4.0f;
    }

    @Override // hi.e, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n0) {
            float f10 = this.o0 + 0.016f;
            this.o0 = f10;
            if (f10 > 3.0f) {
                this.n0 = false;
            }
        } else {
            float f11 = this.o0 - 0.016f;
            this.o0 = f11;
            if (f11 < 1.0f) {
                this.n0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.o0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ia.e.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.n nVar = this.p0;
        nVar.f = measuredWidth2;
        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
