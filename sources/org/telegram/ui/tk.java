package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class tk extends org.telegram.ui.Components.sy0 {
    public final /* synthetic */ an K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, an anVar) {
        super(activity);
        this.K = anVar;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = org.telegram.messenger.g0.L(24.0f);
        this.e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.ir0(this, 12);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, f6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.g0.L(6.0f);
        int i7 = org.telegram.ui.ActionBar.k6.tj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, N, null, f6Var);
    }

    public final void d() {
        int i7 = -(org.telegram.messenger.g0.L(16.0f) + getMeasuredHeight());
        an anVar = this.K;
        setTranslationY((anVar.Z.getTop() - anVar.l1.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i7)));
    }

    @Override // org.telegram.ui.Components.sy0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // org.telegram.ui.Components.sy0, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        d();
    }
}
