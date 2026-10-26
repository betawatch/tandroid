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
import org.telegram.messenger.DispatchQueue2;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v50 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, oe.d {
    public static v50 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final y5 A2;
    public final oe.b A3;
    public TLObject B0;
    public final t50 B1;
    public final LongSparseIntArray B2;
    public final oe.e B3;
    public final Paint C0;
    public final rh.i C1;
    public final p30 C2;
    public final oe.b C3;
    public final ArrayList D0;
    public h20 D1;
    public final n30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.c40 E1;
    public LinearLayout E2;
    public final x30 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final w30 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.xj0 G2;
    public final u30 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.xj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.fl0 K;
    public final org.telegram.ui.Components.xj0 K0;
    public final u50[] K1;
    public final View K2;
    public final z40 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.s6 M;
    public final org.telegram.ui.Components.fa M0;
    public u50 M1;
    public final int[] M2;
    public final f30 N;
    public final org.telegram.ui.Components.fa N0;
    public u50 N1;
    public final j30 N2;
    public final r40 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final p50 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final b50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final d40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final b40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.b6 U;
    public final k50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final a50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.b6 W;
    public float W0;
    public boolean W1;
    public final j40 W2;
    public final j50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.i4 X2;
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
    public final m30 a2;
    public org.telegram.ui.Components.b30 a3;
    public final o30 b;
    public final ImageView b0;
    public final boolean b1;
    public final r30 b2;
    public boolean b3;
    public final t20 c;
    public final nh.h c0;
    public final String c1;
    public final e40 c2;
    public boolean c3;
    public final AccountInstance d;
    public final int d0;
    public final q50 d1;
    public float d2;
    public int d3;
    public final z20 e;
    public final RadialProgressView e0;
    public final e30 e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout e2;
    public AnimatorSet e3;
    public final org.telegram.ui.Components.voip.w2 f;
    public final Drawable f0;
    public final g30 f1;
    public boolean f2;
    public v40 f3;
    public final View g0;
    public final Paint g1;
    public boolean g2;
    public int g3;
    public final org.telegram.ui.Components.voip.w2 h;
    public AnimatorSet h0;
    public ValueAnimator h1;
    public org.telegram.ui.Components.g50 h2;
    public int h3;
    public LaunchActivity i0;
    public float i1;
    public c50 i2;
    public int i3;
    public final UndoView[] j0;
    public final LinearLayout j1;
    public Boolean j2;
    public int j3;
    public final org.telegram.ui.Cells.k k0;
    public final org.telegram.ui.ActionBar.w0 k1;
    public int k2;
    public int k3;
    public boolean l0;
    public final org.telegram.ui.ActionBar.w0 l1;
    public boolean l2;
    public int l3;
    public org.telegram.ui.Components.t40 m0;
    public final org.telegram.ui.ActionBar.w0 m1;
    public final i30 m2;
    public int m3;
    public final org.telegram.ui.Components.voip.w2 n;
    public org.telegram.ui.Components.t40 n0;
    public final org.telegram.ui.ActionBar.g1 n1;
    public final org.telegram.ui.Components.mm0 n2;
    public int n3;
    public int o0;
    public final org.telegram.ui.ActionBar.g1 o1;
    public final b60 o2;
    public int o3;
    public f50 p0;
    public final org.telegram.ui.ActionBar.g1 p1;
    public final org.telegram.ui.Components.c30 p2;
    public int p3;
    public final ArrayList q0;
    public final org.telegram.ui.ActionBar.g1 q1;
    public ViewTreeObserver.OnPreDrawListener q2;
    public int q3;
    public final org.telegram.ui.Components.voip.w2 r;
    public p40 r0;
    public final org.telegram.ui.ActionBar.g1 r1;
    public final org.telegram.ui.Components.voip.h r2;
    public int r3;
    public final org.telegram.ui.Components.voip.w2 s;
    public boolean s0;
    public final org.telegram.ui.ActionBar.g1 s1;
    public boolean s2;
    public int s3;
    public long t0;
    public final org.telegram.ui.ActionBar.g1 t1;
    public final ArrayList t2;
    public int t3;
    public boolean u0;
    public final org.telegram.ui.ActionBar.g1 u1;
    public boolean u2;
    public int u3;
    public final org.telegram.ui.Components.voip.w2 v;
    public final RectF v0;
    public final org.telegram.ui.ActionBar.g1 v1;
    public final h20 v2;
    public int v3;
    public final org.telegram.ui.Components.voip.w2 w;
    public boolean w0;
    public final org.telegram.ui.ActionBar.g1 w1;
    public final d30 w2;
    public final w40 w3;
    public final a30 x;
    public boolean x0;
    public final org.telegram.ui.ActionBar.g1 x1;
    public final org.telegram.ui.Components.k5 x2;
    public Boolean x3;
    public final ImageView y;
    public float y0;
    public final org.telegram.ui.ActionBar.g1 y1;
    public final h20 y2;
    public Integer y3;
    public g40 z0;
    public final LinearLayout z1;
    public boolean z2;
    public final oe.b z3;

    public v50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.u6) null, true, true);
        String string;
        int i10;
        final v50 v50Var;
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
        this.C1 = new rh.i(new h20(this, 8));
        int i11 = 0;
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new u50[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.r2 = new org.telegram.ui.Components.voip.h();
        this.t2 = new ArrayList();
        this.v2 = new h20(this, i11);
        this.w2 = new d30(this);
        this.x2 = new org.telegram.ui.Components.k5(27);
        this.y2 = new h20(this, 1);
        this.z2 = false;
        this.A2 = new y5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.d3 = -1;
        this.w3 = new w40(this);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
        this.z3 = new oe.b(2, this, dsVar, 350L);
        this.A3 = new oe.b(3, this, dsVar, 220L, true);
        this.B3 = new oe.e(4, this, dsVar, 350L);
        this.C3 = new oe.b(5, this, dsVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.b1 = z10;
        this.resourcesProvider = new di.k0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new y30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new j40(this);
        setOnDismissListener(new l20(this, i11));
        setDimBehindAlpha(75);
        p50 p50Var = new p50(this, launchActivity);
        this.P = p50Var;
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(true);
        int i12 = org.telegram.ui.ActionBar.y6.qg;
        eqVar.b(org.telegram.ui.ActionBar.y6.v0(i12));
        eqVar.d();
        r40 r40Var = new r40(this, launchActivity, eqVar);
        this.O = r40Var;
        r40Var.setSubtitle("");
        r40Var.getSubtitleTextView().setVisibility(0);
        r40Var.j();
        r40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(r40Var.getAdditionalSubtitleTextView(), this.u2, 1.0f, false);
        r40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.y6.v0(i12));
        int i13 = org.telegram.ui.ActionBar.y6.lg;
        org.telegram.ui.ActionBar.f7.m(r40Var, 6, i13, null);
        r40Var.setBackButtonImage(R.drawable.ic_ab_back);
        r40Var.setOccupyStatusBar(false);
        r40Var.setAllowOverlayTitle(false);
        int i14 = org.telegram.ui.ActionBar.y6.hg;
        org.telegram.ui.ActionBar.f7.m(r40Var, 1, i14, null);
        int i15 = 3;
        org.telegram.ui.ActionBar.f7.m(r40Var, 3, org.telegram.ui.ActionBar.y6.z8, null);
        org.telegram.ui.ActionBar.f7.e(r40Var, i14);
        org.telegram.ui.ActionBar.f7.m(r40Var, 6, i13, null);
        r40Var.setActionBarMenuOnItemClick(new y40(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new e20(this, i15);
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
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = xj0Var;
        this.K0 = new org.telegram.ui.Components.xj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        z40 z40Var = new z40(this, launchActivity);
        this.L = z40Var;
        this.containerView = z40Var;
        z40Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(launchActivity);
            this.U = b6Var;
            b6Var.setGravity(17);
            b6Var.setTextColor(-1);
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.setTextSize(18);
            b6Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(b6Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            a50 a50Var = new a50(this, launchActivity);
            this.V = a50Var;
            a50Var.setGravity(17);
            a50Var.setTextColor(-1);
            a50Var.setTypeface(AndroidUtilities.bold());
            a50Var.setTextSize(60);
            this.containerView.addView(a50Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(launchActivity);
            this.W = b6Var2;
            b6Var2.setGravity(17);
            b6Var2.setTextColor(-1);
            b6Var2.setTypeface(AndroidUtilities.bold());
            b6Var2.setTextSize(18);
            this.containerView.addView(b6Var2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            k50 k50Var = new k50(this, launchActivity);
            this.U0 = k50Var;
            this.containerView.addView(k50Var, org.telegram.ui.Components.gb1.h(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        b50 b50Var = new b50(this, launchActivity);
        this.Q = b50Var;
        b50Var.setClipToPadding(false);
        b50Var.setClipChildren(false);
        j50 j50Var = new j50(this);
        this.X = j50Var;
        j50Var.o = dsVar;
        j50Var.d = 350L;
        j50Var.c = 350L;
        j50Var.e = 350L;
        j50Var.S();
        b50Var.setItemAnimator(j50Var);
        b50Var.setOnScrollListener(new s20(this));
        b50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.xz xzVar = new org.telegram.ui.Components.xz(F3 ? 6 : 2, b50Var);
        this.Y = xzVar;
        b50Var.setLayoutManager(xzVar);
        t20 t20Var = new t20(this);
        this.c = t20Var;
        xzVar.A1(t20Var);
        b50Var.i(new u20(this));
        xzVar.D1();
        this.containerView.addView(b50Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        b50Var.setAdapter(p50Var);
        b50Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.f7.J(org.telegram.ui.ActionBar.y6.eg, b50Var);
        b50Var.setOnItemClickListener(new e7(this, launchActivity, call, 14));
        b50Var.setOnItemLongClickListener(new e20(this, 4));
        if (r1()) {
            t50 t50Var = new t50(this, getContext());
            this.B1 = t50Var;
            this.containerView.addView(t50Var, org.telegram.ui.Components.gb1.h(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(launchActivity);
        this.n2 = mm0Var;
        this.containerView.addView(mm0Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        b60 b60Var = new b60(call, this.currentAccount, this);
        this.o2 = b60Var;
        mm0Var.setAdapter(b60Var);
        s4.t tVar = new s4.t(6, false);
        mm0Var.setLayoutManager(tVar);
        tVar.A1(new w20(this));
        final int i17 = 1;
        mm0Var.setOnItemClickListener(new org.telegram.ui.Components.zl0(this) { // from class: org.telegram.ui.g20
            public final /* synthetic */ v50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zl0
            public final void c(int i18, View view) {
                switch (i17) {
                    case 0:
                        v50 v50Var2 = this.b;
                        v50Var2.getClass();
                        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) view;
                        if (b30Var.getVideoParticipant() != null) {
                            v50Var2.e1(b30Var.getVideoParticipant());
                            break;
                        } else {
                            v50Var2.e1(new ChatObject.VideoParticipant(b30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        v50 v50Var3 = this.b;
                        v50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            v50Var3.e1(lVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        s4.l lVar = new s4.l();
        lVar.S();
        lVar.o = dsVar;
        lVar.d = 350L;
        lVar.c = 350L;
        lVar.e = 350L;
        mm0Var.setItemAnimator(new x20(this));
        mm0Var.setOnScrollListener(new y20(this));
        b60Var.H(mm0Var, false, false);
        mm0Var.setVisibility(8);
        z20 z20Var = new z20(this, launchActivity);
        this.e = z20Var;
        int v02 = org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(9);
        this.M0 = faVar;
        org.telegram.ui.Components.fa faVar2 = new org.telegram.ui.Components.fa(12);
        this.N0 = faVar2;
        faVar.a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        faVar.b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        faVar.b();
        faVar2.a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        faVar2.b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        faVar2.b();
        int i18 = org.telegram.ui.ActionBar.y6.Ig;
        faVar.d.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.v0(i18), 38));
        faVar2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.v0(i18), 76));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.r = w2Var;
        w2Var.setCheckable(true);
        w2Var.setTextSize(12);
        z20Var.a(w2Var);
        w2Var.setOnClickListener(new f20(this, 7));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.n = w2Var2;
        w2Var2.setCheckable(true);
        w2Var2.setTextSize(12);
        w2Var2.d(false, false);
        w2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        w2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f = w2Var3;
        w2Var3.setCheckable(true);
        w2Var3.setTextSize(12);
        w2Var3.d(false, false);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(launchActivity);
        w2Var3.addView(ak0Var, org.telegram.ui.Components.gb1.h(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.xj0 xj0Var2 = new org.telegram.ui.Components.xj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = xj0Var2;
        ak0Var.setAnimation(xj0Var2);
        w2Var3.setOnClickListener(new f20(this, 10));
        z20Var.a(w2Var3);
        org.telegram.ui.Components.voip.w2 w2Var4 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.h = w2Var4;
        w2Var4.setCheckable(true);
        w2Var4.setTextSize(12);
        w2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i19 = R.drawable.filled_sound_on;
        this.a0 = i19;
        imageView.setImageResource(i19);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        w2Var4.addView(imageView, org.telegram.ui.Components.gb1.h(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        w2Var4.setOnClickListener(new f20(this, 11));
        z20Var.a(w2Var4);
        z20Var.a(w2Var2);
        org.telegram.ui.Components.voip.w2 w2Var5 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.s = w2Var5;
        w2Var5.setTextSize(12);
        w2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i20 = 1;
        w2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.k20
            public final /* synthetic */ v50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        v50.o(this.b, launchActivity);
                        break;
                    default:
                        v50 v50Var2 = this.b;
                        v50Var2.a2.e();
                        ChatObject.Call call2 = v50Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            v50Var2.J1();
                            v50.t1(launchActivity, new h20(v50Var2, 5), false, false);
                            break;
                        } else {
                            v50Var2.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var6 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.v = w2Var6;
        w2Var6.setCheckable(true);
        w2Var6.b(true, false);
        w2Var6.setTextSize(12);
        w2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        a30 a30Var = new a30(this, launchActivity);
        this.x = a30Var;
        a30Var.setAnimation(xj0Var);
        a30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.w2 w2Var7 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.w = w2Var7;
        w2Var7.setDrawBackground(false);
        w2Var7.setTextSize(12);
        w2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        w2Var7.addView(a30Var, org.telegram.ui.Components.gb1.i(50, 50, 49));
        z20Var.a(w2Var7);
        w2Var7.setOnClickListener(new c30(this));
        z20Var.a(w2Var6);
        z20Var.a(w2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        w2Var7.addView(imageView2, org.telegram.ui.Components.gb1.h(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.a1 != null && r1() && !this.a1.isScheduled()) {
            imageView2.setVisibility(0);
            a30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.Og));
        r40Var.setAlpha(0.0f);
        r40Var.getBackButton().setScaleX(0.9f);
        r40Var.getBackButton().setScaleY(0.9f);
        r40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        r40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        r40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        r40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.y6.v0(i14));
        this.k1 = w0Var;
        int i21 = 0;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new e20(this, i21));
        int i22 = org.telegram.ui.ActionBar.y6.ig;
        org.telegram.ui.ActionBar.f7.S(w0Var, org.telegram.ui.ActionBar.y6.f0(org.telegram.ui.ActionBar.y6.v0(i22), 6), null, org.telegram.ui.ActionBar.f7.N(i22));
        w0Var.setOnClickListener(new f20(this, i21));
        w0Var.O(org.telegram.ui.ActionBar.y6.v0(i14), false);
        w0Var.O(org.telegram.ui.ActionBar.y6.v0(i14), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.y6.v0(i14));
        this.l1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.f7.S(w0Var2, org.telegram.ui.ActionBar.y6.f0(org.telegram.ui.ActionBar.y6.v0(i22), 6), null, org.telegram.ui.ActionBar.f7.N(i22));
        w0Var2.setOnClickListener(new f20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.y6.v0(i14));
        this.m1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.f7.S(w0Var3, org.telegram.ui.ActionBar.y6.f0(org.telegram.ui.ActionBar.y6.v0(i22), 6), null, org.telegram.ui.ActionBar.f7.N(i22));
        w0Var3.setOnClickListener(new f20(this, 2));
        e30 e30Var = new e30(this, launchActivity, launchActivity);
        this.e1 = e30Var;
        f30 f30Var = new f30(launchActivity);
        this.N = f30Var;
        f30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        paint2.setColor(-12761513);
        g30 g30Var = new g30(this, getContext());
        this.f1 = g30Var;
        org.telegram.ui.ActionBar.f7.V(g30Var, i14, this.resourcesProvider);
        g30Var.setTextSize(1, 11.0f);
        g30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        g30Var.setMaxLines(1);
        g30Var.setGravity(17);
        g30Var.setTypeface(AndroidUtilities.bold());
        g30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        g30Var.setTag(-1);
        if (!r1()) {
            g30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.j1 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(e30Var, org.telegram.ui.Components.gb1.p(1.0f, 0, -2));
        linearLayout.addView(g30Var, org.telegram.ui.Components.gb1.o(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(f30Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(r40Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, org.telegram.ui.Components.gb1.r(48, 48));
        linearLayout2.addView(w0Var2, org.telegram.ui.Components.gb1.r(48, 48));
        linearLayout2.addView(w0Var, org.telegram.ui.Components.gb1.r(48, 48));
        this.containerView.addView(linearLayout2, org.telegram.ui.Components.gb1.i(-2, 48, 53));
        View view = new View(launchActivity);
        this.g0 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, null);
        this.containerView.addView(view, org.telegram.ui.Components.gb1.g(1.0f, -1));
        for (int i23 = 0; i23 < 2; i23++) {
            this.j0[i23] = new h30(this, launchActivity);
            this.j0[i23].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.j0[i23].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.j0[i23], org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.k1.setShowSubmenuByMove(false);
        int i24 = org.telegram.ui.ActionBar.y6.eg;
        org.telegram.ui.ActionBar.f7.S(kVar, org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.v0(i24), 6, 6), null, org.telegram.ui.ActionBar.f7.N(i24));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.k1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.m0);
        this.u1 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.k1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.m0);
        this.v1 = d10;
        d10.m(false, true);
        int i25 = org.telegram.ui.ActionBar.y6.wg;
        d.setCheckColor(i25);
        d.d(org.telegram.ui.ActionBar.y6.v0(i25), org.telegram.ui.ActionBar.y6.v0(i25));
        d10.setCheckColor(i25);
        d10.d(org.telegram.ui.ActionBar.y6.v0(i25), org.telegram.ui.ActionBar.y6.v0(i25));
        Paint paint3 = new Paint(1);
        int i26 = org.telegram.ui.ActionBar.y6.hg;
        paint3.setColor(org.telegram.ui.ActionBar.y6.v0(i26));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.k1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.m0);
        this.p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.k1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.m0);
        this.q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.k1.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.k1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.m0);
        this.o1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.k1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.m0);
        this.r1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.n1 = e;
        q50 q50Var = new q50();
        this.d1 = q50Var;
        org.telegram.ui.ActionBar.g1 e10 = this.k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.t1 = e10;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.k1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, q50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.m0);
        this.s1 = d15;
        q50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e11 = this.k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.x1 = e11;
        org.telegram.ui.ActionBar.g1 e12 = this.k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.y1 = e12;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.k1;
        int i27 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i26;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i26;
        }
        org.telegram.ui.ActionBar.g1 e13 = w0Var11.e(4, i27, string);
        this.w1 = e13;
        this.k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.y6.v0(i24));
        this.k1.getPopupLayout().setFitItems(true);
        e11.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        e12.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d11.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d12.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        int i28 = org.telegram.ui.ActionBar.y6.vg;
        e13.d(org.telegram.ui.ActionBar.y6.v0(i28), org.telegram.ui.ActionBar.y6.v0(i28));
        e.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d13.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d14.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d15.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        e10.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        if (this.a1 != null) {
            l1();
        }
        if (o1()) {
            this.p0 = new f50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new f20(this, 3));
        i30 i30Var = new i30(this, launchActivity);
        this.m2 = i30Var;
        j30 j30Var = new j30(this);
        this.N2 = j30Var;
        final int i29 = 0;
        i30Var.setClipToPadding(false);
        j30Var.S();
        j30Var.o = org.telegram.ui.Components.ds.f;
        j30Var.d = 350L;
        j30Var.c = 350L;
        j30Var.e = 350L;
        i30Var.setItemAnimator(j30Var);
        i30Var.setOnScrollListener(new k30(this));
        i30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        i30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.c30 c30Var = new org.telegram.ui.Components.c30(call, this.currentAccount, this);
        this.p2 = c30Var;
        i30Var.setAdapter(c30Var);
        c30Var.F(i30Var, false);
        i30Var.setOnItemClickListener(new org.telegram.ui.Components.zl0(this) { // from class: org.telegram.ui.g20
            public final /* synthetic */ v50 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zl0
            public final void c(int i182, View view2) {
                switch (i29) {
                    case 0:
                        v50 v50Var2 = this.b;
                        v50Var2.getClass();
                        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) view2;
                        if (b30Var.getVideoParticipant() != null) {
                            v50Var2.e1(b30Var.getVideoParticipant());
                            break;
                        } else {
                            v50Var2.e1(new ChatObject.VideoParticipant(b30Var.getParticipant(), false, false));
                            break;
                        }
                    default:
                        v50 v50Var3 = this.b;
                        v50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar2.getParticipant() != null) {
                            v50Var3.e1(lVar2.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        i30Var.setOnItemLongClickListener(new e20(this, 1));
        i30Var.setVisibility(8);
        i30Var.i(new l30());
        m30 m30Var = new m30(this, launchActivity, this.Q, i30Var, this.Y1, this.a1, this);
        this.a2 = m30Var;
        m30Var.setClipChildren(false);
        c30Var.E(this.Y1, m30Var);
        if (this.n2 != null) {
            this.o2.G(this.Y1, m30Var);
        }
        n30 n30Var = new n30(this, launchActivity);
        this.D2 = n30Var;
        o30 o30Var = new o30(this, launchActivity, this.O, this.Q, n30Var);
        this.b = o30Var;
        o30Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        o30Var.setInvalidateWithParent(true);
        n30Var.setProfileGalleryView(o30Var);
        p30 p30Var = new p30(this, launchActivity);
        this.C2 = p30Var;
        p30Var.setVisibility(8);
        o30Var.setVisibility(0);
        o30Var.b(new q30(this));
        r30 r30Var = new r30(this, launchActivity);
        this.b2 = r30Var;
        this.containerView.addView(m30Var);
        m30Var.addView(i30Var, org.telegram.ui.Components.gb1.h(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, org.telegram.ui.Components.gb1.i(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, org.telegram.ui.Components.gb1.i(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.c0 = hVar;
        hVar.setDelegate(new s30(this));
        hVar.setClickCellDelegate(new t30(this));
        if (this.a1 != null) {
            hVar.D0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(launchActivity, false, true, true);
        this.M = s6Var;
        s6Var.setGravity(17);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTextColor(-1);
        s6Var.b(0.4f, 320L, org.telegram.ui.Components.ds.h);
        s6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        u30 u30Var = new u30(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = u30Var;
        u30Var.J = true;
        u30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.d0)});
        u30Var.getEditText().setLinkTextColor(-11683585);
        u30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        u30Var.getEditText().addTextChangedListener(new v30(this));
        u30Var.s();
        w30 w30Var = new w30(this, launchActivity);
        this.G = w30Var;
        this.containerView.addView(w30Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        x30 x30Var = new x30(launchActivity);
        this.F = x30Var;
        x30Var.addView(u30Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        x30Var.addView(s6Var, org.telegram.ui.Components.gb1.h(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        s6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(x30Var, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i30 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.ActionBar.f7.R(imageView3, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i30), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i30), this.resourcesProvider);
        int i31 = org.telegram.ui.ActionBar.y6.f7;
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView3, i31, u6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new f20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i30), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i30), this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.t(imageView4, org.telegram.ui.ActionBar.y6.v6, this.resourcesProvider, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new f20(this, 5));
        x30Var.addView(imageView3, org.telegram.ui.Components.gb1.i(48, 48, 85));
        x30Var.addView(imageView4, org.telegram.ui.Components.gb1.i(48, 48, 85));
        this.containerView.addView(r30Var);
        p30Var.addView(o30Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        p30Var.addView(n30Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(p30Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
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
            this.containerView.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.md0 md0Var = new org.telegram.ui.Components.md0(launchActivity);
            md0Var.setTextColor(-1);
            md0Var.setSelectorColor(-9598483);
            md0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            md0Var.setItemCount(5);
            z30 z30Var = new z30(launchActivity);
            z30Var.setItemCount(5);
            z30Var.setTextColor(-1);
            z30Var.setSelectorColor(-9598483);
            z30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            a40 a40Var = new a40(launchActivity);
            a40Var.setItemCount(5);
            a40Var.setTextColor(-1);
            a40Var.setSelectorColor(-9598483);
            a40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            b40 b40Var = new b40(launchActivity);
            this.T = b40Var;
            b40Var.setLines(1);
            b40Var.setSingleLine(true);
            b40Var.setEllipsize(TextUtils.TruncateAt.END);
            b40Var.setGravity(17);
            b40Var.setTextColor(-1);
            b40Var.setTypeface(AndroidUtilities.bold());
            b40Var.setTextSize(1, 14.0f);
            this.containerView.addView(b40Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            b40Var.setOnClickListener(new org.telegram.messenger.video.f(this, md0Var, z30Var, a40Var, chat, accountInstance, inputPeer2, 1));
            d40 d40Var = new d40(launchActivity, md0Var, z30Var, a40Var);
            this.R = d40Var;
            d40Var.setWeightSum(1.0f);
            d40Var.setOrientation(0);
            this.containerView.addView(d40Var, org.telegram.ui.Components.gb1.h(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i32 = calendar.get(1);
            int i33 = calendar.get(6);
            d40Var.addView(md0Var, org.telegram.ui.Components.gb1.p(0.5f, 0, 270));
            md0Var.setMinValue(0);
            md0Var.setMaxValue(365);
            md0Var.setWrapSelectorWheel(false);
            md0Var.setFormatter(new j20(currentTimeMillis, calendar, i32, 0));
            a1.d dVar = new a1.d(this, md0Var, z30Var, a40Var, 13);
            v50Var = this;
            md0Var.setOnValueChangedListener(dVar);
            z30Var.setMinValue(0);
            z30Var.setMaxValue(23);
            d40Var.addView(z30Var, org.telegram.ui.Components.gb1.p(0.2f, 0, 270));
            z30Var.setFormatter(new org.telegram.ui.Components.voip.c1(7));
            z30Var.setOnValueChangedListener(dVar);
            a40Var.setMinValue(0);
            a40Var.setMaxValue(59);
            a40Var.setValue(0);
            a40Var.setFormatter(new org.telegram.ui.Components.voip.c1(8));
            d40Var.addView(a40Var, org.telegram.ui.Components.gb1.p(0.3f, 0, 270));
            a40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i34 = calendar.get(6);
            int i35 = calendar.get(12);
            int i36 = calendar.get(11);
            md0Var.setValue(i33 != i34 ? 1 : 0);
            a40Var.setValue(i35);
            z30Var.setValue(i36);
            org.telegram.ui.Components.g5.g(b40Var, textView, 0L, 604800L, 2, md0Var, z30Var, a40Var);
        } else {
            v50Var = this;
        }
        e40 e40Var = new e40(v50Var, (ViewGroup) v50Var.getWindow().getDecorView(), v50Var.containerView);
        v50Var.c2 = e40Var;
        e40Var.E = new f40(v50Var);
        o30Var.setPinchToZoomHelper(e40Var);
        final int i37 = 0;
        v50Var.n.setOnClickListener(new View.OnClickListener(v50Var) { // from class: org.telegram.ui.k20
            public final /* synthetic */ v50 b;

            {
                this.b = v50Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i37) {
                    case 0:
                        v50.o(this.b, launchActivity);
                        break;
                    default:
                        v50 v50Var2 = this.b;
                        v50Var2.a2.e();
                        ChatObject.Call call2 = v50Var2.a1;
                        if (call2 != null && !call2.isScheduled()) {
                            v50Var2.J1();
                            v50.t1(launchActivity, new h20(v50Var2, 5), false, false);
                            break;
                        } else {
                            v50Var2.dismiss();
                            break;
                        }
                }
            }
        });
        v50Var.M1(false);
        v50Var.J1();
        v50Var.N1(false);
        v50Var.O1(false, false);
        v50Var.B1(0.0f);
        v50Var.P1();
        v50Var.containerView.addView(new FrameLayout(launchActivity), org.telegram.ui.Components.gb1.i(-1, 200, 87));
        v50Var.v.setOnClickListener(new f20(v50Var, 6));
        v50Var.T0();
        org.telegram.ui.Components.gb1.b(v50Var.n);
        org.telegram.ui.Components.gb1.b(v50Var.r);
        org.telegram.ui.Components.gb1.b(v50Var.f);
        org.telegram.ui.Components.gb1.b(v50Var.h);
        org.telegram.ui.Components.gb1.b(v50Var.w);
        org.telegram.ui.Components.gb1.b(v50Var.s);
        org.telegram.ui.Components.gb1.b(v50Var.v);
        r0.i0.m(v50Var.containerView, new e20(v50Var, 2));
    }

    public static r0.k1 A(v50 v50Var, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        i0.b f7 = h1Var.f(647);
        i0.b f10 = h1Var.f(8);
        u30 u30Var = v50Var.H;
        int max = Math.max(f10.d, (u30Var.N || u30Var.e) ? u30Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = v50Var.b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (u30Var.getEmojiView() != null) {
            u30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (v50Var.S2) {
            ViewGroup viewGroup = v50Var.containerView;
            int i10 = v50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = v50Var.containerView;
            int i11 = v50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.a + i11, f7.b, i11 + f7.c, f7.d);
        }
        v50Var.containerView.requestLayout();
        if (max == 0 && !u30Var.N && !u30Var.e && !u30Var.O) {
            u30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.fl0 fl0Var = v50Var.K;
            if (fl0Var == null) {
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                fl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.fl0 fl0Var2 = new org.telegram.ui.Components.fl0(1, v50Var.currentAccount, v50Var.getContext(), R, v50Var.resourcesProvider);
                    v50Var.K = fl0Var2;
                    fl0Var2.setDelegate(new x40(v50Var));
                    v50Var.containerView.addView(v50Var.K, org.telegram.ui.Components.gb1.i(-2, 52, 81));
                    v50Var.K.p(null, null, false);
                    v50Var.G.bringToFront();
                    v50Var.F.bringToFront();
                    fl0Var = v50Var.K;
                }
            }
            v50Var.K = fl0Var;
        }
        u30Var.I(f10.d, false);
        v50Var.C1.j(k1Var);
        return r0.k1.b;
    }

    public static String A0() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void B(v50 v50Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        e2Var.dismiss();
        boolean z10 = false;
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.wc(v50Var.topBulletinContainer, new di.k0()).g0(tL_error, false);
                return;
            }
            return;
        }
        Context context = v50Var.getContext();
        int i10 = v50Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.u6 u6Var = v50Var.resourcesProvider;
        ChatObject.Call call = v50Var.a1;
        if (call != null && (groupCall = call.call) != null && groupCall.creator) {
            z10 = true;
        }
        o9.i0(context, i10, inputGroupCall, str, u6Var, false, z10);
    }

    public static void B0(v50 v50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (v50Var.n0 == null) {
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(v50Var.getContext(), 8);
            v50Var.n0 = t40Var;
            t40Var.setAlpha(0.0f);
            v50Var.n0.setVisibility(4);
            v50Var.n0.setShowingDuration(4000L);
            v50Var.containerView.addView(v50Var.n0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            v50Var.n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            v50Var.n0.d();
        }
        v50Var.n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        v50Var.n0.f(v50Var.w, true);
    }

    public static /* synthetic */ void C(v50 v50Var, int[] iArr, float[] fArr) {
        s4.e1 K;
        i30 i30Var = v50Var.m2;
        m30 m30Var = v50Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = v50Var.a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (m30Var.b) {
                    for (int i11 = 0; i11 < i30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) i30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(b30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            b30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (v50Var.s0 ? v50Var.D0 : v50Var.a1.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = v50Var.Q.K(indexOf + v50Var.P.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.i4) {
                            ((org.telegram.ui.Cells.i4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == v50Var.X2 && !v50Var.l2) {
                                v50Var.containerView.invalidate();
                            }
                        }
                    }
                }
                m30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static /* synthetic */ void D(v50 v50Var) {
        Editable text = v50Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(v50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        v50Var.A1(tL_textWithEntities);
    }

    public static void F0(v50 v50Var) {
        ChatObject.Call call = v50Var.a1;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = v50Var.a1.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(v50Var.a1.call.join_muted);
        ConnectionsManager connectionsManager = v50Var.d.getConnectionsManager();
        DispatchQueue2 dispatchQueue2 = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue2);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.i1(dispatchQueue2), new q20(v50Var, 1));
    }

    public static void F1(org.telegram.ui.ActionBar.g1 g1Var, int i10) {
        if (g1Var != null) {
            g1Var.d(i10, i10);
        }
    }

    public static void G0(v50 v50Var, boolean z10) {
        if (v50Var.a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = v50Var.a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        v50Var.x3 = Boolean.valueOf(z10);
        v50Var.I1(true);
        ConnectionsManager connectionsManager = v50Var.d.getConnectionsManager();
        DispatchQueue2 dispatchQueue2 = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue2);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.i1(dispatchQueue2), new q20(v50Var, 0));
    }

    public static void H0(v50 v50Var) {
        int i10;
        if (!v50Var.r1()) {
            v50Var.isFullscreen = false;
            return;
        }
        m30 m30Var = v50Var.a2;
        boolean z10 = (!m30Var.V && m30Var.b && (F3 == v50Var.q1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = v50Var.j2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = v50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                v50Var.getWindow().clearFlags(1024);
                v50Var.setHideSystemVerticalInsets(false);
            } else {
                v50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                v50Var.getWindow().addFlags(1024);
            }
            v50Var.containerView.setSystemUiVisibility(i10);
            v50Var.j2 = Boolean.valueOf(z10);
            v50Var.S2 = !z10;
            v50Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l I0(v50 v50Var) {
        b50 b50Var = v50Var.Q;
        for (int i10 = 0; i10 < b50Var.getChildCount(); i10++) {
            View childAt = b50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(v50 v50Var) {
        r40 r40Var = v50Var.O;
        b50 b50Var = v50Var.Q;
        int childCount = b50Var.getChildCount();
        float f7 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(b50Var.getChildAt(i10)) >= 0) {
                f7 = Math.min(f7, r8.getTop());
            }
        }
        if (f7 < 0.0f || f7 == 2.14748365E9f) {
            f7 = childCount != 0 ? 0.0f : b50Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = f7 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float dp = f7 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && r40Var.getTag() == null) || (!z10 && r40Var.getTag() != null)) {
            r40Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = v50Var.h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                v50Var.h0 = null;
            }
            v50Var.setUseLightStatusBar(r40Var.getTag() == null);
            ViewPropertyAnimator duration = r40Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
            duration.setInterpolator(dsVar).start();
            r40Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(dsVar).start();
            ObjectAnimator objectAnimator = v50Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                v50Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.b6 subtitleTextView = r40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.b6, Float>) property, r40Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            v50Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            v50Var.U2.setInterpolator(dsVar);
            v50Var.U2.addListener(new q40(null == true ? 1 : 0, v50Var, z10));
            v50Var.U2.start();
            ObjectAnimator objectAnimator2 = v50Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r40Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.b6, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            v50Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            v50Var.V2.setInterpolator(dsVar);
            v50Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            v50Var.h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = v50Var.h0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(r40Var, (Property<r40, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(v50Var.N, (Property<f30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(v50Var.g0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            v50Var.h0.addListener(new o40(v50Var, i11));
            v50Var.h0.start();
            v50Var.a2.v.setClickable(!z10 || F3);
        }
        if (v50Var.y0 != dp) {
            v50Var.E1(dp);
        }
    }

    public static void N(v50 v50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (v50Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(v50Var.Y1, v50Var.a2, lVar, null, null, lVar.getParticipant(), v50Var.a1, v50Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void S(v50 v50Var, int i10, int[] iArr) {
        if (v50Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.y6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.zg, false), v50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kg, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false), v50Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.yg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.zg, false), v50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Bg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Cg, false), v50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kh, false);
            iArr[1] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.lh, false);
            iArr[2] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Mg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ng, false), v50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kg, false), org.telegram.ui.ActionBar.y6.x0(null, i12, false), v50Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ih, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Bg, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Fg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Hg, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Jg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                D3 = new v50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                D3 = new v50(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            D3.i0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(26));
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

    public static /* synthetic */ void m(v50 v50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(declineconferencecallinvite, new p20(v50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(v50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = v50Var.a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            v50Var.a1.invitedUsersMap.remove(l4);
            v50Var.a1.invitedUsersMessageIds.remove(l4);
            v50Var.O0(true);
        }
    }

    public static void n(final v50 v50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = v50Var.d;
        ArrayList arrayList = v50Var.F0;
        p50 p50Var = v50Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            v50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.i4) {
            v50Var.G1((org.telegram.ui.Cells.i4) view);
            return;
        }
        r7 = null;
        r7 = null;
        r7 = null;
        final Long l4 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.a4)) {
            if (i10 != p50Var.w) {
                if (i10 != p50Var.x) {
                    if (i10 == p50Var.y) {
                        v50Var.v1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = v50Var.a1;
                if (call2 == null || call2.call == null) {
                    return;
                }
                vg.n1 n1Var = new vg.n1(activity, v50Var.currentAccount, null, 4, new di.k0());
                ChatObject.Call call3 = v50Var.a1;
                n1Var.C0.addAll(call3 != null ? (Collection) Collection.-EL.stream(call3.sortedParticipants).map(new k2.g(5)).collect(Collectors.toSet()) : null);
                n1Var.h0(false, true);
                n1Var.A0 = new h20(v50Var, 3);
                n1Var.h0(false, true);
                n1Var.D0 = new bi.m5(18, v50Var, call);
                n1Var.show();
                return;
            }
            if (ChatObject.isChannel(v50Var.Z0) && (chat = v50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                v50Var.j1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(v50Var.i1());
            if (chatFull == null) {
                return;
            }
            v50Var.w0 = false;
            Context context = v50Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = v50Var.Z0;
            ChatObject.Call call4 = v50Var.a1;
            org.telegram.ui.Components.c40 c40Var = new org.telegram.ui.Components.c40(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            v50Var.E1 = c40Var;
            c40Var.setOnDismissListener(new l20(v50Var, 2));
            org.telegram.ui.Components.c40 c40Var2 = v50Var.E1;
            c40Var2.g0 = new v20(v50Var);
            c40Var2.show();
            return;
        }
        org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
        if (a4Var.getUser() == null) {
            return;
        }
        if (!v50Var.o1()) {
            v50Var.i0.P0(v50Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a4Var.getUser().id);
            if (a4Var.a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            v50Var.i0.u0(new ProfileActivity(bundle, null));
            v50Var.dismiss();
            return;
        }
        int i11 = i10 - p50Var.n;
        if (i11 < 0 || i11 >= v50Var.a1.shadyJoinParticipants.size()) {
            int i12 = i10 - p50Var.s;
            if (i12 < 0 || i12 >= v50Var.a1.shadyLeftParticipants.size()) {
                int i13 = i10 - p50Var.f;
                if (v50Var.s0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l4 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < v50Var.a1.invitedUsers.size()) {
                    l4 = v50Var.a1.invitedUsers.get(i13);
                }
                z10 = false;
            } else {
                l4 = v50Var.a1.shadyLeftParticipants.get(i10 - p50Var.s);
            }
        } else {
            l4 = v50Var.a1.shadyJoinParticipants.get(i10 - p50Var.n);
        }
        if (z10 || (invitedUser = v50Var.a1.invitedUsersMessageIds.get(l4)) == null) {
            return;
        }
        org.telegram.ui.Components.k80 F = org.telegram.ui.Components.k80.F(v50Var.container, v50Var.resourcesProvider, a4Var);
        final int i14 = 0;
        F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(v50Var) { // from class: org.telegram.ui.n20
            public final /* synthetic */ v50 b;

            {
                this.b = v50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        v50.r(this.b, invitedUser, l4);
                        break;
                    default:
                        v50.m(this.b, invitedUser, l4);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(v50Var) { // from class: org.telegram.ui.n20
            public final /* synthetic */ v50 b;

            {
                this.b = v50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        v50.r(this.b, invitedUser, l4);
                        break;
                    default:
                        v50.m(this.b, invitedUser, l4);
                        break;
                }
            }
        }, false);
        F.W(org.telegram.ui.ActionBar.y6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), v50Var.C0.getColor()));
        F.s = 96;
        F.Z();
    }

    public static /* synthetic */ void o(v50 v50Var, Activity activity) {
        LaunchActivity launchActivity = v50Var.i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            v50Var.i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            v50Var.O1(true, false);
            v50Var.N1(false);
            v50Var.a1.sortParticipants();
            v50Var.O0(true);
            v50Var.e.requestLayout();
            return;
        }
        v50Var.j0[0].d(1, false);
        if (v50Var.z0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            g40 g40Var = new g40(v50Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            v50Var.z0 = g40Var;
            g40Var.setBottomPadding(v50Var.containerView.getPaddingBottom());
            v50Var.container.addView(v50Var.z0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static /* synthetic */ void p(v50 v50Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v50Var.d2 = floatValue;
        v50Var.a2.n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        p30 p30Var = v50Var.C2;
        p30Var.setScaleX(f12);
        p30Var.setScaleY(f12);
        p30Var.setTranslationX((1.0f - v50Var.d2) * f10);
        p30Var.setTranslationY((1.0f - v50Var.d2) * f11);
        if (!v50Var.g2) {
            v50Var.W2.setAlpha((int) (v50Var.d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = v50Var.Z2;
        if (tVar != null) {
            tVar.a.setRoundCorners((1.0f - v50Var.d2) * AndroidUtilities.dp(8.0f));
        }
        p30Var.invalidate();
        v50Var.containerView.invalidate();
        o30 o30Var = v50Var.b;
        int i11 = (int) ((1.0f - v50Var.d2) * i10);
        o30Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static /* synthetic */ void q(v50 v50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = v50Var.a1;
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
            v50Var.a1.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = v50Var.a1.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(v50Var.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new hi.g1(v50Var, longValue, hashSet2, atomicInteger, size, call, str));
        }
        v50Var.O0(true);
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
        v50Var.O1(true, true);
    }

    public static /* synthetic */ void r(v50 v50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(declineconferencecallinvite, new p20(v50Var, 1));
        ChatObject.Call call = v50Var.a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            v50Var.O0(true);
        }
    }

    public static /* synthetic */ void s(v50 v50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(v50Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(v50 v50Var) {
        v50Var.Y0();
        v50Var.V0();
        v50Var.U0();
        v50Var.F.setTranslationY((-v50Var.C1.d()) + v50Var.containerView.getPaddingBottom());
        v50Var.G.invalidate();
        v50Var.Z0();
        v50Var.containerView.invalidate();
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
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1);
            y1VarArr[0] = y1Var;
            y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            if (z10) {
                y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false));
            } else {
                y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) y1VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.y6.rg;
                int i11 = org.telegram.ui.ActionBar.y6.pg;
                int i12 = org.telegram.ui.ActionBar.y6.ng;
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
            d.addView(y1VarArr[0], org.telegram.ui.Components.gb1.r(-1, -2));
            y1VarArr[0].setOnClickListener(new i20(y1VarArr, 0));
        }
        alertDialog$Builder.o(d);
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.y6.pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ag.j0(call, y1VarArr, selfId, runnable, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.a.R0 = false;
        }
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                e2Var.getWindow().setType(2038);
            } else {
                e2Var.getWindow().setType(2003);
            }
            e2Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            e2Var.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ug, false));
        }
        e2Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.vg, null);
        }
        e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hg, false));
    }

    public static /* synthetic */ void u(v50 v50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(v50Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
        }
    }

    public static /* synthetic */ void v(v50 v50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(v50Var.currentAccount).lambda$processUpdates$379(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(v50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(v50Var, hashSet, call, str, 15));
    }

    public static /* synthetic */ void w(v50 v50Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(v50Var.currentAccount).getUser(l4));
            getrequirementstocontact.id.add(MessagesController.getInstance(v50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.i30 i30Var = new org.telegram.ui.Components.i30(v50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(v50Var.currentAccount).isPremium()) {
            i30Var.run();
        } else {
            ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(getrequirementstocontact, new ea(arrayList, arrayList2, i30Var, 13));
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

    public static /* synthetic */ void x(v50 v50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(34, v50Var.currentAccount, U.getContext(), U, new di.k0());
        j0Var.M1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static /* synthetic */ void y(v50 v50Var, org.telegram.ui.ActionBar.e2[] e2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            e2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        e2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            v50Var.x1(null, j10, 3);
        } else {
            org.telegram.ui.Components.g5.e0(v50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.r2) v50Var.i0.O().getFragmentStack().get(v50Var.i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
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
        m30 m30Var = this.a2;
        float max = Math.max(f7, m30Var == null ? 0.0f : m30Var.c);
        int i10 = org.telegram.ui.ActionBar.y6.jg;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.y6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.y6.x0(null, i11, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.k1.H(-14472653);
        this.f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.tg, false), f7, 1.0f);
        f50 f50Var = this.p0;
        if (f50Var != null) {
            f50Var.j = offsetColor2;
            z10 z10Var = f50Var.g;
            if (z10Var != null) {
                z10Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        b50 b50Var = this.Q;
        b50Var.setGlowColor(offsetColor2);
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Dg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Eg, false), f7, 1.0f);
        this.s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.lg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.mg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider);
        int childCount = b50Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = b50Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) childAt;
                if (o1()) {
                    b4Var.a(w02, w02);
                } else {
                    b4Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.i4;
                r40 r40Var = this.O;
                if (z10) {
                    ((org.telegram.ui.Cells.i4) childAt).f(r40Var.getTag() != null ? org.telegram.ui.ActionBar.y6.rg : org.telegram.ui.ActionBar.y6.mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.a4) {
                    ((org.telegram.ui.Cells.a4) childAt).a(r40Var.getTag() != null ? org.telegram.ui.ActionBar.y6.rg : org.telegram.ui.ActionBar.y6.mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        b50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        b50 b50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        s4.e1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f7 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.a1;
        if (call == null || (b50Var = this.Q) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) == null) {
            return;
        }
        m30 m30Var = this.a2;
        if (m30Var.b) {
            int i10 = 0;
            while (true) {
                i30 i30Var = this.m2;
                if (i10 >= i30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) i30Var.getChildAt(i10);
                if (MessageObject.getPeerId(b30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    b30Var.setAmplitude(f7 * 15.0f);
                }
                i10++;
            }
        } else {
            int indexOf = (this.s0 ? this.D0 : this.a1.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = b50Var.K(indexOf + this.P.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.i4) {
                    ((org.telegram.ui.Cells.i4) view).setAmplitude(f7 * 15.0f);
                    if (view == this.X2 && !this.l2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        m30Var.k(groupCallParticipant, f7 * 15.0f);
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

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.z3.e;
            z20 z20Var = this.e;
            z20Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.m2.invalidate();
            this.containerView.invalidate();
            z20Var.invalidate();
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

    public final void E1(float f7) {
        int i10;
        this.y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float dp = f7 - AndroidUtilities.dp(74.0f);
        float f10 = this.backgroundPaddingTop + dp;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        k50 k50Var = this.U0;
        m30 m30Var = this.a2;
        g30 g30Var = this.f1;
        e30 e30Var = this.e1;
        if (f10 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            i10 = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (k50Var != null) {
                k50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float A = d3.A(min, 0.1f, 1.2f, 1.0f);
            e30Var.setScaleX(Math.max(0.9f, A));
            e30Var.setScaleY(Math.max(0.9f, A));
            float f11 = 1.0f - (min * 1.2f);
            e30Var.setAlpha((1.0f - m30Var.c) * Math.max(0.0f, f11));
            g30Var.setScaleX(Math.max(0.9f, A));
            g30Var.setScaleY(Math.max(0.9f, A));
            g30Var.setAlpha((1.0f - m30Var.c) * Math.max(0.0f, f11));
        } else {
            e30Var.setScaleX(1.0f);
            e30Var.setScaleY(1.0f);
            e30Var.setAlpha(1.0f - m30Var.c);
            g30Var.setScaleX(1.0f);
            g30Var.setScaleY(1.0f);
            g30Var.setAlpha(1.0f - m30Var.c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f12 = i10;
        this.z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f12));
        this.j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        if (k50Var != null) {
            k50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        d40 d40Var = this.R;
        if (d40Var != null) {
            d40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
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
        org.telegram.ui.Cells.i4 i4Var;
        s50 s50Var;
        long j10;
        fi.l5 l5Var;
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
        c50 c50Var;
        TLRPC.FileLocation fileLocation;
        int x9;
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
            v40 v40Var = this.f3;
            if (v40Var != null) {
                v40Var.dismiss();
                this.f3 = null;
                return false;
            }
            b1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.a1.videoNotAvailableParticipant) {
                    i4Var = new org.telegram.ui.Cells.i4(lVar.getContext());
                    i4Var.e(this.d, lVar.getParticipant().participant, this.a1, MessageObject.getPeerId(this.A0), null, false);
                    org.telegram.ui.Components.r5 r5Var = i4Var.s;
                    if (r5Var != null) {
                        r5Var.f();
                    }
                    this.b3 = false;
                    this.Y2 = lVar;
                    this.Z2 = lVar.getRenderer();
                    if (!G3 && !F3) {
                        this.containerView.addView(i4Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (i4Var != null) {
                        boolean z13 = (F3 || G3 || AndroidUtilities.isInMultiwindow) ? false : true;
                        TLRPC.GroupCallParticipant participant = i4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new fi(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new e20(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.E2 = linearLayout;
                            fi.l5 l5Var2 = new fi.l5(getContext(), linearLayout, linearLayout2, 7);
                            l5Var2.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            l5Var2.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.tg, false), this.U1, 1.0f);
                            if (linearLayout2 == null || i4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                s50Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                l5Var2.addView(linearLayout2, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                s50Var = new s50(this, getContext(), participant);
                                linearLayout2.addView(s50Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            l5Var2.addView(linearLayout, org.telegram.ui.Components.gb1.o(0.0f, s50Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.w1 w1Var2 = new org.telegram.ui.ActionBar.w1(getContext(), R.style.scrollbarShapeStyle, l5Var2);
                            w1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(w1Var2, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                            s50 s50Var2 = s50Var;
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
                                    l5Var = l5Var2;
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
                                    l5Var = l5Var2;
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
                                l5Var = l5Var2;
                                w1Var = w1Var2;
                                accountInstance = accountInstance2;
                            }
                            if (i4Var.c()) {
                                if (o1() && i4Var.K) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    d3.n(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                arrayList.add(LocaleController.getString(i4Var.b.getImageReceiver().hasNotThumb() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
                                d3.n(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
                                } else {
                                    arrayList.add(LocaleController.getString(TextUtils.isEmpty(participant.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
                                }
                                d3.n(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, 10, arrayList2, arrayList3);
                                arrayList.add(LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
                                d3.n(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j11 = 0;
                            } else if (Q0()) {
                                if (!o1() && z10 && participant.muted) {
                                    if (o1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        d3.r(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j11 = 0;
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    d3.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
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
                                        d3.r(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                        if (o1() ? !(z10 || !ChatObject.canBlockUsers(this.Z0)) : !((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                            d3.n(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                        }
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                d3.r(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                if (o1()) {
                                }
                            } else {
                                j11 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    d3.r(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    d3.n(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j14 = peer2.channel_id;
                                    if (j14 != 0 && !ChatObject.isMegagroup(this.currentAccount, j14)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        d3.r(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                }
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                d3.r(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getContext(), i14 == 0, i14 == size2 + (-1));
                                if (((Integer) arrayList3.get(i14)).intValue() != 2) {
                                    int i15 = org.telegram.ui.ActionBar.y6.hg;
                                    r42 = 0;
                                    z12 = false;
                                    g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i15, false), org.telegram.ui.ActionBar.y6.x0(null, i15, false));
                                } else {
                                    r42 = 0;
                                    z12 = false;
                                    int i16 = org.telegram.ui.ActionBar.y6.vg;
                                    g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i16, false), org.telegram.ui.ActionBar.y6.x0(null, i16, false));
                                }
                                g1Var.setSelectorColor(org.telegram.ui.ActionBar.y6.x0(r42, org.telegram.ui.ActionBar.y6.eg, z12));
                                g1Var.j((CharSequence) arrayList.get(i14), ((Integer) arrayList2.get(i14)).intValue(), r42);
                                linearLayout.addView(g1Var);
                                g1Var.setTag(arrayList3.get(i14));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                g1Var.setOnClickListener(new di.c6(this, i14, arrayList4, groupCallParticipant, 3));
                                i14++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            w1Var.addView(l5Var, org.telegram.ui.Components.gb1.B(-2, -2, 51));
                            b50 b50Var = this.Q;
                            b50Var.C0();
                            this.Y.X = false;
                            this.X2 = i4Var;
                            i4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            b50Var.invalidate();
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
                                    org.telegram.ui.Components.y9 avatarImageView = this.X2.getAvatarImageView();
                                    o30 o30Var = this.b;
                                    o30Var.setParentAvatarImage(avatarImageView);
                                    o30Var.setHasActiveVideo(z16);
                                    o30Var.M(j12, true);
                                    o30Var.setCreateThumbFromParent(true);
                                    o30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    org.telegram.ui.Components.voip.t tVar2 = this.Z2;
                                    if (tVar2 != null) {
                                        tVar2.h = true;
                                        tVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.A0) == j12 && this.h2 != null && (c50Var = this.i2) != null && (fileLocation = c50Var.c) != null) {
                                        o30Var.A(c50Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                this.containerView.addView(this.e2, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                                this.g2 = true;
                                r30 r30Var = this.b2;
                                if (r30Var == null) {
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
                                    r30Var.setBackground(new BitmapDrawable(createBitmap));
                                    r30Var.setAlpha(0.0f);
                                    r30Var.setVisibility(0);
                                    r30Var.bringToFront();
                                }
                                this.c3 = true;
                                this.C2.setVisibility(i11);
                                if (s50Var2 != null) {
                                    s50Var2.invalidate();
                                }
                                y1(true, i4Var);
                                org.telegram.ui.Components.b30 b30Var = this.a3;
                                if (b30Var != null) {
                                    b30Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.f2 = false;
                            v40 v40Var2 = new v40(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.f3 = v40Var2;
                            v40Var2.e = true;
                            v40Var2.c = 220;
                            v40Var2.setOutsideTouchable(true);
                            this.f3.setClippingEnabled(true);
                            this.f3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.f3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            this.f3.setInputMethodMode(2);
                            this.f3.setSoftInputMode(0);
                            this.f3.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.b30 b30Var2 = this.a3;
                            if (b30Var2 != null) {
                                boolean z17 = F3;
                                m30 m30Var = this.a2;
                                i30 i30Var = this.m2;
                                if (z17) {
                                    x9 = AndroidUtilities.dp(32.0f) + (((int) (m30Var.getX() + (i30Var.getX() + b30Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    i10 = ((int) (m30Var.getY() + (i30Var.getY() + this.a3.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x9 = ((int) (m30Var.getX() + (i30Var.getX() + b30Var2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y3 = (m30Var.getY() + (i30Var.getY() + this.a3.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    i10 = (int) y3;
                                }
                            } else {
                                x9 = (int) (((b50Var.getX() + b50Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.b3) {
                                    y10 = i4Var.getY() + b50Var.getY();
                                    measuredHeight = i4Var.getClipHeight();
                                } else if (this.Y2 != null) {
                                    y10 = this.Y2.getY() + b50Var.getY();
                                    measuredHeight = this.Y2.getMeasuredHeight();
                                } else {
                                    y3 = b50Var.getY();
                                    i10 = (int) y3;
                                }
                                i10 = (int) (y10 + measuredHeight);
                            }
                            this.f3.showAtLocation(b50Var, 51, x9, i10);
                            this.e3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.W2, org.telegram.ui.Components.v6.b, 0, 100));
                            this.e3.playTogether(arrayList5);
                            this.e3.setDuration(150L);
                            this.e3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.b30) {
                    org.telegram.ui.Components.b30 b30Var3 = (org.telegram.ui.Components.b30) view;
                    if (b30Var3.getParticipant() != this.a1.videoNotAvailableParticipant.participant) {
                        i4Var = new org.telegram.ui.Cells.i4(b30Var3.getContext());
                        i4Var.e(this.d, b30Var3.getParticipant(), this.a1, MessageObject.getPeerId(this.A0), null, false);
                        org.telegram.ui.Components.r5 r5Var2 = i4Var.s;
                        if (r5Var2 != null) {
                            r5Var2.f();
                        }
                        this.b3 = false;
                        this.a3 = b30Var3;
                        org.telegram.ui.Components.voip.t renderer = b30Var3.getRenderer();
                        this.Z2 = renderer;
                        if (renderer != null && renderer.b) {
                            this.Z2 = null;
                        }
                        this.containerView.addView(i4Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    i4Var = (org.telegram.ui.Cells.i4) view;
                    this.b3 = true;
                }
                if (i4Var != null) {
                }
            }
        }
        return false;
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(8, getContext(), null, true);
            this.m0 = t40Var;
            t40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
        org.telegram.ui.Components.voip.w2 w2Var = this.v;
        org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
        org.telegram.ui.Components.voip.w2 w2Var3 = this.r;
        org.telegram.ui.Components.voip.w2 w2Var4 = this.f;
        org.telegram.ui.Components.voip.w2 w2Var5 = this.n;
        org.telegram.ui.Components.voip.w2 w2Var6 = this.s;
        org.telegram.ui.Components.voip.w2 w2Var7 = this.w;
        z20 z20Var = this.e;
        boolean z15 = false;
        if (call == null || call.isScheduled()) {
            z20Var.c(w2Var7, this.V0 > 0.1f, z10);
            z20Var.c(w2Var6, this.V0 > 0.1f, z10);
            z20Var.c(w2Var3, this.V0 > 0.1f, z10);
            z20Var.c(w2Var5, false, z10);
            z20Var.c(w2Var4, false, z10);
            z20Var.c(w2Var2, false, z10);
            z20Var.c(w2Var, false, z10);
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
        z20Var.c(w2Var7, true, z10);
        z20Var.c(w2Var6, true, z10);
        z20Var.c(w2Var5, z12, z10);
        z20Var.c(w2Var4, z14, z10);
        z20Var.c(w2Var3, z15, z10);
        z20Var.c(w2Var2, z13, z10);
        z20Var.c(w2Var, z11, z10);
    }

    public final void J1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.a1;
        org.telegram.ui.ActionBar.w0 w0Var = this.k1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.a1 == null) {
                w0Var.setVisibility(8);
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
        org.telegram.ui.ActionBar.g1 g1Var = this.n1;
        if (canUserDoAdminAction || (((!ChatObject.isChannel(this.Z0) || ((chat2 = this.Z0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.Z0) || ChatObject.canUserDoAdminAction(this.Z0, 3))) || (ChatObject.isChannel(this.Z0) && (chat = this.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            g1Var.setVisibility(0);
        } else {
            g1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.a1;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.y1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.x1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        } else {
            g1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            g1Var2.setVisibility(this.a1.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.a1;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.q1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(8);
        } else {
            g1Var4.setVisibility(0);
        }
        g1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        g1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.w1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.o1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.s1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.t1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.a1.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (!this.a1.canRecordVideo() || this.a1.isScheduled() || r1()) {
                g1Var8.setVisibility(8);
            } else {
                g1Var8.setVisibility(0);
            }
            w0Var2.setVisibility(8);
            boolean z11 = this.a1.recording;
            q50 q50Var = this.d1;
            q50Var.f = z11;
            q50Var.d = 1.0f;
            q50Var.invalidateSelf();
            if (this.a1.recording) {
                if (this.D1 == null) {
                    h20 h20Var = new h20(this, 6);
                    this.D1 = h20Var;
                    AndroidUtilities.runOnUIThread(h20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                h20 h20Var2 = this.D1;
                if (h20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(h20Var2);
                    this.D1 = null;
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                g1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                g1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            L1();
        } else {
            boolean z12 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
            boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z12 || (!(this.a1.canRecordVideo() || z13) || this.a1.isScheduled() || r1())) {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(8);
            } else if (z13) {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(0);
                g1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
            } else {
                g1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(0);
            }
            g1Var5.setVisibility(8);
            g1Var6.setVisibility(8);
            g1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var9 = this.r1;
        if (Q02 && this.a1.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        w0Var.Q(4, z10);
        this.p1.setVisibility((!r1() || this.a1.isScheduled()) ? 0 : 8);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility == 0 || g1Var9.getVisibility() == 0 || g1Var.getVisibility() == 0 || g1Var8.getVisibility() == 0 || g1Var7.getVisibility() == 0 || g1Var5.getVisibility() == 0) {
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
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !r1() || g1Var.getVisibility() != 8) {
            w0Var.setVisibility(0);
        } else {
            w0Var.setVisibility(8);
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
        u50[] u50VarArr;
        boolean z13;
        u50 u50Var;
        u50 u50Var2;
        boolean z14;
        boolean z15;
        m30 m30Var = this.a2;
        boolean z16 = m30Var != null && m30Var.b && (AndroidUtilities.isTablet() || F3 == q1());
        if (!r1() && this.F1 == i10 && z10) {
            return;
        }
        int i12 = 3;
        org.telegram.ui.Components.xj0 xj0Var = this.J0;
        if (i10 == 7) {
            string6 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            P5 = xj0Var.P(202);
        } else {
            if (i10 != 6) {
                if (i10 != 5) {
                    if (i10 == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i13 = this.F1;
                        if (i13 == 3) {
                            int i14 = xj0Var.f;
                            P3 = (i14 == 136 || i14 == 173 || i14 == 274 || i14 == 311) ? xj0Var.P(99) : false;
                        } else if (i13 == 5) {
                            P3 = xj0Var.P(404);
                        } else if (i13 == 7) {
                            P3 = xj0Var.P(376);
                        } else if (i13 == 6) {
                            P3 = xj0Var.P(237);
                        } else {
                            if (i13 == 2) {
                                z12 = xj0Var.P(36);
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
                                org.telegram.ui.Components.voip.w2 w2Var = this.w;
                                w2Var.setContentDescription(D);
                                w2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                                a30 a30Var = this.x;
                                ImageView imageView = this.y;
                                if (z10) {
                                    if (z12) {
                                        if (i10 == 5) {
                                            xj0Var.M(376);
                                        } else if (i10 == 7) {
                                            xj0Var.M(173);
                                        } else if (i10 == 6) {
                                            xj0Var.M(311);
                                        } else if (i10 == 0) {
                                            int i15 = this.F1;
                                            if (i15 == 5) {
                                                xj0Var.M(376);
                                            } else if (i15 == 7) {
                                                xj0Var.M(344);
                                            } else if (i15 == 6) {
                                                xj0Var.M(202);
                                            } else if (i15 == 2) {
                                                xj0Var.M(0);
                                            } else {
                                                xj0Var.M(69);
                                            }
                                        } else if (i10 == 1 || (this.F1 == 2 && o1())) {
                                            xj0Var.M(this.F1 == 4 ? 69 : 36);
                                        } else if (i10 == 4) {
                                            xj0Var.M(99);
                                        } else if (z11) {
                                            int i16 = this.F1;
                                            if (i16 == 7) {
                                                xj0Var.M(274);
                                            } else if (i16 == 6) {
                                                xj0Var.M(237);
                                            } else if (i16 == 1) {
                                                xj0Var.M(136);
                                            } else {
                                                xj0Var.M(99);
                                            }
                                        } else {
                                            int i17 = this.F1;
                                            if (i17 == 5) {
                                                xj0Var.M(376);
                                            } else if (i17 == 7) {
                                                xj0Var.M(344);
                                            } else if (i17 == 6) {
                                                xj0Var.M(202);
                                            } else if (i17 == 2 || i17 == 4) {
                                                xj0Var.M(0);
                                            } else {
                                                xj0Var.M(69);
                                            }
                                        }
                                    }
                                    a30Var.d();
                                    if (!r1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        a30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((m30Var != null && m30Var.b && (AndroidUtilities.isTablet() || F3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        a30Var.setVisibility(8);
                                    }
                                    this.F1 = i10;
                                } else {
                                    this.F1 = i10;
                                    xj0Var.N(xj0Var.f - 1, false, true);
                                    if (!r1() || this.a1.isScheduled()) {
                                        imageView.setVisibility(8);
                                        a30Var.setVisibility(0);
                                    } else {
                                        imageView.setImageResource((m30Var != null && m30Var.b && (AndroidUtilities.isTablet() || F3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                        imageView.setVisibility(0);
                                        a30Var.setVisibility(8);
                                    }
                                }
                                w2Var.invalidate();
                                i11 = this.F1;
                                u50VarArr = this.K1;
                                if (u50VarArr[i11] == null) {
                                    u50VarArr[i11] = new u50(i11);
                                    int i18 = this.F1;
                                    if (i18 == 3) {
                                        u50VarArr[i18].g = null;
                                    } else if (p1(i18)) {
                                        u50VarArr[this.F1].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ih, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kh, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    } else {
                                        int i19 = this.F1;
                                        if (i19 != 1) {
                                            z13 = false;
                                            u50VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Jg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                            u50Var = u50VarArr[this.F1];
                                            u50Var2 = this.N1;
                                            if (u50Var != u50Var2) {
                                                this.M1 = u50Var2;
                                                this.N1 = u50Var;
                                                if (u50Var2 == null || !z10) {
                                                    this.L1 = 1.0f;
                                                    this.M1 = null;
                                                } else {
                                                    this.L1 = 0.0f;
                                                }
                                            }
                                            if (!z10) {
                                                u50 u50Var3 = this.N1;
                                                if (u50Var3 != null) {
                                                    int i20 = u50Var3.i;
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
                                        u50VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Fg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                    }
                                }
                                z13 = false;
                                u50Var = u50VarArr[this.F1];
                                u50Var2 = this.N1;
                                if (u50Var != u50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            P3 = xj0Var.P(99);
                        }
                        z12 = P3;
                        str = string3;
                        string2 = string4;
                    } else {
                        if (i10 == 1) {
                            string5 = LocaleController.getString(o1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            P4 = xj0Var.P(this.F1 == 4 ? 99 : 69);
                        } else if (o1() && i10 == 2) {
                            string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            P4 = xj0Var.P(99);
                        } else {
                            if (i10 != 4) {
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.participants.f(MessageObject.getPeerId(this.A0));
                                z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
                                if (z11) {
                                    int i21 = this.F1;
                                    if (i21 == 7) {
                                        P2 = xj0Var.P(311);
                                    } else if (i21 == 6) {
                                        P2 = xj0Var.P(274);
                                    } else if (i21 == 1) {
                                        P2 = xj0Var.P(173);
                                    } else {
                                        P = xj0Var.P(136);
                                    }
                                    P = P2;
                                } else {
                                    int i22 = this.F1;
                                    if (i22 == 5) {
                                        P2 = xj0Var.P(404);
                                    } else if (i22 == 7) {
                                        P = xj0Var.P(376);
                                    } else if (i22 == 6) {
                                        P = xj0Var.P(237);
                                    } else if (i22 == 2 || i22 == 4) {
                                        P = xj0Var.P(36);
                                    } else {
                                        P2 = xj0Var.P(99);
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
                                org.telegram.ui.Components.voip.w2 w2Var2 = this.w;
                                w2Var2.setContentDescription(D);
                                w2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                                a30 a30Var2 = this.x;
                                ImageView imageView2 = this.y;
                                if (z10) {
                                }
                                w2Var2.invalidate();
                                i11 = this.F1;
                                u50VarArr = this.K1;
                                if (u50VarArr[i11] == null) {
                                }
                                z13 = false;
                                u50Var = u50VarArr[this.F1];
                                u50Var2 = this.N1;
                                if (u50Var != u50Var2) {
                                }
                                if (!z10) {
                                }
                                this.e.invalidate();
                            }
                            string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            P3 = xj0Var.P(136);
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
                    org.telegram.ui.Components.voip.w2 w2Var22 = this.w;
                    w2Var22.setContentDescription(D);
                    w2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                    a30 a30Var22 = this.x;
                    ImageView imageView22 = this.y;
                    if (z10) {
                    }
                    w2Var22.invalidate();
                    i11 = this.F1;
                    u50VarArr = this.K1;
                    if (u50VarArr[i11] == null) {
                    }
                    z13 = false;
                    u50Var = u50VarArr[this.F1];
                    u50Var2 = this.N1;
                    if (u50Var != u50Var2) {
                    }
                    if (!z10) {
                    }
                    this.e.invalidate();
                }
                string5 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                z12 = xj0Var.P(377);
                string2 = "";
                str = string5;
                z11 = false;
                if (r1()) {
                }
                str2 = string2;
                if (!TextUtils.isEmpty(str2)) {
                }
                org.telegram.ui.Components.voip.w2 w2Var222 = this.w;
                w2Var222.setContentDescription(D);
                w2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
                a30 a30Var222 = this.x;
                ImageView imageView222 = this.y;
                if (z10) {
                }
                w2Var222.invalidate();
                i11 = this.F1;
                u50VarArr = this.K1;
                if (u50VarArr[i11] == null) {
                }
                z13 = false;
                u50Var = u50VarArr[this.F1];
                u50Var2 = this.N1;
                if (u50Var != u50Var2) {
                }
                if (!z10) {
                }
                this.e.invalidate();
            }
            string6 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            P5 = xj0Var.P(344);
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
        org.telegram.ui.Components.voip.w2 w2Var2222 = this.w;
        w2Var2222.setContentDescription(D);
        w2Var2222.c(0, 0, 0, 1.0f, true, str, false, z10);
        a30 a30Var2222 = this.x;
        ImageView imageView2222 = this.y;
        if (z10) {
        }
        w2Var2222.invalidate();
        i11 = this.F1;
        u50VarArr = this.K1;
        if (u50VarArr[i11] == null) {
        }
        z13 = false;
        u50Var = u50VarArr[this.F1];
        u50Var2 = this.N1;
        if (u50Var != u50Var2) {
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
        org.telegram.ui.ActionBar.g1 g1Var = this.s1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        d40 d40Var = this.R;
        if ((d40Var == null || this.a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (d40Var == null) {
                return;
            }
        }
        if (!z10) {
            d30 d30Var = this.w2;
            AndroidUtilities.cancelRunOnUIThread(d30Var);
            d30Var.run();
            ChatObject.Call call = this.a1;
            b50 b50Var = this.Q;
            if (call == null || call.isScheduled()) {
                b50Var.setVisibility(4);
            } else {
                b50Var.setVisibility(0);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.g1 g1Var = this.w1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.ds.f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
            this.W0 = dsVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * dsVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        d40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        a50 a50Var = this.V;
        a50Var.setAlpha(f7);
        a50Var.setScaleX(interpolation);
        a50Var.setScaleY(interpolation);
        b40 b40Var = this.T;
        b40Var.setScaleX(f11);
        b40Var.setScaleY(f11);
        b40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.k1.setAlpha(f7);
        int i10 = f11 != 0.0f ? 0 : 4;
        if (i10 != d40Var.getVisibility()) {
            d40Var.setVisibility(i10);
            b40Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        org.telegram.ui.Components.voip.w2 w2Var = this.r;
        if (w2Var == null || w2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        z20 z20Var = this.e;
        if (sharedInstance == null || r1()) {
            w2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.Z0) || (ChatObject.hasAdminRights(this.Z0) && ChatObject.canAddUsers(this.Z0));
            mh.a aVar = (mh.a) z20Var.c.get(w2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                w2Var.setEnabled(z11);
            }
            w2Var.b(true, false);
            return;
        }
        mh.a aVar2 = (mh.a) z20Var.c.get(w2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            w2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            w2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
        } else if (z13) {
            w2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            w2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
        } else {
            w2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        }
        w2Var.b(z13, z10);
        h1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.a0 != i10) {
            this.a0 = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.b0, i10);
        }
        org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
        if (w2Var2.getVisibility() == 0) {
            w2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
            w2Var2.b(h1() != 1, z10);
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
        b50 b50Var;
        p50 p50Var;
        m30 m30Var;
        b50 b50Var2;
        boolean z11;
        int i10;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        b50 b50Var3;
        m30 m30Var2;
        boolean z12;
        i30 i30Var;
        ?? r02;
        ?? r82;
        ChatObject.Call call;
        boolean z13;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        s4.e1 G;
        f fVar;
        int i14;
        v50 v50Var = this;
        p50 p50Var2 = v50Var.P;
        m30 m30Var3 = v50Var.a2;
        if (m30Var3 == null || (b50Var = v50Var.Q) == null || v50Var.a1 == null || v50Var.s0) {
            return;
        }
        if (m30Var3.b) {
            m30Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(v50Var.a1.selfPeer);
        if (peerId != MessageObject.getPeerId(v50Var.A0) && v50Var.a1.participants.f(peerId) != null) {
            v50Var.A0 = v50Var.a1.selfPeer;
        }
        int childCount = b50Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = b50Var.getChildAt(i17);
            s4.e1 G2 = b50Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = v50Var.q0;
        arrayList3.clear();
        if (!G3) {
            arrayList3.addAll(v50Var.a1.visibleVideoParticipants);
        } else if (m30Var3.b) {
            arrayList3.addAll(v50Var.a1.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = m30Var3.e;
            if (videoParticipant3 != null) {
                arrayList3.remove(videoParticipant3);
            }
        }
        if (b50Var.getItemAnimator() != null && !z10) {
            b50Var.setItemAnimator(null);
        } else if (b50Var.getItemAnimator() == null && z10) {
            b50Var.setItemAnimator(v50Var.X);
        }
        try {
            fVar = new f(p50Var2, 21);
            try {
                try {
                    z11 = true;
                } catch (Exception e) {
                    e = e;
                    p50Var = p50Var2;
                    z11 = true;
                }
            } catch (Exception e10) {
                e = e10;
                p50Var = p50Var2;
                b50Var2 = b50Var;
                z11 = true;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i16;
                m30Var = m30Var3;
            }
        } catch (Exception e11) {
            e = e11;
            p50Var = p50Var2;
            m30Var = m30Var3;
            b50Var2 = b50Var;
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
                        m30Var = m30Var3;
                    } catch (Exception e12) {
                        e = e12;
                        m30Var = m30Var3;
                    }
                } catch (Exception e13) {
                    e = e13;
                    i11 = i16;
                    m30Var = m30Var3;
                    b50Var2 = b50Var;
                    i10 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e14) {
                e = e14;
                p50Var = p50Var2;
                arrayList = arrayList3;
                i11 = i16;
                m30Var = m30Var3;
                b50Var2 = b50Var;
                i10 = childCount;
            }
        } catch (Exception e15) {
            e = e15;
            p50Var = p50Var2;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i16;
            m30Var = m30Var3;
            b50Var2 = b50Var;
            FileLog.e(e);
            p50Var.l();
            v50Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList4 = v50Var.D0;
            arrayList4.clear();
            arrayList4.addAll(v50Var.a1.visibleParticipants);
            ArrayList arrayList5 = v50Var.E0;
            arrayList5.clear();
            arrayList2 = arrayList;
            arrayList5.addAll(arrayList2);
            ArrayList arrayList6 = v50Var.F0;
            arrayList6.clear();
            arrayList6.addAll(v50Var.a1.invitedUsers);
            ArrayList arrayList7 = v50Var.G0;
            arrayList7.clear();
            arrayList7.addAll(v50Var.a1.shadyJoinParticipants);
            ArrayList arrayList8 = v50Var.H0;
            arrayList8.clear();
            arrayList8.addAll(v50Var.a1.shadyLeftParticipants);
            p50 p50Var3 = p50Var;
            v50Var.I0 = p50Var3.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            b50Var3 = b50Var2;
            boolean c10 = m30Var.c();
            m30Var2 = m30Var;
            if (m30Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.c30 c30Var = v50Var.p2;
            i30Var = v50Var.m2;
            c30Var.G(i30Var, z11);
            if (i30Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (b50Var3.getVisibility() == 0) {
            }
            r02 = v50Var.Z1;
            r02.clear();
            r02.addAll(v50Var.Y1);
            while (r82 < r02.size()) {
            }
            call = v50Var.a1;
            if (call != null) {
            }
            ChatObject.Call call2 = v50Var.a1;
            if (call2 != null) {
            }
            v50Var.C3.a(z13, z10);
            if (z13 == v50Var.I2) {
            }
        }
        try {
            b50Var2 = b50Var;
            try {
                try {
                    try {
                    } catch (Exception e16) {
                        e = e16;
                    }
                } catch (Exception e17) {
                    e = e17;
                    i10 = childCount;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                }
                try {
                    arrayList = arrayList3;
                    i11 = i14;
                    i10 = childCount;
                    v50Var = this;
                    p50Var = p50Var2;
                    try {
                        v50Var.D1(p50Var2.K, p50Var2.w, p50Var2.d, p50Var2.e, p50Var2.f, p50Var2.h, p50Var2.n, p50Var2.r, p50Var2.s, p50Var2.v, p50Var2.G, p50Var2.H, p50Var2.I, p50Var2.J, p50Var2.x, p50Var2.y);
                        p50Var.E();
                        z11 = true;
                        try {
                            s4.p.c(v50Var.w3, true).b(fVar);
                        } catch (Exception e18) {
                            e = e18;
                            FileLog.e(e);
                            p50Var.l();
                            v50Var.a1.saveActiveDates();
                            if (view != null) {
                            }
                            ArrayList arrayList42 = v50Var.D0;
                            arrayList42.clear();
                            arrayList42.addAll(v50Var.a1.visibleParticipants);
                            ArrayList arrayList52 = v50Var.E0;
                            arrayList52.clear();
                            arrayList2 = arrayList;
                            arrayList52.addAll(arrayList2);
                            ArrayList arrayList62 = v50Var.F0;
                            arrayList62.clear();
                            arrayList62.addAll(v50Var.a1.invitedUsers);
                            ArrayList arrayList72 = v50Var.G0;
                            arrayList72.clear();
                            arrayList72.addAll(v50Var.a1.shadyJoinParticipants);
                            ArrayList arrayList82 = v50Var.H0;
                            arrayList82.clear();
                            arrayList82.addAll(v50Var.a1.shadyLeftParticipants);
                            p50 p50Var32 = p50Var;
                            v50Var.I0 = p50Var32.F;
                            i12 = i10;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            b50Var3 = b50Var2;
                            boolean c102 = m30Var.c();
                            m30Var2 = m30Var;
                            if (m30Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.c30 c30Var2 = v50Var.p2;
                                i30Var = v50Var.m2;
                                c30Var2.G(i30Var, z11);
                                if (i30Var.getVisibility() == 0) {
                                }
                                if (G3) {
                                }
                                if (b50Var3.getVisibility() == 0) {
                                }
                                r02 = v50Var.Z1;
                                r02.clear();
                                r02.addAll(v50Var.Y1);
                                while (r82 < r02.size()) {
                                }
                                call = v50Var.a1;
                                if (call != null) {
                                }
                                ChatObject.Call call22 = v50Var.a1;
                                if (call22 != null) {
                                }
                                v50Var.C3.a(z13, z10);
                                if (z13 == v50Var.I2) {
                                }
                            }
                            z12 = false;
                            org.telegram.ui.Components.c30 c30Var22 = v50Var.p2;
                            i30Var = v50Var.m2;
                            c30Var22.G(i30Var, z11);
                            if (i30Var.getVisibility() == 0) {
                            }
                            if (G3) {
                            }
                            if (b50Var3.getVisibility() == 0) {
                            }
                            r02 = v50Var.Z1;
                            r02.clear();
                            r02.addAll(v50Var.Y1);
                            while (r82 < r02.size()) {
                            }
                            call = v50Var.a1;
                            if (call != null) {
                            }
                            ChatObject.Call call222 = v50Var.a1;
                            if (call222 != null) {
                            }
                            v50Var.C3.a(z13, z10);
                            if (z13 == v50Var.I2) {
                            }
                        }
                    } catch (Exception e19) {
                        e = e19;
                        z11 = true;
                    }
                } catch (Exception e20) {
                    e = e20;
                    v50Var = this;
                    arrayList = arrayList3;
                    i11 = i14;
                    z11 = true;
                    i10 = childCount;
                    p50Var = p50Var2;
                    FileLog.e(e);
                    p50Var.l();
                    v50Var.a1.saveActiveDates();
                    if (view != null) {
                    }
                    ArrayList arrayList422 = v50Var.D0;
                    arrayList422.clear();
                    arrayList422.addAll(v50Var.a1.visibleParticipants);
                    ArrayList arrayList522 = v50Var.E0;
                    arrayList522.clear();
                    arrayList2 = arrayList;
                    arrayList522.addAll(arrayList2);
                    ArrayList arrayList622 = v50Var.F0;
                    arrayList622.clear();
                    arrayList622.addAll(v50Var.a1.invitedUsers);
                    ArrayList arrayList722 = v50Var.G0;
                    arrayList722.clear();
                    arrayList722.addAll(v50Var.a1.shadyJoinParticipants);
                    ArrayList arrayList822 = v50Var.H0;
                    arrayList822.clear();
                    arrayList822.addAll(v50Var.a1.shadyLeftParticipants);
                    p50 p50Var322 = p50Var;
                    v50Var.I0 = p50Var322.F;
                    i12 = i10;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    b50Var3 = b50Var2;
                    boolean c1022 = m30Var.c();
                    m30Var2 = m30Var;
                    if (m30Var2.b) {
                    }
                    z12 = false;
                    org.telegram.ui.Components.c30 c30Var222 = v50Var.p2;
                    i30Var = v50Var.m2;
                    c30Var222.G(i30Var, z11);
                    if (i30Var.getVisibility() == 0) {
                    }
                    if (G3) {
                    }
                    if (b50Var3.getVisibility() == 0) {
                    }
                    r02 = v50Var.Z1;
                    r02.clear();
                    r02.addAll(v50Var.Y1);
                    while (r82 < r02.size()) {
                    }
                    call = v50Var.a1;
                    if (call != null) {
                    }
                    ChatObject.Call call2222 = v50Var.a1;
                    if (call2222 != null) {
                    }
                    v50Var.C3.a(z13, z10);
                    if (z13 == v50Var.I2) {
                    }
                }
            } catch (Exception e21) {
                e = e21;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = i14;
                p50Var = p50Var2;
                FileLog.e(e);
                p50Var.l();
                v50Var.a1.saveActiveDates();
                if (view != null) {
                }
                ArrayList arrayList4222 = v50Var.D0;
                arrayList4222.clear();
                arrayList4222.addAll(v50Var.a1.visibleParticipants);
                ArrayList arrayList5222 = v50Var.E0;
                arrayList5222.clear();
                arrayList2 = arrayList;
                arrayList5222.addAll(arrayList2);
                ArrayList arrayList6222 = v50Var.F0;
                arrayList6222.clear();
                arrayList6222.addAll(v50Var.a1.invitedUsers);
                ArrayList arrayList7222 = v50Var.G0;
                arrayList7222.clear();
                arrayList7222.addAll(v50Var.a1.shadyJoinParticipants);
                ArrayList arrayList8222 = v50Var.H0;
                arrayList8222.clear();
                arrayList8222.addAll(v50Var.a1.shadyLeftParticipants);
                p50 p50Var3222 = p50Var;
                v50Var.I0 = p50Var3222.F;
                i12 = i10;
                i13 = 0;
                while (i13 < i12) {
                }
                b50Var3 = b50Var2;
                boolean c10222 = m30Var.c();
                m30Var2 = m30Var;
                if (m30Var2.b) {
                }
                z12 = false;
                org.telegram.ui.Components.c30 c30Var2222 = v50Var.p2;
                i30Var = v50Var.m2;
                c30Var2222.G(i30Var, z11);
                if (i30Var.getVisibility() == 0) {
                }
                if (G3) {
                }
                if (b50Var3.getVisibility() == 0) {
                }
                r02 = v50Var.Z1;
                r02.clear();
                r02.addAll(v50Var.Y1);
                while (r82 < r02.size()) {
                }
                call = v50Var.a1;
                if (call != null) {
                }
                ChatObject.Call call22222 = v50Var.a1;
                if (call22222 != null) {
                }
                v50Var.C3.a(z13, z10);
                if (z13 == v50Var.I2) {
                }
            }
        } catch (Exception e22) {
            e = e22;
            b50Var2 = b50Var;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = i14;
            p50Var = p50Var2;
            FileLog.e(e);
            p50Var.l();
            v50Var.a1.saveActiveDates();
            if (view != null) {
            }
            ArrayList arrayList42222 = v50Var.D0;
            arrayList42222.clear();
            arrayList42222.addAll(v50Var.a1.visibleParticipants);
            ArrayList arrayList52222 = v50Var.E0;
            arrayList52222.clear();
            arrayList2 = arrayList;
            arrayList52222.addAll(arrayList2);
            ArrayList arrayList62222 = v50Var.F0;
            arrayList62222.clear();
            arrayList62222.addAll(v50Var.a1.invitedUsers);
            ArrayList arrayList72222 = v50Var.G0;
            arrayList72222.clear();
            arrayList72222.addAll(v50Var.a1.shadyJoinParticipants);
            ArrayList arrayList82222 = v50Var.H0;
            arrayList82222.clear();
            arrayList82222.addAll(v50Var.a1.shadyLeftParticipants);
            p50 p50Var32222 = p50Var;
            v50Var.I0 = p50Var32222.F;
            i12 = i10;
            i13 = 0;
            while (i13 < i12) {
            }
            b50Var3 = b50Var2;
            boolean c102222 = m30Var.c();
            m30Var2 = m30Var;
            if (m30Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.c30 c30Var22222 = v50Var.p2;
            i30Var = v50Var.m2;
            c30Var22222.G(i30Var, z11);
            if (i30Var.getVisibility() == 0) {
            }
            if (G3) {
            }
            if (b50Var3.getVisibility() == 0) {
            }
            r02 = v50Var.Z1;
            r02.clear();
            r02.addAll(v50Var.Y1);
            while (r82 < r02.size()) {
            }
            call = v50Var.a1;
            if (call != null) {
            }
            ChatObject.Call call222222 = v50Var.a1;
            if (call222222 != null) {
            }
            v50Var.C3.a(z13, z10);
            if (z13 == v50Var.I2) {
            }
        }
        v50Var.a1.saveActiveDates();
        if (view != null) {
            v50Var.Y.h1(i11, view.getTop() - b50Var2.getPaddingTop());
        }
        ArrayList arrayList422222 = v50Var.D0;
        arrayList422222.clear();
        arrayList422222.addAll(v50Var.a1.visibleParticipants);
        ArrayList arrayList522222 = v50Var.E0;
        arrayList522222.clear();
        arrayList2 = arrayList;
        arrayList522222.addAll(arrayList2);
        ArrayList arrayList622222 = v50Var.F0;
        arrayList622222.clear();
        arrayList622222.addAll(v50Var.a1.invitedUsers);
        ArrayList arrayList722222 = v50Var.G0;
        arrayList722222.clear();
        arrayList722222.addAll(v50Var.a1.shadyJoinParticipants);
        ArrayList arrayList822222 = v50Var.H0;
        arrayList822222.clear();
        arrayList822222.addAll(v50Var.a1.shadyLeftParticipants);
        p50 p50Var322222 = p50Var;
        v50Var.I0 = p50Var322222.F;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            b50 b50Var4 = b50Var2;
            View childAt2 = b50Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.i4) || (childAt2 instanceof org.telegram.ui.Cells.a4)) && (G = b50Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.i4) {
                    ((org.telegram.ui.Cells.i4) childAt2).setDrawDivider(G.b() != p50Var322222.F + (-2) ? z11 : false);
                } else {
                    ((org.telegram.ui.Cells.a4) childAt2).setDrawDivider(G.b() != p50Var322222.F + (-2) ? z11 : false);
                }
            }
            i13++;
            b50Var2 = b50Var4;
        }
        b50Var3 = b50Var2;
        boolean c1022222 = m30Var.c();
        m30Var2 = m30Var;
        if (m30Var2.b && (videoParticipant2 = m30Var2.e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, v50Var.a1)) {
            if (!arrayList2.isEmpty()) {
                z12 = false;
                v50Var.e1(null);
            } else if (c1022222) {
                z12 = false;
                v50Var.e1((ChatObject.VideoParticipant) arrayList2.get(0));
            }
            org.telegram.ui.Components.c30 c30Var222222 = v50Var.p2;
            i30Var = v50Var.m2;
            c30Var222222.G(i30Var, z11);
            if (i30Var.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(i30Var);
            }
            if (G3) {
                v50Var.o2.I(v50Var.n2, z11);
            }
            if (b50Var3.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(b50Var3);
            }
            r02 = v50Var.Z1;
            r02.clear();
            r02.addAll(v50Var.Y1);
            for (r82 = z12; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.t) r02.get(r82)).j(z11);
            }
            call = v50Var.a1;
            if (call != null && m30Var2.b && (videoParticipant = m30Var2.e) != null) {
                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
            ChatObject.Call call2222222 = v50Var.a1;
            z13 = (call2222222 != null || call2222222.visibleVideoParticipants.isEmpty()) ? z12 : z11;
            v50Var.C3.a(z13, z10);
            if (z13 == v50Var.I2) {
                v50Var.I2 = z13;
                if (G3) {
                    v50Var.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z12 = false;
        org.telegram.ui.Components.c30 c30Var2222222 = v50Var.p2;
        i30Var = v50Var.m2;
        c30Var2222222.G(i30Var, z11);
        if (i30Var.getVisibility() == 0) {
        }
        if (G3) {
        }
        if (b50Var3.getVisibility() == 0) {
        }
        r02 = v50Var.Z1;
        r02.clear();
        r02.addAll(v50Var.Y1);
        while (r82 < r02.size()) {
        }
        call = v50Var.a1;
        if (call != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        ChatObject.Call call22222222 = v50Var.a1;
        if (call22222222 != null) {
        }
        v50Var.C3.a(z13, z10);
        if (z13 == v50Var.I2) {
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
        org.telegram.ui.Components.voip.w2 w2Var;
        org.telegram.ui.Components.voip.w2 w2Var2;
        org.telegram.ui.Components.voip.w2 w2Var3;
        boolean z19;
        boolean r12;
        int i13;
        ChatObject.Call call = this.a1;
        org.telegram.ui.Components.voip.w2 w2Var4 = this.s;
        int i14 = 6;
        if (call == null || call.isScheduled()) {
            if (Q0()) {
                i14 = 5;
            } else if (this.a1.call.schedule_start_subscribed) {
                i14 = 7;
            }
            K1(i14, z10);
            w2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
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
                m30 m30Var = this.a2;
                int i16 = i15 + ((m30Var == null && m30Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.o0 | 2) == (i16 | 2);
                this.o0 = i16;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.w2 w2Var5 = this.n;
                if (z14) {
                    w2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z20, z10);
                    w2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.w2 w2Var6 = this.f;
                if (i12 != 0) {
                    w2Var6.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                    w2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.w2 w2Var7 = this.h;
                if (z17) {
                    w2Var = w2Var6;
                    w2Var2 = w2Var5;
                    w2Var3 = w2Var7;
                    z19 = z10;
                } else {
                    h1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i17 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.a0 != i17) {
                        this.a0 = i17;
                        AndroidUtilities.updateImageViewImageAnimated(this.b0, i17);
                    }
                    w2Var2 = w2Var5;
                    w2Var = w2Var6;
                    w2Var7.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    w2Var3 = w2Var7;
                    z19 = z10;
                    w2Var3.b(h1() != 1, z19);
                }
                org.telegram.ui.Components.voip.w2 w2Var8 = w2Var3;
                w2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z18 && z15) {
                    N1(false);
                }
                w2Var2.d(true, z19);
                w2Var.d(true, z19);
                w2Var8.d(true, z19);
                r12 = r1();
                g30 g30Var = this.f1;
                if (r12) {
                    g30Var.setVisibility(8);
                } else {
                    g30Var.setVisibility(0);
                    boolean z21 = ((Integer) g30Var.getTag()).intValue() == 3;
                    int i18 = this.T1;
                    final boolean z22 = i18 == 3;
                    g30Var.setTag(Integer.valueOf(i18));
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
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.m20
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int offsetColor = AndroidUtilities.getOffsetColor(color, i19, floatValue, 1.0f);
                                    v50 v50Var = v50.this;
                                    v50Var.g1.setColor(offsetColor);
                                    v50Var.f1.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    v50Var.i1 = floatValue;
                                    k50 k50Var = v50Var.U0;
                                    if (k50Var == null || !v50Var.z2) {
                                        return;
                                    }
                                    k50Var.invalidate();
                                }
                            });
                            this.h1.setDuration(300L);
                            this.h1.setInterpolator(org.telegram.ui.Components.ds.f);
                            this.h1.addListener(new o40(this, 2));
                            this.h1.start();
                        } else {
                            paint.setColor(this.T1 == 3 ? -1163700 : -12761513);
                            g30Var.invalidate();
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
        m30 m30Var2 = this.a2;
        int i162 = i152 + ((m30Var2 == null && m30Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.o0 | 2) == (i162 | 2)) {
        }
        this.o0 = i162;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.w2 w2Var52 = this.n;
        if (z14) {
        }
        org.telegram.ui.Components.voip.w2 w2Var62 = this.f;
        if (i12 != 0) {
        }
        org.telegram.ui.Components.voip.w2 w2Var72 = this.h;
        if (z17) {
        }
        org.telegram.ui.Components.voip.w2 w2Var82 = w2Var3;
        w2Var4.c(!r1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            N1(false);
        }
        w2Var2.d(true, z19);
        w2Var.d(true, z19);
        w2Var82.d(true, z19);
        r12 = r1();
        g30 g30Var2 = this.f1;
        if (r12) {
        }
        if (r1()) {
        }
    }

    public final int P0() {
        b50 b50Var = this.Q;
        int childCount = b50Var.getChildCount();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = b50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1() {
        boolean z10;
        t50 t50Var;
        r40 r40Var = this.O;
        if (r40Var == null || this.a1 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.a1.currentSpeakingPeers.m(); i11++) {
            long j10 = this.a1.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.a1.currentSpeakingPeers.f(j10);
            if (!groupCallParticipant.self) {
                m30 m30Var = this.a2;
                m30Var.getClass();
                if (m30Var.w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
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
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0);
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
            r40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b6 subtitleTextView = r40Var.getSubtitleTextView();
        String str = r1() ? "ViewersWatching" : "Participants";
        int i12 = this.a1.call.participants_count;
        p50 p50Var = this.P;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((p50Var.M.r1() || p50Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (r1() && (t50Var = this.B1) != null) {
            t50Var.setWatchersCount(this.a1.call.participants_count);
        }
        if (z10 != this.u2) {
            this.u2 = z10;
            r40Var.invalidate();
            r40Var.getSubtitleTextView().setPivotX(0.0f);
            r40Var.getSubtitleTextView().setPivotY(r40Var.getMeasuredHeight() >> 1);
            r40Var.getSubtitleTextView().animate().scaleX(this.u2 ? 0.98f : 1.0f).scaleY(this.u2 ? 0.9f : 1.0f).alpha(this.u2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(r40Var.getAdditionalSubtitleTextView(), this.u2);
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
        e30 e30Var = this.e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                e30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                e30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        r40 r40Var = this.O;
        if (isEmpty) {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(r40Var.getTitle())) {
                if (z10) {
                    this.O.G(this.Z0.title, true, 180L, null);
                    r40Var.getTitleTextView().setOnClickListener(new f20(this, 9));
                } else {
                    r40Var.setTitle(this.Z0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.Z0)) {
                    e30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (r1()) {
                    e30Var.b(this.Z0.title, z10);
                } else {
                    e30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                r40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                e30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.a1.call.title.equals(r40Var.getTitle())) {
            if (z10) {
                this.O.G(this.a1.call.title, true, 180L, null);
                r40Var.getTitleTextView().setOnClickListener(new f20(this, 8));
            } else {
                r40Var.setTitle(this.a1.call.title);
            }
            e30Var.b(this.a1.call.title, z10);
        }
        org.telegram.ui.ActionBar.b6 titleTextView = r40Var.getTitleTextView();
        if (!this.a1.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                e30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                e30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new r50(titleTextView));
            TextView textView = e30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new r50(textView), (Drawable) null);
            TextView nextTextView = e30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new r50(nextTextView), (Drawable) null);
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
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
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
            r30 r30Var = this.b2;
            if (r30Var.getVisibility() == 0 && r30Var.getAlpha() == 1.0f) {
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
        x30 x30Var = this.F;
        x30Var.setAlpha(f7);
        w30 w30Var = this.G;
        w30Var.setAlpha(f7);
        if (x30Var.getVisibility() != i10) {
            x30Var.setVisibility(i10);
            w30Var.setVisibility(i10);
            if (i10 == 8) {
                u30 u30Var = this.H;
                if (u30Var.isFocused()) {
                    u30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        org.telegram.ui.Components.fl0 fl0Var = this.K;
        if (fl0Var != null) {
            float f7 = this.C1.b.a * this.A3.e;
            fl0Var.setAlpha(f7);
            int i10 = f7 > 0.0f ? 0 : 8;
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.fl0 fl0Var2 = this.K;
            if (fl0Var2.N0 || f7 != 1.0f) {
                return;
            }
            fl0Var2.N0 = true;
        }
    }

    public final void W0() {
        boolean z10 = G3;
        z20 z20Var = this.e;
        if (z10) {
            z20Var.setTranslationX(0.0f);
            z20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        oe.b bVar = this.z3;
        if (z11) {
            z20Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            z20Var.setTranslationY(0.0f);
        } else {
            z20Var.setTranslationX(0.0f);
            z20Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void X0() {
        boolean z10 = G3;
        i30 i30Var = this.m2;
        if (z10) {
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        oe.b bVar = this.z3;
        if (z11) {
            i30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            i30Var.setTranslationY(0.0f);
        } else {
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        float f7 = this.B3.f;
        rh.i iVar = this.C1;
        float lerp = AndroidUtilities.lerp(G3 ? (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f) : F3 ? 0.0f : ((this.z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.c)) - AndroidUtilities.dp(91.0f), -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f)), iVar.b.a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        nh.h hVar = this.c0;
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
        org.telegram.ui.Cells.i4 i4Var = this.X2;
        if (i4Var != null && !this.b3 && i4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.i4 i4Var2 = this.X2;
        if (i4Var2 != null) {
            i4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.b30 b30Var = this.a3;
        if (b30Var != null) {
            b30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.a3 = null;
        this.Z2 = null;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
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
        b50 b50Var = this.Q;
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
                AndroidUtilities.runOnUIThread(new h20(this, 2), 3000L);
            }
            if (!this.u0 && VoIPService.getSharedInstance() != null) {
                this.a1.addSelfDummyParticipant(false);
                l1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            J1();
            int childCount = b50Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = b50Var.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.i4) {
                    ((org.telegram.ui.Cells.i4) childAt).a(true, false);
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
            m30 m30Var = this.a2;
            if (m30Var.b && this.a1 != null) {
                boolean c10 = m30Var.c();
                ChatObject.Call call3 = this.a1;
                if (call3 != null && m30Var.b && (videoParticipant = m30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
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
                            if (!groupCallParticipant3.muted_by_you && m30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            m30Var.setVisibleParticipant(true);
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
                AlertDialog$Builder M = org.telegram.ui.Components.g5.M(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                M.j(new l20(this, 1));
                try {
                    M.p();
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
            AndroidUtilities.updateVisibleRows(b50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt2 = this.E2.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).j(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
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
            int childCount2 = b50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                s4.e1 G = b50Var.G(b50Var.getChildAt(i15));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                        if (i4Var.getParticipant() != null) {
                            i4Var.getParticipant().lastVisibleDate = longValue2;
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
            AndroidUtilities.updateVisibleRows(b50Var);
            if (this.E2 != null) {
                while (i15 < this.E2.getChildCount()) {
                    View childAt3 = this.E2.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.g1) childAt3).j(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(b50Var);
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
            AndroidUtilities.updateVisibleRows(b50Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            g40 g40Var = this.z0;
            if (g40Var != null) {
                g40Var.b(true, true);
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

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        LaunchActivity launchActivity = this.i0;
        launchActivity.b1.remove(this.v2);
        this.i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.c40 c40Var = this.E1;
        if (c40Var != null) {
            c40Var.dismiss();
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        m30 m30Var = this.a2;
        if (m30Var != null) {
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
                m30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (m30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(m30Var);
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
        org.telegram.ui.Components.k30.j(getContext());
        ChatObject.Call call = this.a1;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.view.Window.Callback
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
            m30 m30Var = this.a2;
            if (m30Var.r != null) {
                return;
            }
            boolean z10 = G3;
            b50 b50Var = this.Q;
            int i10 = 0;
            if (!z10) {
                if (this.q2 != null) {
                    b50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                    this.q2 = null;
                }
                if (videoParticipant == null) {
                    if (b50Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = b50Var.getViewTreeObserver();
                        n40 n40Var = new n40(this);
                        this.q2 = n40Var;
                        viewTreeObserver.addOnPreDrawListener(n40Var);
                        return;
                    }
                    b50Var.setVisibility(0);
                    O0(false);
                    this.s0 = true;
                    ViewTreeObserver viewTreeObserver2 = b50Var.getViewTreeObserver();
                    m40 m40Var = new m40(this);
                    this.q2 = m40Var;
                    viewTreeObserver2.addOnPreDrawListener(m40Var);
                    return;
                }
                i30 i30Var = this.m2;
                if (i30Var.getVisibility() == 0) {
                    m30Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(i30Var);
                    return;
                }
                i30Var.setVisibility(0);
                org.telegram.ui.Components.c30 c30Var = this.p2;
                c30Var.G(i30Var, false);
                this.s0 = true;
                if (!m30Var.b) {
                    ArrayList arrayList = c30Var.e;
                    s4.c0 c0Var = (s4.c0) i30Var.getLayoutManager();
                    if (c0Var != null) {
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                c0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = b50Var.getViewTreeObserver();
                l40 l40Var = new l40(this, videoParticipant);
                this.q2 = l40Var;
                viewTreeObserver3.addOnPreDrawListener(l40Var);
                return;
            }
            if (this.q2 != null) {
                b50Var.getViewTreeObserver().removeOnPreDrawListener(this.q2);
                this.q2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            b60 b60Var = this.o2;
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
                        org.telegram.ui.Components.b30 b30Var = tVar.d;
                        if (b30Var != null) {
                            b30Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(tVar.w);
                        tVar.b(false);
                        tVar.animate().alpha(0.0f).setListener(new h40(this, tVar));
                    }
                }
                this.P2 = false;
                b60Var.H(this.n2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList4.get(i12);
                    if (tVar2.e != null && ((videoParticipant2 = tVar2.w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(tVar2.w);
                        tVar2.b(false);
                        org.telegram.ui.Components.b30 b30Var2 = tVar2.d;
                        if (b30Var2 != null) {
                            b30Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = tVar2.c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        tVar2.animate().alpha(0.0f).setListener(new i40(this, tVar2));
                    }
                }
                this.P2 = true;
                b60Var.r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new sz(7, this, arrayList2));
                }
            }
            boolean z11 = !m30Var.b;
            ViewTreeObserver viewTreeObserver4 = b50Var.getViewTreeObserver();
            k40 k40Var = new k40(this, videoParticipant, z11);
            this.q2 = k40Var;
            viewTreeObserver4.addOnPreDrawListener(k40Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
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
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.k0(this, i10, z10, 1));
                i10++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
        String publicUsername = ChatObject.getPublicUsername(this.Z0);
        String q5 = !TextUtils.isEmpty(publicUsername) ? a1.g.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder()) : (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        if (!TextUtils.isEmpty(q5)) {
            u1(null, q5, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new bi.r9(this, chatFull, z10, 6));
    }

    public final UndoView k1() {
        if (!G3) {
            m30 m30Var = this.a2;
            if (m30Var.b) {
                return m30Var.getUndoView();
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
        nh.h hVar = this.c0;
        if (hVar != null) {
            hVar.D0(this.d.getCurrentAccount(), this.a1.getInputGroupCall(false));
        }
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.a1.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        a50 a50Var = this.V;
        if (a50Var == null || a50Var.getVisibility() != 0) {
            return;
        }
        this.s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        N1(true);
        this.w1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        b50 b50Var = this.Q;
        b50Var.setVisibility(0);
        org.telegram.ui.ActionBar.w0 w0Var = this.l1;
        w0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b50Var, (Property<b50, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b50Var, (Property<b50, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a50Var, (Property<a50, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a50Var, (Property<a50, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(a50Var, (Property<a50, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.b6 b6Var = this.U;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.b6 b6Var2 = this.W;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(b6Var2, (Property<org.telegram.ui.ActionBar.b6, Float>) property2, 0.0f), ObjectAnimator.ofFloat(b6Var2, (Property<org.telegram.ui.ActionBar.b6, Float>) property3, 0.0f), ObjectAnimator.ofFloat(b6Var2, (Property<org.telegram.ui.ActionBar.b6, Float>) property, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.ds.g);
        animatorSet.addListener(new o40(this, i10));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                int i10 = 1;
                final org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.r20
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        v50 v50Var = v50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.e2[] e2VarArr2 = e2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new bi.n(v50Var, e2VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        v50Var.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new bi.y2(v50Var, j11, e2VarArr2, user, 20));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new yx(this, e2VarArr, sendRequest, i10), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        int dp = AndroidUtilities.dp(74.0f);
        float f7 = this.y0 - dp;
        return (((((float) this.backgroundPaddingTop) + f7) > ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f7) == ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - f7) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
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
        b50 b50Var = this.Q;
        if (b50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(b50Var);
        }
        i30 i30Var = this.m2;
        if (i30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(i30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        g40 g40Var = this.z0;
        if (g40Var != null) {
            g40Var.b(false, false);
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
        g40 g40Var = this.z0;
        if (g40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        g40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.i0;
        launchActivity.b1.add(this.v2);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.k30.j(getContext());
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.e0;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Og, false));
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.k1;
            if (w0Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.hg;
                w0Var.O(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
                w0Var.O(org.telegram.ui.ActionBar.y6.x0(null, i10, false), true);
                w0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.eg, false));
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hg, false);
            F1(this.x1, x02);
            F1(this.y1, x02);
            F1(this.p1, x02);
            F1(this.q1, x02);
            F1(this.w1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.vg, false));
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

    public final void s1(org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.e2 e2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.w0) {
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
        if (r2Var instanceof un) {
            boolean Z9 = ((un) r2Var).Z9();
            this.w0 = true;
            this.x0 = true;
            AndroidUtilities.runOnUIThread(new bi.s9(k3Var, editTextBoldCursor, z10, e2Var, 21), Z9 ? 200L : 0L);
            return;
        }
        this.w0 = true;
        this.x0 = true;
        if (k3Var != null) {
            k3Var.setFocusable(true);
        } else if (e2Var != null) {
            e2Var.l(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new hh(editTextBoldCursor, 2), 100L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.i1.d0.V) {
            org.telegram.ui.Components.voip.i1.j();
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
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if (r2Var instanceof un) {
                z12 = ((un) r2Var).Z9();
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
                p40 p40Var = new p40(this, getContext(), str5, str3, str4, str3);
                this.r0 = p40Var;
                p40Var.t0 = new f(this, 20);
                p40Var.setOnDismissListener(new l20(this, 3));
                AndroidUtilities.runOnUIThread(new h20(this, 7), !z12 ? 200L : 0L);
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
        p40 p40Var2 = new p40(this, getContext(), str5, str3, str4, str3);
        this.r0 = p40Var2;
        p40Var2.t0 = new f(this, 20);
        p40Var2.setOnDismissListener(new l20(this, 3));
        AndroidUtilities.runOnUIThread(new h20(this, 7), !z12 ? 200L : 0L);
    }

    public final void v1() {
        ChatObject.Call call = this.a1;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
        e2Var.r(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.a1.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ea(this, e2Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r9v19, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        String str;
        TextView textView;
        int i11;
        String str2;
        String str3;
        EditText editText;
        boolean z10;
        float f7;
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
            ?? alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i12 = org.telegram.ui.ActionBar.y6.pg;
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.I = i12;
            TextView textView2 = new TextView(getContext());
            int i13 = org.telegram.ui.ActionBar.y6.hg;
            org.telegram.ui.ActionBar.f7.V(textView2, i13, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            ?? frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            j9Var.j(this.currentAccount, user);
            boolean z11 = user instanceof TLRPC.User;
            if (z11) {
                TLRPC.User user2 = (TLRPC.User) user;
                y9Var.f(user2, j9Var);
                str = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                y9Var.f(chat, j9Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            org.telegram.messenger.t.r(textView3, i13, null, 1, 20.0f);
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.Z0;
            String str4 = chat2 != null ? chat2.title : "";
            if (i10 != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                org.telegram.messenger.vh.o(R.string.VoipGroupAddMemberText, new Object[]{str, str4}, textView2);
            } else if (o1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                org.telegram.messenger.vh.o(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    org.telegram.messenger.vh.o(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                } else {
                    org.telegram.messenger.vh.o(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str4}, textView2);
                }
            }
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 76, 11.0f, z12 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i10 == 2) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupUserRemove), new org.telegram.ui.Components.voip.k1(13, this, user));
            } else if (z11) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupAdd), new bi.i(this, (TLRPC.User) user, j10, 6));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            e2Var.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ug, false));
            e2Var.show();
            if (i10 != 2 || (textView = (TextView) e2Var.d(-1)) == null) {
                return;
            }
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.vg, null);
            return;
        }
        int i14 = 6;
        if (i10 == 6) {
            this.i0.P0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.i0.u0(new un(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.i0.P0(this.currentAccount);
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.i0.O().getFragmentStack().get(this.i0.O().getFragmentStack().size() - 1);
            if ((r2Var instanceof un) && ((un) r2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.i0.u0(new un(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            K1(2, true);
            return;
        }
        int i15 = 9;
        if (i10 == 9) {
            org.telegram.ui.Components.g50 g50Var = this.h2;
            if (g50Var == null || !g50Var.g()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.g50 g50Var2 = new org.telegram.ui.Components.g50(0, true, true);
                this.h2 = g50Var2;
                g50Var2.H = true;
                g50Var2.R = true;
                g50Var2.G = true;
                g50Var2.J = true;
                g50Var2.S = true;
                g50Var2.a = this.i0.O().getLastFragment();
                org.telegram.ui.Components.g50 g50Var3 = this.h2;
                c50 c50Var = new c50(this, j10);
                this.i2 = c50Var;
                g50Var3.b = c50Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                g50Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new h20(this, i15), new fi.e1(i14), 0);
                return;
            }
            return;
        }
        if (i10 == 10) {
            String str5 = groupCallParticipant.about;
            Context context = getContext();
            int i16 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.g5.a;
            ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
            String string = LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
            final org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
            e2Var2.R = string;
            e2Var2.T = LocaleController.getString(j10 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setClipChildren(false);
            if (j10 < 0) {
                f7 = 8.0f;
                long j11 = -j10;
                if (MessagesController.getInstance(i16).getChatFull(j11) == null) {
                    z10 = 0;
                    MessagesController.getInstance(i16).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                } else {
                    z10 = 0;
                }
            } else {
                z10 = 0;
                f7 = 8.0f;
            }
            NumberTextView numberTextView = new NumberTextView(context);
            EditText editText2 = new EditText(context);
            int i17 = org.telegram.ui.ActionBar.y6.hg;
            org.telegram.ui.ActionBar.f7.V(editText2, i17, null);
            editText2.setHint(LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
            editText2.setTextSize(1, 16.0f);
            editText2.setBackground(org.telegram.ui.ActionBar.y6.T(context));
            editText2.setMaxLines(4);
            editText2.setRawInputType(147457);
            editText2.setImeOptions(6);
            int i18 = j10 > 0 ? 70 : 255;
            org.telegram.ui.Components.q3 q3Var = new org.telegram.ui.Components.q3(i18, context, numberTextView);
            InputFilter[] inputFilterArr = new InputFilter[1];
            inputFilterArr[z10] = q3Var;
            editText2.setFilters(inputFilterArr);
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B6, z10));
            numberTextView.setImportantForAccessibility(2);
            frameLayout2.addView(numberTextView, org.telegram.ui.Components.gb1.h(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
            editText2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(f7), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(f7));
            editText2.addTextChangedListener(new org.telegram.ui.Components.vq(i18, numberTextView));
            AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
            editText2.setText(str5);
            editText2.setSelection(editText2.getText().toString().length());
            alertDialog$Builder2.o(frameLayout2);
            final j2.c cVar = new j2.c(j10, i16, editText2, 4);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Save), cVar);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            e2Var2.N = new org.telegram.ui.Components.q1(editText2, 1);
            frameLayout2.addView(editText2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText2.requestFocus();
            AndroidUtilities.showKeyboard(editText2);
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.v1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i19, KeyEvent keyEvent) {
                    if (i19 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                        if (e2Var3.isShowing()) {
                            cVar.h(e2Var3, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            e2Var2.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ug, false));
            e2Var2.show();
            e2Var2.p(org.telegram.ui.ActionBar.y6.x0(null, i17, false));
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
        Pattern pattern2 = org.telegram.ui.Components.g5.a;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j10));
            str2 = user3.first_name;
            str3 = user3.last_name;
        } else {
            str2 = MessagesController.getInstance(i19).getChat(Long.valueOf(-j10)).title;
            str3 = null;
        }
        ?? alertDialog$Builder3 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
        e2Var3.R = string2;
        LinearLayout d = org.telegram.messenger.vh.d(context2, 1);
        EditText editText3 = new EditText(context2);
        int i20 = org.telegram.ui.ActionBar.y6.hg;
        org.telegram.ui.ActionBar.f7.V(editText3, i20, null);
        editText3.setTextSize(1, 16.0f);
        editText3.setMaxLines(1);
        editText3.setLines(1);
        editText3.setSingleLine(true);
        editText3.setGravity(LocaleController.isRTL ? 5 : 3);
        editText3.setInputType(49152);
        editText3.setImeOptions(j10 > 0 ? 5 : 6);
        editText3.setHint(LocaleController.getString(j10 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
        editText3.setBackground(org.telegram.ui.ActionBar.y6.T(context2));
        editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        editText3.requestFocus();
        if (j10 > 0) {
            editText = new EditText(context2);
            org.telegram.ui.ActionBar.f7.V(editText, i20, null);
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(LocaleController.isRTL ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(LocaleController.getString(R.string.LastName));
            editText.setBackground(org.telegram.ui.ActionBar.y6.T(context2));
            editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        } else {
            editText = null;
        }
        AndroidUtilities.showKeyboard(editText3);
        d.addView(editText3, org.telegram.ui.Components.gb1.x(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            d.addView(editText, org.telegram.ui.Components.gb1.x(-1, -2, 0, 23, 12, 23, 21));
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.getText().toString().length());
        if (editText != null) {
            editText.setText(str3);
            editText.setSelection(editText.getText().toString().length());
        }
        alertDialog$Builder3.o(d);
        org.telegram.ui.Components.s1 s1Var = new org.telegram.ui.Components.s1(editText3, j10, i19, editText);
        alertDialog$Builder3.k(LocaleController.getString(R.string.Save), s1Var);
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        e2Var3.N = new bi.u3(8, editText3, editText);
        e2Var3.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ug, false));
        e2Var3.show();
        e2Var3.p(org.telegram.ui.ActionBar.y6.x0(null, i20, false));
        yd ydVar = new yd(1, e2Var3, s1Var);
        if (editText != null) {
            editText.setOnEditorActionListener(ydVar);
        } else {
            editText3.setOnEditorActionListener(ydVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(boolean z10, org.telegram.ui.Cells.i4 i4Var) {
        int i10;
        float f7;
        final float f10;
        float f11;
        org.telegram.ui.Components.voip.t tVar;
        org.telegram.ui.Components.voip.t tVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.b3;
        o30 o30Var = this.b;
        b50 b50Var = this.Q;
        if (z11) {
            f10 = (b50Var.getX() + (i4Var.getX() + i4Var.getAvatarImageView().getX())) - paddingLeft;
            f7 = (b50Var.getY() + (i4Var.getY() + i4Var.getAvatarImageView().getY())) - paddingTop;
            f11 = i4Var.getAvatarImageView().getMeasuredHeight() / b50Var.getMeasuredWidth();
            i10 = (int) ((i4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
        } else {
            if (this.Z2 == null) {
                this.O2 = true;
            } else {
                this.O2 = z10 || o30Var.D0.k(o30Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.Y2;
            m30 m30Var = this.a2;
            if (lVar == null || !this.O2) {
                org.telegram.ui.Components.b30 b30Var = this.a3;
                if (b30Var != null) {
                    org.telegram.ui.Components.voip.t tVar3 = this.Z2;
                    i30 i30Var = this.m2;
                    if (tVar3 == null) {
                        float x9 = (m30Var.getX() + (i30Var.getX() + (this.a3.getX() + b30Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y3 = (m30Var.getY() + (i30Var.getY() + (this.a3.getY() + this.a3.getAvatarImageView().getY()))) - paddingTop;
                        f11 = this.a3.getAvatarImageView().getMeasuredHeight() / b50Var.getMeasuredWidth();
                        i10 = (int) ((this.a3.getAvatarImageView().getMeasuredHeight() >> 1) / f11);
                        f7 = y3;
                        f10 = x9;
                        if (!this.O2 && (tVar = this.Z2) != null) {
                            tVar.invalidate();
                            m30Var.invalidate();
                            org.telegram.ui.Components.voip.t tVar4 = this.Z2;
                            tVar4.h = false;
                            tVar4.j(false);
                            this.Z2 = null;
                        }
                    } else if (this.O2) {
                        f10 = (m30Var.getX() + (i30Var.getX() + b30Var.getX())) - paddingLeft;
                        f7 = (m30Var.getY() + (i30Var.getY() + this.a3.getY())) - paddingTop;
                        i10 = 0;
                    }
                }
                i10 = 0;
                f7 = 0.0f;
                f10 = 0.0f;
                f11 = 0.96f;
                if (!this.O2) {
                    tVar.invalidate();
                    m30Var.invalidate();
                    org.telegram.ui.Components.voip.t tVar42 = this.Z2;
                    tVar42.h = false;
                    tVar42.j(false);
                    this.Z2 = null;
                }
            } else {
                float x10 = (b50Var.getX() + lVar.getX()) - paddingLeft;
                f7 = ((b50Var.getY() + this.Y2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                i10 = 0;
                f10 = x10;
            }
            f11 = 1.0f;
            if (!this.O2) {
            }
        }
        final float f12 = f7;
        final float f13 = f11;
        n30 n30Var = this.D2;
        if (z10) {
            p30 p30Var = this.C2;
            p30Var.setScaleX(f13);
            p30Var.setScaleY(f13);
            p30Var.setTranslationX(f10);
            p30Var.setTranslationY(f12);
            n30Var.setAlpha(0.0f);
        }
        o30Var.N(i10, i10);
        if (this.g2) {
            r30 r30Var = this.b2;
            if (z10) {
                r30Var.setAlpha(0.0f);
            }
            org.telegram.messenger.vh.p(r30Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.vh.p(n30Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        if (!z10 && (tVar2 = this.Z2) != null) {
            tVar2.h = false;
            tVar2.j(true);
            if (o30Var.D0.k(o30Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.o oVar = this.Z2.a;
                oVar.E = false;
                oVar.F = 0L;
                this.Y2 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i11 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.o20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v50.p(v50.this, f13, f10, f12, i11, valueAnimator);
            }
        });
        this.d3 = this.d.getNotificationCenter().setAnimationInProgress(this.d3, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.t tVar5 = this.Y2 != null ? this.Z2 : null;
        if (tVar5 != null) {
            tVar5.f = true;
        }
        ofFloat.addListener(new ai.l0(this, tVar5, z10, 10));
        if (this.b3 || this.Z2 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
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
        y5 y5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(y5Var);
        if (!this.z2 || this.U0 == null || VoIPService.getSharedInstance() == null || !r1() || this.Q == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(y5Var, 30L);
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
