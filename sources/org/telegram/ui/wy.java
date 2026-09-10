package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class wy extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, lg.b, le.d, eh0 {
    public static float A4;
    public static boolean x4;
    public static final boolean[] y4 = new boolean[4];
    public static final org.telegram.ui.Components.sr0 z4 = new org.telegram.ui.Components.sr0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public gx B1;
    public boolean B2;
    public Long B3;
    public gy C0;
    public hi.b2 C1;
    public qy C2;
    public Drawable C3;
    public org.telegram.ui.Components.av0 D0;
    public org.telegram.ui.ActionBar.w0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.n5 D3;
    public boolean E;
    public nx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.os F0;
    public fx F1;
    public CharSequence F2;
    public qx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.xq0 G2;
    public final ex G3;
    public long H;
    public float H0;
    public fx H1;
    public uv H2;
    public final ex H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public ch0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.qs J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public bi.nc K0;
    public org.telegram.ui.Components.ps K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.w70 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public sx M0;
    public org.telegram.ui.Cells.z2 M1;
    public int M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ya N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public boolean O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public boolean Q;
    public long Q0;
    public fi.j Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public dv R3;
    public org.telegram.ui.Components.pc S;
    public int S0;
    public boolean S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.d2 T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public boolean U3;
    public boolean V;
    public org.telegram.ui.Components.jd0 V0;
    public boolean V1;
    public int V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.r2 W0;
    public long W1;
    public wy W2;
    public boolean W3;
    public my X;
    public org.telegram.ui.Cells.r2 X0;
    public TLObject X1;
    public long X2;
    public float X3;
    public xf.h0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public y41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public boolean Z3;
    public final int a;
    public org.telegram.ui.Components.u81 a0;
    public final ArrayList a1;
    public boolean a2;
    public org.telegram.ui.Components.w9 a3;
    public ValueAnimator a4;
    public final le.b b;
    public fg.s0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.g9 b3;
    public org.telegram.ui.Components.e50 b4;
    public final le.b c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public long c3;
    public TLRPC.FileLocation c4;
    public final le.b d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public boolean d3;
    public TLRPC.FileLocation d4;
    public final le.b e;
    public vy[] e0;
    public org.telegram.ui.ActionBar.i2 e1;
    public boolean e2;
    public boolean e3;
    public org.telegram.ui.Components.pc e4;
    public final le.b f;
    public org.telegram.ui.ActionBar.w0 f0;
    public final Paint f1;
    public String f2;
    public AnimatorSet f3;
    public int f4;
    public org.telegram.ui.ActionBar.w0 g0;
    public ImageView g1;
    public String g2;
    public boolean g3;
    public int g4;
    public final le.b h;
    public yy h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public float i3;
    public int i4;
    public org.telegram.ui.ActionBar.w0 j0;
    public org.telegram.ui.ActionBar.w0 j1;
    public boolean j2;
    public boolean j3;
    public int j4;
    public org.telegram.ui.ActionBar.w0 k0;
    public org.telegram.ui.ActionBar.w0 k1;
    public boolean k2;
    public int k3;
    public gh.k k4;
    public org.telegram.ui.ActionBar.w0 l0;
    public org.telegram.ui.ActionBar.w0 l1;
    public boolean l2;
    public boolean l3;
    public final zg.e l4;
    public org.telegram.ui.ActionBar.w0 m0;
    public org.telegram.ui.ActionBar.w0 m1;
    public boolean m2;
    public boolean m3;
    public final eh.d m4;
    public final le.b n;
    public org.telegram.ui.Components.pi0 n0;
    public org.telegram.ui.ActionBar.g1 n1;
    public String n2;
    public org.telegram.ui.Components.pc n3;
    public final eh.d n4;
    public org.telegram.ui.ActionBar.g1 o0;
    public org.telegram.ui.ActionBar.g1 o1;
    public String o2;
    public final AnimationNotificationsLocker o3;
    public final eh.c o4;
    public bi.x4 p0;
    public org.telegram.ui.ActionBar.g1 p1;
    public final MessagesStorage.TopicKey p2;
    public boolean p3;
    public final zg.a p4;
    public bi.x4 q0;
    public org.telegram.ui.ActionBar.g1 q1;
    public boolean q2;
    public boolean q3;
    public final zg.a q4;
    public final le.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.g1 r1;
    public boolean r2;
    public boolean r3;
    public final zg.a r4;
    public final le.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.g1 s1;
    public boolean s2;
    public boolean s3;
    public final zg.a s4;
    public org.telegram.ui.Components.h20 t0;
    public org.telegram.ui.ActionBar.g1 t1;
    public boolean t2;
    public float t3;
    public lw t4;
    public org.telegram.ui.Components.h20 u0;
    public float u1;
    public boolean u2;
    public ValueAnimator u3;
    public final ArrayList u4;
    public final oh.i v;
    public bi.d v0;
    public float v1;
    public boolean v2;
    public float v3;
    public final RectF v4;
    public boolean w;
    public ih.f w0;
    public AnimatorSet w1;
    public boolean w2;
    public float w3;
    public final RectF w4;
    public int x;
    public int x0;
    public float x1;
    public boolean x2;
    public float x3;
    public boolean y;
    public final UndoView[] y0;
    public gh.g y1;
    public boolean y2;
    public int y3;
    public uw z0;
    public FrameLayout z1;
    public boolean z2;
    public boolean z3;

    public wy(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.b = new le.b(1, this, wrVar, 350L, false);
        this.c = new le.b(2, this, wrVar, 350L, false);
        this.d = new le.b(3, this, wrVar, 350L, false);
        this.e = new le.b(4, this, wrVar, 350L, false);
        this.f = new le.b(5, this, wrVar, 350L, false);
        this.h = new le.b(6, this, wrVar, 350L, false);
        this.n = new le.b(7, this, wrVar, 350L, false);
        this.r = new le.b(8, this, wrVar, 350L, false);
        this.s = new le.b(9, this, wrVar, 350L, false);
        this.v = new oh.i(new kw(this, 1));
        this.x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.c0 = 1.0f;
        this.y0 = new UndoView[2];
        this.a1 = new ArrayList();
        this.f1 = new Paint();
        this.i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.c2 = true;
        this.i2 = true;
        this.p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.o3 = new AnimationNotificationsLocker();
        this.y3 = -1;
        this.G3 = new ex(this, 0);
        this.H3 = new ex(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.u4 = arrayList;
        RectF rectF = new RectF();
        this.v4 = rectF;
        RectF rectF2 = new RectF();
        this.w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        eh.c cVar = new eh.c();
        this.o4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        if (i10 >= 31) {
            this.l4 = new zg.e(false);
            eh.d dVar = new eh.d(null);
            this.m4 = dVar;
            dVar.j(new cy(this, 0));
            eh.d dVar2 = new eh.d(null);
            this.n4 = dVar2;
            dVar2.j(new cy(this, 3));
            zg.a aVar = new zg.a(dVar);
            this.p4 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            zg.a aVar2 = new zg.a(dVar2);
            this.r4 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            this.q4 = new zg.a(dVar);
        } else {
            this.l4 = null;
            this.m4 = null;
            this.n4 = null;
            this.p4 = new zg.a(cVar);
            this.r4 = new zg.a(cVar);
            this.q4 = new zg.a(cVar);
        }
        this.s4 = new zg.a(cVar);
    }

    public static void A0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        wyVar.U4();
        org.telegram.ui.Components.pc G = org.telegram.ui.Components.wc.a0(wyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void B0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.me0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.me0.h();
            }
        }
    }

    public static void C0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        wyVar.U4();
        org.telegram.ui.Components.pc J = org.telegram.ui.Components.wc.a0(wyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new rv(wyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void D0(wy wyVar) {
        try {
            ((org.telegram.ui.Components.hj0) ((org.telegram.ui.Components.g9) wyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (wyVar.b4 == null) {
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            wyVar.b4 = e50Var;
            e50Var.H = true;
            e50Var.a = wyVar;
            e50Var.b = new ky(wyVar);
            wyVar.getMediaDataController().checkFeaturedStickers();
            wyVar.getMessagesController().loadSuggestedFilters();
            wyVar.getMessagesController().loadUserInfo(wyVar.getUserConfig().getCurrentUser(), true, wyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(wyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(wyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(wyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.yi yiVar = wyVar.b4.c;
        if (yiVar != null) {
            yiVar.c1();
        }
        org.telegram.ui.Components.e50 e50Var2 = wyVar.b4;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        e50Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new rv(wyVar, 0), new sv(wyVar, 0), 0);
    }

    public static /* synthetic */ void E0(wy wyVar, float f7, ValueAnimator valueAnimator) {
        wyVar.e0[0].setTranslationY((1.0f - wyVar.t3) * f7);
        wyVar.t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < wyVar.actionBar.getChildCount(); i10++) {
            if (wyVar.actionBar.getChildAt(i10).getVisibility() == 0 && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getActionMode() && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getBackButton()) {
                wyVar.actionBar.getChildAt(i10).setAlpha(1.0f - wyVar.t3);
            }
        }
        wyVar.E3();
        wyVar.w3();
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(wy wyVar) {
        org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(wyVar.getParentActivity(), wyVar.resourceProvider);
        xbVar.d(R.raw.email_check_inbox, new String[0]);
        xbVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.pc.g(wyVar, xbVar, 2750).j();
        try {
            wyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G0(wy wyVar) {
        org.telegram.ui.Components.ao0 ao0Var;
        ic1 ic1Var;
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            if (i10 == 2) {
                gy gyVar = wyVar.C0;
                if (gyVar == null) {
                    i10++;
                } else {
                    viewGroup = gyVar.V;
                    if (viewGroup == null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = viewGroup.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.j6) {
                                ((org.telegram.ui.Cells.j6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                                ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.bb) {
                                ((org.telegram.ui.Cells.bb) childAt).j(0);
                            }
                        }
                    }
                    i10++;
                }
            } else {
                vy[] vyVarArr = wyVar.e0;
                if (vyVarArr == null) {
                    i10++;
                } else {
                    viewGroup = i10 < vyVarArr.length ? vyVarArr[i10].a : null;
                    if (viewGroup == null) {
                    }
                    i10++;
                }
            }
        }
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null && (ao0Var = gyVar2.b0) != null && (ic1Var = ao0Var.k0) != null) {
            int childCount2 = ic1Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = ic1Var.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt2;
                    org.telegram.ui.Components.g9 g9Var = n4Var.c;
                    int i13 = n4Var.h;
                    if (DialogObject.isUserDialog(n4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(n4Var.f));
                        n4Var.e = user;
                        g9Var.m(i13, user);
                    } else {
                        g9Var.k(i13, MessagesController.getInstance(i13).getChat(Long.valueOf(-n4Var.f)));
                        n4Var.e = null;
                    }
                    n4Var.c(true);
                }
            }
        }
        if (wyVar.e0 != null) {
            int i14 = 0;
            while (true) {
                vy[] vyVarArr2 = wyVar.e0;
                if (i14 >= vyVarArr2.length) {
                    break;
                }
                cx cxVar = vyVarArr2[i14].n;
                if (cxVar != null) {
                    cxVar.i();
                }
                i14++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = wyVar.actionBar;
        if (lVar != null) {
            lVar.D(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            wyVar.actionBar.E(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            wyVar.actionBar.E(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            wyVar.actionBar.F(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
            wyVar.actionBar.e();
        }
        if (wyVar.D3 != null) {
            wyVar.d5(UserConfig.getInstance(wyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.z2 z2Var = wyVar.M1;
        if (z2Var != null) {
            z2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        }
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.m0;
        if (w0Var != null) {
            w0Var.setIconColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.v8));
        }
        gx gxVar = wyVar.B1;
        if (gxVar != null) {
            gxVar.e();
        }
        uw uwVar = wyVar.z0;
        if (uwVar != null) {
            bh.d dVar = uwVar.y0;
            if (dVar != null) {
                dVar.u();
            }
            uwVar.invalidate();
        }
        fg.s0 s0Var = wyVar.b0;
        if (s0Var != null) {
            s0Var.A1();
        }
        gy gyVar3 = wyVar.C0;
        if (gyVar3 != null) {
            SparseArray sparseArray = gyVar3.h;
            for (int i15 = 0; i15 < gyVar3.getChildCount(); i15++) {
                if (gyVar3.getChildAt(i15) instanceof z10) {
                    bi.y1 y1Var = ((z10) gyVar3.getChildAt(i15)).b;
                    int childCount3 = y1Var.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt3 = y1Var.getChildAt(i16);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
            }
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                View view = (View) sparseArray.valueAt(i17);
                if (view instanceof z10) {
                    bi.y1 y1Var2 = ((z10) view).b;
                    int childCount4 = y1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = y1Var2.getChildAt(i18);
                        if (childAt4 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt4).b0(0, true);
                        }
                    }
                }
            }
            z10 z10Var = gyVar3.M0;
            if (z10Var != null) {
                bi.y1 y1Var3 = z10Var.b;
                int childCount5 = y1Var3.getChildCount();
                for (int i19 = 0; i19 < childCount5; i19++) {
                    View childAt5 = y1Var3.getChildAt(i19);
                    if (childAt5 instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt5).b0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.ih0 ih0Var = gyVar3.p0;
            if (ih0Var != null) {
                ih0Var.c();
            }
        }
        org.telegram.ui.Components.u81 u81Var = wyVar.a0;
        if (u81Var != null) {
            bi.y1 y1Var4 = u81Var.v;
            bh.d dVar2 = u81Var.r0;
            if (dVar2 != null) {
                dVar2.u();
            }
            u81Var.O.setColor(org.telegram.ui.ActionBar.j6.v0(u81Var.P, u81Var.j0));
            y1Var4.e1();
            y1Var4.invalidate();
            u81Var.invalidate();
        }
        y41 y41Var = wyVar.Z;
        if (y41Var != null) {
            y41Var.e();
        }
        bi.nc ncVar = wyVar.K0;
        if (ncVar != null && Build.VERSION.SDK_INT >= 23) {
            ncVar.setForeground(new ColorDrawable(i0.a.k(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100)));
        }
        org.telegram.ui.Components.h20 h20Var = wyVar.t0;
        if (h20Var != null) {
            h20Var.g();
        }
        org.telegram.ui.Components.h20 h20Var2 = wyVar.u0;
        if (h20Var2 != null) {
            h20Var2.g();
        }
        eh.c cVar = wyVar.o4;
        int i20 = org.telegram.ui.ActionBar.j6.d6;
        cVar.a(wyVar.getThemedColor(i20));
        org.telegram.ui.Components.qs qsVar = wyVar.J1;
        if (qsVar != null) {
            bh.d dVar3 = qsVar.s;
            if (dVar3 != null) {
                dVar3.u();
            }
            qsVar.invalidate();
        }
        org.telegram.ui.Components.ps psVar = wyVar.K1;
        if (psVar != null) {
            psVar.setColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        }
        fx fxVar = wyVar.H1;
        if (fxVar != null) {
            fxVar.p();
        }
        fx fxVar2 = wyVar.F1;
        if (fxVar2 != null) {
            fxVar2.p();
        }
        wyVar.D4(wyVar.x1);
        nx nxVar = wyVar.E0;
        if (nxVar != null) {
            nxVar.o();
        }
        Drawable drawable = wyVar.C3;
        if (drawable != null) {
            drawable.setColorFilter(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = wyVar.g1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            wyVar.g1.setBackground(org.telegram.ui.ActionBar.j6.f0(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
        }
        my myVar = wyVar.X;
        if (myVar != null) {
            myVar.e();
        }
    }

    public static void H0(wy wyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            sg.p1.e0(0, birthdayState);
            return;
        }
        wh.p1 p1Var = new wh.p1(wyVar.getParentActivity(), wyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        p1Var.V(true);
        wyVar.showDialog(p1Var);
    }

    public static void I0(wy wyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.pc M = org.telegram.ui.Components.wc.a0(wyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.j = 5000;
            M.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            wyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.a2.o(R.string.UnknownError, org.telegram.ui.Components.wc.a0(wyVar), R.raw.error, 36);
            return;
        }
        if (wyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity(), 0, wyVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            wyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void J0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        wyVar.U4();
    }

    public static void N2(wy wyVar, float f7) {
        float f10;
        float f11;
        float clamp = Utilities.clamp(wyVar.x1 * 2.0f, 1.0f, 0.0f);
        nx nxVar = wyVar.E0;
        float f12 = (1.0f - wyVar.t3) * f7 * wyVar.H0;
        float f13 = 1.0f - clamp;
        nxVar.setAlpha(f12 * f13);
        if (wyVar.K || wyVar.M) {
            float clamp2 = Utilities.clamp((-wyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (wyVar.t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            wyVar.E0.setClipTop(0);
            if (wyVar.K || !wyVar.M) {
                wyVar.E0.setTranslationY(((wyVar.T / 2.0f) + (Math.max(wyVar.N, -wyVar.U3()) + wyVar.v3)) - AndroidUtilities.dp(8.0f));
                wyVar.E0.l(clamp2, !wyVar.F3.c());
                if (wyVar.M) {
                    f10 = 1.0f - clamp3;
                    wyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = wyVar.H0;
                }
            } else {
                wyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                wyVar.E0.setProgressToCollapse(1.0f);
                f11 = wyVar.H0;
            }
            f10 = 1.0f - f11;
            wyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (wyVar.L) {
                wyVar.E0.setTranslationY((Math.max(wyVar.N, -wyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                wyVar.E0.setProgressToCollapse(1.0f);
                nx nxVar2 = wyVar.E0;
                nxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - nxVar2.getY()));
            }
            f10 = 1.0f - wyVar.H0;
            wyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            wyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            wyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - wyVar.t3;
            wyVar.actionBar.getTitlesContainer().setAlpha(f15);
            wyVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        wyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        wyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        wyVar.actionBar.getTitlesContainer().setScaleY(f16);
        wyVar.actionBar.getTitlesContainer().setScaleX(f16);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - wyVar.t3) * f14;
        wyVar.actionBar.getTitlesContainer().setAlpha(f17);
        wyVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void O2(wy wyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        if (wyVar.parentLayout == null || wyVar.actionBar == null) {
            return;
        }
        float max = Math.max(wyVar.e.e, wyVar.V3());
        float f7 = 1.0f;
        float f10 = 1.0f - wyVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            i10 = -1;
            f7 = 0.0f;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (f5Var = wyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) f5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static org.telegram.ui.Cells.r2 Q3(vy vyVar) {
        sy syVar = vyVar.a;
        for (int i10 = 0; i10 < syVar.getChildCount(); i10++) {
            View childAt = syVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.P()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void U(wy wyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        wyVar.U4();
    }

    public static /* synthetic */ void V(wy wyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wyVar.t3 = floatValue;
        wyVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < wyVar.actionBar.getChildCount(); i10++) {
            if (wyVar.actionBar.getChildAt(i10).getVisibility() == 0 && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getActionMode() && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getBackButton()) {
                wyVar.actionBar.getChildAt(i10).setAlpha(1.0f - wyVar.t3);
            }
        }
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        wyVar.E3();
        wyVar.w3();
    }

    public static /* synthetic */ void W(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(wyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(wyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new aa(wyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void Y(wy wyVar) {
        ArrayList arrayList = wyVar.I2;
        org.telegram.ui.ActionBar.f5 f5Var = wyVar.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).y()) {
            wyVar.finishPreviewFragment();
            return;
        }
        if (wyVar.R0 != 10) {
            if (MessagesController.getInstance(wyVar.currentAccount).isFrozen()) {
                b.b(wyVar.currentAccount);
                return;
            } else {
                wyVar.presentFragment(new ContactsActivity(a4.a.i("destroyAfterSelect", true)));
                return;
            }
        }
        if (wyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        wyVar.C2.v(wyVar, arrayList2, null, false, wyVar.J2, wyVar.K2, wyVar.L2, null);
    }

    public static /* synthetic */ void Z(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        wyVar.U4();
    }

    public static void a0(wy wyVar) {
        PasskeysActivity.a0(wyVar.currentAccount, wyVar.getParentActivity(), wyVar.resourceProvider, true);
    }

    public static void b0(wy wyVar, int i10, org.telegram.ui.Components.w70 w70Var) {
        if (wyVar.currentAccount == i10) {
            return;
        }
        w70Var.u();
        if (wyVar.getParentActivity() == null) {
            return;
        }
        qy qyVar = wyVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) wyVar.getParentActivity();
        ArrayList arrayList = wyVar.D2;
        String str = wyVar.E2;
        CharSequence charSequence = wyVar.F2;
        gx gxVar = wyVar.B1;
        CharSequence fieldText = gxVar != null ? gxVar.getFieldText() : null;
        launchActivity.K0(i10);
        wy wyVar2 = new wy(wyVar.arguments);
        wyVar2.C2 = qyVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                wyVar2.E4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    wyVar2.F2 = null;
                } else {
                    wyVar2.F2 = charSequence;
                    wyVar2.E2 = null;
                    wyVar2.D2 = null;
                    if (wyVar2.B1 != null) {
                        wyVar2.l3(fieldText);
                    } else {
                        wyVar2.V3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            wyVar2.D2 = null;
        } else {
            wyVar2.D2 = arrayList;
            wyVar2.E2 = null;
            if (wyVar2.B1 != null) {
                wyVar2.l3(fieldText);
            } else {
                wyVar2.V3 = fieldText;
            }
        }
        launchActivity.q0(wyVar2, false, true);
    }

    public static /* synthetic */ void c0(wy wyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(wyVar.currentAccount).getClientUserId());
        wyVar.presentFragment(new eo(bundle));
    }

    public static /* synthetic */ void d0(wy wyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = wyVar.getMessagesController().getUserFull(wyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        wyVar.getMessagesController().invalidateContentSettings();
        wyVar.getConnectionsManager().sendRequest(updatebirthday, new aa(wyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        wyVar.U4();
    }

    public static void d4(eo eoVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.m10[] m10VarArr = (org.telegram.ui.Components.m10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.m10.class);
                if (m10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(m10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(m10VarArr[0]);
                    for (int i10 = 1; i10 < m10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                for (int i11 = spanEnd; i11 <= spanStart2; i11++) {
                                    if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                        break;
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    eoVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void e0(wy wyVar, String str) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, str);
        wyVar.U4();
    }

    public static void f0(wy wyVar, vy vyVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.r2;
        if (z10) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.n2) {
                wyVar.N4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (wyVar.I3()) {
            wyVar.o4(view, i10, 0.0f, vyVar.d);
            return;
        }
        int i12 = wyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.s8)) {
            vyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a4.a.i("forImport", true);
            i14.putLongArray("result", new long[]{wyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = wyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            k70 k70Var = new k70(i14);
            k70Var.Y = new ax(wyVar);
            wyVar.presentFragment(k70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i11 = vyVar.s) == 7 || i11 == 8)) {
            fg.k kVar = (fg.k) vyVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = wyVar.getMessagesController().selectedDialogFilter[vyVar.s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.id;
                    org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(wyVar, false);
                    k10Var.Y = -1;
                    k10Var.c0 = "";
                    k10Var.d0 = new ArrayList();
                    k10Var.f0 = "";
                    k10Var.h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    k10Var.i0 = arrayList;
                    k10Var.z0 = -1;
                    k10Var.C0 = -5;
                    k10Var.Y = i15;
                    k10Var.a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    k10Var.g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = wyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i15) {
                                k10Var.c0 = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    k10Var.S();
                    wyVar.showDialog(k10Var);
                    return;
                }
                return;
            }
        } else if (z10 && !wyVar.actionBar.s() && !wyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        wyVar.n4(view, i10, vyVar.d);
    }

    public static void f1(wy wyVar, boolean z10) {
        if (wyVar.e0 == null || wyVar.N3 == z10) {
            return;
        }
        wyVar.N3 = z10;
        int i10 = 0;
        while (true) {
            vy[] vyVarArr = wyVar.e0;
            if (i10 >= vyVarArr.length) {
                return;
            }
            if (z10) {
                vyVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            wyVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                wyVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static /* synthetic */ void g0(wy wyVar) {
        wyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(wyVar.parentLayout, "newChatsRow");
    }

    public static void i0(wy wyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (wyVar.getParentActivity() == null) {
            return;
        }
        wyVar.t2 = false;
        if (z10 || z11 || z12) {
            wyVar.A0 = true;
            if (z10 && hk0.n(activity)) {
                org.telegram.ui.Components.me0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.jn(1, new pf(25, wyVar, activity)));
                return;
            }
            if (z11 && wyVar.U1 && wyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.w(activity, new bw(wyVar, 0)).a;
                wyVar.T1 = d2Var;
                wyVar.showDialog(d2Var);
            } else if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                wyVar.k3(true);
            } else if (activity instanceof h5) {
                org.telegram.ui.ActionBar.d2 w10 = ((h5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                wyVar.T1 = w10;
                wyVar.showDialog(w10);
            }
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = y4;
        if (zArr[currentAccount]) {
            return;
        }
        MessagesController messagesController = accountInstance.getMessagesController();
        messagesController.loadGlobalNotificationsSettings();
        messagesController.loadDialogs(0, 0, 100, true);
        messagesController.loadHintDialogs();
        messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
        accountInstance.getContactsController().checkInviteText();
        accountInstance.getMediaDataController().checkAllMedia(false);
        AndroidUtilities.runOnUIThread(new fj(accountInstance, 18), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void j0(wy wyVar) {
        if (wyVar.b4.h()) {
            MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            wyVar.U4();
        }
    }

    public static /* synthetic */ void l0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        wyVar.U4();
    }

    public static /* synthetic */ void m0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        wyVar.U4();
    }

    public static void n0(wy wyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        bi.va vaVar;
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.d5.f0(wyVar.currentAccount, tL_error, wyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            wyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        wyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.va vaVar2 = new bi.va(wyVar, j3, 18);
        Pattern pattern = org.telegram.ui.Components.d5.a;
        if (wyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = wyVar.getCurrentAccount();
            Activity parentActivity = wyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            g9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, w7.a6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                vaVar = vaVar2;
                g9Var.k(currentAccount, chat);
                w9Var.e(chat, g9Var);
            } else if (UserObject.isReplyUser(user)) {
                g9Var.p = 0.8f;
                g9Var.g(12);
                w9Var.h(null, null, g9Var, user);
                vaVar = vaVar2;
            } else {
                vaVar = vaVar2;
                if (user.id == clientUserId) {
                    g9Var.p = 0.8f;
                    g9Var.g(1);
                    w9Var.h(null, null, g9Var, user);
                } else {
                    g9Var.p = 1.0f;
                    g9Var.m(currentAccount, user);
                    w9Var.e(user, g9Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.t(vaVar, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            wyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void o0(wy wyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.un0 un0Var = wyVar.C0.o0;
        if (i10 < un0Var.X || i10 >= un0Var.Y) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.v51 G = un0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity(), 0, wyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.R = string;
            d2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.km(21, wyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void p0(wy wyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            wyVar.r4(arrayList, i10, false, false, null);
            return;
        }
        wyVar.getMessagesController().setDialogsInTransaction(true);
        wyVar.r4(arrayList, i10, false, false, z10 ? hashSet : null);
        wyVar.getMessagesController().setDialogsInTransaction(false);
        wyVar.getMessagesController().checkIfFolderEmpty(wyVar.V2);
        int i11 = wyVar.V2;
        if (i11 == 0 || wyVar.R3(wyVar.currentAccount, wyVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        wyVar.e0[0].a.setEmptyView(null);
        wyVar.e0[0].w.setVisibility(4);
        wyVar.finishFragment();
    }

    public static void q1(wy wyVar, vy vyVar, float f7) {
        if (wyVar.T == f7) {
            return;
        }
        wyVar.T = f7;
        if (f7 == 0.0f) {
            wyVar.U = false;
        }
        wyVar.E0.setOverscroll(f7);
        vyVar.a.setViewsOffset(f7);
        vyVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        wyVar.fragmentView.invalidate();
        if (f7 <= AndroidUtilities.dp(90.0f) || wyVar.U) {
            return;
        }
        nx nxVar = wyVar.E0;
        ValueAnimator valueAnimator = nxVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            nxVar.i(nxVar.p0, true);
            wyVar.U = true;
            wyVar.getOrCreateStoryViewer().s(new rv(wyVar, 18));
        }
    }

    public static /* synthetic */ void r0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, wyVar.A3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        wyVar.U4();
    }

    public static boolean r1(wy wyVar, vy vyVar) {
        if (wyVar.F3.c()) {
            return false;
        }
        int i10 = (int) (-wyVar.N);
        int T3 = wyVar.T3();
        int U3 = wyVar.U3();
        if (i10 == 0 || i10 == T3 || i10 == U3 || !vyVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (U3 >= i10 || i10 >= T3) {
            if ((wyVar.t3 != 1.0f ? Utilities.clamp((-wyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < wyVar.E0.B0) {
                vyVar.b.u(-i10);
                return true;
            }
            vyVar.b.u(U3 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - U3;
        if (i11 < dp / 2) {
            vyVar.b.u(-i11);
            return true;
        }
        vyVar.b.u(dp - i11);
        return true;
    }

    public static /* synthetic */ void s0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.me0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.me0.h();
            }
        }
    }

    public static String s2(wy wyVar) {
        ArrayList arrayList = wyVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == wyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(wyVar.currentAccount, longValue) : DialogObject.getShortName(wyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static void t0(wy wyVar) {
        b.c(wyVar.getParentActivity(), wyVar.currentAccount, wyVar.getResourceProvider());
    }

    public static void u0(final int i10, final long j3, TLRPC.Chat chat, final wy wyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        wyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                wyVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = wyVar.V2) != 0 && wyVar.R3(wyVar.currentAccount, wyVar.e0[0].s, i13, false).size() == 1) {
            wyVar.e0[0].w.setVisibility(4);
        }
        wyVar.y3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            wyVar.A4(true, true);
            if (wyVar.R1 != null) {
                i12 = 0;
                while (i12 < wyVar.R1.size()) {
                    if (((TLRPC.Dialog) wyVar.R1.get(i12)).id == j3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            wyVar.o3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView Y3 = wyVar.Y3();
        if (Y3 != null) {
            Y3.j(i10 == 103 ? 0 : z11 ? 1 : 95, j3, new Runnable() { // from class: org.telegram.ui.ew
                @Override // java.lang.Runnable
                public final void run() {
                    wyVar.q4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(wyVar.R3(wyVar.currentAccount, wyVar.e0[0].s, wyVar.V2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i15)).id == j3) {
                i14 = i15;
                break;
            }
            i15++;
        }
        if (i10 == 102) {
            if (i11 < 0 || i14 >= 0 || (arrayList = wyVar.R1) == null) {
                wyVar.A4(false, true);
                return;
            }
            arrayList.remove(i11);
            wyVar.e0[0].x.D();
            wyVar.e0[0].q(true);
        }
    }

    public static void v0(wy wyVar) {
        BirthdayController.getInstance(wyVar.currentAccount).hide();
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        wyVar.U4();
        org.telegram.ui.Components.pc G = org.telegram.ui.Components.wc.a0(wyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static void w0(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            qj1.a(wyVar.getParentActivity(), new rh(wyVar, tL_attachMenuBot, launchActivity), null);
        } else {
            LaunchActivity.C0(launchActivity, wyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static /* synthetic */ void x0(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, wyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(wyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void y0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        wyVar.U4();
    }

    public static void z0(wy wyVar) {
        if (wyVar.O3) {
            bi.x4 x4Var = wyVar.p0;
            if (x4Var != null) {
                x4Var.e(true);
            }
            j4.w o9 = MessagesController.getInstance(wyVar.currentAccount).getStoriesController().o();
            if (o9 != null && o9.a(wyVar.currentAccount, 1)) {
                wyVar.showDialog(new qg.k0(o9.b(), wyVar.currentAccount, wyVar.getParentActivity(), wyVar, null));
                return;
            } else {
                bi.ce E = bi.ce.E(wyVar.getParentActivity(), wyVar.currentAccount);
                E.x = new cy(wyVar, 4);
                E.R(null);
                return;
            }
        }
        bi.x4 x4Var2 = wyVar.q0;
        if (x4Var2 != null) {
            if (x4Var2.V) {
                return;
            } else {
                AndroidUtilities.removeFromParent(x4Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new kw(wyVar, 7));
        bi.x4 x4Var3 = new bi.x4(wyVar.getParentActivity(), 2);
        x4Var3.q(8.0f);
        x4Var3.d = 8000L;
        x4Var3.i();
        x4Var3.p(true);
        x4Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        x4Var3.s(replaceSingleTag);
        x4Var3.l(1.0f, -40.0f);
        x4Var3.h(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        wyVar.q0 = x4Var3;
        x4Var3.setTranslationY((-wyVar.g4) - wyVar.i4);
        ((ViewGroup) wyVar.fragmentView).addView(wyVar.q0, w7.a6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        wyVar.q0.u();
    }

    public final void A3() {
        org.telegram.ui.Components.h20.d(this.l0, com.google.android.gms.internal.vision.e2.C(this.b.e, 1.0f - V3(), 1.0f - this.c.e, this.d.e));
    }

    public final void A4(boolean z10, boolean z11) {
        if (this.e0 == null || this.S1 == z10) {
            return;
        }
        if (z10) {
            this.R1 = new ArrayList(R3(this.currentAccount, this.e0[0].s, this.V2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z10;
        vy vyVar = this.e0[0];
        vyVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (vyVar.a.b0()) {
            this.e0[0].a.post(new kw(this, 8));
        } else {
            this.e0[0].d.l();
        }
    }

    @Override // le.d
    public final void B(float f7, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 != 3 || (w0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
        if (!this.d.f) {
            if (Build.VERSION.SDK_INT >= 23) {
                animatedVectorDrawable.reset();
                return;
            } else {
                animatedVectorDrawable.setVisible(false, true);
                return;
            }
        }
        animatedVectorDrawable.start();
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
            String l02 = PremiumPreviewFragment.l0(2);
            if (premiumPromo != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= premiumPromo.video_sections.size()) {
                        i11 = -1;
                        break;
                    } else if (premiumPromo.video_sections.get(i11).equals(l02)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i11), premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void B3() {
        bi.nc ncVar;
        boolean z10 = !this.j2 && ((ncVar = this.K0) == null || ncVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        ch0 ch0Var = this.I3;
        if (ch0Var != null) {
            ch0Var.a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        vy vyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            vy[] vyVarArr = this.e0;
            if (vyVarArr != null && (vyVar = vyVarArr[0]) != null) {
                vyVar.setLayerType(2, null);
                this.e0[0].setClipChildren(false);
                this.e0[0].setClipToPadding(false);
                this.e0[0].a.setClipChildren(false);
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view != null) {
                ((ViewGroup) view).setClipChildren(false);
                this.fragmentView.requestLayout();
                return;
            }
            return;
        }
        if (this.e0 != null) {
            int i10 = 0;
            while (true) {
                vy[] vyVarArr2 = this.e0;
                if (i10 >= vyVarArr2.length) {
                    break;
                }
                vy vyVar2 = vyVarArr2[i10];
                if (vyVar2 != null) {
                    vyVar2.setLayerType(0, null);
                    vyVar2.setClipChildren(true);
                    vyVar2.setClipToPadding(true);
                    vyVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            lVar2.setLayerType(0, null);
        }
        nx nxVar = this.E0;
        if (nxVar != null) {
            nxVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.h20.d(this.k0, (1.0f - this.b.e) * (1.0f - V3()) * (1.0f - this.c.e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f7) {
        vy[] vyVarArr = this.e0;
        if (vyVarArr != null) {
            int paddingTop = vyVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                vy[] vyVarArr2 = this.e0;
                if (i10 >= vyVarArr2.length) {
                    break;
                }
                vyVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f7 == this.N) {
            return;
        }
        this.N = f7;
        org.telegram.ui.Components.pc pcVar = this.n3;
        if (pcVar != null) {
            pcVar.l();
        }
        if (this.E3 != null) {
            float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.E3;
            float f10 = (int) f7;
            float f11 = oVar.f;
            oVar.h = f10;
            oVar.setTranslationY(f11 + f10);
            this.E3.setAlpha(w7.q.a(currentActionBarHeight, 0.0f, 1.0f));
            this.E3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        E3();
        this.fragmentView.invalidate();
    }

    public final void D3() {
        String string = LocaleController.getString(V3() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.X.r.setContentDescription(string);
        this.X.r.setHint(string);
    }

    public final void D4(float f7) {
        this.x1 = f7;
        if (this.r3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.j6.v8 : org.telegram.ui.ActionBar.j6.O8);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.j6.y8;
            lVar.C(i0.a.d(this.x1, themedColor, getThemedColor(i10)), false);
            this.actionBar.C(i0.a.d(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
            this.actionBar.A(i0.a.d(this.x1, getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.j6.t8 : org.telegram.ui.ActionBar.j6.N8), getThemedColor(org.telegram.ui.ActionBar.j6.z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        S4();
    }

    public final void E3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.q.a(((-this.N) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.t3, this.h.e)) * Math.max(this.b.e, (1.0f - V3()) * a2);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.E2 = null;
            this.F2 = null;
            return;
        }
        this.E2 = str;
        this.F2 = null;
        this.D2 = null;
        if (this.B1 != null) {
            l3(charSequence);
        } else {
            this.V3 = charSequence;
        }
    }

    public final void F3() {
        if (this.Z != null) {
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f7);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.u81 u81Var = this.a0;
        le.b bVar = this.s;
        if (u81Var != null) {
            float f10 = 1.0f - bVar.e;
            u81Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        fg.s0 s0Var = this.b0;
        if (s0Var != null) {
            float f11 = bVar.e;
            s0Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void F4(float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.X3 != f7) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.Y3 = z10;
            this.X3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Y3) {
                float f10 = (1.0f - this.X3) * (-AndroidUtilities.dp(40.0f));
                nx nxVar = this.E0;
                if (nxVar != null) {
                    nxVar.setTranslationX(f10);
                }
                my myVar = this.X;
                if (myVar != null) {
                    myVar.setTranslationX(f10);
                }
                qx qxVar = this.F3;
                if (qxVar == null || qxVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.F3.getFragmentView().setTranslationX(f10);
                return;
            }
            float f11 = -AndroidUtilities.dp(4.0f);
            float f12 = 1.0f - this.X3;
            float f13 = f11 * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            nx nxVar2 = this.E0;
            if (nxVar2 != null) {
                nxVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            my myVar2 = this.X;
            if (myVar2 != null) {
                myVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            qx qxVar2 = this.F3;
            if (qxVar2 == null || qxVar2.getFragmentView() == null) {
                return;
            }
            if (!this.y) {
                this.F3.getFragmentView().setScaleX(f14);
                this.F3.getFragmentView().setScaleY(f14);
                this.F3.getFragmentView().setTranslationX(f13);
            }
            this.F3.getFragmentView().setPivotX(0.0f);
            this.F3.getFragmentView().setPivotY(0.0f);
        }
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            my myVar = this.X;
            le.b bVar = this.b;
            myVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = xf.f0.b(bVar.e);
            org.telegram.ui.Components.w9 w9Var = this.a3;
            if (w9Var != null) {
                w9Var.setScaleX(b10);
                this.a3.setScaleY(b10);
                this.a3.setAlpha(b10);
                this.a3.setVisibility(b10 > 0.0f ? 0 : 8);
            }
            if (this.v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.v0.setScaleX(lerp);
                this.v0.setScaleY(lerp);
                this.v0.setAlpha(b10);
                this.v0.setVisibility(b10 > 0.0f ? 0 : 8);
                this.w0.setAlpha(b10);
                this.w0.setVisibility(b10 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            C3();
            E3();
            return;
        }
        if (i10 == 3) {
            A3();
            return;
        }
        if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i10 == 5) {
            z3();
            return;
        }
        if (i10 == 6) {
            C3();
            E3();
        } else {
            if (i10 == 7) {
                v3();
                return;
            }
            if (i10 == 8) {
                u3();
                F3();
            } else if (i10 == 9) {
                F3();
            }
        }
    }

    public final void G3(boolean z10) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.a0 != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.qs qsVar = this.J1;
        int c10 = measuredHeight + (qsVar != null ? (int) qsVar.c(AndroidUtilities.dp(7.0f)) : 0);
        gy gyVar = this.C0;
        SparseArray sparseArray = gyVar.h;
        gyVar.U0 = c10;
        gyVar.V0 = i10;
        bi.y1 y1Var = gyVar.V;
        if (z10) {
            y1Var.n1(0, c10, 0, i10);
        } else {
            y1Var.setPadding(0, c10, 0, i10);
        }
        gyVar.M0.j(gyVar.U0, gyVar.V0, z10);
        org.telegram.ui.Components.tn0 tn0Var = gyVar.W;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tn0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = gyVar.U0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != gyVar.V0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = gyVar.V0;
            tn0Var.requestLayout();
        }
        org.telegram.ui.Components.ho0.P(gyVar.f0, gyVar.i0, gyVar.U0, gyVar.V0, z10);
        org.telegram.ui.Components.ho0.P(gyVar.k0, gyVar.n0, gyVar.U0, gyVar.V0, z10);
        org.telegram.ui.Components.ho0.P(gyVar.r0, gyVar.u0, gyVar.U0, gyVar.V0, z10);
        org.telegram.ui.Components.ih0 ih0Var = gyVar.p0;
        int i13 = gyVar.U0;
        int i14 = gyVar.V0;
        ih0Var.setClipToPadding(false);
        org.telegram.ui.Components.r61 r61Var = ih0Var.c;
        ih0Var.J = z10;
        ih0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            r61Var.n1(0, i13, 0, i14);
        } else {
            r61Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r61Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        ih0Var.J = false;
        org.telegram.ui.Components.fn0 fn0Var = gyVar.G0;
        if (fn0Var != null) {
            fn0Var.b(gyVar.U0, gyVar.V0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof z10) {
                ((z10) view).j(gyVar.U0, gyVar.V0, z10);
            }
        }
        for (int i16 = 0; i16 < gyVar.getChildCount(); i16++) {
            if (gyVar.getChildAt(i16) instanceof z10) {
                ((z10) gyVar.getChildAt(i16)).j(gyVar.U0, gyVar.V0, z10);
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(getParentActivity(), this.currentAccount, getResourceProvider(), new uv(2, this, r0), new fj(r0, 17));
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(getParentActivity(), getResourceProvider());
        c3Var.c(u6Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
        h3Var.show();
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
        h3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
    }

    public final void H3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        if ((r3.size() + r2.alwaysShow.size()) > 100) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H4(org.telegram.ui.Cells.r2 r2Var) {
        long j3;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j10;
        int i10;
        LinearLayout linearLayout;
        wy wyVar;
        char c10;
        boolean[] zArr;
        MessagesController.DialogFilter dialogFilter;
        boolean[] zArr2;
        long j11;
        ?? r42;
        long j12;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        int i15;
        int i16;
        final long j13;
        int i17;
        org.telegram.ui.ActionBar.g1 g1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        final wy wyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(r2Var.g2);
        boolean z11 = false;
        if (r2Var.O()) {
            if (r2Var.getCurrentDialogFolderId() != 1) {
                return false;
            }
            m4(r2Var);
            return false;
        }
        long dialogId = r2Var.getDialogId();
        Bundle bundle = new Bundle();
        int messageId = r2Var.getMessageId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            return false;
        }
        if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            if (wyVar2.X2 != 0 && ((b10 = ei.u0.b(wyVar2.currentAccount, dialogId)) == 4 || b10 == 3)) {
                return false;
            }
            TLRPC.Chat chat = wyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (messageId == 0 || chat == null || chat.migrated_to == null) {
                j3 = dialogId;
            } else {
                bundle.putLong("migrated_to", dialogId);
                j3 = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -j3);
        }
        if (messageId != 0) {
            bundle.putInt("message_id", messageId);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(dialogId));
        boolean z12 = wyVar2.X2 == 0 && wyVar2.getMessagesController().filtersEnabled && wyVar2.getMessagesController().dialogFiltersLoaded && wyVar2.getMessagesController().dialogFilters != null && wyVar2.getMessagesController().dialogFilters.size() > 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
        if (z12) {
            LinearLayout linearLayout2 = new LinearLayout(wyVar2.getParentActivity());
            linearLayout2.setOrientation(1);
            yx yxVar = new yx(wyVar2.getParentActivity(), 0);
            LinearLayout linearLayout3 = new LinearLayout(wyVar2.getParentActivity());
            linearLayout3.setOrientation(1);
            yxVar.addView(linearLayout3);
            int size = wyVar2.getMessagesController().dialogFilters.size();
            int i18 = 0;
            org.telegram.ui.ActionBar.g1 g1Var2 = null;
            while (i18 < size) {
                final MessagesController.DialogFilter dialogFilter2 = wyVar2.getMessagesController().dialogFilters.get(i18);
                if (dialogFilter2.isDefault()) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j13 = dialogId;
                } else {
                    final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(wyVar2.currentAccount), dialogId);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j13 = dialogId;
                    final ArrayList I = org.telegram.ui.Components.u00.I(wyVar2, dialogFilter2, arrayList, true, z11);
                    if (!includesDialog) {
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, wyVar2.getParentActivity(), null, false, false);
                    g1Var3.setChecked(includesDialog);
                    i17 = i16;
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, g1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, g1Var3.getTextView().getPaint().getFontMetricsInt());
                    g1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                    g1Var3.g(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.l10(wyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                    g1Var3.getTextView().setEmojiColor(wyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    g1Var3.setMinimumWidth(160);
                    g1Var = g1Var3;
                    j13 = j13;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                    g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArrayList arrayList2;
                            long j14;
                            MessagesController.DialogFilter dialogFilter3;
                            wy wyVar3 = wy.this;
                            wyVar3.getClass();
                            boolean z13 = includesDialog;
                            ArrayList arrayList3 = I;
                            MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                            long j15 = j13;
                            if (z13) {
                                dialogFilter4.alwaysShow.remove(Long.valueOf(j15));
                                dialogFilter4.neverShow.add(Long.valueOf(j15));
                                h10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, wyVar3, null);
                                wyVar3.Y3().k(j15, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
                            } else {
                                if (arrayList3.isEmpty()) {
                                    arrayList2 = arrayList3;
                                    j14 = j15;
                                    dialogFilter3 = dialogFilter4;
                                } else {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        dialogFilter4.neverShow.remove(arrayList3.get(i19));
                                    }
                                    dialogFilter4.alwaysShow.addAll(arrayList3);
                                    arrayList2 = arrayList3;
                                    dialogFilter3 = dialogFilter4;
                                    j14 = j15;
                                    h10.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, wyVar3, null);
                                }
                                wyVar3.Y3().k(j14, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                            }
                            wyVar3.b4(true);
                            wyVar3.finishPreviewFragment();
                        }
                    });
                    linearLayout3.addView(g1Var);
                    wyVar2 = this;
                    dialogId = j13;
                    size = i17;
                    i18 = i15 + 1;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                    g1Var2 = g1Var;
                    z11 = false;
                }
                g1Var = g1Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                i17 = i16;
                wyVar2 = this;
                dialogId = j13;
                size = i17;
                i18 = i15 + 1;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                g1Var2 = g1Var;
                z11 = false;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j10 = dialogId;
            org.telegram.ui.ActionBar.g1 g1Var4 = g1Var2;
            i10 = 160;
            if (g1Var4 != null) {
                g1Var4.j(false, true);
            }
            if (linearLayout3.getChildCount() <= 0) {
                z12 = false;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            } else {
                View m1Var = new org.telegram.ui.ActionBar.m1(getParentActivity(), org.telegram.ui.ActionBar.j6.H8, getResourceProvider());
                m1Var.setTag(R.id.fit_width_tag, 1);
                org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
                g1Var5.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var5.setMinimumWidth(160);
                g1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                linearLayout2.addView(g1Var5);
                linearLayout2.addView(m1Var, w7.a6.n(-1, 8));
                linearLayout2.addView(yxVar);
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            }
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j10 = dialogId;
            i10 = 160;
            linearLayout = null;
        }
        org.telegram.ui.ActionBar.p2[] p2VarArr = new org.telegram.ui.ActionBar.p2[1];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (z12) {
            int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
            org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            g1Var6.g(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
            g1Var6.setMinimumWidth(i10);
            g1Var6.setOnClickListener(new org.telegram.ui.Components.u10(29, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var6);
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new iu(p2VarArr, 3));
        }
        if (isCommunity) {
            wyVar = this;
            c10 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (r2Var.getHasUnread()) {
                g1Var7.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            } else {
                g1Var7.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
            }
            g1Var7.setMinimumWidth(i10);
            long j14 = j10;
            wy wyVar3 = this;
            j10 = j14;
            g1Var7.setOnClickListener(new jo(wyVar3, r2Var, j14, 4));
            c10 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var7);
            wyVar = wyVar3;
        }
        boolean[] zArr3 = new boolean[1];
        zArr3[c10] = true;
        TLRPC.Dialog dialog = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(j10);
        int i19 = wyVar.e0[c10].s;
        boolean z13 = (i19 == 7 || i19 == 8) && (!wyVar.actionBar.s() || wyVar.actionBar.t(null));
        if (z13) {
            zArr = zArr3;
            dialogFilter = wyVar.getMessagesController().selectedDialogFilter[wyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
        } else {
            zArr = zArr3;
            dialogFilter = null;
        }
        if (wyVar.g4(dialog)) {
            zArr2 = zArr;
            j11 = j10;
            r42 = 0;
        } else {
            ArrayList<TLRPC.Dialog> dialogs = wyVar.getMessagesController().getDialogs(wyVar.V2);
            int size2 = dialogs.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i20 >= size2) {
                    z10 = z13;
                    zArr2 = zArr;
                    j11 = j10;
                    break;
                }
                TLRPC.Dialog dialog2 = dialogs.get(i20);
                z10 = z13;
                if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                    zArr2 = zArr;
                    j11 = j10;
                } else if (wyVar.g4(dialog2)) {
                    zArr2 = zArr;
                    j11 = j10;
                    if (DialogObject.isEncryptedDialog(dialog2.id)) {
                        i22++;
                    } else {
                        i21++;
                    }
                } else {
                    zArr2 = zArr;
                    j11 = j10;
                    if (!wyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                        break;
                    }
                }
                i20++;
                zArr = zArr2;
                j10 = j11;
                z13 = z10;
            }
            if (dialog == null || wyVar.g4(dialog)) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j11);
                int i23 = !isEncryptedDialog ? 1 : 0;
                if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(j11))) {
                    i14 = i23;
                    i13 = isEncryptedDialog ? 1 : 0;
                    i12 = 0;
                } else {
                    i14 = i23;
                    i13 = isEncryptedDialog ? 1 : 0;
                    i12 = 1;
                }
            }
            int size3 = (!z10 || dialogFilter == null) ? (wyVar.V2 == 0 && dialogFilter == null) ? wyVar.getUserConfig().isPremium() ? wyVar.getMessagesController().maxPinnedDialogsCountPremium : wyVar.getMessagesController().maxPinnedDialogsCountDefault : wyVar.getUserConfig().isPremium() ? wyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : wyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
            boolean z14 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
            r42 = 0;
            zArr2[0] = z14;
        }
        if (zArr2[r42]) {
            org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(wyVar.getParentActivity(), r42, r42);
            if (wyVar.g4(dialog)) {
                g1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
            }
            g1Var8.setMinimumWidth(160);
            long j15 = j11;
            j12 = j15;
            g1Var8.setOnClickListener(new org.telegram.ui.Components.pr(wyVar, dialogFilter, dialog, j15, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var8);
        } else {
            j12 = j11;
        }
        if (DialogObject.isUserDialog(j12) && UserObject.isUserSelf(wyVar.getMessagesController().getUser(Long.valueOf(j12)))) {
            i11 = 0;
        } else {
            org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(wyVar.getParentActivity(), false, false);
            if (wyVar.getMessagesController().isDialogMuted(j12, 0L)) {
                g1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
            } else {
                g1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
            }
            g1Var9.setMinimumWidth(160);
            g1Var9.setOnClickListener(new org.telegram.ui.Components.m80(wyVar, j12, 1));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var9);
        }
        if (!isCommunity) {
            org.telegram.ui.ActionBar.g1 g1Var10 = new org.telegram.ui.ActionBar.g1(wyVar.getParentActivity(), i11, true);
            g1Var10.setIconColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            int i24 = org.telegram.ui.ActionBar.j6.q7;
            g1Var10.setTextColor(wyVar.getThemedColor(i24));
            g1Var10.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, wyVar.getThemedColor(i24)));
            g1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
            g1Var10.setMinimumWidth(160);
            g1Var10.setOnClickListener(new ow(0, wyVar, arrayList));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var10);
        }
        if (isCommunity) {
            if (wyVar.n2 != null) {
                wyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
            }
            wyVar.t4();
            wyVar.parentLayout.setHighlightActionButtons(true);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("community_id", -j12);
            wy wyVar4 = new wy(bundle2);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2VarArr[0] = wyVar4;
                wyVar.presentFragmentAsPreview(wyVar4);
                return false;
            }
            p2VarArr[0] = wyVar4;
            wyVar.presentFragmentAsPreviewWithMenu(wyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
            return false;
        }
        if (!wyVar.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
            return false;
        }
        if (wyVar.n2 != null) {
            wyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
        }
        wyVar.t4();
        wyVar.parentLayout.setHighlightActionButtons(true);
        eo eoVar = new eo(bundle);
        Point point2 = AndroidUtilities.displaySize;
        if (point2.x > point2.y) {
            p2VarArr[0] = eoVar;
            wyVar.presentFragmentAsPreview(eoVar);
            return true;
        }
        p2VarArr[0] = eoVar;
        wyVar.presentFragmentAsPreviewWithMenu(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
        eoVar.J9 = true;
        try {
            eoVar.a1.getAvatarImageView().performAccessibilityAction(64, null);
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean I3() {
        return this.R0 == 10;
    }

    public final void I4(boolean z10) {
        int i10 = 1;
        this.c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.P3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setSelected(false);
            Drawable background = this.m0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new wx(this, z10, i10));
        this.P3.start();
    }

    public final void J3() {
        if (!AndroidUtilities.isTablet()) {
            this.V1 = true;
            return;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.h(true);
        }
        TLObject tLObject = this.X1;
        if (tLObject != null) {
            gy gyVar = this.C0;
            if (gyVar != null) {
                gyVar.b0.R(this.W1, tLObject);
            }
            this.X1 = null;
        }
    }

    public final void J4() {
        if (this.A0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.z0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new kw(this, 9), 1000L);
    }

    public final void K3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null || !lVar.n0) {
            return;
        }
        lVar.h(true);
        this.p3 = false;
        V4(true, true);
    }

    public final void K4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        uv uvVar;
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, this.k0);
        int i12 = org.telegram.ui.ActionBar.j6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new rv(this, 4), false);
                H.k();
            }
            H.i(new rv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new rv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new rv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new rv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var2 = this.resourceProvider;
        boolean a2 = f6Var2 != null ? f6Var2.a() : org.telegram.ui.ActionBar.j6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new rv(this, 11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new rv(this, 12), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new rv(this, 13), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(H);
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (launchActivity2 != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i14);
                i14++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu) {
                    vv vvVar = new vv(this, tL_attachMenuBot2, launchActivity2, 0);
                    uv uvVar2 = new uv(1, this, tL_attachMenuBot2);
                    org.telegram.ui.ActionBar.f6 f6Var3 = H.d;
                    if (H.e != null) {
                        int i15 = org.telegram.ui.ActionBar.j6.F8;
                        int i16 = org.telegram.ui.ActionBar.j6.E8;
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                        g1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                        CharSequence a10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.s8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                        TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                        if (sideAttachMenuBotIcon != null) {
                            launchActivity = launchActivity2;
                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.c7, 1.0f);
                            if (svgThumb != null) {
                                Integer num = H.k0;
                                charSequence = a10;
                                svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(i15, f6Var3), PorterDuff.Mode.SRC_IN));
                            } else {
                                charSequence = a10;
                            }
                            i10 = i16;
                            uvVar = uvVar2;
                            i11 = i15;
                            g1Var = g1Var2;
                            f6Var = f6Var3;
                            g1Var.h(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                            org.telegram.ui.Components.w9 w9Var = g1Var.h;
                            if (w9Var != null) {
                                w9Var.setLayoutParams(w7.a6.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                            }
                        } else {
                            launchActivity = launchActivity2;
                            uvVar = uvVar2;
                            i10 = i16;
                            g1Var = g1Var2;
                            f6Var = f6Var3;
                            CharSequence charSequence2 = a10;
                            i11 = i15;
                            g1Var.g(charSequence2, R.drawable.msg_bot, null);
                        }
                        Integer num2 = H.j0;
                        int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                        Integer num3 = H.k0;
                        g1Var.c(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                        Integer num4 = H.k0;
                        g1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                        Integer num5 = H.l0;
                        g1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                        g1Var.setOnClickListener(new org.telegram.ui.Components.u10(5, H, vvVar));
                        g1Var.setOnLongClickListener(new org.telegram.ui.Components.b0(2, H, uvVar));
                        int i17 = H.S;
                        if (i17 > 0) {
                            g1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                            H.r(g1Var, w7.a6.n(H.S, -2));
                        } else {
                            H.r(g1Var, w7.a6.n(-1, -2));
                        }
                        launchActivity2 = launchActivity;
                        i13 = 0;
                    }
                }
                launchActivity = launchActivity2;
                launchActivity2 = launchActivity;
                i13 = 0;
            }
        }
        if (getUserConfig().showCallsTab) {
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new rv(this, 6), false);
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.o0;
        if (g1Var3 != null) {
            g1Var3.b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.ai));
            this.o0.setOnClickListener(new org.telegram.ui.Components.u10(27, this, H));
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                H.k();
                H.d(this.o0);
            }
        }
        H.Z();
        H.X(-AndroidUtilities.dp(64.0f));
    }

    public final void L3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            this.g1.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
            this.g1.setOnClickListener(new xv(this, 6));
            j3.addView(this.g1, w7.a6.q(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
        j3.addView(this.h1, w7.a6.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new ai.h(2));
        this.k1 = j3.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j3.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.m1 = j3.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.j1 = j3.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j3.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j3.addView(new View(getParentActivity()), w7.a6.n(5, -1));
        this.q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new fw(this, 0));
        arrayList.add(this.k1);
        arrayList.add(this.m1);
        arrayList.add(this.l1);
        arrayList.add(this.j1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.S3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new yv(this, 6));
                showDialog(alertDialog$Builder.a, new sv(this, 1));
                this.S3 = str;
                return;
            }
        }
    }

    public final void M3() {
        gy gyVar = this.C0;
        if ((gyVar != null && gyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        gy gyVar2 = new gy(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.V2, this.X2, new cy(this, 1));
        this.C0 = gyVar2;
        ((py) this.fragmentView).addView(gyVar2, this.B0);
        gy gyVar3 = this.C0;
        gyVar3.b0.U = new iy(this);
        gyVar3.i0.setOnItemClickListener(new yv(this, 1));
        this.C0.n0.setOnItemClickListener(new yv(this, 2));
        this.C0.u0.setOnItemClickListener(new cw(this, 0));
        this.C0.n0.setOnItemLongClickListener(new yv(this, 3));
        this.C0.V.setOnItemClickListener(new yv(this, 4));
        this.C0.V.setOnItemLongClickListener(new cy(this, 2));
        this.C0.setFilteredSearchViewDelegate(new yv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.q4);
    }

    public final void M4(long j3, View view) {
        i3(j3, view);
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!s10) {
            if (this.p3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.g5)) {
                    com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            this.actionBar.O(null, null);
            int i11 = this.e0[0].s;
            ArrayList<TLRPC.Dialog> R3 = ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) ? R3(this.currentAccount, this.e0[0].s, this.V2, this.S1) : getMessagesController().getDialogs(this.V2);
            int size = R3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = R3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!g4(dialog)) {
                        if (!getMessagesController().isPromoDialog(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i12++;
                    }
                }
            }
            if (i12 > 1) {
                if (this.e0 != null) {
                    int i14 = 0;
                    while (true) {
                        vy[] vyVarArr = this.e0;
                        if (i14 >= vyVarArr.length) {
                            break;
                        }
                        vyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.p3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.i1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.u3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.u3 = ValueAnimator.ofFloat(this.t3, 1.0f);
            int i16 = 0;
            while (true) {
                vy[] vyVarArr2 = this.e0;
                if (i16 >= vyVarArr2.length) {
                    break;
                }
                vy vyVar = vyVarArr2[i16];
                if (vyVar != null) {
                    vyVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.u3.addUpdateListener(new zv(this, max, i10));
            this.u3.addListener(new zx(this, max, c10 == true ? 1 : 0));
            this.u3.setInterpolator(org.telegram.ui.Components.wr.f);
            this.u3.setDuration(200L);
            this.u3.start();
            uw uwVar = this.z0;
            if (uwVar != null) {
                uwVar.b(org.telegram.ui.ActionBar.j6.Gh, org.telegram.ui.ActionBar.j6.Fh, org.telegram.ui.ActionBar.j6.Eh, org.telegram.ui.ActionBar.j6.Hh, org.telegram.ui.ActionBar.j6.w8);
            }
            org.telegram.ui.ActionBar.i2 i2Var = this.e1;
            if (i2Var != null) {
                i2Var.c(1.0f, true);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            b4(true);
            return;
        }
        T4(false);
        this.h1.a(arrayList.size(), z10);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new ay(this, parentActivity);
                FrameLayout.LayoutParams d = w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.g4 + this.i4 + d.bottomMargin;
                py pyVar = (py) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                pyVar.addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j3, View view) {
        int i10 = -this.M3;
        this.M3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.wc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.wc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new rv(this, 22))).j();
    }

    public final void O3(final long j3, final long j10, boolean z10, final ig1 ig1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j3)) {
            int i10 = this.R0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j3));
                    if (!user2.mutual_contact) {
                        UndoView Y3 = Y3();
                        if (Y3 != null) {
                            Y3.j(45, j3, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView Y32 = Y3();
                        if (Y32 != null) {
                            Y32.j(46, j3, null);
                            return;
                        }
                        return;
                    }
                    chat = chat2;
                    user = null;
                }
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j3);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new sw(this, d2Var, user, chat, j3, tL_messages_checkHistoryImportPeer));
                try {
                    d2Var.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            int i11 = 1;
            if (!z10 || ((this.f2 == null || this.g2 == null) && this.h2 == null)) {
                if (i10 != 15) {
                    if (this.C2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j3, j10));
                    if (this.C2.v(this, arrayList, null, false, this.J2, this.K2, this.L2, ig1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable h0Var = new a3.h0(this, j3, new a3.g0(this, j3, j10, ig1Var, 11), 18);
                if (j3 < 0) {
                    Q4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                d2Var2.R = formatString;
                d2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new iu(h0Var, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.gp0(16));
                showDialog(d2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j3)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.a2.m(getMessagesController(), j3).user_id));
                if (user5 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.f2, UserObject.getUserName(user5));
                string2 = LocaleController.getString(R.string.Send);
            } else if (!DialogObject.isUserDialog(j3)) {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat3 == null) {
                    return;
                }
                String str3 = chat3.title;
                if (j10 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat3.id, j10)) != null) {
                    str3 = ((Object) str3) + " " + findTopic.title;
                }
                if (this.h2 != null) {
                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.h2, str3);
                    string2 = LocaleController.getString(R.string.Add);
                } else {
                    string = LocaleController.getString(R.string.SendMessageTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.g2, str3);
                    string2 = LocaleController.getString(R.string.Send);
                }
                String str4 = formatStringSimple;
                str = string;
                str2 = str4;
            } else if (j3 == getUserConfig().getClientUserId()) {
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.g2, LocaleController.getString(R.string.SavedMessages));
                string2 = LocaleController.getString(R.string.Send);
            } else {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j3));
                if (user6 == null || this.f2 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.f2, UserObject.getUserName(user6));
                string2 = LocaleController.getString(R.string.Send);
            }
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.a;
            d2Var3.R = str;
            d2Var3.T = AndroidUtilities.replaceTags(str2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.tw
                @Override // org.telegram.ui.ActionBar.c2
                public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i12) {
                    wy.this.O3(j3, j10, false, ig1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(d2Var3) == null) {
                d2Var3.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O4(boolean z10, boolean z11, boolean z12, boolean z13) {
        gy gyVar;
        gy gyVar2;
        nx nxVar;
        gy gyVar3;
        boolean z14;
        gy gyVar4;
        boolean z15;
        org.telegram.ui.Components.u81 u81Var;
        TLRPC.Chat chat;
        qx qxVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            M3();
        } else {
            c5(false);
        }
        int i11 = this.R0;
        if (i11 != 0 && i11 != 3) {
            z16 = false;
        }
        AnimatorSet animatorSet = this.w1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w1 = null;
        }
        this.p3 = z10;
        m3();
        if (z10) {
            if (!this.s3 && !z13) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.l2 || (totalDialogsCount <= 10 && !this.K)) {
                    z14 = true;
                    gyVar4 = this.C0;
                    if (gyVar4 != null) {
                        gyVar4.O0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.r3 = z15;
                    if (z15) {
                        this.s3 = true;
                    }
                    u81Var = this.a0;
                    if (u81Var != null && gyVar4 != null && !z14 && this.X2 == 0) {
                        org.telegram.ui.Components.u81 n10 = gyVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, w7.a6.e(-1, -1, 119));
                    } else if (this.Z != null && z14 && this.X2 == 0) {
                        AndroidUtilities.removeFromParent(u81Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        G3(false);
                        this.C0.setKeyboardHeight(((py) this.fragmentView).getKeyboardHeight());
                        gy gyVar5 = this.C0;
                        gyVar5.A0.clear();
                        gyVar5.J();
                    }
                    chat = this.Y2;
                    if (chat == null) {
                        fg.q0 q0Var = new fg.q0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        q0Var.f = this.Y2;
                        j3(q0Var);
                    } else if (this.V2 != 0 && ((qxVar = this.F3) == null || !qxVar.c())) {
                        j3(new fg.q0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z14 = false;
            gyVar4 = this.C0;
            if (gyVar4 != null) {
            }
            if (z14) {
            }
            this.r3 = z15;
            if (z15) {
            }
            u81Var = this.a0;
            if (u81Var != null) {
            }
            if (this.Z != null) {
                AndroidUtilities.removeFromParent(u81Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Y2;
            if (chat == null) {
            }
        }
        if (z16 && (gyVar3 = this.C0) != null && gyVar3.b0.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (nxVar = this.E0) != null && this.G0) {
            nxVar.setVisibility(0);
        }
        boolean z17 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                gy gyVar6 = this.C0;
                if (gyVar6 != null) {
                    gyVar6.setVisibility(0);
                    gy gyVar7 = this.C0;
                    gyVar7.setPosition(0);
                    if (gyVar7.b0.h() > 0) {
                        gyVar7.c0.h1(0, 0);
                    }
                    s4.c0 c0Var = gyVar7.h0;
                    if (c0Var != null) {
                        c0Var.h1(0, 0);
                    }
                    s4.c0 c0Var2 = gyVar7.m0;
                    if (c0Var2 != null) {
                        c0Var2.h1(0, 0);
                    }
                    s4.c0 c0Var3 = gyVar7.t0;
                    if (c0Var3 != null) {
                        c0Var3.h1(0, 0);
                    }
                    gyVar7.h.clear();
                }
                W4(true, null, null, false, false);
                org.telegram.ui.Components.u81 u81Var2 = this.a0;
                if (u81Var2 != null) {
                    u81Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            A4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            gy gyVar8 = this.C0;
            if (gyVar8 != null) {
                gyVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            vy vyVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(vyVar, (Property<vy, Float>) property, z10 ? 0.0f : 1.0f));
            if (z17) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<vy, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<vy, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            qx qxVar2 = this.F3;
            if (qxVar2 != null) {
                qxVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.F3, (Property<qx, Float>) property, z10 ? 0.0f : 1.0f));
            }
            gy gyVar9 = this.C0;
            if (gyVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(gyVar9, (Property<gy, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.K) {
                    float dp = AndroidUtilities.dp(81.0f) + this.N + AndroidUtilities.dp(48.0f);
                    gy gyVar10 = this.C0;
                    float f7 = z10 ? dp : 0.0f;
                    if (z10) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(gyVar10, this.H3, f7, dp));
                }
                if (z17) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<gy, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<gy, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                Z4(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new tv(this, 1));
            arrayList.add(ofFloat);
            this.w1.playTogether(arrayList);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.wr.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new wx(this, z10, i10));
            this.o3.lock();
            this.w1.start();
        } else {
            A4(false, true);
            if (z10) {
                this.e0[0].a.b1();
            } else {
                sy syVar = this.e0[0].a;
                if (syVar.i1) {
                    syVar.i1 = false;
                    syVar.J0(false);
                }
            }
            this.e0[0].setAlpha(z10 ? 0.0f : 1.0f);
            if (z17) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                this.e0[0].setScaleX(z10 ? 0.95f : 1.0f);
                this.e0[0].setScaleY(z10 ? 0.95f : 1.0f);
            }
            gy gyVar11 = this.C0;
            if (gyVar11 != null) {
                gyVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (z17) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            my myVar = this.X;
            if (myVar != null) {
                myVar.setTranslationY(W3() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z10) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            D4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.x;
        if (i12 >= 0 && (gyVar2 = this.C0) != null) {
            gyVar2.setPosition(gyVar2.L(i12));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (gyVar = this.C0) != null) {
            gyVar.setPosition((gyVar.q0 ? 1 : 0) + 5);
            c5(true);
        }
        F3();
        U4();
    }

    public final void P3(long j3, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            vy[] vyVarArr = this.e0;
            if (i10 >= vyVarArr.length) {
                return;
            }
            int childCount = vyVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                        if (r2Var.getDialogId() == j3) {
                            r2Var.V(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void P4() {
        int i10;
        int i11;
        if (this.M0 != null || SharedConfig.appLocked || (this.K && !this.E0.g())) {
            return;
        }
        c71[] c71VarArr = new c71[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            this.D3.f();
            Drawable drawable = this.D3.f[0];
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i11 = dp;
        }
        rx rxVar = new rx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), c71VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            rxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l4 = this.B3;
        if (l4 != null) {
            rxVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.D3.f[0];
            rxVar.setSelected(drawable2 instanceof org.telegram.ui.Components.p5 ? Long.valueOf(((org.telegram.ui.Components.p5) drawable2).i()) : null);
        }
        rxVar.setSaveState(1);
        rxVar.y(this.D3, titleTextView);
        sx sxVar = new sx(this, rxVar);
        this.M0 = sxVar;
        c71VarArr[0] = sxVar;
        sxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        c71VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.p2, org.telegram.ui.wy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String formatString;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 2;
        int i11 = 1;
        String formatString2 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = formatString2;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.G.bot_participant;
        ?? r92 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().isInChatCached(chat, user)) {
            charSequence = r92;
        }
        if (this.G.bot_admin_rights == null) {
            formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
        } else {
            int i12 = R.string.AreYouSureSendChatToBotAddRights;
            String firstName = UserObject.getFirstName(user);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.G.bot_admin_rights;
            int i13 = org.telegram.ui.Cells.t6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.r6.r(isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.r6.r(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
            }
            if (arrayList.size() == 1) {
                r92 = ((org.telegram.ui.Cells.u6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r92 = new SpannableStringBuilder();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 > 0) {
                        r92.append(", ");
                    }
                    r92.append(((org.telegram.ui.Cells.u6) arrayList.get(i14)).b.toString().toLowerCase());
                }
            }
            formatString = LocaleController.formatString(i12, new Object[]{firstName, str, r92});
        }
        charSequence = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(formatString));
        d2Var.T = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new nf(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new nf(i10, runnable2));
        showDialog(d2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList R3(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.R1) != null) {
            return arrayList;
        }
        MessagesController messagesController = AccountInstance.getInstance(i10).getMessagesController();
        if (i11 == 0) {
            return messagesController.getDialogs(i12);
        }
        if (i11 == 10 || i11 == 13) {
            return messagesController.dialogsServerOnly;
        }
        if (i11 == 2) {
            ArrayList arrayList2 = new ArrayList(messagesController.dialogsMyGroups.size() + messagesController.dialogsMyChannels.size() + messagesController.dialogsCanAddUsers.size() + 2);
            if (messagesController.dialogsMyChannels.size() > 0 && this.y2) {
                arrayList2.add(new ry(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.v2) {
                arrayList2.add(new ry(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.y2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.v2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new ry(2));
                            r2 = false;
                        }
                        arrayList2.add(dialog);
                    }
                }
            }
            return arrayList2;
        }
        if (i11 == 3) {
            return messagesController.dialogsForward;
        }
        if (i11 == 4 || i11 == 12) {
            return messagesController.dialogsUsersOnly;
        }
        if (i11 == 5) {
            return messagesController.dialogsChannelsOnly;
        }
        if (i11 == 6 || i11 == 11) {
            return messagesController.dialogsGroupsOnly;
        }
        if (i11 == 7 || i11 == 8) {
            MessagesController.DialogFilter dialogFilter = messagesController.selectedDialogFilter[i11 != 7 ? 1 : 0];
            return dialogFilter == null ? messagesController.getDialogs(i12) : this.R0 == 3 ? dialogFilter.dialogsForward : dialogFilter.dialogs;
        }
        if (i11 == 9) {
            return messagesController.dialogsForBlock;
        }
        if (i11 != 1 && i11 != 16 && i11 != 14) {
            if (i11 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            TLRPC.User user = messagesController.getUser(Long.valueOf(this.H));
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap<Long, TLRPC.User> users = messagesController.getUsers();
                ArrayList<TLRPC.Dialog> arrayList4 = messagesController.dialogsUsersOnly;
                int size2 = arrayList4.size();
                while (r1 < size2) {
                    TLRPC.Dialog dialog2 = arrayList4.get(r1);
                    r1++;
                    TLRPC.Dialog dialog3 = dialog2;
                    if (l4(getMessagesController().getUser(Long.valueOf(dialog3.id)))) {
                        arrayList3.add(dialog3);
                    }
                }
                for (TLRPC.User user2 : users.values()) {
                    if (user2 != null && !messagesController.dialogs_dict.d(user2.id) && l4(user2)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j3 = user2.id;
                        tL_peerUser.user_id = j3;
                        tL_dialog.id = j3;
                        arrayList3.add(tL_dialog);
                    }
                }
            } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                ConcurrentHashMap<Long, TLRPC.Chat> chats = messagesController.getChats();
                ArrayList<TLRPC.Dialog> arrayList5 = this.G instanceof TLRPC.TL_requestPeerTypeChat ? messagesController.dialogsGroupsOnly : messagesController.dialogsChannelsOnly;
                int size3 = arrayList5.size();
                while (r1 < size3) {
                    TLRPC.Dialog dialog4 = arrayList5.get(r1);
                    r1++;
                    TLRPC.Dialog dialog5 = dialog4;
                    if (k4(getMessagesController().getChat(Long.valueOf(-dialog5.id)), user)) {
                        arrayList3.add(dialog5);
                    }
                }
                for (TLRPC.Chat chat : chats.values()) {
                    if (chat != null && !messagesController.dialogs_dict.d(-chat.id) && k4(chat, user)) {
                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_dialog2.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = chat.id;
                        } else {
                            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                            tL_dialog2.peer = tL_peerChat;
                            tL_peerChat.chat_id = chat.id;
                        }
                        tL_dialog2.id = -chat.id;
                        arrayList3.add(tL_dialog2);
                    }
                }
            }
            return arrayList3;
        }
        ArrayList arrayList6 = this.T3;
        if (arrayList6 != null) {
            return arrayList6;
        }
        this.T3 = new ArrayList();
        r2 = i11 == 16;
        if (this.z2 || this.A2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList7 = messagesController.dialogsUsersOnly;
            int size4 = arrayList7.size();
            int i14 = 0;
            while (i14 < size4) {
                TLRPC.Dialog dialog6 = arrayList7.get(i14);
                i14++;
                TLRPC.Dialog dialog7 = dialog6;
                TLRPC.User user3 = messagesController.getUser(Long.valueOf(dialog7.id));
                if (user3 != null && !UserObject.isDeleted(user3)) {
                    if (!r2) {
                        if (user3.bot) {
                            if (this.A2) {
                                if (UserObject.isUserSelf(user3)) {
                                }
                            }
                        } else if (this.z2) {
                            if (UserObject.isUserSelf(user3)) {
                            }
                        }
                        this.T3.add(dialog7);
                    } else if (!UserObject.isService(user3.id) && !MessagesController.isSupportUser(user3)) {
                        this.T3.add(dialog7);
                    }
                }
            }
        }
        if (this.v2 || (((z11 = this.x2) && this.w2) || r2)) {
            ArrayList<TLRPC.Dialog> arrayList8 = messagesController.dialogsGroupsOnly;
            int size5 = arrayList8.size();
            int i15 = 0;
            while (i15 < size5) {
                TLRPC.Dialog dialog8 = arrayList8.get(i15);
                i15++;
                TLRPC.Dialog dialog9 = dialog8;
                TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-dialog9.id));
                if (chat2 != null && !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    if (r2) {
                        if (ChatObject.isMegagroup(chat2)) {
                            this.T3.add(dialog9);
                        }
                    } else if (messagesController.canAddToForward(dialog9)) {
                        this.T3.add(dialog9);
                    }
                }
            }
        } else if (z11 || this.w2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList9 = messagesController.dialogsGroupsOnly;
            int size6 = arrayList9.size();
            int i16 = 0;
            while (i16 < size6) {
                TLRPC.Dialog dialog10 = arrayList9.get(i16);
                i16++;
                TLRPC.Dialog dialog11 = dialog10;
                TLRPC.Chat chat3 = messagesController.getChat(Long.valueOf(-dialog11.id));
                if (chat3 != null && !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                    if (r2) {
                        if (ChatObject.isMegagroup(chat3)) {
                            this.T3.add(dialog11);
                        }
                    } else if (messagesController.canAddToForward(dialog11)) {
                        if (this.x2) {
                            if (!ChatObject.isMegagroup(chat3)) {
                                this.T3.add(dialog11);
                            }
                        }
                        if (this.w2 && ChatObject.isMegagroup(chat3)) {
                            this.T3.add(dialog11);
                        }
                    }
                }
            }
        }
        if (this.y2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList10 = messagesController.dialogsChannelsOnly;
            int size7 = arrayList10.size();
            while (r1 < size7) {
                TLRPC.Dialog dialog12 = arrayList10.get(r1);
                r1++;
                TLRPC.Dialog dialog13 = dialog12;
                TLRPC.Chat chat4 = messagesController.getChat(Long.valueOf(-dialog13.id));
                if (r2) {
                    if (chat4 instanceof TLRPC.TL_channel) {
                        this.T3.add(dialog13);
                    }
                } else if (messagesController.canAddToForward(dialog13)) {
                    this.T3.add(dialog13);
                }
            }
        }
        getMessagesController().sortDialogsList(this.T3);
        return this.T3;
    }

    public final void R4(boolean z10) {
        vy[] vyVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            vyVarArr = this.e0;
            if (i11 >= vyVarArr.length) {
                break;
            }
            vyVarArr[i11].a.B0();
            i11++;
        }
        char c10 = (!z10 || vyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = vyVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.e0[c10].h);
        if (dialogFilter.isDefault()) {
            vy vyVar = this.e0[c10];
            vyVar.s = this.R0;
            sy syVar = vyVar.a;
            int i13 = sy.v3;
            syVar.z1();
        } else {
            vy[] vyVarArr2 = this.e0;
            if (vyVarArr2[c10 ^ 1].s == 7) {
                vyVarArr2[c10].s = 8;
            } else {
                vyVarArr2[c10].s = 7;
            }
            vyVarArr2[c10].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.e0[c10].s == 8 ? 1 : 0);
        }
        vy[] vyVarArr3 = this.e0;
        if (vyVarArr3.length > 1) {
            vyVarArr3[1].E = dialogFilter.locked;
        }
        vy vyVar2 = vyVarArr3[c10];
        dx dxVar = vyVar2.d;
        dxVar.h = vyVar2.s;
        dxVar.l();
        vy vyVar3 = this.e0[c10];
        zw zwVar = vyVar3.c;
        if (vyVar3.s == 0 && Z3() && this.e0[c10].v == 2) {
            i10 = 1;
        }
        zwVar.h1(i10, (int) this.N);
        r3(this.e0[c10]);
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.eh0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        qx qxVar;
        bi.nc ncVar;
        uw uwVar;
        if (!this.p3 && (((qxVar = this.F3) == null || !qxVar.c()) && (((ncVar = this.K0) == null || ncVar.getVisibility() != 0) && ((uwVar = this.z0) == null || !uwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                uw uwVar2 = this.z0;
                boolean z11 = uwVar2 == null || uwVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                uw uwVar3 = this.z0;
                boolean z12 = uwVar3 == null || uwVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (!z10) {
                    return z11;
                }
                if (!z12 || z11) {
                }
            }
            return true;
        }
        return false;
    }

    public final float S3(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - V3()) * this.r.e;
    }

    public final void S4() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        y41 y41Var = this.Z;
        float measuredHeight = (y41Var == null || y41Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float dp = this.K ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.K) {
            float f16 = this.N;
            float f17 = this.x1;
            f7 = (measuredHeight * f17) + com.google.android.gms.internal.vision.e2.z(1.0f, f17, dp, f16);
            f10 = this.w3;
        } else {
            f7 = (measuredHeight * this.x1) + this.N;
            f10 = this.w3;
        }
        float f18 = f7 + f10 + this.T;
        my myVar = this.X;
        float dp2 = AndroidUtilities.dp(4.0f) * ((myVar == null || myVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        uw uwVar = this.z0;
        if (uwVar != null) {
            uwVar.setTranslationY(f18 - dp2);
            f12 = this.z0.getAlpha();
            f13 = AndroidUtilities.dp(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.qs qsVar = this.J1;
        if (qsVar != null) {
            qsVar.setTranslationY(AndroidUtilities.lerp(f11 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.a0 == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.ps psVar = this.K1;
        if (psVar != null) {
            psVar.setTranslationY(f18 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f14, f12));
            org.telegram.ui.Components.ps psVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f15 + f13) - lerp);
            Matrix matrix = psVar2.b;
            if (psVar2.e != lerp || psVar2.f != min) {
                psVar2.e = lerp;
                psVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = psVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                psVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f12, f14));
        }
    }

    public final int T3() {
        if (!this.K) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03de, code lost:
    
        if (r1.isEmpty() == false) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T4(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        uw uwVar;
        org.telegram.ui.Components.n00 d;
        long j3;
        TLRPC.User user;
        this.U2 = false;
        this.S2 = 0;
        this.P2 = 0;
        this.O2 = 0;
        this.N2 = 0;
        this.M2 = 0;
        this.T2 = 0;
        this.Q2 = 0;
        this.R2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.I2;
        int size = arrayList.size();
        long clientUserId = getUserConfig().getClientUserId();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i10 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(((Long) arrayList.get(i10)).longValue());
            if (dialog == null) {
                j3 = clientUserId;
            } else {
                long j10 = dialog.id;
                boolean g42 = g4(dialog);
                j3 = clientUserId;
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().isForum(j10)) {
                    this.T2++;
                }
                int i17 = i14;
                int i18 = i15;
                if (getMessagesController().isDialogMuted(j10, 0L)) {
                    this.P2++;
                } else {
                    this.O2++;
                }
                if (z12) {
                    this.M2++;
                }
                if (this.V2 == 1 || dialog.folder_id == 1) {
                    this.S2++;
                } else if (j10 != j3 && dialog.community_id == 0 && j10 != 777000 && !getMessagesController().isPromoDialog(j10, false)) {
                    i14 = i17 + 1;
                    if (dialog.community_id != 0) {
                        i12++;
                    }
                    if (DialogObject.isUserDialog(j10) || j10 == j3 || j10 == UserObject.VERIFY || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j10)))) {
                        i16++;
                    } else if (org.telegram.messenger.a2.v("dialog_bar_report", j10, notificationsSettings, true)) {
                        this.R2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.a2.m(getMessagesController(), dialog.id);
                            user = m10 != null ? getMessagesController().getUser(Long.valueOf(m10.user_id)) : new TLRPC.TL_userEmpty();
                        } else {
                            user = (isChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                        }
                        if (user != null && user.bot) {
                            MessagesController.isSupportUser(user);
                        }
                        if (g42) {
                            i15 = i18 + 1;
                        } else {
                            this.N2++;
                            i15 = i18;
                        }
                    } else {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                        if (getMessagesController().isPromoDialog(dialog.id, true)) {
                            this.Q2++;
                            if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                i11++;
                                this.U2 = true;
                            }
                            i15 = i18;
                        } else {
                            if (g42) {
                                i15 = i18 + 1;
                            } else {
                                this.N2++;
                                i15 = i18;
                            }
                            if (chat == null || !chat.megagroup) {
                                this.Q2++;
                            } else if (ChatObject.isPublic(chat)) {
                                this.Q2++;
                            }
                            i11++;
                        }
                    }
                    i13++;
                    i11++;
                }
                i14 = i17;
                if (dialog.community_id != 0) {
                }
                if (DialogObject.isUserDialog(j10)) {
                }
                i16++;
                if (DialogObject.isChannel(dialog)) {
                }
                i13++;
                i11++;
            }
            i10++;
            clientUserId = j3;
        }
        int i19 = i14;
        int i20 = i15;
        org.telegram.ui.ActionBar.w0 w0Var3 = this.j1;
        if (w0Var3 != null) {
            if (i11 != size || i12 > 0) {
                w0Var3.setVisibility(8);
            } else {
                w0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = this.r1;
        if (g1Var2 != null) {
            int i21 = this.Q2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                g1Var2.setVisibility(0);
                if (this.Q2 != 0) {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                g1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.q1;
        if (g1Var3 != null && this.m1 != null) {
            if (this.S2 != 0 && i12 == 0 && this.X2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.q1.g(string, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(string);
                uw uwVar2 = this.z0;
                if (uwVar2 == null || uwVar2.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else if (i19 != 0 && i12 == 0 && this.X2 == 0) {
                String string2 = LocaleController.getString(R.string.Archive);
                this.q1.g(string2, R.drawable.msg_archive, null);
                this.m1.setIcon(R.drawable.msg_archive);
                this.m1.setContentDescription(string2);
                uw uwVar3 = this.z0;
                if (uwVar3 == null || uwVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                g1Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var4 = this.k1;
        if (w0Var4 != null && this.n1 != null) {
            if (this.N2 + i20 == size && this.X2 == 0) {
                uw uwVar4 = this.z0;
                if (uwVar4 == null || uwVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                w0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.t1;
        if (g1Var4 != null) {
            if (i16 != 0) {
                g1Var4.setVisibility(8);
            } else {
                g1Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            uw uwVar5 = this.z0;
            boolean z13 = uwVar5 == null || uwVar5.getVisibility() != 0 || ((d = (uwVar = this.z0).d()) != null && d.a == uwVar.L);
            if (!z13) {
                try {
                    z13 = size >= R3(this.currentAccount, this.e0[0].d.h, this.V2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z11 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.V2 != 1) {
                        if (this.z0 != null && S3(z11) > 0.5f) {
                            uw uwVar6 = this.z0;
                            org.telegram.ui.Components.n00 d10 = uwVar6.d();
                            if (d10 != null && d10.a == uwVar6.L) {
                                int i22 = org.telegram.ui.Components.u00.w;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i23 = 0; i23 < size2; i23++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                                    if (!org.telegram.ui.Components.u00.I(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                                        arrayList2.add(dialogFilter);
                                    }
                                }
                            }
                        }
                        this.o1.setVisibility(8);
                    }
                    this.o1.setVisibility(0);
                }
                w0Var = this.l1;
                if (w0Var != null) {
                    if (this.P2 != 0) {
                        w0Var.setIcon(R.drawable.msg_unmute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    } else {
                        w0Var.setIcon(R.drawable.msg_mute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                    }
                }
                g1Var = this.s1;
                if (g1Var != null) {
                    if (this.M2 != 0) {
                        g1Var.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                        this.s1.setVisibility(0);
                    } else if (this.T2 == 0 && i12 == 0) {
                        g1Var.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                        this.s1.setVisibility(0);
                    } else {
                        g1Var.setVisibility(8);
                    }
                }
                w0Var2 = this.k1;
                if (w0Var2 != null || this.n1 == null) {
                }
                if (this.N2 != 0) {
                    w0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(LocaleController.getString(R.string.PinToTop));
                    this.n1.setText(LocaleController.getString(R.string.DialogPin));
                    return;
                } else {
                    w0Var2.setIcon(R.drawable.msg_unpin);
                    this.k1.setContentDescription(LocaleController.getString(R.string.UnpinFromTop));
                    this.n1.setText(LocaleController.getString(R.string.DialogUnpin));
                    return;
                }
            }
            this.p1.setVisibility(8);
        }
        z11 = false;
        if (this.o1 != null) {
        }
        w0Var = this.l1;
        if (w0Var != null) {
        }
        g1Var = this.s1;
        if (g1Var != null) {
        }
        w0Var2 = this.k1;
        if (w0Var2 != null) {
        }
    }

    public final int U3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4() {
        long j3;
        boolean z10;
        boolean z11;
        String str;
        ApplicationLoader applicationLoader;
        boolean z12;
        String next;
        boolean z13;
        StringBuilder sb2;
        final long j10;
        final long j11;
        qx qxVar;
        boolean z14;
        qx qxVar2;
        boolean z15;
        qx qxVar3;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.z2 z2Var = this.M1;
        final int i10 = 0;
        if (z2Var != null) {
            try {
                ((org.telegram.ui.Components.hj0) ((org.telegram.ui.Components.g9) z2Var.h.getImageReceiver().getStaticThumb()).B).v0 = null;
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.z2 z2Var2 = this.M1;
            z2Var2.setCompact(false);
            z2Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.w9 w9Var = z2Var2.h;
            w9Var.setVisibility(8);
            w9Var.b();
        }
        long j12 = 0;
        final int i11 = 1;
        if (isInPreviewMode()) {
            str = null;
        } else {
            if (getMessagesController().isFrozen()) {
                this.M1.setOnClickListener(new xv(this, 12));
                this.M1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i12 = 4;
                if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new xv(this, 19));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.M1.c, new kw(this, i12)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.M1.setOnCloseListener(new xv(this, 24));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new xv(this, 25));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.M1.c, new kw(this, i12)), LocaleController.getString(R.string.GraceMessage));
                    this.M1.setOnCloseListener(new xv(this, 26));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.M1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt()));
                    this.M1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pw
                        public final /* synthetic */ wy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    nf.f.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    wy.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pw
                        public final /* synthetic */ wy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    nf.f.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    wy.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.V2 == 0 && this.X2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        xh.v5 y3 = xh.v5.y(this.currentAccount, false);
                        ArrayList arrayList = y3.z;
                        if (!arrayList.isEmpty()) {
                            long j13 = -y3.f.amount;
                            int i13 = 0;
                            while (i13 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i13);
                                long j14 = j12;
                                long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
                                if (peerDialogId >= j14) {
                                    if (getMessagesController().getUser(Long.valueOf(peerDialogId)) == null) {
                                        i13++;
                                        j12 = j14;
                                    }
                                    j13 += starsSubscription.pricing.amount;
                                    i13++;
                                    j12 = j14;
                                } else {
                                    if (getMessagesController().getChat(Long.valueOf(-peerDialogId)) == null) {
                                        i13++;
                                        j12 = j14;
                                    }
                                    j13 += starsSubscription.pricing.amount;
                                    i13++;
                                    j12 = j14;
                                }
                            }
                            j3 = j12;
                            if (j13 > j3) {
                                xh.v5 y10 = xh.v5.y(this.currentAccount, false);
                                ArrayList arrayList2 = y10.z;
                                StringBuilder sb3 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb2 = sb3;
                                    j10 = j3;
                                    j11 = j10;
                                } else {
                                    long j15 = j3;
                                    j11 = j15;
                                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i14);
                                        long peerDialogId2 = DialogObject.getPeerDialogId(starsSubscription2.peer);
                                        if (j11 == j3) {
                                            j11 = peerDialogId2;
                                        }
                                        if (peerDialogId2 >= j3) {
                                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerDialogId2));
                                            if (user != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(UserObject.getUserName(user));
                                                j15 += starsSubscription2.pricing.amount;
                                            }
                                        } else {
                                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-peerDialogId2));
                                            if (chat != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(chat.title);
                                                j15 += starsSubscription2.pricing.amount;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j10 = j15;
                                }
                                final String sb4 = sb2.toString();
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.qw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        wy wyVar = wy.this;
                                        new xh.o7(wyVar.getParentActivity(), wyVar.getResourceProvider(), j10, 2, sb4, new rv(wyVar, 16), j11).show();
                                    }
                                });
                                org.telegram.ui.Cells.z2 z2Var3 = this.M1;
                                long j16 = j10 - y10.f.amount;
                                if (j16 > j3) {
                                    j10 = j16;
                                }
                                z2Var3.b(xh.z7.X0(false, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j10, sb4), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.M1.setOnCloseListener(new xv(this, 13));
                                z13 = true;
                                str = null;
                                qxVar = this.F3;
                                le.b bVar = this.b;
                                if ((qxVar != null && qxVar.c()) || bVar.f) {
                                    z13 = false;
                                }
                                this.J1.i(this.M1, z13, true);
                                q3(true);
                                if (this.fragmentView != null || this.J1 == null) {
                                    z14 = false;
                                } else {
                                    boolean z16 = !isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((qxVar3 = this.F3) == null || !qxVar3.c()) && !bVar.f;
                                    if (z16) {
                                        if (this.N1 == null) {
                                            org.telegram.ui.Cells.ya yaVar = new org.telegram.ui.Cells.ya(getParentActivity());
                                            this.N1 = yaVar;
                                            this.J1.addView(yaVar);
                                        }
                                        org.telegram.ui.Cells.ya yaVar2 = this.N1;
                                        int i15 = this.currentAccount;
                                        TextView textView = yaVar2.b;
                                        TextView textView2 = yaVar2.c;
                                        ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList3 = MessagesController.getInstance(i15).getUnconfirmedAuthController().auths;
                                        org.telegram.ui.Cells.xa xaVar = yaVar2.d;
                                        xaVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                                        xaVar.a(false, false);
                                        org.telegram.ui.Cells.xa xaVar2 = yaVar2.e;
                                        xaVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                                        xaVar2.a(false, false);
                                        if (arrayList3 != null && arrayList3.size() == 1) {
                                            UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList3.get(0);
                                            textView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
                                            String str2 = "" + unconfirmedAuth.device;
                                            if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str2.isEmpty()) {
                                                str2 = str2.concat(", ");
                                            }
                                            StringBuilder u10 = a4.a.u(str2);
                                            u10.append(unconfirmedAuth.location);
                                            String sb5 = u10.toString();
                                            if (unconfirmedAuth.bot) {
                                                textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingleBot, "@" + DialogObject.getShortName(unconfirmedAuth.bot_id), sb5));
                                                z15 = true;
                                                xaVar.setOnClickListener(new org.telegram.ui.Cells.va(this, z15, i15, arrayList3));
                                                z14 = false;
                                                xaVar2.setOnClickListener(new org.telegram.ui.Cells.wa((Object) yaVar2, i15, (Object) arrayList3, (int) (0 == true ? 1 : 0)));
                                            } else {
                                                textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, sb5));
                                            }
                                        } else if (arrayList3 != null && arrayList3.size() > 1) {
                                            textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
                                            String str3 = arrayList3.get(0).location;
                                            int i16 = 1;
                                            while (true) {
                                                if (i16 >= arrayList3.size()) {
                                                    break;
                                                }
                                                if (!TextUtils.equals(str3, arrayList3.get(i16).location)) {
                                                    str3 = str;
                                                    break;
                                                }
                                                i16++;
                                            }
                                            if (str3 == null) {
                                                textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultiple", arrayList3.size(), new Object[0]));
                                            } else {
                                                textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultipleFrom", arrayList3.size(), str3));
                                            }
                                        }
                                        z15 = false;
                                        xaVar.setOnClickListener(new org.telegram.ui.Cells.va(this, z15, i15, arrayList3));
                                        z14 = false;
                                        xaVar2.setOnClickListener(new org.telegram.ui.Cells.wa((Object) yaVar2, i15, (Object) arrayList3, (int) (0 == true ? 1 : 0)));
                                    } else {
                                        z14 = false;
                                    }
                                    org.telegram.ui.Cells.ya yaVar3 = this.N1;
                                    if (yaVar3 != null) {
                                        this.J1.i(yaVar3, z16, true);
                                    }
                                }
                                if (this.fragmentView == null || this.J1 == null) {
                                    return;
                                }
                                if (!isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && getGiftAuctionsController().hasActiveAuctions() && (((qxVar2 = this.F3) == null || !qxVar2.c()) && !bVar.f)) {
                                    z14 = true;
                                }
                                if (z14 && this.L1 == null) {
                                    org.telegram.ui.Cells.m mVar = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                                    this.L1 = mVar;
                                    this.J1.addView(mVar);
                                }
                                org.telegram.ui.Cells.m mVar2 = this.L1;
                                if (mVar2 != null) {
                                    this.J1.i(mVar2, z14, true);
                                    return;
                                }
                                return;
                            }
                            if (this.V2 == 0 || this.X2 != j3 || getMessagesController().premiumPurchaseBlocked() || !BirthdayController.getInstance(this.currentAccount).contains() || getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                int i17 = 15;
                                if (this.V2 != 0 && this.X2 == j3 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                    ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                    this.M1.setOnClickListener(new xv(this, i17));
                                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.M1.c, new kw(this, i12)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                    this.M1.setOnCloseListener(new xv(this, 16));
                                } else if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                                    this.M1.setOnClickListener(new bi.d5(i17));
                                    this.M1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.j6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                    this.M1.setOnCloseListener(new xv(this, 17));
                                } else if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                    this.M1.setOnClickListener(new xv(this, 18));
                                    this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.j6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                } else {
                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.V2 != 0 || this.X2 != j3 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) == null : BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null))) {
                                        z10 = false;
                                    } else {
                                        this.A3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                        z10 = true;
                                    }
                                    if (z10) {
                                        this.M1.setOnClickListener(new xv(this, 20));
                                        this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.A3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.j6.I6, 2, null), LocaleController.getString(this.A3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                    } else {
                                        if (this.O1 != null && this.P1 != null) {
                                            if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                                MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                            } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j3)) {
                                                z11 = true;
                                                int i18 = 21;
                                                if (!z11) {
                                                    this.M1.setOnClickListener(new xv(this, i18));
                                                    this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.O1.longValue())), org.telegram.ui.ActionBar.j6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                } else if (this.V2 == 0 && this.X2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                    this.M1.setOnClickListener(new xv(this, 22));
                                                    this.M1.h.setVisibility(0);
                                                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                                                    g9Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                    long clientUserId = getUserConfig().getClientUserId();
                                                    g9Var.A = true;
                                                    g9Var.b = true;
                                                    g9Var.c = false;
                                                    int i19 = org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.g9.e(clientUserId)];
                                                    org.telegram.ui.ActionBar.f6 f6Var = g9Var.z;
                                                    g9Var.d = org.telegram.ui.ActionBar.j6.v0(i19, f6Var);
                                                    g9Var.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.g9.e(clientUserId)], f6Var);
                                                    g9Var.n = 0;
                                                    g9Var.m = false;
                                                    org.telegram.ui.Components.g9.a("", "", "", g9Var.q);
                                                    g9Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.M1.h.setImageDrawable(g9Var);
                                                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.M1.c, new kw(this, i12)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                    this.M1.setOnCloseListener(new xv(this, 23));
                                                } else {
                                                    if (this.V2 == 0 && this.X2 == 0 && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null) {
                                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                                        boolean[] zArr = new boolean[1];
                                                        if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                            z12 = true;
                                                        } else {
                                                            Iterator<String> it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                            while (it.hasNext()) {
                                                                next = it.next();
                                                                if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                    z12 = true;
                                                                    break;
                                                                }
                                                            }
                                                            z12 = false;
                                                        }
                                                        next = null;
                                                        if (z12) {
                                                            this.M1.setOnClickListener(new a(next, i18));
                                                            org.telegram.ui.Cells.z2 z2Var4 = this.M1;
                                                            CharSequence charSequence = charSequenceArr[0];
                                                            if (charSequence instanceof String) {
                                                                str = null;
                                                                charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.j6.I6, 2, null);
                                                            } else {
                                                                str = null;
                                                            }
                                                            CharSequence charSequence2 = charSequenceArr[1];
                                                            if (charSequence2 instanceof String) {
                                                                charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                            }
                                                            z2Var4.b(charSequence, charSequence2);
                                                            if (zArr[0] && next != null) {
                                                                this.M1.setOnCloseListener(new ow(2, this, next));
                                                            }
                                                            z13 = true;
                                                            qxVar = this.F3;
                                                            le.b bVar2 = this.b;
                                                            if (qxVar != null) {
                                                                z13 = false;
                                                                this.J1.i(this.M1, z13, true);
                                                                q3(true);
                                                                if (this.fragmentView != null) {
                                                                }
                                                                z14 = false;
                                                                if (this.fragmentView == null) {
                                                                    return;
                                                                } else {
                                                                    return;
                                                                }
                                                            }
                                                            z13 = false;
                                                            this.J1.i(this.M1, z13, true);
                                                            q3(true);
                                                            if (this.fragmentView != null) {
                                                            }
                                                            z14 = false;
                                                            if (this.fragmentView == null) {
                                                            }
                                                        }
                                                    }
                                                    str = null;
                                                }
                                            }
                                        }
                                        z11 = false;
                                        int i182 = 21;
                                        if (!z11) {
                                        }
                                    }
                                }
                            } else {
                                BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                ArrayList<TLRPC.User> arrayList4 = state.today;
                                this.M1.setOnClickListener(new ow(i11, this, state));
                                this.M1.a(this.currentAccount, arrayList4);
                                this.M1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList4.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList4.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList4.size(), new Object[0]), org.telegram.ui.ActionBar.j6.I6, 2, null), this.M1.c, new kw(this, i12)), LocaleController.formatString(arrayList4.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.M1.setOnCloseListener(new xv(this, 14));
                                xh.v5.y(this.currentAccount, false).V();
                            }
                            z13 = true;
                            str = null;
                            qxVar = this.F3;
                            le.b bVar22 = this.b;
                            if (qxVar != null) {
                            }
                            z13 = false;
                            this.J1.i(this.M1, z13, true);
                            q3(true);
                            if (this.fragmentView != null) {
                            }
                            z14 = false;
                            if (this.fragmentView == null) {
                            }
                        } else if (!y3.A) {
                            y3.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new xh.v4(y3, i10));
                        }
                    }
                    j3 = 0;
                    if (this.V2 == 0) {
                    }
                    int i172 = 15;
                    if (this.V2 != 0) {
                    }
                    if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                    z13 = true;
                    str = null;
                    qxVar = this.F3;
                    le.b bVar222 = this.b;
                    if (qxVar != null) {
                    }
                    z13 = false;
                    this.J1.i(this.M1, z13, true);
                    q3(true);
                    if (this.fragmentView != null) {
                    }
                    z14 = false;
                    if (this.fragmentView == null) {
                    }
                }
            }
            str = null;
            z13 = true;
            qxVar = this.F3;
            le.b bVar2222 = this.b;
            if (qxVar != null) {
            }
            z13 = false;
            this.J1.i(this.M1, z13, true);
            q3(true);
            if (this.fragmentView != null) {
            }
            z14 = false;
            if (this.fragmentView == null) {
            }
        }
        z13 = false;
        qxVar = this.F3;
        le.b bVar22222 = this.b;
        if (qxVar != null) {
        }
        z13 = false;
        this.J1.i(this.M1, z13, true);
        q3(true);
        if (this.fragmentView != null) {
        }
        z14 = false;
        if (this.fragmentView == null) {
        }
    }

    public final float V3() {
        qx qxVar = this.F3;
        if (qxVar == null || !qxVar.c()) {
            return 0.0f;
        }
        return this.F3.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        int i10;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        boolean z12;
        boolean z13;
        if (this.z0 == null || this.inPreviewMode || this.p3) {
            return;
        }
        qx qxVar = this.F3;
        if (qxVar != null && qxVar.c()) {
            return;
        }
        org.telegram.ui.Components.w70 w70Var = this.L0;
        if (w70Var != null) {
            w70Var.u();
            this.L0 = null;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int size = dialogFilters.size();
        le.b bVar = this.r;
        boolean z14 = true;
        if (size > 1) {
            if (z10 || this.z0.getVisibility() != 0) {
                boolean z15 = this.z0.getVisibility() != 0 ? false : z11;
                this.w = true;
                boolean isEmpty = this.z0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z16 = (this.isPaused || this.R3 != null) ? false : z11;
                    if (!this.p3) {
                        bVar.a(this.w, z16);
                    }
                }
                int currentTabId = this.z0.getCurrentTabId();
                int currentTabStableId = this.z0.getCurrentTabStableId();
                if (currentTabId == this.z0.getDefaultTabId() || currentTabId < dialogFilters.size()) {
                    z12 = false;
                } else {
                    this.z0.L = -1;
                    z12 = true;
                }
                uw uwVar = this.z0;
                uwVar.h.clear();
                uwVar.j0.clear();
                uwVar.l0.clear();
                uwVar.m0.clear();
                uwVar.n0.clear();
                uwVar.o0.clear();
                uwVar.M = 0;
                int size2 = dialogFilters.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (dialogFilters.get(i12).isDefault()) {
                        this.z0.a(i12, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i12).locked);
                    } else {
                        MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i12);
                        this.z0.a(i12, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i12).locked);
                    }
                }
                if (currentTabStableId >= 0) {
                    if (z12 && !this.z0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            uw uwVar2 = this.z0;
                            if (uwVar2.h(uwVar2.k0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = 0;
                        }
                    }
                    if (this.z0.k0.get(this.e0[0].h, -1) != currentTabStableId) {
                        this.e0[0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i13 = 0;
                while (true) {
                    vy[] vyVarArr = this.e0;
                    if (i13 >= vyVarArr.length) {
                        break;
                    }
                    if (vyVarArr[i13].h >= dialogFilters.size()) {
                        this.e0[i13].h = dialogFilters.size() - 1;
                    }
                    this.e0[i13].a.setScrollingTouchSlop(1);
                    i13++;
                }
                uw uwVar3 = this.z0;
                uwVar3.F.setItemAnimator(z15 ? uwVar3.s0 : null);
                uwVar3.I.l();
                if (isEmpty) {
                    R4(false);
                }
                uw uwVar4 = this.z0;
                int currentTabId2 = uwVar4.getCurrentTabId();
                ArrayList arrayList = uwVar4.h;
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        z13 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.n00) arrayList.get(i14)).a == currentTabId2) {
                            z13 = ((org.telegram.ui.Components.n00) arrayList.get(i14)).f;
                            break;
                        }
                        i14++;
                    }
                }
                if (z13) {
                    uw uwVar5 = this.z0;
                    ArrayList arrayList2 = uwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        uwVar5.f((org.telegram.ui.Components.n00) arrayList2.get(0), 0);
                        T4(r52);
                        i10 = this.e0[r52].s;
                        if ((i10 != 7 || i10 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i10 - 7]) != null) {
                            i11 = 0;
                            while (true) {
                                if (i11 >= dialogFilters.size()) {
                                    z14 = false;
                                    break;
                                }
                                MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i11);
                                if (dialogFilter3 != null && dialogFilter3.id == dialogFilter.id) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            if (z14) {
                                return;
                            }
                            R4(false);
                            return;
                        }
                        return;
                    }
                }
            }
            r52 = 0;
            T4(r52);
            i10 = this.e0[r52].s;
            if (i10 != 7) {
            }
            i11 = 0;
            while (true) {
                if (i11 >= dialogFilters.size()) {
                }
                i11++;
            }
            if (z14) {
            }
        } else {
            r52 = 0;
            if (this.z0.getVisibility() != 8) {
                this.z0.setIsEditing(false);
                I4(false);
                this.m3 = false;
                if (this.l3) {
                    this.l3 = false;
                    this.e0[0].setTranslationX(0.0f);
                    this.e0[1].setTranslationX(r2[0].getMeasuredWidth());
                }
                if (this.e0[0].h != this.z0.getDefaultTabId()) {
                    this.e0[0].h = this.z0.getDefaultTabId();
                    dx dxVar = this.e0[0].d;
                    dxVar.h = 0;
                    dxVar.l();
                    vy vyVar = this.e0[0];
                    vyVar.s = this.R0;
                    vyVar.d.l();
                }
                this.e0[1].setVisibility(8);
                vy vyVar2 = this.e0[1];
                vyVar2.h = 0;
                dx dxVar2 = vyVar2.d;
                dxVar2.h = 0;
                dxVar2.l();
                vy vyVar3 = this.e0[1];
                vyVar3.s = this.R0;
                vyVar3.d.l();
                this.w = false;
                if (this.fragmentView != null) {
                    boolean z17 = (this.isPaused || this.R3 != null) ? false : z11;
                    if (!this.p3) {
                        bVar.a(false, z17);
                    }
                }
                int i15 = 0;
                while (true) {
                    vy[] vyVarArr2 = this.e0;
                    if (i15 >= vyVarArr2.length) {
                        break;
                    }
                    vy vyVar4 = vyVarArr2[i15];
                    if (vyVar4.s == 0 && vyVar4.v == 2 && Z3() && ((L0 = this.e0[i15].c.L0()) == 0 || L0 == 1)) {
                        this.e0[i15].c.h1(1, (int) this.N);
                    }
                    this.e0[i15].a.setScrollingTouchSlop(0);
                    this.e0[i15].a.requestLayout();
                    this.e0[i15].requestLayout();
                    i15++;
                }
                this.z0.L = -1;
                r52 = 0;
            }
            T4(r52);
            i10 = this.e0[r52].s;
            if (i10 != 7) {
            }
            i11 = 0;
            while (true) {
                if (i11 >= dialogFilters.size()) {
                }
                i11++;
            }
            if (z14) {
            }
        }
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.b.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W4(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        gy gyVar;
        boolean z13;
        org.telegram.ui.Components.u81 u81Var;
        if (!this.p3 || this.l2 || (gyVar = this.C0) == null) {
            return;
        }
        ArrayList<fg.q0> currentSearchFilters = gyVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i10 = 0; i10 < currentSearchFilters.size(); i10++) {
            if (currentSearchFilters.get(i10).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i10).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i10).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i10).d == 7) {
                z14 = true;
            }
        }
        if (z14) {
            z11 = false;
        }
        boolean z18 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z11;
        if ((z15 || z18 || !z10) && z18) {
            if (arrayList == null || arrayList.isEmpty() || z16) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z17) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z11) {
                this.b0.z1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.b0.z1(null, null, false);
                }
                if (!z12) {
                    this.b0.getAdapter().l();
                }
                u81Var = this.a0;
                if (u81Var != null) {
                    u81Var.b(z13, true);
                }
                this.b0.setEnabled(z13);
                this.s.a(z13, true);
            }
        }
        z13 = false;
        if (!z13) {
        }
        if (!z12) {
        }
        u81Var = this.a0;
        if (u81Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    public final zh.i5 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f7 = (((-this.g4) - this.j4) - this.u1) - this.v1;
        org.telegram.ui.Components.h20 h20Var = this.t0;
        if (h20Var != null) {
            h20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.u0;
        if (h20Var2 != null) {
            h20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            bi.x4 x4Var = this.p0;
            if (x4Var != null) {
                x4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            py pyVar = (py) this.fragmentView;
            pyVar.removeView(undoViewArr[0]);
            pyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.U3;
        org.telegram.ui.Components.h20 h20Var = this.t0;
        if (h20Var != null) {
            h20Var.e(z12, z10);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.u0;
        if (h20Var2 != null) {
            h20Var2.e(z12, z10);
        }
    }

    public final boolean Z3() {
        return !this.l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void Z4(boolean z10, boolean z11) {
        boolean z12;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.m0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= getDownloadController().downloadingFiles.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i10).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (getDownloadController().hasUnviewedDownloads() || z12 || (this.g0.getVisibility() == 0 && this.g0.getAlpha() == 1.0f && !z11)) {
                    this.i0 = true;
                } else {
                    this.i0 = false;
                }
                x3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.d2;
                boolean z14 = i11 == 3 || i11 == 5;
                this.o0.setSubtext(LocaleController.getString(z13 ? z14 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.n0.b(z13, z14, z10);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.D2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void a5() {
        org.telegram.ui.Components.xq0 xq0Var;
        gx gxVar = this.B1;
        ArrayList arrayList = this.I2;
        if (gxVar == null) {
            if (this.R0 == 10) {
                c4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        b5();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.R0 == 3 && this.f2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.wr.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.n0(false, false, false);
                this.B1.P();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!a4() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.W3 && (xq0Var = this.G2) != null) {
                    this.W3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    xq0Var.j();
                    xq0Var.F = string2;
                    org.telegram.ui.Components.vq0 vq0Var = xq0Var.a[0];
                    if (string2 != null) {
                        vq0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(xq0Var, 29);
                    xq0Var.G = kc0Var;
                    AndroidUtilities.runOnUIThread(kc0Var, 1000L);
                }
            }
            this.C1.g(Math.max(1, arrayList.size()), true);
            int i10 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            long j3 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long longValue = ((Long) obj).longValue();
                long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                if (sendPaidMessagesStars <= 0 && longValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                }
                j3 += sendPaidMessagesStars;
            }
            this.C1.i(i10, j3, true);
            this.B1.R1();
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.wr.h);
            }
        }
        this.Q3 = arrayList.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b4(boolean z10) {
        boolean z11;
        this.actionBar.r();
        this.I2.clear();
        org.telegram.ui.ActionBar.i2 i2Var = this.e1;
        int i10 = 1;
        if (i2Var != null) {
            i2Var.c(0.0f, true);
        }
        uw uwVar = this.z0;
        if (uwVar != null) {
            uwVar.b(org.telegram.ui.ActionBar.j6.K8, org.telegram.ui.ActionBar.j6.I8, org.telegram.ui.ActionBar.j6.J8, org.telegram.ui.ActionBar.j6.L8, org.telegram.ui.ActionBar.j6.d6);
        }
        ValueAnimator valueAnimator = this.u3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.u3 = null;
        }
        if (this.t3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            vy[] vyVarArr = this.e0;
            if (i12 >= vyVarArr.length) {
                break;
            }
            vy vyVar = vyVarArr[i12];
            if (vyVar != null) {
                vyVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, 0.0f);
        this.u3 = ofFloat;
        ofFloat.addUpdateListener(new zv(this, max, i10));
        this.u3.addListener(new zx(this, max, i11));
        this.u3.setInterpolator(org.telegram.ui.Components.wr.f);
        this.u3.setDuration(200L);
        this.u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i13++;
                arrayList = arrayList;
                size = size;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.Z0) {
            getMessagesController().reorderPinnedDialogs(this.V2, null, 0L);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        T4(true);
        if (this.e0 != null) {
            int i14 = 0;
            while (true) {
                vy[] vyVarArr2 = this.e0;
                if (i14 >= vyVarArr2.length) {
                    break;
                }
                vyVarArr2[i14].d.H = z11;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i16 = z11;
        if (z10) {
            i16 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i16 | i15, true);
    }

    public final void b5() {
        org.telegram.ui.Components.xq0 xq0Var = this.G2;
        if (xq0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        xq0Var.h(i10);
        xq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = xq0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.vq0 vq0Var = xq0Var.a[0];
        if (xq0Var.b == 1) {
            vq0Var.d.l(xq0Var.c(vq0Var), false);
        }
    }

    public final void c4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (z10 && this.b2) {
            return;
        }
        this.U3 = z10;
        Y4(true);
        if (z10) {
            bi.x4 x4Var = this.p0;
            if (x4Var != null) {
                x4Var.e(true);
            }
            bi.x4 x4Var2 = this.q0;
            if (x4Var2 != null) {
                x4Var2.e(true);
            }
        }
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.l0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z11 = false;
                break;
            }
            MessageObject messageObject = arrayList.get(i10);
            i10++;
            MessageObject messageObject2 = messageObject;
            if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject4 = messageObject3;
            if (messageObject4.getDocument() != null && messageObject4.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        uw uwVar;
        if (this.F3.c()) {
            return false;
        }
        return this.R0 != 3 || (uwVar = this.z0) == null || uwVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean closeLastFragment() {
        if (!this.F3.c()) {
            return super.closeLastFragment();
        }
        this.F3.a();
        gy gyVar = this.C0;
        if (gyVar == null) {
            return true;
        }
        gyVar.R();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.Components.y7 y7Var = new org.telegram.ui.Components.y7(this, context, this.resourceProvider, 3);
        y7Var.setAllowOverlayTitle(true);
        y7Var.L();
        y7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.t8), false);
        y7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.z8), true);
        y7Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.v8), false);
        y7Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.y8), true);
        y7Var.k();
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || e4())) {
            return y7Var;
        }
        y7Var.setOccupyStatusBar(false);
        return y7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e0b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e65  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0cd5  */
    /* JADX WARN: Type inference failed for: r0v101, types: [org.telegram.ui.ActionBar.l] */
    /* JADX WARN: Type inference failed for: r0v181, types: [org.telegram.ui.Components.vl0, org.telegram.ui.sy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [gh.g] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v19, types: [bi.t2, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v205, types: [org.telegram.ui.Components.vl0, org.telegram.ui.sy] */
    /* JADX WARN: Type inference failed for: r3v206, types: [org.telegram.ui.Components.vl0, org.telegram.ui.sy] */
    /* JADX WARN: Type inference failed for: r3v207, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.sy] */
    /* JADX WARN: Type inference failed for: r3v211, types: [org.telegram.ui.Components.vl0, org.telegram.ui.sy] */
    /* JADX WARN: Type inference failed for: r3v212, types: [org.telegram.ui.Components.vl0, org.telegram.ui.sy] */
    /* JADX WARN: Type inference failed for: r3v214, types: [org.telegram.ui.zw, s4.c0] */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.telegram.ui.ActionBar.l] */
    /* JADX WARN: Type inference failed for: r3v321, types: [android.view.ViewGroup, org.telegram.ui.ActionBar.w0] */
    /* JADX WARN: Type inference failed for: r3v60, types: [zg.a] */
    /* JADX WARN: Type inference failed for: r4v69, types: [org.telegram.ui.Components.vl0, org.telegram.ui.sy] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.ui.lw] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v23, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f7;
        int i10;
        eo eoVar;
        uw uwVar;
        my myVar;
        my myVar2;
        org.telegram.ui.Components.qs qsVar;
        uy uyVar;
        s4.y yVar;
        fg.m mVar;
        fg.m mVar2;
        long j3;
        fg.m mVar3;
        fg.m mVar4;
        fg.m mVar5;
        fg.m mVar6;
        qy qyVar;
        int i11;
        int i12;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        Context context2 = context;
        ?? r11 = 0;
        this.j2 = false;
        this.k2 = false;
        this.V = false;
        this.V0 = null;
        this.z0 = null;
        ArrayList arrayList = this.I2;
        arrayList.clear();
        this.k3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        AndroidUtilities.runOnUIThread(new qv(context2, 0));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        this.j0 = a2;
        a2.setOnClickListener(new xv(this, 1));
        int i13 = 8;
        if (this.R0 == 2 || (e4() && R3(this.currentAccount, this.R0, this.V2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        ?? r82 = 1;
        if (!this.l2 && this.n2 == null && this.V2 == 0 && this.X2 == 0) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context2, getThemedColor(org.telegram.ui.ActionBar.j6.t8), getThemedColor(org.telegram.ui.ActionBar.j6.v8), true);
            this.m0 = w0Var;
            w0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.m0, w7.a6.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new xv(this, 8));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.pi0(context2);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(context2, this.resourceProvider, false, true);
            this.o0 = g1Var;
            g1Var.setItemHeight(56);
            this.o0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.n0);
            this.o0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            ?? d = n10.d(3, new ColorDrawable(0));
            this.g0 = d;
            yy yyVar = new yy(context2, this.currentAccount);
            this.h0 = yyVar;
            d.addView(yyVar);
            this.g0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.g0.setVisibility(8);
            Z4(false, false);
        }
        my myVar3 = new my(context2, this.resourceProvider);
        this.X = myVar3;
        long j10 = 0;
        myVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.w0 a11 = n10.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.l0.setOnClickListener(new xv(this, 9));
            this.X.a(this.l0);
            this.X.e();
        }
        this.X.setCloseButtonOnClickListener(new rv(this, 29));
        this.X.r.setOnFocusChangeListener(new qd(this, 1));
        ?? r32 = this.X.r;
        xf.h0 h0Var = new xf.h0(r32, new ny(this));
        this.Y = h0Var;
        r32.addTextChangedListener(h0Var);
        this.X.setSearchFiltersListener(new cy(this, 5));
        this.Y.a();
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.w0 a12 = n10.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.k0.setOnClickListener(new xv(this, 10));
            this.k0.setOnLongClickListener(new fw(this, 3));
        }
        this.j0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.j0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i14 = this.R0;
            if (i14 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.N0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.O0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i14 == 3 && this.f2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i14 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i14 == 14) {
                boolean z10 = this.A2;
                if (!z10 || this.z2 || this.v2 || this.y2) {
                    boolean z11 = this.z2;
                    if (!z11 || z10 || this.v2 || this.y2) {
                        boolean z12 = this.v2;
                        if (z12 && !z11 && !z10 && !this.y2) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                        } else if (!this.y2 || z11 || z10 || z12) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                        } else {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                        }
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    }
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.G;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                }
            }
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        } else {
            if (this.n2 != null || this.V2 != 0 || this.X2 != 0) {
                ?? r33 = this.actionBar;
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
                this.e1 = i2Var;
                r33.setBackButtonDrawable(i2Var);
            }
            if (this.V2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.X2 != 0) {
                this.actionBar.setTitle(DialogObject.getName(this.Y2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.b3 = new org.telegram.ui.Components.g9(this.Y2);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
                this.a3 = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.a3.e(this.Y2, this.b3);
                this.actionBar.addView(this.a3, w7.a6.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(26.0f), null);
                this.D3 = n5Var;
                n5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.C3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.C3.getIntrinsicWidth(), this.C3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.C3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.gl), PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.C3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.I(spannableStringBuilder, this.D3);
                d5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.V2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new kw(this, 0));
        int i15 = this.R0;
        if (((i15 == 0 && !this.l2) || i15 == 3) && this.V2 == 0 && this.X2 == 0 && TextUtils.isEmpty(this.n2)) {
            uw uwVar2 = new uw(this, context2, this.resourceProvider);
            this.z0 = uwVar2;
            uwVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.z0.setDelegate(new vw(context2, this));
        }
        int i16 = 17;
        if (this.r2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.D1 = n10.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9();
            g9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context2);
            w9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.D1.addView(w9Var2, w7.a6.e(36, 36, 17));
            this.D1.setOnClickListener(new xv(this, 11));
            this.D1.setOnLongClickListener(new fw(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            g9Var.m(this.currentAccount, currentUser);
            w9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            w9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? g9Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ww(this));
        final py pyVar = new py(context2, this);
        this.fragmentView = pyVar;
        gh.k kVar = new gh.k(pyVar);
        this.k4 = kVar;
        zg.a aVar = this.p4;
        aVar.f(kVar, pyVar);
        gh.k kVar2 = this.k4;
        zg.a aVar2 = this.r4;
        aVar2.f(kVar2, pyVar);
        gh.k kVar3 = this.k4;
        zg.a aVar3 = this.s4;
        aVar3.f(kVar3, pyVar);
        this.q4.f(this.k4, pyVar);
        final PointF pointF = new PointF();
        this.t4 = new ah.a() { // from class: org.telegram.ui.lw
            @Override // ah.a
            public final void e(Canvas canvas, RectF rectF) {
                wy wyVar = wy.this;
                gy gyVar = wyVar.C0;
                int alpha = gyVar != null ? (int) (gyVar.getAlpha() * 255.0f) : 0;
                vy[] vyVarArr = wyVar.e0;
                int length = vyVarArr.length;
                int i17 = 0;
                while (true) {
                    py pyVar2 = pyVar;
                    if (i17 >= length) {
                        gy gyVar2 = wyVar.C0;
                        if (gyVar2 == null || gyVar2.getVisibility() != 0 || wyVar.C0.getAlpha() <= 0.0f) {
                            return;
                        }
                        gy gyVar3 = wyVar.C0;
                        fh.d.a(gyVar3, canvas, rectF, gyVar3, pyVar2, alpha);
                        return;
                    }
                    vy vyVar = vyVarArr[i17];
                    if (vyVar != null && vyVar.getVisibility() == 0 && vyVar.getAlpha() > 0.0f) {
                        float V3 = wyVar.V3();
                        if (vyVar.F == null || V3 <= 0.0f) {
                            sy syVar = vyVar.a;
                            fh.d.a(syVar, canvas, rectF, syVar, pyVar2, 255 - alpha);
                        } else {
                            sy syVar2 = vyVar.a;
                            PointF pointF2 = pointF;
                            if (!gh.k.b(syVar2, pyVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            vyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i17++;
                }
            }

            @Override // ah.a
            public final void g(g.z zVar, RectF rectF) {
                zVar.b = true;
            }
        };
        int i17 = (this.V2 == 0 && this.X2 == 0 && (((i12 = this.R0) == 0 && !this.l2) || i12 == 3)) ? 2 : 1;
        this.e0 = new vy[i17];
        int i18 = 0;
        while (i18 < i17) {
            zg.a aVar4 = aVar3;
            vy vyVar = new vy(context2, this);
            pyVar.addView(vyVar, w7.a6.c(-1.0f, -1));
            vyVar.s = this.R0;
            this.e0[i18] = vyVar;
            vyVar.w = new org.telegram.ui.Components.a10(context2);
            vyVar.w.setViewType(7);
            vyVar.w.setVisibility(i13);
            vyVar.addView(vyVar.w, w7.a6.e(-2, -2, i16));
            sy syVar = new sy(this, context2, vyVar);
            vyVar.a = syVar;
            syVar.C0(new uv(3, this, vyVar));
            ?? r42 = vyVar.a;
            vyVar.b = new a5.a((org.telegram.ui.Components.vl0) r42);
            r42.setAllowStopHeaveOperations(r82);
            vyVar.a.setAccessibilityEnabled(r11);
            vyVar.a.l1(r11, r82);
            vyVar.a.setClipToPadding(r11);
            vyVar.a.setPivotY(0.0f);
            if (this.R0 == 15) {
                vyVar.a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
            }
            vyVar.x = new xw(vyVar.a, vyVar);
            vyVar.a.setVerticalScrollBarEnabled(r82);
            vyVar.a.setInstantClick(r82);
            vyVar.c = new zw(this, vyVar);
            vyVar.c.j1(r82);
            vyVar.a.setLayoutManager(vyVar.c);
            vyVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            vyVar.addView(vyVar.a, w7.a6.c(-1.0f, -1));
            vyVar.a.setOnItemClickListener(new org.telegram.ui.Components.km(22, this, vyVar));
            vyVar.a.setOnItemLongClickListener(new og.u0(this, vyVar, false, 6));
            vyVar.f = new uy(this, vyVar);
            vyVar.y = new org.telegram.ui.Components.zk0(vyVar.a, r11);
            uyVar = vyVar.f;
            vyVar.e = new s4.y(uyVar);
            yVar = vyVar.e;
            yVar.d(vyVar.a);
            vyVar.a.setOnScrollListener(new bx(this, vyVar, pyVar));
            vyVar.v = SharedConfig.archiveHidden ? 2 : 0;
            if (vyVar.n == null && this.V2 == 0 && this.X2 == j10) {
                vyVar.n = new cx(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), vyVar);
                if (Z3()) {
                    vyVar.n.h();
                } else {
                    vyVar.n.b();
                }
                cx cxVar = vyVar.n;
                i11 = vyVar.v;
                cxVar.g(i11 != 0);
            }
            py pyVar2 = pyVar;
            zg.a aVar5 = aVar;
            zg.a aVar6 = aVar2;
            context2 = context;
            vyVar.d = new dx(this, this, context, vyVar.s, this.V2, this.l2, arrayList, this.currentAccount, this.G, vyVar);
            mVar = vyVar.d;
            mVar.R(vyVar.a);
            mVar2 = vyVar.d;
            mVar2.P(this.t2);
            if (vyVar.s == 3) {
                mVar6 = vyVar.d;
                mVar6.M(getMessagesController().storiesEnabled() && (qyVar = this.C2) != null && qyVar.A());
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.p2;
                j3 = 0;
                if (topicKey.dialogId != 0) {
                    mVar5 = vyVar.d;
                    mVar5.Q(topicKey.dialogId);
                }
            } else {
                j3 = 0;
            }
            mVar3 = vyVar.d;
            mVar3.N(vyVar.n);
            sy syVar2 = vyVar.a;
            mVar4 = vyVar.d;
            syVar2.setAdapter(mVar4);
            vyVar.a.setEmptyView((this.V2 == 0 && this.X2 == j3) ? vyVar.w : null);
            vyVar.r = new org.telegram.ui.Components.yk0(vyVar.a, vyVar.c);
            org.telegram.ui.Components.yk0 yk0Var = vyVar.r;
            yk0Var.c = true;
            yk0Var.d = true;
            yk0Var.h = new yv(this, 10);
            if (i18 != 0) {
                this.e0[i18].setVisibility(8);
            }
            i18++;
            j10 = j3;
            pyVar = pyVar2;
            aVar3 = aVar4;
            aVar = aVar5;
            aVar2 = aVar6;
            r82 = 1;
            r11 = 0;
            i16 = 17;
            i13 = 8;
        }
        py pyVar3 = pyVar;
        zg.a aVar7 = aVar;
        zg.a aVar8 = aVar2;
        zg.a aVar9 = aVar3;
        long j11 = j10;
        org.telegram.ui.Components.ps psVar = new org.telegram.ui.Components.ps(context2);
        this.K1 = psVar;
        int i19 = org.telegram.ui.ActionBar.j6.d6;
        psVar.setColor(org.telegram.ui.ActionBar.j6.u0(i19));
        pyVar3.addView(this.K1, w7.a6.e(-1, 100, 48));
        this.B0 = pyVar3.getChildCount();
        y41 y41Var = new y41((Activity) getContext());
        this.Z = y41Var;
        y41Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        pyVar3.addView(this.Z, w7.a6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        bh.d b10 = aVar8.b(this.Z, dh.c.n(this.resourceProvider));
        b10.p(AndroidUtilities.dp(18.0f));
        b10.o(AndroidUtilities.dp(6.666f));
        this.Z.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.Z.setBlurredBackground(b10);
        fg.s0 s0Var = new fg.s0(getParentActivity(), null);
        this.b0 = s0Var;
        s0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        fg.s0 s0Var2 = this.b0;
        s0Var2.a3 = false;
        s0Var2.setOnItemClickListener(new cw(this, 1));
        this.Z.addView(this.b0, w7.a6.e(-1, -1, 48));
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context2, this.resourceProvider, true);
        this.u0 = h20Var;
        h20Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new xv(this, 27));
        pyVar3.addView(this.u0, org.telegram.ui.Components.h20.c());
        org.telegram.ui.Components.h20 h20Var2 = new org.telegram.ui.Components.h20(context2, this.resourceProvider);
        this.t0 = h20Var2;
        pyVar3.addView(h20Var2, org.telegram.ui.Components.h20.b());
        this.t0.setOnClickListener(new xv(this, 28));
        if (!e4() && this.R0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", true)) {
            bi.x4 x4Var = new bi.x4(context2, 2);
            x4Var.q(8.0f);
            x4Var.d = 8000L;
            x4Var.i();
            x4Var.n();
            x4Var.p(true);
            x4Var.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), bi.ce.n(context2)));
            x4Var.l(1.0f, -40.0f);
            x4Var.h(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            x4Var.l0 = new kw(this, 11);
            this.p0 = x4Var;
            pyVar3.addView(x4Var, w7.a6.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        e5();
        this.a0 = null;
        if (this.l2 || this.R0 != 0) {
            f7 = 72.0f;
            if (this.R0 == 3 || I3()) {
                gh.g gVar = new gh.g(context2);
                this.y1 = gVar;
                gVar.setClipChildren(false);
                ?? r02 = this.y1;
                oh.i iVar = this.v;
                r02.setWindowInsetsProvider(iVar);
                gh.g gVar2 = this.y1;
                gVar2.setInputIslandBubbleDrawable(aVar8.b(gVar2, dh.c.n(this.resourceProvider)));
                gh.g gVar3 = this.y1;
                gVar3.setUnderKeyboardBackgroundDrawable(aVar7.b(gVar3, dh.c.n(this.resourceProvider)));
                zg.b bVar = new zg.b(aVar9.b(this.y1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    bVar.b(AndroidUtilities.dp(72.0f), true);
                }
                this.y1.setBackgroundWithFadeDrawable(bVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                gx gxVar = this.B1;
                if (gxVar != null) {
                    gxVar.B0();
                }
                gx gxVar2 = new gx(this, getParentActivity(), pyVar3);
                this.B1 = gxVar2;
                gxVar2.setInAppInsetsController(iVar);
                this.B1.x4 = false;
                pyVar3.setClipChildren(false);
                pyVar3.setClipToPadding(false);
                gx gxVar3 = this.B1;
                gxVar3.w4 = false;
                gxVar3.h2 = !AndroidUtilities.isInMultiwindow && ((eoVar = gxVar3.O2) == null || !eoVar.isInBubbleMode());
                this.B1.U0(false, false);
                this.B1.g1(true, false);
                this.B1.y1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, w7.a6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                pyVar3.addView(this.y1.getFadeView(), w7.a6.c(-1.0f, -1));
                pyVar3.addView(this.y1, w7.a6.c(-1.0f, -1));
                if (a4() || this.E2 != null || this.F2 != null) {
                    l3(this.V3);
                    this.V3 = null;
                }
                this.B1.setDelegate(new hx(this));
                i10 = -1;
                hi.b2 b2Var = new hi.b2((NotificationCenter.NotificationCenterDelegate) this, context2, R.drawable.send_plane_24, this.resourceProvider, 3);
                this.C1 = b2Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                b2Var.I = dp;
                b2Var.J = dp2;
                hi.b2 b2Var2 = this.C1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                b2Var2.M = dp3;
                b2Var2.N = dp4;
                hi.b2 b2Var3 = this.C1;
                b2Var3.h0 = true;
                pyVar3.addView(b2Var3, w7.a6.e(110, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i19));
                this.C1.setOnClickListener(new xv(this, 5));
                this.C1.setOnLongClickListener(new fw(this, 1));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                uwVar = this.z0;
                if (uwVar != null) {
                    bh.d b11 = aVar8.b(uwVar, dh.c.n(this.resourceProvider));
                    b11.p(AndroidUtilities.dp(18.0f));
                    b11.o(AndroidUtilities.dp(6.666f));
                    this.z0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.z0.setBlurredBackground(b11);
                    pyVar3.addView(this.z0, w7.a6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                myVar = this.X;
                if (myVar != null) {
                    myVar.setupBlurredBackground(aVar8.b(myVar, dh.c.n(this.resourceProvider)));
                }
                nx nxVar = new nx(this, context, this, this.currentAccount, e4() ? 1 : 0);
                this.E0 = nxVar;
                nxVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                nx nxVar2 = this.E0;
                nxVar2.l0 = false;
                nxVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == 3) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j11);
                }
                pyVar3.addView(this.actionBar, w7.a6.c(-2.0f, i10));
                if (!this.l2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.E3 = oVar;
                    pyVar3.addView(oVar, w7.a6.e(20, 20, 51));
                }
                myVar2 = this.X;
                if (myVar2 != null) {
                    pyVar3.addView(myVar2, w7.a6.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = pyVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.gl));
                }
                if (this.V2 == 0 || this.X2 != j11) {
                    this.e0[0].a.setGlowColor(getThemedColor(i19));
                    this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.j6.O8), false);
                    this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.j6.N8), false);
                    this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
                    this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.j6.R8), true);
                }
                if (!this.l2 && this.R0 == 0) {
                    bi.nc ncVar = new bi.nc(this, context, 28);
                    this.K0 = ncVar;
                    if (Build.VERSION.SDK_INT >= 23) {
                        ncVar.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i19), 100)));
                    }
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new xv(this, 7));
                    this.K0.setVisibility(8);
                    pyVar3.addView(this.K0, w7.a6.c(-1.0f, i10));
                }
                this.f1.setColor(getThemedColor(i19));
                this.p3 = false;
                if (this.n2 == null) {
                    O4(true, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    O4(true, false, false, true);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    my myVar4 = this.X;
                    if (myVar4 != null) {
                        myVar4.setTranslationY(W3() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    O4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(pyVar3);
                this.F3 = new qx(this, context, pyVar3, context);
                V4(true, false);
                this.F3.setOpenProgress(0.0f);
                pyVar3.addView(this.E0, w7.a6.c(81.0f, i10));
                pyVar3.addView(this.F3, w7.a6.c(-1.0f, i10));
                this.F0 = new org.telegram.ui.Components.os(context);
                qsVar = this.J1;
                if (qsVar != null) {
                    pyVar3.addView(qsVar, w7.a6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.X2 != j11 && this.R0 != 3 && ChatObject.canAddChatToCommunity(this.Y2)) {
                    org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(uqVar, 0, 1, 33);
                    bi.d dVar = new bi.d(context, this.resourceProvider);
                    this.v0 = dVar;
                    dVar.e();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new org.telegram.ui.Components.u10(28, this, new org.telegram.ui.ActionBar.d2[1]));
                    ih.f fVar = new ih.f(getContext());
                    this.w0 = fVar;
                    fVar.setupColorKey(org.telegram.ui.ActionBar.j6.a7);
                    this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
                    this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    pyVar3.addView(this.w0, w7.a6.g());
                    pyVar3.addView(this.v0, w7.a6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
                }
                f5(false);
                Y4(false);
                F3();
                C3();
                E3();
                D3();
                B3();
                v3();
                this.X.setBlurredBackgroundVisibility(this.b.e);
                r0.i0.m(this.fragmentView, new yv(this, 7));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.qs qsVar2 = new org.telegram.ui.Components.qs(context2);
            this.J1 = qsVar2;
            qsVar2.setOnAnimatedHeightChangedListener(new rv(this, 5));
            bh.d a13 = aVar8.a(this.J1);
            a13.n(dh.c.n(this.resourceProvider));
            a13.o(AndroidUtilities.dp(7.0f));
            f7 = 72.0f;
            this.J1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            this.J1.setBlurredBackground(a13);
            this.J1.setDefaultRadiusDp(this.X2 != j11 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.G1 = frameLayout;
            this.J1.addView(frameLayout);
            this.J1.h(5, this.G1);
            this.J1.g(this.G1);
            this.J1.i(this.G1, true, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.I1 = frameLayout2;
            this.J1.addView(frameLayout2);
            this.J1.h(4, this.I1);
            this.J1.g(this.I1);
            this.J1.i(this.I1, true, false);
            fx fxVar = new fx(this, context2, this, 0);
            this.F1 = fxVar;
            this.G1.addView(fxVar);
            fx fxVar2 = new fx(this, context2, this, 1);
            this.H1 = fxVar2;
            this.I1.addView(fxVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.z2 z2Var = new org.telegram.ui.Cells.z2(context2);
            this.M1 = z2Var;
            z2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            U4();
            y6.j0(new aw(this, 0));
            y6.p0(new b5(this, 11));
            this.J1.addView(this.M1);
            if (this.X2 != j11) {
                fi.j jVar = new fi.j(context2, this.resourceProvider, true);
                this.Q1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.Q1.setUnreadMode(true);
                this.Q1.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.Q1.setOnClickListener(new xv(this, 4));
                this.J1.addView(this.Q1);
                q3(false);
            }
        }
        i10 = -1;
        uwVar = this.z0;
        if (uwVar != null) {
        }
        myVar = this.X;
        if (myVar != null) {
        }
        nx nxVar3 = new nx(this, context, this, this.currentAccount, e4() ? 1 : 0);
        this.E0 = nxVar3;
        nxVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!e4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        nx nxVar22 = this.E0;
        nxVar22.l0 = false;
        nxVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j11);
        }
        pyVar3.addView(this.actionBar, w7.a6.c(-2.0f, i10));
        if (!this.l2) {
        }
        myVar2 = this.X;
        if (myVar2 != null) {
        }
        this.x0 = pyVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.W) {
        }
        if (this.V2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i19));
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.j6.O8), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.j6.N8), false);
        this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
        this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.j6.R8), true);
        if (!this.l2) {
            bi.nc ncVar2 = new bi.nc(this, context, 28);
            this.K0 = ncVar2;
            if (Build.VERSION.SDK_INT >= 23) {
            }
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new xv(this, 7));
            this.K0.setVisibility(8);
            pyVar3.addView(this.K0, w7.a6.c(-1.0f, i10));
        }
        this.f1.setColor(getThemedColor(i19));
        this.p3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(pyVar3);
        this.F3 = new qx(this, context, pyVar3, context);
        V4(true, false);
        this.F3.setOpenProgress(0.0f);
        pyVar3.addView(this.E0, w7.a6.c(81.0f, i10));
        pyVar3.addView(this.F3, w7.a6.c(-1.0f, i10));
        this.F0 = new org.telegram.ui.Components.os(context);
        qsVar = this.J1;
        if (qsVar != null) {
        }
        if (this.X2 != j11) {
            org.telegram.ui.Components.uq uqVar2 = new org.telegram.ui.Components.uq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(uqVar2, 0, 1, 33);
            bi.d dVar2 = new bi.d(context, this.resourceProvider);
            this.v0 = dVar2;
            dVar2.e();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new org.telegram.ui.Components.u10(28, this, new org.telegram.ui.ActionBar.d2[1]));
            ih.f fVar2 = new ih.f(getContext());
            this.w0 = fVar2;
            fVar2.setupColorKey(org.telegram.ui.ActionBar.j6.a7);
            this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
            this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            pyVar3.addView(this.w0, w7.a6.g());
            pyVar3.addView(this.v0, w7.a6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        f5(false);
        Y4(false);
        F3();
        C3();
        E3();
        D3();
        B3();
        v3();
        this.X.setBlurredBackgroundVisibility(this.b.e);
        r0.i0.m(this.fragmentView, new yv(this, 7));
        return this.fragmentView;
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.n5 n5Var;
        nx nxVar = this.E0;
        org.telegram.ui.Components.n5 n5Var2 = null;
        if (nxVar != null && (n5Var = nxVar.a0) != null && nxVar.q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                n5Var.j(emojiStatusDocumentId.longValue(), z10);
                n5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(nxVar.f).isPremiumUser(user)) {
                n5Var.g(null, z10);
                n5Var.m(false, z10);
            } else {
                if (nxVar.N0 == null) {
                    nxVar.N0 = nxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    nxVar.N0 = new zh.f(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), nxVar.N0);
                }
                nxVar.N0.setColorFilter(new PorterDuffColorFilter(nxVar.f(org.telegram.ui.ActionBar.j6.zh), PorterDuff.Mode.MULTIPLY));
                n5Var.g(nxVar.N0, z10);
                n5Var.m(false, z10);
            }
            n5Var.k(Integer.valueOf(nxVar.f(org.telegram.ui.ActionBar.j6.zh)));
            nxVar.W.invalidate();
        }
        if (this.D3 == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
        this.B3 = null;
        if (emojiStatusDocumentId2 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.D3.j(emojiStatusDocumentId2.longValue(), z10);
            this.D3.m(z12, z10);
            if (z12) {
                this.B3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new xv(this, 2));
            l71.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.D3.g(null, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.L3 == null) {
                this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.L3 = new ly(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
            }
            this.L3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.zh), PorterDuff.Mode.MULTIPLY));
            this.D3.g(this.L3, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new xv(this, 3));
            l71.t(this.currentAccount);
        }
        org.telegram.ui.Components.n5 n5Var3 = this.D3;
        int i10 = org.telegram.ui.ActionBar.j6.zh;
        n5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.E3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        sx sxVar = this.M0;
        if (sxVar == null || !(sxVar.getContentView() instanceof l71)) {
            return;
        }
        org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
        l71 l71Var = (l71) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.n5 n5Var4 = this.D3;
            if (rightDrawable == n5Var4) {
                n5Var2 = n5Var4;
            }
        }
        l71Var.y(n5Var2, titleTextView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x0569, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r13, r4.H0) != false) goto L367;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        MessagesController.DialogFilter dialogFilter;
        int i13;
        long j3;
        int i14;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.ao0 ao0Var;
        org.telegram.ui.Components.ao0 ao0Var2;
        int i15;
        boolean z11;
        int i16 = 2;
        ArrayList arrayList = null;
        int i17 = 0;
        if (i10 == NotificationCenter.dialogsNeedReload) {
            if (this.e0 == null || this.S1) {
                return;
            }
            int i18 = 0;
            while (true) {
                vy[] vyVarArr = this.e0;
                if (i18 >= vyVarArr.length) {
                    break;
                }
                vy vyVar = vyVarArr[i18];
                int i19 = vyVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i19 == 7 || i19 == 8) ? getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.z3 && z12) {
                    AndroidUtilities.runOnUIThread(new zq(this, vyVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    u4(vyVar);
                }
                i18++;
            }
            uw uwVar = this.z0;
            if (uwVar != null && uwVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.z3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            g5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.X2 != chatFull.id) {
                return;
            }
            this.Z2 = chatFull;
            q3(false);
            if (this.e0 == null || this.S1) {
                return;
            }
            while (true) {
                vy[] vyVarArr2 = this.e0;
                if (i17 >= vyVarArr2.length) {
                    return;
                }
                u4(vyVarArr2[i17]);
                i17++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                uw uwVar2 = this.z0;
                if (uwVar2 == null || uwVar2.getVisibility() != 0) {
                    return;
                }
                uw uwVar3 = this.z0;
                int defaultTabId = uwVar3.getDefaultTabId();
                bi.y1 y1Var = uwVar3.F;
                ArrayList arrayList2 = uwVar3.h;
                int i20 = uwVar3.l0.get(defaultTabId, -1);
                if (i20 < 0 || i20 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) arrayList2.get(i20);
                if (n00Var.d == ((vw) uwVar3.J).a(n00Var.a) || ((vw) uwVar3.J).a(n00Var.a) < 0) {
                    return;
                }
                y1Var.e1();
                if (uwVar3.m0.get(i20) != n00Var.a(true) || uwVar3.h0) {
                    uwVar3.h0 = true;
                    uwVar3.requestLayout();
                    y1Var.setItemAnimator(uwVar3.s0);
                    org.telegram.ui.Components.m00 m00Var = uwVar3.I;
                    if (m00Var != null) {
                        m00Var.l();
                    }
                    uwVar3.M = 0;
                    org.telegram.ui.Components.n00 d = uwVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        uwVar3.M = org.telegram.messenger.a2.C(24.0f, ((org.telegram.ui.Components.n00) arrayList2.get(i21)).a(true), uwVar3.M);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.emojiLoaded) {
                if (this.e0 != null) {
                    int i22 = 0;
                    while (true) {
                        vy[] vyVarArr3 = this.e0;
                        if (i22 >= vyVarArr3.length) {
                            break;
                        }
                        sy syVar = vyVarArr3[i22].a;
                        if (syVar != null) {
                            for (int i23 = 0; i23 < syVar.getChildCount(); i23++) {
                                View childAt = syVar.getChildAt(i23);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i22++;
                    }
                }
                uw uwVar4 = this.z0;
                if (uwVar4 != null) {
                    uwVar4.getTabsContainer().e1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.closeSearchByActiveAction) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.h(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.proxySettingsChanged) {
                Z4(false, false);
                return;
            }
            long j10 = 0;
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                g5(num.intValue(), true);
                uw uwVar5 = this.z0;
                if (uwVar5 != null && uwVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.z0.c();
                }
                if (this.X2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.X2));
                    this.Y2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.a3.e(this.Y2, this.b3);
                }
                if (this.e0 != null) {
                    for (int i24 = 0; i24 < this.e0.length; i24++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.e0[i24].d.T(true);
                        }
                    }
                }
                d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i25 = NotificationCenter.appDidLogout;
            boolean[] zArr = y4;
            if (i10 == i25) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.h20 h20Var = this.t0;
                if (h20Var != null) {
                    z11 = h20Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (vy vyVar2 : this.e0) {
                    vyVar2.d.e = false;
                }
                if (z11) {
                    z4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.wr.f);
                    this.d0.addUpdateListener(new tv(this, 0));
                    this.d0.start();
                }
                int i26 = 0;
                boolean z13 = false;
                while (true) {
                    vy[] vyVarArr4 = this.e0;
                    if (i26 >= vyVarArr4.length) {
                        break;
                    }
                    if (!vyVarArr4[i26].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z13 = true;
                    } else {
                        this.e0[i26].d.l();
                    }
                    i26++;
                }
                if (z13) {
                    g5(0, true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.openedChatChanged) {
                if (this.e0 == null) {
                    return;
                }
                int i27 = 0;
                while (true) {
                    vy[] vyVarArr5 = this.e0;
                    if (i27 >= vyVarArr5.length) {
                        g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (vyVarArr5[i27].p() && AndroidUtilities.isTablet()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[0]).longValue();
                        long longValue2 = ((Long) objArr[1]).longValue();
                        MessagesStorage.TopicKey topicKey = this.p2;
                        if (!booleanValue2) {
                            topicKey.dialogId = longValue;
                            topicKey.topicId = longValue2;
                        } else if (longValue == topicKey.dialogId && longValue2 == topicKey.topicId) {
                            topicKey.dialogId = 0L;
                            topicKey.topicId = 0L;
                        }
                        this.e0[i27].d.s = topicKey.dialogId;
                    }
                    i27++;
                }
            } else {
                if (i10 == NotificationCenter.notificationsSettingsUpdated) {
                    g5(0, true);
                    return;
                }
                if (i10 == NotificationCenter.messageReceivedByAck || i10 == NotificationCenter.messageReceivedByServer || i10 == NotificationCenter.messageSendError) {
                    g5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i10 == NotificationCenter.didSetPasscode) {
                    y3();
                    return;
                }
                if (i10 == NotificationCenter.needReloadRecentDialogsSearch) {
                    gy gyVar = this.C0;
                    if (gyVar == null || (ao0Var2 = gyVar.b0) == null || (i15 = ao0Var2.h0) == 15) {
                        return;
                    }
                    int i28 = ao0Var2.s0;
                    MessagesStorage.getInstance(i28).getStorageQueue().postRunnable(new fg.n(i28, i15, new fg.x(ao0Var2), false ? 1 : 0));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    g5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    gy gyVar2 = this.C0;
                    if (gyVar2 == null || (ao0Var = gyVar2.b0) == null) {
                        return;
                    }
                    ao0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        Z4(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    Z4(true, false);
                    gy gyVar3 = this.C0;
                    if (gyVar3 != null) {
                        int currentPosition = gyVar3.getCurrentPosition();
                        org.telegram.ui.Components.go0 go0Var = gyVar3.T;
                        c5(go0Var != null && go0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.needDeleteDialog) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat2 = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z10 = false;
                    } else {
                        z10 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    Runnable hcVar = new bi.hc(this, chat2, longValue3, booleanValue, user, z10);
                    N3();
                    if (this.y0[0] == null) {
                        hcVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        hcVar.run();
                        return;
                    }
                    UndoView Y3 = Y3();
                    if (Y3 != null) {
                        Y3.j(booleanValue ? 1 : 95, longValue3, hcVar);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.folderBecomeEmpty) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int i29 = this.V2;
                    if (i29 != intValue || i29 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == NotificationCenter.dialogFiltersUpdated) {
                    V4(true, true);
                    return;
                }
                if (i10 == NotificationCenter.filterSettingsUpdated) {
                    J4();
                    return;
                }
                if (i10 == NotificationCenter.newSuggestionsAvailable) {
                    L4();
                    U4();
                    int checkEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (checkEmailSuggestion != 0) {
                        xg0 xg0Var = new xg0();
                        kw kwVar = new kw(this, 5);
                        kw kwVar2 = new kw(this, 6);
                        boolean z14 = checkEmailSuggestion == 2;
                        xg0Var.F = 3;
                        xg0Var.a = 12;
                        xg0Var.d0 = kwVar;
                        xg0Var.e0 = kwVar2;
                        xg0Var.g0 = z14;
                        xg0Var.h0 = true;
                        presentFragment(xg0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.h20 h20Var2 = this.t0;
                    if (h20Var2 != null) {
                        h20Var2.f(true, true);
                    }
                    vy[] vyVarArr6 = this.e0;
                    if (vyVarArr6 != null) {
                        for (vy vyVar3 : vyVarArr6) {
                            dx dxVar = vyVar3.d;
                            dxVar.Q = false;
                            dxVar.e = true;
                            dxVar.l();
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.messagesDeleted) {
                    if (!this.p3 || this.C0 == null) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    long longValue4 = ((Long) objArr[1]).longValue();
                    gy gyVar4 = this.C0;
                    HashMap hashMap = gyVar4.z0;
                    SparseArray sparseArray = gyVar4.h;
                    int size2 = sparseArray.size();
                    for (int i30 = 0; i30 < size2; i30++) {
                        View view = (View) sparseArray.valueAt(i30);
                        if (view instanceof z10) {
                            ((z10) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i31 = 0; i31 < gyVar4.getChildCount(); i31++) {
                        if (gyVar4.getChildAt(i31) instanceof z10) {
                            ((z10) gyVar4.getChildAt(i31)).e(longValue4, arrayList3);
                        }
                    }
                    gyVar4.M0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    int i32 = 0;
                    while (i32 < arrayList4.size()) {
                        r10 r10Var = (r10) arrayList4.get(i32);
                        MessageObject messageObject = (MessageObject) hashMap.get(r10Var);
                        if (messageObject != null) {
                            j3 = j10;
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < j3) {
                                i14 = (int) (-dialogId);
                                i13 = i32;
                            } else {
                                i13 = i32;
                            }
                            i14 = 0;
                            if (i14 == longValue4) {
                                for (int i33 = 0; i33 < arrayList3.size(); i33++) {
                                    if (messageObject.getId() == ((Integer) arrayList3.get(i33)).intValue()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(r10Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i32;
                            j3 = j10;
                        }
                        i32 = i13 + 1;
                        j10 = j3;
                    }
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i34 = 0; i34 < size3; i34++) {
                            hashMap.remove(arrayList.get(i34));
                        }
                        gyVar4.x0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.w0 w0Var = gyVar4.C0;
                        if (w0Var != null) {
                            w0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.e0 != null) {
                        int i35 = 0;
                        while (true) {
                            vy[] vyVarArr7 = this.e0;
                            if (i35 >= vyVarArr7.length) {
                                break;
                            }
                            fg.j jVar = vyVarArr7[i35].d.P;
                            if (jVar != null) {
                                jVar.a.clear();
                                jVar.b.clear();
                                jVar.c.clear();
                                jVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(jVar.e);
                            }
                            i35++;
                        }
                    }
                    nb1 nb1Var = nb1.b;
                    if (nb1Var != null) {
                        nb1Var.dismiss();
                        nb1.b = null;
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.communitySwitchedCollapsed) {
                    long longValue5 = ((Long) objArr[0]).longValue();
                    boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                    if (this.X2 != longValue5 || booleanValue3) {
                        return;
                    }
                    org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                    if (f5Var == null || f5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.X2 == ((Long) objArr[0]).longValue()) {
                        q3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            dv dvVar = this.R3;
                            if (dvVar == null || dvVar.getTag() == null) {
                                return;
                            }
                            dv dvVar2 = this.R3;
                            dvVar2.animate().setListener(null).cancel();
                            dvVar2.animate().setListener(new org.telegram.ui.Components.vv0(4, this, dvVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.R3.setTag(null);
                            return;
                        }
                        if (this.R3 == null) {
                            Context context = this.fragmentView.getContext();
                            dv dvVar3 = new dv(context);
                            LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
                            org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
                            kj0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            kj0Var.getAnimatedDrawable().K(1);
                            kj0Var.d();
                            f7.addView(kj0Var, w7.a6.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i36 = org.telegram.ui.ActionBar.j6.G6;
                            com.google.android.gms.internal.vision.e2.p(i36, null, false, textView, 1);
                            TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            g10.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            g10.setTextSize(1, 14.0f);
                            g10.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i36, false));
                            g10.setGravity(1);
                            TextView g11 = com.google.android.gms.internal.vision.e2.g(f7, g10, w7.a6.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            g11.setTextSize(1, 14.0f);
                            g11.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            g11.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i36, false));
                            g11.setGravity(1);
                            f7.addView(g11, w7.a6.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            dvVar3.addView(f7, w7.a6.e(-1, -2, 16));
                            dvVar3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                            dvVar3.setOnTouchListener(new cv());
                            this.R3 = dvVar3;
                            dvVar3.setAlpha(0.0f);
                            ((py) this.fragmentView).addView(this.R3);
                            this.R3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                        }
                        this.R3.setTag(1);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseOpened) {
                    if (getMessagesStorage().showClearDatabaseAlert) {
                        getMessagesStorage().showClearDatabaseAlert = false;
                        nb1.n(this);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.userEmojiStatusUpdated) {
                    d5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                    e5();
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    i4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i37 = 0;
                    while (true) {
                        vy[] vyVarArr8 = this.e0;
                        if (i37 >= vyVarArr8.length) {
                            return;
                        }
                        vy vyVar4 = vyVarArr8[i37];
                        if (vyVar4 != null && (((i12 = vyVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[vyVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            vyVar4.q(true);
                            return;
                        }
                        i37++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            f5(this.V);
                            g5(0, true);
                            return;
                        }
                        if (i10 == NotificationCenter.storiesEnabledUpdate) {
                            e5();
                            return;
                        }
                        if (i10 == NotificationCenter.unconfirmedAuthUpdate) {
                            U4();
                            return;
                        }
                        if (i10 == NotificationCenter.premiumPromoUpdated) {
                            U4();
                            return;
                        }
                        if (i10 == NotificationCenter.starBalanceUpdated || i10 == NotificationCenter.starSubscriptionsLoaded) {
                            U4();
                            return;
                        } else if (i10 == NotificationCenter.appConfigUpdated) {
                            U4();
                            return;
                        } else {
                            if (i10 == NotificationCenter.activeAuctionsUpdated) {
                                U4();
                                return;
                            }
                            return;
                        }
                    }
                    long longValue6 = ((Long) objArr[0]).longValue();
                    int i38 = 0;
                    while (true) {
                        vy[] vyVarArr9 = this.e0;
                        if (i38 >= vyVarArr9.length) {
                            return;
                        }
                        vy vyVar5 = vyVarArr9[i38];
                        if (vyVar5.a != null) {
                            int i39 = 0;
                            while (true) {
                                if (i39 < vyVar5.a.getChildCount()) {
                                    View childAt2 = vyVar5.a.getChildAt(i39);
                                    if (childAt2 instanceof org.telegram.ui.Cells.r2) {
                                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt2;
                                        if (longValue6 == r2Var.getDialogId()) {
                                            r2Var.t();
                                            break;
                                        }
                                    }
                                    i39++;
                                }
                            }
                        }
                        i38++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof di.n3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        return this.V2 == 1;
    }

    public final void e5() {
        bi.x4 x4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            X4();
            if (!this.O3 && storiesEnabled && (x4Var = this.p0) != null) {
                x4Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.h20 h20Var = this.t0;
        if (h20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            h20Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            h20Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public final boolean f4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return (topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id);
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        zh.i5 X3;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        qx qxVar = this.F3;
        if ((qxVar != null && qxVar.c()) || this.p3 || (lVar = this.actionBar) == null || lVar.s() || this.l2) {
            return;
        }
        bi.ce ceVar = bi.ce.F2;
        int i10 = 0;
        if ((ceVar != null && ceVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !e4() && X3().G();
        if (this.X2 != 0) {
            z11 = false;
        } else if (e4()) {
            z11 = !X3().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (X3 = X3()).g) != null && arrayList.size() > 0) || X3.H());
            z12 = X3().G();
        }
        this.L = z12;
        boolean z13 = this.G0;
        boolean z14 = z12 || z11;
        this.G0 = z14;
        if (z11 || z14) {
            this.E0.p(z10, z14 != z13);
        }
        boolean z15 = this.G0;
        int i12 = 2;
        int i13 = 8;
        if (z15 != z13) {
            if (z10) {
                ValueAnimator valueAnimator = this.J;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.G0 && !isInPreviewMode()) {
                    this.E0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, this.G0 ? 1.0f : 0.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new ej(i11, this));
                this.J.addListener(new org.telegram.ui.Components.voip.v2(this, 7));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.wr.f);
                this.J.start();
            } else {
                this.E0.setVisibility((!z15 || isInPreviewMode()) ? 8 : 0);
                this.H0 = this.G0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z11 == this.M) {
            return;
        }
        this.M = z11;
        if (z11) {
            this.E0.l(1.0f, false);
        }
        if (z10 && !isInPreviewMode()) {
            this.E0.setVisibility(0);
            float f7 = -this.N;
            float T3 = z11 ? 0.0f : T3();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new fy(this, f7, z11, T3));
            this.I.addListener(new wx(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.wr.f);
            this.I.start();
            return;
        }
        this.K = z11;
        nx nxVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        nxVar.setVisibility(i13);
        if (z11) {
            this.x3 = -AndroidUtilities.dp(81.0f);
            C4(-T3());
        } else {
            C4(0.0f);
        }
        while (true) {
            vy[] vyVarArr = this.e0;
            if (i10 >= vyVarArr.length) {
                break;
            }
            vy vyVar = vyVarArr[i10];
            if (vyVar != null) {
                vyVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.w70 w70Var = this.L0;
        if (w70Var != null) {
            w70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return dialogFilter != null ? dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g5(int i10, boolean z10) {
        RecyclerView recyclerView;
        int i11;
        int childCount;
        int i12;
        if ((this.S1 && (MessagesController.UPDATE_MASK_REORDER & i10) == 0) || this.isPaused) {
            return;
        }
        int i13 = 0;
        while (i13 < 3) {
            if (i13 == 2) {
                gy gyVar = this.C0;
                recyclerView = gyVar != null ? gyVar.V : null;
            } else {
                vy[] vyVarArr = this.e0;
                if (vyVarArr != null) {
                    sy syVar = i13 < vyVarArr.length ? vyVarArr[i13].a : null;
                    if (syVar == null || vyVarArr[i13].getVisibility() == 0) {
                        r5 = syVar != null ? this.e0[i13] : null;
                        recyclerView = syVar;
                    }
                }
                i13++;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                if (((MessagesController.UPDATE_MASK_NEW_MESSAGE & i10) != 0 || i10 == 0) && r5 != null) {
                    r5.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    while (i11 < childCount2) {
                        View childAt = recyclerView.getChildAt(i11);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.r2;
                        ArrayList arrayList = this.I2;
                        if (z11 && (this.C0 == null || recyclerView.getAdapter() != this.C0.b0)) {
                            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                r2Var.T(this.actionBar.s(), true);
                                i11 = this.S1 ? i11 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                r2Var.V(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
                            } else {
                                if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i10) == 0) {
                                    if (r2Var.b0(i10, z10)) {
                                        r5.q(false);
                                        break;
                                    }
                                } else if (this.e0[i13].p() && AndroidUtilities.isTablet()) {
                                    r2Var.setDialogSelected(r2Var.getDialogId() == this.p2.dialogId);
                                }
                                if (arrayList != null) {
                                    r2Var.V(arrayList.contains(Long.valueOf(r2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.bb)) {
                                    ((org.telegram.ui.Cells.bb) childAt).j(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                                    j6Var.u(i10);
                                    if (arrayList != null) {
                                        j6Var.s(arrayList.contains(Long.valueOf(j6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.vl0)) {
                                    org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) childAt;
                                    childCount = vl0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = vl0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                                            ((org.telegram.ui.Cells.n4) childAt2).b(i10);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.bb)) {
                        }
                        if (!this.S1) {
                            org.telegram.ui.Components.vl0 vl0Var2 = (org.telegram.ui.Components.vl0) childAt;
                            childCount = vl0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                    }
                }
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.b5 getBackButtonState() {
        return (e4() || this.F3.f) ? org.telegram.ui.ActionBar.b5.a : org.telegram.ui.ActionBar.b5.b;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.a4 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.a4 = ofFloat2;
        ofFloat2.addUpdateListener(new tv(this, 2));
        this.a4.setInterpolator(org.telegram.ui.Components.wr.g);
        this.a4.setDuration(clamp);
        this.a4.start();
        return this.a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x03a6  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        fg.m mVar;
        org.telegram.ui.Components.vl0 vl0Var;
        final int i10 = 0;
        org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6(this) { // from class: org.telegram.ui.rw
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final /* synthetic */ void a(float f7) {
                int i11 = i10;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final void b() {
                switch (i10) {
                    case 0:
                        wy.G0(this.b);
                        break;
                    default:
                        wy wyVar = this.b;
                        gy gyVar = wyVar.C0;
                        if (gyVar != null) {
                            org.telegram.ui.ActionBar.z actionMode = gyVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = wyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
                                break;
                            }
                        }
                        break;
                }
            }

            private final /* synthetic */ void c(float f7) {
            }

            private final /* synthetic */ void d(float f7) {
            }
        };
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i11));
        org.telegram.ui.Cells.r2 r2Var = this.X0;
        if (r2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(r2Var, 1, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        }
        int i12 = this.V2;
        Paint paint = this.f1;
        final int i13 = 1;
        if (i12 == 0) {
            if (this.l2) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, paint, null, null, i11));
            gy gyVar = this.C0;
            if (gyVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(gyVar.V, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.s1}, null, !this.W ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, paint, null, null, i11));
            gy gyVar2 = this.C0;
            if (gyVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(gyVar2.V, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.s1}, null, !this.W ? org.telegram.ui.ActionBar.j6.P8 : org.telegram.ui.ActionBar.j6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.R8));
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.j6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h1, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.I5));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 == null || !lVar2.s()) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0, 0, new Class[]{org.telegram.ui.Components.r00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.j6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.p00.class}, null, null, null, org.telegram.ui.ActionBar.j6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.p00.class}, null, null, null, org.telegram.ui.ActionBar.j6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0, 0, new Class[]{org.telegram.ui.Components.r00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.j6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.p00.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.p00.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.p00.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.p00.class}, null, null, null, org.telegram.ui.ActionBar.j6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.p00.class}, null, null, null, org.telegram.ui.ActionBar.j6.U9));
        }
        arrayList.addAll(w7.d6.a(new org.telegram.ui.ActionBar.k6(this) { // from class: org.telegram.ui.rw
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final /* synthetic */ void a(float f7) {
                int i112 = i13;
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final void b() {
                switch (i13) {
                    case 0:
                        wy.G0(this.b);
                        break;
                    default:
                        wy wyVar = this.b;
                        gy gyVar3 = wyVar.C0;
                        if (gyVar3 != null) {
                            org.telegram.ui.ActionBar.z actionMode = gyVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.w8));
                            }
                            org.telegram.ui.ActionBar.w0 speedItem = wyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
                                break;
                            }
                        }
                        break;
                }
            }

            private final /* synthetic */ void c(float f7) {
            }

            private final /* synthetic */ void d(float f7) {
            }
        }, org.telegram.ui.ActionBar.j6.w8, i14));
        int i15 = 0;
        while (true) {
            if (i15 >= 3) {
                break;
            }
            if (i15 == 2) {
                gy gyVar3 = this.C0;
                if (gyVar3 != null) {
                    vl0Var = gyVar3.V;
                    if (vl0Var != null) {
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i10] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr2[1] = org.telegram.ui.Cells.j6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i10] = org.telegram.ui.Cells.r2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.j6.w0;
                        int i16 = org.telegram.ui.ActionBar.j6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr3, paint2, null, null, i16));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i10] = org.telegram.ui.Cells.r2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.j6.y0;
                        int i17 = org.telegram.ui.ActionBar.j6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr4, paint3, null, null, i17));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i10] = org.telegram.ui.Cells.r2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr5, org.telegram.ui.ActionBar.j6.L0, null, null, org.telegram.ui.ActionBar.j6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr6[1] = org.telegram.ui.Cells.j6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i10] = org.telegram.ui.ActionBar.j6.a1;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.j6.a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr7[1] = org.telegram.ui.Cells.j6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i10] = org.telegram.ui.ActionBar.j6.g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.j6.h1;
                        int i18 = org.telegram.ui.ActionBar.j6.j9;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr7, null, drawableArr2, null, i18));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i10] = org.telegram.ui.Cells.r2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i10] = org.telegram.ui.ActionBar.j6.j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.j6.k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.j6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.j6.b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i10] = org.telegram.ui.Cells.r2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i10] = org.telegram.ui.ActionBar.j6.l1;
                        int i19 = org.telegram.ui.ActionBar.j6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr9, null, drawableArr4, null, i19));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i10] = org.telegram.ui.Cells.r2.class;
                        clsArr10[1] = org.telegram.ui.Cells.j6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, clsArr10, null, new Paint[]{textPaintArr[i10], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, null, org.telegram.ui.ActionBar.j6.X8));
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.j6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, null, org.telegram.ui.ActionBar.j6.Z8));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[1], null, null, org.telegram.ui.ActionBar.j6.i9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[0], null, null, org.telegram.ui.ActionBar.j6.g9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.G0, null, null, org.telegram.ui.ActionBar.j6.m9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i18));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.j6.H0, null, null, org.telegram.ui.ActionBar.j6.p9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.I0, null, null, org.telegram.ui.ActionBar.j6.q9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.J0, null, null, org.telegram.ui.ActionBar.j6.r9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.K0, null, null, i19));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.v0, null, null, org.telegram.ui.ActionBar.j6.s9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.u0, null, null, org.telegram.ui.ActionBar.j6.t9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.T0}, null, org.telegram.ui.ActionBar.j6.u9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.V0, org.telegram.ui.ActionBar.j6.W0}, null, org.telegram.ui.ActionBar.j6.v9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.X0}, null, org.telegram.ui.ActionBar.j6.w9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.x0, null, null, org.telegram.ui.ActionBar.j6.x9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Y0}, null, org.telegram.ui.ActionBar.j6.y9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.j6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i1}, null, org.telegram.ui.ActionBar.j6.A9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.j6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f1}, null, org.telegram.ui.ActionBar.j6.z9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.c1}, null, org.telegram.ui.ActionBar.j6.B9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m1}, null, i16));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n1}, null, org.telegram.ui.ActionBar.j6.Z5));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o1}, null, org.telegram.ui.ActionBar.j6.zj));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p1, org.telegram.ui.ActionBar.j6.q1, org.telegram.ui.ActionBar.j6.r1}, null, i17));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.d9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.c9));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.j6.T8));
                        int i20 = org.telegram.ui.ActionBar.j6.d6;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.j6.k7));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.j6.h6));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.j6.class}, org.telegram.ui.ActionBar.j6.Q0, null, null, org.telegram.ui.ActionBar.j6.A6));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.j6.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.p6));
                        org.telegram.ui.Cells.u3.a(arrayList, vl0Var);
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 4, new Class[]{org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
                        int i21 = org.telegram.ui.ActionBar.j6.b7;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i21));
                        int i22 = org.telegram.ui.ActionBar.j6.a7;
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i21));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 48, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.B6));
                        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.o6));
                        i15++;
                        i10 = 0;
                    }
                }
                i15++;
                i10 = 0;
            } else {
                vy[] vyVarArr = this.e0;
                if (vyVarArr != null) {
                    vl0Var = i15 < vyVarArr.length ? vyVarArr[i15].a : null;
                    if (vl0Var != null) {
                    }
                }
                i15++;
                i10 = 0;
            }
        }
        int i23 = org.telegram.ui.ActionBar.j6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.V7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.W7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.X7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Y7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Z7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.a8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.b8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.L7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.M7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.N7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.k9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.j9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.o9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Y8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.l9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.n9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.h9));
        if (this.e0 != null) {
            int i24 = 0;
            while (true) {
                vy[] vyVarArr2 = this.e0;
                if (i24 >= vyVarArr2.length) {
                    break;
                }
                if (this.V2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.l6(vyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.l6(vyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                }
                int i25 = org.telegram.ui.ActionBar.j6.m9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, 4, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"emptyTextView1"}, null, null, null, i25));
                int i26 = org.telegram.ui.ActionBar.j6.g9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, 4, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"emptyTextView2"}, null, null, null, i26));
                if (SharedConfig.archiveHidden) {
                    org.telegram.ui.Components.hj0[] hj0VarArr = {org.telegram.ui.ActionBar.j6.u1};
                    int i27 = org.telegram.ui.ActionBar.j6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, hj0VarArr, "Arrow1", i27));
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.u1}, "Arrow2", i27));
                } else {
                    org.telegram.ui.Components.hj0[] hj0VarArr2 = {org.telegram.ui.ActionBar.j6.u1};
                    int i28 = org.telegram.ui.ActionBar.j6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, hj0VarArr2, "Arrow1", i28));
                    arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.u1}, "Arrow2", i28));
                }
                org.telegram.ui.Components.hj0[] hj0VarArr3 = {org.telegram.ui.ActionBar.j6.u1};
                int i29 = org.telegram.ui.ActionBar.j6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, hj0VarArr3, "Box2", i29));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.u1}, "Box1", i29));
                org.telegram.ui.Components.hj0[] hj0VarArr4 = {org.telegram.ui.ActionBar.j6.x1};
                int i30 = org.telegram.ui.ActionBar.j6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, hj0VarArr4, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.x1}, "Line", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.y1}, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.y1}, "Line", i30));
                org.telegram.ui.Components.hj0[] hj0VarArr5 = {org.telegram.ui.ActionBar.j6.v1};
                int i31 = org.telegram.ui.ActionBar.j6.c9;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, hj0VarArr5, "Arrow", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.v1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.v1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.z1}, "Line 1", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.z1}, "Line 2", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.z1}, "Line 3", i31));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.z1}, "Cup Red", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.z1}, "Box", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.w1}, "Arrow1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.w1}, "Arrow2", org.telegram.ui.ActionBar.j6.d9));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.w1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.r2.class}, new org.telegram.ui.Components.hj0[]{org.telegram.ui.ActionBar.j6.w1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i24].a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
                int i32 = i24;
                org.telegram.ui.ActionBar.k6 k6Var2 = k6Var;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, k6Var2, org.telegram.ui.ActionBar.j6.y6));
                k6Var = k6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, k6Var2, org.telegram.ui.ActionBar.j6.il));
                int i33 = org.telegram.ui.ActionBar.j6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0[i32].w, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
                mVar = this.e0[i32].d;
                mVar.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.j6.U8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"headerTextView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"messageTextView"}, null, null, null, i26));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
                i24 = i32 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S9));
        gy gyVar4 = this.C0;
        if (gyVar4 != null) {
            org.telegram.ui.Components.ao0 ao0Var = gyVar4.b0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var != null ? ao0Var.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.w0, null, null, org.telegram.ui.ActionBar.j6.U8));
            org.telegram.ui.Components.ao0 ao0Var2 = this.C0.b0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var2 != null ? ao0Var2.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.y0, null, null, org.telegram.ui.ActionBar.j6.V8));
            org.telegram.ui.Components.ao0 ao0Var3 = this.C0.b0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var3 != null ? ao0Var3.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.L0, null, null, org.telegram.ui.ActionBar.j6.W8));
            org.telegram.ui.Components.ao0 ao0Var4 = this.C0.b0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var4 != null ? ao0Var4.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.j6.N0, null, null, org.telegram.ui.ActionBar.j6.f9));
            org.telegram.ui.Components.ao0 ao0Var5 = this.C0.b0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var5 != null ? ao0Var5.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            org.telegram.ui.Components.ao0 ao0Var6 = this.C0.b0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(ao0Var6 != null ? ao0Var6.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, null, null, null, org.telegram.ui.ActionBar.j6.T8));
        }
        int i34 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i34 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i34];
            int i35 = org.telegram.ui.ActionBar.j6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoView, 32, null, null, null, null, i35));
            int i36 = org.telegram.ui.ActionBar.j6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i36));
            int i37 = org.telegram.ui.ActionBar.j6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", i35));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", i35));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", i37));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", i37));
            i34++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.o5));
        int i38 = org.telegram.ui.ActionBar.j6.q7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ri));
        int i39 = org.telegram.ui.ActionBar.j6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xi));
        if (this.B1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.B1, 0, null, org.telegram.ui.ActionBar.j6.j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.B1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i3}, null, org.telegram.ui.ActionBar.j6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.B1, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Ud));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.B1, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Wd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.B1, TLObject.FLAG_23, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        }
        int i40 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.g8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.hh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.jk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.kk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.lk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.mk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.hk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.ik));
        fg.s0 s0Var = this.b0;
        if (s0Var != null) {
            arrayList.addAll(s0Var.getThemeDescriptions());
            this.b0.A1();
        }
        yy yyVar = this.h0;
        if (yyVar != null) {
            yyVar.a();
            this.h0.invalidate();
        }
        gy gyVar5 = this.C0;
        if (gyVar5 != null) {
            gyVar5.M(arrayList);
        }
        org.telegram.ui.Cells.z2 z2Var = this.M1;
        int i41 = 8;
        if (z2Var != null) {
            arrayList.addAll(w7.d6.a(new org.telegram.ui.Components.x6(new fj(z2Var, 19), i41), org.telegram.ui.ActionBar.j6.d6, i40, org.telegram.ui.ActionBar.j6.y6));
        }
        org.telegram.ui.Cells.ya yaVar = this.N1;
        if (yaVar != null) {
            arrayList.addAll(w7.d6.a(new org.telegram.ui.Components.x6(new fj(yaVar, 20), i41), org.telegram.ui.ActionBar.j6.d6, i40, org.telegram.ui.ActionBar.j6.y6, org.telegram.ui.ActionBar.j6.I6, i38));
        }
        org.telegram.ui.Cells.m mVar2 = this.L1;
        if (mVar2 != null) {
            arrayList.addAll(w7.d6.a(new org.telegram.ui.Components.x6(new fj(mVar2, 21), i41), org.telegram.ui.ActionBar.j6.d6, i40, org.telegram.ui.ActionBar.j6.y6, org.telegram.ui.ActionBar.j6.I6, i38));
        }
        return arrayList;
    }

    public final boolean h4() {
        return this.C2 == null && this.n2 == null;
    }

    public final boolean h5(long j3) {
        TLRPC.Chat chat;
        gx gxVar;
        if ((this.S0 <= 1 && ((gxVar = this.B1) == null || gxVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j3, View view) {
        if (this.l2 && getMessagesController().isForum(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.j6) {
                ((org.telegram.ui.Cells.j6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.j6) {
            ((org.telegram.ui.Cells.j6) view).s(true, true);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        qx qxVar;
        return (this.j2 || (qxVar = this.F3) == null || qxVar.getFragment() == null) ? i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.d6)) > 0.699999988079071d : this.F3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(fg.q0 q0Var) {
        gy gyVar;
        if (!this.p3 || (gyVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = gyVar.A0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (q0Var.b((fg.q0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(q0Var);
        my myVar = this.X;
        myVar.F.add(q0Var);
        myVar.I = r1.size() - 1;
        myVar.f();
        this.X.r.getText().clear();
        W4(true, null, null, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j4(long j3) {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j3);
        int i11 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i11 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i11);
                    i11++;
                    j4(dialog2.id);
                }
                return;
            }
            return;
        }
        int i12 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i12 == 7 || i12 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        this.y3 = 2;
        int i13 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            A4(true, true);
            o3();
            if (this.R1 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.R1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.R1.get(i14)).id == j3) {
                        i13 = i14;
                        break;
                    }
                    i14++;
                }
                if (i13 < 0) {
                    A4(false, false);
                }
                i10 = i13;
                if (!getMessagesController().isForum(j3) || getMessagesController().isMonoForumWithManageRights(j3)) {
                    getMessagesController().markAllTopicsAsRead(j3);
                }
                getMessagesController().markMentionsAsRead(j3, 0L);
                MessagesController messagesController = getMessagesController();
                int i15 = dialog.top_message;
                messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                if (i10 < 0) {
                    this.R1.remove(i10);
                    this.e0[0].x.D();
                    this.e0[0].q(true);
                    return;
                }
                return;
            }
        }
        i10 = -1;
        if (!getMessagesController().isForum(j3)) {
        }
        getMessagesController().markAllTopicsAsRead(j3);
        getMessagesController().markMentionsAsRead(j3, 0L);
        MessagesController messagesController2 = getMessagesController();
        int i152 = dialog.top_message;
        messagesController2.markDialogAsRead(j3, i152, i152, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i10 < 0) {
        }
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && hk0.n(parentActivity)) {
            if (z10) {
                showDialog(new hk0(parentActivity, !org.telegram.ui.Components.me0.c(), new iw(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.w(parentActivity, new bw(this, 1)).a;
                this.T1 = d2Var;
                showDialog(d2Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!arrayList.isEmpty()) {
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        } else if (this.A0) {
            this.A0 = false;
            J4();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.ChatObject.getPublicUsername(r6) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (isChannelAndNotMegaGroup == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.G.bot_participant) == null || !bool2.booleanValue() || getMessagesController().isInChatCached(chat, user) || ChatObject.canAddBotsToChat(chat)))) {
                Boolean bool3 = this.G.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.G.forum;
                if ((bool4 == null || bool4.booleanValue() == ChatObject.isForum(chat)) && ((this.G.user_admin_rights == null || getMessagesController().matchesAdminRights(chat, getUserConfig().getCurrentUser(), this.G.user_admin_rights)) && (this.G.bot_admin_rights == null || getMessagesController().matchesAdminRights(chat, user, this.G.bot_admin_rights) || ChatObject.canAddAdmins(chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        if (this.G2 == null) {
            org.telegram.ui.Components.xq0 xq0Var = new org.telegram.ui.Components.xq0(getParentActivity(), getResourceProvider());
            this.G2 = xq0Var;
            int i10 = 0;
            xq0Var.setLayoutClickListener(new xv(this, i10));
            this.G2.setOnModeChangeListener(new yv(this, i10));
            gx gxVar = this.B1;
            org.telegram.ui.Components.xq0 xq0Var2 = this.G2;
            if (xq0Var2 == null) {
                gxVar.getClass();
            } else {
                gxVar.F1 = xq0Var2;
                gxVar.addView(xq0Var2, 0, w7.a6.e(-1, 48, 51));
                gxVar.f3 = false;
                gxVar.N();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
            layoutParams.rightMargin = -this.B1.getPaddingRight();
            this.G2.setLayoutParams(layoutParams);
        }
        if (a4()) {
            this.G2.i(this.currentAccount, this.D2);
        } else {
            String str = this.E2;
            if (str != null) {
                org.telegram.ui.Components.xq0 xq0Var3 = this.G2;
                xq0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    xq0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.xq0 xq0Var4 = this.G2;
                    xq0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        xq0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(LocaleController.getString(a4() ? R.string.AddCaption : R.string.ShareComment));
        v3();
        if (this.G2.getMode() != 0) {
            this.B1.x1(false, false);
        }
        b5();
    }

    public final boolean l4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user == null || UserObject.isReplyUser(user) || UserObject.isDeleted(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3() {
        zg.e eVar;
        eh.d dVar;
        eh.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.l4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.g4) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int dp3 = AndroidUtilities.dp(this.K ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        uw uwVar = this.z0;
        boolean z10 = false;
        int measuredHeight2 = dp3 + ((uwVar == null || uwVar.getVisibility() != 0) ? 0 : this.z0.getMeasuredHeight());
        org.telegram.ui.Components.qs qsVar = this.J1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((qsVar == null || qsVar.getVisibility() != 0) ? 0 : this.J1.getSumHeightOfAllVisibleChild()) + ((int) this.N);
        int measuredHeight3 = this.actionBar.getMeasuredHeight();
        this.v4.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (this.Z != null ? r9.getMeasuredHeight() : 0), this.b.e) + dp);
        boolean z11 = this.W;
        RectF rectF = this.w4;
        if (!z11) {
            if (this.B1 != null && this.y1 != null) {
                rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - n3(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            }
            eVar.g(z10 ? 2 : 1, this.u4);
            eVar.e(this.t4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar = this.m4;
            if (dVar != null) {
                dVar.i(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar.l();
            }
            dVar2 = this.n4;
            if (dVar2 == null) {
                dVar2.i(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar2.l();
                return;
            }
            return;
        }
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        z10 = true;
        eVar.g(z10 ? 2 : 1, this.u4);
        eVar.e(this.t4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar = this.m4;
        if (dVar != null) {
        }
        dVar2 = this.n4;
        if (dVar2 == null) {
        }
    }

    public final void m4(View view) {
        int i10 = 0;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        wv wvVar = new wv(this, i10);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = wvVar;
        showDialog(h3Var);
    }

    public final int n3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.X2 == 0) {
            return this.g4 + this.i4;
        }
        return AndroidUtilities.dp(72.0f) + this.g4;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0416  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n4(View view, int i10, s4.h0 h0Var) {
        s4.h0 h0Var2;
        long j3;
        MessageObject messageObject;
        long j10;
        long j11;
        boolean z10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Components.ao0 ao0Var;
        qx qxVar;
        long j12;
        long j13;
        MessageObject messageObject2;
        int i14;
        long makeEncryptedDialogId;
        long j14;
        long j15;
        gy gyVar;
        boolean z11;
        int i15;
        TLRPC.Document greetingsSticker;
        boolean z12;
        gy gyVar2;
        int i16;
        Object I;
        long j16;
        long j17;
        int i17;
        if (getParentActivity() == null) {
            return;
        }
        boolean z13 = h0Var instanceof fg.m;
        if (z13) {
            fg.m mVar = (fg.m) h0Var;
            int i18 = mVar.h;
            if (i18 == 7 || i18 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i18 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i16 = dialogFilter.id;
                    I = mVar.I(i10);
                    if (this.C2 == null && mVar.n && h0Var.j(i10) == 21) {
                        this.C2.J(this);
                        return;
                    }
                    if (I instanceof TLRPC.User) {
                        if (I instanceof TLRPC.Chat) {
                            j17 = ((TLRPC.Chat) I).id;
                        } else if (I instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                            i17 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.t(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new wy(bundle));
                                return;
                            }
                            j16 = dialog.id;
                            if (this.actionBar.t(null)) {
                                M4(j16, view);
                                return;
                            }
                            h0Var2 = h0Var;
                            i11 = i17;
                            messageObject = null;
                            i13 = i16;
                            j11 = j16;
                            z10 = false;
                            i12 = 0;
                            j10 = 0;
                            j3 = 0;
                        } else if (I instanceof TLRPC.TL_recentMeUrlChat) {
                            j17 = ((TLRPC.TL_recentMeUrlChat) I).chat_id;
                        } else if (I instanceof TLRPC.TL_recentMeUrlUser) {
                            j16 = ((TLRPC.TL_recentMeUrlUser) I).user_id;
                        } else {
                            if (!(I instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (I instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) I).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSet.id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.hy0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) I;
                            h0Var2 = h0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.q80(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j16 = -chat2.id;
                            i17 = 0;
                            i11 = i17;
                            messageObject = null;
                            i13 = i16;
                            j11 = j16;
                            z10 = false;
                            i12 = 0;
                            j10 = 0;
                            j3 = 0;
                        }
                        j16 = -j17;
                    } else {
                        j16 = ((TLRPC.User) I).id;
                    }
                    h0Var2 = h0Var;
                    i17 = 0;
                    i11 = i17;
                    messageObject = null;
                    i13 = i16;
                    j11 = j16;
                    z10 = false;
                    i12 = 0;
                    j10 = 0;
                    j3 = 0;
                }
            }
            i16 = 0;
            I = mVar.I(i10);
            if (this.C2 == null) {
            }
            if (I instanceof TLRPC.User) {
            }
            h0Var2 = h0Var;
            i17 = 0;
            i11 = i17;
            messageObject = null;
            i13 = i16;
            j11 = j16;
            z10 = false;
            i12 = 0;
            j10 = 0;
            j3 = 0;
        } else {
            h0Var2 = h0Var;
            gy gyVar3 = this.C0;
            if (gyVar3 == null || h0Var2 != (ao0Var = gyVar3.b0)) {
                j3 = 0;
                messageObject = null;
                j10 = 0;
                j11 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            } else {
                Object J = ao0Var.J(i10);
                z10 = this.C0.b0.O(i10);
                if (J instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) J;
                    makeEncryptedDialogId = user.id;
                    if (!this.l2) {
                        this.W1 = makeEncryptedDialogId;
                        this.X1 = user;
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) J;
                    makeEncryptedDialogId = -chat3.id;
                    if (!this.l2) {
                        this.W1 = makeEncryptedDialogId;
                        this.X1 = chat3;
                    }
                } else if (J instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) J;
                    makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
                    if (!this.l2) {
                        this.W1 = makeEncryptedDialogId;
                        this.X1 = encryptedChat;
                    }
                } else {
                    if (J instanceof MessageObject) {
                        messageObject2 = (MessageObject) J;
                        long dialogId = messageObject2.getDialogId();
                        int id2 = messageObject2.getId();
                        j3 = 0;
                        j13 = ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-dialogId))) ? MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true) : 0L;
                        gy gyVar4 = this.C0;
                        if (gyVar4 != null) {
                            org.telegram.ui.Components.ao0 ao0Var2 = gyVar4.b0;
                            ao0Var2.j0.a(ao0Var2.Z);
                        }
                        i14 = id2;
                        j12 = dialogId;
                    } else {
                        j3 = 0;
                        if (J instanceof String) {
                            String str2 = (String) J;
                            gy gyVar5 = this.C0;
                            if (gyVar5 != null && !gyVar5.b0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                ek0 ek0Var = new ek0(getParentActivity(), this);
                                ek0Var.v(str2, true);
                                ek0Var.show();
                            }
                        } else if (J instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) J;
                            org.telegram.ui.Components.d5.v(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((J instanceof TLRPC.TL_forumTopic) && (qxVar = this.F3) != null && (qxVar.getFragment() instanceof ig1)) {
                            j12 = -((ig1) this.F3.getFragment()).a;
                            j13 = ((TLRPC.TL_forumTopic) J).id;
                            messageObject2 = null;
                            i14 = 0;
                        }
                        messageObject2 = null;
                        j13 = 0;
                        j12 = 0;
                        i14 = 0;
                    }
                    if (j12 == j3 && this.actionBar.s()) {
                        if (this.actionBar.t("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            M4(j12, view);
                            return;
                        }
                        return;
                    }
                    j11 = j12;
                    j10 = j13;
                    i13 = 0;
                    i12 = i14;
                    messageObject = messageObject2;
                    i11 = 0;
                }
                messageObject2 = null;
                j12 = makeEncryptedDialogId;
                i14 = 0;
                j13 = 0;
                j3 = 0;
                if (j12 == j3) {
                }
                j11 = j12;
                j10 = j13;
                i13 = 0;
                i12 = i14;
                messageObject = messageObject2;
                i11 = 0;
            }
        }
        if (j11 == j3) {
            return;
        }
        if (this.l2) {
            if (h5(j11)) {
                if ((!getMessagesController().isForum(j11) && !getMessagesController().isCommunity(j11)) || f4(j11)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j11)) || p3(j11)) {
                            boolean i32 = i3(j11, view);
                            gy gyVar6 = this.C0;
                            if (gyVar6 != null && h0Var2 == gyVar6.b0) {
                                this.actionBar.h(true);
                                P3(j11, i32);
                            }
                            a5();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().isCommunity(j11)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j11);
                    wy wyVar = new wy(bundle2);
                    wyVar.W2 = this;
                    wyVar.C2 = this.C2;
                    presentFragment(wyVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().isForum(j11) || f4(j11)) && !getMessagesController().isMonoForumWithManageRights(j11))) {
                    O3(j11, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j11);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                ig1 ig1Var = new ig1(bundle3);
                ig1Var.L0 = this;
                presentFragment(ig1Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (DialogObject.isEncryptedDialog(j11)) {
            bundle4.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
        } else if (DialogObject.isUserDialog(j11)) {
            bundle4.putLong("user_id", j11);
        } else {
            if (i12 != 0) {
                j14 = j10;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(-j11));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle4.putLong("migrated_to", j11);
                    j15 = -chat4.migrated_to.channel_id;
                    bundle4.putLong("chat_id", -j15);
                    if (i12 != 0) {
                        bundle4.putInt("message_id", i12);
                    } else if (z10) {
                        TLObject tLObject = this.X1;
                        if (tLObject != null) {
                            gy gyVar7 = this.C0;
                            if (gyVar7 != null) {
                                gyVar7.b0.R(this.W1, tLObject);
                            }
                            this.X1 = null;
                        }
                    } else {
                        J3();
                    }
                    boolean z14 = LocaleController.isRTL && !this.j2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.X2 == j3;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j11) || !z14) && this.p2.dialogId == j11 && ((gyVar2 = this.C0) == null || h0Var2 != gyVar2.b0))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.s0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (org.telegram.ui.Cells.r6.g(1, fragmentStack) instanceof eo)) {
                                ((eo) org.telegram.ui.Cells.r6.g(1, fragmentStack)).U9();
                                return;
                            }
                            if (fragmentStack.size() == 2) {
                                launchActivity.s0.l(true, false);
                                return;
                            } else {
                                if (getParentActivity() instanceof LaunchActivity) {
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(0);
                                    fragmentStack.clear();
                                    fragmentStack.add(p2Var);
                                    launchActivity.s0.U(true, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    gyVar = this.C0;
                    if (gyVar != null && gyVar.y0) {
                        gyVar.Q(false);
                    }
                    if (j11 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.D0 == null) {
                            this.D0 = new org.telegram.ui.Components.av0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.la0(bundle5, this.D0));
                        return;
                    }
                    if (this.n2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            eo eoVar = new eo(bundle4);
                            d4(eoVar, messageObject);
                            presentFragment(eoVar);
                            return;
                        }
                        return;
                    }
                    this.z3 = true;
                    if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j11));
                        TLRPC.Dialog dialog2 = getMessagesController().getDialog(j11);
                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                        boolean z15 = dialog2 != null && dialog2.view_forum_as_messages;
                        if (this.X2 == j3 || chat5 == null) {
                            z11 = z13;
                            i15 = 0;
                        } else {
                            z11 = z13;
                            i15 = ei.u0.b(this.currentAccount, -chat5.id);
                        }
                        if (i15 == 3) {
                            showDialog(new org.telegram.ui.Components.q80(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i19 = 4;
                        if (i15 == 4) {
                            org.telegram.messenger.a2.o(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.wc.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z12 = chat5.monoforum) || chat5.forum) && j14 == j3)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new wy(bundle6));
                                return;
                            }
                            eo eoVar2 = new eo(bundle4);
                            if (j14 != j3) {
                                mg.d.a(eoVar2, MessagesStorage.TopicKey.of(j11, j14));
                            }
                            if (z11 && DialogObject.isUserDialog(j11) && getMessagesController().dialogs_dict.f(j11) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                eoVar2.B9 = greetingsSticker;
                                eoVar2.C9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                qx qxVar2 = this.F3;
                                if (qxVar2.a != null) {
                                    qxVar2.a();
                                }
                            }
                            d4(eoVar2, messageObject);
                            presentFragment(eoVar2);
                            return;
                        }
                        if (z12) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            eo eoVar3 = new eo(bundle4);
                            d4(eoVar3, messageObject);
                            presentFragment(eoVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            eo eoVar4 = new eo(bundle4);
                            mg.d.a(eoVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(eoVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.X2 != j3) {
                            if (!z15) {
                                presentFragment(new ig1(bundle4));
                                return;
                            }
                            eo eoVar5 = new eo(bundle4);
                            d4(eoVar5, messageObject);
                            presentFragment(eoVar5);
                            return;
                        }
                        if (!z14) {
                            if (!z15) {
                                presentFragment(new ig1(bundle4));
                                return;
                            }
                            eo eoVar6 = new eo(bundle4);
                            d4(eoVar6, messageObject);
                            presentFragment(eoVar6);
                            return;
                        }
                        if (this.j2) {
                            return;
                        }
                        if (z15) {
                            eo eoVar7 = new eo(bundle4);
                            d4(eoVar7, messageObject);
                            presentFragment(eoVar7);
                            return;
                        }
                        qx qxVar3 = this.F3;
                        xx xxVar = qxVar3.a;
                        if (xxVar == null || (-xxVar.a) != j11) {
                            sy syVar = this.e0[0].a;
                            syVar.p3 = 0.0f;
                            syVar.q3 = syVar.o3;
                            syVar.r3 = syVar.i3 != 0.0f;
                            xx xxVar2 = new xx(bundle4);
                            xxVar2.M0 = this;
                            final qx qxVar4 = this.F3;
                            org.telegram.ui.ActionBar.f5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = qxVar4.n;
                            if (!qxVar4.r) {
                                qxVar4.w = parentLayout;
                                xxVar2.onFragmentCreate();
                                xxVar2.setInPreviewMode(true);
                                xxVar2.setParentLayout(parentLayout);
                                View performCreateView = xxVar2.performCreateView(qxVar4.getContext());
                                xxVar2.onResume();
                                qxVar4.b = performCreateView;
                                qxVar4.addView(performCreateView);
                                final xx xxVar3 = qxVar4.a;
                                k0 k0Var = xxVar2.e;
                                qxVar4.c = k0Var;
                                qxVar4.addView(k0Var);
                                qxVar4.a = xxVar2;
                                r41.Q = j3;
                                r41.Q = -xxVar2.a;
                                if (xxVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.l actionBar = xxVar2.getActionBar();
                                    qxVar4.d = actionBar;
                                    qxVar4.addView(actionBar);
                                    qxVar4.d.U0 = new k01(qxVar4, 8);
                                }
                                if (xxVar3 != null) {
                                    final xx xxVar4 = qxVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.k kVar = qxVar4.x;
                                        if (kVar != null) {
                                            kVar.c();
                                        }
                                        xxVar4.onTransitionAnimationStart(true, false);
                                        qxVar4.E = xxVar3;
                                        qxVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.k kVar2 = new o1.k(new o1.j(0.0f));
                                        qxVar4.x = kVar2;
                                        kVar2.u = org.telegram.ui.Cells.r6.l(1000.0f, 400.0f, 1.0f);
                                        r41.f(xxVar3, xxVar4, 0.0f);
                                        qxVar4.x.b(new td0(qxVar4, i19));
                                        qxVar4.x.a(new o1.f() { // from class: org.telegram.ui.p41
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z16, float f7, float f10) {
                                                r41 r41Var = qxVar4;
                                                if (r41Var.x == null) {
                                                    return;
                                                }
                                                r41Var.x = null;
                                                org.telegram.ui.ActionBar.p2 p2Var2 = xxVar4;
                                                p2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.p2 p2Var3 = xxVar3;
                                                r41.f(p2Var3, p2Var2, 1.0f);
                                                r41Var.v = false;
                                                r41Var.E = null;
                                                p2Var3.onPause();
                                                p2Var3.onFragmentDestroy();
                                                r41Var.removeView(p2Var3.getFragmentView());
                                                r41Var.removeView(p2Var3.getActionBar());
                                                r41Var.n.unlock();
                                            }
                                        });
                                        qxVar4.x.f();
                                    } else {
                                        xxVar4.onTransitionAnimationStart(true, false);
                                        xxVar4.onTransitionAnimationEnd(true, false);
                                        r41.f(xxVar3, xxVar4, 1.0f);
                                        qxVar4.v = false;
                                        qxVar4.E = null;
                                        xxVar3.onPause();
                                        xxVar3.onFragmentDestroy();
                                        qxVar4.removeView(xxVar3.getFragmentView());
                                        qxVar4.removeView(xxVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!qxVar4.f) {
                                    qxVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        qxVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        qxVar4.e = 0.0f;
                                        qxVar4.e(true);
                                        qxVar4.g();
                                        xxVar2.onTransitionAnimationStart(true, false);
                                        qxVar4.h.addUpdateListener(new o41(qxVar4, 1));
                                        qxVar4.h.addListener(new org.telegram.ui.Components.vv0(11, (Object) qxVar4, (Object) xxVar2));
                                        qxVar4.h.setDuration(250L);
                                        qxVar4.h.setInterpolator(org.telegram.ui.Components.wr.f);
                                        qxVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        qxVar4.h.start();
                                    } else {
                                        qxVar4.e(true);
                                        xxVar2.onTransitionAnimationStart(true, false);
                                        xxVar2.onTransitionAnimationEnd(true, false);
                                        qxVar4.e = 1.0f;
                                        qxVar4.g();
                                        qxVar4.d(false);
                                    }
                                }
                                xxVar2.setPreviewDelegate(new ul0(qxVar4, 16));
                                WeakHashMap weakHashMap = r0.i0.a;
                                r0.y.c(qxVar4);
                            }
                        } else {
                            qxVar3.a();
                        }
                        gy gyVar8 = this.C0;
                        if (gyVar8 != null) {
                            gyVar8.R();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                j14 = j10;
            }
            j15 = j11;
            bundle4.putLong("chat_id", -j15);
            if (i12 != 0) {
            }
            if (LocaleController.isRTL) {
            }
            bundle4.putInt("dialog_folder_id", i11);
            bundle4.putInt("dialog_filter_id", i13);
            if (!AndroidUtilities.isTablet()) {
            }
            gyVar = this.C0;
            if (gyVar != null) {
                gyVar.Q(false);
            }
            if (j11 != getUserConfig().getClientUserId()) {
            }
            if (this.n2 != null) {
            }
        }
        j14 = j10;
        if (i12 != 0) {
        }
        if (LocaleController.isRTL) {
        }
        bundle4.putInt("dialog_folder_id", i11);
        bundle4.putInt("dialog_filter_id", i13);
        if (!AndroidUtilities.isTablet()) {
        }
        gyVar = this.C0;
        if (gyVar != null) {
        }
        if (j11 != getUserConfig().getClientUserId()) {
        }
        if (this.n2 != null) {
        }
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new rv(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f7, org.telegram.ui.Components.ul0 ul0Var) {
        org.telegram.ui.Components.ao0 ao0Var;
        org.telegram.ui.Components.ao0 ao0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && ul0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.l2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.F3.c() && r2Var.S(f7)) {
                    return H4(r2Var);
                }
            }
            qx qxVar = this.F3;
            if (qxVar == null || !qxVar.c()) {
                gy gyVar = this.C0;
                if (gyVar != null && ul0Var == (ao0Var2 = gyVar.b0)) {
                    Object J = ao0Var2.J(i10);
                    if (!this.C0.b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, mg.d.i(chat, this.currentAccount, false));
                            } else {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.id == getUserConfig().clientUserId) {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            d2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r11.id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new bi.za(this, makeEncryptedDialogId, 7));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                        }
                        return true;
                    }
                }
                gy gyVar2 = this.C0;
                if (gyVar2 == null || ul0Var != (ao0Var = gyVar2.b0)) {
                    Object I = ((fg.m) ul0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.l2) {
                            if ((this.R0 == 3 || I3()) && h5(dialog.id)) {
                                if (this.R0 != 1 || !I3() || !this.m2 || !getMessagesController().isForum(dialog.id)) {
                                    i3(dialog.id, view);
                                    a5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.R0 == 1);
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                ig1 ig1Var = new ig1(bundle);
                                ig1Var.L0 = this;
                                presentFragment(ig1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                m4(view);
                                return false;
                            }
                            if (!this.actionBar.s() || !g4(dialog)) {
                                M4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.l2) {
                        n4(view, i10, ul0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.j6) || ao0Var.O(i10)) ? 0L : ((org.telegram.ui.Cells.j6) view).getDialogId();
                    if (dialogId != 0) {
                        M4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.F3.c() || !this.F3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.w70 w70Var = this.L0;
            if (w70Var == null) {
                uw uwVar = this.z0;
                if (uwVar == null || !uwVar.n) {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar == null || !lVar.s()) {
                        if (!this.b.f) {
                            uw uwVar2 = this.z0;
                            if (uwVar2 != null && uwVar2.getVisibility() == 0 && !this.g3) {
                                uw uwVar3 = this.z0;
                                if (!uwVar3.O && !this.l3) {
                                    ArrayList arrayList = uwVar3.h;
                                    if (!arrayList.isEmpty() && uwVar3.L != ((org.telegram.ui.Components.n00) arrayList.get(0)).a) {
                                        if (z10) {
                                            uw uwVar4 = this.z0;
                                            ArrayList arrayList2 = uwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                uwVar4.f((org.telegram.ui.Components.n00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            gx gxVar = this.B1;
                            if (gxVar == null || !gxVar.t0()) {
                                nx nxVar = this.E0;
                                if (nxVar.O != 0 || nxVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                nxVar.h.x0(0);
                                return false;
                            }
                            if (z10) {
                                this.B1.m0(true);
                            }
                        } else if (z10) {
                            this.X.r.getText().clear();
                            this.Y.b(false);
                            this.X.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        gy gyVar = this.C0;
                        if (gyVar != null && gyVar.getVisibility() == 0) {
                            this.C0.Q(false);
                        }
                        b4(true);
                        return false;
                    }
                } else if (z10) {
                    uwVar.setIsEditing(false);
                    I4(false);
                    return false;
                }
            } else if (z10) {
                w70Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.F3.a();
            gy gyVar2 = this.C0;
            if (gyVar2 != null) {
                gyVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        bi.nc ncVar;
        uw uwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                gy gyVar = this.C0;
                if (gyVar != null) {
                    gyVar.b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (uwVar = this.z0) != null && uwVar.getVisibility() == 0 && this.r.f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.e0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (ncVar = this.K0) != null && ncVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        bi.x4 x4Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = R3(this.currentAccount, this.R0, this.V2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.r0 && !this.s0 && (x4Var = this.p0) != null && this.O3) {
            this.s0 = true;
            this.r0 = false;
            x4Var.u();
        }
        AndroidUtilities.runOnUIThread(new kw(this, 3), 200L);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.w70 w70Var = this.L0;
        if (w70Var != null) {
            w70Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.d2 d2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (d2Var = this.T1) != null && dialog == d2Var && getParentActivity() != null) {
            k3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.l2 = bundle.getBoolean("onlySelect", false);
            this.m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f2 = this.arguments.getString("selectAlertString");
            this.g2 = this.arguments.getString("selectAlertStringGroup");
            this.h2 = this.arguments.getString("addToGroupAlertString");
            this.r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.t2 = this.arguments.getBoolean("afterSignup", false);
            this.V2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.X2 = j3;
            if (j3 != 0) {
                this.Y2 = getMessagesController().getChat(Long.valueOf(this.X2));
                this.Z2 = getMessagesController().getChatFull(this.X2);
            }
            this.i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.u2);
            this.arguments.getInt("otherwiseRelogin");
            this.v2 = this.arguments.getBoolean("allowGroups", true);
            this.w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.y2 = this.arguments.getBoolean("allowChannels", true);
            this.z2 = this.arguments.getBoolean("allowUsers", true);
            this.A2 = this.arguments.getBoolean("allowBots", true);
            this.B2 = this.arguments.getBoolean("closeFragment", true);
            this.F = this.arguments.getBoolean("allowGlobalSearch", true);
            this.W = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.G = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.H = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.R0 == 0) {
            this.U1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.J3 = getNotificationCenter().createObserversGroup(this);
        this.K3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.n2 == null) {
            this.d2 = getConnectionsManager().getConnectionState();
            this.K3.add(NotificationCenter.emojiLoaded);
            if (!this.l2) {
                this.K3.add(NotificationCenter.closeSearchByActiveAction);
                this.K3.add(NotificationCenter.proxySettingsChanged);
                this.J3.add(NotificationCenter.filterSettingsUpdated);
                this.J3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.J3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.K3.add(NotificationCenter.didSetPasscode);
        }
        this.J3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.J3.add(NotificationCenter.chatlistFolderUpdate);
            this.J3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        zh.i5 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new zh.j4(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            dv dvVar = this.R3;
            if (dvVar.getParent() != null) {
                ((ViewGroup) dvVar.getParent()).removeView(dvVar);
            }
            this.R3 = null;
        }
        if (e4()) {
            zh.i5 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.X2 != 0) {
            getMessagesController().loadFullChat(this.X2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        this.i4 = this.W ? AndroidUtilities.dp(72.0f) : 0;
        this.j4 = this.W ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.J3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.J3 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.K3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.K3 = null;
        }
        gx gxVar = this.B1;
        if (gxVar != null) {
            gxVar.B0();
        }
        org.telegram.ui.Components.xq0 xq0Var = this.G2;
        if (xq0Var != null) {
            xq0Var.j();
        }
        uv uvVar = this.H2;
        if (uvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uvVar);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.o3.unlock();
        this.C2 = null;
        nb1 nb1Var = nb1.b;
        if (nb1Var != null) {
            nb1Var.dismiss();
            nb1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        gx gxVar = this.B1;
        int i10 = 0;
        if (gxVar == null || !gxVar.t0()) {
            while (true) {
                vy[] vyVarArr = this.e0;
                if (i10 >= vyVarArr.length) {
                    break;
                }
                vyVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.pc pcVar = this.n3;
                if (pcVar != null) {
                    pcVar.l();
                }
            }
            gy gyVar = this.C0;
            if (gyVar != null) {
                gyVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f7);
        while (true) {
            vy[] vyVarArr2 = this.e0;
            if (i10 >= vyVarArr2.length) {
                break;
            }
            vyVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.pc pcVar2 = this.n3;
            if (pcVar2 != null) {
                pcVar2.l();
            }
        }
        gy gyVar2 = this.C0;
        if (gyVar2 != null) {
            gyVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.pc pcVar = this.S;
        if (pcVar != null) {
            pcVar.b();
            this.S = null;
        }
        qx qxVar = this.F3;
        if (qxVar != null) {
            qxVar.r = true;
            xx xxVar = qxVar.a;
            if (xxVar != null) {
                xxVar.onPause();
            }
        }
        org.telegram.ui.Components.w70 w70Var = this.L0;
        if (w70Var != null) {
            w70Var.u();
        }
        gx gxVar = this.B1;
        if (gxVar != null) {
            gxVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.e0 == null) {
            return;
        }
        while (true) {
            vy[] vyVarArr = this.e0;
            if (i10 >= vyVarArr.length) {
                return;
            }
            vyVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        int i11;
        if (i10 != 1) {
            if (i10 == 4) {
                for (int i12 : iArr) {
                    if (i12 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                    return;
                }
                filesMigrationBottomSheet.migrateOldFolder();
                return;
            }
            return;
        }
        for (int i13 = 0; i13 < strArr.length; i13++) {
            if (iArr.length > i13) {
                String str = strArr[i13];
                str.getClass();
                i11 = 2;
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i13] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            hk0.m();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i13] == 0) {
                            ImageLoader.getInstance().checkMediaPaths();
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i13] == 0) {
                            AndroidUtilities.runOnUIThread(new kw(this, i11));
                            getContactsController().forceImportContacts();
                            break;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                            this.U1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.A0) {
            this.A0 = false;
            J4();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        wy wyVar;
        vy vyVar;
        dx dxVar;
        int i10;
        org.telegram.ui.Components.ao0 ao0Var;
        bi.nc ncVar;
        super.onResume();
        nx nxVar = this.E0;
        if (nxVar != null) {
            ArrayList arrayList = nxVar.x;
            zh.i5 i5Var = nxVar.s;
            i5Var.l(i5Var.g);
            i5Var.l(i5Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y3 = i5Var.y(((zh.j) arrayList.get(i11)).c);
                if (y3 != null) {
                    i5Var.X(y3);
                }
            }
        }
        qx qxVar = this.F3;
        if (qxVar != null) {
            qxVar.r = false;
            xx xxVar = qxVar.a;
            if (xxVar != null) {
                xxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (ncVar = this.K0) != null && ncVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                vy[] vyVarArr = this.e0;
                if (i12 >= vyVarArr.length) {
                    break;
                }
                vyVarArr[i12].d.l();
                i12++;
            }
        }
        gx gxVar = this.B1;
        if (gxVar != null) {
            gxVar.E0();
        }
        long j3 = 0;
        if (!this.l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        gy gyVar = this.C0;
        if (gyVar != null && (ao0Var = gyVar.b0) != null) {
            ao0Var.l();
        }
        boolean z10 = this.t2 || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.c2 && !this.l2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.c2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                wyVar = this;
                org.telegram.messenger.q1 q1Var = new org.telegram.messenger.q1(wyVar, z13, z11, z12, parentActivity);
                if (wyVar.t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(q1Var, j3);
            } else {
                wyVar = this;
            }
        } else {
            wyVar = this;
            if (!wyVar.l2 && wyVar.V2 == 0 && wyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new yv(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.gp0(17));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (wyVar.V2 == 0 && wyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new yv(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.gp0(18));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        J4();
        if (wyVar.e0 != null) {
            int i13 = 0;
            while (true) {
                vy[] vyVarArr2 = wyVar.e0;
                if (i13 >= vyVarArr2.length) {
                    break;
                }
                vy vyVar2 = vyVarArr2[i13];
                if (vyVar2.s == 0 && vyVar2.v == 2 && vyVar2.c.L0() == 0 && Z3()) {
                    wyVar.e0[i13].c.h1(1, (int) wyVar.N);
                }
                if (i13 == 0) {
                    wyVar.e0[i13].d.getClass();
                } else {
                    wyVar.e0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new z8(this, 4));
        if (wyVar.p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), wyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            nb1.n(this);
        }
        B3();
        if (wyVar.z0 == null || (vyVar = wyVar.e0[0]) == null || (dxVar = vyVar.d) == null) {
            return;
        }
        int i14 = dxVar.h;
        if (i14 == 7 || i14 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i14 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                wyVar.z0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.a4 == null) {
            F4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.nc ncVar;
        wy wyVar;
        qx qxVar = this.F3;
        if (qxVar == null || !qxVar.c()) {
            if (z10 && (ncVar = this.K0) != null && ncVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).x0.c(false);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (wyVar = this.W2) != null) {
            wyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        qx qxVar = this.F3;
        if (qxVar == null || !qxVar.c()) {
            bi.nc ncVar = this.K0;
            if (ncVar != null && ncVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        }
        B3();
    }

    public final boolean p3(long j3) {
        int i10;
        int i11 = this.R0;
        if (i11 == 15 || i11 == 16 || this.h2 != null || !this.s2) {
            return true;
        }
        if (!DialogObject.isChatDialog(j3)) {
            if (!DialogObject.isEncryptedDialog(j3)) {
                return true;
            }
            if (this.T0 == 0 && !this.U0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.SendMessageTitle);
            int i12 = this.T0;
            if (i12 == 3) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i12 != 0) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            showDialog(alertDialog$Builder.a);
            return false;
        }
        long j10 = -j3;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            return true;
        }
        if (!this.q2 && ChatObject.isCanWriteToChannel(j10, this.currentAccount) && (i10 = this.T0) != 2 && i10 != 3) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.a.R = LocaleController.getString(R.string.SendMessageTitle);
        int i13 = this.T0;
        if (i13 == 3) {
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.TodoCantForward);
        } else if (i13 == 2) {
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.PublicPollCantForward);
        } else {
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
        }
        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder2.a);
        return false;
    }

    public final void p4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.m9(14));
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.r(currentUser);
                org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(this, getParentActivity(), z10);
                linearLayout.addView(sg0Var, w7.a6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, g9Var);
                sg0Var.addView(w9Var, w7.a6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.a6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.wa(this, intValue, H, 11));
                H.r(linearLayout, w7.a6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            B4(true);
        } else {
            this.a4 = null;
            this.Z3 = false;
            B4(false);
            F4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        boolean presentFragment = super.presentFragment(p2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                vy[] vyVarArr = this.e0;
                if (i10 >= vyVarArr.length) {
                    break;
                }
                vyVarArr[i10].d.getClass();
                i10++;
            }
        }
        bi.x4 x4Var = this.p0;
        if (x4Var != null) {
            x4Var.e(true);
        }
        bi.x4 x4Var2 = this.q0;
        if (x4Var2 != null) {
            x4Var2.e(true);
        }
        org.telegram.ui.Components.pc.e();
        return presentFragment;
    }

    public final void q3(boolean z10) {
        fi.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.qs qsVar = this.J1;
        if (qsVar == null || (jVar = this.Q1) == null || (chatFull = this.Z2) == null) {
            return;
        }
        qsVar.i(jVar, (this.X2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
    }

    public final void q4(int i10, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j3, 1, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().deleteDialog(j3, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j3);
            }
        } else if (ChatObject.isNotInChat(chat)) {
            getMessagesController().deleteDialog(j3, 0, z11);
        } else {
            getMessagesController().deleteParticipantFromChat(-j3, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j3));
        }
        getMessagesController().checkIfFolderEmpty(this.V2);
    }

    @Override // org.telegram.ui.eh0
    public final void r() {
        x4(true, true);
    }

    public final void r3(vy vyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = vyVar.c.L0();
        int N0 = vyVar.c.N0();
        if (this.g3 || this.l3) {
            return;
        }
        uw uwVar = this.z0;
        if (uwVar != null && uwVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.c1 K = vyVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                c4(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = vyVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = vyVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(vyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, vyVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                    z10 = z15;
                    z11 = false;
                } else {
                    z10 = z15;
                    z11 = true;
                }
                if ((abs > 0 || N0 < R3(this.currentAccount, vyVar.s, this.V2, this.S1).size() - 10) && (abs != 0 || (!((i10 = vyVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.V2)))) {
                    z12 = false;
                    z13 = false;
                } else {
                    boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.V2);
                    boolean z16 = !isDialogsEndReached2;
                    if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.V2)) {
                        z13 = z16;
                        z12 = false;
                    } else {
                        z13 = z16;
                        z12 = true;
                    }
                }
                if (!z12 || z11) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mw
                        @Override // java.lang.Runnable
                        public final void run() {
                            wy wyVar = wy.this;
                            if (z12) {
                                wyVar.getMessagesController().loadDialogs(wyVar.V2, -1, 100, z13);
                            }
                            if (z11) {
                                wyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                            } else {
                                wyVar.getClass();
                            }
                        }
                    });
                }
                return;
            }
        }
        z11 = false;
        z10 = false;
        if (abs > 0) {
        }
        z12 = false;
        z13 = false;
        if (z12) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mw
            @Override // java.lang.Runnable
            public final void run() {
                wy wyVar = wy.this;
                if (z12) {
                    wyVar.getMessagesController().loadDialogs(wyVar.V2, -1, 100, z13);
                }
                if (z11) {
                    wyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                } else {
                    wyVar.getClass();
                }
            }
        });
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void r4(java.util.ArrayList r45, int r46, boolean r47, boolean r48, java.util.HashSet r49) {
        /*
            Method dump skipped, instructions count: 2833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.r4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void s3() {
        if (this.e0 == null) {
            return;
        }
        int n32 = n3();
        int i10 = 0;
        while (true) {
            vy[] vyVarArr = this.e0;
            if (i10 >= vyVarArr.length) {
                return;
            }
            vy vyVar = vyVarArr[i10];
            if (vyVar != null) {
                sy syVar = vyVar.a;
                syVar.setPadding(0, syVar.Y2, 0, n32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s4(long j3, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        int i11;
        boolean z12;
        boolean pinDialog;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && Z3() && this.e0[0].v == 2) ? 1 : 0;
        int L0 = this.e0[0].c.L0();
        if (dialogFilter != null) {
            int i13 = dialogFilter.pinnedDialogs.get(j3, TLObject.FLAG_31);
            if (!z10 && i13 == Integer.MIN_VALUE) {
                return;
            }
        }
        this.y3 = z10 ? 4 : 5;
        int i14 = -1;
        if (L0 > i12 || !z11) {
            i11 = -1;
            z12 = true;
        } else {
            A4(true, true);
            o3();
            if (this.R1 != null) {
                for (int i15 = 0; i15 < this.R1.size(); i15++) {
                    if (((TLRPC.Dialog) this.R1.get(i15)).id == j3) {
                        i11 = i15;
                        break;
                    }
                }
            }
            i11 = -1;
            z12 = false;
        }
        if (dialogFilter != null) {
            if (z10) {
                dialogFilter.pinnedDialogs.put(j3, i10);
            } else {
                dialogFilter.pinnedDialogs.delete(j3);
            }
            if (z11) {
                getMessagesController().onFilterUpdate(dialogFilter);
            }
            pinDialog = true;
        } else {
            pinDialog = getMessagesController().pinDialog(j3, z10, null, -1L);
        }
        if (pinDialog) {
            if (z12) {
                if (this.R0 != 10) {
                    c4(false);
                }
                x4(true, false);
            } else {
                ArrayList R3 = R3(this.currentAccount, this.e0[0].s, this.V2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= R3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) R3.get(i16)).id == j3) {
                        i14 = i16;
                        break;
                    }
                    i16++;
                }
            }
        }
        if (z12) {
            return;
        }
        if (i11 >= 0) {
            ArrayList arrayList = this.R1;
            if (arrayList != null && i14 >= 0 && i11 != i14) {
                arrayList.add(i14, (TLRPC.Dialog) arrayList.remove(i11));
                this.e0[0].x.D();
                this.e0[0].q(true);
                vy vyVar = this.e0[0];
                vyVar.c.h1((vyVar.s == 0 && Z3() && this.e0[0].v == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new rv(this, 23), 200L);
            }
            z13 = true;
            if (z13) {
                A4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        nx nxVar = this.E0;
        if (nxVar != null) {
            if (!this.G0 || z10) {
                nxVar.setVisibility(8);
            } else {
                nxVar.setVisibility(0);
            }
        }
        Y4(true);
        U4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        sx sxVar;
        org.telegram.ui.Components.n5 n5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (sxVar = this.M0) != null && (sxVar.getContentView() instanceof l71)) {
            org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
            l71 l71Var = (l71) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                n5Var = this.D3;
            }
            n5Var = null;
            l71Var.y(n5Var, titleTextView);
        }
        nx nxVar = this.E0;
        if (nxVar != null) {
            org.telegram.ui.Components.o6 o6Var = nxVar.T;
            nxVar.U.b(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                nxVar.g0 = true;
                if (nxVar.h0 != i10) {
                    nxVar.h0 = i10;
                    o6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                nxVar.g0 = false;
                nxVar.h0 = 0;
                o6Var.c(nxVar.f0, !LocaleController.isRTL, true);
            }
            nxVar.a.a(nxVar.g0, true);
            nxVar.L0.s(o6Var);
        }
    }

    public final void t3() {
        gh.g gVar = this.y1;
        if (gVar != null) {
            gVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        B3();
    }

    public final void u3() {
        vy vyVar;
        float S3 = S3(true);
        uw uwVar = this.z0;
        if (uwVar != null) {
            boolean z10 = uwVar.getAlpha() != S3;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.z0.setAlpha(S3);
            this.z0.setScaleX(lerp);
            this.z0.setScaleY(lerp);
            this.z0.setVisibility(S3 > 0.0f ? 0 : 8);
            if (z10 && (vyVar = this.e0[0]) != null) {
                vyVar.a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(vy vyVar) {
        int i10;
        if (vyVar.getVisibility() != 0) {
            return;
        }
        int i11 = vyVar.d.v;
        if (vyVar.s == 0 && Z3() && vyVar.a.getChildCount() == 0 && vyVar.v == 2) {
            ((s4.c0) vyVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        vyVar.d.getClass();
        vyVar.d.U();
        int h = vyVar.d.h();
        if (h == 1 && i11 == 1 && vyVar.d.j(0) == 5) {
            vyVar.q(true);
        } else {
            vyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                vyVar.y.b(i11);
            }
        }
        try {
            vyVar.a.setEmptyView((this.V2 == 0 && this.X2 == 0) ? vyVar.w : null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        r3(vyVar);
    }

    public final void v3() {
        float f7 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        hi.b2 b2Var = this.C1;
        if (b2Var != null) {
            b2Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        gh.g gVar = this.y1;
        if (gVar != null) {
            gVar.setAlpha(f7);
            this.y1.setVisibility(f7 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f7);
            this.y1.getFadeView().setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void v4() {
        boolean z10;
        if (this.N == 0.0f || (z10 = this.K)) {
            return;
        }
        float f7 = z10 ? -U3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
        animatorSet.setInterpolator(org.telegram.ui.Components.wr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float V3 = 1.0f - V3();
        org.telegram.ui.Components.h20.d(this.actionBar.getBackButton(), Math.max(this.t3, f7 * V3 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w4(int i10) {
        org.telegram.ui.Components.n00 n00Var;
        if (this.z0 == null) {
            V4(true, true);
            if (this.z0 == null) {
                return;
            }
        }
        int tabsCount = this.z0.getTabsCount() - 1;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i11 = 0;
        while (true) {
            if (i11 >= dialogFilters.size()) {
                break;
            }
            if (dialogFilters.get(i11).id == i10) {
                tabsCount = i11;
                break;
            }
            i11++;
        }
        uw uwVar = this.z0;
        if (tabsCount < 0) {
            uwVar.getClass();
        } else if (tabsCount < uwVar.getTabsCount()) {
            n00Var = (org.telegram.ui.Components.n00) uwVar.h.get(tabsCount);
            if (n00Var != null) {
                uw uwVar2 = this.z0;
                ArrayList arrayList = uwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                uwVar2.f((org.telegram.ui.Components.n00) hc.b.i(1, arrayList), arrayList.size() - 1);
                return;
            }
            vy[] vyVarArr = this.e0;
            if (vyVarArr == null || vyVarArr.length <= 0 || vyVarArr[0].h != n00Var.a) {
                this.z0.f(n00Var, tabsCount);
                return;
            }
            return;
        }
        n00Var = null;
        if (n00Var != null) {
        }
    }

    @Override // org.telegram.ui.eh0
    public final eh.d x() {
        return this.n4;
    }

    public final void x3() {
        org.telegram.ui.Components.h20.d(this.g0, com.google.android.gms.internal.vision.e2.C(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void x4(boolean z10, boolean z11) {
        qx qxVar = this.F3;
        if (qxVar == null || !qxVar.c()) {
            int i10 = (this.e0[0].s == 0 && Z3() && this.e0[0].v == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                v4();
            } else {
                org.telegram.ui.Components.yk0 yk0Var = this.e0[0].r;
                yk0Var.b = 1;
                yk0Var.c(i10, i11, false, false);
                v4();
            }
        }
    }

    public final void y3() {
        org.telegram.ui.Components.h20.d(this.f0, com.google.android.gms.internal.vision.e2.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - V3(), 1.0f - this.c.e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        my myVar = this.X;
        if (myVar != null) {
            myVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    @Override // lg.b
    public final List z() {
        return Arrays.asList(new lg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new lg.a(LocaleController.getString(R.string.ClearLocalDatabase), new rv(this, 27)), new lg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new rv(this, 28)));
    }

    public final void z3() {
        org.telegram.ui.Components.h20.d(this.j0, com.google.android.gms.internal.vision.e2.C(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - V3(), 1.0f - this.c.e));
        nx nxVar = this.E0;
        if (nxVar != null) {
            nxVar.invalidate();
        }
    }

    public final void z4(float f7) {
        this.c0 = f7;
        for (vy vyVar : this.e0) {
            sy syVar = vyVar.a;
            for (int i10 = 0; i10 < syVar.getChildCount(); i10++) {
                View childAt = syVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= vyVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }
}
