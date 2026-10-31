package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e9 extends View implements y1 {
    public Paint a;
    public Paint b;
    public org.telegram.ui.Components.e6 c;
    public boolean d;
    public org.telegram.ui.Components.t5 e;

    public final void a(long j10, boolean z10) {
        long j11 = j10 % 60;
        long j12 = (j10 - j11) / 60;
        StringBuilder sb2 = new StringBuilder(5);
        if (j12 < 10) {
            sb2.append('0');
        }
        sb2.append(j12);
        sb2.append(':');
        if (j11 < 10) {
            sb2.append('0');
        }
        sb2.append(j11);
        this.c.t(sb2, z10, true);
    }

    public final void b(boolean z10, boolean z11) {
        this.d = z10;
        if (!z11) {
            this.e.e(true, z10 ? 1.0f : 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        org.telegram.ui.Components.e6 e6Var = this.c;
        super.onDraw(canvas);
        float e = this.e.e(false, this.d ? 1.0f : 0.0f);
        float L = org.telegram.messenger.i0.L(12.66f) * e;
        float c10 = e6Var.c() + L;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(18.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(40.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.a);
        if (e > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin(((System.currentTimeMillis() % 2000) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + org.telegram.messenger.i0.L(10.66f), rectF.centerY(), org.telegram.messenger.i0.L(4.0f) * e, paint);
        }
        e6Var.setBounds((int) (rectF.left + L), ((int) rectF.top) - org.telegram.messenger.i0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        e6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(45.0f), TLObject.FLAG_30));
    }

    @Override // vh.y1
    public void setInvert(float f7) {
        this.a.setColor(i0.b.f(f7, 1056964608, TLObject.FLAG_28));
        this.c.u(i0.b.f(f7, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
