package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ql extends org.telegram.ui.Components.r01 {
    public final /* synthetic */ zn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(activity);
        this.H = znVar;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.e = new OvershootInterpolator();
        this.E = new org.telegram.ui.Components.nq0(this, 14);
        this.G = new Path();
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
        zn znVar = this.H;
        setTranslationY((znVar.V.getTop() - znVar.U0.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i10)));
    }

    @Override // org.telegram.ui.Components.r01, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // org.telegram.ui.Components.r01, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
