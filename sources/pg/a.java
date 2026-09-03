package pg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.util.Arrays;
import k7.n;
import kf.m0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a {
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
    public final Path n = new Path();
    public final Path o = new Path();

    public final void a() {
        float[] fArr = this.b;
        this.l = m0.c(fArr);
        Rect rect = this.a;
        Rect rect2 = this.m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        Path path = this.k;
        path.rewind();
        float f10 = rect2.left;
        float f11 = rect2.top;
        float f12 = rect2.right;
        float f13 = rect2.bottom;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(f10, f11, f12, f13, this.b, direction);
        path.close();
        float min = Math.min(rect2.width(), rect2.height()) / 2.0f;
        float[] fArr2 = b.C;
        Arrays.fill(fArr2, 0.0f);
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        if (this.l && fArr[0] > min) {
            fArr2[3] = min;
            fArr2[2] = min;
            fArr2[1] = min;
            fArr2[0] = min;
        }
        Path path2 = this.n;
        path2.rewind();
        float f14 = rect2.left;
        int i11 = rect2.top;
        path2.addRoundRect(f14, i11, rect2.right, Math.min(i11 + fArr[0], rect2.bottom), fArr2, direction);
        float f15 = rect2.left;
        int i12 = rect2.top;
        float f16 = i12 + this.i;
        float f17 = rect2.right;
        float min2 = Math.min(i12 + fArr[0], rect2.bottom);
        Path.Direction direction2 = Path.Direction.CCW;
        path2.addRoundRect(f15, f16, f17, min2, fArr2, direction2);
        path2.close();
        Arrays.fill(fArr2, 0.0f);
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[6] = fArr[6];
        fArr2[7] = fArr[7];
        if (this.l && fArr[0] > min) {
            fArr2[7] = min;
            fArr2[6] = min;
            fArr2[5] = min;
            fArr2[4] = min;
        }
        Path path3 = this.o;
        path3.rewind();
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom, fArr2, direction);
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom - this.j, fArr2, direction2);
        path3.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        if (!this.l) {
            canvas.drawPath(this.k, paint);
            return;
        }
        Rect rect = this.m;
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        float f14 = this.b[0];
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z4) {
        if (!z4) {
            b(canvas, paint);
            return;
        }
        Rect rect = this.m;
        float f10 = rect.top;
        float[] fArr = this.b;
        float a2 = n.a((fArr[0] * 2.0f) + f10, f10, rect.bottom);
        canvas.save();
        Rect rect2 = this.a;
        canvas.clipRect(rect2.left, rect2.top, rect2.right, a2);
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = rect.right;
        float f14 = fArr[0];
        canvas.drawRoundRect(f11, f12, f13, a2, f14, f14, paint);
        canvas.restore();
    }
}
