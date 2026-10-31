package th;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w0 implements us, lf.a {
    public static final ou0 X = new ou0(new rh.x6(25), new rh.x6(26));
    public static final ou0 Y = new ou0(new rh.x6(27), new rh.x6(28));
    public static final w0 Z;
    public m2.t D;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public jf.f L;
    public float M;
    public float N;
    public float O;
    public o1.j P;
    public o1.j Q;
    public Float R;
    public boolean S;
    public boolean T;
    public sg.v U;
    public vh.s2 V;
    public boolean W;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public v0 d;
    public org.telegram.ui.Wallet.f6 e;
    public vh.s2 f;
    public FrameLayout h;
    public g9 n;
    public bn r;
    public boolean s;
    public s0 w;
    public int x;
    public ScaleGestureDetector y;

    static {
        w0 w0Var = new w0();
        w0Var.a = 1.4f;
        w0Var.s = true;
        w0Var.M = 1.0f;
        w0Var.U = new sg.v(w0Var, 5);
        Z = w0Var;
    }

    public static void b() {
        Z.d(true);
    }

    public final void a() {
        s0 s0Var = this.w;
        if (s0Var != null) {
            s0Var.v(1.0f);
            vh.s2 s2Var = this.V;
            if (s2Var != null) {
                this.w.s(s2Var.getSink());
            } else {
                this.w.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            gr grVar = gr.f;
            duration.setInterpolator(grVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
            this.s = false;
        }
        if (this.J == h() * this.M && this.K == f() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int h = (int) (h() * this.M);
        this.J = h;
        layoutParams.width = h;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int f7 = (int) (f() * this.M);
        this.K = f7;
        layoutParams2.height = f7;
        org.telegram.messenger.i0.S3(this.b, this.d, this.c);
        o1.j jVar = this.P;
        float f10 = this.N;
        jVar.b = f10;
        jVar.c = true;
        jVar.m.i = a1.g.A(h(), this.M, 2.0f, f10) >= org.telegram.messenger.i0.q.x / 2.0f ? (r4 - (h() * this.M)) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        this.P.h();
        o1.j jVar2 = this.Q;
        jVar2.b = this.O;
        jVar2.c = true;
        jVar2.m.i = w7.u.a(r1, org.telegram.messenger.i0.L(16.0f), (r3.y - (f() * this.M)) - org.telegram.messenger.i0.L(16.0f));
        this.Q.h();
    }

    @Override // lf.a
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        a();
        this.W = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    public final void d(boolean z10) {
        if (this.S) {
            this.S = false;
            org.telegram.messenger.i0.h3(new r5.a(8), 100L);
            zs.f(this.x).n(this, zs.G2);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.T) {
                org.telegram.messenger.i0.r(this.U);
                this.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<v0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<v0, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<v0, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new sg.y(3, this, z10));
            animatorSet.start();
            jf.f fVar = this.L;
            if (fVar != null) {
                fVar.c();
                this.L = null;
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.D2) {
            b();
        } else if (i10 == zs.w2) {
            a();
        }
    }

    public final float e() {
        if (this.R == null) {
            this.R = Float.valueOf(1.7777778f);
            Point point = org.telegram.messenger.i0.q;
            this.a = (Math.min(point.x, point.y) - org.telegram.messenger.i0.L(32.0f)) / h();
        }
        return this.R.floatValue();
    }

    public final int f() {
        return (int) (e() * h());
    }

    @Override // lf.a
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        jf.f fVar = this.L;
        if (fVar != null && fVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.L.h.a).width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.L.h.a).height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        vh.s2 s2Var = this.V;
        if (s2Var != null) {
            s2Var.b();
            this.V = null;
        }
        a();
    }

    public final int h() {
        float min;
        float f7;
        if (e() >= 1.0f) {
            Point point = org.telegram.messenger.i0.q;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.i0.q;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    @Override // lf.a
    public final Bitmap i() {
        vh.s2 s2Var = this.V;
        if (s2Var == null || !s2Var.a()) {
            return null;
        }
        return this.V.getBitmap();
    }

    public final void j(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(gr.f);
        this.I.addUpdateListener(new qh.e0(this, 15));
        this.I.addListener(new sg.r(this, 5));
        this.I.start();
    }

    @Override // lf.a
    public final Bitmap m() {
        vh.s2 s2Var = this.f;
        if (s2Var == null || !s2Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // lf.a
    public final /* synthetic */ boolean q() {
        return true;
    }

    @Override // lf.a
    public final View r() {
        vh.s2 s2Var = new vh.s2(this.f.getContext(), this.x);
        this.V = s2Var;
        return s2Var;
    }

    @Override // lf.a
    public final /* synthetic */ void l(Canvas canvas) {
    }

    @Override // lf.a
    public final /* synthetic */ void n(Canvas canvas) {
    }
}
