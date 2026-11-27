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
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class rbb implements fn7 {
    public static rbb G2;
    public al2 A0;
    public View A1;
    public boolean A2;
    public final fbb B0;
    public View B1;
    public boolean B2;
    public wab C0;
    public c98 C1;
    public boolean C2;
    public oy8 D0;
    public final b98 D1;
    public bbb D2;
    public final e26 E;
    public final du9 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final ntb F0;
    public t88 F1;
    public ValueAnimator F2;
    public mbb G;
    public final otb G0;
    public v88 G1;
    public float H;
    public final fl2 H0;
    public File H1;
    public final RectF I;
    public final ntb I0;
    public ArrayList I1;
    public float J;
    public final el2 J0;
    public ArrayList J1;
    public boolean K;
    public final rgc K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public c8b L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public zt4 N0;
    public long N1;
    public long O;
    public vq3 O0;
    public boolean O1;
    public boolean P;
    public final u59 P0;
    public int P1;
    public final pn Q;
    public final c51 Q0;
    public boolean Q1;
    public Runnable R;
    public final oab R0;
    public boolean R1;
    public mcc S;
    public final pk4 S0;
    public boolean S1;
    public int T;
    public final pk4 T0;
    public boolean T1;
    public int U;
    public final hg5 U0;
    public float U1;
    public int V;
    public final hg5 V0;
    public int V1;
    public boolean W;
    public final r3d W0;
    public boolean W1;
    public boolean X;
    public final kg5 X0;
    public boolean X1;
    public boolean Y;
    public final gbb Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final x53 a;
    public int a0;
    public final ksb a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final igc b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final im8 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final hbb d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final nab e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final fq3 f1;
    public Runnable f2;
    public byte g0;
    public b29 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final e29 h1;
    public z3b h2;
    public final ebb i0;
    public b29 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final a81 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final kg5 l1;
    public boolean l2;
    public final h8b m0;
    public final kg5 m1;
    public w46 m2;
    public final qbb n;
    public final FrameLayout n0;
    public final kg5 n1;
    public do6 n2;
    public final pk4 o0;
    public final kg5 o1;
    public ValueAnimator o2;
    public final i2a p0;
    public final jm8 p1;
    public vpa p2;
    public final ema q0;
    public final j5c q1;
    public Boolean q2;
    public final jbb r;
    public w9b r0;
    public xb1 r1;
    public kab r2;
    public final rk4 s;
    public final tl0 s0;
    public cbb s1;
    public AnimatorSet s2;
    public final o00 t0;
    public dbb t1;
    public boolean t2;
    public final nf9 u0;
    public final ksb u1;
    public int u2;
    public boolean v0;
    public final c51 v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public vab w1;
    public nbb w2;
    public long x;
    public String x0;
    public pa9 x1;
    public boolean x2;
    public ibb y;
    public TLRPC.InputPeer y0;
    public View y1;
    public bab y2;
    public u9b z0;
    public View z1;
    public hl3 z2;

    public rbb(Activity activity, int i) {
        byte b;
        x53 x53Var = new x53();
        this.a = x53Var;
        this.x = 0L;
        this.I = new RectF();
        byte b2 = 1;
        this.N = true;
        this.Q = new pn(null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        this.g0 = (byte) 0;
        this.h0 = -1;
        this.z0 = new u9b();
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
        rab rabVar = new rab(this);
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
        hl.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        qbb qbbVar = new qbb(this, activity);
        this.n = qbbVar;
        jab jabVar = new jab(this, b2);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(qbbVar, jabVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        rk4 rk4Var = new rk4(activity, windowManager, this.n, layoutParams);
        this.s = rk4Var;
        rk4Var.a(new zab(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        qbb qbbVar2 = this.n;
        jbb jbbVar = new jbb(this, activity);
        this.r = jbbVar;
        qbbVar2.addView(jbbVar);
        jbb jbbVar2 = this.r;
        ebb ebbVar = new ebb(this, activity);
        this.i0 = ebbVar;
        jbbVar2.addView(ebbVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new tl0(this.i0);
        this.t0 = new o00();
        jbb jbbVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        jbbVar3.addView(frameLayout);
        jbb jbbVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        jbbVar4.addView(frameLayout2);
        jbb jbbVar5 = this.r;
        h8b h8bVar = new h8b(b2, activity, this);
        this.m0 = h8bVar;
        jbbVar5.addView(h8bVar);
        byte b3 = 8;
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        jbb jbbVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        jbbVar6.addView(frameLayout3);
        byte b4 = 15;
        v21.a(this.n, new py(b4));
        fbb fbbVar = new fbb(this, activity, this.s0, this.r, x53Var);
        this.B0 = fbbVar;
        qbb qbbVar3 = this.n;
        Objects.requireNonNull(qbbVar3);
        byte b5 = 3;
        fbbVar.setCancelGestures(new s8b(qbbVar3, b5));
        this.B0.setResetState(new bab(this, (byte) 11));
        this.i0.addView(this.B0, tre.e(-1, -1, jn7.D1));
        byte b6 = 12;
        this.B0.setOnClickListener(new eab(this, b6));
        ebb ebbVar2 = this.i0;
        boolean z = this.K;
        ebbVar2.setBackgroundColor((z || !z) ? 0 : -14737633);
        ebb ebbVar3 = this.i0;
        float L = hl.L(12.0f);
        yi yiVar = yhc.a;
        ebbVar3.setOutlineProvider(new whc(0, L));
        this.i0.setClipToOutline(true);
        bab babVar = new bab(this, b6);
        b98 b98Var = new b98(activity);
        b98Var.a = new TextPaint(1);
        b98Var.b = new TextPaint(1);
        k43 k43Var = k43.h;
        b98Var.s = new mm(b98Var, 0L, 350L, k43Var);
        b98Var.J = new x38(b98Var, (byte) 6);
        b98Var.y = babVar;
        this.D1 = b98Var;
        gbb gbbVar = new gbb(this, activity, this.s0, this.t0);
        this.Y0 = gbbVar;
        gbbVar.setCollageView(this.B0);
        gbb gbbVar2 = this.Y0;
        gbbVar2.w = new bab(this, (byte) 13);
        gbbVar2.setOnTapListener(new bab(this, (byte) 14));
        this.Y0.setVisibility(8);
        gbb gbbVar3 = this.Y0;
        gbbVar3.O = new bab(this, b4);
        this.i0.addView(gbbVar3, tre.e(-1, -1, jn7.D1));
        this.i0.addView(this.D1, tre.e(-1, -1, jn7.D1));
        qbb qbbVar4 = this.n;
        hbb hbbVar = new hbb(this, activity, qbbVar4, qbbVar4, this.r, x53Var, this.s0);
        this.d1 = hbbVar;
        hbbVar.setAccount(i);
        byte b7 = 4;
        this.d1.setUiBlurBitmap(new bya(b7));
        v21.a(this.m0, new t10(this, (byte) 21));
        this.d1.setOnHeightUpdate(new dab(this, b6));
        this.d1.setOnPeriodUpdate(new dab(this, b5));
        long j = this.O;
        if (j != 0) {
            this.d1.setDialogId(j);
        }
        this.d1.setOnPremiumHint(new dab(this, b7));
        this.d1.setOnKeyboardOpen(new dab(this, (byte) 5));
        nf9 nf9Var = new nf9(b6, activity, this);
        this.u0 = nf9Var;
        this.r.addView(nf9Var);
        ksb ksbVar = new ksb(activity, this.r, this.i0, x53Var, this.s0);
        this.a1 = ksbVar;
        ksbVar.setOnTimelineClick(new bab(this, b3));
        this.a1.setOnHeightChange(new bab(this, (byte) 9));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        frameLayout4.addView(this.a1, tre.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        igc igcVar = new igc(activity);
        this.b1 = igcVar;
        igcVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, tre.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, tre.d(-1, 413.0f, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, tre.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        ksb ksbVar2 = new ksb(activity, this.r, this.i0, x53Var, this.s0);
        this.u1 = ksbVar2;
        ksbVar2.Y0 = true;
        ksbVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, tre.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        nab nabVar = new nab(this, activity, x53Var, this.s0);
        this.e1 = nabVar;
        nabVar.setVisibility(8);
        this.m0.addView(this.e1, tre.e(-1, -2, 85));
        pk4 pk4Var = new pk4(activity);
        this.o0 = pk4Var;
        pk4Var.setContentDescription(ob6.M0(2131754874, null));
        pk4 pk4Var2 = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pk4Var2.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_photo_back);
        pk4 pk4Var3 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        pk4Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(aob.f0(553648127, 1, -1));
        this.o0.setOnClickListener(new eab(this, b2));
        this.j0.addView(this.o0, tre.e(56, 56, 51));
        this.s.a(this.o0);
        i2a i2aVar = new i2a(activity, i);
        this.p0 = i2aVar;
        i2aVar.a(false, false);
        this.p0.setOnClickListener(new jy8(this, activity, (byte) 26));
        this.j0.addView(this.p0, tre.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        ema emaVar = new ema(activity);
        this.q0 = emaVar;
        emaVar.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(hl.o());
        this.q0.l(ob6.M0(2131746080, null), false);
        this.q0.getPaint().setShadowLayer(hl.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(hl.L(144.0f));
        this.j0.addView(this.q0, tre.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, tre.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        dab dabVar = new dab(this, (byte) 6);
        qbb qbbVar5 = this.n;
        fq3 fq3Var = new fq3(activity);
        fq3Var.x = true;
        fq3Var.y = true;
        fq3Var.h = dabVar;
        fq3Var.a = i;
        fq3Var.b = qbbVar5;
        fq3Var.setScaleType(scaleType);
        fq3Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        fq3Var.setBackground(aob.f0(553648127, 1, -1));
        fq3Var.setVisibility(8);
        fq3Var.setAlpha(0.0f);
        fq3Var.setOnClickListener(new mh3(fq3Var, b7));
        fq3Var.f = new di2(hl.L(18.0f), hl.L(2.0f), -1);
        fq3Var.d();
        this.f1 = fq3Var;
        kg5 kg5Var = new kg5(activity, 1);
        kg5Var.n(1.0f, -71.0f);
        kg5Var.d = 2000L;
        kg5Var.V = false;
        kg5Var.I.r(true, false);
        this.l1 = kg5Var;
        kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        this.j0.addView(this.l1, tre.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        e29 e29Var = new e29(activity);
        this.h1 = e29Var;
        e29Var.setScaleType(scaleType);
        e29 e29Var2 = this.h1;
        c8b c8bVar = this.L1;
        e29Var2.setImageResource((c8bVar == null || !c8bVar.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(aob.f0(553648127, 1, -1));
        this.h1.setOnClickListener(new eab(this, (byte) 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        a81 a81Var = new a81(activity);
        this.k1 = a81Var;
        a81Var.setBackground(aob.f0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new eab(this, (byte) 3));
        this.k0.addView(this.k1, tre.r(46, 56, 53));
        this.k0.addView(this.h1, tre.r(46, 56, 53));
        this.k0.addView(this.f1, tre.e(46, 56, 53));
        ntb ntbVar = new ntb(activity);
        this.F0 = ntbVar;
        ntbVar.setBackground(aob.f0(553648127, 1, -1));
        this.F0.setOnClickListener(new eab(this, b7));
        this.F0.setOnLongClickListener(new zs(this, (byte) 18));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, tre.e(56, 56, 53));
        otb otbVar = new otb(activity);
        this.G0 = otbVar;
        otbVar.setContentDescription(ob6.M0(2131754882, null));
        this.G0.setOnClickListener(new eab(this, (byte) 5));
        boolean g0 = as3.g0(activity);
        this.G0.setVisibility(g0 ? 0 : 8);
        this.G0.setAlpha(g0 ? 1.0f : 0.0f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, tre.e(56, 56, 53));
        fl2 fl2Var = new fl2(activity);
        this.H0 = fl2Var;
        fl2Var.setContentDescription(ob6.M0(2131754891, null));
        this.H0.setBackground(aob.f0(553648127, 1, -1));
        if (this.A0 == null) {
            b = 6;
            this.A0 = (al2) al2.a().get(6);
        } else {
            b = 6;
        }
        this.H0.setOnClickListener(new eab(this, b));
        this.H0.a(new bl2(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, tre.e(56, 56, 53));
        ntb ntbVar2 = new ntb(activity);
        this.I0 = ntbVar2;
        ntbVar2.setContentDescription(ob6.M0(2131754890, null));
        this.I0.setBackground(aob.f0(553648127, 1, -1));
        this.I0.a(new bl2(new al2("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        byte b8 = 7;
        this.I0.setOnClickListener(new eab(this, b8));
        this.s.a(this.I0);
        this.j0.addView(this.I0, tre.e(56, 56, 53));
        el2 el2Var = new el2(activity, this.s);
        this.J0 = el2Var;
        el2Var.a.x0(6);
        this.J0.setSelected((al2) null);
        this.J0.setOnLayoutClick(new dab(this, b8));
        this.j0.addView(this.J0, tre.e(-1, 56, 53));
        kg5 kg5Var2 = new kg5(activity, 1);
        kg5Var2.n(1.0f, -20.0f);
        kg5Var2.d = 5000L;
        kg5Var2.j(true);
        kg5Var2.t(ob6.M0(2131744370, null));
        kg5Var2.r0 = new osa(b7);
        this.m1 = kg5Var2;
        kg5Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        this.j0.addView(this.m1, tre.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        kg5 kg5Var3 = new kg5(activity, 2);
        kg5Var3.n(0.0f, 28.0f);
        kg5Var3.d = 5000L;
        kg5Var3.p(true);
        this.n1 = kg5Var3;
        this.j0.addView(kg5Var3, tre.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        kg5 kg5Var4 = new kg5(activity, 1);
        kg5Var4.n(1.0f, -20.0f);
        kg5Var4.d = 5000L;
        kg5Var4.t(ob6.M0(2131744358, null));
        this.o1 = kg5Var4;
        kg5Var4.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        this.j0.addView(this.o1, tre.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        rgc rgcVar = new rgc(activity);
        Paint paint = new Paint(1);
        rgcVar.a = paint;
        Paint paint2 = new Paint(1);
        rgcVar.b = paint2;
        rgcVar.e = new mm(rgcVar, 0L, 250L, k43Var);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        hn hnVar = new hn(false, true, true);
        rgcVar.c = hnVar;
        hnVar.n(0.3f, 250L, k43Var);
        hnVar.w(hl.L(13.0f));
        hnVar.u(-1);
        hnVar.x(hl.o());
        hnVar.setCallback(rgcVar);
        hnVar.b = 1;
        rgcVar.a(0L, false);
        this.K0 = rgcVar;
        h0(false, false);
        this.j0.addView(this.K0, tre.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.R(0);
        u59 u59Var = new u59(activity);
        this.P0 = u59Var;
        u59Var.setDelegate(rabVar);
        u59 u59Var2 = this.P0;
        boolean z2 = this.P1 == 1;
        u59Var2.o0 = -1.0f;
        u59Var2.p0 = z2;
        u59Var2.invalidate();
        this.l0.addView(this.P0, tre.e(-1, 100, 87));
        this.s.a(this.P0);
        this.P0.e(true, this.B0.i() ? this.B0.getFilledProgress() : 0.0f);
        c51 c51Var = new c51(x53Var, activity, true);
        this.Q0 = c51Var;
        c51Var.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(ob6.M0(2131748542, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, tre.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new eab(this, (byte) 8));
        kg5 kg5Var5 = new kg5(activity, 3);
        kg5Var5.p(true);
        kg5Var5.t(ob6.M0(2131744368, null));
        kg5Var5.h = hl.L(320.0f);
        kg5Var5.d = 5000L;
        kg5Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = kg5Var5;
        this.l0.addView(kg5Var5, tre.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        r3d r3dVar = new r3d(activity);
        this.W0 = r3dVar;
        r3dVar.N = false;
        r3dVar.setAlpha(0.0f);
        this.l0.addView(this.W0, tre.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new jab(this, (byte) 4));
        r3d r3dVar2 = this.W0;
        this.U1 = 0.0f;
        r3dVar2.b(false, 0.0f);
        du9 du9Var = new du9(activity, i, new bab(this, (byte) 10));
        this.E0 = du9Var;
        du9Var.c = new dab(this, (byte) 8);
        this.l0.addView(du9Var, tre.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        oab oabVar = new oab(this, activity);
        this.R0 = oabVar;
        oabVar.setOnSwitchModeListener(new dab(this, (byte) 9));
        this.R0.setOnSwitchingModeListener(new dab(this, (byte) 10));
        this.n0.addView(this.R0, tre.e(-1, 48, 55));
        this.s.a(this.R0);
        pk4 pk4Var4 = new pk4(activity);
        this.S0 = pk4Var4;
        pk4Var4.setContentDescription(ob6.M0(2131754747, null));
        this.S0.setImageResource(R.drawable.stream_flip);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(aob.f0(553648127, 1, -1));
        this.n0.addView(this.S0, tre.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new eab(this, (byte) 9));
        pk4 pk4Var5 = new pk4(activity);
        this.T0 = pk4Var5;
        pk4Var5.setContentDescription(ob6.M0(2131748544, null));
        this.T0.setImageResource(R.drawable.stream_settings);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(aob.f0(553648127, 1, -1));
        this.n0.addView(this.T0, tre.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new eab(this, (byte) 10));
        hg5 hg5Var = new hg5(activity);
        this.U0 = hg5Var;
        this.n0.addView(hg5Var, tre.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        hg5 hg5Var2 = new hg5(activity);
        this.V0 = hg5Var2;
        hg5Var2.a.t(ob6.M0(2131744357, null), false, true);
        hg5Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, tre.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        c51 c51Var2 = new c51(x53Var, activity, true);
        c51Var2.setRoundRadius(24);
        this.v1 = c51Var2;
        c51Var2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(ob6.M0(2131744343, null), false, true);
        byte b9 = 11;
        this.v1.setOnClickListener(new eab(this, b9));
        this.n0.addView(this.v1, tre.d(-1, 48.0f, jn7.D1, 10.0f, 10.0f, 10.0f, 10.0f));
        im8 im8Var = new im8(activity);
        im8Var.b = new ArrayList();
        im8Var.e = true;
        im8Var.h = true;
        View view = new View(activity);
        im8Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        im8Var.addView(view, tre.e(-1, -1, jn7.D1));
        im8Var.a(0, R.drawable.media_draw, ob6.M0(2131754809, null));
        im8Var.a(2, R.drawable.msg_photo_sticker, ob6.M0(2131754751, null));
        im8Var.a(1, R.drawable.msg_photo_text2, ob6.M0(2131754802, null));
        im8Var.a(3, R.drawable.media_crop, ob6.M0(2131751664, null));
        im8Var.a(4, R.drawable.msg_photo_settings, ob6.M0(2131754806, null));
        String M0 = ob6.M0(2131745368, null);
        im8Var.d = M0;
        im8Var.e = true;
        hm8 hm8Var = new hm8(im8Var, activity, M0, true);
        im8Var.c = hm8Var;
        hm8Var.setContentDescription(ob6.M0(2131745368, null));
        im8Var.addView(im8Var.c, tre.c(-2.0f, -2));
        im8Var.e();
        this.c1 = im8Var;
        im8Var.setVisibility(8);
        this.c1.setOnClickListener(new dab(this, b9));
        this.n0.addView(this.c1, tre.e(-1, 52, 23));
        j5c j5cVar = new j5c(activity);
        this.q1 = j5cVar;
        j5cVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, tre.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        jm8 jm8Var = new jm8(activity, i, x53Var);
        this.p1 = jm8Var;
        this.i0.addView(jm8Var, tre.e(-1, -1, jn7.D1));
        l0(false);
    }

    public static rbb C(Activity activity, int i) {
        rbb rbbVar = G2;
        if (rbbVar != null && (rbbVar.b != activity || rbbVar.c != i)) {
            rbbVar.o(false);
            rbbVar = null;
            G2 = null;
        }
        if (rbbVar != null) {
            return rbbVar;
        }
        rbb rbbVar2 = new rbb(activity, i);
        G2 = rbbVar2;
        return rbbVar2;
    }

    public static SpannableString k(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable e = c00.e(context, R.drawable.story_camera);
        int L = hl.L(35.0f);
        int i = -L;
        e.setBounds(i / 4, i, (L / 4) * 3, 0);
        spannableString.setSpan(new abb(e, e), 0, 1, 33);
        return spannableString;
    }

    public static void v() {
        rbb rbbVar = G2;
        if (rbbVar != null) {
            rbbVar.o(false);
        }
        G2 = null;
    }

    public final String A() {
        wab wabVar = this.C0;
        if (wabVar == null || wabVar.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        m();
        return (String) this.v2.get(this.u2);
    }

    public final vq3 B() {
        if (this.O0 == null) {
            vq3 vq3Var = new vq3(this.b);
            this.O0 = vq3Var;
            this.l0.addView(vq3Var, tre.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String D() {
        wab wabVar = this.C0;
        if (wabVar == null || wabVar.getCameraSession() == null) {
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
            b29 b29Var = new b29(R.raw.sun_outline, hl.L(28.0f), hl.L(28.0f), true, null);
            this.i1 = b29Var;
            b29Var.h = true;
            c8b c8bVar = this.L1;
            byte b = 0;
            if (c8bVar == null || !c8bVar.y0) {
                b29Var.K(0);
                this.i1.H(0);
            } else {
                b29Var.H(35);
                this.i1.K(36);
            }
            this.i1.a0 = true;
            int v0 = aob.v0(aob.J9, this.a);
            this.i1.L(v0, "Sunny");
            this.i1.L(v0, "Path 6");
            this.i1.L(v0, "Path");
            this.i1.L(v0, "Path 5");
            this.i1.j();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(aob.f0(553648127, 1, -1));
            this.j1.setOnClickListener(new eab(this, b));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, tre.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void F() {
        vab vabVar = this.w1;
        if (vabVar == null) {
            return;
        }
        this.w2 = null;
        vabVar.getTopLayout().setAlpha(0.0f);
        this.w1.getTopLayout().setTranslationY(-hl.L(16.0f));
        this.w1.getBottomLayout().setAlpha(0.0f);
        this.w1.getBottomLayout().setTranslationY(hl.L(48.0f));
        this.w1.getWeightChooserView().setTranslationX(-hl.L(32.0f));
        this.w1.setVisibility(8);
    }

    public final boolean G() {
        return !this.b2 && (this.B0.i() ? this.B0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean H() {
        zt4 zt4Var;
        if (this.X || (zt4Var = this.N0) == null) {
            return false;
        }
        return zt4Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) hl.q.y) * 0.35f))) - (a.getCurrentActionBarHeight() + hl.m)));
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
        c8b c8bVar;
        c8b c8bVar2;
        c51 c51Var;
        ema emaVar;
        int i2;
        char c;
        float L;
        ImageView imageView;
        c8b c8bVar3;
        c8b c8bVar4;
        c8b c8bVar5;
        c8b c8bVar6;
        wab wabVar;
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
        im8 im8Var = this.c1;
        if (im8Var != null) {
            im8Var.b(i == 1, z);
        }
        el2 el2Var = this.J0;
        h0(i == 0 && this.P1 == 1 && !el2Var.e && !G(), z);
        if (i != 1) {
            this.b1.a(z);
        }
        b0(this.o0, !el2Var.e, z);
        b0(this.F0, (this.b2 || i != 0 || el2Var.e || this.Z1 == null || G()) ? false : true, z);
        boolean z2 = this.b2;
        fbb fbbVar = this.B0;
        b0(this.G0, (z2 || i != 0 || (wabVar = this.C0) == null || !wabVar.a || el2Var.e || fbbVar.i()) ? false : true, true);
        b0(this.H0, (this.b2 || i != 0 || el2Var.e) ? false : true, z);
        l0(z);
        fq3 fq3Var = this.f1;
        a81 a81Var = this.k1;
        e29 e29Var = this.h1;
        ksb ksbVar = this.u1;
        ksb ksbVar2 = this.a1;
        c51 c51Var2 = this.v1;
        ema emaVar2 = this.q0;
        hbb hbbVar = this.d1;
        hg5 hg5Var = this.V0;
        hg5 hg5Var2 = this.U0;
        du9 du9Var = this.E0;
        gbb gbbVar = this.Y0;
        h8b h8bVar = this.m0;
        oab oabVar = this.R0;
        u59 u59Var = this.P0;
        if (!z) {
            wab wabVar2 = this.C0;
            if (wabVar2 != null) {
                wabVar2.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            gbbVar.setAlpha(((i != 1 || fbbVar.i()) && i != 2) ? 0.0f : 1.0f);
            fbbVar.setAlpha((i == 0 || (i == 1 && fbbVar.i())) ? 1.0f : 0.0f);
            u59Var.setAlpha(i == 0 ? 1.0f : 0.0f);
            u59Var.setTranslationY(i == 0 ? 0.0f : hl.L(16.0f));
            du9Var.setAlpha(i == 0 ? 1.0f : 0.0f);
            oabVar.setAlpha((i != 0 || G()) ? 0.0f : 1.0f);
            oabVar.setTranslationY((i != 0 || G()) ? hl.L(16.0f) : 0.0f);
            hg5Var2.setAlpha((i == 0 && this.b2 && !G()) ? 1.0f : 0.0f);
            hg5Var.setAlpha((i == 0 && !this.b2 && G()) ? 0.6f : 0.0f);
            h8bVar.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
            h8bVar.setTranslationY((i == 1 || i == 2) ? 0.0f : hl.L(12.0f));
            hbbVar.setAlpha(i == 2 ? 0.0f : 1.0f);
            e29Var.setAlpha((i == 1 && this.P1 == 1) ? 1.0f : 0.0f);
            a81Var.setAlpha((i != 1 || (this.P1 != 1 && ((c8bVar2 = this.L1) == null || TextUtils.isEmpty(c8bVar2.y)))) ? 0.0f : 1.0f);
            boolean z3 = true;
            fq3Var.setAlpha(i == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.j1;
            if (imageView2 != null) {
                imageView2.setAlpha((i == 1 && (c8bVar = this.L1) != null && c8bVar.u) ? 1.0f : 0.0f);
                z3 = true;
            }
            ksbVar2.setAlpha(i == z3 ? 1.0f : 0.0f);
            ksbVar.setAlpha(i == 2 ? 1.0f : 0.0f);
            emaVar2.setAlpha((i == z3 || i == 2) ? 1.0f : 0.0f);
            c51Var2.setAlpha(i == 2 ? 1.0f : 0.0f);
            L(b, i);
            return;
        }
        this.j2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        wab wabVar3 = this.C0;
        if (wabVar3 != null) {
            c51Var = c51Var2;
            emaVar = emaVar2;
            i2 = 1;
            arrayList.add(ObjectAnimator.ofFloat(wabVar3, (Property<wab, Float>) View.ALPHA, i == 0 ? 1.0f : 0.0f));
        } else {
            c51Var = c51Var2;
            emaVar = emaVar2;
            i2 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i2];
        fArr[0] = ((i != i2 || fbbVar.i()) && i != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(gbbVar, (Property<gbb, Float>) property, fArr));
        float[] fArr2 = new float[i2];
        fArr2[0] = (i == 0 || (i == i2 && fbbVar.i())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(fbbVar, (Property<fbb, Float>) property, fArr2));
        float[] fArr3 = new float[i2];
        fArr3[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(u59Var, (Property<u59, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i2];
        fArr4[0] = i == 0 ? 0.0f : hl.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(u59Var, (Property<u59, Float>) property2, fArr4));
        float[] fArr5 = new float[i2];
        fArr5[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(du9Var, (Property<du9, Float>) property, fArr5));
        float[] fArr6 = new float[i2];
        fArr6[0] = (i != 0 || G()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(oabVar, (Property<oab, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(oabVar, (Property<oab, Float>) property2, (i != 0 || G()) ? hl.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(hg5Var2, (Property<hg5, Float>) property, (i == 0 && this.b2 && !G()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(hg5Var, (Property<hg5, Float>) property, (i == 0 && !this.b2 && G()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(h8bVar, (Property<h8b, Float>) property, ((i == 1 && ((c8bVar6 = this.L1) == null || c8bVar6.J0 == 0)) || i == 2) ? 1.0f : 0.0f));
        if (i == 1 && ((c8bVar5 = this.L1) == null || c8bVar5.J0 == 0)) {
            c = 2;
        } else {
            c = 2;
            if (i != 2) {
                L = hl.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(h8bVar, (Property<h8b, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(hbbVar, (Property<hbb, Float>) property, i != c ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property, (i != 1 || i == c) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(c51Var, (Property<c51, Float>) property, i != c ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ksbVar2, (Property<ksb, Float>) property, i != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ksbVar, (Property<ksb, Float>) property, i != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property, (i == 1 || this.P1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property, (i == 1 || (this.P1 != 1 && ((c8bVar4 = this.L1) == null || TextUtils.isEmpty(c8bVar4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property, i != 1 ? 1.0f : 0.0f));
                imageView = this.j1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i == 1 && (c8bVar3 = this.L1) != null && c8bVar3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<r3d, Float>) property, 0.0f));
                this.j2.playTogether(arrayList);
                this.j2.addListener(new sab(this, b, i));
                this.j2.setDuration(460L);
                this.j2.setInterpolator(k43.h);
                this.j2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(h8bVar, (Property<h8b, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(hbbVar, (Property<hbb, Float>) property, i != c ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property, (i != 1 || i == c) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(c51Var, (Property<c51, Float>) property, i != c ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ksbVar2, (Property<ksb, Float>) property, i != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ksbVar, (Property<ksb, Float>) property, i != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property, (i == 1 || this.P1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property, (i == 1 || (this.P1 != 1 && ((c8bVar4 = this.L1) == null || TextUtils.isEmpty(c8bVar4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property, i != 1 ? 1.0f : 0.0f));
        imageView = this.j1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<r3d, Float>) property, 0.0f));
        this.j2.playTogether(arrayList);
        this.j2.addListener(new sab(this, b, i));
        this.j2.setDuration(460L);
        this.j2.setInterpolator(k43.h);
        this.j2.start();
    }

    public final void J(Runnable runnable, long j) {
        if (this.T1 || this.L1 == null) {
            return;
        }
        z3b z3bVar = this.h2;
        if (z3bVar != null) {
            hl.r(z3bVar);
        }
        this.i2 = true;
        this.T1 = true;
        this.h2 = new z3b(this, runnable, (byte) 28);
        gbb gbbVar = this.Y0;
        gbbVar.setAlpha(0.0f);
        gbbVar.setVisibility(0);
        gbbVar.n(this.L1, this.h2, j);
        gbbVar.q(this.L1, false);
        hl.d3(this.h2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f0, code lost:
    
        if (r0.k == false) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K() {
        c8b c8bVar;
        c8b c8bVar2;
        c8b c8bVar3;
        vab vabVar;
        c8b c8bVar4;
        vab vabVar2;
        vab vabVar3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            hbb hbbVar = this.d1;
            if (hbbVar != null && hbbVar.O1) {
                hbbVar.N1 = false;
                hbbVar.z(false, false);
                return false;
            }
            if (this.R1) {
                u59 u59Var = this.P0;
                if (u59Var.s0) {
                    u59Var.s0 = false;
                    u59Var.w0 = SystemClock.elapsedRealtime();
                    u59Var.v0 = true;
                    ((rab) u59Var.a).e(false);
                    u59Var.K.c(false);
                    u59Var.L.c(false);
                    u59Var.M.c(false);
                    u59Var.invalidate();
                    return false;
                }
            } else if (!this.Q1 && !hbbVar.p()) {
                nab nabVar = this.e1;
                if (nabVar.N) {
                    nabVar.c(false, true);
                    return false;
                }
                zt4 zt4Var = this.N0;
                if (zt4Var != null) {
                    s7 s7Var = zt4Var.H;
                    if (s7Var == null || !s7Var.w()) {
                        c(false);
                        this.n2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = s7Var.getSearchField();
                    if (zt4Var.w.c()) {
                        hl.t1(searchField);
                        return false;
                    }
                    zt4Var.y.C(s7Var.T(true));
                    return false;
                }
                if (this.h0 != 0 || (vabVar3 = this.w1) == null || !vabVar3.x0()) {
                    if (this.h0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    byte b = this.g0;
                    fbb fbbVar = this.B0;
                    if (b == 0) {
                        ArrayList arrayList = fbbVar.h;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((jl2) obj).n != null) {
                                fbbVar.b();
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.g0 == 1 && (((c8bVar2 = this.L1) == null || (!c8bVar2.n && !c8bVar2.u)) && !this.v0)) {
                        if (c8bVar2 != null && c8bVar2.g && ((vabVar2 = this.w1) == null || !vabVar2.r0())) {
                            c8b c8bVar5 = this.L1;
                            if (!c8bVar5.j) {
                            }
                        }
                        vab vabVar4 = this.w1;
                        if (vabVar4 == null || !vabVar4.x0()) {
                            if (this.w0 == 0 && (((this.M1 && !fbbVar.i() && (((vabVar = this.w1) == null || !vabVar.r0()) && ((c8bVar4 = this.L1) == null || c8bVar4.Z0 == null))) || !this.c1.h) && (((c8bVar3 = this.L1) == null || !c8bVar3.g || (!c8bVar3.n && !c8bVar3.u)) && !this.v0 && (c8bVar3 == null || !c8bVar3.o)))) {
                                I(0, true);
                                return false;
                            }
                            if (this.w0 != 0) {
                                o(true);
                                return false;
                            }
                            x53 x53Var = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, x53Var, this.b);
                            String M0 = ob6.M0(2131751370, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            idVar.U = ob6.M0(2131747005, null);
                            c8b c8bVar6 = this.L1;
                            if (c8bVar6 != null && !c8bVar6.g && !c8bVar6.o) {
                                alertDialog$Builder.h(ob6.M0(c8bVar6.c ? 2131744307 : 2131744139, null), new jab(this, (byte) 7));
                            }
                            c8b c8bVar7 = this.L1;
                            alertDialog$Builder.j(ob6.M0((c8bVar7 == null || !c8bVar7.c || c8bVar7.g) ? 2131751371 : 2131744340, null), new jab(this, (byte) 8));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            idVar.show();
                            View c = idVar.c(-1);
                            if (c instanceof TextView) {
                                int i2 = aob.q7;
                                yob.X((TextView) c, i2, x53Var);
                                hf0 Y = aob.Y(vm2.o(aob.v0(i2, x53Var), 51), 6, 6);
                                uob g = yob.g(i2, 51);
                                c.setBackground(Y);
                                yob.j(c, Y, null, g, x53Var);
                            }
                        }
                    }
                    if (this.g0 != 2 || (c8bVar = this.L1) == null || c8bVar.b0) {
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
        u59 u59Var = this.P0;
        if (i == 0) {
            t(false);
            u59Var.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            e(false, false);
            c0(false);
        }
        hbb hbbVar = this.d1;
        h8b h8bVar = this.m0;
        if (i == 2) {
            this.u1.setVisibility(8);
            h8bVar.setVisibility(i2 == 1 ? 0 : 8);
            hbbVar.setVisibility(8);
            this.v1.setVisibility(8);
        }
        igc igcVar = this.b1;
        gbb gbbVar = this.Y0;
        if (i == 1) {
            this.c1.setVisibility(8);
            h8bVar.setVisibility(i2 == 2 ? 0 : 8);
            this.h1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setVisibility(8);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            gbbVar.setVisibility(i2 == 2 ? 0 : 8);
            this.a1.setVisibility(8);
            if (i2 != 2) {
                x();
                w();
            }
            this.q0.setVisibility(i2 == 2 ? 0 : 8);
            u();
            j5c j5cVar = this.q1;
            j5cVar.setAlpha(0.0f);
            j5cVar.setVisibility(8);
            igcVar.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        b98 b98Var = this.D1;
        if (i2 == 1) {
            c8b c8bVar = this.L1;
            if (c8bVar == null || !c8bVar.n) {
                s();
                F();
            }
            if (b98Var != null) {
                b98Var.setAllowTouch(false);
            }
            gbbVar.x(2, false);
            gbbVar.x(3, false);
            gbbVar.x(4, false);
            gbbVar.x(5, false);
            gbbVar.x(7, false);
            c8b c8bVar2 = this.L1;
            j = 0;
            igcVar.setVisibility((c8bVar2 == null || c8bVar2.h0 < 30000) ? 8 : 0);
            h8bVar.setAlpha(1.0f);
            h8bVar.setTranslationY(0.0f);
            c8b c8bVar3 = this.L1;
            hbbVar.setVisibility((c8bVar3 == null || c8bVar3.J0 == 0) ? 0 : 8);
        } else {
            j = 0;
        }
        if (i2 == 0 && this.W1) {
            B().setVisibility(0);
            vq3 B = B();
            B.r.e(true, 0.0f);
            B.a(true);
            zg3 zg3Var = B.h;
            if (zg3Var != null) {
                hl.r(zg3Var);
            }
            zg3 zg3Var2 = new zg3(B, (byte) 17);
            B.h = zg3Var2;
            hl.d3(zg3Var2, 3500L);
            u59Var.h();
        }
        this.W1 = false;
        if (b98Var != null) {
            b98Var.setAllowTouch(i2 == 1 && ((i3 = this.h0) == -1 || i3 == 1));
        }
        if (hbbVar != null) {
            hbbVar.e0 = i2 != 1;
        }
        if (i2 == 1) {
            int i4 = this.c;
            ls6.d0(i4).D(0);
            ls6.d0(i4).X0(false, true, false, 0);
            ls6.d0(i4).X0(false, true, false, 2);
            c6b O1 = uc7.s1(i4).O1();
            if (O1.Q == j) {
                O1.R();
            }
            uc7.s1(i4).O1().T();
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
        fbb fbbVar;
        ?? r8;
        int i3;
        CharSequence charSequence;
        SpannableStringBuilder append;
        String str;
        c8b c8bVar;
        boolean z;
        String str2;
        fu5 fu5Var;
        boolean z2;
        c8b c8bVar2;
        boolean z3;
        CharSequence charSequence2;
        boolean z4;
        c8b c8bVar3;
        boolean z5;
        xx n;
        c8b c8bVar4;
        kec textureView;
        c8b c8bVar5;
        fbb fbbVar2 = this.B0;
        if (i2 == 0) {
            Z(false);
            u59 u59Var = this.P0;
            u59Var.setVisibility(0);
            if (u59Var != null) {
                u59Var.g(false);
            }
            this.R0.setVisibility(0);
            r3d r3dVar = this.W0;
            r3dVar.setVisibility(0);
            r3dVar.setAlpha(0.0f);
            this.K0.a(0L, true);
            c8b c8bVar6 = this.L1;
            if (c8bVar6 != null) {
                c8bVar6.i(false);
                this.L1 = null;
            }
            if (fbbVar2 != null) {
                fbbVar2.b();
                u59Var.e(false, 0.0f);
            }
        }
        if (i == 0) {
            d0(null);
            a0(new bab(this, (byte) 16));
            vq3 vq3Var = this.O0;
            if (vq3Var != null) {
                vq3Var.setVisibility(8);
            }
            this.X0.f(true);
            kg5 kg5Var = this.m1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
        }
        ksb ksbVar = this.a1;
        h8b h8bVar = this.m0;
        e29 e29Var = this.h1;
        im8 im8Var = this.c1;
        gbb gbbVar = this.Y0;
        hbb hbbVar = this.d1;
        ema emaVar = this.q0;
        int i4 = this.c;
        if (i2 == 1 || i == 1) {
            c8b c8bVar7 = i2 == 1 ? this.L1 : null;
            fq3 fq3Var = this.f1;
            fq3Var.setEntry(c8bVar7);
            int i5 = this.P1;
            fbbVar = fbbVar2;
            a81 a81Var = this.k1;
            if (i5 == 1) {
                e29Var.setVisibility(0);
                c8b c8bVar8 = this.L1;
                e0(c8bVar8 != null && c8bVar8.Y, false);
                a81Var.setVisibility(0);
                gbbVar.x(-9982, false);
                ((mf8) a81Var.c).a(gbbVar.j(), false);
                emaVar.setRightPadding(hl.L(144.0f));
                r8 = 0;
            } else {
                c8b c8bVar9 = this.L1;
                if (c8bVar9 == null || TextUtils.isEmpty(c8bVar9.y)) {
                    r8 = 0;
                    emaVar.setRightPadding(hl.L(48.0f));
                } else {
                    e29Var.setVisibility(8);
                    r8 = 0;
                    a81Var.setVisibility(0);
                    ((mf8) a81Var.c).a(true, false);
                    emaVar.setRightPadding(hl.L(48.0f));
                }
            }
            fq3Var.setVisibility(r8);
            c8b c8bVar10 = this.L1;
            if (c8bVar10 == null || !c8bVar10.u) {
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                E().setVisibility(r8);
                n0(r8);
            }
            im8Var.setVisibility(r8);
            gbbVar.setVisibility(r8);
            c8b c8bVar11 = this.L1;
            hbbVar.setVisibility(((c8bVar11 == null || c8bVar11.J0 == 0) && this.w0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Z0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            c8b c8bVar12 = this.L1;
            layoutParams.bottomMargin = hl.L(((c8bVar12 == null || c8bVar12.J0 == 0) && this.w0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            h8bVar.setVisibility(0);
            h8bVar.clearFocus();
            c8b c8bVar13 = this.L1;
            hbbVar.A(c8bVar13 == null ? 86400 : c8bVar13.I0, false);
            hbbVar.setPeriodVisible(!uc7.s1(i4).M3() && ((c8bVar = this.L1) == null || !c8bVar.g));
            c8b c8bVar14 = this.L1;
            hbbVar.setHasRoundVideo((c8bVar14 == null || c8bVar14.o0 == null) ? false : true);
            if (hbbVar == null) {
                i3 = i4;
                charSequence = "";
            } else {
                c8b c8bVar15 = this.L1;
                if (c8bVar15 == null || !c8bVar15.n) {
                    i3 = i4;
                    charSequence = "";
                    hbbVar.v(null, null);
                } else {
                    TLRPC.Peer peer = c8bVar15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        charSequence = "";
                        String r = lbc.r(uc7.s1(i4).X1(Long.valueOf(peer.user_id)));
                        c8b c8bVar16 = this.L1;
                        append = new SpannableStringBuilder(r47.g6()).append((CharSequence) " ").append((CharSequence) r);
                        c8bVar16.p = append;
                    } else {
                        charSequence = "";
                        TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(-wf3.n(peer)));
                        CharSequence charSequence3 = M0 == null ? charSequence : M0.title;
                        c8b c8bVar17 = this.L1;
                        append = new SpannableStringBuilder(r47.g6()).append((CharSequence) " ").append(charSequence3);
                        c8bVar17.p = append;
                    }
                    String str3 = this.L1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(ob6.M0(2131744392, null));
                        i3 = i4;
                        spannableString.setSpan(new p37((byte) 4), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i3 = i4;
                        str = str3;
                    }
                    hbbVar.v(append, str);
                }
            }
            c8b c8bVar18 = this.L1;
            boolean z6 = (c8bVar18 != null && c8bVar18.v() && this.L1.t()) ? false : true;
            boolean z7 = ksbVar.k0;
            ksbVar.k0 = z6;
            ksbVar.j0.f(z6, true);
            ksbVar.invalidate();
        } else {
            fbbVar = fbbVar2;
            i3 = i4;
            charSequence = "";
        }
        c51 c51Var = this.v1;
        ksb ksbVar2 = this.u1;
        int i6 = 2;
        if (i2 == 2 || i == 2) {
            z = false;
            emaVar.setVisibility(0);
            ksbVar2.setVisibility(0);
            c8b c8bVar19 = this.L1;
            if (c8bVar19 == null || !c8bVar19.b0) {
                str2 = null;
            } else {
                str2 = null;
                emaVar.l(ob6.M0(2131746082, null), false);
            }
            h8bVar.setVisibility(0);
            c51Var.setVisibility(0);
            i6 = 2;
        } else {
            z = false;
            str2 = null;
        }
        if (i2 == i6) {
            emaVar.l(ob6.M0(2131746082, str2), z);
        }
        nab nabVar = this.e1;
        if (i2 == 1) {
            this.O1 = z;
            c8b c8bVar20 = this.L1;
            boolean z8 = (c8bVar20 == null || c8bVar20.J0 == 0) ? false : true;
            boolean z9 = c8bVar20 != null && c8bVar20.g;
            String M02 = ob6.M0(z9 ? 2131751319 : z8 ? 2131743459 : 2131747981, null);
            boolean z10 = !z8;
            boolean z11 = z9;
            if (TextUtils.equals(M02, im8Var.d) && z10 == im8Var.e) {
                z3 = z8;
            } else {
                im8Var.removeView(im8Var.c);
                z3 = z8;
                Context context = im8Var.getContext();
                im8Var.d = M02;
                im8Var.e = z10;
                hm8 hm8Var = new hm8(im8Var, context, M02, z10);
                im8Var.c = hm8Var;
                hm8Var.setContentDescription(M02);
                im8Var.addView(im8Var.c, tre.c(-2.0f, -2));
                im8Var.e();
            }
            ksbVar2.setVisibility(8);
            c51Var.setVisibility(8);
            if (!this.i2) {
                c8b c8bVar21 = this.L1;
                if (c8bVar21 == null || !c8bVar21.u) {
                    gbbVar.set(c8bVar21);
                } else {
                    gbbVar.l(c8bVar21);
                }
            }
            this.i2 = false;
            hbbVar.f.getEditText().setOnPremiumMenuLockClickListener(uc7.s1(i3).l5() ? null : new bab(this, (byte) 17));
            nabVar.setVisibility(this.I1 == null ? 8 : 0);
            ArrayList arrayList = this.I1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.K1;
                ArrayList arrayList3 = this.J1;
                nabVar.c(false, false);
                nabVar.c = arrayList;
                nabVar.d = arrayList2;
                nabVar.e = arrayList3;
                nabVar.x = new pkb(Integer.toString(arrayList.size()), 20.0f, hl.n1("fonts/num.otf"));
                nabVar.L = new pkb(ob6.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                nabVar.b.g3.O(false);
                nabVar.setSelected(this.I1.indexOf(this.L1));
            }
            ksbVar.setMaxCount((z3 || z11 || this.I1 != null || ((c8bVar5 = this.L1) != null && (c8bVar5.v() || !this.L1.K))) ? 1 : 3);
            if (i != 2) {
                c8b c8bVar22 = this.L1;
                if (c8bVar22 == null || !(c8bVar22.c || c8bVar22.g || this.v0)) {
                    hbbVar.W = true;
                    charSequence2 = charSequence;
                    hbbVar.f.setText(charSequence2);
                    c8b c8bVar23 = this.L1;
                    im8Var.d(4, c8bVar23 != null || ((!c8bVar23.u || c8bVar23.K) && !c8bVar23.v()));
                    boolean z12 = f11.a;
                    im8Var.d(3, false);
                    if (!this.O1 && !hbbVar.o()) {
                        c6b O1 = uc7.s1(i3).O1();
                        int z13 = z();
                        n = O1.n();
                        if (n != null || !n.a(O1.a, z13) || ((c8bVar4 = this.L1) != null && (c8bVar4.g || c8bVar4.J0 != 0))) {
                            z4 = true;
                            im8Var.setShareEnabled(z4);
                            c8b c8bVar24 = this.L1;
                            e29Var.setImageResource((c8bVar24 == null && c8bVar24.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                            gbbVar.setVisibility(0);
                            ksbVar.setVisibility(0);
                            emaVar.setVisibility(0);
                            emaVar.setTranslationX(0.0f);
                            c8bVar3 = this.L1;
                            if (c8bVar3 == null) {
                                if (c8bVar3.J0 != 0) {
                                    emaVar.l(charSequence2, false);
                                } else if (c8bVar3.g) {
                                    fu5Var = null;
                                    emaVar.l(ob6.M0(2131746081, null), false);
                                    z2 = true;
                                } else if (c8bVar3.u) {
                                    emaVar.l(ob6.M0(2131746079, null), false);
                                } else if (c8bVar3.n) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    int i7 = i3;
                                    gc0 gc0Var = new gc0(32.0f, i7, emaVar);
                                    emaVar.setTranslationX(-hl.L(6.0f));
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(gc0Var, 0, 1, 33);
                                    if (this.L1.q instanceof TLRPC.TL_peerUser) {
                                        TLRPC.User X1 = uc7.s1(i7).X1(Long.valueOf(this.L1.q.user_id));
                                        gc0Var.e(X1);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append((CharSequence) lbc.r(X1));
                                    } else {
                                        TLRPC.Chat M03 = uc7.s1(i7).M0(Long.valueOf(-wf3.n(this.L1.q)));
                                        gc0Var.b(M03);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append(M03 != null ? M03.title : charSequence2);
                                    }
                                    emaVar.l(spannableStringBuilder, false);
                                } else {
                                    z5 = false;
                                }
                                z2 = true;
                                fu5Var = null;
                            } else {
                                z5 = false;
                            }
                            fu5Var = null;
                            emaVar.l(ob6.M0(2131746080, null), z5);
                            z2 = true;
                        }
                    }
                    z4 = false;
                    im8Var.setShareEnabled(z4);
                    c8b c8bVar242 = this.L1;
                    e29Var.setImageResource((c8bVar242 == null && c8bVar242.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    gbbVar.setVisibility(0);
                    ksbVar.setVisibility(0);
                    emaVar.setVisibility(0);
                    emaVar.setTranslationX(0.0f);
                    c8bVar3 = this.L1;
                    if (c8bVar3 == null) {
                    }
                    fu5Var = null;
                    emaVar.l(ob6.M0(2131746080, null), z5);
                    z2 = true;
                } else {
                    if (c8bVar22.P0 != null) {
                        x();
                        s();
                        F();
                    }
                    c8b c8bVar25 = this.L1;
                    if (c8bVar25.K && c8bVar25.a1 != null && (textureView = gbbVar.getTextureView()) != null) {
                        textureView.setDelegate(new jab(this, (byte) 6));
                    }
                    hbbVar.setText(this.L1.C0);
                }
            }
            charSequence2 = charSequence;
            c8b c8bVar232 = this.L1;
            im8Var.d(4, c8bVar232 != null || ((!c8bVar232.u || c8bVar232.K) && !c8bVar232.v()));
            boolean z122 = f11.a;
            im8Var.d(3, false);
            if (!this.O1) {
                c6b O12 = uc7.s1(i3).O1();
                int z132 = z();
                n = O12.n();
                if (n != null) {
                }
                z4 = true;
                im8Var.setShareEnabled(z4);
                c8b c8bVar2422 = this.L1;
                e29Var.setImageResource((c8bVar2422 == null && c8bVar2422.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                gbbVar.setVisibility(0);
                ksbVar.setVisibility(0);
                emaVar.setVisibility(0);
                emaVar.setTranslationX(0.0f);
                c8bVar3 = this.L1;
                if (c8bVar3 == null) {
                }
                fu5Var = null;
                emaVar.l(ob6.M0(2131746080, null), z5);
                z2 = true;
            }
            z4 = false;
            im8Var.setShareEnabled(z4);
            c8b c8bVar24222 = this.L1;
            e29Var.setImageResource((c8bVar24222 == null && c8bVar24222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            gbbVar.setVisibility(0);
            ksbVar.setVisibility(0);
            emaVar.setVisibility(0);
            emaVar.setTranslationX(0.0f);
            c8bVar3 = this.L1;
            if (c8bVar3 == null) {
            }
            fu5Var = null;
            emaVar.l(ob6.M0(2131746080, null), z5);
            z2 = true;
        } else {
            fu5Var = null;
            z2 = true;
        }
        if (i == z2) {
            fu5 fu5Var2 = hbbVar.V0;
            if (fu5Var2 != null) {
                fu5Var2.u();
                hbbVar.V0 = fu5Var;
            }
            this.l1.f(z2);
            if (nabVar.N) {
                nabVar.c(false, z2);
            }
        }
        if (i2 == 2 && (c8bVar2 = this.L1) != null) {
            long j = c8bVar2.e0;
            if (j < 0) {
                c8bVar2.e0 = 0L;
                j = 0;
            }
            this.N1 = j;
            long duration = gbbVar.getDuration() < 100 ? this.L1.h0 : gbbVar.getDuration();
            c8b c8bVar26 = this.L1;
            if (c8bVar26.h0 <= 0) {
                c8bVar26.h0 = duration;
            }
            File file = c8bVar26.Z0;
            if (file == null) {
                file = c8bVar26.L;
            }
            String absolutePath = file.getAbsolutePath();
            c8b c8bVar27 = this.L1;
            this.u1.o(false, absolutePath, c8bVar27.h0, c8bVar27.P);
            c8b c8bVar28 = this.L1;
            float f = duration;
            long j2 = (long) (c8bVar28.Z * f);
            long j3 = (long) (c8bVar28.a0 * f);
            ksbVar2.a1 = j2;
            ksbVar2.b1 = j3;
            fsb fsbVar = ksbVar2.h;
            byte b = 1;
            if (fsbVar != null) {
                fsbVar.a(true);
            }
            l8b l8bVar = new l8b(this, b);
            ksbVar2.setDelegate(new k09(l8bVar, (byte) 14));
            float max = (this.N1 / Math.max(1L, duration)) * 0.96f;
            ksbVar2.setVideoLeft(max);
            ksbVar2.setVideoRight(0.04f + max);
            l8bVar.a(Boolean.TRUE, Float.valueOf(max));
        }
        b98 b98Var = this.D1;
        if (b98Var != null) {
            b98Var.setAllowTouch(false);
        }
        kg5 kg5Var2 = this.n1;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
        v21.e();
        if (hbbVar != null) {
            kb1 kb1Var = hbbVar.f;
            kb1Var.d();
            kb1Var.k(true);
            hbbVar.e0 = true;
        }
        if (gbbVar != 0) {
            gbbVar.x(8, i2 != 1);
        }
        vab vabVar = this.w1;
        if (vabVar != null) {
            vabVar.setCoverPreview(i2 != 1);
        }
        kg5 kg5Var3 = this.o1;
        if (kg5Var3 != null) {
            kg5Var3.f(true);
        }
        fbbVar.setPreview(i2 == 1 && fbbVar.i());
    }

    public final void N() {
        this.d = true;
        this.w = false;
        if (this.K) {
            ebb ebbVar = this.i0;
            ebbVar.setAlpha(1.0f);
            ebbVar.setTranslationX(0.0f);
            ebbVar.setTranslationY(0.0f);
            this.j0.setAlpha(1.0f);
            this.l0.setAlpha(1.0f);
            this.n.setBackgroundColor(-16777216);
            if (this.g0 == 2) {
                this.v1.setAlpha(1.0f);
            }
        }
        bab babVar = this.y2;
        if (babVar != null) {
            babVar.run();
            this.y2 = null;
        } else {
            O();
        }
        c8b c8bVar = this.L1;
        if (c8bVar != null) {
            if (c8bVar.n) {
                s();
                F();
                q();
            } else if (c8bVar.u) {
                if (c8bVar.K) {
                    this.Y0.t(c8bVar, null, 0L);
                }
                q();
            }
        }
    }

    public final void O() {
        na9 na9Var;
        boolean z = false;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.y2 = new bab(this, (byte) 5);
            }
        }
        hbb hbbVar = this.d1;
        if (hbbVar != null) {
            hbbVar.f.s();
        }
        u59 u59Var = this.P0;
        if (u59Var != null) {
            u59Var.h();
        }
        byte b = 1;
        jm8 jm8Var = this.p1;
        if (jm8Var != null) {
            c6b O1 = uc7.s1(jm8Var.a).O1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) O1.i.f(yac.h(O1.a).n);
            jm8Var.b = O1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            jm8Var.c.invalidate();
        }
        vab vabVar = this.w1;
        if (vabVar != null && (na9Var = vabVar.y0.d) != null) {
            na9Var.postRunnable(na9Var.x);
        }
        gbb gbbVar = this.Y0;
        if (gbbVar != null) {
            gbbVar.x(0, false);
        }
        ar3 ar3Var = uc7.s1(this.c).O1().w;
        if (ar3Var.c || ar3Var.d) {
            return;
        }
        ar3Var.d = true;
        wq3 wq3Var = new wq3(ar3Var, b);
        jf7 Y = jf7.Y(ar3Var.a);
        Y.a.c(new ds6((Object) Y, z, (Object) wq3Var, (byte) 18));
    }

    public final void P(int i, int i2) {
        vab vabVar;
        cbb cbbVar;
        dbb dbbVar;
        vab vabVar2;
        if (i2 == 0) {
            this.o0.setVisibility(8);
        }
        if (i == 0 && (vabVar2 = this.w1) != null) {
            vabVar2.setVisibility(8);
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
        if ((i2 == 0 || i == 0) && (vabVar = this.w1) != null) {
            vabVar.N0.setLayerType(0, null);
        }
        b98 b98Var = this.D1;
        if (b98Var != null) {
            if (i2 != 1 && i2 != -1) {
                z = false;
            }
            b98Var.setAllowTouch(z);
        }
        if (i2 == 3) {
            cbb cbbVar2 = this.s1;
            if (cbbVar2 != null) {
                cbbVar2.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (cbbVar = this.s1) != null) {
            cbbVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            cbb cbbVar3 = this.s1;
            cbbVar3.y = null;
            i33 i33Var = cbbVar3.f;
            i33Var.M = null;
            i33Var.d = null;
            i33Var.K = false;
            cbbVar3.d.setVisibility(8);
            cbbVar3.a.setCropEditorDrawing(null);
        }
        if (i2 == 4) {
            dbb dbbVar2 = this.t1;
            if (dbbVar2 != null) {
                dbbVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i != 4 || (dbbVar = this.t1) == null) {
            return;
        }
        dbbVar.setVisibility(8);
        this.t1.setAppearProgress(0.0f);
        dbb dbbVar3 = this.t1;
        dbbVar3.b = null;
        i33 i33Var2 = dbbVar3.h;
        i33Var2.M = null;
        i33Var2.d = null;
        i33Var2.K = false;
        dbbVar3.e.setVisibility(8);
        dbbVar3.setVisibility(8);
    }

    public final void Q(lbb lbbVar) {
        xx n;
        qbb qbbVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (uc7.s1(i).x2()) {
            i5.b(i);
            return;
        }
        int i2 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (qbbVar = this.n) != null && qbbVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            hl.s3(windowManager, qbbVar, layoutParams);
            windowManager.addView(qbbVar, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(y());
        if (this.w0 == 0 && (n = uc7.s1(i).O1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        I(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (lbbVar != null) {
            this.G = lbbVar;
            this.K = lbbVar.a;
            rectF.set(lbbVar.c);
            this.H = lbbVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = hl.L(100.0f);
            Point point = hl.q;
            rectF.set(0.0f, L, point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
        }
        jbb jbbVar = this.r;
        jbbVar.c();
        boolean z = this.K;
        if (!z && z) {
            i2 = -14737633;
        }
        this.i0.setBackgroundColor(i2);
        jbbVar.setTranslationX(0.0f);
        jbbVar.setTranslationY(0.0f);
        jbbVar.b(0.0f);
        jbbVar.setScaleX(1.0f);
        jbbVar.setScaleY(1.0f);
        this.L = 0.0f;
        hl.e2(this.b);
        d(1.0f, true, new bab(this, (byte) 22));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(kbb kbbVar, c8b c8bVar, long j) {
        View view;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (uc7.s1(i).x2()) {
            i5.b(i);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (view = this.n) != null && view.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            hl.s3(windowManager, view, layoutParams);
            windowManager.addView(view, layoutParams);
            f0();
        }
        this.L1 = c8bVar;
        this.P1 = c8bVar.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (kbbVar != null) {
            this.G = kbbVar;
            this.K = kbbVar.a;
            rectF.set(kbbVar.c);
            this.H = kbbVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = hl.L(100.0f);
            Point point = hl.q;
            rectF.set(0.0f, L, point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
        }
        jbb jbbVar = this.r;
        jbbVar.c();
        boolean z = this.K;
        this.i0.setBackgroundColor((z || !z) ? 0 : -14737633);
        jbbVar.setTranslationX(0.0f);
        jbbVar.setTranslationY(0.0f);
        jbbVar.b(0.0f);
        jbbVar.setScaleX(1.0f);
        jbbVar.setScaleY(1.0f);
        this.L = 0.0f;
        hl.e2(this.b);
        c8b c8bVar2 = this.L1;
        if (c8bVar2 != null) {
            this.d1.setText(c8bVar2.C0);
        }
        J(new bab(this, r2), j);
        I(this.L1.b0 ? (byte) 2 : (byte) 1, false);
        k0(-1, false, false);
        this.c1.b(false, false);
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void S() {
        fu5 fu5Var;
        gbb gbbVar = this.Y0;
        if (gbbVar != null) {
            gbbVar.x(4, true);
        }
        hbb hbbVar = this.d1;
        if (hbbVar != null && (fu5Var = hbbVar.V0) != null) {
            fu5Var.u();
            hbbVar.V0 = null;
        }
        xk8 xk8Var = new xk8((e) new xab(this, (byte) 1), 14, false);
        xk8Var.setOnDismissListener(new cab(this, (byte) 0));
        xk8Var.show();
    }

    public final void T(kbb kbbVar, c8b c8bVar) {
        xx n;
        qbb qbbVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (uc7.s1(i).x2()) {
            i5.b(i);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (qbbVar = this.n) != null && qbbVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            hl.s3(windowManager, qbbVar, layoutParams);
            windowManager.addView(qbbVar, layoutParams);
            f0();
        }
        this.L1 = c8bVar;
        y9b.a(i, c8bVar);
        c8b c8bVar2 = this.L1;
        int i2 = (c8bVar2 == null || !c8bVar2.K) ? 0 : 1;
        this.P1 = i2;
        this.t0.g = c8bVar2 != null && c8bVar2.u && i2 == 1;
        if (this.w0 == 0 && (n = uc7.s1(i).O1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        RectF rectF = this.I;
        if (kbbVar != null) {
            this.G = kbbVar;
            this.K = kbbVar.a;
            rectF.set(kbbVar.c);
            this.H = kbbVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = hl.L(100.0f);
            Point point = hl.q;
            rectF.set(0.0f, L, point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
        }
        jbb jbbVar = this.r;
        jbbVar.c();
        boolean z = this.K;
        this.i0.setBackgroundColor((z || !z) ? 0 : -14737633);
        jbbVar.setTranslationX(0.0f);
        jbbVar.setTranslationY(0.0f);
        jbbVar.b(0.0f);
        jbbVar.setScaleX(1.0f);
        jbbVar.setScaleY(1.0f);
        this.L = 0.0f;
        hl.e2(this.b);
        c8b c8bVar3 = this.L1;
        if (c8bVar3 != null) {
            this.d1.setText(c8bVar3.C0);
        }
        this.c1.b(true, false);
        I(1, false);
        k0(-1, false, false);
        d(1.0f, true, new bab(this, (byte) 22));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        pa9 pa9Var = this.x1;
        if (pa9Var != null) {
            pa9Var.bringToFront();
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
        j5c j5cVar = this.q1;
        if (j5cVar != null) {
            j5cVar.bringToFront();
        }
        b98 b98Var = this.D1;
        if (b98Var != null) {
            b98Var.bringToFront();
        }
        t88 t88Var = this.F1;
        if (t88Var != null) {
            t88Var.bringToFront();
        }
        v88 v88Var = this.G1;
        if (v88Var != null) {
            v88Var.bringToFront();
        }
        jm8 jm8Var = this.p1;
        if (jm8Var != null) {
            jm8Var.bringToFront();
        }
        xb1 xb1Var = this.r1;
        if (xb1Var != null) {
            xb1Var.bringToFront();
        }
    }

    public final void V(c8b c8bVar, boolean z) {
        c8b c8bVar2;
        boolean z2;
        if (c8bVar == null || this.Y0.getWidth() <= 0 || this.Y0.getHeight() <= 0) {
            return;
        }
        File file = z ? c8bVar.O0 : c8bVar.N0;
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
        hl.m0 = true;
        view.draw(canvas);
        hl.m0 = false;
        canvas.restore();
        Paint paint = new Paint(2);
        kec textureView = this.Y0.getTextureView();
        if (c8bVar.K && !c8bVar.u && textureView != null) {
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
        File file2 = c8bVar.Q0;
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
                cc4.g(e, true);
            }
        }
        File file3 = c8bVar.P0;
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
                cc4.g(e2, true);
            }
        }
        vab vabVar = this.w1;
        if (vabVar != null && vabVar.B0 != null) {
            canvas.save();
            canvas.scale(f, f);
            vab vabVar2 = this.w1;
            vabVar2.s0 = true;
            zw7 zw7Var = vabVar2.B0;
            zw7Var.a = true;
            zw7Var.draw(canvas);
            vab vabVar3 = this.w1;
            vabVar3.B0.a = false;
            vabVar3.s0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w = c8b.w(this.c, "jpg");
        if (z) {
            c8bVar2 = c8bVar;
            z2 = z;
            Utilities.g.c(new va7((Object) this, (Object) createBitmap, z2, (Object) w, (Object) c8bVar2, (byte) 22));
        } else {
            c8bVar2 = c8bVar;
            z2 = z;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z2 ? 95 : 99, new FileOutputStream(w));
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
        }
        if (!z2) {
            c8bVar2.N0 = w;
        }
        c8bVar2.b1 = createScaledBitmap;
    }

    public final void W() {
        xx n;
        w9b w9bVar = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (w9bVar != null) {
            w9bVar.dismiss();
            this.r0 = null;
        }
        boolean z = this.O1;
        yw0 yw0Var = yw0.E;
        if (z) {
            fq3 fq3Var = this.f1;
            fq3Var.getClass();
            fq3Var.c(ob6.N0("VideoConvertFail"));
            yw0Var.a();
            hm8 hm8Var = this.c1.c;
            int i = -this.V1;
            this.V1 = i;
            hl.A3(i, hm8Var, null);
            return;
        }
        hbb hbbVar = this.d1;
        if (hbbVar != null && hbbVar.o()) {
            yw0Var.a();
            in inVar = hbbVar.w;
            int i2 = -this.V1;
            this.V1 = i2;
            hl.A3(i2, inVar, null);
            hbbVar.e();
            return;
        }
        c8b c8bVar = this.L1;
        int i3 = this.c;
        if ((c8bVar == null || (!c8bVar.g && c8bVar.J0 == 0)) && (n = uc7.s1(i3).e0.n()) != null && n.a(i3, z())) {
            g0(n, false);
            return;
        }
        this.L1.D0 = uc7.s1(i3).l5();
        x53 x53Var = this.a;
        byte b = 1;
        if (hbbVar != null && !this.L1.D0) {
            CharSequence text = hbbVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((smb[]) spannable.getSpans(0, text.length(), smb.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new d31(this.n, x53Var).Q(R.raw.voip_invite, 36, hl.N2(ob6.M0(2131744235, null), aob.Xc, 0, new bab(this, (byte) 26), x53Var)).k(true);
                    int i4 = -this.V1;
                    this.V1 = i4;
                    hl.A3(i4, hbbVar, null);
                    return;
                }
            }
        }
        c8b c8bVar2 = this.L1;
        if (c8bVar2.g || c8bVar2.J0 != 0) {
            c8bVar2.l = false;
            f(null);
            o0();
            return;
        }
        if (this.O != 0) {
            c8bVar2.v0 = uc7.s1(i3).j1(this.O);
        }
        gbb gbbVar = this.Y0;
        gbbVar.x(3, true);
        w9b w9bVar2 = new w9b(this.b, this.L1.I0, x53Var);
        w9bVar2.S0(this.L1.E0);
        w9bVar2.R0(this.L1.v0);
        w9bVar2.z1 = this.N;
        w9bVar2.O1 = new dab(this, (byte) 13);
        w9bVar2.F0(!this.B0.i());
        ArrayList arrayList = this.J1;
        w9bVar2.O0(arrayList == null ? this.L1.r() : arrayList.size());
        w9bVar2.M0(false);
        CharSequence text2 = hbbVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (i8c i8cVar : (i8c[]) ((Spanned) text2).getSpans(0, text2.length(), i8c.class)) {
                if (i8cVar != null) {
                    try {
                        TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(Long.parseLong(i8cVar.getURL())));
                        if (X1 != null && !lbc.D(X1) && lbc.p(X1) != null && !arrayList2.contains(X1)) {
                            arrayList2.add(lbc.p(X1));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i5 = -1;
            for (int i6 = 0; i6 < text2.length(); i6++) {
                char charAt = text2.charAt(i6);
                if (charAt == '@') {
                    i5 = i6 + 1;
                } else if (charAt == ' ') {
                    if (i5 != -1) {
                        String charSequence = text2.subSequence(i5, i6).toString();
                        TLObject c2 = uc7.s1(i3).c2(charSequence);
                        if (c2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) c2;
                            if (!user.bot && !lbc.D(user) && user.id != 777000 && !lbc.B(user) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i5 = -1;
                }
            }
            if (i5 != -1) {
                String charSequence2 = text2.subSequence(i5, text2.length()).toString();
                TLObject c22 = uc7.s1(i3).c2(charSequence2);
                if (c22 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) c22;
                    if (!user2.bot && !lbc.D(user2) && user2.id != 777000 && !lbc.B(user2) && !arrayList2.contains(charSequence2)) {
                        arrayList2.add(charSequence2);
                    }
                }
            }
        }
        w9bVar2.M1 = arrayList2;
        w9bVar2.Q1 = new dab(this, (byte) 14);
        w9bVar2.R1 = new dab(this, (byte) 15);
        w9bVar2.N1 = new jab(this, (byte) 9);
        this.r0 = w9bVar2;
        c8b c8bVar3 = this.L1;
        if (c8bVar3.K) {
            if (gbbVar != null && !c8bVar3.f0 && this.g0 != 2) {
                c8bVar3.e0 = gbbVar.getCurrentPosition();
                gbbVar.g(new dab(this, (byte) 16), gbbVar, this.x1, this.A1);
            }
            w9b w9bVar3 = this.r0;
            Bitmap bitmap = this.L1.g0;
            bab babVar = new bab(this, (byte) 19);
            if (bitmap != null) {
                w9bVar3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            w9bVar3.V1 = bitmapDrawable;
            w9bVar3.W1 = babVar;
            ir1 ir1Var = w9bVar3.l1;
            if (ir1Var != null) {
                for (View view : ir1Var.getViewPages()) {
                    if (view instanceof r9b) {
                        r9b r9bVar = (r9b) view;
                        r9bVar.h(false);
                        r9bVar.f(false);
                    }
                }
            }
        }
        this.r0.setOnDismissListener(new cab(this, b));
        this.r0.show();
    }

    public final void X(mbb mbbVar) {
        int i = 0;
        RectF rectF = this.I;
        if (mbbVar != null) {
            this.G = mbbVar;
            this.K = mbbVar.a;
            rectF.set(mbbVar.c);
            this.H = mbbVar.b;
        } else {
            this.G = null;
            this.K = false;
            float L = hl.L(100.0f);
            Point point = hl.q;
            rectF.set(0.0f, L, point.x, hl.L(100.0f) + point.y);
            this.H = hl.L(8.0f);
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
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, jn7.w1);
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
                    zm2 zm2Var = new zm2(new ColorDrawable(-14540254), mutate);
                    int L = hl.L(64.0f);
                    int L2 = hl.L(64.0f);
                    zm2Var.e = L;
                    zm2Var.f = L2;
                    this.B0.setCameraThumb(zm2Var);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, activity);
                        int i = aob.L5;
                        alertDialog$Builder.l(R.raw.permission_request_camera, 72, aob.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747035, null));
                        id idVar = alertDialog$Builder.a;
                        idVar.U = S2;
                        alertDialog$Builder.j(ob6.M0(2131747027, null), new jab(this, (byte) 12));
                        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                        idVar.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, jn7.v1);
                    this.x2 = true;
                }
            }
            if (this.t2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                p();
            } else {
                CameraController.getInstance().initCamera(new bab(this, b));
            }
        }
    }

    public final void a() {
        jn7.e().a(this, jn7.r2);
        int i = this.c;
        jn7.f(i).a(this, jn7.B5);
        jn7.f(i).a(this, jn7.d3);
    }

    public final void a0(Runnable runnable) {
        wab wabVar = this.C0;
        if (wabVar == null || wabVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new pwa(this, this.C0.getTextureView().getBitmap(), runnable, (byte) 16));
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
        jbb jbbVar = this.r;
        float f = jbbVar.a;
        float f2 = jbbVar.b;
        jbbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new gy1(this, f, f2, (byte) 6));
        this.k2.setDuration(340L);
        this.k2.setInterpolator(k43.h);
        this.k2.addListener(new tab(this, (byte) 0));
        this.k2.start();
    }

    public final void b0(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setVisibility(0);
            view.animate().alpha(z ? 1.0f : 0.0f).setUpdateListener(new uab(this, (byte) 1)).setListener(new rw((Object) this, z, (Object) view, (byte) 14)).setDuration(320L).setInterpolator(k43.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z ? 0 : 8);
            view.setAlpha(z ? 1.0f : 0.0f);
            m0();
        }
    }

    public final void c(boolean z) {
        vq3 vq3Var;
        this.L0 = z;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z) {
            zt4 zt4Var = this.N0;
            byte b = 0;
            if (zt4Var == null) {
                if (z) {
                    r(false);
                }
                zt4Var = this.N0;
                if (zt4Var == null) {
                    return;
                }
            }
            if (zt4Var.V) {
                this.r2 = new kab(this, z, b);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            vpa vpaVar = this.p2;
            if (vpaVar != null) {
                vpaVar.d();
                this.p2 = null;
            }
            zt4 zt4Var2 = this.N0;
            if (zt4Var2 == null) {
                if (z) {
                    r(false);
                }
                zt4Var2 = this.N0;
                if (zt4Var2 == null) {
                    return;
                }
            }
            zt4Var2.L = false;
            if (z && (vq3Var = this.O0) != null) {
                vq3Var.a(false);
            }
            jbb jbbVar = this.r;
            if (jbbVar != null) {
                jbbVar.setImportantForAccessibility(z ? 4 : 0);
            }
            this.N0.setImportantForAccessibility(z ? 0 : 4);
            this.q2 = Boolean.valueOf(z);
            float translationY = this.N0.getTranslationY();
            qbb qbbVar = this.n;
            float height = z ? 0.0f : (qbbVar.getHeight() - this.N0.g()) + (hl.n * 2.5f);
            qbbVar.getHeight();
            zt4 zt4Var3 = this.N0;
            zt4Var3.L = !z;
            byte b2 = 1;
            this.l2 = this.k2 == null;
            byte b3 = 2;
            if (z) {
                vpa vpaVar2 = new vpa(zt4Var3, vpa.p, height);
                this.p2 = vpaVar2;
                vpaVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new f22(this, height, b3));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new lab(this, b));
                this.o2.addListener(new tab(this, b2));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(k43.h);
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
            cc4.g(e, true);
        }
    }

    public final void d(float f, boolean z, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        jbb jbbVar = this.r;
        if (!z) {
            this.M = null;
            this.J = f;
            h();
            jbbVar.invalidate();
            this.n.invalidate();
            runnable.run();
            l();
            return;
        }
        this.Q.d();
        jn7.e().k(jn7.j1, 512);
        this.M = Float.valueOf(this.L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        this.F = ofFloat;
        byte b = 5;
        ofFloat.addUpdateListener(new lab(this, b));
        this.F.addListener(new ok4(this, f, runnable, b));
        if (f < 1.0f && this.w) {
            this.F.setDuration(250L);
            this.F.setInterpolator(k43.h);
        } else if (f > 0.0f || jbbVar.a < hl.L(20.0f)) {
            this.F.setDuration(300L);
            this.F.setInterpolator(new x84());
        } else if (f >= 0.0f || !this.P) {
            this.F.setDuration(400L);
            this.F.setInterpolator(k43.h);
        } else {
            this.F.setDuration(200L);
            this.F.setInterpolator(k43.h);
            this.P = false;
        }
        this.F.start();
    }

    public final void d0(String str) {
        int i;
        ntb ntbVar = this.F0;
        ntbVar.clearAnimation();
        wab wabVar = this.C0;
        if ((wabVar != null && wabVar.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z = false;
        if (str == null) {
            b0(ntbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals(CallAudioDevice.NAME_AUTO)) {
                ntbVar.setContentDescription(ob6.M0(2131754911, null));
                i = R.drawable.media_photo_flash_auto2;
            }
            ntbVar.setContentDescription(ob6.M0(2131754910, null));
            i = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                ntbVar.setContentDescription(ob6.M0(2131754909, null));
                i = R.drawable.media_photo_flash_on2;
            }
            ntbVar.setContentDescription(ob6.M0(2131754910, null));
            i = R.drawable.media_photo_flash_off2;
        }
        if (ntbVar.n != i) {
            ntbVar.n = i;
            ValueAnimator valueAnimator = ntbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ntbVar.r = null;
            }
            ntbVar.setDrawable(i);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !G()) {
            z = true;
        }
        b0(ntbVar, z, true);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xx n;
        c8b c8bVar;
        int i3 = jn7.r2;
        u59 u59Var = this.P0;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (i == i3) {
            if (u59Var != null) {
                u59Var.h();
            }
            if (this.n2 == null || MediaController.c2 == null) {
                return;
            }
            for (int i4 = 0; i4 < MediaController.c2.size(); i4++) {
                do6 do6Var = (do6) MediaController.c2.get(i4);
                int i5 = do6Var.a;
                do6 do6Var2 = this.n2;
                if (i5 == do6Var2.a && do6Var.b == do6Var2.b) {
                    this.n2 = do6Var;
                    return;
                }
            }
            return;
        }
        if (i == jn7.B5) {
            if (u59Var == null || this.W1) {
                return;
            }
            u59Var.h();
            return;
        }
        if (i == jn7.d3) {
            byte b = this.g0;
            int i6 = this.c;
            if (b != 1) {
                if (b == 0 && (n = uc7.s1(i6).O1().n()) != null && n.a(i6, 1)) {
                    c8b c8bVar2 = this.L1;
                    if (c8bVar2 == null || c8bVar2.J0 == 0) {
                        g0(n, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.O1 && !this.d1.o()) {
                c6b O1 = uc7.s1(i6).O1();
                int z2 = z();
                xx n2 = O1.n();
                if (n2 == null || !n2.a(O1.a, z2) || ((c8bVar = this.L1) != null && (c8bVar.g || c8bVar.J0 != 0))) {
                    z = true;
                }
            }
            this.c1.setShareEnabled(z);
        }
    }

    public final void e(boolean z, boolean z2) {
        el2 el2Var;
        if (z) {
            kg5 kg5Var = this.m1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kg5 kg5Var2 = this.n1;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
            }
            kg5 kg5Var3 = this.l1;
            if (kg5Var3 != null) {
                kg5Var3.f(true);
            }
            kg5 kg5Var4 = this.X0;
            if (kg5Var4 != null) {
                kg5Var4.f(true);
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
        if (z && (el2Var = this.J0) != null && el2Var.e) {
            el2Var.a(false, z2);
        }
        l0(z2);
        oab oabVar = this.R0;
        hg5 hg5Var = this.V0;
        hg5 hg5Var2 = this.U0;
        if (!z2) {
            hg5Var2.setAlpha((z && this.g0 == 0 && !G()) ? 1.0f : 0.0f);
            hg5Var2.setTranslationY((z && this.g0 == 0 && !G()) ? 0.0f : hl.L(16.0f));
            hg5Var.setAlpha((!z && this.g0 == 0 && G()) ? 0.6f : 0.0f);
            hg5Var.setTranslationY((!z && this.g0 == 0 && G()) ? 0.0f : hl.L(16.0f));
            oabVar.setAlpha((z || this.g0 != 0 || G()) ? 0.0f : 1.0f);
            oabVar.setTranslationY((z || this.g0 != 0 || G()) ? hl.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a2 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hg5Var2, (Property<hg5, Float>) property, (z && this.g0 == 0 && !G()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(hg5Var2, (Property<hg5, Float>) property2, (z && this.g0 == 0 && !G()) ? 0.0f : hl.L(16.0f)), ObjectAnimator.ofFloat(hg5Var, (Property<hg5, Float>) property, (!z && this.g0 == 0 && G()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(hg5Var, (Property<hg5, Float>) property2, (!z && this.g0 == 0 && G()) ? 0.0f : hl.L(16.0f)), ObjectAnimator.ofFloat(oabVar, (Property<oab, Float>) property, (z || this.g0 != 0 || G()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(oabVar, (Property<oab, Float>) property2, (z || this.g0 != 0 || G()) ? hl.L(16.0f) : 0.0f));
        this.a2.setDuration(260L);
        this.a2.setInterpolator(k43.h);
        this.a2.start();
    }

    public final void e0(boolean z, boolean z2) {
        b29 b29Var = this.g1;
        if (b29Var == null) {
            b29 b29Var2 = new b29(R.raw.media_mute_unmute, hl.L(28.0f), hl.L(28.0f), true, null);
            this.g1 = b29Var2;
            b29Var2.G *= 1.5f;
            b29Var = b29Var2;
        }
        this.h1.setAnimation(b29Var);
        b29 b29Var3 = this.g1;
        if (!z2) {
            b29Var3.I(z ? 20 : 0, false, false);
            return;
        }
        if (z) {
            if (b29Var3.b0 > 20) {
                b29Var3.I(0, false, false);
            }
            this.g1.K(20);
            this.g1.start();
            return;
        }
        int i = b29Var3.b0;
        if (i == 0 || i >= 43) {
            return;
        }
        b29Var3.K(43);
        this.g1.start();
    }

    public final void f(Runnable runnable) {
        c8b c8bVar;
        Runnable runnable2;
        gbb gbbVar;
        c98 c98Var = this.C1;
        if (c98Var == null || (c8bVar = this.L1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        c8bVar.j |= c98Var.b();
        c8b c8bVar2 = this.L1;
        c98 c98Var2 = this.C1;
        File file = c8bVar2.Z0;
        if (file != null) {
            file.delete();
            c8bVar2.Z0 = null;
        }
        po6 savedFilterState = c98Var2.getSavedFilterState();
        c8bVar2.a1 = savedFilterState;
        if (c8bVar2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = c98Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i = c8bVar2.R;
                    matrix.postScale(i == 1 ? -1.0f : 1.0f, i == 2 ? -1.0f : 1.0f, c8bVar2.k0 / 2.0f, c8bVar2.l0 / 2.0f);
                    matrix.postRotate(-c8bVar2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    c8bVar2.n0.preScale(c8bVar2.k0 / createBitmap.getWidth(), c8bVar2.l0 / createBitmap.getHeight());
                    c8bVar2.k0 = createBitmap.getWidth();
                    c8bVar2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = c8bVar2.Z0;
                    if (file2 != null && file2.exists()) {
                        c8bVar2.Z0.delete();
                    }
                    String k = c8b.k(c8bVar2.L);
                    boolean z = "png".equals(k) || "webp".equals(k);
                    c8bVar2.Z0 = c8b.w(c8bVar2.a, z ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(c8bVar2.Z0));
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new lb7((Object) c8bVar2, (Object) createBitmap, z, (Object) runnable2, (byte) 16));
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
            c8b c8bVar3 = this.L1;
            if (c8bVar3.K || (gbbVar = this.Y0) == null) {
                return;
            }
            gbbVar.set(c8bVar3);
        }
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new vo(this, (byte) 3));
    }

    public final void g() {
        if (this.L1 == null || this.E1 == null) {
            return;
        }
        ebb ebbVar = this.i0;
        if (ebbVar.getMeasuredWidth() <= 0 || ebbVar.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.L1.Q != 0) {
            matrix.postRotate(-r2, ebbVar.getMeasuredWidth() / 2.0f, ebbVar.getMeasuredHeight() / 2.0f);
            if ((this.L1.Q / 90) % 2 == 1) {
                matrix.postScale(ebbVar.getMeasuredWidth() / ebbVar.getMeasuredHeight(), ebbVar.getMeasuredHeight() / ebbVar.getMeasuredWidth(), ebbVar.getMeasuredWidth() / 2.0f, ebbVar.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / ebbVar.getMeasuredWidth()) * this.L1.k0, (1.0f / ebbVar.getMeasuredHeight()) * this.L1.l0);
        matrix.postConcat(this.L1.n0);
        matrix.postScale(ebbVar.getMeasuredWidth() / this.L1.i0, ebbVar.getMeasuredHeight() / this.L1.j0);
        this.E1.setTransform(matrix);
        this.E1.invalidate();
    }

    public final void g0(xx xxVar, boolean z) {
        if (this.A2) {
            return;
        }
        yab yabVar = new yab(xxVar.b(), this.c, null, this.b, new xab(this, (byte) 0));
        yabVar.S1 = z();
        yabVar.setOnDismissListener(new lw1(this, z, (byte) 1));
        this.Y0.x(7, true);
        this.A2 = true;
        yabVar.show();
    }

    public final void h() {
        t58 t58Var;
        if (this.K) {
            ebb ebbVar = this.i0;
            float left = ebbVar.getLeft();
            float top = ebbVar.getTop();
            float measuredWidth = ebbVar.getMeasuredWidth();
            float measuredHeight = ebbVar.getMeasuredHeight();
            RectF rectF = this.e0;
            rectF.set(left, top, measuredWidth, measuredHeight);
            jbb jbbVar = this.r;
            rectF.offset(jbbVar.getX(), jbbVar.getY());
            float f = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.d0;
            hl.X1(rectF2, rectF, f, rectF3);
            ebbVar.setAlpha(this.J);
            ebbVar.setTranslationX((rectF3.left - ebbVar.getLeft()) - jbbVar.getX());
            ebbVar.setTranslationY((rectF3.top - ebbVar.getTop()) - jbbVar.getY());
            mbb mbbVar = this.G;
            if (mbbVar != null && (t58Var = mbbVar.f) != null) {
                t58Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            ebbVar.setScaleX(rectF3.width() / ebbVar.getMeasuredWidth());
            ebbVar.setScaleY(rectF3.height() / ebbVar.getMeasuredHeight());
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
            rgc rgcVar = this.K0;
            if (z2) {
                rgcVar.animate().alpha(z ? 1.0f : 0.0f).setDuration(350L).setInterpolator(k43.h).withEndAction(new kab(this, z, (byte) 1)).start();
                return;
            }
            rgcVar.clearAnimation();
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
        c8b c8bVar;
        ImageReceiver photoImage;
        float f;
        if (this.w1 == null || (c8bVar = this.L1) == null) {
            return;
        }
        c8bVar.f();
        this.L1.j |= this.w1.r0();
        c8b c8bVar2 = this.L1;
        ArrayList arrayList = c8bVar2.T0;
        if (arrayList == null) {
            c8bVar2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        vab vabVar = this.w1;
        c8b c8bVar3 = this.L1;
        vabVar.q0(c8bVar3.T0, false, false, false, false, c8bVar3);
        c8b c8bVar4 = this.L1;
        if (!c8bVar4.K) {
            c8bVar4.S0 = Utilities.k(this.w1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.w1.getMasks();
        this.L1.U0 = masks != null ? new ArrayList(masks) : null;
        c8b c8bVar5 = this.L1;
        boolean z = c8bVar5.K;
        boolean D = c8bVar5.D();
        this.L1.T0 = new ArrayList();
        vab vabVar2 = this.w1;
        c8b c8bVar6 = this.L1;
        Bitmap q0 = vabVar2.q0(c8bVar6.T0, true, false, false, !z, c8bVar6);
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
        c8b c8bVar7 = this.L1;
        c8bVar7.P0 = null;
        c8bVar7.R0 = null;
        c8bVar7.Q0 = null;
        int i = this.c;
        xb4.G(i);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        c8b c8bVar8 = this.L1;
        c8bVar7.P0 = xb4.J(in5.V(q0, compressFormat, c8bVar8.i0, c8bVar8.j0, 87), null, true, true);
        if (q0 != null && !q0.isRecycled()) {
            q0.recycle();
        }
        c8b c8bVar9 = this.L1;
        if (c8bVar9.u) {
            File file4 = c8bVar9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                c8bVar9 = this.L1;
                c8bVar9.Y0 = null;
            }
            long j = c8bVar9.z0;
            if (j != Long.MIN_VALUE) {
                Drawable drawable = c8bVar9.x0;
                if (drawable == null) {
                    drawable = mm8.d(null, i, j, this.d2);
                }
                if (drawable != null) {
                    this.L1.Y0 = c8b.w(i, "webp");
                    c8b c8bVar10 = this.L1;
                    Bitmap createBitmap = Bitmap.createBitmap(c8bVar10.i0, c8bVar10.j0, Bitmap.Config.ARGB_8888);
                    c8b.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.Y0));
                        } catch (Exception e2) {
                            cc4.g(e2, true);
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
        c8b c8bVar11 = this.L1;
        if (c8bVar11.u) {
            File file5 = c8bVar11.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                c8bVar11 = this.L1;
                c8bVar11.X0 = null;
            }
            if (c8bVar11.u && c8bVar11.K) {
                int i2 = c8bVar11.k0;
                int i3 = c8bVar11.l0;
                b47 p0 = this.w1.p0();
                if (p0 != null) {
                    v37 v37Var = p0.t0;
                    if (v37Var.getChildCount() == 1 && i2 > 0 && i3 > 0) {
                        int i4 = 0;
                        if ((v37Var.getChildAt(0) instanceof wb2) && (photoImage = ((wb2) v37Var.getChildAt(0)).getPhotoImage()) != null) {
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
                                    RectF rectF = hl.P;
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
                                        this.L1.X0 = c8b.w(i, "webp");
                                        createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.X0));
                                    } catch (Exception e4) {
                                        cc4.g(e4, true);
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
            vab vabVar3 = this.w1;
            ArrayList arrayList2 = new ArrayList();
            c8b c8bVar12 = this.L1;
            int i8 = c8bVar12.i0;
            Bitmap q02 = vabVar3.q0(arrayList2, false, true, false, false, c8bVar12);
            c8b c8bVar13 = this.L1;
            xb4.G(i);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            c8b c8bVar14 = this.L1;
            c8bVar13.R0 = xb4.J(in5.V(q02, compressFormat2, c8bVar14.i0, c8bVar14.j0, 87), null, true, true);
            if (q02 != null && !q02.isRecycled()) {
                q02.recycle();
            }
        }
        if (this.w1.y0.getPainting().E) {
            Bitmap blurBitmap = this.w1.getBlurBitmap();
            c8b c8bVar15 = this.L1;
            xb4.G(i);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            c8b c8bVar16 = this.L1;
            c8bVar15.Q0 = xb4.J(in5.V(blurBitmap, compressFormat3, c8bVar16.i0, c8bVar16.j0, 87), null, true, true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
    }

    public final void i0(boolean z) {
        r3d r3dVar = this.W0;
        if (r3dVar.getTag() != null && z) {
            Runnable runnable = this.f2;
            if (runnable != null) {
                hl.r(runnable);
            }
            bab babVar = new bab(this, (byte) 24);
            this.f2 = babVar;
            hl.d3(babVar, 2000L);
            return;
        }
        if (r3dVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.g2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            r3dVar.setTag(z ? 1 : null);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.g2 = animatorSet2;
            animatorSet2.setDuration(180L);
            if (z) {
                r3dVar.setVisibility(0);
            }
            this.g2.playTogether(ObjectAnimator.ofFloat(r3dVar, (Property<r3d, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.g2.addListener(new i1a((byte) 5, this, z));
            this.g2.start();
            if (z) {
                bab babVar2 = new bab(this, (byte) 25);
                this.f2 = babVar2;
                hl.d3(babVar2, 2000L);
            }
        }
    }

    public final void j() {
        c8b c8bVar;
        if (this.w1 == null || (c8bVar = this.L1) == null || !c8bVar.u) {
            return;
        }
        File file = c8bVar.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            c8bVar = this.L1;
            c8bVar.W0 = null;
        }
        c8bVar.W0 = c8b.w(this.c, "webp");
        vab vabVar = this.w1;
        c8b c8bVar2 = this.L1;
        Bitmap q0 = vabVar.q0(c8bVar2.T0, false, false, true, this.P1 != 1, c8bVar2);
        try {
            try {
                q0.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                if (q0.isRecycled()) {
                    return;
                }
            } finally {
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            try {
                this.L1.W0.delete();
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
            this.L1.W0 = null;
            if (q0 == null || q0.isRecycled()) {
                return;
            }
        }
        q0.recycle();
    }

    public final void j0() {
        w9b w9bVar = this.r0;
        if (w9bVar != null) {
            w9bVar.dismiss();
            this.r0 = null;
        }
        w9b w9bVar2 = new w9b(this.b, 86400, this.a);
        w9bVar2.Q0();
        w9bVar2.S0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            inputPeer = this.O != 0 ? uc7.s1(this.c).j1(this.O) : new TLRPC.TL_inputPeerSelf();
        }
        w9bVar2.R0(inputPeer);
        w9bVar2.z1 = this.N;
        w9bVar2.O1 = new dab(this, (byte) 17);
        w9bVar2.F0(false);
        w9bVar2.O0(1);
        w9bVar2.M0(false);
        w9bVar2.Q1 = new dab(this, (byte) 18);
        w9bVar2.N1 = new jab(this, (byte) 11);
        this.r0 = w9bVar2;
        w9bVar2.show();
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
        cbb cbbVar;
        float f2;
        int i2;
        dbb dbbVar;
        int i3;
        float f3;
        c8b c8bVar;
        ImageView imageView;
        int i4;
        int i5;
        float f4;
        float f5;
        v88 v88Var;
        t88 t88Var;
        ImageView imageView2;
        int i6;
        c8b c8bVar2;
        vab vabVar;
        vab vabVar2;
        int i7 = this.h0;
        if (i7 == i && !z) {
            return;
        }
        hbb hbbVar = this.d1;
        if (i != -1 && hbbVar != null && hbbVar.O1) {
            return;
        }
        this.h0 = i;
        AnimatorSet animatorSet = this.s2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s2 = null;
        }
        ema emaVar = this.q0;
        ksb ksbVar = this.a1;
        fq3 fq3Var = this.f1;
        pk4 pk4Var = this.o0;
        a81 a81Var = this.k1;
        e29 e29Var = this.h1;
        if (i7 != i) {
            if (i == -1) {
                pk4Var.setVisibility(0);
                hbbVar.setVisibility(0);
                vab vabVar3 = this.w1;
                if (vabVar3 != null) {
                    vabVar3.C0(null, true);
                }
                fq3Var.setVisibility(0);
                c8b c8bVar3 = this.L1;
                if (c8bVar3 == null || !c8bVar3.u) {
                    ImageView imageView3 = this.j1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    E().setVisibility(0);
                    n0(false);
                }
                emaVar.setVisibility(0);
                if (this.P1 == 1) {
                    e29Var.setVisibility(0);
                    a81Var.setVisibility(0);
                } else {
                    c8b c8bVar4 = this.L1;
                    if (c8bVar4 != null && !TextUtils.isEmpty(c8bVar4.y)) {
                        e29Var.setVisibility(8);
                        a81Var.setVisibility(0);
                    }
                }
                ksbVar.setVisibility(0);
            }
            if (i == 0 && (vabVar2 = this.w1) != null) {
                vabVar2.setVisibility(0);
            }
            if ((i == 0 || i7 == 0) && (vabVar = this.w1) != null) {
                vabVar.N0.setLayerType(2, null);
            }
            vab vabVar4 = this.w1;
            if (vabVar4 != null) {
                vabVar4.y1.b(i != 0);
            }
            hbbVar.M.b(i != -1);
            v21.e();
            if (this.C1 != null && i7 == 1) {
                f(null);
            }
            b98 b98Var = this.D1;
            if (b98Var != null) {
                b98Var.setAllowTouch(false);
            }
            this.l1.f(true);
            qbb qbbVar = this.n;
            gbb gbbVar = this.Y0;
            Activity activity = this.b;
            if (i == 3) {
                if (this.s1 == null) {
                    cbb cbbVar2 = new cbb(this, activity, gbbVar);
                    this.s1 = cbbVar2;
                    qbbVar.addView(cbbVar2.d);
                    qbbVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
                c8b c8bVar5 = this.L1;
                if (c8bVar5 != null) {
                    this.s1.setEntry(c8bVar5);
                }
            } else if (i7 == 3) {
                gbbVar.a();
                cbb cbbVar3 = this.s1;
                if (cbbVar3 != null) {
                    cbbVar3.a.setCropEditorDrawing(cbbVar3);
                    cbbVar3.E = true;
                }
            }
            if (i == 4) {
                if (this.t1 == null) {
                    dbb dbbVar2 = new dbb(this, activity, gbbVar);
                    this.t1 = dbbVar2;
                    qbbVar.addView(dbbVar2.e);
                    qbbVar.addView(this.t1);
                }
                this.t1.setVisibility(0);
            } else if (i7 == 4) {
                gbbVar.a();
                dbb dbbVar3 = this.t1;
                if (dbbVar3 != null) {
                    dbbVar3.F = true;
                }
            }
        }
        this.c1.b((i == -1 || i == 2) && this.J > 0.0f, z2);
        ArrayList arrayList = new ArrayList();
        c98 c98Var = this.C1;
        boolean z4 = c98Var == null && i == 1;
        float f6 = 1.0f;
        if (i == 1) {
            q();
            c98 c98Var2 = this.C1;
            this.w2 = c98Var2;
            FrameLayout toolsView = c98Var2 != null ? c98Var2.getToolsView() : null;
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
            if (i7 == 1 && c98Var != null) {
                this.w2 = null;
                z3 = z4;
                arrayList.add(ObjectAnimator.ofFloat(c98Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, hl.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.C1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i != 0) {
                    s();
                    this.w2 = this.w1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(pk4Var, (Property<pk4, Float>) property, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.w1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -hl.L(16.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property2, hl.L(48.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -hl.L(32.0f), f));
                } else if (i7 == 0 && this.w1 != null) {
                    this.w2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(pk4Var, (Property<pk4, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property3, f));
                    View topLayout2 = this.w1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -hl.L(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property3, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property4, hl.L(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -hl.L(32.0f)));
                }
                cbbVar = this.s1;
                if (cbbVar == null) {
                    t33 t33Var = cbbVar.h;
                    if (i == 3) {
                        Property property5 = View.ALPHA;
                        i2 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(t33Var, (Property<t33, Float>) property5, 0.0f, 1.0f));
                        t33 t33Var2 = this.s1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f2 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(t33Var2, (Property<t33, Float>) property6, hl.L(52.0f), f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property6, hl.L(52.0f), f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new lab(this, (byte) 1));
                        arrayList.add(ofFloat);
                    } else {
                        f2 = 52.0f;
                        i2 = 2;
                        i2 = 2;
                        if (i7 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(t33Var, (Property<t33, Float>) property7, 1.0f, 0.0f));
                            t33 t33Var3 = this.s1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(t33Var3, (Property<t33, Float>) property8, f, hl.L(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property8, f, hl.L(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.s1.getAppearProgress(), f);
                            ofFloat2.addUpdateListener(new lab(this, i2));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f2 = 52.0f;
                    i2 = 2;
                }
                dbbVar = this.t1;
                if (dbbVar != null) {
                    t33 t33Var4 = dbbVar.n;
                    if (i == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i2];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(t33Var4, (Property<t33, Float>) property9, fArr));
                        t33 t33Var5 = this.t1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i2];
                        fArr2[0] = hl.L(f2);
                        fArr2[1] = f;
                        arrayList.add(ObjectAnimator.ofFloat(t33Var5, (Property<t33, Float>) property10, fArr2));
                        float[] fArr3 = new float[i2];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.t1.r;
                        float[] fArr4 = new float[i2];
                        fArr4[0] = hl.L(f2);
                        fArr4[1] = f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i2];
                        fArr5[0] = this.t1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new lab(this, (byte) 3));
                        arrayList.add(ofFloat3);
                    } else if (i7 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i2];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(t33Var4, (Property<t33, Float>) property11, fArr6));
                        t33 t33Var6 = this.t1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float L = hl.L(f2);
                        float[] fArr7 = new float[i2];
                        fArr7[0] = f;
                        fArr7[1] = L;
                        arrayList.add(ObjectAnimator.ofFloat(t33Var6, (Property<t33, Float>) property12, fArr7));
                        float[] fArr8 = new float[i2];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.t1.r;
                        float L2 = hl.L(f2);
                        float[] fArr9 = new float[i2];
                        fArr9[0] = f;
                        fArr9[1] = L2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i2];
                        fArr10[0] = this.t1.getAppearProgress();
                        fArr10[1] = f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new lab(this, (byte) 4));
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
                        arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property13, ((i != -1 || i == 2) && (this.P1 == i3 || !((c8bVar = this.L1) == null || TextUtils.isEmpty(c8bVar.y)))) ? 1.0f : f));
                        arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property13, (i != -1 || i == 2) ? 1.0f : f));
                        imageView = this.j1;
                        if (imageView != null) {
                            i4 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i == -1 || i == 2) && (c8bVar2 = this.L1) != null && c8bVar2.u) ? 1.0f : f));
                        } else {
                            i4 = 1;
                        }
                        byte b = this.g0;
                        float[] fArr12 = new float[i4];
                        fArr12[0] = ((b != i4 || b == 2) && i == -1) ? 1.0f : f;
                        arrayList.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property13, fArr12));
                        ebb ebbVar = this.i0;
                        if (i == i4) {
                            ebbVar.setPivotY(ebbVar.getMeasuredHeight() * 0.2f);
                            i5 = hl.L(164.0f);
                        } else if (i == 0) {
                            ebbVar.setPivotY(ebbVar.getMeasuredHeight() * 0.6f);
                            i5 = hl.L(40.0f);
                        } else if (i == 2) {
                            ebbVar.setPivotY(f);
                            i5 = ksbVar.getContentHeight() + hl.L(8.0f);
                        } else {
                            i5 = 0;
                        }
                        if (i5 > 0) {
                            f4 = (r10 - i5) / (ebbVar.getHeight() - ((int) ebbVar.getPivotY()));
                        } else {
                            f4 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ebbVar, (Property<ebb, Float>) View.SCALE_X, f4));
                        arrayList.add(ObjectAnimator.ofFloat(ebbVar, (Property<ebb, Float>) View.SCALE_Y, f4));
                        if (i == -1) {
                            f5 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(ebbVar, (Property<ebb, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f5 = 0.0f;
                        }
                        v88Var = this.G1;
                        if (v88Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(v88Var, (Property<v88, Float>) property13, i == 1 ? 1.0f : f5));
                        }
                        t88Var = this.F1;
                        if (t88Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(t88Var, (Property<t88, Float>) property13, i == 1 ? 1.0f : f5));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(hbbVar, (Property<hbb, Float>) property13, i == -1 ? 1.0f : f5));
                        float[] fArr13 = {(i != -1 || i == 2) ? 1.0f : f5};
                        h8b h8bVar = this.m0;
                        arrayList.add(ObjectAnimator.ofFloat(h8bVar, (Property<h8b, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(h8bVar, (Property<h8b, Float>) property14, (i != -1 || i == 2) ? f5 : hl.L(120.0f)));
                        if (i != -1 && i != 2) {
                            f6 = f5;
                        }
                        FrameLayout frameLayout3 = this.Z0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f6));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i == 2 ? hl.L(68.0f) : hl.L(64.0f) + (-(hl.L(12.0f) + hbbVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.k0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - hl.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i == 2 ? -90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property15, i == 2 ? 90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property15, i == 2 ? 90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property15, i == 2 ? 90.0f : f5));
                        imageView2 = this.j1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i == 2 ? 90.0f : f5));
                        }
                        if (this.s0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i6 = 0;
                            ofFloat5.addUpdateListener(new uab(this, 0 == true ? 1 : 0));
                            arrayList.add(ofFloat5);
                        } else {
                            i6 = 0;
                        }
                        if (ksbVar != null) {
                            c8b c8bVar6 = this.L1;
                            boolean z5 = (c8bVar6 == null || !c8bVar6.v() || !this.L1.t() || i == 2) ? true : i6;
                            if (ksbVar.k0 != z5 || !z2) {
                                ksbVar.k0 = z5;
                                if (!z2) {
                                    ksbVar.j0.f(z5, true);
                                }
                                ksbVar.invalidate();
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
                        this.s2.setInterpolator(k43.h);
                        this.s2.addListener(new mw0(this, i7, i, (byte) 4));
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
                arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property13, ((i != -1 || i == 2) && (this.P1 == i3 || !((c8bVar = this.L1) == null || TextUtils.isEmpty(c8bVar.y)))) ? 1.0f : f));
                arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property13, (i != -1 || i == 2) ? 1.0f : f));
                imageView = this.j1;
                if (imageView != null) {
                }
                byte b2 = this.g0;
                float[] fArr122 = new float[i4];
                fArr122[0] = ((b2 != i4 || b2 == 2) && i == -1) ? 1.0f : f;
                arrayList.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property13, fArr122));
                ebb ebbVar2 = this.i0;
                if (i == i4) {
                }
                if (i5 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(ebbVar2, (Property<ebb, Float>) View.SCALE_X, f4));
                arrayList.add(ObjectAnimator.ofFloat(ebbVar2, (Property<ebb, Float>) View.SCALE_Y, f4));
                if (i == -1) {
                }
                v88Var = this.G1;
                if (v88Var != null) {
                }
                t88Var = this.F1;
                if (t88Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(hbbVar, (Property<hbb, Float>) property13, i == -1 ? 1.0f : f5));
                float[] fArr132 = {(i != -1 || i == 2) ? 1.0f : f5};
                h8b h8bVar2 = this.m0;
                arrayList.add(ObjectAnimator.ofFloat(h8bVar2, (Property<h8b, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(h8bVar2, (Property<h8b, Float>) property142, (i != -1 || i == 2) ? f5 : hl.L(120.0f)));
                if (i != -1) {
                    f6 = f5;
                }
                FrameLayout frameLayout32 = this.Z0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f6));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i == 2 ? hl.L(68.0f) : hl.L(64.0f) + (-(hl.L(12.0f) + hbbVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.k0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - hl.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i == 2 ? -90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property152, i == 2 ? 90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property152, i == 2 ? 90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property152, i == 2 ? 90.0f : f5));
                imageView2 = this.j1;
                if (imageView2 != null) {
                }
                if (this.s0.c()) {
                }
                if (ksbVar != null) {
                }
                if (!z2) {
                }
            }
        }
        z3 = z4;
        if (i != 0) {
        }
        cbbVar = this.s1;
        if (cbbVar == null) {
        }
        dbbVar = this.t1;
        if (dbbVar != null) {
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
        arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property132, ((i != -1 || i == 2) && (this.P1 == i3 || !((c8bVar = this.L1) == null || TextUtils.isEmpty(c8bVar.y)))) ? 1.0f : f));
        arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property132, (i != -1 || i == 2) ? 1.0f : f));
        imageView = this.j1;
        if (imageView != null) {
        }
        byte b22 = this.g0;
        float[] fArr1222 = new float[i4];
        fArr1222[0] = ((b22 != i4 || b22 == 2) && i == -1) ? 1.0f : f;
        arrayList.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property132, fArr1222));
        ebb ebbVar22 = this.i0;
        if (i == i4) {
        }
        if (i5 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(ebbVar22, (Property<ebb, Float>) View.SCALE_X, f4));
        arrayList.add(ObjectAnimator.ofFloat(ebbVar22, (Property<ebb, Float>) View.SCALE_Y, f4));
        if (i == -1) {
        }
        v88Var = this.G1;
        if (v88Var != null) {
        }
        t88Var = this.F1;
        if (t88Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(hbbVar, (Property<hbb, Float>) property132, i == -1 ? 1.0f : f5));
        float[] fArr1322 = {(i != -1 || i == 2) ? 1.0f : f5};
        h8b h8bVar22 = this.m0;
        arrayList.add(ObjectAnimator.ofFloat(h8bVar22, (Property<h8b, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(h8bVar22, (Property<h8b, Float>) property1422, (i != -1 || i == 2) ? f5 : hl.L(120.0f)));
        if (i != -1) {
        }
        FrameLayout frameLayout322 = this.Z0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f6));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i == 2 ? hl.L(68.0f) : hl.L(64.0f) + (-(hl.L(12.0f) + hbbVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.k0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - hl.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i == 2 ? -90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property1522, i == 2 ? 90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property1522, i == 2 ? 90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(fq3Var, (Property<fq3, Float>) property1522, i == 2 ? 90.0f : f5));
        imageView2 = this.j1;
        if (imageView2 != null) {
        }
        if (this.s0.c()) {
        }
        if (ksbVar != null) {
        }
        if (!z2) {
        }
    }

    public final void l() {
        boolean z = this.L != 0.0f || this.J < 1.0f || this.C2;
        if (z == this.B2) {
            return;
        }
        e26 e26Var = this.E;
        if (e26Var != null) {
            e26Var.b(!z);
        }
        this.B2 = z;
    }

    public final void l0(boolean z) {
        wab wabVar;
        byte b = this.g0;
        el2 el2Var = this.J0;
        boolean z2 = false;
        h0(b == 0 && this.P1 == 1 && !el2Var.e && !G(), z);
        fbb fbbVar = this.B0;
        boolean i = fbbVar.i();
        fl2 fl2Var = this.H0;
        fl2Var.setSelected(i);
        b0(this.o0, el2Var == null || !el2Var.e, z);
        b0(this.F0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.Z1 == null || el2Var.e || G()) ? false : true, z);
        b0(this.G0, (this.b2 || this.P1 == -1 || this.g0 != 0 || (wabVar = this.C0) == null || !wabVar.a || el2Var.e || fbbVar.i()) ? false : true, z);
        b0(fl2Var, (this.b2 || this.P1 == -1 || this.g0 != 0 || el2Var.e) ? false : true, z);
        b0(this.I0, el2Var.e, z);
        this.P0.e(z, fbbVar.i() ? fbbVar.getFilledProgress() : 0.0f);
        boolean z3 = el2Var.e;
        kg5 kg5Var = this.o1;
        if (z3) {
            kg5Var.v();
        } else {
            kg5Var.f(true);
        }
        e(this.b2, z);
        hl.P3(this.T0, this.P1 == -1 && this.g0 == 0, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z2 = true;
        }
        hl.P3(this.S0, z2, true);
    }

    public final void m() {
        if (this.u2 < 0) {
            this.u2 = uc7.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add(CallAudioDevice.NAME_AUTO);
            this.v2.add("on");
            float f = uc7.e1().getFloat("frontflash_warmth", 0.9f);
            rk4 rk4Var = this.s;
            rk4Var.o = f;
            rk4Var.n = rk4.f(f);
            rk4Var.g();
            rk4Var.p = uc7.e1().getFloat("frontflash_intensity", 1.0f);
            rk4Var.i();
        }
    }

    public final void m0() {
        ntb ntbVar = this.I0;
        ntbVar.setTranslationX(-0.0f);
        float alpha = (ntbVar.getAlpha() * hl.L(46.0f)) + 0.0f;
        otb otbVar = this.G0;
        otbVar.setTranslationX(-alpha);
        float alpha2 = (otbVar.getAlpha() * hl.L(46.0f)) + alpha;
        fl2 fl2Var = this.H0;
        fl2Var.setTranslationX(-alpha2);
        float alpha3 = (fl2Var.getAlpha() * hl.L(46.0f)) + alpha2;
        ntb ntbVar2 = this.F0;
        ntbVar2.setTranslationX(-alpha3);
        float alpha4 = (ntbVar2.getAlpha() * hl.L(46.0f)) + alpha3;
        pk4 pk4Var = this.o0;
        pk4Var.setTranslationX(0.0f);
        iw iwVar = this.J0.a;
        iwVar.setPadding((int) ((pk4Var.getAlpha() * hl.L(46.0f)) + 0.0f + hl.L(8.0f)), 0, (int) (alpha4 + hl.L(8.0f)), 0);
        iwVar.invalidate();
    }

    public final void n() {
        wab wabVar = this.C0;
        if (wabVar == null || wabVar.getTextureView() == null) {
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
                f += hl.B(bitmap.getPixel((i + 1) * width, i2 * height));
            }
        }
        float f2 = f / 100.0f;
        bitmap.recycle();
        this.d2 = f2 < 0.22f;
    }

    public final void n0(boolean z) {
        b29 b29Var = this.i1;
        if (b29Var != null) {
            int[] iArr = b29Var.e;
            c8b c8bVar = this.L1;
            int i = 0;
            if (!z) {
                int i2 = (c8bVar == null || !c8bVar.y0) ? 0 : iArr[0] - 1;
                b29Var.I(i2, false, true);
                this.i1.K(i2);
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            if (c8bVar != null && c8bVar.y0) {
                i = iArr[0];
            }
            b29Var.K(i);
            b29 b29Var2 = this.i1;
            if (b29Var2 != null) {
                b29Var2.start();
            }
        }
    }

    public final void o(boolean z) {
        if (this.d) {
            w9b w9bVar = this.r0;
            if (w9bVar != null) {
                w9bVar.dismiss();
                this.r0 = null;
            }
            c8b c8bVar = this.L1;
            long j = 0;
            if (c8bVar != null && !c8bVar.h) {
                if ((this.w && c8bVar.g) || c8bVar.b != 0) {
                    c8bVar.j = false;
                }
                c8bVar.i(false);
            }
            this.L1 = null;
            mcc mccVar = this.S;
            gbb gbbVar = this.Y0;
            byte b = 1;
            if (mccVar == null || gbbVar == null) {
                if (gbbVar != null && !z) {
                    gbbVar.set(null);
                }
                d(0.0f, z, new mab(this, b));
                boolean z2 = this.K;
                if (z2 || !z2) {
                    this.n.setBackgroundColor(0);
                    this.c1.b(false, true);
                }
                jn7.e().n(this, jn7.r2);
                int i = this.c;
                jn7.f(i).n(this, jn7.B5);
                jn7.f(i).n(this, jn7.d3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            kfc kfcVar = gbbVar.E;
            if (kfcVar != null) {
                kfcVar.f0();
                gbbVar.E.l0();
                gbbVar.E = null;
            }
            kfc kfcVar2 = gbbVar.y;
            if (kfcVar2 != null) {
                j = kfcVar2.S();
                gbbVar.y.f0();
                gbbVar.y.l0();
                gbbVar.y = null;
            }
            kfc kfcVar3 = gbbVar.e;
            if (kfcVar3 != null) {
                j = kfcVar3.S();
                gbbVar.e.f0();
                gbbVar.e.l0();
                gbbVar.e = null;
            }
            mccVar.a(Long.valueOf(j), new kab(this, z, (byte) 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        mab mabVar = new mab(this, (byte) 0);
        vab vabVar = this.w1;
        c8b c8bVar = this.L1;
        if (vabVar == null || c8bVar == null) {
            mabVar.run();
            return;
        }
        c8bVar.f();
        boolean r0 = vabVar.r0();
        boolean z = vabVar.y0.getPainting().E;
        Utilities.g.c(new b6a(this, vabVar, c8bVar.i0, c8bVar.j0, c8bVar, z, r0, mabVar, (byte) 1));
    }

    public final void p() {
        Activity activity = this.b;
        if (this.C0 != null || activity == null) {
            return;
        }
        byte b = 0;
        this.C0 = new wab(this, activity, uc7.e1().getBoolean("stories_camera", false));
        u59 u59Var = this.P0;
        if (u59Var != null) {
            u59Var.h0 = 0.0f;
            u59Var.i0.e(true, 0.0f);
        }
        this.C0.recordHevc = !this.B0.i();
        this.C0.setThumbDrawable(y());
        this.C0.initTexture();
        this.C0.setDelegate(new jab(this, b));
        b0(this.G0, this.C0.a && this.g0 == 0, true);
        this.H0.setTranslationX(this.C0.a ? 0.0f : hl.L(46.0f));
        this.B0.setCameraView(this.C0);
        byte b2 = 2;
        if (uc7.e1().getInt("storyhint2", 0) < 1) {
            this.X0.v();
            uc7.e1().edit().putInt("storyhint2", uc7.e1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!as3.g0(this.C0.getContext()) || !uc7.e1().getBoolean("dualcam", as3.f0(org.telegram.messenger.a.b, false))) && this.C0.a && uc7.e1().getInt("storydualhint", 0) < 2) {
            this.m1.v();
        }
        oy8 oy8Var = this.D0;
        if (oy8Var == null) {
            oy8Var = new oy8(activity, new dab(this, b2));
            this.D0 = oy8Var;
        }
        oy8Var.a(this.C0);
        du9 du9Var = this.E0;
        if (du9Var != null) {
            fbb fbbVar = this.B0;
            Object blurRenderNode = fbbVar.getBlurRenderNode();
            du9Var.G = fbbVar;
            du9Var.H = blurRenderNode;
            du9Var.invalidate();
        }
    }

    public final boolean p0() {
        wab wabVar;
        if ((!this.Q1 && !this.R1) || (wabVar = this.C0) == null || !wabVar.isFrontface()) {
            return false;
        }
        int i = this.u2;
        return i == 2 || (i == 1 && this.d2);
    }

    public final void q() {
        c8b c8bVar;
        Bitmap bitmap;
        Bitmap q;
        if (this.C1 != null || (c8bVar = this.L1) == null) {
            return;
        }
        boolean z = c8bVar.K;
        gbb gbbVar = this.Y0;
        if (z) {
            bitmap = null;
        } else {
            if (c8bVar.Z0 == null) {
                q = gbbVar.getPhotoBitmap();
            } else {
                jab jabVar = new jab(this, (byte) 10);
                Point point = hl.q;
                q = c8b.q(jabVar, point.x, point.y, 0, true);
            }
            bitmap = q;
        }
        if (bitmap != null || this.L1.K) {
            kec textureView = gbbVar.getTextureView();
            int orientation = gbbVar.getOrientation();
            c8b c8bVar2 = this.L1;
            c98 c98Var = new c98(this.b, textureView, bitmap, null, orientation, c8bVar2 != null ? c8bVar2.a1 : null, null, 0, false, false, this.s0, this.a);
            this.C1 = c98Var;
            this.r.addView(c98Var);
            b98 b98Var = this.D1;
            if (b98Var != null) {
                b98Var.setFilterView(this.C1);
            }
            TextureView myTextureView = this.C1.getMyTextureView();
            this.E1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            gbbVar.o(this.E1, this.C1);
            TextureView textureView2 = this.E1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.E1.animate().alpha(1.0f).setDuration(220L).start();
            }
            g();
            t88 blurControl = this.C1.getBlurControl();
            this.F1 = blurControl;
            ebb ebbVar = this.i0;
            if (blurControl != null) {
                ebbVar.addView(blurControl);
            }
            v88 curveControl = this.C1.getCurveControl();
            this.G1 = curveControl;
            if (curveControl != null) {
                ebbVar.addView(curveControl);
            }
            U();
            this.C1.getDoneTextView().setOnClickListener(new eab(this, (byte) 13));
            this.C1.getCancelTextView().setOnClickListener(new eab(this, (byte) 14));
            this.C1.getToolsView().setVisibility(8);
            this.C1.getToolsView().setAlpha(0.0f);
            this.C1.getToolsView().setTranslationY(hl.L(186.0f));
            this.C1.j0.setVisibility(0);
        }
    }

    public final void r(boolean z) {
        zt4 zt4Var = this.N0;
        fbb fbbVar = this.B0;
        if (zt4Var != null) {
            boolean z2 = fbbVar != null && fbbVar.i();
            zt4 zt4Var2 = this.N0;
            if (z2 == zt4Var2.Q) {
                return;
            } else {
                zt4Var = zt4Var2;
            }
        }
        if (this.b == null) {
            return;
        }
        if (zt4Var != null) {
            u();
        }
        zt4 zt4Var3 = new zt4(this, this.c, this.b, this.a, this.n2, z, !z, fbbVar != null && fbbVar.i());
        this.N0 = zt4Var3;
        zt4Var3.H.setVisibility(8);
        this.N0.setMultipleOnClick(fbbVar.i());
        this.N0.setMaxCount(Math.min(10, al2.b() - fbbVar.getFilledCount()));
        this.N0.setOnBackClickListener(new bab(this, (byte) 28));
        byte b = 2;
        this.N0.setOnSelectListener(new oo2(this, z, b));
        this.N0.setOnSelectMultipleListener(new ih6(this, b));
        w46 w46Var = this.m2;
        if (w46Var != null) {
            ar0 ar0Var = this.N0.e;
            ar0Var.B = w46Var;
            ar0Var.k0();
        }
        this.n.addView(this.N0, tre.e(-1, -1, jn7.D1));
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
        c8b c8bVar;
        gbb gbbVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        pa9 renderView;
        ebb ebbVar;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file;
        File file2;
        if (this.w1 != null) {
            return;
        }
        gbb gbbVar2 = this.Y0;
        Pair<Integer, Integer> paintSize = gbbVar2.getPaintSize();
        c8b c8bVar2 = this.L1;
        Bitmap decodeFile = (c8bVar2 == null || !(c8bVar2.c || c8bVar2.g || this.I1 != null) || (file2 = c8bVar2.P0) == null) ? null : BitmapFactory.decodeFile(file2.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        c8b c8bVar3 = this.L1;
        boolean z6 = false;
        if (c8bVar3 == null || (!(c8bVar3.c || c8bVar3.g || this.I1 != null) || (file = c8bVar3.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file.getPath());
            if (bitmap != null) {
                z = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                ebb ebbVar2 = this.i0;
                int measuredWidth = ebbVar2.getMeasuredWidth();
                int measuredHeight = ebbVar2.getMeasuredHeight();
                c8bVar = this.L1;
                if (c8bVar != null || c8bVar.M) {
                    gbbVar = gbbVar2;
                    z2 = false;
                } else {
                    gbbVar = gbbVar2;
                    z2 = true;
                }
                File file3 = c8bVar != null ? null : c8bVar.L;
                if (c8bVar == null && c8bVar.K) {
                    z3 = false;
                    z6 = true;
                } else {
                    z3 = false;
                }
                if (c8bVar != null || c8bVar.J0 == 0) {
                    z4 = z;
                    z5 = z3;
                } else {
                    z4 = z;
                    z5 = true;
                }
                int orientation = gbbVar.getOrientation();
                c8b c8bVar4 = this.L1;
                ArrayList arrayList = c8bVar4 != null ? c8bVar4.T0 : null;
                fo6 fo6Var = new fo6();
                o00 o00Var = this.t0;
                gbb gbbVar3 = this.Y0;
                Activity activity = this.b;
                boolean z7 = z4;
                vab vabVar = new vab(this, activity, z2, file3, z6, z5, this.n, activity, this.c, bitmap2, bitmap3, orientation, arrayList, c8bVar4, measuredWidth, measuredHeight, fo6Var, this.s0, this.a, o00Var, gbbVar3);
                this.w1 = vabVar;
                c8b c8bVar5 = this.L1;
                vabVar.setHasAudio(c8bVar5 == null && c8bVar5.y != null);
                this.w1.setBlurManager(this.s0);
                this.r.addView(this.w1);
                renderView = this.w1.getRenderView();
                this.x1 = renderView;
                if (renderView == null) {
                    renderView.getPainting().E = z7;
                    ebbVar = ebbVar2;
                    ebbVar.addView(this.x1);
                } else {
                    ebbVar = ebbVar2;
                }
                renderInputView = this.w1.getRenderInputView();
                this.y1 = renderInputView;
                if (renderInputView != null) {
                    ebbVar.addView(renderInputView);
                }
                textDimView = this.w1.getTextDimView();
                this.z1 = textDimView;
                if (textDimView != null) {
                    ebbVar.addView(textDimView);
                }
                entitiesView = this.w1.getEntitiesView();
                this.A1 = entitiesView;
                if (entitiesView != null) {
                    ebbVar.addView(entitiesView);
                }
                selectionEntitiesView = this.w1.getSelectionEntitiesView();
                this.B1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    ebbVar.addView(selectionEntitiesView);
                }
                U();
                this.w1.setOnDoneButtonClickedListener(new bab(this, (byte) 20));
                this.w1.setOnCancelButtonClickedListener(new bab(this, (byte) 21));
                vab vabVar2 = this.w1;
                vabVar2.B0.setVisibility(0);
                vabVar2.y0.setVisibility(0);
                vabVar2.z0.setVisibility(0);
            }
        }
        z = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        ebb ebbVar22 = this.i0;
        int measuredWidth2 = ebbVar22.getMeasuredWidth();
        int measuredHeight2 = ebbVar22.getMeasuredHeight();
        c8bVar = this.L1;
        if (c8bVar != null) {
        }
        gbbVar = gbbVar2;
        z2 = false;
        if (c8bVar != null) {
        }
        if (c8bVar == null) {
        }
        z3 = false;
        if (c8bVar != null) {
        }
        z4 = z;
        z5 = z3;
        int orientation2 = gbbVar.getOrientation();
        c8b c8bVar42 = this.L1;
        ArrayList arrayList2 = c8bVar42 != null ? c8bVar42.T0 : null;
        fo6 fo6Var2 = new fo6();
        o00 o00Var2 = this.t0;
        gbb gbbVar32 = this.Y0;
        Activity activity2 = this.b;
        boolean z72 = z4;
        vab vabVar3 = new vab(this, activity2, z2, file3, z6, z5, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, arrayList2, c8bVar42, measuredWidth2, measuredHeight2, fo6Var2, this.s0, this.a, o00Var2, gbbVar32);
        this.w1 = vabVar3;
        c8b c8bVar52 = this.L1;
        vabVar3.setHasAudio(c8bVar52 == null && c8bVar52.y != null);
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
        this.w1.setOnDoneButtonClickedListener(new bab(this, (byte) 20));
        this.w1.setOnCancelButtonClickedListener(new bab(this, (byte) 21));
        vab vabVar22 = this.w1;
        vabVar22.B0.setVisibility(0);
        vabVar22.y0.setVisibility(0);
        vabVar22.z0.setVisibility(0);
    }

    public final void t(boolean z) {
        oy8 oy8Var = this.D0;
        if (oy8Var != null) {
            oy8Var.f = null;
            Utilities.e.a((ly8) oy8Var.h);
            this.D0 = null;
            fbb fbbVar = this.B0;
            if (fbbVar != null) {
                fbbVar.c.c(null);
            }
        }
        du9 du9Var = this.E0;
        if (du9Var != null) {
            du9Var.G = null;
            du9Var.H = null;
            du9Var.invalidate();
        }
        if (this.C0 != null) {
            if (z) {
                a0(new bab(this, (byte) 6));
                return;
            }
            a0(new bab(this, (byte) 7));
            this.C0.destroy(true, null);
            hl.B2(this.C0);
            fbb fbbVar2 = this.B0;
            if (fbbVar2 != null) {
                fbbVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void u() {
        zt4 zt4Var = this.N0;
        if (zt4Var == null) {
            return;
        }
        this.n.removeView(zt4Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        vpa vpaVar = this.p2;
        if (vpaVar != null) {
            vpaVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void w() {
        c98 c98Var = this.C1;
        if (c98Var == null) {
            return;
        }
        c98Var.c();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        ebb ebbVar = this.i0;
        if (textureView != null) {
            ebbVar.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        t88 t88Var = this.F1;
        if (t88Var != null) {
            ebbVar.removeView(t88Var);
            this.F1 = null;
        }
        v88 v88Var = this.G1;
        if (v88Var != null) {
            ebbVar.removeView(v88Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void x() {
        vab vabVar = this.w1;
        if (vabVar != null) {
            vabVar.B0.removeAllViews();
            vab vabVar2 = this.w1;
            gc1 gc1Var = vabVar2.U1;
            if (gc1Var != null) {
                gc1Var.b.c();
                gd4 gd4Var = gc1Var.c;
                if (gd4Var != null) {
                    gd4Var.f = null;
                    v21 v21Var = (v21) gd4Var.g;
                    if (v21Var != null) {
                        v21Var.b();
                        gd4Var.g = null;
                    }
                    gc1Var.c = null;
                }
            }
            vabVar2.y0.h();
            vabVar2.B0.setVisibility(8);
            vabVar2.A0.setVisibility(8);
            vabVar2.o0.postRunnable(new pg6((byte) 12));
            tw7 tw7Var = vabVar2.Y1;
            if (tw7Var != null) {
                tw7Var.dismiss();
            }
            sm2 sm2Var = vabVar2.D1;
            if (sm2Var != null) {
                sm2Var.dismiss();
            }
            this.r.removeView(this.w1);
            this.w1 = null;
            pa9 pa9Var = this.x1;
            ebb ebbVar = this.i0;
            if (pa9Var != null) {
                ebbVar.removeView(pa9Var);
                this.x1 = null;
            }
            View view = this.z1;
            if (view != null) {
                ebbVar.removeView(view);
                this.z1 = null;
            }
            View view2 = this.y1;
            if (view2 != null) {
                ebbVar.removeView(view2);
                this.y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                ebbVar.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                ebbVar.removeView(view4);
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
        c8b c8bVar = this.L1;
        if (c8bVar != null) {
            return c8bVar.r();
        }
        return 1;
    }
}
