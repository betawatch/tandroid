package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b0 extends ei.d {
    public final RectF k0;
    public boolean l0;
    public float m0;
    public final org.telegram.ui.Components.voip.h n0;

    public b0(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.k0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.n0 = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
    }

    @Override // ei.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.l0) {
            float f7 = this.m0 + 0.016f;
            this.m0 = f7;
            if (f7 > 3.0f) {
                this.l0 = false;
            }
        } else {
            float f10 = this.m0 - 0.016f;
            this.m0 = f10;
            if (f10 < 1.0f) {
                this.l0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.k0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        sg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.m0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), sg.b1.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.n0;
        hVar.f = measuredWidth2;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
