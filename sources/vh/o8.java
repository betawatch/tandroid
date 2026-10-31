package vh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ee;
import org.telegram.messenger.ff;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.n20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.we;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.bk0;
import org.telegram.ui.cv0;
import org.telegram.ui.do0;
import org.telegram.ui.hk;
import org.telegram.ui.l40;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o8 implements us {
    public static o8 F2;
    public final c8 A0;
    public View A1;
    public boolean A2;
    public t7 B0;
    public oe0 B1;
    public boolean B2;
    public o4 C0;
    public final ne0 C1;
    public y7 C2;
    public final aa0 D;
    public final a5 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final a9 E0;
    public fe0 E1;
    public ValueAnimator E2;
    public j8 F;
    public final b9 F0;
    public he0 F1;
    public float G;
    public final u G0;
    public File G1;
    public final RectF H;
    public final a9 H0;
    public ArrayList H1;
    public float I;
    public final t I0;
    public ArrayList I1;
    public int J;
    public final e9 J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public n5 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public m2 M0;
    public long M1;
    public long N;
    public o0 N0;
    public boolean N1;
    public boolean O;
    public final r4 O0;
    public int O1;
    public final e2.f P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final l7 Q0;
    public boolean Q1;
    public n20 R;
    public final x1 R0;
    public boolean R1;
    public int S;
    public final x1 S0;
    public boolean S1;
    public int T;
    public final o2 T0;
    public float T1;
    public int U;
    public final o2 U0;
    public int U1;
    public boolean V;
    public final s81 V0;
    public boolean V1;
    public boolean W;
    public final p2 W0;
    public boolean W1;
    public boolean X;
    public final d8 X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final z8 Z0;
    public AnimatorSet Z1;
    public final th.b a;
    public int a0;
    public final d9 a1;
    public boolean a2;
    public final Activity b;
    public int b0;
    public final f4 b1;
    public boolean b2;
    public final int c;
    public final RectF c0;
    public final e8 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final k7 d1;
    public boolean d2;
    public boolean e;
    public final Path e0;
    public final n0 e1;
    public Runnable e2;
    public final WindowManager f;
    public int f0;
    public bi0 f1;
    public AnimatorSet f2;
    public int g0;
    public final ei0 g1;
    public c7 g2;
    public final WindowManager.LayoutParams h;
    public final b8 h0;
    public bi0 h1;
    public boolean h2;
    public final FrameLayout i0;
    public ImageView i1;
    public AnimatorSet i2;
    public final LinearLayout j0;
    public final kg.f0 j1;
    public ValueAnimator j2;
    public final FrameLayout k0;
    public final p2 k1;
    public boolean k2;
    public final org.telegram.ui.Components.voip.i0 l0;
    public final p2 l1;
    public s4.z l2;
    public final FrameLayout m0;
    public final p2 m1;
    public we m2;
    public final n8 n;
    public final x1 n0;
    public final p2 n1;
    public ValueAnimator n2;
    public final g5 o0;
    public final g4 o1;
    public o1.j o2;
    public final org.telegram.ui.ActionBar.u5 p0;
    public final c9 p1;
    public Boolean p2;
    public w6 q0;
    public n q1;
    public g7 q2;
    public final g8 r;
    public final s9 r0;
    public z7 r1;
    public AnimatorSet r2;
    public final z1 s;
    public final j4 s0;
    public a8 s1;
    public boolean s2;
    public final do0 t0;
    public final z8 t1;
    public int t2;
    public boolean u0;
    public final d u1;
    public ArrayList u2;
    public long v0;
    public s7 v1;
    public FrameLayout v2;
    public boolean w;
    public String w0;
    public ig.c1 w1;
    public boolean w2;
    public long x;
    public TLRPC.InputPeer x0;
    public View x1;
    public y6 x2;
    public f8 y;
    public u6 y0;
    public View y1;
    public org.telegram.utils.twidget.v y2;
    public r z0;
    public View z1;
    public boolean z2;

    public o8(Activity activity, int i10) {
        th.b bVar = new th.b();
        this.a = bVar;
        this.x = 0L;
        this.H = new RectF();
        int i11 = 1;
        this.M = true;
        this.P = new e2.f(null);
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new Path();
        new Rect();
        this.f0 = 0;
        this.g0 = -1;
        this.y0 = new u6();
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
        this.O1 = 0;
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.U1 = -3;
        this.W1 = false;
        o7 o7Var = new o7(this);
        this.d2 = true;
        this.k2 = true;
        this.t2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.I1;
        this.D = launchActivity != null ? new aa0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        org.telegram.messenger.i0.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        n8 n8Var = new n8(this, activity);
        this.n = n8Var;
        f7 f7Var = new f7(this, i11);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(n8Var, f7Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        z1 z1Var = new z1(activity, windowManager, this.n, layoutParams);
        this.s = z1Var;
        z1Var.a(new w7(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        n8 n8Var2 = this.n;
        g8 g8Var = new g8(this, activity);
        this.r = g8Var;
        n8Var2.addView(g8Var);
        g8 g8Var2 = this.r;
        b8 b8Var = new b8(this, activity);
        this.h0 = b8Var;
        g8Var2.addView(b8Var);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.r0 = new s9(this.h0);
        this.s0 = new j4();
        g8 g8Var3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.i0 = frameLayout;
        g8Var3.addView(frameLayout);
        g8 g8Var4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.k0 = frameLayout2;
        g8Var4.addView(frameLayout2);
        g8 g8Var5 = this.r;
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, activity, 9);
        this.l0 = i0Var;
        g8Var5.addView(i0Var);
        this.l0.setVisibility(8);
        this.l0.setAlpha(0.0f);
        g8 g8Var6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        g8Var6.addView(frameLayout3);
        int i12 = 13;
        wb.a(this.n, new mg.u(i12));
        int i13 = 8;
        c8 c8Var = new c8(this, activity, this.r0, this.r, bVar);
        this.A0 = c8Var;
        n8 n8Var3 = this.n;
        Objects.requireNonNull(n8Var3);
        c8Var.setCancelGestures(new d0(n8Var3, 15));
        this.A0.setResetState(new y6(this, 13));
        this.h0.addView(this.A0, w7.b6.e(-1, -1, zs.E1));
        this.A0.setOnClickListener(new a7(this, 12));
        b8 b8Var2 = this.h0;
        int i14 = this.J;
        b8Var2.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
        b8 b8Var3 = this.h0;
        float L = org.telegram.messenger.i0.L(12.0f);
        bi.d2 d2Var = rf.e0.a;
        b8Var3.setOutlineProvider(new rf.c0(0, L));
        this.h0.setClipToOutline(true);
        y6 y6Var = new y6(this, 14);
        ne0 ne0Var = new ne0(activity);
        ne0Var.a = new TextPaint(1);
        ne0Var.b = new TextPaint(1);
        gr grVar = gr.h;
        ne0Var.s = new org.telegram.ui.Components.t5(ne0Var, 0L, 350L, grVar);
        ne0Var.I = new eb0(ne0Var, 7);
        ne0Var.y = y6Var;
        this.C1 = ne0Var;
        d8 d8Var = new d8(this, activity, this.r0, this.s0);
        this.X0 = d8Var;
        d8Var.setCollageView(this.A0);
        d8 d8Var2 = this.X0;
        d8Var2.w = new y6(this, 15);
        d8Var2.setOnTapListener(new y6(this, 16));
        this.X0.setVisibility(8);
        d8 d8Var3 = this.X0;
        d8Var3.N = new y6(this, 17);
        this.h0.addView(d8Var3, w7.b6.e(-1, -1, zs.E1));
        this.h0.addView(this.C1, w7.b6.e(-1, -1, zs.E1));
        n8 n8Var4 = this.n;
        e8 e8Var = new e8(this, activity, n8Var4, n8Var4, this.r, bVar, this.r0);
        this.c1 = e8Var;
        e8Var.setAccount(i10);
        this.c1.setUiBlurBitmap(new th.m1(15));
        int i15 = 11;
        wb.a(this.l0, new org.telegram.ui.Components.k7(this, i15));
        this.c1.setOnHeightUpdate(new z6(this, i12));
        int i16 = 4;
        this.c1.setOnPeriodUpdate(new z6(this, i16));
        long j10 = this.N;
        if (j10 != 0) {
            this.c1.setDialogId(j10);
        }
        this.c1.setOnPremiumHint(new z6(this, 5));
        this.c1.setOnKeyboardOpen(new z6(this, 6));
        do0 do0Var = new do0(this, activity, i15);
        this.t0 = do0Var;
        this.r.addView(do0Var);
        z8 z8Var = new z8(activity, this.r, this.h0, bVar, this.r0);
        this.Z0 = z8Var;
        z8Var.setOnTimelineClick(new y6(this, 10));
        this.Z0.setOnHeightChange(new y6(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f7 = 388;
        frameLayout4.addView(this.Z0, w7.b6.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d9 d9Var = new d9(activity);
        this.a1 = d9Var;
        d9Var.setVisibility(8);
        this.a1.a(false);
        this.Y0.addView(this.a1, w7.b6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l0.addView(this.Y0, w7.b6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.l0.addView(this.c1, w7.b6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        z8 z8Var2 = new z8(activity, this.r, this.h0, bVar, this.r0);
        this.t1 = z8Var2;
        z8Var2.X0 = true;
        z8Var2.setVisibility(8);
        this.t1.setAlpha(0.0f);
        this.l0.addView(this.t1, w7.b6.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        k7 k7Var = new k7(this, activity, bVar, this.r0);
        this.d1 = k7Var;
        k7Var.setVisibility(8);
        this.l0.addView(this.d1, w7.b6.e(-1, -2, 85));
        x1 x1Var = new x1(activity);
        this.n0 = x1Var;
        x1Var.setContentDescription(cd.L0(2131754878, null));
        x1 x1Var2 = this.n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        x1Var2.setScaleType(scaleType);
        this.n0.setImageResource(R.drawable.msg_photo_back);
        x1 x1Var3 = this.n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        x1Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.n0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.n0.setOnClickListener(new a7(this, i11));
        this.i0.addView(this.n0, w7.b6.e(56, 56, 51));
        this.s.a(this.n0);
        g5 g5Var = new g5(activity, i10);
        this.o0 = g5Var;
        g5Var.a(false, false);
        this.o0.setOnClickListener(new rh.u1(10, this, activity));
        this.i0.addView(this.o0, w7.b6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(activity);
        this.p0 = u5Var;
        u5Var.setTextSize(20);
        this.p0.setGravity(19);
        this.p0.setTextColor(-1);
        this.p0.setTypeface(org.telegram.messenger.i0.o());
        this.p0.l(cd.L0(2131746368, null), false);
        this.p0.getPaint().setShadowLayer(org.telegram.messenger.i0.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.p0.setAlpha(0.0f);
        this.p0.setVisibility(8);
        this.p0.setEllipsizeByGradient(true);
        this.p0.setRightPadding(org.telegram.messenger.i0.L(144.0f));
        this.i0.addView(this.p0, w7.b6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.j0.setGravity(5);
        this.i0.addView(this.j0, w7.b6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        z6 z6Var = new z6(this, 7);
        n8 n8Var5 = this.n;
        n0 n0Var = new n0(activity);
        n0Var.x = true;
        n0Var.y = true;
        n0Var.h = z6Var;
        n0Var.a = i10;
        n0Var.b = n8Var5;
        n0Var.setScaleType(scaleType);
        n0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        n0Var.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        n0Var.setVisibility(8);
        n0Var.setAlpha(0.0f);
        n0Var.setOnClickListener(new rh.s(n0Var, 19));
        n0Var.f = new kp(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(2.0f), -1);
        n0Var.d();
        this.e1 = n0Var;
        p2 p2Var = new p2(activity, 1);
        p2Var.l(1.0f, -71.0f);
        p2Var.d = 2000L;
        p2Var.U = false;
        p2Var.H.r(true, false);
        this.k1 = p2Var;
        p2Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        this.i0.addView(this.k1, w7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ei0 ei0Var = new ei0(activity);
        this.g1 = ei0Var;
        ei0Var.setScaleType(scaleType);
        ei0 ei0Var2 = this.g1;
        n5 n5Var = this.K1;
        ei0Var2.setImageResource((n5Var == null || !n5Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g1.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.g1.setOnClickListener(new a7(this, 2));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        kg.f0 f0Var = new kg.f0(activity);
        this.j1 = f0Var;
        f0Var.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.j1.setVisibility(8);
        this.j1.setAlpha(0.0f);
        this.j1.setOnClickListener(new a7(this, 3));
        this.j0.addView(this.j1, w7.b6.r(46, 56, 53));
        this.j0.addView(this.g1, w7.b6.r(46, 56, 53));
        this.j0.addView(this.e1, w7.b6.e(46, 56, 53));
        a9 a9Var = new a9(activity);
        this.E0 = a9Var;
        a9Var.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.E0.setOnClickListener(new a7(this, i16));
        this.E0.setOnLongClickListener(new bi.h1(this, 6));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.s.a(this.E0);
        this.i0.addView(this.E0, w7.b6.e(56, 56, 53));
        b9 b9Var = new b9(activity);
        this.F0 = b9Var;
        b9Var.setContentDescription(cd.L0(2131754886, null));
        this.F0.setOnClickListener(new a7(this, 5));
        boolean q6 = u0.q(activity);
        this.F0.setVisibility(q6 ? 0 : 8);
        this.F0.setAlpha(q6 ? 1.0f : 0.0f);
        this.s.a(this.F0);
        this.i0.addView(this.F0, w7.b6.e(56, 56, 53));
        u uVar = new u(activity);
        this.G0 = uVar;
        uVar.setContentDescription(cd.L0(2131754895, null));
        this.G0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        if (this.z0 == null) {
            this.z0 = (r) r.a().get(6);
        }
        this.G0.setOnClickListener(new a7(this, 6));
        this.G0.a(new ob0(this.z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.s.a(this.G0);
        this.i0.addView(this.G0, w7.b6.e(56, 56, 53));
        a9 a9Var2 = new a9(activity);
        this.H0 = a9Var2;
        a9Var2.setContentDescription(cd.L0(2131754894, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.H0.a(new ob0(new r("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new a7(this, 7));
        this.s.a(this.H0);
        this.i0.addView(this.H0, w7.b6.e(56, 56, 53));
        t tVar = new t(activity, this.s);
        this.I0 = tVar;
        tVar.a.v0(6);
        this.I0.setSelected((r) null);
        this.I0.setOnLayoutClick(new z6(this, i13));
        this.i0.addView(this.I0, w7.b6.e(-1, 56, 53));
        p2 p2Var2 = new p2(activity, 1);
        p2Var2.l(1.0f, -20.0f);
        p2Var2.d = 5000L;
        p2Var2.i(true);
        p2Var2.s(cd.L0(2131744731, null));
        p2Var2.l0 = new r5.a(16);
        this.l1 = p2Var2;
        p2Var2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        this.i0.addView(this.l1, w7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        p2 p2Var3 = new p2(activity, 2);
        p2Var3.l(0.0f, 28.0f);
        p2Var3.d = 5000L;
        p2Var3.p(true);
        this.m1 = p2Var3;
        this.i0.addView(p2Var3, w7.b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        p2 p2Var4 = new p2(activity, 1);
        p2Var4.l(1.0f, -20.0f);
        p2Var4.d = 5000L;
        p2Var4.s(cd.L0(2131744722, null));
        this.n1 = p2Var4;
        p2Var4.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        this.i0.addView(this.n1, w7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        e9 e9Var = new e9(activity);
        Paint paint = new Paint(1);
        e9Var.a = paint;
        Paint paint2 = new Paint(1);
        e9Var.b = paint2;
        e9Var.e = new org.telegram.ui.Components.t5(e9Var, 0L, 250L, grVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        e9Var.c = e6Var;
        e6Var.n(0.3f, 250L, grVar);
        e6Var.w(org.telegram.messenger.i0.L(13.0f));
        e6Var.u(-1);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.setCallback(e9Var);
        e6Var.b = 1;
        e9Var.a(0L, false);
        this.J0 = e9Var;
        h0(false, false);
        this.i0.addView(this.J0, w7.b6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.J0);
        MediaController.O(0);
        r4 r4Var = new r4(activity);
        this.O0 = r4Var;
        r4Var.setDelegate(o7Var);
        r4 r4Var2 = this.O0;
        boolean z10 = this.O1 == 1;
        r4Var2.n0 = -1.0f;
        r4Var2.o0 = z10;
        r4Var2.invalidate();
        this.k0.addView(this.O0, w7.b6.e(-1, 100, 87));
        this.s.a(this.O0);
        this.O0.e(true, this.A0.j() ? this.A0.getFilledProgress() : 0.0f);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.i(cd.L0(2131748798, null), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.k0.addView(this.P0, w7.b6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new a7(this, 8));
        p2 p2Var5 = new p2(activity, 3);
        p2Var5.p(true);
        p2Var5.s(cd.L0(2131744729, null));
        p2Var5.h = org.telegram.messenger.i0.L(320.0f);
        p2Var5.d = 5000L;
        p2Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = p2Var5;
        this.k0.addView(p2Var5, w7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        s81 s81Var = new s81(activity);
        this.V0 = s81Var;
        s81Var.M = false;
        s81Var.setAlpha(0.0f);
        this.k0.addView(this.V0, w7.b6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new f7(this, 4));
        s81 s81Var2 = this.V0;
        this.T1 = 0.0f;
        s81Var2.b(false, 0.0f);
        a5 a5Var = new a5(activity, i10, new y6(this, 12));
        this.D0 = a5Var;
        int i17 = 9;
        a5Var.c = new z6(this, i17);
        this.k0.addView(a5Var, w7.b6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        l7 l7Var = new l7(this, activity);
        this.Q0 = l7Var;
        l7Var.setOnSwitchModeListener(new z6(this, 10));
        this.Q0.setOnSwitchingModeListener(new z6(this, 11));
        this.m0.addView(this.Q0, w7.b6.e(-1, 48, 55));
        this.s.a(this.Q0);
        x1 x1Var4 = new x1(activity);
        this.R0 = x1Var4;
        x1Var4.setContentDescription(cd.L0(2131754752, null));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.b6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.R0);
        this.R0.setOnClickListener(new a7(this, i17));
        x1 x1Var5 = new x1(activity);
        this.S0 = x1Var5;
        x1Var5.setContentDescription(cd.L0(2131748800, null));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.b6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new a7(this, 10));
        o2 o2Var = new o2(activity);
        this.T0 = o2Var;
        this.m0.addView(o2Var, w7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.T0);
        o2 o2Var2 = new o2(activity);
        this.U0 = o2Var2;
        o2Var2.a.t(cd.L0(2131744721, null), false, true);
        o2Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.u1 = dVar2;
        dVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.u1.i(cd.L0(2131744707, null), false, true);
        this.u1.setOnClickListener(new a7(this, 11));
        this.m0.addView(this.u1, w7.b6.d(-1, 48.0f, zs.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        f4 f4Var = new f4(activity);
        f4Var.b = new ArrayList();
        f4Var.e = true;
        f4Var.h = true;
        View view = new View(activity);
        f4Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        f4Var.addView(view, w7.b6.e(-1, -1, zs.E1));
        f4Var.a(0, R.drawable.media_draw, cd.L0(2131754814, null));
        f4Var.a(2, R.drawable.msg_photo_sticker, cd.L0(2131754756, null));
        f4Var.a(1, R.drawable.msg_photo_text2, cd.L0(2131754807, null));
        f4Var.a(3, R.drawable.media_crop, cd.L0(2131751700, null));
        f4Var.a(4, R.drawable.msg_photo_settings, cd.L0(2131754811, null));
        String L0 = cd.L0(2131745657, null);
        f4Var.d = L0;
        f4Var.e = true;
        e4 e4Var = new e4(f4Var, activity, L0, true);
        f4Var.c = e4Var;
        e4Var.setContentDescription(cd.L0(2131745657, null));
        f4Var.addView(f4Var.c, w7.b6.c(-2.0f, -2));
        f4Var.e();
        this.b1 = f4Var;
        f4Var.setVisibility(8);
        this.b1.setOnClickListener(new z6(this, 12));
        this.m0.addView(this.b1, w7.b6.e(-1, 52, 23));
        c9 c9Var = new c9(activity);
        this.p1 = c9Var;
        c9Var.setAlpha(0.0f);
        this.p1.setVisibility(8);
        this.h0.addView(this.p1, w7.b6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        g4 g4Var = new g4(activity, i10, bVar);
        this.o1 = g4Var;
        this.h0.addView(g4Var, w7.b6.e(-1, -1, zs.E1));
        l0(false);
    }

    public static o8 D(Activity activity, int i10) {
        o8 o8Var = F2;
        if (o8Var != null && (o8Var.b != activity || o8Var.c != i10)) {
            o8Var.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new o8(activity, i10);
        }
        return F2;
    }

    public static void Z(boolean z10) {
        vp.d1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(o8 o8Var) {
        t7 t7Var = o8Var.B0;
        if (t7Var == null || t7Var.getTextureView() == null) {
            o8Var.c2 = false;
            return;
        }
        Bitmap bitmap = o8Var.B0.getTextureView().getBitmap();
        if (bitmap == null) {
            o8Var.c2 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = 0;
            while (i11 < 10) {
                i11++;
                f7 += org.telegram.messenger.i0.B(bitmap.getPixel((i10 + 1) * width, i11 * height));
            }
        }
        float f10 = f7 / 100.0f;
        bitmap.recycle();
        o8Var.c2 = f10 < 0.22f;
    }

    public static void b(o8 o8Var) {
        ValueAnimator valueAnimator = o8Var.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            o8Var.j2 = null;
        }
        o8Var.k2 = false;
        g8 g8Var = o8Var.r;
        float f7 = g8Var.a;
        float f10 = g8Var.b;
        g8Var.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        o8Var.j2 = ofFloat;
        ofFloat.addUpdateListener(new fe.c(o8Var, f7, f10, 7));
        o8Var.j2.setDuration(340L);
        o8Var.j2.setInterpolator(gr.h);
        o8Var.j2.addListener(new q7(o8Var, 0));
        o8Var.j2.start();
    }

    public static boolean c(o8 o8Var) {
        Activity activity = o8Var.b;
        if (activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, zs.x1);
        return false;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable f7 = i0.a.f(context, R.drawable.story_camera);
        int L = org.telegram.messenger.i0.L(35.0f);
        int i10 = -L;
        f7.setBounds(i10 / 4, i10, (L / 4) * 3, 0);
        spannableString.setSpan(new x7(f7, f7), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        o8 o8Var = F2;
        if (o8Var != null) {
            o8Var.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        n5 n5Var = this.K1;
        if (n5Var != null) {
            return n5Var.r();
        }
        return 1;
    }

    public final String B() {
        t7 t7Var = this.B0;
        if (t7Var == null || t7Var.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        o();
        return (String) this.u2.get(this.t2);
    }

    public final o0 C() {
        if (this.N0 == null) {
            o0 o0Var = new o0(this.b);
            this.N0 = o0Var;
            this.k0.addView(o0Var, w7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String E() {
        t7 t7Var = this.B0;
        if (t7Var == null || t7Var.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getNextFlashMode();
        }
        o();
        ArrayList arrayList = this.u2;
        return (String) arrayList.get(this.t2 + 1 >= arrayList.size() ? 0 : this.t2 + 1);
    }

    public final ImageView F() {
        if (this.i1 == null) {
            bi0 bi0Var = new bi0(R.raw.sun_outline, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.h1 = bi0Var;
            bi0Var.h = true;
            n5 n5Var = this.K1;
            int i10 = 0;
            if (n5Var == null || !n5Var.y0) {
                bi0Var.P(0);
                this.h1.M(0);
            } else {
                bi0Var.M(35);
                this.h1.P(36);
            }
            this.h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J9, this.a);
            this.h1.Q(w02, "Sunny");
            this.h1.Q(w02, "Path 6");
            this.h1.Q(w02, "Path");
            this.h1.Q(w02, "Path 5");
            this.h1.o();
            ImageView imageView = new ImageView(this.b);
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.i1.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
            this.i1.setOnClickListener(new a7(this, i10));
            this.i1.setVisibility(8);
            this.i1.setImageDrawable(this.h1);
            this.i1.setAlpha(0.0f);
            this.j0.addView(this.i1, 0, w7.b6.r(46, 56, 53));
        }
        return this.i1;
    }

    public final void G() {
        s7 s7Var = this.v1;
        if (s7Var == null) {
            return;
        }
        this.v2 = null;
        s7Var.getTopLayout().setAlpha(0.0f);
        this.v1.getTopLayout().setTranslationY(-org.telegram.messenger.i0.L(16.0f));
        this.v1.getBottomLayout().setAlpha(0.0f);
        this.v1.getBottomLayout().setTranslationY(org.telegram.messenger.i0.L(48.0f));
        this.v1.getWeightChooserView().setTranslationX(-org.telegram.messenger.i0.L(32.0f));
        this.v1.setVisibility(8);
    }

    public final boolean H() {
        return !this.a2 && (this.A0.j() ? this.A0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean I() {
        m2 m2Var;
        if (this.W || (m2Var = this.M0) == null) {
            return false;
        }
        return m2Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) org.telegram.messenger.i0.q.y) * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m)));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i10, boolean z10) {
        n5 n5Var;
        n5 n5Var2;
        d dVar;
        org.telegram.ui.ActionBar.u5 u5Var;
        int i11;
        int i12;
        float L;
        ImageView imageView;
        n5 n5Var3;
        n5 n5Var4;
        n5 n5Var5;
        n5 n5Var6;
        t7 t7Var;
        int i13 = this.f0;
        if (i10 == i13) {
            return;
        }
        this.f0 = i10;
        AnimatorSet animatorSet = this.i2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        N(i13, i10);
        f4 f4Var = this.b1;
        if (f4Var != null) {
            f4Var.b(i10 == 1, z10);
        }
        t tVar = this.I0;
        h0(i10 == 0 && this.O1 == 1 && !tVar.e && !H(), z10);
        if (i10 != 1) {
            this.a1.a(z10);
        }
        b0(this.n0, !tVar.e, z10);
        b0(this.E0, (this.a2 || i10 != 0 || tVar.e || this.Y1 == null || H()) ? false : true, z10);
        boolean z11 = this.a2;
        c8 c8Var = this.A0;
        b0(this.F0, (z11 || i10 != 0 || (t7Var = this.B0) == null || !t7Var.a || tVar.e || c8Var.j()) ? false : true, true);
        b0(this.G0, (this.a2 || i10 != 0 || tVar.e) ? false : true, z10);
        l0(z10);
        n0 n0Var = this.e1;
        kg.f0 f0Var = this.j1;
        ei0 ei0Var = this.g1;
        z8 z8Var = this.t1;
        z8 z8Var2 = this.Z0;
        d dVar2 = this.u1;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.p0;
        e8 e8Var = this.c1;
        o2 o2Var = this.U0;
        o2 o2Var2 = this.T0;
        a5 a5Var = this.D0;
        d8 d8Var = this.X0;
        org.telegram.ui.Components.voip.i0 i0Var = this.l0;
        l7 l7Var = this.Q0;
        r4 r4Var = this.O0;
        if (!z10) {
            t7 t7Var2 = this.B0;
            if (t7Var2 != null) {
                t7Var2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            d8Var.setAlpha(((i10 != 1 || c8Var.j()) && i10 != 2) ? 0.0f : 1.0f);
            c8Var.setAlpha((i10 == 0 || (i10 == 1 && c8Var.j())) ? 1.0f : 0.0f);
            r4Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            r4Var.setTranslationY(i10 == 0 ? 0.0f : org.telegram.messenger.i0.L(16.0f));
            a5Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            l7Var.setAlpha((i10 != 0 || H()) ? 0.0f : 1.0f);
            l7Var.setTranslationY((i10 != 0 || H()) ? org.telegram.messenger.i0.L(16.0f) : 0.0f);
            o2Var2.setAlpha((i10 == 0 && this.a2 && !H()) ? 1.0f : 0.0f);
            o2Var.setAlpha((i10 == 0 && !this.a2 && H()) ? 0.6f : 0.0f);
            i0Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            i0Var.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : org.telegram.messenger.i0.L(12.0f));
            e8Var.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            ei0Var.setAlpha((i10 == 1 && this.O1 == 1) ? 1.0f : 0.0f);
            f0Var.setAlpha((i10 != 1 || (this.O1 != 1 && ((n5Var2 = this.K1) == null || TextUtils.isEmpty(n5Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            n0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.i1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (n5Var = this.K1) != null && n5Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            z8Var2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            z8Var.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            u5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            M(i13, i10);
            return;
        }
        this.i2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        t7 t7Var3 = this.B0;
        if (t7Var3 != null) {
            dVar = dVar2;
            u5Var = u5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(t7Var3, (Property<t7, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            u5Var = u5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || c8Var.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(d8Var, (Property<d8, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && c8Var.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(c8Var, (Property<c8, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(r4Var, (Property<r4, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : org.telegram.messenger.i0.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(r4Var, (Property<r4, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(a5Var, (Property<a5, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || H()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property2, (i10 != 0 || H()) ? org.telegram.messenger.i0.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(o2Var2, (Property<o2, Float>) property, (i10 == 0 && this.a2 && !H()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<o2, Float>) property, (i10 == 0 && !this.a2 && H()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<org.telegram.ui.Components.voip.i0, Float>) property, ((i10 == 1 && ((n5Var6 = this.K1) == null || n5Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((n5Var5 = this.K1) == null || n5Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                L = org.telegram.messenger.i0.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<org.telegram.ui.Components.voip.i0, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(e8Var, (Property<e8, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(z8Var2, (Property<z8, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(z8Var, (Property<z8, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property, (i10 == 1 || (this.O1 != 1 && ((n5Var4 = this.K1) == null || TextUtils.isEmpty(n5Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (n5Var3 = this.K1) != null && n5Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<s81, Float>) property, 0.0f));
                this.i2.playTogether(arrayList);
                this.i2.addListener(new p7(this, i13, i10, 0));
                this.i2.setDuration(460L);
                this.i2.setInterpolator(gr.h);
                this.i2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<org.telegram.ui.Components.voip.i0, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(e8Var, (Property<e8, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(z8Var2, (Property<z8, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(z8Var, (Property<z8, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property, (i10 == 1 || (this.O1 != 1 && ((n5Var4 = this.K1) == null || TextUtils.isEmpty(n5Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<s81, Float>) property, 0.0f));
        this.i2.playTogether(arrayList);
        this.i2.addListener(new p7(this, i13, i10, 0));
        this.i2.setDuration(460L);
        this.i2.setInterpolator(gr.h);
        this.i2.start();
    }

    public final void K(Runnable runnable, long j10) {
        if (this.S1 || this.K1 == null) {
            return;
        }
        c7 c7Var = this.g2;
        if (c7Var != null) {
            org.telegram.messenger.i0.r(c7Var);
        }
        this.h2 = true;
        this.S1 = true;
        this.g2 = new c7(this, runnable, 1);
        this.X0.setAlpha(0.0f);
        this.X0.setVisibility(0);
        this.X0.n(this.K1, this.g2, j10);
        this.X0.q(this.K1, false);
        org.telegram.messenger.i0.h3(this.g2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L() {
        n5 n5Var;
        n5 n5Var2;
        n5 n5Var3;
        s7 s7Var;
        n5 n5Var4;
        s7 s7Var2;
        s7 s7Var3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            e8 e8Var = this.c1;
            if (e8Var != null && e8Var.N1) {
                e8Var.M1 = false;
                e8Var.z(false, false);
                return false;
            }
            if (this.Q1) {
                r4 r4Var = this.O0;
                if (r4Var.r0) {
                    r4Var.r0 = false;
                    r4Var.v0 = SystemClock.elapsedRealtime();
                    r4Var.u0 = true;
                    ((o7) r4Var.a).e(false);
                    r4Var.J.c(false);
                    r4Var.K.c(false);
                    r4Var.L.c(false);
                    r4Var.invalidate();
                    return false;
                }
            } else if (!this.P1 && !e8Var.p()) {
                k7 k7Var = this.d1;
                if (k7Var.M) {
                    k7Var.c(false, true);
                    return false;
                }
                m2 m2Var = this.M0;
                if (m2Var != null) {
                    org.telegram.ui.ActionBar.t0 t0Var = m2Var.G;
                    if (t0Var == null || !t0Var.v()) {
                        e(false);
                        this.m2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = t0Var.getSearchField();
                    if (m2Var.w.c()) {
                        org.telegram.messenger.i0.v1(searchField);
                        return false;
                    }
                    m2Var.y.y(t0Var.T(true));
                    return false;
                }
                if (this.g0 != 0 || (s7Var3 = this.v1) == null || !s7Var3.v0()) {
                    if (this.g0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    int i10 = this.f0;
                    c8 c8Var = this.A0;
                    if (i10 == 0) {
                        ArrayList arrayList = c8Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            if (((w) obj).n != null) {
                                c8Var.e();
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.f0 == 1 && (((n5Var2 = this.K1) == null || (!n5Var2.n && !n5Var2.u)) && !this.u0)) {
                        if (n5Var2 != null && n5Var2.g && ((s7Var2 = this.v1) == null || !s7Var2.r0())) {
                            n5 n5Var5 = this.K1;
                            if (!n5Var5.j) {
                            }
                        }
                        s7 s7Var4 = this.v1;
                        if (s7Var4 == null || !s7Var4.v0()) {
                            if (this.v0 == 0 && (((this.L1 && !c8Var.j() && (((s7Var = this.v1) == null || !s7Var.r0()) && ((n5Var4 = this.K1) == null || n5Var4.Z0 == null))) || !this.b1.h) && (((n5Var3 = this.K1) == null || !n5Var3.g || (!n5Var3.n && !n5Var3.u)) && !this.u0 && (n5Var3 == null || !n5Var3.o)))) {
                                J(0, true);
                                return false;
                            }
                            if (this.v0 != 0) {
                                p(true);
                                return false;
                            }
                            Activity activity = this.b;
                            th.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                            String L0 = cd.L0(2131751406, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = cd.L0(2131747294, null);
                            n5 n5Var6 = this.K1;
                            if (n5Var6 != null && !n5Var6.g && !n5Var6.o) {
                                alertDialog$Builder.i(cd.L0(n5Var6.c ? 2131744672 : 2131744511, null), new f7(this, 7));
                            }
                            n5 n5Var7 = this.K1;
                            alertDialog$Builder.k(cd.L0((n5Var7 == null || !n5Var7.c || n5Var7.g) ? 2131751407 : 2131744704, null), new f7(this, 8));
                            alertDialog$Builder.h(cd.L0(2131752589, null), null);
                            x1Var.show();
                            View d = x1Var.d(-1);
                            if (d instanceof TextView) {
                                int i12 = org.telegram.ui.ActionBar.t6.q7;
                                org.telegram.ui.ActionBar.a7.V((TextView) d, i12, bVar);
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i12, bVar), 51), 6, 6);
                                org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 51);
                                d.setBackground(a02);
                                org.telegram.ui.ActionBar.a7.k(d, a02, null, h, bVar);
                            }
                        }
                    }
                    if (this.f0 != 2 || (n5Var = this.K1) == null || n5Var.b0) {
                        p(true);
                        return true;
                    }
                    W();
                    J(1, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void M(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            u(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i10 == 2) {
            this.t1.setVisibility(8);
            this.l0.setVisibility(i11 == 1 ? 0 : 8);
            this.c1.setVisibility(8);
            this.u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.b1.setVisibility(8);
            this.l0.setVisibility(i11 == 2 ? 0 : 8);
            this.g1.setVisibility(8);
            this.j1.setVisibility(8);
            this.e1.setVisibility(8);
            ImageView imageView = this.i1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.X0.setVisibility(i11 == 2 ? 0 : 8);
            this.Z0.setVisibility(8);
            if (i11 != 2) {
                y();
                x();
            }
            this.p0.setVisibility(i11 == 2 ? 0 : 8);
            v();
            this.p1.setAlpha(0.0f);
            this.p1.setVisibility(8);
            this.a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            n5 n5Var = this.K1;
            if (n5Var == null || !n5Var.n) {
                t();
                G();
            }
            ne0 ne0Var = this.C1;
            if (ne0Var != null) {
                ne0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            n5 n5Var2 = this.K1;
            this.a1.setVisibility((n5Var2 == null || n5Var2.h0 < 30000) ? 8 : 0);
            this.l0.setAlpha(1.0f);
            this.l0.setTranslationY(0.0f);
            n5 n5Var3 = this.K1;
            this.c1.setVisibility((n5Var3 == null || n5Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.V1) {
            C().setVisibility(0);
            o0 C = C();
            C.r.e(true, 0.0f);
            C.a(true);
            d0 d0Var = C.h;
            if (d0Var != null) {
                org.telegram.messenger.i0.r(d0Var);
            }
            d0 d0Var2 = new d0(C, 1);
            C.h = d0Var2;
            org.telegram.messenger.i0.h3(d0Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        ne0 ne0Var2 = this.C1;
        if (ne0Var2 != null) {
            ne0Var2.setAllowTouch(i11 == 1 && ((i12 = this.g0) == -1 || i12 == 1));
        }
        e8 e8Var = this.c1;
        if (e8Var != null) {
            e8Var.d0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            ui.b0(i13).B(0);
            ui.b0(i13).V0(0, false, true, false);
            ui.b0(i13).V0(2, false, true, false);
            th.e5 O1 = vp.r1(i13).O1();
            if (O1.Q == 0) {
                O1.S();
            }
            vp.r1(i13).O1().U();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04cc  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(int i10, int i11) {
        c8 c8Var;
        ?? r82;
        CharSequence charSequence;
        int i12;
        int i13;
        SpannableStringBuilder append;
        String str;
        n5 n5Var;
        boolean z10;
        String str2;
        k4 k4Var;
        z60 z60Var;
        boolean z11;
        n5 n5Var2;
        boolean z12;
        CharSequence charSequence2;
        boolean z13;
        n5 n5Var3;
        j4.w o10;
        n5 n5Var4;
        k61 textureView;
        n5 n5Var5;
        c8 c8Var2 = this.A0;
        if (i11 == 0) {
            Y(false);
            r4 r4Var = this.O0;
            r4Var.setVisibility(0);
            if (r4Var != null) {
                r4Var.g(false);
            }
            this.Q0.setVisibility(0);
            s81 s81Var = this.V0;
            s81Var.setVisibility(0);
            s81Var.setAlpha(0.0f);
            this.J0.a(0L, true);
            n5 n5Var6 = this.K1;
            if (n5Var6 != null) {
                n5Var6.i(false);
                this.K1 = null;
            }
            if (c8Var2 != null) {
                c8Var2.e();
                r4Var.e(false, 0.0f);
            }
        }
        if (i10 == 0) {
            d0(null);
            a0(new y6(this, 18));
            o0 o0Var = this.N0;
            if (o0Var != null) {
                o0Var.setVisibility(8);
            }
            this.W0.e(true);
            p2 p2Var = this.l1;
            if (p2Var != null) {
                p2Var.e(true);
            }
        }
        z8 z8Var = this.Z0;
        org.telegram.ui.Components.voip.i0 i0Var = this.l0;
        ei0 ei0Var = this.g1;
        f4 f4Var = this.b1;
        d8 d8Var = this.X0;
        e8 e8Var = this.c1;
        org.telegram.ui.ActionBar.u5 u5Var = this.p0;
        int i14 = this.c;
        if (i11 == 1 || i10 == 1) {
            n5 n5Var7 = i11 == 1 ? this.K1 : null;
            n0 n0Var = this.e1;
            n0Var.setEntry(n5Var7);
            int i15 = this.O1;
            c8Var = c8Var2;
            kg.f0 f0Var = this.j1;
            if (i15 == 1) {
                ei0Var.setVisibility(0);
                n5 n5Var8 = this.K1;
                e0(n5Var8 != null && n5Var8.Y, false);
                f0Var.setVisibility(0);
                d8Var.x(-9982, false);
                ((kf0) f0Var.c).a(d8Var.k(), false);
                u5Var.setRightPadding(org.telegram.messenger.i0.L(144.0f));
                r82 = 0;
            } else {
                n5 n5Var9 = this.K1;
                if (n5Var9 == null || TextUtils.isEmpty(n5Var9.y)) {
                    r82 = 0;
                    u5Var.setRightPadding(org.telegram.messenger.i0.L(48.0f));
                } else {
                    ei0Var.setVisibility(8);
                    r82 = 0;
                    f0Var.setVisibility(0);
                    ((kf0) f0Var.c).a(true, false);
                    u5Var.setRightPadding(org.telegram.messenger.i0.L(48.0f));
                }
            }
            n0Var.setVisibility(r82);
            n5 n5Var10 = this.K1;
            if (n5Var10 == null || !n5Var10.u) {
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                F().setVisibility(r82);
                n0(r82);
            }
            f4Var.setVisibility(r82);
            d8Var.setVisibility(r82);
            n5 n5Var11 = this.K1;
            e8Var.setVisibility(((n5Var11 == null || n5Var11.J0 == 0) && this.v0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Y0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            n5 n5Var12 = this.K1;
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(((n5Var12 == null || n5Var12.J0 == 0) && this.v0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            i0Var.setVisibility(0);
            i0Var.clearFocus();
            n5 n5Var13 = this.K1;
            e8Var.A(n5Var13 == null ? 86400 : n5Var13.I0, false);
            e8Var.setPeriodVisible(!vp.r1(i14).A3() && ((n5Var = this.K1) == null || !n5Var.g));
            n5 n5Var14 = this.K1;
            e8Var.setHasRoundVideo((n5Var14 == null || n5Var14.o0 == null) ? false : true);
            if (e8Var == null) {
                charSequence = "";
                i12 = i14;
            } else {
                n5 n5Var15 = this.K1;
                if (n5Var15 == null || !n5Var15.n) {
                    charSequence = "";
                    i12 = i14;
                    e8Var.v(null, null);
                } else {
                    TLRPC.Peer peer = n5Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        String p5 = h20.p(vp.r1(i14).Z1(Long.valueOf(peer.user_id)));
                        n5 n5Var16 = this.K1;
                        charSequence = "";
                        append = new SpannableStringBuilder(jj.f6()).append((CharSequence) " ").append((CharSequence) p5);
                        n5Var16.p = append;
                        i13 = i14;
                    } else {
                        charSequence = "";
                        i13 = i14;
                        TLRPC.Chat L0 = vp.r1(i14).L0(Long.valueOf(-org.telegram.messenger.o5.o(peer)));
                        CharSequence charSequence3 = L0 == null ? charSequence : L0.title;
                        n5 n5Var17 = this.K1;
                        append = new SpannableStringBuilder(jj.f6()).append((CharSequence) " ").append(charSequence3);
                        n5Var17.p = append;
                    }
                    String str3 = this.K1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(cd.L0(2131744753, null));
                        i12 = i13;
                        spannableString.setSpan(new zi(3), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i12 = i13;
                        str = str3;
                    }
                    e8Var.v(append, str);
                }
            }
            n5 n5Var18 = this.K1;
            boolean z14 = (n5Var18 != null && n5Var18.v() && this.K1.t()) ? false : true;
            boolean z15 = z8Var.j0;
            z8Var.j0 = z14;
            z8Var.i0.f(z14, true);
            z8Var.invalidate();
        } else {
            c8Var = c8Var2;
            charSequence = "";
            i12 = i14;
        }
        d dVar = this.u1;
        z8 z8Var2 = this.t1;
        int i16 = 2;
        if (i11 == 2 || i10 == 2) {
            z10 = false;
            u5Var.setVisibility(0);
            z8Var2.setVisibility(0);
            n5 n5Var19 = this.K1;
            if (n5Var19 == null || !n5Var19.b0) {
                str2 = null;
            } else {
                str2 = null;
                u5Var.l(cd.L0(2131746370, null), false);
            }
            i0Var.setVisibility(0);
            dVar.setVisibility(0);
            i16 = 2;
        } else {
            str2 = null;
            z10 = false;
        }
        if (i11 == i16) {
            u5Var.l(cd.L0(2131746370, str2), z10);
        }
        k7 k7Var = this.d1;
        if (i11 == 1) {
            this.N1 = z10;
            n5 n5Var20 = this.K1;
            boolean z16 = (n5Var20 == null || n5Var20.J0 == 0) ? false : true;
            boolean z17 = n5Var20 != null && n5Var20.g;
            String L02 = cd.L0(z17 ? 2131751355 : z16 ? 2131743830 : 2131748267, null);
            boolean z18 = !z16;
            boolean z19 = z17;
            if (TextUtils.equals(L02, f4Var.d) && z18 == f4Var.e) {
                z12 = z16;
            } else {
                f4Var.removeView(f4Var.c);
                z12 = z16;
                Context context = f4Var.getContext();
                f4Var.d = L02;
                f4Var.e = z18;
                e4 e4Var = new e4(f4Var, context, L02, z18);
                f4Var.c = e4Var;
                e4Var.setContentDescription(L02);
                f4Var.addView(f4Var.c, w7.b6.c(-2.0f, -2));
                f4Var.e();
            }
            z8Var2.setVisibility(8);
            dVar.setVisibility(8);
            if (!this.h2) {
                n5 n5Var21 = this.K1;
                if (n5Var21 == null || !n5Var21.u) {
                    d8Var.set(n5Var21);
                } else {
                    d8Var.l(n5Var21);
                }
            }
            this.h2 = false;
            e8Var.f.getEditText().setOnPremiumMenuLockClickListener(vp.r1(i12).U4() ? null : new y6(this, 19));
            k7Var.setVisibility(this.H1 == null ? 8 : 0);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                k7Var.c(false, false);
                k7Var.c = arrayList;
                k7Var.d = arrayList2;
                k7Var.e = arrayList3;
                k7Var.x = new qz0(Integer.toString(arrayList.size()), 20.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
                k7Var.K = new qz0(cd.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                k7Var.b.f3.O(false);
                k7Var.setSelected(this.H1.indexOf(this.K1));
            }
            z8Var.setMaxCount((z12 || z19 || this.H1 != null || ((n5Var5 = this.K1) != null && (n5Var5.v() || !this.K1.K))) ? 1 : 3);
            if (i10 != 2) {
                n5 n5Var22 = this.K1;
                if (n5Var22 != null && (n5Var22.c || n5Var22.g || this.u0)) {
                    if (n5Var22.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    n5 n5Var23 = this.K1;
                    if (n5Var23.K && n5Var23.a1 != null && (textureView = d8Var.getTextureView()) != null) {
                        textureView.setDelegate(new f7(this, 6));
                    }
                    e8Var.setText(this.K1.C0);
                } else if (i10 != 2) {
                    e8Var.V = true;
                    charSequence2 = charSequence;
                    e8Var.f.setText(charSequence2);
                    n5 n5Var24 = this.K1;
                    f4Var.d(4, n5Var24 != null || ((!n5Var24.u || n5Var24.K) && !n5Var24.v()));
                    boolean z20 = org.telegram.messenger.v2.a;
                    f4Var.d(3, false);
                    if (!this.N1 && !e8Var.o()) {
                        th.e5 O1 = vp.r1(i12).O1();
                        int A = A();
                        o10 = O1.o();
                        if (o10 != null || !o10.a(O1.a, A) || ((n5Var4 = this.K1) != null && (n5Var4.g || n5Var4.J0 != 0))) {
                            z13 = true;
                            f4Var.setShareEnabled(z13);
                            n5 n5Var25 = this.K1;
                            ei0Var.setImageResource((n5Var25 == null && n5Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                            d8Var.setVisibility(0);
                            z8Var.setVisibility(0);
                            u5Var.setVisibility(0);
                            u5Var.setTranslationX(0.0f);
                            n5Var3 = this.K1;
                            if (n5Var3 != null || n5Var3.J0 == 0) {
                                if (n5Var3 == null && n5Var3.g) {
                                    z60Var = null;
                                    u5Var.l(cd.L0(2131746369, null), false);
                                    k4Var = d8Var;
                                } else if (n5Var3 == null && n5Var3.u) {
                                    u5Var.l(cd.L0(2131746367, null), false);
                                } else if (n5Var3 == null && n5Var3.n) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    int i17 = i12;
                                    org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(32.0f, i17, u5Var);
                                    u5Var.setTranslationX(-org.telegram.messenger.i0.L(6.0f));
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(e5Var, 0, 1, 33);
                                    if (this.K1.q instanceof TLRPC.TL_peerUser) {
                                        TLRPC.User Z1 = vp.r1(i17).Z1(Long.valueOf(this.K1.q.user_id));
                                        e5Var.e(Z1);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append((CharSequence) h20.p(Z1));
                                        k4Var = d8Var;
                                    } else {
                                        k4Var = d8Var;
                                        TLRPC.Chat L03 = vp.r1(i17).L0(Long.valueOf(-org.telegram.messenger.o5.o(this.K1.q)));
                                        e5Var.b(L03);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append(L03 != null ? L03.title : charSequence2);
                                    }
                                    u5Var.l(spannableStringBuilder, false);
                                    z11 = true;
                                    z60Var = null;
                                } else {
                                    k4Var = d8Var;
                                    z60Var = null;
                                    u5Var.l(cd.L0(2131746368, null), false);
                                }
                                z11 = true;
                            } else {
                                u5Var.l(charSequence2, false);
                            }
                            k4Var = d8Var;
                            z11 = true;
                            z60Var = null;
                        }
                    }
                    z13 = false;
                    f4Var.setShareEnabled(z13);
                    n5 n5Var252 = this.K1;
                    ei0Var.setImageResource((n5Var252 == null && n5Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    d8Var.setVisibility(0);
                    z8Var.setVisibility(0);
                    u5Var.setVisibility(0);
                    u5Var.setTranslationX(0.0f);
                    n5Var3 = this.K1;
                    if (n5Var3 != null) {
                    }
                    if (n5Var3 == null) {
                    }
                    if (n5Var3 == null) {
                    }
                    if (n5Var3 == null) {
                    }
                    k4Var = d8Var;
                    z60Var = null;
                    u5Var.l(cd.L0(2131746368, null), false);
                    z11 = true;
                }
            }
            charSequence2 = charSequence;
            n5 n5Var242 = this.K1;
            f4Var.d(4, n5Var242 != null || ((!n5Var242.u || n5Var242.K) && !n5Var242.v()));
            boolean z202 = org.telegram.messenger.v2.a;
            f4Var.d(3, false);
            if (!this.N1) {
                th.e5 O12 = vp.r1(i12).O1();
                int A2 = A();
                o10 = O12.o();
                if (o10 != null) {
                }
                z13 = true;
                f4Var.setShareEnabled(z13);
                n5 n5Var2522 = this.K1;
                ei0Var.setImageResource((n5Var2522 == null && n5Var2522.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                d8Var.setVisibility(0);
                z8Var.setVisibility(0);
                u5Var.setVisibility(0);
                u5Var.setTranslationX(0.0f);
                n5Var3 = this.K1;
                if (n5Var3 != null) {
                }
                if (n5Var3 == null) {
                }
                if (n5Var3 == null) {
                }
                if (n5Var3 == null) {
                }
                k4Var = d8Var;
                z60Var = null;
                u5Var.l(cd.L0(2131746368, null), false);
                z11 = true;
            }
            z13 = false;
            f4Var.setShareEnabled(z13);
            n5 n5Var25222 = this.K1;
            ei0Var.setImageResource((n5Var25222 == null && n5Var25222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            d8Var.setVisibility(0);
            z8Var.setVisibility(0);
            u5Var.setVisibility(0);
            u5Var.setTranslationX(0.0f);
            n5Var3 = this.K1;
            if (n5Var3 != null) {
            }
            if (n5Var3 == null) {
            }
            if (n5Var3 == null) {
            }
            if (n5Var3 == null) {
            }
            k4Var = d8Var;
            z60Var = null;
            u5Var.l(cd.L0(2131746368, null), false);
            z11 = true;
        } else {
            k4Var = d8Var;
            z60Var = null;
            z11 = true;
        }
        if (i10 == z11) {
            z60 z60Var2 = e8Var.U0;
            if (z60Var2 != null) {
                z60Var2.u();
                e8Var.U0 = z60Var;
            }
            this.k1.e(z11);
            if (k7Var.M) {
                k7Var.c(false, z11);
            }
        }
        if (i11 == 2 && (n5Var2 = this.K1) != null) {
            if (n5Var2.e0 < 0) {
                n5Var2.e0 = 0L;
            }
            this.M1 = n5Var2.e0;
            long duration = k4Var.getDuration() < 100 ? this.K1.h0 : k4Var.getDuration();
            n5 n5Var26 = this.K1;
            if (n5Var26.h0 <= 0) {
                n5Var26.h0 = duration;
            }
            File file = n5Var26.Z0;
            if (file == null) {
                file = n5Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            n5 n5Var27 = this.K1;
            this.t1.o(false, absolutePath, n5Var27.h0, n5Var27.P);
            n5 n5Var28 = this.K1;
            float f7 = duration;
            long j10 = (long) (n5Var28.Z * f7);
            long j11 = (long) (n5Var28.a0 * f7);
            z8Var2.Z0 = j10;
            z8Var2.a1 = j11;
            u8 u8Var = z8Var2.h;
            if (u8Var != null) {
                u8.a(u8Var, true);
            }
            qh.d dVar2 = new qh.d(this, 22);
            z8Var2.setDelegate(new s9.g(dVar2));
            float max = (this.M1 / Math.max(1L, duration)) * 0.96f;
            z8Var2.setVideoLeft(max);
            z8Var2.setVideoRight(0.04f + max);
            dVar2.a(Boolean.TRUE, Float.valueOf(max));
        }
        ne0 ne0Var = this.C1;
        if (ne0Var != null) {
            ne0Var.setAllowTouch(false);
        }
        p2 p2Var2 = this.m1;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        wb.e();
        if (e8Var != null) {
            f fVar = e8Var.f;
            fVar.d();
            fVar.k(true);
            e8Var.d0 = true;
        }
        if (k4Var != null) {
            k4Var.x(8, i11 != 1);
        }
        s7 s7Var = this.v1;
        if (s7Var != null) {
            s7Var.setCoverPreview(i11 != 1);
        }
        p2 p2Var3 = this.n1;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
        c8Var.setPreview(i11 == 1 && c8Var.j());
    }

    public final void O() {
        ig.a1 a1Var;
        boolean z10 = false;
        if (this.f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Y(false);
            } else {
                this.x2 = new y6(this, 3);
            }
        }
        e8 e8Var = this.c1;
        if (e8Var != null) {
            e8Var.f.s();
        }
        r4 r4Var = this.O0;
        if (r4Var != null) {
            r4Var.h();
        }
        g4 g4Var = this.o1;
        if (g4Var != null) {
            th.e5 O1 = vp.r1(g4Var.a).O1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) O1.i.f(d20.i(O1.a).n);
            g4Var.b = O1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            g4Var.c.invalidate();
        }
        s7 s7Var = this.v1;
        if (s7Var != null && (a1Var = s7Var.x0.d) != null) {
            a1Var.postRunnable(a1Var.x);
        }
        d8 d8Var = this.X0;
        if (d8Var != null) {
            d8Var.x(0, false);
        }
        s0 s0Var = vp.r1(this.c).O1().w;
        if (s0Var.c || s0Var.d) {
            return;
        }
        s0Var.d = true;
        p0 p0Var = new p0(s0Var, 1);
        hs a02 = hs.a0(s0Var.a);
        a02.a.c(new bk0(a02, z10, p0Var, 17));
    }

    public final void P(int i10, int i11) {
        s7 s7Var;
        z7 z7Var;
        a8 a8Var;
        s7 s7Var2;
        if (i11 == 0) {
            this.n0.setVisibility(8);
        }
        if (i10 == 0 && (s7Var2 = this.v1) != null) {
            s7Var2.setVisibility(8);
        }
        if (i10 == -1) {
            this.c1.setVisibility(8);
            this.g1.setVisibility(i11 == 2 ? 0 : 8);
            this.j1.setVisibility(i11 == 2 ? 0 : 8);
            this.e1.setVisibility(i11 == 2 ? 0 : 8);
            ImageView imageView = this.i1;
            if (imageView != null) {
                imageView.setVisibility(i11 == 2 ? 0 : 8);
            }
            this.Z0.setVisibility(i11 == 2 ? 0 : 8);
            this.p0.setVisibility(8);
        }
        boolean z10 = true;
        this.X0.setAllowCropping(i11 == -1);
        if ((i11 == 0 || i10 == 0) && (s7Var = this.v1) != null) {
            s7Var.M0.setLayerType(0, null);
        }
        ne0 ne0Var = this.C1;
        if (ne0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            ne0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            z7 z7Var2 = this.r1;
            if (z7Var2 != null) {
                z7Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (z7Var = this.r1) != null) {
            z7Var.setVisibility(8);
            this.r1.setAppearProgress(0.0f);
            z7 z7Var3 = this.r1;
            z7Var3.y = null;
            z zVar = z7Var3.f;
            zVar.L = null;
            zVar.d = null;
            zVar.J = false;
            z7Var3.d.setVisibility(8);
            z7Var3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            a8 a8Var2 = this.s1;
            if (a8Var2 != null) {
                a8Var2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (a8Var = this.s1) == null) {
            return;
        }
        a8Var.setVisibility(8);
        this.s1.setAppearProgress(0.0f);
        a8 a8Var3 = this.s1;
        a8Var3.b = null;
        z zVar2 = a8Var3.h;
        zVar2.L = null;
        zVar2.d = null;
        zVar2.J = false;
        a8Var3.e.setVisibility(8);
        a8Var3.setVisibility(8);
    }

    public final void Q(i8 i8Var) {
        j4.w o10;
        n8 n8Var;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (vp.r1(i10).u2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.u0 = false;
        this.e = false;
        this.B2 = false;
        this.s0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (n8Var = this.n) != null && n8Var.getParent() == null) {
            n8 n8Var2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.i0.x3(windowManager, n8Var2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.v0 == 0 && (o10 = vp.r1(i10).O1().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (i8Var != null) {
            this.F = i8Var;
            this.J = i8Var.a;
            rectF.set(i8Var.c);
            this.G = i8Var.b;
            this.F.e();
        } else {
            this.J = 0;
            float L = org.telegram.messenger.i0.L(100.0f);
            Point point = org.telegram.messenger.i0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        this.r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.h0.setBackgroundColor(i11);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.i0.g2(this.b);
        f(1.0f, true, new y6(this, 6));
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void R(h8 h8Var, n5 n5Var, long j10) {
        n8 n8Var;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (vp.r1(i10).u2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (n8Var = this.n) != null && n8Var.getParent() == null) {
            n8 n8Var2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.i0.x3(windowManager, n8Var2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.K1 = n5Var;
        this.O1 = n5Var.K ? 1 : 0;
        this.s0.g = false;
        RectF rectF = this.H;
        if (h8Var != null) {
            this.F = h8Var;
            this.J = h8Var.a;
            rectF.set(h8Var.c);
            this.G = h8Var.b;
            this.F.e();
        } else {
            this.J = 0;
            float L = org.telegram.messenger.i0.L(100.0f);
            Point point = org.telegram.messenger.i0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        this.r.c();
        int i11 = this.J;
        this.h0.setBackgroundColor((i11 == 1 || i11 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.i0.g2(this.b);
        n5 n5Var2 = this.K1;
        if (n5Var2 != null) {
            this.c1.setText(n5Var2.C0);
        }
        K(new j7(this, 0), j10);
        J(this.K1.b0 ? 2 : 1, false);
        k0(-1, false, false);
        this.b1.b(false, false);
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void S() {
        z60 z60Var;
        d8 d8Var = this.X0;
        if (d8Var != null) {
            d8Var.x(4, true);
        }
        e8 e8Var = this.c1;
        if (e8Var != null && (z60Var = e8Var.U0) != null) {
            z60Var.u();
            e8Var.U0 = null;
        }
        kg.i1 i1Var = new kg.i1((org.telegram.ui.ActionBar.k2) new u7(this, 1), 14, false);
        i1Var.setOnDismissListener(new i7(this, 1));
        i1Var.show();
    }

    public final void T(h8 h8Var, n5 n5Var) {
        j4.w o10;
        n8 n8Var;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (vp.r1(i10).u2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (n8Var = this.n) != null && n8Var.getParent() == null) {
            n8 n8Var2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.i0.x3(windowManager, n8Var2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.K1 = n5Var;
        x6.a(i10, n5Var);
        n5 n5Var2 = this.K1;
        int i11 = (n5Var2 == null || !n5Var2.K) ? 0 : 1;
        this.O1 = i11;
        this.s0.g = n5Var2 != null && n5Var2.u && i11 == 1;
        if (this.v0 == 0 && (o10 = vp.r1(i10).O1().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.H;
        if (h8Var != null) {
            this.F = h8Var;
            this.J = h8Var.a;
            rectF.set(h8Var.c);
            this.G = h8Var.b;
            this.F.e();
        } else {
            this.J = 0;
            float L = org.telegram.messenger.i0.L(100.0f);
            Point point = org.telegram.messenger.i0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        this.r.c();
        int i12 = this.J;
        this.h0.setBackgroundColor((i12 == 1 || i12 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.i0.g2(this.b);
        n5 n5Var3 = this.K1;
        if (n5Var3 != null) {
            this.c1.setText(n5Var3.C0);
        }
        this.b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new y6(this, 6));
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void U() {
        ig.c1 c1Var = this.w1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        c9 c9Var = this.p1;
        if (c9Var != null) {
            c9Var.bringToFront();
        }
        ne0 ne0Var = this.C1;
        if (ne0Var != null) {
            ne0Var.bringToFront();
        }
        fe0 fe0Var = this.E1;
        if (fe0Var != null) {
            fe0Var.bringToFront();
        }
        he0 he0Var = this.F1;
        if (he0Var != null) {
            he0Var.bringToFront();
        }
        g4 g4Var = this.o1;
        if (g4Var != null) {
            g4Var.bringToFront();
        }
        n nVar = this.q1;
        if (nVar != null) {
            nVar.bringToFront();
        }
    }

    public final void V(n5 n5Var, boolean z10) {
        n5 n5Var2;
        boolean z11;
        if (n5Var == null || this.X0.getWidth() <= 0 || this.X0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? n5Var.O0 : n5Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.A0.j() ? this.A0 : this.X0;
        float f7 = z10 ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f7);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f7), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f7, f7);
        org.telegram.messenger.i0.m0 = true;
        view.draw(canvas);
        org.telegram.messenger.i0.m0 = false;
        canvas.restore();
        Paint paint = new Paint(2);
        k61 textureView = this.X0.getTextureView();
        if (n5Var.K && !n5Var.u && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f7, f7);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = n5Var.Q0;
        if (file2 != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / decodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile.recycle();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        File file3 = n5Var.P0;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        s7 s7Var = this.v1;
        if (s7Var != null && s7Var.A0 != null) {
            canvas.save();
            canvas.scale(f7, f7);
            s7 s7Var2 = this.v1;
            s7Var2.r0 = true;
            x3 x3Var = s7Var2.A0;
            x3Var.a = true;
            x3Var.draw(canvas);
            s7 s7Var3 = this.v1;
            s7Var3.A0.a = false;
            s7Var3.r0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w9 = n5.w(this.c, "jpg");
        if (z10) {
            n5Var2 = n5Var;
            z11 = z10;
            Utilities.g.c(new ag.n0(this, createBitmap, z11, w9, n5Var2, 16));
        } else {
            n5Var2 = n5Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w9));
            } catch (Exception e10) {
                org.telegram.messenger.f8.g(e10, true);
            }
        }
        if (!z11) {
            n5Var2.N0 = w9;
        }
        n5Var2.b1 = createScaledBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    public final void W() {
        j4.w o10;
        ?? r16;
        w6 w6Var = this.q0;
        BitmapDrawable bitmapDrawable = null;
        if (w6Var != null) {
            w6Var.dismiss();
            this.q0 = null;
        }
        boolean z10 = this.N1;
        org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
        if (z10) {
            n0 n0Var = this.e1;
            n0Var.getClass();
            n0Var.c(cd.M0("VideoConvertFail"));
            t2Var.a();
            e4 e4Var = this.b1.c;
            int i10 = -this.U1;
            this.U1 = i10;
            org.telegram.messenger.i0.F3(i10, e4Var, null);
            return;
        }
        e8 e8Var = this.c1;
        if (e8Var != null && e8Var.o()) {
            t2Var.a();
            org.telegram.ui.Components.f6 f6Var = e8Var.w;
            int i11 = -this.U1;
            this.U1 = i11;
            org.telegram.messenger.i0.F3(i11, f6Var, null);
            e8Var.e();
            return;
        }
        n5 n5Var = this.K1;
        int i12 = this.c;
        int i13 = 0;
        if ((n5Var == null || (!n5Var.g && n5Var.J0 == 0)) && (o10 = vp.r1(i12).h0.o()) != null && o10.a(i12, A())) {
            g0(o10, false);
            return;
        }
        this.K1.D0 = vp.r1(i12).U4();
        th.b bVar = this.a;
        boolean z11 = true;
        if (e8Var != null && !this.K1.D0) {
            CharSequence text = e8Var.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((zz0[]) spannable.getSpans(0, text.length(), zz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new cc(this.n, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.i0.R2(cd.L0(2131744600, null), org.telegram.ui.ActionBar.t6.Uc, 0, new y6(this, 27), bVar)).k(true);
                    int i14 = -this.U1;
                    this.U1 = i14;
                    org.telegram.messenger.i0.F3(i14, e8Var, null);
                    return;
                }
            }
        }
        n5 n5Var2 = this.K1;
        if (n5Var2.g || n5Var2.J0 != 0) {
            n5Var2.l = false;
            h(null);
            o0();
            return;
        }
        if (this.N != 0) {
            n5Var2.v0 = vp.r1(i12).i1(this.N);
        }
        d8 d8Var = this.X0;
        d8Var.x(3, true);
        w6 w6Var2 = new w6(this.K1.I0, this.b, bVar);
        w6Var2.W0(this.K1.E0);
        w6Var2.V0(this.K1.v0);
        w6Var2.w1 = this.M;
        w6Var2.L1 = new z6(this, 14);
        w6Var2.L0(!this.A0.j());
        ArrayList arrayList = this.I1;
        w6Var2.S0(arrayList == null ? this.K1.r() : arrayList.size());
        w6Var2.Q0(false);
        CharSequence text2 = e8Var.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (h51 h51Var : (h51[]) ((Spanned) text2).getSpans(0, text2.length(), h51.class)) {
                if (h51Var != null) {
                    try {
                        TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(Long.parseLong(h51Var.getURL())));
                        if (Z1 != null && !h20.B(Z1) && h20.n(Z1) != null && !arrayList2.contains(Z1)) {
                            arrayList2.add(h20.n(Z1));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i15 = 0;
            int i16 = -1;
            while (i15 < text2.length()) {
                char charAt = text2.charAt(i15);
                boolean z12 = z11;
                if (charAt == '@') {
                    i16 = i15 + 1;
                } else if (charAt == ' ') {
                    if (i16 != -1) {
                        String charSequence = text2.subSequence(i16, i15).toString();
                        TLObject e22 = vp.r1(i12).e2(charSequence);
                        if (e22 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) e22;
                            if (!user.bot && !h20.B(user) && user.id != 777000 && !h20.z(user) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i16 = -1;
                }
                i15++;
                z11 = z12;
            }
            boolean z13 = z11;
            r16 = z13;
            if (i16 != -1) {
                String charSequence2 = text2.subSequence(i16, text2.length()).toString();
                TLObject e23 = vp.r1(i12).e2(charSequence2);
                r16 = z13;
                if (e23 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) e23;
                    r16 = z13;
                    if (!user2.bot) {
                        r16 = z13;
                        if (!h20.B(user2)) {
                            r16 = z13;
                            if (user2.id != 777000) {
                                r16 = z13;
                                if (!h20.z(user2)) {
                                    r16 = z13;
                                    if (!arrayList2.contains(charSequence2)) {
                                        arrayList2.add(charSequence2);
                                        r16 = z13;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            r16 = 1;
        }
        w6Var2.J1 = arrayList2;
        w6Var2.N1 = new z6(this, 15);
        w6Var2.O1 = new z6(this, 16);
        w6Var2.K1 = new f7(this, 9);
        this.q0 = w6Var2;
        n5 n5Var3 = this.K1;
        if (n5Var3.K) {
            if (d8Var != null && !n5Var3.f0 && this.f0 != 2) {
                n5Var3.e0 = d8Var.getCurrentPosition();
                z6 z6Var = new z6(this, 17);
                ig.c1 c1Var = this.w1;
                View view = this.z1;
                View[] viewArr = new View[3];
                viewArr[0] = d8Var;
                viewArr[r16] = c1Var;
                viewArr[2] = view;
                d8Var.h(z6Var, viewArr);
            }
            w6 w6Var3 = this.q0;
            Bitmap bitmap = this.K1.g0;
            y6 y6Var = new y6(this, 20);
            if (bitmap != null) {
                w6Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            w6Var3.S1 = bitmapDrawable;
            w6Var3.T1 = y6Var;
            hk hkVar = w6Var3.i1;
            if (hkVar != null) {
                for (View view2 : hkVar.getViewPages()) {
                    if (view2 instanceof r6) {
                        r6 r6Var = (r6) view2;
                        r6Var.h(false);
                        r6Var.f(false);
                    }
                }
            }
        }
        this.q0.setOnDismissListener(new i7(this, i13));
        this.q0.show();
    }

    public final void X(j8 j8Var) {
        int i10 = 0;
        RectF rectF = this.H;
        if (j8Var != null) {
            this.F = j8Var;
            this.J = j8Var.a;
            rectF.set(j8Var.c);
            this.G = j8Var.b;
        } else {
            this.F = null;
            this.J = 0;
            float L = org.telegram.messenger.i0.L(100.0f);
            Point point = org.telegram.messenger.i0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        int i11 = this.J;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.h0.setBackgroundColor(i10);
    }

    public final void Y(boolean z10) {
        if (!this.w2 || z10) {
            this.s2 = false;
            Activity activity = this.b;
            if (activity != null) {
                boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    eq eqVar = new eq(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.i0.L(64.0f);
                    int L2 = org.telegram.messenger.i0.L(64.0f);
                    eqVar.e = L;
                    eqVar.f = L2;
                    this.A0.setCameraThumb(eqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.a);
                        int i10 = org.telegram.ui.ActionBar.t6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.L0(2131747324, null));
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.T = W2;
                        alertDialog$Builder.k(cd.L0(2131747316, null), new f7(this, 12));
                        alertDialog$Builder.h(cd.L0(2131751772, null), null);
                        x1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, zs.w1);
                    this.w2 = true;
                }
            }
            if (this.s2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                q();
            } else {
                CameraController.getInstance().initCamera(new y6(this, 0));
            }
        }
    }

    public final void a0(Runnable runnable) {
        t7 t7Var = this.B0;
        if (t7Var == null || t7Var.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new rh.l5(this, this.B0.getTextureView().getBitmap(), runnable, 19));
        } catch (Throwable unused) {
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new r7(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 15)).setDuration(320L).setInterpolator(gr.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z10 ? 0 : 8);
            view.setAlpha(z10 ? 1.0f : 0.0f);
            m0();
        }
    }

    public final void c0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f.updateViewLayout(this.n, layoutParams);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void d() {
        zs.e().b(this, zs.r2);
        int i10 = this.c;
        zs.f(i10).b(this, zs.y5);
        zs.f(i10).b(this, zs.b3);
    }

    public final void d0(String str) {
        int i10;
        a9 a9Var = this.E0;
        a9Var.clearAnimation();
        t7 t7Var = this.B0;
        if ((t7Var != null && t7Var.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(a9Var, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                a9Var.setContentDescription(cd.L0(2131754915, null));
                i10 = R.drawable.media_photo_flash_auto2;
            }
            a9Var.setContentDescription(cd.L0(2131754914, null));
            i10 = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                a9Var.setContentDescription(cd.L0(2131754913, null));
                i10 = R.drawable.media_photo_flash_on2;
            }
            a9Var.setContentDescription(cd.L0(2131754914, null));
            i10 = R.drawable.media_photo_flash_off2;
        }
        if (a9Var.n != i10) {
            a9Var.n = i10;
            ValueAnimator valueAnimator = a9Var.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                a9Var.r = null;
            }
            a9Var.setDrawable(i10);
        }
        if (this.f0 == 0 && !this.I0.e && this.Y1 != null && !H()) {
            z10 = true;
        }
        b0(a9Var, z10, true);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j4.w o10;
        n5 n5Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == zs.r2) {
            r4 r4Var = this.O0;
            if (r4Var != null) {
                r4Var.h();
            }
            if (this.m2 == null || MediaController.a2 == null) {
                return;
            }
            for (int i12 = 0; i12 < MediaController.a2.size(); i12++) {
                we weVar = (we) MediaController.a2.get(i12);
                int i13 = weVar.a;
                we weVar2 = this.m2;
                if (i13 == weVar2.a && weVar.b == weVar2.b) {
                    this.m2 = weVar;
                    return;
                }
            }
            return;
        }
        if (i10 == zs.y5) {
            r4 r4Var2 = this.O0;
            if (r4Var2 == null || this.V1) {
                return;
            }
            r4Var2.h();
            return;
        }
        if (i10 == zs.b3) {
            int i14 = this.f0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o10 = vp.r1(i15).O1().o()) != null && o10.a(i15, 1)) {
                    n5 n5Var2 = this.K1;
                    if (n5Var2 == null || n5Var2.J0 == 0) {
                        g0(o10, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.N1 && !this.c1.o()) {
                th.e5 O1 = vp.r1(i15).O1();
                int A = A();
                j4.w o11 = O1.o();
                if (o11 == null || !o11.a(O1.a, A) || ((n5Var = this.K1) != null && (n5Var.g || n5Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.b1.setShareEnabled(z10);
        }
    }

    public final void e(boolean z10) {
        o0 o0Var;
        this.K0 = z10;
        Boolean bool = this.p2;
        if (bool == null || bool.booleanValue() != z10) {
            int i10 = 0;
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.q2 = new g7(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n2 = null;
            }
            o1.j jVar = this.o2;
            if (jVar != null) {
                jVar.d();
                this.o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            m2 m2Var = this.M0;
            if (m2Var != null) {
                m2Var.K = false;
            }
            if (z10 && (o0Var = this.N0) != null) {
                o0Var.a(false);
            }
            g8 g8Var = this.r;
            if (g8Var != null) {
                g8Var.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.M0.setImportantForAccessibility(z10 ? 0 : 4);
            this.p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            n8 n8Var = this.n;
            float height = z10 ? 0.0f : (n8Var.getHeight() - this.M0.g()) + (org.telegram.messenger.i0.n * 2.5f);
            int i11 = 1;
            Math.max(1, n8Var.getHeight());
            m2 m2Var2 = this.M0;
            m2Var2.K = !z10;
            this.k2 = this.j2 == null;
            if (z10) {
                o1.j jVar2 = new o1.j(m2Var2, o1.j.p, height);
                this.o2 = jVar2;
                jVar2.m.a(0.75f);
                this.o2.m.b(350.0f);
                this.o2.a(new gf0(this, height, i11));
                this.o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.n2 = ofFloat;
                ofFloat.addUpdateListener(new h7(this, i10));
                this.n2.addListener(new q7(this, i11));
                this.n2.setDuration(450L);
                this.n2.setInterpolator(gr.h);
                this.n2.start();
            }
            if (!z10 && !this.S1) {
                this.l2 = null;
            }
            if (z10 || this.f0 != 0 || this.s2) {
                return;
            }
            q();
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f1 == null) {
            bi0 bi0Var = new bi0(R.raw.media_mute_unmute, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.f1 = bi0Var;
            bi0Var.F *= 1.5f;
        }
        this.g1.setAnimation(this.f1);
        if (!z11) {
            this.f1.N(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            bi0 bi0Var2 = this.f1;
            if (bi0Var2.a0 > 20) {
                bi0Var2.N(0, false, false);
            }
            this.f1.P(20);
            this.f1.start();
            return;
        }
        bi0 bi0Var3 = this.f1;
        int i10 = bi0Var3.a0;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        bi0Var3.P(43);
        this.f1.start();
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        g8 g8Var = this.r;
        if (!z10) {
            this.L = null;
            this.I = f7;
            j();
            g8Var.invalidate();
            this.n.invalidate();
            runnable.run();
            n();
            return;
        }
        this.P.d();
        zs.e().k(zs.j1, 512);
        this.L = Float.valueOf(this.K);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.E = ofFloat;
        int i10 = 5;
        ofFloat.addUpdateListener(new h7(this, i10));
        this.E.addListener(new l40(this, f7, runnable, i10));
        if (f7 < 1.0f && this.w) {
            this.E.setDuration(250L);
            this.E.setInterpolator(gr.h);
        } else if (f7 > 0.0f || g8Var.a < org.telegram.messenger.i0.L(20.0f)) {
            this.E.setDuration(300L);
            this.E.setInterpolator(new u1.a());
        } else if (f7 >= 0.0f || !this.O) {
            this.E.setDuration(400L);
            this.E.setInterpolator(gr.h);
        } else {
            this.E.setDuration(200L);
            this.E.setInterpolator(gr.h);
            this.O = false;
        }
        this.E.start();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 4));
        }
    }

    public final void g(boolean z10, boolean z11) {
        t tVar;
        if (z10) {
            p2 p2Var = this.l1;
            if (p2Var != null) {
                p2Var.e(true);
            }
            p2 p2Var2 = this.m1;
            if (p2Var2 != null) {
                p2Var2.e(true);
            }
            p2 p2Var3 = this.k1;
            if (p2Var3 != null) {
                p2Var3.e(true);
            }
            p2 p2Var4 = this.W0;
            if (p2Var4 != null) {
                p2Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.b2 = H();
        if (z10 && (tVar = this.I0) != null && tVar.e) {
            tVar.a(false, z11);
        }
        l0(z11);
        l7 l7Var = this.Q0;
        o2 o2Var = this.U0;
        o2 o2Var2 = this.T0;
        if (!z11) {
            o2Var2.setAlpha((z10 && this.f0 == 0 && !H()) ? 1.0f : 0.0f);
            o2Var2.setTranslationY((z10 && this.f0 == 0 && !H()) ? 0.0f : org.telegram.messenger.i0.L(16.0f));
            o2Var.setAlpha((!z10 && this.f0 == 0 && H()) ? 0.6f : 0.0f);
            o2Var.setTranslationY((!z10 && this.f0 == 0 && H()) ? 0.0f : org.telegram.messenger.i0.L(16.0f));
            l7Var.setAlpha((z10 || this.f0 != 0 || H()) ? 0.0f : 1.0f);
            l7Var.setTranslationY((z10 || this.f0 != 0 || H()) ? org.telegram.messenger.i0.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Z1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o2Var2, (Property<o2, Float>) property, (z10 && this.f0 == 0 && !H()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(o2Var2, (Property<o2, Float>) property2, (z10 && this.f0 == 0 && !H()) ? 0.0f : org.telegram.messenger.i0.L(16.0f)), ObjectAnimator.ofFloat(o2Var, (Property<o2, Float>) property, (!z10 && this.f0 == 0 && H()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(o2Var, (Property<o2, Float>) property2, (!z10 && this.f0 == 0 && H()) ? 0.0f : org.telegram.messenger.i0.L(16.0f)), ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property, (z10 || this.f0 != 0 || H()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property2, (z10 || this.f0 != 0 || H()) ? org.telegram.messenger.i0.L(16.0f) : 0.0f));
        this.Z1.setDuration(260L);
        this.Z1.setInterpolator(gr.h);
        this.Z1.start();
    }

    public final void g0(j4.w wVar, boolean z10) {
        if (this.z2) {
            return;
        }
        v7 v7Var = new v7(wVar.b(), this.c, this.b, new u7(this, 0), null);
        v7Var.P1 = A();
        v7Var.setOnDismissListener(new o70(2, this, z10));
        this.X0.x(7, true);
        this.z2 = true;
        v7Var.show();
    }

    public final void h(Runnable runnable) {
        n5 n5Var;
        Runnable runnable2;
        d8 d8Var;
        oe0 oe0Var = this.B1;
        if (oe0Var == null || (n5Var = this.K1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        n5Var.j = oe0Var.a() | n5Var.j;
        n5 n5Var2 = this.K1;
        oe0 oe0Var2 = this.B1;
        File file = n5Var2.Z0;
        if (file != null) {
            file.delete();
            n5Var2.Z0 = null;
        }
        ff savedFilterState = oe0Var2.getSavedFilterState();
        n5Var2.a1 = savedFilterState;
        if (n5Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = oe0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = n5Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, n5Var2.k0 / 2.0f, n5Var2.l0 / 2.0f);
                    matrix.postRotate(-n5Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    n5Var2.n0.preScale(n5Var2.k0 / createBitmap.getWidth(), n5Var2.l0 / createBitmap.getHeight());
                    n5Var2.k0 = createBitmap.getWidth();
                    n5Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = n5Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        n5Var2.Z0.delete();
                    }
                    String k10 = n5.k(n5Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    n5Var2.Z0 = n5.w(n5Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(n5Var2.Z0));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new org.telegram.ui.kp(n5Var2, createBitmap, z10, runnable2, 16));
                    }
                } else if (runnable != null) {
                    runnable.run();
                }
            } else if (runnable != null) {
                runnable.run();
            }
            runnable2 = runnable;
        }
        if (runnable2 == null) {
            n5 n5Var3 = this.K1;
            if (n5Var3.K || (d8Var = this.X0) == null) {
                return;
            }
            d8Var.set(n5Var3);
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.d2 == z10) {
            return;
        }
        this.d2 = z10;
        if (z11) {
            this.J0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(gr.h).withEndAction(new g7(this, z10, 1)).start();
            return;
        }
        this.J0.clearAnimation();
        this.J0.setAlpha(z10 ? 1.0f : 0.0f);
        if (z10) {
            return;
        }
        this.J0.b(false, false);
    }

    public final void i() {
        if (this.K1 == null || this.D1 == null || this.h0.getMeasuredWidth() <= 0 || this.h0.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.K1.Q != 0) {
            matrix.postRotate(-r1, this.h0.getMeasuredWidth() / 2.0f, this.h0.getMeasuredHeight() / 2.0f);
            if ((this.K1.Q / 90) % 2 == 1) {
                matrix.postScale(this.h0.getMeasuredWidth() / this.h0.getMeasuredHeight(), this.h0.getMeasuredHeight() / this.h0.getMeasuredWidth(), this.h0.getMeasuredWidth() / 2.0f, this.h0.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / this.h0.getMeasuredWidth()) * this.K1.k0, (1.0f / this.h0.getMeasuredHeight()) * this.K1.l0);
        matrix.postConcat(this.K1.n0);
        matrix.postScale(this.h0.getMeasuredWidth() / this.K1.i0, this.h0.getMeasuredHeight() / this.K1.j0);
        this.D1.setTransform(matrix);
        this.D1.invalidate();
    }

    public final void i0(boolean z10) {
        s81 s81Var = this.V0;
        if ((s81Var.getTag() != null && z10) || (s81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.e2;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                }
                y6 y6Var = new y6(this, 25);
                this.e2 = y6Var;
                org.telegram.messenger.i0.h3(y6Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        s81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            s81Var.setVisibility(0);
        }
        this.f2.playTogether(ObjectAnimator.ofFloat(s81Var, (Property<s81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f2.addListener(new sg.y(14, this, z10));
        this.f2.start();
        if (z10) {
            y6 y6Var2 = new y6(this, 26);
            this.e2 = y6Var2;
            org.telegram.messenger.i0.h3(y6Var2, 2000L);
        }
    }

    public final void j() {
        th.g2 g2Var;
        if (this.J != 1) {
            return;
        }
        float left = this.h0.getLeft();
        float top = this.h0.getTop();
        float measuredWidth = this.h0.getMeasuredWidth();
        float measuredHeight = this.h0.getMeasuredHeight();
        RectF rectF = this.d0;
        rectF.set(left, top, measuredWidth, measuredHeight);
        rectF.offset(this.r.getX(), this.r.getY());
        float f7 = this.I;
        RectF rectF2 = this.H;
        RectF rectF3 = this.c0;
        org.telegram.messenger.i0.Z1(rectF2, rectF, f7, rectF3);
        this.h0.setAlpha(this.I);
        float f10 = rectF3.left;
        this.h0.setTranslationX((f10 - r3.getLeft()) - this.r.getX());
        float f11 = rectF3.top;
        this.h0.setTranslationY((f11 - r3.getTop()) - this.r.getY());
        j8 j8Var = this.F;
        if (j8Var != null && (g2Var = j8Var.f) != null) {
            g2Var.setTranslationX((rectF.left - rectF2.left) * this.I);
            this.F.f.setTranslationY((rectF.top - rectF2.top) * this.I);
        }
        this.h0.setScaleX(rectF3.width() / this.h0.getMeasuredWidth());
        this.h0.setScaleY(rectF3.height() / this.h0.getMeasuredHeight());
        this.i0.setAlpha(this.I);
        this.k0.setAlpha(this.I);
        this.l0.setAlpha(this.I);
        if (this.f0 == 2) {
            this.u1.setAlpha(this.I);
        }
    }

    public final void j0() {
        w6 w6Var = this.q0;
        if (w6Var != null) {
            w6Var.dismiss();
            this.q0 = null;
        }
        w6 w6Var2 = new w6(86400, this.b, this.a);
        w6Var2.U0();
        w6Var2.W0(this.y0);
        TLRPC.InputPeer inputPeer = this.x0;
        if (inputPeer == null) {
            inputPeer = this.N != 0 ? vp.r1(this.c).i1(this.N) : new TLRPC.TL_inputPeerSelf();
        }
        w6Var2.V0(inputPeer);
        w6Var2.w1 = this.M;
        w6Var2.L1 = new z6(this, 18);
        w6Var2.L0(false);
        w6Var2.S0(1);
        w6Var2.Q0(false);
        w6Var2.N1 = new z6(this, 19);
        w6Var2.K1 = new f7(this, 11);
        this.q0 = w6Var2;
        w6Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r2.isRecycled() != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        n5 n5Var;
        ImageReceiver photoImage;
        float f7;
        if (this.v1 == null || (n5Var = this.K1) == null) {
            return;
        }
        n5Var.f();
        this.K1.j |= this.v1.r0();
        n5 n5Var2 = this.K1;
        ArrayList arrayList = n5Var2.T0;
        if (arrayList == null) {
            n5Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        s7 s7Var = this.v1;
        n5 n5Var3 = this.K1;
        s7Var.q0(n5Var3.T0, false, false, false, false, n5Var3);
        n5 n5Var4 = this.K1;
        if (!n5Var4.K) {
            n5Var4.S0 = Utilities.k(this.v1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.v1.getMasks();
        this.K1.U0 = masks != null ? new ArrayList(masks) : null;
        n5 n5Var5 = this.K1;
        boolean z10 = n5Var5.K;
        boolean E = n5Var5.E();
        this.K1.T0 = new ArrayList();
        s7 s7Var2 = this.v1;
        n5 n5Var6 = this.K1;
        Bitmap q02 = s7Var2.q0(n5Var6.T0, true, false, false, !z10, n5Var6);
        if (this.K1.T0.isEmpty()) {
            this.K1.T0 = null;
        }
        try {
            File file = this.K1.P0;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.K1.R0;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.K1.Q0;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        n5 n5Var7 = this.K1;
        n5Var7.P0 = null;
        n5Var7.R0 = null;
        n5Var7.Q0 = null;
        int i10 = this.c;
        org.telegram.messenger.b8.G(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        n5 n5Var8 = this.K1;
        n5Var7.P0 = org.telegram.messenger.b8.K(hc.a0(q02, compressFormat, n5Var8.i0, n5Var8.j0, 87), null, true, true);
        if (q02 != null && !q02.isRecycled()) {
            q02.recycle();
        }
        n5 n5Var9 = this.K1;
        if (n5Var9.u) {
            File file4 = n5Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                this.K1.Y0 = null;
            }
            n5 n5Var10 = this.K1;
            long j10 = n5Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = n5Var10.x0;
                if (drawable == null) {
                    drawable = k4.e(null, i10, j10, this.c2);
                }
                if (drawable != null) {
                    this.K1.Y0 = n5.w(i10, "webp");
                    n5 n5Var11 = this.K1;
                    Bitmap createBitmap = Bitmap.createBitmap(n5Var11.i0, n5Var11.j0, Bitmap.Config.ARGB_8888);
                    n5.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.Y0));
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                    } finally {
                        if (!createBitmap.isRecycled()) {
                            createBitmap.recycle();
                        }
                    }
                }
            }
        }
        n5 n5Var12 = this.K1;
        if (n5Var12.u) {
            File file5 = n5Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
                this.K1.X0 = null;
            }
            n5 n5Var13 = this.K1;
            if (n5Var13.u && n5Var13.K) {
                int i11 = n5Var13.k0;
                int i12 = n5Var13.l0;
                jg.j1 p02 = this.v1.p0();
                if (p02 != null) {
                    jg.c1 c1Var = p02.r0;
                    if (c1Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        int i13 = 0;
                        if ((c1Var.getChildAt(0) instanceof org.telegram.ui.Cells.q1) && (photoImage = ((org.telegram.ui.Cells.q1) c1Var.getChildAt(0)).getPhotoImage()) != null) {
                            float f10 = photoImage.M0;
                            if (((int) f10) > 0) {
                                float f11 = photoImage.N0;
                                if (((int) f11) > 0) {
                                    float f12 = i11;
                                    float f13 = i12;
                                    float max = Math.max(f10 / f12, f11 / f13);
                                    float f14 = 2.0f;
                                    int i14 = (int) ((f12 * max) / 2.0f);
                                    int i15 = (int) ((f13 * max) / 2.0f);
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                                    float[] fArr = new float[8];
                                    while (true) {
                                        int[] iArr = photoImage.W0;
                                        f7 = f14;
                                        if (i13 >= iArr.length) {
                                            break;
                                        }
                                        int i16 = i13 * 2;
                                        float f15 = iArr[i13];
                                        fArr[i16] = f15;
                                        fArr[i16 + 1] = f15;
                                        i13++;
                                        f14 = f7;
                                    }
                                    Canvas canvas = new Canvas(createBitmap2);
                                    Path path = new Path();
                                    canvas.scale(0.5f, 0.5f);
                                    RectF rectF = org.telegram.messenger.i0.P;
                                    float f16 = (i14 * f7) / f7;
                                    float f17 = photoImage.M0 / f7;
                                    float f18 = (i15 * f7) / f7;
                                    float f19 = photoImage.N0 / f7;
                                    rectF.set(f16 - f17, f18 - f19, f17 + f16, f19 + f18);
                                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                    Paint paint = new Paint(1);
                                    paint.setColor(-1);
                                    canvas.drawPath(path, paint);
                                    try {
                                        this.K1.X0 = n5.w(i10, "webp");
                                        createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.X0));
                                    } catch (Exception e11) {
                                        org.telegram.messenger.f8.g(e11, true);
                                        this.K1.X0 = null;
                                    }
                                    createBitmap2.recycle();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!E) {
            s7 s7Var3 = this.v1;
            ArrayList arrayList2 = new ArrayList();
            n5 n5Var14 = this.K1;
            int i17 = n5Var14.i0;
            Bitmap q03 = s7Var3.q0(arrayList2, false, true, false, false, n5Var14);
            n5 n5Var15 = this.K1;
            org.telegram.messenger.b8.G(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            n5 n5Var16 = this.K1;
            n5Var15.R0 = org.telegram.messenger.b8.K(hc.a0(q03, compressFormat2, n5Var16.i0, n5Var16.j0, 87), null, true, true);
            if (q03 != null && !q03.isRecycled()) {
                q03.recycle();
            }
        }
        if (this.v1.x0.getPainting().E) {
            Bitmap blurBitmap = this.v1.getBlurBitmap();
            n5 n5Var17 = this.K1;
            org.telegram.messenger.b8.G(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            n5 n5Var18 = this.K1;
            n5Var17.Q0 = org.telegram.messenger.b8.K(hc.a0(blurBitmap, compressFormat3, n5Var18.i0, n5Var18.j0, 87), null, true, true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x068d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07c3 A[LOOP:0: B:238:0x07c3->B:240:0x07c9, LOOP_START, PHI: r15
      0x07c3: PHI (r15v17 int) = (r15v16 int), (r15v18 int) binds: [B:232:0x078f, B:240:0x07c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(int i10, boolean z10, boolean z11) {
        float f7;
        boolean z12;
        z7 z7Var;
        float f10;
        int i11;
        a8 a8Var;
        int i12;
        float f11;
        n5 n5Var;
        ImageView imageView;
        int i13;
        int i14;
        float f12;
        float f13;
        he0 he0Var;
        fe0 fe0Var;
        ImageView imageView2;
        int i15;
        n5 n5Var2;
        s7 s7Var;
        s7 s7Var2;
        int i16 = this.g0;
        if (i16 == i10 && !z10) {
            return;
        }
        e8 e8Var = this.c1;
        if (i10 != -1 && e8Var != null && e8Var.N1) {
            return;
        }
        this.g0 = i10;
        AnimatorSet animatorSet = this.r2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r2 = null;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.p0;
        z8 z8Var = this.Z0;
        n0 n0Var = this.e1;
        x1 x1Var = this.n0;
        kg.f0 f0Var = this.j1;
        ei0 ei0Var = this.g1;
        if (i16 != i10) {
            if (i10 == -1) {
                x1Var.setVisibility(0);
                e8Var.setVisibility(0);
                s7 s7Var3 = this.v1;
                if (s7Var3 != null) {
                    s7Var3.A0(null, true);
                }
                n0Var.setVisibility(0);
                n5 n5Var3 = this.K1;
                if (n5Var3 == null || !n5Var3.u) {
                    ImageView imageView3 = this.i1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    F().setVisibility(0);
                    n0(false);
                }
                u5Var.setVisibility(0);
                if (this.O1 == 1) {
                    ei0Var.setVisibility(0);
                    f0Var.setVisibility(0);
                } else {
                    n5 n5Var4 = this.K1;
                    if (n5Var4 != null && !TextUtils.isEmpty(n5Var4.y)) {
                        ei0Var.setVisibility(8);
                        f0Var.setVisibility(0);
                    }
                }
                z8Var.setVisibility(0);
            }
            if (i10 == 0 && (s7Var2 = this.v1) != null) {
                s7Var2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (s7Var = this.v1) != null) {
                s7Var.M0.setLayerType(2, null);
            }
            s7 s7Var4 = this.v1;
            if (s7Var4 != null) {
                s7Var4.x1.b(i10 != 0);
            }
            e8Var.L.b(i10 != -1);
            wb.e();
            if (this.B1 != null && i16 == 1) {
                h(null);
            }
            ne0 ne0Var = this.C1;
            if (ne0Var != null) {
                ne0Var.setAllowTouch(false);
            }
            this.k1.e(true);
            n8 n8Var = this.n;
            d8 d8Var = this.X0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.r1 == null) {
                    z7 z7Var2 = new z7(this, activity, d8Var);
                    this.r1 = z7Var2;
                    n8Var.addView(z7Var2.d);
                    n8Var.addView(this.r1);
                }
                this.r1.setVisibility(0);
                n5 n5Var5 = this.K1;
                if (n5Var5 != null) {
                    this.r1.setEntry(n5Var5);
                }
            } else if (i16 == 3) {
                d8Var.b();
                z7 z7Var3 = this.r1;
                if (z7Var3 != null) {
                    z7Var3.a.setCropEditorDrawing(z7Var3);
                    z7Var3.D = true;
                }
            }
            if (i10 == 4) {
                if (this.s1 == null) {
                    a8 a8Var2 = new a8(this, activity, d8Var);
                    this.s1 = a8Var2;
                    n8Var.addView(a8Var2.e);
                    n8Var.addView(this.s1);
                }
                this.s1.setVisibility(0);
            } else if (i16 == 4) {
                d8Var.b();
                a8 a8Var3 = this.s1;
                if (a8Var3 != null) {
                    a8Var3.E = true;
                }
            }
        }
        this.b1.b((i10 == -1 || i10 == 2) && this.I > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        oe0 oe0Var = this.B1;
        boolean z13 = oe0Var == null && i10 == 1;
        float f14 = 1.0f;
        if (i10 == 1) {
            r();
            oe0 oe0Var2 = this.B1;
            this.v2 = oe0Var2;
            FrameLayout toolsView = oe0Var2 != null ? oe0Var2.getToolsView() : null;
            if (toolsView != null) {
                toolsView.setAlpha(0.0f);
                toolsView.setVisibility(0);
                f7 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            } else {
                f7 = 0.0f;
            }
        } else {
            f7 = 0.0f;
            if (i16 == 1 && oe0Var != null) {
                this.v2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(oe0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, org.telegram.messenger.i0.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.B1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    t();
                    this.v2 = this.v1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(x1Var, (Property<x1, Float>) property, f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.v1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -org.telegram.messenger.i0.L(16.0f), f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property2, org.telegram.messenger.i0.L(48.0f), f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -org.telegram.messenger.i0.L(32.0f), f7));
                } else if (i16 == 0 && this.v1 != null) {
                    this.v2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(x1Var, (Property<x1, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property3, f7));
                    View topLayout2 = this.v1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -org.telegram.messenger.i0.L(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property3, f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property4, org.telegram.messenger.i0.L(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -org.telegram.messenger.i0.L(32.0f)));
                }
                z7Var = this.r1;
                if (z7Var == null) {
                    eg.f fVar = z7Var.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<eg.f, Float>) property5, 0.0f, 1.0f));
                        eg.f fVar2 = this.r1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f10 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar2, (Property<eg.f, Float>) property6, org.telegram.messenger.i0.L(52.0f), f7));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property6, org.telegram.messenger.i0.L(52.0f), f7));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new h7(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        f10 = 52.0f;
                        i11 = 2;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<eg.f, Float>) property7, 1.0f, 0.0f));
                            eg.f fVar3 = this.r1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(fVar3, (Property<eg.f, Float>) property8, f7, org.telegram.messenger.i0.L(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property8, f7, org.telegram.messenger.i0.L(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.r1.getAppearProgress(), f7);
                            ofFloat2.addUpdateListener(new h7(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f10 = 52.0f;
                    i11 = 2;
                }
                a8Var = this.s1;
                if (a8Var != null) {
                    eg.f fVar4 = a8Var.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<eg.f, Float>) property9, fArr));
                        eg.f fVar5 = this.s1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = org.telegram.messenger.i0.L(f10);
                        fArr2[1] = f7;
                        arrayList.add(ObjectAnimator.ofFloat(fVar5, (Property<eg.f, Float>) property10, fArr2));
                        float[] fArr3 = new float[i11];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.s1.r;
                        float[] fArr4 = new float[i11];
                        fArr4[0] = org.telegram.messenger.i0.L(f10);
                        fArr4[1] = f7;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i11];
                        fArr5[0] = this.s1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new h7(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<eg.f, Float>) property11, fArr6));
                        eg.f fVar6 = this.s1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float L = org.telegram.messenger.i0.L(f10);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f7;
                        fArr7[1] = L;
                        arrayList.add(ObjectAnimator.ofFloat(fVar6, (Property<eg.f, Float>) property12, fArr7));
                        float[] fArr8 = new float[i11];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.s1.r;
                        float L2 = org.telegram.messenger.i0.L(f10);
                        float[] fArr9 = new float[i11];
                        fArr9[0] = f7;
                        fArr9[1] = L2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i11];
                        fArr10[0] = this.s1.getAppearProgress();
                        fArr10[1] = f7;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new h7(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i10 != -1 || i10 == 2) {
                    i12 = 1;
                    if (this.O1 == 1) {
                        f11 = 1.0f;
                        float[] fArr11 = new float[i12];
                        fArr11[0] = f11;
                        arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((n5Var = this.K1) == null || TextUtils.isEmpty(n5Var.y)))) ? 1.0f : f7));
                        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : f7));
                        imageView = this.i1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (n5Var2 = this.K1) != null && n5Var2.u) ? 1.0f : f7));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.f0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : f7;
                        arrayList.add(ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property13, fArr12));
                        b8 b8Var = this.h0;
                        if (i10 == i13) {
                            b8Var.setPivotY(b8Var.getMeasuredHeight() * 0.2f);
                            i14 = org.telegram.messenger.i0.L(164.0f);
                        } else if (i10 == 0) {
                            b8Var.setPivotY(b8Var.getMeasuredHeight() * 0.6f);
                            i14 = org.telegram.messenger.i0.L(40.0f);
                        } else if (i10 == 2) {
                            b8Var.setPivotY(f7);
                            i14 = z8Var.getContentHeight() + org.telegram.messenger.i0.L(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f12 = (r10 - i14) / (b8Var.getHeight() - ((int) b8Var.getPivotY()));
                        } else {
                            f12 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(b8Var, (Property<b8, Float>) View.SCALE_X, f12));
                        arrayList.add(ObjectAnimator.ofFloat(b8Var, (Property<b8, Float>) View.SCALE_Y, f12));
                        if (i10 == -1) {
                            f13 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(b8Var, (Property<b8, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f13 = 0.0f;
                        }
                        he0Var = this.F1;
                        if (he0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(he0Var, (Property<he0, Float>) property13, i10 == 1 ? 1.0f : f13));
                        }
                        fe0Var = this.E1;
                        if (fe0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(fe0Var, (Property<fe0, Float>) property13, i10 == 1 ? 1.0f : f13));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(e8Var, (Property<e8, Float>) property13, i10 == -1 ? 1.0f : f13));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : f13};
                        org.telegram.ui.Components.voip.i0 i0Var = this.l0;
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<org.telegram.ui.Components.voip.i0, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<org.telegram.ui.Components.voip.i0, Float>) property14, (i10 != -1 || i10 == 2) ? f13 : org.telegram.messenger.i0.L(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f14 = f13;
                        }
                        FrameLayout frameLayout3 = this.Y0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f14));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.L(64.0f) + (-(org.telegram.messenger.i0.L(12.0f) + e8Var.getEditTextHeight()))));
                        LinearLayout linearLayout = this.j0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - org.telegram.messenger.i0.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : f13));
                        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property15, i10 == 2 ? 90.0f : f13));
                        arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property15, i10 == 2 ? 90.0f : f13));
                        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property15, i10 == 2 ? 90.0f : f13));
                        imageView2 = this.i1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : f13));
                        }
                        if (this.r0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new r7(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (z8Var != null) {
                            n5 n5Var6 = this.K1;
                            boolean z14 = (n5Var6 == null || !n5Var6.v() || !this.K1.t() || i10 == 2) ? 1 : i15;
                            if (z8Var.j0 != z14 || !z11) {
                                z8Var.j0 = z14;
                                if (!z11) {
                                    z8Var.i0.f(z14, true);
                                }
                                z8Var.invalidate();
                            }
                        }
                        if (!z11) {
                            while (i15 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i15);
                                animator.setDuration(1L);
                                animator.start();
                                i15++;
                            }
                            if (i16 != i10) {
                                P(i16, i10);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.r2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.r2.setDuration(320L);
                        this.r2.setInterpolator(gr.h);
                        this.r2.addListener(new p7(this, i16, i10, 1));
                        if (z12) {
                            this.r2.setStartDelay(120L);
                        }
                        this.r2.start();
                        return;
                    }
                } else {
                    i12 = 1;
                }
                f11 = f7;
                float[] fArr112 = new float[i12];
                fArr112[0] = f11;
                arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((n5Var = this.K1) == null || TextUtils.isEmpty(n5Var.y)))) ? 1.0f : f7));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : f7));
                imageView = this.i1;
                if (imageView != null) {
                }
                int i172 = this.f0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : f7;
                arrayList.add(ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property13, fArr122));
                b8 b8Var2 = this.h0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(b8Var2, (Property<b8, Float>) View.SCALE_X, f12));
                arrayList.add(ObjectAnimator.ofFloat(b8Var2, (Property<b8, Float>) View.SCALE_Y, f12));
                if (i10 == -1) {
                }
                he0Var = this.F1;
                if (he0Var != null) {
                }
                fe0Var = this.E1;
                if (fe0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(e8Var, (Property<e8, Float>) property13, i10 == -1 ? 1.0f : f13));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : f13};
                org.telegram.ui.Components.voip.i0 i0Var2 = this.l0;
                arrayList.add(ObjectAnimator.ofFloat(i0Var2, (Property<org.telegram.ui.Components.voip.i0, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(i0Var2, (Property<org.telegram.ui.Components.voip.i0, Float>) property142, (i10 != -1 || i10 == 2) ? f13 : org.telegram.messenger.i0.L(120.0f)));
                if (i10 != -1) {
                    f14 = f13;
                }
                FrameLayout frameLayout32 = this.Y0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f14));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.L(64.0f) + (-(org.telegram.messenger.i0.L(12.0f) + e8Var.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.j0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - org.telegram.messenger.i0.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : f13));
                arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property152, i10 == 2 ? 90.0f : f13));
                arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property152, i10 == 2 ? 90.0f : f13));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property152, i10 == 2 ? 90.0f : f13));
                imageView2 = this.i1;
                if (imageView2 != null) {
                }
                if (this.r0.c()) {
                }
                if (z8Var != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i10 != 0) {
        }
        z7Var = this.r1;
        if (z7Var == null) {
        }
        a8Var = this.s1;
        if (a8Var != null) {
        }
        Property property132 = View.ALPHA;
        if (i10 != -1) {
        }
        i12 = 1;
        if (this.O1 == 1) {
        }
        f11 = f7;
        float[] fArr1122 = new float[i12];
        fArr1122[0] = f11;
        arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property132, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((n5Var = this.K1) == null || TextUtils.isEmpty(n5Var.y)))) ? 1.0f : f7));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : f7));
        imageView = this.i1;
        if (imageView != null) {
        }
        int i1722 = this.f0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : f7;
        arrayList.add(ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property132, fArr1222));
        b8 b8Var22 = this.h0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(b8Var22, (Property<b8, Float>) View.SCALE_X, f12));
        arrayList.add(ObjectAnimator.ofFloat(b8Var22, (Property<b8, Float>) View.SCALE_Y, f12));
        if (i10 == -1) {
        }
        he0Var = this.F1;
        if (he0Var != null) {
        }
        fe0Var = this.E1;
        if (fe0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(e8Var, (Property<e8, Float>) property132, i10 == -1 ? 1.0f : f13));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : f13};
        org.telegram.ui.Components.voip.i0 i0Var22 = this.l0;
        arrayList.add(ObjectAnimator.ofFloat(i0Var22, (Property<org.telegram.ui.Components.voip.i0, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(i0Var22, (Property<org.telegram.ui.Components.voip.i0, Float>) property1422, (i10 != -1 || i10 == 2) ? f13 : org.telegram.messenger.i0.L(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.Y0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f14));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.L(64.0f) + (-(org.telegram.messenger.i0.L(12.0f) + e8Var.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.j0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - org.telegram.messenger.i0.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : f13));
        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property1522, i10 == 2 ? 90.0f : f13));
        arrayList.add(ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property1522, i10 == 2 ? 90.0f : f13));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property1522, i10 == 2 ? 90.0f : f13));
        imageView2 = this.i1;
        if (imageView2 != null) {
        }
        if (this.r0.c()) {
        }
        if (z8Var != null) {
        }
        if (!z11) {
        }
    }

    public final void l() {
        n5 n5Var;
        if (this.v1 == null || (n5Var = this.K1) == null || !n5Var.u) {
            return;
        }
        File file = n5Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.K1.W0 = null;
        }
        this.K1.W0 = n5.w(this.c, "webp");
        s7 s7Var = this.v1;
        n5 n5Var2 = this.K1;
        Bitmap q02 = s7Var.q0(n5Var2.T0, false, false, true, this.O1 != 1, n5Var2);
        try {
            try {
                q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                if (q02.isRecycled()) {
                    return;
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                try {
                    this.K1.W0.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
                this.K1.W0 = null;
                if (q02 == null || q02.isRecycled()) {
                    return;
                }
            }
            q02.recycle();
        } catch (Throwable th2) {
            if (q02 != null && !q02.isRecycled()) {
                q02.recycle();
            }
            throw th2;
        }
    }

    public final void l0(boolean z10) {
        t7 t7Var;
        boolean z11 = false;
        h0(this.f0 == 0 && this.O1 == 1 && !this.I0.e && !H(), z10);
        this.G0.setSelected(this.A0.j());
        t tVar = this.I0;
        b0(this.n0, tVar == null || !tVar.e, z10);
        b0(this.E0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.Y1 == null || this.I0.e || H()) ? false : true, z10);
        b0(this.F0, (this.a2 || this.O1 == -1 || this.f0 != 0 || (t7Var = this.B0) == null || !t7Var.a || this.I0.e || this.A0.j()) ? false : true, z10);
        b0(this.G0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.I0.e) ? false : true, z10);
        b0(this.H0, this.I0.e, z10);
        this.O0.e(z10, this.A0.j() ? this.A0.getFilledProgress() : 0.0f);
        boolean z12 = this.I0.e;
        p2 p2Var = this.n1;
        if (z12) {
            p2Var.u();
        } else {
            p2Var.e(true);
        }
        g(this.a2, z10);
        org.telegram.messenger.i0.U3(this.S0, this.O1 == -1 && this.f0 == 0, true);
        if (this.O1 == -1 && this.f0 == 0) {
            z11 = true;
        }
        org.telegram.messenger.i0.U3(this.R0, z11, true);
    }

    public final void m0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = (this.E0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + alpha3;
        this.n0.setTranslationX(0.0f);
        org.telegram.ui.g3 g3Var = this.I0.a;
        g3Var.setPadding((int) ((this.n0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + 0.0f + org.telegram.messenger.i0.L(8.0f)), 0, (int) (alpha4 + org.telegram.messenger.i0.L(8.0f)), 0);
        g3Var.invalidate();
    }

    public final void n() {
        boolean z10 = this.K != 0.0f || this.I < 1.0f || this.B2;
        if (z10 == this.A2) {
            return;
        }
        aa0 aa0Var = this.D;
        if (aa0Var != null) {
            aa0Var.c(!z10);
        }
        this.A2 = z10;
    }

    public final void n0(boolean z10) {
        bi0 bi0Var = this.h1;
        if (bi0Var != null) {
            int[] iArr = bi0Var.e;
            int i10 = 0;
            if (!z10) {
                n5 n5Var = this.K1;
                int i11 = (n5Var == null || !n5Var.y0) ? 0 : iArr[0] - 1;
                bi0Var.N(i11, false, true);
                this.h1.P(i11);
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            n5 n5Var2 = this.K1;
            if (n5Var2 != null && n5Var2.y0) {
                i10 = iArr[0];
            }
            bi0Var.P(i10);
            bi0 bi0Var2 = this.h1;
            if (bi0Var2 != null) {
                bi0Var2.start();
            }
        }
    }

    public final void o() {
        if (this.t2 < 0) {
            this.t2 = vp.d1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.u2 = arrayList;
            arrayList.add("off");
            this.u2.add("auto");
            this.u2.add("on");
            float f7 = vp.d1().getFloat("frontflash_warmth", 0.9f);
            z1 z1Var = this.s;
            z1Var.o = f7;
            z1Var.n = z1.f(f7);
            z1Var.g();
            float f10 = vp.d1().getFloat("frontflash_intensity", 1.0f);
            z1 z1Var2 = this.s;
            z1Var2.p = f10;
            z1Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        y6 y6Var = new y6(this, 2);
        s7 s7Var = this.v1;
        n5 n5Var = this.K1;
        if (s7Var == null || n5Var == null) {
            y6Var.run();
            return;
        }
        n5Var.f();
        boolean r02 = s7Var.r0();
        boolean z10 = s7Var.x0.getPainting().E;
        Utilities.g.c(new ee(this, s7Var, n5Var.i0, n5Var.j0, n5Var, z10, r02, y6Var, 2));
    }

    public final void p(boolean z10) {
        d8 d8Var;
        if (this.d) {
            w6 w6Var = this.q0;
            if (w6Var != null) {
                w6Var.dismiss();
                this.q0 = null;
            }
            n5 n5Var = this.K1;
            long j10 = 0;
            if (n5Var != null && !n5Var.h) {
                if ((this.w && n5Var.g) || n5Var.b != 0) {
                    n5Var.j = false;
                }
                n5Var.i(false);
            }
            this.K1 = null;
            n20 n20Var = this.R;
            if (n20Var == null || (d8Var = this.X0) == null) {
                d8 d8Var2 = this.X0;
                if (d8Var2 != null && !z10) {
                    d8Var2.set(null);
                }
                f(0.0f, z10, new y6(this, 23));
                int i10 = this.J;
                if (i10 == 1 || i10 == 0) {
                    this.n.setBackgroundColor(0);
                    this.b1.b(false, true);
                }
                zs.e().n(this, zs.r2);
                int i11 = this.c;
                zs.f(i11).n(this, zs.y5);
                zs.f(i11).n(this, zs.b3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            u61 u61Var = d8Var.D;
            if (u61Var != null) {
                u61Var.g0();
                d8Var.D.m0();
                d8Var.D = null;
            }
            u61 u61Var2 = d8Var.y;
            if (u61Var2 != null) {
                j10 = u61Var2.S();
                d8Var.y.g0();
                d8Var.y.m0();
                d8Var.y = null;
            }
            u61 u61Var3 = d8Var.e;
            if (u61Var3 != null) {
                j10 = u61Var3.S();
                d8Var.e.g0();
                d8Var.e.m0();
                d8Var.e = null;
            }
            n20Var.a(Long.valueOf(j10), new g7(this, z10, 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final boolean p0() {
        t7 t7Var;
        if ((!this.P1 && !this.Q1) || (t7Var = this.B0) == null || !t7Var.isFrontface()) {
            return false;
        }
        int i10 = this.t2;
        return i10 == 2 || (i10 == 1 && this.c2);
    }

    public final void q() {
        Activity activity = this.b;
        if (this.B0 != null || activity == null) {
            return;
        }
        this.B0 = new t7(this, activity, vp.d1().getBoolean("stories_camera", false));
        r4 r4Var = this.O0;
        if (r4Var != null) {
            r4Var.g0 = 0.0f;
            r4Var.h0.e(true, 0.0f);
        }
        this.B0.recordHevc = !this.A0.j();
        this.B0.setThumbDrawable(z());
        this.B0.initTexture();
        this.B0.setDelegate(new f7(this, 0));
        b0(this.F0, this.B0.a && this.f0 == 0, true);
        this.G0.setTranslationX(this.B0.a ? 0.0f : org.telegram.messenger.i0.L(46.0f));
        this.A0.setCameraView(this.B0);
        if (vp.d1().getInt("storyhint2", 0) < 1) {
            this.W0.u();
            vp.d1().edit().putInt("storyhint2", vp.d1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!u0.q(this.B0.getContext()) || !vp.d1().getBoolean("dualcam", u0.p(org.telegram.messenger.w0.b, false))) && this.B0.a && vp.d1().getInt("storydualhint", 0) < 2) {
            this.l1.u();
        }
        if (this.C0 == null) {
            this.C0 = new o4(activity, new z6(this, 3));
        }
        this.C0.a(this.B0);
        a5 a5Var = this.D0;
        if (a5Var != null) {
            c8 c8Var = this.A0;
            Object blurRenderNode = c8Var.getBlurRenderNode();
            a5Var.F = c8Var;
            a5Var.G = blurRenderNode;
            a5Var.invalidate();
        }
    }

    public final void r() {
        n5 n5Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 != null || (n5Var = this.K1) == null) {
            return;
        }
        if (n5Var.K) {
            bitmap = null;
        } else {
            if (n5Var.Z0 == null) {
                q6 = this.X0.getPhotoBitmap();
            } else {
                f7 f7Var = new f7(this, 10);
                Point point = org.telegram.messenger.i0.q;
                q6 = n5.q(f7Var, point.x, point.y, 0, true);
            }
            bitmap = q6;
        }
        if (bitmap != null || this.K1.K) {
            k61 textureView = this.X0.getTextureView();
            int orientation = this.X0.getOrientation();
            n5 n5Var2 = this.K1;
            oe0 oe0Var = new oe0(this.b, textureView, bitmap, null, orientation, n5Var2 != null ? n5Var2.a1 : null, null, 0, false, false, this.r0, this.a);
            this.B1 = oe0Var;
            this.r.addView(oe0Var);
            ne0 ne0Var = this.C1;
            if (ne0Var != null) {
                ne0Var.setFilterView(this.B1);
            }
            TextureView myTextureView = this.B1.getMyTextureView();
            this.D1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            this.X0.o(this.D1, this.B1);
            TextureView textureView2 = this.D1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.D1.animate().alpha(1.0f).setDuration(220L).start();
            }
            i();
            fe0 blurControl = this.B1.getBlurControl();
            this.E1 = blurControl;
            if (blurControl != null) {
                this.h0.addView(blurControl);
            }
            he0 curveControl = this.B1.getCurveControl();
            this.F1 = curveControl;
            if (curveControl != null) {
                this.h0.addView(curveControl);
            }
            U();
            this.B1.getDoneTextView().setOnClickListener(new a7(this, 13));
            this.B1.getCancelTextView().setOnClickListener(new a7(this, 14));
            this.B1.getToolsView().setVisibility(8);
            this.B1.getToolsView().setAlpha(0.0f);
            this.B1.getToolsView().setTranslationY(org.telegram.messenger.i0.L(186.0f));
            this.B1.i0.setVisibility(0);
        }
    }

    public final void s(boolean z10) {
        if (this.M0 != null) {
            c8 c8Var = this.A0;
            if ((c8Var != null && c8Var.j()) == this.M0.P) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        we weVar = this.m2;
        boolean z11 = !z10;
        c8 c8Var2 = this.A0;
        m2 m2Var = new m2(this, this.c, this.b, this.a, weVar, z10, z11, c8Var2 != null && c8Var2.j());
        this.M0 = m2Var;
        m2Var.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, r.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new j7(this, 1));
        int i10 = 2;
        this.M0.setOnSelectListener(new cv0(i10, this, z10));
        this.M0.setOnSelectMultipleListener(new rh.b1(this, i10));
        s4.z zVar = this.l2;
        if (zVar != null) {
            oi oiVar = this.M0.e;
            oiVar.B = zVar;
            oiVar.l0();
        }
        this.n.addView(this.M0, w7.b6.e(-1, -1, zs.E1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a6  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        Bitmap bitmap;
        boolean z10;
        n5 n5Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        n5 n5Var2;
        ig.c1 renderView;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file2;
        File file3;
        if (this.v1 != null) {
            return;
        }
        Pair<Integer, Integer> paintSize = this.X0.getPaintSize();
        n5 n5Var3 = this.K1;
        Bitmap decodeFile = (n5Var3 == null || !(n5Var3.c || n5Var3.g || this.H1 != null) || (file3 = n5Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        n5 n5Var4 = this.K1;
        if (n5Var4 == null || (!(n5Var4.c || n5Var4.g || this.H1 != null) || (file2 = n5Var4.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file2.getPath());
            if (bitmap != null) {
                z10 = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                int measuredWidth = this.h0.getMeasuredWidth();
                int measuredHeight = this.h0.getMeasuredHeight();
                n5Var = this.K1;
                if (n5Var != null || n5Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = n5Var != null ? file : n5Var.L;
                if (n5Var == null && n5Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (n5Var != null || n5Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.X0.getOrientation();
                n5Var2 = this.K1;
                Object obj2 = obj;
                if (n5Var2 != null) {
                    obj2 = n5Var2.T0;
                }
                ?? r13 = obj2;
                ye yeVar = new ye();
                j4 j4Var = this.s0;
                d8 d8Var = this.X0;
                Activity activity = this.b;
                boolean z15 = z12;
                s7 s7Var = new s7(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, n5Var2, measuredWidth, measuredHeight, yeVar, this.r0, this.a, j4Var, d8Var);
                this.v1 = s7Var;
                n5 n5Var5 = this.K1;
                s7Var.setHasAudio(n5Var5 == null && n5Var5.y != null);
                this.v1.setBlurManager(this.r0);
                this.r.addView(this.v1);
                renderView = this.v1.getRenderView();
                this.w1 = renderView;
                if (renderView != null) {
                    renderView.getPainting().E = z15;
                    this.h0.addView(this.w1);
                }
                renderInputView = this.v1.getRenderInputView();
                this.x1 = renderInputView;
                if (renderInputView != null) {
                    this.h0.addView(renderInputView);
                }
                textDimView = this.v1.getTextDimView();
                this.y1 = textDimView;
                if (textDimView != null) {
                    this.h0.addView(textDimView);
                }
                entitiesView = this.v1.getEntitiesView();
                this.z1 = entitiesView;
                if (entitiesView != null) {
                    this.h0.addView(entitiesView);
                }
                selectionEntitiesView = this.v1.getSelectionEntitiesView();
                this.A1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    this.h0.addView(selectionEntitiesView);
                }
                U();
                this.v1.setOnDoneButtonClickedListener(new y6(this, 21));
                this.v1.setOnCancelButtonClickedListener(new y6(this, 22));
                s7 s7Var2 = this.v1;
                s7Var2.A0.setVisibility(0);
                s7Var2.x0.setVisibility(0);
                s7Var2.y0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.h0.getMeasuredWidth();
        int measuredHeight2 = this.h0.getMeasuredHeight();
        n5Var = this.K1;
        if (n5Var != null) {
        }
        file = null;
        z11 = false;
        if (n5Var != null) {
        }
        if (n5Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (n5Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.X0.getOrientation();
        n5Var2 = this.K1;
        Object obj22 = obj;
        if (n5Var2 != null) {
        }
        ?? r132 = obj22;
        ye yeVar2 = new ye();
        j4 j4Var2 = this.s0;
        d8 d8Var2 = this.X0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        s7 s7Var3 = new s7(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, n5Var2, measuredWidth2, measuredHeight2, yeVar2, this.r0, this.a, j4Var2, d8Var2);
        this.v1 = s7Var3;
        n5 n5Var52 = this.K1;
        s7Var3.setHasAudio(n5Var52 == null && n5Var52.y != null);
        this.v1.setBlurManager(this.r0);
        this.r.addView(this.v1);
        renderView = this.v1.getRenderView();
        this.w1 = renderView;
        if (renderView != null) {
        }
        renderInputView = this.v1.getRenderInputView();
        this.x1 = renderInputView;
        if (renderInputView != null) {
        }
        textDimView = this.v1.getTextDimView();
        this.y1 = textDimView;
        if (textDimView != null) {
        }
        entitiesView = this.v1.getEntitiesView();
        this.z1 = entitiesView;
        if (entitiesView != null) {
        }
        selectionEntitiesView = this.v1.getSelectionEntitiesView();
        this.A1 = selectionEntitiesView;
        if (selectionEntitiesView != null) {
        }
        U();
        this.v1.setOnDoneButtonClickedListener(new y6(this, 21));
        this.v1.setOnCancelButtonClickedListener(new y6(this, 22));
        s7 s7Var22 = this.v1;
        s7Var22.A0.setVisibility(0);
        s7Var22.x0.setVisibility(0);
        s7Var22.y0.setVisibility(0);
    }

    public final void u(boolean z10) {
        o4 o4Var = this.C0;
        if (o4Var != null) {
            o4Var.f = null;
            Utilities.e.a(o4Var.h);
            this.C0 = null;
            c8 c8Var = this.A0;
            if (c8Var != null) {
                c8Var.c.a(null);
            }
        }
        a5 a5Var = this.D0;
        if (a5Var != null) {
            a5Var.F = null;
            a5Var.G = null;
            a5Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                a0(new y6(this, 8));
                return;
            }
            a0(new y6(this, 9));
            this.B0.destroy(true, null);
            org.telegram.messenger.i0.E2(this.B0);
            c8 c8Var2 = this.A0;
            if (c8Var2 != null) {
                c8Var2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        m2 m2Var = this.M0;
        if (m2Var == null) {
            return;
        }
        this.n.removeView(m2Var);
        this.M0 = null;
        ValueAnimator valueAnimator = this.n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n2 = null;
        }
        o1.j jVar = this.o2;
        if (jVar != null) {
            jVar.d();
            this.o2 = null;
        }
        this.p2 = null;
    }

    public final void x() {
        oe0 oe0Var = this.B1;
        if (oe0Var == null) {
            return;
        }
        oe0Var.c();
        this.C1.setFilterView(null);
        this.r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        fe0 fe0Var = this.E1;
        if (fe0Var != null) {
            this.h0.removeView(fe0Var);
            this.E1 = null;
        }
        he0 he0Var = this.F1;
        if (he0Var != null) {
            this.h0.removeView(he0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        s7 s7Var = this.v1;
        if (s7Var == null) {
            return;
        }
        s7Var.A0.removeAllViews();
        s7 s7Var2 = this.v1;
        s7Var2.x0.h();
        s7Var2.A0.setVisibility(8);
        s7Var2.z0.setVisibility(8);
        s7Var2.n0.postRunnable(new r5.a(14));
        q3 q3Var = s7Var2.T1;
        if (q3Var != null) {
            q3Var.dismiss();
        }
        ig.u uVar = s7Var2.C1;
        if (uVar != null) {
            uVar.dismiss();
        }
        this.r.removeView(this.v1);
        this.v1 = null;
        ig.c1 c1Var = this.w1;
        if (c1Var != null) {
            this.h0.removeView(c1Var);
            this.w1 = null;
        }
        View view = this.y1;
        if (view != null) {
            this.h0.removeView(view);
            this.y1 = null;
        }
        View view2 = this.x1;
        if (view2 != null) {
            this.h0.removeView(view2);
            this.x1 = null;
        }
        View view3 = this.z1;
        if (view3 != null) {
            this.h0.removeView(view3);
            this.z1 = null;
        }
        View view4 = this.A1;
        if (view4 != null) {
            this.h0.removeView(view4);
            this.A1 = null;
        }
    }

    public final Drawable z() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        return bitmap != null ? new BitmapDrawable(bitmap) : this.b.getResources().getDrawable(R.drawable.icplaceholder);
    }
}
