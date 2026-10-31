package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r6 extends View implements org.telegram.ui.ActionBar.k6 {
    public Paint a;
    public Paint b;
    public float c;
    public org.telegram.ui.Components.t5 d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.a);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            Paint paint = this.a;
            int i10 = org.telegram.ui.ActionBar.t6.N6;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            this.b.setColor(org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
