package tf;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bg.b3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.cc1;
import org.telegram.ui.d91;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class g extends View implements i {
    public static final float g1 = AndroidUtilities.dpf2(16.0f);
    public static final float h1 = AndroidUtilities.dpf2(1.5f);
    public static final float i1 = AndroidUtilities.dpf2(12.0f);
    public static final int j1 = AndroidUtilities.dp(18.0f);
    public static final int k1 = AndroidUtilities.dp(14.0f);
    public static final int l1 = AndroidUtilities.dp(10.0f);
    public static final int m1 = AndroidUtilities.dp(16.0f);
    public static final int n1 = AndroidUtilities.dp(24.0f);
    public static final int o1 = AndroidUtilities.dp(16.0f);
    public static final int p1 = AndroidUtilities.dp(10.0f);
    public static final int q1 = AndroidUtilities.dp(12.0f);
    public static final int r1 = AndroidUtilities.dp(8.0f);
    public static final int s1 = AndroidUtilities.dp(6.0f);
    public static final int t1 = AndroidUtilities.dp(5.0f);
    public static final int u1 = AndroidUtilities.dp(2.0f);
    public static final int v1 = AndroidUtilities.dp(1.0f);
    public static final boolean w1;
    public static final boolean x1;
    public static final u1.a y1;
    public float A;
    public float A0;
    public int B;
    public float B0;
    public int C;
    public float C0;
    public boolean D;
    public final RectF D0;
    public boolean E;
    public VibrationEffect E0;
    public boolean F;
    public final d F0;
    public final Paint G;
    public final d G0;
    public final Paint H;
    public final b H0;
    public final Paint I;
    public final b I0;
    public final TextPaint J;
    public final d J0;
    public final TextPaint K;
    public final cc1 K0;
    public final TextPaint L;
    public boolean L0;
    public final Paint M;
    public e M0;
    public final Paint N;
    public float N0;
    public final Paint O;
    public float O0;
    public final Paint P;
    public float P0;
    public final Paint Q;
    public float Q0;
    public final Rect R;
    public float R0;
    public final Path S;
    public final c6 S0;
    public AnimatorSet T;
    public int T0;
    public ValueAnimator U;
    public int U0;
    public ValueAnimator V;
    public final Rect V0;
    public Animator W;
    public final ArrayList W0;
    public long X0;
    public int Y0;
    public int Z0;
    public f a;
    public ValueAnimator a0;
    public int a1;
    public final ArrayList b;
    public boolean b0;
    public int b1;
    public final ArrayList c;
    public final j c0;
    public long c1;
    public final ArrayList d;
    public uf.b d0;
    public boolean d1;
    public boolean e;
    public vf.b e0;
    public boolean e1;
    public float f;
    public float f0;
    public vf.c f1;
    public float g0;
    public float h;
    public float h0;
    public int i0;
    public int j0;
    public int k0;
    public Bitmap l0;
    public Canvas m0;
    public int n;
    public boolean n0;
    public int o0;
    public vf.e p0;
    public boolean q0;
    public int r;
    public float r0;
    public int s;
    public boolean s0;
    public boolean t0;
    public int u0;
    public float v;
    public vf.j v0;
    public float w;
    public final int w0;
    public float x;
    public final int x0;
    public float y;
    public float y0;
    public float z0;

    static {
        int i10 = Build.VERSION.SDK_INT;
        w1 = i10 < 28;
        x1 = i10 > 21;
        y1 = new u1.a();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [tf.b] */
    /* JADX WARN: Type inference failed for: r1v9, types: [tf.b] */
    public g(Context context, c6 c6Var) {
        super(context);
        this.b = new ArrayList(10);
        this.c = new ArrayList(25);
        this.d = new ArrayList();
        final int i10 = 1;
        this.e = true;
        this.v = 250.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.A = 0.0f;
        this.D = true;
        final int i11 = 0;
        this.E = false;
        this.F = true;
        this.G = new Paint();
        this.H = new Paint();
        this.I = new Paint();
        this.J = new TextPaint(1);
        this.K = new TextPaint(1);
        this.L = new TextPaint(1);
        this.M = new Paint(1);
        this.N = new Paint();
        this.O = new Paint(1);
        this.P = new Paint(1);
        this.Q = new Paint(1);
        this.R = new Rect();
        this.S = new Path();
        this.b0 = false;
        j jVar = new j();
        jVar.h = new Rect();
        jVar.i = new Rect();
        jVar.j = new Rect();
        jVar.k = 0.7f;
        jVar.l = 1.0f;
        jVar.m = 0.1f;
        jVar.n = new h[]{null, null};
        jVar.a = this;
        this.c0 = jVar;
        this.n0 = false;
        this.o0 = -1;
        this.q0 = false;
        this.r0 = 0.0f;
        this.s0 = false;
        this.t0 = false;
        this.u0 = 0;
        this.x0 = AndroidUtilities.dp(46.0f);
        this.D0 = new RectF();
        this.F0 = new d(this, i11);
        this.G0 = new d(this, i10);
        this.H0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: tf.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        g gVar = this.b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        break;
                    default:
                        g gVar2 = this.b;
                        gVar2.getClass();
                        gVar2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        break;
                }
            }
        };
        this.I0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: tf.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        g gVar = this.b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        break;
                    default:
                        g gVar2 = this.b;
                        gVar2.getClass();
                        gVar2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        break;
                }
            }
        };
        this.J0 = new d(this, 2);
        this.K0 = new cc1(this, 11);
        this.L0 = false;
        this.T0 = 0;
        this.U0 = 0;
        Rect rect = new Rect();
        this.V0 = rect;
        ArrayList arrayList = new ArrayList();
        this.W0 = arrayList;
        arrayList.add(rect);
        this.X0 = 0L;
        this.e1 = false;
        this.S0 = c6Var;
        t();
        this.w0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f9, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        float f15 = f11 - f9;
        float f16 = f12 - f10;
        float f17 = f15 / 2.0f;
        if (f13 > f17) {
            f13 = f17;
        }
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f15 - (f13 * 2.0f);
        float f20 = f16 - (2.0f * f14);
        path.moveTo(f11, f10 + f14);
        if (z11) {
            float f21 = -f14;
            path.rQuadTo(0.0f, f21, -f13, f21);
        } else {
            path.rLineTo(0.0f, -f14);
            path.rLineTo(-f13, 0.0f);
        }
        path.rLineTo(-f19, 0.0f);
        if (z10) {
            float f22 = -f13;
            path.rQuadTo(f22, 0.0f, f22, f14);
        } else {
            path.rLineTo(-f13, 0.0f);
            path.rLineTo(0.0f, f14);
        }
        path.rLineTo(0.0f, f20);
        if (z13) {
            path.rQuadTo(0.0f, f14, f13, f14);
        } else {
            path.rLineTo(0.0f, f14);
            path.rLineTo(f13, 0.0f);
        }
        path.rLineTo(f19, 0.0f);
        if (z12) {
            path.rQuadTo(f13, 0.0f, f13, -f14);
        } else {
            path.rLineTo(f13, 0.0f);
            path.rLineTo(0.0f, -f14);
        }
        path.rLineTo(0.0f, -f20);
        path.close();
    }

    public static ValueAnimator e(float f9, float f10, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(y1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        if (this.d0 == null) {
            return;
        }
        float f9 = this.B0;
        j jVar = this.c0;
        this.C0 = f9 / (jVar.l - jVar.k);
        H();
        E(r(this.B, this.C), this.L0 ? s(this.B, this.C) : 0L, z10, z11, z12);
        if (this.q0 && !z11) {
            c(false);
            x((this.C0 * jVar.k) - g1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.E0 == null) {
                this.E0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.E0);
        }
    }

    public void C(int i10, int i11) {
        int i12 = this.o0;
        uf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        float f9 = this.C0;
        float f10 = (this.c0.k * f9) - g1;
        float f11 = (i10 + f10) / f9;
        if (f11 < 0.0f) {
            this.o0 = 0;
        } else if (f11 > 1.0f) {
            this.o0 = bVar.a.length - 1;
        } else {
            int b10 = bVar.b(f11, this.B, this.C);
            this.o0 = b10;
            int i13 = b10 + 1;
            float[] fArr = this.d0.b;
            if (i13 < fArr.length) {
                if (Math.abs(this.d0.b[this.o0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                    this.o0++;
                }
            }
        }
        int i14 = this.o0;
        int i15 = this.C;
        if (i14 > i15) {
            this.o0 = i15;
        }
        int i16 = this.o0;
        int i17 = this.B;
        if (i16 < i17) {
            this.o0 = i17;
        }
        if (i12 != this.o0) {
            this.q0 = true;
            c(true);
            x(f10);
            e eVar = this.M0;
            if (eVar != null) {
                getSelectedDate();
                d91 d91Var = (d91) ((zk0) eVar).b;
                d91Var.f();
                d91Var.b.p0.d(false, false);
            }
            B();
            invalidate();
        }
    }

    public boolean D(uf.b bVar) {
        boolean z10;
        uf.b bVar2 = this.d0;
        j jVar = this.c0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((uf.a) bVar.d.get(i10)));
                }
            }
            d();
            this.d0 = bVar;
            if (bVar != null) {
                if (bVar.a[0] == 0) {
                    jVar.k = 0.0f;
                    jVar.l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.m = minDistance;
                    float f9 = jVar.l;
                    if (f9 - jVar.k < minDistance) {
                        float f10 = f9 - minDistance;
                        jVar.k = f10;
                        if (f10 < 0.0f) {
                            jVar.k = 0.0f;
                            jVar.l = 1.0f;
                        }
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        w();
        if (bVar != null) {
            H();
            E(r(this.B, this.C), this.L0 ? s(this.B, this.C) : 0L, false, false, false);
            this.f0 = 0.0f;
            this.g0 = 2.14748365E9f;
            u();
            int i11 = bVar.j;
            if (i11 == 1 || i11 == 2) {
                this.p0.setSize(arrayList.size() * 2);
            } else {
                this.p0.setSize(arrayList.size());
            }
            this.D = true;
            I();
            return z10;
        }
        jVar.k = 0.7f;
        jVar.l = 1.0f;
        this.g0 = 0.0f;
        this.f0 = 0.0f;
        this.b.clear();
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.U.cancel();
        }
        return z10;
    }

    public final void E(long j10, long j11, boolean z10, boolean z11, boolean z12) {
        if ((Math.abs((((long) Math.ceil(((j10 <= 100 || ((float) (j10 / 5)) % 10.0f == 0.0f) ? j10 : ((j10 / 10) + 1) * 10) / 5.0f)) * 5) - this.x) < this.A || j10 == 0) && j10 == this.y) {
            return;
        }
        vf.d f9 = f(this.d0.i, j10, j11);
        long[] jArr = f9.a;
        long j12 = jArr[jArr.length - 1];
        long j13 = jArr[0];
        if (!z12) {
            float f10 = this.v - this.w;
            float f11 = j12 - j13;
            float f12 = f10 / f11;
            if (f12 > 1.0f) {
                f12 = f11 / f10;
            }
            double d = f12;
            float f13 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z13 = ((float) j12) != this.x;
            if (this.L0 && j13 != this.y) {
                z13 = true;
            }
            if (z13) {
                AnimatorSet animatorSet = this.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.T.cancel();
                }
                this.P0 = this.v;
                this.Q0 = this.w;
                this.N0 = 0.0f;
                this.O0 = 0.0f;
                this.R0 = f13;
            }
        }
        float f14 = j12;
        this.x = f14;
        float f15 = j13;
        this.y = f15;
        v();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.X0 >= 320 || z11) {
            this.X0 = currentTimeMillis;
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.U.cancel();
            }
            ArrayList arrayList = this.b;
            if (!z10) {
                this.v = f14;
                this.w = f15;
                arrayList.clear();
                arrayList.add(f9);
                f9.f = 255;
                return;
            }
            arrayList.add(f9);
            if (z12) {
                AnimatorSet animatorSet2 = this.T;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.T.cancel();
                }
                this.R0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.H0));
                if (this.L0) {
                    animatorSet3.playTogether(e(this.w, f15, this.I0));
                }
                this.T = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                vf.d dVar = (vf.d) arrayList.get(i10);
                if (dVar != f9) {
                    dVar.g = dVar.f;
                }
            }
            ValueAnimator e10 = e(0.0f, 255.0f, new b3(25, this, f9));
            this.U = e10;
            e10.addListener(new ok0(20, this, f9));
            this.U.start();
        }
    }

    public final void F() {
        float f9 = this.R0;
        if (f9 == 0.0f) {
            return;
        }
        float f10 = this.v;
        float f11 = this.x;
        if (f10 != f11) {
            float f12 = this.N0 + f9;
            this.N0 = f12;
            if (f12 > 1.0f) {
                this.N0 = 1.0f;
                this.v = f11;
            } else {
                float f13 = this.P0;
                this.v = (jr.g.getInterpolation(f12) * (f11 - f13)) + f13;
            }
            invalidate();
        }
        if (this.L0) {
            float f14 = this.w;
            float f15 = this.y;
            if (f14 != f15) {
                float f16 = this.O0 + this.R0;
                this.O0 = f16;
                if (f16 > 1.0f) {
                    this.O0 = 1.0f;
                    this.w = f15;
                } else {
                    float f17 = this.Q0;
                    this.w = (jr.g.getInterpolation(f16) * (f15 - f17)) + f17;
                }
                invalidate();
            }
        }
    }

    public final void G() {
        int i10 = this.t0 ? g6.Zi : g6.Yi;
        c6 c6Var = this.S0;
        int v02 = g6.v0(i10, c6Var);
        this.J.setColor(v02);
        this.K.setColor(g6.v0(this.t0 ? g6.Zi : g6.Yi, c6Var));
        int v03 = g6.v0(g6.Yi, c6Var);
        this.L.setColor(v03);
        int v04 = g6.v0(g6.aj, c6Var);
        Paint paint = this.H;
        paint.setColor(v04);
        int v05 = g6.v0(g6.bj, c6Var);
        Paint paint2 = this.I;
        paint2.setColor(v05);
        this.M.setColor(g6.v0(g6.dj, c6Var));
        this.N.setColor(g6.v0(g6.cj, c6Var));
        this.O.setColor(g6.v0(g6.d6, c6Var));
        this.P.setColor(g6.v0(g6.ej, c6Var));
        this.p0.b();
        this.n = paint.getAlpha();
        this.r = paint2.getAlpha();
        this.f = r2.getAlpha() / 255.0f;
        this.h = r3.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((vf.f) obj).a();
        }
        if (this.q0) {
            int i12 = this.o0;
            uf.b bVar = this.d0;
            long[] jArr = bVar.a;
            if (i12 < jArr.length) {
                this.p0.c(i12, jArr[i12], arrayList, false, bVar.j, bVar.h);
            }
        }
        this.D = true;
    }

    public final void H() {
        uf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        j jVar = this.c0;
        int c3 = bVar.c(Math.max(jVar.k, 0.0f));
        this.B = c3;
        int a2 = this.d0.a(Math.min(jVar.l, 1.0f), c3);
        this.C = a2;
        int i10 = this.B;
        if (a2 < i10) {
            this.C = i10;
        }
        vf.c cVar = this.f1;
        if (cVar != null) {
            long[] jArr = this.d0.a;
            cVar.b(jArr[i10], jArr[this.C]);
        }
        I();
    }

    public final void I() {
        uf.b bVar = this.d0;
        if (bVar != null) {
            float f9 = this.B0;
            if (f9 == 0.0f) {
                return;
            }
            int i10 = (int) ((f9 / (this.C0 * bVar.g)) / 6.0f);
            vf.b bVar2 = this.e0;
            if (bVar2 == null || i10 >= bVar2.b || i10 <= bVar2.c) {
                int highestOneBit = Integer.highestOneBit(i10) << 1;
                vf.b bVar3 = this.e0;
                if (bVar3 == null || bVar3.a != highestOneBit) {
                    ValueAnimator valueAnimator = this.V;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.V.cancel();
                    }
                    double d = highestOneBit;
                    double d10 = 0.2d * d;
                    vf.b bVar4 = new vf.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                    bVar4.d = 255;
                    vf.b bVar5 = this.e0;
                    ArrayList arrayList = this.c;
                    if (bVar5 == null) {
                        this.e0 = bVar4;
                        bVar4.d = 255;
                        arrayList.add(bVar4);
                        return;
                    }
                    this.e0 = bVar4;
                    this.i0 = arrayList.size();
                    for (int i11 = 0; i11 < this.i0; i11++) {
                        vf.b bVar6 = (vf.b) arrayList.get(i11);
                        bVar6.e = bVar6.d;
                    }
                    arrayList.add(bVar4);
                    if (arrayList.size() > 2) {
                        arrayList.remove(0);
                    }
                    ValueAnimator duration = e(0.0f, 1.0f, new b3(26, this, bVar4)).setDuration(200L);
                    this.V = duration;
                    duration.addListener(new ok0(21, this, bVar4));
                    this.V.start();
                }
            }
        }
    }

    public void J(uf.b bVar, long j10) {
        int length = bVar.a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.b;
        float f9 = fArr[i10];
        j jVar = this.c0;
        jVar.k = f9;
        jVar.l = fArr[i11];
    }

    public void K() {
        if (x1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vf.f fVar = (vf.f) obj;
                boolean z10 = fVar.n;
                uf.a aVar = fVar.a;
                if (z10) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 == 2147483647L || j10 == 0.0f) && (j11 <= 0 || j11 == this.h0)) {
                return;
            }
            this.h0 = j11;
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(e(this.f0, this.h0, this.F0), e(this.g0, 0.0f, this.G0));
            this.W = animatorSet;
            animatorSet.start();
        }
    }

    @Override // tf.i
    public void a(float f9, float f10, boolean z10) {
        uf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        if (!z10) {
            H();
            invalidate();
        } else {
            int c3 = bVar.c(Math.max(f9, 0.0f));
            int a2 = this.d0.a(Math.min(f10, 1.0f), c3);
            E(r(c3, a2), s(c3, a2), true, true, false);
            c(false);
        }
    }

    public final void c(boolean z10) {
        x((this.C0 * this.c0.k) - g1);
        if (this.e1 == z10) {
            return;
        }
        this.e1 = z10;
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.a0.cancel();
        }
        ValueAnimator duration = e(this.r0, z10 ? 1.0f : 0.0f, this.J0).setDuration(200L);
        this.a0 = duration;
        duration.addListener(this.K0);
        this.a0.start();
    }

    public final void d() {
        this.o0 = -1;
        this.q0 = false;
        this.e1 = false;
        this.p0.setVisibility(8);
        this.r0 = 0.0f;
    }

    public vf.d f(int i10, long j10, long j11) {
        return new vf.d(j10, j11, this.L0, this.d0.h, i10, this.J, this.K);
    }

    public vf.e g() {
        return new vf.e(getContext(), this.S0);
    }

    public long getEndDate() {
        return this.d0.a[this.C];
    }

    public float getMinDistance() {
        uf.b bVar = this.d0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f9 = 5.0f / length;
        if (f9 < 0.1f) {
            return 0.1f;
        }
        return f9;
    }

    public long getSelectedDate() {
        int i10 = this.o0;
        if (i10 < 0) {
            return -1L;
        }
        return this.d0.a[i10];
    }

    public long getStartDate() {
        return this.d0.a[this.B];
    }

    public abstract vf.f h(uf.a aVar);

    public void i(Canvas canvas) {
        if (this.d0 == null) {
            return;
        }
        int i10 = this.u0;
        float f9 = 1.0f;
        if (i10 == 2) {
            f9 = 1.0f - this.v0.f;
        } else if (i10 == 1) {
            f9 = this.v0.f;
        } else if (i10 == 3) {
            f9 = this.v0.f;
        }
        Paint paint = this.H;
        paint.setAlpha((int) (this.n * f9));
        int i11 = (int) (this.f * 255.0f * f9);
        TextPaint textPaint = this.J;
        textPaint.setAlpha(i11);
        this.K.setAlpha((int) (this.f * 255.0f * f9));
        int textSize = (int) (j1 - textPaint.getTextSize());
        float measuredHeight = (getMeasuredHeight() - this.s) - 1;
        canvas.drawLine(this.z0, measuredHeight, this.A0, measuredHeight, paint);
        if (this.L0) {
            return;
        }
        canvas.drawText("0", g1, r1 - textSize, textPaint);
    }

    public void j(Canvas canvas) {
        int i10;
        if (this.d0 == null) {
            return;
        }
        ArrayList arrayList = this.c;
        this.i0 = arrayList.size();
        int i11 = this.u0;
        float f9 = 1.0f;
        int i12 = 1;
        float f10 = i11 == 2 ? 1.0f - this.v0.f : i11 == 1 ? this.v0.f : i11 == 3 ? this.v0.f : 1.0f;
        char c3 = 0;
        this.j0 = 0;
        while (true) {
            int i13 = this.j0;
            if (i13 >= this.i0) {
                return;
            }
            int i14 = ((vf.b) arrayList.get(i13)).d;
            int i15 = ((vf.b) arrayList.get(this.j0)).a;
            if (i15 == 0) {
                i15 = 1;
            }
            int i16 = this.B - this.k0;
            while (i16 % i15 != 0) {
                i16--;
            }
            int i17 = this.C - this.k0;
            while (true) {
                if (i17 % i15 == 0 && i17 >= this.d0.a.length - i12) {
                    break;
                }
                i17++;
                i14 = i14;
                c3 = 0;
                f9 = 1.0f;
                i12 = 1;
            }
            int i18 = this.k0;
            int i19 = i16 + i18;
            int i20 = i17 + i18;
            float f11 = this.C0 * this.c0.k;
            float f12 = g1;
            float f13 = f11 - f12;
            while (i19 < i20) {
                if (i19 >= 0) {
                    long[] jArr = this.d0.a;
                    if (i19 < jArr.length - i12) {
                        long j10 = jArr[i19];
                        long j11 = jArr[c3];
                        i10 = i14;
                        float f14 = (((j10 - j11) / (jArr[jArr.length - i12] - j11)) * this.C0) - f13;
                        float f15 = f14 - p1;
                        if (f15 > 0.0f) {
                            float f16 = this.B0;
                            if (f15 <= f16 + f12) {
                                float f17 = l1;
                                TextPaint textPaint = this.L;
                                if (f15 < f17) {
                                    textPaint.setAlpha((int) (i10 * x3.a(f17, f15, f17, f9) * this.h * f10));
                                } else if (f15 > f16) {
                                    textPaint.setAlpha((int) (i10 * x3.a(f15, f16, f12, f9) * this.h * f10));
                                } else {
                                    textPaint.setAlpha((int) (i10 * this.h * f10));
                                }
                                uf.b bVar = this.d0;
                                String[] strArr = bVar.c;
                                long[] jArr2 = bVar.a;
                                canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.s) + k1, textPaint);
                                i19 += i15;
                                i14 = i10;
                                c3 = 0;
                                f9 = 1.0f;
                                i12 = 1;
                            }
                        }
                        i19 += i15;
                        i14 = i10;
                        c3 = 0;
                        f9 = 1.0f;
                        i12 = 1;
                    }
                }
                i10 = i14;
                i19 += i15;
                i14 = i10;
                c3 = 0;
                f9 = 1.0f;
                i12 = 1;
            }
            this.j0++;
            c3 = 0;
            f9 = 1.0f;
            i12 = 1;
        }
    }

    public abstract void k(Canvas canvas);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0081 A[LOOP:0: B:10:0x007f->B:11:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Canvas canvas, vf.d dVar) {
        float f9;
        int i10;
        int i11;
        int length = dVar.a.length;
        float f10 = 1.0f;
        if (length > 2) {
            float f11 = (r0[1] - r0[0]) / (this.v - this.w);
            if (f11 < 0.1d) {
                f9 = f11 / 0.1f;
                i10 = this.u0;
                if (i10 != 2) {
                    f10 = 1.0f - this.v0.f;
                } else if (i10 == 1) {
                    f10 = this.v0.f;
                } else if (i10 == 3) {
                    f10 = this.v0.f;
                }
                Paint paint = this.H;
                paint.setAlpha((int) ((this.n / 255.0f) * dVar.f * f10 * f9));
                this.J.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9));
                this.K.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9));
                int measuredHeight = (getMeasuredHeight() - this.s) - j1;
                for (i11 = !this.L0 ? 1 : 0; i11 < length; i11++) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f12 = dVar.a[i11];
                    float f13 = this.w;
                    canvas.drawRect(this.z0, (int) (measuredHeight2 - (((f12 - f13) / (this.v - f13)) * measuredHeight)), this.A0, r4 + 1, paint);
                }
            }
        }
        f9 = 1.0f;
        i10 = this.u0;
        if (i10 != 2) {
        }
        Paint paint2 = this.H;
        paint2.setAlpha((int) ((this.n / 255.0f) * dVar.f * f10 * f9));
        this.J.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9));
        this.K.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9));
        int measuredHeight3 = (getMeasuredHeight() - this.s) - j1;
        while (i11 < length) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Canvas canvas) {
        float f9;
        int i10;
        int i11;
        uf.b bVar;
        int i12;
        int i13;
        int i14;
        char c3;
        Paint paint;
        Canvas canvas2;
        float f10;
        int i15;
        h hVar;
        h hVar2;
        int i16;
        float f11;
        boolean z10;
        boolean z11;
        Paint paint2;
        ValueAnimator valueAnimator;
        if (this.d0 == null) {
            return;
        }
        float f12 = this.y0;
        j jVar = this.c0;
        jVar.b = f12;
        int measuredHeight = getMeasuredHeight();
        int i17 = m1;
        int i18 = measuredHeight - i17;
        int measuredHeight2 = getMeasuredHeight();
        int i19 = this.x0;
        int i20 = (measuredHeight2 - i19) - i17;
        float f13 = this.y0;
        float f14 = jVar.k * f13;
        float f15 = g1;
        int i21 = (int) (f14 + f15);
        int i22 = (int) ((jVar.l * f13) + f15);
        int i23 = this.u0;
        if (i23 == 1) {
            vf.j jVar2 = this.v0;
            int i24 = (int) ((jVar2.a * f13) + f15);
            int i25 = (int) ((f13 * jVar2.b) + f15);
            float f16 = 1.0f - jVar2.f;
            i21 = (int) (((i24 - i21) * f16) + i21);
            i22 = (int) ((f16 * (i25 - i22)) + i22);
        } else if (i23 == 3) {
            f9 = this.v0.f;
            i10 = i21;
            i11 = i22;
            bVar = this.d0;
            int i26 = q1;
            Paint paint3 = this.N;
            Paint paint4 = this.G;
            if (bVar == null) {
                if (i23 == 0) {
                    int i27 = 0;
                    while (true) {
                        ArrayList arrayList = this.d;
                        f11 = f9;
                        if (i27 >= arrayList.size()) {
                            break;
                        }
                        vf.f fVar = (vf.f) arrayList.get(i27);
                        ValueAnimator valueAnimator2 = fVar.h;
                        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && ((valueAnimator = fVar.i) == null || !valueAnimator.isRunning())) {
                            i27++;
                            f9 = f11;
                        }
                    }
                    z10 = true;
                    if (z10) {
                        z11 = z10;
                        if (this.D) {
                            this.l0.eraseColor(0);
                            n(this.m0);
                            this.D = false;
                            if (z11) {
                                paint2 = paint3;
                                i12 = i17;
                            } else {
                                int i28 = this.u0;
                                if (i28 == 2) {
                                    float f17 = this.y0;
                                    vf.j jVar3 = this.v0;
                                    float f18 = (jVar3.c * f17) + f15;
                                    paint4.setAlpha((int) ((1.0f - jVar3.f) * 255.0f));
                                    canvas.save();
                                    paint2 = paint3;
                                    i12 = i17;
                                    canvas.clipRect(f15, i20, getMeasuredWidth() - f15, i18);
                                    canvas.scale((this.v0.f * 2.0f) + 1.0f, 1.0f, f18, ((i18 - i20) + i20) >> 1);
                                    canvas.drawBitmap(this.l0, f15, (getMeasuredHeight() - i12) - i19, paint4);
                                    canvas.restore();
                                } else {
                                    paint2 = paint3;
                                    i12 = i17;
                                    if (i28 == 1) {
                                        float f19 = ((i18 - i20) + i20) >> 1;
                                        float f20 = this.y0;
                                        vf.j jVar4 = this.v0;
                                        float f21 = jVar4.c;
                                        float f22 = f20 * f21;
                                        float f23 = f22 + f15;
                                        if (f21 <= 0.5f) {
                                            f22 = (1.0f - f21) * f20;
                                        }
                                        float f24 = f22 * jVar4.f;
                                        canvas.save();
                                        i13 = i26;
                                        canvas.clipRect(f23 - f24, i20, f24 + f23, i18);
                                        paint4.setAlpha((int) (this.v0.f * 255.0f));
                                        canvas.scale(this.v0.f, 1.0f, f23, f19);
                                        canvas.drawBitmap(this.l0, f15, (getMeasuredHeight() - i12) - i19, paint4);
                                        canvas.restore();
                                    } else {
                                        i13 = i26;
                                        paint4.setAlpha((int) (f11 * 255.0f));
                                        canvas.drawBitmap(this.l0, f15, (getMeasuredHeight() - i12) - i19, paint4);
                                    }
                                    if (this.u0 != 2) {
                                        return;
                                    }
                                    float f25 = i20;
                                    float f26 = i18;
                                    float f27 = g1;
                                    paint = paint4;
                                    Paint paint5 = paint2;
                                    i14 = 2;
                                    c3 = 0;
                                    canvas.drawRect(f27, f25, i10 + i13, f26, paint5);
                                    canvas2 = canvas;
                                    canvas2.drawRect(i11 - i13, f25, getMeasuredWidth() - f27, f26, paint5);
                                    f10 = f15;
                                }
                            }
                            i13 = i26;
                            if (this.u0 != 2) {
                            }
                        }
                    } else {
                        canvas.save();
                        z11 = z10;
                        canvas.clipRect(f15, (getMeasuredHeight() - i17) - i19, getMeasuredWidth() - f15, getMeasuredHeight() - i17);
                        canvas.translate(f15, (getMeasuredHeight() - i17) - i19);
                        n(canvas);
                        canvas.restore();
                    }
                    if (z11) {
                    }
                    i13 = i26;
                    if (this.u0 != 2) {
                    }
                } else {
                    f11 = f9;
                }
                z10 = false;
                if (z10) {
                }
                if (z11) {
                }
                i13 = i26;
                if (this.u0 != 2) {
                }
            } else {
                i12 = i17;
                i13 = i26;
                i14 = 2;
                c3 = 0;
                paint = paint4;
                canvas2 = canvas;
                f10 = f15;
                canvas2.drawRect(f10, i20, getMeasuredWidth() - f15, i18, paint3);
            }
            canvas2.drawBitmap(this.a.a(i19, (int) (getMeasuredWidth() - (f10 * 2.0f))), f10, (getMeasuredHeight() - i12) - i19, paint);
            if (this.d0 == null) {
                Rect rect = this.R;
                rect.set(i10, i20, i11, i18);
                jVar.j.set(rect);
                int i29 = rect.left;
                int i30 = rect.top;
                float f28 = rect.bottom + v1;
                float f29 = r1;
                Path path = this.S;
                b(path, i29, i30 - r12, i29 + i13, f28, f29, f29, true, false, false, true);
                Paint paint6 = this.M;
                canvas2.drawPath(path, paint6);
                b(path, r3 - i13, rect.top - r12, rect.right, rect.bottom + r12, f29, f29, false, true, true, false);
                canvas2.drawPath(path, paint6);
                canvas2.drawRect(rect.left + i13, rect.bottom, rect.right - i13, r3 + r12, paint6);
                canvas.drawRect(rect.left + i13, r1 - r12, rect.right - i13, rect.top, paint6);
                int i31 = rect.left;
                int i32 = s1;
                float centerY = rect.centerY() - i32;
                float f30 = rect.left + i32;
                float centerY2 = rect.centerY() + i32;
                Paint paint7 = this.Q;
                canvas.drawLine(i31 + i32, centerY, f30, centerY2, paint7);
                canvas.drawLine(rect.right - i32, rect.centerY() - i32, rect.right - i32, rect.centerY() + i32, paint7);
                h[] hVarArr = jVar.n;
                h hVar3 = hVarArr[c3];
                if (hVar3 == null || hVar3.a != 4) {
                    i15 = 1;
                    hVar = hVarArr[1];
                    if (hVar == null || hVar.a != 4) {
                        hVar = null;
                    }
                } else {
                    hVar = hVar3;
                    i15 = 1;
                }
                int i33 = rect.bottom;
                int i34 = rect.top;
                int i35 = (i33 - i34) >> i15;
                int i36 = i34 + i35;
                if (hVar == null) {
                    if (hVar3 == null || hVar3.a != i15) {
                        hVar2 = hVarArr[i15];
                        if (hVar2 == null || hVar2.a != i15) {
                            hVar2 = null;
                        }
                    } else {
                        hVar2 = hVar3;
                    }
                    if ((hVar3 == null || hVar3.a != i14) && ((hVar3 = hVarArr[i15]) == null || hVar3.a != i14)) {
                        hVar3 = null;
                    }
                    Paint paint8 = this.P;
                    int i37 = u1;
                    int i38 = t1;
                    if (hVar2 != null) {
                        i16 = i38;
                        canvas.drawCircle(rect.left + i38, i36, (i35 * hVar2.f) - i37, paint8);
                    } else {
                        i16 = i38;
                    }
                    if (hVar3 != null) {
                        canvas.drawCircle(rect.right - i16, i36, (i35 * hVar3.f) - i37, paint8);
                    }
                }
                Rect rect2 = jVar.h;
                int i39 = n1;
                int i40 = i39 >> 1;
                rect2.set(i10 - i39, i20, i10 + i40, i18);
                jVar.i.set(i11 - i40, i20, i11 + i39, i18);
                return;
            }
            return;
        }
        i10 = i21;
        i11 = i22;
        f9 = 1.0f;
        bVar = this.d0;
        int i262 = q1;
        Paint paint32 = this.N;
        Paint paint42 = this.G;
        if (bVar == null) {
        }
        canvas2.drawBitmap(this.a.a(i19, (int) (getMeasuredWidth() - (f10 * 2.0f))), f10, (getMeasuredHeight() - i12) - i19, paint);
        if (this.d0 == null) {
        }
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        uf.b bVar;
        int i10 = this.o0;
        if (i10 < 0 || !this.q0 || (bVar = this.d0) == null) {
            return;
        }
        int i11 = (int) (this.r * this.r0);
        float f9 = this.B0;
        j jVar = this.c0;
        float f10 = jVar.l;
        float f11 = jVar.k;
        float f12 = f9 / (f10 - f11);
        float f13 = (f11 * f12) - g1;
        float[] fArr = bVar.b;
        if (i10 >= fArr.length) {
            return;
        }
        float f14 = (fArr[i10] * f12) - f13;
        Paint paint = this.I;
        paint.setAlpha(i11);
        canvas.drawLine(f14, 0.0f, f14, this.D0.bottom, paint);
        if (!this.e) {
            return;
        }
        ArrayList arrayList = this.d;
        this.i0 = arrayList.size();
        int i12 = 0;
        while (true) {
            this.j0 = i12;
            int i13 = this.j0;
            if (i13 >= this.i0) {
                return;
            }
            vf.f fVar = (vf.f) arrayList.get(i13);
            boolean z10 = fVar.n;
            Paint paint2 = fVar.d;
            if (z10 || fVar.o != 0.0f) {
                float f15 = fVar.a.a[this.o0];
                float f16 = this.w;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.s) - j1));
                paint2.setAlpha((int) (fVar.o * 255.0f * this.r0));
                int i14 = (int) (fVar.o * 255.0f * this.r0);
                Paint paint3 = this.O;
                paint3.setAlpha(i14);
                canvas.drawPoint(f14, measuredHeight, paint2);
                canvas.drawPoint(f14, measuredHeight, paint3);
            }
            i12 = this.j0 + 1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.s0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.D0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.b;
        this.i0 = arrayList.size();
        int i10 = 0;
        this.j0 = 0;
        while (true) {
            int i11 = this.j0;
            if (i11 >= this.i0) {
                break;
            }
            l(canvas, (vf.d) arrayList.get(i11));
            this.j0++;
        }
        k(canvas);
        while (true) {
            this.j0 = i10;
            int i12 = this.j0;
            if (i12 >= this.i0) {
                canvas.restoreToCount(save);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            p(canvas, (vf.d) arrayList.get(i12));
            i10 = this.j0 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.E) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.T0;
        int i13 = this.x0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.U0) {
            this.T0 = getMeasuredWidth();
            this.U0 = getMeasuredHeight();
            float measuredWidth2 = getMeasuredWidth();
            float f9 = g1;
            float f10 = 2.0f * f9;
            this.l0 = Bitmap.createBitmap((int) (measuredWidth2 - f10), i13, Bitmap.Config.ARGB_4444);
            this.m0 = new Canvas(this.l0);
            this.a.a(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.q0) {
                x((this.C0 * this.c0.k) - f9);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = m1;
            this.V0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.W0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.d0 != null) {
            boolean z10 = this.F;
            j jVar = this.c0;
            if (!z10) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.n0 = false;
                return false;
            }
            int x4 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y8 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.D0;
            if (actionMasked == 0) {
                this.c1 = System.currentTimeMillis();
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!jVar.a(x4, y8, motionEvent.getActionIndex())) {
                    this.Y0 = x4;
                    this.a1 = x4;
                    this.Z0 = y8;
                    this.b1 = y8;
                    if (rectF.contains(x4, y8)) {
                        if (this.o0 < 0 || !this.e1) {
                            this.n0 = true;
                            C(x4, y8);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = x4 - this.Y0;
                    int i11 = y8 - this.Z0;
                    if (jVar.n[0] != null || jVar.c) {
                        boolean b10 = jVar.b(x4, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            int x10 = (int) motionEvent.getX(1);
                            motionEvent.getY(1);
                            jVar.b(x10, 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                    boolean z11 = this.n0;
                    int i12 = this.w0;
                    if (z11) {
                        boolean z12 = (this.d1 && System.currentTimeMillis() - this.c1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12;
                        this.Y0 = x4;
                        this.Z0 = y8;
                        getParent().requestDisallowInterceptTouchEvent(z12);
                        C(x4, y8);
                        return true;
                    }
                    if (rectF.contains(this.a1, this.b1)) {
                        int i13 = this.a1 - x4;
                        int i14 = this.b1 - y8;
                        if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.c1 > 200) {
                            this.n0 = true;
                            C(x4, y8);
                            return true;
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return jVar.a(x4, y8, motionEvent.getActionIndex());
                    }
                    if (actionMasked == 6) {
                        jVar.c(motionEvent.getActionIndex(), motionEvent);
                        return true;
                    }
                }
            }
            if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                if (rectF.contains(this.a1, this.b1) && !this.n0) {
                    c(false);
                }
                h[] hVarArr = jVar.n;
                h hVar = hVarArr[0];
                if (hVar != null && (valueAnimator2 = hVar.e) != null) {
                    valueAnimator2.cancel();
                }
                h hVar2 = hVarArr[1];
                if (hVar2 != null && (valueAnimator = hVar2.e) != null) {
                    valueAnimator.cancel();
                }
                hVarArr[0] = null;
                hVarArr[1] = null;
                I();
                getParent().requestDisallowInterceptTouchEvent(false);
                this.n0 = false;
                y();
                invalidate();
                E(r(this.B, this.C), this.L0 ? s(this.B, this.C) : 0L, true, true, false);
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(Canvas canvas, vf.d dVar) {
        float f9;
        int i10;
        int i11;
        TextPaint textPaint;
        vf.d dVar2;
        int length = dVar.a.length;
        float f10 = 1.0f;
        if (length > 2) {
            float f11 = (r0[1] - r0[0]) / (this.v - this.w);
            if (f11 < 0.1d) {
                f9 = f11 / 0.1f;
                i10 = this.u0;
                if (i10 != 2) {
                    f10 = 1.0f - this.v0.f;
                } else if (i10 == 1) {
                    f10 = this.v0.f;
                } else if (i10 == 3) {
                    f10 = this.v0.f;
                }
                this.H.setAlpha((int) ((this.n / 255.0f) * dVar.f * f10 * f9));
                int C = (int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9);
                TextPaint textPaint2 = this.J;
                textPaint2.setAlpha(C);
                int C2 = (int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9);
                TextPaint textPaint3 = this.K;
                textPaint3.setAlpha(C2);
                int measuredHeight = getMeasuredHeight() - this.s;
                int i12 = j1;
                int i13 = measuredHeight - i12;
                int textSize = (int) (i12 - textPaint2.getTextSize());
                i11 = 1 ^ (this.L0 ? 1 : 0);
                while (i11 < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f12 = dVar.a[i11];
                    float f13 = this.w;
                    float f14 = ((int) (measuredHeight2 - (((f12 - f13) / (this.v - f13)) * i13))) - textSize;
                    float f15 = g1;
                    vf.d dVar3 = dVar;
                    int i14 = i11;
                    Canvas canvas2 = canvas;
                    dVar3.a(canvas2, 0, i14, f15, f14, textPaint2);
                    if (dVar3.c != null) {
                        float measuredWidth = getMeasuredWidth() - f15;
                        textPaint = textPaint3;
                        dVar2 = dVar3;
                        dVar2.a(canvas2, 1, i14, measuredWidth, f14, textPaint);
                    } else {
                        textPaint = textPaint3;
                        dVar2 = dVar3;
                    }
                    i11 = i14 + 1;
                    dVar = dVar2;
                    canvas = canvas2;
                    textPaint3 = textPaint;
                }
            }
        }
        f9 = 1.0f;
        i10 = this.u0;
        if (i10 != 2) {
        }
        this.H.setAlpha((int) ((this.n / 255.0f) * dVar.f * f10 * f9));
        int C3 = (int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9);
        TextPaint textPaint22 = this.J;
        textPaint22.setAlpha(C3);
        int C22 = (int) com.google.android.recaptcha.internal.a.C(dVar.f, this.f, f10, f9);
        TextPaint textPaint32 = this.K;
        textPaint32.setAlpha(C22);
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i122 = j1;
        int i132 = measuredHeight3 - i122;
        int textSize2 = (int) (i122 - textPaint22.getTextSize());
        i11 = 1 ^ (this.L0 ? 1 : 0);
        while (i11 < length) {
        }
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((vf.f) arrayList.get(i12)).n) {
                long rMaxQ = ((vf.f) arrayList.get(i12)).a.b.rMaxQ(i10, i11);
                if (rMaxQ > j10) {
                    j10 = rMaxQ;
                }
            }
        }
        return j10;
    }

    public long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((vf.f) arrayList.get(i12)).n) {
                long rMinQ = ((vf.f) arrayList.get(i12)).a.b.rMinQ(i10, i11);
                if (rMinQ < j10) {
                    j10 = rMinQ;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(e eVar) {
        this.M0 = eVar;
    }

    public void setHeader(vf.c cVar) {
        this.f1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.E = z10;
    }

    public void t() {
        this.H.setStrokeWidth(1.0f);
        this.I.setStrokeWidth(h1);
        TextPaint textPaint = this.J;
        float f9 = i1;
        textPaint.setTextSize(f9);
        TextPaint textPaint2 = this.K;
        textPaint2.setTextSize(f9);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.L;
        textPaint3.setTextSize(f9);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float dpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.O;
        paint.setStrokeWidth(dpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        vf.e g10 = g();
        this.p0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.Q;
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            vf.f fVar = (vf.f) obj;
            boolean z10 = fVar.n;
            uf.a aVar = fVar.a;
            if (z10) {
                long j10 = aVar.e;
                if (j10 > this.f0) {
                    this.f0 = j10;
                }
            }
            if (z10) {
                long j11 = aVar.f;
                if (j11 < this.g0) {
                    this.g0 = j11;
                }
            }
            float f9 = this.f0;
            float f10 = this.g0;
            if (f9 == f10) {
                this.f0 = f9 + 1.0f;
                this.g0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.s;
        float f9 = this.x;
        if (f9 == 0.0f || measuredHeight == 0) {
            return;
        }
        this.A = (f9 / measuredHeight) * i1;
    }

    public final void w() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f9 = g1;
        this.y0 = measuredWidth - (2.0f * f9);
        this.z0 = f9;
        float measuredWidth2 = getMeasuredWidth() - (this.E ? o1 : f9);
        this.A0 = measuredWidth2;
        float f10 = measuredWidth2 - this.z0;
        this.B0 = f10;
        j jVar = this.c0;
        this.C0 = f10 / (jVar.l - jVar.k);
        I();
        this.s = AndroidUtilities.dp(100.0f);
        this.D0.set(this.z0 - f9, 0.0f, this.A0 + f9, getMeasuredHeight() - this.s);
        if (this.d0 != null) {
            this.k0 = (int) (AndroidUtilities.dp(20.0f) / (this.y0 / this.d0.a.length));
        }
        v();
    }

    public final void x(float f9) {
        int i10;
        uf.b bVar = this.d0;
        if (bVar == null || (i10 = this.o0) < 0) {
            return;
        }
        long[] jArr = bVar.a;
        if (i10 >= jArr.length || !this.q0) {
            return;
        }
        this.p0.c(i10, jArr[i10], this.d, false, bVar.j, bVar.h);
        this.p0.setVisibility(0);
        this.p0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
        float f10 = (this.d0.b[this.o0] * this.C0) - f9;
        float width = f10 > (this.z0 + this.B0) / 2.0f ? f10 - (this.p0.getWidth() + r1) : f10 + t1;
        if (width < 0.0f) {
            width = 0.0f;
        } else if (this.p0.getMeasuredWidth() + width > getMeasuredWidth()) {
            width = getMeasuredWidth() - this.p0.getMeasuredWidth();
        }
        this.p0.setTranslationX(width);
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.j0 = i10;
            int i11 = this.j0;
            if (i11 >= this.i0) {
                break;
            }
            final vf.f fVar = (vf.f) arrayList.get(i11);
            if (fVar.n && (valueAnimator3 = fVar.i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.n && fVar.o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    final int i12 = 0;
                    ValueAnimator e10 = e(fVar.o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: tf.c
                        public final /* synthetic */ g b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (i12) {
                                case 0:
                                    g gVar = this.b;
                                    gVar.getClass();
                                    fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.D = true;
                                    gVar.invalidate();
                                    break;
                                default:
                                    g gVar2 = this.b;
                                    gVar2.getClass();
                                    fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.D = true;
                                    gVar2.invalidate();
                                    break;
                            }
                        }
                    });
                    fVar.h = e10;
                    e10.start();
                } else {
                    i10 = this.j0 + 1;
                }
            }
            if (!fVar.n && fVar.o != 0.0f && ((valueAnimator = fVar.i) == null || !valueAnimator.isRunning())) {
                final int i13 = 1;
                ValueAnimator e11 = e(fVar.o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: tf.c
                    public final /* synthetic */ g b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (i13) {
                            case 0:
                                g gVar = this.b;
                                gVar.getClass();
                                fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.D = true;
                                gVar.invalidate();
                                break;
                            default:
                                g gVar2 = this.b;
                                gVar2.getClass();
                                fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.D = true;
                                gVar2.invalidate();
                                break;
                        }
                    }
                });
                fVar.i = e11;
                e11.start();
            }
            i10 = this.j0 + 1;
        }
        K();
        if (this.q0) {
            vf.e eVar = this.p0;
            int i14 = this.o0;
            uf.b bVar = this.d0;
            eVar.c(i14, bVar.a[i14], arrayList, true, bVar.j, bVar.h);
        }
    }

    public void q(vf.j jVar) {
    }

    public void y() {
    }
}
