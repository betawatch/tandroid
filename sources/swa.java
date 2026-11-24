// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class swa extends ReplacementSpan {
    public final Paint a;
    public final uib b;
    public final /* synthetic */ int c;

    public swa(int i, String str) {
        this.c = i;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(cmb.p1(0.1f, i));
        this.b = new uib(str, 13.0f, gm.o());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        RectF rectF = gm.P;
        rectF.set(f, (r12 - gm.L(20.0f)) / 2.0f, gm.L(12.0f) + f + this.b.c, (gm.L(20.0f) + r12) / 2.0f);
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), this.a);
        int i6 = this.c;
        this.b.c(f + gm.L(6.0f), (i3 + i5) / 2.0f, 1.0f, i6, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (gm.L(12.0f) + this.b.c);
    }
}
