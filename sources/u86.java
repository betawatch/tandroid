// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u86 extends ReplacementSpan {
    public final int a;
    public View b;
    public final r86 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public u86(View view, int i, int i2, wjb wjbVar) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i;
        this.d = i2;
        r86 r86Var = new r86(wjbVar);
        this.c = r86Var;
        r86Var.j(4.0f);
    }

    public final void a(int i, int i2) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i);
        r86 r86Var = this.c;
        r86Var.o = valueOf;
        r86Var.p = Integer.valueOf(i2);
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
        r86 r86Var = this.c;
        if (f2 > 0.0f) {
            float f3 = (i3 + i5) / 2.0f;
            int i7 = (int) f;
            float f4 = f2 / 2.0f;
            r86Var.setBounds(i7, (int) (f3 - f4), i6 + i7, (int) (f4 + f3));
        } else {
            int i8 = (int) f;
            float A = tb4.A(1.0f, this.e, ls6.x(2.0f, i5, i3) / 2.0f, i3);
            float f5 = this.d;
            r86Var.setBounds(i8, (int) (A + f5), i6 + i8, (int) (((i5 - gl.L(2.0f)) - ((1.0f - this.e) * (ls6.x(2.0f, i5, i3) / 2.0f))) + f5));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            r86Var.f(bkb.p1(0.1f, color), bkb.p1(0.25f, color));
        }
        r86Var.setAlpha((int) ((paint == null ? kk7.d4 : paint.getAlpha()) * this.h));
        r86Var.draw(canvas);
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
        r86 r86Var = this.c;
        if (z || (r86Var.o == null && r86Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            r86Var.f(bkb.p1(0.1f, color), bkb.p1(0.25f, color));
        }
        boolean z2 = this.n;
        int i3 = this.a;
        return (!z2 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i3 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i3;
    }

    public u86(int i, View view) {
        this(view, i, gl.L(2.0f), null);
    }
}
