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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class yy extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, ng.b, ne.d, jh0 {
    public static boolean w4;
    public static final boolean[] x4 = new boolean[4];
    public static final org.telegram.ui.Components.js0 y4 = new org.telegram.ui.Components.js0(3);
    public static float z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ix B1;
    public boolean B2;
    public Long B3;
    public iy C0;
    public ji.y1 C1;
    public sy C2;
    public Drawable C3;
    public org.telegram.ui.Components.pv0 D0;
    public org.telegram.ui.ActionBar.u0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.q5 D3;
    public boolean E;
    public px E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.vs F0;
    public hx F1;
    public CharSequence F2;
    public sx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.or0 G2;
    public final gx G3;
    public long H;
    public float H0;
    public hx H1;
    public org.telegram.ui.Components.k31 H2;
    public final gx H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public hh0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.xs J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public di.ab K0;
    public org.telegram.ui.Components.ws K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.m80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public ux M0;
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
    public hi.j Q1;
    public int Q2;
    public gv Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.sc S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.a2 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.ae0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public yy W2;
    public float W3;
    public oy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public zf.h0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public c51 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int a;
    public org.telegram.ui.Components.j91 a0;
    public final ArrayList a1;
    public boolean a2;
    public org.telegram.ui.Components.z9 a3;
    public org.telegram.ui.Components.i50 a4;
    public final ne.b b;
    public hg.r0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.k9 b3;
    public TLRPC.FileLocation b4;
    public final ne.b c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public long c3;
    public TLRPC.FileLocation c4;
    public final ne.b d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public boolean d3;
    public org.telegram.ui.Components.sc d4;
    public final ne.b e;
    public xy[] e0;
    public org.telegram.ui.ActionBar.f2 e1;
    public boolean e2;
    public boolean e3;
    public int e4;
    public final ne.b f;
    public org.telegram.ui.ActionBar.u0 f0;
    public final Paint f1;
    public String f2;
    public AnimatorSet f3;
    public int f4;
    public org.telegram.ui.ActionBar.u0 g0;
    public ImageView g1;
    public String g2;
    public boolean g3;
    public int g4;
    public final ne.b h;
    public az h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public float i3;
    public int i4;
    public org.telegram.ui.ActionBar.u0 j0;
    public org.telegram.ui.ActionBar.u0 j1;
    public boolean j2;
    public boolean j3;
    public ih.j j4;
    public org.telegram.ui.ActionBar.u0 k0;
    public org.telegram.ui.ActionBar.u0 k1;
    public boolean k2;
    public int k3;
    public final bh.f k4;
    public org.telegram.ui.ActionBar.u0 l0;
    public org.telegram.ui.ActionBar.u0 l1;
    public boolean l2;
    public boolean l3;
    public final gh.d l4;
    public org.telegram.ui.ActionBar.u0 m0;
    public org.telegram.ui.ActionBar.u0 m1;
    public boolean m2;
    public boolean m3;
    public final gh.d m4;
    public final ne.b n;
    public org.telegram.ui.Components.gj0 n0;
    public org.telegram.ui.ActionBar.e1 n1;
    public String n2;
    public org.telegram.ui.Components.sc n3;
    public final gh.c n4;
    public org.telegram.ui.ActionBar.e1 o0;
    public org.telegram.ui.ActionBar.e1 o1;
    public String o2;
    public final AnimationNotificationsLocker o3;
    public final bh.b o4;
    public di.d4 p0;
    public org.telegram.ui.ActionBar.e1 p1;
    public final MessagesStorage.TopicKey p2;
    public boolean p3;
    public final bh.b p4;
    public di.d4 q0;
    public org.telegram.ui.ActionBar.e1 q1;
    public boolean q2;
    public boolean q3;
    public final bh.b q4;
    public final ne.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.e1 r1;
    public boolean r2;
    public boolean r3;
    public final bh.b r4;
    public final ne.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.e1 s1;
    public boolean s2;
    public boolean s3;
    public ow s4;
    public org.telegram.ui.Components.l20 t0;
    public org.telegram.ui.ActionBar.e1 t1;
    public boolean t2;
    public float t3;
    public final ArrayList t4;
    public org.telegram.ui.Components.l20 u0;
    public float u1;
    public boolean u2;
    public ValueAnimator u3;
    public final RectF u4;
    public final qh.i v;
    public di.d v0;
    public float v1;
    public boolean v2;
    public float v3;
    public final RectF v4;
    public boolean w;
    public kh.f w0;
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
    public ih.f y1;
    public boolean y2;
    public int y3;
    public ww z0;
    public FrameLayout z1;
    public boolean z2;
    public boolean z3;

    public yy(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.b = new ne.b(1, this, esVar, 350L, false);
        this.c = new ne.b(2, this, esVar, 350L, false);
        this.d = new ne.b(3, this, esVar, 350L, false);
        this.e = new ne.b(4, this, esVar, 350L, false);
        this.f = new ne.b(5, this, esVar, 350L, false);
        this.h = new ne.b(6, this, esVar, 350L, false);
        this.n = new ne.b(7, this, esVar, 350L, false);
        this.r = new ne.b(8, this, esVar, 350L, false);
        this.s = new ne.b(9, this, esVar, 350L, false);
        this.v = new qh.i(new nw(this, 2));
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
        this.G3 = new gx(this, 0);
        this.H3 = new gx(this, 1);
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
        gh.c cVar = new gh.c();
        this.n4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (i10 >= 31) {
            this.k4 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.l4 = dVar;
            dVar.j(new ey(this, 0));
            gh.d dVar2 = new gh.d(null);
            this.m4 = dVar2;
            dVar2.j(new ey(this, 3));
            bh.b bVar = new bh.b(dVar);
            this.o4 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.q4 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
            this.p4 = new bh.b(dVar);
        } else {
            this.k4 = null;
            this.l4 = null;
            this.m4 = null;
            this.o4 = new bh.b(cVar);
            this.q4 = new bh.b(cVar);
            this.p4 = new bh.b(cVar);
        }
        this.r4 = new bh.b(cVar);
    }

    public static /* synthetic */ void B0(yy yyVar, float f7, ValueAnimator valueAnimator) {
        yyVar.e0[0].setTranslationY((1.0f - yyVar.t3) * f7);
        yyVar.t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < yyVar.actionBar.getChildCount(); i10++) {
            if (yyVar.actionBar.getChildAt(i10).getVisibility() == 0 && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getActionMode() && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getBackButton()) {
                yyVar.actionBar.getChildAt(i10).setAlpha(1.0f - yyVar.t3);
            }
        }
        yyVar.B3();
        yyVar.t3();
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void C0(yy yyVar) {
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(yyVar.getParentActivity(), yyVar.resourceProvider);
        acVar.d(R.raw.email_check_inbox, new String[0]);
        acVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.sc.g(yyVar, acVar, 2750).j();
        try {
            yyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D0(yy yyVar) {
        org.telegram.ui.Components.so0 so0Var;
        kc1 kc1Var;
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            if (i10 == 2) {
                iy iyVar = yyVar.C0;
                if (iyVar == null) {
                    i10++;
                } else {
                    viewGroup = iyVar.V;
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
                xy[] xyVarArr = yyVar.e0;
                if (xyVarArr == null) {
                    i10++;
                } else {
                    viewGroup = i10 < xyVarArr.length ? xyVarArr[i10].a : null;
                    if (viewGroup == null) {
                    }
                    i10++;
                }
            }
        }
        iy iyVar2 = yyVar.C0;
        if (iyVar2 != null && (so0Var = iyVar2.b0) != null && (kc1Var = so0Var.k0) != null) {
            int childCount2 = kc1Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = kc1Var.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) childAt2;
                    org.telegram.ui.Components.k9 k9Var = n4Var.c;
                    int i13 = n4Var.h;
                    if (DialogObject.isUserDialog(n4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(n4Var.f));
                        n4Var.e = user;
                        k9Var.m(i13, user);
                    } else {
                        k9Var.k(i13, MessagesController.getInstance(i13).getChat(Long.valueOf(-n4Var.f)));
                        n4Var.e = null;
                    }
                    n4Var.c(true);
                }
            }
        }
        if (yyVar.e0 != null) {
            int i14 = 0;
            while (true) {
                xy[] xyVarArr2 = yyVar.e0;
                if (i14 >= xyVarArr2.length) {
                    break;
                }
                ex exVar = xyVarArr2[i14].n;
                if (exVar != null) {
                    exVar.i();
                }
                i14++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = yyVar.actionBar;
        if (kVar != null) {
            kVar.E(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), true);
            yyVar.actionBar.F(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false, true);
            yyVar.actionBar.F(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true, true);
            yyVar.actionBar.G(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5), true);
            yyVar.actionBar.d();
        }
        if (yyVar.D3 != null) {
            yyVar.a5(UserConfig.getInstance(yyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.a3 a3Var = yyVar.M1;
        if (a3Var != null) {
            a3Var.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
        }
        org.telegram.ui.ActionBar.u0 u0Var = yyVar.m0;
        if (u0Var != null) {
            u0Var.setIconColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.v8));
        }
        ix ixVar = yyVar.B1;
        if (ixVar != null) {
            ixVar.d();
        }
        ww wwVar = yyVar.z0;
        if (wwVar != null) {
            dh.d dVar = wwVar.y0;
            if (dVar != null) {
                dVar.v();
            }
            wwVar.invalidate();
        }
        hg.r0 r0Var = yyVar.b0;
        if (r0Var != null) {
            r0Var.C1();
        }
        iy iyVar3 = yyVar.C0;
        if (iyVar3 != null) {
            SparseArray sparseArray = iyVar3.h;
            for (int i15 = 0; i15 < iyVar3.getChildCount(); i15++) {
                if (iyVar3.getChildAt(i15) instanceof c20) {
                    bi.o0 o0Var = ((c20) iyVar3.getChildAt(i15)).b;
                    int childCount3 = o0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt3 = o0Var.getChildAt(i16);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
            }
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                View view = (View) sparseArray.valueAt(i17);
                if (view instanceof c20) {
                    bi.o0 o0Var2 = ((c20) view).b;
                    int childCount4 = o0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = o0Var2.getChildAt(i18);
                        if (childAt4 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt4).b0(0, true);
                        }
                    }
                }
            }
            c20 c20Var = iyVar3.M0;
            if (c20Var != null) {
                bi.o0 o0Var3 = c20Var.b;
                int childCount5 = o0Var3.getChildCount();
                for (int i19 = 0; i19 < childCount5; i19++) {
                    View childAt5 = o0Var3.getChildAt(i19);
                    if (childAt5 instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt5).b0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.zh0 zh0Var = iyVar3.p0;
            if (zh0Var != null) {
                zh0Var.c();
            }
        }
        org.telegram.ui.Components.j91 j91Var = yyVar.a0;
        if (j91Var != null) {
            bi.o0 o0Var4 = j91Var.v;
            dh.d dVar2 = j91Var.r0;
            if (dVar2 != null) {
                dVar2.v();
            }
            j91Var.O.setColor(org.telegram.ui.ActionBar.g6.w0(j91Var.P, j91Var.j0));
            o0Var4.f1();
            o0Var4.invalidate();
            j91Var.invalidate();
        }
        c51 c51Var = yyVar.Z;
        if (c51Var != null) {
            c51Var.d();
        }
        di.ab abVar = yyVar.K0;
        if (abVar != null) {
            abVar.setForeground(new ColorDrawable(i0.a.k(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6), 100)));
        }
        org.telegram.ui.Components.l20 l20Var = yyVar.t0;
        if (l20Var != null) {
            l20Var.g();
        }
        org.telegram.ui.Components.l20 l20Var2 = yyVar.u0;
        if (l20Var2 != null) {
            l20Var2.g();
        }
        gh.c cVar = yyVar.n4;
        int i20 = org.telegram.ui.ActionBar.g6.d6;
        cVar.a(yyVar.getThemedColor(i20));
        org.telegram.ui.Components.xs xsVar = yyVar.J1;
        if (xsVar != null) {
            dh.d dVar3 = xsVar.s;
            if (dVar3 != null) {
                dVar3.v();
            }
            xsVar.invalidate();
        }
        org.telegram.ui.Components.ws wsVar = yyVar.K1;
        if (wsVar != null) {
            wsVar.setColor(org.telegram.ui.ActionBar.g6.x0(null, i20, false));
        }
        hx hxVar = yyVar.H1;
        if (hxVar != null) {
            hxVar.q();
        }
        hx hxVar2 = yyVar.F1;
        if (hxVar2 != null) {
            hxVar2.q();
        }
        yyVar.A4(yyVar.x1);
        px pxVar = yyVar.E0;
        if (pxVar != null) {
            pxVar.o();
        }
        Drawable drawable = yyVar.C3;
        if (drawable != null) {
            drawable.setColorFilter(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = yyVar.g1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            yyVar.g1.setBackground(org.telegram.ui.ActionBar.g6.g0(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
        }
        oy oyVar = yyVar.X;
        if (oyVar != null) {
            oyVar.d();
        }
    }

    public static void E0(yy yyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            ug.m1.f0(0, birthdayState);
            return;
        }
        yh.p1 p1Var = new yh.p1(yyVar.getParentActivity(), yyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        p1Var.W(true);
        yyVar.showDialog(p1Var);
    }

    public static void F0(yy yyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(yyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
            yyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.q.r(R.string.UnknownError, org.telegram.ui.Components.zc.a0(yyVar), R.raw.error, 36);
            return;
        }
        if (yyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity(), 0, yyVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            yyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void G0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        yyVar.R4();
    }

    public static void K2(yy yyVar, float f7) {
        float f10;
        float f11;
        float clamp = Utilities.clamp(yyVar.x1 * 2.0f, 1.0f, 0.0f);
        px pxVar = yyVar.E0;
        float f12 = (1.0f - yyVar.t3) * f7 * yyVar.H0;
        float f13 = 1.0f - clamp;
        pxVar.setAlpha(f12 * f13);
        if (yyVar.K || yyVar.M) {
            float clamp2 = Utilities.clamp((-yyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (yyVar.t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            yyVar.E0.setClipTop(0);
            if (yyVar.K || !yyVar.M) {
                yyVar.E0.setTranslationY(((yyVar.T / 2.0f) + (Math.max(yyVar.N, -yyVar.R3()) + yyVar.v3)) - AndroidUtilities.dp(8.0f));
                yyVar.E0.l(clamp2, !yyVar.F3.c());
                if (yyVar.M) {
                    f10 = 1.0f - clamp3;
                    yyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = yyVar.H0;
                }
            } else {
                yyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                yyVar.E0.setProgressToCollapse(1.0f);
                f11 = yyVar.H0;
            }
            f10 = 1.0f - f11;
            yyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (yyVar.L) {
                yyVar.E0.setTranslationY((Math.max(yyVar.N, -yyVar.R3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                yyVar.E0.setProgressToCollapse(1.0f);
                px pxVar2 = yyVar.E0;
                pxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - pxVar2.getY()));
            }
            f10 = 1.0f - yyVar.H0;
            yyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            yyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            yyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - yyVar.t3;
            yyVar.actionBar.getTitlesContainer().setAlpha(f15);
            yyVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        yyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        yyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        yyVar.actionBar.getTitlesContainer().setScaleY(f16);
        yyVar.actionBar.getTitlesContainer().setScaleX(f16);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - yyVar.t3) * f14;
        yyVar.actionBar.getTitlesContainer().setAlpha(f17);
        yyVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void L2(yy yyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (yyVar.parentLayout == null || yyVar.actionBar == null) {
            return;
        }
        float max = Math.max(yyVar.e.e, yyVar.S3());
        float f7 = 1.0f;
        float f10 = 1.0f - yyVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            f7 = 0.0f;
            i10 = -1;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (b5Var = yyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) b5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static org.telegram.ui.Cells.s2 N3(xy xyVar) {
        uy uyVar = xyVar.a;
        for (int i10 = 0; i10 < uyVar.getChildCount(); i10++) {
            View childAt = uyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var.P()) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void U(yy yyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        yyVar.R4();
    }

    public static /* synthetic */ void V(yy yyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        yyVar.t3 = floatValue;
        yyVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < yyVar.actionBar.getChildCount(); i10++) {
            if (yyVar.actionBar.getChildAt(i10).getVisibility() == 0 && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getActionMode() && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getBackButton()) {
                yyVar.actionBar.getChildAt(i10).setAlpha(1.0f - yyVar.t3);
            }
        }
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        yyVar.B3();
        yyVar.t3();
    }

    public static void W(yy yyVar) {
        ArrayList arrayList = yyVar.I2;
        org.telegram.ui.ActionBar.b5 b5Var = yyVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            yyVar.finishPreviewFragment();
            return;
        }
        if (yyVar.R0 != 10) {
            if (MessagesController.getInstance(yyVar.currentAccount).isFrozen()) {
                b.b(yyVar.currentAccount);
                return;
            } else {
                yyVar.presentFragment(new ContactsActivity(a1.g.h("destroyAfterSelect", true)));
                return;
            }
        }
        if (yyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        yyVar.C2.w(yyVar, arrayList2, null, false, yyVar.J2, yyVar.K2, yyVar.L2, null);
    }

    public static /* synthetic */ void X(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        yyVar.R4();
    }

    public static void Y(yy yyVar) {
        PasskeysActivity.a0(yyVar.currentAccount, yyVar.getParentActivity(), yyVar.resourceProvider, true);
    }

    public static /* synthetic */ void Z(yy yyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(yyVar.currentAccount).getClientUserId());
        yyVar.presentFragment(new fo(bundle));
    }

    public static /* synthetic */ void a0(yy yyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = yyVar.getMessagesController().getUserFull(yyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        yyVar.getMessagesController().invalidateContentSettings();
        yyVar.getConnectionsManager().sendRequest(updatebirthday, new fa(yyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        yyVar.R4();
    }

    public static void a4(fo foVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.q10[] q10VarArr = (org.telegram.ui.Components.q10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.q10.class);
                if (q10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(q10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(q10VarArr[0]);
                    for (int i10 = 1; i10 < q10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(q10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(q10VarArr[i10]);
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
                    foVar.qb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void b0(yy yyVar, String str) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, str);
        yyVar.R4();
    }

    public static void c0(yy yyVar, xy xyVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.n2) {
                yyVar.K4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (yyVar.F3()) {
            yyVar.l4(view, i10, 0.0f, xyVar.d);
            return;
        }
        int i12 = yyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            xyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle h = a1.g.h("forImport", true);
            h.putLongArray("result", new long[]{yyVar.getUserConfig().getClientUserId()});
            h.putInt("chatType", 4);
            String string = yyVar.arguments.getString("importTitle");
            if (string != null) {
                h.putString("title", string);
            }
            p70 p70Var = new p70(h);
            p70Var.Y = new cx(yyVar);
            yyVar.presentFragment(p70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = xyVar.s) == 7 || i11 == 8)) {
            hg.k kVar = (hg.k) xyVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = yyVar.getMessagesController().selectedDialogFilter[xyVar.s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.id;
                    org.telegram.ui.Components.o10 o10Var = new org.telegram.ui.Components.o10(yyVar, false);
                    o10Var.Y = -1;
                    o10Var.c0 = "";
                    o10Var.d0 = new ArrayList();
                    o10Var.f0 = "";
                    o10Var.h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    o10Var.i0 = arrayList;
                    o10Var.z0 = -1;
                    o10Var.C0 = -5;
                    o10Var.Y = i14;
                    o10Var.a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    o10Var.g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = yyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i14) {
                                o10Var.c0 = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    o10Var.T();
                    yyVar.showDialog(o10Var);
                    return;
                }
                return;
            }
        } else if (z10 && !yyVar.actionBar.t() && !yyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        yyVar.k4(view, i10, xyVar.d);
    }

    public static void c1(yy yyVar, boolean z10) {
        if (yyVar.e0 == null || yyVar.M3 == z10) {
            return;
        }
        yyVar.M3 = z10;
        int i10 = 0;
        while (true) {
            xy[] xyVarArr = yyVar.e0;
            if (i10 >= xyVarArr.length) {
                return;
            }
            if (z10) {
                xyVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            yyVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                yyVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static /* synthetic */ void d0(yy yyVar) {
        yyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(yyVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void e0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(yyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(yyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new fa(yyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static /* synthetic */ void f0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, yyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(yyVar.currentAccount).updateAttachMenuBotsInCache();
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
        AndroidUtilities.runOnUIThread(new gj(accountInstance, 19), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void h0(yy yyVar) {
        if (yyVar.a4.g()) {
            MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            yyVar.R4();
        }
    }

    public static /* synthetic */ void j0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        yyVar.R4();
    }

    public static /* synthetic */ void k0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        yyVar.R4();
    }

    public static void l0(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        bi.g gVar;
        try {
            a2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.g5.e0(yyVar.currentAccount, tL_error, yyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        yyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.g gVar2 = new bi.g(yyVar, j10, 25);
        Pattern pattern = org.telegram.ui.Components.g5.a;
        if (yyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = yyVar.getCurrentAccount();
            Activity parentActivity = yyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            k9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(parentActivity);
            z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(z9Var, w7.a6.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 48));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, w7.a6.a(-2.0f, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f, -1, (z10 ? 5 : 3) | 48));
            frameLayout.addView(textView, w7.a6.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
            if (user == null) {
                gVar = gVar2;
                k9Var.k(currentAccount, chat);
                z9Var.e(chat, k9Var);
            } else if (UserObject.isReplyUser(user)) {
                k9Var.p = 0.8f;
                k9Var.g(12);
                z9Var.h(null, null, k9Var, user);
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (user.id == clientUserId) {
                    k9Var.p = 0.8f;
                    k9Var.g(1);
                    z9Var.h(null, null, k9Var, user);
                } else {
                    k9Var.p = 1.0f;
                    k9Var.m(currentAccount, user);
                    z9Var.e(user, k9Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(gVar, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            yyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void m0(yy yyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.no0 no0Var = yyVar.C0.o0;
        if (i10 < no0Var.X || i10 >= no0Var.Y) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.l61 G = no0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity(), 0, yyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new gw(0, yyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void n0(yy yyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            yyVar.o4(arrayList, i10, false, false, null);
            return;
        }
        yyVar.getMessagesController().setDialogsInTransaction(true);
        yyVar.o4(arrayList, i10, false, false, z10 ? hashSet : null);
        yyVar.getMessagesController().setDialogsInTransaction(false);
        yyVar.getMessagesController().checkIfFolderEmpty(yyVar.V2);
        int i11 = yyVar.V2;
        if (i11 == 0 || yyVar.O3(yyVar.currentAccount, yyVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        yyVar.e0[0].a.setEmptyView(null);
        yyVar.e0[0].w.setVisibility(4);
        yyVar.finishFragment();
    }

    public static void n1(yy yyVar, xy xyVar, float f7) {
        if (yyVar.T == f7) {
            return;
        }
        yyVar.T = f7;
        if (f7 == 0.0f) {
            yyVar.U = false;
        }
        yyVar.E0.setOverscroll(f7);
        xyVar.a.setViewsOffset(f7);
        xyVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        yyVar.fragmentView.invalidate();
        if (f7 <= AndroidUtilities.dp(90.0f) || yyVar.U) {
            return;
        }
        px pxVar = yyVar.E0;
        ValueAnimator valueAnimator = pxVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            pxVar.i(pxVar.p0, true);
            yyVar.U = true;
            yyVar.getOrCreateStoryViewer().s(new uv(yyVar, 19));
        }
    }

    public static boolean o1(yy yyVar, xy xyVar) {
        if (yyVar.F3.c()) {
            return false;
        }
        int i10 = (int) (-yyVar.N);
        int Q3 = yyVar.Q3();
        int R3 = yyVar.R3();
        if (i10 == 0 || i10 == Q3 || i10 == R3 || !xyVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (R3 >= i10 || i10 >= Q3) {
            if ((yyVar.t3 != 1.0f ? Utilities.clamp((-yyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < yyVar.E0.B0) {
                xyVar.b.z(-i10);
                return true;
            }
            xyVar.b.z(R3 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - R3;
        if (i11 < dp / 2) {
            xyVar.b.z(-i11);
            return true;
        }
        xyVar.b.z(dp - i11);
        return true;
    }

    public static void p0(yy yyVar, int i10, org.telegram.ui.Components.m80 m80Var) {
        if (yyVar.currentAccount == i10) {
            return;
        }
        m80Var.u();
        if (yyVar.getParentActivity() == null) {
            return;
        }
        sy syVar = yyVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) yyVar.getParentActivity();
        ArrayList arrayList = yyVar.D2;
        String str = yyVar.E2;
        CharSequence charSequence = yyVar.F2;
        ix ixVar = yyVar.B1;
        CharSequence fieldText = ixVar != null ? ixVar.getFieldText() : null;
        launchActivity.K0(i10);
        yy yyVar2 = new yy(yyVar.arguments);
        yyVar2.C2 = syVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                yyVar2.B4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    yyVar2.F2 = null;
                } else {
                    yyVar2.F2 = charSequence;
                    yyVar2.E2 = null;
                    yyVar2.D2 = null;
                    if (yyVar2.B1 != null) {
                        yyVar2.i3(fieldText);
                    } else {
                        yyVar2.U3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            yyVar2.D2 = null;
        } else {
            yyVar2.D2 = arrayList;
            yyVar2.E2 = null;
            if (yyVar2.B1 != null) {
                yyVar2.i3(fieldText);
            } else {
                yyVar2.U3 = fieldText;
            }
        }
        launchActivity.q0(yyVar2, false, true);
    }

    public static String p2(yy yyVar) {
        ArrayList arrayList = yyVar.I2;
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
            if (longValue == yyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(yyVar.currentAccount, longValue) : DialogObject.getShortName(yyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static /* synthetic */ void q0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, yyVar.A3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        yyVar.R4();
    }

    public static void r0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            vj1.a(yyVar.getParentActivity(), new z(yyVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.C0(launchActivity, yyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static void s0(yy yyVar) {
        b.c(yyVar.getParentActivity(), yyVar.currentAccount, yyVar.getResourceProvider());
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final yy yyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        yyVar.Y3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                yyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = yyVar.V2) != 0 && yyVar.O3(yyVar.currentAccount, yyVar.e0[0].s, i13, false).size() == 1) {
            yyVar.e0[0].w.setVisibility(4);
        }
        yyVar.y3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            yyVar.x4(true, true);
            if (yyVar.R1 != null) {
                i12 = 0;
                while (i12 < yyVar.R1.size()) {
                    if (((TLRPC.Dialog) yyVar.R1.get(i12)).id == j10) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            yyVar.l3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView V3 = yyVar.V3();
        if (V3 != null) {
            V3.j(i10 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.hw
                @Override // java.lang.Runnable
                public final void run() {
                    yyVar.n4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(yyVar.O3(yyVar.currentAccount, yyVar.e0[0].s, yyVar.V2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i15)).id == j10) {
                i14 = i15;
                break;
            }
            i15++;
        }
        if (i10 == 102) {
            if (i11 < 0 || i14 >= 0 || (arrayList = yyVar.R1) == null) {
                yyVar.x4(false, true);
                return;
            }
            arrayList.remove(i11);
            yyVar.e0[0].x.D();
            yyVar.e0[0].q(true);
        }
    }

    public static void u0(yy yyVar) {
        BirthdayController.getInstance(yyVar.currentAccount).hide();
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        yyVar.R4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.zc.a0(yyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void v0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        yyVar.R4();
    }

    public static void w0(yy yyVar) {
        if (yyVar.N3) {
            di.d4 d4Var = yyVar.p0;
            if (d4Var != null) {
                d4Var.e(true);
            }
            bi.q8 o10 = MessagesController.getInstance(yyVar.currentAccount).getStoriesController().o();
            if (o10 != null && o10.a(yyVar.currentAccount, 1)) {
                yyVar.showDialog(new sg.j0(o10.b(), yyVar.currentAccount, yyVar.getParentActivity(), yyVar, null));
                return;
            } else {
                di.kc D = di.kc.D(yyVar.getParentActivity(), yyVar.currentAccount);
                D.x = new ey(yyVar, 4);
                D.Q(null);
                return;
            }
        }
        di.d4 d4Var2 = yyVar.q0;
        if (d4Var2 != null) {
            if (d4Var2.V) {
                return;
            } else {
                AndroidUtilities.removeFromParent(d4Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new nw(yyVar, 8));
        di.d4 d4Var3 = new di.d4(yyVar.getParentActivity(), 2);
        d4Var3.q(8.0f);
        d4Var3.d = 8000L;
        d4Var3.i();
        d4Var3.p(true);
        d4Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        d4Var3.s(replaceSingleTag);
        d4Var3.l(1.0f, -40.0f);
        d4Var3.h(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        yyVar.q0 = d4Var3;
        d4Var3.setTranslationY((-yyVar.f4) - yyVar.h4);
        ((ViewGroup) yyVar.fragmentView).addView(yyVar.q0, w7.a6.a(240.0f, 12.0f, 0.0f, 68.0f, 40.0f, -1, 87));
        yyVar.q0.u();
    }

    public static void x0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        yyVar.R4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.zc.a0(yyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static void y0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        yyVar.R4();
        org.telegram.ui.Components.sc J = org.telegram.ui.Components.zc.a0(yyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new uv(yyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void z0(yy yyVar) {
        try {
            ((org.telegram.ui.Components.yj0) ((org.telegram.ui.Components.k9) yyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (yyVar.a4 == null) {
            org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, true, true);
            yyVar.a4 = i50Var;
            i50Var.H = true;
            i50Var.a = yyVar;
            i50Var.b = new my(yyVar);
            yyVar.getMediaDataController().checkFeaturedStickers();
            yyVar.getMessagesController().loadSuggestedFilters();
            yyVar.getMessagesController().loadUserInfo(yyVar.getUserConfig().getCurrentUser(), true, yyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(yyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(yyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(yyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.vi viVar = yyVar.a4.c;
        if (viVar != null) {
            viVar.e1();
        }
        org.telegram.ui.Components.i50 i50Var2 = yyVar.a4;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        i50Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new uv(yyVar, 0), new vv(yyVar, 0), 0);
    }

    public final void A3() {
        String string = LocaleController.getString(S3() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.X.r.setContentDescription(string);
        this.X.r.setHint(string);
    }

    public final void A4(float f7) {
        this.x1 = f7;
        if (this.r3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.g6.v8 : org.telegram.ui.ActionBar.g6.O8);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.g6.y8;
            kVar.D(i0.a.d(this.x1, themedColor, getThemedColor(i10)), false);
            this.actionBar.D(i0.a.d(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
            this.actionBar.B(i0.a.d(this.x1, getThemedColor((this.V2 == 0 && this.X2 == 0) ? org.telegram.ui.ActionBar.g6.t8 : org.telegram.ui.ActionBar.g6.N8), getThemedColor(org.telegram.ui.ActionBar.g6.z8)), false);
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

    @Override // ng.b
    public final List B() {
        return Arrays.asList(new ng.a(LocaleController.getString(R.string.DebugDialogsActivity)), new ng.a(LocaleController.getString(R.string.ClearLocalDatabase), new uv(this, 28)), new ng.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new uv(this, 29)));
    }

    public final void B3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.s.a(((-this.N) - R3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
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

    @Override // ne.d
    public final void C(float f7, int i10) {
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 != 3 || (u0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) u0Var.getIconView().getDrawable();
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

    public final void C3() {
        if (this.Z != null) {
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f7);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.j91 j91Var = this.a0;
        ne.b bVar = this.s;
        if (j91Var != null) {
            float f10 = 1.0f - bVar.e;
            j91Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        hg.r0 r0Var = this.b0;
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
                px pxVar = this.E0;
                if (pxVar != null) {
                    pxVar.setTranslationX(f10);
                }
                oy oyVar = this.X;
                if (oyVar != null) {
                    oyVar.setTranslationX(f10);
                }
                sx sxVar = this.F3;
                if (sxVar == null || sxVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.F3.getFragmentView().setTranslationX(f10);
                return;
            }
            float f11 = -AndroidUtilities.dp(4.0f);
            float f12 = 1.0f - this.W3;
            float f13 = f11 * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            px pxVar2 = this.E0;
            if (pxVar2 != null) {
                pxVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            oy oyVar2 = this.X;
            if (oyVar2 != null) {
                oyVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            sx sxVar2 = this.F3;
            if (sxVar2 == null || sxVar2.getFragmentView() == null) {
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
        org.telegram.ui.Components.xs xsVar = this.J1;
        int c10 = measuredHeight + (xsVar != null ? (int) xsVar.c(AndroidUtilities.dp(7.0f)) : 0);
        iy iyVar = this.C0;
        SparseArray sparseArray = iyVar.h;
        iyVar.U0 = c10;
        iyVar.V0 = i10;
        bi.o0 o0Var = iyVar.V;
        if (z10) {
            o0Var.o1(0, c10, 0, i10);
        } else {
            o0Var.setPadding(0, c10, 0, i10);
        }
        iyVar.M0.j(iyVar.U0, iyVar.V0, z10);
        org.telegram.ui.Components.mo0 mo0Var = iyVar.W;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mo0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = iyVar.U0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != iyVar.V0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = iyVar.V0;
            mo0Var.requestLayout();
        }
        org.telegram.ui.Components.zo0.P(iyVar.f0, iyVar.i0, iyVar.U0, iyVar.V0, z10);
        org.telegram.ui.Components.zo0.P(iyVar.k0, iyVar.n0, iyVar.U0, iyVar.V0, z10);
        org.telegram.ui.Components.zo0.P(iyVar.r0, iyVar.u0, iyVar.U0, iyVar.V0, z10);
        org.telegram.ui.Components.zh0 zh0Var = iyVar.p0;
        int i13 = iyVar.U0;
        int i14 = iyVar.V0;
        zh0Var.setClipToPadding(false);
        org.telegram.ui.Components.h71 h71Var = zh0Var.c;
        zh0Var.J = z10;
        zh0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            h71Var.o1(0, i13, 0, i14);
        } else {
            h71Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) h71Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        zh0Var.J = false;
        org.telegram.ui.Components.yn0 yn0Var = iyVar.G0;
        if (yn0Var != null) {
            yn0Var.b(iyVar.U0, iyVar.V0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof c20) {
                ((c20) view).j(iyVar.U0, iyVar.V0, z10);
            }
        }
        for (int i16 = 0; i16 < iyVar.getChildCount(); i16++) {
            if (iyVar.getChildAt(i16) instanceof c20) {
                ((c20) iyVar.getChildAt(i16)).j(iyVar.U0, iyVar.V0, z10);
            }
        }
    }

    public final void D4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.k31(21, this, r0), new gj(r0, 18));
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(getParentActivity(), getResourceProvider());
        z2Var.c(y6Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
        e3Var.show();
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
        e3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
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
        long j10;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j11;
        int i10;
        LinearLayout linearLayout;
        yy yyVar;
        char c10;
        boolean[] zArr;
        MessagesController.DialogFilter dialogFilter;
        boolean[] zArr2;
        long j12;
        ?? r42;
        long j13;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        int i15;
        int i16;
        final long j14;
        int i17;
        org.telegram.ui.ActionBar.e1 e1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        char c11;
        final yy yyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(s2Var.g2);
        boolean z11 = false;
        if (!s2Var.O()) {
            long dialogId = s2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = s2Var.getMessageId();
            if (!DialogObject.isEncryptedDialog(dialogId)) {
                if (DialogObject.isUserDialog(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (yyVar2.X2 == 0 || ((b10 = gi.u0.b(yyVar2.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat chat = yyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (messageId == 0 || chat == null || chat.migrated_to == null) {
                        j10 = dialogId;
                    } else {
                        bundle.putLong("migrated_to", dialogId);
                        j10 = -chat.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -j10);
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                boolean z12 = yyVar2.X2 == 0 && yyVar2.getMessagesController().filtersEnabled && yyVar2.getMessagesController().dialogFiltersLoaded && yyVar2.getMessagesController().dialogFilters != null && yyVar2.getMessagesController().dialogFilters.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z12) {
                    LinearLayout linearLayout2 = new LinearLayout(yyVar2.getParentActivity());
                    linearLayout2.setOrientation(1);
                    ay ayVar = new ay(yyVar2.getParentActivity(), 0);
                    LinearLayout linearLayout3 = new LinearLayout(yyVar2.getParentActivity());
                    linearLayout3.setOrientation(1);
                    ayVar.addView(linearLayout3);
                    int size = yyVar2.getMessagesController().dialogFilters.size();
                    int i18 = 0;
                    org.telegram.ui.ActionBar.e1 e1Var2 = null;
                    while (i18 < size) {
                        final MessagesController.DialogFilter dialogFilter2 = yyVar2.getMessagesController().dialogFilters.get(i18);
                        if (dialogFilter2.isDefault()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            c11 = 'd';
                            i16 = size;
                            j14 = dialogId;
                        } else {
                            final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(yyVar2.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            i16 = size;
                            j14 = dialogId;
                            final ArrayList J = org.telegram.ui.Components.z00.J(yyVar2, dialogFilter2, arrayList, true, z11);
                            if (!includesDialog) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, yyVar2.getParentActivity(), null, false, false);
                            e1Var3.setChecked(includesDialog);
                            i17 = i16;
                            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, e1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, e1Var3.getTextView().getPaint().getFontMetricsInt());
                            e1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                            e1Var3.g(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.p10(yyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                            e1Var3.getTextView().setEmojiColor(yyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                            e1Var3.setMinimumWidth(160);
                            e1Var = e1Var3;
                            j14 = j14;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            e1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.qw
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j15;
                                    MessagesController.DialogFilter dialogFilter3;
                                    yy yyVar3 = yy.this;
                                    yyVar3.getClass();
                                    boolean z13 = includesDialog;
                                    ArrayList arrayList3 = J;
                                    MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                                    long j16 = j14;
                                    if (z13) {
                                        dialogFilter4.alwaysShow.remove(Long.valueOf(j16));
                                        dialogFilter4.neverShow.add(Long.valueOf(j16));
                                        l10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, yyVar3, null);
                                        yyVar3.V3().k(j16, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
                                    } else {
                                        if (arrayList3.isEmpty()) {
                                            arrayList2 = arrayList3;
                                            j15 = j16;
                                            dialogFilter3 = dialogFilter4;
                                        } else {
                                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                                dialogFilter4.neverShow.remove(arrayList3.get(i19));
                                            }
                                            dialogFilter4.alwaysShow.addAll(arrayList3);
                                            arrayList2 = arrayList3;
                                            dialogFilter3 = dialogFilter4;
                                            j15 = j16;
                                            l10.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, yyVar3, null);
                                        }
                                        yyVar3.V3().k(j15, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                                    }
                                    yyVar3.Y3(true);
                                    yyVar3.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(e1Var);
                            yyVar2 = this;
                            dialogId = j14;
                            size = i17;
                            i18 = i15 + 1;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            e1Var2 = e1Var;
                            z11 = false;
                        }
                        e1Var = e1Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        i17 = i16;
                        yyVar2 = this;
                        dialogId = j14;
                        size = i17;
                        i18 = i15 + 1;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        e1Var2 = e1Var;
                        z11 = false;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    j11 = dialogId;
                    org.telegram.ui.ActionBar.e1 e1Var4 = e1Var2;
                    i10 = 160;
                    if (e1Var4 != null) {
                        e1Var4.j(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        z12 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    } else {
                        View j1Var = new org.telegram.ui.ActionBar.j1(getParentActivity(), org.telegram.ui.ActionBar.g6.H8, getResourceProvider());
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        org.telegram.ui.ActionBar.e1 e1Var5 = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
                        e1Var5.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                        e1Var5.setMinimumWidth(160);
                        e1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 19));
                        linearLayout2.addView(e1Var5);
                        linearLayout2.addView(j1Var, w7.a6.n(-1, 8));
                        linearLayout2.addView(ayVar);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    j11 = dialogId;
                    i10 = 160;
                    linearLayout = null;
                }
                org.telegram.ui.ActionBar.m2[] m2VarArr = new org.telegram.ui.ActionBar.m2[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z12) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    org.telegram.ui.ActionBar.e1 e1Var6 = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
                    e1Var6.g(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
                    e1Var6.setMinimumWidth(i10);
                    e1Var6.setOnClickListener(new xv(2, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new mu(m2VarArr, 3));
                }
                if (isCommunity) {
                    yyVar = this;
                    c10 = 0;
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var7 = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
                    if (s2Var.getHasUnread()) {
                        e1Var7.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    } else {
                        e1Var7.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                    }
                    e1Var7.setMinimumWidth(i10);
                    long j15 = j11;
                    yy yyVar3 = this;
                    j11 = j15;
                    e1Var7.setOnClickListener(new ko(yyVar3, s2Var, j15, 4));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var7);
                    yyVar = yyVar3;
                }
                boolean[] zArr3 = new boolean[1];
                zArr3[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(j11);
                int i19 = yyVar.e0[c10].s;
                boolean z13 = (i19 == 7 || i19 == 8) && (!yyVar.actionBar.t() || yyVar.actionBar.u(null));
                if (z13) {
                    zArr = zArr3;
                    dialogFilter = yyVar.getMessagesController().selectedDialogFilter[yyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    zArr = zArr3;
                    dialogFilter = null;
                }
                if (yyVar.d4(dialog)) {
                    zArr2 = zArr;
                    j12 = j11;
                    r42 = 0;
                } else {
                    ArrayList<TLRPC.Dialog> dialogs = yyVar.getMessagesController().getDialogs(yyVar.V2);
                    int size2 = dialogs.size();
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        if (i20 >= size2) {
                            z10 = z13;
                            zArr2 = zArr;
                            j12 = j11;
                            break;
                        }
                        TLRPC.Dialog dialog2 = dialogs.get(i20);
                        z10 = z13;
                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            zArr2 = zArr;
                            j12 = j11;
                        } else if (yyVar.d4(dialog2)) {
                            zArr2 = zArr;
                            j12 = j11;
                            if (DialogObject.isEncryptedDialog(dialog2.id)) {
                                i22++;
                            } else {
                                i21++;
                            }
                        } else {
                            zArr2 = zArr;
                            j12 = j11;
                            if (!yyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                                break;
                            }
                        }
                        i20++;
                        zArr = zArr2;
                        j11 = j12;
                        z13 = z10;
                    }
                    if (dialog == null || yyVar.d4(dialog)) {
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j12);
                        int i23 = !isEncryptedDialog ? 1 : 0;
                        if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(j12))) {
                            i14 = i23;
                            i13 = isEncryptedDialog ? 1 : 0;
                            i12 = 0;
                        } else {
                            i14 = i23;
                            i13 = isEncryptedDialog ? 1 : 0;
                            i12 = 1;
                        }
                    }
                    int size3 = (!z10 || dialogFilter == null) ? (yyVar.V2 == 0 && dialogFilter == null) ? yyVar.getUserConfig().isPremium() ? yyVar.getMessagesController().maxPinnedDialogsCountPremium : yyVar.getMessagesController().maxPinnedDialogsCountDefault : yyVar.getUserConfig().isPremium() ? yyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : yyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
                    boolean z14 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
                    r42 = 0;
                    zArr2[0] = z14;
                }
                if (zArr2[r42]) {
                    org.telegram.ui.ActionBar.e1 e1Var8 = new org.telegram.ui.ActionBar.e1(yyVar.getParentActivity(), r42, r42);
                    if (yyVar.d4(dialog)) {
                        e1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
                    } else {
                        e1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
                    }
                    e1Var8.setMinimumWidth(160);
                    long j16 = j12;
                    j13 = j16;
                    e1Var8.setOnClickListener(new org.telegram.ui.Components.xr(yyVar, dialogFilter, dialog, j16, 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var8);
                } else {
                    j13 = j12;
                }
                if (DialogObject.isUserDialog(j13) && UserObject.isUserSelf(yyVar.getMessagesController().getUser(Long.valueOf(j13)))) {
                    i11 = 0;
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var9 = new org.telegram.ui.ActionBar.e1(yyVar.getParentActivity(), false, false);
                    if (yyVar.getMessagesController().isDialogMuted(j13, 0L)) {
                        e1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
                    } else {
                        e1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
                    }
                    e1Var9.setMinimumWidth(160);
                    e1Var9.setOnClickListener(new bi.p2(yyVar, j13, 2));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var9);
                }
                if (!isCommunity) {
                    org.telegram.ui.ActionBar.e1 e1Var10 = new org.telegram.ui.ActionBar.e1(yyVar.getParentActivity(), i11, true);
                    e1Var10.setIconColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                    int i24 = org.telegram.ui.ActionBar.g6.q7;
                    e1Var10.setTextColor(yyVar.getThemedColor(i24));
                    e1Var10.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, yyVar.getThemedColor(i24)));
                    e1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
                    e1Var10.setMinimumWidth(160);
                    e1Var10.setOnClickListener(new xv(3, yyVar, arrayList));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var10);
                }
                if (isCommunity) {
                    if (yyVar.n2 != null) {
                        yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                    }
                    yyVar.q4();
                    yyVar.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j13);
                    yy yyVar4 = new yy(bundle2);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        m2VarArr[0] = yyVar4;
                        yyVar.presentFragmentAsPreview(yyVar4);
                        return false;
                    }
                    m2VarArr[0] = yyVar4;
                    yyVar.presentFragmentAsPreviewWithMenu(yyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!yyVar.getMessagesController().checkCanOpenChat(bundle, yyVar)) {
                    return i11;
                }
                if (yyVar.n2 != null) {
                    yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                }
                yyVar.q4();
                yyVar.parentLayout.setHighlightActionButtons(true);
                fo foVar = new fo(bundle);
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    m2VarArr[0] = foVar;
                    yyVar.presentFragmentAsPreview(foVar);
                    return true;
                }
                m2VarArr[0] = foVar;
                yyVar.presentFragmentAsPreviewWithMenu(foVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                foVar.J9 = true;
                try {
                    foVar.a1.getAvatarImageView().performAccessibilityAction(64, null);
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
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new yx(this, z10, i10));
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
            iy iyVar = this.C0;
            if (iyVar != null) {
                iyVar.b0.R(this.W1, tLObject);
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
        AndroidUtilities.runOnUIThread(new nw(this, 10), 1000L);
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
        org.telegram.ui.Components.k31 k31Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.e1 e1Var;
        int i10;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, this.k0);
        int i12 = org.telegram.ui.ActionBar.g6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        float f10 = 64.0f;
        int i13 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new uv(this, 4), false);
                H.k();
            }
            H.i(new uv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new uv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (b4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new uv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new uv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var2 = this.resourceProvider;
        boolean a2 = c6Var2 != null ? c6Var2.a() : org.telegram.ui.ActionBar.g6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new uv(this, 11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new uv(this, 12), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new uv(this, 13), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(H);
        }
        if (getMessagesController().config.walletAvailable.get()) {
            H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new uv(this, 14), false);
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
                        yv yvVar = new yv(this, tL_attachMenuBot2, launchActivity2, 0);
                        org.telegram.ui.Components.k31 k31Var2 = new org.telegram.ui.Components.k31(20, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.c6 c6Var3 = H.d;
                        if (H.e != null) {
                            int i15 = org.telegram.ui.ActionBar.g6.F8;
                            int i16 = org.telegram.ui.ActionBar.g6.E8;
                            f7 = f10;
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, H.e, H.d, false, false);
                            e1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                            CharSequence a10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.r8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.g6.c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.k0;
                                    charSequence = a10;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.w0(i15, c6Var3), PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence = a10;
                                }
                                k31Var = k31Var2;
                                e1Var = e1Var2;
                                i11 = i16;
                                i10 = i15;
                                c6Var = c6Var3;
                                e1Var.h(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.z9 z9Var = e1Var.h;
                                if (z9Var != null) {
                                    z9Var.setLayoutParams(w7.a6.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                                }
                            } else {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                k31Var = k31Var2;
                                c6Var = c6Var3;
                                CharSequence charSequence2 = a10;
                                e1Var = e1Var2;
                                i10 = i15;
                                i11 = i16;
                                e1Var.g(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
                            Integer num3 = H.k0;
                            e1Var.c(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
                            Integer num4 = H.k0;
                            e1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
                            Integer num5 = H.l0;
                            e1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
                            e1Var.setOnClickListener(new org.telegram.ui.Components.rt(8, H, yvVar));
                            e1Var.setOnLongClickListener(new bi.g3(3, H, k31Var));
                            int i17 = H.S;
                            if (i17 > 0) {
                                e1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                                H.r(e1Var, w7.a6.n(H.S, -2));
                            } else {
                                H.r(e1Var, w7.a6.n(-1, -2));
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
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new uv(this, 6), false);
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.o0;
        if (e1Var3 != null) {
            e1Var3.b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ai));
            this.o0.setOnClickListener(new xv(0, this, H));
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
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
            this.g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            this.g1.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
            this.g1.setOnClickListener(new zv(this, 6));
            j10.addView(this.g1, w7.a6.q(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y8));
        j10.addView(this.h1, w7.a6.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new ci.d(2));
        this.k1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.m1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.j1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.u0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), w7.a6.n(5, -1));
        this.q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new iw(this, 1));
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
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new aw(this, 6));
                showDialog(alertDialog$Builder.a, new vv(this, 1));
                this.R3 = str;
                return;
            }
        }
    }

    public final void J3() {
        iy iyVar = this.C0;
        if ((iyVar != null && iyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        iy iyVar2 = new iy(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.V2, this.X2, new ey(this, 1));
        this.C0 = iyVar2;
        ((ry) this.fragmentView).addView(iyVar2, this.B0);
        iy iyVar3 = this.C0;
        iyVar3.b0.U = new ky(this);
        iyVar3.i0.setOnItemClickListener(new aw(this, 1));
        this.C0.n0.setOnItemClickListener(new aw(this, 2));
        this.C0.u0.setOnItemClickListener(new ew(this, 0));
        this.C0.n0.setOnItemLongClickListener(new aw(this, 3));
        this.C0.V.setOnItemClickListener(new aw(this, 4));
        this.C0.V.setOnItemLongClickListener(new ey(this, 2));
        this.C0.setFilteredSearchViewDelegate(new aw(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.p4);
    }

    public final void J4(long j10, View view) {
        f3(j10, view);
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!t10) {
            if (this.p3) {
                I3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    i2.d.v(false, this.actionBar);
                }
            } else {
                I3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
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
                        xy[] xyVarArr = this.e0;
                        if (i14 >= xyVarArr.length) {
                            break;
                        }
                        xyVarArr[i14].d.H = true;
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
                xy[] xyVarArr2 = this.e0;
                if (i16 >= xyVarArr2.length) {
                    break;
                }
                xy xyVar = xyVarArr2[i16];
                if (xyVar != null) {
                    xyVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.u3.addUpdateListener(new cw(this, max, i10));
            this.u3.addListener(new cy(this, max, c10 == true ? 1 : 0));
            this.u3.setInterpolator(org.telegram.ui.Components.es.f);
            this.u3.setDuration(200L);
            this.u3.start();
            ww wwVar = this.z0;
            if (wwVar != null) {
                wwVar.b(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.Fh, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.w8);
            }
            org.telegram.ui.ActionBar.f2 f2Var = this.e1;
            if (f2Var != null) {
                f2Var.c(1.0f, true);
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
                undoViewArr[i10] = new dy(this, parentActivity);
                FrameLayout.LayoutParams a2 = w7.a6.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83);
                a2.bottomMargin = this.f4 + this.h4 + a2.bottomMargin;
                ry ryVar = (ry) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                ryVar.addView(undoView, i11, a2);
            }
        }
    }

    public final void K4(long j10, View view) {
        int i10 = -this.L3;
        this.L3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.zc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.zc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new uv(this, 23))).j();
    }

    public final void L3(final long j10, final long j11, boolean z10, final lg1 lg1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (m3(j10)) {
            int i10 = this.R0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j10)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j10));
                    if (!user2.mutual_contact) {
                        UndoView V3 = V3();
                        if (V3 != null) {
                            V3.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView V32 = V3();
                        if (V32 != null) {
                            V32.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = chat2;
                    user = null;
                }
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new uw(this, a2Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    a2Var.q(300L);
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
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, lg1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, lg1Var, 14), 23);
                if (j10 < 0) {
                    N4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
                a2Var2.R = formatString;
                a2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new mu(i0Var, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.zg0(20));
                showDialog(a2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.q.m(getMessagesController(), j10).user_id));
                if (user5 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.f2, UserObject.getUserName(user5));
                string2 = LocaleController.getString(R.string.Send);
            } else if (!DialogObject.isUserDialog(j10)) {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat3 == null) {
                    return;
                }
                String str3 = chat3.title;
                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat3.id, j11)) != null) {
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
            } else if (j10 == getUserConfig().getClientUserId()) {
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.g2, LocaleController.getString(R.string.SavedMessages));
                string2 = LocaleController.getString(R.string.Send);
            } else {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (user6 == null || this.f2 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.f2, UserObject.getUserName(user6));
                string2 = LocaleController.getString(R.string.Send);
            }
            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.a;
            a2Var3.R = str;
            a2Var3.T = AndroidUtilities.replaceTags(str2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.vw
                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.a2 a2Var4, int i12) {
                    yy.this.L3(j10, j11, false, lg1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(a2Var3) == null) {
                a2Var3.show();
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
        iy iyVar;
        iy iyVar2;
        px pxVar;
        iy iyVar3;
        boolean z14;
        iy iyVar4;
        boolean z15;
        org.telegram.ui.Components.j91 j91Var;
        TLRPC.Chat chat;
        sx sxVar;
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
        int i12 = 1;
        if (z10) {
            if (!this.s3 && !z13) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.l2 || (totalDialogsCount <= 10 && !this.K)) {
                    z14 = true;
                    iyVar4 = this.C0;
                    if (iyVar4 != null) {
                        iyVar4.O0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.r3 = z15;
                    if (z15) {
                        this.s3 = true;
                    }
                    j91Var = this.a0;
                    if (j91Var != null && iyVar4 != null && !z14 && this.X2 == 0) {
                        org.telegram.ui.Components.j91 n10 = iyVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, w7.a6.e(-1, -1, 119));
                    } else if (this.Z != null && z14 && this.X2 == 0) {
                        AndroidUtilities.removeFromParent(j91Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        D3(false);
                        this.C0.setKeyboardHeight(((ry) this.fragmentView).getKeyboardHeight());
                        iy iyVar5 = this.C0;
                        iyVar5.A0.clear();
                        iyVar5.J();
                    }
                    chat = this.Y2;
                    if (chat == null) {
                        hg.p0 p0Var = new hg.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        p0Var.f = this.Y2;
                        g3(p0Var);
                    } else if (this.V2 != 0 && ((sxVar = this.F3) == null || !sxVar.c())) {
                        g3(new hg.p0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z14 = false;
            iyVar4 = this.C0;
            if (iyVar4 != null) {
            }
            if (z14) {
            }
            this.r3 = z15;
            if (z15) {
            }
            j91Var = this.a0;
            if (j91Var != null) {
            }
            if (this.Z != null) {
                AndroidUtilities.removeFromParent(j91Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Y2;
            if (chat == null) {
            }
        }
        if (z16 && (iyVar3 = this.C0) != null && iyVar3.b0.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (pxVar = this.E0) != null && this.G0) {
            pxVar.setVisibility(0);
        }
        Object[] objArr = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                iy iyVar6 = this.C0;
                if (iyVar6 != null) {
                    iyVar6.setVisibility(0);
                    iy iyVar7 = this.C0;
                    iyVar7.setPosition(0);
                    if (iyVar7.b0.h() > 0) {
                        iyVar7.c0.h1(0, 0);
                    }
                    s4.b0 b0Var = iyVar7.h0;
                    if (b0Var != null) {
                        b0Var.h1(0, 0);
                    }
                    s4.b0 b0Var2 = iyVar7.m0;
                    if (b0Var2 != null) {
                        b0Var2.h1(0, 0);
                    }
                    s4.b0 b0Var3 = iyVar7.t0;
                    if (b0Var3 != null) {
                        b0Var3.h1(0, 0);
                    }
                    iyVar7.h.clear();
                }
                T4(true, null, null, false, false);
                org.telegram.ui.Components.j91 j91Var2 = this.a0;
                if (j91Var2 != null) {
                    j91Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            x4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            iy iyVar8 = this.C0;
            if (iyVar8 != null) {
                iyVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            xy xyVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(xyVar, (Property<xy, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<xy, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<xy, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            sx sxVar2 = this.F3;
            if (sxVar2 != null) {
                sxVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.F3, (Property<sx, Float>) property, z10 ? 0.0f : 1.0f));
            }
            iy iyVar9 = this.C0;
            if (iyVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(iyVar9, (Property<iy, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.K) {
                    float dp = AndroidUtilities.dp(81.0f) + this.N + AndroidUtilities.dp(48.0f);
                    iy iyVar10 = this.C0;
                    float f7 = z10 ? dp : 0.0f;
                    if (z10) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(iyVar10, this.H3, f7, dp));
                }
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<iy, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<iy, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                W4(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new wv(this, i12));
            arrayList.add(ofFloat);
            this.w1.playTogether(arrayList);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.es.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new yx(this, z10, i10));
            this.o3.lock();
            this.w1.start();
        } else {
            x4(false, true);
            if (z10) {
                this.e0[0].a.c1();
            } else {
                uy uyVar = this.e0[0].a;
                if (uyVar.g1) {
                    uyVar.g1 = false;
                    uyVar.K0(false);
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
            iy iyVar11 = this.C0;
            if (iyVar11 != null) {
                iyVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            oy oyVar = this.X;
            if (oyVar != null) {
                oyVar.setTranslationY(T3() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
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
        int i13 = this.x;
        if (i13 >= 0 && (iyVar2 = this.C0) != null) {
            iyVar2.setPosition(iyVar2.L(i13));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (iyVar = this.C0) != null) {
            iyVar.setPosition((iyVar.q0 ? 1 : 0) + 5);
            Z4(true);
        }
        C3();
        R4();
    }

    public final void M3(long j10, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            xy[] xyVarArr = this.e0;
            if (i10 >= xyVarArr.length) {
                return;
            }
            int childCount = xyVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.s2) {
                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                        if (s2Var.getDialogId() == j10) {
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
        i71[] i71VarArr = new i71[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
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
        tx txVar = new tx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), i71VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            txVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l4 = this.B3;
        if (l4 != null) {
            txVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.D3.f[0];
            txVar.setSelected(drawable2 instanceof org.telegram.ui.Components.s5 ? Long.valueOf(((org.telegram.ui.Components.s5) drawable2).i()) : null);
        }
        txVar.setSaveState(1);
        txVar.y(this.D3, titleTextView);
        ux uxVar = new ux(this, txVar);
        this.M0 = uxVar;
        i71VarArr[0] = uxVar;
        uxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        i71VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.m2, org.telegram.ui.yy] */
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
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = formatString2;
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
                org.telegram.ui.Cells.d0.s(isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.d0.s(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
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
        a2Var.T = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new tf(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new tf(i10, runnable2));
        showDialog(a2Var);
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
                arrayList2.add(new ty(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.v2) {
                arrayList2.add(new ty(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.y2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.v2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new ty(2));
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
                        long j10 = user2.id;
                        tL_peerUser.user_id = j10;
                        tL_dialog.id = j10;
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
        xy[] xyVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            xyVarArr = this.e0;
            if (i11 >= xyVarArr.length) {
                break;
            }
            xyVarArr[i11].a.B0();
            i11++;
        }
        char c10 = (!z10 || xyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = xyVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.e0[c10].h);
        if (dialogFilter.isDefault()) {
            xy xyVar = this.e0[c10];
            xyVar.s = this.R0;
            uy uyVar = xyVar.a;
            int i13 = uy.t3;
            uyVar.B1();
        } else {
            xy[] xyVarArr2 = this.e0;
            if (xyVarArr2[c10 ^ 1].s == 7) {
                xyVarArr2[c10].s = 8;
            } else {
                xyVarArr2[c10].s = 7;
            }
            xyVarArr2[c10].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.e0[c10].s == 8 ? 1 : 0);
        }
        xy[] xyVarArr3 = this.e0;
        if (xyVarArr3.length > 1) {
            xyVarArr3[1].E = dialogFilter.locked;
        }
        xy xyVar2 = xyVarArr3[c10];
        fx fxVar = xyVar2.d;
        fxVar.h = xyVar2.s;
        fxVar.l();
        xy xyVar3 = this.e0[c10];
        bx bxVar = xyVar3.c;
        if (xyVar3.s == 0 && W3() && this.e0[c10].v == 2) {
            i10 = 1;
        }
        bxVar.h1(i10, (int) this.N);
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
        c51 c51Var = this.Z;
        float measuredHeight = (c51Var == null || c51Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float dp = this.K ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.K) {
            float f16 = this.N;
            float f17 = this.x1;
            f7 = (measuredHeight * f17) + com.google.android.gms.internal.play_billing.k3.y(1.0f, f17, dp, f16);
            f10 = this.w3;
        } else {
            f7 = (measuredHeight * this.x1) + this.N;
            f10 = this.w3;
        }
        float f18 = f7 + f10 + this.T;
        oy oyVar = this.X;
        float dp2 = AndroidUtilities.dp(4.0f) * ((oyVar == null || oyVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        ww wwVar = this.z0;
        if (wwVar != null) {
            wwVar.setTranslationY(f18 - dp2);
            f12 = this.z0.getAlpha();
            f13 = AndroidUtilities.dp(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.xs xsVar = this.J1;
        if (xsVar != null) {
            xsVar.setTranslationY(AndroidUtilities.lerp(f11 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.a0 == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.ws wsVar = this.K1;
        if (wsVar != null) {
            wsVar.setTranslationY(f18 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f14, f12));
            org.telegram.ui.Components.ws wsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f15 + f13) - lerp);
            Matrix matrix = wsVar2.b;
            if (wsVar2.e != lerp || wsVar2.f != min) {
                wsVar2.e = lerp;
                wsVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = wsVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                wsVar2.invalidate();
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
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        ww wwVar;
        org.telegram.ui.Components.s00 d;
        long j10;
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
                j10 = clientUserId;
            } else {
                long j11 = dialog.id;
                boolean d42 = d4(dialog);
                j10 = clientUserId;
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().isForum(j11)) {
                    this.T2++;
                }
                int i17 = i14;
                int i18 = i15;
                if (getMessagesController().isDialogMuted(j11, 0L)) {
                    this.P2++;
                } else {
                    this.O2++;
                }
                if (z12) {
                    this.M2++;
                }
                if (this.V2 == 1 || dialog.folder_id == 1) {
                    this.S2++;
                } else if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().isPromoDialog(j11, false)) {
                    i14 = i17 + 1;
                    if (dialog.community_id != 0) {
                        i12++;
                    }
                    if (DialogObject.isUserDialog(j11) || j11 == j10 || j11 == UserObject.VERIFY || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j11)))) {
                        i16++;
                    } else if (org.telegram.messenger.q.x("dialog_bar_report", j11, notificationsSettings, true)) {
                        this.R2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.q.m(getMessagesController(), dialog.id);
                            user = m10 != null ? getMessagesController().getUser(Long.valueOf(m10.user_id)) : new TLRPC.TL_userEmpty();
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
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j11));
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
                if (DialogObject.isUserDialog(j11)) {
                }
                i16++;
                if (DialogObject.isChannel(dialog)) {
                }
                i13++;
                i11++;
            }
            i10++;
            clientUserId = j10;
        }
        int i19 = i14;
        int i20 = i15;
        org.telegram.ui.ActionBar.u0 u0Var3 = this.j1;
        if (u0Var3 != null) {
            if (i11 != size || i12 > 0) {
                u0Var3.setVisibility(8);
            } else {
                u0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = this.r1;
        if (e1Var2 != null) {
            int i21 = this.Q2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                e1Var2.setVisibility(0);
                if (this.Q2 != 0) {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                e1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.q1;
        if (e1Var3 != null && this.m1 != null) {
            if (this.S2 != 0 && i12 == 0 && this.X2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.q1.g(string, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(string);
                ww wwVar2 = this.z0;
                if (wwVar2 == null || wwVar2.getVisibility() != 0) {
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
                ww wwVar3 = this.z0;
                if (wwVar3 == null || wwVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                e1Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var4 = this.k1;
        if (u0Var4 != null && this.n1 != null) {
            if (this.N2 + i20 == size && this.X2 == 0) {
                ww wwVar4 = this.z0;
                if (wwVar4 == null || wwVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                u0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.t1;
        if (e1Var4 != null) {
            if (i16 != 0) {
                e1Var4.setVisibility(8);
            } else {
                e1Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            ww wwVar5 = this.z0;
            boolean z13 = wwVar5 == null || wwVar5.getVisibility() != 0 || ((d = (wwVar = this.z0).d()) != null && d.a == wwVar.L);
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
                            ww wwVar6 = this.z0;
                            org.telegram.ui.Components.s00 d10 = wwVar6.d();
                            if (d10 != null && d10.a == wwVar6.L) {
                                int i22 = org.telegram.ui.Components.z00.w;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i23 = 0; i23 < size2; i23++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                                    if (!org.telegram.ui.Components.z00.J(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                                        arrayList2.add(dialogFilter);
                                    }
                                }
                            }
                        }
                        this.o1.setVisibility(8);
                    }
                    this.o1.setVisibility(0);
                }
                u0Var = this.l1;
                if (u0Var != null) {
                    if (this.P2 != 0) {
                        u0Var.setIcon(R.drawable.msg_unmute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    } else {
                        u0Var.setIcon(R.drawable.msg_mute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                    }
                }
                e1Var = this.s1;
                if (e1Var != null) {
                    if (this.M2 != 0) {
                        e1Var.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                        this.s1.setVisibility(0);
                    } else if (this.T2 == 0 && i12 == 0) {
                        e1Var.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                        this.s1.setVisibility(0);
                    } else {
                        e1Var.setVisibility(8);
                    }
                }
                u0Var2 = this.k1;
                if (u0Var2 != null || this.n1 == null) {
                }
                if (this.N2 != 0) {
                    u0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(LocaleController.getString(R.string.PinToTop));
                    this.n1.setText(LocaleController.getString(R.string.DialogPin));
                    return;
                } else {
                    u0Var2.setIcon(R.drawable.msg_unpin);
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
        u0Var = this.l1;
        if (u0Var != null) {
        }
        e1Var = this.s1;
        if (e1Var != null) {
        }
        u0Var2 = this.k1;
        if (u0Var2 != null) {
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
        long j10;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        ApplicationLoader applicationLoader;
        boolean z13;
        String next;
        StringBuilder sb2;
        final long j11;
        final long j12;
        boolean z14;
        sx sxVar;
        boolean z15;
        sx sxVar2;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.a3 a3Var = this.M1;
        final int i10 = 0;
        if (a3Var != null) {
            try {
                ((org.telegram.ui.Components.yj0) ((org.telegram.ui.Components.k9) a3Var.h.getImageReceiver().getStaticThumb()).B).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.a3 a3Var2 = this.M1;
            a3Var2.setCompact(false);
            a3Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.z9 z9Var = a3Var2.h;
            z9Var.setVisibility(8);
            z9Var.b();
        }
        long j13 = 0;
        final int i11 = 1;
        if (isInPreviewMode()) {
            str = null;
            z12 = false;
        } else {
            if (getMessagesController().isFrozen()) {
                this.M1.setOnClickListener(new zv(this, 12));
                this.M1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i12 = 5;
                if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new zv(this, 19));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.M1.c, new nw(this, i12)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.M1.setOnCloseListener(new zv(this, 24));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new zv(this, 25));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.M1.c, new nw(this, i12)), LocaleController.getString(R.string.GraceMessage));
                    this.M1.setOnCloseListener(new zv(this, 26));
                } else if (this.V2 == 0 && this.X2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.M1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt()));
                    this.M1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rw
                        public final /* synthetic */ yy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    pf.d.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    yy.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rw
                        public final /* synthetic */ yy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    pf.d.s(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    yy.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.V2 == 0 && this.X2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        zh.n5 y3 = zh.n5.y(this.currentAccount, false);
                        ArrayList arrayList = y3.z;
                        if (!arrayList.isEmpty()) {
                            long j14 = -y3.f.amount;
                            int i13 = 0;
                            while (i13 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i13);
                                long j15 = j13;
                                long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
                                if (peerDialogId >= j15) {
                                    if (getMessagesController().getUser(Long.valueOf(peerDialogId)) == null) {
                                        i13++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i13++;
                                    j13 = j15;
                                } else {
                                    if (getMessagesController().getChat(Long.valueOf(-peerDialogId)) == null) {
                                        i13++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i13++;
                                    j13 = j15;
                                }
                            }
                            j10 = j13;
                            if (j14 > j10) {
                                zh.n5 y10 = zh.n5.y(this.currentAccount, false);
                                ArrayList arrayList2 = y10.z;
                                StringBuilder sb3 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb2 = sb3;
                                    j11 = j10;
                                    j12 = j11;
                                } else {
                                    int i14 = 0;
                                    long j16 = j10;
                                    j12 = j16;
                                    while (i14 < arrayList2.size()) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i14);
                                        int i15 = i10;
                                        long peerDialogId2 = DialogObject.getPeerDialogId(starsSubscription2.peer);
                                        if (j12 == j10) {
                                            j12 = peerDialogId2;
                                        }
                                        if (peerDialogId2 >= j10) {
                                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerDialogId2));
                                            if (user != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(UserObject.getUserName(user));
                                                j16 += starsSubscription2.pricing.amount;
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
                                                j16 += starsSubscription2.pricing.amount;
                                                i14++;
                                                i10 = i15;
                                            } else {
                                                i14++;
                                                i10 = i15;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j11 = j16;
                                }
                                boolean z16 = i10;
                                final String sb4 = sb2.toString();
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.sw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        yy yyVar = yy.this;
                                        new zh.e7(yyVar.getParentActivity(), yyVar.getResourceProvider(), j11, 2, sb4, new uv(yyVar, 17), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.a3 a3Var3 = this.M1;
                                long j17 = j11 - y10.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z16 ? 1 : 0] = sb4;
                                a3Var3.b(zh.p7.Y0(z16, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j11, objArr), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.M1.setOnCloseListener(new zv(this, 13));
                                z12 = true;
                                str = null;
                            }
                            if (this.V2 != 0 && this.X2 == j10 && !getMessagesController().premiumPurchaseBlocked() && BirthdayController.getInstance(this.currentAccount).contains() && !getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                ArrayList<TLRPC.User> arrayList3 = state.today;
                                this.M1.setOnClickListener(new xv(4, this, state));
                                this.M1.a(this.currentAccount, arrayList3);
                                this.M1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList3.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList3.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList3.size(), new Object[0]), org.telegram.ui.ActionBar.g6.I6, 2, null), this.M1.c, new nw(this, i12)), LocaleController.formatString(arrayList3.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.M1.setOnCloseListener(new zv(this, 14));
                                zh.n5.y(this.currentAccount, false).V();
                            } else if (this.V2 != 0 && this.X2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                this.M1.setOnClickListener(new zv(this, 15));
                                this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.M1.c, new nw(this, i12)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                this.M1.setOnCloseListener(new zv(this, 16));
                            } else {
                                if ((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false) {
                                    if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                        this.M1.setOnClickListener(new zv(this, 18));
                                        this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                    } else {
                                        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.V2 != 0 || this.X2 != j10 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null : !(BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null)))) {
                                            z10 = false;
                                        } else {
                                            this.A3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                            z10 = true;
                                        }
                                        int i16 = 20;
                                        if (z10) {
                                            this.M1.setOnClickListener(new zv(this, i16));
                                            this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.A3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(this.A3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                        } else {
                                            if (this.O1 != null && this.P1 != null) {
                                                if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                                    MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                                } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j10)) {
                                                    z11 = true;
                                                    if (!z11) {
                                                        this.M1.setOnClickListener(new zv(this, 21));
                                                        this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.O1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                    } else if (this.V2 == 0 && this.X2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                        this.M1.setOnClickListener(new zv(this, 22));
                                                        this.M1.h.setVisibility(0);
                                                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                                                        k9Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                        long clientUserId = getUserConfig().getClientUserId();
                                                        k9Var.A = true;
                                                        k9Var.b = true;
                                                        k9Var.c = false;
                                                        int i17 = org.telegram.ui.ActionBar.g6.p8[org.telegram.ui.Components.k9.e(clientUserId)];
                                                        org.telegram.ui.ActionBar.c6 c6Var = k9Var.z;
                                                        k9Var.d = org.telegram.ui.ActionBar.g6.w0(i17, c6Var);
                                                        k9Var.e = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q8[org.telegram.ui.Components.k9.e(clientUserId)], c6Var);
                                                        k9Var.n = 0;
                                                        k9Var.m = false;
                                                        org.telegram.ui.Components.k9.a("", "", "", k9Var.q);
                                                        k9Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                        this.M1.h.setImageDrawable(k9Var);
                                                        this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.M1.c, new nw(this, i12)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                        this.M1.setOnCloseListener(new zv(this, 23));
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
                                                                this.M1.setOnClickListener(new a(next, i16));
                                                                org.telegram.ui.Cells.a3 a3Var4 = this.M1;
                                                                CharSequence charSequence = charSequenceArr[0];
                                                                if (charSequence instanceof String) {
                                                                    str = null;
                                                                    charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                } else {
                                                                    str = null;
                                                                }
                                                                CharSequence charSequence2 = charSequenceArr[1];
                                                                if (charSequence2 instanceof String) {
                                                                    charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                                }
                                                                a3Var4.b(charSequence, charSequence2);
                                                                if (zArr[0] && next != null) {
                                                                    this.M1.setOnCloseListener(new xv(i12, this, next));
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
                                    int i18 = 17;
                                    this.M1.setOnClickListener(new ah.f(i18));
                                    this.M1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                    this.M1.setOnCloseListener(new zv(this, i18));
                                }
                            }
                            z12 = true;
                            str = null;
                        } else if (!y3.A) {
                            y3.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new zh.p4(y3, i10));
                        }
                    }
                    j10 = 0;
                    if (this.V2 != 0) {
                    }
                    if (this.V2 != 0) {
                    }
                    if ((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.V2 == 0 && this.X2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false) {
                    }
                    z12 = true;
                    str = null;
                }
            }
            str = null;
            z12 = true;
        }
        sx sxVar3 = this.F3;
        ne.b bVar = this.b;
        if ((sxVar3 != null && sxVar3.c()) || bVar.f) {
            z12 = false;
        }
        this.J1.i(this.M1, z12, true);
        n3(true);
        if (this.fragmentView == null || this.J1 == null) {
            z14 = false;
        } else {
            boolean z17 = !isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((sxVar2 = this.F3) == null || !sxVar2.c()) && !bVar.f;
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
                    StringBuilder u10 = a1.g.u(str2);
                    u10.append(unconfirmedAuth.location);
                    String sb5 = u10.toString();
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
        boolean z18 = (!isInPreviewMode() && this.V2 == 0 && this.X2 == 0 && this.R0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((sxVar = this.F3) == null || !sxVar.c()) && !bVar.f) ? true : z14;
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

    @Override // org.telegram.ui.ActionBar.m2, org.telegram.ui.jh0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        sx sxVar;
        di.ab abVar;
        ww wwVar;
        if (!this.p3 && (((sxVar = this.F3) == null || !sxVar.c()) && (((abVar = this.K0) == null || abVar.getVisibility() != 0) && ((wwVar = this.z0) == null || !wwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ww wwVar2 = this.z0;
                boolean z11 = wwVar2 == null || wwVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                ww wwVar3 = this.z0;
                boolean z12 = wwVar3 == null || wwVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
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
        sx sxVar = this.F3;
        if (sxVar == null || !sxVar.c()) {
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
        sx sxVar = this.F3;
        if (sxVar == null || !sxVar.c()) {
            org.telegram.ui.Components.m80 m80Var = this.L0;
            if (m80Var != null) {
                m80Var.u();
                this.L0 = null;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            ne.b bVar = this.r;
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
                        fx fxVar = this.e0[0].d;
                        fxVar.h = 0;
                        fxVar.l();
                        xy xyVar = this.e0[0];
                        xyVar.s = this.R0;
                        xyVar.d.l();
                    }
                    this.e0[1].setVisibility(8);
                    xy xyVar2 = this.e0[1];
                    xyVar2.h = 0;
                    fx fxVar2 = xyVar2.d;
                    fxVar2.h = 0;
                    fxVar2.l();
                    xy xyVar3 = this.e0[1];
                    xyVar3.s = this.R0;
                    xyVar3.d.l();
                    this.w = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.Q3 != null) ? false : z11;
                        if (!this.p3) {
                            bVar.a(false, z16);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        xy[] xyVarArr = this.e0;
                        if (i10 >= xyVarArr.length) {
                            break;
                        }
                        xy xyVar4 = xyVarArr[i10];
                        if (xyVar4.s == 0 && xyVar4.v == 2 && W3() && ((L0 = this.e0[i10].c.L0()) == 0 || L0 == 1)) {
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
                ww wwVar = this.z0;
                wwVar.h.clear();
                wwVar.j0.clear();
                wwVar.l0.clear();
                wwVar.m0.clear();
                wwVar.n0.clear();
                wwVar.o0.clear();
                wwVar.M = 0;
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
                            ww wwVar2 = this.z0;
                            if (wwVar2.h(wwVar2.k0.get(currentTabId, -1))) {
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
                    xy[] xyVarArr2 = this.e0;
                    if (i12 >= xyVarArr2.length) {
                        break;
                    }
                    if (xyVarArr2[i12].h >= dialogFilters.size()) {
                        this.e0[i12].h = dialogFilters.size() - 1;
                    }
                    this.e0[i12].a.setScrollingTouchSlop(1);
                    i12++;
                }
                ww wwVar3 = this.z0;
                wwVar3.F.setItemAnimator(z17 ? wwVar3.s0 : null);
                wwVar3.I.l();
                if (isEmpty) {
                    O4(z19);
                }
                ww wwVar4 = this.z0;
                int currentTabId2 = wwVar4.getCurrentTabId();
                ArrayList arrayList = wwVar4.h;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.s00) arrayList.get(i13)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.s00) arrayList.get(i13)).f;
                            break;
                        }
                        i13++;
                    }
                }
                if (z12) {
                    ww wwVar5 = this.z0;
                    ArrayList arrayList2 = wwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        wwVar5.f((org.telegram.ui.Components.s00) arrayList2.get(0), 0);
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
        iy iyVar;
        boolean z13;
        org.telegram.ui.Components.j91 j91Var;
        if (!this.p3 || this.l2 || (iyVar = this.C0) == null) {
            return;
        }
        ArrayList<hg.p0> currentSearchFilters = iyVar.getCurrentSearchFilters();
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
                j91Var = this.a0;
                if (j91Var != null) {
                    j91Var.b(z13, true);
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
        j91Var = this.a0;
        if (j91Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    public final bi.x8 U3() {
        return getMessagesController().getStoriesController();
    }

    public final void U4() {
        float f7 = (((-this.f4) - this.i4) - this.u1) - this.v1;
        org.telegram.ui.Components.l20 l20Var = this.t0;
        if (l20Var != null) {
            l20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.l20 l20Var2 = this.u0;
        if (l20Var2 != null) {
            l20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            di.d4 d4Var = this.p0;
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
            ry ryVar = (ry) this.fragmentView;
            ryVar.removeView(undoViewArr[0]);
            ryVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void V4(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.T3;
        org.telegram.ui.Components.l20 l20Var = this.t0;
        if (l20Var != null) {
            l20Var.e(z12, z10);
        }
        org.telegram.ui.Components.l20 l20Var2 = this.u0;
        if (l20Var2 != null) {
            l20Var2.e(z12, z10);
        }
    }

    public final boolean W3() {
        return !this.l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void W4(boolean z10, boolean z11) {
        boolean z12;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.u0 u0Var = this.m0;
            if (u0Var == null || u0Var.getVisibility() != 0) {
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
        org.telegram.ui.Components.or0 or0Var;
        ix ixVar = this.B1;
        ArrayList arrayList = this.I2;
        if (ixVar == null) {
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
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.es.h);
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
                if (!this.V3 && (or0Var = this.G2) != null) {
                    this.V3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    or0Var.j();
                    or0Var.F = string2;
                    org.telegram.ui.Components.mr0 mr0Var = or0Var.a[0];
                    if (string2 != null) {
                        mr0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.lr0 lr0Var = new org.telegram.ui.Components.lr0(or0Var, 0);
                    or0Var.G = lr0Var;
                    AndroidUtilities.runOnUIThread(lr0Var, 1000L);
                }
            }
            this.C1.g(Math.max(1, arrayList.size()), true);
            int i10 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i11 = 0;
            long j10 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long longValue = ((Long) obj).longValue();
                long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                if (sendPaidMessagesStars <= 0 && longValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                }
                j10 += sendPaidMessagesStars;
            }
            this.C1.i(i10, j10, true);
            this.B1.Q1();
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.es.h);
            }
        }
        this.P3 = arrayList.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y3(boolean z10) {
        boolean z11;
        this.actionBar.s();
        this.I2.clear();
        org.telegram.ui.ActionBar.f2 f2Var = this.e1;
        int i10 = 1;
        if (f2Var != null) {
            f2Var.c(0.0f, true);
        }
        ww wwVar = this.z0;
        if (wwVar != null) {
            wwVar.b(org.telegram.ui.ActionBar.g6.K8, org.telegram.ui.ActionBar.g6.I8, org.telegram.ui.ActionBar.g6.J8, org.telegram.ui.ActionBar.g6.L8, org.telegram.ui.ActionBar.g6.d6);
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
            xy[] xyVarArr = this.e0;
            if (i12 >= xyVarArr.length) {
                break;
            }
            xy xyVar = xyVarArr[i12];
            if (xyVar != null) {
                xyVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, 0.0f);
        this.u3 = ofFloat;
        ofFloat.addUpdateListener(new cw(this, max, i10));
        this.u3.addListener(new cy(this, max, i11));
        this.u3.setInterpolator(org.telegram.ui.Components.es.f);
        this.u3.setDuration(200L);
        this.u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                l10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
                xy[] xyVarArr2 = this.e0;
                if (i14 >= xyVarArr2.length) {
                    break;
                }
                xyVarArr2[i14].d.H = z11;
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
        org.telegram.ui.Components.or0 or0Var = this.G2;
        if (or0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        or0Var.h(i10);
        or0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = or0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.mr0 mr0Var = or0Var.a[0];
        if (or0Var.b == 1) {
            mr0Var.d.l(or0Var.c(mr0Var), false);
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
            di.d4 d4Var = this.p0;
            if (d4Var != null) {
                d4Var.e(true);
            }
            di.d4 d4Var2 = this.q0;
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
        px pxVar = this.E0;
        org.telegram.ui.Components.q5 q5Var2 = null;
        if (pxVar != null && (q5Var = pxVar.a0) != null && pxVar.q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                q5Var.j(emojiStatusDocumentId.longValue(), z10);
                q5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(pxVar.f).isPremiumUser(user)) {
                q5Var.g(null, z10);
                q5Var.m(false, z10);
            } else {
                if (pxVar.N0 == null) {
                    pxVar.N0 = pxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    pxVar.N0 = new bi.l(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), pxVar.N0);
                }
                pxVar.N0.setColorFilter(new PorterDuffColorFilter(pxVar.f(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
                q5Var.g(pxVar.N0, z10);
                q5Var.m(false, z10);
            }
            q5Var.k(Integer.valueOf(pxVar.f(org.telegram.ui.ActionBar.g6.zh)));
            pxVar.W.invalidate();
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
            this.actionBar.setRightDrawableOnClick(new zv(this, 2));
            r71.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.D3.g(null, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.K3 == null) {
                this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.K3 = new ny(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
            }
            this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
            this.D3.g(this.K3, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new zv(this, 3));
            r71.t(this.currentAccount);
        }
        org.telegram.ui.Components.q5 q5Var3 = this.D3;
        int i10 = org.telegram.ui.ActionBar.g6.zh;
        q5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.E3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        ux uxVar = this.M0;
        if (uxVar == null || !(uxVar.getContentView() instanceof r71)) {
            return;
        }
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
        r71 r71Var = (r71) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.q5 q5Var4 = this.D3;
            if (rightDrawable == q5Var4) {
                q5Var2 = q5Var4;
            }
        }
        r71Var.y(q5Var2, titleTextView);
    }

    public final boolean b4() {
        return this.V2 == 1;
    }

    public final void b5() {
        di.d4 d4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.N3 != storiesEnabled) {
            U4();
            if (!this.N3 && storiesEnabled && (d4Var = this.p0) != null) {
                d4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.l20 l20Var = this.t0;
        if (l20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            l20Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            l20Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public final boolean c4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return (topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id);
    }

    public final void c5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        bi.x8 U3;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        sx sxVar = this.F3;
        if ((sxVar != null && sxVar.c()) || this.p3 || (kVar = this.actionBar) == null || kVar.t() || this.l2) {
            return;
        }
        di.kc kcVar = di.kc.F2;
        int i10 = 0;
        if ((kcVar != null && kcVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
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
                ofFloat.addUpdateListener(new hj(i11, this));
                this.J.addListener(new org.telegram.ui.Components.u61(this, 21));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.es.f);
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
            ofFloat2.addUpdateListener(new hy(this, f7, z11, Q3));
            this.I.addListener(new yx(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.es.f);
            this.I.start();
            return;
        }
        this.K = z11;
        px pxVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        pxVar.setVisibility(i13);
        if (z11) {
            this.x3 = -AndroidUtilities.dp(81.0f);
            z4(-Q3());
        } else {
            z4(0.0f);
        }
        while (true) {
            xy[] xyVarArr = this.e0;
            if (i10 >= xyVarArr.length) {
                break;
            }
            xy xyVar = xyVarArr[i10];
            if (xyVar != null) {
                xyVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean canBeginSlide() {
        ww wwVar;
        if (this.F3.c()) {
            return false;
        }
        return this.R0 != 3 || (wwVar = this.z0) == null || wwVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean closeLastFragment() {
        if (!this.F3.c()) {
            return super.closeLastFragment();
        }
        this.F3.a();
        iy iyVar = this.C0;
        if (iyVar == null) {
            return true;
        }
        iyVar.R();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(this, context, this.resourceProvider, 3);
        b8Var.setAllowOverlayTitle(true);
        b8Var.L();
        b8Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.t8), false);
        b8Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.z8), true);
        b8Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.v8), false);
        b8Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.y8), true);
        b8Var.k();
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || b4())) {
            return b8Var;
        }
        b8Var.setOccupyStatusBar(false);
        return b8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e60  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0cd6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v205, types: [org.telegram.ui.Components.mm0, org.telegram.ui.uy] */
    /* JADX WARN: Type inference failed for: r3v206, types: [org.telegram.ui.Components.mm0, org.telegram.ui.uy] */
    /* JADX WARN: Type inference failed for: r3v207, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.uy] */
    /* JADX WARN: Type inference failed for: r3v211, types: [org.telegram.ui.Components.mm0, org.telegram.ui.uy] */
    /* JADX WARN: Type inference failed for: r3v212, types: [org.telegram.ui.Components.mm0, org.telegram.ui.uy] */
    /* JADX WARN: Type inference failed for: r3v214, types: [org.telegram.ui.bx, s4.b0] */
    /* JADX WARN: Type inference failed for: r4v69, types: [org.telegram.ui.Components.mm0, org.telegram.ui.uy] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.ui.ow] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v23, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f7;
        int i10;
        fo foVar;
        ww wwVar;
        oy oyVar;
        oy oyVar2;
        org.telegram.ui.Components.xs xsVar;
        wy wyVar;
        s4.y yVar;
        hg.m mVar;
        hg.m mVar2;
        long j10;
        hg.m mVar3;
        hg.m mVar4;
        hg.m mVar5;
        hg.m mVar6;
        sy syVar;
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
        AndroidUtilities.runOnUIThread(new tv(context2, 0));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        this.j0 = a2;
        a2.setOnClickListener(new zv(this, 1));
        int i13 = 8;
        if (this.R0 == 2 || (b4() && O3(this.currentAccount, this.R0, this.V2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        int i14 = 3;
        ?? r82 = 1;
        if (!this.l2 && this.n2 == null && this.V2 == 0 && this.X2 == 0) {
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getThemedColor(org.telegram.ui.ActionBar.g6.t8), getThemedColor(org.telegram.ui.ActionBar.g6.v8), context2, true);
            this.m0 = u0Var;
            u0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.m0, w7.a6.a(-2.0f, 0.0f, 0.0f, 10.0f, 0.0f, -2, 53));
            this.m0.setOnClickListener(new zv(this, 8));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.gj0(context2);
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(context2, this.resourceProvider, false, true);
            this.o0 = e1Var;
            e1Var.setItemHeight(56);
            this.o0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.n0);
            this.o0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.u0 a10 = n10.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            org.telegram.ui.ActionBar.u0 d = n10.d(3, new ColorDrawable(0));
            this.g0 = d;
            az azVar = new az(context2, this.currentAccount);
            this.h0 = azVar;
            d.addView(azVar);
            this.g0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.g0.setVisibility(8);
            W4(false, false);
        }
        oy oyVar3 = new oy(context2, this.resourceProvider);
        this.X = oyVar3;
        long j11 = 0;
        oyVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.u0 a11 = n10.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.l0.setOnClickListener(new zv(this, 9));
            this.X.a(this.l0);
            this.X.d();
        }
        this.X.setCloseButtonOnClickListener(new nw(this, 0));
        this.X.r.setOnFocusChangeListener(new vd(this, 1));
        di.g2 g2Var = this.X.r;
        zf.h0 h0Var = new zf.h0(g2Var, new py(this));
        this.Y = h0Var;
        g2Var.addTextChangedListener(h0Var);
        this.X.setSearchFiltersListener(new ey(this, 5));
        this.Y.a();
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.u0 a12 = n10.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.k0.setOnClickListener(new zv(this, 10));
            this.k0.setOnLongClickListener(new iw(this, 3));
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
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        } else {
            if (this.n2 != null || this.V2 != 0 || this.X2 != 0) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
                this.e1 = f2Var;
                kVar.setBackButtonDrawable(f2Var);
            }
            if (this.V2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.X2 != 0) {
                this.actionBar.setTitle(DialogObject.getName(this.Y2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.b3 = new org.telegram.ui.Components.k9(this.Y2);
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getContext());
                this.a3 = z9Var;
                z9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.a3.e(this.Y2, this.b3);
                this.actionBar.addView(this.a3, w7.a6.a(32.0f, 58.0f, 0.0f, 0.0f, 12.0f, 32, 83));
            } else {
                org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(26.0f), null);
                this.D3 = q5Var;
                q5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.C3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.C3.getIntrinsicWidth(), this.C3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.C3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.gl), PorterDuff.Mode.MULTIPLY);
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
        this.actionBar.setTitleActionRunnable(new nw(this, 1));
        int i16 = this.R0;
        if (((i16 == 0 && !this.l2) || i16 == 3) && this.V2 == 0 && this.X2 == 0 && TextUtils.isEmpty(this.n2)) {
            ww wwVar2 = new ww(this, context2, this.resourceProvider);
            this.z0 = wwVar2;
            wwVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.z0.setDelegate(new xw(context2, this));
        }
        int i17 = 17;
        if (this.r2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.D1 = n10.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9();
            k9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(context2);
            z9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.D1.addView(z9Var2, w7.a6.e(36, 36, 17));
            this.D1.setOnClickListener(new zv(this, 11));
            this.D1.setOnLongClickListener(new iw(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            k9Var.m(this.currentAccount, currentUser);
            z9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            z9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? k9Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new yw(this));
        final ry ryVar = new ry(context2, this);
        this.fragmentView = ryVar;
        ih.j jVar = new ih.j(ryVar);
        this.j4 = jVar;
        bh.b bVar = this.o4;
        bVar.f(jVar, ryVar);
        ih.j jVar2 = this.j4;
        bh.b bVar2 = this.q4;
        bVar2.f(jVar2, ryVar);
        ih.j jVar3 = this.j4;
        bh.b bVar3 = this.r4;
        bVar3.f(jVar3, ryVar);
        this.p4.f(this.j4, ryVar);
        final PointF pointF = new PointF();
        this.s4 = new ch.a() { // from class: org.telegram.ui.ow
            @Override // ch.a
            public final void e(bh.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // ch.a
            public final void f(Canvas canvas, RectF rectF) {
                yy yyVar = yy.this;
                iy iyVar = yyVar.C0;
                int alpha = iyVar != null ? (int) (iyVar.getAlpha() * 255.0f) : 0;
                xy[] xyVarArr = yyVar.e0;
                int length = xyVarArr.length;
                int i18 = 0;
                while (true) {
                    ry ryVar2 = ryVar;
                    if (i18 >= length) {
                        iy iyVar2 = yyVar.C0;
                        if (iyVar2 == null || iyVar2.getVisibility() != 0 || yyVar.C0.getAlpha() <= 0.0f) {
                            return;
                        }
                        iy iyVar3 = yyVar.C0;
                        hh.d.b(iyVar3, canvas, rectF, iyVar3, ryVar2, alpha);
                        return;
                    }
                    xy xyVar = xyVarArr[i18];
                    if (xyVar != null && xyVar.getVisibility() == 0 && xyVar.getAlpha() > 0.0f) {
                        float S3 = yyVar.S3();
                        if (xyVar.F == null || S3 <= 0.0f) {
                            uy uyVar = xyVar.a;
                            hh.d.b(uyVar, canvas, rectF, uyVar, ryVar2, 255 - alpha);
                        } else {
                            uy uyVar2 = xyVar.a;
                            PointF pointF2 = pointF;
                            if (!ih.j.b(uyVar2, ryVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            xyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i18++;
                }
            }
        };
        int i18 = (this.V2 == 0 && this.X2 == 0 && (((i12 = this.R0) == 0 && !this.l2) || i12 == 3)) ? 2 : 1;
        this.e0 = new xy[i18];
        int i19 = 0;
        while (i19 < i18) {
            bh.b bVar4 = bVar3;
            xy xyVar = new xy(context2, this);
            ryVar.addView(xyVar, w7.a6.d(-1.0f, -1));
            xyVar.s = this.R0;
            this.e0[i19] = xyVar;
            xyVar.w = new org.telegram.ui.Components.f10(context2);
            xyVar.w.setViewType(7);
            xyVar.w.setVisibility(i13);
            xyVar.addView(xyVar.w, w7.a6.e(-2, -2, i17));
            uy uyVar = new uy(this, context2, xyVar);
            xyVar.a = uyVar;
            uyVar.C0(new org.telegram.ui.Components.k31(22, this, xyVar));
            ?? r42 = xyVar.a;
            xyVar.b = new a5.a((org.telegram.ui.Components.mm0) r42);
            r42.setAllowStopHeaveOperations(r82);
            xyVar.a.setAccessibilityEnabled(r11);
            xyVar.a.m1(r11, r82);
            xyVar.a.setClipToPadding(r11);
            xyVar.a.setPivotY(0.0f);
            if (this.R0 == 15) {
                xyVar.a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
            }
            xyVar.x = new zw(xyVar.a, xyVar);
            xyVar.a.setVerticalScrollBarEnabled(r82);
            xyVar.a.setInstantClick(r82);
            xyVar.c = new bx(this, xyVar);
            xyVar.c.j1(r82);
            xyVar.a.setLayoutManager(xyVar.c);
            xyVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? r82 : 2);
            xyVar.addView(xyVar.a, w7.a6.d(-1.0f, -1));
            xyVar.a.setOnItemClickListener(new gw(1, this, xyVar));
            xyVar.a.setOnItemLongClickListener(new n6.o(this, xyVar, false, 7));
            xyVar.f = new wy(this, xyVar);
            xyVar.y = new org.telegram.ui.Components.rl0(xyVar.a, r11);
            wyVar = xyVar.f;
            xyVar.e = new s4.y(wyVar);
            yVar = xyVar.e;
            yVar.d(xyVar.a);
            xyVar.a.setOnScrollListener(new dx(this, xyVar, ryVar));
            xyVar.v = SharedConfig.archiveHidden ? 2 : r11;
            if (xyVar.n == null && this.V2 == 0 && this.X2 == j11) {
                xyVar.n = new ex(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), xyVar);
                if (W3()) {
                    xyVar.n.h();
                } else {
                    xyVar.n.b();
                }
                ex exVar = xyVar.n;
                i11 = xyVar.v;
                exVar.g(i11 != 0 ? r82 : r11);
            }
            ry ryVar2 = ryVar;
            bh.b bVar5 = bVar;
            boolean z13 = r82;
            bh.b bVar6 = bVar2;
            context2 = context;
            xyVar.d = new fx(this, this, context, xyVar.s, this.V2, this.l2, arrayList, this.currentAccount, this.G, xyVar);
            mVar = xyVar.d;
            mVar.R(xyVar.a);
            mVar2 = xyVar.d;
            mVar2.P(this.t2);
            if (xyVar.s == 3) {
                mVar6 = xyVar.d;
                mVar6.M((getMessagesController().storiesEnabled() && (syVar = this.C2) != null && syVar.D()) ? z13 : false);
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.p2;
                j10 = 0;
                if (topicKey.dialogId != 0) {
                    mVar5 = xyVar.d;
                    mVar5.Q(topicKey.dialogId);
                }
            } else {
                j10 = 0;
            }
            mVar3 = xyVar.d;
            mVar3.N(xyVar.n);
            uy uyVar2 = xyVar.a;
            mVar4 = xyVar.d;
            uyVar2.setAdapter(mVar4);
            xyVar.a.setEmptyView((this.V2 == 0 && this.X2 == j10) ? xyVar.w : null);
            xyVar.r = new org.telegram.ui.Components.pl0(xyVar.a, xyVar.c);
            org.telegram.ui.Components.pl0 pl0Var = xyVar.r;
            pl0Var.c = z13;
            pl0Var.d = z13;
            pl0Var.h = new aw(this, 10);
            if (i19 != 0) {
                this.e0[i19].setVisibility(8);
            }
            i19++;
            j11 = j10;
            ryVar = ryVar2;
            r82 = z13;
            i14 = 3;
            bVar3 = bVar4;
            bVar = bVar5;
            bVar2 = bVar6;
            r11 = 0;
            i17 = 17;
            i13 = 8;
        }
        ry ryVar3 = ryVar;
        int i20 = i14;
        bh.b bVar7 = bVar;
        int i21 = r82;
        bh.b bVar8 = bVar2;
        bh.b bVar9 = bVar3;
        long j12 = j11;
        org.telegram.ui.Components.ws wsVar = new org.telegram.ui.Components.ws(context2);
        this.K1 = wsVar;
        int i22 = org.telegram.ui.ActionBar.g6.d6;
        wsVar.setColor(org.telegram.ui.ActionBar.g6.v0(i22));
        ryVar3.addView(this.K1, w7.a6.e(-1, 100, 48));
        this.B0 = ryVar3.getChildCount();
        c51 c51Var = new c51((Activity) getContext());
        this.Z = c51Var;
        c51Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ryVar3.addView(this.Z, w7.a6.a(50.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 48));
        dh.d b10 = bVar8.b(this.Z, fh.b.n(this.resourceProvider));
        b10.q(AndroidUtilities.dp(18.0f));
        b10.p(AndroidUtilities.dp(6.666f));
        this.Z.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.Z.setBlurredBackground(b10);
        hg.r0 r0Var = new hg.r0(getParentActivity(), null);
        this.b0 = r0Var;
        r0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        hg.r0 r0Var2 = this.b0;
        r0Var2.Y2 = false;
        r0Var2.setOnItemClickListener(new ew(this, 1));
        this.Z.addView(this.b0, w7.a6.e(-1, -1, 48));
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context2, this.resourceProvider, i21);
        this.u0 = l20Var;
        l20Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new zv(this, 27));
        ryVar3.addView(this.u0, org.telegram.ui.Components.l20.c());
        org.telegram.ui.Components.l20 l20Var2 = new org.telegram.ui.Components.l20(context2, this.resourceProvider);
        this.t0 = l20Var2;
        ryVar3.addView(l20Var2, org.telegram.ui.Components.l20.b());
        this.t0.setOnClickListener(new zv(this, 28));
        if (!b4() && this.R0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", i21)) {
            di.d4 d4Var = new di.d4(context2, 2);
            d4Var.q(8.0f);
            d4Var.d = 8000L;
            d4Var.i();
            d4Var.n();
            d4Var.p(i21);
            d4Var.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), di.kc.m(context2)));
            d4Var.l(1.0f, -40.0f);
            d4Var.h(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
            d4Var.l0 = new nw(this, 12);
            this.p0 = d4Var;
            ryVar3.addView(d4Var, w7.a6.a(160.0f, 0.0f, 0.0f, 80.0f, 0.0f, -1, 87));
        }
        b5();
        this.a0 = null;
        if (this.l2 || this.R0 != 0) {
            f7 = 72.0f;
            if (this.R0 == i20 || F3()) {
                ih.f fVar = new ih.f(context2);
                this.y1 = fVar;
                fVar.setClipChildren(false);
                ih.f fVar2 = this.y1;
                qh.i iVar = this.v;
                fVar2.setWindowInsetsProvider(iVar);
                ih.f fVar3 = this.y1;
                fVar3.setInputIslandBubbleDrawable(bVar8.b(fVar3, fh.b.n(this.resourceProvider)));
                ih.f fVar4 = this.y1;
                fVar4.setUnderKeyboardBackgroundDrawable(bVar7.b(fVar4, fh.b.n(this.resourceProvider)));
                bh.c cVar = new bh.c(bVar9.b(this.y1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    cVar.b(AndroidUtilities.dp(72.0f), i21);
                }
                this.y1.setBackgroundWithFadeDrawable(cVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                ix ixVar = this.B1;
                if (ixVar != null) {
                    ixVar.z0();
                }
                ix ixVar2 = new ix(this, getParentActivity(), ryVar3);
                this.B1 = ixVar2;
                ixVar2.setInAppInsetsController(iVar);
                this.B1.y4 = false;
                ryVar3.setClipChildren(false);
                ryVar3.setClipToPadding(false);
                ix ixVar3 = this.B1;
                ixVar3.x4 = false;
                ixVar3.i2 = (AndroidUtilities.isInMultiwindow || ((foVar = ixVar3.P2) != null && foVar.isInBubbleMode())) ? false : i21;
                this.B1.S0(false, false);
                this.B1.e1(i21, false);
                this.B1.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, w7.a6.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
                ryVar3.addView(this.y1.getFadeView(), w7.a6.d(-1.0f, -1));
                ryVar3.addView(this.y1, w7.a6.d(-1.0f, -1));
                if (X3() || this.E2 != null || this.F2 != null) {
                    i3(this.U3);
                    this.U3 = null;
                }
                this.B1.setDelegate(new jx(this));
                i10 = -1;
                ji.y1 y1Var = new ji.y1(this, context2, R.drawable.send_plane_24, this.resourceProvider, 3);
                this.C1 = y1Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                y1Var.I = dp;
                y1Var.J = dp2;
                ji.y1 y1Var2 = this.C1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                y1Var2.M = dp3;
                y1Var2.N = dp4;
                ji.y1 y1Var3 = this.C1;
                y1Var3.h0 = i21;
                ryVar3.addView(y1Var3, w7.a6.e(110, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i22));
                this.C1.setOnClickListener(new zv(this, 5));
                this.C1.setOnLongClickListener(new iw(this, 0));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                wwVar = this.z0;
                if (wwVar != null) {
                    dh.d b11 = bVar8.b(wwVar, fh.b.n(this.resourceProvider));
                    b11.q(AndroidUtilities.dp(18.0f));
                    b11.p(AndroidUtilities.dp(6.666f));
                    this.z0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.z0.setBlurredBackground(b11);
                    ryVar3.addView(this.z0, w7.a6.a(50.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 48));
                }
                oyVar = this.X;
                if (oyVar != null) {
                    oyVar.setupBlurredBackground(bVar8.b(oyVar, fh.b.n(this.resourceProvider)));
                }
                px pxVar = new px(this, context, this, this.currentAccount, b4() ? 1 : 0);
                this.E0 = pxVar;
                pxVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!b4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                px pxVar2 = this.E0;
                pxVar2.l0 = false;
                pxVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == i20) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
                }
                ryVar3.addView(this.actionBar, w7.a6.d(-2.0f, i10));
                if (!this.l2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.E3 = oVar;
                    ryVar3.addView(oVar, w7.a6.e(20, 20, 51));
                }
                oyVar2 = this.X;
                if (oyVar2 != null) {
                    ryVar3.addView(oyVar2, w7.a6.a(48.0f, 7.0f, -2.0f, 7.0f, 0.0f, -1, 48));
                }
                this.x0 = ryVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i21] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.gl));
                }
                if (this.V2 == 0 || this.X2 != j12) {
                    this.e0[0].a.setGlowColor(getThemedColor(i22));
                    this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.g6.O8), false);
                    this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.N8), false);
                    this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.Q8), false);
                    this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.R8), i21);
                }
                if (!this.l2 && this.R0 == 0) {
                    di.ab abVar = new di.ab(this, context, 28);
                    this.K0 = abVar;
                    abVar.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i22), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new zv(this, 7));
                    this.K0.setVisibility(8);
                    ryVar3.addView(this.K0, w7.a6.d(-1.0f, i10));
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
                    oy oyVar4 = this.X;
                    if (oyVar4 != null) {
                        oyVar4.setTranslationY(T3() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    L4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(ryVar3);
                this.F3 = new sx(this, context, ryVar3, context);
                S4(i21, false);
                this.F3.setOpenProgress(0.0f);
                ryVar3.addView(this.E0, w7.a6.d(81.0f, i10));
                ryVar3.addView(this.F3, w7.a6.d(-1.0f, i10));
                this.F0 = new org.telegram.ui.Components.vs(context);
                xsVar = this.J1;
                if (xsVar != null) {
                    ryVar3.addView(xsVar, w7.a6.a(-2.0f, 0.0f, -14.0f, 0.0f, 0.0f, -1, 48));
                }
                if (this.X2 != j12 && this.R0 != i20 && ChatObject.canAddChatToCommunity(this.Y2)) {
                    org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(brVar, 0, i21, 33);
                    di.d dVar = new di.d(context, this.resourceProvider);
                    this.v0 = dVar;
                    dVar.e();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new xv(1, this, new org.telegram.ui.ActionBar.a2[i21]));
                    kh.f fVar5 = new kh.f(getContext());
                    this.w0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.g6.a7);
                    this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
                    this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    ryVar3.addView(this.w0, w7.a6.g());
                    ryVar3.addView(this.v0, w7.a6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
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
                r0.j0.l(this.fragmentView, new aw(this, 7));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.xs xsVar2 = new org.telegram.ui.Components.xs(context2);
            this.J1 = xsVar2;
            xsVar2.setOnAnimatedHeightChangedListener(new uv(this, 5));
            dh.d a13 = bVar8.a(this.J1);
            a13.o(fh.b.n(this.resourceProvider));
            a13.p(AndroidUtilities.dp(7.0f));
            f7 = 72.0f;
            this.J1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            this.J1.setBlurredBackground(a13);
            this.J1.setDefaultRadiusDp(this.X2 != j12 ? 18 : 24);
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
            hx hxVar = new hx(this, context2, this, 0);
            this.F1 = hxVar;
            this.G1.addView(hxVar);
            hx hxVar2 = new hx(this, context2, this, 1);
            this.H1 = hxVar2;
            this.I1.addView(hxVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context2);
            this.M1 = a3Var;
            a3Var.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            R4();
            d7.j0(new bw(this, 0));
            d7.p0(new f5(this, 11));
            this.J1.addView(this.M1);
            if (this.X2 != j12) {
                hi.j jVar4 = new hi.j(context2, this.resourceProvider, i21);
                this.Q1 = jVar4;
                jVar4.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.Q1.setUnreadMode(i21);
                this.Q1.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                this.Q1.setOnClickListener(new zv(this, 4));
                this.J1.addView(this.Q1);
                n3(false);
            }
        }
        i10 = -1;
        wwVar = this.z0;
        if (wwVar != null) {
        }
        oyVar = this.X;
        if (oyVar != null) {
        }
        px pxVar3 = new px(this, context, this, this.currentAccount, b4() ? 1 : 0);
        this.E0 = pxVar3;
        pxVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!b4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        px pxVar22 = this.E0;
        pxVar22.l0 = false;
        pxVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
        }
        ryVar3.addView(this.actionBar, w7.a6.d(-2.0f, i10));
        if (!this.l2) {
        }
        oyVar2 = this.X;
        if (oyVar2 != null) {
        }
        this.x0 = ryVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i21] = null;
        if (this.W) {
        }
        if (this.V2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i22));
        this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.g6.O8), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.N8), false);
        this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.Q8), false);
        this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.R8), i21);
        if (!this.l2) {
            di.ab abVar2 = new di.ab(this, context, 28);
            this.K0 = abVar2;
            abVar2.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i22), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new zv(this, 7));
            this.K0.setVisibility(8);
            ryVar3.addView(this.K0, w7.a6.d(-1.0f, i10));
        }
        this.f1.setColor(getThemedColor(i22));
        this.p3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(ryVar3);
        this.F3 = new sx(this, context, ryVar3, context);
        S4(i21, false);
        this.F3.setOpenProgress(0.0f);
        ryVar3.addView(this.E0, w7.a6.d(81.0f, i10));
        ryVar3.addView(this.F3, w7.a6.d(-1.0f, i10));
        this.F0 = new org.telegram.ui.Components.vs(context);
        xsVar = this.J1;
        if (xsVar != null) {
        }
        if (this.X2 != j12) {
            org.telegram.ui.Components.br brVar2 = new org.telegram.ui.Components.br(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(brVar2, 0, i21, 33);
            di.d dVar2 = new di.d(context, this.resourceProvider);
            this.v0 = dVar2;
            dVar2.e();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new xv(1, this, new org.telegram.ui.ActionBar.a2[i21]));
            kh.f fVar52 = new kh.f(getContext());
            this.w0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.g6.a7);
            this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
            this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            ryVar3.addView(this.w0, w7.a6.g());
            ryVar3.addView(this.v0, w7.a6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
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
        r0.j0.l(this.fragmentView, new aw(this, 7));
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
                iy iyVar = this.C0;
                recyclerView = iyVar != null ? iyVar.V : null;
            } else {
                xy[] xyVarArr = this.e0;
                if (xyVarArr != null) {
                    uy uyVar = i13 < xyVarArr.length ? xyVarArr[i13].a : null;
                    if (uyVar == null || xyVarArr[i13].getVisibility() == 0) {
                        r5 = uyVar != null ? this.e0[i13] : null;
                        recyclerView = uyVar;
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
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.mm0)) {
                                    org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) childAt;
                                    childCount = mm0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = mm0Var.getChildAt(i12);
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
                            org.telegram.ui.Components.mm0 mm0Var2 = (org.telegram.ui.Components.mm0) childAt;
                            childCount = mm0Var2.getChildCount();
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
        org.telegram.ui.Components.so0 so0Var;
        org.telegram.ui.Components.so0 so0Var2;
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
                xy[] xyVarArr = this.e0;
                if (i20 >= xyVarArr.length) {
                    break;
                }
                xy xyVar = xyVarArr[i20];
                int i21 = xyVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i21 == 7 || i21 == 8) ? getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.z3 && z12) {
                    AndroidUtilities.runOnUIThread(new br(this, xyVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    r4(xyVar);
                }
                i20++;
            }
            ww wwVar = this.z0;
            if (wwVar != null && wwVar.getVisibility() == 0) {
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
                xy[] xyVarArr2 = this.e0;
                if (i19 >= xyVarArr2.length) {
                    return;
                }
                r4(xyVarArr2[i19]);
                i19++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                ww wwVar2 = this.z0;
                if (wwVar2 == null || wwVar2.getVisibility() != 0) {
                    return;
                }
                ww wwVar3 = this.z0;
                int defaultTabId = wwVar3.getDefaultTabId();
                bi.o0 o0Var = wwVar3.F;
                ArrayList arrayList2 = wwVar3.h;
                int i22 = wwVar3.l0.get(defaultTabId, -1);
                if (i22 < 0 || i22 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) arrayList2.get(i22);
                if (s00Var.d == ((xw) wwVar3.J).a(s00Var.a) || ((xw) wwVar3.J).a(s00Var.a) < 0) {
                    return;
                }
                o0Var.f1();
                if (wwVar3.m0.get(i22) != s00Var.a(true) || wwVar3.h0) {
                    wwVar3.h0 = true;
                    wwVar3.requestLayout();
                    o0Var.setItemAnimator(wwVar3.s0);
                    org.telegram.ui.Components.r00 r00Var = wwVar3.I;
                    if (r00Var != null) {
                        r00Var.l();
                    }
                    wwVar3.M = 0;
                    org.telegram.ui.Components.s00 d = wwVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        wwVar3.M = org.telegram.messenger.yh.c(24.0f, ((org.telegram.ui.Components.s00) arrayList2.get(i23)).a(true), wwVar3.M);
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
                        xy[] xyVarArr3 = this.e0;
                        if (i24 >= xyVarArr3.length) {
                            break;
                        }
                        uy uyVar = xyVarArr3[i24].a;
                        if (uyVar != null) {
                            for (int i25 = 0; i25 < uyVar.getChildCount(); i25++) {
                                View childAt = uyVar.getChildAt(i25);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i24++;
                    }
                }
                ww wwVar4 = this.z0;
                if (wwVar4 != null) {
                    wwVar4.getTabsContainer().f1();
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
                ww wwVar5 = this.z0;
                if (wwVar5 != null && wwVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
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
                org.telegram.ui.Components.l20 l20Var = this.t0;
                if (l20Var != null) {
                    z11 = l20Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (xy xyVar2 : this.e0) {
                    xyVar2.d.e = false;
                }
                if (z11) {
                    w4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.es.f);
                    this.d0.addUpdateListener(new wv(this, i18));
                    this.d0.start();
                }
                int i28 = 0;
                boolean z13 = false;
                while (true) {
                    xy[] xyVarArr4 = this.e0;
                    if (i28 >= xyVarArr4.length) {
                        break;
                    }
                    if (!xyVarArr4[i28].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
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
                    xy[] xyVarArr5 = this.e0;
                    if (i29 >= xyVarArr5.length) {
                        d5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (xyVarArr5[i29].p() && AndroidUtilities.isTablet()) {
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
                    iy iyVar = this.C0;
                    if (iyVar == null || (so0Var2 = iyVar.b0) == null || (i15 = so0Var2.h0) == 15) {
                        return;
                    }
                    int i30 = so0Var2.s0;
                    MessagesStorage.getInstance(i30).getStorageQueue().postRunnable(new hg.n(i30, i15, new hg.w(so0Var2), i18));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    d5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    iy iyVar2 = this.C0;
                    if (iyVar2 == null || (so0Var = iyVar2.b0) == null) {
                        return;
                    }
                    so0Var.l();
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
                    iy iyVar3 = this.C0;
                    if (iyVar3 != null) {
                        int currentPosition = iyVar3.getCurrentPosition();
                        org.telegram.ui.Components.yo0 yo0Var = iyVar3.T;
                        Z4(yo0Var != null && yo0Var.h(currentPosition) == 2);
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
                    Runnable uaVar = new di.ua(this, chat2, longValue3, z14, user, z10);
                    K3();
                    if (this.y0[0] == null) {
                        uaVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        uaVar.run();
                        return;
                    }
                    UndoView V3 = V3();
                    if (V3 != null) {
                        V3.j(z14 ? 1 : 95, longValue3, uaVar);
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
                        bh0 bh0Var = new bh0();
                        nw nwVar = new nw(this, i32);
                        nw nwVar2 = new nw(this, i17);
                        boolean z15 = checkEmailSuggestion == 2;
                        bh0Var.F = 3;
                        bh0Var.a = 12;
                        bh0Var.d0 = nwVar;
                        bh0Var.e0 = nwVar2;
                        bh0Var.g0 = z15;
                        bh0Var.h0 = true;
                        presentFragment(bh0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.l20 l20Var2 = this.t0;
                    if (l20Var2 != null) {
                        l20Var2.f(true, true);
                    }
                    xy[] xyVarArr6 = this.e0;
                    if (xyVarArr6 != null) {
                        for (xy xyVar3 : xyVarArr6) {
                            fx fxVar = xyVar3.d;
                            fxVar.Q = false;
                            fxVar.e = true;
                            fxVar.l();
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
                    iy iyVar4 = this.C0;
                    HashMap hashMap = iyVar4.z0;
                    SparseArray sparseArray = iyVar4.h;
                    int size2 = sparseArray.size();
                    for (int i33 = 0; i33 < size2; i33++) {
                        View view = (View) sparseArray.valueAt(i33);
                        if (view instanceof c20) {
                            ((c20) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i34 = 0; i34 < iyVar4.getChildCount(); i34++) {
                        if (iyVar4.getChildAt(i34) instanceof c20) {
                            ((c20) iyVar4.getChildAt(i34)).e(longValue4, arrayList3);
                        }
                    }
                    iyVar4.M0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    int i35 = 0;
                    while (i35 < arrayList4.size()) {
                        u10 u10Var = (u10) arrayList4.get(i35);
                        MessageObject messageObject = (MessageObject) hashMap.get(u10Var);
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
                                        arrayList.add(u10Var);
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
                        iyVar4.x0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.u0 u0Var = iyVar4.C0;
                        if (u0Var != null) {
                            u0Var.setVisibility(hashMap.size() == 1 ? i37 : 8);
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
                            xy[] xyVarArr7 = this.e0;
                            if (i39 >= xyVarArr7.length) {
                                break;
                            }
                            hg.j jVar = xyVarArr7[i39].d.P;
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
                    pb1 pb1Var = pb1.b;
                    if (pb1Var != null) {
                        pb1Var.dismiss();
                        pb1.b = null;
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
                    org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                    if (b5Var == null || b5Var.getLastFragment() != this) {
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
                            gv gvVar = this.Q3;
                            if (gvVar == null || gvVar.getTag() == null) {
                                return;
                            }
                            gv gvVar2 = this.Q3;
                            gvVar2.animate().setListener(null).cancel();
                            gvVar2.animate().setListener(new org.telegram.ui.Components.ql0(i32, this, gvVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.Q3.setTag(null);
                            return;
                        }
                        if (this.Q3 == null) {
                            Context context = this.fragmentView.getContext();
                            gv gvVar3 = new gv(context);
                            LinearLayout e = org.telegram.messenger.yh.e(context, 1);
                            org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                            bk0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            bk0Var.getAnimatedDrawable().K(1);
                            bk0Var.d();
                            e.addView(bk0Var, w7.a6.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i40 = org.telegram.ui.ActionBar.g6.G6;
                            com.google.android.gms.internal.play_billing.k3.o(i40, null, false, textView, 1);
                            TextView i41 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.a6.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            i41.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            i41.setTextSize(1, 14.0f);
                            i41.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            i41.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i40, false));
                            i41.setGravity(1);
                            TextView i42 = com.google.android.gms.internal.play_billing.k3.i(e, i41, w7.a6.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            i42.setTextSize(1, 14.0f);
                            i42.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            i42.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i40, false));
                            i42.setGravity(1);
                            e.addView(i42, w7.a6.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            gvVar3.addView(e, w7.a6.e(-1, -2, 16));
                            gvVar3.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                            gvVar3.setOnTouchListener(new fv());
                            this.Q3 = gvVar3;
                            gvVar3.setAlpha(0.0f);
                            ((ry) this.fragmentView).addView(this.Q3);
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
                        pb1.o(this);
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
                    int i43 = 0;
                    while (true) {
                        xy[] xyVarArr8 = this.e0;
                        if (i43 >= xyVarArr8.length) {
                            return;
                        }
                        xy xyVar4 = xyVarArr8[i43];
                        if (xyVar4 != null && (((i12 = xyVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[xyVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            xyVar4.q(true);
                            return;
                        }
                        i43++;
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
                    int i44 = 0;
                    while (true) {
                        xy[] xyVarArr9 = this.e0;
                        if (i44 >= xyVarArr9.length) {
                            return;
                        }
                        xy xyVar5 = xyVarArr9[i44];
                        if (xyVar5.a != null) {
                            int i45 = 0;
                            while (true) {
                                if (i45 < xyVar5.a.getChildCount()) {
                                    View childAt2 = xyVar5.a.getChildAt(i45);
                                    if (childAt2 instanceof org.telegram.ui.Cells.s2) {
                                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt2;
                                        if (longValue6 == s2Var.getDialogId()) {
                                            s2Var.u();
                                            break;
                                        }
                                    }
                                    i45++;
                                }
                            }
                        }
                        i44++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof fi.k3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        return this.C2 == null && this.n2 == null;
    }

    public final boolean e5(long j10) {
        TLRPC.Chat chat;
        ix ixVar;
        if ((this.S0 <= 1 && ((ixVar = this.B1) == null || ixVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean f3(long j10, View view) {
        if (this.l2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) view).t(true, true);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.m80 m80Var = this.L0;
        if (m80Var != null) {
            m80Var.u();
        }
    }

    public final void g3(hg.p0 p0Var) {
        iy iyVar;
        if (!this.p3 || (iyVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = iyVar.A0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (p0Var.b((hg.p0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(p0Var);
        oy oyVar = this.X;
        oyVar.F.add(p0Var);
        oyVar.I = r1.size() - 1;
        oyVar.f();
        this.X.r.getText().clear();
        T4(true, null, null, false, true);
    }

    public final void g4(long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
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
                    if (((TLRPC.Dialog) this.R1.get(i13)).id == j10) {
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
        if (getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
            getMessagesController().markAllTopicsAsRead(j10);
        }
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i14 >= 0) {
            this.R1.remove(i14);
            this.e0[0].x.D();
            this.e0[0].q(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return (b4() || this.F3.f) ? org.telegram.ui.ActionBar.x4.a : org.telegram.ui.ActionBar.x4.b;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10 = 2;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W3, 1.0f);
            this.Z3 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new wv(this, i10));
        this.Z3.setInterpolator(org.telegram.ui.Components.es.g);
        this.Z3.setDuration(clamp);
        this.Z3.start();
        return this.Z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x03a4  */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        hg.m mVar;
        org.telegram.ui.Components.mm0 mm0Var;
        int i10;
        final int i11 = 0;
        org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6(this) { // from class: org.telegram.ui.tw
            public final /* synthetic */ yy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final /* synthetic */ void a(float f7) {
                int i12 = i11;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final void b() {
                switch (i11) {
                    case 0:
                        yy.D0(this.b);
                        break;
                    default:
                        yy yyVar = this.b;
                        iy iyVar = yyVar.C0;
                        if (iyVar != null) {
                            org.telegram.ui.ActionBar.y actionMode = iyVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.w8));
                            }
                            org.telegram.ui.ActionBar.u0 speedItem = yyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.SRC_IN));
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
        int i12 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i12));
        org.telegram.ui.Cells.s2 s2Var = this.X0;
        if (s2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(s2Var, 1, null, null, null, null, i12));
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(u0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        }
        int i13 = this.V2;
        Paint paint = this.f1;
        final int i14 = 1;
        if (i13 == 0) {
            if (this.l2) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i12));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, paint, null, null, i12));
            iy iyVar = this.C0;
            if (iyVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(iyVar.V, 32768, null, null, null, null, i12));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.s1}, null, !this.W ? org.telegram.ui.ActionBar.g6.A8 : org.telegram.ui.ActionBar.g6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, paint, null, null, i12));
            iy iyVar2 = this.C0;
            if (iyVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(iyVar2.V, 32768, null, null, null, null, i12));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.s1}, null, !this.W ? org.telegram.ui.ActionBar.g6.P8 : org.telegram.ui.ActionBar.g6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.R8));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.g6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 512, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.g6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.g6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h1, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.I5));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 == null || !kVar2.t()) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0, 0, new Class[]{org.telegram.ui.Components.w00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.u00.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.u00.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0, 0, new Class[]{org.telegram.ui.Components.w00.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.g6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.u00.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.u00.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.u00.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.u00.class}, null, null, null, org.telegram.ui.ActionBar.g6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.z0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.u00.class}, null, null, null, org.telegram.ui.ActionBar.g6.U9));
        }
        arrayList.addAll(w7.d6.a(new org.telegram.ui.ActionBar.h6(this) { // from class: org.telegram.ui.tw
            public final /* synthetic */ yy b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final /* synthetic */ void a(float f7) {
                int i122 = i14;
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final void b() {
                switch (i14) {
                    case 0:
                        yy.D0(this.b);
                        break;
                    default:
                        yy yyVar = this.b;
                        iy iyVar3 = yyVar.C0;
                        if (iyVar3 != null) {
                            org.telegram.ui.ActionBar.y actionMode = iyVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.w8));
                            }
                            org.telegram.ui.ActionBar.u0 speedItem = yyVar.C0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.SRC_IN));
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
        }, org.telegram.ui.ActionBar.g6.w8, i15));
        int i16 = 0;
        while (true) {
            if (i16 >= 3) {
                break;
            }
            if (i16 == 2) {
                iy iyVar3 = this.C0;
                if (iyVar3 != null) {
                    mm0Var = iyVar3.V;
                    if (mm0Var != null) {
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i11] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr2[1] = org.telegram.ui.Cells.i6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i11] = org.telegram.ui.Cells.s2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.g6.w0;
                        int i17 = org.telegram.ui.ActionBar.g6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr3, paint2, null, null, i17));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i11] = org.telegram.ui.Cells.s2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.g6.y0;
                        int i18 = org.telegram.ui.ActionBar.g6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr4, paint3, null, null, i18));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i11] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr5, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr6[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i11] = org.telegram.ui.ActionBar.g6.a1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.g6.a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr7[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i11] = org.telegram.ui.ActionBar.g6.g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.g6.h1;
                        int i19 = org.telegram.ui.ActionBar.g6.j9;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr7, null, drawableArr2, null, i19));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i11] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i11] = org.telegram.ui.ActionBar.g6.j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.g6.k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.g6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.g6.b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i11] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i11] = org.telegram.ui.ActionBar.g6.l1;
                        int i20 = org.telegram.ui.ActionBar.g6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr9, null, drawableArr4, null, i20));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i11] = org.telegram.ui.Cells.s2.class;
                        clsArr10[1] = org.telegram.ui.Cells.i6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
                        TextPaint textPaint = textPaintArr[i11];
                        TextPaint textPaint2 = textPaintArr[1];
                        i10 = i11;
                        Paint[] paintArr = new Paint[3];
                        paintArr[i10] = textPaint;
                        paintArr[1] = textPaint2;
                        paintArr[2] = org.telegram.ui.ActionBar.g6.D0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr10, null, paintArr, null, null, org.telegram.ui.ActionBar.g6.X8));
                        Class[] clsArr11 = new Class[2];
                        clsArr11[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr11[1] = org.telegram.ui.Cells.i6.class;
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
                        TextPaint textPaint3 = textPaintArr2[i10];
                        TextPaint textPaint4 = textPaintArr2[1];
                        Paint[] paintArr2 = new Paint[3];
                        paintArr2[i10] = textPaint3;
                        paintArr2[1] = textPaint4;
                        paintArr2[2] = org.telegram.ui.ActionBar.g6.E0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr11, null, paintArr2, null, null, org.telegram.ui.ActionBar.g6.Z8));
                        Class[] clsArr12 = new Class[1];
                        clsArr12[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr12, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.i9));
                        Class[] clsArr13 = new Class[1];
                        clsArr13[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr13, org.telegram.ui.ActionBar.g6.F0[i10], null, null, org.telegram.ui.ActionBar.g6.g9));
                        Class[] clsArr14 = new Class[1];
                        clsArr14[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr14, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.m9));
                        Class[] clsArr15 = new Class[1];
                        clsArr15[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr15, null, null, null, i19));
                        Class[] clsArr16 = new Class[1];
                        clsArr16[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr16, null, org.telegram.ui.ActionBar.g6.H0, null, null, org.telegram.ui.ActionBar.g6.p9));
                        Class[] clsArr17 = new Class[1];
                        clsArr17[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr17, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
                        Class[] clsArr18 = new Class[1];
                        clsArr18[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr18, org.telegram.ui.ActionBar.g6.J0, null, null, org.telegram.ui.ActionBar.g6.r9));
                        Class[] clsArr19 = new Class[1];
                        clsArr19[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr19, org.telegram.ui.ActionBar.g6.K0, null, null, i20));
                        Class[] clsArr20 = new Class[1];
                        clsArr20[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr20, org.telegram.ui.ActionBar.g6.v0, null, null, org.telegram.ui.ActionBar.g6.s9));
                        Class[] clsArr21 = new Class[1];
                        clsArr21[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr21, org.telegram.ui.ActionBar.g6.u0, null, null, org.telegram.ui.ActionBar.g6.t9));
                        Class[] clsArr22 = new Class[1];
                        clsArr22[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr5 = new Drawable[1];
                        drawableArr5[i10] = org.telegram.ui.ActionBar.g6.T0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr22, null, drawableArr5, null, org.telegram.ui.ActionBar.g6.u9));
                        Class[] clsArr23 = new Class[1];
                        clsArr23[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr6 = new Drawable[2];
                        drawableArr6[i10] = org.telegram.ui.ActionBar.g6.V0;
                        drawableArr6[1] = org.telegram.ui.ActionBar.g6.W0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr23, null, drawableArr6, null, org.telegram.ui.ActionBar.g6.v9));
                        Class[] clsArr24 = new Class[1];
                        clsArr24[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr7 = new Drawable[1];
                        drawableArr7[i10] = org.telegram.ui.ActionBar.g6.X0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr24, null, drawableArr7, null, org.telegram.ui.ActionBar.g6.w9));
                        Class[] clsArr25 = new Class[1];
                        clsArr25[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr25, org.telegram.ui.ActionBar.g6.x0, null, null, org.telegram.ui.ActionBar.g6.x9));
                        Class[] clsArr26 = new Class[1];
                        clsArr26[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr8 = new Drawable[1];
                        drawableArr8[i10] = org.telegram.ui.ActionBar.g6.Y0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr26, null, drawableArr8, null, org.telegram.ui.ActionBar.g6.y9));
                        Class[] clsArr27 = new Class[2];
                        clsArr27[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr27[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr9 = new Drawable[1];
                        drawableArr9[i10] = org.telegram.ui.ActionBar.g6.i1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr27, null, drawableArr9, null, org.telegram.ui.ActionBar.g6.A9));
                        Class[] clsArr28 = new Class[2];
                        clsArr28[i10] = org.telegram.ui.Cells.s2.class;
                        clsArr28[1] = org.telegram.ui.Cells.i6.class;
                        Drawable[] drawableArr10 = new Drawable[1];
                        drawableArr10[i10] = org.telegram.ui.ActionBar.g6.f1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr28, null, drawableArr10, null, org.telegram.ui.ActionBar.g6.z9));
                        Class[] clsArr29 = new Class[1];
                        clsArr29[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr11 = new Drawable[1];
                        drawableArr11[i10] = org.telegram.ui.ActionBar.g6.c1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr29, null, drawableArr11, null, org.telegram.ui.ActionBar.g6.B9));
                        Class[] clsArr30 = new Class[1];
                        clsArr30[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr12 = new Drawable[1];
                        drawableArr12[i10] = org.telegram.ui.ActionBar.g6.m1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr30, null, drawableArr12, null, i17));
                        Class[] clsArr31 = new Class[1];
                        clsArr31[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr13 = new Drawable[1];
                        drawableArr13[i10] = org.telegram.ui.ActionBar.g6.n1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr31, null, drawableArr13, null, org.telegram.ui.ActionBar.g6.Z5));
                        Class[] clsArr32 = new Class[1];
                        clsArr32[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr14 = new Drawable[1];
                        drawableArr14[i10] = org.telegram.ui.ActionBar.g6.o1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr32, null, drawableArr14, null, org.telegram.ui.ActionBar.g6.zj));
                        Class[] clsArr33 = new Class[1];
                        clsArr33[i10] = org.telegram.ui.Cells.s2.class;
                        Drawable[] drawableArr15 = new Drawable[3];
                        drawableArr15[i10] = org.telegram.ui.ActionBar.g6.p1;
                        drawableArr15[1] = org.telegram.ui.ActionBar.g6.q1;
                        drawableArr15[2] = org.telegram.ui.ActionBar.g6.r1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr33, null, drawableArr15, null, i18));
                        Class[] clsArr34 = new Class[1];
                        clsArr34[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr34, null, null, null, org.telegram.ui.ActionBar.g6.d9));
                        Class[] clsArr35 = new Class[1];
                        clsArr35[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr35, null, null, null, org.telegram.ui.ActionBar.g6.c9));
                        Class[] clsArr36 = new Class[1];
                        clsArr36[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr36, null, null, null, org.telegram.ui.ActionBar.g6.T8));
                        Class[] clsArr37 = new Class[1];
                        clsArr37[i10] = org.telegram.ui.Cells.s2.class;
                        int i21 = org.telegram.ui.ActionBar.g6.d6;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr37, null, null, null, i21));
                        Class[] clsArr38 = new Class[1];
                        clsArr38[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 8192, clsArr38, new String[]{"checkBox"}, null, null, null, i21));
                        Class[] clsArr39 = new Class[1];
                        clsArr39[i10] = org.telegram.ui.Cells.s2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 16384, clsArr39, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.g6.k7));
                        Class[] clsArr40 = new Class[1];
                        clsArr40[i10] = org.telegram.ui.Cells.s4.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr40, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.g6.h6));
                        Class[] clsArr41 = new Class[1];
                        clsArr41[i10] = org.telegram.ui.Cells.i6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr41, org.telegram.ui.ActionBar.g6.Q0, null, null, org.telegram.ui.ActionBar.g6.A6));
                        Class[] clsArr42 = new Class[1];
                        clsArr42[i10] = org.telegram.ui.Cells.i6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr42, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.p6));
                        org.telegram.ui.Cells.v3.a(arrayList, mm0Var);
                        Class[] clsArr43 = new Class[1];
                        clsArr43[i10] = org.telegram.ui.Cells.l4.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 4, clsArr43, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                        Class[] clsArr44 = new Class[1];
                        clsArr44[i10] = org.telegram.ui.Cells.b7.class;
                        int i22 = org.telegram.ui.ActionBar.g6.b7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 32, clsArr44, null, null, null, i22));
                        Class[] clsArr45 = new Class[1];
                        clsArr45[i10] = org.telegram.ui.Cells.b7.class;
                        int i23 = org.telegram.ui.ActionBar.g6.a7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 48, clsArr45, null, null, null, i23));
                        Class[] clsArr46 = new Class[1];
                        clsArr46[i10] = org.telegram.ui.Cells.e9.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 32, clsArr46, null, null, null, i22));
                        Class[] clsArr47 = new Class[1];
                        clsArr47[i10] = org.telegram.ui.Cells.e9.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 48, clsArr47, null, null, null, i23));
                        Class[] clsArr48 = new Class[1];
                        clsArr48[i10] = org.telegram.ui.Cells.e9.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, clsArr48, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.B6));
                        Class[] clsArr49 = new Class[1];
                        clsArr49[i10] = org.telegram.ui.Cells.r8.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 4, clsArr49, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.o6));
                        i16++;
                        i11 = i10;
                    }
                }
                i10 = i11;
                i16++;
                i11 = i10;
            } else {
                xy[] xyVarArr = this.e0;
                if (xyVarArr != null) {
                    mm0Var = i16 < xyVarArr.length ? xyVarArr[i16].a : null;
                    if (mm0Var != null) {
                    }
                }
                i10 = i11;
                i16++;
                i11 = i10;
            }
        }
        int i24 = i11;
        int i25 = org.telegram.ui.ActionBar.g6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i25));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i25));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.V7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.W7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.X7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Y7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Z7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.a8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.b8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.L7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.M7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.N7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.k9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.j9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.o9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Y8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.l9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.n9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.h9));
        if (this.e0 != null) {
            int i26 = i24;
            while (true) {
                xy[] xyVarArr2 = this.e0;
                if (i26 >= xyVarArr2.length) {
                    break;
                }
                if (this.V2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.i6(xyVarArr2[i26].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.i6(xyVarArr2[i26].a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                }
                uy uyVar = this.e0[i26].a;
                Class[] clsArr50 = new Class[1];
                clsArr50[i24] = org.telegram.ui.Cells.y2.class;
                int i27 = org.telegram.ui.ActionBar.g6.m9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar, 4, clsArr50, new String[]{"emptyTextView1"}, null, null, null, i27));
                uy uyVar2 = this.e0[i26].a;
                Class[] clsArr51 = new Class[1];
                clsArr51[i24] = org.telegram.ui.Cells.y2.class;
                int i28 = org.telegram.ui.ActionBar.g6.g9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar2, 4, clsArr51, new String[]{"emptyTextView2"}, null, null, null, i28));
                if (SharedConfig.archiveHidden) {
                    uy uyVar3 = this.e0[i26].a;
                    Class[] clsArr52 = new Class[1];
                    clsArr52[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.yj0[] yj0VarArr = new org.telegram.ui.Components.yj0[1];
                    yj0VarArr[i24] = org.telegram.ui.ActionBar.g6.u1;
                    int i29 = org.telegram.ui.ActionBar.g6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar3, clsArr52, yj0VarArr, "Arrow1", i29));
                    uy uyVar4 = this.e0[i26].a;
                    Class[] clsArr53 = new Class[1];
                    clsArr53[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.yj0[] yj0VarArr2 = new org.telegram.ui.Components.yj0[1];
                    yj0VarArr2[i24] = org.telegram.ui.ActionBar.g6.u1;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar4, clsArr53, yj0VarArr2, "Arrow2", i29));
                } else {
                    uy uyVar5 = this.e0[i26].a;
                    Class[] clsArr54 = new Class[1];
                    clsArr54[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.yj0[] yj0VarArr3 = new org.telegram.ui.Components.yj0[1];
                    yj0VarArr3[i24] = org.telegram.ui.ActionBar.g6.u1;
                    int i30 = org.telegram.ui.ActionBar.g6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar5, clsArr54, yj0VarArr3, "Arrow1", i30));
                    uy uyVar6 = this.e0[i26].a;
                    Class[] clsArr55 = new Class[1];
                    clsArr55[i24] = org.telegram.ui.Cells.s2.class;
                    org.telegram.ui.Components.yj0[] yj0VarArr4 = new org.telegram.ui.Components.yj0[1];
                    yj0VarArr4[i24] = org.telegram.ui.ActionBar.g6.u1;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar6, clsArr55, yj0VarArr4, "Arrow2", i30));
                }
                uy uyVar7 = this.e0[i26].a;
                Class[] clsArr56 = new Class[1];
                clsArr56[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr5 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr5[i24] = org.telegram.ui.ActionBar.g6.u1;
                int i31 = org.telegram.ui.ActionBar.g6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar7, clsArr56, yj0VarArr5, "Box2", i31));
                uy uyVar8 = this.e0[i26].a;
                Class[] clsArr57 = new Class[1];
                clsArr57[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr6 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr6[i24] = org.telegram.ui.ActionBar.g6.u1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar8, clsArr57, yj0VarArr6, "Box1", i31));
                uy uyVar9 = this.e0[i26].a;
                Class[] clsArr58 = new Class[1];
                clsArr58[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr7 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr7[i24] = org.telegram.ui.ActionBar.g6.x1;
                int i32 = org.telegram.ui.ActionBar.g6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar9, clsArr58, yj0VarArr7, "Arrow", i32));
                uy uyVar10 = this.e0[i26].a;
                Class[] clsArr59 = new Class[1];
                clsArr59[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr8 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr8[i24] = org.telegram.ui.ActionBar.g6.x1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar10, clsArr59, yj0VarArr8, "Line", i32));
                uy uyVar11 = this.e0[i26].a;
                Class[] clsArr60 = new Class[1];
                clsArr60[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr9 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr9[i24] = org.telegram.ui.ActionBar.g6.y1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar11, clsArr60, yj0VarArr9, "Arrow", i32));
                uy uyVar12 = this.e0[i26].a;
                Class[] clsArr61 = new Class[1];
                clsArr61[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr10 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr10[i24] = org.telegram.ui.ActionBar.g6.y1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar12, clsArr61, yj0VarArr10, "Line", i32));
                uy uyVar13 = this.e0[i26].a;
                Class[] clsArr62 = new Class[1];
                clsArr62[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr11 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr11[i24] = org.telegram.ui.ActionBar.g6.v1;
                int i33 = org.telegram.ui.ActionBar.g6.c9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar13, clsArr62, yj0VarArr11, "Arrow", i33));
                uy uyVar14 = this.e0[i26].a;
                Class[] clsArr63 = new Class[1];
                clsArr63[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr12 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr12[i24] = org.telegram.ui.ActionBar.g6.v1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar14, clsArr63, yj0VarArr12, "Box2", i32));
                uy uyVar15 = this.e0[i26].a;
                Class[] clsArr64 = new Class[1];
                clsArr64[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr13 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr13[i24] = org.telegram.ui.ActionBar.g6.v1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar15, clsArr64, yj0VarArr13, "Box1", i32));
                uy uyVar16 = this.e0[i26].a;
                Class[] clsArr65 = new Class[1];
                clsArr65[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr14 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr14[i24] = org.telegram.ui.ActionBar.g6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar16, clsArr65, yj0VarArr14, "Line 1", i33));
                uy uyVar17 = this.e0[i26].a;
                Class[] clsArr66 = new Class[1];
                clsArr66[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr15 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr15[i24] = org.telegram.ui.ActionBar.g6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar17, clsArr66, yj0VarArr15, "Line 2", i33));
                uy uyVar18 = this.e0[i26].a;
                Class[] clsArr67 = new Class[1];
                clsArr67[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr16 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr16[i24] = org.telegram.ui.ActionBar.g6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar18, clsArr67, yj0VarArr16, "Line 3", i33));
                uy uyVar19 = this.e0[i26].a;
                Class[] clsArr68 = new Class[1];
                clsArr68[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr17 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr17[i24] = org.telegram.ui.ActionBar.g6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar19, clsArr68, yj0VarArr17, "Cup Red", i32));
                uy uyVar20 = this.e0[i26].a;
                Class[] clsArr69 = new Class[1];
                clsArr69[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr18 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr18[i24] = org.telegram.ui.ActionBar.g6.z1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar20, clsArr69, yj0VarArr18, "Box", i32));
                uy uyVar21 = this.e0[i26].a;
                Class[] clsArr70 = new Class[1];
                clsArr70[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr19 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr19[i24] = org.telegram.ui.ActionBar.g6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar21, clsArr70, yj0VarArr19, "Arrow1", i32));
                uy uyVar22 = this.e0[i26].a;
                Class[] clsArr71 = new Class[1];
                clsArr71[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr20 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr20[i24] = org.telegram.ui.ActionBar.g6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar22, clsArr71, yj0VarArr20, "Arrow2", org.telegram.ui.ActionBar.g6.d9));
                uy uyVar23 = this.e0[i26].a;
                Class[] clsArr72 = new Class[1];
                clsArr72[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr21 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr21[i24] = org.telegram.ui.ActionBar.g6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar23, clsArr72, yj0VarArr21, "Box2", i32));
                uy uyVar24 = this.e0[i26].a;
                Class[] clsArr73 = new Class[1];
                clsArr73[i24] = org.telegram.ui.Cells.s2.class;
                org.telegram.ui.Components.yj0[] yj0VarArr22 = new org.telegram.ui.Components.yj0[1];
                yj0VarArr22[i24] = org.telegram.ui.ActionBar.g6.w1;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar24, clsArr73, yj0VarArr22, "Box1", i32));
                uy uyVar25 = this.e0[i26].a;
                Class[] clsArr74 = new Class[1];
                clsArr74[i24] = org.telegram.ui.Cells.xa.class;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar25, 0, clsArr74, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                int i34 = i26;
                uy uyVar26 = this.e0[i34].a;
                Class[] clsArr75 = new Class[1];
                clsArr75[i24] = org.telegram.ui.Cells.xa.class;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar26, 0, clsArr75, new String[]{"statusColor"}, null, null, h6Var2, org.telegram.ui.ActionBar.g6.y6));
                uy uyVar27 = this.e0[i34].a;
                Class[] clsArr76 = new Class[1];
                clsArr76[i24] = org.telegram.ui.Cells.xa.class;
                h6Var = h6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar27, 0, clsArr76, new String[]{"statusOnlineColor"}, null, null, h6Var2, org.telegram.ui.ActionBar.g6.il));
                uy uyVar28 = this.e0[i34].a;
                Class[] clsArr77 = new Class[1];
                clsArr77[i24] = org.telegram.ui.Cells.r8.class;
                int i35 = org.telegram.ui.ActionBar.g6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar28, 0, clsArr77, new String[]{"textView"}, null, null, null, i35));
                uy uyVar29 = this.e0[i34].a;
                Class[] clsArr78 = new Class[1];
                clsArr78[i24] = org.telegram.ui.Cells.r8.class;
                arrayList.add(new org.telegram.ui.ActionBar.i6(uyVar29, 0, clsArr78, new String[]{"imageView"}, null, null, null, i35));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.e0[i34].w, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.h6));
                mVar = this.e0[i34].d;
                mVar.getClass();
                Class[] clsArr79 = new Class[1];
                clsArr79[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, clsArr79, new String[]{"imageView"}, null, null, null, i27));
                Class[] clsArr80 = new Class[1];
                clsArr80[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, clsArr80, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.g6.U8));
                Class[] clsArr81 = new Class[1];
                clsArr81[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, clsArr81, new String[]{"headerTextView"}, null, null, null, i27));
                Class[] clsArr82 = new Class[1];
                clsArr82[i24] = org.telegram.ui.Cells.u.class;
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, clsArr82, new String[]{"messageTextView"}, null, null, null, i28));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                i26 = i34 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S9));
        iy iyVar4 = this.C0;
        if (iyVar4 != null) {
            org.telegram.ui.Components.so0 so0Var = iyVar4.b0;
            kc1 I = so0Var != null ? so0Var.I() : null;
            Class[] clsArr83 = new Class[1];
            clsArr83[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(I, 0, clsArr83, org.telegram.ui.ActionBar.g6.w0, null, null, org.telegram.ui.ActionBar.g6.U8));
            org.telegram.ui.Components.so0 so0Var2 = this.C0.b0;
            kc1 I2 = so0Var2 != null ? so0Var2.I() : null;
            Class[] clsArr84 = new Class[1];
            clsArr84[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(I2, 0, clsArr84, org.telegram.ui.ActionBar.g6.y0, null, null, org.telegram.ui.ActionBar.g6.V8));
            org.telegram.ui.Components.so0 so0Var3 = this.C0.b0;
            kc1 I3 = so0Var3 != null ? so0Var3.I() : null;
            Class[] clsArr85 = new Class[1];
            clsArr85[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(I3, 0, clsArr85, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
            org.telegram.ui.Components.so0 so0Var4 = this.C0.b0;
            kc1 I4 = so0Var4 != null ? so0Var4.I() : null;
            Class[] clsArr86 = new Class[1];
            clsArr86[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(I4, 0, clsArr86, org.telegram.ui.ActionBar.g6.N0, null, null, org.telegram.ui.ActionBar.g6.f9));
            org.telegram.ui.Components.so0 so0Var5 = this.C0.b0;
            kc1 I5 = so0Var5 != null ? so0Var5.I() : null;
            Class[] clsArr87 = new Class[1];
            clsArr87[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(I5, 0, clsArr87, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            org.telegram.ui.Components.so0 so0Var6 = this.C0.b0;
            org.telegram.ui.Components.mm0 I6 = so0Var6 != null ? so0Var6.I() : null;
            Class[] clsArr88 = new Class[1];
            clsArr88[i24] = org.telegram.ui.Cells.n4.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(I6, 0, clsArr88, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        }
        int i36 = i24;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i36 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i36];
            int i37 = org.telegram.ui.ActionBar.g6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView, 32, null, null, null, null, i37));
            UndoView undoView2 = undoViewArr[i36];
            Class[] clsArr89 = new Class[1];
            clsArr89[i24] = UndoView.class;
            int i38 = org.telegram.ui.ActionBar.g6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView2, 0, clsArr89, new String[]{"undoImageView"}, null, null, null, i38));
            UndoView undoView3 = undoViewArr[i36];
            Class[] clsArr90 = new Class[1];
            clsArr90[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView3, 0, clsArr90, new String[]{"undoTextView"}, null, null, null, i38));
            UndoView undoView4 = undoViewArr[i36];
            Class[] clsArr91 = new Class[1];
            clsArr91[i24] = UndoView.class;
            int i39 = org.telegram.ui.ActionBar.g6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView4, 0, clsArr91, new String[]{"infoTextView"}, null, null, null, i39));
            UndoView undoView5 = undoViewArr[i36];
            Class[] clsArr92 = new Class[1];
            clsArr92[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView5, 0, clsArr92, new String[]{"subinfoTextView"}, null, null, null, i39));
            UndoView undoView6 = undoViewArr[i36];
            Class[] clsArr93 = new Class[1];
            clsArr93[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView6, 0, clsArr93, new String[]{"textPaint"}, null, null, null, i39));
            UndoView undoView7 = undoViewArr[i36];
            Class[] clsArr94 = new Class[1];
            clsArr94[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView7, 0, clsArr94, new String[]{"progressPaint"}, null, null, null, i39));
            UndoView undoView8 = undoViewArr[i36];
            Class[] clsArr95 = new Class[1];
            clsArr95[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView8, clsArr95, new String[]{"leftImageView"}, "info1", i37));
            UndoView undoView9 = undoViewArr[i36];
            Class[] clsArr96 = new Class[1];
            clsArr96[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView9, clsArr96, new String[]{"leftImageView"}, "info2", i37));
            UndoView undoView10 = undoViewArr[i36];
            Class[] clsArr97 = new Class[1];
            clsArr97[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView10, clsArr97, new String[]{"leftImageView"}, "luc12", i39));
            UndoView undoView11 = undoViewArr[i36];
            Class[] clsArr98 = new Class[1];
            clsArr98[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView11, clsArr98, new String[]{"leftImageView"}, "luc11", i39));
            UndoView undoView12 = undoViewArr[i36];
            Class[] clsArr99 = new Class[1];
            clsArr99[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView12, clsArr99, new String[]{"leftImageView"}, "luc10", i39));
            UndoView undoView13 = undoViewArr[i36];
            Class[] clsArr100 = new Class[1];
            clsArr100[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView13, clsArr100, new String[]{"leftImageView"}, "luc9", i39));
            UndoView undoView14 = undoViewArr[i36];
            Class[] clsArr101 = new Class[1];
            clsArr101[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView14, clsArr101, new String[]{"leftImageView"}, "luc8", i39));
            UndoView undoView15 = undoViewArr[i36];
            Class[] clsArr102 = new Class[1];
            clsArr102[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView15, clsArr102, new String[]{"leftImageView"}, "luc7", i39));
            UndoView undoView16 = undoViewArr[i36];
            Class[] clsArr103 = new Class[1];
            clsArr103[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView16, clsArr103, new String[]{"leftImageView"}, "luc6", i39));
            UndoView undoView17 = undoViewArr[i36];
            Class[] clsArr104 = new Class[1];
            clsArr104[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView17, clsArr104, new String[]{"leftImageView"}, "luc5", i39));
            UndoView undoView18 = undoViewArr[i36];
            Class[] clsArr105 = new Class[1];
            clsArr105[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView18, clsArr105, new String[]{"leftImageView"}, "luc4", i39));
            UndoView undoView19 = undoViewArr[i36];
            Class[] clsArr106 = new Class[1];
            clsArr106[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView19, clsArr106, new String[]{"leftImageView"}, "luc3", i39));
            UndoView undoView20 = undoViewArr[i36];
            Class[] clsArr107 = new Class[1];
            clsArr107[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView20, clsArr107, new String[]{"leftImageView"}, "luc2", i39));
            UndoView undoView21 = undoViewArr[i36];
            Class[] clsArr108 = new Class[1];
            clsArr108[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView21, clsArr108, new String[]{"leftImageView"}, "luc1", i39));
            UndoView undoView22 = undoViewArr[i36];
            Class[] clsArr109 = new Class[1];
            clsArr109[i24] = UndoView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView22, clsArr109, new String[]{"leftImageView"}, "Oval", i39));
            i36++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.o5));
        int i40 = org.telegram.ui.ActionBar.g6.q7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ri));
        int i41 = org.telegram.ui.ActionBar.g6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xi));
        if (this.B1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.B1, 0, null, org.telegram.ui.ActionBar.g6.j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            ix ixVar = this.B1;
            Drawable[] drawableArr16 = new Drawable[1];
            drawableArr16[i24] = org.telegram.ui.ActionBar.g6.i3;
            arrayList.add(new org.telegram.ui.ActionBar.i6(ixVar, 0, null, null, drawableArr16, null, org.telegram.ui.ActionBar.g6.Td));
            ix ixVar2 = this.B1;
            Class[] clsArr110 = new Class[1];
            clsArr110[i24] = ChatActivityEnterView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(ixVar2, 4, clsArr110, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Ud));
            ix ixVar3 = this.B1;
            Class[] clsArr111 = new Class[1];
            clsArr111[i24] = ChatActivityEnterView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(ixVar3, 16777216, clsArr111, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Wd));
            ix ixVar4 = this.B1;
            Class[] clsArr112 = new Class[1];
            clsArr112[i24] = ChatActivityEnterView.class;
            arrayList.add(new org.telegram.ui.ActionBar.i6(ixVar4, TLObject.FLAG_23, clsArr112, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        }
        int i42 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i42));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i41));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.g8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.hh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.jk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.kk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.lk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.mk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.hk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.ik));
        hg.r0 r0Var = this.b0;
        if (r0Var != null) {
            arrayList.addAll(r0Var.getThemeDescriptions());
            this.b0.C1();
        }
        az azVar = this.h0;
        if (azVar != null) {
            azVar.a();
            this.h0.invalidate();
        }
        iy iyVar5 = this.C0;
        if (iyVar5 != null) {
            iyVar5.M(arrayList);
        }
        org.telegram.ui.Cells.a3 a3Var = this.M1;
        int i43 = 8;
        if (a3Var != null) {
            arrayList.addAll(w7.d6.a(new org.telegram.ui.Components.b7(new gj(a3Var, 20), i43), org.telegram.ui.ActionBar.g6.d6, i42, org.telegram.ui.ActionBar.g6.y6));
        }
        org.telegram.ui.Cells.ua uaVar = this.N1;
        if (uaVar != null) {
            arrayList.addAll(w7.d6.a(new org.telegram.ui.Components.b7(new gj(uaVar, 21), i43), org.telegram.ui.ActionBar.g6.d6, i42, org.telegram.ui.ActionBar.g6.y6, org.telegram.ui.ActionBar.g6.I6, i40));
        }
        org.telegram.ui.Cells.m mVar2 = this.L1;
        if (mVar2 != null) {
            arrayList.addAll(w7.d6.a(new org.telegram.ui.Components.b7(new gj(mVar2, 22), i43), org.telegram.ui.ActionBar.g6.d6, i42, org.telegram.ui.ActionBar.g6.y6, org.telegram.ui.ActionBar.g6.I6, i40));
        }
        return arrayList;
    }

    public final void h3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && lk0.o(parentActivity)) {
            if (z10) {
                showDialog(new lk0(parentActivity, !org.telegram.ui.Components.cf0.a(), new lw(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(parentActivity, new dw(this, 1)).a;
                this.T1 = a2Var;
                showDialog(a2Var);
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
            org.telegram.ui.Components.or0 or0Var = new org.telegram.ui.Components.or0(getParentActivity(), getResourceProvider());
            this.G2 = or0Var;
            int i10 = 0;
            or0Var.setLayoutClickListener(new zv(this, i10));
            this.G2.setOnModeChangeListener(new aw(this, i10));
            ix ixVar = this.B1;
            org.telegram.ui.Components.or0 or0Var2 = this.G2;
            if (or0Var2 == null) {
                ixVar.getClass();
            } else {
                ixVar.G1 = or0Var2;
                ixVar.addView(or0Var2, 0, w7.a6.e(-1, 48, 51));
                ixVar.g3 = false;
                ixVar.L();
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
                org.telegram.ui.Components.or0 or0Var3 = this.G2;
                or0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    or0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.or0 or0Var4 = this.G2;
                    or0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        or0Var4.e(charSequence2, true);
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

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        sx sxVar;
        return (this.j2 || (sxVar = this.F3) == null || sxVar.getFragment() == null) ? i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.d6)) > 0.699999988079071d : this.F3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        bh.f fVar;
        gh.d dVar;
        gh.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.k4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f4) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int dp3 = AndroidUtilities.dp(this.K ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        ww wwVar = this.z0;
        boolean z10 = false;
        int measuredHeight2 = dp3 + ((wwVar == null || wwVar.getVisibility() != 0) ? 0 : this.z0.getMeasuredHeight());
        org.telegram.ui.Components.xs xsVar = this.J1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((xsVar == null || xsVar.getVisibility() != 0) ? 0 : this.J1.getSumHeightOfAllVisibleChild()) + ((int) this.N);
        int measuredHeight3 = this.actionBar.getMeasuredHeight();
        this.u4.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (this.Z != null ? r9.getMeasuredHeight() : 0), this.b.e) + dp);
        boolean z11 = this.W;
        RectF rectF = this.v4;
        if (!z11) {
            if (this.B1 != null && this.y1 != null) {
                rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - k3(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            }
            fVar.g(z10 ? 2 : 1, this.t4);
            fVar.e(this.s4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar = this.l4;
            if (dVar != null) {
                dVar.i(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar.l();
            }
            dVar2 = this.m4;
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
        fVar.g(z10 ? 2 : 1, this.t4);
        fVar.e(this.s4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar = this.l4;
        if (dVar != null) {
        }
        dVar2 = this.m4;
        if (dVar2 == null) {
        }
    }

    public final void j4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i10 = 1;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.c6) null, false);
        e3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        o4 o4Var = new o4(this, i10);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = o4Var;
        showDialog(e3Var);
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
    public final void k4(View view, int i10, s4.g0 g0Var) {
        s4.g0 g0Var2;
        long j10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        MessageObject messageObject;
        long j11;
        long j12;
        org.telegram.ui.Components.so0 so0Var;
        sx sxVar;
        long j13;
        long j14;
        int i14;
        MessageObject messageObject2;
        long makeEncryptedDialogId;
        long j15;
        long j16;
        iy iyVar;
        TLRPC.Document greetingsSticker;
        boolean z11;
        iy iyVar2;
        int i15;
        Object I;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = g0Var instanceof hg.m;
        if (z12) {
            hg.m mVar = (hg.m) g0Var;
            int i17 = mVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    I = mVar.I(i10);
                    if (this.C2 == null && mVar.n && g0Var.j(i10) == 21) {
                        this.C2.L(this);
                        return;
                    }
                    if (I instanceof TLRPC.User) {
                        if (I instanceof TLRPC.Chat) {
                            j18 = ((TLRPC.Chat) I).id;
                        } else if (I instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.u(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new yy(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.u(null)) {
                                J4(j17, view);
                                return;
                            }
                            g0Var2 = g0Var;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            messageObject = null;
                            i13 = i15;
                            j12 = j17;
                            j11 = 0;
                            j10 = 0;
                        } else if (I instanceof TLRPC.TL_recentMeUrlChat) {
                            j18 = ((TLRPC.TL_recentMeUrlChat) I).chat_id;
                        } else if (I instanceof TLRPC.TL_recentMeUrlUser) {
                            j17 = ((TLRPC.TL_recentMeUrlUser) I).user_id;
                        } else {
                            if (!(I instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (I instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) I).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSet.id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.ty0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) I;
                            g0Var2 = g0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.g90(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j17 = -chat2.id;
                            i16 = 0;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            messageObject = null;
                            i13 = i15;
                            j12 = j17;
                            j11 = 0;
                            j10 = 0;
                        }
                        j17 = -j18;
                    } else {
                        j17 = ((TLRPC.User) I).id;
                    }
                    g0Var2 = g0Var;
                    i16 = 0;
                    i11 = i16;
                    z10 = false;
                    i12 = 0;
                    messageObject = null;
                    i13 = i15;
                    j12 = j17;
                    j11 = 0;
                    j10 = 0;
                }
            }
            i15 = 0;
            I = mVar.I(i10);
            if (this.C2 == null) {
            }
            if (I instanceof TLRPC.User) {
            }
            g0Var2 = g0Var;
            i16 = 0;
            i11 = i16;
            z10 = false;
            i12 = 0;
            messageObject = null;
            i13 = i15;
            j12 = j17;
            j11 = 0;
            j10 = 0;
        } else {
            g0Var2 = g0Var;
            iy iyVar3 = this.C0;
            if (iyVar3 == null || g0Var2 != (so0Var = iyVar3.b0)) {
                j10 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                messageObject = null;
                j11 = 0;
                j12 = 0;
            } else {
                Object J = so0Var.J(i10);
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
                        j10 = 0;
                        j14 = ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-dialogId))) ? MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true) : 0L;
                        iy iyVar4 = this.C0;
                        if (iyVar4 != null) {
                            org.telegram.ui.Components.so0 so0Var2 = iyVar4.b0;
                            so0Var2.j0.a(so0Var2.Z);
                        }
                        i14 = id2;
                        j13 = dialogId;
                    } else {
                        j10 = 0;
                        if (J instanceof String) {
                            String str2 = (String) J;
                            iy iyVar5 = this.C0;
                            if (iyVar5 != null && !iyVar5.b0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                ik0 ik0Var = new ik0(getParentActivity(), this);
                                ik0Var.x(str2, true);
                                ik0Var.show();
                            }
                        } else if (J instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) J;
                            org.telegram.ui.Components.g5.u(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((J instanceof TLRPC.TL_forumTopic) && (sxVar = this.F3) != null && (sxVar.getFragment() instanceof lg1)) {
                            j13 = -((lg1) this.F3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) J).id;
                            i14 = 0;
                            messageObject2 = null;
                        }
                        i14 = 0;
                        messageObject2 = null;
                        j14 = 0;
                        j13 = 0;
                    }
                    if (j13 == j10 && this.actionBar.t()) {
                        if (this.actionBar.u("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            J4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = j14;
                    i13 = 0;
                    i12 = i14;
                    messageObject = messageObject2;
                    i11 = 0;
                }
                i14 = 0;
                messageObject2 = null;
                j13 = makeEncryptedDialogId;
                j14 = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = j14;
                i13 = 0;
                i12 = i14;
                messageObject = messageObject2;
                i11 = 0;
            }
        }
        if (j12 == j10) {
            return;
        }
        if (this.l2) {
            if (e5(j12)) {
                if ((!getMessagesController().isForum(j12) && !getMessagesController().isCommunity(j12)) || c4(j12)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || m3(j12)) {
                            boolean f32 = f3(j12, view);
                            iy iyVar6 = this.C0;
                            if (iyVar6 != null && g0Var2 == iyVar6.b0) {
                                this.actionBar.h(true);
                                M3(j12, f32);
                            }
                            X4();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().isCommunity(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    yy yyVar = new yy(bundle2);
                    yyVar.W2 = this;
                    yyVar.C2 = this.C2;
                    presentFragment(yyVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().isForum(j12) || c4(j12)) && !getMessagesController().isMonoForumWithManageRights(j12))) {
                    L3(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                lg1 lg1Var = new lg1(bundle3);
                lg1Var.L0 = this;
                presentFragment(lg1Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (DialogObject.isEncryptedDialog(j12)) {
            bundle4.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else if (DialogObject.isUserDialog(j12)) {
            bundle4.putLong("user_id", j12);
        } else {
            if (i12 != 0) {
                j15 = j11;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(-j12));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle4.putLong("migrated_to", j12);
                    j16 = -chat4.migrated_to.channel_id;
                    bundle4.putLong("chat_id", -j16);
                    if (i12 != 0) {
                        bundle4.putInt("message_id", i12);
                    } else if (z10) {
                        TLObject tLObject = this.X1;
                        if (tLObject != null) {
                            iy iyVar7 = this.C0;
                            if (iyVar7 != null) {
                                iyVar7.b0.R(this.W1, tLObject);
                            }
                            this.X1 = null;
                        }
                    } else {
                        G3();
                    }
                    boolean z13 = LocaleController.isRTL && !this.j2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.X2 == j10;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j12) || !z13) && this.p2.dialogId == j12 && ((iyVar2 = this.C0) == null || g0Var2 != iyVar2.b0))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.s0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (t8.b.g(1, fragmentStack) instanceof fo)) {
                                ((fo) t8.b.g(1, fragmentStack)).Z9();
                                return;
                            }
                            if (fragmentStack.size() == 2) {
                                launchActivity.s0.l(true, false);
                                return;
                            } else {
                                if (getParentActivity() instanceof LaunchActivity) {
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(0);
                                    fragmentStack.clear();
                                    fragmentStack.add(m2Var);
                                    launchActivity.s0.U(true, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    iyVar = this.C0;
                    if (iyVar != null && iyVar.y0) {
                        iyVar.Q(false);
                    }
                    if (j12 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.D0 == null) {
                            this.D0 = new org.telegram.ui.Components.pv0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.cb0(bundle5, this.D0));
                        return;
                    }
                    if (this.n2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            fo foVar = new fo(bundle4);
                            a4(foVar, messageObject);
                            presentFragment(foVar);
                            return;
                        }
                        return;
                    }
                    this.z3 = true;
                    if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j12));
                        TLRPC.Dialog dialog2 = getMessagesController().getDialog(j12);
                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                        boolean z14 = dialog2 != null && dialog2.view_forum_as_messages;
                        int b10 = (this.X2 == j10 || chat5 == null) ? 0 : gi.u0.b(this.currentAccount, -chat5.id);
                        if (b10 == 3) {
                            showDialog(new org.telegram.ui.Components.g90(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (b10 == 4) {
                            org.telegram.messenger.q.r(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.zc.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z11 = chat5.monoforum) || chat5.forum) && j15 == j10)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new yy(bundle6));
                                return;
                            }
                            fo foVar2 = new fo(bundle4);
                            if (j15 != j10) {
                                og.d.a(foVar2, MessagesStorage.TopicKey.of(j12, j15));
                            }
                            if (z12 && DialogObject.isUserDialog(j12) && getMessagesController().dialogs_dict.f(j12) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                foVar2.B9 = greetingsSticker;
                                foVar2.C9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                sx sxVar2 = this.F3;
                                if (sxVar2.a != null) {
                                    sxVar2.a();
                                }
                            }
                            a4(foVar2, messageObject);
                            presentFragment(foVar2);
                            return;
                        }
                        if (z11) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            fo foVar3 = new fo(bundle4);
                            a4(foVar3, messageObject);
                            presentFragment(foVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            fo foVar4 = new fo(bundle4);
                            og.d.a(foVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(foVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.X2 != j10) {
                            if (!z14) {
                                presentFragment(new lg1(bundle4));
                                return;
                            }
                            fo foVar5 = new fo(bundle4);
                            a4(foVar5, messageObject);
                            presentFragment(foVar5);
                            return;
                        }
                        if (!z13) {
                            if (!z14) {
                                presentFragment(new lg1(bundle4));
                                return;
                            }
                            fo foVar6 = new fo(bundle4);
                            a4(foVar6, messageObject);
                            presentFragment(foVar6);
                            return;
                        }
                        if (this.j2) {
                            return;
                        }
                        if (z14) {
                            fo foVar7 = new fo(bundle4);
                            a4(foVar7, messageObject);
                            presentFragment(foVar7);
                            return;
                        }
                        sx sxVar3 = this.F3;
                        zx zxVar = sxVar3.a;
                        if (zxVar == null || (-zxVar.a) != j12) {
                            uy uyVar = this.e0[0].a;
                            uyVar.n3 = 0.0f;
                            uyVar.o3 = uyVar.m3;
                            uyVar.p3 = uyVar.g3 != 0.0f;
                            zx zxVar2 = new zx(bundle4);
                            zxVar2.M0 = this;
                            final sx sxVar4 = this.F3;
                            org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = sxVar4.n;
                            if (!sxVar4.r) {
                                sxVar4.w = parentLayout;
                                zxVar2.onFragmentCreate();
                                zxVar2.setInPreviewMode(true);
                                zxVar2.setParentLayout(parentLayout);
                                View performCreateView = zxVar2.performCreateView(sxVar4.getContext());
                                zxVar2.onResume();
                                sxVar4.b = performCreateView;
                                sxVar4.addView(performCreateView);
                                final zx zxVar3 = sxVar4.a;
                                l0 l0Var = zxVar2.e;
                                sxVar4.c = l0Var;
                                sxVar4.addView(l0Var);
                                sxVar4.a = zxVar2;
                                r41.Q = j10;
                                r41.Q = -zxVar2.a;
                                if (zxVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.k actionBar = zxVar2.getActionBar();
                                    sxVar4.d = actionBar;
                                    sxVar4.addView(actionBar);
                                    sxVar4.d.U0 = new uz0(sxVar4, 9);
                                }
                                if (zxVar3 != null) {
                                    final zx zxVar4 = sxVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.k kVar = sxVar4.x;
                                        if (kVar != null) {
                                            kVar.c();
                                        }
                                        zxVar4.onTransitionAnimationStart(true, false);
                                        sxVar4.E = zxVar3;
                                        sxVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.k kVar2 = new o1.k(new o1.j(0.0f));
                                        sxVar4.x = kVar2;
                                        kVar2.u = org.telegram.ui.Cells.d0.k(1000.0f, 400.0f, 1.0f);
                                        r41.f(zxVar3, zxVar4, 0.0f);
                                        sxVar4.x.b(new yd0(sxVar4, i18));
                                        sxVar4.x.a(new o1.f() { // from class: org.telegram.ui.p41
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z15, float f7, float f10) {
                                                r41 r41Var = sxVar4;
                                                if (r41Var.x == null) {
                                                    return;
                                                }
                                                r41Var.x = null;
                                                org.telegram.ui.ActionBar.m2 m2Var2 = zxVar4;
                                                m2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.m2 m2Var3 = zxVar3;
                                                r41.f(m2Var3, m2Var2, 1.0f);
                                                r41Var.v = false;
                                                r41Var.E = null;
                                                m2Var3.onPause();
                                                m2Var3.onFragmentDestroy();
                                                r41Var.removeView(m2Var3.getFragmentView());
                                                r41Var.removeView(m2Var3.getActionBar());
                                                r41Var.n.unlock();
                                            }
                                        });
                                        sxVar4.x.h();
                                    } else {
                                        zxVar4.onTransitionAnimationStart(true, false);
                                        zxVar4.onTransitionAnimationEnd(true, false);
                                        r41.f(zxVar3, zxVar4, 1.0f);
                                        sxVar4.v = false;
                                        sxVar4.E = null;
                                        zxVar3.onPause();
                                        zxVar3.onFragmentDestroy();
                                        sxVar4.removeView(zxVar3.getFragmentView());
                                        sxVar4.removeView(zxVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!sxVar4.f) {
                                    int i19 = 1;
                                    sxVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        sxVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        sxVar4.e = 0.0f;
                                        sxVar4.e(true);
                                        sxVar4.g();
                                        zxVar2.onTransitionAnimationStart(true, false);
                                        sxVar4.h.addUpdateListener(new o41(sxVar4, i19));
                                        sxVar4.h.addListener(new org.telegram.ui.Components.ql0(13, sxVar4, zxVar2));
                                        sxVar4.h.setDuration(250L);
                                        sxVar4.h.setInterpolator(org.telegram.ui.Components.es.f);
                                        sxVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        sxVar4.h.start();
                                    } else {
                                        sxVar4.e(true);
                                        zxVar2.onTransitionAnimationStart(true, false);
                                        zxVar2.onTransitionAnimationEnd(true, false);
                                        sxVar4.e = 1.0f;
                                        sxVar4.g();
                                        sxVar4.d(false);
                                    }
                                }
                                zxVar2.setPreviewDelegate(new nq0(sxVar4, 15));
                                WeakHashMap weakHashMap = r0.j0.a;
                                r0.z.c(sxVar4);
                            }
                        } else {
                            sxVar3.a();
                        }
                        iy iyVar8 = this.C0;
                        if (iyVar8 != null) {
                            iyVar8.R();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                j15 = j11;
            }
            j16 = j12;
            bundle4.putLong("chat_id", -j16);
            if (i12 != 0) {
            }
            if (LocaleController.isRTL) {
            }
            bundle4.putInt("dialog_folder_id", i11);
            bundle4.putInt("dialog_filter_id", i13);
            if (!AndroidUtilities.isTablet()) {
            }
            iyVar = this.C0;
            if (iyVar != null) {
                iyVar.Q(false);
            }
            if (j12 != getUserConfig().getClientUserId()) {
            }
            if (this.n2 != null) {
            }
        }
        j15 = j11;
        if (i12 != 0) {
        }
        if (LocaleController.isRTL) {
        }
        bundle4.putInt("dialog_folder_id", i11);
        bundle4.putInt("dialog_filter_id", i13);
        if (!AndroidUtilities.isTablet()) {
        }
        iyVar = this.C0;
        if (iyVar != null) {
        }
        if (j12 != getUserConfig().getClientUserId()) {
        }
        if (this.n2 != null) {
        }
    }

    public final void l3() {
        AndroidUtilities.runOnUIThread(new uv(this, 2), 300L);
    }

    public final boolean l4(View view, int i10, float f7, org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.so0 so0Var;
        org.telegram.ui.Components.so0 so0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && lm0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.S(f7)) {
                    return E4(s2Var);
                }
            }
            sx sxVar = this.F3;
            if (sxVar == null || !sxVar.c()) {
                iy iyVar = this.C0;
                if (iyVar != null && lm0Var == (so0Var2 = iyVar.b0)) {
                    Object J = so0Var2.J(i10);
                    if (!this.C0.b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, og.d.i(chat, this.currentAccount, false));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.id == getUserConfig().clientUserId) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r11.id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new bi.p1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                        }
                        return true;
                    }
                }
                iy iyVar2 = this.C0;
                if (iyVar2 == null || lm0Var != (so0Var = iyVar2.b0)) {
                    Object I = ((hg.m) lm0Var).I(i10);
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
                                lg1 lg1Var = new lg1(bundle);
                                lg1Var.L0 = this;
                                presentFragment(lg1Var);
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
                        k4(view, i10, lm0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.i6) || so0Var.O(i10)) ? 0L : ((org.telegram.ui.Cells.i6) view).getDialogId();
                    if (dialogId != 0) {
                        J4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean m3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 == 15 || i11 == 16 || this.h2 != null || !this.s2) {
            return true;
        }
        if (!DialogObject.isChatDialog(j10)) {
            if (!DialogObject.isEncryptedDialog(j10)) {
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
        long j11 = -j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            return true;
        }
        if (!this.q2 && ChatObject.isCanWriteToChannel(j11, this.currentAccount) && (i10 = this.T0) != 2 && i10 != 3) {
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
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(25));
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                k9Var.r(currentUser);
                org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(this, getParentActivity(), z10);
                linearLayout.addView(jh0Var, w7.a6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getParentActivity());
                if (z10) {
                    z9Var.setScaleX(0.833f);
                    z9Var.setScaleY(0.833f);
                }
                z9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                z9Var.getImageReceiver().setCurrentAccount(intValue);
                z9Var.e(currentUser, k9Var);
                jh0Var.addView(z9Var, w7.a6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.a6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 12));
                H.r(linearLayout, w7.a6.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    public final void n3(boolean z10) {
        hi.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.xs xsVar = this.J1;
        if (xsVar == null || (jVar = this.Q1) == null || (chatFull = this.Z2) == null) {
            return;
        }
        xsVar.i(jVar, (this.X2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
    }

    public final void n4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().deleteDialog(j10, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j10);
            }
        } else if (ChatObject.isNotInChat(chat)) {
            getMessagesController().deleteDialog(j10, 0, z11);
        } else {
            getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.V2);
    }

    public final void o3(xy xyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = xyVar.c.L0();
        int N0 = xyVar.c.N0();
        if (this.g3 || this.l3) {
            return;
        }
        ww wwVar = this.z0;
        if (wwVar != null && wwVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.b1 K = xyVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                Z3(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = xyVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = xyVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(xyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= O3(this.currentAccount, xyVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                z10 = (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) ? false : true;
                z11 = z15;
                if ((abs > 0 || N0 < O3(this.currentAccount, xyVar.s, this.V2, this.S1).size() - 10) && (abs != 0 || (!((i10 = xyVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.V2)))) {
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
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pw
                        @Override // java.lang.Runnable
                        public final void run() {
                            yy yyVar = yy.this;
                            if (z12) {
                                yyVar.getMessagesController().loadDialogs(yyVar.V2, -1, 100, z13);
                            }
                            if (z10) {
                                yyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                            } else {
                                yyVar.getClass();
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pw
            @Override // java.lang.Runnable
            public final void run() {
                yy yyVar = yy.this;
                if (z12) {
                    yyVar.getMessagesController().loadDialogs(yyVar.V2, -1, 100, z13);
                }
                if (z10) {
                    yyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                } else {
                    yyVar.getClass();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x068a A[LOOP:1: B:40:0x0688->B:41:0x068a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x06a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o4(ArrayList arrayList, int i10, boolean z10, boolean z11, HashSet hashSet) {
        boolean z12;
        int i11;
        int i12;
        HashSet hashSet2;
        int i13;
        int i14;
        ArrayList arrayList2;
        int i15;
        int i16;
        int i17;
        int i18;
        MessagesController.DialogFilter dialogFilter;
        long j10;
        UndoView V3;
        int i19;
        int i20;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        int i21;
        MessagesController.DialogFilter dialogFilter2;
        yy yyVar;
        org.telegram.ui.ActionBar.e3 e3Var;
        int size;
        int i22;
        boolean z13;
        int i23;
        TLRPC.User user2;
        TLRPC.User user3;
        String string;
        int i24;
        yy yyVar2 = this;
        int i25 = i10;
        if (yyVar2.getParentActivity() == null) {
            return;
        }
        int i26 = yyVar2.e0[0].s;
        int i27 = 7;
        boolean z14 = (i26 == 7 || i26 == 8) && (!yyVar2.actionBar.t() || yyVar2.actionBar.u(null));
        MessagesController.DialogFilter dialogFilter3 = z14 ? yyVar2.getMessagesController().selectedDialogFilter[yyVar2.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
        int size2 = arrayList.size();
        if (i25 == 105 || i25 == 107) {
            ArrayList<Long> arrayList3 = new ArrayList<>(arrayList);
            yyVar2.getMessagesController().addDialogToFolder(arrayList3, yyVar2.S2 == 0 ? 1 : 0, -1, null, 0L);
            if (yyVar2.S2 == 0) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                z12 = false;
                boolean z15 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                if (z15) {
                    i11 = 1;
                } else {
                    i11 = 1;
                    globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                }
                int i28 = z15 ? arrayList3.size() > i11 ? 4 : 2 : arrayList3.size() > i11 ? 5 : 3;
                UndoView V32 = yyVar2.V3();
                if (V32 != null) {
                    V32.l(0L, i28, null, new org.telegram.ui.Components.k31(23, yyVar2, arrayList3));
                }
            } else {
                z12 = false;
                ArrayList<TLRPC.Dialog> dialogs = yyVar2.getMessagesController().getDialogs(yyVar2.V2);
                if (yyVar2.e0 != null && dialogs.isEmpty() && !yyVar2.K) {
                    yyVar2.e0[0].a.setEmptyView(null);
                    yyVar2.e0[0].w.setVisibility(4);
                    yyVar2.finishFragment();
                }
            }
            yyVar2.Y3(z12);
            return;
        }
        int i29 = 3;
        int i30 = 100;
        if ((i25 == 100 || i25 == 108) && yyVar2.N2 != 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = yyVar2.getMessagesController().getDialogs(yyVar2.V2);
            int size3 = dialogs2.size();
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            while (true) {
                if (i31 >= size3) {
                    i12 = i30;
                    break;
                }
                i12 = i30;
                TLRPC.Dialog dialog = dialogs2.get(i31);
                if (dialog instanceof TLRPC.TL_dialogFolder) {
                    i13 = size3;
                } else if (yyVar2.d4(dialog)) {
                    i13 = size3;
                    if (DialogObject.isEncryptedDialog(dialog.id)) {
                        i33++;
                    } else {
                        i32++;
                    }
                } else {
                    i13 = size3;
                    i14 = i31;
                    if (!yyVar2.getMessagesController().isPromoDialog(dialog.id, false)) {
                        break;
                    }
                    i31 = i14 + 1;
                    size3 = i13;
                    i30 = i12;
                }
                i14 = i31;
                i31 = i14 + 1;
                size3 = i13;
                i30 = i12;
            }
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            for (int i37 = 0; i37 < size2; i37++) {
                Long l4 = (Long) arrayList.get(i37);
                long longValue = l4.longValue();
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) yyVar2.getMessagesController().dialogs_dict.f(longValue);
                if (dialog2 != null && !yyVar2.d4(dialog2)) {
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        i35++;
                    } else {
                        i34++;
                    }
                    if (dialogFilter3 != null && dialogFilter3.alwaysShow.contains(l4)) {
                        i36++;
                    }
                }
            }
            int size4 = z14 ? 100 - dialogFilter3.alwaysShow.size() : (yyVar2.V2 == 0 && dialogFilter3 == null) ? yyVar2.getUserConfig().isPremium() ? yyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : yyVar2.getMessagesController().dialogFiltersPinnedLimitDefault : UserConfig.getInstance(yyVar2.currentAccount).isPremium() ? yyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium : yyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
            if (i35 + i33 > size4 || (i34 + i32) - i36 > size4) {
                if (yyVar2.V2 == 0 && dialogFilter3 == null) {
                    showDialog(new sg.j0(0, yyVar2.currentAccount, yyVar2.getParentActivity(), this, null));
                    return;
                } else {
                    org.telegram.ui.Components.g5.t0(yyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", size4, new Object[0])), null);
                    return;
                }
            }
            hashSet2 = hashSet;
        } else {
            i12 = 100;
            if (i25 != 111) {
                hashSet2 = hashSet;
                if ((i25 == 102 || i25 == 103) && size2 > 1 && z10) {
                    HashSet hashSet3 = new HashSet();
                    boolean z16 = MessagesController.getInstance(yyVar2.currentAccount).canRevokePmInbox;
                    long j11 = MessagesController.getInstance(yyVar2.currentAccount).revokeTimePmLimit;
                    if (i25 == 102 && z16 && j11 == 2147483647L) {
                        int size5 = arrayList.size();
                        boolean z17 = false;
                        int i38 = 0;
                        while (i38 < size5) {
                            Object obj = arrayList.get(i38);
                            i38++;
                            Long l10 = (Long) obj;
                            if (DialogObject.isUserDialog(l10.longValue()) || DialogObject.isEncryptedDialog(l10.longValue())) {
                                if (DialogObject.isEncryptedDialog(l10.longValue())) {
                                    TLRPC.EncryptedChat encryptedChat2 = yyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l10.longValue())));
                                    user2 = encryptedChat2 != null ? yyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                                } else {
                                    user2 = yyVar2.getMessagesController().getUser(l10);
                                }
                                if (user2 != null) {
                                    ArrayList arrayList4 = (ArrayList) MessagesController.getInstance(yyVar2.currentAccount).dialogMessage.f(user2.id);
                                    boolean z18 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((MessageObject) arrayList4.get(0)).messageOwner == null || (!(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                    if (!user2.bot && !UserObject.isDeleted(user2) && user2.id != yyVar2.getUserConfig().getClientUserId() && !z18) {
                                        hashSet3.add(l10);
                                        z17 = true;
                                    }
                                }
                            }
                        }
                        z13 = z17;
                    } else {
                        z13 = false;
                    }
                    boolean z19 = i25 == 102;
                    int i39 = yyVar2.Q2;
                    ia iaVar = new ia(this, arrayList, i25, hashSet3, 5);
                    org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
                    Pattern pattern = org.telegram.ui.Components.g5.a;
                    int currentAccount = getCurrentAccount();
                    Activity parentActivity = getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
                    UserConfig.getInstance(currentAccount).getClientUserId();
                    org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                    boolean[] zArr = new boolean[1];
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.ui.Components.m3 m3Var = new org.telegram.ui.Components.m3(parentActivity, a2VarArr);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.G = 6;
                    alertDialog$Builder.n(m3Var);
                    TextView textView2 = new TextView(parentActivity);
                    boolean z20 = z13;
                    boolean z21 = z19;
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    if (z21) {
                        if (z20) {
                            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(parentActivity, 1, c6Var);
                            a2VarArr[0] = a2Var2;
                            a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                            a2VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                            i23 = 0;
                            a2VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            m3Var.addView(a2VarArr[0], w7.a6.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
                            a2VarArr[0].setOnClickListener(new org.telegram.ui.Components.t0(2, zArr));
                        } else {
                            i23 = 0;
                        }
                        int i40 = R.string.DeleteFewChatsTitle;
                        Object[] objArr = new Object[1];
                        objArr[i23] = LocaleController.formatPluralString("ChatsSelected", size2, new Object[i23]);
                        textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", i40, objArr));
                        textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
                    } else if (i39 != 0) {
                        textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", size2, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
                    } else {
                        textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", size2, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
                    }
                    m3Var.addView(textView2, w7.a6.a(-2.0f, 24.0f, 11.0f, 24.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
                    m3Var.addView(textView, w7.a6.a(-2.0f, 24.0f, 57.0f, 24.0f, 1.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
                    alertDialog$Builder.k(z21 ? LocaleController.getString("Delete", R.string.Delete) : i39 != 0 ? LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache) : LocaleController.getString("ClearHistory", R.string.ClearHistory), new org.telegram.ui.Components.t2(1, iaVar, zArr));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    showDialog(a2Var);
                    TextView textView3 = (TextView) a2Var.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        return;
                    }
                    return;
                }
                int i41 = 48;
                arrayList2 = arrayList;
                if (i25 == 106 && z10) {
                    if (size2 == 1) {
                        Long l11 = (Long) arrayList2.get(0);
                        l11.getClass();
                        user3 = yyVar2.getMessagesController().getUser(l11);
                    } else {
                        user3 = null;
                    }
                    boolean z22 = yyVar2.R2 != 0;
                    gw gwVar = new gw(2, yyVar2, arrayList2);
                    Pattern pattern2 = org.telegram.ui.Components.g5.a;
                    if (yyVar2.getParentActivity() != null) {
                        if (size2 == 1 && user3 == null) {
                            return;
                        }
                        Activity parentActivity2 = yyVar2.getParentActivity();
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                        org.telegram.ui.Cells.a2[] a2VarArr2 = new org.telegram.ui.Cells.a2[2];
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder2.n(linearLayout);
                        org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.a;
                        if (size2 == 1) {
                            String formatName = ContactsController.formatName(user3.first_name, user3.last_name);
                            a2Var3.R = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, formatName);
                            String string2 = LocaleController.getString(R.string.BlockUser);
                            a2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, formatName));
                            string = string2;
                        } else {
                            a2Var3.R = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", size2, new Object[0]));
                            string = LocaleController.getString(R.string.BlockUsers);
                            a2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", size2, new Object[0])));
                        }
                        int i42 = 2;
                        boolean[] zArr2 = {true, true};
                        int i43 = 0;
                        while (i43 < i42) {
                            if (i43 != 0 || z22) {
                                org.telegram.ui.Cells.a2 a2Var4 = new org.telegram.ui.Cells.a2(parentActivity2, 1);
                                a2VarArr2[i43] = a2Var4;
                                a2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                                if (i43 == 0) {
                                    a2VarArr2[i43].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                                } else {
                                    a2VarArr2[i43].e(LocaleController.getString(size2 == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                                }
                                a2VarArr2[i43].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                                linearLayout.addView(a2VarArr2[i43], w7.a6.n(-1, i41));
                                i24 = 7;
                                a2VarArr2[i43].setOnClickListener(new di.m4(zArr2, i43, i24));
                            } else {
                                i24 = i27;
                            }
                            i43++;
                            i27 = i24;
                            i42 = 2;
                            i41 = 48;
                        }
                        alertDialog$Builder2.k(string, new org.telegram.ui.Components.t2(4, gwVar, zArr2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        yyVar2.showDialog(a2Var3);
                        TextView textView4 = (TextView) a2Var3.d(-1);
                        if (textView4 != null) {
                            textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
                i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter3 != null && ((i25 == i12 || i25 == 108) && yyVar2.N2 != 0)) {
                    size = dialogFilter3.pinnedDialogs.size();
                    for (i22 = 0; i22 < size; i22++) {
                        i15 = Math.min(i15, dialogFilter3.pinnedDialogs.valueAt(i22));
                    }
                    i15 -= yyVar2.N2;
                }
                int i44 = i15;
                i16 = 0;
                i17 = 0;
                while (i16 < size2) {
                    Long l12 = (Long) arrayList2.get(i16);
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter3;
                    long longValue2 = l12.longValue();
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) yyVar2.getMessagesController().dialogs_dict.f(longValue2);
                    if (dialog3 != null) {
                        if (DialogObject.isEncryptedDialog(longValue2)) {
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.q.m(yyVar2.getMessagesController(), longValue2);
                            user = m10 != null ? yyVar2.getMessagesController().getUser(Long.valueOf(m10.user_id)) : new TLRPC.TL_userEmpty();
                            encryptedChat = m10;
                            chat = null;
                        } else {
                            if (DialogObject.isUserDialog(longValue2)) {
                                user = yyVar2.getMessagesController().getUser(l12);
                                chat = null;
                            } else {
                                chat = yyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                                user = null;
                            }
                            encryptedChat = null;
                        }
                        if (chat != null || user != null) {
                            boolean z23 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                            if (i25 == 100 || i25 == 108) {
                                if (yyVar2.N2 != 0) {
                                    if (!yyVar2.d4(dialog3)) {
                                        i17++;
                                        i21 = i44;
                                        dialogFilter2 = dialogFilter4;
                                        yyVar2.p4(longValue2, true, dialogFilter2, i21, size2 == 1);
                                        if (dialogFilter2 != null) {
                                            int i45 = i21 + 1;
                                            if (encryptedChat != null) {
                                                if (!dialogFilter2.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                                    dialogFilter2.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                                }
                                            } else if (!dialogFilter2.alwaysShow.contains(Long.valueOf(dialog3.id))) {
                                                dialogFilter2.alwaysShow.add(Long.valueOf(dialog3.id));
                                            }
                                            i21 = i45;
                                        }
                                    }
                                    i21 = i44;
                                    dialogFilter2 = dialogFilter4;
                                } else {
                                    i21 = i44;
                                    dialogFilter2 = dialogFilter4;
                                    if (yyVar2.d4(dialog3)) {
                                        i17++;
                                        yyVar2.p4(longValue2, false, dialogFilter2, i21, size2 == 1);
                                        i16++;
                                        i25 = i10;
                                        dialogFilter3 = dialogFilter2;
                                        i44 = i21;
                                    }
                                }
                                i16++;
                                i25 = i10;
                                dialogFilter3 = dialogFilter2;
                                i44 = i21;
                            } else if (i25 != 101) {
                                if (i25 == 102 || i25 == 103) {
                                    yyVar = yyVar2;
                                    if (size2 == 1) {
                                        if (i25 != 102 || !yyVar.U2) {
                                            boolean z24 = i25 == 103;
                                            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialog3.id);
                                            boolean z25 = i25 == 102;
                                            int i46 = i25;
                                            TLRPC.Chat chat2 = chat;
                                            org.telegram.ui.Components.g5.r(this, z24, chat2, user, isEncryptedDialog, z25, false, false, new gi.n0(yyVar, i46, chat2, longValue2, z23));
                                            return;
                                        }
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yyVar.getParentActivity());
                                        String string3 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                                        org.telegram.ui.ActionBar.a2 a2Var5 = alertDialog$Builder3.a;
                                        a2Var5.R = string3;
                                        a2Var5.T = LocaleController.getString(R.string.PsaHideChatAlertText);
                                        alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new aw(yyVar, 11));
                                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                                        yyVar.showDialog(a2Var5);
                                        return;
                                    }
                                    boolean z26 = z23;
                                    if (yyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                                        yyVar.getMessagesController().hidePromoDialog();
                                    } else if (i25 != 103 || yyVar.Q2 == 0) {
                                        yyVar2 = yyVar;
                                        yyVar2.n4(i25, longValue2, chat, z26, hashSet2 != null && hashSet2.contains(l12));
                                        i21 = i44;
                                        dialogFilter2 = dialogFilter4;
                                        i16++;
                                        i25 = i10;
                                        dialogFilter3 = dialogFilter2;
                                        i44 = i21;
                                    } else {
                                        yyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                                        yyVar2 = yyVar;
                                        i21 = i44;
                                        dialogFilter2 = dialogFilter4;
                                        i16++;
                                        i25 = i10;
                                        dialogFilter3 = dialogFilter2;
                                        i44 = i21;
                                    }
                                } else if (i25 == 104) {
                                    if (size2 == 1 && yyVar2.O2 == 1) {
                                        yy yyVar3 = yyVar2;
                                        yyVar3.showDialog(org.telegram.ui.Components.g5.E(longValue2, 0L, yyVar3, null), new vv(yyVar3, 2));
                                        return;
                                    }
                                    yyVar = yyVar2;
                                    if (yyVar.P2 == 0) {
                                        if (z11) {
                                            Pattern pattern3 = org.telegram.ui.Components.g5.a;
                                            if (yyVar.getParentActivity() == null) {
                                                e3Var = null;
                                            } else {
                                                org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(1, (Context) yyVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) null, false);
                                                e3Var2.fixNavigationBar();
                                                e3Var2.title = LocaleController.getString(R.string.Notifications);
                                                e3Var2.bigTitle = true;
                                                String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                                String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                                String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                                String string4 = LocaleController.getString(R.string.MuteDisable);
                                                CharSequence[] charSequenceArr = new CharSequence[4];
                                                charSequenceArr[0] = formatString;
                                                charSequenceArr[1] = formatString2;
                                                charSequenceArr[2] = formatString3;
                                                charSequenceArr[i29] = string4;
                                                mg.j jVar = new mg.j(4, arrayList2, yyVar);
                                                e3Var2.items = charSequenceArr;
                                                e3Var2.onClickListener = jVar;
                                                e3Var = e3Var2;
                                            }
                                            yyVar.showDialog(e3Var, new vv(yyVar, i29));
                                            return;
                                        }
                                        int i47 = i29;
                                        if (!yyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                            yyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                        }
                                        yyVar2 = yyVar;
                                        i29 = i47;
                                    } else if (yyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                        yyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                    }
                                }
                                yyVar2 = yyVar;
                            } else if (yyVar2.M2 != 0) {
                                yyVar2.g4(longValue2);
                            } else {
                                yyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                            }
                        }
                    }
                    i21 = i44;
                    dialogFilter2 = dialogFilter4;
                    i16++;
                    i25 = i10;
                    dialogFilter3 = dialogFilter2;
                    i44 = i21;
                }
                i18 = i25;
                dialogFilter = dialogFilter3;
                if (i18 == 104 && (size2 != 1 || yyVar2.O2 != 1)) {
                    org.telegram.ui.Components.zc.A(yyVar2, yyVar2.P2 != 0, null).j();
                }
                if (i18 != 100 || i18 == 108) {
                    if (dialogFilter == null) {
                        yy yyVar4 = yyVar2;
                        l10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, yyVar4, null);
                        yyVar2 = yyVar4;
                        j10 = 0;
                    } else {
                        j10 = 0;
                        yyVar2.getMessagesController().reorderPinnedDialogs(yyVar2.V2, null, 0L);
                    }
                    V3 = yyVar2.V3();
                    if (yyVar2.p3 && V3 != null) {
                        V3.m(j10, Integer.valueOf(i17), yyVar2.N2 == 0 ? 78 : 79);
                    }
                    i19 = i10;
                    i20 = 108;
                } else {
                    i20 = 108;
                    i19 = i18;
                }
                yyVar2.Y3((i19 != i20 || i19 == 100 || i19 == 102) ? false : true);
            }
            if (z10) {
                org.telegram.ui.Components.g5.u0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new kw(yyVar2, arrayList, i25, z11, hashSet));
                return;
            }
            hashSet2 = hashSet;
            int size6 = arrayList.size();
            int i48 = 0;
            while (i48 < size6) {
                Object obj2 = arrayList.get(i48);
                i48++;
                yyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
            }
        }
        arrayList2 = arrayList;
        i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (dialogFilter3 != null) {
            size = dialogFilter3.pinnedDialogs.size();
            while (i22 < size) {
            }
            i15 -= yyVar2.N2;
        }
        int i442 = i15;
        i16 = 0;
        i17 = 0;
        while (i16 < size2) {
        }
        i18 = i25;
        dialogFilter = dialogFilter3;
        if (i18 == 104) {
            org.telegram.ui.Components.zc.A(yyVar2, yyVar2.P2 != 0, null).j();
        }
        if (i18 != 100) {
        }
        if (dialogFilter == null) {
        }
        V3 = yyVar2.V3();
        if (yyVar2.p3) {
            V3.m(j10, Integer.valueOf(i17), yyVar2.N2 == 0 ? 78 : 79);
        }
        i19 = i10;
        i20 = 108;
        yyVar2.Y3((i19 != i20 || i19 == 100 || i19 == 102) ? false : true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.F3.c() || !this.F3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.m80 m80Var = this.L0;
            if (m80Var == null) {
                ww wwVar = this.z0;
                if (wwVar == null || !wwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.t()) {
                        if (!this.b.f) {
                            ww wwVar2 = this.z0;
                            if (wwVar2 != null && wwVar2.getVisibility() == 0 && !this.g3) {
                                ww wwVar3 = this.z0;
                                if (!wwVar3.O && !this.l3) {
                                    ArrayList arrayList = wwVar3.h;
                                    if (!arrayList.isEmpty() && wwVar3.L != ((org.telegram.ui.Components.s00) arrayList.get(0)).a) {
                                        if (z10) {
                                            ww wwVar4 = this.z0;
                                            ArrayList arrayList2 = wwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                wwVar4.f((org.telegram.ui.Components.s00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            ix ixVar = this.B1;
                            if (ixVar == null || !ixVar.r0()) {
                                px pxVar = this.E0;
                                if (pxVar.O != 0 || pxVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                pxVar.h.x0(0);
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
                        iy iyVar = this.C0;
                        if (iyVar != null && iyVar.getVisibility() == 0) {
                            this.C0.Q(false);
                        }
                        Y3(true);
                        return false;
                    }
                } else if (z10) {
                    wwVar.setIsEditing(false);
                    F4(false);
                    return false;
                }
            } else if (z10) {
                m80Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.F3.a();
            iy iyVar2 = this.C0;
            if (iyVar2 != null) {
                iyVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyHidden() {
        di.ab abVar;
        ww wwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                iy iyVar = this.C0;
                if (iyVar != null) {
                    iyVar.b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (wwVar = this.z0) != null && wwVar.getVisibility() == 0 && this.r.f) {
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
        y3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        di.d4 d4Var;
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
        AndroidUtilities.runOnUIThread(new nw(this, 4), 200L);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.m80 m80Var = this.L0;
        if (m80Var != null) {
            m80Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.a2 a2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (a2Var = this.T1) != null && dialog == a2Var && getParentActivity() != null) {
            h3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
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
            long j10 = this.arguments.getLong("community_id", 0L);
            this.X2 = j10;
            if (j10 != 0) {
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
        bi.x8 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new bi.k7(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.Q3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            gv gvVar = this.Q3;
            if (gvVar.getParent() != null) {
                ((ViewGroup) gvVar.getParent()).removeView(gvVar);
            }
            this.Q3 = null;
        }
        if (b4()) {
            bi.x8 storiesController2 = getMessagesController().getStoriesController();
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

    @Override // org.telegram.ui.ActionBar.m2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.J3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.J3 = null;
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.z0();
        }
        org.telegram.ui.Components.or0 or0Var = this.G2;
        if (or0Var != null) {
            or0Var.j();
        }
        org.telegram.ui.Components.k31 k31Var = this.H2;
        if (k31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(k31Var);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.o3.unlock();
        this.C2 = null;
        pb1 pb1Var = pb1.b;
        if (pb1Var != null) {
            pb1Var.dismiss();
            pb1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        ix ixVar = this.B1;
        int i10 = 0;
        if (ixVar == null || !ixVar.r0()) {
            while (true) {
                xy[] xyVarArr = this.e0;
                if (i10 >= xyVarArr.length) {
                    break;
                }
                xyVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.sc scVar = this.n3;
                if (scVar != null) {
                    scVar.l();
                }
            }
            iy iyVar = this.C0;
            if (iyVar != null) {
                iyVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f7);
        while (true) {
            xy[] xyVarArr2 = this.e0;
            if (i10 >= xyVarArr2.length) {
                break;
            }
            xyVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.sc scVar2 = this.n3;
            if (scVar2 != null) {
                scVar2.l();
            }
        }
        iy iyVar2 = this.C0;
        if (iyVar2 != null) {
            iyVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.sc scVar = this.S;
        if (scVar != null) {
            scVar.b();
            this.S = null;
        }
        sx sxVar = this.F3;
        if (sxVar != null) {
            sxVar.r = true;
            zx zxVar = sxVar.a;
            if (zxVar != null) {
                zxVar.onPause();
            }
        }
        org.telegram.ui.Components.m80 m80Var = this.L0;
        if (m80Var != null) {
            m80Var.u();
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.B0();
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
            xy[] xyVarArr = this.e0;
            if (i10 >= xyVarArr.length) {
                return;
            }
            xyVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
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
                            lk0.n();
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
                            AndroidUtilities.runOnUIThread(new nw(this, 3));
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        yy yyVar;
        xy xyVar;
        fx fxVar;
        org.telegram.ui.Components.so0 so0Var;
        di.ab abVar;
        super.onResume();
        px pxVar = this.E0;
        if (pxVar != null) {
            ArrayList arrayList = pxVar.x;
            bi.x8 x8Var = pxVar.s;
            x8Var.l(x8Var.g);
            x8Var.l(x8Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = x8Var.y(((bi.r) arrayList.get(i10)).c);
                if (y3 != null) {
                    x8Var.X(y3);
                }
            }
        }
        sx sxVar = this.F3;
        if (sxVar != null) {
            sxVar.r = false;
            zx zxVar = sxVar.a;
            if (zxVar != null) {
                zxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i11 = 0;
            while (true) {
                xy[] xyVarArr = this.e0;
                if (i11 >= xyVarArr.length) {
                    break;
                }
                xyVarArr[i11].d.l();
                i11++;
            }
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.C0();
        }
        long j10 = 0;
        if (!this.l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        iy iyVar = this.C0;
        if (iyVar != null && (so0Var = iyVar.b0) != null) {
            so0Var.l();
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
                yyVar = this;
                org.telegram.messenger.q1 q1Var = new org.telegram.messenger.q1(yyVar, z13, z11, z12, parentActivity);
                if (yyVar.t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(q1Var, j10);
            } else {
                yyVar = this;
            }
        } else {
            yyVar = this;
            if (!yyVar.l2 && yyVar.V2 == 0 && yyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new aw(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.zg0(21));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (yyVar.V2 == 0 && yyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new aw(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.zg0(22));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        G4();
        if (yyVar.e0 != null) {
            int i13 = 0;
            while (true) {
                xy[] xyVarArr2 = yyVar.e0;
                if (i13 >= xyVarArr2.length) {
                    break;
                }
                xy xyVar2 = xyVarArr2[i13];
                if (xyVar2.s == 0 && xyVar2.v == 2 && xyVar2.c.L0() == 0 && W3()) {
                    yyVar.e0[i13].c.h1(1, (int) yyVar.N);
                }
                if (i13 == 0) {
                    yyVar.e0[i13].d.getClass();
                } else {
                    yyVar.e0[i13].d.getClass();
                }
                i13++;
            }
        }
        I4();
        setBulletinDelegate(new c9(this, 4));
        if (yyVar.p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), yyVar.classGuid);
        }
        d5(0, false);
        W4(false, true);
        c5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            pb1.o(this);
        }
        y3();
        if (yyVar.z0 == null || (xyVar = yyVar.e0[0]) == null || (fxVar = xyVar.d) == null) {
            return;
        }
        int i14 = fxVar.h;
        if (i14 == 7 || i14 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i14 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                yyVar.z0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Y3 && this.Z3 == null) {
            C4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        di.ab abVar;
        yy yyVar;
        sx sxVar = this.F3;
        if (sxVar == null || !sxVar.c()) {
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
        if (!z10 && (yyVar = this.W2) != null) {
            yyVar.removeSelfFromStack();
        }
        y3();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        sx sxVar = this.F3;
        if (sxVar == null || !sxVar.c()) {
            di.ab abVar = this.K0;
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
        y3();
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            z3();
            B3();
            E3();
            r3();
            C3();
            oy oyVar = this.X;
            ne.b bVar = this.b;
            oyVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = zf.f0.b(bVar.e);
            org.telegram.ui.Components.z9 z9Var = this.a3;
            if (z9Var != null) {
                z9Var.setScaleX(b10);
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

    public final void p3() {
        if (this.e0 == null) {
            return;
        }
        int k32 = k3();
        int i10 = 0;
        while (true) {
            xy[] xyVarArr = this.e0;
            if (i10 >= xyVarArr.length) {
                return;
            }
            xy xyVar = xyVarArr[i10];
            if (xyVar != null) {
                uy uyVar = xyVar.a;
                uyVar.setPadding(0, uyVar.W2, 0, k32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p4(long j10, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        boolean z12;
        int i11;
        boolean pinDialog;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && W3() && this.e0[0].v == 2) ? 1 : 0;
        int L0 = this.e0[0].c.L0();
        if (dialogFilter != null) {
            int i13 = dialogFilter.pinnedDialogs.get(j10, TLObject.FLAG_31);
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
                    if (((TLRPC.Dialog) this.R1.get(i15)).id == j10) {
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
                dialogFilter.pinnedDialogs.put(j10, i10);
            } else {
                dialogFilter.pinnedDialogs.delete(j10);
            }
            if (z11) {
                getMessagesController().onFilterUpdate(dialogFilter);
            }
            pinDialog = true;
        } else {
            pinDialog = getMessagesController().pinDialog(j10, z10, null, -1L);
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
                    if (((TLRPC.Dialog) O3.get(i16)).id == j10) {
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
                xy xyVar = this.e0[0];
                xyVar.c.h1((xyVar.s == 0 && W3() && this.e0[0].v == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new uv(this, 24), 200L);
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

    @Override // org.telegram.ui.ActionBar.m2
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

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        boolean presentFragment = super.presentFragment(m2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = this.e0;
                if (i10 >= xyVarArr.length) {
                    break;
                }
                xyVarArr[i10].d.getClass();
                i10++;
            }
        }
        di.d4 d4Var = this.p0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        di.d4 d4Var2 = this.q0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        org.telegram.ui.Components.sc.e();
        return presentFragment;
    }

    public final void q3() {
        ih.f fVar = this.y1;
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
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
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
        xy xyVar;
        float P3 = P3(true);
        ww wwVar = this.z0;
        if (wwVar != null) {
            boolean z10 = wwVar.getAlpha() != P3;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, P3);
            this.z0.setAlpha(P3);
            this.z0.setScaleX(lerp);
            this.z0.setScaleY(lerp);
            this.z0.setVisibility(P3 > 0.0f ? 0 : 8);
            if (z10 && (xyVar = this.e0[0]) != null) {
                xyVar.a.requestLayout();
            }
        }
        P4();
    }

    public final void r4(xy xyVar) {
        int i10;
        if (xyVar.getVisibility() != 0) {
            return;
        }
        int i11 = xyVar.d.v;
        if (xyVar.s == 0 && W3() && xyVar.a.getChildCount() == 0 && xyVar.v == 2) {
            ((s4.b0) xyVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        xyVar.d.getClass();
        xyVar.d.U();
        int h = xyVar.d.h();
        if (h == 1 && i11 == 1 && xyVar.d.j(0) == 5) {
            xyVar.q(true);
        } else {
            xyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                xyVar.y.b(i11);
            }
        }
        try {
            xyVar.a.setEmptyView((this.V2 == 0 && this.X2 == 0) ? xyVar.w : null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        o3(xyVar);
    }

    public final void s3() {
        float f7 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ji.y1 y1Var = this.C1;
        if (y1Var != null) {
            y1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        ih.f fVar = this.y1;
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
        animatorSet.setInterpolator(org.telegram.ui.Components.es.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        px pxVar = this.E0;
        if (pxVar != null) {
            if (!this.G0 || z10) {
                pxVar.setVisibility(8);
            } else {
                pxVar.setVisibility(0);
            }
        }
        V4(true);
        R4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        ux uxVar;
        org.telegram.ui.Components.q5 q5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (uxVar = this.M0) != null && (uxVar.getContentView() instanceof r71)) {
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            r71 r71Var = (r71) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                q5Var = this.D3;
            }
            q5Var = null;
            r71Var.y(q5Var, titleTextView);
        }
        px pxVar = this.E0;
        if (pxVar != null) {
            org.telegram.ui.Components.s6 s6Var = pxVar.T;
            pxVar.U.a(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                pxVar.g0 = true;
                if (pxVar.h0 != i10) {
                    pxVar.h0 = i10;
                    s6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                pxVar.g0 = false;
                pxVar.h0 = 0;
                s6Var.c(pxVar.f0, !LocaleController.isRTL, true);
            }
            pxVar.a.a(pxVar.g0, true);
            pxVar.L0.v(s6Var);
        }
    }

    @Override // org.telegram.ui.jh0
    public final void t() {
        u4(true, true);
    }

    public final void t3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float S3 = 1.0f - S3();
        org.telegram.ui.Components.l20.d(this.actionBar.getBackButton(), Math.max(this.t3, f7 * S3 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t4(int i10) {
        org.telegram.ui.Components.s00 s00Var;
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
        ww wwVar = this.z0;
        if (tabsCount < 0) {
            wwVar.getClass();
        } else if (tabsCount < wwVar.getTabsCount()) {
            s00Var = (org.telegram.ui.Components.s00) wwVar.h.get(tabsCount);
            if (s00Var != null) {
                ww wwVar2 = this.z0;
                ArrayList arrayList = wwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                wwVar2.f((org.telegram.ui.Components.s00) i2.d.g(1, arrayList), arrayList.size() - 1);
                return;
            }
            xy[] xyVarArr = this.e0;
            if (xyVarArr == null || xyVarArr.length <= 0 || xyVarArr[0].h != s00Var.a) {
                this.z0.f(s00Var, tabsCount);
                return;
            }
            return;
        }
        s00Var = null;
        if (s00Var != null) {
        }
    }

    public final void u3() {
        org.telegram.ui.Components.l20.d(this.g0, com.google.android.gms.internal.play_billing.k3.C(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - S3(), 1.0f - this.c.e));
    }

    public final void u4(boolean z10, boolean z11) {
        sx sxVar = this.F3;
        if (sxVar == null || !sxVar.c()) {
            int i10 = (this.e0[0].s == 0 && W3() && this.e0[0].v == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                s4();
            } else {
                org.telegram.ui.Components.pl0 pl0Var = this.e0[0].r;
                pl0Var.b = 1;
                pl0Var.c(i10, i11, false, false);
                s4();
            }
        }
    }

    public final void v3() {
        org.telegram.ui.Components.l20.d(this.f0, com.google.android.gms.internal.play_billing.k3.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - S3(), 1.0f - this.c.e));
    }

    public final void v4(String str, boolean z10) {
        L4(true, false, true, false);
        oy oyVar = this.X;
        if (oyVar != null) {
            oyVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void w3() {
        org.telegram.ui.Components.l20.d(this.j0, com.google.android.gms.internal.play_billing.k3.C(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - S3(), 1.0f - this.c.e));
        px pxVar = this.E0;
        if (pxVar != null) {
            pxVar.invalidate();
        }
    }

    public final void w4(float f7) {
        this.c0 = f7;
        for (xy xyVar : this.e0) {
            uy uyVar = xyVar.a;
            for (int i10 = 0; i10 < uyVar.getChildCount(); i10++) {
                View childAt = uyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= xyVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void x3() {
        org.telegram.ui.Components.l20.d(this.l0, com.google.android.gms.internal.play_billing.k3.C(this.b.e, 1.0f - S3(), 1.0f - this.c.e, this.d.e));
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
        xy xyVar = this.e0[0];
        xyVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (xyVar.a.b0()) {
            this.e0[0].a.post(new nw(this, 9));
        } else {
            this.e0[0].d.l();
        }
    }

    public final void y3() {
        di.ab abVar;
        boolean z10 = !this.j2 && ((abVar = this.K0) == null || abVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        hh0 hh0Var = this.I3;
        if (hh0Var != null) {
            hh0Var.a.v.a(z10, true);
        }
    }

    public final void y4(boolean z10) {
        xy xyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            xy[] xyVarArr = this.e0;
            if (xyVarArr != null && (xyVar = xyVarArr[0]) != null) {
                xyVar.setLayerType(2, null);
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
                xy[] xyVarArr2 = this.e0;
                if (i10 >= xyVarArr2.length) {
                    break;
                }
                xy xyVar2 = xyVarArr2[i10];
                if (xyVar2 != null) {
                    xyVar2.setLayerType(0, null);
                    xyVar2.setClipChildren(true);
                    xyVar2.setClipToPadding(true);
                    xyVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        px pxVar = this.E0;
        if (pxVar != null) {
            pxVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.jh0
    public final gh.d z() {
        return this.m4;
    }

    public final void z3() {
        t3();
        org.telegram.ui.Components.l20.d(this.k0, (1.0f - this.b.e) * (1.0f - S3()) * (1.0f - this.c.e));
        u3();
        x3();
        v3();
        w3();
    }

    public final void z4(float f7) {
        xy[] xyVarArr = this.e0;
        if (xyVarArr != null) {
            int paddingTop = xyVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                xy[] xyVarArr2 = this.e0;
                if (i10 >= xyVarArr2.length) {
                    break;
                }
                xyVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f7 == this.N) {
            return;
        }
        this.N = f7;
        org.telegram.ui.Components.sc scVar = this.n3;
        if (scVar != null) {
            scVar.l();
        }
        if (this.E3 != null) {
            float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.E3;
            float f10 = (int) f7;
            float f11 = oVar.f;
            oVar.h = f10;
            oVar.setTranslationY(f11 + f10);
            this.E3.setAlpha(w7.s.a(currentActionBarHeight, 0.0f, 1.0f));
            this.E3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        B3();
        this.fragmentView.invalidate();
    }
}
