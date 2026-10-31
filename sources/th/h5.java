package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h5 extends View {
    public final String a;
    public final String b;
    public final bi0 c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f;
    public final RectF h;
    public float n;
    public final Rect r;

    public h5(Context context, int i10, String str, String str2) {
        super(context);
        this.r = new Rect();
        this.a = str;
        this.b = str2;
        bi0 bi0Var = new bi0(i10, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), true, null);
        this.c = bi0Var;
        bi0Var.K(1);
        bi0Var.R(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = org.telegram.messenger.i0.L(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int L2 = (int) ((org.telegram.messenger.i0.L(8.0f) * this.n) + org.telegram.messenger.i0.L(36.0f));
        int i10 = L2 / 2;
        int i11 = L - i10;
        int i12 = measuredHeight - i10;
        bi0 bi0Var = this.c;
        bi0Var.setBounds(i11, i12, i11 + L2, L2 + i12);
        bi0Var.draw(canvas);
        if (this.n > 0.0f) {
            float N = (1.0f - this.n) * org.telegram.messenger.i0.N(4.0f);
            float f7 = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f7;
            float measuredHeight2 = getMeasuredHeight() - f7;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i13 = (int) (this.n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i13);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.0f), paint);
            canvas.save();
            float f10 = this.n;
            canvas.scale((f10 * 0.05f) + 1.0f, (f10 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.a, org.telegram.messenger.i0.N(80.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.N(4.0f), this.e);
        canvas.drawText(this.b, org.telegram.messenger.i0.N(80.0f), org.telegram.messenger.i0.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f);
        if (this.n > 0.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int L = org.telegram.messenger.i0.L(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int L2 = org.telegram.messenger.i0.L(36.0f);
        int i12 = L2 / 2;
        int i13 = L - i12;
        int i14 = measuredHeight - i12;
        this.c.setBounds(i13, i14, i13 + L2, L2 + i14);
    }
}
