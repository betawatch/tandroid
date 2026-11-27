// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zj0 extends p79 implements yi5 {
    public final Rect E;
    public final RectF F;
    public Bitmap G;
    public float[] H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public b79 M;
    public float[] N;
    public int[] O;
    public short[] P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float[] W;
    public float[] X;
    public short[] Y;
    public int Z;
    public final d79 a;
    public int a0;
    public final qcc b;
    public boolean b0;
    public final qcc c;
    public float[] c0;
    public final jz7 d;
    public int d0;
    public final int e;
    public float[] e0;
    public final float f;
    public int f0;
    public final boolean h;
    public final Paint n = new Paint(3);
    public final Paint r = new Paint(3);
    public final Paint s = new Paint();
    public final Paint w = new Paint();
    public final Paint x;
    public final RectF y;

    public zj0(d79 d79Var, qcc qccVar, qcc qccVar2, int i, float f, jz7 jz7Var, boolean z, boolean z2, b79 b79Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.y = new RectF();
        this.E = new Rect();
        this.F = new RectF();
        this.H = new float[32];
        this.K = -1.0f;
        this.N = new float[128];
        this.O = new int[64];
        this.P = new short[96];
        this.W = new float[128];
        this.X = new float[128];
        this.Y = new short[96];
        this.c0 = new float[48];
        this.e0 = new float[32];
        this.a = d79Var;
        this.b = qccVar;
        this.c = qccVar2;
        this.e = i;
        this.f = f;
        this.d = jz7Var;
        this.h = z;
        this.L = z2;
        this.M = b79Var;
        paint.setColor(-1);
    }

    @Override // yi5
    public final void a(qeb qebVar, RectF rectF) {
        qebVar.b = true;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        int b;
        if (u(view)) {
            int i = this.e;
            rect.right = i;
            rect.left = i;
            f89 U = recyclerView.U(view);
            j79 adapter = recyclerView.getAdapter();
            if (U == null || adapter == null || (b = U.b()) == -1) {
                return;
            }
            if (b == 0) {
                rect.top = this.h ? i : hl.L(4.0f);
            }
            if (b == adapter.b() - 1) {
                rect.bottom = i;
            }
        }
    }

    @Override // p79
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        d79 d79Var = this.a;
        if (recyclerView == d79Var) {
            int sectionsBackgroundColorForDecoration = d79Var.getSectionsBackgroundColorForDecoration();
            Paint paint = this.s;
            if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                paint.setColor(sectionsBackgroundColorForDecoration);
                this.G = null;
                this.K = -1.0f;
            }
            if (!this.L) {
                p(canvas);
                return;
            }
            int ordinal = this.M.ordinal();
            if (ordinal == 0) {
                canvas.drawRect(0.0f, 0.0f, d79Var.getWidth(), d79Var.getHeight(), paint);
                p(canvas);
                return;
            }
            if (ordinal == 1) {
                int r = r(1.0f);
                Paint paint2 = this.w;
                paint2.setColor(r);
                canvas.drawRect(0.0f, 0.0f, d79Var.getWidth(), d79Var.getHeight(), paint2);
                m(canvas, 0.0f);
                this.U = true;
                p(canvas);
                this.U = false;
                return;
            }
            if (ordinal != 3) {
                m(canvas, 1.0f);
                p(canvas);
                return;
            }
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = true;
            m(canvas, 0.0f);
            p(canvas);
            this.T = false;
            int i = this.Q;
            if (i == 0) {
                return;
            }
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i, this.N, 0, null, 0, this.O, 0, this.P, 0, this.S, this.x);
        }
    }

    @Override // p79
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i;
        zj0 zj0Var = this;
        d79 d79Var = zj0Var.a;
        if (recyclerView == d79Var) {
            float f = zj0Var.f;
            if (f > 0.0f) {
                int sectionsBackgroundColorForDecoration = d79Var.getSectionsBackgroundColorForDecoration();
                Paint paint = zj0Var.s;
                if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                    paint.setColor(sectionsBackgroundColorForDecoration);
                    zj0Var.G = null;
                    zj0Var.K = -1.0f;
                }
                int max = Math.max(1, (int) Math.ceil(f));
                Bitmap bitmap = zj0Var.G;
                Paint paint2 = zj0Var.r;
                if (bitmap == null || zj0Var.J != max || zj0Var.K != f) {
                    zj0Var.J = max;
                    zj0Var.K = f;
                    int i2 = max << 1;
                    zj0Var.G = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(zj0Var.G);
                    canvas3.drawColor(paint.getColor());
                    Paint paint3 = new Paint(1);
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f2 = max;
                    canvas3.drawCircle(f2, f2, f, paint3);
                    Bitmap bitmap2 = zj0Var.G;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                }
                boolean z = zj0Var.L && zj0Var.M == b79.b;
                zj0Var.b0 = z;
                if (z) {
                    zj0Var.Z = 0;
                    zj0Var.a0 = 0;
                }
                if (d79Var.d0()) {
                    int paddingLeft = d79Var.getPaddingLeft();
                    int i3 = zj0Var.e;
                    float f3 = paddingLeft + i3;
                    float width = (d79Var.getWidth() - d79Var.getPaddingRight()) - i3;
                    float f4 = f * 0.2f;
                    int i4 = 0;
                    while (i4 < zj0Var.f0) {
                        float[] fArr = zj0Var.e0;
                        float f5 = f3;
                        float f6 = width;
                        float f7 = fArr[i4];
                        float f8 = fArr[i4 + 1];
                        float f9 = fArr[i4 + 2];
                        float f10 = fArr[i4 + 3];
                        if (f4 > 0.0f && i4 > 0) {
                            f9 = Math.min(f9, Math.max(0.0f, Math.min(1.0f, (f7 - fArr[i4 - 3]) / f4)));
                        }
                        float f11 = f9;
                        if (f4 > 0.0f && (i = i4 + 4) < zj0Var.f0) {
                            f10 = Math.min(f10, Math.max(0.0f, Math.min(1.0f, (zj0Var.e0[i] - f8) / f4)));
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 >= d79Var.getChildCount()) {
                                canvas2 = canvas;
                                zj0Var.q(f5, f6, f7, f11, canvas2);
                                zj0Var = this;
                                break;
                            } else {
                                View childAt = d79Var.getChildAt(i5);
                                if (d79.c1(childAt) && Math.abs(d79.w1(childAt) - f7) < 1.0f) {
                                    canvas2 = canvas;
                                    break;
                                }
                                i5++;
                            }
                        }
                        zj0Var.k(f5, f6, f8, f10, canvas2);
                        i4 += 4;
                        width = f6;
                        f3 = f5;
                    }
                } else {
                    int i6 = 0;
                    while (i6 < d79Var.getChildCount()) {
                        View childAt2 = d79Var.getChildAt(i6);
                        f89 U = d79Var.U(childAt2);
                        int S = RecyclerView.S(childAt2);
                        if (childAt2 != d79Var.getEmptyView() && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && S != -1 && ((U == null || !U.j()) && zj0Var.u(childAt2) && !d79Var.j1(S))) {
                            float x = childAt2.getX();
                            float width2 = childAt2.getWidth() + x;
                            if (!zj0Var.v(S - 1) && !d79.c1(childAt2)) {
                                zj0Var.q(x, width2, d79.w1(childAt2), 1.0f, canvas);
                            }
                            if (!zj0Var.v(S + 1)) {
                                zj0Var.k(x, width2, d79.I0(childAt2), 1.0f, canvas);
                            }
                        }
                        i6++;
                        zj0Var = this;
                    }
                }
                if (d79Var.L2 != null) {
                    for (int i7 = 0; i7 < d79Var.L2.size(); i7++) {
                        long longValue = ((Long) d79Var.L2.get(i7)).longValue();
                        Typeface typeface = hl.a;
                        View V0 = d79Var.V0((int) (longValue >> 32));
                        View V02 = d79Var.V0((int) longValue);
                        if (V0 != null && !d79.c1(V0)) {
                            q(V0.getX(), V0.getX() + V0.getWidth(), d79.w1(V0), 1.0f, canvas);
                        }
                        if (V02 != null) {
                            k(V02.getX(), V02.getWidth() + V02.getX(), d79.I0(V02), 1.0f, canvas);
                        }
                    }
                }
                if (this.b0) {
                    this.b0 = false;
                    int i8 = this.Z;
                    if (i8 != 0) {
                        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i8, this.W, 0, this.X, 0, null, 0, this.Y, 0, this.a0, paint2);
                    }
                }
            }
        }
    }

    @Override // yi5
    public final void g(Canvas canvas, RectF rectF) {
        canvas.save();
        try {
            canvas.clipRect(rectF);
            this.V = true;
            p(canvas);
        } finally {
            this.V = false;
            canvas.restore();
        }
    }

    public final void h(float f, float f2) {
        if (f2 <= f) {
            return;
        }
        int i = this.I;
        int i2 = i + 2;
        float[] fArr = this.H;
        if (i2 > fArr.length) {
            float[] fArr2 = new float[fArr.length << 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.H = fArr2;
            fArr = fArr2;
        }
        int i3 = this.I;
        int i4 = i3 + 1;
        this.I = i4;
        fArr[i3] = f;
        this.I = i3 + 2;
        fArr[i4] = f2;
    }

    public final void i(float f, float f2, float f3, float f4, int i) {
        if (f3 <= f || f4 <= f2) {
            return;
        }
        int i2 = this.Q;
        int i3 = i2 + 8;
        float[] fArr = this.N;
        if (i3 > fArr.length) {
            float[] fArr2 = new float[fArr.length << 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.N = fArr2;
        }
        int i4 = this.R;
        int i5 = i4 + 4;
        int[] iArr = this.O;
        if (i5 > iArr.length) {
            int[] iArr2 = new int[iArr.length << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.O = iArr2;
        }
        int i6 = this.S;
        int i7 = i6 + 6;
        short[] sArr = this.P;
        if (i7 > sArr.length) {
            short[] sArr2 = new short[sArr.length << 1];
            System.arraycopy(sArr, 0, sArr2, 0, i6);
            this.P = sArr2;
            sArr = sArr2;
        }
        int i8 = this.R;
        float[] fArr3 = this.N;
        int i9 = this.Q;
        int i10 = i9 + 1;
        this.Q = i10;
        fArr3[i9] = f;
        int i11 = i9 + 2;
        this.Q = i11;
        fArr3[i10] = f2;
        int i12 = i9 + 3;
        this.Q = i12;
        fArr3[i11] = f3;
        int i13 = i9 + 4;
        this.Q = i13;
        fArr3[i12] = f2;
        int i14 = i9 + 5;
        this.Q = i14;
        fArr3[i13] = f;
        int i15 = i9 + 6;
        this.Q = i15;
        fArr3[i14] = f4;
        int i16 = i9 + 7;
        this.Q = i16;
        fArr3[i15] = f3;
        this.Q = i9 + 8;
        fArr3[i16] = f4;
        int[] iArr3 = this.O;
        int i17 = i8 + 1;
        this.R = i17;
        iArr3[i8] = i;
        int i18 = i8 + 2;
        this.R = i18;
        iArr3[i17] = i;
        int i19 = i8 + 3;
        this.R = i19;
        iArr3[i18] = i;
        this.R = i8 + 4;
        iArr3[i19] = i;
        int i20 = this.S;
        int i21 = i20 + 1;
        this.S = i21;
        sArr[i20] = (short) i8;
        int i22 = i20 + 2;
        this.S = i22;
        short s = (short) i17;
        sArr[i21] = s;
        int i23 = i20 + 3;
        this.S = i23;
        short s2 = (short) i18;
        sArr[i22] = s2;
        int i24 = i20 + 4;
        this.S = i24;
        sArr[i23] = s2;
        int i25 = i20 + 5;
        this.S = i25;
        sArr[i24] = s;
        this.S = i20 + 6;
        sArr[i25] = (short) i19;
    }

    public final void j(float f, float f2, float f3, float f4, Canvas canvas) {
        if (f3 <= f || f4 <= f2) {
            return;
        }
        boolean z = this.T;
        Paint paint = this.s;
        if (z) {
            i(f, f2, f3, f4, paint.getColor());
        } else {
            canvas.drawRect(f, f2, f3, f4, paint);
        }
    }

    public final void k(float f, float f2, float f3, float f4, Canvas canvas) {
        if (f4 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f4) * this.J;
        float f5 = f3 - min;
        l(canvas, 2, f, f5, f + min, f3);
        l(canvas, 3, f2 - min, f5, f2, f3);
    }

    public final void l(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        int i2 = (i & 1) == 0 ? 0 : this.J;
        int i3 = i < 2 ? 0 : this.J;
        boolean z = this.b0;
        int i4 = this.J;
        if (!z) {
            Rect rect = this.E;
            rect.set(i2, i3, i2 + i4, i4 + i3);
            RectF rectF = this.F;
            rectF.set(f, f2, f3, f4);
            canvas.drawBitmap(this.G, rect, rectF, this.n);
            return;
        }
        float f5 = i2;
        float f6 = i3;
        float f7 = i2 + i4;
        float f8 = i3 + i4;
        int i5 = this.Z;
        int i6 = i5 + 8;
        float[] fArr = this.W;
        if (i6 > fArr.length) {
            int length = fArr.length << 1;
            float[] fArr2 = new float[length];
            float[] fArr3 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            System.arraycopy(this.X, 0, fArr3, 0, this.Z);
            this.W = fArr2;
            this.X = fArr3;
        }
        int i7 = this.a0;
        int i8 = i7 + 6;
        short[] sArr = this.Y;
        if (i8 > sArr.length) {
            short[] sArr2 = new short[sArr.length << 1];
            System.arraycopy(sArr, 0, sArr2, 0, i7);
            this.Y = sArr2;
            sArr = sArr2;
        }
        int i9 = this.Z;
        int i10 = i9 >> 1;
        float[] fArr4 = this.W;
        fArr4[i9] = f;
        float[] fArr5 = this.X;
        int i11 = i9 + 1;
        this.Z = i11;
        fArr5[i9] = f5;
        fArr4[i11] = f2;
        int i12 = i9 + 2;
        this.Z = i12;
        fArr5[i11] = f6;
        fArr4[i12] = f3;
        int i13 = i9 + 3;
        this.Z = i13;
        fArr5[i12] = f7;
        fArr4[i13] = f2;
        int i14 = i9 + 4;
        this.Z = i14;
        fArr5[i13] = f6;
        fArr4[i14] = f;
        int i15 = i9 + 5;
        this.Z = i15;
        fArr5[i14] = f5;
        fArr4[i15] = f4;
        int i16 = i9 + 6;
        this.Z = i16;
        fArr5[i15] = f8;
        fArr4[i16] = f3;
        int i17 = i9 + 7;
        this.Z = i17;
        fArr5[i16] = f7;
        fArr4[i17] = f4;
        this.Z = i9 + 8;
        fArr5[i17] = f8;
        int i18 = this.a0;
        int i19 = i18 + 1;
        this.a0 = i19;
        sArr[i18] = (short) i10;
        int i20 = i18 + 2;
        this.a0 = i20;
        short s = (short) (i10 + 1);
        sArr[i19] = s;
        int i21 = i18 + 3;
        this.a0 = i21;
        short s2 = (short) (i10 + 2);
        sArr[i20] = s2;
        int i22 = i18 + 4;
        this.a0 = i22;
        sArr[i21] = s2;
        int i23 = i18 + 5;
        this.a0 = i23;
        sArr[i22] = s;
        this.a0 = i18 + 6;
        sArr[i23] = (short) (i10 + 3);
    }

    public final void m(Canvas canvas, float f) {
        zj0 zj0Var;
        float f2;
        float f3;
        d79 d79Var = this.a;
        float width = d79Var.getWidth();
        float height = d79Var.getHeight();
        int paddingLeft = d79Var.getPaddingLeft();
        int i = this.e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i));
        float max2 = Math.max(max, Math.min(width, (width - d79Var.getPaddingRight()) - i));
        if (max >= max2) {
            j(0.0f, 0.0f, width, height, canvas);
            return;
        }
        this.I = 0;
        for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
            View childAt = d79Var.getChildAt(i2);
            int S = RecyclerView.S(childAt);
            f89 U = d79Var.U(childAt);
            if (childAt != d79Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!d79Var.d0() || U == null || !U.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !d79Var.j1(S))) {
                float w1 = d79.w1(childAt);
                float I0 = d79.I0(childAt);
                if (childAt instanceof nw5) {
                    I0 -= ((nw5) childAt).getBottomInfoMargin();
                }
                h(w1, I0);
            }
        }
        if (d79Var.L2 != null) {
            for (int i3 = 0; i3 < d79Var.L2.size(); i3++) {
                long longValue = ((Long) d79Var.L2.get(i3)).longValue();
                Typeface typeface = hl.a;
                int i4 = (int) (longValue >> 32);
                int i5 = (int) longValue;
                float f4 = height;
                float f5 = 0.0f;
                for (int i6 = 0; i6 < d79Var.getChildCount(); i6++) {
                    View childAt2 = d79Var.getChildAt(i6);
                    int S2 = RecyclerView.S(childAt2);
                    if (S2 >= i4 && S2 <= i5) {
                        f4 = Math.min(f4, d79.w1(childAt2));
                        f5 = Math.max(f5, d79.I0(childAt2));
                    }
                }
                h(f4, f5);
            }
        }
        int i7 = 2;
        for (int i8 = 2; i8 < this.I; i8 += 2) {
            float[] fArr = this.H;
            float f6 = fArr[i8];
            float f7 = fArr[i8 + 1];
            int i9 = i8 - 2;
            while (i9 >= 0) {
                float[] fArr2 = this.H;
                float f8 = fArr2[i9];
                if (f8 > f6) {
                    fArr2[i9 + 2] = f8;
                    fArr2[i9 + 3] = fArr2[i9 + 1];
                    i9 -= 2;
                }
            }
            float[] fArr3 = this.H;
            fArr3[i9 + 2] = f6;
            fArr3[i9 + 3] = f7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.I; i11 += 2) {
            float max3 = Math.max(0.0f, this.H[i11]);
            float min = Math.min(height, this.H[i11 + 1]);
            if (min > max3) {
                if (i10 > 0) {
                    float[] fArr4 = this.H;
                    int i12 = i10 - 1;
                    float f9 = fArr4[i12];
                    if (max3 <= f9 + f) {
                        fArr4[i12] = Math.max(f9, min);
                    }
                }
                float[] fArr5 = this.H;
                int i13 = i10 + 1;
                fArr5[i10] = max3;
                i10 += 2;
                fArr5[i13] = min;
            }
        }
        this.I = i10;
        if (i10 == 0) {
            j(0.0f, 0.0f, width, height, canvas);
            return;
        }
        float[] fArr6 = this.H;
        float f10 = fArr6[0];
        float f11 = fArr6[i10 - 1];
        if (f10 > 0.0f) {
            j(0.0f, 0.0f, width, Math.min(height, f10 + f), canvas);
        }
        if (f11 < height) {
            j(0.0f, Math.max(0.0f, f11 - f), width, height, canvas);
        }
        float f12 = f10 > 0.0f ? f10 : 0.0f;
        float f13 = f11 < height ? f11 : height;
        if (f13 > f12) {
            j(0.0f, f12, Math.min(width, max + f), f13, canvas);
            zj0Var = this;
            zj0Var.j(Math.max(0.0f, max2 - f), f12, width, f13, canvas);
        } else {
            zj0Var = this;
        }
        while (i7 < zj0Var.I) {
            float[] fArr7 = zj0Var.H;
            float f14 = fArr7[i7 - 1];
            float f15 = fArr7[i7];
            if (f15 > f14) {
                float max4 = Math.max(0.0f, f14 - f);
                float min2 = Math.min(height, f15 + f);
                f2 = max;
                f3 = max2;
                zj0Var.j(f2, max4, f3, min2, canvas);
            } else {
                f2 = max;
                f3 = max2;
            }
            i7 += 2;
            zj0Var = this;
            max = f2;
            max2 = f3;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z, boolean z2) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof nw5 ? ((nw5) view2).getBottomInfoMargin() : 0.0f;
        float left = view.getLeft();
        float f = this.f;
        d79 d79Var = this.a;
        float max = Math.max((-f) - d79Var.getSectionsOverscanTop(), d79.w1(view) - (z ? f : 0.0f));
        float right = view.getRight();
        float min = Math.min(d79Var.getHeight() - (-f), (d79.I0(view2) + (z2 ? f : 0.0f)) - bottomInfoMargin);
        RectF rectF = this.y;
        rectF.set(left, max, right, min);
        if (rectF.bottom >= rectF.top) {
            o(canvas, rectF, view.getAlpha());
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z = this.V;
        Paint paint = this.w;
        if (z) {
            paint.setColor(vm2.o(this.a.getSectionColorForDecoration(), Math.round(Math.max(0.0f, Math.min(1.0f, f)) * Color.alpha(r1))));
            float f2 = this.f;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            return;
        }
        if (!this.L) {
            this.d.k(canvas, rectF, valueOf, valueOf, Float.valueOf(f));
            return;
        }
        paint.setColor(r(f));
        if (!this.U || f < 1.0f) {
            if (this.T) {
                i(rectF.left, rectF.top, rectF.right, rectF.bottom, paint.getColor());
            } else {
                canvas.drawRect(rectF, paint);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        float[] fArr;
        View V0;
        f89 U;
        Canvas canvas2 = canvas;
        d79 d79Var = this.a;
        boolean d0 = d79Var.d0();
        RectF rectF = this.y;
        int i4 = this.e;
        float f2 = 0.0f;
        int i5 = 0;
        if (d0) {
            this.d0 = 0;
            this.f0 = 0;
            for (int i6 = 0; i6 < d79Var.getChildCount(); i6++) {
                View childAt = d79Var.getChildAt(i6);
                if (childAt != d79Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && u(childAt)) {
                    float w1 = d79.w1(childAt);
                    float I0 = d79.I0(childAt);
                    f89 U2 = d79Var.U(childAt);
                    if (U2 == null || !U2.j() || childAt.getAlpha() >= 1.0f) {
                        if (d79Var.j1(RecyclerView.S(childAt))) {
                        }
                        float alpha = childAt.getAlpha();
                        int i7 = this.d0;
                        i3 = i7 + 3;
                        fArr = this.c0;
                        if (i3 > fArr.length) {
                            float[] fArr2 = new float[fArr.length << 1];
                            System.arraycopy(fArr, 0, fArr2, 0, i7);
                            this.c0 = fArr2;
                            fArr = fArr2;
                        }
                        int i8 = this.d0;
                        int i9 = i8 + 1;
                        this.d0 = i9;
                        fArr[i8] = w1;
                        int i10 = i8 + 2;
                        this.d0 = i10;
                        fArr[i9] = I0;
                        this.d0 = i8 + 3;
                        fArr[i10] = alpha;
                    } else {
                        int i11 = U2.i;
                        if (i11 >= 0 && (V0 = d79Var.V0(((int) Math.ceil(i11 / 1000.0d)) + 1)) != null && I0 > V0.getY() && u(V0) && (U = d79Var.U(V0)) != null && !U.j()) {
                            w1 -= 1.0f;
                            I0 = V0.getY();
                            if (I0 < w1) {
                            }
                        }
                        float alpha2 = childAt.getAlpha();
                        int i72 = this.d0;
                        i3 = i72 + 3;
                        fArr = this.c0;
                        if (i3 > fArr.length) {
                        }
                        int i82 = this.d0;
                        int i92 = i82 + 1;
                        this.d0 = i92;
                        fArr[i82] = w1;
                        int i102 = i82 + 2;
                        this.d0 = i102;
                        fArr[i92] = I0;
                        this.d0 = i82 + 3;
                        fArr[i102] = alpha2;
                    }
                }
            }
            for (int i12 = 3; i12 < this.d0; i12 += 3) {
                float[] fArr3 = this.c0;
                float f3 = fArr3[i12];
                float f4 = fArr3[i12 + 1];
                float f5 = fArr3[i12 + 2];
                int i13 = i12 - 3;
                while (i13 >= 0) {
                    float[] fArr4 = this.c0;
                    float f6 = fArr4[i13];
                    if (f6 > f3) {
                        fArr4[i13 + 3] = f6;
                        fArr4[i13 + 4] = fArr4[i13 + 1];
                        fArr4[i13 + 5] = fArr4[i13 + 2];
                        i13 -= 3;
                    }
                }
                float[] fArr5 = this.c0;
                fArr5[i13 + 3] = f3;
                fArr5[i13 + 4] = f4;
                fArr5[i13 + 5] = f5;
            }
            int i14 = 0;
            while (i14 < this.d0) {
                float f7 = this.c0[i14 + 1];
                int i15 = i14 + 3;
                while (i15 < this.d0) {
                    float[] fArr6 = this.c0;
                    if (fArr6[i15] > 1.5f + f7) {
                        break;
                    }
                    f7 = Math.max(f7, fArr6[i15 + 1]);
                    i15 += 3;
                }
                float f8 = -3.4028235E38f;
                int i16 = i14;
                float f9 = -3.4028235E38f;
                float f10 = f2;
                float f11 = Float.MAX_VALUE;
                float f12 = Float.MAX_VALUE;
                while (true) {
                    f = f2;
                    if (i16 >= i15) {
                        break;
                    }
                    float[] fArr7 = this.c0;
                    float f13 = fArr7[i16];
                    float f14 = fArr7[i16 + 1];
                    float f15 = fArr7[i16 + 2];
                    f12 = Math.min(f12, f13);
                    f8 = Math.max(f8, f14);
                    f10 = Math.max(f10, f15);
                    if (f15 >= 0.99f) {
                        f11 = Math.min(f11, f13);
                        f9 = Math.max(f9, f14);
                    }
                    i16 += 3;
                    f2 = f;
                }
                if (f10 >= 0.001f) {
                    if (f11 != Float.MAX_VALUE) {
                        float f16 = f;
                        float f17 = f16;
                        while (i14 < i15) {
                            float[] fArr8 = this.c0;
                            float f18 = fArr8[i14];
                            float f19 = fArr8[i14 + 1];
                            float f20 = fArr8[i14 + 2];
                            if (f20 < 0.99f) {
                                if (f18 < f11) {
                                    f16 = Math.max(f16, (f11 - f18) * f20);
                                }
                                if (f19 > f9) {
                                    f17 = Math.max(f17, (f19 - f9) * f20);
                                }
                            }
                            i14 += 3;
                        }
                        f12 = f11 - f16;
                        f8 = f9 + f17;
                        f10 = 1.0f;
                    }
                    if (f8 > f12) {
                        rectF.set(d79Var.getPaddingLeft() + i4, f12, (d79Var.getWidth() - d79Var.getPaddingRight()) - i4, f8);
                        o(canvas2, rectF, f10);
                        int i17 = this.f0;
                        int i18 = i17 + 4;
                        float[] fArr9 = this.e0;
                        if (i18 > fArr9.length) {
                            float[] fArr10 = new float[fArr9.length << 1];
                            i2 = 0;
                            System.arraycopy(fArr9, 0, fArr10, 0, i17);
                            this.e0 = fArr10;
                            fArr9 = fArr10;
                        } else {
                            i2 = 0;
                        }
                        int i19 = this.f0;
                        int i20 = i19 + 1;
                        this.f0 = i20;
                        fArr9[i19] = f12;
                        int i21 = i19 + 2;
                        this.f0 = i21;
                        fArr9[i20] = f8;
                        int i22 = i19 + 3;
                        this.f0 = i22;
                        fArr9[i21] = f10;
                        this.f0 = i19 + 4;
                        fArr9[i22] = f10;
                        i14 = i15;
                        i5 = i2;
                        f2 = f;
                    }
                }
                i2 = 0;
                i14 = i15;
                i5 = i2;
                f2 = f;
            }
            i = i5;
        } else {
            i = 0;
            int i23 = -1;
            int i24 = -1;
            int i25 = 0;
            View view = null;
            View view2 = null;
            while (i25 < d79Var.getChildCount()) {
                View childAt2 = d79Var.getChildAt(i25);
                if (childAt2 == d79Var.getEmptyView() || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !u(childAt2) || d79Var.j1(RecyclerView.S(childAt2))) {
                    n(canvas, view, view2, s(i23, view), t(i24, view2));
                    i23 = -1;
                    i24 = -1;
                    view = null;
                    view2 = null;
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        n(canvas2, view, view2, s(i23, view), t(i24, view2));
                        i23 = -1;
                        view = null;
                    }
                    if (view == null) {
                        i23 = i25;
                        view = childAt2;
                    }
                    i24 = i25;
                    view2 = childAt2;
                }
                i25++;
                canvas2 = canvas;
            }
            canvas2 = canvas;
            n(canvas2, view, view2, s(i23, view), t(i24, view2));
        }
        if (d79Var.L2 != null) {
            for (int i26 = i; i26 < d79Var.L2.size(); i26++) {
                long longValue = ((Long) d79Var.L2.get(i26)).longValue();
                Typeface typeface = hl.a;
                int i27 = (int) (longValue >> 32);
                int i28 = (int) longValue;
                float height = d79Var.getHeight();
                float f21 = this.f;
                float f22 = height + f21;
                float f23 = -f21;
                for (int i29 = i; i29 < d79Var.getChildCount(); i29++) {
                    View childAt3 = d79Var.getChildAt(i29);
                    int S = RecyclerView.S(childAt3);
                    if (S >= i27 && S <= i28) {
                        f22 = Math.min(f22, d79.w1(childAt3));
                        f23 = Math.max(f23, d79.I0(childAt3));
                    }
                }
                if (f22 < f23) {
                    rectF.set(d79Var.getPaddingLeft() + i4, f22, (d79Var.getWidth() - d79Var.getPaddingRight()) - i4, f23);
                    o(canvas2, rectF, 1.0f);
                }
            }
        }
    }

    public final void q(float f, float f2, float f3, float f4, Canvas canvas) {
        if (f4 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f4) * this.J;
        float f5 = f3 + min;
        l(canvas, 0, f, f3, f + min, f5);
        l(canvas, 1, f2 - min, f3, f2, f5);
    }

    public final int r(float f) {
        return vm2.k(vm2.o(this.a.getSectionColorForDecoration(), Math.round(Math.max(0.0f, Math.min(1.0f, f)) * Color.alpha(r0))), this.s.getColor());
    }

    public final boolean s(int i, View view) {
        if (view == null || i > 0) {
            return false;
        }
        j79 adapter = this.a.getAdapter();
        int S = RecyclerView.S(view);
        if (adapter == null || S <= 0) {
            return false;
        }
        return ((Boolean) this.c.a(Integer.valueOf(adapter.d(S - 1)))).booleanValue();
    }

    public final boolean t(int i, View view) {
        if (view == null) {
            return false;
        }
        d79 d79Var = this.a;
        if (i < d79Var.getChildCount() - 1) {
            return false;
        }
        j79 adapter = d79Var.getAdapter();
        int S = RecyclerView.S(view);
        if (adapter == null || S < 0 || S >= adapter.b() - 1) {
            return false;
        }
        return ((Boolean) this.c.a(Integer.valueOf(adapter.d(S + 1)))).booleanValue();
    }

    public final boolean u(View view) {
        return ((Boolean) this.b.a(view)).booleanValue();
    }

    public final boolean v(int i) {
        d79 d79Var = this.a;
        j79 adapter = d79Var.getAdapter();
        if (i < 0 || adapter == null || i >= adapter.b()) {
            return false;
        }
        View V0 = d79Var.V0(i);
        if (V0 != null) {
            return u(V0) && !d79Var.j1(i);
        }
        return ((Boolean) this.c.a(Integer.valueOf(adapter.d(i)))).booleanValue() && !d79Var.j1(i);
    }
}
