// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ql9 extends e0b {
    public float d;
    public final Paint f;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public int e = 1;

    public ql9(boolean z) {
        if (z) {
            this.f = new Paint(1);
        }
    }

    @Override // e0b
    public final void b(int i) {
        Paint paint = this.f;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // e0b
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // e0b
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f;
        if (paint == null) {
            paint = cmb.b2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        canvas.drawCircle(gm.L(6.0f), gm.L(this.a ? 8.0f : 9.0f), gm.L(4.0f), paint);
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.b;
            this.b = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            float f = this.d;
            int i = this.e;
            float f2 = ((i * j) / 400.0f) + f;
            this.d = f2;
            if (i > 0 && f2 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i < 0 && f2 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override // e0b
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gm.L(10.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gm.L(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
