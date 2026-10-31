package vg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import w7.o7;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e {
    public int d;
    public boolean e;
    public int f;
    public float i;
    public float j;
    public final Rect a = new Rect();
    public final float[] b = new float[8];
    public final float[] c = new float[8];
    public float g = 0.75f;
    public final float h = 1.5f;
    public final Path k = new Path();
    public boolean l = true;
    public final Rect m = new Rect();

    public final void a() {
        this.l = o7.a(this.b);
        Rect rect = this.a;
        Rect rect2 = this.m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        Path path = this.k;
        path.rewind();
        path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.b, Path.Direction.CW);
        path.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        if (!this.l) {
            canvas.drawPath(this.k, paint);
            return;
        }
        Rect rect = this.m;
        float f7 = rect.left;
        float f10 = rect.top;
        float f11 = rect.right;
        float f12 = rect.bottom;
        float f13 = this.b[0];
        canvas.drawRoundRect(f7, f10, f11, f12, f13, f13, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z10) {
        if (!z10) {
            b(canvas, paint);
            return;
        }
        Rect rect = this.m;
        float f7 = rect.top;
        float[] fArr = this.b;
        float a2 = u.a((fArr[0] * 2.0f) + f7, f7, rect.bottom);
        canvas.save();
        Rect rect2 = this.a;
        canvas.clipRect(rect2.left, rect2.top, rect2.right, a2);
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = fArr[0];
        canvas.drawRoundRect(f10, f11, f12, a2, f13, f13, paint);
        canvas.restore();
    }
}
