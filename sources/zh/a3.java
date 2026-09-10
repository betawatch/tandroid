package zh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.kb;
import bi.pb;
import bi.r9;
import bi.rb;
import bi.ve;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cs;
import org.telegram.ui.eo;
import org.telegram.ui.hn0;
import org.telegram.ui.i01;
import org.telegram.ui.ic1;
import org.telegram.ui.iz;
import org.telegram.ui.m91;
import org.telegram.ui.rv0;
import org.telegram.ui.zp0;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class a3 extends aw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.f6 B0;
    public long B1;
    public vh.b B2;
    public boolean B3;
    public final z6 C0;
    public boolean C1;
    public int C2;
    public cs C3;
    public final b2 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.g1 D3;
    public o5 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.g1 E3;
    public bi.x4 F0;
    public boolean F1;
    public org.telegram.ui.u7 F2;
    public final zg.a F3;
    public bi.x4 G0;
    public boolean G1;
    public boolean G2;
    public final eh.a G3;
    public bi.x4 H0;
    public long H1;
    public float H2;
    public final eh.d H3;
    public int I0;
    public final float I1;
    public gg.m I2;
    public final ch.b I3;
    public final u7 J0;
    public int J1;
    public f60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final l2 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final o1 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final k2.v M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final z2 O1;
    public final org.telegram.ui.Components.d6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final b2 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.d6 P2;
    public final j1 P3;
    public org.telegram.ui.Components.n6 Q0;
    public w2 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.n6 R0;
    public boolean R1;
    public long R2;
    public final j1 R3;
    public org.telegram.ui.Components.d6 S0;
    public i5 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.d6 T0;
    public boolean T1;
    public boolean T2;
    public final ArrayList T3;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public boolean U3;
    public boolean V0;
    public boolean V1;
    public boolean V2;
    public final sg.a1 V3;
    public long W0;
    public b2 W1;
    public s40 W2;
    public final org.telegram.ui.Components.d6 W3;
    public long X0;
    public a X1;
    public final rv0 X2;
    public final org.telegram.ui.Components.d6 X3;
    public boolean Y0;
    public e1 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.d6 Y3;
    public boolean Z0;
    public f1 Z1;
    public z1 Z2;
    public float Z3;
    public boolean a1;
    public b1 a2;
    public FrameLayout a3;
    public final Path a4;
    public boolean b1;
    public t1 b2;
    public hn0 b3;
    public boolean b4;
    public final h2 c1;
    public ih.h c2;
    public boolean c3;
    public ValueAnimator c4;
    public final FrameLayout d1;
    public bi.x4 d2;
    public v1 d3;
    public float d4;
    public final gg.h1 e1;
    public ValueAnimator e2;
    public float e3;
    public final ImageReceiver f1;
    public pk0 f2;
    public boolean f3;
    public final ImageReceiver g1;
    public LinearLayout g2;
    public boolean g3;
    public final ArrayList h1;
    public TextView h2;
    public boolean h3;
    public Runnable i1;
    public TextView i2;
    public boolean i3;
    public final f2 j1;
    public u6 j2;
    public boolean j3;
    public final iz k1;
    public ViewPropertyAnimator k2;
    public boolean k3;
    public f3 l1;
    public final bh.d l2;
    public final ImageReceiver l3;
    public float m1;
    public final bh.d m2;
    public yg.e m3;
    public final g9 n1;
    public final Paint n2;
    public final ImageReceiver n3;
    public final x2 o1;
    public int o2;
    public org.telegram.ui.Components.p5 o3;
    public final v6 p1;
    public ValueAnimator p2;
    public boolean p3;
    public j6.l q1;
    public float q2;
    public boolean q3;
    public int r1;
    public float r2;
    public pk0 r3;
    public org.telegram.ui.ActionBar.g1 s1;
    public float s2;
    public boolean s3;
    public v2 t1;
    public int t2;
    public float t3;
    public TL_stories.PeerStories u1;
    public boolean u2;
    public boolean u3;
    public final ArrayList v1;
    public boolean v2;
    public float v3;
    public final ImageView w0;
    public final ArrayList w1;
    public boolean w2;
    public int w3;
    public final ImageView x0;
    public final y2 x1;
    public boolean x2;
    public int x3;
    public final m91 y0;
    public final xf.i0 y1;
    public int y2;
    public int y3;
    public final kj0 z0;
    public ArrayList z1;
    public final int z2;
    public j1 z3;

    public a3(Context context, final u7 u7Var, y2 y2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.b1 = true;
        this.h1 = new ArrayList();
        this.r1 = -5;
        this.I1 = 1.0f;
        z2 z2Var = new z2(this);
        this.O1 = z2Var;
        this.q2 = -1.0f;
        this.r2 = -1.0f;
        this.s2 = -1.0f;
        this.z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.d6(this);
        this.P2 = new org.telegram.ui.Components.d6(this);
        rv0 rv0Var = new rv0();
        this.X2 = rv0Var;
        this.e3 = 1.0f;
        this.P3 = new j1(this, 4);
        this.R3 = new j1(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new sg.a1(this, 10);
        this.W3 = new org.telegram.ui.Components.d6(this);
        this.X3 = new org.telegram.ui.Components.d6(this);
        this.Y3 = new org.telegram.ui.Components.d6(this);
        this.a4 = new Path();
        rv0Var.E = new o0.b(this);
        k2.v vVar = new k2.v();
        vVar.g = new ArrayList();
        this.M2 = vVar;
        this.N2 = new AnimationNotificationsLocker();
        this.v1 = new ArrayList();
        this.w1 = new ArrayList();
        gg.h1 h1Var = new gg.h1(this, 6);
        this.e1 = h1Var;
        h1Var.setCrossfadeWithOldImage(false);
        h1Var.setAllowLoadingOnAttachedOnly(true);
        h1Var.ignoreNotifications = true;
        h1Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        h1Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.n1 = new g9((org.telegram.ui.ActionBar.f6) null);
        this.J0 = u7Var;
        this.x1 = y2Var;
        this.P1 = y2Var.g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        y2Var.l.setColor(-16777216);
        this.n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = f6Var;
        setClipChildren(false);
        final int i10 = 0;
        f2 f2Var = new f2(this, context, this.c1, f6Var, u7Var);
        this.j1 = f2Var;
        ch.b bVar = new ch.b(f6Var, org.telegram.ui.ActionBar.j6.Sd, 0.8f);
        this.I3 = bVar;
        eh.c cVar = new eh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.H3 = null;
            this.G3 = cVar;
        } else {
            eh.d dVar = new eh.d(cVar);
            this.H3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        }
        gh.k kVar = new gh.k(this);
        zg.a aVar = new zg.a(this.G3);
        aVar.d = kVar;
        aVar.e = this;
        this.F3 = aVar;
        this.l2 = aVar.c(this, bVar, false);
        bh.d c10 = aVar.c(this, bVar, false);
        this.m2 = c10;
        c10.t(AndroidUtilities.dp(32.0f));
        h2 h2Var = new h2(this, context, y2Var, u7Var);
        this.c1 = h2Var;
        h2Var.setClipChildren(false);
        this.k1 = new iz(this.C2, h2Var);
        h2Var.addView(f2Var, w7.a6.c(-1.0f, -1));
        l2 l2Var = new l2(this, getContext(), u7Var.y, u7Var, f6Var);
        this.K0 = l2Var;
        l2Var.b0.setOnClickListener(new l1(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(y2Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new l1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.c6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(y2Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        b2 b2Var = new b2(this, getContext(), 1);
        this.P0 = b2Var;
        org.telegram.ui.Components.n6 n6Var = this.R0;
        if (n6Var != null) {
            n6Var.setCallback(b2Var);
        }
        b2Var.setWillNotDraw(false);
        b2Var.setOnClickListener(new l1(this, 12));
        b2 b2Var2 = new b2(this, getContext(), 2);
        this.D0 = b2Var2;
        org.telegram.ui.Components.n6 n6Var2 = this.Q0;
        if (n6Var2 != null) {
            n6Var2.setCallback(b2Var2);
        }
        b2Var2.setWillNotDraw(false);
        b2Var2.setOnClickListener(new l1(this, 13));
        b2Var2.setOnLongClickListener(new org.telegram.ui.Components.b0(6, this, u7Var));
        o5 o5Var = new o5(context, y2Var);
        this.E0 = o5Var;
        o5Var.setPadding(dp, dp, dp, dp);
        b2Var2.addView(this.E0, w7.a6.e(40, 40, 3));
        b2Var.addView(imageView2, w7.a6.e(40, 40, 3));
        w7.c6.b(b2Var2, 0.3f, 5.0f);
        w7.c6.b(b2Var, 0.3f, 5.0f);
        h1Var.setAllowLoadingOnAttachedOnly(true);
        h1Var.setParentView(h2Var);
        xf.i0 i0Var = new xf.i0(10);
        this.y1 = i0Var;
        h2Var.setOutlineProvider(i0Var);
        h2Var.setClipToOutline(true);
        addView(h2Var);
        x2 x2Var = new x2(context, z2Var);
        this.o1 = x2Var;
        x2Var.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h1
            public final /* synthetic */ a3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        a3 a3Var = this.b;
                        long j3 = UserConfig.getInstance(a3Var.C2).clientUserId;
                        long j10 = a3Var.B1;
                        u7 u7Var2 = u7Var;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                u7Var2.H(eo.R9(j10));
                                break;
                            } else {
                                u7Var2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle e = org.telegram.ui.Cells.r6.e(1, TeXSymbolParser.TYPE_ATTR);
                            e.putLong("dialog_id", a3Var.B1);
                            u7Var2.H(new la0(e, null));
                            break;
                        }
                    default:
                        a3 a3Var2 = this.b;
                        if (!a3Var2.O1.j()) {
                            a3Var2.c1(true);
                            break;
                        } else {
                            u7Var.O();
                            if (!u7.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a3Var2.y0.setContentDescription(LocaleController.getString(!u7.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        h2Var.addView(x2Var, w7.a6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.a6.q(40, 40, 5));
        linearLayout.addView(b2Var, w7.a6.q(40, 40, 5));
        linearLayout.addView(b2Var2, w7.a6.q(40, 40, 5));
        addView(linearLayout, w7.a6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.w0 = imageView3;
        imageView3.setImageDrawable(y2Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        h2Var.addView(imageView3, w7.a6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.x0 = imageView4;
        imageView4.setImageDrawable(y2Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        h2Var.addView(imageView4, w7.a6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new org.telegram.ui.web.c(u7Var, 25));
        imageView3.setOnClickListener(new hi.c(this, f6Var, u7Var, context, y2Var, 13));
        m91 m91Var = new m91(context, 11);
        this.y0 = m91Var;
        h2Var.addView(m91Var, w7.a6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        kj0 kj0Var = new kj0(context);
        this.z0 = kj0Var;
        kj0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        m91Var.addView(kj0Var);
        ImageView imageView5 = new ImageView(context);
        this.A0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(y2Var.t);
        m91Var.addView(imageView5);
        imageView5.setVisibility(8);
        z6 z6Var = new z6(context);
        this.C0 = z6Var;
        z6Var.setOnClickListener(new l1(this, 2));
        h2Var.addView(z6Var, w7.a6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        m91Var.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h1
            public final /* synthetic */ a3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        a3 a3Var = this.b;
                        long j3 = UserConfig.getInstance(a3Var.C2).clientUserId;
                        long j10 = a3Var.B1;
                        u7 u7Var2 = u7Var;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                u7Var2.H(eo.R9(j10));
                                break;
                            } else {
                                u7Var2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle e = org.telegram.ui.Cells.r6.e(1, TeXSymbolParser.TYPE_ATTR);
                            e.putLong("dialog_id", a3Var.B1);
                            u7Var2.H(new la0(e, null));
                            break;
                        }
                    default:
                        a3 a3Var2 = this.b;
                        if (!a3Var2.O1.j()) {
                            a3Var2.c1(true);
                            break;
                        } else {
                            u7Var.O();
                            if (!u7.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a3Var2.y0.setContentDescription(LocaleController.getString(!u7.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.p1 = new v6(this, y2Var);
        h2Var.addView(l2Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        o1 o1Var = new o1(this, context, u7Var, u7Var.v, view, frameLayout, u7Var);
        this.L0 = o1Var;
        h2Var.addView(view, w7.a6.e(-1, 200, 87));
        h2Var.addView(o1Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        h2Var.addView(frameLayout, w7.a6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        m91Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        b2Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        b2Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        ca caVar = l2Var.W;
        View o9 = caVar.o(context);
        if (o9 != null) {
            AndroidUtilities.removeFromParent(o9);
            addView(o9);
        }
        caVar.D = new org.telegram.ui.z0(this, 3);
        caVar.T(this);
    }

    public static void V0(h5 h5Var, ImageReceiver imageReceiver, String str) {
        if (h5Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(h5Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(h5Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(a3 a3Var, ValueAnimator valueAnimator) {
        z6 z6Var = a3Var.C0;
        a3Var.d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x2 x2Var = a3Var.o1;
        x2Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.d4);
        x2Var.setAlpha(1.0f - a3Var.d4);
        ImageView imageView = a3Var.w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.d4);
        imageView.setAlpha(1.0f - a3Var.d4);
        ImageView imageView2 = a3Var.x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.d4);
        imageView2.setAlpha(1.0f - a3Var.d4);
        m91 m91Var = a3Var.y0;
        m91Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.d4);
        m91Var.setAlpha((1.0f - a3Var.d4) * a3Var.e3);
        b2 b2Var = a3Var.W1;
        if (b2Var != null) {
            b2Var.setTranslationY(AndroidUtilities.dp(8.0f) * a3Var.d4);
            a3Var.W1.setAlpha(1.0f - a3Var.d4);
        }
        if (z6Var != null) {
            z6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.d4);
            z6Var.setAlpha(1.0f - a3Var.d4);
        }
        a3Var.K0.setAlpha(1.0f - a3Var.d4);
        w2 w2Var = a3Var.Q1;
        float f7 = w2Var == null ? 0.0f : ((l7) w2Var).d.V;
        float hideInterfaceAlpha = a3Var.getHideInterfaceAlpha();
        b2 b2Var2 = a3Var.D0;
        if (b2Var2 != null) {
            b2Var2.setAlpha((1.0f - a3Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = a3Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - a3Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        b2 b2Var3 = a3Var.P0;
        if (b2Var3 != null) {
            b2Var3.setAlpha((1.0f - a3Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        t1 t1Var = a3Var.b2;
        if (t1Var != null) {
            t1Var.setAlpha(1.0f - a3Var.d4);
            a3Var.invalidate();
        }
        a3Var.c1.invalidate();
    }

    public static void a0(a3 a3Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = a3Var.D3;
        if (g1Var == null || a3Var.C3 == null || g1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(u7.B1 - 0.2f) < 0.05f) {
                a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(u7.B1 - 0.5f) < 0.05f) {
                a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(u7.B1 - 1.0f) < 0.05f) {
                a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(u7.B1 - 1.5f) < 0.05f) {
                a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(u7.B1 - 2.0f) < 0.05f) {
                a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                a3Var.D3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, dd.a(u7.B1) + "x"));
            }
        }
        a3Var.C3.a(u7.B1, z10);
    }

    public static void b0(a3 a3Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (a3Var.I0() || a3Var.O1.f) {
            return;
        }
        if (UserConfig.getInstance(a3Var.C2).isPremium()) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, a3Var.B0).setOnClickListener(new l1(a3Var, 8));
            return;
        }
        Drawable drawable = a3Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        i01 i01Var = new i01(a3Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 2);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, a3Var.B0);
        c10.setOnClickListener(new l1(a3Var, 9));
        c10.setIcon(i01Var);
    }

    public static void d0(a3 a3Var) {
        z2 z2Var = a3Var.O1;
        TL_stories.StoryItem storyItem = z2Var.a;
        if ((storyItem == null && z2Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = z2Var.h();
        boolean z10 = z2Var.e;
        if (h == null || !h.exists()) {
            a3Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), a3Var.getContext(), z10 ? 1 : 0, null, null, new ve(6, a3Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(a3 a3Var, long j3) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(j3));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-j3));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new gg(a3Var, MessagesController.getInstance(a3Var.C2), j3, !z10, str, chat), 200L);
    }

    public static void f0(a3 a3Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a3Var.getContext(), 0, a3Var.B0);
        alertDialog$Builder.a.R = LocaleController.getString(a3Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.T = LocaleController.getString(a3Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g1(a3Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z9.a(14));
        l7 l7Var = (l7) a3Var.Q1;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        l7Var.h(d2Var);
        d2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.O2.c;
        g4 g4Var = this.J0.w;
        return (1.0f - (g4Var == null ? 0.0f : g4Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        u7 u7Var;
        if (!this.O1.f || (u7Var = this.J0) == null || u7Var.A0 == null || D0(true)) {
            return 0L;
        }
        return u7Var.A0.j();
    }

    public static void h0(a3 a3Var) {
        org.telegram.ui.ActionBar.f6 f6Var = a3Var.B0;
        h2 h2Var = a3Var.c1;
        if (a3Var.G1) {
            return;
        }
        if (!a3Var.E1) {
            t1 t1Var = a3Var.b2;
            int i10 = -a3Var.r1;
            a3Var.r1 = i10;
            AndroidUtilities.shakeViewSpring(t1Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = a3Var.B1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1))) : "";
            (MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked() ? new wc(h2Var, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new wc(h2Var, f6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new j1(a3Var, 5))).j();
            return;
        }
        if (a3Var.J3 != null && a3Var.K3 != null) {
            qg.k0.C1(new bi.o1(a3Var, 11), a3Var.J3, a3Var.K3, a3Var.B1, true);
            return;
        }
        u7 u7Var = a3Var.J0;
        if (u7Var != null) {
            u7Var.k1 = true;
            u7Var.P();
        }
        MessagesController.getInstance(a3Var.C2).getBoostsController().getBoostsStats(a3Var.B1, new bi.i5(a3Var, 9));
    }

    public static void j0(a3 a3Var) {
        z2 z2Var = a3Var.O1;
        if (z2Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = z2Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(a3Var.C2).getInputPeer(a3Var.B1);
        ConnectionsManager.getInstance(a3Var.C2).sendRequest(tL_stories_exportStoryLink, new a2());
    }

    public final void A0() {
        if (this.b3 != null) {
            return;
        }
        hn0 hn0Var = new hn0(getContext(), 4);
        this.b3 = hn0Var;
        hn0Var.setTextSize(1, 14.0f);
        this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.b3.setGravity(19);
        this.b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.b3, w7.a6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        b2 b2Var = new b2(this, getContext(), 0);
        this.W1 = b2Var;
        b2Var.setClickable(true);
        addView(this.W1, w7.a6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, getContext());
        this.F2 = u7Var;
        u7Var.setOnClickListener(new l1(this, 0));
        this.W1.addView(this.F2, w7.a6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        vh.b bVar = new vh.b(1, getContext(), false);
        this.B2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.a6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.a6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.x1.s);
        org.telegram.ui.u7 u7Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        u7Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.a3 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.StoryUnsupported));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextView textView2 = new TextView(getContext());
        w7.c6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.j6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new l1(this, 3));
        linearLayout.addView(textView, w7.a6.n(-1, -2));
        linearLayout.addView(textView2, w7.a6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.a6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.c1.addView(frameLayout);
        this.a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        t0 t0Var;
        TLRPC.Peer i10;
        t0 t0Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j3 = this.B1;
        u7 u7Var = this.J0;
        if (j3 >= 0 || (t0Var2 = u7Var.A0) == null) {
            if (j3 < 0 || u7Var == null || (t0Var = u7Var.A0) == null || !t0Var.l()) {
                return false;
            }
            return !z10 || (i10 = u7Var.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = t0Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
        if (u7Var.A0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.B1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.C2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        k2.v vVar = this.M2;
        org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) vVar.e;
        if (m4Var != null && ((SurfaceView) vVar.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) vVar.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (m4Var != null && (textureView = (TextureView) vVar.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        h2 h2Var = this.c1;
        canvas.scale(i10 / h2Var.getMeasuredWidth(), i11 / h2Var.getMeasuredHeight());
        this.e1.draw(canvas);
        canvas.restore();
    }

    public final void F0(pb pbVar, TL_stories.StoryItem storyItem) {
        w2 w2Var = this.Q1;
        rb rbVar = new rb(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.B0);
        rbVar.q1(pbVar);
        bi.p1 p1Var = rbVar.b;
        if (p1Var != null) {
            for (View view : p1Var.getViewPages()) {
                if (view instanceof kb) {
                    ((kb) view).e(false);
                }
            }
        }
        rbVar.k1(true);
        rbVar.T = new sg.f0(15, this, storyItem);
        ((l7) w2Var).h(rbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.f2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        bi.x4 x4Var;
        k2.v vVar;
        org.telegram.ui.m4 m4Var;
        if (viewGroup != null) {
            bi.x4 x4Var2 = this.F0;
            if ((x4Var2 == null || !x4Var2.V) && ((x4Var = this.G0) == null || !x4Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        l2 l2Var = this.K0;
                        if (childAt == l2Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                o6 o6Var = l2Var.b0;
                                if (o6Var.w == 1.0f && !l2Var.s0) {
                                    if (top > o6Var.getTranslationY() + (l2Var.r0.getTop() - l2Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.c1 || (vVar = this.M2) == null || (m4Var = (org.telegram.ui.m4) vVar.e) == null || !G0(m4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10))) {
                            f2 f2Var = this.j1;
                            if (childAt == f2Var && f2Var.b == null && (f7 < AndroidUtilities.dp(60.0f) || f7 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = f2Var.e;
                                float[] fArr = f2Var.f;
                                for (int i11 = 0; i11 < f2Var.getChildCount(); i11++) {
                                    View childAt2 = f2Var.getChildAt(i11);
                                    if (childAt2 != f2Var.d && (childAt2 instanceof b7)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                o1 o1Var = this.L0;
                                if (childAt == o1Var) {
                                    ic1 ic1Var = o1Var.f;
                                    zp0 zp0Var = o1Var.c;
                                    ic1 ic1Var2 = o1Var.f;
                                    ic1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - o1Var.getX()) - ic1Var2.getX()), (int) ((f10 - o1Var.getY()) - ic1Var2.getY()))) {
                                        if (o1Var.f0) {
                                            continue;
                                        } else if (!this.v2) {
                                            if (f10 <= o1Var.s() + o1Var.getY() && zp0Var.E(f7, (f10 - o1Var.getY()) - zp0Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.v2) {
                                        if (childAt == this.b2 && f10 > rect2.top) {
                                        }
                                    }
                                    if (!z10) {
                                        if (rect2.contains((int) f7, (int) f10)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            t1 t1Var = this.b2;
                                            if (t1Var != null && childAt == t1Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && G0((ViewGroup) childAt, f7 - childAt.getX(), f10 - childAt.getY(), z10)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        h2 h2Var = this.c1;
        float x11 = view.getX() + h2Var.getX() + x10;
        float y3 = view.getY() + h2Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean I0() {
        a5 a5Var;
        u7 u7Var = this.J0;
        return (u7Var == null || (a5Var = u7Var.O0) == null || a5Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(yg.p0 p0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        z2 z2Var = this.O1;
        TL_stories.StoryItem storyItem = z2Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && p0Var == null) {
            l0();
            this.S1.g0(this.B1, z2Var.a, null);
        } else if (p0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = yg.l0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.q3 = true;
                this.S1.g0(this.B1, z2Var.a, yg.p0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, z2Var.a, p0Var);
        }
        TL_stories.StoryItem storyItem2 = z2Var.a;
        b2 b2Var = this.D0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.E0.setReaction(null);
            b2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.E0.setReaction(yg.p0.d(reaction));
            b2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.D1 && z11) {
            TL_stories.StoryItem storyItem3 = z2Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = z2Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = z2Var.a;
        yg.r0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        t0 t0Var;
        if (this.O3 != null) {
            return;
        }
        u7 u7Var = this.J0;
        if (u7Var != null && (t0Var = u7Var.A0) != null) {
            if (t0Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
        this.O3 = sendAsPeers;
        t1 t1Var = this.b2;
        if (t1Var == null || sendAsPeers == null) {
            return;
        }
        t1Var.P1(true);
    }

    public final boolean N0() {
        t1 t1Var = this.b2;
        if (t1Var == null) {
            return false;
        }
        boolean z10 = t1Var.y2;
        if (z10) {
            t1Var.s1();
        }
        AndroidUtilities.runOnUIThread(new j1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        org.telegram.ui.web.y1 y1Var;
        int i10;
        long j10;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.L3;
        org.telegram.ui.web.y1 y1Var2 = new org.telegram.ui.web.y1(this, 24);
        b bVar = new b();
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, (org.telegram.ui.ActionBar.f6) bVar, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        h3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j3 = j11;
            y1Var = y1Var2;
            i10 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j11;
            y1Var = y1Var2;
            i10 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j3 <= 0 ? 100L : j3);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                j10 = messageMinPrice;
                break;
            }
            int i13 = length * 7;
            int i14 = iArr[i13];
            j10 = messageMinPrice;
            int i15 = iArr[i13 + 2];
            if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                max = Math.max(max, i14);
                break;
            } else {
                length--;
                messageMinPrice = j10;
            }
        }
        final long[] jArr = {max};
        final uq[] uqVarArr = new uq[1];
        final bi.d dVar = new bi.d(context, null, true);
        final k0 k0Var = new k0();
        k0Var.c = clientUserId;
        k0Var.f = textWithEntities;
        k0Var.g = jArr[0];
        final f0 f0Var = new f0(i12, context, true);
        LinearLayout f7 = em.f(context, 0);
        final xh.a7 a7Var = new xh.a7(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f7.addView(a7Var, w7.a6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final xh.a7 a7Var2 = new xh.a7(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f7.addView(a7Var2, w7.a6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final xh.a7 a7Var3 = new xh.a7(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f7.addView(a7Var3, w7.a6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final n nVar = new n(context, bVar, r6);
        final boolean[] zArr = {true};
        org.telegram.ui.web.y1 y1Var3 = y1Var;
        long j12 = j10;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: zh.m
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(xh.z7.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), uqVarArr), true, true);
                long j13 = jArr2[0];
                k0 k0Var2 = k0Var;
                k0Var2.g = j13;
                f0Var.set(k0Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = o.b(i16, intValue2, 0);
                int b11 = o.b(i16, num.intValue(), 1);
                int b12 = o.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.o6) a7Var.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.o6) a7Var2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.o6) a7Var3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = o.b(i16, num.intValue(), 3);
                int b14 = o.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                nVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        f0Var.set(k0Var);
        int i16 = 9;
        int[] iArr2 = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        int i17 = MessagesController.getInstance(i12).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        while (true) {
            if (i18 >= i16) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i18] >= j12) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j12) {
                    arrayList.add(Integer.valueOf((int) j12));
                }
                int i19 = iArr3[i18];
                if (i19 <= i17) {
                    arrayList.add(Integer.valueOf(i19));
                    if (iArr3[i18] == i17) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i17));
                    break;
                }
            }
            i18++;
            iArr2 = iArr3;
            i16 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) hc.b.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        nVar.e0 = iArr4;
        nVar.setValue((int) jArr[0]);
        linearLayout.addView(nVar, w7.a6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f7, w7.a6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = w7.e6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.a6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.e6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        em.p(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.a6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(f0Var, w7.a6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.a6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        h3Var.show();
        dVar.setOnClickListener(new wh.r(y1Var3, jArr, h3Var, 5));
    }

    public final void P0() {
        if (this.b2 == null) {
            return;
        }
        t0();
        this.I2.j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.b2.P();
        }
        this.I2.J1(-1, true);
        gg.m mVar = this.I2;
        mVar.Z = this.B1;
        mVar.r1();
        this.I2.m1().setText(this.b2.getFieldText());
        ((l7) this.Q1).h(this.I2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j3 = this.B1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new eo(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(long j3) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j10;
        bi.f5 f5Var;
        t0 t0Var;
        boolean z10 = this.K1;
        k2.v vVar = this.M2;
        if (!z10) {
            vVar.e = null;
            return;
        }
        z2 z2Var = this.O1;
        boolean z11 = z2Var.f;
        h2 h2Var = this.c1;
        if (!z11) {
            if (!z2Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): null, not a video");
                ((l7) this.Q1).c(null, null, 0L, this.M2);
                vVar.e = null;
                vVar.a = false;
                return;
            }
            if (z2Var.f() == null || !new File(z2Var.f()).exists()) {
                TL_stories.StoryItem storyItem = z2Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.B1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = z2Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.C2).getFileReference(z2Var.a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.C2);
                            sb2.append("&id=");
                            sb2.append(document2.id);
                            sb2.append("&hash=");
                            sb2.append(document2.access_hash);
                            sb2.append("&dc=");
                            sb2.append(document2.dc_id);
                            sb2.append("&size=");
                            sb2.append(document2.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(z2Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(z2Var.a.id);
                            sb2.append("&did=");
                            sb2.append(z2Var.a.dialogId);
                            Uri parse = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb2.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j3 + "): playing from " + parse);
                            this.R2 = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((l7) this.Q1).c(document, uri, j3, this.M2);
                            h2Var.invalidate();
                            return;
                        }
                    } catch (Exception unused2) {
                        document2 = null;
                    }
                } else {
                    document = null;
                    uri = null;
                }
            } else {
                Uri fromFile = Uri.fromFile(new File(z2Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j3 + "): playing from attachPath " + fromFile);
                this.R2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): playing from null?");
            }
            ((l7) this.Q1).c(document, uri, j3, this.M2);
            h2Var.invalidate();
            return;
        }
        w2 w2Var = this.Q1;
        TL_stories.StoryItem storyItem3 = z2Var.a;
        long j11 = this.B1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        l7 l7Var = (l7) w2Var;
        l7Var.i(true, true);
        u7 u7Var = l7Var.d;
        t0 t0Var2 = u7Var.A0;
        if (t0Var2 == null || t0Var2.b != j11 || !t0Var2.f(inputGroupCall)) {
            bi.f5 f5Var2 = u7Var.D0;
            if (f5Var2 != null) {
                f5Var2.d(j11, null);
                bi.f5 f5Var3 = u7Var.D0;
                SurfaceViewRenderer surfaceViewRenderer = f5Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = f5Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                f5Var3.r = false;
                f5Var3.e(false, false);
            }
            x0 x0Var = x0.Z;
            if (x0Var.S && (t0Var = x0Var.v) != null && t0Var.f(inputGroupCall)) {
                t0 t0Var3 = x0Var.v;
                x0Var.v = null;
                u7Var.A0 = t0Var3;
                x0Var.k(false);
            } else {
                t0 t0Var4 = u7Var.A0;
                if (t0Var4 != null) {
                    if (!t0Var4.n && (!x0Var.S || x0Var.v != t0Var4)) {
                        t0Var4.e();
                    } else if (t0Var4.O != u7Var.D0.getSink()) {
                        u7Var.A0.s(null);
                    }
                    u7Var.A0 = null;
                }
            }
            if (x0Var.S) {
                x0.j();
            }
            t7 t7Var = u7Var.z0;
            if (t7Var != null) {
                t7Var.release(null);
                u7Var.z0 = null;
            }
            k2.v vVar2 = u7Var.G0;
            if (vVar2 != null) {
                vVar2.c = null;
                vVar2.b = null;
                vVar2.a = false;
                vVar2.e = null;
                vVar2.f = null;
                vVar2.d = null;
                vVar2.b();
                u7Var.G0 = null;
            }
            if (u7Var.A0 == null) {
                t0 t0Var5 = t0.W;
                if (t0Var5 == null || !t0Var5.f(inputGroupCall)) {
                    t0 t0Var6 = new t0(l7Var.c, u7Var.h, storyItem3, j11, i10, z12, inputGroupCall, false, false);
                    j10 = j11;
                    u7Var.A0 = t0Var6;
                    f5Var = u7Var.E0;
                    if (f5Var == null) {
                        u7Var.A0.s(f5Var.getSink());
                    } else {
                        u7Var.A0.s(u7Var.D0.getSink());
                    }
                    u7Var.G0 = vVar;
                    vVar.a = false;
                    vVar.e = u7Var.y0;
                    bi.f5 f5Var4 = u7Var.D0;
                    vVar.f = f5Var4.d;
                    vVar.d = f5Var4.c;
                    vVar.b = u7Var.A0;
                    f5Var4.d(j10, vVar);
                    u7Var.G0.b();
                } else {
                    u7Var.A0 = t0.W;
                }
            }
            j10 = j11;
            f5Var = u7Var.E0;
            if (f5Var == null) {
            }
            u7Var.G0 = vVar;
            vVar.a = false;
            vVar.e = u7Var.y0;
            bi.f5 f5Var42 = u7Var.D0;
            vVar.f = f5Var42.d;
            vVar.d = f5Var42.c;
            vVar.b = u7Var.A0;
            f5Var42.d(j10, vVar);
            u7Var.G0.b();
        }
        h2Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(Uri uri) {
        TL_stories.StoryItem storyItem;
        Uri parse;
        String str;
        String str2;
        boolean z10;
        if (uri == null || (storyItem = this.O1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = uri2.split("/1/")[1];
                int indexOf = str3.indexOf("/ACTUAL");
                parse = indexOf != -1 ? Uri.parse(URLDecoder.decode(str3.substring(0, indexOf), "UTF-8")) : uri;
            } catch (Exception e) {
                FileLog.e(e);
            }
            String path = AndroidUtilities.getPath(parse);
            if (BuildVars.NO_SCOPED_STORAGE) {
                str = path;
                str2 = str;
                z10 = true;
            } else {
                if (path == null) {
                    String uri3 = parse.toString();
                    String copyFileToCache = MediaController.copyFileToCache(parse, "file");
                    if (copyFileToCache == null) {
                        Z0();
                        return;
                    } else {
                        str2 = uri3;
                        str = copyFileToCache;
                    }
                } else {
                    str = path;
                    str2 = str;
                }
                z10 = false;
            }
            if (z10) {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str, str2, null, null, null, this.B1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            } else {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, parse, null, null, this.B1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            }
        }
        parse = uri;
        String path2 = AndroidUtilities.getPath(parse);
        if (BuildVars.NO_SCOPED_STORAGE) {
        }
        if (z10) {
        }
    }

    public final void T0(long j3, boolean z10) {
        if (this.K1 != z10) {
            this.K1 = z10;
            kj0 kj0Var = this.z0;
            if (z10) {
                if (this.J0.a && Build.VERSION.SDK_INT < 33) {
                    u7 u7Var = ((l7) this.Q1).d;
                    u7Var.l1 = true;
                    u7Var.P();
                    sg.a1 a1Var = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var, 100L);
                }
                R0(j3);
                g1();
                kj0Var.setAnimation(this.x1.u);
                this.K1 = true;
                this.o1.a.getImageReceiver().setVisible(true, true);
                z2 z2Var = this.O1;
                if (z2Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + z2Var.a.id + " " + z2.c(z2Var));
                }
            } else {
                p0();
                kj0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.c1.invalidate();
                invalidate();
                q0();
                u7 u7Var2 = ((l7) this.Q1).d;
                u7Var2.I0 = false;
                u7Var2.P();
            }
            this.e1.setFileLoadingPriority(this.K1 ? 3 : 2);
            this.f1.setFileLoadingPriority(this.K1 ? 2 : 0);
            this.g1.setFileLoadingPriority(this.K1 ? 2 : 0);
            if (this.C1 || this.D1) {
                i5 i5Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar = i5Var.m;
                d8 d8Var = (d8) iVar.f(j10);
                if (d8Var == null) {
                    d8Var = new d8(i5Var.a, j10, i5Var);
                    iVar.k(d8Var, j10);
                }
                d8Var.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            z2 z2Var = this.O1;
            z2Var.b = null;
            z2Var.a = null;
        }
        this.B1 = j3;
        this.z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        i5 i5Var = this.S1;
        TL_stories.PeerStories y3 = i5Var.y(j3);
        if (y3 == null) {
            y3 = i5Var.z(j3);
        } else {
            z10 = false;
        }
        i5Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        x2 x2Var = this.o1;
        if (j3 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
            org.telegram.ui.Cells.f4 f4Var = x2Var.b;
            org.telegram.ui.Cells.f4 f4Var2 = x2Var.b;
            f4Var.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                f4Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            vq vqVar = new vq(mutate, null);
            vqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            vqVar.h = dp;
            vqVar.n = dp2;
            f4Var2.i(vqVar);
            return;
        }
        if (this.C1 && !z11) {
            x2Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            x2Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
        if (user == null || !user.verified) {
            x2Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            vq vqVar2 = new vq(mutate2, null);
            vqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            vqVar2.h = dp3;
            vqVar2.n = dp4;
            x2Var.b.i(vqVar2);
        }
        if (user != null) {
            x2Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), x2Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            x2Var.b.l(null, false);
        }
    }

    public final void X0(float f7, float f10, f3 f3Var) {
        this.m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 == f3Var) {
            return;
        }
        this.l1 = f3Var;
        if (f3Var != null) {
            ImageReceiver imageReceiver = f3Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        z2 z2Var = this.O1;
        if (z2Var.a != null) {
            u7 u7Var = this.J0;
            if (u7Var.f != null) {
                String e = z2Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e);
                    LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                z1 z1Var = new z1(this, u7Var.f.getContext(), e, e, MessagesController.getInstance(this.C2).storiesEnabled() && (!(this.D1 || UserObject.isService(this.B1)) || ChatObject.isPublic(this.D1 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null)), new bi.n1(7, this.B0));
                this.Z2 = z1Var;
                z1Var.i0 = true;
                TL_stories.StoryItem storyItem = z2Var.a;
                storyItem.dialogId = this.B1;
                z1Var.F0 = storyItem;
                z1Var.s0 = new l2.g(this, 26);
                ((l7) this.Q1).h(z1Var);
            }
        }
    }

    public final void Z0() {
        h2 h2Var = this.c1;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        org.telegram.messenger.a2.p(R.string.UnsupportedAttachment, new wc(h2Var, f6Var), f6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.T = string;
        ((l7) this.Q1).h(d2Var);
    }

    public final void b1(boolean z10) {
        if (this.s3 != z10) {
            z2 z2Var = this.O1;
            if (z2Var.a == null) {
                return;
            }
            this.s3 = z10;
            int i10 = 0;
            if (z10) {
                this.r3.setVisibility(0);
            }
            this.r3.setStoryItem(z2Var.a);
            u7 u7Var = ((l7) this.Q1).d;
            u7Var.p1 = z10;
            u7Var.P();
            if (!z10) {
                if (this.r3.getReactionsWindow() != null) {
                    this.r3.getReactionsWindow().e();
                }
                this.r3.animate().alpha(0.0f).setDuration(150L).setListener(new q1(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, z10 ? 1.0f : 0.0f);
            this.r3.setTransitionProgress(this.t3);
            ofFloat.addUpdateListener(new k1(this, 1));
            ofFloat.addListener(new p1(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(wr.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.G0 == null) {
            bi.x4 x4Var = new bi.x4(getContext(), 1);
            x4Var.l(1.0f, -56.0f);
            this.G0 = x4Var;
            x4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.c1.addView(this.G0, w7.a6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.G0.s(LocaleController.getString(z10 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.G0.u();
    }

    public final boolean d1(boolean z10) {
        if (this.J0.R0) {
            z10 = !z10;
        }
        if (!z10) {
            int i10 = this.J1;
            if (i10 > 0) {
                this.J1 = i10 - 1;
                f1(false);
                return true;
            }
        } else if (this.J1 < getStoriesCount() - 1) {
            this.J1++;
            f1(false);
            return true;
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t0 t0Var;
        int i12 = NotificationCenter.storiesUpdated;
        u7 u7Var = this.J0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && u7Var.O0 == objArr[0])) {
            w2 w2Var = this.Q1;
            if (w2Var == null || !((l7) w2Var).d.H0) {
                if (this.K1) {
                    j1();
                    if (this.A1 == 0) {
                        if (this.E2) {
                            return;
                        }
                        this.E2 = true;
                        ((l7) this.Q1).j();
                        return;
                    }
                    int i13 = this.J1;
                    ArrayList arrayList = this.v1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.w1;
                    if (i13 >= arrayList2.size() + size) {
                        this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    f1(false);
                    if (this.C1 || this.D1) {
                        k1(true);
                    }
                }
                TL_stories.PeerStories peerStories = u7Var.Q0;
                if (peerStories != null) {
                    this.S1.S(peerStories, true);
                } else {
                    long j3 = this.B1;
                    if (j3 != 0) {
                        i5 i5Var = this.S1;
                        TL_stories.PeerStories y3 = i5Var.y(j3);
                        if (y3 == null) {
                            y3 = i5Var.z(j3);
                            z10 = true;
                        }
                        i5Var.S(y3, z10);
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.s1;
                if (g1Var != null) {
                    g1Var.animate().alpha((this.S1.K(this.B1) && this.O1.e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storyQualityUpdate) {
            f1(false);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            this.K0.b0.invalidate();
            return;
        }
        if (i10 == NotificationCenter.stealthModeChanged) {
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            j4.w o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
            if (o9 == null || !o9.a(this.C2, 1) || this.Q1 == null) {
                return;
            }
            bi.o1 o1Var = new bi.o1(this, 11);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            ((l7) this.Q1).h(new qg.k0(o9.b(), this.C2, findActivity, o1Var, null));
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            boolean z11 = this.B1 >= 0 && !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            if (this.F1 == z11 && this.H1 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                return;
            }
            this.F1 = z11;
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            f1(false);
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).id)) {
                f1(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.liveStoryUpdated) {
            if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (u7Var == null || (t0Var = u7Var.A0) == null || t0Var.g() != longValue) {
            return;
        }
        f1(false);
        t1 t1Var = this.b2;
        if (t1Var != null) {
            t1Var.K(true);
            this.b2.P1(true);
            r0(true);
        }
        o1 o1Var2 = this.L0;
        if (o1Var2 != null) {
            t0 t0Var2 = o1Var2.P;
            if (o1Var2.H != (t0Var2 != null ? t0Var2.j() : 0L)) {
                o1Var2.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        le leVar;
        Canvas canvas2;
        org.telegram.ui.Components.n6 n6Var;
        org.telegram.ui.Components.n6 n6Var2;
        l1();
        if (this.D1 && (n6Var2 = this.Q0) != null) {
            n6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (n6Var = this.R0) != null) {
            n6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.u3;
        LinearLayout linearLayout = this.O0;
        b2 b2Var = this.D0;
        if (z10) {
            float measuredWidth = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.w3, measuredWidth - f7, wr.g.getInterpolation(this.v3));
            float lerp2 = AndroidUtilities.lerp(this.x3, measuredHeight - f7, this.v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.v3);
            if (this.p3) {
                org.telegram.ui.Components.p5 p5Var = this.o3;
                if (p5Var != null) {
                    float f10 = lerp3;
                    p5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.q3) {
            float measuredWidth2 = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.p3) {
                yg.e eVar = this.m3;
                if (eVar != null) {
                    float f12 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f12), (int) (measuredHeight2 - f12), (int) (measuredWidth2 + f12), (int) (measuredHeight2 + f12));
                    this.m3.b(canvas);
                    if (this.m3.c()) {
                        this.m3.d(this);
                        this.m3 = null;
                        this.q3 = false;
                    }
                } else {
                    this.q3 = false;
                }
            } else {
                float f13 = dp2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.l3;
                imageReceiver2.setImageCoords(f15, f16, f13, f13);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.q3 = false;
                }
            }
        }
        t1 t1Var = this.b2;
        if (t1Var != null) {
            ne neVar = t1Var.x1;
            le leVar2 = t1Var.y1;
            if (t1Var.getAlpha() == 0.0f || (leVar = t1Var.e1) == null || leVar.getParent() == null || t1Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(t1Var.e1.getX() + neVar.getX() + leVar2.getX() + t1Var.getX(), t1Var.e1.getY() + neVar.getY() + leVar2.getY() + t1Var.getY());
            if (t1Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, t1Var.getMeasuredWidth(), t1Var.getMeasuredHeight(), (int) (t1Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            t1Var.e1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        eh.d dVar;
        float dp;
        if (view == this.d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.d3.getY(), getMeasuredWidth(), this.d3.getY() + this.d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        t1 t1Var = this.b2;
        Paint paint = this.n2;
        b2 b2Var = this.D0;
        y2 y2Var = this.x1;
        if (view == t1Var) {
            float f7 = this.q2;
            z2 z2Var = this.O1;
            if (f7 > 0.0f && !z2Var.f) {
                y2Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y2Var.l);
            }
            RectF rectF = y2Var.h;
            RectF rectF2 = y2Var.i;
            RectF rectF3 = y2Var.j;
            rectF.set(this.b2.getX(), this.b2.getY() + this.b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.b2.getX() + this.b2.getMeasuredWidth(), this.b2.getY() + this.b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (z2Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                b1 b1Var = this.a2;
                if (b1Var != null && b1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (b2Var != null && b2Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + b2Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.b2.setTranslationX((1.0f - this.q2) * dp);
            this.b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.q2, -AndroidUtilities.dp(2.0f), this.b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.q2) * (this.b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, y2Var.h, this.q2, rectF3);
            bh.d dVar2 = this.l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(dp3);
                dVar2.setAlpha((int) ((1.0f - this.d4) * (1.0f - this.r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (t1Var != null && t1Var.u0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = y2Var.k;
                RectF rectF5 = y2Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.a4;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                bh.d dVar3 = this.m2;
                if (dVar3 != null) {
                    dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    dVar3.q(dp4, dp4, dp4, dp4);
                    dVar3.setAlpha(255);
                    dVar3.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, dp4, dp4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.f2 || this.b2 == null) {
                if (view == this.r3) {
                    view.setTranslationY((this.O0.getY() + (b2Var.getY() + (-(r2.getMeasuredHeight() - this.r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    h2 h2Var = this.c1;
                    if (view == h2Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(h2Var.getX(), h2Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            } else {
                view.setTranslationY(((this.b2.getY() + this.b2.getAnimatedTop()) + (-r2.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        if (MessagesController.getInstance(this.C2).storiesEnabled()) {
            File h = this.O1.h();
            if (h == null || !h.exists()) {
                a1();
                return;
            }
            z1 z1Var = this.Z2;
            if (z1Var != null) {
                z1Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new j1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0948, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.i41.A()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x09a8, code lost:
    
        if (r3 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x09cd, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0ae1, code lost:
    
        if (r4 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0afa, code lost:
    
        if (r4 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ca1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0d21  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d99  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0db1 A[EDGE_INSN: B:311:0x0db1->B:312:0x0db1 BREAK  A[LOOP:0: B:300:0x0d8f->B:309:0x0dae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0e62  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e71  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0e91  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f2b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0f5c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0ffe  */
    /* JADX WARN: Removed duplicated region for block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0edb  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e35  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0e1c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0405  */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73, types: [org.telegram.tgnet.tl.TL_stories$StoryItem, zh.j6] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        h5 h5Var;
        TL_stories.StoryItem storyItem;
        h5 h5Var2;
        boolean z11;
        boolean z12;
        int i10;
        iz izVar;
        TL_stories.StoryItem storyItem2;
        gg.h1 h1Var;
        boolean z13;
        r7 r7Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        u7 u7Var;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        u7 u7Var2;
        h5 h5Var3;
        TLRPC.MessageMedia messageMedia;
        r9 r9Var;
        TL_stories.StoryItem storyItem6;
        h5 h5Var4;
        int i11;
        r9 r9Var2;
        boolean z16;
        h2 h2Var;
        l2 l2Var;
        x2 x2Var;
        t1 t1Var;
        boolean z17;
        h5 h5Var5;
        pc pcVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        gg.h1 h1Var2;
        boolean z19;
        h5 h5Var6;
        z2 z2Var;
        boolean z20;
        boolean z21;
        h2 h2Var2;
        l2 l2Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        bi.x4 x4Var;
        bi.x4 x4Var2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence4;
        TL_stories.StoryItem storyItem10;
        w2 w2Var;
        boolean z24;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        boolean z27;
        t1 t1Var2;
        t1 t1Var3;
        int i13;
        boolean z28;
        boolean z29;
        boolean z30;
        int i14;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        ih.h hVar;
        a aVar;
        b1 b1Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i15;
        int i16;
        boolean z37;
        boolean z38;
        boolean l4;
        h5 h5Var7;
        h5 h5Var8;
        bi.x4 x4Var3;
        ImageView imageView;
        ImageView imageView2;
        boolean z39;
        int i17;
        boolean z40;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i18;
        int i19;
        int i20;
        boolean z41;
        int i21;
        boolean z42;
        boolean z43;
        TL_stories.StoryItem storyItem13;
        int i22;
        int i23;
        FrameLayout.LayoutParams layoutParams;
        int dp;
        boolean z44;
        boolean z45;
        int i24;
        boolean z46;
        t0 t0Var;
        int i25;
        boolean z47;
        int i26;
        boolean z48;
        int i27;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        t0 t0Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        gg.h1 h1Var3;
        boolean z53;
        u7 u7Var3;
        iz izVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        a5 a5Var;
        ArrayList arrayList2 = this.v1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.w1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.V2 = true;
        z2 z2Var2 = this.O1;
        TL_stories.StoryItem storyItem14 = z2Var2.a;
        h5 h5Var9 = z2Var2.b;
        String s10 = a6.s();
        this.Z0 = false;
        this.c3 = false;
        int i28 = this.J1;
        boolean z54 = this.T1;
        boolean z55 = this.U1;
        boolean z56 = this.V1;
        u7 u7Var4 = this.J0;
        if (u7Var4 == null || (a5Var = u7Var4.O0) == null || a5Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i28 < 0 || i28 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i28);
            int size = i28 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            h5Var = (size < 0 || size >= arrayList3.size()) ? null : (h5) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            h5Var = (i28 < 0 || i28 >= arrayList3.size()) ? null : (h5) arrayList3.get(i28);
            int size2 = i28 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        z2Var2.c = null;
        f2 f2Var = this.j1;
        int i29 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        iz izVar3 = this.k1;
        gg.h1 h1Var4 = this.e1;
        if (h5Var != null) {
            r9 r9Var3 = h5Var.c;
            this.U1 = false;
            boolean z57 = h5Var.I;
            this.V1 = z57;
            this.T1 = !z57;
            h1Var4.setCrossfadeWithOldImage(false);
            h1Var4.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = r9Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (h5Var.s || h5Var.H) {
                h5Var2 = h5Var9;
                h1Var3 = h1Var4;
                z11 = z54;
                z53 = z55;
                z12 = z56;
                u7Var3 = u7Var4;
                i10 = i28;
                izVar2 = izVar3;
                r62 = 0;
                this.e1.setImage(null, null, ImageLocation.getForPath(h5Var.f), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                h5Var2 = h5Var9;
                izVar2 = izVar3;
                r62 = 0;
                h1Var3 = h1Var4;
                z11 = z54;
                z12 = z56;
                z53 = z55;
                u7Var3 = u7Var4;
                i10 = i28;
                this.e1.setImage(null, null, ImageLocation.getForPath(h5Var.e), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            z2Var2.b = h5Var;
            z2Var2.j = r62;
            z2Var2.i = r62;
            z2Var2.a = r62;
            z2Var2.d = false;
            z2Var2.e = z2Var2.m();
            TL_stories.StoryItem storyItem17 = z2Var2.a;
            z2Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            izVar = izVar2;
            f2Var.c(r62, y6.a(r9Var3), izVar);
            this.U2 = false;
            this.T2 = false;
            this.S2 = false;
            storyItem2 = storyItem14;
            z13 = z53;
            h1Var = h1Var3;
            u7Var = u7Var3;
        } else {
            h5Var2 = h5Var9;
            z11 = z54;
            z12 = z56;
            i10 = i28;
            izVar = izVar3;
            this.T1 = false;
            this.U1 = false;
            this.V1 = false;
            if (storyItem == null) {
                if (u7Var4 != null) {
                    u7Var4.q(true);
                    return;
                }
                return;
            }
            h5 t10 = this.S1.t(this.B1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.U1 = true;
                h1Var4.setCrossfadeWithOldImage(false);
                if (this.i1 != null) {
                    i29 = 0;
                }
                h1Var4.setCrossfadeDuration(i29);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    h5Var3 = t10;
                    h1Var = h1Var4;
                    u7Var2 = u7Var4;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    u7Var2 = u7Var4;
                    h1Var = h1Var4;
                    h5Var3 = t10;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                z2Var2.b = h5Var3;
                z2Var2.j = null;
                z2Var2.i = null;
                z2Var2.a = null;
                z2Var2.d = false;
                z2Var2.e = z2Var2.m();
                TL_stories.StoryItem storyItem18 = z2Var2.a;
                z2Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                f2Var.c(null, y6.a(h5Var3.c), izVar);
                z2Var2.c = storyItem;
                this.U2 = false;
                this.T2 = false;
                this.S2 = false;
                z13 = z55;
                u7Var = u7Var2;
            } else {
                storyItem2 = storyItem14;
                h1Var = h1Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.B1;
                z13 = z55;
                h1Var.setCrossfadeWithOldImage(z13);
                h1Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.c3 = true;
                    MessagesController.getInstance(this.C2).getStoriesController().p(storyItem.id, this.B1);
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z58 = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (z58) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            Drawable createStripedBitmap = messageMedia6 != null ? ImageLoader.createStripedBitmap(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (ImageLoader.getInstance().isInMemCache(ImageLocation.getForPath(storyItem.firstFramePath).getKey(null, null, false) + "@" + s10, false)) {
                                    this.e1.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s10, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            this.e1.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), org.telegram.ui.Cells.r6.t(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
                        } else {
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable createStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z13) {
                                this.e1.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, ImageLocation.getForPath(storyItem.firstFramePath), s10, createStripedBitmap2, 0L, null, null, 0);
                            } else {
                                this.e1.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, null, null, createStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                    } else {
                        Drawable drawable = ((u7Var4.O0 != null || u7Var4.N0) && (r7Var = u7Var4.s0) != null && (imageReceiver = r7Var.c) != null && r7Var.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.B1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String t11 = org.telegram.ui.Cells.r6.t(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            u7Var = u7Var4;
                            this.e1.setImage(null, null, forDocument, t11, forDocument2, s10, drawable, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            u7Var = u7Var4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                h1Var.clearImage();
                                storyItem3.dialogId = this.B1;
                                f2Var.d(z10 ? null : storyItem3, izVar);
                                z2Var2.n(storyItem3);
                                z14 = (!this.c3 || (storyItem5 = z2Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.U2 = z14;
                                this.S2 = z14;
                                if (z14) {
                                    this.S2 = z2Var2.d() && z2Var2.a.isPublic;
                                }
                                if (this.S2) {
                                    TL_stories.StoryItem storyItem19 = z2Var2.a;
                                    this.S2 = storyItem19.pinned || !a6.w(this.C2, storyItem19);
                                }
                                z15 = this.S2;
                                this.T2 = z15;
                                if (z15 && this.D1) {
                                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                                    this.T2 = chat == null && ChatObject.isPublic(chat);
                                }
                                if (this.U2) {
                                    if (this.D1) {
                                        TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                                        this.U2 = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                                    } else {
                                        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
                                        this.U2 = (user == null || UserObject.getPublicUsername(user) == null || !z2Var2.a.isPublic) ? false : true;
                                    }
                                }
                                NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                storyItem4 = storyItem3;
                                this.e1.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), s10, null, null, drawable, 0L, null, storyItem4, 0);
                            }
                        }
                        storyItem3 = storyItem4;
                        storyItem3.dialogId = this.B1;
                        f2Var.d(z10 ? null : storyItem3, izVar);
                        z2Var2.n(storyItem3);
                        if (!this.c3) {
                        }
                        this.U2 = z14;
                        this.S2 = z14;
                        if (z14) {
                        }
                        if (this.S2) {
                        }
                        z15 = this.S2;
                        this.T2 = z15;
                        if (z15) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                            this.T2 = chat3 == null && ChatObject.isPublic(chat3);
                        }
                        if (this.U2) {
                        }
                        NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
                    }
                }
                storyItem3 = storyItem;
                u7Var = u7Var4;
                storyItem3.dialogId = this.B1;
                f2Var.d(z10 ? null : storyItem3, izVar);
                z2Var2.n(storyItem3);
                if (!this.c3) {
                }
                this.U2 = z14;
                this.S2 = z14;
                if (z14) {
                }
                if (this.S2) {
                }
                z15 = this.S2;
                this.T2 = z15;
                if (z15) {
                }
                if (this.U2) {
                }
                NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
            }
        }
        TL_stories.StoryItem storyItem20 = z2Var2.a;
        if (storyItem20 != null && !z10) {
            u7Var.P0 = storyItem20.id;
        }
        u7Var.n0.A();
        this.Y2 = true;
        if (this.C1 || this.D1) {
            k1(false);
        }
        TL_stories.StoryItem storyItem21 = z2Var2.a;
        h5 h5Var10 = z2Var2.b;
        int i30 = storyItem21 != null ? storyItem21.id : (h5Var10 == null || (r9Var = h5Var10.c) == null) ? 0 : r9Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i11 = storyItem6.id;
            h5Var4 = h5Var2;
        } else {
            storyItem6 = storyItem2;
            h5Var4 = h5Var2;
            i11 = (h5Var2 == null || (r9Var2 = h5Var4.c) == null) ? 0 : r9Var2.f;
        }
        boolean z59 = i30 == i11 || !(h5Var4 == null || storyItem21 == null || !TextUtils.equals(h5Var4.e, storyItem21.attachPath));
        boolean z60 = z59 && !(this.U1 == z13 && this.T1 == z11 && this.V1 == z12);
        t0 t0Var3 = u7Var.A0;
        if (t0Var3 != null) {
            int i31 = this.Q3;
            TLRPC.GroupCall groupCall = t0Var3.v;
            if (i31 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                h2Var = this.c1;
                l2Var = this.K0;
                x2Var = this.o1;
                if ((h5Var4 != null || (str = h5Var4.e) == null || !str.equals(z2Var2.f())) && (storyItem6 == null || (storyItem7 = z2Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    t1Var = this.b2;
                    if (t1Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(t1Var.getEditField().getText())) {
                            u7.J(storyItem6.dialogId, storyItem6, this.b2.getEditField().getText());
                        }
                        this.b2.getEditField().setText(u7.u(this.B1, z2Var2.a));
                        z18 = z2Var2.f;
                        if (z18) {
                            this.b2.U0(false, false);
                        } else {
                            this.b2.U0(true, true);
                        }
                    }
                    z17 = z2Var2.f;
                    if (z17) {
                        M0();
                    }
                    izVar.c();
                    this.W0 = 0L;
                    this.Y0 = false;
                    h5Var5 = z2Var2.b;
                    if (h5Var5 == null) {
                        lj0 lj0Var = x2Var.d;
                        if (lj0Var != null) {
                            lj0Var.e(h5Var5.h, false);
                        }
                        x2Var.a.invalidate();
                    } else if (!z60) {
                        x2Var.h = 0.0f;
                    }
                    pcVar = pc.w;
                    if (pcVar != null && pcVar.h == h2Var) {
                        pcVar.b();
                    }
                    l2Var.J();
                    q0();
                    z16 = true;
                }
                if (!z16 || (h5Var4 != null && z2Var2.b == null)) {
                    x2Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = x2Var.c;
                    this.Q3 = 0;
                    boolean z61 = z60;
                    long j3 = this.B1;
                    h1Var2 = h1Var;
                    z19 = z2Var2.f;
                    W0(j3, false, z19);
                    h5Var6 = z2Var2.b;
                    if (h5Var6 == null) {
                        z2Var = z2Var2;
                        charSequence2 = h5Var6.I ? LocaleController.getString(R.string.FailedToUploadStory) : a6.u(textViewArr[0], this.U1);
                    } else if (I0()) {
                        TL_stories.StoryItem storyItem22 = z2Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            z2Var = z2Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                z2Var = z2Var2;
                                charSequence2 = LocaleController.formatStoryDate(r13.date);
                            } else {
                                z2Var = z2Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = LocaleController.formatStoryDate(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        z2Var = z2Var2;
                        TL_stories.StoryItem storyItem23 = z2Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z59;
                            h2Var2 = h2Var;
                            l2Var2 = l2Var;
                            z22 = z61;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                            spannableStringBuilder2.setSpan(new c2(), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            t0 t0Var4 = u7Var.A0;
                            if (t0Var4 != null) {
                                TLRPC.GroupCall groupCall2 = t0Var4.v;
                                i12 = 1;
                                this.Q3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                            } else {
                                i12 = 1;
                            }
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i12, this.Q3)));
                            charSequence2 = spannableStringBuilder2;
                        } else if (storyItem23.date == -1) {
                            charSequence2 = LocaleController.getString(R.string.CachedStory);
                        } else {
                            if (z2Var.i() != null) {
                                j6 i32 = z2Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z59;
                                SpannableString spannableString = new SpannableString("r");
                                h2Var2 = h2Var;
                                l2Var2 = l2Var;
                                spannableString.setSpan(new uq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i32.b != null) {
                                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(g5Var, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i32.b.longValue() > 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(this.C2).getUser(i32.b);
                                        g5Var.e(user2);
                                        spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user2));
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-i32.b.longValue()));
                                        g5Var.b(chat4);
                                        if (chat4 != null) {
                                            spannableStringBuilder3.append((CharSequence) chat4.title);
                                        }
                                    }
                                } else {
                                    String str4 = z2Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                x2Var.setOnSubtitleClick(new xh.s1(5, this, i32));
                                SpannableString spannableString3 = new SpannableString(".");
                                ht htVar = new ht();
                                htVar.b = AndroidUtilities.dp(1.5f);
                                htVar.c = 5.0f;
                                spannableString3.setSpan(htVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(z2Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z59;
                                h2Var2 = h2Var;
                                l2Var2 = l2Var;
                                if (!this.E1 || (storyItem8 = z2Var.a) == null || storyItem8.from_id == null) {
                                    String formatStoryDate = LocaleController.formatStoryDate(z2Var.a.date);
                                    charSequence4 = formatStoryDate;
                                    if (z2Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                        ht htVar2 = new ht();
                                        htVar2.b = AndroidUtilities.dp(1.5f);
                                        htVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(htVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z61;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(g5Var2, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long peerDialogId = DialogObject.getPeerDialogId(z2Var.a.from_id);
                                    if (peerDialogId > 0) {
                                        TLRPC.User user3 = MessagesController.getInstance(this.C2).getUser(Long.valueOf(peerDialogId));
                                        g5Var2.e(user3);
                                        spannableStringBuilder4.append((CharSequence) UserObject.getUserName(user3));
                                    } else {
                                        TLRPC.Chat chat5 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-peerDialogId));
                                        g5Var2.b(chat5);
                                        if (chat5 != null) {
                                            spannableStringBuilder4.append((CharSequence) chat5.title);
                                        }
                                    }
                                    x2Var.setOnSubtitleClick(new m80(this, peerDialogId, 5));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    ht htVar3 = new ht();
                                    htVar3.b = AndroidUtilities.dp(1.5f);
                                    htVar3.c = 5.0f;
                                    spannableString5.setSpan(htVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(z2Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            a5 a5Var2 = u7Var.O0;
                            if (a5Var2 == null || (storyItem9 = z2Var.a) == null || !a5Var2.m(storyItem9.id)) {
                                z23 = false;
                                charSequence3 = charSequence;
                            } else {
                                boolean z62 = charSequence instanceof SpannableStringBuilder;
                                CharSequence charSequence5 = charSequence;
                                if (!z62) {
                                    charSequence5 = new SpannableStringBuilder(charSequence);
                                }
                                SpannableString spannableString6 = new SpannableString("p ");
                                z23 = false;
                                spannableString6.setSpan(new uq(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            x2Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        x4Var = this.F0;
                        if (x4Var != null) {
                            x4Var.e(z23);
                        }
                        x4Var2 = this.G0;
                        if (x4Var2 != null) {
                            x4Var2.e(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z59;
                    h2Var2 = h2Var;
                    l2Var2 = l2Var;
                    charSequence4 = charSequence2;
                    z22 = z61;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    x4Var = this.F0;
                    if (x4Var != null) {
                    }
                    x4Var2 = this.G0;
                    if (x4Var2 != null) {
                    }
                } else {
                    z2Var = z2Var2;
                    h1Var2 = h1Var;
                    z20 = z16;
                    z21 = z59;
                    h2Var2 = h2Var;
                    l2Var2 = l2Var;
                }
                storyItem10 = z2Var.a;
                if (storyItem6 == storyItem10 && h5Var4 == z2Var.b) {
                }
                z2Var.o();
                if ((!z2Var.g || storyItem6 != z2Var.a) && (w2Var = this.Q1) != null) {
                    u7 u7Var5 = ((l7) w2Var).d;
                    u7Var5.Z0 = false;
                    u7Var5.P();
                }
                z24 = z2Var.f;
                z25 = !z24 && (t0Var2 = u7Var.A0) != null && z2Var.k(t0Var2.g()) && u7Var.A0.b();
                if (z25 != this.G1) {
                    this.G1 = z25;
                    if (z25) {
                        z0();
                    }
                    if (this.g2 != null && (this.F1 || this.G1)) {
                        h1();
                    }
                    t1 t1Var4 = this.b2;
                    if (t1Var4 != null) {
                        if (this.F1) {
                            z52 = z2Var.f;
                        }
                        if (!this.G1) {
                            z51 = true;
                            t1Var4.setEnabled(z51);
                            z50 = true;
                            this.b2.P1(true);
                        }
                        z51 = false;
                        t1Var4.setEnabled(z51);
                        z50 = true;
                        this.b2.P1(true);
                    } else {
                        z50 = true;
                    }
                    r0(z50);
                }
                linearLayout = this.g2;
                int i33 = 8;
                if (linearLayout != null) {
                    if (this.F1) {
                        z49 = z2Var.f;
                    }
                    if (!this.G1) {
                        i27 = 8;
                        linearLayout.setVisibility(i27);
                    }
                    i27 = 0;
                    linearLayout.setVisibility(i27);
                }
                z26 = this.c3;
                LinearLayout linearLayout2 = this.O0;
                if (z26) {
                    TLRPC.Chat chat6 = this.B1 < 0 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null;
                    z27 = z2Var.f;
                    if (z27) {
                        if (this.b2 == null) {
                            v0();
                        }
                        u0();
                        y0();
                        x0();
                        this.b2.setVisibility(0);
                    } else if ((UserObject.isService(this.B1) || I0()) && (t1Var2 = this.b2) != null) {
                        t1Var2.setVisibility(8);
                    } else if (!this.C1 && ((!this.D1 || (this.E1 && (ChatObject.canSendPlain(chat6) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat6)))) && (t1Var3 = this.b2) != null)) {
                        t1Var3.setVisibility(0);
                    }
                    t1 t1Var5 = this.b2;
                    if (t1Var5 != null) {
                        z32 = z2Var.f;
                        t1Var5.setOnSendButtonLongClick(z32 ? new i1(this, 0) : null);
                        t1 t1Var6 = this.b2;
                        z33 = z2Var.f;
                        D0(true);
                        t1Var6.i1(z33);
                        t1 t1Var7 = this.b2;
                        z34 = z2Var.f;
                        t1Var7.o1(z34 && !D0(true) && (this.v2 || this.b2.W0), true);
                    }
                    if (this.F1 && this.g2 == null) {
                        z0();
                    }
                    if (this.g2 != null) {
                        if (this.F1 || this.G1) {
                            h1();
                        }
                        LinearLayout linearLayout3 = this.g2;
                        if (this.F1) {
                            z31 = z2Var.f;
                        }
                        if (!this.G1) {
                            i14 = 8;
                            linearLayout3.setVisibility(i14);
                        }
                        i14 = 0;
                        linearLayout3.setVisibility(i14);
                    }
                    t1 t1Var8 = this.b2;
                    if (t1Var8 != null) {
                        if (this.F1) {
                            z30 = z2Var.f;
                        }
                        if (!this.G1) {
                            z29 = true;
                            t1Var8.setEnabled(z29);
                        }
                        z29 = false;
                        t1Var8.setEnabled(z29);
                    }
                    b2 b2Var = this.W1;
                    if (b2Var != null) {
                        if (this.C1) {
                            z28 = z2Var.f;
                            if (!z28) {
                                i13 = 0;
                                b2Var.setVisibility(i13);
                            }
                        }
                        i13 = 8;
                        b2Var.setVisibility(i13);
                    }
                    FrameLayout frameLayout = this.a3;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (UserObject.isService(this.B1)) {
                        A0();
                        this.b3.setVisibility(0);
                    } else {
                        hn0 hn0Var = this.b3;
                        if (hn0Var != null) {
                            hn0Var.setVisibility(8);
                        }
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(I0() ? 8 : 0);
                    }
                } else {
                    C0();
                    A0();
                    this.a3.setVisibility(0);
                    this.b3.setVisibility(0);
                    this.U2 = false;
                    this.T2 = false;
                    this.S2 = false;
                    t1 t1Var9 = this.b2;
                    if (t1Var9 != null) {
                        t1Var9.setVisibility(8);
                    }
                    b2 b2Var2 = this.W1;
                    if (b2Var2 != null) {
                        b2Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                hVar = this.c2;
                if (hVar != null) {
                    t1 t1Var10 = this.b2;
                    if (t1Var10 != null && t1Var10.getVisibility() == 0) {
                        z48 = z2Var.f;
                        if (!z48) {
                            i26 = 0;
                            hVar.setVisibility(i26);
                        }
                    }
                    i26 = 8;
                    hVar.setVisibility(i26);
                }
                aVar = this.X1;
                o1 o1Var = this.L0;
                if (aVar != null) {
                    if (!this.c3) {
                        z47 = z2Var.f;
                        if (z47) {
                            i25 = 0;
                            aVar.setVisibility(i25);
                            this.X1.a(o1Var.g(), false);
                            this.X1.setCount(o1Var.getUnreadMessagesCount());
                        }
                    }
                    i25 = 8;
                    aVar.setVisibility(i25);
                    this.X1.a(o1Var.g(), false);
                    this.X1.setCount(o1Var.getUnreadMessagesCount());
                }
                b1Var = this.a2;
                if (b1Var != null) {
                    if (!this.c3) {
                        z46 = z2Var.f;
                        if (z46 && (t0Var = t0.W) != null && z2Var.k(t0Var.g())) {
                            i24 = 0;
                            b1Var.setVisibility(i24);
                            b1 b1Var2 = this.a2;
                            t0 t0Var5 = t0.W;
                            b1Var2.b(t0Var5 == null && t0Var5.o(), true);
                            b1 b1Var3 = this.a2;
                            t0 t0Var6 = t0.W;
                            b1Var3.a(t0Var6 != null || t0Var6.m(), true);
                        }
                    }
                    i24 = 8;
                    b1Var.setVisibility(i24);
                    b1 b1Var22 = this.a2;
                    t0 t0Var52 = t0.W;
                    b1Var22.b(t0Var52 == null && t0Var52.o(), true);
                    b1 b1Var32 = this.a2;
                    t0 t0Var62 = t0.W;
                    b1Var32.a(t0Var62 != null || t0Var62.m(), true);
                }
                if (this.Z1 != null) {
                    e1 e1Var = this.Y1;
                    if (!this.c3) {
                        z45 = z2Var.f;
                        if (z45) {
                            i22 = 0;
                            e1Var.setVisibility(i22);
                            f1 f1Var = this.Z1;
                            if (!this.c3) {
                                z44 = z2Var.f;
                                if (z44) {
                                    i23 = 0;
                                    f1Var.setVisibility(i23);
                                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                    b1 b1Var4 = this.a2;
                                    dp = AndroidUtilities.dp((b1Var4 == null && b1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                        layoutParams.rightMargin = dp;
                                        this.Z1.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            i23 = 8;
                            f1Var.setVisibility(i23);
                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                            b1 b1Var42 = this.a2;
                            dp = AndroidUtilities.dp((b1Var42 == null && b1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                    }
                    i22 = 8;
                    e1Var.setVisibility(i22);
                    f1 f1Var2 = this.Z1;
                    if (!this.c3) {
                    }
                    i23 = 8;
                    f1Var2.setVisibility(i23);
                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                    b1 b1Var422 = this.a2;
                    dp = AndroidUtilities.dp((b1Var422 == null && b1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                    if (layoutParams.rightMargin != dp) {
                    }
                }
                z35 = z2Var.f;
                if (!z35 || ((z2Var.h == null && z2Var.i() == null && z2Var.g() == null) || this.c3)) {
                    l2 l2Var3 = l2Var2;
                    if (this.K1) {
                        u7 u7Var6 = ((l7) this.Q1).d;
                        u7Var6.L0 = false;
                        u7Var6.P();
                        w2 w2Var2 = this.Q1;
                        this.j3 = false;
                        ((l7) w2Var2).e();
                    }
                    l2Var3.setVisibility(8);
                } else {
                    l2 l2Var4 = l2Var2;
                    l2Var4.b0.b(z2Var.h, z2Var.i(), z2Var.g(), u7Var.Z0 && !z2Var.g && (storyItem13 = z2Var.a) != null && storyItem13.translated, storyItem6 == z2Var.a);
                    l2Var4.setVisibility(0);
                }
                storyItem11 = z2Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (o1Var.r(this.B1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            o1Var.q(false, false);
                            this.L3 = 0L;
                            t1 t1Var11 = this.b2;
                            if (t1Var11 != null) {
                                t1Var11.K(true);
                                this.b2.R1();
                                r0(true);
                            }
                        }
                        o1Var.setVisibility(0);
                        h2Var2.invalidate();
                        if (this.Q1 != null && K0()) {
                            ((l7) this.Q1).a(this.J1, this.B1);
                        }
                        z36 = this.D1;
                        b2 b2Var3 = this.P0;
                        ImageView imageView3 = this.N0;
                        b2 b2Var4 = this.D0;
                        if (z36) {
                            if (this.S2) {
                                z43 = z2Var.f;
                                if (!z43) {
                                    i19 = 0;
                                    imageView3.setVisibility(i19);
                                    if (b2Var3 != null) {
                                        if (this.T2) {
                                            z42 = z2Var.f;
                                            if (!z42) {
                                                i21 = 0;
                                                b2Var3.setVisibility(i21);
                                            }
                                        }
                                        i21 = 8;
                                        b2Var3.setVisibility(i21);
                                    }
                                    if (!this.V1) {
                                        z41 = z2Var.f;
                                        if (!z41) {
                                            i20 = 0;
                                            b2Var4.setVisibility(i20);
                                        }
                                    }
                                    i20 = 8;
                                    b2Var4.setVisibility(i20);
                                }
                            }
                            i19 = 4;
                            imageView3.setVisibility(i19);
                            if (b2Var3 != null) {
                            }
                            if (!this.V1) {
                            }
                            i20 = 8;
                            b2Var4.setVisibility(i20);
                        } else {
                            if (this.S2) {
                                z38 = z2Var.f;
                                if (!z38) {
                                    i15 = 0;
                                    imageView3.setVisibility(i15);
                                    if (b2Var3 != null) {
                                        b2Var3.setVisibility(8);
                                    }
                                    if (!this.C1) {
                                        z37 = z2Var.f;
                                        if (!z37) {
                                            i16 = 0;
                                            b2Var4.setVisibility(i16);
                                            b2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i16 = 8;
                                    b2Var4.setVisibility(i16);
                                    b2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                }
                            }
                            i15 = 4;
                            imageView3.setVisibility(i15);
                            if (b2Var3 != null) {
                            }
                            if (!this.C1) {
                            }
                            i16 = 8;
                            b2Var4.setVisibility(i16);
                            b2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                        }
                        b2Var4.requestLayout();
                        u7Var.e1.append(this.B1, i10);
                        if (this.K1) {
                            R0(0L);
                            g1();
                            h1Var2.bumpPriority();
                        }
                        o1Var.setLivePlayer(u7Var.A0);
                        this.L1 = 0;
                        if (u7Var.O0 != null && (storyItem12 = z2Var.a) != null) {
                            int i34 = storyItem12.id;
                            i18 = 0;
                            while (true) {
                                if (i18 < u7Var.O0.i.size()) {
                                    MessageObject messageObject = (MessageObject) u7Var.O0.i.get(i18);
                                    if (messageObject != null && messageObject.getId() == i34) {
                                        this.L1 = i18;
                                        break;
                                    }
                                    i18++;
                                } else {
                                    break;
                                }
                            }
                        }
                        int i35 = this.J1;
                        this.M1 = i35;
                        int i36 = this.A1;
                        this.N1 = i36;
                        if (u7Var.R0) {
                            this.M1 = (i36 - 1) - i35;
                        }
                        l4 = z2Var.l();
                        m91 m91Var = this.y0;
                        if (l4) {
                            m91Var.setVisibility(0);
                            this.e3 = z2Var.j() ? 1.0f : 0.5f;
                            boolean j10 = z2Var.j();
                            ImageView imageView4 = this.A0;
                            kj0 kj0Var = this.z0;
                            if (j10) {
                                kj0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                m91Var.setContentDescription(LocaleController.getString(!u7.D1 ? R.string.Mute : R.string.Unmute));
                            } else {
                                kj0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                m91Var.setContentDescription(LocaleController.getString(R.string.NoSound));
                            }
                            m91Var.setAlpha((1.0f - this.d4) * this.e3);
                        } else {
                            m91Var.setVisibility(8);
                        }
                        h5Var7 = z2Var.b;
                        z6 z6Var = this.C0;
                        if (h5Var7 != null) {
                            z6Var.b(this.C1, h5Var7, z21 && this.b4);
                        } else {
                            TL_stories.StoryItem storyItem24 = z2Var.a;
                            if (storyItem24 != null) {
                                z6Var.a(this.C1, storyItem24, z21 && this.b4);
                            } else {
                                z6Var.a(this.C1, null, z21 && this.b4);
                            }
                        }
                        this.b4 = false;
                        z6Var.setTranslationX(m91Var.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z20) {
                            this.q3 = false;
                            TL_stories.StoryItem storyItem25 = z2Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.E0.setReaction(null);
                            } else {
                                this.E0.setReaction(yg.p0.d(reaction));
                            }
                        }
                        h5Var8 = z2Var.b;
                        if (h5Var8 == null && h5Var8.I) {
                            w0();
                            this.j2.set(z2Var.b.c.x);
                            this.j2.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.k2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.k2 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.j2.animate().alpha(1.0f).setDuration(180L).setInterpolator(wr.h);
                                this.k2 = interpolator;
                                interpolator.start();
                            } else {
                                this.j2.setAlpha(1.0f);
                            }
                        } else if (this.j2 != null) {
                            ViewPropertyAnimator viewPropertyAnimator2 = this.k2;
                            if (viewPropertyAnimator2 != null) {
                                viewPropertyAnimator2.cancel();
                                this.k2 = null;
                            }
                            if (z21 && this.j2.getVisibility() == 0) {
                                ViewPropertyAnimator withEndAction = this.j2.animate().alpha(0.0f).setDuration(180L).setInterpolator(wr.h).withEndAction(new j1(this, 0));
                                this.k2 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.j2.setAlpha(0.0f);
                                this.j2.setVisibility(8);
                            }
                        }
                        this.x1.a(u7.D1, false);
                        if (this.K1 && z2Var.a != null) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + z2Var.a.id + " " + z2.c(z2Var));
                        }
                        if (this.C1) {
                            z3.f(this.C2, this.B1, z2Var.a);
                        }
                        org.telegram.ui.Cells.f4 f4Var = x2Var.b;
                        a5 a5Var3 = u7Var.O0;
                        f4Var.setPadding(0, 0, (a5Var3 != null || a5Var3.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(z2Var.a);
                        if (!z10 && !this.C1 && this.z3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                            j1 j1Var = new j1(this, 1);
                            this.z3 = j1Var;
                            AndroidUtilities.runOnUIThread(j1Var, 500L);
                        }
                        x4Var3 = this.G0;
                        if ((x4Var3 != null || !x4Var3.V) && z2Var.j() && u7.D1) {
                            if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                AndroidUtilities.cancelRunOnUIThread(this.R3);
                                AndroidUtilities.runOnUIThread(this.R3, 250L);
                            }
                        }
                        imageView = this.w0;
                        if (imageView != null) {
                            if (I0() && !J0()) {
                                z40 = z2Var.e;
                                if (!z40) {
                                    i17 = 8;
                                    imageView.setVisibility(i17);
                                }
                            }
                            i17 = 0;
                            imageView.setVisibility(i17);
                        }
                        imageView2 = this.x0;
                        if (imageView2 != null) {
                            z39 = z2Var.f;
                            if (z39 && !z6Var.f) {
                                i33 = 0;
                            }
                            imageView2.setVisibility(i33);
                            return;
                        }
                        return;
                    }
                }
                o1Var.r(this.B1, null);
                o1Var.setVisibility(8);
                h2Var2.invalidate();
                if (this.Q1 != null) {
                    ((l7) this.Q1).a(this.J1, this.B1);
                }
                z36 = this.D1;
                b2 b2Var32 = this.P0;
                ImageView imageView32 = this.N0;
                b2 b2Var42 = this.D0;
                if (z36) {
                }
                b2Var42.requestLayout();
                u7Var.e1.append(this.B1, i10);
                if (this.K1) {
                }
                o1Var.setLivePlayer(u7Var.A0);
                this.L1 = 0;
                if (u7Var.O0 != null) {
                    int i342 = storyItem12.id;
                    i18 = 0;
                    while (true) {
                        if (i18 < u7Var.O0.i.size()) {
                        }
                        i18++;
                    }
                }
                int i352 = this.J1;
                this.M1 = i352;
                int i362 = this.A1;
                this.N1 = i362;
                if (u7Var.R0) {
                }
                l4 = z2Var.l();
                m91 m91Var2 = this.y0;
                if (l4) {
                }
                h5Var7 = z2Var.b;
                z6 z6Var2 = this.C0;
                if (h5Var7 != null) {
                }
                this.b4 = false;
                z6Var2.setTranslationX(m91Var2.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z20) {
                }
                h5Var8 = z2Var.b;
                if (h5Var8 == null) {
                }
                if (this.j2 != null) {
                }
                this.x1.a(u7.D1, false);
                if (this.K1) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + z2Var.a.id + " " + z2.c(z2Var));
                }
                if (this.C1) {
                }
                org.telegram.ui.Cells.f4 f4Var2 = x2Var.b;
                a5 a5Var32 = u7Var.O0;
                f4Var2.setPadding(0, 0, (a5Var32 != null || a5Var32.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(z2Var.a);
                if (!z10) {
                    j1 j1Var2 = new j1(this, 1);
                    this.z3 = j1Var2;
                    AndroidUtilities.runOnUIThread(j1Var2, 500L);
                }
                x4Var3 = this.G0;
                if (x4Var3 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.w0;
                if (imageView != null) {
                }
                imageView2 = this.x0;
                if (imageView2 != null) {
                }
            }
        }
        z16 = false;
        h2Var = this.c1;
        l2Var = this.K0;
        x2Var = this.o1;
        if (h5Var4 != null) {
        }
        t1Var = this.b2;
        if (t1Var != null) {
        }
        z17 = z2Var2.f;
        if (z17) {
        }
        izVar.c();
        this.W0 = 0L;
        this.Y0 = false;
        h5Var5 = z2Var2.b;
        if (h5Var5 == null) {
        }
        pcVar = pc.w;
        if (pcVar != null) {
            pcVar.b();
        }
        l2Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        x2Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = x2Var.c;
        this.Q3 = 0;
        boolean z612 = z60;
        long j32 = this.B1;
        h1Var2 = h1Var;
        z19 = z2Var2.f;
        W0(j32, false, z19);
        h5Var6 = z2Var2.b;
        if (h5Var6 == null) {
        }
        z20 = z16;
        z21 = z59;
        h2Var2 = h2Var;
        l2Var2 = l2Var;
        charSequence4 = charSequence2;
        z22 = z612;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        x4Var = this.F0;
        if (x4Var != null) {
        }
        x4Var2 = this.G0;
        if (x4Var2 != null) {
        }
        storyItem10 = z2Var.a;
        if (storyItem6 == storyItem10) {
        }
        z2Var.o();
        if (!z2Var.g) {
        }
        u7 u7Var52 = ((l7) w2Var).d;
        u7Var52.Z0 = false;
        u7Var52.P();
        z24 = z2Var.f;
        if (z24) {
        }
        if (z25 != this.G1) {
        }
        linearLayout = this.g2;
        int i332 = 8;
        if (linearLayout != null) {
        }
        z26 = this.c3;
        LinearLayout linearLayout22 = this.O0;
        if (z26) {
        }
        hVar = this.c2;
        if (hVar != null) {
        }
        aVar = this.X1;
        o1 o1Var2 = this.L0;
        if (aVar != null) {
        }
        b1Var = this.a2;
        if (b1Var != null) {
        }
        if (this.Z1 != null) {
        }
        z35 = z2Var.f;
        if (z35) {
        }
        l2 l2Var32 = l2Var2;
        if (this.K1) {
        }
        l2Var32.setVisibility(8);
        storyItem11 = z2Var.a;
        if (storyItem11 != null) {
        }
        o1Var2.r(this.B1, null);
        o1Var2.setVisibility(8);
        h2Var2.invalidate();
        if (this.Q1 != null) {
        }
        z36 = this.D1;
        b2 b2Var322 = this.P0;
        ImageView imageView322 = this.N0;
        b2 b2Var422 = this.D0;
        if (z36) {
        }
        b2Var422.requestLayout();
        u7Var.e1.append(this.B1, i10);
        if (this.K1) {
        }
        o1Var2.setLivePlayer(u7Var.A0);
        this.L1 = 0;
        if (u7Var.O0 != null) {
        }
        int i3522 = this.J1;
        this.M1 = i3522;
        int i3622 = this.A1;
        this.N1 = i3622;
        if (u7Var.R0) {
        }
        l4 = z2Var.l();
        m91 m91Var22 = this.y0;
        if (l4) {
        }
        h5Var7 = z2Var.b;
        z6 z6Var22 = this.C0;
        if (h5Var7 != null) {
        }
        this.b4 = false;
        z6Var22.setTranslationX(m91Var22.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z20) {
        }
        h5Var8 = z2Var.b;
        if (h5Var8 == null) {
        }
        if (this.j2 != null) {
        }
        this.x1.a(u7.D1, false);
        if (this.K1) {
        }
        if (this.C1) {
        }
        org.telegram.ui.Cells.f4 f4Var22 = x2Var.b;
        a5 a5Var322 = u7Var.O0;
        f4Var22.setPadding(0, 0, (a5Var322 != null || a5Var322.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(z2Var.a);
        if (!z10) {
        }
        x4Var3 = this.G0;
        if (x4Var3 != null) {
        }
        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.w0;
        if (imageView != null) {
        }
        imageView2 = this.x0;
        if (imageView2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1() {
        ArrayList arrayList;
        int i10;
        ImageReceiver imageReceiver;
        boolean isEmpty;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String k10 = a4.a.k(max, max, "_");
        ArrayList arrayList11 = this.S3;
        arrayList11.clear();
        ArrayList arrayList12 = this.T3;
        arrayList12.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.h1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((yg.g0) arrayList.get(i12)).b(false);
            i12++;
        }
        arrayList.clear();
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            int i14 = this.J1;
            if (i13 == 0) {
                i10 = i14 - 1;
                imageReceiver = this.f1;
                if (i10 < 0) {
                    imageReceiver.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i13;
                    arrayList7 = arrayList11;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
                ArrayList arrayList13 = this.w1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.v1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    V0((h5) arrayList13.get(i10 - arrayList2.size()), imageReceiver, k10);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j3 = this.B1;
                    storyItem2.dialogId = j3;
                    h5 t10 = this.S1.t(j3, storyItem2);
                    if (t10 != null) {
                        V0(t10, imageReceiver, k10);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i11 = i13;
                        storyItem = storyItem2;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        boolean z10 = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
                        String str = storyItem2.attachPath;
                        if (str != null) {
                            if (storyItem2.media == null) {
                                z10 = str.toLowerCase().endsWith(".mp4");
                            }
                            if (z10) {
                                i11 = i13;
                                arrayList3 = arrayList11;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList12;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), org.telegram.ui.Cells.r6.t(k10, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), k10, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i13;
                                String str2 = k10;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                k10 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i13;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (z10) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), org.telegram.ui.Cells.r6.t(k10, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), k10, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.clearImage();
                                } else {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                    imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), k10, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (messageMedia3 != null && MessageObject.isVideoDocument(messageMedia3.getDocument())) {
                        TLRPC.Document document = storyItem.media.getDocument();
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = FileLoader.getInstance(this.C2).getFileReference(storyItem);
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("?account=");
                            sb2.append(this.C2);
                            sb2.append("&id=");
                            sb2.append(document.id);
                            sb2.append("&hash=");
                            sb2.append(document.access_hash);
                            sb2.append("&dc=");
                            sb2.append(document.dc_id);
                            sb2.append("&size=");
                            sb2.append(document.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(storyItem.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(storyItem.id);
                            sb2.append("&did=");
                            sb2.append(storyItem.dialogId);
                            arrayList7 = arrayList3;
                            try {
                                arrayList7.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document) + sb2.toString()));
                                arrayList8 = arrayList4;
                                try {
                                    arrayList8.add(document);
                                } catch (UnsupportedEncodingException e) {
                                    e = e;
                                    e.printStackTrace();
                                    if (storyItem.media_areas != null) {
                                    }
                                    arrayList9 = arrayList5;
                                    i13 = i11 + 1;
                                    arrayList11 = arrayList7;
                                    arrayList = arrayList9;
                                    arrayList12 = arrayList8;
                                }
                            } catch (UnsupportedEncodingException e7) {
                                e = e7;
                                arrayList8 = arrayList4;
                                e.printStackTrace();
                                if (storyItem.media_areas != null) {
                                }
                                arrayList9 = arrayList5;
                                i13 = i11 + 1;
                                arrayList11 = arrayList7;
                                arrayList = arrayList9;
                                arrayList12 = arrayList8;
                            }
                        } catch (UnsupportedEncodingException e10) {
                            e = e10;
                            arrayList7 = arrayList3;
                        }
                    } else {
                        arrayList7 = arrayList3;
                        arrayList8 = arrayList4;
                    }
                    if (storyItem.media_areas != null) {
                        int i15 = 0;
                        while (i15 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i15) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i15);
                                yg.g0 g0Var = new yg.g0(this);
                                g0Var.e(yg.p0.d(tL_mediaAreaSuggestedReaction.reaction));
                                g0Var.b(this.a1);
                                arrayList10 = arrayList5;
                                arrayList10.add(g0Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i15++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
                arrayList8 = arrayList12;
                arrayList9 = arrayList;
                i11 = i13;
                arrayList7 = arrayList11;
                i13 = i11 + 1;
                arrayList11 = arrayList7;
                arrayList = arrayList9;
                arrayList12 = arrayList8;
            } else {
                i10 = i14 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.g1;
                if (i10 >= storiesCount) {
                    imageReceiver3.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i13;
                    arrayList7 = arrayList11;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList132 = this.w1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.v1;
                    if (isEmpty) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i13;
                    arrayList7 = arrayList11;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
            }
        }
        ArrayList arrayList14 = arrayList12;
        ArrayList arrayList15 = arrayList11;
        l7 l7Var = (l7) this.Q1;
        u7 u7Var = l7Var.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z11 = u7Var.H0;
            ArrayList arrayList16 = u7Var.M0;
            if (z11) {
                return;
            }
            for (int i16 = 0; i16 < arrayList16.size(); i16++) {
                for (int i17 = 0; i17 < arrayList15.size(); i17++) {
                    if (((Uri) arrayList15.get(i17)).equals(((t7) arrayList16.get(i16)).uri)) {
                        arrayList15.remove(i17);
                    }
                }
            }
            for (int i18 = 0; i18 < arrayList15.size(); i18++) {
                Uri uri = (Uri) arrayList15.get(i18);
                t7 t7Var = new t7(u7Var, u7Var.C0, u7Var.B0);
                t7Var.setOnSeekUpdate(new l6(2, l7Var, t7Var));
                t7Var.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i18);
                t7Var.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                t7Var.preparePlayer(uri, u7.D1, u7.B1);
                arrayList16.add(t7Var);
                if (arrayList16.size() > 2) {
                    ((t7) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        h2 h2Var = this.c1;
        Bitmap createBitmap = Bitmap.createBitmap(h2Var.getWidth(), h2Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public i5 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.v1.size()) + this.w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.v1;
    }

    public final void h1() {
        if (this.G1) {
            TextView textView = this.h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.h2;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.E1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.z1;
        u7 u7Var = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.w1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((h5) arrayList2.get(i11)).a;
                    if (((int) (j3 ^ (j3 >>> 32))) == u7Var.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.z1.indexOf(Integer.valueOf(u7Var.P0));
            if (indexOf < 0 && !this.z1.isEmpty()) {
                if (u7Var.P0 > ((Integer) this.z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (u7Var.P0 < ((Integer) hc.b.i(1, this.z1)).intValue()) {
                    indexOf = this.z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = u7Var.e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !u7Var.N0 && (peerStories = this.u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i13)).id > this.u1.max_read_id) {
                        this.J1 = i13;
                        break;
                    }
                    i13++;
                }
            }
        }
        if (this.J1 == -1) {
            this.J1 = 0;
        }
    }

    public final void j1() {
        a5 a5Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.v1;
        arrayList.clear();
        u7 u7Var = this.J0;
        if (!u7Var.N0) {
            ArrayList arrayList2 = this.z1;
            int i10 = 0;
            ArrayList arrayList3 = this.w1;
            if (arrayList2 != null && (a5Var = u7Var.O0) != null) {
                if (a5Var instanceof s4) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((s4) u7Var.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            h5 h5Var = (h5) E.get(i11);
                            r9 r9Var = h5Var.c;
                            if (r9Var != null && !r9Var.g && TextUtils.equals(r9Var.K0, str)) {
                                arrayList3.add(h5Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = u7Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (u7Var.O0 != null) {
                while (i10 < u7Var.O0.i.size()) {
                    arrayList.add(((MessageObject) u7Var.O0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = u7Var.Q0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.B1) {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.u1 = y3;
                    if (y3 == null) {
                        this.u1 = this.S1.z(this.B1);
                    }
                } else {
                    this.u1 = u7Var.Q0;
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.u1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.S1.E(this.B1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!u7Var.S0) {
            arrayList.add(u7Var.T0);
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        a3 currentPeerView;
        f60 f60Var = this.J2;
        if (f60Var != null) {
            f60Var.a0 = null;
            f60Var.d(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.a;
        u7 u7Var = this.J0;
        u7Var.getClass();
        if (j3 != 0 && storyItem != null) {
            u7.E1.remove(j3 + (j3 >> 16) + (storyItem.id << 16));
        }
        this.i3 = true;
        k7 k7Var = u7Var.n0;
        if (k7Var != null && (currentPeerView = k7Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            pc I = new wc(this.c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new j1(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        z2 z2Var = this.O1;
        TL_stories.StoryItem storyItem = z2Var.a;
        if (storyItem == null) {
            storyItem = z2Var.c;
        }
        boolean z11 = this.D1;
        if (z11 || this.C1) {
            if (storyItem == null) {
                this.A2.setText("");
                this.F2.setVisibility(8);
                this.B2.setVisibility(8);
                return;
            }
            u7 u7Var = this.J0;
            b2 b2Var = this.D0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.A2.setText(LocaleController.getString(u7Var.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                        TLObject userOrChat = MessagesController.getInstance(this.C2).getUserOrChat(storyItem.views.recent_viewers.get(i12).longValue());
                        if (userOrChat != null) {
                            this.B2.b(i11, userOrChat, this.C2);
                            i11++;
                        }
                        if (i11 >= 3) {
                            break;
                        }
                    }
                    for (int i13 = i11; i13 < 3; i13++) {
                        this.B2.b(i13, null, this.C2);
                    }
                    this.B2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        uq uqVar = new uq(R.drawable.mini_views_likes, 0);
                        uqVar.setOverrideColor(-53704);
                        uqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        uq uqVar2 = new uq(R.drawable.mini_repost_story, 0);
                        uqVar2.setOverrideColor(-14161823);
                        uqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(uqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + hc.b.B(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                }
                b2Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.n6 n6Var = this.R0;
            if (n6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.V0 = false;
            } else {
                n6Var.q(Integer.toString(i10), z10 && this.V0, true);
                this.V0 = true;
            }
            int i14 = storyItem.views.reactions_count;
            if (i14 > 0) {
                this.Q0.q(Integer.toString(i14), z10 && this.U0, true);
                this.U0 = true;
            } else {
                this.U0 = false;
            }
            if (!z10) {
                this.S0.d(this.U0 ? 1.0f : 0.0f, true);
                org.telegram.ui.Components.d6 d6Var = this.T0;
                if (d6Var != null) {
                    d6Var.d(this.V0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            if (!(this.E1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.A2.setText(LocaleController.getString(u7Var.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new uq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.A2.setText(spannableStringBuilder2);
            } else {
                this.A2.setText("");
            }
            b2Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.U0 ? this.Q0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + b2Var.getLayoutParams().width;
            b2 b2Var2 = this.P0;
            if (b2Var2 != null) {
                b2Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.V0 ? this.R0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += b2Var2.getLayoutParams().width;
                b2Var2.requestLayout();
            }
            this.W1.requestLayout();
            b2Var.requestLayout();
            this.B2.setVisibility(8);
            this.F2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = z2Var.a;
            f2 f2Var = this.j1;
            if (storyItem2 == null) {
                f2Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < f2Var.getChildCount(); i15++) {
                if (f2Var.getChildAt(i15) instanceof b7) {
                    ((b7) f2Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        o5 o5Var = this.E0;
        o5Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new r1(0, o5Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        o5 o5Var2 = new o5(getContext(), this.x1);
        this.E0 = o5Var2;
        o5Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.a6.e(40, 40, 3));
        this.q3 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void l1() {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.a3.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, z10 ? 1.0f : 0.0f);
        this.c4 = ofFloat;
        ofFloat.addUpdateListener(new k1(this, 2));
        this.c4.addListener(new p1(this, z10, 1));
        this.c4.setDuration(420L);
        this.c4.setInterpolator(wr.h);
        this.c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 <= 0 || !this.k3) {
            runnable.run();
            return;
        }
        int i11 = i10 - 1;
        SharedConfig.stealthModeSendMessageConfirm = i11;
        SharedConfig.updateStealthModeSendMessageConfirm(i11);
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 0, this.B0);
        d2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        d2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        th.e eVar = new th.e(runnable, 22);
        d2Var.l0 = string;
        d2Var.m0 = eVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        z9.a aVar = new z9.a(13);
        d2Var.n0 = string2;
        d2Var.o0 = aVar;
        d2Var.show();
    }

    public final void o0(int i10) {
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j3 = this.B1;
        x2 x2Var = this.o1;
        g9 g9Var = this.n1;
        if (j3 >= 0) {
            this.C1 = j3 == UserConfig.getInstance(this.C2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            this.F1 = !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            g9Var.m(this.C2, user);
            x2Var.a.getImageReceiver().setForUserOrChat(user, g9Var);
            W0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j3) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.B3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.E1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.C2).getChatFull(-this.B1) == null) {
                MessagesStorage.getInstance(this.C2).loadChatInfo(-this.B1, true, new CountDownLatch(1), false, false);
            }
            this.F1 = this.E1 && !ChatObject.canSendPlain(chat);
            this.H1 = MessagesController.getInstance(this.C2).getSendPaidMessagesStars(this.B1);
            g9Var.k(this.C2, chat);
            x2Var.a.getImageReceiver().setForUserOrChat(chat, g9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            i5 i5Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = i5Var.m;
            d8 d8Var = (d8) iVar.f(j10);
            if (d8Var == null) {
                d8Var = new d8(i5Var.a, j10, i5Var);
                iVar.k(d8Var, j10);
            }
            d8Var.b(true);
        }
        j1();
        this.J1 = i10;
        if (i10 < 0) {
            this.J1 = 0;
        }
        this.W0 = 0L;
        this.Y0 = false;
        this.J3 = null;
        this.K3 = null;
        boolean z10 = this.D1;
        h2 h2Var = this.c1;
        u7 u7Var = this.J0;
        int i11 = 8;
        z2 z2Var = this.O1;
        if (z10) {
            B0();
            if (this.b2 == null && (this.E1 || z2Var.f)) {
                v0();
            }
            if (this.b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                t1 t1Var = this.b2;
                if (z2Var.f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                t1Var.setVisibility(i11);
                t1 t1Var2 = this.b2;
                boolean z11 = z2Var.f;
                D0(true);
                t1Var2.i1(z11);
                this.b2.o1(z2Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                fu editField = this.b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = z2Var.a;
                u7Var.getClass();
                editField.setText(u7.u(j11, storyItem));
                this.b2.b1(this.C2, this.B1);
                this.b2.K1(chat2, null);
            }
            org.telegram.ui.Components.n6 n6Var = this.Q0;
            org.telegram.ui.ActionBar.f6 f6Var = this.B0;
            if (n6Var == null) {
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.Q0 = n6Var2;
                b2 b2Var = this.D0;
                n6Var2.setCallback(b2Var);
                this.Q0.r(f6Var.F0(org.telegram.ui.ActionBar.j6.G6));
                this.Q0.t(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.d6(b2Var);
            }
            b2 b2Var2 = this.P0;
            if (b2Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.R0 = n6Var3;
                n6Var3.setCallback(b2Var2);
                this.R0.r(f6Var.F0(org.telegram.ui.ActionBar.j6.G6));
                this.R0.t(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.d6(b2Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            h2Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (z2Var.f) {
                this.W1.setVisibility(8);
                if (this.b2 == null) {
                    v0();
                }
                this.b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                t1 t1Var3 = this.b2;
                if (t1Var3 != null) {
                    t1Var3.setVisibility(8);
                }
            }
            t1 t1Var4 = this.b2;
            if (t1Var4 != null) {
                boolean z12 = z2Var.f;
                D0(true);
                t1Var4.i1(z12);
                this.b2.o1(z2Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(u7Var.P0));
                    if (indexOf < 0 && !this.z1.isEmpty()) {
                        if (u7Var.P0 > ((Integer) this.z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (u7Var.P0 < ((Integer) hc.b.i(1, this.z1)).intValue()) {
                            indexOf = this.z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.w1.isEmpty();
                    ArrayList arrayList2 = this.v1;
                    if (isEmpty) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i12)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i12)).id > this.S1.f.get(this.B1)) {
                                this.J1 = i12;
                                break;
                            }
                        }
                    } else {
                        this.J1 = arrayList2.size();
                    }
                }
            }
            f1(false);
            h2Var.invalidate();
            invalidate();
        } else {
            if (this.b2 == null) {
                v0();
            }
            if (this.F1 && this.g2 == null) {
                z0();
            }
            if (this.g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                this.g2.setVisibility(((!this.F1 || z2Var.f) && !this.G1) ? 8 : 0);
            }
            u6 u6Var = this.j2;
            if (u6Var != null) {
                u6Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            t1 t1Var5 = this.b2;
            if (t1Var5 != null) {
                t1Var5.setVisibility((I0() || UserObject.isService(this.B1)) ? 8 : 0);
                t1 t1Var6 = this.b2;
                boolean z13 = z2Var.f;
                D0(true);
                t1Var6.i1(z13);
                this.b2.o1(z2Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                fu editField2 = this.b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = z2Var.a;
                u7Var.getClass();
                editField2.setText(u7.u(j12, storyItem2));
                this.b2.b1(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.b2.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.z2, false);
                }
            }
            this.A1 = getStoriesCount();
            b2 b2Var3 = this.W1;
            if (b2Var3 != null) {
                b2Var3.setVisibility(8);
            }
            h2Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a1 = true;
        this.e1.onAttachedToWindow();
        this.g1.onAttachedToWindow();
        this.f1.onAttachedToWindow();
        this.l3.onAttachedToWindow();
        this.n3.onAttachedToWindow();
        t1 t1Var = this.b2;
        if (t1Var != null) {
            t1Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((yg.g0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a1 = false;
        this.e1.onDetachedFromWindow();
        this.g1.onDetachedFromWindow();
        this.f1.onDetachedFromWindow();
        this.l3.onDetachedFromWindow();
        this.n3.onDetachedFromWindow();
        t1 t1Var = this.b2;
        if (t1Var != null) {
            t1Var.D0();
        }
        org.telegram.ui.Components.p5 p5Var = this.o3;
        if (p5Var != null) {
            p5Var.o(this);
            this.o3 = null;
        }
        yg.e eVar = this.m3;
        if (eVar != null) {
            eVar.d(this);
            this.m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((yg.g0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float f7;
        char c10;
        f60 f60Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        pk0 pk0Var;
        v1 v1Var;
        u7 u7Var = this.J0;
        if (u7Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.K1 && this.Z2 == null) {
            this.y2 = ((l7) this.Q1).d.p0;
        } else {
            this.y2 = 0;
        }
        int size = u7Var.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.y2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.y2 < AndroidUtilities.dp(20.0f)) {
            this.y2 = 0;
        }
        int i13 = this.y2;
        pk0 pk0Var2 = this.r3;
        if (pk0Var2 == null || pk0Var2.getReactionsWindow() == null || this.r3.getReactionsWindow().q) {
            t1 t1Var = this.b2;
            if (t1Var != null && (t1Var.t0() || this.b2.j3)) {
                if (this.b2.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.b2.getEmojiPadding();
                } else {
                    t1 t1Var2 = this.b2;
                    if (t1Var2.y3) {
                        t1Var2.L();
                        i13 = this.b2.getStickersExpandedHeight();
                    } else {
                        i13 = t1Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.r3.getReactionsWindow().c.animate().translationY(-this.y2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
            i13 = 0;
        }
        boolean z11 = this.v2;
        int i14 = this.o2;
        x2 x2Var = this.o1;
        int i15 = 1;
        if (i14 != i13) {
            this.v2 = false;
            z2 z2Var = this.O1;
            if (i13 <= 0 || !this.K1) {
                f7 = 8.0f;
                t1 t1Var3 = this.b2;
                if (t1Var3 != null) {
                    u7.J(this.B1, z2Var.a, t1Var3.getEditText());
                }
            } else {
                this.v2 = true;
                this.i3 = false;
                this.t2 = i13;
                if (this.f2 == null) {
                    f7 = 8.0f;
                    pk0 pk0Var3 = new pk0(1, this.C2, getContext(), LaunchActivity.R(), new bi.n1(8, this.B0));
                    this.f2 = pk0Var3;
                    pk0Var3.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    pk0 pk0Var4 = this.f2;
                    pk0Var4.N0 = true;
                    addView(pk0Var4, this.I0, w7.a6.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.f2.setDelegate(new e2(this));
                    this.f2.p(null, null, true);
                } else {
                    f7 = 8.0f;
                }
                this.f2.setFragment(LaunchActivity.R());
                this.f2.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                yg.l0 l0Var = yg.l0.B;
                if (l0Var != null) {
                    l0Var.l = true;
                }
                yg.l0 l0Var2 = yg.l0.C;
                if (l0Var2 != null) {
                    l0Var2.l = true;
                }
            }
            t1 t1Var4 = this.b2;
            if (t1Var4 != null) {
                t1Var4.o1(z2Var.f && !D0(true) && this.v2, true);
            }
            if (this.v2 && (v1Var = this.d3) != null) {
                v1Var.setVisibility(0);
            }
            if (!this.v2 && (pk0Var = this.f2) != null) {
                pk0Var.n();
            }
            x2Var.setEnabled(!this.v2);
            if (this.b2 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.v2, 0.1f, true);
            }
            if (this.K1 && this.v2) {
                u7 u7Var2 = ((l7) this.Q1).d;
                if (!u7Var2.x) {
                    u7Var2.x = true;
                    u7Var2.P();
                }
            }
            this.o2 = i13;
            ValueAnimator valueAnimator = this.p2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.N2.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H2, i13);
            this.p2 = ofFloat;
            ofFloat.addUpdateListener(new k1(this, i12));
            this.p2.addListener(new q1(this, i15));
            if (this.v2) {
                this.p2.setDuration(250L);
                this.p2.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                u7Var.m();
            } else {
                this.p2.setDuration(500L);
                this.p2.setInterpolator(wr.h);
            }
            this.p2.start();
            boolean z12 = this.v2;
            if (z12 != z11) {
                if (z12) {
                    com.google.firebase.messaging.n nVar = this.P1;
                    Canvas canvas = (Canvas) nVar.b;
                    Bitmap bitmap = (Bitmap) nVar.c;
                    E0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (z2Var.f) {
                        bi.x4 x4Var = this.d2;
                        if (x4Var != null) {
                            if (!x4Var.V) {
                                removeView(x4Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            bi.x4 x4Var2 = new bi.x4(getContext(), 3);
                            this.d2 = x4Var2;
                            x4Var2.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.d2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                            bi.x4 x4Var3 = this.d2;
                            x4Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            x4Var3.l0 = new yg.q(9, this, x4Var2);
                            addView(x4Var3, w7.a6.e(-1, 100, 87));
                            this.d2.u();
                            l1();
                        }
                    }
                } else {
                    t1 t1Var5 = this.b2;
                    if (t1Var5 != null) {
                        t1Var5.getEditField().clearFocus();
                    }
                    bi.x4 x4Var4 = this.d2;
                    if (x4Var4 != null) {
                        x4Var4.e(true);
                    }
                }
                this.u2 = true;
            } else {
                this.u2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        t1 t1Var6 = this.b2;
        if (t1Var6 != null && t1Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.b2.getEmojiView().getLayoutParams()).gravity = 80;
        }
        h2 h2Var = this.c1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h2Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z13 = size - size2 > AndroidUtilities.dp(64.0f);
        this.x2 = z13;
        int dp2 = (size - ((z13 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = dp2;
        if (this.x2) {
            this.K2 = (((-dp2) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.K2 = ((-dp2) + size) - size2;
        }
        if (this.x2 != this.w2) {
            h2Var.setLayoutParams(layoutParams2);
        }
        b2 b2Var = this.W1;
        if (b2Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
            if (this.x2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f7) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        hn0 hn0Var = this.b3;
        if (hn0Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) hn0Var.getLayoutParams();
            if (this.x2) {
                c10 = 0;
                this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                f60Var = this.J2;
                if (f60Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) f60Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.a2.z(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.x2;
                LinearLayout linearLayout = this.O0;
                l2 l2Var = this.K0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.C1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) l2Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.w2 != this.x2) {
                        l2Var.setLayoutParams((FrameLayout.LayoutParams) l2Var.getLayoutParams());
                    }
                    l2Var.u0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) l2Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
                    if (this.w2 != this.x2) {
                        l2Var.setLayoutParams((FrameLayout.LayoutParams) l2Var.getLayoutParams());
                    }
                    l2Var.u0 = AndroidUtilities.dp(f7);
                }
                this.V2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.C0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                org.telegram.ui.Cells.f4 f4Var = x2Var.b;
                TextView[] textViewArr = x2Var.c;
                layoutParams = (FrameLayout.LayoutParams) f4Var.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i16 = (int) dp;
                    layoutParams.rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
                    x2Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.w2 = this.x2;
            }
            this.b3.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        f60Var = this.J2;
        if (f60Var != null) {
        }
        z10 = this.x2;
        LinearLayout linearLayout2 = this.O0;
        l2 l2Var2 = this.K0;
        if (z10) {
        }
        this.V2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.C0.getVisibility() == 0) {
        }
        if (this.y0.getVisibility() == 0) {
        }
        org.telegram.ui.Cells.f4 f4Var2 = x2Var.b;
        TextView[] textViewArr2 = x2Var.c;
        layoutParams = (FrameLayout.LayoutParams) f4Var2.getLayoutParams();
        if (layoutParams.rightMargin != dp) {
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.w2 = this.x2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        l2 l2Var = this.K0;
        if (l2Var.W.y()) {
            l2Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((l7) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.b2 != null && this.f3 && this.a1) {
            j1 j1Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(j1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.b2.K(true);
            boolean z11 = this.F1;
            z2 z2Var = this.O1;
            if ((z11 && !z2Var.f) || this.G1) {
                this.k3 = false;
                this.b2.setEnabled(false);
                this.b2.j1(" ", z10);
                return;
            }
            if (this.H1 > 0) {
                this.k3 = false;
                this.b2.setEnabled(true);
                this.b2.j1(xh.z7.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
                return;
            }
            if (!z2Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                int i10 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i10) {
                    this.k3 = true;
                    int currentTime2 = i10 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = currentTime2 / 60;
                    int i12 = currentTime2 % 60;
                    int i13 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int measureText = (int) this.b2.getEditField().getPaint().measureText(LocaleController.formatString(i13, String.format(locale, "%02d:%02d", 99, 99)));
                    this.b2.setEnabled(true);
                    if (measureText * 1.2f >= this.b2.getEditField().getMeasuredWidth()) {
                        t1 t1Var = this.b2;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        t1Var.e = formatString;
                        t1Var.f = format;
                        t1Var.G1(z10);
                    } else {
                        this.b2.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(j1Var, 1000L);
                    return;
                }
            }
            this.k3 = false;
            this.b2.setEnabled(true);
            if (!z2Var.f) {
                this.b2.j1(LocaleController.getString(this.E1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.b2.getStarsPrice() <= 0) {
                this.b2.j1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.b2.j1(xh.z7.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.b2.N4), z10);
            uq uqVar = this.b2.N4[0];
            if (uqVar != null) {
                uqVar.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean s0() {
        if (this.s3) {
            if (this.r3.getReactionsWindow() == null) {
                b1(false);
                return true;
            }
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.r3.getReactionsWindow().c);
                return true;
            }
            this.r3.getReactionsWindow().d();
            return true;
        }
        f2 f2Var = this.j1;
        if (f2Var != null) {
            bi.x4 x4Var = f2Var.c;
            if (x4Var != null) {
                x4Var.e(true);
                f2Var.c = null;
            }
            f2Var.b = null;
            f2Var.invalidate();
            f2Var.b(false);
        }
        l2 l2Var = this.K0;
        if (l2Var.W.y()) {
            l2Var.W.f(false);
            return true;
        }
        bi.x4 x4Var2 = this.F0;
        if (x4Var2 != null) {
            x4Var2.e(true);
        }
        bi.x4 x4Var3 = this.G0;
        if (x4Var3 != null) {
            x4Var3.e(true);
        }
        s40 s40Var = this.W2;
        if (s40Var != null) {
            s40Var.b(true);
        }
        v2 v2Var = this.t1;
        if (v2Var != null && v2Var.b) {
            v2Var.a();
            return true;
        }
        t1 t1Var = this.b2;
        if (t1Var != null && t1Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.b2.c1) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new g1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((l7) this.Q1).h(alertDialog$Builder.a);
            return true;
        }
        pk0 pk0Var = this.f2;
        if (pk0Var != null && pk0Var.getReactionsWindow() != null && !this.f2.getReactionsWindow().q) {
            this.f2.getReactionsWindow().d();
            return true;
        }
        t1 t1Var2 = this.b2;
        if (t1Var2 != null && t1Var2.t0()) {
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.b2.getEmojiView());
                return true;
            }
            this.b2.n0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (l2Var.getVisibility() != 0 || l2Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            l2Var.C();
            this.g3 = false;
            this.c1.invalidate();
            return true;
        }
        t1 t1Var3 = this.b2;
        if (t1Var3 != null) {
            long j3 = this.B1;
            TL_stories.StoryItem storyItem = this.O1.a;
            Editable editText = t1Var3.getEditText();
            this.J0.getClass();
            u7.J(j3, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.b2);
        return true;
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.k1.b = i10;
        pk0 pk0Var = this.f2;
        if (pk0Var != null) {
            pk0Var.setCurrentAccount(i10);
            this.f2.p(null, null, true);
        }
        pk0 pk0Var2 = this.r3;
        if (pk0Var2 != null) {
            pk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(w2 w2Var) {
        this.Q1 = w2Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f3 == z10) {
            return;
        }
        this.f3 = z10;
        if (z10) {
            this.e1.setCurrentAlpha(1.0f);
            r0(false);
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.K1) {
            this.L2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10 = f7 == 0.0f;
        if (this.b1 != z10) {
            this.b1 = z10;
            this.c1.invalidate();
            if (this.K1 && this.J0.a && Build.VERSION.SDK_INT < 33) {
                sg.a1 a1Var = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    u7 u7Var = ((l7) this.Q1).d;
                    u7Var.l1 = true;
                    u7Var.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            gg.h1 h1Var = this.e1;
            if (z10) {
                h1Var.stopAnimation();
                h1Var.setAllowStartAnimation(false);
            } else {
                h1Var.startAnimation();
                h1Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            gg.m mVar = new gg.m(this, getContext(), this.B0);
            this.I2 = mVar;
            mVar.Z1 = new x1(this);
            mVar.j0.f0();
            gg.m mVar2 = this.I2;
            mVar2.W = true;
            mVar2.r1();
            gg.m mVar3 = this.I2;
            mVar3.X = new y1(this);
            mVar3.m1().setText(this.b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.I3);
        this.X1 = aVar;
        aVar.setOnClickListener(new l1(this, 1));
        addView(this.X1, w7.a6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        t1 t1Var = new t1(this, AndroidUtilities.findActivity(getContext()), this, new bi.n1(6, f6Var));
        this.b2 = t1Var;
        t1Var.getEditField().useAnimatedTextDrawable();
        this.b2.getEditField().setScaleX(0.0f);
        this.b2.setOverrideKeyboardAnimation(true);
        this.b2.setClipChildren(false);
        this.b2.setDelegate(new u1(this));
        setDelegate(this.b2);
        t1 t1Var2 = this.b2;
        t1Var2.x4 = false;
        t1Var2.y4 = true;
        if (this.O1.f) {
            t1Var2.V0(false, false, false);
        } else {
            t1Var2.V0(true, true, false);
        }
        this.b2.e();
        t1 t1Var3 = this.b2;
        t1Var3.z4 = true;
        addView(t1Var3, w7.a6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.b2.P1(false);
        }
        this.b2.F2 = this.z2;
        k2.v vVar = this.M2;
        ((ArrayList) vVar.g).add(this.c1);
        ((ArrayList) vVar.g).add(this);
        if (this.a1) {
            this.b2.E0();
        }
        r0(false);
        if (I0()) {
            this.b2.setVisibility(8);
        }
        ih.h hVar = new ih.h(getContext(), f6Var, this.I3, this.F3);
        this.c2 = hVar;
        hVar.setOnClickListener(new g1(this, 1));
        addView(this.c2, w7.a6.e(57, 300, 85));
        this.c2.setVisibility(8);
        this.b2.setSideButtonsForAttach(this.c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.j2 != null) {
            return;
        }
        u6 u6Var = new u6(getContext(), this.B0);
        this.j2 = u6Var;
        u6Var.setOnClickListener(new l1(this, 4));
        this.j2.setAlpha(0.0f);
        this.j2.setVisibility(8);
        addView(this.j2, w7.a6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.a2 != null || getContext() == null) {
            return;
        }
        b1 b1Var = new b1(getContext(), this.I3);
        this.a2 = b1Var;
        b1Var.setOnClickListener(new l1(this, 5));
        b1 b1Var2 = this.a2;
        t0 t0Var = t0.W;
        boolean z10 = true;
        b1Var2.b(t0Var != null && t0Var.o(), false);
        b1 b1Var3 = this.a2;
        t0 t0Var2 = t0.W;
        if (t0Var2 != null && !t0Var2.m()) {
            z10 = false;
        }
        b1Var3.a(z10, false);
        addView(this.a2, w7.a6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void y0() {
        if (this.Z1 != null || getContext() == null) {
            return;
        }
        this.Y1 = new e1(getContext(), this.C2);
        f1 f1Var = new f1(getContext(), this.Y1, this.I3);
        this.Z1 = f1Var;
        f1Var.setOnClickListener(new l1(this, 6));
        this.Z1.setOnLongClickListener(new i1(this, 1));
        addView(this.Z1, w7.a6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.Y1, w7.a6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void z0() {
        if (this.g2 != null) {
            return;
        }
        if (this.b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.h2 = textView;
        textView.setTextColor(-8026747);
        this.h2.setTextSize(1, 16.0f);
        this.h2.setText(LocaleController.getString(this.E1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.i2 = textView2;
        textView2.setTextColor(-1);
        this.i2.setTextSize(1, 12.0f);
        TextView textView3 = this.i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.i2.setGravity(17);
        w7.c6.a(this.i2);
        this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.g2.addView(imageView, w7.a6.t(22, 22, 16, 12, 1, 4, 0));
        this.g2.addView(this.h2, w7.a6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.g2.addView(this.i2, w7.a6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.b2.addView(this.g2, w7.a6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
