package vh;

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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends Drawable {
    public final Paint a;
    public final Paint b;
    public final i c;
    public final i d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f;
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
        sg.v vVar = new sg.v(this, 28);
        gr grVar = gr.h;
        this.f = new org.telegram.ui.Components.t5(vVar, 350L, grVar, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        iVar.n(0.3f, 250L, grVar);
        iVar.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        iVar.w(org.telegram.messenger.i0.N(12.0f));
        iVar.b = 17;
        iVar2.n(0.3f, 250L, grVar);
        iVar2.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        iVar2.w(org.telegram.messenger.i0.N(12.0f));
        iVar2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f7) {
        float N = org.telegram.messenger.i0.N(this.i) / 2.0f;
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            Paint paint = this.b;
            paint.setAlpha((int) (f7 * 255.0f * d));
            canvas.drawCircle(this.n, this.o, org.telegram.messenger.i0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.l) * f7));
        RectF rectF = org.telegram.messenger.i0.P;
        float f10 = this.n;
        float f11 = this.o;
        rectF.set(f10 - N, f11 - N, f10 + N, f11 + N);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i10 = this.h;
        float f12 = ((i10 + 1) * 1.5f) + (i10 * 1.0f);
        float f13 = (1.0f / f12) * 180.0f;
        float f14 = (1.5f / f12) * 180.0f;
        int i11 = 0;
        float f15 = f14;
        while (i11 < i10) {
            float f16 = f13;
            canvas.drawArc(org.telegram.messenger.i0.P, f15 + 270.0f, f16, false, paint2);
            f15 = f16 + f14 + f15;
            i11++;
            f13 = f16;
        }
        canvas.save();
        canvas.translate(this.j + 0.0f, this.k);
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set((int) (this.n - org.telegram.messenger.i0.L(20.0f)), (int) (this.o - org.telegram.messenger.i0.L(20.0f)), (int) (this.n + org.telegram.messenger.i0.L(20.0f)), (int) (this.o + org.telegram.messenger.i0.L(20.0f)));
        i iVar = this.c;
        iVar.setBounds(rect);
        iVar.B = (int) (Color.alpha(this.l) * f7);
        iVar.draw(canvas);
        if (d > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            i iVar2 = this.d;
            iVar2.setBounds(rect);
            iVar2.B = (int) (f7 * 255.0f);
            iVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        if (this.m != z10) {
            this.m = z10;
            this.a.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
            this.c.a.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        }
    }

    public final void c(float f7) {
        this.d.w(org.telegram.messenger.i0.N(f7));
        this.c.w(org.telegram.messenger.i0.N(f7));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.c.t("" + i10, z11, true);
        this.d.t("" + i10, z11, true);
        this.e = z10;
        if (!z11) {
            this.f.f(z10, true);
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
        this.c.u(i10);
        this.d.u(i12);
        this.b.setColor(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
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
