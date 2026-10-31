package rh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.ui.Components.gq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z3 extends gq {
    public final View c;
    public final Paint d;
    public final Path e;
    public final long f;
    public float h;

    public z3(vh.d dVar, int i10) {
        super(dVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.e = path;
        this.f = System.currentTimeMillis();
        this.h = 1.0f;
        this.c = dVar;
        ((Paint) this.b).setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i10);
        path.rewind();
        path.moveTo(-org.telegram.messenger.i0.N(2.91f), org.telegram.messenger.i0.N(1.08f));
        path.lineTo(0.0f, -org.telegram.messenger.i0.N(1.08f));
        path.lineTo(org.telegram.messenger.i0.N(2.91f), org.telegram.messenger.i0.N(1.08f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = (Paint) this.b;
        paint.setAlpha((int) (this.h * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((System.currentTimeMillis() - this.f) % 400) / 400.0f;
        Paint paint2 = this.d;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.h));
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (org.telegram.ui.Cells.f1.d(1.166f, 2.0f, org.telegram.messenger.i0.N(2.16f) * 3.0f) / 2.0f));
        int i10 = 0;
        while (i10 < 4) {
            float f7 = i10 == 0 ? 1.0f - currentTimeMillis : i10 == 3 ? currentTimeMillis : 1.0f;
            paint2.setAlpha((int) (f7 * 255.0f * this.h));
            canvas.save();
            float T1 = org.telegram.messenger.i0.T1(0.5f, 1.0f, f7);
            canvas.scale(T1, T1);
            canvas.drawPath(this.e, paint2);
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.i0.N(3.3260002f) * f7);
            i10++;
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.c;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override // org.telegram.ui.Components.gq, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.h = i10 / 255.0f;
    }
}
