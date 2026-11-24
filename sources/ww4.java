// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ww4 extends fw4 {
    public xw4 E;
    public xw4 F;
    public xw4 G;
    public ix4 H;
    public int I;
    public short J;
    public int K;
    public short L;
    public final RectF M;
    public final gx4 f;
    public final rw4 h;
    public final xie n;
    public final xie r;
    public xie s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public ww4(gx4 gx4Var) {
        xw4 xw4Var = xw4.b;
        this.E = xw4Var;
        this.F = xw4Var;
        this.G = xw4Var;
        this.J = (short) 255;
        this.L = (short) 255;
        this.M = new RectF();
        this.f = gx4Var;
        this.h = gx4Var instanceof rw4 ? (rw4) gx4Var : null;
        char c = gx4Var instanceof kx4 ? (char) 2 : (char) 1;
        int i = Build.VERSION.SDK_INT;
        if (c == 2) {
            xie tw4Var = i >= 29 ? new tw4(this) : new sw4(this, false);
            this.n = tw4Var;
            this.r = tw4Var;
        } else if (i >= 33) {
            this.n = new vw4(this);
            this.r = new tw4(this);
        } else if (i >= 31) {
            this.n = new uw4(this);
            this.r = new tw4(this);
        } else {
            this.n = new sw4(this, true);
            this.r = new sw4(this, false);
        }
        g(this.b);
    }

    public static float k(float f, int i, int i2) {
        return (((float) Math.floor((f - r3) / r4)) * i2) + i;
    }

    @Override // fw4
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.s.a(bounds, rectF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((r0 instanceof sw4) != false) goto L10;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.c <= 0) {
            return;
        }
        canvas.save();
        canvas.clipRect(bounds);
        canvas.translate(bounds.left, bounds.top);
        if (!canvas.isHardwareAccelerated()) {
            xie xieVar = this.s;
            xieVar.getClass();
        }
        this.s.c(canvas);
        canvas.restore();
    }

    @Override // fw4
    public final boolean e() {
        return this.s.d();
    }

    @Override // fw4
    public final void f(int i) {
        this.s.e(i / 255.0f);
        invalidateSelf();
    }

    @Override // fw4
    public final void g(fx4 fx4Var) {
        boolean z = fx4Var.a;
        xie xieVar = this.r;
        xie xieVar2 = z ? this.n : xieVar;
        xie xieVar3 = this.s;
        if (xieVar3 != xieVar2) {
            if (xieVar3 != null) {
                xieVar3.b();
            }
            this.s = xieVar2;
            xieVar2.e(this.c / 255.0f);
            if (this.s == xieVar) {
                this.x = true;
            } else {
                this.w = true;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // fw4
    public final boolean j() {
        this.s.getClass();
        return !(r0 instanceof sw4);
    }

    public final LinearGradient l(xw4 xw4Var, float f, float f2, int i, int i2) {
        int i3 = xw4Var == null ? -1 : xw4Var.a;
        float f3 = 0.0f;
        float f4 = f - 0.0f;
        float max = Math.max(0.0f, f4 - f2);
        if (i3 != -1) {
            max = Math.min(i3, max);
        }
        float f5 = 1.0f / i2;
        int i4 = this.y;
        boolean z = i4 == 1 || i4 == 2;
        if (z) {
            f3 = -0.0f;
        } else {
            f4 = 0.0f;
        }
        float f6 = (f4 + f3) * f5;
        float max2 = (Math.max(max * f5, 0.001f) * (z ? -1.0f : 1.0f)) + f6;
        int[] iArr = new int[8];
        jz4.a(jz4.i, i, iArr);
        int i5 = this.y;
        return (i5 == 1 || i5 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f6, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f6, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.w = true;
        this.x = true;
    }

    @Override // fw4, tjb
    public final void updateColors() {
        ix4 ix4Var = this.H;
        if (ix4Var != null) {
            this.I = bkb.p1(this.J / 255.0f, ix4Var.b);
            this.K = bkb.p1(this.L / 255.0f, this.H.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
