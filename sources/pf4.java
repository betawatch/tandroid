// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pf4 extends ReplacementSpan {
    public final ylb a;
    public final Paint b;
    public final int c;
    public final uib d;

    public pf4(String str, int i, ylb ylbVar) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = ylbVar;
        this.c = i;
        this.d = new uib(str, 9.33f, gm.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int v0 = cmb.v0(this.c, this.a);
        int p1 = cmb.p1(0.15f, v0);
        Paint paint2 = this.b;
        paint2.setColor(p1);
        float f2 = (i5 + i3) / 2.0f;
        float L = gm.L(14.66f);
        RectF rectF = gm.P;
        float f3 = L / 2.0f;
        rectF.set(f, f2 - f3, this.d.j() + f + gm.L(9.33f), f3 + f2);
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint2);
        this.d.c(f + gm.L(4.66f), f2, 1.0f, v0, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.j() + gm.L(9.33f));
    }
}
