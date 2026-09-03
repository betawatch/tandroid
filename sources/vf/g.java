package vf;

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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.kl0;
import org.telegram.ui.y91;
import ph.j2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class g extends View implements i {
    public static final float h1 = AndroidUtilities.dpf2(16.0f);
    public static final float i1 = AndroidUtilities.dpf2(1.5f);
    public static final float j1 = AndroidUtilities.dpf2(12.0f);
    public static final int k1 = AndroidUtilities.dp(18.0f);
    public static final int l1 = AndroidUtilities.dp(14.0f);
    public static final int m1 = AndroidUtilities.dp(10.0f);
    public static final int n1 = AndroidUtilities.dp(16.0f);
    public static final int o1 = AndroidUtilities.dp(24.0f);
    public static final int p1 = AndroidUtilities.dp(16.0f);
    public static final int q1 = AndroidUtilities.dp(10.0f);
    public static final int r1 = AndroidUtilities.dp(12.0f);
    public static final int s1 = AndroidUtilities.dp(8.0f);
    public static final int t1 = AndroidUtilities.dp(6.0f);
    public static final int u1 = AndroidUtilities.dp(5.0f);
    public static final int v1 = AndroidUtilities.dp(2.0f);
    public static final int w1 = AndroidUtilities.dp(1.0f);
    public static final boolean x1;
    public static final boolean y1;
    public static final u1.a z1;
    public float A0;
    public float B;
    public float B0;
    public int C;
    public float C0;
    public int D;
    public float D0;
    public boolean E;
    public final RectF E0;
    public boolean F;
    public VibrationEffect F0;
    public boolean G;
    public final d G0;
    public final Paint H;
    public final d H0;
    public final Paint I;
    public final b I0;
    public final Paint J;
    public final b J0;
    public final TextPaint K;
    public final d K0;
    public final TextPaint L;
    public final j2 L0;
    public final TextPaint M;
    public boolean M0;
    public final Paint N;
    public e N0;
    public final Paint O;
    public float O0;
    public final Paint P;
    public float P0;
    public final Paint Q;
    public float Q0;
    public final Paint R;
    public float R0;
    public final Rect S;
    public float S0;
    public final Path T;
    public final f6 T0;
    public AnimatorSet U;
    public int U0;
    public ValueAnimator V;
    public int V0;
    public ValueAnimator W;
    public final Rect W0;
    public final ArrayList X0;
    public long Y0;
    public int Z0;
    public f a;
    public Animator a0;
    public int a1;
    public final ArrayList b;
    public ValueAnimator b0;
    public int b1;
    public final ArrayList c;
    public boolean c0;
    public int c1;
    public final ArrayList d;
    public final j d0;
    public long d1;
    public boolean e;
    public wf.b e0;
    public boolean e1;
    public float f;
    public xf.b f0;
    public boolean f1;
    public float g0;
    public xf.c g1;
    public float h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public int l0;
    public Bitmap m0;
    public int n;
    public Canvas n0;
    public boolean o0;
    public int p0;
    public xf.e q0;
    public int r;
    public boolean r0;
    public int s;
    public float s0;
    public boolean t0;
    public boolean u0;
    public float v;
    public int v0;
    public float w;
    public xf.j w0;
    public float x;
    public final int x0;
    public float y;
    public final int y0;
    public float z0;

    static {
        int i10 = Build.VERSION.SDK_INT;
        x1 = i10 < 28;
        y1 = i10 > 21;
        z1 = new u1.a();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [vf.b] */
    /* JADX WARN: Type inference failed for: r1v9, types: [vf.b] */
    public g(Context context, f6 f6Var) {
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
        this.B = 0.0f;
        this.E = true;
        final int i11 = 0;
        this.F = false;
        this.G = true;
        this.H = new Paint();
        this.I = new Paint();
        this.J = new Paint();
        this.K = new TextPaint(1);
        this.L = new TextPaint(1);
        this.M = new TextPaint(1);
        this.N = new Paint(1);
        this.O = new Paint();
        this.P = new Paint(1);
        this.Q = new Paint(1);
        this.R = new Paint(1);
        this.S = new Rect();
        this.T = new Path();
        this.c0 = false;
        j jVar = new j();
        jVar.h = new Rect();
        jVar.i = new Rect();
        jVar.j = new Rect();
        jVar.k = 0.7f;
        jVar.l = 1.0f;
        jVar.m = 0.1f;
        jVar.n = new h[]{null, null};
        jVar.a = this;
        this.d0 = jVar;
        this.o0 = false;
        this.p0 = -1;
        this.r0 = false;
        this.s0 = 0.0f;
        this.t0 = false;
        this.u0 = false;
        this.v0 = 0;
        this.y0 = AndroidUtilities.dp(46.0f);
        this.E0 = new RectF();
        this.G0 = new d(this, i11);
        this.H0 = new d(this, i10);
        this.I0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: vf.b
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
        this.J0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: vf.b
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
        this.K0 = new d(this, 2);
        this.L0 = new j2(this, 11);
        this.M0 = false;
        this.U0 = 0;
        this.V0 = 0;
        Rect rect = new Rect();
        this.W0 = rect;
        ArrayList arrayList = new ArrayList();
        this.X0 = arrayList;
        arrayList.add(rect);
        this.Y0 = 0L;
        this.f1 = false;
        this.T0 = f6Var;
        t();
        this.x0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z4, boolean z10, boolean z11, boolean z12) {
        path.reset();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f20 = f16 - (f14 * 2.0f);
        float f21 = f17 - (2.0f * f15);
        path.moveTo(f12, f11 + f15);
        if (z10) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z4) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        if (z12) {
            path.rQuadTo(0.0f, f15, f14, f15);
        } else {
            path.rLineTo(0.0f, f15);
            path.rLineTo(f14, 0.0f);
        }
        path.rLineTo(f20, 0.0f);
        if (z11) {
            path.rQuadTo(f14, 0.0f, f14, -f15);
        } else {
            path.rLineTo(f14, 0.0f);
            path.rLineTo(0.0f, -f15);
        }
        path.rLineTo(0.0f, -f21);
        path.close();
    }

    public static ValueAnimator e(float f10, float f11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(z1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z4, boolean z10, boolean z11) {
        if (this.e0 == null) {
            return;
        }
        float f10 = this.C0;
        j jVar = this.d0;
        this.D0 = f10 / (jVar.l - jVar.k);
        H();
        E(r(this.C, this.D), this.M0 ? s(this.C, this.D) : 0L, z4, z10, z11);
        if (this.r0 && !z10) {
            c(false);
            x((this.D0 * jVar.k) - h1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.F0 == null) {
                this.F0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.F0);
        }
    }

    public void C(int i10, int i11) {
        int i12 = this.p0;
        wf.b bVar = this.e0;
        if (bVar == null) {
            return;
        }
        float f10 = this.D0;
        float f11 = (this.d0.k * f10) - h1;
        float f12 = (i10 + f11) / f10;
        if (f12 < 0.0f) {
            this.p0 = 0;
        } else if (f12 > 1.0f) {
            this.p0 = bVar.a.length - 1;
        } else {
            int b10 = bVar.b(f12, this.C, this.D);
            this.p0 = b10;
            int i13 = b10 + 1;
            float[] fArr = this.e0.b;
            if (i13 < fArr.length) {
                if (Math.abs(this.e0.b[this.p0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                    this.p0++;
                }
            }
        }
        int i14 = this.p0;
        int i15 = this.D;
        if (i14 > i15) {
            this.p0 = i15;
        }
        int i16 = this.p0;
        int i17 = this.C;
        if (i16 < i17) {
            this.p0 = i17;
        }
        if (i12 != this.p0) {
            this.r0 = true;
            c(true);
            x(f11);
            e eVar = this.N0;
            if (eVar != null) {
                getSelectedDate();
                y91 y91Var = (y91) ((kl0) eVar).b;
                y91Var.f();
                y91Var.b.q0.d(false, false);
            }
            B();
            invalidate();
        }
    }

    public boolean D(wf.b bVar) {
        boolean z4;
        wf.b bVar2 = this.e0;
        j jVar = this.d0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((wf.a) bVar.d.get(i10)));
                }
            }
            d();
            this.e0 = bVar;
            if (bVar != null) {
                if (bVar.a[0] == 0) {
                    jVar.k = 0.0f;
                    jVar.l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.m = minDistance;
                    float f10 = jVar.l;
                    if (f10 - jVar.k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.k = f11;
                        if (f11 < 0.0f) {
                            jVar.k = 0.0f;
                            jVar.l = 1.0f;
                        }
                    }
                }
            }
            z4 = true;
        } else {
            z4 = false;
        }
        w();
        if (bVar != null) {
            H();
            E(r(this.C, this.D), this.M0 ? s(this.C, this.D) : 0L, false, false, false);
            this.g0 = 0.0f;
            this.h0 = 2.14748365E9f;
            u();
            int i11 = bVar.j;
            if (i11 == 1 || i11 == 2) {
                this.q0.setSize(arrayList.size() * 2);
            } else {
                this.q0.setSize(arrayList.size());
            }
            this.E = true;
            I();
            return z4;
        }
        jVar.k = 0.7f;
        jVar.l = 1.0f;
        this.h0 = 0.0f;
        this.g0 = 0.0f;
        this.b.clear();
        AnimatorSet animatorSet = this.U;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
        }
        return z4;
    }

    public final void E(long j10, long j11, boolean z4, boolean z10, boolean z11) {
        if ((Math.abs((((long) Math.ceil(((j10 <= 100 || ((float) (j10 / 5)) % 10.0f == 0.0f) ? j10 : ((j10 / 10) + 1) * 10) / 5.0f)) * 5) - this.x) < this.B || j10 == 0) && j10 == this.y) {
            return;
        }
        xf.d f10 = f(this.e0.i, j10, j11);
        long[] jArr = f10.a;
        long j12 = jArr[jArr.length - 1];
        long j13 = jArr[0];
        if (!z11) {
            float f11 = this.v - this.w;
            float f12 = j12 - j13;
            float f13 = f11 / f12;
            if (f13 > 1.0f) {
                f13 = f12 / f11;
            }
            double d = f13;
            float f14 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z12 = ((float) j12) != this.x;
            if (this.M0 && j13 != this.y) {
                z12 = true;
            }
            if (z12) {
                AnimatorSet animatorSet = this.U;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.U.cancel();
                }
                this.Q0 = this.v;
                this.R0 = this.w;
                this.O0 = 0.0f;
                this.P0 = 0.0f;
                this.S0 = f14;
            }
        }
        float f15 = j12;
        this.x = f15;
        float f16 = j13;
        this.y = f16;
        v();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.Y0 >= 320 || z10) {
            this.Y0 = currentTimeMillis;
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.V.cancel();
            }
            ArrayList arrayList = this.b;
            if (!z4) {
                this.v = f15;
                this.w = f16;
                arrayList.clear();
                arrayList.add(f10);
                f10.f = 255;
                return;
            }
            arrayList.add(f10);
            if (z11) {
                AnimatorSet animatorSet2 = this.U;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.U.cancel();
                }
                this.S0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f15, this.I0));
                if (this.M0) {
                    animatorSet3.playTogether(e(this.w, f16, this.J0));
                }
                this.U = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                xf.d dVar = (xf.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.g = dVar.f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new ag.a(26, this, f10));
            this.V = e;
            e.addListener(new ex0(20, this, f10));
            this.V.start();
        }
    }

    public final void F() {
        float f10 = this.S0;
        if (f10 == 0.0f) {
            return;
        }
        float f11 = this.v;
        float f12 = this.x;
        if (f11 != f12) {
            float f13 = this.O0 + f10;
            this.O0 = f13;
            if (f13 > 1.0f) {
                this.O0 = 1.0f;
                this.v = f12;
            } else {
                float f14 = this.Q0;
                this.v = (mr.g.getInterpolation(f13) * (f12 - f14)) + f14;
            }
            invalidate();
        }
        if (this.M0) {
            float f15 = this.w;
            float f16 = this.y;
            if (f15 != f16) {
                float f17 = this.P0 + this.S0;
                this.P0 = f17;
                if (f17 > 1.0f) {
                    this.P0 = 1.0f;
                    this.w = f16;
                } else {
                    float f18 = this.R0;
                    this.w = (mr.g.getInterpolation(f17) * (f16 - f18)) + f18;
                }
                invalidate();
            }
        }
    }

    public final void G() {
        int i10 = this.u0 ? j6.Zi : j6.Yi;
        f6 f6Var = this.T0;
        int v02 = j6.v0(i10, f6Var);
        this.K.setColor(v02);
        this.L.setColor(j6.v0(this.u0 ? j6.Zi : j6.Yi, f6Var));
        int v03 = j6.v0(j6.Yi, f6Var);
        this.M.setColor(v03);
        int v04 = j6.v0(j6.aj, f6Var);
        Paint paint = this.I;
        paint.setColor(v04);
        int v05 = j6.v0(j6.bj, f6Var);
        Paint paint2 = this.J;
        paint2.setColor(v05);
        this.N.setColor(j6.v0(j6.dj, f6Var));
        this.O.setColor(j6.v0(j6.cj, f6Var));
        this.P.setColor(j6.v0(j6.d6, f6Var));
        this.Q.setColor(j6.v0(j6.ej, f6Var));
        this.q0.b();
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
            ((xf.f) obj).a();
        }
        if (this.r0) {
            int i12 = this.p0;
            wf.b bVar = this.e0;
            long[] jArr = bVar.a;
            if (i12 < jArr.length) {
                this.q0.c(i12, jArr[i12], arrayList, false, bVar.j, bVar.h);
            }
        }
        this.E = true;
    }

    public final void H() {
        wf.b bVar = this.e0;
        if (bVar == null) {
            return;
        }
        j jVar = this.d0;
        int c3 = bVar.c(Math.max(jVar.k, 0.0f));
        this.C = c3;
        int a2 = this.e0.a(Math.min(jVar.l, 1.0f), c3);
        this.D = a2;
        int i10 = this.C;
        if (a2 < i10) {
            this.D = i10;
        }
        xf.c cVar = this.g1;
        if (cVar != null) {
            long[] jArr = this.e0.a;
            cVar.b(jArr[i10], jArr[this.D]);
        }
        I();
    }

    public final void I() {
        wf.b bVar = this.e0;
        if (bVar != null) {
            float f10 = this.C0;
            if (f10 == 0.0f) {
                return;
            }
            int i10 = (int) ((f10 / (this.D0 * bVar.g)) / 6.0f);
            xf.b bVar2 = this.f0;
            if (bVar2 == null || i10 >= bVar2.b || i10 <= bVar2.c) {
                int highestOneBit = Integer.highestOneBit(i10) << 1;
                xf.b bVar3 = this.f0;
                if (bVar3 == null || bVar3.a != highestOneBit) {
                    ValueAnimator valueAnimator = this.W;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.W.cancel();
                    }
                    double d = highestOneBit;
                    double d10 = 0.2d * d;
                    xf.b bVar4 = new xf.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                    bVar4.d = 255;
                    xf.b bVar5 = this.f0;
                    ArrayList arrayList = this.c;
                    if (bVar5 == null) {
                        this.f0 = bVar4;
                        bVar4.d = 255;
                        arrayList.add(bVar4);
                        return;
                    }
                    this.f0 = bVar4;
                    this.j0 = arrayList.size();
                    for (int i11 = 0; i11 < this.j0; i11++) {
                        xf.b bVar6 = (xf.b) arrayList.get(i11);
                        bVar6.e = bVar6.d;
                    }
                    arrayList.add(bVar4);
                    if (arrayList.size() > 2) {
                        arrayList.remove(0);
                    }
                    ValueAnimator duration = e(0.0f, 1.0f, new ag.a(27, this, bVar4)).setDuration(200L);
                    this.W = duration;
                    duration.addListener(new ex0(21, this, bVar4));
                    this.W.start();
                }
            }
        }
    }

    public void J(wf.b bVar, long j10) {
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
        float f10 = fArr[i10];
        j jVar = this.d0;
        jVar.k = f10;
        jVar.l = fArr[i11];
    }

    public void K() {
        if (y1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                xf.f fVar = (xf.f) obj;
                boolean z4 = fVar.n;
                wf.a aVar = fVar.a;
                if (z4) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z4) {
                    long j13 = aVar.f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 == 2147483647L || j10 == 0.0f) && (j11 <= 0 || j11 == this.i0)) {
                return;
            }
            this.i0 = j11;
            Animator animator = this.a0;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(e(this.g0, this.i0, this.G0), e(this.h0, 0.0f, this.H0));
            this.a0 = animatorSet;
            animatorSet.start();
        }
    }

    @Override // vf.i
    public void a(float f10, float f11, boolean z4) {
        wf.b bVar = this.e0;
        if (bVar == null) {
            return;
        }
        if (!z4) {
            H();
            invalidate();
        } else {
            int c3 = bVar.c(Math.max(f10, 0.0f));
            int a2 = this.e0.a(Math.min(f11, 1.0f), c3);
            E(r(c3, a2), s(c3, a2), true, true, false);
            c(false);
        }
    }

    public final void c(boolean z4) {
        x((this.D0 * this.d0.k) - h1);
        if (this.f1 == z4) {
            return;
        }
        this.f1 = z4;
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.b0.cancel();
        }
        ValueAnimator duration = e(this.s0, z4 ? 1.0f : 0.0f, this.K0).setDuration(200L);
        this.b0 = duration;
        duration.addListener(this.L0);
        this.b0.start();
    }

    public final void d() {
        this.p0 = -1;
        this.r0 = false;
        this.f1 = false;
        this.q0.setVisibility(8);
        this.s0 = 0.0f;
    }

    public xf.d f(int i10, long j10, long j11) {
        return new xf.d(j10, j11, this.M0, this.e0.h, i10, this.K, this.L);
    }

    public xf.e g() {
        return new xf.e(getContext(), this.T0);
    }

    public long getEndDate() {
        return this.e0.a[this.D];
    }

    public float getMinDistance() {
        wf.b bVar = this.e0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f10 = 5.0f / length;
        if (f10 < 0.1f) {
            return 0.1f;
        }
        return f10;
    }

    public long getSelectedDate() {
        int i10 = this.p0;
        if (i10 < 0) {
            return -1L;
        }
        return this.e0.a[i10];
    }

    public long getStartDate() {
        return this.e0.a[this.C];
    }

    public abstract xf.f h(wf.a aVar);

    public void i(Canvas canvas) {
        if (this.e0 == null) {
            return;
        }
        int i10 = this.v0;
        float f10 = 1.0f;
        if (i10 == 2) {
            f10 = 1.0f - this.w0.f;
        } else if (i10 == 1) {
            f10 = this.w0.f;
        } else if (i10 == 3) {
            f10 = this.w0.f;
        }
        Paint paint = this.I;
        paint.setAlpha((int) (this.n * f10));
        int i11 = (int) (this.f * 255.0f * f10);
        TextPaint textPaint = this.K;
        textPaint.setAlpha(i11);
        this.L.setAlpha((int) (this.f * 255.0f * f10));
        int textSize = (int) (k1 - textPaint.getTextSize());
        float measuredHeight = (getMeasuredHeight() - this.s) - 1;
        canvas.drawLine(this.A0, measuredHeight, this.B0, measuredHeight, paint);
        if (this.M0) {
            return;
        }
        canvas.drawText("0", h1, r1 - textSize, textPaint);
    }

    public void j(Canvas canvas) {
        int i10;
        if (this.e0 == null) {
            return;
        }
        ArrayList arrayList = this.c;
        this.j0 = arrayList.size();
        int i11 = this.v0;
        float f10 = 1.0f;
        int i12 = 1;
        float f11 = i11 == 2 ? 1.0f - this.w0.f : i11 == 1 ? this.w0.f : i11 == 3 ? this.w0.f : 1.0f;
        char c3 = 0;
        this.k0 = 0;
        while (true) {
            int i13 = this.k0;
            if (i13 >= this.j0) {
                return;
            }
            int i14 = ((xf.b) arrayList.get(i13)).d;
            int i15 = ((xf.b) arrayList.get(this.k0)).a;
            if (i15 == 0) {
                i15 = 1;
            }
            int i16 = this.C - this.l0;
            while (i16 % i15 != 0) {
                i16--;
            }
            int i17 = this.D - this.l0;
            while (true) {
                if (i17 % i15 == 0 && i17 >= this.e0.a.length - i12) {
                    break;
                }
                i17++;
                i14 = i14;
                c3 = 0;
                f10 = 1.0f;
                i12 = 1;
            }
            int i18 = this.l0;
            int i19 = i16 + i18;
            int i20 = i17 + i18;
            float f12 = this.D0 * this.d0.k;
            float f13 = h1;
            float f14 = f12 - f13;
            while (i19 < i20) {
                if (i19 >= 0) {
                    long[] jArr = this.e0.a;
                    if (i19 < jArr.length - i12) {
                        long j10 = jArr[i19];
                        long j11 = jArr[c3];
                        i10 = i14;
                        float f15 = (((j10 - j11) / (jArr[jArr.length - i12] - j11)) * this.D0) - f14;
                        float f16 = f15 - q1;
                        if (f16 > 0.0f) {
                            float f17 = this.C0;
                            if (f16 <= f17 + f13) {
                                float f18 = m1;
                                TextPaint textPaint = this.M;
                                if (f16 < f18) {
                                    textPaint.setAlpha((int) (i10 * y3.a(f18, f16, f18, f10) * this.h * f11));
                                } else if (f16 > f17) {
                                    textPaint.setAlpha((int) (i10 * y3.a(f16, f17, f13, f10) * this.h * f11));
                                } else {
                                    textPaint.setAlpha((int) (i10 * this.h * f11));
                                }
                                wf.b bVar = this.e0;
                                String[] strArr = bVar.c;
                                long[] jArr2 = bVar.a;
                                canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.k)], f15, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.s) + l1, textPaint);
                                i19 += i15;
                                i14 = i10;
                                c3 = 0;
                                f10 = 1.0f;
                                i12 = 1;
                            }
                        }
                        i19 += i15;
                        i14 = i10;
                        c3 = 0;
                        f10 = 1.0f;
                        i12 = 1;
                    }
                }
                i10 = i14;
                i19 += i15;
                i14 = i10;
                c3 = 0;
                f10 = 1.0f;
                i12 = 1;
            }
            this.k0++;
            c3 = 0;
            f10 = 1.0f;
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
    public void l(Canvas canvas, xf.d dVar) {
        float f10;
        int i10;
        int i11;
        int length = dVar.a.length;
        float f11 = 1.0f;
        if (length > 2) {
            float f12 = (r0[1] - r0[0]) / (this.v - this.w);
            if (f12 < 0.1d) {
                f10 = f12 / 0.1f;
                i10 = this.v0;
                if (i10 != 2) {
                    f11 = 1.0f - this.w0.f;
                } else if (i10 == 1) {
                    f11 = this.w0.f;
                } else if (i10 == 3) {
                    f11 = this.w0.f;
                }
                Paint paint = this.I;
                paint.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
                this.K.setAlpha((int) e2.c.z(dVar.f, this.f, f11, f10));
                this.L.setAlpha((int) e2.c.z(dVar.f, this.f, f11, f10));
                int measuredHeight = (getMeasuredHeight() - this.s) - k1;
                for (i11 = !this.M0 ? 1 : 0; i11 < length; i11++) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f13 = dVar.a[i11];
                    float f14 = this.w;
                    canvas.drawRect(this.A0, (int) (measuredHeight2 - (((f13 - f14) / (this.v - f14)) * measuredHeight)), this.B0, r4 + 1, paint);
                }
            }
        }
        f10 = 1.0f;
        i10 = this.v0;
        if (i10 != 2) {
        }
        Paint paint2 = this.I;
        paint2.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
        this.K.setAlpha((int) e2.c.z(dVar.f, this.f, f11, f10));
        this.L.setAlpha((int) e2.c.z(dVar.f, this.f, f11, f10));
        int measuredHeight3 = (getMeasuredHeight() - this.s) - k1;
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
        float f10;
        int i10;
        int i11;
        wf.b bVar;
        int i12;
        int i13;
        int i14;
        char c3;
        Paint paint;
        Canvas canvas2;
        float f11;
        int i15;
        h hVar;
        h hVar2;
        int i16;
        float f12;
        boolean z4;
        boolean z10;
        Paint paint2;
        ValueAnimator valueAnimator;
        if (this.e0 == null) {
            return;
        }
        float f13 = this.z0;
        j jVar = this.d0;
        jVar.b = f13;
        int measuredHeight = getMeasuredHeight();
        int i17 = n1;
        int i18 = measuredHeight - i17;
        int measuredHeight2 = getMeasuredHeight();
        int i19 = this.y0;
        int i20 = (measuredHeight2 - i19) - i17;
        float f14 = this.z0;
        float f15 = jVar.k * f14;
        float f16 = h1;
        int i21 = (int) (f15 + f16);
        int i22 = (int) ((jVar.l * f14) + f16);
        int i23 = this.v0;
        if (i23 == 1) {
            xf.j jVar2 = this.w0;
            int i24 = (int) ((jVar2.a * f14) + f16);
            int i25 = (int) ((f14 * jVar2.b) + f16);
            float f17 = 1.0f - jVar2.f;
            i21 = (int) (((i24 - i21) * f17) + i21);
            i22 = (int) ((f17 * (i25 - i22)) + i22);
        } else if (i23 == 3) {
            f10 = this.w0.f;
            i10 = i21;
            i11 = i22;
            bVar = this.e0;
            int i26 = r1;
            Paint paint3 = this.O;
            Paint paint4 = this.H;
            if (bVar == null) {
                if (i23 == 0) {
                    int i27 = 0;
                    while (true) {
                        ArrayList arrayList = this.d;
                        f12 = f10;
                        if (i27 >= arrayList.size()) {
                            break;
                        }
                        xf.f fVar = (xf.f) arrayList.get(i27);
                        ValueAnimator valueAnimator2 = fVar.h;
                        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && ((valueAnimator = fVar.i) == null || !valueAnimator.isRunning())) {
                            i27++;
                            f10 = f12;
                        }
                    }
                    z4 = true;
                    if (z4) {
                        z10 = z4;
                        if (this.E) {
                            this.m0.eraseColor(0);
                            n(this.n0);
                            this.E = false;
                            if (z10) {
                                paint2 = paint3;
                                i12 = i17;
                            } else {
                                int i28 = this.v0;
                                if (i28 == 2) {
                                    float f18 = this.z0;
                                    xf.j jVar3 = this.w0;
                                    float f19 = (jVar3.c * f18) + f16;
                                    paint4.setAlpha((int) ((1.0f - jVar3.f) * 255.0f));
                                    canvas.save();
                                    paint2 = paint3;
                                    i12 = i17;
                                    canvas.clipRect(f16, i20, getMeasuredWidth() - f16, i18);
                                    canvas.scale((this.w0.f * 2.0f) + 1.0f, 1.0f, f19, ((i18 - i20) + i20) >> 1);
                                    canvas.drawBitmap(this.m0, f16, (getMeasuredHeight() - i12) - i19, paint4);
                                    canvas.restore();
                                } else {
                                    paint2 = paint3;
                                    i12 = i17;
                                    if (i28 == 1) {
                                        float f20 = ((i18 - i20) + i20) >> 1;
                                        float f21 = this.z0;
                                        xf.j jVar4 = this.w0;
                                        float f22 = jVar4.c;
                                        float f23 = f21 * f22;
                                        float f24 = f23 + f16;
                                        if (f22 <= 0.5f) {
                                            f23 = (1.0f - f22) * f21;
                                        }
                                        float f25 = f23 * jVar4.f;
                                        canvas.save();
                                        i13 = i26;
                                        canvas.clipRect(f24 - f25, i20, f25 + f24, i18);
                                        paint4.setAlpha((int) (this.w0.f * 255.0f));
                                        canvas.scale(this.w0.f, 1.0f, f24, f20);
                                        canvas.drawBitmap(this.m0, f16, (getMeasuredHeight() - i12) - i19, paint4);
                                        canvas.restore();
                                    } else {
                                        i13 = i26;
                                        paint4.setAlpha((int) (f12 * 255.0f));
                                        canvas.drawBitmap(this.m0, f16, (getMeasuredHeight() - i12) - i19, paint4);
                                    }
                                    if (this.v0 != 2) {
                                        return;
                                    }
                                    float f26 = i20;
                                    float f27 = i18;
                                    float f28 = h1;
                                    paint = paint4;
                                    Paint paint5 = paint2;
                                    i14 = 2;
                                    c3 = 0;
                                    canvas.drawRect(f28, f26, i10 + i13, f27, paint5);
                                    canvas2 = canvas;
                                    canvas2.drawRect(i11 - i13, f26, getMeasuredWidth() - f28, f27, paint5);
                                    f11 = f16;
                                }
                            }
                            i13 = i26;
                            if (this.v0 != 2) {
                            }
                        }
                    } else {
                        canvas.save();
                        z10 = z4;
                        canvas.clipRect(f16, (getMeasuredHeight() - i17) - i19, getMeasuredWidth() - f16, getMeasuredHeight() - i17);
                        canvas.translate(f16, (getMeasuredHeight() - i17) - i19);
                        n(canvas);
                        canvas.restore();
                    }
                    if (z10) {
                    }
                    i13 = i26;
                    if (this.v0 != 2) {
                    }
                } else {
                    f12 = f10;
                }
                z4 = false;
                if (z4) {
                }
                if (z10) {
                }
                i13 = i26;
                if (this.v0 != 2) {
                }
            } else {
                i12 = i17;
                i13 = i26;
                i14 = 2;
                c3 = 0;
                paint = paint4;
                canvas2 = canvas;
                f11 = f16;
                canvas2.drawRect(f11, i20, getMeasuredWidth() - f16, i18, paint3);
            }
            canvas2.drawBitmap(this.a.a(i19, (int) (getMeasuredWidth() - (f11 * 2.0f))), f11, (getMeasuredHeight() - i12) - i19, paint);
            if (this.e0 == null) {
                Rect rect = this.S;
                rect.set(i10, i20, i11, i18);
                jVar.j.set(rect);
                int i29 = rect.left;
                int i30 = rect.top;
                float f29 = rect.bottom + w1;
                float f30 = s1;
                Path path = this.T;
                b(path, i29, i30 - r12, i29 + i13, f29, f30, f30, true, false, false, true);
                Paint paint6 = this.N;
                canvas2.drawPath(path, paint6);
                b(path, r3 - i13, rect.top - r12, rect.right, rect.bottom + r12, f30, f30, false, true, true, false);
                canvas2.drawPath(path, paint6);
                canvas2.drawRect(rect.left + i13, rect.bottom, rect.right - i13, r3 + r12, paint6);
                canvas.drawRect(rect.left + i13, r1 - r12, rect.right - i13, rect.top, paint6);
                int i31 = rect.left;
                int i32 = t1;
                float centerY = rect.centerY() - i32;
                float f31 = rect.left + i32;
                float centerY2 = rect.centerY() + i32;
                Paint paint7 = this.R;
                canvas.drawLine(i31 + i32, centerY, f31, centerY2, paint7);
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
                    Paint paint8 = this.Q;
                    int i37 = v1;
                    int i38 = u1;
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
                int i39 = o1;
                int i40 = i39 >> 1;
                rect2.set(i10 - i39, i20, i10 + i40, i18);
                jVar.i.set(i11 - i40, i20, i11 + i39, i18);
                return;
            }
            return;
        }
        i10 = i21;
        i11 = i22;
        f10 = 1.0f;
        bVar = this.e0;
        int i262 = r1;
        Paint paint32 = this.O;
        Paint paint42 = this.H;
        if (bVar == null) {
        }
        canvas2.drawBitmap(this.a.a(i19, (int) (getMeasuredWidth() - (f11 * 2.0f))), f11, (getMeasuredHeight() - i12) - i19, paint);
        if (this.e0 == null) {
        }
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        wf.b bVar;
        int i10 = this.p0;
        if (i10 < 0 || !this.r0 || (bVar = this.e0) == null) {
            return;
        }
        int i11 = (int) (this.r * this.s0);
        float f10 = this.C0;
        j jVar = this.d0;
        float f11 = jVar.l;
        float f12 = jVar.k;
        float f13 = f10 / (f11 - f12);
        float f14 = (f12 * f13) - h1;
        float[] fArr = bVar.b;
        if (i10 >= fArr.length) {
            return;
        }
        float f15 = (fArr[i10] * f13) - f14;
        Paint paint = this.J;
        paint.setAlpha(i11);
        canvas.drawLine(f15, 0.0f, f15, this.E0.bottom, paint);
        if (!this.e) {
            return;
        }
        ArrayList arrayList = this.d;
        this.j0 = arrayList.size();
        int i12 = 0;
        while (true) {
            this.k0 = i12;
            int i13 = this.k0;
            if (i13 >= this.j0) {
                return;
            }
            xf.f fVar = (xf.f) arrayList.get(i13);
            boolean z4 = fVar.n;
            Paint paint2 = fVar.d;
            if (z4 || fVar.o != 0.0f) {
                float f16 = fVar.a.a[this.p0];
                float f17 = this.w;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f16 - f17) / (this.v - f17)) * ((getMeasuredHeight() - this.s) - k1));
                paint2.setAlpha((int) (fVar.o * 255.0f * this.s0));
                int i14 = (int) (fVar.o * 255.0f * this.s0);
                Paint paint3 = this.P;
                paint3.setAlpha(i14);
                canvas.drawPoint(f15, measuredHeight, paint2);
                canvas.drawPoint(f15, measuredHeight, paint3);
            }
            i12 = this.k0 + 1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.t0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.E0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.b;
        this.j0 = arrayList.size();
        int i10 = 0;
        this.k0 = 0;
        while (true) {
            int i11 = this.k0;
            if (i11 >= this.j0) {
                break;
            }
            l(canvas, (xf.d) arrayList.get(i11));
            this.k0++;
        }
        k(canvas);
        while (true) {
            this.k0 = i10;
            int i12 = this.k0;
            if (i12 >= this.j0) {
                canvas.restoreToCount(save);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            p(canvas, (xf.d) arrayList.get(i12));
            i10 = this.k0 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.F) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.U0;
        int i13 = this.y0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.V0) {
            this.U0 = getMeasuredWidth();
            this.V0 = getMeasuredHeight();
            float measuredWidth2 = getMeasuredWidth();
            float f10 = h1;
            float f11 = 2.0f * f10;
            this.m0 = Bitmap.createBitmap((int) (measuredWidth2 - f11), i13, Bitmap.Config.ARGB_4444);
            this.n0 = new Canvas(this.m0);
            this.a.a(i13, (int) (getMeasuredWidth() - f11));
            w();
            if (this.r0) {
                x((this.D0 * this.d0.k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = n1;
            this.W0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.X0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.e0 != null) {
            boolean z4 = this.G;
            j jVar = this.d0;
            if (!z4) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.o0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.E0;
            if (actionMasked == 0) {
                this.d1 = System.currentTimeMillis();
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!jVar.a(x10, y10, motionEvent.getActionIndex())) {
                    this.Z0 = x10;
                    this.b1 = x10;
                    this.a1 = y10;
                    this.c1 = y10;
                    if (rectF.contains(x10, y10)) {
                        if (this.p0 < 0 || !this.f1) {
                            this.o0 = true;
                            C(x10, y10);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = x10 - this.Z0;
                    int i11 = y10 - this.a1;
                    if (jVar.n[0] != null || jVar.c) {
                        boolean b10 = jVar.b(x10, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            int x11 = (int) motionEvent.getX(1);
                            motionEvent.getY(1);
                            jVar.b(x11, 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                    boolean z10 = this.o0;
                    int i12 = this.x0;
                    if (z10) {
                        boolean z11 = (this.e1 && System.currentTimeMillis() - this.d1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12;
                        this.Z0 = x10;
                        this.a1 = y10;
                        getParent().requestDisallowInterceptTouchEvent(z11);
                        C(x10, y10);
                        return true;
                    }
                    if (rectF.contains(this.b1, this.c1)) {
                        int i13 = this.b1 - x10;
                        int i14 = this.c1 - y10;
                        if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.d1 > 200) {
                            this.o0 = true;
                            C(x10, y10);
                            return true;
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return jVar.a(x10, y10, motionEvent.getActionIndex());
                    }
                    if (actionMasked == 6) {
                        jVar.c(motionEvent.getActionIndex(), motionEvent);
                        return true;
                    }
                }
            }
            if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                if (rectF.contains(this.b1, this.c1) && !this.o0) {
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
                this.o0 = false;
                y();
                invalidate();
                E(r(this.C, this.D), this.M0 ? s(this.C, this.D) : 0L, true, true, false);
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
    public void p(Canvas canvas, xf.d dVar) {
        float f10;
        int i10;
        int i11;
        TextPaint textPaint;
        xf.d dVar2;
        int length = dVar.a.length;
        float f11 = 1.0f;
        if (length > 2) {
            float f12 = (r0[1] - r0[0]) / (this.v - this.w);
            if (f12 < 0.1d) {
                f10 = f12 / 0.1f;
                i10 = this.v0;
                if (i10 != 2) {
                    f11 = 1.0f - this.w0.f;
                } else if (i10 == 1) {
                    f11 = this.w0.f;
                } else if (i10 == 3) {
                    f11 = this.w0.f;
                }
                this.I.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
                int z4 = (int) e2.c.z(dVar.f, this.f, f11, f10);
                TextPaint textPaint2 = this.K;
                textPaint2.setAlpha(z4);
                int z10 = (int) e2.c.z(dVar.f, this.f, f11, f10);
                TextPaint textPaint3 = this.L;
                textPaint3.setAlpha(z10);
                int measuredHeight = getMeasuredHeight() - this.s;
                int i12 = k1;
                int i13 = measuredHeight - i12;
                int textSize = (int) (i12 - textPaint2.getTextSize());
                i11 = 1 ^ (this.M0 ? 1 : 0);
                while (i11 < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    float f13 = dVar.a[i11];
                    float f14 = this.w;
                    float f15 = ((int) (measuredHeight2 - (((f13 - f14) / (this.v - f14)) * i13))) - textSize;
                    float f16 = h1;
                    xf.d dVar3 = dVar;
                    int i14 = i11;
                    Canvas canvas2 = canvas;
                    dVar3.a(canvas2, 0, i14, f16, f15, textPaint2);
                    if (dVar3.c != null) {
                        float measuredWidth = getMeasuredWidth() - f16;
                        textPaint = textPaint3;
                        dVar2 = dVar3;
                        dVar2.a(canvas2, 1, i14, measuredWidth, f15, textPaint);
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
        f10 = 1.0f;
        i10 = this.v0;
        if (i10 != 2) {
        }
        this.I.setAlpha((int) ((this.n / 255.0f) * dVar.f * f11 * f10));
        int z42 = (int) e2.c.z(dVar.f, this.f, f11, f10);
        TextPaint textPaint22 = this.K;
        textPaint22.setAlpha(z42);
        int z102 = (int) e2.c.z(dVar.f, this.f, f11, f10);
        TextPaint textPaint32 = this.L;
        textPaint32.setAlpha(z102);
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i122 = k1;
        int i132 = measuredHeight3 - i122;
        int textSize2 = (int) (i122 - textPaint22.getTextSize());
        i11 = 1 ^ (this.M0 ? 1 : 0);
        while (i11 < length) {
        }
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((xf.f) arrayList.get(i12)).n) {
                long rMaxQ = ((xf.f) arrayList.get(i12)).a.b.rMaxQ(i10, i11);
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
            if (((xf.f) arrayList.get(i12)).n) {
                long rMinQ = ((xf.f) arrayList.get(i12)).a.b.rMinQ(i10, i11);
                if (rMinQ < j10) {
                    j10 = rMinQ;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(e eVar) {
        this.N0 = eVar;
    }

    public void setHeader(xf.c cVar) {
        this.g1 = cVar;
    }

    public void setLandscape(boolean z4) {
        this.F = z4;
    }

    public void t() {
        this.I.setStrokeWidth(1.0f);
        this.J.setStrokeWidth(i1);
        TextPaint textPaint = this.K;
        float f10 = j1;
        textPaint.setTextSize(f10);
        TextPaint textPaint2 = this.L;
        textPaint2.setTextSize(f10);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.M;
        textPaint3.setTextSize(f10);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float dpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.P;
        paint.setStrokeWidth(dpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        xf.e g10 = g();
        this.q0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.R;
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
            xf.f fVar = (xf.f) obj;
            boolean z4 = fVar.n;
            wf.a aVar = fVar.a;
            if (z4) {
                long j10 = aVar.e;
                if (j10 > this.g0) {
                    this.g0 = j10;
                }
            }
            if (z4) {
                long j11 = aVar.f;
                if (j11 < this.h0) {
                    this.h0 = j11;
                }
            }
            float f10 = this.g0;
            float f11 = this.h0;
            if (f10 == f11) {
                this.g0 = f10 + 1.0f;
                this.h0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.s;
        float f10 = this.x;
        if (f10 == 0.0f || measuredHeight == 0) {
            return;
        }
        this.B = (f10 / measuredHeight) * j1;
    }

    public final void w() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f10 = h1;
        this.z0 = measuredWidth - (2.0f * f10);
        this.A0 = f10;
        float measuredWidth2 = getMeasuredWidth() - (this.F ? p1 : f10);
        this.B0 = measuredWidth2;
        float f11 = measuredWidth2 - this.A0;
        this.C0 = f11;
        j jVar = this.d0;
        this.D0 = f11 / (jVar.l - jVar.k);
        I();
        this.s = AndroidUtilities.dp(100.0f);
        this.E0.set(this.A0 - f10, 0.0f, this.B0 + f10, getMeasuredHeight() - this.s);
        if (this.e0 != null) {
            this.l0 = (int) (AndroidUtilities.dp(20.0f) / (this.z0 / this.e0.a.length));
        }
        v();
    }

    public final void x(float f10) {
        int i10;
        wf.b bVar = this.e0;
        if (bVar == null || (i10 = this.p0) < 0) {
            return;
        }
        long[] jArr = bVar.a;
        if (i10 >= jArr.length || !this.r0) {
            return;
        }
        this.q0.c(i10, jArr[i10], this.d, false, bVar.j, bVar.h);
        this.q0.setVisibility(0);
        this.q0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
        float f11 = (this.e0.b[this.p0] * this.D0) - f10;
        float width = f11 > (this.A0 + this.C0) / 2.0f ? f11 - (this.q0.getWidth() + r1) : f11 + u1;
        if (width < 0.0f) {
            width = 0.0f;
        } else if (this.q0.getMeasuredWidth() + width > getMeasuredWidth()) {
            width = getMeasuredWidth() - this.q0.getMeasuredWidth();
        }
        this.q0.setTranslationX(width);
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.k0 = i10;
            int i11 = this.k0;
            if (i11 >= this.j0) {
                break;
            }
            final xf.f fVar = (xf.f) arrayList.get(i11);
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
                    ValueAnimator e = e(fVar.o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: vf.c
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
                                    gVar.E = true;
                                    gVar.invalidate();
                                    break;
                                default:
                                    g gVar2 = this.b;
                                    gVar2.getClass();
                                    fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.E = true;
                                    gVar2.invalidate();
                                    break;
                            }
                        }
                    });
                    fVar.h = e;
                    e.start();
                } else {
                    i10 = this.k0 + 1;
                }
            }
            if (!fVar.n && fVar.o != 0.0f && ((valueAnimator = fVar.i) == null || !valueAnimator.isRunning())) {
                final int i13 = 1;
                ValueAnimator e6 = e(fVar.o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) { // from class: vf.c
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
                                gVar.E = true;
                                gVar.invalidate();
                                break;
                            default:
                                g gVar2 = this.b;
                                gVar2.getClass();
                                fVar.o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.E = true;
                                gVar2.invalidate();
                                break;
                        }
                    }
                });
                fVar.i = e6;
                e6.start();
            }
            i10 = this.k0 + 1;
        }
        K();
        if (this.r0) {
            xf.e eVar = this.q0;
            int i14 = this.p0;
            wf.b bVar = this.e0;
            eVar.c(i14, bVar.a[i14], arrayList, true, bVar.j, bVar.h);
        }
    }

    public void q(xf.j jVar) {
    }

    public void y() {
    }
}
