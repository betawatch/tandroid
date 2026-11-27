// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ya6 extends ReplacementSpan {
    public final int a;
    public View b;
    public final va6 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public ya6(View view, int i, int i2, vnb vnbVar) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i;
        this.d = i2;
        va6 va6Var = new va6(vnbVar);
        this.c = va6Var;
        va6Var.j(4.0f);
    }

    public final void a(int i, int i2) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i);
        va6 va6Var = this.c;
        va6Var.o = valueOf;
        va6Var.p = Integer.valueOf(i2);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        View view;
        boolean z = this.n;
        int i6 = this.a;
        if (z && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i6 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i6;
        }
        float f2 = this.f;
        va6 va6Var = this.c;
        if (f2 > 0.0f) {
            float f3 = (i3 + i5) / 2.0f;
            int i7 = (int) f;
            float f4 = f2 / 2.0f;
            va6Var.setBounds(i7, (int) (f3 - f4), i6 + i7, (int) (f4 + f3));
        } else {
            int i8 = (int) f;
            float A = qd4.A(1.0f, this.e, qu6.x(2.0f, i5, i3) / 2.0f, i3);
            float f5 = this.d;
            va6Var.setBounds(i8, (int) (A + f5), i6 + i8, (int) (((i5 - hl.L(2.0f)) - ((1.0f - this.e) * (qu6.x(2.0f, i5, i3) / 2.0f))) + f5));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            va6Var.f(aob.p1(0.1f, color), aob.p1(0.25f, color));
        }
        va6Var.setAlpha((int) ((paint == null ? jn7.d4 : paint.getAlpha()) * this.h));
        va6Var.draw(canvas);
        View view2 = this.b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        boolean z = this.r;
        va6 va6Var = this.c;
        if (z || (va6Var.o == null && va6Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            va6Var.f(aob.p1(0.1f, color), aob.p1(0.25f, color));
        }
        boolean z2 = this.n;
        int i3 = this.a;
        return (!z2 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i3 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i3;
    }

    public ya6(int i, View view) {
        this(view, i, hl.L(2.0f), null);
    }
}
