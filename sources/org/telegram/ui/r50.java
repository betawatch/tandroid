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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, vd.b {
    public static boolean A3;
    public static boolean B3;
    public static boolean C3;
    public static volatile DispatchQueue D3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean E3;
    public static r50 z3;
    public final Paint A;
    public final ArrayList A0;
    public org.telegram.ui.Components.p30 A1;
    public LinearLayout A2;
    public final u30 B;
    public final ArrayList B0;
    public int B1;
    public boolean B2;
    public final t30 C;
    public final ArrayList C0;
    public boolean C1;
    public final org.telegram.ui.Components.xi0 C2;
    public final r30 D;
    public final ArrayList D0;
    public boolean D1;
    public int D2;
    public final ImageView E;
    public int E0;
    public final Paint E1;
    public boolean E2;
    public final ImageView F;
    public final org.telegram.ui.Components.xi0 F0;
    public final Paint F1;
    public final View F2;
    public org.telegram.ui.Components.fk0 G;
    public final org.telegram.ui.Components.xi0 G0;
    public final q50[] G1;
    public final View G2;
    public final v40 H;
    public boolean H0;
    public float H1;
    public GradientDrawable H2;
    public final org.telegram.ui.Components.o6 I;
    public final org.telegram.ui.Components.y9 I0;
    public q50 I1;
    public final int[] I2;
    public final c30 J;
    public final org.telegram.ui.Components.y9 J0;
    public q50 J1;
    public final g30 J2;
    public final n40 K;
    public float K0;
    public long K1;
    public boolean K2;
    public final l50 L;
    public float L0;
    public float L1;
    public boolean L2;
    public final x40 M;
    public float M0;
    public float M1;
    public RenderNode M2;
    public final a40 N;
    public RadialGradient N0;
    public boolean N1;
    public float N2;
    public final TextView O;
    public final Matrix O0;
    public boolean O1;
    public boolean O2;
    public final y30 P;
    public final Paint P0;
    public int P1;
    public final String[] P2;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final g50 Q0;
    public float Q1;
    public ObjectAnimator Q2;
    public final w40 R;
    public float R0;
    public int R1;
    public ObjectAnimator R2;
    public final org.telegram.ui.ActionBar.h5 S;
    public float S0;
    public boolean S1;
    public final g40 S2;
    public final f50 T;
    public ValueAnimator T0;
    public final int[] T1;
    public org.telegram.ui.Cells.c4 T2;
    public final org.telegram.ui.Components.jz U;
    public TLRPC.InputPeer U0;
    public final ArrayList U1;
    public org.telegram.ui.Components.voip.l U2;
    public final ImageReceiver V;
    public TLRPC.Chat V0;
    public final ArrayList V1;
    public org.telegram.ui.Components.voip.u V2;
    public int W;
    public ChatObject.Call W0;
    public final j30 W1;
    public org.telegram.ui.Components.n20 W2;
    public final ImageView X;
    public final boolean X0;
    public final o30 X1;
    public boolean X2;
    public final wg.h Y;
    public final String Y0;
    public final b40 Y1;
    public boolean Y2;
    public final int Z;
    public final m50 Z0;
    public float Z1;
    public int Z2;
    public final RadialProgressView a0;
    public final b30 a1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a2;
    public AnimatorSet a3;
    public final l30 b;
    public final Drawable b0;
    public final d30 b1;
    public boolean b2;
    public r40 b3;
    public final q20 c;
    public final View c0;
    public final Paint c1;
    public boolean c2;
    public int c3;
    public final AccountInstance d;
    public AnimatorSet d0;
    public ValueAnimator d1;
    public org.telegram.ui.Components.s40 d2;
    public int d3;
    public final w20 e;
    public LaunchActivity e0;
    public float e1;
    public y40 e2;
    public int e3;
    public final org.telegram.ui.Components.voip.x2 f;
    public final UndoView[] f0;
    public final LinearLayout f1;
    public Boolean f2;
    public int f3;
    public final org.telegram.ui.Cells.k g0;
    public final org.telegram.ui.ActionBar.w0 g1;
    public int g2;
    public int g3;
    public final org.telegram.ui.Components.voip.x2 h;
    public boolean h0;
    public final org.telegram.ui.ActionBar.w0 h1;
    public boolean h2;
    public int h3;
    public org.telegram.ui.Components.g40 i0;
    public final org.telegram.ui.ActionBar.w0 i1;
    public final f30 i2;
    public int i3;
    public org.telegram.ui.Components.g40 j0;
    public final org.telegram.ui.ActionBar.g1 j1;
    public final org.telegram.ui.Components.jl0 j2;
    public int j3;
    public int k0;
    public final org.telegram.ui.ActionBar.g1 k1;
    public final x50 k2;
    public int k3;
    public b50 l0;
    public final org.telegram.ui.ActionBar.g1 l1;
    public final org.telegram.ui.Components.o20 l2;
    public int l3;
    public final ArrayList m0;
    public final org.telegram.ui.ActionBar.g1 m1;
    public ViewTreeObserver.OnPreDrawListener m2;
    public int m3;
    public final org.telegram.ui.Components.voip.x2 n;
    public m40 n0;
    public final org.telegram.ui.ActionBar.g1 n1;
    public final org.telegram.ui.Components.voip.h n2;
    public int n3;
    public boolean o0;
    public final org.telegram.ui.ActionBar.g1 o1;
    public boolean o2;
    public int o3;
    public long p0;
    public final org.telegram.ui.ActionBar.g1 p1;
    public final ArrayList p2;
    public int p3;
    public boolean q0;
    public final org.telegram.ui.ActionBar.g1 q1;
    public boolean q2;
    public int q3;
    public final org.telegram.ui.Components.voip.x2 r;
    public final RectF r0;
    public final org.telegram.ui.ActionBar.g1 r1;
    public final d20 r2;
    public int r3;
    public final org.telegram.ui.Components.voip.x2 s;
    public boolean s0;
    public final org.telegram.ui.ActionBar.g1 s1;
    public final a30 s2;
    public final s40 s3;
    public boolean t0;
    public final org.telegram.ui.ActionBar.g1 t1;
    public final org.telegram.ui.Components.g5 t2;
    public Boolean t3;
    public float u0;
    public final org.telegram.ui.ActionBar.g1 u1;
    public final d20 u2;
    public Integer u3;
    public final org.telegram.ui.Components.voip.x2 v;
    public d40 v0;
    public final LinearLayout v1;
    public boolean v2;
    public final vd.a v3;
    public final org.telegram.ui.Components.voip.x2 w;
    public TLRPC.Peer w0;
    public final TextView w1;
    public final w5 w2;
    public final vd.a w3;
    public final x20 x;
    public TLObject x0;
    public final p50 x1;
    public final LongSparseIntArray x2;
    public final vd.c x3;
    public final ImageView y;
    public final Paint y0;
    public final ah.i y1;
    public final m30 y2;
    public final vd.a y3;
    public final ArrayList z0;
    public d20 z1;
    public final k30 z2;

    public r50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super(launchActivity, null, true, true);
        String string;
        int i10;
        final r50 r50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.A = new Paint(1);
        this.f0 = new UndoView[2];
        this.m0 = new ArrayList();
        this.r0 = new RectF();
        this.y0 = new Paint(1);
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.y1 = new ah.i(new d20(this, 8));
        int i11 = 0;
        this.B1 = 0;
        this.C1 = false;
        this.E1 = new Paint(7);
        this.F1 = new Paint(7);
        this.G1 = new q50[8];
        this.H1 = 1.0f;
        this.S1 = true;
        this.T1 = new int[4];
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.n2 = new org.telegram.ui.Components.voip.h();
        this.p2 = new ArrayList();
        this.r2 = new d20(this, i11);
        this.s2 = new a30(this);
        this.t2 = new org.telegram.ui.Components.g5(24);
        this.u2 = new d20(this, 1);
        this.v2 = false;
        this.w2 = new w5(this, 6);
        this.x2 = new LongSparseIntArray();
        this.I2 = new int[2];
        this.L2 = true;
        this.P2 = new String[2];
        this.Z2 = -1;
        this.s3 = new s40(this);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
        this.v3 = new vd.a(2, this, jrVar, 350L);
        this.w3 = new vd.a(3, this, jrVar, 220L, true);
        this.x3 = new vd.c(4, this, jrVar, 350L);
        this.y3 = new vd.a(5, this, jrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.W0 = call;
        this.U0 = inputPeer;
        this.V0 = chat;
        this.Y0 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.X0 = z10;
        this.resourcesProvider = new lh.h0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.Z = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        C3 = false;
        B3 = false;
        E3 = false;
        setDelegate(new v30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.S2 = new g40(this);
        setOnDismissListener(new g20(this, i11));
        setDimBehindAlpha(75);
        l50 l50Var = new l50(this, launchActivity);
        this.L = l50Var;
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(true);
        int i12 = org.telegram.ui.ActionBar.g6.qg;
        lpVar.b(org.telegram.ui.ActionBar.g6.u0(i12));
        lpVar.d();
        n40 n40Var = new n40(this, launchActivity, lpVar);
        this.K = n40Var;
        n40Var.setSubtitle("");
        n40Var.getSubtitleTextView().setVisibility(0);
        n40Var.l();
        n40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(n40Var.getAdditionalSubtitleTextView(), this.q2, 1.0f, false);
        n40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.g6.u0(i12));
        int i13 = org.telegram.ui.ActionBar.g6.lg;
        n40Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.u0(i13));
        n40Var.setBackButtonImage(R.drawable.ic_ab_back);
        n40Var.setOccupyStatusBar(false);
        n40Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.g6.hg;
        n40Var.C(org.telegram.ui.ActionBar.g6.u0(i14), false);
        n40Var.B(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.z8), false);
        n40Var.setTitleColor(org.telegram.ui.ActionBar.g6.u0(i14));
        n40Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.u0(i13));
        n40Var.setActionBarMenuOnItemClick(new u40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.w0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.w0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.w0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.w0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new a20(this, 3);
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
        this.b0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.voip_filled, "" + R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.F0 = xi0Var;
        this.G0 = new org.telegram.ui.Components.xi0(R.raw.hand_2, "" + R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        v40 v40Var = new v40(this, launchActivity);
        this.H = v40Var;
        this.containerView = v40Var;
        v40Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.V = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.Q = h5Var;
            h5Var.setGravity(17);
            h5Var.setTextColor(-1);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTextSize(18);
            h5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(h5Var, i7.f6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            w40 w40Var = new w40(this, launchActivity);
            this.R = w40Var;
            w40Var.setGravity(17);
            w40Var.setTextColor(-1);
            w40Var.setTypeface(AndroidUtilities.bold());
            w40Var.setTextSize(60);
            this.containerView.addView(w40Var, i7.f6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.S = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, i7.f6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            g50 g50Var = new g50(this, launchActivity);
            this.Q0 = g50Var;
            this.containerView.addView(g50Var, i7.f6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        x40 x40Var = new x40(this, launchActivity);
        this.M = x40Var;
        x40Var.setClipToPadding(false);
        x40Var.setClipChildren(false);
        f50 f50Var = new f50(this);
        this.T = f50Var;
        f50Var.o = jrVar;
        f50Var.d = 350L;
        f50Var.c = 350L;
        f50Var.e = 350L;
        f50Var.S();
        x40Var.setItemAnimator(f50Var);
        x40Var.setOnScrollListener(new p20(this));
        x40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.jz jzVar = new org.telegram.ui.Components.jz(B3 ? 6 : 2, x40Var);
        this.U = jzVar;
        x40Var.setLayoutManager(jzVar);
        q20 q20Var = new q20(this);
        this.c = q20Var;
        jzVar.z1(q20Var);
        x40Var.i(new r20(this));
        jzVar.C1();
        this.containerView.addView(x40Var, i7.f6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        x40Var.setAdapter(l50Var);
        x40Var.setTopBottomSelectorRadius(13);
        x40Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.eg));
        x40Var.setOnItemClickListener(new z6(this, launchActivity, call, 14));
        x40Var.setOnItemLongClickListener(new a20(this, 4));
        if (r1()) {
            p50 p50Var = new p50(this, getContext());
            this.x1 = p50Var;
            this.containerView.addView(p50Var, i7.f6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(launchActivity);
        this.j2 = jl0Var;
        this.containerView.addView(jl0Var, i7.f6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        x50 x50Var = new x50(call, this.currentAccount, this);
        this.k2 = x50Var;
        jl0Var.setAdapter(x50Var);
        f2.w wVar = new f2.w(6, false);
        jl0Var.setLayoutManager(wVar);
        wVar.z1(new t20(this));
        final int i16 = 1;
        jl0Var.setOnItemClickListener(new org.telegram.ui.Components.zk0(this) { // from class: org.telegram.ui.c20
            public final /* synthetic */ r50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void c(int i17, View view) {
                switch (i16) {
                    case 0:
                        r50 r50Var2 = this.b;
                        r50Var2.getClass();
                        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view;
                        if (n20Var.getVideoParticipant() != null) {
                            r50Var2.e1(n20Var.getVideoParticipant());
                            break;
                        } else {
                            r50Var2.e1(new ChatObject.VideoParticipant(n20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        r50 r50Var3 = this.b;
                        r50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            r50Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        f2.l lVar = new f2.l();
        lVar.S();
        lVar.o = jrVar;
        lVar.d = 350L;
        lVar.c = 350L;
        lVar.e = 350L;
        jl0Var.setItemAnimator(new u20(this));
        jl0Var.setOnScrollListener(new v20(this));
        x50Var.H(jl0Var, false, false);
        jl0Var.setVisibility(8);
        w20 w20Var = new w20(this, launchActivity);
        this.e = w20Var;
        int u02 = org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.O0 = new Matrix();
        this.N0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.P0 = paint;
        paint.setShader(this.N0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(9);
        this.I0 = y9Var;
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(12);
        this.J0 = y9Var2;
        y9Var.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        y9Var.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        y9Var.b();
        y9Var2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        y9Var2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        y9Var2.b();
        int i17 = org.telegram.ui.ActionBar.g6.Ig;
        y9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.u0(i17), 38));
        y9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.u0(i17), 76));
        org.telegram.ui.Components.voip.x2 x2Var = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.r = x2Var;
        x2Var.setCheckable(true);
        x2Var.setTextSize(12);
        w20Var.a(x2Var);
        x2Var.setOnClickListener(new b20(this, 7));
        org.telegram.ui.Components.voip.x2 x2Var2 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.n = x2Var2;
        x2Var2.setCheckable(true);
        x2Var2.setTextSize(12);
        x2Var2.d(false, false);
        x2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        x2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.x2 x2Var3 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.f = x2Var3;
        x2Var3.setCheckable(true);
        x2Var3.setTextSize(12);
        x2Var3.d(false, false);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(launchActivity);
        x2Var3.addView(aj0Var, i7.f6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(R.raw.camera_flip, "" + R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.C2 = xi0Var2;
        aj0Var.setAnimation(xi0Var2);
        x2Var3.setOnClickListener(new b20(this, 10));
        w20Var.a(x2Var3);
        org.telegram.ui.Components.voip.x2 x2Var4 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.h = x2Var4;
        x2Var4.setCheckable(true);
        x2Var4.setTextSize(12);
        x2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i18 = R.drawable.filled_sound_on;
        this.W = i18;
        imageView.setImageResource(i18);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        x2Var4.addView(imageView, i7.f6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        x2Var4.setOnClickListener(new b20(this, 11));
        w20Var.a(x2Var4);
        w20Var.a(x2Var2);
        org.telegram.ui.Components.voip.x2 x2Var5 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.s = x2Var5;
        x2Var5.setTextSize(12);
        x2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i19 = 1;
        x2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f20
            public final /* synthetic */ r50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        r50.o(this.b, launchActivity);
                        break;
                    default:
                        r50 r50Var2 = this.b;
                        r50Var2.W1.e();
                        ChatObject.Call call2 = r50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            r50Var2.I1();
                            r50.t1(launchActivity, new d20(r50Var2, 5), false, false);
                            break;
                        } else {
                            r50Var2.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.x2 x2Var6 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.v = x2Var6;
        x2Var6.setCheckable(true);
        x2Var6.b(true, false);
        x2Var6.setTextSize(12);
        x2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        x20 x20Var = new x20(this, launchActivity);
        this.x = x20Var;
        x20Var.setAnimation(xi0Var);
        x20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.x2 x2Var7 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.w = x2Var7;
        x2Var7.setDrawBackground(false);
        x2Var7.setTextSize(12);
        x2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        x2Var7.addView(x20Var, i7.f6.e(50, 50, 49));
        w20Var.a(x2Var7);
        x2Var7.setOnClickListener(new z20(this));
        w20Var.a(x2Var6);
        w20Var.a(x2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        x2Var7.addView(imageView2, i7.f6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.W0 != null && r1() && !this.W0.isScheduled()) {
            imageView2.setVisibility(0);
            x20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.a0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Og));
        n40Var.setAlpha(0.0f);
        n40Var.getBackButton().setScaleX(0.9f);
        n40Var.getBackButton().setScaleY(0.9f);
        n40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        n40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        n40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        n40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int u03 = org.telegram.ui.ActionBar.g6.u0(i14);
        int i20 = 0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, u03);
        this.g1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new a20(this, i20));
        int i21 = org.telegram.ui.ActionBar.g6.ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i21), 6));
        w0Var.setOnClickListener(new b20(this, i20));
        w0Var.G(org.telegram.ui.ActionBar.g6.u0(i14), false);
        w0Var.G(org.telegram.ui.ActionBar.g6.u0(i14), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.g6.u0(i14));
        this.h1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i21), 6));
        w0Var2.setOnClickListener(new b20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.g6.u0(i14));
        this.i1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i21), 6));
        w0Var3.setOnClickListener(new b20(this, 2));
        b30 b30Var = new b30(this, launchActivity, launchActivity);
        this.a1 = b30Var;
        c30 c30Var = new c30(launchActivity);
        this.J = c30Var;
        c30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        paint2.setColor(-12761513);
        d30 d30Var = new d30(this, getContext());
        this.b1 = d30Var;
        d30Var.setTextColor(getThemedColor(i14));
        d30Var.setTextSize(1, 11.0f);
        d30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        d30Var.setMaxLines(1);
        d30Var.setGravity(17);
        d30Var.setTypeface(AndroidUtilities.bold());
        d30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        d30Var.setTag(-1);
        if (!r1()) {
            d30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(b30Var, i7.f6.l(1.0f, 0, -2));
        linearLayout.addView(d30Var, i7.f6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(c30Var, i7.f6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, i7.f6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(n40Var, i7.f6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.v1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, i7.f6.n(48, 48));
        linearLayout2.addView(w0Var2, i7.f6.n(48, 48));
        linearLayout2.addView(w0Var, i7.f6.n(48, 48));
        this.containerView.addView(linearLayout2, i7.f6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.c0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.V5));
        this.containerView.addView(view, i7.f6.c(1.0f, -1));
        for (int i22 = 0; i22 < 2; i22++) {
            this.f0[i22] = new e30(this, launchActivity);
            this.f0[i22].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f0[i22].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f0[i22], i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.g0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.g1.h(kVar, AndroidUtilities.dp(48.0f));
        this.g1.setShowSubmenuByMove(false);
        int i23 = org.telegram.ui.ActionBar.g6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.u0(i23), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.g1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.i0);
        this.q1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.g1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.i0);
        this.r1 = d10;
        d10.j(false, true);
        int i24 = org.telegram.ui.ActionBar.g6.wg;
        d.setCheckColor(i24);
        d.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        d10.setCheckColor(i24);
        d10.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        Paint paint3 = new Paint(1);
        int i25 = org.telegram.ui.ActionBar.g6.hg;
        paint3.setColor(org.telegram.ui.ActionBar.g6.u0(i25));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.g1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.i0);
        this.l1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.g1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.i0);
        this.m1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.g1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.gg), -16777216));
        this.w1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.g1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.Z0, LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.i0);
        this.k1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.g1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.Z0, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.i0);
        this.n1 = d14;
        org.telegram.ui.ActionBar.g1 e10 = this.g1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.j1 = e10;
        m50 m50Var = new m50();
        this.Z0 = m50Var;
        org.telegram.ui.ActionBar.g1 e11 = this.g1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.p1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.g1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, m50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.i0);
        this.o1 = d15;
        m50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e12 = this.g1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.t1 = e12;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e13 = this.g1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.u1 = e13;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.g1;
        int i26 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i25;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i25;
        }
        org.telegram.ui.ActionBar.g1 e14 = w0Var11.e(4, i26, string);
        this.s1 = e14;
        this.g1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.g6.u0(i23));
        this.g1.getPopupLayout().setFitItems(true);
        e12.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        e13.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d11.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d12.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        int i27 = org.telegram.ui.ActionBar.g6.vg;
        e14.c(org.telegram.ui.ActionBar.g6.u0(i27), org.telegram.ui.ActionBar.g6.u0(i27));
        e10.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d13.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d14.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d15.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        e11.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        if (this.W0 != null) {
            l1();
        }
        if (o1()) {
            this.l0 = new b50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.l0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.K.getTitleTextView().setOnClickListener(new b20(this, 3));
        f30 f30Var = new f30(this, launchActivity);
        this.i2 = f30Var;
        g30 g30Var = new g30(this);
        this.J2 = g30Var;
        final int i28 = 0;
        f30Var.setClipToPadding(false);
        g30Var.S();
        g30Var.o = org.telegram.ui.Components.jr.f;
        g30Var.d = 350L;
        g30Var.c = 350L;
        g30Var.e = 350L;
        f30Var.setItemAnimator(g30Var);
        f30Var.setOnScrollListener(new h30(this));
        f30Var.setClipChildren(false);
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        f30Var.setLayoutManager(j0Var);
        org.telegram.ui.Components.o20 o20Var = new org.telegram.ui.Components.o20(call, this.currentAccount, this);
        this.l2 = o20Var;
        f30Var.setAdapter(o20Var);
        o20Var.F(f30Var, false);
        f30Var.setOnItemClickListener(new org.telegram.ui.Components.zk0(this) { // from class: org.telegram.ui.c20
            public final /* synthetic */ r50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void c(int i172, View view2) {
                switch (i28) {
                    case 0:
                        r50 r50Var2 = this.b;
                        r50Var2.getClass();
                        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view2;
                        if (n20Var.getVideoParticipant() != null) {
                            r50Var2.e1(n20Var.getVideoParticipant());
                            break;
                        } else {
                            r50Var2.e1(new ChatObject.VideoParticipant(n20Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        r50 r50Var3 = this.b;
                        r50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar2.getParticipant() != null) {
                            r50Var3.e1(lVar2.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        f30Var.setOnItemLongClickListener(new a20(this, 1));
        f30Var.setVisibility(8);
        f30Var.i(new i30());
        int i29 = 4;
        j30 j30Var = new j30(this, launchActivity, this.M, f30Var, this.U1, this.W0, this);
        this.W1 = j30Var;
        j30Var.setClipChildren(false);
        o20Var.E(this.U1, j30Var);
        if (this.j2 != null) {
            this.k2.G(this.U1, j30Var);
        }
        k30 k30Var = new k30(this, launchActivity);
        this.z2 = k30Var;
        l30 l30Var = new l30(this, launchActivity, this.K, this.M, k30Var);
        this.b = l30Var;
        l30Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        l30Var.setInvalidateWithParent(true);
        k30Var.setProfileGalleryView(l30Var);
        m30 m30Var = new m30(this, launchActivity);
        this.y2 = m30Var;
        m30Var.setVisibility(8);
        l30Var.setVisibility(0);
        l30Var.b(new n30(this));
        o30 o30Var = new o30(this, launchActivity);
        this.X1 = o30Var;
        this.containerView.addView(j30Var);
        j30Var.addView(f30Var, i7.f6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.F2 = view2;
        int[] iArr = this.I2;
        iArr[0] = this.R1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.I2);
        this.H2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, i7.f6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.G2 = view3;
        view3.setBackgroundColor(this.I2[0]);
        this.containerView.addView(view3, i7.f6.e(-1, 0, 83));
        wg.h hVar = new wg.h(launchActivity);
        this.Y = hVar;
        hVar.setDelegate(new p30(this));
        hVar.setClickCellDelegate(new q30(this));
        if (this.W0 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(launchActivity, false, true, true);
        this.I = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.jr.h);
        o6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        r30 r30Var = new r30(this, launchActivity, this.H, LaunchActivity.R(), this.resourcesProvider);
        this.D = r30Var;
        r30Var.F = true;
        r30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Z)});
        r30Var.getEditText().setLinkTextColor(-11683585);
        r30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        r30Var.getEditText().addTextChangedListener(new s30(this));
        r30Var.s();
        t30 t30Var = new t30(this, launchActivity);
        this.C = t30Var;
        this.containerView.addView(t30Var, i7.f6.c(-1.0f, -1));
        u30 u30Var = new u30(launchActivity);
        this.B = u30Var;
        u30Var.addView(r30Var, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        u30Var.addView(o6Var, i7.f6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        o6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(u30Var, i7.f6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.F = imageView3;
        int i30 = org.telegram.ui.ActionBar.g6.i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i30), 1, -1));
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new b20(this, i29));
        ImageView imageView4 = new ImageView(launchActivity);
        this.E = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i30), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new b20(this, 5));
        u30Var.addView(imageView3, i7.f6.e(48, 48, 85));
        u30Var.addView(imageView4, i7.f6.e(48, 48, 85));
        this.containerView.addView(o30Var);
        m30Var.addView(l30Var, i7.f6.c(-1.0f, -1));
        m30Var.addView(k30Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(m30Var, i7.f6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.L.l();
        if (C3) {
            this.k2.I(this.j2, false);
        }
        this.E0 = this.L.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.O = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.V0) && (chat2 = this.V0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, i7.f6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(launchActivity);
            qc0Var.setTextColor(-1);
            qc0Var.setSelectorColor(-9598483);
            qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            qc0Var.setItemCount(5);
            w30 w30Var = new w30(launchActivity);
            w30Var.setItemCount(5);
            w30Var.setTextColor(-1);
            w30Var.setSelectorColor(-9598483);
            w30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            x30 x30Var = new x30(launchActivity);
            x30Var.setItemCount(5);
            x30Var.setTextColor(-1);
            x30Var.setSelectorColor(-9598483);
            x30Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            y30 y30Var = new y30(launchActivity);
            this.P = y30Var;
            y30Var.setLines(1);
            y30Var.setSingleLine(true);
            y30Var.setEllipsize(TextUtils.TruncateAt.END);
            y30Var.setGravity(17);
            y30Var.setTextColor(-1);
            y30Var.setTypeface(AndroidUtilities.bold());
            y30Var.setTextSize(1, 14.0f);
            this.containerView.addView(y30Var, i7.f6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            y30Var.setOnClickListener(new org.telegram.messenger.video.f(this, qc0Var, w30Var, x30Var, chat, accountInstance, inputPeer2, 1));
            a40 a40Var = new a40(launchActivity, qc0Var, w30Var, x30Var);
            this.N = a40Var;
            a40Var.setWeightSum(1.0f);
            a40Var.setOrientation(0);
            this.containerView.addView(a40Var, i7.f6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i31 = calendar.get(1);
            int i32 = calendar.get(6);
            a40Var.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
            qc0Var.setMinValue(0);
            qc0Var.setMaxValue(365);
            qc0Var.setWrapSelectorWheel(false);
            qc0Var.setFormatter(new eg.d(currentTimeMillis, calendar, i31, 1));
            a1.d dVar = new a1.d(this, qc0Var, w30Var, x30Var, 12);
            r50Var = this;
            qc0Var.setOnValueChangedListener(dVar);
            w30Var.setMinValue(0);
            w30Var.setMaxValue(23);
            a40Var.addView(w30Var, i7.f6.l(0.2f, 0, 270));
            w30Var.setFormatter(new org.telegram.ui.Components.xo0(17));
            w30Var.setOnValueChangedListener(dVar);
            x30Var.setMinValue(0);
            x30Var.setMaxValue(59);
            x30Var.setValue(0);
            x30Var.setFormatter(new org.telegram.ui.Components.xo0(18));
            a40Var.addView(x30Var, i7.f6.l(0.3f, 0, 270));
            x30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i33 = calendar.get(6);
            int i34 = calendar.get(12);
            int i35 = calendar.get(11);
            qc0Var.setValue(i32 != i33 ? 1 : 0);
            x30Var.setValue(i34);
            w30Var.setValue(i35);
            org.telegram.ui.Components.c5.g(y30Var, textView, 0L, 604800L, 2, qc0Var, w30Var, x30Var);
        } else {
            r50Var = this;
        }
        b40 b40Var = new b40(r50Var, (ViewGroup) r50Var.getWindow().getDecorView(), r50Var.containerView);
        r50Var.Y1 = b40Var;
        b40Var.E = new c40(r50Var);
        l30Var.setPinchToZoomHelper(b40Var);
        final int i36 = 0;
        r50Var.n.setOnClickListener(new View.OnClickListener(r50Var) { // from class: org.telegram.ui.f20
            public final /* synthetic */ r50 b;

            {
                this.b = r50Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i36) {
                    case 0:
                        r50.o(this.b, launchActivity);
                        break;
                    default:
                        r50 r50Var2 = this.b;
                        r50Var2.W1.e();
                        ChatObject.Call call2 = r50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            r50Var2.I1();
                            r50.t1(launchActivity, new d20(r50Var2, 5), false, false);
                            break;
                        } else {
                            r50Var2.dismiss();
                            break;
                        }
                }
            }
        });
        r50Var.L1(false);
        r50Var.I1();
        r50Var.M1(false);
        r50Var.N1(false, false);
        r50Var.B1(0.0f);
        r50Var.O1();
        r50Var.containerView.addView(new FrameLayout(launchActivity), i7.f6.e(-1, 200, 87));
        r50Var.v.setOnClickListener(new b20(r50Var, 6));
        r50Var.T0();
        i7.h6.a(r50Var.n);
        i7.h6.a(r50Var.r);
        i7.h6.a(r50Var.f);
        i7.h6.a(r50Var.h);
        i7.h6.a(r50Var.w);
        i7.h6.a(r50Var.s);
        i7.h6.a(r50Var.v);
        r0.j0.m(r50Var.containerView, new a20(r50Var, 2));
    }

    public static r0.m1 A(r50 r50Var, r0.m1 m1Var) {
        r0.j1 j1Var = m1Var.a;
        i0.b f9 = j1Var.f(647);
        i0.b f10 = j1Var.f(8);
        r30 r30Var = r50Var.D;
        int max = Math.max(f10.d, (r30Var.J || r30Var.e) ? r30Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = r50Var.X1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f9.d;
        }
        if (r30Var.getEmojiView() != null) {
            r30Var.getEmojiView().setBottomInset(f9.d);
        }
        if (r50Var.O2) {
            ViewGroup viewGroup = r50Var.containerView;
            int i10 = r50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = r50Var.containerView;
            int i11 = r50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f9.a + i11, f9.b, i11 + f9.c, f9.d);
        }
        r50Var.containerView.requestLayout();
        if (max == 0 && !r30Var.J && !r30Var.e && !r30Var.K) {
            r30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.fk0 fk0Var = r50Var.G;
            if (fk0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                fk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.fk0 fk0Var2 = new org.telegram.ui.Components.fk0(1, r50Var.currentAccount, r50Var.getContext(), R, r50Var.resourcesProvider);
                    r50Var.G = fk0Var2;
                    fk0Var2.setDelegate(new t40(r50Var));
                    r50Var.containerView.addView(r50Var.G, i7.f6.e(-2, 52, 81));
                    r50Var.G.p(null, null, false);
                    r50Var.C.bringToFront();
                    r50Var.B.bringToFront();
                    fk0Var = r50Var.G;
                }
            }
            r50Var.G = fk0Var;
        }
        r30Var.G(f10.d, false);
        r50Var.y1.i(m1Var);
        return r0.m1.b;
    }

    public static String A0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void B(r50 r50Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.tc(r50Var.topBulletinContainer, new lh.h0()).d0(tL_error, false);
                return;
            }
            return;
        }
        Context context = r50Var.getContext();
        int i10 = r50Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.c6 c6Var = r50Var.resourcesProvider;
        ChatObject.Call call = r50Var.W0;
        h9.o0(context, i10, inputGroupCall, str, c6Var, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
    }

    public static void B0(r50 r50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (r50Var.j0 == null) {
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(r50Var.getContext(), 8);
            r50Var.j0 = g40Var;
            g40Var.setAlpha(0.0f);
            r50Var.j0.setVisibility(4);
            r50Var.j0.setShowingDuration(4000L);
            r50Var.containerView.addView(r50Var.j0, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            r50Var.j0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            r50Var.j0.d();
        }
        r50Var.j0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        r50Var.j0.f(r50Var.w, true);
    }

    public static /* synthetic */ void C(r50 r50Var, int[] iArr, float[] fArr) {
        f2.n1 K;
        f30 f30Var = r50Var.i2;
        j30 j30Var = r50Var.W1;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = r50Var.W0.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (j30Var.b) {
                    for (int i11 = 0; i11 < f30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) f30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(n20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            n20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (r50Var.o0 ? r50Var.z0 : r50Var.W0.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = r50Var.M.K(indexOf + r50Var.L.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.c4) {
                            ((org.telegram.ui.Cells.c4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == r50Var.T2 && !r50Var.h2) {
                                r50Var.containerView.invalidate();
                            }
                        }
                    }
                }
                j30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void D(r50 r50Var) {
        Editable text = r50Var.D.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(r50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        r50Var.A1(tL_textWithEntities);
    }

    public static void F0(r50 r50Var) {
        ChatObject.Call call = r50Var.W0;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = r50Var.W0.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(r50Var.W0.call.join_muted);
        ConnectionsManager connectionsManager = r50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new m20(r50Var, 1));
    }

    public static void G0(r50 r50Var, boolean z10) {
        if (r50Var.W0 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = r50Var.W0.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        r50Var.t3 = Boolean.valueOf(z10);
        r50Var.H1(true);
        ConnectionsManager connectionsManager = r50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new m20(r50Var, 0));
    }

    public static void H0(r50 r50Var) {
        int i10;
        if (!r50Var.r1()) {
            r50Var.isFullscreen = false;
            return;
        }
        j30 j30Var = r50Var.W1;
        boolean z10 = (!j30Var.R && j30Var.b && (B3 == r50Var.q1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = r50Var.f2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = r50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                r50Var.getWindow().clearFlags(1024);
                r50Var.setHideSystemVerticalInsets(false);
            } else {
                r50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                r50Var.getWindow().addFlags(1024);
            }
            r50Var.containerView.setSystemUiVisibility(i10);
            r50Var.f2 = Boolean.valueOf(z10);
            r50Var.O2 = !z10;
            r50Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l I0(r50 r50Var) {
        x40 x40Var = r50Var.M;
        for (int i10 = 0; i10 < x40Var.getChildCount(); i10++) {
            View childAt = x40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(r50 r50Var) {
        n40 n40Var = r50Var.K;
        x40 x40Var = r50Var.M;
        int childCount = x40Var.getChildCount();
        float f9 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(x40Var.getChildAt(i10)) >= 0) {
                f9 = Math.min(f9, r8.getTop());
            }
        }
        if (f9 < 0.0f || f9 == 2.14748365E9f) {
            f9 = childCount != 0 ? 0.0f : x40Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = f9 <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f9 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z10 && n40Var.getTag() == null) || (!z10 && n40Var.getTag() != null)) {
            n40Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = r50Var.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
                r50Var.d0 = null;
            }
            r50Var.setUseLightStatusBar(n40Var.getTag() == null);
            ViewPropertyAnimator duration = n40Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
            duration.setInterpolator(jrVar).start();
            n40Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(jrVar).start();
            ObjectAnimator objectAnimator = r50Var.Q2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                r50Var.Q2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = n40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.h5, Float>) property, n40Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            r50Var.Q2 = ofFloat;
            ofFloat.setDuration(300L);
            r50Var.Q2.setInterpolator(jrVar);
            r50Var.Q2.addListener(new org.telegram.ui.Components.z9(29, r50Var, z10));
            r50Var.Q2.start();
            ObjectAnimator objectAnimator2 = r50Var.R2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n40Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            r50Var.R2 = ofFloat2;
            ofFloat2.setDuration(300L);
            r50Var.R2.setInterpolator(jrVar);
            r50Var.R2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            r50Var.d0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = r50Var.d0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n40Var, (Property<n40, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(r50Var.J, (Property<c30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(r50Var.c0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            r50Var.d0.addListener(new l40(r50Var, i11));
            r50Var.d0.start();
            r50Var.W1.v.setClickable(!z10 || B3);
        }
        if (r50Var.u0 != dp) {
            r50Var.E1(dp);
        }
    }

    public static void M(r50 r50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (r50Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(r50Var.U1, r50Var.W1, lVar, null, null, lVar.getParticipant(), r50Var.W0, r50Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void S(r50 r50Var, int i10, int[] iArr) {
        if (r50Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.zg, false), r50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), r50Var.Q1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.yg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.zg, false), r50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Bg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Cg, false), r50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Mg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ng, false), r50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false), r50Var.Q1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (z3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                z3 = new r50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                z3 = new r50(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            z3.e0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(23));
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

    public static /* synthetic */ void m(r50 r50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(declineconferencecallinvite, new k20(r50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(r50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = r50Var.W0;
        if (call != null) {
            call.invitedUsers.remove(l10);
            r50Var.W0.invitedUsersMap.remove(l10);
            r50Var.W0.invitedUsersMessageIds.remove(l10);
            r50Var.O0(true);
        }
    }

    public static void n(final r50 r50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = r50Var.d;
        ArrayList arrayList = r50Var.B0;
        l50 l50Var = r50Var.L;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            r50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.c4) {
            r50Var.F1((org.telegram.ui.Cells.c4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l10 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.t3)) {
            if (i10 != l50Var.w) {
                if (i10 != l50Var.x) {
                    if (i10 == l50Var.y) {
                        r50Var.v1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = r50Var.W0;
                if (call2 == null || call2.call == null) {
                    return;
                }
                eg.w2 w2Var = new eg.w2(activity, r50Var.currentAccount, null, 4, new lh.h0());
                ChatObject.Call call3 = r50Var.W0;
                w2Var.y0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new j8(4)).collect(Collectors.toSet()) : null);
                w2Var.h0(false, true);
                w2Var.w0 = new d20(r50Var, 3);
                w2Var.h0(false, true);
                w2Var.z0 = new bh.v(20, r50Var, call);
                w2Var.show();
                return;
            }
            if (ChatObject.isChannel(r50Var.V0) && (chat = r50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                r50Var.j1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(r50Var.i1());
            if (chatFull == null) {
                return;
            }
            r50Var.s0 = false;
            Context context = r50Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = r50Var.V0;
            ChatObject.Call call4 = r50Var.W0;
            org.telegram.ui.Components.p30 p30Var = new org.telegram.ui.Components.p30(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            r50Var.A1 = p30Var;
            p30Var.setOnDismissListener(new g20(r50Var, 2));
            org.telegram.ui.Components.p30 p30Var2 = r50Var.A1;
            p30Var2.c0 = new s20(r50Var);
            p30Var2.show();
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
        if (t3Var.getUser() == null) {
            return;
        }
        if (!r50Var.o1()) {
            r50Var.e0.K0(r50Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", t3Var.getUser().id);
            if (t3Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            r50Var.e0.p0(new ProfileActivity(bundle, null));
            r50Var.dismiss();
            return;
        }
        int i11 = i10 - l50Var.n;
        if (i11 < 0 || i11 >= r50Var.W0.shadyJoinParticipants.size()) {
            int i12 = i10 - l50Var.s;
            if (i12 < 0 || i12 >= r50Var.W0.shadyLeftParticipants.size()) {
                int i13 = i10 - l50Var.f;
                if (r50Var.o0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l10 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < r50Var.W0.invitedUsers.size()) {
                    l10 = r50Var.W0.invitedUsers.get(i13);
                }
                z10 = false;
            } else {
                l10 = r50Var.W0.shadyLeftParticipants.get(i10 - l50Var.s);
            }
        } else {
            l10 = r50Var.W0.shadyJoinParticipants.get(i10 - l50Var.n);
        }
        if (z10 || (invitedUser = r50Var.W0.invitedUsersMessageIds.get(l10)) == null) {
            return;
        }
        org.telegram.ui.Components.j70 F = org.telegram.ui.Components.j70.F(r50Var.container, r50Var.resourcesProvider, t3Var);
        final int i14 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(r50Var) { // from class: org.telegram.ui.i20
            public final /* synthetic */ r50 b;

            {
                this.b = r50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        r50.r(this.b, invitedUser, l10);
                        break;
                    default:
                        r50.m(this.b, invitedUser, l10);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(r50Var) { // from class: org.telegram.ui.i20
            public final /* synthetic */ r50 b;

            {
                this.b = r50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        r50.r(this.b, invitedUser, l10);
                        break;
                    default:
                        r50.m(this.b, invitedUser, l10);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), r50Var.y0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void o(r50 r50Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = r50Var.e0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            r50Var.e0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            r50Var.N1(true, false);
            r50Var.M1(false);
            r50Var.W0.sortParticipants();
            r50Var.O0(true);
            r50Var.e.requestLayout();
            return;
        }
        r50Var.f0[0].e(1, false);
        if (r50Var.v0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            d40 d40Var = new d40(r50Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            r50Var.v0 = d40Var;
            d40Var.setBottomPadding(r50Var.containerView.getPaddingBottom());
            r50Var.container.addView(r50Var.v0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static /* synthetic */ void p(r50 r50Var, float f9, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r50Var.Z1 = floatValue;
        r50Var.W1.n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f9);
        m30 m30Var = r50Var.y2;
        m30Var.setScaleX(f12);
        m30Var.setScaleY(f12);
        m30Var.setTranslationX((1.0f - r50Var.Z1) * f10);
        m30Var.setTranslationY((1.0f - r50Var.Z1) * f11);
        if (!r50Var.c2) {
            r50Var.S2.setAlpha((int) (r50Var.Z1 * 100.0f));
        }
        org.telegram.ui.Components.voip.u uVar = r50Var.V2;
        if (uVar != null) {
            uVar.a.setRoundCorners((1.0f - r50Var.Z1) * AndroidUtilities.dp(8.0f));
        }
        m30Var.invalidate();
        r50Var.containerView.invalidate();
        l30 l30Var = r50Var.b;
        int i11 = (int) ((1.0f - r50Var.Z1) * i10);
        l30Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static /* synthetic */ void q(r50 r50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = r50Var.W0;
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
            r50Var.W0.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = r50Var.W0.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(r50Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new l20(r50Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        r50Var.O0(true);
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
        r50Var.N1(true, true);
    }

    public static /* synthetic */ void r(r50 r50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(declineconferencecallinvite, new k20(r50Var, 1));
        ChatObject.Call call = r50Var.W0;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l10, invitedUser);
            r50Var.O0(true);
        }
    }

    public static /* synthetic */ void s(r50 r50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(r50 r50Var) {
        r50Var.Y0();
        r50Var.V0();
        r50Var.U0();
        r50Var.B.setTranslationY((-r50Var.y1.c()) + r50Var.containerView.getPaddingBottom());
        r50Var.C.invalidate();
        r50Var.Z0();
        r50Var.containerView.invalidate();
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
            alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
        } else if (ChatObject.isChannelOrGiga(chat)) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1);
            y1VarArr[0] = y1Var;
            y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            if (z10) {
                y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            } else {
                y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) y1VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.g6.rg;
                int i11 = org.telegram.ui.ActionBar.g6.pg;
                int i12 = org.telegram.ui.ActionBar.g6.ng;
                checkBoxSquare.s = i10;
                checkBoxSquare.v = i11;
                checkBoxSquare.w = i12;
                checkBoxSquare.invalidate();
            }
            y1VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                y1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                y1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
            } else {
                y1VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
            }
            y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            g10.addView(y1VarArr[0], i7.f6.n(-1, -2));
            y1VarArr[0].setOnClickListener(new e20(y1VarArr, 0));
        }
        alertDialog$Builder.n(g10);
        alertDialog$Builder.a.E = org.telegram.ui.ActionBar.g6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new b9.d(call, y1VarArr, selfId, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.a.L0 = false;
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
            c2Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ug, false));
        }
        c2Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.vg, false));
        }
        c2Var.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hg, false));
    }

    public static /* synthetic */ void u(r50 r50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void v(r50 r50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(r50Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new g5.v(r50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new n20(r50Var, hashSet, call, str, 1));
    }

    public static /* synthetic */ void w(r50 r50Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(r50Var.currentAccount).getUser(l10));
            getrequirementstocontact.id.add(MessagesController.getInstance(r50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(r50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(r50Var.currentAccount).isPremium()) {
            u20Var.run();
        } else {
            ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(getrequirementstocontact, new x9(arrayList, arrayList2, u20Var, 13));
        }
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

    public static /* synthetic */ void x(r50 r50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(34, r50Var.currentAccount, U.getContext(), U, new lh.h0());
        v0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        v0Var.show();
    }

    public static /* synthetic */ void y(r50 r50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            r50Var.x1(null, j10, 3);
        } else {
            org.telegram.ui.Components.c5.f0(r50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) r50Var.e0.O().getFragmentStack().get(r50Var.e0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.D.setText("");
        ChatObject.Call call = this.W0;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.W0;
        long j10 = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j10, inputGroupCall);
    }

    public final void B1(float f9) {
        this.Q1 = f9;
        j30 j30Var = this.W1;
        float max = Math.max(f9, j30Var == null ? 0.0f : j30Var.c);
        int i10 = org.telegram.ui.ActionBar.g6.jg;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.g6.w0(null, i11, false), f9, 1.0f);
        this.R1 = offsetColor;
        this.J.setBackgroundColor(offsetColor);
        this.g1.B(-14472653);
        this.b0.setColorFilter(new PorterDuffColorFilter(this.R1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.tg, false), f9, 1.0f);
        b50 b50Var = this.l0;
        if (b50Var != null) {
            b50Var.j = offsetColor2;
            cg.h0 h0Var = b50Var.g;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
        this.y0.setColor(offsetColor2);
        this.A.setColor(offsetColor2);
        this.B.invalidate();
        x40 x40Var = this.M;
        x40Var.setGlowColor(offsetColor2);
        int i12 = this.B1;
        if (i12 == 3 || p1(i12)) {
            this.w.invalidate();
        }
        View view = this.F2;
        if (view != null) {
            int i13 = this.R1;
            int[] iArr = this.I2;
            iArr[0] = i13;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.H2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.H2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.G2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Eg, false), f9, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.og, false), f9, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.rg, false), f9, 1.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int childCount = x40Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = x40Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                if (o1()) {
                    u3Var.a(v02, v02);
                } else {
                    u3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.c4;
                n40 n40Var = this.K;
                if (z10) {
                    ((org.telegram.ui.Cells.c4) childAt).f(n40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.t3) {
                    ((org.telegram.ui.Cells.t3) childAt).a(n40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        x40Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f9) {
        x40 x40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        f2.n1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f9 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f9) / 8500.0d);
        this.L0 = min;
        this.M0 = (min - this.K0) / 265.0f;
        ChatObject.Call call = this.W0;
        if (call == null || (x40Var = this.M) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.w0))) == null) {
            return;
        }
        j30 j30Var = this.W1;
        if (j30Var.b) {
            int i10 = 0;
            while (true) {
                f30 f30Var = this.i2;
                if (i10 >= f30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) f30Var.getChildAt(i10);
                if (MessageObject.getPeerId(n20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    n20Var.setAmplitude(f9 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.o0 ? this.z0 : this.W0.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = x40Var.K(indexOf + this.L.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.c4) {
                    ((org.telegram.ui.Cells.c4) view).setAmplitude(f9 * 15.0f);
                    if (view == this.T2 && !this.h2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        j30Var.k(groupCallParticipant, f9 * 15.0f);
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.c3 = i10;
        this.d3 = i11;
        this.e3 = i12;
        this.f3 = i13;
        this.g3 = i14;
        this.h3 = i15;
        this.i3 = i16;
        this.j3 = i17;
        this.k3 = i18;
        this.l3 = i19;
        this.m3 = i20;
        this.n3 = i21;
        this.o3 = i22;
        this.p3 = i23;
        this.q3 = i24;
        this.r3 = i25;
    }

    public final void E1(float f9) {
        int i10;
        this.u0 = f9;
        this.M.setTopGlowOffset((int) (f9 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float dp = f9 - AndroidUtilities.dp(74.0f);
        float f10 = this.backgroundPaddingTop + dp;
        float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2;
        g50 g50Var = this.Q0;
        j30 j30Var = this.W1;
        d30 d30Var = this.b1;
        b30 b30Var = this.a1;
        if (f10 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i10 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (g50Var != null) {
                g50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.Q1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            b30Var.setScaleX(Math.max(0.9f, f11));
            b30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            b30Var.setAlpha((1.0f - j30Var.c) * Math.max(0.0f, f12));
            d30Var.setScaleX(Math.max(0.9f, f11));
            d30Var.setScaleY(Math.max(0.9f, f11));
            d30Var.setAlpha((1.0f - j30Var.c) * Math.max(0.0f, f12));
        } else {
            b30Var.setScaleX(1.0f);
            b30Var.setScaleY(1.0f);
            b30Var.setAlpha(1.0f - j30Var.c);
            d30Var.setScaleX(1.0f);
            d30Var.setScaleY(1.0f);
            d30Var.setAlpha(1.0f - j30Var.c);
            if (this.Q1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.v1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f9 - AndroidUtilities.dp(53.0f)) - f13));
        this.f1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f9 - AndroidUtilities.dp(44.0f)) - f13));
        if (g50Var != null) {
            g50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f9 - AndroidUtilities.dp(37.0f)));
        }
        a40 a40Var = this.N;
        if (a40Var != null) {
            a40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f9 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x02d1, code lost:
    
        if ((r14 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02eb, code lost:
    
        if (r25 == (-i1())) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028e, code lost:
    
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
    public final boolean F1(View view) {
        org.telegram.ui.Cells.c4 c4Var;
        o50 o50Var;
        long j10;
        bg.l0 l0Var;
        org.telegram.ui.ActionBar.w1 w1Var;
        AccountInstance accountInstance;
        boolean z10;
        long j11;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j12;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z11;
        y40 y40Var;
        TLRPC.FileLocation fileLocation;
        int x4;
        float y8;
        float y10;
        int measuredHeight;
        int i10;
        int i11;
        ?? r42;
        boolean z12;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.T.k() && getContext() != null) {
            if (this.Y2 || this.b2) {
                d1(true);
                return false;
            }
            r40 r40Var = this.b3;
            if (r40Var != null) {
                r40Var.dismiss();
                this.b3 = null;
                return false;
            }
            b1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.W0.videoNotAvailableParticipant) {
                    c4Var = new org.telegram.ui.Cells.c4(lVar.getContext());
                    c4Var.e(this.d, lVar.getParticipant().participant, this.W0, MessageObject.getPeerId(this.w0), null, false);
                    org.telegram.ui.Components.n5 n5Var = c4Var.s;
                    if (n5Var != null) {
                        n5Var.f();
                    }
                    this.X2 = false;
                    this.U2 = lVar;
                    this.V2 = lVar.getRenderer();
                    if (!C3 && !B3) {
                        this.containerView.addView(c4Var, i7.f6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (c4Var != null) {
                        boolean z13 = (B3 || C3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = c4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ei(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new a20(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.A2 = linearLayout;
                            bg.l0 l0Var2 = new bg.l0(getContext(), linearLayout, linearLayout2, 8);
                            l0Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            l0Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.tg, false), this.Q1, 1.0f);
                            if (linearLayout2 == null || c4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                o50Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                l0Var2.addView(linearLayout2, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                o50Var = new o50(this, getContext(), participant);
                                linearLayout2.addView(o50Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            l0Var2.addView(linearLayout, i7.f6.k(0.0f, o50Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.w1 w1Var2 = new org.telegram.ui.ActionBar.w1(getContext(), R.style.scrollbarShapeStyle, l0Var2);
                            w1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(w1Var2, i7.f6.c(-2.0f, -2));
                            o50 o50Var2 = o50Var;
                            long peerId = MessageObject.getPeerId(participant.peer);
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            boolean z14 = z13;
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z15 = participant.peer instanceof TLRPC.TL_peerUser;
                            AccountInstance accountInstance2 = this.d;
                            if (z15) {
                                accountInstance = accountInstance2;
                                if (ChatObject.isChannel(this.V0)) {
                                    j10 = peerId;
                                    l0Var = l0Var2;
                                    w1Var = w1Var2;
                                    TLRPC.ChannelParticipant adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, i1());
                                    if (adminInChannel != null) {
                                        if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                        }
                                        z10 = true;
                                    }
                                    z10 = false;
                                } else {
                                    j10 = peerId;
                                    l0Var = l0Var2;
                                    w1Var = w1Var2;
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
                                l0Var = l0Var2;
                                w1Var = w1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (c4Var.c()) {
                                if (o1() && c4Var.G) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    b.h(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(c4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                b.h(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                b.h(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                b.h(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j11 = 0;
                            } else if (Q0()) {
                                if (!o1() && z10 && participant.muted) {
                                    if (o1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        b.k(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j11 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    b.h(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
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
                                        b.k(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (o1() ? !(z10 || !ChatObject.canBlockUsers(this.V0)) : !((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            b.h(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                b.k(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (o1()) {
                                }
                            } else {
                                j11 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    b.k(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    b.h(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j14 = peer2.channel_id;
                                    if (j14 != 0 && !ChatObject.isMegagroup(this.currentAccount, j14)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        b.k(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                b.k(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getContext(), i14 == 0, i14 == size2 + (-1));
                                if (((Integer) arrayList3.get(i14)).intValue() != 2) {
                                    int i15 = org.telegram.ui.ActionBar.g6.hg;
                                    r42 = 0;
                                    z12 = false;
                                    g1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i15, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                                } else {
                                    r42 = 0;
                                    z12 = false;
                                    int i16 = org.telegram.ui.ActionBar.g6.vg;
                                    g1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i16, false), org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                                }
                                g1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.w0(r42, org.telegram.ui.ActionBar.g6.eg, z12));
                                g1Var.g((CharSequence) arrayList.get(i14), ((Integer) arrayList2.get(i14)).intValue(), r42);
                                linearLayout.addView(g1Var);
                                g1Var.setTag(arrayList3.get(i14));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                g1Var.setOnClickListener(new lh.n5(this, i14, arrayList4, groupCallParticipant, 3));
                                i14++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            w1Var.addView(l0Var, i7.f6.x(-2, -2, 51));
                            x40 x40Var = this.M;
                            x40Var.B0();
                            this.U.X = false;
                            this.T2 = c4Var;
                            c4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            x40Var.invalidate();
                            AnimatorSet animatorSet = this.a3;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.a2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
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
                            org.telegram.ui.Components.voip.u uVar = this.V2;
                            boolean z16 = uVar != null && uVar.v;
                            if (forUserOrChat != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.t9 avatarImageView = this.T2.getAvatarImageView();
                                    l30 l30Var = this.b;
                                    l30Var.setParentAvatarImage(avatarImageView);
                                    l30Var.setHasActiveVideo(z16);
                                    l30Var.M(j12, true);
                                    l30Var.setCreateThumbFromParent(true);
                                    l30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.u uVar2 = this.V2;
                                    if (uVar2 != null) {
                                        uVar2.h = true;
                                        uVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.w0) == j12 && this.d2 != null && (y40Var = this.e2) != null && (fileLocation = y40Var.c) != null) {
                                        l30Var.A(y40Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.b2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.a2, i7.f6.c(-2.0f, -2));
                                this.c2 = true;
                                o30 o30Var = this.X1;
                                if (o30Var == null) {
                                    i11 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                    this.e0.O().getView().draw(canvas);
                                    canvas.drawColor(i0.a.k(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                    this.B2 = true;
                                    this.containerView.draw(canvas);
                                    i11 = 0;
                                    this.B2 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / 180));
                                    o30Var.setBackground(new BitmapDrawable(createBitmap));
                                    o30Var.setAlpha(0.0f);
                                    o30Var.setVisibility(0);
                                    o30Var.bringToFront();
                                }
                                this.Y2 = true;
                                this.y2.setVisibility(i11);
                                if (o50Var2 != null) {
                                    o50Var2.invalidate();
                                }
                                y1(true, c4Var);
                                org.telegram.ui.Components.n20 n20Var = this.W2;
                                if (n20Var != null) {
                                    n20Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.b2 = false;
                            r40 r40Var2 = new r40(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.b3 = r40Var2;
                            r40Var2.e = true;
                            r40Var2.c = 220;
                            r40Var2.setOutsideTouchable(true);
                            this.b3.setClippingEnabled(true);
                            this.b3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.b3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.b3.setInputMethodMode(2);
                            this.b3.setSoftInputMode(0);
                            this.b3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.n20 n20Var2 = this.W2;
                            if (n20Var2 != null) {
                                boolean z17 = B3;
                                j30 j30Var = this.W1;
                                f30 f30Var = this.i2;
                                if (z17) {
                                    x4 = AndroidUtilities.dp(32.0f) + (((int) (j30Var.getX() + (f30Var.getX() + n20Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i10 = ((int) (j30Var.getY() + (f30Var.getY() + this.W2.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x4 = ((int) (j30Var.getX() + (f30Var.getX() + n20Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y8 = (j30Var.getY() + (f30Var.getY() + this.W2.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i10 = (int) y8;
                                }
                            } else {
                                x4 = (int) (((x40Var.getX() + x40Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.X2) {
                                    y10 = c4Var.getY() + x40Var.getY();
                                    measuredHeight = c4Var.getClipHeight();
                                } else if (this.U2 != null) {
                                    y10 = this.U2.getY() + x40Var.getY();
                                    measuredHeight = this.U2.getMeasuredHeight();
                                } else {
                                    y8 = x40Var.getY();
                                    i10 = (int) y8;
                                }
                                i10 = (int) (y10 + measuredHeight);
                            }
                            this.b3.showAtLocation(x40Var, 51, x4, i10);
                            this.a3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.S2, org.telegram.ui.Components.r6.b, 0, 100));
                            this.a3.playTogether(arrayList5);
                            this.a3.setDuration(150L);
                            this.a3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.n20) {
                    org.telegram.ui.Components.n20 n20Var3 = (org.telegram.ui.Components.n20) view;
                    if (n20Var3.getParticipant() != this.W0.videoNotAvailableParticipant.participant) {
                        c4Var = new org.telegram.ui.Cells.c4(n20Var3.getContext());
                        c4Var.e(this.d, n20Var3.getParticipant(), this.W0, MessageObject.getPeerId(this.w0), null, false);
                        org.telegram.ui.Components.n5 n5Var2 = c4Var.s;
                        if (n5Var2 != null) {
                            n5Var2.f();
                        }
                        this.X2 = false;
                        this.W2 = n20Var3;
                        org.telegram.ui.Components.voip.u renderer = n20Var3.getRenderer();
                        this.V2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.V2 = null;
                        }
                        this.containerView.addView(c4Var, i7.f6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    c4Var = (org.telegram.ui.Cells.c4) view;
                    this.X2 = true;
                }
                if (c4Var != null) {
                }
            }
        }
        return false;
    }

    public final void G1(View view) {
        if (this.i0 == null) {
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(8, getContext(), null, true);
            this.i0 = g40Var;
            g40Var.setAlpha(0.0f);
            this.i0.setVisibility(4);
            this.i0.setShowingDuration(3000L);
            this.containerView.addView(this.i0, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.V0)) {
                this.i0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.i0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.i0.d();
        }
        this.i0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.i0.f(view, true);
    }

    public final void H1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.x2 x2Var = this.v;
        org.telegram.ui.Components.voip.x2 x2Var2 = this.h;
        org.telegram.ui.Components.voip.x2 x2Var3 = this.r;
        org.telegram.ui.Components.voip.x2 x2Var4 = this.f;
        org.telegram.ui.Components.voip.x2 x2Var5 = this.n;
        org.telegram.ui.Components.voip.x2 x2Var6 = this.s;
        org.telegram.ui.Components.voip.x2 x2Var7 = this.w;
        w20 w20Var = this.e;
        boolean z15 = false;
        if (call == null || call.isScheduled()) {
            w20Var.c(x2Var7, this.R0 > 0.1f, z10);
            w20Var.c(x2Var6, this.R0 > 0.1f, z10);
            w20Var.c(x2Var3, this.R0 > 0.1f, z10);
            w20Var.c(x2Var5, false, z10);
            w20Var.c(x2Var4, false, z10);
            w20Var.c(x2Var2, false, z10);
            w20Var.c(x2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
        Boolean bool = this.t3;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.W0.call;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.W0.canRecordVideo()) && !z16) || r1()) {
            z15 = true;
            z12 = false;
        } else {
            z12 = true;
        }
        if (z16) {
            z13 = false;
            z14 = true;
        } else {
            z13 = !z17;
            z14 = false;
        }
        if (B3) {
            z13 = false;
            z14 = false;
        }
        w20Var.c(x2Var7, true, z10);
        w20Var.c(x2Var6, true, z10);
        w20Var.c(x2Var5, z12, z10);
        w20Var.c(x2Var4, z14, z10);
        w20Var.c(x2Var3, z15, z10);
        w20Var.c(x2Var2, z13, z10);
        w20Var.c(x2Var, z11, z10);
    }

    public final void I1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.W0;
        org.telegram.ui.ActionBar.w0 w0Var = this.g1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.i1;
        if (call2 == null || call2.isScheduled()) {
            this.h1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.W0 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.h0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat3 != null) {
            this.V0 = chat3;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.V0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.j1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.V0) || ((chat2 = this.V0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.V0) || ChatObject.canUserDoAdminAction(this.V0, 3))) || (ChatObject.isChannel(this.V0) && (chat = this.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            g1Var.setVisibility(0);
        } else {
            g1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.u1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.t1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        } else {
            g1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            g1Var2.setVisibility(this.W0.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
        ChatObject.Call call4 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.m1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(8);
        } else {
            g1Var4.setVisibility(0);
        }
        g1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        g1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.s1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.k1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.o1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.p1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.W0.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (!this.W0.canRecordVideo() || this.W0.isScheduled() || r1()) {
                g1Var8.setVisibility(8);
            } else {
                g1Var8.setVisibility(0);
            }
            w0Var2.setVisibility(8);
            boolean z11 = this.W0.recording;
            m50 m50Var = this.Z0;
            m50Var.f = z11;
            m50Var.d = 1.0f;
            m50Var.invalidateSelf();
            if (this.W0.recording) {
                if (this.z1 == null) {
                    d20 d20Var = new d20(this, 6);
                    this.z1 = d20Var;
                    AndroidUtilities.runOnUIThread(d20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                d20 d20Var2 = this.z1;
                if (d20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(d20Var2);
                    this.z1 = null;
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            K1();
        } else {
            boolean z12 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
            boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z12 || (!(this.W0.canRecordVideo() || z13) || this.W0.isScheduled() || r1())) {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(8);
            } else if (z13) {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(0);
                g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
            } else {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(0);
            }
            g1Var5.setVisibility(8);
            g1Var6.setVisibility(8);
            g1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var9 = this.n1;
        if (Q02 && this.W0.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        w0Var.I(4, z10);
        this.l1.setVisibility((!r1() || this.W0.isScheduled()) ? 0 : 8);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.w1;
        if (visibility == 0 || g1Var9.getVisibility() == 0 || g1Var.getVisibility() == 0 || g1Var8.getVisibility() == 0 || g1Var7.getVisibility() == 0 || g1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.g0;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.X0) || r1() || this.w0 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.w0);
            kVar.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.V0;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !r1() || g1Var.getVisibility() != 8) {
            w0Var.setVisibility(0);
        } else {
            w0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f9 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f9)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f9);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).rightMargin = 0;
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J1(int i10, boolean z10) {
        boolean z11;
        boolean N;
        boolean N2;
        String string;
        String string2;
        boolean z12;
        String str;
        String string3;
        String string4;
        boolean N3;
        String string5;
        boolean N4;
        String string6;
        boolean N5;
        String str2;
        int i11;
        q50[] q50VarArr;
        q50 q50Var;
        q50 q50Var2;
        boolean z13;
        boolean z14;
        j30 j30Var = this.W1;
        boolean z15 = j30Var != null && j30Var.b && (AndroidUtilities.isTablet() || B3 == q1());
        if (!r1() && this.B1 == i10 && z10) {
            return;
        }
        int i12 = 3;
        org.telegram.ui.Components.xi0 xi0Var = this.F0;
        if (i10 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            N5 = xi0Var.N(202);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i13 = this.B1;
                        if (i13 == 3) {
                            int i14 = xi0Var.f;
                            N3 = (i14 == 136 || i14 == 173 || i14 == 274 || i14 == 311) ? xi0Var.N(99) : false;
                        } else if (i13 == 5) {
                            N3 = xi0Var.N(404);
                        } else if (i13 == 7) {
                            N3 = xi0Var.N(376);
                        } else if (i13 == 6) {
                            N3 = xi0Var.N(237);
                        } else {
                            if (i13 == 2) {
                                z12 = xi0Var.N(36);
                                str = string3;
                                string2 = string4;
                                z11 = false;
                                if (r1() || i10 == i12 || this.W0.isScheduled()) {
                                    str2 = string2;
                                } else {
                                    str = LocaleController.getString(z15 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                                    boolean z16 = this.C1 != z15;
                                    this.C1 = z15;
                                    z12 = z16;
                                    str2 = "";
                                }
                                String y8 = !TextUtils.isEmpty(str2) ? a4.w.y(str, " ", str2) : str;
                                org.telegram.ui.Components.voip.x2 x2Var = this.w;
                                x2Var.setContentDescription(y8);
                                x2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                                x20 x20Var = this.x;
                                ImageView imageView = this.y;
                                if (z10) {
                                    if (z12) {
                                        if (i10 == 5) {
                                            xi0Var.K(376);
                                        } else if (i10 == 7) {
                                            xi0Var.K(173);
                                        } else if (i10 == 6) {
                                            xi0Var.K(311);
                                        } else if (i10 == 0) {
                                            int i15 = this.B1;
                                            if (i15 == 5) {
                                                xi0Var.K(376);
                                            } else if (i15 == 7) {
                                                xi0Var.K(344);
                                            } else if (i15 == 6) {
                                                xi0Var.K(202);
                                            } else if (i15 == 2) {
                                                xi0Var.K(0);
                                            } else {
                                                xi0Var.K(69);
                                            }
                                        } else if (i10 == 1 || (this.B1 == 2 && o1())) {
                                            xi0Var.K(this.B1 == 4 ? 69 : 36);
                                        } else if (i10 == 4) {
                                            xi0Var.K(99);
                                        } else if (z11) {
                                            int i16 = this.B1;
                                            if (i16 == 7) {
                                                xi0Var.K(274);
                                            } else if (i16 == 6) {
                                                xi0Var.K(237);
                                            } else if (i16 == 1) {
                                                xi0Var.K(136);
                                            } else {
                                                xi0Var.K(99);
                                            }
                                        } else {
                                            int i17 = this.B1;
                                            if (i17 == 5) {
                                                xi0Var.K(376);
                                            } else if (i17 == 7) {
                                                xi0Var.K(344);
                                            } else if (i17 == 6) {
                                                xi0Var.K(202);
                                            } else if (i17 == 2 || i17 == 4) {
                                                xi0Var.K(0);
                                            } else {
                                                xi0Var.K(69);
                                            }
                                        }
                                    }
                                    x20Var.d();
                                    if (!r1() || this.W0.isScheduled()) {
                                        imageView.setVisibility(8);
                                        x20Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((j30Var != null && j30Var.b && (AndroidUtilities.isTablet() || B3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        x20Var.setVisibility(8);
                                    }
                                    this.B1 = i10;
                                } else {
                                    this.B1 = i10;
                                    xi0Var.L(xi0Var.f - 1, false, true);
                                    if (!r1() || this.W0.isScheduled()) {
                                        imageView.setVisibility(8);
                                        x20Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((j30Var != null && j30Var.b && (AndroidUtilities.isTablet() || B3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        x20Var.setVisibility(8);
                                    }
                                }
                                x2Var.invalidate();
                                i11 = this.B1;
                                q50VarArr = this.G1;
                                if (q50VarArr[i11] == null) {
                                    q50VarArr[i11] = new q50(i11);
                                    int i18 = this.B1;
                                    if (i18 == 3) {
                                        q50VarArr[i18].g = null;
                                    } else if (p1(i18)) {
                                        q50VarArr[this.B1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i19 = this.B1;
                                        if (i19 != 1) {
                                            q50VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            q50Var = q50VarArr[this.B1];
                                            q50Var2 = this.J1;
                                            if (q50Var != q50Var2) {
                                                this.I1 = q50Var2;
                                                this.J1 = q50Var;
                                                if (q50Var2 == null || !z10) {
                                                    this.H1 = 1.0f;
                                                    this.I1 = null;
                                                } else {
                                                    this.H1 = 0.0f;
                                                }
                                            }
                                            if (!z10) {
                                                q50 q50Var3 = this.J1;
                                                if (q50Var3 != null) {
                                                    int i20 = q50Var3.i;
                                                    z14 = i20 == 1 || i20 == 0;
                                                    z13 = i20 != 3;
                                                } else {
                                                    z13 = false;
                                                    z14 = false;
                                                }
                                                this.L1 = z14 ? 1.0f : 0.0f;
                                                this.M1 = z13 ? 1.0f : 0.0f;
                                            }
                                            this.e.invalidate();
                                        }
                                        q50VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                q50Var = q50VarArr[this.B1];
                                q50Var2 = this.J1;
                                if (q50Var != q50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            N3 = xi0Var.N(99);
                        }
                    } else {
                        if (i10 == 1) {
                            string5 = LocaleController.getString(o1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            N4 = xi0Var.N(this.B1 == 4 ? 99 : 69);
                        } else if (o1() && i10 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            N4 = xi0Var.N(99);
                        } else {
                            if (i10 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
                                z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
                                if (z11) {
                                    int i21 = this.B1;
                                    if (i21 == 7) {
                                        N2 = xi0Var.N(311);
                                    } else if (i21 == 6) {
                                        N2 = xi0Var.N(274);
                                    } else if (i21 == 1) {
                                        N2 = xi0Var.N(173);
                                    } else {
                                        N = xi0Var.N(136);
                                    }
                                    N = N2;
                                } else {
                                    int i22 = this.B1;
                                    if (i22 == 5) {
                                        N2 = xi0Var.N(404);
                                    } else if (i22 == 7) {
                                        N = xi0Var.N(376);
                                    } else if (i22 == 6) {
                                        N = xi0Var.N(237);
                                    } else if (i22 == 2 || i22 == 4) {
                                        N = xi0Var.N(36);
                                    } else {
                                        N2 = xi0Var.N(99);
                                    }
                                    N = N2;
                                }
                                i12 = 3;
                                if (i10 == 3) {
                                    string = LocaleController.getString(R.string.Connecting);
                                    z12 = N;
                                    string2 = "";
                                } else {
                                    string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                    string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    z12 = N;
                                }
                                str = string;
                                if (r1()) {
                                }
                                str2 = string2;
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                org.telegram.ui.Components.voip.x2 x2Var2 = this.w;
                                x2Var2.setContentDescription(y8);
                                x2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                                x20 x20Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z10) {
                                }
                                x2Var2.invalidate();
                                i11 = this.B1;
                                q50VarArr = this.G1;
                                if (q50VarArr[i11] == null) {
                                }
                                q50Var = q50VarArr[this.B1];
                                q50Var2 = this.J1;
                                if (q50Var != q50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            N3 = xi0Var.N(136);
                        }
                        z12 = N4;
                    }
                    z12 = N3;
                    str = string3;
                    string2 = string4;
                    z11 = false;
                    if (r1()) {
                    }
                    str2 = string2;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    org.telegram.ui.Components.voip.x2 x2Var22 = this.w;
                    x2Var22.setContentDescription(y8);
                    x2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                    x20 x20Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z10) {
                    }
                    x2Var22.invalidate();
                    i11 = this.B1;
                    q50VarArr = this.G1;
                    if (q50VarArr[i11] == null) {
                    }
                    q50Var = q50VarArr[this.B1];
                    q50Var2 = this.J1;
                    if (q50Var != q50Var2) {
                    }
                    if (!z10) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z12 = xi0Var.N(377);
                string2 = "";
                str = string5;
                z11 = false;
                if (r1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.x2 x2Var222 = this.w;
                x2Var222.setContentDescription(y8);
                x2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
                x20 x20Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z10) {
                }
                x2Var222.invalidate();
                i11 = this.B1;
                q50VarArr = this.G1;
                if (q50VarArr[i11] == null) {
                }
                q50Var = q50VarArr[this.B1];
                q50Var2 = this.J1;
                if (q50Var != q50Var2) {
                }
                if (!z10) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            N5 = xi0Var.N(344);
        }
        string2 = "";
        str = string6;
        z12 = N5;
        z11 = false;
        if (r1()) {
        }
        str2 = string2;
        if (!TextUtils.isEmpty(str2)) {
        }
        org.telegram.ui.Components.voip.x2 x2Var2222 = this.w;
        x2Var2222.setContentDescription(y8);
        x2Var2222.c(0, 0, 0, 1.0f, true, str, false, z10);
        x20 x20Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z10) {
        }
        x2Var2222.invalidate();
        i11 = this.B1;
        q50VarArr = this.G1;
        if (q50VarArr[i11] == null) {
        }
        q50Var = q50VarArr[this.B1];
        q50Var2 = this.J1;
        if (q50Var != q50Var2) {
        }
        if (!z10) {
        }
        this.e.invalidate();
    }

    public final void K1() {
        if (this.W0 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.W0;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.o1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f9;
        a40 a40Var = this.N;
        if ((a40Var == null || this.W0 != null) && this.T0 == null) {
            this.S0 = 1.0f;
            this.R0 = 1.0f;
            if (a40Var == null) {
                return;
            }
        }
        if (!z10) {
            a30 a30Var = this.s2;
            AndroidUtilities.cancelRunOnUIThread(a30Var);
            a30Var.run();
            ChatObject.Call call = this.W0;
            x40 x40Var = this.M;
            if (call == null || call.isScheduled()) {
                x40Var.setVisibility(4);
            } else {
                x40Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.V0);
            org.telegram.ui.ActionBar.g1 g1Var = this.s1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.R0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.jr.f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.S0 = 1.0f;
            f9 = 1.0f;
        } else {
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
            this.S0 = jrVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * jrVar.getInterpolation(this.R0 / 0.6f);
            f9 = this.R0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f9;
        a40Var.setAlpha(f11);
        this.Q.setAlpha(f9);
        this.S.setAlpha(f9);
        w40 w40Var = this.R;
        w40Var.setAlpha(f9);
        w40Var.setScaleX(interpolation);
        w40Var.setScaleY(interpolation);
        y30 y30Var = this.P;
        y30Var.setScaleX(f11);
        y30Var.setScaleY(f11);
        y30Var.setAlpha(f11);
        this.O.setAlpha(f11);
        this.g1.setAlpha(f9);
        int i10 = f11 != 0.0f ? 0 : 4;
        if (i10 != a40Var.getVisibility()) {
            a40Var.setVisibility(i10);
            y30Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        org.telegram.ui.Components.voip.x2 x2Var = this.r;
        if (x2Var == null || x2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        w20 w20Var = this.e;
        if (sharedInstance == null || r1()) {
            x2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.V0) || (ChatObject.hasAdminRights(this.V0) && ChatObject.canAddUsers(this.V0));
            vg.a aVar = (vg.a) w20Var.c.get(x2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                x2Var.setEnabled(z11);
            }
            x2Var.b(true, false);
            return;
        }
        vg.a aVar2 = (vg.a) w20Var.c.get(x2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            x2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            x2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
        } else if (z13) {
            x2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            x2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
        } else {
            x2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        }
        x2Var.b(z13, z10);
        h1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.W != i10) {
            this.W = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.X, i10);
        }
        org.telegram.ui.Components.voip.x2 x2Var2 = this.h;
        if (x2Var2.getVisibility() == 0) {
            x2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
            x2Var2.b(h1() != 1, z10);
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.v3.e;
            w20 w20Var = this.e;
            w20Var.setAlpha(f11);
            this.W1.setProgressToHideUi(f9);
            this.i2.invalidate();
            this.containerView.invalidate();
            w20Var.invalidate();
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
            this.C.invalidate();
            this.D.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(boolean z10, boolean z11) {
        long j10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        int i11;
        boolean z18;
        org.telegram.ui.Components.voip.x2 x2Var;
        org.telegram.ui.Components.voip.x2 x2Var2;
        org.telegram.ui.Components.voip.x2 x2Var3;
        boolean z19;
        boolean r12;
        int i12;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.x2 x2Var4 = this.s;
        int i13 = 6;
        if (call == null || call.isScheduled()) {
            if (Q0()) {
                i13 = 5;
            } else if (this.W0.call.schedule_start_subscribed) {
                i13 = 7;
            }
            J1(i13, z10);
            x2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            L1(false);
            return;
        }
        H1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j10 = 0;
        } else {
            j10 = 0;
            if ((this.p0 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.p0) > 3000) && ((i12 = this.P1) == 1 || i12 == 2 || i12 == 6 || i12 == 5)) {
                R0();
                J1(3, z10);
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0();
                if (!((z13 && this.W0.canRecordVideo()) || z12) || r1()) {
                    z14 = false;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = false;
                }
                if (z12) {
                    z16 = !z13;
                    i10 = 0;
                } else {
                    z16 = false;
                    i10 = 1;
                }
                if (B3) {
                    z17 = z16;
                    i11 = i10;
                } else {
                    z17 = false;
                    i11 = 0;
                }
                int i14 = i11 + (!z15 ? 2 : 0) + (!z14 ? 4 : 0);
                j30 j30Var = this.W1;
                int i15 = i14 + ((j30Var == null && j30Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.k0 | 2) == (i15 | 2);
                this.k0 = i15;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.x2 x2Var5 = this.n;
                if (z14) {
                    x2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z20, z10);
                    x2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.x2 x2Var6 = this.f;
                if (i11 != 0) {
                    x2Var6.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                    x2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.x2 x2Var7 = this.h;
                if (z17) {
                    x2Var = x2Var6;
                    x2Var2 = x2Var5;
                    x2Var3 = x2Var7;
                    z19 = z10;
                } else {
                    h1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i16 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.W != i16) {
                        this.W = i16;
                        AndroidUtilities.updateImageViewImageAnimated(this.X, i16);
                    }
                    x2Var2 = x2Var5;
                    x2Var = x2Var6;
                    x2Var7.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    x2Var3 = x2Var7;
                    z19 = z10;
                    x2Var3.b(h1() != 1, z19);
                }
                org.telegram.ui.Components.voip.x2 x2Var8 = x2Var3;
                x2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z18 && z15) {
                    M1(false);
                }
                x2Var2.d(true, z19);
                x2Var.d(true, z19);
                x2Var8.d(true, z19);
                r12 = r1();
                d30 d30Var = this.b1;
                if (r12) {
                    d30Var.setVisibility(8);
                } else {
                    d30Var.setVisibility(0);
                    boolean z21 = ((Integer) d30Var.getTag()).intValue() == 3;
                    int i17 = this.P1;
                    final boolean z22 = i17 == 3;
                    d30Var.setTag(Integer.valueOf(i17));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.d1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.c1;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i18 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.d1 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.h20
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i18, floatValue, 1.0f);
                                    r50 r50Var = r50.this;
                                    r50Var.c1.setColor(offsetColor);
                                    r50Var.b1.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    r50Var.e1 = floatValue;
                                    g50 g50Var = r50Var.Q0;
                                    if (g50Var == null || !r50Var.v2) {
                                        return;
                                    }
                                    g50Var.invalidate();
                                }
                            });
                            this.d1.setDuration(300L);
                            this.d1.setInterpolator(org.telegram.ui.Components.jr.f);
                            this.d1.addListener(new l40(this, 2));
                            this.d1.start();
                        } else {
                            paint.setColor(this.P1 == 3 ? -1163700 : -12761513);
                            d30Var.invalidate();
                        }
                    }
                }
                if (r1() || !LiteMode.isEnabled(512)) {
                }
                if (this.P1 == 3) {
                    this.v2 = true;
                    z1();
                    return;
                } else {
                    this.v2 = false;
                    AndroidUtilities.cancelRunOnUIThread(this.w2);
                    return;
                }
            }
        }
        if (this.x0 != null) {
            k1().k(0L, 37, this.x0, this.V0, null, null);
            this.x0 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || Q0()) {
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                R0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                J1(0, z10);
            } else {
                J1(1, z10);
            }
        } else {
            R0();
            if (groupCallParticipant2.raise_hand_rating != j10) {
                J1(4, z10);
            } else {
                J1(2, z10);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.w0));
        if (groupCallParticipant3 == null) {
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
        }
        if (B3) {
        }
        int i142 = i11 + (!z15 ? 2 : 0) + (!z14 ? 4 : 0);
        j30 j30Var2 = this.W1;
        int i152 = i142 + ((j30Var2 == null && j30Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.k0 | 2) == (i152 | 2)) {
        }
        this.k0 = i152;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.x2 x2Var52 = this.n;
        if (z14) {
        }
        org.telegram.ui.Components.voip.x2 x2Var62 = this.f;
        if (i11 != 0) {
        }
        org.telegram.ui.Components.voip.x2 x2Var72 = this.h;
        if (z17) {
        }
        org.telegram.ui.Components.voip.x2 x2Var82 = x2Var3;
        x2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            M1(false);
        }
        x2Var2.d(true, z19);
        x2Var.d(true, z19);
        x2Var82.d(true, z19);
        r12 = r1();
        d30 d30Var2 = this.b1;
        if (r12) {
        }
        if (r1()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b0 A[LOOP:2: B:137:0x02aa->B:139:0x02b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(boolean z10) {
        x40 x40Var;
        l50 l50Var;
        j30 j30Var;
        x40 x40Var2;
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z11;
        ArrayList arrayList2;
        int i12;
        int i13;
        x40 x40Var3;
        j30 j30Var2;
        f30 f30Var;
        ArrayList arrayList3;
        int i14;
        ChatObject.Call call;
        boolean z12;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        f2.n1 G;
        int i15;
        r50 r50Var = this;
        l50 l50Var2 = r50Var.L;
        j30 j30Var3 = r50Var.W1;
        if (j30Var3 == null || (x40Var = r50Var.M) == null || r50Var.W0 == null || r50Var.o0) {
            return;
        }
        if (j30Var3.b) {
            j30Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(r50Var.W0.selfPeer);
        if (peerId != MessageObject.getPeerId(r50Var.w0) && r50Var.W0.participants.f(peerId) != null) {
            r50Var.w0 = r50Var.W0.selfPeer;
        }
        int childCount = x40Var.getChildCount();
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = x40Var.getChildAt(i18);
            f2.n1 G2 = x40Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i16)) {
                i17 = G2.c();
                i16 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList4 = r50Var.m0;
        arrayList4.clear();
        if (!C3) {
            arrayList4.addAll(r50Var.W0.visibleVideoParticipants);
        } else if (j30Var3.b) {
            arrayList4.addAll(r50Var.W0.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = j30Var3.e;
            if (videoParticipant3 != null) {
                arrayList4.remove(videoParticipant3);
            }
        }
        if (x40Var.getItemAnimator() != null && !z10) {
            x40Var.setItemAnimator(null);
        } else if (x40Var.getItemAnimator() == null && z10) {
            x40Var.setItemAnimator(r50Var.T);
        }
        try {
            h hVar = new h(l50Var2, 21);
            try {
                try {
                    z11 = true;
                    try {
                        try {
                            try {
                                i15 = i17;
                                try {
                                    j30Var = j30Var3;
                                } catch (Exception e10) {
                                    e = e10;
                                    j30Var = j30Var3;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                i11 = i17;
                                j30Var = j30Var3;
                                x40Var2 = x40Var;
                                i10 = childCount;
                                arrayList = arrayList4;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            l50Var = l50Var2;
                            arrayList = arrayList4;
                            i11 = i17;
                            j30Var = j30Var3;
                            x40Var2 = x40Var;
                            i10 = childCount;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        l50Var = l50Var2;
                        i10 = childCount;
                        arrayList = arrayList4;
                        i11 = i17;
                        j30Var = j30Var3;
                        x40Var2 = x40Var;
                    }
                } catch (Exception e14) {
                    e = e14;
                    l50Var = l50Var2;
                    i10 = childCount;
                    arrayList = arrayList4;
                    i11 = i17;
                    j30Var = j30Var3;
                    x40Var2 = x40Var;
                }
                try {
                    x40Var2 = x40Var;
                    try {
                        try {
                            try {
                            } catch (Exception e15) {
                                e = e15;
                                arrayList = arrayList4;
                                i11 = i15;
                                i10 = childCount;
                                z11 = true;
                                l50Var = l50Var2;
                                FileLog.e(e);
                                l50Var.l();
                                r50Var.W0.saveActiveDates();
                                if (view != null) {
                                }
                                ArrayList arrayList5 = r50Var.z0;
                                arrayList5.clear();
                                arrayList5.addAll(r50Var.W0.visibleParticipants);
                                ArrayList arrayList6 = r50Var.A0;
                                arrayList6.clear();
                                arrayList2 = arrayList;
                                arrayList6.addAll(arrayList2);
                                ArrayList arrayList7 = r50Var.B0;
                                arrayList7.clear();
                                arrayList7.addAll(r50Var.W0.invitedUsers);
                                ArrayList arrayList8 = r50Var.C0;
                                arrayList8.clear();
                                arrayList8.addAll(r50Var.W0.shadyJoinParticipants);
                                ArrayList arrayList9 = r50Var.D0;
                                arrayList9.clear();
                                arrayList9.addAll(r50Var.W0.shadyLeftParticipants);
                                l50 l50Var3 = l50Var;
                                r50Var.E0 = l50Var3.B;
                                i12 = i10;
                                i13 = 0;
                                while (i13 < i12) {
                                }
                                x40Var3 = x40Var2;
                                boolean c3 = j30Var.c();
                                j30Var2 = j30Var;
                                if (j30Var2.b) {
                                    if (!arrayList2.isEmpty()) {
                                    }
                                    org.telegram.ui.Components.o20 o20Var = r50Var.l2;
                                    f30Var = r50Var.i2;
                                    o20Var.G(f30Var, z11);
                                    if (f30Var.getVisibility() == 0) {
                                    }
                                    if (C3) {
                                    }
                                    if (x40Var3.getVisibility() == 0) {
                                    }
                                    arrayList3 = r50Var.V1;
                                    arrayList3.clear();
                                    arrayList3.addAll(r50Var.U1);
                                    while (i14 < arrayList3.size()) {
                                    }
                                    call = r50Var.W0;
                                    if (call != null) {
                                    }
                                    ChatObject.Call call2 = r50Var.W0;
                                    if (call2 == null) {
                                    }
                                    r50Var.y3.a(z12, z10);
                                    if (z12 != r50Var.E2) {
                                    }
                                }
                                org.telegram.ui.Components.o20 o20Var2 = r50Var.l2;
                                f30Var = r50Var.i2;
                                o20Var2.G(f30Var, z11);
                                if (f30Var.getVisibility() == 0) {
                                }
                                if (C3) {
                                }
                                if (x40Var3.getVisibility() == 0) {
                                }
                                arrayList3 = r50Var.V1;
                                arrayList3.clear();
                                arrayList3.addAll(r50Var.U1);
                                while (i14 < arrayList3.size()) {
                                }
                                call = r50Var.W0;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = r50Var.W0;
                                if (call22 == null) {
                                }
                                r50Var.y3.a(z12, z10);
                                if (z12 != r50Var.E2) {
                                }
                            }
                        } catch (Exception e16) {
                            e = e16;
                            i10 = childCount;
                            arrayList = arrayList4;
                            i11 = i15;
                        }
                        try {
                            arrayList = arrayList4;
                            i11 = i15;
                            i10 = childCount;
                            r50Var = this;
                            l50Var = l50Var2;
                        } catch (Exception e17) {
                            e = e17;
                            z11 = true;
                            r50Var = this;
                            arrayList = arrayList4;
                            i11 = i15;
                            i10 = childCount;
                            l50Var = l50Var2;
                            FileLog.e(e);
                            l50Var.l();
                            r50Var.W0.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList52 = r50Var.z0;
                            arrayList52.clear();
                            arrayList52.addAll(r50Var.W0.visibleParticipants);
                            ArrayList arrayList62 = r50Var.A0;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = r50Var.B0;
                            arrayList72.clear();
                            arrayList72.addAll(r50Var.W0.invitedUsers);
                            ArrayList arrayList82 = r50Var.C0;
                            arrayList82.clear();
                            arrayList82.addAll(r50Var.W0.shadyJoinParticipants);
                            ArrayList arrayList92 = r50Var.D0;
                            arrayList92.clear();
                            arrayList92.addAll(r50Var.W0.shadyLeftParticipants);
                            l50 l50Var32 = l50Var;
                            r50Var.E0 = l50Var32.B;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            x40Var3 = x40Var2;
                            boolean c32 = j30Var.c();
                            j30Var2 = j30Var;
                            if (j30Var2.b) {
                            }
                            org.telegram.ui.Components.o20 o20Var22 = r50Var.l2;
                            f30Var = r50Var.i2;
                            o20Var22.G(f30Var, z11);
                            if (f30Var.getVisibility() == 0) {
                            }
                            if (C3) {
                            }
                            if (x40Var3.getVisibility() == 0) {
                            }
                            arrayList3 = r50Var.V1;
                            arrayList3.clear();
                            arrayList3.addAll(r50Var.U1);
                            while (i14 < arrayList3.size()) {
                            }
                            call = r50Var.W0;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = r50Var.W0;
                            if (call222 == null) {
                            }
                            r50Var.y3.a(z12, z10);
                            if (z12 != r50Var.E2) {
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        i10 = childCount;
                        arrayList = arrayList4;
                        i11 = i15;
                        l50Var = l50Var2;
                        FileLog.e(e);
                        l50Var.l();
                        r50Var.W0.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList522 = r50Var.z0;
                        arrayList522.clear();
                        arrayList522.addAll(r50Var.W0.visibleParticipants);
                        ArrayList arrayList622 = r50Var.A0;
                        arrayList622.clear();
                        arrayList2 = arrayList;
                        arrayList622.addAll(arrayList2);
                        ArrayList arrayList722 = r50Var.B0;
                        arrayList722.clear();
                        arrayList722.addAll(r50Var.W0.invitedUsers);
                        ArrayList arrayList822 = r50Var.C0;
                        arrayList822.clear();
                        arrayList822.addAll(r50Var.W0.shadyJoinParticipants);
                        ArrayList arrayList922 = r50Var.D0;
                        arrayList922.clear();
                        arrayList922.addAll(r50Var.W0.shadyLeftParticipants);
                        l50 l50Var322 = l50Var;
                        r50Var.E0 = l50Var322.B;
                        i12 = i10;
                        i13 = 0;
                        while (i13 < i12) {
                        }
                        x40Var3 = x40Var2;
                        boolean c322 = j30Var.c();
                        j30Var2 = j30Var;
                        if (j30Var2.b) {
                        }
                        org.telegram.ui.Components.o20 o20Var222 = r50Var.l2;
                        f30Var = r50Var.i2;
                        o20Var222.G(f30Var, z11);
                        if (f30Var.getVisibility() == 0) {
                        }
                        if (C3) {
                        }
                        if (x40Var3.getVisibility() == 0) {
                        }
                        arrayList3 = r50Var.V1;
                        arrayList3.clear();
                        arrayList3.addAll(r50Var.U1);
                        while (i14 < arrayList3.size()) {
                        }
                        call = r50Var.W0;
                        if (call != null) {
                        }
                        ChatObject.Call call2222 = r50Var.W0;
                        if (call2222 == null) {
                        }
                        r50Var.y3.a(z12, z10);
                        if (z12 != r50Var.E2) {
                        }
                    }
                    try {
                        r50Var.D1(l50Var2.G, l50Var2.w, l50Var2.d, l50Var2.e, l50Var2.f, l50Var2.h, l50Var2.n, l50Var2.r, l50Var2.s, l50Var2.v, l50Var2.C, l50Var2.D, l50Var2.E, l50Var2.F, l50Var2.x, l50Var2.y);
                        l50Var.E();
                        z11 = true;
                        try {
                            f2.q.c(r50Var.s3, true).a(hVar);
                        } catch (Exception e19) {
                            e = e19;
                            FileLog.e(e);
                            l50Var.l();
                            r50Var.W0.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList5222 = r50Var.z0;
                            arrayList5222.clear();
                            arrayList5222.addAll(r50Var.W0.visibleParticipants);
                            ArrayList arrayList6222 = r50Var.A0;
                            arrayList6222.clear();
                            arrayList2 = arrayList;
                            arrayList6222.addAll(arrayList2);
                            ArrayList arrayList7222 = r50Var.B0;
                            arrayList7222.clear();
                            arrayList7222.addAll(r50Var.W0.invitedUsers);
                            ArrayList arrayList8222 = r50Var.C0;
                            arrayList8222.clear();
                            arrayList8222.addAll(r50Var.W0.shadyJoinParticipants);
                            ArrayList arrayList9222 = r50Var.D0;
                            arrayList9222.clear();
                            arrayList9222.addAll(r50Var.W0.shadyLeftParticipants);
                            l50 l50Var3222 = l50Var;
                            r50Var.E0 = l50Var3222.B;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            x40Var3 = x40Var2;
                            boolean c3222 = j30Var.c();
                            j30Var2 = j30Var;
                            if (j30Var2.b) {
                            }
                            org.telegram.ui.Components.o20 o20Var2222 = r50Var.l2;
                            f30Var = r50Var.i2;
                            o20Var2222.G(f30Var, z11);
                            if (f30Var.getVisibility() == 0) {
                            }
                            if (C3) {
                            }
                            if (x40Var3.getVisibility() == 0) {
                            }
                            arrayList3 = r50Var.V1;
                            arrayList3.clear();
                            arrayList3.addAll(r50Var.U1);
                            while (i14 < arrayList3.size()) {
                            }
                            call = r50Var.W0;
                            if (call != null) {
                            }
                            ChatObject.Call call22222 = r50Var.W0;
                            if (call22222 == null) {
                            }
                            r50Var.y3.a(z12, z10);
                            if (z12 != r50Var.E2) {
                            }
                        }
                    } catch (Exception e20) {
                        e = e20;
                        z11 = true;
                        FileLog.e(e);
                        l50Var.l();
                        r50Var.W0.saveActiveDates();
                        if (view != null) {
                        }
                        ArrayList arrayList52222 = r50Var.z0;
                        arrayList52222.clear();
                        arrayList52222.addAll(r50Var.W0.visibleParticipants);
                        ArrayList arrayList62222 = r50Var.A0;
                        arrayList62222.clear();
                        arrayList2 = arrayList;
                        arrayList62222.addAll(arrayList2);
                        ArrayList arrayList72222 = r50Var.B0;
                        arrayList72222.clear();
                        arrayList72222.addAll(r50Var.W0.invitedUsers);
                        ArrayList arrayList82222 = r50Var.C0;
                        arrayList82222.clear();
                        arrayList82222.addAll(r50Var.W0.shadyJoinParticipants);
                        ArrayList arrayList92222 = r50Var.D0;
                        arrayList92222.clear();
                        arrayList92222.addAll(r50Var.W0.shadyLeftParticipants);
                        l50 l50Var32222 = l50Var;
                        r50Var.E0 = l50Var32222.B;
                        i12 = i10;
                        i13 = 0;
                        while (i13 < i12) {
                        }
                        x40Var3 = x40Var2;
                        boolean c32222 = j30Var.c();
                        j30Var2 = j30Var;
                        if (j30Var2.b) {
                        }
                        org.telegram.ui.Components.o20 o20Var22222 = r50Var.l2;
                        f30Var = r50Var.i2;
                        o20Var22222.G(f30Var, z11);
                        if (f30Var.getVisibility() == 0) {
                        }
                        if (C3) {
                        }
                        if (x40Var3.getVisibility() == 0) {
                        }
                        arrayList3 = r50Var.V1;
                        arrayList3.clear();
                        arrayList3.addAll(r50Var.U1);
                        while (i14 < arrayList3.size()) {
                        }
                        call = r50Var.W0;
                        if (call != null) {
                        }
                        ChatObject.Call call222222 = r50Var.W0;
                        if (call222222 == null) {
                        }
                        r50Var.y3.a(z12, z10);
                        if (z12 != r50Var.E2) {
                        }
                    }
                } catch (Exception e21) {
                    e = e21;
                    x40Var2 = x40Var;
                    i10 = childCount;
                    arrayList = arrayList4;
                    i11 = i15;
                    l50Var = l50Var2;
                    FileLog.e(e);
                    l50Var.l();
                    r50Var.W0.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList522222 = r50Var.z0;
                    arrayList522222.clear();
                    arrayList522222.addAll(r50Var.W0.visibleParticipants);
                    ArrayList arrayList622222 = r50Var.A0;
                    arrayList622222.clear();
                    arrayList2 = arrayList;
                    arrayList622222.addAll(arrayList2);
                    ArrayList arrayList722222 = r50Var.B0;
                    arrayList722222.clear();
                    arrayList722222.addAll(r50Var.W0.invitedUsers);
                    ArrayList arrayList822222 = r50Var.C0;
                    arrayList822222.clear();
                    arrayList822222.addAll(r50Var.W0.shadyJoinParticipants);
                    ArrayList arrayList922222 = r50Var.D0;
                    arrayList922222.clear();
                    arrayList922222.addAll(r50Var.W0.shadyLeftParticipants);
                    l50 l50Var322222 = l50Var;
                    r50Var.E0 = l50Var322222.B;
                    i12 = i10;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    x40Var3 = x40Var2;
                    boolean c322222 = j30Var.c();
                    j30Var2 = j30Var;
                    if (j30Var2.b) {
                    }
                    org.telegram.ui.Components.o20 o20Var222222 = r50Var.l2;
                    f30Var = r50Var.i2;
                    o20Var222222.G(f30Var, z11);
                    if (f30Var.getVisibility() == 0) {
                    }
                    if (C3) {
                    }
                    if (x40Var3.getVisibility() == 0) {
                    }
                    arrayList3 = r50Var.V1;
                    arrayList3.clear();
                    arrayList3.addAll(r50Var.U1);
                    while (i14 < arrayList3.size()) {
                    }
                    call = r50Var.W0;
                    if (call != null) {
                    }
                    ChatObject.Call call2222222 = r50Var.W0;
                    if (call2222222 == null) {
                    }
                    r50Var.y3.a(z12, z10);
                    if (z12 != r50Var.E2) {
                    }
                }
            } catch (Exception e22) {
                e = e22;
                l50Var = l50Var2;
                x40Var2 = x40Var;
                i10 = childCount;
                arrayList = arrayList4;
                i11 = i17;
                j30Var = j30Var3;
            }
        } catch (Exception e23) {
            e = e23;
            l50Var = l50Var2;
            j30Var = j30Var3;
            x40Var2 = x40Var;
            i10 = childCount;
            arrayList = arrayList4;
            i11 = i17;
        }
        r50Var.W0.saveActiveDates();
        if (view != null) {
            r50Var.U.h1(i11, view.getTop() - x40Var2.getPaddingTop());
        }
        ArrayList arrayList5222222 = r50Var.z0;
        arrayList5222222.clear();
        arrayList5222222.addAll(r50Var.W0.visibleParticipants);
        ArrayList arrayList6222222 = r50Var.A0;
        arrayList6222222.clear();
        arrayList2 = arrayList;
        arrayList6222222.addAll(arrayList2);
        ArrayList arrayList7222222 = r50Var.B0;
        arrayList7222222.clear();
        arrayList7222222.addAll(r50Var.W0.invitedUsers);
        ArrayList arrayList8222222 = r50Var.C0;
        arrayList8222222.clear();
        arrayList8222222.addAll(r50Var.W0.shadyJoinParticipants);
        ArrayList arrayList9222222 = r50Var.D0;
        arrayList9222222.clear();
        arrayList9222222.addAll(r50Var.W0.shadyLeftParticipants);
        l50 l50Var3222222 = l50Var;
        r50Var.E0 = l50Var3222222.B;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            x40 x40Var4 = x40Var2;
            View childAt2 = x40Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.c4) || (childAt2 instanceof org.telegram.ui.Cells.t3)) && (G = x40Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.c4) {
                    ((org.telegram.ui.Cells.c4) childAt2).setDrawDivider(G.b() != l50Var3222222.B + (-2));
                } else {
                    ((org.telegram.ui.Cells.t3) childAt2).setDrawDivider(G.b() != l50Var3222222.B + (-2));
                }
            }
            i13++;
            x40Var2 = x40Var4;
        }
        x40Var3 = x40Var2;
        boolean c3222222 = j30Var.c();
        j30Var2 = j30Var;
        if (j30Var2.b && (videoParticipant2 = j30Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, r50Var.W0)) {
            if (!arrayList2.isEmpty()) {
                r50Var.e1(null);
            } else if (c3222222) {
                r50Var.e1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.o20 o20Var2222222 = r50Var.l2;
            f30Var = r50Var.i2;
            o20Var2222222.G(f30Var, z11);
            if (f30Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(f30Var);
            }
            if (C3) {
                r50Var.k2.I(r50Var.j2, z11);
            }
            if (x40Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(x40Var3);
            }
            arrayList3 = r50Var.V1;
            arrayList3.clear();
            arrayList3.addAll(r50Var.U1);
            for (i14 = 0; i14 < arrayList3.size(); i14++) {
                ((org.telegram.ui.Components.voip.u) arrayList3.get(i14)).j(z11);
            }
            call = r50Var.W0;
            if (call != null && j30Var2.b && (videoParticipant = j30Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call22222222 = r50Var.W0;
            z12 = call22222222 == null && !call22222222.visibleVideoParticipants.isEmpty();
            r50Var.y3.a(z12, z10);
            if (z12 != r50Var.E2) {
                r50Var.E2 = z12;
                if (C3) {
                    r50Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.o20 o20Var22222222 = r50Var.l2;
        f30Var = r50Var.i2;
        o20Var22222222.G(f30Var, z11);
        if (f30Var.getVisibility() == 0) {
        }
        if (C3) {
        }
        if (x40Var3.getVisibility() == 0) {
        }
        arrayList3 = r50Var.V1;
        arrayList3.clear();
        arrayList3.addAll(r50Var.U1);
        while (i14 < arrayList3.size()) {
        }
        call = r50Var.W0;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call222222222 = r50Var.W0;
        if (call222222222 == null) {
        }
        r50Var.y3.a(z12, z10);
        if (z12 != r50Var.E2) {
        }
    }

    public final void O1() {
        boolean z10;
        p50 p50Var;
        n40 n40Var = this.K;
        if (n40Var == null || this.W0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.W0.currentSpeakingPeers.m(); i11++) {
            long j10 = this.W0.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.currentSpeakingPeers.f(j10);
            if (!groupCallParticipant.self) {
                j30 j30Var = this.W1;
                j30Var.getClass();
                if (j30Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.x2.get(j10, 0) != 1) {
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
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0);
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
            n40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 subtitleTextView = n40Var.getSubtitleTextView();
        String str = r1() ? "ViewersWatching" : "Participants";
        int i12 = this.W0.call.participants_count;
        l50 l50Var = this.L;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((l50Var.I.r1() || l50Var.H || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (r1() && (p50Var = this.x1) != null) {
            p50Var.setWatchersCount(this.W0.call.participants_count);
        }
        if (z10 != this.q2) {
            this.q2 = z10;
            n40Var.invalidate();
            n40Var.getSubtitleTextView().setPivotX(0.0f);
            n40Var.getSubtitleTextView().setPivotY(n40Var.getMeasuredHeight() >> 1);
            n40Var.getSubtitleTextView().animate().scaleX(this.q2 ? 0.98f : 1.0f).scaleY(this.q2 ? 0.9f : 1.0f).alpha(this.q2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(n40Var.getAdditionalSubtitleTextView(), this.q2);
        }
    }

    public final int P0() {
        x40 x40Var = this.M;
        int childCount = x40Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = x40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.W0;
        b30 b30Var = this.a1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.V0)) {
                b30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                b30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        n40 n40Var = this.K;
        if (isEmpty) {
            TLRPC.Chat chat = this.V0;
            if (chat != null && !chat.title.equals(n40Var.getTitle())) {
                if (z10) {
                    this.K.I(this.V0.title, true, 180L, null);
                    n40Var.getTitleTextView().setOnClickListener(new b20(this, 9));
                } else {
                    n40Var.setTitle(this.V0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.V0)) {
                    b30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (r1()) {
                    b30Var.b(this.V0.title, z10);
                } else {
                    b30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.V0 == null) {
                n40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                b30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.W0.call.title.equals(n40Var.getTitle())) {
            if (z10) {
                this.K.I(this.W0.call.title, true, 180L, null);
                n40Var.getTitleTextView().setOnClickListener(new b20(this, 8));
            } else {
                n40Var.setTitle(this.W0.call.title);
            }
            b30Var.b(this.W0.call.title, z10);
        }
        org.telegram.ui.ActionBar.h5 titleTextView = n40Var.getTitleTextView();
        if (!this.W0.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                b30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                b30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new n50(titleTextView));
            TextView textView = b30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new n50(textView), (Drawable) null);
            TextView nextTextView = b30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new n50(nextTextView), (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.V0);
        }
        ChatObject.Call call = this.W0;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void Q1() {
        float f9;
        org.telegram.ui.Components.rb rbVar;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.u0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f9 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f10 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r0) * f9);
        } else {
            f9 = 0.0f;
        }
        this.topBulletinContainer.setTranslationY(AndroidUtilities.lerp(((-r0.getTop()) - this.topBulletinContainer.getHeight()) + f10 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), this.K.getY() + (-this.topBulletinContainer.getTop()) + r4.getHeight(), f9));
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
        if (mcVar == null || (rbVar = mcVar.e) == null || rbVar.getParent() == null || rbVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        rbVar.setTop(f9 > 0.5f);
    }

    public final void R0() {
        if (this.N1) {
            this.N1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.u2);
        }
        if (this.O1) {
            this.O1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0() {
        boolean z10;
        if (!this.Y2) {
            o30 o30Var = this.X1;
            if (o30Var.getVisibility() == 0 && o30Var.getAlpha() == 1.0f) {
                z10 = true;
                if (this.h2 == z10) {
                    this.h2 = z10;
                    this.e.invalidate();
                    this.containerView.invalidate();
                    this.M.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.h2 == z10) {
        }
    }

    public final void T0() {
        this.B.setTranslationY((-this.y1.c()) + this.containerView.getPaddingBottom());
        this.C.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.v3.e);
        U0();
        V0();
    }

    public final void U0() {
        float f9 = this.y1.b.a;
        int i10 = f9 > 0.0f ? 0 : 8;
        u30 u30Var = this.B;
        u30Var.setAlpha(f9);
        t30 t30Var = this.C;
        t30Var.setAlpha(f9);
        if (u30Var.getVisibility() != i10) {
            u30Var.setVisibility(i10);
            t30Var.setVisibility(i10);
            if (i10 == 8) {
                r30 r30Var = this.D;
                if (r30Var.isFocused()) {
                    r30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        org.telegram.ui.Components.fk0 fk0Var = this.G;
        if (fk0Var != null) {
            float f9 = this.y1.b.a * this.w3.e;
            fk0Var.setAlpha(f9);
            int i10 = f9 > 0.0f ? 0 : 8;
            if (this.G.getVisibility() != i10) {
                this.G.setVisibility(i10);
                if (i10 == 8) {
                    this.G.n();
                }
            }
            org.telegram.ui.Components.fk0 fk0Var2 = this.G;
            if (fk0Var2.J0 || f9 != 1.0f) {
                return;
            }
            fk0Var2.J0 = true;
        }
    }

    public final void W0() {
        boolean z10 = C3;
        w20 w20Var = this.e;
        if (z10) {
            w20Var.setTranslationX(0.0f);
            w20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        vd.a aVar = this.v3;
        if (z11) {
            w20Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            w20Var.setTranslationY(0.0f);
        } else {
            w20Var.setTranslationX(0.0f);
            w20Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void X0() {
        boolean z10 = C3;
        f30 f30Var = this.i2;
        if (z10) {
            f30Var.setTranslationX(0.0f);
            f30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        vd.a aVar = this.v3;
        if (z11) {
            f30Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            f30Var.setTranslationY(0.0f);
        } else {
            f30Var.setTranslationX(0.0f);
            f30Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        float f9 = this.x3.e;
        ah.i iVar = this.y1;
        float lerp = AndroidUtilities.lerp(C3 ? (1.0f - this.y3.e) * AndroidUtilities.dp(-91.0f) : B3 ? 0.0f : ((this.v3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.W1.c)) - AndroidUtilities.dp(91.0f), -((iVar.c() - this.containerView.getPaddingBottom()) + f9 + (AndroidUtilities.dp(68.0f) * this.w3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.u0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        wg.h hVar = this.Y;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.G != null) {
            this.G.setTranslationY((-this.y1.c()) + this.containerView.getPaddingBottom() + ((-this.w3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        float f9 = this.w3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f9);
        ImageView imageView = this.F;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f9));
        imageView.setAlpha(f9);
        imageView.setClickable(f9 > 0.9f);
        float f10 = 1.0f - f9;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView2 = this.E;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        imageView2.setClickable(f10 > 0.9f);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.u uVar = this.V2;
        if (uVar != null) {
            uVar.a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.u uVar2 = this.V2;
            uVar2.h = false;
            uVar2.j(false);
            this.V2.invalidate();
            this.W1.invalidate();
        }
        org.telegram.ui.Cells.c4 c4Var = this.T2;
        if (c4Var != null && !this.X2 && c4Var.getParent() != null) {
            this.containerView.removeView(this.T2);
        }
        org.telegram.ui.Cells.c4 c4Var2 = this.T2;
        if (c4Var2 != null) {
            c4Var2.setProgressToAvatarPreview(0.0f);
            this.T2.setAboutVisible(false);
            this.T2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.n20 n20Var = this.W2;
        if (n20Var != null) {
            n20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.T2 = null;
        this.U2 = null;
        this.W2 = null;
        this.V2 = null;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return !this.W1.b;
    }

    public final void d1(boolean z10) {
        if (this.Y2 || !this.b2) {
            return;
        }
        if (z10) {
            this.Y2 = true;
            y1(false, this.T2);
            return;
        }
        b1();
        this.containerView.removeView(this.a2);
        this.a2 = null;
        this.y2.setVisibility(8);
        this.containerView.invalidate();
        this.b2 = false;
        this.U.X = true;
        this.M.invalidate();
        this.X1.setVisibility(8);
        if (this.o0) {
            this.o0 = false;
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
        x40 x40Var = this.M;
        int i15 = 0;
        if (i10 == i14) {
            Long l10 = (Long) objArr[1];
            ChatObject.Call call = this.W0;
            if (call == null || call.call.id != l10.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.W0;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j10 = this.p0;
            AccountInstance accountInstance = this.d;
            if (j10 == 0 && (((i13 = this.B1) == 7 || i13 == 5 || i13 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.e0, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", i1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.X0);
                    intent.putExtra("peerChannelId", this.U0.channel_id);
                    intent.putExtra("peerChatId", this.U0.chat_id);
                    intent.putExtra("peerUserId", this.U0.user_id);
                    intent.putExtra("hash", this.Y0);
                    intent.putExtra("peerAccessHash", this.U0.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.g2);
                    this.e0.startService(intent);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                this.p0 = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new d20(this, 2), 3000L);
            }
            if (!this.q0 && VoIPService.getSharedInstance() != null) {
                this.W0.addSelfDummyParticipant(false);
                l1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            I1();
            int childCount = x40Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = x40Var.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.c4) {
                    ((org.telegram.ui.Cells.c4) childAt).a(true, false);
                }
            }
            if (this.T2 != null) {
                this.o0 = true;
            } else {
                O0(true);
            }
            O1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.B1 == 4;
            N1(true, booleanValue);
            P1(true);
            if (z10 && ((i12 = this.B1) == 1 || i12 == 0)) {
                k1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l11 = (Long) objArr[3];
                long longValue = l11.longValue();
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
                    TLRPC.User user = accountInstance.getMessagesController().getUser(l11);
                    if (user != null) {
                        if (this.W0.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i15 != 0) {
                            k1().k(0L, 44, user, this.V0, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.W0.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i15 != 0) {
                        k1().k(0L, 44, chat, this.V0, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            j30 j30Var = this.W1;
            if (j30Var.b && this.W0 != null) {
                boolean c3 = j30Var.c();
                ChatObject.Call call3 = this.W0;
                if (call3 != null && j30Var.b && (videoParticipant = j30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c3 = true;
                }
                if (c3) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i18 = 0;
                    while (true) {
                        ArrayList arrayList = this.m0;
                        if (i18 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i18);
                        if (this.W0.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && j30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            j30Var.setVisibleParticipant(true);
            O1();
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
                    string = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.getString(R.string.VoipChannelTooMuch) : LocaleController.getString(R.string.VoipGroupTooMuch);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin) : LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                }
                AlertDialog$Builder N = org.telegram.ui.Components.c5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new g20(this, 1));
                try {
                    N.o();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.w0);
            ChatObject.Call call4 = this.W0;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            O0(true);
            AndroidUtilities.updateVisibleRows(x40Var);
            if (this.A2 != null) {
                while (i15 < this.A2.getChildCount()) {
                    View childAt2 = this.A2.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = x40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                f2.n1 G = x40Var.G(x40Var.getChildAt(i15));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.c4) {
                        org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) view;
                        if (c4Var.getParticipant() != null) {
                            c4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i15++;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l12 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.w0);
            if (this.W0 == null || peerId2 != l12.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            O0(true);
            AndroidUtilities.updateVisibleRows(x40Var);
            if (this.A2 != null) {
                while (i15 < this.A2.getChildCount()) {
                    View childAt3 = this.A2.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt3).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(x40Var);
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
            AndroidUtilities.updateVisibleRows(x40Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            d40 d40Var = this.v0;
            if (d40Var != null) {
                d40Var.b(true, true);
            }
            I1();
            return;
        }
        if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            b50 b50Var = this.l0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            b50Var.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        LaunchActivity launchActivity = this.e0;
        launchActivity.W0.remove(this.r2);
        this.e0.setRequestedOrientation(-1);
        A3 = false;
        org.telegram.ui.Components.p30 p30Var = this.A1;
        if (p30Var != null) {
            p30Var.dismiss();
        }
        this.o0 = true;
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

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        j30 j30Var = this.W1;
        if (j30Var != null) {
            if (this.m2 != null) {
                this.M.getViewTreeObserver().removeOnPreDrawListener(this.m2);
                this.m2 = null;
            }
            ArrayList arrayList = this.V1;
            arrayList.clear();
            ArrayList arrayList2 = this.U1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).f();
                j30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (j30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(j30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (z3 == this) {
            z3 = null;
        }
        A3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.w20.j(getContext());
        ChatObject.Call call = this.W0;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.e0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.e0.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
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
            this.e0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            j30 j30Var = this.W1;
            if (j30Var.r != null) {
                return;
            }
            boolean z10 = C3;
            x40 x40Var = this.M;
            int i10 = 0;
            if (!z10) {
                if (this.m2 != null) {
                    x40Var.getViewTreeObserver().removeOnPreDrawListener(this.m2);
                    this.m2 = null;
                }
                if (videoParticipant == null) {
                    if (x40Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = x40Var.getViewTreeObserver();
                        k40 k40Var = new k40(this);
                        this.m2 = k40Var;
                        viewTreeObserver.addOnPreDrawListener(k40Var);
                        return;
                    }
                    x40Var.setVisibility(0);
                    O0(false);
                    this.o0 = true;
                    ViewTreeObserver viewTreeObserver2 = x40Var.getViewTreeObserver();
                    j40 j40Var = new j40(this);
                    this.m2 = j40Var;
                    viewTreeObserver2.addOnPreDrawListener(j40Var);
                    return;
                }
                f30 f30Var = this.i2;
                if (f30Var.getVisibility() == 0) {
                    j30Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(f30Var);
                    return;
                }
                f30Var.setVisibility(0);
                org.telegram.ui.Components.o20 o20Var = this.l2;
                o20Var.G(f30Var, false);
                this.o0 = true;
                if (!j30Var.b) {
                    ArrayList arrayList = o20Var.e;
                    f2.j0 j0Var = (f2.j0) f30Var.getLayoutManager();
                    if (j0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                j0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = x40Var.getViewTreeObserver();
                i40 i40Var = new i40(this, videoParticipant);
                this.m2 = i40Var;
                viewTreeObserver3.addOnPreDrawListener(i40Var);
                return;
            }
            if (this.m2 != null) {
                x40Var.getViewTreeObserver().removeOnPreDrawListener(this.m2);
                this.m2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            x50 x50Var = this.k2;
            ArrayList arrayList3 = this.U1;
            ArrayList arrayList4 = this.V1;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList4.get(i11);
                    org.telegram.ui.Components.voip.l lVar = uVar.c;
                    if (lVar != null) {
                        lVar.setRenderer(null);
                        org.telegram.ui.Components.n20 n20Var = uVar.d;
                        if (n20Var != null) {
                            n20Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = uVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(uVar.w);
                        uVar.b(false);
                        uVar.animate().alpha(0.0f).setListener(new e40(this, uVar));
                    }
                }
                this.L2 = false;
                x50Var.H(this.j2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) arrayList4.get(i12);
                    if (uVar2.e != null && ((videoParticipant2 = uVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(uVar2.w);
                        uVar2.b(false);
                        org.telegram.ui.Components.n20 n20Var2 = uVar2.d;
                        if (n20Var2 != null) {
                            n20Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = uVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        uVar2.animate().alpha(0.0f).setListener(new f40(this, uVar2));
                    }
                }
                this.L2 = true;
                x50Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(24, this, arrayList2));
                }
            }
            boolean z11 = !j30Var.b;
            ViewTreeObserver viewTreeObserver4 = x40Var.getViewTreeObserver();
            h40 h40Var = new h40(this, videoParticipant, z11);
            this.m2 = h40Var;
            viewTreeObserver4.addOnPreDrawListener(h40Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.u3;
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
        TLRPC.Chat chat = this.V0;
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
            if (this.W0 == null) {
                return;
            }
            int i10 = 0;
            while (i10 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.W0.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i10 == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.l0(this, i10, z10, 1));
                i10++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
        String publicUsername = ChatObject.getPublicUsername(this.V0);
        String o10 = !TextUtils.isEmpty(publicUsername) ? a4.w.o(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(o10)) {
            u1(null, o10, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.V0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new jh.j7(this, chatFull, z10, 5));
    }

    public final UndoView k1() {
        if (!C3) {
            j30 j30Var = this.W1;
            if (j30Var.b) {
                return j30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l1() {
        VoIPService sharedInstance;
        if (this.q0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.q0 = true;
        this.z0.addAll(this.W0.visibleParticipants);
        this.A0.addAll(this.m0);
        this.B0.addAll(this.W0.invitedUsers);
        this.C0.addAll(this.W0.shadyJoinParticipants);
        this.D0.addAll(this.W0.shadyLeftParticipants);
        this.P1 = sharedInstance.getCallState();
        if (this.W0 == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.W0 = call;
            this.l2.c = call;
            this.W1.setGroupCall(call);
            this.k2.c = this.W0;
        }
        wg.h hVar = this.Y;
        if (hVar != null) {
            hVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.W0.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        w40 w40Var = this.R;
        if (w40Var == null || w40Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        M1(true);
        this.s1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        x40 x40Var = this.M;
        x40Var.setVisibility(0);
        org.telegram.ui.ActionBar.w0 w0Var = this.h1;
        w0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x40Var, (Property<x40, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(x40Var, (Property<x40, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w40Var, (Property<w40, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(w40Var, (Property<w40, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(w40Var, (Property<w40, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var = this.Q;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.S;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.jr.g);
        animatorSet.addListener(new l40(this, 0));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.W0 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.W0.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.o20
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        r50 r50Var = r50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new jh.i(r50Var, c2VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        r50Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.sg(r50Var, j11, c2VarArr2, user, 8));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rm(this, c2VarArr, sendRequest, 27), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        int dp = AndroidUtilities.dp(74.0f);
        float f9 = this.u0 - dp;
        return (((((float) this.backgroundPaddingTop) + f9) > ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f9) == ((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - f9) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean o1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        M1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        x40 x40Var = this.M;
        if (x40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(x40Var);
        }
        f30 f30Var = this.i2;
        if (f30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(f30Var);
        }
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        d40 d40Var = this.v0;
        if (d40Var != null) {
            d40Var.b(false, false);
            return;
        }
        if (this.b2) {
            d1(true);
        } else if (this.W1.b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
        d40 d40Var = this.v0;
        if (d40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        d40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.e0;
        launchActivity.W0.add(this.r2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        A3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.w20.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        this.P1 = i10;
        N1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final boolean q1() {
        return r1() && !this.W0.visibleVideoParticipants.isEmpty() && (this.W0.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.W0.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean r1() {
        ChatObject.Call call = this.W0;
        return call != null && call.call.rtmp_stream;
    }

    public final void s1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.s0) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.e0.O().getFragmentStack().get(this.e0.O().getFragmentStack().size() - 1);
        if (o2Var instanceof tn) {
            boolean P9 = ((tn) o2Var).P9();
            this.s0 = true;
            this.t0 = true;
            AndroidUtilities.runOnUIThread(new ag.w0(f3Var, editTextBoldCursor, z10, c2Var, 18), P9 ? 200L : 0L);
            return;
        }
        this.s0 = true;
        this.t0 = true;
        if (f3Var != null) {
            f3Var.setFocusable(true);
        } else if (c2Var != null) {
            c2Var.k(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new xg(2, editTextBoldCursor), 100L);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.Z.R) {
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
        LaunchActivity launchActivity = this.e0;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(this.e0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof tn) {
                z12 = ((tn) o2Var).P9();
                this.t0 = true;
                this.s0 = true;
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
                    str5 = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
                }
                m40 m40Var = new m40(this, getContext(), str5, str3, str4, str3);
                this.n0 = m40Var;
                m40Var.o0 = new h(this, 20);
                m40Var.setOnDismissListener(new g20(this, 3));
                AndroidUtilities.runOnUIThread(new d20(this, 7), !z12 ? 200L : 0L);
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
        m40 m40Var2 = new m40(this, getContext(), str5, str3, str4, str3);
        this.n0 = m40Var2;
        m40Var2.o0 = new h(this, 20);
        m40Var2.setOnDismissListener(new g20(this, 3));
        AndroidUtilities.runOnUIThread(new d20(this, 7), !z12 ? 200L : 0L);
    }

    public final void v1() {
        ChatObject.Call call = this.W0;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
        c2Var.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.W0.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new x9(this, c2Var, exportgroupcallinvite, 12));
    }

    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        String str;
        TextView textView;
        int i11;
        String str2;
        String str3;
        EditText editText;
        AlertDialog$Builder alertDialog$Builder;
        float f9;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLObject user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            if (i10 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(user, Boolean.TRUE, null, null, null, null);
                k1().k(0L, 30, user, null, null, null);
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext());
            int i12 = org.telegram.ui.ActionBar.g6.pg;
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.a;
            c2Var.E = i12;
            TextView textView2 = new TextView(getContext());
            int i13 = org.telegram.ui.ActionBar.g6.hg;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder2.n(frameLayout);
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getContext());
            t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(t9Var, i7.f6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            e9Var.j(this.currentAccount, user);
            boolean z10 = user instanceof TLRPC.User;
            if (z10) {
                TLRPC.User user2 = (TLRPC.User) user;
                t9Var.e(user2, e9Var);
                str = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                t9Var.e(chat, e9Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.V0;
            String str4 = chat2 != null ? chat2.title : "";
            if (i10 != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                b.p(R.string.VoipGroupAddMemberText, new Object[]{str, str4}, textView2);
            } else if (o1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                b.p(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.V0)) {
                    b.p(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                } else {
                    b.p(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                }
            }
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(textView3, i7.f6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i10 == 2) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupUserRemove), new xr(11, this, user));
            } else if (z10) {
                alertDialog$Builder2.k(LocaleController.getString(R.string.VoipGroupAdd), new d9.a(this, (TLRPC.User) user, j10, 8));
            }
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ug, false));
            c2Var.show();
            if (i10 != 2 || (textView = (TextView) c2Var.d(-1)) == null) {
                return;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.vg, false));
            return;
        }
        int i14 = 6;
        if (i10 == 6) {
            this.e0.K0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.e0.p0(new tn(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.e0.K0(this.currentAccount);
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.e0.O().getFragmentStack().get(this.e0.O().getFragmentStack().size() - 1);
            if ((o2Var instanceof tn) && ((tn) o2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.e0.p0(new tn(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            J1(2, true);
            return;
        }
        int i15 = 9;
        if (i10 == 9) {
            org.telegram.ui.Components.s40 s40Var = this.d2;
            if (s40Var == null || !s40Var.h()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.s40 s40Var2 = new org.telegram.ui.Components.s40(0, true, true);
                this.d2 = s40Var2;
                s40Var2.D = true;
                s40Var2.N = true;
                s40Var2.C = true;
                s40Var2.F = true;
                s40Var2.O = true;
                s40Var2.a = this.e0.O().getLastFragment();
                org.telegram.ui.Components.s40 s40Var3 = this.d2;
                y40 y40Var = new y40(this, j10);
                this.e2 = y40Var;
                s40Var3.b = y40Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                s40Var3.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new d20(this, i15), new bg.f0(i14), 0);
                return;
            }
            return;
        }
        if (i10 == 10) {
            String str5 = groupCallParticipant.about;
            Context context = getContext();
            int i16 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.c5.a;
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context);
            String string = LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
            final org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder3.a;
            c2Var2.N = string;
            c2Var2.P = LocaleController.getString(j10 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setClipChildren(false);
            if (j10 < 0) {
                alertDialog$Builder = alertDialog$Builder3;
                f9 = 8.0f;
                long j11 = -j10;
                if (MessagesController.getInstance(i16).getChatFull(j11) == null) {
                    MessagesController.getInstance(i16).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                }
            } else {
                alertDialog$Builder = alertDialog$Builder3;
                f9 = 8.0f;
            }
            NumberTextView numberTextView = new NumberTextView(context);
            EditText editText2 = new EditText(context);
            int i17 = org.telegram.ui.ActionBar.g6.hg;
            editText2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            editText2.setHint(LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
            editText2.setTextSize(1, 16.0f);
            editText2.setBackground(org.telegram.ui.ActionBar.g6.S(context));
            editText2.setMaxLines(4);
            editText2.setRawInputType(147457);
            editText2.setImeOptions(6);
            int i18 = j10 > 0 ? 70 : 255;
            editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.n3(i18, context, numberTextView)});
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            numberTextView.setImportantForAccessibility(2);
            frameLayout2.addView(numberTextView, i7.f6.d(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
            editText2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f9), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f9));
            editText2.addTextChangedListener(new org.telegram.ui.Components.dq(i18, numberTextView));
            AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
            editText2.setText(str5);
            editText2.setSelection(editText2.getText().toString().length());
            AlertDialog$Builder alertDialog$Builder4 = alertDialog$Builder;
            alertDialog$Builder4.n(frameLayout2);
            final k3.e eVar = new k3.e(editText2, i16, j10, 2);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Save), eVar);
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            c2Var2.J = new org.telegram.ui.Components.r1(editText2, 1 == true ? 1 : 0);
            frameLayout2.addView(editText2, i7.f6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText2.requestFocus();
            AndroidUtilities.showKeyboard(editText2);
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.v1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i19, KeyEvent keyEvent) {
                    if (i19 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.c2 c2Var3 = c2Var2;
                        if (c2Var3.isShowing()) {
                            eVar.g(c2Var3, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            c2Var2.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ug, false));
            c2Var2.show();
            c2Var2.o(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
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
        int i19 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.c5.a;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j10));
            str2 = user3.first_name;
            str3 = user3.last_name;
        } else {
            str2 = MessagesController.getInstance(i19).getChat(Long.valueOf(-j10)).title;
            str3 = null;
        }
        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.a;
        c2Var3.N = string2;
        LinearLayout g10 = org.telegram.messenger.x3.g(context2, 1);
        EditText editText3 = new EditText(context2);
        int i20 = org.telegram.ui.ActionBar.g6.hg;
        editText3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
        editText3.setTextSize(1, 16.0f);
        editText3.setMaxLines(1);
        editText3.setLines(1);
        editText3.setSingleLine(true);
        editText3.setGravity(LocaleController.isRTL ? 5 : 3);
        editText3.setInputType(49152);
        editText3.setImeOptions(j10 > 0 ? 5 : 6);
        editText3.setHint(LocaleController.getString(j10 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
        editText3.setBackground(org.telegram.ui.ActionBar.g6.S(context2));
        editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        editText3.requestFocus();
        if (j10 > 0) {
            editText = new EditText(context2);
            editText.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(LocaleController.isRTL ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(LocaleController.getString(R.string.LastName));
            editText.setBackground(org.telegram.ui.ActionBar.g6.S(context2));
            editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        } else {
            editText = null;
        }
        AndroidUtilities.showKeyboard(editText3);
        g10.addView(editText3, i7.f6.t(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            g10.addView(editText, i7.f6.t(-1, -2, 0, 23, 12, 23, 21));
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.getText().toString().length());
        if (editText != null) {
            editText.setText(str3);
            editText.setSelection(editText.getText().toString().length());
        }
        alertDialog$Builder5.n(g10);
        org.telegram.ui.ActionBar.b2 u1Var = new org.telegram.ui.Components.u1(editText3, j10, i19, editText);
        alertDialog$Builder5.k(LocaleController.getString(R.string.Save), u1Var);
        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
        c2Var3.J = new eg.g(5, editText3, editText);
        c2Var3.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ug, false));
        c2Var3.show();
        c2Var3.o(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
        rd rdVar = new rd(1 == true ? 1 : 0, c2Var3, u1Var);
        if (editText != null) {
            editText.setOnEditorActionListener(rdVar);
        } else {
            editText3.setOnEditorActionListener(rdVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(boolean z10, org.telegram.ui.Cells.c4 c4Var) {
        float f9;
        float f10;
        final float f11;
        int measuredHeight;
        org.telegram.ui.Components.voip.u uVar;
        org.telegram.ui.Components.voip.u uVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.X2;
        l30 l30Var = this.b;
        x40 x40Var = this.M;
        if (z11) {
            f11 = (x40Var.getX() + (c4Var.getX() + c4Var.getAvatarImageView().getX())) - paddingLeft;
            f10 = (x40Var.getY() + (c4Var.getY() + c4Var.getAvatarImageView().getY())) - paddingTop;
            f9 = c4Var.getAvatarImageView().getMeasuredHeight() / x40Var.getMeasuredWidth();
            measuredHeight = (int) ((c4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f9);
        } else {
            if (this.V2 == null) {
                this.K2 = true;
            } else {
                this.K2 = z10 || l30Var.z0.k(l30Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.U2;
            j30 j30Var = this.W1;
            if (lVar == null || !this.K2) {
                org.telegram.ui.Components.n20 n20Var = this.W2;
                if (n20Var != null) {
                    org.telegram.ui.Components.voip.u uVar3 = this.V2;
                    f30 f30Var = this.i2;
                    if (uVar3 == null) {
                        float x4 = (j30Var.getX() + (f30Var.getX() + (this.W2.getX() + n20Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y8 = (j30Var.getY() + (f30Var.getY() + (this.W2.getY() + this.W2.getAvatarImageView().getY()))) - paddingTop;
                        f9 = this.W2.getAvatarImageView().getMeasuredHeight() / x40Var.getMeasuredWidth();
                        measuredHeight = (int) ((this.W2.getAvatarImageView().getMeasuredHeight() >> 1) / f9);
                        f10 = y8;
                        f11 = x4;
                        if (!this.K2 && (uVar = this.V2) != null) {
                            uVar.invalidate();
                            j30Var.invalidate();
                            org.telegram.ui.Components.voip.u uVar4 = this.V2;
                            uVar4.h = false;
                            uVar4.j(false);
                            this.V2 = null;
                        }
                    } else if (this.K2) {
                        f11 = (j30Var.getX() + (f30Var.getX() + n20Var.getX())) - paddingLeft;
                        f10 = (j30Var.getY() + (f30Var.getY() + this.W2.getY())) - paddingTop;
                    }
                }
                f9 = 0.96f;
                f10 = 0.0f;
                f11 = 0.0f;
                measuredHeight = 0;
                if (!this.K2) {
                    uVar.invalidate();
                    j30Var.invalidate();
                    org.telegram.ui.Components.voip.u uVar42 = this.V2;
                    uVar42.h = false;
                    uVar42.j(false);
                    this.V2 = null;
                }
            } else {
                float x10 = (x40Var.getX() + lVar.getX()) - paddingLeft;
                f10 = ((x40Var.getY() + this.U2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                f11 = x10;
            }
            f9 = 1.0f;
            measuredHeight = 0;
            if (!this.K2) {
            }
        }
        final float f12 = f10;
        final float f13 = f9;
        k30 k30Var = this.z2;
        if (z10) {
            m30 m30Var = this.y2;
            m30Var.setScaleX(f13);
            m30Var.setScaleY(f13);
            m30Var.setTranslationX(f11);
            m30Var.setTranslationY(f12);
            k30Var.setAlpha(0.0f);
        }
        l30Var.N(measuredHeight, measuredHeight);
        if (this.c2) {
            o30 o30Var = this.X1;
            if (z10) {
                o30Var.setAlpha(0.0f);
            }
            o30Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        }
        k30Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        if (!z10 && (uVar2 = this.V2) != null) {
            uVar2.h = false;
            uVar2.j(true);
            if (l30Var.z0.k(l30Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.p pVar = this.V2.a;
                pVar.A = false;
                pVar.B = 0L;
                this.U2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i10 = measuredHeight;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.j20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                r50.p(r50.this, f13, f11, f12, i10, valueAnimator);
            }
        });
        this.Z2 = this.d.getNotificationCenter().setAnimationInProgress(this.Z2, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.u uVar5 = this.U2 != null ? this.V2 : null;
        if (uVar5 != null) {
            uVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, uVar5, z10, 9));
        if (this.X2 || this.V2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.jr.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.jr.f);
            ofFloat.setDuration(220L);
            this.V2.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.p pVar2 = this.V2.a;
            if (pVar2.A) {
                pVar2.C.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        S0();
    }

    public final void z1() {
        w5 w5Var = this.w2;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (!this.v2 || this.Q0 == null || VoIPService.getSharedInstance() == null || !r1() || this.M == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(w5Var, 30L);
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
