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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ui1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, sf.a {
    public static ui1 n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.n2 F;
    public float F0;
    public ti1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public ig.k K;
    public long K0;
    public int L;
    public ug.n1 M;
    public org.telegram.ui.Components.voip.f2 M0;
    public cc1 N;
    public org.telegram.ui.Components.voip.b3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.b3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.m1 Q;
    public di.x5 R;
    public boolean R0;
    public TextView S;
    public sk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public qi1 X;
    public float X0;
    public org.telegram.ui.Components.voip.s1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.s1 Z;
    public float Z0;
    public final int a;
    public boolean a0;
    public boolean a1;
    public Activity b;
    public TextureViewRenderer b0;
    public float b1;
    public final TLRPC.User c;
    public org.telegram.ui.Components.voip.q2 c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.q2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.i3 e;
    public org.telegram.ui.Components.voip.e e0;
    public int e1;
    public org.telegram.ui.Components.voip.i3 f;
    public boolean f0;
    public qf.e g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.i3 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.p1 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.q2 k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean m1;
    public ri1 n;
    public boolean n0;
    public ni1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public pi1 s;
    public boolean s0;
    public float t0;
    public mi1 u0;
    public org.telegram.ui.Components.voip.a3 v;
    public int v0;
    public org.telegram.ui.Components.voip.x2 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.c3 x;
    public org.telegram.ui.Components.voip.r0 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.o1 r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.x9[] V = new org.telegram.ui.Components.x9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final b21 Q0 = new b21(this, 20);
    public final ei1 S0 = new ei1(this, 12);
    public final ei1 T0 = new ei1(this, 13);
    public float f1 = 1.0f;

    public ui1(int i10) {
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

    public static /* synthetic */ void i(ui1 ui1Var) {
        AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
        ui1Var.R0 = false;
        if (Build.VERSION.SDK_INT < 23 || ui1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
            ui1Var.C();
        } else {
            ui1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static void j(ui1 ui1Var) {
        ui1 ui1Var2;
        int i10 = 0;
        if (ui1Var.g1) {
            ui1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ui1Var.i1 = ofFloat;
            ui1Var2 = ui1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(ui1Var2, ui1Var.f1, ui1Var.Y0, ui1Var.Z0, 1));
            ui1Var2.i1.addListener(new ii1(ui1Var2, i10));
            ui1Var2.i1.setDuration(350L);
            ui1Var2.i1.setInterpolator(org.telegram.ui.Components.pr.f);
            ui1Var2.i1.start();
        } else {
            ui1Var2 = ui1Var;
        }
        ui1Var2.h1 = false;
        ui1Var2.a1 = false;
    }

    public static void q(int i10, int[] iArr) {
        ui1 ui1Var = n1;
        if (ui1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ui1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    ui1Var.r(new q31(3));
                } else if (!ui1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.d2.h(ui1Var.b, new ei1(ui1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ui1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    ui1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        ui1 ui1Var = n1;
        if (ui1Var != null && ui1Var.u0.getParent() == null) {
            ui1 ui1Var2 = n1;
            if (ui1Var2 != null) {
                ui1Var2.c0.d.release();
                n1.d0.d.release();
                n1.b0.release();
                mi1 mi1Var = n1.u0;
                if (mi1Var != null) {
                    mi1Var.d();
                }
                n1.l();
            }
            n1 = null;
        }
        if (n1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.k2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        ui1 ui1Var3 = new ui1(i10);
        ui1Var3.b = activity;
        n1 = ui1Var3;
        mi1 mi1Var2 = new mi1(activity, !z10, ui1Var3);
        n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        n1.getClass();
        mi1Var2.setLockOnScreen(n1.J0);
        ui1Var3.u0 = mi1Var2;
        ci1 ci1Var = new ci1(ui1Var3, 4);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(mi1Var2, ci1Var);
        ((WindowManager) activity.getSystemService("window")).addView(mi1Var2, org.telegram.ui.Components.voip.u2.a());
        ui1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        ui1Var3.w0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
        pi1 pi1Var = new pi1(ui1Var3, activity);
        pi1Var.setClipToPadding(false);
        pi1Var.setClipChildren(false);
        pi1Var.setBackgroundColor(-16777216);
        ui1Var3.G();
        ui1Var3.s = pi1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.o1 o1Var = ui1Var3.r;
        ui1Var3.v = new org.telegram.ui.Components.voip.a3(activity, z11, o1Var);
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(activity, false, true, false, false);
        ui1Var3.c0 = q2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        q2Var.d.setScalingType(scalingType);
        ui1Var3.c0.d.setEnableHardwareScaler(true);
        ui1Var3.c0.d.setRotateTextureWithScreen(true);
        ui1Var3.c0.a0 = 1;
        pi1Var.addView(ui1Var3.v, w7.x5.c(-1.0f, -1));
        TLRPC.User user = ui1Var3.d;
        org.telegram.ui.Components.voip.x2 x2Var = new org.telegram.ui.Components.voip.x2(activity, user, o1Var);
        ui1Var3.w = x2Var;
        pi1Var.addView(x2Var, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.voip.c3 c3Var = new org.telegram.ui.Components.voip.c3(activity);
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
                c3Var.a = new org.telegram.ui.Components.zv0(0);
            }
        }
        ui1Var3.x = c3Var;
        pi1Var.addView(c3Var, w7.x5.c(220.0f, -1));
        pi1Var.addView(ui1Var3.c0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.w9(orientation, new int[]{-14994098, -14328963}).f(l.d.s(0.5f, 1), new ed1(ui1Var3, 1), 0L);
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
        ui1Var3.Y = s1Var;
        s1Var.setDelegate(new ci1(ui1Var3, 3));
        ui1Var3.Y.d(1.0f, 1.0f);
        ui1Var3.a0 = true;
        org.telegram.ui.Components.voip.q2 q2Var2 = new org.telegram.ui.Components.voip.q2(activity, true, false);
        ui1Var3.d0 = q2Var2;
        q2Var2.d.setIsCamera(true);
        ui1Var3.d0.d.setUseCameraRotation(true);
        ui1Var3.Y.setOnTapListener(new fi1(ui1Var3, 1));
        ui1Var3.d0.d.setMirror(true);
        ui1Var3.Y.addView(ui1Var3.d0);
        org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
        ui1Var3.Z = s1Var2;
        s1Var2.S = true;
        s1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        ui1Var3.b0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        ui1Var3.b0.setIsCamera(false);
        ui1Var3.b0.setFpsReduction(30.0f);
        ui1Var3.b0.setScalingType(scalingType);
        ui1Var3.Z.addView(ui1Var3.b0, w7.x5.e(-1, -2, 17));
        ui1Var3.Z.setOnTapListener(new fi1(ui1Var3, i11));
        ui1Var3.Z.setVisibility(8);
        pi1Var.addView(ui1Var3.Y, w7.x5.c(-2.0f, -2));
        pi1Var.addView(ui1Var3.Z);
        View view = new View(activity);
        ui1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
        pi1Var.addView(ui1Var3.h0, w7.x5.e(-1, 160, 80));
        View view2 = new View(activity);
        ui1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
        pi1Var.addView(ui1Var3.i0, w7.x5.e(-1, 160, 48));
        cc1 cc1Var = new cc1(ui1Var3, activity, 16);
        ui1Var3.N = cc1Var;
        cc1Var.setOrientation(0);
        ui1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        ui1Var3.N.setClipToPadding(false);
        ui1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        ui1Var3.N.setOnClickListener(new fi1(ui1Var3, 3));
        ui1Var3.P = new org.telegram.ui.Components.voip.p0(activity, o1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        ui1Var3.O = frameLayout;
        frameLayout.addView(ui1Var3.P, w7.x5.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        ui1Var3.O.setVisibility(8);
        ui1Var3.O.setOnClickListener(new fi1(ui1Var3, 4));
        di.x5 x5Var = new di.x5(activity, o1Var);
        ui1Var3.R = x5Var;
        x5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        ui1Var3.S = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        ui1Var3.S.setTextSize(1, 15.0f);
        ui1Var3.S.setTypeface(AndroidUtilities.bold());
        ui1Var3.S.setTextColor(-1);
        ui1Var3.S.setGravity(17);
        sk skVar = new sk(ui1Var3, activity, 5);
        ui1Var3.T = skVar;
        skVar.setTextSize(1, 15.0f);
        ui1Var3.T.setTextColor(-1);
        ui1Var3.T.setGravity(17);
        ui1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ui1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        ui1Var3.R.setVisibility(8);
        ui1Var3.R.addView(ui1Var3.S);
        ui1Var3.R.addView(ui1Var3.T, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        ui1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(activity);
            org.telegram.ui.Components.x9[] x9VarArr = ui1Var3.V;
            x9VarArr[i15] = x9Var;
            x9VarArr[i15].getImageReceiver().setAspectFit(true);
            ui1Var3.N.addView(x9VarArr[i15], w7.x5.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        qi1 qi1Var = new qi1(ui1Var3, activity);
        ui1Var3.X = qi1Var;
        qi1Var.setOrientation(1);
        ui1Var3.X.setFocusable(true);
        ui1Var3.X.setFocusableInTouchMode(true);
        ui1Var3.y = new org.telegram.ui.Components.voip.r0(activity);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.r(user);
        org.telegram.ui.Components.voip.r0 r0Var = ui1Var3.y;
        int i16 = ui1Var3.a;
        r0Var.b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, i9Var, user);
        ui1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        ui1Var3.E = textView2;
        textView2.setTextSize(1, 28.0f);
        ui1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ui1Var3.E.getPaint().getFontMetricsInt(), false));
        ui1Var3.E.setMaxLines(2);
        ui1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
        ui1Var3.E.setTextColor(-1);
        ui1Var3.E.setGravity(1);
        ui1Var3.E.setImportantForAccessibility(2);
        ui1Var3.X.addView(ui1Var3.E, w7.x5.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(activity);
        n2Var.a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            n2Var.a[i17] = new TextView(activity);
            n2Var.a[i17].setTextSize(1, 15.0f);
            n2Var.a[i17].setTextColor(-1);
            n2Var.a[i17].setGravity(1);
            n2Var.addView(n2Var.a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        n2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(n2Var, activity, o1Var);
        l2Var.setTextSize(1, 15.0f);
        l2Var.setTextColor(-1);
        l2Var.setGravity(1);
        l2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        l2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(l2Var, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        n2Var.addView(frameLayout2, w7.x5.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        n2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        n2Var.addView(textView3, w7.x5.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new ig.w1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity);
        n2Var.d = r2Var;
        n2Var.addView(r2Var, w7.x5.c(-2.0f, -1));
        ui1Var3.F = n2Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        n2Var.setImportantForAccessibility(4);
        ui1Var3.X.addView(ui1Var3.F, w7.x5.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            ti1 ti1Var = new ti1(activity);
            ui1Var3.G = ti1Var;
            long j3 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.k9 k9Var = ti1Var.b;
                k9Var.k(min);
                int i20 = 0;
                while (i20 < min) {
                    k9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j3 = j3;
                }
                long j10 = j3;
                k9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j10))) {
                    ti1Var.setVisibility(8);
                } else {
                    ti1Var.c = new org.telegram.ui.Components.f01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    ti1Var.setVisibility(0);
                    ti1Var.invalidate();
                }
            } else {
                ti1Var.setVisibility(8);
            }
            ui1Var3.X.addView(ui1Var3.G, w7.x5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        ui1Var3.X.setClipChildren(false);
        ui1Var3.X.setClipToPadding(false);
        ui1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        ui1Var3.U = new org.telegram.ui.Components.voip.k(activity);
        ui1Var3.Q = new org.telegram.ui.Components.voip.m1(activity, o1Var);
        ui1Var3.U.setAlpha(0.0f);
        ui1Var3.Q.setVisibility(8);
        pi1Var.addView(ui1Var3.y, w7.x5.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        pi1Var.addView(ui1Var3.X, w7.x5.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        pi1Var.addView(ui1Var3.O, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        pi1Var.addView(ui1Var3.R, w7.x5.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        pi1Var.addView(ui1Var3.N, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        pi1Var.addView(ui1Var3.U, w7.x5.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        pi1Var.addView(ui1Var3.Q, w7.x5.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        ui1Var3.j0 = new org.telegram.ui.Components.voip.p1(activity);
        ui1Var3.e = new org.telegram.ui.Components.voip.i3(activity, o1Var);
        ui1Var3.f = new org.telegram.ui.Components.voip.i3(activity, o1Var);
        ui1Var3.h = new org.telegram.ui.Components.voip.i3(activity, o1Var);
        ui1Var3.n = new ri1(activity, 52.0f);
        ui1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        ui1Var3.e.setScaleX(0.0f);
        ui1Var3.e.setScaleY(0.0f);
        ui1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ui1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        ui1Var3.f.setScaleX(0.0f);
        ui1Var3.f.setScaleY(0.0f);
        ui1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ui1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        ui1Var3.h.setScaleX(0.0f);
        ui1Var3.h.setScaleY(0.0f);
        ui1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ui1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        ui1Var3.n.setScaleX(0.0f);
        ui1Var3.n.setScaleY(0.0f);
        ui1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ui1Var3.j0.addView(ui1Var3.e);
        ui1Var3.j0.addView(ui1Var3.f);
        ui1Var3.j0.addView(ui1Var3.h);
        ui1Var3.j0.addView(ui1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        ui1Var3.e0 = eVar;
        eVar.setListener(new si1(ui1Var3));
        ui1Var3.e0.setScaleX(1.15f);
        ui1Var3.e0.setScaleY(1.15f);
        pi1Var.addView(ui1Var3.j0, w7.x5.e(-1, -2, 80));
        float f7 = AndroidUtilities.isTablet() ? 100 : 27;
        pi1Var.addView(ui1Var3.e0, w7.x5.d(-1, 186.0f, 80, f7, 0.0f, f7, 0.0f));
        ImageView imageView = new ImageView(activity);
        ui1Var3.I = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
        ui1Var3.I.setImageResource(R.drawable.msg_addcontact);
        ui1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        pi1Var.addView(ui1Var3.I, w7.x5.e(56, 56, 53));
        w7.z5.a(ui1Var3.I);
        ImageView imageView2 = new ImageView(activity);
        ui1Var3.H = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
        ui1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
        ui1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        ui1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
        pi1Var.addView(ui1Var3.H, w7.x5.e(56, 56, 51));
        w7.z5.a(ui1Var3.H);
        ig.k kVar = new ig.k(activity, 5);
        ui1Var3.K = kVar;
        kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        ui1Var3.K.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
        ui1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        pi1Var.addView(ui1Var3.K, w7.x5.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        ui1Var3.K.setAlpha(0.0f);
        ui1Var3.K.setOnClickListener(new fi1(ui1Var3, 5));
        int i21 = 6;
        ui1Var3.H.setOnClickListener(new fi1(ui1Var3, i21));
        ui1Var3.I.setOnClickListener(new wy0(10, ui1Var3, activity));
        if (ui1Var3.u0.b) {
            ui1Var3.H.setVisibility(8);
            ui1Var3.I.setVisibility(8);
        }
        org.telegram.ui.Components.voip.f2 f2Var = new org.telegram.ui.Components.voip.f2(activity);
        f2Var.a = new HashMap();
        f2Var.b = new ArrayList();
        f2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        f2Var.r = textPaint;
        f2Var.setOrientation(1);
        f2Var.n = o1Var;
        TransitionSet transitionSet = new TransitionSet();
        f2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.n0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        ui1Var3.M0 = f2Var;
        f2Var.setGravity(80);
        ui1Var3.M0.setOnViewsUpdated(new ei1(ui1Var3, 5));
        pi1Var.addView(ui1Var3.M0, w7.x5.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.b3 b3Var = new org.telegram.ui.Components.voip.b3(activity, 3, o1Var, true);
        b3Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        b3Var.K = alignment;
        b3Var.d = -1L;
        b3Var.l0 = new ei1(ui1Var3, i21);
        b3Var.T = true;
        b3Var.h = AndroidUtilities.dp(320.0f);
        b3Var.e = true;
        b3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
        b3Var.q(8.0f);
        ui1Var3.N0 = b3Var;
        b3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
        pi1Var.addView(ui1Var3.N0, w7.x5.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.b3 b3Var2 = new org.telegram.ui.Components.voip.b3(activity, 1, o1Var, false);
        b3Var2.p(true);
        b3Var2.K = alignment;
        b3Var2.d = 4000L;
        b3Var2.T = true;
        b3Var2.h = AndroidUtilities.dp(320.0f);
        b3Var2.e = true;
        b3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
        b3Var2.q(8.0f);
        ui1Var3.O0 = b3Var2;
        b3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
        pi1Var.addView(ui1Var3.O0, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ui1Var3.H();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!ui1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                ui1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            ui1Var3.o();
        }
        mi1Var2.addView(pi1Var);
        if (z10) {
            ui1Var3.F0 = 0.0f;
            ui1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                ui1Var3.c0.setStub(org.telegram.ui.Components.voip.k2.k().r);
                ui1Var3.d0.setStub(org.telegram.ui.Components.voip.k2.k().n);
            }
            ui1Var3.u0.setAlpha(0.0f);
            ui1Var3.H();
            ui1Var3.E0 = true;
            org.telegram.ui.Components.voip.k2.T = true;
            if (org.telegram.ui.Components.voip.k2.V != null) {
                org.telegram.ui.Components.voip.k2.U.getClass();
                throw null;
            }
            ui1Var3.L0.lock();
            AndroidUtilities.runOnUIThread(new ei1(ui1Var3, 11), 32L);
        } else {
            ui1Var3.F0 = 1.0f;
            ui1Var3.G();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && tf.c.a(activity) == 1) {
            ui1 ui1Var4 = n1;
            qf.d dVar = new qf.d(activity, ui1Var4);
            dVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.q2 q2Var3 = ui1Var4.c0;
            dVar.j = q2Var3.d;
            dVar.k = q2Var3.getPlaceholderView();
            ui1Var4.g0 = dVar.a();
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b21 b21Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                translationY.setInterpolator(prVar).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(prVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(b21Var);
                this.P0.setDuration(150L).setInterpolator(prVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f;
            duration.setInterpolator(prVar2).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar2).start();
            this.j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(b21Var);
            this.P0.setDuration(150L).setInterpolator(prVar2);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.e(true);
            i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.x0 = z10;
        mi1 mi1Var = this.u0;
        if (z10) {
            mi1Var.setSystemUiVisibility(mi1Var.getSystemUiVisibility() & (-5));
        } else {
            mi1Var.setSystemUiVisibility(mi1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.pr.f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            ei1 ei1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(ei1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                AndroidUtilities.runOnUIThread(ei1Var, 3000L);
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
                ni1 ni1Var = new ni1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = ni1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    ni1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
            Transition duration = new org.telegram.ui.ActionBar.n0(4).setDuration(250L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
            transitionSet.addTransition(duration.setInterpolator(prVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(prVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.t2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.i3.class, true);
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
            this.n.setOnClickListener(new fi1(this, 0));
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
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.x9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.x9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.x9] */
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
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.q5] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.x9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        bi.y3 y3Var;
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
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
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
                    org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.z5.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z12 ? 1 : 0] - emojiSpanArr.length) - (z5VarArr == null ? 0 : z5VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i13 = 0;
                            ?? r32 = z12;
                            while (i13 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new t3(this, 23));
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
                        if ((drawable instanceof org.telegram.ui.Components.q5) && ((org.telegram.ui.Components.q5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.q5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(21, i12, document);
                            drawableArr[i11] = q5Var;
                            r52 = q5Var;
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
                if ((drawable2 instanceof org.telegram.ui.Components.q5) && (y3Var = ((org.telegram.ui.Components.q5) drawable2).k) != null) {
                    Drawable thumb = y3Var.getThumb();
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
                        org.telegram.messenger.vl.q(r62[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.pr.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new ei1(this, 9), 1000L);
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
        pi1 pi1Var = this.s;
        if (pi1Var != null) {
            pi1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0911 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0bb2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0bc2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d1c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x07e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        int childsHight;
        org.telegram.ui.Components.voip.s1 s1Var;
        org.telegram.ui.Components.voip.s1 s1Var2;
        boolean z14;
        boolean z15;
        org.telegram.ui.Components.voip.q2 q2Var;
        VideoSink videoSink;
        int i13;
        boolean z16;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j3;
        Layout layout;
        int lineCount;
        float f7;
        float f10;
        TL_phone.PhoneCall phoneCall2;
        float f11;
        boolean z17;
        boolean z18;
        TextView textView;
        boolean z19 = true;
        if (this.G0 || this.E0) {
            return;
        }
        int i14 = 0;
        boolean z20 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.p0;
        TLRPC.User user = this.d;
        if (i15 == 1 || i15 == 2) {
            num = 1;
            this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z20);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    num = 1;
                    this.F.b(LocaleController.getString(R.string.VoipFailed), false, z20);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new ei1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String formatString = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.b, 0, null);
                            boolean[] zArr2 = new boolean[3];
                            y3Var.R = LocaleController.getString(R.string.VoipFailed);
                            y3Var.T = AndroidUtilities.replaceTags(formatString);
                            String string = LocaleController.getString(R.string.Cancel);
                            ci1 ci1Var = new ci1(this, 2);
                            y3Var.n0 = string;
                            y3Var.o0 = ci1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            qv0 qv0Var = new qv0(19, this, zArr);
                            y3Var.l0 = string2;
                            y3Var.m0 = qv0Var;
                            y3Var.show();
                            for (int i16 = 0; i16 < 3; i16++) {
                                if (zArr2[i16] && (textView = (TextView) y3Var.d(-(i16 + 1))) != null) {
                                    textView.setTextColor(y3Var.e(org.telegram.ui.ActionBar.j6.q7));
                                }
                            }
                            y3Var.setCanceledOnTouchOutside(true);
                            y3Var.setOnDismissListener(new fi.e0(this, zArr, 12));
                        } else {
                            y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                        org.telegram.ui.Components.e5.l0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        y("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        y(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new ei1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z21 = sharedInstance != null && sharedInstance.hasRate();
                            this.d0.c();
                            if (!z21 || this.G0) {
                                num = 1;
                                AndroidUtilities.runOnUIThread(new ei1(this, 0), 200L);
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
                                    AndroidUtilities.runOnUIThread(new w81(21, this, sharedInstance), 2L);
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
                                    this.U.a(new di1(this, sharedInstance, i14), false);
                                }
                                this.Q.setVisibility(0);
                                org.telegram.ui.Components.voip.m1 m1Var = this.Q;
                                ci1 ci1Var2 = new ci1(this, 1 == true ? 1 : 0);
                                org.telegram.ui.Components.voip.l1[] l1VarArr = m1Var.c;
                                m1Var.d = ci1Var2;
                                org.telegram.ui.Components.voip.j1 j1Var = m1Var.a;
                                j1Var.setVisibility(0);
                                m1Var.b.setVisibility(0);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.pr.f);
                                Integer num2 = 1;
                                animatorSet.setDuration(250L);
                                int i18 = 0;
                                while (i18 < l1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    l1VarArr[i18].setAlpha(0.0f);
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i18 * 16);
                                    animatorSet2.start();
                                    i18++;
                                    property4 = property4;
                                    num2 = num2;
                                }
                                num = num2;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                                    duration.setInterpolator(prVar).setListener(new to(this.O)).start();
                                    this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(prVar).setDuration(250L).start();
                                    this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new to(this.O)).setDuration(250L).setInterpolator(prVar).start();
                                }
                                for (org.telegram.ui.Components.x9 x9Var : this.V) {
                                    x9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.pr.f).setDuration(250L).start();
                                }
                                this.E.animate().alpha(0.0f).setDuration(70L).setListener(new li1(this)).start();
                                ViewPropertyAnimator alpha = this.K.animate().alpha(0.0f);
                                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f;
                                org.telegram.messenger.vl.q(alpha, prVar2, 250L);
                                this.K.setVisibility(8);
                                this.F.d(false, true);
                                this.F.c(false);
                                org.telegram.ui.Components.voip.r2 r2Var = this.F.d;
                                r2Var.n = true;
                                r2Var.invalidate();
                                org.telegram.ui.Components.voip.r0 r0Var = this.y;
                                r0Var.setShowWaves(false);
                                AnimatorSet animatorSet3 = r0Var.c;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                r0Var.c = animatorSet4;
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.ALPHA, r0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.TRANSLATION_Y, r0Var.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.SCALE_X, r0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.SCALE_Y, r0Var.getScaleY(), 0.9f, 1.0f));
                                r0Var.c.setInterpolator(prVar2);
                                r0Var.c.setDuration(300L);
                                r0Var.c.setStartDelay(250L);
                                r0Var.c.start();
                                D(true);
                                this.n.setVisibility(4);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                this.Y.setAlpha(0.0f);
                                this.Y.setVisibility(8);
                                ni1 ni1Var = this.o0;
                                if (ni1Var != null) {
                                    ni1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.F.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z20);
                            }
                            num = 1;
                            break;
                        case 13:
                            this.F.b(LocaleController.getString(R.string.VoipWaiting), true, z20);
                            num = 1;
                            break;
                        case 14:
                            this.F.b(LocaleController.getString(R.string.VoipRequesting), true, z20);
                            num = 1;
                            break;
                        case 15:
                            this.e0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.F.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z20);
                                this.e0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.F.b(LocaleController.getString(R.string.VoipInCallBranding), false, z20);
                                this.e0.setTranslationY(0.0f);
                            } else {
                                this.F.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z20);
                                this.e0.setTranslationY(-AndroidUtilities.dp(60.0f));
                            }
                            num = 1;
                            z10 = false;
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.F.b(LocaleController.getString(R.string.VoipRinging), true, z20);
                            }
                            num = 1;
                            break;
                        case 17:
                            this.F.b(LocaleController.getString(R.string.VoipBusy), false, z20);
                            this.e0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            num = 1;
                            z10 = false;
                            break;
                        default:
                            num = 1;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z22 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z17 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z18 = false;
                                this.n0 = z18;
                                if (z18 && !this.U0) {
                                    this.U0 = z17;
                                }
                            }
                        } else {
                            z17 = true;
                        }
                        z18 = true;
                        this.n0 = z18;
                        if (z18) {
                            this.U0 = z17;
                        }
                    }
                    if (z20) {
                        this.Y.b();
                        this.Z.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 1.0f;
                            this.v.setAlpha(1.0f);
                        }
                        if (z20) {
                            this.c0.animate().alpha(f11).setDuration(250L).start();
                        } else {
                            this.c0.animate().cancel();
                            this.c0.setAlpha(f11);
                        }
                        if (!this.c0.d.isFirstFrameRendered() && !this.I0) {
                            i10 = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.v.setVisibility(4);
                            } else {
                                this.v.setVisibility(i10);
                                if (z20) {
                                    this.c0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.c0.animate().cancel();
                                    this.c0.setAlpha(0.0f);
                                }
                            }
                            z11 = this.n0;
                            if (z11 || !this.m0) {
                                this.H0 = false;
                            }
                            z12 = (z11 || !this.H0 || AndroidUtilities.isInPictureInPictureMode(this.b)) ? false : true;
                            x(z20, z22);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z20) {
                                this.e0.setVisibility(z19 ? 0 : 8);
                            } else {
                                if (z19 && this.e0.getTag() == null) {
                                    this.e0.animate().setListener(null).cancel();
                                    if (this.e0.getVisibility() == 8) {
                                        this.e0.setVisibility(0);
                                        this.e0.setAlpha(0.0f);
                                    }
                                    this.e0.animate().alpha(1.0f);
                                }
                                if (!z19 && this.e0.getTag() != null) {
                                    this.e0.animate().setListener(null).cancel();
                                    i11 = 8;
                                    this.e0.animate().setListener(new ii1(this, i11)).alpha(0.0f);
                                    this.e0.setEnabled(z19);
                                    this.e0.setTag(z19 ? num : null);
                                    this.u0.setLockOnScreen(this.J0);
                                    z13 = this.p0 != 3 && (this.n0 || this.m0);
                                    this.z0 = z13;
                                    if (!z13 && !this.x0) {
                                        A(true);
                                    }
                                    if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                        AndroidUtilities.runOnUIThread(this.S0, 3000L);
                                        this.R0 = true;
                                    }
                                    int i19 = this.p0;
                                    boolean z23 = i19 == 11 && this.x0;
                                    boolean z24 = (!z19 || i19 == 16 || i19 == 11 || i19 == 12 || i19 == 14 || i19 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    if (z20) {
                                        if (z23) {
                                            this.H.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.H.getVisibility() != 0) {
                                                this.H.setVisibility(0);
                                                f7 = 0.0f;
                                                this.H.setAlpha(0.0f);
                                            } else {
                                                f7 = 0.0f;
                                            }
                                            this.H.animate().alpha(f7).start();
                                        }
                                        if (z24) {
                                            this.I.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.I.getVisibility() != 0) {
                                                this.I.setVisibility(0);
                                                f10 = 0.0f;
                                                this.I.setAlpha(0.0f);
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            this.I.animate().alpha(f10).start();
                                        }
                                        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                    } else {
                                        ImageView imageView = this.H;
                                        if (z23) {
                                            i11 = 0;
                                        }
                                        imageView.setVisibility(i11);
                                        this.H.setAlpha(z23 ? 1.0f : 0.0f);
                                        this.I.setVisibility(z24 ? 0 : 8);
                                        this.I.setAlpha(z24 ? 1.0f : 0.0f);
                                        this.M0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i12 = this.p0;
                                    if (i12 != 10 && i12 != 11) {
                                        D(z20);
                                    }
                                    if (i14 != 0) {
                                        this.F.e(z20);
                                    }
                                    this.F.d(z10, z20);
                                    if (this.y.getVisibility() == 0 && this.C0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.T.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = com.google.android.gms.internal.vision.e2.w(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.p0 == 11 && !this.n0 && !this.m0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.n0 || this.m0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z20) {
                                        if (this.C0 && (this.n0 || this.m0)) {
                                            this.X.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                            j3 = 250;
                                        } else {
                                            j3 = 250;
                                            this.X.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                        }
                                        if (dp2 != this.v0) {
                                            ViewPropertyAnimator animate = this.X.animate();
                                            if (this.p0 != 11) {
                                                j3 = 0;
                                            }
                                            animate.setStartDelay(j3).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                        }
                                    } else {
                                        this.X.setTranslationY(dp2);
                                    }
                                    this.v0 = dp2;
                                    boolean z25 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i20 = this.p0;
                                    this.D0 = i20 == 11 && i20 != 17 && ((this.n0 && !z25) || this.m0);
                                    if (sharedInstance != null) {
                                        if (this.n0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.d0.setIsScreencast(sharedInstance.isScreencast());
                                        this.d0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.n0 || sharedInstance.isScreencast()) ? null : this.d0.d;
                                        if (!this.m1 || (q2Var = this.k1) == null) {
                                            if (z12) {
                                                videoSink = this.b0;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z20) {
                                                    org.telegram.ui.Components.voip.f2 f2Var = this.M0;
                                                    f2Var.f = false;
                                                    if (!f2Var.e && f2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.M0.c("self-muted");
                                                } else {
                                                    this.M0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.n0 || this.m0) && (((i13 = this.p0) == 3 || i13 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.f2 f2Var2 = this.M0;
                                                        f2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, f2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.M0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.f2 f2Var3 = this.M0;
                                                        f2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, f2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.f2 f2Var4 = this.M0;
                                                        f2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, f2Var4.b(UserObject.getFirstName(user))), "muted");
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
                                                        z16 = true;
                                                        if (z20) {
                                                            org.telegram.ui.Components.voip.f2 f2Var5 = this.M0;
                                                            if (f2Var5.f) {
                                                                f2Var5.e = z16;
                                                                AndroidUtilities.runOnUIThread(new ig.t0(f2Var5, 25), 700L);
                                                            }
                                                            f2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.M0.getChildCount() != 0) {
                                                    z16 = true;
                                                    this.N0.e(true);
                                                    if (z20) {
                                                    }
                                                }
                                                z16 = true;
                                                if (z20) {
                                                }
                                            } else {
                                                q2Var = this.c0;
                                            }
                                        }
                                        videoSink = q2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z20) {
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
                                        z16 = true;
                                        if (z20) {
                                        }
                                    }
                                    childsHight = this.M0.getChildsHight();
                                    s1Var = this.Z;
                                    if (s1Var.getParent() == null && z20) {
                                        s1Var.T = childsHight;
                                    } else {
                                        s1Var.T = childsHight;
                                    }
                                    s1Var2 = this.Y;
                                    if (s1Var2.getParent() == null && z20) {
                                        s1Var2.T = childsHight;
                                    } else {
                                        s1Var2.T = childsHight;
                                    }
                                    this.Y.setUiVisible(this.x0);
                                    this.Z.setUiVisible(this.x0);
                                    if (!this.n0) {
                                        z14 = true;
                                        z(0, z20);
                                    } else if (!this.m0 || this.H0) {
                                        z14 = true;
                                        z(1, z20);
                                    } else {
                                        z(2, z20);
                                        z14 = true;
                                    }
                                    if (!z12 && this.Z.getTag() == null) {
                                        this.Z.setIsActive(z14);
                                        if (this.Z.getVisibility() != 0) {
                                            this.Z.setVisibility(0);
                                            this.Z.setAlpha(0.0f);
                                            this.Z.setScaleX(0.5f);
                                            this.Z.setScaleY(0.5f);
                                        }
                                        this.Z.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.s1 s1Var3 = this.Z;
                                        s1Var3.c0 = true;
                                        s1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).setStartDelay(150L).withEndAction(new ei1(this, 4)).start();
                                        this.Z.setTag(num);
                                    } else if (!z12 && this.Z.getTag() != null) {
                                        this.Z.setIsActive(false);
                                        this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ii1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
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
                                            z15 = !this.n0 || this.m0;
                                            this.x.setState(z15);
                                            this.w.setState(z15);
                                            this.r.e(z15);
                                            if (this.m0 && !z22 && this.f0) {
                                                this.f0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z15) {
                                                if (this.i0.getVisibility() != 4) {
                                                    this.i0.setVisibility(4);
                                                    this.h0.setVisibility(4);
                                                }
                                            } else if (this.i0.getVisibility() != 0) {
                                                this.i0.setVisibility(0);
                                                this.h0.setVisibility(0);
                                            }
                                            ei1 ei1Var = this.T0;
                                            AndroidUtilities.cancelRunOnUIThread(ei1Var);
                                            if (this.p0 != 3) {
                                                AndroidUtilities.runOnUIThread(ei1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (this.n0) {
                                    }
                                    this.x.setState(z15);
                                    this.w.setState(z15);
                                    this.r.e(z15);
                                    if (this.m0) {
                                        this.f0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z15) {
                                    }
                                    ei1 ei1Var2 = this.T0;
                                    AndroidUtilities.cancelRunOnUIThread(ei1Var2);
                                    if (this.p0 != 3) {
                                    }
                                }
                            }
                            i11 = 8;
                            this.e0.setEnabled(z19);
                            this.e0.setTag(z19 ? num : null);
                            this.u0.setLockOnScreen(this.J0);
                            if (this.p0 != 3) {
                            }
                            this.z0 = z13;
                            if (!z13) {
                                A(true);
                            }
                            if (this.x0) {
                                AndroidUtilities.runOnUIThread(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i192 = this.p0;
                            if (i192 == 11) {
                            }
                            if (!z19) {
                            }
                            if (z20) {
                            }
                            i12 = this.p0;
                            if (i12 != 10) {
                                D(z20);
                            }
                            if (i14 != 0) {
                            }
                            this.F.d(z10, z20);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.T.getLayout();
                                if (layout != null) {
                                    dp2 = com.google.android.gms.internal.vision.e2.w(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.p0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.n0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z20) {
                            }
                            this.v0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i202 = this.p0;
                            this.D0 = i202 == 11 && i202 != 17 && ((this.n0 && !z25) || this.m0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.M0.getChildsHight();
                            s1Var = this.Z;
                            if (s1Var.getParent() == null) {
                            }
                            s1Var.T = childsHight;
                            s1Var2 = this.Y;
                            if (s1Var2.getParent() == null) {
                            }
                            s1Var2.T = childsHight;
                            this.Y.setUiVisible(this.x0);
                            this.Z.setUiVisible(this.x0);
                            if (!this.n0) {
                            }
                            if (!z12) {
                            }
                            if (!z12) {
                                this.Z.setIsActive(false);
                                this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ii1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                this.Z.setTag(null);
                            }
                            this.Y.a();
                            this.Z.a();
                            F();
                            if (this.p0 == 3) {
                            }
                            if (this.n0) {
                            }
                            this.x.setState(z15);
                            this.w.setState(z15);
                            this.r.e(z15);
                            if (this.m0) {
                            }
                            if (z15) {
                            }
                            ei1 ei1Var22 = this.T0;
                            AndroidUtilities.cancelRunOnUIThread(ei1Var22);
                            if (this.p0 != 3) {
                            }
                        }
                    }
                    i10 = 0;
                    if (this.n0) {
                    }
                    this.v.setVisibility(4);
                    z11 = this.n0;
                    if (z11) {
                    }
                    this.H0 = false;
                    if (z11) {
                    }
                    x(z20, z22);
                    if (this.y.getTag() != null) {
                    }
                    if (z20) {
                    }
                    i11 = 8;
                    this.e0.setEnabled(z19);
                    this.e0.setTag(z19 ? num : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z13;
                    if (!z13) {
                    }
                    if (this.x0) {
                    }
                    int i1922 = this.p0;
                    if (i1922 == 11) {
                    }
                    if (!z19) {
                    }
                    if (z20) {
                    }
                    i12 = this.p0;
                    if (i12 != 10) {
                    }
                    if (i14 != 0) {
                    }
                    this.F.d(z10, z20);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.p0 == 11) {
                    }
                    if (!this.n0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z20) {
                    }
                    this.v0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i2022 = this.p0;
                    this.D0 = i2022 == 11 && i2022 != 17 && ((this.n0 && !z25) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    s1Var = this.Z;
                    if (s1Var.getParent() == null) {
                    }
                    s1Var.T = childsHight;
                    s1Var2 = this.Y;
                    if (s1Var2.getParent() == null) {
                    }
                    s1Var2.T = childsHight;
                    this.Y.setUiVisible(this.x0);
                    this.Z.setUiVisible(this.x0);
                    if (!this.n0) {
                    }
                    if (!z12) {
                    }
                    if (!z12) {
                    }
                    this.Y.a();
                    this.Z.a();
                    F();
                    if (this.p0 == 3) {
                    }
                    if (this.n0) {
                    }
                    this.x.setState(z15);
                    this.w.setState(z15);
                    this.r.e(z15);
                    if (this.m0) {
                    }
                    if (z15) {
                    }
                    ei1 ei1Var222 = this.T0;
                    AndroidUtilities.cancelRunOnUIThread(ei1Var222);
                    if (this.p0 != 3) {
                    }
                }
            }
            num = 1;
            E(z20);
            if (this.p0 == 5) {
                boolean z26 = this.s0;
                if (!z26 && this.q0 != 5) {
                    this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z20);
                }
                z10 = z26;
                z19 = false;
                i14 = 0;
                if (this.o0 == null) {
                }
            } else {
                i14 = 1;
                this.s0 = true;
                z19 = false;
                z10 = false;
                if (this.o0 == null) {
                }
            }
        }
        z19 = false;
        z10 = false;
        i14 = 0;
        if (this.o0 == null) {
        }
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.q2 q2Var = this.c0;
        if (q2Var != null) {
            q2Var.d.clearFirstFrame();
        }
        this.m1 = true;
        H();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.u0);
        this.u0.invalidate();
    }

    @Override // sf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        mi1 mi1Var = this.u0;
        mi1Var.getClass();
        windowManager.addView(mi1Var, org.telegram.ui.Components.voip.u2.a());
        this.m1 = false;
        H();
        this.u0.invalidate();
        org.telegram.ui.Components.voip.q2 q2Var = this.k1;
        if (q2Var != null) {
            q2Var.d.release();
            this.k1 = null;
        }
    }

    @Override // sf.a
    public final Bitmap c() {
        org.telegram.ui.Components.voip.q2 q2Var = this.k1;
        if (q2Var == null || !q2Var.d.isAvailable()) {
            return null;
        }
        return this.k1.d.getBitmap();
    }

    @Override // sf.a
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

    @Override // sf.a
    public final Bitmap e() {
        org.telegram.ui.Components.voip.q2 q2Var = this.c0;
        if (q2Var == null || !q2Var.d.isAvailable()) {
            return null;
        }
        return this.c0.d.getBitmap();
    }

    @Override // sf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // sf.a
    public final View h() {
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(this.b, false, true, false, false);
        this.k1 = q2Var;
        q2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.k1.d.setEnableHardwareScaler(true);
        this.k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.q2 q2Var2 = this.k1;
        q2Var2.a0 = 1;
        q2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new oi1(this));
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
        float f13 = org.telegram.ui.Components.voip.k2.k().d.x + org.telegram.ui.Components.voip.k2.k().y;
        float f14 = org.telegram.ui.Components.voip.k2.k().d.y + org.telegram.ui.Components.voip.k2.k().E;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.k2.U.getClass();
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
                f11 = (((org.telegram.ui.Components.voip.k2.k().f * 0.25f) + (f13 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.k2.k().f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.k2.k().h * 0.25f) + (f14 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.k2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
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
            org.telegram.ui.Components.voip.k2.U.getClass();
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.hi1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f22 = 1.0f - floatValue;
                ui1 ui1Var = ui1.this;
                ui1Var.F0 = f22;
                ui1Var.G();
                if (z11) {
                    float f23 = (f10 * floatValue) + (scaleX * f22);
                    ui1Var.Y.setScaleX(f23);
                    ui1Var.Y.setScaleY(f23);
                    ui1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f22));
                    ui1Var.Y.setTranslationY((f17 * floatValue) + (y3 * f22));
                    ui1Var.Y.setCornerRadius((dp2 * floatValue) + (f20 * f22));
                    ui1Var.Y.setAlpha((f15 * floatValue) + (1.0f * f22));
                }
                float f24 = (f21 * floatValue) + (1.0f * f22);
                ui1Var.c0.setScaleX(f24);
                ui1Var.c0.setScaleY(f24);
                float f25 = 0.0f * f22;
                float f26 = (measuredWidth * floatValue) + f25;
                float f27 = (measuredHeight2 * floatValue) + f25;
                ui1Var.c0.setTranslationX(f26);
                ui1Var.c0.setTranslationY(f27);
                ui1Var.c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f24);
                if (!ui1Var.Y.P) {
                    ui1Var.d0.d(floatValue, false);
                }
                ui1Var.u0.invalidate();
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
        qf.e eVar = this.g0;
        if (eVar != null) {
            eVar.c();
            this.g0 = null;
        }
        ug.n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.dismiss();
            this.M = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.x2 x2Var = this.w;
            int i10 = 1;
            if (x2Var.K && z10 != x2Var.E) {
                x2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                x2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w2(x2Var, i10));
                x2Var.c.setInterpolator(org.telegram.ui.Components.pr.f);
                x2Var.c.setDuration(200L);
                x2Var.c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                org.telegram.messenger.vl.q(translationY, prVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ii1(this, 3)).setInterpolator(prVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f;
                duration.setInterpolator(prVar2).setListener(new to(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(prVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ii1(this, 4)).setDuration(250L).setInterpolator(prVar2).start();
            }
            this.q0 = this.p0;
            H();
        }
    }

    public final void n() {
        this.u0.b();
    }

    public final void o() {
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ji1(this));
        this.c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ki1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
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
            qf.e eVar = this.g0;
            if (eVar != null) {
                eVar.c();
                this.g0 = null;
            }
        } else if (this.g0 == null && tf.c.a(this.b) == 1) {
            qf.d dVar = new qf.d(this.b, n1);
            dVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.q2 q2Var = this.c0;
            dVar.j = q2Var.d;
            dVar.k = q2Var.getPlaceholderView();
            this.g0 = dVar.a();
        }
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.a3 a3Var;
        if (i10 > 0) {
            this.j1 = true;
        }
        if (this.F == null || (a3Var = this.v) == null) {
            return;
        }
        int i11 = a3Var.V;
        if ((i11 == 2 || i11 == 3) && this.j1) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m8(this, i10, 29), 400L);
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
        ni1 ni1Var = this.o0;
        if (ni1Var != null) {
            ni1Var.a(false, false);
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
        if (tf.c.a(this.b) <= 0) {
            org.telegram.ui.Components.e5.B(this.b, new ci1(this, 0), true).o();
            return;
        }
        if (this.G0 || n1 == null) {
            return;
        }
        this.G0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = n1.u0.getMeasuredHeight();
            ui1 ui1Var = n1;
            org.telegram.ui.Components.voip.k2.l(ui1Var.b, ui1Var.a, ui1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = n1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.k2.W = windowInsets.getSystemWindowInsetTop();
                n1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.k2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
        duration.setInterpolator(prVar).start();
        this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        org.telegram.ui.Components.voip.k2.T = true;
        this.E0 = true;
        ValueAnimator k10 = k(false);
        this.L0.lock();
        k10.addListener(new ii1(this, 1));
        k10.setDuration(350L);
        k10.setInterpolator(prVar);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.gi1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ui1 ui1Var = ui1.this;
                ui1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ui1Var.e0.setTranslationY(dp2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                ui1Var.e0.requestLayout();
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
        animatorSet.addListener(new org.telegram.ui.Components.pk0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new ei1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService) {
        if (!this.n0) {
            i3Var.d(2, false, false);
            i3Var.setOnBtnClickedListener(null);
            i3Var.setEnabled(false);
        } else {
            i3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                i3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                i3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            i3Var.setOnBtnClickedListener(new b7(this, voIPService, i3Var, 23));
        }
    }

    public final void t(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService, boolean z10) {
        i3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = s1Var.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.K, isMicMute ? 1.0f : 0.0f);
            s1Var.f0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.g0);
            s1Var.f0.setDuration(150L);
            s1Var.f0.start();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            s1Var.K = isMicMute ? 1.0f : 0.0f;
            s1Var.invalidate();
        }
        i3Var.setOnBtnClickedListener(new ci1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            i3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            i3Var.d(5, true, false);
            i10 = 0;
        } else {
            i3Var.d(5, false, false);
            i10 = 1;
        }
        i3Var.setEnabled(true);
        i3Var.setOnBtnClickedListener(new da(this, i10, i3Var, voIPService, 8));
    }

    public final void v(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            i3Var.d(3, true, false);
            i3Var.setOnClickListener(null);
            i3Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            i3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            i3Var.d(3, false, z10);
        } else {
            i3Var.d(3, false, z10);
        }
        i3Var.setOnBtnClickedListener(new ci1(this, 6));
        i3Var.setEnabled(true);
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
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
            }
        } else if (!z12 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.pr.f).setListener(new ii1(this, 7)).start();
        }
        this.y.setTag(z12 ? 1 : null);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.b, 0, null);
        boolean[] zArr = new boolean[3];
        y3Var.R = LocaleController.getString(R.string.VoipFailed);
        y3Var.T = charSequence;
        y3Var.l0 = LocaleController.getString(R.string.OK);
        y3Var.m0 = null;
        y3Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) y3Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(y3Var.e(org.telegram.ui.ActionBar.j6.q7));
            }
        }
        y3Var.setCanceledOnTouchOutside(true);
        y3Var.setOnDismissListener(new r5(this, 19));
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.s1 s1Var = this.Y;
                if (s1Var.y < 0.0f) {
                    s1Var.d(1.0f, 1.0f);
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
            org.telegram.ui.Components.voip.s1 s1Var2 = this.Y;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(s1Var2, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, s1Var2.getAlpha(), 0.0f));
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.s1 s1Var3 = this.Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s1Var3, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, s1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.s1 s1Var4 = this.Y;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(s1Var4, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, s1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new ii1(this, 6));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f);
            this.A0.setStartDelay(50L);
            this.A0.start();
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
