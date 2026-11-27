// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.provider.Settings;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class xl4 {
    public static final bma W = new bma(new xi4((byte) 6), new xi4((byte) 7));
    public static final bma X = new bma(new xi4((byte) 8), new xi4((byte) 9));
    public int A;
    public int B;
    public float E;
    public float F;
    public vpa G;
    public vpa H;
    public cz9 J;
    public boolean K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public AnimatorSet Q;
    public boolean R;
    public final me8 a;
    public final je8 b;
    public final Activity c;
    public final boolean d;
    public WindowManager e;
    public boolean g;
    public boolean h;
    public boolean i;
    public wl4 j;
    public pl4 k;
    public ne8 l;
    public View m;
    public ImageView n;
    public pl4 o;
    public ImageView p;
    public vl4 q;
    public ul4 r;
    public ScaleGestureDetector s;
    public xh4 t;
    public boolean u;
    public boolean v;
    public View w;
    public boolean x;
    public ValueAnimator y;
    public boolean z;
    public final WindowManager.LayoutParams f = new WindowManager.LayoutParams();
    public float C = 1.0f;
    public float D = 1.4f;
    public final rec I = new rec(false);
    public final float[] S = new float[2];
    public final nl4 T = new nl4(this, 2);
    public final ql4 U = new ql4(this, 0 == true ? 1 : 0);
    public final ql4 V = new ql4(this, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public xl4(me8 me8Var, Activity activity) {
        this.a = me8Var;
        je8 je8Var = me8Var.a;
        this.b = je8Var;
        this.c = activity;
        this.d = je8Var.S() == 1;
    }

    public static float e(float f, float f2) {
        return ete.a(f, n(), (hl.q.y - f2) - n());
    }

    public static int j(float f) {
        Point point = hl.q;
        return (int) (Math.min(point.x, point.y) * (f >= 1.0f ? 0.35f : 0.6f));
    }

    public static void k(RectF rectF, int i, int i2) {
        float f = (i <= 0 || i2 <= 0) ? 0.5625f : i2 / i;
        SharedPreferences sharedPreferences = (SharedPreferences) kj4.Q(false).b;
        float f2 = sharedPreferences.getFloat("scale_factor", 1.0f);
        float j = j(f) * f2;
        float j2 = ((int) (j(f) * f)) * f2;
        float f3 = sharedPreferences.getFloat("x", -1.0f);
        float f4 = sharedPreferences.getFloat("y", -1.0f);
        float p = f3 != -1.0f ? p(f3, j) : (hl.q.x - j) - n();
        float e = (f4 != -1.0f ? e(f4, j2) : n()) + hl.m;
        rectF.set(p, e, j + p, j2 + e);
    }

    public static float n() {
        return hl.L(16.0f);
    }

    public static float p(float f, float f2) {
        float f3 = (f2 / 2.0f) + f;
        int i = hl.q.x;
        return f3 >= ((float) i) / 2.0f ? (i - f2) - n() : n();
    }

    public final void a() {
        if (this.h) {
            return;
        }
        boolean z = !this.d && this.b.E() && Settings.canDrawOverlays(this.c);
        this.g = z;
        this.e = (WindowManager) (z ? a.b : this.c).getSystemService("window");
        WindowManager.LayoutParams layoutParams = this.f;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.g) {
            layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        } else {
            layoutParams.type = 2;
        }
        boolean v = this.b.v();
        this.i = v;
        WindowManager.LayoutParams layoutParams2 = this.f;
        layoutParams2.flags = 520;
        if (v) {
            layoutParams2.flags = 8712;
        }
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.width = this.A;
        layoutParams2.height = this.B;
        layoutParams2.x = (int) this.E;
        layoutParams2.y = (int) this.F;
        try {
            hl.s3(this.e, this.j, layoutParams2);
            this.e.addView(this.j, this.f);
            this.h = true;
            fc3.e("floating window added, overlay=" + this.g);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final boolean b() {
        return (this.N || this.K || this.u || this.s.isInProgress() || !this.R) ? false : true;
    }

    public final boolean c() {
        je8 je8Var = this.b;
        if (je8Var.E0()) {
            return je8Var.k() != -9223372036854775807L && je8Var.getDuration() >= 15000;
        }
        return false;
    }

    public final void d() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.z) {
            hl.r(this.V);
            this.z = false;
        }
        hl.r(this.U);
        hl.r(this.T);
        ul4 ul4Var = this.r;
        if (ul4Var != null) {
            ul4Var.removeCallbacks(ul4Var.b);
        }
        this.R = false;
        this.u = false;
        this.w = null;
        this.b.T();
    }

    public final void f(x38 x38Var) {
        m();
        ne8 ne8Var = this.l;
        this.l = null;
        if (ne8Var != null) {
            hl.B2(ne8Var);
        }
        View view = this.m;
        if (view != null) {
            hl.B2(view);
            this.m = null;
        }
        x38Var.run();
        if (ne8Var != null) {
            SurfaceTexture surfaceTexture = ne8Var.a;
            ne8Var.a = null;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    public final void g(RectF rectF) {
        wl4 wl4Var = this.j;
        if (wl4Var == null || !wl4Var.isAttachedToWindow()) {
            float f = this.E;
            float f2 = this.F + hl.m;
            rectF.set(f, f2, this.A + f, this.B + f2);
        } else {
            int[] iArr = new int[2];
            this.j.getLocationOnScreen(iArr);
            rectF.set(iArr[0], iArr[1], r1 + this.A, r0 + this.B);
        }
    }

    public final float h() {
        return Math.max(Math.max(0.0f, -this.E), (this.E + this.A) - hl.q.x);
    }

    public final int i() {
        je8 je8Var = this.b;
        int U = je8Var.U();
        int q0 = je8Var.q0();
        return j((U <= 0 || q0 <= 0) ? 0.5625f : q0 / U);
    }

    public final void l() {
        if (this.b.i()) {
            this.K = false;
        }
        u();
        s();
        t();
        ul4 ul4Var = this.r;
        if (ul4Var != null) {
            ul4Var.invalidate();
        }
    }

    public final void m() {
        if (this.h) {
            this.h = false;
            try {
                this.e.removeViewImmediate(this.j);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void o() {
        this.O = true;
        d();
        this.G.d();
        this.H.d();
        float f = this.E;
        int i = this.A;
        float f2 = (i / 2.0f) + f;
        float f3 = hl.q.x;
        if (f2 < f3 / 2.0f) {
            f3 = -i;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f3);
        ofFloat.addUpdateListener(new qm1(this, this.j.getAlpha(), (byte) 5));
        ofFloat.addListener(new rl4(this, (byte) 0));
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(k43.f);
        ofFloat.start();
    }

    public final void q(boolean z) {
        if (this.o == null) {
            return;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
        this.y = duration;
        duration.setInterpolator(k43.f);
        this.y.addUpdateListener(new ch4(this, (byte) 3));
        this.y.addListener(new rl4(this, (byte) 1));
        this.y.start();
    }

    public final void r() {
        je8 je8Var = this.b;
        if (je8Var.i()) {
            je8Var.b();
        } else {
            if (this.K) {
                je8Var.g(0L);
                this.K = false;
            }
            je8Var.j();
        }
        l();
        this.a.b.d();
    }

    public final void s() {
        if (this.p == null) {
            return;
        }
        ql4 ql4Var = this.U;
        hl.r(ql4Var);
        if (this.b.i()) {
            this.p.setImageResource(R.drawable.pip_pause_large);
            hl.d3(ql4Var, 500L);
            return;
        }
        boolean z = this.K;
        ImageView imageView = this.p;
        if (z) {
            imageView.setImageResource(R.drawable.pip_replay_large);
        } else {
            imageView.setImageResource(R.drawable.pip_play_large);
        }
    }

    public final void t() {
        if (this.q == null || this.K) {
            return;
        }
        je8 je8Var = this.b;
        long duration = je8Var.getDuration();
        if (duration > 0) {
            this.L = je8Var.k() / duration;
        }
        this.M = Math.max(this.M, je8Var.r0());
        this.q.invalidate();
    }

    public final void u() {
        if (this.h) {
            boolean v = this.b.v();
            boolean z = this.i;
            if (v != z) {
                this.i = !z;
                WindowManager.LayoutParams layoutParams = this.f;
                if (z) {
                    layoutParams.flags &= -8193;
                } else {
                    layoutParams.flags |= TLObject.FLAG_13;
                }
                v();
            }
        }
    }

    public final void v() {
        if (this.h) {
            try {
                this.e.updateViewLayout(this.j, this.f);
            } catch (IllegalArgumentException unused) {
                vpa vpaVar = this.G;
                if (vpaVar != null) {
                    vpaVar.d();
                    this.H.d();
                }
            }
        }
    }
}
