package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
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
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class u50 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, ne.d {
    public static u50 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final z5 A2;
    public final ne.b A3;
    public TLObject B0;
    public final s50 B1;
    public final LongSparseIntArray B2;
    public final ne.e B3;
    public final Paint C0;
    public final qh.i C1;
    public final n30 C2;
    public final ne.b C3;
    public final ArrayList D0;
    public f20 D1;
    public final l30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.a40 E1;
    public LinearLayout E2;
    public final v30 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final u30 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.yj0 G2;
    public final s30 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.yj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.gl0 K;
    public final org.telegram.ui.Components.yj0 K0;
    public final t50[] K1;
    public final View K2;
    public final x40 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.q6 M;
    public final org.telegram.ui.Components.ba M0;
    public t50 M1;
    public final int[] M2;
    public final d30 N;
    public final org.telegram.ui.Components.ba N0;
    public t50 N1;
    public final h30 N2;
    public final p40 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final o50 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final z40 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final b40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final z30 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.n5 U;
    public final j50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final y40 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.n5 W;
    public float W0;
    public boolean W1;
    public final h40 W2;
    public final i50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.d4 X2;
    public final org.telegram.ui.Components.xz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int a0;
    public ChatObject.Call a1;
    public final k30 a2;
    public org.telegram.ui.Components.z20 a3;
    public final m30 b;
    public final ImageView b0;
    public final boolean b1;
    public final p30 b2;
    public boolean b3;
    public final r20 c;
    public final mh.h c0;
    public final String c1;
    public final c40 c2;
    public boolean c3;
    public final AccountInstance d;
    public final int d0;
    public final p50 d1;
    public float d2;
    public int d3;
    public final x20 e;
    public final RadialProgressView e0;
    public final c30 e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout e2;
    public AnimatorSet e3;
    public final org.telegram.ui.Components.voip.t2 f;
    public final Drawable f0;
    public final e30 f1;
    public boolean f2;
    public t40 f3;
    public final View g0;
    public final Paint g1;
    public boolean g2;
    public int g3;
    public final org.telegram.ui.Components.voip.t2 h;
    public AnimatorSet h0;
    public ValueAnimator h1;
    public org.telegram.ui.Components.e50 h2;
    public int h3;
    public LaunchActivity i0;
    public float i1;
    public b50 i2;
    public int i3;
    public final UndoView[] j0;
    public final LinearLayout j1;
    public Boolean j2;
    public int j3;
    public final org.telegram.ui.Cells.k k0;
    public final org.telegram.ui.ActionBar.u0 k1;
    public int k2;
    public int k3;
    public boolean l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean l2;
    public int l3;
    public org.telegram.ui.Components.r40 m0;
    public final org.telegram.ui.ActionBar.u0 m1;
    public final g30 m2;
    public int m3;
    public final org.telegram.ui.Components.voip.t2 n;
    public org.telegram.ui.Components.r40 n0;
    public final org.telegram.ui.ActionBar.e1 n1;
    public final org.telegram.ui.Components.mm0 n2;
    public int n3;
    public int o0;
    public final org.telegram.ui.ActionBar.e1 o1;
    public final a60 o2;
    public int o3;
    public f50 p0;
    public final org.telegram.ui.ActionBar.e1 p1;
    public final org.telegram.ui.Components.a30 p2;
    public int p3;
    public final ArrayList q0;
    public final org.telegram.ui.ActionBar.e1 q1;
    public ViewTreeObserver.OnPreDrawListener q2;
    public int q3;
    public final org.telegram.ui.Components.voip.t2 r;
    public n40 r0;
    public final org.telegram.ui.ActionBar.e1 r1;
    public final org.telegram.ui.Components.voip.h r2;
    public int r3;
    public final org.telegram.ui.Components.voip.t2 s;
    public boolean s0;
    public final org.telegram.ui.ActionBar.e1 s1;
    public boolean s2;
    public int s3;
    public long t0;
    public final org.telegram.ui.ActionBar.e1 t1;
    public final ArrayList t2;
    public int t3;
    public boolean u0;
    public final org.telegram.ui.ActionBar.e1 u1;
    public boolean u2;
    public int u3;
    public final org.telegram.ui.Components.voip.t2 v;
    public final RectF v0;
    public final org.telegram.ui.ActionBar.e1 v1;
    public final f20 v2;
    public int v3;
    public final org.telegram.ui.Components.voip.t2 w;
    public boolean w0;
    public final org.telegram.ui.ActionBar.e1 w1;
    public final b30 w2;
    public final u40 w3;
    public final y20 x;
    public boolean x0;
    public final org.telegram.ui.ActionBar.e1 x1;
    public final org.telegram.ui.Components.rc x2;
    public Boolean x3;
    public final ImageView y;
    public float y0;
    public final org.telegram.ui.ActionBar.e1 y1;
    public final f20 y2;
    public Integer y3;
    public e40 z0;
    public final LinearLayout z1;
    public boolean z2;
    public final ne.b z3;

    public u50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.g6) null, true, true);
        String string;
        int i10;
        final u50 u50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.j0 = new UndoView[2];
        this.q0 = new ArrayList();
        this.v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new qh.i(new f20(this, 8));
        int i11 = 0;
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new t50[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.r2 = new org.telegram.ui.Components.voip.h();
        this.t2 = new ArrayList();
        this.v2 = new f20(this, i11);
        this.w2 = new b30(this);
        this.x2 = new org.telegram.ui.Components.rc(24);
        this.y2 = new f20(this, 1);
        this.z2 = false;
        this.A2 = new z5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.d3 = -1;
        this.w3 = new u40(this);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
        this.z3 = new ne.b(2, this, bsVar, 350L);
        this.A3 = new ne.b(3, this, bsVar, 220L, true);
        this.B3 = new ne.e(4, this, bsVar, 350L);
        this.C3 = new ne.b(5, this, bsVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.b1 = z10;
        this.resourcesProvider = new ci.k0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new w30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new h40(this);
        setOnDismissListener(new j20(this, i11));
        setDimBehindAlpha(75);
        o50 o50Var = new o50(this, launchActivity);
        this.P = o50Var;
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(true);
        int i12 = org.telegram.ui.ActionBar.k6.qg;
        cqVar.b(org.telegram.ui.ActionBar.k6.v0(i12));
        cqVar.d();
        p40 p40Var = new p40(this, launchActivity, cqVar);
        this.O = p40Var;
        p40Var.setSubtitle("");
        p40Var.getSubtitleTextView().setVisibility(0);
        p40Var.k();
        p40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(p40Var.getAdditionalSubtitleTextView(), this.u2, 1.0f, false);
        p40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.k6.v0(i12));
        int i13 = org.telegram.ui.ActionBar.k6.lg;
        org.telegram.ui.ActionBar.r6.m(p40Var, 6, i13, null);
        p40Var.setBackButtonImage(R.drawable.ic_ab_back);
        p40Var.setOccupyStatusBar(false);
        p40Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.k6.hg;
        org.telegram.ui.ActionBar.r6.m(p40Var, 1, i14, null);
        int i15 = 3;
        org.telegram.ui.ActionBar.r6.m(p40Var, 3, org.telegram.ui.ActionBar.k6.z8, null);
        org.telegram.ui.ActionBar.r6.e(p40Var, i14);
        org.telegram.ui.ActionBar.r6.m(p40Var, 6, i13, null);
        p40Var.setActionBarMenuOnItemClick(new w40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.A0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.A0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new c20(this, i15);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = yj0Var;
        this.K0 = new org.telegram.ui.Components.yj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        x40 x40Var = new x40(this, launchActivity);
        this.L = x40Var;
        this.containerView = x40Var;
        x40Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.Z = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(launchActivity);
            this.U = n5Var;
            n5Var.setGravity(17);
            n5Var.setTextColor(-1);
            n5Var.setTypeface(AndroidUtilities.bold());
            n5Var.setTextSize(18);
            n5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(n5Var, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            y40 y40Var = new y40(this, launchActivity);
            this.V = y40Var;
            y40Var.setGravity(17);
            y40Var.setTextColor(-1);
            y40Var.setTypeface(AndroidUtilities.bold());
            y40Var.setTextSize(60);
            this.containerView.addView(y40Var, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(launchActivity);
            this.W = n5Var2;
            n5Var2.setGravity(17);
            n5Var2.setTextColor(-1);
            n5Var2.setTypeface(AndroidUtilities.bold());
            n5Var2.setTextSize(18);
            this.containerView.addView(n5Var2, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            j50 j50Var = new j50(this, launchActivity);
            this.U0 = j50Var;
            this.containerView.addView(j50Var, w7.z5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        z40 z40Var = new z40(this, launchActivity);
        this.Q = z40Var;
        z40Var.setClipToPadding(false);
        z40Var.setClipChildren(false);
        i50 i50Var = new i50(this);
        this.X = i50Var;
        i50Var.o = bsVar;
        i50Var.d = 350L;
        i50Var.c = 350L;
        i50Var.e = 350L;
        i50Var.S();
        z40Var.setItemAnimator(i50Var);
        z40Var.setOnScrollListener(new q20(this));
        z40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.xz xzVar = new org.telegram.ui.Components.xz(F3 ? 6 : 2, z40Var);
        this.Y = xzVar;
        z40Var.setLayoutManager(xzVar);
        r20 r20Var = new r20(this);
        this.c = r20Var;
        xzVar.z1(r20Var);
        z40Var.i(new s20(this));
        xzVar.C1();
        this.containerView.addView(z40Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        z40Var.setAdapter(o50Var);
        z40Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.r6.K(org.telegram.ui.ActionBar.k6.eg, z40Var);
        z40Var.setOnItemClickListener(new e7(this, launchActivity, call, 14));
        z40Var.setOnItemLongClickListener(new c20(this, 4));
        if (r1()) {
            s50 s50Var = new s50(this, getContext());
            this.B1 = s50Var;
            this.containerView.addView(s50Var, w7.z5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(launchActivity);
        this.n2 = mm0Var;
        this.containerView.addView(mm0Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        a60 a60Var = new a60(call, this.currentAccount, this);
        this.o2 = a60Var;
        mm0Var.setAdapter(a60Var);
        s4.s sVar = new s4.s(6, false);
        mm0Var.setLayoutManager(sVar);
        sVar.z1(new u20(this));
        final int i17 = 1;
        mm0Var.setOnItemClickListener(new org.telegram.ui.Components.am0(this) { // from class: org.telegram.ui.e20
            public final /* synthetic */ u50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void d(int i18, View view) {
                switch (i17) {
                    case 0:
                        u50 u50Var2 = this.b;
                        u50Var2.getClass();
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view;
                        if (z20Var.getVideoParticipant() != null) {
                            u50Var2.e1(z20Var.getVideoParticipant());
                            break;
                        } else {
                            u50Var2.e1(new ChatObject.VideoParticipant(z20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        u50 u50Var3 = this.b;
                        u50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            u50Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        s4.k kVar = new s4.k();
        kVar.S();
        kVar.o = bsVar;
        kVar.d = 350L;
        kVar.c = 350L;
        kVar.e = 350L;
        mm0Var.setItemAnimator(new v20(this));
        mm0Var.setOnScrollListener(new w20(this));
        a60Var.H(mm0Var, false, false);
        mm0Var.setVisibility(8);
        x20 x20Var = new x20(this, launchActivity);
        this.e = x20Var;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(9);
        this.M0 = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(12);
        this.N0 = baVar2;
        baVar.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        baVar.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        baVar.b();
        baVar2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        baVar2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        baVar2.b();
        int i18 = org.telegram.ui.ActionBar.k6.Ig;
        baVar.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i18), 38));
        baVar2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i18), 76));
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.r = t2Var;
        t2Var.setCheckable(true);
        t2Var.setTextSize(12);
        x20Var.a(t2Var);
        t2Var.setOnClickListener(new d20(this, 7));
        org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.n = t2Var2;
        t2Var2.setCheckable(true);
        t2Var2.setTextSize(12);
        t2Var2.d(false, false);
        t2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        t2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.t2 t2Var3 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f = t2Var3;
        t2Var3.setCheckable(true);
        t2Var3.setTextSize(12);
        t2Var3.d(false, false);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(launchActivity);
        t2Var3.addView(bk0Var, w7.z5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.yj0 yj0Var2 = new org.telegram.ui.Components.yj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = yj0Var2;
        bk0Var.setAnimation(yj0Var2);
        t2Var3.setOnClickListener(new d20(this, 10));
        x20Var.a(t2Var3);
        org.telegram.ui.Components.voip.t2 t2Var4 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.h = t2Var4;
        t2Var4.setCheckable(true);
        t2Var4.setTextSize(12);
        t2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i19 = R.drawable.filled_sound_on;
        this.a0 = i19;
        imageView.setImageResource(i19);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        t2Var4.addView(imageView, w7.z5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        t2Var4.setOnClickListener(new d20(this, 11));
        x20Var.a(t2Var4);
        x20Var.a(t2Var2);
        org.telegram.ui.Components.voip.t2 t2Var5 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.s = t2Var5;
        t2Var5.setTextSize(12);
        t2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i20 = 1;
        t2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.i20
            public final /* synthetic */ u50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        u50.p(this.b, launchActivity);
                        break;
                    default:
                        u50 u50Var2 = this.b;
                        u50Var2.a2.e();
                        ChatObject.Call call2 = u50Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            u50Var2.J1();
                            u50.t1(launchActivity, new f20(u50Var2, 5), false, false);
                            break;
                        } else {
                            u50Var2.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.t2 t2Var6 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.v = t2Var6;
        t2Var6.setCheckable(true);
        t2Var6.b(true, false);
        t2Var6.setTextSize(12);
        t2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        y20 y20Var = new y20(this, launchActivity);
        this.x = y20Var;
        y20Var.setAnimation(yj0Var);
        y20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.t2 t2Var7 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.w = t2Var7;
        t2Var7.setDrawBackground(false);
        t2Var7.setTextSize(12);
        t2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        t2Var7.addView(y20Var, w7.z5.e(50, 50, 49));
        x20Var.a(t2Var7);
        t2Var7.setOnClickListener(new a30(this));
        x20Var.a(t2Var6);
        x20Var.a(t2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        t2Var7.addView(imageView2, w7.z5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.a1 != null && r1() && !this.a1.isScheduled()) {
            imageView2.setVisibility(0);
            y20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Og));
        p40Var.setAlpha(0.0f);
        p40Var.getBackButton().setScaleX(0.9f);
        p40Var.getBackButton().setScaleY(0.9f);
        p40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        p40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        p40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        p40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int v03 = org.telegram.ui.ActionBar.k6.v0(i14);
        int i21 = 0;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, v03);
        this.k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new c20(this, i21));
        int i22 = org.telegram.ui.ActionBar.k6.ig;
        org.telegram.ui.ActionBar.r6.T(u0Var, org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i22), 6), null, org.telegram.ui.ActionBar.r6.O(i22));
        u0Var.setOnClickListener(new d20(this, i21));
        u0Var.G(org.telegram.ui.ActionBar.k6.v0(i14), false);
        u0Var.G(org.telegram.ui.ActionBar.k6.v0(i14), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.k6.v0(i14));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.r6.T(u0Var2, org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i22), 6), null, org.telegram.ui.ActionBar.r6.O(i22));
        u0Var2.setOnClickListener(new d20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.k6.v0(i14));
        this.m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.r6.T(u0Var3, org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i22), 6), null, org.telegram.ui.ActionBar.r6.O(i22));
        u0Var3.setOnClickListener(new d20(this, 2));
        c30 c30Var = new c30(this, launchActivity, launchActivity);
        this.e1 = c30Var;
        d30 d30Var = new d30(launchActivity);
        this.N = d30Var;
        d30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        paint2.setColor(-12761513);
        e30 e30Var = new e30(this, getContext());
        this.f1 = e30Var;
        org.telegram.ui.ActionBar.r6.W(e30Var, i14, this.resourcesProvider);
        e30Var.setTextSize(1, 11.0f);
        e30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        e30Var.setMaxLines(1);
        e30Var.setGravity(17);
        e30Var.setTypeface(AndroidUtilities.bold());
        e30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        e30Var.setTag(-1);
        if (!r1()) {
            e30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.j1 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(c30Var, w7.z5.l(1.0f, 0, -2));
        linearLayout.addView(e30Var, w7.z5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(d30Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(p40Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var2, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var, w7.z5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.z5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.g0 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.containerView.addView(view, w7.z5.c(1.0f, -1));
        for (int i23 = 0; i23 < 2; i23++) {
            this.j0[i23] = new f30(this, launchActivity);
            this.j0[i23].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.j0[i23].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.j0[i23], w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.k0 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, 240);
        this.k1.h(kVar2, AndroidUtilities.dp(48.0f));
        this.k1.setShowSubmenuByMove(false);
        int i24 = org.telegram.ui.ActionBar.k6.eg;
        org.telegram.ui.ActionBar.r6.T(kVar2, org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.v0(i24), 6, 6), null, org.telegram.ui.ActionBar.r6.O(i24));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.u1 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.v1 = d10;
        d10.m(false, true);
        int i25 = org.telegram.ui.ActionBar.k6.wg;
        d.setCheckColor(i25);
        d.d(org.telegram.ui.ActionBar.k6.v0(i25), org.telegram.ui.ActionBar.k6.v0(i25));
        d10.setCheckColor(i25);
        d10.d(org.telegram.ui.ActionBar.k6.v0(i25), org.telegram.ui.ActionBar.k6.v0(i25));
        Paint paint3 = new Paint(1);
        int i26 = org.telegram.ui.ActionBar.k6.hg;
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(i26));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.k1.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.r1 = d14;
        org.telegram.ui.ActionBar.e1 e = this.k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.n1 = e;
        p50 p50Var = new p50();
        this.d1 = p50Var;
        org.telegram.ui.ActionBar.e1 e7 = this.k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.t1 = e7;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, p50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.s1 = d15;
        p50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e10 = this.k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.x1 = e10;
        org.telegram.ui.ActionBar.e1 e11 = this.k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.y1 = e11;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.k1;
        int i27 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i26;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i26;
        }
        org.telegram.ui.ActionBar.e1 e12 = u0Var11.e(4, i27, string);
        this.w1 = e12;
        this.k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.v0(i24));
        this.k1.getPopupLayout().setFitItems(true);
        e10.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        e11.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d11.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d12.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        int i28 = org.telegram.ui.ActionBar.k6.vg;
        e12.d(org.telegram.ui.ActionBar.k6.v0(i28), org.telegram.ui.ActionBar.k6.v0(i28));
        e.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d13.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d14.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d15.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        e7.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        if (this.a1 != null) {
            l1();
        }
        if (o1()) {
            this.p0 = new f50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new d20(this, 3));
        g30 g30Var = new g30(this, launchActivity);
        this.m2 = g30Var;
        h30 h30Var = new h30(this);
        this.N2 = h30Var;
        final int i29 = 0;
        g30Var.setClipToPadding(false);
        h30Var.S();
        h30Var.o = org.telegram.ui.Components.bs.f;
        h30Var.d = 350L;
        h30Var.c = 350L;
        h30Var.e = 350L;
        g30Var.setItemAnimator(h30Var);
        g30Var.setOnScrollListener(new i30(this));
        g30Var.setClipChildren(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        g30Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.a30 a30Var = new org.telegram.ui.Components.a30(call, this.currentAccount, this);
        this.p2 = a30Var;
        g30Var.setAdapter(a30Var);
        a30Var.F(g30Var, false);
        g30Var.setOnItemClickListener(new org.telegram.ui.Components.am0(this) { // from class: org.telegram.ui.e20
            public final /* synthetic */ u50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void d(int i182, View view2) {
                switch (i29) {
                    case 0:
                        u50 u50Var2 = this.b;
                        u50Var2.getClass();
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view2;
                        if (z20Var.getVideoParticipant() != null) {
                            u50Var2.e1(z20Var.getVideoParticipant());
                            break;
                        } else {
                            u50Var2.e1(new ChatObject.VideoParticipant(z20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        u50 u50Var3 = this.b;
                        u50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            u50Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        g30Var.setOnItemLongClickListener(new c20(this, 1));
        g30Var.setVisibility(8);
        g30Var.i(new j30());
        k30 k30Var = new k30(this, launchActivity, this.Q, g30Var, this.Y1, this.a1, this);
        this.a2 = k30Var;
        k30Var.setClipChildren(false);
        a30Var.E(this.Y1, k30Var);
        if (this.n2 != null) {
            this.o2.G(this.Y1, k30Var);
        }
        l30 l30Var = new l30(this, launchActivity);
        this.D2 = l30Var;
        m30 m30Var = new m30(this, launchActivity, this.O, this.Q, l30Var);
        this.b = m30Var;
        m30Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        m30Var.setInvalidateWithParent(true);
        l30Var.setProfileGalleryView(m30Var);
        n30 n30Var = new n30(this, launchActivity);
        this.C2 = n30Var;
        n30Var.setVisibility(8);
        m30Var.setVisibility(0);
        m30Var.b(new o30(this));
        p30 p30Var = new p30(this, launchActivity);
        this.b2 = p30Var;
        this.containerView.addView(k30Var);
        k30Var.addView(g30Var, w7.z5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.z5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.z5.e(-1, 0, 83));
        mh.h hVar = new mh.h(launchActivity);
        this.c0 = hVar;
        hVar.setDelegate(new q30(this));
        hVar.setClickCellDelegate(new r30(this));
        if (this.a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(launchActivity, false, true, true);
        this.M = q6Var;
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(-1);
        q6Var.b(0.4f, 320L, org.telegram.ui.Components.bs.h);
        q6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        s30 s30Var = new s30(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = s30Var;
        s30Var.J = true;
        s30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.d0)});
        s30Var.getEditText().setLinkTextColor(-11683585);
        s30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        s30Var.getEditText().addTextChangedListener(new t30(this));
        s30Var.s();
        u30 u30Var = new u30(this, launchActivity);
        this.G = u30Var;
        this.containerView.addView(u30Var, w7.z5.c(-1.0f, -1));
        v30 v30Var = new v30(launchActivity);
        this.F = v30Var;
        v30Var.addView(s30Var, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        v30Var.addView(q6Var, w7.z5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        q6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(v30Var, w7.z5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i30 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.S(imageView3, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i30), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i30), this.resourcesProvider);
        int i31 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i31, g6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new d20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        org.telegram.ui.ActionBar.r6.S(imageView4, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i30), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i30), this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.v6, this.resourcesProvider, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new d20(this, 5));
        v30Var.addView(imageView3, w7.z5.e(48, 48, 85));
        v30Var.addView(imageView4, w7.z5.e(48, 48, 85));
        this.containerView.addView(p30Var);
        n30Var.addView(m30Var, w7.z5.c(-1.0f, -1));
        n30Var.addView(l30Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(n30Var, w7.z5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.o2.I(this.n2, false);
        }
        this.I0 = this.P.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.S = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.Z0) && (chat2 = this.Z0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, w7.z5.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(launchActivity);
            qd0Var.setTextColor(-1);
            qd0Var.setSelectorColor(-9598483);
            qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            qd0Var.setItemCount(5);
            x30 x30Var = new x30(launchActivity);
            x30Var.setItemCount(5);
            x30Var.setTextColor(-1);
            x30Var.setSelectorColor(-9598483);
            x30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            y30 y30Var = new y30(launchActivity);
            y30Var.setItemCount(5);
            y30Var.setTextColor(-1);
            y30Var.setSelectorColor(-9598483);
            y30Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            z30 z30Var = new z30(launchActivity);
            this.T = z30Var;
            z30Var.setLines(1);
            z30Var.setSingleLine(true);
            z30Var.setEllipsize(TextUtils.TruncateAt.END);
            z30Var.setGravity(17);
            z30Var.setTextColor(-1);
            z30Var.setTypeface(AndroidUtilities.bold());
            z30Var.setTextSize(1, 14.0f);
            this.containerView.addView(z30Var, w7.z5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            z30Var.setOnClickListener(new org.telegram.messenger.video.f(this, qd0Var, x30Var, y30Var, chat, accountInstance, inputPeer2, 1));
            b40 b40Var = new b40(launchActivity, qd0Var, x30Var, y30Var);
            this.R = b40Var;
            b40Var.setWeightSum(1.0f);
            b40Var.setOrientation(0);
            this.containerView.addView(b40Var, w7.z5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i32 = calendar.get(1);
            int i33 = calendar.get(6);
            b40Var.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
            qd0Var.setMinValue(0);
            qd0Var.setMaxValue(365);
            qd0Var.setWrapSelectorWheel(false);
            qd0Var.setFormatter(new h20(currentTimeMillis, calendar, i32, 0));
            a1.d dVar = new a1.d(this, qd0Var, x30Var, y30Var, 13);
            u50Var = this;
            qd0Var.setOnValueChangedListener(dVar);
            x30Var.setMinValue(0);
            x30Var.setMaxValue(23);
            b40Var.addView(x30Var, w7.z5.l(0.2f, 0, 270));
            x30Var.setFormatter(new wv(2));
            x30Var.setOnValueChangedListener(dVar);
            y30Var.setMinValue(0);
            y30Var.setMaxValue(59);
            y30Var.setValue(0);
            y30Var.setFormatter(new wv(3));
            b40Var.addView(y30Var, w7.z5.l(0.3f, 0, 270));
            y30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i34 = calendar.get(6);
            int i35 = calendar.get(12);
            int i36 = calendar.get(11);
            qd0Var.setValue(i33 != i34 ? 1 : 0);
            y30Var.setValue(i35);
            x30Var.setValue(i36);
            org.telegram.ui.Components.f5.g(z30Var, textView, 0L, 604800L, 2, qd0Var, x30Var, y30Var);
        } else {
            u50Var = this;
        }
        c40 c40Var = new c40(u50Var, (ViewGroup) u50Var.getWindow().getDecorView(), u50Var.containerView);
        u50Var.c2 = c40Var;
        c40Var.E = new d40(u50Var);
        m30Var.setPinchToZoomHelper(c40Var);
        final int i37 = 0;
        u50Var.n.setOnClickListener(new View.OnClickListener(u50Var) { // from class: org.telegram.ui.i20
            public final /* synthetic */ u50 b;

            {
                this.b = u50Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i37) {
                    case 0:
                        u50.p(this.b, launchActivity);
                        break;
                    default:
                        u50 u50Var2 = this.b;
                        u50Var2.a2.e();
                        ChatObject.Call call2 = u50Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            u50Var2.J1();
                            u50.t1(launchActivity, new f20(u50Var2, 5), false, false);
                            break;
                        } else {
                            u50Var2.dismiss();
                            break;
                        }
                }
            }
        });
        u50Var.M1(false);
        u50Var.J1();
        u50Var.N1(false);
        u50Var.O1(false, false);
        u50Var.B1(0.0f);
        u50Var.P1();
        u50Var.containerView.addView(new FrameLayout(launchActivity), w7.z5.e(-1, 200, 87));
        u50Var.v.setOnClickListener(new d20(u50Var, 6));
        u50Var.T0();
        w7.b6.a(u50Var.n);
        w7.b6.a(u50Var.r);
        w7.b6.a(u50Var.f);
        w7.b6.a(u50Var.h);
        w7.b6.a(u50Var.w);
        w7.b6.a(u50Var.s);
        w7.b6.a(u50Var.v);
        r0.i0.l(u50Var.containerView, new c20(u50Var, 2));
    }

    public static r0.k1 A(u50 u50Var, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        i0.b f7 = h1Var.f(647);
        i0.b f10 = h1Var.f(8);
        s30 s30Var = u50Var.H;
        int max = Math.max(f10.d, (s30Var.N || s30Var.e) ? s30Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = u50Var.b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (s30Var.getEmojiView() != null) {
            s30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (u50Var.S2) {
            ViewGroup viewGroup = u50Var.containerView;
            int i10 = u50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = u50Var.containerView;
            int i11 = u50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.a + i11, f7.b, i11 + f7.c, f7.d);
        }
        u50Var.containerView.requestLayout();
        if (max == 0 && !s30Var.N && !s30Var.e && !s30Var.O) {
            s30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.gl0 gl0Var = u50Var.K;
            if (gl0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                gl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.gl0 gl0Var2 = new org.telegram.ui.Components.gl0(1, u50Var.currentAccount, u50Var.getContext(), R, u50Var.resourcesProvider);
                    u50Var.K = gl0Var2;
                    gl0Var2.setDelegate(new v40(u50Var));
                    u50Var.containerView.addView(u50Var.K, w7.z5.e(-2, 52, 81));
                    u50Var.K.p(null, null, false);
                    u50Var.G.bringToFront();
                    u50Var.F.bringToFront();
                    gl0Var = u50Var.K;
                }
            }
            u50Var.K = gl0Var;
        }
        s30Var.G(f10.d, false);
        u50Var.C1.j(k1Var);
        return r0.k1.b;
    }

    public static String A0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void B(u50 u50Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        boolean z10 = false;
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.xc(u50Var.topBulletinContainer, new ci.k0()).f0(tL_error, false);
                return;
            }
            return;
        }
        Context context = u50Var.getContext();
        int i10 = u50Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.g6 g6Var = u50Var.resourcesProvider;
        ChatObject.Call call = u50Var.a1;
        if (call != null && (groupCall = call.call) != null && groupCall.creator) {
            z10 = true;
        }
        m9.n0(context, i10, inputGroupCall, str, g6Var, false, z10);
    }

    public static void B0(u50 u50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (u50Var.n0 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(u50Var.getContext(), 8);
            u50Var.n0 = r40Var;
            r40Var.setAlpha(0.0f);
            u50Var.n0.setVisibility(4);
            u50Var.n0.setShowingDuration(4000L);
            u50Var.containerView.addView(u50Var.n0, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            u50Var.n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            u50Var.n0.d();
        }
        u50Var.n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        u50Var.n0.f(u50Var.w, true);
    }

    public static /* synthetic */ void C(u50 u50Var, int[] iArr, float[] fArr) {
        s4.b1 K;
        g30 g30Var = u50Var.m2;
        k30 k30Var = u50Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = u50Var.a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (k30Var.b) {
                    for (int i11 = 0; i11 < g30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) g30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(z20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            z20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (u50Var.s0 ? u50Var.D0 : u50Var.a1.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = u50Var.Q.K(indexOf + u50Var.P.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == u50Var.X2 && !u50Var.l2) {
                                u50Var.containerView.invalidate();
                            }
                        }
                    }
                }
                k30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void D(u50 u50Var) {
        Editable text = u50Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(u50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        u50Var.A1(tL_textWithEntities);
    }

    public static void F0(u50 u50Var) {
        ChatObject.Call call = u50Var.a1;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = u50Var.a1.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(u50Var.a1.call.join_muted);
        ConnectionsManager connectionsManager = u50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.g1(dispatchQueue), new o20(u50Var, 1));
    }

    public static void F1(org.telegram.ui.ActionBar.e1 e1Var, int i10) {
        if (e1Var != null) {
            e1Var.d(i10, i10);
        }
    }

    public static void G0(u50 u50Var, boolean z10) {
        if (u50Var.a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = u50Var.a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        u50Var.x3 = Boolean.valueOf(z10);
        u50Var.I1(true);
        ConnectionsManager connectionsManager = u50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.g1(dispatchQueue), new o20(u50Var, 0));
    }

    public static void H0(u50 u50Var) {
        int i10;
        if (!u50Var.r1()) {
            u50Var.isFullscreen = false;
            return;
        }
        k30 k30Var = u50Var.a2;
        boolean z10 = (!k30Var.V && k30Var.b && (F3 == u50Var.q1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = u50Var.j2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = u50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                u50Var.getWindow().clearFlags(1024);
                u50Var.setHideSystemVerticalInsets(false);
            } else {
                u50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                u50Var.getWindow().addFlags(1024);
            }
            u50Var.containerView.setSystemUiVisibility(i10);
            u50Var.j2 = Boolean.valueOf(z10);
            u50Var.S2 = !z10;
            u50Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l I0(u50 u50Var) {
        z40 z40Var = u50Var.Q;
        for (int i10 = 0; i10 < z40Var.getChildCount(); i10++) {
            View childAt = z40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(u50 u50Var) {
        p40 p40Var = u50Var.O;
        z40 z40Var = u50Var.Q;
        int childCount = z40Var.getChildCount();
        float f7 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(z40Var.getChildAt(i10)) >= 0) {
                f7 = Math.min(f7, r8.getTop());
            }
        }
        if (f7 < 0.0f || f7 == 2.14748365E9f) {
            f7 = childCount != 0 ? 0.0f : z40Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = f7 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f7 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && p40Var.getTag() == null) || (!z10 && p40Var.getTag() != null)) {
            p40Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = u50Var.h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                u50Var.h0 = null;
            }
            u50Var.setUseLightStatusBar(p40Var.getTag() == null);
            ViewPropertyAnimator duration = p40Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
            duration.setInterpolator(bsVar).start();
            p40Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(bsVar).start();
            ObjectAnimator objectAnimator = u50Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                u50Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.n5 subtitleTextView = p40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.n5, Float>) property, p40Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            u50Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            u50Var.U2.setInterpolator(bsVar);
            u50Var.U2.addListener(new o40(null == true ? 1 : 0, u50Var, z10));
            u50Var.U2.start();
            ObjectAnimator objectAnimator2 = u50Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(p40Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.n5, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            u50Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            u50Var.V2.setInterpolator(bsVar);
            u50Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            u50Var.h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = u50Var.h0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(p40Var, (Property<p40, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(u50Var.N, (Property<d30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(u50Var.g0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            u50Var.h0.addListener(new m40(u50Var, i11));
            u50Var.h0.start();
            u50Var.a2.v.setClickable(!z10 || F3);
        }
        if (u50Var.y0 != dp) {
            u50Var.E1(dp);
        }
    }

    public static void N(u50 u50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (u50Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(u50Var.Y1, u50Var.a2, lVar, null, null, lVar.getParticipant(), u50Var.a1, u50Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void S(u50 u50Var, int i10, int[] iArr) {
        if (u50Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.k6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zg, false), u50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kg, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), u50Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zg, false), u50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cg, false), u50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.k6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Mg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ng, false), u50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kg, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false), u50Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bg, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Fg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hg, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                D3 = new u50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                D3 = new u50(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            D3.i0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(23));
        }
    }

    public static String f1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 0) {
            return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
        }
        if (i10 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioRoutingPhone) : LocaleController.getString(R.string.VoipAudioRoutingHeadset);
        }
        if (i10 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : str;
    }

    public static String g1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i10 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth) : LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str) : i10 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioSwitchedToPhone) : LocaleController.getString(R.string.VoipAudioSwitchedToHeadset) : LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    public static /* synthetic */ void m(u50 u50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(declineconferencecallinvite, new n20(u50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(u50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = u50Var.a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            u50Var.a1.invitedUsersMap.remove(l4);
            u50Var.a1.invitedUsersMessageIds.remove(l4);
            u50Var.O0(true);
        }
    }

    public static void n(final u50 u50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = u50Var.d;
        ArrayList arrayList = u50Var.F0;
        o50 o50Var = u50Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            u50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.d4) {
            u50Var.G1((org.telegram.ui.Cells.d4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l4 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.v3)) {
            if (i10 != o50Var.w) {
                if (i10 != o50Var.x) {
                    if (i10 == o50Var.y) {
                        u50Var.v1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = u50Var.a1;
                if (call2 == null || call2.call == null) {
                    return;
                }
                ug.l1 l1Var = new ug.l1(activity, u50Var.currentAccount, null, 4, new ci.k0());
                ChatObject.Call call3 = u50Var.a1;
                l1Var.C0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new k2.g(5)).collect(Collectors.toSet()) : null);
                l1Var.h0(false, true);
                l1Var.A0 = new f20(u50Var, 3);
                l1Var.h0(false, true);
                l1Var.D0 = new ai.r5(18, u50Var, call);
                l1Var.show();
                return;
            }
            if (ChatObject.isChannel(u50Var.Z0) && (chat = u50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                u50Var.j1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(u50Var.i1());
            if (chatFull == null) {
                return;
            }
            u50Var.w0 = false;
            Context context = u50Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = u50Var.Z0;
            ChatObject.Call call4 = u50Var.a1;
            org.telegram.ui.Components.a40 a40Var = new org.telegram.ui.Components.a40(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            u50Var.E1 = a40Var;
            a40Var.setOnDismissListener(new j20(u50Var, 2));
            org.telegram.ui.Components.a40 a40Var2 = u50Var.E1;
            a40Var2.g0 = new t20(u50Var);
            a40Var2.show();
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (v3Var.getUser() == null) {
            return;
        }
        if (!u50Var.o1()) {
            u50Var.i0.P0(u50Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v3Var.getUser().id);
            if (v3Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            u50Var.i0.u0(new ProfileActivity(bundle, null));
            u50Var.dismiss();
            return;
        }
        int i11 = i10 - o50Var.n;
        if (i11 < 0 || i11 >= u50Var.a1.shadyJoinParticipants.size()) {
            int i12 = i10 - o50Var.s;
            if (i12 < 0 || i12 >= u50Var.a1.shadyLeftParticipants.size()) {
                int i13 = i10 - o50Var.f;
                if (u50Var.s0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l4 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < u50Var.a1.invitedUsers.size()) {
                    l4 = u50Var.a1.invitedUsers.get(i13);
                }
                z10 = false;
            } else {
                l4 = u50Var.a1.shadyLeftParticipants.get(i10 - o50Var.s);
            }
        } else {
            l4 = u50Var.a1.shadyJoinParticipants.get(i10 - o50Var.n);
        }
        if (z10 || (invitedUser = u50Var.a1.invitedUsersMessageIds.get(l4)) == null) {
            return;
        }
        org.telegram.ui.Components.j80 F = org.telegram.ui.Components.j80.F(u50Var.container, u50Var.resourcesProvider, v3Var);
        final int i14 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(u50Var) { // from class: org.telegram.ui.l20
            public final /* synthetic */ u50 b;

            {
                this.b = u50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        u50.s(this.b, invitedUser, l4);
                        break;
                    default:
                        u50.m(this.b, invitedUser, l4);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(u50Var) { // from class: org.telegram.ui.l20
            public final /* synthetic */ u50 b;

            {
                this.b = u50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        u50.s(this.b, invitedUser, l4);
                        break;
                    default:
                        u50.m(this.b, invitedUser, l4);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), u50Var.C0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void p(u50 u50Var, Activity activity) {
        LaunchActivity launchActivity = u50Var.i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            u50Var.i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            u50Var.O1(true, false);
            u50Var.N1(false);
            u50Var.a1.sortParticipants();
            u50Var.O0(true);
            u50Var.e.requestLayout();
            return;
        }
        u50Var.j0[0].d(1, false);
        if (u50Var.z0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            e40 e40Var = new e40(u50Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            u50Var.z0 = e40Var;
            e40Var.setBottomPadding(u50Var.containerView.getPaddingBottom());
            u50Var.container.addView(u50Var.z0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static boolean p1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static /* synthetic */ void q(u50 u50Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u50Var.d2 = floatValue;
        u50Var.a2.n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        n30 n30Var = u50Var.C2;
        n30Var.setScaleX(f12);
        n30Var.setScaleY(f12);
        n30Var.setTranslationX((1.0f - u50Var.d2) * f10);
        n30Var.setTranslationY((1.0f - u50Var.d2) * f11);
        if (!u50Var.g2) {
            u50Var.W2.setAlpha((int) (u50Var.d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = u50Var.Z2;
        if (tVar != null) {
            tVar.a.setRoundCorners((1.0f - u50Var.d2) * AndroidUtilities.dp(8.0f));
        }
        n30Var.invalidate();
        u50Var.containerView.invalidate();
        m30 m30Var = u50Var.b;
        int i11 = (int) ((1.0f - u50Var.d2) * i10);
        m30Var.N(i11, i11);
    }

    public static /* synthetic */ void r(u50 u50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = u50Var.a1;
        if (call2 == null || (groupCall = call2.call) == null) {
            return;
        }
        String str = groupCall.invite_link;
        int size = hashSet.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            u50Var.a1.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = u50Var.a1.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(u50Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new gi.z0(u50Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        u50Var.O0(true);
        if (!bool.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
            return;
        }
        sharedInstance.createCaptureDevice(false);
        if (!sharedInstance.isFrontFaceCamera()) {
            sharedInstance.switchCamera();
        }
        sharedInstance.requestVideoCall(false);
        sharedInstance.setVideoState(false, 2);
        sharedInstance.setMicMute(false, false, true);
        sharedInstance.switchToSpeaker();
        u50Var.O1(true, true);
    }

    public static /* synthetic */ void s(u50 u50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(declineconferencecallinvite, new n20(u50Var, 1));
        ChatObject.Call call = u50Var.a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            u50Var.O0(true);
        }
    }

    public static /* synthetic */ void t(u50 u50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(u50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t1(Context context, Runnable runnable, boolean z10, boolean z11) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        ChatObject.Call call = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        if (z11 || !ChatObject.canManageCalls(chat)) {
            w1(call, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        if (sharedInstance.isConference()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
        } else if (ChatObject.isChannelOrGiga(chat)) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
            if (z10) {
                z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
            } else {
                z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.k6.rg;
                int i11 = org.telegram.ui.ActionBar.k6.pg;
                int i12 = org.telegram.ui.ActionBar.k6.ng;
                checkBoxSquare.s = i10;
                checkBoxSquare.v = i11;
                checkBoxSquare.w = i12;
                checkBoxSquare.invalidate();
            }
            z1VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
            } else {
                z1VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
            }
            z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            e.addView(z1VarArr[0], w7.z5.n(-1, -2));
            z1VarArr[0].setOnClickListener(new g20(z1VarArr, 0));
        }
        alertDialog$Builder.o(e);
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.k6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ai.y3(call, z1VarArr, selfId, runnable, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.a.R0 = false;
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                c2Var.getWindow().setType(2038);
            } else {
                c2Var.getWindow().setType(2003);
            }
            c2Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            c2Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ug, false));
        }
        c2Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.vg, null);
        }
        c2Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hg, false));
    }

    public static void u(u50 u50Var) {
        u50Var.Y0();
        u50Var.V0();
        u50Var.U0();
        u50Var.F.setTranslationY((-u50Var.C1.d()) + u50Var.containerView.getPaddingBottom());
        u50Var.G.invalidate();
        u50Var.Z0();
        u50Var.containerView.invalidate();
    }

    public static /* synthetic */ void v(u50 u50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(u50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void w(u50 u50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(u50Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(u50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(u50Var, hashSet, call, str, 12));
    }

    public static void w1(ChatObject.Call call, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null) {
                call.participants.e(j10);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i10 = 0;
                while (i10 < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i10).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
            }
            for (int i11 = 0; i11 < call.sortedParticipants.size(); i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i11);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static /* synthetic */ void x(u50 u50Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(u50Var.currentAccount).getUser(l4));
            getrequirementstocontact.id.add(MessagesController.getInstance(u50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30(u50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(u50Var.currentAccount).isPremium()) {
            g30Var.run();
        } else {
            ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(getrequirementstocontact, new ca(arrayList, arrayList2, g30Var, 13));
        }
    }

    public static /* synthetic */ void y(u50 u50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(34, u50Var.currentAccount, U.getContext(), U, new ci.k0());
        j0Var.M1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static /* synthetic */ void z(u50 u50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            u50Var.x1(null, j10, 3);
        } else {
            org.telegram.ui.Components.f5.f0(u50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) u50Var.i0.O().getFragmentStack().get(u50Var.i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.H.setText("");
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.a1;
        long j10 = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j10, inputGroupCall);
    }

    public final void B1(float f7) {
        this.U1 = f7;
        k30 k30Var = this.a2;
        float max = Math.max(f7, k30Var == null ? 0.0f : k30Var.c);
        int i10 = org.telegram.ui.ActionBar.k6.jg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.k6.x0(null, i11, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.k1.B(-14472653);
        this.f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.tg, false), f7, 1.0f);
        f50 f50Var = this.p0;
        if (f50Var != null) {
            f50Var.j = offsetColor2;
            e50 e50Var = f50Var.g;
            if (e50Var != null) {
                e50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        z40 z40Var = this.Q;
        z40Var.setGlowColor(offsetColor2);
        int i12 = this.F1;
        if (i12 == 3 || p1(i12)) {
            this.w.invalidate();
        }
        View view = this.J2;
        if (view != null) {
            int i13 = this.V1;
            int[] iArr = this.M2;
            iArr[0] = i13;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.L2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.L2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.K2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Eg, false), f7, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.mg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider);
        int childCount = z40Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = z40Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(w02, w02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                p40 p40Var = this.O;
                if (z10) {
                    ((org.telegram.ui.Cells.d4) childAt).f(p40Var.getTag() != null ? org.telegram.ui.ActionBar.k6.rg : org.telegram.ui.ActionBar.k6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    ((org.telegram.ui.Cells.v3) childAt).a(p40Var.getTag() != null ? org.telegram.ui.ActionBar.k6.rg : org.telegram.ui.ActionBar.k6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        z40Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        z40 z40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        s4.b1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f7 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.a1;
        if (call == null || (z40Var = this.Q) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) == null) {
            return;
        }
        k30 k30Var = this.a2;
        if (k30Var.b) {
            int i10 = 0;
            while (true) {
                g30 g30Var = this.m2;
                if (i10 >= g30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) g30Var.getChildAt(i10);
                if (MessageObject.getPeerId(z20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    z20Var.setAmplitude(f7 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.s0 ? this.D0 : this.a1.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = z40Var.K(indexOf + this.P.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                    if (view == this.X2 && !this.l2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        k30Var.k(groupCallParticipant, f7 * 15.0f);
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.g3 = i10;
        this.h3 = i11;
        this.i3 = i12;
        this.j3 = i13;
        this.k3 = i14;
        this.l3 = i15;
        this.m3 = i16;
        this.n3 = i17;
        this.o3 = i18;
        this.p3 = i19;
        this.q3 = i20;
        this.r3 = i21;
        this.s3 = i22;
        this.t3 = i23;
        this.u3 = i24;
        this.v3 = i25;
    }

    public final void E1(float f7) {
        int i10;
        this.y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float dp = f7 - AndroidUtilities.dp(74.0f);
        float f10 = this.backgroundPaddingTop + dp;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        j50 j50Var = this.U0;
        k30 k30Var = this.a2;
        e30 e30Var = this.f1;
        c30 c30Var = this.e1;
        if (f10 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i10 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (j50Var != null) {
                j50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.b1.x(min, 0.1f, 1.2f, 1.0f);
            c30Var.setScaleX(Math.max(0.9f, x10));
            c30Var.setScaleY(Math.max(0.9f, x10));
            float f11 = 1.0f - (min * 1.2f);
            c30Var.setAlpha((1.0f - k30Var.c) * Math.max(0.0f, f11));
            e30Var.setScaleX(Math.max(0.9f, x10));
            e30Var.setScaleY(Math.max(0.9f, x10));
            e30Var.setAlpha((1.0f - k30Var.c) * Math.max(0.0f, f11));
        } else {
            c30Var.setScaleX(1.0f);
            c30Var.setScaleY(1.0f);
            c30Var.setAlpha(1.0f - k30Var.c);
            e30Var.setScaleX(1.0f);
            e30Var.setScaleY(1.0f);
            e30Var.setAlpha(1.0f - k30Var.c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f12 = i10;
        this.z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f12));
        this.j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        if (j50Var != null) {
            j50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        b40 b40Var = this.R;
        if (b40Var != null) {
            b40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        }
        this.containerView.invalidate();
        R1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x02d0, code lost:
    
        if ((r14 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02ea, code lost:
    
        if (r25 == (-i1())) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028d, code lost:
    
        if (r7.admin_rights.manage_call != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r4v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G1(View view) {
        org.telegram.ui.Cells.d4 d4Var;
        r50 r50Var;
        long j10;
        ei.m5 m5Var;
        org.telegram.ui.ActionBar.u1 u1Var;
        AccountInstance accountInstance;
        boolean z10;
        long j11;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j12;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z11;
        b50 b50Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        float y3;
        float y10;
        int measuredHeight;
        int i10;
        int i11;
        ?? r42;
        boolean z12;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.X.k() && getContext() != null) {
            if (this.c3 || this.f2) {
                d1(true);
                return false;
            }
            t40 t40Var = this.f3;
            if (t40Var != null) {
                t40Var.dismiss();
                this.f3 = null;
                return false;
            }
            b1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.a1.videoNotAvailableParticipant) {
                    d4Var = new org.telegram.ui.Cells.d4(lVar.getContext());
                    d4Var.e(this.d, lVar.getParticipant().participant, this.a1, MessageObject.getPeerId(this.A0), null, false);
                    org.telegram.ui.Components.p5 p5Var = d4Var.s;
                    if (p5Var != null) {
                        p5Var.f();
                    }
                    this.b3 = false;
                    this.Y2 = lVar;
                    this.Z2 = lVar.getRenderer();
                    if (!G3 && !F3) {
                        this.containerView.addView(d4Var, w7.z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (d4Var != null) {
                        boolean z13 = (F3 || G3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = d4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ei(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new c20(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.E2 = linearLayout;
                            ei.m5 m5Var2 = new ei.m5(getContext(), linearLayout, linearLayout2, 7);
                            m5Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            m5Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.tg, false), this.U1, 1.0f);
                            if (linearLayout2 == null || d4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                r50Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                m5Var2.addView(linearLayout2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                r50Var = new r50(this, getContext(), participant);
                                linearLayout2.addView(r50Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            m5Var2.addView(linearLayout, w7.z5.k(0.0f, r50Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(getContext(), R.style.scrollbarShapeStyle, m5Var2);
                            u1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(u1Var2, w7.z5.c(-2.0f, -2));
                            r50 r50Var2 = r50Var;
                            long peerId = MessageObject.getPeerId(participant.peer);
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            boolean z14 = z13;
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z15 = participant.peer instanceof TLRPC.TL_peerUser;
                            AccountInstance accountInstance2 = this.d;
                            if (z15) {
                                accountInstance = accountInstance2;
                                if (ChatObject.isChannel(this.Z0)) {
                                    j10 = peerId;
                                    m5Var = m5Var2;
                                    u1Var = u1Var2;
                                    TLRPC.ChannelParticipant adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, i1());
                                    if (adminInChannel != null) {
                                        if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                        }
                                        z10 = true;
                                    }
                                    z10 = false;
                                } else {
                                    j10 = peerId;
                                    m5Var = m5Var2;
                                    u1Var = u1Var2;
                                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
                                    if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                        int size = chatParticipants.participants.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= size) {
                                                break;
                                            }
                                            TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                                            TLRPC.ChatFull chatFull2 = chatFull;
                                            int i13 = size;
                                            if (chatParticipant.user_id != participant.peer.user_id) {
                                                i12++;
                                                chatFull = chatFull2;
                                                size = i13;
                                            } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                }
                            } else {
                                j10 = peerId;
                                m5Var = m5Var2;
                                u1Var = u1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (d4Var.c()) {
                                if (o1() && d4Var.K) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    org.telegram.ui.Cells.b1.n(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(d4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                org.telegram.ui.Cells.b1.n(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                org.telegram.ui.Cells.b1.n(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                org.telegram.ui.Cells.b1.n(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j11 = 0;
                            } else if (Q0()) {
                                if (!o1() && z10 && participant.muted) {
                                    if (o1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        org.telegram.ui.Cells.b1.q(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j11 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.b1.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupAllowToSpeak));
                                    j11 = 0;
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                                    }
                                    arrayList3.add(1);
                                }
                                TLRPC.Peer peer = participant.peer;
                                if (peer != null) {
                                    long j13 = peer.channel_id;
                                    if (j13 != j11 && !ChatObject.isMegagroup(this.currentAccount, j13)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.b1.q(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (o1() ? !(z10 || !ChatObject.canBlockUsers(this.Z0)) : !((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            org.telegram.ui.Cells.b1.n(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (o1()) {
                                }
                            } else {
                                j11 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    org.telegram.ui.Cells.b1.q(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    org.telegram.ui.Cells.b1.n(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j14 = peer2.channel_id;
                                    if (j14 != 0 && !ChatObject.isMegagroup(this.currentAccount, j14)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.b1.q(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getContext(), i14 == 0, i14 == size2 + (-1));
                                if (((Integer) arrayList3.get(i14)).intValue() != 2) {
                                    int i15 = org.telegram.ui.ActionBar.k6.hg;
                                    r42 = 0;
                                    z12 = false;
                                    e1Var.d(org.telegram.ui.ActionBar.k6.x0(null, i15, false), org.telegram.ui.ActionBar.k6.x0(null, i15, false));
                                } else {
                                    r42 = 0;
                                    z12 = false;
                                    int i16 = org.telegram.ui.ActionBar.k6.vg;
                                    e1Var.d(org.telegram.ui.ActionBar.k6.x0(null, i16, false), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
                                }
                                e1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.x0(r42, org.telegram.ui.ActionBar.k6.eg, z12));
                                e1Var.j((CharSequence) arrayList.get(i14), ((Integer) arrayList2.get(i14)).intValue(), r42);
                                linearLayout.addView(e1Var);
                                e1Var.setTag(arrayList3.get(i14));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                e1Var.setOnClickListener(new ci.c6(this, i14, arrayList4, groupCallParticipant, 3));
                                i14++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            u1Var.addView(m5Var, w7.z5.x(-2, -2, 51));
                            z40 z40Var = this.Q;
                            z40Var.B0();
                            this.Y.X = false;
                            this.X2 = d4Var;
                            d4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            z40Var.invalidate();
                            AnimatorSet animatorSet = this.e3;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.e2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (j10 > j11) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1);
                                j12 = j10;
                                if (MessagesController.getInstance(this.currentAccount).getUserFull(j12) == null) {
                                    MessagesController.getInstance(this.currentAccount).loadUserInfo(user, false, 0);
                                }
                            } else {
                                j12 = j10;
                                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j12));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), chat, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), chat, 1);
                            }
                            org.telegram.ui.Components.voip.t tVar = this.Z2;
                            boolean z16 = tVar != null && tVar.v;
                            if (forUserOrChat != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.w9 avatarImageView = this.X2.getAvatarImageView();
                                    m30 m30Var = this.b;
                                    m30Var.setParentAvatarImage(avatarImageView);
                                    m30Var.setHasActiveVideo(z16);
                                    m30Var.M(j12, true);
                                    m30Var.setCreateThumbFromParent(true);
                                    m30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.t tVar2 = this.Z2;
                                    if (tVar2 != null) {
                                        tVar2.h = true;
                                        tVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.A0) == j12 && this.h2 != null && (b50Var = this.i2) != null && (fileLocation = b50Var.c) != null) {
                                        m30Var.A(b50Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.e2, w7.z5.c(-2.0f, -2));
                                this.g2 = true;
                                p30 p30Var = this.b2;
                                if (p30Var == null) {
                                    i11 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                    this.i0.O().getView().draw(canvas);
                                    canvas.drawColor(i0.a.o(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                    this.F2 = true;
                                    this.containerView.draw(canvas);
                                    i11 = 0;
                                    this.F2 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / 180));
                                    p30Var.setBackground(new BitmapDrawable(createBitmap));
                                    p30Var.setAlpha(0.0f);
                                    p30Var.setVisibility(0);
                                    p30Var.bringToFront();
                                }
                                this.c3 = true;
                                this.C2.setVisibility(i11);
                                if (r50Var2 != null) {
                                    r50Var2.invalidate();
                                }
                                y1(true, d4Var);
                                org.telegram.ui.Components.z20 z20Var = this.a3;
                                if (z20Var != null) {
                                    z20Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.f2 = false;
                            t40 t40Var2 = new t40(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.f3 = t40Var2;
                            t40Var2.e = true;
                            t40Var2.c = 220;
                            t40Var2.setOutsideTouchable(true);
                            this.f3.setClippingEnabled(true);
                            this.f3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.f3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.f3.setInputMethodMode(2);
                            this.f3.setSoftInputMode(0);
                            this.f3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.z20 z20Var2 = this.a3;
                            if (z20Var2 != null) {
                                boolean z17 = F3;
                                k30 k30Var = this.a2;
                                g30 g30Var = this.m2;
                                if (z17) {
                                    x10 = AndroidUtilities.dp(32.0f) + (((int) (k30Var.getX() + (g30Var.getX() + z20Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i10 = ((int) (k30Var.getY() + (g30Var.getY() + this.a3.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x10 = ((int) (k30Var.getX() + (g30Var.getX() + z20Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y3 = (k30Var.getY() + (g30Var.getY() + this.a3.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i10 = (int) y3;
                                }
                            } else {
                                x10 = (int) (((z40Var.getX() + z40Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.b3) {
                                    y10 = d4Var.getY() + z40Var.getY();
                                    measuredHeight = d4Var.getClipHeight();
                                } else if (this.Y2 != null) {
                                    y10 = this.Y2.getY() + z40Var.getY();
                                    measuredHeight = this.Y2.getMeasuredHeight();
                                } else {
                                    y3 = z40Var.getY();
                                    i10 = (int) y3;
                                }
                                i10 = (int) (y10 + measuredHeight);
                            }
                            this.f3.showAtLocation(z40Var, 51, x10, i10);
                            this.e3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.W2, org.telegram.ui.Components.t6.b, 0, 100));
                            this.e3.playTogether(arrayList5);
                            this.e3.setDuration(150L);
                            this.e3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.z20) {
                    org.telegram.ui.Components.z20 z20Var3 = (org.telegram.ui.Components.z20) view;
                    if (z20Var3.getParticipant() != this.a1.videoNotAvailableParticipant.participant) {
                        d4Var = new org.telegram.ui.Cells.d4(z20Var3.getContext());
                        d4Var.e(this.d, z20Var3.getParticipant(), this.a1, MessageObject.getPeerId(this.A0), null, false);
                        org.telegram.ui.Components.p5 p5Var2 = d4Var.s;
                        if (p5Var2 != null) {
                            p5Var2.f();
                        }
                        this.b3 = false;
                        this.a3 = z20Var3;
                        org.telegram.ui.Components.voip.t renderer = z20Var3.getRenderer();
                        this.Z2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.Z2 = null;
                        }
                        this.containerView.addView(d4Var, w7.z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    d4Var = (org.telegram.ui.Cells.d4) view;
                    this.b3 = true;
                }
                if (d4Var != null) {
                }
            }
        }
        return false;
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(8, getContext(), null, true);
            this.m0 = r40Var;
            r40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                this.m0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.m0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.m0.d();
        }
        this.m0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.m0.f(view, true);
    }

    public final void I1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatObject.Call call = this.a1;
        org.telegram.ui.Components.voip.t2 t2Var = this.v;
        org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
        org.telegram.ui.Components.voip.t2 t2Var3 = this.r;
        org.telegram.ui.Components.voip.t2 t2Var4 = this.f;
        org.telegram.ui.Components.voip.t2 t2Var5 = this.n;
        org.telegram.ui.Components.voip.t2 t2Var6 = this.s;
        org.telegram.ui.Components.voip.t2 t2Var7 = this.w;
        x20 x20Var = this.e;
        boolean z15 = false;
        if (call == null || call.isScheduled()) {
            x20Var.c(t2Var7, this.V0 > 0.1f, z10);
            x20Var.c(t2Var6, this.V0 > 0.1f, z10);
            x20Var.c(t2Var3, this.V0 > 0.1f, z10);
            x20Var.c(t2Var5, false, z10);
            x20Var.c(t2Var4, false, z10);
            x20Var.c(t2Var2, false, z10);
            x20Var.c(t2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
        Boolean bool = this.x3;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.a1.call;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.a1.canRecordVideo()) && !z16) || r1()) {
            z12 = false;
            z15 = true;
        } else {
            z12 = true;
        }
        if (z16) {
            z14 = true;
            z13 = false;
        } else {
            z13 = !z17;
            z14 = false;
        }
        if (F3) {
            z13 = false;
            z14 = false;
        }
        x20Var.c(t2Var7, true, z10);
        x20Var.c(t2Var6, true, z10);
        x20Var.c(t2Var5, z12, z10);
        x20Var.c(t2Var4, z14, z10);
        x20Var.c(t2Var3, z15, z10);
        x20Var.c(t2Var2, z13, z10);
        x20Var.c(t2Var, z11, z10);
    }

    public final void J1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.a1 == null) {
                u0Var.setVisibility(8);
                return;
            }
        }
        if (this.l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat3 != null) {
            this.Z0 = chat3;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.e1 e1Var = this.n1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.Z0) || ((chat2 = this.Z0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.Z0) || ChatObject.canUserDoAdminAction(this.Z0, 3))) || (ChatObject.isChannel(this.Z0) && (chat = this.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            e1Var.setVisibility(0);
        } else {
            e1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.x1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        } else {
            e1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            e1Var2.setVisibility(this.a1.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.q1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            e1Var4.setVisibility(8);
        } else {
            e1Var4.setVisibility(0);
        }
        e1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        e1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.e1 e1Var5 = this.w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.o1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.t1;
        if (Q0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (r1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (o1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (!this.a1.canRecordVideo() || this.a1.isScheduled() || r1()) {
                e1Var8.setVisibility(8);
            } else {
                e1Var8.setVisibility(0);
            }
            u0Var2.setVisibility(8);
            boolean z11 = this.a1.recording;
            p50 p50Var = this.d1;
            p50Var.f = z11;
            p50Var.d = 1.0f;
            p50Var.invalidateSelf();
            if (this.a1.recording) {
                if (this.D1 == null) {
                    f20 f20Var = new f20(this, 6);
                    this.D1 = f20Var;
                    AndroidUtilities.runOnUIThread(f20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                f20 f20Var2 = this.D1;
                if (f20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f20Var2);
                    this.D1 = null;
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                e1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                e1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            L1();
        } else {
            boolean z12 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
            boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z12 || (!(this.a1.canRecordVideo() || z13) || this.a1.isScheduled() || r1())) {
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(8);
            } else if (z13) {
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(0);
                e1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
            } else {
                e1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(0);
            }
            e1Var5.setVisibility(8);
            e1Var6.setVisibility(8);
            e1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.e1 e1Var9 = this.r1;
        if (Q02 && this.a1.call.can_change_join_muted && !o1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        u0Var.I(4, z10);
        this.p1.setVisibility((!r1() || this.a1.isScheduled()) ? 0 : 8);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility == 0 || e1Var9.getVisibility() == 0 || e1Var.getVisibility() == 0 || e1Var8.getVisibility() == 0 || e1Var7.getVisibility() == 0 || e1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.k0;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.b1) || r1() || this.A0 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.A0);
            kVar.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.Z0;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !r1() || e1Var.getVisibility() != 8) {
            u0Var.setVisibility(0);
        } else {
            u0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(int i10, boolean z10) {
        boolean z11;
        boolean P;
        boolean P2;
        String string;
        String string2;
        boolean z12;
        String str;
        String string3;
        String string4;
        boolean P3;
        String string5;
        boolean P4;
        String string6;
        boolean P5;
        String str2;
        int i11;
        t50[] t50VarArr;
        boolean z13;
        t50 t50Var;
        t50 t50Var2;
        boolean z14;
        boolean z15;
        k30 k30Var = this.a2;
        boolean z16 = k30Var != null && k30Var.b && (AndroidUtilities.isTablet() || F3 == q1());
        if (!r1() && this.F1 == i10 && z10) {
            return;
        }
        int i12 = 3;
        org.telegram.ui.Components.yj0 yj0Var = this.J0;
        if (i10 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            P5 = yj0Var.P(202);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i13 = this.F1;
                        if (i13 == 3) {
                            int i14 = yj0Var.f;
                            P3 = (i14 == 136 || i14 == 173 || i14 == 274 || i14 == 311) ? yj0Var.P(99) : false;
                        } else if (i13 == 5) {
                            P3 = yj0Var.P(404);
                        } else if (i13 == 7) {
                            P3 = yj0Var.P(376);
                        } else if (i13 == 6) {
                            P3 = yj0Var.P(237);
                        } else {
                            if (i13 == 2) {
                                z12 = yj0Var.P(36);
                                str = string3;
                                string2 = string4;
                                z11 = false;
                                if (r1() || i10 == i12 || this.a1.isScheduled()) {
                                    str2 = string2;
                                } else {
                                    str = LocaleController.getString(z16 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                                    boolean z17 = this.G1 != z16;
                                    this.G1 = z16;
                                    z12 = z17;
                                    str2 = "";
                                }
                                String D = !TextUtils.isEmpty(str2) ? a1.g.D(str, " ", str2) : str;
                                org.telegram.ui.Components.voip.t2 t2Var = this.w;
                                t2Var.setContentDescription(D);
                                t2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                                y20 y20Var = this.x;
                                ImageView imageView = this.y;
                                if (z10) {
                                    if (z12) {
                                        if (i10 == 5) {
                                            yj0Var.M(376);
                                        } else if (i10 == 7) {
                                            yj0Var.M(173);
                                        } else if (i10 == 6) {
                                            yj0Var.M(311);
                                        } else if (i10 == 0) {
                                            int i15 = this.F1;
                                            if (i15 == 5) {
                                                yj0Var.M(376);
                                            } else if (i15 == 7) {
                                                yj0Var.M(344);
                                            } else if (i15 == 6) {
                                                yj0Var.M(202);
                                            } else if (i15 == 2) {
                                                yj0Var.M(0);
                                            } else {
                                                yj0Var.M(69);
                                            }
                                        } else if (i10 == 1 || (this.F1 == 2 && o1())) {
                                            yj0Var.M(this.F1 == 4 ? 69 : 36);
                                        } else if (i10 == 4) {
                                            yj0Var.M(99);
                                        } else if (z11) {
                                            int i16 = this.F1;
                                            if (i16 == 7) {
                                                yj0Var.M(274);
                                            } else if (i16 == 6) {
                                                yj0Var.M(237);
                                            } else if (i16 == 1) {
                                                yj0Var.M(136);
                                            } else {
                                                yj0Var.M(99);
                                            }
                                        } else {
                                            int i17 = this.F1;
                                            if (i17 == 5) {
                                                yj0Var.M(376);
                                            } else if (i17 == 7) {
                                                yj0Var.M(344);
                                            } else if (i17 == 6) {
                                                yj0Var.M(202);
                                            } else if (i17 == 2 || i17 == 4) {
                                                yj0Var.M(0);
                                            } else {
                                                yj0Var.M(69);
                                            }
                                        }
                                    }
                                    y20Var.d();
                                    if (!r1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        y20Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((k30Var != null && k30Var.b && (AndroidUtilities.isTablet() || F3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        y20Var.setVisibility(8);
                                    }
                                    this.F1 = i10;
                                } else {
                                    this.F1 = i10;
                                    yj0Var.N(yj0Var.f - 1, false, true);
                                    if (!r1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        y20Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((k30Var != null && k30Var.b && (AndroidUtilities.isTablet() || F3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        y20Var.setVisibility(8);
                                    }
                                }
                                t2Var.invalidate();
                                i11 = this.F1;
                                t50VarArr = this.K1;
                                if (t50VarArr[i11] == null) {
                                    t50VarArr[i11] = new t50(i11);
                                    int i18 = this.F1;
                                    if (i18 == 3) {
                                        t50VarArr[i18].g = null;
                                    } else if (p1(i18)) {
                                        t50VarArr[this.F1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i19 = this.F1;
                                        if (i19 != 1) {
                                            z13 = false;
                                            t50VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            t50Var = t50VarArr[this.F1];
                                            t50Var2 = this.N1;
                                            if (t50Var != t50Var2) {
                                                this.M1 = t50Var2;
                                                this.N1 = t50Var;
                                                if (t50Var2 == null || !z10) {
                                                    this.L1 = 1.0f;
                                                    this.M1 = null;
                                                } else {
                                                    this.L1 = 0.0f;
                                                }
                                            }
                                            if (!z10) {
                                                t50 t50Var3 = this.N1;
                                                if (t50Var3 != null) {
                                                    int i20 = t50Var3.i;
                                                    z15 = (i20 == 1 || i20 == 0) ? true : z13;
                                                    z14 = i20 != 3 ? true : z13;
                                                } else {
                                                    z14 = z13;
                                                    z15 = z14;
                                                }
                                                this.P1 = z15 ? 1.0f : 0.0f;
                                                this.Q1 = z14 ? 1.0f : 0.0f;
                                            }
                                            this.e.invalidate();
                                        }
                                        t50VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Fg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                z13 = false;
                                t50Var = t50VarArr[this.F1];
                                t50Var2 = this.N1;
                                if (t50Var != t50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            P3 = yj0Var.P(99);
                        }
                        z12 = P3;
                        str = string3;
                        string2 = string4;
                    } else {
                        if (i10 == 1) {
                            string5 = LocaleController.getString(o1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            P4 = yj0Var.P(this.F1 == 4 ? 99 : 69);
                        } else if (o1() && i10 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            P4 = yj0Var.P(99);
                        } else {
                            if (i10 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                                z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
                                if (z11) {
                                    int i21 = this.F1;
                                    if (i21 == 7) {
                                        P2 = yj0Var.P(311);
                                    } else if (i21 == 6) {
                                        P2 = yj0Var.P(274);
                                    } else if (i21 == 1) {
                                        P2 = yj0Var.P(173);
                                    } else {
                                        P = yj0Var.P(136);
                                    }
                                    P = P2;
                                } else {
                                    int i22 = this.F1;
                                    if (i22 == 5) {
                                        P2 = yj0Var.P(404);
                                    } else if (i22 == 7) {
                                        P = yj0Var.P(376);
                                    } else if (i22 == 6) {
                                        P = yj0Var.P(237);
                                    } else if (i22 == 2 || i22 == 4) {
                                        P = yj0Var.P(36);
                                    } else {
                                        P2 = yj0Var.P(99);
                                    }
                                    P = P2;
                                }
                                i12 = 3;
                                if (i10 == 3) {
                                    string = LocaleController.getString(R.string.Connecting);
                                    z12 = P;
                                    string2 = "";
                                } else {
                                    string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                    string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    z12 = P;
                                }
                                str = string;
                                if (r1()) {
                                }
                                str2 = string2;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                org.telegram.ui.Components.voip.t2 t2Var2 = this.w;
                                t2Var2.setContentDescription(D);
                                t2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                                y20 y20Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z10) {
                                }
                                t2Var2.invalidate();
                                i11 = this.F1;
                                t50VarArr = this.K1;
                                if (t50VarArr[i11] == null) {
                                }
                                z13 = false;
                                t50Var = t50VarArr[this.F1];
                                t50Var2 = this.N1;
                                if (t50Var != t50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            P3 = yj0Var.P(136);
                            z12 = P3;
                            str = string3;
                            string2 = string4;
                        }
                        z12 = P4;
                    }
                    z11 = false;
                    if (r1()) {
                    }
                    str2 = string2;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    org.telegram.ui.Components.voip.t2 t2Var22 = this.w;
                    t2Var22.setContentDescription(D);
                    t2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                    y20 y20Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z10) {
                    }
                    t2Var22.invalidate();
                    i11 = this.F1;
                    t50VarArr = this.K1;
                    if (t50VarArr[i11] == null) {
                    }
                    z13 = false;
                    t50Var = t50VarArr[this.F1];
                    t50Var2 = this.N1;
                    if (t50Var != t50Var2) {
                    }
                    if (!z10) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z12 = yj0Var.P(377);
                string2 = "";
                str = string5;
                z11 = false;
                if (r1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.t2 t2Var222 = this.w;
                t2Var222.setContentDescription(D);
                t2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
                y20 y20Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z10) {
                }
                t2Var222.invalidate();
                i11 = this.F1;
                t50VarArr = this.K1;
                if (t50VarArr[i11] == null) {
                }
                z13 = false;
                t50Var = t50VarArr[this.F1];
                t50Var2 = this.N1;
                if (t50Var != t50Var2) {
                }
                if (!z10) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            P5 = yj0Var.P(344);
        }
        string2 = "";
        str = string6;
        z12 = P5;
        z11 = false;
        if (r1()) {
        }
        str2 = string2;
        if (!TextUtils.isEmpty(str2)) {
        }
        org.telegram.ui.Components.voip.t2 t2Var2222 = this.w;
        t2Var2222.setContentDescription(D);
        t2Var2222.c(0, 0, 0, 1.0f, true, str, false, z10);
        y20 y20Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z10) {
        }
        t2Var2222.invalidate();
        i11 = this.F1;
        t50VarArr = this.K1;
        if (t50VarArr[i11] == null) {
        }
        z13 = false;
        t50Var = t50VarArr[this.F1];
        t50Var2 = this.N1;
        if (t50Var != t50Var2) {
        }
        if (!z10) {
        }
        this.e.invalidate();
    }

    public final void L1() {
        if (this.a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.e1 e1Var = this.s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        b40 b40Var = this.R;
        if ((b40Var == null || this.a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (b40Var == null) {
                return;
            }
        }
        if (!z10) {
            b30 b30Var = this.w2;
            AndroidUtilities.cancelRunOnUIThread(b30Var);
            b30Var.run();
            ChatObject.Call call = this.a1;
            z40 z40Var = this.Q;
            if (call == null || call.isScheduled()) {
                z40Var.setVisibility(4);
            } else {
                z40Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.bs.f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
            this.W0 = bsVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * bsVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        b40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        y40 y40Var = this.V;
        y40Var.setAlpha(f7);
        y40Var.setScaleX(interpolation);
        y40Var.setScaleY(interpolation);
        z30 z30Var = this.T;
        z30Var.setScaleX(f11);
        z30Var.setScaleY(f11);
        z30Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.k1.setAlpha(f7);
        int i10 = f11 != 0.0f ? 0 : 4;
        if (i10 != b40Var.getVisibility()) {
            b40Var.setVisibility(i10);
            z30Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        org.telegram.ui.Components.voip.t2 t2Var = this.r;
        if (t2Var == null || t2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        x20 x20Var = this.e;
        if (sharedInstance == null || r1()) {
            t2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.Z0) || (ChatObject.hasAdminRights(this.Z0) && ChatObject.canAddUsers(this.Z0));
            lh.a aVar = (lh.a) x20Var.c.get(t2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                t2Var.setEnabled(z11);
            }
            t2Var.b(true, false);
            return;
        }
        lh.a aVar2 = (lh.a) x20Var.c.get(t2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            t2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            t2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
        } else if (z13) {
            t2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            t2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
        } else {
            t2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        }
        t2Var.b(z13, z10);
        h1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.a0 != i10) {
            this.a0 = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.b0, i10);
        }
        org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
        if (t2Var2.getVisibility() == 0) {
            t2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
            t2Var2.b(h1() != 1, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3 A[LOOP:2: B:137:0x029d->B:139:0x02a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(boolean z10) {
        z40 z40Var;
        o50 o50Var;
        k30 k30Var;
        z40 z40Var2;
        boolean z11;
        int i10;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        z40 z40Var3;
        k30 k30Var2;
        boolean z12;
        g30 g30Var;
        ?? r02;
        ?? r82;
        ChatObject.Call call;
        boolean z13;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        s4.b1 G;
        f fVar;
        int i14;
        u50 u50Var = this;
        o50 o50Var2 = u50Var.P;
        k30 k30Var3 = u50Var.a2;
        if (k30Var3 == null || (z40Var = u50Var.Q) == null || u50Var.a1 == null || u50Var.s0) {
            return;
        }
        if (k30Var3.b) {
            k30Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(u50Var.a1.selfPeer);
        if (peerId != MessageObject.getPeerId(u50Var.A0) && u50Var.a1.participants.f(peerId) != null) {
            u50Var.A0 = u50Var.a1.selfPeer;
        }
        int childCount = z40Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = z40Var.getChildAt(i17);
            s4.b1 G2 = z40Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = u50Var.q0;
        arrayList3.clear();
        if (!G3) {
            arrayList3.addAll(u50Var.a1.visibleVideoParticipants);
        } else if (k30Var3.b) {
            arrayList3.addAll(u50Var.a1.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = k30Var3.e;
            if (videoParticipant3 != null) {
                arrayList3.remove(videoParticipant3);
            }
        }
        if (z40Var.getItemAnimator() != null && !z10) {
            z40Var.setItemAnimator(null);
        } else if (z40Var.getItemAnimator() == null && z10) {
            z40Var.setItemAnimator(u50Var.X);
        }
        try {
            fVar = new f(o50Var2, 21);
            try {
                try {
                    z11 = true;
                } catch (Exception e) {
                    e = e;
                    o50Var = o50Var2;
                    z11 = true;
                }
            } catch (Exception e7) {
                e = e7;
                o50Var = o50Var2;
                z40Var2 = z40Var;
                z11 = true;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i16;
                k30Var = k30Var3;
            }
        } catch (Exception e10) {
            e = e10;
            o50Var = o50Var2;
            k30Var = k30Var3;
            z40Var2 = z40Var;
            z11 = true;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i16;
        }
        try {
            try {
                try {
                    i14 = i16;
                    try {
                        k30Var = k30Var3;
                    } catch (Exception e11) {
                        e = e11;
                        k30Var = k30Var3;
                    }
                } catch (Exception e12) {
                    e = e12;
                    i11 = i16;
                    k30Var = k30Var3;
                    z40Var2 = z40Var;
                    i10 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e13) {
                e = e13;
                o50Var = o50Var2;
                arrayList = arrayList3;
                i11 = i16;
                k30Var = k30Var3;
                z40Var2 = z40Var;
                i10 = childCount;
            }
        } catch (Exception e14) {
            e = e14;
            o50Var = o50Var2;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i16;
            k30Var = k30Var3;
            z40Var2 = z40Var;
            FileLog.e(e);
            o50Var.l();
            u50Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList4 = u50Var.D0;
            arrayList4.clear();
            arrayList4.addAll(u50Var.a1.visibleParticipants);
            ArrayList arrayList5 = u50Var.E0;
            arrayList5.clear();
            arrayList2 = arrayList;
            arrayList5.addAll(arrayList2);
            ArrayList arrayList6 = u50Var.F0;
            arrayList6.clear();
            arrayList6.addAll(u50Var.a1.invitedUsers);
            ArrayList arrayList7 = u50Var.G0;
            arrayList7.clear();
            arrayList7.addAll(u50Var.a1.shadyJoinParticipants);
            ArrayList arrayList8 = u50Var.H0;
            arrayList8.clear();
            arrayList8.addAll(u50Var.a1.shadyLeftParticipants);
            o50 o50Var3 = o50Var;
            u50Var.I0 = o50Var3.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            z40Var3 = z40Var2;
            boolean c10 = k30Var.c();
            k30Var2 = k30Var;
            if (k30Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.a30 a30Var = u50Var.p2;
            g30Var = u50Var.m2;
            a30Var.G(g30Var, z11);
            if (g30Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (z40Var3.getVisibility() == 0) {
            }
            r02 = u50Var.Z1;
            r02.clear();
            r02.addAll(u50Var.Y1);
            while (r82 < r02.size()) {
            }
            call = u50Var.a1;
            if (call != null) {
            }
            ChatObject.Call call2 = u50Var.a1;
            if (call2 != null) {
            }
            u50Var.C3.a(z13, z10);
            if (z13 == u50Var.I2) {
            }
        }
        try {
            z40Var2 = z40Var;
            try {
                try {
                    try {
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Exception e16) {
                    e = e16;
                    i10 = childCount;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                }
                try {
                    arrayList = arrayList3;
                    i11 = i14;
                    i10 = childCount;
                    u50Var = this;
                    o50Var = o50Var2;
                    try {
                        u50Var.D1(o50Var2.K, o50Var2.w, o50Var2.d, o50Var2.e, o50Var2.f, o50Var2.h, o50Var2.n, o50Var2.r, o50Var2.s, o50Var2.v, o50Var2.G, o50Var2.H, o50Var2.I, o50Var2.J, o50Var2.x, o50Var2.y);
                        o50Var.E();
                        z11 = true;
                        try {
                            s4.o.c(u50Var.w3, true).b(fVar);
                        } catch (Exception e17) {
                            e = e17;
                            FileLog.e(e);
                            o50Var.l();
                            u50Var.a1.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList42 = u50Var.D0;
                            arrayList42.clear();
                            arrayList42.addAll(u50Var.a1.visibleParticipants);
                            ArrayList arrayList52 = u50Var.E0;
                            arrayList52.clear();
                            arrayList2 = arrayList;
                            arrayList52.addAll(arrayList2);
                            ArrayList arrayList62 = u50Var.F0;
                            arrayList62.clear();
                            arrayList62.addAll(u50Var.a1.invitedUsers);
                            ArrayList arrayList72 = u50Var.G0;
                            arrayList72.clear();
                            arrayList72.addAll(u50Var.a1.shadyJoinParticipants);
                            ArrayList arrayList82 = u50Var.H0;
                            arrayList82.clear();
                            arrayList82.addAll(u50Var.a1.shadyLeftParticipants);
                            o50 o50Var32 = o50Var;
                            u50Var.I0 = o50Var32.F;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            z40Var3 = z40Var2;
                            boolean c102 = k30Var.c();
                            k30Var2 = k30Var;
                            if (k30Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.a30 a30Var2 = u50Var.p2;
                                g30Var = u50Var.m2;
                                a30Var2.G(g30Var, z11);
                                if (g30Var.getVisibility() == 0) {
                                }
                                if (G3) {
                                }
                                if (z40Var3.getVisibility() == 0) {
                                }
                                r02 = u50Var.Z1;
                                r02.clear();
                                r02.addAll(u50Var.Y1);
                                while (r82 < r02.size()) {
                                }
                                call = u50Var.a1;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = u50Var.a1;
                                if (call22 != null) {
                                }
                                u50Var.C3.a(z13, z10);
                                if (z13 == u50Var.I2) {
                                }
                            }
                            z12 = false;
                            org.telegram.ui.Components.a30 a30Var22 = u50Var.p2;
                            g30Var = u50Var.m2;
                            a30Var22.G(g30Var, z11);
                            if (g30Var.getVisibility() == 0) {
                            }
                            if (G3) {
                            }
                            if (z40Var3.getVisibility() == 0) {
                            }
                            r02 = u50Var.Z1;
                            r02.clear();
                            r02.addAll(u50Var.Y1);
                            while (r82 < r02.size()) {
                            }
                            call = u50Var.a1;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = u50Var.a1;
                            if (call222 != null) {
                            }
                            u50Var.C3.a(z13, z10);
                            if (z13 == u50Var.I2) {
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        z11 = true;
                    }
                } catch (Exception e19) {
                    e = e19;
                    u50Var = this;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                    i10 = childCount;
                    o50Var = o50Var2;
                    FileLog.e(e);
                    o50Var.l();
                    u50Var.a1.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList422 = u50Var.D0;
                    arrayList422.clear();
                    arrayList422.addAll(u50Var.a1.visibleParticipants);
                    ArrayList arrayList522 = u50Var.E0;
                    arrayList522.clear();
                    arrayList2 = arrayList;
                    arrayList522.addAll(arrayList2);
                    ArrayList arrayList622 = u50Var.F0;
                    arrayList622.clear();
                    arrayList622.addAll(u50Var.a1.invitedUsers);
                    ArrayList arrayList722 = u50Var.G0;
                    arrayList722.clear();
                    arrayList722.addAll(u50Var.a1.shadyJoinParticipants);
                    ArrayList arrayList822 = u50Var.H0;
                    arrayList822.clear();
                    arrayList822.addAll(u50Var.a1.shadyLeftParticipants);
                    o50 o50Var322 = o50Var;
                    u50Var.I0 = o50Var322.F;
                    i12 = i10;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    z40Var3 = z40Var2;
                    boolean c1022 = k30Var.c();
                    k30Var2 = k30Var;
                    if (k30Var2.b) {
                    }
                    z12 = false;
                    org.telegram.ui.Components.a30 a30Var222 = u50Var.p2;
                    g30Var = u50Var.m2;
                    a30Var222.G(g30Var, z11);
                    if (g30Var.getVisibility() == 0) {
                    }
                    if (G3) {
                    }
                    if (z40Var3.getVisibility() == 0) {
                    }
                    r02 = u50Var.Z1;
                    r02.clear();
                    r02.addAll(u50Var.Y1);
                    while (r82 < r02.size()) {
                    }
                    call = u50Var.a1;
                    if (call != null) {
                    }
                    ChatObject.Call call2222 = u50Var.a1;
                    if (call2222 != null) {
                    }
                    u50Var.C3.a(z13, z10);
                    if (z13 == u50Var.I2) {
                    }
                }
            } catch (Exception e20) {
                e = e20;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i14;
                o50Var = o50Var2;
                FileLog.e(e);
                o50Var.l();
                u50Var.a1.saveActiveDates();
                if (view != null) {
                }
                ArrayList arrayList4222 = u50Var.D0;
                arrayList4222.clear();
                arrayList4222.addAll(u50Var.a1.visibleParticipants);
                ArrayList arrayList5222 = u50Var.E0;
                arrayList5222.clear();
                arrayList2 = arrayList;
                arrayList5222.addAll(arrayList2);
                ArrayList arrayList6222 = u50Var.F0;
                arrayList6222.clear();
                arrayList6222.addAll(u50Var.a1.invitedUsers);
                ArrayList arrayList7222 = u50Var.G0;
                arrayList7222.clear();
                arrayList7222.addAll(u50Var.a1.shadyJoinParticipants);
                ArrayList arrayList8222 = u50Var.H0;
                arrayList8222.clear();
                arrayList8222.addAll(u50Var.a1.shadyLeftParticipants);
                o50 o50Var3222 = o50Var;
                u50Var.I0 = o50Var3222.F;
                i12 = i10;
                i13 = 0;
                while (i13 < i12) {
                }
                z40Var3 = z40Var2;
                boolean c10222 = k30Var.c();
                k30Var2 = k30Var;
                if (k30Var2.b) {
                }
                z12 = false;
                org.telegram.ui.Components.a30 a30Var2222 = u50Var.p2;
                g30Var = u50Var.m2;
                a30Var2222.G(g30Var, z11);
                if (g30Var.getVisibility() == 0) {
                }
                if (G3) {
                }
                if (z40Var3.getVisibility() == 0) {
                }
                r02 = u50Var.Z1;
                r02.clear();
                r02.addAll(u50Var.Y1);
                while (r82 < r02.size()) {
                }
                call = u50Var.a1;
                if (call != null) {
                }
                ChatObject.Call call22222 = u50Var.a1;
                if (call22222 != null) {
                }
                u50Var.C3.a(z13, z10);
                if (z13 == u50Var.I2) {
                }
            }
        } catch (Exception e21) {
            e = e21;
            z40Var2 = z40Var;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i14;
            o50Var = o50Var2;
            FileLog.e(e);
            o50Var.l();
            u50Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList42222 = u50Var.D0;
            arrayList42222.clear();
            arrayList42222.addAll(u50Var.a1.visibleParticipants);
            ArrayList arrayList52222 = u50Var.E0;
            arrayList52222.clear();
            arrayList2 = arrayList;
            arrayList52222.addAll(arrayList2);
            ArrayList arrayList62222 = u50Var.F0;
            arrayList62222.clear();
            arrayList62222.addAll(u50Var.a1.invitedUsers);
            ArrayList arrayList72222 = u50Var.G0;
            arrayList72222.clear();
            arrayList72222.addAll(u50Var.a1.shadyJoinParticipants);
            ArrayList arrayList82222 = u50Var.H0;
            arrayList82222.clear();
            arrayList82222.addAll(u50Var.a1.shadyLeftParticipants);
            o50 o50Var32222 = o50Var;
            u50Var.I0 = o50Var32222.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            z40Var3 = z40Var2;
            boolean c102222 = k30Var.c();
            k30Var2 = k30Var;
            if (k30Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.a30 a30Var22222 = u50Var.p2;
            g30Var = u50Var.m2;
            a30Var22222.G(g30Var, z11);
            if (g30Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (z40Var3.getVisibility() == 0) {
            }
            r02 = u50Var.Z1;
            r02.clear();
            r02.addAll(u50Var.Y1);
            while (r82 < r02.size()) {
            }
            call = u50Var.a1;
            if (call != null) {
            }
            ChatObject.Call call222222 = u50Var.a1;
            if (call222222 != null) {
            }
            u50Var.C3.a(z13, z10);
            if (z13 == u50Var.I2) {
            }
        }
        u50Var.a1.saveActiveDates();
        if (view != null) {
            u50Var.Y.h1(i11, view.getTop() - z40Var2.getPaddingTop());
        }
        ArrayList arrayList422222 = u50Var.D0;
        arrayList422222.clear();
        arrayList422222.addAll(u50Var.a1.visibleParticipants);
        ArrayList arrayList522222 = u50Var.E0;
        arrayList522222.clear();
        arrayList2 = arrayList;
        arrayList522222.addAll(arrayList2);
        ArrayList arrayList622222 = u50Var.F0;
        arrayList622222.clear();
        arrayList622222.addAll(u50Var.a1.invitedUsers);
        ArrayList arrayList722222 = u50Var.G0;
        arrayList722222.clear();
        arrayList722222.addAll(u50Var.a1.shadyJoinParticipants);
        ArrayList arrayList822222 = u50Var.H0;
        arrayList822222.clear();
        arrayList822222.addAll(u50Var.a1.shadyLeftParticipants);
        o50 o50Var322222 = o50Var;
        u50Var.I0 = o50Var322222.F;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            z40 z40Var4 = z40Var2;
            View childAt2 = z40Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.d4) || (childAt2 instanceof org.telegram.ui.Cells.v3)) && (G = z40Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) childAt2).setDrawDivider(G.b() != o50Var322222.F + (-2) ? z11 : false);
                } else {
                    ((org.telegram.ui.Cells.v3) childAt2).setDrawDivider(G.b() != o50Var322222.F + (-2) ? z11 : false);
                }
            }
            i13++;
            z40Var2 = z40Var4;
        }
        z40Var3 = z40Var2;
        boolean c1022222 = k30Var.c();
        k30Var2 = k30Var;
        if (k30Var2.b && (videoParticipant2 = k30Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, u50Var.a1)) {
            if (!arrayList2.isEmpty()) {
                z12 = false;
                u50Var.e1(null);
            } else if (c1022222) {
                z12 = false;
                u50Var.e1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.a30 a30Var222222 = u50Var.p2;
            g30Var = u50Var.m2;
            a30Var222222.G(g30Var, z11);
            if (g30Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(g30Var);
            }
            if (G3) {
                u50Var.o2.I(u50Var.n2, z11);
            }
            if (z40Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(z40Var3);
            }
            r02 = u50Var.Z1;
            r02.clear();
            r02.addAll(u50Var.Y1);
            for (r82 = z12; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.t) r02.get(r82)).j(z11);
            }
            call = u50Var.a1;
            if (call != null && k30Var2.b && (videoParticipant = k30Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call2222222 = u50Var.a1;
            z13 = (call2222222 != null || call2222222.visibleVideoParticipants.isEmpty()) ? z12 : z11;
            u50Var.C3.a(z13, z10);
            if (z13 == u50Var.I2) {
                u50Var.I2 = z13;
                if (G3) {
                    u50Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z12 = false;
        org.telegram.ui.Components.a30 a30Var2222222 = u50Var.p2;
        g30Var = u50Var.m2;
        a30Var2222222.G(g30Var, z11);
        if (g30Var.getVisibility() == 0) {
        }
        if (G3) {
        }
        if (z40Var3.getVisibility() == 0) {
        }
        r02 = u50Var.Z1;
        r02.clear();
        r02.addAll(u50Var.Y1);
        while (r82 < r02.size()) {
        }
        call = u50Var.a1;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call22222222 = u50Var.a1;
        if (call22222222 != null) {
        }
        u50Var.C3.a(z13, z10);
        if (z13 == u50Var.I2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(boolean z10, boolean z11) {
        long j10;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11;
        boolean z17;
        int i12;
        boolean z18;
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.t2 t2Var2;
        org.telegram.ui.Components.voip.t2 t2Var3;
        boolean z19;
        boolean r12;
        int i13;
        ChatObject.Call call = this.a1;
        org.telegram.ui.Components.voip.t2 t2Var4 = this.s;
        int i14 = 6;
        if (call == null || call.isScheduled()) {
            if (Q0()) {
                i14 = 5;
            } else if (this.a1.call.schedule_start_subscribed) {
                i14 = 7;
            }
            K1(i14, z10);
            t2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            M1(false);
            return;
        }
        I1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j10 = 0;
        } else {
            j10 = 0;
            if ((this.t0 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.t0) > 3000) && ((i13 = this.T1) == 1 || i13 == 2 || i13 == 6 || i13 == 5)) {
                R0();
                K1(3, z10);
                i10 = 4;
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0();
                if (!((z13 && this.a1.canRecordVideo()) || z12) || r1()) {
                    z14 = false;
                    z15 = true;
                } else {
                    z15 = false;
                    z14 = true;
                }
                if (z12) {
                    z16 = !z13;
                    i11 = 0;
                } else {
                    z16 = false;
                    i11 = 1;
                }
                if (F3) {
                    z17 = z16;
                    i12 = i11;
                } else {
                    z17 = false;
                    i12 = 0;
                }
                int i15 = i12 + (!z15 ? 2 : 0) + (!z14 ? i10 : 0);
                k30 k30Var = this.a2;
                int i16 = i15 + ((k30Var == null && k30Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.o0 | 2) == (i16 | 2);
                this.o0 = i16;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.t2 t2Var5 = this.n;
                if (z14) {
                    t2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z20, z10);
                    t2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.t2 t2Var6 = this.f;
                if (i12 != 0) {
                    t2Var6.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                    t2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.t2 t2Var7 = this.h;
                if (z17) {
                    t2Var = t2Var6;
                    t2Var2 = t2Var5;
                    t2Var3 = t2Var7;
                    z19 = z10;
                } else {
                    h1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i17 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.a0 != i17) {
                        this.a0 = i17;
                        AndroidUtilities.updateImageViewImageAnimated(this.b0, i17);
                    }
                    t2Var2 = t2Var5;
                    t2Var = t2Var6;
                    t2Var7.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    t2Var3 = t2Var7;
                    z19 = z10;
                    t2Var3.b(h1() != 1, z19);
                }
                org.telegram.ui.Components.voip.t2 t2Var8 = t2Var3;
                t2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z18 && z15) {
                    N1(false);
                }
                t2Var2.d(true, z19);
                t2Var.d(true, z19);
                t2Var8.d(true, z19);
                r12 = r1();
                e30 e30Var = this.f1;
                if (r12) {
                    e30Var.setVisibility(8);
                } else {
                    e30Var.setVisibility(0);
                    boolean z21 = ((Integer) e30Var.getTag()).intValue() == 3;
                    int i18 = this.T1;
                    final boolean z22 = i18 == 3;
                    e30Var.setTag(Integer.valueOf(i18));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.h1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.g1;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i19 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.h1 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.k20
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i19, floatValue, 1.0f);
                                    u50 u50Var = u50.this;
                                    u50Var.g1.setColor(offsetColor);
                                    u50Var.f1.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    u50Var.i1 = floatValue;
                                    j50 j50Var = u50Var.U0;
                                    if (j50Var == null || !u50Var.z2) {
                                        return;
                                    }
                                    j50Var.invalidate();
                                }
                            });
                            this.h1.setDuration(300L);
                            this.h1.setInterpolator(org.telegram.ui.Components.bs.f);
                            this.h1.addListener(new m40(this, 2));
                            this.h1.start();
                        } else {
                            paint.setColor(this.T1 == 3 ? -1163700 : -12761513);
                            e30Var.invalidate();
                        }
                    }
                }
                if (r1() || !LiteMode.isEnabled(512)) {
                }
                if (this.T1 == 3) {
                    this.z2 = true;
                    z1();
                    return;
                } else {
                    this.z2 = false;
                    AndroidUtilities.cancelRunOnUIThread(this.A2);
                    return;
                }
            }
        }
        if (this.B0 != null) {
            k1().k(0L, 37, this.B0, this.Z0, null, null);
            this.B0 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || Q0()) {
            i10 = 4;
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                R0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                K1(0, z10);
            } else {
                K1(1, z10);
            }
        } else {
            R0();
            if (groupCallParticipant2.raise_hand_rating != j10) {
                i10 = 4;
                K1(4, z10);
            } else {
                i10 = 4;
                K1(2, z10);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        if (groupCallParticipant3 == null) {
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
        }
        if (F3) {
        }
        int i152 = i12 + (!z15 ? 2 : 0) + (!z14 ? i10 : 0);
        k30 k30Var2 = this.a2;
        int i162 = i152 + ((k30Var2 == null && k30Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.o0 | 2) == (i162 | 2)) {
        }
        this.o0 = i162;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.t2 t2Var52 = this.n;
        if (z14) {
        }
        org.telegram.ui.Components.voip.t2 t2Var62 = this.f;
        if (i12 != 0) {
        }
        org.telegram.ui.Components.voip.t2 t2Var72 = this.h;
        if (z17) {
        }
        org.telegram.ui.Components.voip.t2 t2Var82 = t2Var3;
        t2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            N1(false);
        }
        t2Var2.d(true, z19);
        t2Var.d(true, z19);
        t2Var82.d(true, z19);
        r12 = r1();
        e30 e30Var2 = this.f1;
        if (r12) {
        }
        if (r1()) {
        }
    }

    public final int P0() {
        z40 z40Var = this.Q;
        int childCount = z40Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = z40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1() {
        boolean z10;
        s50 s50Var;
        p40 p40Var = this.O;
        if (p40Var == null || this.a1 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.a1.currentSpeakingPeers.m(); i11++) {
            long j10 = this.a1.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.currentSpeakingPeers.f(j10);
            if (!groupCallParticipant.self) {
                k30 k30Var = this.a2;
                k30Var.getClass();
                if (k30Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i10 < 2) {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            if (i10 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.j61(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.j61(AndroidUtilities.bold()), 0);
                            }
                        }
                    }
                    i10++;
                    if (i10 == 2) {
                        break;
                    }
                }
            }
        }
        if (i10 > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i10);
            int indexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            p40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.n5 subtitleTextView = p40Var.getSubtitleTextView();
        String str = r1() ? "ViewersWatching" : "Participants";
        int i12 = this.a1.call.participants_count;
        o50 o50Var = this.P;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((o50Var.M.r1() || o50Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (r1() && (s50Var = this.B1) != null) {
            s50Var.setWatchersCount(this.a1.call.participants_count);
        }
        if (z10 != this.u2) {
            this.u2 = z10;
            p40Var.invalidate();
            p40Var.getSubtitleTextView().setPivotX(0.0f);
            p40Var.getSubtitleTextView().setPivotY(p40Var.getMeasuredHeight() >> 1);
            p40Var.getSubtitleTextView().animate().scaleX(this.u2 ? 0.98f : 1.0f).scaleY(this.u2 ? 0.9f : 1.0f).alpha(this.u2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(p40Var.getAdditionalSubtitleTextView(), this.u2);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.Z0);
        }
        ChatObject.Call call = this.a1;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.a1;
        c30 c30Var = this.e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                c30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                c30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        p40 p40Var = this.O;
        if (isEmpty) {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(p40Var.getTitle())) {
                if (z10) {
                    this.O.I(this.Z0.title, true, 180L, null);
                    p40Var.getTitleTextView().setOnClickListener(new d20(this, 9));
                } else {
                    p40Var.setTitle(this.Z0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.Z0)) {
                    c30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (r1()) {
                    c30Var.b(this.Z0.title, z10);
                } else {
                    c30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                p40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                c30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.a1.call.title.equals(p40Var.getTitle())) {
            if (z10) {
                this.O.I(this.a1.call.title, true, 180L, null);
                p40Var.getTitleTextView().setOnClickListener(new d20(this, 8));
            } else {
                p40Var.setTitle(this.a1.call.title);
            }
            c30Var.b(this.a1.call.title, z10);
        }
        org.telegram.ui.ActionBar.n5 titleTextView = p40Var.getTitleTextView();
        if (!this.a1.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                c30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                c30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new q50(titleTextView));
            TextView textView = c30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new q50(textView), (Drawable) null);
            TextView nextTextView = c30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new q50(nextTextView), (Drawable) null);
        }
    }

    public final void R0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void R1() {
        float f7;
        org.telegram.ui.Components.ub ubVar;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r0) * f7);
        } else {
            f7 = 0.0f;
        }
        this.topBulletinContainer.setTranslationY(AndroidUtilities.lerp(((-r0.getTop()) - this.topBulletinContainer.getHeight()) + f10 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), this.O.getY() + (-this.topBulletinContainer.getTop()) + r4.getHeight(), f7));
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar == null || (ubVar = qcVar.e) == null || ubVar.getParent() == null || ubVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        ubVar.setTop(f7 > 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0() {
        boolean z10;
        if (!this.c3) {
            p30 p30Var = this.b2;
            if (p30Var.getVisibility() == 0 && p30Var.getAlpha() == 1.0f) {
                z10 = true;
                if (this.l2 == z10) {
                    this.l2 = z10;
                    this.e.invalidate();
                    this.containerView.invalidate();
                    this.Q.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.l2 == z10) {
        }
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.z3.e);
        U0();
        V0();
    }

    public final void U0() {
        float f7 = this.C1.b.a;
        int i10 = f7 > 0.0f ? 0 : 8;
        v30 v30Var = this.F;
        v30Var.setAlpha(f7);
        u30 u30Var = this.G;
        u30Var.setAlpha(f7);
        if (v30Var.getVisibility() != i10) {
            v30Var.setVisibility(i10);
            u30Var.setVisibility(i10);
            if (i10 == 8) {
                s30 s30Var = this.H;
                if (s30Var.isFocused()) {
                    s30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        org.telegram.ui.Components.gl0 gl0Var = this.K;
        if (gl0Var != null) {
            float f7 = this.C1.b.a * this.A3.e;
            gl0Var.setAlpha(f7);
            int i10 = f7 > 0.0f ? 0 : 8;
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.gl0 gl0Var2 = this.K;
            if (gl0Var2.N0 || f7 != 1.0f) {
                return;
            }
            gl0Var2.N0 = true;
        }
    }

    public final void W0() {
        boolean z10 = G3;
        x20 x20Var = this.e;
        if (z10) {
            x20Var.setTranslationX(0.0f);
            x20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.z3;
        if (z11) {
            x20Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            x20Var.setTranslationY(0.0f);
        } else {
            x20Var.setTranslationX(0.0f);
            x20Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void X0() {
        boolean z10 = G3;
        g30 g30Var = this.m2;
        if (z10) {
            g30Var.setTranslationX(0.0f);
            g30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.z3;
        if (z11) {
            g30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            g30Var.setTranslationY(0.0f);
        } else {
            g30Var.setTranslationX(0.0f);
            g30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        float f7 = this.B3.e;
        qh.i iVar = this.C1;
        float lerp = AndroidUtilities.lerp(G3 ? (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f) : F3 ? 0.0f : ((this.z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.c)) - AndroidUtilities.dp(91.0f), -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        mh.h hVar = this.c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        float f7 = this.A3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f7);
        ImageView imageView = this.J;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f7));
        imageView.setAlpha(f7);
        imageView.setClickable(f7 > 0.9f);
        float f10 = 1.0f - f7;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView2 = this.I;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        imageView2.setClickable(f10 > 0.9f);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.z20 z20Var = this.a3;
        if (z20Var != null) {
            z20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.a3 = null;
        this.Z2 = null;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.b;
    }

    public final void d1(boolean z10) {
        if (this.c3 || !this.f2) {
            return;
        }
        if (z10) {
            this.c3 = true;
            y1(false, this.X2);
            return;
        }
        b1();
        this.containerView.removeView(this.e2);
        this.e2 = null;
        this.C2.setVisibility(8);
        this.containerView.invalidate();
        this.f2 = false;
        this.Y.X = true;
        this.Q.invalidate();
        this.b2.setVisibility(8);
        if (this.s0) {
            this.s0 = false;
            O0(true);
        }
        S0();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        VoIPService sharedInstance;
        int i12;
        int i13;
        int i14 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        z40 z40Var = this.Q;
        int i15 = 0;
        if (i10 == i14) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.a1;
            if (call == null || call.call.id != l4.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.a1;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j10 = this.t0;
            AccountInstance accountInstance = this.d;
            if (j10 == 0 && (((i13 = this.F1) == 7 || i13 == 5 || i13 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.i0, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", i1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.b1);
                    intent.putExtra("peerChannelId", this.Y0.channel_id);
                    intent.putExtra("peerChatId", this.Y0.chat_id);
                    intent.putExtra("peerUserId", this.Y0.user_id);
                    intent.putExtra("hash", this.c1);
                    intent.putExtra("peerAccessHash", this.Y0.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.k2);
                    this.i0.startService(intent);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                this.t0 = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new f20(this, 2), 3000L);
            }
            if (!this.u0 && VoIPService.getSharedInstance() != null) {
                this.a1.addSelfDummyParticipant(false);
                l1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            J1();
            int childCount = z40Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = z40Var.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                }
            }
            if (this.X2 != null) {
                this.s0 = true;
            } else {
                O0(true);
            }
            P1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.F1 == 4;
            O1(true, booleanValue);
            Q1(true);
            if (z10 && ((i12 = this.F1) == 1 || i12 == 0)) {
                k1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l10 = (Long) objArr[3];
                long longValue = l10.longValue();
                if (longValue == 0 || r1()) {
                    return;
                }
                if (o1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        int size = allDialogs.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size) {
                                break;
                            }
                            TLRPC.Dialog dialog = allDialogs.get(i17);
                            i17++;
                            if (dialog.id == longValue) {
                                i15 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = accountInstance.getMessagesController().getUser(l10);
                    if (user != null) {
                        if (this.a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i15 != 0) {
                            k1().k(0L, 44, user, this.Z0, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i15 != 0) {
                        k1().k(0L, 44, chat, this.Z0, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            k30 k30Var = this.a2;
            if (k30Var.b && this.a1 != null) {
                boolean c10 = k30Var.c();
                ChatObject.Call call3 = this.a1;
                if (call3 != null && k30Var.b && (videoParticipant = k30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i18 = 0;
                    while (true) {
                        ArrayList arrayList = this.q0;
                        if (i18 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i18);
                        if (this.a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && k30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i18++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            k30Var.setVisibleParticipant(true);
            P1();
            return;
        }
        if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.Z0) ? LocaleController.getString(R.string.VoipChannelTooMuch) : LocaleController.getString(R.string.VoipGroupTooMuch);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.Z0) ? LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin) : LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                }
                AlertDialog$Builder N = org.telegram.ui.Components.f5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new j20(this, 1));
                try {
                    N.p();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == i1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.a1;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            O0(true);
            AndroidUtilities.updateVisibleRows(z40Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt2 = this.E2.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.e1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.e1) childAt2).j(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                J1();
                O1(isShowing(), false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = z40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                s4.b1 G = z40Var.G(z40Var.getChildAt(i15));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                        if (d4Var.getParticipant() != null) {
                            d4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i15++;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.a1 == null || peerId2 != l11.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            O0(true);
            AndroidUtilities.updateVisibleRows(z40Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt3 = this.E2.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.e1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.e1) childAt3).j(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(z40Var);
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(z40Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            e40 e40Var = this.z0;
            if (e40Var != null) {
                e40Var.b(true, true);
            }
            J1();
            return;
        }
        if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            f50 f50Var = this.p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            f50Var.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        LaunchActivity launchActivity = this.i0;
        launchActivity.b1.remove(this.v2);
        this.i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.a40 a40Var = this.E1;
        if (a40Var != null) {
            a40Var.dismiss();
        }
        this.s0 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        AccountInstance accountInstance = this.d;
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        k30 k30Var = this.a2;
        if (k30Var != null) {
            if (this.q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                k30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (k30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(k30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (D3 == this) {
            D3 = null;
        }
        E3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.i30.j(getContext());
        ChatObject.Call call = this.a1;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.i0.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                k1().j(z10 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            k30 k30Var = this.a2;
            if (k30Var.r != null) {
                return;
            }
            boolean z10 = G3;
            z40 z40Var = this.Q;
            int i10 = 0;
            if (!z10) {
                if (this.q2 != null) {
                    z40Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                    this.q2 = null;
                }
                if (videoParticipant == null) {
                    if (z40Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = z40Var.getViewTreeObserver();
                        l40 l40Var = new l40(this);
                        this.q2 = l40Var;
                        viewTreeObserver.addOnPreDrawListener(l40Var);
                        return;
                    }
                    z40Var.setVisibility(0);
                    O0(false);
                    this.s0 = true;
                    ViewTreeObserver viewTreeObserver2 = z40Var.getViewTreeObserver();
                    k40 k40Var = new k40(this);
                    this.q2 = k40Var;
                    viewTreeObserver2.addOnPreDrawListener(k40Var);
                    return;
                }
                g30 g30Var = this.m2;
                if (g30Var.getVisibility() == 0) {
                    k30Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(g30Var);
                    return;
                }
                g30Var.setVisibility(0);
                org.telegram.ui.Components.a30 a30Var = this.p2;
                a30Var.G(g30Var, false);
                this.s0 = true;
                if (!k30Var.b) {
                    ArrayList arrayList = a30Var.e;
                    s4.b0 b0Var = (s4.b0) g30Var.getLayoutManager();
                    if (b0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                b0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = z40Var.getViewTreeObserver();
                j40 j40Var = new j40(this, videoParticipant);
                this.q2 = j40Var;
                viewTreeObserver3.addOnPreDrawListener(j40Var);
                return;
            }
            if (this.q2 != null) {
                z40Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            a60 a60Var = this.o2;
            ArrayList arrayList3 = this.Y1;
            ArrayList arrayList4 = this.Z1;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList4.get(i11);
                    org.telegram.ui.Components.voip.l lVar = tVar.c;
                    if (lVar != null) {
                        lVar.setRenderer(null);
                        org.telegram.ui.Components.z20 z20Var = tVar.d;
                        if (z20Var != null) {
                            z20Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(tVar.w);
                        tVar.b(false);
                        tVar.animate().alpha(0.0f).setListener(new f40(this, tVar));
                    }
                }
                this.P2 = false;
                a60Var.H(this.n2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList4.get(i12);
                    if (tVar2.e != null && ((videoParticipant2 = tVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(tVar2.w);
                        tVar2.b(false);
                        org.telegram.ui.Components.z20 z20Var2 = tVar2.d;
                        if (z20Var2 != null) {
                            z20Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = tVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        tVar2.animate().alpha(0.0f).setListener(new g40(this, tVar2));
                    }
                }
                this.P2 = true;
                a60Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new ot(20, this, arrayList2));
                }
            }
            boolean z11 = !k30Var.b;
            ViewTreeObserver viewTreeObserver4 = z40Var.getViewTreeObserver();
            i40 i40Var = new i40(this, videoParticipant, z11);
            this.q2 = i40Var;
            viewTreeObserver4.addOnPreDrawListener(i40Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.y3;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute != 0) {
            return currentAudioRoute != 1 ? 2 : 0;
        }
        return 1;
    }

    public final long i1() {
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void j1(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat == null || ChatObject.isPublic(chat)) {
            if (this.a1 == null) {
                return;
            }
            int i10 = 0;
            while (i10 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.a1.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i10 == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.l0(this, i10, z10, 1));
                i10++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
        String publicUsername = ChatObject.getPublicUsername(this.Z0);
        String q6 = !TextUtils.isEmpty(publicUsername) ? a1.g.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(q6)) {
            u1(null, q6, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ai.w9(this, chatFull, z10, 6));
    }

    public final UndoView k1() {
        if (!G3) {
            k30 k30Var = this.a2;
            if (k30Var.b) {
                return k30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.j0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l1() {
        VoIPService sharedInstance;
        if (this.u0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.u0 = true;
        this.D0.addAll(this.a1.visibleParticipants);
        this.E0.addAll(this.q0);
        this.F0.addAll(this.a1.invitedUsers);
        this.G0.addAll(this.a1.shadyJoinParticipants);
        this.H0.addAll(this.a1.shadyLeftParticipants);
        this.T1 = sharedInstance.getCallState();
        if (this.a1 == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.a1 = call;
            this.p2.c = call;
            this.a2.setGroupCall(call);
            this.o2.c = this.a1;
        }
        int i10 = 0;
        mh.h hVar = this.c0;
        if (hVar != null) {
            hVar.C0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.a1.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        y40 y40Var = this.V;
        if (y40Var == null || y40Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        N1(true);
        this.w1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        z40 z40Var = this.Q;
        z40Var.setVisibility(0);
        org.telegram.ui.ActionBar.u0 u0Var = this.l1;
        u0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z40Var, (Property<z40, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z40Var, (Property<z40, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y40Var, (Property<y40, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(y40Var, (Property<y40, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(y40Var, (Property<y40, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.n5 n5Var = this.U;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.W;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(n5Var2, (Property<org.telegram.ui.ActionBar.n5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(n5Var2, (Property<org.telegram.ui.ActionBar.n5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(n5Var2, (Property<org.telegram.ui.ActionBar.n5, Float>) property, 0.0f), ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.bs.g);
        animatorSet.addListener(new m40(this, i10));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                int i10 = 3;
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.p20
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        u50 u50Var = u50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new ai.m(u50Var, c2VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        u50Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new ai.c3(u50Var, j11, c2VarArr2, user, 20));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c41(this, c2VarArr, sendRequest, i10), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        int dp = AndroidUtilities.dp(74.0f);
        float f7 = this.y0 - dp;
        return (((((float) this.backgroundPaddingTop) + f7) > ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f7) == ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - f7) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.z3.e;
            x20 x20Var = this.e;
            x20Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.m2.invalidate();
            this.containerView.invalidate();
            x20Var.invalidate();
        }
        if (i10 == 3) {
            Z0();
            Y0();
            a1();
            V0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Y0();
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final boolean o1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        N1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        z40 z40Var = this.Q;
        if (z40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(z40Var);
        }
        g30 g30Var = this.m2;
        if (g30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(g30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        e40 e40Var = this.z0;
        if (e40Var != null) {
            e40Var.b(false, false);
            return;
        }
        if (this.f2) {
            d1(true);
        } else if (this.a2.b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        e40 e40Var = this.z0;
        if (e40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        e40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.i0;
        launchActivity.b1.add(this.v2);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.i30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.t0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.t0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        O1(isShowing(), false);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.e0;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Og, false));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.k1;
            if (u0Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.hg;
                u0Var.G(org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
                u0Var.G(org.telegram.ui.ActionBar.k6.x0(null, i10, false), true);
                u0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eg, false));
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hg, false);
            F1(this.x1, x02);
            F1(this.y1, x02);
            F1(this.p1, x02);
            F1(this.q1, x02);
            F1(this.w1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.vg, false));
            F1(this.n1, x02);
            F1(this.o1, x02);
            F1(this.r1, x02);
            F1(this.s1, x02);
            F1(this.t1, x02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final boolean q1() {
        return r1() && !this.a1.visibleVideoParticipants.isEmpty() && (this.a1.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.a1.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean r1() {
        ChatObject.Call call = this.a1;
        return call != null && call.call.rtmp_stream;
    }

    public final void s1(org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.w0) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
        if (o2Var instanceof sn) {
            boolean U9 = ((sn) o2Var).U9();
            this.w0 = true;
            this.x0 = true;
            AndroidUtilities.runOnUIThread(new ai.x9(h3Var, editTextBoldCursor, z10, c2Var, 21), U9 ? 200L : 0L);
            return;
        }
        this.w0 = true;
        this.x0 = true;
        if (h3Var != null) {
            h3Var.setFocusable(true);
        } else if (c2Var != null) {
            c2Var.l(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ah(editTextBoldCursor, 2), 100L);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u1(String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        String str3;
        String str4;
        String str5;
        if (r1() && str != null) {
            str2 = null;
        }
        if (z11) {
            if (str == null) {
                str = str2;
            }
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                k1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.i0;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof sn) {
                z12 = ((sn) o2Var).U9();
                this.x0 = true;
                this.w0 = true;
                if (str == null && str2 == null) {
                    str4 = str;
                    str3 = null;
                } else {
                    str3 = str;
                    str4 = str2;
                }
                if (str3 == null || !z10) {
                    str5 = str4;
                } else {
                    str5 = ChatObject.isChannelOrGiga(this.Z0) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
                }
                n40 n40Var = new n40(this, getContext(), str5, str3, str4, str3);
                this.r0 = n40Var;
                n40Var.t0 = new f(this, 20);
                n40Var.setOnDismissListener(new j20(this, 3));
                AndroidUtilities.runOnUIThread(new f20(this, 7), !z12 ? 200L : 0L);
            }
        }
        z12 = false;
        if (str == null) {
        }
        str3 = str;
        str4 = str2;
        if (str3 == null) {
        }
        str5 = str4;
        n40 n40Var2 = new n40(this, getContext(), str5, str3, str4, str3);
        this.r0 = n40Var2;
        n40Var2.t0 = new f(this, 20);
        n40Var2.setOnDismissListener(new j20(this, 3));
        AndroidUtilities.runOnUIThread(new f20(this, 7), !z12 ? 200L : 0L);
    }

    public final void v1() {
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
        c2Var.r(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.a1.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ca(this, c2Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        boolean z10;
        String str;
        TextView textView;
        int i11;
        String str2;
        String str3;
        EditText editText;
        AlertDialog$Builder alertDialog$Builder;
        float f7;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLObject user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
        int i12 = 9;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            if (i10 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(user, Boolean.TRUE, null, null, null, null);
                k1().k(0L, 30, user, null, null, null);
                return;
            }
            ?? alertDialog$Builder2 = new AlertDialog$Builder(getContext());
            int i13 = org.telegram.ui.ActionBar.k6.pg;
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.a;
            c2Var.I = i13;
            TextView textView2 = new TextView(getContext());
            int i14 = org.telegram.ui.ActionBar.k6.hg;
            org.telegram.ui.ActionBar.r6.W(textView2, i14, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            ?? frameLayout = new FrameLayout(getContext());
            alertDialog$Builder2.o(frameLayout);
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
            h9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            h9Var.j(this.currentAccount, user);
            boolean z11 = user instanceof TLRPC.User;
            if (z11) {
                z10 = 0;
                TLRPC.User user2 = (TLRPC.User) user;
                w9Var.e(user2, h9Var);
                str = UserObject.getFirstName(user2);
            } else {
                z10 = 0;
                TLRPC.Chat chat = (TLRPC.Chat) user;
                w9Var.e(chat, h9Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            org.telegram.messenger.v0.q(textView3, i14, null, 1, 20.0f);
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.Z0;
            String str4 = chat2 != null ? chat2.title : "";
            if (i10 != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                int i15 = R.string.VoipGroupAddMemberText;
                Object[] objArr = new Object[2];
                objArr[z10] = str;
                objArr[1] = str4;
                org.telegram.messenger.sl.r(i15, objArr, textView2);
            } else if (o1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                int i16 = R.string.VoipConferenceRemoveMemberAlertText2;
                Object[] objArr2 = new Object[1];
                objArr2[z10] = str;
                org.telegram.messenger.sl.r(i16, objArr2, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    int i17 = R.string.VoipChannelRemoveMemberAlertText2;
                    Object[] objArr3 = new Object[2];
                    objArr3[z10] = str;
                    objArr3[1] = str4;
                    org.telegram.messenger.sl.r(i17, objArr3, textView2);
                } else {
                    int i18 = R.string.VoipGroupRemoveMemberAlertText2;
                    Object[] objArr4 = new Object[2];
                    objArr4[z10] = str;
                    objArr4[1] = str4;
                    org.telegram.messenger.sl.r(i18, objArr4, textView2);
                }
            }
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(textView3, w7.z5.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 76, 11.0f, z12 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i10 == 2) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupUserRemove), new ks(i12, this, user));
            } else if (z11) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupAdd), new ai.f(this, (TLRPC.User) user, j10, 6));
            }
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ug, z10));
            c2Var.show();
            if (i10 != 2 || (textView = (TextView) c2Var.d(-1)) == null) {
                return;
            }
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.vg, null);
            return;
        }
        if (i10 == 6) {
            this.i0.P0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.i0.u0(new sn(bundle));
            dismiss();
            return;
        }
        int i19 = 8;
        if (i10 == 8) {
            this.i0.P0(this.currentAccount);
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if ((o2Var instanceof sn) && ((sn) o2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.i0.u0(new sn(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            K1(2, true);
            return;
        }
        if (i10 == 9) {
            org.telegram.ui.Components.e50 e50Var = this.h2;
            if (e50Var == null || !e50Var.g()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.e50 e50Var2 = new org.telegram.ui.Components.e50(0, true, true);
                this.h2 = e50Var2;
                e50Var2.H = true;
                e50Var2.R = true;
                e50Var2.G = true;
                e50Var2.J = true;
                e50Var2.S = true;
                e50Var2.a = this.i0.O().getLastFragment();
                org.telegram.ui.Components.e50 e50Var3 = this.h2;
                b50 b50Var = new b50(this, j10);
                this.i2 = b50Var;
                e50Var3.b = b50Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                e50Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new f20(this, i12), new ei.e1(5), 0);
                return;
            }
            return;
        }
        if (i10 == 10) {
            String str5 = groupCallParticipant.about;
            Context context = getContext();
            int i20 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.f5.a;
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context);
            String string = LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
            final org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder3.a;
            c2Var2.R = string;
            c2Var2.T = LocaleController.getString(j10 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setClipChildren(false);
            if (j10 < 0) {
                alertDialog$Builder = alertDialog$Builder3;
                f7 = 8.0f;
                long j11 = -j10;
                if (MessagesController.getInstance(i20).getChatFull(j11) == null) {
                    MessagesController.getInstance(i20).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                }
            } else {
                alertDialog$Builder = alertDialog$Builder3;
                f7 = 8.0f;
            }
            NumberTextView numberTextView = new NumberTextView(context);
            EditText editText2 = new EditText(context);
            int i21 = org.telegram.ui.ActionBar.k6.hg;
            org.telegram.ui.ActionBar.r6.W(editText2, i21, null);
            editText2.setHint(LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
            editText2.setTextSize(1, 16.0f);
            editText2.setBackground(org.telegram.ui.ActionBar.k6.T(context));
            editText2.setMaxLines(4);
            editText2.setRawInputType(147457);
            editText2.setImeOptions(6);
            int i22 = j10 > 0 ? 70 : 255;
            editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.o3(i22, context, numberTextView)});
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false));
            numberTextView.setImportantForAccessibility(2);
            frameLayout2.addView(numberTextView, w7.z5.d(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
            editText2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
            editText2.addTextChangedListener(new org.telegram.ui.Components.tq(i22, numberTextView));
            AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
            editText2.setText(str5);
            editText2.setSelection(editText2.getText().toString().length());
            AlertDialog$Builder alertDialog$Builder4 = alertDialog$Builder;
            alertDialog$Builder4.o(frameLayout2);
            final j2.c cVar = new j2.c(j10, i20, editText2, 4);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Save), cVar);
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            c2Var2.N = new org.telegram.ui.Components.q1(editText2, 1);
            frameLayout2.addView(editText2, w7.z5.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText2.requestFocus();
            AndroidUtilities.showKeyboard(editText2);
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.s1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i23, KeyEvent keyEvent) {
                    if (i23 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.c2 c2Var3 = c2Var2;
                        if (c2Var3.isShowing()) {
                            cVar.g(c2Var3, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            c2Var2.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ug, false));
            c2Var2.show();
            c2Var2.p(org.telegram.ui.ActionBar.k6.x0(null, i21, false));
            return;
        }
        if (i10 != 11) {
            if (i10 == 5) {
                sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
                k1().m(0L, user, 35);
                sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                return;
            }
            if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                i11 = 1;
                sharedInstance.editCallMember(user, Boolean.FALSE, null, null, null, null);
            } else {
                groupCallParticipant.volume = 10000;
                groupCallParticipant.volume_by_admin = false;
                i11 = 1;
                sharedInstance.editCallMember(user, Boolean.FALSE, null, 10000, null, null);
            }
            sharedInstance.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
            k1().k(0L, i10 == i11 ? 31 : 36, user, null, null, null);
            return;
        }
        Context context2 = getContext();
        int i23 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.f5.a;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user3 = MessagesController.getInstance(i23).getUser(Long.valueOf(j10));
            str2 = user3.first_name;
            str3 = user3.last_name;
        } else {
            str2 = MessagesController.getInstance(i23).getChat(Long.valueOf(-j10)).title;
            str3 = null;
        }
        ?? alertDialog$Builder5 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.a;
        c2Var3.R = string2;
        LinearLayout e = org.telegram.messenger.sl.e(context2, 1);
        EditText editText3 = new EditText(context2);
        int i24 = org.telegram.ui.ActionBar.k6.hg;
        org.telegram.ui.ActionBar.r6.W(editText3, i24, null);
        editText3.setTextSize(1, 16.0f);
        editText3.setMaxLines(1);
        editText3.setLines(1);
        editText3.setSingleLine(true);
        editText3.setGravity(LocaleController.isRTL ? 5 : 3);
        editText3.setInputType(49152);
        editText3.setImeOptions(j10 > 0 ? 5 : 6);
        editText3.setHint(LocaleController.getString(j10 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
        editText3.setBackground(org.telegram.ui.ActionBar.k6.T(context2));
        editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        editText3.requestFocus();
        if (j10 > 0) {
            editText = new EditText(context2);
            org.telegram.ui.ActionBar.r6.W(editText, i24, null);
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(LocaleController.isRTL ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(LocaleController.getString(R.string.LastName));
            editText.setBackground(org.telegram.ui.ActionBar.k6.T(context2));
            editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        } else {
            editText = null;
        }
        AndroidUtilities.showKeyboard(editText3);
        e.addView(editText3, w7.z5.t(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            e.addView(editText, w7.z5.t(-1, -2, 0, 23, 12, 23, 21));
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.getText().toString().length());
        if (editText != null) {
            editText.setText(str3);
            editText.setSelection(editText.getText().toString().length());
        }
        alertDialog$Builder5.o(e);
        gi.q1 q1Var = new gi.q1(editText3, j10, i23, editText);
        alertDialog$Builder5.k(LocaleController.getString(R.string.Save), q1Var);
        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
        c2Var3.N = new ai.z3(i19, editText3, editText);
        c2Var3.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ug, false));
        c2Var3.show();
        c2Var3.p(org.telegram.ui.ActionBar.k6.x0(null, i24, false));
        wd wdVar = new wd(1, c2Var3, q1Var);
        if (editText != null) {
            editText.setOnEditorActionListener(wdVar);
        } else {
            editText3.setOnEditorActionListener(wdVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(boolean z10, org.telegram.ui.Cells.d4 d4Var) {
        int i10;
        float f7;
        final float f10;
        float f11;
        org.telegram.ui.Components.voip.t tVar;
        org.telegram.ui.Components.voip.t tVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.b3;
        m30 m30Var = this.b;
        z40 z40Var = this.Q;
        if (z11) {
            f10 = (z40Var.getX() + (d4Var.getX() + d4Var.getAvatarImageView().getX())) - paddingLeft;
            f7 = (z40Var.getY() + (d4Var.getY() + d4Var.getAvatarImageView().getY())) - paddingTop;
            f11 = d4Var.getAvatarImageView().getMeasuredHeight() / z40Var.getMeasuredWidth();
            i10 = (int) ((d4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
        } else {
            if (this.Z2 == null) {
                this.O2 = true;
            } else {
                this.O2 = z10 || m30Var.D0.k(m30Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.Y2;
            k30 k30Var = this.a2;
            if (lVar == null || !this.O2) {
                org.telegram.ui.Components.z20 z20Var = this.a3;
                if (z20Var != null) {
                    org.telegram.ui.Components.voip.t tVar3 = this.Z2;
                    g30 g30Var = this.m2;
                    if (tVar3 == null) {
                        float x10 = (k30Var.getX() + (g30Var.getX() + (this.a3.getX() + z20Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y3 = (k30Var.getY() + (g30Var.getY() + (this.a3.getY() + this.a3.getAvatarImageView().getY()))) - paddingTop;
                        f11 = this.a3.getAvatarImageView().getMeasuredHeight() / z40Var.getMeasuredWidth();
                        i10 = (int) ((this.a3.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
                        f7 = y3;
                        f10 = x10;
                        if (!this.O2 && (tVar = this.Z2) != null) {
                            tVar.invalidate();
                            k30Var.invalidate();
                            org.telegram.ui.Components.voip.t tVar4 = this.Z2;
                            tVar4.h = false;
                            tVar4.j(false);
                            this.Z2 = null;
                        }
                    } else if (this.O2) {
                        f10 = (k30Var.getX() + (g30Var.getX() + z20Var.getX())) - paddingLeft;
                        f7 = (k30Var.getY() + (g30Var.getY() + this.a3.getY())) - paddingTop;
                        i10 = 0;
                    }
                }
                i10 = 0;
                f7 = 0.0f;
                f10 = 0.0f;
                f11 = 0.96f;
                if (!this.O2) {
                    tVar.invalidate();
                    k30Var.invalidate();
                    org.telegram.ui.Components.voip.t tVar42 = this.Z2;
                    tVar42.h = false;
                    tVar42.j(false);
                    this.Z2 = null;
                }
            } else {
                float x11 = (z40Var.getX() + lVar.getX()) - paddingLeft;
                f7 = ((z40Var.getY() + this.Y2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                i10 = 0;
                f10 = x11;
            }
            f11 = 1.0f;
            if (!this.O2) {
            }
        }
        final float f12 = f7;
        final float f13 = f11;
        l30 l30Var = this.D2;
        if (z10) {
            n30 n30Var = this.C2;
            n30Var.setScaleX(f13);
            n30Var.setScaleY(f13);
            n30Var.setTranslationX(f10);
            n30Var.setTranslationY(f12);
            l30Var.setAlpha(0.0f);
        }
        m30Var.N(i10, i10);
        if (this.g2) {
            p30 p30Var = this.b2;
            if (z10) {
                p30Var.setAlpha(0.0f);
            }
            org.telegram.messenger.sl.s(p30Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.sl.s(l30Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        if (!z10 && (tVar2 = this.Z2) != null) {
            tVar2.h = false;
            tVar2.j(true);
            if (m30Var.D0.k(m30Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.o oVar = this.Z2.a;
                oVar.E = false;
                oVar.F = 0L;
                this.Y2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i11 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.m20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                u50.q(u50.this, f13, f10, f12, i11, valueAnimator);
            }
        });
        this.d3 = this.d.getNotificationCenter().setAnimationInProgress(this.d3, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.t tVar5 = this.Y2 != null ? this.Z2 : null;
        if (tVar5 != null) {
            tVar5.f = true;
        }
        ofFloat.addListener(new ah.q0(this, tVar5, z10, 8));
        if (this.b3 || this.Z2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
            ofFloat.setDuration(220L);
            this.Z2.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.o oVar2 = this.Z2.a;
            if (oVar2.E) {
                oVar2.G.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        S0();
    }

    public final void z1() {
        z5 z5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        if (!this.z2 || this.U0 == null || VoIPService.getSharedInstance() == null || !r1() || this.Q == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(z5Var, 30L);
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
