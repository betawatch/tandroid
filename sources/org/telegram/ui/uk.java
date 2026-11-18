package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uk extends org.telegram.ui.Components.cz0 {
    public final /* synthetic */ bn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        super(activity);
        this.L = bnVar;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = org.telegram.messenger.g0.L(24.0f);
        this.e = new OvershootInterpolator();
        this.I = new org.telegram.ui.Components.ap0(this, 15);
        this.K = new Path();
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, i6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.g0.L(6.0f);
        int i7 = org.telegram.ui.ActionBar.n6.wj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, M, null, i6Var);
    }

    public final void d() {
        int i7 = -(org.telegram.messenger.g0.L(16.0f) + getMeasuredHeight());
        bn bnVar = this.L;
        setTranslationY((bnVar.a0.getTop() - bnVar.m1.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i7)));
    }

    @Override // org.telegram.ui.Components.cz0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // org.telegram.ui.Components.cz0, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        d();
    }
}
