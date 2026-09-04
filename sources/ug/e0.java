package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e0 extends di.d {
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final org.telegram.ui.Components.voip.h k0;

    public e0(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.k0 = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
    }

    @Override // di.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.i0) {
            float f7 = this.j0 + 0.016f;
            this.j0 = f7;
            if (f7 > 3.0f) {
                this.i0 = false;
            }
        } else {
            float f10 = this.j0 - 0.016f;
            this.j0 = f10;
            if (f10 < 1.0f) {
                this.i0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.h0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        sg.d1.d().f((-getMeasuredWidth()) * 0.1f * this.j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), sg.d1.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.k0;
        hVar.f = measuredWidth2;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
