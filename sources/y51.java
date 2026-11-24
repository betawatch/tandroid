// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y51 extends ReplacementSpan {
    public final ylb a;
    public final Paint b = new Paint(1);
    public final uib c;
    public final Runnable d;
    public u51 e;
    public Integer f;

    public y51(String str, Runnable runnable, ylb ylbVar) {
        this.a = ylbVar;
        this.d = runnable;
        this.c = new uib(str, 12.0f, null);
    }

    public static SpannableString b(String str, Runnable runnable, ylb ylbVar, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        y51 y51Var = new y51(str, runnable, ylbVar);
        spannableString.setSpan(y51Var, 0, spannableString.length(), 33);
        y51Var.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + gm.L(14.0f));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float N = gm.N(17.0f);
        float f2 = (i3 + i5) / 2.0f;
        RectF rectF = gm.P;
        float f3 = N / 2.0f;
        rectF.set(f, f2 - f3, a() + f, f2 + f3);
        u51 u51Var = this.e;
        float a = u51Var == null ? 1.0f : u51Var.a(0.025f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        int intValue = num != null ? num.intValue() : cmb.v0(cmb.Ei, this.a);
        int p1 = cmb.p1(0.15f, intValue);
        Paint paint2 = this.b;
        paint2.setColor(p1);
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        this.c.c(f + gm.L(7.0f), f2, 1.0f, intValue, canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
