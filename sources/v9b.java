// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class v9b implements jm7 {
    public static v9b G2;
    public sl2 A0;
    public View A1;
    public boolean A2;
    public final j9b B0;
    public View B1;
    public boolean B2;
    public a9b C0;
    public n78 C1;
    public boolean C2;
    public ex8 D0;
    public final m78 D1;
    public f9b D2;
    public final a26 E;
    public final ms9 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final nrb F0;
    public e78 F1;
    public ValueAnimator F2;
    public q9b G;
    public final orb G0;
    public g78 G1;
    public float H;
    public final xl2 H0;
    public File H1;
    public final RectF I;
    public final nrb I0;
    public ArrayList I1;
    public float J;
    public final wl2 J0;
    public ArrayList J1;
    public boolean K;
    public final uec K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public g6b L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public wt4 N0;
    public long N1;
    public long O;
    public or3 O0;
    public boolean O1;
    public boolean P;
    public final j49 P0;
    public int P1;
    public final po Q;
    public final b61 Q0;
    public boolean Q1;
    public Runnable R;
    public final s8b R0;
    public boolean R1;
    public nac S;
    public final pk4 S0;
    public boolean S1;
    public int T;
    public final pk4 T0;
    public boolean T1;
    public int U;
    public final eg5 U0;
    public float U1;
    public int V;
    public final eg5 V0;
    public int V1;
    public boolean W;
    public final b1d W0;
    public boolean W1;
    public boolean X;
    public final hg5 X0;
    public boolean X1;
    public boolean Y;
    public final k9b Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final r63 a;
    public int a0;
    public final lqb a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final lec b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final yk8 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final l9b d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final r8b e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final yq3 f1;
    public Runnable f2;
    public byte g0;
    public p09 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final s09 h1;
    public b7b h2;
    public final i9b i0;
    public p09 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final a91 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final hg5 l1;
    public boolean l2;
    public final ne6 m0;
    public final hg5 m1;
    public t46 m2;
    public final u9b n;
    public final FrameLayout n0;
    public final hg5 n1;
    public yn6 n2;
    public final pk4 o0;
    public final hg5 o1;
    public ValueAnimator o2;
    public final q0a p0;
    public final zk8 p1;
    public zna p2;
    public final lka q0;
    public final k3c q1;
    public Boolean q2;
    public final n9b r;
    public a8b r0;
    public wc1 r1;
    public n8b r2;
    public final rk4 s;
    public final sm0 s0;
    public g9b s1;
    public AnimatorSet s2;
    public final n10 t0;
    public h9b t1;
    public boolean t2;
    public final xd9 u0;
    public final lqb u1;
    public int u2;
    public boolean v0;
    public final b61 v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public z8b w1;
    public r9b w2;
    public long x;
    public String x0;
    public e99 x1;
    public boolean x2;
    public m9b y;
    public TLRPC.InputPeer y0;
    public View y1;
    public f8b y2;
    public y7b z0;
    public View z1;
    public bm3 z2;

    public v9b(Activity activity, int i) {
        r63 r63Var = new r63();
        this.a = r63Var;
        this.x = 0L;
        this.I = new RectF();
        byte b = 1;
        this.N = true;
        this.Q = new po(null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        this.g0 = (byte) 0;
        this.h0 = -1;
        this.z0 = new y7b();
        this.I1 = null;
        this.J1 = null;
        this.K1 = null;
        this.P1 = 0;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.V1 = -3;
        this.X1 = false;
        v8b v8bVar = new v8b(this);
        this.e2 = true;
        this.l2 = true;
        this.u2 = -1;
        this.b = activity;
        this.c = i;
        this.E = LaunchActivity.c0();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        gm.m(layoutParams);
        layoutParams.flags = -2013200128;
        byte b2 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        u9b u9bVar = new u9b(this, activity);
        this.n = u9bVar;
        m8b m8bVar = new m8b(this, b);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(u9bVar, m8bVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        rk4 rk4Var = new rk4(activity, windowManager, this.n, layoutParams);
        this.s = rk4Var;
        rk4Var.a(new d9b(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        u9b u9bVar2 = this.n;
        n9b n9bVar = new n9b(this, activity);
        this.r = n9bVar;
        u9bVar2.addView(n9bVar);
        n9b n9bVar2 = this.r;
        i9b i9bVar = new i9b(this, activity);
        this.i0 = i9bVar;
        n9bVar2.addView(i9bVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new sm0(this.i0);
        this.t0 = new n10();
        n9b n9bVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        n9bVar3.addView(frameLayout);
        n9b n9bVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        n9bVar4.addView(frameLayout2);
        n9b n9bVar5 = this.r;
        ne6 ne6Var = new ne6((byte) 29, activity, this);
        this.m0 = ne6Var;
        n9bVar5.addView(ne6Var);
        byte b3 = 8;
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        n9b n9bVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        n9bVar6.addView(frameLayout3);
        byte b4 = 15;
        u31.a(this.n, new oz(b4));
        j9b j9bVar = new j9b(this, activity, this.s0, this.r, r63Var);
        this.B0 = j9bVar;
        u9b u9bVar3 = this.n;
        Objects.requireNonNull(u9bVar3);
        j9bVar.setCancelGestures(new nsa((Object) u9bVar3, (byte) 24));
        this.B0.setResetState(new f8b(this, (byte) 13));
        this.i0.addView(this.B0, qoe.e(-1, -1, nm7.D1));
        this.B0.setOnClickListener(new h8b(this, (byte) 12));
        i9b i9bVar2 = this.i0;
        boolean z = this.K;
        i9bVar2.setBackgroundColor((z || !z) ? 0 : -14737633);
        i9b i9bVar3 = this.i0;
        float L = gm.L(12.0f);
        xj xjVar = agc.a;
        i9bVar3.setOutlineProvider(new yfc(0, L));
        this.i0.setClipToOutline(true);
        f8b f8bVar = new f8b(this, (byte) 14);
        m78 m78Var = new m78(activity);
        m78Var.a = new TextPaint(1);
        m78Var.b = new TextPaint(1);
        d53 d53Var = d53.h;
        m78Var.s = new ln(m78Var, 0L, 350L, d53Var);
        m78Var.J = new kl7(m78Var, (byte) 28);
        m78Var.y = f8bVar;
        this.D1 = m78Var;
        k9b k9bVar = new k9b(this, activity, this.s0, this.t0);
        this.Y0 = k9bVar;
        k9bVar.setCollageView(this.B0);
        k9b k9bVar2 = this.Y0;
        k9bVar2.w = new f8b(this, b4);
        k9bVar2.setOnTapListener(new f8b(this, b2));
        this.Y0.setVisibility(8);
        k9b k9bVar3 = this.Y0;
        k9bVar3.O = new f8b(this, (byte) 17);
        this.i0.addView(k9bVar3, qoe.e(-1, -1, nm7.D1));
        this.i0.addView(this.D1, qoe.e(-1, -1, nm7.D1));
        u9b u9bVar4 = this.n;
        byte b5 = 12;
        l9b l9bVar = new l9b(this, activity, u9bVar4, u9bVar4, this.r, r63Var, this.s0);
        this.d1 = l9bVar;
        l9bVar.setAccount(i);
        this.d1.setUiBlurBitmap(new c1b((byte) 3));
        u31.a(this.m0, new s20(this, (byte) 20));
        this.d1.setOnHeightUpdate(new g8b(this, (byte) 14));
        this.d1.setOnPeriodUpdate(new g8b(this, (byte) 5));
        long j = this.O;
        if (j != 0) {
            this.d1.setDialogId(j);
        }
        this.d1.setOnPremiumHint(new g8b(this, (byte) 6));
        this.d1.setOnKeyboardOpen(new g8b(this, (byte) 7));
        xd9 xd9Var = new xd9(b5, activity, this);
        this.u0 = xd9Var;
        this.r.addView(xd9Var);
        lqb lqbVar = new lqb(activity, this.r, this.i0, r63Var, this.s0);
        this.a1 = lqbVar;
        lqbVar.setOnTimelineClick(new f8b(this, (byte) 10));
        this.a1.setOnHeightChange(new f8b(this, (byte) 11));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        frameLayout4.addView(this.a1, qoe.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        lec lecVar = new lec(activity);
        this.b1 = lecVar;
        lecVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, qoe.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, qoe.d(-1, 413.0f, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, qoe.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        lqb lqbVar2 = new lqb(activity, this.r, this.i0, r63Var, this.s0);
        this.u1 = lqbVar2;
        lqbVar2.Y0 = true;
        lqbVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, qoe.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        r8b r8bVar = new r8b(this, activity, r63Var, this.s0);
        this.e1 = r8bVar;
        r8bVar.setVisibility(8);
        this.m0.addView(this.e1, qoe.e(-1, -2, 85));
        pk4 pk4Var = new pk4(activity);
        this.o0 = pk4Var;
        pk4Var.setContentDescription(jb6.M0(2131754878, null));
        pk4 pk4Var2 = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pk4Var2.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_photo_back);
        pk4 pk4Var3 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        pk4Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(cmb.f0(553648127, 1, -1));
        this.o0.setOnClickListener(new h8b(this, b));
        this.j0.addView(this.o0, qoe.e(56, 56, 51));
        this.s.a(this.o0);
        q0a q0aVar = new q0a(activity, i);
        this.p0 = q0aVar;
        q0aVar.a(false, false);
        this.p0.setOnClickListener(new r39(this, activity, (byte) 24));
        this.j0.addView(this.p0, qoe.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        lka lkaVar = new lka(activity);
        this.q0 = lkaVar;
        lkaVar.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(gm.o());
        this.q0.l(jb6.M0(2131746086, null), false);
        this.q0.getPaint().setShadowLayer(gm.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(gm.L(144.0f));
        this.j0.addView(this.q0, qoe.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, qoe.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        g8b g8bVar = new g8b(this, b3);
        u9b u9bVar5 = this.n;
        yq3 yq3Var = new yq3(activity);
        yq3Var.x = true;
        yq3Var.y = true;
        yq3Var.h = g8bVar;
        yq3Var.a = i;
        yq3Var.b = u9bVar5;
        yq3Var.setScaleType(scaleType);
        yq3Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        yq3Var.setBackground(cmb.f0(553648127, 1, -1));
        yq3Var.setVisibility(8);
        yq3Var.setAlpha(0.0f);
        yq3Var.setOnClickListener(new sf3(yq3Var, (byte) 5));
        yq3Var.f = new wi2(gm.L(18.0f), gm.L(2.0f), -1);
        yq3Var.d();
        this.f1 = yq3Var;
        hg5 hg5Var = new hg5(activity, 1);
        hg5Var.n(1.0f, -71.0f);
        hg5Var.d = 2000L;
        hg5Var.V = false;
        hg5Var.I.r(true, false);
        this.l1 = hg5Var;
        hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        this.j0.addView(this.l1, qoe.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        s09 s09Var = new s09(activity);
        this.h1 = s09Var;
        s09Var.setScaleType(scaleType);
        s09 s09Var2 = this.h1;
        g6b g6bVar = this.L1;
        s09Var2.setImageResource((g6bVar == null || !g6bVar.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(cmb.f0(553648127, 1, -1));
        this.h1.setOnClickListener(new h8b(this, (byte) 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        a91 a91Var = new a91(activity);
        this.k1 = a91Var;
        a91Var.setBackground(cmb.f0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new h8b(this, (byte) 3));
        this.k0.addView(this.k1, qoe.r(46, 56, 53));
        this.k0.addView(this.h1, qoe.r(46, 56, 53));
        this.k0.addView(this.f1, qoe.e(46, 56, 53));
        nrb nrbVar = new nrb(activity);
        this.F0 = nrbVar;
        nrbVar.setBackground(cmb.f0(553648127, 1, -1));
        this.F0.setOnClickListener(new h8b(this, (byte) 4));
        this.F0.setOnLongClickListener(new au(this, (byte) 18));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, qoe.e(56, 56, 53));
        orb orbVar = new orb(activity);
        this.G0 = orbVar;
        orbVar.setContentDescription(jb6.M0(2131754886, null));
        this.G0.setOnClickListener(new h8b(this, (byte) 5));
        boolean o = ss3.o(activity);
        this.G0.setVisibility(o ? 0 : 8);
        this.G0.setAlpha(o ? 1.0f : 0.0f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, qoe.e(56, 56, 53));
        xl2 xl2Var = new xl2(activity);
        this.H0 = xl2Var;
        xl2Var.setContentDescription(jb6.M0(2131754895, null));
        this.H0.setBackground(cmb.f0(553648127, 1, -1));
        if (this.A0 == null) {
            this.A0 = (sl2) sl2.a().get(6);
        }
        this.H0.setOnClickListener(new h8b(this, (byte) 6));
        this.H0.a(new tl2(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, qoe.e(56, 56, 53));
        nrb nrbVar2 = new nrb(activity);
        this.I0 = nrbVar2;
        nrbVar2.setContentDescription(jb6.M0(2131754894, null));
        this.I0.setBackground(cmb.f0(553648127, 1, -1));
        this.I0.a(new tl2(new sl2("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new h8b(this, (byte) 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, qoe.e(56, 56, 53));
        wl2 wl2Var = new wl2(activity, this.s);
        this.J0 = wl2Var;
        wl2Var.a.w0(6);
        this.J0.setSelected((sl2) null);
        this.J0.setOnLayoutClick(new g8b(this, (byte) 9));
        this.j0.addView(this.J0, qoe.e(-1, 56, 53));
        hg5 hg5Var2 = new hg5(activity, 1);
        hg5Var2.n(1.0f, -20.0f);
        hg5Var2.d = 5000L;
        hg5Var2.j(true);
        hg5Var2.t(jb6.M0(2131744402, null));
        hg5Var2.r0 = new e1b(b);
        this.m1 = hg5Var2;
        hg5Var2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        this.j0.addView(this.m1, qoe.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        hg5 hg5Var3 = new hg5(activity, 2);
        hg5Var3.n(0.0f, 28.0f);
        hg5Var3.d = 5000L;
        hg5Var3.p(true);
        this.n1 = hg5Var3;
        this.j0.addView(hg5Var3, qoe.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        hg5 hg5Var4 = new hg5(activity, 1);
        hg5Var4.n(1.0f, -20.0f);
        hg5Var4.d = 5000L;
        hg5Var4.t(jb6.M0(2131744390, null));
        this.o1 = hg5Var4;
        hg5Var4.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        this.j0.addView(this.o1, qoe.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        uec uecVar = new uec(activity);
        Paint paint = new Paint(1);
        uecVar.a = paint;
        Paint paint2 = new Paint(1);
        uecVar.b = paint2;
        uecVar.e = new ln(uecVar, 0L, 250L, d53Var);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        ho hoVar = new ho(false, true, true);
        uecVar.c = hoVar;
        hoVar.n(0.3f, 250L, d53Var);
        hoVar.w(gm.L(13.0f));
        hoVar.u(-1);
        hoVar.x(gm.o());
        hoVar.setCallback(uecVar);
        hoVar.b = 1;
        uecVar.a(0L, false);
        this.K0 = uecVar;
        h0(false, false);
        this.j0.addView(this.K0, qoe.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.N(0);
        j49 j49Var = new j49(activity);
        this.P0 = j49Var;
        j49Var.setDelegate(v8bVar);
        j49 j49Var2 = this.P0;
        boolean z2 = this.P1 == 1;
        j49Var2.o0 = -1.0f;
        j49Var2.p0 = z2;
        j49Var2.invalidate();
        this.l0.addView(this.P0, qoe.e(-1, 100, 87));
        this.s.a(this.P0);
        this.P0.e(true, this.B0.i() ? this.B0.getFilledProgress() : 0.0f);
        b61 b61Var = new b61(r63Var, activity, true);
        this.Q0 = b61Var;
        b61Var.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(jb6.M0(2131748545, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, qoe.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new h8b(this, (byte) 8));
        hg5 hg5Var5 = new hg5(activity, 3);
        hg5Var5.p(true);
        hg5Var5.t(jb6.M0(2131744400, null));
        hg5Var5.h = gm.L(320.0f);
        hg5Var5.d = 5000L;
        hg5Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = hg5Var5;
        this.l0.addView(hg5Var5, qoe.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        b1d b1dVar = new b1d(activity);
        this.W0 = b1dVar;
        b1dVar.N = false;
        b1dVar.setAlpha(0.0f);
        this.l0.addView(this.W0, qoe.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new m8b(this, (byte) 4));
        b1d b1dVar2 = this.W0;
        this.U1 = 0.0f;
        b1dVar2.b(false, 0.0f);
        ms9 ms9Var = new ms9(activity, i, new f8b(this, (byte) 12));
        this.E0 = ms9Var;
        ms9Var.c = new g8b(this, (byte) 10);
        this.l0.addView(ms9Var, qoe.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        s8b s8bVar = new s8b(this, activity);
        this.R0 = s8bVar;
        s8bVar.setOnSwitchModeListener(new g8b(this, (byte) 11));
        this.R0.setOnSwitchingModeListener(new g8b(this, (byte) 12));
        this.n0.addView(this.R0, qoe.e(-1, 48, 55));
        this.s.a(this.R0);
        pk4 pk4Var4 = new pk4(activity);
        this.S0 = pk4Var4;
        pk4Var4.setContentDescription(jb6.M0(2131754751, null));
        this.S0.setImageResource(R.drawable.stream_flip);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(cmb.f0(553648127, 1, -1));
        this.n0.addView(this.S0, qoe.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new h8b(this, (byte) 9));
        pk4 pk4Var5 = new pk4(activity);
        this.T0 = pk4Var5;
        pk4Var5.setContentDescription(jb6.M0(2131748547, null));
        this.T0.setImageResource(R.drawable.stream_settings);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(cmb.f0(553648127, 1, -1));
        this.n0.addView(this.T0, qoe.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new h8b(this, (byte) 10));
        eg5 eg5Var = new eg5(activity);
        this.U0 = eg5Var;
        this.n0.addView(eg5Var, qoe.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        eg5 eg5Var2 = new eg5(activity);
        this.V0 = eg5Var2;
        eg5Var2.a.t(jb6.M0(2131744389, null), false, true);
        eg5Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, qoe.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        b61 b61Var2 = new b61(r63Var, activity, true);
        b61Var2.setRoundRadius(24);
        this.v1 = b61Var2;
        b61Var2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(jb6.M0(2131744375, null), false, true);
        this.v1.setOnClickListener(new h8b(this, (byte) 11));
        this.n0.addView(this.v1, qoe.d(-1, 48.0f, nm7.D1, 10.0f, 10.0f, 10.0f, 10.0f));
        yk8 yk8Var = new yk8(activity);
        yk8Var.b = new ArrayList();
        yk8Var.e = true;
        yk8Var.h = true;
        View view = new View(activity);
        yk8Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        yk8Var.addView(view, qoe.e(-1, -1, nm7.D1));
        yk8Var.a(0, R.drawable.media_draw, jb6.M0(2131754813, null));
        yk8Var.a(2, R.drawable.msg_photo_sticker, jb6.M0(2131754755, null));
        yk8Var.a(1, R.drawable.msg_photo_text2, jb6.M0(2131754806, null));
        yk8Var.a(3, R.drawable.media_crop, jb6.M0(2131751636, null));
        yk8Var.a(4, R.drawable.msg_photo_settings, jb6.M0(2131754810, null));
        String M0 = jb6.M0(2131745374, null);
        yk8Var.d = M0;
        yk8Var.e = true;
        xk8 xk8Var = new xk8(yk8Var, activity, M0, true);
        yk8Var.c = xk8Var;
        xk8Var.setContentDescription(jb6.M0(2131745374, null));
        yk8Var.addView(yk8Var.c, qoe.c(-2.0f, -2));
        yk8Var.e();
        this.c1 = yk8Var;
        yk8Var.setVisibility(8);
        this.c1.setOnClickListener(new g8b(this, (byte) 13));
        this.n0.addView(this.c1, qoe.e(-1, 52, 23));
        k3c k3cVar = new k3c(activity);
        this.q1 = k3cVar;
        k3cVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, qoe.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        zk8 zk8Var = new zk8(activity, i, r63Var);
        this.p1 = zk8Var;
        this.i0.addView(zk8Var, qoe.e(-1, -1, nm7.D1));
        l0(false);
    }

    public static v9b C(Activity activity, int i) {
        v9b v9bVar = G2;
        if (v9bVar != null && (v9bVar.b != activity || v9bVar.c != i)) {
            v9bVar.o(false);
            v9bVar = null;
            G2 = null;
        }
        if (v9bVar != null) {
            return v9bVar;
        }
        v9b v9bVar2 = new v9b(activity, i);
        G2 = v9bVar2;
        return v9bVar2;
    }

    public static SpannableString k(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable d = b10.d(context, R.drawable.story_camera);
        int L = gm.L(35.0f);
        int i = -L;
        d.setBounds(i / 4, i, (L / 4) * 3, 0);
        spannableString.setSpan(new e9b(d, d), 0, 1, 33);
        return spannableString;
    }

    public static void v() {
        v9b v9bVar = G2;
        if (v9bVar != null) {
            v9bVar.o(false);
        }
        G2 = null;
    }

    public final String A() {
        a9b a9bVar = this.C0;
        if (a9bVar == null || a9bVar.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        m();
        return (String) this.v2.get(this.u2);
    }

    public final or3 B() {
        if (this.O0 == null) {
            or3 or3Var = new or3(this.b);
            this.O0 = or3Var;
            this.l0.addView(or3Var, qoe.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String D() {
        a9b a9bVar = this.C0;
        if (a9bVar == null || a9bVar.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getNextFlashMode();
        }
        m();
        ArrayList arrayList = this.v2;
        return (String) arrayList.get(this.u2 + 1 >= arrayList.size() ? 0 : this.u2 + 1);
    }

    public final ImageView E() {
        if (this.j1 == null) {
            p09 p09Var = new p09(R.raw.sun_outline, gm.L(28.0f), gm.L(28.0f), true, null);
            this.i1 = p09Var;
            p09Var.h = true;
            g6b g6bVar = this.L1;
            byte b = 0;
            if (g6bVar == null || !g6bVar.y0) {
                p09Var.K(0);
                this.i1.H(0);
            } else {
                p09Var.H(35);
                this.i1.K(36);
            }
            this.i1.a0 = true;
            int v0 = cmb.v0(cmb.I9, this.a);
            this.i1.L(v0, "Sunny");
            this.i1.L(v0, "Path 6");
            this.i1.L(v0, "Path");
            this.i1.L(v0, "Path 5");
            this.i1.j();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(cmb.f0(553648127, 1, -1));
            this.j1.setOnClickListener(new h8b(this, b));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, qoe.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void F() {
        z8b z8bVar = this.w1;
        if (z8bVar == null) {
            return;
        }
        this.w2 = null;
        z8bVar.getTopLayout().setAlpha(0.0f);
        this.w1.getTopLayout().setTranslationY(-gm.L(16.0f));
        this.w1.getBottomLayout().setAlpha(0.0f);
        this.w1.getBottomLayout().setTranslationY(gm.L(48.0f));
        this.w1.getWeightChooserView().setTranslationX(-gm.L(32.0f));
        this.w1.setVisibility(8);
    }

    public final boolean G() {
        return !this.b2 && (this.B0.i() ? this.B0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean H() {
        wt4 wt4Var;
        if (this.X || (wt4Var = this.N0) == null) {
            return false;
        }
        return wt4Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) gm.q.y) * 0.35f))) - (a.getCurrentActionBarHeight() + gm.m)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(int i, boolean z) {
        g6b g6bVar;
        g6b g6bVar2;
        b61 b61Var;
        lka lkaVar;
        int i2;
        char c;
        float L;
        ImageView imageView;
        g6b g6bVar3;
        g6b g6bVar4;
        g6b g6bVar5;
        g6b g6bVar6;
        a9b a9bVar;
        byte b = this.g0;
        if (i == b) {
            return;
        }
        this.g0 = i;
        AnimatorSet animatorSet = this.j2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        M(b, i);
        yk8 yk8Var = this.c1;
        if (yk8Var != null) {
            yk8Var.b(i == 1, z);
        }
        wl2 wl2Var = this.J0;
        h0(i == 0 && this.P1 == 1 && !wl2Var.e && !G(), z);
        if (i != 1) {
            this.b1.a(z);
        }
        b0(this.o0, !wl2Var.e, z);
        b0(this.F0, (this.b2 || i != 0 || wl2Var.e || this.Z1 == null || G()) ? false : true, z);
        boolean z2 = this.b2;
        j9b j9bVar = this.B0;
        b0(this.G0, (z2 || i != 0 || (a9bVar = this.C0) == null || !a9bVar.a || wl2Var.e || j9bVar.i()) ? false : true, true);
        b0(this.H0, (this.b2 || i != 0 || wl2Var.e) ? false : true, z);
        l0(z);
        yq3 yq3Var = this.f1;
        a91 a91Var = this.k1;
        s09 s09Var = this.h1;
        lqb lqbVar = this.u1;
        lqb lqbVar2 = this.a1;
        b61 b61Var2 = this.v1;
        lka lkaVar2 = this.q0;
        l9b l9bVar = this.d1;
        eg5 eg5Var = this.V0;
        eg5 eg5Var2 = this.U0;
        ms9 ms9Var = this.E0;
        k9b k9bVar = this.Y0;
        ne6 ne6Var = this.m0;
        s8b s8bVar = this.R0;
        j49 j49Var = this.P0;
        if (!z) {
            a9b a9bVar2 = this.C0;
            if (a9bVar2 != null) {
                a9bVar2.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            k9bVar.setAlpha(((i != 1 || j9bVar.i()) && i != 2) ? 0.0f : 1.0f);
            j9bVar.setAlpha((i == 0 || (i == 1 && j9bVar.i())) ? 1.0f : 0.0f);
            j49Var.setAlpha(i == 0 ? 1.0f : 0.0f);
            j49Var.setTranslationY(i == 0 ? 0.0f : gm.L(16.0f));
            ms9Var.setAlpha(i == 0 ? 1.0f : 0.0f);
            s8bVar.setAlpha((i != 0 || G()) ? 0.0f : 1.0f);
            s8bVar.setTranslationY((i != 0 || G()) ? gm.L(16.0f) : 0.0f);
            eg5Var2.setAlpha((i == 0 && this.b2 && !G()) ? 1.0f : 0.0f);
            eg5Var.setAlpha((i == 0 && !this.b2 && G()) ? 0.6f : 0.0f);
            ne6Var.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
            ne6Var.setTranslationY((i == 1 || i == 2) ? 0.0f : gm.L(12.0f));
            l9bVar.setAlpha(i == 2 ? 0.0f : 1.0f);
            s09Var.setAlpha((i == 1 && this.P1 == 1) ? 1.0f : 0.0f);
            a91Var.setAlpha((i != 1 || (this.P1 != 1 && ((g6bVar2 = this.L1) == null || TextUtils.isEmpty(g6bVar2.y)))) ? 0.0f : 1.0f);
            boolean z3 = true;
            yq3Var.setAlpha(i == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.j1;
            if (imageView2 != null) {
                imageView2.setAlpha((i == 1 && (g6bVar = this.L1) != null && g6bVar.u) ? 1.0f : 0.0f);
                z3 = true;
            }
            lqbVar2.setAlpha(i == z3 ? 1.0f : 0.0f);
            lqbVar.setAlpha(i == 2 ? 1.0f : 0.0f);
            lkaVar2.setAlpha((i == z3 || i == 2) ? 1.0f : 0.0f);
            b61Var2.setAlpha(i == 2 ? 1.0f : 0.0f);
            L(b, i);
            return;
        }
        this.j2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        a9b a9bVar3 = this.C0;
        if (a9bVar3 != null) {
            b61Var = b61Var2;
            lkaVar = lkaVar2;
            i2 = 1;
            arrayList.add(ObjectAnimator.ofFloat(a9bVar3, (Property<a9b, Float>) View.ALPHA, i == 0 ? 1.0f : 0.0f));
        } else {
            b61Var = b61Var2;
            lkaVar = lkaVar2;
            i2 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i2];
        fArr[0] = ((i != i2 || j9bVar.i()) && i != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(k9bVar, (Property<k9b, Float>) property, fArr));
        float[] fArr2 = new float[i2];
        fArr2[0] = (i == 0 || (i == i2 && j9bVar.i())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(j9bVar, (Property<j9b, Float>) property, fArr2));
        float[] fArr3 = new float[i2];
        fArr3[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(j49Var, (Property<j49, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i2];
        fArr4[0] = i == 0 ? 0.0f : gm.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(j49Var, (Property<j49, Float>) property2, fArr4));
        float[] fArr5 = new float[i2];
        fArr5[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(ms9Var, (Property<ms9, Float>) property, fArr5));
        float[] fArr6 = new float[i2];
        fArr6[0] = (i != 0 || G()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(s8bVar, (Property<s8b, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(s8bVar, (Property<s8b, Float>) property2, (i != 0 || G()) ? gm.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(eg5Var2, (Property<eg5, Float>) property, (i == 0 && this.b2 && !G()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(eg5Var, (Property<eg5, Float>) property, (i == 0 && !this.b2 && G()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) property, ((i == 1 && ((g6bVar6 = this.L1) == null || g6bVar6.J0 == 0)) || i == 2) ? 1.0f : 0.0f));
        if (i == 1 && ((g6bVar5 = this.L1) == null || g6bVar5.J0 == 0)) {
            c = 2;
        } else {
            c = 2;
            if (i != 2) {
                L = gm.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(l9bVar, (Property<l9b, Float>) property, i != c ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property, (i != 1 || i == c) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(b61Var, (Property<b61, Float>) property, i != c ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(lqbVar2, (Property<lqb, Float>) property, i != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(lqbVar, (Property<lqb, Float>) property, i != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property, (i == 1 || this.P1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property, (i == 1 || (this.P1 != 1 && ((g6bVar4 = this.L1) == null || TextUtils.isEmpty(g6bVar4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property, i != 1 ? 1.0f : 0.0f));
                imageView = this.j1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i == 1 && (g6bVar3 = this.L1) != null && g6bVar3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<b1d, Float>) property, 0.0f));
                this.j2.playTogether(arrayList);
                this.j2.addListener(new w8b(this, b, i));
                this.j2.setDuration(460L);
                this.j2.setInterpolator(d53.h);
                this.j2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(l9bVar, (Property<l9b, Float>) property, i != c ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property, (i != 1 || i == c) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(b61Var, (Property<b61, Float>) property, i != c ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(lqbVar2, (Property<lqb, Float>) property, i != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(lqbVar, (Property<lqb, Float>) property, i != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property, (i == 1 || this.P1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property, (i == 1 || (this.P1 != 1 && ((g6bVar4 = this.L1) == null || TextUtils.isEmpty(g6bVar4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property, i != 1 ? 1.0f : 0.0f));
        imageView = this.j1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<b1d, Float>) property, 0.0f));
        this.j2.playTogether(arrayList);
        this.j2.addListener(new w8b(this, b, i));
        this.j2.setDuration(460L);
        this.j2.setInterpolator(d53.h);
        this.j2.start();
    }

    public final void J(Runnable runnable, long j) {
        if (this.T1 || this.L1 == null) {
            return;
        }
        b7b b7bVar = this.h2;
        if (b7bVar != null) {
            gm.r(b7bVar);
        }
        this.i2 = true;
        this.T1 = true;
        this.h2 = new b7b((Object) this, (Object) runnable, (byte) 4);
        k9b k9bVar = this.Y0;
        k9bVar.setAlpha(0.0f);
        k9bVar.setVisibility(0);
        k9bVar.n(this.L1, this.h2, j);
        k9bVar.q(this.L1, false);
        gm.d3(this.h2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f0, code lost:
    
        if (r0.k == false) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K() {
        g6b g6bVar;
        g6b g6bVar2;
        g6b g6bVar3;
        z8b z8bVar;
        g6b g6bVar4;
        z8b z8bVar2;
        z8b z8bVar3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            l9b l9bVar = this.d1;
            if (l9bVar != null && l9bVar.O1) {
                l9bVar.N1 = false;
                l9bVar.z(false, false);
                return false;
            }
            if (this.R1) {
                j49 j49Var = this.P0;
                if (j49Var.s0) {
                    j49Var.s0 = false;
                    j49Var.w0 = SystemClock.elapsedRealtime();
                    j49Var.v0 = true;
                    ((v8b) j49Var.a).e(false);
                    j49Var.K.c(false);
                    j49Var.L.c(false);
                    j49Var.M.c(false);
                    j49Var.invalidate();
                    return false;
                }
            } else if (!this.Q1 && !l9bVar.p()) {
                r8b r8bVar = this.e1;
                if (r8bVar.N) {
                    r8bVar.c(false, true);
                    return false;
                }
                wt4 wt4Var = this.N0;
                if (wt4Var != null) {
                    r7 r7Var = wt4Var.H;
                    if (r7Var == null || !r7Var.w()) {
                        c(false);
                        this.n2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = r7Var.getSearchField();
                    if (wt4Var.w.c()) {
                        gm.t1(searchField);
                        return false;
                    }
                    wt4Var.y.B(r7Var.T(true));
                    return false;
                }
                if (this.h0 != 0 || (z8bVar3 = this.w1) == null || !z8bVar3.x0()) {
                    if (this.h0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    byte b = this.g0;
                    j9b j9bVar = this.B0;
                    if (b == 0) {
                        ArrayList arrayList = j9bVar.h;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((bm2) obj).n != null) {
                                j9bVar.b();
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.g0 == 1 && (((g6bVar2 = this.L1) == null || (!g6bVar2.n && !g6bVar2.u)) && !this.v0)) {
                        if (g6bVar2 != null && g6bVar2.g && ((z8bVar2 = this.w1) == null || !z8bVar2.r0())) {
                            g6b g6bVar5 = this.L1;
                            if (!g6bVar5.j) {
                            }
                        }
                        z8b z8bVar4 = this.w1;
                        if (z8bVar4 == null || !z8bVar4.x0()) {
                            if (this.w0 == 0 && (((this.M1 && !j9bVar.i() && (((z8bVar = this.w1) == null || !z8bVar.r0()) && ((g6bVar4 = this.L1) == null || g6bVar4.Z0 == null))) || !this.c1.h) && (((g6bVar3 = this.L1) == null || !g6bVar3.g || (!g6bVar3.n && !g6bVar3.u)) && !this.v0 && (g6bVar3 == null || !g6bVar3.o)))) {
                                I(0, true);
                                return false;
                            }
                            if (this.w0 != 0) {
                                o(true);
                                return false;
                            }
                            r63 r63Var = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r63Var, this.b);
                            String M0 = jb6.M0(2131751342, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            heVar.U = jb6.M0(2131747011, null);
                            g6b g6bVar6 = this.L1;
                            if (g6bVar6 != null && !g6bVar6.g && !g6bVar6.o) {
                                alertDialog$Builder.h(jb6.M0(g6bVar6.c ? 2131744339 : 2131744171, null), new m8b(this, (byte) 7));
                            }
                            g6b g6bVar7 = this.L1;
                            alertDialog$Builder.j(jb6.M0((g6bVar7 == null || !g6bVar7.c || g6bVar7.g) ? 2131751343 : 2131744372, null), new m8b(this, (byte) 8));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            heVar.show();
                            View c = heVar.c(-1);
                            if (c instanceof TextView) {
                                int i2 = cmb.p7;
                                anb.X((TextView) c, i2, r63Var);
                                fg0 Y = cmb.Y(on2.p(cmb.v0(i2, r63Var), 51), 6, 6);
                                wmb g = anb.g(i2, 51);
                                c.setBackground(Y);
                                anb.j(c, Y, null, g, r63Var);
                            }
                        }
                    }
                    if (this.g0 != 2 || (g6bVar = this.L1) == null || g6bVar.b0) {
                        o(true);
                        return true;
                    }
                    W();
                    I(1, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void L(int i, int i2) {
        long j;
        int i3;
        j49 j49Var = this.P0;
        if (i == 0) {
            t(false);
            j49Var.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            e(false, false);
            c0(false);
        }
        l9b l9bVar = this.d1;
        ne6 ne6Var = this.m0;
        if (i == 2) {
            this.u1.setVisibility(8);
            ne6Var.setVisibility(i2 == 1 ? 0 : 8);
            l9bVar.setVisibility(8);
            this.v1.setVisibility(8);
        }
        lec lecVar = this.b1;
        k9b k9bVar = this.Y0;
        if (i == 1) {
            this.c1.setVisibility(8);
            ne6Var.setVisibility(i2 == 2 ? 0 : 8);
            this.h1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setVisibility(8);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            k9bVar.setVisibility(i2 == 2 ? 0 : 8);
            this.a1.setVisibility(8);
            if (i2 != 2) {
                x();
                w();
            }
            this.q0.setVisibility(i2 == 2 ? 0 : 8);
            u();
            k3c k3cVar = this.q1;
            k3cVar.setAlpha(0.0f);
            k3cVar.setVisibility(8);
            lecVar.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        m78 m78Var = this.D1;
        if (i2 == 1) {
            g6b g6bVar = this.L1;
            if (g6bVar == null || !g6bVar.n) {
                s();
                F();
            }
            if (m78Var != null) {
                m78Var.setAllowTouch(false);
            }
            k9bVar.x(2, false);
            k9bVar.x(3, false);
            k9bVar.x(4, false);
            k9bVar.x(5, false);
            k9bVar.x(7, false);
            g6b g6bVar2 = this.L1;
            j = 0;
            lecVar.setVisibility((g6bVar2 == null || g6bVar2.h0 < 30000) ? 8 : 0);
            ne6Var.setAlpha(1.0f);
            ne6Var.setTranslationY(0.0f);
            g6b g6bVar3 = this.L1;
            l9bVar.setVisibility((g6bVar3 == null || g6bVar3.J0 == 0) ? 0 : 8);
        } else {
            j = 0;
        }
        if (i2 == 0 && this.W1) {
            B().setVisibility(0);
            or3 B = B();
            B.r.e(true, 0.0f);
            B.a(true);
            bi3 bi3Var = B.h;
            if (bi3Var != null) {
                gm.r(bi3Var);
            }
            bi3 bi3Var2 = new bi3(B, (byte) 16);
            B.h = bi3Var2;
            gm.d3(bi3Var2, 3500L);
            j49Var.h();
        }
        this.W1 = false;
        if (m78Var != null) {
            m78Var.setAllowTouch(i2 == 1 && ((i3 = this.h0) == -1 || i3 == 1));
        }
        if (l9bVar != null) {
            l9bVar.e0 = i2 != 1;
        }
        if (i2 == 1) {
            int i4 = this.c;
            hs6.d0(i4).D(0);
            hs6.d0(i4).X0(false, true, false, 0);
            hs6.d0(i4).X0(false, true, false, 2);
            h4b N1 = oc7.r1(i4).N1();
            if (N1.Q == j) {
                N1.R();
            }
            oc7.r1(i4).N1().T();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x053f  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(int i, int i2) {
        j9b j9bVar;
        ?? r8;
        int i3;
        CharSequence charSequence;
        SpannableStringBuilder append;
        String str;
        g6b g6bVar;
        boolean z;
        String str2;
        bu5 bu5Var;
        boolean z2;
        g6b g6bVar2;
        boolean z3;
        CharSequence charSequence2;
        boolean z4;
        g6b g6bVar3;
        boolean z5;
        xy n;
        g6b g6bVar4;
        ncc textureView;
        g6b g6bVar5;
        j9b j9bVar2 = this.B0;
        if (i2 == 0) {
            Z(false);
            j49 j49Var = this.P0;
            j49Var.setVisibility(0);
            if (j49Var != null) {
                j49Var.g(false);
            }
            this.R0.setVisibility(0);
            b1d b1dVar = this.W0;
            b1dVar.setVisibility(0);
            b1dVar.setAlpha(0.0f);
            this.K0.a(0L, true);
            g6b g6bVar6 = this.L1;
            if (g6bVar6 != null) {
                g6bVar6.i(false);
                this.L1 = null;
            }
            if (j9bVar2 != null) {
                j9bVar2.b();
                j49Var.e(false, 0.0f);
            }
        }
        if (i == 0) {
            d0(null);
            a0(new f8b(this, (byte) 18));
            or3 or3Var = this.O0;
            if (or3Var != null) {
                or3Var.setVisibility(8);
            }
            this.X0.f(true);
            hg5 hg5Var = this.m1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
        }
        lqb lqbVar = this.a1;
        ne6 ne6Var = this.m0;
        s09 s09Var = this.h1;
        yk8 yk8Var = this.c1;
        k9b k9bVar = this.Y0;
        l9b l9bVar = this.d1;
        lka lkaVar = this.q0;
        int i4 = this.c;
        if (i2 == 1 || i == 1) {
            g6b g6bVar7 = i2 == 1 ? this.L1 : null;
            yq3 yq3Var = this.f1;
            yq3Var.setEntry(g6bVar7);
            int i5 = this.P1;
            j9bVar = j9bVar2;
            a91 a91Var = this.k1;
            if (i5 == 1) {
                s09Var.setVisibility(0);
                g6b g6bVar8 = this.L1;
                e0(g6bVar8 != null && g6bVar8.Y, false);
                a91Var.setVisibility(0);
                k9bVar.x(-9982, false);
                ((ae8) a91Var.c).a(k9bVar.j(), false);
                lkaVar.setRightPadding(gm.L(144.0f));
                r8 = 0;
            } else {
                g6b g6bVar9 = this.L1;
                if (g6bVar9 == null || TextUtils.isEmpty(g6bVar9.y)) {
                    r8 = 0;
                    lkaVar.setRightPadding(gm.L(48.0f));
                } else {
                    s09Var.setVisibility(8);
                    r8 = 0;
                    a91Var.setVisibility(0);
                    ((ae8) a91Var.c).a(true, false);
                    lkaVar.setRightPadding(gm.L(48.0f));
                }
            }
            yq3Var.setVisibility(r8);
            g6b g6bVar10 = this.L1;
            if (g6bVar10 == null || !g6bVar10.u) {
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                E().setVisibility(r8);
                n0(r8);
            }
            yk8Var.setVisibility(r8);
            k9bVar.setVisibility(r8);
            g6b g6bVar11 = this.L1;
            l9bVar.setVisibility(((g6bVar11 == null || g6bVar11.J0 == 0) && this.w0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Z0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            g6b g6bVar12 = this.L1;
            layoutParams.bottomMargin = gm.L(((g6bVar12 == null || g6bVar12.J0 == 0) && this.w0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            ne6Var.setVisibility(0);
            ne6Var.clearFocus();
            g6b g6bVar13 = this.L1;
            l9bVar.A(g6bVar13 == null ? 86400 : g6bVar13.I0, false);
            l9bVar.setPeriodVisible(!oc7.r1(i4).H3() && ((g6bVar = this.L1) == null || !g6bVar.g));
            g6b g6bVar14 = this.L1;
            l9bVar.setHasRoundVideo((g6bVar14 == null || g6bVar14.o0 == null) ? false : true);
            if (l9bVar == null) {
                i3 = i4;
                charSequence = "";
            } else {
                g6b g6bVar15 = this.L1;
                if (g6bVar15 == null || !g6bVar15.n) {
                    i3 = i4;
                    charSequence = "";
                    l9bVar.v(null, null);
                } else {
                    TLRPC.Peer peer = g6bVar15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        charSequence = "";
                        String r = m9c.r(oc7.r1(i4).W1(Long.valueOf(peer.user_id)));
                        g6b g6bVar16 = this.L1;
                        append = new SpannableStringBuilder(k47.g6()).append((CharSequence) " ").append((CharSequence) r);
                        g6bVar16.p = append;
                    } else {
                        charSequence = "";
                        TLRPC.Chat L0 = oc7.r1(i4).L0(Long.valueOf(-pg3.n(peer)));
                        CharSequence charSequence3 = L0 == null ? charSequence : L0.title;
                        g6b g6bVar17 = this.L1;
                        append = new SpannableStringBuilder(k47.g6()).append((CharSequence) " ").append(charSequence3);
                        g6bVar17.p = append;
                    }
                    String str3 = this.L1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(jb6.M0(2131744424, null));
                        i3 = i4;
                        spannableString.setSpan(new i37((byte) 4), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i3 = i4;
                        str = str3;
                    }
                    l9bVar.v(append, str);
                }
            }
            g6b g6bVar18 = this.L1;
            boolean z6 = (g6bVar18 != null && g6bVar18.v() && this.L1.t()) ? false : true;
            boolean z7 = lqbVar.k0;
            lqbVar.k0 = z6;
            lqbVar.j0.f(z6, true);
            lqbVar.invalidate();
        } else {
            j9bVar = j9bVar2;
            i3 = i4;
            charSequence = "";
        }
        b61 b61Var = this.v1;
        lqb lqbVar2 = this.u1;
        int i6 = 2;
        if (i2 == 2 || i == 2) {
            z = false;
            lkaVar.setVisibility(0);
            lqbVar2.setVisibility(0);
            g6b g6bVar19 = this.L1;
            if (g6bVar19 == null || !g6bVar19.b0) {
                str2 = null;
            } else {
                str2 = null;
                lkaVar.l(jb6.M0(2131746088, null), false);
            }
            ne6Var.setVisibility(0);
            b61Var.setVisibility(0);
            i6 = 2;
        } else {
            z = false;
            str2 = null;
        }
        if (i2 == i6) {
            lkaVar.l(jb6.M0(2131746088, str2), z);
        }
        r8b r8bVar = this.e1;
        if (i2 == 1) {
            this.O1 = z;
            g6b g6bVar20 = this.L1;
            boolean z8 = (g6bVar20 == null || g6bVar20.J0 == 0) ? false : true;
            boolean z9 = g6bVar20 != null && g6bVar20.g;
            String M0 = jb6.M0(z9 ? 2131751291 : z8 ? 2131743491 : 2131747984, null);
            boolean z10 = !z8;
            boolean z11 = z9;
            if (TextUtils.equals(M0, yk8Var.d) && z10 == yk8Var.e) {
                z3 = z8;
            } else {
                yk8Var.removeView(yk8Var.c);
                z3 = z8;
                Context context = yk8Var.getContext();
                yk8Var.d = M0;
                yk8Var.e = z10;
                xk8 xk8Var = new xk8(yk8Var, context, M0, z10);
                yk8Var.c = xk8Var;
                xk8Var.setContentDescription(M0);
                yk8Var.addView(yk8Var.c, qoe.c(-2.0f, -2));
                yk8Var.e();
            }
            lqbVar2.setVisibility(8);
            b61Var.setVisibility(8);
            if (!this.i2) {
                g6b g6bVar21 = this.L1;
                if (g6bVar21 == null || !g6bVar21.u) {
                    k9bVar.set(g6bVar21);
                } else {
                    k9bVar.l(g6bVar21);
                }
            }
            this.i2 = false;
            l9bVar.f.getEditText().setOnPremiumMenuLockClickListener(oc7.r1(i3).f5() ? null : new f8b(this, (byte) 19));
            r8bVar.setVisibility(this.I1 == null ? 8 : 0);
            ArrayList arrayList = this.I1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.K1;
                ArrayList arrayList3 = this.J1;
                r8bVar.c(false, false);
                r8bVar.c = arrayList;
                r8bVar.d = arrayList2;
                r8bVar.e = arrayList3;
                r8bVar.x = new uib(Integer.toString(arrayList.size()), 20.0f, gm.n1("fonts/num.otf"));
                r8bVar.L = new uib(jb6.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                r8bVar.b.g3.O(false);
                r8bVar.setSelected(this.I1.indexOf(this.L1));
            }
            lqbVar.setMaxCount((z3 || z11 || this.I1 != null || ((g6bVar5 = this.L1) != null && (g6bVar5.v() || !this.L1.K))) ? 1 : 3);
            if (i != 2) {
                g6b g6bVar22 = this.L1;
                if (g6bVar22 == null || !(g6bVar22.c || g6bVar22.g || this.v0)) {
                    l9bVar.W = true;
                    charSequence2 = charSequence;
                    l9bVar.f.setText(charSequence2);
                    g6b g6bVar23 = this.L1;
                    yk8Var.d(4, g6bVar23 != null || ((!g6bVar23.u || g6bVar23.K) && !g6bVar23.v()));
                    boolean z12 = e21.a;
                    yk8Var.d(3, false);
                    if (!this.O1 && !l9bVar.o()) {
                        h4b N1 = oc7.r1(i3).N1();
                        int z13 = z();
                        n = N1.n();
                        if (n != null || !n.a(N1.a, z13) || ((g6bVar4 = this.L1) != null && (g6bVar4.g || g6bVar4.J0 != 0))) {
                            z4 = true;
                            yk8Var.setShareEnabled(z4);
                            g6b g6bVar24 = this.L1;
                            s09Var.setImageResource((g6bVar24 == null && g6bVar24.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                            k9bVar.setVisibility(0);
                            lqbVar.setVisibility(0);
                            lkaVar.setVisibility(0);
                            lkaVar.setTranslationX(0.0f);
                            g6bVar3 = this.L1;
                            if (g6bVar3 == null) {
                                if (g6bVar3.J0 != 0) {
                                    lkaVar.l(charSequence2, false);
                                } else if (g6bVar3.g) {
                                    bu5Var = null;
                                    lkaVar.l(jb6.M0(2131746087, null), false);
                                    z2 = true;
                                } else if (g6bVar3.u) {
                                    lkaVar.l(jb6.M0(2131746085, null), false);
                                } else if (g6bVar3.n) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    int i7 = i3;
                                    ed0 ed0Var = new ed0(32.0f, i7, lkaVar);
                                    lkaVar.setTranslationX(-gm.L(6.0f));
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(ed0Var, 0, 1, 33);
                                    if (this.L1.q instanceof TLRPC.TL_peerUser) {
                                        TLRPC.User W1 = oc7.r1(i7).W1(Long.valueOf(this.L1.q.user_id));
                                        ed0Var.e(W1);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append((CharSequence) m9c.r(W1));
                                    } else {
                                        TLRPC.Chat L02 = oc7.r1(i7).L0(Long.valueOf(-pg3.n(this.L1.q)));
                                        ed0Var.b(L02);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append(L02 != null ? L02.title : charSequence2);
                                    }
                                    lkaVar.l(spannableStringBuilder, false);
                                } else {
                                    z5 = false;
                                }
                                z2 = true;
                                bu5Var = null;
                            } else {
                                z5 = false;
                            }
                            bu5Var = null;
                            lkaVar.l(jb6.M0(2131746086, null), z5);
                            z2 = true;
                        }
                    }
                    z4 = false;
                    yk8Var.setShareEnabled(z4);
                    g6b g6bVar242 = this.L1;
                    s09Var.setImageResource((g6bVar242 == null && g6bVar242.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    k9bVar.setVisibility(0);
                    lqbVar.setVisibility(0);
                    lkaVar.setVisibility(0);
                    lkaVar.setTranslationX(0.0f);
                    g6bVar3 = this.L1;
                    if (g6bVar3 == null) {
                    }
                    bu5Var = null;
                    lkaVar.l(jb6.M0(2131746086, null), z5);
                    z2 = true;
                } else {
                    if (g6bVar22.P0 != null) {
                        x();
                        s();
                        F();
                    }
                    g6b g6bVar25 = this.L1;
                    if (g6bVar25.K && g6bVar25.a1 != null && (textureView = k9bVar.getTextureView()) != null) {
                        textureView.setDelegate(new m8b(this, (byte) 6));
                    }
                    l9bVar.setText(this.L1.C0);
                }
            }
            charSequence2 = charSequence;
            g6b g6bVar232 = this.L1;
            yk8Var.d(4, g6bVar232 != null || ((!g6bVar232.u || g6bVar232.K) && !g6bVar232.v()));
            boolean z122 = e21.a;
            yk8Var.d(3, false);
            if (!this.O1) {
                h4b N12 = oc7.r1(i3).N1();
                int z132 = z();
                n = N12.n();
                if (n != null) {
                }
                z4 = true;
                yk8Var.setShareEnabled(z4);
                g6b g6bVar2422 = this.L1;
                s09Var.setImageResource((g6bVar2422 == null && g6bVar2422.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                k9bVar.setVisibility(0);
                lqbVar.setVisibility(0);
                lkaVar.setVisibility(0);
                lkaVar.setTranslationX(0.0f);
                g6bVar3 = this.L1;
                if (g6bVar3 == null) {
                }
                bu5Var = null;
                lkaVar.l(jb6.M0(2131746086, null), z5);
                z2 = true;
            }
            z4 = false;
            yk8Var.setShareEnabled(z4);
            g6b g6bVar24222 = this.L1;
            s09Var.setImageResource((g6bVar24222 == null && g6bVar24222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            k9bVar.setVisibility(0);
            lqbVar.setVisibility(0);
            lkaVar.setVisibility(0);
            lkaVar.setTranslationX(0.0f);
            g6bVar3 = this.L1;
            if (g6bVar3 == null) {
            }
            bu5Var = null;
            lkaVar.l(jb6.M0(2131746086, null), z5);
            z2 = true;
        } else {
            bu5Var = null;
            z2 = true;
        }
        if (i == z2) {
            bu5 bu5Var2 = l9bVar.V0;
            if (bu5Var2 != null) {
                bu5Var2.u();
                l9bVar.V0 = bu5Var;
            }
            this.l1.f(z2);
            if (r8bVar.N) {
                r8bVar.c(false, z2);
            }
        }
        if (i2 == 2 && (g6bVar2 = this.L1) != null) {
            long j = g6bVar2.e0;
            if (j < 0) {
                g6bVar2.e0 = 0L;
                j = 0;
            }
            this.N1 = j;
            long duration = k9bVar.getDuration() < 100 ? this.L1.h0 : k9bVar.getDuration();
            g6b g6bVar26 = this.L1;
            if (g6bVar26.h0 <= 0) {
                g6bVar26.h0 = duration;
            }
            File file = g6bVar26.Z0;
            if (file == null) {
                file = g6bVar26.L;
            }
            String absolutePath = file.getAbsolutePath();
            g6b g6bVar27 = this.L1;
            this.u1.o(false, absolutePath, g6bVar27.h0, g6bVar27.P);
            g6b g6bVar28 = this.L1;
            float f = duration;
            long j2 = (long) (g6bVar28.Z * f);
            long j3 = (long) (g6bVar28.a0 * f);
            lqbVar2.a1 = j2;
            lqbVar2.b1 = j3;
            gqb gqbVar = lqbVar2.h;
            byte b = 1;
            if (gqbVar != null) {
                gqbVar.a(true);
            }
            o6b o6bVar = new o6b(this, b);
            lqbVar2.setDelegate(new oo8(o6bVar, (byte) 17));
            float max = (this.N1 / Math.max(1L, duration)) * 0.96f;
            lqbVar2.setVideoLeft(max);
            lqbVar2.setVideoRight(0.04f + max);
            o6bVar.a(Boolean.TRUE, Float.valueOf(max));
        }
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.setAllowTouch(false);
        }
        hg5 hg5Var2 = this.n1;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
        u31.e();
        if (l9bVar != null) {
            jc1 jc1Var = l9bVar.f;
            jc1Var.d();
            jc1Var.k(true);
            l9bVar.e0 = true;
        }
        if (k9bVar != 0) {
            k9bVar.x(8, i2 != 1);
        }
        z8b z8bVar = this.w1;
        if (z8bVar != null) {
            z8bVar.setCoverPreview(i2 != 1);
        }
        hg5 hg5Var3 = this.o1;
        if (hg5Var3 != null) {
            hg5Var3.f(true);
        }
        j9bVar.setPreview(i2 == 1 && j9bVar.i());
    }

    public final void N() {
        this.d = true;
        this.w = false;
        if (this.K) {
            i9b i9bVar = this.i0;
            i9bVar.setAlpha(1.0f);
            i9bVar.setTranslationX(0.0f);
            i9bVar.setTranslationY(0.0f);
            this.j0.setAlpha(1.0f);
            this.l0.setAlpha(1.0f);
            this.n.setBackgroundColor(-16777216);
            if (this.g0 == 2) {
                this.v1.setAlpha(1.0f);
            }
        }
        f8b f8bVar = this.y2;
        if (f8bVar != null) {
            f8bVar.run();
            this.y2 = null;
        } else {
            O();
        }
        g6b g6bVar = this.L1;
        if (g6bVar != null) {
            if (g6bVar.n) {
                s();
                F();
                q();
            } else if (g6bVar.u) {
                if (g6bVar.K) {
                    this.Y0.t(g6bVar, null, 0L);
                }
                q();
            }
        }
    }

    public final void O() {
        c99 c99Var;
        boolean z = false;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.y2 = new f8b(this, (byte) 3);
            }
        }
        l9b l9bVar = this.d1;
        if (l9bVar != null) {
            l9bVar.f.s();
        }
        j49 j49Var = this.P0;
        if (j49Var != null) {
            j49Var.h();
        }
        byte b = 1;
        zk8 zk8Var = this.p1;
        if (zk8Var != null) {
            h4b N1 = oc7.r1(zk8Var.a).N1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) N1.i.f(z8c.h(N1.a).n);
            zk8Var.b = N1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            zk8Var.c.invalidate();
        }
        z8b z8bVar = this.w1;
        if (z8bVar != null && (c99Var = z8bVar.E0.d) != null) {
            c99Var.postRunnable(c99Var.x);
        }
        k9b k9bVar = this.Y0;
        if (k9bVar != null) {
            k9bVar.x(0, false);
        }
        tr3 tr3Var = oc7.r1(this.c).N1().w;
        if (tr3Var.c || tr3Var.d) {
            return;
        }
        tr3Var.d = true;
        pr3 pr3Var = new pr3(tr3Var, b);
        cf7 Y = cf7.Y(tr3Var.a);
        Y.a.c(new np6((Object) Y, z, (Object) pr3Var, (byte) 18));
    }

    public final void P(int i, int i2) {
        z8b z8bVar;
        g9b g9bVar;
        h9b h9bVar;
        z8b z8bVar2;
        if (i2 == 0) {
            this.o0.setVisibility(8);
        }
        if (i == 0 && (z8bVar2 = this.w1) != null) {
            z8bVar2.setVisibility(8);
        }
        if (i == -1) {
            this.d1.setVisibility(8);
            this.h1.setVisibility(i2 == 2 ? 0 : 8);
            this.k1.setVisibility(i2 == 2 ? 0 : 8);
            this.f1.setVisibility(i2 == 2 ? 0 : 8);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(i2 == 2 ? 0 : 8);
            }
            this.a1.setVisibility(i2 == 2 ? 0 : 8);
            this.q0.setVisibility(8);
        }
        boolean z = true;
        this.Y0.setAllowCropping(i2 == -1);
        if ((i2 == 0 || i == 0) && (z8bVar = this.w1) != null) {
            z8bVar.T0.setLayerType(0, null);
        }
        m78 m78Var = this.D1;
        if (m78Var != null) {
            if (i2 != 1 && i2 != -1) {
                z = false;
            }
            m78Var.setAllowTouch(z);
        }
        if (i2 == 3) {
            g9b g9bVar2 = this.s1;
            if (g9bVar2 != null) {
                g9bVar2.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (g9bVar = this.s1) != null) {
            g9bVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            g9b g9bVar3 = this.s1;
            g9bVar3.y = null;
            b43 b43Var = g9bVar3.f;
            b43Var.M = null;
            b43Var.d = null;
            b43Var.K = false;
            g9bVar3.d.setVisibility(8);
            g9bVar3.a.setCropEditorDrawing(null);
        }
        if (i2 == 4) {
            h9b h9bVar2 = this.t1;
            if (h9bVar2 != null) {
                h9bVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i != 4 || (h9bVar = this.t1) == null) {
            return;
        }
        h9bVar.setVisibility(8);
        this.t1.setAppearProgress(0.0f);
        h9b h9bVar3 = this.t1;
        h9bVar3.b = null;
        b43 b43Var2 = h9bVar3.h;
        b43Var2.M = null;
        b43Var2.d = null;
        b43Var2.K = false;
        h9bVar3.e.setVisibility(8);
        h9bVar3.setVisibility(8);
    }

    public final void Q(p9b p9bVar) {
        xy n;
        u9b u9bVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (oc7.r1(i).u2()) {
            h5.b(i);
            return;
        }
        int i2 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (u9bVar = this.n) != null && u9bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gm.s3(windowManager, u9bVar, layoutParams);
            windowManager.addView(u9bVar, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(y());
        if (this.w0 == 0 && (n = oc7.r1(i).N1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        I(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (p9bVar != null) {
            this.G = p9bVar;
            this.K = p9bVar.a;
            rectF.set(p9bVar.c);
            this.H = p9bVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = gm.L(100.0f);
            Point point = gm.q;
            rectF.set(0.0f, L, point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
        }
        n9b n9bVar = this.r;
        n9bVar.c();
        boolean z = this.K;
        if (!z && z) {
            i2 = -14737633;
        }
        this.i0.setBackgroundColor(i2);
        n9bVar.setTranslationX(0.0f);
        n9bVar.setTranslationY(0.0f);
        n9bVar.b(0.0f);
        n9bVar.setScaleX(1.0f);
        n9bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gm.e2(this.b);
        d(1.0f, true, new f8b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(o9b o9bVar, g6b g6bVar, long j) {
        View view;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (oc7.r1(i).u2()) {
            h5.b(i);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (view = this.n) != null && view.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gm.s3(windowManager, view, layoutParams);
            windowManager.addView(view, layoutParams);
            f0();
        }
        this.L1 = g6bVar;
        this.P1 = g6bVar.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (o9bVar != null) {
            this.G = o9bVar;
            this.K = o9bVar.a;
            rectF.set(o9bVar.c);
            this.H = o9bVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = gm.L(100.0f);
            Point point = gm.q;
            rectF.set(0.0f, L, point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
        }
        n9b n9bVar = this.r;
        n9bVar.c();
        boolean z = this.K;
        this.i0.setBackgroundColor((z || !z) ? 0 : -14737633);
        n9bVar.setTranslationX(0.0f);
        n9bVar.setTranslationY(0.0f);
        n9bVar.b(0.0f);
        n9bVar.setScaleX(1.0f);
        n9bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gm.e2(this.b);
        g6b g6bVar2 = this.L1;
        if (g6bVar2 != null) {
            this.d1.setText(g6bVar2.C0);
        }
        J(new q8b(this, r2), j);
        I(this.L1.b0 ? (byte) 2 : (byte) 1, false);
        k0(-1, false, false);
        this.c1.b(false, false);
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void S() {
        bu5 bu5Var;
        byte b = 1;
        k9b k9bVar = this.Y0;
        if (k9bVar != null) {
            k9bVar.x(4, true);
        }
        l9b l9bVar = this.d1;
        if (l9bVar != null && (bu5Var = l9bVar.V0) != null) {
            bu5Var.u();
            l9bVar.V0 = null;
        }
        kj8 kj8Var = new kj8((d) new b9b(this, (byte) 1), 14, false);
        kj8Var.setOnDismissListener(new p8b(this, b));
        kj8Var.show();
    }

    public final void T(o9b o9bVar, g6b g6bVar) {
        xy n;
        u9b u9bVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (oc7.r1(i).u2()) {
            h5.b(i);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (u9bVar = this.n) != null && u9bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gm.s3(windowManager, u9bVar, layoutParams);
            windowManager.addView(u9bVar, layoutParams);
            f0();
        }
        this.L1 = g6bVar;
        c8b.a(i, g6bVar);
        g6b g6bVar2 = this.L1;
        int i2 = (g6bVar2 == null || !g6bVar2.K) ? 0 : 1;
        this.P1 = i2;
        this.t0.g = g6bVar2 != null && g6bVar2.u && i2 == 1;
        if (this.w0 == 0 && (n = oc7.r1(i).N1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        RectF rectF = this.I;
        if (o9bVar != null) {
            this.G = o9bVar;
            this.K = o9bVar.a;
            rectF.set(o9bVar.c);
            this.H = o9bVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = gm.L(100.0f);
            Point point = gm.q;
            rectF.set(0.0f, L, point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
        }
        n9b n9bVar = this.r;
        n9bVar.c();
        boolean z = this.K;
        this.i0.setBackgroundColor((z || !z) ? 0 : -14737633);
        n9bVar.setTranslationX(0.0f);
        n9bVar.setTranslationY(0.0f);
        n9bVar.b(0.0f);
        n9bVar.setScaleX(1.0f);
        n9bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gm.e2(this.b);
        g6b g6bVar3 = this.L1;
        if (g6bVar3 != null) {
            this.d1.setText(g6bVar3.C0);
        }
        this.c1.b(true, false);
        I(1, false);
        k0(-1, false, false);
        d(1.0f, true, new f8b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        e99 e99Var = this.x1;
        if (e99Var != null) {
            e99Var.bringToFront();
        }
        View view = this.y1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.z1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.A1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.B1;
        if (view4 != null) {
            view4.bringToFront();
        }
        k3c k3cVar = this.q1;
        if (k3cVar != null) {
            k3cVar.bringToFront();
        }
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.bringToFront();
        }
        e78 e78Var = this.F1;
        if (e78Var != null) {
            e78Var.bringToFront();
        }
        g78 g78Var = this.G1;
        if (g78Var != null) {
            g78Var.bringToFront();
        }
        zk8 zk8Var = this.p1;
        if (zk8Var != null) {
            zk8Var.bringToFront();
        }
        wc1 wc1Var = this.r1;
        if (wc1Var != null) {
            wc1Var.bringToFront();
        }
    }

    public final void V(g6b g6bVar, boolean z) {
        g6b g6bVar2;
        boolean z2;
        if (g6bVar == null || this.Y0.getWidth() <= 0 || this.Y0.getHeight() <= 0) {
            return;
        }
        File file = z ? g6bVar.O0 : g6bVar.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.B0.i() ? this.B0 : this.Y0;
        float f = z ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f, f);
        gm.m0 = true;
        view.draw(canvas);
        gm.m0 = false;
        canvas.restore();
        Paint paint = new Paint(2);
        ncc textureView = this.Y0.getTextureView();
        if (g6bVar.K && !g6bVar.u && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f, f);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = g6bVar.Q0;
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
                fc4.g(e, true);
            }
        }
        File file3 = g6bVar.P0;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        z8b z8bVar = this.w1;
        if (z8bVar != null && z8bVar.H0 != null) {
            canvas.save();
            canvas.scale(f, f);
            z8b z8bVar2 = this.w1;
            z8bVar2.y0 = true;
            tv7 tv7Var = z8bVar2.H0;
            tv7Var.a = true;
            tv7Var.draw(canvas);
            z8b z8bVar3 = this.w1;
            z8bVar3.H0.a = false;
            z8bVar3.y0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w = g6b.w(this.c, "jpg");
        if (z) {
            g6bVar2 = g6bVar;
            z2 = z;
            Utilities.g.c(new aa7((Object) this, (Object) createBitmap, z2, (Object) w, (Object) g6bVar2, (byte) 22));
        } else {
            g6bVar2 = g6bVar;
            z2 = z;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z2 ? 95 : 99, new FileOutputStream(w));
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
        }
        if (!z2) {
            g6bVar2.N0 = w;
        }
        g6bVar2.b1 = createScaledBitmap;
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
        xy n;
        ?? r16;
        a8b a8bVar = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (a8bVar != null) {
            a8bVar.dismiss();
            this.r0 = null;
        }
        boolean z = this.O1;
        xx0 xx0Var = xx0.E;
        if (z) {
            yq3 yq3Var = this.f1;
            yq3Var.getClass();
            yq3Var.c(jb6.N0("VideoConvertFail"));
            xx0Var.a();
            xk8 xk8Var = this.c1.c;
            int i = -this.V1;
            this.V1 = i;
            gm.A3(i, xk8Var, null);
            return;
        }
        l9b l9bVar = this.d1;
        if (l9bVar != null && l9bVar.o()) {
            xx0Var.a();
            io ioVar = l9bVar.w;
            int i2 = -this.V1;
            this.V1 = i2;
            gm.A3(i2, ioVar, null);
            l9bVar.e();
            return;
        }
        g6b g6bVar = this.L1;
        int i3 = this.c;
        byte b = 0;
        if ((g6bVar == null || (!g6bVar.g && g6bVar.J0 == 0)) && (n = oc7.r1(i3).e0.n()) != null && n.a(i3, z())) {
            g0(n, false);
            return;
        }
        this.L1.D0 = oc7.r1(i3).f5();
        r63 r63Var = this.a;
        boolean z2 = true;
        if (l9bVar != null && !this.L1.D0) {
            CharSequence text = l9bVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((xkb[]) spannable.getSpans(0, text.length(), xkb.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new c41(this.n, r63Var).Q(R.raw.voip_invite, 36, gm.N2(jb6.M0(2131744267, null), cmb.Wc, 0, new f8b(this, (byte) 28), r63Var)).k(true);
                    int i4 = -this.V1;
                    this.V1 = i4;
                    gm.A3(i4, l9bVar, null);
                    return;
                }
            }
        }
        g6b g6bVar2 = this.L1;
        if (g6bVar2.g || g6bVar2.J0 != 0) {
            g6bVar2.l = false;
            f(null);
            o0();
            return;
        }
        if (this.O != 0) {
            g6bVar2.v0 = oc7.r1(i3).i1(this.O);
        }
        k9b k9bVar = this.Y0;
        k9bVar.x(3, true);
        a8b a8bVar2 = new a8b(this.b, this.L1.I0, r63Var);
        a8bVar2.R0(this.L1.E0);
        a8bVar2.Q0(this.L1.v0);
        a8bVar2.z1 = this.N;
        a8bVar2.O1 = new g8b(this, (byte) 15);
        a8bVar2.E0(!this.B0.i());
        ArrayList arrayList = this.J1;
        a8bVar2.N0(arrayList == null ? this.L1.r() : arrayList.size());
        a8bVar2.L0(false);
        CharSequence text2 = l9bVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (j6c j6cVar : (j6c[]) ((Spanned) text2).getSpans(0, text2.length(), j6c.class)) {
                if (j6cVar != null) {
                    try {
                        TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(Long.parseLong(j6cVar.getURL())));
                        if (W1 != null && !m9c.D(W1) && m9c.p(W1) != null && !arrayList2.contains(W1)) {
                            arrayList2.add(m9c.p(W1));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i5 = 0;
            int i6 = -1;
            while (i5 < text2.length()) {
                char charAt = text2.charAt(i5);
                boolean z3 = z2;
                if (charAt == '@') {
                    i6 = i5 + 1;
                } else if (charAt == ' ') {
                    if (i6 != -1) {
                        String charSequence = text2.subSequence(i6, i5).toString();
                        TLObject b2 = oc7.r1(i3).b2(charSequence);
                        if (b2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) b2;
                            if (!user.bot && !m9c.D(user) && user.id != 777000 && !m9c.B(user) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i6 = -1;
                }
                i5++;
                z2 = z3;
            }
            boolean z4 = z2;
            r16 = z4;
            if (i6 != -1) {
                String charSequence2 = text2.subSequence(i6, text2.length()).toString();
                TLObject b22 = oc7.r1(i3).b2(charSequence2);
                r16 = z4;
                if (b22 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) b22;
                    r16 = z4;
                    if (!user2.bot) {
                        r16 = z4;
                        if (!m9c.D(user2)) {
                            r16 = z4;
                            if (user2.id != 777000) {
                                r16 = z4;
                                if (!m9c.B(user2)) {
                                    r16 = z4;
                                    if (!arrayList2.contains(charSequence2)) {
                                        arrayList2.add(charSequence2);
                                        r16 = z4;
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
        a8bVar2.M1 = arrayList2;
        a8bVar2.Q1 = new g8b(this, (byte) 16);
        a8bVar2.R1 = new g8b(this, (byte) 17);
        a8bVar2.N1 = new m8b(this, (byte) 9);
        this.r0 = a8bVar2;
        g6b g6bVar3 = this.L1;
        if (g6bVar3.K) {
            if (k9bVar != null && !g6bVar3.f0 && this.g0 != 2) {
                g6bVar3.e0 = k9bVar.getCurrentPosition();
                g8b g8bVar = new g8b(this, (byte) 18);
                e99 e99Var = this.x1;
                View view = this.A1;
                View[] viewArr = new View[3];
                viewArr[0] = k9bVar;
                viewArr[r16] = e99Var;
                viewArr[2] = view;
                k9bVar.g(g8bVar, viewArr);
            }
            a8b a8bVar3 = this.r0;
            Bitmap bitmap = this.L1.g0;
            f8b f8bVar = new f8b(this, (byte) 20);
            if (bitmap != null) {
                a8bVar3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            a8bVar3.V1 = bitmapDrawable;
            a8bVar3.W1 = f8bVar;
            hs1 hs1Var = a8bVar3.l1;
            if (hs1Var != null) {
                for (View view2 : hs1Var.getViewPages()) {
                    if (view2 instanceof v7b) {
                        v7b v7bVar = (v7b) view2;
                        v7bVar.h(false);
                        v7bVar.f(false);
                    }
                }
            }
        }
        this.r0.setOnDismissListener(new p8b(this, b));
        this.r0.show();
    }

    public final void X(q9b q9bVar) {
        int i = 0;
        RectF rectF = this.I;
        if (q9bVar != null) {
            this.G = q9bVar;
            this.K = q9bVar.a;
            rectF.set(q9bVar.c);
            this.H = q9bVar.b;
        } else {
            this.G = null;
            this.K = false;
            float L = gm.L(100.0f);
            Point point = gm.q;
            rectF.set(0.0f, L, point.x, gm.L(100.0f) + point.y);
            this.H = gm.L(8.0f);
        }
        boolean z = this.K;
        if (!z && z) {
            i = -14737633;
        }
        this.i0.setBackgroundColor(i);
    }

    public final boolean Y() {
        Activity activity = this.b;
        if (activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, nm7.w1);
        return false;
    }

    public final void Z(boolean z) {
        if (!this.x2 || z) {
            byte b = 0;
            this.t2 = false;
            Activity activity = this.b;
            if (activity != null) {
                boolean z2 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.t2 = z2;
                if (z2) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    sn2 sn2Var = new sn2(new ColorDrawable(-14540254), mutate);
                    int L = gm.L(64.0f);
                    int L2 = gm.L(64.0f);
                    sn2Var.e = L;
                    sn2Var.f = L2;
                    this.B0.setCameraThumb(sn2Var);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, activity);
                        int i = cmb.K5;
                        alertDialog$Builder.l(R.raw.permission_request_camera, 72, cmb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747041, null));
                        he heVar = alertDialog$Builder.a;
                        heVar.U = S2;
                        alertDialog$Builder.j(jb6.M0(2131747033, null), new m8b(this, (byte) 12));
                        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
                        heVar.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, nm7.v1);
                    this.x2 = true;
                }
            }
            if (this.t2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                p();
            } else {
                CameraController.getInstance().initCamera(new f8b(this, b));
            }
        }
    }

    public final void a() {
        nm7.e().a(this, nm7.r2);
        int i = this.c;
        nm7.f(i).a(this, nm7.C5);
        nm7.f(i).a(this, nm7.d3);
    }

    public final void a0(Runnable runnable) {
        a9b a9bVar = this.C0;
        if (a9bVar == null || a9bVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new j2b(this, this.C0.getTextureView().getBitmap(), runnable, (byte) 10));
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k2 = null;
        }
        this.l2 = false;
        n9b n9bVar = this.r;
        float f = n9bVar.a;
        float f2 = n9bVar.b;
        n9bVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new dz1(this, f, f2, (byte) 6));
        this.k2.setDuration(340L);
        this.k2.setInterpolator(d53.h);
        this.k2.addListener(new x8b(this, (byte) 0));
        this.k2.start();
    }

    public final void b0(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setVisibility(0);
            view.animate().alpha(z ? 1.0f : 0.0f).setUpdateListener(new y8b(this, (byte) 1)).setListener(new qx((Object) this, z, (Object) view, (byte) 14)).setDuration(320L).setInterpolator(d53.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z ? 0 : 8);
            view.setAlpha(z ? 1.0f : 0.0f);
            m0();
        }
    }

    public final void c(boolean z) {
        or3 or3Var;
        this.L0 = z;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z) {
            wt4 wt4Var = this.N0;
            byte b = 0;
            if (wt4Var == null) {
                if (z) {
                    r(false);
                }
                wt4Var = this.N0;
                if (wt4Var == null) {
                    return;
                }
            }
            if (wt4Var.V) {
                this.r2 = new n8b(this, z, b);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            zna znaVar = this.p2;
            if (znaVar != null) {
                znaVar.d();
                this.p2 = null;
            }
            wt4 wt4Var2 = this.N0;
            if (wt4Var2 == null) {
                if (z) {
                    r(false);
                }
                wt4Var2 = this.N0;
                if (wt4Var2 == null) {
                    return;
                }
            }
            wt4Var2.L = false;
            if (z && (or3Var = this.O0) != null) {
                or3Var.a(false);
            }
            n9b n9bVar = this.r;
            if (n9bVar != null) {
                n9bVar.setImportantForAccessibility(z ? 4 : 0);
            }
            this.N0.setImportantForAccessibility(z ? 0 : 4);
            this.q2 = Boolean.valueOf(z);
            float translationY = this.N0.getTranslationY();
            u9b u9bVar = this.n;
            float height = z ? 0.0f : (u9bVar.getHeight() - this.N0.g()) + (gm.n * 2.5f);
            u9bVar.getHeight();
            wt4 wt4Var3 = this.N0;
            wt4Var3.L = !z;
            byte b2 = 1;
            this.l2 = this.k2 == null;
            byte b3 = 2;
            if (z) {
                zna znaVar2 = new zna(wt4Var3, zna.p, height);
                this.p2 = znaVar2;
                znaVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new z22(this, height, b3));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new o8b(this, b));
                this.o2.addListener(new x8b(this, b2));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(d53.h);
                this.o2.start();
                if (!this.T1) {
                    this.m2 = null;
                }
            }
            if (z || this.g0 != 0 || this.t2) {
                return;
            }
            p();
        }
    }

    public final void c0(boolean z) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f.updateViewLayout(this.n, layoutParams);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void d(float f, boolean z, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        n9b n9bVar = this.r;
        if (!z) {
            this.M = null;
            this.J = f;
            h();
            n9bVar.invalidate();
            this.n.invalidate();
            runnable.run();
            l();
            return;
        }
        this.Q.d();
        nm7.e().k(nm7.j1, 512);
        this.M = Float.valueOf(this.L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        this.F = ofFloat;
        byte b = 5;
        ofFloat.addUpdateListener(new o8b(this, b));
        this.F.addListener(new ok4(this, f, runnable, b));
        if (f < 1.0f && this.w) {
            this.F.setDuration(250L);
            this.F.setInterpolator(d53.h);
        } else if (f > 0.0f || n9bVar.a < gm.L(20.0f)) {
            this.F.setDuration(300L);
            this.F.setInterpolator(new l94());
        } else if (f >= 0.0f || !this.P) {
            this.F.setDuration(400L);
            this.F.setInterpolator(d53.h);
        } else {
            this.F.setDuration(200L);
            this.F.setInterpolator(d53.h);
            this.P = false;
        }
        this.F.start();
    }

    public final void d0(String str) {
        int i;
        nrb nrbVar = this.F0;
        nrbVar.clearAnimation();
        a9b a9bVar = this.C0;
        if ((a9bVar != null && a9bVar.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z = false;
        if (str == null) {
            b0(nrbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                nrbVar.setContentDescription(jb6.M0(2131754915, null));
                i = R.drawable.media_photo_flash_auto2;
            }
            nrbVar.setContentDescription(jb6.M0(2131754914, null));
            i = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                nrbVar.setContentDescription(jb6.M0(2131754913, null));
                i = R.drawable.media_photo_flash_on2;
            }
            nrbVar.setContentDescription(jb6.M0(2131754914, null));
            i = R.drawable.media_photo_flash_off2;
        }
        if (nrbVar.n != i) {
            nrbVar.n = i;
            ValueAnimator valueAnimator = nrbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                nrbVar.r = null;
            }
            nrbVar.setDrawable(i);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !G()) {
            z = true;
        }
        b0(nrbVar, z, true);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xy n;
        g6b g6bVar;
        int i3 = nm7.r2;
        j49 j49Var = this.P0;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (i == i3) {
            if (j49Var != null) {
                j49Var.h();
            }
            if (this.n2 == null || MediaController.c2 == null) {
                return;
            }
            for (int i4 = 0; i4 < MediaController.c2.size(); i4++) {
                yn6 yn6Var = (yn6) MediaController.c2.get(i4);
                int i5 = yn6Var.a;
                yn6 yn6Var2 = this.n2;
                if (i5 == yn6Var2.a && yn6Var.b == yn6Var2.b) {
                    this.n2 = yn6Var;
                    return;
                }
            }
            return;
        }
        if (i == nm7.C5) {
            if (j49Var == null || this.W1) {
                return;
            }
            j49Var.h();
            return;
        }
        if (i == nm7.d3) {
            byte b = this.g0;
            int i6 = this.c;
            if (b != 1) {
                if (b == 0 && (n = oc7.r1(i6).N1().n()) != null && n.a(i6, 1)) {
                    g6b g6bVar2 = this.L1;
                    if (g6bVar2 == null || g6bVar2.J0 == 0) {
                        g0(n, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.O1 && !this.d1.o()) {
                h4b N1 = oc7.r1(i6).N1();
                int z2 = z();
                xy n2 = N1.n();
                if (n2 == null || !n2.a(N1.a, z2) || ((g6bVar = this.L1) != null && (g6bVar.g || g6bVar.J0 != 0))) {
                    z = true;
                }
            }
            this.c1.setShareEnabled(z);
        }
    }

    public final void e(boolean z, boolean z2) {
        wl2 wl2Var;
        if (z) {
            hg5 hg5Var = this.m1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            hg5 hg5Var2 = this.n1;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
            }
            hg5 hg5Var3 = this.l1;
            if (hg5Var3 != null) {
                hg5Var3.f(true);
            }
            hg5 hg5Var4 = this.X0;
            if (hg5Var4 != null) {
                hg5Var4.f(true);
            }
        }
        if (this.b2 == z && this.c2 == G()) {
            return;
        }
        AnimatorSet animatorSet = this.a2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.a2 = null;
        }
        this.b2 = z;
        this.c2 = G();
        if (z && (wl2Var = this.J0) != null && wl2Var.e) {
            wl2Var.a(false, z2);
        }
        l0(z2);
        s8b s8bVar = this.R0;
        eg5 eg5Var = this.V0;
        eg5 eg5Var2 = this.U0;
        if (!z2) {
            eg5Var2.setAlpha((z && this.g0 == 0 && !G()) ? 1.0f : 0.0f);
            eg5Var2.setTranslationY((z && this.g0 == 0 && !G()) ? 0.0f : gm.L(16.0f));
            eg5Var.setAlpha((!z && this.g0 == 0 && G()) ? 0.6f : 0.0f);
            eg5Var.setTranslationY((!z && this.g0 == 0 && G()) ? 0.0f : gm.L(16.0f));
            s8bVar.setAlpha((z || this.g0 != 0 || G()) ? 0.0f : 1.0f);
            s8bVar.setTranslationY((z || this.g0 != 0 || G()) ? gm.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a2 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eg5Var2, (Property<eg5, Float>) property, (z && this.g0 == 0 && !G()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(eg5Var2, (Property<eg5, Float>) property2, (z && this.g0 == 0 && !G()) ? 0.0f : gm.L(16.0f)), ObjectAnimator.ofFloat(eg5Var, (Property<eg5, Float>) property, (!z && this.g0 == 0 && G()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(eg5Var, (Property<eg5, Float>) property2, (!z && this.g0 == 0 && G()) ? 0.0f : gm.L(16.0f)), ObjectAnimator.ofFloat(s8bVar, (Property<s8b, Float>) property, (z || this.g0 != 0 || G()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(s8bVar, (Property<s8b, Float>) property2, (z || this.g0 != 0 || G()) ? gm.L(16.0f) : 0.0f));
        this.a2.setDuration(260L);
        this.a2.setInterpolator(d53.h);
        this.a2.start();
    }

    public final void e0(boolean z, boolean z2) {
        p09 p09Var = this.g1;
        if (p09Var == null) {
            p09 p09Var2 = new p09(R.raw.media_mute_unmute, gm.L(28.0f), gm.L(28.0f), true, null);
            this.g1 = p09Var2;
            p09Var2.G *= 1.5f;
            p09Var = p09Var2;
        }
        this.h1.setAnimation(p09Var);
        p09 p09Var3 = this.g1;
        if (!z2) {
            p09Var3.I(z ? 20 : 0, false, false);
            return;
        }
        if (z) {
            if (p09Var3.b0 > 20) {
                p09Var3.I(0, false, false);
            }
            this.g1.K(20);
            this.g1.start();
            return;
        }
        int i = p09Var3.b0;
        if (i == 0 || i >= 43) {
            return;
        }
        p09Var3.K(43);
        this.g1.start();
    }

    public final void f(Runnable runnable) {
        g6b g6bVar;
        Runnable runnable2;
        k9b k9bVar;
        n78 n78Var = this.C1;
        if (n78Var == null || (g6bVar = this.L1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        g6bVar.j |= n78Var.b();
        g6b g6bVar2 = this.L1;
        n78 n78Var2 = this.C1;
        File file = g6bVar2.Z0;
        if (file != null) {
            file.delete();
            g6bVar2.Z0 = null;
        }
        lo6 savedFilterState = n78Var2.getSavedFilterState();
        g6bVar2.a1 = savedFilterState;
        if (g6bVar2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = n78Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i = g6bVar2.R;
                    matrix.postScale(i == 1 ? -1.0f : 1.0f, i == 2 ? -1.0f : 1.0f, g6bVar2.k0 / 2.0f, g6bVar2.l0 / 2.0f);
                    matrix.postRotate(-g6bVar2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    g6bVar2.n0.preScale(g6bVar2.k0 / createBitmap.getWidth(), g6bVar2.l0 / createBitmap.getHeight());
                    g6bVar2.k0 = createBitmap.getWidth();
                    g6bVar2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = g6bVar2.Z0;
                    if (file2 != null && file2.exists()) {
                        g6bVar2.Z0.delete();
                    }
                    String k = g6b.k(g6bVar2.L);
                    boolean z = "png".equals(k) || "webp".equals(k);
                    g6bVar2.Z0 = g6b.w(g6bVar2.a, z ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(g6bVar2.Z0));
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new eb7((Object) g6bVar2, (Object) createBitmap, z, (Object) runnable2, (byte) 16));
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
            g6b g6bVar3 = this.L1;
            if (g6bVar3.K || (k9bVar = this.Y0) == null) {
                return;
            }
            k9bVar.set(g6bVar3);
        }
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new up(this, (byte) 3));
    }

    public final void g() {
        if (this.L1 == null || this.E1 == null) {
            return;
        }
        i9b i9bVar = this.i0;
        if (i9bVar.getMeasuredWidth() <= 0 || i9bVar.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.L1.Q != 0) {
            matrix.postRotate(-r2, i9bVar.getMeasuredWidth() / 2.0f, i9bVar.getMeasuredHeight() / 2.0f);
            if ((this.L1.Q / 90) % 2 == 1) {
                matrix.postScale(i9bVar.getMeasuredWidth() / i9bVar.getMeasuredHeight(), i9bVar.getMeasuredHeight() / i9bVar.getMeasuredWidth(), i9bVar.getMeasuredWidth() / 2.0f, i9bVar.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / i9bVar.getMeasuredWidth()) * this.L1.k0, (1.0f / i9bVar.getMeasuredHeight()) * this.L1.l0);
        matrix.postConcat(this.L1.n0);
        matrix.postScale(i9bVar.getMeasuredWidth() / this.L1.i0, i9bVar.getMeasuredHeight() / this.L1.j0);
        this.E1.setTransform(matrix);
        this.E1.invalidate();
    }

    public final void g0(xy xyVar, boolean z) {
        if (this.A2) {
            return;
        }
        c9b c9bVar = new c9b(xyVar.b(), this.c, null, this.b, new b9b(this, (byte) 0));
        c9bVar.S1 = z();
        c9bVar.setOnDismissListener(new aw5((byte) 2, this, z));
        this.Y0.x(7, true);
        this.A2 = true;
        c9bVar.show();
    }

    public final void h() {
        g48 g48Var;
        if (this.K) {
            i9b i9bVar = this.i0;
            float left = i9bVar.getLeft();
            float top = i9bVar.getTop();
            float measuredWidth = i9bVar.getMeasuredWidth();
            float measuredHeight = i9bVar.getMeasuredHeight();
            RectF rectF = this.e0;
            rectF.set(left, top, measuredWidth, measuredHeight);
            n9b n9bVar = this.r;
            rectF.offset(n9bVar.getX(), n9bVar.getY());
            float f = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.d0;
            gm.X1(rectF2, rectF, f, rectF3);
            i9bVar.setAlpha(this.J);
            i9bVar.setTranslationX((rectF3.left - i9bVar.getLeft()) - n9bVar.getX());
            i9bVar.setTranslationY((rectF3.top - i9bVar.getTop()) - n9bVar.getY());
            q9b q9bVar = this.G;
            if (q9bVar != null && (g48Var = q9bVar.f) != null) {
                g48Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            i9bVar.setScaleX(rectF3.width() / i9bVar.getMeasuredWidth());
            i9bVar.setScaleY(rectF3.height() / i9bVar.getMeasuredHeight());
            this.j0.setAlpha(this.J);
            this.l0.setAlpha(this.J);
            this.m0.setAlpha(this.J);
            if (this.g0 == 2) {
                this.v1.setAlpha(this.J);
            }
        }
    }

    public final void h0(boolean z, boolean z2) {
        if (this.e2 != z) {
            this.e2 = z;
            uec uecVar = this.K0;
            if (z2) {
                uecVar.animate().alpha(z ? 1.0f : 0.0f).setDuration(350L).setInterpolator(d53.h).withEndAction(new n8b(this, z, (byte) 1)).start();
                return;
            }
            uecVar.clearAnimation();
            this.K0.setAlpha(z ? 1.0f : 0.0f);
            if (z) {
                return;
            }
            this.K0.b(false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        if (r2.isRecycled() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014b, code lost:
    
        r2.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        if (r2.isRecycled() != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        g6b g6bVar;
        ImageReceiver photoImage;
        float f;
        if (this.w1 == null || (g6bVar = this.L1) == null) {
            return;
        }
        g6bVar.f();
        this.L1.j |= this.w1.r0();
        g6b g6bVar2 = this.L1;
        ArrayList arrayList = g6bVar2.T0;
        if (arrayList == null) {
            g6bVar2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        z8b z8bVar = this.w1;
        g6b g6bVar3 = this.L1;
        z8bVar.q0(g6bVar3.T0, false, false, false, false, g6bVar3);
        g6b g6bVar4 = this.L1;
        if (!g6bVar4.K) {
            g6bVar4.S0 = Utilities.k(this.w1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.w1.getMasks();
        this.L1.U0 = masks != null ? new ArrayList(masks) : null;
        g6b g6bVar5 = this.L1;
        boolean z = g6bVar5.K;
        boolean D = g6bVar5.D();
        this.L1.T0 = new ArrayList();
        z8b z8bVar2 = this.w1;
        g6b g6bVar6 = this.L1;
        Bitmap q0 = z8bVar2.q0(g6bVar6.T0, true, false, false, !z, g6bVar6);
        if (this.L1.T0.isEmpty()) {
            this.L1.T0 = null;
        }
        try {
            File file = this.L1.P0;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.L1.R0;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.L1.Q0;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        g6b g6bVar7 = this.L1;
        g6bVar7.P0 = null;
        g6bVar7.R0 = null;
        g6bVar7.Q0 = null;
        int i = this.c;
        bc4.G(i);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        g6b g6bVar8 = this.L1;
        g6bVar7.P0 = bc4.J(fn5.V(q0, compressFormat, g6bVar8.i0, g6bVar8.j0, 87), null, true, true);
        if (q0 != null && !q0.isRecycled()) {
            q0.recycle();
        }
        g6b g6bVar9 = this.L1;
        if (g6bVar9.u) {
            File file4 = g6bVar9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                g6bVar9 = this.L1;
                g6bVar9.Y0 = null;
            }
            long j = g6bVar9.z0;
            if (j != Long.MIN_VALUE) {
                Drawable drawable = g6bVar9.x0;
                if (drawable == null) {
                    drawable = cl8.d(null, i, j, this.d2);
                }
                if (drawable != null) {
                    this.L1.Y0 = g6b.w(i, "webp");
                    g6b g6bVar10 = this.L1;
                    Bitmap createBitmap = Bitmap.createBitmap(g6bVar10.i0, g6bVar10.j0, Bitmap.Config.ARGB_8888);
                    g6b.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.Y0));
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                    } catch (Throwable th) {
                        if (!createBitmap.isRecycled()) {
                            createBitmap.recycle();
                        }
                        throw th;
                    }
                }
            }
        }
        g6b g6bVar11 = this.L1;
        if (g6bVar11.u) {
            File file5 = g6bVar11.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                g6bVar11 = this.L1;
                g6bVar11.X0 = null;
            }
            if (g6bVar11.u && g6bVar11.K) {
                int i2 = g6bVar11.k0;
                int i3 = g6bVar11.l0;
                u37 p0 = this.w1.p0();
                if (p0 != null) {
                    o37 o37Var = p0.t0;
                    if (o37Var.getChildCount() == 1 && i2 > 0 && i3 > 0) {
                        int i4 = 0;
                        if ((o37Var.getChildAt(0) instanceof rc2) && (photoImage = ((rc2) o37Var.getChildAt(0)).getPhotoImage()) != null) {
                            float f2 = photoImage.N0;
                            if (((int) f2) > 0) {
                                float f3 = photoImage.O0;
                                if (((int) f3) > 0) {
                                    float f4 = i2;
                                    float f5 = i3;
                                    float max = Math.max(f2 / f4, f3 / f5);
                                    float f6 = 2.0f;
                                    int i5 = (int) ((f4 * max) / 2.0f);
                                    int i6 = (int) ((f5 * max) / 2.0f);
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                    float[] fArr = new float[8];
                                    while (true) {
                                        int[] iArr = photoImage.X0;
                                        f = f6;
                                        if (i4 >= iArr.length) {
                                            break;
                                        }
                                        int i7 = i4 << 1;
                                        float f7 = iArr[i4];
                                        fArr[i7] = f7;
                                        fArr[i7 + 1] = f7;
                                        i4++;
                                        f6 = f;
                                    }
                                    Canvas canvas = new Canvas(createBitmap2);
                                    Path path = new Path();
                                    canvas.scale(0.5f, 0.5f);
                                    RectF rectF = gm.P;
                                    float f8 = (i5 * f) / f;
                                    float f9 = photoImage.N0 / f;
                                    float f10 = (i6 * f) / f;
                                    float f11 = photoImage.O0 / f;
                                    rectF.set(f8 - f9, f10 - f11, f9 + f8, f11 + f10);
                                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                    Paint paint = new Paint(1);
                                    paint.setColor(-1);
                                    canvas.drawPath(path, paint);
                                    try {
                                        this.L1.X0 = g6b.w(i, "webp");
                                        createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.X0));
                                    } catch (Exception e4) {
                                        fc4.g(e4, true);
                                        this.L1.X0 = null;
                                    }
                                    createBitmap2.recycle();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!D) {
            z8b z8bVar3 = this.w1;
            ArrayList arrayList2 = new ArrayList();
            g6b g6bVar12 = this.L1;
            int i8 = g6bVar12.i0;
            Bitmap q02 = z8bVar3.q0(arrayList2, false, true, false, false, g6bVar12);
            g6b g6bVar13 = this.L1;
            bc4.G(i);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            g6b g6bVar14 = this.L1;
            g6bVar13.R0 = bc4.J(fn5.V(q02, compressFormat2, g6bVar14.i0, g6bVar14.j0, 87), null, true, true);
            if (q02 != null && !q02.isRecycled()) {
                q02.recycle();
            }
        }
        if (this.w1.E0.getPainting().E) {
            Bitmap blurBitmap = this.w1.getBlurBitmap();
            g6b g6bVar15 = this.L1;
            bc4.G(i);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            g6b g6bVar16 = this.L1;
            g6bVar15.Q0 = bc4.J(fn5.V(blurBitmap, compressFormat3, g6bVar16.i0, g6bVar16.j0, 87), null, true, true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
    }

    public final void i0(boolean z) {
        b1d b1dVar = this.W0;
        if (b1dVar.getTag() != null && z) {
            Runnable runnable = this.f2;
            if (runnable != null) {
                gm.r(runnable);
            }
            f8b f8bVar = new f8b(this, (byte) 25);
            this.f2 = f8bVar;
            gm.d3(f8bVar, 2000L);
            return;
        }
        if (b1dVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.g2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            b1dVar.setTag(z ? 1 : null);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.g2 = animatorSet2;
            animatorSet2.setDuration(180L);
            if (z) {
                b1dVar.setVisibility(0);
            }
            this.g2.playTogether(ObjectAnimator.ofFloat(b1dVar, (Property<b1d, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.g2.addListener(new sw9((byte) 6, this, z));
            this.g2.start();
            if (z) {
                f8b f8bVar2 = new f8b(this, (byte) 26);
                this.f2 = f8bVar2;
                gm.d3(f8bVar2, 2000L);
            }
        }
    }

    public final void j() {
        g6b g6bVar;
        if (this.w1 == null || (g6bVar = this.L1) == null || !g6bVar.u) {
            return;
        }
        File file = g6bVar.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            g6bVar = this.L1;
            g6bVar.W0 = null;
        }
        g6bVar.W0 = g6b.w(this.c, "webp");
        z8b z8bVar = this.w1;
        g6b g6bVar2 = this.L1;
        Bitmap q0 = z8bVar.q0(g6bVar2.T0, false, false, true, this.P1 != 1, g6bVar2);
        try {
            try {
                q0.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                if (q0.isRecycled()) {
                    return;
                }
            } finally {
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
            try {
                this.L1.W0.delete();
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
            this.L1.W0 = null;
            if (q0 == null || q0.isRecycled()) {
                return;
            }
        }
        q0.recycle();
    }

    public final void j0() {
        a8b a8bVar = this.r0;
        if (a8bVar != null) {
            a8bVar.dismiss();
            this.r0 = null;
        }
        a8b a8bVar2 = new a8b(this.b, 86400, this.a);
        a8bVar2.P0();
        a8bVar2.R0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            inputPeer = this.O != 0 ? oc7.r1(this.c).i1(this.O) : new TLRPC.TL_inputPeerSelf();
        }
        a8bVar2.Q0(inputPeer);
        a8bVar2.z1 = this.N;
        a8bVar2.O1 = new g8b(this, (byte) 19);
        a8bVar2.E0(false);
        a8bVar2.N0(1);
        a8bVar2.L0(false);
        a8bVar2.Q1 = new g8b(this, (byte) 20);
        a8bVar2.N1 = new m8b(this, (byte) 11);
        this.r0 = a8bVar2;
        a8bVar2.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0682 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07b5 A[LOOP:0: B:238:0x07b5->B:240:0x07bb, LOOP_START, PHI: r15
      0x07b5: PHI (r15v17 int) = (r15v16 int), (r15v18 int) binds: [B:232:0x0781, B:240:0x07bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0272  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v34, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(int i, boolean z, boolean z2) {
        float f;
        boolean z3;
        g9b g9bVar;
        float f2;
        int i2;
        h9b h9bVar;
        int i3;
        float f3;
        g6b g6bVar;
        ImageView imageView;
        int i4;
        int i5;
        float f4;
        float f5;
        g78 g78Var;
        e78 e78Var;
        ImageView imageView2;
        int i6;
        g6b g6bVar2;
        z8b z8bVar;
        z8b z8bVar2;
        int i7 = this.h0;
        if (i7 == i && !z) {
            return;
        }
        l9b l9bVar = this.d1;
        if (i != -1 && l9bVar != null && l9bVar.O1) {
            return;
        }
        this.h0 = i;
        AnimatorSet animatorSet = this.s2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s2 = null;
        }
        lka lkaVar = this.q0;
        lqb lqbVar = this.a1;
        yq3 yq3Var = this.f1;
        pk4 pk4Var = this.o0;
        a91 a91Var = this.k1;
        s09 s09Var = this.h1;
        if (i7 != i) {
            if (i == -1) {
                pk4Var.setVisibility(0);
                l9bVar.setVisibility(0);
                z8b z8bVar3 = this.w1;
                if (z8bVar3 != null) {
                    z8bVar3.C0(null);
                }
                yq3Var.setVisibility(0);
                g6b g6bVar3 = this.L1;
                if (g6bVar3 == null || !g6bVar3.u) {
                    ImageView imageView3 = this.j1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    E().setVisibility(0);
                    n0(false);
                }
                lkaVar.setVisibility(0);
                if (this.P1 == 1) {
                    s09Var.setVisibility(0);
                    a91Var.setVisibility(0);
                } else {
                    g6b g6bVar4 = this.L1;
                    if (g6bVar4 != null && !TextUtils.isEmpty(g6bVar4.y)) {
                        s09Var.setVisibility(8);
                        a91Var.setVisibility(0);
                    }
                }
                lqbVar.setVisibility(0);
            }
            if (i == 0 && (z8bVar2 = this.w1) != null) {
                z8bVar2.setVisibility(0);
            }
            if ((i == 0 || i7 == 0) && (z8bVar = this.w1) != null) {
                z8bVar.T0.setLayerType(2, null);
            }
            z8b z8bVar4 = this.w1;
            if (z8bVar4 != null) {
                z8bVar4.E1.b(i != 0);
            }
            l9bVar.M.b(i != -1);
            u31.e();
            if (this.C1 != null && i7 == 1) {
                f(null);
            }
            m78 m78Var = this.D1;
            if (m78Var != null) {
                m78Var.setAllowTouch(false);
            }
            this.l1.f(true);
            u9b u9bVar = this.n;
            k9b k9bVar = this.Y0;
            Activity activity = this.b;
            if (i == 3) {
                if (this.s1 == null) {
                    g9b g9bVar2 = new g9b(this, activity, k9bVar);
                    this.s1 = g9bVar2;
                    u9bVar.addView(g9bVar2.d);
                    u9bVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
                g6b g6bVar5 = this.L1;
                if (g6bVar5 != null) {
                    this.s1.setEntry(g6bVar5);
                }
            } else if (i7 == 3) {
                k9bVar.a();
                g9b g9bVar3 = this.s1;
                if (g9bVar3 != null) {
                    g9bVar3.a.setCropEditorDrawing(g9bVar3);
                    g9bVar3.E = true;
                }
            }
            if (i == 4) {
                if (this.t1 == null) {
                    h9b h9bVar2 = new h9b(this, activity, k9bVar);
                    this.t1 = h9bVar2;
                    u9bVar.addView(h9bVar2.e);
                    u9bVar.addView(this.t1);
                }
                this.t1.setVisibility(0);
            } else if (i7 == 4) {
                k9bVar.a();
                h9b h9bVar3 = this.t1;
                if (h9bVar3 != null) {
                    h9bVar3.F = true;
                }
            }
        }
        this.c1.b((i == -1 || i == 2) && this.J > 0.0f, z2);
        ArrayList arrayList = new ArrayList();
        n78 n78Var = this.C1;
        boolean z4 = n78Var == null && i == 1;
        float f6 = 1.0f;
        if (i == 1) {
            q();
            n78 n78Var2 = this.C1;
            this.w2 = n78Var2;
            FrameLayout toolsView = n78Var2 != null ? n78Var2.getToolsView() : null;
            if (toolsView != null) {
                toolsView.setAlpha(0.0f);
                toolsView.setVisibility(0);
                f = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
            if (i7 == 1 && n78Var != null) {
                this.w2 = null;
                z3 = z4;
                arrayList.add(ObjectAnimator.ofFloat(n78Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, gm.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.C1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i != 0) {
                    s();
                    this.w2 = this.w1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(pk4Var, (Property<pk4, Float>) property, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.w1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -gm.L(16.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property2, gm.L(48.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -gm.L(32.0f), f));
                } else if (i7 == 0 && this.w1 != null) {
                    this.w2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(pk4Var, (Property<pk4, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property3, f));
                    View topLayout2 = this.w1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -gm.L(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property3, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property4, gm.L(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -gm.L(32.0f)));
                }
                g9bVar = this.s1;
                if (g9bVar == null) {
                    m43 m43Var = g9bVar.h;
                    if (i == 3) {
                        Property property5 = View.ALPHA;
                        i2 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(m43Var, (Property<m43, Float>) property5, 0.0f, 1.0f));
                        m43 m43Var2 = this.s1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f2 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(m43Var2, (Property<m43, Float>) property6, gm.L(52.0f), f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property6, gm.L(52.0f), f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new o8b(this, (byte) 1));
                        arrayList.add(ofFloat);
                    } else {
                        f2 = 52.0f;
                        i2 = 2;
                        i2 = 2;
                        if (i7 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(m43Var, (Property<m43, Float>) property7, 1.0f, 0.0f));
                            m43 m43Var3 = this.s1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(m43Var3, (Property<m43, Float>) property8, f, gm.L(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property8, f, gm.L(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.s1.getAppearProgress(), f);
                            ofFloat2.addUpdateListener(new o8b(this, i2));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f2 = 52.0f;
                    i2 = 2;
                }
                h9bVar = this.t1;
                if (h9bVar != null) {
                    m43 m43Var4 = h9bVar.n;
                    if (i == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i2];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(m43Var4, (Property<m43, Float>) property9, fArr));
                        m43 m43Var5 = this.t1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i2];
                        fArr2[0] = gm.L(f2);
                        fArr2[1] = f;
                        arrayList.add(ObjectAnimator.ofFloat(m43Var5, (Property<m43, Float>) property10, fArr2));
                        float[] fArr3 = new float[i2];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.t1.r;
                        float[] fArr4 = new float[i2];
                        fArr4[0] = gm.L(f2);
                        fArr4[1] = f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i2];
                        fArr5[0] = this.t1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new o8b(this, (byte) 3));
                        arrayList.add(ofFloat3);
                    } else if (i7 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i2];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(m43Var4, (Property<m43, Float>) property11, fArr6));
                        m43 m43Var6 = this.t1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float L = gm.L(f2);
                        float[] fArr7 = new float[i2];
                        fArr7[0] = f;
                        fArr7[1] = L;
                        arrayList.add(ObjectAnimator.ofFloat(m43Var6, (Property<m43, Float>) property12, fArr7));
                        float[] fArr8 = new float[i2];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.t1.r;
                        float L2 = gm.L(f2);
                        float[] fArr9 = new float[i2];
                        fArr9[0] = f;
                        fArr9[1] = L2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i2];
                        fArr10[0] = this.t1.getAppearProgress();
                        fArr10[1] = f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new o8b(this, (byte) 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i != -1 || i == 2) {
                    i3 = 1;
                    if (this.P1 == 1) {
                        f3 = 1.0f;
                        float[] fArr11 = new float[i3];
                        fArr11[0] = f3;
                        arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property13, ((i != -1 || i == 2) && (this.P1 == i3 || !((g6bVar = this.L1) == null || TextUtils.isEmpty(g6bVar.y)))) ? 1.0f : f));
                        arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property13, (i != -1 || i == 2) ? 1.0f : f));
                        imageView = this.j1;
                        if (imageView != null) {
                            i4 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i == -1 || i == 2) && (g6bVar2 = this.L1) != null && g6bVar2.u) ? 1.0f : f));
                        } else {
                            i4 = 1;
                        }
                        byte b = this.g0;
                        float[] fArr12 = new float[i4];
                        fArr12[0] = ((b != i4 || b == 2) && i == -1) ? 1.0f : f;
                        arrayList.add(ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property13, fArr12));
                        i9b i9bVar = this.i0;
                        if (i == i4) {
                            i9bVar.setPivotY(i9bVar.getMeasuredHeight() * 0.2f);
                            i5 = gm.L(164.0f);
                        } else if (i == 0) {
                            i9bVar.setPivotY(i9bVar.getMeasuredHeight() * 0.6f);
                            i5 = gm.L(40.0f);
                        } else if (i == 2) {
                            i9bVar.setPivotY(f);
                            i5 = lqbVar.getContentHeight() + gm.L(8.0f);
                        } else {
                            i5 = 0;
                        }
                        if (i5 > 0) {
                            f4 = (r10 - i5) / (i9bVar.getHeight() - ((int) i9bVar.getPivotY()));
                        } else {
                            f4 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(i9bVar, (Property<i9b, Float>) View.SCALE_X, f4));
                        arrayList.add(ObjectAnimator.ofFloat(i9bVar, (Property<i9b, Float>) View.SCALE_Y, f4));
                        if (i == -1) {
                            f5 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(i9bVar, (Property<i9b, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f5 = 0.0f;
                        }
                        g78Var = this.G1;
                        if (g78Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(g78Var, (Property<g78, Float>) property13, i == 1 ? 1.0f : f5));
                        }
                        e78Var = this.F1;
                        if (e78Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(e78Var, (Property<e78, Float>) property13, i == 1 ? 1.0f : f5));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(l9bVar, (Property<l9b, Float>) property13, i == -1 ? 1.0f : f5));
                        float[] fArr13 = {(i != -1 || i == 2) ? 1.0f : f5};
                        ne6 ne6Var = this.m0;
                        arrayList.add(ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(ne6Var, (Property<ne6, Float>) property14, (i != -1 || i == 2) ? f5 : gm.L(120.0f)));
                        if (i != -1 && i != 2) {
                            f6 = f5;
                        }
                        FrameLayout frameLayout3 = this.Z0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f6));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i == 2 ? gm.L(68.0f) : gm.L(64.0f) + (-(gm.L(12.0f) + l9bVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.k0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - gm.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i == 2 ? -90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property15, i == 2 ? 90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property15, i == 2 ? 90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property15, i == 2 ? 90.0f : f5));
                        imageView2 = this.j1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i == 2 ? 90.0f : f5));
                        }
                        if (this.s0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i6 = 0;
                            ofFloat5.addUpdateListener(new y8b(this, 0 == true ? 1 : 0));
                            arrayList.add(ofFloat5);
                        } else {
                            i6 = 0;
                        }
                        if (lqbVar != null) {
                            g6b g6bVar6 = this.L1;
                            boolean z5 = (g6bVar6 == null || !g6bVar6.v() || !this.L1.t() || i == 2) ? true : i6;
                            if (lqbVar.k0 != z5 || !z2) {
                                lqbVar.k0 = z5;
                                if (!z2) {
                                    lqbVar.j0.f(z5, true);
                                }
                                lqbVar.invalidate();
                            }
                        }
                        if (!z2) {
                            while (i6 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i6);
                                animator.setDuration(1L);
                                animator.start();
                                i6++;
                            }
                            if (i7 != i) {
                                P(i7, i);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.s2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.s2.setDuration(320L);
                        this.s2.setInterpolator(d53.h);
                        this.s2.addListener(new lx0(this, i7, i, (byte) 4));
                        if (z3) {
                            this.s2.setStartDelay(120L);
                        }
                        this.s2.start();
                        return;
                    }
                } else {
                    i3 = 1;
                }
                f3 = f;
                float[] fArr112 = new float[i3];
                fArr112[0] = f3;
                arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property13, ((i != -1 || i == 2) && (this.P1 == i3 || !((g6bVar = this.L1) == null || TextUtils.isEmpty(g6bVar.y)))) ? 1.0f : f));
                arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property13, (i != -1 || i == 2) ? 1.0f : f));
                imageView = this.j1;
                if (imageView != null) {
                }
                byte b2 = this.g0;
                float[] fArr122 = new float[i4];
                fArr122[0] = ((b2 != i4 || b2 == 2) && i == -1) ? 1.0f : f;
                arrayList.add(ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property13, fArr122));
                i9b i9bVar2 = this.i0;
                if (i == i4) {
                }
                if (i5 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(i9bVar2, (Property<i9b, Float>) View.SCALE_X, f4));
                arrayList.add(ObjectAnimator.ofFloat(i9bVar2, (Property<i9b, Float>) View.SCALE_Y, f4));
                if (i == -1) {
                }
                g78Var = this.G1;
                if (g78Var != null) {
                }
                e78Var = this.F1;
                if (e78Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(l9bVar, (Property<l9b, Float>) property13, i == -1 ? 1.0f : f5));
                float[] fArr132 = {(i != -1 || i == 2) ? 1.0f : f5};
                ne6 ne6Var2 = this.m0;
                arrayList.add(ObjectAnimator.ofFloat(ne6Var2, (Property<ne6, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(ne6Var2, (Property<ne6, Float>) property142, (i != -1 || i == 2) ? f5 : gm.L(120.0f)));
                if (i != -1) {
                    f6 = f5;
                }
                FrameLayout frameLayout32 = this.Z0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f6));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i == 2 ? gm.L(68.0f) : gm.L(64.0f) + (-(gm.L(12.0f) + l9bVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.k0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - gm.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i == 2 ? -90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property152, i == 2 ? 90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property152, i == 2 ? 90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property152, i == 2 ? 90.0f : f5));
                imageView2 = this.j1;
                if (imageView2 != null) {
                }
                if (this.s0.c()) {
                }
                if (lqbVar != null) {
                }
                if (!z2) {
                }
            }
        }
        z3 = z4;
        if (i != 0) {
        }
        g9bVar = this.s1;
        if (g9bVar == null) {
        }
        h9bVar = this.t1;
        if (h9bVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i != -1) {
        }
        i3 = 1;
        if (this.P1 == 1) {
        }
        f3 = f;
        float[] fArr1122 = new float[i3];
        fArr1122[0] = f3;
        arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property132, ((i != -1 || i == 2) && (this.P1 == i3 || !((g6bVar = this.L1) == null || TextUtils.isEmpty(g6bVar.y)))) ? 1.0f : f));
        arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property132, (i != -1 || i == 2) ? 1.0f : f));
        imageView = this.j1;
        if (imageView != null) {
        }
        byte b22 = this.g0;
        float[] fArr1222 = new float[i4];
        fArr1222[0] = ((b22 != i4 || b22 == 2) && i == -1) ? 1.0f : f;
        arrayList.add(ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property132, fArr1222));
        i9b i9bVar22 = this.i0;
        if (i == i4) {
        }
        if (i5 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(i9bVar22, (Property<i9b, Float>) View.SCALE_X, f4));
        arrayList.add(ObjectAnimator.ofFloat(i9bVar22, (Property<i9b, Float>) View.SCALE_Y, f4));
        if (i == -1) {
        }
        g78Var = this.G1;
        if (g78Var != null) {
        }
        e78Var = this.F1;
        if (e78Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(l9bVar, (Property<l9b, Float>) property132, i == -1 ? 1.0f : f5));
        float[] fArr1322 = {(i != -1 || i == 2) ? 1.0f : f5};
        ne6 ne6Var22 = this.m0;
        arrayList.add(ObjectAnimator.ofFloat(ne6Var22, (Property<ne6, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(ne6Var22, (Property<ne6, Float>) property1422, (i != -1 || i == 2) ? f5 : gm.L(120.0f)));
        if (i != -1) {
        }
        FrameLayout frameLayout322 = this.Z0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f6));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i == 2 ? gm.L(68.0f) : gm.L(64.0f) + (-(gm.L(12.0f) + l9bVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.k0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - gm.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i == 2 ? -90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property1522, i == 2 ? 90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(s09Var, (Property<s09, Float>) property1522, i == 2 ? 90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(yq3Var, (Property<yq3, Float>) property1522, i == 2 ? 90.0f : f5));
        imageView2 = this.j1;
        if (imageView2 != null) {
        }
        if (this.s0.c()) {
        }
        if (lqbVar != null) {
        }
        if (!z2) {
        }
    }

    public final void l() {
        boolean z = this.L != 0.0f || this.J < 1.0f || this.C2;
        if (z == this.B2) {
            return;
        }
        a26 a26Var = this.E;
        if (a26Var != null) {
            a26Var.b(!z);
        }
        this.B2 = z;
    }

    public final void l0(boolean z) {
        a9b a9bVar;
        byte b = this.g0;
        wl2 wl2Var = this.J0;
        boolean z2 = false;
        h0(b == 0 && this.P1 == 1 && !wl2Var.e && !G(), z);
        j9b j9bVar = this.B0;
        boolean i = j9bVar.i();
        xl2 xl2Var = this.H0;
        xl2Var.setSelected(i);
        b0(this.o0, wl2Var == null || !wl2Var.e, z);
        b0(this.F0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.Z1 == null || wl2Var.e || G()) ? false : true, z);
        b0(this.G0, (this.b2 || this.P1 == -1 || this.g0 != 0 || (a9bVar = this.C0) == null || !a9bVar.a || wl2Var.e || j9bVar.i()) ? false : true, z);
        b0(xl2Var, (this.b2 || this.P1 == -1 || this.g0 != 0 || wl2Var.e) ? false : true, z);
        b0(this.I0, wl2Var.e, z);
        this.P0.e(z, j9bVar.i() ? j9bVar.getFilledProgress() : 0.0f);
        boolean z3 = wl2Var.e;
        hg5 hg5Var = this.o1;
        if (z3) {
            hg5Var.v();
        } else {
            hg5Var.f(true);
        }
        e(this.b2, z);
        gm.P3(this.T0, this.P1 == -1 && this.g0 == 0, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z2 = true;
        }
        gm.P3(this.S0, z2, true);
    }

    public final void m() {
        if (this.u2 < 0) {
            this.u2 = oc7.d1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f = oc7.d1().getFloat("frontflash_warmth", 0.9f);
            rk4 rk4Var = this.s;
            rk4Var.o = f;
            rk4Var.n = rk4.f(f);
            rk4Var.g();
            rk4Var.p = oc7.d1().getFloat("frontflash_intensity", 1.0f);
            rk4Var.i();
        }
    }

    public final void m0() {
        nrb nrbVar = this.I0;
        nrbVar.setTranslationX(-0.0f);
        float alpha = (nrbVar.getAlpha() * gm.L(46.0f)) + 0.0f;
        orb orbVar = this.G0;
        orbVar.setTranslationX(-alpha);
        float alpha2 = (orbVar.getAlpha() * gm.L(46.0f)) + alpha;
        xl2 xl2Var = this.H0;
        xl2Var.setTranslationX(-alpha2);
        float alpha3 = (xl2Var.getAlpha() * gm.L(46.0f)) + alpha2;
        nrb nrbVar2 = this.F0;
        nrbVar2.setTranslationX(-alpha3);
        float alpha4 = (nrbVar2.getAlpha() * gm.L(46.0f)) + alpha3;
        pk4 pk4Var = this.o0;
        pk4Var.setTranslationX(0.0f);
        hx hxVar = this.J0.a;
        hxVar.setPadding((int) ((pk4Var.getAlpha() * gm.L(46.0f)) + 0.0f + gm.L(8.0f)), 0, (int) (alpha4 + gm.L(8.0f)), 0);
        hxVar.invalidate();
    }

    public final void n() {
        a9b a9bVar = this.C0;
        if (a9bVar == null || a9bVar.getTextureView() == null) {
            this.d2 = false;
            return;
        }
        Bitmap bitmap = this.C0.getTextureView().getBitmap();
        if (bitmap == null) {
            this.d2 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f = 0.0f;
        for (int i = 0; i < 10; i++) {
            int i2 = 0;
            while (i2 < 10) {
                i2++;
                f += gm.B(bitmap.getPixel((i + 1) * width, i2 * height));
            }
        }
        float f2 = f / 100.0f;
        bitmap.recycle();
        this.d2 = f2 < 0.22f;
    }

    public final void n0(boolean z) {
        p09 p09Var = this.i1;
        if (p09Var != null) {
            int[] iArr = p09Var.e;
            g6b g6bVar = this.L1;
            int i = 0;
            if (!z) {
                int i2 = (g6bVar == null || !g6bVar.y0) ? 0 : iArr[0] - 1;
                p09Var.I(i2, false, true);
                this.i1.K(i2);
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            if (g6bVar != null && g6bVar.y0) {
                i = iArr[0];
            }
            p09Var.K(i);
            p09 p09Var2 = this.i1;
            if (p09Var2 != null) {
                p09Var2.start();
            }
        }
    }

    public final void o(boolean z) {
        if (this.d) {
            a8b a8bVar = this.r0;
            if (a8bVar != null) {
                a8bVar.dismiss();
                this.r0 = null;
            }
            g6b g6bVar = this.L1;
            long j = 0;
            if (g6bVar != null && !g6bVar.h) {
                if ((this.w && g6bVar.g) || g6bVar.b != 0) {
                    g6bVar.j = false;
                }
                g6bVar.i(false);
            }
            this.L1 = null;
            nac nacVar = this.S;
            k9b k9bVar = this.Y0;
            if (nacVar == null || k9bVar == null) {
                if (k9bVar != null && !z) {
                    k9bVar.set(null);
                }
                d(0.0f, z, new f8b(this, (byte) 23));
                boolean z2 = this.K;
                if (z2 || !z2) {
                    this.n.setBackgroundColor(0);
                    this.c1.b(false, true);
                }
                nm7.e().n(this, nm7.r2);
                int i = this.c;
                nm7.f(i).n(this, nm7.C5);
                nm7.f(i).n(this, nm7.d3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            ndc ndcVar = k9bVar.E;
            if (ndcVar != null) {
                ndcVar.f0();
                k9bVar.E.l0();
                k9bVar.E = null;
            }
            ndc ndcVar2 = k9bVar.y;
            if (ndcVar2 != null) {
                j = ndcVar2.S();
                k9bVar.y.f0();
                k9bVar.y.l0();
                k9bVar.y = null;
            }
            ndc ndcVar3 = k9bVar.e;
            if (ndcVar3 != null) {
                j = ndcVar3.S();
                k9bVar.e.f0();
                k9bVar.e.l0();
                k9bVar.e = null;
            }
            nacVar.a(Long.valueOf(j), new n8b(this, z, (byte) 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        f8b f8bVar = new f8b(this, (byte) 2);
        z8b z8bVar = this.w1;
        g6b g6bVar = this.L1;
        if (z8bVar == null || g6bVar == null) {
            f8bVar.run();
            return;
        }
        g6bVar.f();
        boolean r0 = z8bVar.r0();
        boolean z = z8bVar.E0.getPainting().E;
        Utilities.g.c(new i4a(this, z8bVar, g6bVar.i0, g6bVar.j0, g6bVar, z, r0, f8bVar, (byte) 2));
    }

    public final void p() {
        Activity activity = this.b;
        if (this.C0 != null || activity == null) {
            return;
        }
        byte b = 0;
        this.C0 = new a9b(this, activity, oc7.d1().getBoolean("stories_camera", false));
        j49 j49Var = this.P0;
        if (j49Var != null) {
            j49Var.h0 = 0.0f;
            j49Var.i0.e(true, 0.0f);
        }
        this.C0.recordHevc = !this.B0.i();
        this.C0.setThumbDrawable(y());
        this.C0.initTexture();
        this.C0.setDelegate(new m8b(this, b));
        b0(this.G0, this.C0.a && this.g0 == 0, true);
        this.H0.setTranslationX(this.C0.a ? 0.0f : gm.L(46.0f));
        this.B0.setCameraView(this.C0);
        if (oc7.d1().getInt("storyhint2", 0) < 1) {
            this.X0.v();
            oc7.d1().edit().putInt("storyhint2", oc7.d1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!ss3.o(this.C0.getContext()) || !oc7.d1().getBoolean("dualcam", ss3.n(org.telegram.messenger.a.b, false))) && this.C0.a && oc7.d1().getInt("storydualhint", 0) < 2) {
            this.m1.v();
        }
        ex8 ex8Var = this.D0;
        if (ex8Var == null) {
            ex8Var = new ex8(activity, new g8b(this, (byte) 4));
            this.D0 = ex8Var;
        }
        ex8Var.a(this.C0);
        ms9 ms9Var = this.E0;
        if (ms9Var != null) {
            j9b j9bVar = this.B0;
            Object blurRenderNode = j9bVar.getBlurRenderNode();
            ms9Var.G = j9bVar;
            ms9Var.H = blurRenderNode;
            ms9Var.invalidate();
        }
    }

    public final boolean p0() {
        a9b a9bVar;
        if ((!this.Q1 && !this.R1) || (a9bVar = this.C0) == null || !a9bVar.isFrontface()) {
            return false;
        }
        int i = this.u2;
        return i == 2 || (i == 1 && this.d2);
    }

    public final void q() {
        g6b g6bVar;
        Bitmap bitmap;
        Bitmap q;
        if (this.C1 != null || (g6bVar = this.L1) == null) {
            return;
        }
        boolean z = g6bVar.K;
        k9b k9bVar = this.Y0;
        if (z) {
            bitmap = null;
        } else {
            if (g6bVar.Z0 == null) {
                q = k9bVar.getPhotoBitmap();
            } else {
                m8b m8bVar = new m8b(this, (byte) 10);
                Point point = gm.q;
                q = g6b.q(m8bVar, point.x, point.y, 0, true);
            }
            bitmap = q;
        }
        if (bitmap != null || this.L1.K) {
            ncc textureView = k9bVar.getTextureView();
            int orientation = k9bVar.getOrientation();
            g6b g6bVar2 = this.L1;
            n78 n78Var = new n78(this.b, textureView, bitmap, null, orientation, g6bVar2 != null ? g6bVar2.a1 : null, null, 0, false, false, this.s0, this.a);
            this.C1 = n78Var;
            this.r.addView(n78Var);
            m78 m78Var = this.D1;
            if (m78Var != null) {
                m78Var.setFilterView(this.C1);
            }
            TextureView myTextureView = this.C1.getMyTextureView();
            this.E1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            k9bVar.o(this.E1, this.C1);
            TextureView textureView2 = this.E1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.E1.animate().alpha(1.0f).setDuration(220L).start();
            }
            g();
            e78 blurControl = this.C1.getBlurControl();
            this.F1 = blurControl;
            i9b i9bVar = this.i0;
            if (blurControl != null) {
                i9bVar.addView(blurControl);
            }
            g78 curveControl = this.C1.getCurveControl();
            this.G1 = curveControl;
            if (curveControl != null) {
                i9bVar.addView(curveControl);
            }
            U();
            this.C1.getDoneTextView().setOnClickListener(new h8b(this, (byte) 13));
            this.C1.getCancelTextView().setOnClickListener(new h8b(this, (byte) 14));
            this.C1.getToolsView().setVisibility(8);
            this.C1.getToolsView().setAlpha(0.0f);
            this.C1.getToolsView().setTranslationY(gm.L(186.0f));
            this.C1.j0.setVisibility(0);
        }
    }

    public final void r(boolean z) {
        wt4 wt4Var = this.N0;
        j9b j9bVar = this.B0;
        byte b = 0;
        if (wt4Var != null) {
            boolean z2 = j9bVar != null && j9bVar.i();
            wt4 wt4Var2 = this.N0;
            if (z2 == wt4Var2.Q) {
                return;
            } else {
                wt4Var = wt4Var2;
            }
        }
        if (this.b == null) {
            return;
        }
        if (wt4Var != null) {
            u();
        }
        wt4 wt4Var3 = new wt4(this, this.c, this.b, this.a, this.n2, z, !z, j9bVar != null && j9bVar.i());
        this.N0 = wt4Var3;
        wt4Var3.H.setVisibility(8);
        this.N0.setMultipleOnClick(j9bVar.i());
        this.N0.setMaxCount(Math.min(10, sl2.b() - j9bVar.getFilledCount()));
        this.N0.setOnBackClickListener(new q8b(this, b));
        byte b2 = 2;
        this.N0.setOnSelectListener(new gp2(this, z, b2));
        this.N0.setOnSelectMultipleListener(new fh6(this, b2));
        t46 t46Var = this.m2;
        if (t46Var != null) {
            as0 as0Var = this.N0.e;
            as0Var.B = t46Var;
            as0Var.k0();
        }
        this.n.addView(this.N0, qoe.e(-1, -1, nm7.D1));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        Bitmap bitmap;
        boolean z;
        g6b g6bVar;
        k9b k9bVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        e99 renderView;
        i9b i9bVar;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file;
        File file2;
        if (this.w1 != null) {
            return;
        }
        k9b k9bVar2 = this.Y0;
        Pair<Integer, Integer> paintSize = k9bVar2.getPaintSize();
        g6b g6bVar2 = this.L1;
        Bitmap decodeFile = (g6bVar2 == null || !(g6bVar2.c || g6bVar2.g || this.I1 != null) || (file2 = g6bVar2.P0) == null) ? null : BitmapFactory.decodeFile(file2.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        g6b g6bVar3 = this.L1;
        boolean z6 = false;
        if (g6bVar3 == null || (!(g6bVar3.c || g6bVar3.g || this.I1 != null) || (file = g6bVar3.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file.getPath());
            if (bitmap != null) {
                z = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                i9b i9bVar2 = this.i0;
                int measuredWidth = i9bVar2.getMeasuredWidth();
                int measuredHeight = i9bVar2.getMeasuredHeight();
                g6bVar = this.L1;
                if (g6bVar != null || g6bVar.M) {
                    k9bVar = k9bVar2;
                    z2 = false;
                } else {
                    k9bVar = k9bVar2;
                    z2 = true;
                }
                File file3 = g6bVar != null ? null : g6bVar.L;
                if (g6bVar == null && g6bVar.K) {
                    z3 = false;
                    z6 = true;
                } else {
                    z3 = false;
                }
                if (g6bVar != null || g6bVar.J0 == 0) {
                    z4 = z;
                    z5 = z3;
                } else {
                    z4 = z;
                    z5 = true;
                }
                int orientation = k9bVar.getOrientation();
                g6b g6bVar4 = this.L1;
                ArrayList arrayList = g6bVar4 != null ? g6bVar4.T0 : null;
                ao6 ao6Var = new ao6();
                n10 n10Var = this.t0;
                k9b k9bVar3 = this.Y0;
                Activity activity = this.b;
                boolean z7 = z4;
                z8b z8bVar = new z8b(this, activity, z2, file3, z6, z5, this.n, activity, this.c, bitmap2, bitmap3, orientation, arrayList, g6bVar4, measuredWidth, measuredHeight, ao6Var, this.s0, this.a, n10Var, k9bVar3);
                this.w1 = z8bVar;
                g6b g6bVar5 = this.L1;
                z8bVar.setHasAudio(g6bVar5 == null && g6bVar5.y != null);
                this.w1.setBlurManager(this.s0);
                this.r.addView(this.w1);
                renderView = this.w1.getRenderView();
                this.x1 = renderView;
                if (renderView == null) {
                    renderView.getPainting().E = z7;
                    i9bVar = i9bVar2;
                    i9bVar.addView(this.x1);
                } else {
                    i9bVar = i9bVar2;
                }
                renderInputView = this.w1.getRenderInputView();
                this.y1 = renderInputView;
                if (renderInputView != null) {
                    i9bVar.addView(renderInputView);
                }
                textDimView = this.w1.getTextDimView();
                this.z1 = textDimView;
                if (textDimView != null) {
                    i9bVar.addView(textDimView);
                }
                entitiesView = this.w1.getEntitiesView();
                this.A1 = entitiesView;
                if (entitiesView != null) {
                    i9bVar.addView(entitiesView);
                }
                selectionEntitiesView = this.w1.getSelectionEntitiesView();
                this.B1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    i9bVar.addView(selectionEntitiesView);
                }
                U();
                this.w1.setOnDoneButtonClickedListener(new f8b(this, (byte) 21));
                this.w1.setOnCancelButtonClickedListener(new f8b(this, (byte) 22));
                z8b z8bVar2 = this.w1;
                z8bVar2.H0.setVisibility(0);
                z8bVar2.E0.setVisibility(0);
                z8bVar2.F0.setVisibility(0);
            }
        }
        z = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        i9b i9bVar22 = this.i0;
        int measuredWidth2 = i9bVar22.getMeasuredWidth();
        int measuredHeight2 = i9bVar22.getMeasuredHeight();
        g6bVar = this.L1;
        if (g6bVar != null) {
        }
        k9bVar = k9bVar2;
        z2 = false;
        if (g6bVar != null) {
        }
        if (g6bVar == null) {
        }
        z3 = false;
        if (g6bVar != null) {
        }
        z4 = z;
        z5 = z3;
        int orientation2 = k9bVar.getOrientation();
        g6b g6bVar42 = this.L1;
        ArrayList arrayList2 = g6bVar42 != null ? g6bVar42.T0 : null;
        ao6 ao6Var2 = new ao6();
        n10 n10Var2 = this.t0;
        k9b k9bVar32 = this.Y0;
        Activity activity2 = this.b;
        boolean z72 = z4;
        z8b z8bVar3 = new z8b(this, activity2, z2, file3, z6, z5, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, arrayList2, g6bVar42, measuredWidth2, measuredHeight2, ao6Var2, this.s0, this.a, n10Var2, k9bVar32);
        this.w1 = z8bVar3;
        g6b g6bVar52 = this.L1;
        z8bVar3.setHasAudio(g6bVar52 == null && g6bVar52.y != null);
        this.w1.setBlurManager(this.s0);
        this.r.addView(this.w1);
        renderView = this.w1.getRenderView();
        this.x1 = renderView;
        if (renderView == null) {
        }
        renderInputView = this.w1.getRenderInputView();
        this.y1 = renderInputView;
        if (renderInputView != null) {
        }
        textDimView = this.w1.getTextDimView();
        this.z1 = textDimView;
        if (textDimView != null) {
        }
        entitiesView = this.w1.getEntitiesView();
        this.A1 = entitiesView;
        if (entitiesView != null) {
        }
        selectionEntitiesView = this.w1.getSelectionEntitiesView();
        this.B1 = selectionEntitiesView;
        if (selectionEntitiesView != null) {
        }
        U();
        this.w1.setOnDoneButtonClickedListener(new f8b(this, (byte) 21));
        this.w1.setOnCancelButtonClickedListener(new f8b(this, (byte) 22));
        z8b z8bVar22 = this.w1;
        z8bVar22.H0.setVisibility(0);
        z8bVar22.E0.setVisibility(0);
        z8bVar22.F0.setVisibility(0);
    }

    public final void t(boolean z) {
        ex8 ex8Var = this.D0;
        if (ex8Var != null) {
            ex8Var.f = null;
            Utilities.e.a((bx8) ex8Var.h);
            this.D0 = null;
            j9b j9bVar = this.B0;
            if (j9bVar != null) {
                j9bVar.c.c(null);
            }
        }
        ms9 ms9Var = this.E0;
        if (ms9Var != null) {
            ms9Var.G = null;
            ms9Var.H = null;
            ms9Var.invalidate();
        }
        if (this.C0 != null) {
            if (z) {
                a0(new f8b(this, (byte) 8));
                return;
            }
            a0(new f8b(this, (byte) 9));
            this.C0.destroy(true, null);
            gm.B2(this.C0);
            j9b j9bVar2 = this.B0;
            if (j9bVar2 != null) {
                j9bVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void u() {
        wt4 wt4Var = this.N0;
        if (wt4Var == null) {
            return;
        }
        this.n.removeView(wt4Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        zna znaVar = this.p2;
        if (znaVar != null) {
            znaVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void w() {
        n78 n78Var = this.C1;
        if (n78Var == null) {
            return;
        }
        n78Var.c();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        i9b i9bVar = this.i0;
        if (textureView != null) {
            i9bVar.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        e78 e78Var = this.F1;
        if (e78Var != null) {
            i9bVar.removeView(e78Var);
            this.F1 = null;
        }
        g78 g78Var = this.G1;
        if (g78Var != null) {
            i9bVar.removeView(g78Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void x() {
        z8b z8bVar = this.w1;
        if (z8bVar != null) {
            z8bVar.H0.removeAllViews();
            z8b z8bVar2 = this.w1;
            gd1 gd1Var = z8bVar2.a2;
            if (gd1Var != null) {
                gd1Var.b.c();
                jd4 jd4Var = gd1Var.c;
                if (jd4Var != null) {
                    jd4Var.f = null;
                    u31 u31Var = (u31) jd4Var.g;
                    if (u31Var != null) {
                        u31Var.b();
                        jd4Var.g = null;
                    }
                    gd1Var.c = null;
                }
            }
            z8bVar2.E0.h();
            z8bVar2.H0.setVisibility(8);
            z8bVar2.G0.setVisibility(8);
            z8bVar2.u0.postRunnable(new bo6((byte) 9));
            nv7 nv7Var = z8bVar2.e2;
            if (nv7Var != null) {
                nv7Var.dismiss();
            }
            ln2 ln2Var = z8bVar2.J1;
            if (ln2Var != null) {
                ln2Var.dismiss();
            }
            this.r.removeView(this.w1);
            this.w1 = null;
            e99 e99Var = this.x1;
            i9b i9bVar = this.i0;
            if (e99Var != null) {
                i9bVar.removeView(e99Var);
                this.x1 = null;
            }
            View view = this.z1;
            if (view != null) {
                i9bVar.removeView(view);
                this.z1 = null;
            }
            View view2 = this.y1;
            if (view2 != null) {
                i9bVar.removeView(view2);
                this.y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                i9bVar.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                i9bVar.removeView(view4);
                this.B1 = null;
            }
        }
    }

    public final Drawable y() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.a.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        return bitmap != null ? new BitmapDrawable(bitmap) : this.b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int z() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        g6b g6bVar = this.L1;
        if (g6bVar != null) {
            return g6bVar.r();
        }
        return 1;
    }
}
