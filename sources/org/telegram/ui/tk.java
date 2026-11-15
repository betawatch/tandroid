package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tk extends org.telegram.ui.Components.vy0 {
    public final /* synthetic */ an L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, an anVar) {
        super(activity);
        this.L = anVar;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = org.telegram.messenger.g0.L(24.0f);
        this.e = new OvershootInterpolator();
        this.I = new org.telegram.ui.Components.ro0(this, 15);
        this.K = new Path();
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, e6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.g0.L(6.0f);
        int i7 = org.telegram.ui.ActionBar.j6.wj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(this, d02, M, null, e6Var);
    }

    public final void d() {
        int i7 = -(org.telegram.messenger.g0.L(16.0f) + getMeasuredHeight());
        an anVar = this.L;
        setTranslationY((anVar.a0.getTop() - anVar.m1.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i7)));
    }

    @Override // org.telegram.ui.Components.vy0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // org.telegram.ui.Components.vy0, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        d();
    }
}
