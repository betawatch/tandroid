// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ye7 extends Drawable {
    public static final boolean e0;
    public static final boolean f0;
    public Matrix A;
    public boolean B;
    public im6 C;
    public boolean D;
    public boolean E;
    public final Runnable F;
    public PorterDuffColorFilter G;
    public int H;
    public float I;
    public final float J;
    public int K;
    public float L;
    public boolean M;
    public final byte N;
    public final byte O;
    public cf7 P;
    public final int[] Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final sj0 V;
    public final sj0 W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] a;
    public int a0;
    public long b;
    public final sj0 b0;
    public WeakReference c;
    public Bitmap c0;
    public boolean d;
    public int d0;
    public final s33 e;
    public int f;
    public boolean g;
    public float h;
    public int i;
    public final RectF j;
    public Bitmap k;
    public Bitmap l;
    public final Bitmap[] m;
    public final Paint n;
    public final Paint o;
    public final Paint p;
    public int q;
    public Canvas r;
    public Canvas s;
    public boolean t;
    public Bitmap u;
    public BitmapShader v;
    public BitmapShader w;
    public Bitmap x;
    public ImageReceiver y;
    public boolean z;

    static {
        int i = Build.VERSION.SDK_INT;
        e0 = i < 28;
        f0 = i >= 29;
    }

    public ye7(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.a = new int[]{-12423849, -531317, -7888252, -133430};
        this.e = new s33(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.j = new RectF();
        this.m = new Bitmap[3];
        this.n = new Paint(2);
        this.o = new Paint(2);
        this.p = new Paint();
        this.q = 100;
        this.F = new xe7(this, (byte) 0);
        this.I = 1.0f;
        this.J = 1.0f;
        this.K = kk7.d4;
        this.L = 1.0f;
        this.N = (byte) 60;
        this.O = (byte) 80;
        this.Q = new int[4];
        this.S = -1;
        this.U = -16777216;
        this.V = new sj0();
        this.W = new sj0();
        this.b0 = new sj0();
        if (z2) {
            this.N = (byte) 80;
            this.O = (byte) 80;
        }
        this.g = z;
        n(false, i, i2, i3, i4);
        h();
    }

    public static int g(int i, int i2, int i3, int i4) {
        boolean j = j(i, i2, i3, i4);
        boolean z = f0;
        if (j) {
            if (z) {
                return -1;
            }
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (z) {
            return -16777216;
        }
        if (i2 == 0) {
            i2 = i;
        }
        int w0 = gl.w0(i, i2);
        if (i3 != 0) {
            w0 = gl.w0(i3, w0);
        }
        if (i4 != 0) {
            w0 = gl.w0(i4, w0);
        }
        return (gl.U0(w0, true) & 16777215) | 1677721600;
    }

    public static boolean j(int i, int i2, int i3, int i4) {
        if (i2 == 0) {
            i2 = i;
        }
        int w0 = gl.w0(i, i2);
        if (i3 != 0) {
            w0 = gl.w0(w0, i3);
        }
        if (i4 != 0) {
            w0 = gl.w0(w0, i4);
        }
        return gl.b(Color.red(w0), Color.green(w0), Color.blue(w0))[2] < 0.3f;
    }

    public final void a(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        List list = this.R;
        if (list == null || this.y == null || i < 0 || i >= list.size()) {
            return;
        }
        uqc uqcVar = (uqc) this.R.get(i);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f4);
        canvas.concat(uqcVar.b);
        this.y.k0(uqcVar.a);
        this.y.h(canvas, null);
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, int i) {
        if (this.R == null || this.u == null) {
            return;
        }
        a(canvas, i, rectF.left, rectF.top, rectF.width() / this.u.getWidth(), rectF.height() / this.u.getHeight());
    }

    public final void c(Bitmap bitmap, int i, float f) {
        int[] iArr = this.a;
        if (iArr[2] != 0 || iArr[3] != 0) {
            Utilities.generateGradient(bitmap, i, f, iArr);
            return;
        }
        int i2 = iArr[1];
        if (i2 == 0) {
            i2 = iArr[0];
        }
        int i3 = iArr[0];
        int[] iArr2 = this.Q;
        iArr2[0] = i3;
        iArr2[1] = iArr[0];
        iArr2[2] = i2;
        iArr2[3] = i2;
        Utilities.generateGradient(bitmap, i, f, iArr2);
    }

    public final void d() {
        int i = -1;
        while (i < 3) {
            int i2 = i + 1;
            c(i < 0 ? this.l : this.m[i], this.i, i2 / 3.0f);
            i = i2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e = e();
        float f = e != null ? bounds.top : this.f;
        int width = this.k.getWidth();
        int height = this.k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f2 = width;
        float f3 = height;
        float max = Math.max(width2 / f2, height2 / f3);
        float f4 = f2 * max;
        float f5 = f3 * max;
        float f6 = (width2 - f4) / 2.0f;
        float f7 = (height2 - f5) / 2.0f;
        if (this.g) {
            int i = bounds.left;
            f6 += i;
            int i2 = bounds.top;
            f7 += i2;
            canvas.clipRect(i, i2, bounds.right, bounds.bottom);
        }
        boolean z = (Build.VERSION.SDK_INT < 28 || this.P == null || this.k == null || e == null) ? false : true;
        int i3 = this.q;
        float f8 = 1.0f;
        float f9 = this.J;
        Paint paint = this.n;
        Paint paint2 = this.o;
        RectF rectF = this.j;
        if (i3 < 0) {
            boolean z2 = e0;
            if (!z && (!z2 || e == null)) {
                canvas.drawColor(bm2.o(-16777216, (int) (this.K * f9)));
            }
            if (e != null) {
                if (z2) {
                    int i4 = (((int) (this.K * this.I)) * (-this.q)) / 100;
                    if (this.u != null) {
                        Bitmap e2 = e();
                        sj0 sj0Var = this.b0;
                        if (sj0Var.a(e2) || this.c0 == null || this.d0 != i4) {
                            int width3 = this.u.getWidth();
                            int height3 = this.u.getHeight();
                            this.d0 = i4;
                            Bitmap bitmap = this.c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.c0.getHeight() != height3) {
                                this.c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e2, this.c0, i4);
                        }
                        sj0Var.b(e2);
                    }
                    float width4 = e.getWidth();
                    float height4 = e.getHeight();
                    float max2 = Math.max(width2 / width4, height2 / height4);
                    float f10 = width4 * max2;
                    float f11 = height4 * max2;
                    float f12 = (width2 - f10) / 2.0f;
                    float f13 = (height2 - f11) / 2.0f;
                    rectF.set(f12, f13, f10 + f12, f11 + f13);
                    if (this.c0 != null) {
                        canvas.drawBitmap(this.k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.c0, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(bm2.o(-16777216, (int) (this.K * f9)));
                    }
                    b(canvas, rectF, this.S);
                } else {
                    Matrix matrix = this.A;
                    if (matrix == null) {
                        matrix = new Matrix();
                        this.A = matrix;
                    }
                    matrix.reset();
                    this.A.setTranslate(f6, f7 + f);
                    float min = 1.0f / Math.min(this.k.getWidth() / bounds.width(), this.k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e.getWidth();
                    float height5 = e.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f14 = (width2 - (width5 * max3)) / 2.0f;
                    float f15 = ((height2 - (height5 * max3)) / 2.0f) + f;
                    this.A.setTranslate((int) f14, (int) f15);
                    if (!this.z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f8 = max3;
                    }
                    this.w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.q) / 100.0f) * this.K * this.I));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z) {
                        Paint c = this.P.c(this.k, e, this.U, (int) (this.K * this.I), this.q, canvas.isHardwareAccelerated());
                        this.P.b(this.A);
                        this.P.a(rectF);
                        float f16 = this.H;
                        canvas.drawRoundRect(rectF, f16, f16, c);
                    } else {
                        float f17 = this.H;
                        canvas.drawRoundRect(rectF, f17, f17, paint2);
                    }
                    a(canvas, this.S, f14, f15, f8, f8);
                }
            }
        } else {
            boolean z3 = z;
            if (this.H != 0) {
                this.A.reset();
                this.A.setTranslate(f6, f7);
                float min2 = 1.0f / Math.min(this.k.getWidth() / bounds.width(), this.k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z3) {
                    float f18 = this.H;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                }
            } else {
                canvas.translate(0.0f, f);
                rectF.set(f6, f7, f4 + f6, f5 + f7);
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * f9));
                if (!z3) {
                    canvas.drawBitmap(this.k, (Rect) null, rectF, paint);
                }
                paint.setAlpha(alpha);
            }
            if (e != null) {
                float width6 = e.getWidth();
                float height6 = e.getHeight();
                float max4 = Math.max(width2 / width6, height2 / height6);
                float f19 = width6 * max4;
                float f20 = height6 * max4;
                float f21 = (width2 - f19) / 2.0f;
                float f22 = (height2 - f20) / 2.0f;
                rectF.set(f21, f22, f19 + f21, f20 + f22);
                paint2.setColorFilter(this.G);
                paint2.setAlpha((int) ((Math.abs(this.q) / 100.0f) * this.K * this.I));
                if (z3) {
                    Paint c2 = this.P.c(this.k, e, this.U, (int) (this.K * this.I), this.q, canvas.isHardwareAccelerated());
                    cf7 cf7Var = this.P;
                    RectF rectF2 = cf7Var.j;
                    rectF2.set(0.0f, 0.0f, cf7Var.g, cf7Var.h);
                    Matrix matrix2 = cf7Var.i;
                    matrix2.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    cf7Var.b(matrix2);
                    this.P.a(rectF);
                    canvas.drawRect(rectF, c2);
                } else {
                    canvas.drawBitmap(e, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.q) / 100.0f) * this.K * this.I * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        x();
    }

    public final Bitmap e() {
        Bitmap bitmap = this.u;
        if (bitmap == null) {
            return null;
        }
        if (this.x == null) {
            return bitmap;
        }
        sj0 sj0Var = this.V;
        boolean a = sj0Var.a(bitmap);
        Bitmap bitmap2 = this.x;
        sj0 sj0Var2 = this.W;
        boolean a2 = sj0Var2.a(bitmap2);
        boolean z = true;
        boolean z2 = this.a0 != this.S;
        if (!a && !a2 && !z2) {
            z = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z) {
            return bitmap3;
        }
        int width = this.u.getWidth();
        int height = this.u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(kk7.h3);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i = this.S;
        if (this.x != null && this.R != null) {
            for (int i2 = 0; i2 < this.R.size(); i2++) {
                if (i2 != i) {
                    uqc uqcVar = (uqc) this.R.get(i2);
                    canvas.save();
                    canvas.concat(uqcVar.b);
                    canvas.drawBitmap(this.x, (Rect) null, uqcVar.a, paint2);
                    canvas.restore();
                }
            }
        }
        this.a0 = this.S;
        sj0Var.b(this.u);
        sj0Var2.b(this.x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.u;
        return bitmap != null ? bitmap.getHeight() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.u;
        return bitmap != null ? bitmap.getWidth() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        BlendMode blendMode;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        byte b = this.N;
        byte b2 = this.O;
        Bitmap createBitmap = Bitmap.createBitmap(b, b2, config);
        this.k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i = 0; i < 3; i++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(b, b2, Bitmap.Config.ARGB_8888);
            this.m[i] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.r = new Canvas(this.k);
        Bitmap createBitmap3 = Bitmap.createBitmap(b, b2, Bitmap.Config.ARGB_8888);
        this.l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.s = new Canvas(this.l);
        c(this.k, this.i, this.e.getInterpolation(this.h));
        if (f0) {
            Paint paint = this.o;
            blendMode = BlendMode.SOFT_LIGHT;
            paint.setBlendMode(blendMode);
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.c.get()).invalidate();
        }
        if (this.t) {
            kk7.e().k(kk7.l4, new Object[0]);
            x();
            Runnable runnable = this.F;
            gl.r(runnable);
            gl.e3(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.y;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.y;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }

    public final void m(boolean z) {
        if (this.h < 1.0f) {
            return;
        }
        this.E = true;
        this.h = 0.0f;
        this.D = z;
        i();
    }

    public final void n(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr = this.a;
        if (iArr[0] == i && iArr[1] == i2 && iArr[2] == i3 && iArr[3] == i4) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            c(bitmap, this.i, this.e.getInterpolation(this.h));
            if (z) {
                i();
            }
        }
    }

    public final void o() {
        if (Build.VERSION.SDK_INT < 28 || this.P != null || gba.n) {
            return;
        }
        this.P = new cf7();
    }

    public final void p(View view) {
        this.c = new WeakReference(view);
        ImageReceiver imageReceiver = this.y;
        if (imageReceiver != null) {
            imageReceiver.p0(view);
        }
    }

    public final void q(float f) {
        this.I = f;
        i();
    }

    public final void r(int i, Bitmap bitmap) {
        this.q = i;
        this.u = bitmap;
        if (bitmap != null) {
            boolean z = f0;
            Paint paint = this.o;
            if (z) {
                if (i >= 0) {
                    paint.setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z2 = e0;
            if (i >= 0) {
                if (z2) {
                    paint.setXfermode(null);
                }
            } else {
                if (z2) {
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    return;
                }
                Bitmap bitmap2 = this.k;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.v = new BitmapShader(bitmap2, tileMode, tileMode);
                Bitmap bitmap3 = this.u;
                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                this.w = new BitmapShader(bitmap3, tileMode2, tileMode2);
                this.z = true;
                paint.setShader(new ComposeShader(this.v, this.w, PorterDuff.Mode.DST_IN));
                paint.setFilterBitmap(true);
                this.A = new Matrix();
            }
        }
    }

    public final void s(int i) {
        this.U = i;
        this.G = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        i();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.K = i;
        this.n.setAlpha(i);
        this.o.setAlpha(i);
    }

    public final void t(int i) {
        this.i = i;
        if (i < 0) {
            i = 0;
            this.i = 0;
        } else if (i > 7) {
            this.i = 7;
            i = 7;
        }
        c(this.k, i, this.e.getInterpolation(this.h));
    }

    public final void u(int i) {
        this.H = i;
        this.A = new Matrix();
        Bitmap bitmap = this.k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.n.setShader(bitmapShader);
        i();
    }

    public final void v(boolean z) {
        if (this.h < 1.0f || !e66.e(32)) {
            i();
            return;
        }
        this.E = false;
        this.D = false;
        this.B = z;
        this.h = 0.0f;
        int i = this.i - 1;
        this.i = i;
        if (i < 0) {
            this.i = 7;
        }
        i();
        this.s.drawBitmap(this.k, 0.0f, 0.0f, (Paint) null);
        d();
    }

    public final void w() {
        if (this.h < 1.0f) {
            return;
        }
        this.E = false;
        this.B = true;
        this.D = true;
        this.h = 0.0f;
        i();
        c(this.l, this.i, 0.0f);
        d();
    }

    public final void x() {
        float f;
        float f2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.b;
        if (j > 20) {
            j = 17;
        }
        this.b = elapsedRealtime;
        if (j > 1) {
            boolean z = this.M;
            if (z && this.h == 1.0f) {
                this.h = 0.0f;
            }
            float f3 = this.h;
            if (f3 < 1.0f) {
                boolean z2 = true;
                boolean z3 = this.t || this.E;
                if (z) {
                    float f4 = ((j / 12000.0f) * this.L) + f3;
                    this.h = f4;
                    if (f4 >= 1.0f) {
                        this.h = 0.0f;
                        f4 = 0.0f;
                    }
                    int i = (int) (f4 / 0.125f);
                    this.i = i;
                    f = 1.0f - ((f4 - (i * 0.125f)) / 0.125f);
                } else {
                    boolean z4 = this.E;
                    s33 s33Var = this.e;
                    if (z4) {
                        float interpolation = s33Var.getInterpolation(f3);
                        char c = interpolation <= 0.25f ? (char) 0 : interpolation <= 0.5f ? (char) 1 : interpolation <= 0.75f ? (char) 2 : (char) 3;
                        im6 im6Var = this.C;
                        if (im6Var != null) {
                            f2 = ((Float) im6Var.m(this)).floatValue();
                            this.h = f2;
                        } else {
                            f2 = (j / (this.D ? 1000.0f : 2000.0f)) + this.h;
                            this.h = f2;
                        }
                        if (f2 > 1.0f) {
                            this.h = 1.0f;
                            f2 = 1.0f;
                        }
                        if (this.C == null && !this.d) {
                            f2 = s33Var.getInterpolation(f2);
                        }
                        if (this.d && (f2 == 0.0f || f2 == 1.0f)) {
                            this.d = false;
                        }
                        if ((c == 0 && f2 > 0.25f) || ((c == 1 && f2 > 0.5f) || (c == 2 && f2 > 0.75f))) {
                            boolean z5 = this.D;
                            int i2 = this.i;
                            if (z5) {
                                int i3 = i2 + 1;
                                this.i = i3;
                                if (i3 > 7) {
                                    this.i = 0;
                                }
                            } else {
                                int i4 = i2 - 1;
                                this.i = i4;
                                if (i4 < 0) {
                                    this.i = 7;
                                }
                            }
                        }
                        if (f2 > 0.25f) {
                            f2 = f2 <= 0.5f ? f2 - 0.25f : f2 <= 0.75f ? f2 - 0.5f : f2 - 0.75f;
                        }
                        float f5 = f2 / 0.25f;
                        if (this.D) {
                            f = 1.0f - f5;
                            if (this.h >= 1.0f) {
                                int i5 = this.i + 1;
                                this.i = i5;
                                if (i5 > 7) {
                                    this.i = 0;
                                }
                                f = 1.0f;
                            }
                        } else {
                            f = f5;
                        }
                        z2 = z3;
                    } else {
                        im6 im6Var2 = this.C;
                        if (im6Var2 != null) {
                            f = ((Float) im6Var2.m(this)).floatValue();
                            this.h = f;
                        } else {
                            f = (j / (this.B ? 300.0f : 500.0f)) + f3;
                            this.h = f;
                        }
                        if (f > 1.0f) {
                            this.h = 1.0f;
                            f = 1.0f;
                        }
                        if (this.C == null && !this.d) {
                            f = s33Var.getInterpolation(f);
                        }
                        if (this.d && (f == 0.0f || f == 1.0f)) {
                            this.d = false;
                        }
                        if (this.D) {
                            f = 1.0f - f;
                            if (this.h >= 1.0f) {
                                int i6 = this.i + 1;
                                this.i = i6;
                                if (i6 > 7) {
                                    this.i = 0;
                                }
                                f = 1.0f;
                            }
                        }
                        z2 = z3;
                    }
                }
                if (z2) {
                    c(this.k, this.i, f);
                } else {
                    Canvas canvas = this.r;
                    Paint paint = this.p;
                    Bitmap[] bitmapArr = this.m;
                    if (f != 1.0f) {
                        int i7 = (int) (f / 0.33333334f);
                        if (i7 == 0) {
                            canvas.drawBitmap(this.l, 0.0f, 0.0f, (Paint) null);
                        } else {
                            canvas.drawBitmap(bitmapArr[i7 - 1], 0.0f, 0.0f, (Paint) null);
                        }
                        paint.setAlpha((int) (((f - (i7 * 0.33333334f)) / 0.33333334f) * 255.0f));
                        this.r.drawBitmap(bitmapArr[i7], 0.0f, 0.0f, paint);
                    } else {
                        canvas.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                    }
                }
                i();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public ye7(boolean z, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, z, false);
    }

    public ye7() {
        this.a = new int[]{-12423849, -531317, -7888252, -133430};
        this.e = new s33(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.j = new RectF();
        this.m = new Bitmap[3];
        this.n = new Paint(2);
        this.o = new Paint(2);
        this.p = new Paint();
        this.q = 100;
        this.F = new xe7(this, (byte) 0);
        this.I = 1.0f;
        this.J = 1.0f;
        this.K = kk7.d4;
        this.L = 1.0f;
        this.N = (byte) 60;
        this.O = (byte) 80;
        this.Q = new int[4];
        this.S = -1;
        this.U = -16777216;
        this.V = new sj0();
        this.W = new sj0();
        this.b0 = new sj0();
        h();
    }
}
