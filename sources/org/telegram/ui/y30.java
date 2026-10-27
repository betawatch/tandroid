package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y30 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ x50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = x50Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x50 x50Var = this.e;
        z30 z30Var = x50Var.F;
        float y3 = z30Var.getY() + z30Var.getMeasuredHeight();
        oe.e eVar = x50Var.B3;
        float f7 = y3 - eVar.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f7, measuredWidth, measuredHeight);
        float y10 = z30Var.getY() + z30Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y10, measuredWidth2, measuredHeight2);
        float y11 = (z30Var.getY() + z30Var.getMeasuredHeight()) - eVar.f;
        float measuredWidth3 = getMeasuredWidth();
        float y12 = z30Var.getY() + z30Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y11, measuredWidth3, y12);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 < 29 || x50Var.Q2 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = x50Var.R2;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(x50Var.Q2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
