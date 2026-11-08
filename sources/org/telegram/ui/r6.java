package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class r6 extends View implements org.telegram.ui.ActionBar.a6 {
    public Paint a;
    public Paint b;
    public float c;
    public org.telegram.ui.Components.w5 d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.a);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            Paint paint = this.a;
            int i7 = org.telegram.ui.ActionBar.k6.N6;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            this.b.setColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, i7, false)));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
