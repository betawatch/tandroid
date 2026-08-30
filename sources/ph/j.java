package ph;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j extends Drawable {
    public final Paint a;
    public final Paint b;
    public final i c;
    public final i d;
    public boolean e;
    public final org.telegram.ui.Components.z5 f;
    public final Path g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;

    public j(int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        i iVar = new i(this, 0);
        this.c = iVar;
        i iVar2 = new i(this, 1);
        this.d = iVar2;
        this.e = false;
        org.telegram.ui.web.o0 o0Var = new org.telegram.ui.web.o0(this, 8);
        nr nrVar = nr.h;
        this.f = new org.telegram.ui.Components.z5(o0Var, 350L, nrVar, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        iVar.k(0.3f, 250L, nrVar);
        iVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        iVar.t(AndroidUtilities.dpf2(12.0f));
        iVar.b = 17;
        iVar2.k(0.3f, 250L, nrVar);
        iVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        iVar2.t(AndroidUtilities.dpf2(12.0f));
        iVar2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float dpf2 = AndroidUtilities.dpf2(this.i) / 2.0f;
        float e = this.f.e(this.e);
        if (e > 0.0f) {
            Paint paint = this.b;
            paint.setAlpha((int) (f10 * 255.0f * e));
            canvas.drawCircle(this.n, this.o, AndroidUtilities.dpf2(11.33f) * e, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - e) * Color.alpha(this.l) * f10));
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.n;
        float f12 = this.o;
        rectF.set(f11 - dpf2, f12 - dpf2, f11 + dpf2, f12 + dpf2);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i10 = this.h;
        float f13 = ((i10 + 1) * 1.5f) + (i10 * 1.0f);
        float f14 = (1.0f / f13) * 180.0f;
        float f15 = (1.5f / f13) * 180.0f;
        float f16 = f15;
        int i11 = 0;
        while (i11 < i10) {
            float f17 = f14;
            canvas.drawArc(AndroidUtilities.rectTmp, f16 + 270.0f, f17, false, paint2);
            f16 = f17 + f15 + f16;
            i11++;
            f14 = f17;
        }
        canvas.save();
        canvas.translate(this.j + 0.0f, this.k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.n - AndroidUtilities.dp(20.0f)), (int) (this.o - AndroidUtilities.dp(20.0f)), (int) (this.n + AndroidUtilities.dp(20.0f)), (int) (this.o + AndroidUtilities.dp(20.0f)));
        i iVar = this.c;
        iVar.setBounds(rect);
        iVar.w = (int) (Color.alpha(this.l) * f10);
        iVar.draw(canvas);
        if (e > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e, Path.Direction.CW);
            canvas.clipPath(path);
            i iVar2 = this.d;
            iVar2.setBounds(rect);
            iVar2.w = (int) (f10 * 255.0f);
            iVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z4) {
        if (this.m != z4) {
            this.m = z4;
            this.a.setXfermode(z4 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
            this.c.a.setXfermode(z4 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        }
    }

    public final void c(float f10) {
        this.d.t(AndroidUtilities.dpf2(f10));
        this.c.t(AndroidUtilities.dpf2(f10));
    }

    public final void d(int i10, boolean z4, boolean z10) {
        this.c.q("" + i10, z10, true);
        this.d.q("" + i10, z10, true);
        this.e = z4;
        if (!z10) {
            this.f.f(z4, true);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.l = i10;
        this.a.setColor(i10);
        this.c.r(i10);
        this.d.r(i12);
        this.b.setColor(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
