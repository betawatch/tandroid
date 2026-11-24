// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oua extends ReplacementSpan {
    public final Paint a;
    public final tgb b;
    public final /* synthetic */ int c;

    public oua(int i, String str) {
        this.c = i;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(bkb.p1(0.1f, i));
        this.b = new tgb(str, 13.0f, gl.o());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        RectF rectF = gl.P;
        rectF.set(f, (r12 - gl.L(20.0f)) / 2.0f, gl.L(12.0f) + f + this.b.c, (gl.L(20.0f) + r12) / 2.0f);
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), this.a);
        int i6 = this.c;
        this.b.c(f + gl.L(6.0f), (i3 + i5) / 2.0f, 1.0f, i6, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (gl.L(12.0f) + this.b.c);
    }
}
