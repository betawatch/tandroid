package ti;

import ab.d0;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.j9;
import c8.kc;
import di.b3;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class i {
    public static final lt0 Q = new lt0(new s0.b(19), new s0.b(20));
    public static final lt0 R = new lt0(new s0.b(21), new s0.b(22));
    public float B;
    public float C;
    public r1.g D;
    public r1.g E;
    public qm0 G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public final o a;
    public final m b;
    public final Activity c;
    public WindowManager d;
    public boolean f;
    public boolean g;
    public org.telegram.ui.e h;
    public e i;
    public q j;
    public View k;
    public ImageView l;
    public e m;
    public ImageView n;
    public b3 o;
    public ScaleGestureDetector p;
    public qt q;
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
    public final j51 F = new j51(false);
    public final float[] M = new float[2];
    public final b N = new b(this, 1);
    public final f O = new f(this, 0);
    public final f P = new f(this, 1);

    public i(o oVar, Activity activity) {
        this.a = oVar;
        this.b = oVar.a;
        this.c = activity;
    }

    public static float e(float f10, float f11) {
        return j9.a(f10, m(), (g0.q.y - f11) - m());
    }

    public static int i(float f10) {
        Point point = g0.q;
        return (int) (Math.min(point.x, point.y) * (f10 >= 1.0f ? 0.35f : 0.6f));
    }

    public static void j(RectF rectF, int i7, int i10) {
        float f10 = (i7 <= 0 || i10 <= 0) ? 0.5625f : i10 / i7;
        d0 b10 = d0.b();
        float f11 = b10.a.getFloat("scale_factor", 1.0f);
        float i11 = i(f10) * f11;
        float i12 = ((int) (i(f10) * f10)) * f11;
        SharedPreferences sharedPreferences = b10.a;
        float f12 = sharedPreferences.getFloat("x", -1.0f);
        float f13 = sharedPreferences.getFloat("y", -1.0f);
        float n10 = f12 != -1.0f ? n(f12, i11) : (g0.q.x - i11) - m();
        float e10 = (f13 != -1.0f ? e(f13, i12) : m()) + g0.m;
        rectF.set(n10, e10, i11 + n10, i12 + e10);
    }

    public static float m() {
        return g0.L(16.0f);
    }

    public static float n(float f10, float f11) {
        float f12 = (f11 / 2.0f) + f10;
        int i7 = g0.q.x;
        return f12 >= ((float) i7) / 2.0f ? (i7 - f11) - m() : m();
    }

    public final void a() {
        if (this.g) {
            return;
        }
        boolean z9 = this.b.r() && kc.a(this.c);
        this.f = z9;
        WindowManager windowManager = (WindowManager) (z9 ? t0.b : this.c).getSystemService("window");
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
            g0.y3(windowManager, this.h, layoutParams);
            this.d.addView(this.h, this.e);
            this.g = true;
            l2.i.g("floating window added, overlay=" + this.f);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean b() {
        return (this.K || this.H || this.r || this.p.isInProgress() || !this.L) ? false : true;
    }

    public final boolean c() {
        m mVar = this.b;
        if (mVar.e0()) {
            return mVar.l() != -9223372036854775807L && mVar.getDuration() >= 15000;
        }
        return false;
    }

    public final void d() {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.w) {
            g0.r(this.P);
            this.w = false;
        }
        g0.r(this.O);
        g0.r(this.N);
        this.L = false;
        this.r = false;
        this.t = null;
        this.b.F();
    }

    public final void f(sg.t0 t0Var) {
        l();
        q qVar = this.j;
        this.j = null;
        if (qVar != null) {
            g0.E2(qVar);
        }
        View view = this.k;
        if (view != null) {
            g0.E2(view);
            this.k = null;
        }
        t0Var.run();
        if (qVar != null) {
            SurfaceTexture surfaceTexture = qVar.a;
            qVar.a = null;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    public final void g(RectF rectF) {
        org.telegram.ui.e eVar = this.h;
        if (eVar == null || !eVar.isAttachedToWindow()) {
            float f10 = this.B;
            float f11 = this.C + g0.m;
            rectF.set(f10, f11, this.x + f10, this.y + f11);
        } else {
            int[] iArr = new int[2];
            this.h.getLocationOnScreen(iArr);
            rectF.set(iArr[0], iArr[1], r1 + this.x, r0 + this.y);
        }
    }

    public final int h() {
        m mVar = this.b;
        int I = mVar.I();
        int U = mVar.U();
        return i((I <= 0 || U <= 0) ? 0.5625f : U / I);
    }

    public final void k() {
        if (this.b.h()) {
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
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void o(boolean z9) {
        if (this.m == null) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f).setDuration(200L);
        this.v = duration;
        duration.setInterpolator(xq.f);
        this.v.addUpdateListener(new d(this, 0));
        this.v.addListener(new r81(this, 17));
        this.v.start();
    }

    public final void p() {
        if (this.n == null) {
            return;
        }
        f fVar = this.O;
        g0.r(fVar);
        if (this.b.h()) {
            this.n.setImageResource(R.drawable.pip_pause_large);
            g0.i3(fVar, 500L);
        } else if (this.H) {
            this.n.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.n.setImageResource(R.drawable.pip_play_large);
        }
    }

    public final void q() {
        if (this.o == null || this.H) {
            return;
        }
        m mVar = this.b;
        long duration = mVar.getDuration();
        if (duration > 0) {
            this.I = mVar.l() / duration;
        }
        this.J = Math.max(this.J, mVar.V());
        this.o.invalidate();
    }

    public final void r() {
        if (this.g) {
            try {
                this.d.updateViewLayout(this.h, this.e);
            } catch (IllegalArgumentException unused) {
                r1.g gVar = this.D;
                if (gVar != null) {
                    gVar.d();
                    this.E.d();
                }
            }
        }
    }
}
