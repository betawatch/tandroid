package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.PowerManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zb1 implements VoIPService.StateListener, org.telegram.messenger.cs, wf.a {
    public static zb1 o1;
    public boolean A0;
    public AnimatorSet B0;
    public boolean C0;
    public boolean D0;
    public org.telegram.ui.Components.voip.c0 E;
    public boolean E0;
    public TextView F;
    public boolean F0;
    public org.telegram.ui.Components.voip.w1 G;
    public float G0;
    public yb1 H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public boolean K0;
    public lg.k L;
    public long L0;
    public int M;
    public xg.e1 N;
    public org.telegram.ui.Components.voip.p1 N0;
    public s51 O;
    public org.telegram.ui.Components.zo O0;
    public FrameLayout P;
    public org.telegram.ui.Components.zo P0;
    public fi.j Q;
    public ValueAnimator Q0;
    public ci.t4 R;
    public gi.y4 S;
    public boolean S0;
    public TextView T;
    public org.telegram.ui.ActionBar.k2 U;
    public org.telegram.ui.Components.voip.j V;
    public boolean V0;
    public float W0;
    public float X0;
    public vb1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.c1 Z;
    public float Z0;
    public final int a;
    public org.telegram.ui.Components.voip.c1 a0;
    public float a1;
    public Activity b;
    public boolean b0;
    public boolean b1;
    public final TLRPC.User c;
    public TextureViewRenderer c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.z1 d0;
    public float d1;
    public org.telegram.ui.Components.voip.q2 e;
    public org.telegram.ui.Components.voip.z1 e0;
    public int e1;
    public org.telegram.ui.Components.voip.q2 f;
    public org.telegram.ui.Components.voip.e f0;
    public int f1;
    public boolean g0;
    public org.telegram.ui.Components.voip.q2 h;
    public uf.d h0;
    public boolean h1;
    public View i0;
    public boolean i1;
    public View j0;
    public ValueAnimator j1;
    public org.telegram.ui.Components.voip.y0 k0;
    public boolean k1;
    public org.telegram.ui.Components.voip.z1 l1;
    public b8.cg m1;
    public wb1 n;
    public boolean n0;
    public boolean n1;
    public boolean o0;
    public sb1 p0;
    public int q0;
    public int r0;
    public ub1 s;
    public WindowInsets s0;
    public boolean t0;
    public float u0;
    public rb1 v0;
    public org.telegram.ui.Components.voip.j2 w;
    public int w0;
    public org.telegram.ui.Components.voip.g2 x;
    public AccessibilityManager x0;
    public org.telegram.ui.Components.voip.k2 y;
    public final org.telegram.ui.Components.voip.x0 r = new org.telegram.ui.Components.voip.x0();
    public final org.telegram.ui.Components.k9[] W = new org.telegram.ui.Components.k9[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint l0 = new Paint();
    public final Paint m0 = new Paint();
    public boolean y0 = true;
    public float z0 = 1.0f;
    public final g2.g M0 = new g2.g((int[]) null);
    public final xy0 R0 = new xy0(this, 16);
    public final kb1 T0 = new kb1(this, 12);
    public final kb1 U0 = new kb1(this, 13);
    public float g1 = 1.0f;

    public zb1(int i3) {
        this.a = i3;
        this.c = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(org.telegram.messenger.h10.i(i3).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.r0 = -1;
        this.q0 = sharedState.getCallState();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.O4);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.M4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.E2);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.G5);
    }

    public static void a(zb1 zb1Var) {
        zb1 zb1Var2;
        int i3 = 0;
        if (zb1Var.h1) {
            zb1Var.h1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            zb1Var.j1 = ofFloat;
            zb1Var2 = zb1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.u(zb1Var2, zb1Var.g1, zb1Var.Z0, zb1Var.a1, 1));
            zb1Var2.j1.addListener(new ob1(zb1Var2, i3));
            zb1Var2.j1.setDuration(350L);
            zb1Var2.j1.setInterpolator(org.telegram.ui.Components.xq.f);
            zb1Var2.j1.start();
        } else {
            zb1Var2 = zb1Var;
        }
        zb1Var2.i1 = false;
        zb1Var2.b1 = false;
    }

    public static void k(int[] iArr, int i3) {
        zb1 zb1Var = o1;
        if (zb1Var != null) {
            if (i3 == 101) {
                if (VoIPService.getSharedState() == null) {
                    zb1Var.v0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    zb1Var.n(new hb1(0));
                } else if (!zb1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.n1.h(zb1Var.b, new kb1(zb1Var, 2), i3);
                    return;
                }
            }
            if (i3 == 102) {
                if (VoIPService.getSharedState() == null) {
                    zb1Var.v0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    zb1Var.B();
                }
            }
        }
    }

    public static void v(Activity activity, int i3) {
        zb1 zb1Var = o1;
        if (zb1Var != null && zb1Var.v0.getParent() == null) {
            zb1 zb1Var2 = o1;
            if (zb1Var2 != null) {
                zb1Var2.d0.d.release();
                o1.e0.d.release();
                o1.c0.release();
                rb1 rb1Var = o1.v0;
                if (rb1Var != null) {
                    rb1Var.d();
                }
                o1.d();
            }
            o1 = null;
        }
        if (o1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.u1.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        zb1 zb1Var3 = new zb1(i3);
        zb1Var3.b = activity;
        o1 = zb1Var3;
        rb1 rb1Var2 = new rb1(activity, !z10, zb1Var3);
        o1.K0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        o1.getClass();
        rb1Var2.setLockOnScreen(o1.K0);
        zb1Var3.v0 = rb1Var2;
        ib1 ib1Var = new ib1(zb1Var3, 4);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(rb1Var2, ib1Var);
        ((WindowManager) activity.getSystemService("window")).addView(rb1Var2, org.telegram.ui.Components.voip.d2.a());
        zb1Var3.u0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        zb1Var3.x0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        ub1 ub1Var = new ub1(zb1Var3, activity);
        ub1Var.setClipToPadding(false);
        ub1Var.setClipChildren(false);
        ub1Var.setBackgroundColor(-16777216);
        zb1Var3.F();
        zb1Var3.s = ub1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.x0 x0Var = zb1Var3.r;
        zb1Var3.w = new org.telegram.ui.Components.voip.j2(activity, z11, x0Var);
        org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(activity, false, true, false, false);
        zb1Var3.d0 = z1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        z1Var.d.setScalingType(scalingType);
        zb1Var3.d0.d.setEnableHardwareScaler(true);
        zb1Var3.d0.d.setRotateTextureWithScreen(true);
        zb1Var3.d0.b0 = 1;
        ub1Var.addView(zb1Var3.w, b8.mf.c(-1.0f, -1));
        TLRPC.User user = zb1Var3.d;
        org.telegram.ui.Components.voip.g2 g2Var = new org.telegram.ui.Components.voip.g2(activity, user, x0Var);
        zb1Var3.x = g2Var;
        ub1Var.addView(g2Var, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.voip.k2 k2Var = new org.telegram.ui.Components.voip.k2(activity);
        if (org.telegram.messenger.lc.e(512)) {
            int i10 = org.telegram.ui.ActionBar.k6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i11 == 11 && i12 >= 24 && i12 <= 31) || (i11 == 0 && i12 == 1)) {
                k2Var.a = new org.telegram.ui.Components.bu0(0);
            }
        }
        zb1Var3.y = k2Var;
        ub1Var.addView(k2Var, b8.mf.c(220.0f, -1));
        ub1Var.addView(zb1Var3.d0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.j9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Components.i9.w(0.5f, 1), new u61(zb1Var3, 1), 0L);
        org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(activity);
        zb1Var3.Z = c1Var;
        int i13 = 3;
        c1Var.setDelegate(new ib1(zb1Var3, i13));
        zb1Var3.Z.d(1.0f, 1.0f);
        zb1Var3.b0 = true;
        org.telegram.ui.Components.voip.z1 z1Var2 = new org.telegram.ui.Components.voip.z1(activity, true, false);
        zb1Var3.e0 = z1Var2;
        z1Var2.d.setIsCamera(true);
        zb1Var3.e0.d.setUseCameraRotation(true);
        zb1Var3.Z.setOnTapListener(new lb1(zb1Var3, 1));
        zb1Var3.e0.d.setMirror(true);
        zb1Var3.Z.addView(zb1Var3.e0);
        org.telegram.ui.Components.voip.c1 c1Var2 = new org.telegram.ui.Components.voip.c1(activity);
        zb1Var3.a0 = c1Var2;
        c1Var2.T = true;
        c1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        zb1Var3.c0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        zb1Var3.c0.setIsCamera(false);
        zb1Var3.c0.setFpsReduction(30.0f);
        zb1Var3.c0.setScalingType(scalingType);
        zb1Var3.a0.addView(zb1Var3.c0, b8.mf.e(-1, -2, 17));
        zb1Var3.a0.setOnTapListener(new lb1(zb1Var3, 2));
        zb1Var3.a0.setVisibility(8);
        ub1Var.addView(zb1Var3.Z, b8.mf.c(-2.0f, -2));
        ub1Var.addView(zb1Var3.a0);
        View view = new View(activity);
        zb1Var3.i0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, org.telegram.messenger.hs.L1)}));
        ub1Var.addView(zb1Var3.i0, b8.mf.e(-1, org.telegram.messenger.hs.q2, 80));
        View view2 = new View(activity);
        zb1Var3.j0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, org.telegram.messenger.hs.n1), 0}));
        ub1Var.addView(zb1Var3.j0, b8.mf.e(-1, org.telegram.messenger.hs.q2, 48));
        s51 s51Var = new s51(23, activity, zb1Var3);
        zb1Var3.O = s51Var;
        s51Var.setOrientation(0);
        zb1Var3.O.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
        zb1Var3.O.setClipToPadding(false);
        zb1Var3.O.setContentDescription(org.telegram.messenger.bd.M0(2131743312, null));
        zb1Var3.O.setOnClickListener(new lb1(zb1Var3, i13));
        zb1Var3.Q = new fi.j(activity, x0Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        zb1Var3.P = frameLayout;
        frameLayout.addView(zb1Var3.Q, b8.mf.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        zb1Var3.P.setVisibility(8);
        zb1Var3.P.setOnClickListener(new lb1(zb1Var3, 4));
        gi.y4 y4Var = new gi.y4(activity, x0Var);
        zb1Var3.S = y4Var;
        y4Var.setOrientation(1);
        TextView textView = new TextView(activity);
        zb1Var3.T = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131743501, null));
        zb1Var3.T.setTextSize(1, 15.0f);
        zb1Var3.T.setTypeface(org.telegram.messenger.g0.o());
        zb1Var3.T.setTextColor(-1);
        zb1Var3.T.setGravity(17);
        org.telegram.ui.ActionBar.k2 k2Var2 = new org.telegram.ui.ActionBar.k2(8, activity, zb1Var3);
        zb1Var3.U = k2Var2;
        k2Var2.setTextSize(1, 15.0f);
        zb1Var3.U.setTextColor(-1);
        zb1Var3.U.setGravity(17);
        zb1Var3.U.setText(org.telegram.messenger.bd.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.l10.j(user, true), zb1Var3.U.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
        zb1Var3.S.setVisibility(8);
        zb1Var3.S.addView(zb1Var3.T);
        zb1Var3.S.addView(zb1Var3.U, b8.mf.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        zb1Var3.S.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
        int i14 = 0;
        while (i14 < 4) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
            org.telegram.ui.Components.k9[] k9VarArr = zb1Var3.W;
            k9VarArr[i14] = k9Var;
            k9VarArr[i14].getImageReceiver().S0 = true;
            zb1Var3.O.addView(k9VarArr[i14], b8.mf.k(i14 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i14++;
        }
        vb1 vb1Var = new vb1(zb1Var3, activity);
        zb1Var3.Y = vb1Var;
        vb1Var.setOrientation(1);
        zb1Var3.Y.setFocusable(true);
        zb1Var3.Y.setFocusableInTouchMode(true);
        zb1Var3.E = new org.telegram.ui.Components.voip.c0(activity);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(user);
        org.telegram.ui.Components.voip.c0 c0Var = zb1Var3.E;
        int i15 = zb1Var3.a;
        c0Var.b.j(org.telegram.messenger.ac.m(i15, 0, user), null, u8Var, user);
        zb1Var3.E.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        zb1Var3.F = textView2;
        textView2.setTextSize(1, 28.0f);
        zb1Var3.F.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g5.m(0, user.first_name, user.last_name), zb1Var3.F.getPaint().getFontMetricsInt(), false, null, 0));
        zb1Var3.F.setMaxLines(2);
        zb1Var3.F.setEllipsize(TextUtils.TruncateAt.END);
        zb1Var3.F.setTextColor(-1);
        zb1Var3.F.setGravity(1);
        zb1Var3.F.setImportantForAccessibility(2);
        zb1Var3.Y.addView(zb1Var3.F, b8.mf.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.w1 w1Var = new org.telegram.ui.Components.voip.w1(activity);
        w1Var.a = new TextView[2];
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            w1Var.a[i16] = new TextView(activity);
            w1Var.a[i16].setTextSize(1, 15.0f);
            w1Var.a[i16].setTextColor(-1);
            w1Var.a[i16].setGravity(1);
            w1Var.addView(w1Var.a[i16]);
            i16++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        w1Var.c = frameLayout2;
        org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(w1Var, activity, x0Var);
        j0Var.setTextSize(1, 15.0f);
        j0Var.setTextColor(-1);
        j0Var.setGravity(1);
        j0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
        j0Var.setText(org.telegram.messenger.bd.M0(2131743227, null));
        frameLayout2.addView(j0Var, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        w1Var.addView(frameLayout2, b8.mf.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        w1Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        w1Var.addView(textView3, b8.mf.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131743263, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new lg.p1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.a2 a2Var = new org.telegram.ui.Components.voip.a2(activity);
        w1Var.d = a2Var;
        w1Var.addView(a2Var, b8.mf.c(-2.0f, -1));
        zb1Var3.G = w1Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        w1Var.setImportantForAccessibility(4);
        zb1Var3.Y.addView(zb1Var3.G, b8.mf.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            yb1 yb1Var = new yb1(activity);
            zb1Var3.H = yb1Var;
            long j10 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i18 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i18 > 0) {
                int max = Math.max(i18, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.w8 w8Var = yb1Var.b;
                w8Var.i(min);
                int i19 = 0;
                while (i19 < min) {
                    w8Var.j(i19, i15, org.telegram.messenger.hp.s1(i15).e2(org.telegram.messenger.m5.o(groupParticipants.get(i19).peer)));
                    i19++;
                    j10 = j10;
                }
                long j11 = j10;
                w8Var.a(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.m5.o(groupParticipants.get(0).peer) == j11))) {
                    yb1Var.setVisibility(8);
                } else {
                    yb1Var.c = new org.telegram.ui.Components.ly0(org.telegram.messenger.bd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                    yb1Var.setVisibility(0);
                    yb1Var.invalidate();
                }
            } else {
                yb1Var.setVisibility(8);
            }
            zb1Var3.Y.addView(zb1Var3.H, b8.mf.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        zb1Var3.Y.setClipChildren(false);
        zb1Var3.Y.setClipToPadding(false);
        zb1Var3.Y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
        zb1Var3.V = new org.telegram.ui.Components.voip.j(activity);
        zb1Var3.R = new ci.t4(activity, x0Var);
        zb1Var3.V.setAlpha(0.0f);
        zb1Var3.R.setVisibility(8);
        ub1Var.addView(zb1Var3.E, b8.mf.d(org.telegram.messenger.hs.i3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        ub1Var.addView(zb1Var3.Y, b8.mf.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        ub1Var.addView(zb1Var3.P, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ub1Var.addView(zb1Var3.S, b8.mf.d(org.telegram.messenger.hs.b5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        ub1Var.addView(zb1Var3.O, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ub1Var.addView(zb1Var3.V, b8.mf.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        ub1Var.addView(zb1Var3.R, b8.mf.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        zb1Var3.k0 = new org.telegram.ui.Components.voip.y0(activity);
        zb1Var3.e = new org.telegram.ui.Components.voip.q2(activity, x0Var);
        zb1Var3.f = new org.telegram.ui.Components.voip.q2(activity, x0Var);
        zb1Var3.h = new org.telegram.ui.Components.voip.q2(activity, x0Var);
        zb1Var3.n = new wb1(activity, 52.0f);
        zb1Var3.e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        zb1Var3.e.setScaleX(0.0f);
        zb1Var3.e.setScaleY(0.0f);
        zb1Var3.e.animate().setStartDelay(org.telegram.messenger.hs.g2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zb1Var3.f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        zb1Var3.f.setScaleX(0.0f);
        zb1Var3.f.setScaleY(0.0f);
        zb1Var3.f.animate().setStartDelay(org.telegram.messenger.hs.w2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zb1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        zb1Var3.h.setScaleX(0.0f);
        zb1Var3.h.setScaleY(0.0f);
        zb1Var3.h.animate().setStartDelay(org.telegram.messenger.hs.M2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zb1Var3.n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        zb1Var3.n.setScaleX(0.0f);
        zb1Var3.n.setScaleY(0.0f);
        zb1Var3.n.animate().setStartDelay(org.telegram.messenger.hs.c3).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zb1Var3.k0.addView(zb1Var3.e);
        zb1Var3.k0.addView(zb1Var3.f);
        zb1Var3.k0.addView(zb1Var3.h);
        zb1Var3.k0.addView(zb1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        zb1Var3.f0 = eVar;
        eVar.setListener(new xb1(zb1Var3));
        zb1Var3.f0.setScaleX(1.15f);
        zb1Var3.f0.setScaleY(1.15f);
        ub1Var.addView(zb1Var3.k0, b8.mf.e(-1, -2, 80));
        float f10 = org.telegram.messenger.g0.Q1() ? 100 : 27;
        ub1Var.addView(zb1Var3.f0, b8.mf.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(activity);
        zb1Var3.J = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
        zb1Var3.J.setImageResource(R.drawable.msg_addcontact);
        zb1Var3.J.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        ub1Var.addView(zb1Var3.J, b8.mf.e(56, 56, 53));
        b8.pf.a(zb1Var3.J);
        ImageView imageView2 = new ImageView(activity);
        zb1Var3.I = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
        zb1Var3.I.setImageResource(R.drawable.msg_call_minimize_shadow);
        zb1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        zb1Var3.I.setContentDescription(org.telegram.messenger.bd.M0(2131753756, null));
        ub1Var.addView(zb1Var3.I, b8.mf.e(56, 56, 51));
        b8.pf.a(zb1Var3.I);
        int i20 = 6;
        lg.k kVar = new lg.k(activity, i20);
        zb1Var3.L = kVar;
        kVar.setContentDescription(org.telegram.messenger.bd.M0(2131743249, null));
        zb1Var3.L.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
        zb1Var3.L.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        ub1Var.addView(zb1Var3.L, b8.mf.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        zb1Var3.L.setAlpha(0.0f);
        zb1Var3.L.setOnClickListener(new lb1(zb1Var3, 5));
        zb1Var3.I.setOnClickListener(new lb1(zb1Var3, i20));
        zb1Var3.J.setOnClickListener(new hb0(21, zb1Var3, activity));
        if (zb1Var3.v0.b) {
            zb1Var3.I.setVisibility(8);
            zb1Var3.J.setVisibility(8);
        }
        org.telegram.ui.Components.voip.p1 p1Var = new org.telegram.ui.Components.voip.p1(activity);
        p1Var.a = new HashMap();
        p1Var.b = new ArrayList();
        p1Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        p1Var.r = textPaint;
        p1Var.setOrientation(1);
        p1Var.n = x0Var;
        TransitionSet transitionSet = new TransitionSet();
        p1Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.h0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        zb1Var3.N0 = p1Var;
        p1Var.setGravity(80);
        zb1Var3.N0.setOnViewsUpdated(new kb1(zb1Var3, 5));
        ub1Var.addView(zb1Var3.N0, b8.mf.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(activity, 3, x0Var, true);
        zoVar.r(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        zoVar.L = alignment;
        zoVar.d = -1L;
        zoVar.r0 = new kb1(zb1Var3, i20);
        zoVar.U = true;
        zoVar.h = org.telegram.messenger.g0.L(320.0f);
        zoVar.e = true;
        zoVar.n(10.0f, 6.0f, 10.0f, 6.0f);
        zoVar.s(8.0f);
        zb1Var3.O0 = zoVar;
        zoVar.u(org.telegram.messenger.bd.M0(2131744264, null));
        ub1Var.addView(zb1Var3.O0, b8.mf.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(activity, 1, x0Var, false);
        zoVar2.r(true);
        zoVar2.L = alignment;
        zoVar2.d = 4000L;
        zoVar2.U = true;
        zoVar2.h = org.telegram.messenger.g0.L(320.0f);
        zoVar2.e = true;
        zoVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
        zoVar2.s(8.0f);
        zb1Var3.P0 = zoVar2;
        zoVar2.u(org.telegram.messenger.bd.M0(2131743312, null));
        ub1Var.addView(zb1Var3.P0, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        zb1Var3.G();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!zb1Var3.V0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                zb1Var3.V0 = phoneCall != null && phoneCall.video;
            }
            zb1Var3.h();
        }
        rb1Var2.addView(ub1Var);
        if (z10) {
            zb1Var3.G0 = 0.0f;
            zb1Var3.J0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                zb1Var3.d0.setStub(org.telegram.ui.Components.voip.u1.d().s);
                zb1Var3.e0.setStub(org.telegram.ui.Components.voip.u1.d().r);
            }
            zb1Var3.v0.setAlpha(0.0f);
            zb1Var3.G();
            zb1Var3.F0 = true;
            org.telegram.ui.Components.voip.u1.V = true;
            if (org.telegram.ui.Components.voip.u1.X != null) {
                org.telegram.ui.Components.voip.u1.W.getClass();
                throw null;
            }
            zb1Var3.M0.d();
            org.telegram.messenger.g0.i3(new kb1(zb1Var3, 11), 32L);
        } else {
            zb1Var3.G0 = 1.0f;
            zb1Var3.F();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && xf.b.a(activity) == 1) {
            zb1 zb1Var4 = o1;
            uf.c cVar = new uf.c(activity, zb1Var4);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.z1 z1Var3 = zb1Var4.d0;
            cVar.j = z1Var3.d;
            cVar.k = z1Var3.getPlaceholderView();
            zb1Var4.h0 = cVar.a();
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            kb1 kb1Var = this.T0;
            org.telegram.messenger.g0.r(kb1Var);
            this.S0 = false;
            if (this.A0 && this.y0) {
                org.telegram.messenger.g0.i3(kb1Var, 3000L);
                this.S0 = true;
            }
        }
    }

    public final void B() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.x0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.o0 ? org.telegram.messenger.bd.M0(2131754732, null) : org.telegram.messenger.bd.M0(2131754733, null));
            }
            if (this.o0) {
                this.e0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.r0 = this.q0;
                G();
                return;
            }
            if (this.p0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.v0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                sb1 sb1Var = new sb1(this, this.s.getContext(), r0[0], r0[1]);
                this.p0 = sb1Var;
                WindowInsets windowInsets = this.s0;
                if (windowInsets != null) {
                    sb1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.p0);
            }
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new org.telegram.ui.ActionBar.h0(4).setDuration(250L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
            transitionSet.addTransition(duration.setInterpolator(xqVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(xqVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.c2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.q2.class, true);
            TransitionManager.beginDelayedTransition(this.k0, transitionSet);
        }
        int i3 = this.q0;
        if (i3 == 11) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        int i10 = 0;
        if (i3 == 15 || i3 == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i3 == 15) {
                if (sharedInstance.isScreencast() || !(this.o0 || this.n0)) {
                    t(this.e, sharedInstance);
                    this.L.animate().alpha(0.0f).start();
                } else {
                    p(this.e, sharedInstance);
                    if (this.y0) {
                        this.L.animate().alpha(1.0f).start();
                    }
                }
                u(this.f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (o1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.o0 || this.n0)) {
                t(this.e, sharedInstance);
                this.L.setTag(null);
                this.L.animate().alpha(0.0f).start();
            } else {
                p(this.e, sharedInstance);
                if (this.y0) {
                    this.L.setTag(1);
                    this.L.animate().alpha(1.0f).start();
                }
            }
            u(this.f, sharedInstance, false);
            s(this.h, sharedInstance, z10);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.bd.M0(2131743421, null), false, z10);
            this.n.setOnClickListener(new lb1(this, i10));
        }
        if (this.e.getVisibility() == 0) {
            this.e.f = 0;
            i10 = 16;
        }
        if (this.f.getVisibility() == 0) {
            this.f.f = i10;
            i10 += 16;
        }
        if (this.h.getVisibility() == 0) {
            this.h.f = i10;
            i10 += 16;
        }
        if (this.n.getVisibility() == 0) {
            this.n.G = i10;
        }
        E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.g5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.k9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        ei.c3 c3Var;
        String[] strArr;
        TLRPC.Document document;
        int i3;
        ?? r5;
        if (this.C0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z12 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, false);
            bArr = null;
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.o(bArr.length, bArr));
        int i10 = 0;
        while (true) {
            r62 = this.W;
            drawableArr = this.X;
            if (i10 >= 4) {
                break;
            }
            org.telegram.messenger.i6.k(emojifyForCall[i10]);
            org.telegram.messenger.e6 g7 = org.telegram.messenger.i6.g(emojifyForCall[i10]);
            if (g7 != null) {
                g7.setBounds(z12 ? 1 : 0, z12 ? 1 : 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                g7.b();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(org.telegram.messenger.g0.L(28.0f));
                CharSequence m10 = org.telegram.messenger.i6.m(emojifyForCall[i10], textPaint.getFontMetricsInt(), z12, iArr, z12 ? 1 : 0);
                boolean z13 = m10 instanceof Spannable;
                int i11 = this.a;
                if (z13) {
                    Spannable spannable = (Spannable) m10;
                    org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.messenger.f6.class);
                    org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.p5.class);
                    if (f6VarArr != null) {
                        if ((iArr[z12 ? 1 : 0] - f6VarArr.length) - (p5VarArr == null ? z12 ? 1 : 0 : p5VarArr.length) <= 0) {
                            int length = f6VarArr.length;
                            int i12 = z12 ? 1 : 0;
                            ?? r32 = z12;
                            while (i12 < length) {
                                org.telegram.messenger.f6 f6Var = f6VarArr[i12];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i11).l0(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new s3(this, 26));
                                if (l02 != null) {
                                    String replace = f6Var.d.replace("️", "");
                                    ArrayList<TLRPC.Document> arrayList = l02.documents;
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= size) {
                                            strArr = emojifyForCall;
                                            i3 = length;
                                            document = null;
                                            break;
                                        }
                                        TLRPC.Document document2 = arrayList.get(i13);
                                        i13++;
                                        strArr = emojifyForCall;
                                        document = document2;
                                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                                        i3 = length;
                                        if (TextUtils.equals(org.telegram.messenger.zi.V(document, null, null).replace("️", ""), replace)) {
                                            break;
                                        }
                                        length = i3;
                                        emojifyForCall = strArr;
                                        arrayList = arrayList2;
                                    }
                                    if (document != null) {
                                        break;
                                    }
                                    i12++;
                                    length = i3;
                                    emojifyForCall = strArr;
                                    r32 = 0;
                                }
                            }
                        }
                    }
                    strArr = emojifyForCall;
                    document = null;
                    if (document == null) {
                        Drawable drawable = drawableArr[i10];
                        if ((drawable instanceof org.telegram.ui.Components.g5) && ((org.telegram.ui.Components.g5) drawable).h() == document.id) {
                            r5 = (org.telegram.ui.Components.g5) drawableArr[i10];
                        } else {
                            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(21, i11, document);
                            drawableArr[i10] = g5Var;
                            r5 = g5Var;
                        }
                        r5.q(strArr[i10]);
                        r62[i10].setAnimatedEmojiDrawable(r5);
                        r62[i10].getImageReceiver().f();
                        g7 = r5;
                    } else {
                        r62[i10].setImageDrawable(g7);
                        g7 = g7;
                    }
                    r62[i10].setVisibility(8);
                }
                strArr = emojifyForCall;
                document = null;
                if (document == null) {
                }
                r62[i10].setVisibility(8);
            } else {
                strArr = emojifyForCall;
            }
            drawableArr[i10] = g7;
            i10++;
            emojifyForCall = strArr;
            z12 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            Drawable drawable2 = drawableArr[i15];
            if (drawable2 instanceof org.telegram.messenger.e6) {
                z11 = ((org.telegram.messenger.e6) drawable2).a();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.g5) && (c3Var = ((org.telegram.ui.Components.g5) drawable2).k) != null) {
                    Drawable drawable3 = c3Var.b0;
                    if (!(drawable3 instanceof org.telegram.messenger.e6) || ((org.telegram.messenger.e6) drawable3).a()) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
            if (z11) {
                i14++;
            }
        }
        if (i14 == 4) {
            this.C0 = true;
            for (int i16 = 0; i16 < 4; i16++) {
                if (r62[i16].getVisibility() != 0) {
                    r62[i16].setVisibility(0);
                    if (z10) {
                        r62[i16].setAlpha(0.0f);
                        r62[i16].setScaleX(0.0f);
                        r62[i16].setScaleY(0.0f);
                        org.telegram.messenger.camera.q.l(r62[i16].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.xq.k, 250L);
                    }
                }
            }
            this.P0.postDelayed(new kb1(this, 9), 1000L);
        }
    }

    public final void E() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i3 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.K != i3) {
            org.telegram.messenger.g0.R3(this.L, i3);
        } else {
            this.L.setImageResource(i3);
        }
        this.K = i3;
    }

    public final void F() {
        this.l0.setColor(i0.a.o(-16777216, (int) (this.z0 * 102.0f * this.G0)));
        this.m0.setColor(i0.a.o(-16777216, (int) (127.5f * this.G0)));
        ub1 ub1Var = this.s;
        if (ub1Var != null) {
            ub1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d43 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x07d0  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        boolean z10;
        boolean z11;
        int i3;
        boolean z12;
        boolean z13;
        int L;
        boolean z14;
        int i10;
        int childsHight;
        org.telegram.ui.Components.voip.c1 c1Var;
        org.telegram.ui.Components.voip.c1 c1Var2;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Components.voip.z1 z1Var;
        VideoSink videoSink;
        int i11;
        int i12;
        boolean z18;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j10;
        Layout layout;
        int lineCount;
        float f10;
        float f11;
        float f12;
        TL_phone.PhoneCall phoneCall2;
        float f13;
        boolean z19;
        boolean z20;
        TextView textView;
        int i13;
        if (this.H0 || this.F0) {
            return;
        }
        boolean z21 = true;
        z21 = true;
        boolean z22 = this.r0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i14 = this.q0;
        int i15 = 3;
        TLRPC.User user = this.d;
        int i16 = 2;
        if (i14 == 1 || i14 == 2) {
            this.G.b(org.telegram.messenger.bd.M0(2131743429, null), true, z22);
        } else {
            if (i14 != 3) {
                if (i14 == 4) {
                    this.G.b(org.telegram.messenger.bd.M0(2131743418, null), false, z22);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        org.telegram.messenger.g0.i3(new kb1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        x(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("VoipPeerIncompatible", null, 2131743273, org.telegram.messenger.g5.m(0, user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.V0) {
                            String a02 = org.telegram.messenger.bd.a0("VoipPeerVideoOutdated", null, 2131743271, org.telegram.messenger.l10.j(user, true));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(0, this.b, null);
                            boolean[] zArr2 = new boolean[3];
                            k3Var.S = org.telegram.messenger.bd.M0(2131743418, null);
                            k3Var.U = org.telegram.messenger.g0.X2(a02);
                            String M0 = org.telegram.messenger.bd.M0(2131752589, null);
                            ib1 ib1Var = new ib1(this, 2);
                            k3Var.q0 = M0;
                            k3Var.r0 = ib1Var;
                            String M02 = org.telegram.messenger.bd.M0(2131743270, null);
                            na1 na1Var = new na1(1, this, zArr);
                            k3Var.o0 = M02;
                            k3Var.p0 = na1Var;
                            k3Var.show();
                            for (int i17 = 0; i17 < 3; i17++) {
                                if (zArr2[i17] && (textView = (TextView) k3Var.d(-(i17 + 1))) != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, k3Var.l1);
                                }
                            }
                            k3Var.setCanceledOnTouchOutside(true);
                            k3Var.setOnDismissListener(new ci.h3(this, zArr, 14));
                        } else {
                            x(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("VoipPeerOutdated", null, 2131743272, org.telegram.messenger.l10.j(user, true))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        x(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131752606, org.telegram.messenger.g5.m(0, user.first_name, user.last_name))));
                        org.telegram.ui.Components.t4.k0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        x("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.v0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        x(org.telegram.messenger.bd.M0(2131743420, null));
                    } else {
                        org.telegram.messenger.g0.i3(new kb1(this, 1), 1000L);
                    }
                } else if (i14 != 5) {
                    switch (i14) {
                        case 11:
                            boolean z23 = sharedInstance != null && sharedInstance.hasRate();
                            this.e0.c();
                            if (!z23 || this.H0) {
                                org.telegram.messenger.g0.i3(new kb1(this, 0), 200L);
                                break;
                            } else {
                                if (this.y0) {
                                    int[] iArr = new int[2];
                                    int i18 = org.telegram.messenger.g0.q.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i18 - iArr[0]) - ((this.n.getMeasuredWidth() - org.telegram.messenger.g0.L(52.0f)) / 2)) - org.telegram.messenger.g0.L(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.V.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.V.setTranslationY(iArr[1]);
                                    this.V.setAlpha(1.0f);
                                    this.V.setLayoutParams(marginLayoutParams);
                                    this.k0.animate().alpha(0.0f).setDuration(80L).start();
                                    org.telegram.messenger.g0.i3(new ma1(i15, this, sharedInstance), 2L);
                                    i13 = 0;
                                } else {
                                    this.k0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
                                    layoutParams.rightMargin = org.telegram.messenger.g0.L(18.0f);
                                    layoutParams.leftMargin = org.telegram.messenger.g0.L(18.0f);
                                    int L2 = org.telegram.messenger.g0.L(36.0f);
                                    layoutParams.bottomMargin = L2;
                                    WindowInsets windowInsets = this.s0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + L2;
                                    }
                                    layoutParams.gravity = 80;
                                    this.V.setLayoutParams(layoutParams);
                                    this.V.animate().alpha(1.0f).setDuration(250L).start();
                                    i13 = 0;
                                    this.V.a(new jb1(this, sharedInstance, i13), false);
                                }
                                this.R.setVisibility(i13);
                                ci.t4 t4Var = this.R;
                                ib1 ib1Var2 = new ib1(this, true ? 1 : 0);
                                org.telegram.ui.Components.voip.v0[] v0VarArr = (org.telegram.ui.Components.voip.v0[]) t4Var.d;
                                t4Var.e = ib1Var2;
                                ai.c0 c0Var = (ai.c0) t4Var.b;
                                c0Var.setVisibility(i13);
                                ((FrameLayout) t4Var.c).setVisibility(i13);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0Var, (Property<ai.c0, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var, (Property<ai.c0, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var, (Property<ai.c0, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                float f14 = 0.0f;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(c0Var, (Property<ai.c0, Float>) property4, org.telegram.messenger.g0.L(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.xq.f);
                                animatorSet.setDuration(250L);
                                int i19 = 0;
                                while (i19 < v0VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    v0VarArr[i19].setAlpha(f14);
                                    float[] fArr = new float[i16];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v0VarArr[i19], (Property<org.telegram.ui.Components.voip.v0, Float>) property, fArr);
                                    float[] fArr2 = new float[i16];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(v0VarArr[i19], (Property<org.telegram.ui.Components.voip.v0, Float>) property2, fArr2);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr3 = new float[i16];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(v0VarArr[i19], (Property<org.telegram.ui.Components.voip.v0, Float>) property3, fArr3);
                                    org.telegram.ui.Components.voip.v0 v0Var = v0VarArr[i19];
                                    Property property5 = property3;
                                    float[] fArr4 = new float[i16];
                                    fArr4[0] = org.telegram.messenger.g0.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Components.voip.v0, Float>) property4, fArr4);
                                    int i20 = i16;
                                    Animator[] animatorArr = new Animator[4];
                                    animatorArr[0] = ofFloat4;
                                    animatorArr[1] = ofFloat5;
                                    animatorArr[i20] = ofFloat6;
                                    animatorArr[3] = ofFloat7;
                                    animatorSet2.playTogether(animatorArr);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i19 * 16);
                                    animatorSet2.start();
                                    i19++;
                                    animatorSet = animatorSet3;
                                    i16 = i20;
                                    property3 = property5;
                                    f14 = 0.0f;
                                }
                                int i21 = i16;
                                animatorSet.start();
                                if (this.D0) {
                                    this.D0 = false;
                                    ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
                                    duration.setInterpolator(xqVar).setListener(new org.telegram.ui.Components.s9(this.P)).start();
                                    this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(xqVar).setDuration(250L).start();
                                    this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new org.telegram.ui.Components.s9(this.P)).setDuration(250L).setInterpolator(xqVar).start();
                                }
                                for (org.telegram.ui.Components.k9 k9Var : this.W) {
                                    k9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.xq.f).setDuration(250L).start();
                                }
                                this.F.animate().alpha(0.0f).setDuration(70L).setListener(new ob1(this, 5)).start();
                                ViewPropertyAnimator alpha = this.L.animate().alpha(0.0f);
                                org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f;
                                org.telegram.messenger.camera.q.l(alpha, xqVar2, 250L);
                                this.L.setVisibility(8);
                                this.G.d(false, true);
                                this.G.c(false);
                                org.telegram.ui.Components.voip.a2 a2Var = this.G.d;
                                a2Var.n = true;
                                a2Var.invalidate();
                                org.telegram.ui.Components.voip.c0 c0Var2 = this.E;
                                c0Var2.setShowWaves(false);
                                AnimatorSet animatorSet4 = c0Var2.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                c0Var2.c = animatorSet5;
                                Property property6 = View.ALPHA;
                                float[] fArr5 = new float[i21];
                                fArr5[0] = c0Var2.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var2, (Property<org.telegram.ui.Components.voip.c0, Float>) property6, fArr5);
                                Property property7 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i21];
                                fArr6[0] = c0Var2.getTranslationY();
                                fArr6[1] = -org.telegram.messenger.g0.L(24.0f);
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(c0Var2, (Property<org.telegram.ui.Components.voip.c0, Float>) property7, fArr6);
                                Property property8 = View.SCALE_X;
                                float[] fArr7 = new float[3];
                                fArr7[0] = c0Var2.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i21] = 1.0f;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(c0Var2, (Property<org.telegram.ui.Components.voip.c0, Float>) property8, fArr7);
                                Property property9 = View.SCALE_Y;
                                float[] fArr8 = new float[3];
                                fArr8[0] = c0Var2.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i21] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(c0Var2, (Property<org.telegram.ui.Components.voip.c0, Float>) property9, fArr8);
                                Animator[] animatorArr2 = new Animator[4];
                                animatorArr2[0] = ofFloat8;
                                animatorArr2[1] = ofFloat9;
                                animatorArr2[i21] = ofFloat10;
                                animatorArr2[3] = ofFloat11;
                                animatorSet5.playTogether(animatorArr2);
                                c0Var2.c.setInterpolator(xqVar2);
                                c0Var2.c.setDuration(300L);
                                c0Var2.c.setStartDelay(250L);
                                c0Var2.c.start();
                                C(true);
                                this.n.setVisibility(4);
                                this.a0.setAlpha(0.0f);
                                this.a0.setVisibility(8);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                sb1 sb1Var = this.p0;
                                if (sb1Var != null) {
                                    sb1Var.a(false, false);
                                }
                                this.N0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.r0 != 12) {
                                this.G.b(org.telegram.messenger.bd.M0(2131743419, null), true, z22);
                                break;
                            }
                            break;
                        case 13:
                            this.G.b(org.telegram.messenger.bd.M0(2131743228, null), true, z22);
                            break;
                        case 14:
                            this.G.b(org.telegram.messenger.bd.M0(2131743256, null), true, z22);
                            break;
                        case 15:
                            this.f0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.G.b(org.telegram.messenger.bd.M0(2131743308, null), false, z22);
                                this.f0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.G.b(org.telegram.messenger.bd.M0(2131743310, null), false, z22);
                                this.f0.setTranslationY(0.0f);
                            } else {
                                this.G.b(org.telegram.messenger.bd.M0(2131743307, null), false, z22);
                                this.f0.setTranslationY(-org.telegram.messenger.g0.L(60.0f));
                            }
                            z10 = false;
                            z11 = false;
                            break;
                        case 16:
                            if (this.r0 != 16) {
                                this.G.b(org.telegram.messenger.bd.M0(2131743255, null), true, z22);
                                break;
                            }
                            break;
                        case 17:
                            this.G.b(org.telegram.messenger.bd.M0(2131743502, null), false, z22);
                            this.f0.setRetryMod(true);
                            this.o0 = false;
                            this.n0 = false;
                            z10 = false;
                            z11 = false;
                            break;
                    }
                    if (this.p0 == null) {
                        return;
                    }
                    boolean z24 = this.n0 || this.o0;
                    if (sharedInstance != null) {
                        this.n0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z19 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z20 = false;
                                this.o0 = z20;
                                if (z20 && !this.V0) {
                                    this.V0 = z19;
                                }
                            }
                        } else {
                            z19 = true;
                        }
                        z20 = z19;
                        this.o0 = z20;
                        if (z20) {
                            this.V0 = z19;
                        }
                    }
                    if (z22) {
                        this.Z.b();
                        this.a0.b();
                    }
                    if (this.n0) {
                        if (this.F0) {
                            f13 = 1.0f;
                        } else {
                            f13 = 1.0f;
                            this.w.setAlpha(1.0f);
                        }
                        if (z22) {
                            this.d0.animate().alpha(f13).setDuration(250L).start();
                        } else {
                            this.d0.animate().cancel();
                            this.d0.setAlpha(f13);
                        }
                        if (!this.d0.d.isFirstFrameRendered() && !this.J0) {
                            i3 = 0;
                            this.n0 = false;
                            if (!this.o0 || this.n0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i3);
                                if (z22) {
                                    this.d0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.d0.animate().cancel();
                                    this.d0.setAlpha(0.0f);
                                }
                            }
                            z12 = this.o0;
                            if (z12 || !this.n0) {
                                this.I0 = false;
                            }
                            z13 = (z12 || !this.I0 || org.telegram.messenger.g0.H1(this.b)) ? false : true;
                            w(z22, z24);
                            L = this.E.getTag() != null ? 0 : org.telegram.messenger.g0.L(135.0f) + org.telegram.messenger.g0.L(12.0f);
                            if (z22) {
                                this.f0.setVisibility(z21 ? 0 : 8);
                            } else {
                                if (z21 && this.f0.getTag() == null) {
                                    this.f0.animate().setListener(null).cancel();
                                    if (this.f0.getVisibility() == 8) {
                                        this.f0.setVisibility(0);
                                        this.f0.setAlpha(0.0f);
                                    }
                                    this.f0.animate().alpha(1.0f);
                                }
                                if (!z21 && this.f0.getTag() != null) {
                                    this.f0.animate().setListener(null).cancel();
                                    this.f0.animate().setListener(new ob1(this, 9)).alpha(0.0f);
                                }
                            }
                            this.f0.setEnabled(z21);
                            this.f0.setTag(!z21 ? 1 : null);
                            this.v0.setLockOnScreen(this.K0);
                            z14 = this.q0 != 3 && (this.o0 || this.n0);
                            this.A0 = z14;
                            if (!z14 && !this.y0) {
                                z(true);
                            }
                            if (this.y0 && this.A0 && !this.S0 && sharedInstance != null) {
                                org.telegram.messenger.g0.i3(this.T0, 3000L);
                                this.S0 = true;
                            }
                            int i22 = this.q0;
                            int i23 = 11;
                            boolean z25 = i22 == 11 && this.y0;
                            boolean z26 = (!z21 || i22 == 16 || i22 == 11 || i22 == 12 || i22 == 14 || i22 == 6 || !this.y0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            if (z22) {
                                this.I.setVisibility(z25 ? 0 : 8);
                                this.I.setAlpha(z25 ? 1.0f : 0.0f);
                                this.J.setVisibility(z26 ? 0 : 8);
                                this.J.setAlpha(z26 ? 1.0f : 0.0f);
                                this.N0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) - (this.y0 ? org.telegram.messenger.g0.L(80.0f) : 0));
                            } else {
                                if (z25) {
                                    f10 = 80.0f;
                                    this.I.animate().alpha(1.0f).start();
                                } else {
                                    f10 = 80.0f;
                                    if (this.I.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f11 = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    this.I.animate().alpha(f11).start();
                                }
                                if (z26) {
                                    this.J.animate().alpha(1.0f).start();
                                } else {
                                    if (this.J.getVisibility() != 0) {
                                        this.J.setVisibility(0);
                                        f12 = 0.0f;
                                        this.J.setAlpha(0.0f);
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    this.J.animate().alpha(f12).start();
                                }
                                this.N0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.y0 ? org.telegram.messenger.g0.L(f10) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                            }
                            i10 = this.q0;
                            if (i10 != 10 && i10 != 11) {
                                C(z22);
                            }
                            if (z11) {
                                this.G.e(z22);
                            }
                            this.G.d(z10, z22);
                            if (this.E.getVisibility() == 0 && this.D0) {
                                L += org.telegram.messenger.g0.L(24.0f);
                                layout = this.U.getLayout();
                                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                    L = com.google.android.recaptcha.internal.a.e(lineCount, 2, org.telegram.messenger.g0.L(20.0f), L);
                                }
                            }
                            if (this.q0 == 11 && !this.o0 && !this.n0) {
                                L -= org.telegram.messenger.g0.L(24.0f);
                            }
                            if (!this.o0 || this.n0) {
                                L -= org.telegram.messenger.g0.L(60.0f);
                            }
                            if (z22) {
                                this.Y.setTranslationY(L);
                            } else {
                                if (this.D0 && (this.o0 || this.n0)) {
                                    this.Y.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                                    j10 = 250;
                                } else {
                                    j10 = 250;
                                    this.Y.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                                }
                                if (L != this.w0) {
                                    ViewPropertyAnimator animate = this.Y.animate();
                                    if (this.q0 != 11) {
                                        j10 = 0;
                                    }
                                    animate.setStartDelay(j10).translationY(L).setDuration(200L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                                }
                            }
                            this.w0 = L;
                            boolean z27 = sharedInstance == null && sharedInstance.isScreencast();
                            int i24 = this.q0;
                            this.E0 = i24 == 11 && i24 != 17 && ((this.o0 && !z27) || this.n0);
                            if (sharedInstance != null) {
                                if (this.o0) {
                                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                }
                                this.e0.setIsScreencast(sharedInstance.isScreencast());
                                this.e0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                VideoSink videoSink2 = (!this.o0 || sharedInstance.isScreencast()) ? null : this.e0.d;
                                if (!this.n1 || (z1Var = this.l1) == null) {
                                    if (z13) {
                                        videoSink = this.c0;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z22) {
                                            org.telegram.ui.Components.voip.p1 p1Var = this.N0;
                                            p1Var.f = false;
                                            if (!p1Var.e && p1Var.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(p1Var, p1Var.d);
                                            }
                                        }
                                        if (sharedInstance.isMicMute()) {
                                            this.N0.c("self-muted");
                                        } else {
                                            this.N0.a(R.drawable.calls_mute_mini, org.telegram.messenger.bd.M0(2131743296, null), "self-muted");
                                        }
                                        if ((!this.o0 || this.n0) && (((i11 = this.q0) == 3 || i11 == 5) && sharedInstance.getCallDuration() > 500)) {
                                            if (sharedInstance.getRemoteAudioState() != 0) {
                                                org.telegram.ui.Components.voip.p1 p1Var2 = this.N0;
                                                i12 = 1;
                                                p1Var2.a(R.drawable.calls_mute_mini, org.telegram.messenger.bd.a0("VoipUserMicrophoneIsOff", null, 2131743237, p1Var2.b(org.telegram.messenger.l10.j(user, true))), "muted");
                                            } else {
                                                i12 = 1;
                                                this.N0.c("muted");
                                            }
                                            if (sharedInstance.getRemoteVideoState() != 0) {
                                                org.telegram.ui.Components.voip.p1 p1Var3 = this.N0;
                                                Object[] objArr = new Object[i12];
                                                objArr[0] = p1Var3.b(org.telegram.messenger.l10.j(user, i12));
                                                p1Var3.a(R.drawable.calls_camera_mini, org.telegram.messenger.bd.a0("VoipUserCameraIsOff", null, 2131743238, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                this.N0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            if (sharedInstance.getRemoteAudioState() == 0) {
                                                org.telegram.ui.Components.voip.p1 p1Var4 = this.N0;
                                                p1Var4.a(R.drawable.calls_mute_mini, org.telegram.messenger.bd.a0("VoipUserMicrophoneIsOff", null, 2131743237, p1Var4.b(org.telegram.messenger.l10.j(user, true))), "muted");
                                            } else {
                                                this.N0.c("muted");
                                            }
                                            this.N0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                        }
                                        if (this.N0.getChildCount() == 0 && this.n0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                this.O0.setTranslationY(-((this.s.getMeasuredHeight() - this.k0.getY()) + org.telegram.messenger.g0.L(6.0f)));
                                                this.O0.p(0.0f, this.f.getX() + this.k0.getX() + org.telegram.messenger.g0.L(14.0f));
                                                this.O0.w();
                                                z18 = true;
                                                if (z22) {
                                                    org.telegram.ui.Components.voip.p1 p1Var5 = this.N0;
                                                    if (p1Var5.f) {
                                                        p1Var5.e = z18;
                                                        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.d4(p1Var5, i23), 700L);
                                                    }
                                                    p1Var5.f = false;
                                                }
                                            }
                                        }
                                        if (this.N0.getChildCount() != 0) {
                                            z18 = true;
                                            this.O0.f(true);
                                            if (z22) {
                                            }
                                        }
                                        z18 = true;
                                        if (z22) {
                                        }
                                    } else {
                                        z1Var = this.d0;
                                    }
                                }
                                videoSink = z1Var.d;
                                sharedInstance.setSinks(videoSink2, videoSink);
                                if (z22) {
                                }
                                if (sharedInstance.isMicMute()) {
                                }
                                if (this.o0) {
                                }
                                if (sharedInstance.getRemoteAudioState() != 0) {
                                }
                                if (sharedInstance.getRemoteVideoState() != 0) {
                                }
                                if (this.N0.getChildCount() == 0) {
                                    sharedUIParams = sharedInstance.sharedUIParams;
                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                    }
                                }
                                if (this.N0.getChildCount() != 0) {
                                }
                                z18 = true;
                                if (z22) {
                                }
                            }
                            childsHight = this.N0.getChildsHight();
                            c1Var = this.a0;
                            if (c1Var.getParent() == null && z22) {
                                c1Var.U = childsHight;
                            } else {
                                c1Var.U = childsHight;
                            }
                            c1Var2 = this.Z;
                            if (c1Var2.getParent() == null && z22) {
                                c1Var2.U = childsHight;
                            } else {
                                c1Var2.U = childsHight;
                            }
                            this.Z.setUiVisible(this.y0);
                            this.a0.setUiVisible(this.y0);
                            if (this.o0) {
                                z15 = true;
                                y(0, z22);
                            } else if (!this.n0 || this.I0) {
                                z15 = true;
                                y(1, z22);
                            } else {
                                y(2, z22);
                                z15 = true;
                            }
                            if (!z13 && this.a0.getTag() == null) {
                                this.a0.setIsActive(z15);
                                if (this.a0.getVisibility() != 0) {
                                    this.a0.setVisibility(0);
                                    this.a0.setAlpha(0.0f);
                                    this.a0.setScaleX(0.5f);
                                    this.a0.setScaleY(0.5f);
                                }
                                this.a0.animate().setListener(null).cancel();
                                org.telegram.ui.Components.voip.c1 c1Var3 = this.a0;
                                c1Var3.d0 = true;
                                c1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).setStartDelay(150L).withEndAction(new kb1(this, 4)).start();
                                this.a0.setTag(1);
                            } else if (!z13 && this.a0.getTag() != null) {
                                this.a0.setIsActive(false);
                                this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ob1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                                this.a0.setTag(null);
                            }
                            this.Z.a();
                            this.a0.a();
                            E();
                            if (this.q0 == 3) {
                                this.x.a();
                                this.E.a();
                                int i25 = this.w.W;
                                if (i25 != 2 && i25 != 3) {
                                    int[] iArr2 = new int[2];
                                    this.E.getLocationOnScreen(iArr2);
                                    z16 = true;
                                    this.w.b(org.telegram.messenger.g0.L(106.0f) + iArr2[0], org.telegram.messenger.g0.L(106.0f) + iArr2[1], this.r0 != -1);
                                    z17 = (!this.o0 || this.n0) ? z16 : false;
                                    this.y.setState(z17);
                                    this.x.setState(z17);
                                    this.r.e(z17);
                                    if (this.n0 && !z24 && this.g0) {
                                        this.g0 = false;
                                        if (sharedInstance != null) {
                                            sharedInstance.playStartRecordSound();
                                        }
                                    }
                                    if (z17) {
                                        if (this.j0.getVisibility() != 0) {
                                            this.j0.setVisibility(0);
                                            this.i0.setVisibility(0);
                                        }
                                    } else if (this.j0.getVisibility() != 4) {
                                        this.j0.setVisibility(4);
                                        this.i0.setVisibility(4);
                                    }
                                    kb1 kb1Var = this.U0;
                                    org.telegram.messenger.g0.r(kb1Var);
                                    if (this.q0 == 3) {
                                        org.telegram.messenger.g0.i3(kb1Var, 10000L);
                                        return;
                                    }
                                    return;
                                }
                            }
                            z16 = true;
                            if (this.o0) {
                            }
                            this.y.setState(z17);
                            this.x.setState(z17);
                            this.r.e(z17);
                            if (this.n0) {
                                this.g0 = false;
                                if (sharedInstance != null) {
                                }
                            }
                            if (z17) {
                            }
                            kb1 kb1Var2 = this.U0;
                            org.telegram.messenger.g0.r(kb1Var2);
                            if (this.q0 == 3) {
                            }
                        }
                    }
                    i3 = 0;
                    if (this.o0) {
                    }
                    this.w.setVisibility(4);
                    z12 = this.o0;
                    if (z12) {
                    }
                    this.I0 = false;
                    if (z12) {
                    }
                    w(z22, z24);
                    if (this.E.getTag() != null) {
                    }
                    if (z22) {
                    }
                    this.f0.setEnabled(z21);
                    this.f0.setTag(!z21 ? 1 : null);
                    this.v0.setLockOnScreen(this.K0);
                    if (this.q0 != 3) {
                    }
                    this.A0 = z14;
                    if (!z14) {
                        z(true);
                    }
                    if (this.y0) {
                        org.telegram.messenger.g0.i3(this.T0, 3000L);
                        this.S0 = true;
                    }
                    int i222 = this.q0;
                    int i232 = 11;
                    if (i222 == 11) {
                    }
                    if (!z21) {
                    }
                    if (z22) {
                    }
                    i10 = this.q0;
                    if (i10 != 10) {
                        C(z22);
                    }
                    if (z11) {
                    }
                    this.G.d(z10, z22);
                    if (this.E.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(24.0f);
                        layout = this.U.getLayout();
                        if (layout != null) {
                            L = com.google.android.recaptcha.internal.a.e(lineCount, 2, org.telegram.messenger.g0.L(20.0f), L);
                        }
                    }
                    if (this.q0 == 11) {
                        L -= org.telegram.messenger.g0.L(24.0f);
                    }
                    if (!this.o0) {
                    }
                    L -= org.telegram.messenger.g0.L(60.0f);
                    if (z22) {
                    }
                    this.w0 = L;
                    if (sharedInstance == null) {
                    }
                    int i242 = this.q0;
                    this.E0 = i242 == 11 && i242 != 17 && ((this.o0 && !z27) || this.n0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.N0.getChildsHight();
                    c1Var = this.a0;
                    if (c1Var.getParent() == null) {
                    }
                    c1Var.U = childsHight;
                    c1Var2 = this.Z;
                    if (c1Var2.getParent() == null) {
                    }
                    c1Var2.U = childsHight;
                    this.Z.setUiVisible(this.y0);
                    this.a0.setUiVisible(this.y0);
                    if (this.o0) {
                    }
                    if (!z13) {
                    }
                    if (!z13) {
                        this.a0.setIsActive(false);
                        this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ob1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                        this.a0.setTag(null);
                    }
                    this.Z.a();
                    this.a0.a();
                    E();
                    if (this.q0 == 3) {
                    }
                    z16 = true;
                    if (this.o0) {
                    }
                    this.y.setState(z17);
                    this.x.setState(z17);
                    this.r.e(z17);
                    if (this.n0) {
                    }
                    if (z17) {
                    }
                    kb1 kb1Var22 = this.U0;
                    org.telegram.messenger.g0.r(kb1Var22);
                    if (this.q0 == 3) {
                    }
                }
            }
            D(z22);
            if (this.q0 == 5) {
                z10 = this.t0;
                if (!z10 && this.r0 != 5) {
                    this.G.b(org.telegram.messenger.bd.M0(2131743429, null), true, z22);
                }
                z21 = false;
                z11 = false;
                if (this.p0 == null) {
                }
            } else {
                z11 = true;
                this.t0 = true;
                z10 = false;
                z21 = false;
                if (this.p0 == null) {
                }
            }
        }
        z10 = false;
        z21 = false;
        z11 = false;
        if (this.p0 == null) {
        }
    }

    public final ValueAnimator b(boolean z10) {
        char c2;
        float f10;
        float measuredWidth;
        final float measuredHeight;
        final float f11;
        final boolean z11;
        float f12;
        float f13;
        float f14;
        boolean z12;
        float f15;
        this.Z.animate().cancel();
        float f16 = org.telegram.ui.Components.voip.u1.d().d.x + org.telegram.ui.Components.voip.u1.d().F;
        float f17 = org.telegram.ui.Components.voip.u1.d().d.y + org.telegram.ui.Components.voip.u1.d().G;
        final float x10 = this.Z.getX();
        final float y9 = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        org.telegram.ui.Components.voip.u1.W.getClass();
        final float measuredWidth2 = f16 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f17 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f18 = 1.0f;
        if (this.n0) {
            int measuredWidth3 = this.Z.getMeasuredWidth();
            if (!this.o0 || measuredWidth3 == 0) {
                c2 = 0;
                f10 = 4.0f;
                measuredWidth = 1.0f;
                f14 = 1.0f;
                z12 = false;
                f15 = 0.0f;
            } else {
                f15 = (this.v0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c2 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.f1.A(org.telegram.ui.Components.voip.u1.d().f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.u1.d().f * 0.25f) + (f16 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f14 = org.telegram.ui.Cells.f1.A(org.telegram.ui.Components.voip.u1.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.u1.d().h * 0.25f) + (f17 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                z12 = true;
            }
            measuredHeight = f14;
            z11 = z12;
            f11 = f15;
        } else {
            c2 = 0;
            f10 = 4.0f;
            measuredWidth = f16 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f17 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f11 = 0.25f;
            z11 = true;
        }
        final float f19 = measuredWidth;
        final float L = this.n0 ? org.telegram.messenger.g0.L(f10) : 0.0f;
        final float L2 = (org.telegram.messenger.g0.L(f10) * 1.0f) / f11;
        if (this.n0) {
            org.telegram.ui.Components.voip.u1.W.getClass();
            f12 = 1.0f;
            f18 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        float f20 = f12;
        if (z10) {
            if (z11) {
                this.Z.setScaleX(f11);
                this.Z.setScaleY(f11);
                this.Z.setTranslationX(f19);
                this.Z.setTranslationY(measuredHeight);
                this.Z.setCornerRadius(L2);
                this.Z.setAlpha(f18);
            }
            this.d0.setScaleX(0.25f);
            this.d0.setScaleY(0.25f);
            this.d0.setTranslationX(measuredWidth2);
            this.d0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.d0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f20) / 0.25f);
        } else {
            f13 = 0.25f;
        }
        float f21 = z10 ? f20 : 0.0f;
        float f22 = z10 ? 0.0f : f20;
        float[] fArr = new float[2];
        fArr[c2] = f21;
        fArr[1] = f22;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.G0 = z10 ? 0.0f : f20;
        F();
        final float f23 = f13;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.nb1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f24 = 1.0f - floatValue;
                zb1 zb1Var = zb1.this;
                zb1Var.G0 = f24;
                zb1Var.F();
                if (z11) {
                    float f25 = (f11 * floatValue) + (scaleX * f24);
                    zb1Var.Z.setScaleX(f25);
                    zb1Var.Z.setScaleY(f25);
                    zb1Var.Z.setTranslationX((f19 * floatValue) + (x10 * f24));
                    zb1Var.Z.setTranslationY((measuredHeight * floatValue) + (y9 * f24));
                    zb1Var.Z.setCornerRadius((L2 * floatValue) + (L * f24));
                    zb1Var.Z.setAlpha((f18 * floatValue) + (1.0f * f24));
                }
                float f26 = (f23 * floatValue) + (1.0f * f24);
                zb1Var.d0.setScaleX(f26);
                zb1Var.d0.setScaleY(f26);
                float f27 = 0.0f * f24;
                float f28 = (measuredWidth2 * floatValue) + f27;
                float f29 = (measuredHeight2 * floatValue) + f27;
                zb1Var.d0.setTranslationX(f28);
                zb1Var.d0.setTranslationY(f29);
                zb1Var.d0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f26);
                if (!zb1Var.Z.Q) {
                    zb1Var.e0.d(false, floatValue);
                }
                zb1Var.v0.invalidate();
            }
        });
        return ofFloat;
    }

    @Override // wf.a
    public final void c(b8.cg cgVar) {
        this.m1 = cgVar;
        org.telegram.ui.Components.voip.z1 z1Var = this.d0;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        this.n1 = true;
        G();
        try {
            ((WindowManager) this.b.getSystemService("window")).removeView(this.v0);
        } catch (IllegalArgumentException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.v0.invalidate();
    }

    public final void d() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.O4);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.M4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.E2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.G5);
        uf.d dVar = this.h0;
        if (dVar != null) {
            dVar.c();
            this.h0 = null;
        }
        xg.e1 e1Var = this.N;
        if (e1Var != null) {
            e1Var.dismiss();
            this.N = null;
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.M4) {
            if (this.q0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.e0.d.release();
            this.d0.d.release();
            this.c0.release();
            h();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i3 == org.telegram.messenger.hs.i4) {
            D(true);
            return;
        }
        if (i3 == org.telegram.messenger.hs.E2) {
            this.v0.b();
            return;
        }
        if (i3 == org.telegram.messenger.hs.O4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i3 == org.telegram.messenger.hs.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e(boolean z10) {
        ValueAnimator ofFloat;
        if (this.C0 && this.D0 != z10 && this.y0) {
            this.D0 = z10;
            org.telegram.ui.Components.voip.g2 g2Var = this.x;
            int i3 = 1;
            if (g2Var.L && z10 != g2Var.F) {
                g2Var.F = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                g2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.f2(g2Var, i3));
                g2Var.c.setInterpolator(org.telegram.ui.Components.xq.f);
                g2Var.c.setDuration(200L);
                g2Var.c.start();
            }
            if (z10) {
                int i10 = org.telegram.messenger.az.f1;
                if (i10 < 2) {
                    org.telegram.messenger.az.f1 = i10 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.az.f1);
                    edit.apply();
                }
                this.P0.f(true);
                org.telegram.messenger.g0.r(this.T0);
                this.S0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ob1(this, 3)).setInterpolator(xqVar).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.xq.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f;
                duration.setInterpolator(xqVar2).setListener(new org.telegram.ui.Components.s9(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(xqVar2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new ob1(this, 4)).setDuration(250L).setInterpolator(xqVar2).start();
            }
            this.r0 = this.q0;
            G();
        }
    }

    public final void f() {
        this.v0.b();
    }

    @Override // wf.a
    public final Bitmap g() {
        org.telegram.ui.Components.voip.z1 z1Var = this.l1;
        if (z1Var == null || !z1Var.d.isAvailable()) {
            return null;
        }
        return this.l1.d.getBitmap();
    }

    public final void h() {
        this.e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new pb1(this));
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new qb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override // wf.a
    public final void i(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    public final void j() {
        if (this.H0 || this.F0) {
            return;
        }
        sb1 sb1Var = this.p0;
        if (sb1Var != null) {
            sb1Var.a(false, false);
            return;
        }
        if (this.n0 && this.o0 && this.I0) {
            this.I0 = false;
            this.Z.setRelativePosition(this.a0);
            this.b0 = false;
            this.r0 = this.q0;
            G();
            return;
        }
        if (this.D0) {
            e(false);
            return;
        }
        if (this.S.getVisibility() != 8) {
            return;
        }
        if (!this.E0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.v0.b();
            return;
        }
        if (xf.b.a(this.b) <= 0) {
            org.telegram.ui.Components.t4.A(this.b, new ib1(this, 0), true).p();
            return;
        }
        if (this.H0 || o1 == null) {
            return;
        }
        this.H0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = o1.v0.getMeasuredHeight();
            zb1 zb1Var = o1;
            org.telegram.ui.Components.voip.u1.e(zb1Var.b, zb1Var.a, zb1Var.v0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = o1.s0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.u1.Y = windowInsets.getSystemWindowInsetTop();
                o1.s0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.u1.d() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
        duration.setInterpolator(xqVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        this.k0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        this.N0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        org.telegram.ui.Components.voip.u1.V = true;
        this.F0 = true;
        ValueAnimator b10 = b(false);
        this.M0.d();
        b10.addListener(new ob1(this, 1));
        b10.setDuration(350L);
        b10.setInterpolator(xqVar);
        b10.start();
    }

    @Override // wf.a
    public final Bitmap l() {
        org.telegram.ui.Components.voip.z1 z1Var = this.d0;
        if (z1Var == null || !z1Var.d.isAvailable()) {
            return null;
        }
        return this.d0.d.getBitmap();
    }

    public final void n(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.f0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f0;
            ValueAnimator valueAnimator = eVar.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.c0 = null;
                eVar.V.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.f0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f0;
        ValueAnimator valueAnimator2 = eVar2.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.c0 = null;
            eVar2.V.stop();
        }
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.bd.M0(2131743421, null), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f.d(3, true, false);
        this.n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f.setVisibility(0);
        this.n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.g0.L(52.0f);
        final int L = org.telegram.messenger.g0.L(24.0f);
        final int L2 = org.telegram.messenger.g0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.mb1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                zb1 zb1Var = zb1.this;
                zb1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                zb1Var.f0.setTranslationY(L2 * floatValue);
                int i3 = (int) (marginEnd - ((r1 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i3;
                marginLayoutParams2.rightMargin = i3;
                zb1Var.f0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ri0(16, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.i3(new kb1(this, 7), 133L);
    }

    @Override // wf.a
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        this.r0 = this.q0;
        G();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i3, int i10) {
        this.r0 = this.q0;
        if (i10 == 2 && !this.V0) {
            this.V0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            uf.d dVar = this.h0;
            if (dVar != null) {
                dVar.c();
                this.h0 = null;
            }
        } else if (this.h0 == null && xf.b.a(this.b) == 1) {
            uf.c cVar = new uf.c(this.b, o1);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.z1 z1Var = this.d0;
            cVar.j = z1Var.d;
            cVar.k = z1Var.getPlaceholderView();
            this.h0 = cVar.a();
        }
        G();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.ui.Components.voip.j2 j2Var;
        if (i3 > 0) {
            this.k1 = true;
        }
        if (this.G == null || (j2Var = this.w) == null) {
            return;
        }
        int i10 = j2Var.W;
        if ((i10 == 2 || i10 == 3) && this.k1) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.o2(this, i3, 27), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i3) {
        int i10 = this.q0;
        if (i10 != i3) {
            this.r0 = i10;
            this.q0 = i3;
            if (this.v0 != null) {
                G();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
        this.r0 = this.q0;
        if (z10 && !this.V0) {
            this.V0 = true;
        }
        G();
    }

    public final void p(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService) {
        if (!this.o0) {
            q2Var.d(2, false, false);
            q2Var.setOnBtnClickedListener(null);
            q2Var.setEnabled(false);
        } else {
            q2Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                q2Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                q2Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            q2Var.setOnBtnClickedListener(new b7(this, voIPService, q2Var, 23));
        }
    }

    @Override // wf.a
    public final View q() {
        org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(this.b, false, true, false, false);
        this.l1 = z1Var;
        z1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.l1.d.setEnableHardwareScaler(true);
        this.l1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.z1 z1Var2 = this.l1;
        z1Var2.b0 = 1;
        z1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new tb1(this));
        View view = this.l1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.l1;
    }

    @Override // wf.a
    public final void r(b8.cg cgVar) {
        this.m1 = cgVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        rb1 rb1Var = this.v0;
        rb1Var.getClass();
        windowManager.addView(rb1Var, org.telegram.ui.Components.voip.d2.a());
        this.n1 = false;
        G();
        this.v0.invalidate();
        org.telegram.ui.Components.voip.z1 z1Var = this.l1;
        if (z1Var != null) {
            z1Var.d.release();
            this.l1 = null;
        }
    }

    public final void s(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService, boolean z10) {
        q2Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.c1 c1Var = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = c1Var.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.L, isMicMute ? 1.0f : 0.0f);
            c1Var.g0 = ofFloat;
            ofFloat.addUpdateListener(c1Var.h0);
            c1Var.g0.setDuration(150L);
            c1Var.g0.start();
        } else {
            ValueAnimator valueAnimator2 = c1Var.g0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            c1Var.L = isMicMute ? 1.0f : 0.0f;
            c1Var.invalidate();
        }
        q2Var.setOnBtnClickedListener(new ib1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService) {
        int i3;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            q2Var.d(4, false, false);
            i10 = 2;
        } else {
            if (!voipAudioManager.isSpeakerphoneOn()) {
                q2Var.d(5, false, false);
                i3 = 1;
                q2Var.setEnabled(true);
                q2Var.setOnBtnClickedListener(new cg.e0(this, i3, q2Var, voIPService, 9));
            }
            q2Var.d(5, true, false);
        }
        i3 = i10;
        q2Var.setEnabled(true);
        q2Var.setOnBtnClickedListener(new cg.e0(this, i3, q2Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService, boolean z10) {
        if (!((this.o0 || this.n0) ? true : voIPService.isVideoAvailable())) {
            q2Var.d(3, true, false);
            q2Var.setOnClickListener(null);
            q2Var.setEnabled(false);
            return;
        }
        if (!this.o0) {
            q2Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            q2Var.d(3, false, z10);
        } else {
            q2Var.d(3, false, z10);
        }
        q2Var.setOnBtnClickedListener(new ib1(this, 6));
        q2Var.setEnabled(true);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12 = (this.o0 || this.n0) ? false : true;
        if (!z10) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            this.E.setVisibility(z12 ? 0 : 8);
        } else if (z12 && this.E.getTag() == null) {
            this.E.animate().setListener(null).cancel();
            this.E.setVisibility(0);
            if (this.D0) {
                if (z11) {
                    this.E.setAlpha(0.0f);
                    this.E.setTranslationY(org.telegram.messenger.g0.L(48.0f));
                    this.E.setScaleX(0.1f);
                    this.E.setScaleY(0.1f);
                }
            } else if (z11) {
                this.E.setAlpha(0.0f);
                this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
            } else {
                this.E.setAlpha(0.0f);
                this.E.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
            }
        } else if (!z12 && this.E.getTag() != null) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.xq.f).setListener(new ob1(this, 8)).start();
        }
        this.E.setTag(z12 ? 1 : null);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(0, this.b, null);
        boolean[] zArr = new boolean[3];
        k3Var.S = org.telegram.messenger.bd.M0(2131743418, null);
        k3Var.U = charSequence;
        k3Var.o0 = org.telegram.messenger.bd.M0(2131747839, null);
        k3Var.p0 = null;
        k3Var.show();
        for (int i3 = 0; i3 < 3; i3++) {
            if (zArr[i3] && (textView = (TextView) k3Var.d(-(i3 + 1))) != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, k3Var.l1);
            }
        }
        k3Var.setCanceledOnTouchOutside(true);
        k3Var.setOnDismissListener(new s5(this, 18));
    }

    public final void y(int i3, boolean z10) {
        AnimatorSet animatorSet;
        if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
            this.Z.setUiVisible(this.y0);
        }
        if (!z10 && (animatorSet = this.B0) != null) {
            animatorSet.removeAllListeners();
            this.B0.cancel();
        }
        if (i3 != 0) {
            boolean z11 = (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() == 0) ? false : z10;
            if (!z10) {
                this.Z.setVisibility(0);
            } else if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
                if (this.Z.getVisibility() == 8) {
                    this.Z.setAlpha(0.0f);
                    this.Z.setScaleX(0.7f);
                    this.Z.setScaleY(0.7f);
                    this.Z.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.B0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.B0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.c1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.c1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.c1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.B0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.c1 c1Var = this.Z;
                if (c1Var.E < 0.0f) {
                    c1Var.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            this.Z.c(i3 == 2, z11);
            this.b0 = i3 != 2;
        } else if (!z10) {
            this.Z.setVisibility(8);
        } else if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.B0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.B0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.c1 c1Var2 = this.Z;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(c1Var2, (Property<org.telegram.ui.Components.voip.c1, Float>) View.ALPHA, c1Var2.getAlpha(), 0.0f));
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.c1 c1Var3 = this.Z;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var3, (Property<org.telegram.ui.Components.voip.c1, Float>) View.SCALE_X, c1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.c1 c1Var4 = this.Z;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(c1Var4, (Property<org.telegram.ui.Components.voip.c1, Float>) View.SCALE_Y, c1Var4.getScaleX(), 0.7f));
            }
            this.B0 = animatorSet5;
            animatorSet5.addListener(new ob1(this, 7));
            this.B0.setDuration(250L).setInterpolator(org.telegram.ui.Components.xq.f);
            this.B0.setStartDelay(50L);
            this.B0.start();
        }
        this.Z.setTag(Integer.valueOf(i3));
    }

    public final void z(boolean z10) {
        int i3;
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        xy0 xy0Var = this.R0;
        if (z10 || !this.y0) {
            if (z10 && !this.y0) {
                this.O0.f(true);
                this.P0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
                translationY.setInterpolator(xqVar).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(xqVar).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                this.k0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                this.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z0, 1.0f);
                this.Q0 = ofFloat;
                ofFloat.addUpdateListener(xy0Var);
                this.Q0.setDuration(150L).setInterpolator(xqVar);
                this.Q0.start();
                this.k0.setEnabled(true);
            }
            i3 = 0;
        } else {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f;
            duration.setInterpolator(xqVar2).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar2).start();
            this.J.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar2).start();
            this.O.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(xqVar2).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(xqVar2).start();
            this.k0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
            this.j0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.z0, 0.0f);
            this.Q0 = ofFloat2;
            ofFloat2.addUpdateListener(xy0Var);
            this.Q0.setDuration(150L).setInterpolator(xqVar2);
            this.Q0.start();
            org.telegram.messenger.g0.r(this.T0);
            this.S0 = false;
            this.k0.setEnabled(false);
            this.P0.f(true);
            i3 = org.telegram.messenger.hs.g2;
        }
        this.y0 = z10;
        rb1 rb1Var = this.v0;
        if (z10) {
            rb1Var.setSystemUiVisibility(rb1Var.getSystemUiVisibility() & (-5));
        } else {
            rb1Var.setSystemUiVisibility(rb1Var.getSystemUiVisibility() | 4);
        }
        this.N0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.y0 ? org.telegram.messenger.g0.L(80.0f) : 0)).setDuration(150L).setStartDelay(i3).setInterpolator(org.telegram.ui.Components.xq.f).start();
    }

    @Override // wf.a
    public final /* synthetic */ void m(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
