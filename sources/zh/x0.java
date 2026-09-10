package zh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iw0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x0 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final sv0 X = new sv0(new z9.a(9), new z9.a(10));
    public static final sv0 Y = new sv0(new z9.a(11), new z9.a(12));
    public static final x0 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public pf.e L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public xh.x U;
    public bi.f5 V;
    public boolean W;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public w0 d;
    public xh.a7 e;
    public bi.f5 f;
    public FrameLayout h;
    public w9 n;
    public vh.h r;
    public boolean s;
    public t0 v;
    public int w;
    public ScaleGestureDetector x;
    public l2.h y;

    static {
        x0 x0Var = new x0();
        x0Var.a = 1.4f;
        x0Var.s = true;
        x0Var.M = 1.0f;
        x0Var.U = new xh.x(x0Var, 21);
        Z = x0Var;
    }

    public static void j() {
        Z.k(true);
    }

    public static void o(Activity activity, t0 t0Var) {
        x0 x0Var = Z;
        if (t0Var == null || x0Var.S) {
            return;
        }
        int i10 = 1;
        x0Var.S = true;
        x0Var.v = t0Var;
        int i11 = t0Var.e;
        x0Var.w = i11;
        NotificationCenter.getInstance(i11).addObserver(x0Var, NotificationCenter.liveStoryUpdated);
        x0Var.J = x0Var.n();
        x0Var.K = x0Var.m();
        x0Var.M = 1.0f;
        x0Var.H = false;
        o1.k kVar = new o1.k(x0Var, X);
        o1.l lVar = new o1.l();
        lVar.a(0.75f);
        lVar.b(650.0f);
        kVar.u = lVar;
        x0Var.P = kVar;
        o1.k kVar2 = new o1.k(x0Var, Y);
        o1.l lVar2 = new o1.l();
        lVar2.a(0.75f);
        lVar2.b(650.0f);
        kVar2.u = lVar2;
        x0Var.Q = kVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new u0());
        x0Var.x = scaleGestureDetector;
        int i12 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i12 >= 23) {
            x0Var.x.setStylusScaleEnabled(false);
        }
        x0Var.y = new l2.h(context, new v0(scaledTouchSlop));
        xh.a7 a7Var = new xh.a7(context);
        a7Var.b = new Path();
        x0Var.e = a7Var;
        w0 w0Var = new w0(context);
        x0Var.d = w0Var;
        w0Var.addView(x0Var.e, w7.a6.c(-1.0f, -1));
        x0Var.e.setOutlineProvider(new bi.g(22));
        x0Var.e.setClipToOutline(true);
        x0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
        w9 w9Var = new w9(context);
        x0Var.n = w9Var;
        x0Var.e.addView(w9Var, w7.a6.c(-1.0f, -1));
        bi.f5 f5Var = new bi.f5(context, x0Var.w);
        x0Var.f = f5Var;
        f5Var.setAlpha(0.0f);
        x0Var.e.addView(x0Var.f, w7.a6.c(-1.0f, -1));
        vh.h hVar = new vh.h(context, i10);
        x0Var.r = hVar;
        x0Var.e.addView(hVar, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        x0Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        x0Var.h.addView(view, w7.a6.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i13 = org.telegram.ui.ActionBar.j6.hg;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new bi.d5(28));
        float f7 = 38;
        float f10 = 4;
        x0Var.h.addView(imageView, w7.a6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new xh.s1(4, t0Var, context));
        x0Var.h.addView(imageView2, w7.a6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
        x0Var.e.addView(x0Var.h, w7.a6.c(-1.0f, -1));
        x0Var.b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams b10 = sf.c.b(context, false);
        x0Var.c = b10;
        int i15 = x0Var.J;
        b10.width = i15;
        b10.height = x0Var.K;
        float dp2 = (AndroidUtilities.displaySize.x - i15) - AndroidUtilities.dp(16.0f);
        x0Var.N = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = x0Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f);
        x0Var.O = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = x0Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        x0Var.d.setAlpha(0.0f);
        x0Var.d.setScaleX(0.1f);
        x0Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(x0Var.b, x0Var.d, x0Var.c);
        x0Var.b.addView(x0Var.d, x0Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(wr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(x0Var.d, (Property<w0, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(x0Var.d, (Property<w0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(x0Var.d, (Property<w0, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new f10(2));
        animatorSet.start();
        x0Var.i();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        pf.e eVar = x0Var.L;
        if (eVar != null) {
            eVar.c();
            x0Var.L = null;
        }
        if (activity == null || sf.c.a(activity) != 1) {
            return;
        }
        pf.d dVar = new pf.d(activity, x0Var);
        dVar.c = "pip-live-story";
        dVar.e = 1;
        dVar.d = AndroidUtilities.dp(10.0f);
        dVar.j = x0Var.d;
        dVar.k = x0Var.f.getPlaceholderView();
        x0Var.L = dVar.a();
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        pf.e eVar = this.L;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.L.h.a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.L.h.a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        bi.f5 f5Var = this.V;
        if (f5Var != null) {
            f5Var.b();
            this.V = null;
        }
        i();
    }

    @Override // rf.a
    public final Bitmap c() {
        bi.f5 f5Var = this.V;
        if (f5Var == null || !f5Var.a()) {
            return null;
        }
        return this.V.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override // rf.a
    public final Bitmap e() {
        bi.f5 f5Var = this.f;
        if (f5Var == null || !f5Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // rf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // rf.a
    public final View h() {
        bi.f5 f5Var = new bi.f5(this.f.getContext(), this.w);
        this.V = f5Var;
        return f5Var;
    }

    public final void i() {
        t0 t0Var = this.v;
        if (t0Var != null) {
            t0Var.v(1.0f);
            bi.f5 f5Var = this.V;
            if (f5Var != null) {
                this.v.s(f5Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            wr wrVar = wr.f;
            duration.setInterpolator(wrVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
            this.s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.b, this.d, this.c);
        o1.k kVar = this.P;
        float f7 = this.N;
        kVar.b = f7;
        kVar.c = true;
        kVar.u.i = a4.a.A(n(), this.M, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.M)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.P.f();
        o1.k kVar2 = this.Q;
        kVar2.b = this.O;
        kVar2.c = true;
        kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.f();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            int i10 = 16;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(i10), 100L);
            NotificationCenter.getInstance(this.w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.T) {
                AndroidUtilities.cancelRunOnUIThread(this.U);
                this.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(wr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<w0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<w0, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<w0, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new iw0(i10, this, z10));
            animatorSet.start();
            pf.e eVar = this.L;
            if (eVar != null) {
                eVar.c();
                this.L = null;
            }
        }
    }

    public final float l() {
        if (this.R == null) {
            this.R = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.R.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float min;
        float f7;
        if (l() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    public final void p(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(wr.f);
        this.I.addUpdateListener(new qg.o(this, 20));
        this.I.addListener(new yg.b(this, 6));
        this.I.start();
    }

    @Override // rf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
