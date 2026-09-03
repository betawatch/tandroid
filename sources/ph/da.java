package ph;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.gk;
import org.telegram.ui.j21;
import org.telegram.ui.nw0;
import org.telegram.ui.ry0;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class da implements NotificationCenter.NotificationCenterDelegate {
    public static da C2;
    public final c6 A0;
    public TextureView A1;
    public float A2;
    public ValueAnimator B;
    public final pa B0;
    public df0 B1;
    public ValueAnimator B2;
    public y9 C;
    public final qa C0;
    public ff0 C1;
    public float D;
    public final v D0;
    public File D1;
    public final RectF E;
    public final pa E0;
    public ArrayList E1;
    public float F;
    public final u F0;
    public ArrayList F1;
    public int G;
    public final ta G0;
    public ArrayList G1;
    public float H;
    public boolean H0;
    public t6 H1;
    public Float I;
    public boolean I0;
    public boolean I1;
    public boolean J;
    public e9 J0;
    public long J1;
    public long K;
    public o0 K0;
    public boolean K1;
    public boolean L;
    public final s5 L0;
    public int L1;
    public final AnimationNotificationsLocker M;
    public final d M0;
    public boolean M1;
    public Runnable N;
    public final w8 N0;
    public boolean N1;
    public Utilities.Callback4 O;
    public final b2 O0;
    public boolean O1;
    public int P;
    public final b2 P0;
    public boolean P1;
    public int Q;
    public final e3 Q0;
    public float Q1;
    public int R;
    public final e3 R0;
    public int R1;
    public boolean S;
    public final h91 S0;
    public boolean S1;
    public boolean T;
    public final f3 T0;
    public boolean T1;
    public boolean U;
    public final s9 U0;
    public boolean U1;
    public int V;
    public final FrameLayout V0;
    public String V1;
    public int W;
    public final oa W0;
    public AnimatorSet W1;
    public int X;
    public final sa X0;
    public boolean X1;
    public int Y;
    public final f5 Y0;
    public boolean Y1;
    public final RectF Z;
    public final t9 Z0;
    public boolean Z1;
    public final nh.b a;
    public final RectF a0;
    public final v8 a1;
    public boolean a2;
    public final Activity b;
    public final Path b0;
    public final n0 b1;
    public Runnable b2;
    public final int c;
    public int c0;
    public gj0 c1;
    public AnimatorSet c2;
    public boolean d;
    public int d0;
    public final jj0 d1;
    public m8 d2;
    public boolean e;
    public final p9 e0;
    public gj0 e1;
    public boolean e2;
    public final WindowManager f;
    public final FrameLayout f0;
    public ImageView f1;
    public AnimatorSet f2;
    public final LinearLayout g0;
    public final eg.i0 g1;
    public ValueAnimator g2;
    public final WindowManager.LayoutParams h;
    public final FrameLayout h0;
    public final f3 h1;
    public boolean h2;
    public final q9 i0;
    public final f3 i1;
    public f2.h0 i2;
    public final FrameLayout j0;
    public final f3 j1;
    public MediaController.AlbumEntry j2;
    public final b2 k0;
    public final f3 k1;
    public ValueAnimator k2;
    public final m6 l0;
    public final g5 l1;
    public o1.j l2;
    public final org.telegram.ui.ActionBar.k5 m0;
    public final ra m1;
    public Boolean m2;
    public final ca n;
    public e8 n0;
    public n n1;
    public q8 n2;
    public final org.telegram.ui.Components.ba o0;
    public n9 o1;
    public AnimatorSet o2;
    public final j5 p0;
    public o9 p1;
    public boolean p2;
    public final nw0 q0;
    public final oa q1;
    public int q2;
    public final v9 r;
    public boolean r0;
    public final d r1;
    public ArrayList r2;
    public final d2 s;
    public long s0;
    public h9 s1;
    public FrameLayout s2;
    public String t0;
    public cg.p1 t1;
    public boolean t2;
    public TLRPC.InputPeer u0;
    public View u1;
    public g8 u2;
    public boolean v;
    public c8 v0;
    public View v1;
    public dw v2;
    public long w;
    public r w0;
    public View w1;
    public boolean w2;
    public u9 x;
    public final r9 x0;
    public View x1;
    public boolean x2;
    public final kf.t0 y;
    public i9 y0;
    public of0 y1;
    public boolean y2;
    public o5 z0;
    public final mf0 z1;
    public to z2;

    public da(Activity activity, int i10) {
        int i11;
        nh.b bVar = new nh.b();
        this.a = bVar;
        this.w = 0L;
        this.E = new RectF();
        int i12 = 1;
        this.J = true;
        this.M = new AnimationNotificationsLocker();
        this.Z = new RectF();
        this.a0 = new RectF();
        this.b0 = new Path();
        new Rect();
        int i13 = 0;
        this.c0 = 0;
        this.d0 = -1;
        this.v0 = new c8();
        this.E1 = null;
        this.F1 = null;
        this.G1 = null;
        this.L1 = 0;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.R1 = -3;
        this.T1 = false;
        a9 a9Var = new a9(this);
        this.a2 = true;
        this.h2 = true;
        this.q2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.D1;
        this.y = launchActivity != null ? new kf.t0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        int i14 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        ca caVar = new ca(this, activity);
        this.n = caVar;
        p8 p8Var = new p8(this, i12);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(caVar, p8Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        d2 d2Var = new d2(activity, windowManager, this.n, layoutParams);
        this.s = d2Var;
        d2Var.a(new l9(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        ca caVar2 = this.n;
        v9 v9Var = new v9(this, activity);
        this.r = v9Var;
        caVar2.addView(v9Var);
        v9 v9Var2 = this.r;
        p9 p9Var = new p9(this, activity);
        this.e0 = p9Var;
        v9Var2.addView(p9Var);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.o0 = new org.telegram.ui.Components.ba(this.e0);
        this.p0 = new j5();
        v9 v9Var3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f0 = frameLayout;
        v9Var3.addView(frameLayout);
        v9 v9Var4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.h0 = frameLayout2;
        v9Var4.addView(frameLayout2);
        v9 v9Var5 = this.r;
        q9 q9Var = new q9(this, activity, i13);
        this.i0 = q9Var;
        v9Var5.addView(q9Var);
        this.i0.setVisibility(8);
        this.i0.setAlpha(0.0f);
        v9 v9Var6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.j0 = frameLayout3;
        v9Var6.addView(frameLayout3);
        int i15 = 14;
        ic.a(this.n, new gg.w(i15));
        r9 r9Var = new r9(this, activity, this.o0, this.r, bVar);
        this.x0 = r9Var;
        ca caVar3 = this.n;
        Objects.requireNonNull(caVar3);
        r9Var.setCancelGestures(new org.telegram.ui.web.q0(caVar3, 25));
        int i16 = 13;
        this.x0.setResetState(new g8(this, i16));
        this.e0.addView(this.x0, k7.b6.e(-1, -1, 119));
        this.x0.setOnClickListener(new j8(this, 12));
        p9 p9Var2 = this.e0;
        int i17 = this.G;
        p9Var2.setBackgroundColor((i17 == 1 || i17 == 0) ? 0 : -14737633);
        p9 p9Var3 = this.e0;
        float dp = AndroidUtilities.dp(12.0f);
        gg.j1 j1Var = kf.r0.a;
        p9Var3.setOutlineProvider(new kf.q0(0, dp));
        this.e0.setClipToOutline(true);
        g8 g8Var = new g8(this, i15);
        mf0 mf0Var = new mf0(activity);
        mf0Var.a = new TextPaint(1);
        mf0Var.b = new TextPaint(1);
        mr mrVar = mr.h;
        mf0Var.s = new org.telegram.ui.Components.z5(mf0Var, 0L, 350L, mrVar);
        mf0Var.F = new dc0(mf0Var, 7);
        mf0Var.x = g8Var;
        this.z1 = mf0Var;
        s9 s9Var = new s9(this, activity, this.o0, this.p0);
        this.U0 = s9Var;
        s9Var.setCollageView(this.x0);
        s9 s9Var2 = this.U0;
        s9Var2.v = new g8(this, 15);
        s9Var2.setOnTapListener(new g8(this, i14));
        this.U0.setVisibility(8);
        s9 s9Var3 = this.U0;
        s9Var3.K = new g8(this, 17);
        this.e0.addView(s9Var3, k7.b6.e(-1, -1, 119));
        this.e0.addView(this.z1, k7.b6.e(-1, -1, 119));
        ca caVar4 = this.n;
        int i18 = 8;
        t9 t9Var = new t9(this, activity, caVar4, caVar4, this.r, bVar, this.o0);
        this.Z0 = t9Var;
        t9Var.setAccount(i10);
        int i19 = 6;
        this.Z0.setUiBlurBitmap(new p8(this, i19));
        ic.a(this.i0, new kh.t0(this, 11));
        this.Z0.setOnHeightUpdate(new h8(this, i16));
        this.Z0.setOnPeriodUpdate(new h8(this, 4));
        long j10 = this.K;
        if (j10 != 0) {
            this.Z0.setDialogId(j10);
        }
        this.Z0.setOnPremiumHint(new h8(this, 5));
        this.Z0.setOnKeyboardOpen(new h8(this, i19));
        nw0 nw0Var = new nw0(this, activity, i19);
        this.q0 = nw0Var;
        this.r.addView(nw0Var);
        oa oaVar = new oa(activity, this.r, this.e0, bVar, this.o0);
        this.W0 = oaVar;
        oaVar.setOnTimelineClick(new g8(this, 10));
        this.W0.setOnHeightChange(new g8(this, 11));
        this.U0.setVideoTimelineView(this.W0);
        this.W0.setVisibility(8);
        this.W0.setAlpha(0.0f);
        this.W0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.V0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.W0, k7.b6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        sa saVar = new sa(activity);
        this.X0 = saVar;
        saVar.setVisibility(8);
        this.X0.a(false);
        this.V0.addView(this.X0, k7.b6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.i0.addView(this.V0, k7.b6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.i0.addView(this.Z0, k7.b6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.x0.setTimelineView(this.W0);
        this.x0.setPreviewView(this.U0);
        oa oaVar2 = new oa(activity, this.r, this.e0, bVar, this.o0);
        this.q1 = oaVar2;
        oaVar2.U0 = true;
        oaVar2.setVisibility(8);
        this.q1.setAlpha(0.0f);
        this.i0.addView(this.q1, k7.b6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        v8 v8Var = new v8(this, activity, bVar, this.o0);
        this.a1 = v8Var;
        v8Var.setVisibility(8);
        this.i0.addView(this.a1, k7.b6.e(-1, -2, 85));
        b2 b2Var = new b2(activity);
        this.k0 = b2Var;
        b2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        b2 b2Var2 = this.k0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        b2Var2.setScaleType(scaleType);
        this.k0.setImageResource(R.drawable.msg_photo_back);
        b2 b2Var3 = this.k0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        b2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.k0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.k0.setOnClickListener(new j8(this, i12));
        this.f0.addView(this.k0, k7.b6.e(56, 56, 51));
        this.s.a(this.k0);
        m6 m6Var = new m6(activity, i10);
        this.l0 = m6Var;
        m6Var.a(false, false);
        this.l0.setOnClickListener(new s8(i13, this, activity));
        this.f0.addView(this.l0, k7.b6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.m0 = k5Var;
        k5Var.setTextSize(20);
        this.m0.setGravity(19);
        this.m0.setTextColor(-1);
        this.m0.setTypeface(AndroidUtilities.bold());
        this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.m0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.m0.setAlpha(0.0f);
        this.m0.setVisibility(8);
        this.m0.setEllipsizeByGradient(true);
        this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f0.addView(this.m0, k7.b6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.g0 = linearLayout;
        linearLayout.setOrientation(0);
        this.g0.setGravity(5);
        this.f0.addView(this.g0, k7.b6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        h8 h8Var = new h8(this, 7);
        ca caVar5 = this.n;
        n0 n0Var = new n0(activity);
        n0Var.w = true;
        n0Var.x = true;
        n0Var.h = h8Var;
        n0Var.a = i10;
        n0Var.b = caVar5;
        n0Var.setScaleType(scaleType);
        n0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        n0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        n0Var.setVisibility(8);
        n0Var.setAlpha(0.0f);
        n0Var.setOnClickListener(new oh.n(n0Var, i18));
        n0Var.f = new qp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        n0Var.d();
        this.b1 = n0Var;
        f3 f3Var = new f3(activity, 1);
        f3Var.l(1.0f, -71.0f);
        f3Var.d = 2000L;
        f3Var.R = false;
        f3Var.E.o(true, false, false);
        this.h1 = f3Var;
        f3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f0.addView(this.h1, k7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        jj0 jj0Var = new jj0(activity);
        this.d1 = jj0Var;
        jj0Var.setScaleType(scaleType);
        jj0 jj0Var2 = this.d1;
        t6 t6Var = this.H1;
        jj0Var2.setImageResource((t6Var == null || !t6Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.d1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.d1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        int i20 = 2;
        this.d1.setOnClickListener(new j8(this, i20));
        this.d1.setVisibility(8);
        this.d1.setAlpha(0.0f);
        eg.i0 i0Var = new eg.i0(activity);
        this.g1 = i0Var;
        i0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        this.g1.setOnClickListener(new j8(this, 3));
        this.g0.addView(this.g1, k7.b6.q(46, 56, 53));
        this.g0.addView(this.d1, k7.b6.q(46, 56, 53));
        this.g0.addView(this.b1, k7.b6.e(46, 56, 53));
        pa paVar = new pa(activity);
        this.B0 = paVar;
        paVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.B0.setOnClickListener(new j8(this, 4));
        this.B0.setOnLongClickListener(new dg.f0(this, i20));
        this.B0.setVisibility(8);
        this.B0.setAlpha(0.0f);
        this.s.a(this.B0);
        this.f0.addView(this.B0, k7.b6.e(56, 56, 53));
        qa qaVar = new qa(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.C0 = qaVar;
        qaVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.C0.setOnClickListener(new j8(this, 5));
        boolean q10 = v0.q(activity);
        this.C0.setVisibility(q10 ? 0 : 8);
        this.C0.setAlpha(q10 ? 1.0f : 0.0f);
        this.s.a(this.C0);
        this.f0.addView(this.C0, k7.b6.e(56, 56, 53));
        v vVar = new v(activity);
        this.D0 = vVar;
        vVar.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.D0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        if (this.w0 == null) {
            i11 = 6;
            this.w0 = (r) r.a().get(6);
        } else {
            i11 = 6;
        }
        this.D0.setOnClickListener(new j8(this, i11));
        this.D0.a(new kc0(this.w0, false), false);
        this.D0.setSelected(false);
        this.D0.setVisibility(0);
        this.D0.setAlpha(1.0f);
        this.s.a(this.D0);
        this.f0.addView(this.D0, k7.b6.e(56, 56, 53));
        pa paVar2 = new pa(activity);
        this.E0 = paVar2;
        paVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.E0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.E0.a(new kc0(new r("../../.."), true), false);
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.E0.setOnClickListener(new j8(this, 7));
        this.s.a(this.E0);
        this.f0.addView(this.E0, k7.b6.e(56, 56, 53));
        u uVar = new u(activity, this.s);
        this.F0 = uVar;
        uVar.a.u0(6);
        this.F0.setSelected((r) null);
        this.F0.setOnLayoutClick(new h8(this, i18));
        this.f0.addView(this.F0, k7.b6.e(-1, 56, 53));
        f3 f3Var2 = new f3(activity, 1);
        f3Var2.l(1.0f, -20.0f);
        f3Var2.d = 5000L;
        f3Var2.i();
        f3Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        f3Var2.i0 = new j21(14);
        this.i1 = f3Var2;
        f3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f0.addView(this.i1, k7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        f3 f3Var3 = new f3(activity, 2);
        f3Var3.l(0.0f, 28.0f);
        f3Var3.d = 5000L;
        f3Var3.p(true);
        this.j1 = f3Var3;
        this.f0.addView(f3Var3, k7.b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        f3 f3Var4 = new f3(activity, 1);
        f3Var4.l(1.0f, -20.0f);
        f3Var4.d = 5000L;
        f3Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.k1 = f3Var4;
        f3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f0.addView(this.k1, k7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ta taVar = new ta(activity);
        Paint paint = new Paint(1);
        taVar.a = paint;
        Paint paint2 = new Paint(1);
        taVar.b = paint2;
        taVar.e = new org.telegram.ui.Components.z5(taVar, 0L, 250L, mrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        taVar.c = j6Var;
        j6Var.k(0.3f, 250L, mrVar);
        j6Var.t(AndroidUtilities.dp(13.0f));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.bold());
        j6Var.setCallback(taVar);
        j6Var.b = 1;
        taVar.a(0L, false);
        this.G0 = taVar;
        i0(false, false);
        this.f0.addView(this.G0, k7.b6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.G0);
        MediaController.loadGalleryPhotosAlbums(0);
        s5 s5Var = new s5(activity);
        this.L0 = s5Var;
        s5Var.setDelegate(a9Var);
        s5 s5Var2 = this.L0;
        boolean z4 = this.L1 == 1;
        s5Var2.k0 = -1.0f;
        s5Var2.l0 = z4;
        s5Var2.invalidate();
        this.h0.addView(this.L0, k7.b6.e(-1, 100, 87));
        this.s.a(this.L0);
        this.L0.e(this.x0.j() ? this.x0.getFilledProgress() : 0.0f, true);
        d dVar = new d(activity, bVar, true);
        this.M0 = dVar;
        dVar.setRoundRadius(24);
        this.M0.setColor(-2473124);
        this.M0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.M0.setAlpha(0.0f);
        this.M0.setScaleX(0.8f);
        this.M0.setScaleY(0.8f);
        this.M0.setVisibility(8);
        this.h0.addView(this.M0, k7.b6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.M0.setOnClickListener(new j8(this, i18));
        f3 f3Var5 = new f3(activity, 3);
        f3Var5.p(true);
        f3Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        f3Var5.h = AndroidUtilities.dp(320.0f);
        f3Var5.d = 5000L;
        f3Var5.H = Layout.Alignment.ALIGN_CENTER;
        this.T0 = f3Var5;
        this.h0.addView(f3Var5, k7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        h91 h91Var = new h91(activity);
        this.S0 = h91Var;
        h91Var.J = false;
        h91Var.setAlpha(0.0f);
        this.h0.addView(this.S0, k7.b6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.S0.setDelegate(new p8(this, 4));
        h91 h91Var2 = this.S0;
        this.Q1 = 0.0f;
        h91Var2.b(0.0f, false);
        c6 c6Var = new c6(activity, i10, new g8(this, 12));
        this.A0 = c6Var;
        c6Var.c = new h8(this, 9);
        this.h0.addView(c6Var, k7.b6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        w8 w8Var = new w8(this, activity);
        this.N0 = w8Var;
        w8Var.setOnSwitchModeListener(new h8(this, 10));
        this.N0.setOnSwitchingModeListener(new h8(this, 11));
        this.j0.addView(this.N0, k7.b6.e(-1, 48, 55));
        this.s.a(this.N0);
        b2 b2Var4 = new b2(activity);
        this.O0 = b2Var4;
        b2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.O0.setImageResource(R.drawable.stream_flip);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.j0.addView(this.O0, k7.b6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.O0);
        this.O0.setOnClickListener(new j8(this, 9));
        b2 b2Var5 = new b2(activity);
        this.P0 = b2Var5;
        b2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.P0.setImageResource(R.drawable.stream_settings);
        this.P0.setScaleType(scaleType);
        this.P0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.j0.addView(this.P0, k7.b6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.P0);
        this.P0.setOnClickListener(new j8(this, 10));
        e3 e3Var = new e3(activity);
        this.Q0 = e3Var;
        this.j0.addView(e3Var, k7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.Q0);
        e3 e3Var2 = new e3(activity);
        this.R0 = e3Var2;
        e3Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        e3Var2.invalidate();
        this.R0.setAlpha(0.0f);
        this.j0.addView(this.R0, k7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.R0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.r1 = dVar2;
        dVar2.setVisibility(8);
        this.r1.setAlpha(0.0f);
        this.r1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.r1.setOnClickListener(new j8(this, 11));
        this.j0.addView(this.r1, k7.b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        f5 f5Var = new f5(activity);
        f5Var.b = new ArrayList();
        f5Var.e = true;
        f5Var.h = true;
        View view = new View(activity);
        f5Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        f5Var.addView(view, k7.b6.e(-1, -1, 119));
        f5Var.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        f5Var.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        f5Var.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        f5Var.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        f5Var.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        f5Var.d = string;
        f5Var.e = true;
        e5 e5Var = new e5(f5Var, activity, string, true);
        f5Var.c = e5Var;
        e5Var.setContentDescription(LocaleController.getString(R.string.Send));
        f5Var.addView(f5Var.c, k7.b6.c(-2.0f, -2));
        f5Var.e();
        this.Y0 = f5Var;
        f5Var.setVisibility(8);
        this.Y0.setOnClickListener(new h8(this, 12));
        this.j0.addView(this.Y0, k7.b6.e(-1, 52, 23));
        ra raVar = new ra(activity);
        this.m1 = raVar;
        raVar.setAlpha(0.0f);
        this.m1.setVisibility(8);
        this.e0.addView(this.m1, k7.b6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        g5 g5Var = new g5(activity, i10, bVar);
        this.l1 = g5Var;
        this.e0.addView(g5Var, k7.b6.e(-1, -1, 119));
        m0(false);
    }

    public static da E(Activity activity, int i10) {
        da daVar = C2;
        if (daVar != null && (daVar.b != activity || daVar.c != i10)) {
            daVar.q(false);
            C2 = null;
        }
        if (C2 == null) {
            C2 = new da(activity, i10);
        }
        return C2;
    }

    public static void a(da daVar) {
        i9 i9Var = daVar.y0;
        if (i9Var == null || i9Var.getTextureView() == null) {
            daVar.Z1 = false;
            return;
        }
        Bitmap bitmap = daVar.y0.getTextureView().getBitmap();
        if (bitmap == null) {
            daVar.Z1 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = 0;
            while (i11 < 10) {
                i11++;
                f10 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
            }
        }
        float f11 = f10 / 100.0f;
        bitmap.recycle();
        daVar.Z1 = f11 < 0.22f;
    }

    public static void a0(boolean z4) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z4).apply();
    }

    public static boolean b(da daVar) {
        Activity activity = daVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            r4 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
            if (r4) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i10 >= 23) {
            r4 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
            if (r4) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !r4;
    }

    public static void c(da daVar) {
        ValueAnimator valueAnimator = daVar.g2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            daVar.g2 = null;
        }
        daVar.h2 = false;
        v9 v9Var = daVar.r;
        float f10 = v9Var.a;
        float f11 = v9Var.b;
        v9Var.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        daVar.g2 = ofFloat;
        ofFloat.addUpdateListener(new mv(daVar, f10, f11, 3));
        daVar.g2.setDuration(340L);
        daVar.g2.setInterpolator(mr.h);
        daVar.g2.addListener(new d9(daVar, 0));
        daVar.g2.start();
    }

    public static boolean d(da daVar) {
        Activity activity = daVar.b;
        if (Build.VERSION.SDK_INT < 23 || activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
        return false;
    }

    public static SpannableString n(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i10 = -dp;
        mutate.setBounds(i10 / 4, i10, (dp / 4) * 3, 0);
        spannableString.setSpan(new m9(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        da daVar = C2;
        if (daVar != null) {
            daVar.q(false);
        }
        C2 = null;
    }

    public final Drawable A() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        return bitmap != null ? new BitmapDrawable(bitmap) : this.b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.F1;
        if (arrayList != null) {
            return arrayList.size();
        }
        t6 t6Var = this.H1;
        if (t6Var != null) {
            return t6Var.r();
        }
        return 1;
    }

    public final String C() {
        i9 i9Var = this.y0;
        if (i9Var == null || i9Var.getCameraSession() == null) {
            return null;
        }
        if (!this.y0.isFrontface() || this.y0.getCameraSession().hasFlashModes()) {
            return this.y0.getCameraSession().getCurrentFlashMode();
        }
        p();
        return (String) this.r2.get(this.q2);
    }

    public final o0 D() {
        if (this.K0 == null) {
            o0 o0Var = new o0(this.b);
            this.K0 = o0Var;
            this.h0.addView(o0Var, k7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.K0;
    }

    public final String F() {
        i9 i9Var = this.y0;
        if (i9Var == null || i9Var.getCameraSession() == null) {
            return null;
        }
        if (!this.y0.isFrontface() || this.y0.getCameraSession().hasFlashModes()) {
            return this.y0.getCameraSession().getNextFlashMode();
        }
        p();
        ArrayList arrayList = this.r2;
        return (String) arrayList.get(this.q2 + 1 >= arrayList.size() ? 0 : this.q2 + 1);
    }

    public final ImageView G() {
        if (this.f1 == null) {
            gj0 gj0Var = new gj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.e1 = gj0Var;
            gj0Var.h = true;
            t6 t6Var = this.H1;
            if (t6Var == null || !t6Var.y0) {
                gj0Var.N(0);
                this.e1.K(0);
            } else {
                gj0Var.K(35);
                this.e1.N(36);
            }
            this.e1.X = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.a);
            this.e1.O(v02, "Sunny");
            this.e1.O(v02, "Path 6");
            this.e1.O(v02, "Path");
            this.e1.O(v02, "Path 5");
            this.e1.m();
            ImageView imageView = new ImageView(this.b);
            this.f1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
            this.f1.setOnClickListener(new j8(this, 0));
            this.f1.setVisibility(8);
            this.f1.setImageDrawable(this.e1);
            this.f1.setAlpha(0.0f);
            this.g0.addView(this.f1, 0, k7.b6.q(46, 56, 53));
        }
        return this.f1;
    }

    public final void H() {
        h9 h9Var = this.s1;
        if (h9Var == null) {
            return;
        }
        this.s2 = null;
        h9Var.getTopLayout().setAlpha(0.0f);
        this.s1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.s1.getBottomLayout().setAlpha(0.0f);
        this.s1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.s1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.s1.setVisibility(8);
    }

    public final boolean I() {
        return !this.X1 && (this.x0.j() ? this.x0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean J() {
        e9 e9Var;
        if (this.T || (e9Var = this.J0) == null) {
            return false;
        }
        return e9Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(int i10, boolean z4) {
        t6 t6Var;
        t6 t6Var2;
        d dVar;
        org.telegram.ui.ActionBar.k5 k5Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        t6 t6Var3;
        t6 t6Var4;
        t6 t6Var5;
        t6 t6Var6;
        i9 i9Var;
        int i13 = this.c0;
        if (i10 == i13) {
            return;
        }
        this.c0 = i10;
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        O(i13, i10);
        f5 f5Var = this.Y0;
        if (f5Var != null) {
            f5Var.b(i10 == 1, z4);
        }
        u uVar = this.F0;
        i0(i10 == 0 && this.L1 == 1 && !uVar.e && !I(), z4);
        if (i10 != 1) {
            this.X0.a(z4);
        }
        c0(this.k0, !uVar.e, z4);
        c0(this.B0, (this.X1 || i10 != 0 || uVar.e || this.V1 == null || I()) ? false : true, z4);
        boolean z10 = this.X1;
        r9 r9Var = this.x0;
        c0(this.C0, (z10 || i10 != 0 || (i9Var = this.y0) == null || !i9Var.a || uVar.e || r9Var.j()) ? false : true, true);
        c0(this.D0, (this.X1 || i10 != 0 || uVar.e) ? false : true, z4);
        m0(z4);
        n0 n0Var = this.b1;
        eg.i0 i0Var = this.g1;
        jj0 jj0Var = this.d1;
        oa oaVar = this.q1;
        oa oaVar2 = this.W0;
        d dVar2 = this.r1;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.m0;
        t9 t9Var = this.Z0;
        e3 e3Var = this.R0;
        e3 e3Var2 = this.Q0;
        c6 c6Var = this.A0;
        s9 s9Var = this.U0;
        q9 q9Var = this.i0;
        w8 w8Var = this.N0;
        s5 s5Var = this.L0;
        if (!z4) {
            i9 i9Var2 = this.y0;
            if (i9Var2 != null) {
                i9Var2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            s9Var.setAlpha(((i10 != 1 || r9Var.j()) && i10 != 2) ? 0.0f : 1.0f);
            r9Var.setAlpha((i10 == 0 || (i10 == 1 && r9Var.j())) ? 1.0f : 0.0f);
            s5Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            s5Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            c6Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            w8Var.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            w8Var.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            e3Var2.setAlpha((i10 == 0 && this.X1 && !I()) ? 1.0f : 0.0f);
            e3Var.setAlpha((i10 == 0 && !this.X1 && I()) ? 0.6f : 0.0f);
            q9Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            q9Var.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            t9Var.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            jj0Var.setAlpha((i10 == 1 && this.L1 == 1) ? 1.0f : 0.0f);
            i0Var.setAlpha((i10 != 1 || (this.L1 != 1 && ((t6Var2 = this.H1) == null || TextUtils.isEmpty(t6Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            n0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.f1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (t6Var = this.H1) != null && t6Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            oaVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            oaVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            k5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.f2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        i9 i9Var3 = this.y0;
        if (i9Var3 != null) {
            dVar = dVar2;
            k5Var = k5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(i9Var3, (Property<i9, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            k5Var = k5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || r9Var.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(s9Var, (Property<s9, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && r9Var.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(r9Var, (Property<r9, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(s5Var, (Property<s5, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(s5Var, (Property<s5, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(c6Var, (Property<c6, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(w8Var, (Property<w8, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(w8Var, (Property<w8, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(e3Var2, (Property<e3, Float>) property, (i10 == 0 && this.X1 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property, (i10 == 0 && !this.X1 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property, ((i10 == 1 && ((t6Var6 = this.H1) == null || t6Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((t6Var5 = this.H1) == null || t6Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(t9Var, (Property<t9, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(oaVar2, (Property<oa, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(oaVar, (Property<oa, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property, (i10 == 1 || this.L1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property, (i10 == 1 || (this.L1 != 1 && ((t6Var4 = this.H1) == null || TextUtils.isEmpty(t6Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.f1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (t6Var3 = this.H1) != null && t6Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<h91, Float>) property, 0.0f));
                this.f2.playTogether(arrayList);
                this.f2.addListener(new c9(this, i13, i10, 0));
                this.f2.setDuration(460L);
                this.f2.setInterpolator(mr.h);
                this.f2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(t9Var, (Property<t9, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(oaVar2, (Property<oa, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(oaVar, (Property<oa, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property, (i10 == 1 || this.L1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property, (i10 == 1 || (this.L1 != 1 && ((t6Var4 = this.H1) == null || TextUtils.isEmpty(t6Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.f1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<h91, Float>) property, 0.0f));
        this.f2.playTogether(arrayList);
        this.f2.addListener(new c9(this, i13, i10, 0));
        this.f2.setDuration(460L);
        this.f2.setInterpolator(mr.h);
        this.f2.start();
    }

    public final void L(Runnable runnable, long j10) {
        if (this.P1 || this.H1 == null) {
            return;
        }
        m8 m8Var = this.d2;
        if (m8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m8Var);
        }
        this.e2 = true;
        this.P1 = true;
        this.d2 = new m8(this, runnable, 1);
        this.U0.setAlpha(0.0f);
        this.U0.setVisibility(0);
        this.U0.n(this.H1, this.d2, j10);
        this.U0.q(this.H1, false);
        AndroidUtilities.runOnUIThread(this.d2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M() {
        t6 t6Var;
        t6 t6Var2;
        t6 t6Var3;
        h9 h9Var;
        t6 t6Var4;
        h9 h9Var2;
        h9 h9Var3;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            t9 t9Var = this.Z0;
            if (t9Var != null && t9Var.L1) {
                t9Var.K1 = false;
                t9Var.z(false, false);
                return false;
            }
            if (this.N1) {
                s5 s5Var = this.L0;
                if (s5Var.o0) {
                    s5Var.o0 = false;
                    s5Var.s0 = SystemClock.elapsedRealtime();
                    s5Var.r0 = true;
                    ((a9) s5Var.a).d(false);
                    s5Var.G.c(false);
                    s5Var.H.c(false);
                    s5Var.I.c(false);
                    s5Var.invalidate();
                    return false;
                }
            } else if (!this.M1 && !t9Var.p()) {
                v8 v8Var = this.a1;
                if (v8Var.J) {
                    v8Var.c(false, true);
                    return false;
                }
                e9 e9Var = this.J0;
                if (e9Var != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = e9Var.D;
                    if (w0Var == null || !w0Var.s()) {
                        f(false);
                        this.j2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    if (e9Var.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    e9Var.x.v(w0Var.L(true));
                    return false;
                }
                if (this.d0 != 0 || (h9Var3 = this.s1) == null || !h9Var3.y0()) {
                    if (this.d0 > -1) {
                        l0(-1, false, true);
                        return false;
                    }
                    if (this.c0 == 0) {
                        ArrayList arrayList = this.x0.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            if (((x) obj).n != null) {
                                this.x0.e();
                                m0(true);
                                return false;
                            }
                        }
                    }
                    if (this.c0 == 1 && (((t6Var2 = this.H1) == null || (!t6Var2.n && !t6Var2.u)) && !this.r0)) {
                        if (t6Var2 != null && t6Var2.g && ((h9Var2 = this.s1) == null || !h9Var2.u0())) {
                            t6 t6Var5 = this.H1;
                            if (!t6Var5.j) {
                            }
                        }
                        h9 h9Var4 = this.s1;
                        if (h9Var4 == null || !h9Var4.y0()) {
                            if (this.s0 == 0 && (((this.I1 && !this.x0.j() && (((h9Var = this.s1) == null || !h9Var.u0()) && ((t6Var4 = this.H1) == null || t6Var4.Z0 == null))) || !this.Y0.h) && (((t6Var3 = this.H1) == null || !t6Var3.g || (!t6Var3.n && !t6Var3.u)) && !this.r0 && (t6Var3 == null || !t6Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.s0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            nh.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            t6 t6Var6 = this.H1;
                            if (t6Var6 != null && !t6Var6.g && !t6Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(t6Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new p8(this, 8));
                            }
                            t6 t6Var7 = this.H1;
                            alertDialog$Builder.k(LocaleController.getString((t6Var7 == null || !t6Var7.c || t6Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new p8(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.show();
                            View d = d2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.j6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
                                d.setBackground(org.telegram.ui.ActionBar.j6.Y(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, bVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.c0 != 2 || (t6Var = this.H1) == null || t6Var.b0) {
                        q(true);
                        return true;
                    }
                    X();
                    K(1, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void N(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            v(false);
            this.L0.setVisibility(8);
            this.S0.setVisibility(8);
            this.N0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.q1.setVisibility(8);
            this.i0.setVisibility(i11 == 1 ? 0 : 8);
            this.Z0.setVisibility(8);
            this.r1.setVisibility(8);
        }
        if (i10 == 1) {
            this.Y0.setVisibility(8);
            this.i0.setVisibility(i11 == 2 ? 0 : 8);
            this.d1.setVisibility(8);
            this.g1.setVisibility(8);
            this.b1.setVisibility(8);
            ImageView imageView = this.f1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.U0.setVisibility(i11 == 2 ? 0 : 8);
            this.W0.setVisibility(8);
            if (i11 != 2) {
                z();
                y();
            }
            this.m0.setVisibility(i11 == 2 ? 0 : 8);
            w();
            this.m1.setAlpha(0.0f);
            this.m1.setVisibility(8);
            this.X0.setVisibility(8);
            this.E1 = null;
            this.F1 = null;
            this.G1 = null;
        }
        if (i11 == 1) {
            t6 t6Var = this.H1;
            if (t6Var == null || !t6Var.n) {
                u();
                H();
            }
            mf0 mf0Var = this.z1;
            if (mf0Var != null) {
                mf0Var.setAllowTouch(false);
            }
            this.U0.x(2, false);
            this.U0.x(3, false);
            this.U0.x(4, false);
            this.U0.x(5, false);
            this.U0.x(7, false);
            t6 t6Var2 = this.H1;
            this.X0.setVisibility((t6Var2 == null || t6Var2.h0 < 30000) ? 8 : 0);
            this.i0.setAlpha(1.0f);
            this.i0.setTranslationY(0.0f);
            t6 t6Var3 = this.H1;
            this.Z0.setVisibility((t6Var3 == null || t6Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.S1) {
            D().setVisibility(0);
            o0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            org.telegram.ui.web.q0 q0Var = D.h;
            if (q0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(q0Var);
            }
            org.telegram.ui.web.q0 q0Var2 = new org.telegram.ui.web.q0(D, 11);
            D.h = q0Var2;
            AndroidUtilities.runOnUIThread(q0Var2, 3500L);
            this.L0.h();
        }
        this.S1 = false;
        mf0 mf0Var2 = this.z1;
        if (mf0Var2 != null) {
            mf0Var2.setAllowTouch(i11 == 1 && ((i12 = this.d0) == -1 || i12 == 1));
        }
        t9 t9Var = this.Z0;
        if (t9Var != null) {
            t9Var.b0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            nh.t6 storiesController = MessagesController.getInstance(i13).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i13).getStoriesController().R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i10, int i11) {
        long j10;
        SpannableStringBuilder append;
        t6 t6Var;
        t6 t6Var2;
        boolean z4;
        t6 t6Var3;
        t6 t6Var4;
        t6 t6Var5;
        w61 textureView;
        t6 t6Var6;
        boolean z10 = true;
        if (i11 == 0) {
            Z(false);
            this.L0.setVisibility(0);
            s5 s5Var = this.L0;
            if (s5Var != null) {
                s5Var.g(false);
            }
            this.N0.setVisibility(0);
            this.S0.setVisibility(0);
            this.S0.setAlpha(0.0f);
            this.G0.a(0L, true);
            t6 t6Var7 = this.H1;
            if (t6Var7 != null) {
                t6Var7.i(false);
                this.H1 = null;
            }
            r9 r9Var = this.x0;
            if (r9Var != null) {
                r9Var.e();
                this.L0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new g8(this, 18));
            o0 o0Var = this.K0;
            if (o0Var != null) {
                o0Var.setVisibility(8);
            }
            this.T0.e(true);
            f3 f3Var = this.i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.b1.setEntry(i11 == 1 ? this.H1 : null);
            if (this.L1 == 1) {
                this.d1.setVisibility(0);
                t6 t6Var8 = this.H1;
                f0(t6Var8 != null && t6Var8.Y, false);
                this.g1.setVisibility(0);
                this.U0.x(-9982, false);
                ((ng0) this.g1.c).a(this.U0.k(), false);
                this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                t6 t6Var9 = this.H1;
                if (t6Var9 == null || TextUtils.isEmpty(t6Var9.y)) {
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.d1.setVisibility(8);
                    this.g1.setVisibility(0);
                    ((ng0) this.g1.c).a(true, false);
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.b1.setVisibility(0);
            t6 t6Var10 = this.H1;
            if (t6Var10 == null || !t6Var10.u) {
                ImageView imageView = this.f1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                G().setVisibility(0);
                o0(false);
            }
            this.Y0.setVisibility(0);
            this.U0.setVisibility(0);
            t6 t6Var11 = this.H1;
            this.Z0.setVisibility(((t6Var11 == null || t6Var11.J0 == 0) && this.s0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V0.getLayoutParams();
            t6 t6Var12 = this.H1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((t6Var12 == null || t6Var12.J0 == 0) && this.s0 == 0) ? 68.0f : 12.0f);
            this.V0.setLayoutParams(layoutParams);
            this.i0.setVisibility(0);
            this.i0.clearFocus();
            t6 t6Var13 = this.H1;
            this.Z0.A(t6Var13 == null ? 86400 : t6Var13.I0, false);
            this.Z0.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((t6Var = this.H1) == null || !t6Var.g));
            t6 t6Var14 = this.H1;
            this.Z0.setHasRoundVideo((t6Var14 == null || t6Var14.o0 == null) ? false : true);
            t9 t9Var = this.Z0;
            if (t9Var == null) {
                j10 = 0;
            } else {
                t6 t6Var15 = this.H1;
                if (t6Var15 == null || !t6Var15.n) {
                    j10 = 0;
                    t9Var.v(null, null);
                } else {
                    TLRPC.Peer peer = t6Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        t6 t6Var16 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        t6Var16.p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        t6 t6Var17 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        t6Var17.p = append;
                    }
                    String str2 = this.H1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new b9(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.Z0.v(str3, append);
                }
            }
            t6 t6Var18 = this.H1;
            boolean z11 = (t6Var18 != null && t6Var18.v() && this.H1.t()) ? false : true;
            oa oaVar = this.W0;
            boolean z12 = oaVar.g0;
            oaVar.g0 = z11;
            oaVar.f0.f(z11, true);
            oaVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.m0.setVisibility(0);
            this.q1.setVisibility(0);
            t6 t6Var19 = this.H1;
            if (t6Var19 != null && t6Var19.b0) {
                this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.i0.setVisibility(0);
            this.r1.setVisibility(0);
        }
        if (i11 == 2) {
            this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.K1 = false;
            t6 t6Var20 = this.H1;
            boolean z13 = (t6Var20 == null || t6Var20.J0 == j10) ? false : true;
            boolean z14 = t6Var20 != null && t6Var20.g;
            String string = LocaleController.getString(z14 ? R.string.Done : z13 ? R.string.UploadBotPreview : R.string.Next);
            boolean z15 = !z13;
            f5 f5Var = this.Y0;
            if (!TextUtils.equals(string, f5Var.d) || z15 != f5Var.e) {
                f5Var.removeView(f5Var.c);
                Context context = f5Var.getContext();
                f5Var.d = string;
                f5Var.e = z15;
                e5 e5Var = new e5(f5Var, context, string, z15);
                f5Var.c = e5Var;
                e5Var.setContentDescription(string);
                f5Var.addView(f5Var.c, k7.b6.c(-2.0f, -2));
                f5Var.e();
            }
            this.q1.setVisibility(8);
            this.r1.setVisibility(8);
            if (!this.e2) {
                t6 t6Var21 = this.H1;
                if (t6Var21 == null || !t6Var21.u) {
                    this.U0.set(t6Var21);
                } else {
                    this.U0.l(t6Var21);
                }
            }
            this.e2 = false;
            this.Z0.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new g8(this, 19));
            this.a1.setVisibility(this.E1 == null ? 8 : 0);
            ArrayList arrayList = this.E1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.G1;
                ArrayList arrayList3 = this.F1;
                v8 v8Var = this.a1;
                v8Var.c(false, false);
                v8Var.c = arrayList;
                v8Var.d = arrayList2;
                v8Var.e = arrayList3;
                v8Var.w = new k01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                v8Var.H = new k01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                v8Var.b.V2.N(false);
                this.a1.setSelected(this.E1.indexOf(this.H1));
            }
            this.W0.setMaxCount((z13 || z14 || this.E1 != null || ((t6Var6 = this.H1) != null && (t6Var6.v() || !this.H1.K))) ? 1 : 3);
            if (i10 != 2) {
                t6 t6Var22 = this.H1;
                if (t6Var22 != null && (t6Var22.c || t6Var22.g || this.r0)) {
                    if (t6Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    t6 t6Var23 = this.H1;
                    if (t6Var23.K && t6Var23.a1 != null && (textureView = this.U0.getTextureView()) != null) {
                        textureView.setDelegate(new p8(this, 7));
                    }
                    this.Z0.setText(this.H1.C0);
                } else if (i10 != 2) {
                    t9 t9Var2 = this.Z0;
                    t9Var2.S = true;
                    t9Var2.f.setText("");
                }
            }
            t6 t6Var24 = this.H1;
            this.Y0.d(4, t6Var24 == null || ((!t6Var24.u || t6Var24.K) && !t6Var24.v()));
            this.Y0.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (t6Var5 = this.H1) == null || t6Var5.u || t6Var5.v()) ? false : true);
            if (!this.K1 && !this.Z0.o()) {
                nh.t6 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                nh.n6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, B) || ((t6Var4 = this.H1) != null && (t6Var4.g || t6Var4.J0 != j10))) {
                    z4 = true;
                    this.Y0.setShareEnabled(z4);
                    t6 t6Var25 = this.H1;
                    this.d1.setImageResource((t6Var25 == null && t6Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.U0.setVisibility(0);
                    this.W0.setVisibility(0);
                    this.m0.setVisibility(0);
                    this.m0.setTranslationX(0.0f);
                    t6Var3 = this.H1;
                    if (t6Var3 == null && t6Var3.J0 != j10) {
                        this.m0.l("", false);
                    } else if (t6Var3 == null && t6Var3.g) {
                        this.m0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (t6Var3 == null && t6Var3.u) {
                        this.m0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (t6Var3 == null && t6Var3.n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(this.m0, 32.0f, i12);
                        this.m0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(k5Var, 0, 1, 33);
                        if (this.H1.q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.H1.q.user_id));
                            k5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.H1.q)));
                            k5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) (chat2 != null ? chat2.title : ""));
                        }
                        this.m0.l(spannableStringBuilder, false);
                    } else {
                        this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z10 = true;
                }
            }
            z4 = false;
            this.Y0.setShareEnabled(z4);
            t6 t6Var252 = this.H1;
            this.d1.setImageResource((t6Var252 == null && t6Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.U0.setVisibility(0);
            this.W0.setVisibility(0);
            this.m0.setVisibility(0);
            this.m0.setTranslationX(0.0f);
            t6Var3 = this.H1;
            if (t6Var3 == null) {
            }
            if (t6Var3 == null) {
            }
            if (t6Var3 == null) {
            }
            if (t6Var3 == null) {
            }
            this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z10 = true;
        }
        if (i10 == z10) {
            t9 t9Var3 = this.Z0;
            p70 p70Var = t9Var3.S0;
            if (p70Var != null) {
                p70Var.u();
                t9Var3.S0 = null;
            }
            this.h1.e(z10);
            v8 v8Var2 = this.a1;
            if (v8Var2.J) {
                v8Var2.c(false, z10);
            }
        }
        if (i11 == 2 && (t6Var2 = this.H1) != null) {
            if (t6Var2.e0 < j10) {
                t6Var2.e0 = j10;
            }
            this.J1 = t6Var2.e0;
            long duration = this.U0.getDuration() < 100 ? this.H1.h0 : this.U0.getDuration();
            t6 t6Var26 = this.H1;
            if (t6Var26.h0 <= 0) {
                t6Var26.h0 = duration;
            }
            File file = t6Var26.Z0;
            if (file == null) {
                file = t6Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            t6 t6Var27 = this.H1;
            this.q1.o(false, absolutePath, t6Var27.h0, t6Var27.P);
            t6 t6Var28 = this.H1;
            float f10 = duration;
            long j11 = (long) (t6Var28.Z * f10);
            long j12 = (long) (t6Var28.a0 * f10);
            oa oaVar2 = this.q1;
            oaVar2.W0 = j11;
            oaVar2.X0 = j12;
            ja jaVar = oaVar2.h;
            if (jaVar != null) {
                ja.a(jaVar, true);
            }
            d4 d4Var = new d4(this, 3);
            this.q1.setDelegate(new f9(d4Var));
            float max = (this.J1 / Math.max(1L, duration)) * 0.96f;
            this.q1.setVideoLeft(max);
            this.q1.setVideoRight(0.04f + max);
            d4Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        mf0 mf0Var = this.z1;
        if (mf0Var != null) {
            mf0Var.setAllowTouch(false);
        }
        f3 f3Var2 = this.j1;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
        ic.e();
        t9 t9Var4 = this.Z0;
        if (t9Var4 != null) {
            f fVar = t9Var4.f;
            fVar.d();
            fVar.k(true);
            this.Z0.b0 = true;
        }
        s9 s9Var = this.U0;
        if (s9Var != null) {
            s9Var.x(8, i11 != 1);
        }
        h9 h9Var = this.s1;
        if (h9Var != null) {
            h9Var.setCoverPreview(i11 != 1);
        }
        f3 f3Var3 = this.k1;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        r9 r9Var2 = this.x0;
        r9Var2.setPreview(i11 == 1 && r9Var2.j());
    }

    public final void P() {
        cg.n1 n1Var;
        boolean z4 = false;
        if (this.c0 == 0) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.u2 = new g8(this, 3);
            }
        }
        t9 t9Var = this.Z0;
        if (t9Var != null) {
            t9Var.f.s();
        }
        s5 s5Var = this.L0;
        if (s5Var != null) {
            s5Var.h();
        }
        g5 g5Var = this.l1;
        if (g5Var != null) {
            nh.t6 storiesController = MessagesController.getInstance(g5Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            g5Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            g5Var.c.invalidate();
        }
        h9 h9Var = this.s1;
        if (h9Var != null && (n1Var = h9Var.L0.d) != null) {
            n1Var.postRunnable(n1Var.w);
        }
        s9 s9Var = this.U0;
        if (s9Var != null) {
            s9Var.x(0, false);
        }
        t0 t0Var = MessagesController.getInstance(this.c).getStoriesController().w;
        if (t0Var.c || t0Var.d) {
            return;
        }
        t0Var.d = true;
        q0 q0Var = new q0(t0Var, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(t0Var.a);
        messagesStorage.getStorageQueue().postRunnable(new cr0(messagesStorage, z4, q0Var, 8));
    }

    public final void Q(int i10, int i11) {
        h9 h9Var;
        n9 n9Var;
        o9 o9Var;
        h9 h9Var2;
        if (i11 == 0) {
            this.k0.setVisibility(8);
        }
        if (i10 == 0 && (h9Var2 = this.s1) != null) {
            h9Var2.setVisibility(8);
        }
        if (i10 == -1) {
            this.Z0.setVisibility(8);
            this.d1.setVisibility(i11 == 2 ? 0 : 8);
            this.g1.setVisibility(i11 == 2 ? 0 : 8);
            this.b1.setVisibility(i11 == 2 ? 0 : 8);
            ImageView imageView = this.f1;
            if (imageView != null) {
                imageView.setVisibility(i11 == 2 ? 0 : 8);
            }
            this.W0.setVisibility(i11 == 2 ? 0 : 8);
            this.m0.setVisibility(8);
        }
        boolean z4 = true;
        this.U0.setAllowCropping(i11 == -1);
        if ((i11 == 0 || i10 == 0) && (h9Var = this.s1) != null) {
            h9Var.a1.setLayerType(0, null);
        }
        mf0 mf0Var = this.z1;
        if (mf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z4 = false;
            }
            mf0Var.setAllowTouch(z4);
        }
        if (i11 == 3) {
            n9 n9Var2 = this.o1;
            if (n9Var2 != null) {
                n9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (n9Var = this.o1) != null) {
            n9Var.setVisibility(8);
            this.o1.setAppearProgress(0.0f);
            n9 n9Var3 = this.o1;
            n9Var3.x = null;
            a0 a0Var = n9Var3.f;
            a0Var.I = null;
            a0Var.d = null;
            a0Var.G = false;
            n9Var3.d.setVisibility(8);
            n9Var3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            o9 o9Var2 = this.p1;
            if (o9Var2 != null) {
                o9Var2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (o9Var = this.p1) == null) {
            return;
        }
        o9Var.setVisibility(8);
        this.p1.setAppearProgress(0.0f);
        o9 o9Var3 = this.p1;
        o9Var3.b = null;
        a0 a0Var2 = o9Var3.h;
        a0Var2.I = null;
        a0Var2.d = null;
        a0Var2.G = false;
        o9Var3.e.setVisibility(8);
        o9Var3.setVisibility(8);
    }

    public final void R(x9 x9Var) {
        nh.n6 o10;
        ca caVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        int i11 = 0;
        this.r0 = false;
        this.e = false;
        this.y2 = false;
        this.p0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (caVar = this.n) != null && caVar.getParent() == null) {
            ca caVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, caVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.x0.setCameraThumb(A());
        if (this.s0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.E;
        if (x9Var != null) {
            this.C = x9Var;
            this.G = x9Var.a;
            rectF.set(x9Var.c);
            this.D = x9Var.b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i12 = this.G;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.e0.setBackgroundColor(i11);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        g(1.0f, true, new g8(this, 6));
        e();
        this.s0 = 0L;
        this.t0 = "";
    }

    public final void S(w9 w9Var, t6 t6Var, long j10) {
        ca caVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        this.r0 = false;
        this.e = false;
        this.y2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (caVar = this.n) != null && caVar.getParent() == null) {
            ca caVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, caVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.H1 = t6Var;
        this.L1 = t6Var.K ? 1 : 0;
        this.p0.g = false;
        RectF rectF = this.E;
        if (w9Var != null) {
            this.C = w9Var;
            this.G = w9Var.a;
            rectF.set(w9Var.c);
            this.D = w9Var.b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i11 = this.G;
        this.e0.setBackgroundColor((i11 == 1 || i11 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        t6 t6Var2 = this.H1;
        if (t6Var2 != null) {
            this.Z0.setText(t6Var2.C0);
        }
        L(new u8(this, 0), j10);
        K(this.H1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.Y0.b(false, false);
        e();
        this.s0 = 0L;
        this.t0 = "";
    }

    public final void T() {
        p70 p70Var;
        s9 s9Var = this.U0;
        if (s9Var != null) {
            s9Var.x(4, true);
        }
        t9 t9Var = this.Z0;
        if (t9Var != null && (p70Var = t9Var.S0) != null) {
            p70Var.u();
            t9Var.S0 = null;
        }
        eg.o1 o1Var = new eg.o1((org.telegram.ui.ActionBar.p2) new j9(this, 1), 14, false);
        o1Var.setOnDismissListener(new t8(this, 1));
        o1Var.show();
    }

    public final void U(w9 w9Var, t6 t6Var) {
        nh.n6 o10;
        ca caVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        this.r0 = true;
        this.e = false;
        this.y2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (caVar = this.n) != null && caVar.getParent() == null) {
            ca caVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, caVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.H1 = t6Var;
        f8.a(i10, t6Var);
        t6 t6Var2 = this.H1;
        int i11 = (t6Var2 == null || !t6Var2.K) ? 0 : 1;
        this.L1 = i11;
        this.p0.g = t6Var2 != null && t6Var2.u && i11 == 1;
        if (this.s0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.E;
        if (w9Var != null) {
            this.C = w9Var;
            this.G = w9Var.a;
            rectF.set(w9Var.c);
            this.D = w9Var.b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i12 = this.G;
        this.e0.setBackgroundColor((i12 == 1 || i12 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        t6 t6Var3 = this.H1;
        if (t6Var3 != null) {
            this.Z0.setText(t6Var3.C0);
        }
        this.Y0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new g8(this, 6));
        e();
        this.s0 = 0L;
        this.t0 = "";
    }

    public final void V() {
        cg.p1 p1Var = this.t1;
        if (p1Var != null) {
            p1Var.bringToFront();
        }
        View view = this.u1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.v1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.w1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.x1;
        if (view4 != null) {
            view4.bringToFront();
        }
        ra raVar = this.m1;
        if (raVar != null) {
            raVar.bringToFront();
        }
        mf0 mf0Var = this.z1;
        if (mf0Var != null) {
            mf0Var.bringToFront();
        }
        df0 df0Var = this.B1;
        if (df0Var != null) {
            df0Var.bringToFront();
        }
        ff0 ff0Var = this.C1;
        if (ff0Var != null) {
            ff0Var.bringToFront();
        }
        g5 g5Var = this.l1;
        if (g5Var != null) {
            g5Var.bringToFront();
        }
        n nVar = this.n1;
        if (nVar != null) {
            nVar.bringToFront();
        }
    }

    public final void W(t6 t6Var, boolean z4) {
        t6 t6Var2;
        boolean z10;
        if (t6Var == null || this.U0.getWidth() <= 0 || this.U0.getHeight() <= 0) {
            return;
        }
        File file = z4 ? t6Var.O0 : t6Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.x0.j() ? this.x0 : this.U0;
        float f10 = z4 ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f10);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f10), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f10, f10);
        AndroidUtilities.makingGlobalBlurBitmap = true;
        view.draw(canvas);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        canvas.restore();
        Paint paint = new Paint(2);
        w61 textureView = this.U0.getTextureView();
        if (t6Var.K && !t6Var.u && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f10, f10);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = t6Var.Q0;
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
                FileLog.e(e);
            }
        }
        File file3 = t6Var.P0;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        h9 h9Var = this.s1;
        if (h9Var != null && h9Var.O0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            h9 h9Var2 = this.s1;
            h9Var2.F0 = true;
            w4 w4Var = h9Var2.O0;
            w4Var.a = true;
            w4Var.draw(canvas);
            h9 h9Var3 = this.s1;
            h9Var3.O0.a = false;
            h9Var3.F0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = t6.w(this.c, "jpg");
        if (z4) {
            t6Var2 = t6Var;
            z10 = z4;
            Utilities.searchQueue.postRunnable(new gg.j(this, createBitmap, z10, w10, t6Var2, 21));
        } else {
            t6Var2 = t6Var;
            z10 = z4;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z10 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (!z10) {
            t6Var2.N0 = w10;
        }
        t6Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        nh.n6 o10;
        char c3;
        e8 e8Var = this.n0;
        BitmapDrawable bitmapDrawable = null;
        if (e8Var != null) {
            e8Var.dismiss();
            this.n0 = null;
        }
        if (this.K1) {
            n0 n0Var = this.b1;
            n0Var.getClass();
            n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            e5 e5Var = this.Y0.c;
            int i10 = -this.R1;
            this.R1 = i10;
            AndroidUtilities.shakeViewSpring(e5Var, i10);
            return;
        }
        t9 t9Var = this.Z0;
        if (t9Var != null && t9Var.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.k6 k6Var = t9Var.v;
            int i11 = -this.R1;
            this.R1 = i11;
            AndroidUtilities.shakeViewSpring(k6Var, i11);
            t9Var.e();
            return;
        }
        t6 t6Var = this.H1;
        int i12 = this.c;
        int i13 = 0;
        if ((t6Var == null || (!t6Var.g && t6Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.H1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        nh.b bVar = this.a;
        if (t9Var != null && !this.H1.D0) {
            CharSequence text = t9Var.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((t01[]) spannable.getSpans(0, text.length(), t01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new qc(this.n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new g8(this, 27), bVar)).k(true);
                    int i14 = -this.R1;
                    this.R1 = i14;
                    AndroidUtilities.shakeViewSpring(t9Var, i14);
                    return;
                }
            }
        }
        t6 t6Var2 = this.H1;
        if (t6Var2.g || t6Var2.J0 != 0) {
            t6Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.K != 0) {
            t6Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.K);
        }
        s9 s9Var = this.U0;
        s9Var.x(3, true);
        e8 e8Var2 = new e8(this.b, this.H1.I0, bVar);
        e8Var2.q1(this.H1.E0);
        e8Var2.p1(this.H1.v0);
        e8Var2.C = this.J;
        e8Var2.R = new h8(this, 14);
        e8Var2.e1(!this.x0.j());
        ArrayList arrayList = this.F1;
        e8Var2.m1(arrayList == null ? this.H1.r() : arrayList.size());
        e8Var2.k1(false);
        CharSequence text2 = t9Var.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (p51 p51Var : (p51[]) ((Spanned) text2).getSpans(0, text2.length(), p51.class)) {
                if (p51Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(p51Var.getURL())));
                        if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                            arrayList2.add(UserObject.getPublicUsername(user));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i15 = -1;
            for (int i16 = 0; i16 < text2.length(); i16++) {
                char charAt = text2.charAt(i16);
                if (charAt == '@') {
                    i15 = i16 + 1;
                } else if (charAt == ' ') {
                    if (i15 != -1) {
                        String charSequence = text2.subSequence(i15, i16).toString();
                        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(charSequence);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) userOrChat;
                            if (!user2.bot && !UserObject.isUserSelf(user2) && user2.id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i15 = -1;
                }
            }
            c3 = 1;
            if (i15 != -1) {
                String charSequence2 = text2.subSequence(i15, text2.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                if (userOrChat2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) userOrChat2;
                    if (!user3.bot && !UserObject.isUserSelf(user3) && user3.id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                        arrayList2.add(charSequence2);
                    }
                }
            }
        } else {
            c3 = 1;
        }
        e8Var2.P = arrayList2;
        e8Var2.T = new h8(this, 15);
        e8Var2.U = new h8(this, 16);
        e8Var2.Q = new p8(this, 10);
        this.n0 = e8Var2;
        t6 t6Var3 = this.H1;
        if (t6Var3.K) {
            if (s9Var != null && !t6Var3.f0 && this.c0 != 2) {
                t6Var3.e0 = s9Var.getCurrentPosition();
                h8 h8Var = new h8(this, 17);
                cg.p1 p1Var = this.t1;
                View view = this.w1;
                View[] viewArr = new View[3];
                viewArr[0] = s9Var;
                viewArr[c3] = p1Var;
                viewArr[2] = view;
                s9Var.h(h8Var, viewArr);
            }
            e8 e8Var3 = this.n0;
            Bitmap bitmap = this.H1.g0;
            g8 g8Var = new g8(this, 20);
            if (bitmap != null) {
                e8Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            e8Var3.Y = bitmapDrawable;
            e8Var3.Z = g8Var;
            gk gkVar = e8Var3.b;
            if (gkVar != null) {
                for (View view2 : gkVar.getViewPages()) {
                    if (view2 instanceof y7) {
                        y7 y7Var = (y7) view2;
                        y7Var.g(false);
                        y7Var.e(false);
                    }
                }
            }
        }
        this.n0.setOnDismissListener(new t8(this, i13));
        this.n0.show();
    }

    public final void Y(y9 y9Var) {
        int i10 = 0;
        RectF rectF = this.E;
        if (y9Var != null) {
            this.C = y9Var;
            this.G = y9Var.a;
            rectF.set(y9Var.c);
            this.D = y9Var.b;
        } else {
            this.C = null;
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        int i11 = this.G;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.e0.setBackgroundColor(i10);
    }

    public final void Z(boolean z4) {
        Activity activity;
        if (!this.t2 || z4) {
            this.p2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.b) != null) {
                boolean z10 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.p2 = z10;
                if (z10) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    mq mqVar = new mq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    mqVar.e = dp;
                    mqVar.f = dp2;
                    this.x0.setCameraThumb(mqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p8(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.t2 = true;
                }
            }
            if (this.p2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                r();
            } else {
                CameraController.getInstance().initCamera(new g8(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        i9 i9Var = this.y0;
        if (i9Var == null || i9Var.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new m71(this, this.y0.getTextureView().getBitmap(), runnable, 19));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z4, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
            view.animate().alpha(z4 ? 1.0f : 0.0f).setUpdateListener(new g9(this, 1)).setListener(new androidx.fragment.app.g(this, z4, view, 13)).setDuration(320L).setInterpolator(mr.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z4 ? 0 : 8);
            view.setAlpha(z4 ? 1.0f : 0.0f);
            n0();
        }
    }

    public final void d0(boolean z4) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z4) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f.updateViewLayout(this.n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nh.n6 o10;
        t6 t6Var;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            s5 s5Var = this.L0;
            if (s5Var != null) {
                s5Var.h();
            }
            if (this.j2 == null || MediaController.allMediaAlbums == null) {
                return;
            }
            for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                int i13 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.j2;
                if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.j2 = albumEntry;
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesDraftsUpdated) {
            s5 s5Var2 = this.L0;
            if (s5Var2 == null || this.S1) {
                return;
            }
            s5Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.c0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                    t6 t6Var2 = this.H1;
                    if (t6Var2 == null || t6Var2.J0 == 0) {
                        h0(o10, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.K1 && !this.Z0.o()) {
                nh.t6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int B = B();
                nh.n6 o11 = storiesController.o();
                if (o11 == null || !o11.a(storiesController.a, B) || ((t6Var = this.H1) != null && (t6Var.g || t6Var.J0 != 0))) {
                    z4 = true;
                }
            }
            this.Y0.setShareEnabled(z4);
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.B0.clearAnimation();
        i9 i9Var = this.y0;
        if ((i9Var != null && i9Var.isDual()) || this.X1) {
            str = null;
        }
        this.V1 = str;
        boolean z4 = false;
        if (str == null) {
            c0(this.B0, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                i10 = R.drawable.media_photo_flash_auto2;
                this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i10 = R.drawable.media_photo_flash_on2;
                this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        pa paVar = this.B0;
        if (paVar.n != i10) {
            paVar.n = i10;
            ValueAnimator valueAnimator = paVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                paVar.r = null;
            }
            paVar.setDrawable(i10);
        }
        if (this.c0 == 0 && !this.F0.e && this.V1 != null && !I()) {
            z4 = true;
        }
        c0(this.B0, z4, true);
    }

    public final void f(boolean z4) {
        o0 o0Var;
        this.H0 = z4;
        Boolean bool = this.m2;
        if (bool == null || bool.booleanValue() != z4) {
            int i10 = 0;
            if (this.J0 == null) {
                if (z4) {
                    t(false);
                }
                if (this.J0 == null) {
                    return;
                }
            }
            if (this.J0.R) {
                this.n2 = new q8(this, z4, 0);
                return;
            }
            ValueAnimator valueAnimator = this.k2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.k2 = null;
            }
            o1.j jVar = this.l2;
            if (jVar != null) {
                jVar.c();
                this.l2 = null;
            }
            if (this.J0 == null) {
                if (z4) {
                    t(false);
                }
                if (this.J0 == null) {
                    return;
                }
            }
            e9 e9Var = this.J0;
            if (e9Var != null) {
                e9Var.H = false;
            }
            if (z4 && (o0Var = this.K0) != null) {
                o0Var.a(false);
            }
            v9 v9Var = this.r;
            if (v9Var != null) {
                v9Var.setImportantForAccessibility(z4 ? 4 : 0);
            }
            this.J0.setImportantForAccessibility(z4 ? 0 : 4);
            this.m2 = Boolean.valueOf(z4);
            float translationY = this.J0.getTranslationY();
            ca caVar = this.n;
            float height = z4 ? 0.0f : (caVar.getHeight() - this.J0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, caVar.getHeight());
            e9 e9Var2 = this.J0;
            e9Var2.H = !z4;
            this.h2 = this.g2 == null;
            if (z4) {
                o1.j jVar2 = new o1.j(e9Var2, o1.h.n, height);
                this.l2 = jVar2;
                jVar2.u.a(0.75f);
                this.l2.u.b(350.0f);
                this.l2.a(new jg0(this, height, i11));
                this.l2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.k2 = ofFloat;
                ofFloat.addUpdateListener(new r8(this, i10));
                this.k2.addListener(new d9(this, i11));
                this.k2.setDuration(450L);
                this.k2.setInterpolator(mr.h);
                this.k2.start();
            }
            if (!z4 && !this.P1) {
                this.i2 = null;
            }
            if (z4 || this.c0 != 0 || this.p2) {
                return;
            }
            r();
        }
    }

    public final void f0(boolean z4, boolean z10) {
        if (this.c1 == null) {
            gj0 gj0Var = new gj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.c1 = gj0Var;
            gj0Var.C *= 1.5f;
        }
        this.d1.setAnimation(this.c1);
        if (!z10) {
            this.c1.L(z4 ? 20 : 0, false, false);
            return;
        }
        if (z4) {
            gj0 gj0Var2 = this.c1;
            if (gj0Var2.Y > 20) {
                gj0Var2.L(0, false, false);
            }
            this.c1.N(20);
            this.c1.start();
            return;
        }
        gj0 gj0Var3 = this.c1;
        int i10 = gj0Var3.Y;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        gj0Var3.N(43);
        this.c1.start();
    }

    public final void g(float f10, boolean z4, Runnable runnable) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        v9 v9Var = this.r;
        if (!z4) {
            this.I = null;
            this.F = f10;
            k();
            v9Var.invalidate();
            this.n.invalidate();
            runnable.run();
            o();
            return;
        }
        this.M.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.I = Float.valueOf(this.H);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new r8(this, 5));
        this.B.addListener(new lh.k5(this, f10, runnable, 4));
        if (f10 < 1.0f && this.v) {
            this.B.setDuration(250L);
            this.B.setInterpolator(mr.h);
        } else if (f10 > 0.0f || v9Var.a < AndroidUtilities.dp(20.0f)) {
            this.B.setDuration(300L);
            this.B.setInterpolator(new u1.a());
        } else if (f10 >= 0.0f || !this.L) {
            this.B.setDuration(400L);
            this.B.setInterpolator(mr.h);
        } else {
            this.B.setDuration(200L);
            this.B.setInterpolator(mr.h);
            this.L = false;
        }
        this.B.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 4));
        }
    }

    public final void h(boolean z4, boolean z10) {
        u uVar;
        if (z4) {
            f3 f3Var = this.i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            f3 f3Var2 = this.j1;
            if (f3Var2 != null) {
                f3Var2.e(true);
            }
            f3 f3Var3 = this.h1;
            if (f3Var3 != null) {
                f3Var3.e(true);
            }
            f3 f3Var4 = this.T0;
            if (f3Var4 != null) {
                f3Var4.e(true);
            }
        }
        if (this.X1 == z4 && this.Y1 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.W1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.W1 = null;
        }
        this.X1 = z4;
        this.Y1 = I();
        if (z4 && (uVar = this.F0) != null && uVar.e) {
            uVar.a(false, z10);
        }
        m0(z10);
        w8 w8Var = this.N0;
        e3 e3Var = this.R0;
        e3 e3Var2 = this.Q0;
        if (!z10) {
            e3Var2.setAlpha((z4 && this.c0 == 0 && !I()) ? 1.0f : 0.0f);
            e3Var2.setTranslationY((z4 && this.c0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            e3Var.setAlpha((!z4 && this.c0 == 0 && I()) ? 0.6f : 0.0f);
            e3Var.setTranslationY((!z4 && this.c0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            w8Var.setAlpha((z4 || this.c0 != 0 || I()) ? 0.0f : 1.0f);
            w8Var.setTranslationY((z4 || this.c0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e3Var2, (Property<e3, Float>) property, (z4 && this.c0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(e3Var2, (Property<e3, Float>) property2, (z4 && this.c0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property, (!z4 && this.c0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property2, (!z4 && this.c0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(w8Var, (Property<w8, Float>) property, (z4 || this.c0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(w8Var, (Property<w8, Float>) property2, (z4 || this.c0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.W1.setDuration(260L);
        this.W1.setInterpolator(mr.h);
        this.W1.start();
    }

    public final void h0(nh.n6 n6Var, boolean z4) {
        if (this.w2) {
            return;
        }
        k9 k9Var = new k9(n6Var.b(), this.c, this.b, new j9(this, 0), null);
        k9Var.U = B();
        k9Var.setOnDismissListener(new e80(2, this, z4));
        this.U0.x(7, true);
        this.w2 = true;
        k9Var.show();
    }

    public final void i(Runnable runnable) {
        t6 t6Var;
        Runnable runnable2;
        s9 s9Var;
        of0 of0Var = this.y1;
        if (of0Var == null || (t6Var = this.H1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        t6Var.j = of0Var.d() | t6Var.j;
        t6 t6Var2 = this.H1;
        of0 of0Var2 = this.y1;
        File file = t6Var2.Z0;
        if (file != null) {
            file.delete();
            t6Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = of0Var2.getSavedFilterState();
        t6Var2.a1 = savedFilterState;
        if (t6Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = of0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = t6Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, t6Var2.k0 / 2.0f, t6Var2.l0 / 2.0f);
                    matrix.postRotate(-t6Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    t6Var2.n0.preScale(t6Var2.k0 / createBitmap.getWidth(), t6Var2.l0 / createBitmap.getHeight());
                    t6Var2.k0 = createBitmap.getWidth();
                    t6Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = t6Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        t6Var2.Z0.delete();
                    }
                    String k10 = t6.k(t6Var2.L);
                    boolean z4 = "png".equals(k10) || "webp".equals(k10);
                    t6Var2.Z0 = t6.w(t6Var2.a, z4 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z4 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(t6Var2.Z0));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new cg.u0(t6Var2, createBitmap, z4, runnable2, 26));
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
            t6 t6Var3 = this.H1;
            if (t6Var3.K || (s9Var = this.U0) == null) {
                return;
            }
            s9Var.set(t6Var3);
        }
    }

    public final void i0(boolean z4, boolean z10) {
        if (this.a2 == z4) {
            return;
        }
        this.a2 = z4;
        if (z10) {
            this.G0.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(mr.h).withEndAction(new q8(this, z4, 1)).start();
            return;
        }
        this.G0.clearAnimation();
        this.G0.setAlpha(z4 ? 1.0f : 0.0f);
        if (z4) {
            return;
        }
        this.G0.b(false, false);
    }

    public final void j() {
        if (this.H1 == null || this.A1 == null || this.e0.getMeasuredWidth() <= 0 || this.e0.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.H1.Q != 0) {
            matrix.postRotate(-r1, this.e0.getMeasuredWidth() / 2.0f, this.e0.getMeasuredHeight() / 2.0f);
            if ((this.H1.Q / 90) % 2 == 1) {
                matrix.postScale(this.e0.getMeasuredWidth() / this.e0.getMeasuredHeight(), this.e0.getMeasuredHeight() / this.e0.getMeasuredWidth(), this.e0.getMeasuredWidth() / 2.0f, this.e0.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / this.e0.getMeasuredWidth()) * this.H1.k0, (1.0f / this.e0.getMeasuredHeight()) * this.H1.l0);
        matrix.postConcat(this.H1.n0);
        matrix.postScale(this.e0.getMeasuredWidth() / this.H1.i0, this.e0.getMeasuredHeight() / this.H1.j0);
        this.A1.setTransform(matrix);
        this.A1.invalidate();
    }

    public final void j0(boolean z4) {
        h91 h91Var = this.S0;
        if ((h91Var.getTag() != null && z4) || (h91Var.getTag() == null && !z4)) {
            if (z4) {
                Runnable runnable = this.b2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                g8 g8Var = new g8(this, 25);
                this.b2 = g8Var;
                AndroidUtilities.runOnUIThread(g8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.c2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        h91Var.setTag(z4 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z4) {
            h91Var.setVisibility(0);
        }
        this.c2.playTogether(ObjectAnimator.ofFloat(h91Var, (Property<h91, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        this.c2.addListener(new s61(13, this, z4));
        this.c2.start();
        if (z4) {
            g8 g8Var2 = new g8(this, 26);
            this.b2 = g8Var2;
            AndroidUtilities.runOnUIThread(g8Var2, 2000L);
        }
    }

    public final void k() {
        nh.i3 i3Var;
        if (this.G != 1) {
            return;
        }
        float left = this.e0.getLeft();
        float top = this.e0.getTop();
        float measuredWidth = this.e0.getMeasuredWidth();
        float measuredHeight = this.e0.getMeasuredHeight();
        RectF rectF = this.a0;
        rectF.set(left, top, measuredWidth, measuredHeight);
        rectF.offset(this.r.getX(), this.r.getY());
        float f10 = this.F;
        RectF rectF2 = this.E;
        RectF rectF3 = this.Z;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        this.e0.setAlpha(this.F);
        float f11 = rectF3.left;
        this.e0.setTranslationX((f11 - r3.getLeft()) - this.r.getX());
        float f12 = rectF3.top;
        this.e0.setTranslationY((f12 - r3.getTop()) - this.r.getY());
        y9 y9Var = this.C;
        if (y9Var != null && (i3Var = y9Var.f) != null) {
            i3Var.setTranslationX((rectF.left - rectF2.left) * this.F);
            this.C.f.setTranslationY((rectF.top - rectF2.top) * this.F);
        }
        this.e0.setScaleX(rectF3.width() / this.e0.getMeasuredWidth());
        this.e0.setScaleY(rectF3.height() / this.e0.getMeasuredHeight());
        this.f0.setAlpha(this.F);
        this.h0.setAlpha(this.F);
        this.i0.setAlpha(this.F);
        if (this.c0 == 2) {
            this.r1.setAlpha(this.F);
        }
    }

    public final void k0() {
        e8 e8Var = this.n0;
        if (e8Var != null) {
            e8Var.dismiss();
            this.n0 = null;
        }
        e8 e8Var2 = new e8(this.b, 86400, this.a);
        e8Var2.o1();
        e8Var2.q1(this.v0);
        TLRPC.InputPeer inputPeer = this.u0;
        if (inputPeer == null) {
            inputPeer = this.K != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.K) : new TLRPC.TL_inputPeerSelf();
        }
        e8Var2.p1(inputPeer);
        e8Var2.C = this.J;
        e8Var2.R = new h8(this, 18);
        e8Var2.e1(false);
        e8Var2.m1(1);
        e8Var2.k1(false);
        e8Var2.T = new h8(this, 19);
        e8Var2.Q = new p8(this, 12);
        this.n0 = e8Var2;
        e8Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        t6 t6Var;
        ImageReceiver photoImage;
        if (this.s1 == null || (t6Var = this.H1) == null) {
            return;
        }
        t6Var.f();
        this.H1.j |= this.s1.u0();
        t6 t6Var2 = this.H1;
        ArrayList arrayList = t6Var2.T0;
        if (arrayList == null) {
            t6Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        h9 h9Var = this.s1;
        t6 t6Var3 = this.H1;
        h9Var.t0(t6Var3.T0, false, false, false, false, t6Var3);
        t6 t6Var4 = this.H1;
        if (!t6Var4.K) {
            t6Var4.S0 = Utilities.clamp(this.s1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.s1.getMasks();
        this.H1.U0 = masks != null ? new ArrayList(masks) : null;
        t6 t6Var5 = this.H1;
        boolean z4 = t6Var5.K;
        boolean E = t6Var5.E();
        this.H1.T0 = new ArrayList();
        h9 h9Var2 = this.s1;
        t6 t6Var6 = this.H1;
        Bitmap t02 = h9Var2.t0(t6Var6.T0, true, false, false, !z4, t6Var6);
        if (this.H1.T0.isEmpty()) {
            this.H1.T0 = null;
        }
        try {
            File file = this.H1.P0;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.H1.R0;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.H1.Q0;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        t6 t6Var7 = this.H1;
        t6Var7.P0 = null;
        t6Var7.R0 = null;
        t6Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        t6 t6Var8 = this.H1;
        t6Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, t6Var8.i0, t6Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        t6 t6Var9 = this.H1;
        if (t6Var9.u) {
            File file4 = t6Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.H1.Y0 = null;
            }
            t6 t6Var10 = this.H1;
            long j10 = t6Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = t6Var10.x0;
                if (drawable == null) {
                    drawable = k5.e(null, i10, j10, this.Z1);
                }
                if (drawable != null) {
                    this.H1.Y0 = t6.w(i10, "webp");
                    t6 t6Var11 = this.H1;
                    Bitmap createBitmap = Bitmap.createBitmap(t6Var11.i0, t6Var11.j0, Bitmap.Config.ARGB_8888);
                    t6.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.Y0));
                        } finally {
                            if (!createBitmap.isRecycled()) {
                                createBitmap.recycle();
                            }
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
            }
        }
        t6 t6Var12 = this.H1;
        if (t6Var12.u) {
            File file5 = t6Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.H1.X0 = null;
            }
            t6 t6Var13 = this.H1;
            if (t6Var13.u && t6Var13.K) {
                int i11 = t6Var13.k0;
                int i12 = t6Var13.l0;
                dg.a2 s02 = this.s1.s0();
                if (s02 != null) {
                    dg.t1 t1Var = s02.o0;
                    if (t1Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((t1Var.getChildAt(0) instanceof org.telegram.ui.Cells.s1) && (photoImage = ((org.telegram.ui.Cells.s1) t1Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                            float f10 = i11;
                            float f11 = i12;
                            float max = Math.max(photoImage.getImageWidth() / f10, photoImage.getImageHeight() / f11);
                            int i13 = (int) ((f10 * max) / 2.0f);
                            int i14 = (int) ((f11 * max) / 2.0f);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                            float[] fArr = new float[8];
                            for (int i15 = 0; i15 < photoImage.getRoundRadius().length; i15++) {
                                int i16 = i15 * 2;
                                fArr[i16] = photoImage.getRoundRadius()[i15];
                                fArr[i16 + 1] = photoImage.getRoundRadius()[i15];
                            }
                            Canvas canvas = new Canvas(createBitmap2);
                            Path path = new Path();
                            canvas.scale(0.5f, 0.5f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f12 = (i13 * 2.0f) / 2.0f;
                            float f13 = (i14 * 2.0f) / 2.0f;
                            rectF.set(f12 - (photoImage.getImageWidth() / 2.0f), f13 - (photoImage.getImageHeight() / 2.0f), (photoImage.getImageWidth() / 2.0f) + f12, (photoImage.getImageHeight() / 2.0f) + f13);
                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                            Paint paint = new Paint(1);
                            paint.setColor(-1);
                            canvas.drawPath(path, paint);
                            try {
                                this.H1.X0 = t6.w(i10, "webp");
                                createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.X0));
                            } catch (Exception e11) {
                                FileLog.e(e11);
                                this.H1.X0 = null;
                            }
                            createBitmap2.recycle();
                        }
                    }
                }
            }
        }
        if (!E) {
            h9 h9Var3 = this.s1;
            ArrayList arrayList2 = new ArrayList();
            t6 t6Var14 = this.H1;
            int i17 = t6Var14.i0;
            Bitmap t03 = h9Var3.t0(arrayList2, false, true, false, false, t6Var14);
            t6 t6Var15 = this.H1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            t6 t6Var16 = this.H1;
            t6Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, t6Var16.i0, t6Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.s1.L0.getPainting().E) {
            Bitmap blurBitmap = this.s1.getBlurBitmap();
            t6 t6Var17 = this.H1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            t6 t6Var18 = this.H1;
            t6Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, t6Var18.i0, t6Var18.j0, 87, false, 101, 101), true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0683 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07b8 A[LOOP:0: B:238:0x07b8->B:240:0x07be, LOOP_START, PHI: r15
      0x07b8: PHI (r15v17 int) = (r15v16 int), (r15v18 int) binds: [B:232:0x0784, B:240:0x07be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(int i10, boolean z4, boolean z10) {
        float f10;
        boolean z11;
        n9 n9Var;
        int i11;
        float f11;
        o9 o9Var;
        int i12;
        float f12;
        t6 t6Var;
        ImageView imageView;
        int i13;
        int i14;
        float f13;
        ff0 ff0Var;
        df0 df0Var;
        ImageView imageView2;
        int i15;
        t6 t6Var2;
        h9 h9Var;
        h9 h9Var2;
        int i16 = this.d0;
        if (i16 == i10 && !z4) {
            return;
        }
        t9 t9Var = this.Z0;
        if (i10 != -1 && t9Var != null && t9Var.L1) {
            return;
        }
        this.d0 = i10;
        AnimatorSet animatorSet = this.o2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.o2 = null;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.m0;
        oa oaVar = this.W0;
        n0 n0Var = this.b1;
        b2 b2Var = this.k0;
        eg.i0 i0Var = this.g1;
        jj0 jj0Var = this.d1;
        if (i16 != i10) {
            if (i10 == -1) {
                b2Var.setVisibility(0);
                t9Var.setVisibility(0);
                h9 h9Var3 = this.s1;
                if (h9Var3 != null) {
                    h9Var3.D0(null, true);
                }
                n0Var.setVisibility(0);
                t6 t6Var3 = this.H1;
                if (t6Var3 == null || !t6Var3.u) {
                    ImageView imageView3 = this.f1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    G().setVisibility(0);
                    o0(false);
                }
                k5Var.setVisibility(0);
                if (this.L1 == 1) {
                    jj0Var.setVisibility(0);
                    i0Var.setVisibility(0);
                } else {
                    t6 t6Var4 = this.H1;
                    if (t6Var4 != null && !TextUtils.isEmpty(t6Var4.y)) {
                        jj0Var.setVisibility(8);
                        i0Var.setVisibility(0);
                    }
                }
                oaVar.setVisibility(0);
            }
            if (i10 == 0 && (h9Var2 = this.s1) != null) {
                h9Var2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (h9Var = this.s1) != null) {
                h9Var.a1.setLayerType(2, null);
            }
            h9 h9Var4 = this.s1;
            if (h9Var4 != null) {
                h9Var4.L1.b(i10 != 0);
            }
            t9Var.I.b(i10 != -1);
            ic.e();
            if (this.y1 != null && i16 == 1) {
                i(null);
            }
            mf0 mf0Var = this.z1;
            if (mf0Var != null) {
                mf0Var.setAllowTouch(false);
            }
            this.h1.e(true);
            ca caVar = this.n;
            s9 s9Var = this.U0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.o1 == null) {
                    n9 n9Var2 = new n9(this, activity, s9Var);
                    this.o1 = n9Var2;
                    caVar.addView(n9Var2.d);
                    caVar.addView(this.o1);
                }
                this.o1.setVisibility(0);
                t6 t6Var5 = this.H1;
                if (t6Var5 != null) {
                    this.o1.setEntry(t6Var5);
                }
            } else if (i16 == 3) {
                s9Var.b();
                n9 n9Var3 = this.o1;
                if (n9Var3 != null) {
                    n9Var3.a.setCropEditorDrawing(n9Var3);
                    n9Var3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.p1 == null) {
                    o9 o9Var2 = new o9(this, activity, s9Var);
                    this.p1 = o9Var2;
                    caVar.addView(o9Var2.e);
                    caVar.addView(this.p1);
                }
                this.p1.setVisibility(0);
            } else if (i16 == 4) {
                s9Var.b();
                o9 o9Var3 = this.p1;
                if (o9Var3 != null) {
                    o9Var3.B = true;
                }
            }
        }
        this.Y0.b((i10 == -1 || i10 == 2) && this.F > 0.0f, z10);
        ArrayList arrayList = new ArrayList();
        of0 of0Var = this.y1;
        boolean z12 = of0Var == null && i10 == 1;
        float f14 = 1.0f;
        if (i10 == 1) {
            s();
            of0 of0Var2 = this.y1;
            this.s2 = of0Var2;
            FrameLayout toolsView = of0Var2 != null ? of0Var2.getToolsView() : null;
            if (toolsView != null) {
                toolsView.setAlpha(0.0f);
                toolsView.setVisibility(0);
                f10 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
            if (i16 == 1 && of0Var != null) {
                this.s2 = null;
                z11 = z12;
                arrayList.add(ObjectAnimator.ofFloat(of0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.y1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    u();
                    this.s2 = this.s1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(b2Var, (Property<b2, Float>) property, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.s1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -AndroidUtilities.dp(16.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getBottomLayout(), (Property<View, Float>) property2, AndroidUtilities.dp(48.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f10));
                } else if (i16 == 0 && this.s1 != null) {
                    this.s2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(b2Var, (Property<b2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getTopLayout(), (Property<View, Float>) property3, f10));
                    View topLayout2 = this.s1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getBottomLayout(), (Property<View, Float>) property3, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                n9Var = this.o1;
                if (n9Var == null) {
                    yf.e eVar = n9Var.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<yf.e, Float>) property5, 0.0f, 1.0f));
                        yf.e eVar2 = this.o1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<yf.e, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new r8(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i11 = 2;
                        f11 = 52.0f;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<yf.e, Float>) property7, 1.0f, 0.0f));
                            yf.e eVar3 = this.o1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(eVar3, (Property<yf.e, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.o1.getAppearProgress(), f10);
                            ofFloat2.addUpdateListener(new r8(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i11 = 2;
                    f11 = 52.0f;
                }
                o9Var = this.p1;
                if (o9Var != null) {
                    yf.e eVar4 = o9Var.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<yf.e, Float>) property9, fArr));
                        yf.e eVar5 = this.p1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f11);
                        fArr2[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(eVar5, (Property<yf.e, Float>) property10, fArr2));
                        float[] fArr3 = new float[i11];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.p1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.p1.r;
                        float[] fArr4 = new float[i11];
                        fArr4[0] = AndroidUtilities.dp(f11);
                        fArr4[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i11];
                        fArr5[0] = this.p1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new r8(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<yf.e, Float>) property11, fArr6));
                        yf.e eVar6 = this.p1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f11);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f10;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(eVar6, (Property<yf.e, Float>) property12, fArr7));
                        float[] fArr8 = new float[i11];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.p1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.p1.r;
                        float dp2 = AndroidUtilities.dp(f11);
                        float[] fArr9 = new float[i11];
                        fArr9[0] = f10;
                        fArr9[1] = dp2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i11];
                        fArr10[0] = this.p1.getAppearProgress();
                        fArr10[1] = f10;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new r8(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i10 != -1 || i10 == 2) {
                    i12 = 1;
                    if (this.L1 == 1) {
                        f12 = 1.0f;
                        float[] fArr11 = new float[i12];
                        fArr11[0] = f12;
                        arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.L1 == i12 || !((t6Var = this.H1) == null || TextUtils.isEmpty(t6Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                        imageView = this.f1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (t6Var2 = this.H1) != null && t6Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.c0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property13, fArr12));
                        p9 p9Var = this.e0;
                        if (i10 == i13) {
                            p9Var.setPivotY(p9Var.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            p9Var.setPivotY(p9Var.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            p9Var.setPivotY(0.0f);
                            i14 = oaVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f13 = (r10 - i14) / (p9Var.getHeight() - ((int) p9Var.getPivotY()));
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) View.SCALE_Y, f13));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        ff0Var = this.C1;
                        if (ff0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ff0Var, (Property<ff0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        df0Var = this.B1;
                        if (df0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(df0Var, (Property<df0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(t9Var, (Property<t9, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                        q9 q9Var = this.i0;
                        arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property14, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f14 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.V0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f14));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + t9Var.getEditTextHeight()))));
                        LinearLayout linearLayout = this.g0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.f1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.o0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new g9(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (oaVar != null) {
                            t6 t6Var6 = this.H1;
                            boolean z13 = t6Var6 == null || !t6Var6.v() || !this.H1.t() || i10 == 2;
                            if (oaVar.g0 != z13 || !z10) {
                                oaVar.g0 = z13;
                                if (!z10) {
                                    oaVar.f0.f(z13, true);
                                }
                                oaVar.invalidate();
                            }
                        }
                        if (!z10) {
                            while (i15 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i15);
                                animator.setDuration(1L);
                                animator.start();
                                i15++;
                            }
                            if (i16 != i10) {
                                Q(i16, i10);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.o2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.o2.setDuration(320L);
                        this.o2.setInterpolator(mr.h);
                        this.o2.addListener(new c9(this, i16, i10, 1));
                        if (z11) {
                            this.o2.setStartDelay(120L);
                        }
                        this.o2.start();
                        return;
                    }
                } else {
                    i12 = 1;
                }
                f12 = 0.0f;
                float[] fArr112 = new float[i12];
                fArr112[0] = f12;
                arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.L1 == i12 || !((t6Var = this.H1) == null || TextUtils.isEmpty(t6Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                imageView = this.f1;
                if (imageView != null) {
                }
                int i172 = this.c0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property13, fArr122));
                p9 p9Var2 = this.e0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(p9Var2, (Property<p9, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(p9Var2, (Property<p9, Float>) View.SCALE_Y, f13));
                if (i10 == -1) {
                }
                ff0Var = this.C1;
                if (ff0Var != null) {
                }
                df0Var = this.B1;
                if (df0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(t9Var, (Property<t9, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                q9 q9Var2 = this.i0;
                arrayList.add(ObjectAnimator.ofFloat(q9Var2, (Property<q9, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(q9Var2, (Property<q9, Float>) property142, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f14 = 0.0f;
                }
                FrameLayout frameLayout32 = this.V0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f14));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + t9Var.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.g0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                imageView2 = this.f1;
                if (imageView2 != null) {
                }
                if (this.o0.c()) {
                }
                if (oaVar != null) {
                }
                if (!z10) {
                }
            }
        }
        z11 = z12;
        if (i10 != 0) {
        }
        n9Var = this.o1;
        if (n9Var == null) {
        }
        o9Var = this.p1;
        if (o9Var != null) {
        }
        Property property132 = View.ALPHA;
        if (i10 != -1) {
        }
        i12 = 1;
        if (this.L1 == 1) {
        }
        f12 = 0.0f;
        float[] fArr1122 = new float[i12];
        fArr1122[0] = f12;
        arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property132, ((i10 != -1 || i10 == 2) && (this.L1 == i12 || !((t6Var = this.H1) == null || TextUtils.isEmpty(t6Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
        imageView = this.f1;
        if (imageView != null) {
        }
        int i1722 = this.c0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property132, fArr1222));
        p9 p9Var22 = this.e0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(p9Var22, (Property<p9, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(p9Var22, (Property<p9, Float>) View.SCALE_Y, f13));
        if (i10 == -1) {
        }
        ff0Var = this.C1;
        if (ff0Var != null) {
        }
        df0Var = this.B1;
        if (df0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(t9Var, (Property<t9, Float>) property132, i10 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
        q9 q9Var22 = this.i0;
        arrayList.add(ObjectAnimator.ofFloat(q9Var22, (Property<q9, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(q9Var22, (Property<q9, Float>) property1422, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.V0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f14));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + t9Var.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.g0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        imageView2 = this.f1;
        if (imageView2 != null) {
        }
        if (this.o0.c()) {
        }
        if (oaVar != null) {
        }
        if (!z10) {
        }
    }

    public final void m() {
        t6 t6Var;
        if (this.s1 == null || (t6Var = this.H1) == null || !t6Var.u) {
            return;
        }
        File file = t6Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.H1.W0 = null;
        }
        this.H1.W0 = t6.w(this.c, "webp");
        h9 h9Var = this.s1;
        t6 t6Var2 = this.H1;
        Bitmap t02 = h9Var.t0(t6Var2.T0, false, false, true, this.L1 != 1, t6Var2);
        try {
            try {
                t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.W0));
                if (t02.isRecycled()) {
                    return;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                try {
                    this.H1.W0.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.H1.W0 = null;
                if (t02 == null || t02.isRecycled()) {
                    return;
                }
            }
            t02.recycle();
        } catch (Throwable th2) {
            if (t02 != null && !t02.isRecycled()) {
                t02.recycle();
            }
            throw th2;
        }
    }

    public final void m0(boolean z4) {
        i9 i9Var;
        boolean z10 = false;
        i0(this.c0 == 0 && this.L1 == 1 && !this.F0.e && !I(), z4);
        this.D0.setSelected(this.x0.j());
        u uVar = this.F0;
        c0(this.k0, uVar == null || !uVar.e, z4);
        c0(this.B0, (this.X1 || this.L1 == -1 || this.c0 != 0 || this.V1 == null || this.F0.e || I()) ? false : true, z4);
        c0(this.C0, (this.X1 || this.L1 == -1 || this.c0 != 0 || (i9Var = this.y0) == null || !i9Var.a || this.F0.e || this.x0.j()) ? false : true, z4);
        c0(this.D0, (this.X1 || this.L1 == -1 || this.c0 != 0 || this.F0.e) ? false : true, z4);
        c0(this.E0, this.F0.e, z4);
        this.L0.e(this.x0.j() ? this.x0.getFilledProgress() : 0.0f, z4);
        boolean z11 = this.F0.e;
        f3 f3Var = this.k1;
        if (z11) {
            f3Var.u();
        } else {
            f3Var.e(true);
        }
        h(this.X1, z4);
        AndroidUtilities.updateViewShow(this.P0, this.L1 == -1 && this.c0 == 0);
        if (this.L1 == -1 && this.c0 == 0) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(this.O0, z10);
    }

    public final void n0() {
        this.E0.setTranslationX(-0.0f);
        float alpha = (this.E0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.C0.setTranslationX(-alpha);
        float alpha2 = (this.C0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.D0.setTranslationX(-alpha2);
        float alpha3 = (this.D0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.B0.setTranslationX(-alpha3);
        float alpha4 = (this.B0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha3;
        this.k0.setTranslationX(0.0f);
        org.telegram.ui.m3 m3Var = this.F0.a;
        m3Var.setPadding((int) ((this.k0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) (alpha4 + AndroidUtilities.dp(8.0f)), 0);
        m3Var.invalidate();
    }

    public final void o() {
        boolean z4 = this.H != 0.0f || this.F < 1.0f || this.y2;
        if (z4 == this.x2) {
            return;
        }
        kf.t0 t0Var = this.y;
        if (t0Var != null) {
            t0Var.a(!z4);
        }
        this.x2 = z4;
    }

    public final void o0(boolean z4) {
        gj0 gj0Var = this.e1;
        if (gj0Var != null) {
            int[] iArr = gj0Var.e;
            int i10 = 0;
            if (!z4) {
                t6 t6Var = this.H1;
                int i11 = (t6Var == null || !t6Var.y0) ? 0 : iArr[0] - 1;
                gj0Var.L(i11, false, true);
                this.e1.N(i11);
                ImageView imageView = this.f1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            t6 t6Var2 = this.H1;
            if (t6Var2 != null && t6Var2.y0) {
                i10 = iArr[0];
            }
            gj0Var.N(i10);
            gj0 gj0Var2 = this.e1;
            if (gj0Var2 != null) {
                gj0Var2.start();
            }
        }
    }

    public final void p() {
        if (this.q2 < 0) {
            this.q2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.r2 = arrayList;
            arrayList.add("off");
            this.r2.add("auto");
            this.r2.add("on");
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            d2 d2Var = this.s;
            d2Var.o = f10;
            d2Var.n = d2.f(f10);
            d2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            d2 d2Var2 = this.s;
            d2Var2.p = f11;
            d2Var2.i();
        }
    }

    public final void p0() {
        if (this.T1) {
            return;
        }
        this.T1 = true;
        g8 g8Var = new g8(this, 2);
        h9 h9Var = this.s1;
        t6 t6Var = this.H1;
        if (h9Var == null || t6Var == null) {
            g8Var.run();
            return;
        }
        t6Var.f();
        boolean u02 = h9Var.u0();
        boolean z4 = h9Var.L0.getPainting().E;
        Utilities.searchQueue.postRunnable(new k8(this, h9Var, t6Var.i0, t6Var.j0, t6Var, z4, u02, g8Var, 1));
    }

    public final void q(boolean z4) {
        s9 s9Var;
        if (this.d) {
            e8 e8Var = this.n0;
            if (e8Var != null) {
                e8Var.dismiss();
                this.n0 = null;
            }
            t6 t6Var = this.H1;
            long j10 = 0;
            if (t6Var != null && !t6Var.h) {
                if ((this.v && t6Var.g) || t6Var.b != 0) {
                    t6Var.j = false;
                }
                t6Var.i(false);
            }
            this.H1 = null;
            Utilities.Callback4 callback4 = this.O;
            if (callback4 == null || (s9Var = this.U0) == null) {
                s9 s9Var2 = this.U0;
                if (s9Var2 != null && !z4) {
                    s9Var2.set(null);
                }
                g(0.0f, z4, new g8(this, 23));
                int i10 = this.G;
                if (i10 == 1 || i10 == 0) {
                    this.n.setBackgroundColor(0);
                    this.Y0.b(false, true);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
                int i11 = this.c;
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            i71 i71Var = s9Var.y;
            if (i71Var != null) {
                i71Var.B();
                s9Var.y.H();
                s9Var.y = null;
            }
            i71 i71Var2 = s9Var.x;
            if (i71Var2 != null) {
                j10 = i71Var2.n();
                s9Var.x.B();
                s9Var.x.H();
                s9Var.x = null;
            }
            i71 i71Var3 = s9Var.e;
            if (i71Var3 != null) {
                j10 = i71Var3.n();
                s9Var.e.B();
                s9Var.e.H();
                s9Var.e = null;
            }
            callback4.run(Long.valueOf(j10), new q8(this, z4, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        i9 i9Var;
        if ((!this.M1 && !this.N1) || (i9Var = this.y0) == null || !i9Var.isFrontface()) {
            return false;
        }
        int i10 = this.q2;
        return i10 == 2 || (i10 == 1 && this.Z1);
    }

    public final void r() {
        Activity activity = this.b;
        if (this.y0 != null || activity == null) {
            return;
        }
        this.y0 = new i9(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        s5 s5Var = this.L0;
        if (s5Var != null) {
            s5Var.d0 = 0.0f;
            s5Var.e0.d(0.0f, true);
        }
        this.y0.recordHevc = !this.x0.j();
        this.y0.setThumbDrawable(A());
        this.y0.initTexture();
        this.y0.setDelegate(new p8(this, 0));
        c0(this.C0, this.y0.a && this.c0 == 0, true);
        this.D0.setTranslationX(this.y0.a ? 0.0f : AndroidUtilities.dp(46.0f));
        this.x0.setCameraView(this.y0);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.T0.u();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!v0.q(this.y0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", v0.p(ApplicationLoader.applicationContext, false))) && this.y0.a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.i1.u();
        }
        if (this.z0 == null) {
            this.z0 = new o5(activity, new h8(this, 3));
        }
        this.z0.a(this.y0);
        c6 c6Var = this.A0;
        if (c6Var != null) {
            r9 r9Var = this.x0;
            Object blurRenderNode = r9Var.getBlurRenderNode();
            c6Var.C = r9Var;
            c6Var.D = blurRenderNode;
            c6Var.invalidate();
        }
    }

    public final void s() {
        t6 t6Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.y1 != null || (t6Var = this.H1) == null) {
            return;
        }
        if (t6Var.K) {
            bitmap = null;
        } else {
            if (t6Var.Z0 == null) {
                q10 = this.U0.getPhotoBitmap();
            } else {
                p8 p8Var = new p8(this, 11);
                Point point = AndroidUtilities.displaySize;
                q10 = t6.q(p8Var, point.x, point.y, 0, true);
            }
            bitmap = q10;
        }
        if (bitmap != null || this.H1.K) {
            w61 textureView = this.U0.getTextureView();
            int orientation = this.U0.getOrientation();
            t6 t6Var2 = this.H1;
            of0 of0Var = new of0(this.b, textureView, bitmap, null, orientation, t6Var2 != null ? t6Var2.a1 : null, null, 0, false, false, this.o0, this.a);
            this.y1 = of0Var;
            this.r.addView(of0Var);
            mf0 mf0Var = this.z1;
            if (mf0Var != null) {
                mf0Var.setFilterView(this.y1);
            }
            TextureView myTextureView = this.y1.getMyTextureView();
            this.A1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            this.U0.o(this.A1, this.y1);
            TextureView textureView2 = this.A1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.A1.animate().alpha(1.0f).setDuration(220L).start();
            }
            j();
            df0 blurControl = this.y1.getBlurControl();
            this.B1 = blurControl;
            if (blurControl != null) {
                this.e0.addView(blurControl);
            }
            ff0 curveControl = this.y1.getCurveControl();
            this.C1 = curveControl;
            if (curveControl != null) {
                this.e0.addView(curveControl);
            }
            V();
            this.y1.getDoneTextView().setOnClickListener(new j8(this, 13));
            this.y1.getCancelTextView().setOnClickListener(new j8(this, 14));
            this.y1.getToolsView().setVisibility(8);
            this.y1.getToolsView().setAlpha(0.0f);
            this.y1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.y1.f0.setVisibility(0);
        }
    }

    public final void t(boolean z4) {
        if (this.J0 != null) {
            r9 r9Var = this.x0;
            if ((r9Var != null && r9Var.j()) == this.J0.M) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.J0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.j2;
        boolean z10 = !z4;
        r9 r9Var2 = this.x0;
        e9 e9Var = new e9(this, this.c, this.b, this.a, albumEntry, z4, z10, r9Var2 != null && r9Var2.j());
        this.J0 = e9Var;
        e9Var.D.setVisibility(8);
        this.J0.setMultipleOnClick(this.x0.j());
        this.J0.setMaxCount(Math.min(10, r.b() - this.x0.getFilledCount()));
        int i10 = 1;
        this.J0.setOnBackClickListener(new u8(this, i10));
        this.J0.setOnSelectListener(new ry0(z4, this, i10));
        this.J0.setOnSelectMultipleListener(new lh.o1(this, 2));
        f2.h0 h0Var = this.i2;
        if (h0Var != null) {
            m2 m2Var = this.J0.e;
            m2Var.B = h0Var;
            m2Var.l0();
        }
        this.n.addView(this.J0, k7.b6.e(-1, -1, 119));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a4  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        Bitmap bitmap;
        boolean z4;
        t6 t6Var;
        File file;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        boolean z13;
        t6 t6Var2;
        cg.p1 renderView;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file2;
        File file3;
        if (this.s1 != null) {
            return;
        }
        Pair<Integer, Integer> paintSize = this.U0.getPaintSize();
        t6 t6Var3 = this.H1;
        Bitmap decodeFile = (t6Var3 == null || !(t6Var3.c || t6Var3.g || this.E1 != null) || (file3 = t6Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        t6 t6Var4 = this.H1;
        if (t6Var4 == null || (!(t6Var4.c || t6Var4.g || this.E1 != null) || (file2 = t6Var4.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file2.getPath());
            if (bitmap != null) {
                z4 = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                int measuredWidth = this.e0.getMeasuredWidth();
                int measuredHeight = this.e0.getMeasuredHeight();
                t6Var = this.H1;
                if (t6Var != null || t6Var.M) {
                    file = null;
                    z10 = false;
                } else {
                    file = null;
                    z10 = true;
                }
                File file4 = t6Var != null ? file : t6Var.L;
                if (t6Var == null && t6Var.K) {
                    z11 = z4;
                    z12 = true;
                } else {
                    z11 = z4;
                    z12 = false;
                }
                if (t6Var != null || t6Var.J0 == 0) {
                    obj = file;
                    z13 = false;
                } else {
                    obj = file;
                    z13 = true;
                }
                int orientation = this.U0.getOrientation();
                t6Var2 = this.H1;
                Object obj2 = obj;
                if (t6Var2 != null) {
                    obj2 = t6Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                j5 j5Var = this.p0;
                s9 s9Var = this.U0;
                Activity activity = this.b;
                boolean z14 = z11;
                h9 h9Var = new h9(this, activity, z10, file4, z12, z13, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, t6Var2, measuredWidth, measuredHeight, cropState, this.o0, this.a, j5Var, s9Var);
                this.s1 = h9Var;
                t6 t6Var5 = this.H1;
                h9Var.setHasAudio(t6Var5 == null && t6Var5.y != null);
                this.s1.setBlurManager(this.o0);
                this.r.addView(this.s1);
                renderView = this.s1.getRenderView();
                this.t1 = renderView;
                if (renderView != null) {
                    renderView.getPainting().E = z14;
                    this.e0.addView(this.t1);
                }
                renderInputView = this.s1.getRenderInputView();
                this.u1 = renderInputView;
                if (renderInputView != null) {
                    this.e0.addView(renderInputView);
                }
                textDimView = this.s1.getTextDimView();
                this.v1 = textDimView;
                if (textDimView != null) {
                    this.e0.addView(textDimView);
                }
                entitiesView = this.s1.getEntitiesView();
                this.w1 = entitiesView;
                if (entitiesView != null) {
                    this.e0.addView(entitiesView);
                }
                selectionEntitiesView = this.s1.getSelectionEntitiesView();
                this.x1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    this.e0.addView(selectionEntitiesView);
                }
                V();
                this.s1.setOnDoneButtonClickedListener(new g8(this, 21));
                this.s1.setOnCancelButtonClickedListener(new g8(this, 22));
                h9 h9Var2 = this.s1;
                h9Var2.O0.setVisibility(0);
                h9Var2.L0.setVisibility(0);
                h9Var2.M0.setVisibility(0);
            }
        }
        z4 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.e0.getMeasuredWidth();
        int measuredHeight2 = this.e0.getMeasuredHeight();
        t6Var = this.H1;
        if (t6Var != null) {
        }
        file = null;
        z10 = false;
        if (t6Var != null) {
        }
        if (t6Var == null) {
        }
        z11 = z4;
        z12 = false;
        if (t6Var != null) {
        }
        obj = file;
        z13 = false;
        int orientation2 = this.U0.getOrientation();
        t6Var2 = this.H1;
        Object obj22 = obj;
        if (t6Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        j5 j5Var2 = this.p0;
        s9 s9Var2 = this.U0;
        Activity activity2 = this.b;
        boolean z142 = z11;
        h9 h9Var3 = new h9(this, activity2, z10, file4, z12, z13, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, t6Var2, measuredWidth2, measuredHeight2, cropState2, this.o0, this.a, j5Var2, s9Var2);
        this.s1 = h9Var3;
        t6 t6Var52 = this.H1;
        h9Var3.setHasAudio(t6Var52 == null && t6Var52.y != null);
        this.s1.setBlurManager(this.o0);
        this.r.addView(this.s1);
        renderView = this.s1.getRenderView();
        this.t1 = renderView;
        if (renderView != null) {
        }
        renderInputView = this.s1.getRenderInputView();
        this.u1 = renderInputView;
        if (renderInputView != null) {
        }
        textDimView = this.s1.getTextDimView();
        this.v1 = textDimView;
        if (textDimView != null) {
        }
        entitiesView = this.s1.getEntitiesView();
        this.w1 = entitiesView;
        if (entitiesView != null) {
        }
        selectionEntitiesView = this.s1.getSelectionEntitiesView();
        this.x1 = selectionEntitiesView;
        if (selectionEntitiesView != null) {
        }
        V();
        this.s1.setOnDoneButtonClickedListener(new g8(this, 21));
        this.s1.setOnCancelButtonClickedListener(new g8(this, 22));
        h9 h9Var22 = this.s1;
        h9Var22.O0.setVisibility(0);
        h9Var22.L0.setVisibility(0);
        h9Var22.M0.setVisibility(0);
    }

    public final void v(boolean z4) {
        o5 o5Var = this.z0;
        if (o5Var != null) {
            o5Var.f = null;
            Utilities.globalQueue.cancelRunnable(o5Var.h);
            this.z0 = null;
            r9 r9Var = this.x0;
            if (r9Var != null) {
                r9Var.c.a(null);
            }
        }
        c6 c6Var = this.A0;
        if (c6Var != null) {
            c6Var.C = null;
            c6Var.D = null;
            c6Var.invalidate();
        }
        if (this.y0 != null) {
            if (z4) {
                b0(new g8(this, 8));
                return;
            }
            b0(new g8(this, 9));
            this.y0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.y0);
            r9 r9Var2 = this.x0;
            if (r9Var2 != null) {
                r9Var2.setCameraView(null);
            }
            this.y0 = null;
        }
    }

    public final void w() {
        e9 e9Var = this.J0;
        if (e9Var == null) {
            return;
        }
        this.n.removeView(e9Var);
        this.J0 = null;
        ValueAnimator valueAnimator = this.k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k2 = null;
        }
        o1.j jVar = this.l2;
        if (jVar != null) {
            jVar.c();
            this.l2 = null;
        }
        this.m2 = null;
    }

    public final void y() {
        of0 of0Var = this.y1;
        if (of0Var == null) {
            return;
        }
        of0Var.e();
        this.z1.setFilterView(null);
        this.r.removeView(this.y1);
        TextureView textureView = this.A1;
        if (textureView != null) {
            this.e0.removeView(textureView);
            this.A1 = null;
        }
        this.U0.o(null, null);
        df0 df0Var = this.B1;
        if (df0Var != null) {
            this.e0.removeView(df0Var);
            this.B1 = null;
        }
        ff0 ff0Var = this.C1;
        if (ff0Var != null) {
            this.e0.removeView(ff0Var);
            this.C1 = null;
        }
        this.y1 = null;
    }

    public final void z() {
        h9 h9Var = this.s1;
        if (h9Var == null) {
            return;
        }
        h9Var.O0.removeAllViews();
        h9 h9Var2 = this.s1;
        h9Var2.L0.h();
        h9Var2.O0.setVisibility(8);
        h9Var2.N0.setVisibility(8);
        h9Var2.B0.postRunnable(new j21(12));
        l4 l4Var = h9Var2.h2;
        if (l4Var != null) {
            l4Var.dismiss();
        }
        cg.e0 e0Var = h9Var2.Q1;
        if (e0Var != null) {
            e0Var.dismiss();
        }
        this.r.removeView(this.s1);
        this.s1 = null;
        cg.p1 p1Var = this.t1;
        if (p1Var != null) {
            this.e0.removeView(p1Var);
            this.t1 = null;
        }
        View view = this.v1;
        if (view != null) {
            this.e0.removeView(view);
            this.v1 = null;
        }
        View view2 = this.u1;
        if (view2 != null) {
            this.e0.removeView(view2);
            this.u1 = null;
        }
        View view3 = this.w1;
        if (view3 != null) {
            this.e0.removeView(view3);
            this.w1 = null;
        }
        View view4 = this.x1;
        if (view4 != null) {
            this.e0.removeView(view4);
            this.x1 = null;
        }
    }
}
