// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ss1 extends pmb {
    public final /* synthetic */ zu1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss1(zu1 zu1Var, vnb vnbVar, Activity activity) {
        super(activity);
        this.L = zu1Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = hl.L(24.0f);
        this.e = new OvershootInterpolator();
        this.I = new s8b(this, (byte) 18);
        this.K = new Path();
        int v0 = aob.v0(aob.yj, vnbVar);
        int alpha = Color.alpha(v0);
        textPaint.setTextSize(hl.L(15.0f));
        textPaint.setColor(v0);
        paint.setColor(v0);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = hl.L(6.0f);
        int i = aob.wj;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        setBackground(b0);
        yob.j(this, b0, M, null, vnbVar);
    }

    public final void d() {
        int i = -(hl.L(16.0f) + getMeasuredHeight());
        zu1 zu1Var = this.L;
        setTranslationY((zu1Var.a0.getTop() - zu1Var.m1.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i)));
    }

    @Override // pmb, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // pmb, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
