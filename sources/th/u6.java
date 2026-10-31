package th;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u6 extends Drawable {
    public int a;
    public final View b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.t5 g;
    public boolean h;
    public Paint i;
    public int e = zs.e4;
    public final float[] f = new float[15];
    public final Path j = new Path();

    public u6(View view) {
        this.b = view;
        this.g = new org.telegram.ui.Components.t5(view, 350L, gr.h);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setShadowLayer(org.telegram.messenger.i0.L(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i10 = this.a + 1;
        this.a = i10;
        if (i10 >= 2) {
            this.a = 0;
        }
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        if (z11) {
            this.b.invalidate();
        } else {
            this.g.e(true, z10 ? 1.0f : 0.0f);
        }
    }

    public final void c(float f7) {
        this.c.setShadowLayer(org.telegram.messenger.i0.L(2.0f) / f7, 0.0f, org.telegram.messenger.i0.N(0.7f) / f7, i0.b.o(-16777216, 45));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        float centerX = getBounds().centerX();
        float[] fArr = this.f;
        int i12 = 0;
        fArr[0] = centerX;
        int i13 = 1;
        fArr[1] = getBounds().centerY();
        int i14 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i15 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i16 = 4;
        fArr[4] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[5] = getBounds().height() * 0.055f;
        fArr[6] = (getBounds().width() * 0.843f) + getBounds().left;
        fArr[7] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[8] = getBounds().height() * 0.132f;
        fArr[9] = (getBounds().width() * (-0.02699995f)) + getBounds().left;
        fArr[10] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[11] = getBounds().height() * 0.055f;
        fArr[12] = (getBounds().width() * 0.157f) + getBounds().left;
        fArr[13] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[14] = getBounds().height() * 0.132f;
        float e = this.g.e(false, this.h ? 1.0f : 0.0f);
        int i17 = this.a;
        Paint paint = this.d;
        if (i17 == 0) {
            paint.setColor(-1);
        } else if (i17 == 1) {
            if (this.i == null) {
                Paint paint2 = new Paint(1);
                this.i = paint2;
                paint2.setColor(-16777216);
                this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.i.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
            }
            paint.setColor(i0.b.o(-16777216, zs.L1));
        }
        if (this.e != 255 || this.a == 1) {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.e, 31);
        } else {
            canvas.save();
        }
        Path path = this.j;
        path.rewind();
        int i18 = 0;
        while (i18 < i14) {
            if (this.a == i13 && i18 == 0) {
                i10 = i14;
            } else {
                Paint paint3 = i18 == 0 ? this.c : paint;
                int i19 = i18 == 0 ? i13 : i12;
                while (i12 < 5) {
                    if (i12 == i13 || i12 == i14) {
                        i11 = i14;
                        if (e != 1.0f) {
                            int i20 = i12 * 3;
                            path.addCircle(fArr[i20], fArr[i20 + 1], ((1.0f - e) * fArr[i20 + 2]) - i19, Path.Direction.CW);
                        }
                    } else if (i12 == i15 || i12 == i16) {
                        i11 = i14;
                        if (e != 0.0f) {
                            int i21 = i12 * 3;
                            path.addCircle(fArr[i21], fArr[i21 + 1], (fArr[i21 + 2] * e) - i19, Path.Direction.CW);
                        }
                    } else {
                        int i22 = i12 * 3;
                        i11 = i14;
                        path.addCircle(fArr[i22], fArr[i22 + 1], fArr[i22 + 2] - i19, Path.Direction.CW);
                    }
                    i12++;
                    i14 = i11;
                    i15 = 3;
                    i13 = 1;
                    i16 = 4;
                }
                i10 = i14;
                canvas.drawPath(path, paint3);
            }
            i18++;
            i14 = i10;
            i15 = 3;
            i12 = 0;
            i13 = 1;
            i16 = 4;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.e = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
