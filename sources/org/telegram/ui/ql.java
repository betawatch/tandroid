package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ql extends org.telegram.ui.Components.xz0 {
    public final /* synthetic */ un K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, un unVar) {
        super(activity);
        this.K = unVar;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = org.telegram.messenger.i0.L(24.0f);
        this.e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.uo0(this, 17);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, p6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.i0.L(6.0f);
        int i10 = org.telegram.ui.ActionBar.t6.tj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(this, d02, N, null, p6Var);
    }

    public final void d() {
        int i10 = -(org.telegram.messenger.i0.L(16.0f) + getMeasuredHeight());
        un unVar = this.K;
        setTranslationY((unVar.Z.getTop() - unVar.l1.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i10)));
    }

    @Override // org.telegram.ui.Components.xz0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // org.telegram.ui.Components.xz0, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
