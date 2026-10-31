package sg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends ReplacementSpan {
    public final TextPaint a;
    public final RectF b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final p6 h;

    public b(p6 p6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new RectF();
        this.h = p6Var;
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setColor(t6.w0(t6.C6, p6Var));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(cd.L0(2131746423, null), this.a, org.telegram.messenger.i0.q.x, cd.X ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        this.a.setColor(t6.w0(t6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f, 31);
        canvas.translate(f7 + org.telegram.messenger.i0.L(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.e / 2.0f));
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.i0.L(8.0f) + this.d);
    }
}
