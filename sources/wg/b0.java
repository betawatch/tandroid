package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b0 extends hi.d {
    public final RectF l0;
    public boolean m0;
    public float n0;
    public final org.telegram.ui.Components.voip.n o0;

    public b0(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.l0 = new RectF();
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.o0 = nVar;
        nVar.n = 1.2f;
        nVar.k = false;
        nVar.m = 4.0f;
    }

    @Override // hi.d, android.view.View
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
        ia.f.d().f((-getMeasuredWidth()) * 0.1f * this.n0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ia.f.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.n nVar = this.o0;
        nVar.f = measuredWidth2;
        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
