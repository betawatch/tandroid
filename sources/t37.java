// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class t37 extends Drawable {
    public static final ih7[] T = new ih7[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public t37 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public c34 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader a;
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final byte l;
    public final boolean m;
    public vnb p;
    public final boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final Paint c = new Paint(1);
    public final RectF j = new RectF();
    public final Matrix k = new Matrix();
    public final Rect o = new Rect();
    public Integer w = null;
    public boolean x = true;
    public final int[] y = {-1, -1, -1, -1};
    public final Bitmap[] z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path n = new Path();
    public final Paint d = new Paint(1);
    public int H = jn7.d4;

    /* JADX WARN: Multi-variable type inference failed */
    public t37(int i, boolean z, boolean z2, vnb vnbVar) {
        this.p = vnbVar;
        this.q = z;
        this.l = i;
        this.m = z2;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z = this.L;
            Matrix matrix = this.k;
            ih7[] ih7VarArr = T;
            byte b = this.l;
            char c = 2;
            if (z && (bitmap = this.N) != null) {
                char c2 = b == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / ih7VarArr[c2].getBounds().width(), this.N.getHeight() / ih7VarArr[c2].getBounds().height());
                matrix.postScale(min, min);
            } else {
                if (!this.v) {
                    c = b == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = ih7VarArr[c].k;
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / ih7VarArr[c].getBounds().width(), bitmap2.getHeight() / ih7VarArr[c].getBounds().height());
                matrix.postScale(min2, min2);
            }
        }
    }

    public final int b(float f) {
        return this.l == 2 ? (int) Math.ceil(f * 3.0f) : hl.L(f);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b;
        int i;
        Path path;
        boolean z;
        t37 t37Var;
        Path path2;
        Drawable f;
        if (this.q || !m() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.a == null && this.Q == 0 && this.R <= 0.0f && (f = f()) != null) {
                f.setBounds(bounds);
                f.draw(canvas);
                return;
            }
            int b2 = b(2.0f);
            int i2 = this.Q;
            if (i2 != 0) {
                i = i2;
            } else {
                if (this.R > 0.0f) {
                    i2 = hl.U1(this.R, b(xea.U0), Math.min(bounds.width(), bounds.height()) / 2);
                    b = hl.U1(this.R, b(Math.min(6, xea.U0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.l == 2) {
                    i2 = b(6.0f);
                    b = b(6.0f);
                } else {
                    i2 = b(xea.U0);
                    b = b(Math.min(6, xea.U0));
                }
                i = b;
            }
            int b3 = b(6.0f);
            if (paint != null) {
                paint2 = paint;
            }
            if (paint == null && this.a != null) {
                Matrix matrix = this.k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.r);
                this.a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i3 = this.b;
            }
            c34 c34Var = this.P;
            boolean z2 = true;
            if (c34Var != null) {
                path = (Path) c34Var.c;
                z = c34Var.j(bounds, true, true);
            } else {
                path = this.n;
                z = true;
            }
            if (z || this.Q != 0) {
                if (paint == null) {
                    z2 = false;
                }
                t37Var = this;
                int i4 = i2;
                path2 = path;
                t37Var.e(path2, bounds, b2, i4, b3, i, max, true, true, z2);
            } else {
                t37Var = this;
                path2 = path;
            }
            canvas.drawPath(path2, paint2);
            if (t37Var.a != null && t37Var.m && paint == null) {
                int o = vm2.o(t37Var.g(aob.Sc), (int) ((Color.alpha(r13) * t37Var.H) / 255.0f));
                Paint paint3 = t37Var.d;
                paint3.setColor(o);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, c34 c34Var, Paint paint) {
        this.P = c34Var;
        t37 t37Var = this.J;
        if (t37Var != null) {
            t37Var.P = c34Var;
        }
        c(canvas, paint);
        this.P = null;
        t37 t37Var2 = this.J;
        if (t37Var2 != null) {
            t37Var2.P = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        t37 t37Var = this.J;
        if (t37Var == null) {
            c(canvas, null);
            return;
        }
        t37Var.draw(canvas);
        setAlpha((int) (this.K * 255.0f));
        c(canvas, null);
        setAlpha(jn7.d4);
    }

    public final void e(Path path, Rect rect, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        path.rewind();
        int height = (rect.height() - i) >> 1;
        int i6 = i2;
        if (i6 > height) {
            i6 = height;
        }
        boolean z4 = this.I;
        byte b = this.l;
        RectF rectF = this.j;
        if (this.q) {
            if (z4 || b == 2 || z3 || z) {
                int i7 = this.u ? i4 : i6;
                int i8 = rect.right;
                if (b == 1) {
                    path.moveTo((i8 - b(8.0f)) - i7, rect.bottom - i);
                } else {
                    path.moveTo(i8 - b(2.6f), rect.bottom - i);
                }
                path.lineTo(rect.left + i + i7, rect.bottom - i);
                int i9 = i7 << 1;
                rectF.set(rect.left + i, r13 - i9, r10 + i9, rect.bottom - i);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - b(8.0f), (i5 - this.r) + this.b);
                path.lineTo(rect.left + i, (i5 - this.r) + this.b);
            }
            if (this.I || b == 2 || z3 || z2) {
                path.lineTo(rect.left + i, rect.top + i + i6);
                int i10 = i6 << 1;
                rectF.set(rect.left + i, rect.top + i, r3 + i10, r10 + i10);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                int i11 = this.s ? i4 : i6;
                int i12 = rect.right;
                if (b == 1) {
                    path.lineTo((i12 - i) - i11, rect.top + i);
                    int i13 = rect.right - i;
                    int i14 = i11 << 1;
                    rectF.set(i13 - i14, rect.top + i, i13, r11 + i14);
                } else {
                    path.lineTo((i12 - b(8.0f)) - i11, rect.top + i);
                    int i15 = i11 << 1;
                    rectF.set((rect.right - b(8.0f)) - i15, rect.top + i, rect.right - b(8.0f), rect.top + i + i15);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i, (i5 - this.r) - b(2.0f));
                int i16 = rect.right;
                if (b == 1) {
                    path.lineTo(i16 - i, (i5 - this.r) - b(2.0f));
                } else {
                    path.lineTo(i16 - b(8.0f), (i5 - this.r) - b(2.0f));
                }
            }
            if (b == 1) {
                if (z3 || z) {
                    if (this.t) {
                        i6 = i4;
                    }
                    path.lineTo(rect.right - i, (rect.bottom - i) - i6);
                    int i17 = i6 << 1;
                    rectF.set(r0 - i17, r2 - i17, rect.right - i, rect.bottom - i);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i, (i5 - this.r) + this.b);
                }
            } else if (this.I || b == 2 || z3 || z) {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i) - i3) - b(3.0f));
                int i18 = i3 << 1;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i) - i18) - b(9.0f), (rect.right - b(7.0f)) + i18, (rect.bottom - i) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - b(8.0f), (i5 - this.r) + this.b);
            }
        } else {
            if (z4 || b == 2 || z3 || z) {
                int i19 = this.u ? i4 : i6;
                int i20 = rect.left;
                if (b == 1) {
                    path.moveTo(b(8.0f) + i20 + i19, rect.bottom - i);
                } else {
                    path.moveTo(b(2.6f) + i20, rect.bottom - i);
                }
                path.lineTo((rect.right - i) - i19, rect.bottom - i);
                int i21 = i19 << 1;
                rectF.set(r10 - i21, r13 - i21, rect.right - i, rect.bottom - i);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            } else {
                path.moveTo(b(8.0f) + rect.left, (i5 - this.r) + this.b);
                path.lineTo(rect.right - i, (i5 - this.r) + this.b);
            }
            if (this.I || b == 2 || z3 || z2) {
                path.lineTo(rect.right - i, rect.top + i + i6);
                int i22 = rect.right - i;
                int i23 = i6 << 1;
                rectF.set(i22 - i23, rect.top + i, i22, r13 + i23);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                int i24 = this.s ? i4 : i6;
                int i25 = rect.left;
                if (b == 1) {
                    path.lineTo(i25 + i + i24, rect.top + i);
                    int i26 = i24 << 1;
                    rectF.set(rect.left + i, rect.top + i, r10 + i26, r13 + i26);
                } else {
                    path.lineTo(b(8.0f) + i25 + i24, rect.top + i);
                    int i27 = i24 << 1;
                    rectF.set(b(8.0f) + rect.left, rect.top + i, b(8.0f) + rect.left + i27, rect.top + i + i27);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i, (i5 - this.r) - b(2.0f));
                int i28 = rect.left;
                if (b == 1) {
                    path.lineTo(i28 + i, (i5 - this.r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + i28, (i5 - this.r) - b(2.0f));
                }
            }
            if (b == 1) {
                if (z3 || z) {
                    if (this.t || this.u) {
                        i6 = i4;
                    }
                    path.lineTo(rect.left + i, (rect.bottom - i) - i6);
                    int i29 = i6 << 1;
                    rectF.set(rect.left + i, r2 - i29, r0 + i29, rect.bottom - i);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i, (i5 - this.r) + this.b);
                }
            } else if (this.I || b == 2 || z3 || z) {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i) - i3) - b(3.0f));
                int i30 = i3 << 1;
                rectF.set((b(7.0f) + rect.left) - i30, ((rect.bottom - i) - i30) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            } else {
                path.lineTo(b(8.0f) + rect.left, (i5 - this.r) + this.b);
            }
        }
        path.close();
    }

    public final Drawable f() {
        int g;
        int i;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i2;
        int i3;
        Rect rect = this.o;
        int i4 = this.Q;
        if (i4 == 0) {
            i4 = this.R > 0.0f ? 0 : b(xea.U0);
        }
        boolean z = this.s;
        boolean z2 = this.t;
        char c = 3;
        char c2 = z ? z2 ? (char) 3 : (char) 2 : z2 ? (char) 1 : (char) 0;
        boolean z3 = this.u;
        boolean z4 = this.m;
        if (!z4) {
            c = z3 ? (char) 2 : (char) 0;
        } else if (!z3) {
            c = 1;
        }
        Integer num = this.w;
        boolean z5 = this.q;
        if (num != null) {
            g = num.intValue();
        } else if (z5 && m()) {
            g = h();
        } else if (z4) {
            g = g(z5 ? aob.sb : aob.Uc);
        } else {
            g = g(z5 ? aob.rb : aob.ra);
        }
        boolean z6 = (!this.x || this.a != null || z4 || this.L || m()) ? false : true;
        int g2 = g(z5 ? aob.tb : aob.ta);
        boolean z7 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z7 == z6 && iArr4[c][c2] == i4 && ((!z6 || iArr3[c2] == g2) && iArr2[c][c2] == g)) {
            i = g;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c][c2] = i4;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z6) {
                    iArr3[c2] = g2;
                    Paint paint = new Paint(1);
                    i2 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g2, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (hl.p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i3 = 0;
                    } else {
                        i3 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (hl.p > 1.0f) {
                        paint.setColor(i3);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i3);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                } else {
                    i2 = 1;
                }
                Paint paint2 = new Paint(i2);
                paint2.setColor(g);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                i = g;
                drawableArr = drawableArr2;
                iArr = iArr2;
                try {
                    drawableArr2[c][c2] = new NinePatchDrawable(createBitmap, jue.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i = g;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z6;
        iArr[c][c2] = i;
        return drawableArr[c][c2];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.y, -1);
    }

    public int g(int i) {
        if (this.l == 2) {
            return aob.w0(null, i, false);
        }
        vnb vnbVar = this.p;
        return vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final int h() {
        int g = g(aob.La);
        if (this.m) {
            g = vm2.o(g, Math.min(jn7.d4, Color.alpha(g) << 1));
        }
        return vm2.k(g, g(aob.ua));
    }

    public int i(int i) {
        if (this.l == 2) {
            return aob.w0(null, i, false);
        }
        vnb vnbVar = this.p;
        return vnbVar != null ? vnbVar.j(i) : aob.lm.get(i);
    }

    public final ih7 j() {
        boolean z = this.v;
        ih7[] ih7VarArr = T;
        if (z) {
            return ih7VarArr[2];
        }
        return ih7VarArr[this.l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable k() {
        int i;
        if (this.L || m() || (this.a == null && !this.m && this.J == null)) {
            return null;
        }
        int b = b(xea.U0);
        boolean z = this.s;
        boolean z2 = this.t;
        boolean z3 = false;
        char c = z ? z2 ? (char) 3 : (char) 2 : z2 ? (char) 1 : (char) 0;
        int[] iArr = this.y;
        int i2 = iArr[c];
        Drawable[] drawableArr = this.A;
        if (i2 != b) {
            iArr[c] = b;
            Bitmap[] bitmapArr = this.z;
            Bitmap bitmap = bitmapArr[c];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (hl.p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (hl.p > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i = 0;
                } else {
                    i = 1;
                }
                bitmapArr[c] = createBitmap;
                drawableArr[c] = new NinePatchDrawable(createBitmap, jue.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i).array(), new Rect(), null);
                z3 = true;
            } catch (Throwable unused) {
            }
        }
        int g = g(this.q ? aob.tb : aob.ta);
        Drawable drawable = drawableArr[c];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c] != g || z3) {
                drawable.setColorFilter(new PorterDuffColorFilter(g, PorterDuff.Mode.MULTIPLY));
                iArr2[c] = g;
            }
        }
        return drawableArr[c];
    }

    public final boolean l() {
        return this.a != null && aob.nm;
    }

    public final boolean m() {
        return aob.g1(this.p) && this.l != 2 && this.w == null;
    }

    public final Path n() {
        int b;
        int i;
        boolean z;
        boolean z2;
        Path path;
        c34 c34Var = this.P;
        Rect bounds = getBounds();
        int b2 = b(2.0f);
        int i2 = this.Q;
        byte b3 = this.l;
        if (i2 != 0) {
            i = i2;
        } else {
            if (this.R > 0.0f) {
                i2 = hl.U1(this.R, b(xea.U0), Math.min(bounds.width(), bounds.height()) / 2);
                b = hl.U1(this.R, b(Math.min(6, xea.U0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (b3 == 2) {
                i2 = b(6.0f);
                b = b(6.0f);
            } else {
                i2 = b(xea.U0);
                b = b(Math.min(6, xea.U0));
            }
            i = b;
        }
        int b4 = b(6.0f);
        int max = Math.max(bounds.top, 0);
        boolean z3 = true;
        if (c34Var == null || bounds.height() >= this.b) {
            int i3 = this.r;
            int i4 = bounds.bottom;
            int i5 = this.b;
            int i6 = i4 + i3;
            z = b3 != 1 ? i6 - i2 < i5 : i6 - (b4 << 1) < i5;
            z2 = i3 + (i2 << 1) >= 0;
        } else {
            z = true;
            z2 = true;
        }
        if (c34Var != null) {
            path = (Path) c34Var.c;
            z3 = c34Var.j(bounds, z, z2);
        } else {
            path = this.n;
        }
        if (!z3 && this.Q == 0) {
            return path;
        }
        boolean z4 = z;
        Path path2 = path;
        e(path2, bounds, b2, i2, b4, i, max, z4, z2, true);
        return path2;
    }

    public void o(int i, int i2, int i3) {
        p(i, i2, i3, i3, 0, 0, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007a  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        int i7;
        int i8;
        int g;
        int i9;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        char c;
        boolean z5;
        int i12;
        ?? r7;
        boolean z6;
        t37 t37Var = this.J;
        if (t37Var != null) {
            i7 = i3;
            i8 = i5;
            t37Var.p(i, i2, i7, i4, i8, i6, z, z2);
        } else {
            i7 = i3;
            i8 = i5;
        }
        Integer num = this.w;
        if (num != null) {
            g = num.intValue();
        } else {
            boolean z7 = this.q;
            if (z7 && m()) {
                g = h();
            } else {
                boolean z8 = this.m;
                if (z7) {
                    g = g(z8 ? aob.sb : aob.rb);
                    i9 = i(aob.ub);
                    i10 = i(aob.vb);
                    i11 = i(aob.wb);
                    z3 = i(aob.Rc) != 0;
                    if (i9 != 0) {
                        g = g(aob.rb);
                    }
                    int i13 = g;
                    boolean z9 = this.v;
                    byte b = this.l;
                    char c2 = !z9 ? (char) 2 : b == 2 ? (char) 1 : (char) 0;
                    z4 = this.L;
                    ih7[] ih7VarArr = T;
                    if (z4 && i10 != 0 && z3) {
                        c = 3;
                        ih7 ih7Var = ih7VarArr[c2];
                        if (ih7Var != null) {
                            int[] iArr = ih7Var.a;
                            z5 = true;
                            this.e = iArr[0];
                            this.f = iArr[1];
                            this.g = iArr[2];
                            this.h = iArr[3];
                            Paint paint = this.c;
                            if (z4 || i10 == 0 || !z3) {
                                Shader shader = this.a;
                                if (i9 == 0) {
                                    if (shader != null) {
                                        this.a = null;
                                        paint.setShader(null);
                                    }
                                    paint.setColor(i13);
                                } else if (shader == null || i7 != this.b || this.e != i13 || this.f != i9 || this.g != i10 || this.h != i11 || this.i != z3) {
                                    if (i10 == 0) {
                                        this.a = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i9, i13}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else if (z3) {
                                        if (ih7VarArr[c2] == null) {
                                            ih7 ih7Var2 = new ih7();
                                            ih7VarArr[c2] = ih7Var2;
                                            if (b != 2) {
                                                ih7Var2.t = true;
                                            }
                                            ih7Var2.u(b(1.0f));
                                        }
                                        ih7VarArr[c2].n(true, i13, i9, i10, i11);
                                        this.a = ih7VarArr[c2].v;
                                    } else if (i11 != 0) {
                                        this.a = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i11, i10, i9, i13}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        this.a = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i10, i9, i13}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                    paint.setShader(this.a);
                                    this.e = i13;
                                    this.i = z3;
                                    this.f = i9;
                                    this.g = i10;
                                    this.h = i11;
                                    paint.setColor(-1);
                                }
                            } else {
                                if (i7 != this.b || this.O == null || this.e != i13 || this.f != i9 || this.g != i10 || this.h != i11 || this.i != z3) {
                                    if (this.N == null) {
                                        Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                        this.N = createBitmap;
                                        createBitmap.setHasAlpha(false);
                                        Bitmap bitmap = this.N;
                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                        this.O = new BitmapShader(bitmap, tileMode, tileMode);
                                    }
                                    if (ih7VarArr[c2] == null) {
                                        ih7 ih7Var3 = new ih7();
                                        ih7VarArr[c2] = ih7Var3;
                                        if (b != 2) {
                                            boolean z10 = z5;
                                            ih7Var3.t = z10;
                                            z6 = z10;
                                        } else {
                                            z6 = z5;
                                        }
                                        ih7Var3.u(b(1.0f));
                                        r7 = z6;
                                    } else {
                                        r7 = z5;
                                    }
                                    ih7 ih7Var4 = ih7VarArr[c2];
                                    Bitmap bitmap2 = this.N;
                                    int[] iArr2 = ih7Var4.a;
                                    iArr2[0] = i13;
                                    iArr2[r7] = i9;
                                    iArr2[2] = i10;
                                    iArr2[c] = i11;
                                    ih7Var4.c(bitmap2, ih7Var4.i, ih7Var4.e.getInterpolation(ih7Var4.h));
                                    this.O.setLocalMatrix(this.k);
                                }
                                BitmapShader bitmapShader = this.O;
                                this.a = bitmapShader;
                                paint.setShader(bitmapShader);
                                paint.setColor(-1);
                                this.e = i13;
                                this.i = z3;
                                this.f = i9;
                                this.g = i10;
                                this.h = i11;
                            }
                            if (this.a instanceof BitmapShader) {
                                i12 = 0;
                                ih7VarArr[c2].setBounds(0, i8, i2, i7 - i4);
                            } else {
                                i12 = 0;
                            }
                            this.b = i7;
                            if (this.a instanceof BitmapShader) {
                                i12 = i4;
                            }
                            this.r = i - i12;
                            this.s = z;
                            this.t = z2;
                        }
                    } else {
                        c = 3;
                    }
                    z5 = true;
                    Paint paint2 = this.c;
                    if (z4) {
                    }
                    Shader shader2 = this.a;
                    if (i9 == 0) {
                    }
                    if (this.a instanceof BitmapShader) {
                    }
                    this.b = i7;
                    if (this.a instanceof BitmapShader) {
                    }
                    this.r = i - i12;
                    this.s = z;
                    this.t = z2;
                }
                g = g(z8 ? aob.Uc : aob.ra);
            }
        }
        z3 = false;
        i9 = 0;
        i10 = 0;
        i11 = 0;
        if (i9 != 0) {
        }
        int i132 = g;
        boolean z92 = this.v;
        byte b2 = this.l;
        if (!z92) {
        }
        z4 = this.L;
        ih7[] ih7VarArr2 = T;
        if (z4) {
        }
        c = 3;
        z5 = true;
        Paint paint22 = this.c;
        if (z4) {
        }
        Shader shader22 = this.a;
        if (i9 == 0) {
        }
        if (this.a instanceof BitmapShader) {
        }
        this.b = i7;
        if (this.a instanceof BitmapShader) {
        }
        this.r = i - i12;
        this.s = z;
        this.t = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i2 = this.H;
        Paint paint = this.c;
        if (i2 != i || paint.getAlpha() != i) {
            this.H = i;
            paint.setAlpha(i);
            if (this.q) {
                this.d.setAlpha((int) ((i / 255.0f) * Color.alpha(g(aob.Sc))));
            }
        }
        if (this.a == null) {
            Drawable f = f();
            if (f.getAlpha() != i) {
                f.setAlpha(i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        t37 t37Var = this.J;
        if (t37Var != null) {
            t37Var.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
    }
}
