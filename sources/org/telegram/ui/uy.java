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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public class uy extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, mg.b, le.d, bh0 {
    public static boolean v4;
    public static final boolean[] w4 = new boolean[4];
    public static final org.telegram.ui.Components.bs0 x4 = new org.telegram.ui.Components.bs0(3);
    public static float y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public cx B1;
    public boolean B2;
    public Long B3;
    public dy C0;
    public ii.z1 C1;
    public oy C2;
    public Drawable C3;
    public org.telegram.ui.Components.iv0 D0;
    public org.telegram.ui.ActionBar.v0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.o5 D3;
    public boolean E;
    public jx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.ls F0;
    public ax F1;
    public CharSequence F2;
    public mx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.fr0 G2;
    public final bx G3;
    public long H;
    public float H0;
    public ax H1;
    public cu H2;
    public final bx H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public zg0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.ns J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public ci.ab K0;
    public org.telegram.ui.Components.ms K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.b80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public ox M0;
    public org.telegram.ui.Cells.a3 M1;
    public int M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.wa N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public AnimatorSet O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public boolean P3;
    public boolean Q;
    public long Q0;
    public gi.j Q1;
    public int Q2;
    public bv Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.rc S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.b2 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.nd0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public uy W2;
    public float W3;
    public iy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public yf.c0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public n41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int a;
    public org.telegram.ui.Components.g91 a0;
    public final ArrayList a1;
    public boolean a2;
    public org.telegram.ui.Components.w9 a3;
    public org.telegram.ui.Components.y40 a4;
    public final le.b b;
    public gg.s0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.h9 b3;
    public TLRPC.FileLocation b4;
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
    public org.telegram.ui.Components.rc d4;
    public final le.b e;
    public ty[] e0;
    public org.telegram.ui.ActionBar.g2 e1;
    public boolean e2;
    public boolean e3;
    public int e4;
    public final le.b f;
    public org.telegram.ui.ActionBar.v0 f0;
    public final Paint f1;
    public String f2;
    public AnimatorSet f3;
    public int f4;
    public org.telegram.ui.ActionBar.v0 g0;
    public ImageView g1;
    public String g2;
    public boolean g3;
    public int g4;
    public final le.b h;
    public wy h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public float i3;
    public int i4;
    public org.telegram.ui.ActionBar.v0 j0;
    public org.telegram.ui.ActionBar.v0 j1;
    public boolean j2;
    public boolean j3;
    public final ah.i j4;
    public org.telegram.ui.ActionBar.v0 k0;
    public org.telegram.ui.ActionBar.v0 k1;
    public boolean k2;
    public int k3;
    public final fh.d k4;
    public org.telegram.ui.ActionBar.v0 l0;
    public org.telegram.ui.ActionBar.v0 l1;
    public boolean l2;
    public boolean l3;
    public final fh.d l4;
    public org.telegram.ui.ActionBar.v0 m0;
    public org.telegram.ui.ActionBar.v0 m1;
    public boolean m2;
    public boolean m3;
    public final fh.c m4;
    public final le.b n;
    public org.telegram.ui.Components.si0 n0;
    public org.telegram.ui.ActionBar.f1 n1;
    public String n2;
    public org.telegram.ui.Components.rc n3;
    public final ah.c n4;
    public org.telegram.ui.ActionBar.f1 o0;
    public org.telegram.ui.ActionBar.f1 o1;
    public String o2;
    public final AnimationNotificationsLocker o3;
    public final ah.c o4;
    public ci.e4 p0;
    public org.telegram.ui.ActionBar.f1 p1;
    public final MessagesStorage.TopicKey p2;
    public boolean p3;
    public final ah.c p4;
    public ci.e4 q0;
    public org.telegram.ui.ActionBar.f1 q1;
    public boolean q2;
    public boolean q3;
    public final ah.c q4;
    public final le.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.f1 r1;
    public boolean r2;
    public boolean r3;
    public iw r4;
    public final le.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.f1 s1;
    public boolean s2;
    public boolean s3;
    public final ArrayList s4;
    public org.telegram.ui.Components.c20 t0;
    public org.telegram.ui.ActionBar.f1 t1;
    public boolean t2;
    public float t3;
    public final RectF t4;
    public org.telegram.ui.Components.c20 u0;
    public float u1;
    public boolean u2;
    public ValueAnimator u3;
    public final RectF u4;
    public final ph.i v;
    public ci.d v0;
    public float v1;
    public boolean v2;
    public float v3;
    public boolean w;
    public jh.f w0;
    public AnimatorSet w1;
    public boolean w2;
    public float w3;
    public int x;
    public int x0;
    public float x1;
    public boolean x2;
    public float x3;
    public boolean y;
    public final UndoView[] y0;
    public hh.g y1;
    public boolean y2;
    public int y3;
    public ky z0;
    public FrameLayout z1;
    public boolean z2;
    public boolean z3;

    public uy(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        this.b = new le.b(1, this, trVar, 350L, false);
        this.c = new le.b(2, this, trVar, 350L, false);
        this.d = new le.b(3, this, trVar, 350L, false);
        this.e = new le.b(4, this, trVar, 350L, false);
        this.f = new le.b(5, this, trVar, 350L, false);
        this.h = new le.b(6, this, trVar, 350L, false);
        this.n = new le.b(7, this, trVar, 350L, false);
        this.r = new le.b(8, this, trVar, 350L, false);
        this.s = new le.b(9, this, trVar, 350L, false);
        this.v = new ph.i(new jw(this, 0));
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
        this.G3 = new bx(this, 0);
        this.H3 = new bx(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.s4 = arrayList;
        RectF rectF = new RectF();
        this.t4 = rectF;
        RectF rectF2 = new RectF();
        this.u4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c d = this.glassEngine.d(new xv(this, 11));
        this.m4 = d;
        if (i10 >= 31) {
            ah.i iVar = new ah.i();
            this.j4 = iVar;
            fh.d dVar = new fh.d(d);
            this.l4 = dVar;
            dVar.f = d;
            dVar.d = iVar;
            dVar.e = -2;
            fh.d dVar2 = new fh.d(null);
            this.k4 = dVar2;
            dVar2.f = d;
            dVar2.d = iVar;
            dVar2.e = -3;
            ah.c cVar = new ah.c(dVar);
            this.p4 = cVar;
            cVar.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            cVar.b = dp;
            cVar.c = dp;
            ah.c cVar2 = new ah.c(dVar2);
            this.n4 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            cVar2.b = dp2;
            cVar2.c = dp2;
            this.o4 = new ah.c(dVar2);
        } else {
            this.j4 = null;
            this.k4 = null;
            this.l4 = null;
            this.n4 = new ah.c(d);
            this.p4 = new ah.c(d);
            this.o4 = new ah.c(d);
        }
        ah.c cVar3 = new ah.c(d);
        this.q4 = cVar3;
        ah.c cVar4 = this.p4;
        li.p pVar = this.glassEngine;
        cVar4.h = pVar;
        this.n4.h = pVar;
        this.o4.h = pVar;
        cVar3.h = pVar;
    }

    public static void A0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        uyVar.d5();
        org.telegram.ui.Components.rc G = org.telegram.ui.Components.yc.a0(uyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void B0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.pe0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.pe0.h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(uy uyVar, int i10) {
        ah.i iVar = uyVar.j4;
        RectF rectF = uyVar.u4;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.e0.a(i10, 4)) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (uyVar.fragmentView.getMeasuredHeight() - uyVar.f4) - AndroidUtilities.dp(8.0f);
            int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(uyVar.K ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + uyVar.actionBar.getMeasuredHeight();
            ky kyVar = uyVar.z0;
            boolean z10 = false;
            int measuredHeight2 = dp3 + ((kyVar == null || kyVar.getVisibility() != 0) ? 0 : uyVar.z0.getMeasuredHeight());
            org.telegram.ui.Components.ns nsVar = uyVar.J1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((nsVar == null || nsVar.getVisibility() != 0) ? 0 : uyVar.J1.getSumHeightOfAllVisibleChild()) + ((int) uyVar.N);
            int measuredHeight3 = uyVar.actionBar.getMeasuredHeight();
            uyVar.t4.set(0.0f, -dp, uyVar.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (uyVar.Z != null ? r9.getMeasuredHeight() : 0), uyVar.b.e) + dp);
            if (uyVar.W) {
                rectF.set(0.0f, dp2, uyVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            } else {
                if (uyVar.B1 != null && uyVar.y1 != null) {
                    rectF.set(0.0f, uyVar.fragmentView.getMeasuredHeight() - uyVar.w3(), uyVar.fragmentView.getMeasuredWidth(), uyVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
                iVar.g(z10 ? 2 : 1, uyVar.s4);
            }
            z10 = true;
            iVar.g(z10 ? 2 : 1, uyVar.s4);
        }
        iVar.e(uyVar.r4, uyVar.fragmentView.getMeasuredWidth(), uyVar.fragmentView.getMeasuredHeight());
    }

    public static void D0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        uyVar.d5();
        org.telegram.ui.Components.rc J = org.telegram.ui.Components.yc.a0(uyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new pv(uyVar, 2));
        J.j = 5000;
        J.j();
    }

    public static void E0(uy uyVar) {
        try {
            ((org.telegram.ui.Components.kj0) ((org.telegram.ui.Components.h9) uyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (uyVar.a4 == null) {
            org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
            uyVar.a4 = y40Var;
            y40Var.H = true;
            y40Var.a = uyVar;
            y40Var.b = new hy(uyVar);
            uyVar.getMediaDataController().checkFeaturedStickers();
            uyVar.getMessagesController().loadSuggestedFilters();
            uyVar.getMessagesController().loadUserInfo(uyVar.getUserConfig().getCurrentUser(), true, uyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(uyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(uyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(uyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.xi xiVar = uyVar.a4.c;
        if (xiVar != null) {
            xiVar.c1();
        }
        org.telegram.ui.Components.y40 y40Var2 = uyVar.a4;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        y40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new pv(uyVar, 1), new qv(uyVar, 0), 0);
    }

    public static /* synthetic */ void F0(uy uyVar, float f7, ValueAnimator valueAnimator) {
        uyVar.e0[0].setTranslationY((1.0f - uyVar.t3) * f7);
        uyVar.t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < uyVar.actionBar.getChildCount(); i10++) {
            if (uyVar.actionBar.getChildAt(i10).getVisibility() == 0 && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getActionMode() && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getBackButton()) {
                uyVar.actionBar.getChildAt(i10).setAlpha(1.0f - uyVar.t3);
            }
        }
        uyVar.N3();
        uyVar.F3();
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void G0(uy uyVar) {
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(uyVar.getParentActivity(), uyVar.resourceProvider);
        zbVar.d(R.raw.email_check_inbox, new String[0]);
        zbVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.rc.g(uyVar, zbVar, 2750).j();
        try {
            uyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H0(uy uyVar) {
        org.telegram.ui.Components.jo0 jo0Var;
        xb1 xb1Var;
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            if (i10 == 2) {
                dy dyVar = uyVar.C0;
                if (dyVar == null) {
                    i10++;
                } else {
                    viewGroup = dyVar.a0;
                    if (viewGroup == null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = viewGroup.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.i6) {
                                ((org.telegram.ui.Cells.i6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                                ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.za) {
                                ((org.telegram.ui.Cells.za) childAt).j(0);
                            }
                        }
                    }
                    i10++;
                }
            } else {
                ty[] tyVarArr = uyVar.e0;
                if (tyVarArr == null) {
                    i10++;
                } else {
                    viewGroup = i10 < tyVarArr.length ? tyVarArr[i10].a : null;
                    if (viewGroup == null) {
                    }
                    i10++;
                }
            }
        }
        dy dyVar2 = uyVar.C0;
        if (dyVar2 != null && (jo0Var = dyVar2.d0) != null && (xb1Var = jo0Var.k0) != null) {
            int childCount2 = xb1Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = xb1Var.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt2;
                    org.telegram.ui.Components.h9 h9Var = n4Var.c;
                    int i13 = n4Var.h;
                    if (DialogObject.isUserDialog(n4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(n4Var.f));
                        n4Var.e = user;
                        h9Var.m(i13, user);
                    } else {
                        h9Var.k(i13, MessagesController.getInstance(i13).getChat(Long.valueOf(-n4Var.f)));
                        n4Var.e = null;
                    }
                    n4Var.c(true);
                }
            }
        }
        if (uyVar.e0 != null) {
            int i14 = 0;
            while (true) {
                ty[] tyVarArr2 = uyVar.e0;
                if (i14 >= tyVarArr2.length) {
                    break;
                }
                yw ywVar = tyVarArr2[i14].n;
                if (ywVar != null) {
                    ywVar.i();
                }
                i14++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = uyVar.actionBar;
        if (kVar != null) {
            kVar.B(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), true);
            uyVar.actionBar.C(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false, true);
            uyVar.actionBar.C(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true, true);
            uyVar.actionBar.D(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5), true);
            uyVar.actionBar.e();
        }
        if (uyVar.D3 != null) {
            uyVar.m5(UserConfig.getInstance(uyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.a3 a3Var = uyVar.M1;
        if (a3Var != null) {
            a3Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
        }
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.m0;
        if (v0Var != null) {
            v0Var.setIconColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.v8));
        }
        cx cxVar = uyVar.B1;
        if (cxVar != null) {
            cxVar.e();
        }
        ky kyVar = uyVar.z0;
        if (kyVar != null) {
            ch.d dVar = kyVar.y0;
            if (dVar != null) {
                dVar.k();
            }
            kyVar.invalidate();
        }
        gg.s0 s0Var = uyVar.b0;
        if (s0Var != null) {
            s0Var.C1();
        }
        dy dyVar3 = uyVar.C0;
        if (dyVar3 != null) {
            SparseArray sparseArray = dyVar3.h;
            for (int i15 = 0; i15 < dyVar3.getChildCount(); i15++) {
                if (dyVar3.getChildAt(i15) instanceof x10) {
                    ai.w0 w0Var = ((x10) dyVar3.getChildAt(i15)).b;
                    int childCount3 = w0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt3 = w0Var.getChildAt(i16);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
            }
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                View view = (View) sparseArray.valueAt(i17);
                if (view instanceof x10) {
                    ai.w0 w0Var2 = ((x10) view).b;
                    int childCount4 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = w0Var2.getChildAt(i18);
                        if (childAt4 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt4).b0(0, true);
                        }
                    }
                }
            }
            x10 x10Var = dyVar3.O0;
            if (x10Var != null) {
                ai.w0 w0Var3 = x10Var.b;
                int childCount5 = w0Var3.getChildCount();
                for (int i19 = 0; i19 < childCount5; i19++) {
                    View childAt5 = w0Var3.getChildAt(i19);
                    if (childAt5 instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt5).b0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.lh0 lh0Var = dyVar3.r0;
            if (lh0Var != null) {
                lh0Var.c();
            }
        }
        org.telegram.ui.Components.g91 g91Var = uyVar.a0;
        if (g91Var != null) {
            ai.w0 w0Var4 = g91Var.v;
            ch.d dVar2 = g91Var.r0;
            if (dVar2 != null) {
                dVar2.k();
            }
            g91Var.O.setColor(org.telegram.ui.ActionBar.i6.v0(g91Var.P, g91Var.j0));
            w0Var4.g1();
            w0Var4.invalidate();
            g91Var.invalidate();
        }
        n41 n41Var = uyVar.Z;
        if (n41Var != null) {
            n41Var.e();
        }
        ci.ab abVar = uyVar.K0;
        if (abVar != null && Build.VERSION.SDK_INT >= 23) {
            abVar.setForeground(new ColorDrawable(i0.a.k(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6), 100)));
        }
        org.telegram.ui.Components.c20 c20Var = uyVar.t0;
        if (c20Var != null) {
            c20Var.g();
        }
        org.telegram.ui.Components.c20 c20Var2 = uyVar.u0;
        if (c20Var2 != null) {
            c20Var2.g();
        }
        fh.c cVar = uyVar.m4;
        int i20 = org.telegram.ui.ActionBar.i6.d6;
        cVar.a(uyVar.getThemedColor(i20));
        org.telegram.ui.Components.ns nsVar = uyVar.J1;
        if (nsVar != null) {
            ch.d dVar3 = nsVar.s;
            if (dVar3 != null) {
                dVar3.k();
            }
            nsVar.invalidate();
        }
        org.telegram.ui.Components.ms msVar = uyVar.K1;
        if (msVar != null) {
            msVar.setColor(org.telegram.ui.ActionBar.i6.w0(null, i20, false));
        }
        ax axVar = uyVar.H1;
        if (axVar != null) {
            axVar.q();
        }
        ax axVar2 = uyVar.F1;
        if (axVar2 != null) {
            axVar2.q();
        }
        uyVar.M4(uyVar.x1);
        jx jxVar = uyVar.E0;
        if (jxVar != null) {
            jxVar.o();
        }
        Drawable drawable = uyVar.C3;
        if (drawable != null) {
            drawable.setColorFilter(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = uyVar.g1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.MULTIPLY));
            uyVar.g1.setBackground(org.telegram.ui.ActionBar.i6.f0(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.z8), 1, -1));
        }
        iy iyVar = uyVar.X;
        if (iyVar != null) {
            iyVar.e();
        }
    }

    public static void I0(uy uyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            tg.m1.e0(0, birthdayState);
            return;
        }
        xh.q1 q1Var = new xh.q1(uyVar.getParentActivity(), uyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        q1Var.T(true);
        uyVar.showDialog(q1Var);
    }

    public static void J0(uy uyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.rc M = org.telegram.ui.Components.yc.a0(uyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
            uyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.q.p(R.string.UnknownError, org.telegram.ui.Components.yc.a0(uyVar), R.raw.error, 36);
            return;
        }
        if (uyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity(), 0, uyVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            uyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void K0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        uyVar.d5();
    }

    public static /* synthetic */ void S(uy uyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        uyVar.d5();
    }

    public static /* synthetic */ void T(uy uyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uyVar.t3 = floatValue;
        uyVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < uyVar.actionBar.getChildCount(); i10++) {
            if (uyVar.actionBar.getChildAt(i10).getVisibility() == 0 && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getActionMode() && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getBackButton()) {
                uyVar.actionBar.getChildAt(i10).setAlpha(1.0f - uyVar.t3);
            }
        }
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        uyVar.N3();
        uyVar.F3();
    }

    public static void W(uy uyVar) {
        ArrayList arrayList = uyVar.I2;
        org.telegram.ui.ActionBar.c5 c5Var = uyVar.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).y()) {
            uyVar.finishPreviewFragment();
            return;
        }
        if (uyVar.R0 != 10) {
            if (MessagesController.getInstance(uyVar.currentAccount).isFrozen()) {
                b.b(uyVar.currentAccount);
                return;
            } else {
                uyVar.presentFragment(new ContactsActivity(a4.a.i("destroyAfterSelect", true)));
                return;
            }
        }
        if (uyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        uyVar.C2.u(uyVar, arrayList2, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
    }

    public static /* synthetic */ void X(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        uyVar.d5();
    }

    public static void X2(uy uyVar, float f7) {
        float f10;
        float f11;
        float clamp = Utilities.clamp(uyVar.x1 * 2.0f, 1.0f, 0.0f);
        jx jxVar = uyVar.E0;
        float f12 = (1.0f - uyVar.t3) * f7 * uyVar.H0;
        float f13 = 1.0f - clamp;
        jxVar.setAlpha(f12 * f13);
        if (uyVar.K || uyVar.M) {
            float clamp2 = Utilities.clamp((-uyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (uyVar.t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            uyVar.E0.setClipTop(0);
            if (uyVar.K || !uyVar.M) {
                uyVar.E0.setTranslationY(((uyVar.T / 2.0f) + (Math.max(uyVar.N, -uyVar.d4()) + uyVar.v3)) - AndroidUtilities.dp(8.0f));
                uyVar.E0.l(clamp2, !uyVar.F3.c());
                if (uyVar.M) {
                    f10 = 1.0f - clamp3;
                    uyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = uyVar.H0;
                }
            } else {
                uyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                uyVar.E0.setProgressToCollapse(1.0f);
                f11 = uyVar.H0;
            }
            f10 = 1.0f - f11;
            uyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (uyVar.L) {
                uyVar.E0.setTranslationY((Math.max(uyVar.N, -uyVar.d4()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                uyVar.E0.setProgressToCollapse(1.0f);
                jx jxVar2 = uyVar.E0;
                jxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - jxVar2.getY()));
            }
            f10 = 1.0f - uyVar.H0;
            uyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            uyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            uyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - uyVar.t3;
            uyVar.actionBar.getTitlesContainer().setAlpha(f15);
            uyVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        uyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        uyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        uyVar.actionBar.getTitlesContainer().setScaleY(f16);
        uyVar.actionBar.getTitlesContainer().setScaleX(f16);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - uyVar.t3) * f14;
        uyVar.actionBar.getTitlesContainer().setAlpha(f17);
        uyVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void Y(uy uyVar) {
        PasskeysActivity.Z(uyVar.currentAccount, uyVar.getParentActivity(), uyVar.resourceProvider, true);
    }

    public static void Y2(uy uyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        if (uyVar.parentLayout == null || uyVar.actionBar == null) {
            return;
        }
        float max = Math.max(uyVar.e.e, uyVar.e4());
        float f7 = 1.0f;
        float f10 = 1.0f - uyVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            i10 = -1;
            f7 = 0.0f;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (c5Var = uyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) c5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static void Z(uy uyVar, int i10, org.telegram.ui.Components.b80 b80Var) {
        if (uyVar.currentAccount == i10) {
            return;
        }
        b80Var.u();
        if (uyVar.getParentActivity() == null) {
            return;
        }
        oy oyVar = uyVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) uyVar.getParentActivity();
        ArrayList arrayList = uyVar.D2;
        String str = uyVar.E2;
        CharSequence charSequence = uyVar.F2;
        cx cxVar = uyVar.B1;
        CharSequence fieldText = cxVar != null ? cxVar.getFieldText() : null;
        launchActivity.K0(i10);
        uy uyVar2 = new uy(uyVar.arguments);
        uyVar2.C2 = oyVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                uyVar2.N4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    uyVar2.F2 = null;
                } else {
                    uyVar2.F2 = charSequence;
                    uyVar2.E2 = null;
                    uyVar2.D2 = null;
                    if (uyVar2.B1 != null) {
                        uyVar2.v3(fieldText);
                    } else {
                        uyVar2.U3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            uyVar2.D2 = null;
        } else {
            uyVar2.D2 = arrayList;
            uyVar2.E2 = null;
            if (uyVar2.B1 != null) {
                uyVar2.v3(fieldText);
            } else {
                uyVar2.U3 = fieldText;
            }
        }
        launchActivity.q0(uyVar2, false, true);
    }

    public static org.telegram.ui.Cells.s2 Z3(ty tyVar) {
        qy qyVar = tyVar.a;
        for (int i10 = 0; i10 < qyVar.getChildCount(); i10++) {
            View childAt = qyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var.N()) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void b0(uy uyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(uyVar.currentAccount).getClientUserId());
        uyVar.presentFragment(new yn(bundle));
    }

    public static /* synthetic */ void c0(uy uyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = uyVar.getMessagesController().getUserFull(uyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        uyVar.getMessagesController().invalidateContentSettings();
        uyVar.getConnectionsManager().sendRequest(updatebirthday, new ca(uyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        uyVar.d5();
    }

    public static /* synthetic */ void d0(uy uyVar, String str) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, str);
        uyVar.d5();
    }

    public static void e0(uy uyVar, ty tyVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.n2) {
                uyVar.W4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (uyVar.R3()) {
            uyVar.x4(view, i10, 0.0f, tyVar.d);
            return;
        }
        int i12 = uyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            tyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a4.a.i("forImport", true);
            i14.putLongArray("result", new long[]{uyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = uyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            k70 k70Var = new k70(i14);
            k70Var.Y = new ww(uyVar);
            uyVar.presentFragment(k70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = tyVar.s) == 7 || i11 == 8)) {
            gg.k kVar = (gg.k) tyVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = uyVar.getMessagesController().selectedDialogFilter[tyVar.s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.id;
                    org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(uyVar, false);
                    f10Var.Y = -1;
                    f10Var.c0 = "";
                    f10Var.d0 = new ArrayList();
                    f10Var.f0 = "";
                    f10Var.h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    f10Var.i0 = arrayList;
                    f10Var.z0 = -1;
                    f10Var.C0 = -5;
                    f10Var.Y = i15;
                    f10Var.a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    f10Var.g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = uyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i15) {
                                f10Var.c0 = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    f10Var.Q();
                    uyVar.showDialog(f10Var);
                    return;
                }
                return;
            }
        } else if (z10 && !uyVar.actionBar.s() && !uyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        uyVar.w4(view, i10, tyVar.d);
    }

    public static /* synthetic */ void f0(uy uyVar) {
        uyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(uyVar.parentLayout, "newChatsRow");
    }

    public static void h0(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (uyVar.getParentActivity() == null) {
            return;
        }
        uyVar.t2 = false;
        if (z10 || z11 || z12) {
            uyVar.A0 = true;
            if (z10 && dk0.n(activity)) {
                org.telegram.ui.Components.pe0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.gn(1, new ft(2, uyVar, activity)));
                return;
            }
            if (z11 && uyVar.U1 && uyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.w(activity, new zv(uyVar, 0)).a;
                uyVar.T1 = b2Var;
                uyVar.showDialog(b2Var);
            } else if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                uyVar.u3(true);
            } else if (activity instanceof i5) {
                org.telegram.ui.ActionBar.b2 w10 = ((i5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                uyVar.T1 = w10;
                uyVar.showDialog(w10);
            }
        }
    }

    public static /* synthetic */ void i0(uy uyVar) {
        if (uyVar.a4.h()) {
            MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            uyVar.d5();
        }
    }

    public static void j1(uy uyVar, boolean z10) {
        if (uyVar.e0 == null || uyVar.M3 == z10) {
            return;
        }
        uyVar.M3 = z10;
        int i10 = 0;
        while (true) {
            ty[] tyVarArr = uyVar.e0;
            if (i10 >= tyVarArr.length) {
                return;
            }
            if (z10) {
                tyVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            uyVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                uyVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static /* synthetic */ void k0(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(uyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(uyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ca(uyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static /* synthetic */ void l0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        uyVar.d5();
    }

    public static /* synthetic */ void m0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        uyVar.d5();
    }

    public static void m4(yn ynVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.d6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.h10[] h10VarArr = (org.telegram.ui.Components.h10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.h10.class);
                if (h10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(h10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(h10VarArr[0]);
                    for (int i10 = 1; i10 < h10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(h10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(h10VarArr[i10]);
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
                    ynVar.lb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void n0(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        ai.j jVar;
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.e5.f0(uyVar.currentAccount, tL_error, uyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        uyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        ai.j jVar2 = new ai.j(uyVar, j3, 23);
        Pattern pattern = org.telegram.ui.Components.e5.a;
        if (uyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = uyVar.getCurrentAccount();
            Activity parentActivity = uyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            h9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                jVar = jVar2;
                h9Var.k(currentAccount, chat);
                w9Var.e(chat, h9Var);
            } else if (UserObject.isReplyUser(user)) {
                h9Var.p = 0.8f;
                h9Var.g(12);
                w9Var.h(null, null, h9Var, user);
                jVar = jVar2;
            } else {
                jVar = jVar2;
                if (user.id == clientUserId) {
                    h9Var.p = 0.8f;
                    h9Var.g(1);
                    w9Var.h(null, null, h9Var, user);
                } else {
                    h9Var.p = 1.0f;
                    h9Var.m(currentAccount, user);
                    w9Var.e(user, h9Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(jVar, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            uyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void o0(uy uyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.eo0 eo0Var = uyVar.C0.q0;
        if (i10 < eo0Var.X || i10 >= eo0Var.Y) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.h61 G = eo0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity(), 0, uyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.w2(28, uyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void p0(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            uyVar.A4(arrayList, i10, false, false, null);
            return;
        }
        uyVar.getMessagesController().setDialogsInTransaction(true);
        uyVar.A4(arrayList, i10, false, false, z10 ? hashSet : null);
        uyVar.getMessagesController().setDialogsInTransaction(false);
        uyVar.getMessagesController().checkIfFolderEmpty(uyVar.V2);
        int i11 = uyVar.V2;
        if (i11 == 0 || uyVar.a4(uyVar.currentAccount, uyVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        uyVar.e0[0].a.setEmptyView(null);
        uyVar.e0[0].w.setVisibility(4);
        uyVar.finishFragment();
    }

    public static /* synthetic */ void r0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, uyVar.A3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        uyVar.d5();
    }

    public static void r4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = w4;
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
        AndroidUtilities.runOnUIThread(new bj(accountInstance, 18), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void s0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.pe0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.pe0.h();
            }
        }
    }

    public static void t0(uy uyVar) {
        b.c(uyVar.getParentActivity(), uyVar.currentAccount, uyVar.getResourceProvider());
    }

    public static void u0(final int i10, final long j3, TLRPC.Chat chat, final uy uyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        uyVar.k4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                uyVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = uyVar.V2) != 0 && uyVar.a4(uyVar.currentAccount, uyVar.e0[0].s, i13, false).size() == 1) {
            uyVar.e0[0].w.setVisibility(4);
        }
        uyVar.y3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            uyVar.J4(true, true);
            if (uyVar.R1 != null) {
                i12 = 0;
                while (i12 < uyVar.R1.size()) {
                    if (((TLRPC.Dialog) uyVar.R1.get(i12)).id == j3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            uyVar.x3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView h42 = uyVar.h4();
        if (h42 != null) {
            h42.j(i10 == 103 ? 0 : z11 ? 1 : 95, j3, new Runnable() { // from class: org.telegram.ui.dw
                @Override // java.lang.Runnable
                public final void run() {
                    uyVar.z4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(uyVar.a4(uyVar.currentAccount, uyVar.e0[0].s, uyVar.V2, false));
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
            if (i11 < 0 || i14 >= 0 || (arrayList = uyVar.R1) == null) {
                uyVar.J4(false, true);
                return;
            }
            arrayList.remove(i11);
            uyVar.e0[0].x.D();
            uyVar.e0[0].q(true);
        }
    }

    public static void u1(uy uyVar, ty tyVar, float f7) {
        if (uyVar.T == f7) {
            return;
        }
        uyVar.T = f7;
        if (f7 == 0.0f) {
            uyVar.U = false;
        }
        uyVar.E0.setOverscroll(f7);
        tyVar.a.setViewsOffset(f7);
        tyVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        uyVar.fragmentView.invalidate();
        if (f7 <= AndroidUtilities.dp(90.0f) || uyVar.U) {
            return;
        }
        jx jxVar = uyVar.E0;
        ValueAnimator valueAnimator = jxVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            jxVar.i(jxVar.p0, true);
            uyVar.U = true;
            uyVar.getOrCreateStoryViewer().s(new pv(uyVar, 16));
        }
    }

    public static void v0(uy uyVar) {
        BirthdayController.getInstance(uyVar.currentAccount).hide();
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        uyVar.d5();
        org.telegram.ui.Components.rc G = org.telegram.ui.Components.yc.a0(uyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static boolean v1(uy uyVar, ty tyVar) {
        if (uyVar.F3.c()) {
            return false;
        }
        int i10 = (int) (-uyVar.N);
        int c42 = uyVar.c4();
        int d42 = uyVar.d4();
        if (i10 == 0 || i10 == c42 || i10 == d42 || !tyVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (d42 >= i10 || i10 >= c42) {
            if ((uyVar.t3 != 1.0f ? Utilities.clamp((-uyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < uyVar.E0.B0) {
                tyVar.b.v(-i10);
                return true;
            }
            tyVar.b.v(d42 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - d42;
        if (i11 < dp / 2) {
            tyVar.b.v(-i11);
            return true;
        }
        tyVar.b.v(dp - i11);
        return true;
    }

    public static void w0(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            cj1.a(uyVar.getParentActivity(), new z(uyVar, tL_attachMenuBot, launchActivity, 8), null);
        } else {
            LaunchActivity.C0(launchActivity, uyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static String w2(uy uyVar) {
        ArrayList arrayList = uyVar.I2;
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
            if (longValue == uyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(uyVar.currentAccount, longValue) : DialogObject.getShortName(uyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static /* synthetic */ void x0(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, uyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(uyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void y0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        uyVar.d5();
    }

    public static void z0(uy uyVar) {
        if (uyVar.N3) {
            ci.e4 e4Var = uyVar.p0;
            if (e4Var != null) {
                e4Var.e(true);
            }
            ai.f9 o9 = MessagesController.getInstance(uyVar.currentAccount).getStoriesController().o();
            if (o9 != null && o9.a(uyVar.currentAccount, 1)) {
                uyVar.showDialog(new rg.k0(o9.b(), uyVar.currentAccount, uyVar.getParentActivity(), uyVar, null));
                return;
            } else {
                ci.kc E = ci.kc.E(uyVar.getParentActivity(), uyVar.currentAccount);
                E.x = new cy(uyVar);
                E.R(null);
                return;
            }
        }
        ci.e4 e4Var2 = uyVar.q0;
        if (e4Var2 != null) {
            if (e4Var2.V) {
                return;
            } else {
                AndroidUtilities.removeFromParent(e4Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.i6.Gi, 0, new jw(uyVar, 7));
        ci.e4 e4Var3 = new ci.e4(uyVar.getParentActivity(), 2);
        e4Var3.q(8.0f);
        e4Var3.d = 8000L;
        e4Var3.i();
        e4Var3.p(true);
        e4Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        e4Var3.s(replaceSingleTag);
        e4Var3.l(1.0f, -40.0f);
        e4Var3.h(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        uyVar.q0 = e4Var3;
        e4Var3.setTranslationY((-uyVar.f4) - uyVar.h4);
        ((ViewGroup) uyVar.fragmentView).addView(uyVar.q0, w7.z5.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        uyVar.q0.u();
    }

    public final void A3(ty tyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = tyVar.c.L0();
        int N0 = tyVar.c.N0();
        if (this.g3 || this.l3) {
            return;
        }
        ky kyVar = this.z0;
        if (kyVar != null && kyVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.c1 K = tyVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                l4(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = tyVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = tyVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(tyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= a4(this.currentAccount, tyVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                    z10 = z15;
                    z11 = false;
                } else {
                    z10 = z15;
                    z11 = true;
                }
                if ((abs > 0 || N0 < a4(this.currentAccount, tyVar.s, this.V2, this.S1).size() - 10) && (abs != 0 || (!((i10 = tyVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.V2)))) {
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
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kw
                        @Override // java.lang.Runnable
                        public final void run() {
                            uy uyVar = uy.this;
                            if (z12) {
                                uyVar.getMessagesController().loadDialogs(uyVar.V2, -1, 100, z13);
                            }
                            if (z11) {
                                uyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                            } else {
                                uyVar.getClass();
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kw
            @Override // java.lang.Runnable
            public final void run() {
                uy uyVar = uy.this;
                if (z12) {
                    uyVar.getMessagesController().loadDialogs(uyVar.V2, -1, 100, z13);
                }
                if (z11) {
                    uyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                } else {
                    uyVar.getClass();
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
    public final void A4(java.util.ArrayList r40, int r41, boolean r42, boolean r43, java.util.HashSet r44) {
        /*
            Method dump skipped, instructions count: 2785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.A4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void B3() {
        if (this.e0 == null) {
            return;
        }
        int w32 = w3();
        int i10 = 0;
        while (true) {
            ty[] tyVarArr = this.e0;
            if (i10 >= tyVarArr.length) {
                return;
            }
            ty tyVar = tyVarArr[i10];
            if (tyVar != null) {
                qy qyVar = tyVar.a;
                qyVar.setPadding(0, qyVar.f3, 0, w32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B4(long j3, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        int i11;
        boolean z12;
        boolean pinDialog;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && i4() && this.e0[0].v == 2) ? 1 : 0;
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
            J4(true, true);
            x3();
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
                    l4(false);
                }
                G4(true, false);
            } else {
                ArrayList a42 = a4(this.currentAccount, this.e0[0].s, this.V2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= a42.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) a42.get(i16)).id == j3) {
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
                ty tyVar = this.e0[0];
                tyVar.c.h1((tyVar.s == 0 && i4() && this.e0[0].v == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new pv(this, 22), 200L);
            }
            z13 = true;
            if (z13) {
                J4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    public final void C3() {
        hh.g gVar = this.y1;
        if (gVar != null) {
            gVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void C4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        K3();
    }

    public final void D3() {
        ty tyVar;
        float b42 = b4(true);
        ky kyVar = this.z0;
        if (kyVar != null) {
            boolean z10 = kyVar.getAlpha() != b42;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, b42);
            this.z0.setAlpha(b42);
            this.z0.setScaleX(lerp);
            this.z0.setScaleY(lerp);
            this.z0.setVisibility(b42 > 0.0f ? 0 : 8);
            if (z10 && (tyVar = this.e0[0]) != null) {
                tyVar.a.requestLayout();
            }
        }
        b5();
    }

    public final void D4(ty tyVar) {
        int i10;
        if (tyVar.getVisibility() != 0) {
            return;
        }
        int i11 = tyVar.d.v;
        if (tyVar.s == 0 && i4() && tyVar.a.getChildCount() == 0 && tyVar.v == 2) {
            ((s4.c0) tyVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        tyVar.d.getClass();
        tyVar.d.U();
        int h = tyVar.d.h();
        if (h == 1 && i11 == 1 && tyVar.d.j(0) == 5) {
            tyVar.q(true);
        } else {
            tyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                tyVar.y.b(i11);
            }
        }
        try {
            tyVar.a.setEmptyView((this.V2 == 0 && this.X2 == 0) ? tyVar.w : null);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        A3(tyVar);
    }

    public final void E3() {
        float f7 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ii.z1 z1Var = this.C1;
        if (z1Var != null) {
            z1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        hh.g gVar = this.y1;
        if (gVar != null) {
            gVar.setAlpha(f7);
            this.y1.setVisibility(f7 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f7);
            this.y1.getFadeView().setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void E4() {
        boolean z10;
        if (this.N == 0.0f || (z10 = this.K)) {
            return;
        }
        float f7 = z10 ? -d4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
        animatorSet.setInterpolator(org.telegram.ui.Components.tr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void F3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float e42 = 1.0f - e4();
        org.telegram.ui.Components.c20.d(this.actionBar.getBackButton(), Math.max(this.t3, f7 * e42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F4(int i10) {
        org.telegram.ui.Components.j00 j00Var;
        if (this.z0 == null) {
            e5(true, true);
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
        ky kyVar = this.z0;
        if (tabsCount < 0) {
            kyVar.getClass();
        } else if (tabsCount < kyVar.getTabsCount()) {
            j00Var = (org.telegram.ui.Components.j00) kyVar.h.get(tabsCount);
            if (j00Var != null) {
                ky kyVar2 = this.z0;
                ArrayList arrayList = kyVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                kyVar2.f((org.telegram.ui.Components.j00) hg.c.g(1, arrayList), arrayList.size() - 1);
                return;
            }
            ty[] tyVarArr = this.e0;
            if (tyVarArr == null || tyVarArr.length <= 0 || tyVarArr[0].h != j00Var.a) {
                this.z0.f(j00Var, tabsCount);
                return;
            }
            return;
        }
        j00Var = null;
        if (j00Var != null) {
        }
    }

    public final void G3() {
        org.telegram.ui.Components.c20.d(this.g0, com.google.android.gms.internal.vision.e2.C(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - e4(), 1.0f - this.c.e));
    }

    public final void G4(boolean z10, boolean z11) {
        mx mxVar = this.F3;
        if (mxVar == null || !mxVar.c()) {
            int i10 = (this.e0[0].s == 0 && i4() && this.e0[0].v == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                E4();
            } else {
                org.telegram.ui.Components.bl0 bl0Var = this.e0[0].r;
                bl0Var.b = 1;
                bl0Var.d(i10, i11, false, false);
                E4();
            }
        }
    }

    public final void H3() {
        org.telegram.ui.Components.c20.d(this.f0, com.google.android.gms.internal.vision.e2.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - e4(), 1.0f - this.c.e));
    }

    public final void H4(String str, boolean z10) {
        X4(true, false, true, false);
        iy iyVar = this.X;
        if (iyVar != null) {
            iyVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void I3() {
        org.telegram.ui.Components.c20.d(this.j0, com.google.android.gms.internal.vision.e2.C(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - e4(), 1.0f - this.c.e));
        jx jxVar = this.E0;
        if (jxVar != null) {
            jxVar.invalidate();
        }
    }

    public final void I4(float f7) {
        this.c0 = f7;
        for (ty tyVar : this.e0) {
            qy qyVar = tyVar.a;
            for (int i10 = 0; i10 < qyVar.getChildCount(); i10++) {
                View childAt = qyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= tyVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void J3() {
        org.telegram.ui.Components.c20.d(this.l0, com.google.android.gms.internal.vision.e2.C(this.b.e, 1.0f - e4(), 1.0f - this.c.e, this.d.e));
    }

    public final void J4(boolean z10, boolean z11) {
        if (this.e0 == null || this.S1 == z10) {
            return;
        }
        if (z10) {
            this.R1 = new ArrayList(a4(this.currentAccount, this.e0[0].s, this.V2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z10;
        ty tyVar = this.e0[0];
        tyVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (tyVar.a.c0()) {
            this.e0[0].a.post(new jw(this, 8));
        } else {
            this.e0[0].d.l();
        }
    }

    public final void K3() {
        ci.ab abVar;
        boolean z10 = !this.j2 && ((abVar = this.K0) == null || abVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        zg0 zg0Var = this.I3;
        if (zg0Var != null) {
            zg0Var.a.v.a(z10, true);
        }
    }

    public final void K4(boolean z10) {
        ty tyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            ty[] tyVarArr = this.e0;
            if (tyVarArr != null && (tyVar = tyVarArr[0]) != null) {
                tyVar.setLayerType(2, null);
                this.e0[0].setClipChildren(false);
                this.e0[0].setClipToPadding(false);
                this.e0[0].a.setClipChildren(false);
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setLayerType(2, null);
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
                ty[] tyVarArr2 = this.e0;
                if (i10 >= tyVarArr2.length) {
                    break;
                }
                ty tyVar2 = tyVarArr2[i10];
                if (tyVar2 != null) {
                    tyVar2.setLayerType(0, null);
                    tyVar2.setClipChildren(true);
                    tyVar2.setClipToPadding(true);
                    tyVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        jx jxVar = this.E0;
        if (jxVar != null) {
            jxVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void L3() {
        F3();
        org.telegram.ui.Components.c20.d(this.k0, (1.0f - this.b.e) * (1.0f - e4()) * (1.0f - this.c.e));
        G3();
        J3();
        H3();
        I3();
    }

    public final void L4(float f7) {
        ty[] tyVarArr = this.e0;
        if (tyVarArr != null) {
            int paddingTop = tyVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                ty[] tyVarArr2 = this.e0;
                if (i10 >= tyVarArr2.length) {
                    break;
                }
                tyVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f7 == this.N) {
            return;
        }
        this.N = f7;
        org.telegram.ui.Components.rc rcVar = this.n3;
        if (rcVar != null) {
            rcVar.l();
        }
        if (this.E3 != null) {
            float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.E3;
            float f10 = (int) f7;
            float f11 = oVar.f;
            oVar.h = f10;
            oVar.setTranslationY(f11 + f10);
            this.E3.setAlpha(w7.q.a(currentActionBarHeight, 0.0f, 1.0f));
            this.E3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        N3();
        this.fragmentView.invalidate();
    }

    public final void M3() {
        String string = LocaleController.getString(e4() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.X.r.setContentDescription(string);
        this.X.r.setHint(string);
    }

    public final void M4(float f7) {
        this.x1 = f7;
        if (this.r3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.i6.v8 : org.telegram.ui.ActionBar.i6.O8);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.i6.y8;
            kVar.A(i0.a.d(this.x1, themedColor, getThemedColor(i10)), false);
            this.actionBar.A(i0.a.d(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
            this.actionBar.z(i0.a.d(this.x1, getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.i6.t8 : org.telegram.ui.ActionBar.i6.N8), getThemedColor(org.telegram.ui.ActionBar.i6.z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        b5();
    }

    public final void N3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.q.a(((-this.N) - d4()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.t3, this.h.e)) * Math.max(this.b.e, (1.0f - e4()) * a2);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void N4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.E2 = null;
            this.F2 = null;
            return;
        }
        this.E2 = str;
        this.F2 = null;
        this.D2 = null;
        if (this.B1 != null) {
            v3(charSequence);
        } else {
            this.U3 = charSequence;
        }
    }

    public final void O3() {
        if (this.Z != null) {
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f7);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.g91 g91Var = this.a0;
        le.b bVar = this.s;
        if (g91Var != null) {
            float f10 = 1.0f - bVar.e;
            g91Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        gg.s0 s0Var = this.b0;
        if (s0Var != null) {
            float f11 = bVar.e;
            s0Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void O4(float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.W3 != f7) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.X3 = z10;
            this.W3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.X3) {
                float f10 = (1.0f - this.W3) * (-AndroidUtilities.dp(40.0f));
                jx jxVar = this.E0;
                if (jxVar != null) {
                    jxVar.setTranslationX(f10);
                }
                iy iyVar = this.X;
                if (iyVar != null) {
                    iyVar.setTranslationX(f10);
                }
                mx mxVar = this.F3;
                if (mxVar == null || mxVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.F3.getFragmentView().setTranslationX(f10);
                return;
            }
            float f11 = -AndroidUtilities.dp(4.0f);
            float f12 = 1.0f - this.W3;
            float f13 = f11 * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            jx jxVar2 = this.E0;
            if (jxVar2 != null) {
                jxVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            iy iyVar2 = this.X;
            if (iyVar2 != null) {
                iyVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            mx mxVar2 = this.F3;
            if (mxVar2 == null || mxVar2.getFragmentView() == null) {
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

    public final void P3(boolean z10) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.a0 != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.ns nsVar = this.J1;
        int c10 = measuredHeight + (nsVar != null ? (int) nsVar.c(AndroidUtilities.dp(7.0f)) : 0);
        dy dyVar = this.C0;
        SparseArray sparseArray = dyVar.h;
        dyVar.W0 = c10;
        dyVar.X0 = i10;
        ai.w0 w0Var = dyVar.a0;
        if (z10) {
            w0Var.q1(0, c10, 0, i10);
        } else {
            w0Var.setPadding(0, c10, 0, i10);
        }
        dyVar.O0.j(dyVar.W0, dyVar.X0, z10);
        org.telegram.ui.Components.do0 do0Var = dyVar.b0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) do0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = dyVar.W0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != dyVar.X0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = dyVar.X0;
            do0Var.requestLayout();
        }
        org.telegram.ui.Components.qo0.R(dyVar.h0, dyVar.k0, dyVar.W0, dyVar.X0, z10);
        org.telegram.ui.Components.qo0.R(dyVar.m0, dyVar.p0, dyVar.W0, dyVar.X0, z10);
        org.telegram.ui.Components.qo0.R(dyVar.t0, dyVar.w0, dyVar.W0, dyVar.X0, z10);
        org.telegram.ui.Components.lh0 lh0Var = dyVar.r0;
        int i13 = dyVar.W0;
        int i14 = dyVar.X0;
        lh0Var.setClipToPadding(false);
        lh0Var.J = z10;
        lh0Var.setPadding(0, i13, 0, i14);
        org.telegram.ui.Components.e71 e71Var = lh0Var.c;
        if (z10) {
            e71Var.q1(0, i13, 0, i14);
        } else {
            e71Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e71Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        lh0Var.J = false;
        org.telegram.ui.Components.on0 on0Var = dyVar.I0;
        if (on0Var != null) {
            on0Var.b(dyVar.W0, dyVar.X0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof x10) {
                ((x10) view).j(dyVar.W0, dyVar.X0, z10);
            }
        }
        for (int i16 = 0; i16 < dyVar.getChildCount(); i16++) {
            if (dyVar.getChildAt(i16) instanceof x10) {
                ((x10) dyVar.getChildAt(i16)).j(dyVar.W0, dyVar.X0, z10);
            }
        }
    }

    public final void P4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.v6 v6Var = new org.telegram.ui.Components.v6(getParentActivity(), this.currentAccount, getResourceProvider(), new cu(3, this, r0), new bj(r0, 17));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(v6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.bh0
    public final boolean Q(MotionEvent motionEvent, boolean z10) {
        mx mxVar;
        ci.ab abVar;
        ky kyVar;
        if (!this.p3 && (((mxVar = this.F3) == null || !mxVar.c()) && (((abVar = this.K0) == null || abVar.getVisibility() != 0) && ((kyVar = this.z0) == null || !kyVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ky kyVar2 = this.z0;
                boolean z11 = kyVar2 == null || kyVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                ky kyVar3 = this.z0;
                boolean z12 = kyVar3 == null || kyVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
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

    public final void Q3() {
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
    public final boolean Q4(org.telegram.ui.Cells.s2 s2Var) {
        long j3;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j10;
        int i10;
        LinearLayout linearLayout;
        uy uyVar;
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
        org.telegram.ui.ActionBar.f1 f1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        final uy uyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(s2Var.g2);
        boolean z11 = false;
        if (s2Var.M()) {
            if (s2Var.getCurrentDialogFolderId() != 1) {
                return false;
            }
            v4(s2Var);
            return false;
        }
        long dialogId = s2Var.getDialogId();
        Bundle bundle = new Bundle();
        int messageId = s2Var.getMessageId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            return false;
        }
        if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            if (uyVar2.X2 != 0 && ((b10 = fi.u0.b(uyVar2.currentAccount, dialogId)) == 4 || b10 == 3)) {
                return false;
            }
            TLRPC.Chat chat = uyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
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
        boolean z12 = uyVar2.X2 == 0 && uyVar2.getMessagesController().filtersEnabled && uyVar2.getMessagesController().dialogFiltersLoaded && uyVar2.getMessagesController().dialogFilters != null && uyVar2.getMessagesController().dialogFilters.size() > 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
        if (z12) {
            LinearLayout linearLayout2 = new LinearLayout(uyVar2.getParentActivity());
            linearLayout2.setOrientation(1);
            ux uxVar = new ux(uyVar2.getParentActivity(), 0);
            LinearLayout linearLayout3 = new LinearLayout(uyVar2.getParentActivity());
            linearLayout3.setOrientation(1);
            uxVar.addView(linearLayout3);
            int size = uyVar2.getMessagesController().dialogFilters.size();
            int i18 = 0;
            org.telegram.ui.ActionBar.f1 f1Var2 = null;
            while (i18 < size) {
                final MessagesController.DialogFilter dialogFilter2 = uyVar2.getMessagesController().dialogFilters.get(i18);
                if (dialogFilter2.isDefault()) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j13 = dialogId;
                } else {
                    final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(uyVar2.currentAccount), dialogId);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i15 = i18;
                    i16 = size;
                    j13 = dialogId;
                    final ArrayList G = org.telegram.ui.Components.q00.G(uyVar2, dialogFilter2, arrayList, true, z11);
                    if (!includesDialog) {
                    }
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, uyVar2.getParentActivity(), null, false, false);
                    f1Var3.setChecked(includesDialog);
                    i17 = i16;
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, f1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, f1Var3.getTextView().getPaint().getFontMetricsInt());
                    f1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                    f1Var3.g(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.g10(uyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                    f1Var3.getTextView().setEmojiColor(uyVar2.getThemedColor(org.telegram.ui.ActionBar.i6.Oh));
                    f1Var3.setMinimumWidth(160);
                    f1Var = f1Var3;
                    j13 = j13;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                    f1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.lw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArrayList arrayList2;
                            long j14;
                            MessagesController.DialogFilter dialogFilter3;
                            uy uyVar3 = uy.this;
                            uyVar3.getClass();
                            boolean z13 = includesDialog;
                            ArrayList arrayList3 = G;
                            MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                            long j15 = j13;
                            if (z13) {
                                dialogFilter4.alwaysShow.remove(Long.valueOf(j15));
                                dialogFilter4.neverShow.add(Long.valueOf(j15));
                                f10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, uyVar3, null);
                                uyVar3.h4().k(j15, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
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
                                    f10.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, uyVar3, null);
                                }
                                uyVar3.h4().k(j14, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                            }
                            uyVar3.k4(true);
                            uyVar3.finishPreviewFragment();
                        }
                    });
                    linearLayout3.addView(f1Var);
                    uyVar2 = this;
                    dialogId = j13;
                    size = i17;
                    i18 = i15 + 1;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                    f1Var2 = f1Var;
                    z11 = false;
                }
                f1Var = f1Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                i17 = i16;
                uyVar2 = this;
                dialogId = j13;
                size = i17;
                i18 = i15 + 1;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                f1Var2 = f1Var;
                z11 = false;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j10 = dialogId;
            org.telegram.ui.ActionBar.f1 f1Var4 = f1Var2;
            i10 = 160;
            if (f1Var4 != null) {
                f1Var4.j(false, true);
            }
            if (linearLayout3.getChildCount() <= 0) {
                z12 = false;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            } else {
                View k1Var = new org.telegram.ui.ActionBar.k1(getParentActivity(), org.telegram.ui.ActionBar.i6.H8, getResourceProvider());
                k1Var.setTag(R.id.fit_width_tag, 1);
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
                f1Var5.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                f1Var5.setMinimumWidth(160);
                f1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                linearLayout2.addView(f1Var5);
                linearLayout2.addView(k1Var, w7.z5.n(-1, 8));
                linearLayout2.addView(uxVar);
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                linearLayout = linearLayout2;
            }
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j10 = dialogId;
            i10 = 160;
            linearLayout = null;
        }
        org.telegram.ui.ActionBar.n2[] n2VarArr = new org.telegram.ui.ActionBar.n2[1];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (z12) {
            int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
            org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            f1Var6.g(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
            f1Var6.setMinimumWidth(i10);
            f1Var6.setOnClickListener(new tv(2, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var6);
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new bu(n2VarArr, 5));
        }
        if (isCommunity) {
            uyVar = this;
            c10 = 0;
        } else {
            org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            if (s2Var.getHasUnread()) {
                f1Var7.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            } else {
                f1Var7.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
            }
            f1Var7.setMinimumWidth(i10);
            long j14 = j10;
            uy uyVar3 = this;
            j10 = j14;
            f1Var7.setOnClickListener(new eo(uyVar3, s2Var, j14, 4));
            c10 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var7);
            uyVar = uyVar3;
        }
        boolean[] zArr3 = new boolean[1];
        zArr3[c10] = true;
        TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(j10);
        int i19 = uyVar.e0[c10].s;
        boolean z13 = (i19 == 7 || i19 == 8) && (!uyVar.actionBar.s() || uyVar.actionBar.t(null));
        if (z13) {
            zArr = zArr3;
            dialogFilter = uyVar.getMessagesController().selectedDialogFilter[uyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
        } else {
            zArr = zArr3;
            dialogFilter = null;
        }
        if (uyVar.p4(dialog)) {
            zArr2 = zArr;
            j11 = j10;
            r42 = 0;
        } else {
            ArrayList<TLRPC.Dialog> dialogs = uyVar.getMessagesController().getDialogs(uyVar.V2);
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
                } else if (uyVar.p4(dialog2)) {
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
                    if (!uyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                        break;
                    }
                }
                i20++;
                zArr = zArr2;
                j10 = j11;
                z13 = z10;
            }
            if (dialog == null || uyVar.p4(dialog)) {
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
            int size3 = (!z10 || dialogFilter == null) ? (uyVar.V2 == 0 && dialogFilter == null) ? uyVar.getUserConfig().isPremium() ? uyVar.getMessagesController().maxPinnedDialogsCountPremium : uyVar.getMessagesController().maxPinnedDialogsCountDefault : uyVar.getUserConfig().isPremium() ? uyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : uyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
            boolean z14 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
            r42 = 0;
            zArr2[0] = z14;
        }
        if (zArr2[r42]) {
            org.telegram.ui.ActionBar.f1 f1Var8 = new org.telegram.ui.ActionBar.f1(uyVar.getParentActivity(), r42, r42);
            if (uyVar.p4(dialog)) {
                f1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
            } else {
                f1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
            }
            f1Var8.setMinimumWidth(160);
            long j15 = j11;
            j12 = j15;
            f1Var8.setOnClickListener(new org.telegram.ui.Components.mr(uyVar, dialogFilter, dialog, j15, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var8);
        } else {
            j12 = j11;
        }
        if (DialogObject.isUserDialog(j12) && UserObject.isUserSelf(uyVar.getMessagesController().getUser(Long.valueOf(j12)))) {
            i11 = 0;
        } else {
            org.telegram.ui.ActionBar.f1 f1Var9 = new org.telegram.ui.ActionBar.f1(uyVar.getParentActivity(), false, false);
            if (uyVar.getMessagesController().isDialogMuted(j12, 0L)) {
                f1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
            } else {
                f1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
            }
            f1Var9.setMinimumWidth(160);
            f1Var9.setOnClickListener(new ai.a3(uyVar, j12, 2));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var9);
        }
        if (!isCommunity) {
            org.telegram.ui.ActionBar.f1 f1Var10 = new org.telegram.ui.ActionBar.f1(uyVar.getParentActivity(), i11, true);
            f1Var10.setIconColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7));
            int i24 = org.telegram.ui.ActionBar.i6.q7;
            f1Var10.setTextColor(uyVar.getThemedColor(i24));
            f1Var10.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, uyVar.getThemedColor(i24)));
            f1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
            f1Var10.setMinimumWidth(160);
            f1Var10.setOnClickListener(new tv(3, uyVar, arrayList));
            i11 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var10);
        }
        if (isCommunity) {
            if (uyVar.n2 != null) {
                uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
            }
            uyVar.C4();
            uyVar.parentLayout.setHighlightActionButtons(true);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("community_id", -j12);
            uy uyVar4 = new uy(bundle2);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2VarArr[0] = uyVar4;
                uyVar.presentFragmentAsPreview(uyVar4);
                return false;
            }
            n2VarArr[0] = uyVar4;
            uyVar.presentFragmentAsPreviewWithMenu(uyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
            return false;
        }
        if (!uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
            return false;
        }
        if (uyVar.n2 != null) {
            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
        }
        uyVar.C4();
        uyVar.parentLayout.setHighlightActionButtons(true);
        yn ynVar = new yn(bundle);
        Point point2 = AndroidUtilities.displaySize;
        if (point2.x > point2.y) {
            n2VarArr[0] = ynVar;
            uyVar.presentFragmentAsPreview(ynVar);
            return true;
        }
        n2VarArr[0] = ynVar;
        uyVar.presentFragmentAsPreviewWithMenu(ynVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
        ynVar.H9 = true;
        try {
            ynVar.Y0.getAvatarImageView().performAccessibilityAction(64, null);
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean R3() {
        return this.R0 == 10;
    }

    public final void R4(boolean z10) {
        int i10 = 1;
        this.c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.O3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O3 = animatorSet2;
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
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new sx(this, z10, i10));
        this.O3.start();
    }

    public final void S3() {
        if (!AndroidUtilities.isTablet()) {
            this.V1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
        TLObject tLObject = this.X1;
        if (tLObject != null) {
            dy dyVar = this.C0;
            if (dyVar != null) {
                dyVar.d0.R(this.W1, tLObject);
            }
            this.X1 = null;
        }
    }

    public final void S4() {
        if (this.A0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.z0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new jw(this, 9), 1000L);
    }

    public final void T3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.n0) {
            return;
        }
        kVar.h(true);
        this.p3 = false;
        e5(true, true);
    }

    public final void T4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        cu cuVar;
        int i10;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(this, this.k0);
        int i12 = org.telegram.ui.ActionBar.i6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new pv(this, 4), false);
                H.k();
            }
            H.i(new pv(this, 6), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new pv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (n4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new pv(this, 8), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new pv(this, 9), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.d6 d6Var2 = this.resourceProvider;
        boolean a2 = d6Var2 != null ? d6Var2.a() : org.telegram.ui.ActionBar.i6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new pv(this, 10), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new pv(this, 11), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new pv(this, 12), false);
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
                    uv uvVar = new uv(this, tL_attachMenuBot2, launchActivity2, 0);
                    cu cuVar2 = new cu(2, this, tL_attachMenuBot2);
                    org.telegram.ui.ActionBar.d6 d6Var3 = H.d;
                    if (H.e != null) {
                        int i15 = org.telegram.ui.ActionBar.i6.F8;
                        int i16 = org.telegram.ui.ActionBar.i6.E8;
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, H.e, H.d, false, false);
                        f1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                        CharSequence a10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.r8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                        TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                        if (sideAttachMenuBotIcon != null) {
                            launchActivity = launchActivity2;
                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.i6.c7, 1.0f);
                            if (svgThumb != null) {
                                Integer num = H.k0;
                                charSequence = a10;
                                svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.v0(i15, d6Var3), PorterDuff.Mode.SRC_IN));
                            } else {
                                charSequence = a10;
                            }
                            i10 = i16;
                            cuVar = cuVar2;
                            i11 = i15;
                            f1Var = f1Var2;
                            d6Var = d6Var3;
                            f1Var.h(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                            org.telegram.ui.Components.w9 w9Var = f1Var.h;
                            if (w9Var != null) {
                                w9Var.setLayoutParams(w7.z5.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                            }
                        } else {
                            launchActivity = launchActivity2;
                            cuVar = cuVar2;
                            i10 = i16;
                            f1Var = f1Var2;
                            d6Var = d6Var3;
                            CharSequence charSequence2 = a10;
                            i11 = i15;
                            f1Var.g(charSequence2, R.drawable.msg_bot, null);
                        }
                        Integer num2 = H.j0;
                        int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
                        Integer num3 = H.k0;
                        f1Var.c(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
                        Integer num4 = H.k0;
                        f1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
                        Integer num5 = H.l0;
                        f1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var)));
                        f1Var.setOnClickListener(new org.telegram.ui.Components.gt(8, H, uvVar));
                        f1Var.setOnLongClickListener(new ai.q3(3, H, cuVar));
                        int i17 = H.S;
                        if (i17 > 0) {
                            f1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                            H.r(f1Var, w7.z5.n(H.S, -2));
                        } else {
                            H.r(f1Var, w7.z5.n(-1, -2));
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
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new pv(this, 5), false);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.o0;
        if (f1Var3 != null) {
            f1Var3.b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.ai));
            this.o0.setOnClickListener(new tv(0, this, H));
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

    public final void U3(String str) {
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
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.MULTIPLY));
            this.g1.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.z8), 1, -1));
            this.g1.setOnClickListener(new wv(this, 6));
            j3.addView(this.g1, w7.z5.q(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.y8));
        j3.addView(this.h1, w7.z5.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new bi.d(2));
        this.k1 = j3.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j3.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.m1 = j3.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.j1 = j3.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.v0 h = j3.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j3.addView(new View(getParentActivity()), w7.z5.n(5, -1));
        this.q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new cw(this, 1));
        arrayList.add(this.k1);
        arrayList.add(this.m1);
        arrayList.add(this.l1);
        arrayList.add(this.j1);
        arrayList.add(h);
        c5(false);
    }

    public final void U4() {
        if (this.R3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new xv(this, 6));
                showDialog(alertDialog$Builder.a, new qv(this, 1));
                this.R3 = str;
                return;
            }
        }
    }

    @Override // le.d
    public final void V(float f7, int i10) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (i10 != 3 || (v0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) v0Var.getIconView().getDrawable();
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

    public final void V3() {
        dy dyVar = this.C0;
        if ((dyVar != null && dyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        dy dyVar2 = new dy(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.V2, this.X2, new cy(this));
        this.C0 = dyVar2;
        this.glassEngine.c(dyVar2);
        ((ny) this.fragmentView).addView(this.C0, this.B0);
        dy dyVar3 = this.C0;
        dyVar3.d0.U = new fy(this);
        dyVar3.k0.setOnItemClickListener(new xv(this, 1));
        this.C0.p0.setOnItemClickListener(new xv(this, 2));
        this.C0.w0.setOnItemClickListener(new aw(this, 0));
        this.C0.p0.setOnItemLongClickListener(new xv(this, 3));
        this.C0.a0.setOnItemClickListener(new xv(this, 4));
        this.C0.a0.setOnItemLongClickListener(new cy(this));
        this.C0.setFilteredSearchViewDelegate(new xv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.o4);
    }

    public final void V4(long j3, View view) {
        s3(j3, view);
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!s10) {
            if (this.p3) {
                U3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.d5)) {
                    hg.c.u(false, this.actionBar);
                }
            } else {
                U3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            this.actionBar.L(null, null);
            int i11 = this.e0[0].s;
            ArrayList<TLRPC.Dialog> a42 = ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) ? a4(this.currentAccount, this.e0[0].s, this.V2, this.S1) : getMessagesController().getDialogs(this.V2);
            int size = a42.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = a42.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!p4(dialog)) {
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
                        ty[] tyVarArr = this.e0;
                        if (i14 >= tyVarArr.length) {
                            break;
                        }
                        tyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                p5(MessagesController.UPDATE_MASK_REORDER, true);
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
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
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
                ty[] tyVarArr2 = this.e0;
                if (i16 >= tyVarArr2.length) {
                    break;
                }
                ty tyVar = tyVarArr2[i16];
                if (tyVar != null) {
                    tyVar.a.J0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.u3.addUpdateListener(new yv(this, max, i10));
            this.u3.addListener(new vx(this, max, c10 == true ? 1 : 0));
            this.u3.setInterpolator(org.telegram.ui.Components.tr.f);
            this.u3.setDuration(200L);
            this.u3.start();
            ky kyVar = this.z0;
            if (kyVar != null) {
                kyVar.b(org.telegram.ui.ActionBar.i6.Gh, org.telegram.ui.ActionBar.i6.Fh, org.telegram.ui.ActionBar.i6.Eh, org.telegram.ui.ActionBar.i6.Hh, org.telegram.ui.ActionBar.i6.w8);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.e1;
            if (g2Var != null) {
                g2Var.c(1.0f, true);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            k4(true);
            return;
        }
        c5(false);
        this.h1.a(arrayList.size(), z10);
    }

    public final void W3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new wx(this, parentActivity);
                FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f4 + this.h4 + d.bottomMargin;
                ny nyVar = (ny) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                nyVar.addView(undoView, i11, d);
            }
        }
    }

    public final void W4(long j3, View view) {
        int i10 = -this.L3;
        this.L3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.yc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.yc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new pv(this, 20))).j();
    }

    public final void X3(final long j3, final long j10, boolean z10, final wf1 wf1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (y3(j3)) {
            int i10 = this.R0;
            int i11 = 3;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j3));
                    if (!user2.mutual_contact) {
                        UndoView h42 = h4();
                        if (h42 != null) {
                            h42.j(45, j3, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView h43 = h4();
                        if (h43 != null) {
                            h43.j(46, j3, null);
                            return;
                        }
                        return;
                    }
                    chat = chat2;
                    user = null;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j3);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new qw(this, b2Var, user, chat, j3, tL_messages_checkHistoryImportPeer));
                try {
                    b2Var.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z10 || ((this.f2 == null || this.g2 == null) && this.h2 == null)) {
                if (i10 != 15) {
                    if (this.C2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j3, j10));
                    if (this.C2.u(this, arrayList, null, false, this.J2, this.K2, this.L2, wf1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable h0Var = new a3.h0(this, j3, new a3.g0(this, j3, j10, wf1Var, 14), 23);
                if (j3 < 0) {
                    Z4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = formatString;
                b2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new bu(h0Var, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.voip.e1(5));
                showDialog(b2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j3)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.q.l(getMessagesController(), j3).user_id));
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
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
            b2Var3.R = str;
            b2Var3.T = AndroidUtilities.replaceTags(str2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rw
                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i12) {
                    uy.this.X3(j3, j10, false, wf1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(b2Var3) == null) {
                b2Var3.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X4(boolean z10, boolean z11, boolean z12, boolean z13) {
        dy dyVar;
        dy dyVar2;
        jx jxVar;
        dy dyVar3;
        boolean z14;
        dy dyVar4;
        boolean z15;
        org.telegram.ui.Components.g91 g91Var;
        TLRPC.Chat chat;
        mx mxVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            V3();
        } else {
            l5(false);
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
        this.glassEngine.g();
        if (z10) {
            if (!this.s3 && !z13) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.l2 || (totalDialogsCount <= 10 && !this.K)) {
                    z14 = true;
                    dyVar4 = this.C0;
                    if (dyVar4 != null) {
                        dyVar4.Q0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.r3 = z15;
                    if (z15) {
                        this.s3 = true;
                    }
                    g91Var = this.a0;
                    if (g91Var != null && dyVar4 != null && !z14 && this.X2 == 0) {
                        org.telegram.ui.Components.g91 n10 = dyVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, w7.z5.e(-1, -1, 119));
                    } else if (this.Z != null && z14 && this.X2 == 0) {
                        AndroidUtilities.removeFromParent(g91Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        P3(false);
                        this.C0.setKeyboardHeight(((ny) this.fragmentView).getKeyboardHeight());
                        dy dyVar5 = this.C0;
                        dyVar5.C0.clear();
                        dyVar5.L();
                    }
                    chat = this.Y2;
                    if (chat == null) {
                        gg.q0 q0Var = new gg.q0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        q0Var.f = this.Y2;
                        t3(q0Var);
                    } else if (this.V2 != 0 && ((mxVar = this.F3) == null || !mxVar.c())) {
                        t3(new gg.q0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z14 = false;
            dyVar4 = this.C0;
            if (dyVar4 != null) {
            }
            if (z14) {
            }
            this.r3 = z15;
            if (z15) {
            }
            g91Var = this.a0;
            if (g91Var != null) {
            }
            if (this.Z != null) {
                AndroidUtilities.removeFromParent(g91Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Y2;
            if (chat == null) {
            }
        }
        if (z16 && (dyVar3 = this.C0) != null && dyVar3.d0.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (jxVar = this.E0) != null && this.G0) {
            jxVar.setVisibility(0);
        }
        boolean z17 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                dy dyVar6 = this.C0;
                if (dyVar6 != null) {
                    dyVar6.setVisibility(0);
                    dy dyVar7 = this.C0;
                    dyVar7.setPosition(0);
                    if (dyVar7.d0.h() > 0) {
                        dyVar7.e0.h1(0, 0);
                    }
                    s4.c0 c0Var = dyVar7.j0;
                    if (c0Var != null) {
                        c0Var.h1(0, 0);
                    }
                    s4.c0 c0Var2 = dyVar7.o0;
                    if (c0Var2 != null) {
                        c0Var2.h1(0, 0);
                    }
                    s4.c0 c0Var3 = dyVar7.v0;
                    if (c0Var3 != null) {
                        c0Var3.h1(0, 0);
                    }
                    dyVar7.h.clear();
                }
                f5(true, null, null, false, false);
                org.telegram.ui.Components.g91 g91Var2 = this.a0;
                if (g91Var2 != null) {
                    g91Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            J4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            dy dyVar8 = this.C0;
            if (dyVar8 != null) {
                dyVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ty tyVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(tyVar, (Property<ty, Float>) property, z10 ? 0.0f : 1.0f));
            if (z17) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<ty, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<ty, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            mx mxVar2 = this.F3;
            if (mxVar2 != null) {
                mxVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.F3, (Property<mx, Float>) property, z10 ? 0.0f : 1.0f));
            }
            dy dyVar9 = this.C0;
            if (dyVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(dyVar9, (Property<dy, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.K) {
                    float dp = AndroidUtilities.dp(81.0f) + this.N + AndroidUtilities.dp(48.0f);
                    dy dyVar10 = this.C0;
                    float f7 = z10 ? dp : 0.0f;
                    if (z10) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(dyVar10, this.H3, f7, dp));
                }
                if (z17) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<dy, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<dy, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                i5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new rv(this, 1));
            arrayList.add(ofFloat);
            this.w1.playTogether(arrayList);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.tr.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new sx(this, z10, i10));
            this.o3.lock();
            this.w1.start();
        } else {
            J4(false, true);
            if (z10) {
                this.e0[0].a.c1();
            } else {
                qy qyVar = this.e0[0].a;
                if (qyVar.i1) {
                    qyVar.i1 = false;
                    qyVar.L0(false);
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
            dy dyVar11 = this.C0;
            if (dyVar11 != null) {
                dyVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (z17) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            iy iyVar = this.X;
            if (iyVar != null) {
                iyVar.setTranslationY(f4() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z10) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            M4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.x;
        if (i12 >= 0 && (dyVar2 = this.C0) != null) {
            dyVar2.setPosition(dyVar2.N(i12));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (dyVar = this.C0) != null) {
            dyVar.setPosition((dyVar.s0 ? 1 : 0) + 5);
            l5(true);
        }
        O3();
        d5();
    }

    public final void Y3(long j3, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ty[] tyVarArr = this.e0;
            if (i10 >= tyVarArr.length) {
                return;
            }
            int childCount = tyVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.s2) {
                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                        if (s2Var.getDialogId() == j3) {
                            s2Var.T(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void Y4() {
        int i10;
        int i11;
        if (this.M0 != null || SharedConfig.appLocked || (this.K && !this.E0.g())) {
            return;
        }
        r61[] r61VarArr = new r61[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.i5 titleTextView = this.actionBar.getTitleTextView();
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
        nx nxVar = new nx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), r61VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            nxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l4 = this.B3;
        if (l4 != null) {
            nxVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.D3.f[0];
            nxVar.setSelected(drawable2 instanceof org.telegram.ui.Components.q5 ? Long.valueOf(((org.telegram.ui.Components.q5) drawable2).i()) : null);
        }
        nxVar.setSaveState(1);
        nxVar.y(this.D3, titleTextView);
        ox oxVar = new ox(this, nxVar);
        this.M0 = oxVar;
        r61VarArr[0] = oxVar;
        oxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        r61VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.uy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z4(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String formatString;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 2;
        int i11 = 1;
        String formatString2 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = formatString2;
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
            int i13 = org.telegram.ui.Cells.r6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.c1.s(isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.s(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
            }
            if (arrayList.size() == 1) {
                r92 = ((org.telegram.ui.Cells.s6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r92 = new SpannableStringBuilder();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 > 0) {
                        r92.append(", ");
                    }
                    r92.append(((org.telegram.ui.Cells.s6) arrayList.get(i14)).b.toString().toLowerCase());
                }
            }
            formatString = LocaleController.formatString(i12, new Object[]{firstName, str, r92});
        }
        charSequence = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(formatString));
        b2Var.T = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new nf(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new nf(i10, runnable2));
        showDialog(b2Var);
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            L3();
            N3();
            Q3();
            D3();
            O3();
            iy iyVar = this.X;
            le.b bVar = this.b;
            iyVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = w7.d9.a(bVar.e);
            org.telegram.ui.Components.w9 w9Var = this.a3;
            if (w9Var != null) {
                w9Var.setScaleX(a2);
                this.a3.setScaleY(a2);
                this.a3.setAlpha(a2);
                this.a3.setVisibility(a2 > 0.0f ? 0 : 8);
            }
            if (this.v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, a2);
                this.v0.setScaleX(lerp);
                this.v0.setScaleY(lerp);
                this.v0.setAlpha(a2);
                this.v0.setVisibility(a2 > 0.0f ? 0 : 8);
                this.w0.setAlpha(a2);
                this.w0.setVisibility(a2 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            L3();
            N3();
            return;
        }
        if (i10 == 3) {
            J3();
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
            I3();
            return;
        }
        if (i10 == 6) {
            L3();
            N3();
        } else {
            if (i10 == 7) {
                E3();
                return;
            }
            if (i10 == 8) {
                D3();
                O3();
            } else if (i10 == 9) {
                O3();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a4(int i10, int i11, int i12, boolean z10) {
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
                arrayList2.add(new py(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.v2) {
                arrayList2.add(new py(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.y2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.v2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new py(2));
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
                    if (u4(getMessagesController().getUser(Long.valueOf(dialog3.id)))) {
                        arrayList3.add(dialog3);
                    }
                }
                for (TLRPC.User user2 : users.values()) {
                    if (user2 != null && !messagesController.dialogs_dict.d(user2.id) && u4(user2)) {
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
                    if (t4(getMessagesController().getChat(Long.valueOf(-dialog5.id)), user)) {
                        arrayList3.add(dialog5);
                    }
                }
                for (TLRPC.Chat chat : chats.values()) {
                    if (chat != null && !messagesController.dialogs_dict.d(-chat.id) && t4(chat, user)) {
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
        ArrayList arrayList6 = this.S3;
        if (arrayList6 != null) {
            return arrayList6;
        }
        this.S3 = new ArrayList();
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
                        this.S3.add(dialog7);
                    } else if (!UserObject.isService(user3.id) && !MessagesController.isSupportUser(user3)) {
                        this.S3.add(dialog7);
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
                            this.S3.add(dialog9);
                        }
                    } else if (messagesController.canAddToForward(dialog9)) {
                        this.S3.add(dialog9);
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
                            this.S3.add(dialog11);
                        }
                    } else if (messagesController.canAddToForward(dialog11)) {
                        if (this.x2) {
                            if (!ChatObject.isMegagroup(chat3)) {
                                this.S3.add(dialog11);
                            }
                        }
                        if (this.w2 && ChatObject.isMegagroup(chat3)) {
                            this.S3.add(dialog11);
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
                        this.S3.add(dialog13);
                    }
                } else if (messagesController.canAddToForward(dialog13)) {
                    this.S3.add(dialog13);
                }
            }
        }
        getMessagesController().sortDialogsList(this.S3);
        return this.S3;
    }

    public final void a5(boolean z10) {
        ty[] tyVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            tyVarArr = this.e0;
            if (i11 >= tyVarArr.length) {
                break;
            }
            tyVarArr[i11].a.C0();
            i11++;
        }
        char c10 = (!z10 || tyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = tyVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.e0[c10].h);
        if (dialogFilter.isDefault()) {
            ty tyVar = this.e0[c10];
            tyVar.s = this.R0;
            qy qyVar = tyVar.a;
            int i13 = qy.C3;
            qyVar.B1();
        } else {
            ty[] tyVarArr2 = this.e0;
            if (tyVarArr2[c10 ^ 1].s == 7) {
                tyVarArr2[c10].s = 8;
            } else {
                tyVarArr2[c10].s = 7;
            }
            tyVarArr2[c10].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.e0[c10].s == 8 ? 1 : 0);
        }
        ty[] tyVarArr3 = this.e0;
        if (tyVarArr3.length > 1) {
            tyVarArr3[1].E = dialogFilter.locked;
        }
        ty tyVar2 = tyVarArr3[c10];
        zw zwVar = tyVar2.d;
        zwVar.h = tyVar2.s;
        zwVar.l();
        ty tyVar3 = this.e0[c10];
        vw vwVar = tyVar3.c;
        if (tyVar3.s == 0 && i4() && this.e0[c10].v == 2) {
            i10 = 1;
        }
        vwVar.h1(i10, (int) this.N);
        A3(this.e0[c10]);
    }

    public final float b4(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - e4()) * this.r.e;
    }

    public final void b5() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        n41 n41Var = this.Z;
        float measuredHeight = (n41Var == null || n41Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
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
        iy iyVar = this.X;
        float dp2 = AndroidUtilities.dp(4.0f) * ((iyVar == null || iyVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        ky kyVar = this.z0;
        if (kyVar != null) {
            kyVar.setTranslationY(f18 - dp2);
            f12 = this.z0.getAlpha();
            f13 = AndroidUtilities.dp(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.ns nsVar = this.J1;
        if (nsVar != null) {
            nsVar.setTranslationY(AndroidUtilities.lerp(f11 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.a0 == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.ms msVar = this.K1;
        if (msVar != null) {
            msVar.setTranslationY(f18 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f14, f12));
            org.telegram.ui.Components.ms msVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f15 + f13) - lerp);
            Matrix matrix = msVar2.b;
            if (msVar2.e != lerp || msVar2.f != min) {
                msVar2.e = lerp;
                msVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = msVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                msVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f12, f14));
        }
    }

    public final int c4() {
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
    public final void c5(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        ky kyVar;
        org.telegram.ui.Components.j00 d;
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
                boolean p42 = p4(dialog);
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
                    } else if (org.telegram.messenger.q.w("dialog_bar_report", j10, notificationsSettings, true)) {
                        this.R2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(getMessagesController(), dialog.id);
                            user = l4 != null ? getMessagesController().getUser(Long.valueOf(l4.user_id)) : new TLRPC.TL_userEmpty();
                        } else {
                            user = (isChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                        }
                        if (user != null && user.bot) {
                            MessagesController.isSupportUser(user);
                        }
                        if (p42) {
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
                            if (p42) {
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
        org.telegram.ui.ActionBar.v0 v0Var3 = this.j1;
        if (v0Var3 != null) {
            if (i11 != size || i12 > 0) {
                v0Var3.setVisibility(8);
            } else {
                v0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var2 = this.r1;
        if (f1Var2 != null) {
            int i21 = this.Q2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                f1Var2.setVisibility(0);
                if (this.Q2 != 0) {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                f1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.q1;
        if (f1Var3 != null && this.m1 != null) {
            if (this.S2 != 0 && i12 == 0 && this.X2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.q1.g(string, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(string);
                ky kyVar2 = this.z0;
                if (kyVar2 == null || kyVar2.getVisibility() != 0) {
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
                ky kyVar3 = this.z0;
                if (kyVar3 == null || kyVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                f1Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var4 = this.k1;
        if (v0Var4 != null && this.n1 != null) {
            if (this.N2 + i20 == size && this.X2 == 0) {
                ky kyVar4 = this.z0;
                if (kyVar4 == null || kyVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                v0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var4 = this.t1;
        if (f1Var4 != null) {
            if (i16 != 0) {
                f1Var4.setVisibility(8);
            } else {
                f1Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            ky kyVar5 = this.z0;
            boolean z13 = kyVar5 == null || kyVar5.getVisibility() != 0 || ((d = (kyVar = this.z0).d()) != null && d.a == kyVar.L);
            if (!z13) {
                try {
                    z13 = size >= a4(this.currentAccount, this.e0[0].d.h, this.V2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z11 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.V2 != 1) {
                        if (this.z0 != null && b4(z11) > 0.5f) {
                            ky kyVar6 = this.z0;
                            org.telegram.ui.Components.j00 d10 = kyVar6.d();
                            if (d10 != null && d10.a == kyVar6.L) {
                                int i22 = org.telegram.ui.Components.q00.w;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i23 = 0; i23 < size2; i23++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                                    if (!org.telegram.ui.Components.q00.G(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                                        arrayList2.add(dialogFilter);
                                    }
                                }
                            }
                        }
                        this.o1.setVisibility(8);
                    }
                    this.o1.setVisibility(0);
                }
                v0Var = this.l1;
                if (v0Var != null) {
                    if (this.P2 != 0) {
                        v0Var.setIcon(R.drawable.msg_unmute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    } else {
                        v0Var.setIcon(R.drawable.msg_mute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                    }
                }
                f1Var = this.s1;
                if (f1Var != null) {
                    if (this.M2 != 0) {
                        f1Var.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                        this.s1.setVisibility(0);
                    } else if (this.T2 == 0 && i12 == 0) {
                        f1Var.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                        this.s1.setVisibility(0);
                    } else {
                        f1Var.setVisibility(8);
                    }
                }
                v0Var2 = this.k1;
                if (v0Var2 != null || this.n1 == null) {
                }
                if (this.N2 != 0) {
                    v0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(LocaleController.getString(R.string.PinToTop));
                    this.n1.setText(LocaleController.getString(R.string.DialogPin));
                    return;
                } else {
                    v0Var2.setIcon(R.drawable.msg_unpin);
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
        v0Var = this.l1;
        if (v0Var != null) {
        }
        f1Var = this.s1;
        if (f1Var != null) {
        }
        v0Var2 = this.k1;
        if (v0Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        ky kyVar;
        if (this.F3.c()) {
            return false;
        }
        return this.R0 != 3 || (kyVar = this.z0) == null || kyVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean closeLastFragment() {
        if (!this.F3.c()) {
            return super.closeLastFragment();
        }
        this.F3.a();
        dy dyVar = this.C0;
        if (dyVar == null) {
            return true;
        }
        dyVar.T();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.y7 y7Var = new org.telegram.ui.Components.y7(this, context, this.resourceProvider, 3);
        y7Var.setAllowOverlayTitle(true);
        y7Var.I();
        y7Var.z(getThemedColor(org.telegram.ui.ActionBar.i6.t8), false);
        y7Var.z(getThemedColor(org.telegram.ui.ActionBar.i6.z8), true);
        y7Var.A(getThemedColor(org.telegram.ui.ActionBar.i6.v8), false);
        y7Var.A(getThemedColor(org.telegram.ui.ActionBar.i6.y8), true);
        y7Var.k();
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || n4())) {
            return y7Var;
        }
        y7Var.setOccupyStatusBar(false);
        return y7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0cc7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0d06  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0ddd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c8d  */
    /* JADX WARN: Type inference failed for: r0v103, types: [org.telegram.ui.ActionBar.k] */
    /* JADX WARN: Type inference failed for: r0v184, types: [org.telegram.ui.Components.zl0, org.telegram.ui.qy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [hh.g] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r14v6, types: [org.telegram.ui.Components.zl0, org.telegram.ui.qy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [ci.h2, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.telegram.ui.ActionBar.k] */
    /* JADX WARN: Type inference failed for: r3v282, types: [android.view.ViewGroup, org.telegram.ui.ActionBar.v0] */
    /* JADX WARN: Type inference failed for: r6v20, types: [org.telegram.ui.Components.zl0, org.telegram.ui.qy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [org.telegram.ui.Components.zl0, org.telegram.ui.qy] */
    /* JADX WARN: Type inference failed for: r6v22, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.qy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [org.telegram.ui.Components.zl0, org.telegram.ui.qy] */
    /* JADX WARN: Type inference failed for: r6v27, types: [org.telegram.ui.Components.zl0, org.telegram.ui.qy] */
    /* JADX WARN: Type inference failed for: r6v29, types: [org.telegram.ui.vw, s4.c0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v38, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f7;
        ah.c cVar;
        yn ynVar;
        ky kyVar;
        iy iyVar;
        iy iyVar2;
        org.telegram.ui.Components.ns nsVar;
        sy syVar;
        s4.y yVar;
        gg.m mVar;
        gg.m mVar2;
        gg.m mVar3;
        gg.m mVar4;
        gg.m mVar5;
        gg.m mVar6;
        oy oyVar;
        int i10;
        int i11;
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
        AndroidUtilities.runOnUIThread(new ov(context2, 0));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        this.j0 = a2;
        a2.setOnClickListener(new wv(this, 1));
        if (this.R0 == 2 || (n4() && a4(this.currentAccount, this.R0, this.V2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        float f10 = 0.0f;
        ?? r82 = 1;
        if (!this.l2 && this.n2 == null && this.V2 == 0 && this.X2 == 0) {
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context2, getThemedColor(org.telegram.ui.ActionBar.i6.t8), getThemedColor(org.telegram.ui.ActionBar.i6.v8), true);
            this.m0 = v0Var;
            v0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.m0, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new wv(this, 8));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.si0(context2);
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(context2, this.resourceProvider, false, true);
            this.o0 = f1Var;
            f1Var.setItemHeight(56);
            this.o0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.n0);
            this.o0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.v0 a10 = n10.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            ?? d = n10.d(3, new ColorDrawable(0));
            this.g0 = d;
            wy wyVar = new wy(context2, this.currentAccount);
            this.h0 = wyVar;
            d.addView(wyVar);
            this.g0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.g0.setVisibility(8);
            i5(false, false);
        }
        iy iyVar3 = new iy(context2, this.resourceProvider);
        this.X = iyVar3;
        long j3 = 0;
        iyVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.v0 a11 = n10.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.l0.setOnClickListener(new wv(this, 9));
            this.X.a(this.l0);
            this.X.e();
        }
        this.X.setCloseButtonOnClickListener(new pv(this, 28));
        this.X.r.setOnFocusChangeListener(new rd(this, 1));
        ?? r32 = this.X.r;
        yf.c0 c0Var = new yf.c0(r32, new jy(this));
        this.Y = c0Var;
        r32.addTextChangedListener(c0Var);
        this.X.setSearchFiltersListener(new cy(this));
        this.Y.a();
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.v0 a12 = n10.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.k0.setOnClickListener(new wv(this, 10));
            this.k0.setOnLongClickListener(new cw(this, 3));
        }
        this.j0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.j0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i12 = this.R0;
            if (i12 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.N0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.O0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i12 == 3 && this.f2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i12 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i12 == 14) {
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
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        } else {
            if (this.n2 != null || this.V2 != 0 || this.X2 != 0) {
                ?? r33 = this.actionBar;
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
                this.e1 = g2Var;
                r33.setBackButtonDrawable(g2Var);
            }
            if (this.V2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.X2 != 0) {
                this.actionBar.setTitle(DialogObject.getName(this.Y2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.b3 = new org.telegram.ui.Components.h9(this.Y2);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
                this.a3 = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.a3.e(this.Y2, this.b3);
                this.actionBar.addView(this.a3, w7.z5.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(26.0f), null);
                this.D3 = o5Var;
                o5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.C3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.C3.getIntrinsicWidth(), this.C3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.C3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.gl), PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.C3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.F(spannableStringBuilder, this.D3);
                m5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.V2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new pv(this, 29));
        int i13 = this.R0;
        if (((i13 == 0 && !this.l2) || i13 == 3) && this.V2 == 0 && this.X2 == 0 && TextUtils.isEmpty(this.n2)) {
            ky kyVar2 = new ky(this, context2, this.resourceProvider);
            this.z0 = kyVar2;
            kyVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.z0.setDelegate(new ly(context2, this));
        }
        int i14 = 17;
        if (this.r2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.D1 = n10.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9();
            h9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context2);
            w9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.D1.addView(w9Var2, w7.z5.e(36, 36, 17));
            this.D1.setOnClickListener(new wv(this, 11));
            this.D1.setOnLongClickListener(new cw(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            h9Var.m(this.currentAccount, currentUser);
            w9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            w9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? h9Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new sw(this));
        ny nyVar = new ny(context2, this);
        this.fragmentView = nyVar;
        this.r4 = new iw(this, nyVar, new PointF(), 0);
        int i15 = (this.V2 == 0 && this.X2 == 0 && (((i11 = this.R0) == 0 && !this.l2) || i11 == 3)) ? 2 : 1;
        this.e0 = new ty[i15];
        int i16 = 0;
        while (i16 < i15) {
            ty tyVar = new ty(context2, this);
            nyVar.addView(tyVar, w7.z5.c(-1.0f, -1));
            tyVar.s = this.R0;
            this.e0[i16] = tyVar;
            tyVar.w = new org.telegram.ui.Components.w00(context2);
            tyVar.w.setViewType(7);
            tyVar.w.setVisibility(8);
            tyVar.addView(tyVar.w, w7.z5.e(-2, -2, i14));
            qy qyVar = new qy(this, context2, tyVar);
            tyVar.a = qyVar;
            this.glassEngine.b(qyVar);
            ?? r14 = tyVar.a;
            tyVar.b = new a5.a((org.telegram.ui.Components.zl0) r14);
            r14.setAllowStopHeaveOperations(r82);
            tyVar.a.setAccessibilityEnabled(r11);
            tyVar.a.o1(r11, r82);
            tyVar.a.setClipToPadding(r11);
            tyVar.a.setPivotY(f10);
            if (this.R0 == 15) {
                tyVar.a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.a7));
            }
            tyVar.x = new tw(tyVar.a, tyVar);
            tyVar.a.setVerticalScrollBarEnabled(r82);
            tyVar.a.setInstantClick(r82);
            tyVar.c = new vw(this, tyVar);
            tyVar.c.j1(r82);
            tyVar.a.setLayoutManager(tyVar.c);
            tyVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            tyVar.addView(tyVar.a, w7.z5.c(-1.0f, -1));
            tyVar.a.setOnItemClickListener(new org.telegram.ui.Components.w2(29, this, tyVar));
            tyVar.a.setOnItemLongClickListener(new n7.z0(this, tyVar, false, 6));
            tyVar.f = new sy(this, tyVar);
            tyVar.y = new org.telegram.ui.Components.dl0(tyVar.a, r11);
            syVar = tyVar.f;
            tyVar.e = new s4.y(syVar);
            yVar = tyVar.e;
            yVar.e(tyVar.a);
            tyVar.a.setOnScrollListener(new xw(this, tyVar, nyVar));
            tyVar.v = SharedConfig.archiveHidden ? 2 : 0;
            if (tyVar.n == null && this.V2 == 0 && this.X2 == j3) {
                tyVar.n = new yw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), tyVar);
                if (i4()) {
                    tyVar.n.h();
                } else {
                    tyVar.n.b();
                }
                yw ywVar = tyVar.n;
                i10 = tyVar.v;
                ywVar.g(i10 != 0);
            }
            ny nyVar2 = nyVar;
            int i17 = i16;
            long j10 = j3;
            int i18 = i15;
            context2 = context;
            tyVar.d = new zw(this, this, context, tyVar.s, this.V2, this.l2, arrayList, this.currentAccount, this.G, tyVar);
            mVar = tyVar.d;
            mVar.R(tyVar.a);
            mVar2 = tyVar.d;
            mVar2.P(this.t2);
            if (tyVar.s == 3) {
                mVar6 = tyVar.d;
                mVar6.M(getMessagesController().storiesEnabled() && (oyVar = this.C2) != null && oyVar.A());
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.p2;
                if (topicKey.dialogId != j10) {
                    mVar5 = tyVar.d;
                    mVar5.Q(topicKey.dialogId);
                }
            }
            mVar3 = tyVar.d;
            mVar3.N(tyVar.n);
            qy qyVar2 = tyVar.a;
            mVar4 = tyVar.d;
            qyVar2.setAdapter(mVar4);
            tyVar.a.setEmptyView((this.V2 == 0 && this.X2 == j10) ? tyVar.w : null);
            tyVar.r = new org.telegram.ui.Components.bl0(tyVar.a, tyVar.c);
            org.telegram.ui.Components.bl0 bl0Var = tyVar.r;
            bl0Var.c = true;
            bl0Var.d = true;
            bl0Var.h = new xv(this, 12);
            if (i17 != 0) {
                this.e0[i17].setVisibility(8);
            }
            i16 = i17 + 1;
            i15 = i18;
            nyVar = nyVar2;
            r82 = 1;
            f10 = 0.0f;
            j3 = j10;
            r11 = 0;
            i14 = 17;
        }
        ny nyVar3 = nyVar;
        long j11 = j3;
        org.telegram.ui.Components.ms msVar = new org.telegram.ui.Components.ms(context2);
        this.K1 = msVar;
        int i19 = org.telegram.ui.ActionBar.i6.d6;
        msVar.setColor(org.telegram.ui.ActionBar.i6.u0(i19));
        nyVar3.addView(this.K1, w7.z5.e(-1, 100, 48));
        this.B0 = nyVar3.getChildCount();
        n41 n41Var = new n41((Activity) getContext());
        this.Z = n41Var;
        nyVar3.addView(n41Var, w7.z5.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        n41 n41Var2 = this.Z;
        dh.e o9 = eh.b.o(this.resourceProvider);
        ah.c cVar2 = this.p4;
        ch.d b10 = cVar2.b(n41Var2, o9);
        b10.y(AndroidUtilities.dp(18.0f));
        b10.x(AndroidUtilities.dp(6.666f));
        this.Z.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.Z.setBlurredBackground(b10);
        gg.s0 s0Var = new gg.s0(getParentActivity(), null);
        this.b0 = s0Var;
        s0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        gg.s0 s0Var2 = this.b0;
        s0Var2.h3 = false;
        s0Var2.setOnItemClickListener(new aw(this, 1));
        this.Z.addView(this.b0, w7.z5.e(-1, -1, 48));
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context2, this.resourceProvider, true);
        this.u0 = c20Var;
        c20Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new wv(this, 24));
        nyVar3.addView(this.u0, org.telegram.ui.Components.c20.c());
        org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(context2, this.resourceProvider);
        this.t0 = c20Var2;
        nyVar3.addView(c20Var2, org.telegram.ui.Components.c20.b());
        this.t0.setOnClickListener(new wv(this, 28));
        if (!n4() && this.R0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", true)) {
            ci.e4 e4Var = new ci.e4(context2, 2);
            e4Var.q(8.0f);
            e4Var.d = 8000L;
            e4Var.i();
            e4Var.n();
            e4Var.p(true);
            e4Var.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), ci.kc.n(context2)));
            e4Var.l(1.0f, -40.0f);
            e4Var.h(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
            e4Var.l0 = new jw(this, 4);
            this.p0 = e4Var;
            nyVar3.addView(e4Var, w7.z5.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        n5();
        this.a0 = null;
        if (this.l2 || this.R0 != 0) {
            f7 = 72.0f;
            if (this.R0 == 3 || R3()) {
                hh.g gVar = new hh.g(context2);
                this.y1 = gVar;
                gVar.setClipChildren(false);
                ?? r02 = this.y1;
                ph.i iVar = this.v;
                r02.setWindowInsetsProvider(iVar);
                hh.g gVar2 = this.y1;
                gVar2.setInputIslandBubbleDrawable(cVar2.b(gVar2, eh.b.o(this.resourceProvider)));
                hh.g gVar3 = this.y1;
                gVar3.setUnderKeyboardBackgroundDrawable(this.n4.b(gVar3, eh.b.o(this.resourceProvider)));
                ah.e eVar = new ah.e(this.q4.b(this.y1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    eVar.b(AndroidUtilities.dp(72.0f), true);
                }
                this.y1.setBackgroundWithFadeDrawable(eVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                cx cxVar = this.B1;
                if (cxVar != null) {
                    cxVar.B0();
                }
                cx cxVar2 = new cx(this, getParentActivity(), nyVar3);
                this.B1 = cxVar2;
                cxVar2.setInAppInsetsController(iVar);
                this.B1.y4 = false;
                nyVar3.setClipChildren(false);
                nyVar3.setClipToPadding(false);
                cx cxVar3 = this.B1;
                cxVar3.x4 = false;
                cxVar3.i2 = !AndroidUtilities.isInMultiwindow && ((ynVar = cxVar3.P2) == null || !ynVar.isInBubbleMode());
                this.B1.U0(false, false, false);
                this.B1.f1(true, false);
                this.B1.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, w7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                nyVar3.addView(this.y1.getFadeView(), w7.z5.c(-1.0f, -1));
                nyVar3.addView(this.y1, w7.z5.c(-1.0f, -1));
                if (j4() || this.E2 != null || this.F2 != null) {
                    v3(this.U3);
                    this.U3 = null;
                }
                this.B1.setDelegate(new dx(this));
                cVar = cVar2;
                ii.z1 z1Var = new ii.z1((NotificationCenter.NotificationCenterDelegate) this, context2, R.drawable.send_plane_24, this.resourceProvider, 3);
                this.C1 = z1Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                z1Var.I = dp;
                z1Var.J = dp2;
                ii.z1 z1Var2 = this.C1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                z1Var2.M = dp3;
                z1Var2.N = dp4;
                ii.z1 z1Var3 = this.C1;
                z1Var3.h0 = true;
                nyVar3.addView(z1Var3, w7.z5.e(110, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i19));
                this.C1.setOnClickListener(new wv(this, 5));
                this.C1.setOnLongClickListener(new cw(this, 0));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                kyVar = this.z0;
                if (kyVar != null) {
                    ch.d b11 = cVar.b(kyVar, eh.b.o(this.resourceProvider));
                    b11.y(AndroidUtilities.dp(18.0f));
                    b11.x(AndroidUtilities.dp(6.666f));
                    this.z0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.z0.setBlurredBackground(b11);
                    nyVar3.addView(this.z0, w7.z5.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                iyVar = this.X;
                if (iyVar != null) {
                    iyVar.setupBlurredBackground(cVar.b(iyVar, eh.b.o(this.resourceProvider)));
                }
                jx jxVar = new jx(this, context, this, this.currentAccount, n4() ? 1 : 0);
                this.E0 = jxVar;
                jxVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!n4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                jx jxVar2 = this.E0;
                jxVar2.l0 = false;
                jxVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == 3) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j11);
                }
                nyVar3.addView(this.actionBar, w7.z5.c(-2.0f, -1));
                if (!this.l2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.E3 = oVar;
                    nyVar3.addView(oVar, w7.z5.e(20, 20, 51));
                }
                iyVar2 = this.X;
                if (iyVar2 != null) {
                    nyVar3.addView(iyVar2, w7.z5.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = nyVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.gl));
                }
                if (this.V2 == 0 || this.X2 != 0) {
                    this.e0[0].a.setGlowColor(getThemedColor(i19));
                    this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.i6.O8), false);
                    this.actionBar.z(getThemedColor(org.telegram.ui.ActionBar.i6.N8), false);
                    this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.i6.Q8), false);
                    this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.i6.R8), true);
                }
                if (!this.l2 && this.R0 == 0) {
                    ci.ab abVar = new ci.ab(this, context, 29);
                    this.K0 = abVar;
                    if (Build.VERSION.SDK_INT >= 23) {
                        abVar.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i19), 100)));
                    }
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new wv(this, 7));
                    this.K0.setVisibility(8);
                    nyVar3.addView(this.K0, w7.z5.c(-1.0f, -1));
                }
                this.f1.setColor(getThemedColor(i19));
                this.p3 = false;
                if (this.n2 == null) {
                    X4(true, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    X4(true, false, false, true);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    iy iyVar4 = this.X;
                    if (iyVar4 != null) {
                        iyVar4.setTranslationY(f4() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    X4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(nyVar3);
                this.F3 = new mx(this, context, nyVar3, context);
                e5(true, false);
                this.F3.setOpenProgress(0.0f);
                nyVar3.addView(this.E0, w7.z5.c(81.0f, -1));
                nyVar3.addView(this.F3, w7.z5.c(-1.0f, -1));
                this.F0 = new org.telegram.ui.Components.ls(context);
                nsVar = this.J1;
                if (nsVar != null) {
                    nyVar3.addView(nsVar, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.X2 != 0 && this.R0 != 3 && ChatObject.canAddChatToCommunity(this.Y2)) {
                    org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(rqVar, 0, 1, 33);
                    ci.d dVar = new ci.d(context, this.resourceProvider);
                    this.v0 = dVar;
                    dVar.e();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new tv(1, this, new org.telegram.ui.ActionBar.b2[1]));
                    jh.f fVar = new jh.f(getContext());
                    this.w0 = fVar;
                    fVar.setupColorKey(org.telegram.ui.ActionBar.i6.a7);
                    this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
                    this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    nyVar3.addView(this.w0, w7.z5.g());
                    nyVar3.addView(this.v0, w7.z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
                }
                o5(false);
                h5(false);
                O3();
                L3();
                N3();
                M3();
                K3();
                E3();
                this.X.setBlurredBackgroundVisibility(this.b.e);
                li.p pVar = this.glassEngine;
                pVar.a = new xv(this, 7);
                pVar.d = new ni.b(AndroidUtilities.dp(48.0f));
                r0.i0.m(this.fragmentView, new xv(this, 8));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.ns nsVar2 = new org.telegram.ui.Components.ns(context2);
            this.J1 = nsVar2;
            nsVar2.setOnAnimatedHeightChangedListener(new jw(this, 10));
            ch.d a13 = cVar2.a(this.J1);
            a13.w(eh.b.o(this.resourceProvider));
            a13.x(AndroidUtilities.dp(7.0f));
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
            ax axVar = new ax(this, context2, this, 0);
            this.F1 = axVar;
            this.G1.addView(axVar);
            ax axVar2 = new ax(this, context2, this, 1);
            this.H1 = axVar2;
            this.I1.addView(axVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context2);
            this.M1 = a3Var;
            a3Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
            d5();
            a7.g0(new sv(this, 0));
            a7.m0(new c5(this, 11));
            this.J1.addView(this.M1);
            if (this.X2 != j11) {
                gi.j jVar = new gi.j(context2, this.resourceProvider, true);
                this.Q1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.Q1.setUnreadMode(true);
                this.Q1.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
                this.Q1.setOnClickListener(new wv(this, 4));
                this.J1.addView(this.Q1);
                z3(false);
            }
        }
        cVar = cVar2;
        kyVar = this.z0;
        if (kyVar != null) {
        }
        iyVar = this.X;
        if (iyVar != null) {
        }
        jx jxVar3 = new jx(this, context, this, this.currentAccount, n4() ? 1 : 0);
        this.E0 = jxVar3;
        jxVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!n4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        jx jxVar22 = this.E0;
        jxVar22.l0 = false;
        jxVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j11);
        }
        nyVar3.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        if (!this.l2) {
        }
        iyVar2 = this.X;
        if (iyVar2 != null) {
        }
        this.x0 = nyVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.W) {
        }
        if (this.V2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i19));
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.i6.O8), false);
        this.actionBar.z(getThemedColor(org.telegram.ui.ActionBar.i6.N8), false);
        this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.i6.Q8), false);
        this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.i6.R8), true);
        if (!this.l2) {
            ci.ab abVar2 = new ci.ab(this, context, 29);
            this.K0 = abVar2;
            if (Build.VERSION.SDK_INT >= 23) {
            }
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new wv(this, 7));
            this.K0.setVisibility(8);
            nyVar3.addView(this.K0, w7.z5.c(-1.0f, -1));
        }
        this.f1.setColor(getThemedColor(i19));
        this.p3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(nyVar3);
        this.F3 = new mx(this, context, nyVar3, context);
        e5(true, false);
        this.F3.setOpenProgress(0.0f);
        nyVar3.addView(this.E0, w7.z5.c(81.0f, -1));
        nyVar3.addView(this.F3, w7.z5.c(-1.0f, -1));
        this.F0 = new org.telegram.ui.Components.ls(context);
        nsVar = this.J1;
        if (nsVar != null) {
        }
        if (this.X2 != 0) {
            org.telegram.ui.Components.rq rqVar2 = new org.telegram.ui.Components.rq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(rqVar2, 0, 1, 33);
            ci.d dVar2 = new ci.d(context, this.resourceProvider);
            this.v0 = dVar2;
            dVar2.e();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new tv(1, this, new org.telegram.ui.ActionBar.b2[1]));
            jh.f fVar2 = new jh.f(getContext());
            this.w0 = fVar2;
            fVar2.setupColorKey(org.telegram.ui.ActionBar.i6.a7);
            this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
            this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            nyVar3.addView(this.w0, w7.z5.g());
            nyVar3.addView(this.v0, w7.z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        o5(false);
        h5(false);
        O3();
        L3();
        N3();
        M3();
        K3();
        E3();
        this.X.setBlurredBackgroundVisibility(this.b.e);
        li.p pVar2 = this.glassEngine;
        pVar2.a = new xv(this, 7);
        pVar2.d = new ni.b(AndroidUtilities.dp(48.0f));
        r0.i0.m(this.fragmentView, new xv(this, 8));
        return this.fragmentView;
    }

    public final int d4() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d5() {
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
        mx mxVar;
        boolean z14;
        mx mxVar2;
        boolean z15;
        mx mxVar3;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.a3 a3Var = this.M1;
        final int i10 = 0;
        if (a3Var != null) {
            try {
                ((org.telegram.ui.Components.kj0) ((org.telegram.ui.Components.h9) a3Var.h.getImageReceiver().getStaticThumb()).B).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.a3 a3Var2 = this.M1;
            a3Var2.setCompact(false);
            a3Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.w9 w9Var = a3Var2.h;
            w9Var.setVisibility(8);
            w9Var.b();
        }
        long j12 = 0;
        final int i11 = 1;
        if (isInPreviewMode()) {
            str = null;
        } else {
            if (getMessagesController().isFrozen()) {
                this.M1.setOnClickListener(new wv(this, 12));
                this.M1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i12 = 3;
                if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new wv(this, 19));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.M1.c, new jw(this, i12)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.M1.setOnCloseListener(new wv(this, 25));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new wv(this, 26));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.M1.c, new jw(this, i12)), LocaleController.getString(R.string.GraceMessage));
                    this.M1.setOnCloseListener(new wv(this, 27));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.M1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt()));
                    this.M1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mw
                        public final /* synthetic */ uy b;

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
                                    uy.S(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mw
                        public final /* synthetic */ uy b;

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
                                    uy.S(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.V2 == 0 && this.X2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        yh.u5 y3 = yh.u5.y(this.currentAccount, false);
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
                                yh.u5 y10 = yh.u5.y(this.currentAccount, false);
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
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        uy uyVar = uy.this;
                                        new yh.n7(uyVar.getParentActivity(), uyVar.getResourceProvider(), j10, 2, sb4, new pv(uyVar, 14), j11).show();
                                    }
                                });
                                org.telegram.ui.Cells.a3 a3Var3 = this.M1;
                                long j16 = j10 - y10.f.amount;
                                if (j16 > j3) {
                                    j10 = j16;
                                }
                                a3Var3.b(yh.z7.d1(false, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j10, sb4), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.M1.setOnCloseListener(new wv(this, 13));
                                z13 = true;
                                str = null;
                                mxVar = this.F3;
                                le.b bVar = this.b;
                                if ((mxVar != null && mxVar.c()) || bVar.f) {
                                    z13 = false;
                                }
                                this.J1.i(this.M1, z13, true);
                                z3(true);
                                if (this.fragmentView != null || this.J1 == null) {
                                    z14 = false;
                                } else {
                                    boolean z16 = !isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((mxVar3 = this.F3) == null || !mxVar3.c()) && !bVar.f;
                                    if (z16) {
                                        if (this.N1 == null) {
                                            org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(getParentActivity());
                                            this.N1 = waVar;
                                            this.J1.addView(waVar);
                                        }
                                        org.telegram.ui.Cells.wa waVar2 = this.N1;
                                        int i15 = this.currentAccount;
                                        TextView textView = waVar2.b;
                                        TextView textView2 = waVar2.c;
                                        ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList3 = MessagesController.getInstance(i15).getUnconfirmedAuthController().auths;
                                        org.telegram.ui.Cells.va vaVar = waVar2.d;
                                        vaVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                                        vaVar.a(false, false);
                                        org.telegram.ui.Cells.va vaVar2 = waVar2.e;
                                        vaVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                                        vaVar2.a(false, false);
                                        if (arrayList3 != null && arrayList3.size() == 1) {
                                            UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList3.get(0);
                                            textView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
                                            String str2 = "" + unconfirmedAuth.device;
                                            if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str2.isEmpty()) {
                                                str2 = str2.concat(", ");
                                            }
                                            StringBuilder v = a4.a.v(str2);
                                            v.append(unconfirmedAuth.location);
                                            String sb5 = v.toString();
                                            if (unconfirmedAuth.bot) {
                                                textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingleBot, "@" + DialogObject.getShortName(unconfirmedAuth.bot_id), sb5));
                                                z15 = true;
                                                vaVar.setOnClickListener(new org.telegram.ui.Cells.ta(this, z15, i15, arrayList3));
                                                z14 = false;
                                                vaVar2.setOnClickListener(new org.telegram.ui.Cells.ua((Object) waVar2, i15, (Object) arrayList3, (int) (0 == true ? 1 : 0)));
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
                                        vaVar.setOnClickListener(new org.telegram.ui.Cells.ta(this, z15, i15, arrayList3));
                                        z14 = false;
                                        vaVar2.setOnClickListener(new org.telegram.ui.Cells.ua((Object) waVar2, i15, (Object) arrayList3, (int) (0 == true ? 1 : 0)));
                                    } else {
                                        z14 = false;
                                    }
                                    org.telegram.ui.Cells.wa waVar3 = this.N1;
                                    if (waVar3 != null) {
                                        this.J1.i(waVar3, z16, true);
                                    }
                                }
                                if (this.fragmentView == null || this.J1 == null) {
                                    return;
                                }
                                if (!isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && getGiftAuctionsController().hasActiveAuctions() && (((mxVar2 = this.F3) == null || !mxVar2.c()) && !bVar.f)) {
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
                                int i17 = 16;
                                if (this.V2 != 0 && this.X2 == j3 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                    ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                    this.M1.setOnClickListener(new wv(this, 15));
                                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.M1.c, new jw(this, i12)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                    this.M1.setOnCloseListener(new wv(this, i17));
                                } else if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                                    this.M1.setOnClickListener(new ai.e2(i17));
                                    this.M1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.i6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                    this.M1.setOnCloseListener(new wv(this, 17));
                                } else if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                    this.M1.setOnClickListener(new wv(this, 18));
                                    this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.i6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                } else {
                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.V2 != 0 || this.X2 != j3 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) == null : BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null))) {
                                        z10 = false;
                                    } else {
                                        this.A3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                        z10 = true;
                                    }
                                    if (z10) {
                                        this.M1.setOnClickListener(new wv(this, 20));
                                        this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.A3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.i6.I6, 2, null), LocaleController.getString(this.A3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                    } else {
                                        if (this.O1 != null && this.P1 != null) {
                                            if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                                MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                            } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j3)) {
                                                z11 = true;
                                                int i18 = 21;
                                                if (!z11) {
                                                    this.M1.setOnClickListener(new wv(this, i18));
                                                    this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.O1.longValue())), org.telegram.ui.ActionBar.i6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                } else if (this.V2 == 0 && this.X2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                    this.M1.setOnClickListener(new wv(this, 22));
                                                    this.M1.h.setVisibility(0);
                                                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                                                    h9Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                    long clientUserId = getUserConfig().getClientUserId();
                                                    h9Var.A = true;
                                                    h9Var.b = true;
                                                    h9Var.c = false;
                                                    int i19 = org.telegram.ui.ActionBar.i6.p8[org.telegram.ui.Components.h9.e(clientUserId)];
                                                    org.telegram.ui.ActionBar.d6 d6Var = h9Var.z;
                                                    h9Var.d = org.telegram.ui.ActionBar.i6.v0(i19, d6Var);
                                                    h9Var.e = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q8[org.telegram.ui.Components.h9.e(clientUserId)], d6Var);
                                                    h9Var.n = 0;
                                                    h9Var.m = false;
                                                    org.telegram.ui.Components.h9.a("", "", "", h9Var.q);
                                                    h9Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.M1.h.setImageDrawable(h9Var);
                                                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.M1.c, new jw(this, i12)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                    this.M1.setOnCloseListener(new wv(this, 23));
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
                                                            org.telegram.ui.Cells.a3 a3Var4 = this.M1;
                                                            CharSequence charSequence = charSequenceArr[0];
                                                            if (charSequence instanceof String) {
                                                                str = null;
                                                                charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.i6.I6, 2, null);
                                                            } else {
                                                                str = null;
                                                            }
                                                            CharSequence charSequence2 = charSequenceArr[1];
                                                            if (charSequence2 instanceof String) {
                                                                charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                            }
                                                            a3Var4.b(charSequence, charSequence2);
                                                            if (zArr[0] && next != null) {
                                                                this.M1.setOnCloseListener(new tv(5, this, next));
                                                            }
                                                            z13 = true;
                                                            mxVar = this.F3;
                                                            le.b bVar2 = this.b;
                                                            if (mxVar != null) {
                                                                z13 = false;
                                                                this.J1.i(this.M1, z13, true);
                                                                z3(true);
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
                                                            z3(true);
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
                                this.M1.setOnClickListener(new tv(4, this, state));
                                this.M1.a(this.currentAccount, arrayList4);
                                this.M1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList4.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList4.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList4.size(), new Object[0]), org.telegram.ui.ActionBar.i6.I6, 2, null), this.M1.c, new jw(this, i12)), LocaleController.formatString(arrayList4.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.M1.setOnCloseListener(new wv(this, 14));
                                yh.u5.y(this.currentAccount, false).V();
                            }
                            z13 = true;
                            str = null;
                            mxVar = this.F3;
                            le.b bVar22 = this.b;
                            if (mxVar != null) {
                            }
                            z13 = false;
                            this.J1.i(this.M1, z13, true);
                            z3(true);
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
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new yh.w4(y3, i10));
                        }
                    }
                    j3 = 0;
                    if (this.V2 == 0) {
                    }
                    int i172 = 16;
                    if (this.V2 != 0) {
                    }
                    if (!((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                    z13 = true;
                    str = null;
                    mxVar = this.F3;
                    le.b bVar222 = this.b;
                    if (mxVar != null) {
                    }
                    z13 = false;
                    this.J1.i(this.M1, z13, true);
                    z3(true);
                    if (this.fragmentView != null) {
                    }
                    z14 = false;
                    if (this.fragmentView == null) {
                    }
                }
            }
            str = null;
            z13 = true;
            mxVar = this.F3;
            le.b bVar2222 = this.b;
            if (mxVar != null) {
            }
            z13 = false;
            this.J1.i(this.M1, z13, true);
            z3(true);
            if (this.fragmentView != null) {
            }
            z14 = false;
            if (this.fragmentView == null) {
            }
        }
        z13 = false;
        mxVar = this.F3;
        le.b bVar22222 = this.b;
        if (mxVar != null) {
        }
        z13 = false;
        this.J1.i(this.M1, z13, true);
        z3(true);
        if (this.fragmentView != null) {
        }
        z14 = false;
        if (this.fragmentView == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x0569, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r14, r4.J0) != false) goto L367;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        MessagesController.DialogFilter dialogFilter;
        int i13;
        int i14;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.jo0 jo0Var;
        org.telegram.ui.Components.jo0 jo0Var2;
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
                ty[] tyVarArr = this.e0;
                if (i18 >= tyVarArr.length) {
                    break;
                }
                ty tyVar = tyVarArr[i18];
                int i19 = tyVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i19 == 7 || i19 == 8) ? getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.z3 && z12) {
                    AndroidUtilities.runOnUIThread(new uq(this, tyVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    D4(tyVar);
                }
                i18++;
            }
            ky kyVar = this.z0;
            if (kyVar != null && kyVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.z3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            p5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.X2 != chatFull.id) {
                return;
            }
            this.Z2 = chatFull;
            z3(false);
            if (this.e0 == null || this.S1) {
                return;
            }
            while (true) {
                ty[] tyVarArr2 = this.e0;
                if (i17 >= tyVarArr2.length) {
                    return;
                }
                D4(tyVarArr2[i17]);
                i17++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                ky kyVar2 = this.z0;
                if (kyVar2 == null || kyVar2.getVisibility() != 0) {
                    return;
                }
                ky kyVar3 = this.z0;
                int defaultTabId = kyVar3.getDefaultTabId();
                ai.w0 w0Var = kyVar3.F;
                ArrayList arrayList2 = kyVar3.h;
                int i20 = kyVar3.l0.get(defaultTabId, -1);
                if (i20 < 0 || i20 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.j00 j00Var = (org.telegram.ui.Components.j00) arrayList2.get(i20);
                if (j00Var.d == ((ly) kyVar3.J).a(j00Var.a) || ((ly) kyVar3.J).a(j00Var.a) < 0) {
                    return;
                }
                w0Var.g1();
                if (kyVar3.m0.get(i20) != j00Var.a(true) || kyVar3.h0) {
                    kyVar3.h0 = true;
                    kyVar3.requestLayout();
                    w0Var.setItemAnimator(kyVar3.s0);
                    org.telegram.ui.Components.i00 i00Var = kyVar3.I;
                    if (i00Var != null) {
                        i00Var.l();
                    }
                    kyVar3.M = 0;
                    org.telegram.ui.Components.j00 d = kyVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        kyVar3.M = org.telegram.messenger.q.C(24.0f, ((org.telegram.ui.Components.j00) arrayList2.get(i21)).a(true), kyVar3.M);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                p5(0, true);
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                p5(0, true);
                return;
            }
            if (i10 == NotificationCenter.emojiLoaded) {
                if (this.e0 != null) {
                    int i22 = 0;
                    while (true) {
                        ty[] tyVarArr3 = this.e0;
                        if (i22 >= tyVarArr3.length) {
                            break;
                        }
                        qy qyVar = tyVarArr3[i22].a;
                        if (qyVar != null) {
                            for (int i23 = 0; i23 < qyVar.getChildCount(); i23++) {
                                View childAt = qyVar.getChildAt(i23);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i22++;
                    }
                }
                ky kyVar4 = this.z0;
                if (kyVar4 != null) {
                    kyVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.closeSearchByActiveAction) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.h(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.proxySettingsChanged) {
                i5(false, false);
                return;
            }
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                p5(num.intValue(), true);
                ky kyVar5 = this.z0;
                if (kyVar5 != null && kyVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
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
                m5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i25 = NotificationCenter.appDidLogout;
            boolean[] zArr = w4;
            if (i10 == i25) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                p5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.c20 c20Var = this.t0;
                if (c20Var != null) {
                    z11 = c20Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (ty tyVar2 : this.e0) {
                    tyVar2.d.e = false;
                }
                if (z11) {
                    I4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.tr.f);
                    this.d0.addUpdateListener(new rv(this, 0));
                    this.d0.start();
                }
                int i26 = 0;
                boolean z13 = false;
                while (true) {
                    ty[] tyVarArr4 = this.e0;
                    if (i26 >= tyVarArr4.length) {
                        break;
                    }
                    if (!tyVarArr4[i26].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z13 = true;
                    } else {
                        this.e0[i26].d.l();
                    }
                    i26++;
                }
                if (z13) {
                    p5(0, true);
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
                    ty[] tyVarArr5 = this.e0;
                    if (i27 >= tyVarArr5.length) {
                        p5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (tyVarArr5[i27].p() && AndroidUtilities.isTablet()) {
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
                    p5(0, true);
                    return;
                }
                if (i10 == NotificationCenter.messageReceivedByAck || i10 == NotificationCenter.messageReceivedByServer || i10 == NotificationCenter.messageSendError) {
                    p5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i10 == NotificationCenter.didSetPasscode) {
                    H3();
                    return;
                }
                if (i10 == NotificationCenter.needReloadRecentDialogsSearch) {
                    dy dyVar = this.C0;
                    if (dyVar == null || (jo0Var2 = dyVar.d0) == null || (i15 = jo0Var2.h0) == 15) {
                        return;
                    }
                    int i28 = jo0Var2.s0;
                    MessagesStorage.getInstance(i28).getStorageQueue().postRunnable(new gg.n(i28, i15, new gg.y(jo0Var2), false ? 1 : 0));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    p5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    dy dyVar2 = this.C0;
                    if (dyVar2 == null || (jo0Var = dyVar2.d0) == null) {
                        return;
                    }
                    jo0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        i5(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    i5(true, false);
                    dy dyVar3 = this.C0;
                    if (dyVar3 != null) {
                        int currentPosition = dyVar3.getCurrentPosition();
                        org.telegram.ui.Components.po0 po0Var = dyVar3.V;
                        l5(po0Var != null && po0Var.h(currentPosition) == 2);
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
                    Runnable uaVar = new ci.ua(this, chat2, longValue3, booleanValue, user, z10);
                    W3();
                    if (this.y0[0] == null) {
                        uaVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        uaVar.run();
                        return;
                    }
                    UndoView h42 = h4();
                    if (h42 != null) {
                        h42.j(booleanValue ? 1 : 95, longValue3, uaVar);
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
                    e5(true, true);
                    return;
                }
                if (i10 == NotificationCenter.filterSettingsUpdated) {
                    S4();
                    return;
                }
                int i30 = 6;
                if (i10 == NotificationCenter.newSuggestionsAvailable) {
                    U4();
                    d5();
                    int checkEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (checkEmailSuggestion != 0) {
                        ug0 ug0Var = new ug0();
                        jw jwVar = new jw(this, 5);
                        jw jwVar2 = new jw(this, i30);
                        boolean z14 = checkEmailSuggestion == 2;
                        ug0Var.F = 3;
                        ug0Var.a = 12;
                        ug0Var.d0 = jwVar;
                        ug0Var.e0 = jwVar2;
                        ug0Var.g0 = z14;
                        ug0Var.h0 = true;
                        presentFragment(ug0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.c20 c20Var2 = this.t0;
                    if (c20Var2 != null) {
                        c20Var2.f(true, true);
                    }
                    ty[] tyVarArr6 = this.e0;
                    if (tyVarArr6 != null) {
                        for (ty tyVar3 : tyVarArr6) {
                            zw zwVar = tyVar3.d;
                            zwVar.Q = false;
                            zwVar.e = true;
                            zwVar.l();
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
                    dy dyVar4 = this.C0;
                    HashMap hashMap = dyVar4.B0;
                    SparseArray sparseArray = dyVar4.h;
                    int size2 = sparseArray.size();
                    for (int i31 = 0; i31 < size2; i31++) {
                        View view = (View) sparseArray.valueAt(i31);
                        if (view instanceof x10) {
                            ((x10) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i32 = 0; i32 < dyVar4.getChildCount(); i32++) {
                        if (dyVar4.getChildAt(i32) instanceof x10) {
                            ((x10) dyVar4.getChildAt(i32)).e(longValue4, arrayList3);
                        }
                    }
                    dyVar4.O0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    for (int i33 = 0; i33 < arrayList4.size(); i33 = i13 + 1) {
                        p10 p10Var = (p10) arrayList4.get(i33);
                        MessageObject messageObject = (MessageObject) hashMap.get(p10Var);
                        if (messageObject != null) {
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < 0) {
                                i14 = (int) (-dialogId);
                                i13 = i33;
                            } else {
                                i13 = i33;
                            }
                            i14 = 0;
                            if (i14 == longValue4) {
                                for (int i34 = 0; i34 < arrayList3.size(); i34++) {
                                    if (messageObject.getId() == ((Integer) arrayList3.get(i34)).intValue()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(p10Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i33;
                        }
                    }
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i35 = 0; i35 < size3; i35++) {
                            hashMap.remove(arrayList.get(i35));
                        }
                        dyVar4.z0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.v0 v0Var = dyVar4.E0;
                        if (v0Var != null) {
                            v0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.e0 != null) {
                        int i36 = 0;
                        while (true) {
                            ty[] tyVarArr7 = this.e0;
                            if (i36 >= tyVarArr7.length) {
                                break;
                            }
                            gg.j jVar = tyVarArr7[i36].d.P;
                            if (jVar != null) {
                                jVar.a.clear();
                                jVar.b.clear();
                                jVar.c.clear();
                                jVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(jVar.e);
                            }
                            i36++;
                        }
                    }
                    bb1 bb1Var = bb1.b;
                    if (bb1Var != null) {
                        bb1Var.dismiss();
                        bb1.b = null;
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
                    org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
                    if (c5Var == null || c5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.X2 == ((Long) objArr[0]).longValue()) {
                        z3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            bv bvVar = this.Q3;
                            if (bvVar == null || bvVar.getTag() == null) {
                                return;
                            }
                            bv bvVar2 = this.Q3;
                            bvVar2.animate().setListener(null).cancel();
                            bvVar2.animate().setListener(new org.telegram.ui.Components.cl0(i30, this, bvVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.Q3.setTag(null);
                            return;
                        }
                        if (this.Q3 == null) {
                            Context context = this.fragmentView.getContext();
                            bv bvVar3 = new bv(context);
                            LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
                            org.telegram.ui.Components.nj0 nj0Var = new org.telegram.ui.Components.nj0(context);
                            nj0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            nj0Var.getAnimatedDrawable().K(1);
                            nj0Var.d();
                            e7.addView(nj0Var, w7.z5.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i37 = org.telegram.ui.ActionBar.i6.G6;
                            com.google.android.gms.internal.vision.e2.p(i37, null, false, textView, 1);
                            TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.z5.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            h.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            h.setTextSize(1, 14.0f);
                            h.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            h.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i37, false));
                            h.setGravity(1);
                            TextView h10 = com.google.android.gms.internal.vision.e2.h(e7, h, w7.z5.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            h10.setTextSize(1, 14.0f);
                            h10.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            h10.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i37, false));
                            h10.setGravity(1);
                            e7.addView(h10, w7.z5.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            bvVar3.addView(e7, w7.z5.e(-1, -2, 16));
                            bvVar3.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                            bvVar3.setOnTouchListener(new av());
                            this.Q3 = bvVar3;
                            bvVar3.setAlpha(0.0f);
                            ((ny) this.fragmentView).addView(this.Q3);
                            this.Q3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                        }
                        this.Q3.setTag(1);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseOpened) {
                    if (getMessagesStorage().showClearDatabaseAlert) {
                        getMessagesStorage().showClearDatabaseAlert = false;
                        bb1.n(this);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.userEmojiStatusUpdated) {
                    m5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    m5(UserConfig.getInstance(i11).getCurrentUser(), true);
                    n5();
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    r4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i38 = 0;
                    while (true) {
                        ty[] tyVarArr8 = this.e0;
                        if (i38 >= tyVarArr8.length) {
                            return;
                        }
                        ty tyVar4 = tyVarArr8[i38];
                        if (tyVar4 != null && (((i12 = tyVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[tyVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            tyVar4.q(true);
                            return;
                        }
                        i38++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            o5(this.V);
                            p5(0, true);
                            return;
                        }
                        if (i10 == NotificationCenter.storiesEnabledUpdate) {
                            n5();
                            return;
                        }
                        if (i10 == NotificationCenter.unconfirmedAuthUpdate) {
                            d5();
                            return;
                        }
                        if (i10 == NotificationCenter.premiumPromoUpdated) {
                            d5();
                            return;
                        }
                        if (i10 == NotificationCenter.starBalanceUpdated || i10 == NotificationCenter.starSubscriptionsLoaded) {
                            d5();
                            return;
                        } else if (i10 == NotificationCenter.appConfigUpdated) {
                            d5();
                            return;
                        } else {
                            if (i10 == NotificationCenter.activeAuctionsUpdated) {
                                d5();
                                return;
                            }
                            return;
                        }
                    }
                    long longValue6 = ((Long) objArr[0]).longValue();
                    int i39 = 0;
                    while (true) {
                        ty[] tyVarArr9 = this.e0;
                        if (i39 >= tyVarArr9.length) {
                            return;
                        }
                        ty tyVar5 = tyVarArr9[i39];
                        if (tyVar5.a != null) {
                            int i40 = 0;
                            while (true) {
                                if (i40 < tyVar5.a.getChildCount()) {
                                    View childAt2 = tyVar5.a.getChildAt(i40);
                                    if (childAt2 instanceof org.telegram.ui.Cells.s2) {
                                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt2;
                                        if (longValue6 == s2Var.getDialogId()) {
                                            s2Var.t();
                                            break;
                                        }
                                    }
                                    i40++;
                                }
                            }
                        }
                        i39++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof ei.l3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4() {
        mx mxVar = this.F3;
        if (mxVar == null || !mxVar.c()) {
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
    public final void e5(boolean z10, boolean z11) {
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
        mx mxVar = this.F3;
        if (mxVar != null && mxVar.c()) {
            return;
        }
        org.telegram.ui.Components.b80 b80Var = this.L0;
        if (b80Var != null) {
            b80Var.u();
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
                    boolean z16 = (this.isPaused || this.Q3 != null) ? false : z11;
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
                ky kyVar = this.z0;
                kyVar.h.clear();
                kyVar.j0.clear();
                kyVar.l0.clear();
                kyVar.m0.clear();
                kyVar.n0.clear();
                kyVar.o0.clear();
                kyVar.M = 0;
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
                            ky kyVar2 = this.z0;
                            if (kyVar2.h(kyVar2.k0.get(currentTabId, -1))) {
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
                    ty[] tyVarArr = this.e0;
                    if (i13 >= tyVarArr.length) {
                        break;
                    }
                    if (tyVarArr[i13].h >= dialogFilters.size()) {
                        this.e0[i13].h = dialogFilters.size() - 1;
                    }
                    this.e0[i13].a.setScrollingTouchSlop(1);
                    i13++;
                }
                ky kyVar3 = this.z0;
                kyVar3.F.setItemAnimator(z15 ? kyVar3.s0 : null);
                kyVar3.I.l();
                if (isEmpty) {
                    a5(false);
                }
                ky kyVar4 = this.z0;
                int currentTabId2 = kyVar4.getCurrentTabId();
                ArrayList arrayList = kyVar4.h;
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        z13 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.j00) arrayList.get(i14)).a == currentTabId2) {
                            z13 = ((org.telegram.ui.Components.j00) arrayList.get(i14)).f;
                            break;
                        }
                        i14++;
                    }
                }
                if (z13) {
                    ky kyVar5 = this.z0;
                    ArrayList arrayList2 = kyVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        kyVar5.f((org.telegram.ui.Components.j00) arrayList2.get(0), 0);
                        c5(r52);
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
                            a5(false);
                            return;
                        }
                        return;
                    }
                }
            }
            r52 = 0;
            c5(r52);
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
                R4(false);
                this.m3 = false;
                if (this.l3) {
                    this.l3 = false;
                    this.e0[0].setTranslationX(0.0f);
                    this.e0[1].setTranslationX(r2[0].getMeasuredWidth());
                }
                if (this.e0[0].h != this.z0.getDefaultTabId()) {
                    this.e0[0].h = this.z0.getDefaultTabId();
                    zw zwVar = this.e0[0].d;
                    zwVar.h = 0;
                    zwVar.l();
                    ty tyVar = this.e0[0];
                    tyVar.s = this.R0;
                    tyVar.d.l();
                }
                this.e0[1].setVisibility(8);
                ty tyVar2 = this.e0[1];
                tyVar2.h = 0;
                zw zwVar2 = tyVar2.d;
                zwVar2.h = 0;
                zwVar2.l();
                ty tyVar3 = this.e0[1];
                tyVar3.s = this.R0;
                tyVar3.d.l();
                this.w = false;
                if (this.fragmentView != null) {
                    boolean z17 = (this.isPaused || this.Q3 != null) ? false : z11;
                    if (!this.p3) {
                        bVar.a(false, z17);
                    }
                }
                int i15 = 0;
                while (true) {
                    ty[] tyVarArr2 = this.e0;
                    if (i15 >= tyVarArr2.length) {
                        break;
                    }
                    ty tyVar4 = tyVarArr2[i15];
                    if (tyVar4.s == 0 && tyVar4.v == 2 && i4() && ((L0 = this.e0[i15].c.L0()) == 0 || L0 == 1)) {
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
            c5(r52);
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

    public final float f4() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.b.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f5(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        dy dyVar;
        boolean z13;
        org.telegram.ui.Components.g91 g91Var;
        if (!this.p3 || this.l2 || (dyVar = this.C0) == null) {
            return;
        }
        ArrayList<gg.q0> currentSearchFilters = dyVar.getCurrentSearchFilters();
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
                this.b0.B1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.b0.B1(null, null, false);
                }
                if (!z12) {
                    this.b0.getAdapter().l();
                }
                g91Var = this.a0;
                if (g91Var != null) {
                    g91Var.b(z13, true);
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
        g91Var = this.a0;
        if (g91Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.b80 b80Var = this.L0;
        if (b80Var != null) {
            b80Var.u();
        }
    }

    public final ai.l9 g4() {
        return getMessagesController().getStoriesController();
    }

    public final void g5() {
        float f7 = (((-this.f4) - this.i4) - this.u1) - this.v1;
        org.telegram.ui.Components.c20 c20Var = this.t0;
        if (c20Var != null) {
            c20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.c20 c20Var2 = this.u0;
        if (c20Var2 != null) {
            c20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ci.e4 e4Var = this.p0;
            if (e4Var != null) {
                e4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.y4 getBackButtonState() {
        return (n4() || this.F3.f) ? org.telegram.ui.ActionBar.y4.a : org.telegram.ui.ActionBar.y4.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W3, 1.0f);
            this.Z3 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new rv(this, 2));
        this.Z3.setInterpolator(org.telegram.ui.Components.tr.g);
        this.Z3.setDuration(clamp);
        this.Z3.start();
        return this.Z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x03a6  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        gg.m mVar;
        org.telegram.ui.Components.zl0 zl0Var;
        final int i10 = 0;
        org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6(this) { // from class: org.telegram.ui.ow
            public final /* synthetic */ uy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final /* synthetic */ void a(float f7) {
                int i11 = i10;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final void b() {
                switch (i10) {
                    case 0:
                        uy.H0(this.b);
                        break;
                    default:
                        uy uyVar = this.b;
                        dy dyVar = uyVar.C0;
                        if (dyVar != null) {
                            org.telegram.ui.ActionBar.z actionMode = dyVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.w8));
                            }
                            org.telegram.ui.ActionBar.v0 speedItem = uyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.SRC_IN));
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
        int i11 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i11));
        org.telegram.ui.Cells.s2 s2Var = this.X0;
        if (s2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(s2Var, 1, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        }
        int i12 = this.V2;
        Paint paint = this.f1;
        final int i13 = 1;
        if (i12 == 0) {
            if (this.l2) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, paint, null, null, i11));
            dy dyVar = this.C0;
            if (dyVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(dyVar.a0, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.s1}, null, !this.W ? org.telegram.ui.ActionBar.i6.A8 : org.telegram.ui.ActionBar.i6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, paint, null, null, i11));
            dy dyVar2 = this.C0;
            if (dyVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(dyVar2.a0, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.s1}, null, !this.W ? org.telegram.ui.ActionBar.i6.P8 : org.telegram.ui.ActionBar.i6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.i6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.R8));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.i6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.i6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.i6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h1, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.I5));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 == null || !kVar2.s()) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0, 0, new Class[]{org.telegram.ui.Components.n00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.i6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.l00.class}, null, null, null, org.telegram.ui.ActionBar.i6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.l00.class}, null, null, null, org.telegram.ui.ActionBar.i6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0, 0, new Class[]{org.telegram.ui.Components.n00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.i6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.l00.class}, null, null, null, org.telegram.ui.ActionBar.i6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.l00.class}, null, null, null, org.telegram.ui.ActionBar.i6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.l00.class}, null, null, null, org.telegram.ui.ActionBar.i6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.l00.class}, null, null, null, org.telegram.ui.ActionBar.i6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.l00.class}, null, null, null, org.telegram.ui.ActionBar.i6.U9));
        }
        arrayList.addAll(w7.c6.a(new org.telegram.ui.ActionBar.j6(this) { // from class: org.telegram.ui.ow
            public final /* synthetic */ uy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final /* synthetic */ void a(float f7) {
                int i112 = i13;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final void b() {
                switch (i13) {
                    case 0:
                        uy.H0(this.b);
                        break;
                    default:
                        uy uyVar = this.b;
                        dy dyVar3 = uyVar.C0;
                        if (dyVar3 != null) {
                            org.telegram.ui.ActionBar.z actionMode = dyVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.w8));
                            }
                            org.telegram.ui.ActionBar.v0 speedItem = uyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.SRC_IN));
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
        }, org.telegram.ui.ActionBar.i6.w8, i14));
        int i15 = 0;
        while (true) {
            if (i15 >= 3) {
                break;
            }
            if (i15 == 2) {
                dy dyVar3 = this.C0;
                if (dyVar3 != null) {
                    zl0Var = dyVar3.a0;
                    if (zl0Var != null) {
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i10] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr2[1] = org.telegram.ui.Cells.i6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.i6.r0, null, org.telegram.ui.ActionBar.i6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i10] = org.telegram.ui.Cells.s2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.i6.w0;
                        int i16 = org.telegram.ui.ActionBar.i6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr3, paint2, null, null, i16));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i10] = org.telegram.ui.Cells.s2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.i6.y0;
                        int i17 = org.telegram.ui.ActionBar.i6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr4, paint3, null, null, i17));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr5, org.telegram.ui.ActionBar.i6.L0, null, null, org.telegram.ui.ActionBar.i6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr6[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i10] = org.telegram.ui.ActionBar.i6.a1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.i6.a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr7[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i10] = org.telegram.ui.ActionBar.i6.g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.i6.h1;
                        int i18 = org.telegram.ui.ActionBar.i6.j9;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr7, null, drawableArr2, null, i18));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i10] = org.telegram.ui.ActionBar.i6.j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.i6.k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.i6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.i6.b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i10] = org.telegram.ui.ActionBar.i6.l1;
                        int i19 = org.telegram.ui.ActionBar.i6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr9, null, drawableArr4, null, i19));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr10[1] = org.telegram.ui.Cells.i6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, clsArr10, null, new Paint[]{textPaintArr[i10], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, null, org.telegram.ui.ActionBar.i6.X8));
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, null, org.telegram.ui.ActionBar.i6.Z8));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.F0[1], null, null, org.telegram.ui.ActionBar.i6.i9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.F0[0], null, null, org.telegram.ui.ActionBar.i6.g9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.G0, null, null, org.telegram.ui.ActionBar.i6.m9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i18));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.i6.H0, null, null, org.telegram.ui.ActionBar.i6.p9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.I0, null, null, org.telegram.ui.ActionBar.i6.q9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.J0, null, null, org.telegram.ui.ActionBar.i6.r9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.K0, null, null, i19));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.v0, null, null, org.telegram.ui.ActionBar.i6.s9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.u0, null, null, org.telegram.ui.ActionBar.i6.t9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.T0}, null, org.telegram.ui.ActionBar.i6.u9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.V0, org.telegram.ui.ActionBar.i6.W0}, null, org.telegram.ui.ActionBar.i6.v9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.X0}, null, org.telegram.ui.ActionBar.i6.w9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.x0, null, null, org.telegram.ui.ActionBar.i6.x9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.Y0}, null, org.telegram.ui.ActionBar.i6.y9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.i1}, null, org.telegram.ui.ActionBar.i6.A9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f1}, null, org.telegram.ui.ActionBar.i6.z9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.c1}, null, org.telegram.ui.ActionBar.i6.B9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.m1}, null, i16));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.n1}, null, org.telegram.ui.ActionBar.i6.Z5));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.o1}, null, org.telegram.ui.ActionBar.i6.zj));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.p1, org.telegram.ui.ActionBar.i6.q1, org.telegram.ui.ActionBar.i6.r1}, null, i17));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.i6.d9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.i6.c9));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.i6.T8));
                        int i20 = org.telegram.ui.ActionBar.i6.d6;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 8192, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 16384, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.i6.k7));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.i6.h6));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.i6.Q0, null, null, org.telegram.ui.ActionBar.i6.A6));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.i6.class}, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.p6));
                        org.telegram.ui.Cells.v3.a(arrayList, zl0Var);
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 4, new Class[]{org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.i6.G6));
                        int i21 = org.telegram.ui.ActionBar.i6.b7;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i21));
                        int i22 = org.telegram.ui.ActionBar.i6.a7;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i21));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.i6.B6));
                        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.i6.o6));
                        i15++;
                        i10 = 0;
                    }
                }
                i15++;
                i10 = 0;
            } else {
                ty[] tyVarArr = this.e0;
                if (tyVarArr != null) {
                    zl0Var = i15 < tyVarArr.length ? tyVarArr[i15].a : null;
                    if (zl0Var != null) {
                    }
                }
                i15++;
                i10 = 0;
            }
        }
        int i23 = org.telegram.ui.ActionBar.i6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.V7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.W7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.X7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Y7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Z7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.a8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.b8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.L7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.M7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.N7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.k9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.j9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.o9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Y8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.l9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.n9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.h9));
        if (this.e0 != null) {
            int i24 = 0;
            while (true) {
                ty[] tyVarArr2 = this.e0;
                if (i24 >= tyVarArr2.length) {
                    break;
                }
                if (this.V2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.k6(tyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.k6(tyVarArr2[i24].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
                }
                int i25 = org.telegram.ui.ActionBar.i6.m9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, 4, new Class[]{org.telegram.ui.Cells.y2.class}, new String[]{"emptyTextView1"}, null, null, null, i25));
                int i26 = org.telegram.ui.ActionBar.i6.g9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, 4, new Class[]{org.telegram.ui.Cells.y2.class}, new String[]{"emptyTextView2"}, null, null, null, i26));
                if (SharedConfig.archiveHidden) {
                    org.telegram.ui.Components.kj0[] kj0VarArr = {org.telegram.ui.ActionBar.i6.u1};
                    int i27 = org.telegram.ui.ActionBar.i6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, kj0VarArr, "Arrow1", i27));
                    arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.u1}, "Arrow2", i27));
                } else {
                    org.telegram.ui.Components.kj0[] kj0VarArr2 = {org.telegram.ui.ActionBar.i6.u1};
                    int i28 = org.telegram.ui.ActionBar.i6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, kj0VarArr2, "Arrow1", i28));
                    arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.u1}, "Arrow2", i28));
                }
                org.telegram.ui.Components.kj0[] kj0VarArr3 = {org.telegram.ui.ActionBar.i6.u1};
                int i29 = org.telegram.ui.ActionBar.i6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, kj0VarArr3, "Box2", i29));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.u1}, "Box1", i29));
                org.telegram.ui.Components.kj0[] kj0VarArr4 = {org.telegram.ui.ActionBar.i6.x1};
                int i30 = org.telegram.ui.ActionBar.i6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, kj0VarArr4, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.x1}, "Line", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.y1}, "Arrow", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.y1}, "Line", i30));
                org.telegram.ui.Components.kj0[] kj0VarArr5 = {org.telegram.ui.ActionBar.i6.v1};
                int i31 = org.telegram.ui.ActionBar.i6.c9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, kj0VarArr5, "Arrow", i31));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.v1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.v1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.z1}, "Line 1", i31));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.z1}, "Line 2", i31));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.z1}, "Line 3", i31));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.z1}, "Cup Red", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.z1}, "Box", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.w1}, "Arrow1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.w1}, "Arrow2", org.telegram.ui.ActionBar.i6.d9));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.w1}, "Box2", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, new Class[]{org.telegram.ui.Cells.s2.class}, new org.telegram.ui.Components.kj0[]{org.telegram.ui.ActionBar.i6.w1}, "Box1", i30));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i24].a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.G6));
                int i32 = i24;
                org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, j6Var2, org.telegram.ui.ActionBar.i6.y6));
                j6Var = j6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, j6Var2, org.telegram.ui.ActionBar.i6.il));
                int i33 = org.telegram.ui.ActionBar.i6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i32].a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, null, i33));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i32].w, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.h6));
                mVar = this.e0[i32].d;
                mVar.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.i6.U8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"headerTextView"}, null, null, null, i25));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"messageTextView"}, null, null, null, i26));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
                i24 = i32 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.S9));
        dy dyVar4 = this.C0;
        if (dyVar4 != null) {
            org.telegram.ui.Components.jo0 jo0Var = dyVar4.d0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(jo0Var != null ? jo0Var.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.i6.w0, null, null, org.telegram.ui.ActionBar.i6.U8));
            org.telegram.ui.Components.jo0 jo0Var2 = this.C0.d0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(jo0Var2 != null ? jo0Var2.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.i6.y0, null, null, org.telegram.ui.ActionBar.i6.V8));
            org.telegram.ui.Components.jo0 jo0Var3 = this.C0.d0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(jo0Var3 != null ? jo0Var3.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.i6.L0, null, null, org.telegram.ui.ActionBar.i6.W8));
            org.telegram.ui.Components.jo0 jo0Var4 = this.C0.d0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(jo0Var4 != null ? jo0Var4.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, org.telegram.ui.ActionBar.i6.N0, null, null, org.telegram.ui.ActionBar.i6.f9));
            org.telegram.ui.Components.jo0 jo0Var5 = this.C0.d0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(jo0Var5 != null ? jo0Var5.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.G6));
            org.telegram.ui.Components.jo0 jo0Var6 = this.C0.d0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(jo0Var6 != null ? jo0Var6.I() : null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, null, null, null, org.telegram.ui.ActionBar.i6.T8));
        }
        int i34 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i34 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i34];
            int i35 = org.telegram.ui.ActionBar.i6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView, 32, null, null, null, null, i35));
            int i36 = org.telegram.ui.ActionBar.i6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i36));
            int i37 = org.telegram.ui.ActionBar.i6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", i35));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", i35));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", i37));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i34], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", i37));
            i34++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.o5));
        int i38 = org.telegram.ui.ActionBar.i6.q7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ri));
        int i39 = org.telegram.ui.ActionBar.i6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Xi));
        if (this.B1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.B1, 0, null, org.telegram.ui.ActionBar.i6.j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.B1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.i3}, null, org.telegram.ui.ActionBar.i6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.B1, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Ud));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.B1, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Wd));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.B1, TLObject.FLAG_23, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Vd));
        }
        int i40 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i40));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i39));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.g8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.hh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.jk));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.kk));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.lk));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.mk));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.hk));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.ik));
        gg.s0 s0Var = this.b0;
        if (s0Var != null) {
            arrayList.addAll(s0Var.getThemeDescriptions());
            this.b0.C1();
        }
        wy wyVar = this.h0;
        if (wyVar != null) {
            wyVar.a();
            this.h0.invalidate();
        }
        dy dyVar5 = this.C0;
        if (dyVar5 != null) {
            dyVar5.O(arrayList);
        }
        org.telegram.ui.Cells.a3 a3Var = this.M1;
        int i41 = 8;
        if (a3Var != null) {
            arrayList.addAll(w7.c6.a(new org.telegram.ui.Components.y6(new bj(a3Var, 19), i41), org.telegram.ui.ActionBar.i6.d6, i40, org.telegram.ui.ActionBar.i6.y6));
        }
        org.telegram.ui.Cells.wa waVar = this.N1;
        if (waVar != null) {
            arrayList.addAll(w7.c6.a(new org.telegram.ui.Components.y6(new bj(waVar, 20), i41), org.telegram.ui.ActionBar.i6.d6, i40, org.telegram.ui.ActionBar.i6.y6, org.telegram.ui.ActionBar.i6.I6, i38));
        }
        org.telegram.ui.Cells.m mVar2 = this.L1;
        if (mVar2 != null) {
            arrayList.addAll(w7.c6.a(new org.telegram.ui.Components.y6(new bj(mVar2, 21), i41), org.telegram.ui.ActionBar.i6.d6, i40, org.telegram.ui.ActionBar.i6.y6, org.telegram.ui.ActionBar.i6.I6, i38));
        }
        return arrayList;
    }

    public final UndoView h4() {
        W3();
        UndoView[] undoViewArr = this.y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            ny nyVar = (ny) this.fragmentView;
            nyVar.removeView(undoViewArr[0]);
            nyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void h5(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.T3;
        org.telegram.ui.Components.c20 c20Var = this.t0;
        if (c20Var != null) {
            c20Var.e(z12, z10);
        }
        org.telegram.ui.Components.c20 c20Var2 = this.u0;
        if (c20Var2 != null) {
            c20Var2.e(z12, z10);
        }
    }

    public final boolean i4() {
        return !this.l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void i5(boolean z10, boolean z11) {
        boolean z12;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.v0 v0Var = this.m0;
            if (v0Var == null || v0Var.getVisibility() != 0) {
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
                G3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.d2;
                boolean z14 = i11 == 3 || i11 == 5;
                this.o0.setSubtext(LocaleController.getString(z13 ? z14 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.n0.b(z13, z14, z10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        mx mxVar;
        return (this.j2 || (mxVar = this.F3) == null || mxVar.getFragment() == null) ? i0.a.f(getThemedColor(org.telegram.ui.ActionBar.i6.d6)) > 0.699999988079071d : this.F3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j4() {
        ArrayList arrayList = this.D2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void j5() {
        org.telegram.ui.Components.fr0 fr0Var;
        cx cxVar = this.B1;
        ArrayList arrayList = this.I2;
        if (cxVar == null) {
            if (this.R0 == 10) {
                l4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        k5();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.R0 == 3 && this.f2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.G(string, true, 350L, org.telegram.ui.Components.tr.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.n0(false, false, false);
                this.B1.N();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!j4() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.V3 && (fr0Var = this.G2) != null) {
                    this.V3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    fr0Var.j();
                    fr0Var.F = string2;
                    org.telegram.ui.Components.dr0 dr0Var = fr0Var.a[0];
                    if (string2 != null) {
                        dr0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.gq0 gq0Var = new org.telegram.ui.Components.gq0(fr0Var, 1);
                    fr0Var.G = gq0Var;
                    AndroidUtilities.runOnUIThread(gq0Var, 1000L);
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
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.G(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.tr.h);
            }
        }
        this.P3 = arrayList.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k4(boolean z10) {
        boolean z11;
        this.actionBar.r();
        this.I2.clear();
        org.telegram.ui.ActionBar.g2 g2Var = this.e1;
        int i10 = 1;
        if (g2Var != null) {
            g2Var.c(0.0f, true);
        }
        ky kyVar = this.z0;
        if (kyVar != null) {
            kyVar.b(org.telegram.ui.ActionBar.i6.K8, org.telegram.ui.ActionBar.i6.I8, org.telegram.ui.ActionBar.i6.J8, org.telegram.ui.ActionBar.i6.L8, org.telegram.ui.ActionBar.i6.d6);
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
        L4(-c4());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ty[] tyVarArr = this.e0;
            if (i12 >= tyVarArr.length) {
                break;
            }
            ty tyVar = tyVarArr[i12];
            if (tyVar != null) {
                tyVar.a.J0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, 0.0f);
        this.u3 = ofFloat;
        ofFloat.addUpdateListener(new yv(this, max, i10));
        this.u3.addListener(new vx(this, max, i11));
        this.u3.setInterpolator(org.telegram.ui.Components.tr.f);
        this.u3.setDuration(200L);
        this.u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        c5(true);
        if (this.e0 != null) {
            int i14 = 0;
            while (true) {
                ty[] tyVarArr2 = this.e0;
                if (i14 >= tyVarArr2.length) {
                    break;
                }
                tyVarArr2[i14].d.H = z11;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i16 = z11;
        if (z10) {
            i16 = MessagesController.UPDATE_MASK_CHAT;
        }
        p5(i16 | i15, true);
    }

    public final void k5() {
        org.telegram.ui.Components.fr0 fr0Var = this.G2;
        if (fr0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        fr0Var.h(i10);
        fr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = fr0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.dr0 dr0Var = fr0Var.a[0];
        if (fr0Var.b == 1) {
            dr0Var.d.l(fr0Var.c(dr0Var), false);
        }
    }

    public final void l4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (z10 && this.b2) {
            return;
        }
        this.T3 = z10;
        h5(true);
        if (z10) {
            ci.e4 e4Var = this.p0;
            if (e4Var != null) {
                e4Var.e(true);
            }
            ci.e4 e4Var2 = this.q0;
            if (e4Var2 != null) {
                e4Var2.e(true);
            }
        }
    }

    public final void l5(boolean z10) {
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

    public final void m5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.o5 o5Var;
        jx jxVar = this.E0;
        org.telegram.ui.Components.o5 o5Var2 = null;
        if (jxVar != null && (o5Var = jxVar.a0) != null && jxVar.q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                o5Var.j(emojiStatusDocumentId.longValue(), z10);
                o5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(jxVar.f).isPremiumUser(user)) {
                o5Var.g(null, z10);
                o5Var.m(false, z10);
            } else {
                if (jxVar.N0 == null) {
                    jxVar.N0 = jxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    jxVar.N0 = new ai.p(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), jxVar.N0);
                }
                jxVar.N0.setColorFilter(new PorterDuffColorFilter(jxVar.f(org.telegram.ui.ActionBar.i6.zh), PorterDuff.Mode.MULTIPLY));
                o5Var.g(jxVar.N0, z10);
                o5Var.m(false, z10);
            }
            o5Var.k(Integer.valueOf(jxVar.f(org.telegram.ui.ActionBar.i6.zh)));
            jxVar.W.invalidate();
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
            this.actionBar.setRightDrawableOnClick(new wv(this, 2));
            a71.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.D3.g(null, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.K3 == null) {
                this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.K3 = new zx(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
            }
            this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.zh), PorterDuff.Mode.MULTIPLY));
            this.D3.g(this.K3, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new wv(this, 3));
            a71.t(this.currentAccount);
        }
        org.telegram.ui.Components.o5 o5Var3 = this.D3;
        int i10 = org.telegram.ui.ActionBar.i6.zh;
        o5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.E3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        ox oxVar = this.M0;
        if (oxVar == null || !(oxVar.getContentView() instanceof a71)) {
            return;
        }
        org.telegram.ui.ActionBar.i5 titleTextView = this.actionBar.getTitleTextView();
        a71 a71Var = (a71) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.o5 o5Var4 = this.D3;
            if (rightDrawable == o5Var4) {
                o5Var2 = o5Var4;
            }
        }
        a71Var.y(o5Var2, titleTextView);
    }

    public final boolean n4() {
        return this.V2 == 1;
    }

    public final void n5() {
        ci.e4 e4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.N3 != storiesEnabled) {
            g5();
            if (!this.N3 && storiesEnabled && (e4Var = this.p0) != null) {
                e4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.c20 c20Var = this.t0;
        if (c20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            c20Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            c20Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public final boolean o4(long j3) {
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

    public final void o5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        ai.l9 g42;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        mx mxVar = this.F3;
        if ((mxVar != null && mxVar.c()) || this.p3 || (kVar = this.actionBar) == null || kVar.s() || this.l2) {
            return;
        }
        ci.kc kcVar = ci.kc.F2;
        int i10 = 0;
        if ((kcVar != null && kcVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !n4() && g4().G();
        if (this.X2 != 0) {
            z11 = false;
        } else if (n4()) {
            z11 = !g4().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (g42 = g4()).g) != null && arrayList.size() > 0) || g42.H());
            z12 = g4().G();
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
                ofFloat.addUpdateListener(new aj(i11, this));
                this.J.addListener(new org.telegram.ui.Components.b91(this, 18));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.tr.f);
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
            float c42 = z11 ? 0.0f : c4();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new ay(this, f7, z11, c42));
            this.I.addListener(new sx(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.tr.f);
            this.I.start();
            return;
        }
        this.K = z11;
        jx jxVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        jxVar.setVisibility(i13);
        if (z11) {
            this.x3 = -AndroidUtilities.dp(81.0f);
            L4(-c4());
        } else {
            L4(0.0f);
        }
        while (true) {
            ty[] tyVarArr = this.e0;
            if (i10 >= tyVarArr.length) {
                break;
            }
            ty tyVar = tyVarArr[i10];
            if (tyVar != null) {
                tyVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.F3.c() || !this.F3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.b80 b80Var = this.L0;
            if (b80Var == null) {
                ky kyVar = this.z0;
                if (kyVar == null || !kyVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.s()) {
                        if (!this.b.f) {
                            ky kyVar2 = this.z0;
                            if (kyVar2 != null && kyVar2.getVisibility() == 0 && !this.g3) {
                                ky kyVar3 = this.z0;
                                if (!kyVar3.O && !this.l3) {
                                    ArrayList arrayList = kyVar3.h;
                                    if (!arrayList.isEmpty() && kyVar3.L != ((org.telegram.ui.Components.j00) arrayList.get(0)).a) {
                                        if (z10) {
                                            ky kyVar4 = this.z0;
                                            ArrayList arrayList2 = kyVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                kyVar4.f((org.telegram.ui.Components.j00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            cx cxVar = this.B1;
                            if (cxVar == null || !cxVar.t0()) {
                                jx jxVar = this.E0;
                                if (jxVar.O != 0 || jxVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                jxVar.h.y0(0);
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
                        dy dyVar = this.C0;
                        if (dyVar != null && dyVar.getVisibility() == 0) {
                            this.C0.S(false);
                        }
                        k4(true);
                        return false;
                    }
                } else if (z10) {
                    kyVar.setIsEditing(false);
                    R4(false);
                    return false;
                }
            } else if (z10) {
                b80Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.F3.a();
            dy dyVar2 = this.C0;
            if (dyVar2 != null) {
                dyVar2.T();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        ci.ab abVar;
        ky kyVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                dy dyVar = this.C0;
                if (dyVar != null) {
                    dyVar.d0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (kyVar = this.z0) != null && kyVar.getVisibility() == 0 && this.r.f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.e0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        K3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        ci.e4 e4Var;
        super.onBecomeFullyVisible();
        if (n4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = a4(this.currentAccount, this.R0, this.V2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                P4();
            }
        }
        if (this.r0 && !this.s0 && (e4Var = this.p0) != null && this.N3) {
            this.s0 = true;
            this.r0 = false;
            e4Var.u();
        }
        AndroidUtilities.runOnUIThread(new jw(this, 2), 200L);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.b80 b80Var = this.L0;
        if (b80Var != null) {
            b80Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (b2Var = this.T1) != null && dialog == b2Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        if (this.n2 == null) {
            this.d2 = getConnectionsManager().getConnectionState();
            this.J3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.l2) {
                this.J3.addGlobal(NotificationCenter.closeSearchByActiveAction);
                this.J3.addGlobal(NotificationCenter.proxySettingsChanged);
                this.J3.add(NotificationCenter.filterSettingsUpdated);
                this.J3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.J3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.J3.addGlobal(NotificationCenter.didSetPasscode);
        }
        this.J3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.J3.add(NotificationCenter.chatlistFolderUpdate);
            this.J3.add(NotificationCenter.dialogTranslate);
        }
        r4(getAccountInstance());
        ai.l9 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ai.y7(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.Q3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            bv bvVar = this.Q3;
            if (bvVar.getParent() != null) {
                ((ViewGroup) bvVar.getParent()).removeView(bvVar);
            }
            this.Q3 = null;
        }
        if (n4()) {
            ai.l9 storiesController2 = getMessagesController().getStoriesController();
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
        this.h4 = this.W ? AndroidUtilities.dp(72.0f) : 0;
        this.i4 = this.W ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.J3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.J3 = null;
        }
        cx cxVar = this.B1;
        if (cxVar != null) {
            cxVar.B0();
        }
        org.telegram.ui.Components.fr0 fr0Var = this.G2;
        if (fr0Var != null) {
            fr0Var.j();
        }
        cu cuVar = this.H2;
        if (cuVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cuVar);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.o3.unlock();
        this.C2 = null;
        bb1 bb1Var = bb1.b;
        if (bb1Var != null) {
            bb1Var.dismiss();
            bb1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        cx cxVar = this.B1;
        int i10 = 0;
        if (cxVar == null || !cxVar.t0()) {
            while (true) {
                ty[] tyVarArr = this.e0;
                if (i10 >= tyVarArr.length) {
                    break;
                }
                tyVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.rc rcVar = this.n3;
                if (rcVar != null) {
                    rcVar.l();
                }
            }
            dy dyVar = this.C0;
            if (dyVar != null) {
                dyVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f7);
        while (true) {
            ty[] tyVarArr2 = this.e0;
            if (i10 >= tyVarArr2.length) {
                break;
            }
            tyVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.rc rcVar2 = this.n3;
            if (rcVar2 != null) {
                rcVar2.l();
            }
        }
        dy dyVar2 = this.C0;
        if (dyVar2 != null) {
            dyVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.rc rcVar = this.S;
        if (rcVar != null) {
            rcVar.b();
            this.S = null;
        }
        mx mxVar = this.F3;
        if (mxVar != null) {
            mxVar.r = true;
            tx txVar = mxVar.a;
            if (txVar != null) {
                txVar.onPause();
            }
        }
        org.telegram.ui.Components.b80 b80Var = this.L0;
        if (b80Var != null) {
            b80Var.u();
        }
        cx cxVar = this.B1;
        if (cxVar != null) {
            cxVar.D0();
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
            ty[] tyVarArr = this.e0;
            if (i10 >= tyVarArr.length) {
                return;
            }
            tyVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        int i11 = 1;
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
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i13] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            dk0.m();
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
                            AndroidUtilities.runOnUIThread(new jw(this, i11));
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
            S4();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        uy uyVar;
        ty tyVar;
        zw zwVar;
        int i10;
        org.telegram.ui.Components.jo0 jo0Var;
        ci.ab abVar;
        super.onResume();
        jx jxVar = this.E0;
        if (jxVar != null) {
            ArrayList arrayList = jxVar.x;
            ai.l9 l9Var = jxVar.s;
            l9Var.l(l9Var.g);
            l9Var.l(l9Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y3 = l9Var.y(((ai.w) arrayList.get(i11)).c);
                if (y3 != null) {
                    l9Var.X(y3);
                }
            }
        }
        mx mxVar = this.F3;
        if (mxVar != null) {
            mxVar.r = false;
            tx txVar = mxVar.a;
            if (txVar != null) {
                txVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                ty[] tyVarArr = this.e0;
                if (i12 >= tyVarArr.length) {
                    break;
                }
                tyVarArr[i12].d.l();
                i12++;
            }
        }
        cx cxVar = this.B1;
        if (cxVar != null) {
            cxVar.E0();
        }
        long j3 = 0;
        if (!this.l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        dy dyVar = this.C0;
        if (dyVar != null && (jo0Var = dyVar.d0) != null) {
            jo0Var.l();
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
                uyVar = this;
                org.telegram.messenger.o1 o1Var = new org.telegram.messenger.o1(uyVar, z13, z11, z12, parentActivity);
                if (uyVar.t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(o1Var, j3);
            } else {
                uyVar = this;
            }
        } else {
            uyVar = this;
            if (!uyVar.l2 && uyVar.V2 == 0 && uyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new xv(this, 9));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.e1(6));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (uyVar.V2 == 0 && uyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new xv(this, 10));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.e1(7));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        S4();
        if (uyVar.e0 != null) {
            int i13 = 0;
            while (true) {
                ty[] tyVarArr2 = uyVar.e0;
                if (i13 >= tyVarArr2.length) {
                    break;
                }
                ty tyVar2 = tyVarArr2[i13];
                if (tyVar2.s == 0 && tyVar2.v == 2 && tyVar2.c.L0() == 0 && i4()) {
                    uyVar.e0[i13].c.h1(1, (int) uyVar.N);
                }
                if (i13 == 0) {
                    uyVar.e0[i13].d.getClass();
                } else {
                    uyVar.e0[i13].d.getClass();
                }
                i13++;
            }
        }
        U4();
        setBulletinDelegate(new b9(this, 4));
        if (uyVar.p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), uyVar.classGuid);
        }
        p5(0, false);
        i5(false, true);
        o5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            bb1.n(this);
        }
        K3();
        if (uyVar.z0 == null || (tyVar = uyVar.e0[0]) == null || (zwVar = tyVar.d) == null) {
            return;
        }
        int i14 = zwVar.h;
        if (i14 == 7 || i14 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i14 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                uyVar.z0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Y3 && this.Z3 == null) {
            O4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ci.ab abVar;
        uy uyVar;
        mx mxVar = this.F3;
        if (mxVar == null || !mxVar.c()) {
            if (z10 && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
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
        if (!z10 && (uyVar = this.W2) != null) {
            uyVar.removeSelfFromStack();
        }
        K3();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        mx mxVar = this.F3;
        if (mxVar == null || !mxVar.c()) {
            ci.ab abVar = this.K0;
            if (abVar != null && abVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        }
        K3();
    }

    public final boolean p4(TLRPC.Dialog dialog) {
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
    public final void p5(int i10, boolean z10) {
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
                dy dyVar = this.C0;
                recyclerView = dyVar != null ? dyVar.a0 : null;
            } else {
                ty[] tyVarArr = this.e0;
                if (tyVarArr != null) {
                    qy qyVar = i13 < tyVarArr.length ? tyVarArr[i13].a : null;
                    if (qyVar == null || tyVarArr[i13].getVisibility() == 0) {
                        r5 = qyVar != null ? this.e0[i13] : null;
                        recyclerView = qyVar;
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
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.s2;
                        ArrayList arrayList = this.I2;
                        if (z11 && (this.C0 == null || recyclerView.getAdapter() != this.C0.d0)) {
                            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                s2Var.R(this.actionBar.s(), true);
                                i11 = this.S1 ? i11 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                s2Var.T(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
                            } else {
                                if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i10) == 0) {
                                    if (s2Var.b0(i10, z10)) {
                                        r5.q(false);
                                        break;
                                    }
                                } else if (this.e0[i13].p() && AndroidUtilities.isTablet()) {
                                    s2Var.setDialogSelected(s2Var.getDialogId() == this.p2.dialogId);
                                }
                                if (arrayList != null) {
                                    s2Var.T(arrayList.contains(Long.valueOf(s2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.za)) {
                                    ((org.telegram.ui.Cells.za) childAt).j(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                                    i6Var.u(i10);
                                    if (arrayList != null) {
                                        i6Var.s(arrayList.contains(Long.valueOf(i6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.zl0)) {
                                    org.telegram.ui.Components.zl0 zl0Var = (org.telegram.ui.Components.zl0) childAt;
                                    childCount = zl0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = zl0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                                            ((org.telegram.ui.Cells.n4) childAt2).b(i10);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.za)) {
                        }
                        if (!this.S1) {
                            org.telegram.ui.Components.zl0 zl0Var2 = (org.telegram.ui.Components.zl0) childAt;
                            childCount = zl0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                    }
                }
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            K4(true);
        } else {
            this.Z3 = null;
            this.Y3 = false;
            K4(false);
            O4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        boolean presentFragment = super.presentFragment(n2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                ty[] tyVarArr = this.e0;
                if (i10 >= tyVarArr.length) {
                    break;
                }
                tyVarArr[i10].d.getClass();
                i10++;
            }
        }
        ci.e4 e4Var = this.p0;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = this.q0;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        org.telegram.ui.Components.rc.e();
        return presentFragment;
    }

    public final boolean q4() {
        return this.C2 == null && this.n2 == null;
    }

    public final boolean q5(long j3) {
        TLRPC.Chat chat;
        cx cxVar;
        if ((this.S0 <= 1 && ((cxVar = this.B1) == null || cxVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    @Override // org.telegram.ui.bh0
    public final void r() {
        G4(true, true);
    }

    public final boolean s3(long j3, View view) {
        if (this.l2 && getMessagesController().isForum(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).T(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).T(true, true);
        } else if (view instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) view).s(true, true);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s4(long j3) {
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
                    s4(dialog2.id);
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
            J4(true, true);
            x3();
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
                    J4(false, false);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        jx jxVar = this.E0;
        if (jxVar != null) {
            if (!this.G0 || z10) {
                jxVar.setVisibility(8);
            } else {
                jxVar.setVisibility(0);
            }
        }
        h5(true);
        d5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        ox oxVar;
        org.telegram.ui.Components.o5 o5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (oxVar = this.M0) != null && (oxVar.getContentView() instanceof a71)) {
            org.telegram.ui.ActionBar.i5 titleTextView = this.actionBar.getTitleTextView();
            a71 a71Var = (a71) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                o5Var = this.D3;
            }
            o5Var = null;
            a71Var.y(o5Var, titleTextView);
        }
        jx jxVar = this.E0;
        if (jxVar != null) {
            org.telegram.ui.Components.p6 p6Var = jxVar.T;
            jxVar.U.b(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                jxVar.g0 = true;
                if (jxVar.h0 != i10) {
                    jxVar.h0 = i10;
                    p6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                jxVar.g0 = false;
                jxVar.h0 = 0;
                p6Var.c(jxVar.f0, !LocaleController.isRTL, true);
            }
            jxVar.a.a(jxVar.g0, true);
            jxVar.L0.s(p6Var);
        }
    }

    public final void t3(gg.q0 q0Var) {
        dy dyVar;
        if (!this.p3 || (dyVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = dyVar.C0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (q0Var.b((gg.q0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(q0Var);
        iy iyVar = this.X;
        iyVar.F.add(q0Var);
        iyVar.I = r1.size() - 1;
        iyVar.f();
        this.X.r.getText().clear();
        f5(true, null, null, false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.ChatObject.getPublicUsername(r6) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t4(TLRPC.Chat chat, TLRPC.User user) {
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

    public final void u3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && dk0.n(parentActivity)) {
            if (z10) {
                showDialog(new dk0(parentActivity, !org.telegram.ui.Components.pe0.c(), new gw(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.w(parentActivity, new zv(this, 1)).a;
                this.T1 = b2Var;
                showDialog(b2Var);
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
            S4();
        }
    }

    public final boolean u4(TLRPC.User user) {
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

    public final void v3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        if (this.G2 == null) {
            org.telegram.ui.Components.fr0 fr0Var = new org.telegram.ui.Components.fr0(getParentActivity(), getResourceProvider());
            this.G2 = fr0Var;
            int i10 = 0;
            fr0Var.setLayoutClickListener(new wv(this, i10));
            this.G2.setOnModeChangeListener(new xv(this, i10));
            cx cxVar = this.B1;
            org.telegram.ui.Components.fr0 fr0Var2 = this.G2;
            if (fr0Var2 == null) {
                cxVar.getClass();
            } else {
                cxVar.G1 = fr0Var2;
                cxVar.addView(fr0Var2, 0, w7.z5.e(-1, 48, 51));
                cxVar.g3 = false;
                cxVar.L();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
            layoutParams.rightMargin = -this.B1.getPaddingRight();
            this.G2.setLayoutParams(layoutParams);
        }
        if (j4()) {
            this.G2.i(this.currentAccount, this.D2);
        } else {
            String str = this.E2;
            if (str != null) {
                org.telegram.ui.Components.fr0 fr0Var3 = this.G2;
                fr0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    fr0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.fr0 fr0Var4 = this.G2;
                    fr0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        fr0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(LocaleController.getString(j4() ? R.string.AddCaption : R.string.ShareComment));
        E3();
        if (this.G2.getMode() != 0) {
            this.B1.w1(false, false);
        }
        k5();
    }

    public final void v4(View view) {
        int i10 = 0;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
        f3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        vv vvVar = new vv(this, i10);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = vvVar;
        showDialog(f3Var);
    }

    public final int w3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.X2 == 0) {
            return this.f4 + this.h4;
        }
        return AndroidUtilities.dp(72.0f) + this.f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a5  */
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
    public final void w4(View view, int i10, s4.h0 h0Var) {
        s4.h0 h0Var2;
        long j3;
        MessageObject messageObject;
        long j10;
        long j11;
        boolean z10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Components.jo0 jo0Var;
        mx mxVar;
        long j12;
        long j13;
        MessageObject messageObject2;
        int i14;
        long makeEncryptedDialogId;
        long j14;
        long j15;
        dy dyVar;
        TLRPC.Document greetingsSticker;
        boolean z11;
        dy dyVar2;
        int i15;
        Object I;
        long j16;
        long j17;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = h0Var instanceof gg.m;
        if (z12) {
            gg.m mVar = (gg.m) h0Var;
            int i17 = mVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    I = mVar.I(i10);
                    if (this.C2 == null && mVar.n && h0Var.j(i10) == 21) {
                        this.C2.H(this);
                        return;
                    }
                    if (I instanceof TLRPC.User) {
                        if (I instanceof TLRPC.Chat) {
                            j17 = ((TLRPC.Chat) I).id;
                        } else if (I instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.t(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new uy(bundle));
                                return;
                            }
                            j16 = dialog.id;
                            if (this.actionBar.t(null)) {
                                V4(j16, view);
                                return;
                            }
                            h0Var2 = h0Var;
                            i11 = i16;
                            messageObject = null;
                            i13 = i15;
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
                                    showDialog(new org.telegram.ui.Components.ry0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
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
                                showDialog(new org.telegram.ui.Components.u80(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j16 = -chat2.id;
                            i16 = 0;
                            i11 = i16;
                            messageObject = null;
                            i13 = i15;
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
                    i16 = 0;
                    i11 = i16;
                    messageObject = null;
                    i13 = i15;
                    j11 = j16;
                    z10 = false;
                    i12 = 0;
                    j10 = 0;
                    j3 = 0;
                }
            }
            i15 = 0;
            I = mVar.I(i10);
            if (this.C2 == null) {
            }
            if (I instanceof TLRPC.User) {
            }
            h0Var2 = h0Var;
            i16 = 0;
            i11 = i16;
            messageObject = null;
            i13 = i15;
            j11 = j16;
            z10 = false;
            i12 = 0;
            j10 = 0;
            j3 = 0;
        } else {
            h0Var2 = h0Var;
            dy dyVar3 = this.C0;
            if (dyVar3 == null || h0Var2 != (jo0Var = dyVar3.d0)) {
                j3 = 0;
                messageObject = null;
                j10 = 0;
                j11 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            } else {
                Object J = jo0Var.J(i10);
                z10 = this.C0.d0.O(i10);
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
                        dy dyVar4 = this.C0;
                        if (dyVar4 != null) {
                            org.telegram.ui.Components.jo0 jo0Var2 = dyVar4.d0;
                            jo0Var2.j0.a(jo0Var2.Z);
                        }
                        i14 = id2;
                        j12 = dialogId;
                    } else {
                        j3 = 0;
                        if (J instanceof String) {
                            String str2 = (String) J;
                            dy dyVar5 = this.C0;
                            if (dyVar5 != null && !dyVar5.d0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                ak0 ak0Var = new ak0(getParentActivity(), this);
                                ak0Var.v(str2, true);
                                ak0Var.show();
                            }
                        } else if (J instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) J;
                            org.telegram.ui.Components.e5.v(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((J instanceof TLRPC.TL_forumTopic) && (mxVar = this.F3) != null && (mxVar.getFragment() instanceof wf1)) {
                            j12 = -((wf1) this.F3.getFragment()).a;
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
                            V4(j12, view);
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
            if (q5(j11)) {
                if ((!getMessagesController().isForum(j11) && !getMessagesController().isCommunity(j11)) || o4(j11)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j11)) || y3(j11)) {
                            boolean s32 = s3(j11, view);
                            dy dyVar6 = this.C0;
                            if (dyVar6 != null && h0Var2 == dyVar6.d0) {
                                this.actionBar.h(true);
                                Y3(j11, s32);
                            }
                            j5();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().isCommunity(j11)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j11);
                    uy uyVar = new uy(bundle2);
                    uyVar.W2 = this;
                    uyVar.C2 = this.C2;
                    presentFragment(uyVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().isForum(j11) || o4(j11)) && !getMessagesController().isMonoForumWithManageRights(j11))) {
                    X3(j11, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j11);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                wf1 wf1Var = new wf1(bundle3);
                wf1Var.L0 = this;
                presentFragment(wf1Var);
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
                            dy dyVar7 = this.C0;
                            if (dyVar7 != null) {
                                dyVar7.d0.R(this.W1, tLObject);
                            }
                            this.X1 = null;
                        }
                    } else {
                        S3();
                    }
                    boolean z13 = LocaleController.isRTL && !this.j2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.X2 == j3;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j11) || !z13) && this.p2.dialogId == j11 && ((dyVar2 = this.C0) == null || h0Var2 != dyVar2.d0))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.s0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (sa.e.h(1, fragmentStack) instanceof yn)) {
                                ((yn) sa.e.h(1, fragmentStack)).T9();
                                return;
                            }
                            if (fragmentStack.size() == 2) {
                                launchActivity.s0.l(true, false);
                                return;
                            } else {
                                if (getParentActivity() instanceof LaunchActivity) {
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(0);
                                    fragmentStack.clear();
                                    fragmentStack.add(n2Var);
                                    launchActivity.s0.U(true, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    dyVar = this.C0;
                    if (dyVar != null && dyVar.A0) {
                        dyVar.S(false);
                    }
                    if (j11 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.D0 == null) {
                            this.D0 = new org.telegram.ui.Components.iv0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.pa0(bundle5, this.D0));
                        return;
                    }
                    if (this.n2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            yn ynVar = new yn(bundle4);
                            m4(ynVar, messageObject);
                            presentFragment(ynVar);
                            return;
                        }
                        return;
                    }
                    this.z3 = true;
                    if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j11));
                        TLRPC.Dialog dialog2 = getMessagesController().getDialog(j11);
                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                        boolean z14 = dialog2 != null && dialog2.view_forum_as_messages;
                        int b10 = (this.X2 == j3 || chat5 == null) ? 0 : fi.u0.b(this.currentAccount, -chat5.id);
                        if (b10 == 3) {
                            showDialog(new org.telegram.ui.Components.u80(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (b10 == 4) {
                            org.telegram.messenger.q.p(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.yc.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z11 = chat5.monoforum) || chat5.forum) && j14 == j3)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new uy(bundle6));
                                return;
                            }
                            yn ynVar2 = new yn(bundle4);
                            if (j14 != j3) {
                                ng.d.a(ynVar2, MessagesStorage.TopicKey.of(j11, j14));
                            }
                            if (z12 && DialogObject.isUserDialog(j11) && getMessagesController().dialogs_dict.f(j11) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                ynVar2.z9 = greetingsSticker;
                                ynVar2.A9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                mx mxVar2 = this.F3;
                                if (mxVar2.a != null) {
                                    mxVar2.a();
                                }
                            }
                            m4(ynVar2, messageObject);
                            presentFragment(ynVar2);
                            return;
                        }
                        if (z11) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            yn ynVar3 = new yn(bundle4);
                            m4(ynVar3, messageObject);
                            presentFragment(ynVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            yn ynVar4 = new yn(bundle4);
                            ng.d.a(ynVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(ynVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.X2 != j3) {
                            if (!z14) {
                                presentFragment(new wf1(bundle4));
                                return;
                            }
                            yn ynVar5 = new yn(bundle4);
                            m4(ynVar5, messageObject);
                            presentFragment(ynVar5);
                            return;
                        }
                        if (!z13) {
                            if (!z14) {
                                presentFragment(new wf1(bundle4));
                                return;
                            }
                            yn ynVar6 = new yn(bundle4);
                            m4(ynVar6, messageObject);
                            presentFragment(ynVar6);
                            return;
                        }
                        if (this.j2) {
                            return;
                        }
                        if (z14) {
                            yn ynVar7 = new yn(bundle4);
                            m4(ynVar7, messageObject);
                            presentFragment(ynVar7);
                            return;
                        }
                        mx mxVar3 = this.F3;
                        tx txVar = mxVar3.a;
                        if (txVar == null || (-txVar.a) != j11) {
                            qy qyVar = this.e0[0].a;
                            qyVar.w3 = 0.0f;
                            qyVar.x3 = qyVar.v3;
                            qyVar.y3 = qyVar.p3 != 0.0f;
                            tx txVar2 = new tx(bundle4);
                            txVar2.M0 = this;
                            final mx mxVar4 = this.F3;
                            org.telegram.ui.ActionBar.c5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = mxVar4.n;
                            if (!mxVar4.r) {
                                mxVar4.w = parentLayout;
                                txVar2.onFragmentCreate();
                                txVar2.setInPreviewMode(true);
                                txVar2.setParentLayout(parentLayout);
                                View performCreateView = txVar2.performCreateView(mxVar4.getContext());
                                txVar2.onResume();
                                mxVar4.b = performCreateView;
                                mxVar4.addView(performCreateView);
                                final tx txVar3 = mxVar4.a;
                                k0 k0Var = txVar2.e;
                                mxVar4.c = k0Var;
                                mxVar4.addView(k0Var);
                                mxVar4.a = txVar2;
                                d41.Q = j3;
                                d41.Q = -txVar2.a;
                                if (txVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.k actionBar = txVar2.getActionBar();
                                    mxVar4.d = actionBar;
                                    mxVar4.addView(actionBar);
                                    mxVar4.d.W0 = new hz0(mxVar4, 9);
                                }
                                if (txVar3 != null) {
                                    final tx txVar4 = mxVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.k kVar = mxVar4.x;
                                        if (kVar != null) {
                                            kVar.c();
                                        }
                                        txVar4.onTransitionAnimationStart(true, false);
                                        mxVar4.E = txVar3;
                                        mxVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.k kVar2 = new o1.k(new o1.j(0.0f));
                                        mxVar4.x = kVar2;
                                        kVar2.u = org.telegram.ui.Cells.c1.l(1000.0f, 400.0f, 1.0f);
                                        d41.f(txVar3, txVar4, 0.0f);
                                        mxVar4.x.b(new rd0(mxVar4, i18));
                                        mxVar4.x.a(new o1.f() { // from class: org.telegram.ui.b41
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z15, float f7, float f10) {
                                                d41 d41Var = mxVar4;
                                                if (d41Var.x == null) {
                                                    return;
                                                }
                                                d41Var.x = null;
                                                org.telegram.ui.ActionBar.n2 n2Var2 = txVar4;
                                                n2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.n2 n2Var3 = txVar3;
                                                d41.f(n2Var3, n2Var2, 1.0f);
                                                d41Var.v = false;
                                                d41Var.E = null;
                                                n2Var3.onPause();
                                                n2Var3.onFragmentDestroy();
                                                d41Var.removeView(n2Var3.getFragmentView());
                                                d41Var.removeView(n2Var3.getActionBar());
                                                d41Var.n.unlock();
                                            }
                                        });
                                        mxVar4.x.f();
                                    } else {
                                        txVar4.onTransitionAnimationStart(true, false);
                                        txVar4.onTransitionAnimationEnd(true, false);
                                        d41.f(txVar3, txVar4, 1.0f);
                                        mxVar4.v = false;
                                        mxVar4.E = null;
                                        txVar3.onPause();
                                        txVar3.onFragmentDestroy();
                                        mxVar4.removeView(txVar3.getFragmentView());
                                        mxVar4.removeView(txVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!mxVar4.f) {
                                    mxVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        mxVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        mxVar4.e = 0.0f;
                                        mxVar4.e(true);
                                        mxVar4.g();
                                        txVar2.onTransitionAnimationStart(true, false);
                                        mxVar4.h.addUpdateListener(new a41(mxVar4, 1));
                                        mxVar4.h.addListener(new org.telegram.ui.Components.cl0(13, mxVar4, txVar2));
                                        mxVar4.h.setDuration(250L);
                                        mxVar4.h.setInterpolator(org.telegram.ui.Components.tr.f);
                                        mxVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        mxVar4.h.start();
                                    } else {
                                        mxVar4.e(true);
                                        txVar2.onTransitionAnimationStart(true, false);
                                        txVar2.onTransitionAnimationEnd(true, false);
                                        mxVar4.e = 1.0f;
                                        mxVar4.g();
                                        mxVar4.d(false);
                                    }
                                }
                                txVar2.setPreviewDelegate(new jl0(mxVar4, 17));
                                WeakHashMap weakHashMap = r0.i0.a;
                                r0.y.c(mxVar4);
                            }
                        } else {
                            mxVar3.a();
                        }
                        dy dyVar8 = this.C0;
                        if (dyVar8 != null) {
                            dyVar8.T();
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
            dyVar = this.C0;
            if (dyVar != null) {
                dyVar.S(false);
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
        dyVar = this.C0;
        if (dyVar != null) {
        }
        if (j11 != getUserConfig().getClientUserId()) {
        }
        if (this.n2 != null) {
        }
    }

    @Override // org.telegram.ui.bh0
    public final fh.d x() {
        return this.l4;
    }

    public final void x3() {
        AndroidUtilities.runOnUIThread(new pv(this, 3), 300L);
    }

    public final boolean x4(View view, int i10, float f7, org.telegram.ui.Components.yl0 yl0Var) {
        org.telegram.ui.Components.jo0 jo0Var;
        org.telegram.ui.Components.jo0 jo0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && yl0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.Q(f7)) {
                    return Q4(s2Var);
                }
            }
            mx mxVar = this.F3;
            if (mxVar == null || !mxVar.c()) {
                dy dyVar = this.C0;
                if (dyVar != null && yl0Var == (jo0Var2 = dyVar.d0)) {
                    Object J = jo0Var2.J(i10);
                    if (!this.C0.d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ng.d.i(chat, this.currentAccount, false));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.id == getUserConfig().clientUserId) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r11.id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ai.z1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.q7));
                        }
                        return true;
                    }
                }
                dy dyVar2 = this.C0;
                if (dyVar2 == null || yl0Var != (jo0Var = dyVar2.d0)) {
                    Object I = ((gg.m) yl0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.l2) {
                            if ((this.R0 == 3 || R3()) && q5(dialog.id)) {
                                if (this.R0 != 1 || !R3() || !this.m2 || !getMessagesController().isForum(dialog.id)) {
                                    s3(dialog.id, view);
                                    j5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.R0 == 1);
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                wf1 wf1Var = new wf1(bundle);
                                wf1Var.L0 = this;
                                presentFragment(wf1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                v4(view);
                                return false;
                            }
                            if (!this.actionBar.s() || !p4(dialog)) {
                                V4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.l2) {
                        w4(view, i10, yl0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.i6) || jo0Var.O(i10)) ? 0L : ((org.telegram.ui.Cells.i6) view).getDialogId();
                    if (dialogId != 0) {
                        V4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y3(long j3) {
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

    public final void y4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new ff(21));
        org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Y(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.r(currentUser);
                org.telegram.ui.Components.vg0 vg0Var = new org.telegram.ui.Components.vg0(this, getParentActivity(), z10);
                linearLayout.addView(vg0Var, w7.z5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, h9Var);
                vg0Var.addView(w9Var, w7.z5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.z5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.ua(this, intValue, H, 11));
                H.r(linearLayout, w7.z5.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.l1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // mg.b
    public final List z() {
        return Arrays.asList(new mg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new mg.a(LocaleController.getString(R.string.ClearLocalDatabase), new pv(this, 26)), new mg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new pv(this, 27)));
    }

    public final void z3(boolean z10) {
        gi.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.ns nsVar = this.J1;
        if (nsVar == null || (jVar = this.Q1) == null || (chatFull = this.Z2) == null) {
            return;
        }
        nsVar.i(jVar, (this.X2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
    }

    public final void z4(int i10, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
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
}
