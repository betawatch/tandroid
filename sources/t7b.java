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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class t7b implements gk7 {
    public static t7b G2;
    public fk2 A0;
    public View A1;
    public boolean A2;
    public final h7b B0;
    public View B1;
    public boolean B2;
    public y6b C0;
    public l58 C1;
    public boolean C2;
    public dv8 D0;
    public final k58 D1;
    public d7b D2;
    public final a06 E;
    public final lq9 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final mpb F0;
    public c58 F1;
    public ValueAnimator F2;
    public o7b G;
    public final npb G0;
    public e58 G1;
    public float H;
    public final kk2 H0;
    public File H1;
    public final RectF I;
    public final mpb I0;
    public ArrayList I1;
    public float J;
    public final jk2 J0;
    public ArrayList J1;
    public boolean K;
    public final tcc K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public f4b L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public vr4 N0;
    public long N1;
    public long O;
    public eq3 O0;
    public boolean O1;
    public boolean P;
    public final f29 P0;
    public int P1;
    public final on Q;
    public final u41 Q0;
    public boolean Q1;
    public Runnable R;
    public final q6b R0;
    public boolean R1;
    public m8c S;
    public final ki4 S0;
    public boolean S1;
    public int T;
    public final ki4 T0;
    public boolean T1;
    public int U;
    public final ge5 U0;
    public float U1;
    public int V;
    public final ge5 V0;
    public int V1;
    public boolean W;
    public final azc W0;
    public boolean W1;
    public boolean X;
    public final je5 X0;
    public boolean X1;
    public boolean Y;
    public final i7b Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final f53 a;
    public int a0;
    public final kob a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final kcc b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final vi8 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final j7b d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final p6b e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final op3 f1;
    public Runnable f2;
    public byte g0;
    public oy8 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final ry8 h1;
    public a5b h2;
    public final g7b i0;
    public oy8 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final s71 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final je5 l1;
    public boolean l2;
    public final oc6 m0;
    public final je5 m1;
    public s26 m2;
    public final s7b n;
    public final FrameLayout n0;
    public final je5 n1;
    public xl6 n2;
    public final ki4 o0;
    public final je5 o1;
    public ValueAnimator o2;
    public final oy9 p0;
    public final wi8 p1;
    public yla p2;
    public final jia q0;
    public final k1c q1;
    public Boolean q2;
    public final l7b r;
    public y5b r0;
    public pb1 r1;
    public l6b r2;
    public final mi4 s;
    public final sl0 s0;
    public e7b s1;
    public AnimatorSet s2;
    public final n00 t0;
    public f7b t1;
    public boolean t2;
    public final si9 u0;
    public final kob u1;
    public int u2;
    public boolean v0;
    public final u41 v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public x6b w1;
    public p7b w2;
    public long x;
    public String x0;
    public c79 x1;
    public boolean x2;
    public k7b y;
    public TLRPC.InputPeer y0;
    public View y1;
    public d6b y2;
    public w5b z0;
    public View z1;
    public sm3 z2;

    public t7b(Activity activity, int i) {
        f53 f53Var = new f53();
        this.a = f53Var;
        this.x = 0L;
        this.I = new RectF();
        byte b = 1;
        this.N = true;
        this.Q = new on(null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        this.g0 = (byte) 0;
        this.h0 = -1;
        this.z0 = new w5b();
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
        t6b t6bVar = new t6b(this);
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
        gl.m(layoutParams);
        layoutParams.flags = -2013200128;
        byte b2 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        s7b s7bVar = new s7b(this, activity);
        this.n = s7bVar;
        k6b k6bVar = new k6b(this, b);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(s7bVar, k6bVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        mi4 mi4Var = new mi4(activity, windowManager, this.n, layoutParams);
        this.s = mi4Var;
        mi4Var.a(new b7b(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        s7b s7bVar2 = this.n;
        l7b l7bVar = new l7b(this, activity);
        this.r = l7bVar;
        s7bVar2.addView(l7bVar);
        l7b l7bVar2 = this.r;
        g7b g7bVar = new g7b(this, activity);
        this.i0 = g7bVar;
        l7bVar2.addView(g7bVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new sl0(this.i0);
        this.t0 = new n00();
        l7b l7bVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        l7bVar3.addView(frameLayout);
        l7b l7bVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        l7bVar4.addView(frameLayout2);
        l7b l7bVar5 = this.r;
        oc6 oc6Var = new oc6((byte) 29, activity, this);
        this.m0 = oc6Var;
        l7bVar5.addView(oc6Var);
        byte b3 = 8;
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        l7b l7bVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        l7bVar6.addView(frameLayout3);
        byte b4 = 15;
        m21.a(this.n, new oy(b4));
        h7b h7bVar = new h7b(this, activity, this.s0, this.r, f53Var);
        this.B0 = h7bVar;
        s7b s7bVar3 = this.n;
        Objects.requireNonNull(s7bVar3);
        h7bVar.setCancelGestures(new kya(s7bVar3, b2));
        this.B0.setResetState(new d6b(this, (byte) 13));
        this.i0.addView(this.B0, nme.e(-1, -1, kk7.D1));
        this.B0.setOnClickListener(new f6b(this, (byte) 12));
        g7b g7bVar2 = this.i0;
        boolean z = this.K;
        g7bVar2.setBackgroundColor((z || !z) ? 0 : -14737633);
        g7b g7bVar3 = this.i0;
        float L = gl.L(12.0f);
        xi xiVar = zdc.a;
        g7bVar3.setOutlineProvider(new xdc(0, L));
        this.i0.setClipToOutline(true);
        d6b d6bVar = new d6b(this, (byte) 14);
        k58 k58Var = new k58(activity);
        k58Var.a = new TextPaint(1);
        k58Var.b = new TextPaint(1);
        s33 s33Var = s33.h;
        k58Var.s = new lm(k58Var, 0L, 350L, s33Var);
        k58Var.J = new oq7(k58Var, (byte) 21);
        k58Var.y = d6bVar;
        this.D1 = k58Var;
        i7b i7bVar = new i7b(this, activity, this.s0, this.t0);
        this.Y0 = i7bVar;
        i7bVar.setCollageView(this.B0);
        i7b i7bVar2 = this.Y0;
        i7bVar2.w = new d6b(this, b4);
        i7bVar2.setOnTapListener(new d6b(this, b2));
        this.Y0.setVisibility(8);
        i7b i7bVar3 = this.Y0;
        i7bVar3.O = new d6b(this, (byte) 17);
        this.i0.addView(i7bVar3, nme.e(-1, -1, kk7.D1));
        this.i0.addView(this.D1, nme.e(-1, -1, kk7.D1));
        s7b s7bVar4 = this.n;
        j7b j7bVar = new j7b(this, activity, s7bVar4, s7bVar4, this.r, f53Var, this.s0);
        this.d1 = j7bVar;
        j7bVar.setAccount(i);
        this.d1.setUiBlurBitmap(new v0b((byte) 2));
        m21.a(this.m0, new s10(this, (byte) 20));
        this.d1.setOnHeightUpdate(new e6b(this, (byte) 14));
        this.d1.setOnPeriodUpdate(new e6b(this, (byte) 5));
        long j = this.O;
        if (j != 0) {
            this.d1.setDialogId(j);
        }
        this.d1.setOnPremiumHint(new e6b(this, (byte) 6));
        this.d1.setOnKeyboardOpen(new e6b(this, (byte) 7));
        si9 si9Var = new si9((byte) 11, activity, this);
        this.u0 = si9Var;
        this.r.addView(si9Var);
        kob kobVar = new kob(activity, this.r, this.i0, f53Var, this.s0);
        this.a1 = kobVar;
        kobVar.setOnTimelineClick(new d6b(this, (byte) 10));
        this.a1.setOnHeightChange(new d6b(this, (byte) 11));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        frameLayout4.addView(this.a1, nme.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        kcc kccVar = new kcc(activity);
        this.b1 = kccVar;
        kccVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, nme.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, nme.d(-1, 413.0f, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, nme.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        kob kobVar2 = new kob(activity, this.r, this.i0, f53Var, this.s0);
        this.u1 = kobVar2;
        kobVar2.Y0 = true;
        kobVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, nme.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        p6b p6bVar = new p6b(this, activity, f53Var, this.s0);
        this.e1 = p6bVar;
        p6bVar.setVisibility(8);
        this.m0.addView(this.e1, nme.e(-1, -2, 85));
        ki4 ki4Var = new ki4(activity);
        this.o0 = ki4Var;
        ki4Var.setContentDescription(k96.M0(2131754878, null));
        ki4 ki4Var2 = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ki4Var2.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_photo_back);
        ki4 ki4Var3 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ki4Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(bkb.f0(553648127, 1, -1));
        this.o0.setOnClickListener(new f6b(this, b));
        this.j0.addView(this.o0, nme.e(56, 56, 51));
        this.s.a(this.o0);
        oy9 oy9Var = new oy9(activity, i);
        this.p0 = oy9Var;
        oy9Var.a(false, false);
        this.p0.setOnClickListener(new b99(this, activity, (byte) 23));
        this.j0.addView(this.p0, nme.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        jia jiaVar = new jia(activity);
        this.q0 = jiaVar;
        jiaVar.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(gl.o());
        this.q0.l(k96.M0(2131746160, null), false);
        this.q0.getPaint().setShadowLayer(gl.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(gl.L(144.0f));
        this.j0.addView(this.q0, nme.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, nme.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        e6b e6bVar = new e6b(this, b3);
        s7b s7bVar5 = this.n;
        op3 op3Var = new op3(activity);
        op3Var.x = true;
        op3Var.y = true;
        op3Var.h = e6bVar;
        op3Var.a = i;
        op3Var.b = s7bVar5;
        op3Var.setScaleType(scaleType);
        op3Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        op3Var.setBackground(bkb.f0(553648127, 1, -1));
        op3Var.setVisibility(8);
        op3Var.setAlpha(0.0f);
        op3Var.setOnClickListener(new yj3(op3Var, (byte) 2));
        op3Var.f = new ih2(gl.L(18.0f), gl.L(2.0f), -1);
        op3Var.d();
        this.f1 = op3Var;
        je5 je5Var = new je5(activity, 1);
        je5Var.n(1.0f, -71.0f);
        je5Var.d = 2000L;
        je5Var.V = false;
        je5Var.I.r(true, false);
        this.l1 = je5Var;
        je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        this.j0.addView(this.l1, nme.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ry8 ry8Var = new ry8(activity);
        this.h1 = ry8Var;
        ry8Var.setScaleType(scaleType);
        ry8 ry8Var2 = this.h1;
        f4b f4bVar = this.L1;
        ry8Var2.setImageResource((f4bVar == null || !f4bVar.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(bkb.f0(553648127, 1, -1));
        this.h1.setOnClickListener(new f6b(this, (byte) 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        s71 s71Var = new s71(activity, (byte) 17);
        this.k1 = s71Var;
        s71Var.setBackground(bkb.f0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new f6b(this, (byte) 3));
        this.k0.addView(this.k1, nme.r(46, 56, 53));
        this.k0.addView(this.h1, nme.r(46, 56, 53));
        this.k0.addView(this.f1, nme.e(46, 56, 53));
        mpb mpbVar = new mpb(activity);
        this.F0 = mpbVar;
        mpbVar.setBackground(bkb.f0(553648127, 1, -1));
        this.F0.setOnClickListener(new f6b(this, (byte) 4));
        this.F0.setOnLongClickListener(new zs(this, (byte) 18));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, nme.e(56, 56, 53));
        npb npbVar = new npb(activity);
        this.G0 = npbVar;
        npbVar.setContentDescription(k96.M0(2131754886, null));
        this.G0.setOnClickListener(new f6b(this, (byte) 5));
        boolean o = ir3.o(activity);
        this.G0.setVisibility(o ? 0 : 8);
        this.G0.setAlpha(o ? 1.0f : 0.0f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, nme.e(56, 56, 53));
        kk2 kk2Var = new kk2(activity);
        this.H0 = kk2Var;
        kk2Var.setContentDescription(k96.M0(2131754895, null));
        this.H0.setBackground(bkb.f0(553648127, 1, -1));
        if (this.A0 == null) {
            this.A0 = (fk2) fk2.a().get(6);
        }
        this.H0.setOnClickListener(new f6b(this, (byte) 6));
        this.H0.a(new gk2(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, nme.e(56, 56, 53));
        mpb mpbVar2 = new mpb(activity);
        this.I0 = mpbVar2;
        mpbVar2.setContentDescription(k96.M0(2131754894, null));
        this.I0.setBackground(bkb.f0(553648127, 1, -1));
        this.I0.a(new gk2(new fk2("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new f6b(this, (byte) 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, nme.e(56, 56, 53));
        jk2 jk2Var = new jk2(activity, this.s);
        this.J0 = jk2Var;
        jk2Var.a.w0(6);
        this.J0.setSelected((fk2) null);
        this.J0.setOnLayoutClick(new e6b(this, (byte) 9));
        this.j0.addView(this.J0, nme.e(-1, 56, 53));
        je5 je5Var2 = new je5(activity, 1);
        je5Var2.n(1.0f, -20.0f);
        je5Var2.d = 5000L;
        je5Var2.j(true);
        je5Var2.t(k96.M0(2131744476, null));
        je5Var2.r0 = new cza(b);
        this.m1 = je5Var2;
        je5Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        this.j0.addView(this.m1, nme.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        je5 je5Var3 = new je5(activity, 2);
        je5Var3.n(0.0f, 28.0f);
        je5Var3.d = 5000L;
        je5Var3.p(true);
        this.n1 = je5Var3;
        this.j0.addView(je5Var3, nme.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        je5 je5Var4 = new je5(activity, 1);
        je5Var4.n(1.0f, -20.0f);
        je5Var4.d = 5000L;
        je5Var4.t(k96.M0(2131744464, null));
        this.o1 = je5Var4;
        je5Var4.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        this.j0.addView(this.o1, nme.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        tcc tccVar = new tcc(activity);
        Paint paint = new Paint(1);
        tccVar.a = paint;
        Paint paint2 = new Paint(1);
        tccVar.b = paint2;
        tccVar.e = new lm(tccVar, 0L, 250L, s33Var);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        gn gnVar = new gn(false, true, true);
        tccVar.c = gnVar;
        gnVar.n(0.3f, 250L, s33Var);
        gnVar.w(gl.L(13.0f));
        gnVar.u(-1);
        gnVar.x(gl.o());
        gnVar.setCallback(tccVar);
        gnVar.b = 1;
        tccVar.a(0L, false);
        this.K0 = tccVar;
        h0(false, false);
        this.j0.addView(this.K0, nme.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.N(0);
        f29 f29Var = new f29(activity);
        this.P0 = f29Var;
        f29Var.setDelegate(t6bVar);
        f29 f29Var2 = this.P0;
        boolean z2 = this.P1 == 1;
        f29Var2.o0 = -1.0f;
        f29Var2.p0 = z2;
        f29Var2.invalidate();
        this.l0.addView(this.P0, nme.e(-1, 100, 87));
        this.s.a(this.P0);
        this.P0.e(true, this.B0.i() ? this.B0.getFilledProgress() : 0.0f);
        u41 u41Var = new u41(f53Var, activity, true);
        this.Q0 = u41Var;
        u41Var.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(k96.M0(2131748596, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, nme.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new f6b(this, (byte) 8));
        je5 je5Var5 = new je5(activity, 3);
        je5Var5.p(true);
        je5Var5.t(k96.M0(2131744474, null));
        je5Var5.h = gl.L(320.0f);
        je5Var5.d = 5000L;
        je5Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = je5Var5;
        this.l0.addView(je5Var5, nme.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        azc azcVar = new azc(activity);
        this.W0 = azcVar;
        azcVar.N = false;
        azcVar.setAlpha(0.0f);
        this.l0.addView(this.W0, nme.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new k6b(this, (byte) 4));
        azc azcVar2 = this.W0;
        this.U1 = 0.0f;
        azcVar2.b(false, 0.0f);
        byte b5 = 12;
        lq9 lq9Var = new lq9(activity, i, new d6b(this, b5));
        this.E0 = lq9Var;
        lq9Var.c = new e6b(this, (byte) 10);
        this.l0.addView(lq9Var, nme.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        q6b q6bVar = new q6b(this, activity);
        this.R0 = q6bVar;
        q6bVar.setOnSwitchModeListener(new e6b(this, (byte) 11));
        this.R0.setOnSwitchingModeListener(new e6b(this, b5));
        this.n0.addView(this.R0, nme.e(-1, 48, 55));
        this.s.a(this.R0);
        ki4 ki4Var4 = new ki4(activity);
        this.S0 = ki4Var4;
        ki4Var4.setContentDescription(k96.M0(2131754751, null));
        this.S0.setImageResource(R.drawable.stream_flip);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(bkb.f0(553648127, 1, -1));
        this.n0.addView(this.S0, nme.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new f6b(this, (byte) 9));
        ki4 ki4Var5 = new ki4(activity);
        this.T0 = ki4Var5;
        ki4Var5.setContentDescription(k96.M0(2131748598, null));
        this.T0.setImageResource(R.drawable.stream_settings);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(bkb.f0(553648127, 1, -1));
        this.n0.addView(this.T0, nme.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new f6b(this, (byte) 10));
        ge5 ge5Var = new ge5(activity);
        this.U0 = ge5Var;
        this.n0.addView(ge5Var, nme.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        ge5 ge5Var2 = new ge5(activity);
        this.V0 = ge5Var2;
        ge5Var2.a.t(k96.M0(2131744463, null), false, true);
        ge5Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, nme.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        u41 u41Var2 = new u41(f53Var, activity, true);
        u41Var2.setRoundRadius(24);
        this.v1 = u41Var2;
        u41Var2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(k96.M0(2131744449, null), false, true);
        this.v1.setOnClickListener(new f6b(this, (byte) 11));
        this.n0.addView(this.v1, nme.d(-1, 48.0f, kk7.D1, 10.0f, 10.0f, 10.0f, 10.0f));
        vi8 vi8Var = new vi8(activity);
        vi8Var.b = new ArrayList();
        vi8Var.e = true;
        vi8Var.h = true;
        View view = new View(activity);
        vi8Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        vi8Var.addView(view, nme.e(-1, -1, kk7.D1));
        vi8Var.a(0, R.drawable.media_draw, k96.M0(2131754813, null));
        vi8Var.a(2, R.drawable.msg_photo_sticker, k96.M0(2131754755, null));
        vi8Var.a(1, R.drawable.msg_photo_text2, k96.M0(2131754806, null));
        vi8Var.a(3, R.drawable.media_crop, k96.M0(2131751687, null));
        vi8Var.a(4, R.drawable.msg_photo_settings, k96.M0(2131754810, null));
        String M0 = k96.M0(2131745448, null);
        vi8Var.d = M0;
        vi8Var.e = true;
        ui8 ui8Var = new ui8(vi8Var, activity, M0, true);
        vi8Var.c = ui8Var;
        ui8Var.setContentDescription(k96.M0(2131745448, null));
        vi8Var.addView(vi8Var.c, nme.c(-2.0f, -2));
        vi8Var.e();
        this.c1 = vi8Var;
        vi8Var.setVisibility(8);
        this.c1.setOnClickListener(new e6b(this, (byte) 13));
        this.n0.addView(this.c1, nme.e(-1, 52, 23));
        k1c k1cVar = new k1c(activity);
        this.q1 = k1cVar;
        k1cVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, nme.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        wi8 wi8Var = new wi8(activity, i, f53Var);
        this.p1 = wi8Var;
        this.i0.addView(wi8Var, nme.e(-1, -1, kk7.D1));
        l0(false);
    }

    public static t7b C(Activity activity, int i) {
        t7b t7bVar = G2;
        if (t7bVar != null && (t7bVar.b != activity || t7bVar.c != i)) {
            t7bVar.o(false);
            t7bVar = null;
            G2 = null;
        }
        if (t7bVar != null) {
            return t7bVar;
        }
        t7b t7bVar2 = new t7b(activity, i);
        G2 = t7bVar2;
        return t7bVar2;
    }

    public static SpannableString k(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable d = b00.d(context, R.drawable.story_camera);
        int L = gl.L(35.0f);
        int i = -L;
        d.setBounds(i / 4, i, (L / 4) * 3, 0);
        spannableString.setSpan(new c7b(d, d), 0, 1, 33);
        return spannableString;
    }

    public static void v() {
        t7b t7bVar = G2;
        if (t7bVar != null) {
            t7bVar.o(false);
        }
        G2 = null;
    }

    public final String A() {
        y6b y6bVar = this.C0;
        if (y6bVar == null || y6bVar.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        m();
        return (String) this.v2.get(this.u2);
    }

    public final eq3 B() {
        if (this.O0 == null) {
            eq3 eq3Var = new eq3(this.b);
            this.O0 = eq3Var;
            this.l0.addView(eq3Var, nme.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String D() {
        y6b y6bVar = this.C0;
        if (y6bVar == null || y6bVar.getCameraSession() == null) {
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
            oy8 oy8Var = new oy8(R.raw.sun_outline, gl.L(28.0f), gl.L(28.0f), true, null);
            this.i1 = oy8Var;
            oy8Var.h = true;
            f4b f4bVar = this.L1;
            byte b = 0;
            if (f4bVar == null || !f4bVar.y0) {
                oy8Var.K(0);
                this.i1.H(0);
            } else {
                oy8Var.H(35);
                this.i1.K(36);
            }
            this.i1.a0 = true;
            int v0 = bkb.v0(bkb.I9, this.a);
            this.i1.L(v0, "Sunny");
            this.i1.L(v0, "Path 6");
            this.i1.L(v0, "Path");
            this.i1.L(v0, "Path 5");
            this.i1.j();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(bkb.f0(553648127, 1, -1));
            this.j1.setOnClickListener(new f6b(this, b));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, nme.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void F() {
        x6b x6bVar = this.w1;
        if (x6bVar == null) {
            return;
        }
        this.w2 = null;
        x6bVar.getTopLayout().setAlpha(0.0f);
        this.w1.getTopLayout().setTranslationY(-gl.L(16.0f));
        this.w1.getBottomLayout().setAlpha(0.0f);
        this.w1.getBottomLayout().setTranslationY(gl.L(48.0f));
        this.w1.getWeightChooserView().setTranslationX(-gl.L(32.0f));
        this.w1.setVisibility(8);
    }

    public final boolean G() {
        return !this.b2 && (this.B0.i() ? this.B0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean H() {
        vr4 vr4Var;
        if (this.X || (vr4Var = this.N0) == null) {
            return false;
        }
        return vr4Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) gl.q.y) * 0.35f))) - (a.getCurrentActionBarHeight() + gl.m)));
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
        f4b f4bVar;
        f4b f4bVar2;
        u41 u41Var;
        jia jiaVar;
        int i2;
        char c;
        float L;
        ImageView imageView;
        f4b f4bVar3;
        f4b f4bVar4;
        f4b f4bVar5;
        f4b f4bVar6;
        y6b y6bVar;
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
        vi8 vi8Var = this.c1;
        if (vi8Var != null) {
            vi8Var.b(i == 1, z);
        }
        jk2 jk2Var = this.J0;
        h0(i == 0 && this.P1 == 1 && !jk2Var.e && !G(), z);
        if (i != 1) {
            this.b1.a(z);
        }
        b0(this.o0, !jk2Var.e, z);
        b0(this.F0, (this.b2 || i != 0 || jk2Var.e || this.Z1 == null || G()) ? false : true, z);
        boolean z2 = this.b2;
        h7b h7bVar = this.B0;
        b0(this.G0, (z2 || i != 0 || (y6bVar = this.C0) == null || !y6bVar.a || jk2Var.e || h7bVar.i()) ? false : true, true);
        b0(this.H0, (this.b2 || i != 0 || jk2Var.e) ? false : true, z);
        l0(z);
        op3 op3Var = this.f1;
        s71 s71Var = this.k1;
        ry8 ry8Var = this.h1;
        kob kobVar = this.u1;
        kob kobVar2 = this.a1;
        u41 u41Var2 = this.v1;
        jia jiaVar2 = this.q0;
        j7b j7bVar = this.d1;
        ge5 ge5Var = this.V0;
        ge5 ge5Var2 = this.U0;
        lq9 lq9Var = this.E0;
        i7b i7bVar = this.Y0;
        oc6 oc6Var = this.m0;
        q6b q6bVar = this.R0;
        f29 f29Var = this.P0;
        if (!z) {
            y6b y6bVar2 = this.C0;
            if (y6bVar2 != null) {
                y6bVar2.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            i7bVar.setAlpha(((i != 1 || h7bVar.i()) && i != 2) ? 0.0f : 1.0f);
            h7bVar.setAlpha((i == 0 || (i == 1 && h7bVar.i())) ? 1.0f : 0.0f);
            f29Var.setAlpha(i == 0 ? 1.0f : 0.0f);
            f29Var.setTranslationY(i == 0 ? 0.0f : gl.L(16.0f));
            lq9Var.setAlpha(i == 0 ? 1.0f : 0.0f);
            q6bVar.setAlpha((i != 0 || G()) ? 0.0f : 1.0f);
            q6bVar.setTranslationY((i != 0 || G()) ? gl.L(16.0f) : 0.0f);
            ge5Var2.setAlpha((i == 0 && this.b2 && !G()) ? 1.0f : 0.0f);
            ge5Var.setAlpha((i == 0 && !this.b2 && G()) ? 0.6f : 0.0f);
            oc6Var.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
            oc6Var.setTranslationY((i == 1 || i == 2) ? 0.0f : gl.L(12.0f));
            j7bVar.setAlpha(i == 2 ? 0.0f : 1.0f);
            ry8Var.setAlpha((i == 1 && this.P1 == 1) ? 1.0f : 0.0f);
            s71Var.setAlpha((i != 1 || (this.P1 != 1 && ((f4bVar2 = this.L1) == null || TextUtils.isEmpty(f4bVar2.y)))) ? 0.0f : 1.0f);
            boolean z3 = true;
            op3Var.setAlpha(i == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.j1;
            if (imageView2 != null) {
                imageView2.setAlpha((i == 1 && (f4bVar = this.L1) != null && f4bVar.u) ? 1.0f : 0.0f);
                z3 = true;
            }
            kobVar2.setAlpha(i == z3 ? 1.0f : 0.0f);
            kobVar.setAlpha(i == 2 ? 1.0f : 0.0f);
            jiaVar2.setAlpha((i == z3 || i == 2) ? 1.0f : 0.0f);
            u41Var2.setAlpha(i == 2 ? 1.0f : 0.0f);
            L(b, i);
            return;
        }
        this.j2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        y6b y6bVar3 = this.C0;
        if (y6bVar3 != null) {
            u41Var = u41Var2;
            jiaVar = jiaVar2;
            i2 = 1;
            arrayList.add(ObjectAnimator.ofFloat(y6bVar3, (Property<y6b, Float>) View.ALPHA, i == 0 ? 1.0f : 0.0f));
        } else {
            u41Var = u41Var2;
            jiaVar = jiaVar2;
            i2 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i2];
        fArr[0] = ((i != i2 || h7bVar.i()) && i != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(i7bVar, (Property<i7b, Float>) property, fArr));
        float[] fArr2 = new float[i2];
        fArr2[0] = (i == 0 || (i == i2 && h7bVar.i())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(h7bVar, (Property<h7b, Float>) property, fArr2));
        float[] fArr3 = new float[i2];
        fArr3[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(f29Var, (Property<f29, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i2];
        fArr4[0] = i == 0 ? 0.0f : gl.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(f29Var, (Property<f29, Float>) property2, fArr4));
        float[] fArr5 = new float[i2];
        fArr5[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(lq9Var, (Property<lq9, Float>) property, fArr5));
        float[] fArr6 = new float[i2];
        fArr6[0] = (i != 0 || G()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(q6bVar, (Property<q6b, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(q6bVar, (Property<q6b, Float>) property2, (i != 0 || G()) ? gl.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ge5Var2, (Property<ge5, Float>) property, (i == 0 && this.b2 && !G()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ge5Var, (Property<ge5, Float>) property, (i == 0 && !this.b2 && G()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) property, ((i == 1 && ((f4bVar6 = this.L1) == null || f4bVar6.J0 == 0)) || i == 2) ? 1.0f : 0.0f));
        if (i == 1 && ((f4bVar5 = this.L1) == null || f4bVar5.J0 == 0)) {
            c = 2;
        } else {
            c = 2;
            if (i != 2) {
                L = gl.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(j7bVar, (Property<j7b, Float>) property, i != c ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property, (i != 1 || i == c) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u41Var, (Property<u41, Float>) property, i != c ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kobVar2, (Property<kob, Float>) property, i != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kobVar, (Property<kob, Float>) property, i != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property, (i == 1 || this.P1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property, (i == 1 || (this.P1 != 1 && ((f4bVar4 = this.L1) == null || TextUtils.isEmpty(f4bVar4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property, i != 1 ? 1.0f : 0.0f));
                imageView = this.j1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i == 1 && (f4bVar3 = this.L1) != null && f4bVar3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<azc, Float>) property, 0.0f));
                this.j2.playTogether(arrayList);
                this.j2.addListener(new u6b(this, b, i));
                this.j2.setDuration(460L);
                this.j2.setInterpolator(s33.h);
                this.j2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(j7bVar, (Property<j7b, Float>) property, i != c ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property, (i != 1 || i == c) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u41Var, (Property<u41, Float>) property, i != c ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(kobVar2, (Property<kob, Float>) property, i != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(kobVar, (Property<kob, Float>) property, i != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property, (i == 1 || this.P1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property, (i == 1 || (this.P1 != 1 && ((f4bVar4 = this.L1) == null || TextUtils.isEmpty(f4bVar4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property, i != 1 ? 1.0f : 0.0f));
        imageView = this.j1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<azc, Float>) property, 0.0f));
        this.j2.playTogether(arrayList);
        this.j2.addListener(new u6b(this, b, i));
        this.j2.setDuration(460L);
        this.j2.setInterpolator(s33.h);
        this.j2.start();
    }

    public final void J(Runnable runnable, long j) {
        if (this.T1 || this.L1 == null) {
            return;
        }
        a5b a5bVar = this.h2;
        if (a5bVar != null) {
            gl.r(a5bVar);
        }
        this.i2 = true;
        this.T1 = true;
        this.h2 = new a5b((Object) this, (Object) runnable, (byte) 2);
        i7b i7bVar = this.Y0;
        i7bVar.setAlpha(0.0f);
        i7bVar.setVisibility(0);
        i7bVar.n(this.L1, this.h2, j);
        i7bVar.q(this.L1, false);
        gl.e3(this.h2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f0, code lost:
    
        if (r0.k == false) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K() {
        f4b f4bVar;
        f4b f4bVar2;
        f4b f4bVar3;
        x6b x6bVar;
        f4b f4bVar4;
        x6b x6bVar2;
        x6b x6bVar3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            j7b j7bVar = this.d1;
            if (j7bVar != null && j7bVar.O1) {
                j7bVar.N1 = false;
                j7bVar.z(false, false);
                return false;
            }
            if (this.R1) {
                f29 f29Var = this.P0;
                if (f29Var.s0) {
                    f29Var.s0 = false;
                    f29Var.w0 = SystemClock.elapsedRealtime();
                    f29Var.v0 = true;
                    ((t6b) f29Var.a).e(false);
                    f29Var.K.c(false);
                    f29Var.L.c(false);
                    f29Var.M.c(false);
                    f29Var.invalidate();
                    return false;
                }
            } else if (!this.Q1 && !j7bVar.p()) {
                p6b p6bVar = this.e1;
                if (p6bVar.N) {
                    p6bVar.c(false, true);
                    return false;
                }
                vr4 vr4Var = this.N0;
                if (vr4Var != null) {
                    r7 r7Var = vr4Var.H;
                    if (r7Var == null || !r7Var.w()) {
                        c(false);
                        this.n2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = r7Var.getSearchField();
                    if (vr4Var.w.c()) {
                        gl.t1(searchField);
                        return false;
                    }
                    vr4Var.y.B(r7Var.T(true));
                    return false;
                }
                if (this.h0 != 0 || (x6bVar3 = this.w1) == null || !x6bVar3.x0()) {
                    if (this.h0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    byte b = this.g0;
                    h7b h7bVar = this.B0;
                    if (b == 0) {
                        ArrayList arrayList = h7bVar.h;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((pk2) obj).n != null) {
                                h7bVar.b();
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.g0 == 1 && (((f4bVar2 = this.L1) == null || (!f4bVar2.n && !f4bVar2.u)) && !this.v0)) {
                        if (f4bVar2 != null && f4bVar2.g && ((x6bVar2 = this.w1) == null || !x6bVar2.r0())) {
                            f4b f4bVar5 = this.L1;
                            if (!f4bVar5.j) {
                            }
                        }
                        x6b x6bVar4 = this.w1;
                        if (x6bVar4 == null || !x6bVar4.x0()) {
                            if (this.w0 == 0 && (((this.M1 && !h7bVar.i() && (((x6bVar = this.w1) == null || !x6bVar.r0()) && ((f4bVar4 = this.L1) == null || f4bVar4.Z0 == null))) || !this.c1.h) && (((f4bVar3 = this.L1) == null || !f4bVar3.g || (!f4bVar3.n && !f4bVar3.u)) && !this.v0 && (f4bVar3 == null || !f4bVar3.o)))) {
                                I(0, true);
                                return false;
                            }
                            if (this.w0 != 0) {
                                o(true);
                                return false;
                            }
                            f53 f53Var = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f53Var, this.b);
                            String M0 = k96.M0(2131751393, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131747085, null);
                            f4b f4bVar6 = this.L1;
                            if (f4bVar6 != null && !f4bVar6.g && !f4bVar6.o) {
                                alertDialog$Builder.h(k96.M0(f4bVar6.c ? 2131744413 : 2131744245, null), new k6b(this, (byte) 7));
                            }
                            f4b f4bVar7 = this.L1;
                            alertDialog$Builder.j(k96.M0((f4bVar7 == null || !f4bVar7.c || f4bVar7.g) ? 2131751394 : 2131744446, null), new k6b(this, (byte) 8));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            hdVar.show();
                            View c = hdVar.c(-1);
                            if (c instanceof TextView) {
                                int i2 = bkb.p7;
                                zkb.X((TextView) c, i2, f53Var);
                                ff0 Y = bkb.Y(bm2.o(bkb.v0(i2, f53Var), 51), 6, 6);
                                vkb g = zkb.g(i2, 51);
                                c.setBackground(Y);
                                zkb.j(c, Y, null, g, f53Var);
                            }
                        }
                    }
                    if (this.g0 != 2 || (f4bVar = this.L1) == null || f4bVar.b0) {
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
        f29 f29Var = this.P0;
        if (i == 0) {
            t(false);
            f29Var.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            e(false, false);
            c0(false);
        }
        j7b j7bVar = this.d1;
        oc6 oc6Var = this.m0;
        if (i == 2) {
            this.u1.setVisibility(8);
            oc6Var.setVisibility(i2 == 1 ? 0 : 8);
            j7bVar.setVisibility(8);
            this.v1.setVisibility(8);
        }
        kcc kccVar = this.b1;
        i7b i7bVar = this.Y0;
        if (i == 1) {
            this.c1.setVisibility(8);
            oc6Var.setVisibility(i2 == 2 ? 0 : 8);
            this.h1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setVisibility(8);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            i7bVar.setVisibility(i2 == 2 ? 0 : 8);
            this.a1.setVisibility(8);
            if (i2 != 2) {
                x();
                w();
            }
            this.q0.setVisibility(i2 == 2 ? 0 : 8);
            u();
            k1c k1cVar = this.q1;
            k1cVar.setAlpha(0.0f);
            k1cVar.setVisibility(8);
            kccVar.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        k58 k58Var = this.D1;
        if (i2 == 1) {
            f4b f4bVar = this.L1;
            if (f4bVar == null || !f4bVar.n) {
                s();
                F();
            }
            if (k58Var != null) {
                k58Var.setAllowTouch(false);
            }
            i7bVar.x(2, false);
            i7bVar.x(3, false);
            i7bVar.x(4, false);
            i7bVar.x(5, false);
            i7bVar.x(7, false);
            f4b f4bVar2 = this.L1;
            j = 0;
            kccVar.setVisibility((f4bVar2 == null || f4bVar2.h0 < 30000) ? 8 : 0);
            oc6Var.setAlpha(1.0f);
            oc6Var.setTranslationY(0.0f);
            f4b f4bVar3 = this.L1;
            j7bVar.setVisibility((f4bVar3 == null || f4bVar3.J0 == 0) ? 0 : 8);
        } else {
            j = 0;
        }
        if (i2 == 0 && this.W1) {
            B().setVisibility(0);
            eq3 B = B();
            B.r.e(true, 0.0f);
            B.a(true);
            li3 li3Var = B.h;
            if (li3Var != null) {
                gl.r(li3Var);
            }
            li3 li3Var2 = new li3(B, (byte) 11);
            B.h = li3Var2;
            gl.e3(li3Var2, 3500L);
            f29Var.h();
        }
        this.W1 = false;
        if (k58Var != null) {
            k58Var.setAllowTouch(i2 == 1 && ((i3 = this.h0) == -1 || i3 == 1));
        }
        if (j7bVar != null) {
            j7bVar.e0 = i2 != 1;
        }
        if (i2 == 1) {
            int i4 = this.c;
            hq6.d0(i4).D(0);
            hq6.d0(i4).X0(false, true, false, 0);
            hq6.d0(i4).X0(false, true, false, 2);
            g2b M1 = na7.q1(i4).M1();
            if (M1.Q == j) {
                M1.R();
            }
            na7.q1(i4).M1().T();
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
        h7b h7bVar;
        ?? r8;
        int i3;
        CharSequence charSequence;
        SpannableStringBuilder append;
        String str;
        f4b f4bVar;
        boolean z;
        String str2;
        cs5 cs5Var;
        boolean z2;
        f4b f4bVar2;
        boolean z3;
        CharSequence charSequence2;
        boolean z4;
        f4b f4bVar3;
        boolean z5;
        wx n;
        f4b f4bVar4;
        kac textureView;
        f4b f4bVar5;
        h7b h7bVar2 = this.B0;
        if (i2 == 0) {
            Z(false);
            f29 f29Var = this.P0;
            f29Var.setVisibility(0);
            if (f29Var != null) {
                f29Var.g(false);
            }
            this.R0.setVisibility(0);
            azc azcVar = this.W0;
            azcVar.setVisibility(0);
            azcVar.setAlpha(0.0f);
            this.K0.a(0L, true);
            f4b f4bVar6 = this.L1;
            if (f4bVar6 != null) {
                f4bVar6.i(false);
                this.L1 = null;
            }
            if (h7bVar2 != null) {
                h7bVar2.b();
                f29Var.e(false, 0.0f);
            }
        }
        if (i == 0) {
            d0(null);
            a0(new d6b(this, (byte) 18));
            eq3 eq3Var = this.O0;
            if (eq3Var != null) {
                eq3Var.setVisibility(8);
            }
            this.X0.f(true);
            je5 je5Var = this.m1;
            if (je5Var != null) {
                je5Var.f(true);
            }
        }
        kob kobVar = this.a1;
        oc6 oc6Var = this.m0;
        ry8 ry8Var = this.h1;
        vi8 vi8Var = this.c1;
        i7b i7bVar = this.Y0;
        j7b j7bVar = this.d1;
        jia jiaVar = this.q0;
        int i4 = this.c;
        if (i2 == 1 || i == 1) {
            f4b f4bVar7 = i2 == 1 ? this.L1 : null;
            op3 op3Var = this.f1;
            op3Var.setEntry(f4bVar7);
            int i5 = this.P1;
            h7bVar = h7bVar2;
            s71 s71Var = this.k1;
            if (i5 == 1) {
                ry8Var.setVisibility(0);
                f4b f4bVar8 = this.L1;
                e0(f4bVar8 != null && f4bVar8.Y, false);
                s71Var.setVisibility(0);
                i7bVar.x(-9982, false);
                ((xb8) s71Var.c).a(i7bVar.j(), false);
                jiaVar.setRightPadding(gl.L(144.0f));
                r8 = 0;
            } else {
                f4b f4bVar9 = this.L1;
                if (f4bVar9 == null || TextUtils.isEmpty(f4bVar9.y)) {
                    r8 = 0;
                    jiaVar.setRightPadding(gl.L(48.0f));
                } else {
                    ry8Var.setVisibility(8);
                    r8 = 0;
                    s71Var.setVisibility(0);
                    ((xb8) s71Var.c).a(true, false);
                    jiaVar.setRightPadding(gl.L(48.0f));
                }
            }
            op3Var.setVisibility(r8);
            f4b f4bVar10 = this.L1;
            if (f4bVar10 == null || !f4bVar10.u) {
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                E().setVisibility(r8);
                n0(r8);
            }
            vi8Var.setVisibility(r8);
            i7bVar.setVisibility(r8);
            f4b f4bVar11 = this.L1;
            j7bVar.setVisibility(((f4bVar11 == null || f4bVar11.J0 == 0) && this.w0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Z0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            f4b f4bVar12 = this.L1;
            layoutParams.bottomMargin = gl.L(((f4bVar12 == null || f4bVar12.J0 == 0) && this.w0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            oc6Var.setVisibility(0);
            oc6Var.clearFocus();
            f4b f4bVar13 = this.L1;
            j7bVar.A(f4bVar13 == null ? 86400 : f4bVar13.I0, false);
            j7bVar.setPeriodVisible(!na7.q1(i4).E3() && ((f4bVar = this.L1) == null || !f4bVar.g));
            f4b f4bVar14 = this.L1;
            j7bVar.setHasRoundVideo((f4bVar14 == null || f4bVar14.o0 == null) ? false : true);
            if (j7bVar == null) {
                i3 = i4;
                charSequence = "";
            } else {
                f4b f4bVar15 = this.L1;
                if (f4bVar15 == null || !f4bVar15.n) {
                    i3 = i4;
                    charSequence = "";
                    j7bVar.v(null, null);
                } else {
                    TLRPC.Peer peer = f4bVar15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        charSequence = "";
                        String q = l7c.q(na7.q1(i4).V1(Long.valueOf(peer.user_id)));
                        f4b f4bVar16 = this.L1;
                        append = new SpannableStringBuilder(k27.g6()).append((CharSequence) " ").append((CharSequence) q);
                        f4bVar16.p = append;
                    } else {
                        charSequence = "";
                        TLRPC.Chat K0 = na7.q1(i4).K0(Long.valueOf(-cf3.n(peer)));
                        CharSequence charSequence3 = K0 == null ? charSequence : K0.title;
                        f4b f4bVar17 = this.L1;
                        append = new SpannableStringBuilder(k27.g6()).append((CharSequence) " ").append(charSequence3);
                        f4bVar17.p = append;
                    }
                    String str3 = this.L1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(k96.M0(2131744498, null));
                        i3 = i4;
                        spannableString.setSpan(new i17((byte) 4), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i3 = i4;
                        str = str3;
                    }
                    j7bVar.v(append, str);
                }
            }
            f4b f4bVar18 = this.L1;
            boolean z6 = (f4bVar18 != null && f4bVar18.v() && this.L1.t()) ? false : true;
            boolean z7 = kobVar.k0;
            kobVar.k0 = z6;
            kobVar.j0.f(z6, true);
            kobVar.invalidate();
        } else {
            h7bVar = h7bVar2;
            i3 = i4;
            charSequence = "";
        }
        u41 u41Var = this.v1;
        kob kobVar2 = this.u1;
        int i6 = 2;
        if (i2 == 2 || i == 2) {
            z = false;
            jiaVar.setVisibility(0);
            kobVar2.setVisibility(0);
            f4b f4bVar19 = this.L1;
            if (f4bVar19 == null || !f4bVar19.b0) {
                str2 = null;
            } else {
                str2 = null;
                jiaVar.l(k96.M0(2131746162, null), false);
            }
            oc6Var.setVisibility(0);
            u41Var.setVisibility(0);
            i6 = 2;
        } else {
            z = false;
            str2 = null;
        }
        if (i2 == i6) {
            jiaVar.l(k96.M0(2131746162, str2), z);
        }
        p6b p6bVar = this.e1;
        if (i2 == 1) {
            this.O1 = z;
            f4b f4bVar20 = this.L1;
            boolean z8 = (f4bVar20 == null || f4bVar20.J0 == 0) ? false : true;
            boolean z9 = f4bVar20 != null && f4bVar20.g;
            String M0 = k96.M0(z9 ? 2131751342 : z8 ? 2131743565 : 2131748058, null);
            boolean z10 = !z8;
            boolean z11 = z9;
            if (TextUtils.equals(M0, vi8Var.d) && z10 == vi8Var.e) {
                z3 = z8;
            } else {
                vi8Var.removeView(vi8Var.c);
                z3 = z8;
                Context context = vi8Var.getContext();
                vi8Var.d = M0;
                vi8Var.e = z10;
                ui8 ui8Var = new ui8(vi8Var, context, M0, z10);
                vi8Var.c = ui8Var;
                ui8Var.setContentDescription(M0);
                vi8Var.addView(vi8Var.c, nme.c(-2.0f, -2));
                vi8Var.e();
            }
            kobVar2.setVisibility(8);
            u41Var.setVisibility(8);
            if (!this.i2) {
                f4b f4bVar21 = this.L1;
                if (f4bVar21 == null || !f4bVar21.u) {
                    i7bVar.set(f4bVar21);
                } else {
                    i7bVar.l(f4bVar21);
                }
            }
            this.i2 = false;
            j7bVar.f.getEditText().setOnPremiumMenuLockClickListener(na7.q1(i3).c5() ? null : new d6b(this, (byte) 19));
            p6bVar.setVisibility(this.I1 == null ? 8 : 0);
            ArrayList arrayList = this.I1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.K1;
                ArrayList arrayList3 = this.J1;
                p6bVar.c(false, false);
                p6bVar.c = arrayList;
                p6bVar.d = arrayList2;
                p6bVar.e = arrayList3;
                p6bVar.x = new tgb(Integer.toString(arrayList.size()), 20.0f, gl.n1("fonts/num.otf"));
                p6bVar.L = new tgb(k96.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                p6bVar.b.g3.O(false);
                p6bVar.setSelected(this.I1.indexOf(this.L1));
            }
            kobVar.setMaxCount((z3 || z11 || this.I1 != null || ((f4bVar5 = this.L1) != null && (f4bVar5.v() || !this.L1.K))) ? 1 : 3);
            if (i != 2) {
                f4b f4bVar22 = this.L1;
                if (f4bVar22 == null || !(f4bVar22.c || f4bVar22.g || this.v0)) {
                    j7bVar.W = true;
                    charSequence2 = charSequence;
                    j7bVar.f.setText(charSequence2);
                    f4b f4bVar23 = this.L1;
                    vi8Var.d(4, f4bVar23 != null || ((!f4bVar23.u || f4bVar23.K) && !f4bVar23.v()));
                    boolean z12 = w01.a;
                    vi8Var.d(3, false);
                    if (!this.O1 && !j7bVar.o()) {
                        g2b M1 = na7.q1(i3).M1();
                        int z13 = z();
                        n = M1.n();
                        if (n != null || !n.a(M1.a, z13) || ((f4bVar4 = this.L1) != null && (f4bVar4.g || f4bVar4.J0 != 0))) {
                            z4 = true;
                            vi8Var.setShareEnabled(z4);
                            f4b f4bVar24 = this.L1;
                            ry8Var.setImageResource((f4bVar24 == null && f4bVar24.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                            i7bVar.setVisibility(0);
                            kobVar.setVisibility(0);
                            jiaVar.setVisibility(0);
                            jiaVar.setTranslationX(0.0f);
                            f4bVar3 = this.L1;
                            if (f4bVar3 == null) {
                                if (f4bVar3.J0 != 0) {
                                    jiaVar.l(charSequence2, false);
                                } else if (f4bVar3.g) {
                                    cs5Var = null;
                                    jiaVar.l(k96.M0(2131746161, null), false);
                                    z2 = true;
                                } else if (f4bVar3.u) {
                                    jiaVar.l(k96.M0(2131746159, null), false);
                                } else if (f4bVar3.n) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    int i7 = i3;
                                    ec0 ec0Var = new ec0(32.0f, i7, jiaVar);
                                    jiaVar.setTranslationX(-gl.L(6.0f));
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(ec0Var, 0, 1, 33);
                                    if (this.L1.q instanceof TLRPC.TL_peerUser) {
                                        TLRPC.User V1 = na7.q1(i7).V1(Long.valueOf(this.L1.q.user_id));
                                        ec0Var.e(V1);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append((CharSequence) l7c.q(V1));
                                    } else {
                                        TLRPC.Chat K02 = na7.q1(i7).K0(Long.valueOf(-cf3.n(this.L1.q)));
                                        ec0Var.b(K02);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append(K02 != null ? K02.title : charSequence2);
                                    }
                                    jiaVar.l(spannableStringBuilder, false);
                                } else {
                                    z5 = false;
                                }
                                z2 = true;
                                cs5Var = null;
                            } else {
                                z5 = false;
                            }
                            cs5Var = null;
                            jiaVar.l(k96.M0(2131746160, null), z5);
                            z2 = true;
                        }
                    }
                    z4 = false;
                    vi8Var.setShareEnabled(z4);
                    f4b f4bVar242 = this.L1;
                    ry8Var.setImageResource((f4bVar242 == null && f4bVar242.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    i7bVar.setVisibility(0);
                    kobVar.setVisibility(0);
                    jiaVar.setVisibility(0);
                    jiaVar.setTranslationX(0.0f);
                    f4bVar3 = this.L1;
                    if (f4bVar3 == null) {
                    }
                    cs5Var = null;
                    jiaVar.l(k96.M0(2131746160, null), z5);
                    z2 = true;
                } else {
                    if (f4bVar22.P0 != null) {
                        x();
                        s();
                        F();
                    }
                    f4b f4bVar25 = this.L1;
                    if (f4bVar25.K && f4bVar25.a1 != null && (textureView = i7bVar.getTextureView()) != null) {
                        textureView.setDelegate(new k6b(this, (byte) 6));
                    }
                    j7bVar.setText(this.L1.C0);
                }
            }
            charSequence2 = charSequence;
            f4b f4bVar232 = this.L1;
            vi8Var.d(4, f4bVar232 != null || ((!f4bVar232.u || f4bVar232.K) && !f4bVar232.v()));
            boolean z122 = w01.a;
            vi8Var.d(3, false);
            if (!this.O1) {
                g2b M12 = na7.q1(i3).M1();
                int z132 = z();
                n = M12.n();
                if (n != null) {
                }
                z4 = true;
                vi8Var.setShareEnabled(z4);
                f4b f4bVar2422 = this.L1;
                ry8Var.setImageResource((f4bVar2422 == null && f4bVar2422.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                i7bVar.setVisibility(0);
                kobVar.setVisibility(0);
                jiaVar.setVisibility(0);
                jiaVar.setTranslationX(0.0f);
                f4bVar3 = this.L1;
                if (f4bVar3 == null) {
                }
                cs5Var = null;
                jiaVar.l(k96.M0(2131746160, null), z5);
                z2 = true;
            }
            z4 = false;
            vi8Var.setShareEnabled(z4);
            f4b f4bVar24222 = this.L1;
            ry8Var.setImageResource((f4bVar24222 == null && f4bVar24222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            i7bVar.setVisibility(0);
            kobVar.setVisibility(0);
            jiaVar.setVisibility(0);
            jiaVar.setTranslationX(0.0f);
            f4bVar3 = this.L1;
            if (f4bVar3 == null) {
            }
            cs5Var = null;
            jiaVar.l(k96.M0(2131746160, null), z5);
            z2 = true;
        } else {
            cs5Var = null;
            z2 = true;
        }
        if (i == z2) {
            cs5 cs5Var2 = j7bVar.V0;
            if (cs5Var2 != null) {
                cs5Var2.u();
                j7bVar.V0 = cs5Var;
            }
            this.l1.f(z2);
            if (p6bVar.N) {
                p6bVar.c(false, z2);
            }
        }
        if (i2 == 2 && (f4bVar2 = this.L1) != null) {
            long j = f4bVar2.e0;
            if (j < 0) {
                f4bVar2.e0 = 0L;
                j = 0;
            }
            this.N1 = j;
            long duration = i7bVar.getDuration() < 100 ? this.L1.h0 : i7bVar.getDuration();
            f4b f4bVar26 = this.L1;
            if (f4bVar26.h0 <= 0) {
                f4bVar26.h0 = duration;
            }
            File file = f4bVar26.Z0;
            if (file == null) {
                file = f4bVar26.L;
            }
            String absolutePath = file.getAbsolutePath();
            f4b f4bVar27 = this.L1;
            this.u1.o(false, absolutePath, f4bVar27.h0, f4bVar27.P);
            f4b f4bVar28 = this.L1;
            float f = duration;
            long j2 = (long) (f4bVar28.Z * f);
            long j3 = (long) (f4bVar28.a0 * f);
            kobVar2.a1 = j2;
            kobVar2.b1 = j3;
            fob fobVar = kobVar2.h;
            byte b = 1;
            if (fobVar != null) {
                fobVar.a(true);
            }
            n4b n4bVar = new n4b(this, b);
            kobVar2.setDelegate(new v39(n4bVar, (byte) 14));
            float max = (this.N1 / Math.max(1L, duration)) * 0.96f;
            kobVar2.setVideoLeft(max);
            kobVar2.setVideoRight(0.04f + max);
            n4bVar.a(Boolean.TRUE, Float.valueOf(max));
        }
        k58 k58Var = this.D1;
        if (k58Var != null) {
            k58Var.setAllowTouch(false);
        }
        je5 je5Var2 = this.n1;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
        m21.e();
        if (j7bVar != null) {
            cb1 cb1Var = j7bVar.f;
            cb1Var.d();
            cb1Var.k(true);
            j7bVar.e0 = true;
        }
        if (i7bVar != 0) {
            i7bVar.x(8, i2 != 1);
        }
        x6b x6bVar = this.w1;
        if (x6bVar != null) {
            x6bVar.setCoverPreview(i2 != 1);
        }
        je5 je5Var3 = this.o1;
        if (je5Var3 != null) {
            je5Var3.f(true);
        }
        h7bVar.setPreview(i2 == 1 && h7bVar.i());
    }

    public final void N() {
        this.d = true;
        this.w = false;
        if (this.K) {
            g7b g7bVar = this.i0;
            g7bVar.setAlpha(1.0f);
            g7bVar.setTranslationX(0.0f);
            g7bVar.setTranslationY(0.0f);
            this.j0.setAlpha(1.0f);
            this.l0.setAlpha(1.0f);
            this.n.setBackgroundColor(-16777216);
            if (this.g0 == 2) {
                this.v1.setAlpha(1.0f);
            }
        }
        d6b d6bVar = this.y2;
        if (d6bVar != null) {
            d6bVar.run();
            this.y2 = null;
        } else {
            O();
        }
        f4b f4bVar = this.L1;
        if (f4bVar != null) {
            if (f4bVar.n) {
                s();
                F();
                q();
            } else if (f4bVar.u) {
                if (f4bVar.K) {
                    this.Y0.t(f4bVar, null, 0L);
                }
                q();
            }
        }
    }

    public final void O() {
        a79 a79Var;
        boolean z = false;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.y2 = new d6b(this, (byte) 3);
            }
        }
        j7b j7bVar = this.d1;
        if (j7bVar != null) {
            j7bVar.f.s();
        }
        f29 f29Var = this.P0;
        if (f29Var != null) {
            f29Var.h();
        }
        byte b = 1;
        wi8 wi8Var = this.p1;
        if (wi8Var != null) {
            g2b M1 = na7.q1(wi8Var.a).M1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) M1.i.f(y6c.h(M1.a).n);
            wi8Var.b = M1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            wi8Var.c.invalidate();
        }
        x6b x6bVar = this.w1;
        if (x6bVar != null && (a79Var = x6bVar.E0.d) != null) {
            a79Var.postRunnable(a79Var.x);
        }
        i7b i7bVar = this.Y0;
        if (i7bVar != null) {
            i7bVar.x(0, false);
        }
        jq3 jq3Var = na7.q1(this.c).M1().w;
        if (jq3Var.c || jq3Var.d) {
            return;
        }
        jq3Var.d = true;
        fq3 fq3Var = new fq3(jq3Var, b);
        ad7 Y = ad7.Y(jq3Var.a);
        Y.a.c(new mn6((Object) Y, z, (Object) fq3Var, (byte) 18));
    }

    public final void P(int i, int i2) {
        x6b x6bVar;
        e7b e7bVar;
        f7b f7bVar;
        x6b x6bVar2;
        if (i2 == 0) {
            this.o0.setVisibility(8);
        }
        if (i == 0 && (x6bVar2 = this.w1) != null) {
            x6bVar2.setVisibility(8);
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
        if ((i2 == 0 || i == 0) && (x6bVar = this.w1) != null) {
            x6bVar.T0.setLayerType(0, null);
        }
        k58 k58Var = this.D1;
        if (k58Var != null) {
            if (i2 != 1 && i2 != -1) {
                z = false;
            }
            k58Var.setAllowTouch(z);
        }
        if (i2 == 3) {
            e7b e7bVar2 = this.s1;
            if (e7bVar2 != null) {
                e7bVar2.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (e7bVar = this.s1) != null) {
            e7bVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            e7b e7bVar3 = this.s1;
            e7bVar3.y = null;
            q23 q23Var = e7bVar3.f;
            q23Var.M = null;
            q23Var.d = null;
            q23Var.K = false;
            e7bVar3.d.setVisibility(8);
            e7bVar3.a.setCropEditorDrawing(null);
        }
        if (i2 == 4) {
            f7b f7bVar2 = this.t1;
            if (f7bVar2 != null) {
                f7bVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i != 4 || (f7bVar = this.t1) == null) {
            return;
        }
        f7bVar.setVisibility(8);
        this.t1.setAppearProgress(0.0f);
        f7b f7bVar3 = this.t1;
        f7bVar3.b = null;
        q23 q23Var2 = f7bVar3.h;
        q23Var2.M = null;
        q23Var2.d = null;
        q23Var2.K = false;
        f7bVar3.e.setVisibility(8);
        f7bVar3.setVisibility(8);
    }

    public final void Q(n7b n7bVar) {
        wx n;
        s7b s7bVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (na7.q1(i).t2()) {
            h5.b(i);
            return;
        }
        int i2 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (s7bVar = this.n) != null && s7bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gl.t3(windowManager, s7bVar, layoutParams);
            windowManager.addView(s7bVar, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(y());
        if (this.w0 == 0 && (n = na7.q1(i).M1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        I(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (n7bVar != null) {
            this.G = n7bVar;
            this.K = n7bVar.a;
            rectF.set(n7bVar.c);
            this.H = n7bVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = gl.L(100.0f);
            Point point = gl.q;
            rectF.set(0.0f, L, point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
        }
        l7b l7bVar = this.r;
        l7bVar.c();
        boolean z = this.K;
        if (!z && z) {
            i2 = -14737633;
        }
        this.i0.setBackgroundColor(i2);
        l7bVar.setTranslationX(0.0f);
        l7bVar.setTranslationY(0.0f);
        l7bVar.b(0.0f);
        l7bVar.setScaleX(1.0f);
        l7bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gl.e2(this.b);
        d(1.0f, true, new d6b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(m7b m7bVar, f4b f4bVar, long j) {
        View view;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (na7.q1(i).t2()) {
            h5.b(i);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (view = this.n) != null && view.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gl.t3(windowManager, view, layoutParams);
            windowManager.addView(view, layoutParams);
            f0();
        }
        this.L1 = f4bVar;
        this.P1 = f4bVar.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (m7bVar != null) {
            this.G = m7bVar;
            this.K = m7bVar.a;
            rectF.set(m7bVar.c);
            this.H = m7bVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = gl.L(100.0f);
            Point point = gl.q;
            rectF.set(0.0f, L, point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
        }
        l7b l7bVar = this.r;
        l7bVar.c();
        boolean z = this.K;
        this.i0.setBackgroundColor((z || !z) ? 0 : -14737633);
        l7bVar.setTranslationX(0.0f);
        l7bVar.setTranslationY(0.0f);
        l7bVar.b(0.0f);
        l7bVar.setScaleX(1.0f);
        l7bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gl.e2(this.b);
        f4b f4bVar2 = this.L1;
        if (f4bVar2 != null) {
            this.d1.setText(f4bVar2.C0);
        }
        J(new o6b(this, r2), j);
        I(this.L1.b0 ? (byte) 2 : (byte) 1, false);
        k0(-1, false, false);
        this.c1.b(false, false);
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void S() {
        cs5 cs5Var;
        byte b = 1;
        i7b i7bVar = this.Y0;
        if (i7bVar != null) {
            i7bVar.x(4, true);
        }
        j7b j7bVar = this.d1;
        if (j7bVar != null && (cs5Var = j7bVar.V0) != null) {
            cs5Var.u();
            j7bVar.V0 = null;
        }
        jh8 jh8Var = new jh8((d) new z6b(this, (byte) 1), 14, false);
        jh8Var.setOnDismissListener(new n6b(this, b));
        jh8Var.show();
    }

    public final void T(m7b m7bVar, f4b f4bVar) {
        wx n;
        s7b s7bVar;
        if (this.d) {
            return;
        }
        int i = this.c;
        if (na7.q1(i).t2()) {
            h5.b(i);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (s7bVar = this.n) != null && s7bVar.getParent() == null) {
            WindowManager.LayoutParams layoutParams = this.h;
            gl.t3(windowManager, s7bVar, layoutParams);
            windowManager.addView(s7bVar, layoutParams);
            f0();
        }
        this.L1 = f4bVar;
        a6b.a(i, f4bVar);
        f4b f4bVar2 = this.L1;
        int i2 = (f4bVar2 == null || !f4bVar2.K) ? 0 : 1;
        this.P1 = i2;
        this.t0.g = f4bVar2 != null && f4bVar2.u && i2 == 1;
        if (this.w0 == 0 && (n = na7.q1(i).M1().n()) != null && n.a(i, 1)) {
            g0(n, true);
        }
        RectF rectF = this.I;
        if (m7bVar != null) {
            this.G = m7bVar;
            this.K = m7bVar.a;
            rectF.set(m7bVar.c);
            this.H = m7bVar.b;
            this.G.e();
        } else {
            this.K = false;
            float L = gl.L(100.0f);
            Point point = gl.q;
            rectF.set(0.0f, L, point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
        }
        l7b l7bVar = this.r;
        l7bVar.c();
        boolean z = this.K;
        this.i0.setBackgroundColor((z || !z) ? 0 : -14737633);
        l7bVar.setTranslationX(0.0f);
        l7bVar.setTranslationY(0.0f);
        l7bVar.b(0.0f);
        l7bVar.setScaleX(1.0f);
        l7bVar.setScaleY(1.0f);
        this.L = 0.0f;
        gl.e2(this.b);
        f4b f4bVar3 = this.L1;
        if (f4bVar3 != null) {
            this.d1.setText(f4bVar3.C0);
        }
        this.c1.b(true, false);
        I(1, false);
        k0(-1, false, false);
        d(1.0f, true, new d6b(this, (byte) 6));
        a();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        c79 c79Var = this.x1;
        if (c79Var != null) {
            c79Var.bringToFront();
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
        k1c k1cVar = this.q1;
        if (k1cVar != null) {
            k1cVar.bringToFront();
        }
        k58 k58Var = this.D1;
        if (k58Var != null) {
            k58Var.bringToFront();
        }
        c58 c58Var = this.F1;
        if (c58Var != null) {
            c58Var.bringToFront();
        }
        e58 e58Var = this.G1;
        if (e58Var != null) {
            e58Var.bringToFront();
        }
        wi8 wi8Var = this.p1;
        if (wi8Var != null) {
            wi8Var.bringToFront();
        }
        pb1 pb1Var = this.r1;
        if (pb1Var != null) {
            pb1Var.bringToFront();
        }
    }

    public final void V(f4b f4bVar, boolean z) {
        f4b f4bVar2;
        boolean z2;
        if (f4bVar == null || this.Y0.getWidth() <= 0 || this.Y0.getHeight() <= 0) {
            return;
        }
        File file = z ? f4bVar.O0 : f4bVar.N0;
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
        gl.m0 = true;
        view.draw(canvas);
        gl.m0 = false;
        canvas.restore();
        Paint paint = new Paint(2);
        kac textureView = this.Y0.getTextureView();
        if (f4bVar.K && !f4bVar.u && textureView != null) {
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
        File file2 = f4bVar.Q0;
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
                fa4.g(e, true);
            }
        }
        File file3 = f4bVar.P0;
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
                fa4.g(e2, true);
            }
        }
        x6b x6bVar = this.w1;
        if (x6bVar != null && x6bVar.H0 != null) {
            canvas.save();
            canvas.scale(f, f);
            x6b x6bVar2 = this.w1;
            x6bVar2.y0 = true;
            st7 st7Var = x6bVar2.H0;
            st7Var.a = true;
            st7Var.draw(canvas);
            x6b x6bVar3 = this.w1;
            x6bVar3.H0.a = false;
            x6bVar3.y0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w = f4b.w(this.c, "jpg");
        if (z) {
            f4bVar2 = f4bVar;
            z2 = z;
            Utilities.g.c(new z77((Object) this, (Object) createBitmap, z2, (Object) w, (Object) f4bVar2, (byte) 22));
        } else {
            f4bVar2 = f4bVar;
            z2 = z;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z2 ? 95 : 99, new FileOutputStream(w));
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
        if (!z2) {
            f4bVar2.N0 = w;
        }
        f4bVar2.b1 = createScaledBitmap;
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
        wx n;
        ?? r16;
        y5b y5bVar = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (y5bVar != null) {
            y5bVar.dismiss();
            this.r0 = null;
        }
        boolean z = this.O1;
        pw0 pw0Var = pw0.E;
        if (z) {
            op3 op3Var = this.f1;
            op3Var.getClass();
            op3Var.c(k96.N0("VideoConvertFail"));
            pw0Var.a();
            ui8 ui8Var = this.c1.c;
            int i = -this.V1;
            this.V1 = i;
            gl.B3(i, ui8Var, null);
            return;
        }
        j7b j7bVar = this.d1;
        if (j7bVar != null && j7bVar.o()) {
            pw0Var.a();
            hn hnVar = j7bVar.w;
            int i2 = -this.V1;
            this.V1 = i2;
            gl.B3(i2, hnVar, null);
            j7bVar.e();
            return;
        }
        f4b f4bVar = this.L1;
        int i3 = this.c;
        byte b = 0;
        if ((f4bVar == null || (!f4bVar.g && f4bVar.J0 == 0)) && (n = na7.q1(i3).e0.n()) != null && n.a(i3, z())) {
            g0(n, false);
            return;
        }
        this.L1.D0 = na7.q1(i3).c5();
        f53 f53Var = this.a;
        boolean z2 = true;
        if (j7bVar != null && !this.L1.D0) {
            CharSequence text = j7bVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((wib[]) spannable.getSpans(0, text.length(), wib.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new u21(this.n, f53Var).Q(R.raw.voip_invite, 36, gl.O2(k96.M0(2131744341, null), bkb.Wc, 0, new d6b(this, (byte) 28), f53Var)).k(true);
                    int i4 = -this.V1;
                    this.V1 = i4;
                    gl.B3(i4, j7bVar, null);
                    return;
                }
            }
        }
        f4b f4bVar2 = this.L1;
        if (f4bVar2.g || f4bVar2.J0 != 0) {
            f4bVar2.l = false;
            f(null);
            o0();
            return;
        }
        if (this.O != 0) {
            f4bVar2.v0 = na7.q1(i3).h1(this.O);
        }
        i7b i7bVar = this.Y0;
        i7bVar.x(3, true);
        y5b y5bVar2 = new y5b(this.b, this.L1.I0, f53Var);
        y5bVar2.R0(this.L1.E0);
        y5bVar2.Q0(this.L1.v0);
        y5bVar2.z1 = this.N;
        y5bVar2.O1 = new e6b(this, (byte) 15);
        y5bVar2.E0(!this.B0.i());
        ArrayList arrayList = this.J1;
        y5bVar2.N0(arrayList == null ? this.L1.r() : arrayList.size());
        y5bVar2.L0(false);
        CharSequence text2 = j7bVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (j4c j4cVar : (j4c[]) ((Spanned) text2).getSpans(0, text2.length(), j4c.class)) {
                if (j4cVar != null) {
                    try {
                        TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(Long.parseLong(j4cVar.getURL())));
                        if (V1 != null && !l7c.C(V1) && l7c.o(V1) != null && !arrayList2.contains(V1)) {
                            arrayList2.add(l7c.o(V1));
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
                        TLObject a2 = na7.q1(i3).a2(charSequence);
                        if (a2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) a2;
                            if (!user.bot && !l7c.C(user) && user.id != 777000 && !l7c.A(user) && !arrayList2.contains(charSequence)) {
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
                TLObject a22 = na7.q1(i3).a2(charSequence2);
                r16 = z4;
                if (a22 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) a22;
                    r16 = z4;
                    if (!user2.bot) {
                        r16 = z4;
                        if (!l7c.C(user2)) {
                            r16 = z4;
                            if (user2.id != 777000) {
                                r16 = z4;
                                if (!l7c.A(user2)) {
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
        y5bVar2.M1 = arrayList2;
        y5bVar2.Q1 = new e6b(this, (byte) 16);
        y5bVar2.R1 = new e6b(this, (byte) 17);
        y5bVar2.N1 = new k6b(this, (byte) 9);
        this.r0 = y5bVar2;
        f4b f4bVar3 = this.L1;
        if (f4bVar3.K) {
            if (i7bVar != null && !f4bVar3.f0 && this.g0 != 2) {
                f4bVar3.e0 = i7bVar.getCurrentPosition();
                e6b e6bVar = new e6b(this, (byte) 18);
                c79 c79Var = this.x1;
                View view = this.A1;
                View[] viewArr = new View[3];
                viewArr[0] = i7bVar;
                viewArr[r16] = c79Var;
                viewArr[2] = view;
                i7bVar.g(e6bVar, viewArr);
            }
            y5b y5bVar3 = this.r0;
            Bitmap bitmap = this.L1.g0;
            d6b d6bVar = new d6b(this, (byte) 20);
            if (bitmap != null) {
                y5bVar3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            y5bVar3.V1 = bitmapDrawable;
            y5bVar3.W1 = d6bVar;
            vq1 vq1Var = y5bVar3.l1;
            if (vq1Var != null) {
                for (View view2 : vq1Var.getViewPages()) {
                    if (view2 instanceof t5b) {
                        t5b t5bVar = (t5b) view2;
                        t5bVar.h(false);
                        t5bVar.f(false);
                    }
                }
            }
        }
        this.r0.setOnDismissListener(new n6b(this, b));
        this.r0.show();
    }

    public final void X(o7b o7bVar) {
        int i = 0;
        RectF rectF = this.I;
        if (o7bVar != null) {
            this.G = o7bVar;
            this.K = o7bVar.a;
            rectF.set(o7bVar.c);
            this.H = o7bVar.b;
        } else {
            this.G = null;
            this.K = false;
            float L = gl.L(100.0f);
            Point point = gl.q;
            rectF.set(0.0f, L, point.x, gl.L(100.0f) + point.y);
            this.H = gl.L(8.0f);
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
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, kk7.w1);
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
                    fm2 fm2Var = new fm2(new ColorDrawable(-14540254), mutate);
                    int L = gl.L(64.0f);
                    int L2 = gl.L(64.0f);
                    fm2Var.e = L;
                    fm2Var.f = L2;
                    this.B0.setCameraThumb(fm2Var);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, activity);
                        int i = bkb.K5;
                        alertDialog$Builder.l(R.raw.permission_request_camera, 72, bkb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        SpannableStringBuilder T2 = gl.T2(k96.M0(2131747115, null));
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.U = T2;
                        alertDialog$Builder.j(k96.M0(2131747107, null), new k6b(this, (byte) 12));
                        alertDialog$Builder.g(k96.M0(2131751760, null), null);
                        hdVar.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, kk7.v1);
                    this.x2 = true;
                }
            }
            if (this.t2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                p();
            } else {
                CameraController.getInstance().initCamera(new d6b(this, b));
            }
        }
    }

    public final void a() {
        kk7.e().a(this, kk7.q2);
        int i = this.c;
        kk7.f(i).a(this, kk7.A5);
        kk7.f(i).a(this, kk7.c3);
    }

    public final void a0(Runnable runnable) {
        y6b y6bVar = this.C0;
        if (y6bVar == null || y6bVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new r1b(this, this.C0.getTextureView().getBitmap(), runnable, (byte) 7));
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
        l7b l7bVar = this.r;
        float f = l7bVar.a;
        float f2 = l7bVar.b;
        l7bVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new qx1(this, f, f2, (byte) 6));
        this.k2.setDuration(340L);
        this.k2.setInterpolator(s33.h);
        this.k2.addListener(new v6b(this, (byte) 0));
        this.k2.start();
    }

    public final void b0(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setVisibility(0);
            view.animate().alpha(z ? 1.0f : 0.0f).setUpdateListener(new w6b(this, (byte) 1)).setListener(new qw((Object) this, z, (Object) view, (byte) 14)).setDuration(320L).setInterpolator(s33.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z ? 0 : 8);
            view.setAlpha(z ? 1.0f : 0.0f);
            m0();
        }
    }

    public final void c(boolean z) {
        eq3 eq3Var;
        this.L0 = z;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z) {
            vr4 vr4Var = this.N0;
            byte b = 0;
            if (vr4Var == null) {
                if (z) {
                    r(false);
                }
                vr4Var = this.N0;
                if (vr4Var == null) {
                    return;
                }
            }
            if (vr4Var.V) {
                this.r2 = new l6b(this, z, b);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            yla ylaVar = this.p2;
            if (ylaVar != null) {
                ylaVar.d();
                this.p2 = null;
            }
            vr4 vr4Var2 = this.N0;
            if (vr4Var2 == null) {
                if (z) {
                    r(false);
                }
                vr4Var2 = this.N0;
                if (vr4Var2 == null) {
                    return;
                }
            }
            vr4Var2.L = false;
            if (z && (eq3Var = this.O0) != null) {
                eq3Var.a(false);
            }
            l7b l7bVar = this.r;
            if (l7bVar != null) {
                l7bVar.setImportantForAccessibility(z ? 4 : 0);
            }
            this.N0.setImportantForAccessibility(z ? 0 : 4);
            this.q2 = Boolean.valueOf(z);
            float translationY = this.N0.getTranslationY();
            s7b s7bVar = this.n;
            float height = z ? 0.0f : (s7bVar.getHeight() - this.N0.g()) + (gl.n * 2.5f);
            s7bVar.getHeight();
            vr4 vr4Var3 = this.N0;
            vr4Var3.L = !z;
            byte b2 = 1;
            this.l2 = this.k2 == null;
            byte b3 = 2;
            if (z) {
                yla ylaVar2 = new yla(vr4Var3, yla.p, height);
                this.p2 = ylaVar2;
                ylaVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new o12(this, height, b3));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new m6b(this, b));
                this.o2.addListener(new v6b(this, b2));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(s33.h);
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
            fa4.g(e, true);
        }
    }

    public final void d(float f, boolean z, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        l7b l7bVar = this.r;
        if (!z) {
            this.M = null;
            this.J = f;
            h();
            l7bVar.invalidate();
            this.n.invalidate();
            runnable.run();
            l();
            return;
        }
        this.Q.d();
        kk7.e().k(kk7.i1, 512);
        this.M = Float.valueOf(this.L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        this.F = ofFloat;
        byte b = 5;
        ofFloat.addUpdateListener(new m6b(this, b));
        this.F.addListener(new ji4(this, f, runnable, b));
        if (f < 1.0f && this.w) {
            this.F.setDuration(250L);
            this.F.setInterpolator(s33.h);
        } else if (f > 0.0f || l7bVar.a < gl.L(20.0f)) {
            this.F.setDuration(300L);
            this.F.setInterpolator(new c84());
        } else if (f >= 0.0f || !this.P) {
            this.F.setDuration(400L);
            this.F.setInterpolator(s33.h);
        } else {
            this.F.setDuration(200L);
            this.F.setInterpolator(s33.h);
            this.P = false;
        }
        this.F.start();
    }

    public final void d0(String str) {
        int i;
        mpb mpbVar = this.F0;
        mpbVar.clearAnimation();
        y6b y6bVar = this.C0;
        if ((y6bVar != null && y6bVar.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z = false;
        if (str == null) {
            b0(mpbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                mpbVar.setContentDescription(k96.M0(2131754915, null));
                i = R.drawable.media_photo_flash_auto2;
            }
            mpbVar.setContentDescription(k96.M0(2131754914, null));
            i = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                mpbVar.setContentDescription(k96.M0(2131754913, null));
                i = R.drawable.media_photo_flash_on2;
            }
            mpbVar.setContentDescription(k96.M0(2131754914, null));
            i = R.drawable.media_photo_flash_off2;
        }
        if (mpbVar.n != i) {
            mpbVar.n = i;
            ValueAnimator valueAnimator = mpbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                mpbVar.r = null;
            }
            mpbVar.setDrawable(i);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !G()) {
            z = true;
        }
        b0(mpbVar, z, true);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wx n;
        f4b f4bVar;
        int i3 = kk7.q2;
        f29 f29Var = this.P0;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (i == i3) {
            if (f29Var != null) {
                f29Var.h();
            }
            if (this.n2 == null || MediaController.c2 == null) {
                return;
            }
            for (int i4 = 0; i4 < MediaController.c2.size(); i4++) {
                xl6 xl6Var = (xl6) MediaController.c2.get(i4);
                int i5 = xl6Var.a;
                xl6 xl6Var2 = this.n2;
                if (i5 == xl6Var2.a && xl6Var.b == xl6Var2.b) {
                    this.n2 = xl6Var;
                    return;
                }
            }
            return;
        }
        if (i == kk7.A5) {
            if (f29Var == null || this.W1) {
                return;
            }
            f29Var.h();
            return;
        }
        if (i == kk7.c3) {
            byte b = this.g0;
            int i6 = this.c;
            if (b != 1) {
                if (b == 0 && (n = na7.q1(i6).M1().n()) != null && n.a(i6, 1)) {
                    f4b f4bVar2 = this.L1;
                    if (f4bVar2 == null || f4bVar2.J0 == 0) {
                        g0(n, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.O1 && !this.d1.o()) {
                g2b M1 = na7.q1(i6).M1();
                int z2 = z();
                wx n2 = M1.n();
                if (n2 == null || !n2.a(M1.a, z2) || ((f4bVar = this.L1) != null && (f4bVar.g || f4bVar.J0 != 0))) {
                    z = true;
                }
            }
            this.c1.setShareEnabled(z);
        }
    }

    public final void e(boolean z, boolean z2) {
        jk2 jk2Var;
        if (z) {
            je5 je5Var = this.m1;
            if (je5Var != null) {
                je5Var.f(true);
            }
            je5 je5Var2 = this.n1;
            if (je5Var2 != null) {
                je5Var2.f(true);
            }
            je5 je5Var3 = this.l1;
            if (je5Var3 != null) {
                je5Var3.f(true);
            }
            je5 je5Var4 = this.X0;
            if (je5Var4 != null) {
                je5Var4.f(true);
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
        if (z && (jk2Var = this.J0) != null && jk2Var.e) {
            jk2Var.a(false, z2);
        }
        l0(z2);
        q6b q6bVar = this.R0;
        ge5 ge5Var = this.V0;
        ge5 ge5Var2 = this.U0;
        if (!z2) {
            ge5Var2.setAlpha((z && this.g0 == 0 && !G()) ? 1.0f : 0.0f);
            ge5Var2.setTranslationY((z && this.g0 == 0 && !G()) ? 0.0f : gl.L(16.0f));
            ge5Var.setAlpha((!z && this.g0 == 0 && G()) ? 0.6f : 0.0f);
            ge5Var.setTranslationY((!z && this.g0 == 0 && G()) ? 0.0f : gl.L(16.0f));
            q6bVar.setAlpha((z || this.g0 != 0 || G()) ? 0.0f : 1.0f);
            q6bVar.setTranslationY((z || this.g0 != 0 || G()) ? gl.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a2 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ge5Var2, (Property<ge5, Float>) property, (z && this.g0 == 0 && !G()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(ge5Var2, (Property<ge5, Float>) property2, (z && this.g0 == 0 && !G()) ? 0.0f : gl.L(16.0f)), ObjectAnimator.ofFloat(ge5Var, (Property<ge5, Float>) property, (!z && this.g0 == 0 && G()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(ge5Var, (Property<ge5, Float>) property2, (!z && this.g0 == 0 && G()) ? 0.0f : gl.L(16.0f)), ObjectAnimator.ofFloat(q6bVar, (Property<q6b, Float>) property, (z || this.g0 != 0 || G()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(q6bVar, (Property<q6b, Float>) property2, (z || this.g0 != 0 || G()) ? gl.L(16.0f) : 0.0f));
        this.a2.setDuration(260L);
        this.a2.setInterpolator(s33.h);
        this.a2.start();
    }

    public final void e0(boolean z, boolean z2) {
        oy8 oy8Var = this.g1;
        if (oy8Var == null) {
            oy8 oy8Var2 = new oy8(R.raw.media_mute_unmute, gl.L(28.0f), gl.L(28.0f), true, null);
            this.g1 = oy8Var2;
            oy8Var2.G *= 1.5f;
            oy8Var = oy8Var2;
        }
        this.h1.setAnimation(oy8Var);
        oy8 oy8Var3 = this.g1;
        if (!z2) {
            oy8Var3.I(z ? 20 : 0, false, false);
            return;
        }
        if (z) {
            if (oy8Var3.b0 > 20) {
                oy8Var3.I(0, false, false);
            }
            this.g1.K(20);
            this.g1.start();
            return;
        }
        int i = oy8Var3.b0;
        if (i == 0 || i >= 43) {
            return;
        }
        oy8Var3.K(43);
        this.g1.start();
    }

    public final void f(Runnable runnable) {
        f4b f4bVar;
        Runnable runnable2;
        i7b i7bVar;
        l58 l58Var = this.C1;
        if (l58Var == null || (f4bVar = this.L1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        f4bVar.j |= l58Var.a();
        f4b f4bVar2 = this.L1;
        l58 l58Var2 = this.C1;
        File file = f4bVar2.Z0;
        if (file != null) {
            file.delete();
            f4bVar2.Z0 = null;
        }
        lm6 savedFilterState = l58Var2.getSavedFilterState();
        f4bVar2.a1 = savedFilterState;
        if (f4bVar2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = l58Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i = f4bVar2.R;
                    matrix.postScale(i == 1 ? -1.0f : 1.0f, i == 2 ? -1.0f : 1.0f, f4bVar2.k0 / 2.0f, f4bVar2.l0 / 2.0f);
                    matrix.postRotate(-f4bVar2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    f4bVar2.n0.preScale(f4bVar2.k0 / createBitmap.getWidth(), f4bVar2.l0 / createBitmap.getHeight());
                    f4bVar2.k0 = createBitmap.getWidth();
                    f4bVar2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = f4bVar2.Z0;
                    if (file2 != null && file2.exists()) {
                        f4bVar2.Z0.delete();
                    }
                    String k = f4b.k(f4bVar2.L);
                    boolean z = "png".equals(k) || "webp".equals(k);
                    f4bVar2.Z0 = f4b.w(f4bVar2.a, z ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(f4bVar2.Z0));
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new d97((Object) f4bVar2, (Object) createBitmap, z, (Object) runnable2, (byte) 16));
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
            f4b f4bVar3 = this.L1;
            if (f4bVar3.K || (i7bVar = this.Y0) == null) {
                return;
            }
            i7bVar.set(f4bVar3);
        }
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new uo(this, (byte) 3));
    }

    public final void g() {
        if (this.L1 == null || this.E1 == null) {
            return;
        }
        g7b g7bVar = this.i0;
        if (g7bVar.getMeasuredWidth() <= 0 || g7bVar.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.L1.Q != 0) {
            matrix.postRotate(-r2, g7bVar.getMeasuredWidth() / 2.0f, g7bVar.getMeasuredHeight() / 2.0f);
            if ((this.L1.Q / 90) % 2 == 1) {
                matrix.postScale(g7bVar.getMeasuredWidth() / g7bVar.getMeasuredHeight(), g7bVar.getMeasuredHeight() / g7bVar.getMeasuredWidth(), g7bVar.getMeasuredWidth() / 2.0f, g7bVar.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / g7bVar.getMeasuredWidth()) * this.L1.k0, (1.0f / g7bVar.getMeasuredHeight()) * this.L1.l0);
        matrix.postConcat(this.L1.n0);
        matrix.postScale(g7bVar.getMeasuredWidth() / this.L1.i0, g7bVar.getMeasuredHeight() / this.L1.j0);
        this.E1.setTransform(matrix);
        this.E1.invalidate();
    }

    public final void g0(wx wxVar, boolean z) {
        if (this.A2) {
            return;
        }
        a7b a7bVar = new a7b(wxVar.b(), this.c, null, this.b, new z6b(this, (byte) 0));
        a7bVar.S1 = z();
        a7bVar.setOnDismissListener(new bu5((byte) 2, this, z));
        this.Y0.x(7, true);
        this.A2 = true;
        a7bVar.show();
    }

    public final void h() {
        d28 d28Var;
        if (this.K) {
            g7b g7bVar = this.i0;
            float left = g7bVar.getLeft();
            float top = g7bVar.getTop();
            float measuredWidth = g7bVar.getMeasuredWidth();
            float measuredHeight = g7bVar.getMeasuredHeight();
            RectF rectF = this.e0;
            rectF.set(left, top, measuredWidth, measuredHeight);
            l7b l7bVar = this.r;
            rectF.offset(l7bVar.getX(), l7bVar.getY());
            float f = this.J;
            RectF rectF2 = this.I;
            RectF rectF3 = this.d0;
            gl.X1(rectF2, rectF, f, rectF3);
            g7bVar.setAlpha(this.J);
            g7bVar.setTranslationX((rectF3.left - g7bVar.getLeft()) - l7bVar.getX());
            g7bVar.setTranslationY((rectF3.top - g7bVar.getTop()) - l7bVar.getY());
            o7b o7bVar = this.G;
            if (o7bVar != null && (d28Var = o7bVar.f) != null) {
                d28Var.setTranslationX((rectF.left - rectF2.left) * this.J);
                this.G.f.setTranslationY((rectF.top - rectF2.top) * this.J);
            }
            g7bVar.setScaleX(rectF3.width() / g7bVar.getMeasuredWidth());
            g7bVar.setScaleY(rectF3.height() / g7bVar.getMeasuredHeight());
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
            tcc tccVar = this.K0;
            if (z2) {
                tccVar.animate().alpha(z ? 1.0f : 0.0f).setDuration(350L).setInterpolator(s33.h).withEndAction(new l6b(this, z, (byte) 1)).start();
                return;
            }
            tccVar.clearAnimation();
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
        f4b f4bVar;
        ImageReceiver photoImage;
        float f;
        if (this.w1 == null || (f4bVar = this.L1) == null) {
            return;
        }
        f4bVar.f();
        this.L1.j |= this.w1.r0();
        f4b f4bVar2 = this.L1;
        ArrayList arrayList = f4bVar2.T0;
        if (arrayList == null) {
            f4bVar2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        x6b x6bVar = this.w1;
        f4b f4bVar3 = this.L1;
        x6bVar.q0(f4bVar3.T0, false, false, false, false, f4bVar3);
        f4b f4bVar4 = this.L1;
        if (!f4bVar4.K) {
            f4bVar4.S0 = Utilities.k(this.w1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.w1.getMasks();
        this.L1.U0 = masks != null ? new ArrayList(masks) : null;
        f4b f4bVar5 = this.L1;
        boolean z = f4bVar5.K;
        boolean D = f4bVar5.D();
        this.L1.T0 = new ArrayList();
        x6b x6bVar2 = this.w1;
        f4b f4bVar6 = this.L1;
        Bitmap q0 = x6bVar2.q0(f4bVar6.T0, true, false, false, !z, f4bVar6);
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
        f4b f4bVar7 = this.L1;
        f4bVar7.P0 = null;
        f4bVar7.R0 = null;
        f4bVar7.Q0 = null;
        int i = this.c;
        ba4.G(i);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        f4b f4bVar8 = this.L1;
        f4bVar7.P0 = ba4.J(fl5.V(q0, compressFormat, f4bVar8.i0, f4bVar8.j0, 87), null, true, true);
        if (q0 != null && !q0.isRecycled()) {
            q0.recycle();
        }
        f4b f4bVar9 = this.L1;
        if (f4bVar9.u) {
            File file4 = f4bVar9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                f4bVar9 = this.L1;
                f4bVar9.Y0 = null;
            }
            long j = f4bVar9.z0;
            if (j != Long.MIN_VALUE) {
                Drawable drawable = f4bVar9.x0;
                if (drawable == null) {
                    drawable = zi8.d(null, i, j, this.d2);
                }
                if (drawable != null) {
                    this.L1.Y0 = f4b.w(i, "webp");
                    f4b f4bVar10 = this.L1;
                    Bitmap createBitmap = Bitmap.createBitmap(f4bVar10.i0, f4bVar10.j0, Bitmap.Config.ARGB_8888);
                    f4b.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.Y0));
                        } catch (Exception e2) {
                            fa4.g(e2, true);
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
        f4b f4bVar11 = this.L1;
        if (f4bVar11.u) {
            File file5 = f4bVar11.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                f4bVar11 = this.L1;
                f4bVar11.X0 = null;
            }
            if (f4bVar11.u && f4bVar11.K) {
                int i2 = f4bVar11.k0;
                int i3 = f4bVar11.l0;
                u17 p0 = this.w1.p0();
                if (p0 != null) {
                    o17 o17Var = p0.t0;
                    if (o17Var.getChildCount() == 1 && i2 > 0 && i3 > 0) {
                        int i4 = 0;
                        if ((o17Var.getChildAt(0) instanceof gb2) && (photoImage = ((gb2) o17Var.getChildAt(0)).getPhotoImage()) != null) {
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
                                    RectF rectF = gl.P;
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
                                        this.L1.X0 = f4b.w(i, "webp");
                                        createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.X0));
                                    } catch (Exception e4) {
                                        fa4.g(e4, true);
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
            x6b x6bVar3 = this.w1;
            ArrayList arrayList2 = new ArrayList();
            f4b f4bVar12 = this.L1;
            int i8 = f4bVar12.i0;
            Bitmap q02 = x6bVar3.q0(arrayList2, false, true, false, false, f4bVar12);
            f4b f4bVar13 = this.L1;
            ba4.G(i);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            f4b f4bVar14 = this.L1;
            f4bVar13.R0 = ba4.J(fl5.V(q02, compressFormat2, f4bVar14.i0, f4bVar14.j0, 87), null, true, true);
            if (q02 != null && !q02.isRecycled()) {
                q02.recycle();
            }
        }
        if (this.w1.E0.getPainting().E) {
            Bitmap blurBitmap = this.w1.getBlurBitmap();
            f4b f4bVar15 = this.L1;
            ba4.G(i);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            f4b f4bVar16 = this.L1;
            f4bVar15.Q0 = ba4.J(fl5.V(blurBitmap, compressFormat3, f4bVar16.i0, f4bVar16.j0, 87), null, true, true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
    }

    public final void i0(boolean z) {
        azc azcVar = this.W0;
        if (azcVar.getTag() != null && z) {
            Runnable runnable = this.f2;
            if (runnable != null) {
                gl.r(runnable);
            }
            d6b d6bVar = new d6b(this, (byte) 25);
            this.f2 = d6bVar;
            gl.e3(d6bVar, 2000L);
            return;
        }
        if (azcVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.g2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            azcVar.setTag(z ? 1 : null);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.g2 = animatorSet2;
            animatorSet2.setDuration(180L);
            if (z) {
                azcVar.setVisibility(0);
            }
            this.g2.playTogether(ObjectAnimator.ofFloat(azcVar, (Property<azc, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.g2.addListener(new pu9((byte) 6, this, z));
            this.g2.start();
            if (z) {
                d6b d6bVar2 = new d6b(this, (byte) 26);
                this.f2 = d6bVar2;
                gl.e3(d6bVar2, 2000L);
            }
        }
    }

    public final void j() {
        f4b f4bVar;
        if (this.w1 == null || (f4bVar = this.L1) == null || !f4bVar.u) {
            return;
        }
        File file = f4bVar.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            f4bVar = this.L1;
            f4bVar.W0 = null;
        }
        f4bVar.W0 = f4b.w(this.c, "webp");
        x6b x6bVar = this.w1;
        f4b f4bVar2 = this.L1;
        Bitmap q0 = x6bVar.q0(f4bVar2.T0, false, false, true, this.P1 != 1, f4bVar2);
        try {
            try {
                q0.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                if (q0.isRecycled()) {
                    return;
                }
            } finally {
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
            try {
                this.L1.W0.delete();
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
            this.L1.W0 = null;
            if (q0 == null || q0.isRecycled()) {
                return;
            }
        }
        q0.recycle();
    }

    public final void j0() {
        y5b y5bVar = this.r0;
        if (y5bVar != null) {
            y5bVar.dismiss();
            this.r0 = null;
        }
        y5b y5bVar2 = new y5b(this.b, 86400, this.a);
        y5bVar2.P0();
        y5bVar2.R0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            inputPeer = this.O != 0 ? na7.q1(this.c).h1(this.O) : new TLRPC.TL_inputPeerSelf();
        }
        y5bVar2.Q0(inputPeer);
        y5bVar2.z1 = this.N;
        y5bVar2.O1 = new e6b(this, (byte) 19);
        y5bVar2.E0(false);
        y5bVar2.N0(1);
        y5bVar2.L0(false);
        y5bVar2.Q1 = new e6b(this, (byte) 20);
        y5bVar2.N1 = new k6b(this, (byte) 11);
        this.r0 = y5bVar2;
        y5bVar2.show();
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
        e7b e7bVar;
        float f2;
        int i2;
        f7b f7bVar;
        int i3;
        float f3;
        f4b f4bVar;
        ImageView imageView;
        int i4;
        int i5;
        float f4;
        float f5;
        e58 e58Var;
        c58 c58Var;
        ImageView imageView2;
        int i6;
        f4b f4bVar2;
        x6b x6bVar;
        x6b x6bVar2;
        int i7 = this.h0;
        if (i7 == i && !z) {
            return;
        }
        j7b j7bVar = this.d1;
        if (i != -1 && j7bVar != null && j7bVar.O1) {
            return;
        }
        this.h0 = i;
        AnimatorSet animatorSet = this.s2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s2 = null;
        }
        jia jiaVar = this.q0;
        kob kobVar = this.a1;
        op3 op3Var = this.f1;
        ki4 ki4Var = this.o0;
        s71 s71Var = this.k1;
        ry8 ry8Var = this.h1;
        if (i7 != i) {
            if (i == -1) {
                ki4Var.setVisibility(0);
                j7bVar.setVisibility(0);
                x6b x6bVar3 = this.w1;
                if (x6bVar3 != null) {
                    x6bVar3.C0(null);
                }
                op3Var.setVisibility(0);
                f4b f4bVar3 = this.L1;
                if (f4bVar3 == null || !f4bVar3.u) {
                    ImageView imageView3 = this.j1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    E().setVisibility(0);
                    n0(false);
                }
                jiaVar.setVisibility(0);
                if (this.P1 == 1) {
                    ry8Var.setVisibility(0);
                    s71Var.setVisibility(0);
                } else {
                    f4b f4bVar4 = this.L1;
                    if (f4bVar4 != null && !TextUtils.isEmpty(f4bVar4.y)) {
                        ry8Var.setVisibility(8);
                        s71Var.setVisibility(0);
                    }
                }
                kobVar.setVisibility(0);
            }
            if (i == 0 && (x6bVar2 = this.w1) != null) {
                x6bVar2.setVisibility(0);
            }
            if ((i == 0 || i7 == 0) && (x6bVar = this.w1) != null) {
                x6bVar.T0.setLayerType(2, null);
            }
            x6b x6bVar4 = this.w1;
            if (x6bVar4 != null) {
                x6bVar4.E1.b(i != 0);
            }
            j7bVar.M.b(i != -1);
            m21.e();
            if (this.C1 != null && i7 == 1) {
                f(null);
            }
            k58 k58Var = this.D1;
            if (k58Var != null) {
                k58Var.setAllowTouch(false);
            }
            this.l1.f(true);
            s7b s7bVar = this.n;
            i7b i7bVar = this.Y0;
            Activity activity = this.b;
            if (i == 3) {
                if (this.s1 == null) {
                    e7b e7bVar2 = new e7b(this, activity, i7bVar);
                    this.s1 = e7bVar2;
                    s7bVar.addView(e7bVar2.d);
                    s7bVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
                f4b f4bVar5 = this.L1;
                if (f4bVar5 != null) {
                    this.s1.setEntry(f4bVar5);
                }
            } else if (i7 == 3) {
                i7bVar.a();
                e7b e7bVar3 = this.s1;
                if (e7bVar3 != null) {
                    e7bVar3.a.setCropEditorDrawing(e7bVar3);
                    e7bVar3.E = true;
                }
            }
            if (i == 4) {
                if (this.t1 == null) {
                    f7b f7bVar2 = new f7b(this, activity, i7bVar);
                    this.t1 = f7bVar2;
                    s7bVar.addView(f7bVar2.e);
                    s7bVar.addView(this.t1);
                }
                this.t1.setVisibility(0);
            } else if (i7 == 4) {
                i7bVar.a();
                f7b f7bVar3 = this.t1;
                if (f7bVar3 != null) {
                    f7bVar3.F = true;
                }
            }
        }
        this.c1.b((i == -1 || i == 2) && this.J > 0.0f, z2);
        ArrayList arrayList = new ArrayList();
        l58 l58Var = this.C1;
        boolean z4 = l58Var == null && i == 1;
        float f6 = 1.0f;
        if (i == 1) {
            q();
            l58 l58Var2 = this.C1;
            this.w2 = l58Var2;
            FrameLayout toolsView = l58Var2 != null ? l58Var2.getToolsView() : null;
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
            if (i7 == 1 && l58Var != null) {
                this.w2 = null;
                z3 = z4;
                arrayList.add(ObjectAnimator.ofFloat(l58Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, gl.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.C1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i != 0) {
                    s();
                    this.w2 = this.w1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(ki4Var, (Property<ki4, Float>) property, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.w1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -gl.L(16.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property2, gl.L(48.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -gl.L(32.0f), f));
                } else if (i7 == 0 && this.w1 != null) {
                    this.w2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(ki4Var, (Property<ki4, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property3, f));
                    View topLayout2 = this.w1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -gl.L(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property3, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property4, gl.L(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -gl.L(32.0f)));
                }
                e7bVar = this.s1;
                if (e7bVar == null) {
                    b33 b33Var = e7bVar.h;
                    if (i == 3) {
                        Property property5 = View.ALPHA;
                        i2 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(b33Var, (Property<b33, Float>) property5, 0.0f, 1.0f));
                        b33 b33Var2 = this.s1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f2 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(b33Var2, (Property<b33, Float>) property6, gl.L(52.0f), f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property6, gl.L(52.0f), f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new m6b(this, (byte) 1));
                        arrayList.add(ofFloat);
                    } else {
                        f2 = 52.0f;
                        i2 = 2;
                        i2 = 2;
                        if (i7 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(b33Var, (Property<b33, Float>) property7, 1.0f, 0.0f));
                            b33 b33Var3 = this.s1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(b33Var3, (Property<b33, Float>) property8, f, gl.L(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property8, f, gl.L(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.s1.getAppearProgress(), f);
                            ofFloat2.addUpdateListener(new m6b(this, i2));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f2 = 52.0f;
                    i2 = 2;
                }
                f7bVar = this.t1;
                if (f7bVar != null) {
                    b33 b33Var4 = f7bVar.n;
                    if (i == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i2];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(b33Var4, (Property<b33, Float>) property9, fArr));
                        b33 b33Var5 = this.t1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i2];
                        fArr2[0] = gl.L(f2);
                        fArr2[1] = f;
                        arrayList.add(ObjectAnimator.ofFloat(b33Var5, (Property<b33, Float>) property10, fArr2));
                        float[] fArr3 = new float[i2];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.t1.r;
                        float[] fArr4 = new float[i2];
                        fArr4[0] = gl.L(f2);
                        fArr4[1] = f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i2];
                        fArr5[0] = this.t1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new m6b(this, (byte) 3));
                        arrayList.add(ofFloat3);
                    } else if (i7 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i2];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(b33Var4, (Property<b33, Float>) property11, fArr6));
                        b33 b33Var6 = this.t1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float L = gl.L(f2);
                        float[] fArr7 = new float[i2];
                        fArr7[0] = f;
                        fArr7[1] = L;
                        arrayList.add(ObjectAnimator.ofFloat(b33Var6, (Property<b33, Float>) property12, fArr7));
                        float[] fArr8 = new float[i2];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.t1.r;
                        float L2 = gl.L(f2);
                        float[] fArr9 = new float[i2];
                        fArr9[0] = f;
                        fArr9[1] = L2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i2];
                        fArr10[0] = this.t1.getAppearProgress();
                        fArr10[1] = f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new m6b(this, (byte) 4));
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
                        arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property13, ((i != -1 || i == 2) && (this.P1 == i3 || !((f4bVar = this.L1) == null || TextUtils.isEmpty(f4bVar.y)))) ? 1.0f : f));
                        arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property13, (i != -1 || i == 2) ? 1.0f : f));
                        imageView = this.j1;
                        if (imageView != null) {
                            i4 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i == -1 || i == 2) && (f4bVar2 = this.L1) != null && f4bVar2.u) ? 1.0f : f));
                        } else {
                            i4 = 1;
                        }
                        byte b = this.g0;
                        float[] fArr12 = new float[i4];
                        fArr12[0] = ((b != i4 || b == 2) && i == -1) ? 1.0f : f;
                        arrayList.add(ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property13, fArr12));
                        g7b g7bVar = this.i0;
                        if (i == i4) {
                            g7bVar.setPivotY(g7bVar.getMeasuredHeight() * 0.2f);
                            i5 = gl.L(164.0f);
                        } else if (i == 0) {
                            g7bVar.setPivotY(g7bVar.getMeasuredHeight() * 0.6f);
                            i5 = gl.L(40.0f);
                        } else if (i == 2) {
                            g7bVar.setPivotY(f);
                            i5 = kobVar.getContentHeight() + gl.L(8.0f);
                        } else {
                            i5 = 0;
                        }
                        if (i5 > 0) {
                            f4 = (r10 - i5) / (g7bVar.getHeight() - ((int) g7bVar.getPivotY()));
                        } else {
                            f4 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(g7bVar, (Property<g7b, Float>) View.SCALE_X, f4));
                        arrayList.add(ObjectAnimator.ofFloat(g7bVar, (Property<g7b, Float>) View.SCALE_Y, f4));
                        if (i == -1) {
                            f5 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(g7bVar, (Property<g7b, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f5 = 0.0f;
                        }
                        e58Var = this.G1;
                        if (e58Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(e58Var, (Property<e58, Float>) property13, i == 1 ? 1.0f : f5));
                        }
                        c58Var = this.F1;
                        if (c58Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(c58Var, (Property<c58, Float>) property13, i == 1 ? 1.0f : f5));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(j7bVar, (Property<j7b, Float>) property13, i == -1 ? 1.0f : f5));
                        float[] fArr13 = {(i != -1 || i == 2) ? 1.0f : f5};
                        oc6 oc6Var = this.m0;
                        arrayList.add(ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) property14, (i != -1 || i == 2) ? f5 : gl.L(120.0f)));
                        if (i != -1 && i != 2) {
                            f6 = f5;
                        }
                        FrameLayout frameLayout3 = this.Z0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f6));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i == 2 ? gl.L(68.0f) : gl.L(64.0f) + (-(gl.L(12.0f) + j7bVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.k0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - gl.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i == 2 ? -90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property15, i == 2 ? 90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property15, i == 2 ? 90.0f : f5));
                        arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property15, i == 2 ? 90.0f : f5));
                        imageView2 = this.j1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i == 2 ? 90.0f : f5));
                        }
                        if (this.s0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i6 = 0;
                            ofFloat5.addUpdateListener(new w6b(this, 0 == true ? 1 : 0));
                            arrayList.add(ofFloat5);
                        } else {
                            i6 = 0;
                        }
                        if (kobVar != null) {
                            f4b f4bVar6 = this.L1;
                            boolean z5 = (f4bVar6 == null || !f4bVar6.v() || !this.L1.t() || i == 2) ? true : i6;
                            if (kobVar.k0 != z5 || !z2) {
                                kobVar.k0 = z5;
                                if (!z2) {
                                    kobVar.j0.f(z5, true);
                                }
                                kobVar.invalidate();
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
                        this.s2.setInterpolator(s33.h);
                        this.s2.addListener(new dw0(this, i7, i, (byte) 4));
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
                arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property13, ((i != -1 || i == 2) && (this.P1 == i3 || !((f4bVar = this.L1) == null || TextUtils.isEmpty(f4bVar.y)))) ? 1.0f : f));
                arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property13, (i != -1 || i == 2) ? 1.0f : f));
                imageView = this.j1;
                if (imageView != null) {
                }
                byte b2 = this.g0;
                float[] fArr122 = new float[i4];
                fArr122[0] = ((b2 != i4 || b2 == 2) && i == -1) ? 1.0f : f;
                arrayList.add(ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property13, fArr122));
                g7b g7bVar2 = this.i0;
                if (i == i4) {
                }
                if (i5 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(g7bVar2, (Property<g7b, Float>) View.SCALE_X, f4));
                arrayList.add(ObjectAnimator.ofFloat(g7bVar2, (Property<g7b, Float>) View.SCALE_Y, f4));
                if (i == -1) {
                }
                e58Var = this.G1;
                if (e58Var != null) {
                }
                c58Var = this.F1;
                if (c58Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(j7bVar, (Property<j7b, Float>) property13, i == -1 ? 1.0f : f5));
                float[] fArr132 = {(i != -1 || i == 2) ? 1.0f : f5};
                oc6 oc6Var2 = this.m0;
                arrayList.add(ObjectAnimator.ofFloat(oc6Var2, (Property<oc6, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(oc6Var2, (Property<oc6, Float>) property142, (i != -1 || i == 2) ? f5 : gl.L(120.0f)));
                if (i != -1) {
                    f6 = f5;
                }
                FrameLayout frameLayout32 = this.Z0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f6));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i == 2 ? gl.L(68.0f) : gl.L(64.0f) + (-(gl.L(12.0f) + j7bVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.k0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - gl.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i == 2 ? -90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property152, i == 2 ? 90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property152, i == 2 ? 90.0f : f5));
                arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property152, i == 2 ? 90.0f : f5));
                imageView2 = this.j1;
                if (imageView2 != null) {
                }
                if (this.s0.c()) {
                }
                if (kobVar != null) {
                }
                if (!z2) {
                }
            }
        }
        z3 = z4;
        if (i != 0) {
        }
        e7bVar = this.s1;
        if (e7bVar == null) {
        }
        f7bVar = this.t1;
        if (f7bVar != null) {
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
        arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property132, ((i != -1 || i == 2) && (this.P1 == i3 || !((f4bVar = this.L1) == null || TextUtils.isEmpty(f4bVar.y)))) ? 1.0f : f));
        arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property132, (i != -1 || i == 2) ? 1.0f : f));
        imageView = this.j1;
        if (imageView != null) {
        }
        byte b22 = this.g0;
        float[] fArr1222 = new float[i4];
        fArr1222[0] = ((b22 != i4 || b22 == 2) && i == -1) ? 1.0f : f;
        arrayList.add(ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property132, fArr1222));
        g7b g7bVar22 = this.i0;
        if (i == i4) {
        }
        if (i5 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(g7bVar22, (Property<g7b, Float>) View.SCALE_X, f4));
        arrayList.add(ObjectAnimator.ofFloat(g7bVar22, (Property<g7b, Float>) View.SCALE_Y, f4));
        if (i == -1) {
        }
        e58Var = this.G1;
        if (e58Var != null) {
        }
        c58Var = this.F1;
        if (c58Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(j7bVar, (Property<j7b, Float>) property132, i == -1 ? 1.0f : f5));
        float[] fArr1322 = {(i != -1 || i == 2) ? 1.0f : f5};
        oc6 oc6Var22 = this.m0;
        arrayList.add(ObjectAnimator.ofFloat(oc6Var22, (Property<oc6, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(oc6Var22, (Property<oc6, Float>) property1422, (i != -1 || i == 2) ? f5 : gl.L(120.0f)));
        if (i != -1) {
        }
        FrameLayout frameLayout322 = this.Z0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f6));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i == 2 ? gl.L(68.0f) : gl.L(64.0f) + (-(gl.L(12.0f) + j7bVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.k0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - gl.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i == 2 ? -90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property1522, i == 2 ? 90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property1522, i == 2 ? 90.0f : f5));
        arrayList.add(ObjectAnimator.ofFloat(op3Var, (Property<op3, Float>) property1522, i == 2 ? 90.0f : f5));
        imageView2 = this.j1;
        if (imageView2 != null) {
        }
        if (this.s0.c()) {
        }
        if (kobVar != null) {
        }
        if (!z2) {
        }
    }

    public final void l() {
        boolean z = this.L != 0.0f || this.J < 1.0f || this.C2;
        if (z == this.B2) {
            return;
        }
        a06 a06Var = this.E;
        if (a06Var != null) {
            a06Var.b(!z);
        }
        this.B2 = z;
    }

    public final void l0(boolean z) {
        y6b y6bVar;
        byte b = this.g0;
        jk2 jk2Var = this.J0;
        boolean z2 = false;
        h0(b == 0 && this.P1 == 1 && !jk2Var.e && !G(), z);
        h7b h7bVar = this.B0;
        boolean i = h7bVar.i();
        kk2 kk2Var = this.H0;
        kk2Var.setSelected(i);
        b0(this.o0, jk2Var == null || !jk2Var.e, z);
        b0(this.F0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.Z1 == null || jk2Var.e || G()) ? false : true, z);
        b0(this.G0, (this.b2 || this.P1 == -1 || this.g0 != 0 || (y6bVar = this.C0) == null || !y6bVar.a || jk2Var.e || h7bVar.i()) ? false : true, z);
        b0(kk2Var, (this.b2 || this.P1 == -1 || this.g0 != 0 || jk2Var.e) ? false : true, z);
        b0(this.I0, jk2Var.e, z);
        this.P0.e(z, h7bVar.i() ? h7bVar.getFilledProgress() : 0.0f);
        boolean z3 = jk2Var.e;
        je5 je5Var = this.o1;
        if (z3) {
            je5Var.v();
        } else {
            je5Var.f(true);
        }
        e(this.b2, z);
        gl.Q3(this.T0, this.P1 == -1 && this.g0 == 0, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z2 = true;
        }
        gl.Q3(this.S0, z2, true);
    }

    public final void m() {
        if (this.u2 < 0) {
            this.u2 = na7.c1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f = na7.c1().getFloat("frontflash_warmth", 0.9f);
            mi4 mi4Var = this.s;
            mi4Var.o = f;
            mi4Var.n = mi4.f(f);
            mi4Var.g();
            mi4Var.p = na7.c1().getFloat("frontflash_intensity", 1.0f);
            mi4Var.i();
        }
    }

    public final void m0() {
        mpb mpbVar = this.I0;
        mpbVar.setTranslationX(-0.0f);
        float alpha = (mpbVar.getAlpha() * gl.L(46.0f)) + 0.0f;
        npb npbVar = this.G0;
        npbVar.setTranslationX(-alpha);
        float alpha2 = (npbVar.getAlpha() * gl.L(46.0f)) + alpha;
        kk2 kk2Var = this.H0;
        kk2Var.setTranslationX(-alpha2);
        float alpha3 = (kk2Var.getAlpha() * gl.L(46.0f)) + alpha2;
        mpb mpbVar2 = this.F0;
        mpbVar2.setTranslationX(-alpha3);
        float alpha4 = (mpbVar2.getAlpha() * gl.L(46.0f)) + alpha3;
        ki4 ki4Var = this.o0;
        ki4Var.setTranslationX(0.0f);
        hw hwVar = this.J0.a;
        hwVar.setPadding((int) ((ki4Var.getAlpha() * gl.L(46.0f)) + 0.0f + gl.L(8.0f)), 0, (int) (alpha4 + gl.L(8.0f)), 0);
        hwVar.invalidate();
    }

    public final void n() {
        y6b y6bVar = this.C0;
        if (y6bVar == null || y6bVar.getTextureView() == null) {
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
                f += gl.B(bitmap.getPixel((i + 1) * width, i2 * height));
            }
        }
        float f2 = f / 100.0f;
        bitmap.recycle();
        this.d2 = f2 < 0.22f;
    }

    public final void n0(boolean z) {
        oy8 oy8Var = this.i1;
        if (oy8Var != null) {
            int[] iArr = oy8Var.e;
            f4b f4bVar = this.L1;
            int i = 0;
            if (!z) {
                int i2 = (f4bVar == null || !f4bVar.y0) ? 0 : iArr[0] - 1;
                oy8Var.I(i2, false, true);
                this.i1.K(i2);
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            if (f4bVar != null && f4bVar.y0) {
                i = iArr[0];
            }
            oy8Var.K(i);
            oy8 oy8Var2 = this.i1;
            if (oy8Var2 != null) {
                oy8Var2.start();
            }
        }
    }

    public final void o(boolean z) {
        if (this.d) {
            y5b y5bVar = this.r0;
            if (y5bVar != null) {
                y5bVar.dismiss();
                this.r0 = null;
            }
            f4b f4bVar = this.L1;
            long j = 0;
            if (f4bVar != null && !f4bVar.h) {
                if ((this.w && f4bVar.g) || f4bVar.b != 0) {
                    f4bVar.j = false;
                }
                f4bVar.i(false);
            }
            this.L1 = null;
            m8c m8cVar = this.S;
            i7b i7bVar = this.Y0;
            if (m8cVar == null || i7bVar == null) {
                if (i7bVar != null && !z) {
                    i7bVar.set(null);
                }
                d(0.0f, z, new d6b(this, (byte) 23));
                boolean z2 = this.K;
                if (z2 || !z2) {
                    this.n.setBackgroundColor(0);
                    this.c1.b(false, true);
                }
                kk7.e().n(this, kk7.q2);
                int i = this.c;
                kk7.f(i).n(this, kk7.A5);
                kk7.f(i).n(this, kk7.c3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            lbc lbcVar = i7bVar.E;
            if (lbcVar != null) {
                lbcVar.f0();
                i7bVar.E.l0();
                i7bVar.E = null;
            }
            lbc lbcVar2 = i7bVar.y;
            if (lbcVar2 != null) {
                j = lbcVar2.S();
                i7bVar.y.f0();
                i7bVar.y.l0();
                i7bVar.y = null;
            }
            lbc lbcVar3 = i7bVar.e;
            if (lbcVar3 != null) {
                j = lbcVar3.S();
                i7bVar.e.f0();
                i7bVar.e.l0();
                i7bVar.e = null;
            }
            m8cVar.a(Long.valueOf(j), new l6b(this, z, (byte) 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        d6b d6bVar = new d6b(this, (byte) 2);
        x6b x6bVar = this.w1;
        f4b f4bVar = this.L1;
        if (x6bVar == null || f4bVar == null) {
            d6bVar.run();
            return;
        }
        f4bVar.f();
        boolean r0 = x6bVar.r0();
        boolean z = x6bVar.E0.getPainting().E;
        Utilities.g.c(new g2a(this, x6bVar, f4bVar.i0, f4bVar.j0, f4bVar, z, r0, d6bVar, (byte) 2));
    }

    public final void p() {
        Activity activity = this.b;
        if (this.C0 != null || activity == null) {
            return;
        }
        byte b = 0;
        this.C0 = new y6b(this, activity, na7.c1().getBoolean("stories_camera", false));
        f29 f29Var = this.P0;
        if (f29Var != null) {
            f29Var.h0 = 0.0f;
            f29Var.i0.e(true, 0.0f);
        }
        this.C0.recordHevc = !this.B0.i();
        this.C0.setThumbDrawable(y());
        this.C0.initTexture();
        this.C0.setDelegate(new k6b(this, b));
        b0(this.G0, this.C0.a && this.g0 == 0, true);
        this.H0.setTranslationX(this.C0.a ? 0.0f : gl.L(46.0f));
        this.B0.setCameraView(this.C0);
        if (na7.c1().getInt("storyhint2", 0) < 1) {
            this.X0.v();
            na7.c1().edit().putInt("storyhint2", na7.c1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!ir3.o(this.C0.getContext()) || !na7.c1().getBoolean("dualcam", ir3.n(org.telegram.messenger.a.b, false))) && this.C0.a && na7.c1().getInt("storydualhint", 0) < 2) {
            this.m1.v();
        }
        dv8 dv8Var = this.D0;
        if (dv8Var == null) {
            dv8Var = new dv8(activity, new e6b(this, (byte) 4));
            this.D0 = dv8Var;
        }
        dv8Var.a(this.C0);
        lq9 lq9Var = this.E0;
        if (lq9Var != null) {
            h7b h7bVar = this.B0;
            Object blurRenderNode = h7bVar.getBlurRenderNode();
            lq9Var.G = h7bVar;
            lq9Var.H = blurRenderNode;
            lq9Var.invalidate();
        }
    }

    public final boolean p0() {
        y6b y6bVar;
        if ((!this.Q1 && !this.R1) || (y6bVar = this.C0) == null || !y6bVar.isFrontface()) {
            return false;
        }
        int i = this.u2;
        return i == 2 || (i == 1 && this.d2);
    }

    public final void q() {
        f4b f4bVar;
        Bitmap bitmap;
        Bitmap q;
        if (this.C1 != null || (f4bVar = this.L1) == null) {
            return;
        }
        boolean z = f4bVar.K;
        i7b i7bVar = this.Y0;
        if (z) {
            bitmap = null;
        } else {
            if (f4bVar.Z0 == null) {
                q = i7bVar.getPhotoBitmap();
            } else {
                k6b k6bVar = new k6b(this, (byte) 10);
                Point point = gl.q;
                q = f4b.q(k6bVar, point.x, point.y, 0, true);
            }
            bitmap = q;
        }
        if (bitmap != null || this.L1.K) {
            kac textureView = i7bVar.getTextureView();
            int orientation = i7bVar.getOrientation();
            f4b f4bVar2 = this.L1;
            l58 l58Var = new l58(this.b, textureView, bitmap, null, orientation, f4bVar2 != null ? f4bVar2.a1 : null, null, 0, false, false, this.s0, this.a);
            this.C1 = l58Var;
            this.r.addView(l58Var);
            k58 k58Var = this.D1;
            if (k58Var != null) {
                k58Var.setFilterView(this.C1);
            }
            TextureView myTextureView = this.C1.getMyTextureView();
            this.E1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            i7bVar.o(this.E1, this.C1);
            TextureView textureView2 = this.E1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.E1.animate().alpha(1.0f).setDuration(220L).start();
            }
            g();
            c58 blurControl = this.C1.getBlurControl();
            this.F1 = blurControl;
            g7b g7bVar = this.i0;
            if (blurControl != null) {
                g7bVar.addView(blurControl);
            }
            e58 curveControl = this.C1.getCurveControl();
            this.G1 = curveControl;
            if (curveControl != null) {
                g7bVar.addView(curveControl);
            }
            U();
            this.C1.getDoneTextView().setOnClickListener(new f6b(this, (byte) 13));
            this.C1.getCancelTextView().setOnClickListener(new f6b(this, (byte) 14));
            this.C1.getToolsView().setVisibility(8);
            this.C1.getToolsView().setAlpha(0.0f);
            this.C1.getToolsView().setTranslationY(gl.L(186.0f));
            this.C1.j0.setVisibility(0);
        }
    }

    public final void r(boolean z) {
        vr4 vr4Var = this.N0;
        h7b h7bVar = this.B0;
        byte b = 0;
        if (vr4Var != null) {
            boolean z2 = h7bVar != null && h7bVar.i();
            vr4 vr4Var2 = this.N0;
            if (z2 == vr4Var2.Q) {
                return;
            } else {
                vr4Var = vr4Var2;
            }
        }
        if (this.b == null) {
            return;
        }
        if (vr4Var != null) {
            u();
        }
        vr4 vr4Var3 = new vr4(this, this.c, this.b, this.a, this.n2, z, !z, h7bVar != null && h7bVar.i());
        this.N0 = vr4Var3;
        vr4Var3.H.setVisibility(8);
        this.N0.setMultipleOnClick(h7bVar.i());
        this.N0.setMaxCount(Math.min(10, fk2.b() - h7bVar.getFilledCount()));
        this.N0.setOnBackClickListener(new o6b(this, b));
        byte b2 = 2;
        this.N0.setOnSelectListener(new vn2(this, z, b2));
        this.N0.setOnSelectMultipleListener(new ef6(this, b2));
        s26 s26Var = this.m2;
        if (s26Var != null) {
            ar0 ar0Var = this.N0.e;
            ar0Var.B = s26Var;
            ar0Var.k0();
        }
        this.n.addView(this.N0, nme.e(-1, -1, kk7.D1));
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
        f4b f4bVar;
        i7b i7bVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        c79 renderView;
        g7b g7bVar;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file;
        File file2;
        if (this.w1 != null) {
            return;
        }
        i7b i7bVar2 = this.Y0;
        Pair<Integer, Integer> paintSize = i7bVar2.getPaintSize();
        f4b f4bVar2 = this.L1;
        Bitmap decodeFile = (f4bVar2 == null || !(f4bVar2.c || f4bVar2.g || this.I1 != null) || (file2 = f4bVar2.P0) == null) ? null : BitmapFactory.decodeFile(file2.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        f4b f4bVar3 = this.L1;
        boolean z6 = false;
        if (f4bVar3 == null || (!(f4bVar3.c || f4bVar3.g || this.I1 != null) || (file = f4bVar3.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file.getPath());
            if (bitmap != null) {
                z = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                g7b g7bVar2 = this.i0;
                int measuredWidth = g7bVar2.getMeasuredWidth();
                int measuredHeight = g7bVar2.getMeasuredHeight();
                f4bVar = this.L1;
                if (f4bVar != null || f4bVar.M) {
                    i7bVar = i7bVar2;
                    z2 = false;
                } else {
                    i7bVar = i7bVar2;
                    z2 = true;
                }
                File file3 = f4bVar != null ? null : f4bVar.L;
                if (f4bVar == null && f4bVar.K) {
                    z3 = false;
                    z6 = true;
                } else {
                    z3 = false;
                }
                if (f4bVar != null || f4bVar.J0 == 0) {
                    z4 = z;
                    z5 = z3;
                } else {
                    z4 = z;
                    z5 = true;
                }
                int orientation = i7bVar.getOrientation();
                f4b f4bVar4 = this.L1;
                ArrayList arrayList = f4bVar4 != null ? f4bVar4.T0 : null;
                zl6 zl6Var = new zl6();
                n00 n00Var = this.t0;
                i7b i7bVar3 = this.Y0;
                Activity activity = this.b;
                boolean z7 = z4;
                x6b x6bVar = new x6b(this, activity, z2, file3, z6, z5, this.n, activity, this.c, bitmap2, bitmap3, orientation, arrayList, f4bVar4, measuredWidth, measuredHeight, zl6Var, this.s0, this.a, n00Var, i7bVar3);
                this.w1 = x6bVar;
                f4b f4bVar5 = this.L1;
                x6bVar.setHasAudio(f4bVar5 == null && f4bVar5.y != null);
                this.w1.setBlurManager(this.s0);
                this.r.addView(this.w1);
                renderView = this.w1.getRenderView();
                this.x1 = renderView;
                if (renderView == null) {
                    renderView.getPainting().E = z7;
                    g7bVar = g7bVar2;
                    g7bVar.addView(this.x1);
                } else {
                    g7bVar = g7bVar2;
                }
                renderInputView = this.w1.getRenderInputView();
                this.y1 = renderInputView;
                if (renderInputView != null) {
                    g7bVar.addView(renderInputView);
                }
                textDimView = this.w1.getTextDimView();
                this.z1 = textDimView;
                if (textDimView != null) {
                    g7bVar.addView(textDimView);
                }
                entitiesView = this.w1.getEntitiesView();
                this.A1 = entitiesView;
                if (entitiesView != null) {
                    g7bVar.addView(entitiesView);
                }
                selectionEntitiesView = this.w1.getSelectionEntitiesView();
                this.B1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    g7bVar.addView(selectionEntitiesView);
                }
                U();
                this.w1.setOnDoneButtonClickedListener(new d6b(this, (byte) 21));
                this.w1.setOnCancelButtonClickedListener(new d6b(this, (byte) 22));
                x6b x6bVar2 = this.w1;
                x6bVar2.H0.setVisibility(0);
                x6bVar2.E0.setVisibility(0);
                x6bVar2.F0.setVisibility(0);
            }
        }
        z = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        g7b g7bVar22 = this.i0;
        int measuredWidth2 = g7bVar22.getMeasuredWidth();
        int measuredHeight2 = g7bVar22.getMeasuredHeight();
        f4bVar = this.L1;
        if (f4bVar != null) {
        }
        i7bVar = i7bVar2;
        z2 = false;
        if (f4bVar != null) {
        }
        if (f4bVar == null) {
        }
        z3 = false;
        if (f4bVar != null) {
        }
        z4 = z;
        z5 = z3;
        int orientation2 = i7bVar.getOrientation();
        f4b f4bVar42 = this.L1;
        ArrayList arrayList2 = f4bVar42 != null ? f4bVar42.T0 : null;
        zl6 zl6Var2 = new zl6();
        n00 n00Var2 = this.t0;
        i7b i7bVar32 = this.Y0;
        Activity activity2 = this.b;
        boolean z72 = z4;
        x6b x6bVar3 = new x6b(this, activity2, z2, file3, z6, z5, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, arrayList2, f4bVar42, measuredWidth2, measuredHeight2, zl6Var2, this.s0, this.a, n00Var2, i7bVar32);
        this.w1 = x6bVar3;
        f4b f4bVar52 = this.L1;
        x6bVar3.setHasAudio(f4bVar52 == null && f4bVar52.y != null);
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
        this.w1.setOnDoneButtonClickedListener(new d6b(this, (byte) 21));
        this.w1.setOnCancelButtonClickedListener(new d6b(this, (byte) 22));
        x6b x6bVar22 = this.w1;
        x6bVar22.H0.setVisibility(0);
        x6bVar22.E0.setVisibility(0);
        x6bVar22.F0.setVisibility(0);
    }

    public final void t(boolean z) {
        dv8 dv8Var = this.D0;
        if (dv8Var != null) {
            dv8Var.f = null;
            Utilities.e.a((av8) dv8Var.h);
            this.D0 = null;
            h7b h7bVar = this.B0;
            if (h7bVar != null) {
                h7bVar.c.c(null);
            }
        }
        lq9 lq9Var = this.E0;
        if (lq9Var != null) {
            lq9Var.G = null;
            lq9Var.H = null;
            lq9Var.invalidate();
        }
        if (this.C0 != null) {
            if (z) {
                a0(new d6b(this, (byte) 8));
                return;
            }
            a0(new d6b(this, (byte) 9));
            this.C0.destroy(true, null);
            gl.B2(this.C0);
            h7b h7bVar2 = this.B0;
            if (h7bVar2 != null) {
                h7bVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void u() {
        vr4 vr4Var = this.N0;
        if (vr4Var == null) {
            return;
        }
        this.n.removeView(vr4Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        yla ylaVar = this.p2;
        if (ylaVar != null) {
            ylaVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void w() {
        l58 l58Var = this.C1;
        if (l58Var == null) {
            return;
        }
        l58Var.c();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        g7b g7bVar = this.i0;
        if (textureView != null) {
            g7bVar.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        c58 c58Var = this.F1;
        if (c58Var != null) {
            g7bVar.removeView(c58Var);
            this.F1 = null;
        }
        e58 e58Var = this.G1;
        if (e58Var != null) {
            g7bVar.removeView(e58Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void x() {
        x6b x6bVar = this.w1;
        if (x6bVar != null) {
            x6bVar.H0.removeAllViews();
            x6b x6bVar2 = this.w1;
            yb1 yb1Var = x6bVar2.a2;
            if (yb1Var != null) {
                yb1Var.b.c();
                jb4 jb4Var = yb1Var.c;
                if (jb4Var != null) {
                    jb4Var.f = null;
                    m21 m21Var = (m21) jb4Var.g;
                    if (m21Var != null) {
                        m21Var.b();
                        jb4Var.g = null;
                    }
                    yb1Var.c = null;
                }
            }
            x6bVar2.E0.h();
            x6bVar2.H0.setVisibility(8);
            x6bVar2.G0.setVisibility(8);
            x6bVar2.u0.postRunnable(new am6((byte) 9));
            mt7 mt7Var = x6bVar2.e2;
            if (mt7Var != null) {
                mt7Var.dismiss();
            }
            yl2 yl2Var = x6bVar2.J1;
            if (yl2Var != null) {
                yl2Var.dismiss();
            }
            this.r.removeView(this.w1);
            this.w1 = null;
            c79 c79Var = this.x1;
            g7b g7bVar = this.i0;
            if (c79Var != null) {
                g7bVar.removeView(c79Var);
                this.x1 = null;
            }
            View view = this.z1;
            if (view != null) {
                g7bVar.removeView(view);
                this.z1 = null;
            }
            View view2 = this.y1;
            if (view2 != null) {
                g7bVar.removeView(view2);
                this.y1 = null;
            }
            View view3 = this.A1;
            if (view3 != null) {
                g7bVar.removeView(view3);
                this.A1 = null;
            }
            View view4 = this.B1;
            if (view4 != null) {
                g7bVar.removeView(view4);
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
        f4b f4bVar = this.L1;
        if (f4bVar != null) {
            return f4bVar.r();
        }
        return 1;
    }
}
