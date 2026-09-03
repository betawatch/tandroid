package qh;

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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.x61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.ek;
import org.telegram.ui.nw0;
import org.telegram.ui.ry0;
import org.telegram.ui.sj0;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class ba implements NotificationCenter.NotificationCenterDelegate {
    public static ba C2;
    public final a6 A0;
    public TextureView A1;
    public float A2;
    public ValueAnimator B;
    public final ma B0;
    public ef0 B1;
    public ValueAnimator B2;
    public w9 C;
    public final na C0;
    public gf0 C1;
    public float D;
    public final v D0;
    public File D1;
    public final RectF E;
    public final ma E0;
    public ArrayList E1;
    public float F;
    public final u F0;
    public ArrayList F1;
    public int G;
    public final qa G0;
    public ArrayList G1;
    public float H;
    public boolean H0;
    public r6 H1;
    public Float I;
    public boolean I0;
    public boolean I1;
    public boolean J;
    public b9 J0;
    public long J1;
    public long K;
    public o0 K0;
    public boolean K1;
    public boolean L;
    public final q5 L0;
    public int L1;
    public final AnimationNotificationsLocker M;
    public final d M0;
    public boolean M1;
    public Runnable N;
    public final u8 N0;
    public boolean N1;
    public Utilities.Callback4 O;
    public final a2 O0;
    public boolean O1;
    public int P;
    public final a2 P0;
    public boolean P1;
    public int Q;
    public final d3 Q0;
    public float Q1;
    public int R;
    public final d3 R0;
    public int R1;
    public boolean S;
    public final h91 S0;
    public boolean S1;
    public boolean T;
    public final e3 T0;
    public boolean T1;
    public boolean U;
    public final p9 U0;
    public boolean U1;
    public int V;
    public final FrameLayout V0;
    public String V1;
    public int W;
    public final la W0;
    public AnimatorSet W1;
    public int X;
    public final pa X0;
    public boolean X1;
    public int Y;
    public final d5 Y0;
    public boolean Y1;
    public final RectF Z;
    public final q9 Z0;
    public boolean Z1;
    public final oh.b a;
    public final RectF a0;
    public final t8 a1;
    public boolean a2;
    public final Activity b;
    public final Path b0;
    public final n0 b1;
    public Runnable b2;
    public final int c;
    public int c0;
    public hj0 c1;
    public AnimatorSet c2;
    public boolean d;
    public int d0;
    public final kj0 d1;
    public k8 d2;
    public boolean e;
    public final m9 e0;
    public hj0 e1;
    public boolean e2;
    public final WindowManager f;
    public final FrameLayout f0;
    public ImageView f1;
    public AnimatorSet f2;
    public final LinearLayout g0;
    public final fg.i0 g1;
    public ValueAnimator g2;
    public final WindowManager.LayoutParams h;
    public final FrameLayout h0;
    public final e3 h1;
    public boolean h2;
    public final n9 i0;
    public final e3 i1;
    public f2.i0 i2;
    public final FrameLayout j0;
    public final e3 j1;
    public MediaController.AlbumEntry j2;
    public final a2 k0;
    public final e3 k1;
    public ValueAnimator k2;
    public final j6 l0;
    public final e5 l1;
    public o1.j l2;
    public final org.telegram.ui.ActionBar.l5 m0;
    public final oa m1;
    public Boolean m2;
    public final aa n;
    public c8 n0;
    public n n1;
    public o8 n2;
    public final org.telegram.ui.Components.ba o0;
    public k9 o1;
    public AnimatorSet o2;
    public final h5 p0;
    public l9 p1;
    public boolean p2;
    public final nw0 q0;
    public final la q1;
    public int q2;
    public final s9 r;
    public boolean r0;
    public final d r1;
    public ArrayList r2;
    public final c2 s;
    public long s0;
    public e9 s1;
    public FrameLayout s2;
    public String t0;
    public dg.o1 t1;
    public boolean t2;
    public TLRPC.InputPeer u0;
    public View u1;
    public f8 u2;
    public boolean v;
    public a8 v0;
    public View v1;
    public im v2;
    public long w;
    public r w0;
    public View w1;
    public boolean w2;
    public r9 x;
    public final o9 x0;
    public View x1;
    public boolean x2;
    public final lf.s0 y;
    public f9 y0;
    public pf0 y1;
    public boolean y2;
    public m5 z0;
    public final nf0 z1;
    public wo z2;

    public ba(Activity activity, int i10) {
        int i11;
        oh.b bVar = new oh.b();
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
        this.v0 = new a8();
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
        x8 x8Var = new x8(this);
        this.a2 = true;
        this.h2 = true;
        this.q2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.D1;
        this.y = launchActivity != null ? new lf.s0(launchActivity, true) : null;
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
        aa aaVar = new aa(this, activity);
        this.n = aaVar;
        n8 n8Var = new n8(this, i12);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(aaVar, n8Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        c2 c2Var = new c2(activity, windowManager, this.n, layoutParams);
        this.s = c2Var;
        c2Var.a(new i9(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        aa aaVar2 = this.n;
        s9 s9Var = new s9(this, activity);
        this.r = s9Var;
        aaVar2.addView(s9Var);
        s9 s9Var2 = this.r;
        m9 m9Var = new m9(this, activity);
        this.e0 = m9Var;
        s9Var2.addView(m9Var);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.o0 = new org.telegram.ui.Components.ba(this.e0);
        this.p0 = new h5();
        s9 s9Var3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f0 = frameLayout;
        s9Var3.addView(frameLayout);
        s9 s9Var4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.h0 = frameLayout2;
        s9Var4.addView(frameLayout2);
        s9 s9Var5 = this.r;
        n9 n9Var = new n9(this, activity, i13);
        this.i0 = n9Var;
        s9Var5.addView(n9Var);
        this.i0.setVisibility(8);
        this.i0.setAlpha(0.0f);
        s9 s9Var6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.j0 = frameLayout3;
        s9Var6.addView(frameLayout3);
        int i15 = 14;
        ic.a(this.n, new hg.w(i15));
        o9 o9Var = new o9(this, activity, this.o0, this.r, bVar);
        this.x0 = o9Var;
        aa aaVar3 = this.n;
        Objects.requireNonNull(aaVar3);
        o9Var.setCancelGestures(new org.telegram.ui.web.s0(aaVar3, 26));
        int i16 = 13;
        this.x0.setResetState(new f8(this, i16));
        this.e0.addView(this.x0, k7.c6.e(-1, -1, 119));
        this.x0.setOnClickListener(new h8(this, 12));
        m9 m9Var2 = this.e0;
        int i17 = this.G;
        m9Var2.setBackgroundColor((i17 == 1 || i17 == 0) ? 0 : -14737633);
        m9 m9Var3 = this.e0;
        float dp = AndroidUtilities.dp(12.0f);
        hg.j1 j1Var = lf.q0.a;
        m9Var3.setOutlineProvider(new lf.p0(0, dp));
        this.e0.setClipToOutline(true);
        f8 f8Var = new f8(this, i15);
        nf0 nf0Var = new nf0(activity);
        nf0Var.a = new TextPaint(1);
        nf0Var.b = new TextPaint(1);
        pr prVar = pr.h;
        nf0Var.s = new org.telegram.ui.Components.z5(nf0Var, 0L, 350L, prVar);
        nf0Var.F = new ec0(nf0Var, 7);
        nf0Var.x = f8Var;
        this.z1 = nf0Var;
        p9 p9Var = new p9(this, activity, this.o0, this.p0);
        this.U0 = p9Var;
        p9Var.setCollageView(this.x0);
        p9 p9Var2 = this.U0;
        p9Var2.v = new f8(this, 15);
        p9Var2.setOnTapListener(new f8(this, i14));
        this.U0.setVisibility(8);
        p9 p9Var3 = this.U0;
        p9Var3.K = new f8(this, 17);
        this.e0.addView(p9Var3, k7.c6.e(-1, -1, 119));
        this.e0.addView(this.z1, k7.c6.e(-1, -1, 119));
        aa aaVar4 = this.n;
        int i18 = 8;
        q9 q9Var = new q9(this, activity, aaVar4, aaVar4, this.r, bVar, this.o0);
        this.Z0 = q9Var;
        q9Var.setAccount(i10);
        int i19 = 6;
        this.Z0.setUiBlurBitmap(new n8(this, i19));
        ic.a(this.i0, new lh.t0(this, 11));
        this.Z0.setOnHeightUpdate(new g8(this, i16));
        this.Z0.setOnPeriodUpdate(new g8(this, 4));
        long j10 = this.K;
        if (j10 != 0) {
            this.Z0.setDialogId(j10);
        }
        this.Z0.setOnPremiumHint(new g8(this, 5));
        this.Z0.setOnKeyboardOpen(new g8(this, i19));
        nw0 nw0Var = new nw0(this, activity, i19);
        this.q0 = nw0Var;
        this.r.addView(nw0Var);
        la laVar = new la(activity, this.r, this.e0, bVar, this.o0);
        this.W0 = laVar;
        laVar.setOnTimelineClick(new f8(this, 10));
        this.W0.setOnHeightChange(new f8(this, 11));
        this.U0.setVideoTimelineView(this.W0);
        this.W0.setVisibility(8);
        this.W0.setAlpha(0.0f);
        this.W0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.V0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.W0, k7.c6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        pa paVar = new pa(activity);
        this.X0 = paVar;
        paVar.setVisibility(8);
        this.X0.a(false);
        this.V0.addView(this.X0, k7.c6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.i0.addView(this.V0, k7.c6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.i0.addView(this.Z0, k7.c6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.x0.setTimelineView(this.W0);
        this.x0.setPreviewView(this.U0);
        la laVar2 = new la(activity, this.r, this.e0, bVar, this.o0);
        this.q1 = laVar2;
        laVar2.U0 = true;
        laVar2.setVisibility(8);
        this.q1.setAlpha(0.0f);
        this.i0.addView(this.q1, k7.c6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        t8 t8Var = new t8(this, activity, bVar, this.o0);
        this.a1 = t8Var;
        t8Var.setVisibility(8);
        this.i0.addView(this.a1, k7.c6.e(-1, -2, 85));
        a2 a2Var = new a2(activity);
        this.k0 = a2Var;
        a2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        a2 a2Var2 = this.k0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        a2Var2.setScaleType(scaleType);
        this.k0.setImageResource(R.drawable.msg_photo_back);
        a2 a2Var3 = this.k0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        a2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.k0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.k0.setOnClickListener(new h8(this, i12));
        this.f0.addView(this.k0, k7.c6.e(56, 56, 51));
        this.s.a(this.k0);
        j6 j6Var = new j6(activity, i10);
        this.l0 = j6Var;
        j6Var.a(false, false);
        this.l0.setOnClickListener(new q8(i13, this, activity));
        this.f0.addView(this.l0, k7.c6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.m0 = l5Var;
        l5Var.setTextSize(20);
        this.m0.setGravity(19);
        this.m0.setTextColor(-1);
        this.m0.setTypeface(AndroidUtilities.bold());
        this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.m0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.m0.setAlpha(0.0f);
        this.m0.setVisibility(8);
        this.m0.setEllipsizeByGradient(true);
        this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f0.addView(this.m0, k7.c6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.g0 = linearLayout;
        linearLayout.setOrientation(0);
        this.g0.setGravity(5);
        this.f0.addView(this.g0, k7.c6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        g8 g8Var = new g8(this, 7);
        aa aaVar5 = this.n;
        n0 n0Var = new n0(activity);
        n0Var.w = true;
        n0Var.x = true;
        n0Var.h = g8Var;
        n0Var.a = i10;
        n0Var.b = aaVar5;
        n0Var.setScaleType(scaleType);
        n0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        n0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        n0Var.setVisibility(8);
        n0Var.setAlpha(0.0f);
        n0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(n0Var, i18));
        n0Var.f = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        n0Var.d();
        this.b1 = n0Var;
        e3 e3Var = new e3(activity, 1);
        e3Var.l(1.0f, -71.0f);
        e3Var.d = 2000L;
        e3Var.R = false;
        e3Var.E.o(true, false, false);
        this.h1 = e3Var;
        e3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f0.addView(this.h1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        kj0 kj0Var = new kj0(activity);
        this.d1 = kj0Var;
        kj0Var.setScaleType(scaleType);
        kj0 kj0Var2 = this.d1;
        r6 r6Var = this.H1;
        kj0Var2.setImageResource((r6Var == null || !r6Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.d1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.d1.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        int i20 = 2;
        this.d1.setOnClickListener(new h8(this, i20));
        this.d1.setVisibility(8);
        this.d1.setAlpha(0.0f);
        fg.i0 i0Var = new fg.i0(activity);
        this.g1 = i0Var;
        i0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        this.g1.setOnClickListener(new h8(this, 3));
        this.g0.addView(this.g1, k7.c6.q(46, 56, 53));
        this.g0.addView(this.d1, k7.c6.q(46, 56, 53));
        this.g0.addView(this.b1, k7.c6.e(46, 56, 53));
        ma maVar = new ma(activity);
        this.B0 = maVar;
        maVar.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.B0.setOnClickListener(new h8(this, 4));
        this.B0.setOnLongClickListener(new eg.d0(this, i20));
        this.B0.setVisibility(8);
        this.B0.setAlpha(0.0f);
        this.s.a(this.B0);
        this.f0.addView(this.B0, k7.c6.e(56, 56, 53));
        na naVar = new na(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.C0 = naVar;
        naVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.C0.setOnClickListener(new h8(this, 5));
        boolean q10 = v0.q(activity);
        this.C0.setVisibility(q10 ? 0 : 8);
        this.C0.setAlpha(q10 ? 1.0f : 0.0f);
        this.s.a(this.C0);
        this.f0.addView(this.C0, k7.c6.e(56, 56, 53));
        v vVar = new v(activity);
        this.D0 = vVar;
        vVar.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.D0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        if (this.w0 == null) {
            i11 = 6;
            this.w0 = (r) r.a().get(6);
        } else {
            i11 = 6;
        }
        this.D0.setOnClickListener(new h8(this, i11));
        this.D0.a(new lc0(this.w0, false), false);
        this.D0.setSelected(false);
        this.D0.setVisibility(0);
        this.D0.setAlpha(1.0f);
        this.s.a(this.D0);
        this.f0.addView(this.D0, k7.c6.e(56, 56, 53));
        ma maVar2 = new ma(activity);
        this.E0 = maVar2;
        maVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.E0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.E0.a(new lc0(new r("../../.."), true), false);
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.E0.setOnClickListener(new h8(this, 7));
        this.s.a(this.E0);
        this.f0.addView(this.E0, k7.c6.e(56, 56, 53));
        u uVar = new u(activity, this.s);
        this.F0 = uVar;
        uVar.a.u0(6);
        this.F0.setSelected((r) null);
        this.F0.setOnLayoutClick(new g8(this, i18));
        this.f0.addView(this.F0, k7.c6.e(-1, 56, 53));
        e3 e3Var2 = new e3(activity, 1);
        e3Var2.l(1.0f, -20.0f);
        e3Var2.d = 5000L;
        e3Var2.i();
        e3Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        e3Var2.i0 = new sj0(16);
        this.i1 = e3Var2;
        e3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f0.addView(this.i1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        e3 e3Var3 = new e3(activity, 2);
        e3Var3.l(0.0f, 28.0f);
        e3Var3.d = 5000L;
        e3Var3.p(true);
        this.j1 = e3Var3;
        this.f0.addView(e3Var3, k7.c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        e3 e3Var4 = new e3(activity, 1);
        e3Var4.l(1.0f, -20.0f);
        e3Var4.d = 5000L;
        e3Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.k1 = e3Var4;
        e3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f0.addView(this.k1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        qa qaVar = new qa(activity);
        Paint paint = new Paint(1);
        qaVar.a = paint;
        Paint paint2 = new Paint(1);
        qaVar.b = paint2;
        qaVar.e = new org.telegram.ui.Components.z5(qaVar, 0L, 250L, prVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, true, false);
        qaVar.c = j6Var2;
        j6Var2.k(0.3f, 250L, prVar);
        j6Var2.t(AndroidUtilities.dp(13.0f));
        j6Var2.r(-1);
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.setCallback(qaVar);
        j6Var2.b = 1;
        qaVar.a(0L, false);
        this.G0 = qaVar;
        i0(false, false);
        this.f0.addView(this.G0, k7.c6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.G0);
        MediaController.loadGalleryPhotosAlbums(0);
        q5 q5Var = new q5(activity);
        this.L0 = q5Var;
        q5Var.setDelegate(x8Var);
        q5 q5Var2 = this.L0;
        boolean z4 = this.L1 == 1;
        q5Var2.k0 = -1.0f;
        q5Var2.l0 = z4;
        q5Var2.invalidate();
        this.h0.addView(this.L0, k7.c6.e(-1, 100, 87));
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
        this.h0.addView(this.M0, k7.c6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.M0.setOnClickListener(new h8(this, 8));
        e3 e3Var5 = new e3(activity, 3);
        e3Var5.p(true);
        e3Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        e3Var5.h = AndroidUtilities.dp(320.0f);
        e3Var5.d = 5000L;
        e3Var5.H = Layout.Alignment.ALIGN_CENTER;
        this.T0 = e3Var5;
        this.h0.addView(e3Var5, k7.c6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        h91 h91Var = new h91(activity);
        this.S0 = h91Var;
        h91Var.J = false;
        h91Var.setAlpha(0.0f);
        this.h0.addView(this.S0, k7.c6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.S0.setDelegate(new n8(this, 4));
        h91 h91Var2 = this.S0;
        this.Q1 = 0.0f;
        h91Var2.b(0.0f, false);
        a6 a6Var = new a6(activity, i10, new f8(this, 12));
        this.A0 = a6Var;
        a6Var.c = new g8(this, 9);
        this.h0.addView(a6Var, k7.c6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        u8 u8Var = new u8(this, activity);
        this.N0 = u8Var;
        u8Var.setOnSwitchModeListener(new g8(this, 10));
        this.N0.setOnSwitchingModeListener(new g8(this, 11));
        this.j0.addView(this.N0, k7.c6.e(-1, 48, 55));
        this.s.a(this.N0);
        a2 a2Var4 = new a2(activity);
        this.O0 = a2Var4;
        a2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.O0.setImageResource(R.drawable.stream_flip);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.j0.addView(this.O0, k7.c6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.O0);
        this.O0.setOnClickListener(new h8(this, 9));
        a2 a2Var5 = new a2(activity);
        this.P0 = a2Var5;
        a2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.P0.setImageResource(R.drawable.stream_settings);
        this.P0.setScaleType(scaleType);
        this.P0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.j0.addView(this.P0, k7.c6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.P0);
        this.P0.setOnClickListener(new h8(this, 10));
        d3 d3Var = new d3(activity);
        this.Q0 = d3Var;
        this.j0.addView(d3Var, k7.c6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.Q0);
        d3 d3Var2 = new d3(activity);
        this.R0 = d3Var2;
        d3Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        d3Var2.invalidate();
        this.R0.setAlpha(0.0f);
        this.j0.addView(this.R0, k7.c6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.R0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.r1 = dVar2;
        dVar2.setVisibility(8);
        this.r1.setAlpha(0.0f);
        this.r1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.r1.setOnClickListener(new h8(this, 11));
        this.j0.addView(this.r1, k7.c6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        d5 d5Var = new d5(activity);
        d5Var.b = new ArrayList();
        d5Var.e = true;
        d5Var.h = true;
        View view = new View(activity);
        d5Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        d5Var.addView(view, k7.c6.e(-1, -1, 119));
        d5Var.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        d5Var.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        d5Var.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        d5Var.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        d5Var.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        d5Var.d = string;
        d5Var.e = true;
        c5 c5Var = new c5(d5Var, activity, string, true);
        d5Var.c = c5Var;
        c5Var.setContentDescription(LocaleController.getString(R.string.Send));
        d5Var.addView(d5Var.c, k7.c6.c(-2.0f, -2));
        d5Var.e();
        this.Y0 = d5Var;
        d5Var.setVisibility(8);
        this.Y0.setOnClickListener(new g8(this, 12));
        this.j0.addView(this.Y0, k7.c6.e(-1, 52, 23));
        oa oaVar = new oa(activity);
        this.m1 = oaVar;
        oaVar.setAlpha(0.0f);
        this.m1.setVisibility(8);
        this.e0.addView(this.m1, k7.c6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        e5 e5Var = new e5(activity, i10, bVar);
        this.l1 = e5Var;
        this.e0.addView(e5Var, k7.c6.e(-1, -1, 119));
        m0(false);
    }

    public static ba E(Activity activity, int i10) {
        ba baVar = C2;
        if (baVar != null && (baVar.b != activity || baVar.c != i10)) {
            baVar.q(false);
            C2 = null;
        }
        if (C2 == null) {
            C2 = new ba(activity, i10);
        }
        return C2;
    }

    public static void a(ba baVar) {
        f9 f9Var = baVar.y0;
        if (f9Var == null || f9Var.getTextureView() == null) {
            baVar.Z1 = false;
            return;
        }
        Bitmap bitmap = baVar.y0.getTextureView().getBitmap();
        if (bitmap == null) {
            baVar.Z1 = false;
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
        baVar.Z1 = f11 < 0.22f;
    }

    public static void a0(boolean z4) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z4).apply();
    }

    public static boolean b(ba baVar) {
        Activity activity = baVar.b;
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

    public static void c(ba baVar) {
        ValueAnimator valueAnimator = baVar.g2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            baVar.g2 = null;
        }
        baVar.h2 = false;
        s9 s9Var = baVar.r;
        float f10 = s9Var.a;
        float f11 = s9Var.b;
        s9Var.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        baVar.g2 = ofFloat;
        ofFloat.addUpdateListener(new pv(baVar, f10, f11, 3));
        baVar.g2.setDuration(340L);
        baVar.g2.setInterpolator(pr.h);
        baVar.g2.addListener(new a9(baVar, 0));
        baVar.g2.start();
    }

    public static boolean d(ba baVar) {
        Activity activity = baVar.b;
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
        spannableString.setSpan(new j9(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        ba baVar = C2;
        if (baVar != null) {
            baVar.q(false);
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
        r6 r6Var = this.H1;
        if (r6Var != null) {
            return r6Var.r();
        }
        return 1;
    }

    public final String C() {
        f9 f9Var = this.y0;
        if (f9Var == null || f9Var.getCameraSession() == null) {
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
            this.h0.addView(o0Var, k7.c6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.K0;
    }

    public final String F() {
        f9 f9Var = this.y0;
        if (f9Var == null || f9Var.getCameraSession() == null) {
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
            hj0 hj0Var = new hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.e1 = hj0Var;
            hj0Var.h = true;
            r6 r6Var = this.H1;
            if (r6Var == null || !r6Var.y0) {
                hj0Var.N(0);
                this.e1.K(0);
            } else {
                hj0Var.K(35);
                this.e1.N(36);
            }
            this.e1.X = true;
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J9, this.a);
            this.e1.O(v02, "Sunny");
            this.e1.O(v02, "Path 6");
            this.e1.O(v02, "Path");
            this.e1.O(v02, "Path 5");
            this.e1.m();
            ImageView imageView = new ImageView(this.b);
            this.f1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f1.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
            this.f1.setOnClickListener(new h8(this, 0));
            this.f1.setVisibility(8);
            this.f1.setImageDrawable(this.e1);
            this.f1.setAlpha(0.0f);
            this.g0.addView(this.f1, 0, k7.c6.q(46, 56, 53));
        }
        return this.f1;
    }

    public final void H() {
        e9 e9Var = this.s1;
        if (e9Var == null) {
            return;
        }
        this.s2 = null;
        e9Var.getTopLayout().setAlpha(0.0f);
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
        b9 b9Var;
        if (this.T || (b9Var = this.J0) == null) {
            return false;
        }
        return b9Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
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
        r6 r6Var;
        r6 r6Var2;
        d dVar;
        org.telegram.ui.ActionBar.l5 l5Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        r6 r6Var3;
        r6 r6Var4;
        r6 r6Var5;
        r6 r6Var6;
        f9 f9Var;
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
        d5 d5Var = this.Y0;
        if (d5Var != null) {
            d5Var.b(i10 == 1, z4);
        }
        u uVar = this.F0;
        i0(i10 == 0 && this.L1 == 1 && !uVar.e && !I(), z4);
        if (i10 != 1) {
            this.X0.a(z4);
        }
        c0(this.k0, !uVar.e, z4);
        c0(this.B0, (this.X1 || i10 != 0 || uVar.e || this.V1 == null || I()) ? false : true, z4);
        boolean z10 = this.X1;
        o9 o9Var = this.x0;
        c0(this.C0, (z10 || i10 != 0 || (f9Var = this.y0) == null || !f9Var.a || uVar.e || o9Var.j()) ? false : true, true);
        c0(this.D0, (this.X1 || i10 != 0 || uVar.e) ? false : true, z4);
        m0(z4);
        n0 n0Var = this.b1;
        fg.i0 i0Var = this.g1;
        kj0 kj0Var = this.d1;
        la laVar = this.q1;
        la laVar2 = this.W0;
        d dVar2 = this.r1;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.m0;
        q9 q9Var = this.Z0;
        d3 d3Var = this.R0;
        d3 d3Var2 = this.Q0;
        a6 a6Var = this.A0;
        p9 p9Var = this.U0;
        n9 n9Var = this.i0;
        u8 u8Var = this.N0;
        q5 q5Var = this.L0;
        if (!z4) {
            f9 f9Var2 = this.y0;
            if (f9Var2 != null) {
                f9Var2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            p9Var.setAlpha(((i10 != 1 || o9Var.j()) && i10 != 2) ? 0.0f : 1.0f);
            o9Var.setAlpha((i10 == 0 || (i10 == 1 && o9Var.j())) ? 1.0f : 0.0f);
            q5Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            q5Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            a6Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            u8Var.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            u8Var.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            d3Var2.setAlpha((i10 == 0 && this.X1 && !I()) ? 1.0f : 0.0f);
            d3Var.setAlpha((i10 == 0 && !this.X1 && I()) ? 0.6f : 0.0f);
            n9Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            n9Var.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            q9Var.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            kj0Var.setAlpha((i10 == 1 && this.L1 == 1) ? 1.0f : 0.0f);
            i0Var.setAlpha((i10 != 1 || (this.L1 != 1 && ((r6Var2 = this.H1) == null || TextUtils.isEmpty(r6Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            n0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.f1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (r6Var = this.H1) != null && r6Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            laVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            laVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            l5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.f2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        f9 f9Var3 = this.y0;
        if (f9Var3 != null) {
            dVar = dVar2;
            l5Var = l5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(f9Var3, (Property<f9, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            l5Var = l5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || o9Var.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && o9Var.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(o9Var, (Property<o9, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(q5Var, (Property<q5, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(q5Var, (Property<q5, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(u8Var, (Property<u8, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(u8Var, (Property<u8, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(d3Var2, (Property<d3, Float>) property, (i10 == 0 && this.X1 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property, (i10 == 0 && !this.X1 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property, ((i10 == 1 && ((r6Var6 = this.H1) == null || r6Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((r6Var5 = this.H1) == null || r6Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(laVar2, (Property<la, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property, (i10 == 1 || this.L1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property, (i10 == 1 || (this.L1 != 1 && ((r6Var4 = this.H1) == null || TextUtils.isEmpty(r6Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.f1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (r6Var3 = this.H1) != null && r6Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<h91, Float>) property, 0.0f));
                this.f2.playTogether(arrayList);
                this.f2.addListener(new z8(this, i13, i10, 0));
                this.f2.setDuration(460L);
                this.f2.setInterpolator(pr.h);
                this.f2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(laVar2, (Property<la, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property, (i10 == 1 || this.L1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property, (i10 == 1 || (this.L1 != 1 && ((r6Var4 = this.H1) == null || TextUtils.isEmpty(r6Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.f1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<h91, Float>) property, 0.0f));
        this.f2.playTogether(arrayList);
        this.f2.addListener(new z8(this, i13, i10, 0));
        this.f2.setDuration(460L);
        this.f2.setInterpolator(pr.h);
        this.f2.start();
    }

    public final void L(Runnable runnable, long j10) {
        if (this.P1 || this.H1 == null) {
            return;
        }
        k8 k8Var = this.d2;
        if (k8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(k8Var);
        }
        this.e2 = true;
        this.P1 = true;
        this.d2 = new k8(this, runnable, 1);
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
        r6 r6Var;
        r6 r6Var2;
        r6 r6Var3;
        e9 e9Var;
        r6 r6Var4;
        e9 e9Var2;
        e9 e9Var3;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            q9 q9Var = this.Z0;
            if (q9Var != null && q9Var.L1) {
                q9Var.K1 = false;
                q9Var.z(false, false);
                return false;
            }
            if (this.N1) {
                q5 q5Var = this.L0;
                if (q5Var.o0) {
                    q5Var.o0 = false;
                    q5Var.s0 = SystemClock.elapsedRealtime();
                    q5Var.r0 = true;
                    ((x8) q5Var.a).d(false);
                    q5Var.G.c(false);
                    q5Var.H.c(false);
                    q5Var.I.c(false);
                    q5Var.invalidate();
                    return false;
                }
            } else if (!this.M1 && !q9Var.p()) {
                t8 t8Var = this.a1;
                if (t8Var.J) {
                    t8Var.c(false, true);
                    return false;
                }
                b9 b9Var = this.J0;
                if (b9Var != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = b9Var.D;
                    if (w0Var == null || !w0Var.s()) {
                        f(false);
                        this.j2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    if (b9Var.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    b9Var.x.v(w0Var.L(true));
                    return false;
                }
                if (this.d0 != 0 || (e9Var3 = this.s1) == null || !e9Var3.y0()) {
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
                    if (this.c0 == 1 && (((r6Var2 = this.H1) == null || (!r6Var2.n && !r6Var2.u)) && !this.r0)) {
                        if (r6Var2 != null && r6Var2.g && ((e9Var2 = this.s1) == null || !e9Var2.u0())) {
                            r6 r6Var5 = this.H1;
                            if (!r6Var5.j) {
                            }
                        }
                        e9 e9Var4 = this.s1;
                        if (e9Var4 == null || !e9Var4.y0()) {
                            if (this.s0 == 0 && (((this.I1 && !this.x0.j() && (((e9Var = this.s1) == null || !e9Var.u0()) && ((r6Var4 = this.H1) == null || r6Var4.Z0 == null))) || !this.Y0.h) && (((r6Var3 = this.H1) == null || !r6Var3.g || (!r6Var3.n && !r6Var3.u)) && !this.r0 && (r6Var3 == null || !r6Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.s0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            oh.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            r6 r6Var6 = this.H1;
                            if (r6Var6 != null && !r6Var6.g && !r6Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(r6Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new n8(this, 8));
                            }
                            r6 r6Var7 = this.H1;
                            alertDialog$Builder.k(LocaleController.getString((r6Var7 == null || !r6Var7.c || r6Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new n8(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.show();
                            View d = d2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.k6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, bVar));
                                d.setBackground(org.telegram.ui.ActionBar.k6.Y(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i11, bVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.c0 != 2 || (r6Var = this.H1) == null || r6Var.b0) {
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
            r6 r6Var = this.H1;
            if (r6Var == null || !r6Var.n) {
                u();
                H();
            }
            nf0 nf0Var = this.z1;
            if (nf0Var != null) {
                nf0Var.setAllowTouch(false);
            }
            this.U0.x(2, false);
            this.U0.x(3, false);
            this.U0.x(4, false);
            this.U0.x(5, false);
            this.U0.x(7, false);
            r6 r6Var2 = this.H1;
            this.X0.setVisibility((r6Var2 == null || r6Var2.h0 < 30000) ? 8 : 0);
            this.i0.setAlpha(1.0f);
            this.i0.setTranslationY(0.0f);
            r6 r6Var3 = this.H1;
            this.Z0.setVisibility((r6Var3 == null || r6Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.S1) {
            D().setVisibility(0);
            o0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            org.telegram.ui.web.s0 s0Var = D.h;
            if (s0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(s0Var);
            }
            org.telegram.ui.web.s0 s0Var2 = new org.telegram.ui.web.s0(D, 12);
            D.h = s0Var2;
            AndroidUtilities.runOnUIThread(s0Var2, 3500L);
            this.L0.h();
        }
        this.S1 = false;
        nf0 nf0Var2 = this.z1;
        if (nf0Var2 != null) {
            nf0Var2.setAllowTouch(i11 == 1 && ((i12 = this.d0) == -1 || i12 == 1));
        }
        q9 q9Var = this.Z0;
        if (q9Var != null) {
            q9Var.b0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            oh.t6 storiesController = MessagesController.getInstance(i13).getStoriesController();
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
        r6 r6Var;
        r6 r6Var2;
        boolean z4;
        r6 r6Var3;
        r6 r6Var4;
        r6 r6Var5;
        x61 textureView;
        r6 r6Var6;
        boolean z10 = true;
        if (i11 == 0) {
            Z(false);
            this.L0.setVisibility(0);
            q5 q5Var = this.L0;
            if (q5Var != null) {
                q5Var.g(false);
            }
            this.N0.setVisibility(0);
            this.S0.setVisibility(0);
            this.S0.setAlpha(0.0f);
            this.G0.a(0L, true);
            r6 r6Var7 = this.H1;
            if (r6Var7 != null) {
                r6Var7.i(false);
                this.H1 = null;
            }
            o9 o9Var = this.x0;
            if (o9Var != null) {
                o9Var.e();
                this.L0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new f8(this, 18));
            o0 o0Var = this.K0;
            if (o0Var != null) {
                o0Var.setVisibility(8);
            }
            this.T0.e(true);
            e3 e3Var = this.i1;
            if (e3Var != null) {
                e3Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.b1.setEntry(i11 == 1 ? this.H1 : null);
            if (this.L1 == 1) {
                this.d1.setVisibility(0);
                r6 r6Var8 = this.H1;
                f0(r6Var8 != null && r6Var8.Y, false);
                this.g1.setVisibility(0);
                this.U0.x(-9982, false);
                ((og0) this.g1.c).a(this.U0.k(), false);
                this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                r6 r6Var9 = this.H1;
                if (r6Var9 == null || TextUtils.isEmpty(r6Var9.y)) {
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.d1.setVisibility(8);
                    this.g1.setVisibility(0);
                    ((og0) this.g1.c).a(true, false);
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.b1.setVisibility(0);
            r6 r6Var10 = this.H1;
            if (r6Var10 == null || !r6Var10.u) {
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
            r6 r6Var11 = this.H1;
            this.Z0.setVisibility(((r6Var11 == null || r6Var11.J0 == 0) && this.s0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V0.getLayoutParams();
            r6 r6Var12 = this.H1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((r6Var12 == null || r6Var12.J0 == 0) && this.s0 == 0) ? 68.0f : 12.0f);
            this.V0.setLayoutParams(layoutParams);
            this.i0.setVisibility(0);
            this.i0.clearFocus();
            r6 r6Var13 = this.H1;
            this.Z0.A(r6Var13 == null ? 86400 : r6Var13.I0, false);
            this.Z0.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((r6Var = this.H1) == null || !r6Var.g));
            r6 r6Var14 = this.H1;
            this.Z0.setHasRoundVideo((r6Var14 == null || r6Var14.o0 == null) ? false : true);
            q9 q9Var = this.Z0;
            if (q9Var == null) {
                j10 = 0;
            } else {
                r6 r6Var15 = this.H1;
                if (r6Var15 == null || !r6Var15.n) {
                    j10 = 0;
                    q9Var.v(null, null);
                } else {
                    TLRPC.Peer peer = r6Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        r6 r6Var16 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        r6Var16.p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        r6 r6Var17 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        r6Var17.p = append;
                    }
                    String str2 = this.H1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new y8(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.Z0.v(str3, append);
                }
            }
            r6 r6Var18 = this.H1;
            boolean z11 = (r6Var18 != null && r6Var18.v() && this.H1.t()) ? false : true;
            la laVar = this.W0;
            boolean z12 = laVar.g0;
            laVar.g0 = z11;
            laVar.f0.f(z11, true);
            laVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.m0.setVisibility(0);
            this.q1.setVisibility(0);
            r6 r6Var19 = this.H1;
            if (r6Var19 != null && r6Var19.b0) {
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
            r6 r6Var20 = this.H1;
            boolean z13 = (r6Var20 == null || r6Var20.J0 == j10) ? false : true;
            boolean z14 = r6Var20 != null && r6Var20.g;
            String string = LocaleController.getString(z14 ? R.string.Done : z13 ? R.string.UploadBotPreview : R.string.Next);
            boolean z15 = !z13;
            d5 d5Var = this.Y0;
            if (!TextUtils.equals(string, d5Var.d) || z15 != d5Var.e) {
                d5Var.removeView(d5Var.c);
                Context context = d5Var.getContext();
                d5Var.d = string;
                d5Var.e = z15;
                c5 c5Var = new c5(d5Var, context, string, z15);
                d5Var.c = c5Var;
                c5Var.setContentDescription(string);
                d5Var.addView(d5Var.c, k7.c6.c(-2.0f, -2));
                d5Var.e();
            }
            this.q1.setVisibility(8);
            this.r1.setVisibility(8);
            if (!this.e2) {
                r6 r6Var21 = this.H1;
                if (r6Var21 == null || !r6Var21.u) {
                    this.U0.set(r6Var21);
                } else {
                    this.U0.l(r6Var21);
                }
            }
            this.e2 = false;
            this.Z0.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new f8(this, 19));
            this.a1.setVisibility(this.E1 == null ? 8 : 0);
            ArrayList arrayList = this.E1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.G1;
                ArrayList arrayList3 = this.F1;
                t8 t8Var = this.a1;
                t8Var.c(false, false);
                t8Var.c = arrayList;
                t8Var.d = arrayList2;
                t8Var.e = arrayList3;
                t8Var.w = new k01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                t8Var.H = new k01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                t8Var.b.V2.N(false);
                this.a1.setSelected(this.E1.indexOf(this.H1));
            }
            this.W0.setMaxCount((z13 || z14 || this.E1 != null || ((r6Var6 = this.H1) != null && (r6Var6.v() || !this.H1.K))) ? 1 : 3);
            if (i10 != 2) {
                r6 r6Var22 = this.H1;
                if (r6Var22 != null && (r6Var22.c || r6Var22.g || this.r0)) {
                    if (r6Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    r6 r6Var23 = this.H1;
                    if (r6Var23.K && r6Var23.a1 != null && (textureView = this.U0.getTextureView()) != null) {
                        textureView.setDelegate(new n8(this, 7));
                    }
                    this.Z0.setText(this.H1.C0);
                } else if (i10 != 2) {
                    q9 q9Var2 = this.Z0;
                    q9Var2.S = true;
                    q9Var2.f.setText("");
                }
            }
            r6 r6Var24 = this.H1;
            this.Y0.d(4, r6Var24 == null || ((!r6Var24.u || r6Var24.K) && !r6Var24.v()));
            this.Y0.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (r6Var5 = this.H1) == null || r6Var5.u || r6Var5.v()) ? false : true);
            if (!this.K1 && !this.Z0.o()) {
                oh.t6 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                oh.n6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, B) || ((r6Var4 = this.H1) != null && (r6Var4.g || r6Var4.J0 != j10))) {
                    z4 = true;
                    this.Y0.setShareEnabled(z4);
                    r6 r6Var25 = this.H1;
                    this.d1.setImageResource((r6Var25 == null && r6Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.U0.setVisibility(0);
                    this.W0.setVisibility(0);
                    this.m0.setVisibility(0);
                    this.m0.setTranslationX(0.0f);
                    r6Var3 = this.H1;
                    if (r6Var3 == null && r6Var3.J0 != j10) {
                        this.m0.l("", false);
                    } else if (r6Var3 == null && r6Var3.g) {
                        this.m0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (r6Var3 == null && r6Var3.u) {
                        this.m0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (r6Var3 == null && r6Var3.n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(this.m0, 32.0f, i12);
                        this.m0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(i5Var, 0, 1, 33);
                        if (this.H1.q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.H1.q.user_id));
                            i5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.H1.q)));
                            i5Var.b(chat2);
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
            r6 r6Var252 = this.H1;
            this.d1.setImageResource((r6Var252 == null && r6Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.U0.setVisibility(0);
            this.W0.setVisibility(0);
            this.m0.setVisibility(0);
            this.m0.setTranslationX(0.0f);
            r6Var3 = this.H1;
            if (r6Var3 == null) {
            }
            if (r6Var3 == null) {
            }
            if (r6Var3 == null) {
            }
            if (r6Var3 == null) {
            }
            this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z10 = true;
        }
        if (i10 == z10) {
            q9 q9Var3 = this.Z0;
            q70 q70Var = q9Var3.S0;
            if (q70Var != null) {
                q70Var.u();
                q9Var3.S0 = null;
            }
            this.h1.e(z10);
            t8 t8Var2 = this.a1;
            if (t8Var2.J) {
                t8Var2.c(false, z10);
            }
        }
        if (i11 == 2 && (r6Var2 = this.H1) != null) {
            if (r6Var2.e0 < j10) {
                r6Var2.e0 = j10;
            }
            this.J1 = r6Var2.e0;
            long duration = this.U0.getDuration() < 100 ? this.H1.h0 : this.U0.getDuration();
            r6 r6Var26 = this.H1;
            if (r6Var26.h0 <= 0) {
                r6Var26.h0 = duration;
            }
            File file = r6Var26.Z0;
            if (file == null) {
                file = r6Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            r6 r6Var27 = this.H1;
            this.q1.o(false, absolutePath, r6Var27.h0, r6Var27.P);
            r6 r6Var28 = this.H1;
            float f10 = duration;
            long j11 = (long) (r6Var28.Z * f10);
            long j12 = (long) (r6Var28.a0 * f10);
            la laVar2 = this.q1;
            laVar2.W0 = j11;
            laVar2.X0 = j12;
            ga gaVar = laVar2.h;
            if (gaVar != null) {
                ga.a(gaVar, true);
            }
            c4 c4Var = new c4(this, 3);
            this.q1.setDelegate(new c9(c4Var));
            float max = (this.J1 / Math.max(1L, duration)) * 0.96f;
            this.q1.setVideoLeft(max);
            this.q1.setVideoRight(0.04f + max);
            c4Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        nf0 nf0Var = this.z1;
        if (nf0Var != null) {
            nf0Var.setAllowTouch(false);
        }
        e3 e3Var2 = this.j1;
        if (e3Var2 != null) {
            e3Var2.e(true);
        }
        ic.e();
        q9 q9Var4 = this.Z0;
        if (q9Var4 != null) {
            f fVar = q9Var4.f;
            fVar.d();
            fVar.k(true);
            this.Z0.b0 = true;
        }
        p9 p9Var = this.U0;
        if (p9Var != null) {
            p9Var.x(8, i11 != 1);
        }
        e9 e9Var = this.s1;
        if (e9Var != null) {
            e9Var.setCoverPreview(i11 != 1);
        }
        e3 e3Var3 = this.k1;
        if (e3Var3 != null) {
            e3Var3.e(true);
        }
        o9 o9Var2 = this.x0;
        o9Var2.setPreview(i11 == 1 && o9Var2.j());
    }

    public final void P() {
        dg.m1 m1Var;
        boolean z4 = false;
        if (this.c0 == 0) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.u2 = new f8(this, 3);
            }
        }
        q9 q9Var = this.Z0;
        if (q9Var != null) {
            q9Var.f.s();
        }
        q5 q5Var = this.L0;
        if (q5Var != null) {
            q5Var.h();
        }
        e5 e5Var = this.l1;
        if (e5Var != null) {
            oh.t6 storiesController = MessagesController.getInstance(e5Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            e5Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            e5Var.c.invalidate();
        }
        e9 e9Var = this.s1;
        if (e9Var != null && (m1Var = e9Var.L0.d) != null) {
            m1Var.postRunnable(m1Var.w);
        }
        p9 p9Var = this.U0;
        if (p9Var != null) {
            p9Var.x(0, false);
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
        e9 e9Var;
        k9 k9Var;
        l9 l9Var;
        e9 e9Var2;
        if (i11 == 0) {
            this.k0.setVisibility(8);
        }
        if (i10 == 0 && (e9Var2 = this.s1) != null) {
            e9Var2.setVisibility(8);
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
        if ((i11 == 0 || i10 == 0) && (e9Var = this.s1) != null) {
            e9Var.a1.setLayerType(0, null);
        }
        nf0 nf0Var = this.z1;
        if (nf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z4 = false;
            }
            nf0Var.setAllowTouch(z4);
        }
        if (i11 == 3) {
            k9 k9Var2 = this.o1;
            if (k9Var2 != null) {
                k9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (k9Var = this.o1) != null) {
            k9Var.setVisibility(8);
            this.o1.setAppearProgress(0.0f);
            k9 k9Var3 = this.o1;
            k9Var3.x = null;
            a0 a0Var = k9Var3.f;
            a0Var.I = null;
            a0Var.d = null;
            a0Var.G = false;
            k9Var3.d.setVisibility(8);
            k9Var3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            l9 l9Var2 = this.p1;
            if (l9Var2 != null) {
                l9Var2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (l9Var = this.p1) == null) {
            return;
        }
        l9Var.setVisibility(8);
        this.p1.setAppearProgress(0.0f);
        l9 l9Var3 = this.p1;
        l9Var3.b = null;
        a0 a0Var2 = l9Var3.h;
        a0Var2.I = null;
        a0Var2.d = null;
        a0Var2.G = false;
        l9Var3.e.setVisibility(8);
        l9Var3.setVisibility(8);
    }

    public final void R(v9 v9Var) {
        oh.n6 o10;
        aa aaVar;
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
        if (windowManager != null && (aaVar = this.n) != null && aaVar.getParent() == null) {
            aa aaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, aaVar2, layoutParams);
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
        if (v9Var != null) {
            this.C = v9Var;
            this.G = v9Var.a;
            rectF.set(v9Var.c);
            this.D = v9Var.b;
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
        g(1.0f, true, new f8(this, 6));
        e();
        this.s0 = 0L;
        this.t0 = "";
    }

    public final void S(t9 t9Var, r6 r6Var, long j10) {
        aa aaVar;
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
        if (windowManager != null && (aaVar = this.n) != null && aaVar.getParent() == null) {
            aa aaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, aaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.H1 = r6Var;
        this.L1 = r6Var.K ? 1 : 0;
        this.p0.g = false;
        RectF rectF = this.E;
        if (t9Var != null) {
            this.C = t9Var;
            this.G = t9Var.a;
            rectF.set(t9Var.c);
            this.D = t9Var.b;
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
        r6 r6Var2 = this.H1;
        if (r6Var2 != null) {
            this.Z0.setText(r6Var2.C0);
        }
        L(new s8(this, 0), j10);
        K(this.H1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.Y0.b(false, false);
        e();
        this.s0 = 0L;
        this.t0 = "";
    }

    public final void T() {
        q70 q70Var;
        p9 p9Var = this.U0;
        if (p9Var != null) {
            p9Var.x(4, true);
        }
        q9 q9Var = this.Z0;
        if (q9Var != null && (q70Var = q9Var.S0) != null) {
            q70Var.u();
            q9Var.S0 = null;
        }
        fg.n1 n1Var = new fg.n1((org.telegram.ui.ActionBar.p2) new g9(this, 1), 14, false);
        n1Var.setOnDismissListener(new r8(this, 1));
        n1Var.show();
    }

    public final void U(t9 t9Var, r6 r6Var) {
        oh.n6 o10;
        aa aaVar;
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
        if (windowManager != null && (aaVar = this.n) != null && aaVar.getParent() == null) {
            aa aaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, aaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.H1 = r6Var;
        e8.a(i10, r6Var);
        r6 r6Var2 = this.H1;
        int i11 = (r6Var2 == null || !r6Var2.K) ? 0 : 1;
        this.L1 = i11;
        this.p0.g = r6Var2 != null && r6Var2.u && i11 == 1;
        if (this.s0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.E;
        if (t9Var != null) {
            this.C = t9Var;
            this.G = t9Var.a;
            rectF.set(t9Var.c);
            this.D = t9Var.b;
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
        r6 r6Var3 = this.H1;
        if (r6Var3 != null) {
            this.Z0.setText(r6Var3.C0);
        }
        this.Y0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new f8(this, 6));
        e();
        this.s0 = 0L;
        this.t0 = "";
    }

    public final void V() {
        dg.o1 o1Var = this.t1;
        if (o1Var != null) {
            o1Var.bringToFront();
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
        oa oaVar = this.m1;
        if (oaVar != null) {
            oaVar.bringToFront();
        }
        nf0 nf0Var = this.z1;
        if (nf0Var != null) {
            nf0Var.bringToFront();
        }
        ef0 ef0Var = this.B1;
        if (ef0Var != null) {
            ef0Var.bringToFront();
        }
        gf0 gf0Var = this.C1;
        if (gf0Var != null) {
            gf0Var.bringToFront();
        }
        e5 e5Var = this.l1;
        if (e5Var != null) {
            e5Var.bringToFront();
        }
        n nVar = this.n1;
        if (nVar != null) {
            nVar.bringToFront();
        }
    }

    public final void W(r6 r6Var, boolean z4) {
        r6 r6Var2;
        boolean z10;
        if (r6Var == null || this.U0.getWidth() <= 0 || this.U0.getHeight() <= 0) {
            return;
        }
        File file = z4 ? r6Var.O0 : r6Var.N0;
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
        x61 textureView = this.U0.getTextureView();
        if (r6Var.K && !r6Var.u && textureView != null) {
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
        File file2 = r6Var.Q0;
        if (file2 != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / decodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile.recycle();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        File file3 = r6Var.P0;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        e9 e9Var = this.s1;
        if (e9Var != null && e9Var.O0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            e9 e9Var2 = this.s1;
            e9Var2.F0 = true;
            v4 v4Var = e9Var2.O0;
            v4Var.a = true;
            v4Var.draw(canvas);
            e9 e9Var3 = this.s1;
            e9Var3.O0.a = false;
            e9Var3.F0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = r6.w(this.c, "jpg");
        if (z4) {
            r6Var2 = r6Var;
            z10 = z4;
            Utilities.searchQueue.postRunnable(new hg.j(this, createBitmap, z10, w10, r6Var2, 21));
        } else {
            r6Var2 = r6Var;
            z10 = z4;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z10 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (!z10) {
            r6Var2.N0 = w10;
        }
        r6Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        oh.n6 o10;
        char c3;
        c8 c8Var = this.n0;
        BitmapDrawable bitmapDrawable = null;
        if (c8Var != null) {
            c8Var.dismiss();
            this.n0 = null;
        }
        if (this.K1) {
            n0 n0Var = this.b1;
            n0Var.getClass();
            n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            c5 c5Var = this.Y0.c;
            int i10 = -this.R1;
            this.R1 = i10;
            AndroidUtilities.shakeViewSpring(c5Var, i10);
            return;
        }
        q9 q9Var = this.Z0;
        if (q9Var != null && q9Var.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.k6 k6Var = q9Var.v;
            int i11 = -this.R1;
            this.R1 = i11;
            AndroidUtilities.shakeViewSpring(k6Var, i11);
            q9Var.e();
            return;
        }
        r6 r6Var = this.H1;
        int i12 = this.c;
        int i13 = 0;
        if ((r6Var == null || (!r6Var.g && r6Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.H1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        oh.b bVar = this.a;
        if (q9Var != null && !this.H1.D0) {
            CharSequence text = q9Var.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((t01[]) spannable.getSpans(0, text.length(), t01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new qc(this.n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.k6.gc, 0, new f8(this, 27), bVar)).k(true);
                    int i14 = -this.R1;
                    this.R1 = i14;
                    AndroidUtilities.shakeViewSpring(q9Var, i14);
                    return;
                }
            }
        }
        r6 r6Var2 = this.H1;
        if (r6Var2.g || r6Var2.J0 != 0) {
            r6Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.K != 0) {
            r6Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.K);
        }
        p9 p9Var = this.U0;
        p9Var.x(3, true);
        c8 c8Var2 = new c8(this.b, this.H1.I0, bVar);
        c8Var2.q1(this.H1.E0);
        c8Var2.p1(this.H1.v0);
        c8Var2.C = this.J;
        c8Var2.R = new g8(this, 14);
        c8Var2.e1(!this.x0.j());
        ArrayList arrayList = this.F1;
        c8Var2.m1(arrayList == null ? this.H1.r() : arrayList.size());
        c8Var2.k1(false);
        CharSequence text2 = q9Var.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (o51 o51Var : (o51[]) ((Spanned) text2).getSpans(0, text2.length(), o51.class)) {
                if (o51Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(o51Var.getURL())));
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
        c8Var2.P = arrayList2;
        c8Var2.T = new g8(this, 15);
        c8Var2.U = new g8(this, 16);
        c8Var2.Q = new n8(this, 10);
        this.n0 = c8Var2;
        r6 r6Var3 = this.H1;
        if (r6Var3.K) {
            if (p9Var != null && !r6Var3.f0 && this.c0 != 2) {
                r6Var3.e0 = p9Var.getCurrentPosition();
                g8 g8Var = new g8(this, 17);
                dg.o1 o1Var = this.t1;
                View view = this.w1;
                View[] viewArr = new View[3];
                viewArr[0] = p9Var;
                viewArr[c3] = o1Var;
                viewArr[2] = view;
                p9Var.h(g8Var, viewArr);
            }
            c8 c8Var3 = this.n0;
            Bitmap bitmap = this.H1.g0;
            f8 f8Var = new f8(this, 20);
            if (bitmap != null) {
                c8Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            c8Var3.Y = bitmapDrawable;
            c8Var3.Z = f8Var;
            ek ekVar = c8Var3.b;
            if (ekVar != null) {
                for (View view2 : ekVar.getViewPages()) {
                    if (view2 instanceof w7) {
                        w7 w7Var = (w7) view2;
                        w7Var.g(false);
                        w7Var.e(false);
                    }
                }
            }
        }
        this.n0.setOnDismissListener(new r8(this, i13));
        this.n0.show();
    }

    public final void Y(w9 w9Var) {
        int i10 = 0;
        RectF rectF = this.E;
        if (w9Var != null) {
            this.C = w9Var;
            this.G = w9Var.a;
            rectF.set(w9Var.c);
            this.D = w9Var.b;
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
                    pq pqVar = new pq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    pqVar.e = dp;
                    pqVar.f = dp2;
                    this.x0.setCameraThumb(pqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
                        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new n8(this, 13));
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
                CameraController.getInstance().initCamera(new f8(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        f9 f9Var = this.y0;
        if (f9Var == null || f9Var.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new n71(this, this.y0.getTextureView().getBitmap(), runnable, 20));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z4, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
            view.animate().alpha(z4 ? 1.0f : 0.0f).setUpdateListener(new d9(this, 1)).setListener(new androidx.fragment.app.g(this, z4, view, 13)).setDuration(320L).setInterpolator(pr.h).start();
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oh.n6 o10;
        r6 r6Var;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            q5 q5Var = this.L0;
            if (q5Var != null) {
                q5Var.h();
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
            q5 q5Var2 = this.L0;
            if (q5Var2 == null || this.S1) {
                return;
            }
            q5Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.c0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                    r6 r6Var2 = this.H1;
                    if (r6Var2 == null || r6Var2.J0 == 0) {
                        h0(o10, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.K1 && !this.Z0.o()) {
                oh.t6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int B = B();
                oh.n6 o11 = storiesController.o();
                if (o11 == null || !o11.a(storiesController.a, B) || ((r6Var = this.H1) != null && (r6Var.g || r6Var.J0 != 0))) {
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
        f9 f9Var = this.y0;
        if ((f9Var != null && f9Var.isDual()) || this.X1) {
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
        ma maVar = this.B0;
        if (maVar.n != i10) {
            maVar.n = i10;
            ValueAnimator valueAnimator = maVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                maVar.r = null;
            }
            maVar.setDrawable(i10);
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
                this.n2 = new o8(this, z4, 0);
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
            b9 b9Var = this.J0;
            if (b9Var != null) {
                b9Var.H = false;
            }
            if (z4 && (o0Var = this.K0) != null) {
                o0Var.a(false);
            }
            s9 s9Var = this.r;
            if (s9Var != null) {
                s9Var.setImportantForAccessibility(z4 ? 4 : 0);
            }
            this.J0.setImportantForAccessibility(z4 ? 0 : 4);
            this.m2 = Boolean.valueOf(z4);
            float translationY = this.J0.getTranslationY();
            aa aaVar = this.n;
            float height = z4 ? 0.0f : (aaVar.getHeight() - this.J0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, aaVar.getHeight());
            b9 b9Var2 = this.J0;
            b9Var2.H = !z4;
            this.h2 = this.g2 == null;
            if (z4) {
                o1.j jVar2 = new o1.j(b9Var2, o1.h.n, height);
                this.l2 = jVar2;
                jVar2.u.a(0.75f);
                this.l2.u.b(350.0f);
                this.l2.a(new kg0(this, height, i11));
                this.l2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.k2 = ofFloat;
                ofFloat.addUpdateListener(new p8(this, i10));
                this.k2.addListener(new a9(this, i11));
                this.k2.setDuration(450L);
                this.k2.setInterpolator(pr.h);
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
            hj0 hj0Var = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.c1 = hj0Var;
            hj0Var.C *= 1.5f;
        }
        this.d1.setAnimation(this.c1);
        if (!z10) {
            this.c1.L(z4 ? 20 : 0, false, false);
            return;
        }
        if (z4) {
            hj0 hj0Var2 = this.c1;
            if (hj0Var2.Y > 20) {
                hj0Var2.L(0, false, false);
            }
            this.c1.N(20);
            this.c1.start();
            return;
        }
        hj0 hj0Var3 = this.c1;
        int i10 = hj0Var3.Y;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        hj0Var3.N(43);
        this.c1.start();
    }

    public final void g(float f10, boolean z4, Runnable runnable) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        s9 s9Var = this.r;
        if (!z4) {
            this.I = null;
            this.F = f10;
            k();
            s9Var.invalidate();
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
        ofFloat.addUpdateListener(new p8(this, 5));
        this.B.addListener(new mh.k5(this, f10, runnable, 4));
        if (f10 < 1.0f && this.v) {
            this.B.setDuration(250L);
            this.B.setInterpolator(pr.h);
        } else if (f10 > 0.0f || s9Var.a < AndroidUtilities.dp(20.0f)) {
            this.B.setDuration(300L);
            this.B.setInterpolator(new u1.a());
        } else if (f10 >= 0.0f || !this.L) {
            this.B.setDuration(400L);
            this.B.setInterpolator(pr.h);
        } else {
            this.B.setDuration(200L);
            this.B.setInterpolator(pr.h);
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
            e3 e3Var = this.i1;
            if (e3Var != null) {
                e3Var.e(true);
            }
            e3 e3Var2 = this.j1;
            if (e3Var2 != null) {
                e3Var2.e(true);
            }
            e3 e3Var3 = this.h1;
            if (e3Var3 != null) {
                e3Var3.e(true);
            }
            e3 e3Var4 = this.T0;
            if (e3Var4 != null) {
                e3Var4.e(true);
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
        u8 u8Var = this.N0;
        d3 d3Var = this.R0;
        d3 d3Var2 = this.Q0;
        if (!z10) {
            d3Var2.setAlpha((z4 && this.c0 == 0 && !I()) ? 1.0f : 0.0f);
            d3Var2.setTranslationY((z4 && this.c0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            d3Var.setAlpha((!z4 && this.c0 == 0 && I()) ? 0.6f : 0.0f);
            d3Var.setTranslationY((!z4 && this.c0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            u8Var.setAlpha((z4 || this.c0 != 0 || I()) ? 0.0f : 1.0f);
            u8Var.setTranslationY((z4 || this.c0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d3Var2, (Property<d3, Float>) property, (z4 && this.c0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(d3Var2, (Property<d3, Float>) property2, (z4 && this.c0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property, (!z4 && this.c0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property2, (!z4 && this.c0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(u8Var, (Property<u8, Float>) property, (z4 || this.c0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(u8Var, (Property<u8, Float>) property2, (z4 || this.c0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.W1.setDuration(260L);
        this.W1.setInterpolator(pr.h);
        this.W1.start();
    }

    public final void h0(oh.n6 n6Var, boolean z4) {
        if (this.w2) {
            return;
        }
        h9 h9Var = new h9(n6Var.b(), this.c, this.b, new g9(this, 0), null);
        h9Var.U = B();
        h9Var.setOnDismissListener(new f80(2, this, z4));
        this.U0.x(7, true);
        this.w2 = true;
        h9Var.show();
    }

    public final void i(Runnable runnable) {
        r6 r6Var;
        Runnable runnable2;
        p9 p9Var;
        pf0 pf0Var = this.y1;
        if (pf0Var == null || (r6Var = this.H1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        r6Var.j = pf0Var.d() | r6Var.j;
        r6 r6Var2 = this.H1;
        pf0 pf0Var2 = this.y1;
        File file = r6Var2.Z0;
        if (file != null) {
            file.delete();
            r6Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = pf0Var2.getSavedFilterState();
        r6Var2.a1 = savedFilterState;
        if (r6Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = pf0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = r6Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, r6Var2.k0 / 2.0f, r6Var2.l0 / 2.0f);
                    matrix.postRotate(-r6Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    r6Var2.n0.preScale(r6Var2.k0 / createBitmap.getWidth(), r6Var2.l0 / createBitmap.getHeight());
                    r6Var2.k0 = createBitmap.getWidth();
                    r6Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = r6Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        r6Var2.Z0.delete();
                    }
                    String k10 = r6.k(r6Var2.L);
                    boolean z4 = "png".equals(k10) || "webp".equals(k10);
                    r6Var2.Z0 = r6.w(r6Var2.a, z4 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z4 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(r6Var2.Z0));
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new dg.t0(r6Var2, createBitmap, z4, runnable2, 26));
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
            r6 r6Var3 = this.H1;
            if (r6Var3.K || (p9Var = this.U0) == null) {
                return;
            }
            p9Var.set(r6Var3);
        }
    }

    public final void i0(boolean z4, boolean z10) {
        if (this.a2 == z4) {
            return;
        }
        this.a2 = z4;
        if (z10) {
            this.G0.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(pr.h).withEndAction(new o8(this, z4, 1)).start();
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
                f8 f8Var = new f8(this, 25);
                this.b2 = f8Var;
                AndroidUtilities.runOnUIThread(f8Var, 2000L);
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
        this.c2.addListener(new vd1(13, this, z4));
        this.c2.start();
        if (z4) {
            f8 f8Var2 = new f8(this, 26);
            this.b2 = f8Var2;
            AndroidUtilities.runOnUIThread(f8Var2, 2000L);
        }
    }

    public final void k() {
        oh.j3 j3Var;
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
        w9 w9Var = this.C;
        if (w9Var != null && (j3Var = w9Var.f) != null) {
            j3Var.setTranslationX((rectF.left - rectF2.left) * this.F);
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
        c8 c8Var = this.n0;
        if (c8Var != null) {
            c8Var.dismiss();
            this.n0 = null;
        }
        c8 c8Var2 = new c8(this.b, 86400, this.a);
        c8Var2.o1();
        c8Var2.q1(this.v0);
        TLRPC.InputPeer inputPeer = this.u0;
        if (inputPeer == null) {
            inputPeer = this.K != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.K) : new TLRPC.TL_inputPeerSelf();
        }
        c8Var2.p1(inputPeer);
        c8Var2.C = this.J;
        c8Var2.R = new g8(this, 18);
        c8Var2.e1(false);
        c8Var2.m1(1);
        c8Var2.k1(false);
        c8Var2.T = new g8(this, 19);
        c8Var2.Q = new n8(this, 12);
        this.n0 = c8Var2;
        c8Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        r6 r6Var;
        ImageReceiver photoImage;
        if (this.s1 == null || (r6Var = this.H1) == null) {
            return;
        }
        r6Var.f();
        this.H1.j |= this.s1.u0();
        r6 r6Var2 = this.H1;
        ArrayList arrayList = r6Var2.T0;
        if (arrayList == null) {
            r6Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        e9 e9Var = this.s1;
        r6 r6Var3 = this.H1;
        e9Var.t0(r6Var3.T0, false, false, false, false, r6Var3);
        r6 r6Var4 = this.H1;
        if (!r6Var4.K) {
            r6Var4.S0 = Utilities.clamp(this.s1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.s1.getMasks();
        this.H1.U0 = masks != null ? new ArrayList(masks) : null;
        r6 r6Var5 = this.H1;
        boolean z4 = r6Var5.K;
        boolean E = r6Var5.E();
        this.H1.T0 = new ArrayList();
        e9 e9Var2 = this.s1;
        r6 r6Var6 = this.H1;
        Bitmap t02 = e9Var2.t0(r6Var6.T0, true, false, false, !z4, r6Var6);
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
        r6 r6Var7 = this.H1;
        r6Var7.P0 = null;
        r6Var7.R0 = null;
        r6Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        r6 r6Var8 = this.H1;
        r6Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, r6Var8.i0, r6Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        r6 r6Var9 = this.H1;
        if (r6Var9.u) {
            File file4 = r6Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.H1.Y0 = null;
            }
            r6 r6Var10 = this.H1;
            long j10 = r6Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = r6Var10.x0;
                if (drawable == null) {
                    drawable = i5.e(null, i10, j10, this.Z1);
                }
                if (drawable != null) {
                    this.H1.Y0 = r6.w(i10, "webp");
                    r6 r6Var11 = this.H1;
                    Bitmap createBitmap = Bitmap.createBitmap(r6Var11.i0, r6Var11.j0, Bitmap.Config.ARGB_8888);
                    r6.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.Y0));
                        } finally {
                            if (!createBitmap.isRecycled()) {
                                createBitmap.recycle();
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
        }
        r6 r6Var12 = this.H1;
        if (r6Var12.u) {
            File file5 = r6Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.H1.X0 = null;
            }
            r6 r6Var13 = this.H1;
            if (r6Var13.u && r6Var13.K) {
                int i11 = r6Var13.k0;
                int i12 = r6Var13.l0;
                eg.y1 s02 = this.s1.s0();
                if (s02 != null) {
                    eg.r1 r1Var = s02.o0;
                    if (r1Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((r1Var.getChildAt(0) instanceof org.telegram.ui.Cells.t1) && (photoImage = ((org.telegram.ui.Cells.t1) r1Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
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
                                this.H1.X0 = r6.w(i10, "webp");
                                createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.X0));
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                this.H1.X0 = null;
                            }
                            createBitmap2.recycle();
                        }
                    }
                }
            }
        }
        if (!E) {
            e9 e9Var3 = this.s1;
            ArrayList arrayList2 = new ArrayList();
            r6 r6Var14 = this.H1;
            int i17 = r6Var14.i0;
            Bitmap t03 = e9Var3.t0(arrayList2, false, true, false, false, r6Var14);
            r6 r6Var15 = this.H1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            r6 r6Var16 = this.H1;
            r6Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, r6Var16.i0, r6Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.s1.L0.getPainting().E) {
            Bitmap blurBitmap = this.s1.getBlurBitmap();
            r6 r6Var17 = this.H1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            r6 r6Var18 = this.H1;
            r6Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, r6Var18.i0, r6Var18.j0, 87, false, 101, 101), true);
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
        k9 k9Var;
        int i11;
        float f11;
        l9 l9Var;
        int i12;
        float f12;
        r6 r6Var;
        ImageView imageView;
        int i13;
        int i14;
        float f13;
        gf0 gf0Var;
        ef0 ef0Var;
        ImageView imageView2;
        int i15;
        r6 r6Var2;
        e9 e9Var;
        e9 e9Var2;
        int i16 = this.d0;
        if (i16 == i10 && !z4) {
            return;
        }
        q9 q9Var = this.Z0;
        if (i10 != -1 && q9Var != null && q9Var.L1) {
            return;
        }
        this.d0 = i10;
        AnimatorSet animatorSet = this.o2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.o2 = null;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.m0;
        la laVar = this.W0;
        n0 n0Var = this.b1;
        a2 a2Var = this.k0;
        fg.i0 i0Var = this.g1;
        kj0 kj0Var = this.d1;
        if (i16 != i10) {
            if (i10 == -1) {
                a2Var.setVisibility(0);
                q9Var.setVisibility(0);
                e9 e9Var3 = this.s1;
                if (e9Var3 != null) {
                    e9Var3.D0(null, true);
                }
                n0Var.setVisibility(0);
                r6 r6Var3 = this.H1;
                if (r6Var3 == null || !r6Var3.u) {
                    ImageView imageView3 = this.f1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    G().setVisibility(0);
                    o0(false);
                }
                l5Var.setVisibility(0);
                if (this.L1 == 1) {
                    kj0Var.setVisibility(0);
                    i0Var.setVisibility(0);
                } else {
                    r6 r6Var4 = this.H1;
                    if (r6Var4 != null && !TextUtils.isEmpty(r6Var4.y)) {
                        kj0Var.setVisibility(8);
                        i0Var.setVisibility(0);
                    }
                }
                laVar.setVisibility(0);
            }
            if (i10 == 0 && (e9Var2 = this.s1) != null) {
                e9Var2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (e9Var = this.s1) != null) {
                e9Var.a1.setLayerType(2, null);
            }
            e9 e9Var4 = this.s1;
            if (e9Var4 != null) {
                e9Var4.L1.b(i10 != 0);
            }
            q9Var.I.b(i10 != -1);
            ic.e();
            if (this.y1 != null && i16 == 1) {
                i(null);
            }
            nf0 nf0Var = this.z1;
            if (nf0Var != null) {
                nf0Var.setAllowTouch(false);
            }
            this.h1.e(true);
            aa aaVar = this.n;
            p9 p9Var = this.U0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.o1 == null) {
                    k9 k9Var2 = new k9(this, activity, p9Var);
                    this.o1 = k9Var2;
                    aaVar.addView(k9Var2.d);
                    aaVar.addView(this.o1);
                }
                this.o1.setVisibility(0);
                r6 r6Var5 = this.H1;
                if (r6Var5 != null) {
                    this.o1.setEntry(r6Var5);
                }
            } else if (i16 == 3) {
                p9Var.b();
                k9 k9Var3 = this.o1;
                if (k9Var3 != null) {
                    k9Var3.a.setCropEditorDrawing(k9Var3);
                    k9Var3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.p1 == null) {
                    l9 l9Var2 = new l9(this, activity, p9Var);
                    this.p1 = l9Var2;
                    aaVar.addView(l9Var2.e);
                    aaVar.addView(this.p1);
                }
                this.p1.setVisibility(0);
            } else if (i16 == 4) {
                p9Var.b();
                l9 l9Var3 = this.p1;
                if (l9Var3 != null) {
                    l9Var3.B = true;
                }
            }
        }
        this.Y0.b((i10 == -1 || i10 == 2) && this.F > 0.0f, z10);
        ArrayList arrayList = new ArrayList();
        pf0 pf0Var = this.y1;
        boolean z12 = pf0Var == null && i10 == 1;
        float f14 = 1.0f;
        if (i10 == 1) {
            s();
            pf0 pf0Var2 = this.y1;
            this.s2 = pf0Var2;
            FrameLayout toolsView = pf0Var2 != null ? pf0Var2.getToolsView() : null;
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
            if (i16 == 1 && pf0Var != null) {
                this.s2 = null;
                z11 = z12;
                arrayList.add(ObjectAnimator.ofFloat(pf0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.y1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    u();
                    this.s2 = this.s1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(a2Var, (Property<a2, Float>) property, f10));
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
                    arrayList.add(ObjectAnimator.ofFloat(a2Var, (Property<a2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getTopLayout(), (Property<View, Float>) property3, f10));
                    View topLayout2 = this.s1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getBottomLayout(), (Property<View, Float>) property3, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.s1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                k9Var = this.o1;
                if (k9Var == null) {
                    zf.e eVar = k9Var.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<zf.e, Float>) property5, 0.0f, 1.0f));
                        zf.e eVar2 = this.o1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<zf.e, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new p8(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i11 = 2;
                        f11 = 52.0f;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<zf.e, Float>) property7, 1.0f, 0.0f));
                            zf.e eVar3 = this.o1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(eVar3, (Property<zf.e, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.o1.n, (Property<FrameLayout, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.o1.getAppearProgress(), f10);
                            ofFloat2.addUpdateListener(new p8(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i11 = 2;
                    f11 = 52.0f;
                }
                l9Var = this.p1;
                if (l9Var != null) {
                    zf.e eVar4 = l9Var.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<zf.e, Float>) property9, fArr));
                        zf.e eVar5 = this.p1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f11);
                        fArr2[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(eVar5, (Property<zf.e, Float>) property10, fArr2));
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
                        ofFloat3.addUpdateListener(new p8(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<zf.e, Float>) property11, fArr6));
                        zf.e eVar6 = this.p1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f11);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f10;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(eVar6, (Property<zf.e, Float>) property12, fArr7));
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
                        ofFloat4.addUpdateListener(new p8(this, 4));
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
                        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.L1 == i12 || !((r6Var = this.H1) == null || TextUtils.isEmpty(r6Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                        imageView = this.f1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (r6Var2 = this.H1) != null && r6Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.c0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property13, fArr12));
                        m9 m9Var = this.e0;
                        if (i10 == i13) {
                            m9Var.setPivotY(m9Var.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            m9Var.setPivotY(m9Var.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            m9Var.setPivotY(0.0f);
                            i14 = laVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f13 = (r10 - i14) / (m9Var.getHeight() - ((int) m9Var.getPivotY()));
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(m9Var, (Property<m9, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(m9Var, (Property<m9, Float>) View.SCALE_Y, f13));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(m9Var, (Property<m9, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        gf0Var = this.C1;
                        if (gf0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(gf0Var, (Property<gf0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        ef0Var = this.B1;
                        if (ef0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ef0Var, (Property<ef0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                        n9 n9Var = this.i0;
                        arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property14, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f14 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.V0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f14));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + q9Var.getEditTextHeight()))));
                        LinearLayout linearLayout = this.g0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.f1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.o0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new d9(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (laVar != null) {
                            r6 r6Var6 = this.H1;
                            boolean z13 = r6Var6 == null || !r6Var6.v() || !this.H1.t() || i10 == 2;
                            if (laVar.g0 != z13 || !z10) {
                                laVar.g0 = z13;
                                if (!z10) {
                                    laVar.f0.f(z13, true);
                                }
                                laVar.invalidate();
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
                        this.o2.setInterpolator(pr.h);
                        this.o2.addListener(new z8(this, i16, i10, 1));
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
                arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.L1 == i12 || !((r6Var = this.H1) == null || TextUtils.isEmpty(r6Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                imageView = this.f1;
                if (imageView != null) {
                }
                int i172 = this.c0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property13, fArr122));
                m9 m9Var2 = this.e0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(m9Var2, (Property<m9, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(m9Var2, (Property<m9, Float>) View.SCALE_Y, f13));
                if (i10 == -1) {
                }
                gf0Var = this.C1;
                if (gf0Var != null) {
                }
                ef0Var = this.B1;
                if (ef0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                n9 n9Var2 = this.i0;
                arrayList.add(ObjectAnimator.ofFloat(n9Var2, (Property<n9, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(n9Var2, (Property<n9, Float>) property142, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f14 = 0.0f;
                }
                FrameLayout frameLayout32 = this.V0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f14));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + q9Var.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.g0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                imageView2 = this.f1;
                if (imageView2 != null) {
                }
                if (this.o0.c()) {
                }
                if (laVar != null) {
                }
                if (!z10) {
                }
            }
        }
        z11 = z12;
        if (i10 != 0) {
        }
        k9Var = this.o1;
        if (k9Var == null) {
        }
        l9Var = this.p1;
        if (l9Var != null) {
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
        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property132, ((i10 != -1 || i10 == 2) && (this.L1 == i12 || !((r6Var = this.H1) == null || TextUtils.isEmpty(r6Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
        imageView = this.f1;
        if (imageView != null) {
        }
        int i1722 = this.c0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property132, fArr1222));
        m9 m9Var22 = this.e0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(m9Var22, (Property<m9, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(m9Var22, (Property<m9, Float>) View.SCALE_Y, f13));
        if (i10 == -1) {
        }
        gf0Var = this.C1;
        if (gf0Var != null) {
        }
        ef0Var = this.B1;
        if (ef0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property132, i10 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
        n9 n9Var22 = this.i0;
        arrayList.add(ObjectAnimator.ofFloat(n9Var22, (Property<n9, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(n9Var22, (Property<n9, Float>) property1422, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.V0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f14));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + q9Var.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.g0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        imageView2 = this.f1;
        if (imageView2 != null) {
        }
        if (this.o0.c()) {
        }
        if (laVar != null) {
        }
        if (!z10) {
        }
    }

    public final void m() {
        r6 r6Var;
        if (this.s1 == null || (r6Var = this.H1) == null || !r6Var.u) {
            return;
        }
        File file = r6Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            this.H1.W0 = null;
        }
        this.H1.W0 = r6.w(this.c, "webp");
        e9 e9Var = this.s1;
        r6 r6Var2 = this.H1;
        Bitmap t02 = e9Var.t0(r6Var2.T0, false, false, true, this.L1 != 1, r6Var2);
        try {
            try {
                t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.W0));
                if (t02.isRecycled()) {
                    return;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                try {
                    this.H1.W0.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
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
        f9 f9Var;
        boolean z10 = false;
        i0(this.c0 == 0 && this.L1 == 1 && !this.F0.e && !I(), z4);
        this.D0.setSelected(this.x0.j());
        u uVar = this.F0;
        c0(this.k0, uVar == null || !uVar.e, z4);
        c0(this.B0, (this.X1 || this.L1 == -1 || this.c0 != 0 || this.V1 == null || this.F0.e || I()) ? false : true, z4);
        c0(this.C0, (this.X1 || this.L1 == -1 || this.c0 != 0 || (f9Var = this.y0) == null || !f9Var.a || this.F0.e || this.x0.j()) ? false : true, z4);
        c0(this.D0, (this.X1 || this.L1 == -1 || this.c0 != 0 || this.F0.e) ? false : true, z4);
        c0(this.E0, this.F0.e, z4);
        this.L0.e(this.x0.j() ? this.x0.getFilledProgress() : 0.0f, z4);
        boolean z11 = this.F0.e;
        e3 e3Var = this.k1;
        if (z11) {
            e3Var.u();
        } else {
            e3Var.e(true);
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
        org.telegram.ui.k3 k3Var = this.F0.a;
        k3Var.setPadding((int) ((this.k0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) (alpha4 + AndroidUtilities.dp(8.0f)), 0);
        k3Var.invalidate();
    }

    public final void o() {
        boolean z4 = this.H != 0.0f || this.F < 1.0f || this.y2;
        if (z4 == this.x2) {
            return;
        }
        lf.s0 s0Var = this.y;
        if (s0Var != null) {
            s0Var.a(!z4);
        }
        this.x2 = z4;
    }

    public final void o0(boolean z4) {
        hj0 hj0Var = this.e1;
        if (hj0Var != null) {
            int[] iArr = hj0Var.e;
            int i10 = 0;
            if (!z4) {
                r6 r6Var = this.H1;
                int i11 = (r6Var == null || !r6Var.y0) ? 0 : iArr[0] - 1;
                hj0Var.L(i11, false, true);
                this.e1.N(i11);
                ImageView imageView = this.f1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            r6 r6Var2 = this.H1;
            if (r6Var2 != null && r6Var2.y0) {
                i10 = iArr[0];
            }
            hj0Var.N(i10);
            hj0 hj0Var2 = this.e1;
            if (hj0Var2 != null) {
                hj0Var2.start();
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
            c2 c2Var = this.s;
            c2Var.o = f10;
            c2Var.n = c2.f(f10);
            c2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            c2 c2Var2 = this.s;
            c2Var2.p = f11;
            c2Var2.i();
        }
    }

    public final void p0() {
        if (this.T1) {
            return;
        }
        this.T1 = true;
        f8 f8Var = new f8(this, 2);
        e9 e9Var = this.s1;
        r6 r6Var = this.H1;
        if (e9Var == null || r6Var == null) {
            f8Var.run();
            return;
        }
        r6Var.f();
        boolean u02 = e9Var.u0();
        boolean z4 = e9Var.L0.getPainting().E;
        Utilities.searchQueue.postRunnable(new i8(this, e9Var, r6Var.i0, r6Var.j0, r6Var, z4, u02, f8Var, 1));
    }

    public final void q(boolean z4) {
        p9 p9Var;
        if (this.d) {
            c8 c8Var = this.n0;
            if (c8Var != null) {
                c8Var.dismiss();
                this.n0 = null;
            }
            r6 r6Var = this.H1;
            long j10 = 0;
            if (r6Var != null && !r6Var.h) {
                if ((this.v && r6Var.g) || r6Var.b != 0) {
                    r6Var.j = false;
                }
                r6Var.i(false);
            }
            this.H1 = null;
            Utilities.Callback4 callback4 = this.O;
            if (callback4 == null || (p9Var = this.U0) == null) {
                p9 p9Var2 = this.U0;
                if (p9Var2 != null && !z4) {
                    p9Var2.set(null);
                }
                g(0.0f, z4, new f8(this, 23));
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
            j71 j71Var = p9Var.y;
            if (j71Var != null) {
                j71Var.B();
                p9Var.y.H();
                p9Var.y = null;
            }
            j71 j71Var2 = p9Var.x;
            if (j71Var2 != null) {
                j10 = j71Var2.n();
                p9Var.x.B();
                p9Var.x.H();
                p9Var.x = null;
            }
            j71 j71Var3 = p9Var.e;
            if (j71Var3 != null) {
                j10 = j71Var3.n();
                p9Var.e.B();
                p9Var.e.H();
                p9Var.e = null;
            }
            callback4.run(Long.valueOf(j10), new o8(this, z4, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        f9 f9Var;
        if ((!this.M1 && !this.N1) || (f9Var = this.y0) == null || !f9Var.isFrontface()) {
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
        this.y0 = new f9(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        q5 q5Var = this.L0;
        if (q5Var != null) {
            q5Var.d0 = 0.0f;
            q5Var.e0.d(0.0f, true);
        }
        this.y0.recordHevc = !this.x0.j();
        this.y0.setThumbDrawable(A());
        this.y0.initTexture();
        this.y0.setDelegate(new n8(this, 0));
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
            this.z0 = new m5(activity, new g8(this, 3));
        }
        this.z0.a(this.y0);
        a6 a6Var = this.A0;
        if (a6Var != null) {
            o9 o9Var = this.x0;
            Object blurRenderNode = o9Var.getBlurRenderNode();
            a6Var.C = o9Var;
            a6Var.D = blurRenderNode;
            a6Var.invalidate();
        }
    }

    public final void s() {
        r6 r6Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.y1 != null || (r6Var = this.H1) == null) {
            return;
        }
        if (r6Var.K) {
            bitmap = null;
        } else {
            if (r6Var.Z0 == null) {
                q10 = this.U0.getPhotoBitmap();
            } else {
                n8 n8Var = new n8(this, 11);
                Point point = AndroidUtilities.displaySize;
                q10 = r6.q(n8Var, point.x, point.y, 0, true);
            }
            bitmap = q10;
        }
        if (bitmap != null || this.H1.K) {
            x61 textureView = this.U0.getTextureView();
            int orientation = this.U0.getOrientation();
            r6 r6Var2 = this.H1;
            pf0 pf0Var = new pf0(this.b, textureView, bitmap, null, orientation, r6Var2 != null ? r6Var2.a1 : null, null, 0, false, false, this.o0, this.a);
            this.y1 = pf0Var;
            this.r.addView(pf0Var);
            nf0 nf0Var = this.z1;
            if (nf0Var != null) {
                nf0Var.setFilterView(this.y1);
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
            ef0 blurControl = this.y1.getBlurControl();
            this.B1 = blurControl;
            if (blurControl != null) {
                this.e0.addView(blurControl);
            }
            gf0 curveControl = this.y1.getCurveControl();
            this.C1 = curveControl;
            if (curveControl != null) {
                this.e0.addView(curveControl);
            }
            V();
            this.y1.getDoneTextView().setOnClickListener(new h8(this, 13));
            this.y1.getCancelTextView().setOnClickListener(new h8(this, 14));
            this.y1.getToolsView().setVisibility(8);
            this.y1.getToolsView().setAlpha(0.0f);
            this.y1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.y1.f0.setVisibility(0);
        }
    }

    public final void t(boolean z4) {
        if (this.J0 != null) {
            o9 o9Var = this.x0;
            if ((o9Var != null && o9Var.j()) == this.J0.M) {
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
        o9 o9Var2 = this.x0;
        b9 b9Var = new b9(this, this.c, this.b, this.a, albumEntry, z4, z10, o9Var2 != null && o9Var2.j());
        this.J0 = b9Var;
        b9Var.D.setVisibility(8);
        this.J0.setMultipleOnClick(this.x0.j());
        this.J0.setMaxCount(Math.min(10, r.b() - this.x0.getFilledCount()));
        int i10 = 1;
        this.J0.setOnBackClickListener(new s8(this, i10));
        this.J0.setOnSelectListener(new ry0(z4, this, i10));
        this.J0.setOnSelectMultipleListener(new mh.n1(this, 2));
        f2.i0 i0Var = this.i2;
        if (i0Var != null) {
            l2 l2Var = this.J0.e;
            l2Var.B = i0Var;
            l2Var.l0();
        }
        this.n.addView(this.J0, k7.c6.e(-1, -1, 119));
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
        r6 r6Var;
        File file;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        boolean z13;
        r6 r6Var2;
        dg.o1 renderView;
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
        r6 r6Var3 = this.H1;
        Bitmap decodeFile = (r6Var3 == null || !(r6Var3.c || r6Var3.g || this.E1 != null) || (file3 = r6Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        r6 r6Var4 = this.H1;
        if (r6Var4 == null || (!(r6Var4.c || r6Var4.g || this.E1 != null) || (file2 = r6Var4.Q0) == null)) {
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
                r6Var = this.H1;
                if (r6Var != null || r6Var.M) {
                    file = null;
                    z10 = false;
                } else {
                    file = null;
                    z10 = true;
                }
                File file4 = r6Var != null ? file : r6Var.L;
                if (r6Var == null && r6Var.K) {
                    z11 = z4;
                    z12 = true;
                } else {
                    z11 = z4;
                    z12 = false;
                }
                if (r6Var != null || r6Var.J0 == 0) {
                    obj = file;
                    z13 = false;
                } else {
                    obj = file;
                    z13 = true;
                }
                int orientation = this.U0.getOrientation();
                r6Var2 = this.H1;
                Object obj2 = obj;
                if (r6Var2 != null) {
                    obj2 = r6Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                h5 h5Var = this.p0;
                p9 p9Var = this.U0;
                Activity activity = this.b;
                boolean z14 = z11;
                e9 e9Var = new e9(this, activity, z10, file4, z12, z13, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, r6Var2, measuredWidth, measuredHeight, cropState, this.o0, this.a, h5Var, p9Var);
                this.s1 = e9Var;
                r6 r6Var5 = this.H1;
                e9Var.setHasAudio(r6Var5 == null && r6Var5.y != null);
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
                this.s1.setOnDoneButtonClickedListener(new f8(this, 21));
                this.s1.setOnCancelButtonClickedListener(new f8(this, 22));
                e9 e9Var2 = this.s1;
                e9Var2.O0.setVisibility(0);
                e9Var2.L0.setVisibility(0);
                e9Var2.M0.setVisibility(0);
            }
        }
        z4 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.e0.getMeasuredWidth();
        int measuredHeight2 = this.e0.getMeasuredHeight();
        r6Var = this.H1;
        if (r6Var != null) {
        }
        file = null;
        z10 = false;
        if (r6Var != null) {
        }
        if (r6Var == null) {
        }
        z11 = z4;
        z12 = false;
        if (r6Var != null) {
        }
        obj = file;
        z13 = false;
        int orientation2 = this.U0.getOrientation();
        r6Var2 = this.H1;
        Object obj22 = obj;
        if (r6Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        h5 h5Var2 = this.p0;
        p9 p9Var2 = this.U0;
        Activity activity2 = this.b;
        boolean z142 = z11;
        e9 e9Var3 = new e9(this, activity2, z10, file4, z12, z13, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, r6Var2, measuredWidth2, measuredHeight2, cropState2, this.o0, this.a, h5Var2, p9Var2);
        this.s1 = e9Var3;
        r6 r6Var52 = this.H1;
        e9Var3.setHasAudio(r6Var52 == null && r6Var52.y != null);
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
        this.s1.setOnDoneButtonClickedListener(new f8(this, 21));
        this.s1.setOnCancelButtonClickedListener(new f8(this, 22));
        e9 e9Var22 = this.s1;
        e9Var22.O0.setVisibility(0);
        e9Var22.L0.setVisibility(0);
        e9Var22.M0.setVisibility(0);
    }

    public final void v(boolean z4) {
        m5 m5Var = this.z0;
        if (m5Var != null) {
            m5Var.f = null;
            Utilities.globalQueue.cancelRunnable(m5Var.h);
            this.z0 = null;
            o9 o9Var = this.x0;
            if (o9Var != null) {
                o9Var.c.a(null);
            }
        }
        a6 a6Var = this.A0;
        if (a6Var != null) {
            a6Var.C = null;
            a6Var.D = null;
            a6Var.invalidate();
        }
        if (this.y0 != null) {
            if (z4) {
                b0(new f8(this, 8));
                return;
            }
            b0(new f8(this, 9));
            this.y0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.y0);
            o9 o9Var2 = this.x0;
            if (o9Var2 != null) {
                o9Var2.setCameraView(null);
            }
            this.y0 = null;
        }
    }

    public final void w() {
        b9 b9Var = this.J0;
        if (b9Var == null) {
            return;
        }
        this.n.removeView(b9Var);
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
        pf0 pf0Var = this.y1;
        if (pf0Var == null) {
            return;
        }
        pf0Var.e();
        this.z1.setFilterView(null);
        this.r.removeView(this.y1);
        TextureView textureView = this.A1;
        if (textureView != null) {
            this.e0.removeView(textureView);
            this.A1 = null;
        }
        this.U0.o(null, null);
        ef0 ef0Var = this.B1;
        if (ef0Var != null) {
            this.e0.removeView(ef0Var);
            this.B1 = null;
        }
        gf0 gf0Var = this.C1;
        if (gf0Var != null) {
            this.e0.removeView(gf0Var);
            this.C1 = null;
        }
        this.y1 = null;
    }

    public final void z() {
        e9 e9Var = this.s1;
        if (e9Var == null) {
            return;
        }
        e9Var.O0.removeAllViews();
        e9 e9Var2 = this.s1;
        e9Var2.L0.h();
        e9Var2.O0.setVisibility(8);
        e9Var2.N0.setVisibility(8);
        e9Var2.B0.postRunnable(new sj0(14));
        k4 k4Var = e9Var2.h2;
        if (k4Var != null) {
            k4Var.dismiss();
        }
        dg.e0 e0Var = e9Var2.Q1;
        if (e0Var != null) {
            e0Var.dismiss();
        }
        this.r.removeView(this.s1);
        this.s1 = null;
        dg.o1 o1Var = this.t1;
        if (o1Var != null) {
            this.e0.removeView(o1Var);
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
