package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o0 extends View {
    public final Paint a;
    public final TextPaint b;
    public final StaticLayout c;
    public final float d;
    public final float e;
    public final Path f;
    public d0 h;
    public boolean n;
    public final org.telegram.ui.Components.t5 r;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.f = new Path();
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(this);
        this.r = t5Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(6.0f)));
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(cd.M0("StoryDraftSaved"), textPaint, r1.x, TextUtils.TruncateAt.END), textPaint, org.telegram.messenger.i0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.c = staticLayout;
        this.d = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        t5Var.e(true, 0.0f);
    }

    public final void a(boolean z10) {
        d0 d0Var;
        if (!z10 && (d0Var = this.h) != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.h = null;
        }
        this.n = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = this.r.d(this.n);
        if (d <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (this.n ? gr.k.getInterpolation(d) : 1.0f) * org.telegram.messenger.i0.L(12.0f));
        float interpolation = gr.h.getInterpolation(d);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float L = org.telegram.messenger.i0.L(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(org.telegram.messenger.i0.L(135.0f), 0.35f * measuredWidth);
        float max = Math.max(org.telegram.messenger.i0.L(8.0f), min - (L / 2.0f));
        Path path = this.f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f7 = L + max;
        path.lineTo(f7, 0.0f);
        path.lineTo(f7, measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.lineTo(org.telegram.messenger.i0.L(7.0f) + min, measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.lineTo(org.telegram.messenger.i0.L(1.0f) + min, measuredHeight - org.telegram.messenger.i0.L(12.0f));
        path.lineTo(min - org.telegram.messenger.i0.L(1.0f), measuredHeight - org.telegram.messenger.i0.L(12.0f));
        path.lineTo(min - org.telegram.messenger.i0.L(7.0f), measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.lineTo(max, measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.close();
        Paint paint = this.a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.c;
        canvas.translate((max + org.telegram.messenger.i0.L(11.0f)) - this.e, ((measuredHeight - org.telegram.messenger.i0.L(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f));
    }
}
