// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class tl4 {
    public static final ika Q = new ika(new h64((byte) 26), new h64((byte) 27));
    public static final ika R = new ika(new h64((byte) 28), new h64((byte) 29));
    public float B;
    public float C;
    public zna D;
    public zna E;
    public lx9 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final ad8 a;
    public final vc8 b;
    public final Activity c;
    public WindowManager d;
    public boolean f;
    public boolean g;
    public s8 h;
    public pl4 i;
    public bd8 j;
    public View k;
    public ImageView l;
    public pl4 m;
    public ImageView n;
    public yc o;
    public ScaleGestureDetector p;
    public ai4 q;
    public boolean r;
    public boolean s;
    public View t;
    public boolean u;
    public ValueAnimator v;
    public boolean w;
    public int x;
    public int y;
    public final WindowManager.LayoutParams e = new WindowManager.LayoutParams();
    public float z = 1.0f;
    public float A = 1.4f;
    public final ucc F = new ucc(false);
    public final float[] M = new float[2];
    public final nl4 N = new nl4(this, 2);
    public final ql4 O = new ql4(this, 0);
    public final ql4 P = new ql4(this, 1);

    public tl4(ad8 ad8Var, Activity activity) {
        this.a = ad8Var;
        this.b = ad8Var.a;
        this.c = activity;
    }

    public static float e(float f, float f2) {
        return pqe.a(f, m(), (gm.q.y - f2) - m());
    }

    public static int i(float f) {
        Point point = gm.q;
        return (int) (Math.min(point.x, point.y) * (f >= 1.0f ? 0.35f : 0.6f));
    }

    public static void j(RectF rectF, int i, int i2) {
        float f = (i <= 0 || i2 <= 0) ? 0.5625f : i2 / i;
        SharedPreferences sharedPreferences = (SharedPreferences) lj4.t().a;
        float f2 = sharedPreferences.getFloat("scale_factor", 1.0f);
        float i3 = i(f) * f2;
        float i4 = ((int) (i(f) * f)) * f2;
        float f3 = sharedPreferences.getFloat("x", -1.0f);
        float f4 = sharedPreferences.getFloat("y", -1.0f);
        float n = f3 != -1.0f ? n(f3, i3) : (gm.q.x - i3) - m();
        float e = (f4 != -1.0f ? e(f4, i4) : m()) + gm.m;
        rectF.set(n, e, i3 + n, i4 + e);
    }

    public static float m() {
        return gm.L(16.0f);
    }

    public static float n(float f, float f2) {
        float f3 = (f2 / 2.0f) + f;
        int i = gm.q.x;
        return f3 >= ((float) i) / 2.0f ? (i - f2) - m() : m();
    }

    public final void a() {
        if (this.g) {
            return;
        }
        boolean z = this.b.D() && Settings.canDrawOverlays(this.c);
        this.f = z;
        WindowManager windowManager = (WindowManager) (z ? a.b : this.c).getSystemService("window");
        this.d = windowManager;
        WindowManager.LayoutParams layoutParams = this.e;
        layoutParams.token = null;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (this.f) {
            layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        } else {
            layoutParams.type = 2;
        }
        layoutParams.flags = 520;
        layoutParams.dimAmount = 0.0f;
        layoutParams.width = this.x;
        layoutParams.height = this.y;
        layoutParams.x = (int) this.B;
        layoutParams.y = (int) this.C;
        try {
            gm.s3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.e);
            this.g = true;
            yc3.e("floating window added, overlay=" + this.f);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final boolean b() {
        return (this.K || this.H || this.r || this.p.isInProgress() || !this.L) ? false : true;
    }

    public final boolean c() {
        vc8 vc8Var = this.b;
        if (vc8Var.A0()) {
            return vc8Var.k() != -9223372036854775807L && vc8Var.getDuration() >= 15000;
        }
        return false;
    }

    public final void d() {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.w) {
            gm.r(this.P);
            this.w = false;
        }
        gm.r(this.O);
        gm.r(this.N);
        this.L = false;
        this.r = false;
        this.t = null;
        this.b.R();
    }

    public final void f(q78 q78Var) {
        l();
        bd8 bd8Var = this.j;
        this.j = null;
        if (bd8Var != null) {
            gm.B2(bd8Var);
        }
        View view = this.k;
        if (view != null) {
            gm.B2(view);
            this.k = null;
        }
        q78Var.run();
        if (bd8Var != null) {
            SurfaceTexture surfaceTexture = bd8Var.a;
            bd8Var.a = null;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    public final void g(RectF rectF) {
        s8 s8Var = this.h;
        if (s8Var == null || !s8Var.isAttachedToWindow()) {
            float f = this.B;
            float f2 = this.C + gm.m;
            rectF.set(f, f2, this.x + f, this.y + f2);
        } else {
            int[] iArr = new int[2];
            this.h.getLocationOnScreen(iArr);
            rectF.set(iArr[0], iArr[1], r1 + this.x, r0 + this.y);
        }
    }

    public final int h() {
        vc8 vc8Var = this.b;
        int S = vc8Var.S();
        int o0 = vc8Var.o0();
        return i((S <= 0 || o0 <= 0) ? 0.5625f : o0 / S);
    }

    public final void k() {
        if (this.b.i()) {
            this.H = false;
        }
        p();
        q();
    }

    public final void l() {
        if (this.g) {
            this.g = false;
            try {
                this.d.removeViewImmediate(this.h);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void o(boolean z) {
        if (this.m == null) {
            return;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
        this.v = duration;
        duration.setInterpolator(d53.f);
        this.v.addUpdateListener(new fh4(this, (byte) 3));
        this.v.addListener(new kh2(this, (byte) 24));
        this.v.start();
    }

    public final void p() {
        if (this.n == null) {
            return;
        }
        ql4 ql4Var = this.O;
        gm.r(ql4Var);
        if (this.b.i()) {
            this.n.setImageResource(R.drawable.pip_pause_large);
            gm.d3(ql4Var, 500L);
            return;
        }
        boolean z = this.H;
        ImageView imageView = this.n;
        if (z) {
            imageView.setImageResource(R.drawable.pip_replay_large);
        } else {
            imageView.setImageResource(R.drawable.pip_play_large);
        }
    }

    public final void q() {
        if (this.o == null || this.H) {
            return;
        }
        vc8 vc8Var = this.b;
        long duration = vc8Var.getDuration();
        if (duration > 0) {
            this.I = vc8Var.k() / duration;
        }
        this.J = Math.max(this.J, vc8Var.p0());
        this.o.invalidate();
    }

    public final void r() {
        if (this.g) {
            try {
                this.d.updateViewLayout(this.h, this.e);
            } catch (IllegalArgumentException unused) {
                zna znaVar = this.D;
                if (znaVar != null) {
                    znaVar.d();
                    this.E.d();
                }
            }
        }
    }
}
