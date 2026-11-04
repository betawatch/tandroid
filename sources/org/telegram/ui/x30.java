package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs, VoIPService.StateListener, qe.b {
    public static boolean A5;
    public static x30 v5;
    public static boolean w5;
    public static boolean x5;
    public static boolean y5;
    public static volatile org.telegram.messenger.q5 z5 = new org.telegram.messenger.q5("updateTextureLightningQueue", true);
    public final ImageView A1;
    public int A2;
    public final Paint A3;
    public boolean A4;
    public final ImageView B1;
    public final org.telegram.ui.Components.ch0 B2;
    public final Paint B3;
    public final View B4;
    public org.telegram.ui.Components.li0 C1;
    public final org.telegram.ui.Components.ch0 C2;
    public final w30[] C3;
    public final View C4;
    public final d30 D1;
    public boolean D2;
    public float D3;
    public GradientDrawable D4;
    public final org.telegram.ui.Components.h6 E1;
    public final org.telegram.ui.Components.q9 E2;
    public w30 E3;
    public final int[] E4;
    public final n10 F1;
    public final org.telegram.ui.Components.q9 F2;
    public w30 F3;
    public final r10 F4;
    public final u20 G1;
    public float G2;
    public long G3;
    public boolean G4;
    public final r30 H1;
    public float H2;
    public float H3;
    public boolean H4;
    public final f30 I1;
    public float I2;
    public float I3;
    public RenderNode I4;
    public final l20 J1;
    public RadialGradient J2;
    public boolean J3;
    public float J4;
    public final TextView K1;
    public final Matrix K2;
    public boolean K3;
    public boolean K4;
    public final j20 L1;
    public final Paint L2;
    public int L3;
    public final String[] L4;
    public final org.telegram.ui.ActionBar.k5 M1;
    public final m30 M2;
    public float M3;
    public ObjectAnimator M4;
    public final e30 N1;
    public float N2;
    public int N3;
    public ObjectAnimator N4;
    public final org.telegram.ui.ActionBar.k5 O1;
    public float O2;
    public boolean O3;
    public final q20 O4;
    public final l30 P1;
    public ValueAnimator P2;
    public final int[] P3;
    public org.telegram.ui.Cells.f4 P4;
    public final org.telegram.ui.Components.iy Q1;
    public TLRPC.InputPeer Q2;
    public final ArrayList Q3;
    public org.telegram.ui.Components.voip.k Q4;
    public final ImageReceiver R1;
    public TLRPC.Chat R2;
    public final ArrayList R3;
    public org.telegram.ui.Components.voip.r R4;
    public int S1;
    public org.telegram.messenger.r3 S2;
    public final u10 S3;
    public org.telegram.ui.Components.d10 S4;
    public final ImageView T1;
    public final boolean T2;
    public final z10 T3;
    public boolean T4;
    public final oh.h U1;
    public final String U2;
    public final m20 U3;
    public boolean U4;
    public final int V1;
    public final s30 V2;
    public float V3;
    public int V4;
    public final RadialProgressView W1;
    public final m10 W2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout W3;
    public AnimatorSet W4;
    public final Drawable X1;
    public final o10 X2;
    public boolean X3;
    public z20 X4;
    public final View Y1;
    public final Paint Y2;
    public boolean Y3;
    public int Y4;
    public AnimatorSet Z1;
    public ValueAnimator Z2;
    public org.telegram.ui.Components.f30 Z3;
    public int Z4;
    public LaunchActivity a2;
    public float a3;
    public g30 a4;
    public int a5;
    public final UndoView[] b2;
    public final LinearLayout b3;
    public Boolean b4;
    public int b5;
    public final org.telegram.ui.Cells.k c2;
    public final org.telegram.ui.ActionBar.q0 c3;
    public int c4;
    public int c5;
    public boolean d2;
    public final org.telegram.ui.ActionBar.q0 d3;
    public boolean d4;
    public int d5;
    public org.telegram.ui.Components.u20 e2;
    public final org.telegram.ui.ActionBar.q0 e3;
    public final q10 e4;
    public int e5;
    public org.telegram.ui.Components.u20 f2;
    public final org.telegram.ui.ActionBar.y0 f3;
    public final org.telegram.ui.Components.tj0 f4;
    public int f5;
    public int g2;
    public final org.telegram.ui.ActionBar.y0 g3;
    public final a40 g4;
    public int g5;
    public g.b h2;
    public final org.telegram.ui.ActionBar.y0 h3;
    public final org.telegram.ui.Components.e10 h4;
    public int h5;
    public final ArrayList i2;
    public final org.telegram.ui.ActionBar.y0 i3;
    public ViewTreeObserver.OnPreDrawListener i4;
    public int i5;
    public final w10 j1;
    public t20 j2;
    public final org.telegram.ui.ActionBar.y0 j3;
    public final org.telegram.ui.Components.voip.g j4;
    public int j5;
    public final b10 k1;
    public boolean k2;
    public final org.telegram.ui.ActionBar.y0 k3;
    public boolean k4;
    public int k5;
    public final org.telegram.messenger.c l1;
    public long l2;
    public final org.telegram.ui.ActionBar.y0 l3;
    public final ArrayList l4;
    public int l5;
    public final h10 m1;
    public boolean m2;
    public final org.telegram.ui.ActionBar.y0 m3;
    public boolean m4;
    public int m5;
    public final org.telegram.ui.Components.voip.c2 n1;
    public final RectF n2;
    public final org.telegram.ui.ActionBar.y0 n3;
    public final p00 n4;
    public int n5;
    public final org.telegram.ui.Components.voip.c2 o1;
    public boolean o2;
    public final org.telegram.ui.ActionBar.y0 o3;
    public final l10 o4;
    public final a30 o5;
    public final org.telegram.ui.Components.voip.c2 p1;
    public boolean p2;
    public final org.telegram.ui.ActionBar.y0 p3;
    public final org.telegram.ui.Components.go p4;
    public Boolean p5;
    public final org.telegram.ui.Components.voip.c2 q1;
    public float q2;
    public final org.telegram.ui.ActionBar.y0 q3;
    public final p00 q4;
    public Integer q5;
    public final org.telegram.ui.Components.voip.c2 r1;
    public o20 r2;
    public final LinearLayout r3;
    public boolean r4;
    public final qe.a r5;
    public final org.telegram.ui.Components.voip.c2 s1;
    public TLRPC.Peer s2;
    public final TextView s3;
    public final o4 s4;
    public final qe.a s5;
    public final org.telegram.ui.Components.voip.c2 t1;
    public TLObject t2;
    public final v30 t3;
    public final LongSparseIntArray t4;
    public final qe.c t5;
    public final i10 u1;
    public final Paint u2;
    public final sh.h u3;
    public final x10 u4;
    public final qe.a u5;
    public final ImageView v1;
    public final ArrayList v2;
    public p00 v3;
    public final v10 v4;
    public final Paint w1;
    public final ArrayList w2;
    public org.telegram.ui.Components.d20 w3;
    public LinearLayout w4;
    public final f20 x1;
    public final ArrayList x2;
    public int x3;
    public boolean x4;
    public final e20 y1;
    public final ArrayList y2;
    public boolean y3;
    public final org.telegram.ui.Components.ch0 y4;
    public final c20 z1;
    public final ArrayList z2;
    public boolean z3;
    public int z4;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v84, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v88 */
    public x30(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.r3 r3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.e6) null, true, true);
        int i3;
        final LaunchActivity launchActivity2;
        final x30 x30Var;
        final ?? r13;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.w1 = new Paint(1);
        this.b2 = new UndoView[2];
        this.i2 = new ArrayList();
        this.n2 = new RectF();
        this.u2 = new Paint(1);
        this.v2 = new ArrayList();
        this.w2 = new ArrayList();
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.z2 = new ArrayList();
        this.u3 = new sh.h(new p00(this, 8));
        int i10 = 0;
        this.x3 = 0;
        this.y3 = false;
        this.A3 = new Paint(7);
        this.B3 = new Paint(7);
        this.C3 = new w30[8];
        this.D3 = 1.0f;
        this.O3 = true;
        this.P3 = new int[4];
        this.Q3 = new ArrayList();
        this.R3 = new ArrayList();
        this.j4 = new org.telegram.ui.Components.voip.g();
        this.l4 = new ArrayList();
        this.n4 = new p00(this, i10);
        this.o4 = new l10(this);
        this.p4 = new org.telegram.ui.Components.go(17);
        this.q4 = new p00(this, 1);
        this.r4 = false;
        this.s4 = new o4(this, 7);
        this.t4 = new LongSparseIntArray();
        this.E4 = new int[2];
        this.H4 = true;
        this.L4 = new String[2];
        this.V4 = -1;
        this.o5 = new a30(this);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
        this.r5 = new qe.a(2, this, xqVar, 350L);
        this.s5 = new qe.a(3, this, xqVar, 220L, true);
        this.t5 = new qe.c(4, this, xqVar, 350L);
        this.u5 = new qe.a(5, this, xqVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.l1 = cVar;
        this.S2 = r3Var;
        this.Q2 = inputPeer;
        this.R2 = chat;
        this.U2 = str;
        this.a = cVar.a;
        this.T2 = z10;
        this.J0 = new ei.k0();
        this.Q0 = true;
        this.R0 = true;
        this.V1 = org.telegram.messenger.hp.s1(this.a).x7.x.T();
        this.V = true;
        y5 = false;
        x5 = false;
        A5 = false;
        this.z0 = new g20(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.G0 = -1;
        this.O4 = new q20(this);
        setOnDismissListener(new t00(this, i10));
        z0();
        r30 r30Var = new r30(this, launchActivity);
        this.H1 = r30Var;
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(true);
        int i11 = org.telegram.ui.ActionBar.k6.eh;
        apVar.b(org.telegram.ui.ActionBar.k6.v0(i11));
        apVar.d();
        u20 u20Var = new u20(this, launchActivity, apVar);
        this.G1 = u20Var;
        u20Var.setSubtitle("");
        u20Var.getSubtitleTextView().setVisibility(0);
        u20Var.o();
        u20Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.W3(1.0f, u20Var.getAdditionalSubtitleTextView(), this.m4, false);
        u20Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.k6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.k6.Zg;
        org.telegram.ui.ActionBar.r6.m(u20Var, 6, i12, null);
        u20Var.setBackButtonImage(R.drawable.ic_ab_back);
        u20Var.setOccupyStatusBar(false);
        u20Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.k6.Vg;
        org.telegram.ui.ActionBar.r6.m(u20Var, 1, i13, null);
        int i14 = 3;
        org.telegram.ui.ActionBar.r6.m(u20Var, 3, org.telegram.ui.ActionBar.k6.z8, null);
        org.telegram.ui.ActionBar.r6.e(u20Var, i13);
        org.telegram.ui.ActionBar.r6.m(u20Var, 6, i12, null);
        u20Var.setActionBarMenuOnItemClick(new c30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.s2 = tL_peerUser;
            i3 = i13;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i3 = i13;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.s2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.s2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.s2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new m00(this, i14);
        cVar.b().c(this, org.telegram.messenger.hs.w2);
        cVar.b().c(this, org.telegram.messenger.hs.M0);
        cVar.b().c(this, org.telegram.messenger.hs.T);
        cVar.b().c(this, org.telegram.messenger.hs.u1);
        cVar.b().c(this, org.telegram.messenger.hs.B2);
        cVar.b().c(this, org.telegram.messenger.hs.E0);
        cVar.b().c(this, org.telegram.messenger.hs.j0);
        cVar.b().c(this, org.telegram.messenger.hs.r);
        cVar.b().c(this, org.telegram.messenger.hs.z2);
        cVar.b().c(this, org.telegram.messenger.hs.y2);
        cVar.b().c(this, org.telegram.messenger.hs.R3);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.N4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.D2);
        this.X1 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.voip_filled, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.B2 = ch0Var;
        this.C2 = new org.telegram.ui.Components.ch0(R.raw.hand_2, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        d30 d30Var = new d30(this, launchActivity);
        this.D1 = d30Var;
        this.b = d30Var;
        d30Var.setClipToPadding(false);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i15 = this.u0;
        viewGroup.setPadding(i15, 0, i15, 0);
        this.b.setKeepScreenOn(true);
        this.b.setClipChildren(false);
        this.R1 = new ImageReceiver(this.b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.M1 = k5Var;
            k5Var.setGravity(17);
            k5Var.setTextColor(-1);
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.setTextSize(18);
            k5Var.k(org.telegram.messenger.bd.L0(2131743445));
            this.b.addView(k5Var, b8.mf.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            e30 e30Var = new e30(this, launchActivity);
            this.N1 = e30Var;
            e30Var.setGravity(17);
            e30Var.setTextColor(-1);
            e30Var.setTypeface(org.telegram.messenger.g0.o());
            e30Var.setTextSize(60);
            this.b.addView(e30Var, b8.mf.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.O1 = k5Var2;
            k5Var2.setGravity(17);
            k5Var2.setTextColor(-1);
            k5Var2.setTypeface(org.telegram.messenger.g0.o());
            k5Var2.setTextSize(18);
            this.b.addView(k5Var2, b8.mf.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (t1()) {
            m30 m30Var = new m30(this, launchActivity);
            this.M2 = m30Var;
            this.b.addView(m30Var, b8.mf.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        f30 f30Var = new f30(this, launchActivity);
        this.I1 = f30Var;
        f30Var.setClipToPadding(false);
        f30Var.setClipChildren(false);
        l30 l30Var = new l30(this);
        this.P1 = l30Var;
        l30Var.o = xqVar;
        l30Var.d = 350L;
        l30Var.c = 350L;
        l30Var.e = 350L;
        l30Var.S();
        f30Var.setItemAnimator(l30Var);
        f30Var.setOnScrollListener(new a10(this));
        f30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(x5 ? 6 : 2, f30Var);
        this.Q1 = iyVar;
        f30Var.setLayoutManager(iyVar);
        b10 b10Var = new b10(this);
        this.k1 = b10Var;
        iyVar.z1(b10Var);
        f30Var.i(new c10(this));
        iyVar.C1();
        this.b.addView(f30Var, b8.mf.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        f30Var.setAdapter(r30Var);
        f30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.r6.J(org.telegram.ui.ActionBar.k6.Sg, f30Var);
        f30Var.setOnItemClickListener(new b7(this, launchActivity, r3Var, 14));
        f30Var.setOnItemLongClickListener(new m00(this, 4));
        if (t1()) {
            v30 v30Var = new v30(this, getContext());
            this.t3 = v30Var;
            this.b.addView(v30Var, b8.mf.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(launchActivity);
        this.f4 = tj0Var;
        this.b.addView(tj0Var, b8.mf.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        a40 a40Var = new a40(r3Var, this.a, this);
        this.g4 = a40Var;
        tj0Var.setAdapter(a40Var);
        u4.s sVar = new u4.s(6, false);
        tj0Var.setLayoutManager(sVar);
        sVar.z1(new e10(this));
        final int i16 = 1;
        tj0Var.setOnItemClickListener(new org.telegram.ui.Components.fj0(this) { // from class: org.telegram.ui.o00
            public final /* synthetic */ x30 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i17, View view) {
                switch (i16) {
                    case 0:
                        org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) view;
                        org.telegram.messenger.s3 videoParticipant = d10Var.getVideoParticipant();
                        x30 x30Var2 = this.b;
                        if (videoParticipant != null) {
                            x30Var2.g1(d10Var.getVideoParticipant());
                            break;
                        } else {
                            x30Var2.g1(new org.telegram.messenger.s3(d10Var.getParticipant(), false));
                            break;
                        }
                    default:
                        x30 x30Var3 = this.b;
                        x30Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
                        if (kVar.getParticipant() != null) {
                            x30Var3.g1(kVar.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        u4.k kVar = new u4.k();
        kVar.S();
        kVar.o = xqVar;
        kVar.d = 350L;
        kVar.c = 350L;
        kVar.e = 350L;
        tj0Var.setItemAnimator(new f10(this));
        tj0Var.setOnScrollListener(new g10(this));
        a40Var.H(tj0Var, false, false);
        tj0Var.setVisibility(8);
        h10 h10Var = new h10(this, launchActivity);
        this.m1 = h10Var;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.K2 = new Matrix();
        this.J2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.L2 = paint;
        paint.setShader(this.J2);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(9);
        this.E2 = q9Var;
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(12);
        this.F2 = q9Var2;
        q9Var.a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        q9Var.b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        q9Var.b();
        q9Var2.a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        q9Var2.b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        q9Var2.b();
        int i17 = org.telegram.ui.ActionBar.k6.wh;
        q9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i17), 38));
        q9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i17), 76));
        org.telegram.ui.Components.voip.c2 c2Var = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.q1 = c2Var;
        c2Var.setCheckable(true);
        c2Var.setTextSize(12);
        h10Var.a(c2Var);
        c2Var.setOnClickListener(new n00(this, 7));
        org.telegram.ui.Components.voip.c2 c2Var2 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.p1 = c2Var2;
        c2Var2.setCheckable(true);
        c2Var2.setTextSize(12);
        c2Var2.d(false, false);
        c2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        c2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.bd.L0(2131743499), false, false);
        org.telegram.ui.Components.voip.c2 c2Var3 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.n1 = c2Var3;
        c2Var3.setCheckable(true);
        c2Var3.setTextSize(12);
        c2Var3.d(false, false);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(launchActivity);
        c2Var3.addView(fh0Var, b8.mf.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(R.raw.camera_flip, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.y4 = ch0Var2;
        fh0Var.setAnimation(ch0Var2);
        c2Var3.setOnClickListener(new n00(this, 10));
        h10Var.a(c2Var3);
        org.telegram.ui.Components.voip.c2 c2Var4 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.o1 = c2Var4;
        c2Var4.setCheckable(true);
        c2Var4.setTextSize(12);
        c2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.T1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.S1 = R.drawable.filled_sound_on;
        imageView.setImageResource(R.drawable.filled_sound_on);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        c2Var4.addView(imageView, b8.mf.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        c2Var4.setOnClickListener(new n00(this, 11));
        h10Var.a(c2Var4);
        h10Var.a(c2Var2);
        org.telegram.ui.Components.voip.c2 c2Var5 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.r1 = c2Var5;
        c2Var5.setTextSize(12);
        c2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.rh), 0.3f, false, org.telegram.messenger.bd.L0(2131743374), false, false);
        final int i18 = 1;
        c2Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s00
            public final /* synthetic */ x30 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        x30 x30Var2 = this.b;
                        LaunchActivity launchActivity3 = x30Var2.a2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            x30Var2.a2.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.hs.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                x30Var2.Q1(true, false);
                                x30Var2.P1(false);
                                x30Var2.S2.z();
                                x30Var2.Q0(true);
                                x30Var2.m1.requestLayout();
                                break;
                            } else {
                                x30Var2.b2[0].d(1, false);
                                if (x30Var2.r2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    o20 o20Var = new o20(x30Var2, launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    x30Var2.r2 = o20Var;
                                    o20Var.setBottomPadding(x30Var2.b.getPaddingBottom());
                                    x30Var2.c.addView(x30Var2.r2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        x30 x30Var3 = this.b;
                        x30Var3.S3.e();
                        org.telegram.messenger.r3 r3Var2 = x30Var3.S2;
                        if (r3Var2 != null && !r3Var2.j()) {
                            x30Var3.L1();
                            x30.v1(launchActivity, new p00(x30Var3, 5), false, false);
                            break;
                        } else {
                            x30Var3.dismiss();
                            break;
                        }
                }
            }
        });
        org.telegram.ui.Components.voip.c2 c2Var6 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.s1 = c2Var6;
        c2Var6.setCheckable(true);
        c2Var6.b(true, false);
        c2Var6.setTextSize(12);
        c2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, org.telegram.messenger.bd.L0(2131743304), false, false);
        i10 i10Var = new i10(this, launchActivity);
        this.u1 = i10Var;
        i10Var.setAnimation(ch0Var);
        i10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.c2 c2Var7 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.t1 = c2Var7;
        c2Var7.setDrawBackground(false);
        c2Var7.setTextSize(12);
        c2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        c2Var7.addView(i10Var, b8.mf.e(50, 50, 49));
        h10Var.a(c2Var7);
        c2Var7.setOnClickListener(new k10(this));
        h10Var.a(c2Var6);
        h10Var.a(c2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.v1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        c2Var7.addView(imageView2, b8.mf.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.S2 != null && t1() && !this.S2.j()) {
            imageView2.setVisibility(0);
            i10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.W1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ch));
        u20Var.setAlpha(0.0f);
        u20Var.getBackButton().setScaleX(0.9f);
        u20Var.getBackButton().setScaleY(0.9f);
        u20Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        u20Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        u20Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        u20Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.x) null, org.telegram.ui.ActionBar.k6.v0(i3));
        this.c3 = q0Var;
        int i19 = 0;
        q0Var.setLongClickEnabled(false);
        q0Var.setIcon(R.drawable.ic_ab_other);
        q0Var.setContentDescription(org.telegram.messenger.bd.L0(2131754839));
        q0Var.setSubMenuOpenSide(2);
        q0Var.setDelegate(new m00(this, i19));
        int i20 = org.telegram.ui.ActionBar.k6.Wg;
        org.telegram.ui.ActionBar.r6.S(q0Var, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i20), 6), null, org.telegram.ui.ActionBar.r6.N(i20));
        q0Var.setOnClickListener(new n00(this, i19));
        q0Var.O(org.telegram.ui.ActionBar.k6.v0(i3), false);
        q0Var.O(org.telegram.ui.ActionBar.k6.v0(i3), true);
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.x) null, org.telegram.ui.ActionBar.k6.v0(i3));
        this.d3 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(R.drawable.msg_voice_pip);
        q0Var2.setContentDescription(org.telegram.messenger.bd.L0(2131754808));
        org.telegram.ui.ActionBar.r6.S(q0Var2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i20), 6), null, org.telegram.ui.ActionBar.r6.N(i20));
        q0Var2.setOnClickListener(new n00(this, 1));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.x) null, org.telegram.ui.ActionBar.k6.v0(i3));
        this.e3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        q0Var3.setIcon(R.drawable.msg_screencast);
        q0Var3.setContentDescription(org.telegram.messenger.bd.L0(2131754808));
        org.telegram.ui.ActionBar.r6.S(q0Var3, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i20), 6), null, org.telegram.ui.ActionBar.r6.N(i20));
        q0Var3.setOnClickListener(new n00(this, 2));
        m10 m10Var = new m10(this, launchActivity, launchActivity);
        this.W2 = m10Var;
        n10 n10Var = new n10(launchActivity);
        this.F1 = n10Var;
        n10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.Y2 = paint2;
        paint2.setColor(-12761513);
        o10 o10Var = new o10(this, getContext());
        this.X2 = o10Var;
        org.telegram.ui.ActionBar.r6.V(o10Var, i3, this.J0);
        o10Var.setTextSize(1, 11.0f);
        o10Var.setText(org.telegram.messenger.bd.L0(2131743484));
        o10Var.setMaxLines(1);
        o10Var.setGravity(17);
        o10Var.setTypeface(org.telegram.messenger.g0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        o10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        o10Var.setTag(-1);
        if (!t1()) {
            o10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(m10Var, b8.mf.l(1.0f, 0, -2));
        linearLayout.addView(o10Var, b8.mf.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView(n10Var, b8.mf.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, b8.mf.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(u20Var, b8.mf.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.r3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(q0Var3, b8.mf.o(48, 48));
        linearLayout2.addView(q0Var2, b8.mf.o(48, 48));
        linearLayout2.addView(q0Var, b8.mf.o(48, 48));
        this.b.addView(linearLayout2, b8.mf.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.Y1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.b.addView(view, b8.mf.c(1.0f, -1));
        for (int i21 = 0; i21 < 2; i21++) {
            this.b2[i21] = new p10(this, launchActivity);
            this.b2[i21].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.b2[i21].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.b.addView(this.b2[i21], b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.c2 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, Integer.valueOf(org.telegram.messenger.hs.P3));
        this.c3.g(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.c3.setShowSubmenuByMove(false);
        int i22 = org.telegram.ui.ActionBar.k6.Sg;
        org.telegram.ui.ActionBar.r6.S(kVar2, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.v0(i22), 6, 6), null, org.telegram.ui.ActionBar.r6.N(i22));
        org.telegram.ui.ActionBar.q0 q0Var4 = this.c3;
        org.telegram.ui.ActionBar.y0 d = q0Var4.d(1, 0, null, org.telegram.messenger.bd.L0(2131743411), true, true, q0Var4.n0);
        this.m3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.q0 q0Var5 = this.c3;
        org.telegram.ui.ActionBar.y0 d10 = q0Var5.d(2, 0, null, org.telegram.messenger.bd.L0(2131743364), true, true, q0Var5.n0);
        this.n3 = d10;
        d10.m(false, true);
        int i23 = org.telegram.ui.ActionBar.k6.kh;
        d.setCheckColor(i23);
        d.d(org.telegram.ui.ActionBar.k6.v0(i23), org.telegram.ui.ActionBar.k6.v0(i23));
        d10.setCheckColor(i23);
        d10.d(org.telegram.ui.ActionBar.k6.v0(i23), org.telegram.ui.ActionBar.k6.v0(i23));
        Paint paint3 = new Paint(1);
        int i24 = org.telegram.ui.ActionBar.k6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(i24));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.q0 q0Var6 = this.c3;
        org.telegram.ui.ActionBar.y0 d11 = q0Var6.d(10, R.drawable.msg_voice_speaker, null, org.telegram.messenger.bd.L0(2131743409), true, false, q0Var6.n0);
        this.h3 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.q0 q0Var7 = this.c3;
        org.telegram.ui.ActionBar.y0 d12 = q0Var7.d(11, R.drawable.msg_noise_on, null, org.telegram.messenger.bd.L0(2131743292), true, false, q0Var7.n0);
        this.i3 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.c3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ug), -16777216));
        this.s3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.q0 q0Var8 = this.c3;
        org.telegram.ui.ActionBar.y0 d13 = q0Var8.d(6, R.drawable.msg_edit, this.V2, org.telegram.messenger.bd.L0(org.telegram.messenger.t3.W(this.R2) ? 2131743495 : 2131743394), true, false, q0Var8.n0);
        this.g3 = d13;
        org.telegram.ui.ActionBar.q0 q0Var9 = this.c3;
        org.telegram.ui.ActionBar.y0 d14 = q0Var9.d(7, R.drawable.msg_permissions, this.V2, org.telegram.messenger.bd.L0(2131743395), false, false, q0Var9.n0);
        this.j3 = d14;
        org.telegram.ui.ActionBar.y0 e10 = this.c3.e(3, R.drawable.msg_link, org.telegram.messenger.bd.L0(2131743347));
        this.f3 = e10;
        s30 s30Var = new s30();
        this.V2 = s30Var;
        org.telegram.ui.ActionBar.y0 e11 = this.c3.e(9, R.drawable.msg_screencast, org.telegram.messenger.bd.L0(2131743446));
        this.l3 = e11;
        org.telegram.ui.ActionBar.q0 q0Var10 = this.c3;
        org.telegram.ui.ActionBar.y0 d15 = q0Var10.d(5, 0, s30Var, org.telegram.messenger.bd.L0(2131743358), true, false, q0Var10.n0);
        this.k3 = d15;
        s30Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.y0 e12 = this.c3.e(12, R.drawable.menu_stream_comments_24, org.telegram.messenger.bd.L0(2131743494));
        this.p3 = e12;
        org.telegram.ui.ActionBar.y0 e13 = this.c3.e(13, R.drawable._menu_stream_comments_off_24, org.telegram.messenger.bd.L0(2131743496));
        this.q3 = e13;
        int i25 = 4;
        org.telegram.ui.ActionBar.y0 e14 = this.c3.e(4, R.drawable.msg_cancel, org.telegram.messenger.bd.L0(q1() ? 2131743389 : org.telegram.messenger.t3.W(this.R2) ? 2131743491 : 2131743390));
        this.o3 = e14;
        this.c3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.v0(i22));
        this.c3.getPopupLayout().setFitItems(true);
        e12.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        e13.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        d11.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        d12.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        int i26 = org.telegram.ui.ActionBar.k6.jh;
        e14.d(org.telegram.ui.ActionBar.k6.v0(i26), org.telegram.ui.ActionBar.k6.v0(i26));
        e10.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        d13.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        d14.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        d15.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        e11.d(org.telegram.ui.ActionBar.k6.v0(i24), org.telegram.ui.ActionBar.k6.v0(i24));
        if (this.S2 != null) {
            n1();
        }
        if (q1()) {
            this.h2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.h2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        S1(false);
        this.G1.getTitleTextView().setOnClickListener(new n00(this, 3));
        q10 q10Var = new q10(this, launchActivity);
        this.e4 = q10Var;
        r10 r10Var = new r10(this);
        this.F4 = r10Var;
        final int i27 = 0;
        q10Var.setClipToPadding(false);
        r10Var.S();
        r10Var.o = org.telegram.ui.Components.xq.f;
        r10Var.d = 350L;
        r10Var.c = 350L;
        r10Var.e = 350L;
        q10Var.setItemAnimator(r10Var);
        q10Var.setOnScrollListener(new s10(this));
        q10Var.setClipChildren(false);
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        q10Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.e10 e10Var = new org.telegram.ui.Components.e10(r3Var, this.a, this);
        this.h4 = e10Var;
        q10Var.setAdapter(e10Var);
        e10Var.F(q10Var, false);
        q10Var.setOnItemClickListener(new org.telegram.ui.Components.fj0(this) { // from class: org.telegram.ui.o00
            public final /* synthetic */ x30 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i172, View view2) {
                switch (i27) {
                    case 0:
                        org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) view2;
                        org.telegram.messenger.s3 videoParticipant = d10Var.getVideoParticipant();
                        x30 x30Var2 = this.b;
                        if (videoParticipant != null) {
                            x30Var2.g1(d10Var.getVideoParticipant());
                            break;
                        } else {
                            x30Var2.g1(new org.telegram.messenger.s3(d10Var.getParticipant(), false));
                            break;
                        }
                    default:
                        x30 x30Var3 = this.b;
                        x30Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar3 = (org.telegram.ui.Components.voip.k) view2;
                        if (kVar3.getParticipant() != null) {
                            x30Var3.g1(kVar3.getParticipant());
                            break;
                        }
                        break;
                }
            }
        });
        q10Var.setOnItemLongClickListener(new m00(this, 1));
        q10Var.setVisibility(8);
        q10Var.i(new t10());
        u10 u10Var = new u10(this, launchActivity, this.I1, q10Var, this.Q3, this.S2, this);
        this.S3 = u10Var;
        u10Var.setClipChildren(false);
        e10Var.E(this.Q3, u10Var);
        if (this.f4 != null) {
            this.g4.G(this.Q3, u10Var);
        }
        v10 v10Var = new v10(this, launchActivity);
        this.v4 = v10Var;
        w10 w10Var = new w10(this, launchActivity, this.G1, this.I1, v10Var);
        this.j1 = w10Var;
        w10Var.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        w10Var.setInvalidateWithParent(true);
        v10Var.setProfileGalleryView(w10Var);
        x10 x10Var = new x10(this, launchActivity);
        this.u4 = x10Var;
        x10Var.setVisibility(8);
        w10Var.setVisibility(0);
        w10Var.b(new y10(this));
        z10 z10Var = new z10(this, launchActivity);
        this.T3 = z10Var;
        this.b.addView(u10Var);
        u10Var.addView(q10Var, b8.mf.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.m1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.B4 = view2;
        int[] iArr = this.E4;
        iArr[0] = this.N3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.E4);
        this.D4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.b.addView(view2, b8.mf.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.C4 = view3;
        view3.setBackgroundColor(this.E4[0]);
        this.b.addView(view3, b8.mf.e(-1, 0, 83));
        oh.h hVar = new oh.h(launchActivity);
        this.U1 = hVar;
        hVar.setDelegate(new a20(this));
        hVar.setClickCellDelegate(new b20(this));
        org.telegram.messenger.r3 r3Var2 = this.S2;
        if (r3Var2 != null) {
            hVar.D0(this.l1.a, r3Var2.g(false));
        }
        this.b.addView(hVar, b8.mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(launchActivity, false, true, true);
        this.E1 = h6Var;
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTextColor(-1);
        h6Var.b(0.4f, 320L, org.telegram.ui.Components.xq.h);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(this.m1);
        c20 c20Var = new c20(this, launchActivity, this.D1, LaunchActivity.Q(), this.J0);
        this.z1 = c20Var;
        c20Var.K = true;
        c20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.V1)});
        c20Var.getEditText().setLinkTextColor(-11683585);
        c20Var.setHint(org.telegram.messenger.bd.L0(2131743938));
        c20Var.getEditText().addTextChangedListener(new d20(this));
        c20Var.s();
        e20 e20Var = new e20(this, launchActivity);
        this.y1 = e20Var;
        this.b.addView(e20Var, b8.mf.c(-1.0f, -1));
        f20 f20Var = new f20(launchActivity);
        this.x1 = f20Var;
        f20Var.addView(c20Var, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        f20Var.addView(h6Var, b8.mf.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        h6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.b.addView(f20Var, b8.mf.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.B1 = imageView3;
        int i28 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(V(i28), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i28), this.J0);
        int i29 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i29, e6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new n00(this, i25));
        ImageView imageView4 = new ImageView(launchActivity);
        this.A1 = imageView4;
        org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(V(i28), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i28), this.J0);
        org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.v6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new n00(this, 5));
        f20Var.addView(imageView3, b8.mf.e(48, 48, 85));
        f20Var.addView(imageView4, b8.mf.e(48, 48, 85));
        this.b.addView(z10Var);
        x10Var.addView(w10Var, b8.mf.c(-1.0f, -1));
        x10Var.addView(v10Var, b8.mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(x10Var, b8.mf.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.H1.f();
        if (y5) {
            this.g4.I(this.f4, false);
        }
        this.A2 = this.H1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.K1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.t3.T(this.R2) && (chat2 = this.R2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, b8.mf.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(launchActivity);
            cb0Var.setTextColor(-1);
            cb0Var.setSelectorColor(-9598483);
            cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            cb0Var.setItemCount(5);
            h20 h20Var = new h20(launchActivity);
            h20Var.setItemCount(5);
            h20Var.setTextColor(-1);
            h20Var.setSelectorColor(-9598483);
            h20Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            i20 i20Var = new i20(launchActivity);
            i20Var.setItemCount(5);
            i20Var.setTextColor(-1);
            i20Var.setSelectorColor(-9598483);
            i20Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            j20 j20Var = new j20(launchActivity);
            this.L1 = j20Var;
            j20Var.setLines(1);
            j20Var.setSingleLine(true);
            j20Var.setEllipsize(TextUtils.TruncateAt.END);
            j20Var.setGravity(17);
            j20Var.setTextColor(-1);
            j20Var.setTypeface(org.telegram.messenger.g0.o());
            j20Var.setTextSize(1, 14.0f);
            this.b.addView(j20Var, b8.mf.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            r13 = 0;
            j20Var.setOnClickListener(new org.telegram.messenger.video.f(this, cb0Var, h20Var, i20Var, chat, cVar, inputPeer2, 1));
            l20 l20Var = new l20(launchActivity2, cb0Var, h20Var, i20Var);
            this.J1 = l20Var;
            l20Var.setWeightSum(1.0f);
            l20Var.setOrientation(0);
            this.b.addView(l20Var, b8.mf.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i30 = calendar.get(1);
            int i31 = calendar.get(6);
            l20Var.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
            cb0Var.setMinValue(0);
            cb0Var.setMaxValue(365);
            cb0Var.setWrapSelectorWheel(false);
            cb0Var.setFormatter(new r00(currentTimeMillis, calendar, i30, 0));
            a1.d dVar = new a1.d(this, cb0Var, h20Var, i20Var, 13);
            x30Var = this;
            cb0Var.setOnValueChangedListener(dVar);
            h20Var.setMinValue(0);
            h20Var.setMaxValue(23);
            l20Var.addView(h20Var, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
            h20Var.setFormatter(new org.telegram.ui.Components.lf0(24));
            h20Var.setOnValueChangedListener(dVar);
            i20Var.setMinValue(0);
            i20Var.setMaxValue(59);
            i20Var.setValue(0);
            i20Var.setFormatter(new org.telegram.ui.Components.lf0(25));
            l20Var.addView(i20Var, b8.mf.l(0.3f, 0, org.telegram.messenger.hs.t4));
            i20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i32 = calendar.get(6);
            int i33 = calendar.get(12);
            int i34 = calendar.get(11);
            cb0Var.setValue(i31 != i32 ? 1 : 0);
            i20Var.setValue(i33);
            h20Var.setValue(i34);
            org.telegram.ui.Components.t4.g(j20Var, textView, 0L, 604800L, 2, cb0Var, h20Var, i20Var);
        } else {
            launchActivity2 = launchActivity;
            x30Var = this;
            r13 = 0;
        }
        m20 m20Var = new m20(x30Var, (ViewGroup) x30Var.getWindow().getDecorView(), x30Var.b);
        x30Var.U3 = m20Var;
        m20Var.E = new n20(x30Var);
        w10Var.setPinchToZoomHelper(m20Var);
        x30Var.p1.setOnClickListener(new View.OnClickListener(x30Var) { // from class: org.telegram.ui.s00
            public final /* synthetic */ x30 b;

            {
                this.b = x30Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (r13) {
                    case 0:
                        x30 x30Var2 = this.b;
                        LaunchActivity launchActivity3 = x30Var2.a2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            x30Var2.a2.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.hs.p1);
                            break;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
                                VoIPService.getSharedInstance().setVideoState(false, 0);
                                x30Var2.Q1(true, false);
                                x30Var2.P1(false);
                                x30Var2.S2.z();
                                x30Var2.Q0(true);
                                x30Var2.m1.requestLayout();
                                break;
                            } else {
                                x30Var2.b2[0].d(1, false);
                                if (x30Var2.r2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    o20 o20Var = new o20(x30Var2, launchActivity2, VoIPService.getSharedInstance().getVideoState(true) != 2);
                                    x30Var2.r2 = o20Var;
                                    o20Var.setBottomPadding(x30Var2.b.getPaddingBottom());
                                    x30Var2.c.addView(x30Var2.r2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        x30 x30Var3 = this.b;
                        x30Var3.S3.e();
                        org.telegram.messenger.r3 r3Var22 = x30Var3.S2;
                        if (r3Var22 != null && !r3Var22.j()) {
                            x30Var3.L1();
                            x30.v1(launchActivity2, new p00(x30Var3, 5), false, false);
                            break;
                        } else {
                            x30Var3.dismiss();
                            break;
                        }
                }
            }
        });
        x30Var.O1(r13);
        x30Var.L1();
        x30Var.P1(r13);
        x30Var.Q1(r13, r13);
        x30Var.D1(0.0f);
        x30Var.R1();
        x30Var.b.addView(new FrameLayout(launchActivity2), b8.mf.e(-1, org.telegram.messenger.hs.e3, 87));
        x30Var.s1.setOnClickListener(new n00(x30Var, 6));
        x30Var.V0();
        b8.pf.a(x30Var.p1);
        b8.pf.a(x30Var.q1);
        b8.pf.a(x30Var.n1);
        b8.pf.a(x30Var.o1);
        b8.pf.a(x30Var.t1);
        b8.pf.a(x30Var.r1);
        b8.pf.a(x30Var.s1);
        r0.i0.l(x30Var.b, new m00(x30Var, 2));
    }

    public static void H1(org.telegram.ui.ActionBar.y0 y0Var, int i3) {
        if (y0Var != null) {
            y0Var.d(i3, i3);
        }
    }

    public static void I0(final x30 x30Var, Activity activity, org.telegram.messenger.r3 r3Var, View view, int i3) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z10;
        final org.telegram.messenger.q3 q3Var;
        org.telegram.messenger.c cVar = x30Var.l1;
        ArrayList arrayList = x30Var.x2;
        r30 r30Var = x30Var.H1;
        if (view instanceof org.telegram.ui.Components.voip.k) {
            x30Var.g1(((org.telegram.ui.Components.voip.k) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f4) {
            x30Var.I1((org.telegram.ui.Cells.f4) view);
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (!(view instanceof org.telegram.ui.Cells.y3)) {
            if (i3 != r30Var.x) {
                if (i3 != r30Var.y) {
                    if (i3 == r30Var.E) {
                        x30Var.x1();
                        return;
                    }
                    return;
                }
                org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                if (r3Var2 == null || r3Var2.b == null) {
                    return;
                }
                xg.e1 e1Var = new xg.e1(activity, x30Var.a, null, 4, new ei.k0());
                org.telegram.messenger.r3 r3Var3 = x30Var.S2;
                e1Var.v2.addAll(r3Var3 != null ? (Collection) Collection.-EL.stream(r3Var3.e).map(new fa.b(11)).collect(Collectors.toSet()) : null);
                e1Var.o1(false, true);
                e1Var.t2 = new p00(x30Var, 3);
                e1Var.o1(false, true);
                e1Var.w2 = new ai.q4(18, x30Var, r3Var);
                e1Var.show();
                return;
            }
            if (org.telegram.messenger.t3.T(x30Var.R2) && (chat = x30Var.R2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)) {
                x30Var.l1(false);
                return;
            }
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(cVar.a).N0(x30Var.k1());
            if (N0 == null) {
                return;
            }
            x30Var.o2 = false;
            Context context = x30Var.getContext();
            int i12 = cVar.a;
            TLRPC.Chat chat2 = x30Var.R2;
            org.telegram.messenger.r3 r3Var4 = x30Var.S2;
            org.telegram.ui.Components.d20 d20Var = new org.telegram.ui.Components.d20(context, i12, chat2, N0, r3Var4.d, r3Var4.n);
            x30Var.w3 = d20Var;
            d20Var.setOnDismissListener(new t00(x30Var, 2));
            org.telegram.ui.Components.d20 d20Var2 = x30Var.w3;
            d20Var2.Y1 = new d10(x30Var);
            d20Var2.show();
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        if (y3Var.getUser() == null) {
            return;
        }
        if (!x30Var.q1()) {
            x30Var.a2.O0(x30Var.a);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", y3Var.getUser().id);
            if (y3Var.a.getImageReceiver().L()) {
                bundle.putBoolean("expandPhoto", true);
            }
            x30Var.a2.t0(new ProfileActivity(bundle, null));
            x30Var.dismiss();
            return;
        }
        int i13 = i3 - r30Var.n;
        if (i13 < 0 || i13 >= x30Var.S2.m.size()) {
            int i14 = i3 - r30Var.s;
            if (i14 < 0 || i14 >= x30Var.S2.l.size()) {
                int i15 = i3 - r30Var.f;
                if (x30Var.k2) {
                    if (i15 >= 0 && i15 < arrayList.size()) {
                        l10 = (Long) arrayList.get(i15);
                        z10 = false;
                    }
                    l10 = null;
                    z10 = false;
                } else {
                    if (i15 >= 0 && i15 < x30Var.S2.j.size()) {
                        l10 = (Long) x30Var.S2.j.get(i15);
                        z10 = false;
                    }
                    l10 = null;
                    z10 = false;
                }
                if (z10 && (q3Var = (org.telegram.messenger.q3) x30Var.S2.k.get(l10)) != null) {
                    org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(x30Var.c, x30Var.J0, y3Var);
                    F.l(R.drawable.msg_endcall, org.telegram.messenger.bd.M0(2131749468, null), new Runnable(x30Var) { // from class: org.telegram.ui.v00
                        public final /* synthetic */ x30 b;

                        {
                            this.b = x30Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                    declineconferencecallinvite.msg_id = q3Var2.a;
                                    final x30 x30Var2 = this.b;
                                    final int i16 = 1;
                                    ConnectionsManager.getInstance(x30Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.x00
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var3 = x30Var2;
                                                    if (!z11) {
                                                        x30Var3.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var3.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var4 = x30Var2;
                                                    if (!z12) {
                                                        x30Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.r3 r3Var5 = x30Var2.S2;
                                    if (r3Var5 != null) {
                                        q3Var2.b = false;
                                        r3Var5.k.put(l10, q3Var2);
                                        x30Var2.Q0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                    declineconferencecallinvite2.msg_id = q3Var3.a;
                                    final x30 x30Var3 = this.b;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(x30Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.x00
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var32 = x30Var3;
                                                    if (!z11) {
                                                        x30Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var32.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var4 = x30Var3;
                                                    if (!z12) {
                                                        x30Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(q3Var3.a));
                                    org.telegram.messenger.hp.s1(x30Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.r3 r3Var6 = x30Var3.S2;
                                    if (r3Var6 != null) {
                                        ArrayList arrayList3 = r3Var6.j;
                                        Long l11 = l10;
                                        arrayList3.remove(l11);
                                        x30Var3.S2.n.remove(l11);
                                        x30Var3.S2.k.remove(l11);
                                        x30Var3.Q0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, q3Var.a());
                    F.c(R.drawable.msg_remove, org.telegram.messenger.bd.M0(2131749479, null), new Runnable(x30Var) { // from class: org.telegram.ui.v00
                        public final /* synthetic */ x30 b;

                        {
                            this.b = x30Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                    declineconferencecallinvite.msg_id = q3Var2.a;
                                    final x30 x30Var2 = this.b;
                                    final int i16 = 1;
                                    ConnectionsManager.getInstance(x30Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.x00
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var32 = x30Var2;
                                                    if (!z11) {
                                                        x30Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var32.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var4 = x30Var2;
                                                    if (!z12) {
                                                        x30Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    org.telegram.messenger.r3 r3Var5 = x30Var2.S2;
                                    if (r3Var5 != null) {
                                        q3Var2.b = false;
                                        r3Var5.k.put(l10, q3Var2);
                                        x30Var2.Q0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                    declineconferencecallinvite2.msg_id = q3Var3.a;
                                    final x30 x30Var3 = this.b;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(x30Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.x00
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var32 = x30Var3;
                                                    if (!z11) {
                                                        x30Var32.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var32.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                                default:
                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                    x30 x30Var4 = x30Var3;
                                                    if (!z12) {
                                                        x30Var4.getClass();
                                                        break;
                                                    } else {
                                                        org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(q3Var3.a));
                                    org.telegram.messenger.hp.s1(x30Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                    org.telegram.messenger.r3 r3Var6 = x30Var3.S2;
                                    if (r3Var6 != null) {
                                        ArrayList arrayList3 = r3Var6.j;
                                        Long l11 = l10;
                                        arrayList3.remove(l11);
                                        x30Var3.S2.n.remove(l11);
                                        x30Var3.S2.k.remove(l11);
                                        x30Var3.Q0(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, false);
                    F.W(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), x30Var.u2.getColor()));
                    F.s = 96;
                    F.Z();
                }
                return;
            }
            l10 = (Long) x30Var.S2.l.get(i3 - r30Var.s);
        } else {
            l10 = (Long) x30Var.S2.m.get(i3 - r30Var.n);
        }
        z10 = true;
        if (z10) {
            return;
        }
        org.telegram.ui.Components.f60 F2 = org.telegram.ui.Components.f60.F(x30Var.c, x30Var.J0, y3Var);
        F2.l(R.drawable.msg_endcall, org.telegram.messenger.bd.M0(2131749468, null), new Runnable(x30Var) { // from class: org.telegram.ui.v00
            public final /* synthetic */ x30 b;

            {
                this.b = x30Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var2 = q3Var;
                        declineconferencecallinvite.msg_id = q3Var2.a;
                        final x30 x30Var2 = this.b;
                        final int i16 = 1;
                        ConnectionsManager.getInstance(x30Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.x00
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i16) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var32 = x30Var2;
                                        if (!z11) {
                                            x30Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var4 = x30Var2;
                                        if (!z12) {
                                            x30Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.r3 r3Var5 = x30Var2.S2;
                        if (r3Var5 != null) {
                            q3Var2.b = false;
                            r3Var5.k.put(l10, q3Var2);
                            x30Var2.Q0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var3 = q3Var;
                        declineconferencecallinvite2.msg_id = q3Var3.a;
                        final x30 x30Var3 = this.b;
                        final int i17 = 0;
                        ConnectionsManager.getInstance(x30Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.x00
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var32 = x30Var3;
                                        if (!z11) {
                                            x30Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var4 = x30Var3;
                                        if (!z12) {
                                            x30Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(q3Var3.a));
                        org.telegram.messenger.hp.s1(x30Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.r3 r3Var6 = x30Var3.S2;
                        if (r3Var6 != null) {
                            ArrayList arrayList3 = r3Var6.j;
                            Long l11 = l10;
                            arrayList3.remove(l11);
                            x30Var3.S2.n.remove(l11);
                            x30Var3.S2.k.remove(l11);
                            x30Var3.Q0(true);
                            break;
                        }
                        break;
                }
            }
        }, q3Var.a());
        F2.c(R.drawable.msg_remove, org.telegram.messenger.bd.M0(2131749479, null), new Runnable(x30Var) { // from class: org.telegram.ui.v00
            public final /* synthetic */ x30 b;

            {
                this.b = x30Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var2 = q3Var;
                        declineconferencecallinvite.msg_id = q3Var2.a;
                        final x30 x30Var2 = this.b;
                        final int i16 = 1;
                        ConnectionsManager.getInstance(x30Var2.a).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.x00
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i16) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var32 = x30Var2;
                                        if (!z11) {
                                            x30Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var4 = x30Var2;
                                        if (!z12) {
                                            x30Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        org.telegram.messenger.r3 r3Var5 = x30Var2.S2;
                        if (r3Var5 != null) {
                            q3Var2.b = false;
                            r3Var5.k.put(l10, q3Var2);
                            x30Var2.Q0(true);
                            break;
                        }
                        break;
                    default:
                        TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                        org.telegram.messenger.q3 q3Var3 = q3Var;
                        declineconferencecallinvite2.msg_id = q3Var3.a;
                        final x30 x30Var3 = this.b;
                        final int i17 = 0;
                        ConnectionsManager.getInstance(x30Var3.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() { // from class: org.telegram.ui.x00
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i17) {
                                    case 0:
                                        boolean z11 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var32 = x30Var3;
                                        if (!z11) {
                                            x30Var32.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var32.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                    default:
                                        boolean z12 = tLObject instanceof TLRPC.Updates;
                                        x30 x30Var4 = x30Var3;
                                        if (!z12) {
                                            x30Var4.getClass();
                                            break;
                                        } else {
                                            org.telegram.messenger.hp.s1(x30Var4.a).O3((TLRPC.Updates) tLObject, false);
                                            break;
                                        }
                                }
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(q3Var3.a));
                        org.telegram.messenger.hp.s1(x30Var3.a).Z(arrayList2, null, null, 0L, 0, true, 0);
                        org.telegram.messenger.r3 r3Var6 = x30Var3.S2;
                        if (r3Var6 != null) {
                            ArrayList arrayList3 = r3Var6.j;
                            Long l11 = l10;
                            arrayList3.remove(l11);
                            x30Var3.S2.n.remove(l11);
                            x30Var3.S2.k.remove(l11);
                            x30Var3.Q0(true);
                            break;
                        }
                        break;
                }
            }
        }, false);
        F2.W(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), x30Var.u2.getColor()));
        F2.s = 96;
        F2.Z();
    }

    public static void J0(x30 x30Var, org.telegram.ui.Components.voip.k kVar, boolean z10) {
        if (x30Var.J) {
            return;
        }
        if (z10 && kVar.getRenderer() == null) {
            kVar.setRenderer(org.telegram.ui.Components.voip.r.c(x30Var.Q3, x30Var.S3, kVar, null, null, kVar.getParticipant(), x30Var.S2, x30Var));
        } else {
            if (z10 || kVar.getRenderer() == null) {
                return;
            }
            kVar.getRenderer().setPrimaryView(null);
            kVar.setRenderer(null);
        }
    }

    public static void K0(x30 x30Var, int i3, int[] iArr) {
        if (x30Var.t1()) {
            int i10 = org.telegram.ui.ActionBar.k6.yh;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.nh, false));
            iArr[2] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else if (i3 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.mh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.nh, false));
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lh, false);
        } else if (i3 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.uh, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ph, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.qh, false));
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oh, false);
        } else if (r1(i3)) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ai, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.yh;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ah, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bh, false));
            iArr[2] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        }
        if (r1(i3)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false));
        } else if (i3 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ph, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.th, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.vh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wh, false));
        }
    }

    public static String L0() {
        return org.telegram.messenger.j6.i[(int) Math.floor(Math.random() * 8)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static void M0(x30 x30Var) {
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        if (r3Var == null || r3Var.b == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var2 = x30Var.S2;
        togglegroupcallsettings.call = r3Var2.g(r3Var2.a);
        togglegroupcallsettings.join_muted = Boolean.valueOf(x30Var.S2.b.join_muted);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(x30Var.l1.a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new y00(x30Var, 1));
    }

    public static void N0(x30 x30Var, boolean z10) {
        if (x30Var.S2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        togglegroupcallsettings.call = r3Var.g(r3Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        x30Var.p5 = Boolean.valueOf(z10);
        x30Var.K1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(x30Var.l1.a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new y00(x30Var, 0));
    }

    public static org.telegram.ui.Components.voip.k O0(x30 x30Var) {
        f30 f30Var = x30Var.I1;
        for (int i3 = 0; i3 < f30Var.getChildCount(); i3++) {
            View childAt = f30Var.getChildAt(i3);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.k) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.k) childAt;
            }
        }
        return null;
    }

    public static void P0(x30 x30Var) {
        u20 u20Var = x30Var.G1;
        f30 f30Var = x30Var.I1;
        int childCount = f30Var.getChildCount();
        float f10 = 2.14748365E9f;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (RecyclerView.R(f30Var.getChildAt(i3)) >= 0) {
                f10 = Math.min(f10, r8.getTop());
            }
        }
        if (f10 < 0.0f || f10 == 2.14748365E9f) {
            f10 = childCount != 0 ? 0.0f : f30Var.getPaddingTop();
        }
        int i10 = 1;
        boolean z10 = f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)));
        float L = f10 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && u20Var.getTag() == null) || (!z10 && u20Var.getTag() != null)) {
            u20Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = x30Var.Z1;
            if (animatorSet != null) {
                animatorSet.cancel();
                x30Var.Z1 = null;
            }
            x30Var.G0(u20Var.getTag() == null);
            ViewPropertyAnimator duration = u20Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -org.telegram.messenger.g0.L(14.0f)).setDuration(300L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
            duration.setInterpolator(xqVar).start();
            u20Var.getTitleTextView().animate().translationY(z10 ? 0.0f : org.telegram.messenger.g0.L(23.0f)).setDuration(300L).setInterpolator(xqVar).start();
            ObjectAnimator objectAnimator = x30Var.M4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                x30Var.M4.cancel();
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = u20Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.k5, Float>) property, u20Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
            x30Var.M4 = ofFloat;
            ofFloat.setDuration(300L);
            x30Var.M4.setInterpolator(xqVar);
            x30Var.M4.addListener(new org.telegram.ui.Components.s9(29, x30Var, z10));
            x30Var.M4.start();
            ObjectAnimator objectAnimator2 = x30Var.N4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u20Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.k5, Float>) property, z10 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
            x30Var.N4 = ofFloat2;
            ofFloat2.setDuration(300L);
            x30Var.N4.setInterpolator(xqVar);
            x30Var.N4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            x30Var.Z1 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = x30Var.Z1;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(u20Var, (Property<u20, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(x30Var.F1, (Property<n10, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(x30Var.Y1, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            x30Var.Z1.addListener(new s20(x30Var, i10));
            x30Var.Z1.start();
            x30Var.S3.w.setClickable(!z10 || x5);
        }
        if (x30Var.q2 != L) {
            x30Var.G1(L);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (v5 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                v5 = new x30(launchActivity, cVar, org.telegram.messenger.hp.s1(cVar.a).g1(chat.id, false, null), chat, inputPeer, z10, str);
            } else {
                org.telegram.messenger.r3 r3Var = VoIPService.getSharedInstance().groupCall;
                if (r3Var == null) {
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(cVar.a).M0(Long.valueOf(r3Var.c));
                r3Var.b(true);
                v5 = new x30(launchActivity, cVar, r3Var, M0, null, z10, str);
            }
            v5.a2 = launchActivity;
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(16));
        }
    }

    public static String h1(int i3) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i3 == 0) {
            return org.telegram.messenger.bd.M0(2131743509, null);
        }
        if (i3 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.bd.M0(2131743510, null) : org.telegram.messenger.bd.M0(2131743511, null);
        }
        if (i3 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.bd.M0(2131743513, null) : str;
    }

    public static String i1(int i3) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return i3 == 2 ? (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? org.telegram.messenger.bd.M0(2131743508, null) : org.telegram.messenger.bd.a0(null, null, 2131743507, str) : i3 == 1 ? (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? org.telegram.messenger.bd.M0(2131743505, null) : org.telegram.messenger.bd.M0(2131743506, null) : org.telegram.messenger.bd.M0(2131743504, null);
    }

    public static boolean r1(int i3) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.b.rtmp_stream) || i3 == 2 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7;
    }

    public static void v1(Context context, Runnable runnable, boolean z10, boolean z11) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        int i3 = 0;
        if (z11 || !org.telegram.messenger.t3.w(14, chat)) {
            y1(r3Var, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        boolean isConference = sharedInstance.isConference();
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        if (isConference) {
            s1Var.S = org.telegram.messenger.bd.M0(2131743478, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131743479, null);
        } else if (org.telegram.messenger.t3.W(chat)) {
            s1Var.S = org.telegram.messenger.bd.M0(2131743481, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131743482, null);
        } else {
            s1Var.S = org.telegram.messenger.bd.M0(2131743371, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131743372, null);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        if (!sharedInstance.isConference() || (r3Var != null && (groupCall = r3Var.b) != null && groupCall.creator)) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
            c2VarArr[0] = c2Var;
            c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            if (z10) {
                c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
            } else {
                c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.k6.fh;
                int i11 = org.telegram.ui.ActionBar.k6.dh;
                int i12 = org.telegram.ui.ActionBar.k6.bh;
                checkBoxSquare.s = i10;
                checkBoxSquare.w = i11;
                checkBoxSquare.x = i12;
                checkBoxSquare.invalidate();
            }
            c2VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131743480, null), "", false, false, false);
            } else if (org.telegram.messenger.t3.W(chat)) {
                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131743483, null), "", false, false, false);
            } else {
                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131743373, null), "", false, false, false);
            }
            c2VarArr[0].setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
            f10.addView(c2VarArr[0], b8.mf.o(-1, -2));
            c2VarArr[0].setOnClickListener(new q00(c2VarArr, i3));
        }
        alertDialog$Builder.o(f10);
        s1Var.J = org.telegram.ui.ActionBar.k6.dh;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743374, null), new cg.d0(r3Var, c2VarArr, selfId, runnable, 4));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        if (z10) {
            s1Var.S0 = false;
        }
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                s1Var.getWindow().setType(2038);
            } else {
                s1Var.getWindow().setType(2003);
            }
            s1Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            s1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false));
        }
        s1Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.jh, null);
        }
        s1Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
    }

    public static void y1(org.telegram.messenger.r3 r3Var, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.f;
            ArrayList arrayList2 = r3Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j10);
            if (groupCallParticipant != null) {
                r3Var.d.e(j10);
                arrayList2.remove(groupCallParticipant);
                r3Var.g.remove(groupCallParticipant);
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (org.telegram.messenger.zi.C1(((org.telegram.messenger.s3) arrayList.get(i3)).a.peer) == org.telegram.messenger.zi.C1(groupCallParticipant.peer)) {
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                TLRPC.GroupCall groupCall = r3Var.b;
                groupCall.participants_count--;
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i10);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.v2, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(boolean z10, org.telegram.ui.Cells.f4 f4Var) {
        int i3;
        float f10;
        final float f11;
        float f12;
        org.telegram.ui.Components.voip.r rVar;
        org.telegram.ui.Components.voip.r rVar2;
        float paddingLeft = this.b.getPaddingLeft() + org.telegram.messenger.g0.L(14.0f);
        float paddingTop = this.b.getPaddingTop() + org.telegram.messenger.g0.L(14.0f);
        boolean z11 = this.T4;
        w10 w10Var = this.j1;
        f30 f30Var = this.I1;
        if (z11) {
            f11 = (f30Var.getX() + (f4Var.getX() + f4Var.getAvatarImageView().getX())) - paddingLeft;
            f10 = (f30Var.getY() + (f4Var.getY() + f4Var.getAvatarImageView().getY())) - paddingTop;
            f12 = f4Var.getAvatarImageView().getMeasuredHeight() / f30Var.getMeasuredWidth();
            i3 = (int) ((f4Var.getAvatarImageView().getMeasuredHeight() >> 1) / f12);
        } else {
            if (this.R4 == null) {
                this.G4 = true;
            } else {
                this.G4 = z10 || w10Var.E0.k(w10Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.k kVar = this.Q4;
            u10 u10Var = this.S3;
            if (kVar == null || !this.G4) {
                org.telegram.ui.Components.d10 d10Var = this.S4;
                if (d10Var != null) {
                    org.telegram.ui.Components.voip.r rVar3 = this.R4;
                    q10 q10Var = this.e4;
                    if (rVar3 == null) {
                        float x10 = (u10Var.getX() + (q10Var.getX() + (this.S4.getX() + d10Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y9 = (u10Var.getY() + (q10Var.getY() + (this.S4.getY() + this.S4.getAvatarImageView().getY()))) - paddingTop;
                        f12 = this.S4.getAvatarImageView().getMeasuredHeight() / f30Var.getMeasuredWidth();
                        i3 = (int) ((this.S4.getAvatarImageView().getMeasuredHeight() >> 1) / f12);
                        f10 = y9;
                        f11 = x10;
                        if (!this.G4 && (rVar = this.R4) != null) {
                            rVar.invalidate();
                            u10Var.invalidate();
                            org.telegram.ui.Components.voip.r rVar4 = this.R4;
                            rVar4.h = false;
                            rVar4.j(false);
                            this.R4 = null;
                        }
                    } else if (this.G4) {
                        f11 = (u10Var.getX() + (q10Var.getX() + d10Var.getX())) - paddingLeft;
                        f10 = (u10Var.getY() + (q10Var.getY() + this.S4.getY())) - paddingTop;
                        i3 = 0;
                    }
                }
                i3 = 0;
                f10 = 0.0f;
                f11 = 0.0f;
                f12 = 0.96f;
                if (!this.G4) {
                    rVar.invalidate();
                    u10Var.invalidate();
                    org.telegram.ui.Components.voip.r rVar42 = this.R4;
                    rVar42.h = false;
                    rVar42.j(false);
                    this.R4 = null;
                }
            } else {
                float x11 = (f30Var.getX() + kVar.getX()) - paddingLeft;
                f10 = ((f30Var.getY() + this.Q4.getY()) + org.telegram.messenger.g0.L(2.0f)) - paddingTop;
                i3 = 0;
                f11 = x11;
            }
            f12 = 1.0f;
            if (!this.G4) {
            }
        }
        final float f13 = f10;
        final float f14 = f12;
        v10 v10Var = this.v4;
        if (z10) {
            x10 x10Var = this.u4;
            x10Var.setScaleX(f14);
            x10Var.setScaleY(f14);
            x10Var.setTranslationX(f11);
            x10Var.setTranslationY(f13);
            v10Var.setAlpha(0.0f);
        }
        w10Var.N(i3, i3);
        if (this.Y3) {
            z10 z10Var = this.T3;
            if (z10) {
                z10Var.setAlpha(0.0f);
            }
            org.telegram.messenger.camera.q.k(z10Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        }
        org.telegram.messenger.camera.q.k(v10Var.animate(), z10 ? 1.0f : 0.0f, 220L);
        if (!z10 && (rVar2 = this.R4) != null) {
            rVar2.h = false;
            rVar2.j(true);
            if (w10Var.E0.k(w10Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.n nVar = this.R4.a;
                nVar.F = false;
                nVar.G = 0L;
                this.Q4 = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i10 = i3;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.w00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x30 x30Var = x30.this;
                x30Var.V3 = floatValue;
                x30Var.S3.n = floatValue;
                float f15 = (floatValue * 1.0f) + ((1.0f - floatValue) * f14);
                x10 x10Var2 = x30Var.u4;
                x10Var2.setScaleX(f15);
                x10Var2.setScaleY(f15);
                x10Var2.setTranslationX((1.0f - x30Var.V3) * f11);
                x10Var2.setTranslationY((1.0f - x30Var.V3) * f13);
                if (!x30Var.Y3) {
                    x30Var.O4.setAlpha((int) (x30Var.V3 * 100.0f));
                }
                org.telegram.ui.Components.voip.r rVar5 = x30Var.R4;
                if (rVar5 != null) {
                    rVar5.a.setRoundCorners((1.0f - x30Var.V3) * org.telegram.messenger.g0.L(8.0f));
                }
                x10Var2.invalidate();
                x30Var.b.invalidate();
                w10 w10Var2 = x30Var.j1;
                int i11 = (int) ((1.0f - x30Var.V3) * i10);
                w10Var2.N(i11, i11);
            }
        });
        this.V4 = org.telegram.messenger.hs.f(this.l1.a).q(new int[]{org.telegram.messenger.hs.b0, org.telegram.messenger.hs.Y1, org.telegram.messenger.hs.D}, this.V4, true);
        org.telegram.ui.Components.voip.r rVar5 = this.Q4 != null ? this.R4 : null;
        if (rVar5 != null) {
            rVar5.f = true;
        }
        ofFloat.addListener(new androidx.fragment.app.g(this, rVar5, z10, 10));
        if (this.T4 || this.R4 == null) {
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
            ofFloat.setDuration(220L);
            ofFloat.start();
        } else {
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
            ofFloat.setDuration(220L);
            this.R4.a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.n nVar2 = this.R4.a;
            if (nVar2.F) {
                nVar2.H.add(ofFloat);
            } else {
                ofFloat.start();
            }
        }
        U0();
    }

    public final void B1() {
        o4 o4Var = this.s4;
        org.telegram.messenger.g0.r(o4Var);
        if (!this.r4 || this.M2 == null || VoIPService.getSharedInstance() == null || !t1() || this.I1 == null || !org.telegram.messenger.lc.e(512)) {
            return;
        }
        org.telegram.messenger.g0.i3(o4Var, 30L);
    }

    public final void C1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g7;
        this.z1.setText("");
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var == null || r3Var.b == null || (g7 = r3Var.g(r3Var.a)) == null) {
            return;
        }
        org.telegram.messenger.r3 r3Var2 = this.S2;
        long j10 = r3Var2.b.id;
        TLRPC.Peer peer = r3Var2.J;
        GroupCallMessagesController.getInstance(this.a).sendCallMessage(peer != null ? org.telegram.messenger.m5.o(peer) : org.telegram.messenger.h10.i(this.a).n, tL_textWithEntities, j10, g7);
    }

    public final void D1(float f10) {
        this.M3 = f10;
        u10 u10Var = this.S3;
        float max = Math.max(f10, u10Var == null ? 0.0f : u10Var.c);
        int i3 = org.telegram.ui.ActionBar.k6.Xg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int i10 = org.telegram.ui.ActionBar.k6.Ug;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.N3 = S0;
        this.F1.setBackgroundColor(S0);
        this.c3.H(-14472653);
        this.X1.setColorFilter(new PorterDuffColorFilter(this.N3, PorterDuff.Mode.MULTIPLY));
        this.H0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hh, false));
        g.b bVar = this.h2;
        if (bVar != null) {
            bVar.b = S02;
            org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) bVar.i;
            if (r0Var != null) {
                r0Var.invalidate();
            }
        }
        this.u2.setColor(S02);
        this.w1.setColor(S02);
        this.x1.invalidate();
        f30 f30Var = this.I1;
        f30Var.setGlowColor(S02);
        int i11 = this.x3;
        if (i11 == 3 || r1(i11)) {
            this.t1.invalidate();
        }
        View view = this.B4;
        if (view != null) {
            int i12 = this.N3;
            int[] iArr = this.E4;
            iArr[0] = i12;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.D4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.D4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.C4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.rh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.sh, false));
        this.r1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ch, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ah, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fh, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0);
        int childCount = f30Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = f30Var.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                if (q1()) {
                    z3Var.a(w02, w02);
                } else {
                    z3Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.f4;
                u20 u20Var = this.G1;
                if (z10) {
                    ((org.telegram.ui.Cells.f4) childAt).f(u20Var.getTag() != null ? org.telegram.ui.ActionBar.k6.fh : org.telegram.ui.ActionBar.k6.ah, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                    ((org.telegram.ui.Cells.y3) childAt).a(u20Var.getTag() != null ? org.telegram.ui.ActionBar.k6.fh : org.telegram.ui.ActionBar.k6.ah, S05);
                }
            }
        }
        this.b.invalidate();
        f30Var.invalidate();
        this.c.invalidate();
    }

    public final void E1(float f10) {
        f30 f30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        u4.d1 K;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f10 = 0.0f;
        }
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.H2 = min;
        this.I2 = (min - this.G2) / 265.0f;
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var == null || (f30Var = this.I1) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(org.telegram.messenger.zi.C1(this.s2))) == null) {
            return;
        }
        u10 u10Var = this.S3;
        if (u10Var.b) {
            int i3 = 0;
            while (true) {
                q10 q10Var = this.e4;
                if (i3 >= q10Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) q10Var.getChildAt(i3);
                if (org.telegram.messenger.zi.C1(d10Var.getParticipant().peer) == org.telegram.messenger.zi.C1(groupCallParticipant.peer)) {
                    d10Var.setAmplitude(f10 * 15.0f);
                }
                i3++;
            }
        } else {
            int indexOf = (this.k2 ? this.v2 : this.S2.g).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (K = f30Var.K(indexOf + this.H1.d)) != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) view).setAmplitude(f10 * 15.0f);
                    if (view == this.P4 && !this.d4) {
                        this.b.invalidate();
                    }
                }
            }
        }
        u10Var.k(groupCallParticipant, f10 * 15.0f);
    }

    public final void F1(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.Y4 = i3;
        this.Z4 = i10;
        this.a5 = i11;
        this.b5 = i12;
        this.c5 = i13;
        this.d5 = i14;
        this.e5 = i15;
        this.f5 = i16;
        this.g5 = i17;
        this.h5 = i18;
        this.i5 = i19;
        this.j5 = i20;
        this.k5 = i21;
        this.l5 = i22;
        this.m5 = i23;
        this.n5 = i24;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void G1(float f10) {
        int i3;
        this.q2 = f10;
        this.I1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) r0.getLayoutParams()).topMargin));
        float L = f10 - org.telegram.messenger.g0.L(74.0f);
        float f11 = this.t0 + L;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        m30 m30Var = this.M2;
        u10 u10Var = this.S3;
        o10 o10Var = this.X2;
        m10 m10Var = this.W2;
        if (f11 < currentActionBarHeight) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L) - this.t0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((r0 - this.t0) - org.telegram.messenger.g0.L(14.0f))));
            i3 = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 17.0f : 13.0f) * min);
            if (m30Var != null) {
                m30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.M3) > 1.0E-4f) {
                D1(Math.min(1.0f, min));
            }
            float A = org.telegram.ui.Cells.f1.A(min, 0.1f, 1.2f, 1.0f);
            m10Var.setScaleX(Math.max(0.9f, A));
            m10Var.setScaleY(Math.max(0.9f, A));
            float f12 = 1.0f - (min * 1.2f);
            m10Var.setAlpha((1.0f - u10Var.c) * Math.max(0.0f, f12));
            o10Var.setScaleX(Math.max(0.9f, A));
            o10Var.setScaleY(Math.max(0.9f, A));
            o10Var.setAlpha((1.0f - u10Var.c) * Math.max(0.0f, f12));
        } else {
            m10Var.setScaleX(1.0f);
            m10Var.setScaleY(1.0f);
            m10Var.setAlpha(1.0f - u10Var.c);
            o10Var.setScaleX(1.0f);
            o10Var.setScaleY(1.0f);
            o10Var.setAlpha(1.0f - u10Var.c);
            if (this.M3 > 1.0E-4f) {
                D1(0.0f);
            }
            i3 = 0;
        }
        a1();
        float f13 = i3;
        this.r3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.b3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (m30Var != null) {
            m30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        l20 l20Var = this.J1;
        if (l20Var != null) {
            l20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.b.invalidate();
        T1();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean H() {
        return !this.S3.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x04be, code lost:
    
        if (org.telegram.messenger.t3.w(2, r36.R2) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x030a, code lost:
    
        if ((r11 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (r14 == (-k1())) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02c1, code lost:
    
        if (r2.admin_rights.manage_call != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [android.graphics.drawable.Drawable, boolean[]] */
    /* JADX WARN: Type inference failed for: r5v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I1(View view) {
        org.telegram.ui.Cells.f4 f4Var;
        u30 u30Var;
        Integer num;
        org.telegram.ui.Components.pd0 pd0Var;
        org.telegram.ui.ActionBar.k1 k1Var;
        ViewGroup viewGroup;
        Integer num2;
        boolean z10;
        int i3;
        TLRPC.GroupCall groupCall;
        long j10;
        org.telegram.messenger.ac m10;
        org.telegram.messenger.ac m11;
        boolean z11;
        g30 g30Var;
        TLRPC.FileLocation fileLocation;
        int x10;
        int y9;
        float y10;
        int measuredHeight;
        int i10;
        boolean z12;
        ?? r5;
        String str;
        String str2;
        int i11;
        String str3;
        int i12;
        TLRPC.ChatParticipants chatParticipants;
        Integer valueOf = Integer.valueOf(R.drawable.msg_msgbubble3);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_voice_muted);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_voice_unmuted);
        if (!this.P1.k() && getContext() != null) {
            if (this.U4 || this.X3) {
                f1(true);
                return false;
            }
            z20 z20Var = this.X4;
            if (z20Var != null) {
                z20Var.dismiss();
                this.X4 = null;
                return false;
            }
            d1();
            if (view instanceof org.telegram.ui.Components.voip.k) {
                org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
                if (kVar.getParticipant() != this.S2.z) {
                    f4Var = new org.telegram.ui.Cells.f4(kVar.getContext());
                    f4Var.e(this.l1, kVar.getParticipant().a, this.S2, org.telegram.messenger.zi.C1(this.s2), null, false);
                    org.telegram.ui.Components.e5 e5Var = f4Var.s;
                    if (e5Var != null) {
                        e5Var.f();
                    }
                    this.T4 = false;
                    this.Q4 = kVar;
                    this.R4 = kVar.getRenderer();
                    if (!y5 && !x5) {
                        this.b.addView(f4Var, b8.mf.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (f4Var != null) {
                        boolean z13 = (x5 || y5 || org.telegram.messenger.g0.E) ? false : true;
                        TLRPC.GroupCallParticipant participant = f4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new qh(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new m00(this, 5));
                            LinearLayout linearLayout = new LinearLayout(getContext());
                            LinearLayout linearLayout2 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
                            this.w4 = linearLayout;
                            org.telegram.ui.Components.pd0 pd0Var2 = new org.telegram.ui.Components.pd0(getContext(), linearLayout, linearLayout2);
                            pd0Var2.setMinimumWidth(org.telegram.messenger.g0.L(240.0f));
                            pd0Var2.setOrientation(1);
                            boolean z14 = z13;
                            int S0 = org.telegram.messenger.g0.S0(this.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hh, false));
                            if (linearLayout2 == null || f4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                u30Var = null;
                            } else {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                mutate.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(mutate);
                                pd0Var2.addView(linearLayout2, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                u30 u30Var2 = new u30(this, getContext(), participant);
                                linearLayout2.addView(u30Var2, -1, 48);
                                u30Var = u30Var2;
                            }
                            linearLayout.setMinimumWidth(org.telegram.messenger.g0.L(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(mutate2);
                            pd0Var2.addView(linearLayout, b8.mf.k(0.0f, u30Var != null ? -8.0f : 0.0f, 0.0f, 0.0f, -2, -2));
                            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(getContext(), pd0Var2);
                            k1Var2.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var2, b8.mf.c(-2.0f, -2));
                            long C1 = org.telegram.messenger.zi.C1(participant.peer);
                            u30 u30Var3 = u30Var;
                            ArrayList arrayList = new ArrayList(2);
                            ArrayList arrayList2 = new ArrayList(2);
                            ArrayList arrayList3 = new ArrayList(2);
                            boolean z15 = participant.peer instanceof TLRPC.TL_peerUser;
                            org.telegram.messenger.c cVar = this.l1;
                            if (!z15) {
                                num = 8;
                                pd0Var = pd0Var2;
                                k1Var = k1Var2;
                                viewGroup = linearLayout;
                                num2 = 6;
                            } else if (org.telegram.messenger.t3.T(this.R2)) {
                                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(cVar.a);
                                pd0Var = pd0Var2;
                                k1Var = k1Var2;
                                viewGroup = linearLayout;
                                long j11 = participant.peer.user_id;
                                num2 = 6;
                                num = 8;
                                a0.h hVar = (a0.h) s12.y1.f(k1());
                                TLRPC.ChannelParticipant channelParticipant = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j11);
                                if (channelParticipant != null) {
                                    if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
                                    }
                                    z10 = true;
                                }
                                z10 = false;
                            } else {
                                num = 8;
                                pd0Var = pd0Var2;
                                k1Var = k1Var2;
                                viewGroup = linearLayout;
                                num2 = 6;
                                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(cVar.a).N0(k1());
                                if (N0 != null && (chatParticipants = N0.participants) != null) {
                                    int size = chatParticipants.participants.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= size) {
                                            break;
                                        }
                                        TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i13);
                                        TLRPC.ChatFull chatFull = N0;
                                        int i14 = size;
                                        if (chatParticipant.user_id != participant.peer.user_id) {
                                            i13++;
                                            N0 = chatFull;
                                            size = i14;
                                        } else if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                        }
                                    }
                                }
                                z10 = false;
                            }
                            if (f4Var.c()) {
                                if (q1() && f4Var.L) {
                                    str = null;
                                    org.telegram.ui.Cells.f1.x(null, 2131743404, arrayList, R.drawable.msg_handdown, arrayList2);
                                    arrayList3.add(7);
                                } else {
                                    str = null;
                                }
                                arrayList.add(org.telegram.messenger.bd.M0(f4Var.b.getImageReceiver().L() ? 2131743515 : 2131743252, str));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
                                arrayList3.add(9);
                                if (C1 > 0) {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i12 = 2131743517;
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                        i12 = 2131743427;
                                    }
                                    arrayList.add(org.telegram.messenger.bd.M0(i12, str3));
                                } else {
                                    arrayList.add(org.telegram.messenger.bd.M0(TextUtils.isEmpty(participant.about) ? 2131743516 : 2131743426, null));
                                }
                                arrayList2.add(Integer.valueOf(TextUtils.isEmpty(participant.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
                                arrayList3.add(10);
                                if (C1 > 0) {
                                    i11 = 2131743425;
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    i11 = 2131743424;
                                }
                                arrayList.add(org.telegram.messenger.bd.M0(i11, str2));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
                                arrayList3.add(11);
                            } else if (S0()) {
                                if (!q1() && z10 && participant.muted) {
                                    if (q1() && participant.muted_by_you) {
                                        arrayList.add(org.telegram.messenger.bd.M0(2131743328, null));
                                        arrayList2.add(valueOf3);
                                        arrayList3.add(4);
                                    }
                                } else if (!participant.muted || participant.can_self_unmute) {
                                    arrayList.add(org.telegram.messenger.bd.M0(2131743369, null));
                                    arrayList2.add(valueOf2);
                                    arrayList3.add(0);
                                } else {
                                    arrayList.add(org.telegram.messenger.bd.M0(2131743410, null));
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(valueOf3);
                                    }
                                    arrayList3.add(1);
                                }
                                TLRPC.Peer peer = participant.peer;
                                if (peer != null) {
                                    long j12 = peer.channel_id;
                                    if (j12 != 0 && !org.telegram.messenger.t3.m0(this.a, j12)) {
                                        org.telegram.ui.Cells.f1.x(null, 2131743363, arrayList, R.drawable.msg_channel, arrayList2);
                                        arrayList3.add(num);
                                        if (q1()) {
                                            i3 = z10 ? 2 : 2;
                                        } else {
                                            org.telegram.messenger.r3 r3Var = this.S2;
                                            if (r3Var != null && (groupCall = r3Var.b) != null && groupCall.creator) {
                                                org.telegram.ui.Cells.f1.x(null, 2131743321, arrayList, R.drawable.msg_block2, arrayList2);
                                                arrayList3.add(Integer.valueOf(i3));
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.Cells.f1.x(null, 2131743361, arrayList, R.drawable.msg_openprofile, arrayList2);
                                arrayList3.add(num2);
                                if (q1()) {
                                }
                            } else {
                                Integer num3 = num;
                                if (participant.muted_by_you) {
                                    arrayList.add(org.telegram.messenger.bd.M0(2131743328, null));
                                    arrayList2.add(valueOf3);
                                    arrayList3.add(4);
                                } else {
                                    arrayList.add(org.telegram.messenger.bd.M0(2131743368, null));
                                    arrayList2.add(valueOf2);
                                    arrayList3.add(5);
                                }
                                TLRPC.Peer peer2 = participant.peer;
                                if (peer2 != null) {
                                    long j13 = peer2.channel_id;
                                    if (j13 != 0 && !org.telegram.messenger.t3.m0(this.a, j13)) {
                                        arrayList.add(org.telegram.messenger.bd.M0(2131743363, null));
                                        arrayList2.add(valueOf);
                                        arrayList3.add(num3);
                                    }
                                }
                                arrayList.add(org.telegram.messenger.bd.M0(2131743362, null));
                                arrayList2.add(valueOf);
                                arrayList3.add(num2);
                            }
                            int size2 = arrayList.size();
                            int i15 = 0;
                            while (i15 < size2) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(getContext(), i15 == 0, i15 == size2 + (-1));
                                if (((Integer) arrayList3.get(i15)).intValue() != 2) {
                                    int i16 = org.telegram.ui.ActionBar.k6.Vg;
                                    z12 = false;
                                    r5 = 0;
                                    y0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i16, false), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
                                } else {
                                    z12 = false;
                                    r5 = 0;
                                    int i17 = org.telegram.ui.ActionBar.k6.jh;
                                    y0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i17, false), org.telegram.ui.ActionBar.k6.x0(null, i17, false));
                                }
                                y0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.x0(r5, org.telegram.ui.ActionBar.k6.Sg, z12));
                                y0Var.j((CharSequence) arrayList.get(i15), ((Integer) arrayList2.get(i15)).intValue(), r5);
                                viewGroup.addView(y0Var);
                                y0Var.setTag(arrayList3.get(i15));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                y0Var.setOnClickListener(new ei.t5(this, i15, arrayList3, groupCallParticipant, 3));
                                i15++;
                                participant = groupCallParticipant;
                            }
                            k1Var.addView(pd0Var, b8.mf.x(-2, -2, 51));
                            f30 f30Var = this.I1;
                            f30Var.C0();
                            this.Q1.X = false;
                            this.P4 = f4Var;
                            f4Var.setAboutVisible(true);
                            this.b.invalidate();
                            f30Var.invalidate();
                            AnimatorSet animatorSet = this.W4;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.W3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (C1 > 0) {
                                int i18 = cVar.a;
                                int i19 = cVar.a;
                                TLRPC.User a22 = org.telegram.messenger.hp.s1(i18).a2(Long.valueOf(C1));
                                m10 = org.telegram.messenger.ac.m(i19, 0, a22);
                                m11 = org.telegram.messenger.ac.m(i19, 1, a22);
                                j10 = C1;
                                if (org.telegram.messenger.hp.s1(this.a).b2(j10) == null) {
                                    org.telegram.messenger.hp.s1(this.a).g3(a22, false, 0);
                                }
                            } else {
                                j10 = C1;
                                int i20 = cVar.a;
                                int i21 = cVar.a;
                                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i20).M0(Long.valueOf(-j10));
                                m10 = org.telegram.messenger.ac.m(i21, 0, M0);
                                m11 = org.telegram.messenger.ac.m(i21, 1, M0);
                            }
                            org.telegram.ui.Components.voip.r rVar = this.R4;
                            boolean z16 = rVar != null && rVar.w;
                            if (m10 != null || z16) {
                                if (z14) {
                                    org.telegram.ui.Components.k9 avatarImageView = this.P4.getAvatarImageView();
                                    w10 w10Var = this.j1;
                                    w10Var.setParentAvatarImage(avatarImageView);
                                    w10Var.setHasActiveVideo(z16);
                                    w10Var.M(j10, true);
                                    w10Var.setCreateThumbFromParent(true);
                                    w10Var.H(null, m10, m11, true);
                                    org.telegram.ui.Components.voip.r rVar2 = this.R4;
                                    if (rVar2 != null) {
                                        rVar2.h = true;
                                        rVar2.j(true);
                                    }
                                    if (org.telegram.messenger.zi.C1(this.s2) == j10 && this.Z3 != null && (g30Var = this.a4) != null && (fileLocation = g30Var.c) != null) {
                                        w10Var.A(g30Var.d, org.telegram.messenger.ac.e(fileLocation));
                                    }
                                }
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.X3 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                                this.b.addView(this.W3, b8.mf.c(-2.0f, -2));
                                this.Y3 = true;
                                z10 z10Var = this.T3;
                                if (z10Var == null) {
                                    i10 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.b.getMeasuredWidth() - (this.u0 * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.b.getMeasuredHeight() - org.telegram.messenger.g0.m) / 6.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -org.telegram.messenger.g0.m);
                                    this.a2.M().getView().draw(canvas);
                                    canvas.drawColor(i0.a.o(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.b.getX(), -org.telegram.messenger.g0.m);
                                    this.x4 = true;
                                    this.b.draw(canvas);
                                    i10 = 0;
                                    this.x4 = false;
                                    Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / org.telegram.messenger.hs.K2));
                                    z10Var.setBackground(new BitmapDrawable(createBitmap));
                                    z10Var.setAlpha(0.0f);
                                    z10Var.setVisibility(0);
                                    z10Var.bringToFront();
                                }
                                this.U4 = true;
                                this.u4.setVisibility(i10);
                                if (u30Var3 != null) {
                                    u30Var3.invalidate();
                                }
                                A1(true, f4Var);
                                org.telegram.ui.Components.d10 d10Var = this.S4;
                                if (d10Var != null) {
                                    d10Var.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.X3 = false;
                            z20 z20Var2 = new z20(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.X4 = z20Var2;
                            z20Var2.e = true;
                            z20Var2.c = org.telegram.messenger.hs.x3;
                            z20Var2.setOutsideTouchable(true);
                            this.X4.setClippingEnabled(true);
                            this.X4.setAnimationStyle(R.style.PopupContextAnimation);
                            this.X4.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            this.X4.setInputMethodMode(2);
                            this.X4.setSoftInputMode(0);
                            this.X4.getContentView().setFocusableInTouchMode(true);
                            org.telegram.ui.Components.d10 d10Var2 = this.S4;
                            if (d10Var2 != null) {
                                boolean z17 = x5;
                                u10 u10Var = this.S3;
                                q10 q10Var = this.e4;
                                if (z17) {
                                    x10 = org.telegram.messenger.g0.L(32.0f) + (((int) (u10Var.getX() + (q10Var.getX() + d10Var2.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    y9 = ((int) (u10Var.getY() + (q10Var.getY() + this.S4.getY()))) - org.telegram.messenger.g0.L(6.0f);
                                } else {
                                    int x11 = ((int) (u10Var.getX() + (q10Var.getX() + d10Var2.getX()))) - org.telegram.messenger.g0.L(14.0f);
                                    y9 = (int) ((u10Var.getY() + (q10Var.getY() + this.S4.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight());
                                    x10 = x11;
                                }
                            } else {
                                x10 = (int) (((f30Var.getX() + f30Var.getMeasuredWidth()) + org.telegram.messenger.g0.L(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.T4) {
                                    y10 = f4Var.getY() + f30Var.getY();
                                    measuredHeight = f4Var.getClipHeight();
                                } else if (this.Q4 != null) {
                                    y10 = this.Q4.getY() + f30Var.getY();
                                    measuredHeight = this.Q4.getMeasuredHeight();
                                } else {
                                    y9 = (int) f30Var.getY();
                                }
                                y9 = (int) (y10 + measuredHeight);
                            }
                            this.X4.showAtLocation(f30Var, 51, x10, y9);
                            this.W4 = new AnimatorSet();
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(ObjectAnimator.ofInt(this.O4, org.telegram.ui.Components.k6.b, 0, 100));
                            this.W4.playTogether(arrayList4);
                            this.W4.setDuration(150L);
                            this.W4.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.d10) {
                    org.telegram.ui.Components.d10 d10Var3 = (org.telegram.ui.Components.d10) view;
                    if (d10Var3.getParticipant() != this.S2.z.a) {
                        f4Var = new org.telegram.ui.Cells.f4(d10Var3.getContext());
                        f4Var.e(this.l1, d10Var3.getParticipant(), this.S2, org.telegram.messenger.zi.C1(this.s2), null, false);
                        org.telegram.ui.Components.e5 e5Var2 = f4Var.s;
                        if (e5Var2 != null) {
                            e5Var2.f();
                        }
                        this.T4 = false;
                        this.S4 = d10Var3;
                        org.telegram.ui.Components.voip.r renderer = d10Var3.getRenderer();
                        this.R4 = renderer;
                        if (renderer != null && renderer.b) {
                            this.R4 = null;
                        }
                        this.b.addView(f4Var, b8.mf.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    f4Var = (org.telegram.ui.Cells.f4) view;
                    this.T4 = true;
                }
                if (f4Var != null) {
                }
            }
        }
        return false;
    }

    public final void J1(View view) {
        if (this.e2 == null) {
            org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(8, getContext(), null, true);
            this.e2 = u20Var;
            u20Var.setAlpha(0.0f);
            this.e2.setVisibility(4);
            this.e2.setShowingDuration(3000L);
            this.b.addView(this.e2, b8.mf.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.t3.W(this.R2)) {
                this.e2.setText(org.telegram.messenger.bd.M0(2131743475, null));
            } else {
                this.e2.setText(org.telegram.messenger.bd.M0(2131743357, null));
            }
            this.e2.b();
        }
        this.e2.setExtraTranslationY(-org.telegram.messenger.g0.m);
        this.e2.c(view);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        u10 u10Var = this.S3;
        if (u10Var != null) {
            if (this.i4 != null) {
                this.I1.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            ArrayList arrayList = this.R3;
            arrayList.clear();
            ArrayList arrayList2 = this.Q3;
            arrayList.addAll(arrayList2);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).f();
                u10Var.removeView((View) arrayList.get(i3));
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).e();
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).b(true);
            }
            arrayList2.clear();
            if (u10Var.getParent() != null) {
                arrayList2.clear();
                this.b.removeView(u10Var);
            }
        }
        super.K();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (v5 == this) {
            v5 = null;
        }
        w5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.l10.j(getContext());
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var != null) {
            ArrayList arrayList3 = r3Var.e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            r3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final void K1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.messenger.r3 r3Var = this.S2;
        org.telegram.ui.Components.voip.c2 c2Var = this.s1;
        org.telegram.ui.Components.voip.c2 c2Var2 = this.o1;
        org.telegram.ui.Components.voip.c2 c2Var3 = this.q1;
        org.telegram.ui.Components.voip.c2 c2Var4 = this.n1;
        org.telegram.ui.Components.voip.c2 c2Var5 = this.p1;
        org.telegram.ui.Components.voip.c2 c2Var6 = this.r1;
        org.telegram.ui.Components.voip.c2 c2Var7 = this.t1;
        h10 h10Var = this.m1;
        boolean z15 = false;
        if (r3Var == null || r3Var.j()) {
            h10Var.c(c2Var7, this.N2 > 0.1f, z10);
            h10Var.c(c2Var6, this.N2 > 0.1f, z10);
            h10Var.c(c2Var3, this.N2 > 0.1f, z10);
            h10Var.c(c2Var5, false, z10);
            h10Var.c(c2Var4, false, z10);
            h10Var.c(c2Var2, false, z10);
            h10Var.c(c2Var, false, z10);
            return;
        }
        boolean z16 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.s2));
        boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
        Boolean bool = this.p5;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.S2.b;
            z11 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z17 || !this.S2.c()) && !z16) || t1()) {
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
        if (x5) {
            z13 = false;
            z14 = false;
        }
        h10Var.c(c2Var7, true, z10);
        h10Var.c(c2Var6, true, z10);
        h10Var.c(c2Var5, z12, z10);
        h10Var.c(c2Var4, z14, z10);
        h10Var.c(c2Var3, z15, z10);
        h10Var.c(c2Var2, z13, z10);
        h10Var.c(c2Var, z11, z10);
    }

    public final void L1() {
        org.telegram.messenger.r3 r3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.r3 r3Var2 = this.S2;
        org.telegram.ui.ActionBar.q0 q0Var = this.c3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.e3;
        if (r3Var2 == null || r3Var2.j()) {
            this.d3.setVisibility(4);
            q0Var2.setVisibility(8);
            if (this.S2 == null) {
                q0Var.setVisibility(8);
                return;
            }
        }
        if (this.d2) {
            return;
        }
        org.telegram.messenger.c cVar = this.l1;
        int i3 = cVar.a;
        int i10 = cVar.a;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(k1()));
        if (M0 != null) {
            this.R2 = M0;
        }
        boolean y9 = org.telegram.messenger.t3.y(3, this.R2);
        org.telegram.ui.ActionBar.y0 y0Var = this.f3;
        if (y9 || (((!org.telegram.messenger.t3.T(this.R2) || ((chat2 = this.R2) != null && chat2.megagroup)) && (org.telegram.messenger.t3.t0(this.R2) || org.telegram.messenger.t3.y(3, this.R2))) || (org.telegram.messenger.t3.T(this.R2) && (chat = this.R2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
            y0Var.setVisibility(0);
        } else {
            y0Var.setVisibility(8);
        }
        org.telegram.messenger.r3 r3Var3 = this.S2;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.q3;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.p3;
        if (r3Var3 == null || (groupCall2 = r3Var3.b) == null || !groupCall2.can_change_messages_enabled) {
            y0Var3.setVisibility(8);
            y0Var2.setVisibility(8);
        } else {
            y0Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            y0Var2.setVisibility(this.S2.b.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.s2));
        org.telegram.messenger.r3 r3Var4 = this.S2;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.i3;
        if (r3Var4 == null || r3Var4.j() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            y0Var4.setVisibility(8);
        } else {
            y0Var4.setVisibility(0);
        }
        y0Var4.setIcon(org.telegram.messenger.az.I0 ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        y0Var4.setSubtext(org.telegram.messenger.bd.M0(org.telegram.messenger.az.I0 ? 2131743290 : 2131743291, null));
        boolean S0 = S0();
        org.telegram.ui.ActionBar.y0 y0Var5 = this.o3;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.g3;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.k3;
        org.telegram.ui.ActionBar.y0 y0Var8 = this.l3;
        if (S0) {
            y0Var5.setVisibility(0);
            y0Var6.setVisibility(0);
            if (t1()) {
                y0Var7.setVisibility(0);
                y0Var8.setVisibility(8);
            } else if (this.S2.j()) {
                y0Var7.setVisibility(8);
                y0Var8.setVisibility(8);
            } else {
                y0Var7.setVisibility(0);
            }
            if (q1()) {
                y0Var7.setVisibility(8);
                y0Var6.setVisibility(8);
            }
            if (!this.S2.c() || this.S2.j() || t1()) {
                y0Var8.setVisibility(8);
            } else {
                y0Var8.setVisibility(0);
            }
            q0Var2.setVisibility(8);
            boolean z10 = this.S2.w;
            s30 s30Var = this.V2;
            s30Var.f = z10;
            s30Var.d = 1.0f;
            s30Var.invalidateSelf();
            if (this.S2.w) {
                if (this.v3 == null) {
                    p00 p00Var = new p00(this, 6);
                    this.v3 = p00Var;
                    org.telegram.messenger.g0.i3(p00Var, 1000L);
                }
                y0Var7.setText(org.telegram.messenger.bd.M0(2131743333, null));
            } else {
                p00 p00Var2 = this.v3;
                if (p00Var2 != null) {
                    org.telegram.messenger.g0.r(p00Var2);
                    this.v3 = null;
                }
                y0Var7.setText(org.telegram.messenger.bd.M0(2131743358, null));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                y0Var8.j(org.telegram.messenger.bd.M0(2131743446, null), R.drawable.msg_screencast, null);
            } else {
                y0Var8.j(org.telegram.messenger.bd.M0(2131743444, null), R.drawable.msg_screencast_off, null);
            }
            N1();
        } else {
            boolean z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
            boolean z12 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z11 || (!(this.S2.c() || z12) || this.S2.j() || t1())) {
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(8);
            } else if (z12) {
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(0);
                y0Var8.j(org.telegram.messenger.bd.M0(2131743444, null), R.drawable.msg_screencast_off, null);
                y0Var8.setContentDescription(org.telegram.messenger.bd.M0(2131743444, null));
            } else {
                y0Var8.j(org.telegram.messenger.bd.M0(2131743446, null), R.drawable.msg_screencast, null);
                y0Var8.setContentDescription(org.telegram.messenger.bd.M0(2131743446, null));
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(0);
            }
            y0Var5.setVisibility(8);
            y0Var6.setVisibility(8);
            y0Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.y0 y0Var9 = this.j3;
        if (S02 && this.S2.b.can_change_join_muted && !q1()) {
            y0Var9.setVisibility(0);
        } else {
            y0Var9.setVisibility(8);
        }
        q0Var.Q(4, (q1() && ((r3Var = this.S2) == null || (groupCall = r3Var.b) == null || !groupCall.creator)) ? false : true);
        this.h3.setVisibility((!t1() || this.S2.j()) ? 0 : 8);
        int visibility = y0Var6.getVisibility();
        TextView textView = this.s3;
        if (visibility == 0 || y0Var9.getVisibility() == 0 || y0Var.getVisibility() == 0 || y0Var8.getVisibility() == 0 || y0Var7.getVisibility() == 0 || y0Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.c2;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.T2) || t1() || this.s2 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long C1 = org.telegram.messenger.zi.C1(this.s2);
            kVar.setObject(org.telegram.messenger.m5.E(C1) ? org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(C1)) : org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-C1)));
        }
        TLRPC.Chat chat3 = this.R2;
        if (chat3 == null || org.telegram.messenger.t3.W(chat3) || !t1() || y0Var.getVisibility() != 8) {
            q0Var.setVisibility(0);
        } else {
            q0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.b3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.r3.getLayoutParams()).rightMargin = 0;
        this.G1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M1(int i3, boolean z10) {
        boolean P;
        boolean P2;
        String M0;
        String str;
        boolean z11;
        boolean z12;
        boolean P3;
        boolean P4;
        int i10;
        w30[] w30VarArr;
        boolean z13;
        w30 w30Var;
        w30 w30Var2;
        boolean z14;
        boolean z15;
        u10 u10Var = this.S3;
        boolean z16 = u10Var != null && u10Var.b && (org.telegram.messenger.g0.Q1() || x5 == s1());
        if (!t1() && this.x3 == i3 && z10) {
            return;
        }
        org.telegram.ui.Components.ch0 ch0Var = this.B2;
        if (i3 == 7) {
            str = org.telegram.messenger.bd.M0(2131743403, null);
            P4 = ch0Var.P(org.telegram.messenger.hs.g3);
        } else {
            if (i3 != 6) {
                if (i3 != 5) {
                    if (i3 == 0) {
                        String M02 = org.telegram.messenger.bd.M0(2131743327, null);
                        M0 = org.telegram.messenger.bd.M0(2131743311, null);
                        int i11 = this.x3;
                        if (i11 == 3) {
                            int i12 = ch0Var.f;
                            z11 = (i12 == 136 || i12 == 173 || i12 == 274 || i12 == 311) ? ch0Var.P(99) : false;
                        } else {
                            z11 = i11 == 5 ? ch0Var.P(404) : i11 == 7 ? ch0Var.P(376) : i11 == 6 ? ch0Var.P(org.telegram.messenger.hs.M3) : i11 == 2 ? ch0Var.P(36) : ch0Var.P(99);
                        }
                        str = M02;
                    } else if (i3 == 1) {
                        str = org.telegram.messenger.bd.M0(q1() ? 2131743242 : 2131743241, null);
                        P3 = ch0Var.P(this.x3 == 4 ? 99 : 69);
                    } else if (q1() && i3 == 2) {
                        str = org.telegram.messenger.bd.M0(2131743301, null);
                        z11 = ch0Var.P(99);
                        M0 = "";
                    } else {
                        if (i3 != 4) {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.s2));
                            boolean z17 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || S0()) ? false : true;
                            if (z17) {
                                int i13 = this.x3;
                                if (i13 == 7) {
                                    P2 = ch0Var.P(org.telegram.messenger.hs.i5);
                                } else if (i13 == 6) {
                                    P2 = ch0Var.P(org.telegram.messenger.hs.x4);
                                } else if (i13 == 1) {
                                    P2 = ch0Var.P(org.telegram.messenger.hs.D2);
                                } else {
                                    P = ch0Var.P(org.telegram.messenger.hs.S1);
                                }
                                P = P2;
                            } else {
                                int i14 = this.x3;
                                if (i14 == 5) {
                                    P2 = ch0Var.P(404);
                                    P = P2;
                                } else if (i14 == 7) {
                                    P = ch0Var.P(376);
                                } else if (i14 == 6) {
                                    P = ch0Var.P(org.telegram.messenger.hs.M3);
                                } else if (i14 == 2 || i14 == 4) {
                                    P = ch0Var.P(36);
                                } else {
                                    P = ch0Var.P(99);
                                }
                            }
                            if (i3 == 3) {
                                str = org.telegram.messenger.bd.M0(2131751809, null);
                                z11 = P;
                                z12 = z17;
                                M0 = "";
                            } else {
                                String M03 = org.telegram.messenger.bd.M0(2131743301, null);
                                boolean z18 = z17;
                                M0 = org.telegram.messenger.bd.M0(2131743300, null);
                                str = M03;
                                z11 = P;
                                z12 = z18;
                            }
                            if (t1() && i3 != 3 && !this.S2.j()) {
                                str = org.telegram.messenger.bd.M0(!z16 ? 2131743370 : 2131743388, null);
                                boolean z19 = this.y3 == z16;
                                this.y3 = z16;
                                z11 = z19;
                                M0 = "";
                            }
                            String C = TextUtils.isEmpty(M0) ? a1.g.C(str, " ", M0) : str;
                            org.telegram.ui.Components.voip.c2 c2Var = this.t1;
                            c2Var.setContentDescription(C);
                            c2Var.c(0, 0, 0, 1.0f, true, str, false, z10);
                            i10 i10Var = this.u1;
                            ImageView imageView = this.v1;
                            if (z10) {
                                this.x3 = i3;
                                ch0Var.N(ch0Var.f - 1, false, true);
                                if (!t1() || this.S2.j()) {
                                    imageView.setVisibility(8);
                                    i10Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((u10Var != null && u10Var.b && (org.telegram.messenger.g0.Q1() || x5 == s1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    i10Var.setVisibility(8);
                                }
                            } else {
                                if (z11) {
                                    if (i3 == 5) {
                                        ch0Var.M(376);
                                    } else if (i3 == 7) {
                                        ch0Var.M(org.telegram.messenger.hs.D2);
                                    } else if (i3 == 6) {
                                        ch0Var.M(org.telegram.messenger.hs.i5);
                                    } else if (i3 == 0) {
                                        int i15 = this.x3;
                                        if (i15 == 5) {
                                            ch0Var.M(376);
                                        } else if (i15 == 7) {
                                            ch0Var.M(org.telegram.messenger.hs.P5);
                                        } else if (i15 == 6) {
                                            ch0Var.M(org.telegram.messenger.hs.g3);
                                        } else if (i15 == 2) {
                                            ch0Var.M(0);
                                        } else {
                                            ch0Var.M(69);
                                        }
                                    } else if (i3 == 1 || (this.x3 == 2 && q1())) {
                                        ch0Var.M(this.x3 != 4 ? 36 : 69);
                                    } else if (i3 == 4) {
                                        ch0Var.M(99);
                                    } else if (z12) {
                                        int i16 = this.x3;
                                        if (i16 == 7) {
                                            ch0Var.M(org.telegram.messenger.hs.x4);
                                        } else if (i16 == 6) {
                                            ch0Var.M(org.telegram.messenger.hs.M3);
                                        } else if (i16 == 1) {
                                            ch0Var.M(org.telegram.messenger.hs.S1);
                                        } else {
                                            ch0Var.M(99);
                                        }
                                    } else {
                                        int i17 = this.x3;
                                        if (i17 == 5) {
                                            ch0Var.M(376);
                                        } else if (i17 == 7) {
                                            ch0Var.M(org.telegram.messenger.hs.P5);
                                        } else if (i17 == 6) {
                                            ch0Var.M(org.telegram.messenger.hs.g3);
                                        } else if (i17 == 2 || i17 == 4) {
                                            ch0Var.M(0);
                                        } else {
                                            ch0Var.M(69);
                                        }
                                    }
                                }
                                i10Var.d();
                                if (!t1() || this.S2.j()) {
                                    imageView.setVisibility(8);
                                    i10Var.setVisibility(0);
                                } else {
                                    imageView.setImageResource((u10Var != null && u10Var.b && (org.telegram.messenger.g0.Q1() || x5 == s1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    imageView.setVisibility(0);
                                    i10Var.setVisibility(8);
                                }
                                this.x3 = i3;
                            }
                            c2Var.invalidate();
                            i10 = this.x3;
                            w30VarArr = this.C3;
                            if (w30VarArr[i10] == null) {
                                w30VarArr[i10] = new w30(i10);
                                int i18 = this.x3;
                                if (i18 == 3) {
                                    w30VarArr[i18].g = null;
                                } else if (r1(i18)) {
                                    w30VarArr[this.x3].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    int i19 = this.x3;
                                    if (i19 != 1) {
                                        z13 = false;
                                        w30VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                        w30Var = w30VarArr[this.x3];
                                        w30Var2 = this.F3;
                                        if (w30Var != w30Var2) {
                                            this.E3 = w30Var2;
                                            this.F3 = w30Var;
                                            if (w30Var2 == null || !z10) {
                                                this.D3 = 1.0f;
                                                this.E3 = null;
                                            } else {
                                                this.D3 = 0.0f;
                                            }
                                        }
                                        if (!z10) {
                                            w30 w30Var3 = this.F3;
                                            if (w30Var3 != null) {
                                                int i20 = w30Var3.i;
                                                z15 = true;
                                                z14 = (i20 == 1 || i20 == 0) ? true : z13;
                                                if (i20 == 3) {
                                                    z15 = z13;
                                                }
                                            } else {
                                                z14 = z13;
                                                z15 = z14;
                                            }
                                            this.H3 = z14 ? 1.0f : 0.0f;
                                            this.I3 = z15 ? 1.0f : 0.0f;
                                        }
                                        this.m1.invalidate();
                                    }
                                    w30VarArr[i19].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.th, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                                }
                            }
                            z13 = false;
                            w30Var = w30VarArr[this.x3];
                            w30Var2 = this.F3;
                            if (w30Var != w30Var2) {
                            }
                            if (!z10) {
                            }
                            this.m1.invalidate();
                        }
                        str = org.telegram.messenger.bd.M0(2131743297, null);
                        String M04 = org.telegram.messenger.bd.M0(2131743298, null);
                        z11 = ch0Var.P(org.telegram.messenger.hs.S1);
                        M0 = M04;
                    }
                    z12 = false;
                    if (t1()) {
                        str = org.telegram.messenger.bd.M0(!z16 ? 2131743370 : 2131743388, null);
                        if (this.y3 == z16) {
                        }
                        this.y3 = z16;
                        z11 = z19;
                        M0 = "";
                    }
                    if (TextUtils.isEmpty(M0)) {
                    }
                    org.telegram.ui.Components.voip.c2 c2Var2 = this.t1;
                    c2Var2.setContentDescription(C);
                    c2Var2.c(0, 0, 0, 1.0f, true, str, false, z10);
                    i10 i10Var2 = this.u1;
                    ImageView imageView2 = this.v1;
                    if (z10) {
                    }
                    c2Var2.invalidate();
                    i10 = this.x3;
                    w30VarArr = this.C3;
                    if (w30VarArr[i10] == null) {
                    }
                    z13 = false;
                    w30Var = w30VarArr[this.x3];
                    w30Var2 = this.F3;
                    if (w30Var != w30Var2) {
                    }
                    if (!z10) {
                    }
                    this.m1.invalidate();
                }
                str = org.telegram.messenger.bd.M0(2131743340, null);
                P3 = ch0Var.P(377);
                z11 = P3;
                M0 = "";
                z12 = false;
                if (t1()) {
                }
                if (TextUtils.isEmpty(M0)) {
                }
                org.telegram.ui.Components.voip.c2 c2Var22 = this.t1;
                c2Var22.setContentDescription(C);
                c2Var22.c(0, 0, 0, 1.0f, true, str, false, z10);
                i10 i10Var22 = this.u1;
                ImageView imageView22 = this.v1;
                if (z10) {
                }
                c2Var22.invalidate();
                i10 = this.x3;
                w30VarArr = this.C3;
                if (w30VarArr[i10] == null) {
                }
                z13 = false;
                w30Var = w30VarArr[this.x3];
                w30Var2 = this.F3;
                if (w30Var != w30Var2) {
                }
                if (!z10) {
                }
                this.m1.invalidate();
            }
            str = org.telegram.messenger.bd.M0(2131743348, null);
            P4 = ch0Var.P(org.telegram.messenger.hs.P5);
        }
        M0 = "";
        z11 = P4;
        z12 = false;
        if (t1()) {
        }
        if (TextUtils.isEmpty(M0)) {
        }
        org.telegram.ui.Components.voip.c2 c2Var222 = this.t1;
        c2Var222.setContentDescription(C);
        c2Var222.c(0, 0, 0, 1.0f, true, str, false, z10);
        i10 i10Var222 = this.u1;
        ImageView imageView222 = this.v1;
        if (z10) {
        }
        c2Var222.invalidate();
        i10 = this.x3;
        w30VarArr = this.C3;
        if (w30VarArr[i10] == null) {
        }
        z13 = false;
        w30Var = w30VarArr[this.x3];
        w30Var2 = this.F3;
        if (w30Var != w30Var2) {
        }
        if (!z10) {
        }
        this.m1.invalidate();
    }

    public final void N1() {
        if (this.S2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.l1.a).getCurrentTime();
        org.telegram.messenger.r3 r3Var = this.S2;
        int i3 = currentTime - r3Var.b.record_start_date;
        boolean z10 = r3Var.w;
        org.telegram.ui.ActionBar.y0 y0Var = this.k3;
        if (z10) {
            y0Var.setSubtext(org.telegram.messenger.g0.g0(i3, false, false));
        } else {
            y0Var.setSubtext(null);
        }
    }

    public final void O1(boolean z10) {
        float interpolation;
        float f10;
        l20 l20Var = this.J1;
        if ((l20Var == null || this.S2 != null) && this.P2 == null) {
            this.O2 = 1.0f;
            this.N2 = 1.0f;
            if (l20Var == null) {
                return;
            }
        }
        if (!z10) {
            l10 l10Var = this.o4;
            org.telegram.messenger.g0.r(l10Var);
            l10Var.run();
            org.telegram.messenger.r3 r3Var = this.S2;
            f30 f30Var = this.I1;
            if (r3Var == null || r3Var.j()) {
                f30Var.setVisibility(4);
            } else {
                f30Var.setVisibility(0);
            }
            boolean W = org.telegram.messenger.t3.W(this.R2);
            org.telegram.ui.ActionBar.y0 y0Var = this.o3;
            if (W) {
                y0Var.setText(org.telegram.messenger.bd.M0(2131743498, null));
            } else {
                y0Var.setText(org.telegram.messenger.bd.M0(2131743405, null));
            }
        }
        float f11 = this.N2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.xq.f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.O2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
            this.O2 = xqVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * xqVar.getInterpolation(this.N2 / 0.6f);
            f10 = this.N2 / 0.6f;
        }
        K1(true);
        float f12 = 1.0f - f10;
        l20Var.setAlpha(f12);
        this.M1.setAlpha(f10);
        this.O1.setAlpha(f10);
        e30 e30Var = this.N1;
        e30Var.setAlpha(f10);
        e30Var.setScaleX(interpolation);
        e30Var.setScaleY(interpolation);
        j20 j20Var = this.L1;
        j20Var.setScaleX(f12);
        j20Var.setScaleY(f12);
        j20Var.setAlpha(f12);
        this.K1.setAlpha(f12);
        this.c3.setAlpha(f10);
        int i3 = f12 != 0.0f ? 0 : 4;
        if (i3 != l20Var.getVisibility()) {
            l20Var.setVisibility(i3);
            j20Var.setVisibility(i3);
        }
    }

    public final void P1(boolean z10) {
        org.telegram.ui.Components.voip.c2 c2Var = this.q1;
        if (c2Var == null || c2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        h10 h10Var = this.m1;
        if (sharedInstance == null || t1()) {
            c2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, org.telegram.messenger.bd.M0(2131743447, null), false, z10);
            boolean z11 = org.telegram.messenger.t3.t0(this.R2) || (org.telegram.messenger.t3.N(this.R2) && org.telegram.messenger.t3.w(3, this.R2));
            nh.a aVar = (nh.a) h10Var.c.get(c2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                c2Var.setEnabled(z11);
            }
            c2Var.b(true, false);
            return;
        }
        nh.a aVar2 = (nh.a) h10Var.c.get(c2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            c2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            c2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743513, null), false, z10);
        } else if (z13) {
            c2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            c2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743511, null), false, z10);
        } else {
            c2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z10);
        }
        c2Var.b(z13, z10);
        j1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i3 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.S1 != i3) {
            this.S1 = i3;
            org.telegram.messenger.g0.R3(this.T1, i3);
        }
        org.telegram.ui.Components.voip.c2 c2Var2 = this.o1;
        if (c2Var2.getVisibility() == 0) {
            c2Var2.c(0, -1, 0, 1.0f, true, h1(j1()), false, z10);
            c2Var2.b(j1() != 1, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b7 A[LOOP:3: B:140:0x02b1->B:142:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5 A[LOOP:1: B:89:0x01a3->B:90:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z10) {
        f30 f30Var;
        r30 r30Var;
        u10 u10Var;
        f30 f30Var2;
        boolean z11;
        int i3;
        ArrayList arrayList;
        int i10;
        int size;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        f30 f30Var3;
        u10 u10Var2;
        boolean z12;
        q10 q10Var;
        ?? r02;
        ?? r82;
        org.telegram.messenger.r3 r3Var;
        boolean z13;
        org.telegram.messenger.s3 s3Var;
        org.telegram.messenger.s3 s3Var2;
        u4.d1 G;
        f fVar;
        int i14;
        x30 x30Var = this;
        r30 r30Var2 = x30Var.H1;
        u10 u10Var3 = x30Var.S3;
        if (u10Var3 == null || (f30Var = x30Var.I1) == null || x30Var.S2 == null || x30Var.k2) {
            return;
        }
        if (u10Var3.b) {
            u10Var3.setVisibleParticipant(true);
        }
        long C1 = org.telegram.messenger.zi.C1(x30Var.S2.J);
        if (C1 != org.telegram.messenger.zi.C1(x30Var.s2) && x30Var.S2.d.f(C1) != null) {
            x30Var.s2 = x30Var.S2.J;
        }
        int childCount = f30Var.getChildCount();
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = f30Var.getChildAt(i17);
            u4.d1 G2 = f30Var.G(childAt);
            if (G2 != null && G2.b() != -1 && G2.c() != -1 && (view == null || childAt.getTop() < i15)) {
                i16 = G2.c();
                i15 = childAt.getTop();
                view = childAt;
            }
        }
        ArrayList arrayList3 = x30Var.i2;
        arrayList3.clear();
        if (!y5) {
            arrayList3.addAll(x30Var.S2.f);
        } else if (u10Var3.b) {
            arrayList3.addAll(x30Var.S2.f);
            org.telegram.messenger.s3 s3Var3 = u10Var3.e;
            if (s3Var3 != null) {
                arrayList3.remove(s3Var3);
            }
        }
        if (f30Var.getItemAnimator() != null && !z10) {
            f30Var.setItemAnimator(null);
        } else if (f30Var.getItemAnimator() == null && z10) {
            f30Var.setItemAnimator(x30Var.P1);
        }
        try {
            fVar = new f(r30Var2, 18);
            try {
                try {
                    z11 = true;
                } catch (Exception e10) {
                    e = e10;
                    r30Var = r30Var2;
                    z11 = true;
                }
            } catch (Exception e11) {
                e = e11;
                r30Var = r30Var2;
                f30Var2 = f30Var;
                z11 = true;
                i3 = childCount;
                arrayList = arrayList3;
                i10 = i16;
                u10Var = u10Var3;
            }
        } catch (Exception e12) {
            e = e12;
            r30Var = r30Var2;
            u10Var = u10Var3;
            f30Var2 = f30Var;
            z11 = true;
            i3 = childCount;
            arrayList = arrayList3;
            i10 = i16;
        }
        try {
            try {
                try {
                    i14 = i16;
                    try {
                        u10Var = u10Var3;
                    } catch (Exception e13) {
                        e = e13;
                        u10Var = u10Var3;
                    }
                } catch (Exception e14) {
                    e = e14;
                    i10 = i16;
                    u10Var = u10Var3;
                    f30Var2 = f30Var;
                    i3 = childCount;
                    arrayList = arrayList3;
                }
            } catch (Exception e15) {
                e = e15;
                r30Var = r30Var2;
                arrayList = arrayList3;
                i10 = i16;
                u10Var = u10Var3;
                f30Var2 = f30Var;
                i3 = childCount;
            }
        } catch (Exception e16) {
            e = e16;
            r30Var = r30Var2;
            i3 = childCount;
            arrayList = arrayList3;
            i10 = i16;
            u10Var = u10Var3;
            f30Var2 = f30Var;
            org.telegram.messenger.a8.g(e, z11);
            r30Var.f();
            ArrayList arrayList4 = x30Var.S2.e;
            size = arrayList4.size();
            while (i11 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList5 = x30Var.v2;
            arrayList5.clear();
            arrayList5.addAll(x30Var.S2.g);
            ArrayList arrayList6 = x30Var.w2;
            arrayList6.clear();
            arrayList2 = arrayList;
            arrayList6.addAll(arrayList2);
            ArrayList arrayList7 = x30Var.x2;
            arrayList7.clear();
            arrayList7.addAll(x30Var.S2.j);
            ArrayList arrayList8 = x30Var.y2;
            arrayList8.clear();
            arrayList8.addAll(x30Var.S2.m);
            ArrayList arrayList9 = x30Var.z2;
            arrayList9.clear();
            arrayList9.addAll(x30Var.S2.l);
            r30 r30Var3 = r30Var;
            x30Var.A2 = r30Var3.G;
            i12 = i3;
            i13 = 0;
            while (i13 < i12) {
            }
            f30Var3 = f30Var2;
            boolean c2 = u10Var.c();
            u10Var2 = u10Var;
            if (u10Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.e10 e10Var = x30Var.h4;
            q10Var = x30Var.e4;
            e10Var.G(q10Var, z11);
            if (q10Var.getVisibility() == 0) {
            }
            if (y5) {
            }
            if (f30Var3.getVisibility() == 0) {
            }
            r02 = x30Var.R3;
            r02.clear();
            r02.addAll(x30Var.Q3);
            while (r82 < r02.size()) {
            }
            r3Var = x30Var.S2;
            if (r3Var != null) {
            }
            org.telegram.messenger.r3 r3Var2 = x30Var.S2;
            if (r3Var2 != null) {
            }
            x30Var.u5.a(z13, z10);
            if (z13 == x30Var.A4) {
            }
        }
        try {
            f30Var2 = f30Var;
            try {
                try {
                    try {
                    } catch (Exception e17) {
                        e = e17;
                    }
                } catch (Exception e18) {
                    e = e18;
                    i3 = childCount;
                    arrayList = arrayList3;
                    i10 = i14;
                    z11 = true;
                }
                try {
                    arrayList = arrayList3;
                    i10 = i14;
                    i3 = childCount;
                    x30Var = this;
                    r30Var = r30Var2;
                    try {
                        x30Var.F1(r30Var2.L, r30Var2.x, r30Var2.d, r30Var2.e, r30Var2.f, r30Var2.h, r30Var2.n, r30Var2.r, r30Var2.s, r30Var2.w, r30Var2.H, r30Var2.I, r30Var2.J, r30Var2.K, r30Var2.y, r30Var2.E);
                        r30Var.E();
                        z11 = true;
                        try {
                            u4.o.c(x30Var.o5, true).b(fVar);
                        } catch (Exception e19) {
                            e = e19;
                            org.telegram.messenger.a8.g(e, z11);
                            r30Var.f();
                            ArrayList arrayList42 = x30Var.S2.e;
                            size = arrayList42.size();
                            while (i11 < size) {
                            }
                            if (view != null) {
                            }
                            ArrayList arrayList52 = x30Var.v2;
                            arrayList52.clear();
                            arrayList52.addAll(x30Var.S2.g);
                            ArrayList arrayList62 = x30Var.w2;
                            arrayList62.clear();
                            arrayList2 = arrayList;
                            arrayList62.addAll(arrayList2);
                            ArrayList arrayList72 = x30Var.x2;
                            arrayList72.clear();
                            arrayList72.addAll(x30Var.S2.j);
                            ArrayList arrayList82 = x30Var.y2;
                            arrayList82.clear();
                            arrayList82.addAll(x30Var.S2.m);
                            ArrayList arrayList92 = x30Var.z2;
                            arrayList92.clear();
                            arrayList92.addAll(x30Var.S2.l);
                            r30 r30Var32 = r30Var;
                            x30Var.A2 = r30Var32.G;
                            i12 = i3;
                            i13 = 0;
                            while (i13 < i12) {
                            }
                            f30Var3 = f30Var2;
                            boolean c22 = u10Var.c();
                            u10Var2 = u10Var;
                            if (u10Var2.b) {
                                if (!arrayList2.isEmpty()) {
                                }
                                org.telegram.ui.Components.e10 e10Var2 = x30Var.h4;
                                q10Var = x30Var.e4;
                                e10Var2.G(q10Var, z11);
                                if (q10Var.getVisibility() == 0) {
                                }
                                if (y5) {
                                }
                                if (f30Var3.getVisibility() == 0) {
                                }
                                r02 = x30Var.R3;
                                r02.clear();
                                r02.addAll(x30Var.Q3);
                                while (r82 < r02.size()) {
                                }
                                r3Var = x30Var.S2;
                                if (r3Var != null) {
                                }
                                org.telegram.messenger.r3 r3Var22 = x30Var.S2;
                                if (r3Var22 != null) {
                                }
                                x30Var.u5.a(z13, z10);
                                if (z13 == x30Var.A4) {
                                }
                            }
                            z12 = false;
                            org.telegram.ui.Components.e10 e10Var22 = x30Var.h4;
                            q10Var = x30Var.e4;
                            e10Var22.G(q10Var, z11);
                            if (q10Var.getVisibility() == 0) {
                            }
                            if (y5) {
                            }
                            if (f30Var3.getVisibility() == 0) {
                            }
                            r02 = x30Var.R3;
                            r02.clear();
                            r02.addAll(x30Var.Q3);
                            while (r82 < r02.size()) {
                            }
                            r3Var = x30Var.S2;
                            if (r3Var != null) {
                            }
                            org.telegram.messenger.r3 r3Var222 = x30Var.S2;
                            if (r3Var222 != null) {
                            }
                            x30Var.u5.a(z13, z10);
                            if (z13 == x30Var.A4) {
                            }
                        }
                    } catch (Exception e20) {
                        e = e20;
                        z11 = true;
                    }
                } catch (Exception e21) {
                    e = e21;
                    x30Var = this;
                    arrayList = arrayList3;
                    i10 = i14;
                    z11 = true;
                    i3 = childCount;
                    r30Var = r30Var2;
                    org.telegram.messenger.a8.g(e, z11);
                    r30Var.f();
                    ArrayList arrayList422 = x30Var.S2.e;
                    size = arrayList422.size();
                    while (i11 < size) {
                    }
                    if (view != null) {
                    }
                    ArrayList arrayList522 = x30Var.v2;
                    arrayList522.clear();
                    arrayList522.addAll(x30Var.S2.g);
                    ArrayList arrayList622 = x30Var.w2;
                    arrayList622.clear();
                    arrayList2 = arrayList;
                    arrayList622.addAll(arrayList2);
                    ArrayList arrayList722 = x30Var.x2;
                    arrayList722.clear();
                    arrayList722.addAll(x30Var.S2.j);
                    ArrayList arrayList822 = x30Var.y2;
                    arrayList822.clear();
                    arrayList822.addAll(x30Var.S2.m);
                    ArrayList arrayList922 = x30Var.z2;
                    arrayList922.clear();
                    arrayList922.addAll(x30Var.S2.l);
                    r30 r30Var322 = r30Var;
                    x30Var.A2 = r30Var322.G;
                    i12 = i3;
                    i13 = 0;
                    while (i13 < i12) {
                    }
                    f30Var3 = f30Var2;
                    boolean c222 = u10Var.c();
                    u10Var2 = u10Var;
                    if (u10Var2.b) {
                    }
                    z12 = false;
                    org.telegram.ui.Components.e10 e10Var222 = x30Var.h4;
                    q10Var = x30Var.e4;
                    e10Var222.G(q10Var, z11);
                    if (q10Var.getVisibility() == 0) {
                    }
                    if (y5) {
                    }
                    if (f30Var3.getVisibility() == 0) {
                    }
                    r02 = x30Var.R3;
                    r02.clear();
                    r02.addAll(x30Var.Q3);
                    while (r82 < r02.size()) {
                    }
                    r3Var = x30Var.S2;
                    if (r3Var != null) {
                    }
                    org.telegram.messenger.r3 r3Var2222 = x30Var.S2;
                    if (r3Var2222 != null) {
                    }
                    x30Var.u5.a(z13, z10);
                    if (z13 == x30Var.A4) {
                    }
                }
            } catch (Exception e22) {
                e = e22;
                i3 = childCount;
                arrayList = arrayList3;
                i10 = i14;
                r30Var = r30Var2;
                org.telegram.messenger.a8.g(e, z11);
                r30Var.f();
                ArrayList arrayList4222 = x30Var.S2.e;
                size = arrayList4222.size();
                while (i11 < size) {
                }
                if (view != null) {
                }
                ArrayList arrayList5222 = x30Var.v2;
                arrayList5222.clear();
                arrayList5222.addAll(x30Var.S2.g);
                ArrayList arrayList6222 = x30Var.w2;
                arrayList6222.clear();
                arrayList2 = arrayList;
                arrayList6222.addAll(arrayList2);
                ArrayList arrayList7222 = x30Var.x2;
                arrayList7222.clear();
                arrayList7222.addAll(x30Var.S2.j);
                ArrayList arrayList8222 = x30Var.y2;
                arrayList8222.clear();
                arrayList8222.addAll(x30Var.S2.m);
                ArrayList arrayList9222 = x30Var.z2;
                arrayList9222.clear();
                arrayList9222.addAll(x30Var.S2.l);
                r30 r30Var3222 = r30Var;
                x30Var.A2 = r30Var3222.G;
                i12 = i3;
                i13 = 0;
                while (i13 < i12) {
                }
                f30Var3 = f30Var2;
                boolean c2222 = u10Var.c();
                u10Var2 = u10Var;
                if (u10Var2.b) {
                }
                z12 = false;
                org.telegram.ui.Components.e10 e10Var2222 = x30Var.h4;
                q10Var = x30Var.e4;
                e10Var2222.G(q10Var, z11);
                if (q10Var.getVisibility() == 0) {
                }
                if (y5) {
                }
                if (f30Var3.getVisibility() == 0) {
                }
                r02 = x30Var.R3;
                r02.clear();
                r02.addAll(x30Var.Q3);
                while (r82 < r02.size()) {
                }
                r3Var = x30Var.S2;
                if (r3Var != null) {
                }
                org.telegram.messenger.r3 r3Var22222 = x30Var.S2;
                if (r3Var22222 != null) {
                }
                x30Var.u5.a(z13, z10);
                if (z13 == x30Var.A4) {
                }
            }
        } catch (Exception e23) {
            e = e23;
            f30Var2 = f30Var;
            i3 = childCount;
            arrayList = arrayList3;
            i10 = i14;
            r30Var = r30Var2;
            org.telegram.messenger.a8.g(e, z11);
            r30Var.f();
            ArrayList arrayList42222 = x30Var.S2.e;
            size = arrayList42222.size();
            while (i11 < size) {
            }
            if (view != null) {
            }
            ArrayList arrayList52222 = x30Var.v2;
            arrayList52222.clear();
            arrayList52222.addAll(x30Var.S2.g);
            ArrayList arrayList62222 = x30Var.w2;
            arrayList62222.clear();
            arrayList2 = arrayList;
            arrayList62222.addAll(arrayList2);
            ArrayList arrayList72222 = x30Var.x2;
            arrayList72222.clear();
            arrayList72222.addAll(x30Var.S2.j);
            ArrayList arrayList82222 = x30Var.y2;
            arrayList82222.clear();
            arrayList82222.addAll(x30Var.S2.m);
            ArrayList arrayList92222 = x30Var.z2;
            arrayList92222.clear();
            arrayList92222.addAll(x30Var.S2.l);
            r30 r30Var32222 = r30Var;
            x30Var.A2 = r30Var32222.G;
            i12 = i3;
            i13 = 0;
            while (i13 < i12) {
            }
            f30Var3 = f30Var2;
            boolean c22222 = u10Var.c();
            u10Var2 = u10Var;
            if (u10Var2.b) {
            }
            z12 = false;
            org.telegram.ui.Components.e10 e10Var22222 = x30Var.h4;
            q10Var = x30Var.e4;
            e10Var22222.G(q10Var, z11);
            if (q10Var.getVisibility() == 0) {
            }
            if (y5) {
            }
            if (f30Var3.getVisibility() == 0) {
            }
            r02 = x30Var.R3;
            r02.clear();
            r02.addAll(x30Var.Q3);
            while (r82 < r02.size()) {
            }
            r3Var = x30Var.S2;
            if (r3Var != null) {
            }
            org.telegram.messenger.r3 r3Var222222 = x30Var.S2;
            if (r3Var222222 != null) {
            }
            x30Var.u5.a(z13, z10);
            if (z13 == x30Var.A4) {
            }
        }
        ArrayList arrayList422222 = x30Var.S2.e;
        size = arrayList422222.size();
        for (i11 = 0; i11 < size; i11++) {
            ((TLRPC.GroupCallParticipant) arrayList422222.get(i11)).lastActiveDate = r3.active_date;
        }
        if (view != null) {
            x30Var.Q1.h1(i10, view.getTop() - f30Var2.getPaddingTop());
        }
        ArrayList arrayList522222 = x30Var.v2;
        arrayList522222.clear();
        arrayList522222.addAll(x30Var.S2.g);
        ArrayList arrayList622222 = x30Var.w2;
        arrayList622222.clear();
        arrayList2 = arrayList;
        arrayList622222.addAll(arrayList2);
        ArrayList arrayList722222 = x30Var.x2;
        arrayList722222.clear();
        arrayList722222.addAll(x30Var.S2.j);
        ArrayList arrayList822222 = x30Var.y2;
        arrayList822222.clear();
        arrayList822222.addAll(x30Var.S2.m);
        ArrayList arrayList922222 = x30Var.z2;
        arrayList922222.clear();
        arrayList922222.addAll(x30Var.S2.l);
        r30 r30Var322222 = r30Var;
        x30Var.A2 = r30Var322222.G;
        i12 = i3;
        i13 = 0;
        while (i13 < i12) {
            f30 f30Var4 = f30Var2;
            View childAt2 = f30Var4.getChildAt(i13);
            if (((childAt2 instanceof org.telegram.ui.Cells.f4) || (childAt2 instanceof org.telegram.ui.Cells.y3)) && (G = f30Var4.G(childAt2)) != null) {
                if (childAt2 instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt2).setDrawDivider(G.b() != r30Var322222.G + (-2) ? z11 : false);
                } else {
                    ((org.telegram.ui.Cells.y3) childAt2).setDrawDivider(G.b() != r30Var322222.G + (-2) ? z11 : false);
                }
            }
            i13++;
            f30Var2 = f30Var4;
        }
        f30Var3 = f30Var2;
        boolean c222222 = u10Var.c();
        u10Var2 = u10Var;
        if (u10Var2.b && (s3Var2 = u10Var2.e) != null && !org.telegram.messenger.r3.C(s3Var2.a, s3Var2.b, x30Var.S2)) {
            if (!arrayList2.isEmpty()) {
                z12 = false;
                x30Var.g1(null);
            } else if (c222222) {
                z12 = false;
                x30Var.g1((org.telegram.messenger.s3) arrayList2.get(0));
            }
            org.telegram.ui.Components.e10 e10Var222222 = x30Var.h4;
            q10Var = x30Var.e4;
            e10Var222222.G(q10Var, z11);
            if (q10Var.getVisibility() == 0) {
                org.telegram.messenger.g0.b4(q10Var);
            }
            if (y5) {
                x30Var.g4.I(x30Var.f4, z11);
            }
            if (f30Var3.getVisibility() == 0) {
                org.telegram.messenger.g0.b4(f30Var3);
            }
            r02 = x30Var.R3;
            r02.clear();
            r02.addAll(x30Var.Q3);
            for (r82 = z12; r82 < r02.size(); r82++) {
                ((org.telegram.ui.Components.voip.r) r02.get(r82)).j(z11);
            }
            r3Var = x30Var.S2;
            if (r3Var != null && u10Var2.b && (s3Var = u10Var2.e) != null) {
                r3Var.d.f(org.telegram.messenger.zi.C1(s3Var.a.peer));
            }
            org.telegram.messenger.r3 r3Var2222222 = x30Var.S2;
            z13 = (r3Var2222222 != null || r3Var2222222.f.isEmpty()) ? z12 : z11;
            x30Var.u5.a(z13, z10);
            if (z13 == x30Var.A4) {
                x30Var.A4 = z13;
                if (y5) {
                    x30Var.b.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z12 = false;
        org.telegram.ui.Components.e10 e10Var2222222 = x30Var.h4;
        q10Var = x30Var.e4;
        e10Var2222222.G(q10Var, z11);
        if (q10Var.getVisibility() == 0) {
        }
        if (y5) {
        }
        if (f30Var3.getVisibility() == 0) {
        }
        r02 = x30Var.R3;
        r02.clear();
        r02.addAll(x30Var.Q3);
        while (r82 < r02.size()) {
        }
        r3Var = x30Var.S2;
        if (r3Var != null) {
            r3Var.d.f(org.telegram.messenger.zi.C1(s3Var.a.peer));
        }
        org.telegram.messenger.r3 r3Var22222222 = x30Var.S2;
        if (r3Var22222222 != null) {
        }
        x30Var.u5.a(z13, z10);
        if (z13 == x30Var.A4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
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
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1(boolean z10, boolean z11) {
        long j10;
        int i3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        int i11;
        boolean z18;
        org.telegram.ui.Components.voip.c2 c2Var;
        org.telegram.ui.Components.voip.c2 c2Var2;
        org.telegram.ui.Components.voip.c2 c2Var3;
        boolean z19;
        boolean t12;
        int i12;
        org.telegram.messenger.r3 r3Var = this.S2;
        org.telegram.ui.Components.voip.c2 c2Var4 = this.r1;
        int i13 = 6;
        if (r3Var == null || r3Var.j()) {
            if (S0()) {
                i13 = 5;
            } else if (this.S2.b.schedule_start_subscribed) {
                i13 = 7;
            }
            M1(i13, z10);
            c2Var4.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.rh, false), 0.3f, false, org.telegram.messenger.bd.M0(2131752041, null), false, false);
            O1(false);
            return;
        }
        K1(z10);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isConverting() || sharedInstance.isSwitchingStream()) {
            j10 = 0;
        } else {
            j10 = 0;
            if ((this.l2 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.l2) > 3000) && ((i12 = this.L3) == 1 || i12 == 2 || i12 == 6 || i12 == 5)) {
                T0();
                M1(3, z10);
                i3 = 4;
                z12 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.s2));
                z13 = groupCallParticipant == null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0();
                if (!((z13 && this.S2.c()) || z12) || t1()) {
                    z14 = false;
                    z15 = true;
                } else {
                    z15 = false;
                    z14 = true;
                }
                if (z12) {
                    z16 = !z13;
                    i10 = 0;
                } else {
                    z16 = false;
                    i10 = 1;
                }
                if (x5) {
                    z17 = z16;
                    i11 = i10;
                } else {
                    z17 = false;
                    i11 = 0;
                }
                int i14 = i11 + (!z15 ? 2 : 0) + (!z14 ? i3 : 0);
                u10 u10Var = this.S3;
                int i15 = i14 + ((u10Var == null && u10Var.b) ? 8 : 0) + (!z17 ? 16 : 0);
                z18 = (this.g2 | 2) == (i15 | 2);
                this.g2 = i15;
                boolean z20 = z12;
                org.telegram.ui.Components.voip.c2 c2Var5 = this.p1;
                if (z14) {
                    c2Var5.c(R.drawable.calls_video, -1, 0, 1.0f, true, org.telegram.messenger.bd.M0(2131743499, null), !z20, z10);
                    c2Var5.b(true, false);
                }
                org.telegram.ui.Components.voip.c2 c2Var6 = this.n1;
                if (i11 != 0) {
                    c2Var6.c(0, -1, 0, 1.0f, true, org.telegram.messenger.bd.M0(2131743416, null), false, false);
                    c2Var6.b(true, false);
                }
                org.telegram.ui.Components.voip.c2 c2Var7 = this.o1;
                if (z17) {
                    c2Var = c2Var6;
                    c2Var2 = c2Var5;
                    c2Var3 = c2Var7;
                    z19 = z10;
                } else {
                    j1();
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    int i16 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
                    if (this.S1 != i16) {
                        this.S1 = i16;
                        org.telegram.messenger.g0.R3(this.T1, i16);
                    }
                    c2Var2 = c2Var5;
                    c2Var = c2Var6;
                    c2Var7.c(0, -1, 0, 1.0f, true, h1(j1()), false, z10);
                    c2Var3 = c2Var7;
                    z19 = z10;
                    c2Var3.b(j1() != 1, z19);
                }
                org.telegram.ui.Components.voip.c2 c2Var8 = c2Var3;
                c2Var4.c(!t1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.rh, false), 0.3f, false, org.telegram.messenger.bd.M0(2131743374, null), false, false);
                if (z18 && z15) {
                    P1(false);
                }
                c2Var2.d(true, z19);
                c2Var.d(true, z19);
                c2Var8.d(true, z19);
                t12 = t1();
                o10 o10Var = this.X2;
                if (t12) {
                    o10Var.setVisibility(8);
                } else {
                    o10Var.setVisibility(0);
                    boolean z21 = ((Integer) o10Var.getTag()).intValue() == 3;
                    int i17 = this.L3;
                    final boolean z22 = i17 == 3;
                    o10Var.setTag(Integer.valueOf(i17));
                    if (z21 != z22) {
                        ValueAnimator valueAnimator = this.Z2;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        Paint paint = this.Y2;
                        if (z19) {
                            final int color = paint.getColor();
                            final int i18 = z22 ? -1163700 : -12761513;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.Z2 = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.u00
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    int S0 = org.telegram.messenger.g0.S0(floatValue, 1.0f, color, i18);
                                    x30 x30Var = x30.this;
                                    x30Var.Y2.setColor(S0);
                                    x30Var.X2.invalidate();
                                    if (!z22) {
                                        floatValue = 1.0f - floatValue;
                                    }
                                    x30Var.a3 = floatValue;
                                    m30 m30Var = x30Var.M2;
                                    if (m30Var == null || !x30Var.r4) {
                                        return;
                                    }
                                    m30Var.invalidate();
                                }
                            });
                            this.Z2.setDuration(300L);
                            this.Z2.setInterpolator(org.telegram.ui.Components.xq.f);
                            this.Z2.addListener(new s20(this, 2));
                            this.Z2.start();
                        } else {
                            paint.setColor(this.L3 == 3 ? -1163700 : -12761513);
                            o10Var.invalidate();
                        }
                    }
                }
                if (t1() || !org.telegram.messenger.lc.e(512)) {
                }
                if (this.L3 == 3) {
                    this.r4 = true;
                    B1();
                    return;
                } else {
                    this.r4 = false;
                    org.telegram.messenger.g0.r(this.s4);
                    return;
                }
            }
        }
        if (this.t2 != null) {
            m1().k(0L, 37, this.t2, this.R2, null, null);
            this.t2 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.s2));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || S0()) {
            i3 = 4;
            boolean isMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !isMicMute) {
                T0();
                sharedInstance.setMicMute(true, false, false);
                isMicMute = true;
            }
            if (isMicMute) {
                M1(0, z10);
            } else {
                M1(1, z10);
            }
        } else {
            T0();
            if (groupCallParticipant2.raise_hand_rating != j10) {
                i3 = 4;
                M1(4, z10);
            } else {
                i3 = 4;
                M1(2, z10);
            }
            sharedInstance.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.s2));
        if (groupCallParticipant3 == null) {
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
        }
        if (x5) {
        }
        int i142 = i11 + (!z15 ? 2 : 0) + (!z14 ? i3 : 0);
        u10 u10Var2 = this.S3;
        int i152 = i142 + ((u10Var2 == null && u10Var2.b) ? 8 : 0) + (!z17 ? 16 : 0);
        if ((this.g2 | 2) == (i152 | 2)) {
        }
        this.g2 = i152;
        boolean z202 = z12;
        org.telegram.ui.Components.voip.c2 c2Var52 = this.p1;
        if (z14) {
        }
        org.telegram.ui.Components.voip.c2 c2Var62 = this.n1;
        if (i11 != 0) {
        }
        org.telegram.ui.Components.voip.c2 c2Var72 = this.o1;
        if (z17) {
        }
        org.telegram.ui.Components.voip.c2 c2Var82 = c2Var3;
        c2Var4.c(!t1() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.rh, false), 0.3f, false, org.telegram.messenger.bd.M0(2131743374, null), false, false);
        if (z18) {
            P1(false);
        }
        c2Var2.d(true, z19);
        c2Var.d(true, z19);
        c2Var82.d(true, z19);
        t12 = t1();
        o10 o10Var2 = this.X2;
        if (t12) {
        }
        if (t1()) {
        }
    }

    public final int R0() {
        f30 f30Var = this.I1;
        int childCount = f30Var.getChildCount();
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f30Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i3 = Math.min(i3, childAt.getTop());
            }
        }
        return i3;
    }

    public final void R1() {
        boolean z10;
        v30 v30Var;
        u20 u20Var = this.G1;
        if (u20Var == null || this.S2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i3 = 0;
        for (int i10 = 0; i10 < this.S2.P.m(); i10++) {
            long j10 = this.S2.P.j(i10);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.P.f(j10);
            if (!groupCallParticipant.self) {
                u10 u10Var = this.S3;
                u10Var.getClass();
                if (u10Var.x.get(org.telegram.messenger.zi.C1(groupCallParticipant.peer)) <= 0 && this.t4.get(j10, 0) != 1) {
                    long C1 = org.telegram.messenger.zi.C1(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i3 < 2) {
                        TLRPC.User a22 = C1 > 0 ? org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(C1)) : null;
                        TLRPC.Chat M0 = C1 <= 0 ? org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(C1)) : null;
                        if (a22 != null || M0 != null) {
                            if (i3 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (a22 != null) {
                                spannableStringBuilder.append(org.telegram.messenger.l10.j(a22, true), new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0);
                            } else {
                                spannableStringBuilder.append(M0.title, new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0);
                            }
                        }
                    }
                    i3++;
                    if (i3 == 2) {
                        break;
                    }
                }
            }
        }
        if (i3 > 0) {
            String K0 = org.telegram.messenger.bd.K0(i3, "MembersAreSpeakingToast");
            int indexOf = K0.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            u20Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.k5 subtitleTextView = u20Var.getSubtitleTextView();
        String str = t1() ? "ViewersWatching" : "Participants";
        int i11 = this.S2.b.participants_count;
        r30 r30Var = this.H1;
        subtitleTextView.k(org.telegram.messenger.bd.G(i11 + ((r30Var.N.t1() || r30Var.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), str, new Object[0]));
        if (t1() && (v30Var = this.t3) != null) {
            v30Var.setWatchersCount(this.S2.b.participants_count);
        }
        if (z10 != this.m4) {
            this.m4 = z10;
            u20Var.invalidate();
            u20Var.getSubtitleTextView().setPivotX(0.0f);
            u20Var.getSubtitleTextView().setPivotY(u20Var.getMeasuredHeight() >> 1);
            u20Var.getSubtitleTextView().animate().scaleX(this.m4 ? 0.98f : 1.0f).scaleY(this.m4 ? 0.9f : 1.0f).alpha(this.m4 ? 0.0f : 1.0f).setDuration(150L);
            org.telegram.messenger.g0.X3(u20Var.getAdditionalSubtitleTextView(), this.m4);
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return org.telegram.messenger.t3.w(14, this.R2);
        }
        org.telegram.messenger.r3 r3Var = this.S2;
        return (r3Var == null || (groupCall = r3Var.b) == null || !groupCall.creator) ? false : true;
    }

    public final void S1(boolean z10) {
        org.telegram.messenger.r3 r3Var = this.S2;
        m10 m10Var = this.W2;
        if (r3Var == null) {
            if (org.telegram.messenger.t3.W(this.R2)) {
                m10Var.b(org.telegram.messenger.bd.M0(2131743472, null), z10);
                return;
            } else {
                m10Var.b(org.telegram.messenger.bd.M0(2131743351, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(r3Var.b.title);
        u20 u20Var = this.G1;
        if (isEmpty) {
            TLRPC.Chat chat = this.R2;
            if (chat != null && !chat.title.equals(u20Var.getTitle())) {
                if (z10) {
                    this.G1.K(this.R2.title, true, 180L, null);
                    u20Var.getTitleTextView().setOnClickListener(new n00(this, 9));
                } else {
                    u20Var.setTitle(this.R2.title);
                }
                if (!org.telegram.messenger.t3.W(this.R2)) {
                    m10Var.b(org.telegram.messenger.bd.M0(2131743316, null), z10);
                } else if (t1()) {
                    m10Var.b(this.R2.title, z10);
                } else {
                    m10Var.b(org.telegram.messenger.bd.M0(2131743457, null), z10);
                }
            } else if (this.R2 == null) {
                u20Var.setTitle(org.telegram.messenger.bd.M0(2131751823, null));
                m10Var.b(org.telegram.messenger.bd.M0(2131751823, null), z10);
            }
        } else if (!this.S2.b.title.equals(u20Var.getTitle())) {
            if (z10) {
                this.G1.K(this.S2.b.title, true, 180L, null);
                u20Var.getTitleTextView().setOnClickListener(new n00(this, 8));
            } else {
                u20Var.setTitle(this.S2.b.title);
            }
            m10Var.b(this.S2.b.title, z10);
        }
        org.telegram.ui.ActionBar.k5 titleTextView = u20Var.getTitleTextView();
        if (!this.S2.w) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                m10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                m10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new t30(titleTextView));
            TextView textView = m10Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new t30(textView), (Drawable) null);
            TextView nextTextView = m10Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new t30(nextTextView), (Drawable) null);
        }
    }

    public final void T0() {
        if (this.J3) {
            this.J3 = false;
            org.telegram.messenger.g0.r(this.q4);
        }
        if (this.K3) {
            this.K3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.t1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1() {
        float f10;
        org.telegram.ui.Components.fb fbVar;
        if (this.F == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.q2 - L;
        if (this.t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.t0) / ((L - this.t0) - org.telegram.messenger.g0.L(14.0f)));
            f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r0) * f10);
        } else {
            f10 = 0.0f;
        }
        this.F.setTranslationY(org.telegram.messenger.g0.T1(((-r0.getTop()) - this.F.getHeight()) + f11 + this.b.getPaddingTop() + org.telegram.messenger.g0.L(10.0f), this.G1.getY() + (-this.F.getTop()) + r4.getHeight(), f10));
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
        if (acVar == null || (fbVar = acVar.e) == null || fbVar.getParent() == null || fbVar.getParent().getParent() != this.F) {
            return;
        }
        fbVar.setTop(f10 > 0.5f);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final ArrayList U() {
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z10;
        if (!this.U4) {
            z10 z10Var = this.T3;
            if (z10Var.getVisibility() == 0 && z10Var.getAlpha() == 1.0f) {
                z10 = true;
                if (this.d4 == z10) {
                    this.d4 = z10;
                    this.m1.invalidate();
                    this.b.invalidate();
                    this.I1.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.d4 == z10) {
        }
    }

    public final void V0() {
        this.x1.setTranslationY((-this.u3.d()) + this.b.getPaddingBottom());
        this.y1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.m1.setAlpha(1.0f - this.r5.e);
        W0();
        X0();
    }

    public final void W0() {
        float f10 = this.u3.b.a;
        int i3 = f10 > 0.0f ? 0 : 8;
        f20 f20Var = this.x1;
        f20Var.setAlpha(f10);
        e20 e20Var = this.y1;
        e20Var.setAlpha(f10);
        if (f20Var.getVisibility() != i3) {
            f20Var.setVisibility(i3);
            e20Var.setVisibility(i3);
            if (i3 == 8) {
                c20 c20Var = this.z1;
                if (c20Var.isFocused()) {
                    c20Var.clearFocus();
                }
            }
        }
    }

    public final void X0() {
        org.telegram.ui.Components.li0 li0Var = this.C1;
        if (li0Var != null) {
            float f10 = this.u3.b.a * this.s5.e;
            li0Var.setAlpha(f10);
            int i3 = f10 > 0.0f ? 0 : 8;
            if (this.C1.getVisibility() != i3) {
                this.C1.setVisibility(i3);
                if (i3 == 8) {
                    this.C1.n();
                }
            }
            org.telegram.ui.Components.li0 li0Var2 = this.C1;
            if (li0Var2.O0 || f10 != 1.0f) {
                return;
            }
            li0Var2.O0 = true;
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 2) {
            a1();
            Y0();
            Z0();
            float f12 = 1.0f - this.r5.e;
            h10 h10Var = this.m1;
            h10Var.setAlpha(f12);
            this.S3.setProgressToHideUi(f10);
            this.e4.invalidate();
            this.b.invalidate();
            h10Var.invalidate();
        }
        if (i3 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.b.invalidate();
        }
        if (i3 == 4) {
            a1();
            this.y1.invalidate();
            this.z1.invalidate();
        }
        if (i3 == 5) {
            a1();
            this.b.invalidate();
        }
    }

    public final void Y0() {
        boolean z10 = y5;
        h10 h10Var = this.m1;
        if (z10) {
            h10Var.setTranslationX(0.0f);
            h10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = x5;
        qe.a aVar = this.r5;
        if (z11) {
            h10Var.setTranslationX(aVar.e * org.telegram.messenger.g0.L(94.0f));
            h10Var.setTranslationY(0.0f);
        } else {
            h10Var.setTranslationX(0.0f);
            h10Var.setTranslationY(aVar.e * org.telegram.messenger.g0.L(94.0f));
        }
    }

    public final void Z0() {
        boolean z10 = y5;
        q10 q10Var = this.e4;
        if (z10) {
            q10Var.setTranslationX(0.0f);
            q10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = x5;
        qe.a aVar = this.r5;
        if (z11) {
            q10Var.setTranslationX(aVar.e * org.telegram.messenger.g0.L(94.0f));
            q10Var.setTranslationY(0.0f);
        } else {
            q10Var.setTranslationX(0.0f);
            q10Var.setTranslationY(aVar.e * org.telegram.messenger.g0.L(94.0f));
        }
    }

    public final void a1() {
        float f10 = this.t5.f;
        sh.h hVar = this.u3;
        float T1 = org.telegram.messenger.g0.T1(y5 ? (1.0f - this.u5.e) * org.telegram.messenger.g0.L(-91.0f) : x5 ? 0.0f : ((this.r5.e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.S3.c)) - org.telegram.messenger.g0.L(91.0f), -((hVar.d() - this.b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.s5.e) + org.telegram.messenger.g0.L(10.0f)), hVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.q2) + T1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        oh.h hVar2 = this.U1;
        hVar2.setTranslationY(T1);
        hVar2.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.C1 != null) {
            this.C1.setTranslationY((-this.u3.d()) + this.b.getPaddingBottom() + ((-this.s5.e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void c1() {
        float f10 = this.s5.e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.B1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        imageView.setClickable(f10 > 0.9f);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.A1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        imageView2.setClickable(f11 > 0.9f);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.r rVar = this.R4;
        if (rVar != null) {
            rVar.a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.r rVar2 = this.R4;
            rVar2.h = false;
            rVar2.j(false);
            this.R4.invalidate();
            this.S3.invalidate();
        }
        org.telegram.ui.Cells.f4 f4Var = this.P4;
        if (f4Var != null && !this.T4 && f4Var.getParent() != null) {
            this.b.removeView(this.P4);
        }
        org.telegram.ui.Cells.f4 f4Var2 = this.P4;
        if (f4Var2 != null) {
            f4Var2.setProgressToAvatarPreview(0.0f);
            this.P4.setAboutVisible(false);
            this.P4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.d10 d10Var = this.S4;
        if (d10Var != null) {
            d10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.P4 = null;
        this.Q4 = null;
        this.S4 = null;
        this.R4 = null;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String M0;
        org.telegram.messenger.s3 s3Var;
        VoIPService sharedInstance;
        int i11;
        int i12;
        int i13 = org.telegram.messenger.hs.w2;
        f30 f30Var = this.I1;
        String[] strArr = null;
        int i14 = 0;
        int i15 = 1;
        if (i3 == i13) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.r3 r3Var = this.S2;
            if (r3Var == null || r3Var.b.id != l10.longValue()) {
                return;
            }
            org.telegram.messenger.r3 r3Var2 = this.S2;
            if (r3Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j10 = this.l2;
            int i16 = 2;
            org.telegram.messenger.c cVar = this.l1;
            if (j10 == 0 && (((i12 = this.x3) == 7 || i12 == 5 || i12 == 6) && !r3Var2.j())) {
                try {
                    Intent intent = new Intent(this.a2, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", k1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.T2);
                    intent.putExtra("peerChannelId", this.Q2.channel_id);
                    intent.putExtra("peerChatId", this.Q2.chat_id);
                    intent.putExtra("peerUserId", this.Q2.user_id);
                    intent.putExtra("hash", this.U2);
                    intent.putExtra("peerAccessHash", this.Q2.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", cVar.a);
                    intent.putExtra("scheduleDate", this.c4);
                    this.a2.startService(intent);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                this.l2 = SystemClock.elapsedRealtime();
                org.telegram.messenger.g0.i3(new p00(this, i16), 3000L);
            }
            if (!this.m2 && VoIPService.getSharedInstance() != null) {
                this.S2.b(false);
                n1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            L1();
            int childCount = f30Var.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = f30Var.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt).a(true, false);
                }
            }
            if (this.P4 != null) {
                this.k2 = true;
            } else {
                Q0(true);
            }
            R1();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.x3 == 4;
            Q1(true, booleanValue);
            S1(true);
            if (z10 && ((i11 = this.x3) == 1 || i11 == 0)) {
                m1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l11 = (Long) objArr[3];
                long longValue = l11.longValue();
                if (longValue == 0 || t1()) {
                    return;
                }
                if (q1() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList arrayList = org.telegram.messenger.hp.s1(cVar.a).y;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size) {
                                break;
                            }
                            Object obj = arrayList.get(i18);
                            i18++;
                            if (((TLRPC.Dialog) obj).id == longValue) {
                                i14 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (org.telegram.messenger.m5.E(longValue)) {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(cVar.a).a2(l11);
                    if (a22 != null) {
                        if (this.S2.b.participants_count < 250 || org.telegram.messenger.l10.w(a22) || a22.verified || i14 != 0) {
                            m1().k(0L, 44, a22, this.R2, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(cVar.a).M0(Long.valueOf(-longValue));
                if (M02 != null) {
                    if (this.S2.b.participants_count < 250 || !org.telegram.messenger.t3.r0(M02) || M02.verified || i14 != 0) {
                        m1().k(0L, 44, M02, this.R2, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.y2) {
            u10 u10Var = this.S3;
            if (u10Var.b && this.S2 != null) {
                boolean c2 = u10Var.c();
                org.telegram.messenger.r3 r3Var3 = this.S2;
                if (r3Var3 != null && u10Var.b && (s3Var = u10Var.e) != null && r3Var3.d.f(org.telegram.messenger.zi.C1(s3Var.a.peer)) == null) {
                    c2 = true;
                }
                if (c2) {
                    org.telegram.messenger.s3 s3Var2 = null;
                    int i19 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.i2;
                        if (i19 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.s3 s3Var3 = (org.telegram.messenger.s3) arrayList2.get(i19);
                        if (this.S2.P.g(null, org.telegram.messenger.zi.C1(s3Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = s3Var3.a;
                            if (!groupCallParticipant3.muted_by_you && u10Var.d != org.telegram.messenger.zi.C1(groupCallParticipant3.peer)) {
                                s3Var2 = s3Var3;
                            }
                        }
                        i19++;
                    }
                    if (s3Var2 != null) {
                        g1(s3Var2);
                    }
                }
            }
            u10Var.setVisibleParticipant(true);
            R1();
            return;
        }
        if (i3 == org.telegram.messenger.hs.N4) {
            E1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i3 == org.telegram.messenger.hs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    M0 = org.telegram.messenger.t3.W(this.R2) ? org.telegram.messenger.bd.M0(2131743462, null) : org.telegram.messenger.bd.M0(2131743329, null);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = org.telegram.messenger.t3.W(this.R2) ? org.telegram.messenger.bd.M0(2131743488, null) : org.telegram.messenger.bd.M0(2131743380, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131751106, null) + "\n" + str;
                }
                AlertDialog$Builder M = org.telegram.ui.Components.t4.M(getContext(), org.telegram.messenger.bd.M0(2131743316, null), M0);
                M.j(new t00(this, i15));
                try {
                    M.p();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == k1()) {
                L1();
                Q1(isShowing(), false);
            }
            long C1 = org.telegram.messenger.zi.C1(this.s2);
            org.telegram.messenger.r3 r3Var4 = this.S2;
            if (r3Var4 == null || chatFull.id != (-C1) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var4.d.f(C1)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            Q0(true);
            org.telegram.messenger.g0.b4(f30Var);
            if (this.w4 != null) {
                while (i14 < this.w4.getChildCount()) {
                    View childAt2 = this.w4.getChildAt(i14);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.y0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.y0) childAt2).j(org.telegram.messenger.bd.M0(TextUtils.isEmpty(groupCallParticipant2.about) ? 2131743516 : 2131743426, null), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.u1) {
            if (((Long) objArr[0]).longValue() == k1()) {
                L1();
                Q1(isShowing(), false);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.B2) {
            int childCount2 = f30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i14 < childCount2) {
                u4.d1 G = f30Var.G(f30Var.getChildAt(i14));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                        if (f4Var.getParticipant() != null) {
                            f4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i14++;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.E0) {
            Long l12 = (Long) objArr[0];
            long C12 = org.telegram.messenger.zi.C1(this.s2);
            if (this.S2 == null || C12 != l12.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(C12)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            Q0(true);
            org.telegram.messenger.g0.b4(f30Var);
            if (this.w4 != null) {
                while (i14 < this.w4.getChildCount()) {
                    View childAt3 = this.w4.getChildAt(i14);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.y0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.y0) childAt3).j(org.telegram.messenger.bd.M0(TextUtils.isEmpty(groupCallParticipant.about) ? 2131743517 : 2131743427, null), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i14++;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.j0) {
            Q0(true);
            org.telegram.messenger.g0.b4(f30Var);
            return;
        }
        if (i3 == org.telegram.messenger.hs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i20 = org.telegram.messenger.hp.C8;
            int i21 = intValue & 16;
            if (i21 != 0) {
                Q0(true);
            }
            if (i21 == 0 && (intValue & TLObject.FLAG_19) == 0) {
                return;
            }
            org.telegram.messenger.g0.b4(f30Var);
            return;
        }
        if (i3 == org.telegram.messenger.hs.z2) {
            o20 o20Var = this.r2;
            if (o20Var != null) {
                o20Var.b(true, true);
            }
            L1();
            return;
        }
        if (i3 == org.telegram.messenger.hs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.h2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        LaunchActivity launchActivity = this.a2;
        launchActivity.c1.remove(this.n4);
        this.a2.setRequestedOrientation(-1);
        w5 = false;
        org.telegram.ui.Components.d20 d20Var = this.w3;
        if (d20Var != null) {
            d20Var.dismiss();
        }
        this.k2 = true;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.l1;
        int i3 = cVar.a;
        int i10 = cVar.a;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.M0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.w2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.u1);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.B2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.E0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.j0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.z2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.y2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.R3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.N4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.D2);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.a2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.a2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                m1().j(z10 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z10) {
        if (this.U4 || !this.X3) {
            return;
        }
        if (z10) {
            this.U4 = true;
            A1(false, this.P4);
            return;
        }
        d1();
        this.b.removeView(this.W3);
        this.W3 = null;
        this.u4.setVisibility(8);
        this.b.invalidate();
        this.X3 = false;
        this.Q1.X = true;
        this.I1.invalidate();
        this.T3.setVisibility(8);
        if (this.k2) {
            this.k2 = false;
            Q0(true);
        }
        U0();
    }

    public final void g1(org.telegram.messenger.s3 s3Var) {
        org.telegram.messenger.s3 s3Var2;
        if (s3Var == null) {
            this.a2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            u10 u10Var = this.S3;
            if (u10Var.r != null) {
                return;
            }
            boolean z10 = y5;
            f30 f30Var = this.I1;
            int i3 = 0;
            if (!z10) {
                if (this.i4 != null) {
                    f30Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                    this.i4 = null;
                }
                if (s3Var == null) {
                    if (f30Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = f30Var.getViewTreeObserver();
                        r20 r20Var = new r20(this, 1);
                        this.i4 = r20Var;
                        viewTreeObserver.addOnPreDrawListener(r20Var);
                        return;
                    }
                    f30Var.setVisibility(0);
                    Q0(false);
                    this.k2 = true;
                    ViewTreeObserver viewTreeObserver2 = f30Var.getViewTreeObserver();
                    r20 r20Var2 = new r20(this, 0);
                    this.i4 = r20Var2;
                    viewTreeObserver2.addOnPreDrawListener(r20Var2);
                    return;
                }
                q10 q10Var = this.e4;
                if (q10Var.getVisibility() == 0) {
                    u10Var.j(s3Var);
                    org.telegram.messenger.g0.b4(q10Var);
                    return;
                }
                q10Var.setVisibility(0);
                org.telegram.ui.Components.e10 e10Var = this.h4;
                e10Var.G(q10Var, false);
                this.k2 = true;
                if (!u10Var.b) {
                    ArrayList arrayList = e10Var.e;
                    u4.b0 b0Var = (u4.b0) q10Var.getLayoutManager();
                    if (b0Var != null) {
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.s3) arrayList.get(i3)).equals(s3Var)) {
                                b0Var.h1(i3, org.telegram.messenger.g0.L(13.0f));
                                break;
                            }
                            i3++;
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = f30Var.getViewTreeObserver();
                hw hwVar = new hw(1, this, s3Var);
                this.i4 = hwVar;
                viewTreeObserver3.addOnPreDrawListener(hwVar);
                return;
            }
            if (this.i4 != null) {
                f30Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            a40 a40Var = this.g4;
            ArrayList arrayList3 = this.Q3;
            ArrayList arrayList4 = this.R3;
            if (s3Var == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList4.get(i10);
                    org.telegram.ui.Components.voip.k kVar = rVar.c;
                    if (kVar != null) {
                        kVar.setRenderer(null);
                        org.telegram.ui.Components.d10 d10Var = rVar.d;
                        if (d10Var != null) {
                            d10Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.k kVar2 = rVar.e;
                        if (kVar2 != null) {
                            kVar2.setRenderer(null);
                        }
                        arrayList2.add(rVar.x);
                        rVar.b(false);
                        rVar.animate().alpha(0.0f).setListener(new p20(this, rVar, 0));
                    }
                }
                this.H4 = false;
                a40Var.H(this.f4, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) arrayList4.get(i11);
                    if (rVar2.e != null && ((s3Var2 = rVar2.x) == null || !s3Var2.equals(s3Var))) {
                        arrayList2.add(rVar2.x);
                        rVar2.b(false);
                        org.telegram.ui.Components.d10 d10Var2 = rVar2.d;
                        if (d10Var2 != null) {
                            d10Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.k kVar3 = rVar2.c;
                        if (kVar3 != null) {
                            kVar3.setRenderer(null);
                        }
                        rVar2.animate().alpha(0.0f).setListener(new p20(this, rVar2, 1));
                    }
                }
                this.H4 = true;
                a40Var.r = false;
                if (!arrayList2.isEmpty()) {
                    org.telegram.messenger.g0.h3(new ly(3, this, arrayList2));
                }
            }
            boolean z11 = !u10Var.b;
            ViewTreeObserver viewTreeObserver4 = f30Var.getViewTreeObserver();
            hh hhVar = new hh(this, s3Var, z11);
            this.i4 = hhVar;
            viewTreeObserver4.addOnPreDrawListener(hhVar);
        }
    }

    public final int j1() {
        Integer num = this.q5;
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

    public final long k1() {
        TLRPC.Chat chat = this.R2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void l1(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.l1;
        int i3 = cVar.a;
        int i10 = cVar.a;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(k1()));
        if (M0 != null && !org.telegram.messenger.t3.t0(M0)) {
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i10).N0(k1());
            String K = org.telegram.messenger.t3.K(this.R2, false);
            String r5 = !TextUtils.isEmpty(K) ? org.telegram.ui.Cells.f1.r(org.telegram.messenger.hp.s1(i10).V2, "/", K, new StringBuilder()) : (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) ? null : tL_chatInviteExported.link;
            if (!TextUtils.isEmpty(r5)) {
                w1(null, r5, true, z10);
                return;
            }
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = org.telegram.messenger.hp.l1(this.R2);
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new ci.t8(this, N0, z10, 6));
            return;
        }
        if (this.S2 == null) {
            return;
        }
        int i11 = 0;
        while (i11 < 2) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            org.telegram.messenger.r3 r3Var = this.S2;
            exportgroupcallinvite.call = r3Var.g(r3Var.a);
            exportgroupcallinvite.can_self_unmute = i11 == 1;
            ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.vc(this, i11, z10, 2));
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean m0() {
        w5 = true;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
        org.telegram.ui.Components.l10.j(getContext());
        return false;
    }

    public final UndoView m1() {
        if (!y5) {
            u10 u10Var = this.S3;
            if (u10Var.b) {
                return u10Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.b2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.b.removeView(undoViewArr[0]);
            this.b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void n1() {
        VoIPService sharedInstance;
        if (this.m2 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.m2 = true;
        this.v2.addAll(this.S2.g);
        this.w2.addAll(this.i2);
        this.x2.addAll(this.S2.j);
        this.y2.addAll(this.S2.m);
        this.z2.addAll(this.S2.l);
        this.L3 = sharedInstance.getCallState();
        if (this.S2 == null) {
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            this.S2 = r3Var;
            this.h4.c = r3Var;
            this.S3.setGroupCall(r3Var);
            this.g4.c = this.S2;
        }
        int i3 = 0;
        oh.h hVar = this.U1;
        if (hVar != null) {
            hVar.D0(this.l1.a, this.S2.g(false));
        }
        this.G1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
        ArrayList arrayList = this.S2.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = r7.active_date;
        }
        VoIPService.getSharedInstance().registerStateListener(this);
        e30 e30Var = this.N1;
        if (e30Var == null || e30Var.getVisibility() != 0) {
            return;
        }
        this.r1.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.rh, false), 0.3f, false, org.telegram.messenger.bd.M0(2131743374, null), false, true);
        P1(true);
        this.o3.setText(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.W(this.R2) ? 2131743491 : 2131743390, null));
        f30 f30Var = this.I1;
        f30Var.setVisibility(0);
        org.telegram.ui.ActionBar.q0 q0Var = this.d3;
        q0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f30Var, (Property<f30, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f30Var, (Property<f30, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(e30Var, (Property<e30, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(e30Var, (Property<e30, Float>) property3, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(e30Var, (Property<e30, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.k5 k5Var = this.M1;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property3, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.O1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(k5Var2, (Property<org.telegram.ui.ActionBar.k5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(k5Var2, (Property<org.telegram.ui.ActionBar.k5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(k5Var2, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.xq.g);
        animatorSet.addListener(new s20(this, i3));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void o1(final long j10, final boolean z10) {
        if (this.S2 != null) {
            org.telegram.messenger.c cVar = this.l1;
            final TLRPC.User a22 = org.telegram.messenger.hp.s1(cVar.a).a2(Long.valueOf(j10));
            if (a22 != null) {
                int i3 = 1;
                final org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.r3 r3Var = this.S2;
                invitetogroupcall.call = r3Var.g(r3Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = a22.id;
                tL_inputUser.access_hash = a22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.a).sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.z00
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        x30 x30Var = x30.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.s1[] s1VarArr2 = s1VarArr;
                        if (tLObject == null) {
                            org.telegram.messenger.g0.h3(new ci.n(x30Var, s1VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        org.telegram.messenger.hp.s1(x30Var.l1.a).O3((TLRPC.Updates) tLObject, false);
                        org.telegram.messenger.g0.h3(new ci.l2(x30Var, j11, s1VarArr2, a22, 20));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.i3(new rw(this, s1VarArr, sendRequest, i3), 500L);
                }
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        P1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            E1(0.0f);
        }
        f30 f30Var = this.I1;
        if (f30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(f30Var);
        }
        q10 q10Var = this.e4;
        if (q10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(q10Var);
        }
        ArrayList arrayList = this.R3;
        arrayList.clear();
        arrayList.addAll(this.Q3);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        o20 o20Var = this.r2;
        if (o20Var != null) {
            o20Var.b(false, false);
            return;
        }
        if (this.X3) {
            f1(true);
        } else if (this.S3.b) {
            g1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.R3;
        arrayList.clear();
        arrayList.addAll(this.Q3);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
        }
        o20 o20Var = this.r2;
        if (o20Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        o20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.a2;
        launchActivity.c1.add(this.n4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i3) {
        this.L3 = i3;
        Q1(isShowing(), false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public final boolean p1() {
        int L = org.telegram.messenger.g0.L(74.0f);
        float f10 = this.q2 - L;
        return (((((float) this.t0) + f10) > ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 1 : ((((float) this.t0) + f10) == ((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - f10) - ((float) this.t0)) / ((float) ((L - this.t0) - org.telegram.messenger.g0.L(14.0f)))) : 0.0f) > 0.5f;
    }

    public final boolean q1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.W1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ch, false));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.c3;
            if (q0Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Vg;
                q0Var.O(org.telegram.ui.ActionBar.k6.x0(null, i3, false), false);
                q0Var.O(org.telegram.ui.ActionBar.k6.x0(null, i3, false), true);
                q0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false);
            H1(this.p3, x02);
            H1(this.q3, x02);
            H1(this.h3, x02);
            H1(this.i3, x02);
            H1(this.o3, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.jh, false));
            H1(this.f3, x02);
            H1(this.g3, x02);
            H1(this.j3, x02);
            H1(this.k3, x02);
            H1(this.l3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean s1() {
        return t1() && !this.S2.f.isEmpty() && (((org.telegram.messenger.s3) this.S2.f.get(0)).c == 0.0f || ((org.telegram.messenger.s3) this.S2.f.get(0)).c >= 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.s0.e0.W) {
            org.telegram.ui.Components.voip.s0.b();
        }
    }

    public final boolean t1() {
        org.telegram.messenger.r3 r3Var = this.S2;
        return r3Var != null && r3Var.b.rtmp_stream;
    }

    public final void u1(org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.s1 s1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.o2) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.a2.M().getFragmentStack().get(this.a2.M().getFragmentStack().size() - 1);
        if (d2Var instanceof wm) {
            boolean pa2 = ((wm) d2Var).pa();
            this.o2 = true;
            this.p2 = true;
            org.telegram.messenger.g0.i3(new rn(t2Var, editTextBoldCursor, z10, s1Var, 7), pa2 ? 200L : 0L);
            return;
        }
        this.o2 = true;
        this.p2 = true;
        if (t2Var != null) {
            t2Var.A0(true);
        } else if (s1Var != null) {
            s1Var.l(true);
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new og(editTextBoldCursor, 2), 100L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w1(String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        String str3;
        String str4;
        String str5;
        if (t1() && str != null) {
            str2 = null;
        }
        if (z11) {
            if (str == null) {
                str = str2;
            }
            org.telegram.messenger.g0.g(str);
            if (org.telegram.messenger.g0.I3()) {
                m1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.a2;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) launchActivity.M().getFragmentStack().get(this.a2.M().getFragmentStack().size() - 1);
            if (d2Var instanceof wm) {
                z12 = ((wm) d2Var).pa();
                this.p2 = true;
                this.o2 = true;
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
                    str5 = org.telegram.messenger.t3.W(this.R2) ? org.telegram.messenger.bd.a0("VoipChannelInviteText", null, 2131743490, str4) : org.telegram.messenger.bd.a0("VoipGroupInviteText", null, 2131743382, str4);
                }
                t20 t20Var = new t20(this, getContext(), str5, str3, str4, str3);
                this.j2 = t20Var;
                t20Var.l2 = new f(this, 17);
                t20Var.setOnDismissListener(new t00(this, 3));
                org.telegram.messenger.g0.i3(new p00(this, 7), !z12 ? 200L : 0L);
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
        t20 t20Var2 = new t20(this, getContext(), str5, str3, str4, str3);
        this.j2 = t20Var2;
        t20Var2.l2 = new f(this, 17);
        t20Var2.setOnDismissListener(new t00(this, 3));
        org.telegram.messenger.g0.i3(new p00(this, 7), !z12 ? 200L : 0L);
    }

    public final void x1() {
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var == null || r3Var.b == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
        s1Var.r(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.S2.b;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new y9(this, s1Var, exportgroupcallinvite, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.String, org.telegram.ui.ActionBar.e6] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean[], java.lang.String, org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.p1] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r8v15, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void z1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i3) {
        String str;
        ?? r14;
        TextView textView;
        VoIPService voIPService;
        int i10;
        String str2;
        String str3;
        ?? r142;
        int i11;
        String str4;
        int i12;
        EditText editText;
        String str5;
        float f10;
        String M0;
        boolean z10;
        org.telegram.ui.ActionBar.s1 s1Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        org.telegram.messenger.c cVar = this.l1;
        TLObject a22 = j10 > 0 ? org.telegram.messenger.hp.s1(cVar.a).a2(Long.valueOf(j10)) : org.telegram.messenger.hp.s1(cVar.a).M0(Long.valueOf(-j10));
        int i13 = 5;
        if (i3 == 0 || i3 == 2 || i3 == 3) {
            if (i3 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(a22, Boolean.TRUE, null, null, null, null);
                m1().k(0L, 30, a22, null, null, null);
                return;
            }
            ?? alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i14 = org.telegram.ui.ActionBar.k6.dh;
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
            s1Var2.J = i14;
            TextView textView2 = new TextView(getContext());
            int i15 = org.telegram.ui.ActionBar.k6.Vg;
            org.telegram.ui.ActionBar.r6.V(textView2, i15, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
            ?? frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            u8Var.p(a22);
            boolean z11 = a22 instanceof TLRPC.User;
            if (z11) {
                TLRPC.User user = (TLRPC.User) a22;
                k9Var.e(user, u8Var);
                str = org.telegram.messenger.l10.j(user, true);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) a22;
                k9Var.e(chat, u8Var);
                str = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            org.telegram.messenger.k5.n(textView3, i15, null, 1, 20.0f);
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.R2;
            String str6 = chat2 != null ? chat2.title : "";
            if (i3 != 2) {
                textView3.setText(org.telegram.messenger.bd.M0(2131743412, null));
                org.telegram.messenger.k5.r(null, null, 2131743413, new Object[]{str, str6}, textView2);
            } else if (q1()) {
                textView3.setText(org.telegram.messenger.bd.M0(2131743431, null));
                org.telegram.messenger.k5.r(null, null, 2131743432, new Object[]{str}, textView2);
            } else {
                textView3.setText(org.telegram.messenger.bd.M0(2131743355, null));
                if (org.telegram.messenger.t3.W(this.R2)) {
                    org.telegram.messenger.k5.r(null, null, 2131743474, new Object[]{str, str6}, textView2);
                } else {
                    org.telegram.messenger.k5.r(null, null, 2131743356, new Object[]{str, str6}, textView2);
                }
            }
            boolean z12 = org.telegram.messenger.bd.a0;
            frameLayout.addView(textView3, b8.mf.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 76, 11.0f, z12 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i3 == 2) {
                r14 = 0;
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743321, null), new org.telegram.ui.Components.i41(15, this, a22));
            } else {
                r14 = 0;
                r14 = 0;
                if (z11) {
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743414, null), new ci.i(this, (TLRPC.User) a22, j10, 6));
                }
            }
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r14), r14);
            s1Var2.j(org.telegram.ui.ActionBar.k6.x0(r14, org.telegram.ui.ActionBar.k6.ih, false));
            s1Var2.show();
            if (i3 != 2 || (textView = (TextView) s1Var2.d(-1)) == null) {
                return;
            }
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.jh, r14);
            return;
        }
        if (i3 == 6) {
            this.a2.O0(this.a);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.a2.t0(new wm(bundle));
            dismiss();
            return;
        }
        if (i3 == 8) {
            this.a2.O0(this.a);
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.a2.M().getFragmentStack().get(this.a2.M().getFragmentStack().size() - 1);
            if ((d2Var instanceof wm) && ((wm) d2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.a2.t0(new wm(bundle2));
            dismiss();
            return;
        }
        if (i3 == 7) {
            sharedInstance.editCallMember(a22, Boolean.TRUE, null, null, Boolean.FALSE, null);
            M1(2, true);
            return;
        }
        int i16 = 9;
        if (i3 == 9) {
            org.telegram.ui.Components.f30 f30Var = this.Z3;
            if (f30Var == null || !f30Var.g()) {
                TLRPC.User f11 = org.telegram.messenger.h10.i(cVar.a).f();
                org.telegram.ui.Components.f30 f30Var2 = new org.telegram.ui.Components.f30(0, true, true);
                this.Z3 = f30Var2;
                f30Var2.I = true;
                f30Var2.S = true;
                f30Var2.H = true;
                f30Var2.K = true;
                f30Var2.T = true;
                f30Var2.a = this.a2.M().getLastFragment();
                org.telegram.ui.Components.f30 f30Var3 = this.Z3;
                g30 g30Var = new g30(this, j10);
                this.a4 = g30Var;
                f30Var3.b = g30Var;
                TLRPC.UserProfilePhoto userProfilePhoto = f11.photo;
                f30Var3.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new p00(this, i16), new gi.d1(i13), 0);
                return;
            }
            return;
        }
        if (i3 == 10) {
            String str7 = groupCallParticipant.about;
            Context context = getContext();
            int i17 = this.a;
            Pattern pattern = org.telegram.ui.Components.t4.a;
            ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
            if (j10 > 0) {
                str5 = null;
                f10 = 8.0f;
                M0 = org.telegram.messenger.bd.M0(2131743775, null);
            } else {
                str5 = null;
                f10 = 8.0f;
                M0 = org.telegram.messenger.bd.M0(2131751460, null);
            }
            String str8 = M0;
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder2.a;
            s1Var3.S = str8;
            s1Var3.U = org.telegram.messenger.bd.M0(j10 > 0 ? 2131743406 : 2131751463, str5);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setClipChildren(false);
            if (j10 < 0) {
                s1Var = s1Var3;
                long j11 = -j10;
                z10 = false;
                if (org.telegram.messenger.hp.s1(i17).N0(j11) == null) {
                    org.telegram.messenger.hp.s1(i17).V2(ConnectionsManager.generateClassGuid(), j11, true);
                    z10 = false;
                }
            } else {
                z10 = 0;
                s1Var = s1Var3;
            }
            NumberTextView numberTextView = new NumberTextView(context);
            EditText editText2 = new EditText(context);
            int i18 = org.telegram.ui.ActionBar.k6.Vg;
            org.telegram.ui.ActionBar.r6.V(editText2, i18, null);
            editText2.setHint(j10 > 0 ? org.telegram.messenger.bd.M0(2131743775, null) : org.telegram.messenger.bd.M0(2131751460, null));
            editText2.setTextSize(1, 16.0f);
            editText2.setBackground(org.telegram.ui.ActionBar.k6.U(context));
            editText2.setMaxLines(4);
            editText2.setRawInputType(147457);
            editText2.setImeOptions(6);
            int i19 = j10 > 0 ? 70 : org.telegram.messenger.hs.e4;
            org.telegram.ui.Components.k3 k3Var = new org.telegram.ui.Components.k3(i19, context, numberTextView);
            InputFilter[] inputFilterArr = new InputFilter[1];
            inputFilterArr[z10] = k3Var;
            editText2.setFilters(inputFilterArr);
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, z10));
            numberTextView.setImportantForAccessibility(2);
            frameLayout2.addView(numberTextView, b8.mf.d(20, 20.0f, org.telegram.messenger.bd.a0 ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
            editText2.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(f10), org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(f10));
            editText2.addTextChangedListener(new org.telegram.ui.Components.sp(i19, numberTextView));
            org.telegram.messenger.g0.Z3(numberTextView, false, 0.0f, true, false);
            editText2.setText(str7);
            editText2.setSelection(editText2.getText().toString().length());
            alertDialog$Builder2.o(frameLayout2);
            final b4.o oVar = new b4.o(j10, i17, editText2, 5);
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131745956, null), oVar);
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            final org.telegram.ui.ActionBar.s1 s1Var4 = s1Var;
            s1Var4.O = new org.telegram.ui.Components.h1(editText2, true ? 1 : 0);
            frameLayout2.addView(editText2, b8.mf.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText2.requestFocus();
            org.telegram.messenger.g0.K3(editText2);
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.o1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i20, KeyEvent keyEvent) {
                    if (i20 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.s1 s1Var5 = s1Var4;
                        if (s1Var5.isShowing()) {
                            oVar.g(s1Var5, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            s1Var4.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false));
            s1Var4.show();
            s1Var4.p(org.telegram.ui.ActionBar.k6.x0(null, i18, false));
            return;
        }
        if (i3 != 11) {
            if (i3 == 5) {
                sharedInstance.editCallMember(a22, Boolean.TRUE, null, null, null, null);
                m1().m(0L, a22, 35);
                sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                return;
            }
            if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                voIPService = sharedInstance;
                i10 = 1;
                voIPService.editCallMember(a22, Boolean.FALSE, null, null, null, null);
            } else {
                groupCallParticipant.volume = 10000;
                groupCallParticipant.volume_by_admin = false;
                voIPService = sharedInstance;
                i10 = 1;
                voIPService.editCallMember(a22, Boolean.FALSE, null, 10000, null, null);
            }
            voIPService.setParticipantVolume(groupCallParticipant, org.telegram.messenger.t3.H(groupCallParticipant));
            m1().k(0L, i3 == i10 ? 31 : 36, a22, null, null, null);
            return;
        }
        Context context2 = getContext();
        int i20 = this.a;
        Pattern pattern2 = org.telegram.ui.Components.t4.a;
        if (org.telegram.messenger.m5.E(j10)) {
            TLRPC.User a23 = org.telegram.messenger.hp.s1(i20).a2(Long.valueOf(j10));
            str2 = a23.first_name;
            str3 = a23.last_name;
        } else {
            str2 = org.telegram.messenger.hp.s1(i20).M0(Long.valueOf(-j10)).title;
            str3 = null;
        }
        ?? alertDialog$Builder3 = new AlertDialog$Builder(context2);
        if (j10 > 0) {
            i11 = 2131743425;
            r142 = 0;
        } else {
            r142 = 0;
            i11 = 2131743424;
        }
        String M02 = org.telegram.messenger.bd.M0(i11, r142);
        org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder3.a;
        s1Var5.S = M02;
        LinearLayout f12 = org.telegram.messenger.k5.f(context2, 1);
        EditText editText3 = new EditText(context2);
        int i21 = org.telegram.ui.ActionBar.k6.Vg;
        org.telegram.ui.ActionBar.r6.V(editText3, i21, r142);
        editText3.setTextSize(1, 16.0f);
        editText3.setMaxLines(1);
        editText3.setLines(1);
        editText3.setSingleLine(true);
        editText3.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        editText3.setInputType(49152);
        editText3.setImeOptions(j10 > 0 ? 5 : 6);
        if (j10 > 0) {
            i12 = 2131750695;
            str4 = null;
        } else {
            str4 = null;
            i12 = 2131743423;
        }
        editText3.setHint(org.telegram.messenger.bd.M0(i12, str4));
        editText3.setBackground(org.telegram.ui.ActionBar.k6.U(context2));
        editText3.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        editText3.requestFocus();
        if (j10 > 0) {
            editText = new EditText(context2);
            org.telegram.ui.ActionBar.r6.V(editText, i21, null);
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(org.telegram.messenger.bd.M0(2131749040, null));
            editText.setBackground(org.telegram.ui.ActionBar.k6.U(context2));
            editText.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        } else {
            editText = null;
        }
        org.telegram.messenger.g0.K3(editText3);
        f12.addView(editText3, b8.mf.t(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            f12.addView(editText, b8.mf.t(-1, -2, 0, 23, 12, 23, 21));
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.getText().toString().length());
        if (editText != null) {
            editText.setText(str3);
            editText.setSelection(editText.getText().toString().length());
        }
        alertDialog$Builder3.o(f12);
        ii.o1 o1Var = new ii.o1(editText3, j10, i20, editText);
        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131745956, null), o1Var);
        alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        s1Var5.O = new ci.h3(7, editText3, editText);
        s1Var5.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false));
        s1Var5.show();
        s1Var5.p(org.telegram.ui.ActionBar.k6.x0(null, i21, false));
        ld ldVar = new ld(true ? 1 : 0, s1Var5, o1Var);
        if (editText != null) {
            editText.setOnEditorActionListener(ldVar);
        } else {
            editText3.setOnEditorActionListener(ldVar);
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
