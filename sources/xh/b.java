package xh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import b8.be;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends Drawable {
    public final a b;
    public Bitmap c;
    public Canvas d;
    public int e;
    public float f;
    public int g;
    public int h;
    public final Paint a = new Paint(2);
    public int i = hs.e4;

    public b(a aVar) {
        this.b = aVar;
    }

    public final void a(int i3, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i3 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.c.getHeight() == i14) {
            this.c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.c);
        }
        this.f = f10;
        this.e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.b.h(this.d, hs.e4);
        Utilities.stackBlurBitmap(this.c, (int) f11);
        this.d.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i3 = this.i;
        a aVar = this.b;
        if (i3 == 255) {
            canvas.save();
            canvas.translate(this.g, this.h);
            aVar.h(canvas, hs.e4);
            canvas.restore();
            return;
        }
        if (i3 == 0) {
            return;
        }
        double d = i3 / 255.0d;
        double d10 = d / ((1.0d - d) * 6.0d);
        double d11 = 1.0d + d10;
        double sqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
        int b10 = be.b((int) (d10 * sqrt * 255.0d), 0, hs.e4);
        int b11 = be.b((int) (sqrt * 255.0d), 0, hs.e4);
        if (b11 > 0 && this.c != null) {
            Paint paint = this.a;
            paint.setAlpha(b11);
            canvas.save();
            int i10 = this.g;
            int i11 = this.e;
            canvas.translate(i10 - i11, this.h - i11);
            float f10 = this.f;
            canvas.scale(f10, f10);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, paint);
            canvas.restore();
        }
        if (b10 > 0) {
            canvas.save();
            canvas.translate(this.g, this.h);
            aVar.h(canvas, b10);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.i = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i3, int i10, int i11, int i12) {
        this.g = i3;
        this.h = i10;
        super.setBounds(i3, i10, i11, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
