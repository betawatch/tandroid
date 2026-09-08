package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class rl extends org.telegram.ui.Components.m01 {
    public final /* synthetic */ co K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, co coVar) {
        super(activity);
        this.K = coVar;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.jq0(this, 14);
        this.J = new Path();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var);
        int alpha = Color.alpha(v02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(v02);
        paint.setColor(v02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var)));
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        co coVar = this.K;
        setTranslationY((coVar.Y.getTop() - coVar.X0.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i10)));
    }

    @Override // org.telegram.ui.Components.m01, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // org.telegram.ui.Components.m01, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
