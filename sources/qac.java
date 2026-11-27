// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class qac extends ReplacementSpan {
    public View a;
    public float d;
    public boolean e;
    public long f;
    public boolean n;
    public boolean r;
    public int b = 1;
    public int c = 2;
    public final k43 h = new k43(0.0f, 0.5f, 0.5f, 1.0f);

    public static CharSequence a(TextView textView, String str) {
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder = null;
        int i3 = 0;
        while (i3 < str.length()) {
            if (str.charAt(i3) == 8230) {
                i2 = 1;
            } else {
                if (str.charAt(i3) == '.' && (i = i3 + 2) < str.length() && str.charAt(i3 + 1) == '.' && str.charAt(i) == '.') {
                    i2 = 3;
                }
                i3++;
            }
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            qac qacVar = new qac();
            qacVar.a = textView;
            qacVar.n = false;
            spannableStringBuilder.setSpan(qacVar, i3, i3 + i2, 33);
            i3 += i2 - 1;
            i3++;
        }
        return spannableStringBuilder == null ? str : spannableStringBuilder;
    }

    public final void b(dl1 dl1Var) {
        this.a = dl1Var;
        this.n = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        float f3 = -(this.r ? textPaint.getFontMetrics().ascent : textPaint.getFontMetrics().top);
        float f4 = (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) * (this.n ? 0.05f : 0.0365f);
        float f5 = f3 - f4;
        if (!this.e) {
            float f6 = this.d + 0.053333335f;
            this.d = f6;
            if (f6 > 1.0f) {
                this.d = 0.0f;
                int i6 = this.b - 1;
                this.b = i6;
                this.c--;
                if (i6 < 0) {
                    this.b = 1;
                    this.c = 2;
                    this.e = true;
                    this.f = System.currentTimeMillis();
                }
            }
        } else if (System.currentTimeMillis() - this.f > 1000) {
            this.e = false;
        }
        for (int i7 = 0; i7 < 3; i7++) {
            float f7 = measureText / 2.0f;
            float f8 = (i7 * measureText) + f + f7;
            if (i7 == this.b) {
                f8 = hl.R1(f8, bs2.i(measureText, i7 + 1, f, f7), this.d);
                float f9 = this.d;
                f2 = hl.R1(f5, f5 - f7, this.h.getInterpolation(f9 < 0.5f ? f9 / 0.5f : qd4.x(f9, 0.5f, 0.5f, 1.0f)));
            } else {
                if (i7 == this.c) {
                    f8 = hl.R1(f8, bs2.i(measureText, i7 - 1, f, f7), this.d);
                }
                f2 = f5;
            }
            canvas.drawCircle(f8, f2, f4, paint);
        }
        View view = this.a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
