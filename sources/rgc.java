// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class rgc extends View implements qk4 {
    public Paint a;
    public Paint b;
    public hn c;
    public boolean d;
    public mm e;

    public final void a(long j, boolean z) {
        long j2 = j % 60;
        long j3 = (j - j2) / 60;
        StringBuilder sb = new StringBuilder(5);
        if (j3 < 10) {
            sb.append('0');
        }
        sb.append(j3);
        sb.append(':');
        if (j2 < 10) {
            sb.append('0');
        }
        sb.append(j2);
        this.c.t(sb, z, true);
    }

    public final void b(boolean z, boolean z2) {
        this.d = z;
        if (!z2) {
            this.e.e(true, z ? 1.0f : 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        hn hnVar = this.c;
        super.onDraw(canvas);
        float e = this.e.e(false, this.d ? 1.0f : 0.0f);
        float L = hl.L(12.66f) * e;
        float c = hnVar.c() + L;
        RectF rectF = hl.P;
        rectF.set(((getWidth() - c) / 2.0f) - hl.L(8.0f), hl.L(18.0f), ((getWidth() + c) / 2.0f) + hl.L(8.0f), hl.L(40.0f));
        canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), this.a);
        if (e > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin(((System.currentTimeMillis() % 2000) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + hl.L(10.66f), rectF.centerY(), hl.L(4.0f) * e, paint);
        }
        hnVar.setBounds((int) (rectF.left + L), ((int) rectF.top) - hl.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        hnVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(45.0f), TLObject.FLAG_30));
    }

    @Override // qk4
    public void setInvert(float f) {
        this.a.setColor(vm2.f(f, 1056964608, TLObject.FLAG_28));
        this.c.u(vm2.f(f, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
