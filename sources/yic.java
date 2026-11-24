// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class yic extends View {
    public static int A3;
    public static float B3;
    public static int u3;
    public static long y3;
    public static int z3;
    public long A0;
    public final RectF A1;
    public final Path A2;
    public float B0;
    public final RectF B1;
    public final kra B2;
    public long C0;
    public final RectF C1;
    public boolean C2;
    public float D0;
    public Drawable D1;
    public boolean D2;
    public final Matrix E;
    public float E0;
    public Drawable E1;
    public boolean E2;
    public LinearGradient F;
    public long F0;
    public Drawable F1;
    public long F2;
    public final gc G;
    public float G0;
    public final int G1;
    public long G2;
    public final Drawable H;
    public float H0;
    public LinearGradient H1;
    public float H2;
    public il0 I;
    public float I0;
    public LinearGradient I1;
    public float I2;
    public il0 J;
    public float J0;
    public final Matrix J1;
    public float J2;
    public float K;
    public boolean K0;
    public final TextPaint K1;
    public float K2;
    public float L;
    public final int L0;
    public final Matrix L1;
    public float L2;
    public boolean M;
    public LinearGradient M0;
    public final TextPaint M1;
    public float M2;
    public int N;
    public final Matrix N0;
    public il0 N1;
    public float N2;
    public int O;
    public String O0;
    public il0 O1;
    public float O2;
    public int P;
    public StaticLayout P0;
    public il0 P1;
    public float P2;
    public int Q;
    public StaticLayout Q0;
    public float Q1;
    public float Q2;
    public boolean R;
    public StaticLayout R0;
    public long R1;
    public float R2;
    public boolean S;
    public StaticLayout S0;
    public LinearGradient S1;
    public Bitmap S2;
    public boolean T;
    public float T0;
    public RadialGradient T1;
    public float[] T2;
    public float U;
    public LinearGradient U0;
    public LinearGradient U1;
    public float[] U2;
    public float V;
    public float V0;
    public final Paint V1;
    public int V2;
    public float W;
    public final Matrix W0;
    public final Paint W1;
    public int W2;
    public final Paint X0;
    public final Paint X1;
    public int X2;
    public long Y0;
    public final Paint Y1;
    public int Y2;
    public int Z0;
    public final Matrix Z1;
    public float Z2;
    public final c5a a;
    public float a0;
    public final ArrayList a1;
    public final RectF a2;
    public float a3;
    public final wjb b;
    public float b0;
    public int[] b1;
    public boolean b2;
    public float b3;
    public final om3 c;
    public float c0;
    public final ArrayList c1;
    public boolean c2;
    public float c3;
    public final TextPaint d;
    public float d0;
    public final Paint d1;
    public long d2;
    public boolean d3;
    public final TextPaint e;
    public float e0;
    public float e1;
    public float e2;
    public final Paint e3;
    public final TextPaint f;
    public int f0;
    public boolean f1;
    public float f2;
    public final Paint f3;
    public long g0;
    public final Path g1;
    public float g2;
    public final Paint g3;
    public int h;
    public long h0;
    public final Paint h1;
    public final RectF h2;
    public LinearGradient h3;
    public final RectF i0;
    public final Paint i1;
    public Drawable i2;
    public LinearGradient i3;
    public final RectF j0;
    public float j1;
    public il0 j2;
    public LinearGradient j3;
    public final RectF k0;
    public boolean k1;
    public boolean k2;
    public final Matrix k3;
    public final RectF l0;
    public float l1;
    public boolean l2;
    public LinearGradient l3;
    public final RectF m0;
    public float m1;
    public long m2;
    public final Matrix m3;
    public final TextPaint n;
    public boolean n0;
    public final String n1;
    public float n2;
    public float n3;
    public float o0;
    public String o1;
    public float[] o2;
    public final uic o3;
    public float p0;
    public String p1;
    public int p2;
    public boolean p3;
    public float q0;
    public String q1;
    public int q2;
    public boolean q3;
    public final Paint r;
    public float r0;
    public String r1;
    public float r2;
    public final int[] r3;
    public final Paint s;
    public float s0;
    public float s1;
    public float s2;
    public float t0;
    public float t1;
    public float t2;
    public float u0;
    public float u1;
    public float u2;
    public float v0;
    public float v1;
    public final ArrayList v2;
    public final Paint w;
    public float w0;
    public float w1;
    public final Paint w2;
    public final Paint x;
    public float x0;
    public float x1;
    public final RectF x2;
    public final Paint y;
    public float y0;
    public float y1;
    public final s33 y2;
    public float z0;
    public boolean z1;
    public final float[] z2;
    public static final float s3 = gl.L(19.0f);
    public static final float t3 = gl.L(3.0f);
    public static final float v3 = gl.L(3.0f);
    public static final float w3 = gl.N(0.5f);
    public static final float x3 = gl.L(6.0f);
    public static final s33 C3 = new s33(0.3d, 0.0d, 0.2d, 1.0d);
    public static final s33 D3 = bn3.J;

    public yic(Context context, wjb wjbVar, c5a c5aVar) {
        super(context);
        this.c = new om3();
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        this.h = kk7.d4;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        this.w = new Paint(1);
        this.x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        this.E = new Matrix();
        this.K = -1.0f;
        this.L = -1.0f;
        this.Q = kk7.d4;
        this.f0 = -1;
        this.i0 = new RectF();
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.B0 = -1.0f;
        this.E0 = -1.0f;
        this.G0 = Float.NaN;
        this.L0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.N0 = new Matrix();
        this.O0 = "";
        this.W0 = new Matrix();
        Paint paint3 = new Paint(1);
        this.X0 = paint3;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(gl.N(1.0f));
        this.a1 = new ArrayList();
        this.b1 = new int[0];
        this.c1 = new ArrayList();
        this.d1 = new Paint(1);
        this.f1 = true;
        this.g1 = new Path();
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        this.l1 = Float.NaN;
        this.n1 = k96.M0(2131745069, null);
        this.A1 = new RectF();
        this.B1 = new RectF();
        this.C1 = new RectF();
        this.G1 = gl.L(36.0f);
        this.J1 = new Matrix();
        this.K1 = new TextPaint(1);
        this.L1 = new Matrix();
        this.M1 = new TextPaint(1);
        this.V1 = new Paint(1);
        this.W1 = new Paint(1);
        this.X1 = new Paint(1);
        this.Y1 = new Paint(1);
        this.Z1 = new Matrix();
        this.a2 = new RectF();
        this.h2 = new RectF();
        this.o2 = new float[0];
        this.v2 = new ArrayList();
        this.w2 = new Paint(1);
        this.x2 = new RectF();
        this.y2 = s33.h;
        this.z2 = new float[2];
        this.A2 = new Path();
        this.B2 = new kra(2200);
        this.G2 = 900L;
        this.T2 = new float[0];
        this.U2 = new float[0];
        this.e3 = new Paint();
        this.f3 = new Paint();
        this.g3 = new Paint();
        this.k3 = new Matrix();
        this.m3 = new Matrix();
        this.o3 = new uic(this, (byte) 1);
        this.r3 = new int[2];
        this.b = wjbVar;
        this.a = c5aVar;
        gc gcVar = new gc(context);
        this.G = gcVar;
        gcVar.setCallback(this);
        this.H = context.getResources().getDrawable(R.drawable.send_plane_24).mutate();
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setTypeface(gl.o());
        paint.setStyle(style);
        paint.setStrokeWidth(gl.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        E();
    }

    public static void B(xic xicVar, float f, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f - xicVar.j) / 0.12f));
        float f2 = xicVar.l;
        float f3 = xicVar.d;
        float f4 = f2 - f3;
        if (xicVar.m) {
            fArr[0] = f3;
            fArr[1] = f2 - (f4 * max);
        } else {
            fArr[0] = (f4 * max) + f3;
            fArr[1] = f2;
        }
    }

    public static ArrayList D(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            if (i >= str.length()) {
                break;
            }
            int i2 = i;
            while (i2 < str.length() && !Character.isWhitespace(str.charAt(i2))) {
                i2++;
            }
            arrayList.add(new int[]{i, i2});
            i = i2;
        }
        return arrayList;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return tb4.A(1.0f, (float) Math.exp((-f3) / f4), f2 - f, f);
    }

    public final void A(float f, float f2, float f3, long j, Canvas canvas) {
        kra kraVar;
        float f4;
        float f5;
        xic xicVar;
        float f6;
        char c;
        xic xicVar2;
        int i;
        float f7;
        Canvas canvas2 = canvas;
        float f8 = (j - this.m2) / 1000.0f;
        float f9 = 0.4f;
        float f10 = 1.0f;
        float f11 = 0.0f;
        float interpolation = this.y2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f8 - 0.08f) / 0.4f)));
        int i2 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i2);
        ArrayList arrayList = this.v2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            xic xicVar3 = (xic) arrayList.get(i3);
            if (xicVar3.c) {
                float max = Math.max(f11, Math.min(f10, ((f8 - xicVar3.j) - 0.26f) / 0.12f));
                if (max <= f11) {
                    i3 = i4;
                } else {
                    float L = gl.L(10.0f);
                    float f12 = xicVar3.h;
                    float f13 = xicVar3.k;
                    float f14 = (L + f13) * max;
                    float f15 = f14 + f12;
                    f4 = f9;
                    if (xicVar3.m) {
                        f12 += f13;
                    } else {
                        f14 = gl.L(4.0f);
                    }
                    float f16 = f12 - f14;
                    float max2 = Math.max(f11, Math.min(f10, (((f8 - xicVar3.j) - 0.26f) - 0.12f) / 0.45f));
                    f5 = f10;
                    textPaint.setColor(bm2.f(yjb.B(max2, 2.0f, 3.0f, max2 * max2), this.O, xicVar3.q ? u3 : this.N));
                    textPaint.setAlpha((int) (255.0f * f3 * f5));
                    canvas2.save();
                    canvas2.clipRect(f + f16, (f2 + xicVar3.i) - gl.L(40.0f), xicVar3.m ? f + xicVar3.h + xicVar3.k + gl.L(4.0f) : f + f15, f2 + xicVar3.i + gl.L(20.0f));
                    canvas2.drawText(xicVar3.a, f + xicVar3.h, f2 + xicVar3.i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    xicVar3.n = f + xicVar3.h;
                    xicVar3.o = f2 + xicVar3.i;
                }
            } else {
                f4 = f9;
                f5 = f10;
                if (xicVar3.b) {
                    boolean n = n(xicVar3);
                    float[] fArr = this.z2;
                    if (n) {
                        int indexOf = arrayList.indexOf(xicVar3);
                        int i5 = indexOf;
                        while (!m((xic) arrayList.get(i5))) {
                            i5++;
                        }
                        xic xicVar4 = (xic) arrayList.get(i5);
                        float f17 = this.s2;
                        float f18 = xicVar3.f + f17;
                        float f19 = w3;
                        float f20 = f18 + f19;
                        f6 = 0.5f;
                        float f21 = (f17 + xicVar3.g) - f19;
                        float f22 = this.r2;
                        c = 1;
                        float f23 = xicVar3.d + f22;
                        float f24 = v3;
                        float f25 = f22 + xicVar4.l + f24;
                        RectF rectF = this.x2;
                        rectF.set(f23 - f24, f20, f25, f21);
                        Path path = this.A2;
                        path.rewind();
                        float f26 = x3;
                        xic xicVar5 = xicVar3;
                        path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i6 = this.P;
                        float f27 = f20;
                        Paint paint = this.w2;
                        paint.setColor(i6);
                        paint.setAlpha((int) (Color.alpha(this.P) * f3));
                        int i7 = indexOf;
                        while (i7 <= i5) {
                            xic xicVar6 = (xic) arrayList.get(i7);
                            B(xicVar6, f8, fArr);
                            float f28 = fArr[1];
                            float f29 = fArr[0];
                            if (f28 - f29 < 0.5f) {
                                xicVar2 = xicVar5;
                                i = i5;
                                f7 = f27;
                            } else {
                                if (f29 <= xicVar6.d + 0.5f && i7 == indexOf) {
                                    f29 -= f24;
                                }
                                if (f28 >= xicVar6.l - 0.5f && i7 == i5) {
                                    f28 += f24;
                                }
                                float f30 = this.r2;
                                float f31 = f30 + f29;
                                float f32 = f30 + f28;
                                xicVar2 = xicVar5;
                                i = i5;
                                f7 = f27;
                                canvas2 = canvas;
                                canvas2.drawRect(f31, f7, f32, f21, paint);
                            }
                            i7++;
                            f27 = f7;
                            i5 = i;
                            xicVar5 = xicVar2;
                        }
                        xicVar = xicVar5;
                        canvas2.restore();
                    } else {
                        xicVar = xicVar3;
                        f6 = 0.5f;
                        c = 1;
                    }
                    B(xicVar, f8, fArr);
                    if (Math.min(fArr[c], (xicVar.d + xicVar.k) + gl.L(4.0f)) - Math.max(fArr[0], xicVar.d - gl.L(4.0f)) >= f6) {
                        canvas2.save();
                        float f33 = this.r2;
                        float f34 = fArr[0];
                        float f35 = xicVar.d;
                        if (f34 <= f35 + f6) {
                            f34 = f35 - gl.L(4.0f);
                        }
                        float f36 = f33 + f34;
                        float L2 = (this.s2 + xicVar.f) - gl.L(4.0f);
                        float f37 = this.r2;
                        float f38 = fArr[c];
                        if (f38 >= xicVar.l - f6) {
                            f38 = xicVar.d + xicVar.k + gl.L(4.0f);
                        }
                        canvas2.clipRect(f36, L2, f37 + f38, this.s2 + xicVar.g + gl.L(4.0f));
                        textPaint.setColor(u3);
                        textPaint.setAlpha((int) (f3 * 255.0f));
                        canvas2.drawText(xicVar.a, this.r2 + xicVar.d, this.s2 + xicVar.e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                    }
                } else {
                    float f39 = this.r2;
                    float f40 = xicVar3.d;
                    float f41 = ((((f + xicVar3.h) - f39) - f40) * interpolation) + f39 + f40;
                    float f42 = this.s2;
                    float f43 = xicVar3.e;
                    float f44 = ((((f2 + xicVar3.i) - f42) - f43) * interpolation) + f42 + f43;
                    textPaint.setColor((this.l2 || !xicVar3.q) ? this.N : u3);
                    textPaint.setAlpha((int) (255.0f * f3 * f5));
                    canvas2.drawText(xicVar3.a, f41, f44, textPaint);
                    textPaint.setColor(this.N);
                    xicVar3.n = f41;
                    xicVar3.o = f44;
                }
            }
            f10 = f5;
            i3 = i4;
            f9 = f4;
            f11 = 0.0f;
        }
        float f45 = f9;
        textPaint.setAlpha(kk7.d4);
        float f46 = gl.p;
        while (true) {
            int i8 = this.q2;
            int i9 = this.p2;
            kraVar = this.B2;
            if (i8 >= i9) {
                break;
            }
            float[] fArr2 = this.o2;
            int i10 = i8 * 3;
            if (fArr2[i10 + 2] > f8) {
                break;
            }
            this.q2 = i8 + 1;
            float f47 = f + fArr2[i10];
            float f48 = f2 + fArr2[i10 + 1];
            RectF rectF2 = this.j0;
            if (f48 >= rectF2.top && f48 <= rectF2.bottom) {
                double d = kraVar.d() * 3.141592653589793d * 2.0d;
                float d2 = ((kraVar.d() * 18.0f) + 8.0f) * f46;
                this.B2.h((((float) Math.cos(d)) * d2) + f47, b00.w((float) Math.sin(d), d2, 0.7f, f48), f47, f48, ((kraVar.d() * f45) + 0.8f) * 0.26f);
            }
        }
        if (f8 >= this.n2) {
            this.k2 = false;
            arrayList.clear();
            kraVar.Q = gl.L(10.0f);
        }
    }

    public final boolean C(xic xicVar, boolean z) {
        float L;
        float L2;
        if (z) {
            L = xicVar.f;
            L2 = xicVar.g;
        } else {
            L = xicVar.i - gl.L(14.0f);
            L2 = xicVar.i + gl.L(4.0f);
        }
        if (L2 >= this.Q2 - gl.L(2.0f)) {
            return L <= (Math.max(1.0f, this.R2) + this.Q2) + ((float) gl.L(2.0f));
        }
        return false;
    }

    public final void E() {
        int i = bkb.c6;
        wjb wjbVar = this.b;
        int v0 = bkb.v0(i, wjbVar);
        boolean c = om3.c(v0);
        this.M = c;
        om3 om3Var = this.c;
        if (om3Var.h != c) {
            om3Var.h = c;
        }
        int v02 = bkb.v0(bkb.Oe, wjbVar) | (-16777216);
        om3.h(v02);
        om3Var.g(-6440822, v02);
        this.N = bkb.v0(bkb.Ke, wjbVar) | (-16777216);
        boolean z = this.M;
        this.O = z ? bm2.f(0.12f, v02, -1) : jm3.v(v02, v0, z);
        B3 = this.M ? gl.L(7.0f) : 0.0f;
        this.P = bkb.p1(this.M ? 0.18f : 0.14f, this.O);
        u3 = this.O;
        this.d.setColor(this.N);
        int v03 = bkb.v0(bkb.Le, wjbVar);
        TextPaint textPaint = this.e;
        textPaint.setColor(v03);
        this.Q = Color.alpha(textPaint.getColor());
        int v04 = bkb.v0(bkb.F6, wjbVar);
        TextPaint textPaint2 = this.n;
        textPaint2.setColor(v04);
        int color = textPaint2.getColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.x.setColor(v02);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.w.setColor(this.O);
        this.r.setColor(this.M ? -651810255 : -335544321);
        this.s.setColor(this.M ? 654311423 : 335544320);
        il0 il0Var = this.I;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.J;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        this.R0 = null;
        this.M0 = null;
        this.l3 = null;
        this.S1 = null;
        this.I1 = null;
        textPaint.setShader(null);
        invalidate();
    }

    public final void F() {
        int i;
        int v0;
        int[] iArr;
        if (this.M0 == null) {
            int[] iArr2 = this.c.B;
            boolean z = this.M;
            wjb wjbVar = this.b;
            if (z) {
                i = bkb.Le;
                v0 = om3.d(bkb.v0(i, wjbVar));
            } else {
                i = bkb.Le;
                v0 = bkb.v0(i, wjbVar);
            }
            int i2 = v0 | (-16777216);
            int e = this.M ? om3.e(-7359233) : bm2.f(0.55f, iArr2[0], iArr2[4]);
            int e2 = this.M ? om3.e(-7411982) : bm2.f(0.55f, iArr2[1], iArr2[4]);
            int e3 = this.M ? om3.e(-4940545) : bm2.f(0.55f, iArr2[2], iArr2[4]);
            if (this.M) {
                int e4 = om3.e(-7359233);
                int e5 = om3.e(-5650177);
                iArr = new int[]{bm2.f(0.4f, i2, e4), bm2.f(0.3f, i2, e5), bm2.f(0.4f, i2, e4), bm2.f(0.3f, i2, e5)};
            } else {
                int v02 = bkb.v0(i, wjbVar);
                int alpha = Color.alpha(v02);
                int[] iArr3 = new int[4];
                iArr3[0] = e;
                iArr3[1] = e2;
                iArr3[2] = e3;
                iArr3[3] = e;
                for (int i3 = 0; i3 < 4; i3++) {
                    iArr3[i3] = bm2.o(bm2.f(0.12f, v02 | (-16777216), iArr3[i3]), alpha);
                }
                iArr = iArr3;
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR);
            this.M0 = linearGradient;
            TextPaint textPaint = this.e;
            textPaint.setShader(linearGradient);
            textPaint.setColor(-1);
            this.Q = kk7.d2;
        }
        float L = gl.L(this.M ? 260.0f : 160.0f);
        Matrix matrix = this.N0;
        matrix.setScale(L, 1.0f);
        matrix.postTranslate(((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L, 0.0f);
        this.M0.setLocalMatrix(matrix);
    }

    public final StaticLayout b(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.max(1, this.Z0)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public final void c(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        if (this.M) {
            LinearGradient linearGradient = this.S1;
            Paint paint = this.W1;
            Paint paint2 = this.V1;
            Paint paint3 = this.X1;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{om3.e(-7447553), om3.e(-13649665), om3.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
                this.S1 = linearGradient2;
                paint2.setShader(linearGradient2);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
                this.T1 = radialGradient;
                paint.setShader(radialGradient);
                LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                this.U1 = linearGradient3;
                paint3.setShader(linearGradient3);
                paint3.setStyle(Paint.Style.STROKE);
            }
            float f5 = (j % 5000) / 5000.0f;
            Matrix matrix = this.Z1;
            matrix.setTranslate(4.0f * f5, 0.0f);
            float f6 = 2.6f * f3;
            matrix.postScale(f6, f6);
            matrix.postRotate(35.0f);
            matrix.postTranslate(f, f2);
            this.S1.setLocalMatrix(matrix);
            int i = (int) (255.0f * f4);
            paint2.setAlpha(i);
            canvas.drawCircle(f, f2, f3, paint2);
            float sin = 0.06f * f3 * ((float) Math.sin(f5 * 3.141592653589793d * 2.0d));
            float f7 = 0.62f * f3;
            matrix.setScale(1.35f * f3, f7);
            matrix.postTranslate(f + sin, f2 - f7);
            this.T1.setLocalMatrix(matrix);
            paint.setAlpha(i);
            canvas.drawCircle(f, f2, f3, paint);
            matrix.setScale(f3, f3);
            matrix.postTranslate(f, f2);
            this.U1.setLocalMatrix(matrix);
            paint3.setStrokeWidth(Math.max(1.0f, gl.N(0.8f)));
            paint3.setAlpha(i);
            canvas.drawCircle(f, f2, f3 - gl.N(0.4f), paint3);
        }
    }

    public final void d(Canvas canvas, il0 il0Var, RectF rectF, float f) {
        float height = rectF.height() / 2.0f;
        if (il0Var != null) {
            il0Var.r(height);
            il0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            il0Var.setAlpha((int) (f * 255.0f));
            il0Var.draw(canvas);
            return;
        }
        int i = this.M ? kk7.t3 : kk7.K3;
        Paint paint = this.r;
        paint.setAlpha((int) (i * f));
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    public final void e(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5;
        float f6;
        RectF rectF;
        float f7;
        PorterDuff.Mode mode;
        c5a c5aVar;
        float f8;
        float f9;
        float f10;
        boolean z2;
        int i;
        this.y1 = a(this.y1, this.o1 != null ? 1.0f : 0.0f, f2, 0.09f);
        this.r1 = this.o1;
        String str = this.q1;
        int i2 = this.G1;
        RectF rectF2 = this.j0;
        TextPaint textPaint = this.n;
        if (str != null) {
            f3 = 18.0f;
            f4 = 6.0f;
            if (textPaint.measureText(this.o1) + gl.L(6.0f) + gl.L(18.0f) + gl.L(12.0f) + gl.L(8.0f) + gl.L(8.0f) + gl.L(13.0f) > (rectF2.right - (((rectF2.left + gl.L(2.0f)) + i2) + gl.L(8.0f))) - ((this.T || !z) ? 0.0f : (textPaint.measureText(k96.M0(2131745448, null)) + (gl.L(8.0f) + (gl.L(22.0f) + (gl.L(12.0f) + gl.L(8.0f))))) + gl.L(16.0f))) {
                this.r1 = this.q1;
            }
        } else {
            f3 = 18.0f;
            f4 = 6.0f;
        }
        String str2 = this.r1;
        String str3 = this.n1;
        if (str2 == null) {
            str2 = str3;
        }
        float measureText = textPaint.measureText(str2);
        float f11 = this.x1;
        if (f11 <= 0.0f) {
            f5 = 22.0f;
        } else {
            f5 = 22.0f;
            measureText = a(f11, measureText, f2, 0.11f);
        }
        this.x1 = measureText;
        float L = gl.L(36.0f);
        float L2 = rectF2.top - gl.L(8.0f);
        float f12 = this.s1;
        float B = yjb.B(f12, 2.0f, 3.0f, f12 * f12);
        int color = textPaint.getColor();
        float L3 = rectF2.left + gl.L(2.0f);
        float f13 = L2 - L;
        RectF rectF3 = this.B1;
        rectF3.set(L3, f13, i2 + L3, L2);
        il0 il0Var = this.O1;
        c5a c5aVar2 = this.a;
        if (il0Var == null) {
            this.O1 = c5aVar2.h(this);
        }
        canvas.save();
        float f14 = 1.0f - B;
        canvas.translate(0.0f, gl.L(f4) * f14);
        float f15 = (B * 0.1f) + 0.9f;
        float B2 = yjb.B(this.u1, 0.06f, 1.0f, f15);
        canvas.scale(B2, B2, rectF3.centerX(), rectF3.centerY());
        d(canvas, this.O1, rectF3, f);
        Drawable drawable = this.E1;
        if (drawable == null) {
            drawable = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
            this.E1 = drawable;
        }
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
        this.E1.setAlpha((int) (f * 255.0f));
        int centerX = (int) rectF3.centerX();
        int centerY = (int) rectF3.centerY();
        int L4 = gl.L(18.5f);
        float f16 = centerX;
        float f17 = L4 / 2.0f;
        float f18 = f16 - f17;
        float f19 = centerY - f17;
        this.E1.setBounds(Math.round(f18), Math.round(f19), Math.round(f18) + L4, Math.round(f19) + L4);
        this.E1.draw(canvas);
        canvas.restore();
        float L5 = rectF3.right + gl.L(8.0f);
        float f20 = this.x1;
        if (f20 <= 0.0f) {
            String str4 = this.r1;
            if (str4 == null) {
                str4 = str3;
            }
            f20 = textPaint.measureText(str4);
        }
        float L6 = gl.L(f4) + gl.L(f3) + gl.L(12.0f) + f20 + gl.L(8.0f) + gl.L(8.0f) + gl.L(13.0f) + L5;
        RectF rectF4 = this.A1;
        rectF4.set(L5, f13, L6, L2);
        float max = Math.max(0.0f, 1.0f - (this.a0 * 2.0f));
        if (max < 0.01f && !this.z1) {
            rectF4.setEmpty();
        }
        if (this.z1 || max < 0.01f) {
            f6 = f13;
            rectF = rectF4;
            f7 = 0.01f;
            mode = mode2;
            c5aVar = c5aVar2;
            f8 = L2;
            f9 = 0.0f;
        } else {
            float f21 = max * f;
            if (this.N1 == null) {
                this.N1 = c5aVar2.h(this);
            }
            canvas.save();
            canvas.translate(0.0f, gl.L(f4) * f14);
            float B4 = yjb.B(this.t1, 0.04f, 1.0f, f15);
            canvas.scale(B4, B4, rectF4.left + gl.L(f3), rectF4.bottom);
            d(canvas, this.N1, rectF4, f21);
            if (this.D1 == null) {
                this.D1 = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
            }
            int color2 = textPaint.getColor();
            float centerY2 = rectF4.centerY();
            f7 = 0.01f;
            this.D1.setColorFilter(new PorterDuffColorFilter(color2, mode2));
            float f22 = f21 * 255.0f;
            int i3 = (int) f22;
            this.D1.setAlpha(i3);
            int L7 = (int) (rectF4.left + gl.L(12.0f));
            int L8 = (int) (centerY2 - gl.L(9.0f));
            mode = mode2;
            c5aVar = c5aVar2;
            f6 = f13;
            this.D1.setBounds(L7, L8, gl.L(f3) + L7, gl.L(f3) + L8);
            this.D1.draw(canvas);
            float L9 = (rectF4.right - gl.L(13.0f)) - gl.L(4.0f);
            canvas.save();
            canvas.clipRect(rectF4.left, rectF4.top, L9 - gl.L(8.0f), rectF4.bottom);
            int alpha = textPaint.getAlpha();
            float L10 = rectF4.left + gl.L(12.0f) + gl.L(f3) + gl.L(f4);
            boolean z4 = this.o1 == null && this.y1 < 0.99f;
            TextPaint textPaint2 = this.M1;
            if (z4) {
                z2 = z4;
                if (this.H1 == null) {
                    f8 = L2;
                    this.H1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                    textPaint2.setTypeface(textPaint.getTypeface());
                } else {
                    f8 = L2;
                }
                textPaint2.setTextSize(textPaint.getTextSize());
                float measureText2 = textPaint.measureText(str3);
                float L11 = gl.L(36.0f);
                f10 = L9;
                rectF = rectF4;
                float min = (Math.min(1.0f, (SystemClock.uptimeMillis() % 2200) / 1100.0f) * ((L11 * 2.0f) + measureText2)) + (L10 - L11);
                Matrix matrix = this.L1;
                matrix.setScale(L11, 1.0f);
                matrix.postTranslate(min - (L11 / 2.0f), 0.0f);
                this.H1.setLocalMatrix(matrix);
                postInvalidateOnAnimation();
            } else {
                f10 = L9;
                rectF = rectF4;
                z2 = z4;
                f8 = L2;
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f23 = centerY2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            if (z2 && this.M) {
                if (this.I1 == null) {
                    int color3 = textPaint.getColor() | (-16777216);
                    int f24 = bm2.f(0.4f, color3, om3.e(-7359233));
                    this.I1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f24, bm2.f(0.28f, color3, om3.e(-5650177)), f24}, (float[]) null, Shader.TileMode.MIRROR);
                }
                float L12 = gl.L(200.0f);
                Matrix matrix2 = this.J1;
                matrix2.setScale(L12, 1.0f);
                i = i3;
                matrix2.postTranslate((((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L12) + L10, 0.0f);
                this.I1.setLocalMatrix(matrix2);
                Typeface typeface = textPaint.getTypeface();
                TextPaint textPaint3 = this.K1;
                textPaint3.setTypeface(typeface);
                textPaint3.setTextSize(textPaint.getTextSize());
                textPaint3.setShader(this.I1);
                textPaint3.setAlpha((int) ((1.0f - this.y1) * 0.62f * f22));
                canvas.drawText(str3, L10, f23, textPaint3);
                float f25 = this.y1;
                if (f25 > 0.01f && this.o1 != null) {
                    textPaint.setAlpha((int) (f25 * f22));
                    canvas.drawText(this.r1, L10, f23, textPaint);
                }
            } else {
                i = i3;
                textPaint.setAlpha((int) yjb.z(this.y1, 0.5f, 0.5f, f22));
                String str5 = this.r1;
                if (str5 == null) {
                    str5 = str3;
                }
                canvas.drawText(str5, L10, f23, textPaint);
            }
            if (z2 && SystemClock.uptimeMillis() % 2200 < 1100) {
                textPaint2.setShader(this.H1);
                textPaint2.setAlpha((int) ((1.0f - this.y1) * f22 * 0.55f));
                canvas.drawText(str3, L10, f23, textPaint2);
            }
            textPaint.setAlpha(alpha);
            canvas.restore();
            Path path = this.g1;
            boolean isEmpty = path.isEmpty();
            Paint paint = this.h1;
            if (isEmpty) {
                path.moveTo(-gl.N(3.8f), gl.N(1.9f));
                f9 = 0.0f;
                path.lineTo(0.0f, -gl.N(1.9f));
                path.lineTo(gl.N(3.8f), gl.N(1.9f));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(gl.N(1.75f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else {
                f9 = 0.0f;
            }
            paint.setColor(color2);
            paint.setAlpha(i);
            canvas.save();
            canvas.translate(f10, centerY2);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        }
        float a = a(this.w1, (this.T || !z) ? f9 : 1.0f, f2, 0.1f);
        this.w1 = a;
        RectF rectF5 = this.C1;
        if (a <= f7) {
            rectF5.setEmpty();
            return;
        }
        String M0 = k96.M0(2131745448, null);
        float L13 = rectF.right + gl.L(8.0f);
        rectF5.set(L13, f6, textPaint.measureText(M0) + gl.L(12.0f) + L13 + gl.L(f5) + gl.L(8.0f) + gl.L(16.0f), f8);
        if (this.P1 == null) {
            this.P1 = c5aVar.h(this);
        }
        float f26 = this.w1;
        float B5 = yjb.B(f26, 2.0f, 3.0f, f26 * f26);
        float f27 = f26 * f;
        canvas.save();
        float B6 = yjb.B(this.v1, 0.04f, 1.0f, (B5 * 0.15f) + 0.85f);
        canvas.scale(B6, B6, rectF5.left, rectF5.centerY());
        d(canvas, this.P1, rectF5, f27);
        Drawable drawable2 = this.F1;
        if (drawable2 == null) {
            drawable2 = getContext().getResources().getDrawable(R.drawable.voice_field_send_text).mutate();
            this.F1 = drawable2;
        }
        drawable2.setColorFilter(new PorterDuffColorFilter(color, mode));
        int i4 = (int) (f27 * 255.0f);
        this.F1.setAlpha(i4);
        int L14 = (int) (rectF5.left + gl.L(12.0f));
        int centerY3 = (int) (rectF5.centerY() - gl.L(11.0f));
        this.F1.setBounds(L14, centerY3, gl.L(f5) + L14, gl.L(f5) + centerY3);
        this.F1.draw(canvas);
        int alpha2 = textPaint.getAlpha();
        textPaint.setAlpha(i4);
        Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
        canvas.drawText(M0, rectF5.left + gl.L(12.0f) + gl.L(f5) + gl.L(8.0f), rectF5.centerY() - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f), textPaint);
        textPaint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void f(Canvas canvas, float f) {
        float f2;
        float f3;
        Canvas canvas2;
        float L;
        float f4 = this.a0;
        float L2 = gl.L(36.0f);
        String M0 = k96.M0(this.b2 ? 2131745063 : 2131745064, null);
        float i = i();
        RectF rectF = this.j0;
        float L3 = rectF.left + gl.L(2.0f);
        float L4 = rectF.top - gl.L(8.0f);
        if (this.a.y()) {
            f2 = 2.0f;
            float L5 = this.G1 + L3 + gl.L(8.0f);
            f3 = 8.0f;
            if (i() + ((!this.c2 || this.b2) ? 0 : gl.L(36.0f) + gl.L(6.0f)) + L5 <= rectF.right - gl.L(56.0f)) {
                L = 0.0f;
                L3 = L5;
            } else {
                L = gl.L(8.0f) + L2;
            }
            if (Float.isNaN(this.l1)) {
                this.l1 = L3;
                this.m1 = L;
            } else {
                this.l1 = a(this.l1, L3, 0.016f, 0.07f);
                this.m1 = a(this.m1, L, 0.016f, 0.07f);
                if (Math.abs(this.l1 - L3) > 0.5f || Math.abs(this.m1 - L) > 0.5f) {
                    postInvalidateOnAnimation();
                }
            }
            if (this.a0 < 0.01f) {
                this.l1 = Float.NaN;
            }
            if (!Float.isNaN(this.l1)) {
                L3 = this.l1;
            }
            if (!Float.isNaN(this.l1)) {
                L = this.m1;
            }
            L4 -= L;
        } else {
            f2 = 2.0f;
            f3 = 8.0f;
        }
        RectF rectF2 = this.k0;
        rectF2.set(L3, L4 - L2, i + L3, L4);
        float f5 = 1.0f - f4;
        float pow = 1.0f - ((float) Math.pow(f5, 3.0d));
        float min = 1.0f - Math.min(1.0f, f4 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f4 / 0.8f) * 3.141592653589793d)) * 0.07f * f5) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L2;
        float f6 = L2 * 0.62f;
        float max = Math.max(sin, ((rectF2.width() - f6) * pow) + f6);
        float f7 = rectF2.left;
        float f8 = rectF2.bottom;
        RectF rectF3 = this.m0;
        rectF3.set(f7, f8 - sin, max + f7, f8);
        float min2 = Math.min(1.0f, 3.0f * f4) * f;
        float max2 = Math.max(0.0f, Math.min(1.0f, (f4 - 0.62f) / 0.38f)) * f;
        float f9 = 1.0f - (this.d0 * 0.04f);
        canvas.save();
        canvas.scale(f9, f9, rectF2.left + gl.L(18.0f), rectF2.bottom);
        float height = rectF3.height() / f2;
        if (this.J != null) {
            if (Math.abs(this.L - height) > 0.5f) {
                this.L = height;
                this.J.r(height);
            }
            this.J.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
            this.J.setAlpha((int) (min2 * 255.0f));
            this.J.draw(canvas);
        } else {
            int i2 = this.M ? kk7.t3 : kk7.K3;
            Paint paint = this.r;
            paint.setAlpha((int) (i2 * min2));
            canvas.drawRoundRect(rectF3, height, height, paint);
            Paint paint2 = this.s;
            paint2.setAlpha((int) ((this.M ? 38 : 20) * min2));
            canvas.drawRoundRect(rectF3, height, height, paint2);
        }
        if (max2 > 0.0f) {
            float centerY = rectF2.centerY();
            float L6 = rectF2.left + gl.L(12.0f);
            int i3 = (int) L6;
            gc gcVar = this.G;
            gcVar.setBounds(i3, (int) (centerY - gl.L(12.0f)), gl.L(24.0f) + i3, (int) (gl.L(12.0f) + centerY));
            int i4 = (int) (255.0f * max2);
            gcVar.setAlpha(i4);
            gcVar.draw(canvas);
            TextPaint textPaint = this.n;
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i4);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(M0, L6 + gl.L(6.0f) + gl.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / f2), textPaint);
            textPaint.setAlpha(alpha);
            Path path = this.g1;
            boolean isEmpty = path.isEmpty();
            Paint paint3 = this.h1;
            if (isEmpty) {
                path.moveTo(-gl.N(3.8f), gl.N(1.9f));
                path.lineTo(0.0f, -gl.N(1.9f));
                path.lineTo(gl.N(3.8f), gl.N(1.9f));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(gl.N(1.75f));
                paint3.setStrokeCap(Paint.Cap.ROUND);
                paint3.setStrokeJoin(Paint.Join.ROUND);
            }
            float L7 = (((rectF2.right - gl.L(10.0f)) - gl.L(14.0f)) - gl.L(f3)) - gl.L(1.0f);
            this.j1 = L7;
            int p1 = bkb.p1(max2 * 0.14f, textPaint.getColor());
            Paint paint4 = this.i1;
            paint4.setColor(p1);
            canvas2 = canvas;
            canvas2.drawRect(L7, rectF2.centerY() - gl.L(10.0f), gl.L(1.0f) + L7, rectF2.centerY() + gl.L(10.0f), paint4);
            paint3.setColor(textPaint.getColor());
            paint3.setAlpha(i4);
            canvas2.save();
            canvas2.translate((rectF2.right - gl.L(10.0f)) - gl.L(7.0f), rectF2.centerY());
            canvas2.drawPath(path, paint3);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void g(Canvas canvas, float f) {
        float a = a(this.f2, (!this.c2 || this.b2) ? 0.0f : 1.0f, 0.016f, 0.06f);
        this.f2 = a;
        RectF rectF = this.h2;
        if (a < 0.01f) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.i2;
        c5a c5aVar = this.a;
        if (drawable == null) {
            this.i2 = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
            il0 h = c5aVar.h(this);
            this.j2 = h;
            if (h != null) {
                h.r(gl.L(18.0f));
            }
        }
        float L = gl.L(36.0f);
        RectF rectF2 = this.k0;
        rectF.set(rectF2.right + gl.L(6.0f), rectF2.top, rectF2.right + gl.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.a0 - 0.62f) / 0.38f));
        float f2 = this.f2;
        float f3 = f * f2 * max;
        if (f3 >= 0.01f) {
            float w = (1.0f - (this.g2 * 0.06f)) * b00.w(f2, 0.3f, max, 0.7f);
            canvas.save();
            canvas.scale(w, w, rectF.centerX(), rectF.centerY());
            il0 il0Var = this.j2;
            if (il0Var != null) {
                il0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.j2.setAlpha((int) (255.0f * f3));
                this.j2.draw(canvas);
            } else {
                int i = this.M ? kk7.t3 : kk7.K3;
                Paint paint = this.r;
                paint.setAlpha((int) (i * f3));
                float f4 = L / 2.0f;
                canvas.drawRoundRect(rectF, f4, f4, paint);
            }
            ((gjc) c5aVar.e).b.getClass();
            this.i2.setColorFilter(new PorterDuffColorFilter((-16777216) | this.n.getColor(), PorterDuff.Mode.SRC_IN));
            float L2 = gl.L(24.0f) / 2.0f;
            this.i2.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
            this.i2.setAlpha((int) (Color.alpha(r0) * f3));
            this.i2.draw(canvas);
            canvas.restore();
            float f5 = this.f2;
            if (f5 <= 0.01f || f5 >= 0.99f) {
                return;
            }
            postInvalidateOnAnimation();
        }
    }

    public String getShownText() {
        return this.O0;
    }

    public final void h(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.Y1;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f3 * 255.0f));
        float z = yjb.z(f4, 0.3f, 0.7f, gl.N(8.5f));
        RectF rectF = this.a2;
        rectF.set(f - z, f2 - z, f + z, f2 + z);
        long j2 = j - this.R1;
        float f5 = ((j2 % 1400) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f5);
        float B = yjb.B(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f5 - 1.0f);
        float f6 = ((j2 / 1400) % 18) * 220.0f;
        float B2 = (yjb.B(max, 2.0f, 3.0f, max * max) * 220.0f) + f6;
        canvas.drawArc(rectF, (((((j2 % 6000) / 6000.0f) * 360.0f) * 5.0f) + B2) % 360.0f, (((B * 220.0f) + f6) + 30.0f) - B2, false, paint);
    }

    public final float i() {
        return this.n.measureText(k96.M0(this.b2 ? 2131745063 : 2131745064, null)) + gl.L(6.0f) + gl.L(24.0f) + gl.L(12.0f) + gl.L(12.0f) + gl.L(1.0f) + gl.L(8.0f) + gl.L(14.0f) + gl.L(10.0f);
    }

    public final boolean j() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (uptimeMillis - ((wic) obj).c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void k(xic xicVar, ArrayList arrayList, int i) {
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        float[] fArr = (float[]) arrayList.get(i);
        if (Float.isNaN(fArr[0])) {
            return;
        }
        float f = fArr[1] - this.P2;
        float f2 = xicVar.e;
        float f3 = f - f2;
        xicVar.d = fArr[0] - this.O2;
        xicVar.e = f2 + f3;
        xicVar.f += f3;
        xicVar.g += f3;
    }

    public final int l(float f, float f2) {
        if (!this.R || this.W < 0.6f || this.n3 > 0.3f) {
            return -1;
        }
        float L = gl.L(6.0f);
        if (this.s1 > 0.7f) {
            RectF rectF = this.B1;
            if (!rectF.isEmpty() && f >= rectF.left - L && f < rectF.right + gl.L(4.0f) && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                return 7;
            }
            if (!this.T) {
                RectF rectF2 = this.A1;
                if (!rectF2.isEmpty() && !this.z1 && f >= rectF2.left - gl.L(4.0f) && f < rectF2.right + gl.L(4.0f) && f2 >= rectF2.top - L && f2 <= rectF2.bottom + L) {
                    return 6;
                }
            }
            if (this.w1 > 0.7f && !this.T) {
                RectF rectF3 = this.C1;
                if (!rectF3.isEmpty() && f >= rectF3.left - gl.L(4.0f) && f <= rectF3.right + L && f2 >= rectF3.top - L && f2 <= rectF3.bottom + L) {
                    return 8;
                }
            }
        }
        if (this.a0 > 0.7f && this.T0 > 0.7f && !this.b2) {
            RectF rectF4 = this.l0;
            if (!rectF4.isEmpty() && f >= rectF4.left - L && f <= rectF4.right + L && f2 >= rectF4.top - L && f2 <= rectF4.bottom + L) {
                return 0;
            }
        }
        RectF rectF5 = this.h2;
        if (!rectF5.isEmpty() && this.f2 > 0.7f && f >= rectF5.left - L && f <= rectF5.right + L && f2 >= rectF5.top - L && f2 <= rectF5.bottom + L) {
            return 5;
        }
        boolean z = this.b2;
        RectF rectF6 = this.k0;
        if (z && !rectF6.isEmpty() && rectF6.contains(f, f2)) {
            return -1;
        }
        return (this.a0 <= 0.7f || rectF6.isEmpty() || f < rectF6.left - L || f > rectF6.right + L || f2 < rectF6.top - L || f2 > rectF6.bottom + L) ? this.j0.contains(f, f2) ? 2 : -1 : f >= this.j1 ? 4 : 1;
    }

    public final boolean m(xic xicVar) {
        ArrayList arrayList = this.v2;
        int indexOf = arrayList.indexOf(xicVar) + 1;
        xic xicVar2 = indexOf < arrayList.size() ? (xic) arrayList.get(indexOf) : null;
        return xicVar2 == null || !xicVar2.b || Math.abs(xicVar2.f - xicVar.f) >= 1.0f;
    }

    public final boolean n(xic xicVar) {
        ArrayList arrayList = this.v2;
        int indexOf = arrayList.indexOf(xicVar);
        xic xicVar2 = indexOf > 0 ? (xic) arrayList.get(indexOf - 1) : null;
        return xicVar2 == null || !xicVar2.b || Math.abs(xicVar2.f - xicVar.f) >= 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(boolean z, float f) {
        int i;
        ArrayList arrayList;
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            arrayList = this.v2;
            if (i >= arrayList.size()) {
                break;
            }
            xic xicVar = (xic) arrayList.get(i);
            if (z) {
                i = xicVar.b ? i + 1 : 0;
                if (i3 < 0) {
                    i3 = i;
                }
                i5 = i;
            } else {
                if (xicVar.c) {
                }
                if (i3 < 0) {
                }
                i5 = i;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (0; i2 < arrayList.size(); i2 + 1) {
            xic xicVar2 = (xic) arrayList.get(i2);
            if (z) {
                i2 = xicVar2.b ? 0 : i2 + 1;
                if (i5 >= 0 || i2 < i5) {
                    arrayList2.add(xicVar2);
                }
            } else {
                if (!xicVar2.c) {
                }
                if (i5 >= 0) {
                }
                arrayList2.add(xicVar2);
            }
        }
        for (int size = arrayList.size() - 1; size > i5 && i5 >= 0; size--) {
            ((xic) arrayList.get(size)).m = true;
            arrayList2.add((xic) arrayList.get(size));
        }
        int size2 = arrayList2.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList2.get(i7);
            i7++;
            if (C((xic) obj, z)) {
                i6++;
            }
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            xic xicVar3 = (xic) obj2;
            xicVar3.j = b00.A(i4, Math.max(1, i6), 0.16f, f);
            if (C(xicVar3, z)) {
                i4++;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r63) {
        /*
            Method dump skipped, instructions count: 3508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yic.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b;
        int actionMasked = motionEvent.getActionMasked();
        uic uicVar = this.o3;
        int i = 3;
        byte b2 = 2;
        byte b3 = 1;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                removeCallbacks(uicVar);
                int i2 = this.f0;
                if (i2 == 3) {
                    i2 = 2;
                }
                this.f0 = -1;
                if (this.K0) {
                    this.K0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i2 >= 0 && l(motionEvent.getX(), motionEvent.getY()) == i2) {
                    performHapticFeedback(3);
                    c5a c5aVar = this.a;
                    if (i2 == 0) {
                        c5aVar.I();
                        return true;
                    }
                    if (i2 == 1) {
                        gjc gjcVar = (gjc) c5aVar.e;
                        ChatActivityEnterView chatActivityEnterView = gjcVar.b.a;
                        int i3 = ChatActivityEnterView.r7;
                        ArrayList J = chatActivityEnterView.z0().J();
                        gjcVar.l(J.isEmpty() ? ll3.c : J.get(0));
                        return true;
                    }
                    byte b4 = 4;
                    if (i2 == 4) {
                        gjc gjcVar2 = (gjc) c5aVar.e;
                        if (gjcVar2.K != null && !gjcVar2.n.trim().isEmpty()) {
                            c cVar = gjcVar2.b;
                            yic yicVar = gjcVar2.K;
                            ae9 ae9Var = new ae9(c5aVar, (byte) 26);
                            ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                            cja cjaVar = chatActivityEnterView2.c2;
                            RectF rectF = new RectF();
                            rectF.set(yicVar.k0);
                            if (!rectF.isEmpty() && cjaVar != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                                cjaVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                View view = new View(chatActivityEnterView2.getContext());
                                frameLayout.addView(view, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new e57((Object) cVar, (Object) yicVar, (Object) frameLayout, (Object) view, (Object) rectF, (Object) ae9Var, (byte) 8));
                                return true;
                            }
                        }
                    } else if (i2 == 5) {
                        gjc gjcVar3 = (gjc) c5aVar.e;
                        if (gjcVar3.g0 != null && !gjcVar3.i0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (gjcVar3.h0) {
                                gjcVar3.e0 = gjcVar3.g0;
                                gjcVar3.f0 = gjcVar3.b().size();
                            } else {
                                gjcVar3.e0 = null;
                            }
                            gjcVar3.g0 = null;
                            yic yicVar2 = gjcVar3.K;
                            if (yicVar2 != null) {
                                yicVar2.setRevertShown(false);
                                gjcVar3.K.setRebuildNext(true);
                            }
                            gjcVar3.p();
                            yic yicVar3 = gjcVar3.K;
                            if (yicVar3 != null) {
                                yicVar3.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i2 == 6) {
                        gjc gjcVar4 = (gjc) c5aVar.e;
                        if (gjcVar4.K != null && ((b = gjcVar4.c) == 2 || b == 4)) {
                            String[] G = DictationAsr.G();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(k96.M0(2131745072, null));
                            boolean x = DictationAsr.x();
                            int i4 = x ? 0 : -1;
                            for (int i5 = 0; i5 < G.length; i5++) {
                                arrayList.add(jm3.r(G[i5]));
                                if (!x && i4 < 0 && DictationAsr.z(G[i5])) {
                                    i4 = i5 + 1;
                                }
                            }
                            zic zicVar = new zic(gjcVar4, G, b3);
                            c cVar2 = gjcVar4.b;
                            yic yicVar4 = gjcVar4.K;
                            ArrayList w = gjc.w(G, x, zicVar);
                            ChatActivityEnterView chatActivityEnterView3 = cVar2.a;
                            cja cjaVar2 = chatActivityEnterView3.c2;
                            RectF rectF2 = new RectF();
                            rectF2.set(yicVar4.A1);
                            if (!rectF2.isEmpty() && cjaVar2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView3.getContext());
                                cjaVar2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                View view2 = new View(chatActivityEnterView3.getContext());
                                frameLayout2.addView(view2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new nx1(cVar2, yicVar4, frameLayout2, view2, rectF2, arrayList, w, i4, zicVar));
                                return true;
                            }
                        }
                    } else if (i2 == 7) {
                        gjc gjcVar5 = (gjc) c5aVar.e;
                        c cVar3 = gjcVar5.b;
                        byte b5 = gjcVar5.c;
                        if (b5 == 4) {
                            gjcVar5.t();
                            mu1 mu1Var = cVar3.a.F3;
                            if (mu1Var != null) {
                                mu1Var.presentFragment(new zka());
                                return true;
                            }
                        } else if (b5 == 2) {
                            cVar3.e();
                            gl.e3(new bjc(gjcVar5, b2), 300L);
                            return true;
                        }
                    } else {
                        if (i2 == 8) {
                            c5aVar.I();
                            return true;
                        }
                        gjc gjcVar6 = (gjc) c5aVar.e;
                        c cVar4 = gjcVar6.b;
                        if (gjcVar6.K != null && gjcVar6.c != 0) {
                            ChatActivityEnterView chatActivityEnterView4 = cVar4.a;
                            ChatActivityEnterView chatActivityEnterView5 = cVar4.a;
                            cja cjaVar3 = chatActivityEnterView4.c2;
                            if (cjaVar3 != null) {
                                EditTextBoldCursor editTextBoldCursor = gjcVar6.X;
                                if (editTextBoldCursor != null) {
                                    editTextBoldCursor.requestFocus();
                                    gl.F3(gjcVar6.X);
                                    return true;
                                }
                                wjb wjbVar = chatActivityEnterView4.L4;
                                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(gjcVar6.a);
                                editTextBoldCursor2.setBackground(null);
                                editTextBoldCursor2.setPadding(0, 0, 0, 0);
                                editTextBoldCursor2.setIncludeFontPadding(false);
                                ex1 ex1Var = chatActivityEnterView5.F0;
                                editTextBoldCursor2.setTextSize(0, ex1Var != null ? ex1Var.getTextSize() : gl.L(18.0f));
                                editTextBoldCursor2.setTextColor(bkb.v0(bkb.Ke, wjbVar));
                                int i6 = bkb.Oe;
                                int i7 = ChatActivityEnterView.r7;
                                editTextBoldCursor2.setCursorColor(chatActivityEnterView5.F0(i6) | (-16777216));
                                zkb.C(editTextBoldCursor2, bkb.kg, wjbVar);
                                zkb.l(editTextBoldCursor2, 36, bkb.lg, wjbVar);
                                editTextBoldCursor2.setCursorSize(gl.L(20.0f));
                                editTextBoldCursor2.setCursorWidth(2.0f);
                                editTextBoldCursor2.setGravity(51);
                                editTextBoldCursor2.setInputType(147457);
                                editTextBoldCursor2.setImeOptions(TLObject.FLAG_28);
                                editTextBoldCursor2.setText(gjcVar6.n);
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                                int size = gjcVar6.b().size();
                                gjcVar6.b0 = size;
                                gjcVar6.Y = size;
                                gjcVar6.Z = editTextBoldCursor2.length();
                                gjcVar6.a0 = "";
                                editTextBoldCursor2.addTextChangedListener(new jf6(gjcVar6, (byte) 23));
                                cjaVar3.addView(editTextBoldCursor2, gjcVar6.K.getParent() == cjaVar3 ? cjaVar3.indexOfChild(gjcVar6.K) + 1 : cjaVar3.getChildCount(), new FrameLayout.LayoutParams(1, 1, 51));
                                gjcVar6.X = editTextBoldCursor2;
                                editTextBoldCursor2.requestFocus();
                                gl.e3(new mhc(gjcVar6, editTextBoldCursor2, b4), 50L);
                                StringBuilder sb = new StringBuilder("field: editing in place (");
                                sb.append(gjcVar6.n.length());
                                sb.append(" chars, recording ");
                                sb.append(gjcVar6.c == 2 ? "on" : "paused");
                                sb.append(")");
                                Log.d("VoiceLive", sb.toString());
                                gjcVar6.K.invalidate();
                            }
                        }
                    }
                }
            } else if (actionMasked == 2) {
                int i8 = this.f0;
                if ((i8 == 2 || i8 == 3 || this.K0) && this.J0 > 0.0f) {
                    float y = motionEvent.getY() - this.H0;
                    if (!this.K0 && Math.abs(y) > this.L0) {
                        this.K0 = true;
                        this.H0 = motionEvent.getY();
                        this.I0 = this.s0;
                        this.f0 = -1;
                    }
                    if (this.K0) {
                        this.G0 = Math.max(0.0f, Math.min(this.J0, this.I0 - (motionEvent.getY() - this.H0)));
                        invalidate();
                        return true;
                    }
                }
                int i9 = this.f0;
                if (i9 >= 0 && i9 != 3 && l(motionEvent.getX(), motionEvent.getY()) != this.f0) {
                    removeCallbacks(uicVar);
                    this.f0 = -1;
                    invalidate();
                    return true;
                }
            } else if (actionMasked == 3) {
                removeCallbacks(uicVar);
                this.f0 = -1;
                this.K0 = false;
                invalidate();
                return true;
            }
            return true;
        }
        this.K0 = false;
        int l = l(motionEvent.getX(), motionEvent.getY());
        this.f0 = l;
        if (l >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.H0 = motionEvent.getY();
            this.I0 = this.s0;
            int i10 = this.f0;
            if (i10 != 2 || this.T) {
                i = i10;
            } else {
                this.f0 = 3;
            }
            if (i == 0) {
                postDelayed(uicVar, ViewConfiguration.getLongPressTimeout());
            }
            invalidate();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x011d, code lost:
    
        if (r2 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(StaticLayout staticLayout, StaticLayout staticLayout2) {
        this.D2 = false;
        Bitmap bitmap = this.S2;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            bitmap.recycle();
            this.S2 = null;
        }
        if (staticLayout == null || staticLayout2 == null || !this.n0 || staticLayout.getWidth() <= 0 || staticLayout.getHeight() <= 0) {
            return;
        }
        LinearGradient linearGradient = this.h3;
        Paint paint = this.g3;
        if (linearGradient == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.h3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, tileMode);
            this.i3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
            this.j3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
            this.f3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        }
        paint.setColorFilter(new PorterDuffColorFilter(om3.e(this.M ? -7358721 : -15363160), PorterDuff.Mode.SRC_IN));
        this.K2 = this.O2;
        this.L2 = this.P2;
        this.M2 = this.Q2;
        this.N2 = Math.max(1.0f, this.R2);
        try {
            int width = staticLayout.getWidth() + gl.L(4.0f);
            int height = staticLayout.getHeight() + 2;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            this.S2 = Bitmap.createBitmap(width, height, config);
            TextPaint textPaint = this.d;
            textPaint.setAlpha(kk7.d4);
            float f = this.K2;
            this.Z2 = f - ((float) Math.floor(f));
            float f2 = this.L2;
            this.a3 = f2 - ((float) Math.floor(f2));
            Canvas canvas = new Canvas(this.S2);
            canvas.translate(this.Z2, this.a3);
            y(SystemClock.uptimeMillis());
            staticLayout.draw(canvas);
            textPaint.setShader(null);
            this.d3 = this.b2;
            this.V2 = t(1100, this.S2, true);
            this.W2 = 0;
            try {
                bitmap2 = Bitmap.createBitmap(staticLayout2.getWidth() + gl.L(4.0f), Math.max(1, staticLayout2.getHeight()), config);
                staticLayout2.draw(new Canvas(bitmap2));
                this.W2 = t(1000, bitmap2, false);
            } catch (Throwable unused) {
            }
            bitmap2.recycle();
            RectF rectF = this.j0;
            float width2 = rectF.width();
            float centerY = rectF.centerY() - this.L2;
            float f3 = rectF.left;
            float f4 = this.K2;
            float f5 = centerY * 0.9f;
            this.I2 = ((f3 - (0.35f * width2)) - f4) + f5;
            this.J2 = (((width2 * 1.35f) + f3) - f4) + f5;
            this.G2 = Math.max(800L, Math.min(1200L, (Math.max(staticLayout.getLineCount(), staticLayout2.getLineCount()) * 70) + 700));
            float v = v(this.M2 * 0.9f);
            this.b3 = v;
            this.c3 = Math.max(v + 0.12f, v(((this.M2 + this.N2) * 0.9f) + staticLayout.getWidth()) + 0.06f);
            this.Y2 = 0;
            this.X2 = 0;
            kra kraVar = this.B2;
            kraVar.a();
            kraVar.e(this.M);
            kraVar.a = om3.k(this.M);
            kraVar.Q = gl.L(10.0f);
            this.F2 = SystemClock.uptimeMillis();
            float f6 = this.e2;
            if (f6 > 0.05f) {
                this.H2 = Math.max(this.H2, f6);
            }
            this.D2 = true;
        } catch (Throwable unused2) {
        }
    }

    public final void q(Canvas canvas, long j, float f, float f2, float f3, float f4, float f5) {
        float f6;
        kra kraVar;
        float f7 = (j - this.F2) / 1000.0f;
        float r = r(f7);
        float r2 = r(f7 - 0.06f);
        float L = gl.L(22.0f);
        float f8 = -gl.L(8.0f);
        float L2 = gl.L(8.0f) + this.P0.getWidth();
        float f9 = -gl.L(40.0f);
        float L3 = gl.L(40.0f) + this.P0.getHeight();
        canvas.save();
        canvas.translate(f, f2);
        int saveLayer = canvas.saveLayer(f8, f9, L2, L3, null);
        int i = (int) (255.0f * f3);
        this.d.setAlpha(i);
        this.P0.draw(canvas);
        s(this.j3, r2 - gl.L(48.0f), r2);
        LinearGradient linearGradient = this.j3;
        Paint paint = this.g3;
        paint.setShader(linearGradient);
        canvas.drawRect(f8, f9, L2, L3, paint);
        s(this.i3, r2 - L, r2);
        LinearGradient linearGradient2 = this.i3;
        Paint paint2 = this.f3;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f8, f9, L2, L3, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.S2 == null || r - L >= this.J2) {
            f6 = 2.0f;
        } else {
            canvas.save();
            canvas.translate(this.K2, this.L2);
            float max = Math.max(L2, this.S2.getWidth());
            f6 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f8, this.M2 - gl.L(2.0f), max, this.M2 + this.N2 + gl.L(2.0f), null);
            Paint paint3 = this.e3;
            paint3.setAlpha(i);
            canvas.drawBitmap(this.S2, -this.Z2, -this.a3, paint3);
            s(this.h3, r, L + r);
            paint2.setShader(this.h3);
            canvas.drawRect(f8, f9, max, Math.max(L3, gl.L(40.0f) + this.S2.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        }
        float f10 = gl.p;
        long j2 = this.G2;
        float max2 = Math.max(0.05f, Math.min(j2, j2 - (j - this.F2)) / 1000.0f);
        while (true) {
            int i2 = this.X2;
            int i3 = this.V2;
            kraVar = this.B2;
            if (i2 >= i3) {
                break;
            }
            float[] fArr = this.T2;
            int i4 = i2 * 3;
            if (fArr[i4 + 2] > r) {
                break;
            }
            kraVar.g(this.K2 + fArr[i4], this.L2 + fArr[i4 + 1], ((kraVar.d() * 34.0f) + 10.0f) * f10, (-((kraVar.d() * 20.0f) + 6.0f)) * f10, Math.min(max2, (kraVar.d() * 0.3f) + 0.26f), 0.0f);
            this.X2++;
        }
        float f11 = f4 - f2;
        while (true) {
            int i5 = this.Y2;
            if (i5 >= this.W2) {
                break;
            }
            float[] fArr2 = this.U2;
            int i6 = i5 * 3;
            if (fArr2[i6 + 2] > r) {
                break;
            }
            this.Y2 = i5 + 1;
            float f12 = fArr2[i6 + 1];
            if (f12 >= f11 - gl.L(f6) && f12 <= f11 + f5 + gl.L(f6)) {
                float f13 = f + this.U2[i6];
                float f14 = f2 + f12;
                kraVar.h((((kraVar.d() * 16.0f) + 6.0f) * f10) + f13, ((kraVar.d() - 0.5f) * 14.0f * f10) + f14, f13, f14, Math.min(max2, (kraVar.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f7 * 1000.0f >= this.G2) {
            this.D2 = false;
            Bitmap bitmap = this.S2;
            if (bitmap != null) {
                bitmap.recycle();
                this.S2 = null;
            }
        }
    }

    public final float r(float f) {
        float interpolation = D3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f * 1000.0f) / (this.G2 - 60.0f))));
        float f2 = this.I2;
        return tb4.A(this.J2, f2, interpolation, f2);
    }

    public final void s(LinearGradient linearGradient, float f, float f2) {
        float f3 = f / 1.3453624f;
        Matrix matrix = this.k3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, (f2 / 1.3453624f) - f3), 1.0f);
        matrix.postRotate(41.987213f);
        matrix.postTranslate(0.7432941f * f3, f3 * 0.6689647f);
        linearGradient.setLocalMatrix(matrix);
    }

    public void setBusy(boolean z) {
        if (this.b2 == z) {
            return;
        }
        this.b2 = z;
        if (z) {
            this.d2 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? null : charSequence.toString();
        this.o1 = charSequence2;
        int lastIndexOf = (charSequence2 == null || !charSequence2.endsWith(")")) ? -1 : this.o1.lastIndexOf(" (");
        this.q1 = lastIndexOf > 0 ? this.o1.substring(0, lastIndexOf) : null;
        this.r1 = this.o1;
        invalidate();
    }

    public void setLanguagePillHidden(boolean z) {
        this.z1 = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.U = Math.max(0.0f, Math.min(1.0f, f));
    }

    public void setListening(boolean z) {
        this.S = z;
        invalidate();
    }

    public void setPaused(boolean z) {
        if (this.T != z) {
            this.C0 = SystemClock.uptimeMillis();
        }
        this.T = z;
        invalidate();
    }

    public void setPillHidden(boolean z) {
        this.k1 = z;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.p1)) {
            return;
        }
        this.p1 = str;
        this.R0 = null;
        invalidate();
    }

    public void setRebuildNext(boolean z) {
        this.C2 = z;
    }

    public void setRevertShown(boolean z) {
        this.c2 = z;
        invalidate();
    }

    public final int t(int i, Bitmap bitmap, boolean z) {
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(gl.p * 0.8f));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = 90;
            if (i3 >= height) {
                break;
            }
            if (z) {
                float f = i3;
                float f2 = this.M2;
                float f3 = max;
                if (f >= f2 - f3) {
                    if (f > f2 + this.N2 + f3) {
                    }
                }
                i3 += max;
            }
            for (int i5 = 0; i5 < width; i5 += max) {
                if ((iArr[(i3 * width) + i5] >>> 24) > 90) {
                    i4++;
                }
            }
            i3 += max;
        }
        float f4 = i4 > i ? i / i4 : 1.0f;
        int min = Math.min(i4, i + 32) * 3;
        float[] fArr = z ? this.T2 : this.U2;
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < height) {
            if (z) {
                float f5 = i6;
                float f6 = this.M2;
                float f7 = max;
                if (f5 >= f6 - f7) {
                    if (f5 > f6 + this.N2 + f7) {
                    }
                }
                i6 += max;
                i2 = 90;
            }
            int i8 = 0;
            while (i8 < width) {
                if ((iArr[(i6 * width) + i8] >>> 24) > i2) {
                    kra kraVar = this.B2;
                    if (kraVar.d() <= f4) {
                        int i9 = i7 + 1;
                        if (i9 * 3 <= fArr.length) {
                            float f8 = max;
                            float d = ((kraVar.d() - 0.5f) * f8) + i8;
                            float d2 = ((kraVar.d() - 0.5f) * f8) + i6;
                            int i10 = i7 * 3;
                            fArr[i10] = d;
                            fArr[i10 + 1] = d2;
                            fArr[i10 + 2] = (d2 * 0.9f) + d;
                            i7 = i9;
                        }
                    }
                }
                i8 += max;
                i2 = 90;
            }
            i6 += max;
            i2 = 90;
        }
        Integer[] numArr = new Integer[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            numArr[i11] = Integer.valueOf(i11);
        }
        Arrays.sort(numArr, new ml3(fArr, (byte) 3));
        float[] copyOf = Arrays.copyOf(fArr, i7 * 3);
        for (int i12 = 0; i12 < i7; i12++) {
            int i13 = i12 * 3;
            int intValue = numArr[i12].intValue() * 3;
            fArr[i13] = copyOf[intValue];
            fArr[i13 + 1] = copyOf[intValue + 1];
            fArr[i13 + 2] = copyOf[intValue + 2];
        }
        if (z) {
            this.T2 = fArr;
            return i7;
        }
        this.U2 = fArr;
        return i7;
    }

    public final float u(long j) {
        return D3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (j - this.F2) / this.G2)));
    }

    public final float v(float f) {
        float f2 = 0.0f;
        if (this.J2 <= this.I2) {
            return 0.0f;
        }
        float f3 = this.G2 / 1000.0f;
        for (int i = 0; i < 24; i++) {
            float f4 = (f2 + f3) / 2.0f;
            if (r(f4) < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
        return Math.min(f3, this.G2 / 1000.0f);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.G || super.verifyDrawable(drawable);
    }

    public final void w() {
        if (this.Z0 <= 0) {
            return;
        }
        if (this.O0.isEmpty()) {
            this.P0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.O0);
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wic wicVar = (wic) obj;
            int i2 = wicVar.b;
            if (i2 > wicVar.a && i2 <= spannableString.length()) {
                spannableString.setSpan(new pn3(wicVar, (byte) 1), wicVar.a, wicVar.b, 33);
            }
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int[] iArr = this.b1;
            if (i4 >= iArr.length) {
                break;
            }
            int max = Math.max(0, iArr[i3]);
            int min = Math.min(spannableString.length(), this.b1[i4]);
            if (min > max) {
                spannableString.setSpan(new vic((byte) 0), max, min, 33);
            }
            i3 += 2;
        }
        this.P0 = b(spannableString, this.d);
        ArrayList arrayList2 = this.c1;
        arrayList2.clear();
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            int[] iArr2 = this.b1;
            if (i6 >= iArr2.length) {
                return;
            }
            int max2 = Math.max(0, iArr2[i5]);
            int min2 = Math.min(spannableString.length(), this.b1[i6]);
            if (min2 > max2) {
                int lineForOffset = this.P0.getLineForOffset(max2);
                int lineForOffset2 = this.P0.getLineForOffset(min2);
                int i7 = lineForOffset;
                while (i7 <= lineForOffset2) {
                    StaticLayout staticLayout = this.P0;
                    float primaryHorizontal = i7 == lineForOffset ? staticLayout.getPrimaryHorizontal(max2) : staticLayout.getLineLeft(i7);
                    StaticLayout staticLayout2 = this.P0;
                    float primaryHorizontal2 = i7 == lineForOffset2 ? staticLayout2.getPrimaryHorizontal(min2) : staticLayout2.getLineRight(i7);
                    if ((i7 != lineForOffset2 || min2 <= 0 || min2 != this.P0.getLineStart(i7)) && primaryHorizontal2 - primaryHorizontal >= 1.0f) {
                        float f = v3;
                        float lineTop = this.P0.getLineTop(i7);
                        float f2 = w3;
                        arrayList2.add(new RectF(primaryHorizontal - f, lineTop + f2, primaryHorizontal2 + f, this.P0.getLineBottom(i7) - f2));
                    }
                    i7++;
                }
            }
            i5 += 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x066e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(ArrayList arrayList, boolean[] zArr, boolean z) {
        long j;
        ArrayList arrayList2;
        long j2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        ArrayList arrayList5;
        boolean z2;
        String str2;
        float f;
        float f2;
        kra kraVar;
        Bitmap bitmap;
        Bitmap bitmap2;
        kra kraVar2;
        float f3;
        int i;
        kra kraVar3;
        int i2;
        float f4;
        float f5;
        float f6;
        xic xicVar;
        Bitmap bitmap3;
        Bitmap bitmap4;
        ArrayList arrayList6;
        StaticLayout staticLayout;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList7 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            Object[] objArr = zArr != null && i4 < zArr.length && zArr[i4];
            if (objArr == false || z) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                int length = sb.length();
                sb.append((String) arrayList.get(i4));
                if (objArr != false) {
                    if (arrayList7.isEmpty() || ((Integer) b00.f(1, arrayList7)).intValue() < length - 1) {
                        arrayList7.add(Integer.valueOf(length));
                        arrayList7.add(Integer.valueOf(sb.length()));
                    } else {
                        arrayList7.set(arrayList7.size() - 1, Integer.valueOf(sb.length()));
                    }
                }
            }
            i4++;
        }
        int size = arrayList7.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = ((Integer) arrayList7.get(i5)).intValue();
        }
        String sb2 = sb.toString();
        boolean equals = Arrays.equals(iArr, this.b1);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i6 + 1;
            if (i8 >= size) {
                break;
            }
            i7 += Math.max(0, iArr[i8] - iArr[i6]);
            i6 += 2;
        }
        int[] iArr2 = this.b1;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i9 + 1;
            if (i11 >= iArr2.length) {
                break;
            }
            i10 += Math.max(0, iArr2[i11] - iArr2[i9]);
            i9 += 2;
        }
        if (i7 > i10 && sb2.length() <= this.O0.length()) {
            this.f1 = true;
        } else if (sb2.length() > this.O0.length()) {
            this.f1 = false;
        }
        if (sb2.equals(this.O0) && equals) {
            if (!this.C2 || (staticLayout = this.P0) == null) {
                return;
            }
            this.C2 = false;
            p(staticLayout, staticLayout);
            invalidate();
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = this.O0;
        this.b1 = iArr;
        boolean z4 = this.C2;
        ArrayList arrayList8 = this.a1;
        if (z4 && !str3.isEmpty() && !sb2.equals(str3) && this.P0 != null) {
            this.C2 = false;
            arrayList8.clear();
            this.Q0 = null;
            this.b1 = iArr;
            this.O0 = sb2;
            StaticLayout staticLayout2 = this.P0;
            w();
            p(staticLayout2, this.P0);
            invalidate();
            return;
        }
        if (!sb2.equals(str3)) {
            if (sb2.startsWith(str3) || str3.isEmpty()) {
                int min = Math.min(str3.length(), sb2.length());
                int i12 = 0;
                while (i12 < min && str3.charAt(i12) == sb2.charAt(i12)) {
                    i12++;
                }
                for (int size2 = arrayList8.size() - 1; size2 >= 0; size2--) {
                    wic wicVar = (wic) arrayList8.get(size2);
                    if (wicVar.a >= i12 || uptimeMillis - wicVar.c > 1550) {
                        arrayList8.remove(size2);
                    } else if (wicVar.b > i12) {
                        wicVar.b = i12;
                    }
                }
                while (i12 > 0 && !Character.isWhitespace(sb2.charAt(Math.min(i12, sb2.length()) - 1))) {
                    i12--;
                }
                int i13 = 0;
                while (i12 < sb2.length()) {
                    int i14 = i12;
                    while (i14 < sb2.length() && Character.isWhitespace(sb2.charAt(i14))) {
                        i14++;
                    }
                    while (i14 < sb2.length() && !Character.isWhitespace(sb2.charAt(i14))) {
                        i14++;
                    }
                    wic wicVar2 = new wic();
                    wicVar2.a = i12;
                    wicVar2.b = i14;
                    wicVar2.d = i12 < str3.length() ? 1.0f : 0.0f;
                    wicVar2.c = (Math.min(i13, 5) * 40) + uptimeMillis;
                    arrayList8.add(wicVar2);
                    i13++;
                    i12 = i14;
                }
            } else {
                if (this.S || !this.T || this.P0 == null || sb2.isEmpty()) {
                    j = uptimeMillis;
                    arrayList2 = arrayList8;
                    j2 = 1550;
                } else {
                    StaticLayout staticLayout3 = this.P0;
                    j2 = 1550;
                    boolean z5 = this.k2;
                    ArrayList arrayList9 = this.v2;
                    if (z5) {
                        arrayList4 = new ArrayList();
                        int size3 = arrayList9.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj = arrayList9.get(i15);
                            i15++;
                            int i16 = i3;
                            xic xicVar2 = (xic) obj;
                            if (!this.l2 || !xicVar2.b) {
                                float f7 = xicVar2.n;
                                float f8 = xicVar2.o;
                                float[] fArr = new float[2];
                                fArr[i16] = f7;
                                fArr[1] = f8;
                                arrayList4.add(fArr);
                            }
                            i3 = i16;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    int i17 = i3;
                    arrayList9.clear();
                    ArrayList D = D(str3);
                    ArrayList D2 = D(sb2);
                    if (D.size() == D2.size() || D.size() > 400 || D2.size() > 400) {
                        j = uptimeMillis;
                        arrayList2 = arrayList8;
                    } else {
                        boolean z6 = D2.size() < D.size() ? 1 : i17;
                        if (z6 != 0) {
                            str = sb2;
                            arrayList5 = D;
                            z2 = true;
                            str2 = str3;
                        } else {
                            str = str3;
                            arrayList5 = D2;
                            z2 = true;
                            str2 = sb2;
                            D2 = D;
                        }
                        j = uptimeMillis;
                        boolean[] zArr2 = new boolean[arrayList5.size()];
                        arrayList2 = arrayList8;
                        int i18 = i17;
                        int i19 = i18;
                        while (i19 < arrayList5.size()) {
                            int[] iArr3 = (int[]) arrayList5.get(i19);
                            int i20 = i19;
                            if (i18 < D2.size()) {
                                int[] iArr4 = (int[]) D2.get(i18);
                                arrayList6 = D2;
                                int i21 = iArr3[i17];
                                int i22 = iArr4[i17];
                                if (str2.regionMatches(i21, str, i22, iArr4[z2 ? 1 : 0] - i22) && iArr3[z2 ? 1 : 0] - iArr3[i17] == iArr4[z2 ? 1 : 0] - iArr4[i17]) {
                                    i18++;
                                    i19 = i20 + 1;
                                    D2 = arrayList6;
                                }
                            } else {
                                arrayList6 = D2;
                            }
                            zArr2[i20] = z2;
                            i19 = i20 + 1;
                            D2 = arrayList6;
                        }
                        if (i18 == D2.size()) {
                            this.l2 = z6;
                            for (int i23 = i17; i23 < arrayList5.size(); i23++) {
                                int[] iArr5 = (int[]) arrayList5.get(i23);
                                xic xicVar3 = new xic();
                                xicVar3.n = Float.NaN;
                                xicVar3.o = Float.NaN;
                                xicVar3.a = str2.substring(iArr5[i17], iArr5[z2 ? 1 : 0]);
                                boolean z7 = zArr2[i23];
                                xicVar3.b = z7;
                                xicVar3.c = (z6 == 0 && z7) ? z2 ? 1 : 0 : i17;
                                if (z6 != 0) {
                                    int lineForOffset = staticLayout3.getLineForOffset(iArr5[i17]);
                                    xicVar3.d = staticLayout3.getPrimaryHorizontal(iArr5[i17]);
                                    xicVar3.e = staticLayout3.getLineBaseline(lineForOffset);
                                    xicVar3.f = staticLayout3.getLineTop(lineForOffset);
                                    xicVar3.g = staticLayout3.getLineBottom(lineForOffset);
                                    k(xicVar3, arrayList4, i23);
                                }
                                arrayList9.add(xicVar3);
                            }
                            TextPaint textPaint = this.d;
                            kra kraVar4 = this.B2;
                            if (z6 == 0) {
                                int size4 = arrayList9.size();
                                int i24 = i17;
                                int i25 = i24;
                                f = 0.8f;
                                while (i24 < size4) {
                                    Object obj2 = arrayList9.get(i24);
                                    i24++;
                                    xic xicVar4 = (xic) obj2;
                                    if (!xicVar4.c) {
                                        int[] iArr6 = (int[]) D.get(i25);
                                        int lineForOffset2 = staticLayout3.getLineForOffset(iArr6[i17]);
                                        xicVar4.d = staticLayout3.getPrimaryHorizontal(iArr6[i17]);
                                        xicVar4.e = staticLayout3.getLineBaseline(lineForOffset2);
                                        k(xicVar4, arrayList4, i25);
                                        i25++;
                                    }
                                }
                                f2 = 4.0f;
                                this.r2 = this.O2;
                                this.s2 = this.P2;
                                this.m2 = SystemClock.uptimeMillis();
                                this.k2 = z2 ? 1 : 0;
                                kraVar = kraVar4;
                            } else {
                                f = 0.8f;
                                f2 = 4.0f;
                                this.r2 = this.O2;
                                this.s2 = this.P2;
                                this.t2 = this.Q2;
                                this.u2 = Math.max(1.0f, this.R2);
                                SpannableString spannableString = new SpannableString(str3);
                                o(true, 0.0f);
                                for (int i26 = i17; i26 < arrayList9.size(); i26++) {
                                    xic xicVar5 = (xic) arrayList9.get(i26);
                                    float measureText = textPaint.measureText(xicVar5.a);
                                    xicVar5.k = measureText;
                                    xicVar5.l = xicVar5.d + measureText;
                                    if (xicVar5.b) {
                                        int i27 = i26 + 1;
                                        xic xicVar6 = i27 < arrayList9.size() ? (xic) arrayList9.get(i27) : null;
                                        if (xicVar6 != null && xicVar6.b && Math.abs(xicVar6.f - xicVar5.f) < 1.0f) {
                                            xicVar5.l = xicVar6.d;
                                        }
                                    }
                                }
                                kraVar4.a();
                                kraVar4.e(this.M);
                                kraVar4.a = om3.k(this.M);
                                float f9 = 10.0f;
                                kraVar4.Q = gl.L(10.0f);
                                int size5 = arrayList9.size();
                                int i28 = i17;
                                int i29 = i28;
                                while (i29 < size5) {
                                    Object obj3 = arrayList9.get(i29);
                                    i29++;
                                    xic xicVar7 = (xic) obj3;
                                    int indexOf = str3.indexOf(xicVar7.a, i28);
                                    int length2 = xicVar7.a.length() + indexOf;
                                    if (!xicVar7.b) {
                                        spannableString.setSpan(new ForegroundColorSpan(i17), indexOf, length2, 33);
                                    }
                                    i28 = length2;
                                    i17 = 0;
                                }
                                textPaint.setAlpha(kk7.d4);
                                StaticLayout b = b(spannableString, textPaint);
                                try {
                                    bitmap = Bitmap.createBitmap(b.getWidth() + gl.L(4.0f), Math.max(1, b.getHeight()), Bitmap.Config.ARGB_8888);
                                    try {
                                        b.draw(new Canvas(bitmap));
                                        int width = bitmap.getWidth();
                                        int height = bitmap.getHeight();
                                        int[] iArr7 = new int[width * height];
                                        try {
                                            bitmap.getPixels(iArr7, 0, width, 0, 0, width, height);
                                            int i30 = width;
                                            int max = Math.max(1, Math.round(gl.p * 0.8f));
                                            int i31 = 0;
                                            for (int i32 = 0; i32 < height; i32 += max) {
                                                int i33 = 0;
                                                while (i33 < i30) {
                                                    float f10 = f9;
                                                    if ((iArr7[(i32 * i30) + i33] >>> 24) > 90) {
                                                        i31++;
                                                    }
                                                    i33 += max;
                                                    f9 = f10;
                                                }
                                            }
                                            float f11 = f9;
                                            float f12 = i31 > 1400 ? 1400.0f / i31 : 1.0f;
                                            float f13 = gl.p;
                                            int i34 = 0;
                                            while (i34 < height) {
                                                float f14 = i34;
                                                float f15 = this.t2;
                                                bitmap2 = bitmap;
                                                float f16 = max;
                                                if (f14 >= f15 - f16) {
                                                    try {
                                                        if (f14 <= f15 + this.u2 + f16) {
                                                            int i35 = 0;
                                                            while (i35 < i30) {
                                                                int i36 = i30;
                                                                if ((iArr7[(i34 * i30) + i35] >>> 24) <= 90 || kraVar4.d() > f12) {
                                                                    i2 = i35;
                                                                    f4 = f12;
                                                                    kraVar2 = kraVar4;
                                                                } else {
                                                                    float f17 = i35;
                                                                    try {
                                                                        int size6 = arrayList9.size();
                                                                        i2 = i35;
                                                                        int i37 = 0;
                                                                        xic xicVar8 = null;
                                                                        while (i37 < size6) {
                                                                            Object obj4 = arrayList9.get(i37);
                                                                            int i38 = i37 + 1;
                                                                            xic xicVar9 = (xic) obj4;
                                                                            float f18 = f12;
                                                                            if (xicVar9.b && f14 >= xicVar9.f && f14 <= xicVar9.g && f17 >= xicVar9.d - gl.L(2.0f)) {
                                                                                if (xicVar8 != null) {
                                                                                    xicVar = xicVar9;
                                                                                    if (xicVar9.d <= xicVar8.d) {
                                                                                    }
                                                                                } else {
                                                                                    xicVar = xicVar9;
                                                                                }
                                                                                xicVar8 = xicVar;
                                                                            }
                                                                            i37 = i38;
                                                                            f12 = f18;
                                                                        }
                                                                        f4 = f12;
                                                                        float f19 = xicVar8 != null ? xicVar8.j : 0.0f;
                                                                        if (xicVar8 != null) {
                                                                            float f20 = xicVar8.d;
                                                                            f5 = f19;
                                                                            f6 = Math.max(0.0f, Math.min(1.0f, (f17 - f20) / Math.max(1.0f, xicVar8.l - f20)));
                                                                        } else {
                                                                            f5 = f19;
                                                                            f6 = 0.0f;
                                                                        }
                                                                        if (xicVar8 != null && xicVar8.m) {
                                                                            f6 = 1.0f - f6;
                                                                        }
                                                                        kraVar2 = kraVar4;
                                                                    } catch (Throwable unused) {
                                                                        kraVar2 = kraVar4;
                                                                        kraVar = kraVar2;
                                                                        bitmap = bitmap2;
                                                                        if (bitmap != null) {
                                                                            bitmap.recycle();
                                                                        }
                                                                        this.m2 = SystemClock.uptimeMillis();
                                                                        this.k2 = true;
                                                                        arrayList2.clear();
                                                                        xic xicVar10 = null;
                                                                        this.Q0 = null;
                                                                        this.b1 = iArr;
                                                                        this.O0 = sb2;
                                                                        w();
                                                                        if (this.P0 != null) {
                                                                        }
                                                                        invalidate();
                                                                        return;
                                                                    }
                                                                    try {
                                                                        kraVar2.g(((kraVar4.d() - 0.5f) * f16) + this.r2 + f17, ((kraVar4.d() - 0.5f) * f16) + this.s2 + f14, ((kraVar4.d() * 30.0f) + 8.0f) * f13, (-((kraVar4.d() * 26.0f) + f11)) * f13, (kraVar4.d() * 0.34f) + 0.32f, (f6 * 0.12f) + f5);
                                                                    } catch (Throwable unused2) {
                                                                        kraVar = kraVar2;
                                                                        bitmap = bitmap2;
                                                                        if (bitmap != null) {
                                                                        }
                                                                        this.m2 = SystemClock.uptimeMillis();
                                                                        this.k2 = true;
                                                                        arrayList2.clear();
                                                                        xic xicVar102 = null;
                                                                        this.Q0 = null;
                                                                        this.b1 = iArr;
                                                                        this.O0 = sb2;
                                                                        w();
                                                                        if (this.P0 != null) {
                                                                        }
                                                                        invalidate();
                                                                        return;
                                                                    }
                                                                }
                                                                i35 = i2 + max;
                                                                kraVar4 = kraVar2;
                                                                i30 = i36;
                                                                f12 = f4;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    } catch (Throwable unused3) {
                                                        kraVar = kraVar4;
                                                        bitmap = bitmap2;
                                                        if (bitmap != null) {
                                                        }
                                                        this.m2 = SystemClock.uptimeMillis();
                                                        this.k2 = true;
                                                        arrayList2.clear();
                                                        xic xicVar1022 = null;
                                                        this.Q0 = null;
                                                        this.b1 = iArr;
                                                        this.O0 = sb2;
                                                        w();
                                                        if (this.P0 != null) {
                                                        }
                                                        invalidate();
                                                        return;
                                                    }
                                                }
                                                i34 += max;
                                                kraVar4 = kraVar4;
                                                bitmap = bitmap2;
                                                i30 = i30;
                                                f12 = f12;
                                            }
                                            bitmap2 = bitmap;
                                            kraVar2 = kraVar4;
                                            float L = gl.L(3.0f);
                                            int size7 = arrayList9.size();
                                            int i39 = 0;
                                            while (i39 < size7) {
                                                Object obj5 = arrayList9.get(i39);
                                                i39++;
                                                xic xicVar11 = (xic) obj5;
                                                if (xicVar11.b) {
                                                    float f21 = xicVar11.f;
                                                    float f22 = w3;
                                                    float f23 = f21 + f22;
                                                    float f24 = xicVar11.g - f22;
                                                    float f25 = this.t2;
                                                    if (f24 >= f25 && f23 <= f25 + this.u2) {
                                                        float f26 = xicVar11.d;
                                                        boolean n = n(xicVar11);
                                                        float f27 = v3;
                                                        float f28 = f26 - (n ? f27 : 0.0f);
                                                        float f29 = xicVar11.l;
                                                        if (!m(xicVar11)) {
                                                            f27 = 0.0f;
                                                        }
                                                        float f30 = f29 + f27;
                                                        float f31 = L / 2.0f;
                                                        float f32 = f23 + f31;
                                                        while (f32 < f24) {
                                                            float f33 = f28 + f31;
                                                            while (f33 < f30) {
                                                                if (kraVar2.d() > 0.5f) {
                                                                    f3 = L;
                                                                    i = size7;
                                                                    kraVar3 = kraVar2;
                                                                } else {
                                                                    f3 = L;
                                                                    float f34 = xicVar11.d;
                                                                    i = size7;
                                                                    float max2 = Math.max(0.0f, Math.min(1.0f, (f33 - f34) / Math.max(1.0f, xicVar11.l - f34)));
                                                                    if (xicVar11.m) {
                                                                        max2 = 1.0f - max2;
                                                                    }
                                                                    kraVar2.g(((kraVar2.d() - 0.5f) * f3) + this.r2 + f33, ((kraVar2.d() - 0.5f) * f3) + this.s2 + f32, ((kraVar2.d() * 22.0f) + 6.0f) * f13, (-((kraVar2.d() * 20.0f) + 8.0f)) * f13, (kraVar2.d() * 0.3f) + 0.26f, (max2 * 0.12f) + xicVar11.j);
                                                                    kraVar3 = kraVar2;
                                                                }
                                                                f33 += f3;
                                                                kraVar2 = kraVar3;
                                                                L = f3;
                                                                size7 = i;
                                                            }
                                                            float f35 = L;
                                                            f32 += f35;
                                                            L = f35;
                                                        }
                                                    }
                                                }
                                            }
                                            kraVar = kraVar2;
                                            bitmap2.recycle();
                                        } catch (Throwable unused4) {
                                            kraVar = kraVar4;
                                            bitmap2 = bitmap;
                                        }
                                    } catch (Throwable unused5) {
                                        kraVar = kraVar4;
                                    }
                                } catch (Throwable unused6) {
                                    kraVar = kraVar4;
                                    bitmap = null;
                                }
                                this.m2 = SystemClock.uptimeMillis();
                                this.k2 = true;
                            }
                            arrayList2.clear();
                            xic xicVar10222 = null;
                            this.Q0 = null;
                            this.b1 = iArr;
                            this.O0 = sb2;
                            w();
                            if (this.P0 != null) {
                                this.k2 = false;
                            } else {
                                String str4 = this.O0;
                                int size8 = arrayList9.size();
                                int i40 = 0;
                                int i41 = 0;
                                while (true) {
                                    if (i41 < size8) {
                                        Object obj6 = arrayList9.get(i41);
                                        i41++;
                                        xic xicVar12 = (xic) obj6;
                                        if (!xicVar12.b || !this.l2) {
                                            int indexOf2 = str4.indexOf(xicVar12.a, i40);
                                            if (indexOf2 < 0) {
                                                this.k2 = false;
                                                break;
                                            }
                                            int length3 = xicVar12.a.length() + indexOf2;
                                            int lineForOffset3 = this.P0.getLineForOffset(indexOf2);
                                            xicVar12.h = this.P0.getPrimaryHorizontal(indexOf2);
                                            xicVar12.i = this.P0.getLineBaseline(lineForOffset3);
                                            xicVar12.p = indexOf2;
                                            xicVar12.k = textPaint.measureText(xicVar12.a);
                                            xicVar12.q = false;
                                            int i42 = 0;
                                            while (true) {
                                                int i43 = i42 + 1;
                                                int[] iArr8 = this.b1;
                                                if (i43 >= iArr8.length) {
                                                    break;
                                                }
                                                if (indexOf2 >= iArr8[i42] && indexOf2 < iArr8[i43]) {
                                                    xicVar12.q = true;
                                                }
                                                i42 += 2;
                                            }
                                            i40 = length3;
                                        }
                                    } else {
                                        this.n2 = 0.48000002f;
                                        this.q2 = 0;
                                        this.p2 = 0;
                                        if (!this.l2) {
                                            int size9 = arrayList9.size();
                                            int i44 = 0;
                                            while (i44 < size9) {
                                                Object obj7 = arrayList9.get(i44);
                                                i44++;
                                                boolean z8 = ((xic) obj7).c;
                                            }
                                            SpannableString spannableString2 = new SpannableString(str4);
                                            o(false, 0.14f);
                                            int size10 = arrayList9.size();
                                            int i45 = 0;
                                            while (i45 < size10) {
                                                Object obj8 = arrayList9.get(i45);
                                                i45++;
                                                xic xicVar13 = (xic) obj8;
                                                if (xicVar13.c) {
                                                    this.n2 = Math.max(this.n2, xicVar13.j + 0.26f + 0.12f + 0.45f);
                                                } else {
                                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(0);
                                                    int i46 = xicVar13.p;
                                                    spannableString2.setSpan(foregroundColorSpan, i46, xicVar13.a.length() + i46, 33);
                                                }
                                            }
                                            int i47 = 0;
                                            kraVar.a();
                                            kraVar.e(this.M);
                                            kraVar.a = om3.k(this.M);
                                            kraVar.Q = 0.0f;
                                            textPaint.setAlpha(kk7.d4);
                                            StaticLayout b2 = b(spannableString2, textPaint);
                                            try {
                                                Bitmap createBitmap = Bitmap.createBitmap(b2.getWidth() + gl.L(f2), Math.max(1, b2.getHeight()), Bitmap.Config.ARGB_8888);
                                                try {
                                                    b2.draw(new Canvas(createBitmap));
                                                    int width2 = createBitmap.getWidth();
                                                    int height2 = createBitmap.getHeight();
                                                    int[] iArr9 = new int[width2 * height2];
                                                    bitmap4 = createBitmap;
                                                    try {
                                                        bitmap4.getPixels(iArr9, 0, width2, 0, 0, width2, height2);
                                                        int max3 = Math.max(1, Math.round(gl.p * f));
                                                        int i48 = 0;
                                                        for (int i49 = 0; i49 < height2; i49 += max3) {
                                                            for (int i50 = 0; i50 < width2; i50 += max3) {
                                                                if ((iArr9[(i49 * width2) + i50] >>> 24) > 90) {
                                                                    i48++;
                                                                }
                                                            }
                                                        }
                                                        float f36 = i48 > 1300 ? 1300.0f / i48 : 1.0f;
                                                        if (this.o2.length < Math.min(i48, 1340) * 3) {
                                                            this.o2 = new float[Math.min(i48, 1340) * 3];
                                                        }
                                                        int i51 = 0;
                                                        while (i51 < height2) {
                                                            int i52 = i47;
                                                            while (i52 < width2) {
                                                                if ((iArr9[(i51 * width2) + i52] >>> 24) > 90 && kraVar.d() <= f36 && (this.p2 + 1) * 3 <= this.o2.length) {
                                                                    int size11 = arrayList9.size();
                                                                    xic xicVar14 = xicVar10222;
                                                                    int i53 = i47;
                                                                    while (i53 < size11) {
                                                                        Object obj9 = arrayList9.get(i53);
                                                                        i53++;
                                                                        xic xicVar15 = (xic) obj9;
                                                                        if (xicVar15.c) {
                                                                            StaticLayout staticLayout4 = this.P0;
                                                                            if (i51 >= staticLayout4.getLineTop(staticLayout4.getLineForOffset(xicVar15.p))) {
                                                                                StaticLayout staticLayout5 = this.P0;
                                                                                if (i51 <= staticLayout5.getLineBottom(staticLayout5.getLineForOffset(xicVar15.p)) && i52 >= xicVar15.h - gl.L(2.0f) && (xicVar14 == null || xicVar15.h > xicVar14.h)) {
                                                                                    xicVar14 = xicVar15;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (xicVar14 != null) {
                                                                        float f37 = i52;
                                                                        float max4 = Math.max(0.0f, Math.min(1.0f, (f37 - xicVar14.h) / Math.max(1.0f, xicVar14.k)));
                                                                        if (xicVar14.m) {
                                                                            max4 = 1.0f - max4;
                                                                        }
                                                                        float[] fArr2 = this.o2;
                                                                        int i54 = this.p2;
                                                                        int i55 = i54 * 3;
                                                                        fArr2[i55] = f37;
                                                                        fArr2[i55 + 1] = i51;
                                                                        fArr2[i55 + 2] = (max4 * 0.12f) + xicVar14.j;
                                                                        this.p2 = i54 + 1;
                                                                    }
                                                                }
                                                                i52 += max3;
                                                                xicVar10222 = null;
                                                                i47 = 0;
                                                            }
                                                            i51 += max3;
                                                            xicVar10222 = null;
                                                            i47 = 0;
                                                        }
                                                        float[] fArr3 = this.o2;
                                                        Integer[] numArr = new Integer[this.p2];
                                                        for (int i56 = 0; i56 < this.p2; i56++) {
                                                            numArr[i56] = Integer.valueOf(i56);
                                                        }
                                                        Arrays.sort(numArr, new ml3(fArr3, (byte) 4));
                                                        float[] copyOf = Arrays.copyOf(fArr3, this.p2 * 3);
                                                        for (int i57 = 0; i57 < this.p2; i57++) {
                                                            int i58 = i57 * 3;
                                                            int intValue = numArr[i57].intValue() * 3;
                                                            fArr3[i58] = copyOf[intValue];
                                                            fArr3[i58 + 1] = copyOf[intValue + 1];
                                                            fArr3[i58 + 2] = copyOf[intValue + 2];
                                                        }
                                                        bitmap4.recycle();
                                                    } catch (Throwable unused7) {
                                                        bitmap3 = bitmap4;
                                                        if (bitmap3 != null) {
                                                            bitmap3.recycle();
                                                        }
                                                        invalidate();
                                                        return;
                                                    }
                                                } catch (Throwable unused8) {
                                                    bitmap4 = createBitmap;
                                                }
                                            } catch (Throwable unused9) {
                                                bitmap3 = null;
                                            }
                                        }
                                    }
                                }
                            }
                            invalidate();
                            return;
                        }
                    }
                }
                int min2 = Math.min(str3.length(), sb2.length());
                int i59 = 0;
                while (i59 < min2 && str3.charAt(i59) == sb2.charAt(i59)) {
                    i59++;
                }
                while (true) {
                    if (i59 <= 0) {
                        arrayList2.clear();
                        this.Q0 = this.P0;
                        this.Y0 = j;
                        break;
                    }
                    if (Character.isWhitespace(sb2.charAt(i59 - 1))) {
                        int min3 = Math.min(str3.length(), sb2.length());
                        int i60 = 0;
                        while (i60 < min3 && str3.charAt(i60) == sb2.charAt(i60)) {
                            i60++;
                        }
                        int size12 = arrayList2.size() - 1;
                        while (true) {
                            arrayList3 = arrayList2;
                            if (size12 < 0) {
                                break;
                            }
                            wic wicVar3 = (wic) arrayList3.get(size12);
                            if (wicVar3.a >= i60 || j - wicVar3.c > j2) {
                                arrayList3.remove(size12);
                            } else if (wicVar3.b > i60) {
                                wicVar3.b = i60;
                            }
                            size12--;
                            arrayList2 = arrayList3;
                        }
                        while (i60 > 0 && !Character.isWhitespace(sb2.charAt(Math.min(i60, sb2.length()) - 1))) {
                            i60--;
                        }
                        int i61 = 0;
                        while (i60 < sb2.length()) {
                            int i62 = i60;
                            while (i62 < sb2.length() && Character.isWhitespace(sb2.charAt(i62))) {
                                i62++;
                            }
                            while (i62 < sb2.length() && !Character.isWhitespace(sb2.charAt(i62))) {
                                i62++;
                            }
                            wic wicVar4 = new wic();
                            wicVar4.a = i60;
                            wicVar4.b = i62;
                            wicVar4.d = i60 < str3.length() ? 0.35f : 0.0f;
                            wicVar4.c = (Math.min(i61, 5) * 40) + j;
                            arrayList3.add(wicVar4);
                            i61++;
                            i60 = i62;
                        }
                    } else {
                        i59--;
                    }
                }
            }
        }
        this.O0 = sb2;
        w();
        invalidate();
    }

    public final void y(long j) {
        if (this.b2) {
            if (this.l3 == null) {
                int e = om3.e(this.M ? -10777345 : -15374904);
                int e2 = om3.e(this.M ? -6128385 : -15823740);
                float f = this.M ? 0.6f : 0.75f;
                int f2 = bm2.f(f, this.N, e);
                int f3 = bm2.f(f, this.N, e2);
                this.l3 = new LinearGradient(0.0f, 0.0f, gl.L(150.0f), 0.0f, new int[]{this.N, f2, bm2.f(0.5f, f2, f3), f3, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
            }
            float sin = (((float) Math.sin((0.23f * r11) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * r11)) * 28.0f);
            Matrix matrix = this.m3;
            matrix.reset();
            matrix.setRotate(sin);
            matrix.postTranslate(gl.L(46.0f) * ((j - this.d2) / 1000.0f), gl.L(10.0f) * ((float) Math.sin(r11 * 0.7f)));
            this.l3.setLocalMatrix(matrix);
            this.d.setShader(this.l3);
        }
    }

    public final void z() {
        if (this.I == null) {
            c5a c5aVar = this.a;
            this.I = c5aVar.h(this);
            this.J = c5aVar.h(this);
        }
        if (!this.R) {
            this.R = true;
            this.h0 = SystemClock.uptimeMillis();
            this.n0 = false;
            this.c.f();
            this.D2 = false;
            Bitmap bitmap = this.S2;
            if (bitmap != null) {
                bitmap.recycle();
                this.S2 = null;
            }
            this.k2 = false;
            this.B2.a();
            this.c2 = false;
            this.f2 = 0.0f;
            this.r1 = null;
            this.q1 = null;
            this.o1 = null;
            this.p1 = null;
            this.R0 = null;
            this.s1 = 0.0f;
            this.b2 = false;
            this.e2 = 0.0f;
            this.Q1 = 0.0f;
            this.C2 = false;
            this.p3 = false;
            this.q3 = false;
        }
        setVisibility(0);
        invalidate();
    }
}
