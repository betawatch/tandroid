package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d0 extends fi.d {
    public final RectF k0;
    public boolean l0;
    public float m0;
    public final org.telegram.ui.Components.voip.n n0;

    public d0(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.k0 = new RectF();
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.n0 = nVar;
        nVar.n = 1.2f;
        nVar.k = false;
        nVar.m = 4.0f;
    }

    @Override // fi.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.l0) {
            float f10 = this.m0 + 0.016f;
            this.m0 = f10;
            if (f10 > 3.0f) {
                this.l0 = false;
            }
        } else {
            float f11 = this.m0 - 0.016f;
            this.m0 = f11;
            if (f11 < 1.0f) {
                this.l0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.k0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.m0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ia.e.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.n nVar = this.n0;
        nVar.f = measuredWidth2;
        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
