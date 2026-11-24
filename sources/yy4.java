// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yy4 extends hy4 {
    public zy4 E;
    public zy4 F;
    public zy4 G;
    public kz4 H;
    public int I;
    public short J;
    public int K;
    public short L;
    public final RectF M;
    public final iz4 f;
    public final ty4 h;
    public final yke n;
    public final yke r;
    public yke s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public yy4(iz4 iz4Var) {
        zy4 zy4Var = zy4.b;
        this.E = zy4Var;
        this.F = zy4Var;
        this.G = zy4Var;
        this.J = (short) 255;
        this.L = (short) 255;
        this.M = new RectF();
        this.f = iz4Var;
        this.h = iz4Var instanceof ty4 ? (ty4) iz4Var : null;
        char c = iz4Var instanceof mz4 ? (char) 2 : (char) 1;
        int i = Build.VERSION.SDK_INT;
        if (c == 2) {
            yke vy4Var = i >= 29 ? new vy4(this) : new uy4(this, false);
            this.n = vy4Var;
            this.r = vy4Var;
        } else if (i >= 33) {
            this.n = new xy4(this);
            this.r = new vy4(this);
        } else if (i >= 31) {
            this.n = new wy4(this);
            this.r = new vy4(this);
        } else {
            this.n = new uy4(this, true);
            this.r = new uy4(this, false);
        }
        g(this.b);
    }

    public static float k(float f, int i, int i2) {
        return (((float) Math.floor((f - r3) / r4)) * i2) + i;
    }

    @Override // hy4
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
    
        if ((r0 instanceof uy4) != false) goto L10;
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
            yke ykeVar = this.s;
            ykeVar.getClass();
        }
        this.s.c(canvas);
        canvas.restore();
    }

    @Override // hy4
    public final boolean e() {
        return this.s.d();
    }

    @Override // hy4
    public final void f(int i) {
        this.s.e(i / 255.0f);
        invalidateSelf();
    }

    @Override // hy4
    public final void g(hz4 hz4Var) {
        boolean z = hz4Var.a;
        yke ykeVar = this.r;
        yke ykeVar2 = z ? this.n : ykeVar;
        yke ykeVar3 = this.s;
        if (ykeVar3 != ykeVar2) {
            if (ykeVar3 != null) {
                ykeVar3.b();
            }
            this.s = ykeVar2;
            ykeVar2.e(this.c / 255.0f);
            if (this.s == ykeVar) {
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

    @Override // hy4
    public final boolean j() {
        this.s.getClass();
        return !(r0 instanceof uy4);
    }

    public final LinearGradient l(zy4 zy4Var, float f, float f2, int i, int i2) {
        int i3 = zy4Var == null ? -1 : zy4Var.a;
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
        i15.a(i15.i, i, iArr);
        int i5 = this.y;
        return (i5 == 1 || i5 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f6, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f6, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.w = true;
        this.x = true;
    }

    @Override // hy4, vlb
    public final void updateColors() {
        kz4 kz4Var = this.H;
        if (kz4Var != null) {
            this.I = cmb.p1(this.J / 255.0f, kz4Var.b);
            this.K = cmb.p1(this.L / 255.0f, this.H.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
