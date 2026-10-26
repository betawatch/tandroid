package w4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import c3.h0;
import org.telegram.ui.Components.iy0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends Drawable implements Animatable {
    public static final LinearInterpolator h = new LinearInterpolator();
    public static final u1.a n = new u1.a();
    public static final int[] r = {-16777216};
    public final b a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public c(Context context) {
        context.getClass();
        this.c = context.getResources();
        b bVar = new b();
        this.a = bVar;
        bVar.i = r;
        bVar.a(0);
        bVar.h = 2.5f;
        bVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new iy0(2, this, bVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new a(this, bVar));
        this.d = ofFloat;
    }

    public static void b(float f7, b bVar) {
        if (f7 <= 0.75f) {
            bVar.u = bVar.i[bVar.j];
            return;
        }
        float f10 = (f7 - 0.75f) / 0.25f;
        int[] iArr = bVar.i;
        int i10 = bVar.j;
        int i11 = iArr[i10];
        int i12 = iArr[(i10 + 1) % iArr.length];
        bVar.u = ((((i11 >> 24) & 255) + ((int) ((((i12 >> 24) & 255) - r1) * f10))) << 24) | ((((i11 >> 16) & 255) + ((int) ((((i12 >> 16) & 255) - r3) * f10))) << 16) | ((((i11 >> 8) & 255) + ((int) ((((i12 >> 8) & 255) - r4) * f10))) << 8) | ((i11 & 255) + ((int) (f10 * ((i12 & 255) - r2))));
    }

    public final void a(float f7, b bVar, boolean z10) {
        float interpolation;
        float f10;
        if (this.f) {
            b(f7, bVar);
            float floor = (float) (Math.floor(bVar.m / 0.8f) + 1.0d);
            float f11 = bVar.k;
            float f12 = bVar.l;
            bVar.e = (((f12 - 0.01f) - f11) * f7) + f11;
            bVar.f = f12;
            float f13 = bVar.m;
            bVar.g = h0.z(floor, f13, f7, f13);
            return;
        }
        if (f7 != 1.0f || z10) {
            float f14 = bVar.m;
            u1.a aVar = n;
            if (f7 < 0.5f) {
                interpolation = bVar.k;
                f10 = (aVar.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = bVar.k + 0.79f;
                interpolation = f15 - (((1.0f - aVar.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f10 = f15;
            }
            float f16 = (0.20999998f * f7) + f14;
            float f17 = (f7 + this.e) * 216.0f;
            bVar.e = interpolation;
            bVar.f = f10;
            bVar.g = f16;
            this.b = f17;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.a;
        Paint paint = bVar.b;
        RectF rectF = bVar.a;
        float f7 = bVar.q;
        float f10 = (bVar.h / 2.0f) + f7;
        if (f7 <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((bVar.r * bVar.p) / 2.0f, bVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = bVar.e;
        float f12 = bVar.g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((bVar.f + f12) * 360.0f) - f13;
        paint.setColor(bVar.u);
        paint.setAlpha(bVar.t);
        float f15 = bVar.h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bVar.d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        Paint paint2 = bVar.c;
        if (bVar.n) {
            Path path = bVar.o;
            if (path == null) {
                Path path2 = new Path();
                bVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (bVar.r * bVar.p) / 2.0f;
            bVar.o.moveTo(0.0f, 0.0f);
            bVar.o.lineTo(bVar.r * bVar.p, 0.0f);
            Path path3 = bVar.o;
            float f18 = bVar.r;
            float f19 = bVar.p;
            path3.lineTo((f18 * f19) / 2.0f, bVar.s * f19);
            bVar.o.offset((rectF.centerX() + min) - f17, (bVar.h / 2.0f) + rectF.centerY());
            bVar.o.close();
            paint2.setColor(bVar.u);
            paint2.setAlpha(bVar.t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d.cancel();
        b bVar = this.a;
        float f7 = bVar.e;
        bVar.k = f7;
        float f10 = bVar.f;
        bVar.l = f10;
        bVar.m = bVar.g;
        if (f10 != f7) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        bVar.a(0);
        bVar.k = 0.0f;
        bVar.l = 0.0f;
        bVar.m = 0.0f;
        bVar.e = 0.0f;
        bVar.f = 0.0f;
        bVar.g = 0.0f;
        this.d.setDuration(1332L);
        this.d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        b bVar = this.a;
        if (bVar.n) {
            bVar.n = false;
        }
        bVar.a(0);
        bVar.k = 0.0f;
        bVar.l = 0.0f;
        bVar.m = 0.0f;
        bVar.e = 0.0f;
        bVar.f = 0.0f;
        bVar.g = 0.0f;
        invalidateSelf();
    }
}
