package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zi1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, rf.a {
    public static zi1 n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.o2 F;
    public float F0;
    public yi1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public gg.k K;
    public long K0;
    public int L;
    public sg.p1 M;
    public org.telegram.ui.Components.voip.g2 M0;
    public gc1 N;
    public org.telegram.ui.Components.voip.d3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.d3 O0;
    public org.telegram.ui.Components.voip.q0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.n1 Q;
    public bi.w6 R;
    public boolean R0;
    public TextView S;
    public uk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public vi1 X;
    public float X0;
    public org.telegram.ui.Components.voip.t1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.t1 Z;
    public float Z0;
    public final int a;
    public boolean a0;
    public boolean a1;
    public Activity b;
    public TextureViewRenderer b0;
    public float b1;
    public final TLRPC.User c;
    public org.telegram.ui.Components.voip.r2 c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.r2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.k3 e;
    public org.telegram.ui.Components.voip.e e0;
    public int e1;
    public org.telegram.ui.Components.voip.k3 f;
    public boolean f0;
    public pf.e g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.k3 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.q1 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.r2 k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean m1;
    public wi1 n;
    public boolean n0;
    public si1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public ui1 s;
    public boolean s0;
    public float t0;
    public ri1 u0;
    public org.telegram.ui.Components.voip.c3 v;
    public int v0;
    public org.telegram.ui.Components.voip.z2 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.e3 x;
    public org.telegram.ui.Components.voip.s0 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.p1 r = new org.telegram.ui.Components.voip.p1();
    public final org.telegram.ui.Components.w9[] V = new org.telegram.ui.Components.w9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final f21 Q0 = new f21(this, 20);
    public final ji1 S0 = new ji1(this, 12);
    public final ji1 T0 = new ji1(this, 13);
    public float f1 = 1.0f;

    public zi1(int i10) {
        this.a = i10;
        this.c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.q0 = -1;
        this.p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static /* synthetic */ void i(zi1 zi1Var) {
        AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
        zi1Var.R0 = false;
        if (Build.VERSION.SDK_INT < 23 || zi1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
            zi1Var.C();
        } else {
            zi1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static void j(zi1 zi1Var) {
        zi1 zi1Var2;
        int i10 = 0;
        if (zi1Var.g1) {
            zi1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            zi1Var.i1 = ofFloat;
            zi1Var2 = zi1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(zi1Var2, zi1Var.f1, zi1Var.Y0, zi1Var.Z0, 1));
            zi1Var2.i1.addListener(new ni1(zi1Var2, i10));
            zi1Var2.i1.setDuration(350L);
            zi1Var2.i1.setInterpolator(org.telegram.ui.Components.wr.f);
            zi1Var2.i1.start();
        } else {
            zi1Var2 = zi1Var;
        }
        zi1Var2.h1 = false;
        zi1Var2.a1 = false;
    }

    public static void q(int i10, int[] iArr) {
        zi1 zi1Var = n1;
        if (zi1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    zi1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    zi1Var.r(new org.telegram.ui.Components.c30(27));
                } else if (!zi1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.e2.h(zi1Var.b, new ji1(zi1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    zi1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    zi1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        zi1 zi1Var = n1;
        if (zi1Var != null && zi1Var.u0.getParent() == null) {
            zi1 zi1Var2 = n1;
            if (zi1Var2 != null) {
                zi1Var2.c0.d.release();
                n1.d0.d.release();
                n1.b0.release();
                ri1 ri1Var = n1.u0;
                if (ri1Var != null) {
                    ri1Var.d();
                }
                n1.l();
            }
            n1 = null;
        }
        if (n1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.l2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        zi1 zi1Var3 = new zi1(i10);
        zi1Var3.b = activity;
        n1 = zi1Var3;
        ri1 ri1Var2 = new ri1(activity, !z10, zi1Var3);
        n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        n1.getClass();
        ri1Var2.setLockOnScreen(n1.J0);
        zi1Var3.u0 = ri1Var2;
        hi1 hi1Var = new hi1(zi1Var3, 4);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(ri1Var2, hi1Var);
        ((WindowManager) activity.getSystemService("window")).addView(ri1Var2, org.telegram.ui.Components.voip.w2.a());
        zi1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        zi1Var3.w0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
        ui1 ui1Var = new ui1(zi1Var3, activity);
        ui1Var.setClipToPadding(false);
        ui1Var.setClipChildren(false);
        ui1Var.setBackgroundColor(-16777216);
        zi1Var3.G();
        zi1Var3.s = ui1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.p1 p1Var = zi1Var3.r;
        zi1Var3.v = new org.telegram.ui.Components.voip.c3(activity, z11, p1Var);
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, false, true, false, false);
        zi1Var3.c0 = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        r2Var.d.setScalingType(scalingType);
        zi1Var3.c0.d.setEnableHardwareScaler(true);
        zi1Var3.c0.d.setRotateTextureWithScreen(true);
        zi1Var3.c0.a0 = 1;
        ui1Var.addView(zi1Var3.v, w7.a6.c(-1.0f, -1));
        TLRPC.User user = zi1Var3.d;
        org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity, user, p1Var);
        zi1Var3.w = z2Var;
        ui1Var.addView(z2Var, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity);
        int i11 = 2;
        if (LiteMode.isEnabled(512)) {
            int i12 = org.telegram.ui.ActionBar.j6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i13 = calendar.get(2);
            int i14 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                e3Var.a = new org.telegram.ui.Components.lw0(0);
            }
        }
        zi1Var3.x = e3Var;
        ui1Var.addView(e3Var, w7.a6.c(220.0f, -1));
        ui1Var.addView(zi1Var3.c0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.v9(orientation, new int[]{-14994098, -14328963}).f(o0.b.u(0.5f, 1), new id1(zi1Var3, 1), 0L);
        org.telegram.ui.Components.voip.t1 t1Var = new org.telegram.ui.Components.voip.t1(activity);
        zi1Var3.Y = t1Var;
        t1Var.setDelegate(new hi1(zi1Var3, 3));
        zi1Var3.Y.d(1.0f, 1.0f);
        zi1Var3.a0 = true;
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(activity, true, false);
        zi1Var3.d0 = r2Var2;
        r2Var2.d.setIsCamera(true);
        zi1Var3.d0.d.setUseCameraRotation(true);
        zi1Var3.Y.setOnTapListener(new ki1(zi1Var3, 1));
        zi1Var3.d0.d.setMirror(true);
        zi1Var3.Y.addView(zi1Var3.d0);
        org.telegram.ui.Components.voip.t1 t1Var2 = new org.telegram.ui.Components.voip.t1(activity);
        zi1Var3.Z = t1Var2;
        t1Var2.S = true;
        t1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        zi1Var3.b0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        zi1Var3.b0.setIsCamera(false);
        zi1Var3.b0.setFpsReduction(30.0f);
        zi1Var3.b0.setScalingType(scalingType);
        zi1Var3.Z.addView(zi1Var3.b0, w7.a6.e(-1, -2, 17));
        zi1Var3.Z.setOnTapListener(new ki1(zi1Var3, i11));
        zi1Var3.Z.setVisibility(8);
        ui1Var.addView(zi1Var3.Y, w7.a6.c(-2.0f, -2));
        ui1Var.addView(zi1Var3.Z);
        View view = new View(activity);
        zi1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
        ui1Var.addView(zi1Var3.h0, w7.a6.e(-1, 160, 80));
        View view2 = new View(activity);
        zi1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
        ui1Var.addView(zi1Var3.i0, w7.a6.e(-1, 160, 48));
        gc1 gc1Var = new gc1(zi1Var3, activity, 16);
        zi1Var3.N = gc1Var;
        gc1Var.setOrientation(0);
        zi1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        zi1Var3.N.setClipToPadding(false);
        zi1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        zi1Var3.N.setOnClickListener(new ki1(zi1Var3, 3));
        zi1Var3.P = new org.telegram.ui.Components.voip.q0(activity, p1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        zi1Var3.O = frameLayout;
        frameLayout.addView(zi1Var3.P, w7.a6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        zi1Var3.O.setVisibility(8);
        zi1Var3.O.setOnClickListener(new ki1(zi1Var3, 4));
        bi.w6 w6Var = new bi.w6(activity, p1Var);
        zi1Var3.R = w6Var;
        w6Var.setOrientation(1);
        TextView textView = new TextView(activity);
        zi1Var3.S = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        zi1Var3.S.setTextSize(1, 15.0f);
        zi1Var3.S.setTypeface(AndroidUtilities.bold());
        zi1Var3.S.setTextColor(-1);
        zi1Var3.S.setGravity(17);
        uk ukVar = new uk(zi1Var3, activity, 5);
        zi1Var3.T = ukVar;
        ukVar.setTextSize(1, 15.0f);
        zi1Var3.T.setTextColor(-1);
        zi1Var3.T.setGravity(17);
        zi1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), zi1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        zi1Var3.R.setVisibility(8);
        zi1Var3.R.addView(zi1Var3.S);
        zi1Var3.R.addView(zi1Var3.T, w7.a6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        zi1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
            org.telegram.ui.Components.w9[] w9VarArr = zi1Var3.V;
            w9VarArr[i15] = w9Var;
            w9VarArr[i15].getImageReceiver().setAspectFit(true);
            zi1Var3.N.addView(w9VarArr[i15], w7.a6.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        vi1 vi1Var = new vi1(zi1Var3, activity);
        zi1Var3.X = vi1Var;
        vi1Var.setOrientation(1);
        zi1Var3.X.setFocusable(true);
        zi1Var3.X.setFocusableInTouchMode(true);
        zi1Var3.y = new org.telegram.ui.Components.voip.s0(activity);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.r(user);
        org.telegram.ui.Components.voip.s0 s0Var = zi1Var3.y;
        int i16 = zi1Var3.a;
        s0Var.b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, g9Var, user);
        zi1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        zi1Var3.E = textView2;
        textView2.setTextSize(1, 28.0f);
        zi1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), zi1Var3.E.getPaint().getFontMetricsInt(), false));
        zi1Var3.E.setMaxLines(2);
        zi1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
        zi1Var3.E.setTextColor(-1);
        zi1Var3.E.setGravity(1);
        zi1Var3.E.setImportantForAccessibility(2);
        zi1Var3.X.addView(zi1Var3.E, w7.a6.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity);
        o2Var.a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            o2Var.a[i17] = new TextView(activity);
            o2Var.a[i17].setTextSize(1, 15.0f);
            o2Var.a[i17].setTextColor(-1);
            o2Var.a[i17].setGravity(1);
            o2Var.addView(o2Var.a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        o2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(o2Var, activity, p1Var);
        m2Var.setTextSize(1, 15.0f);
        m2Var.setTextColor(-1);
        m2Var.setGravity(1);
        m2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        m2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(m2Var, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        o2Var.addView(frameLayout2, w7.a6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        o2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        o2Var.addView(textView3, w7.a6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new gg.f2(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity);
        o2Var.d = s2Var;
        o2Var.addView(s2Var, w7.a6.c(-2.0f, -1));
        zi1Var3.F = o2Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        o2Var.setImportantForAccessibility(4);
        zi1Var3.X.addView(zi1Var3.F, w7.a6.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            yi1 yi1Var = new yi1(activity);
            zi1Var3.G = yi1Var;
            long j3 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.i9 i9Var = yi1Var.b;
                i9Var.k(min);
                int i20 = 0;
                while (i20 < min) {
                    i9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j3 = j3;
                }
                long j10 = j3;
                i9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j10))) {
                    yi1Var.setVisibility(8);
                } else {
                    yi1Var.c = new org.telegram.ui.Components.t01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    yi1Var.setVisibility(0);
                    yi1Var.invalidate();
                }
            } else {
                yi1Var.setVisibility(8);
            }
            zi1Var3.X.addView(zi1Var3.G, w7.a6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        zi1Var3.X.setClipChildren(false);
        zi1Var3.X.setClipToPadding(false);
        zi1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        zi1Var3.U = new org.telegram.ui.Components.voip.k(activity);
        zi1Var3.Q = new org.telegram.ui.Components.voip.n1(activity, p1Var);
        zi1Var3.U.setAlpha(0.0f);
        zi1Var3.Q.setVisibility(8);
        ui1Var.addView(zi1Var3.y, w7.a6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        ui1Var.addView(zi1Var3.X, w7.a6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        ui1Var.addView(zi1Var3.O, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ui1Var.addView(zi1Var3.R, w7.a6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        ui1Var.addView(zi1Var3.N, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ui1Var.addView(zi1Var3.U, w7.a6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        ui1Var.addView(zi1Var3.Q, w7.a6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        zi1Var3.j0 = new org.telegram.ui.Components.voip.q1(activity);
        zi1Var3.e = new org.telegram.ui.Components.voip.k3(activity, p1Var);
        zi1Var3.f = new org.telegram.ui.Components.voip.k3(activity, p1Var);
        zi1Var3.h = new org.telegram.ui.Components.voip.k3(activity, p1Var);
        zi1Var3.n = new wi1(activity, 52.0f);
        zi1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        zi1Var3.e.setScaleX(0.0f);
        zi1Var3.e.setScaleY(0.0f);
        zi1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zi1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        zi1Var3.f.setScaleX(0.0f);
        zi1Var3.f.setScaleY(0.0f);
        zi1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zi1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        zi1Var3.h.setScaleX(0.0f);
        zi1Var3.h.setScaleY(0.0f);
        zi1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zi1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        zi1Var3.n.setScaleX(0.0f);
        zi1Var3.n.setScaleY(0.0f);
        zi1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        zi1Var3.j0.addView(zi1Var3.e);
        zi1Var3.j0.addView(zi1Var3.f);
        zi1Var3.j0.addView(zi1Var3.h);
        zi1Var3.j0.addView(zi1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        zi1Var3.e0 = eVar;
        eVar.setListener(new xi1(zi1Var3));
        zi1Var3.e0.setScaleX(1.15f);
        zi1Var3.e0.setScaleY(1.15f);
        ui1Var.addView(zi1Var3.j0, w7.a6.e(-1, -2, 80));
        float f7 = AndroidUtilities.isTablet() ? 100 : 27;
        ui1Var.addView(zi1Var3.e0, w7.a6.d(-1, 186.0f, 80, f7, 0.0f, f7, 0.0f));
        ImageView imageView = new ImageView(activity);
        zi1Var3.I = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
        zi1Var3.I.setImageResource(R.drawable.msg_addcontact);
        zi1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        ui1Var.addView(zi1Var3.I, w7.a6.e(56, 56, 53));
        w7.c6.a(zi1Var3.I);
        ImageView imageView2 = new ImageView(activity);
        zi1Var3.H = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
        zi1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
        zi1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        zi1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
        ui1Var.addView(zi1Var3.H, w7.a6.e(56, 56, 51));
        w7.c6.a(zi1Var3.H);
        gg.k kVar = new gg.k(activity, 5);
        zi1Var3.K = kVar;
        kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        zi1Var3.K.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
        zi1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        ui1Var.addView(zi1Var3.K, w7.a6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        zi1Var3.K.setAlpha(0.0f);
        zi1Var3.K.setOnClickListener(new ki1(zi1Var3, 5));
        int i21 = 6;
        zi1Var3.H.setOnClickListener(new ki1(zi1Var3, i21));
        zi1Var3.I.setOnClickListener(new w71(7, zi1Var3, activity));
        if (zi1Var3.u0.b) {
            zi1Var3.H.setVisibility(8);
            zi1Var3.I.setVisibility(8);
        }
        org.telegram.ui.Components.voip.g2 g2Var = new org.telegram.ui.Components.voip.g2(activity);
        g2Var.a = new HashMap();
        g2Var.b = new ArrayList();
        g2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        g2Var.r = textPaint;
        g2Var.setOrientation(1);
        g2Var.n = p1Var;
        TransitionSet transitionSet = new TransitionSet();
        g2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.o0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        zi1Var3.M0 = g2Var;
        g2Var.setGravity(80);
        zi1Var3.M0.setOnViewsUpdated(new ji1(zi1Var3, 5));
        ui1Var.addView(zi1Var3.M0, w7.a6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity, 3, p1Var, true);
        d3Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        d3Var.K = alignment;
        d3Var.d = -1L;
        d3Var.l0 = new ji1(zi1Var3, i21);
        d3Var.T = true;
        d3Var.h = AndroidUtilities.dp(320.0f);
        d3Var.e = true;
        d3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
        d3Var.q(8.0f);
        zi1Var3.N0 = d3Var;
        d3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
        ui1Var.addView(zi1Var3.N0, w7.a6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.d3 d3Var2 = new org.telegram.ui.Components.voip.d3(activity, 1, p1Var, false);
        d3Var2.p(true);
        d3Var2.K = alignment;
        d3Var2.d = 4000L;
        d3Var2.T = true;
        d3Var2.h = AndroidUtilities.dp(320.0f);
        d3Var2.e = true;
        d3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
        d3Var2.q(8.0f);
        zi1Var3.O0 = d3Var2;
        d3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
        ui1Var.addView(zi1Var3.O0, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        zi1Var3.H();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!zi1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                zi1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            zi1Var3.o();
        }
        ri1Var2.addView(ui1Var);
        if (z10) {
            zi1Var3.F0 = 0.0f;
            zi1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                zi1Var3.c0.setStub(org.telegram.ui.Components.voip.l2.k().r);
                zi1Var3.d0.setStub(org.telegram.ui.Components.voip.l2.k().n);
            }
            zi1Var3.u0.setAlpha(0.0f);
            zi1Var3.H();
            zi1Var3.E0 = true;
            org.telegram.ui.Components.voip.l2.T = true;
            if (org.telegram.ui.Components.voip.l2.V != null) {
                org.telegram.ui.Components.voip.l2.U.getClass();
                throw null;
            }
            zi1Var3.L0.lock();
            AndroidUtilities.runOnUIThread(new ji1(zi1Var3, 11), 32L);
        } else {
            zi1Var3.F0 = 1.0f;
            zi1Var3.G();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
            zi1 zi1Var4 = n1;
            pf.d dVar = new pf.d(activity, zi1Var4);
            dVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var3 = zi1Var4.c0;
            dVar.j = r2Var3.d;
            dVar.k = r2Var3.getPlaceholderView();
            zi1Var4.g0 = dVar.a();
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f21 f21Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
                translationY.setInterpolator(wrVar).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(wrVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(f21Var);
                this.P0.setDuration(150L).setInterpolator(wrVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.wr wrVar2 = org.telegram.ui.Components.wr.f;
            duration.setInterpolator(wrVar2).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar2).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar2).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar2).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(wrVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(wrVar2).start();
            this.j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(f21Var);
            this.P0.setDuration(150L).setInterpolator(wrVar2);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.e(true);
            i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.x0 = z10;
        ri1 ri1Var = this.u0;
        if (z10) {
            ri1Var.setSystemUiVisibility(ri1Var.getSystemUiVisibility() & (-5));
        } else {
            ri1Var.setSystemUiVisibility(ri1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.wr.f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            ji1 ji1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(ji1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                AndroidUtilities.runOnUIThread(ji1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void C() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? LocaleController.getString(R.string.AccDescrVoipCamOn) : LocaleController.getString(R.string.AccDescrVoipCamOff));
            }
            if (this.n0) {
                this.d0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.q0 = this.p0;
                H();
                return;
            }
            if (this.o0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.u0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                si1 si1Var = new si1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = si1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    si1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.o0);
            }
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new org.telegram.ui.ActionBar.o0(4).setDuration(250L);
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
            transitionSet.addTransition(duration.setInterpolator(wrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(wrVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.u2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.k3.class, true);
            TransitionManager.beginDelayedTransition(this.j0, transitionSet);
        }
        int i10 = this.p0;
        if (i10 == 11) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        int i11 = 0;
        if (i10 == 15 || i10 == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i10 == 15) {
                if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                    u(this.e, sharedInstance);
                    this.K.animate().alpha(0.0f).start();
                } else {
                    s(this.e, sharedInstance);
                    if (this.x0) {
                        this.K.animate().alpha(1.0f).start();
                    }
                }
                v(this.f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (n1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                u(this.e, sharedInstance);
                this.K.setTag(null);
                this.K.animate().alpha(0.0f).start();
            } else {
                s(this.e, sharedInstance);
                if (this.x0) {
                    this.K.setTag(1);
                    this.K.animate().alpha(1.0f).start();
                }
            }
            v(this.f, sharedInstance, false);
            t(this.h, sharedInstance, z10);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
            this.n.setOnClickListener(new ki1(this, 0));
        }
        if (this.e.getVisibility() == 0) {
            this.e.f = 0;
            i11 = 16;
        }
        if (this.f.getVisibility() == 0) {
            this.f.f = i11;
            i11 += 16;
        }
        if (this.h.getVisibility() == 0) {
            this.h.f = i11;
            i11 += 16;
        }
        if (this.n.getVisibility() == 0) {
            this.n.F = i11;
        }
        F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.w9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.w9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.w9] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.p5] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.w9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        gg.h1 h1Var;
        String[] strArr;
        TLRPC.Document document;
        int i10;
        ?? r52;
        if (this.B0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z12 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            bArr = null;
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(bArr, 0, bArr.length));
        int i11 = 0;
        while (true) {
            r62 = this.V;
            drawableArr = this.W;
            if (i11 >= 4) {
                break;
            }
            Emoji.preloadEmoji(emojifyForCall[i11]);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(emojifyForCall[i11]);
            if (emojiDrawable != null) {
                emojiDrawable.setBounds(z12 ? 1 : 0, z12 ? 1 : 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                emojiDrawable.preload();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(28.0f));
                CharSequence replaceEmoji = Emoji.replaceEmoji(emojifyForCall[i11], textPaint.getFontMetricsInt(), z12, iArr);
                boolean z13 = replaceEmoji instanceof Spannable;
                int i12 = this.a;
                if (z13) {
                    Spannable spannable = (Spannable) replaceEmoji;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), Emoji.EmojiSpan.class);
                    org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.y5.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z12 ? 1 : 0] - emojiSpanArr.length) - (y5VarArr == null ? 0 : y5VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i13 = 0;
                            ?? r32 = z12;
                            while (i13 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new u3(this, 23));
                                if (stickerSet != null) {
                                    String replace = emojiSpan.emoji.replace("️", "");
                                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                                    int size = arrayList.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= size) {
                                            strArr = emojifyForCall;
                                            i10 = length;
                                            document = null;
                                            break;
                                        }
                                        TLRPC.Document document2 = arrayList.get(i14);
                                        i14++;
                                        strArr = emojifyForCall;
                                        document = document2;
                                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                                        i10 = length;
                                        if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document, null).replace("️", ""), replace)) {
                                            break;
                                        }
                                        length = i10;
                                        emojifyForCall = strArr;
                                        arrayList = arrayList2;
                                    }
                                    if (document != null) {
                                        break;
                                    }
                                    i13++;
                                    length = i10;
                                    emojifyForCall = strArr;
                                    r32 = 0;
                                }
                            }
                        }
                    }
                    strArr = emojifyForCall;
                    document = null;
                    if (document == null) {
                        Drawable drawable = drawableArr[i11];
                        if ((drawable instanceof org.telegram.ui.Components.p5) && ((org.telegram.ui.Components.p5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.p5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(21, i12, document);
                            drawableArr[i11] = p5Var;
                            r52 = p5Var;
                        }
                        r52.r(strArr[i11]);
                        r62[i11].setAnimatedEmojiDrawable(r52);
                        r62[i11].getImageReceiver().clearImage();
                        emojiDrawable = r52;
                    } else {
                        r62[i11].setImageDrawable(emojiDrawable);
                        emojiDrawable = emojiDrawable;
                    }
                    r62[i11].setVisibility(8);
                }
                strArr = emojifyForCall;
                document = null;
                if (document == null) {
                }
                r62[i11].setVisibility(8);
            } else {
                strArr = emojifyForCall;
            }
            drawableArr[i11] = emojiDrawable;
            i11++;
            emojifyForCall = strArr;
            z12 = false;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            Drawable drawable2 = drawableArr[i16];
            if (drawable2 instanceof Emoji.EmojiDrawable) {
                z11 = ((Emoji.EmojiDrawable) drawable2).isLoaded();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.p5) && (h1Var = ((org.telegram.ui.Components.p5) drawable2).k) != null) {
                    Drawable thumb = h1Var.getThumb();
                    if (!(thumb instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) thumb).isLoaded()) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
            if (z11) {
                i15++;
            }
        }
        if (i15 == 4) {
            this.B0 = true;
            for (int i17 = 0; i17 < 4; i17++) {
                if (r62[i17].getVisibility() != 0) {
                    r62[i17].setVisibility(0);
                    if (z10) {
                        r62[i17].setAlpha(0.0f);
                        r62[i17].setScaleX(0.0f);
                        r62[i17].setScaleY(0.0f);
                        org.telegram.messenger.em.q(r62[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.wr.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new ji1(this, 9), 1000L);
        }
    }

    public final void F() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i10 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.J != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void G() {
        this.k0.setColor(i0.a.k(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        ui1 ui1Var = this.s;
        if (ui1Var != null) {
            ui1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0915 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0bbb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0bcb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cc9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d27 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:398:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x07e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        TLRPC.User user;
        int childsHight;
        org.telegram.ui.Components.voip.t1 t1Var;
        org.telegram.ui.Components.voip.t1 t1Var2;
        boolean z15;
        boolean z16;
        org.telegram.ui.Components.voip.r2 r2Var;
        VideoSink videoSink;
        int i13;
        boolean z17;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j3;
        Layout layout;
        int lineCount;
        float f7;
        float f10;
        float f11;
        TL_phone.PhoneCall phoneCall2;
        float f12;
        boolean z18;
        boolean z19;
        TextView textView;
        int i14;
        boolean z20 = true;
        z20 = true;
        z20 = true;
        z20 = true;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z21 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.p0;
        TLRPC.User user2 = this.d;
        if (i15 == 1 || i15 == 2) {
            this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z21);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    this.F.b(LocaleController.getString(R.string.VoipFailed), false, z21);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new ji1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user2.first_name, user2.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String formatString = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user2));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4(this.b, 0, null);
                            boolean[] zArr2 = new boolean[3];
                            a4Var.R = LocaleController.getString(R.string.VoipFailed);
                            a4Var.T = AndroidUtilities.replaceTags(formatString);
                            String string = LocaleController.getString(R.string.Cancel);
                            hi1 hi1Var = new hi1(this, 2);
                            a4Var.n0 = string;
                            a4Var.o0 = hi1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            fz0 fz0Var = new fz0(14, this, zArr);
                            a4Var.l0 = string2;
                            a4Var.m0 = fz0Var;
                            a4Var.show();
                            for (int i16 = 0; i16 < 3; i16++) {
                                if (zArr2[i16] && (textView = (TextView) a4Var.d(-(i16 + 1))) != null) {
                                    textView.setTextColor(a4Var.e(org.telegram.ui.ActionBar.j6.q7));
                                }
                            }
                            a4Var.setCanceledOnTouchOutside(true);
                            a4Var.setOnDismissListener(new di.h0(this, zArr, 12));
                        } else {
                            y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user2))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user2.first_name, user2.last_name))));
                        org.telegram.ui.Components.d5.l0(this.b, this.a, user2.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        y("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        y(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new ji1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z22 = sharedInstance != null && sharedInstance.hasRate();
                            this.d0.c();
                            if (!z22 || this.G0) {
                                AndroidUtilities.runOnUIThread(new ji1(this, 0), 200L);
                                break;
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i17 = AndroidUtilities.displaySize.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i17 - iArr[0]) - ((this.n.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.U.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.U.setTranslationY(iArr[1]);
                                    this.U.setAlpha(1.0f);
                                    this.U.setLayoutParams(marginLayoutParams);
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new r91(18, this, sharedInstance), 2L);
                                    i14 = 0;
                                } else {
                                    this.j0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                                    layoutParams.rightMargin = AndroidUtilities.dp(18.0f);
                                    layoutParams.leftMargin = AndroidUtilities.dp(18.0f);
                                    int dp = AndroidUtilities.dp(36.0f);
                                    layoutParams.bottomMargin = dp;
                                    WindowInsets windowInsets = this.r0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + dp;
                                    }
                                    layoutParams.gravity = 80;
                                    this.U.setLayoutParams(layoutParams);
                                    this.U.animate().alpha(1.0f).setDuration(250L).start();
                                    i14 = 0;
                                    this.U.a(new ii1(this, sharedInstance, i14), false);
                                }
                                this.Q.setVisibility(i14);
                                org.telegram.ui.Components.voip.n1 n1Var = this.Q;
                                hi1 hi1Var2 = new hi1(this, true ? 1 : 0);
                                org.telegram.ui.Components.voip.m1[] m1VarArr = n1Var.c;
                                n1Var.d = hi1Var2;
                                org.telegram.ui.Components.voip.k1 k1Var = n1Var.a;
                                k1Var.setVisibility(i14);
                                n1Var.b.setVisibility(i14);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k1Var, (Property<org.telegram.ui.Components.voip.k1, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k1Var, (Property<org.telegram.ui.Components.voip.k1, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k1Var, (Property<org.telegram.ui.Components.voip.k1, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(k1Var, (Property<org.telegram.ui.Components.voip.k1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.wr.f);
                                animatorSet.setDuration(250L);
                                int i18 = 0;
                                while (i18 < m1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    m1VarArr[i18].setAlpha(0.0f);
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(m1VarArr[i18], (Property<org.telegram.ui.Components.voip.m1, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(m1VarArr[i18], (Property<org.telegram.ui.Components.voip.m1, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(m1VarArr[i18], (Property<org.telegram.ui.Components.voip.m1, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(m1VarArr[i18], (Property<org.telegram.ui.Components.voip.m1, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i18 * 16);
                                    animatorSet2.start();
                                    i18++;
                                    animatorSet = animatorSet;
                                    property3 = property3;
                                }
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
                                    duration.setInterpolator(wrVar).setListener(new org.telegram.ui.Components.yo(this.O)).start();
                                    this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(wrVar).setDuration(250L).start();
                                    this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new org.telegram.ui.Components.yo(this.O)).setDuration(250L).setInterpolator(wrVar).start();
                                }
                                for (org.telegram.ui.Components.w9 w9Var : this.V) {
                                    w9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.wr.f).setDuration(250L).start();
                                }
                                this.E.animate().alpha(0.0f).setDuration(70L).setListener(new qi1(this)).start();
                                ViewPropertyAnimator alpha = this.K.animate().alpha(0.0f);
                                org.telegram.ui.Components.wr wrVar2 = org.telegram.ui.Components.wr.f;
                                org.telegram.messenger.em.q(alpha, wrVar2, 250L);
                                this.K.setVisibility(8);
                                this.F.d(false, true);
                                this.F.c(false);
                                org.telegram.ui.Components.voip.s2 s2Var = this.F.d;
                                s2Var.n = true;
                                s2Var.invalidate();
                                org.telegram.ui.Components.voip.s0 s0Var = this.y;
                                s0Var.setShowWaves(false);
                                AnimatorSet animatorSet3 = s0Var.c;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                s0Var.c = animatorSet4;
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(s0Var, (Property<org.telegram.ui.Components.voip.s0, Float>) View.ALPHA, s0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(s0Var, (Property<org.telegram.ui.Components.voip.s0, Float>) View.TRANSLATION_Y, s0Var.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(s0Var, (Property<org.telegram.ui.Components.voip.s0, Float>) View.SCALE_X, s0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(s0Var, (Property<org.telegram.ui.Components.voip.s0, Float>) View.SCALE_Y, s0Var.getScaleY(), 0.9f, 1.0f));
                                s0Var.c.setInterpolator(wrVar2);
                                s0Var.c.setDuration(300L);
                                s0Var.c.setStartDelay(250L);
                                s0Var.c.start();
                                D(true);
                                this.n.setVisibility(4);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                this.Y.setAlpha(0.0f);
                                this.Y.setVisibility(8);
                                si1 si1Var = this.o0;
                                if (si1Var != null) {
                                    si1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.F.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z21);
                                break;
                            }
                            break;
                        case 13:
                            this.F.b(LocaleController.getString(R.string.VoipWaiting), true, z21);
                            break;
                        case 14:
                            this.F.b(LocaleController.getString(R.string.VoipRequesting), true, z21);
                            break;
                        case 15:
                            this.e0.setRetryMod(false);
                            if (sharedState == null || !sharedState.isConference()) {
                                if (sharedState == null || !sharedState.isCallingVideo()) {
                                    this.F.b(LocaleController.getString(R.string.VoipInCallBranding), false, z21);
                                    this.e0.setTranslationY(0.0f);
                                    break;
                                } else {
                                    this.F.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z21);
                                    this.e0.setTranslationY(-AndroidUtilities.dp(60.0f));
                                    break;
                                }
                            } else {
                                this.F.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z21);
                                this.e0.setTranslationY(0.0f);
                                break;
                            }
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.F.b(LocaleController.getString(R.string.VoipRinging), true, z21);
                                break;
                            }
                            break;
                        case 17:
                            this.F.b(LocaleController.getString(R.string.VoipBusy), false, z21);
                            this.e0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            break;
                    }
                    z11 = false;
                    z10 = false;
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z23 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z18 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z19 = false;
                                this.n0 = z19;
                                if (z19 && !this.U0) {
                                    this.U0 = z18;
                                }
                            }
                        } else {
                            z18 = true;
                        }
                        z19 = true;
                        this.n0 = z19;
                        if (z19) {
                            this.U0 = z18;
                        }
                    }
                    if (z21) {
                        this.Y.b();
                        this.Z.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 1.0f;
                            this.v.setAlpha(1.0f);
                        }
                        if (z21) {
                            this.c0.animate().alpha(f12).setDuration(250L).start();
                        } else {
                            this.c0.animate().cancel();
                            this.c0.setAlpha(f12);
                        }
                        if (!this.c0.d.isFirstFrameRendered() && !this.I0) {
                            i10 = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.v.setVisibility(4);
                            } else {
                                this.v.setVisibility(i10);
                                if (z21) {
                                    this.c0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.c0.animate().cancel();
                                    this.c0.setAlpha(0.0f);
                                }
                            }
                            z12 = this.n0;
                            if (z12 || !this.m0) {
                                this.H0 = false;
                            }
                            boolean z24 = (z12 || !this.H0 || AndroidUtilities.isInPictureInPictureMode(this.b)) ? false : true;
                            x(z21, z23);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z21) {
                                this.e0.setVisibility(z20 ? 0 : 8);
                            } else {
                                if (z20 && this.e0.getTag() == null) {
                                    this.e0.animate().setListener(null).cancel();
                                    if (this.e0.getVisibility() == 8) {
                                        this.e0.setVisibility(0);
                                        this.e0.setAlpha(0.0f);
                                    }
                                    this.e0.animate().alpha(1.0f);
                                }
                                if (!z20 && this.e0.getTag() != null) {
                                    this.e0.animate().setListener(null).cancel();
                                    i11 = 8;
                                    this.e0.animate().setListener(new ni1(this, i11)).alpha(0.0f);
                                    this.e0.setEnabled(z20);
                                    this.e0.setTag(z20 ? 1 : null);
                                    this.u0.setLockOnScreen(this.J0);
                                    z13 = this.p0 != 3 && (this.n0 || this.m0);
                                    this.z0 = z13;
                                    if (!z13 && !this.x0) {
                                        A(true);
                                    }
                                    if (this.x0 || !this.z0 || this.R0 || sharedInstance == null) {
                                        z14 = z24;
                                    } else {
                                        z14 = z24;
                                        AndroidUtilities.runOnUIThread(this.S0, 3000L);
                                        this.R0 = true;
                                    }
                                    int i19 = this.p0;
                                    boolean z25 = i19 == 11 && this.x0;
                                    boolean z26 = (!z20 || i19 == 16 || i19 == 11 || i19 == 12 || i19 == 14 || i19 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    boolean z27 = z25;
                                    if (z21) {
                                        if (z27) {
                                            f7 = 80.0f;
                                            this.H.animate().alpha(1.0f).start();
                                        } else {
                                            f7 = 80.0f;
                                            if (this.H.getVisibility() != 0) {
                                                this.H.setVisibility(0);
                                                f10 = 0.0f;
                                                this.H.setAlpha(0.0f);
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            this.H.animate().alpha(f10).start();
                                        }
                                        if (z26) {
                                            this.I.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.I.getVisibility() != 0) {
                                                this.I.setVisibility(0);
                                                f11 = 0.0f;
                                                this.I.setAlpha(0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            this.I.animate().alpha(f11).start();
                                        }
                                        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(f7) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                                    } else {
                                        ImageView imageView = this.H;
                                        if (z27) {
                                            i11 = 0;
                                        }
                                        imageView.setVisibility(i11);
                                        this.H.setAlpha(z27 ? 1.0f : 0.0f);
                                        this.I.setVisibility(z26 ? 0 : 8);
                                        this.I.setAlpha(z26 ? 1.0f : 0.0f);
                                        this.M0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i12 = this.p0;
                                    if (i12 != 10 && i12 != 11) {
                                        D(z21);
                                    }
                                    if (z10) {
                                        this.F.e(z21);
                                    }
                                    this.F.d(z11, z21);
                                    if (this.y.getVisibility() == 0 && this.C0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.T.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = hc.b.B(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.p0 == 11 && !this.n0 && !this.m0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.n0 || this.m0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z21) {
                                        user = user2;
                                        if (this.C0 && (this.n0 || this.m0)) {
                                            this.X.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                                            j3 = 250;
                                        } else {
                                            j3 = 250;
                                            this.X.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                                        }
                                        if (dp2 != this.v0) {
                                            ViewPropertyAnimator animate = this.X.animate();
                                            if (this.p0 != 11) {
                                                j3 = 0;
                                            }
                                            animate.setStartDelay(j3).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                                        }
                                    } else {
                                        user = user2;
                                        this.X.setTranslationY(dp2);
                                    }
                                    this.v0 = dp2;
                                    boolean z28 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i20 = this.p0;
                                    this.D0 = i20 == 11 && i20 != 17 && ((this.n0 && !z28) || this.m0);
                                    if (sharedInstance != null) {
                                        if (this.n0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.d0.setIsScreencast(sharedInstance.isScreencast());
                                        this.d0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.n0 || sharedInstance.isScreencast()) ? null : this.d0.d;
                                        if (!this.m1 || (r2Var = this.k1) == null) {
                                            if (z14) {
                                                videoSink = this.b0;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z21) {
                                                    org.telegram.ui.Components.voip.g2 g2Var = this.M0;
                                                    g2Var.f = false;
                                                    if (!g2Var.e && g2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(g2Var, g2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.M0.c("self-muted");
                                                } else {
                                                    this.M0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.n0 || this.m0) && (((i13 = this.p0) == 3 || i13 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.g2 g2Var2 = this.M0;
                                                        g2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.M0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.g2 g2Var3 = this.M0;
                                                        g2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.g2 g2Var4 = this.M0;
                                                        g2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var4.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.M0.c("muted");
                                                    }
                                                    this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                }
                                                if (this.M0.getChildCount() == 0 && this.m0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                                    sharedUIParams = sharedInstance.sharedUIParams;
                                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                        sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                        this.N0.setTranslationY(-((this.s.getMeasuredHeight() - this.j0.getY()) + AndroidUtilities.dp(6.0f)));
                                                        this.N0.m(0.0f, this.f.getX() + this.j0.getX() + AndroidUtilities.dp(14.0f));
                                                        this.N0.u();
                                                        z17 = true;
                                                        if (z21) {
                                                            org.telegram.ui.Components.voip.g2 g2Var5 = this.M0;
                                                            if (g2Var5.f) {
                                                                g2Var5.e = z17;
                                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.x(g2Var5, 4), 700L);
                                                            }
                                                            g2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.M0.getChildCount() != 0) {
                                                    z17 = true;
                                                    this.N0.e(true);
                                                    if (z21) {
                                                    }
                                                }
                                                z17 = true;
                                                if (z21) {
                                                }
                                            } else {
                                                r2Var = this.c0;
                                            }
                                        }
                                        videoSink = r2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z21) {
                                        }
                                        if (sharedInstance.isMicMute()) {
                                        }
                                        if (this.n0) {
                                        }
                                        if (sharedInstance.getRemoteAudioState() != 0) {
                                        }
                                        if (sharedInstance.getRemoteVideoState() != 0) {
                                        }
                                        if (this.M0.getChildCount() == 0) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                        }
                                        z17 = true;
                                        if (z21) {
                                        }
                                    }
                                    childsHight = this.M0.getChildsHight();
                                    t1Var = this.Z;
                                    if (t1Var.getParent() == null && z21) {
                                        t1Var.T = childsHight;
                                    } else {
                                        t1Var.T = childsHight;
                                    }
                                    t1Var2 = this.Y;
                                    if (t1Var2.getParent() == null && z21) {
                                        t1Var2.T = childsHight;
                                    } else {
                                        t1Var2.T = childsHight;
                                    }
                                    this.Y.setUiVisible(this.x0);
                                    this.Z.setUiVisible(this.x0);
                                    if (!this.n0) {
                                        z15 = true;
                                        z(0, z21);
                                    } else if (!this.m0 || this.H0) {
                                        z15 = true;
                                        z(1, z21);
                                    } else {
                                        z(2, z21);
                                        z15 = true;
                                    }
                                    if (!z14 && this.Z.getTag() == null) {
                                        this.Z.setIsActive(z15);
                                        if (this.Z.getVisibility() != 0) {
                                            this.Z.setVisibility(0);
                                            this.Z.setAlpha(0.0f);
                                            this.Z.setScaleX(0.5f);
                                            this.Z.setScaleY(0.5f);
                                        }
                                        this.Z.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.t1 t1Var3 = this.Z;
                                        t1Var3.c0 = true;
                                        t1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).setStartDelay(150L).withEndAction(new ji1(this, 4)).start();
                                        this.Z.setTag(1);
                                    } else if (!z14 && this.Z.getTag() != null) {
                                        this.Z.setIsActive(false);
                                        this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ni1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                                        this.Z.setTag(null);
                                    }
                                    this.Y.a();
                                    this.Z.a();
                                    F();
                                    if (this.p0 == 3) {
                                        this.w.a();
                                        this.y.a();
                                        int i21 = this.v.V;
                                        if (i21 != 2 && i21 != 3) {
                                            int[] iArr2 = new int[2];
                                            this.y.getLocationOnScreen(iArr2);
                                            this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.q0 != -1);
                                            z16 = !this.n0 || this.m0;
                                            this.x.setState(z16);
                                            this.w.setState(z16);
                                            this.r.e(z16);
                                            if (this.m0 && !z23 && this.f0) {
                                                this.f0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z16) {
                                                if (this.i0.getVisibility() != 4) {
                                                    this.i0.setVisibility(4);
                                                    this.h0.setVisibility(4);
                                                }
                                            } else if (this.i0.getVisibility() != 0) {
                                                this.i0.setVisibility(0);
                                                this.h0.setVisibility(0);
                                            }
                                            ji1 ji1Var = this.T0;
                                            AndroidUtilities.cancelRunOnUIThread(ji1Var);
                                            if (this.p0 != 3) {
                                                AndroidUtilities.runOnUIThread(ji1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (this.n0) {
                                    }
                                    this.x.setState(z16);
                                    this.w.setState(z16);
                                    this.r.e(z16);
                                    if (this.m0) {
                                        this.f0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z16) {
                                    }
                                    ji1 ji1Var2 = this.T0;
                                    AndroidUtilities.cancelRunOnUIThread(ji1Var2);
                                    if (this.p0 != 3) {
                                    }
                                }
                            }
                            i11 = 8;
                            this.e0.setEnabled(z20);
                            this.e0.setTag(z20 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            if (this.p0 != 3) {
                            }
                            this.z0 = z13;
                            if (!z13) {
                                A(true);
                            }
                            if (this.x0) {
                            }
                            z14 = z24;
                            int i192 = this.p0;
                            if (i192 == 11) {
                            }
                            if (!z20) {
                            }
                            boolean z272 = z25;
                            if (z21) {
                            }
                            i12 = this.p0;
                            if (i12 != 10) {
                                D(z21);
                            }
                            if (z10) {
                            }
                            this.F.d(z11, z21);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.T.getLayout();
                                if (layout != null) {
                                    dp2 = hc.b.B(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.p0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.n0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z21) {
                            }
                            this.v0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i202 = this.p0;
                            this.D0 = i202 == 11 && i202 != 17 && ((this.n0 && !z28) || this.m0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.M0.getChildsHight();
                            t1Var = this.Z;
                            if (t1Var.getParent() == null) {
                            }
                            t1Var.T = childsHight;
                            t1Var2 = this.Y;
                            if (t1Var2.getParent() == null) {
                            }
                            t1Var2.T = childsHight;
                            this.Y.setUiVisible(this.x0);
                            this.Z.setUiVisible(this.x0);
                            if (!this.n0) {
                            }
                            if (!z14) {
                            }
                            if (!z14) {
                                this.Z.setIsActive(false);
                                this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ni1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                                this.Z.setTag(null);
                            }
                            this.Y.a();
                            this.Z.a();
                            F();
                            if (this.p0 == 3) {
                            }
                            if (this.n0) {
                            }
                            this.x.setState(z16);
                            this.w.setState(z16);
                            this.r.e(z16);
                            if (this.m0) {
                            }
                            if (z16) {
                            }
                            ji1 ji1Var22 = this.T0;
                            AndroidUtilities.cancelRunOnUIThread(ji1Var22);
                            if (this.p0 != 3) {
                            }
                        }
                    }
                    i10 = 0;
                    if (this.n0) {
                    }
                    this.v.setVisibility(4);
                    z12 = this.n0;
                    if (z12) {
                    }
                    this.H0 = false;
                    if (z12) {
                    }
                    x(z21, z23);
                    if (this.y.getTag() != null) {
                    }
                    if (z21) {
                    }
                    i11 = 8;
                    this.e0.setEnabled(z20);
                    this.e0.setTag(z20 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z13;
                    if (!z13) {
                    }
                    if (this.x0) {
                    }
                    z14 = z24;
                    int i1922 = this.p0;
                    if (i1922 == 11) {
                    }
                    if (!z20) {
                    }
                    boolean z2722 = z25;
                    if (z21) {
                    }
                    i12 = this.p0;
                    if (i12 != 10) {
                    }
                    if (z10) {
                    }
                    this.F.d(z11, z21);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.p0 == 11) {
                    }
                    if (!this.n0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z21) {
                    }
                    this.v0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i2022 = this.p0;
                    this.D0 = i2022 == 11 && i2022 != 17 && ((this.n0 && !z28) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    t1Var = this.Z;
                    if (t1Var.getParent() == null) {
                    }
                    t1Var.T = childsHight;
                    t1Var2 = this.Y;
                    if (t1Var2.getParent() == null) {
                    }
                    t1Var2.T = childsHight;
                    this.Y.setUiVisible(this.x0);
                    this.Z.setUiVisible(this.x0);
                    if (!this.n0) {
                    }
                    if (!z14) {
                    }
                    if (!z14) {
                    }
                    this.Y.a();
                    this.Z.a();
                    F();
                    if (this.p0 == 3) {
                    }
                    if (this.n0) {
                    }
                    this.x.setState(z16);
                    this.w.setState(z16);
                    this.r.e(z16);
                    if (this.m0) {
                    }
                    if (z16) {
                    }
                    ji1 ji1Var222 = this.T0;
                    AndroidUtilities.cancelRunOnUIThread(ji1Var222);
                    if (this.p0 != 3) {
                    }
                }
            }
            E(z21);
            if (this.p0 == 5) {
                boolean z29 = this.s0;
                if (!z29 && this.q0 != 5) {
                    this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z21);
                }
                z11 = z29;
                z20 = false;
                z10 = false;
                if (this.o0 == null) {
                }
            } else {
                z10 = true;
                this.s0 = true;
                z20 = false;
                z11 = false;
                if (this.o0 == null) {
                }
            }
        }
        z20 = false;
        z11 = false;
        z10 = false;
        if (this.o0 == null) {
        }
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.r2 r2Var = this.c0;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        this.m1 = true;
        H();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.u0);
        this.u0.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        ri1 ri1Var = this.u0;
        ri1Var.getClass();
        windowManager.addView(ri1Var, org.telegram.ui.Components.voip.w2.a());
        this.m1 = false;
        H();
        this.u0.invalidate();
        org.telegram.ui.Components.voip.r2 r2Var = this.k1;
        if (r2Var != null) {
            r2Var.d.release();
            this.k1 = null;
        }
    }

    @Override // rf.a
    public final Bitmap c() {
        org.telegram.ui.Components.voip.r2 r2Var = this.k1;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.k1.d.getBitmap();
    }

    @Override // rf.a
    public final void d(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.p0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.d0.d.release();
            this.c0.d.release();
            this.b0.release();
            o();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
            return;
        }
        if (i10 == NotificationCenter.closeInCallActivity) {
            this.u0.b();
            return;
        }
        if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f0 = booleanValue;
            if (booleanValue) {
                this.y.b(true, true);
            }
        }
    }

    @Override // rf.a
    public final Bitmap e() {
        org.telegram.ui.Components.voip.r2 r2Var = this.c0;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.c0.d.getBitmap();
    }

    @Override // rf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // rf.a
    public final View h() {
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(this.b, false, true, false, false);
        this.k1 = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.k1.d.setEnableHardwareScaler(true);
        this.k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.r2 r2Var2 = this.k1;
        r2Var2.a0 = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ti1(this));
        View view = this.k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.k1;
    }

    public final ValueAnimator k(boolean z10) {
        char c10;
        float measuredHeight;
        final float f7;
        final boolean z11;
        final float f10;
        float f11;
        float f12;
        this.Y.animate().cancel();
        float f13 = org.telegram.ui.Components.voip.l2.k().d.x + org.telegram.ui.Components.voip.l2.k().y;
        float f14 = org.telegram.ui.Components.voip.l2.k().d.y + org.telegram.ui.Components.voip.l2.k().E;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.l2.U.getClass();
        final float measuredWidth = f13 - ((this.c0.getMeasuredWidth() - (this.c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f14 - ((this.c0.getMeasuredHeight() - (this.c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f15 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (!this.n0 || measuredWidth2 == 0) {
                c10 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f11 = 1.0f;
                f12 = 0.0f;
            } else {
                f12 = (this.u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f11 = (((org.telegram.ui.Components.voip.l2.k().f * 0.25f) + (f13 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.l2.k().h * 0.25f) + (f14 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            }
            float f16 = f12;
            f7 = f11;
            f10 = f16;
        } else {
            c10 = 0;
            float measuredWidth3 = f13 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f14 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f7 = measuredWidth3;
            z11 = true;
            f10 = 0.25f;
        }
        final float f17 = measuredHeight;
        float dp = this.m0 ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.l2.U.getClass();
            f15 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f7);
                this.Y.setTranslationY(f17);
                this.Y.setCornerRadius(dp2);
                this.Y.setAlpha(f15);
            }
            this.c0.setScaleX(0.25f);
            this.c0.setScaleY(0.25f);
            this.c0.setTranslationX(measuredWidth);
            this.c0.setTranslationY(measuredHeight2);
            this.c0.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        float f18 = z10 ? 1.0f : 0.0f;
        float f19 = z10 ? 0.0f : 1.0f;
        float[] fArr = new float[2];
        fArr[c10] = f18;
        fArr[1] = f19;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.F0 = z10 ? 0.0f : 1.0f;
        G();
        final float f20 = dp;
        final float f21 = 0.25f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.mi1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f22 = 1.0f - floatValue;
                zi1 zi1Var = zi1.this;
                zi1Var.F0 = f22;
                zi1Var.G();
                if (z11) {
                    float f23 = (f10 * floatValue) + (scaleX * f22);
                    zi1Var.Y.setScaleX(f23);
                    zi1Var.Y.setScaleY(f23);
                    zi1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f22));
                    zi1Var.Y.setTranslationY((f17 * floatValue) + (y3 * f22));
                    zi1Var.Y.setCornerRadius((dp2 * floatValue) + (f20 * f22));
                    zi1Var.Y.setAlpha((f15 * floatValue) + (1.0f * f22));
                }
                float f24 = (f21 * floatValue) + (1.0f * f22);
                zi1Var.c0.setScaleX(f24);
                zi1Var.c0.setScaleY(f24);
                float f25 = 0.0f * f22;
                float f26 = (measuredWidth * floatValue) + f25;
                float f27 = (measuredHeight2 * floatValue) + f25;
                zi1Var.c0.setTranslationX(f26);
                zi1Var.c0.setTranslationY(f27);
                zi1Var.c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f24);
                if (!zi1Var.Y.P) {
                    zi1Var.d0.d(floatValue, false);
                }
                zi1Var.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        pf.e eVar = this.g0;
        if (eVar != null) {
            eVar.c();
            this.g0 = null;
        }
        sg.p1 p1Var = this.M;
        if (p1Var != null) {
            p1Var.dismiss();
            this.M = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.z2 z2Var = this.w;
            int i10 = 1;
            if (z2Var.K && z10 != z2Var.E) {
                z2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                z2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y2(z2Var, i10));
                z2Var.c.setInterpolator(org.telegram.ui.Components.wr.f);
                z2Var.c.setDuration(200L);
                z2Var.c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.wr.g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
                org.telegram.messenger.em.q(translationY, wrVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ni1(this, 3)).setInterpolator(wrVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.wr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.wr wrVar2 = org.telegram.ui.Components.wr.f;
                duration.setInterpolator(wrVar2).setListener(new org.telegram.ui.Components.yo(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(wrVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ni1(this, 4)).setDuration(250L).setInterpolator(wrVar2).start();
            }
            this.q0 = this.p0;
            H();
        }
    }

    public final void n() {
        this.u0.b();
    }

    public final void o() {
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new oi1(this));
        this.c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new pi1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        this.q0 = this.p0;
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        this.q0 = this.p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            pf.e eVar = this.g0;
            if (eVar != null) {
                eVar.c();
                this.g0 = null;
            }
        } else if (this.g0 == null && sf.c.a(this.b) == 1) {
            pf.d dVar = new pf.d(this.b, n1);
            dVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var = this.c0;
            dVar.j = r2Var.d;
            dVar.k = r2Var.getPlaceholderView();
            this.g0 = dVar.a();
        }
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.c3 c3Var;
        if (i10 > 0) {
            this.j1 = true;
        }
        if (this.F == null || (c3Var = this.v) == null) {
            return;
        }
        int i11 = c3Var.V;
        if ((i11 == 2 || i11 == 3) && this.j1) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zd(this, i10, 27), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        int i11 = this.p0;
        if (i11 != i10) {
            this.q0 = i11;
            this.p0 = i10;
            if (this.u0 != null) {
                H();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
        this.q0 = this.p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        H();
    }

    public final void p() {
        if (this.G0 || this.E0) {
            return;
        }
        si1 si1Var = this.o0;
        if (si1Var != null) {
            si1Var.a(false, false);
            return;
        }
        if (this.m0 && this.n0 && this.H0) {
            this.H0 = false;
            this.Y.setRelativePosition(this.Z);
            this.a0 = false;
            this.q0 = this.p0;
            H();
            return;
        }
        if (this.C0) {
            m(false);
            return;
        }
        if (this.R.getVisibility() != 8) {
            return;
        }
        if (!this.D0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.u0.b();
            return;
        }
        if (sf.c.a(this.b) <= 0) {
            org.telegram.ui.Components.d5.B(this.b, new hi1(this, 0), true).o();
            return;
        }
        if (this.G0 || n1 == null) {
            return;
        }
        this.G0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = n1.u0.getMeasuredHeight();
            zi1 zi1Var = n1;
            org.telegram.ui.Components.voip.l2.l(zi1Var.b, zi1Var.a, zi1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = n1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.l2.W = windowInsets.getSystemWindowInsetTop();
                n1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.l2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f;
        duration.setInterpolator(wrVar).start();
        this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
        this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
        org.telegram.ui.Components.voip.l2.T = true;
        this.E0 = true;
        ValueAnimator k10 = k(false);
        this.L0.lock();
        k10.addListener(new ni1(this, 1));
        k10.setDuration(350L);
        k10.setInterpolator(wrVar);
        k10.start();
    }

    public final void r(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.e0;
            ValueAnimator valueAnimator = eVar.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.e0;
        ValueAnimator valueAnimator2 = eVar2.b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.b0 = null;
            eVar2.U.stop();
        }
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
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
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.li1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                zi1 zi1Var = zi1.this;
                zi1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                zi1Var.e0.setTranslationY(dp2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                zi1Var.e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.vv0(15, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new ji1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        if (!this.n0) {
            k3Var.d(2, false, false);
            k3Var.setOnBtnClickedListener(null);
            k3Var.setEnabled(false);
        } else {
            k3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                k3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                k3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            k3Var.setOnBtnClickedListener(new a7(this, voIPService, k3Var, 23));
        }
    }

    public final void t(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        k3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.t1 t1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = t1Var.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.K, isMicMute ? 1.0f : 0.0f);
            t1Var.f0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.g0);
            t1Var.f0.setDuration(150L);
            t1Var.f0.start();
        } else {
            ValueAnimator valueAnimator2 = t1Var.f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            t1Var.K = isMicMute ? 1.0f : 0.0f;
            t1Var.invalidate();
        }
        k3Var.setOnBtnClickedListener(new hi1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            k3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            k3Var.d(5, true, false);
            i10 = 0;
        } else {
            k3Var.d(5, false, false);
            i10 = 1;
        }
        k3Var.setEnabled(true);
        k3Var.setOnBtnClickedListener(new ea(this, i10, k3Var, voIPService, 8));
    }

    public final void v(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            k3Var.d(3, true, false);
            k3Var.setOnClickListener(null);
            k3Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            k3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            k3Var.d(3, false, z10);
        } else {
            k3Var.d(3, false, z10);
        }
        k3Var.setOnBtnClickedListener(new hi1(this, 6));
        k3Var.setEnabled(true);
    }

    public final void x(boolean z10, boolean z11) {
        boolean z12 = (this.n0 || this.m0) ? false : true;
        if (!z10) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.setAlpha(1.0f);
            this.y.setScaleX(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setVisibility(z12 ? 0 : 8);
        } else if (z12 && this.y.getTag() == null) {
            this.y.animate().setListener(null).cancel();
            this.y.setVisibility(0);
            if (this.C0) {
                if (z11) {
                    this.y.setAlpha(0.0f);
                    this.y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.y.setScaleX(0.1f);
                    this.y.setScaleY(0.1f);
                }
            } else if (z11) {
                this.y.setAlpha(0.0f);
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
            }
        } else if (!z12 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.wr.f).setListener(new ni1(this, 7)).start();
        }
        this.y.setTag(z12 ? 1 : null);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4(this.b, 0, null);
        boolean[] zArr = new boolean[3];
        a4Var.R = LocaleController.getString(R.string.VoipFailed);
        a4Var.T = charSequence;
        a4Var.l0 = LocaleController.getString(R.string.OK);
        a4Var.m0 = null;
        a4Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) a4Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(a4Var.e(org.telegram.ui.ActionBar.j6.q7));
            }
        }
        a4Var.setCanceledOnTouchOutside(true);
        a4Var.setOnDismissListener(new s5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.x0);
        }
        if (!z10 && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        if (i10 != 0) {
            boolean z11 = (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() == 0) ? false : z10;
            if (!z10) {
                this.Y.setVisibility(0);
            } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 0) {
                if (this.Y.getVisibility() == 8) {
                    this.Y.setAlpha(0.0f);
                    this.Y.setScaleX(0.7f);
                    this.Y.setScaleY(0.7f);
                    this.Y.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.A0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.A0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.t1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.t1 t1Var = this.Y;
                if (t1Var.y < 0.0f) {
                    t1Var.d(1.0f, 1.0f);
                    this.a0 = true;
                }
            }
            this.Y.c(i10 == 2, z11);
            this.a0 = i10 != 2;
        } else if (!z10) {
            this.Y.setVisibility(8);
        } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.A0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.A0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.t1 t1Var2 = this.Y;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(t1Var2, (Property<org.telegram.ui.Components.voip.t1, Float>) View.ALPHA, t1Var2.getAlpha(), 0.0f));
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.t1 t1Var3 = this.Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t1Var3, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_X, t1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.t1 t1Var4 = this.Y;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(t1Var4, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_Y, t1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new ni1(this, 6));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.wr.f);
            this.A0.setStartDelay(50L);
            this.A0.start();
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
