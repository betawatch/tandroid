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
import android.graphics.drawable.GradientDrawable;
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
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class uw extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, qg.b, qe.b, de0 {
    public static float B4;
    public static boolean y4;
    public jw A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int C0;
    public gv C1;
    public boolean C2;
    public Long C3;
    public cw D0;
    public mi.x1 D1;
    public nw D2;
    public Drawable D3;
    public boolean E;
    public org.telegram.ui.Components.os0 E0;
    public org.telegram.ui.ActionBar.q0 E1;
    public ArrayList E2;
    public org.telegram.ui.Components.e5 E3;
    public boolean F;
    public mv F0;
    public final TextPaint F1;
    public String F2;
    public org.telegram.ui.Cells.o F3;
    public boolean G;
    public org.telegram.ui.Components.nr G0;
    public ev G1;
    public CharSequence G2;
    public pv G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public FrameLayout H1;
    public org.telegram.ui.Components.ro0 H2;
    public final fv H3;
    public long I;
    public float I0;
    public ev I1;
    public org.telegram.ui.Components.p11 I2;
    public final fv I3;
    public ValueAnimator J;
    public float J0;
    public FrameLayout J1;
    public final ArrayList J2;
    public f J3;
    public ValueAnimator K;
    public float K0;
    public org.telegram.ui.Components.pr K1;
    public boolean K2;
    public za.p K3;
    public boolean L;
    public org.telegram.ui.Components.voip.r0 L0;
    public org.telegram.ui.Components.or L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public org.telegram.ui.Components.f60 M0;
    public org.telegram.ui.Cells.m M1;
    public int M2;
    public int M3;
    public boolean N;
    public rv N0;
    public org.telegram.ui.Cells.b3 N1;
    public boolean N2;
    public boolean N3;
    public float O;
    public boolean O0;
    public org.telegram.ui.Cells.ma O1;
    public int O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public ki.j R1;
    public int R2;
    public kt R3;
    public boolean S;
    public int S0;
    public ArrayList S1;
    public int S2;
    public String S3;
    public org.telegram.ui.Components.ac T;
    public int T0;
    public boolean T1;
    public int T2;
    public ArrayList T3;
    public float U;
    public int U0;
    public org.telegram.ui.ActionBar.s1 U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public boolean V0;
    public boolean V1;
    public int V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Components.ib0 W0;
    public boolean W1;
    public boolean W2;
    public boolean W3;
    public boolean X;
    public org.telegram.ui.Cells.t2 X0;
    public long X1;
    public int X2;
    public float X3;
    public iw Y;
    public org.telegram.ui.Cells.t2 Y0;
    public TLObject Y1;
    public uw Y2;
    public boolean Y3;
    public cg.o0 Z;
    public boolean Z0;
    public int Z1;
    public long Z2;
    public boolean Z3;
    public final int a;
    public sy0 a0;
    public boolean a1;
    public int a2;
    public TLRPC.Chat a3;
    public ValueAnimator a4;
    public final qe.a b;
    public org.telegram.ui.Components.m61 b0;
    public final ArrayList b1;
    public boolean b2;
    public TLRPC.ChatFull b3;
    public org.telegram.ui.Components.f30 b4;
    public final qe.a c;
    public kg.n0 c0;
    public boolean c1;
    public boolean c2;
    public org.telegram.ui.Components.k9 c3;
    public TLRPC.FileLocation c4;
    public final qe.a d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public org.telegram.ui.Components.u8 d3;
    public TLRPC.FileLocation d4;
    public final qe.a e;
    public ValueAnimator e0;
    public boolean e1;
    public int e2;
    public long e3;
    public org.telegram.ui.Components.ac e4;
    public final qe.a f;
    public tw[] f0;
    public org.telegram.ui.ActionBar.w1 f1;
    public boolean f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.q0 g0;
    public final Paint g1;
    public String g2;
    public boolean g3;
    public int g4;
    public final qe.a h;
    public org.telegram.ui.ActionBar.q0 h0;
    public ImageView h1;
    public String h2;
    public AnimatorSet h3;
    public int h4;
    public ww i0;
    public NumberTextView i1;
    public String i2;
    public boolean i3;
    public int i4;
    public boolean j0;
    public final ArrayList j1;
    public boolean j2;
    public boolean j3;
    public int j4;
    public org.telegram.ui.ActionBar.q0 k0;
    public org.telegram.ui.ActionBar.q0 k1;
    public boolean k2;
    public float k3;
    public final eh.g k4;
    public org.telegram.ui.ActionBar.q0 l0;
    public org.telegram.ui.ActionBar.q0 l1;
    public boolean l2;
    public boolean l3;
    public final si.f l4;
    public org.telegram.ui.ActionBar.q0 m0;
    public org.telegram.ui.ActionBar.q0 m1;
    public boolean m2;
    public int m3;
    public final si.f m4;
    public final qe.a n;
    public org.telegram.ui.ActionBar.q0 n0;
    public org.telegram.ui.ActionBar.q0 n1;
    public boolean n2;
    public boolean n3;
    public final si.c n4;
    public org.telegram.ui.Components.lg0 o0;
    public org.telegram.ui.ActionBar.y0 o1;
    public String o2;
    public boolean o3;
    public final eh.c o4;
    public org.telegram.ui.ActionBar.y0 p0;
    public org.telegram.ui.ActionBar.y0 p1;
    public String p2;
    public org.telegram.ui.Components.ac p3;
    public final eh.c p4;
    public gi.l3 q0;
    public org.telegram.ui.ActionBar.y0 q1;
    public final org.telegram.messenger.pr q2;
    public final g2.g q3;
    public final eh.c q4;
    public final qe.a r;
    public gi.l3 r0;
    public org.telegram.ui.ActionBar.y0 r1;
    public boolean r2;
    public boolean r3;
    public final eh.c r4;
    public final qe.a s;
    public boolean s0;
    public org.telegram.ui.ActionBar.y0 s1;
    public boolean s2;
    public boolean s3;
    public ru s4;
    public boolean t0;
    public org.telegram.ui.ActionBar.y0 t1;
    public boolean t2;
    public boolean t3;
    public final ArrayList t4;
    public org.telegram.ui.Components.l00 u0;
    public org.telegram.ui.ActionBar.y0 u1;
    public boolean u2;
    public boolean u3;
    public final RectF u4;
    public org.telegram.ui.Components.l00 v0;
    public float v1;
    public boolean v2;
    public float v3;
    public final RectF v4;
    public final sh.h w;
    public gi.d w0;
    public float w1;
    public boolean w2;
    public ValueAnimator w3;
    public int w4;
    public boolean x;
    public mh.f x0;
    public AnimatorSet x1;
    public boolean x2;
    public float x3;
    public int x4;
    public int y;
    public int y0;
    public float y1;
    public boolean y2;
    public float y3;
    public final UndoView[] z0;
    public kh.f z1;
    public boolean z2;
    public float z3;
    public static final boolean[] z4 = new boolean[4];
    public static final org.telegram.ui.Components.qp0 A4 = new org.telegram.ui.Components.qp0(3);

    public uw(Bundle bundle) {
        super(bundle);
        int i3 = Build.VERSION.SDK_INT;
        this.a = i3 >= 31 ? 48 : 0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.b = new qe.a(1, this, xqVar, 350L, false);
        this.c = new qe.a(2, this, xqVar, 350L, false);
        this.d = new qe.a(3, this, xqVar, 350L, false);
        this.e = new qe.a(4, this, xqVar, 350L, false);
        this.f = new qe.a(5, this, xqVar, 350L, false);
        this.h = new qe.a(6, this, xqVar, 350L, false);
        this.n = new qe.a(7, this, xqVar, 350L, false);
        this.r = new qe.a(8, this, xqVar, 350L, false);
        this.s = new qe.a(9, this, xqVar, 350L, false);
        this.w = new sh.h(new au(this, 18));
        this.y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.d0 = 1.0f;
        this.z0 = new UndoView[2];
        this.b1 = new ArrayList();
        this.g1 = new Paint();
        this.j1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.F1 = new TextPaint(1);
        this.V1 = true;
        this.d2 = true;
        this.j2 = true;
        this.q2 = new org.telegram.messenger.pr();
        this.J2 = new ArrayList();
        this.K2 = true;
        this.q3 = new g2.g((int[]) null);
        this.H3 = new fv(this, 0);
        this.I3 = new fv(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.t4 = arrayList;
        RectF rectF = new RectF();
        this.u4 = rectF;
        RectF rectF2 = new RectF();
        this.v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        si.c d = this.glassEngine.d(new du(this, 12));
        this.n4 = d;
        if (i3 >= 31) {
            eh.g gVar = new eh.g(false);
            this.k4 = gVar;
            si.f fVar = new si.f(d);
            this.m4 = fVar;
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            si.f fVar2 = new si.f(null);
            this.l4 = fVar2;
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.q4 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            eh.c cVar2 = new eh.c(fVar2, fVar2, fVar2);
            this.o4 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            this.p4 = new eh.c(fVar2, fVar2, fVar2);
        } else {
            this.k4 = null;
            this.l4 = null;
            this.m4 = null;
            this.o4 = new eh.c(d, d, d);
            this.q4 = new eh.c(d, d, d);
            this.p4 = new eh.c(d, d, d);
        }
        eh.c cVar3 = new eh.c(d, d, d);
        this.r4 = cVar3;
        eh.c cVar4 = this.q4;
        pi.q qVar = this.glassEngine;
        cVar4.j = qVar;
        this.o4.j = qVar;
        this.p4.j = qVar;
        cVar3.j = qVar;
    }

    public static void A0(uw uwVar) {
        if (uwVar.O3) {
            gi.l3 l3Var = uwVar.q0;
            if (l3Var != null) {
                l3Var.f(true);
            }
            ei.t6 o10 = org.telegram.messenger.hp.s1(uwVar.currentAccount).P1().o();
            if (o10 != null && o10.a(uwVar.currentAccount, 1)) {
                uwVar.showDialog(new vg.i0(o10.b(), uwVar.currentAccount, uwVar.getParentActivity(), uwVar, null));
                return;
            } else {
                gi.va D = gi.va.D(uwVar.getParentActivity(), uwVar.currentAccount);
                D.y = new av(uwVar);
                D.Q(null);
                return;
            }
        }
        gi.l3 l3Var2 = uwVar.r0;
        if (l3Var2 != null) {
            if (l3Var2.W) {
                return;
            } else {
                org.telegram.messenger.g0.E2(l3Var2);
            }
        }
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.uj, 0, new au(uwVar, 24), null);
        gi.l3 l3Var3 = new gi.l3(uwVar.getParentActivity(), 2);
        l3Var3.s(8.0f);
        l3Var3.d = 8000L;
        l3Var3.k(true);
        l3Var3.r(true);
        l3Var3.h = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(148.0f);
        l3Var3.u(S2);
        l3Var3.o(1.0f, -40.0f);
        l3Var3.j(uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        uwVar.r0 = l3Var3;
        l3Var3.setTranslationY((-uwVar.g4) - uwVar.i4);
        ((ViewGroup) uwVar.fragmentView).addView(uwVar.r0, b8.mf.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        uwVar.r0.w();
    }

    public static void B0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        uwVar.g5();
        org.telegram.ui.Components.ac G = org.telegram.ui.Components.fc.a0(uwVar).G(R.raw.gift, 4, org.telegram.messenger.bd.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(uw uwVar, int i3) {
        eh.g gVar = uwVar.k4;
        RectF rectF = uwVar.v4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (x7.u.a(i3, 4)) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int measuredHeight = (uwVar.fragmentView.getMeasuredHeight() - uwVar.g4) - org.telegram.messenger.g0.L(8.0f);
            int L2 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
            int L3 = org.telegram.messenger.g0.L(uwVar.L ? 81.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f) + uwVar.actionBar.getMeasuredHeight();
            jw jwVar = uwVar.A0;
            boolean z10 = false;
            int measuredHeight2 = L3 + ((jwVar == null || jwVar.getVisibility() != 0) ? 0 : uwVar.A0.getMeasuredHeight());
            org.telegram.ui.Components.pr prVar = uwVar.K1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((prVar == null || prVar.getVisibility() != 0) ? 0 : uwVar.K1.getSumHeightOfAllVisibleChild()) + ((int) uwVar.O);
            int measuredHeight3 = uwVar.actionBar.getMeasuredHeight();
            uwVar.u4.set(0.0f, -L, uwVar.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.W1(uwVar.b.e, sumHeightOfAllVisibleChild, org.telegram.messenger.g0.L(30.0f) + measuredHeight3 + (uwVar.a0 != null ? r9.getMeasuredHeight() : 0)) + L);
            if (uwVar.X) {
                rectF.set(0.0f, L2, uwVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, org.telegram.messenger.lc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            } else {
                if (uwVar.C1 != null && uwVar.z1 != null) {
                    rectF.set(0.0f, uwVar.fragmentView.getMeasuredHeight() - uwVar.w3(), uwVar.fragmentView.getMeasuredWidth(), uwVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, org.telegram.messenger.lc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
                gVar.g(z10 ? 2 : 1, uwVar.t4);
            }
            z10 = true;
            gVar.g(z10 ? 2 : 1, uwVar.t4);
        }
        gVar.e(uwVar.s4, uwVar.fragmentView.getMeasuredWidth(), uwVar.fragmentView.getMeasuredHeight());
    }

    public static void D0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        uwVar.g5();
        org.telegram.ui.Components.ac K = org.telegram.ui.Components.fc.a0(uwVar).K(R.raw.chats_infotip, org.telegram.messenger.bd.M0(2131753714, null), org.telegram.messenger.bd.M0(2131745505, null), new au(uwVar, 29));
        K.j = 5000;
        K.j();
    }

    public static void E0(uw uwVar) {
        try {
            ((org.telegram.ui.Components.ch0) ((org.telegram.ui.Components.u8) uwVar.N1.h.getImageReceiver().n0).K).H(true);
        } catch (Exception unused) {
        }
        if (uwVar.b4 == null) {
            org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
            uwVar.b4 = f30Var;
            f30Var.I = true;
            f30Var.a = uwVar;
            f30Var.b = new gw(uwVar);
            uwVar.getMediaDataController().x();
            uwVar.getMessagesController().d3();
            uwVar.getMessagesController().g3(uwVar.getUserConfig().f(), true, uwVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.hp.s1(uwVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(uwVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.h10.i(uwVar.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.bi biVar = uwVar.b4.c;
        if (biVar != null) {
            biVar.P0();
        }
        org.telegram.ui.Components.f30 f30Var2 = uwVar.b4;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        f30Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new au(uwVar, 28), new ju(uwVar, 3), 0);
    }

    public static /* synthetic */ void G0(uw uwVar, float f10, ValueAnimator valueAnimator) {
        uwVar.f0[0].setTranslationY((1.0f - uwVar.v3) * f10);
        uwVar.v3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i3 = 0; i3 < uwVar.actionBar.getChildCount(); i3++) {
            if (uwVar.actionBar.getChildAt(i3).getVisibility() == 0 && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getActionMode() && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getBackButton()) {
                uwVar.actionBar.getChildAt(i3).setAlpha(1.0f - uwVar.v3);
            }
        }
        uwVar.Q3();
        uwVar.I3();
        View view = uwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(uw uwVar) {
        org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(uwVar.getParentActivity(), uwVar.resourceProvider);
        ibVar.d(R.raw.email_check_inbox, new String[0]);
        ibVar.b.setText(org.telegram.messenger.bd.M0(2131742821, null));
        org.telegram.ui.Components.ac.g(uwVar, ibVar, 2750).j();
        try {
            uwVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(uw uwVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.c;
        if (arrayList.size() != 1) {
            xg.e1.l1(0, t1Var);
            return;
        }
        ai.b3 b3Var = new ai.b3(uwVar.getParentActivity(), uwVar.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        b3Var.e1(true);
        uwVar.showDialog(b3Var);
    }

    public static void J0(uw uwVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(uwVar).I(R.raw.gift, org.telegram.messenger.bd.M0(2131746864, null), org.telegram.messenger.bd.M0(2131746863, null));
            I.j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            uwVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(uwVar), R.raw.error, 36);
            return;
        }
        if (uwVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uwVar.getParentActivity(), uwVar.resourceProvider);
            String M0 = org.telegram.messenger.bd.M0(2131746860, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746861, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            uwVar.showDialog(s1Var);
        }
    }

    public static /* synthetic */ void K0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        uwVar.g5();
    }

    public static void X2(uw uwVar, float f10) {
        float f11;
        float f12;
        float i3 = Utilities.i(uwVar.y1 * 2.0f, 1.0f, 0.0f);
        mv mvVar = uwVar.F0;
        float f13 = (1.0f - uwVar.v3) * f10 * uwVar.I0;
        float f14 = 1.0f - i3;
        mvVar.setAlpha(f13 * f14);
        if (uwVar.L || uwVar.N) {
            float i10 = Utilities.i((-uwVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (uwVar.v3 == 1.0f) {
                i10 = 1.0f;
            }
            float i11 = Utilities.i(i10 / 0.5f, 1.0f, 0.0f);
            uwVar.F0.setClipTop(0);
            if (uwVar.L || !uwVar.N) {
                uwVar.F0.setTranslationY(((uwVar.U / 2.0f) + (Math.max(uwVar.O, -uwVar.g4()) + uwVar.x3)) - org.telegram.messenger.g0.L(8.0f));
                uwVar.F0.l(!uwVar.G3.c(), i10);
                if (uwVar.N) {
                    f11 = 1.0f - i11;
                    uwVar.actionBar.setTranslationY(0.0f);
                } else {
                    f12 = uwVar.I0;
                }
            } else {
                uwVar.F0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                uwVar.F0.setProgressToCollapse(1.0f);
                f12 = uwVar.I0;
            }
            f11 = 1.0f - f12;
            uwVar.actionBar.setTranslationY(0.0f);
        } else {
            if (uwVar.M) {
                uwVar.F0.setTranslationY((Math.max(uwVar.O, -uwVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                uwVar.F0.setProgressToCollapse(1.0f);
                mv mvVar2 = uwVar.F0;
                mvVar2.setClipTop((int) (org.telegram.messenger.g0.m - mvVar2.getY()));
            }
            f11 = 1.0f - uwVar.I0;
            uwVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            uwVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            uwVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - uwVar.v3;
            uwVar.actionBar.getTitlesContainer().setAlpha(f16);
            uwVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        uwVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.m);
        uwVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        uwVar.actionBar.getTitlesContainer().setScaleY(f17);
        uwVar.actionBar.getTitlesContainer().setScaleX(f17);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - uwVar.v3) * f15;
        uwVar.actionBar.getTitlesContainer().setAlpha(f18);
        uwVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void Y2(uw uwVar, Canvas canvas, int i3) {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (uwVar.parentLayout == null || uwVar.actionBar == null) {
            return;
        }
        float max = Math.max(uwVar.e.e, uwVar.h4());
        float f10 = 1.0f;
        float f11 = 1.0f - uwVar.y1;
        float f12 = max * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i3) {
            f10 = 0.0f;
            i3 = -1;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i3 <= 0 || (q4Var = uwVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) q4Var).p(canvas, (int) (f10 * 255.0f * f12), i3);
    }

    public static /* synthetic */ void Z(uw uwVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        uwVar.g5();
    }

    public static /* synthetic */ void a0(uw uwVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uwVar.v3 = floatValue;
        uwVar.f0[0].setTranslationY((-f10) * floatValue);
        for (int i3 = 0; i3 < uwVar.actionBar.getChildCount(); i3++) {
            if (uwVar.actionBar.getChildAt(i3).getVisibility() == 0 && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getActionMode() && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getBackButton()) {
                uwVar.actionBar.getChildAt(i3).setAlpha(1.0f - uwVar.v3);
            }
        }
        View view = uwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        uwVar.Q3();
        uwVar.I3();
    }

    public static void b0(uw uwVar) {
        ArrayList arrayList = uwVar.J2;
        org.telegram.ui.ActionBar.q4 q4Var = uwVar.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).y()) {
            uwVar.finishPreviewFragment();
            return;
        }
        if (uwVar.S0 != 10) {
            if (org.telegram.messenger.hp.s1(uwVar.currentAccount).v2()) {
                b.b(uwVar.currentAccount);
                return;
            } else {
                uwVar.presentFragment(new ContactsActivity(a1.g.k("destroyAfterSelect", true)));
                return;
            }
        }
        if (uwVar.D2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(org.telegram.messenger.pr.a(((Long) arrayList.get(i3)).longValue(), 0L));
        }
        uwVar.D2.y(uwVar, arrayList2, null, false, uwVar.K2, uwVar.L2, uwVar.M2, null);
    }

    public static /* synthetic */ void c0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "USERPIC_SETUP");
        uwVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(tw twVar) {
        pw pwVar = twVar.a;
        for (int i3 = 0; i3 < pwVar.getChildCount(); i3++) {
            View childAt = pwVar.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.V()) {
                    return t2Var;
                }
            }
        }
        return null;
    }

    public static void d0(uw uwVar) {
        PasskeysActivity.f0(uwVar.currentAccount, uwVar.getParentActivity(), uwVar.resourceProvider, true);
    }

    public static /* synthetic */ void e0(uw uwVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.h10.i(uwVar.currentAccount).e());
        uwVar.presentFragment(new wm(bundle));
    }

    public static /* synthetic */ void f0(uw uwVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull b22 = uwVar.getMessagesController().b2(uwVar.getUserConfig().e());
        TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
        if (b22 != null) {
            b22.flags2 |= 32;
            b22.birthday = tL_birthday;
        }
        uwVar.getMessagesController().m2();
        uwVar.getConnectionsManager().sendRequest(updatebirthday, new y9(uwVar, b22, tL_birthday2, 8), 1024);
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        uwVar.g5();
    }

    public static void g0(uw uwVar, tw twVar, View view, int i3) {
        int i10;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.t2;
        if (z10) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.o2) {
                uwVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (uwVar.U3()) {
            uwVar.A4(view, i3, 0.0f, twVar.d);
            return;
        }
        int i11 = uwVar.S0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.l8)) {
            twVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i3 == 1) {
            Bundle k10 = a1.g.k("forImport", true);
            k10.putLongArray("result", new long[]{uwVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = uwVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            y40 y40Var = new y40(k10);
            y40Var.Z = new av(uwVar);
            uwVar.presentFragment(y40Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = twVar.s) == 7 || i10 == 8)) {
            kg.k kVar = (kg.k) twVar.d.N.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.mo moVar = uwVar.getMessagesController().N[twVar.s - 7];
                if (moVar != null) {
                    int i13 = moVar.a;
                    org.telegram.ui.Components.rz rzVar = new org.telegram.ui.Components.rz(uwVar, false);
                    rzVar.R1 = -1;
                    rzVar.V1 = "";
                    rzVar.W1 = new ArrayList();
                    rzVar.Y1 = "";
                    rzVar.a2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    rzVar.b2 = arrayList;
                    rzVar.s2 = -1;
                    rzVar.v2 = -5;
                    rzVar.R1 = i13;
                    rzVar.T1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    rzVar.Z1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = uwVar.getMessagesController().Q0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.mo) arrayList2.get(i12)).a == i13) {
                                rzVar.V1 = ((org.telegram.messenger.mo) arrayList2.get(i12)).b;
                                break;
                            }
                            i12++;
                        }
                    }
                    rzVar.f1();
                    uwVar.showDialog(rzVar);
                    return;
                }
                return;
            }
        } else if (z10 && !uwVar.actionBar.v() && !uwVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Z1;
            org.telegram.messenger.g0.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        }
        uwVar.z4(view, i3, twVar.d);
    }

    public static /* synthetic */ void h0(uw uwVar) {
        uwVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(uwVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void i0(uw uwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.hp.s1(uwVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(uwVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new y9(uwVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(uw uwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, uwVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(uwVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.yj(b02.e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void j1(uw uwVar, boolean z10) {
        if (uwVar.f0 == null || uwVar.N3 == z10) {
            return;
        }
        uwVar.N3 = z10;
        int i3 = 0;
        while (true) {
            tw[] twVarArr = uwVar.f0;
            if (i3 >= twVarArr.length) {
                return;
            }
            if (z10) {
                twVarArr[i3].a.setScrollbarFadingEnabled(false);
            }
            uwVar.f0[i3].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                uwVar.f0[i3].a.setScrollbarFadingEnabled(true);
            }
            i3++;
        }
    }

    public static void k0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).e7.edit().putBoolean("storyhint", false).commit();
    }

    public static /* synthetic */ void l0(uw uwVar) {
        if (uwVar.b4.g()) {
            org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "USERPIC_SETUP");
            uwVar.g5();
        }
    }

    public static /* synthetic */ void n0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        uwVar.g5();
    }

    public static /* synthetic */ void o0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        uwVar.g5();
    }

    public static void p0(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.t4.e0(uwVar.currentAccount, tL_error, uwVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            uwVar.getNotificationCenter().k(org.telegram.messenger.hs.v1, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        uwVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        ci.e3 e3Var = new ci.e3(uwVar, j10, 25);
        Pattern pattern = org.telegram.ui.Components.t4.a;
        if (uwVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = uwVar.getCurrentAccount();
            Activity parentActivity = uwVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e11 = org.telegram.messenger.h10.i(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(org.telegram.messenger.bd.M0(2131749253, null));
            boolean z10 = org.telegram.messenger.bd.a0;
            frameLayout.addView(textView2, b8.mf.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                u8Var.q(chat);
                k9Var.e(chat, u8Var);
            } else if (org.telegram.messenger.l10.z(user)) {
                u8Var.p = 0.8f;
                u8Var.g(12);
                k9Var.j(null, null, u8Var, user);
            } else if (user.id == e11) {
                u8Var.p = 0.8f;
                u8Var.g(1);
                k9Var.j(null, null, u8Var, user);
            } else {
                u8Var.p = 1.0f;
                u8Var.r(user);
                k9Var.e(user, u8Var);
            }
            textView.setText(org.telegram.messenger.g0.X2(str));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749273, null), new org.telegram.ui.Components.t(e3Var, 3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            uwVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p4(wm wmVar, org.telegram.messenger.zi ziVar) {
        if (ziVar == null || !ziVar.s2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(ziVar.z) ? ziVar.z : ziVar.v;
            CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, ziVar.Y1, null);
            if (x12 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                org.telegram.ui.Components.tz[] tzVarArr = (org.telegram.ui.Components.tz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.tz.class);
                if (tzVarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(tzVarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(tzVarArr[0]);
                    for (int i3 = 1; i3 < tzVarArr.length; i3++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(tzVarArr[i3]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(tzVarArr[i3]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                for (int i10 = spanEnd; i10 <= spanStart2; i10++) {
                                    if (!Character.isWhitespace(spannableStringBuilder.charAt(i10))) {
                                        break;
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    wmVar.Ob(ziVar.M1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void q0(uw uwVar, int i3) {
        Object obj;
        org.telegram.ui.Components.wl0 wl0Var = uwVar.D0.r0;
        if (i3 < wl0Var.a0 || i3 >= wl0Var.b0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.r31 G = wl0Var.G(i3);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uwVar.getParentActivity(), uwVar.resourceProvider);
            String M0 = org.telegram.messenger.bd.M0(2131754180, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.l10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.Components.i41(10, uwVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(uw uwVar, int i3, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i3 != 102) {
            uwVar.D4(arrayList, i3, false, false, null);
            return;
        }
        uwVar.getMessagesController().t0 = true;
        uwVar.D4(arrayList, i3, false, false, z10 ? hashSet : null);
        org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
        messagesController.t0 = false;
        messagesController.getNotificationCenter().k(org.telegram.messenger.hs.s, Boolean.TRUE);
        uwVar.getMessagesController().J(uwVar.X2);
        int i10 = uwVar.X2;
        if (i10 == 0 || uwVar.d4(uwVar.currentAccount, uwVar.f0[0].s, i10, false).size() != 0) {
            return;
        }
        uwVar.f0[0].a.setEmptyView(null);
        uwVar.f0[0].x.setVisibility(4);
        uwVar.finishFragment();
    }

    public static void t0(uw uwVar, int i3, org.telegram.ui.Components.f60 f60Var) {
        if (uwVar.currentAccount == i3) {
            return;
        }
        f60Var.u();
        if (uwVar.getParentActivity() == null) {
            return;
        }
        nw nwVar = uwVar.D2;
        LaunchActivity launchActivity = (LaunchActivity) uwVar.getParentActivity();
        ArrayList arrayList = uwVar.E2;
        String str = uwVar.F2;
        CharSequence charSequence = uwVar.G2;
        gv gvVar = uwVar.C1;
        CharSequence fieldText = gvVar != null ? gvVar.getFieldText() : null;
        launchActivity.O0(i3);
        uw uwVar2 = new uw(uwVar.arguments);
        uwVar2.D2 = nwVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                uwVar2.Q4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    uwVar2.G2 = null;
                } else {
                    uwVar2.G2 = charSequence;
                    uwVar2.F2 = null;
                    uwVar2.E2 = null;
                    if (uwVar2.C1 != null) {
                        uwVar2.v3(fieldText);
                    } else {
                        uwVar2.V3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            uwVar2.E2 = null;
        } else {
            uwVar2.E2 = arrayList;
            uwVar2.F2 = null;
            uwVar2.N2 = false;
            if (uwVar2.C1 != null) {
                uwVar2.v3(fieldText);
            } else {
                uwVar2.V3 = fieldText;
            }
        }
        launchActivity.u0(uwVar2, false, true);
    }

    public static /* synthetic */ void u0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, uwVar.B3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        uwVar.g5();
    }

    public static void u1(uw uwVar, tw twVar, float f10) {
        if (uwVar.U == f10) {
            return;
        }
        uwVar.U = f10;
        if (f10 == 0.0f) {
            uwVar.V = false;
        }
        uwVar.F0.setOverscroll(f10);
        twVar.a.setViewsOffset(f10);
        twVar.a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        uwVar.fragmentView.invalidate();
        if (f10 <= org.telegram.messenger.g0.L(90.0f) || uwVar.V) {
            return;
        }
        mv mvVar = uwVar.F0;
        ValueAnimator valueAnimator = mvVar.I0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            mvVar.i(mvVar.q0, true);
            uwVar.V = true;
            uwVar.getOrCreateStoryViewer().G(new au(uwVar, 4));
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i3 = cVar.a;
        boolean[] zArr = z4;
        if (zArr[i3]) {
            return;
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        s12.X2();
        s12.U2(0, 0, 100, true, null);
        if (s12.s.isEmpty() && !TextUtils.isEmpty(s12.S3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = s12.S3;
            s12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.ij(s12, 4));
        }
        s12.g3(org.telegram.messenger.h10.i(i3).f(), false, 0);
        org.telegram.messenger.g5.r(i3).f();
        org.telegram.messenger.li.b0(i3).u(false);
        org.telegram.messenger.g0.i3(new xg(cVar, 18), 200L);
        Iterator it = s12.d4.iterator();
        while (it.hasNext()) {
            org.telegram.messenger.li.b0(i3).c1((String) it.next(), true, true);
        }
        zArr[i3] = true;
    }

    public static void v0(uw uwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            rc1.a(uwVar.getParentActivity(), new z(uwVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.G0(launchActivity, uwVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static boolean v1(uw uwVar, tw twVar) {
        if (uwVar.G3.c()) {
            return false;
        }
        int i3 = (int) (-uwVar.O);
        int f42 = uwVar.f4();
        int g42 = uwVar.g4();
        if (i3 == 0 || i3 == f42 || i3 == g42 || !twVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (g42 >= i3 || i3 >= f42) {
            if ((uwVar.v3 != 1.0f ? Utilities.i((-uwVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f) : 1.0f) < uwVar.F0.C0) {
                twVar.b.y(-i3);
                return true;
            }
            twVar.b.y(g42 - i3);
            return true;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int i10 = i3 - g42;
        if (i10 < L / 2) {
            twVar.b.y(-i10);
            return true;
        }
        twVar.b.y(L - i10);
        return true;
    }

    public static void w0(uw uwVar) {
        b.c(uwVar.currentAccount, uwVar.getParentActivity(), uwVar.getResourceProvider());
    }

    public static String w2(uw uwVar) {
        ArrayList arrayList = uwVar.J2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return org.telegram.messenger.bd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == uwVar.getUserConfig().e()) {
                sb2.append(org.telegram.messenger.bd.M0(2131745911, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.m5.l(uwVar.currentAccount, longValue) : org.telegram.messenger.m5.s(uwVar.currentAccount, longValue));
            }
        }
        return org.telegram.messenger.bd.a0(null, null, 2131745449, sb2.toString());
    }

    public static void x0(final int i3, final long j10, TLRPC.Chat chat, final uw uwVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        uwVar.n4(false);
        if (i3 == 103 && org.telegram.messenger.t3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.t3.t0(chat2)) {
                uwVar.getMessagesController().X(2, j10, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i3 == 102 && (i12 = uwVar.X2) != 0 && uwVar.d4(uwVar.currentAccount, uwVar.f0[0].s, i12, false).size() == 1) {
            uwVar.f0[0].x.setVisibility(4);
        }
        int i13 = -1;
        if (i3 == 102) {
            uwVar.M4(true, true);
            if (uwVar.S1 != null) {
                i11 = 0;
                while (i11 < uwVar.S1.size()) {
                    if (((TLRPC.Dialog) uwVar.S1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i11 = -1;
            uwVar.z3();
            i10 = i11;
        } else {
            i10 = -1;
        }
        UndoView k42 = uwVar.k4();
        if (k42 != null) {
            k42.j(i3 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.qu
                @Override // java.lang.Runnable
                public final void run() {
                    uwVar.C4(i3, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(uwVar.d4(uwVar.currentAccount, uwVar.f0[0].s, uwVar.X2, false));
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i14)).id == j10) {
                i13 = i14;
                break;
            }
            i14++;
        }
        if (i3 == 102) {
            if (i10 < 0 || i13 >= 0 || (arrayList = uwVar.S1) == null) {
                uwVar.M4(false, true);
                return;
            }
            arrayList.remove(i10);
            uwVar.f0[0].y.D();
            uwVar.f0[0].q(true);
        }
    }

    public static void y0(uw uwVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(uwVar.currentAccount);
        int i3 = a10.a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.c;
        if (t1Var != null && !set.contains(t1Var.a)) {
            set.add(a10.c.a);
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i3).e7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.hs.f(i3).k(org.telegram.messenger.hs.g5, new Object[0]);
        }
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        uwVar.g5();
        org.telegram.ui.Components.ac G = org.telegram.ui.Components.fc.a0(uwVar).G(R.raw.gift, 4, org.telegram.messenger.bd.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void z0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        uwVar.g5();
    }

    public final boolean A3(long j10) {
        int i3;
        int i10 = this.S0;
        if (i10 == 15 || i10 == 16 || this.i2 != null || !this.t2) {
            return true;
        }
        if (!org.telegram.messenger.m5.z(j10)) {
            if (!org.telegram.messenger.m5.C(j10)) {
                return true;
            }
            if (this.U0 == 0 && !this.V0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131745606, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            int i11 = this.U0;
            if (i11 == 3) {
                s1Var.U = org.telegram.messenger.bd.M0(2131744100, null);
            } else if (i11 != 0) {
                s1Var.U = org.telegram.messenger.bd.M0(2131747184, null);
            } else {
                s1Var.U = org.telegram.messenger.bd.M0(2131749112, null);
            }
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), null);
            showDialog(s1Var);
            return false;
        }
        long j11 = -j10;
        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j11));
        if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
            return true;
        }
        if (!this.r2) {
            TLRPC.Chat M03 = org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(j11));
            if ((org.telegram.messenger.t3.n(M03) || M03.megagroup) && (i3 = this.U0) != 2 && i3 != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String M04 = org.telegram.messenger.bd.M0(2131745606, null);
        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
        s1Var2.S = M04;
        int i12 = this.U0;
        if (i12 == 3) {
            s1Var2.U = org.telegram.messenger.bd.M0(2131744101, null);
        } else if (i12 == 2) {
            s1Var2.U = org.telegram.messenger.bd.M0(2131746595, null);
        } else {
            s1Var2.U = org.telegram.messenger.bd.M0(2131752440, null);
        }
        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
        showDialog(s1Var2);
        return false;
    }

    public final boolean A4(View view, int i3, float f10, org.telegram.ui.Components.sj0 sj0Var) {
        org.telegram.ui.Components.bm0 bm0Var;
        org.telegram.ui.Components.bm0 bm0Var2;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && sj0Var.d(i3) != 21) {
            if (!this.actionBar.v() && !org.telegram.messenger.g0.Q1() && !this.m2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.G3.c() && t2Var.Z(f10)) {
                    return T4(t2Var);
                }
            }
            pv pvVar = this.G3;
            if (pvVar == null || !pvVar.c()) {
                cw cwVar = this.D0;
                if (cwVar != null && sj0Var == (bm0Var2 = cwVar.e0)) {
                    Object I = bm0Var2.I(i3);
                    if (!this.D0.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131752054, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleChatAlertText", null, 2131752053, rg.c.i(this.currentAccount, chat, false));
                            } else {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.bd.M0(2131745911, null));
                            } else {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            }
                            F = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            F = org.telegram.messenger.m5.F(r14.id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752055, null), new ei.c1(this, F, 8));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        showDialog(s1Var);
                        TextView textView = (TextView) s1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                cw cwVar2 = this.D0;
                if (cwVar2 == null || sj0Var != (bm0Var = cwVar2.e0)) {
                    Object J = ((kg.m) sj0Var).J(i3);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.m2) {
                            if ((this.S0 == 3 || U3()) && v5(dialog.id)) {
                                if (this.S0 != 1 || !U3() || !this.n2 || !getMessagesController().t2(dialog.id)) {
                                    s3(dialog.id, view);
                                    o5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.S0 == 1);
                                bundle.putBoolean("quote", this.P0);
                                bundle.putBoolean("reply_to", this.O0);
                                m91 m91Var = new m91(bundle);
                                m91Var.M0 = this;
                                presentFragment(m91Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                y4(view);
                                return false;
                            }
                            if (!this.actionBar.v() || !s4(dialog)) {
                                Y4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.m2) {
                        z4(view, i3, sj0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.f6) || bm0Var.N(i3)) ? 0L : ((org.telegram.ui.Cells.f6) view).getDialogId();
                    if (dialogId != 0) {
                        Y4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.de0
    public final si.f B() {
        return this.m4;
    }

    public final void B3(boolean z10) {
        ki.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar == null || (jVar = this.R1) == null || (chatFull = this.b3) == null) {
            return;
        }
        prVar.i(jVar, (this.Z2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.R1.setTitle(org.telegram.messenger.bd.G(this.b3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void B4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i3 = 0; i3 < 4; i3++) {
            if (org.telegram.messenger.h10.i(i3).p()) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(12));
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.k6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.k6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.h10.i(intValue).f();
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.r(f10);
                gi.q3 q3Var = new gi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, b8.mf.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
                if (z10) {
                    k9Var.setScaleX(0.833f);
                    k9Var.setScaleY(0.833f);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().d = intValue;
                k9Var.e(f10, u8Var);
                q3Var.addView(k9Var, b8.mf.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.l10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, b8.mf.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ai.h3(this, intValue, H, 16));
                H.r(linearLayout, b8.mf.o(org.telegram.messenger.hs.G3, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
        H.z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        H.V(5);
        H.Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (getMessagesController().c2.get(r14.X2) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C3(tw twVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i3;
        int L0 = twVar.c.L0();
        int N0 = twVar.c.N0();
        if (this.i3 || this.n3) {
            return;
        }
        jw jwVar = this.A0;
        if (jwVar != null && jwVar.getVisibility() == 0 && this.A0.P) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            u4.d1 K = twVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.c2 = z14;
            if (z14) {
                o4(false);
            }
        } else {
            this.c2 = false;
        }
        int i10 = twVar.s;
        if (i10 == 7 || i10 == 8) {
            ArrayList T0 = getMessagesController().T0();
            int i11 = twVar.h;
            if (i11 >= 0 && i11 < T0.size()) {
                int i12 = ((org.telegram.messenger.mo) T0.get(twVar.h)).g;
                int i13 = org.telegram.messenger.hp.C8;
                if ((i12 & 128) == 0 && ((abs > 0 && N0 >= d4(this.currentAccount, twVar.s, 1, this.T1).size() - 10) || (abs == 0 && !getMessagesController().c2.get(1)))) {
                    boolean z15 = getMessagesController().c2.get(1);
                    boolean z16 = !z15;
                    z10 = (z15 && getMessagesController().d2.get(1)) ? false : true;
                    z11 = z16;
                    if (abs > 0 || N0 < d4(this.currentAccount, twVar.s, this.X2, this.T1).size() - 10) {
                        if (abs == 0 && ((i3 = twVar.s) == 7 || i3 == 8)) {
                        }
                        z12 = false;
                        z13 = false;
                        if (!z12 || z10) {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.su
                                @Override // java.lang.Runnable
                                public final void run() {
                                    uw uwVar = uw.this;
                                    if (z12) {
                                        uwVar.getMessagesController().U2(uwVar.X2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        uwVar.getMessagesController().U2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z17 = getMessagesController().c2.get(this.X2);
                    boolean z18 = !z17;
                    if (z17) {
                        if (getMessagesController().d2.get(this.X2)) {
                            z13 = z18;
                            z12 = false;
                            if (z12) {
                            }
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.su
                                @Override // java.lang.Runnable
                                public final void run() {
                                    uw uwVar = uw.this;
                                    if (z12) {
                                        uwVar.getMessagesController().U2(uwVar.X2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        uwVar.getMessagesController().U2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                    }
                    z13 = z18;
                    z12 = true;
                    if (z12) {
                    }
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.su
                        @Override // java.lang.Runnable
                        public final void run() {
                            uw uwVar = uw.this;
                            if (z12) {
                                uwVar.getMessagesController().U2(uwVar.X2, -1, 100, z13, null);
                            }
                            if (z10) {
                                uwVar.getMessagesController().U2(1, -1, 100, z11, null);
                            }
                        }
                    });
                }
            }
        }
        z10 = false;
        z11 = false;
        if (abs > 0) {
        }
        if (abs == 0) {
        }
        z12 = false;
        z13 = false;
        if (z12) {
        }
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.su
            @Override // java.lang.Runnable
            public final void run() {
                uw uwVar = uw.this;
                if (z12) {
                    uwVar.getMessagesController().U2(uwVar.X2, -1, 100, z13, null);
                }
                if (z10) {
                    uwVar.getMessagesController().U2(1, -1, 100, z11, null);
                }
            }
        });
    }

    public final void C4(int i3, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i3 == 103) {
            getMessagesController().X(1, j10, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().X(0, j10, z11);
            if (z10 && z11) {
                getMessagesController().w(j10);
            }
        } else if (org.telegram.messenger.t3.r0(chat)) {
            getMessagesController().X(0, j10, z11);
        } else {
            getMessagesController().g0(-j10, getMessagesController().a2(Long.valueOf(getUserConfig().e())), null, z11, false);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.hs.t, Long.valueOf(j10));
        }
        getMessagesController().J(this.X2);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void D4(java.util.ArrayList r40, int r41, boolean r42, boolean r43, java.util.HashSet r44) {
        /*
            Method dump skipped, instructions count: 2863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override // qg.b
    public final List E() {
        return Arrays.asList(new qg.a(org.telegram.messenger.bd.M0(2131751649, null)), new qg.a(org.telegram.messenger.bd.M0(2131752076, null), new au(this, 14)), new qg.a(org.telegram.messenger.bd.M0(2131751650, null), new au(this, 15)));
    }

    public final void E3() {
        if (this.f0 == null) {
            return;
        }
        int w32 = w3();
        int i3 = 0;
        while (true) {
            tw[] twVarArr = this.f0;
            if (i3 >= twVarArr.length) {
                return;
            }
            tw twVar = twVarArr[i3];
            if (twVar != null) {
                pw pwVar = twVar.a;
                pwVar.setPadding(0, pwVar.g3, 0, w32);
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E4(long j10, boolean z10, org.telegram.messenger.mo moVar, int i3, boolean z11) {
        boolean z12;
        int i10;
        boolean B3;
        boolean z13;
        int i11 = (this.f0[0].s == 0 && l4() && this.f0[0].w == 2) ? 1 : 0;
        int L0 = this.f0[0].c.L0();
        if (moVar != null) {
            int i12 = moVar.j.get(j10, TLObject.FLAG_31);
            if (!z10 && i12 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i13 = -1;
        if (L0 > i11 || !z11) {
            z12 = true;
        } else {
            M4(true, true);
            z3();
            if (this.S1 != null) {
                for (int i14 = 0; i14 < this.S1.size(); i14++) {
                    if (((TLRPC.Dialog) this.S1.get(i14)).id == j10) {
                        i10 = i14;
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = false;
        }
        i10 = -1;
        if (moVar != null) {
            LongSparseIntArray longSparseIntArray = moVar.j;
            if (z10) {
                longSparseIntArray.put(j10, i3);
            } else {
                longSparseIntArray.delete(j10);
            }
            if (z11) {
                getMessagesController().w3(moVar);
            }
            B3 = true;
        } else {
            B3 = getMessagesController().B3(j10, z10, null, -1L);
        }
        if (B3) {
            if (z12) {
                if (this.S0 != 10) {
                    o4(false);
                }
                J4(true, false);
            } else {
                ArrayList d42 = d4(this.currentAccount, this.f0[0].s, this.X2, false);
                int i15 = 0;
                while (true) {
                    if (i15 >= d42.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) d42.get(i15)).id == j10) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
        }
        if (z12) {
            return;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.S1;
            if (arrayList != null && i13 >= 0 && i10 != i13) {
                arrayList.add(i13, (TLRPC.Dialog) arrayList.remove(i10));
                this.f0[0].y.D();
                this.f0[0].q(true);
                tw twVar = this.f0[0];
                twVar.c.h1((twVar.s == 0 && l4() && this.f0[0].w == 2) ? 1 : 0, (int) this.O);
            } else if (i13 >= 0 && i10 == i13) {
                org.telegram.messenger.g0.i3(new au(this, 13), 200L);
            }
            z13 = true;
            if (z13) {
                M4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    @Override // qe.b
    public final void F(float f10, int i3) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i3 != 3 || (q0Var = this.m0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) q0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (org.telegram.messenger.az.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.li.b0(this.currentAccount).E;
            String q02 = PremiumPreviewFragment.q0(2);
            if (tL_help_premiumPromo != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_help_premiumPromo.video_sections.size()) {
                        i10 = -1;
                        break;
                    } else if (tL_help_premiumPromo.video_sections.get(i10).equals(q02)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    org.telegram.messenger.w7.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i10), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void F3() {
        kh.f fVar = this.z1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.z1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.hs.K2));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        N3();
    }

    public final void G3() {
        tw twVar;
        float e42 = e4(true);
        jw jwVar = this.A0;
        if (jwVar != null) {
            boolean z10 = jwVar.getAlpha() != e42;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.A0.setAlpha(e42);
            this.A0.setScaleX(T1);
            this.A0.setScaleY(T1);
            this.A0.setVisibility(e42 > 0.0f ? 0 : 8);
            if (z10 && (twVar = this.f0[0]) != null) {
                twVar.a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(tw twVar) {
        int i3;
        if (twVar.getVisibility() != 0) {
            return;
        }
        int i10 = twVar.d.w;
        if (twVar.s == 0 && l4() && twVar.a.getChildCount() == 0 && twVar.w == 2) {
            ((u4.b0) twVar.a.getLayoutManager()).h1(1, (int) this.O);
        }
        twVar.d.getClass();
        twVar.d.V();
        int b10 = twVar.d.b();
        if (b10 == 1 && i10 == 1 && twVar.d.d(0) == 5) {
            twVar.q(true);
        } else {
            twVar.q(false);
            if (b10 > i10 && (i3 = this.S0) != 11 && i3 != 12 && i3 != 13) {
                twVar.E.b(i10);
            }
        }
        try {
            twVar.a.setEmptyView((this.X2 == 0 && this.Z2 == 0) ? twVar.x : null);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(twVar);
    }

    public final void H3() {
        float f10 = this.n.e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        mi.x1 x1Var = this.D1;
        if (x1Var != null) {
            x1Var.setScaleX(T1);
            this.D1.setScaleY(T1);
            this.D1.setAlpha(f10);
            this.D1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        kh.f fVar = this.z1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            this.z1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.z1.getFadeView().setAlpha(f10);
            this.z1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void H4() {
        boolean z10;
        if (this.O == 0.0f || (z10 = this.L)) {
            return;
        }
        float f10 = z10 ? -g4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f10));
        animatorSet.setInterpolator(org.telegram.ui.Components.xq.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        float f10 = 1.0f - this.b.e;
        float h42 = 1.0f - h4();
        org.telegram.ui.Components.l00.d(this.actionBar.getBackButton(), Math.max(this.v3, f10 * h42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(int i3) {
        org.telegram.ui.Components.yy yyVar;
        if (this.A0 == null) {
            i5(true, true);
            if (this.A0 == null) {
                return;
            }
        }
        int tabsCount = this.A0.getTabsCount() - 1;
        ArrayList T0 = getMessagesController().T0();
        int i10 = 0;
        while (true) {
            if (i10 >= T0.size()) {
                break;
            }
            if (((org.telegram.messenger.mo) T0.get(i10)).a == i3) {
                tabsCount = i10;
                break;
            }
            i10++;
        }
        jw jwVar = this.A0;
        if (tabsCount < 0) {
            jwVar.getClass();
        } else if (tabsCount < jwVar.getTabsCount()) {
            yyVar = (org.telegram.ui.Components.yy) jwVar.h.get(tabsCount);
            if (yyVar != null) {
                jw jwVar2 = this.A0;
                ArrayList arrayList = jwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                jwVar2.f((org.telegram.ui.Components.yy) k2.p1.h(1, arrayList), arrayList.size() - 1);
                return;
            }
            tw[] twVarArr = this.f0;
            if (twVarArr == null || twVarArr.length <= 0 || twVarArr[0].h != yyVar.a) {
                this.A0.f(yyVar, tabsCount);
                return;
            }
            return;
        }
        yyVar = null;
        if (yyVar != null) {
        }
    }

    public final void J3() {
        org.telegram.ui.Components.l00.d(this.h0, com.google.android.recaptcha.internal.a.C(this.j0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void J4(boolean z10, boolean z11) {
        pv pvVar = this.G3;
        if (pvVar == null || !pvVar.c()) {
            int i3 = (this.f0[0].s == 0 && l4() && this.f0[0].w == 2) ? 1 : 0;
            int i10 = (!this.L || z11 || this.F0.g()) ? 0 : -org.telegram.messenger.g0.L(81.0f);
            if (!z10) {
                this.f0[0].c.h1(i3, i10);
                H4();
            } else {
                org.telegram.ui.Components.vi0 vi0Var = this.f0[0].r;
                vi0Var.b = 1;
                vi0Var.d(i3, i10, false, false);
                H4();
            }
        }
    }

    public final void K3() {
        org.telegram.ui.Components.l00.d(this.g0, com.google.android.recaptcha.internal.a.C(org.telegram.messenger.az.s.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void K4(String str, boolean z10) {
        a5(true, false, true, false);
        cg.o0 o0Var = this.Z;
        if (o0Var != null) {
            o0Var.b(true);
        }
        iw iwVar = this.Y;
        if (iwVar != null) {
            iwVar.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void L3() {
        org.telegram.ui.Components.l00.d(this.k0, com.google.android.recaptcha.internal.a.C(this.S0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - h4(), 1.0f - this.c.e));
        mv mvVar = this.F0;
        if (mvVar != null) {
            mvVar.invalidate();
        }
    }

    public final void L4(float f10) {
        this.d0 = f10;
        for (tw twVar : this.f0) {
            pw pwVar = twVar.a;
            for (int i3 = 0; i3 < pwVar.getChildCount(); i3++) {
                View childAt = pwVar.getChildAt(i3);
                if (childAt != null && RecyclerView.R(childAt) >= twVar.d.f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.l00.d(this.m0, com.google.android.recaptcha.internal.a.C(this.b.e, 1.0f - h4(), 1.0f - this.c.e, this.d.e));
    }

    public final void M4(boolean z10, boolean z11) {
        if (this.f0 == null || this.T1 == z10) {
            return;
        }
        if (z10) {
            this.S1 = new ArrayList(d4(this.currentAccount, this.f0[0].s, this.X2, false));
        } else {
            this.S1 = null;
        }
        this.T1 = z10;
        tw twVar = this.f0[0];
        twVar.d.H = z10;
        if (z10 || !z11) {
            return;
        }
        if (twVar.a.c0()) {
            this.f0[0].a.post(new au(this, 25));
        } else {
            this.f0[0].d.f();
        }
    }

    public final void N3() {
        org.telegram.ui.Components.voip.r0 r0Var;
        boolean z10 = !this.k2 && ((r0Var = this.L0) == null || r0Var.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8);
        f fVar = this.J3;
        if (fVar != null) {
            ((ee0) fVar.b).w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        tw twVar;
        if (org.telegram.messenger.az.o() <= 1 || !org.telegram.messenger.lc.e(32768)) {
            return;
        }
        if (z10) {
            tw[] twVarArr = this.f0;
            if (twVarArr != null && (twVar = twVarArr[0]) != null) {
                twVar.setLayerType(2, null);
                this.f0[0].setClipChildren(false);
                this.f0[0].setClipToPadding(false);
                this.f0[0].a.setClipChildren(false);
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
        if (this.f0 != null) {
            int i3 = 0;
            while (true) {
                tw[] twVarArr2 = this.f0;
                if (i3 >= twVarArr2.length) {
                    break;
                }
                tw twVar2 = twVarArr2[i3];
                if (twVar2 != null) {
                    twVar2.setLayerType(0, null);
                    twVar2.setClipChildren(true);
                    twVar2.setClipToPadding(true);
                    twVar2.a.setClipChildren(true);
                }
                i3++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        mv mvVar = this.F0;
        if (mvVar != null) {
            mvVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.l00.d(this.l0, (1.0f - this.b.e) * (1.0f - h4()) * (1.0f - this.c.e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        tw[] twVarArr = this.f0;
        if (twVarArr != null) {
            int paddingTop = twVarArr[0].a.getPaddingTop() + ((int) f10);
            int i3 = 0;
            while (true) {
                tw[] twVarArr2 = this.f0;
                if (i3 >= twVarArr2.length) {
                    break;
                }
                twVarArr2[i3].a.setTopGlowOffset(paddingTop);
                i3++;
            }
        }
        if (this.fragmentView == null || f10 == this.O) {
            return;
        }
        this.O = f10;
        org.telegram.ui.Components.ac acVar = this.p3;
        if (acVar != null) {
            acVar.l();
        }
        if (this.F3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.F3;
            float f11 = (int) f10;
            float f12 = oVar.f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.F3.setAlpha(b8.be.a(currentActionBarHeight, 0.0f, 1.0f));
            this.F3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        Q3();
        this.fragmentView.invalidate();
    }

    public final void P3() {
        String M0 = org.telegram.messenger.bd.M0(h4() > 0.5f ? 2131745716 : 2131745823, null);
        this.Y.r.setContentDescription(M0);
        this.Y.r.setHint(M0);
    }

    public final void P4(float f10) {
        this.y1 = f10;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.az.o() != 0) {
            org.telegram.messenger.lc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        if (this.Y == null) {
            return;
        }
        float a10 = 1.0f - b8.be.a(((-this.O) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = (this.S0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.v3, this.h.e)) * Math.max(this.b.e, (1.0f - h4()) * a10);
        this.Y.setAlpha(max);
        this.Y.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void Q4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.F2 = null;
            this.G2 = null;
            return;
        }
        this.F2 = str;
        this.G2 = null;
        this.E2 = null;
        if (this.C1 != null) {
            v3(charSequence);
        } else {
            this.V3 = charSequence;
        }
    }

    public final void R3() {
        if (this.a0 != null) {
            float f10 = (this.b0 != null ? 1.0f : 0.0f) * this.b.e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f10);
            this.a0.setScaleX(T1);
            this.a0.setScaleY(T1);
            this.a0.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.m61 m61Var = this.b0;
        qe.a aVar = this.s;
        if (m61Var != null) {
            float f11 = 1.0f - aVar.e;
            m61Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        kg.n0 n0Var = this.c0;
        if (n0Var != null) {
            float f12 = aVar.e;
            n0Var.setAlpha(f12);
            this.c0.setVisibility(f12 > 0.0f ? 0 : 8);
        }
    }

    public final void R4(float f10) {
        if (org.telegram.messenger.az.o() <= 0) {
            boolean z10 = org.telegram.messenger.r2.a;
            return;
        }
        if (this.X3 == f10) {
            return;
        }
        boolean z11 = true;
        if (org.telegram.messenger.az.o() > 1 && org.telegram.messenger.lc.e(32768)) {
            z11 = false;
        }
        this.Y3 = z11;
        this.X3 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.Y3) {
            float f11 = (1.0f - this.X3) * (-org.telegram.messenger.g0.L(40.0f));
            mv mvVar = this.F0;
            if (mvVar != null) {
                mvVar.setTranslationX(f11);
            }
            iw iwVar = this.Y;
            if (iwVar != null) {
                iwVar.setTranslationX(f11);
            }
            pv pvVar = this.G3;
            if (pvVar == null || pvVar.getFragmentView() == null || this.E) {
                return;
            }
            this.G3.getFragmentView().setTranslationX(f11);
            return;
        }
        float f12 = -org.telegram.messenger.g0.L(4.0f);
        float f13 = 1.0f - this.X3;
        float f14 = f12 * f13;
        float f15 = 1.0f - (f13 * 0.05f);
        mv mvVar2 = this.F0;
        if (mvVar2 != null) {
            mvVar2.setScaleX(f15);
            this.F0.setScaleY(f15);
            this.F0.setTranslationX(f14);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(0.0f);
        }
        iw iwVar2 = this.Y;
        if (iwVar2 != null) {
            iwVar2.setTranslationX(f14);
            this.Y.setScaleX(f15);
            this.Y.setScaleY(f15);
        }
        pv pvVar2 = this.G3;
        if (pvVar2 == null || pvVar2.getFragmentView() == null) {
            return;
        }
        if (!this.E) {
            this.G3.getFragmentView().setScaleX(f15);
            this.G3.getFragmentView().setScaleY(f15);
            this.G3.getFragmentView().setTranslationX(f14);
        }
        this.G3.getFragmentView().setPivotX(0.0f);
        this.G3.getFragmentView().setPivotY(0.0f);
    }

    public final void S3(boolean z10) {
        if (this.D0 == null || this.actionBar == null) {
            return;
        }
        int i3 = org.telegram.messenger.g0.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.a) + (this.b0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        org.telegram.ui.Components.pr prVar = this.K1;
        int c2 = measuredHeight + (prVar != null ? (int) prVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
        cw cwVar = this.D0;
        SparseArray sparseArray = cwVar.h;
        cwVar.X0 = c2;
        cwVar.Y0 = i3;
        ci.j1 j1Var = cwVar.b0;
        if (z10) {
            j1Var.q1(0, c2, 0, i3);
        } else {
            j1Var.setPadding(0, c2, 0, i3);
        }
        cwVar.P0.j(cwVar.X0, cwVar.Y0, z10);
        org.telegram.ui.Components.vl0 vl0Var = cwVar.c0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vl0Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = cwVar.X0;
        if (i10 != i11 || marginLayoutParams.bottomMargin != cwVar.Y0) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = cwVar.Y0;
            vl0Var.requestLayout();
        }
        org.telegram.ui.Components.im0.Q(cwVar.i0, cwVar.l0, cwVar.X0, cwVar.Y0, z10);
        org.telegram.ui.Components.im0.Q(cwVar.n0, cwVar.q0, cwVar.X0, cwVar.Y0, z10);
        org.telegram.ui.Components.im0.Q(cwVar.u0, cwVar.x0, cwVar.X0, cwVar.Y0, z10);
        org.telegram.ui.Components.bf0 bf0Var = cwVar.s0;
        int i12 = cwVar.X0;
        int i13 = cwVar.Y0;
        bf0Var.setClipToPadding(false);
        org.telegram.ui.Components.l41 l41Var = bf0Var.c;
        bf0Var.K = z10;
        bf0Var.setPadding(0, i12, 0, i13);
        if (z10) {
            l41Var.q1(0, i12, 0, i13);
        } else {
            l41Var.setPadding(0, i12, 0, i13);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) l41Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i12;
        marginLayoutParams2.bottomMargin = -i13;
        bf0Var.K = false;
        org.telegram.ui.Components.hl0 hl0Var = cwVar.J0;
        if (hl0Var != null) {
            hl0Var.b(cwVar.X0, cwVar.Y0, z10);
        }
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) sparseArray.valueAt(i14);
            if (view instanceof wz) {
                ((wz) view).j(cwVar.X0, cwVar.Y0, z10);
            }
        }
        for (int i15 = 0; i15 < cwVar.getChildCount(); i15++) {
            if (cwVar.getChildAt(i15) instanceof wz) {
                ((wz) cwVar.getChildAt(i15)).j(cwVar.X0, cwVar.Y0, z10);
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.p11(17, this, r1), new xg(r1, 17));
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, getResourceProvider());
        h.O = n6Var;
        h.V0 = 49;
        h.show();
        org.telegram.ui.ActionBar.t2[] t2VarArr = {h};
        h.P(org.telegram.ui.ActionBar.k6.h5);
    }

    public final void T3() {
        if (this.K1 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, 1.0f);
            this.K1.setAlpha(1.0f);
            this.K1.setScaleX(T1);
            this.K1.setScaleY(T1);
            this.K1.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0132, code lost:
    
        if ((r3.size() + r9.h.size()) > 100) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T4(org.telegram.ui.Cells.t2 t2Var) {
        long j10;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        int i3;
        boolean z10;
        int i10;
        LinearLayout linearLayout;
        uw uwVar;
        char c2;
        long j11;
        org.telegram.messenger.mo moVar;
        Object[] objArr;
        ?? r5;
        uw uwVar2;
        long j12;
        int i11;
        boolean z11;
        Object[] objArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        final long j13;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.y0 y0Var;
        boolean z12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        ai.l4 l4Var;
        char c10;
        final uw uwVar3 = this;
        boolean Y = org.telegram.messenger.t3.Y(t2Var.h2);
        if (!t2Var.U()) {
            long dialogId = t2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = t2Var.getMessageId();
            if (!org.telegram.messenger.m5.C(dialogId)) {
                if (org.telegram.messenger.m5.E(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (uwVar3.Z2 == 0 || ((b10 = ji.j0.b(uwVar3.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat M0 = uwVar3.getMessagesController().M0(Long.valueOf(-dialogId));
                    if (messageId == 0 || M0 == null || M0.migrated_to == null) {
                        j10 = dialogId;
                    } else {
                        bundle.putLong("migrated_to", dialogId);
                        j10 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -j10);
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                boolean z13 = uwVar3.Z2 == 0 && uwVar3.getMessagesController().F3 && uwVar3.getMessagesController().V0 && uwVar3.getMessagesController().Q0 != null && uwVar3.getMessagesController().Q0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                int i18 = 2;
                if (z13) {
                    LinearLayout linearLayout2 = new LinearLayout(uwVar3.getParentActivity());
                    linearLayout2.setOrientation(1);
                    ai.l4 l4Var2 = new ai.l4(uwVar3.getParentActivity(), i18);
                    LinearLayout linearLayout3 = new LinearLayout(uwVar3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    l4Var2.addView(linearLayout3);
                    int size = uwVar3.getMessagesController().Q0.size();
                    int i19 = 0;
                    org.telegram.ui.ActionBar.y0 y0Var2 = null;
                    while (i19 < size) {
                        final org.telegram.messenger.mo moVar2 = (org.telegram.messenger.mo) uwVar3.getMessagesController().Q0.get(i19);
                        if (moVar2.e()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j13 = dialogId;
                            c10 = 'd';
                        } else {
                            final boolean b11 = moVar2.b(org.telegram.messenger.c.a(uwVar3.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j13 = dialogId;
                            final ArrayList J0 = org.telegram.ui.Components.cz.J0(uwVar3, moVar2, arrayList, true, false);
                            if (!b11) {
                                c10 = 'd';
                            }
                            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(2, uwVar3.getParentActivity(), null, false, false);
                            y0Var3.setChecked(b11);
                            i16 = size;
                            i17 = i19;
                            Spannable C5 = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(moVar2.b, y0Var3.getTextView().getPaint().getFontMetricsInt(), false, null, 0), moVar2.c, y0Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            y0Var3.setEmojiCacheType(moVar2.n ? 26 : 0);
                            y0Var3.j(C5, 0, new org.telegram.ui.Components.sz(uwVar3.getParentActivity(), R.drawable.msg_folders, moVar2.m));
                            y0Var3.getTextView().setEmojiColor(uwVar3.getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                            y0Var3.setMinimumWidth(org.telegram.messenger.hs.q2);
                            y0Var = y0Var3;
                            z12 = Y;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            l4Var = l4Var2;
                            dialogId = j13;
                            y0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ku
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j14;
                                    org.telegram.messenger.mo moVar3;
                                    uw uwVar4 = uw.this;
                                    uwVar4.getClass();
                                    boolean z14 = b11;
                                    ArrayList arrayList3 = J0;
                                    org.telegram.messenger.mo moVar4 = moVar2;
                                    long j15 = j13;
                                    if (z14) {
                                        moVar4.h.remove(Long.valueOf(j15));
                                        moVar4.i.add(Long.valueOf(j15));
                                        ez.z0(moVar4, moVar4.g, moVar4.b, moVar4.c, moVar4.n, moVar4.m, moVar4.h, moVar4.i, moVar4.j, false, false, true, true, false, uwVar4, null);
                                        uwVar4.k4().k(j15, 21, Integer.valueOf(arrayList3.size()), moVar4, null, null);
                                    } else {
                                        if (arrayList3.isEmpty()) {
                                            arrayList2 = arrayList3;
                                            j14 = j15;
                                            moVar3 = moVar4;
                                        } else {
                                            for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                                                moVar4.i.remove(arrayList3.get(i20));
                                            }
                                            moVar4.h.addAll(arrayList3);
                                            arrayList2 = arrayList3;
                                            moVar3 = moVar4;
                                            j14 = j15;
                                            ez.z0(moVar3, moVar4.g, moVar4.b, moVar4.c, moVar4.n, moVar4.m, moVar4.h, moVar4.i, moVar4.j, false, false, true, true, false, uwVar4, null);
                                        }
                                        uwVar4.k4().k(j14, 20, Integer.valueOf(arrayList2.size()), moVar3, null, null);
                                    }
                                    uwVar4.n4(true);
                                    uwVar4.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(y0Var);
                            i19 = i17 + 1;
                            uwVar3 = this;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            l4Var2 = l4Var;
                            Y = z12;
                            size = i16;
                            y0Var2 = y0Var;
                        }
                        i17 = i19;
                        l4Var = l4Var2;
                        z12 = Y;
                        y0Var = y0Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        dialogId = j13;
                        i16 = size;
                        i19 = i17 + 1;
                        uwVar3 = this;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        l4Var2 = l4Var;
                        Y = z12;
                        size = i16;
                        y0Var2 = y0Var;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    ai.l4 l4Var3 = l4Var2;
                    z10 = Y;
                    org.telegram.ui.ActionBar.y0 y0Var4 = y0Var2;
                    i10 = 8;
                    i3 = 2;
                    if (y0Var4 != null) {
                        y0Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        z13 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    } else {
                        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, getParentActivity(), getResourceProvider());
                        c1Var.setTag(R.id.fit_width_tag, 1);
                        org.telegram.ui.ActionBar.y0 y0Var5 = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
                        y0Var5.j(org.telegram.messenger.bd.M0(2131753756, null), R.drawable.ic_ab_back, null);
                        y0Var5.setMinimumWidth(org.telegram.messenger.hs.q2);
                        y0Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                        linearLayout2.addView(y0Var5);
                        linearLayout2.addView(c1Var, b8.mf.o(-1, 8));
                        linearLayout2.addView(l4Var3);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i3 = 2;
                    z10 = Y;
                    i10 = 8;
                    linearLayout = null;
                }
                Object[] objArr3 = new org.telegram.ui.ActionBar.d2[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z13 ? 3 : i3, getParentActivity(), getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z13) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    org.telegram.ui.ActionBar.y0 y0Var6 = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
                    y0Var6.j(org.telegram.messenger.bd.M0(2131750813, null), R.drawable.msg_addfolder, null);
                    y0Var6.setMinimumWidth(org.telegram.messenger.hs.q2);
                    y0Var6.setOnClickListener(new org.telegram.ui.Components.ux0(14, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new ur(objArr3, 4));
                }
                if (z10) {
                    uwVar = this;
                    c2 = 0;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var7 = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
                    if (t2Var.getHasUnread()) {
                        y0Var7.j(org.telegram.messenger.bd.M0(2131748689, null), R.drawable.msg_markread, null);
                    } else {
                        y0Var7.j(org.telegram.messenger.bd.M0(2131748688, null), R.drawable.msg_markunread, null);
                    }
                    y0Var7.setMinimumWidth(org.telegram.messenger.hs.q2);
                    uwVar = this;
                    long j14 = dialogId;
                    dialogId = j14;
                    y0Var7.setOnClickListener(new ci.c3(uwVar, t2Var, j14, 5));
                    c2 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var7);
                }
                boolean[] zArr = new boolean[1];
                zArr[c2] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
                int i20 = uwVar.f0[c2].s;
                boolean z14 = (i20 == 7 || i20 == i10) && (!uwVar.actionBar.v() || uwVar.actionBar.w(null));
                if (z14) {
                    j11 = dialogId;
                    moVar = uwVar.getMessagesController().N[uwVar.f0[0].s == i10 ? (char) 1 : (char) 0];
                } else {
                    j11 = dialogId;
                    moVar = null;
                }
                if (uwVar.s4(dialog)) {
                    objArr = objArr3;
                    r5 = 0;
                } else {
                    ArrayList W0 = uwVar.getMessagesController().W0(uwVar.X2);
                    int size2 = W0.size();
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    while (true) {
                        if (i21 >= size2) {
                            z11 = z14;
                            objArr2 = objArr3;
                            break;
                        }
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) W0.get(i21);
                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            z11 = z14;
                            i15 = size2;
                        } else if (uwVar.s4(dialog2)) {
                            z11 = z14;
                            i15 = size2;
                            if (org.telegram.messenger.m5.C(dialog2.id)) {
                                i23++;
                            } else {
                                i22++;
                            }
                        } else {
                            z11 = z14;
                            i15 = size2;
                            objArr2 = objArr3;
                            if (!uwVar.getMessagesController().C2(dialog2.id, false)) {
                                break;
                            }
                            i21++;
                            z14 = z11;
                            size2 = i15;
                            objArr3 = objArr2;
                        }
                        objArr2 = objArr3;
                        i21++;
                        z14 = z11;
                        size2 = i15;
                        objArr3 = objArr2;
                    }
                    if (dialog == null || uwVar.s4(dialog)) {
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        boolean C = org.telegram.messenger.m5.C(j11);
                        int i24 = !C ? 1 : 0;
                        if (moVar == null || !moVar.h.contains(Long.valueOf(j11))) {
                            i14 = i24;
                            i13 = C ? 1 : 0;
                            i12 = 0;
                        } else {
                            i14 = i24;
                            i13 = C ? 1 : 0;
                            i12 = 1;
                        }
                    }
                    int size3 = (!z11 || moVar == null) ? (uwVar.X2 == 0 && moVar == null) ? uwVar.getUserConfig().q() ? uwVar.getMessagesController().K4 : uwVar.getMessagesController().J4 : uwVar.getUserConfig().q() ? uwVar.getMessagesController().m3 : uwVar.getMessagesController().l3 : 100 - moVar.h.size();
                    boolean z15 = i13 + i23 <= size3 && (i14 + i22) - i12 <= size3;
                    r5 = 0;
                    zArr[0] = z15;
                    objArr = objArr2;
                }
                if (zArr[r5]) {
                    org.telegram.ui.ActionBar.y0 y0Var8 = new org.telegram.ui.ActionBar.y0(uwVar.getParentActivity(), r5, r5);
                    if (uwVar.s4(dialog)) {
                        y0Var8.j(org.telegram.messenger.bd.M0(2131743854, null), R.drawable.msg_unpin, null);
                    } else {
                        y0Var8.j(org.telegram.messenger.bd.M0(2131747253, null), R.drawable.msg_pin, null);
                    }
                    y0Var8.setMinimumWidth(org.telegram.messenger.hs.q2);
                    long j15 = j11;
                    org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(uwVar, moVar, dialog, j15, 1);
                    uwVar2 = uwVar;
                    j12 = j15;
                    y0Var8.setOnClickListener(rqVar);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var8);
                } else {
                    uwVar2 = uwVar;
                    j12 = j11;
                }
                if (org.telegram.messenger.m5.E(j12) && org.telegram.messenger.l10.B(uwVar2.getMessagesController().a2(Long.valueOf(j12)))) {
                    i11 = 0;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var9 = new org.telegram.ui.ActionBar.y0(uwVar2.getParentActivity(), false, false);
                    if (uwVar2.getMessagesController().r2(j12, 0L, null)) {
                        y0Var9.j(org.telegram.messenger.bd.M0(2131743859, null), R.drawable.msg_unmute, null);
                    } else {
                        y0Var9.j(org.telegram.messenger.bd.M0(2131748322, null), R.drawable.msg_mute, null);
                    }
                    y0Var9.setMinimumWidth(org.telegram.messenger.hs.q2);
                    y0Var9.setOnClickListener(new ai.v(uwVar2, j12, 4));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var9);
                }
                if (!z10) {
                    org.telegram.ui.ActionBar.y0 y0Var10 = new org.telegram.ui.ActionBar.y0(uwVar2.getParentActivity(), i11, true);
                    y0Var10.setIconColor(uwVar2.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                    int i25 = org.telegram.ui.ActionBar.k6.q7;
                    y0Var10.setTextColor(uwVar2.getThemedColor(i25));
                    y0Var10.h(0.12f, i25);
                    y0Var10.j(org.telegram.messenger.bd.M0(2131751599, null), R.drawable.msg_delete, null);
                    y0Var10.setMinimumWidth(org.telegram.messenger.hs.q2);
                    y0Var10.setOnClickListener(new org.telegram.ui.Components.ux0(15, uwVar2, arrayList));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(y0Var10);
                }
                int i26 = org.telegram.messenger.hs.t;
                if (z10) {
                    if (uwVar2.o2 != null) {
                        uwVar2.getNotificationCenter().k(i26, new Object[i11]);
                    }
                    uwVar2.F4();
                    uwVar2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j12);
                    uw uwVar4 = new uw(bundle2);
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        objArr[0] = uwVar4;
                        uwVar2.presentFragmentAsPreview(uwVar4);
                        return false;
                    }
                    objArr[0] = uwVar4;
                    uwVar2.presentFragmentAsPreviewWithMenu(uwVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!uwVar2.getMessagesController().E(bundle, uwVar2, null, null)) {
                    return i11;
                }
                if (uwVar2.o2 != null) {
                    uwVar2.getNotificationCenter().k(i26, new Object[i11]);
                }
                uwVar2.F4();
                uwVar2.parentLayout.setHighlightActionButtons(true);
                wm wmVar = new wm(bundle);
                Point point2 = org.telegram.messenger.g0.q;
                if (point2.x > point2.y) {
                    objArr[0] = wmVar;
                    uwVar2.presentFragmentAsPreview(wmVar);
                    return true;
                }
                objArr[0] = wmVar;
                uwVar2.presentFragmentAsPreviewWithMenu(wmVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                wmVar.da = true;
                try {
                    wmVar.p1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (t2Var.getCurrentDialogFolderId() == 1) {
            y4(t2Var);
            return false;
        }
        return false;
    }

    public boolean U3() {
        return this.S0 == 10;
    }

    public final void U4(boolean z10) {
        int i3 = 1;
        this.c.a(z10, true);
        if (this.n0 == null) {
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
            this.n0.setVisibility(0);
        } else {
            this.n0.setSelected(false);
            Drawable background = this.n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.n0, (Property<org.telegram.ui.ActionBar.q0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new vv(this, z10, i3));
        this.P3.start();
    }

    public final void V3() {
        if (!org.telegram.messenger.g0.Q1()) {
            this.W1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.l(true);
        }
        TLObject tLObject = this.Y1;
        if (tLObject != null) {
            cw cwVar = this.D0;
            if (cwVar != null) {
                cwVar.e0.Q(this.X1, tLObject);
            }
            this.Y1 = null;
        }
    }

    public final void V4() {
        if (this.B0 || !getMessagesController().V0 || !getMessagesController().K3 || this.A0 == null || !getMessagesController().T0().isEmpty() || this.isPaused || !getUserConfig().Q || this.inPreviewMode) {
            return;
        }
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        if (e12.getBoolean("filterhint", false)) {
            return;
        }
        e12.edit().putBoolean("filterhint", true).apply();
        org.telegram.messenger.g0.i3(new au(this, 26), 1000L);
    }

    @Override // org.telegram.ui.ActionBar.d2, org.telegram.ui.de0
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        pv pvVar;
        org.telegram.ui.Components.voip.r0 r0Var;
        jw jwVar;
        if (!this.r3 && (((pvVar = this.G3) == null || !pvVar.c()) && (((r0Var = this.L0) == null || r0Var.getVisibility() != 0) && ((jwVar = this.A0) == null || !jwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                jw jwVar2 = this.A0;
                boolean z11 = jwVar2 == null || jwVar2.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getFirstTabId();
                jw jwVar3 = this.A0;
                boolean z12 = jwVar3 == null || jwVar3.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getLastTabId();
                org.telegram.messenger.az.m(this.currentAccount);
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

    public final void W3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.o0) {
            return;
        }
        kVar.k();
        this.r3 = false;
        i5(true, true);
    }

    public final void W4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        float f10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        bu buVar;
        org.telegram.ui.Components.p11 p11Var;
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i3;
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, this.l0);
        int i10 = org.telegram.ui.ActionBar.k6.A8;
        H.S(getThemedColor(i10), getThemedColor(i10));
        int i11 = 8;
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i12 = 5;
        float f11 = 64.0f;
        int i13 = 0;
        if (this.Z2 != 0) {
            int i14 = 1;
            if (org.telegram.messenger.t3.N(this.a3)) {
                H.c(R.drawable.msg_customize, org.telegram.messenger.bd.M0(2131751913, null), new wu(this, i14), false);
                H.k();
            }
            H.i(new wu(this, 4), org.telegram.messenger.bd.M0(2131751912, null), this.a3.collapsed_in_dialogs);
            H.i(new wu(this, i12), org.telegram.messenger.bd.M0(2131751911, null), !this.a3.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        if (q4()) {
            H.c(R.drawable.msg_customize, org.telegram.messenger.bd.M0(2131754143, null), new wu(this, 6), false);
            H.c(R.drawable.msg_help, org.telegram.messenger.bd.M0(2131749284, null), new wu(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = this.resourceProvider;
        boolean a10 = e6Var2 != null ? e6Var2.a() : org.telegram.ui.ActionBar.k6.I.q();
        H.c(a10 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, org.telegram.messenger.bd.M0(a10 ? 2131744310 : 2131744309, null), new wu(this, i11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, org.telegram.messenger.bd.M0(2131748281, null), new wu(this, 9), false);
        H.c(R.drawable.outline_saved_24, org.telegram.messenger.bd.M0(2131745911, null), new wu(this, 10), false);
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c) {
            H.c(R.drawable.ic_gram, org.telegram.messenger.bd.M0(2131743204, null), new au(this, i13), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i15);
                    i15++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        bu buVar2 = new bu(this, tL_attachMenuBot2, launchActivity2, i13);
                        org.telegram.ui.Components.p11 p11Var2 = new org.telegram.ui.Components.p11(19, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.e6 e6Var3 = H.d;
                        if (H.e != null) {
                            int i16 = org.telegram.ui.ActionBar.k6.F8;
                            int i17 = org.telegram.ui.ActionBar.k6.E8;
                            f10 = f11;
                            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, H.e, H.d, false, false);
                            y0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), i13, org.telegram.messenger.g0.L(18.0f), i13);
                            CharSequence b10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.l8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            Pattern pattern = org.telegram.messenger.li.S1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= size2) {
                                    launchActivity = launchActivity2;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i18);
                                int i19 = i18 + 1;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                launchActivity = launchActivity2;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    i18 = i19;
                                    launchActivity2 = launchActivity;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                org.telegram.messenger.jz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.k6.c7, 1.0f, null);
                                if (f12 != null) {
                                    Integer num = H.k0;
                                    new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i16, e6Var3), PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.ac b11 = org.telegram.messenger.ac.b(tL_attachMenuBotIcon.icon);
                                buVar = buVar2;
                                y0Var = y0Var2;
                                p11Var = p11Var2;
                                CharSequence charSequence = b10;
                                i3 = i16;
                                e6Var = e6Var3;
                                y0Var.k(charSequence, b11, "24_24", f12, tL_attachMenuBot2);
                                org.telegram.ui.Components.k9 k9Var = y0Var.h;
                                if (k9Var != null) {
                                    k9Var.setLayoutParams(b8.mf.e(24, 24, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                buVar = buVar2;
                                p11Var = p11Var2;
                                y0Var = y0Var2;
                                CharSequence charSequence2 = b10;
                                e6Var = e6Var3;
                                i3 = i16;
                                y0Var.j(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                y0Var.c(i17, i3);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i17, e6Var);
                                Integer num3 = H.k0;
                                y0Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                            }
                            Integer num4 = H.k0;
                            y0Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                y0Var.setSelectorColor(num5.intValue());
                            } else {
                                y0Var.h(0.12f, i17);
                            }
                            y0Var.setOnClickListener(new org.telegram.ui.Components.q2(22, H, buVar));
                            y0Var.setOnLongClickListener(new ei.j2(3, H, p11Var));
                            int i20 = H.S;
                            if (i20 > 0) {
                                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i20));
                                H.r(y0Var, b8.mf.o(H.S, -2));
                            } else {
                                H.r(y0Var, b8.mf.o(-1, -2));
                            }
                            arrayList3 = arrayList2;
                            launchActivity2 = launchActivity;
                            f11 = f10;
                            i13 = 0;
                        }
                    }
                    arrayList2 = arrayList3;
                    launchActivity = launchActivity2;
                    f10 = f11;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    f11 = f10;
                    i13 = 0;
                }
            }
        }
        float f13 = f11;
        if (getUserConfig().X) {
            H.c(R.drawable.msg_settings_old, org.telegram.messenger.bd.M0(2131745505, null), new wu(this, 3), false);
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.p0;
        if (y0Var3 != null) {
            org.telegram.ui.ActionBar.r6.V(y0Var3.b, org.telegram.ui.ActionBar.k6.Oi, getResourceProvider());
            this.p0.setOnClickListener(new org.telegram.ui.Components.ux0(18, this, H));
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().z3 && !org.telegram.messenger.az.z1.isEmpty())) {
                H.k();
                H.d(this.p0);
            }
        }
        H.Z();
        H.X(-org.telegram.messenger.g0.L(f13));
    }

    public final void X3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        org.telegram.ui.ActionBar.x n4 = this.actionBar.n(str);
        boolean z10 = this.X;
        int i3 = 1;
        ArrayList arrayList = this.j1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.h1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.h1.setImageDrawable(new org.telegram.ui.ActionBar.w1(true));
            org.telegram.ui.ActionBar.r6.t(this.h1, org.telegram.ui.ActionBar.k6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.h1;
            int i10 = org.telegram.ui.ActionBar.k6.z8;
            org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), getResourceProvider());
            this.h1.setOnClickListener(new cu(this, 6));
            n4.addView(this.h1, b8.mf.r(54, 54, 16));
            arrayList.add(this.h1);
        }
        NumberTextView numberTextView = new NumberTextView(n4.getContext());
        this.i1 = numberTextView;
        numberTextView.setTextSize(18);
        this.i1.setTypeface(org.telegram.messenger.g0.o());
        this.i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
        n4.addView(this.i1, b8.mf.m(1.0f, 0, -1, this.X ? 18 : 72, 0, 0));
        this.i1.setOnTouchListener(new fi.a(2));
        this.l1 = n4.g(100, R.drawable.msg_pin, org.telegram.messenger.g0.L(48.0f));
        this.m1 = n4.g(org.telegram.messenger.hs.p1, R.drawable.msg_mute, org.telegram.messenger.g0.L(48.0f));
        this.n1 = n4.g(org.telegram.messenger.hs.s1, R.drawable.msg_archive, org.telegram.messenger.g0.L(48.0f));
        this.k1 = n4.h(org.telegram.messenger.hs.n1, R.drawable.msg_delete, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.bd.M0(2131751599, null));
        org.telegram.ui.ActionBar.q0 h = n4.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.bd.M0(2131754839, null));
        n4.addView(new View(getParentActivity()), b8.mf.o(5, -1));
        this.r1 = h.e(org.telegram.messenger.hs.q1, R.drawable.msg_archive, org.telegram.messenger.bd.M0(2131754172, null));
        this.o1 = h.e(org.telegram.messenger.hs.t1, R.drawable.msg_pin, org.telegram.messenger.bd.M0(2131751454, null));
        this.p1 = h.e(org.telegram.messenger.hs.u1, R.drawable.msg_addfolder, org.telegram.messenger.bd.M0(2131750813, null));
        this.q1 = h.e(org.telegram.messenger.hs.v1, R.drawable.msg_removefolder, org.telegram.messenger.bd.M0(2131750713, null));
        this.t1 = h.e(101, R.drawable.msg_markread, org.telegram.messenger.bd.M0(2131748689, null));
        this.s1 = h.e(org.telegram.messenger.hs.o1, R.drawable.msg_clear, org.telegram.messenger.bd.M0(2131752089, null));
        this.u1 = h.e(org.telegram.messenger.hs.r1, R.drawable.msg_block, org.telegram.messenger.bd.M0(2131753692, null));
        this.m1.setOnLongClickListener(new nu(this, i3));
        arrayList.add(this.l1);
        arrayList.add(this.n1);
        arrayList.add(this.m1);
        arrayList.add(this.k1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.S3 != null) {
            return;
        }
        for (String str : getMessagesController().T3) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131749327, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749328, null));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749541, null), new du(this, 6));
                showDialog(s1Var, new ju(this, 0));
                this.S3 = str;
                return;
            }
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            iw iwVar = this.Y;
            qe.a aVar = this.b;
            iwVar.setBlurredBackgroundVisibility(aVar.e);
            float a10 = b8.v9.a(aVar.e);
            org.telegram.ui.Components.k9 k9Var = this.c3;
            if (k9Var != null) {
                k9Var.setScaleX(a10);
                this.c3.setScaleY(a10);
                this.c3.setAlpha(a10);
                this.c3.setVisibility(a10 > 0.0f ? 0 : 8);
            }
            if (this.w0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.w0.setScaleX(T1);
                this.w0.setScaleY(T1);
                this.w0.setAlpha(a10);
                this.w0.setVisibility(a10 > 0.0f ? 0 : 8);
                this.x0.setAlpha(a10);
                this.x0.setVisibility(a10 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i3 == 2) {
            O3();
            Q3();
            return;
        }
        if (i3 == 3) {
            M3();
            return;
        }
        if (i3 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i3 == 5) {
            L3();
            return;
        }
        if (i3 == 6) {
            O3();
            Q3();
        } else {
            if (i3 == 7) {
                H3();
                return;
            }
            if (i3 == 8) {
                G3();
                R3();
            } else if (i3 == 9) {
                R3();
            }
        }
    }

    public final void Y3() {
        cw cwVar = this.D0;
        if ((cwVar != null && cwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        cw cwVar2 = new cw(this, getParentActivity(), this, this.o2 != null ? 2 : !this.m2 ? 1 : 0, this.S0, this.X2, this.Z2, new av(this));
        this.D0 = cwVar2;
        this.glassEngine.c(cwVar2);
        ((mw) this.fragmentView).addView(this.D0, this.C0);
        cw cwVar3 = this.D0;
        cwVar3.e0.V = new ew(this);
        cwVar3.l0.setOnItemClickListener(new du(this, 1));
        this.D0.q0.setOnItemClickListener(new du(this, 2));
        this.D0.x0.setOnItemClickListener(new iu(this, 0));
        this.D0.q0.setOnItemLongClickListener(new du(this, 3));
        this.D0.b0.setOnItemClickListener(new du(this, 4));
        this.D0.b0.setOnItemLongClickListener(new av(this));
        this.D0.setFilteredSearchViewDelegate(new du(this, 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.p4);
    }

    public final void Y4(long j10, View view) {
        s3(j10, view);
        boolean v = this.actionBar.v();
        ArrayList arrayList = this.J2;
        boolean z10 = true;
        char c2 = 1;
        int i3 = 0;
        if (!v) {
            if (this.r3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            this.actionBar.O(null, null);
            int i10 = this.f0[0].s;
            ArrayList d42 = ((i10 == 7 || i10 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) ? d4(this.currentAccount, this.f0[0].s, this.X2, this.T1) : getMessagesController().W0(this.X2);
            int size = d42.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) d42.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!s4(dialog)) {
                        if (!getMessagesController().C2(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i11++;
                    }
                }
            }
            if (i11 > 1) {
                if (this.f0 != null) {
                    int i13 = 0;
                    while (true) {
                        tw[] twVarArr = this.f0;
                        if (i13 >= twVarArr.length) {
                            break;
                        }
                        twVarArr[i13].d.I = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.hp.C8;
                u5(131072, true);
            }
            if (!this.r3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.j1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.g0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.w3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.w3 = ValueAnimator.ofFloat(this.v3, 1.0f);
            int i16 = 0;
            while (true) {
                tw[] twVarArr2 = this.f0;
                if (i16 >= twVarArr2.length) {
                    break;
                }
                tw twVar = twVarArr2[i16];
                if (twVar != null) {
                    twVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.L ? 81 : 0) + 48) + this.O);
            if (max != 0.0f) {
                this.Q = (int) max;
                this.fragmentView.requestLayout();
            }
            this.w3.addUpdateListener(new eu(this, max, i3));
            this.w3.addListener(new xv(this, max, c2 == true ? 1 : 0));
            this.w3.setInterpolator(org.telegram.ui.Components.xq.f);
            this.w3.setDuration(200L);
            this.w3.start();
            jw jwVar = this.A0;
            if (jwVar != null) {
                jwVar.b(org.telegram.ui.ActionBar.k6.ui, org.telegram.ui.ActionBar.k6.ti, org.telegram.ui.ActionBar.k6.si, org.telegram.ui.ActionBar.k6.vi, org.telegram.ui.ActionBar.k6.w8);
            }
            org.telegram.ui.ActionBar.w1 w1Var = this.f1;
            if (w1Var != null) {
                w1Var.c(true, 1.0f);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            n4(true);
            return;
        }
        f5(false);
        this.i1.a(arrayList.size(), z10);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i3 = 0; i3 < 2; i3++) {
                undoViewArr[i3] = new yv(this, parentActivity);
                FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.g4 + this.i4 + d.bottomMargin;
                mw mwVar = (mw) this.fragmentView;
                UndoView undoView = undoViewArr[i3];
                int i10 = this.y0 + 1;
                this.y0 = i10;
                mwVar.addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j10, View view) {
        int i3 = -this.M3;
        this.M3 = i3;
        org.telegram.messenger.g0.G3(i3, view, null);
        org.telegram.messenger.p2.E.a();
        String p10 = j10 >= 0 ? org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(j10))) : "";
        (getMessagesController().D3() ? org.telegram.ui.Components.fc.a0(this).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, p10))) : org.telegram.ui.Components.fc.a0(this).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, p10)), org.telegram.messenger.bd.M0(2131743769, null), new au(this, 8))).j();
    }

    public final void a4(final long j10, final long j11, boolean z10, final m91 m91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j10)) {
            int i3 = this.S0;
            if (i3 == 11 || i3 == 12 || i3 == 13) {
                if (org.telegram.messenger.m5.E(j10)) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
                    if (!a22.mutual_contact) {
                        UndoView k42 = k4();
                        if (k42 != null) {
                            k42.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = a22;
                    chat = null;
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j10));
                    if (!org.telegram.messenger.t3.N(M03) || !org.telegram.messenger.t3.w(1, M03)) {
                        UndoView k43 = k4();
                        if (k43 != null) {
                            k43.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = M03;
                    user = null;
                }
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ci.r3(this, s1Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    s1Var.r(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z10 || ((this.g2 == null || this.h2 == null) && this.i2 == null)) {
                if (i3 != 15) {
                    if (this.D2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.pr.a(j10, j11));
                    if (this.D2.y(this, arrayList, null, false, this.K2, this.L2, this.M2, m91Var) && this.j2) {
                        this.D2 = null;
                        return;
                    }
                    return;
                }
                Runnable r1Var = new ai.r1(this, j10, new c3.f0(this, j10, j11, m91Var, 6), 27);
                if (j10 < 0) {
                    c5(getMessagesController().M0(Long.valueOf(-j10)), r1Var, null);
                    return;
                }
                TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j10));
                TLRPC.User a24 = getMessagesController().a2(Long.valueOf(this.I));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a02 = org.telegram.messenger.bd.a0(null, null, 2131754074, org.telegram.messenger.l10.j(a23, true), org.telegram.messenger.l10.j(a24, true));
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                s1Var2.S = a02;
                s1Var2.U = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754075, org.telegram.messenger.l10.j(a23, true), org.telegram.messenger.l10.j(a24, true))));
                alertDialog$Builder.k(org.telegram.messenger.bd.a0("Send", null, 2131745650, new Object[0]), new ur(r1Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.bd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.lf0(21));
                showDialog(s1Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (org.telegram.messenger.m5.C(j10)) {
                TLRPC.User a25 = getMessagesController().a2(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j10))).user_id));
                if (a25 == null) {
                    return;
                }
                M0 = org.telegram.messenger.bd.M0(2131745606, null);
                b02 = org.telegram.messenger.bd.b0(this.g2, org.telegram.messenger.l10.p(a25));
                M02 = org.telegram.messenger.bd.M0(2131745650, null);
            } else if (!org.telegram.messenger.m5.E(j10)) {
                TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j10));
                if (M04 == null) {
                    return;
                }
                String str = M04.title;
                if (j11 != 0 && (f10 = getMessagesController().q7.f(M04.id, j11)) != null) {
                    str = ((Object) str) + " " + f10.title;
                }
                if (this.i2 != null) {
                    M0 = org.telegram.messenger.bd.M0(2131754366, null);
                    b02 = org.telegram.messenger.bd.b0(this.i2, str);
                    M02 = org.telegram.messenger.bd.M0(2131754486, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131745606, null);
                    b02 = org.telegram.messenger.bd.b0(this.h2, str);
                    M02 = org.telegram.messenger.bd.M0(2131745650, null);
                }
            } else if (j10 == getUserConfig().e()) {
                M0 = org.telegram.messenger.bd.M0(2131745606, null);
                b02 = org.telegram.messenger.bd.b0(this.h2, org.telegram.messenger.bd.M0(2131745911, null));
                M02 = org.telegram.messenger.bd.M0(2131745650, null);
            } else {
                TLRPC.User a26 = getMessagesController().a2(Long.valueOf(j10));
                if (a26 == null || this.g2 == null) {
                    return;
                }
                M0 = org.telegram.messenger.bd.M0(2131745606, null);
                b02 = org.telegram.messenger.bd.b0(this.g2, org.telegram.messenger.l10.p(a26));
                M02 = org.telegram.messenger.bd.M0(2131745650, null);
            }
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder2.a;
            s1Var3.S = M0;
            s1Var3.U = org.telegram.messenger.g0.X2(b02);
            alertDialog$Builder2.k(M02, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.vu
                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i10) {
                    uw.this.a4(j10, j11, false, m91Var);
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            if (showDialog(s1Var3) == null) {
                s1Var3.show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a5(boolean z10, boolean z11, boolean z12, boolean z13) {
        cw cwVar;
        cw cwVar2;
        mv mvVar;
        cw cwVar3;
        boolean z14;
        cw cwVar4;
        boolean z15;
        org.telegram.ui.Components.m61 m61Var;
        TLRPC.Chat chat;
        pv pvVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i3 = 0;
        if (z10) {
            Y3();
        } else {
            q5(false);
        }
        int i10 = this.S0;
        if (i10 != 0 && i10 != 3) {
            z16 = false;
        }
        AnimatorSet animatorSet = this.x1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x1 = null;
        }
        this.r3 = z10;
        this.glassEngine.g();
        if (z10) {
            if (!this.u3 && !z13) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.m2 || (size <= 10 && !this.L)) {
                    z14 = true;
                    cwVar4 = this.D0;
                    if (cwVar4 != null) {
                        cwVar4.R0 = z14;
                    }
                    z15 = z14 || this.L;
                    this.t3 = z15;
                    if (z15) {
                        this.u3 = true;
                    }
                    m61Var = this.b0;
                    if (m61Var != null && cwVar4 != null && !z14 && this.Z2 == 0) {
                        org.telegram.ui.Components.m61 j10 = cwVar4.j(-2, false);
                        this.b0 = j10;
                        this.a0.addView(j10, 0, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
                    } else if (this.a0 != null && z14 && this.Z2 == 0) {
                        org.telegram.messenger.g0.E2(m61Var);
                        this.b0 = null;
                    }
                    if (this.D0 != null) {
                        S3(false);
                        this.D0.setKeyboardHeight(((mw) this.fragmentView).getKeyboardHeight());
                        cw cwVar5 = this.D0;
                        cwVar5.D0.clear();
                        cwVar5.L();
                    }
                    chat = this.a3;
                    if (chat == null) {
                        kg.l0 l0Var = new kg.l0(R.drawable.search_users_filled, 4, org.telegram.messenger.m5.u(chat));
                        l0Var.f = this.a3;
                        t3(l0Var);
                    } else if (this.X2 != 0 && ((pvVar = this.G3) == null || !pvVar.c())) {
                        t3(new kg.l0(R.drawable.chats_archive, 2131754150, null, 7));
                    }
                }
            }
            z14 = false;
            cwVar4 = this.D0;
            if (cwVar4 != null) {
            }
            if (z14) {
            }
            this.t3 = z15;
            if (z15) {
            }
            m61Var = this.b0;
            if (m61Var != null) {
            }
            if (this.a0 != null) {
                org.telegram.messenger.g0.E2(m61Var);
                this.b0 = null;
            }
            if (this.D0 != null) {
            }
            chat = this.a3;
            if (chat == null) {
            }
        }
        if (z16 && (cwVar3 = this.D0) != null && cwVar3.e0.M()) {
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        if (!z10 && (mvVar = this.F0) != null && this.H0) {
            mvVar.setVisibility(0);
        }
        Object[] objArr = org.telegram.messenger.az.o() == 0 || !org.telegram.messenger.lc.e(32768);
        if (z16) {
            if (z10) {
                cw cwVar6 = this.D0;
                if (cwVar6 != null) {
                    cwVar6.setVisibility(0);
                    cw cwVar7 = this.D0;
                    cwVar7.setPosition(0);
                    if (cwVar7.e0.b() > 0) {
                        cwVar7.f0.h1(0, 0);
                    }
                    u4.b0 b0Var = cwVar7.k0;
                    if (b0Var != null) {
                        b0Var.h1(0, 0);
                    }
                    u4.b0 b0Var2 = cwVar7.p0;
                    if (b0Var2 != null) {
                        b0Var2.h1(0, 0);
                    }
                    u4.b0 b0Var3 = cwVar7.w0;
                    if (b0Var3 != null) {
                        b0Var3.h1(0, 0);
                    }
                    cwVar7.h.clear();
                }
                j5(true, null, null, false, false);
                org.telegram.ui.Components.m61 m61Var2 = this.b0;
                if (m61Var2 != null) {
                    m61Var2.b(false, false);
                }
            } else {
                this.f0[0].a.setVisibility(0);
                this.f0[0].setVisibility(0);
            }
            M4(true, true);
            this.f0[0].a.setVerticalScrollBarEnabled(false);
            cw cwVar8 = this.D0;
            if (cwVar8 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, cwVar8, getResourceProvider());
            }
            this.x1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            tw twVar = this.f0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(twVar, (Property<tw, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.f0[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<tw, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<tw, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            pv pvVar2 = this.G3;
            if (pvVar2 != null) {
                pvVar2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.G3, (Property<pv, Float>) property, z10 ? 0.0f : 1.0f));
            }
            cw cwVar9 = this.D0;
            if (cwVar9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(cwVar9, (Property<cw, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.L) {
                    float L = org.telegram.messenger.g0.L(81.0f) + this.O + org.telegram.messenger.g0.L(48.0f);
                    cw cwVar10 = this.D0;
                    float f10 = z10 ? L : 0.0f;
                    if (z10) {
                        L = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(cwVar10, this.I3, f10, L));
                }
                if (objArr == true) {
                    this.D0.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<cw, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<cw, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.h0 != null) {
                m5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new hu(this, i3));
            arrayList2.add(ofFloat);
            this.x1.playTogether(arrayList2);
            this.x1.setDuration(z10 ? 200L : 180L);
            this.x1.setInterpolator(org.telegram.ui.Components.xq.g);
            if (!z10) {
                this.x1.setStartDelay(20L);
            }
            this.x1.addListener(new vv(this, z10, i3));
            this.q3.d();
            this.x1.start();
        } else {
            M4(false, true);
            if (z10) {
                this.f0[0].a.c1();
            } else {
                pw pwVar = this.f0[0].a;
                if (pwVar.h1) {
                    pwVar.h1 = false;
                    pwVar.K0(false);
                }
            }
            this.f0[0].setAlpha(z10 ? 0.0f : 1.0f);
            if (objArr == true) {
                this.f0[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                this.f0[0].setScaleX(z10 ? 0.95f : 1.0f);
                this.f0[0].setScaleY(z10 ? 0.95f : 1.0f);
            }
            cw cwVar11 = this.D0;
            if (cwVar11 != null) {
                cwVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.D0.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    this.D0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.D0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.D0.setVisibility(z10 ? 0 : 8);
            }
            iw iwVar = this.Y;
            if (iwVar != null) {
                iwVar.setTranslationY(i4() + (z10 ? -org.telegram.messenger.g0.L(36.0f) : 0));
            }
            if (this.F0 != null) {
                if (!this.H0 || isInPreviewMode() || z10) {
                    this.F0.setVisibility(8);
                } else {
                    this.F0.setVisibility(0);
                }
            }
            P4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i11 = this.y;
        if (i11 >= 0 && (cwVar2 = this.D0) != null) {
            cwVar2.setPosition(cwVar2.N(i11));
        }
        if (!z10) {
            this.y = -1;
        }
        if (z10 && z11 && (cwVar = this.D0) != null) {
            cwVar.setPosition((cwVar.t0 ? 1 : 0) + 5);
            q5(true);
        }
        R3();
        g5();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
    }

    public final void b4(long j10, boolean z10) {
        if (this.f0 == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            tw[] twVarArr = this.f0;
            if (i3 >= twVarArr.length) {
                return;
            }
            int childCount = twVarArr[i3].a.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f0[i3].a.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                        if (t2Var.getDialogId() == j10) {
                            t2Var.c0(z10, true);
                            break;
                        }
                    }
                    i10++;
                }
            }
            i3++;
        }
    }

    public final void b5() {
        int i3;
        int i10;
        if (this.N0 != null || org.telegram.messenger.az.x || (this.L && !this.F0.g())) {
            return;
        }
        x01[] x01VarArr = new x01[1];
        TLRPC.User f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).f();
        org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i3 = 0;
            i10 = 0;
        } else {
            this.E3.f();
            Drawable drawable = this.E3.f[0];
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
            i3 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i10 = L;
        }
        qv qvVar = new qv(this, this, getParentActivity(), Integer.valueOf(i3), getResourceProvider(), x01VarArr);
        if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
            qvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
        }
        Long l10 = this.C3;
        if (l10 != null) {
            qvVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.E3.f[0];
            qvVar.setSelected(drawable2 instanceof org.telegram.ui.Components.g5 ? Long.valueOf(((org.telegram.ui.Components.g5) drawable2).h()) : null);
        }
        qvVar.setSaveState(1);
        qvVar.y(this.E3, titleTextView);
        rv rvVar = new rv(this, qvVar);
        this.N0 = rvVar;
        x01VarArr[0] = rvVar;
        rvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
        x01VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.H.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.d2, org.telegram.ui.uw] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a02;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
        boolean V = org.telegram.messenger.t3.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i3 = 1;
        int i10 = 2;
        String a03 = org.telegram.messenger.bd.a0(null, null, 2131754074, chat.title, org.telegram.messenger.l10.j(a22, true));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = a03;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754075, chat.title, org.telegram.messenger.l10.j(a22, true)));
        Boolean bool = this.H.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().x2(chat, a22)) {
            charSequence = r10;
        }
        if (this.H.bot_admin_rights == null) {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131754077, org.telegram.messenger.l10.j(a22, true), chat.title);
        } else {
            String j10 = org.telegram.messenger.l10.j(a22, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.H.bot_admin_rights;
            int i11 = org.telegram.ui.Cells.n6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.f1.t(1, V ? org.telegram.messenger.bd.M0(2131751325, null) : org.telegram.messenger.bd.M0(2131751324, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131751313, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131751320, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(V ? 2131751322 : 2131751317, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131751329, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131751331, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131751314, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131751332, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131751304, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131744911, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                org.telegram.ui.Cells.f1.t(1, org.telegram.messenger.bd.M0(2131748700, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((org.telegram.ui.Cells.o6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((org.telegram.ui.Cells.o6) arrayList.get(i12)).b.toString().toLowerCase());
                }
            }
            a02 = org.telegram.messenger.bd.a0(null, null, 2131754076, new Object[]{j10, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", org.telegram.messenger.g0.X2(a02));
        s1Var.U = TextUtils.concat(X2, charSequence);
        alertDialog$Builder.k(org.telegram.messenger.bd.a0("Send", null, 2131745650, new Object[0]), new se(i3, runnable));
        alertDialog$Builder.h(org.telegram.messenger.bd.a0("Cancel", null, 2131752589, new Object[0]), new se(i10, runnable2));
        showDialog(s1Var);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        jw jwVar;
        if (this.G3.c()) {
            return false;
        }
        return this.S0 != 3 || (jwVar = this.A0) == null || jwVar.getVisibility() != 0 || this.A0.L <= 0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean closeLastFragment() {
        if (!this.G3.c()) {
            return super.closeLastFragment();
        }
        this.G3.a();
        cw cwVar = this.D0;
        if (cwVar == null) {
            return true;
        }
        cwVar.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.p7 p7Var = new org.telegram.ui.Components.p7(this, context, this.resourceProvider, 3);
        p7Var.setAllowOverlayTitle(true);
        p7Var.H0 = true;
        if (p7Var.G0 == null) {
            ai.d2 d2Var = new ai.d2(p7Var.getContext(), 7);
            p7Var.G0 = d2Var;
            p7Var.addView(d2Var);
        }
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, org.telegram.ui.ActionBar.k6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.a(p7Var, org.telegram.ui.ActionBar.k6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, org.telegram.ui.ActionBar.k6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(p7Var, org.telegram.ui.ActionBar.k6.y8, getResourceProvider(), true);
        if (p7Var.y1 == null) {
            ei.k kVar = new ei.k(p7Var, p7Var.getContext(), p7Var.K0, p7Var.P0);
            p7Var.y1 = kVar;
            kVar.setClipChildren(false);
            p7Var.addView(p7Var.y1);
        }
        p7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        p7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.X2 == 0 || q4())) {
            return p7Var;
        }
        p7Var.setOccupyStatusBar(false);
        return p7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c26  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c93  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e21  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e59  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c9b  */
    /* JADX WARN: Type inference failed for: r10v23, types: [org.telegram.ui.Components.tj0, org.telegram.ui.pw] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r6v36, types: [org.telegram.ui.Components.tj0, org.telegram.ui.pw] */
    /* JADX WARN: Type inference failed for: r6v41, types: [org.telegram.ui.Components.tj0, org.telegram.ui.pw] */
    /* JADX WARN: Type inference failed for: r6v42, types: [org.telegram.ui.Components.tj0, org.telegram.ui.pw] */
    /* JADX WARN: Type inference failed for: r6v44, types: [org.telegram.ui.zu, u4.b0] */
    /* JADX WARN: Type inference failed for: r9v55, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f10;
        float f11;
        wm wmVar;
        jw jwVar;
        iw iwVar;
        iw iwVar2;
        org.telegram.ui.Components.pr prVar;
        sw swVar;
        u4.y yVar;
        kg.m mVar;
        kg.m mVar2;
        kg.m mVar3;
        kg.m mVar4;
        kg.m mVar5;
        kg.m mVar6;
        nw nwVar;
        int i3;
        int i10;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r9;
        int i11;
        Context context2 = context;
        int i12 = 0;
        this.k2 = false;
        this.l2 = false;
        this.W = false;
        this.W0 = null;
        this.A0 = null;
        ArrayList arrayList = this.J2;
        arrayList.clear();
        this.m3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        org.telegram.messenger.g0.h3(new zt(context2, i12));
        this.O1 = null;
        this.M1 = null;
        this.N1 = null;
        this.R1 = null;
        this.K1 = null;
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        q10.setTranslationX(-org.telegram.messenger.g0.L(5.0f));
        org.telegram.ui.ActionBar.q0 a10 = q10.a(0, R.drawable.outline_header_search);
        a10.N();
        this.k0 = a10;
        int i13 = 3;
        a10.setOnClickListener(new cu(this, i13));
        int i14 = 8;
        if (this.S0 == 2 || (q4() && d4(this.currentAccount, this.S0, this.X2, false).isEmpty())) {
            this.k0.setVisibility(8);
        }
        this.k0.setVisibility(8);
        ?? r5 = 1;
        ?? r52 = 1;
        if (!this.m2 && this.o2 == null && this.X2 == 0 && this.Z2 == 0) {
            int i15 = org.telegram.ui.ActionBar.k6.t8;
            int themedColor = getThemedColor(i15);
            int i16 = org.telegram.ui.ActionBar.k6.v8;
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context2, themedColor, getThemedColor(i16));
            this.n0 = q0Var;
            q0Var.setText(org.telegram.messenger.bd.L0(2131751355).toUpperCase());
            if (this.n0.getTextView() != null) {
                org.telegram.ui.ActionBar.r6.V(this.n0.getTextView(), i16, getResourceProvider());
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.n0;
            org.telegram.ui.ActionBar.r6.R(q0Var2, q0Var2.getBackground(), null, org.telegram.ui.ActionBar.r6.N(i15), getResourceProvider());
            this.actionBar.addView(this.n0, b8.mf.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.n0.setOnClickListener(new cu(this, i14));
            this.n0.setAlpha(0.0f);
            this.n0.setVisibility(8);
            this.o0 = new org.telegram.ui.Components.lg0(context2);
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(context2, this.resourceProvider, false, true);
            this.p0 = y0Var;
            y0Var.setItemHeight(56);
            this.p0.j(org.telegram.messenger.bd.L0(2131748613), 0, this.o0);
            this.p0.setContentDescription(org.telegram.messenger.bd.L0(2131746609));
            org.telegram.ui.ActionBar.q0 a11 = q10.a(1, R.drawable.outline_header_lock_24);
            this.g0 = a11;
            a11.setContentDescription(org.telegram.messenger.bd.L0(2131754813));
            org.telegram.ui.ActionBar.q0 d = q10.d(3, new ColorDrawable(0));
            this.h0 = d;
            ww wwVar = new ww(context2, this.currentAccount);
            this.i0 = wwVar;
            d.addView(wwVar);
            this.h0.setContentDescription(org.telegram.messenger.bd.L0(2131751344));
            this.h0.setVisibility(8);
            m5(false, false);
        }
        iw iwVar3 = new iw(context2, this.resourceProvider);
        this.Y = iwVar3;
        iwVar3.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        int i17 = 9;
        if (this.S0 == 0) {
            org.telegram.ui.ActionBar.q0 a12 = q10.a(-47, R.drawable.avd_speed);
            this.m0 = a12;
            org.telegram.messenger.g0.E2(a12);
            this.m0.setOnClickListener(new cu(this, i17));
            this.Y.a(this.m0);
            this.Y.updateColors();
        }
        this.Y.setCloseButtonOnClickListener(new au(this, 16));
        this.Y.r.setOnFocusChangeListener(new ed(this, r52 == true ? 1 : 0));
        bh.g gVar = this.Y.r;
        int i18 = 11;
        cg.o0 o0Var = new cg.o0(gVar, new lg.w1(this, i18));
        this.Z = o0Var;
        gVar.addTextChangedListener(o0Var);
        this.Y.setSearchFiltersListener(new av(this));
        this.Z.a();
        int i19 = 10;
        if (this.S0 == 0) {
            org.telegram.ui.ActionBar.q0 a13 = q10.a(4, R.drawable.ic_ab_other);
            this.l0 = a13;
            a13.setContentDescription(org.telegram.messenger.bd.L0(2131754839));
            this.l0.setOnClickListener(new cu(this, i19));
            this.l0.setOnLongClickListener(new nu(this, i13));
        }
        this.k0.setSearchFieldHint(org.telegram.messenger.bd.L0(2131745846));
        this.k0.setContentDescription(org.telegram.messenger.bd.L0(2131745846));
        if (this.m2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i20 = this.S0;
            if (i20 == 16) {
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131753100));
            } else if (this.O0) {
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131746262));
            } else if (this.P0) {
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131746437));
            } else if (i20 == 3 && this.g2 == null) {
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131750576));
            } else if (i20 == 10) {
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131745678));
            } else if (i20 == 14) {
                boolean z10 = this.B2;
                if (!z10 || this.A2 || this.w2 || this.z2) {
                    boolean z11 = this.A2;
                    if (!z11 || z10 || this.w2 || this.z2) {
                        boolean z12 = this.w2;
                        if (!z12 || z11 || z10) {
                            i11 = 2131752135;
                        } else {
                            i11 = 2131752135;
                            if (!this.z2) {
                                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752125));
                            }
                        }
                        if (!this.z2 || z11 || z10 || z12) {
                            this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131745679));
                        } else {
                            this.actionBar.setTitle(org.telegram.messenger.bd.L0(i11));
                        }
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752110));
                    }
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752137));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.H;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752110));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752137));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752110));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752135));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131752125));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131745679));
                }
            }
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.o2 != null || this.X2 != 0 || this.Z2 != 0) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
                this.f1 = w1Var;
                kVar.setBackButtonDrawable(w1Var);
            }
            if (this.X2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131754136));
            } else if (this.Z2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.m5.m(this.a3));
                this.actionBar.setAdditionalTextLeft(org.telegram.messenger.g0.L(28.0f));
                this.d3 = new org.telegram.ui.Components.u8(this.a3);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
                this.c3 = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
                this.c3.e(this.a3, this.d3);
                this.actionBar.addView(this.c3, b8.mf.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(26.0f), null);
                this.E3 = e5Var;
                e5Var.a = true;
                Drawable g7 = k2.p1.g(context2, R.drawable.telegram_logo_2);
                this.D3 = g7;
                g7.setBounds(0, org.telegram.messenger.g0.L(2.0f), this.D3.getIntrinsicWidth(), this.D3.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f));
                Drawable drawable = this.D3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ul);
                this.w4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.L0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.D3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.J(spannableStringBuilder, this.E3);
                r5(org.telegram.messenger.h10.i(this.currentAccount).f(), false);
            }
            if (this.X2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        int i21 = 17;
        this.actionBar.setTitleActionRunnable(new au(this, i21));
        int i22 = this.S0;
        if (((i22 == 0 && !this.m2) || i22 == 3) && this.X2 == 0 && this.Z2 == 0 && TextUtils.isEmpty(this.o2)) {
            jw jwVar2 = new jw(this, context2, this.resourceProvider);
            this.A0 = jwVar2;
            jwVar2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.A0.setDelegate(new kw(context2, this));
        }
        if (this.s2 && org.telegram.messenger.h10.c() > 1) {
            this.E1 = q10.g(11, 0, org.telegram.messenger.g0.L(56.0f));
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8();
            u8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context2);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
            this.E1.addView(k9Var2, b8.mf.e(36, 36, 17));
            this.E1.setOnClickListener(new cu(this, i18));
            this.E1.setOnLongClickListener(new nu(this, 2));
            TLRPC.User f12 = getUserConfig().f();
            u8Var.r(f12);
            ImageReceiver imageReceiver = k9Var2.getImageReceiver();
            int i23 = this.currentAccount;
            imageReceiver.d = i23;
            k9Var2.m(org.telegram.messenger.ac.m(i23, 1, f12), "50_50", org.telegram.messenger.ac.n(f12), "50_50", (f12 == null || (userProfilePhoto = f12.photo) == null || (r9 = userProfilePhoto.strippedBitmap) == null) ? u8Var : r9, f12);
        }
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 28));
        mw mwVar = new mw(context2, this);
        this.fragmentView = mwVar;
        this.s4 = new ru(this, mwVar, new PointF(), i12);
        int i24 = (this.X2 == 0 && this.Z2 == 0 && (((i10 = this.S0) == 0 && !this.m2) || i10 == 3)) ? 2 : 1;
        this.f0 = new tw[i24];
        int i25 = 0;
        while (i25 < i24) {
            tw twVar = new tw(context2, this);
            mwVar.addView(twVar, b8.mf.c(-1.0f, -1));
            twVar.s = this.S0;
            this.f0[i25] = twVar;
            twVar.x = new org.telegram.ui.Components.iz(context2);
            twVar.x.setViewType(7);
            twVar.x.setVisibility(8);
            twVar.addView(twVar.x, b8.mf.e(-2, -2, i21));
            pw pwVar = new pw(this, context2, twVar);
            twVar.a = pwVar;
            this.glassEngine.b(pwVar);
            ?? r10 = twVar.a;
            twVar.b = new b8.kg((org.telegram.ui.Components.tj0) r10);
            r10.setAllowStopHeaveOperations(r5);
            twVar.a.setAccessibilityEnabled(false);
            twVar.a.o1(0, r5);
            twVar.a.setClipToPadding(false);
            twVar.a.setPivotY(0.0f);
            if (this.S0 == 15) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, twVar.a, getResourceProvider());
            }
            twVar.y = new xu(twVar.a, twVar);
            twVar.a.setVerticalScrollBarEnabled(r5);
            twVar.a.setInstantClick(r5);
            twVar.c = new zu(this, twVar);
            twVar.c.j1(r5);
            twVar.a.setLayoutManager(twVar.c);
            twVar.a.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? r5 : 2);
            twVar.addView(twVar.a, b8.mf.c(-1.0f, -1));
            twVar.a.setOnItemClickListener(new org.telegram.ui.Components.i41(i18, this, twVar));
            twVar.a.setOnItemLongClickListener(new m2.t(14, this, twVar));
            twVar.f = new sw(this, twVar);
            twVar.E = new org.telegram.ui.Components.wi0(twVar.a, false);
            swVar = twVar.f;
            twVar.e = new u4.y(swVar);
            yVar = twVar.e;
            yVar.h(twVar.a);
            twVar.a.setOnScrollListener(new bv(this, twVar, mwVar));
            twVar.w = org.telegram.messenger.az.q1 ? 2 : 0;
            if (twVar.n == null && this.X2 == 0 && this.Z2 == 0) {
                twVar.n = new cv(org.telegram.messenger.bd.L0(2131754720), org.telegram.messenger.bd.L0(2131754722), twVar);
                if (l4()) {
                    twVar.n.h();
                } else {
                    twVar.n.b();
                }
                cv cvVar = twVar.n;
                i3 = twVar.w;
                cvVar.g(i3 != 0);
            }
            mw mwVar2 = mwVar;
            int i26 = i25;
            int i27 = i24;
            context2 = context;
            twVar.d = new dv(this, this, context, twVar.s, this.X2, this.m2, arrayList, this.currentAccount, this.H, twVar);
            mVar = twVar.d;
            mVar.S(twVar.a);
            mVar2 = twVar.d;
            mVar2.Q(this.u2);
            if (twVar.s == 3) {
                mVar6 = twVar.d;
                mVar6.N(getMessagesController().W4() && (nwVar = this.D2) != null && nwVar.G());
            }
            if (org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.pr prVar2 = this.q2;
                if (prVar2.a != 0) {
                    mVar5 = twVar.d;
                    mVar5.R(prVar2.a);
                }
            }
            mVar3 = twVar.d;
            mVar3.O(twVar.n);
            pw pwVar2 = twVar.a;
            mVar4 = twVar.d;
            pwVar2.setAdapter(mVar4);
            twVar.a.setEmptyView((this.X2 == 0 && this.Z2 == 0) ? twVar.x : null);
            twVar.r = new org.telegram.ui.Components.vi0(twVar.a, twVar.c);
            org.telegram.ui.Components.vi0 vi0Var = twVar.r;
            vi0Var.c = true;
            vi0Var.d = true;
            vi0Var.h = new du(this, 13);
            if (i26 != 0) {
                this.f0[i26].setVisibility(8);
            }
            i25 = i26 + 1;
            r5 = 1;
            mwVar = mwVar2;
            i18 = 11;
            i24 = i27;
            i21 = 17;
        }
        mw mwVar3 = mwVar;
        int i28 = i18;
        int i29 = r5;
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(context2);
        this.L1 = orVar;
        int i30 = org.telegram.ui.ActionBar.k6.d6;
        orVar.setColor(org.telegram.ui.ActionBar.k6.v0(i30));
        mwVar3.addView(this.L1, b8.mf.e(-1, 100, 48));
        this.C0 = mwVar3.getChildCount();
        sy0 sy0Var = new sy0((Activity) getContext());
        this.a0 = sy0Var;
        mwVar3.addView(sy0Var, b8.mf.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        sy0 sy0Var2 = this.a0;
        hh.e o10 = b8.cd.o(this.resourceProvider);
        eh.c cVar = this.q4;
        gh.g b10 = cVar.b(sy0Var2, o10);
        org.telegram.messenger.camera.q.p(b10, org.telegram.messenger.g0.L(18.0f), 6.666f);
        this.a0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
        this.a0.setBlurredBackground(b10);
        kg.n0 n0Var = new kg.n0(getParentActivity(), null);
        this.c0 = n0Var;
        n0Var.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
        kg.n0 n0Var2 = this.c0;
        n0Var2.i3 = false;
        n0Var2.setOnItemClickListener(new iu(this, i29));
        this.a0.addView(this.c0, b8.mf.e(-1, -1, 48));
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context2, this.resourceProvider, i29);
        this.v0 = l00Var;
        l00Var.setContentDescription(org.telegram.messenger.bd.L0(2131744568));
        this.v0.setImageResource(R.drawable.outline_fab_story_24);
        this.v0.setOnClickListener(new cu(this, 27));
        mwVar3.addView(this.v0, org.telegram.ui.Components.l00.c());
        org.telegram.ui.Components.l00 l00Var2 = new org.telegram.ui.Components.l00(context2, this.resourceProvider);
        this.u0 = l00Var2;
        mwVar3.addView(l00Var2, org.telegram.ui.Components.l00.b());
        this.u0.setOnClickListener(new cu(this, 28));
        if (!q4() && this.S0 == 0 && org.telegram.messenger.hp.s1(this.currentAccount).t1().getBoolean("storyhint", i29)) {
            gi.l3 l3Var = new gi.l3(context2, 2);
            l3Var.s(8.0f);
            l3Var.d = 8000L;
            l3Var.k(i29);
            l3Var.h = org.telegram.messenger.g0.L(165.0f);
            l3Var.r(i29);
            l3Var.u(org.telegram.messenger.g0.K2(org.telegram.messenger.bd.L0(2131744722), gi.va.m(context2), "%s"));
            l3Var.o(1.0f, -40.0f);
            l3Var.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            l3Var.r0 = new wu(this, 2);
            this.q0 = l3Var;
            mwVar3.addView(l3Var, b8.mf.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        s5();
        this.b0 = null;
        int i31 = 5;
        if (this.m2 || this.S0 != 0) {
            f10 = 72.0f;
            if (this.S0 == 3 || U3()) {
                kh.f fVar = new kh.f(context2);
                this.z1 = fVar;
                fVar.setClipChildren(false);
                kh.f fVar2 = this.z1;
                sh.h hVar = this.w;
                fVar2.setWindowInsetsProvider(hVar);
                kh.f fVar3 = this.z1;
                fVar3.setInputIslandBubbleDrawable(cVar.b(fVar3, b8.cd.o(this.resourceProvider)));
                kh.f fVar4 = this.z1;
                fVar4.setUnderKeyboardBackgroundDrawable(this.o4.b(fVar4, b8.cd.o(this.resourceProvider)));
                eh.d dVar = new eh.d(this.r4.b(this.z1, null));
                if (!org.telegram.messenger.az.f() || org.telegram.messenger.lc.e(262144)) {
                    dVar.b(org.telegram.messenger.g0.L(72.0f), i29);
                }
                this.z1.setBackgroundWithFadeDrawable(dVar);
                FrameLayout inputIslandBubbleContainer = this.z1.getInputIslandBubbleContainer();
                this.A1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.B1 = this.z1.getInAppKeyboardBubbleContainer();
                gv gvVar = this.C1;
                if (gvVar != null) {
                    gvVar.A0();
                }
                gv gvVar2 = new gv(this, getParentActivity(), mwVar3);
                this.C1 = gvVar2;
                gvVar2.setInAppInsetsController(hVar);
                this.C1.z4 = false;
                mwVar3.setClipChildren(false);
                mwVar3.setClipToPadding(false);
                gv gvVar3 = this.C1;
                gvVar3.y4 = false;
                gvVar3.j2 = (org.telegram.messenger.g0.E || ((wmVar = gvVar3.Q2) != null && wmVar.isInBubbleMode())) ? false : i29;
                this.C1.T0(false, false);
                this.C1.f1(i29, false);
                this.C1.A1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
                f11 = 0.0f;
                this.C1.getSendButton().setAlpha(0.0f);
                this.C1.setViewParentForEmoji(this.B1);
                this.A1.addView(this.C1, b8.mf.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                mwVar3.addView(this.z1.getFadeView(), b8.mf.c(-1.0f, -1));
                mwVar3.addView(this.z1, b8.mf.c(-1.0f, -1));
                if (m4() || this.F2 != null || this.G2 != null) {
                    v3(this.V3);
                    this.V3 = null;
                }
                this.C1.setDelegate(new av(this));
                mi.x1 x1Var = new mi.x1(this, context2, this.resourceProvider);
                this.D1 = x1Var;
                int L = org.telegram.messenger.g0.L(52.0f);
                int L2 = org.telegram.messenger.g0.L(38.0f);
                x1Var.J = L;
                x1Var.K = L2;
                mi.x1 x1Var2 = this.D1;
                float L3 = org.telegram.messenger.g0.L(7.0f);
                float L4 = org.telegram.messenger.g0.L(8.0f);
                x1Var2.N = L3;
                x1Var2.O = L4;
                mi.x1 x1Var3 = this.D1;
                x1Var3.i0 = i29;
                mwVar3.addView(x1Var3, b8.mf.e(org.telegram.messenger.hs.v1, 50, 85));
                this.D1.setScrimViewBackgroundColor(getThemedColor(i30));
                this.D1.setOnClickListener(new cu(this, i31));
                this.D1.setOnLongClickListener(new nu(this, i12));
                this.D1.setVisibility(8);
                this.D1.setScaleX(0.2f);
                this.D1.setScaleY(0.2f);
                this.D1.setAlpha(0.0f);
                float L5 = org.telegram.messenger.g0.L(12.0f);
                TextPaint textPaint = this.F1;
                textPaint.setTextSize(L5);
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                jwVar = this.A0;
                if (jwVar != null) {
                    gh.g b11 = cVar.b(jwVar, b8.cd.o(this.resourceProvider));
                    org.telegram.messenger.camera.q.p(b11, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    this.A0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    this.A0.setBlurredBackground(b11);
                    mwVar3.addView(this.A0, b8.mf.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                iwVar = this.Y;
                if (iwVar != null) {
                    iwVar.setupBlurredBackground(cVar.b(iwVar, b8.cd.o(this.resourceProvider)));
                }
                mv mvVar = new mv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
                this.F0 = mvVar;
                mvVar.setActionBar(this.actionBar);
                this.F0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
                mv mvVar2 = this.F0;
                mvVar2.m0 = false;
                mvVar2.setVisibility(8);
                this.N = false;
                this.M = false;
                this.L = false;
                if (this.m2 && this.S0 == 3) {
                    org.telegram.messenger.hp.s1(this.currentAccount).J1();
                }
                mwVar3.addView(this.actionBar, b8.mf.c(-2.0f, -1));
                if (!this.m2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context2);
                    this.F3 = oVar;
                    mwVar3.addView(oVar, b8.mf.e(20, 20, 51));
                }
                iwVar2 = this.Y;
                if (iwVar2 != null) {
                    mwVar3.addView(iwVar2, b8.mf.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.y0 = mwVar3.getChildCount();
                UndoView[] undoViewArr = this.z0;
                undoViewArr[0] = null;
                undoViewArr[i29] = null;
                if (this.X) {
                    this.actionBar.getTitlesContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
                    org.telegram.ui.ActionBar.r6.d(this.actionBar, org.telegram.ui.ActionBar.k6.Ul, getResourceProvider());
                }
                if (this.X2 == 0 || this.Z2 != 0) {
                    this.f0[0].a.setGlowColor(getThemedColor(i30));
                    org.telegram.ui.ActionBar.r6.b(this.actionBar, org.telegram.ui.ActionBar.k6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.r6.a(this.actionBar, org.telegram.ui.ActionBar.k6.N8, getResourceProvider(), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.R8), i29);
                }
                if (!this.m2 && this.S0 == 0) {
                    org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(i29, context2, this);
                    this.L0 = r0Var;
                    r0Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i30), 100)));
                    this.L0.setFocusable(false);
                    this.L0.setImportantForAccessibility(2);
                    this.L0.setOnClickListener(new cu(this, 7));
                    this.L0.setVisibility(8);
                    mwVar3.addView(this.L0, b8.mf.c(-1.0f, -1));
                }
                this.g1.setColor(getThemedColor(i30));
                this.r3 = false;
                if (this.o2 == null) {
                    a5(i29, false, false, false);
                    this.Y.r.setText(this.o2);
                    this.Y.r.setSelection(this.o2.length());
                } else if (this.p2 != null) {
                    a5(i29, false, false, i29);
                    this.Z.b(i29);
                    this.Y.r.setText(this.p2);
                    this.Y.r.setSelection(this.p2.length());
                    this.p2 = null;
                    iw iwVar4 = this.Y;
                    if (iwVar4 != null) {
                        iwVar4.setTranslationY(i4() + (-org.telegram.messenger.g0.L(36.0f)));
                    }
                } else {
                    a5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(mwVar3);
                this.G3 = new pv(this, context2, mwVar3, context2);
                i5(i29, false);
                this.G3.setOpenProgress(f11);
                mwVar3.addView(this.F0, b8.mf.c(81.0f, -1));
                mwVar3.addView(this.G3, b8.mf.c(-1.0f, -1));
                this.G0 = new org.telegram.ui.Components.nr(context2);
                prVar = this.K1;
                if (prVar != null) {
                    mwVar3.addView(prVar, b8.mf.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.Z2 != 0 && this.S0 != 3 && org.telegram.messenger.t3.c(this.a3)) {
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.L0(2131751989));
                    spannableStringBuilder2.setSpan(wpVar, 0, i29, 33);
                    gi.d dVar2 = new gi.d(context2, this.resourceProvider);
                    this.w0 = dVar2;
                    dVar2.f();
                    this.w0.setText(spannableStringBuilder2);
                    this.w0.setOnClickListener(new org.telegram.ui.Components.ux0(16, this, new org.telegram.ui.ActionBar.s1[i29]));
                    mh.f fVar5 = new mh.f(getContext());
                    this.x0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.k6.a7);
                    this.x0.setFadeZoneBottom(org.telegram.messenger.g0.L(f10) + org.telegram.messenger.g0.n);
                    this.x0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
                    mwVar3.addView(this.x0, b8.mf.g());
                    mwVar3.addView(this.w0, b8.mf.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
                }
                t5(false);
                l5(false);
                R3();
                O3();
                Q3();
                P3();
                N3();
                H3();
                this.Y.setBlurredBackgroundVisibility(this.b.e);
                pi.q qVar = this.glassEngine;
                qVar.a = new du(this, 8);
                qVar.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
                r0.i0.l(this.fragmentView, new du(this, 9));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.pr prVar3 = new org.telegram.ui.Components.pr(context2);
            this.K1 = prVar3;
            prVar3.setOnAnimatedHeightChangedListener(new wu(this, i28));
            gh.g a14 = cVar.a(this.K1);
            a14.p(b8.cd.o(this.resourceProvider));
            a14.q(org.telegram.messenger.g0.L(7.0f));
            f10 = 72.0f;
            this.K1.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
            this.K1.setBlurredBackground(a14);
            this.K1.setDefaultRadiusDp(this.Z2 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.H1 = frameLayout;
            this.K1.addView(frameLayout);
            this.K1.h(5, this.H1);
            this.K1.g(this.H1);
            this.K1.i(this.H1, i29, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.J1 = frameLayout2;
            this.K1.addView(frameLayout2);
            int i32 = 4;
            this.K1.h(4, this.J1);
            this.K1.g(this.J1);
            this.K1.i(this.J1, i29, false);
            ev evVar = new ev(this, context2, this, 0);
            this.G1 = evVar;
            this.H1.addView(evVar);
            ev evVar2 = new ev(this, context2, this, i29);
            this.I1 = evVar2;
            this.J1.addView(evVar2);
            this.K1.setCallFragmentContextView(this.I1);
            org.telegram.ui.Cells.b3 b3Var = new org.telegram.ui.Cells.b3(context2);
            this.N1 = b3Var;
            b3Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            g5();
            z6.m0(new fu(this, i12));
            z6.r0(new c5(this, 11));
            this.K1.addView(this.N1);
            if (this.Z2 != 0) {
                ki.j jVar = new ki.j(context2, this.resourceProvider, i29);
                this.R1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, org.telegram.messenger.bd.L0(2131751895), null, false);
                this.R1.setUnreadMode(i29);
                this.R1.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.R1.setOnClickListener(new cu(this, i32));
                this.K1.addView(this.R1);
                B3(false);
            }
        }
        f11 = 0.0f;
        jwVar = this.A0;
        if (jwVar != null) {
        }
        iwVar = this.Y;
        if (iwVar != null) {
        }
        mv mvVar3 = new mv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
        this.F0 = mvVar3;
        mvVar3.setActionBar(this.actionBar);
        this.F0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
        mv mvVar22 = this.F0;
        mvVar22.m0 = false;
        mvVar22.setVisibility(8);
        this.N = false;
        this.M = false;
        this.L = false;
        if (this.m2) {
            org.telegram.messenger.hp.s1(this.currentAccount).J1();
        }
        mwVar3.addView(this.actionBar, b8.mf.c(-2.0f, -1));
        if (!this.m2) {
        }
        iwVar2 = this.Y;
        if (iwVar2 != null) {
        }
        this.y0 = mwVar3.getChildCount();
        UndoView[] undoViewArr2 = this.z0;
        undoViewArr2[0] = null;
        undoViewArr2[i29] = null;
        if (this.X) {
        }
        if (this.X2 == 0) {
        }
        this.f0[0].a.setGlowColor(getThemedColor(i30));
        org.telegram.ui.ActionBar.r6.b(this.actionBar, org.telegram.ui.ActionBar.k6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.r6.a(this.actionBar, org.telegram.ui.ActionBar.k6.N8, getResourceProvider(), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.R8), i29);
        if (!this.m2) {
            org.telegram.ui.Components.voip.r0 r0Var2 = new org.telegram.ui.Components.voip.r0(i29, context2, this);
            this.L0 = r0Var2;
            r0Var2.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i30), 100)));
            this.L0.setFocusable(false);
            this.L0.setImportantForAccessibility(2);
            this.L0.setOnClickListener(new cu(this, 7));
            this.L0.setVisibility(8);
            mwVar3.addView(this.L0, b8.mf.c(-1.0f, -1));
        }
        this.g1.setColor(getThemedColor(i30));
        this.r3 = false;
        if (this.o2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(mwVar3);
        this.G3 = new pv(this, context2, mwVar3, context2);
        i5(i29, false);
        this.G3.setOpenProgress(f11);
        mwVar3.addView(this.F0, b8.mf.c(81.0f, -1));
        mwVar3.addView(this.G3, b8.mf.c(-1.0f, -1));
        this.G0 = new org.telegram.ui.Components.nr(context2);
        prVar = this.K1;
        if (prVar != null) {
        }
        if (this.Z2 != 0) {
            org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) org.telegram.messenger.bd.L0(2131751989));
            spannableStringBuilder22.setSpan(wpVar2, 0, i29, 33);
            gi.d dVar22 = new gi.d(context2, this.resourceProvider);
            this.w0 = dVar22;
            dVar22.f();
            this.w0.setText(spannableStringBuilder22);
            this.w0.setOnClickListener(new org.telegram.ui.Components.ux0(16, this, new org.telegram.ui.ActionBar.s1[i29]));
            mh.f fVar52 = new mh.f(getContext());
            this.x0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.k6.a7);
            this.x0.setFadeZoneBottom(org.telegram.messenger.g0.L(f10) + org.telegram.messenger.g0.n);
            this.x0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            mwVar3.addView(this.x0, b8.mf.g());
            mwVar3.addView(this.w0, b8.mf.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        }
        t5(false);
        l5(false);
        R3();
        O3();
        Q3();
        P3();
        N3();
        H3();
        this.Y.setBlurredBackgroundVisibility(this.b.e);
        pi.q qVar2 = this.glassEngine;
        qVar2.a = new du(this, 8);
        qVar2.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
        r0.i0.l(this.fragmentView, new du(this, 9));
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0218 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d4(int i3, int i10, int i11, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.S1) != null) {
            return arrayList;
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).a);
        a0.h hVar = s12.R;
        ArrayList arrayList2 = s12.K;
        ArrayList arrayList3 = s12.J;
        ArrayList arrayList4 = s12.I;
        ArrayList arrayList5 = s12.H;
        ArrayList arrayList6 = s12.M;
        ArrayList arrayList7 = s12.G;
        if (i10 == 0) {
            return s12.W0(i11);
        }
        if (i10 == 10 || i10 == 13) {
            return s12.F;
        }
        if (i10 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.z2) {
                arrayList8.add(new ow(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.w2) {
                arrayList8.add(new ow(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i12);
                    if ((this.z2 && org.telegram.messenger.t3.U(i3, -dialog.id)) || (this.w2 && (org.telegram.messenger.t3.m0(i3, -dialog.id) || !org.telegram.messenger.t3.S(i3, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new ow(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i10 == 3) {
            return s12.E;
        }
        if (i10 == 4 || i10 == 12) {
            return arrayList2;
        }
        if (i10 == 5) {
            return arrayList3;
        }
        if (i10 == 6 || i10 == 11) {
            return arrayList6;
        }
        if (i10 == 7 || i10 == 8) {
            org.telegram.messenger.mo moVar = s12.N[i10 != 7 ? 1 : 0];
            return moVar == null ? s12.W0(i11) : this.S0 == 3 ? moVar.l : moVar.k;
        }
        if (i10 == 9) {
            return s12.L;
        }
        if (i10 != 1 && i10 != 16 && i10 != 14) {
            if (i10 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User a22 = s12.a2(Long.valueOf(this.I));
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap concurrentHashMap = s12.d;
                int size2 = arrayList2.size();
                while (r8 < size2) {
                    Object obj = arrayList2.get(r8);
                    r8++;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                    if (x4(getMessagesController().a2(Long.valueOf(dialog2.id)))) {
                        arrayList9.add(dialog2);
                    }
                }
                for (TLRPC.User user : concurrentHashMap.values()) {
                    if (user != null && !hVar.d(user.id) && x4(user)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j10 = user.id;
                        tL_peerUser.user_id = j10;
                        tL_dialog.id = j10;
                        arrayList9.add(tL_dialog);
                    }
                }
            } else {
                boolean z12 = requestPeerType instanceof TLRPC.TL_requestPeerTypeChat;
                if (z12 || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                    ConcurrentHashMap concurrentHashMap2 = s12.b;
                    if (z12) {
                        arrayList3 = arrayList6;
                    }
                    int size3 = arrayList3.size();
                    while (r8 < size3) {
                        Object obj2 = arrayList3.get(r8);
                        r8++;
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                        if (w4(getMessagesController().M0(Long.valueOf(-dialog3.id)), a22)) {
                            arrayList9.add(dialog3);
                        }
                    }
                    for (TLRPC.Chat chat : concurrentHashMap2.values()) {
                        if (chat != null && !hVar.d(-chat.id) && w4(chat, a22)) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            if (org.telegram.messenger.t3.T(chat)) {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_dialog2.peer = tL_peerChannel;
                                tL_peerChannel.channel_id = chat.id;
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_dialog2.peer = tL_peerChat;
                                tL_peerChat.chat_id = chat.id;
                            }
                            tL_dialog2.id = -chat.id;
                            arrayList9.add(tL_dialog2);
                        }
                    }
                }
            }
            return arrayList9;
        }
        ArrayList arrayList10 = this.T3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.T3 = new ArrayList();
        r9 = i10 == 16;
        if (this.A2 || this.B2 || r9) {
            int size4 = arrayList2.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj3 = arrayList2.get(i13);
                i13++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User a23 = s12.a2(Long.valueOf(dialog4.id));
                if (a23 != null && !org.telegram.messenger.l10.x(a23)) {
                    if (!r9) {
                        if (a23.bot) {
                            if (this.B2) {
                                if (org.telegram.messenger.l10.B(a23)) {
                                }
                            }
                        } else if (this.A2) {
                            if (org.telegram.messenger.l10.B(a23)) {
                            }
                        }
                        this.T3.add(dialog4);
                    } else if (!org.telegram.messenger.l10.A(a23.id) && !org.telegram.messenger.hp.F2(a23)) {
                        this.T3.add(dialog4);
                    }
                }
            }
        }
        if (this.w2 || (((z11 = this.y2) && this.x2) || r9)) {
            int size5 = arrayList6.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj4 = arrayList6.get(i14);
                i14++;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) obj4;
                TLRPC.Chat M0 = s12.M0(Long.valueOf(-dialog5.id));
                if (M0 != null && !org.telegram.messenger.t3.V(M0)) {
                    if (r9) {
                        if (org.telegram.messenger.t3.n0(M0)) {
                            this.T3.add(dialog5);
                        }
                    } else if (s12.y(dialog5)) {
                        this.T3.add(dialog5);
                    }
                }
            }
        } else if (z11 || this.x2 || r9) {
            int size6 = arrayList6.size();
            int i15 = 0;
            while (i15 < size6) {
                Object obj5 = arrayList6.get(i15);
                i15++;
                TLRPC.Dialog dialog6 = (TLRPC.Dialog) obj5;
                TLRPC.Chat M02 = s12.M0(Long.valueOf(-dialog6.id));
                if (M02 != null && !org.telegram.messenger.t3.V(M02)) {
                    if (r9) {
                        if (org.telegram.messenger.t3.n0(M02)) {
                            this.T3.add(dialog6);
                        }
                    } else if (s12.y(dialog6)) {
                        if (this.y2) {
                            if (!org.telegram.messenger.t3.n0(M02)) {
                                this.T3.add(dialog6);
                            }
                        }
                        if (this.x2 && org.telegram.messenger.t3.n0(M02)) {
                            this.T3.add(dialog6);
                        }
                    }
                }
            }
        }
        if (this.z2 || r9) {
            int size7 = arrayList3.size();
            while (r8 < size7) {
                Object obj6 = arrayList3.get(r8);
                r8++;
                TLRPC.Dialog dialog7 = (TLRPC.Dialog) obj6;
                TLRPC.Chat M03 = s12.M0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (M03 instanceof TLRPC.TL_channel) {
                        this.T3.add(dialog7);
                    }
                } else if (s12.y(dialog7)) {
                    this.T3.add(dialog7);
                }
            }
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        ArrayList arrayList11 = this.T3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.E7);
        }
        return this.T3;
    }

    public final void d5(boolean z10) {
        tw[] twVarArr;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            twVarArr = this.f0;
            if (i10 >= twVarArr.length) {
                break;
            }
            twVarArr[i10].a.C0();
            i10++;
        }
        char c2 = (!z10 || twVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i11 = twVarArr[c2].h;
        if (i11 < 0 || i11 >= getMessagesController().T0().size()) {
            return;
        }
        org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) getMessagesController().T0().get(this.f0[c2].h);
        if (moVar.e()) {
            tw twVar = this.f0[c2];
            twVar.s = this.S0;
            pw pwVar = twVar.a;
            int i12 = pw.C3;
            pwVar.D1();
        } else {
            tw[] twVarArr2 = this.f0;
            if (twVarArr2[c2 ^ 1].s == 7) {
                twVarArr2[c2].s = 8;
            } else {
                twVarArr2[c2].s = 7;
            }
            twVarArr2[c2].a.setScrollEnabled(true);
            org.telegram.messenger.hp messagesController = getMessagesController();
            char c10 = this.f0[c2].s == 8 ? (char) 1 : (char) 0;
            org.telegram.messenger.mo[] moVarArr = messagesController.N;
            org.telegram.messenger.mo moVar2 = moVarArr[c10];
            if (moVar2 != moVar) {
                moVarArr[c10] = moVar;
                int i13 = c10 ^ 1;
                if (moVarArr[i13] == moVar) {
                    moVarArr[i13] = null;
                }
                if (moVarArr[c10] != null) {
                    messagesController.T4(null);
                } else if (moVar2 != null) {
                    moVar2.k.clear();
                    moVar2.l.clear();
                }
            }
        }
        tw[] twVarArr3 = this.f0;
        if (twVarArr3.length > 1) {
            twVarArr3[1].F = moVar.p;
        }
        tw twVar2 = twVarArr3[c2];
        dv dvVar = twVar2.d;
        dvVar.h = twVar2.s;
        dvVar.f();
        tw twVar3 = this.f0[c2];
        zu zuVar = twVar3.c;
        if (twVar3.s == 0 && l4() && this.f0[c2].w == 2) {
            i3 = 1;
        }
        zuVar.h1(i3, (int) this.O);
        C3(this.f0[c2]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:426:0x05ae, code lost:
    
        if (org.telegram.messenger.t3.S(r4.K0, r11) != false) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.cs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        org.telegram.messenger.mo moVar;
        int i12;
        char c2;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.bm0 bm0Var;
        org.telegram.ui.Components.bm0 bm0Var2;
        int i13;
        boolean z11;
        boolean z12;
        int i14 = 2;
        ArrayList arrayList = null;
        char c10 = 1;
        int i15 = 0;
        if (i3 == org.telegram.messenger.hs.s) {
            if (this.f0 == null || this.T1) {
                return;
            }
            int i16 = 0;
            while (true) {
                tw[] twVarArr = this.f0;
                if (i16 >= twVarArr.length) {
                    break;
                }
                tw twVar = twVarArr[i16];
                int i17 = twVarArr[0].s;
                org.telegram.messenger.mo moVar2 = (i17 == 7 || i17 == 8) ? getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0] : null;
                if (moVar2 != null) {
                    int i18 = moVar2.g;
                    int i19 = org.telegram.messenger.hp.C8;
                    if ((i18 & 64) != 0) {
                        z12 = true;
                        if (this.A3 || !z12) {
                            G4(twVar);
                        } else {
                            org.telegram.messenger.g0.i3(new pp(this, twVar, objArr, i14), 160L);
                        }
                        i16++;
                    }
                }
                z12 = false;
                if (this.A3) {
                }
                G4(twVar);
                i16++;
            }
            jw jwVar = this.A0;
            if (jwVar != null && jwVar.getVisibility() == 0) {
                this.A0.c();
            }
            this.A3 = false;
            return;
        }
        if (i3 == org.telegram.messenger.hs.q5) {
            u5(0, true);
            return;
        }
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.Z2 != chatFull.id) {
                return;
            }
            this.b3 = chatFull;
            B3(false);
            if (this.f0 == null || this.T1) {
                return;
            }
            while (true) {
                tw[] twVarArr2 = this.f0;
                if (i15 >= twVarArr2.length) {
                    return;
                }
                G4(twVarArr2[i15]);
                i15++;
            }
        } else {
            if (i3 == org.telegram.messenger.hs.d2) {
                jw jwVar2 = this.A0;
                if (jwVar2 == null || jwVar2.getVisibility() != 0) {
                    return;
                }
                jw jwVar3 = this.A0;
                int defaultTabId = jwVar3.getDefaultTabId();
                ci.j1 j1Var = jwVar3.G;
                ArrayList arrayList2 = jwVar3.h;
                int i20 = jwVar3.m0.get(defaultTabId, -1);
                if (i20 < 0 || i20 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.yy yyVar = (org.telegram.ui.Components.yy) arrayList2.get(i20);
                if (yyVar.d == ((kw) jwVar3.K).a(yyVar.a) || ((kw) jwVar3.K).a(yyVar.a) < 0) {
                    return;
                }
                j1Var.g1();
                if (jwVar3.n0.get(i20) != yyVar.a(true) || jwVar3.i0) {
                    jwVar3.i0 = true;
                    jwVar3.requestLayout();
                    j1Var.setItemAnimator(jwVar3.t0);
                    n4 n4Var = jwVar3.J;
                    if (n4Var != null) {
                        n4Var.f();
                    }
                    jwVar3.N = 0;
                    org.telegram.ui.Components.yy d = jwVar3.d();
                    if (d != null) {
                        d.b(org.telegram.messenger.bd.M0(2131750808, null));
                    }
                    int size = arrayList2.size();
                    while (i15 < size) {
                        jwVar3.N = org.telegram.messenger.k5.C(24.0f, ((org.telegram.ui.Components.yy) arrayList2.get(i15)).a(true), jwVar3.N);
                        i15++;
                    }
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.Z4) {
                u5(0, true);
                return;
            }
            if (i3 == org.telegram.messenger.hs.Y4) {
                u5(0, true);
                return;
            }
            if (i3 == org.telegram.messenger.hs.i4) {
                if (this.f0 != null) {
                    int i21 = 0;
                    while (true) {
                        tw[] twVarArr3 = this.f0;
                        if (i21 >= twVarArr3.length) {
                            break;
                        }
                        pw pwVar = twVarArr3[i21].a;
                        if (pwVar != null) {
                            for (int i22 = 0; i22 < pwVar.getChildCount(); i22++) {
                                View childAt = pwVar.getChildAt(i22);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i21++;
                    }
                }
                jw jwVar4 = this.A0;
                if (jwVar4 != null) {
                    jwVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.I4) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.l(true);
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.A4) {
                m5(false, false);
                return;
            }
            long j10 = 0;
            if (i3 == org.telegram.messenger.hs.r) {
                Integer num = (Integer) objArr[0];
                u5(num.intValue(), true);
                jw jwVar5 = this.A0;
                if (jwVar5 != null && jwVar5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i23 = org.telegram.messenger.hp.C8;
                    if ((intValue & 256) != 0) {
                        this.A0.c();
                    }
                }
                if (this.Z2 != 0) {
                    int intValue2 = num.intValue();
                    int i24 = org.telegram.messenger.hp.C8;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.Z2));
                        this.a3 = M0;
                        this.actionBar.setTitle(org.telegram.messenger.m5.m(M0));
                        this.c3.e(this.a3, this.d3);
                    }
                }
                if (this.f0 != null) {
                    while (i15 < this.f0.length) {
                        int intValue3 = num.intValue();
                        int i25 = org.telegram.messenger.hp.C8;
                        if ((intValue3 & 4) != 0) {
                            this.f0[i15].d.U(true);
                        }
                        i15++;
                    }
                }
                r5(org.telegram.messenger.h10.i(i10).f(), true);
                return;
            }
            int i26 = org.telegram.messenger.hs.I2;
            boolean[] zArr = z4;
            if (i3 == i26) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i3 == org.telegram.messenger.hs.Y) {
                u5(0, true);
                return;
            }
            if (i3 == org.telegram.messenger.hs.O) {
                if (this.f0 == null || this.T1) {
                    return;
                }
                org.telegram.ui.Components.l00 l00Var = this.u0;
                if (l00Var != null) {
                    z11 = l00Var.getProgressVisible();
                    this.u0.f(false, true);
                } else {
                    z11 = false;
                }
                for (tw twVar2 : this.f0) {
                    twVar2.d.e = false;
                }
                if (z11) {
                    L4(0.0f);
                    ValueAnimator valueAnimator = this.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.d0, 1.0f).setDuration(250L);
                    this.e0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.xq.f);
                    this.e0.addUpdateListener(new hu(this, i14));
                    this.e0.start();
                }
                int i27 = 0;
                boolean z13 = false;
                while (true) {
                    tw[] twVarArr4 = this.f0;
                    if (i27 >= twVarArr4.length) {
                        break;
                    }
                    if (!twVarArr4[i27].p() || getMessagesController().D0() > 10) {
                        z13 = true;
                    } else {
                        this.f0[i27].d.f();
                    }
                    i27++;
                }
                if (z13) {
                    u5(0, true);
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.h0) {
                if (this.f0 == null) {
                    return;
                }
                int i28 = 0;
                while (true) {
                    tw[] twVarArr5 = this.f0;
                    if (i28 >= twVarArr5.length) {
                        int i29 = org.telegram.messenger.hp.C8;
                        u5(512, true);
                        return;
                    }
                    if (twVarArr5[i28].p() && org.telegram.messenger.g0.Q1()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[i15]).longValue();
                        long longValue2 = ((Long) objArr[c10]).longValue();
                        org.telegram.messenger.pr prVar = this.q2;
                        if (!booleanValue2) {
                            prVar.a = longValue;
                            prVar.b = longValue2;
                        } else if (longValue == prVar.a && longValue2 == prVar.b) {
                            prVar.a = 0L;
                            prVar.b = 0L;
                        }
                        this.f0[i28].d.s = prVar.a;
                    }
                    i28++;
                    c10 = 1;
                    i15 = 0;
                }
            } else {
                if (i3 == org.telegram.messenger.hs.f0) {
                    u5(0, true);
                    return;
                }
                if (i3 == org.telegram.messenger.hs.J || i3 == org.telegram.messenger.hs.K || i3 == org.telegram.messenger.hs.M) {
                    int i30 = org.telegram.messenger.hp.C8;
                    u5(TLObject.FLAG_12, true);
                    return;
                }
                if (i3 == org.telegram.messenger.hs.n0) {
                    K3();
                    return;
                }
                if (i3 == org.telegram.messenger.hs.P0) {
                    cw cwVar = this.D0;
                    if (cwVar == null || (bm0Var2 = cwVar.e0) == null || (i13 = bm0Var2.i0) == 15) {
                        return;
                    }
                    int i31 = bm0Var2.t0;
                    org.telegram.messenger.qr.a0(i31).a.c(new k2.u(i31, i13, new kg.r(bm0Var2), i14));
                    return;
                }
                if (i3 == org.telegram.messenger.hs.s0) {
                    int i32 = org.telegram.messenger.hp.C8;
                    u5(32768, true);
                    return;
                }
                if (i3 == org.telegram.messenger.hs.S0) {
                    cw cwVar2 = this.D0;
                    if (cwVar2 == null || (bm0Var = cwVar2.e0) == null) {
                        return;
                    }
                    bm0Var.f();
                    return;
                }
                if (i3 == org.telegram.messenger.hs.T1) {
                    int connectionState = ConnectionsManager.getInstance(org.telegram.messenger.c.a(i10).a).getConnectionState();
                    if (this.e2 != connectionState) {
                        this.e2 = connectionState;
                        m5(true, false);
                        return;
                    }
                    return;
                }
                if (i3 == org.telegram.messenger.hs.b5) {
                    m5(true, false);
                    cw cwVar3 = this.D0;
                    if (cwVar3 != null) {
                        int currentPosition = cwVar3.getCurrentPosition();
                        ci.o4 o4Var = cwVar3.W;
                        q5(o4Var != null && o4Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i3 == org.telegram.messenger.hs.K2) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z10 = false;
                    } else {
                        z10 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    Runnable i9Var = new gi.i9(this, chat, longValue3, booleanValue, user, z10);
                    Z3();
                    if (this.z0[0] == null) {
                        i9Var.run();
                        return;
                    }
                    if (org.telegram.messenger.t3.c0(chat)) {
                        i9Var.run();
                        return;
                    }
                    UndoView k42 = k4();
                    if (k42 != null) {
                        k42.j(booleanValue ? 1 : 95, longValue3, i9Var);
                        return;
                    }
                    return;
                }
                if (i3 == org.telegram.messenger.hs.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i33 = this.X2;
                    if (i33 != intValue4 || i33 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i3 == org.telegram.messenger.hs.O2) {
                    i5(true, true);
                    return;
                }
                if (i3 == org.telegram.messenger.hs.P2) {
                    V4();
                    return;
                }
                if (i3 == org.telegram.messenger.hs.s1) {
                    X4();
                    g5();
                    org.telegram.messenger.hp messagesController = getMessagesController();
                    if (!messagesController.u8 && messagesController.M7 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                        boolean contains = messagesController.T3.contains("SETUP_LOGIN_EMAIL");
                        if (messagesController.T3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                            c2 = 2;
                        } else if (contains) {
                            c2 = 1;
                        }
                        if (c2 == 0) {
                            xd0 xd0Var = new xd0();
                            au auVar = new au(this, 22);
                            au auVar2 = new au(this, 23);
                            boolean z14 = c2 == 2;
                            xd0Var.G = 3;
                            xd0Var.a = 12;
                            xd0Var.e0 = auVar;
                            xd0Var.f0 = auVar2;
                            xd0Var.h0 = z14;
                            xd0Var.i0 = true;
                            presentFragment(xd0Var);
                            getMessagesController().u8 = true;
                            return;
                        }
                        return;
                    }
                    c2 = 0;
                    if (c2 == 0) {
                    }
                } else {
                    boolean z15 = true;
                    if (i3 == org.telegram.messenger.hs.N) {
                        org.telegram.ui.Components.l00 l00Var2 = this.u0;
                        if (l00Var2 != null) {
                            l00Var2.f(true, true);
                        }
                        tw[] twVarArr6 = this.f0;
                        if (twVarArr6 != null) {
                            int length = twVarArr6.length;
                            int i34 = 0;
                            while (i34 < length) {
                                dv dvVar = twVarArr6[i34].d;
                                dvVar.R = false;
                                dvVar.e = z15;
                                dvVar.f();
                                i34++;
                                z15 = true;
                            }
                            return;
                        }
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.w) {
                        if (!this.r3 || this.D0 == null) {
                            return;
                        }
                        ArrayList arrayList3 = (ArrayList) objArr[0];
                        long longValue4 = ((Long) objArr[1]).longValue();
                        cw cwVar4 = this.D0;
                        HashMap hashMap = cwVar4.C0;
                        SparseArray sparseArray = cwVar4.h;
                        int size2 = sparseArray.size();
                        for (int i35 = 0; i35 < size2; i35++) {
                            View view = (View) sparseArray.valueAt(i35);
                            if (view instanceof wz) {
                                ((wz) view).e(arrayList3, longValue4);
                            }
                        }
                        for (int i36 = 0; i36 < cwVar4.getChildCount(); i36++) {
                            if (cwVar4.getChildAt(i36) instanceof wz) {
                                ((wz) cwVar4.getChildAt(i36)).e(arrayList3, longValue4);
                            }
                        }
                        cwVar4.P0.e(arrayList3, longValue4);
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                        int i37 = 0;
                        while (i37 < arrayList4.size()) {
                            pz pzVar = (pz) arrayList4.get(i37);
                            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) hashMap.get(pzVar);
                            if (ziVar != null) {
                                long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                                if (B0 < j10) {
                                    i12 = (int) (-B0);
                                }
                                i12 = 0;
                                if (i12 == longValue4) {
                                    for (int i38 = 0; i38 < arrayList3.size(); i38++) {
                                        if (ziVar.f1() == ((Integer) arrayList3.get(i38)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(pzVar);
                                        }
                                    }
                                }
                            }
                            i37++;
                            j10 = 0;
                        }
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i39 = 0; i39 < size3; i39++) {
                                hashMap.remove(arrayList.get(i39));
                            }
                            cwVar4.A0.a(hashMap.size(), true);
                            org.telegram.ui.ActionBar.q0 q0Var = cwVar4.F0;
                            if (q0Var != null) {
                                q0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.L4) {
                        if (this.f0 != null) {
                            int i40 = 0;
                            while (true) {
                                tw[] twVarArr7 = this.f0;
                                if (i40 >= twVarArr7.length) {
                                    break;
                                }
                                kg.j jVar = twVarArr7[i40].d.Q;
                                if (jVar != null) {
                                    jVar.a.clear();
                                    jVar.b.clear();
                                    jVar.c.clear();
                                    jVar.d.clear();
                                    org.telegram.messenger.g0.r(jVar.e);
                                }
                                i40++;
                            }
                        }
                        int i41 = org.telegram.ui.Components.a10.j1;
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.T5) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                        if (this.Z2 != longValue5 || booleanValue3) {
                            return;
                        }
                        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                        if (q4Var == null || q4Var.getLastFragment() != this) {
                            removeSelfFromStack();
                            return;
                        } else {
                            finishFragment();
                            return;
                        }
                    }
                    if (i3 == org.telegram.messenger.hs.S5) {
                        if (this.Z2 == ((Long) objArr[0]).longValue()) {
                            B3(true);
                            return;
                        }
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.S4) {
                        boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                        if (this.fragmentView != null) {
                            if (!booleanValue4) {
                                kt ktVar = this.R3;
                                if (ktVar == null || ktVar.getTag() == null) {
                                    return;
                                }
                                kt ktVar2 = this.R3;
                                ktVar2.animate().setListener(null).cancel();
                                ktVar2.animate().setListener(new org.telegram.ui.Components.ri0(7, this, ktVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                this.R3.setTag(null);
                                return;
                            }
                            if (this.R3 == null) {
                                Context context = this.fragmentView.getContext();
                                kt ktVar3 = new kt(context);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
                                fh0Var.f(R.raw.db_migration_placeholder, org.telegram.messenger.hs.g2, org.telegram.messenger.hs.g2, null);
                                fh0Var.getAnimatedDrawable().K(1);
                                fh0Var.d();
                                f10.addView(fh0Var, b8.mf.r(org.telegram.messenger.hs.g2, org.telegram.messenger.hs.g2, 1));
                                TextView textView = new TextView(context);
                                k2.p1.u(textView, 1, 24.0f, null, 2131747786);
                                int i42 = org.telegram.ui.ActionBar.k6.G6;
                                org.telegram.ui.ActionBar.r6.V(textView, i42, null);
                                textView.setGravity(1);
                                TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, b8.mf.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                f11.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                                k2.p1.u(f11, 1, 14.0f, null, 2131747785);
                                org.telegram.ui.ActionBar.r6.V(f11, i42, null);
                                f11.setGravity(1);
                                TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, b8.mf.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                k2.p1.u(f12, 1, 14.0f, null, 2131747784);
                                org.telegram.ui.ActionBar.r6.V(f12, i42, null);
                                f12.setGravity(1);
                                f10.addView(f12, b8.mf.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                ktVar3.addView(f10, b8.mf.e(-1, -2, 16));
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ktVar3, null);
                                ktVar3.setOnTouchListener(new jt());
                                this.R3 = ktVar3;
                                ktVar3.setAlpha(0.0f);
                                ((mw) this.fragmentView).addView(this.R3);
                                this.R3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.R3.setTag(1);
                            return;
                        }
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.a5) {
                        D3();
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.m5) {
                        r5((TLRPC.User) objArr[0], true);
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.f5) {
                        r5(org.telegram.messenger.h10.i(i10).f(), true);
                        s5();
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.t5) {
                        zArr[this.currentAccount] = false;
                        u4(getAccountInstance());
                        getMessagesController().b3(this.X2);
                        return;
                    }
                    if (i3 == org.telegram.messenger.hs.z5) {
                        int intValue5 = ((Integer) objArr[0]).intValue();
                        int i43 = 0;
                        while (true) {
                            tw[] twVarArr8 = this.f0;
                            if (i43 >= twVarArr8.length) {
                                return;
                            }
                            tw twVar3 = twVarArr8[i43];
                            if (twVar3 != null && (((i11 = twVar3.s) == 7 || i11 == 8) && (moVar = getMessagesController().N[twVar3.s - 7]) != null && intValue5 == moVar.a)) {
                                twVar3.q(true);
                                return;
                            }
                            i43++;
                        }
                    } else {
                        if (i3 != org.telegram.messenger.hs.P1) {
                            if (i3 == org.telegram.messenger.hs.v5) {
                                t5(this.W);
                                u5(0, true);
                                return;
                            }
                            if (i3 == org.telegram.messenger.hs.Z2) {
                                s5();
                                return;
                            }
                            if (i3 == org.telegram.messenger.hs.d3) {
                                g5();
                                return;
                            }
                            if (i3 == org.telegram.messenger.hs.g5) {
                                g5();
                                return;
                            }
                            if (i3 == org.telegram.messenger.hs.y3 || i3 == org.telegram.messenger.hs.A3) {
                                g5();
                                return;
                            } else if (i3 == org.telegram.messenger.hs.P3) {
                                g5();
                                return;
                            } else {
                                if (i3 == org.telegram.messenger.hs.Q3) {
                                    g5();
                                    return;
                                }
                                return;
                            }
                        }
                        long longValue6 = ((Long) objArr[0]).longValue();
                        int i44 = 0;
                        while (true) {
                            tw[] twVarArr9 = this.f0;
                            if (i44 >= twVarArr9.length) {
                                return;
                            }
                            tw twVar4 = twVarArr9[i44];
                            if (twVar4.a != null) {
                                int i45 = 0;
                                while (true) {
                                    if (i45 < twVar4.a.getChildCount()) {
                                        View childAt2 = twVar4.a.getChildAt(i45);
                                        if (childAt2 instanceof org.telegram.ui.Cells.t2) {
                                            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt2;
                                            if (longValue6 == t2Var.getDialogId()) {
                                                t2Var.x();
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
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof ii.a3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - h4()) * this.r.e;
    }

    public final void e5() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        sy0 sy0Var = this.a0;
        float measuredHeight = (sy0Var == null || sy0Var.getVisibility() == 8) ? 0.0f : this.a0.getMeasuredHeight();
        float L = this.L ? org.telegram.messenger.g0.L(81.0f) : 0.0f;
        if (this.L) {
            float f17 = this.O;
            float f18 = this.y1;
            f10 = (measuredHeight * f18) + com.google.android.recaptcha.internal.a.y(1.0f, f18, L, f17);
            f11 = this.y3;
        } else {
            f10 = (measuredHeight * this.y1) + this.O;
            f11 = this.y3;
        }
        float f19 = f10 + f11 + this.U;
        iw iwVar = this.Y;
        float L2 = org.telegram.messenger.g0.L(4.0f) * ((iwVar == null || iwVar.getVisibility() != 0) ? 0.0f : this.Y.getAlpha());
        jw jwVar = this.A0;
        if (jwVar != null) {
            jwVar.setTranslationY(f19 - L2);
            f13 = this.A0.getAlpha();
            f14 = org.telegram.messenger.g0.L(43.0f) * f13;
            f12 = f19 + f14;
        } else {
            f12 = f19;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar != null) {
            prVar.setTranslationY(org.telegram.messenger.g0.T1(f12 - L2, (-org.telegram.messenger.g0.L(3.0f)) - (this.b0 == null ? org.telegram.messenger.g0.L(44.0f) : 0), this.b.e));
            f15 = this.K1.getMetadata().c.a;
            f16 = this.K1.c(0.0f);
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.or orVar = this.L1;
        if (orVar != null) {
            orVar.setTranslationY(f19 - L2);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f15, f13), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.or orVar2 = this.L1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f16 + f14) - W1);
            Matrix matrix = orVar2.b;
            if (orVar2.e != W1 || orVar2.f != min) {
                orVar2.e = W1;
                orVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = orVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                orVar2.invalidate();
            }
            this.L1.setAlpha(Math.max(f13, f15));
        }
    }

    public final int f4() {
        if (!this.L) {
            return org.telegram.messenger.g0.L(48.0f);
        }
        return org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(81.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x03e6, code lost:
    
        if (r1.isEmpty() == false) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0425  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f5(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.q0 q0Var;
        ?? r5;
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.q0 q0Var2;
        jw jwVar;
        org.telegram.ui.Components.yy d;
        long j10;
        TLRPC.User a22;
        this.W2 = false;
        this.U2 = 0;
        this.R2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.O2 = 0;
        this.V2 = 0;
        this.S2 = 0;
        this.T2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.J2;
        int size = arrayList.size();
        long e10 = getUserConfig().e();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i3 < size) {
            ArrayList arrayList2 = arrayList;
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(((Long) arrayList.get(i3)).longValue());
            if (dialog == null) {
                j10 = e10;
            } else {
                j10 = e10;
                long j11 = dialog.id;
                boolean s42 = s4(dialog);
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().t2(j11)) {
                    this.V2++;
                }
                if (getMessagesController().r2(j11, 0L, null)) {
                    this.R2++;
                } else {
                    this.Q2++;
                }
                if (z12) {
                    this.O2++;
                }
                if (this.X2 == 1 || dialog.folder_id == 1) {
                    this.U2++;
                } else if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().C2(j11, false)) {
                    i13++;
                }
                if (dialog.community_id != 0) {
                    i11++;
                }
                if (!org.telegram.messenger.m5.E(j11) || j11 == j10 || j11 == 489000 || org.telegram.messenger.hp.F2(getMessagesController().a2(Long.valueOf(j11)))) {
                    i15++;
                } else if (org.telegram.messenger.k5.w("dialog_bar_report", j11, notificationsSettings, true)) {
                    this.T2++;
                }
                if (org.telegram.messenger.m5.y(dialog)) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j11));
                    if (getMessagesController().C2(dialog.id, true)) {
                        this.S2++;
                        int i16 = getMessagesController().B2;
                        int i17 = org.telegram.messenger.hp.C8;
                        if (i16 == 1) {
                            i10++;
                            this.W2 = true;
                        }
                    } else {
                        if (s42) {
                            i14++;
                        } else {
                            this.P2++;
                        }
                        if (M0 == null || !M0.megagroup) {
                            this.S2++;
                        } else if (org.telegram.messenger.t3.t0(M0)) {
                            this.S2++;
                        }
                        i10++;
                    }
                } else {
                    boolean z13 = org.telegram.messenger.m5.z(dialog.id);
                    if (z13) {
                        getMessagesController().M0(Long.valueOf(-dialog.id));
                    }
                    if (org.telegram.messenger.m5.C(dialog.id)) {
                        TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        a22 = a12 != null ? getMessagesController().a2(Long.valueOf(a12.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        a22 = (z13 || !org.telegram.messenger.m5.E(dialog.id)) ? null : getMessagesController().a2(Long.valueOf(dialog.id));
                    }
                    if (a22 != null && a22.bot) {
                        org.telegram.messenger.hp.F2(a22);
                    }
                    if (s42) {
                        i14++;
                    } else {
                        this.P2++;
                    }
                }
                i12++;
                i10++;
            }
            i3++;
            arrayList = arrayList2;
            e10 = j10;
        }
        ArrayList arrayList3 = arrayList;
        org.telegram.ui.ActionBar.q0 q0Var3 = this.k1;
        if (q0Var3 != null) {
            if (i10 != size || i11 > 0) {
                q0Var3.setVisibility(8);
            } else {
                q0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = this.s1;
        if (y0Var2 != null) {
            int i18 = this.S2;
            if ((i18 == 0 || i18 == size) && ((i12 == 0 || i12 == size) && i11 <= 0)) {
                y0Var2.setVisibility(0);
                if (this.S2 != 0) {
                    this.s1.setText(org.telegram.messenger.bd.M0(2131752088, null));
                } else {
                    this.s1.setText(org.telegram.messenger.bd.M0(2131752089, null));
                }
            } else {
                y0Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.r1;
        if (y0Var3 != null && this.n1 != null) {
            if (this.U2 != 0 && i11 == 0 && this.Z2 == 0) {
                String M02 = org.telegram.messenger.bd.M0(2131743925, null);
                this.r1.j(M02, R.drawable.msg_unarchive, null);
                this.n1.setIcon(R.drawable.msg_unarchive);
                this.n1.setContentDescription(M02);
                jw jwVar2 = this.A0;
                if (jwVar2 == null || jwVar2.getVisibility() != 0) {
                    this.r1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.r1.setVisibility(8);
                }
            } else if (i13 != 0 && i11 == 0 && this.Z2 == 0) {
                String M03 = org.telegram.messenger.bd.M0(2131754172, null);
                this.r1.j(M03, R.drawable.msg_archive, null);
                this.n1.setIcon(R.drawable.msg_archive);
                this.n1.setContentDescription(M03);
                jw jwVar3 = this.A0;
                if (jwVar3 == null || jwVar3.getVisibility() != 0) {
                    this.r1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.r1.setVisibility(8);
                }
            } else {
                y0Var3.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var4 = this.l1;
        if (q0Var4 != null && this.o1 != null) {
            if (this.P2 + i14 == size && this.Z2 == 0) {
                jw jwVar4 = this.A0;
                if (jwVar4 == null || jwVar4.getVisibility() != 0) {
                    this.l1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.l1.setVisibility(8);
                }
            } else {
                q0Var4.setVisibility(8);
                this.o1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var4 = this.u1;
        if (y0Var4 != null) {
            if (i15 != 0) {
                y0Var4.setVisibility(8);
            } else {
                y0Var4.setVisibility(0);
            }
        }
        if (this.q1 != null) {
            jw jwVar5 = this.A0;
            boolean z14 = jwVar5 == null || jwVar5.getVisibility() != 0 || ((d = (jwVar = this.A0).d()) != null && d.a == jwVar.M);
            if (!z14) {
                try {
                    z14 = size >= d4(this.currentAccount, this.f0[0].d.h, this.X2, this.T1).size();
                } catch (Exception unused) {
                }
            }
            if (!z14) {
                z11 = false;
                this.q1.setVisibility(0);
                if (this.p1 != null) {
                    if (this.X2 != 1) {
                        if (this.A0 != null && e4(z11) > 0.5f) {
                            jw jwVar6 = this.A0;
                            org.telegram.ui.Components.yy d10 = jwVar6.d();
                            if (d10 != null && d10.a == jwVar6.M) {
                                int i19 = org.telegram.ui.Components.cz.u1;
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = getMessagesController().Q0;
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (i20 < size2) {
                                    org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) arrayList5.get(i20);
                                    ArrayList arrayList6 = arrayList3;
                                    if (!org.telegram.ui.Components.cz.J0(this, moVar, arrayList6, true, true).isEmpty() && !moVar.e()) {
                                        arrayList4.add(moVar);
                                    }
                                    i20++;
                                    arrayList3 = arrayList6;
                                }
                            }
                        }
                        this.p1.setVisibility(8);
                    }
                    this.p1.setVisibility(0);
                }
                q0Var = this.m1;
                if (q0Var != null) {
                    r5 = 0;
                } else if (this.R2 != 0) {
                    q0Var.setIcon(R.drawable.msg_unmute);
                    r5 = 0;
                    this.m1.setContentDescription(org.telegram.messenger.bd.M0(2131752165, null));
                } else {
                    r5 = 0;
                    q0Var.setIcon(R.drawable.msg_mute);
                    this.m1.setContentDescription(org.telegram.messenger.bd.M0(2131752175, null));
                }
                y0Var = this.t1;
                if (y0Var != 0) {
                    if (this.O2 != 0) {
                        y0Var.j(org.telegram.messenger.bd.M0(2131748689, r5), R.drawable.msg_markread, r5);
                        this.t1.setVisibility(0);
                    } else if (this.V2 == 0 && i11 == 0) {
                        y0Var.j(org.telegram.messenger.bd.M0(2131748688, r5), R.drawable.msg_markunread, r5);
                        this.t1.setVisibility(0);
                    } else {
                        y0Var.setVisibility(8);
                    }
                }
                q0Var2 = this.l1;
                if (q0Var2 != null || this.o1 == null) {
                }
                if (this.P2 != 0) {
                    q0Var2.setIcon(R.drawable.msg_pin);
                    this.l1.setContentDescription(org.telegram.messenger.bd.M0(2131747245, null));
                    this.o1.setText(org.telegram.messenger.bd.M0(2131751454, null));
                    return;
                } else {
                    q0Var2.setIcon(R.drawable.msg_unpin);
                    this.l1.setContentDescription(org.telegram.messenger.bd.M0(2131743855, null));
                    this.o1.setText(org.telegram.messenger.bd.M0(2131751453, null));
                    return;
                }
            }
            this.q1.setVisibility(8);
        }
        z11 = false;
        if (this.p1 != null) {
        }
        q0Var = this.m1;
        if (q0Var != null) {
        }
        y0Var = this.t1;
        if (y0Var != 0) {
        }
        q0Var2 = this.l1;
        if (q0Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.f60 f60Var = this.M0;
        if (f60Var != null) {
            f60Var.u();
        }
    }

    public final int g4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.LongSparseArray] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Runnable, org.telegram.ui.ActionBar.e6] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g5() {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.m mVar;
        pv pvVar;
        org.telegram.messenger.m9 m9Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i3;
        boolean z12;
        pv pvVar2;
        long j10;
        boolean z13;
        boolean z14;
        org.telegram.messenger.t1 b10;
        ?? r72;
        String G;
        StringBuilder sb2;
        final long j11;
        final long j12;
        if (this.K1 == null || this.N1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        boolean z15 = false;
        r7 = false;
        boolean z16 = false;
        if (b3Var != null) {
            try {
                ((org.telegram.ui.Components.ch0) ((org.telegram.ui.Components.u8) b3Var.h.getImageReceiver().n0).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.b3 b3Var2 = this.N1;
            b3Var2.setCompact(false);
            b3Var2.a(org.telegram.messenger.h10.t0, null);
            org.telegram.ui.Components.k9 k9Var = b3Var2.h;
            k9Var.setVisibility(8);
            k9Var.b();
        }
        long j13 = 0;
        final int i10 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().v2()) {
                this.N1.setOnClickListener(new cu(this, 12));
                this.N1.c(org.telegram.messenger.bd.M0(2131754701, null), org.telegram.messenger.bd.M0(2131754702, null), false, true);
            } else {
                int i11 = 21;
                if (this.X2 == 0 && this.Z2 == 0 && getMessagesController().T3.contains("SETUP_PASSKEY")) {
                    this.N1.setOnClickListener(new cu(this, 19));
                    this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.bd.M0(2131747638, null), this.N1.c, new au(this, i11)), org.telegram.messenger.bd.M0(2131747639, null));
                    this.N1.setOnCloseListener(new cu(this, 24));
                } else if (this.X2 == 0 && this.Z2 == 0 && getMessagesController().T3.contains("PREMIUM_GRACE")) {
                    this.N1.setOnClickListener(new cu(this, 25));
                    this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.bd.M0(2131749533, null), this.N1.c, new au(this, i11)), org.telegram.messenger.bd.M0(2131749537, null));
                    this.N1.setOnCloseListener(new cu(this, 26));
                } else if (this.X2 == 0 && this.Z2 == 0 && getMessagesController().V3 != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().V3;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    org.telegram.messenger.zi.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                    Spannable C5 = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, this.N1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.N1.c.getPaint().getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    org.telegram.messenger.zi.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                    this.N1.b(C5, org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder2, this.N1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.N1.d.getPaint().getFontMetricsInt(), false));
                    org.telegram.ui.Cells.b3 b3Var3 = this.N1;
                    final int i12 = z15 ? 1 : 0;
                    b3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tu
                        public final /* synthetic */ uw b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    sf.c.t(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    uw.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.N1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tu
                        public final /* synthetic */ uw b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    sf.c.t(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    uw.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        ci.e9 y9 = ci.e9.y(this.currentAccount, false);
                        ArrayList arrayList = y9.z;
                        if (!arrayList.isEmpty()) {
                            long j14 = -y9.f.amount;
                            int i13 = 0;
                            while (i13 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i13);
                                long j15 = j13;
                                long o10 = org.telegram.messenger.m5.o(starsSubscription.peer);
                                if (o10 >= j15) {
                                    if (getMessagesController().a2(Long.valueOf(o10)) == null) {
                                        i13++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i13++;
                                    j13 = j15;
                                } else {
                                    if (getMessagesController().M0(Long.valueOf(-o10)) == null) {
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
                                ci.e9 y10 = ci.e9.y(this.currentAccount, false);
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
                                        TLRPC.Peer peer = starsSubscription2.peer;
                                        boolean z17 = z16 ? 1 : 0;
                                        long o11 = org.telegram.messenger.m5.o(peer);
                                        if (j12 == j10) {
                                            j12 = o11;
                                        }
                                        if (o11 >= j10) {
                                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(o11));
                                            if (a22 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(org.telegram.messenger.l10.p(a22));
                                                j16 += starsSubscription2.pricing.amount;
                                                i14++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i14++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        } else {
                                            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-o11));
                                            if (M0 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(M0.title);
                                                j16 += starsSubscription2.pricing.amount;
                                                i14++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i14++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j11 = j16;
                                }
                                boolean z18 = z16;
                                final String sb4 = sb2.toString();
                                this.N1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uu
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        uw uwVar = uw.this;
                                        new ci.mb(uwVar.getParentActivity(), uwVar.getResourceProvider(), j11, 2, sb4, new au(uwVar, 2), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.b3 b3Var4 = this.N1;
                                long j17 = j11 - y10.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z18 ? 1 : 0] = sb4;
                                b3Var4.b(ci.wb.a1(z18, org.telegram.messenger.bd.K("StarsSubscriptionExpiredHintTitle2", (int) j11, ',', objArr), 0.72f, null), org.telegram.messenger.bd.M0(2131744999, null));
                                this.N1.setOnCloseListener(new cu(this, 13));
                            }
                            int i15 = 17;
                            if (this.X2 != 0 && this.Z2 == j10 && !getMessagesController().h7 && (b10 = org.telegram.messenger.v1.a(this.currentAccount).b()) != null && !b10.c.isEmpty() && !getMessagesController().U3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(this.currentAccount).b();
                                ArrayList arrayList3 = b11.c;
                                this.N1.setOnClickListener(new org.telegram.ui.Components.ux0(i15, this, b11));
                                this.N1.a(this.currentAccount, arrayList3);
                                org.telegram.ui.Cells.b3 b3Var5 = this.N1;
                                if (arrayList3.size() == 1) {
                                    r72 = 0;
                                    G = org.telegram.messenger.bd.a0(null, null, 2131753706, org.telegram.messenger.l10.k((TLRPC.User) arrayList3.get(0)));
                                } else {
                                    r72 = 0;
                                    G = org.telegram.messenger.bd.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                                }
                                b3Var5.b(org.telegram.messenger.i6.p(org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.k6.I6, 2, r72, r72), this.N1.c, new au(this, i11)), org.telegram.messenger.bd.a0(null, null, arrayList3.size() == 1 ? 2131753707 : 2131753710, new Object[0]));
                                this.N1.setOnCloseListener(new cu(this, 14));
                                ci.e9.y(this.currentAccount, false).U();
                            } else if (this.X2 != 0 && this.Z2 == j10 && org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("BIRTHDAY_SETUP") && getMessagesController().b2(getUserConfig().e()) != null && getMessagesController().b2(getUserConfig().e()).birthday == null) {
                                org.telegram.messenger.g5.r(this.currentAccount).D(false);
                                this.N1.setOnClickListener(new cu(this, 15));
                                this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.bd.M0(2131753712, null), this.N1.c, new au(this, i11)), org.telegram.messenger.bd.a0(null, null, 2131753713, new Object[0]));
                                this.N1.setOnCloseListener(new cu(this, 16));
                            } else if (!((org.telegram.messenger.hp.s1(this.currentAccount).D3() && this.X2 == 0 && this.Z2 == j10) ? org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("PREMIUM_CHRISTMAS") : false)) {
                                this.N1.setOnClickListener(new ai.t(i11));
                                this.N1.b(org.telegram.messenger.i6.m(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131749681, null), org.telegram.ui.ActionBar.k6.I6, 2, null, null), null, false, null, 0), org.telegram.messenger.bd.a0(null, null, 2131753331, new Object[0]));
                                this.N1.setOnCloseListener(new cu(this, i15));
                            } else if (!org.telegram.messenger.hp.s1(this.currentAccount).D3() && this.X2 == 0 && this.Z2 == j10 && org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("PREMIUM_RESTORE") && !getUserConfig().q() && org.telegram.messenger.li.b0(this.currentAccount).g0(false) != null) {
                                this.N1.setOnClickListener(new cu(this, 18));
                                this.N1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131746074, org.telegram.messenger.li.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.k6.I6, 2, null, null), org.telegram.messenger.bd.M0(2131746075, null));
                            } else {
                                if (org.telegram.messenger.hp.s1(this.currentAccount).D3() || this.X2 != 0 || this.Z2 != j10 || ((!(org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("PREMIUM_UPGRADE") && getUserConfig().q()) && (!org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("PREMIUM_ANNUAL") || getUserConfig().q())) || (!org.telegram.messenger.h10.i(this.currentAccount).q() ? org.telegram.messenger.li.b0(this.currentAccount).g0(false) == null : org.telegram.messenger.r2.b() || org.telegram.messenger.li.b0(this.currentAccount).g0(true) == null))) {
                                    z13 = false;
                                } else {
                                    this.B3 = org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("PREMIUM_UPGRADE");
                                    z13 = true;
                                }
                                if (z13) {
                                    this.N1.setOnClickListener(new cu(this, 20));
                                    this.N1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, this.B3 ? 2131745944 : 2131743816, org.telegram.messenger.li.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.k6.I6, 2, null, null), org.telegram.messenger.bd.M0(this.B3 ? 2131743819 : 2131745945, null));
                                } else {
                                    if (this.P1 != null && this.Q1 != null) {
                                        if (r0.longValue() / this.Q1.longValue() < 0.3f) {
                                            org.telegram.messenger.hp.e1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                        } else if (System.currentTimeMillis() > org.telegram.messenger.hp.e1().getLong("cache_hint_showafter", j10)) {
                                            z14 = true;
                                            if (!z14) {
                                                this.N1.setOnClickListener(new cu(this, i11));
                                                this.N1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131752048, org.telegram.messenger.g0.i0(this.P1.longValue(), false, false)), org.telegram.ui.ActionBar.k6.I6, 2, null, null), org.telegram.messenger.bd.M0(2131752049, null));
                                            } else if (this.X2 == 0 && this.Z2 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("USERPIC_SETUP"))) {
                                                this.N1.setOnClickListener(new cu(this, 22));
                                                this.N1.h.setVisibility(0);
                                                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                                                u8Var.setBounds(0, 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
                                                long e10 = getUserConfig().e();
                                                u8Var.A = true;
                                                u8Var.b = true;
                                                u8Var.c = false;
                                                int i16 = org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.u8.e(e10)];
                                                org.telegram.ui.ActionBar.e6 e6Var = u8Var.z;
                                                u8Var.d = org.telegram.ui.ActionBar.k6.w0(i16, e6Var);
                                                u8Var.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.u8.e(e10)], e6Var);
                                                u8Var.n = 0;
                                                u8Var.m = false;
                                                org.telegram.ui.Components.u8.a("", "", "", u8Var.q);
                                                u8Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                this.N1.h.setImageDrawable(u8Var);
                                                this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.bd.M0(2131749309, null), this.N1.c, new au(this, i11)), org.telegram.messenger.bd.M0(2131749308, null));
                                                this.N1.setOnCloseListener(new cu(this, 23));
                                            } else {
                                                if (this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.t0.a != null) {
                                                    for (String str : org.telegram.messenger.hp.s1(this.currentAccount).T3) {
                                                        org.telegram.messenger.t0.a.getClass();
                                                    }
                                                }
                                                z15 = false;
                                            }
                                        }
                                    }
                                    z14 = false;
                                    if (!z14) {
                                    }
                                }
                            }
                        } else if (!y9.A) {
                            y9.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y9.a).sendRequest(tL_getStarsSubscriptions, new ci.x7(y9, z15 ? 1 : 0));
                        }
                    }
                    j10 = 0;
                    int i152 = 17;
                    if (this.X2 != 0) {
                    }
                    if (this.X2 != 0) {
                    }
                    if (!((org.telegram.messenger.hp.s1(this.currentAccount).D3() && this.X2 == 0 && this.Z2 == j10) ? org.telegram.messenger.hp.s1(this.currentAccount).T3.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                }
            }
            z15 = true;
        }
        pv pvVar3 = this.G3;
        qe.a aVar = this.b;
        if ((pvVar3 != null && pvVar3.c()) || aVar.f) {
            z15 = false;
        }
        this.K1.i(this.N1, z15, true);
        B3(true);
        if (this.fragmentView == null || this.K1 == null) {
            z10 = false;
        } else {
            boolean z19 = !isInPreviewMode() && this.X2 == 0 && this.Z2 == 0 && this.S0 == 0 && !getMessagesController().U1().b.isEmpty() && ((pvVar2 = this.G3) == null || !pvVar2.c()) && !aVar.f;
            if (z19) {
                if (this.O1 == null) {
                    org.telegram.ui.Cells.ma maVar = new org.telegram.ui.Cells.ma(getParentActivity());
                    this.O1 = maVar;
                    this.K1.addView(maVar);
                }
                org.telegram.ui.Cells.ma maVar2 = this.O1;
                int i17 = this.currentAccount;
                TextView textView = maVar2.b;
                TextView textView2 = maVar2.c;
                ArrayList arrayList4 = org.telegram.messenger.hp.s1(i17).U1().b;
                org.telegram.ui.Cells.la laVar = maVar2.d;
                laVar.setText(org.telegram.messenger.bd.M0(2131743920, null));
                laVar.a(false, false);
                org.telegram.ui.Cells.la laVar2 = maVar2.e;
                laVar2.setText(org.telegram.messenger.bd.M0(2131743910, null));
                laVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z10 = false;
                    } else {
                        textView.setText(org.telegram.messenger.bd.M0(2131743901, null));
                        String str2 = ((org.telegram.messenger.d10) arrayList4.get(0)).f;
                        int i18 = 1;
                        while (true) {
                            if (i18 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str2, ((org.telegram.messenger.d10) arrayList4.get(i18)).f)) {
                                str2 = null;
                                break;
                            }
                            i18++;
                        }
                        if (str2 == null) {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.bd.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.bd.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str2));
                        }
                    }
                    z12 = z10;
                } else {
                    org.telegram.messenger.d10 d10Var = (org.telegram.messenger.d10) arrayList4.get(0);
                    boolean z20 = d10Var.a;
                    String str3 = d10Var.f;
                    boolean z21 = true;
                    textView.setText(org.telegram.messenger.bd.M0(z20 ? 2131743900 : 2131743901, null));
                    String str4 = "" + d10Var.e;
                    if (!TextUtils.isEmpty(str3) && !str4.isEmpty()) {
                        str4 = str4.concat(", ");
                    }
                    String q10 = t4.c.q(str4, str3);
                    if (d10Var.a) {
                        textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131743902, "@" + org.telegram.messenger.m5.t(d10Var.c), q10));
                    } else {
                        textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131743903, q10));
                        z21 = false;
                    }
                    z12 = z21;
                    z10 = false;
                }
                laVar.setOnClickListener(new org.telegram.ui.Cells.ka(this, z12, i17, arrayList4));
                laVar2.setOnClickListener(new ai.h3(maVar2, i17, arrayList4, 4));
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.ma maVar3 = this.O1;
            if (maVar3 != null) {
                this.K1.i(maVar3, z19, true);
            }
        }
        if (this.fragmentView == null || this.K1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.X2 == 0 && this.Z2 == 0 && this.S0 == 0) {
            org.telegram.messenger.q9 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().e7;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ?? arrayList5 = new ArrayList();
                    ?? r5 = giftAuctionsController.b;
                    int size = r5.size();
                    for (?? r9 = z10; r9 < size; r9++) {
                        org.telegram.messenger.n9 n9Var = (org.telegram.messenger.n9) r5.valueAt(r9);
                        org.telegram.messenger.m9 m9Var2 = n9Var.b;
                        if (m9Var2 != null && !m9Var2.f() && (tL_starGiftAuctionState = (m9Var = n9Var.b).f) != null && (i3 = m9Var.e.bid_date) > 0) {
                            arrayList5.add(Long.valueOf(tL_starGiftAuctionState.version | (i3 << 32)));
                        }
                    }
                    Collections.sort(arrayList5);
                    int size2 = arrayList5.size();
                    long j18 = 0;
                    for (?? r62 = z10; r62 < size2; r62++) {
                        Long l10 = (Long) arrayList5.get(r62);
                        j18 = org.telegram.messenger.li.p(org.telegram.messenger.li.p(j18, l10.longValue() & 4294967295L), l10.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j18;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new c3.b(1), new org.telegram.messenger.d(giftAuctionsController, 2));
                }
            }
            if (!giftAuctionsController.c.isEmpty() && (((pvVar = this.G3) == null || !pvVar.c()) && !aVar.f)) {
                z11 = true;
                if (z11 && this.M1 == null) {
                    org.telegram.ui.Cells.m mVar2 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                    this.M1 = mVar2;
                    this.K1.addView(mVar2);
                }
                mVar = this.M1;
                if (mVar == null) {
                    this.K1.i(mVar, z11, true);
                    return;
                }
                return;
            }
        }
        z11 = z10;
        if (z11) {
            org.telegram.ui.Cells.m mVar22 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
            this.M1 = mVar22;
            this.K1.addView(mVar22);
        }
        mVar = this.M1;
        if (mVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.m4 getBackButtonState() {
        return (q4() || this.G3.f) ? org.telegram.ui.ActionBar.m4.a : org.telegram.ui.ActionBar.m4.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i3 = 1;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.a4 = ofFloat;
            return ofFloat;
        }
        int i10 = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? org.telegram.messenger.hs.g2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.a4 = ofFloat2;
        ofFloat2.addUpdateListener(new hu(this, i3));
        this.a4.setInterpolator(org.telegram.ui.Components.xq.g);
        this.a4.setDuration(i10);
        this.a4.start();
        return this.a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.q0 q0Var = this.n0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.t8));
        }
        if (this.X2 == 0) {
            cw cwVar = this.D0;
            if (cwVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(cwVar.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.k6.s1}, (org.telegram.ui.ActionBar.s6) null, !this.X ? org.telegram.ui.ActionBar.k6.A8 : org.telegram.ui.ActionBar.k6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        } else {
            cw cwVar2 = this.D0;
            if (cwVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(cwVar2.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.k6.s1}, (org.telegram.ui.ActionBar.s6) null, !this.X ? org.telegram.ui.ActionBar.k6.P8 : org.telegram.ui.ActionBar.k6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x8));
        NumberTextView numberTextView = this.i1;
        int i3 = org.telegram.ui.ActionBar.k6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        if (this.A0 != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar == null || !kVar.v()) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Components.bz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.zy.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.zy.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Components.bz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ui));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.zy.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ti));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.zy.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.si));
            }
        }
        arrayList.addAll(b8.qf.a(new h6(7, this), org.telegram.ui.ActionBar.k6.w8, i3));
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 2) {
                cw cwVar3 = this.D0;
                if (cwVar3 == null) {
                    i10++;
                } else {
                    view = cwVar3.b0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
                        int i11 = org.telegram.ui.Cells.x3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o6));
                    }
                    i10++;
                }
            } else {
                tw[] twVarArr = this.f0;
                if (twVarArr == null) {
                    i10++;
                } else {
                    view = i10 < twVarArr.length ? twVarArr[i10].a : null;
                    view2 = view;
                    if (view2 == null) {
                    }
                    i10++;
                }
            }
        }
        if (this.f0 != null) {
            int i12 = 0;
            while (true) {
                tw[] twVarArr2 = this.f0;
                if (i12 >= twVarArr2.length) {
                    break;
                }
                if (this.X2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(twVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(twVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                }
                int i13 = org.telegram.messenger.az.a;
                int i14 = org.telegram.ui.ActionBar.k6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f0[i12].a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f0[i12].a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f0[i12].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
                this.f0[i12].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                i12++;
            }
        }
        int i15 = 0;
        while (true) {
            UndoView[] undoViewArr = this.z0;
            if (i15 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(undoViewArr[i15], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.tj));
            i15++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.xj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ij));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Lj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vh));
        kg.n0 n0Var = this.c0;
        if (n0Var != null) {
            arrayList.addAll(n0Var.getThemeDescriptions());
            this.c0.updateColors();
        }
        ww wwVar = this.i0;
        if (wwVar != null) {
            wwVar.updateColors();
            this.i0.invalidate();
        }
        cw cwVar4 = this.D0;
        if (cwVar4 != null) {
            org.telegram.ui.Components.vl0 vl0Var = cwVar4.c0;
            SparseArray sparseArray = cwVar4.h;
            ci.j1 j1Var = cwVar4.b0;
            for (int i16 = 0; i16 < j1Var.getChildCount(); i16++) {
                View childAt = j1Var.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.f6) || (childAt instanceof org.telegram.ui.Cells.t2) || (childAt instanceof org.telegram.ui.Cells.m4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                }
            }
            for (int i17 = 0; i17 < cwVar4.getChildCount(); i17++) {
                if (cwVar4.getChildAt(i17) instanceof wz) {
                    arrayList.addAll(((wz) cwVar4.getChildAt(i17)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view3 = (View) sparseArray.valueAt(i18);
                if (view3 instanceof wz) {
                    arrayList.addAll(((wz) view3).getThemeDescriptions());
                }
            }
            wz wzVar = cwVar4.P0;
            if (wzVar != null) {
                arrayList.addAll(wzVar.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(vl0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6(vl0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
            arrayList.addAll(b8.qf.a(new org.telegram.ui.Components.q6(cwVar4, 4), org.telegram.ui.ActionBar.k6.y8));
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        int i19 = 5;
        if (b3Var != null) {
            arrayList.addAll(b8.qf.a(new org.telegram.ui.Components.q6(new xg(b3Var, 19), i19), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6));
        }
        org.telegram.ui.Cells.ma maVar = this.O1;
        if (maVar != null) {
            arrayList.addAll(b8.qf.a(new org.telegram.ui.Components.q6(new xg(maVar, 20), i19), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7));
        }
        org.telegram.ui.Cells.m mVar = this.M1;
        if (mVar != null) {
            arrayList.addAll(b8.qf.a(new org.telegram.ui.Components.q6(new xg(mVar, 21), i19), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7));
        }
        return arrayList;
    }

    public final float h4() {
        pv pvVar = this.G3;
        if (pvVar == null || !pvVar.c()) {
            return 0.0f;
        }
        return this.G3.e;
    }

    public final void h5() {
        ci.j1 j1Var;
        pw pwVar;
        try {
            gv gvVar = this.C1;
            if (gvVar != null && gvVar.getEditField() != null) {
                this.C1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ke));
            }
            NumberTextView numberTextView = this.i1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            }
            jw jwVar = this.A0;
            int i3 = 0;
            if (jwVar != null && (jwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                ((GradientDrawable) this.A0.getSelectorDrawable()).setColor(getThemedColor(kVar != null && kVar.v() ? org.telegram.ui.ActionBar.k6.ui : org.telegram.ui.ActionBar.k6.K8));
                this.A0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.X2 != 0 || this.Z2 != 0) {
                    kVar2.I(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.R8), true);
                }
                if (this.actionBar.v()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                }
                n5();
            }
            if (this.f0 != null) {
                while (true) {
                    tw[] twVarArr = this.f0;
                    if (i3 >= twVarArr.length) {
                        break;
                    }
                    tw twVar = twVarArr[i3];
                    if (twVar != null && (pwVar = twVar.a) != null) {
                        pwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    }
                    i3++;
                }
            }
            cw cwVar = this.D0;
            if (cwVar != null && (j1Var = cwVar.b0) != null) {
                j1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            mi.x1 x1Var = this.D1;
            if (x1Var != null) {
                x1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            gi.l3 l3Var = this.q0;
            if (l3Var != null) {
                l3Var.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            }
            gi.l3 l3Var2 = this.r0;
            if (l3Var2 != null) {
                l3Var2.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final float i4() {
        return -org.telegram.messenger.g0.W1(this.b.e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    public final void i5(boolean z10, boolean z11) {
        ?? r5;
        int L0;
        org.telegram.messenger.mo moVar;
        Object[] objArr;
        boolean z12;
        boolean z13;
        if (this.A0 == null || this.inPreviewMode || this.r3) {
            return;
        }
        pv pvVar = this.G3;
        if (pvVar == null || !pvVar.c()) {
            org.telegram.ui.Components.f60 f60Var = this.M0;
            String str = null;
            if (f60Var != null) {
                f60Var.u();
                this.M0 = null;
            }
            ArrayList T0 = getMessagesController().T0();
            int size = T0.size();
            qe.a aVar = this.r;
            boolean z14 = true;
            boolean z15 = false;
            if (size <= 1) {
                r5 = 0;
                if (this.A0.getVisibility() != 8) {
                    this.A0.setIsEditing(false);
                    U4(false);
                    this.o3 = false;
                    if (this.n3) {
                        this.n3 = false;
                        this.f0[0].setTranslationX(0.0f);
                        this.f0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.f0[0].h != this.A0.getDefaultTabId()) {
                        this.f0[0].h = this.A0.getDefaultTabId();
                        dv dvVar = this.f0[0].d;
                        dvVar.h = 0;
                        dvVar.f();
                        tw twVar = this.f0[0];
                        twVar.s = this.S0;
                        twVar.d.f();
                    }
                    this.f0[1].setVisibility(8);
                    tw twVar2 = this.f0[1];
                    twVar2.h = 0;
                    dv dvVar2 = twVar2.d;
                    dvVar2.h = 0;
                    dvVar2.f();
                    tw twVar3 = this.f0[1];
                    twVar3.s = this.S0;
                    twVar3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.R3 != null) ? false : z11;
                        if (!this.r3) {
                            aVar.a(false, z16);
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        tw[] twVarArr = this.f0;
                        if (i3 >= twVarArr.length) {
                            break;
                        }
                        tw twVar4 = twVarArr[i3];
                        if (twVar4.s == 0 && twVar4.w == 2 && l4() && ((L0 = this.f0[i3].c.L0()) == 0 || L0 == 1)) {
                            this.f0[i3].c.h1(1, (int) this.O);
                        }
                        this.f0[i3].a.setScrollingTouchSlop(0);
                        this.f0[i3].a.requestLayout();
                        this.f0[i3].requestLayout();
                        i3++;
                    }
                    this.A0.M = -1;
                    r5 = 0;
                }
            } else if (z10 || this.A0.getVisibility() != 0) {
                boolean z17 = this.A0.getVisibility() != 0 ? false : z11;
                this.x = true;
                boolean isEmpty = this.A0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z18 = (this.isPaused || this.R3 != null) ? false : z11;
                    if (!this.r3) {
                        aVar.a(this.x, z18);
                    }
                }
                int currentTabId = this.A0.getCurrentTabId();
                int currentTabStableId = this.A0.getCurrentTabStableId();
                if (currentTabId == this.A0.getDefaultTabId() || currentTabId < T0.size()) {
                    objArr = false;
                } else {
                    this.A0.M = -1;
                    objArr = true;
                }
                jw jwVar = this.A0;
                jwVar.h.clear();
                jwVar.k0.clear();
                jwVar.m0.clear();
                jwVar.n0.clear();
                jwVar.o0.clear();
                jwVar.p0.clear();
                jwVar.N = 0;
                int size2 = T0.size();
                int i10 = 0;
                while (i10 < size2) {
                    if (((org.telegram.messenger.mo) T0.get(i10)).e()) {
                        this.A0.a(i10, 0, org.telegram.messenger.bd.M0(2131750808, str), null, false, true, ((org.telegram.messenger.mo) T0.get(i10)).p);
                        z13 = z15;
                    } else {
                        org.telegram.messenger.mo moVar2 = (org.telegram.messenger.mo) T0.get(i10);
                        z13 = z15;
                        this.A0.a(i10, moVar2.o, moVar2.b, moVar2.c, moVar2.n, false, ((org.telegram.messenger.mo) T0.get(i10)).p);
                    }
                    i10++;
                    z15 = z13;
                    str = null;
                }
                boolean z19 = z15;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.A0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            jw jwVar2 = this.A0;
                            if (jwVar2.h(jwVar2.l0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = z19 ? 1 : 0;
                        }
                    }
                    if (this.A0.l0.get(this.f0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                        this.f0[z19 ? 1 : 0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i11 = z19 ? 1 : 0;
                while (true) {
                    tw[] twVarArr2 = this.f0;
                    if (i11 >= twVarArr2.length) {
                        break;
                    }
                    if (twVarArr2[i11].h >= T0.size()) {
                        this.f0[i11].h = T0.size() - 1;
                    }
                    this.f0[i11].a.setScrollingTouchSlop(1);
                    i11++;
                }
                jw jwVar3 = this.A0;
                jwVar3.G.setItemAnimator(z17 ? jwVar3.t0 : null);
                jwVar3.J.f();
                if (isEmpty) {
                    d5(z19);
                }
                jw jwVar4 = this.A0;
                int currentTabId2 = jwVar4.getCurrentTabId();
                ArrayList arrayList = jwVar4.h;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.yy) arrayList.get(i12)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.yy) arrayList.get(i12)).f;
                            break;
                        }
                        i12++;
                    }
                }
                if (z12) {
                    jw jwVar5 = this.A0;
                    ArrayList arrayList2 = jwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r5 = 0;
                        jwVar5.f((org.telegram.ui.Components.yy) arrayList2.get(0), 0);
                    }
                }
                r5 = 0;
            } else {
                r5 = 0;
            }
            f5(r5);
            int i13 = this.f0[r5].s;
            if ((i13 == 7 || i13 == 8) && (moVar = getMessagesController().N[i13 - 7]) != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= T0.size()) {
                        z14 = false;
                        break;
                    }
                    org.telegram.messenger.mo moVar3 = (org.telegram.messenger.mo) T0.get(i14);
                    if (moVar3 != null && moVar3.a == moVar.a) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (z14) {
                    return;
                }
                d5(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        pv pvVar;
        return (this.k2 || (pvVar = this.G3) == null || pvVar.getFragment() == null) ? i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) > 0.699999988079071d : this.G3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final ei.z6 j4() {
        return getMessagesController().P1();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j5(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        cw cwVar;
        boolean z13;
        org.telegram.ui.Components.m61 m61Var;
        if (!this.r3 || this.m2 || (cwVar = this.D0) == null) {
            return;
        }
        ArrayList<kg.l0> currentSearchFilters = cwVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i3 = 0; i3 < currentSearchFilters.size(); i3++) {
            if (currentSearchFilters.get(i3).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i3).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i3).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i3).d == 7) {
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
                this.c0.D1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.c0.D1(null, null, false);
                }
                if (!z12) {
                    this.c0.getAdapter().f();
                }
                m61Var = this.b0;
                if (m61Var != null) {
                    m61Var.b(z13, true);
                }
                this.c0.setEnabled(z13);
                this.s.a(z13, true);
            }
        }
        z13 = false;
        if (!z13) {
        }
        if (!z12) {
        }
        m61Var = this.b0;
        if (m61Var != null) {
        }
        this.c0.setEnabled(z13);
        this.s.a(z13, true);
    }

    @Override // org.telegram.ui.de0
    public final si.f k() {
        return this.l4;
    }

    public final UndoView k4() {
        Z3();
        UndoView[] undoViewArr = this.z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            mw mwVar = (mw) this.fragmentView;
            mwVar.removeView(undoViewArr[0]);
            mwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f10 = (((-this.g4) - this.j4) - this.v1) - this.w1;
        org.telegram.ui.Components.l00 l00Var = this.u0;
        if (l00Var != null) {
            l00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.l00 l00Var2 = this.v0;
        if (l00Var2 != null) {
            l00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            gi.l3 l3Var = this.q0;
            if (l3Var != null) {
                l3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (this.m2 || this.S0 != 0 || this.Z2 != 0 || this.X2 != 0) {
            return false;
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        messagesController.getClass();
        return org.telegram.messenger.az.q1 && messagesController.R.f(2305843009213693952L | ((long) 1)) != null;
    }

    public final void l5(boolean z10) {
        boolean z11 = this.m2;
        boolean z12 = (!z11 || this.S0 == 10) && this.X2 == 0 && this.Z2 == 0 && !this.inPreviewMode && (!this.k2 || z11) && !this.U3;
        org.telegram.ui.Components.l00 l00Var = this.u0;
        if (l00Var != null) {
            l00Var.e(z12, z10);
        }
        org.telegram.ui.Components.l00 l00Var2 = this.v0;
        if (l00Var2 != null) {
            l00Var2.e(z12, z10);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.E2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void m5(boolean z10, boolean z11) {
        boolean z12;
        if (this.o0 != null) {
            org.telegram.ui.ActionBar.q0 q0Var = this.n0;
            if (q0Var == null || q0Var.getVisibility() != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= getDownloadController().H.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().T(((org.telegram.messenger.zi) getDownloadController().H.get(i3)).S0())) {
                            z12 = true;
                            break;
                        }
                        i3++;
                    }
                }
                if (getDownloadController().J.size() > 0 || z12 || (this.h0.getVisibility() == 0 && this.h0.getAlpha() == 1.0f && !z11)) {
                    this.j0 = true;
                } else {
                    this.j0 = false;
                }
                J3();
                boolean z13 = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i10 = this.e2;
                boolean z14 = i10 == 3 || i10 == 5;
                this.p0.setSubtext(org.telegram.messenger.bd.M0(z13 ? z14 ? 2131748616 : 2131748615 : 2131748614, null));
                this.o0.b(z13, z14, z10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n4(boolean z10) {
        boolean z11;
        this.actionBar.u();
        this.J2.clear();
        org.telegram.ui.ActionBar.w1 w1Var = this.f1;
        int i3 = 1;
        if (w1Var != null) {
            w1Var.c(true, 0.0f);
        }
        jw jwVar = this.A0;
        if (jwVar != null) {
            jwVar.b(org.telegram.ui.ActionBar.k6.K8, org.telegram.ui.ActionBar.k6.I8, org.telegram.ui.ActionBar.k6.J8, org.telegram.ui.ActionBar.k6.L8, org.telegram.ui.ActionBar.k6.d6);
        }
        ValueAnimator valueAnimator = this.w3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w3 = null;
        }
        if (this.v3 == 0.0f) {
            return;
        }
        O4(-f4());
        int i10 = 0;
        int i11 = 0;
        while (true) {
            tw[] twVarArr = this.f0;
            if (i11 >= twVarArr.length) {
                break;
            }
            tw twVar = twVarArr[i11];
            if (twVar != null) {
                twVar.a.I0(true);
            }
            i11++;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.L ? 81 : 0) + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v3, 0.0f);
        this.w3 = ofFloat;
        ofFloat.addUpdateListener(new eu(this, max, i3));
        this.w3.addListener(new xv(this, max, i10));
        this.w3.setInterpolator(org.telegram.ui.Components.xq.f);
        this.w3.setDuration(200L);
        this.w3.start();
        this.Z0 = false;
        ArrayList arrayList = this.b1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) arrayList.get(i12);
                ez.z0(moVar, moVar.g, moVar.b, moVar.c, moVar.n, moVar.m, moVar.h, moVar.i, moVar.j, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                i10 = 0;
                i3 = 1;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.a1) {
            getMessagesController().m4(this.X2, 0L, null);
            z11 = 0;
            this.a1 = false;
        } else {
            z11 = 0;
        }
        f5(true);
        if (this.f0 != null) {
            int i13 = z11;
            while (true) {
                tw[] twVarArr2 = this.f0;
                if (i13 >= twVarArr2.length) {
                    break;
                }
                twVarArr2[i13].d.I = z11;
                i13++;
            }
        }
        int i14 = org.telegram.messenger.hp.C8;
        int i15 = z11;
        if (z10) {
            i15 = TLObject.FLAG_13;
        }
        u5(i15 | 196608, true);
    }

    public final void n5() {
        if (!this.t3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.X2 == 0 && this.Z2 == 0) ? org.telegram.ui.ActionBar.k6.v8 : org.telegram.ui.ActionBar.k6.O8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.y8;
        kVar.D(i0.a.f(this.y1, themedColor, getThemedColor(i3)), false);
        this.actionBar.D(i0.a.f(this.y1, getThemedColor(i3), getThemedColor(i3)), true);
        this.actionBar.C(i0.a.f(this.y1, getThemedColor((this.X2 == 0 && this.Z2 == 0) ? org.telegram.ui.ActionBar.k6.t8 : org.telegram.ui.ActionBar.k6.N8), getThemedColor(org.telegram.ui.ActionBar.k6.z8)), false);
    }

    public final void o4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (z10 && this.c2) {
            return;
        }
        this.U3 = z10;
        l5(true);
        if (z10) {
            gi.l3 l3Var = this.q0;
            if (l3Var != null) {
                l3Var.f(true);
            }
            gi.l3 l3Var2 = this.r0;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.ro0 ro0Var;
        gv gvVar = this.C1;
        ArrayList arrayList = this.J2;
        if (gvVar == null) {
            if (this.S0 == 10) {
                o4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        p5();
        if (arrayList.isEmpty()) {
            String M0 = org.telegram.messenger.bd.M0((this.S0 == 3 && this.g2 == null) ? 2131750576 : 2131745679, null);
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(M0);
            } else {
                this.actionBar.K(M0, true, 350L, org.telegram.ui.Components.xq.h);
            }
            if (this.C1.getTag() != null) {
                this.C1.k0(false, false, false);
                this.C1.L();
                this.C1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.C1.getTag() == null) {
                if (!m4() && this.F2 == null) {
                    this.C1.setFieldText("");
                }
                this.C1.setTag(1);
                if (!this.W3 && (ro0Var = this.H2) != null) {
                    this.W3 = true;
                    String M02 = org.telegram.messenger.bd.M0(2131745439, null);
                    ro0Var.j();
                    ro0Var.G = M02;
                    gi.i1 i1Var = ro0Var.a[0];
                    if (M02 != null) {
                        ((org.telegram.ui.ActionBar.k5) i1Var.f).l(M02, false);
                    }
                    org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0(ro0Var, 28);
                    ro0Var.H = jb0Var;
                    org.telegram.messenger.g0.i3(jb0Var, 1000L);
                }
            }
            this.D1.e(Math.max(1, arrayList.size()), true);
            int i3 = this.T0 + (!TextUtils.isEmpty(this.C1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i10 = 0;
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                long N1 = getMessagesController().N1(longValue);
                if (N1 <= 0 && longValue > 0) {
                    N1 = org.telegram.messenger.m5.k(getMessagesController().J2(longValue));
                }
                j10 += N1;
            }
            this.D1.i(i3, j10, true);
            this.C1.S1();
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(org.telegram.messenger.bd.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                this.actionBar.K(org.telegram.messenger.bd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.xq.h);
            }
        }
        this.Q3 = arrayList.isEmpty();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.G3.c() || !this.G3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.f60 f60Var = this.M0;
            if (f60Var == null) {
                jw jwVar = this.A0;
                if (jwVar == null || !jwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.v()) {
                        if (!this.b.f) {
                            jw jwVar2 = this.A0;
                            if (jwVar2 != null && jwVar2.getVisibility() == 0 && !this.i3) {
                                jw jwVar3 = this.A0;
                                if (!jwVar3.P && !this.n3) {
                                    ArrayList arrayList = jwVar3.h;
                                    if (!arrayList.isEmpty() && jwVar3.M != ((org.telegram.ui.Components.yy) arrayList.get(0)).a) {
                                        if (z10) {
                                            jw jwVar4 = this.A0;
                                            ArrayList arrayList2 = jwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                jwVar4.f((org.telegram.ui.Components.yy) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            gv gvVar = this.C1;
                            if (gvVar == null || !gvVar.r0()) {
                                mv mvVar = this.F0;
                                if (mvVar.P != 0 || mvVar.T.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                mvVar.h.y0(0);
                                return false;
                            }
                            if (z10) {
                                this.C1.j0(true);
                            }
                        } else if (z10) {
                            this.Y.r.getText().clear();
                            this.Z.b(false);
                            this.Y.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        cw cwVar = this.D0;
                        if (cwVar != null && cwVar.getVisibility() == 0) {
                            this.D0.R(false);
                        }
                        n4(true);
                        return false;
                    }
                } else if (z10) {
                    jwVar.setIsEditing(false);
                    U4(false);
                    return false;
                }
            } else if (z10) {
                f60Var.u();
                this.M0 = null;
                return false;
            }
        } else if (z10) {
            this.G3.a();
            cw cwVar2 = this.D0;
            if (cwVar2 != null) {
                cwVar2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.Components.voip.r0 r0Var;
        jw jwVar;
        if (this.W1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.l(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                cw cwVar = this.D0;
                if (cwVar != null) {
                    cwVar.e0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
            }
            this.W1 = false;
        }
        if (!this.L && (jwVar = this.A0) != null && jwVar.getVisibility() == 0 && this.r.f) {
            int i3 = (int) (-this.O);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i3 != 0 && i3 != currentActionBarHeight && i3 >= currentActionBarHeight / 2) {
                this.f0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (r0Var = this.L0) != null && r0Var.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.s0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        gi.l3 l3Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            boolean z10 = e12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.S0, this.X2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.hp.e1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                e12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.s0 && !this.t0 && (l3Var = this.q0) != null && this.O3) {
            this.t0 = true;
            this.s0 = false;
            l3Var.w();
        }
        org.telegram.messenger.g0.i3(new au(this, 20), 200L);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.f60 f60Var = this.M0;
        if (f60Var != null) {
            f60Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.s1 s1Var;
        super.onDialogDismiss(dialog);
        if (this.X2 == 0 && this.Z2 == 0 && (s1Var = this.U1) != null && dialog == s1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.m2 = bundle.getBoolean("onlySelect", false);
            this.n2 = this.arguments.getBoolean("canSelectTopics", false);
            this.r2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.S0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("forward_into_channel", 0L);
            this.g2 = this.arguments.getString("selectAlertString");
            this.h2 = this.arguments.getString("selectAlertStringGroup");
            this.i2 = this.arguments.getString("addToGroupAlertString");
            this.s2 = this.arguments.getBoolean("allowSwitchAccount");
            this.t2 = this.arguments.getBoolean("checkCanWrite", true);
            this.u2 = this.arguments.getBoolean("afterSignup", false);
            this.X2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Z2 = j10;
            if (j10 != 0) {
                this.a3 = getMessagesController().M0(Long.valueOf(this.Z2));
                this.b3 = getMessagesController().N0(this.Z2);
            }
            this.j2 = this.arguments.getBoolean("resetDelegate", true);
            this.T0 = this.arguments.getInt("messagesCount", 0);
            this.U0 = this.arguments.getInt("hasPoll", 0);
            this.V0 = this.arguments.getBoolean("hasInvoice", false);
            this.v2 = this.arguments.getBoolean("showSetPasswordConfirm", this.v2);
            this.arguments.getInt("otherwiseRelogin");
            this.w2 = this.arguments.getBoolean("allowGroups", true);
            this.x2 = this.arguments.getBoolean("allowMegagroups", true);
            this.y2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.z2 = this.arguments.getBoolean("allowChannels", true);
            this.A2 = this.arguments.getBoolean("allowUsers", true);
            this.B2 = this.arguments.getBoolean("allowBots", true);
            this.C2 = this.arguments.getBoolean("closeFragment", true);
            this.G = this.arguments.getBoolean("allowGlobalSearch", true);
            this.X = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.H = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.I = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.S0 == 0) {
            this.V1 = org.telegram.messenger.hp.f1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.az.u();
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.K3 = new za.p(notificationCenter, this);
        if (this.o2 == null) {
            this.e2 = getConnectionsManager().getConnectionState();
            this.K3.d(org.telegram.messenger.hs.i4);
            if (!this.m2) {
                this.K3.d(org.telegram.messenger.hs.I4);
                this.K3.d(org.telegram.messenger.hs.A4);
                this.K3.b(org.telegram.messenger.hs.P2);
                this.K3.b(org.telegram.messenger.hs.d2);
            }
            za.p pVar = this.K3;
            pVar.b(org.telegram.messenger.hs.s);
            pVar.b(org.telegram.messenger.hs.O2);
            pVar.b(org.telegram.messenger.hs.r);
            pVar.b(org.telegram.messenger.hs.Y);
            pVar.b(org.telegram.messenger.hs.O);
            pVar.b(org.telegram.messenger.hs.I2);
            pVar.b(org.telegram.messenger.hs.h0);
            pVar.b(org.telegram.messenger.hs.f0);
            pVar.b(org.telegram.messenger.hs.J);
            pVar.b(org.telegram.messenger.hs.K);
            pVar.b(org.telegram.messenger.hs.M);
            pVar.b(org.telegram.messenger.hs.P0);
            pVar.b(org.telegram.messenger.hs.s0);
            pVar.b(org.telegram.messenger.hs.q5);
            pVar.b(org.telegram.messenger.hs.S0);
            pVar.b(org.telegram.messenger.hs.T1);
            pVar.b(org.telegram.messenger.hs.b5);
            pVar.b(org.telegram.messenger.hs.K2);
            pVar.b(org.telegram.messenger.hs.d0);
            pVar.b(org.telegram.messenger.hs.s1);
            pVar.b(org.telegram.messenger.hs.Y4);
            pVar.b(org.telegram.messenger.hs.Z4);
            pVar.b(org.telegram.messenger.hs.N);
            pVar.b(org.telegram.messenger.hs.m5);
            pVar.b(org.telegram.messenger.hs.f5);
            this.K3.d(org.telegram.messenger.hs.n0);
        }
        za.p pVar2 = this.K3;
        pVar2.b(org.telegram.messenger.hs.w);
        pVar2.b(org.telegram.messenger.hs.S4);
        pVar2.b(org.telegram.messenger.hs.a5);
        pVar2.b(org.telegram.messenger.hs.T);
        pVar2.b(org.telegram.messenger.hs.L4);
        pVar2.b(org.telegram.messenger.hs.t5);
        pVar2.b(org.telegram.messenger.hs.v5);
        pVar2.b(org.telegram.messenger.hs.Z2);
        pVar2.b(org.telegram.messenger.hs.d3);
        pVar2.b(org.telegram.messenger.hs.g5);
        pVar2.b(org.telegram.messenger.hs.y3);
        pVar2.b(org.telegram.messenger.hs.A3);
        pVar2.b(org.telegram.messenger.hs.S5);
        pVar2.b(org.telegram.messenger.hs.T5);
        pVar2.b(org.telegram.messenger.hs.P3);
        pVar2.b(org.telegram.messenger.hs.Q3);
        if (this.S0 == 0) {
            this.K3.b(org.telegram.messenger.hs.z5);
            this.K3.b(org.telegram.messenger.hs.P1);
        }
        u4(getAccountInstance());
        ei.z6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.s) {
                ConnectionsManager.getInstance(P1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ei.x5(P1, r3));
            }
        }
        getMessagesController().b3(this.X2);
        if (this.R3 != null && !getMessagesStorage().R) {
            kt ktVar = this.R3;
            if (ktVar.getParent() != null) {
                ((ViewGroup) ktVar.getParent()).removeView(ktVar);
            }
            this.R3 = null;
        }
        if (q4()) {
            ei.z6 P12 = getMessagesController().P1();
            if (P12.z) {
                P12.T(true);
            }
        } else {
            getMessagesController().P1().W();
        }
        getContactsController().B();
        if (getMessagesController().o6) {
            org.telegram.messenger.nv G1 = getMessagesController().G1();
            if (!G1.e) {
                G1.g(true);
            }
        }
        if (this.Z2 != 0) {
            getMessagesController().V2(0, this.Z2, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = a10.b;
            boolean z10 = j11 == 0;
            if (!z10) {
                long j12 = currentTimeMillis - j11;
                boolean z11 = org.telegram.messenger.r2.a;
                z10 = j12 > ((long) 43200000);
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z10 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
            }
            if (z10) {
                a10.e = true;
                ConnectionsManager.getInstance(a10.a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, r3));
            }
        }
        this.i4 = this.X ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.j4 = this.X ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        za.p pVar = this.K3;
        if (pVar != null) {
            pVar.a();
            this.K3 = null;
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.A0();
        }
        org.telegram.ui.Components.ro0 ro0Var = this.H2;
        if (ro0Var != null) {
            ro0Var.j();
        }
        org.telegram.ui.Components.p11 p11Var = this.I2;
        if (p11Var != null) {
            org.telegram.messenger.g0.r(p11Var);
            this.I2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.q3.e();
        this.D2 = null;
        int i3 = org.telegram.ui.Components.a10.j1;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPanTranslationUpdate(float f10) {
        if (this.f0 == null) {
            return;
        }
        this.K0 = f10;
        gv gvVar = this.C1;
        int i3 = 0;
        if (gvVar == null || !gvVar.r0()) {
            while (true) {
                tw[] twVarArr = this.f0;
                if (i3 >= twVarArr.length) {
                    break;
                }
                twVarArr[i3].setTranslationY(f10);
                i3++;
            }
            if (!this.m2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.ac acVar = this.p3;
                if (acVar != null) {
                    acVar.l();
                }
            }
            cw cwVar = this.D0;
            if (cwVar != null) {
                cwVar.setTranslationY(this.K0 + this.J0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            tw[] twVarArr2 = this.f0;
            if (i3 >= twVarArr2.length) {
                break;
            }
            twVarArr2[i3].setTranslationY(0.0f);
            i3++;
        }
        if (!this.m2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.ac acVar2 = this.p3;
            if (acVar2 != null) {
                acVar2.l();
            }
        }
        cw cwVar2 = this.D0;
        if (cwVar2 != null) {
            cwVar2.setTranslationY(this.J0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ac acVar = this.T;
        if (acVar != null) {
            acVar.b();
            this.T = null;
        }
        pv pvVar = this.G3;
        if (pvVar != null) {
            pvVar.r = true;
            wv wvVar = pvVar.a;
            if (wvVar != null) {
                wvVar.onPause();
            }
        }
        org.telegram.ui.Components.f60 f60Var = this.M0;
        if (f60Var != null) {
            f60Var.u();
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.C0();
        }
        int i3 = 0;
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f0 == null) {
            return;
        }
        while (true) {
            tw[] twVarArr = this.f0;
            if (i3 >= twVarArr.length) {
                return;
            }
            twVarArr[i3].d.getClass();
            i3++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i3 != 1) {
            if (i3 == 4) {
                for (int i10 : iArr) {
                    if (i10 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (b9Var = FilesMigrationService.e) == null) {
                    return;
                }
                b9Var.I0();
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (iArr.length > i11) {
                String str = strArr[i11];
                str.getClass();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.us.t(this.currentAccount).Y();
                            break;
                        } else {
                            zg0.I0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.zb.D().i(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.g0.h3(new au(this, 19));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.hp.f1().edit();
                            this.V1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.B0) {
            this.B0 = false;
            V4();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        tw twVar;
        dv dvVar;
        org.telegram.ui.Components.bm0 bm0Var;
        org.telegram.ui.Components.voip.r0 r0Var;
        super.onResume();
        mv mvVar = this.F0;
        if (mvVar != null) {
            ArrayList arrayList = mvVar.y;
            ei.z6 z6Var = mvVar.s;
            z6Var.l(z6Var.g);
            z6Var.l(z6Var.h);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TL_stories.PeerStories y9 = z6Var.y(((ei.o) arrayList.get(i3)).c);
                if (y9 != null) {
                    z6Var.a0(y9);
                }
            }
        }
        pv pvVar = this.G3;
        if (pvVar != null) {
            pvVar.r = false;
            wv wvVar = pvVar.a;
            if (wvVar != null) {
                wvVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (r0Var = this.L0) != null && r0Var.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i10 = 0;
            while (true) {
                tw[] twVarArr = this.f0;
                if (i10 >= twVarArr.length) {
                    break;
                }
                twVarArr[i10].d.f();
                i10++;
            }
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.D0();
        }
        int i11 = 4;
        long j10 = 0;
        if (!this.m2 && this.X2 == 0 && this.Z2 == 0) {
            getMediaDataController().B(4);
        }
        cw cwVar = this.D0;
        if (cwVar != null && (bm0Var = cwVar.e0) != null) {
            bm0Var.f();
        }
        boolean z10 = this.u2 || getUserConfig().a0 == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.X2 == 0 && this.Z2 == 0 && this.d2 && !this.m2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.d2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i12 <= 28 || org.telegram.messenger.r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                org.telegram.messenger.j4 j4Var = new org.telegram.messenger.j4(this, z13, z11, z12, parentActivity);
                if (this.u2 && (z11 || z13)) {
                    j10 = 4000;
                }
                org.telegram.messenger.g0.i3(j4Var, j10);
            }
        } else if (!this.m2 && this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.sr.i() && !org.telegram.messenger.sr.g()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.hp.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                int i13 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(i13), null);
                alertDialog$Builder.n(i13, getResourceProvider());
                String M0 = org.telegram.messenger.bd.M0(2131747306, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.U = M0;
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new du(this, 10));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), new org.telegram.ui.Components.lf0(22));
                showDialog(s1Var);
            }
        } else if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.hp.f1().getBoolean("askedAboutFSILockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                int i14 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(i14), null);
                alertDialog$Builder2.n(i14, getResourceProvider());
                String M02 = org.telegram.messenger.bd.M0(2131747322, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.U = M02;
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747308, null), new du(this, 11));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131751772, null), new org.telegram.ui.Components.lf0(23));
                showDialog(s1Var2);
            }
        }
        V4();
        if (this.f0 != null) {
            int i15 = 0;
            while (true) {
                tw[] twVarArr2 = this.f0;
                if (i15 >= twVarArr2.length) {
                    break;
                }
                tw twVar2 = twVarArr2[i15];
                if (twVar2.s == 0 && twVar2.w == 2 && twVar2.c.L0() == 0 && l4()) {
                    this.f0[i15].c.h1(1, (int) this.O);
                }
                if (i15 == 0) {
                    this.f0[i15].d.getClass();
                } else {
                    this.f0[i15].d.getClass();
                }
                i15++;
            }
        }
        X4();
        setBulletinDelegate(new x8(this, i11));
        if (this.r3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.A0 == null || (twVar = this.f0[0]) == null || (dvVar = twVar.d) == null) {
            return;
        }
        int i16 = dvVar.h;
        if (i16 == 7 || i16 == 8) {
            org.telegram.messenger.mo moVar = getMessagesController().N[i16 != 7 ? (char) 1 : (char) 0];
            if (moVar != null) {
                this.A0.h(moVar.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.az.o() <= 0) {
            boolean z11 = org.telegram.messenger.r2.a;
        } else if (this.Z3 && this.a4 == null) {
            R4(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.g1.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.voip.r0 r0Var;
        uw uwVar;
        pv pvVar = this.G3;
        if (pvVar == null || !pvVar.c()) {
            if (z10 && (r0Var = this.L0) != null && r0Var.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z10 && this.u2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).y0.c(false);
                }
            }
        } else {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (uwVar = this.Y2) != null) {
            uwVar.removeSelfFromStack();
        }
        N3();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        pv pvVar = this.G3;
        if (pvVar == null || !pvVar.c()) {
            org.telegram.ui.Components.voip.r0 r0Var = this.L0;
            if (r0Var != null && r0Var.getVisibility() == 0) {
                if (z10) {
                    this.L0.setAlpha(1.0f - f10);
                } else {
                    this.L0.setAlpha(f10);
                }
            }
        } else {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f10);
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.ro0 ro0Var = this.H2;
        if (ro0Var == null) {
            return;
        }
        int i3 = this.currentAccount;
        ro0Var.h(i3);
        ro0Var.d = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i3).a).e();
        ArrayList arrayList = ro0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.J2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        gi.i1 i1Var = ro0Var.a[0];
        if (ro0Var.b == 1) {
            ((org.telegram.ui.ActionBar.k5) i1Var.e).l(ro0Var.c(i1Var), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            N4(true);
        } else {
            this.a4 = null;
            this.Z3 = false;
            N4(false);
            R4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        boolean presentFragment = super.presentFragment(d2Var);
        if (presentFragment && this.f0 != null) {
            int i3 = 0;
            while (true) {
                tw[] twVarArr = this.f0;
                if (i3 >= twVarArr.length) {
                    break;
                }
                twVarArr[i3].d.getClass();
                i3++;
            }
        }
        gi.l3 l3Var = this.q0;
        if (l3Var != null) {
            l3Var.f(true);
        }
        gi.l3 l3Var2 = this.r0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        org.telegram.ui.Components.ac.e();
        return presentFragment;
    }

    public final boolean q4() {
        return this.X2 == 1;
    }

    public final void q5(boolean z10) {
        boolean z11;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z12 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z11 = false;
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
            if (ziVar.F0() != null && ziVar.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().I;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj2;
            if (ziVar2.F0() != null && ziVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().D3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean r4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        if (!org.telegram.messenger.l10.u(a22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.hp.s1(this.currentAccount).q7.l(-a22.id);
        return (l10 == null || l10.isEmpty()) && org.telegram.messenger.hp.s1(this.currentAccount).q7.e(-a22.id);
    }

    public final void r5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.e5 e5Var;
        mv mvVar = this.F0;
        org.telegram.ui.Components.e5 e5Var2 = null;
        if (mvVar != null && (e5Var = mvVar.b0) != null && mvVar.r0 != null) {
            Long h = org.telegram.messenger.l10.h(user);
            if (h != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                e5Var.j(h.longValue(), z10);
                e5Var.m(z11, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.hp.s1(mvVar.f);
                    if (org.telegram.messenger.hp.B2(user)) {
                        if (mvVar.O0 == null) {
                            mvVar.O0 = mvVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            mvVar.O0 = new ei.i(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), mvVar.O0);
                        }
                        Drawable drawable = mvVar.O0;
                        int i3 = org.telegram.ui.ActionBar.k6.ni;
                        uw uwVar = mvVar.f0;
                        org.telegram.ui.ActionBar.r6.y(mvVar, drawable, i3, uwVar != null ? uwVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        e5Var.g(mvVar.O0, z10);
                        e5Var.m(false, z10);
                    }
                }
                e5Var.g(null, z10);
                e5Var.m(false, z10);
            }
            e5Var.k(Integer.valueOf(mvVar.f(org.telegram.ui.ActionBar.k6.ni)));
            mvVar.a0.invalidate();
        }
        if (this.E3 == null || this.actionBar == null) {
            return;
        }
        Long h7 = org.telegram.messenger.l10.h(user);
        this.C3 = null;
        if (h7 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.E3.j(h7.longValue(), z10);
            this.E3.m(z12, z10);
            if (z12) {
                this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new cu(this, 1));
            g11.t(this.currentAccount);
        } else {
            if (user != null) {
                org.telegram.messenger.hp.s1(this.currentAccount);
                if (org.telegram.messenger.hp.B2(user)) {
                    if (this.L3 == null) {
                        this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.L3 = new aw(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.L3);
                    }
                    Drawable drawable2 = this.L3;
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.ni);
                    this.x4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.E3.g(this.L3, z10);
                    this.E3.m(false, z10);
                    this.actionBar.setRightDrawableOnClick(new cu(this, 2));
                    g11.t(this.currentAccount);
                }
            }
            this.E3.g(null, z10);
            this.E3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        }
        org.telegram.ui.Components.e5 e5Var3 = this.E3;
        int i10 = org.telegram.ui.ActionBar.k6.ni;
        e5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.F3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        rv rvVar = this.N0;
        if (rvVar == null || !(rvVar.getContentView() instanceof g11)) {
            return;
        }
        org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
        g11 g11Var = (g11) this.N0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.e5 e5Var4 = this.E3;
            if (rightDrawable == e5Var4) {
                e5Var2 = e5Var4;
            }
        }
        g11Var.y(e5Var2, titleTextView);
    }

    public final boolean s3(long j10, View view) {
        if (this.m2 && getMessagesController().t2(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.J2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.f6) {
            ((org.telegram.ui.Cells.f6) view).w(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i3 = this.f0[0].s;
        org.telegram.messenger.mo moVar = null;
        if ((i3 == 7 || i3 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) {
            moVar = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return moVar != null ? moVar.j.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void s5() {
        gi.l3 l3Var;
        boolean W4 = getMessagesController().W4();
        if (this.O3 != W4) {
            k5();
            if (!this.O3 && W4 && (l3Var = this.q0) != null) {
                l3Var.w();
            }
            this.O3 = W4;
        }
        org.telegram.ui.Components.l00 l00Var = this.u0;
        if (l00Var == null) {
            return;
        }
        if (this.S0 == 10) {
            l00Var.setImageResource(R.drawable.floating_check);
            this.u0.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
        } else {
            l00Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.u0.setContentDescription(org.telegram.messenger.bd.M0(2131748278, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        mv mvVar = this.F0;
        if (mvVar != null) {
            if (!this.H0 || z10) {
                mvVar.setVisibility(8);
            } else {
                mvVar.setVisibility(0);
            }
        }
        l5(true);
        g5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i3, Runnable runnable) {
        rv rvVar;
        org.telegram.ui.Components.e5 e5Var;
        super.setTitleOverlayText(str, i3, runnable);
        if (this.actionBar != null && (rvVar = this.N0) != null && (rvVar.getContentView() instanceof g11)) {
            org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
            g11 g11Var = (g11) this.N0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                e5Var = this.E3;
            }
            e5Var = null;
            g11Var.y(e5Var, titleTextView);
        }
        mv mvVar = this.F0;
        if (mvVar != null) {
            org.telegram.ui.Components.h6 h6Var = mvVar.U;
            mvVar.V.c(i3 == 2131751805 ? org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131744123, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            if (str != null) {
                mvVar.h0 = true;
                if (mvVar.i0 != i3) {
                    mvVar.i0 = i3;
                    h6Var.c(org.telegram.messenger.bd.M0(i3, str), !org.telegram.messenger.bd.a0, true);
                }
            } else {
                mvVar.h0 = false;
                mvVar.i0 = 0;
                h6Var.c(mvVar.g0, !org.telegram.messenger.bd.a0, true);
            }
            mvVar.a.a(mvVar.h0, true);
            mvVar.M0.z(h6Var);
        }
    }

    public final void t3(kg.l0 l0Var) {
        cw cwVar;
        if (!this.r3 || (cwVar = this.D0) == null) {
            return;
        }
        ArrayList arrayList = cwVar.D0;
        if (!arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (l0Var.b((kg.l0) arrayList.get(i3))) {
                    return;
                }
            }
        }
        arrayList.add(l0Var);
        iw iwVar = this.Y;
        iwVar.G.add(l0Var);
        iwVar.J = r1.size() - 1;
        iwVar.e();
        this.Y.r.getText().clear();
        j5(true, null, null, false, true);
    }

    public final boolean t4() {
        return this.D2 == null && this.o2 == null;
    }

    public final void t5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        ei.z6 j42;
        ArrayList arrayList;
        if (this.F0 == null || this.J != null) {
            return;
        }
        pv pvVar = this.G3;
        if ((pvVar != null && pvVar.c()) || this.r3 || (kVar = this.actionBar) == null || kVar.v() || this.m2) {
            return;
        }
        gi.va vaVar = gi.va.G2;
        int i3 = 0;
        if ((vaVar != null && vaVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().L0)) {
            z10 = false;
        }
        int i10 = 1;
        boolean z12 = !q4() && j4().I();
        if (this.Z2 != 0) {
            z11 = false;
        } else if (q4()) {
            z11 = !j4().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (j42 = j4()).g) != null && arrayList.size() > 0) || j42.J());
            z12 = j4().I();
        }
        this.M = z12;
        boolean z13 = this.H0;
        boolean z14 = z12 || z11;
        this.H0 = z14;
        if (z11 || z14) {
            this.F0.p(z10, z14 != z13);
        }
        boolean z15 = this.H0;
        int i11 = 2;
        int i12 = 8;
        if (z15 != z13) {
            if (z10) {
                ValueAnimator valueAnimator = this.K;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.H0 && !isInPreviewMode()) {
                    this.F0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, this.H0 ? 1.0f : 0.0f);
                this.K = ofFloat;
                ofFloat.addUpdateListener(new ei(i10, this));
                this.K.addListener(new org.telegram.ui.Cells.w9(this, 25));
                this.K.setDuration(200L);
                this.K.setInterpolator(org.telegram.ui.Components.xq.f);
                this.K.start();
            } else {
                this.F0.setVisibility((!z15 || isInPreviewMode()) ? 8 : 0);
                this.I0 = this.H0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z11 == this.N) {
            return;
        }
        this.N = z11;
        if (z11) {
            this.F0.l(false, 1.0f);
        }
        if (z10 && !isInPreviewMode()) {
            this.F0.setVisibility(0);
            float f10 = -this.O;
            float f42 = z11 ? 0.0f : f4();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat2;
            ofFloat2.addUpdateListener(new bw(this, f10, z11, f42));
            this.J.addListener(new vv(this, z11, i11));
            this.J.setDuration(200L);
            this.J.setInterpolator(org.telegram.ui.Components.xq.f);
            this.J.start();
            return;
        }
        this.L = z11;
        mv mvVar = this.F0;
        if ((z11 || this.M) && !isInPreviewMode()) {
            i12 = 0;
        }
        mvVar.setVisibility(i12);
        if (z11) {
            this.z3 = -org.telegram.messenger.g0.L(81.0f);
            O4(-f4());
        } else {
            O4(0.0f);
        }
        while (true) {
            tw[] twVarArr = this.f0;
            if (i3 >= twVarArr.length) {
                break;
            }
            tw twVar = twVarArr[i3];
            if (twVar != null) {
                twVar.a.requestLayout();
            }
            i3++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    public final void u3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 33 && zg0.J0(parentActivity)) {
            if (z10) {
                showDialog(new zg0(parentActivity, !b8.nf.a(), new ou(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().V && this.V1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.v(parentActivity, new gu(this, 1)).a;
                this.U1 = s1Var;
                showDialog(s1Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i3 <= 28 || org.telegram.messenger.r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!arrayList.isEmpty()) {
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        } else if (this.B0) {
            this.B0 = false;
            V4();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u5(int i3, boolean z10) {
        RecyclerView recyclerView;
        int i10;
        int childCount;
        int i11;
        int i12 = 131072;
        if (this.T1) {
            int i13 = org.telegram.messenger.hp.C8;
            if ((i3 & 131072) == 0) {
                return;
            }
        }
        if (this.isPaused) {
            return;
        }
        int i14 = 0;
        while (i14 < 3) {
            if (i14 == 2) {
                cw cwVar = this.D0;
                recyclerView = cwVar != null ? cwVar.b0 : null;
            } else {
                tw[] twVarArr = this.f0;
                if (twVarArr != null) {
                    pw pwVar = i14 < twVarArr.length ? twVarArr[i14].a : null;
                    if (pwVar == null || twVarArr[i14].getVisibility() == 0) {
                        r6 = pwVar != null ? this.f0[i14] : null;
                        recyclerView = pwVar;
                    }
                }
                i10 = i14;
                i14 = i10 + 1;
                i12 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i15 = org.telegram.messenger.hp.C8;
                if (((i3 & 2048) != 0 || i3 == 0) && r6 != null) {
                    r6.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount2) {
                        View childAt = recyclerView.getChildAt(i16);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.t2;
                        ArrayList arrayList = this.J2;
                        if (z11 && (this.D0 == null || recyclerView.getAdapter() != this.D0.e0)) {
                            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                            int i17 = org.telegram.messenger.hp.C8;
                            if ((i3 & i12) != 0) {
                                t2Var.a0(this.actionBar.v(), true);
                                if (this.T1) {
                                    i10 = i14;
                                    i16++;
                                    i14 = i10;
                                    i12 = 131072;
                                }
                            }
                            if ((65536 & i3) != 0) {
                                t2Var.c0(false, (i3 & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i3 & 512) == 0) {
                                    i10 = i14;
                                    if (t2Var.i0(i3, z10)) {
                                        r6.q(false);
                                        break;
                                    }
                                } else if (this.f0[i14].p() && org.telegram.messenger.g0.Q1()) {
                                    i10 = i14;
                                    t2Var.setDialogSelected(t2Var.getDialogId() == this.q2.a);
                                } else {
                                    i10 = i14;
                                }
                                if (arrayList != null) {
                                    t2Var.c0(arrayList.contains(Long.valueOf(t2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                                    ((org.telegram.ui.Cells.pa) childAt).i(i3);
                                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                                    f6Var.y(i3);
                                    if (arrayList != null) {
                                        f6Var.w(arrayList.contains(Long.valueOf(f6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.T1 && (childAt instanceof org.telegram.ui.Components.tj0)) {
                                    org.telegram.ui.Components.tj0 tj0Var = (org.telegram.ui.Components.tj0) childAt;
                                    childCount = tj0Var.getChildCount();
                                    for (i11 = 0; i11 < childCount; i11++) {
                                        View childAt2 = tj0Var.getChildAt(i11);
                                        if (childAt2 instanceof org.telegram.ui.Cells.o4) {
                                            ((org.telegram.ui.Cells.o4) childAt2).b(i3);
                                        }
                                    }
                                }
                                i16++;
                                i14 = i10;
                                i12 = 131072;
                            }
                        }
                        i10 = i14;
                        if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                        }
                        if (!this.T1) {
                            org.telegram.ui.Components.tj0 tj0Var2 = (org.telegram.ui.Components.tj0) childAt;
                            childCount = tj0Var2.getChildCount();
                            while (i11 < childCount) {
                            }
                        }
                        i16++;
                        i14 = i10;
                        i12 = 131072;
                    }
                }
            }
            i10 = i14;
            i14 = i10 + 1;
            i12 = 131072;
        }
    }

    @Override // org.telegram.ui.de0
    public final void v() {
        J4(true, true);
    }

    public final void v3(CharSequence charSequence) {
        if (this.C1 == null) {
            return;
        }
        if (this.E2 == null && this.F2 == null && this.G2 == null) {
            return;
        }
        int i3 = 0;
        if (this.H2 == null) {
            org.telegram.ui.Components.ro0 ro0Var = new org.telegram.ui.Components.ro0(getParentActivity(), getResourceProvider());
            this.H2 = ro0Var;
            ro0Var.setLayoutClickListener(new cu(this, i3));
            this.H2.setOnModeChangeListener(new du(this, i3));
            gv gvVar = this.C1;
            org.telegram.ui.Components.ro0 ro0Var2 = this.H2;
            if (ro0Var2 == null) {
                gvVar.getClass();
            } else {
                gvVar.H1 = ro0Var2;
                gvVar.addView(ro0Var2, 0, b8.mf.e(-1, 48, 51));
                gvVar.h3 = false;
                gvVar.I();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H2.getLayoutParams();
            layoutParams.rightMargin = -this.C1.getPaddingRight();
            this.H2.setLayoutParams(layoutParams);
        }
        if (m4()) {
            this.H2.i(this.currentAccount, this.E2);
        } else {
            String str = this.F2;
            if (str != null) {
                org.telegram.ui.Components.ro0 ro0Var3 = this.H2;
                ro0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    ro0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.G2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.ro0 ro0Var4 = this.H2;
                    ro0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        ro0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.C1.setFieldText(charSequence);
        }
        this.C1.setOverrideHint(org.telegram.messenger.bd.M0(m4() ? 2131754454 : 2131745472, null));
        H3();
        if (this.H2.getMode() != 0) {
            this.C1.x1(false, false);
        }
        p5();
    }

    public final void v4(long j10) {
        long j11 = j10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j11);
        int i3 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                v4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i10 = this.f0[0].s;
        org.telegram.messenger.mo moVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) {
            moVar = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
        }
        int i11 = -1;
        if (moVar != null) {
            int i12 = moVar.g;
            int i13 = org.telegram.messenger.hp.C8;
            if ((i12 & 64) != 0 && !moVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.S1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.S1.size()) {
                            break;
                        }
                        if (((TLRPC.Dialog) this.S1.get(i14)).id == j11) {
                            i11 = i14;
                            break;
                        }
                        i14++;
                    }
                    if (i11 < 0) {
                        M4(false, false);
                    }
                }
            }
        }
        int i15 = i11;
        if (getMessagesController().t2(j11) || getMessagesController().z2(j11)) {
            org.telegram.messenger.hp messagesController = getMessagesController();
            org.telegram.messenger.qr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.hl hlVar = new org.telegram.messenger.hl(messagesController, j11);
            org.telegram.messenger.p5 p5Var = messagesStorage.a;
            org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j11, hlVar, 5);
            j11 = j11;
            p5Var.c(a4Var);
        }
        getMessagesController().o3(j11, 0L);
        org.telegram.messenger.hp messagesController2 = getMessagesController();
        int i16 = dialog.top_message;
        messagesController2.j3(j11, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i15 >= 0) {
            this.S1.remove(i15);
            this.f0[0].y.D();
            this.f0[0].q(true);
        }
    }

    public final boolean v5(long j10) {
        TLRPC.Chat M0;
        gv gvVar;
        if ((this.T0 <= 1 && ((gvVar = this.C1) == null || gvVar.getVisibility() != 0 || TextUtils.isEmpty(this.C1.getFieldText()))) || !org.telegram.messenger.m5.z(j10) || (M0 = getMessagesController().M0(Long.valueOf(-j10))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745312, null), null);
        return false;
    }

    public final int w3() {
        if (this.C1 != null) {
            return (int) (this.z1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        }
        if (this.Z2 == 0) {
            return this.g4 + this.i4;
        }
        return org.telegram.messenger.g0.L(72.0f) + this.g4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.t3.K(r6, false) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean V = org.telegram.messenger.t3.V(chat);
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.H.bot_participant) == null || !bool2.booleanValue() || getMessagesController().x2(chat, user) || org.telegram.messenger.t3.b(chat)))) {
                Boolean bool3 = this.H.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.H.forum;
                if ((bool4 == null || bool4.booleanValue() == org.telegram.messenger.t3.c0(chat)) && ((this.H.user_admin_rights == null || getMessagesController().u3(chat, getUserConfig().f(), this.H.user_admin_rights)) && (this.H.bot_admin_rights == null || getMessagesController().u3(chat, user, this.H.bot_admin_rights) || org.telegram.messenger.t3.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x3() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.J2;
            if (i3 >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-((Long) arrayList.get(i3)).longValue()));
            if (M0 != null && !org.telegram.messenger.t3.l(M0)) {
                return false;
            }
            i3++;
        }
    }

    public final boolean x4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user == null || org.telegram.messenger.l10.z(user) || org.telegram.messenger.l10.x(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final void y3() {
        int themedColor;
        org.telegram.ui.Components.bf0 bf0Var;
        cv cvVar;
        org.telegram.ui.Components.bm0 bm0Var;
        u51 u51Var;
        cw cwVar = this.D0;
        if (cwVar != null && (bm0Var = cwVar.e0) != null && (u51Var = bm0Var.l0) != null) {
            int childCount = u51Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = u51Var.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.u8 u8Var = o4Var.c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f)) {
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(o4Var.f));
                        o4Var.e = a22;
                        u8Var.r(a22);
                    } else {
                        u8Var.q(org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-o4Var.f)));
                        o4Var.e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i11 = 0;
            while (true) {
                tw[] twVarArr = this.f0;
                if (i11 >= twVarArr.length) {
                    break;
                }
                tw twVar = twVarArr[i11];
                if (twVar != null && (cvVar = twVar.n) != null) {
                    cvVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.ni);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.x4) {
                this.x4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.e5 e5Var = this.E3;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.k6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.n0;
        if (q0Var != null) {
            q0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.v8));
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.updateColors();
        }
        jw jwVar = this.A0;
        if (jwVar != null) {
            gh.g gVar = jwVar.z0;
            if (gVar != null) {
                gVar.updateColors();
            }
            jwVar.invalidate();
        }
        kg.n0 n0Var = this.c0;
        if (n0Var != null) {
            n0Var.updateColors();
        }
        cw cwVar2 = this.D0;
        if (cwVar2 != null && (bf0Var = cwVar2.s0) != null) {
            bf0Var.c();
        }
        org.telegram.ui.Components.m61 m61Var = this.b0;
        if (m61Var != null) {
            m61Var.updateColors();
        }
        sy0 sy0Var = this.a0;
        if (sy0Var != null) {
            sy0Var.updateColors();
        }
        if (this.L0 != null) {
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.d6), 100);
            if (!(this.L0.getForeground() instanceof ColorDrawable)) {
                this.L0.setForeground(new ColorDrawable(o10));
            } else if (((ColorDrawable) this.L0.getForeground()).getColor() != o10) {
                ((ColorDrawable) this.L0.getForeground()).setColor(o10);
            }
        }
        org.telegram.ui.Components.l00 l00Var = this.u0;
        if (l00Var != null) {
            l00Var.updateColors();
        }
        org.telegram.ui.Components.l00 l00Var2 = this.v0;
        if (l00Var2 != null) {
            l00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        this.n4.a(getThemedColor(i12));
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar != null) {
            prVar.updateColors();
        }
        org.telegram.ui.Components.or orVar = this.L1;
        if (orVar != null) {
            orVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        }
        ev evVar = this.I1;
        if (evVar != null) {
            evVar.updateColors();
        }
        ev evVar2 = this.G1;
        if (evVar2 != null) {
            evVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        mv mvVar = this.F0;
        if (mvVar != null) {
            mvVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ul)) != this.w4) {
            this.w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        iw iwVar = this.Y;
        if (iwVar != null) {
            iwVar.updateColors();
        }
    }

    public final void y4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i3 = 1;
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        boolean z10 = getMessagesStorage().M != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, org.telegram.messenger.az.q1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? org.telegram.messenger.bd.M0(2131748690, null) : null, org.telegram.messenger.bd.M0(org.telegram.messenger.az.q1 ? 2131747254 : 2131749332, null)};
        m4 m4Var = new m4(this, i3);
        h.M = charSequenceArr;
        h.N = iArr;
        h.L = m4Var;
        showDialog(h);
    }

    public final void z3() {
        org.telegram.messenger.g0.i3(new wu(this, 0), 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z4(View view, int i3, u4.h0 h0Var) {
        u4.h0 h0Var2;
        long j10;
        boolean z10;
        int i10;
        int i11;
        int i12;
        org.telegram.messenger.zi ziVar;
        long j11;
        long j12;
        org.telegram.ui.Components.bm0 bm0Var;
        pv pvVar;
        long j13;
        long j14;
        int i13;
        org.telegram.messenger.zi ziVar2;
        long F;
        long j15;
        long j16;
        TLRPC.Chat M0;
        boolean z11;
        cw cwVar;
        int i14;
        Object J;
        long j17;
        long j18;
        int i15;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = h0Var instanceof kg.m;
        if (z12) {
            kg.m mVar = (kg.m) h0Var;
            int i16 = mVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.mo moVar = getMessagesController().N[i16 == 7 ? (char) 0 : (char) 1];
                if (moVar != null) {
                    i14 = moVar.a;
                    J = mVar.J(i3);
                    if (this.D2 == null && mVar.n && h0Var.d(i3) == 21) {
                        this.D2.N(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j18 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i15 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.w(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new uw(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.w(null)) {
                                Y4(j17, view);
                                return;
                            }
                            h0Var2 = h0Var;
                            i10 = i15;
                            z10 = false;
                            i11 = 0;
                            ziVar = null;
                            i12 = i14;
                            j12 = j17;
                            j11 = 0;
                            j10 = 0;
                        } else if (J instanceof TLRPC.TL_recentMeUrlChat) {
                            j18 = ((TLRPC.TL_recentMeUrlChat) J).chat_id;
                        } else if (J instanceof TLRPC.TL_recentMeUrlUser) {
                            j17 = ((TLRPC.TL_recentMeUrlUser) J).user_id;
                        } else {
                            if (!(J instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (J instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) J).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSet.id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.xv0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                            h0Var2 = h0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!org.telegram.messenger.t3.T(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.x60(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j17 = -chat2.id;
                            i15 = 0;
                            i10 = i15;
                            z10 = false;
                            i11 = 0;
                            ziVar = null;
                            i12 = i14;
                            j12 = j17;
                            j11 = 0;
                            j10 = 0;
                        }
                        j17 = -j18;
                    } else {
                        j17 = ((TLRPC.User) J).id;
                    }
                    h0Var2 = h0Var;
                    i15 = 0;
                    i10 = i15;
                    z10 = false;
                    i11 = 0;
                    ziVar = null;
                    i12 = i14;
                    j12 = j17;
                    j11 = 0;
                    j10 = 0;
                }
            }
            i14 = 0;
            J = mVar.J(i3);
            if (this.D2 == null) {
            }
            if (J instanceof TLRPC.User) {
            }
            h0Var2 = h0Var;
            i15 = 0;
            i10 = i15;
            z10 = false;
            i11 = 0;
            ziVar = null;
            i12 = i14;
            j12 = j17;
            j11 = 0;
            j10 = 0;
        } else {
            h0Var2 = h0Var;
            cw cwVar2 = this.D0;
            if (cwVar2 == null || h0Var2 != (bm0Var = cwVar2.e0)) {
                j10 = 0;
                z10 = false;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                ziVar = null;
                j11 = 0;
                j12 = 0;
            } else {
                Object I = bm0Var.I(i3);
                z10 = this.D0.e0.N(i3);
                if (I instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) I;
                    F = user.id;
                    if (!this.m2) {
                        this.X1 = F;
                        this.Y1 = user;
                    }
                } else if (I instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) I;
                    F = -chat3.id;
                    if (!this.m2) {
                        this.X1 = F;
                        this.Y1 = chat3;
                    }
                } else if (I instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                    F = org.telegram.messenger.m5.F(encryptedChat.id);
                    if (!this.m2) {
                        this.X1 = F;
                        this.Y1 = encryptedChat;
                    }
                } else {
                    if (I instanceof org.telegram.messenger.zi) {
                        ziVar2 = (org.telegram.messenger.zi) I;
                        long B0 = org.telegram.messenger.zi.B0(ziVar2.k);
                        int f12 = ziVar2.f1();
                        j10 = 0;
                        j14 = org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-B0))) ? org.telegram.messenger.zi.c2(ziVar2.I1, ziVar2.k, true, false) : 0L;
                        cw cwVar3 = this.D0;
                        if (cwVar3 != null) {
                            org.telegram.ui.Components.bm0 bm0Var2 = cwVar3.e0;
                            bm0Var2.k0.a(bm0Var2.a0);
                        }
                        i13 = f12;
                        j13 = B0;
                    } else {
                        j10 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            cw cwVar4 = this.D0;
                            if (cwVar4 != null && !cwVar4.e0.K.isEmpty()) {
                                this.Y.r.setText(str2);
                                this.Y.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                vg0 vg0Var = new vg0(getParentActivity(), this);
                                vg0Var.N0(str2, true);
                                vg0Var.show();
                            }
                        } else if (I instanceof org.telegram.messenger.d5) {
                            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) I;
                            org.telegram.ui.Components.t4.u(this, d5Var.i, d5Var.j, (String) d5Var.e.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (pvVar = this.G3) != null && (pvVar.getFragment() instanceof m91)) {
                            j13 = -((m91) this.G3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) I).id;
                            i13 = 0;
                            ziVar2 = null;
                        }
                        i13 = 0;
                        ziVar2 = null;
                        j14 = 0;
                        j13 = 0;
                    }
                    if (j13 == j10 && this.actionBar.v()) {
                        if (this.actionBar.w("search_dialogs_action_mode") && i13 == 0 && !z10) {
                            Y4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = j14;
                    i12 = 0;
                    i11 = i13;
                    ziVar = ziVar2;
                    i10 = 0;
                }
                i13 = 0;
                ziVar2 = null;
                j13 = F;
                j14 = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = j14;
                i12 = 0;
                i11 = i13;
                ziVar = ziVar2;
                i10 = 0;
            }
        }
        if (j12 == j10) {
            return;
        }
        if (this.m2) {
            if (v5(j12)) {
                if ((!getMessagesController().t2(j12) && !getMessagesController().p2(j12)) || r4(j12)) {
                    ArrayList arrayList = this.J2;
                    if (!arrayList.isEmpty() || (this.S0 == 3 && this.g2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || A3(j12)) {
                            boolean s32 = s3(j12, view);
                            cw cwVar5 = this.D0;
                            if (cwVar5 != null && h0Var2 == cwVar5.e0) {
                                this.actionBar.l(true);
                                b4(j12, s32);
                            }
                            o5();
                            return;
                        }
                        return;
                    }
                }
                if (this.n2 && getMessagesController().p2(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    uw uwVar = new uw(bundle2);
                    uwVar.Y2 = this;
                    uwVar.D2 = this.D2;
                    presentFragment(uwVar);
                    return;
                }
                if (!this.n2 || ((!getMessagesController().t2(j12) || r4(j12)) && !getMessagesController().z2(j12))) {
                    a4(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.S0 == 1);
                bundle3.putBoolean("quote", this.P0);
                bundle3.putBoolean("reply_to", this.O0);
                m91 m91Var = new m91(bundle3);
                m91Var.M0 = this;
                presentFragment(m91Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (org.telegram.messenger.m5.C(j12)) {
            j15 = j11;
            bundle4.putInt("enc_id", (int) (j12 & 4294967295L));
        } else {
            j15 = j11;
            if (org.telegram.messenger.m5.E(j12)) {
                bundle4.putLong("user_id", j12);
            } else {
                if (i11 == 0 || (M0 = getMessagesController().M0(Long.valueOf(-j12))) == null || M0.migrated_to == null) {
                    j16 = j12;
                } else {
                    bundle4.putLong("migrated_to", j12);
                    j16 = -M0.migrated_to.channel_id;
                }
                bundle4.putLong("chat_id", -j16);
            }
        }
        if (i11 != 0) {
            bundle4.putInt("message_id", i11);
        } else if (z10) {
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                cw cwVar6 = this.D0;
                if (cwVar6 != null) {
                    cwVar6.e0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
            }
        } else {
            V3();
        }
        boolean z13 = (org.telegram.messenger.bd.a0 || this.k2 || (org.telegram.messenger.g0.Q1() && i10 != 0) || !org.telegram.messenger.lc.e(64) || this.Z2 != j10) ? false : true;
        bundle4.putInt("dialog_folder_id", i10);
        bundle4.putInt("dialog_filter_id", i12);
        if (org.telegram.messenger.g0.Q1() && ((!getMessagesController().t2(j12) || !z13) && this.q2.a == j12 && ((cwVar = this.D0) == null || h0Var2 != cwVar.e0))) {
            if (getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                List fragmentStack = launchActivity.t0.getFragmentStack();
                if (fragmentStack.isEmpty()) {
                    return;
                }
                if (fragmentStack.size() == 1 && (t4.c.d(1, fragmentStack) instanceof wm)) {
                    ((wm) t4.c.d(1, fragmentStack)).ua();
                    return;
                }
                if (fragmentStack.size() == 2) {
                    launchActivity.t0.l(true, false);
                    return;
                } else {
                    if (getParentActivity() instanceof LaunchActivity) {
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(0);
                        fragmentStack.clear();
                        fragmentStack.add(d2Var);
                        launchActivity.t0.X(true, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        cw cwVar7 = this.D0;
        if (cwVar7 != null && cwVar7.B0) {
            cwVar7.R(false);
        }
        if (j12 == getUserConfig().e() && getMessagesController().o6) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("dialog_id", org.telegram.messenger.h10.i(this.currentAccount).e());
            bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bundle5.putInt("start_from", 11);
            if (this.E0 == null) {
                this.E0 = new org.telegram.ui.Components.os0(this);
            }
            presentFragment(new org.telegram.ui.Components.r80(bundle5, this.E0));
            return;
        }
        if (this.o2 != null) {
            if (getMessagesController().E(bundle4, this, null, null)) {
                getNotificationCenter().k(org.telegram.messenger.hs.t, new Object[0]);
                wm wmVar = new wm(bundle4);
                p4(wmVar, ziVar);
                presentFragment(wmVar);
                return;
            }
            return;
        }
        this.A3 = true;
        if (getMessagesController().E(bundle4, this, null, null)) {
            TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-j12));
            TLRPC.Dialog S0 = getMessagesController().S0(j12);
            boolean V = org.telegram.messenger.t3.V(M02);
            boolean z14 = S0 != null && S0.view_forum_as_messages;
            int b10 = (this.Z2 == j10 || M02 == null) ? 0 : ji.j0.b(this.currentAccount, -M02.id);
            if (b10 == 3) {
                showDialog(new org.telegram.ui.Components.x60(getParentActivity(), M02, null, this, this.resourceProvider));
                return;
            }
            int i17 = 4;
            if (b10 == 4) {
                org.telegram.messenger.k5.o(null, V ? 2131751930 : 2131751927, org.telegram.ui.Components.fc.a0(this), R.raw.e_hand_2, 36);
                return;
            }
            if (M02 == null || !(((z11 = M02.monoforum) || M02.forum) && j15 == j10)) {
                if (org.telegram.messenger.t3.Y(M02)) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putLong("community_id", M02.id);
                    presentFragment(new uw(bundle6));
                    return;
                }
                wm wmVar2 = new wm(bundle4);
                if (j15 != j10) {
                    rg.c.a(wmVar2, org.telegram.messenger.pr.a(j12, j15));
                }
                if (z12 && org.telegram.messenger.m5.E(j12) && getMessagesController().R.f(j12) == null) {
                    org.telegram.messenger.li mediaDataController = getMediaDataController();
                    TLRPC.Document document = mediaDataController.z0;
                    mediaDataController.n1();
                    if (document != null) {
                        wmVar2.V9 = document;
                        wmVar2.W9 = true;
                    }
                }
                if (org.telegram.messenger.g0.Q1()) {
                    pv pvVar2 = this.G3;
                    if (pvVar2.a != null) {
                        pvVar2.a();
                    }
                }
                p4(wmVar2, ziVar);
                presentFragment(wmVar2);
                return;
            }
            if (z11) {
                bundle4.putInt("chatMode", 8);
                bundle4.putBoolean("isSubscriberSuggestions", !org.telegram.messenger.t3.A(this.currentAccount, M02, 24));
                wm wmVar3 = new wm(bundle4);
                p4(wmVar3, ziVar);
                presentFragment(wmVar3);
                return;
            }
            if (org.telegram.messenger.t3.a(M02)) {
                wm wmVar4 = new wm(bundle4);
                rg.c.a(wmVar4, org.telegram.messenger.pr.a(-M02.id, getMessagesController().e7.getLong(a1.g.p(M02.id, "forumlasttopic"), 1L)));
                presentFragment(wmVar4);
                return;
            }
            if (!org.telegram.messenger.lc.e(64) || this.Z2 != j10) {
                if (!z14) {
                    presentFragment(new m91(bundle4));
                    return;
                }
                wm wmVar5 = new wm(bundle4);
                p4(wmVar5, ziVar);
                presentFragment(wmVar5);
                return;
            }
            if (!z13) {
                if (!z14) {
                    presentFragment(new m91(bundle4));
                    return;
                }
                wm wmVar6 = new wm(bundle4);
                p4(wmVar6, ziVar);
                presentFragment(wmVar6);
                return;
            }
            if (this.k2) {
                return;
            }
            if (z14) {
                wm wmVar7 = new wm(bundle4);
                p4(wmVar7, ziVar);
                presentFragment(wmVar7);
                return;
            }
            pv pvVar3 = this.G3;
            wv wvVar = pvVar3.a;
            if (wvVar == null || (-wvVar.a) != j12) {
                pw pwVar = this.f0[0].a;
                pwVar.w3 = 0.0f;
                pwVar.x3 = pwVar.v3;
                pwVar.y3 = pwVar.p3 != 0.0f;
                wv wvVar2 = new wv(bundle4);
                wvVar2.N0 = this;
                final pv pvVar4 = this.G3;
                org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
                g2.g gVar = pvVar4.n;
                if (!pvVar4.r) {
                    pvVar4.x = parentLayout;
                    wvVar2.onFragmentCreate();
                    wvVar2.setInPreviewMode(true);
                    wvVar2.setParentLayout(parentLayout);
                    View performCreateView = wvVar2.performCreateView(pvVar4.getContext());
                    wvVar2.onResume();
                    pvVar4.b = performCreateView;
                    pvVar4.addView(performCreateView);
                    final wv wvVar3 = pvVar4.a;
                    l0 l0Var = wvVar2.e;
                    pvVar4.c = l0Var;
                    pvVar4.addView(l0Var);
                    pvVar4.a = wvVar2;
                    my0.R = j10;
                    my0.R = -wvVar2.a;
                    if (wvVar2.getActionBar() != null) {
                        org.telegram.ui.ActionBar.k actionBar = wvVar2.getActionBar();
                        pvVar4.d = actionBar;
                        pvVar4.addView(actionBar);
                        pvVar4.d.f1 = new pu0(pvVar4, 9);
                    }
                    if (wvVar3 != null) {
                        final wv wvVar4 = pvVar4.a;
                        if (org.telegram.messenger.az.c()) {
                            q1.g gVar2 = pvVar4.y;
                            if (gVar2 != null) {
                                gVar2.d();
                            }
                            wvVar4.onTransitionAnimationStart(true, false);
                            pvVar4.F = wvVar3;
                            pvVar4.w = true;
                            gVar.d();
                            q1.g gVar3 = new q1.g(new q1.f(0.0f));
                            pvVar4.y = gVar3;
                            gVar3.m = org.telegram.ui.Cells.f1.s(1000.0f, 400.0f, 1.0f);
                            my0.f(wvVar3, wvVar4, 0.0f);
                            pvVar4.y.b(new wa0(pvVar4, i17));
                            pvVar4.y.a(new q1.c() { // from class: org.telegram.ui.ky0
                                @Override // q1.c
                                public final void a(q1.g gVar4, boolean z15, float f10, float f11) {
                                    my0 my0Var = pvVar4;
                                    if (my0Var.y == null) {
                                        return;
                                    }
                                    my0Var.y = null;
                                    org.telegram.ui.ActionBar.d2 d2Var2 = wvVar4;
                                    d2Var2.onTransitionAnimationEnd(true, false);
                                    org.telegram.ui.ActionBar.d2 d2Var3 = wvVar3;
                                    my0.f(d2Var3, d2Var2, 1.0f);
                                    my0Var.w = false;
                                    my0Var.F = null;
                                    d2Var3.onPause();
                                    d2Var3.onFragmentDestroy();
                                    my0Var.removeView(d2Var3.getFragmentView());
                                    my0Var.removeView(d2Var3.getActionBar());
                                    my0Var.n.e();
                                }
                            });
                            pvVar4.y.h();
                        } else {
                            wvVar4.onTransitionAnimationStart(true, false);
                            wvVar4.onTransitionAnimationEnd(true, false);
                            my0.f(wvVar3, wvVar4, 1.0f);
                            pvVar4.w = false;
                            pvVar4.F = null;
                            wvVar3.onPause();
                            wvVar3.onFragmentDestroy();
                            pvVar4.removeView(wvVar3.getFragmentView());
                            pvVar4.removeView(wvVar3.getActionBar());
                            gVar.e();
                        }
                    } else if (!pvVar4.f) {
                        int i18 = 1;
                        pvVar4.f = true;
                        if (org.telegram.messenger.az.c()) {
                            gVar.d();
                            pvVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                            pvVar4.e = 0.0f;
                            pvVar4.e(true);
                            pvVar4.g();
                            wvVar2.onTransitionAnimationStart(true, false);
                            pvVar4.h.addUpdateListener(new jy0(pvVar4, i18));
                            pvVar4.h.addListener(new org.telegram.ui.Components.ri0(12, pvVar4, wvVar2));
                            pvVar4.h.setDuration(250L);
                            pvVar4.h.setInterpolator(org.telegram.ui.Components.xq.f);
                            pvVar4.h.setStartDelay(org.telegram.messenger.az.o() >= 2 ? 50L : 150L);
                            pvVar4.h.start();
                        } else {
                            pvVar4.e(true);
                            wvVar2.onTransitionAnimationStart(true, false);
                            wvVar2.onTransitionAnimationEnd(true, false);
                            pvVar4.e = 1.0f;
                            pvVar4.g();
                            pvVar4.d(false);
                        }
                    }
                    wvVar2.setPreviewDelegate(new ci0(pvVar4, 16));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(pvVar4);
                }
            } else {
                pvVar3.a();
            }
            cw cwVar8 = this.D0;
            if (cwVar8 != null) {
                cwVar8.S();
            }
        }
    }
}
