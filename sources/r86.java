// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class r86 extends Drawable {
    public Rect A;
    public final float[] B;
    public final RectF C;
    public boolean D;
    public int E;
    public Paint F;
    public LinearGradient G;
    public Matrix H;
    public int I;
    public Paint J;
    public LinearGradient K;
    public Matrix L;
    public final wjb a;
    public long b;
    public long c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f;
    public final Matrix g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Integer r;
    public int s;
    public float t;
    public float u;
    public long v;
    public final Paint w;
    public final Paint x;
    public Path y;
    public final Path z;

    public r86() {
        this.b = -1L;
        this.c = -1L;
        this.f = new Matrix();
        this.g = new Matrix();
        this.l = bkb.g5;
        this.m = bkb.h5;
        this.t = 1.0f;
        this.u = 1.0f;
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.p > 2.0f ? 2.0f : 1.0f);
    }

    public final void a() {
        if (c() || d()) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.w);
        if (this.n) {
            canvas.drawPath(path, this.x);
        }
    }

    public final boolean c() {
        return this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) >= 320.0f;
    }

    public final boolean d() {
        return this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) < 320.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        long j;
        boolean z;
        float f;
        boolean z2;
        Path path;
        boolean z3;
        if (c()) {
            return;
        }
        Rect bounds = getBounds();
        Paint paint = this.w;
        if (paint.getAlpha() <= 0) {
            return;
        }
        int width = bounds.width();
        if (width <= 0) {
            width = gl.L(200.0f);
        }
        int min = (int) (Math.min(gl.L(400.0f), width) * this.t);
        Integer num = this.o;
        wjb wjbVar = this.a;
        int intValue = num != null ? num.intValue() : bkb.v0(this.l, wjbVar);
        Integer num2 = this.p;
        int intValue2 = num2 != null ? num2.intValue() : bkb.v0(this.m, wjbVar);
        Integer num3 = this.q;
        int intValue3 = num3 != null ? num3.intValue() : bkb.v0(this.l, wjbVar);
        Integer num4 = this.r;
        int intValue4 = num4 != null ? num4.intValue() : bkb.v0(this.m, wjbVar);
        LinearGradient linearGradient = this.d;
        Matrix matrix = this.g;
        Matrix matrix2 = this.f;
        Paint paint2 = this.x;
        if (linearGradient == null || min != this.s || intValue != this.h || intValue2 != this.i || intValue3 != this.j || intValue4 != this.k) {
            this.s = min;
            this.h = intValue;
            this.i = intValue2;
            float f2 = this.s;
            int i = this.h;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{i, this.i, i}, new float[]{0.0f, 0.67f, 1.0f}, tileMode);
            this.d = linearGradient2;
            linearGradient2.setLocalMatrix(matrix2);
            paint.setShader(this.d);
            this.j = intValue3;
            this.k = intValue4;
            float f3 = this.s;
            int i2 = this.j;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{i2, i2, this.k, i2}, new float[]{0.0f, 0.4f, 0.67f, 1.0f}, tileMode);
            this.e = linearGradient3;
            linearGradient3.setLocalMatrix(matrix);
            paint2.setShader(this.e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.b;
        if (j2 < 0) {
            this.b = elapsedRealtime;
            j = elapsedRealtime;
        } else {
            j = j2;
        }
        long j3 = this.v;
        if (j3 > 0) {
            f = Math.min(1.0f, (elapsedRealtime - j) / j3) * this.s;
            z = 3;
        } else {
            z = 3;
            float pow = ((float) Math.pow((((elapsedRealtime - j) / 2000.0f) * this.u) / 4.0f, 0.8500000238418579d)) * 4.0f * gl.p;
            float f4 = this.s;
            f = (pow * f4) % f4;
        }
        float f5 = (elapsedRealtime - this.b) / 550.0f;
        float interpolation = this.c > 0 ? 1.0f - s33.g.getInterpolation(Math.min(1.0f, (elapsedRealtime - r10) / 320.0f)) : 0.0f;
        boolean d = d();
        boolean z4 = false;
        RectF rectF = this.C;
        if (d) {
            int max = Math.max(gl.L(200.0f), bounds.width() / 3);
            if (interpolation < 1.0f) {
                if (this.J == null) {
                    this.J = new Paint(1);
                    this.I = max;
                    this.K = new LinearGradient(0.0f, 0.0f, max, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix3 = new Matrix();
                    this.L = matrix3;
                    this.K.setLocalMatrix(matrix3);
                    this.J.setShader(this.K);
                    this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.I != max) {
                    this.I = max;
                    LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, max, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.K = linearGradient4;
                    linearGradient4.setLocalMatrix(this.L);
                    this.J.setShader(this.K);
                }
                rectF.set(bounds);
                rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                canvas.saveLayerAlpha(rectF, kk7.d4, 31);
                z2 = true;
                if (this.D) {
                    int max2 = Math.max(gl.L(200.0f), bounds.width() / 3);
                    if (f5 < 1.0f) {
                        if (this.F == null) {
                            z3 = true;
                            this.F = new Paint(1);
                            this.E = max2;
                            this.G = new LinearGradient(0.0f, 0.0f, max2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Matrix matrix4 = new Matrix();
                            this.H = matrix4;
                            this.G.setLocalMatrix(matrix4);
                            this.F.setShader(this.G);
                            this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        } else {
                            z3 = true;
                            if (this.E != max2) {
                                this.E = max2;
                                LinearGradient linearGradient5 = new LinearGradient(0.0f, 0.0f, max2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                this.G = linearGradient5;
                                linearGradient5.setLocalMatrix(this.H);
                                this.F.setShader(this.G);
                            }
                        }
                        rectF.set(bounds);
                        rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                        canvas.saveLayerAlpha(rectF, kk7.d4, 31);
                        z4 = z3;
                    }
                }
                matrix2.setTranslate(f, 0.0f);
                this.d.setLocalMatrix(matrix2);
                matrix.setTranslate(f, 0.0f);
                this.e.setLocalMatrix(matrix);
                path = this.y;
                if (path == null) {
                    Rect rect = this.A;
                    Path path2 = this.z;
                    if (rect == null || !rect.equals(bounds)) {
                        path2.rewind();
                        this.A = bounds;
                        rectF.set(bounds);
                        path2.addRoundRect(rectF, this.B, Path.Direction.CW);
                    }
                    path = path2;
                }
                b(canvas, path);
                if (z4) {
                    canvas.save();
                    int width2 = bounds.width() + this.E;
                    this.H.setTranslate(bounds.left + ((f5 * (width2 + r2)) - this.E), 0.0f);
                    this.G.setLocalMatrix(this.H);
                    int strokeWidth = (int) paint2.getStrokeWidth();
                    canvas.drawRect(bounds.left - strokeWidth, bounds.top - strokeWidth, bounds.right + strokeWidth, bounds.bottom + strokeWidth, this.F);
                    canvas.restore();
                    canvas.restore();
                }
                if (z2) {
                    canvas.save();
                    int width3 = bounds.width() + this.I;
                    this.L.setTranslate(bounds.right - ((interpolation * (width3 + r1)) - this.I), 0.0f);
                    this.K.setLocalMatrix(this.L);
                    int strokeWidth2 = (int) paint2.getStrokeWidth();
                    canvas.drawRect(bounds.left - strokeWidth2, bounds.top - strokeWidth2, bounds.right + strokeWidth2, bounds.bottom + strokeWidth2, this.J);
                    canvas.restore();
                    canvas.restore();
                }
                if (c()) {
                    invalidateSelf();
                    return;
                }
                return;
            }
        }
        z2 = false;
        if (this.D) {
        }
        matrix2.setTranslate(f, 0.0f);
        this.d.setLocalMatrix(matrix2);
        matrix.setTranslate(f, 0.0f);
        this.e.setLocalMatrix(matrix);
        path = this.y;
        if (path == null) {
        }
        b(canvas, path);
        if (z4) {
        }
        if (z2) {
        }
        if (c()) {
        }
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i, int i2) {
        this.o = Integer.valueOf(i);
        this.p = Integer.valueOf(i2);
        this.n = false;
    }

    public final void g(int i, int i2, int i3, int i4) {
        this.o = Integer.valueOf(i);
        this.p = Integer.valueOf(i2);
        this.n = true;
        this.q = Integer.valueOf(i3);
        this.r = Integer.valueOf(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f) {
        if (this.y != null) {
            this.w.setPathEffect(new CornerPathEffect(f));
            this.x.setPathEffect(new CornerPathEffect(f));
            return;
        }
        float[] fArr = this.B;
        boolean z = (fArr[0] == f && fArr[2] == f && fArr[4] == f && fArr[6] == f) ? false : true;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f;
        fArr[2] = f;
        fArr[5] = f;
        fArr[4] = f;
        fArr[7] = f;
        fArr[6] = f;
        if (this.A == null || !z) {
            return;
        }
        Path path = this.z;
        path.rewind();
        Rect rect = this.A;
        RectF rectF = this.C;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void i(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < 8; i++) {
            float[] fArr2 = this.B;
            float f = fArr2[i];
            float f2 = fArr[i];
            if (f != f2) {
                fArr2[i] = f2;
                z = true;
            }
        }
        if (this.A == null || !z) {
            return;
        }
        Path path = this.z;
        path.rewind();
        Rect rect = this.A;
        RectF rectF = this.C;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void j(float f) {
        h(gl.L(f));
    }

    public final void k() {
        Path path = this.y;
        if (path != null) {
            RectF rectF = gl.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.w.setAlpha(i);
        this.x.setAlpha(i);
        if (i > 0) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    public r86(wjb wjbVar) {
        this();
        this.a = wjbVar;
    }
}
