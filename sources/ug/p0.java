package ug;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class p0 extends org.telegram.ui.Cells.q {
    public t1 e;
    public Paint f;
    public float h;

    @Override // org.telegram.ui.Cells.q, android.view.View
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        t1 t1Var = this.e;
        t1Var.c.set(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(5.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(5.0f));
        float f10 = -L;
        t1Var.a.set(f10, f10, getWidth() + L, getHeight() + L);
        canvas.save();
        float f11 = 1.0f - this.h;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        t1Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f);
        super.draw(canvas);
    }
}
