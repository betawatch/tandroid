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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class ty extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, mg.b, me.d, eh0 {
    public static boolean w4;
    public static final boolean[] x4 = new boolean[4];
    public static final org.telegram.ui.Components.ns0 y4 = new org.telegram.ui.Components.ns0(3);
    public static float z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public dx B1;
    public boolean B2;
    public Long B3;
    public dy C0;
    public ii.z1 C1;
    public ny C2;
    public Drawable C3;
    public org.telegram.ui.Components.tv0 D0;
    public org.telegram.ui.ActionBar.v0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.q5 D3;
    public boolean E;
    public kx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.ys F0;
    public cx F1;
    public CharSequence F2;
    public nx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.rr0 G2;
    public final bx G3;
    public long H;
    public float H0;
    public cx H1;
    public org.telegram.ui.Components.ea1 H2;
    public final bx H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public ch0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.at J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public ci.bb K0;
    public org.telegram.ui.Components.zs K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.p80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public px M0;
    public org.telegram.ui.Cells.a3 M1;
    public int M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ua N1;
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
    public av Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.tc S;
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
    public org.telegram.ui.Components.be0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public ty W2;
    public float W3;
    public jy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public yf.g0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public v41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int a;
    public org.telegram.ui.Components.n91 a0;
    public final ArrayList a1;
    public boolean a2;
    public org.telegram.ui.Components.y9 a3;
    public org.telegram.ui.Components.m50 a4;
    public final me.b b;
    public gg.r0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.j9 b3;
    public TLRPC.FileLocation b4;
    public final me.b c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public long c3;
    public TLRPC.FileLocation c4;
    public final me.b d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public boolean d3;
    public org.telegram.ui.Components.tc d4;
    public final me.b e;
    public sy[] e0;
    public org.telegram.ui.ActionBar.g2 e1;
    public boolean e2;
    public boolean e3;
    public int e4;
    public final me.b f;
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
    public final me.b h;
    public vy h0;
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
    public hh.j j4;
    public org.telegram.ui.ActionBar.v0 k0;
    public org.telegram.ui.ActionBar.v0 k1;
    public boolean k2;
    public int k3;
    public final ah.h k4;
    public org.telegram.ui.ActionBar.v0 l0;
    public org.telegram.ui.ActionBar.v0 l1;
    public boolean l2;
    public boolean l3;
    public final fh.d l4;
    public org.telegram.ui.ActionBar.v0 m0;
    public org.telegram.ui.ActionBar.v0 m1;
    public boolean m2;
    public boolean m3;
    public final fh.d m4;
    public final me.b n;
    public org.telegram.ui.Components.kj0 n0;
    public org.telegram.ui.ActionBar.f1 n1;
    public String n2;
    public org.telegram.ui.Components.tc n3;
    public final fh.c n4;
    public org.telegram.ui.ActionBar.f1 o0;
    public org.telegram.ui.ActionBar.f1 o1;
    public String o2;
    public final AnimationNotificationsLocker o3;
    public final ah.c o4;
    public ci.d4 p0;
    public org.telegram.ui.ActionBar.f1 p1;
    public final MessagesStorage.TopicKey p2;
    public boolean p3;
    public final ah.c p4;
    public ci.d4 q0;
    public org.telegram.ui.ActionBar.f1 q1;
    public boolean q2;
    public boolean q3;
    public final ah.c q4;
    public final me.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.f1 r1;
    public boolean r2;
    public boolean r3;
    public final ah.c r4;
    public final me.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.f1 s1;
    public boolean s2;
    public boolean s3;
    public iw s4;
    public org.telegram.ui.Components.p20 t0;
    public org.telegram.ui.ActionBar.f1 t1;
    public boolean t2;
    public float t3;
    public final ArrayList t4;
    public org.telegram.ui.Components.p20 u0;
    public float u1;
    public boolean u2;
    public ValueAnimator u3;
    public final RectF u4;
    public final ph.i v;
    public ci.d v0;
    public float v1;
    public boolean v2;
    public float v3;
    public final RectF v4;
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
    public hh.f y1;
    public boolean y2;
    public int y3;
    public qw z0;
    public FrameLayout z1;
    public boolean z2;
    public boolean z3;

    public ty(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        this.b = new me.b(1, this, hsVar, 350L, false);
        this.c = new me.b(2, this, hsVar, 350L, false);
        this.d = new me.b(3, this, hsVar, 350L, false);
        this.e = new me.b(4, this, hsVar, 350L, false);
        this.f = new me.b(5, this, hsVar, 350L, false);
        this.h = new me.b(6, this, hsVar, 350L, false);
        this.n = new me.b(7, this, hsVar, 350L, false);
        this.r = new me.b(8, this, hsVar, 350L, false);
        this.s = new me.b(9, this, hsVar, 350L, false);
        this.v = new ph.i(new hw(this, 2));
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
        this.t4 = arrayList;
        RectF rectF = new RectF();
        this.u4 = rectF;
        RectF rectF2 = new RectF();
        this.v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c cVar = new fh.c();
        this.n4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        if (i10 >= 31) {
            this.k4 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.l4 = dVar;
            dVar.j(new yx(this, 0));
            fh.d dVar2 = new fh.d(null);
            this.m4 = dVar2;
            dVar2.j(new yx(this, 3));
            ah.c cVar2 = new ah.c(dVar);
            this.o4 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.q4 = cVar3;
            cVar3.i = LiteMode.isEnabled(262144);
            this.p4 = new ah.c(dVar);
        } else {
            this.k4 = null;
            this.l4 = null;
            this.m4 = null;
            this.o4 = new ah.c(cVar);
            this.q4 = new ah.c(cVar);
            this.p4 = new ah.c(cVar);
        }
        this.r4 = new ah.c(cVar);
    }

    public static /* synthetic */ void B0(ty tyVar, float f7, ValueAnimator valueAnimator) {
        tyVar.e0[0].setTranslationY((1.0f - tyVar.t3) * f7);
        tyVar.t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < tyVar.actionBar.getChildCount(); i10++) {
            if (tyVar.actionBar.getChildAt(i10).getVisibility() == 0 && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getActionMode() && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getBackButton()) {
                tyVar.actionBar.getChildAt(i10).setAlpha(1.0f - tyVar.t3);
            }
        }
        tyVar.B3();
        tyVar.t3();
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void C0(ty tyVar) {
        org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(tyVar.getParentActivity(), tyVar.resourceProvider);
        bcVar.d(R.raw.email_check_inbox, new String[0]);
        bcVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.tc.g(tyVar, bcVar, 2750).j();
        try {
            tyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D0(ty tyVar) {
        org.telegram.ui.Components.wo0 wo0Var;
        fc1 fc1Var;
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            if (i10 == 2) {
                dy dyVar = tyVar.C0;
                if (dyVar == null) {
                    i10++;
                } else {
                    viewGroup = dyVar.V;
                    if (viewGroup == null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = viewGroup.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.i6) {
                                ((org.telegram.ui.Cells.i6) childAt).v(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                                ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                                ((org.telegram.ui.Cells.xa) childAt).j(0);
                            }
                        }
                    }
                    i10++;
                }
            } else {
                sy[] syVarArr = tyVar.e0;
                if (syVarArr == null) {
                    i10++;
                } else {
                    viewGroup = i10 < syVarArr.length ? syVarArr[i10].a : null;
                    if (viewGroup == null) {
                    }
                    i10++;
                }
            }
        }
        dy dyVar2 = tyVar.C0;
        if (dyVar2 != null && (wo0Var = dyVar2.b0) != null && (fc1Var = wo0Var.k0) != null) {
            int childCount2 = fc1Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = fc1Var.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt2;
                    org.telegram.ui.Components.j9 j9Var = n4Var.c;
                    int i13 = n4Var.h;
                    if (DialogObject.isUserDialog(n4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(n4Var.f));
                        n4Var.e = user;
                        j9Var.m(i13, user);
                    } else {
                        j9Var.k(i13, MessagesController.getInstance(i13).getChat(Long.valueOf(-n4Var.f)));
                        n4Var.e = null;
                    }
                    n4Var.c(true);
                }
            }
        }
        if (tyVar.e0 != null) {
            int i14 = 0;
            while (true) {
                sy[] syVarArr2 = tyVar.e0;
                if (i14 >= syVarArr2.length) {
                    break;
                }
                zw zwVar = syVarArr2[i14].n;
                if (zwVar != null) {
                    zwVar.i();
                }
                i14++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = tyVar.actionBar;
        if (kVar != null) {
            kVar.E(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), true);
            tyVar.actionBar.F(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false, true);
            tyVar.actionBar.F(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true, true);
            tyVar.actionBar.G(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5), true);
            tyVar.actionBar.e();
        }
        if (tyVar.D3 != null) {
            tyVar.a5(UserConfig.getInstance(tyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.a3 a3Var = tyVar.M1;
        if (a3Var != null) {
            a3Var.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
        }
        org.telegram.ui.ActionBar.v0 v0Var = tyVar.m0;
        if (v0Var != null) {
            v0Var.setIconColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.v8));
        }
        dx dxVar = tyVar.B1;
        if (dxVar != null) {
            dxVar.e();
        }
        qw qwVar = tyVar.z0;
        if (qwVar != null) {
            ch.d dVar = qwVar.y0;
            if (dVar != null) {
                dVar.v();
            }
            qwVar.invalidate();
        }
        gg.r0 r0Var = tyVar.b0;
        if (r0Var != null) {
            r0Var.C1();
        }
        dy dyVar3 = tyVar.C0;
        if (dyVar3 != null) {
            SparseArray sparseArray = dyVar3.h;
            for (int i15 = 0; i15 < dyVar3.getChildCount(); i15++) {
                if (dyVar3.getChildAt(i15) instanceof w10) {
                    ai.w0 w0Var = ((w10) dyVar3.getChildAt(i15)).b;
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
                if (view instanceof w10) {
                    ai.w0 w0Var2 = ((w10) view).b;
                    int childCount4 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = w0Var2.getChildAt(i18);
                        if (childAt4 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt4).b0(0, true);
                        }
                    }
                }
            }
            w10 w10Var = dyVar3.M0;
            if (w10Var != null) {
                ai.w0 w0Var3 = w10Var.b;
                int childCount5 = w0Var3.getChildCount();
                for (int i19 = 0; i19 < childCount5; i19++) {
                    View childAt5 = w0Var3.getChildAt(i19);
                    if (childAt5 instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt5).b0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.di0 di0Var = dyVar3.p0;
            if (di0Var != null) {
                di0Var.c();
            }
        }
        org.telegram.ui.Components.n91 n91Var = tyVar.a0;
        if (n91Var != null) {
            ai.w0 w0Var4 = n91Var.v;
            ch.d dVar2 = n91Var.r0;
            if (dVar2 != null) {
                dVar2.v();
            }
            n91Var.O.setColor(org.telegram.ui.ActionBar.i6.w0(n91Var.P, n91Var.j0));
            w0Var4.f1();
            w0Var4.invalidate();
            n91Var.invalidate();
        }
        v41 v41Var = tyVar.Z;
        if (v41Var != null) {
            v41Var.e();
        }
        ci.bb bbVar = tyVar.K0;
        if (bbVar != null) {
            bbVar.setForeground(new ColorDrawable(i0.a.k(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6), 100)));
        }
        org.telegram.ui.Components.p20 p20Var = tyVar.t0;
        if (p20Var != null) {
            p20Var.g();
        }
        org.telegram.ui.Components.p20 p20Var2 = tyVar.u0;
        if (p20Var2 != null) {
            p20Var2.g();
        }
        fh.c cVar = tyVar.n4;
        int i20 = org.telegram.ui.ActionBar.i6.d6;
        cVar.a(tyVar.getThemedColor(i20));
        org.telegram.ui.Components.at atVar = tyVar.J1;
        if (atVar != null) {
            ch.d dVar3 = atVar.s;
            if (dVar3 != null) {
                dVar3.v();
            }
            atVar.invalidate();
        }
        org.telegram.ui.Components.zs zsVar = tyVar.K1;
        if (zsVar != null) {
            zsVar.setColor(org.telegram.ui.ActionBar.i6.x0(null, i20, false));
        }
        cx cxVar = tyVar.H1;
        if (cxVar != null) {
            cxVar.q();
        }
        cx cxVar2 = tyVar.F1;
        if (cxVar2 != null) {
            cxVar2.q();
        }
        tyVar.A4(tyVar.x1);
        kx kxVar = tyVar.E0;
        if (kxVar != null) {
            kxVar.p();
        }
        Drawable drawable = tyVar.C3;
        if (drawable != null) {
            drawable.setColorFilter(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = tyVar.g1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.MULTIPLY));
            tyVar.g1.setBackground(org.telegram.ui.ActionBar.i6.g0(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.z8), 1, -1));
        }
        jy jyVar = tyVar.X;
        if (jyVar != null) {
            jyVar.e();
        }
    }

    public static void E0(ty tyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            tg.m1.f0(0, birthdayState);
            return;
        }
        xh.r1 r1Var = new xh.r1(tyVar.getParentActivity(), tyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        r1Var.W(true);
        tyVar.showDialog(r1Var);
    }

    public static void F0(ty tyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.tc M = org.telegram.ui.Components.ad.a0(tyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
            tyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.q.q(R.string.UnknownError, org.telegram.ui.Components.ad.a0(tyVar), R.raw.error, 36);
            return;
        }
        if (tyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity(), 0, tyVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            tyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void G0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        tyVar.R4();
    }

    public static void K2(ty tyVar, float f7) {
        float f10;
        float f11;
        float clamp = Utilities.clamp(tyVar.x1 * 2.0f, 1.0f, 0.0f);
        kx kxVar = tyVar.E0;
        float f12 = (1.0f - tyVar.t3) * f7 * tyVar.H0;
        float f13 = 1.0f - clamp;
        kxVar.setAlpha(f12 * f13);
        if (tyVar.K || tyVar.M) {
            float clamp2 = Utilities.clamp((-tyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (tyVar.t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            tyVar.E0.setClipTop(0);
            if (tyVar.K || !tyVar.M) {
                tyVar.E0.setTranslationY(((tyVar.T / 2.0f) + (Math.max(tyVar.N, -tyVar.R3()) + tyVar.v3)) - AndroidUtilities.dp(8.0f));
                tyVar.E0.l(clamp2, !tyVar.F3.c());
                if (tyVar.M) {
                    f10 = 1.0f - clamp3;
                    tyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = tyVar.H0;
                }
            } else {
                tyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                tyVar.E0.setProgressToCollapse(1.0f);
                f11 = tyVar.H0;
            }
            f10 = 1.0f - f11;
            tyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (tyVar.L) {
                tyVar.E0.setTranslationY((Math.max(tyVar.N, -tyVar.R3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                tyVar.E0.setProgressToCollapse(1.0f);
                kx kxVar2 = tyVar.E0;
                kxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - kxVar2.getY()));
            }
            f10 = 1.0f - tyVar.H0;
            tyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            tyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            tyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - tyVar.t3;
            tyVar.actionBar.getTitlesContainer().setAlpha(f15);
            tyVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        tyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        tyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        tyVar.actionBar.getTitlesContainer().setScaleY(f16);
        tyVar.actionBar.getTitlesContainer().setScaleX(f16);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - tyVar.t3) * f14;
        tyVar.actionBar.getTitlesContainer().setAlpha(f17);
        tyVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void L2(ty tyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        if (tyVar.parentLayout == null || tyVar.actionBar == null) {
            return;
        }
        float max = Math.max(tyVar.e.e, tyVar.S3());
        float f7 = 1.0f;
        float f10 = 1.0f - tyVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            f7 = 0.0f;
            i10 = -1;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (d5Var = tyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) d5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static org.telegram.ui.Cells.s2 N3(sy syVar) {
        py pyVar = syVar.a;
        for (int i10 = 0; i10 < pyVar.getChildCount(); i10++) {
            View childAt = pyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var.P()) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void U(ty tyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        tyVar.R4();
    }

    public static /* synthetic */ void V(ty tyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        tyVar.t3 = floatValue;
        tyVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < tyVar.actionBar.getChildCount(); i10++) {
            if (tyVar.actionBar.getChildAt(i10).getVisibility() == 0 && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getActionMode() && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getBackButton()) {
                tyVar.actionBar.getChildAt(i10).setAlpha(1.0f - tyVar.t3);
            }
        }
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        tyVar.B3();
        tyVar.t3();
    }

    public static void W(ty tyVar) {
        ArrayList arrayList = tyVar.I2;
        org.telegram.ui.ActionBar.d5 d5Var = tyVar.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).y()) {
            tyVar.finishPreviewFragment();
            return;
        }
        if (tyVar.R0 != 10) {
            if (MessagesController.getInstance(tyVar.currentAccount).isFrozen()) {
                b.b(tyVar.currentAccount);
                return;
            } else {
                tyVar.presentFragment(new ContactsActivity(a1.g.i("destroyAfterSelect", true)));
                return;
            }
        }
        if (tyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        tyVar.C2.w(tyVar, arrayList2, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
    }

    public static /* synthetic */ void X(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        tyVar.R4();
    }

    public static void Y(ty tyVar) {
        PasskeysActivity.a0(tyVar.currentAccount, tyVar.getParentActivity(), tyVar.resourceProvider, true);
    }

    public static /* synthetic */ void Z(ty tyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(tyVar.currentAccount).getClientUserId());
        tyVar.presentFragment(new zn(bundle));
    }

    public static /* synthetic */ void a0(ty tyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = tyVar.getMessagesController().getUserFull(tyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        tyVar.getMessagesController().invalidateContentSettings();
        tyVar.getConnectionsManager().sendRequest(updatebirthday, new ba(tyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        tyVar.R4();
    }

    public static void a4(zn znVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.e6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.u10[] u10VarArr = (org.telegram.ui.Components.u10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.u10.class);
                if (u10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(u10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(u10VarArr[0]);
                    for (int i10 = 1; i10 < u10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(u10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(u10VarArr[i10]);
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
                    znVar.qb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static /* synthetic */ void b0(ty tyVar, String str) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, str);
        tyVar.R4();
    }

    public static void c0(ty tyVar, sy syVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.n2) {
                tyVar.K4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (tyVar.F3()) {
            tyVar.l4(view, i10, 0.0f, syVar.d);
            return;
        }
        int i12 = tyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            syVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a1.g.i("forImport", true);
            i14.putLongArray("result", new long[]{tyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = tyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            j70 j70Var = new j70(i14);
            j70Var.Y = new xw(tyVar);
            tyVar.presentFragment(j70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = syVar.s) == 7 || i11 == 8)) {
            gg.k kVar = (gg.k) syVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = tyVar.getMessagesController().selectedDialogFilter[syVar.s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.id;
                    org.telegram.ui.Components.s10 s10Var = new org.telegram.ui.Components.s10(tyVar, false);
                    s10Var.Y = -1;
                    s10Var.c0 = "";
                    s10Var.d0 = new ArrayList();
                    s10Var.f0 = "";
                    s10Var.h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    s10Var.i0 = arrayList;
                    s10Var.z0 = -1;
                    s10Var.C0 = -5;
                    s10Var.Y = i15;
                    s10Var.a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    s10Var.g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = tyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i15) {
                                s10Var.c0 = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    s10Var.T();
                    tyVar.showDialog(s10Var);
                    return;
                }
                return;
            }
        } else if (z10 && !tyVar.actionBar.t() && !tyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        tyVar.k4(view, i10, syVar.d);
    }

    public static void c1(ty tyVar, boolean z10) {
        if (tyVar.e0 == null || tyVar.M3 == z10) {
            return;
        }
        tyVar.M3 = z10;
        int i10 = 0;
        while (true) {
            sy[] syVarArr = tyVar.e0;
            if (i10 >= syVarArr.length) {
                return;
            }
            if (z10) {
                syVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            tyVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                tyVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static /* synthetic */ void d0(ty tyVar) {
        tyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(tyVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void e0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(tyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(tyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ba(tyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static /* synthetic */ void f0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, tyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(tyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void f4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = x4;
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
        AndroidUtilities.runOnUIThread(new cj(accountInstance, 19), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void h0(ty tyVar) {
        if (tyVar.a4.g()) {
            MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            tyVar.R4();
        }
    }

    public static /* synthetic */ void j0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        tyVar.R4();
    }

    public static /* synthetic */ void k0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        tyVar.R4();
    }

    public static void l0(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        ai.j jVar;
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.g5.e0(tyVar.currentAccount, tL_error, tyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        tyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        ai.j jVar2 = new ai.j(tyVar, j3, 25);
        Pattern pattern = org.telegram.ui.Components.g5.a;
        if (tyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = tyVar.getCurrentAccount();
            Activity parentActivity = tyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            j9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 48));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, w7.x5.a(-2.0f, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f, -1, (z10 ? 5 : 3) | 48));
            frameLayout.addView(textView, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
            if (user == null) {
                jVar = jVar2;
                j9Var.k(currentAccount, chat);
                y9Var.e(chat, j9Var);
            } else if (UserObject.isReplyUser(user)) {
                j9Var.p = 0.8f;
                j9Var.g(12);
                y9Var.h(null, null, j9Var, user);
                jVar = jVar2;
            } else {
                jVar = jVar2;
                if (user.id == clientUserId) {
                    j9Var.p = 0.8f;
                    j9Var.g(1);
                    y9Var.h(null, null, j9Var, user);
                } else {
                    j9Var.p = 1.0f;
                    j9Var.m(currentAccount, user);
                    y9Var.e(user, j9Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(jVar, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            tyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void m0(ty tyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.ro0 ro0Var = tyVar.C0.o0;
        if (i10 < ro0Var.X || i10 >= ro0Var.Y) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.p61 G = ro0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity(), 0, tyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.y2(27, tyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void n0(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            tyVar.o4(arrayList, i10, false, false, null);
            return;
        }
        tyVar.getMessagesController().setDialogsInTransaction(true);
        tyVar.o4(arrayList, i10, false, false, z10 ? hashSet : null);
        tyVar.getMessagesController().setDialogsInTransaction(false);
        tyVar.getMessagesController().checkIfFolderEmpty(tyVar.V2);
        int i11 = tyVar.V2;
        if (i11 == 0 || tyVar.O3(tyVar.currentAccount, tyVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        tyVar.e0[0].a.setEmptyView(null);
        tyVar.e0[0].w.setVisibility(4);
        tyVar.finishFragment();
    }

    public static void n1(ty tyVar, sy syVar, float f7) {
        if (tyVar.T == f7) {
            return;
        }
        tyVar.T = f7;
        if (f7 == 0.0f) {
            tyVar.U = false;
        }
        tyVar.E0.setOverscroll(f7);
        syVar.a.setViewsOffset(f7);
        syVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        tyVar.fragmentView.invalidate();
        if (f7 <= AndroidUtilities.dp(90.0f) || tyVar.U) {
            return;
        }
        kx kxVar = tyVar.E0;
        ValueAnimator valueAnimator = kxVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            kxVar.i(kxVar.p0, true);
            tyVar.U = true;
            tyVar.getOrCreateStoryViewer().s(new ov(tyVar, 19));
        }
    }

    public static boolean o1(ty tyVar, sy syVar) {
        if (tyVar.F3.c()) {
            return false;
        }
        int i10 = (int) (-tyVar.N);
        int Q3 = tyVar.Q3();
        int R3 = tyVar.R3();
        if (i10 == 0 || i10 == Q3 || i10 == R3 || !syVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (R3 >= i10 || i10 >= Q3) {
            if ((tyVar.t3 != 1.0f ? Utilities.clamp((-tyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < tyVar.E0.B0) {
                syVar.b.x(-i10);
                return true;
            }
            syVar.b.x(R3 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - R3;
        if (i11 < dp / 2) {
            syVar.b.x(-i11);
            return true;
        }
        syVar.b.x(dp - i11);
        return true;
    }

    public static void p0(ty tyVar, int i10, org.telegram.ui.Components.p80 p80Var) {
        if (tyVar.currentAccount == i10) {
            return;
        }
        p80Var.u();
        if (tyVar.getParentActivity() == null) {
            return;
        }
        ny nyVar = tyVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) tyVar.getParentActivity();
        ArrayList arrayList = tyVar.D2;
        String str = tyVar.E2;
        CharSequence charSequence = tyVar.F2;
        dx dxVar = tyVar.B1;
        CharSequence fieldText = dxVar != null ? dxVar.getFieldText() : null;
        launchActivity.K0(i10);
        ty tyVar2 = new ty(tyVar.arguments);
        tyVar2.C2 = nyVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                tyVar2.B4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    tyVar2.F2 = null;
                } else {
                    tyVar2.F2 = charSequence;
                    tyVar2.E2 = null;
                    tyVar2.D2 = null;
                    if (tyVar2.B1 != null) {
                        tyVar2.i3(fieldText);
                    } else {
                        tyVar2.U3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            tyVar2.D2 = null;
        } else {
            tyVar2.D2 = arrayList;
            tyVar2.E2 = null;
            if (tyVar2.B1 != null) {
                tyVar2.i3(fieldText);
            } else {
                tyVar2.U3 = fieldText;
            }
        }
        launchActivity.q0(tyVar2, false, true);
    }

    public static String p2(ty tyVar) {
        ArrayList arrayList = tyVar.I2;
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
            if (longValue == tyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(tyVar.currentAccount, longValue) : DialogObject.getShortName(tyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static /* synthetic */ void q0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, tyVar.A3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        tyVar.R4();
    }

    public static void r0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            oj1.a(tyVar.getParentActivity(), new z(tyVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.C0(launchActivity, tyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static void s0(ty tyVar) {
        b.c(tyVar.getParentActivity(), tyVar.currentAccount, tyVar.getResourceProvider());
    }

    public static void t0(final int i10, final long j3, TLRPC.Chat chat, final ty tyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        tyVar.Y3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                tyVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = tyVar.V2) != 0 && tyVar.O3(tyVar.currentAccount, tyVar.e0[0].s, i13, false).size() == 1) {
            tyVar.e0[0].w.setVisibility(4);
        }
        tyVar.y3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            tyVar.x4(true, true);
            if (tyVar.R1 != null) {
                i12 = 0;
                while (i12 < tyVar.R1.size()) {
                    if (((TLRPC.Dialog) tyVar.R1.get(i12)).id == j3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            tyVar.l3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView V3 = tyVar.V3();
        if (V3 != null) {
            V3.j(i10 == 103 ? 0 : z11 ? 1 : 95, j3, new Runnable() { // from class: org.telegram.ui.bw
                @Override // java.lang.Runnable
                public final void run() {
                    tyVar.n4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(tyVar.O3(tyVar.currentAccount, tyVar.e0[0].s, tyVar.V2, false));
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
            if (i11 < 0 || i14 >= 0 || (arrayList = tyVar.R1) == null) {
                tyVar.x4(false, true);
                return;
            }
            arrayList.remove(i11);
            tyVar.e0[0].x.D();
            tyVar.e0[0].q(true);
        }
    }

    public static void u0(ty tyVar) {
        BirthdayController.getInstance(tyVar.currentAccount).hide();
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        tyVar.R4();
        org.telegram.ui.Components.tc G = org.telegram.ui.Components.ad.a0(tyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void v0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        tyVar.R4();
    }

    public static void w0(ty tyVar) {
        if (tyVar.N3) {
            ci.d4 d4Var = tyVar.p0;
            if (d4Var != null) {
                d4Var.e(true);
            }
            ai.g9 o9 = MessagesController.getInstance(tyVar.currentAccount).getStoriesController().o();
            if (o9 != null && o9.a(tyVar.currentAccount, 1)) {
                tyVar.showDialog(new rg.j0(o9.b(), tyVar.currentAccount, tyVar.getParentActivity(), tyVar, null));
                return;
            } else {
                ci.lc D = ci.lc.D(tyVar.getParentActivity(), tyVar.currentAccount);
                D.x = new yx(tyVar, 4);
                D.Q(null);
                return;
            }
        }
        ci.d4 d4Var2 = tyVar.q0;
        if (d4Var2 != null) {
            if (d4Var2.V) {
                return;
            } else {
                AndroidUtilities.removeFromParent(d4Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.i6.Gi, 0, new hw(tyVar, 8));
        ci.d4 d4Var3 = new ci.d4(tyVar.getParentActivity(), 2);
        d4Var3.q(8.0f);
        d4Var3.d = 8000L;
        d4Var3.i();
        d4Var3.p(true);
        d4Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        d4Var3.s(replaceSingleTag);
        d4Var3.l(1.0f, -40.0f);
        d4Var3.h(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        tyVar.q0 = d4Var3;
        d4Var3.setTranslationY((-tyVar.f4) - tyVar.h4);
        ((ViewGroup) tyVar.fragmentView).addView(tyVar.q0, w7.x5.a(240.0f, 12.0f, 0.0f, 68.0f, 40.0f, -1, 87));
        tyVar.q0.u();
    }

    public static void x0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        tyVar.R4();
        org.telegram.ui.Components.tc G = org.telegram.ui.Components.ad.a0(tyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static void y0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        tyVar.R4();
        org.telegram.ui.Components.tc J = org.telegram.ui.Components.ad.a0(tyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new ov(tyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void z0(ty tyVar) {
        try {
            ((org.telegram.ui.Components.ck0) ((org.telegram.ui.Components.j9) tyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (tyVar.a4 == null) {
            org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(0, true, true);
            tyVar.a4 = m50Var;
            m50Var.H = true;
            m50Var.a = tyVar;
            m50Var.b = new hy(tyVar);
            tyVar.getMediaDataController().checkFeaturedStickers();
            tyVar.getMessagesController().loadSuggestedFilters();
            tyVar.getMessagesController().loadUserInfo(tyVar.getUserConfig().getCurrentUser(), true, tyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(tyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(tyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(tyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.yi yiVar = tyVar.a4.c;
        if (yiVar != null) {
            yiVar.e1();
        }
        org.telegram.ui.Components.m50 m50Var2 = tyVar.a4;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        m50Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new ov(tyVar, 0), new pv(tyVar, 0), 0);
    }

    @Override // me.d
    public final void A(float f7, int i10) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (i10 != 3 || (v0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) v0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
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

    public final void A3() {
        String string = LocaleController.getString(S3() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.X.r.setContentDescription(string);
        this.X.r.setHint(string);
    }

    public final void A4(float f7) {
        this.x1 = f7;
        if (this.r3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.i6.v8 : org.telegram.ui.ActionBar.i6.O8);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.i6.y8;
            kVar.D(i0.a.d(this.x1, themedColor, getThemedColor(i10)), false);
            this.actionBar.D(i0.a.d(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
            this.actionBar.C(i0.a.d(this.x1, getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.i6.t8 : org.telegram.ui.ActionBar.i6.N8), getThemedColor(org.telegram.ui.ActionBar.i6.z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        P4();
    }

    @Override // mg.b
    public final List B() {
        return Arrays.asList(new mg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new mg.a(LocaleController.getString(R.string.ClearLocalDatabase), new ov(this, 28)), new mg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new ov(this, 29)));
    }

    public final void B3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.o.a(((-this.N) - R3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.t3, this.h.e)) * Math.max(this.b.e, (1.0f - S3()) * a2);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void B4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.E2 = null;
            this.F2 = null;
            return;
        }
        this.E2 = str;
        this.F2 = null;
        this.D2 = null;
        if (this.B1 != null) {
            i3(charSequence);
        } else {
            this.U3 = charSequence;
        }
    }

    public final void C3() {
        if (this.Z != null) {
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f7);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.n91 n91Var = this.a0;
        me.b bVar = this.s;
        if (n91Var != null) {
            float f10 = 1.0f - bVar.e;
            n91Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        gg.r0 r0Var = this.b0;
        if (r0Var != null) {
            float f11 = bVar.e;
            r0Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void C4(float f7) {
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
                kx kxVar = this.E0;
                if (kxVar != null) {
                    kxVar.setTranslationX(f10);
                }
                jy jyVar = this.X;
                if (jyVar != null) {
                    jyVar.setTranslationX(f10);
                }
                nx nxVar = this.F3;
                if (nxVar == null || nxVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.F3.getFragmentView().setTranslationX(f10);
                return;
            }
            float f11 = -AndroidUtilities.dp(4.0f);
            float f12 = 1.0f - this.W3;
            float f13 = f11 * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            kx kxVar2 = this.E0;
            if (kxVar2 != null) {
                kxVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            jy jyVar2 = this.X;
            if (jyVar2 != null) {
                jyVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            nx nxVar2 = this.F3;
            if (nxVar2 == null || nxVar2.getFragmentView() == null) {
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

    public final void D3(boolean z10) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.a0 != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.at atVar = this.J1;
        int c10 = measuredHeight + (atVar != null ? (int) atVar.c(AndroidUtilities.dp(7.0f)) : 0);
        dy dyVar = this.C0;
        SparseArray sparseArray = dyVar.h;
        dyVar.U0 = c10;
        dyVar.V0 = i10;
        ai.w0 w0Var = dyVar.V;
        if (z10) {
            w0Var.o1(0, c10, 0, i10);
        } else {
            w0Var.setPadding(0, c10, 0, i10);
        }
        dyVar.M0.j(dyVar.U0, dyVar.V0, z10);
        org.telegram.ui.Components.qo0 qo0Var = dyVar.W;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qo0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = dyVar.U0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != dyVar.V0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = dyVar.V0;
            qo0Var.requestLayout();
        }
        org.telegram.ui.Components.dp0.P(dyVar.f0, dyVar.i0, dyVar.U0, dyVar.V0, z10);
        org.telegram.ui.Components.dp0.P(dyVar.k0, dyVar.n0, dyVar.U0, dyVar.V0, z10);
        org.telegram.ui.Components.dp0.P(dyVar.r0, dyVar.u0, dyVar.U0, dyVar.V0, z10);
        org.telegram.ui.Components.di0 di0Var = dyVar.p0;
        int i13 = dyVar.U0;
        int i14 = dyVar.V0;
        di0Var.setClipToPadding(false);
        org.telegram.ui.Components.k71 k71Var = di0Var.c;
        di0Var.J = z10;
        di0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            k71Var.o1(0, i13, 0, i14);
        } else {
            k71Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) k71Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        di0Var.J = false;
        org.telegram.ui.Components.bo0 bo0Var = dyVar.G0;
        if (bo0Var != null) {
            bo0Var.b(dyVar.U0, dyVar.V0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof w10) {
                ((w10) view).j(dyVar.U0, dyVar.V0, z10);
            }
        }
        for (int i16 = 0; i16 < dyVar.getChildCount(); i16++) {
            if (dyVar.getChildAt(i16) instanceof w10) {
                ((w10) dyVar.getChildAt(i16)).j(dyVar.U0, dyVar.V0, z10);
            }
        }
    }

    public final void D4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.ea1(10, this, r0), new cj(r0, 18));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(x6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
    }

    public final void E3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
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
    public final boolean E4(org.telegram.ui.Cells.s2 s2Var) {
        long j3;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j10;
        int i10;
        LinearLayout linearLayout;
        ty tyVar;
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
        char c11;
        final ty tyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(s2Var.g2);
        boolean z11 = false;
        if (!s2Var.O()) {
            long dialogId = s2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = s2Var.getMessageId();
            if (!DialogObject.isEncryptedDialog(dialogId)) {
                if (DialogObject.isUserDialog(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (tyVar2.X2 == 0 || ((b10 = fi.u0.b(tyVar2.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat chat = tyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
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
                boolean z12 = tyVar2.X2 == 0 && tyVar2.getMessagesController().filtersEnabled && tyVar2.getMessagesController().dialogFiltersLoaded && tyVar2.getMessagesController().dialogFilters != null && tyVar2.getMessagesController().dialogFilters.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z12) {
                    LinearLayout linearLayout2 = new LinearLayout(tyVar2.getParentActivity());
                    linearLayout2.setOrientation(1);
                    vx vxVar = new vx(tyVar2.getParentActivity(), 0);
                    LinearLayout linearLayout3 = new LinearLayout(tyVar2.getParentActivity());
                    linearLayout3.setOrientation(1);
                    vxVar.addView(linearLayout3);
                    int size = tyVar2.getMessagesController().dialogFilters.size();
                    int i18 = 0;
                    org.telegram.ui.ActionBar.f1 f1Var2 = null;
                    while (i18 < size) {
                        final MessagesController.DialogFilter dialogFilter2 = tyVar2.getMessagesController().dialogFilters.get(i18);
                        if (dialogFilter2.isDefault()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            c11 = 'd';
                            i16 = size;
                            j13 = dialogId;
                        } else {
                            final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(tyVar2.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            i16 = size;
                            j13 = dialogId;
                            final ArrayList J = org.telegram.ui.Components.d10.J(tyVar2, dialogFilter2, arrayList, true, z11);
                            if (!includesDialog) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, tyVar2.getParentActivity(), null, false, false);
                            f1Var3.setChecked(includesDialog);
                            i17 = i16;
                            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, f1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, f1Var3.getTextView().getPaint().getFontMetricsInt());
                            f1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                            f1Var3.g(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.t10(tyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                            f1Var3.getTextView().setEmojiColor(tyVar2.getThemedColor(org.telegram.ui.ActionBar.i6.Oh));
                            f1Var3.setMinimumWidth(160);
                            f1Var = f1Var3;
                            j13 = j13;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            f1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.kw
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j14;
                                    MessagesController.DialogFilter dialogFilter3;
                                    ty tyVar3 = ty.this;
                                    tyVar3.getClass();
                                    boolean z13 = includesDialog;
                                    ArrayList arrayList3 = J;
                                    MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                                    long j15 = j13;
                                    if (z13) {
                                        dialogFilter4.alwaysShow.remove(Long.valueOf(j15));
                                        dialogFilter4.neverShow.add(Long.valueOf(j15));
                                        f10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, tyVar3, null);
                                        tyVar3.V3().k(j15, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
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
                                            f10.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, tyVar3, null);
                                        }
                                        tyVar3.V3().k(j14, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                                    }
                                    tyVar3.Y3(true);
                                    tyVar3.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(f1Var);
                            tyVar2 = this;
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
                        tyVar2 = this;
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
                        f1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 19));
                        linearLayout2.addView(f1Var5);
                        linearLayout2.addView(k1Var, w7.x5.n(-1, 8));
                        linearLayout2.addView(vxVar);
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
                    f1Var6.setOnClickListener(new rv(2, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new gu(n2VarArr, 3));
                }
                if (isCommunity) {
                    tyVar = this;
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
                    ty tyVar3 = this;
                    j10 = j14;
                    f1Var7.setOnClickListener(new fo(tyVar3, s2Var, j14, 4));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var7);
                    tyVar = tyVar3;
                }
                boolean[] zArr3 = new boolean[1];
                zArr3[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(j10);
                int i19 = tyVar.e0[c10].s;
                boolean z13 = (i19 == 7 || i19 == 8) && (!tyVar.actionBar.t() || tyVar.actionBar.u(null));
                if (z13) {
                    zArr = zArr3;
                    dialogFilter = tyVar.getMessagesController().selectedDialogFilter[tyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    zArr = zArr3;
                    dialogFilter = null;
                }
                if (tyVar.d4(dialog)) {
                    zArr2 = zArr;
                    j11 = j10;
                    r42 = 0;
                } else {
                    ArrayList<TLRPC.Dialog> dialogs = tyVar.getMessagesController().getDialogs(tyVar.V2);
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
                        } else if (tyVar.d4(dialog2)) {
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
                            if (!tyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                                break;
                            }
                        }
                        i20++;
                        zArr = zArr2;
                        j10 = j11;
                        z13 = z10;
                    }
                    if (dialog == null || tyVar.d4(dialog)) {
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
                    int size3 = (!z10 || dialogFilter == null) ? (tyVar.V2 == 0 && dialogFilter == null) ? tyVar.getUserConfig().isPremium() ? tyVar.getMessagesController().maxPinnedDialogsCountPremium : tyVar.getMessagesController().maxPinnedDialogsCountDefault : tyVar.getUserConfig().isPremium() ? tyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : tyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
                    boolean z14 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
                    r42 = 0;
                    zArr2[0] = z14;
                }
                if (zArr2[r42]) {
                    org.telegram.ui.ActionBar.f1 f1Var8 = new org.telegram.ui.ActionBar.f1(tyVar.getParentActivity(), r42, r42);
                    if (tyVar.d4(dialog)) {
                        f1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
                    } else {
                        f1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
                    }
                    f1Var8.setMinimumWidth(160);
                    long j15 = j11;
                    j12 = j15;
                    f1Var8.setOnClickListener(new org.telegram.ui.Components.as(tyVar, dialogFilter, dialog, j15, 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var8);
                } else {
                    j12 = j11;
                }
                if (DialogObject.isUserDialog(j12) && UserObject.isUserSelf(tyVar.getMessagesController().getUser(Long.valueOf(j12)))) {
                    i11 = 0;
                } else {
                    org.telegram.ui.ActionBar.f1 f1Var9 = new org.telegram.ui.ActionBar.f1(tyVar.getParentActivity(), false, false);
                    if (tyVar.getMessagesController().isDialogMuted(j12, 0L)) {
                        f1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
                    } else {
                        f1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
                    }
                    f1Var9.setMinimumWidth(160);
                    f1Var9.setOnClickListener(new ai.b3(tyVar, j12, 2));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var9);
                }
                if (!isCommunity) {
                    org.telegram.ui.ActionBar.f1 f1Var10 = new org.telegram.ui.ActionBar.f1(tyVar.getParentActivity(), i11, true);
                    f1Var10.setIconColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7));
                    int i24 = org.telegram.ui.ActionBar.i6.q7;
                    f1Var10.setTextColor(tyVar.getThemedColor(i24));
                    f1Var10.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.12f, tyVar.getThemedColor(i24)));
                    f1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
                    f1Var10.setMinimumWidth(160);
                    f1Var10.setOnClickListener(new rv(3, tyVar, arrayList));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(f1Var10);
                }
                if (isCommunity) {
                    if (tyVar.n2 != null) {
                        tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                    }
                    tyVar.q4();
                    tyVar.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j12);
                    ty tyVar4 = new ty(bundle2);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        n2VarArr[0] = tyVar4;
                        tyVar.presentFragmentAsPreview(tyVar4);
                        return false;
                    }
                    n2VarArr[0] = tyVar4;
                    tyVar.presentFragmentAsPreviewWithMenu(tyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!tyVar.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                    return i11;
                }
                if (tyVar.n2 != null) {
                    tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                }
                tyVar.q4();
                tyVar.parentLayout.setHighlightActionButtons(true);
                zn znVar = new zn(bundle);
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    n2VarArr[0] = znVar;
                    tyVar.presentFragmentAsPreview(znVar);
                    return true;
                }
                n2VarArr[0] = znVar;
                tyVar.presentFragmentAsPreviewWithMenu(znVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                znVar.J9 = true;
                try {
                    znVar.a1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (s2Var.getCurrentDialogFolderId() == 1) {
            j4(s2Var);
            return false;
        }
        return false;
    }

    public boolean F3() {
        return this.R0 == 10;
    }

    public final void F4(boolean z10) {
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
        this.O3.addListener(new tx(this, z10, i10));
        this.O3.start();
    }

    public final void G3() {
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
                dyVar.b0.R(this.W1, tLObject);
            }
            this.X1 = null;
        }
    }

    public final void G4() {
        if (this.A0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.z0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new hw(this, 10), 1000L);
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.n0) {
            return;
        }
        kVar.h(true);
        this.p3 = false;
        S4(true, true);
    }

    public final void H4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        org.telegram.ui.Components.ea1 ea1Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.f1 f1Var;
        int i10;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, this.k0);
        int i12 = org.telegram.ui.ActionBar.i6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        float f10 = 64.0f;
        int i13 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new ov(this, 4), false);
                H.k();
            }
            H.i(new ov(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new ov(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (b4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new ov(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new ov(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = this.resourceProvider;
        boolean a2 = e6Var2 != null ? e6Var2.a() : org.telegram.ui.ActionBar.i6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new ov(this, 11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new ov(this, 12), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new ov(this, 13), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(H);
        }
        if (getMessagesController().config.walletAvailable.get()) {
            H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new ov(this, 14), false);
        } else {
            TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
            if (launchActivity2 != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = attachMenuBots.bots;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i14);
                    i14++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        sv svVar = new sv(this, tL_attachMenuBot2, launchActivity2, 0);
                        org.telegram.ui.Components.ea1 ea1Var2 = new org.telegram.ui.Components.ea1(9, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.e6 e6Var3 = H.d;
                        if (H.e != null) {
                            int i15 = org.telegram.ui.ActionBar.i6.F8;
                            int i16 = org.telegram.ui.ActionBar.i6.E8;
                            f7 = f10;
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, H.e, H.d, false, false);
                            f1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                            CharSequence a10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.r8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.i6.c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.k0;
                                    charSequence = a10;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(i15, e6Var3), PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence = a10;
                                }
                                ea1Var = ea1Var2;
                                f1Var = f1Var2;
                                i11 = i16;
                                i10 = i15;
                                e6Var = e6Var3;
                                f1Var.h(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.y9 y9Var = f1Var.h;
                                if (y9Var != null) {
                                    y9Var.setLayoutParams(w7.x5.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                                }
                            } else {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                ea1Var = ea1Var2;
                                e6Var = e6Var3;
                                CharSequence charSequence2 = a10;
                                f1Var = f1Var2;
                                i10 = i15;
                                i11 = i16;
                                f1Var.g(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
                            Integer num3 = H.k0;
                            f1Var.c(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                            Integer num4 = H.k0;
                            f1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                            Integer num5 = H.l0;
                            f1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
                            f1Var.setOnClickListener(new org.telegram.ui.Components.ut(8, H, svVar));
                            f1Var.setOnLongClickListener(new ai.r3(3, H, ea1Var));
                            int i17 = H.S;
                            if (i17 > 0) {
                                f1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                                H.r(f1Var, w7.x5.n(H.S, -2));
                            } else {
                                H.r(f1Var, w7.x5.n(-1, -2));
                            }
                            launchActivity2 = launchActivity;
                            arrayList3 = arrayList2;
                            f10 = f7;
                            i13 = 0;
                        }
                    }
                    launchActivity = launchActivity2;
                    arrayList2 = arrayList3;
                    f7 = f10;
                    launchActivity2 = launchActivity;
                    arrayList3 = arrayList2;
                    f10 = f7;
                    i13 = 0;
                }
            }
        }
        float f11 = f10;
        if (getUserConfig().showCallsTab) {
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new ov(this, 6), false);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.o0;
        if (f1Var3 != null) {
            f1Var3.b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.ai));
            this.o0.setOnClickListener(new rv(0, this, H));
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                H.k();
                H.d(this.o0);
            }
        }
        H.Z();
        H.X(-AndroidUtilities.dp(f11));
    }

    public final void I3(String str) {
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
            this.g1.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.z8), 1, -1));
            this.g1.setOnClickListener(new uv(this, 6));
            j3.addView(this.g1, w7.x5.q(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.y8));
        j3.addView(this.h1, w7.x5.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new bi.d(2));
        this.k1 = j3.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j3.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.m1 = j3.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.j1 = j3.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.v0 h = j3.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j3.addView(new View(getParentActivity()), w7.x5.n(5, -1));
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
        Q4(false);
    }

    public final void I4() {
        if (this.R3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new vv(this, 6));
                showDialog(alertDialog$Builder.a, new pv(this, 1));
                this.R3 = str;
                return;
            }
        }
    }

    public final void J3() {
        dy dyVar = this.C0;
        if ((dyVar != null && dyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        dy dyVar2 = new dy(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.V2, this.X2, new yx(this, 1));
        this.C0 = dyVar2;
        ((my) this.fragmentView).addView(dyVar2, this.B0);
        dy dyVar3 = this.C0;
        dyVar3.b0.U = new fy(this);
        dyVar3.i0.setOnItemClickListener(new vv(this, 1));
        this.C0.n0.setOnItemClickListener(new vv(this, 2));
        this.C0.u0.setOnItemClickListener(new zv(this, 0));
        this.C0.n0.setOnItemLongClickListener(new vv(this, 3));
        this.C0.V.setOnItemClickListener(new vv(this, 4));
        this.C0.V.setOnItemLongClickListener(new yx(this, 2));
        this.C0.setFilteredSearchViewDelegate(new vv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.p4);
    }

    public final void J4(long j3, View view) {
        f3(j3, view);
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!t10) {
            if (this.p3) {
                I3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    hg.c.v(false, this.actionBar);
                }
            } else {
                I3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            this.actionBar.O(null, null);
            int i11 = this.e0[0].s;
            ArrayList<TLRPC.Dialog> O3 = ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) ? O3(this.currentAccount, this.e0[0].s, this.V2, this.S1) : getMessagesController().getDialogs(this.V2);
            int size = O3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = O3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!d4(dialog)) {
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
                        sy[] syVarArr = this.e0;
                        if (i14 >= syVarArr.length) {
                            break;
                        }
                        syVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                d5(MessagesController.UPDATE_MASK_REORDER, true);
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
                sy[] syVarArr2 = this.e0;
                if (i16 >= syVarArr2.length) {
                    break;
                }
                sy syVar = syVarArr2[i16];
                if (syVar != null) {
                    syVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.u3.addUpdateListener(new xv(this, max, i10));
            this.u3.addListener(new wx(this, max, c10 == true ? 1 : 0));
            this.u3.setInterpolator(org.telegram.ui.Components.hs.f);
            this.u3.setDuration(200L);
            this.u3.start();
            qw qwVar = this.z0;
            if (qwVar != null) {
                qwVar.b(org.telegram.ui.ActionBar.i6.Gh, org.telegram.ui.ActionBar.i6.Fh, org.telegram.ui.ActionBar.i6.Eh, org.telegram.ui.ActionBar.i6.Hh, org.telegram.ui.ActionBar.i6.w8);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.e1;
            if (g2Var != null) {
                g2Var.c(1.0f, true);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            Y3(true);
            return;
        }
        Q4(false);
        this.h1.a(arrayList.size(), z10);
    }

    public final void K3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new xx(this, parentActivity);
                FrameLayout.LayoutParams a2 = w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83);
                a2.bottomMargin = this.f4 + this.h4 + a2.bottomMargin;
                my myVar = (my) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                myVar.addView(undoView, i11, a2);
            }
        }
    }

    public final void K4(long j3, View view) {
        int i10 = -this.L3;
        this.L3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.ad.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.ad.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ov(this, 23))).j();
    }

    public final void L3(final long j3, final long j10, boolean z10, final fg1 fg1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (m3(j3)) {
            int i10 = this.R0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j3));
                    if (!user2.mutual_contact) {
                        UndoView V3 = V3();
                        if (V3 != null) {
                            V3.j(45, j3, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView V32 = V3();
                        if (V32 != null) {
                            V32.j(46, j3, null);
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
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ow(this, b2Var, user, chat, j3, tL_messages_checkHistoryImportPeer));
                try {
                    b2Var.q(300L);
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
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, fg1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable h0Var = new a3.h0(this, j3, new a3.g0(this, j3, j10, fg1Var, 14), 24);
                if (j3 < 0) {
                    N4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = formatString;
                b2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new gu(h0Var, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.fe0(25));
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
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.pw
                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i12) {
                    ty.this.L3(j3, j10, false, fg1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(b2Var3) == null) {
                b2Var3.show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L4(boolean z10, boolean z11, boolean z12, boolean z13) {
        dy dyVar;
        dy dyVar2;
        kx kxVar;
        dy dyVar3;
        boolean z14;
        dy dyVar4;
        boolean z15;
        org.telegram.ui.Components.n91 n91Var;
        TLRPC.Chat chat;
        nx nxVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            J3();
        } else {
            Z4(false);
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
        j3();
        if (z10) {
            if (!this.s3 && !z13) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.l2 || (totalDialogsCount <= 10 && !this.K)) {
                    z14 = true;
                    dyVar4 = this.C0;
                    if (dyVar4 != null) {
                        dyVar4.O0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.r3 = z15;
                    if (z15) {
                        this.s3 = true;
                    }
                    n91Var = this.a0;
                    if (n91Var != null && dyVar4 != null && !z14 && this.X2 == 0) {
                        org.telegram.ui.Components.n91 n10 = dyVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, w7.x5.e(-1, -1, 119));
                    } else if (this.Z != null && z14 && this.X2 == 0) {
                        AndroidUtilities.removeFromParent(n91Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        D3(false);
                        this.C0.setKeyboardHeight(((my) this.fragmentView).getKeyboardHeight());
                        dy dyVar5 = this.C0;
                        dyVar5.A0.clear();
                        dyVar5.J();
                    }
                    chat = this.Y2;
                    if (chat == null) {
                        gg.p0 p0Var = new gg.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        p0Var.f = this.Y2;
                        g3(p0Var);
                    } else if (this.V2 != 0 && ((nxVar = this.F3) == null || !nxVar.c())) {
                        g3(new gg.p0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
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
            n91Var = this.a0;
            if (n91Var != null) {
            }
            if (this.Z != null) {
                AndroidUtilities.removeFromParent(n91Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Y2;
            if (chat == null) {
            }
        }
        if (z16 && (dyVar3 = this.C0) != null && dyVar3.b0.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (kxVar = this.E0) != null && this.G0) {
            kxVar.setVisibility(0);
        }
        Object[] objArr = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                dy dyVar6 = this.C0;
                if (dyVar6 != null) {
                    dyVar6.setVisibility(0);
                    dy dyVar7 = this.C0;
                    dyVar7.setPosition(0);
                    if (dyVar7.b0.h() > 0) {
                        dyVar7.c0.h1(0, 0);
                    }
                    s4.d0 d0Var = dyVar7.h0;
                    if (d0Var != null) {
                        d0Var.h1(0, 0);
                    }
                    s4.d0 d0Var2 = dyVar7.m0;
                    if (d0Var2 != null) {
                        d0Var2.h1(0, 0);
                    }
                    s4.d0 d0Var3 = dyVar7.t0;
                    if (d0Var3 != null) {
                        d0Var3.h1(0, 0);
                    }
                    dyVar7.h.clear();
                }
                T4(true, null, null, false, false);
                org.telegram.ui.Components.n91 n91Var2 = this.a0;
                if (n91Var2 != null) {
                    n91Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            x4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            dy dyVar8 = this.C0;
            if (dyVar8 != null) {
                dyVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            sy syVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(syVar, (Property<sy, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<sy, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<sy, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            nx nxVar2 = this.F3;
            if (nxVar2 != null) {
                nxVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.F3, (Property<nx, Float>) property, z10 ? 0.0f : 1.0f));
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
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<dy, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<dy, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                W4(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new qv(this, 1));
            arrayList.add(ofFloat);
            this.w1.playTogether(arrayList);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.hs.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new tx(this, z10, i10));
            this.o3.lock();
            this.w1.start();
        } else {
            x4(false, true);
            if (z10) {
                this.e0[0].a.c1();
            } else {
                py pyVar = this.e0[0].a;
                if (pyVar.g1) {
                    pyVar.g1 = false;
                    pyVar.K0(false);
                }
            }
            this.e0[0].setAlpha(z10 ? 0.0f : 1.0f);
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                this.e0[0].setScaleX(z10 ? 0.95f : 1.0f);
                this.e0[0].setScaleY(z10 ? 0.95f : 1.0f);
            }
            dy dyVar11 = this.C0;
            if (dyVar11 != null) {
                dyVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            jy jyVar = this.X;
            if (jyVar != null) {
                jyVar.setTranslationY(T3() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z10) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            A4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.x;
        if (i12 >= 0 && (dyVar2 = this.C0) != null) {
            dyVar2.setPosition(dyVar2.L(i12));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (dyVar = this.C0) != null) {
            dyVar.setPosition((dyVar.q0 ? 1 : 0) + 5);
            Z4(true);
        }
        C3();
        R4();
    }

    public final void M3(long j3, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            sy[] syVarArr = this.e0;
            if (i10 >= syVarArr.length) {
                return;
            }
            int childCount = syVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.s2) {
                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                        if (s2Var.getDialogId() == j3) {
                            s2Var.V(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void M4() {
        int i10;
        int i11;
        if (this.M0 != null || SharedConfig.appLocked || (this.K && !this.E0.g())) {
            return;
        }
        b71[] b71VarArr = new b71[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
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
        ox oxVar = new ox(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), b71VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            oxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l4 = this.B3;
        if (l4 != null) {
            oxVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.D3.f[0];
            oxVar.setSelected(drawable2 instanceof org.telegram.ui.Components.s5 ? Long.valueOf(((org.telegram.ui.Components.s5) drawable2).i()) : null);
        }
        oxVar.setSaveState(1);
        oxVar.y(this.D3, titleTextView);
        px pxVar = new px(this, oxVar);
        this.M0 = pxVar;
        b71VarArr[0] = pxVar;
        pxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        b71VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.ty] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N4(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
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
                org.telegram.ui.Cells.c1.q(isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.c1.q(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
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
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new of(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new of(i10, runnable2));
        showDialog(b2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList O3(int i10, int i11, int i12, boolean z10) {
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
                arrayList2.add(new oy(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.v2) {
                arrayList2.add(new oy(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.y2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.v2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new oy(2));
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
                    if (i4(getMessagesController().getUser(Long.valueOf(dialog3.id)))) {
                        arrayList3.add(dialog3);
                    }
                }
                for (TLRPC.User user2 : users.values()) {
                    if (user2 != null && !messagesController.dialogs_dict.d(user2.id) && i4(user2)) {
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
                    if (h4(getMessagesController().getChat(Long.valueOf(-dialog5.id)), user)) {
                        arrayList3.add(dialog5);
                    }
                }
                for (TLRPC.Chat chat : chats.values()) {
                    if (chat != null && !messagesController.dialogs_dict.d(-chat.id) && h4(chat, user)) {
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

    public final void O4(boolean z10) {
        sy[] syVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            syVarArr = this.e0;
            if (i11 >= syVarArr.length) {
                break;
            }
            syVarArr[i11].a.B0();
            i11++;
        }
        char c10 = (!z10 || syVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = syVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.e0[c10].h);
        if (dialogFilter.isDefault()) {
            sy syVar = this.e0[c10];
            syVar.s = this.R0;
            py pyVar = syVar.a;
            int i13 = py.t3;
            pyVar.B1();
        } else {
            sy[] syVarArr2 = this.e0;
            if (syVarArr2[c10 ^ 1].s == 7) {
                syVarArr2[c10].s = 8;
            } else {
                syVarArr2[c10].s = 7;
            }
            syVarArr2[c10].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.e0[c10].s == 8 ? 1 : 0);
        }
        sy[] syVarArr3 = this.e0;
        if (syVarArr3.length > 1) {
            syVarArr3[1].E = dialogFilter.locked;
        }
        sy syVar2 = syVarArr3[c10];
        ax axVar = syVar2.d;
        axVar.h = syVar2.s;
        axVar.l();
        sy syVar3 = this.e0[c10];
        ww wwVar = syVar3.c;
        if (syVar3.s == 0 && W3() && this.e0[c10].v == 2) {
            i10 = 1;
        }
        wwVar.h1(i10, (int) this.N);
        o3(this.e0[c10]);
    }

    public final float P3(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - S3()) * this.r.e;
    }

    public final void P4() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        v41 v41Var = this.Z;
        float measuredHeight = (v41Var == null || v41Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float dp = this.K ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.K) {
            float f16 = this.N;
            float f17 = this.x1;
            f7 = (measuredHeight * f17) + com.google.android.gms.internal.vision.e2.y(1.0f, f17, dp, f16);
            f10 = this.w3;
        } else {
            f7 = (measuredHeight * this.x1) + this.N;
            f10 = this.w3;
        }
        float f18 = f7 + f10 + this.T;
        jy jyVar = this.X;
        float dp2 = AndroidUtilities.dp(4.0f) * ((jyVar == null || jyVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        qw qwVar = this.z0;
        if (qwVar != null) {
            qwVar.setTranslationY(f18 - dp2);
            f12 = this.z0.getAlpha();
            f13 = AndroidUtilities.dp(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.at atVar = this.J1;
        if (atVar != null) {
            atVar.setTranslationY(AndroidUtilities.lerp(f11 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.a0 == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.zs zsVar = this.K1;
        if (zsVar != null) {
            zsVar.setTranslationY(f18 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f14, f12));
            org.telegram.ui.Components.zs zsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f15 + f13) - lerp);
            Matrix matrix = zsVar2.b;
            if (zsVar2.e != lerp || zsVar2.f != min) {
                zsVar2.e = lerp;
                zsVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = zsVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                zsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f12, f14));
        }
    }

    public final int Q3() {
        if (!this.K) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03de, code lost:
    
        if (r1.isEmpty() == false) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        qw qwVar;
        org.telegram.ui.Components.w00 d;
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
                boolean d42 = d4(dialog);
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
                        if (d42) {
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
                            if (d42) {
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
                qw qwVar2 = this.z0;
                if (qwVar2 == null || qwVar2.getVisibility() != 0) {
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
                qw qwVar3 = this.z0;
                if (qwVar3 == null || qwVar3.getVisibility() != 0) {
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
                qw qwVar4 = this.z0;
                if (qwVar4 == null || qwVar4.getVisibility() != 0) {
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
            qw qwVar5 = this.z0;
            boolean z13 = qwVar5 == null || qwVar5.getVisibility() != 0 || ((d = (qwVar = this.z0).d()) != null && d.a == qwVar.L);
            if (!z13) {
                try {
                    z13 = size >= O3(this.currentAccount, this.e0[0].d.h, this.V2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z11 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.V2 != 1) {
                        if (this.z0 != null && P3(z11) > 0.5f) {
                            qw qwVar6 = this.z0;
                            org.telegram.ui.Components.w00 d10 = qwVar6.d();
                            if (d10 != null && d10.a == qwVar6.L) {
                                int i22 = org.telegram.ui.Components.d10.w;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i23 = 0; i23 < size2; i23++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                                    if (!org.telegram.ui.Components.d10.J(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
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

    public final int R3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x069a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R4() {
        long j3;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        ApplicationLoader applicationLoader;
        boolean z13;
        String next;
        StringBuilder sb2;
        final long j10;
        final long j11;
        boolean z14;
        nx nxVar;
        boolean z15;
        nx nxVar2;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.a3 a3Var = this.M1;
        final int i10 = 0;
        if (a3Var != null) {
            try {
                ((org.telegram.ui.Components.ck0) ((org.telegram.ui.Components.j9) a3Var.h.getImageReceiver().getStaticThumb()).B).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.a3 a3Var2 = this.M1;
            a3Var2.setCompact(false);
            a3Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.y9 y9Var = a3Var2.h;
            y9Var.setVisibility(8);
            y9Var.b();
        }
        long j12 = 0;
        final int i11 = 1;
        if (isInPreviewMode()) {
            str = null;
            z12 = false;
        } else {
            if (getMessagesController().isFrozen()) {
                this.M1.setOnClickListener(new uv(this, 12));
                this.M1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i12 = 5;
                if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new uv(this, 19));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.M1.c, new hw(this, i12)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.M1.setOnCloseListener(new uv(this, 24));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new uv(this, 25));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.M1.c, new hw(this, i12)), LocaleController.getString(R.string.GraceMessage));
                    this.M1.setOnCloseListener(new uv(this, 26));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.M1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt()));
                    this.M1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lw
                        public final /* synthetic */ ty b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    of.f.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    ty.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lw
                        public final /* synthetic */ ty b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    of.f.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    ty.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.V2 == 0 && this.X2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        yh.m5 y3 = yh.m5.y(this.currentAccount, false);
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
                                yh.m5 y10 = yh.m5.y(this.currentAccount, false);
                                ArrayList arrayList2 = y10.z;
                                StringBuilder sb3 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb2 = sb3;
                                    j10 = j3;
                                    j11 = j10;
                                } else {
                                    int i14 = 0;
                                    long j15 = j3;
                                    j11 = j15;
                                    while (i14 < arrayList2.size()) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i14);
                                        int i15 = i10;
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
                                                i14++;
                                                i10 = i15;
                                            } else {
                                                i14++;
                                                i10 = i15;
                                            }
                                        } else {
                                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-peerDialogId2));
                                            if (chat != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(chat.title);
                                                j15 += starsSubscription2.pricing.amount;
                                                i14++;
                                                i10 = i15;
                                            } else {
                                                i14++;
                                                i10 = i15;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j10 = j15;
                                }
                                boolean z16 = i10;
                                final String sb4 = sb2.toString();
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ty tyVar = ty.this;
                                        new yh.e7(tyVar.getParentActivity(), tyVar.getResourceProvider(), j10, 2, sb4, new ov(tyVar, 17), j11).show();
                                    }
                                });
                                org.telegram.ui.Cells.a3 a3Var3 = this.M1;
                                long j16 = j10 - y10.f.amount;
                                if (j16 > j3) {
                                    j10 = j16;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z16 ? 1 : 0] = sb4;
                                a3Var3.b(yh.p7.Y0(z16, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j10, objArr), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.M1.setOnCloseListener(new uv(this, 13));
                                z12 = true;
                                str = null;
                            }
                            if (this.V2 == 0 || this.X2 != j3 || getMessagesController().premiumPurchaseBlocked() || !BirthdayController.getInstance(this.currentAccount).contains() || getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                int i16 = 16;
                                if (this.V2 != 0 && this.X2 == j3 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                    ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                    this.M1.setOnClickListener(new uv(this, 15));
                                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.M1.c, new hw(this, i12)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                    this.M1.setOnCloseListener(new uv(this, i16));
                                } else {
                                    if ((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false) {
                                        if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                            this.M1.setOnClickListener(new uv(this, 18));
                                            this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.i6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                        } else {
                                            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.V2 != 0 || this.X2 != j3 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null : !(BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null)))) {
                                                z10 = false;
                                            } else {
                                                this.A3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                                z10 = true;
                                            }
                                            int i17 = 20;
                                            if (z10) {
                                                this.M1.setOnClickListener(new uv(this, i17));
                                                this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.A3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.i6.I6, 2, null), LocaleController.getString(this.A3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                            } else {
                                                if (this.O1 != null && this.P1 != null) {
                                                    if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                                        MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                                    } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j3)) {
                                                        z11 = true;
                                                        if (!z11) {
                                                            this.M1.setOnClickListener(new uv(this, 21));
                                                            this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.O1.longValue())), org.telegram.ui.ActionBar.i6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                        } else if (this.V2 == 0 && this.X2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                            this.M1.setOnClickListener(new uv(this, 22));
                                                            this.M1.h.setVisibility(0);
                                                            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                                                            j9Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                            long clientUserId = getUserConfig().getClientUserId();
                                                            j9Var.A = true;
                                                            j9Var.b = true;
                                                            j9Var.c = false;
                                                            int i18 = org.telegram.ui.ActionBar.i6.p8[org.telegram.ui.Components.j9.e(clientUserId)];
                                                            org.telegram.ui.ActionBar.e6 e6Var = j9Var.z;
                                                            j9Var.d = org.telegram.ui.ActionBar.i6.w0(i18, e6Var);
                                                            j9Var.e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q8[org.telegram.ui.Components.j9.e(clientUserId)], e6Var);
                                                            j9Var.n = 0;
                                                            j9Var.m = false;
                                                            org.telegram.ui.Components.j9.a("", "", "", j9Var.q);
                                                            j9Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                            this.M1.h.setImageDrawable(j9Var);
                                                            this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.M1.c, new hw(this, i12)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                            this.M1.setOnCloseListener(new uv(this, 23));
                                                        } else {
                                                            if (this.V2 == 0 && this.X2 == 0 && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null) {
                                                                CharSequence[] charSequenceArr = new CharSequence[2];
                                                                boolean[] zArr = new boolean[1];
                                                                if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                    z13 = true;
                                                                } else {
                                                                    Iterator<String> it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                    while (it.hasNext()) {
                                                                        next = it.next();
                                                                        if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                            z13 = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                    z13 = false;
                                                                }
                                                                next = null;
                                                                if (z13) {
                                                                    this.M1.setOnClickListener(new a(next, i17));
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
                                                                        this.M1.setOnCloseListener(new rv(i12, this, next));
                                                                    }
                                                                    z12 = true;
                                                                }
                                                            }
                                                            str = null;
                                                            z12 = false;
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                if (!z11) {
                                                }
                                            }
                                        }
                                    } else {
                                        this.M1.setOnClickListener(new ai.e2(i16));
                                        this.M1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.i6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                        this.M1.setOnCloseListener(new uv(this, 17));
                                    }
                                }
                            } else {
                                BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                ArrayList<TLRPC.User> arrayList3 = state.today;
                                this.M1.setOnClickListener(new rv(4, this, state));
                                this.M1.a(this.currentAccount, arrayList3);
                                this.M1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList3.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList3.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList3.size(), new Object[0]), org.telegram.ui.ActionBar.i6.I6, 2, null), this.M1.c, new hw(this, i12)), LocaleController.formatString(arrayList3.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.M1.setOnCloseListener(new uv(this, 14));
                                yh.m5.y(this.currentAccount, false).V();
                            }
                            z12 = true;
                            str = null;
                        } else if (!y3.A) {
                            y3.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new yh.p4(y3, i10));
                        }
                    }
                    j3 = 0;
                    if (this.V2 == 0) {
                    }
                    int i162 = 16;
                    if (this.V2 != 0) {
                    }
                    if ((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j3) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false) {
                    }
                    z12 = true;
                    str = null;
                }
            }
            str = null;
            z12 = true;
        }
        nx nxVar3 = this.F3;
        me.b bVar = this.b;
        if ((nxVar3 != null && nxVar3.c()) || bVar.f) {
            z12 = false;
        }
        this.J1.i(this.M1, z12, true);
        n3(true);
        if (this.fragmentView == null || this.J1 == null) {
            z14 = false;
        } else {
            boolean z17 = !isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((nxVar2 = this.F3) == null || !nxVar2.c()) && !bVar.f;
            if (z17) {
                if (this.N1 == null) {
                    org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(getParentActivity());
                    this.N1 = uaVar;
                    this.J1.addView(uaVar);
                }
                org.telegram.ui.Cells.ua uaVar2 = this.N1;
                int i19 = this.currentAccount;
                TextView textView = uaVar2.b;
                TextView textView2 = uaVar2.c;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList4 = MessagesController.getInstance(i19).getUnconfirmedAuthController().auths;
                org.telegram.ui.Cells.ta taVar = uaVar2.d;
                taVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                taVar.a(false, false);
                org.telegram.ui.Cells.ta taVar2 = uaVar2.e;
                taVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                taVar2.a(false, false);
                if (arrayList4 != null && arrayList4.size() == 1) {
                    UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList4.get(0);
                    textView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
                    String str2 = "" + unconfirmedAuth.device;
                    if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str2.isEmpty()) {
                        str2 = str2.concat(", ");
                    }
                    StringBuilder v = a1.g.v(str2);
                    v.append(unconfirmedAuth.location);
                    String sb5 = v.toString();
                    if (unconfirmedAuth.bot) {
                        textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingleBot, "@" + DialogObject.getShortName(unconfirmedAuth.bot_id), sb5));
                        z15 = true;
                        taVar.setOnClickListener(new org.telegram.ui.Cells.ra(this, z15, i19, arrayList4));
                        z14 = false;
                        taVar2.setOnClickListener(new org.telegram.ui.Cells.sa((Object) uaVar2, i19, (Object) arrayList4, (int) (0 == true ? 1 : 0)));
                    } else {
                        textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, sb5));
                    }
                } else if (arrayList4 != null && arrayList4.size() > 1) {
                    textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
                    String str3 = arrayList4.get(0).location;
                    int i20 = 1;
                    while (true) {
                        if (i20 >= arrayList4.size()) {
                            break;
                        }
                        if (!TextUtils.equals(str3, arrayList4.get(i20).location)) {
                            str3 = str;
                            break;
                        }
                        i20++;
                    }
                    if (str3 == null) {
                        textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultiple", arrayList4.size(), new Object[0]));
                    } else {
                        textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultipleFrom", arrayList4.size(), str3));
                    }
                }
                z15 = false;
                taVar.setOnClickListener(new org.telegram.ui.Cells.ra(this, z15, i19, arrayList4));
                z14 = false;
                taVar2.setOnClickListener(new org.telegram.ui.Cells.sa((Object) uaVar2, i19, (Object) arrayList4, (int) (0 == true ? 1 : 0)));
            } else {
                z14 = false;
            }
            org.telegram.ui.Cells.ua uaVar3 = this.N1;
            if (uaVar3 != null) {
                this.J1.i(uaVar3, z17, true);
            }
        }
        if (this.fragmentView == null || this.J1 == null) {
            return;
        }
        boolean z18 = (!isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((nxVar = this.F3) == null || !nxVar.c()) && !bVar.f) ? true : z14;
        if (z18 && this.L1 == null) {
            org.telegram.ui.Cells.m mVar = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
            this.L1 = mVar;
            this.J1.addView(mVar);
        }
        org.telegram.ui.Cells.m mVar2 = this.L1;
        if (mVar2 != null) {
            this.J1.i(mVar2, z18, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.eh0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        nx nxVar;
        ci.bb bbVar;
        qw qwVar;
        if (!this.p3 && (((nxVar = this.F3) == null || !nxVar.c()) && (((bbVar = this.K0) == null || bbVar.getVisibility() != 0) && ((qwVar = this.z0) == null || !qwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qw qwVar2 = this.z0;
                boolean z11 = qwVar2 == null || qwVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                qw qwVar3 = this.z0;
                boolean z12 = qwVar3 == null || qwVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
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

    public final float S3() {
        nx nxVar = this.F3;
        if (nxVar == null || !nxVar.c()) {
            return 0.0f;
        }
        return this.F3.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    public final void S4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        MessagesController.DialogFilter dialogFilter;
        Object[] objArr;
        boolean z12;
        boolean z13;
        if (this.z0 == null || this.inPreviewMode || this.p3) {
            return;
        }
        nx nxVar = this.F3;
        if (nxVar == null || !nxVar.c()) {
            org.telegram.ui.Components.p80 p80Var = this.L0;
            if (p80Var != null) {
                p80Var.u();
                this.L0 = null;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            me.b bVar = this.r;
            boolean z14 = true;
            boolean z15 = false;
            if (size <= 1) {
                r52 = 0;
                if (this.z0.getVisibility() != 8) {
                    this.z0.setIsEditing(false);
                    F4(false);
                    this.m3 = false;
                    if (this.l3) {
                        this.l3 = false;
                        this.e0[0].setTranslationX(0.0f);
                        this.e0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.e0[0].h != this.z0.getDefaultTabId()) {
                        this.e0[0].h = this.z0.getDefaultTabId();
                        ax axVar = this.e0[0].d;
                        axVar.h = 0;
                        axVar.l();
                        sy syVar = this.e0[0];
                        syVar.s = this.R0;
                        syVar.d.l();
                    }
                    this.e0[1].setVisibility(8);
                    sy syVar2 = this.e0[1];
                    syVar2.h = 0;
                    ax axVar2 = syVar2.d;
                    axVar2.h = 0;
                    axVar2.l();
                    sy syVar3 = this.e0[1];
                    syVar3.s = this.R0;
                    syVar3.d.l();
                    this.w = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.Q3 != null) ? false : z11;
                        if (!this.p3) {
                            bVar.a(false, z16);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        sy[] syVarArr = this.e0;
                        if (i10 >= syVarArr.length) {
                            break;
                        }
                        sy syVar4 = syVarArr[i10];
                        if (syVar4.s == 0 && syVar4.v == 2 && W3() && ((L0 = this.e0[i10].c.L0()) == 0 || L0 == 1)) {
                            this.e0[i10].c.h1(1, (int) this.N);
                        }
                        this.e0[i10].a.setScrollingTouchSlop(0);
                        this.e0[i10].a.requestLayout();
                        this.e0[i10].requestLayout();
                        i10++;
                    }
                    this.z0.L = -1;
                    r52 = 0;
                }
            } else if (z10 || this.z0.getVisibility() != 0) {
                boolean z17 = this.z0.getVisibility() != 0 ? false : z11;
                this.w = true;
                boolean isEmpty = this.z0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z18 = (this.isPaused || this.Q3 != null) ? false : z11;
                    if (!this.p3) {
                        bVar.a(this.w, z18);
                    }
                }
                int currentTabId = this.z0.getCurrentTabId();
                int currentTabStableId = this.z0.getCurrentTabStableId();
                if (currentTabId == this.z0.getDefaultTabId() || currentTabId < dialogFilters.size()) {
                    objArr = false;
                } else {
                    this.z0.L = -1;
                    objArr = true;
                }
                qw qwVar = this.z0;
                qwVar.h.clear();
                qwVar.j0.clear();
                qwVar.l0.clear();
                qwVar.m0.clear();
                qwVar.n0.clear();
                qwVar.o0.clear();
                qwVar.M = 0;
                int size2 = dialogFilters.size();
                int i11 = 0;
                while (i11 < size2) {
                    if (dialogFilters.get(i11).isDefault()) {
                        this.z0.a(i11, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i11).locked);
                        z13 = z15;
                    } else {
                        MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i11);
                        z13 = z15;
                        this.z0.a(i11, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i11).locked);
                    }
                    i11++;
                    z15 = z13;
                }
                boolean z19 = z15;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.z0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            qw qwVar2 = this.z0;
                            if (qwVar2.h(qwVar2.k0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = z19 ? 1 : 0;
                        }
                    }
                    if (this.z0.k0.get(this.e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                        this.e0[z19 ? 1 : 0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i12 = z19 ? 1 : 0;
                while (true) {
                    sy[] syVarArr2 = this.e0;
                    if (i12 >= syVarArr2.length) {
                        break;
                    }
                    if (syVarArr2[i12].h >= dialogFilters.size()) {
                        this.e0[i12].h = dialogFilters.size() - 1;
                    }
                    this.e0[i12].a.setScrollingTouchSlop(1);
                    i12++;
                }
                qw qwVar3 = this.z0;
                qwVar3.F.setItemAnimator(z17 ? qwVar3.s0 : null);
                qwVar3.I.l();
                if (isEmpty) {
                    O4(z19);
                }
                qw qwVar4 = this.z0;
                int currentTabId2 = qwVar4.getCurrentTabId();
                ArrayList arrayList = qwVar4.h;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.w00) arrayList.get(i13)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.w00) arrayList.get(i13)).f;
                            break;
                        }
                        i13++;
                    }
                }
                if (z12) {
                    qw qwVar5 = this.z0;
                    ArrayList arrayList2 = qwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        qwVar5.f((org.telegram.ui.Components.w00) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            Q4(r52);
            int i14 = this.e0[r52].s;
            if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= dialogFilters.size()) {
                        z14 = false;
                        break;
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                    if (dialogFilter3 != null && dialogFilter3.id == dialogFilter.id) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z14) {
                    return;
                }
                O4(false);
            }
        }
    }

    public final float T3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.b.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T4(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        dy dyVar;
        boolean z13;
        org.telegram.ui.Components.n91 n91Var;
        if (!this.p3 || this.l2 || (dyVar = this.C0) == null) {
            return;
        }
        ArrayList<gg.p0> currentSearchFilters = dyVar.getCurrentSearchFilters();
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
                n91Var = this.a0;
                if (n91Var != null) {
                    n91Var.b(z13, true);
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
        n91Var = this.a0;
        if (n91Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    public final ai.m9 U3() {
        return getMessagesController().getStoriesController();
    }

    public final void U4() {
        float f7 = (((-this.f4) - this.i4) - this.u1) - this.v1;
        org.telegram.ui.Components.p20 p20Var = this.t0;
        if (p20Var != null) {
            p20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.p20 p20Var2 = this.u0;
        if (p20Var2 != null) {
            p20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ci.d4 d4Var = this.p0;
            if (d4Var != null) {
                d4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView V3() {
        K3();
        UndoView[] undoViewArr = this.y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            my myVar = (my) this.fragmentView;
            myVar.removeView(undoViewArr[0]);
            myVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void V4(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.T3;
        org.telegram.ui.Components.p20 p20Var = this.t0;
        if (p20Var != null) {
            p20Var.e(z12, z10);
        }
        org.telegram.ui.Components.p20 p20Var2 = this.u0;
        if (p20Var2 != null) {
            p20Var2.e(z12, z10);
        }
    }

    public final boolean W3() {
        return !this.l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void W4(boolean z10, boolean z11) {
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
                u3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.d2;
                boolean z14 = i11 == 3 || i11 == 5;
                this.o0.setSubtext(LocaleController.getString(z13 ? z14 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.n0.b(z13, z14, z10);
            }
        }
    }

    public final boolean X3() {
        ArrayList arrayList = this.D2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void X4() {
        org.telegram.ui.Components.rr0 rr0Var;
        dx dxVar = this.B1;
        ArrayList arrayList = this.I2;
        if (dxVar == null) {
            if (this.R0 == 10) {
                Z3(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        Y4();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.R0 == 3 && this.f2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.hs.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.l0(false, false, false);
                this.B1.N();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!X3() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.V3 && (rr0Var = this.G2) != null) {
                    this.V3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    rr0Var.j();
                    rr0Var.F = string2;
                    org.telegram.ui.Components.pr0 pr0Var = rr0Var.a[0];
                    if (string2 != null) {
                        pr0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(rr0Var, 29);
                    rr0Var.G = bd0Var;
                    AndroidUtilities.runOnUIThread(bd0Var, 1000L);
                }
            }
            this.C1.g(Math.max(1, arrayList.size()), true);
            int i10 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i11 = 0;
            long j3 = 0;
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
            this.B1.Q1();
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.hs.h);
            }
        }
        this.P3 = arrayList.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y3(boolean z10) {
        boolean z11;
        this.actionBar.s();
        this.I2.clear();
        org.telegram.ui.ActionBar.g2 g2Var = this.e1;
        int i10 = 1;
        if (g2Var != null) {
            g2Var.c(0.0f, true);
        }
        qw qwVar = this.z0;
        if (qwVar != null) {
            qwVar.b(org.telegram.ui.ActionBar.i6.K8, org.telegram.ui.ActionBar.i6.I8, org.telegram.ui.ActionBar.i6.J8, org.telegram.ui.ActionBar.i6.L8, org.telegram.ui.ActionBar.i6.d6);
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
        z4(-Q3());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sy[] syVarArr = this.e0;
            if (i12 >= syVarArr.length) {
                break;
            }
            sy syVar = syVarArr[i12];
            if (syVar != null) {
                syVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, 0.0f);
        this.u3 = ofFloat;
        ofFloat.addUpdateListener(new xv(this, max, i10));
        this.u3.addListener(new wx(this, max, i11));
        this.u3.setInterpolator(org.telegram.ui.Components.hs.f);
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
                i11 = 0;
                i10 = 1;
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
        Q4(true);
        if (this.e0 != null) {
            int i14 = z11;
            while (true) {
                sy[] syVarArr2 = this.e0;
                if (i14 >= syVarArr2.length) {
                    break;
                }
                syVarArr2[i14].d.H = z11;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i16 = z11;
        if (z10) {
            i16 = MessagesController.UPDATE_MASK_CHAT;
        }
        d5(i16 | i15, true);
    }

    public final void Y4() {
        org.telegram.ui.Components.rr0 rr0Var = this.G2;
        if (rr0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        rr0Var.h(i10);
        rr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = rr0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.pr0 pr0Var = rr0Var.a[0];
        if (rr0Var.b == 1) {
            pr0Var.d.l(rr0Var.c(pr0Var), false);
        }
    }

    public final void Z3(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (z10 && this.b2) {
            return;
        }
        this.T3 = z10;
        V4(true);
        if (z10) {
            ci.d4 d4Var = this.p0;
            if (d4Var != null) {
                d4Var.e(true);
            }
            ci.d4 d4Var2 = this.q0;
            if (d4Var2 != null) {
                d4Var2.e(true);
            }
        }
    }

    public final void Z4(boolean z10) {
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

    public final void a5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.q5 q5Var;
        kx kxVar = this.E0;
        org.telegram.ui.Components.q5 q5Var2 = null;
        if (kxVar != null && (q5Var = kxVar.a0) != null && kxVar.q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                q5Var.j(emojiStatusDocumentId.longValue(), z10);
                q5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(kxVar.f).isPremiumUser(user)) {
                q5Var.g(null, z10);
                q5Var.m(false, z10);
            } else {
                if (kxVar.N0 == null) {
                    kxVar.N0 = kxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    kxVar.N0 = new ai.p(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), kxVar.N0);
                }
                kxVar.N0.setColorFilter(new PorterDuffColorFilter(kxVar.f(org.telegram.ui.ActionBar.i6.zh), PorterDuff.Mode.MULTIPLY));
                q5Var.g(kxVar.N0, z10);
                q5Var.m(false, z10);
            }
            q5Var.k(Integer.valueOf(kxVar.f(org.telegram.ui.ActionBar.i6.zh)));
            kxVar.W.invalidate();
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
            this.actionBar.setRightDrawableOnClick(new uv(this, 2));
            k71.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.D3.g(null, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.K3 == null) {
                this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.K3 = new iy(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
            }
            this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.zh), PorterDuff.Mode.MULTIPLY));
            this.D3.g(this.K3, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new uv(this, 3));
            k71.t(this.currentAccount);
        }
        org.telegram.ui.Components.q5 q5Var3 = this.D3;
        int i10 = org.telegram.ui.ActionBar.i6.zh;
        q5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.E3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        px pxVar = this.M0;
        if (pxVar == null || !(pxVar.getContentView() instanceof k71)) {
            return;
        }
        org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
        k71 k71Var = (k71) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.q5 q5Var4 = this.D3;
            if (rightDrawable == q5Var4) {
                q5Var2 = q5Var4;
            }
        }
        k71Var.y(q5Var2, titleTextView);
    }

    public final boolean b4() {
        return this.V2 == 1;
    }

    public final void b5() {
        ci.d4 d4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.N3 != storiesEnabled) {
            U4();
            if (!this.N3 && storiesEnabled && (d4Var = this.p0) != null) {
                d4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.p20 p20Var = this.t0;
        if (p20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            p20Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            p20Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public final boolean c4(long j3) {
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

    public final void c5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        ai.m9 U3;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        nx nxVar = this.F3;
        if ((nxVar != null && nxVar.c()) || this.p3 || (kVar = this.actionBar) == null || kVar.t() || this.l2) {
            return;
        }
        ci.lc lcVar = ci.lc.F2;
        int i10 = 0;
        if ((lcVar != null && lcVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !b4() && U3().G();
        if (this.X2 != 0) {
            z11 = false;
        } else if (b4()) {
            z11 = !U3().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (U3 = U3()).g) != null && arrayList.size() > 0) || U3.H());
            z12 = U3().G();
        }
        this.L = z12;
        boolean z13 = this.G0;
        boolean z14 = z12 || z11;
        this.G0 = z14;
        if (z11 || z14) {
            this.E0.q(z10, z14 != z13);
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
                ofFloat.addUpdateListener(new dj(i11, this));
                this.J.addListener(new org.telegram.ui.Components.i91(this, 18));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.hs.f);
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
            float Q3 = z11 ? 0.0f : Q3();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new cy(this, f7, z11, Q3));
            this.I.addListener(new tx(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.hs.f);
            this.I.start();
            return;
        }
        this.K = z11;
        kx kxVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        kxVar.setVisibility(i13);
        if (z11) {
            this.x3 = -AndroidUtilities.dp(81.0f);
            z4(-Q3());
        } else {
            z4(0.0f);
        }
        while (true) {
            sy[] syVarArr = this.e0;
            if (i10 >= syVarArr.length) {
                break;
            }
            sy syVar = syVarArr[i10];
            if (syVar != null) {
                syVar.a.requestLayout();
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
    public final boolean canBeginSlide() {
        qw qwVar;
        if (this.F3.c()) {
            return false;
        }
        return this.R0 != 3 || (qwVar = this.z0) == null || qwVar.getVisibility() != 0 || this.z0.K <= 0;
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
        dyVar.R();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.a8 a8Var = new org.telegram.ui.Components.a8(this, context, this.resourceProvider, 3);
        a8Var.setAllowOverlayTitle(true);
        a8Var.L();
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.i6.t8), false);
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.i6.z8), true);
        a8Var.D(getThemedColor(org.telegram.ui.ActionBar.i6.v8), false);
        a8Var.D(getThemedColor(org.telegram.ui.ActionBar.i6.y8), true);
        a8Var.k();
        a8Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        a8Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || b4())) {
            return a8Var;
        }
        a8Var.setOccupyStatusBar(false);
        return a8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d50  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0e07  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0e21  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0cd7  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v205, types: [org.telegram.ui.Components.qm0, org.telegram.ui.py] */
    /* JADX WARN: Type inference failed for: r3v206, types: [org.telegram.ui.Components.qm0, org.telegram.ui.py] */
    /* JADX WARN: Type inference failed for: r3v207, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.py] */
    /* JADX WARN: Type inference failed for: r3v211, types: [org.telegram.ui.Components.qm0, org.telegram.ui.py] */
    /* JADX WARN: Type inference failed for: r3v212, types: [org.telegram.ui.Components.qm0, org.telegram.ui.py] */
    /* JADX WARN: Type inference failed for: r3v214, types: [org.telegram.ui.ww, s4.d0] */
    /* JADX WARN: Type inference failed for: r4v69, types: [org.telegram.ui.Components.qm0, org.telegram.ui.py] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.ui.iw] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v23, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f7;
        int i10;
        zn znVar;
        qw qwVar;
        jy jyVar;
        jy jyVar2;
        org.telegram.ui.Components.at atVar;
        ry ryVar;
        s4.z zVar;
        gg.m mVar;
        gg.m mVar2;
        long j3;
        gg.m mVar3;
        gg.m mVar4;
        gg.m mVar5;
        gg.m mVar6;
        ny nyVar;
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
        AndroidUtilities.runOnUIThread(new nv(context2, 0));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
        o9.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.v0 a2 = o9.a(0, R.drawable.outline_header_search);
        a2.F();
        this.j0 = a2;
        a2.setOnClickListener(new uv(this, 1));
        int i13 = 8;
        if (this.R0 == 2 || (b4() && O3(this.currentAccount, this.R0, this.V2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        int i14 = 3;
        ?? r82 = 1;
        if (!this.l2 && this.n2 == null && this.V2 == 0 && this.X2 == 0) {
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getThemedColor(org.telegram.ui.ActionBar.i6.t8), getThemedColor(org.telegram.ui.ActionBar.i6.v8), context2, true);
            this.m0 = v0Var;
            v0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.m0, w7.x5.a(-2.0f, 0.0f, 0.0f, 10.0f, 0.0f, -2, 53));
            this.m0.setOnClickListener(new uv(this, 8));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.kj0(context2);
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(context2, this.resourceProvider, false, true);
            this.o0 = f1Var;
            f1Var.setItemHeight(56);
            this.o0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.n0);
            this.o0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.v0 a10 = o9.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            org.telegram.ui.ActionBar.v0 d = o9.d(3, new ColorDrawable(0));
            this.g0 = d;
            vy vyVar = new vy(context2, this.currentAccount);
            this.h0 = vyVar;
            d.addView(vyVar);
            this.g0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.g0.setVisibility(8);
            W4(false, false);
        }
        jy jyVar3 = new jy(context2, this.resourceProvider);
        this.X = jyVar3;
        long j10 = 0;
        jyVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.v0 a11 = o9.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.l0.setOnClickListener(new uv(this, 9));
            this.X.a(this.l0);
            this.X.e();
        }
        this.X.setCloseButtonOnClickListener(new hw(this, 0));
        this.X.r.setOnFocusChangeListener(new pd(this, 1));
        ci.g2 g2Var = this.X.r;
        yf.g0 g0Var = new yf.g0(g2Var, new ky(this));
        this.Y = g0Var;
        g2Var.addTextChangedListener(g0Var);
        this.X.setSearchFiltersListener(new yx(this, 5));
        this.Y.a();
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.v0 a12 = o9.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.k0.setOnClickListener(new uv(this, 10));
            this.k0.setOnLongClickListener(new cw(this, 3));
        }
        this.j0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.j0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i15 = this.R0;
            if (i15 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.N0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.O0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i15 == 3 && this.f2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i15 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i15 == 14) {
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
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.g2 g2Var2 = new org.telegram.ui.ActionBar.g2(false);
                this.e1 = g2Var2;
                kVar.setBackButtonDrawable(g2Var2);
            }
            if (this.V2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.X2 != 0) {
                this.actionBar.setTitle(DialogObject.getName(this.Y2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.b3 = new org.telegram.ui.Components.j9(this.Y2);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
                this.a3 = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.a3.e(this.Y2, this.b3);
                this.actionBar.addView(this.a3, w7.x5.a(32.0f, 58.0f, 0.0f, 0.0f, 12.0f, 32, 83));
            } else {
                org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(26.0f), null);
                this.D3 = q5Var;
                q5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.C3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.C3.getIntrinsicWidth(), this.C3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.C3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.gl), PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.C3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.I(spannableStringBuilder, this.D3);
                a5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.V2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new hw(this, 1));
        int i16 = this.R0;
        if (((i16 == 0 && !this.l2) || i16 == 3) && this.V2 == 0 && this.X2 == 0 && TextUtils.isEmpty(this.n2)) {
            qw qwVar2 = new qw(this, context2, this.resourceProvider);
            this.z0 = qwVar2;
            qwVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.z0.setDelegate(new sw(context2, this));
        }
        int i17 = 17;
        if (this.r2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.D1 = o9.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9();
            j9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context2);
            y9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.D1.addView(y9Var2, w7.x5.e(36, 36, 17));
            this.D1.setOnClickListener(new uv(this, 11));
            this.D1.setOnLongClickListener(new cw(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            j9Var.m(this.currentAccount, currentUser);
            y9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            y9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? j9Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new tw(this));
        final my myVar = new my(context2, this);
        this.fragmentView = myVar;
        hh.j jVar = new hh.j(myVar);
        this.j4 = jVar;
        ah.c cVar = this.o4;
        cVar.f(jVar, myVar);
        hh.j jVar2 = this.j4;
        ah.c cVar2 = this.q4;
        cVar2.f(jVar2, myVar);
        hh.j jVar3 = this.j4;
        ah.c cVar3 = this.r4;
        cVar3.f(jVar3, myVar);
        this.p4.f(this.j4, myVar);
        final PointF pointF = new PointF();
        this.s4 = new bh.a() { // from class: org.telegram.ui.iw
            @Override // bh.a
            public final void b(ah.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // bh.a
            public final void f(Canvas canvas, RectF rectF) {
                ty tyVar = ty.this;
                dy dyVar = tyVar.C0;
                int alpha = dyVar != null ? (int) (dyVar.getAlpha() * 255.0f) : 0;
                sy[] syVarArr = tyVar.e0;
                int length = syVarArr.length;
                int i18 = 0;
                while (true) {
                    my myVar2 = myVar;
                    if (i18 >= length) {
                        dy dyVar2 = tyVar.C0;
                        if (dyVar2 == null || dyVar2.getVisibility() != 0 || tyVar.C0.getAlpha() <= 0.0f) {
                            return;
                        }
                        dy dyVar3 = tyVar.C0;
                        gh.d.b(dyVar3, canvas, rectF, dyVar3, myVar2, alpha);
                        return;
                    }
                    sy syVar = syVarArr[i18];
                    if (syVar != null && syVar.getVisibility() == 0 && syVar.getAlpha() > 0.0f) {
                        float S3 = tyVar.S3();
                        if (syVar.F == null || S3 <= 0.0f) {
                            py pyVar = syVar.a;
                            gh.d.b(pyVar, canvas, rectF, pyVar, myVar2, 255 - alpha);
                        } else {
                            py pyVar2 = syVar.a;
                            PointF pointF2 = pointF;
                            if (!hh.j.b(pyVar2, myVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            syVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i18++;
                }
            }
        };
        int i18 = (this.V2 == 0 && this.X2 == 0 && (((i12 = this.R0) == 0 && !this.l2) || i12 == 3)) ? 2 : 1;
        this.e0 = new sy[i18];
        int i19 = 0;
        while (i19 < i18) {
            ah.c cVar4 = cVar3;
            sy syVar = new sy(context2, this);
            myVar.addView(syVar, w7.x5.d(-1.0f, -1));
            syVar.s = this.R0;
            this.e0[i19] = syVar;
            syVar.w = new org.telegram.ui.Components.j10(context2);
            syVar.w.setViewType(7);
            syVar.w.setVisibility(i13);
            syVar.addView(syVar.w, w7.x5.e(-2, -2, i17));
            py pyVar = new py(this, context2, syVar);
            syVar.a = pyVar;
            pyVar.C0(new org.telegram.ui.Components.ea1(11, this, syVar));
            ?? r42 = syVar.a;
            syVar.b = new a5.a((org.telegram.ui.Components.qm0) r42);
            r42.setAllowStopHeaveOperations(r82);
            syVar.a.setAccessibilityEnabled(r11);
            syVar.a.m1(r11, r82);
            syVar.a.setClipToPadding(r11);
            syVar.a.setPivotY(0.0f);
            if (this.R0 == 15) {
                syVar.a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.a7));
            }
            syVar.x = new uw(syVar.a, syVar);
            syVar.a.setVerticalScrollBarEnabled(r82);
            syVar.a.setInstantClick(r82);
            syVar.c = new ww(this, syVar);
            syVar.c.j1(r82);
            syVar.a.setLayoutManager(syVar.c);
            syVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? r82 : 2);
            syVar.addView(syVar.a, w7.x5.d(-1.0f, -1));
            syVar.a.setOnItemClickListener(new org.telegram.ui.Components.y2(28, this, syVar));
            syVar.a.setOnItemLongClickListener(new n6.t(this, syVar, false, 6));
            syVar.f = new ry(this, syVar);
            syVar.y = new org.telegram.ui.Components.vl0(syVar.a, r11);
            ryVar = syVar.f;
            syVar.e = new s4.z(ryVar);
            zVar = syVar.e;
            zVar.e(syVar.a);
            syVar.a.setOnScrollListener(new yw(this, syVar, myVar));
            syVar.v = SharedConfig.archiveHidden ? 2 : r11;
            if (syVar.n == null && this.V2 == 0 && this.X2 == j10) {
                syVar.n = new zw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), syVar);
                if (W3()) {
                    syVar.n.h();
                } else {
                    syVar.n.b();
                }
                zw zwVar = syVar.n;
                i11 = syVar.v;
                zwVar.g(i11 != 0 ? r82 : r11);
            }
            my myVar2 = myVar;
            ah.c cVar5 = cVar;
            boolean z13 = r82;
            ah.c cVar6 = cVar2;
            context2 = context;
            syVar.d = new ax(this, this, context, syVar.s, this.V2, this.l2, arrayList, this.currentAccount, this.G, syVar);
            mVar = syVar.d;
            mVar.R(syVar.a);
            mVar2 = syVar.d;
            mVar2.P(this.t2);
            if (syVar.s == 3) {
                mVar6 = syVar.d;
                mVar6.M((getMessagesController().storiesEnabled() && (nyVar = this.C2) != null && nyVar.C()) ? z13 : false);
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.p2;
                j3 = 0;
                if (topicKey.dialogId != 0) {
                    mVar5 = syVar.d;
                    mVar5.Q(topicKey.dialogId);
                }
            } else {
                j3 = 0;
            }
            mVar3 = syVar.d;
            mVar3.N(syVar.n);
            py pyVar2 = syVar.a;
            mVar4 = syVar.d;
            pyVar2.setAdapter(mVar4);
            syVar.a.setEmptyView((this.V2 == 0 && this.X2 == j3) ? syVar.w : null);
            syVar.r = new org.telegram.ui.Components.tl0(syVar.a, syVar.c);
            org.telegram.ui.Components.tl0 tl0Var = syVar.r;
            tl0Var.c = z13;
            tl0Var.d = z13;
            tl0Var.h = new vv(this, 10);
            if (i19 != 0) {
                this.e0[i19].setVisibility(8);
            }
            i19++;
            j10 = j3;
            myVar = myVar2;
            r82 = z13;
            i14 = 3;
            cVar3 = cVar4;
            cVar = cVar5;
            cVar2 = cVar6;
            r11 = 0;
            i17 = 17;
            i13 = 8;
        }
        my myVar3 = myVar;
        int i20 = i14;
        ah.c cVar7 = cVar;
        int i21 = r82;
        ah.c cVar8 = cVar2;
        ah.c cVar9 = cVar3;
        long j11 = j10;
        org.telegram.ui.Components.zs zsVar = new org.telegram.ui.Components.zs(context2);
        this.K1 = zsVar;
        int i22 = org.telegram.ui.ActionBar.i6.d6;
        zsVar.setColor(org.telegram.ui.ActionBar.i6.v0(i22));
        myVar3.addView(this.K1, w7.x5.e(-1, 100, 48));
        this.B0 = myVar3.getChildCount();
        v41 v41Var = new v41((Activity) getContext());
        this.Z = v41Var;
        v41Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        myVar3.addView(this.Z, w7.x5.a(50.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 48));
        ch.d b10 = cVar8.b(this.Z, eh.b.n(this.resourceProvider));
        b10.q(AndroidUtilities.dp(18.0f));
        b10.p(AndroidUtilities.dp(6.666f));
        this.Z.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.Z.setBlurredBackground(b10);
        gg.r0 r0Var = new gg.r0(getParentActivity(), null);
        this.b0 = r0Var;
        r0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        gg.r0 r0Var2 = this.b0;
        r0Var2.Y2 = false;
        r0Var2.setOnItemClickListener(new zv(this, 1));
        this.Z.addView(this.b0, w7.x5.e(-1, -1, 48));
        org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(context2, this.resourceProvider, i21);
        this.u0 = p20Var;
        p20Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new uv(this, 27));
        myVar3.addView(this.u0, org.telegram.ui.Components.p20.c());
        org.telegram.ui.Components.p20 p20Var2 = new org.telegram.ui.Components.p20(context2, this.resourceProvider);
        this.t0 = p20Var2;
        myVar3.addView(p20Var2, org.telegram.ui.Components.p20.b());
        this.t0.setOnClickListener(new uv(this, 28));
        if (!b4() && this.R0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", i21)) {
            ci.d4 d4Var = new ci.d4(context2, 2);
            d4Var.q(8.0f);
            d4Var.d = 8000L;
            d4Var.i();
            d4Var.n();
            d4Var.p(i21);
            d4Var.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), ci.lc.m(context2)));
            d4Var.l(1.0f, -40.0f);
            d4Var.h(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
            d4Var.l0 = new hw(this, 12);
            this.p0 = d4Var;
            myVar3.addView(d4Var, w7.x5.a(160.0f, 0.0f, 0.0f, 80.0f, 0.0f, -1, 87));
        }
        b5();
        this.a0 = null;
        if (this.l2 || this.R0 != 0) {
            f7 = 72.0f;
            if (this.R0 == i20 || F3()) {
                hh.f fVar = new hh.f(context2);
                this.y1 = fVar;
                fVar.setClipChildren(false);
                hh.f fVar2 = this.y1;
                ph.i iVar = this.v;
                fVar2.setWindowInsetsProvider(iVar);
                hh.f fVar3 = this.y1;
                fVar3.setInputIslandBubbleDrawable(cVar8.b(fVar3, eh.b.n(this.resourceProvider)));
                hh.f fVar4 = this.y1;
                fVar4.setUnderKeyboardBackgroundDrawable(cVar7.b(fVar4, eh.b.n(this.resourceProvider)));
                ah.d dVar = new ah.d(cVar9.b(this.y1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    dVar.b(AndroidUtilities.dp(72.0f), i21);
                }
                this.y1.setBackgroundWithFadeDrawable(dVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                dx dxVar = this.B1;
                if (dxVar != null) {
                    dxVar.z0();
                }
                dx dxVar2 = new dx(this, getParentActivity(), myVar3);
                this.B1 = dxVar2;
                dxVar2.setInAppInsetsController(iVar);
                this.B1.y4 = false;
                myVar3.setClipChildren(false);
                myVar3.setClipToPadding(false);
                dx dxVar3 = this.B1;
                dxVar3.x4 = false;
                dxVar3.i2 = (AndroidUtilities.isInMultiwindow || ((znVar = dxVar3.P2) != null && znVar.isInBubbleMode())) ? false : i21;
                this.B1.S0(false, false);
                this.B1.e1(i21, false);
                this.B1.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, w7.x5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
                myVar3.addView(this.y1.getFadeView(), w7.x5.d(-1.0f, -1));
                myVar3.addView(this.y1, w7.x5.d(-1.0f, -1));
                if (X3() || this.E2 != null || this.F2 != null) {
                    i3(this.U3);
                    this.U3 = null;
                }
                this.B1.setDelegate(new ex(this));
                i10 = -1;
                ii.z1 z1Var = new ii.z1(this, context2, R.drawable.send_plane_24, this.resourceProvider, 3);
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
                z1Var3.h0 = i21;
                myVar3.addView(z1Var3, w7.x5.e(110, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i22));
                this.C1.setOnClickListener(new uv(this, 5));
                this.C1.setOnLongClickListener(new cw(this, 0));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                qwVar = this.z0;
                if (qwVar != null) {
                    ch.d b11 = cVar8.b(qwVar, eh.b.n(this.resourceProvider));
                    b11.q(AndroidUtilities.dp(18.0f));
                    b11.p(AndroidUtilities.dp(6.666f));
                    this.z0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.z0.setBlurredBackground(b11);
                    myVar3.addView(this.z0, w7.x5.a(50.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 48));
                }
                jyVar = this.X;
                if (jyVar != null) {
                    jyVar.setupBlurredBackground(cVar8.b(jyVar, eh.b.n(this.resourceProvider)));
                }
                kx kxVar = new kx(this, context, this, this.currentAccount, b4() ? 1 : 0);
                this.E0 = kxVar;
                kxVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!b4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                kx kxVar2 = this.E0;
                kxVar2.l0 = false;
                kxVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == i20) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j11);
                }
                myVar3.addView(this.actionBar, w7.x5.d(-2.0f, i10));
                if (!this.l2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.E3 = oVar;
                    myVar3.addView(oVar, w7.x5.e(20, 20, 51));
                }
                jyVar2 = this.X;
                if (jyVar2 != null) {
                    myVar3.addView(jyVar2, w7.x5.a(48.0f, 7.0f, -2.0f, 7.0f, 0.0f, -1, 48));
                }
                this.x0 = myVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i21] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.gl));
                }
                if (this.V2 == 0 || this.X2 != j11) {
                    this.e0[0].a.setGlowColor(getThemedColor(i22));
                    this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.i6.O8), false);
                    this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.i6.N8), false);
                    this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.i6.Q8), false);
                    this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.i6.R8), i21);
                }
                if (!this.l2 && this.R0 == 0) {
                    ci.bb bbVar = new ci.bb(this, context, 28);
                    this.K0 = bbVar;
                    bbVar.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i22), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new uv(this, 7));
                    this.K0.setVisibility(8);
                    myVar3.addView(this.K0, w7.x5.d(-1.0f, i10));
                }
                this.f1.setColor(getThemedColor(i22));
                this.p3 = false;
                if (this.n2 == null) {
                    L4(i21, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    L4(i21, false, false, i21);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    jy jyVar4 = this.X;
                    if (jyVar4 != null) {
                        jyVar4.setTranslationY(T3() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    L4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(myVar3);
                this.F3 = new nx(this, context, myVar3, context);
                S4(i21, false);
                this.F3.setOpenProgress(0.0f);
                myVar3.addView(this.E0, w7.x5.d(81.0f, i10));
                myVar3.addView(this.F3, w7.x5.d(-1.0f, i10));
                this.F0 = new org.telegram.ui.Components.ys(context);
                atVar = this.J1;
                if (atVar != null) {
                    myVar3.addView(atVar, w7.x5.a(-2.0f, 0.0f, -14.0f, 0.0f, 0.0f, -1, 48));
                }
                if (this.X2 != j11 && this.R0 != i20 && ChatObject.canAddChatToCommunity(this.Y2)) {
                    org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(erVar, 0, i21, 33);
                    ci.d dVar2 = new ci.d(context, this.resourceProvider);
                    this.v0 = dVar2;
                    dVar2.e();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new rv(1, this, new org.telegram.ui.ActionBar.b2[i21]));
                    jh.f fVar5 = new jh.f(getContext());
                    this.w0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.i6.a7);
                    this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
                    this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    myVar3.addView(this.w0, w7.x5.g());
                    myVar3.addView(this.v0, w7.x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
                }
                c5(false);
                V4(false);
                C3();
                z3();
                B3();
                A3();
                y3();
                s3();
                this.X.setBlurredBackgroundVisibility(this.b.e);
                r0.i0.l(this.fragmentView, new vv(this, 7));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.at atVar2 = new org.telegram.ui.Components.at(context2);
            this.J1 = atVar2;
            atVar2.setOnAnimatedHeightChangedListener(new ov(this, 5));
            ch.d a13 = cVar8.a(this.J1);
            a13.o(eh.b.n(this.resourceProvider));
            a13.p(AndroidUtilities.dp(7.0f));
            f7 = 72.0f;
            this.J1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            this.J1.setBlurredBackground(a13);
            this.J1.setDefaultRadiusDp(this.X2 != j11 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.G1 = frameLayout;
            this.J1.addView(frameLayout);
            this.J1.h(5, this.G1);
            this.J1.g(this.G1);
            this.J1.i(this.G1, i21, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.I1 = frameLayout2;
            this.J1.addView(frameLayout2);
            this.J1.h(4, this.I1);
            this.J1.g(this.I1);
            this.J1.i(this.I1, i21, false);
            cx cxVar = new cx(this, context2, this, 0);
            this.F1 = cxVar;
            this.G1.addView(cxVar);
            cx cxVar2 = new cx(this, context2, this, 1);
            this.H1 = cxVar2;
            this.I1.addView(cxVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context2);
            this.M1 = a3Var;
            a3Var.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
            R4();
            y6.j0(new wv(this, 0));
            y6.p0(new b5(this, 11));
            this.J1.addView(this.M1);
            if (this.X2 != j11) {
                gi.j jVar4 = new gi.j(context2, this.resourceProvider, i21);
                this.Q1 = jVar4;
                jVar4.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.Q1.setUnreadMode(i21);
                this.Q1.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
                this.Q1.setOnClickListener(new uv(this, 4));
                this.J1.addView(this.Q1);
                n3(false);
            }
        }
        i10 = -1;
        qwVar = this.z0;
        if (qwVar != null) {
        }
        jyVar = this.X;
        if (jyVar != null) {
        }
        kx kxVar3 = new kx(this, context, this, this.currentAccount, b4() ? 1 : 0);
        this.E0 = kxVar3;
        kxVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!b4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        kx kxVar22 = this.E0;
        kxVar22.l0 = false;
        kxVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j11);
        }
        myVar3.addView(this.actionBar, w7.x5.d(-2.0f, i10));
        if (!this.l2) {
        }
        jyVar2 = this.X;
        if (jyVar2 != null) {
        }
        this.x0 = myVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i21] = null;
        if (this.W) {
        }
        if (this.V2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i22));
        this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.i6.O8), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.i6.N8), false);
        this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.i6.Q8), false);
        this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.i6.R8), i21);
        if (!this.l2) {
            ci.bb bbVar2 = new ci.bb(this, context, 28);
            this.K0 = bbVar2;
            bbVar2.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i22), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new uv(this, 7));
            this.K0.setVisibility(8);
            myVar3.addView(this.K0, w7.x5.d(-1.0f, i10));
        }
        this.f1.setColor(getThemedColor(i22));
        this.p3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(myVar3);
        this.F3 = new nx(this, context, myVar3, context);
        S4(i21, false);
        this.F3.setOpenProgress(0.0f);
        myVar3.addView(this.E0, w7.x5.d(81.0f, i10));
        myVar3.addView(this.F3, w7.x5.d(-1.0f, i10));
        this.F0 = new org.telegram.ui.Components.ys(context);
        atVar = this.J1;
        if (atVar != null) {
        }
        if (this.X2 != j11) {
            org.telegram.ui.Components.er erVar2 = new org.telegram.ui.Components.er(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(erVar2, 0, i21, 33);
            ci.d dVar22 = new ci.d(context, this.resourceProvider);
            this.v0 = dVar22;
            dVar22.e();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new rv(1, this, new org.telegram.ui.ActionBar.b2[i21]));
            jh.f fVar52 = new jh.f(getContext());
            this.w0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.i6.a7);
            this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
            this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            myVar3.addView(this.w0, w7.x5.g());
            myVar3.addView(this.v0, w7.x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        c5(false);
        V4(false);
        C3();
        z3();
        B3();
        A3();
        y3();
        s3();
        this.X.setBlurredBackgroundVisibility(this.b.e);
        r0.i0.l(this.fragmentView, new vv(this, 7));
        return this.fragmentView;
    }

    public final boolean d4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
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
    public final void d5(int i10, boolean z10) {
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
                recyclerView = dyVar != null ? dyVar.V : null;
            } else {
                sy[] syVarArr = this.e0;
                if (syVarArr != null) {
                    py pyVar = i13 < syVarArr.length ? syVarArr[i13].a : null;
                    if (pyVar == null || syVarArr[i13].getVisibility() == 0) {
                        r5 = pyVar != null ? this.e0[i13] : null;
                        recyclerView = pyVar;
                    }
                }
                i13++;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                if (((MessagesController.UPDATE_MASK_NEW_MESSAGE & i10) != 0 || i10 == 0) && r5 != null) {
                    r5.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    for (0; i11 < childCount2; i11 + 1) {
                        View childAt = recyclerView.getChildAt(i11);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.s2;
                        ArrayList arrayList = this.I2;
                        if (z11 && (this.C0 == null || recyclerView.getAdapter() != this.C0.b0)) {
                            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                s2Var.T(this.actionBar.t(), true);
                                i11 = this.S1 ? i11 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                s2Var.V(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
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
                                    s2Var.V(arrayList.contains(Long.valueOf(s2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.xa)) {
                                    ((org.telegram.ui.Cells.xa) childAt).j(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                                    i6Var.v(i10);
                                    if (arrayList != null) {
                                        i6Var.t(arrayList.contains(Long.valueOf(i6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.qm0)) {
                                    org.telegram.ui.Components.qm0 qm0Var = (org.telegram.ui.Components.qm0) childAt;
                                    childCount = qm0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = qm0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                                            ((org.telegram.ui.Cells.n4) childAt2).b(i10);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.xa)) {
                        }
                        if (!this.S1) {
                            org.telegram.ui.Components.qm0 qm0Var2 = (org.telegram.ui.Components.qm0) childAt;
                            childCount = qm0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                    }
                }
            }
            i13++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x0566, code lost:
    
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
        int i14;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        int i15;
        boolean z11;
        int i16 = 2;
        int i17 = 7;
        ArrayList arrayList = null;
        int i18 = 0;
        int i19 = 0;
        if (i10 == NotificationCenter.dialogsNeedReload) {
            if (this.e0 == null || this.S1) {
                return;
            }
            int i20 = 0;
            while (true) {
                sy[] syVarArr = this.e0;
                if (i20 >= syVarArr.length) {
                    break;
                }
                sy syVar = syVarArr[i20];
                int i21 = syVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i21 == 7 || i21 == 8) ? getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.z3 && z12) {
                    AndroidUtilities.runOnUIThread(new vq(this, syVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    r4(syVar);
                }
                i20++;
            }
            qw qwVar = this.z0;
            if (qwVar != null && qwVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.z3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            d5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.X2 != chatFull.id) {
                return;
            }
            this.Z2 = chatFull;
            n3(false);
            if (this.e0 == null || this.S1) {
                return;
            }
            while (true) {
                sy[] syVarArr2 = this.e0;
                if (i19 >= syVarArr2.length) {
                    return;
                }
                r4(syVarArr2[i19]);
                i19++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                qw qwVar2 = this.z0;
                if (qwVar2 == null || qwVar2.getVisibility() != 0) {
                    return;
                }
                qw qwVar3 = this.z0;
                int defaultTabId = qwVar3.getDefaultTabId();
                ai.w0 w0Var = qwVar3.F;
                ArrayList arrayList2 = qwVar3.h;
                int i22 = qwVar3.l0.get(defaultTabId, -1);
                if (i22 < 0 || i22 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.w00 w00Var = (org.telegram.ui.Components.w00) arrayList2.get(i22);
                if (w00Var.d == ((sw) qwVar3.J).a(w00Var.a) || ((sw) qwVar3.J).a(w00Var.a) < 0) {
                    return;
                }
                w0Var.f1();
                if (qwVar3.m0.get(i22) != w00Var.a(true) || qwVar3.h0) {
                    qwVar3.h0 = true;
                    qwVar3.requestLayout();
                    w0Var.setItemAnimator(qwVar3.s0);
                    org.telegram.ui.Components.v00 v00Var = qwVar3.I;
                    if (v00Var != null) {
                        v00Var.l();
                    }
                    qwVar3.M = 0;
                    org.telegram.ui.Components.w00 d = qwVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        qwVar3.M = org.telegram.messenger.q.C(24.0f, ((org.telegram.ui.Components.w00) arrayList2.get(i23)).a(true), qwVar3.M);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                d5(0, true);
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                d5(0, true);
                return;
            }
            if (i10 == NotificationCenter.emojiLoaded) {
                if (this.e0 != null) {
                    int i24 = 0;
                    while (true) {
                        sy[] syVarArr3 = this.e0;
                        if (i24 >= syVarArr3.length) {
                            break;
                        }
                        py pyVar = syVarArr3[i24].a;
                        if (pyVar != null) {
                            for (int i25 = 0; i25 < pyVar.getChildCount(); i25++) {
                                View childAt = pyVar.getChildAt(i25);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i24++;
                    }
                }
                qw qwVar4 = this.z0;
                if (qwVar4 != null) {
                    qwVar4.getTabsContainer().f1();
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
                W4(false, false);
                return;
            }
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                d5(num.intValue(), true);
                qw qwVar5 = this.z0;
                if (qwVar5 != null && qwVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.z0.c();
                }
                if (this.X2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.X2));
                    this.Y2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.a3.e(this.Y2, this.b3);
                }
                if (this.e0 != null) {
                    for (int i26 = 0; i26 < this.e0.length; i26++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.e0[i26].d.T(true);
                        }
                    }
                }
                a5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i27 = NotificationCenter.appDidLogout;
            boolean[] zArr = x4;
            if (i10 == i27) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                d5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.p20 p20Var = this.t0;
                if (p20Var != null) {
                    z11 = p20Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (sy syVar2 : this.e0) {
                    syVar2.d.e = false;
                }
                if (z11) {
                    w4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.hs.f);
                    this.d0.addUpdateListener(new qv(this, 0));
                    this.d0.start();
                }
                int i28 = 0;
                boolean z13 = false;
                while (true) {
                    sy[] syVarArr4 = this.e0;
                    if (i28 >= syVarArr4.length) {
                        break;
                    }
                    if (!syVarArr4[i28].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z13 = true;
                    } else {
                        this.e0[i28].d.l();
                    }
                    i28++;
                    z13 = z13;
                }
                if (z13) {
                    d5(0, true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.openedChatChanged) {
                if (this.e0 == null) {
                    return;
                }
                int i29 = 0;
                while (true) {
                    sy[] syVarArr5 = this.e0;
                    if (i29 >= syVarArr5.length) {
                        d5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (syVarArr5[i29].p() && AndroidUtilities.isTablet()) {
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
                        this.e0[i29].d.s = topicKey.dialogId;
                    }
                    i29++;
                }
            } else {
                if (i10 == NotificationCenter.notificationsSettingsUpdated) {
                    d5(0, true);
                    return;
                }
                if (i10 == NotificationCenter.messageReceivedByAck || i10 == NotificationCenter.messageReceivedByServer || i10 == NotificationCenter.messageSendError) {
                    d5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i10 == NotificationCenter.didSetPasscode) {
                    v3();
                    return;
                }
                if (i10 == NotificationCenter.needReloadRecentDialogsSearch) {
                    dy dyVar = this.C0;
                    if (dyVar == null || (wo0Var2 = dyVar.b0) == null || (i15 = wo0Var2.h0) == 15) {
                        return;
                    }
                    int i30 = wo0Var2.s0;
                    MessagesStorage.getInstance(i30).getStorageQueue().postRunnable(new gg.n(i30, i15, new gg.w(wo0Var2), i18));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    d5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    dy dyVar2 = this.C0;
                    if (dyVar2 == null || (wo0Var = dyVar2.b0) == null) {
                        return;
                    }
                    wo0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        W4(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    W4(true, false);
                    dy dyVar3 = this.C0;
                    if (dyVar3 != null) {
                        int currentPosition = dyVar3.getCurrentPosition();
                        org.telegram.ui.Components.cp0 cp0Var = dyVar3.T;
                        Z4(cp0Var != null && cp0Var.h(currentPosition) == 2);
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
                    boolean z14 = booleanValue;
                    Runnable vaVar = new ci.va(this, chat2, longValue3, z14, user, z10);
                    K3();
                    if (this.y0[0] == null) {
                        vaVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        vaVar.run();
                        return;
                    }
                    UndoView V3 = V3();
                    if (V3 != null) {
                        V3.j(z14 ? 1 : 95, longValue3, vaVar);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.folderBecomeEmpty) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int i31 = this.V2;
                    if (i31 != intValue || i31 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == NotificationCenter.dialogFiltersUpdated) {
                    S4(true, true);
                    return;
                }
                if (i10 == NotificationCenter.filterSettingsUpdated) {
                    G4();
                    return;
                }
                int i32 = 6;
                if (i10 == NotificationCenter.newSuggestionsAvailable) {
                    I4();
                    R4();
                    int checkEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (checkEmailSuggestion != 0) {
                        wg0 wg0Var = new wg0();
                        hw hwVar = new hw(this, i32);
                        hw hwVar2 = new hw(this, i17);
                        boolean z15 = checkEmailSuggestion == 2;
                        wg0Var.F = 3;
                        wg0Var.a = 12;
                        wg0Var.d0 = hwVar;
                        wg0Var.e0 = hwVar2;
                        wg0Var.g0 = z15;
                        wg0Var.h0 = true;
                        presentFragment(wg0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.p20 p20Var2 = this.t0;
                    if (p20Var2 != null) {
                        p20Var2.f(true, true);
                    }
                    sy[] syVarArr6 = this.e0;
                    if (syVarArr6 != null) {
                        for (sy syVar3 : syVarArr6) {
                            ax axVar = syVar3.d;
                            axVar.Q = false;
                            axVar.e = true;
                            axVar.l();
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
                    HashMap hashMap = dyVar4.z0;
                    SparseArray sparseArray = dyVar4.h;
                    int size2 = sparseArray.size();
                    for (int i33 = 0; i33 < size2; i33++) {
                        View view = (View) sparseArray.valueAt(i33);
                        if (view instanceof w10) {
                            ((w10) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i34 = 0; i34 < dyVar4.getChildCount(); i34++) {
                        if (dyVar4.getChildAt(i34) instanceof w10) {
                            ((w10) dyVar4.getChildAt(i34)).e(longValue4, arrayList3);
                        }
                    }
                    dyVar4.M0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    int i35 = 0;
                    while (i35 < arrayList4.size()) {
                        o10 o10Var = (o10) arrayList4.get(i35);
                        MessageObject messageObject = (MessageObject) hashMap.get(o10Var);
                        if (messageObject != null) {
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < 0) {
                                i14 = (int) (-dialogId);
                                i13 = i18;
                            } else {
                                i13 = i18;
                            }
                            i14 = i13;
                            if (i14 == longValue4) {
                                for (int i36 = i13; i36 < arrayList3.size(); i36++) {
                                    if (messageObject.getId() == ((Integer) arrayList3.get(i36)).intValue()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(o10Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i18;
                        }
                        i35++;
                        i18 = i13;
                    }
                    int i37 = i18;
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i38 = i37; i38 < size3; i38++) {
                            hashMap.remove(arrayList.get(i38));
                        }
                        dyVar4.x0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.v0 v0Var = dyVar4.C0;
                        if (v0Var != null) {
                            v0Var.setVisibility(hashMap.size() == 1 ? i37 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.e0 != null) {
                        int i39 = 0;
                        while (true) {
                            sy[] syVarArr7 = this.e0;
                            if (i39 >= syVarArr7.length) {
                                break;
                            }
                            gg.j jVar = syVarArr7[i39].d.P;
                            if (jVar != null) {
                                jVar.a.clear();
                                jVar.b.clear();
                                jVar.c.clear();
                                jVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(jVar.e);
                            }
                            i39++;
                        }
                    }
                    jb1 jb1Var = jb1.b;
                    if (jb1Var != null) {
                        jb1Var.dismiss();
                        jb1.b = null;
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
                    org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                    if (d5Var == null || d5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.X2 == ((Long) objArr[0]).longValue()) {
                        n3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            av avVar = this.Q3;
                            if (avVar == null || avVar.getTag() == null) {
                                return;
                            }
                            av avVar2 = this.Q3;
                            avVar2.animate().setListener(null).cancel();
                            avVar2.animate().setListener(new org.telegram.ui.Components.ul0(i32, this, avVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.Q3.setTag(null);
                            return;
                        }
                        if (this.Q3 == null) {
                            Context context = this.fragmentView.getContext();
                            av avVar3 = new av(context);
                            LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
                            org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(context);
                            fk0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            fk0Var.getAnimatedDrawable().K(1);
                            fk0Var.d();
                            e7.addView(fk0Var, w7.x5.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i40 = org.telegram.ui.ActionBar.i6.G6;
                            com.google.android.gms.internal.vision.e2.p(i40, null, false, textView, 1);
                            TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            h.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            h.setTextSize(1, 14.0f);
                            h.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i40, false));
                            h.setGravity(1);
                            TextView h10 = com.google.android.gms.internal.vision.e2.h(e7, h, w7.x5.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            h10.setTextSize(1, 14.0f);
                            h10.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            h10.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i40, false));
                            h10.setGravity(1);
                            e7.addView(h10, w7.x5.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            avVar3.addView(e7, w7.x5.e(-1, -2, 16));
                            avVar3.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                            avVar3.setOnTouchListener(new zu());
                            this.Q3 = avVar3;
                            avVar3.setAlpha(0.0f);
                            ((my) this.fragmentView).addView(this.Q3);
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
                        jb1.p(this);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.userEmojiStatusUpdated) {
                    a5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    a5(UserConfig.getInstance(i11).getCurrentUser(), true);
                    b5();
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    f4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i41 = 0;
                    while (true) {
                        sy[] syVarArr8 = this.e0;
                        if (i41 >= syVarArr8.length) {
                            return;
                        }
                        sy syVar4 = syVarArr8[i41];
                        if (syVar4 != null && (((i12 = syVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[syVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            syVar4.q(true);
                            return;
                        }
                        i41++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            c5(this.V);
                            d5(0, true);
                            return;
                        }
                        if (i10 == NotificationCenter.storiesEnabledUpdate) {
                            b5();
                            return;
                        }
                        if (i10 == NotificationCenter.unconfirmedAuthUpdate) {
                            R4();
                            return;
                        }
                        if (i10 == NotificationCenter.premiumPromoUpdated) {
                            R4();
                            return;
                        }
                        if (i10 == NotificationCenter.starBalanceUpdated || i10 == NotificationCenter.starSubscriptionsLoaded) {
                            R4();
                            return;
                        } else if (i10 == NotificationCenter.appConfigUpdated) {
                            R4();
                            return;
                        } else {
                            if (i10 == NotificationCenter.activeAuctionsUpdated) {
                                R4();
                                return;
                            }
                            return;
                        }
                    }
                    long longValue6 = ((Long) objArr[0]).longValue();
                    int i42 = 0;
                    while (true) {
                        sy[] syVarArr9 = this.e0;
                        if (i42 >= syVarArr9.length) {
                            return;
                        }
                        sy syVar5 = syVarArr9[i42];
                        if (syVar5.a != null) {
                            int i43 = 0;
                            while (true) {
                                if (i43 < syVar5.a.getChildCount()) {
                                    View childAt2 = syVar5.a.getChildAt(i43);
                                    if (childAt2 instanceof org.telegram.ui.Cells.s2) {
                                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt2;
                                        if (longValue6 == s2Var.getDialogId()) {
                                            s2Var.u();
                                            break;
                                        }
                                    }
                                    i43++;
                                }
                            }
                        }
                        i42++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof ei.k3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        return this.C2 == null && this.n2 == null;
    }

    public final boolean e5(long j3) {
        TLRPC.Chat chat;
        dx dxVar;
        if ((this.S0 <= 1 && ((dxVar = this.B1) == null || dxVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean f3(long j3, View view) {
        if (this.l2 && getMessagesController().isForum(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) view).t(true, true);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.p80 p80Var = this.L0;
        if (p80Var != null) {
            p80Var.u();
        }
    }

    public final void g3(gg.p0 p0Var) {
        dy dyVar;
        if (!this.p3 || (dyVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = dyVar.A0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (p0Var.b((gg.p0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(p0Var);
        jy jyVar = this.X;
        jyVar.F.add(p0Var);
        jyVar.I = r1.size() - 1;
        jyVar.f();
        this.X.r.getText().clear();
        T4(true, null, null, false, true);
    }

    public final void g4(long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j3);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    g4(dialog2.id);
                }
                return;
            }
            return;
        }
        int i11 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        this.y3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            x4(true, true);
            l3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.R1.get(i13)).id == j3) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
                if (i12 < 0) {
                    x4(false, false);
                }
            }
        }
        int i14 = i12;
        if (getMessagesController().isForum(j3) || getMessagesController().isMonoForumWithManageRights(j3)) {
            getMessagesController().markAllTopicsAsRead(j3);
        }
        getMessagesController().markMentionsAsRead(j3, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i14 >= 0) {
            this.R1.remove(i14);
            this.e0[0].x.D();
            this.e0[0].q(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.y4 getBackButtonState() {
        return (b4() || this.F3.f) ? org.telegram.ui.ActionBar.y4.a : org.telegram.ui.ActionBar.y4.b;
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
        ofFloat2.addUpdateListener(new qv(this, 2));
        this.Z3.setInterpolator(org.telegram.ui.Components.hs.g);
        this.Z3.setDuration(clamp);
        this.Z3.start();
        return this.Z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x03a4  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        gg.m mVar;
        org.telegram.ui.Components.qm0 qm0Var;
        int i10;
        final int i11 = 0;
        org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6(this) { // from class: org.telegram.ui.nw
            public final /* synthetic */ ty b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final /* synthetic */ void a(float f7) {
                int i12 = i11;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final void b() {
                switch (i11) {
                    case 0:
                        ty.D0(this.b);
                        break;
                    default:
                        ty tyVar = this.b;
                        dy dyVar = tyVar.C0;
                        if (dyVar != null) {
                            org.telegram.ui.ActionBar.z actionMode = dyVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.w8));
                            }
                            org.telegram.ui.ActionBar.v0 speedItem = tyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.SRC_IN));
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
        int i12 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i12));
        org.telegram.ui.Cells.s2 s2Var = this.X0;
        if (s2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(s2Var, 1, null, null, null, null, i12));
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        }
        int i13 = this.V2;
        Paint paint = this.f1;
        final int i14 = 1;
        if (i13 == 0) {
            if (this.l2) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i12));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, paint, null, null, i12));
            dy dyVar = this.C0;
            if (dyVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(dyVar.V, 32768, null, null, null, null, i12));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.s1}, null, !this.W ? org.telegram.ui.ActionBar.i6.A8 : org.telegram.ui.ActionBar.i6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, paint, null, null, i12));
            dy dyVar2 = this.C0;
            if (dyVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(dyVar2.V, 32768, null, null, null, null, i12));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.s1}, null, !this.W ? org.telegram.ui.ActionBar.i6.P8 : org.telegram.ui.ActionBar.i6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.i6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.R8));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.i6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 512, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.i6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.i6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h1, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.I5));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 == null || !kVar2.t()) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0, 0, new Class[]{org.telegram.ui.Components.a10.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.i6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.y00.class}, null, null, null, org.telegram.ui.ActionBar.i6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.y00.class}, null, null, null, org.telegram.ui.ActionBar.i6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0, 0, new Class[]{org.telegram.ui.Components.a10.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.i6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.y00.class}, null, null, null, org.telegram.ui.ActionBar.i6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.y00.class}, null, null, null, org.telegram.ui.ActionBar.i6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.y00.class}, null, null, null, org.telegram.ui.ActionBar.i6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.y00.class}, null, null, null, org.telegram.ui.ActionBar.i6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.y00.class}, null, null, null, org.telegram.ui.ActionBar.i6.U9));
        }
        arrayList.addAll(w7.a6.a(new org.telegram.ui.ActionBar.j6(this) { // from class: org.telegram.ui.nw
            public final /* synthetic */ ty b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final /* synthetic */ void a(float f7) {
                int i122 = i14;
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final void b() {
                switch (i14) {
                    case 0:
                        ty.D0(this.b);
                        break;
                    default:
                        ty tyVar = this.b;
                        dy dyVar3 = tyVar.C0;
                        if (dyVar3 != null) {
                            org.telegram.ui.ActionBar.z actionMode = dyVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.w8));
                            }
                            org.telegram.ui.ActionBar.v0 speedItem = tyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.SRC_IN));
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
        }, org.telegram.ui.ActionBar.i6.w8, i15));
        int i16 = 0;
        while (true) {
            if (i16 >= 3) {
                break;
            }
            if (i16 == 2) {
                dy dyVar3 = this.C0;
                if (dyVar3 != null) {
                    qm0Var = dyVar3.V;
                    if (qm0Var != null) {
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i11] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr2[1] = org.telegram.ui.Cells.i6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.i6.r0, null, org.telegram.ui.ActionBar.i6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i11] = org.telegram.ui.Cells.s2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.i6.w0;
                        int i17 = org.telegram.ui.ActionBar.i6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr3, paint2, null, null, i17));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i11] = org.telegram.ui.Cells.s2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.i6.y0;
                        int i18 = org.telegram.ui.ActionBar.i6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr4, paint3, null, null, i18));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i11] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr5, org.telegram.ui.ActionBar.i6.L0, null, null, org.telegram.ui.ActionBar.i6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr6[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i11] = org.telegram.ui.ActionBar.i6.a1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.i6.a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr7[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i11] = org.telegram.ui.ActionBar.i6.g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.i6.h1;
                        int i19 = org.telegram.ui.ActionBar.i6.j9;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr7, null, drawableArr2, null, i19));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i11] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i11] = org.telegram.ui.ActionBar.i6.j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.i6.k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.i6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.i6.b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i11] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i11] = org.telegram.ui.ActionBar.i6.l1;
                        int i20 = org.telegram.ui.ActionBar.i6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr9, null, drawableArr4, null, i20));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr10[1] = org.telegram.ui.Cells.i6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
                        TextPaint textPaint = textPaintArr[i11];
                        TextPaint textPaint2 = textPaintArr[1];
                        i10 = i11;
                        Paint[] paintArr = new Paint[3];
                        paintArr[i10] = textPaint;
                        paintArr[1] = textPaint2;
                        paintArr[2] = org.telegram.ui.ActionBar.i6.D0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr10, null, paintArr, null, null, org.telegram.ui.ActionBar.i6.X8));
                        Class[] clsArr11 = new Class[2];
                        clsArr11[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr11[1] = org.telegram.ui.Cells.i6.class;
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
                        TextPaint textPaint3 = textPaintArr2[i10];
                        TextPaint textPaint4 = textPaintArr2[1];
                        Paint[] paintArr2 = new Paint[3];
                        paintArr2[i10] = textPaint3;
                        paintArr2[1] = textPaint4;
                        paintArr2[2] = org.telegram.ui.ActionBar.i6.E0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr11, null, paintArr2, null, null, org.telegram.ui.ActionBar.i6.Z8));
                        Class[] clsArr12 = new Class[1];
                        clsArr12[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr12, org.telegram.ui.ActionBar.i6.F0[1], null, null, org.telegram.ui.ActionBar.i6.i9));
                        Class[] clsArr13 = new Class[1];
                        clsArr13[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr13, org.telegram.ui.ActionBar.i6.F0[i10], null, null, org.telegram.ui.ActionBar.i6.g9));
                        Class[] clsArr14 = new Class[1];
                        clsArr14[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr14, org.telegram.ui.ActionBar.i6.G0, null, null, org.telegram.ui.ActionBar.i6.m9));
                        Class[] clsArr15 = new Class[1];
                        clsArr15[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr15, null, null, null, i19));
                        Class[] clsArr16 = new Class[1];
                        clsArr16[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr16, null, org.telegram.ui.ActionBar.i6.H0, null, null, org.telegram.ui.ActionBar.i6.p9));
                        Class[] clsArr17 = new Class[1];
                        clsArr17[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr17, org.telegram.ui.ActionBar.i6.I0, null, null, org.telegram.ui.ActionBar.i6.q9));
                        Class[] clsArr18 = new Class[1];
                        clsArr18[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr18, org.telegram.ui.ActionBar.i6.J0, null, null, org.telegram.ui.ActionBar.i6.r9));
                        Class[] clsArr19 = new Class[1];
                        clsArr19[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr19, org.telegram.ui.ActionBar.i6.K0, null, null, i20));
                        Class[] clsArr20 = new Class[1];
                        clsArr20[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr20, org.telegram.ui.ActionBar.i6.v0, null, null, org.telegram.ui.ActionBar.i6.s9));
                        Class[] clsArr21 = new Class[1];
                        clsArr21[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr21, org.telegram.ui.ActionBar.i6.u0, null, null, org.telegram.ui.ActionBar.i6.t9));
                        Class[] clsArr22 = new Class[1];
                        clsArr22[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr5 = new Drawable[1];
                        drawableArr5[i10] = org.telegram.ui.ActionBar.i6.T0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr22, null, drawableArr5, null, org.telegram.ui.ActionBar.i6.u9));
                        Class[] clsArr23 = new Class[1];
                        clsArr23[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr6 = new Drawable[2];
                        drawableArr6[i10] = org.telegram.ui.ActionBar.i6.V0;
                        drawableArr6[1] = org.telegram.ui.ActionBar.i6.W0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr23, null, drawableArr6, null, org.telegram.ui.ActionBar.i6.v9));
                        Class[] clsArr24 = new Class[1];
                        clsArr24[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr7 = new Drawable[1];
                        drawableArr7[i10] = org.telegram.ui.ActionBar.i6.X0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr24, null, drawableArr7, null, org.telegram.ui.ActionBar.i6.w9));
                        Class[] clsArr25 = new Class[1];
                        clsArr25[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr25, org.telegram.ui.ActionBar.i6.x0, null, null, org.telegram.ui.ActionBar.i6.x9));
                        Class[] clsArr26 = new Class[1];
                        clsArr26[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr8 = new Drawable[1];
                        drawableArr8[i10] = org.telegram.ui.ActionBar.i6.Y0;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr26, null, drawableArr8, null, org.telegram.ui.ActionBar.i6.y9));
                        Class[] clsArr27 = new Class[2];
                        clsArr27[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr27[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr9 = new Drawable[1];
                        drawableArr9[i10] = org.telegram.ui.ActionBar.i6.i1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr27, null, drawableArr9, null, org.telegram.ui.ActionBar.i6.A9));
                        Class[] clsArr28 = new Class[2];
                        clsArr28[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr28[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr10 = new Drawable[1];
                        drawableArr10[i10] = org.telegram.ui.ActionBar.i6.f1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr28, null, drawableArr10, null, org.telegram.ui.ActionBar.i6.z9));
                        Class[] clsArr29 = new Class[1];
                        clsArr29[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr11 = new Drawable[1];
                        drawableArr11[i10] = org.telegram.ui.ActionBar.i6.c1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr29, null, drawableArr11, null, org.telegram.ui.ActionBar.i6.B9));
                        Class[] clsArr30 = new Class[1];
                        clsArr30[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr12 = new Drawable[1];
                        drawableArr12[i10] = org.telegram.ui.ActionBar.i6.m1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr30, null, drawableArr12, null, i17));
                        Class[] clsArr31 = new Class[1];
                        clsArr31[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr13 = new Drawable[1];
                        drawableArr13[i10] = org.telegram.ui.ActionBar.i6.n1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr31, null, drawableArr13, null, org.telegram.ui.ActionBar.i6.Z5));
                        Class[] clsArr32 = new Class[1];
                        clsArr32[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr14 = new Drawable[1];
                        drawableArr14[i10] = org.telegram.ui.ActionBar.i6.o1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr32, null, drawableArr14, null, org.telegram.ui.ActionBar.i6.zj));
                        Class[] clsArr33 = new Class[1];
                        clsArr33[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr15 = new Drawable[3];
                        drawableArr15[i10] = org.telegram.ui.ActionBar.i6.p1;
                        drawableArr15[1] = org.telegram.ui.ActionBar.i6.q1;
                        drawableArr15[2] = org.telegram.ui.ActionBar.i6.r1;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr33, null, drawableArr15, null, i18));
                        Class[] clsArr34 = new Class[1];
                        clsArr34[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr34, null, null, null, org.telegram.ui.ActionBar.i6.d9));
                        Class[] clsArr35 = new Class[1];
                        clsArr35[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr35, null, null, null, org.telegram.ui.ActionBar.i6.c9));
                        Class[] clsArr36 = new Class[1];
                        clsArr36[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr36, null, null, null, org.telegram.ui.ActionBar.i6.T8));
                        Class[] clsArr37 = new Class[1];
                        clsArr37[i10] = org.telegram.ui.Cells.s2.class;
                        int i21 = org.telegram.ui.ActionBar.i6.d6;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr37, null, null, null, i21));
                        Class[] clsArr38 = new Class[1];
                        clsArr38[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 8192, clsArr38, new String[]{"checkBox"}, null, null, null, i21));
                        Class[] clsArr39 = new Class[1];
                        clsArr39[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 16384, clsArr39, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.i6.k7));
                        Class[] clsArr40 = new Class[1];
                        clsArr40[i10] = org.telegram.ui.Cells.s4.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr40, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.i6.h6));
                        Class[] clsArr41 = new Class[1];
                        clsArr41[i10] = org.telegram.ui.Cells.i6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr41, org.telegram.ui.ActionBar.i6.Q0, null, null, org.telegram.ui.ActionBar.i6.A6));
                        Class[] clsArr42 = new Class[1];
                        clsArr42[i10] = org.telegram.ui.Cells.i6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr42, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.p6));
                        org.telegram.ui.Cells.v3.a(arrayList, qm0Var);
                        Class[] clsArr43 = new Class[1];
                        clsArr43[i10] = org.telegram.ui.Cells.l4.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 4, clsArr43, null, null, null, org.telegram.ui.ActionBar.i6.G6));
                        Class[] clsArr44 = new Class[1];
                        clsArr44[i10] = org.telegram.ui.Cells.b7.class;
                        int i22 = org.telegram.ui.ActionBar.i6.b7;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 32, clsArr44, null, null, null, i22));
                        Class[] clsArr45 = new Class[1];
                        clsArr45[i10] = org.telegram.ui.Cells.b7.class;
                        int i23 = org.telegram.ui.ActionBar.i6.a7;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 48, clsArr45, null, null, null, i23));
                        Class[] clsArr46 = new Class[1];
                        clsArr46[i10] = org.telegram.ui.Cells.e9.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 32, clsArr46, null, null, null, i22));
                        Class[] clsArr47 = new Class[1];
                        clsArr47[i10] = org.telegram.ui.Cells.e9.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 48, clsArr47, null, null, null, i23));
                        Class[] clsArr48 = new Class[1];
                        clsArr48[i10] = org.telegram.ui.Cells.e9.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, clsArr48, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.i6.B6));
                        Class[] clsArr49 = new Class[1];
                        clsArr49[i10] = org.telegram.ui.Cells.r8.class;
                        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 4, clsArr49, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.i6.o6));
                        i16++;
                        i11 = i10;
                    }
                }
                i10 = i11;
                i16++;
                i11 = i10;
            } else {
                sy[] syVarArr = this.e0;
                if (syVarArr != null) {
                    qm0Var = i16 < syVarArr.length ? syVarArr[i16].a : null;
                    if (qm0Var != null) {
                    }
                }
                i10 = i11;
                i16++;
                i11 = i10;
            }
        }
        int i24 = i11;
        int i25 = org.telegram.ui.ActionBar.i6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i25));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i25));
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
            int i26 = i24;
            while (true) {
                sy[] syVarArr2 = this.e0;
                if (i26 >= syVarArr2.length) {
                    break;
                }
                if (this.V2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.k6(syVarArr2[i26].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.k6(syVarArr2[i26].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
                }
                py pyVar = this.e0[i26].a;
                Class[] clsArr50 = new Class[1];
                clsArr50[i24] = org.telegram.ui.Cells.y2.class;
                int i27 = org.telegram.ui.ActionBar.i6.m9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar, 4, clsArr50, new String[]{"emptyTextView1"}, null, null, null, i27));
                py pyVar2 = this.e0[i26].a;
                Class[] clsArr51 = new Class[1];
                clsArr51[i24] = org.telegram.ui.Cells.y2.class;
                int i28 = org.telegram.ui.ActionBar.i6.g9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar2, 4, clsArr51, new String[]{"emptyTextView2"}, null, null, null, i28));
                if (SharedConfig.archiveHidden) {
                    py pyVar3 = this.e0[i26].a;
                    Class[] clsArr52 = new Class[1];
                    clsArr52[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.ck0[] ck0VarArr = new org.telegram.ui.Components.ck0[1];
                    ck0VarArr[i24] = org.telegram.ui.ActionBar.i6.u1;
                    int i29 = org.telegram.ui.ActionBar.i6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar3, clsArr52, ck0VarArr, "Arrow1", i29));
                    py pyVar4 = this.e0[i26].a;
                    Class[] clsArr53 = new Class[1];
                    clsArr53[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.ck0[] ck0VarArr2 = new org.telegram.ui.Components.ck0[1];
                    ck0VarArr2[i24] = org.telegram.ui.ActionBar.i6.u1;
                    arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar4, clsArr53, ck0VarArr2, "Arrow2", i29));
                } else {
                    py pyVar5 = this.e0[i26].a;
                    Class[] clsArr54 = new Class[1];
                    clsArr54[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.ck0[] ck0VarArr3 = new org.telegram.ui.Components.ck0[1];
                    ck0VarArr3[i24] = org.telegram.ui.ActionBar.i6.u1;
                    int i30 = org.telegram.ui.ActionBar.i6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar5, clsArr54, ck0VarArr3, "Arrow1", i30));
                    py pyVar6 = this.e0[i26].a;
                    Class[] clsArr55 = new Class[1];
                    clsArr55[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.ck0[] ck0VarArr4 = new org.telegram.ui.Components.ck0[1];
                    ck0VarArr4[i24] = org.telegram.ui.ActionBar.i6.u1;
                    arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar6, clsArr55, ck0VarArr4, "Arrow2", i30));
                }
                py pyVar7 = this.e0[i26].a;
                Class[] clsArr56 = new Class[1];
                clsArr56[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr5 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr5[i24] = org.telegram.ui.ActionBar.i6.u1;
                int i31 = org.telegram.ui.ActionBar.i6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar7, clsArr56, ck0VarArr5, "Box2", i31));
                py pyVar8 = this.e0[i26].a;
                Class[] clsArr57 = new Class[1];
                clsArr57[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr6 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr6[i24] = org.telegram.ui.ActionBar.i6.u1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar8, clsArr57, ck0VarArr6, "Box1", i31));
                py pyVar9 = this.e0[i26].a;
                Class[] clsArr58 = new Class[1];
                clsArr58[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr7 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr7[i24] = org.telegram.ui.ActionBar.i6.x1;
                int i32 = org.telegram.ui.ActionBar.i6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar9, clsArr58, ck0VarArr7, "Arrow", i32));
                py pyVar10 = this.e0[i26].a;
                Class[] clsArr59 = new Class[1];
                clsArr59[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr8 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr8[i24] = org.telegram.ui.ActionBar.i6.x1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar10, clsArr59, ck0VarArr8, "Line", i32));
                py pyVar11 = this.e0[i26].a;
                Class[] clsArr60 = new Class[1];
                clsArr60[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr9 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr9[i24] = org.telegram.ui.ActionBar.i6.y1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar11, clsArr60, ck0VarArr9, "Arrow", i32));
                py pyVar12 = this.e0[i26].a;
                Class[] clsArr61 = new Class[1];
                clsArr61[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr10 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr10[i24] = org.telegram.ui.ActionBar.i6.y1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar12, clsArr61, ck0VarArr10, "Line", i32));
                py pyVar13 = this.e0[i26].a;
                Class[] clsArr62 = new Class[1];
                clsArr62[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr11 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr11[i24] = org.telegram.ui.ActionBar.i6.v1;
                int i33 = org.telegram.ui.ActionBar.i6.c9;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar13, clsArr62, ck0VarArr11, "Arrow", i33));
                py pyVar14 = this.e0[i26].a;
                Class[] clsArr63 = new Class[1];
                clsArr63[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr12 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr12[i24] = org.telegram.ui.ActionBar.i6.v1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar14, clsArr63, ck0VarArr12, "Box2", i32));
                py pyVar15 = this.e0[i26].a;
                Class[] clsArr64 = new Class[1];
                clsArr64[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr13 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr13[i24] = org.telegram.ui.ActionBar.i6.v1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar15, clsArr64, ck0VarArr13, "Box1", i32));
                py pyVar16 = this.e0[i26].a;
                Class[] clsArr65 = new Class[1];
                clsArr65[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr14 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr14[i24] = org.telegram.ui.ActionBar.i6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar16, clsArr65, ck0VarArr14, "Line 1", i33));
                py pyVar17 = this.e0[i26].a;
                Class[] clsArr66 = new Class[1];
                clsArr66[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr15 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr15[i24] = org.telegram.ui.ActionBar.i6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar17, clsArr66, ck0VarArr15, "Line 2", i33));
                py pyVar18 = this.e0[i26].a;
                Class[] clsArr67 = new Class[1];
                clsArr67[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr16 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr16[i24] = org.telegram.ui.ActionBar.i6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar18, clsArr67, ck0VarArr16, "Line 3", i33));
                py pyVar19 = this.e0[i26].a;
                Class[] clsArr68 = new Class[1];
                clsArr68[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr17 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr17[i24] = org.telegram.ui.ActionBar.i6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar19, clsArr68, ck0VarArr17, "Cup Red", i32));
                py pyVar20 = this.e0[i26].a;
                Class[] clsArr69 = new Class[1];
                clsArr69[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr18 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr18[i24] = org.telegram.ui.ActionBar.i6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar20, clsArr69, ck0VarArr18, "Box", i32));
                py pyVar21 = this.e0[i26].a;
                Class[] clsArr70 = new Class[1];
                clsArr70[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr19 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr19[i24] = org.telegram.ui.ActionBar.i6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar21, clsArr70, ck0VarArr19, "Arrow1", i32));
                py pyVar22 = this.e0[i26].a;
                Class[] clsArr71 = new Class[1];
                clsArr71[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr20 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr20[i24] = org.telegram.ui.ActionBar.i6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar22, clsArr71, ck0VarArr20, "Arrow2", org.telegram.ui.ActionBar.i6.d9));
                py pyVar23 = this.e0[i26].a;
                Class[] clsArr72 = new Class[1];
                clsArr72[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr21 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr21[i24] = org.telegram.ui.ActionBar.i6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar23, clsArr72, ck0VarArr21, "Box2", i32));
                py pyVar24 = this.e0[i26].a;
                Class[] clsArr73 = new Class[1];
                clsArr73[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.ck0[] ck0VarArr22 = new org.telegram.ui.Components.ck0[1];
                ck0VarArr22[i24] = org.telegram.ui.ActionBar.i6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar24, clsArr73, ck0VarArr22, "Box1", i32));
                py pyVar25 = this.e0[i26].a;
                Class[] clsArr74 = new Class[1];
                clsArr74[i24] = org.telegram.ui.Cells.xa.class;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar25, 0, clsArr74, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.G6));
                int i34 = i26;
                py pyVar26 = this.e0[i34].a;
                Class[] clsArr75 = new Class[1];
                clsArr75[i24] = org.telegram.ui.Cells.xa.class;
                org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar26, 0, clsArr75, new String[]{"statusColor"}, null, null, j6Var2, org.telegram.ui.ActionBar.i6.y6));
                py pyVar27 = this.e0[i34].a;
                Class[] clsArr76 = new Class[1];
                clsArr76[i24] = org.telegram.ui.Cells.xa.class;
                j6Var = j6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar27, 0, clsArr76, new String[]{"statusOnlineColor"}, null, null, j6Var2, org.telegram.ui.ActionBar.i6.il));
                py pyVar28 = this.e0[i34].a;
                Class[] clsArr77 = new Class[1];
                clsArr77[i24] = org.telegram.ui.Cells.r8.class;
                int i35 = org.telegram.ui.ActionBar.i6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar28, 0, clsArr77, new String[]{"textView"}, null, null, null, i35));
                py pyVar29 = this.e0[i34].a;
                Class[] clsArr78 = new Class[1];
                clsArr78[i24] = org.telegram.ui.Cells.r8.class;
                arrayList.add(new org.telegram.ui.ActionBar.k6(pyVar29, 0, clsArr78, new String[]{"imageView"}, null, null, null, i35));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.e0[i34].w, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.h6));
                mVar = this.e0[i34].d;
                mVar.getClass();
                Class[] clsArr79 = new Class[1];
                clsArr79[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, clsArr79, new String[]{"imageView"}, null, null, null, i27));
                Class[] clsArr80 = new Class[1];
                clsArr80[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, clsArr80, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.i6.U8));
                Class[] clsArr81 = new Class[1];
                clsArr81[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, clsArr81, new String[]{"headerTextView"}, null, null, null, i27));
                Class[] clsArr82 = new Class[1];
                clsArr82[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, clsArr82, new String[]{"messageTextView"}, null, null, null, i28));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
                i26 = i34 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.S9));
        dy dyVar4 = this.C0;
        if (dyVar4 != null) {
            org.telegram.ui.Components.wo0 wo0Var = dyVar4.b0;
            fc1 I = wo0Var != null ? wo0Var.I() : null;
            Class[] clsArr83 = new Class[1];
            clsArr83[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(I, 0, clsArr83, org.telegram.ui.ActionBar.i6.w0, null, null, org.telegram.ui.ActionBar.i6.U8));
            org.telegram.ui.Components.wo0 wo0Var2 = this.C0.b0;
            fc1 I2 = wo0Var2 != null ? wo0Var2.I() : null;
            Class[] clsArr84 = new Class[1];
            clsArr84[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(I2, 0, clsArr84, org.telegram.ui.ActionBar.i6.y0, null, null, org.telegram.ui.ActionBar.i6.V8));
            org.telegram.ui.Components.wo0 wo0Var3 = this.C0.b0;
            fc1 I3 = wo0Var3 != null ? wo0Var3.I() : null;
            Class[] clsArr85 = new Class[1];
            clsArr85[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(I3, 0, clsArr85, org.telegram.ui.ActionBar.i6.L0, null, null, org.telegram.ui.ActionBar.i6.W8));
            org.telegram.ui.Components.wo0 wo0Var4 = this.C0.b0;
            fc1 I4 = wo0Var4 != null ? wo0Var4.I() : null;
            Class[] clsArr86 = new Class[1];
            clsArr86[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(I4, 0, clsArr86, org.telegram.ui.ActionBar.i6.N0, null, null, org.telegram.ui.ActionBar.i6.f9));
            org.telegram.ui.Components.wo0 wo0Var5 = this.C0.b0;
            fc1 I5 = wo0Var5 != null ? wo0Var5.I() : null;
            Class[] clsArr87 = new Class[1];
            clsArr87[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(I5, 0, clsArr87, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.G6));
            org.telegram.ui.Components.wo0 wo0Var6 = this.C0.b0;
            org.telegram.ui.Components.qm0 I6 = wo0Var6 != null ? wo0Var6.I() : null;
            Class[] clsArr88 = new Class[1];
            clsArr88[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(I6, 0, clsArr88, null, null, null, org.telegram.ui.ActionBar.i6.T8));
        }
        int i36 = i24;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i36 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i36];
            int i37 = org.telegram.ui.ActionBar.i6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView, 32, null, null, null, null, i37));
            UndoView undoView2 = undoViewArr[i36];
            Class[] clsArr89 = new Class[1];
            clsArr89[i24] = UndoView.class;
            int i38 = org.telegram.ui.ActionBar.i6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView2, 0, clsArr89, new String[]{"undoImageView"}, null, null, null, i38));
            UndoView undoView3 = undoViewArr[i36];
            Class[] clsArr90 = new Class[1];
            clsArr90[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView3, 0, clsArr90, new String[]{"undoTextView"}, null, null, null, i38));
            UndoView undoView4 = undoViewArr[i36];
            Class[] clsArr91 = new Class[1];
            clsArr91[i24] = UndoView.class;
            int i39 = org.telegram.ui.ActionBar.i6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView4, 0, clsArr91, new String[]{"infoTextView"}, null, null, null, i39));
            UndoView undoView5 = undoViewArr[i36];
            Class[] clsArr92 = new Class[1];
            clsArr92[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView5, 0, clsArr92, new String[]{"subinfoTextView"}, null, null, null, i39));
            UndoView undoView6 = undoViewArr[i36];
            Class[] clsArr93 = new Class[1];
            clsArr93[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView6, 0, clsArr93, new String[]{"textPaint"}, null, null, null, i39));
            UndoView undoView7 = undoViewArr[i36];
            Class[] clsArr94 = new Class[1];
            clsArr94[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView7, 0, clsArr94, new String[]{"progressPaint"}, null, null, null, i39));
            UndoView undoView8 = undoViewArr[i36];
            Class[] clsArr95 = new Class[1];
            clsArr95[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView8, clsArr95, new String[]{"leftImageView"}, "info1", i37));
            UndoView undoView9 = undoViewArr[i36];
            Class[] clsArr96 = new Class[1];
            clsArr96[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView9, clsArr96, new String[]{"leftImageView"}, "info2", i37));
            UndoView undoView10 = undoViewArr[i36];
            Class[] clsArr97 = new Class[1];
            clsArr97[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView10, clsArr97, new String[]{"leftImageView"}, "luc12", i39));
            UndoView undoView11 = undoViewArr[i36];
            Class[] clsArr98 = new Class[1];
            clsArr98[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView11, clsArr98, new String[]{"leftImageView"}, "luc11", i39));
            UndoView undoView12 = undoViewArr[i36];
            Class[] clsArr99 = new Class[1];
            clsArr99[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView12, clsArr99, new String[]{"leftImageView"}, "luc10", i39));
            UndoView undoView13 = undoViewArr[i36];
            Class[] clsArr100 = new Class[1];
            clsArr100[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView13, clsArr100, new String[]{"leftImageView"}, "luc9", i39));
            UndoView undoView14 = undoViewArr[i36];
            Class[] clsArr101 = new Class[1];
            clsArr101[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView14, clsArr101, new String[]{"leftImageView"}, "luc8", i39));
            UndoView undoView15 = undoViewArr[i36];
            Class[] clsArr102 = new Class[1];
            clsArr102[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView15, clsArr102, new String[]{"leftImageView"}, "luc7", i39));
            UndoView undoView16 = undoViewArr[i36];
            Class[] clsArr103 = new Class[1];
            clsArr103[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView16, clsArr103, new String[]{"leftImageView"}, "luc6", i39));
            UndoView undoView17 = undoViewArr[i36];
            Class[] clsArr104 = new Class[1];
            clsArr104[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView17, clsArr104, new String[]{"leftImageView"}, "luc5", i39));
            UndoView undoView18 = undoViewArr[i36];
            Class[] clsArr105 = new Class[1];
            clsArr105[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView18, clsArr105, new String[]{"leftImageView"}, "luc4", i39));
            UndoView undoView19 = undoViewArr[i36];
            Class[] clsArr106 = new Class[1];
            clsArr106[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView19, clsArr106, new String[]{"leftImageView"}, "luc3", i39));
            UndoView undoView20 = undoViewArr[i36];
            Class[] clsArr107 = new Class[1];
            clsArr107[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView20, clsArr107, new String[]{"leftImageView"}, "luc2", i39));
            UndoView undoView21 = undoViewArr[i36];
            Class[] clsArr108 = new Class[1];
            clsArr108[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView21, clsArr108, new String[]{"leftImageView"}, "luc1", i39));
            UndoView undoView22 = undoViewArr[i36];
            Class[] clsArr109 = new Class[1];
            clsArr109[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView22, clsArr109, new String[]{"leftImageView"}, "Oval", i39));
            i36++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.o5));
        int i40 = org.telegram.ui.ActionBar.i6.q7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i40));
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
        int i41 = org.telegram.ui.ActionBar.i6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Xi));
        if (this.B1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.B1, 0, null, org.telegram.ui.ActionBar.i6.j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
            dx dxVar = this.B1;
            Drawable[] drawableArr16 = new Drawable[1];
            drawableArr16[i24] = org.telegram.ui.ActionBar.i6.i3;
            arrayList.add(new org.telegram.ui.ActionBar.k6(dxVar, 0, null, null, drawableArr16, null, org.telegram.ui.ActionBar.i6.Td));
            dx dxVar2 = this.B1;
            Class[] clsArr110 = new Class[1];
            clsArr110[i24] = ChatActivityEnterView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(dxVar2, 4, clsArr110, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Ud));
            dx dxVar3 = this.B1;
            Class[] clsArr111 = new Class[1];
            clsArr111[i24] = ChatActivityEnterView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(dxVar3, 16777216, clsArr111, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Wd));
            dx dxVar4 = this.B1;
            Class[] clsArr112 = new Class[1];
            clsArr112[i24] = ChatActivityEnterView.class;
            arrayList.add(new org.telegram.ui.ActionBar.k6(dxVar4, TLObject.FLAG_23, clsArr112, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Vd));
        }
        int i42 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i42));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i41));
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
        gg.r0 r0Var = this.b0;
        if (r0Var != null) {
            arrayList.addAll(r0Var.getThemeDescriptions());
            this.b0.C1();
        }
        vy vyVar = this.h0;
        if (vyVar != null) {
            vyVar.a();
            this.h0.invalidate();
        }
        dy dyVar5 = this.C0;
        if (dyVar5 != null) {
            dyVar5.M(arrayList);
        }
        org.telegram.ui.Cells.a3 a3Var = this.M1;
        int i43 = 8;
        if (a3Var != null) {
            arrayList.addAll(w7.a6.a(new org.telegram.ui.Components.a7(new cj(a3Var, 20), i43), org.telegram.ui.ActionBar.i6.d6, i42, org.telegram.ui.ActionBar.i6.y6));
        }
        org.telegram.ui.Cells.ua uaVar = this.N1;
        if (uaVar != null) {
            arrayList.addAll(w7.a6.a(new org.telegram.ui.Components.a7(new cj(uaVar, 21), i43), org.telegram.ui.ActionBar.i6.d6, i42, org.telegram.ui.ActionBar.i6.y6, org.telegram.ui.ActionBar.i6.I6, i40));
        }
        org.telegram.ui.Cells.m mVar2 = this.L1;
        if (mVar2 != null) {
            arrayList.addAll(w7.a6.a(new org.telegram.ui.Components.a7(new cj(mVar2, 22), i43), org.telegram.ui.ActionBar.i6.d6, i42, org.telegram.ui.ActionBar.i6.y6, org.telegram.ui.ActionBar.i6.I6, i40));
        }
        return arrayList;
    }

    public final void h3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && gk0.p(parentActivity)) {
            if (z10) {
                showDialog(new gk0(parentActivity, !org.telegram.ui.Components.ef0.a(), new fw(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.v(parentActivity, new yv(this, 1)).a;
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
            G4();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.ChatObject.getPublicUsername(r6) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h4(TLRPC.Chat chat, TLRPC.User user) {
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

    public final void i3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        if (this.G2 == null) {
            org.telegram.ui.Components.rr0 rr0Var = new org.telegram.ui.Components.rr0(getParentActivity(), getResourceProvider());
            this.G2 = rr0Var;
            int i10 = 0;
            rr0Var.setLayoutClickListener(new uv(this, i10));
            this.G2.setOnModeChangeListener(new vv(this, i10));
            dx dxVar = this.B1;
            org.telegram.ui.Components.rr0 rr0Var2 = this.G2;
            if (rr0Var2 == null) {
                dxVar.getClass();
            } else {
                dxVar.G1 = rr0Var2;
                dxVar.addView(rr0Var2, 0, w7.x5.e(-1, 48, 51));
                dxVar.g3 = false;
                dxVar.L();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
            layoutParams.rightMargin = -this.B1.getPaddingRight();
            this.G2.setLayoutParams(layoutParams);
        }
        if (X3()) {
            this.G2.i(this.currentAccount, this.D2);
        } else {
            String str = this.E2;
            if (str != null) {
                org.telegram.ui.Components.rr0 rr0Var3 = this.G2;
                rr0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    rr0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.rr0 rr0Var4 = this.G2;
                    rr0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        rr0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(LocaleController.getString(X3() ? R.string.AddCaption : R.string.ShareComment));
        s3();
        if (this.G2.getMode() != 0) {
            this.B1.v1(false, false);
        }
        Y4();
    }

    public final boolean i4(TLRPC.User user) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        nx nxVar;
        return (this.j2 || (nxVar = this.F3) == null || nxVar.getFragment() == null) ? i0.a.f(getThemedColor(org.telegram.ui.ActionBar.i6.d6)) > 0.699999988079071d : this.F3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j3() {
        ah.h hVar;
        fh.d dVar;
        fh.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.k4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f4) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int dp3 = AndroidUtilities.dp(this.K ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        qw qwVar = this.z0;
        boolean z10 = false;
        int measuredHeight2 = dp3 + ((qwVar == null || qwVar.getVisibility() != 0) ? 0 : this.z0.getMeasuredHeight());
        org.telegram.ui.Components.at atVar = this.J1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((atVar == null || atVar.getVisibility() != 0) ? 0 : this.J1.getSumHeightOfAllVisibleChild()) + ((int) this.N);
        int measuredHeight3 = this.actionBar.getMeasuredHeight();
        this.u4.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (this.Z != null ? r9.getMeasuredHeight() : 0), this.b.e) + dp);
        boolean z11 = this.W;
        RectF rectF = this.v4;
        if (!z11) {
            if (this.B1 != null && this.y1 != null) {
                rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - k3(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            }
            hVar.g(z10 ? 2 : 1, this.t4);
            hVar.e(this.s4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar = this.l4;
            if (dVar != null) {
                dVar.i(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar.k();
            }
            dVar2 = this.m4;
            if (dVar2 == null) {
                dVar2.i(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar2.k();
                return;
            }
            return;
        }
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        z10 = true;
        hVar.g(z10 ? 2 : 1, this.t4);
        hVar.e(this.s4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar = this.l4;
        if (dVar != null) {
        }
        dVar2 = this.m4;
        if (dVar2 == null) {
        }
    }

    public final void j4(View view) {
        int i10 = 0;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.e6) null, false);
        f3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        tv tvVar = new tv(this, i10);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = tvVar;
        showDialog(f3Var);
    }

    public final int k3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
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
    public final void k4(View view, int i10, s4.i0 i0Var) {
        s4.i0 i0Var2;
        long j3;
        boolean z10;
        int i11;
        int i12;
        int i13;
        MessageObject messageObject;
        long j10;
        long j11;
        org.telegram.ui.Components.wo0 wo0Var;
        nx nxVar;
        long j12;
        long j13;
        int i14;
        MessageObject messageObject2;
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
        boolean z12 = i0Var instanceof gg.m;
        if (z12) {
            gg.m mVar = (gg.m) i0Var;
            int i17 = mVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    I = mVar.I(i10);
                    if (this.C2 == null && mVar.n && i0Var.j(i10) == 21) {
                        this.C2.K(this);
                        return;
                    }
                    if (I instanceof TLRPC.User) {
                        if (I instanceof TLRPC.Chat) {
                            j17 = ((TLRPC.Chat) I).id;
                        } else if (I instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.u(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new ty(bundle));
                                return;
                            }
                            j16 = dialog.id;
                            if (this.actionBar.u(null)) {
                                J4(j16, view);
                                return;
                            }
                            i0Var2 = i0Var;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            messageObject = null;
                            i13 = i15;
                            j11 = j16;
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
                                    showDialog(new org.telegram.ui.Components.xy0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) I;
                            i0Var2 = i0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.i90(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j16 = -chat2.id;
                            i16 = 0;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            messageObject = null;
                            i13 = i15;
                            j11 = j16;
                            j10 = 0;
                            j3 = 0;
                        }
                        j16 = -j17;
                    } else {
                        j16 = ((TLRPC.User) I).id;
                    }
                    i0Var2 = i0Var;
                    i16 = 0;
                    i11 = i16;
                    z10 = false;
                    i12 = 0;
                    messageObject = null;
                    i13 = i15;
                    j11 = j16;
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
            i0Var2 = i0Var;
            i16 = 0;
            i11 = i16;
            z10 = false;
            i12 = 0;
            messageObject = null;
            i13 = i15;
            j11 = j16;
            j10 = 0;
            j3 = 0;
        } else {
            i0Var2 = i0Var;
            dy dyVar3 = this.C0;
            if (dyVar3 == null || i0Var2 != (wo0Var = dyVar3.b0)) {
                j3 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                messageObject = null;
                j10 = 0;
                j11 = 0;
            } else {
                Object J = wo0Var.J(i10);
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
                        dy dyVar4 = this.C0;
                        if (dyVar4 != null) {
                            org.telegram.ui.Components.wo0 wo0Var2 = dyVar4.b0;
                            wo0Var2.j0.a(wo0Var2.Z);
                        }
                        i14 = id2;
                        j12 = dialogId;
                    } else {
                        j3 = 0;
                        if (J instanceof String) {
                            String str2 = (String) J;
                            dy dyVar5 = this.C0;
                            if (dyVar5 != null && !dyVar5.b0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                dk0 dk0Var = new dk0(getParentActivity(), this);
                                dk0Var.x(str2, true);
                                dk0Var.show();
                            }
                        } else if (J instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) J;
                            org.telegram.ui.Components.g5.u(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((J instanceof TLRPC.TL_forumTopic) && (nxVar = this.F3) != null && (nxVar.getFragment() instanceof fg1)) {
                            j12 = -((fg1) this.F3.getFragment()).a;
                            j13 = ((TLRPC.TL_forumTopic) J).id;
                            i14 = 0;
                            messageObject2 = null;
                        }
                        i14 = 0;
                        messageObject2 = null;
                        j13 = 0;
                        j12 = 0;
                    }
                    if (j12 == j3 && this.actionBar.t()) {
                        if (this.actionBar.u("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            J4(j12, view);
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
                i14 = 0;
                messageObject2 = null;
                j12 = makeEncryptedDialogId;
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
            if (e5(j11)) {
                if ((!getMessagesController().isForum(j11) && !getMessagesController().isCommunity(j11)) || c4(j11)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j11)) || m3(j11)) {
                            boolean f32 = f3(j11, view);
                            dy dyVar6 = this.C0;
                            if (dyVar6 != null && i0Var2 == dyVar6.b0) {
                                this.actionBar.h(true);
                                M3(j11, f32);
                            }
                            X4();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().isCommunity(j11)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j11);
                    ty tyVar = new ty(bundle2);
                    tyVar.W2 = this;
                    tyVar.C2 = this.C2;
                    presentFragment(tyVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().isForum(j11) || c4(j11)) && !getMessagesController().isMonoForumWithManageRights(j11))) {
                    L3(j11, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j11);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                fg1 fg1Var = new fg1(bundle3);
                fg1Var.L0 = this;
                presentFragment(fg1Var);
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
                                dyVar7.b0.R(this.W1, tLObject);
                            }
                            this.X1 = null;
                        }
                    } else {
                        G3();
                    }
                    boolean z13 = LocaleController.isRTL && !this.j2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.X2 == j3;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j11) || !z13) && this.p2.dialogId == j11 && ((dyVar2 = this.C0) == null || i0Var2 != dyVar2.b0))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.s0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (sc.v.h(1, fragmentStack) instanceof zn)) {
                                ((zn) sc.v.h(1, fragmentStack)).Z9();
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
                    if (dyVar != null && dyVar.y0) {
                        dyVar.Q(false);
                    }
                    if (j11 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.D0 == null) {
                            this.D0 = new org.telegram.ui.Components.tv0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.db0(bundle5, this.D0));
                        return;
                    }
                    if (this.n2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            zn znVar = new zn(bundle4);
                            a4(znVar, messageObject);
                            presentFragment(znVar);
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
                            showDialog(new org.telegram.ui.Components.i90(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (b10 == 4) {
                            org.telegram.messenger.q.q(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.ad.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z11 = chat5.monoforum) || chat5.forum) && j14 == j3)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new ty(bundle6));
                                return;
                            }
                            zn znVar2 = new zn(bundle4);
                            if (j14 != j3) {
                                ng.d.a(znVar2, MessagesStorage.TopicKey.of(j11, j14));
                            }
                            if (z12 && DialogObject.isUserDialog(j11) && getMessagesController().dialogs_dict.f(j11) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                znVar2.B9 = greetingsSticker;
                                znVar2.C9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                nx nxVar2 = this.F3;
                                if (nxVar2.a != null) {
                                    nxVar2.a();
                                }
                            }
                            a4(znVar2, messageObject);
                            presentFragment(znVar2);
                            return;
                        }
                        if (z11) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            zn znVar3 = new zn(bundle4);
                            a4(znVar3, messageObject);
                            presentFragment(znVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            zn znVar4 = new zn(bundle4);
                            ng.d.a(znVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(znVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.X2 != j3) {
                            if (!z14) {
                                presentFragment(new fg1(bundle4));
                                return;
                            }
                            zn znVar5 = new zn(bundle4);
                            a4(znVar5, messageObject);
                            presentFragment(znVar5);
                            return;
                        }
                        if (!z13) {
                            if (!z14) {
                                presentFragment(new fg1(bundle4));
                                return;
                            }
                            zn znVar6 = new zn(bundle4);
                            a4(znVar6, messageObject);
                            presentFragment(znVar6);
                            return;
                        }
                        if (this.j2) {
                            return;
                        }
                        if (z14) {
                            zn znVar7 = new zn(bundle4);
                            a4(znVar7, messageObject);
                            presentFragment(znVar7);
                            return;
                        }
                        nx nxVar3 = this.F3;
                        ux uxVar = nxVar3.a;
                        if (uxVar == null || (-uxVar.a) != j11) {
                            py pyVar = this.e0[0].a;
                            pyVar.n3 = 0.0f;
                            pyVar.o3 = pyVar.m3;
                            pyVar.p3 = pyVar.g3 != 0.0f;
                            ux uxVar2 = new ux(bundle4);
                            uxVar2.M0 = this;
                            final nx nxVar4 = this.F3;
                            org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = nxVar4.n;
                            if (!nxVar4.r) {
                                nxVar4.w = parentLayout;
                                uxVar2.onFragmentCreate();
                                uxVar2.setInPreviewMode(true);
                                uxVar2.setParentLayout(parentLayout);
                                View performCreateView = uxVar2.performCreateView(nxVar4.getContext());
                                uxVar2.onResume();
                                nxVar4.b = performCreateView;
                                nxVar4.addView(performCreateView);
                                final ux uxVar3 = nxVar4.a;
                                k0 k0Var = uxVar2.e;
                                nxVar4.c = k0Var;
                                nxVar4.addView(k0Var);
                                nxVar4.a = uxVar2;
                                l41.Q = j3;
                                l41.Q = -uxVar2.a;
                                if (uxVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.k actionBar = uxVar2.getActionBar();
                                    nxVar4.d = actionBar;
                                    nxVar4.addView(actionBar);
                                    nxVar4.d.U0 = new nz0(nxVar4, 9);
                                }
                                if (uxVar3 != null) {
                                    final ux uxVar4 = nxVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.k kVar = nxVar4.x;
                                        if (kVar != null) {
                                            kVar.c();
                                        }
                                        uxVar4.onTransitionAnimationStart(true, false);
                                        nxVar4.E = uxVar3;
                                        nxVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.k kVar2 = new o1.k(new o1.j(0.0f));
                                        nxVar4.x = kVar2;
                                        kVar2.u = org.telegram.ui.Cells.c1.j(1000.0f, 400.0f, 1.0f);
                                        l41.f(uxVar3, uxVar4, 0.0f);
                                        nxVar4.x.b(new sd0(nxVar4, i18));
                                        nxVar4.x.a(new o1.f() { // from class: org.telegram.ui.j41
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z15, float f7, float f10) {
                                                l41 l41Var = nxVar4;
                                                if (l41Var.x == null) {
                                                    return;
                                                }
                                                l41Var.x = null;
                                                org.telegram.ui.ActionBar.n2 n2Var2 = uxVar4;
                                                n2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.n2 n2Var3 = uxVar3;
                                                l41.f(n2Var3, n2Var2, 1.0f);
                                                l41Var.v = false;
                                                l41Var.E = null;
                                                n2Var3.onPause();
                                                n2Var3.onFragmentDestroy();
                                                l41Var.removeView(n2Var3.getFragmentView());
                                                l41Var.removeView(n2Var3.getActionBar());
                                                l41Var.n.unlock();
                                            }
                                        });
                                        nxVar4.x.h();
                                    } else {
                                        uxVar4.onTransitionAnimationStart(true, false);
                                        uxVar4.onTransitionAnimationEnd(true, false);
                                        l41.f(uxVar3, uxVar4, 1.0f);
                                        nxVar4.v = false;
                                        nxVar4.E = null;
                                        uxVar3.onPause();
                                        uxVar3.onFragmentDestroy();
                                        nxVar4.removeView(uxVar3.getFragmentView());
                                        nxVar4.removeView(uxVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!nxVar4.f) {
                                    nxVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        nxVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        nxVar4.e = 0.0f;
                                        nxVar4.e(true);
                                        nxVar4.g();
                                        uxVar2.onTransitionAnimationStart(true, false);
                                        nxVar4.h.addUpdateListener(new i41(nxVar4, 1));
                                        nxVar4.h.addListener(new org.telegram.ui.Components.ul0(13, nxVar4, uxVar2));
                                        nxVar4.h.setDuration(250L);
                                        nxVar4.h.setInterpolator(org.telegram.ui.Components.hs.f);
                                        nxVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        nxVar4.h.start();
                                    } else {
                                        nxVar4.e(true);
                                        uxVar2.onTransitionAnimationStart(true, false);
                                        uxVar2.onTransitionAnimationEnd(true, false);
                                        nxVar4.e = 1.0f;
                                        nxVar4.g();
                                        nxVar4.d(false);
                                    }
                                }
                                uxVar2.setPreviewDelegate(new hq0(nxVar4, 15));
                                WeakHashMap weakHashMap = r0.i0.a;
                                r0.y.c(nxVar4);
                            }
                        } else {
                            nxVar3.a();
                        }
                        dy dyVar8 = this.C0;
                        if (dyVar8 != null) {
                            dyVar8.R();
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
                dyVar.Q(false);
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

    public final void l3() {
        AndroidUtilities.runOnUIThread(new ov(this, 2), 300L);
    }

    public final boolean l4(View view, int i10, float f7, org.telegram.ui.Components.pm0 pm0Var) {
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && pm0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.S(f7)) {
                    return E4(s2Var);
                }
            }
            nx nxVar = this.F3;
            if (nxVar == null || !nxVar.c()) {
                dy dyVar = this.C0;
                if (dyVar != null && pm0Var == (wo0Var2 = dyVar.b0)) {
                    Object J = wo0Var2.J(i10);
                    if (!this.C0.b0.N) {
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
                if (dyVar2 == null || pm0Var != (wo0Var = dyVar2.b0)) {
                    Object I = ((gg.m) pm0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.l2) {
                            if ((this.R0 == 3 || F3()) && e5(dialog.id)) {
                                if (this.R0 != 1 || !F3() || !this.m2 || !getMessagesController().isForum(dialog.id)) {
                                    f3(dialog.id, view);
                                    X4();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.R0 == 1);
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                fg1 fg1Var = new fg1(bundle);
                                fg1Var.L0 = this;
                                presentFragment(fg1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                j4(view);
                                return false;
                            }
                            if (!this.actionBar.t() || !d4(dialog)) {
                                J4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.l2) {
                        k4(view, i10, pm0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.i6) || wo0Var.O(i10)) ? 0L : ((org.telegram.ui.Cells.i6) view).getDialogId();
                    if (dialogId != 0) {
                        J4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean m3(long j3) {
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

    public final void m4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new gf(21));
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.kh0 kh0Var = new org.telegram.ui.Components.kh0(this, getParentActivity(), z10);
                linearLayout.addView(kh0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.e(currentUser, j9Var);
                kh0Var.addView(y9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 12));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 1) {
            z3();
            B3();
            E3();
            r3();
            C3();
            jy jyVar = this.X;
            me.b bVar = this.b;
            jyVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = yf.e0.b(bVar.e);
            org.telegram.ui.Components.y9 y9Var = this.a3;
            if (y9Var != null) {
                y9Var.setScaleX(b10);
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
            z3();
            B3();
            return;
        }
        if (i10 == 3) {
            x3();
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
            w3();
            return;
        }
        if (i10 == 6) {
            z3();
            B3();
        } else {
            if (i10 == 7) {
                s3();
                return;
            }
            if (i10 == 8) {
                r3();
                C3();
            } else if (i10 == 9) {
                C3();
            }
        }
    }

    public final void n3(boolean z10) {
        gi.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.at atVar = this.J1;
        if (atVar == null || (jVar = this.Q1) == null || (chatFull = this.Z2) == null) {
            return;
        }
        atVar.i(jVar, (this.X2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
    }

    public final void n4(int i10, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
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

    public final void o3(sy syVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = syVar.c.L0();
        int N0 = syVar.c.N0();
        if (this.g3 || this.l3) {
            return;
        }
        qw qwVar = this.z0;
        if (qwVar != null && qwVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.d1 K = syVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                Z3(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = syVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = syVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(syVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= O3(this.currentAccount, syVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                z10 = (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) ? false : true;
                z11 = z15;
                if ((abs > 0 || N0 < O3(this.currentAccount, syVar.s, this.V2, this.S1).size() - 10) && (abs != 0 || (!((i10 = syVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.V2)))) {
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
                if (!z12 || z10) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jw
                        @Override // java.lang.Runnable
                        public final void run() {
                            ty tyVar = ty.this;
                            if (z12) {
                                tyVar.getMessagesController().loadDialogs(tyVar.V2, -1, 100, z13);
                            }
                            if (z10) {
                                tyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                            } else {
                                tyVar.getClass();
                            }
                        }
                    });
                }
                return;
            }
        }
        z10 = false;
        z11 = false;
        if (abs > 0) {
        }
        z12 = false;
        z13 = false;
        if (z12) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jw
            @Override // java.lang.Runnable
            public final void run() {
                ty tyVar = ty.this;
                if (z12) {
                    tyVar.getMessagesController().loadDialogs(tyVar.V2, -1, 100, z13);
                }
                if (z10) {
                    tyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                } else {
                    tyVar.getClass();
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
    public final void o4(java.util.ArrayList r40, int r41, boolean r42, boolean r43, java.util.HashSet r44) {
        /*
            Method dump skipped, instructions count: 2799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.o4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.F3.c() || !this.F3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.p80 p80Var = this.L0;
            if (p80Var == null) {
                qw qwVar = this.z0;
                if (qwVar == null || !qwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.t()) {
                        if (!this.b.f) {
                            qw qwVar2 = this.z0;
                            if (qwVar2 != null && qwVar2.getVisibility() == 0 && !this.g3) {
                                qw qwVar3 = this.z0;
                                if (!qwVar3.O && !this.l3) {
                                    ArrayList arrayList = qwVar3.h;
                                    if (!arrayList.isEmpty() && qwVar3.L != ((org.telegram.ui.Components.w00) arrayList.get(0)).a) {
                                        if (z10) {
                                            qw qwVar4 = this.z0;
                                            ArrayList arrayList2 = qwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                qwVar4.f((org.telegram.ui.Components.w00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            dx dxVar = this.B1;
                            if (dxVar == null || !dxVar.r0()) {
                                kx kxVar = this.E0;
                                if (kxVar.O != 0 || kxVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                kxVar.h.x0(0);
                                return false;
                            }
                            if (z10) {
                                this.B1.k0(true);
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
                            this.C0.Q(false);
                        }
                        Y3(true);
                        return false;
                    }
                } else if (z10) {
                    qwVar.setIsEditing(false);
                    F4(false);
                    return false;
                }
            } else if (z10) {
                p80Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.F3.a();
            dy dyVar2 = this.C0;
            if (dyVar2 != null) {
                dyVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        ci.bb bbVar;
        qw qwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                dy dyVar = this.C0;
                if (dyVar != null) {
                    dyVar.b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (qwVar = this.z0) != null && qwVar.getVisibility() == 0 && this.r.f) {
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
        if (!isInPreviewMode() && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        y3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        ci.d4 d4Var;
        super.onBecomeFullyVisible();
        if (b4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = O3(this.currentAccount, this.R0, this.V2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                D4();
            }
        }
        if (this.r0 && !this.s0 && (d4Var = this.p0) != null && this.N3) {
            this.s0 = true;
            this.r0 = false;
            d4Var.u();
        }
        AndroidUtilities.runOnUIThread(new hw(this, 4), 200L);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.p80 p80Var = this.L0;
        if (p80Var != null) {
            p80Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (b2Var = this.T1) != null && dialog == b2Var && getParentActivity() != null) {
            h3(false);
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
        f4(getAccountInstance());
        ai.m9 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ai.z7(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.Q3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            av avVar = this.Q3;
            if (avVar.getParent() != null) {
                ((ViewGroup) avVar.getParent()).removeView(avVar);
            }
            this.Q3 = null;
        }
        if (b4()) {
            ai.m9 storiesController2 = getMessagesController().getStoriesController();
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
        dx dxVar = this.B1;
        if (dxVar != null) {
            dxVar.z0();
        }
        org.telegram.ui.Components.rr0 rr0Var = this.G2;
        if (rr0Var != null) {
            rr0Var.j();
        }
        org.telegram.ui.Components.ea1 ea1Var = this.H2;
        if (ea1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ea1Var);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.o3.unlock();
        this.C2 = null;
        jb1 jb1Var = jb1.b;
        if (jb1Var != null) {
            jb1Var.dismiss();
            jb1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        dx dxVar = this.B1;
        int i10 = 0;
        if (dxVar == null || !dxVar.r0()) {
            while (true) {
                sy[] syVarArr = this.e0;
                if (i10 >= syVarArr.length) {
                    break;
                }
                syVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.tc tcVar = this.n3;
                if (tcVar != null) {
                    tcVar.l();
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
            sy[] syVarArr2 = this.e0;
            if (i10 >= syVarArr2.length) {
                break;
            }
            syVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.tc tcVar2 = this.n3;
            if (tcVar2 != null) {
                tcVar2.l();
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
        org.telegram.ui.Components.tc tcVar = this.S;
        if (tcVar != null) {
            tcVar.b();
            this.S = null;
        }
        nx nxVar = this.F3;
        if (nxVar != null) {
            nxVar.r = true;
            ux uxVar = nxVar.a;
            if (uxVar != null) {
                uxVar.onPause();
            }
        }
        org.telegram.ui.Components.p80 p80Var = this.L0;
        if (p80Var != null) {
            p80Var.u();
        }
        dx dxVar = this.B1;
        if (dxVar != null) {
            dxVar.B0();
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
            sy[] syVarArr = this.e0;
            if (i10 >= syVarArr.length) {
                return;
            }
            syVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 != 1) {
            if (i10 == 4) {
                for (int i11 : iArr) {
                    if (i11 != 0) {
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
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (iArr.length > i12) {
                String str = strArr[i12];
                str.getClass();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i12] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            gk0.o();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i12] == 0) {
                            ImageLoader.getInstance().checkMediaPaths();
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i12] == 0) {
                            AndroidUtilities.runOnUIThread(new hw(this, 3));
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
            G4();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        ty tyVar;
        sy syVar;
        ax axVar;
        org.telegram.ui.Components.wo0 wo0Var;
        ci.bb bbVar;
        super.onResume();
        kx kxVar = this.E0;
        if (kxVar != null) {
            ArrayList arrayList = kxVar.x;
            ai.m9 m9Var = kxVar.s;
            m9Var.l(m9Var.g);
            m9Var.l(m9Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = m9Var.y(((ai.w) arrayList.get(i10)).c);
                if (y3 != null) {
                    m9Var.X(y3);
                }
            }
        }
        nx nxVar = this.F3;
        if (nxVar != null) {
            nxVar.r = false;
            ux uxVar = nxVar.a;
            if (uxVar != null) {
                uxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i11 = 0;
            while (true) {
                sy[] syVarArr = this.e0;
                if (i11 >= syVarArr.length) {
                    break;
                }
                syVarArr[i11].d.l();
                i11++;
            }
        }
        dx dxVar = this.B1;
        if (dxVar != null) {
            dxVar.C0();
        }
        long j3 = 0;
        if (!this.l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        dy dyVar = this.C0;
        if (dyVar != null && (wo0Var = dyVar.b0) != null) {
            wo0Var.l();
        }
        boolean z10 = this.t2 || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.c2 && !this.l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.c2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                tyVar = this;
                org.telegram.messenger.o1 o1Var = new org.telegram.messenger.o1(tyVar, z13, z11, z12, parentActivity);
                if (tyVar.t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(o1Var, j3);
            } else {
                tyVar = this;
            }
        } else {
            tyVar = this;
            if (!tyVar.l2 && tyVar.V2 == 0 && tyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new vv(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.fe0(26));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (tyVar.V2 == 0 && tyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new vv(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.fe0(27));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        G4();
        if (tyVar.e0 != null) {
            int i13 = 0;
            while (true) {
                sy[] syVarArr2 = tyVar.e0;
                if (i13 >= syVarArr2.length) {
                    break;
                }
                sy syVar2 = syVarArr2[i13];
                if (syVar2.s == 0 && syVar2.v == 2 && syVar2.c.L0() == 0 && W3()) {
                    tyVar.e0[i13].c.h1(1, (int) tyVar.N);
                }
                if (i13 == 0) {
                    tyVar.e0[i13].d.getClass();
                } else {
                    tyVar.e0[i13].d.getClass();
                }
                i13++;
            }
        }
        I4();
        setBulletinDelegate(new y8(this, 4));
        if (tyVar.p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), tyVar.classGuid);
        }
        d5(0, false);
        W4(false, true);
        c5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            jb1.p(this);
        }
        y3();
        if (tyVar.z0 == null || (syVar = tyVar.e0[0]) == null || (axVar = syVar.d) == null) {
            return;
        }
        int i14 = axVar.h;
        if (i14 == 7 || i14 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i14 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                tyVar.z0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Y3 && this.Z3 == null) {
            C4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ci.bb bbVar;
        ty tyVar;
        nx nxVar = this.F3;
        if (nxVar == null || !nxVar.c()) {
            if (z10 && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
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
        if (!z10 && (tyVar = this.W2) != null) {
            tyVar.removeSelfFromStack();
        }
        y3();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        nx nxVar = this.F3;
        if (nxVar == null || !nxVar.c()) {
            ci.bb bbVar = this.K0;
            if (bbVar != null && bbVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        }
        y3();
    }

    public final void p3() {
        if (this.e0 == null) {
            return;
        }
        int k32 = k3();
        int i10 = 0;
        while (true) {
            sy[] syVarArr = this.e0;
            if (i10 >= syVarArr.length) {
                return;
            }
            sy syVar = syVarArr[i10];
            if (syVar != null) {
                py pyVar = syVar.a;
                pyVar.setPadding(0, pyVar.W2, 0, k32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p4(long j3, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        boolean z12;
        int i11;
        boolean pinDialog;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && W3() && this.e0[0].v == 2) ? 1 : 0;
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
            z12 = true;
        } else {
            x4(true, true);
            l3();
            if (this.R1 != null) {
                for (int i15 = 0; i15 < this.R1.size(); i15++) {
                    if (((TLRPC.Dialog) this.R1.get(i15)).id == j3) {
                        i11 = i15;
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = false;
        }
        i11 = -1;
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
                    Z3(false);
                }
                u4(true, false);
            } else {
                ArrayList O3 = O3(this.currentAccount, this.e0[0].s, this.V2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= O3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) O3.get(i16)).id == j3) {
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
                sy syVar = this.e0[0];
                syVar.c.h1((syVar.s == 0 && W3() && this.e0[0].v == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new ov(this, 24), 200L);
            }
            z13 = true;
            if (z13) {
                x4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            y4(true);
        } else {
            this.Z3 = null;
            this.Y3 = false;
            y4(false);
            C4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        boolean presentFragment = super.presentFragment(n2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                sy[] syVarArr = this.e0;
                if (i10 >= syVarArr.length) {
                    break;
                }
                syVarArr[i10].d.getClass();
                i10++;
            }
        }
        ci.d4 d4Var = this.p0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.q0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        org.telegram.ui.Components.tc.e();
        return presentFragment;
    }

    public final void q3() {
        hh.f fVar = this.y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void q4() {
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
        y3();
    }

    public final void r3() {
        sy syVar;
        float P3 = P3(true);
        qw qwVar = this.z0;
        if (qwVar != null) {
            boolean z10 = qwVar.getAlpha() != P3;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, P3);
            this.z0.setAlpha(P3);
            this.z0.setScaleX(lerp);
            this.z0.setScaleY(lerp);
            this.z0.setVisibility(P3 > 0.0f ? 0 : 8);
            if (z10 && (syVar = this.e0[0]) != null) {
                syVar.a.requestLayout();
            }
        }
        P4();
    }

    public final void r4(sy syVar) {
        int i10;
        if (syVar.getVisibility() != 0) {
            return;
        }
        int i11 = syVar.d.v;
        if (syVar.s == 0 && W3() && syVar.a.getChildCount() == 0 && syVar.v == 2) {
            ((s4.d0) syVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        syVar.d.getClass();
        syVar.d.U();
        int h = syVar.d.h();
        if (h == 1 && i11 == 1 && syVar.d.j(0) == 5) {
            syVar.q(true);
        } else {
            syVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                syVar.y.b(i11);
            }
        }
        try {
            syVar.a.setEmptyView((this.V2 == 0 && this.X2 == 0) ? syVar.w : null);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        o3(syVar);
    }

    @Override // org.telegram.ui.eh0
    public final void s() {
        u4(true, true);
    }

    public final void s3() {
        float f7 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ii.z1 z1Var = this.C1;
        if (z1Var != null) {
            z1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        hh.f fVar = this.y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            this.y1.setVisibility(f7 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f7);
            this.y1.getFadeView().setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void s4() {
        boolean z10;
        if (this.N == 0.0f || (z10 = this.K)) {
            return;
        }
        float f7 = z10 ? -R3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
        animatorSet.setInterpolator(org.telegram.ui.Components.hs.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        kx kxVar = this.E0;
        if (kxVar != null) {
            if (!this.G0 || z10) {
                kxVar.setVisibility(8);
            } else {
                kxVar.setVisibility(0);
            }
        }
        V4(true);
        R4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        px pxVar;
        org.telegram.ui.Components.q5 q5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (pxVar = this.M0) != null && (pxVar.getContentView() instanceof k71)) {
            org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
            k71 k71Var = (k71) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                q5Var = this.D3;
            }
            q5Var = null;
            k71Var.y(q5Var, titleTextView);
        }
        kx kxVar = this.E0;
        if (kxVar != null) {
            org.telegram.ui.Components.r6 r6Var = kxVar.T;
            kxVar.U.b(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                kxVar.g0 = true;
                if (kxVar.h0 != i10) {
                    kxVar.h0 = i10;
                    r6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                kxVar.g0 = false;
                kxVar.h0 = 0;
                r6Var.c(kxVar.f0, !LocaleController.isRTL, true);
            }
            kxVar.a.a(kxVar.g0, true);
            kxVar.L0.v(r6Var);
        }
    }

    public final void t3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float S3 = 1.0f - S3();
        org.telegram.ui.Components.p20.d(this.actionBar.getBackButton(), Math.max(this.t3, f7 * S3 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t4(int i10) {
        org.telegram.ui.Components.w00 w00Var;
        if (this.z0 == null) {
            S4(true, true);
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
        qw qwVar = this.z0;
        if (tabsCount < 0) {
            qwVar.getClass();
        } else if (tabsCount < qwVar.getTabsCount()) {
            w00Var = (org.telegram.ui.Components.w00) qwVar.h.get(tabsCount);
            if (w00Var != null) {
                qw qwVar2 = this.z0;
                ArrayList arrayList = qwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                qwVar2.f((org.telegram.ui.Components.w00) hg.c.g(1, arrayList), arrayList.size() - 1);
                return;
            }
            sy[] syVarArr = this.e0;
            if (syVarArr == null || syVarArr.length <= 0 || syVarArr[0].h != w00Var.a) {
                this.z0.f(w00Var, tabsCount);
                return;
            }
            return;
        }
        w00Var = null;
        if (w00Var != null) {
        }
    }

    public final void u3() {
        org.telegram.ui.Components.p20.d(this.g0, com.google.android.gms.internal.vision.e2.C(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - S3(), 1.0f - this.c.e));
    }

    public final void u4(boolean z10, boolean z11) {
        nx nxVar = this.F3;
        if (nxVar == null || !nxVar.c()) {
            int i10 = (this.e0[0].s == 0 && W3() && this.e0[0].v == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                s4();
            } else {
                org.telegram.ui.Components.tl0 tl0Var = this.e0[0].r;
                tl0Var.b = 1;
                tl0Var.c(i10, i11, false, false);
                s4();
            }
        }
    }

    public final void v3() {
        org.telegram.ui.Components.p20.d(this.f0, com.google.android.gms.internal.vision.e2.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - S3(), 1.0f - this.c.e));
    }

    public final void v4(String str, boolean z10) {
        L4(true, false, true, false);
        jy jyVar = this.X;
        if (jyVar != null) {
            jyVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void w3() {
        org.telegram.ui.Components.p20.d(this.j0, com.google.android.gms.internal.vision.e2.C(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - S3(), 1.0f - this.c.e));
        kx kxVar = this.E0;
        if (kxVar != null) {
            kxVar.invalidate();
        }
    }

    public final void w4(float f7) {
        this.c0 = f7;
        for (sy syVar : this.e0) {
            py pyVar = syVar.a;
            for (int i10 = 0; i10 < pyVar.getChildCount(); i10++) {
                View childAt = pyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= syVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void x3() {
        org.telegram.ui.Components.p20.d(this.l0, com.google.android.gms.internal.vision.e2.C(this.b.e, 1.0f - S3(), 1.0f - this.c.e, this.d.e));
    }

    public final void x4(boolean z10, boolean z11) {
        if (this.e0 == null || this.S1 == z10) {
            return;
        }
        if (z10) {
            this.R1 = new ArrayList(O3(this.currentAccount, this.e0[0].s, this.V2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z10;
        sy syVar = this.e0[0];
        syVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (syVar.a.b0()) {
            this.e0[0].a.post(new hw(this, 9));
        } else {
            this.e0[0].d.l();
        }
    }

    @Override // org.telegram.ui.eh0
    public final fh.d y() {
        return this.m4;
    }

    public final void y3() {
        ci.bb bbVar;
        boolean z10 = !this.j2 && ((bbVar = this.K0) == null || bbVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        ch0 ch0Var = this.I3;
        if (ch0Var != null) {
            ch0Var.a.v.a(z10, true);
        }
    }

    public final void y4(boolean z10) {
        sy syVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            sy[] syVarArr = this.e0;
            if (syVarArr != null && (syVar = syVarArr[0]) != null) {
                syVar.setLayerType(2, null);
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
                sy[] syVarArr2 = this.e0;
                if (i10 >= syVarArr2.length) {
                    break;
                }
                sy syVar2 = syVarArr2[i10];
                if (syVar2 != null) {
                    syVar2.setLayerType(0, null);
                    syVar2.setClipChildren(true);
                    syVar2.setClipToPadding(true);
                    syVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        kx kxVar = this.E0;
        if (kxVar != null) {
            kxVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void z3() {
        t3();
        org.telegram.ui.Components.p20.d(this.k0, (1.0f - this.b.e) * (1.0f - S3()) * (1.0f - this.c.e));
        u3();
        x3();
        v3();
        w3();
    }

    public final void z4(float f7) {
        sy[] syVarArr = this.e0;
        if (syVarArr != null) {
            int paddingTop = syVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                sy[] syVarArr2 = this.e0;
                if (i10 >= syVarArr2.length) {
                    break;
                }
                syVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f7 == this.N) {
            return;
        }
        this.N = f7;
        org.telegram.ui.Components.tc tcVar = this.n3;
        if (tcVar != null) {
            tcVar.l();
        }
        if (this.E3 != null) {
            float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.E3;
            float f10 = (int) f7;
            float f11 = oVar.f;
            oVar.h = f10;
            oVar.setTranslationY(f11 + f10);
            this.E3.setAlpha(w7.o.a(currentActionBarHeight, 0.0f, 1.0f));
            this.E3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        B3();
        this.fragmentView.invalidate();
    }
}
