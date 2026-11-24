// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import java.util.Random;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class rc extends View {
    public static final int[] o0 = {-9648385, -13660938, -8758017};
    public static final int[] p0 = {-6650113, -11127568, -9815041};
    public static final d53 q0 = new d53(0.23d, 1.0d, 0.32d, 1.0d);
    public static final d53 r0 = new d53(0.4d, 0.0d, 0.2d, 1.0d);
    public static final d53 s0 = new d53(0.42d, 0.0d, 0.58d, 1.0d);
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public int I;
    public final int J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public final float[] N;
    public final float[] O;
    public final long P;
    public long Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final ylb a;
    public final Paint a0;
    public final byte b;
    public final Paint b0;
    public final int c;
    public final Paint c0;
    public oc d;
    public final RectF d0;
    public float e;
    public final Path e0;
    public float f;
    public final Path f0;
    public final PathMeasure g0;
    public float h;
    public final float[] h0;
    public qc i0;
    public LinearGradient j0;
    public int k0;
    public int l0;
    public int m0;
    public float n;
    public int n0;
    public boolean r;
    public ValueAnimator s;
    public ValueAnimator w;
    public ValueAnimator x;
    public ValueAnimator y;

    public rc(Context context, ylb ylbVar) {
        super(context);
        this.c = gm.L(14.0f);
        this.K = new float[64];
        this.L = new float[64];
        this.M = new float[64];
        this.N = new float[64];
        this.O = new float[64];
        this.P = System.nanoTime();
        this.U = -1.0f;
        this.a0 = new Paint(1);
        this.b0 = new Paint(1);
        Paint paint = new Paint(1);
        this.c0 = paint;
        this.d0 = new RectF();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new PathMeasure();
        this.h0 = new float[2];
        this.b = (byte) 4;
        this.a = ylbVar;
        this.J = ViewConfiguration.get(context).getScaledTouchSlop();
        paint.setDither(true);
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(BlendMode.PLUS);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        }
        Random random = new Random(27L);
        for (int i = 0; i < 64; i++) {
            this.K[i] = random.nextFloat();
            this.L[i] = (random.nextFloat() * 2.0f) - 1.0f;
            this.M[i] = random.nextFloat() + 0.5f;
            this.N[i] = wi8.e(random, 0.8f, 0.6f);
            this.O[i] = random.nextFloat() * 3.1415927f * 2.0f;
            random.nextFloat();
        }
    }

    public static int b(int i, int i2, float f, int i3) {
        float i4 = Utilities.i(f, 1.0f, 0.0f);
        return i4 < 0.5f ? g(i4 * 2.0f, i, i2) : g((i4 - 0.5f) * 2.0f, i2, i3);
    }

    public static int g(float f, int i, int i2) {
        return on2.f(Utilities.i(f, 1.0f, 0.0f), i, i2);
    }

    private void setPos(float f) {
        this.e = f;
        boolean z = f > ((float) this.b) - 1.5f;
        if (z != this.r) {
            this.r = z;
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new nc(this, (byte) 3));
            this.y.setDuration(420L);
            this.y.setInterpolator(r0);
            this.y.start();
        }
        invalidate();
    }

    public final void a(int i) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.e;
        float f2 = i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new nc(this, (byte) 1));
        this.s.setDuration(Math.max(180L, (long) (Math.abs(f2 - f) * 220.0f)));
        this.s.setInterpolator(q0);
        this.s.start();
    }

    public final void c(boolean z) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (z) {
                performHapticFeedback(i >= 30 ? 16 : 0, 1);
            } else {
                performHapticFeedback(i >= 27 ? 9 : 3, 1);
            }
        } catch (Exception unused) {
        }
    }

    public final void d(boolean z) {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, z ? 1.0f : 0.0f);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new nc(this, (byte) 0));
        this.w.setDuration(z ? 220L : 300L);
        this.w.setInterpolator(z ? q0 : new OvershootInterpolator(1.3f));
        this.w.start();
    }

    public final float e(float f) {
        float L = gm.L(40.0f);
        float L2 = gm.L(3.0f);
        return (((((getWidth() - (this.c << 1)) - (L2 * 2.0f)) - L) * f) / (this.b - 1)) + (L / 2.0f) + L2;
    }

    public final /* synthetic */ void f(ValueAnimator valueAnimator) {
        setPos(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int getStop() {
        return Math.round(this.e);
    }

    public final void h(int i) {
        float f = this.e;
        int i2 = this.b - 1;
        boolean z = i == i2 && f < ((float) i2) - 0.001f;
        a(i);
        if (z || i == i2) {
            c(true);
            this.S = 0.0f;
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new nc(this, (byte) 2));
            this.x.addListener(new g0(this, (byte) 7));
            this.x.setDuration(460L);
            this.x.start();
        } else {
            c(false);
        }
        oc ocVar = this.d;
        if (ocVar != null) {
            wc wcVar = (wc) ((l0) ocVar).b;
            wcVar.b(i, true);
            ad adVar = wcVar.s;
            String str = mc.i[i];
            mc mcVar = adVar.y;
            if (TextUtils.equals(mcVar.b(), str)) {
                return;
            }
            TL_agent.settings settingsVar = mcVar.d;
            if (settingsVar != null) {
                settingsVar.effort = str;
                mcVar.i();
            }
            TL_agent.setEffort seteffort = new TL_agent.setEffort();
            seteffort.effort = str;
            ConnectionsManager.getInstance(mcVar.a).sendRequestTyped(seteffort, new kc((byte) 0), new lc(mcVar, (byte) 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x040b A[EDGE_INSN: B:162:0x040b->B:64:0x040b BREAK  A[LOOP:0: B:38:0x027e->B:46:0x03f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0544  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        float f4;
        float f5;
        int i7;
        byte b;
        int i8;
        int i9;
        int i10;
        float f6;
        float f7;
        float f8;
        Path path;
        float f9;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        int i13;
        int i14;
        RectF rectF;
        double d;
        byte b2;
        int i15;
        float f14;
        Canvas canvas2;
        float f15;
        float f16;
        float f17;
        Paint paint;
        int i16;
        int p1;
        RadialGradient radialGradient;
        int[] iArr;
        int i17;
        float f18;
        float f19;
        int i18;
        float f20;
        float f21;
        float[] fArr;
        float f22;
        int i19;
        float f23;
        Paint paint2;
        float f24;
        float f25;
        float f26;
        float f27;
        int i20;
        float f28;
        float f29;
        RadialGradient radialGradient2;
        int i21;
        int p12;
        float f30;
        float f31;
        int i22;
        float f32;
        float f33;
        RectF rectF2;
        Path path2;
        float f34;
        float A;
        Canvas canvas3;
        Canvas canvas4 = canvas;
        long nanoTime = System.nanoTime();
        float min = this.Q == 0 ? 0.0f : Math.min(0.05f, (nanoTime - r4) / 1.0E9f);
        this.Q = nanoTime;
        float f35 = (nanoTime - this.P) / 1.0E9f;
        int width = getWidth();
        int i23 = this.c;
        int i24 = i23 << 1;
        float f36 = width - i24;
        float height = getHeight() - i24;
        float f37 = height / 2.0f;
        canvas4.save();
        float f38 = i23;
        canvas4.translate(f38, f38);
        float N = gm.N(1.0f);
        float L = gm.L(40.0f);
        ylb ylbVar = this.a;
        boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
        int v0 = cmb.v0(cmb.D8, ylbVar);
        int v02 = cmb.v0(cmb.Ei, ylbVar);
        float f39 = this.e;
        byte b3 = this.b;
        float f40 = 2.0f;
        float i25 = Utilities.i(f39 - (b3 - 2), 1.0f, 0.0f);
        float f41 = f39 / (b3 - 1);
        float f42 = this.n;
        int[] iArr2 = o0;
        int i26 = iArr2[0];
        int[] iArr3 = p0;
        float f43 = min;
        int g = g(f42, i26, iArr3[0]);
        int g2 = g(f42, iArr2[1], iArr3[1]);
        int g3 = g(f42, iArr2[2], iArr3[2]);
        RectF rectF3 = this.d0;
        if (f42 > 0.01f) {
            f2 = i25;
            Paint paint3 = this.b0;
            paint3.setColor(16777216);
            f = f41;
            i3 = g3;
            i2 = g2;
            i = g;
            paint3.setShadowLayer(12.0f * N, 0.0f, 0.0f, Color.argb((int) ((a ? 0.55f : 0.42f) * 255.0f * f42), nm7.F1, 92, nm7.d4));
            rectF3.set(0.0f, 0.0f, f36, height);
            canvas4.drawRoundRect(rectF3, f37, f37, paint3);
        } else {
            i = g;
            i2 = g2;
            f = f41;
            f2 = i25;
            i3 = g3;
        }
        Paint paint4 = this.a0;
        paint4.setShader(null);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(a ? cmb.p1(0.1f, g(0.45f, v0, v02)) : cmb.p1(0.07f, v0));
        rectF3.set(0.0f, 0.0f, f36, height);
        canvas4.drawRoundRect(rectF3, f37, f37, paint4);
        float e = e(f39);
        float f44 = this.U;
        float e2 = f44 >= 0.0f ? (e(1.0f) - e(0.0f)) * Math.abs(f39 - f44) : 0.0f;
        this.U = f39;
        float min2 = (((this.E ? Math.min(10.0f * N, e2 * 0.9f) : 0.0f) - this.T) * (this.E ? 0.25f : 0.4f)) + this.T;
        this.T = min2;
        float f45 = this.f;
        float f46 = N * 8.0f;
        float i27 = ts2.i(f46, f45, L, min2);
        float f47 = N * 2.0f;
        float i28 = (Utilities.i(f45, 1.0f, 0.0f) * f47) + (22.0f * N);
        float f48 = (height - i28) / 2.0f;
        float f49 = i27 / 2.0f;
        float i29 = Utilities.i(e, (f36 - f48) - f49, f48 + f49);
        float f50 = f48 + i29 + f49;
        float max = Math.max(1.0f, f50);
        if (this.j0 == null || this.k0 != ((int) f36)) {
            i4 = i3;
            i5 = i;
            f3 = L;
        } else {
            i5 = i;
            if (this.l0 == i5) {
                f3 = L;
                i6 = i2;
                if (this.m0 == i6) {
                    i4 = i3;
                    if (this.n0 == i4) {
                        i8 = i6;
                        i9 = i5;
                        i10 = v0;
                        f4 = f46;
                        i7 = i4;
                        b = b3;
                        f5 = N;
                        f6 = max;
                        f7 = e;
                        paint4.setColor(-1);
                        paint4.setShader(this.j0);
                        rectF3.set(0.0f, 0.0f, f50, height);
                        canvas4.drawRoundRect(rectF3, f37, f37, paint4);
                        paint4.setShader(null);
                        float f51 = f;
                        f8 = f2;
                        this.R = ((((3.0f - (f8 * 2.0f)) * mlb.C(f5, 120.0f, f8, f8)) + (62.0f * f5 * ((float) Math.pow(f51, 1.5d))) + f4) * f43) + this.R;
                        path = this.e0;
                        path.rewind();
                        path.addRoundRect(rectF3, f37, f37, Path.Direction.CW);
                        canvas4.save();
                        canvas4.clipPath(path);
                        f9 = (f51 * 40.0f) + 8.0f;
                        f10 = (20.0f * f5) + f36;
                        i11 = 0;
                        while (true) {
                            f11 = 0.75f;
                            if (i11 >= 64) {
                                break;
                            }
                            float f52 = i11;
                            if (f52 >= f9 + 1.0f) {
                                break;
                            }
                            float f53 = f8;
                            float f54 = this.K[i11] * f10;
                            float f55 = this.R;
                            float f56 = this.N[i11];
                            float f57 = (((f55 * f56) + f54) % f10) + ((-10.0f) * f5);
                            if (f57 > f50) {
                                f32 = f50;
                                f33 = f7;
                                rectF2 = rectF3;
                                path2 = path;
                                f30 = f9;
                                f31 = f10;
                                i22 = i11;
                                canvas3 = canvas4;
                                f34 = f5;
                            } else {
                                f30 = f9;
                                float[] fArr2 = this.L;
                                float f58 = ((f37 - (6.0f * f5)) * fArr2[i11]) + f37;
                                float f59 = f35 * 0.9f * f56;
                                f31 = f10;
                                float f60 = f59 + this.O[i11];
                                i22 = i11;
                                float f61 = f40;
                                float w = b10.w((float) Math.sin(f60), f61, f5, f58);
                                float f62 = f3 / f61;
                                float f63 = f7 - f62;
                                float i30 = Utilities.i((f63 - f57) / f4, 1.0f, 0.0f);
                                float i31 = (((1.0f - i30) * f53) + i30) * Utilities.i(f57 / (14.0f * f5), 1.0f, 0.0f);
                                if (f53 > 0.01f) {
                                    float f64 = f5 * 40.0f;
                                    float f65 = f63 - f64;
                                    if (f57 > f65) {
                                        float min3 = Math.min(1.0f, (f57 - f65) / (f64 + f62));
                                        float f66 = fArr2[i22] >= 0.0f ? 1.0f : -1.0f;
                                        path2 = path;
                                        f32 = f50;
                                        float R1 = gm.R1(f64 * 0.75f, f5 * 9.0f, min3);
                                        rectF2 = rectF3;
                                        double d2 = (f66 * min3 * 3.1415927f * 1.7f) + 3.1415927f;
                                        float w2 = b10.w((float) Math.cos(d2), R1, 1.15f, f7);
                                        f34 = f5;
                                        float w3 = b10.w((float) Math.sin(d2), R1, 0.42f, f37);
                                        float f67 = f53 * min3 * min3;
                                        f33 = f7;
                                        float B = mlb.B(min3, 2.0f, 3.0f, f67);
                                        f57 = td4.A(w2, f57, B, f57);
                                        w = td4.A(w3, w, B, w);
                                        i31 = mlb.B(f67, min3, 1.0f, i31);
                                        A = mlb.A(f51, 0.2f, 0.45f, Math.min(1.0f, f30 - f52) * mlb.A((float) Math.sin((r12[i22] * 3.0f) + (f35 * 1.6f * r10[i22])), 0.4f, 0.6f, i31));
                                        if (A > 0.01f) {
                                            canvas3 = canvas;
                                        } else {
                                            paint4.setColor(cmb.p1(Math.min(1.0f, A), -1));
                                            canvas3 = canvas;
                                            canvas3.drawCircle(f57, w, mlb.A(this.M[i22], 0.3f, 0.35f, f34), paint4);
                                        }
                                    }
                                }
                                f32 = f50;
                                f33 = f7;
                                rectF2 = rectF3;
                                path2 = path;
                                f34 = f5;
                                A = mlb.A(f51, 0.2f, 0.45f, Math.min(1.0f, f30 - f52) * mlb.A((float) Math.sin((r12[i22] * 3.0f) + (f35 * 1.6f * r10[i22])), 0.4f, 0.6f, i31));
                                if (A > 0.01f) {
                                }
                            }
                            i11 = i22 + 1;
                            canvas4 = canvas3;
                            f5 = f34;
                            f9 = f30;
                            f8 = f53;
                            path = path2;
                            f10 = f31;
                            f50 = f32;
                            rectF3 = rectF2;
                            f7 = f33;
                            f40 = 2.0f;
                        }
                        f12 = f50;
                        float f68 = f7;
                        RectF rectF4 = rectF3;
                        Path path3 = path;
                        f13 = f8;
                        Canvas canvas5 = canvas4;
                        float f69 = f5;
                        if (f13 > 0.01f) {
                            float f70 = this.S + f43;
                            this.S = f70;
                            float f71 = (f70 % 2.6f) / 1.3f;
                            if (f71 < 1.0f) {
                                float g4 = aq1.g(f69, 80.0f, f6, s0.getInterpolation(f71), (-40.0f) * f69);
                                float f72 = g4 / f36;
                                i12 = i9;
                                i13 = i8;
                                i14 = i7;
                                d = 3.141592653589793d;
                                int p13 = cmb.p1(0.95f * f13 * ((float) Math.sin(f71 * 3.141592653589793d)), g(0.55f, b(i12, i13, f72, i14), -1));
                                float f73 = 1.4f * f69;
                                paint4.setStyle(Paint.Style.STROKE);
                                paint4.setStrokeWidth(f73);
                                paint4.setColor(-1);
                                float f74 = 36.0f * f69;
                                paint4.setShader(new LinearGradient(g4 - f74, 0.0f, g4 + f74, 0.0f, new int[]{0, p13, 0}, (float[]) null, Shader.TileMode.CLAMP));
                                float f75 = f73 / 2.0f;
                                rectF = rectF4;
                                rectF.set(f75, f75, f12 - f75, height - f75);
                                float f76 = f37 - f75;
                                canvas5.drawRoundRect(rectF, f76, f76, paint4);
                                paint4.setShader(null);
                                paint4.setStyle(Paint.Style.FILL);
                                canvas5.restore();
                                b2 = b;
                                i15 = 0;
                                while (i15 < b2) {
                                    float e3 = e(i15);
                                    if (Math.abs(e3 - f68) < (f3 / 2.0f) + f47) {
                                        i21 = i10;
                                    } else {
                                        if (e3 < f68) {
                                            float[] fArr3 = new float[3];
                                            on2.j(b(i12, i13, e3 / f36, i14) | (-16777216), fArr3);
                                            fArr3[1] = Math.min(1.0f, (fArr3[1] * 1.25f) + 0.15f);
                                            fArr3[2] = 0.82f;
                                            p12 = on2.a(fArr3);
                                            i21 = i10;
                                        } else {
                                            i21 = i10;
                                            p12 = cmb.p1(a ? 0.35f : 0.25f, i21);
                                        }
                                        paint4.setColor(p12);
                                        canvas5.drawCircle(e3, f37, 2.5f * f69, paint4);
                                    }
                                    i15++;
                                    i10 = i21;
                                }
                                float f77 = (height - 0.0f) / 2.0f;
                                f14 = f77 * 2.0f;
                                if (f12 - 0.0f > f14) {
                                    Path path4 = this.f0;
                                    path4.rewind();
                                    path4.moveTo(0.0f, f37);
                                    float f78 = f14 + 0.0f;
                                    rectF.set(0.0f, 0.0f, f78, height);
                                    path4.arcTo(rectF, 180.0f, 90.0f, false);
                                    path4.lineTo(f12 - f77, 0.0f);
                                    float f79 = f12;
                                    rectF.set(f12 - f14, 0.0f, f79, height);
                                    path4.arcTo(rectF, 270.0f, 180.0f, false);
                                    path4.lineTo(f77 + 0.0f, height);
                                    rectF.set(0.0f, 0.0f, f78, height);
                                    path4.arcTo(rectF, 90.0f, 90.0f, false);
                                    PathMeasure pathMeasure = this.g0;
                                    pathMeasure.setPath(path4, false);
                                    float length = pathMeasure.getLength();
                                    if (length > 0.0f) {
                                        this.V = ((((gm.R1(61.0f, 100.0f, f42) * f43) * f69) / length) + this.V) % 1.0f;
                                        this.W = this.W + f43;
                                        float f80 = 0.5f;
                                        float sin = (((float) Math.sin(((r1 * 2.0f) * d) / 2.4000000953674316d)) * 0.03f) + 0.5f;
                                        float f81 = f69 * 46.0f;
                                        float f82 = f68 - (f3 / 2.0f);
                                        qc qcVar = this.i0;
                                        if (qcVar == null || qcVar.a != f69) {
                                            this.i0 = new qc(f69);
                                        }
                                        canvas5.save();
                                        canvas5.clipPath(path3);
                                        int i32 = 0;
                                        while (true) {
                                            paint = this.c0;
                                            float f83 = f80;
                                            if (i32 >= 2) {
                                                break;
                                            }
                                            float f84 = this.V;
                                            if (i32 != 0) {
                                                f84 += sin;
                                            }
                                            int i33 = i32;
                                            float[] fArr4 = this.h0;
                                            float f85 = f79;
                                            pathMeasure.getPosTan((((f84 * length) % length) + length) % length, fArr4, null);
                                            float f86 = fArr4[0];
                                            float f87 = fArr4[1];
                                            float f88 = f82 - (f69 * 6.0f);
                                            float i34 = Utilities.i((f86 - f88) / (((4.0f * f69) + f82) - f88), 1.0f, 0.0f);
                                            float f89 = 1.0f - (((3.0f - (i34 * 2.0f)) * (i34 * i34)) * 0.6f);
                                            float[] fArr5 = new float[3];
                                            on2.j(b(i12, i13, f86 / f36, i14), fArr5);
                                            fArr5[1] = 1.0f;
                                            int i35 = 2;
                                            fArr5[2] = 0.6f;
                                            fArr5[0] = (fArr5[0] + 6.0f) % 360.0f;
                                            int a2 = on2.a(fArr5);
                                            float f90 = f81 / 2.0f;
                                            float f91 = f86 - f90;
                                            int i36 = i14;
                                            float f92 = f86 + f90;
                                            float f93 = f69;
                                            int i37 = 0;
                                            while (i37 < i35) {
                                                if (i37 == 0) {
                                                    p1 = cmb.p1(f89 * f83, a2);
                                                    i16 = i37;
                                                } else {
                                                    i16 = i37;
                                                    p1 = cmb.p1(f89 * 0.55f, g(f11, a2, -1));
                                                }
                                                RadialGradient radialGradient3 = new RadialGradient(f86, f87, f90, new int[]{p1, p1, p1 & 16777215}, new float[]{0.0f, 0.34f, 1.0f}, Shader.TileMode.CLAMP);
                                                qc qcVar2 = this.i0;
                                                hi2 hi2Var = i16 == 0 ? qcVar2.b : qcVar2.c;
                                                int[] iArr4 = (int[]) hi2Var.c;
                                                float[] fArr6 = (float[]) hi2Var.b;
                                                int i38 = a2;
                                                float max2 = Math.max(f37, f91);
                                                float f94 = f91;
                                                float f95 = f85 - f37;
                                                float min4 = Math.min(f95, f92);
                                                float f96 = f92;
                                                if (min4 > max2) {
                                                    this.i0.getClass();
                                                    int length2 = fArr6.length;
                                                    int i39 = length2 << 1;
                                                    int i40 = i39 + 2;
                                                    float[] fArr7 = new float[i40];
                                                    int[] iArr5 = new int[i40];
                                                    for (int i41 = 0; i41 < length2; i41++) {
                                                        fArr7[i41] = fArr6[i41] / height;
                                                        iArr5[i41] = iArr4[i41];
                                                    }
                                                    int i42 = length2 - 1;
                                                    float f97 = f83;
                                                    fArr7[length2] = kt6.A(fArr6[i42], height, 1.0E-4f, f97);
                                                    iArr5[length2] = 16777215;
                                                    int i43 = length2 + 1;
                                                    fArr7[i43] = Math.max(f97, (1.0f - (fArr6[i42] / height)) - 1.0E-4f);
                                                    iArr5[i43] = 16777215;
                                                    for (int i44 = 0; i44 < length2; i44++) {
                                                        int i45 = (i39 + 1) - i44;
                                                        fArr7[i45] = 1.0f - (fArr6[i44] / height);
                                                        iArr5[i45] = iArr4[i44];
                                                    }
                                                    f19 = f97;
                                                    int i46 = i13;
                                                    f18 = f95;
                                                    f21 = 0.75f;
                                                    float f98 = height;
                                                    iArr = iArr4;
                                                    paint.setShader(new ComposeShader(new LinearGradient(0.0f, 0.0f, 0.0f, f98, iArr5, fArr7, Shader.TileMode.CLAMP), radialGradient3, PorterDuff.Mode.MULTIPLY));
                                                    f23 = f94;
                                                    radialGradient = radialGradient3;
                                                    f22 = f37;
                                                    f92 = f96;
                                                    i18 = i33;
                                                    fArr = fArr6;
                                                    i19 = i46;
                                                    paint2 = paint;
                                                    i17 = i12;
                                                    f24 = f98;
                                                    f20 = 1.0f;
                                                    canvas.drawRect(max2, 0.0f, min4, f24, paint2);
                                                } else {
                                                    radialGradient = radialGradient3;
                                                    iArr = iArr4;
                                                    i17 = i12;
                                                    f18 = f95;
                                                    f92 = f96;
                                                    f19 = f83;
                                                    i18 = i33;
                                                    f20 = 1.0f;
                                                    f21 = 0.75f;
                                                    fArr = fArr6;
                                                    f22 = f37;
                                                    i19 = i13;
                                                    f23 = f94;
                                                    paint2 = paint;
                                                    f24 = height;
                                                }
                                                int i47 = 0;
                                                int i48 = 2;
                                                while (i47 < i48) {
                                                    int i49 = i48;
                                                    if (i47 == 0) {
                                                        f26 = f22;
                                                        f27 = f26;
                                                        f25 = 0.0f;
                                                    } else {
                                                        f25 = f18;
                                                        f26 = f25;
                                                        f27 = f85;
                                                    }
                                                    if (Math.min(f27, f92) <= Math.max(f25, f23)) {
                                                        i20 = i47;
                                                        f28 = f23;
                                                        f29 = f92;
                                                        radialGradient2 = radialGradient;
                                                    } else {
                                                        float f99 = f20;
                                                        i20 = i47;
                                                        this.i0.getClass();
                                                        int length3 = fArr.length;
                                                        float f100 = f25;
                                                        int i50 = length3 + 1;
                                                        float f101 = f26;
                                                        float[] fArr8 = new float[i50];
                                                        int[] iArr6 = new int[i50];
                                                        fArr8[0] = 0.0f;
                                                        iArr6[0] = 16777215;
                                                        int i51 = 0;
                                                        while (i51 < length3) {
                                                            int i52 = length3 - i51;
                                                            int i53 = i51;
                                                            float[] fArr9 = fArr8;
                                                            fArr9[i52] = Utilities.i(f99 - (fArr[i51] / f22), f99, 1.0E-4f);
                                                            iArr6[i52] = iArr[i53];
                                                            i51 = i53 + 1;
                                                            length3 = length3;
                                                            fArr8 = fArr9;
                                                            f99 = 1.0f;
                                                        }
                                                        f28 = f23;
                                                        f29 = f92;
                                                        radialGradient2 = radialGradient;
                                                        paint2.setShader(new ComposeShader(new RadialGradient(f101, f22, f22, iArr6, fArr8, Shader.TileMode.CLAMP), radialGradient2, PorterDuff.Mode.MULTIPLY));
                                                        canvas.drawRect(f100, 0.0f, f27, f24, paint2);
                                                    }
                                                    i47 = i20 + 1;
                                                    radialGradient = radialGradient2;
                                                    f23 = f28;
                                                    f92 = f29;
                                                    i48 = i49;
                                                    f20 = 1.0f;
                                                }
                                                int i54 = i48;
                                                float f102 = f23;
                                                i37 = i16 + 1;
                                                canvas5 = canvas;
                                                height = f24;
                                                paint = paint2;
                                                f37 = f22;
                                                i13 = i19;
                                                a2 = i38;
                                                f11 = f21;
                                                f83 = f19;
                                                i12 = i17;
                                                f91 = f102;
                                                i35 = i54;
                                                i33 = i18;
                                            }
                                            i32 = i33 + 1;
                                            f69 = f93;
                                            f80 = f83;
                                            i14 = i36;
                                            f79 = f85;
                                        }
                                        canvas2 = canvas5;
                                        f15 = f37;
                                        f16 = f69;
                                        f17 = 0.6f;
                                        paint.setShader(null);
                                        canvas2.restore();
                                        float exp = this.h > 0.0f ? (((float) (Math.exp((-r2) * 2.5d) * Math.sin(Math.min(1.0f, 2.2f * r2) * d))) * 0.08f) + 1.0f : 1.0f;
                                        float f103 = (i27 * exp) / 2.0f;
                                        float f104 = (i28 * exp) / 2.0f;
                                        rectF.set(i29 - f103, f15 - f104, i29 + f103, f15 + f104);
                                        paint4.setColor(-1);
                                        canvas2.drawRoundRect(rectF, f104, f104, paint4);
                                        paint4.setStyle(Paint.Style.STROKE);
                                        paint4.setStrokeWidth(Math.max(1.0f, f16 * f17));
                                        paint4.setColor(251658240);
                                        canvas2.drawRoundRect(rectF, f104, f104, paint4);
                                        paint4.setStyle(Paint.Style.FILL);
                                        canvas2.restore();
                                        if (!isAttachedToWindow() || getAlpha() <= 0.0f) {
                                            return;
                                        }
                                        invalidate();
                                        return;
                                    }
                                }
                                canvas2 = canvas5;
                                f15 = f37;
                                f16 = f69;
                                f17 = 0.6f;
                                if (this.h > 0.0f) {
                                }
                                float f1032 = (i27 * exp) / 2.0f;
                                float f1042 = (i28 * exp) / 2.0f;
                                rectF.set(i29 - f1032, f15 - f1042, i29 + f1032, f15 + f1042);
                                paint4.setColor(-1);
                                canvas2.drawRoundRect(rectF, f1042, f1042, paint4);
                                paint4.setStyle(Paint.Style.STROKE);
                                paint4.setStrokeWidth(Math.max(1.0f, f16 * f17));
                                paint4.setColor(251658240);
                                canvas2.drawRoundRect(rectF, f1042, f1042, paint4);
                                paint4.setStyle(Paint.Style.FILL);
                                canvas2.restore();
                                if (isAttachedToWindow()) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        i12 = i9;
                        i13 = i8;
                        i14 = i7;
                        rectF = rectF4;
                        d = 3.141592653589793d;
                        canvas5.restore();
                        b2 = b;
                        i15 = 0;
                        while (i15 < b2) {
                        }
                        float f772 = (height - 0.0f) / 2.0f;
                        f14 = f772 * 2.0f;
                        if (f12 - 0.0f > f14) {
                        }
                        canvas2 = canvas5;
                        f15 = f37;
                        f16 = f69;
                        f17 = 0.6f;
                        if (this.h > 0.0f) {
                        }
                        float f10322 = (i27 * exp) / 2.0f;
                        float f10422 = (i28 * exp) / 2.0f;
                        rectF.set(i29 - f10322, f15 - f10422, i29 + f10322, f15 + f10422);
                        paint4.setColor(-1);
                        canvas2.drawRoundRect(rectF, f10422, f10422, paint4);
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setStrokeWidth(Math.max(1.0f, f16 * f17));
                        paint4.setColor(251658240);
                        canvas2.drawRoundRect(rectF, f10422, f10422, paint4);
                        paint4.setStyle(Paint.Style.FILL);
                        canvas2.restore();
                        if (isAttachedToWindow()) {
                        }
                    }
                } else {
                    i4 = i3;
                }
                this.k0 = (int) f36;
                this.l0 = i5;
                this.m0 = i6;
                this.n0 = i4;
                f4 = f46;
                f5 = N;
                i7 = i4;
                b = b3;
                i8 = i6;
                i9 = i5;
                i10 = v0;
                f6 = max;
                f7 = e;
                this.j0 = new LinearGradient(0.0f, 0.0f, f36, 0.0f, new int[]{i5, i6, i4}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                paint4.setColor(-1);
                paint4.setShader(this.j0);
                rectF3.set(0.0f, 0.0f, f50, height);
                canvas4.drawRoundRect(rectF3, f37, f37, paint4);
                paint4.setShader(null);
                float f512 = f;
                f8 = f2;
                this.R = ((((3.0f - (f8 * 2.0f)) * mlb.C(f5, 120.0f, f8, f8)) + (62.0f * f5 * ((float) Math.pow(f512, 1.5d))) + f4) * f43) + this.R;
                path = this.e0;
                path.rewind();
                path.addRoundRect(rectF3, f37, f37, Path.Direction.CW);
                canvas4.save();
                canvas4.clipPath(path);
                f9 = (f512 * 40.0f) + 8.0f;
                f10 = (20.0f * f5) + f36;
                i11 = 0;
                while (true) {
                    f11 = 0.75f;
                    if (i11 >= 64) {
                    }
                    i11 = i22 + 1;
                    canvas4 = canvas3;
                    f5 = f34;
                    f9 = f30;
                    f8 = f53;
                    path = path2;
                    f10 = f31;
                    f50 = f32;
                    rectF3 = rectF2;
                    f7 = f33;
                    f40 = 2.0f;
                }
                f12 = f50;
                float f682 = f7;
                RectF rectF42 = rectF3;
                Path path32 = path;
                f13 = f8;
                Canvas canvas52 = canvas4;
                float f692 = f5;
                if (f13 > 0.01f) {
                }
                i12 = i9;
                i13 = i8;
                i14 = i7;
                rectF = rectF42;
                d = 3.141592653589793d;
                canvas52.restore();
                b2 = b;
                i15 = 0;
                while (i15 < b2) {
                }
                float f7722 = (height - 0.0f) / 2.0f;
                f14 = f7722 * 2.0f;
                if (f12 - 0.0f > f14) {
                }
                canvas2 = canvas52;
                f15 = f37;
                f16 = f692;
                f17 = 0.6f;
                if (this.h > 0.0f) {
                }
                float f103222 = (i27 * exp) / 2.0f;
                float f104222 = (i28 * exp) / 2.0f;
                rectF.set(i29 - f103222, f15 - f104222, i29 + f103222, f15 + f104222);
                paint4.setColor(-1);
                canvas2.drawRoundRect(rectF, f104222, f104222, paint4);
                paint4.setStyle(Paint.Style.STROKE);
                paint4.setStrokeWidth(Math.max(1.0f, f16 * f17));
                paint4.setColor(251658240);
                canvas2.drawRoundRect(rectF, f104222, f104222, paint4);
                paint4.setStyle(Paint.Style.FILL);
                canvas2.restore();
                if (isAttachedToWindow()) {
                }
            } else {
                f3 = L;
                i4 = i3;
            }
        }
        i6 = i2;
        this.k0 = (int) f36;
        this.l0 = i5;
        this.m0 = i6;
        this.n0 = i4;
        f4 = f46;
        f5 = N;
        i7 = i4;
        b = b3;
        i8 = i6;
        i9 = i5;
        i10 = v0;
        f6 = max;
        f7 = e;
        this.j0 = new LinearGradient(0.0f, 0.0f, f36, 0.0f, new int[]{i5, i6, i4}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        paint4.setColor(-1);
        paint4.setShader(this.j0);
        rectF3.set(0.0f, 0.0f, f50, height);
        canvas4.drawRoundRect(rectF3, f37, f37, paint4);
        paint4.setShader(null);
        float f5122 = f;
        f8 = f2;
        this.R = ((((3.0f - (f8 * 2.0f)) * mlb.C(f5, 120.0f, f8, f8)) + (62.0f * f5 * ((float) Math.pow(f5122, 1.5d))) + f4) * f43) + this.R;
        path = this.e0;
        path.rewind();
        path.addRoundRect(rectF3, f37, f37, Path.Direction.CW);
        canvas4.save();
        canvas4.clipPath(path);
        f9 = (f5122 * 40.0f) + 8.0f;
        f10 = (20.0f * f5) + f36;
        i11 = 0;
        while (true) {
            f11 = 0.75f;
            if (i11 >= 64) {
            }
            i11 = i22 + 1;
            canvas4 = canvas3;
            f5 = f34;
            f9 = f30;
            f8 = f53;
            path = path2;
            f10 = f31;
            f50 = f32;
            rectF3 = rectF2;
            f7 = f33;
            f40 = 2.0f;
        }
        f12 = f50;
        float f6822 = f7;
        RectF rectF422 = rectF3;
        Path path322 = path;
        f13 = f8;
        Canvas canvas522 = canvas4;
        float f6922 = f5;
        if (f13 > 0.01f) {
        }
        i12 = i9;
        i13 = i8;
        i14 = i7;
        rectF = rectF422;
        d = 3.141592653589793d;
        canvas522.restore();
        b2 = b;
        i15 = 0;
        while (i15 < b2) {
        }
        float f77222 = (height - 0.0f) / 2.0f;
        f14 = f77222 * 2.0f;
        if (f12 - 0.0f > f14) {
        }
        canvas2 = canvas522;
        f15 = f37;
        f16 = f6922;
        f17 = 0.6f;
        if (this.h > 0.0f) {
        }
        float f1032222 = (i27 * exp) / 2.0f;
        float f1042222 = (i28 * exp) / 2.0f;
        rectF.set(i29 - f1032222, f15 - f1042222, i29 + f1032222, f15 + f1042222);
        paint4.setColor(-1);
        canvas2.drawRoundRect(rectF, f1042222, f1042222, paint4);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(Math.max(1.0f, f16 * f17));
        paint4.setColor(251658240);
        canvas2.drawRoundRect(rectF, f1042222, f1042222, paint4);
        paint4.setStyle(Paint.Style.FILL);
        canvas2.restore();
        if (isAttachedToWindow()) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(28.0f) + (this.c << 1), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = this.c;
        if (actionMasked != 0) {
            byte b = this.b;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = (motionEvent.getX() - i) - this.G;
                    if (!this.F && Math.abs(x) > this.J) {
                        this.F = true;
                        this.E = true;
                    }
                    if (this.F) {
                        float f = b - 1;
                        float i2 = Utilities.i(((x / Math.max(1.0f, e(f) - e(0.0f))) * f) + this.H, f, 0.0f);
                        setPos(i2);
                        int round = Math.round(i2);
                        if (round != this.I && Math.abs(i2 - round) < 0.12f) {
                            this.I = round;
                            c(false);
                            return true;
                        }
                    }
                } else if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            d(false);
            boolean z = this.F;
            this.E = false;
            this.F = false;
            if (z) {
                h(Math.round(this.e));
                return true;
            }
            if (motionEvent.getActionMasked() == 1) {
                float f2 = this.G;
                float L = gm.L(40.0f);
                float L2 = gm.L(3.0f);
                float max = ((f2 - L2) - (L / 2.0f)) / Math.max(1.0f, ((getWidth() - (i << 1)) - (L2 * 2.0f)) - L);
                float f3 = b - 1;
                h(Math.round(Utilities.i(max * f3, f3, 0.0f)));
                return true;
            }
        } else {
            d(true);
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float x2 = motionEvent.getX() - i;
            this.G = x2;
            float f4 = this.e;
            this.H = f4;
            boolean z2 = Math.abs(x2 - e(f4)) < ((float) gm.L(40.0f));
            this.F = z2;
            this.E = z2;
            this.I = Math.round(this.H);
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    public void setListener(oc ocVar) {
        this.d = ocVar;
    }
}
